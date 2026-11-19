package org.eclipse.paho.client.mqttv3.internal.wire;

import org.eclipse.paho.client.mqttv3.MqttException;
import org.eclipse.paho.client.mqttv3.MqttPersistable;
import org.eclipse.paho.client.mqttv3.MqttPersistenceException;

/* loaded from: classes6.dex */
public abstract class MqttPersistableWireMessage extends MqttWireMessage implements MqttPersistable {
    public MqttPersistableWireMessage(byte b10) {
        super(b10);
    }

    @Override // org.eclipse.paho.client.mqttv3.MqttPersistable
    public byte[] getHeaderBytes() throws MqttPersistenceException {
        try {
            return getHeader();
        } catch (MqttException e10) {
            throw new MqttPersistenceException(e10.getCause());
        }
    }

    @Override // org.eclipse.paho.client.mqttv3.MqttPersistable
    public int getHeaderLength() {
        return getHeaderBytes().length;
    }

    @Override // org.eclipse.paho.client.mqttv3.MqttPersistable
    public int getHeaderOffset() {
        return 0;
    }

    @Override // org.eclipse.paho.client.mqttv3.MqttPersistable
    public byte[] getPayloadBytes() throws MqttPersistenceException {
        try {
            return getPayload();
        } catch (MqttException e10) {
            throw new MqttPersistenceException(e10.getCause());
        }
    }

    @Override // org.eclipse.paho.client.mqttv3.MqttPersistable
    public int getPayloadLength() {
        return 0;
    }

    @Override // org.eclipse.paho.client.mqttv3.MqttPersistable
    public int getPayloadOffset() {
        return 0;
    }
}
