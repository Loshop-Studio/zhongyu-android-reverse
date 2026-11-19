package org.eclipse.paho.client.mqttv3;

import java.util.concurrent.ScheduledExecutorService;
import org.eclipse.paho.client.mqttv3.persist.MqttDefaultFilePersistence;
import org.eclipse.paho.client.mqttv3.util.Debug;

/* loaded from: classes6.dex */
public class MqttClient implements IMqttClient {
    protected MqttAsyncClient aClient;
    protected long timeToWait;

    public MqttClient(String str, String str2) {
        this(str, str2, new MqttDefaultFilePersistence());
    }

    public static String generateClientId() {
        return MqttAsyncClient.generateClientId();
    }

    @Override // org.eclipse.paho.client.mqttv3.IMqttClient, java.lang.AutoCloseable
    public void close() {
        this.aClient.close(false);
    }

    @Override // org.eclipse.paho.client.mqttv3.IMqttClient
    public void connect() {
        connect(new MqttConnectOptions());
    }

    @Override // org.eclipse.paho.client.mqttv3.IMqttClient
    public IMqttToken connectWithResult(MqttConnectOptions mqttConnectOptions) {
        IMqttToken iMqttTokenConnect = this.aClient.connect(mqttConnectOptions, null, null);
        iMqttTokenConnect.waitForCompletion(getTimeToWait());
        return iMqttTokenConnect;
    }

    @Override // org.eclipse.paho.client.mqttv3.IMqttClient
    public void disconnect() {
        this.aClient.disconnect().waitForCompletion();
    }

    @Override // org.eclipse.paho.client.mqttv3.IMqttClient
    public void disconnectForcibly() {
        this.aClient.disconnectForcibly();
    }

    @Override // org.eclipse.paho.client.mqttv3.IMqttClient
    public String getClientId() {
        return this.aClient.getClientId();
    }

    public String getCurrentServerURI() {
        return this.aClient.getCurrentServerURI();
    }

    public Debug getDebug() {
        return this.aClient.getDebug();
    }

    @Override // org.eclipse.paho.client.mqttv3.IMqttClient
    public IMqttDeliveryToken[] getPendingDeliveryTokens() {
        return this.aClient.getPendingDeliveryTokens();
    }

    @Override // org.eclipse.paho.client.mqttv3.IMqttClient
    public String getServerURI() {
        return this.aClient.getServerURI();
    }

    public long getTimeToWait() {
        return this.timeToWait;
    }

    @Override // org.eclipse.paho.client.mqttv3.IMqttClient
    public MqttTopic getTopic(String str) {
        return this.aClient.getTopic(str);
    }

    @Override // org.eclipse.paho.client.mqttv3.IMqttClient
    public boolean isConnected() {
        return this.aClient.isConnected();
    }

    @Override // org.eclipse.paho.client.mqttv3.IMqttClient
    public void messageArrivedComplete(int i10, int i11) {
        this.aClient.messageArrivedComplete(i10, i11);
    }

    @Override // org.eclipse.paho.client.mqttv3.IMqttClient
    public void publish(String str, byte[] bArr, int i10, boolean z10) {
        MqttMessage mqttMessage = new MqttMessage(bArr);
        mqttMessage.setQos(i10);
        mqttMessage.setRetained(z10);
        publish(str, mqttMessage);
    }

    @Override // org.eclipse.paho.client.mqttv3.IMqttClient
    public void reconnect() throws MqttException {
        this.aClient.reconnect();
    }

    @Override // org.eclipse.paho.client.mqttv3.IMqttClient
    public void setCallback(MqttCallback mqttCallback) {
        this.aClient.setCallback(mqttCallback);
    }

    @Override // org.eclipse.paho.client.mqttv3.IMqttClient
    public void setManualAcks(boolean z10) {
        this.aClient.setManualAcks(z10);
    }

    public void setTimeToWait(long j10) {
        if (j10 < -1) {
            throw new IllegalArgumentException();
        }
        this.timeToWait = j10;
    }

