package org.eclipse.paho.client.mqttv3;

/* loaded from: classes6.dex */
public interface IMqttAsyncClient extends AutoCloseable {
    @Override // java.lang.AutoCloseable
    void close();

    IMqttToken connect();

    IMqttToken connect(Object obj, IMqttActionListener iMqttActionListener);

    IMqttToken connect(MqttConnectOptions mqttConnectOptions);

    IMqttToken connect(MqttConnectOptions mqttConnectOptions, Object obj, IMqttActionListener iMqttActionListener);

    void deleteBufferedMessage(int i10);

    IMqttToken disconnect();

    IMqttToken disconnect(long j10);

    IMqttToken disconnect(long j10, Object obj, IMqttActionListener iMqttActionListener);

    IMqttToken disconnect(Object obj, IMqttActionListener iMqttActionListener);

    void disconnectForcibly();

    void disconnectForcibly(long j10);

    void disconnectForcibly(long j10, long j11);

    MqttMessage getBufferedMessage(int i10);

    int getBufferedMessageCount();

    String getClientId();

    int getInFlightMessageCount();

    IMqttDeliveryToken[] getPendingDeliveryTokens();

    String getServerURI();

    boolean isConnected();

    void messageArrivedComplete(int i10, int i11);

    IMqttDeliveryToken publish(String str, MqttMessage mqttMessage);

    IMqttDeliveryToken publish(String str, MqttMessage mqttMessage, Object obj, IMqttActionListener iMqttActionListener);

    IMqttDeliveryToken publish(String str, byte[] bArr, int i10, boolean z10);

    IMqttDeliveryToken publish(String str, byte[] bArr, int i10, boolean z10, Object obj, IMqttActionListener iMqttActionListener);

    void reconnect();

    boolean removeMessage(IMqttDeliveryToken iMqttDeliveryToken);

    void setBufferOpts(DisconnectedBufferOptions disconnectedBufferOptions);

    void setCallback(MqttCallback mqttCallback);

    void setManualAcks(boolean z10);

    IMqttToken subscribe(String str, int i10);

    IMqttToken subscribe(String str, int i10, Object obj, IMqttActionListener iMqttActionListener);

    IMqttToken subscribe(String str, int i10, Object obj, IMqttActionListener iMqttActionListener, IMqttMessageListener iMqttMessageListener);

    IMqttToken subscribe(String str, int i10, IMqttMessageListener iMqttMessageListener);

    IMqttToken subscribe(String[] strArr, int[] iArr);

    IMqttToken subscribe(String[] strArr, int[] iArr, Object obj, IMqttActionListener iMqttActionListener);

    IMqttToken subscribe(String[] strArr, int[] iArr, Object obj, IMqttActionListener iMqttActionListener, IMqttMessageListener[] iMqttMessageListenerArr);

    IMqttToken subscribe(String[] strArr, int[] iArr, IMqttMessageListener[] iMqttMessageListenerArr);

    IMqttToken unsubscribe(String str);

    IMqttToken unsubscribe(String str, Object obj, IMqttActionListener iMqttActionListener);

    IMqttToken unsubscribe(String[] strArr);

    IMqttToken unsubscribe(String[] strArr, Object obj, IMqttActionListener iMqttActionListener);
}
