package org.eclipse.paho.client.mqttv3.internal;

import com.taobao.accs.utl.BaseMonitor;
import java.util.Enumeration;
import java.util.Properties;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import org.eclipse.paho.client.mqttv3.BufferedMessage;
import org.eclipse.paho.client.mqttv3.IMqttActionListener;
import org.eclipse.paho.client.mqttv3.IMqttAsyncClient;
import org.eclipse.paho.client.mqttv3.IMqttDeliveryToken;
import org.eclipse.paho.client.mqttv3.IMqttMessageListener;
import org.eclipse.paho.client.mqttv3.MqttCallback;
import org.eclipse.paho.client.mqttv3.MqttCallbackExtended;
import org.eclipse.paho.client.mqttv3.MqttClientPersistence;
import org.eclipse.paho.client.mqttv3.MqttConnectOptions;
import org.eclipse.paho.client.mqttv3.MqttDeliveryToken;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.eclipse.paho.client.mqttv3.MqttMessage;
import org.eclipse.paho.client.mqttv3.MqttPingSender;
import org.eclipse.paho.client.mqttv3.MqttToken;
import org.eclipse.paho.client.mqttv3.MqttTopic;
import org.eclipse.paho.client.mqttv3.internal.wire.MqttConnack;
import org.eclipse.paho.client.mqttv3.internal.wire.MqttConnect;
import org.eclipse.paho.client.mqttv3.internal.wire.MqttDisconnect;
import org.eclipse.paho.client.mqttv3.internal.wire.MqttPublish;
import org.eclipse.paho.client.mqttv3.internal.wire.MqttWireMessage;
import org.eclipse.paho.client.mqttv3.logging.Logger;
import org.eclipse.paho.client.mqttv3.logging.LoggerFactory;

/* loaded from: classes6.dex */
public class ClientComms {
    public static String BUILD_LEVEL = "L${build.level}";
    private static final byte CLOSED = 4;
    private static final byte CONNECTED = 0;
    private static final byte CONNECTING = 1;
    private static final byte DISCONNECTED = 3;
    private static final byte DISCONNECTING = 2;
    public static String VERSION = "${project.version}";
    private final String CLASS_NAME;
    private CommsCallback callback;
    private IMqttAsyncClient client;
    private ClientState clientState;
    private boolean closePending;
    private final Object conLock;
    private MqttConnectOptions conOptions;
    private byte conState;
    private DisconnectedMessageBuffer disconnectedMessageBuffer;
    private ExecutorService executorService;
    private final Logger log;
    private int networkModuleIndex;
    private NetworkModule[] networkModules;
    private MqttClientPersistence persistence;
    private MqttPingSender pingSender;
    private CommsReceiver receiver;
    private boolean resting;
    private CommsSender sender;
    private boolean stoppingComms;
    private CommsTokenStore tokenStore;

    public class ConnectBG implements Runnable {
        ClientComms clientComms;
        MqttConnect conPacket;
        MqttToken conToken;
        private String threadName;

        public ConnectBG(ClientComms clientComms, MqttToken mqttToken, MqttConnect mqttConnect, ExecutorService executorService) {
            this.clientComms = clientComms;
            this.conToken = mqttToken;
            this.conPacket = mqttConnect;
            this.threadName = "MQTT Con: " + ClientComms.this.getClient().getClientId();
        }

