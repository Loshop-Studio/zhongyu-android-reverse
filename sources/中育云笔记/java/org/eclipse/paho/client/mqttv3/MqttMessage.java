package org.eclipse.paho.client.mqttv3;

/* loaded from: classes6.dex */
public class MqttMessage {
    private int messageId;
    private byte[] payload;
    private boolean mutable = true;
    private int qos = 1;
    private boolean retained = false;
    private boolean dup = false;

    public MqttMessage() {
        setPayload(new byte[0]);
    }

    public static void validateQos(int i10) {
        if (i10 < 0 || i10 > 2) {
            throw new IllegalArgumentException();
        }
    }

    public void checkMutable() {
        if (!this.mutable) {
            throw new IllegalStateException();
        }
    }

    public void clearPayload() {
        checkMutable();
        this.payload = new byte[0];
    }

    public int getId() {
        return this.messageId;
    }

    public byte[] getPayload() {
        return this.payload;
    }

    public int getQos() {
        return this.qos;
    }

    public boolean isDuplicate() {
        return this.dup;
    }

    public boolean isRetained() {
        return this.retained;
    }

    public void setDuplicate(boolean z10) {
        this.dup = z10;
    }

    public void setId(int i10) {
        this.messageId = i10;
    }

    public void setMutable(boolean z10) {
        this.mutable = z10;
    }

    public void setPayload(byte[] bArr) {
        checkMutable();
        bArr.getClass();
        this.payload = (byte[]) bArr.clone();
    }

    public void setQos(int i10) {
        checkMutable();
        validateQos(i10);
        this.qos = i10;
    }

    public void setRetained(boolean z10) {
        checkMutable();
        this.retained = z10;
    }

    public String toString() {
        return new String(this.payload);
    }

    public MqttMessage(byte[] bArr) {
        setPayload(bArr);
    }
}
