package com.tendcloud.tenddata;

import com.tendcloud.tenddata.InterfaceC7876bh;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* renamed from: com.tendcloud.tenddata.bi */
/* loaded from: classes5.dex */
public class C7877bi implements InterfaceC7875bg {

    /* renamed from: a_ */
    protected static byte[] f14418a_ = new byte[0];

    /* renamed from: b_ */
    protected boolean f14419b_;

    /* renamed from: c_ */
    protected InterfaceC7876bh.a f14420c_;

    /* renamed from: d_ */
    protected boolean f14421d_;

    /* renamed from: e */
    private ByteBuffer f14422e;

    public C7877bi() {
    }

    @Override // com.tendcloud.tenddata.InterfaceC7876bh
    public void append(InterfaceC7876bh interfaceC7876bh) {
        ByteBuffer byteBufferMo11265c = interfaceC7876bh.mo11265c();
        if (this.f14422e == null) {
            this.f14422e = ByteBuffer.allocate(byteBufferMo11265c.remaining());
            byteBufferMo11265c.mark();
            this.f14422e.put(byteBufferMo11265c);
            byteBufferMo11265c.reset();
        } else {
            byteBufferMo11265c.mark();
            ByteBuffer byteBuffer = this.f14422e;
            byteBuffer.position(byteBuffer.limit());
            ByteBuffer byteBuffer2 = this.f14422e;
            byteBuffer2.limit(byteBuffer2.capacity());
            if (byteBufferMo11265c.remaining() > this.f14422e.remaining()) {
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(byteBufferMo11265c.remaining() + this.f14422e.capacity());
                this.f14422e.flip();
                byteBufferAllocate.put(this.f14422e);
                byteBufferAllocate.put(byteBufferMo11265c);
                this.f14422e = byteBufferAllocate;
            } else {
                this.f14422e.put(byteBufferMo11265c);
            }
            this.f14422e.rewind();
            byteBufferMo11265c.reset();
        }
        this.f14419b_ = interfaceC7876bh.mo11266d();
    }

    @Override // com.tendcloud.tenddata.InterfaceC7876bh
    /* renamed from: c */
    public ByteBuffer mo11265c() {
        return this.f14422e;
    }

    @Override // com.tendcloud.tenddata.InterfaceC7876bh
    /* renamed from: d */
    public boolean mo11266d() {
        return this.f14419b_;
    }

    @Override // com.tendcloud.tenddata.InterfaceC7876bh
    /* renamed from: e */
    public boolean mo11267e() {
        return this.f14421d_;
    }

    @Override // com.tendcloud.tenddata.InterfaceC7876bh
    /* renamed from: f */
    public InterfaceC7876bh.a mo11268f() {
        return this.f14420c_;
    }

    @Override // com.tendcloud.tenddata.InterfaceC7875bg
    public void setFin(boolean z10) {
        this.f14419b_ = z10;
    }

    @Override // com.tendcloud.tenddata.InterfaceC7875bg
    public void setOptcode(InterfaceC7876bh.a aVar) {
        this.f14420c_ = aVar;
    }

    @Override // com.tendcloud.tenddata.InterfaceC7875bg
    public void setPayload(ByteBuffer byteBuffer) {
        this.f14422e = byteBuffer;
    }

    @Override // com.tendcloud.tenddata.InterfaceC7875bg
    public void setTransferemasked(boolean z10) {
        this.f14421d_ = z10;
    }

    public String toString() {
        return "Framedata{ optcode:" + mo11268f() + ", fin:" + mo11266d() + ", payloadlength:[pos:" + this.f14422e.position() + ", len:" + this.f14422e.remaining() + "], payload:" + Arrays.toString(C7891bw.m11342a(new String(this.f14422e.array()))) + "}";
    }

    public C7877bi(InterfaceC7876bh.a aVar) {
        this.f14420c_ = aVar;
        this.f14422e = ByteBuffer.wrap(f14418a_);
    }

    public C7877bi(InterfaceC7876bh interfaceC7876bh) {
        this.f14419b_ = interfaceC7876bh.mo11266d();
        this.f14420c_ = interfaceC7876bh.mo11268f();
        this.f14422e = interfaceC7876bh.mo11265c();
        this.f14421d_ = interfaceC7876bh.mo11267e();
    }
}
