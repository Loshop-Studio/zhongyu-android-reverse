package org.eclipse.paho.client.mqttv3.internal.wire;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;

/* loaded from: classes6.dex */
public class MqttUnsubAck extends MqttAck {
    public MqttUnsubAck(byte b10, byte[] bArr) throws IOException {
        super(MqttWireMessage.MESSAGE_TYPE_UNSUBACK);
        DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(bArr));
        this.msgId = dataInputStream.readUnsignedShort();
        dataInputStream.close();
    }

    @Override // org.eclipse.paho.client.mqttv3.internal.wire.MqttWireMessage
    public byte[] getVariableHeader() {
        return new byte[0];
    }
}
