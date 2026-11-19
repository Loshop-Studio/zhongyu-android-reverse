package org.eclipse.paho.client.mqttv3;

/* loaded from: classes6.dex */
public interface IMqttClient extends AutoCloseable {
    @Override // java.lang.AutoCloseable
    void close();

    void connect();

    void connect(MqttConnectOptions mqttConnectOptions);

    IMqttToken connectWithResult(MqttConnectOptions mqttConnectOptions);

    void disconnect();

    void disconnect(long j10);

    void disconnectForcibly();

    void disconnectForcibly(long j10);

    void disconnectForcibly(long j10, long j11);

    String getClientId();

    IMqttDeliveryToken[] getPendingDeliveryTokens();

    String getServerURI();

    MqttTopic getTopic(String str);

    boolean isConnected();

    void messageArrivedComplete(int i10, int i11);

    void publish(String str, MqttMessage mqttMessage);

    void publish(String str, byte[] bArr, int i10, boolean z10);

    void reconnect();

    void setCallback(MqttCallback mqttCallback);

    void setManualAcks(boolean z10);

    void subscribe(String str);

    void subscribe(String str, int i10);

    void subscribe(String str, int i10, IMqttMessageListener iMqttMessageListener);

    void subscribe(String str, IMqttMessageListener iMqttMessageListener);

    void subscribe(String[] strArr);

    void subscribe(String[] strArr, int[] iArr);

    void subscribe(String[] strArr, int[] iArr, IMqttMessageListener[] iMqttMessageListenerArr);

    void subscribe(String[] strArr, IMqttMessageListener[] iMqttMessageListenerArr);

    IMqttToken subscribeWithResponse(String str);

    IMqttToken subscribeWithResponse(String str, int i10);

    IMqttToken subscribeWithResponse(String str, int i10, IMqttMessageListener iMqttMessageListener);

    IMqttToken subscribeWithResponse(String str, IMqttMessageListener iMqttMessageListener);

    IMqttToken subscribeWithResponse(String[] strArr);

    IMqttToken subscribeWithResponse(String[] strArr, int[] iArr);

    IMqttToken subscribeWithResponse(String[] strArr, int[] iArr, IMqttMessageListener[] iMqttMessageListenerArr);

    IMqttToken subscribeWithResponse(String[] strArr, IMqttMessageListener[] iMqttMessageListenerArr);

    void unsubscribe(String str);

    void unsubscribe(String[] strArr);
}