    @Override // org.eclipse.paho.client.mqttv3.IMqttClient
    public void subscribe(String str) throws Exception {
        subscribe(new String[]{str}, new int[]{1});
    }

    @Override // org.eclipse.paho.client.mqttv3.IMqttClient
    public IMqttToken subscribeWithResponse(String str) {
        return subscribeWithResponse(new String[]{str}, new int[]{1});
    }

    @Override // org.eclipse.paho.client.mqttv3.IMqttClient
    public void unsubscribe(String str) {
        unsubscribe(new String[]{str});
    }

    public MqttClient(String str, String str2, MqttClientPersistence mqttClientPersistence) {
        this.aClient = null;
        this.timeToWait = -1L;
        this.aClient = new MqttAsyncClient(str, str2, mqttClientPersistence);
    }

    public void close(boolean z10) {
        this.aClient.close(z10);
    }

    @Override // org.eclipse.paho.client.mqttv3.IMqttClient
    public void connect(MqttConnectOptions mqttConnectOptions) {
        this.aClient.connect(mqttConnectOptions, null, null).waitForCompletion(getTimeToWait());
    }

    @Override // org.eclipse.paho.client.mqttv3.IMqttClient
    public void disconnect(long j10) {
        this.aClient.disconnect(j10, null, null).waitForCompletion();
    }

    @Override // org.eclipse.paho.client.mqttv3.IMqttClient
    public void disconnectForcibly(long j10) {
        this.aClient.disconnectForcibly(j10);
    }

    @Override // org.eclipse.paho.client.mqttv3.IMqttClient
    public void subscribe(String[] strArr) throws Exception {
        int length = strArr.length;
        int[] iArr = new int[length];
        for (int i10 = 0; i10 < length; i10++) {
            iArr[i10] = 1;
        }
        subscribe(strArr, iArr);
    }

    @Override // org.eclipse.paho.client.mqttv3.IMqttClient
    public IMqttToken subscribeWithResponse(String str, IMqttMessageListener iMqttMessageListener) {
        return subscribeWithResponse(new String[]{str}, new int[]{1}, new IMqttMessageListener[]{iMqttMessageListener});
    }

    @Override // org.eclipse.paho.client.mqttv3.IMqttClient
    public void unsubscribe(String[] strArr) {
        this.aClient.unsubscribe(strArr, (Object) null, (IMqttActionListener) null).waitForCompletion(getTimeToWait());
    }

    @Override // org.eclipse.paho.client.mqttv3.IMqttClient
    public void disconnectForcibly(long j10, long j11) {
        this.aClient.disconnectForcibly(j10, j11);
    }

    @Override // org.eclipse.paho.client.mqttv3.IMqttClient
    public IMqttToken subscribeWithResponse(String str, int i10) {
        return subscribeWithResponse(new String[]{str}, new int[]{i10});
    }

    public void disconnectForcibly(long j10, long j11, boolean z10) {
        this.aClient.disconnectForcibly(j10, j11, z10);
    }

    @Override // org.eclipse.paho.client.mqttv3.IMqttClient
    public IMqttToken subscribeWithResponse(String str, int i10, IMqttMessageListener iMqttMessageListener) {
        return subscribeWithResponse(new String[]{str}, new int[]{i10}, new IMqttMessageListener[]{iMqttMessageListener});
    }

    @Override // org.eclipse.paho.client.mqttv3.IMqttClient
    public void publish(String str, MqttMessage mqttMessage) {
        this.aClient.publish(str, mqttMessage, (Object) null, (IMqttActionListener) null).waitForCompletion(getTimeToWait());
    }

    @Override // org.eclipse.paho.client.mqttv3.IMqttClient
    public void subscribe(String str, int i10) throws Exception {
        subscribe(new String[]{str}, new int[]{i10});
    }

