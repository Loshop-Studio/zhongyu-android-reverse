package com.tendcloud.tenddata;

import com.tendcloud.tenddata.InterfaceC7876bh;
import java.nio.ByteBuffer;

/* renamed from: com.tendcloud.tenddata.bf */
/* loaded from: classes5.dex */
public class C7874bf extends C7877bi implements InterfaceC7873be {

    /* renamed from: p */
    static final ByteBuffer f14415p = ByteBuffer.allocate(0);

    /* renamed from: q */
    private int f14416q;

    /* renamed from: r */
    private String f14417r;

    public C7874bf() {
        super(InterfaceC7876bh.a.CLOSING);
        setFin(true);
    }

    /* renamed from: a */
    private void m11262a(int i10, String str) throws C7866ay {
        String str2 = "";
        if (str == null) {
            str = "";
        }
        if (i10 == 1015) {
            i10 = 1005;
        } else {
            str2 = str;
        }
        if (i10 == 1005) {
            if (str2.length() > 0) {
                throw new C7866ay(1002, "A close frame must have a closecode if it has a reason");
            }
            return;
        }
        byte[] bArrM11342a = C7891bw.m11342a(str2);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
        byteBufferAllocate.putInt(i10);
        byteBufferAllocate.position(2);
        ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(bArrM11342a.length + 2);
        byteBufferAllocate2.put(byteBufferAllocate);
        byteBufferAllocate2.put(bArrM11342a);
        byteBufferAllocate2.rewind();
        setPayload(byteBufferAllocate2);
    }

    /* renamed from: g */
    private void m11263g() throws C7867az {
        this.f14416q = InterfaceC7873be.f14404e;
        ByteBuffer byteBufferMo11265c = super.mo11265c();
        byteBufferMo11265c.mark();
        if (byteBufferMo11265c.remaining() >= 2) {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
            byteBufferAllocate.position(2);
            byteBufferAllocate.putShort(byteBufferMo11265c.getShort());
            byteBufferAllocate.position(0);
            int i10 = byteBufferAllocate.getInt();
            this.f14416q = i10;
            if (i10 == 1006 || i10 == 1015 || i10 == 1005 || i10 > 4999 || i10 < 1000 || i10 == 1004) {
                throw new C7867az("closecode must not be sent over the wire: " + this.f14416q);
            }
        }
        byteBufferMo11265c.reset();
    }

    /* renamed from: h */
    private void m11264h() {
        if (this.f14416q == 1005) {
            this.f14417r = C7891bw.m11339a(super.mo11265c());
            return;
        }
        ByteBuffer byteBufferMo11265c = super.mo11265c();
        int iPosition = byteBufferMo11265c.position();
        try {
            try {
                byteBufferMo11265c.position(byteBufferMo11265c.position() + 2);
                this.f14417r = C7891bw.m11339a(byteBufferMo11265c);
            } catch (IllegalArgumentException e10) {
                throw new C7867az(e10);
            }
        } finally {
            byteBufferMo11265c.position(iPosition);
        }
    }

    @Override // com.tendcloud.tenddata.InterfaceC7873be
    /* renamed from: b */
    public String mo11261b() {
        return this.f14417r;
    }

    @Override // com.tendcloud.tenddata.C7877bi, com.tendcloud.tenddata.InterfaceC7876bh
    /* renamed from: c */
    public ByteBuffer mo11265c() {
        return this.f14416q == 1005 ? f14415p : super.mo11265c();
    }

    @Override // com.tendcloud.tenddata.C7877bi, com.tendcloud.tenddata.InterfaceC7875bg
    public void setPayload(ByteBuffer byteBuffer) throws C7867az {
        super.setPayload(byteBuffer);
        m11263g();
        m11264h();
    }

    @Override // com.tendcloud.tenddata.C7877bi
    public String toString() {
        return super.toString() + "code: " + this.f14416q;
    }

    public C7874bf(int i10) throws C7866ay {
        super(InterfaceC7876bh.a.CLOSING);
        setFin(true);
        m11262a(i10, "");
    }

    public C7874bf(int i10, String str) throws C7866ay {
        super(InterfaceC7876bh.a.CLOSING);
        setFin(true);
        m11262a(i10, str);
    }

    @Override // com.tendcloud.tenddata.InterfaceC7873be
    /* renamed from: a */
    public int mo11260a() {
        return this.f14416q;
    }
}