        @Override // java.lang.Runnable
        public void run() {
            MqttException mqttExceptionCreateMqttException;
            Thread.currentThread().setName(this.threadName);
            ClientComms.this.log.fine(ClientComms.this.CLASS_NAME, "connectBG:run", "220");
            try {
                MqttDeliveryToken[] outstandingDelTokens = ClientComms.this.tokenStore.getOutstandingDelTokens();
                int length = outstandingDelTokens.length;
                int i10 = 0;
                while (true) {
                    mqttExceptionCreateMqttException = null;
                    if (i10 >= length) {
                        break;
                    }
                    outstandingDelTokens[i10].internalTok.setException(null);
                    i10++;
                }
                ClientComms.this.tokenStore.saveToken(this.conToken, this.conPacket);
                NetworkModule networkModule = ClientComms.this.networkModules[ClientComms.this.networkModuleIndex];
                networkModule.start();
                ClientComms.this.receiver = new CommsReceiver(this.clientComms, ClientComms.this.clientState, ClientComms.this.tokenStore, networkModule.getInputStream());
                ClientComms.this.receiver.start("MQTT Rec: " + ClientComms.this.getClient().getClientId(), ClientComms.this.executorService);
                ClientComms.this.sender = new CommsSender(this.clientComms, ClientComms.this.clientState, ClientComms.this.tokenStore, networkModule.getOutputStream());
                ClientComms.this.sender.start("MQTT Snd: " + ClientComms.this.getClient().getClientId(), ClientComms.this.executorService);
                ClientComms.this.callback.start("MQTT Call: " + ClientComms.this.getClient().getClientId(), ClientComms.this.executorService);
                ClientComms.this.internalSend(this.conPacket, this.conToken);
            } catch (MqttException e10) {
                ClientComms.this.log.fine(ClientComms.this.CLASS_NAME, "connectBG:run", "212", null, e10);
                mqttExceptionCreateMqttException = e10;
            } catch (Exception e11) {
                ClientComms.this.log.fine(ClientComms.this.CLASS_NAME, "connectBG:run", "209", null, e11);
                mqttExceptionCreateMqttException = ExceptionHelper.createMqttException(e11);
            }
            if (mqttExceptionCreateMqttException != null) {
                ClientComms.this.shutdownConnection(this.conToken, mqttExceptionCreateMqttException);
            }
        }

        public void start() {
            if (ClientComms.this.executorService == null) {
                new Thread(this).start();
            } else {
                ClientComms.this.executorService.execute(this);
            }
        }
    }

    public class DisconnectBG implements Runnable {
        MqttDisconnect disconnect;
        long quiesceTimeout;
        private String threadName;
        MqttToken token;

        public DisconnectBG(MqttDisconnect mqttDisconnect, long j10, MqttToken mqttToken, ExecutorService executorService) {
            this.disconnect = mqttDisconnect;
            this.quiesceTimeout = j10;
            this.token = mqttToken;
        }

        @Override // java.lang.Runnable
        public void run() {
            Thread.currentThread().setName(this.threadName);
            ClientComms.this.log.fine(ClientComms.this.CLASS_NAME, "disconnectBG:run", "221");
            ClientComms.this.clientState.quiesce(this.quiesceTimeout);
            try {
                ClientComms.this.internalSend(this.disconnect, this.token);
                if (ClientComms.this.sender != null && ClientComms.this.sender.isRunning()) {
                    this.token.internalTok.waitUntilSent();
                }
                this.token.internalTok.markComplete(null, null);
            } catch (MqttException unused) {
                this.token.internalTok.markComplete(null, null);
                if (ClientComms.this.sender == null || !ClientComms.this.sender.isRunning()) {
                }
            } catch (Throwable th) {
                this.token.internalTok.markComplete(null, null);
                if (ClientComms.this.sender == null || !ClientComms.this.sender.isRunning()) {
                    this.token.internalTok.notifyComplete();
                }
                ClientComms.this.shutdownConnection(this.token, null);
                throw th;
            }
            if (ClientComms.this.sender == null || !ClientComms.this.sender.isRunning()) {
                this.token.internalTok.notifyComplete();
            }
            ClientComms.this.shutdownConnection(this.token, null);
        }

        public void start() {
            this.threadName = "MQTT Disc: " + ClientComms.this.getClient().getClientId();
            if (ClientComms.this.executorService == null) {
                new Thread(this).start();
            } else {
                ClientComms.this.executorService.execute(this);
            }
        }
    }

    public class MessageDiscardedCallback implements IDiscardedBufferMessageCallback {
        public MessageDiscardedCallback() {
        }

        @Override // org.eclipse.paho.client.mqttv3.internal.IDiscardedBufferMessageCallback
        public void messageDiscarded(MqttWireMessage mqttWireMessage) {
            if (ClientComms.this.disconnectedMessageBuffer.isPersistBuffer()) {
                ClientComms.this.clientState.unPersistBufferedMessage(mqttWireMessage);
            }
        }
    }

