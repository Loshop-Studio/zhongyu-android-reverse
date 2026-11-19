package org.eclipse.paho.client.mqttv3.internal.wire;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;

/* loaded from: classes6.dex */
public class MqttPubAck extends MqttAck {
    public MqttPubAck(byte b10, byte[] bArr) throws IOException {
        super((byte) 4);
        DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(bArr));
        this.msgId = dataInputStream.readUnsignedShort();
        dataInputStream.close();
    }

    @Override // org.eclipse.paho.client.mqttv3.internal.wire.MqttWireMessage
    public byte[] getVariableHeader() {
        return encodeMessageId();
    }

    public MqttPubAck(MqttPublish mqttPublish) {
        super((byte) 4);
        this.msgId = mqttPublish.getMessageId();
    }

    public MqttPubAck(int i10) {
        super((byte) 4);
        this.msgId = i10;
    }
}