    @Override // org.eclipse.paho.client.mqttv3.IMqttClient
    public IMqttToken subscribeWithResponse(String[] strArr) {
        int length = strArr.length;
        int[] iArr = new int[length];
        for (int i10 = 0; i10 < length; i10++) {
            iArr[i10] = 1;
        }
        return subscribeWithResponse(strArr, iArr);
    }

    public MqttClient(String str, String str2, MqttClientPersistence mqttClientPersistence, ScheduledExecutorService scheduledExecutorService) {
        this.aClient = null;
        this.timeToWait = -1L;
        this.aClient = new MqttAsyncClient(str, str2, mqttClientPersistence, new ScheduledExecutorPingSender(scheduledExecutorService), scheduledExecutorService);
    }

    @Override // org.eclipse.paho.client.mqttv3.IMqttClient
    public void subscribe(String[] strArr, int[] iArr) throws Exception {
        subscribe(strArr, iArr, (IMqttMessageListener[]) null);
    }

    @Override // org.eclipse.paho.client.mqttv3.IMqttClient
    public void subscribe(String str, IMqttMessageListener iMqttMessageListener) throws Exception {
        subscribe(new String[]{str}, new int[]{1}, new IMqttMessageListener[]{iMqttMessageListener});
    }

    @Override // org.eclipse.paho.client.mqttv3.IMqttClient
    public void subscribe(String[] strArr, IMqttMessageListener[] iMqttMessageListenerArr) throws Exception {
        int length = strArr.length;
        int[] iArr = new int[length];
        for (int i10 = 0; i10 < length; i10++) {
            iArr[i10] = 1;
        }
        subscribe(strArr, iArr, iMqttMessageListenerArr);
    }

    @Override // org.eclipse.paho.client.mqttv3.IMqttClient
    public IMqttToken subscribeWithResponse(String[] strArr, IMqttMessageListener[] iMqttMessageListenerArr) {
        int length = strArr.length;
        int[] iArr = new int[length];
        for (int i10 = 0; i10 < length; i10++) {
            iArr[i10] = 1;
        }
        return subscribeWithResponse(strArr, iArr, iMqttMessageListenerArr);
    }

    @Override // org.eclipse.paho.client.mqttv3.IMqttClient
    public void subscribe(String str, int i10, IMqttMessageListener iMqttMessageListener) throws Exception {
        subscribe(new String[]{str}, new int[]{i10}, new IMqttMessageListener[]{iMqttMessageListener});
    }

    @Override // org.eclipse.paho.client.mqttv3.IMqttClient
    public IMqttToken subscribeWithResponse(String[] strArr, int[] iArr) {
        return subscribeWithResponse(strArr, iArr, (IMqttMessageListener[]) null);
    }

    @Override // org.eclipse.paho.client.mqttv3.IMqttClient
    public void subscribe(String[] strArr, int[] iArr, IMqttMessageListener[] iMqttMessageListenerArr) throws Exception {
        IMqttToken iMqttTokenSubscribe = this.aClient.subscribe(strArr, iArr, (Object) null, (IMqttActionListener) null, iMqttMessageListenerArr);
        iMqttTokenSubscribe.waitForCompletion(getTimeToWait());
        int[] grantedQos = iMqttTokenSubscribe.getGrantedQos();
        for (int i10 = 0; i10 < grantedQos.length; i10++) {
            iArr[i10] = grantedQos[i10];
        }
        if (grantedQos.length == 1 && iArr[0] == 128) {
            throw new MqttException(128);
        }
    }

    @Override // org.eclipse.paho.client.mqttv3.IMqttClient
    public IMqttToken subscribeWithResponse(String[] strArr, int[] iArr, IMqttMessageListener[] iMqttMessageListenerArr) throws Exception {
        IMqttToken iMqttTokenSubscribe = this.aClient.subscribe(strArr, iArr, (Object) null, (IMqttActionListener) null, iMqttMessageListenerArr);
        iMqttTokenSubscribe.waitForCompletion(getTimeToWait());
        return iMqttTokenSubscribe;
    }
}