    public class ReconnectDisconnectedBufferCallback implements IDisconnectedBufferCallback {
        final String methodName;

        public ReconnectDisconnectedBufferCallback(String str) {
            this.methodName = str;
        }

        @Override // org.eclipse.paho.client.mqttv3.internal.IDisconnectedBufferCallback
        public void publishBufferedMessage(BufferedMessage bufferedMessage) throws MqttException {
            if (!ClientComms.this.isConnected()) {
                ClientComms.this.log.fine(ClientComms.this.CLASS_NAME, this.methodName, "208");
                throw ExceptionHelper.createMqttException(32104);
            }
            while (ClientComms.this.clientState.getActualInFlight() >= ClientComms.this.clientState.getMaxInFlight() - 3) {
                Thread.yield();
            }
            ClientComms.this.log.fine(ClientComms.this.CLASS_NAME, this.methodName, "510", new Object[]{bufferedMessage.getMessage().getKey()});
            ClientComms.this.internalSend(bufferedMessage.getMessage(), bufferedMessage.getToken());
            ClientComms.this.clientState.unPersistBufferedMessage(bufferedMessage.getMessage());
        }
    }

    public ClientComms(IMqttAsyncClient iMqttAsyncClient, MqttClientPersistence mqttClientPersistence, MqttPingSender mqttPingSender, ExecutorService executorService, HighResolutionTimer highResolutionTimer) {
        String name = ClientComms.class.getName();
        this.CLASS_NAME = name;
        Logger logger = LoggerFactory.getLogger(LoggerFactory.MQTT_CLIENT_MSG_CAT, name);
        this.log = logger;
        this.stoppingComms = false;
        this.conLock = new Object();
        this.closePending = false;
        this.resting = false;
        this.conState = (byte) 3;
        this.client = iMqttAsyncClient;
        this.persistence = mqttClientPersistence;
        this.pingSender = mqttPingSender;
        mqttPingSender.init(this);
        this.executorService = executorService;
        this.tokenStore = new CommsTokenStore(getClient().getClientId());
        this.callback = new CommsCallback(this);
        ClientState clientState = new ClientState(mqttClientPersistence, this.tokenStore, this.callback, this, mqttPingSender, highResolutionTimer);
        this.clientState = clientState;
        this.callback.setClientState(clientState);
        logger.setResourceName(getClient().getClientId());
    }

    private MqttToken handleOldTokens(MqttToken mqttToken, MqttException mqttException) {
        this.log.fine(this.CLASS_NAME, "handleOldTokens", "222");
        MqttToken mqttToken2 = null;
        if (mqttToken != null) {
            try {
                if (!mqttToken.isComplete() && this.tokenStore.getToken(mqttToken.internalTok.getKey()) == null) {
                    this.tokenStore.saveToken(mqttToken, mqttToken.internalTok.getKey());
                }
            } catch (Exception unused) {
                return mqttToken2;
            }
        }
        Enumeration enumerationElements = this.clientState.resolveOldTokens(mqttException).elements();
        while (enumerationElements.hasMoreElements()) {
            MqttToken mqttToken3 = (MqttToken) enumerationElements.nextElement();
            if (mqttToken3.internalTok.getKey().equals(MqttDisconnect.KEY) || mqttToken3.internalTok.getKey().equals("Con")) {
                mqttToken2 = mqttToken3;
            } else {
                this.callback.asyncOperationComplete(mqttToken3);
            }
        }
        return mqttToken2;
    }

    private void handleRunException(Exception exc) {
        this.log.fine(this.CLASS_NAME, "handleRunException", "804", null, exc);
        shutdownConnection(null, !(exc instanceof MqttException) ? new MqttException(32109, exc) : (MqttException) exc);
    }

