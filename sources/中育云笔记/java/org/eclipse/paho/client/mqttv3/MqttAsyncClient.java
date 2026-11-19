package org.eclipse.paho.client.mqttv3;

import com.taobao.accs.utl.BaseMonitor;
import java.util.Hashtable;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ScheduledExecutorService;
import org.eclipse.paho.client.mqttv3.internal.ClientComms;
import org.eclipse.paho.client.mqttv3.internal.ConnectActionListener;
import org.eclipse.paho.client.mqttv3.internal.DisconnectedMessageBuffer;
import org.eclipse.paho.client.mqttv3.internal.ExceptionHelper;
import org.eclipse.paho.client.mqttv3.internal.HighResolutionTimer;
import org.eclipse.paho.client.mqttv3.internal.NetworkModule;
import org.eclipse.paho.client.mqttv3.internal.NetworkModuleService;
import org.eclipse.paho.client.mqttv3.internal.SystemHighResolutionTimer;
import org.eclipse.paho.client.mqttv3.internal.wire.MqttDisconnect;
import org.eclipse.paho.client.mqttv3.internal.wire.MqttPublish;
import org.eclipse.paho.client.mqttv3.internal.wire.MqttSubscribe;
import org.eclipse.paho.client.mqttv3.internal.wire.MqttUnsubscribe;
import org.eclipse.paho.client.mqttv3.logging.Logger;
import org.eclipse.paho.client.mqttv3.logging.LoggerFactory;
import org.eclipse.paho.client.mqttv3.persist.MemoryPersistence;
import org.eclipse.paho.client.mqttv3.persist.MqttDefaultFilePersistence;
import org.eclipse.paho.client.mqttv3.util.Debug;

/* loaded from: classes6.dex */
public class MqttAsyncClient implements IMqttAsyncClient {
    private static final String CLASS_NAME = "org.eclipse.paho.client.mqttv3.MqttAsyncClient";
    private static final String CLIENT_ID_PREFIX = "paho";
    private static final long DISCONNECT_TIMEOUT = 10000;
    private static final char MAX_HIGH_SURROGATE = 56319;
    private static final char MIN_HIGH_SURROGATE = 55296;
    private static final long QUIESCE_TIMEOUT = 30000;
    private static final Object clientLock = new Object();
    private static int reconnectDelay = 1000;
    private String clientId;
    protected ClientComms comms;
    private MqttConnectOptions connOpts;
    private ScheduledExecutorService executorService;
    private Logger log;
    private MqttCallback mqttCallback;
    private MqttClientPersistence persistence;
    private Timer reconnectTimer;
    private boolean reconnecting;
    private String serverURI;
    private Hashtable topics;
    private Object userContext;

    public class MqttReconnectActionListener implements IMqttActionListener {
        final String methodName;

        public MqttReconnectActionListener(String str) {
            this.methodName = str;
        }

