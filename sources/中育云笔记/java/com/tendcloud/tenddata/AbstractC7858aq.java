package com.tendcloud.tenddata;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;

/* renamed from: com.tendcloud.tenddata.aq */
/* loaded from: classes5.dex */
public abstract class AbstractC7858aq extends C7848ag {

    /* renamed from: a */
    protected final ByteBuffer f14371a;

    public AbstractC7858aq(ByteChannel byteChannel) {
        super(byteChannel);
        try {
            this.f14371a = ByteBuffer.wrap(m11224e().getBytes("ASCII"));
        } catch (UnsupportedEncodingException e10) {
            throw new RuntimeException(e10);
        }
    }

    /* renamed from: e */
    public abstract String m11224e();

    @Override // com.tendcloud.tenddata.C7848ag, java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) {
        return !this.f14371a.hasRemaining() ? super.write(byteBuffer) : super.write(this.f14371a);
    }
}