    private void shutdownExecutorService() {
        MqttConnectOptions mqttConnectOptions;
        this.executorService.shutdown();
        try {
            ExecutorService executorService = this.executorService;
            if (executorService == null || (mqttConnectOptions = this.conOptions) == null) {
                return;
            }
            long executorServiceTimeout = mqttConnectOptions.getExecutorServiceTimeout();
            TimeUnit timeUnit = TimeUnit.SECONDS;
            if (executorService.awaitTermination(executorServiceTimeout, timeUnit)) {
                return;
            }
            this.executorService.shutdownNow();
            if (this.executorService.awaitTermination(this.conOptions.getExecutorServiceTimeout(), timeUnit)) {
                return;
            }
            this.log.fine(this.CLASS_NAME, "shutdownExecutorService", "executorService did not terminate");
        } catch (InterruptedException unused) {
            this.executorService.shutdownNow();
            Thread.currentThread().interrupt();
        }
    }

    public MqttToken checkForActivity() {
        return checkForActivity(null);
    }

    public void close(boolean z10) {
        synchronized (this.conLock) {
            try {
                if (!isClosed()) {
                    if (!isDisconnected() || z10) {
                        this.log.fine(this.CLASS_NAME, "close", "224");
                        if (isConnecting()) {
                            throw new MqttException(32110);
                        }
                        if (isConnected()) {
                            throw ExceptionHelper.createMqttException(32100);
                        }
                        if (isDisconnecting()) {
                            this.closePending = true;
                            return;
                        }
                    }
                    this.conState = (byte) 4;
                    this.clientState.close();
                    this.clientState = null;
                    this.callback = null;
                    this.persistence = null;
                    this.sender = null;
                    this.pingSender = null;
                    this.receiver = null;
                    this.networkModules = null;
                    this.conOptions = null;
                    this.tokenStore = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void connect(MqttConnectOptions mqttConnectOptions, MqttToken mqttToken) throws Throwable {
        synchronized (this.conLock) {
            try {
                try {
                    if (!isDisconnected() || this.closePending) {
                        this.log.fine(this.CLASS_NAME, BaseMonitor.ALARM_POINT_CONNECT, "207", new Object[]{Byte.valueOf(this.conState)});
                        if (isClosed() || this.closePending) {
                            throw new MqttException(32111);
                        }
                        if (isConnecting()) {
                            throw new MqttException(32110);
                        }
                        if (!isDisconnecting()) {
                            throw ExceptionHelper.createMqttException(32100);
                        }
                        throw new MqttException(32102);
                    }
                    this.log.fine(this.CLASS_NAME, BaseMonitor.ALARM_POINT_CONNECT, "214");
                    this.conState = (byte) 1;
                    this.conOptions = mqttConnectOptions;
                    MqttConnect mqttConnect = new MqttConnect(this.client.getClientId(), this.conOptions.getMqttVersion(), this.conOptions.isCleanSession(), this.conOptions.getKeepAliveInterval(), this.conOptions.getUserName(), this.conOptions.getPassword(), this.conOptions.getWillMessage(), this.conOptions.getWillDestination());
                    this.clientState.setKeepAliveSecs(this.conOptions.getKeepAliveInterval());
                    this.clientState.setCleanSession(this.conOptions.isCleanSession());
                    this.clientState.setMaxInflight(this.conOptions.getMaxInflight());
                    this.tokenStore.open();
                    new ConnectBG(this, mqttToken, mqttConnect, this.executorService).start();
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        }
    }

    public void connectComplete(MqttConnack mqttConnack, MqttException mqttException) throws MqttException {
        int returnCode = mqttConnack.getReturnCode();
        synchronized (this.conLock) {
            try {
                if (returnCode != 0) {
                    this.log.fine(this.CLASS_NAME, "connectComplete", "204", new Object[]{Integer.valueOf(returnCode)});
                    throw mqttException;
                }
                this.log.fine(this.CLASS_NAME, "connectComplete", "215");
                this.conState = (byte) 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void deleteBufferedMessage(int i10) {
        this.disconnectedMessageBuffer.deleteMessage(i10);
    }

    public void deliveryComplete(MqttPublish mqttPublish) {
        this.clientState.deliveryComplete(mqttPublish);
    }

    public void disconnect(MqttDisconnect mqttDisconnect, long j10, MqttToken mqttToken) throws Throwable {
        synchronized (this.conLock) {
            try {
                try {
                    if (isClosed()) {
                        this.log.fine(this.CLASS_NAME, "disconnect", "223");
                        throw ExceptionHelper.createMqttException(32111);
                    }
                    if (isDisconnected()) {
                        this.log.fine(this.CLASS_NAME, "disconnect", "211");
                        throw ExceptionHelper.createMqttException(32101);
                    }
                    if (isDisconnecting()) {
                        this.log.fine(this.CLASS_NAME, "disconnect", "219");
                        throw ExceptionHelper.createMqttException(32102);
                    }
                    if (Thread.currentThread() == this.callback.getThread()) {
                        this.log.fine(this.CLASS_NAME, "disconnect", "210");
                        throw ExceptionHelper.createMqttException(32107);
                    }
                    this.log.fine(this.CLASS_NAME, "disconnect", "218");
                    this.conState = (byte) 2;
                    new DisconnectBG(mqttDisconnect, j10, mqttToken, this.executorService).start();
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    public void disconnectForcibly(long j10, long j11) {
        disconnectForcibly(j10, j11, true);
    }

    public int getActualInFlight() {
        return this.clientState.getActualInFlight();
    }

    public MqttMessage getBufferedMessage(int i10) {
        return ((MqttPublish) this.disconnectedMessageBuffer.getMessage(i10).getMessage()).getMessage();
    }

    public int getBufferedMessageCount() {
        return this.disconnectedMessageBuffer.getMessageCount();
    }

    public IMqttAsyncClient getClient() {
        return this.client;
    }

    public ClientState getClientState() {
        return this.clientState;
    }

    public MqttConnectOptions getConOptions() {
        return this.conOptions;
    }

    public Properties getDebug() {
        Properties properties = new Properties();
        properties.put("conState", Integer.valueOf(this.conState));
        properties.put("serverURI", getClient().getServerURI());
        properties.put("callback", this.callback);
        properties.put("stoppingComms", Boolean.valueOf(this.stoppingComms));
        return properties;
    }

    public long getKeepAlive() {
        return this.clientState.getKeepAlive();
    }

    public int getNetworkModuleIndex() {
        return this.networkModuleIndex;
    }

    public NetworkModule[] getNetworkModules() {
        return this.networkModules;
    }

    public MqttDeliveryToken[] getPendingDeliveryTokens() {
        return this.tokenStore.getOutstandingDelTokens();
    }

    public CommsReceiver getReceiver() {
        return this.receiver;
    }

    public MqttTopic getTopic(String str) {
        return new MqttTopic(str, this);
    }

    public void internalSend(MqttWireMessage mqttWireMessage, MqttToken mqttToken) throws MqttException {
        this.log.fine(this.CLASS_NAME, "internalSend", "200", new Object[]{mqttWireMessage.getKey(), mqttWireMessage, mqttToken});
        if (mqttToken.getClient() != null) {
            this.log.fine(this.CLASS_NAME, "internalSend", "213", new Object[]{mqttWireMessage.getKey(), mqttWireMessage, mqttToken});
            throw new MqttException(32201);
        }
        mqttToken.internalTok.setClient(getClient());
        try {
            this.clientState.send(mqttWireMessage, mqttToken);
        } catch (MqttException e10) {
            mqttToken.internalTok.setClient(null);
            if (mqttWireMessage instanceof MqttPublish) {
                this.clientState.undo((MqttPublish) mqttWireMessage);
            }
            throw e10;
        }
    }

    public boolean isClosed() {
        boolean z10;
        synchronized (this.conLock) {
            z10 = this.conState == 4;
        }
        return z10;
    }

    public boolean isConnected() {
        boolean z10;
        synchronized (this.conLock) {
            z10 = this.conState == 0;
        }
        return z10;
    }

    public boolean isConnecting() {
        boolean z10;
        synchronized (this.conLock) {
            z10 = true;
            if (this.conState != 1) {
                z10 = false;
            }
        }
        return z10;
    }

    public boolean isDisconnected() {
        boolean z10;
        synchronized (this.conLock) {
            z10 = this.conState == 3;
        }
        return z10;
    }

    public boolean isDisconnecting() {
        boolean z10;
        synchronized (this.conLock) {
            z10 = this.conState == 2;
        }
        return z10;
    }

    public boolean isResting() {
        boolean z10;
        synchronized (this.conLock) {
            z10 = this.resting;
        }
        return z10;
    }

    public void messageArrivedComplete(int i10, int i11) {
        this.callback.messageArrivedComplete(i10, i11);
    }

    public void notifyConnect() {
        if (this.disconnectedMessageBuffer != null) {
            this.log.fine(this.CLASS_NAME, "notifyConnect", "509", null);
            this.disconnectedMessageBuffer.setPublishCallback(new ReconnectDisconnectedBufferCallback("notifyConnect"));
            this.disconnectedMessageBuffer.setMessageDiscardedCallBack(new MessageDiscardedCallback());
            ExecutorService executorService = this.executorService;
            if (executorService == null) {
                new Thread(this.disconnectedMessageBuffer).start();
            } else {
                executorService.execute(this.disconnectedMessageBuffer);
            }
        }
    }

    public boolean removeMessage(IMqttDeliveryToken iMqttDeliveryToken) {
        return this.clientState.removeMessage(iMqttDeliveryToken);
    }

    public void removeMessageListener(String str) {
        this.callback.removeMessageListener(str);
    }

    public void sendNoWait(MqttWireMessage mqttWireMessage, MqttToken mqttToken) {
        if (!isConnected() && ((isConnected() || !(mqttWireMessage instanceof MqttConnect)) && (!isDisconnecting() || !(mqttWireMessage instanceof MqttDisconnect)))) {
            if (this.disconnectedMessageBuffer == null) {
                this.log.fine(this.CLASS_NAME, "sendNoWait", "208");
                throw ExceptionHelper.createMqttException(32104);
            }
            this.log.fine(this.CLASS_NAME, "sendNoWait", "508", new Object[]{mqttWireMessage.getKey()});
            if (this.disconnectedMessageBuffer.isPersistBuffer()) {
                this.clientState.persistBufferedMessage(mqttWireMessage);
            }
            this.disconnectedMessageBuffer.putMessage(mqttWireMessage, mqttToken);
            return;
        }
        DisconnectedMessageBuffer disconnectedMessageBuffer = this.disconnectedMessageBuffer;
        if (disconnectedMessageBuffer == null || disconnectedMessageBuffer.getMessageCount() == 0) {
            internalSend(mqttWireMessage, mqttToken);
            return;
        }
        this.log.fine(this.CLASS_NAME, "sendNoWait", "507", new Object[]{mqttWireMessage.getKey()});
        if (this.disconnectedMessageBuffer.isPersistBuffer()) {
            this.clientState.persistBufferedMessage(mqttWireMessage);
        }
        this.disconnectedMessageBuffer.putMessage(mqttWireMessage, mqttToken);
    }

    public void setCallback(MqttCallback mqttCallback) {
        this.callback.setCallback(mqttCallback);
    }

    public void setDisconnectedMessageBuffer(DisconnectedMessageBuffer disconnectedMessageBuffer) {
        this.disconnectedMessageBuffer = disconnectedMessageBuffer;
    }

    public void setManualAcks(boolean z10) {
        this.callback.setManualAcks(z10);
    }

    public void setMessageListener(String str, IMqttMessageListener iMqttMessageListener) {
        this.callback.setMessageListener(str, iMqttMessageListener);
    }

    public void setNetworkModuleIndex(int i10) {
        this.networkModuleIndex = i10;
    }

    public void setNetworkModules(NetworkModule[] networkModuleArr) {
        this.networkModules = (NetworkModule[]) networkModuleArr.clone();
    }

    public void setReconnectCallback(MqttCallbackExtended mqttCallbackExtended) {
        this.callback.setReconnectCallback(mqttCallbackExtended);
    }

    public void setRestingState(boolean z10) {
        this.resting = z10;
    }

    public void shutdownConnection(MqttToken mqttToken, MqttException mqttException) {
        CommsCallback commsCallback;
        CommsCallback commsCallback2;
        MqttClientPersistence mqttClientPersistence;
        NetworkModule networkModule;
        synchronized (this.conLock) {
            try {
                if (!this.stoppingComms && !this.closePending && !isClosed()) {
                    this.stoppingComms = true;
                    this.log.fine(this.CLASS_NAME, "shutdownConnection", "216");
                    boolean z10 = isConnected() || isDisconnecting();
                    this.conState = (byte) 2;
                    if (mqttToken != null && !mqttToken.isComplete()) {
                        mqttToken.internalTok.setException(mqttException);
                    }
                    CommsCallback commsCallback3 = this.callback;
                    if (commsCallback3 != null) {
                        commsCallback3.stop();
                    }
                    CommsReceiver commsReceiver = this.receiver;
                    if (commsReceiver != null) {
                        commsReceiver.stop();
                    }
                    try {
                        NetworkModule[] networkModuleArr = this.networkModules;
                        if (networkModuleArr != null && (networkModule = networkModuleArr[this.networkModuleIndex]) != null) {
                            networkModule.stop();
                        }
                    } catch (Exception unused) {
                    }
                    this.tokenStore.quiesce(new MqttException(32102));
                    MqttToken mqttTokenHandleOldTokens = handleOldTokens(mqttToken, mqttException);
                    try {
                        this.clientState.disconnected(mqttException);
                        if (this.clientState.getCleanSession()) {
                            this.callback.removeMessageListeners();
                        }
                    } catch (Exception unused2) {
                    }
                    CommsSender commsSender = this.sender;
                    if (commsSender != null) {
                        commsSender.stop();
                    }
                    MqttPingSender mqttPingSender = this.pingSender;
                    if (mqttPingSender != null) {
                        mqttPingSender.stop();
                    }
                    try {
                        if (this.disconnectedMessageBuffer == null && (mqttClientPersistence = this.persistence) != null) {
                            mqttClientPersistence.close();
                        }
                    } catch (Exception unused3) {
                    }
                    synchronized (this.conLock) {
                        this.log.fine(this.CLASS_NAME, "shutdownConnection", "217");
                        this.conState = (byte) 3;
                        this.stoppingComms = false;
                    }
                    if (mqttTokenHandleOldTokens != null && (commsCallback2 = this.callback) != null) {
                        commsCallback2.asyncOperationComplete(mqttTokenHandleOldTokens);
                    }
                    if (z10 && (commsCallback = this.callback) != null) {
                        commsCallback.connectionLost(mqttException);
                    }
                    synchronized (this.conLock) {
                        if (this.closePending) {
                            try {
                                close(true);
                            } catch (Exception unused4) {
                            }
                        }
                    }
                }
            } finally {
            }
        }
    }

    public MqttToken checkForActivity(IMqttActionListener iMqttActionListener) {
        try {
            return this.clientState.checkForActivity(iMqttActionListener);
        } catch (MqttException e10) {
            handleRunException(e10);
            return null;
        } catch (Exception e11) {
            handleRunException(e11);
            return null;
        }
    }

    public void deliveryComplete(int i10) {
        this.clientState.deliveryComplete(i10);
    }

    public void disconnectForcibly(long j10, long j11, boolean z10) {
        this.conState = (byte) 2;
        ClientState clientState = this.clientState;
        if (clientState != null) {
            clientState.quiesce(j10);
        }
        MqttToken mqttToken = new MqttToken(this.client.getClientId());
        if (z10) {
            try {
                internalSend(new MqttDisconnect(), mqttToken);
                mqttToken.waitForCompletion(j11);
            } catch (Exception unused) {
            } catch (Throwable th) {
                mqttToken.internalTok.markComplete(null, null);
                shutdownConnection(mqttToken, null);
                throw th;
            }
        }
        mqttToken.internalTok.markComplete(null, null);
        shutdownConnection(mqttToken, null);
    }
}
