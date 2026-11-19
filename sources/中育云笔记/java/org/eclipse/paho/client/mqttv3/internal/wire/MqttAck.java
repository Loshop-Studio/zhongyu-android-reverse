package org.eclipse.paho.client.mqttv3.internal.wire;

/* loaded from: classes6.dex */
public abstract class MqttAck extends MqttWireMessage {
    public MqttAck(byte b10) {
        super(b10);
    }

    @Override // org.eclipse.paho.client.mqttv3.internal.wire.MqttWireMessage
    public byte getMessageInfo() {
        return (byte) 0;
    }

    @Override // org.eclipse.paho.client.mqttv3.internal.wire.MqttWireMessage
    public String toString() {
        return String.valueOf(super.toString()) + " msgId " + this.msgId;
    }
}
