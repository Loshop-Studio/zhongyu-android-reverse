package org.eclipse.paho.client.mqttv3.internal.wire;

/* loaded from: classes6.dex */
public class MultiByteInteger {
    private int length;
    private int value;

    public MultiByteInteger(int i10) {
        this(i10, -1);
    }

    public int getEncodedLength() {
        return this.length;
    }

    public int getValue() {
        return this.value;
    }

    public MultiByteInteger(int i10, int i11) {
        this.value = i10;
        this.length = i11;
    }
}
