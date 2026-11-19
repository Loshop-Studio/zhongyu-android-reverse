package org.eclipse.paho.client.mqttv3.internal.wire;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;

/* loaded from: classes6.dex */
public class MqttSuback extends MqttAck {
    private int[] grantedQos;

    public MqttSuback(byte b10, byte[] bArr) throws IOException {
        super((byte) 9);
        DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(bArr));
        this.msgId = dataInputStream.readUnsignedShort();
        this.grantedQos = new int[bArr.length - 2];
        int i10 = 0;
        for (int i11 = dataInputStream.read(); i11 != -1; i11 = dataInputStream.read()) {
            this.grantedQos[i10] = i11;
            i10++;
        }
        dataInputStream.close();
    }

    public int[] getGrantedQos() {
        return this.grantedQos;
    }

    @Override // org.eclipse.paho.client.mqttv3.internal.wire.MqttWireMessage
    public byte[] getVariableHeader() {
        return new byte[0];
    }

    @Override // org.eclipse.paho.client.mqttv3.internal.wire.MqttAck, org.eclipse.paho.client.mqttv3.internal.wire.MqttWireMessage
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(super.toString());
        stringBuffer.append(" granted Qos");
        for (int i10 : this.grantedQos) {
            stringBuffer.append(" ");
            stringBuffer.append(i10);
        }
        return stringBuffer.toString();
    }
}
