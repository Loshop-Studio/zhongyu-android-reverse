package org.eclipse.paho.client.mqttv3.internal.wire;

import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes6.dex */
public class CountingInputStream extends InputStream {
    private int counter = 0;

    /* renamed from: in */
    private InputStream f25510in;

    public CountingInputStream(InputStream inputStream) {
        this.f25510in = inputStream;
    }

    public int getCounter() {
        return this.counter;
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        int i10 = this.f25510in.read();
        if (i10 != -1) {
            this.counter++;
        }
        return i10;
    }

    public void resetCounter() {
        this.counter = 0;
    }
}