        private void rescheduleReconnectCycle(int i10) {
            MqttAsyncClient.this.log.fine(MqttAsyncClient.CLASS_NAME, String.valueOf(this.methodName) + ":rescheduleReconnectCycle", "505", new Object[]{MqttAsyncClient.this.clientId, String.valueOf(MqttAsyncClient.reconnectDelay)});
            synchronized (MqttAsyncClient.clientLock) {
                try {
                    if (MqttAsyncClient.this.connOpts.isAutomaticReconnect()) {
                        if (MqttAsyncClient.this.reconnectTimer != null) {
                            MqttAsyncClient.this.reconnectTimer.schedule(new ReconnectTask(MqttAsyncClient.this, null), i10);
                        } else {
                            MqttAsyncClient.reconnectDelay = i10;
                            MqttAsyncClient.this.startReconnectCycle();
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // org.eclipse.paho.client.mqttv3.IMqttActionListener
        public void onFailure(IMqttToken iMqttToken, Throwable th) {
            MqttAsyncClient.this.log.fine(MqttAsyncClient.CLASS_NAME, this.methodName, "502", new Object[]{iMqttToken.getClient().getClientId()});
            if (MqttAsyncClient.reconnectDelay < MqttAsyncClient.this.connOpts.getMaxReconnectDelay()) {
                MqttAsyncClient.reconnectDelay *= 2;
            }
            rescheduleReconnectCycle(MqttAsyncClient.reconnectDelay);
        }

        @Override // org.eclipse.paho.client.mqttv3.IMqttActionListener
        public void onSuccess(IMqttToken iMqttToken) {
            MqttAsyncClient.this.log.fine(MqttAsyncClient.CLASS_NAME, this.methodName, "501", new Object[]{iMqttToken.getClient().getClientId()});
            MqttAsyncClient.this.comms.setRestingState(false);
            MqttAsyncClient.this.stopReconnectCycle();
        }
    }

    public class MqttReconnectCallback implements MqttCallbackExtended {
        final boolean automaticReconnect;

        public MqttReconnectCallback(boolean z10) {
            this.automaticReconnect = z10;
        }

        @Override // org.eclipse.paho.client.mqttv3.MqttCallbackExtended
        public void connectComplete(boolean z10, String str) {
        }

        @Override // org.eclipse.paho.client.mqttv3.MqttCallback
        public void connectionLost(Throwable th) {
            if (this.automaticReconnect) {
                MqttAsyncClient.this.comms.setRestingState(true);
                MqttAsyncClient.this.reconnecting = true;
                MqttAsyncClient.this.startReconnectCycle();
            }
        }

        @Override // org.eclipse.paho.client.mqttv3.MqttCallback
        public void deliveryComplete(IMqttDeliveryToken iMqttDeliveryToken) {
        }

        @Override // org.eclipse.paho.client.mqttv3.MqttCallback
        public void messageArrived(String str, MqttMessage mqttMessage) {
        }
    }

    public class ReconnectTask extends TimerTask {
        private static final String methodName = "ReconnectTask.run";

        private ReconnectTask() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            MqttAsyncClient.this.log.fine(MqttAsyncClient.CLASS_NAME, methodName, "506");
            MqttAsyncClient.this.attemptReconnect();
        }

        public /* synthetic */ ReconnectTask(MqttAsyncClient mqttAsyncClient, ReconnectTask reconnectTask) {
            this();
        }
    }

    public MqttAsyncClient(String str, String str2) {
        this(str, str2, new MqttDefaultFilePersistence());
    }

    public static boolean Character_isHighSurrogate(char c10) {
        return c10 >= 55296 && c10 <= 56319;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void attemptReconnect() {
        this.log.fine(CLASS_NAME, "attemptReconnect", "500", new Object[]{this.clientId});
        try {
            connect(this.connOpts, this.userContext, new MqttReconnectActionListener("attemptReconnect"));
        } catch (MqttSecurityException e10) {
            this.log.fine(CLASS_NAME, "attemptReconnect", "804", null, e10);
        } catch (MqttException e11) {
            this.log.fine(CLASS_NAME, "attemptReconnect", "804", null, e11);
        }
    }

    private NetworkModule createNetworkModule(String str, MqttConnectOptions mqttConnectOptions) {
        this.log.fine(CLASS_NAME, "createNetworkModule", "115", new Object[]{str});
        return NetworkModuleService.createInstance(str, mqttConnectOptions, this.clientId);
    }

    public static String generateClientId() {
        return CLIENT_ID_PREFIX + System.nanoTime();
    }

    private String getHostName(String str) {
        int iIndexOf = str.indexOf(58);
        if (iIndexOf == -1) {
            iIndexOf = str.indexOf(47);
        }
        if (iIndexOf == -1) {
            iIndexOf = str.length();
        }
        return str.substring(0, iIndexOf);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startReconnectCycle() {
        this.log.fine(CLASS_NAME, "startReconnectCycle", "503", new Object[]{this.clientId, Long.valueOf(reconnectDelay)});
        Timer timer = new Timer("MQTT Reconnect: " + this.clientId);
        this.reconnectTimer = timer;
        timer.schedule(new ReconnectTask(this, null), (long) reconnectDelay);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void stopReconnectCycle() {
        this.log.fine(CLASS_NAME, "stopReconnectCycle", "504", new Object[]{this.clientId});
        synchronized (clientLock) {
            try {
                if (this.connOpts.isAutomaticReconnect()) {
                    Timer timer = this.reconnectTimer;
                    if (timer != null) {
                        timer.cancel();
                        this.reconnectTimer = null;
                    }
                    reconnectDelay = 1000;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private IMqttToken subscribeBase(String[] strArr, int[] iArr, Object obj, IMqttActionListener iMqttActionListener) {
        if (this.log.isLoggable(5)) {
            StringBuffer stringBuffer = new StringBuffer();
            for (int i10 = 0; i10 < strArr.length; i10++) {
                if (i10 > 0) {
                    stringBuffer.append(", ");
                }
                stringBuffer.append("topic=");
                stringBuffer.append(strArr[i10]);
                stringBuffer.append(" qos=");
                stringBuffer.append(iArr[i10]);
            }
            this.log.fine(CLASS_NAME, "subscribe", "106", new Object[]{stringBuffer.toString(), obj, iMqttActionListener});
        }
        MqttToken mqttToken = new MqttToken(getClientId());
        mqttToken.setActionCallback(iMqttActionListener);
        mqttToken.setUserContext(obj);
        mqttToken.internalTok.setTopics(strArr);
        this.comms.sendNoWait(new MqttSubscribe(strArr, iArr), mqttToken);
        this.log.fine(CLASS_NAME, "subscribe", "109");
        return mqttToken;
    }

    public IMqttToken checkPing(Object obj, IMqttActionListener iMqttActionListener) {
        Logger logger = this.log;
        String str = CLASS_NAME;
        logger.fine(str, "ping", "117");
        MqttToken mqttTokenCheckForActivity = this.comms.checkForActivity(iMqttActionListener);
        this.log.fine(str, "ping", "118");
        return mqttTokenCheckForActivity;
    }

    @Override // org.eclipse.paho.client.mqttv3.IMqttAsyncClient, java.lang.AutoCloseable
    public void close() {
        close(false);
    }

    @Override // org.eclipse.paho.client.mqttv3.IMqttAsyncClient
    public IMqttToken connect(Object obj, IMqttActionListener iMqttActionListener) {
        return connect(new MqttConnectOptions(), obj, iMqttActionListener);
    }

    public NetworkModule[] createNetworkModules(String str, MqttConnectOptions mqttConnectOptions) {
        this.log.fine(CLASS_NAME, "createNetworkModules", "116", new Object[]{str});
        String[] serverURIs = mqttConnectOptions.getServerURIs();
        if (serverURIs == null || serverURIs.length == 0) {
            serverURIs = new String[]{str};
        }
        NetworkModule[] networkModuleArr = new NetworkModule[serverURIs.length];
        for (int i10 = 0; i10 < serverURIs.length; i10++) {
            networkModuleArr[i10] = createNetworkModule(serverURIs[i10], mqttConnectOptions);
        }
        this.log.fine(CLASS_NAME, "createNetworkModules", "108");
        return networkModuleArr;
    }

    @Override // org.eclipse.paho.client.mqttv3.IMqttAsyncClient
    public void deleteBufferedMessage(int i10) {
        this.comms.deleteBufferedMessage(i10);
    }

    @Override // org.eclipse.paho.client.mqttv3.IMqttAsyncClient
    public IMqttToken disconnect(Object obj, IMqttActionListener iMqttActionListener) {
        return disconnect(30000L, obj, iMqttActionListener);
    }

    @Override // org.eclipse.paho.client.mqttv3.IMqttAsyncClient
    public void disconnectForcibly() {
        disconnectForcibly(30000L, 10000L);
    }

    @Override // org.eclipse.paho.client.mqttv3.IMqttAsyncClient
    public MqttMessage getBufferedMessage(int i10) {
        return this.comms.getBufferedMessage(i10);
    }

    @Override // org.eclipse.paho.client.mqttv3.IMqttAsyncClient
    public int getBufferedMessageCount() {
        return this.comms.getBufferedMessageCount();
    }

    @Override // org.eclipse.paho.client.mqttv3.IMqttAsyncClient
    public String getClientId() {
        return this.clientId;
    }

    public String getCurrentServerURI() {
        return this.comms.getNetworkModules()[this.comms.getNetworkModuleIndex()].getServerURI();
    }

    public Debug getDebug() {
        return new Debug(this.clientId, this.comms);
    }

    @Override // org.eclipse.paho.client.mqttv3.IMqttAsyncClient
    public int getInFlightMessageCount() {
        return this.comms.getActualInFlight();
    }

    @Override // org.eclipse.paho.client.mqttv3.IMqttAsyncClient
    public IMqttDeliveryToken[] getPendingDeliveryTokens() {
        return this.comms.getPendingDeliveryTokens();
    }

    @Override // org.eclipse.paho.client.mqttv3.IMqttAsyncClient
    public String getServerURI() {
        return this.serverURI;
    }

    public MqttTopic getTopic(String str) {
        MqttTopic.validate(str, false);
        MqttTopic mqttTopic = (MqttTopic) this.topics.get(str);
        if (mqttTopic != null) {
            return mqttTopic;
        }
        MqttTopic mqttTopic2 = new MqttTopic(str, this.comms);
        this.topics.put(str, mqttTopic2);
        return mqttTopic2;
    }

    @Override // org.eclipse.paho.client.mqttv3.IMqttAsyncClient
    public boolean isConnected() {
        return this.comms.isConnected();
    }

    @Override // org.eclipse.paho.client.mqttv3.IMqttAsyncClient
    public void messageArrivedComplete(int i10, int i11) {
        this.comms.messageArrivedComplete(i10, i11);
    }

    @Override // org.eclipse.paho.client.mqttv3.IMqttAsyncClient
    public IMqttDeliveryToken publish(String str, byte[] bArr, int i10, boolean z10, Object obj, IMqttActionListener iMqttActionListener) {
        MqttMessage mqttMessage = new MqttMessage(bArr);
        mqttMessage.setQos(i10);
        mqttMessage.setRetained(z10);
        return publish(str, mqttMessage, obj, iMqttActionListener);
    }

    @Override // org.eclipse.paho.client.mqttv3.IMqttAsyncClient
    public void reconnect() throws MqttException {
        this.log.fine(CLASS_NAME, "reconnect", "500", new Object[]{this.clientId});
        if (this.comms.isConnected()) {
            throw ExceptionHelper.createMqttException(32100);
        }
        if (this.comms.isConnecting()) {
            throw new MqttException(32110);
        }
        if (this.comms.isDisconnecting()) {
            throw new MqttException(32102);
        }
        if (this.comms.isClosed()) {
            throw new MqttException(32111);
        }
        stopReconnectCycle();
        attemptReconnect();
    }

    @Override // org.eclipse.paho.client.mqttv3.IMqttAsyncClient
    public boolean removeMessage(IMqttDeliveryToken iMqttDeliveryToken) {
        return this.comms.removeMessage(iMqttDeliveryToken);
    }

    @Override // org.eclipse.paho.client.mqttv3.IMqttAsyncClient
    public void setBufferOpts(DisconnectedBufferOptions disconnectedBufferOptions) {
        this.comms.setDisconnectedMessageBuffer(new DisconnectedMessageBuffer(disconnectedBufferOptions));
    }

    @Override // org.eclipse.paho.client.mqttv3.IMqttAsyncClient
    public void setCallback(MqttCallback mqttCallback) {
        this.mqttCallback = mqttCallback;
        this.comms.setCallback(mqttCallback);
    }

    @Override // org.eclipse.paho.client.mqttv3.IMqttAsyncClient
    public void setManualAcks(boolean z10) {
        this.comms.setManualAcks(z10);
    }

    @Override // org.eclipse.paho.client.mqttv3.IMqttAsyncClient
    public IMqttToken subscribe(String str, int i10, Object obj, IMqttActionListener iMqttActionListener) {
        return subscribe(new String[]{str}, new int[]{i10}, obj, iMqttActionListener);
    }

    @Override // org.eclipse.paho.client.mqttv3.IMqttAsyncClient
    public IMqttToken unsubscribe(String str, Object obj, IMqttActionListener iMqttActionListener) {
        return unsubscribe(new String[]{str}, obj, iMqttActionListener);
    }

    public MqttAsyncClient(String str, String str2, MqttClientPersistence mqttClientPersistence) {
        this(str, str2, mqttClientPersistence, new TimerPingSender());
    }

    public void close(boolean z10) {
        Logger logger = this.log;
        String str = CLASS_NAME;
        logger.fine(str, "close", "113");
        this.comms.close(z10);
        this.log.fine(str, "close", "114");
    }

    @Override // org.eclipse.paho.client.mqttv3.IMqttAsyncClient
    public IMqttToken connect() {
        return connect(null, null);
    }

    @Override // org.eclipse.paho.client.mqttv3.IMqttAsyncClient
    public IMqttToken disconnect() {
        return disconnect(null, null);
    }

    @Override // org.eclipse.paho.client.mqttv3.IMqttAsyncClient
    public void disconnectForcibly(long j10) {
        disconnectForcibly(30000L, j10);
    }

    @Override // org.eclipse.paho.client.mqttv3.IMqttAsyncClient
    public IMqttToken subscribe(String str, int i10) {
        return subscribe(new String[]{str}, new int[]{i10}, (Object) null, (IMqttActionListener) null);
    }

    @Override // org.eclipse.paho.client.mqttv3.IMqttAsyncClient
    public IMqttToken unsubscribe(String str) {
        return unsubscribe(new String[]{str}, (Object) null, (IMqttActionListener) null);
    }

    public MqttAsyncClient(String str, String str2, MqttClientPersistence mqttClientPersistence, MqttPingSender mqttPingSender) {
        this(str, str2, mqttClientPersistence, mqttPingSender, null);
    }

    @Override // org.eclipse.paho.client.mqttv3.IMqttAsyncClient
    public IMqttToken connect(MqttConnectOptions mqttConnectOptions) {
        return connect(mqttConnectOptions, null, null);
    }

    @Override // org.eclipse.paho.client.mqttv3.IMqttAsyncClient
    public IMqttToken disconnect(long j10) {
        return disconnect(j10, null, null);
    }

    @Override // org.eclipse.paho.client.mqttv3.IMqttAsyncClient
    public void disconnectForcibly(long j10, long j11) {
        this.comms.disconnectForcibly(j10, j11);
    }

    @Override // org.eclipse.paho.client.mqttv3.IMqttAsyncClient
    public IMqttToken subscribe(String[] strArr, int[] iArr) {
        return subscribe(strArr, iArr, (Object) null, (IMqttActionListener) null);
    }

    @Override // org.eclipse.paho.client.mqttv3.IMqttAsyncClient
    public IMqttToken unsubscribe(String[] strArr) {
        return unsubscribe(strArr, (Object) null, (IMqttActionListener) null);
    }

    public MqttAsyncClient(String str, String str2, MqttClientPersistence mqttClientPersistence, MqttPingSender mqttPingSender, ScheduledExecutorService scheduledExecutorService) {
        this(str, str2, mqttClientPersistence, mqttPingSender, scheduledExecutorService, null);
    }

    @Override // org.eclipse.paho.client.mqttv3.IMqttAsyncClient
    public IMqttToken connect(MqttConnectOptions mqttConnectOptions, Object obj, IMqttActionListener iMqttActionListener) {
        Object obj2;
        if (!this.comms.isConnected()) {
            if (!this.comms.isConnecting()) {
                if (!this.comms.isDisconnecting()) {
                    if (!this.comms.isClosed()) {
                        if (mqttConnectOptions == null) {
                            mqttConnectOptions = new MqttConnectOptions();
                        }
                        MqttConnectOptions mqttConnectOptions2 = mqttConnectOptions;
                        this.connOpts = mqttConnectOptions2;
                        this.userContext = obj;
                        boolean zIsAutomaticReconnect = mqttConnectOptions2.isAutomaticReconnect();
                        Logger logger = this.log;
                        String str = CLASS_NAME;
                        Boolean boolValueOf = Boolean.valueOf(mqttConnectOptions2.isCleanSession());
                        Integer numValueOf = Integer.valueOf(mqttConnectOptions2.getConnectionTimeout());
                        Integer numValueOf2 = Integer.valueOf(mqttConnectOptions2.getKeepAliveInterval());
                        String userName = mqttConnectOptions2.getUserName();
                        String str2 = "[null]";
                        if (mqttConnectOptions2.getPassword() == null) {
                            obj2 = "[null]";
                        } else {
                            obj2 = "[null]";
                            str2 = "[notnull]";
                        }
                        logger.fine(str, BaseMonitor.ALARM_POINT_CONNECT, "103", new Object[]{boolValueOf, numValueOf, numValueOf2, userName, str2, mqttConnectOptions2.getWillMessage() == null ? obj2 : "[notnull]", obj, iMqttActionListener});
                        this.comms.setNetworkModules(createNetworkModules(this.serverURI, mqttConnectOptions2));
                        this.comms.setReconnectCallback(new MqttReconnectCallback(zIsAutomaticReconnect));
                        MqttToken mqttToken = new MqttToken(getClientId());
                        ConnectActionListener connectActionListener = new ConnectActionListener(this, this.persistence, this.comms, mqttConnectOptions2, mqttToken, obj, iMqttActionListener, this.reconnecting);
                        mqttToken.setActionCallback(connectActionListener);
                        mqttToken.setUserContext(this);
                        MqttCallback mqttCallback = this.mqttCallback;
                        if (mqttCallback instanceof MqttCallbackExtended) {
                            connectActionListener.setMqttCallbackExtended((MqttCallbackExtended) mqttCallback);
                        }
                        this.comms.setNetworkModuleIndex(0);
                        connectActionListener.connect();
                        return mqttToken;
                    }
                    throw new MqttException(32111);
                }
                throw new MqttException(32102);
            }
            throw new MqttException(32110);
        }
        throw ExceptionHelper.createMqttException(32100);
    }

    @Override // org.eclipse.paho.client.mqttv3.IMqttAsyncClient
    public IMqttToken disconnect(long j10, Object obj, IMqttActionListener iMqttActionListener) {
        Logger logger = this.log;
        String str = CLASS_NAME;
        logger.fine(str, "disconnect", "104", new Object[]{Long.valueOf(j10), obj, iMqttActionListener});
        MqttToken mqttToken = new MqttToken(getClientId());
        mqttToken.setActionCallback(iMqttActionListener);
        mqttToken.setUserContext(obj);
        try {
            this.comms.disconnect(new MqttDisconnect(), j10, mqttToken);
            this.log.fine(str, "disconnect", "108");
            return mqttToken;
        } catch (MqttException e10) {
            this.log.fine(CLASS_NAME, "disconnect", "105", null, e10);
            throw e10;
        }
    }

    public void disconnectForcibly(long j10, long j11, boolean z10) {
        this.comms.disconnectForcibly(j10, j11, z10);
    }

    @Override // org.eclipse.paho.client.mqttv3.IMqttAsyncClient
    public IMqttToken subscribe(String[] strArr, int[] iArr, Object obj, IMqttActionListener iMqttActionListener) {
        if (strArr.length == iArr.length) {
            for (String str : strArr) {
                MqttTopic.validate(str, true);
                this.comms.removeMessageListener(str);
            }
            return subscribeBase(strArr, iArr, obj, iMqttActionListener);
        }
        throw new IllegalArgumentException();
    }

    @Override // org.eclipse.paho.client.mqttv3.IMqttAsyncClient
    public IMqttToken unsubscribe(String[] strArr, Object obj, IMqttActionListener iMqttActionListener) {
        if (this.log.isLoggable(5)) {
            String str = "";
            for (int i10 = 0; i10 < strArr.length; i10++) {
                if (i10 > 0) {
                    str = String.valueOf(str) + ", ";
                }
                str = String.valueOf(str) + strArr[i10];
            }
            this.log.fine(CLASS_NAME, "unsubscribe", "107", new Object[]{str, obj, iMqttActionListener});
        }
        for (String str2 : strArr) {
            MqttTopic.validate(str2, true);
        }
        for (String str3 : strArr) {
            this.comms.removeMessageListener(str3);
        }
        MqttToken mqttToken = new MqttToken(getClientId());
        mqttToken.setActionCallback(iMqttActionListener);
        mqttToken.setUserContext(obj);
        mqttToken.internalTok.setTopics(strArr);
        this.comms.sendNoWait(new MqttUnsubscribe(strArr), mqttToken);
        this.log.fine(CLASS_NAME, "unsubscribe", "110");
        return mqttToken;
    }

    public MqttAsyncClient(String str, String str2, MqttClientPersistence mqttClientPersistence, MqttPingSender mqttPingSender, ScheduledExecutorService scheduledExecutorService, HighResolutionTimer highResolutionTimer) {
        Logger logger = LoggerFactory.getLogger(LoggerFactory.MQTT_CLIENT_MSG_CAT, CLASS_NAME);
        this.log = logger;
        int i10 = 0;
        this.reconnecting = false;
        logger.setResourceName(str2);
        if (str2 != null) {
            int i11 = 0;
            while (i10 < str2.length() - 1) {
                MqttPingSender mqttPingSender2 = mqttPingSender;
                if (Character_isHighSurrogate(str2.charAt(i10))) {
                    i10++;
                }
                i11++;
                i10++;
                mqttPingSender = mqttPingSender2;
            }
            if (i11 <= 65535) {
                NetworkModuleService.validateURI(str);
                this.serverURI = str;
                this.clientId = str2;
                this.persistence = mqttClientPersistence;
                if (mqttClientPersistence == null) {
                    this.persistence = new MemoryPersistence();
                }
                HighResolutionTimer systemHighResolutionTimer = highResolutionTimer == null ? new SystemHighResolutionTimer() : highResolutionTimer;
                this.executorService = scheduledExecutorService;
                this.log.fine(CLASS_NAME, "MqttAsyncClient", "101", new Object[]{str2, str, mqttClientPersistence});
                this.persistence.open(str2, str);
                this.comms = new ClientComms(this, this.persistence, mqttPingSender, this.executorService, systemHighResolutionTimer);
                this.persistence.close();
                this.topics = new Hashtable();
                return;
            }
            throw new IllegalArgumentException("ClientId longer than 65535 characters");
        }
        throw new IllegalArgumentException("Null clientId");
    }

    @Override // org.eclipse.paho.client.mqttv3.IMqttAsyncClient
    public IMqttDeliveryToken publish(String str, byte[] bArr, int i10, boolean z10) {
        return publish(str, bArr, i10, z10, null, null);
    }

    @Override // org.eclipse.paho.client.mqttv3.IMqttAsyncClient
    public IMqttDeliveryToken publish(String str, MqttMessage mqttMessage) {
        return publish(str, mqttMessage, (Object) null, (IMqttActionListener) null);
    }

    @Override // org.eclipse.paho.client.mqttv3.IMqttAsyncClient
    public IMqttDeliveryToken publish(String str, MqttMessage mqttMessage, Object obj, IMqttActionListener iMqttActionListener) {
        Logger logger = this.log;
        String str2 = CLASS_NAME;
        logger.fine(str2, "publish", "111", new Object[]{str, obj, iMqttActionListener});
        MqttTopic.validate(str, false);
        MqttDeliveryToken mqttDeliveryToken = new MqttDeliveryToken(getClientId());
        mqttDeliveryToken.setActionCallback(iMqttActionListener);
        mqttDeliveryToken.setUserContext(obj);
        mqttDeliveryToken.setMessage(mqttMessage);
        mqttDeliveryToken.internalTok.setTopics(new String[]{str});
        this.comms.sendNoWait(new MqttPublish(str, mqttMessage), mqttDeliveryToken);
        this.log.fine(str2, "publish", "112");
        return mqttDeliveryToken;
    }

    @Override // org.eclipse.paho.client.mqttv3.IMqttAsyncClient
    public IMqttToken subscribe(String str, int i10, Object obj, IMqttActionListener iMqttActionListener, IMqttMessageListener iMqttMessageListener) {
        return subscribe(new String[]{str}, new int[]{i10}, obj, iMqttActionListener, new IMqttMessageListener[]{iMqttMessageListener});
    }

    @Override // org.eclipse.paho.client.mqttv3.IMqttAsyncClient
    public IMqttToken subscribe(String str, int i10, IMqttMessageListener iMqttMessageListener) {
        return subscribe(new String[]{str}, new int[]{i10}, (Object) null, (IMqttActionListener) null, new IMqttMessageListener[]{iMqttMessageListener});
    }

    @Override // org.eclipse.paho.client.mqttv3.IMqttAsyncClient
    public IMqttToken subscribe(String[] strArr, int[] iArr, IMqttMessageListener[] iMqttMessageListenerArr) {
        return subscribe(strArr, iArr, (Object) null, (IMqttActionListener) null, iMqttMessageListenerArr);
    }

    @Override // org.eclipse.paho.client.mqttv3.IMqttAsyncClient
    public IMqttToken subscribe(String[] strArr, int[] iArr, Object obj, IMqttActionListener iMqttActionListener, IMqttMessageListener[] iMqttMessageListenerArr) throws Exception {
        IMqttMessageListener iMqttMessageListener;
        if ((iMqttMessageListenerArr == null || iMqttMessageListenerArr.length == iArr.length) && iArr.length == strArr.length) {
            for (int i10 = 0; i10 < strArr.length; i10++) {
                MqttTopic.validate(strArr[i10], true);
                if (iMqttMessageListenerArr != null && (iMqttMessageListener = iMqttMessageListenerArr[i10]) != null) {
                    this.comms.setMessageListener(strArr[i10], iMqttMessageListener);
                } else {
                    this.comms.removeMessageListener(strArr[i10]);
                }
            }
            try {
                return subscribeBase(strArr, iArr, obj, iMqttActionListener);
            } catch (Exception e10) {
                for (String str : strArr) {
                    this.comms.removeMessageListener(str);
                }
                throw e10;
            }
        }
        throw new IllegalArgumentException();
    }
}
