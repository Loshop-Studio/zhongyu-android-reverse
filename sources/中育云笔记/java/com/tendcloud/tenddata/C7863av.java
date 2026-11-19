package com.tendcloud.tenddata;

import com.tendcloud.tenddata.AbstractC7860as;
import com.tendcloud.tenddata.InterfaceC7876bh;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/* renamed from: com.tendcloud.tenddata.av */
/* loaded from: classes5.dex */
public class C7863av extends AbstractC7860as {

    /* renamed from: f */
    public static final byte f14381f = 13;

    /* renamed from: g */
    public static final byte f14382g = 10;

    /* renamed from: h */
    public static final byte f14383h = 0;

    /* renamed from: i */
    public static final byte f14384i = -1;

    /* renamed from: l */
    protected ByteBuffer f14387l;

    /* renamed from: j */
    protected boolean f14385j = false;

    /* renamed from: k */
    protected List<InterfaceC7876bh> f14386k = new LinkedList();

    /* renamed from: m */
    private final Random f14388m = new Random();

    @Override // com.tendcloud.tenddata.AbstractC7860as
    /* renamed from: a */
    public AbstractC7860as.b mo11230a(InterfaceC7878bj interfaceC7878bj, InterfaceC7885bq interfaceC7885bq) {
        return (interfaceC7878bj.mo11273a("WebSocket-Origin").equals(interfaceC7885bq.mo11273a("Origin")) && m11240a(interfaceC7885bq)) ? AbstractC7860as.b.MATCHED : AbstractC7860as.b.NOT_MATCHED;
    }

    @Override // com.tendcloud.tenddata.AbstractC7860as
    /* renamed from: b */
    public AbstractC7860as.a mo11241b() {
        return AbstractC7860as.a.NONE;
    }

    @Override // com.tendcloud.tenddata.AbstractC7860as
    /* renamed from: c */
    public List<InterfaceC7876bh> mo11243c(ByteBuffer byteBuffer) throws C7866ay {
        List<InterfaceC7876bh> listM11253e = m11253e(byteBuffer);
        if (listM11253e != null) {
            return listM11253e;
        }
        throw new C7866ay(1002);
    }

    /* renamed from: e */
    public List<InterfaceC7876bh> m11253e(ByteBuffer byteBuffer) throws C7867az {
        while (byteBuffer.hasRemaining()) {
            byte b10 = byteBuffer.get();
            if (b10 == 0) {
                if (this.f14385j) {
                    throw new C7867az("unexpected START_OF_FRAME");
                }
                this.f14385j = true;
            } else if (b10 == -1) {
                if (!this.f14385j) {
                    throw new C7867az("unexpected END_OF_FRAME");
                }
                ByteBuffer byteBuffer2 = this.f14387l;
                if (byteBuffer2 != null) {
                    byteBuffer2.flip();
                    C7877bi c7877bi = new C7877bi();
                    c7877bi.setPayload(this.f14387l);
                    c7877bi.setFin(true);
                    c7877bi.setOptcode(InterfaceC7876bh.a.TEXT);
                    this.f14386k.add(c7877bi);
                    this.f14387l = null;
                    byteBuffer.mark();
                }
                this.f14385j = false;
            } else {
                if (!this.f14385j) {
                    return null;
                }
                ByteBuffer byteBuffer3 = this.f14387l;
                if (byteBuffer3 == null) {
                    this.f14387l = m11252e();
                } else if (!byteBuffer3.hasRemaining()) {
                    this.f14387l = m11254f(this.f14387l);
                }
                this.f14387l.put(b10);
            }
        }
        List<InterfaceC7876bh> list = this.f14386k;
        this.f14386k = new LinkedList();
        return list;
    }

    /* renamed from: f */
    public ByteBuffer m11254f(ByteBuffer byteBuffer) {
        byteBuffer.flip();
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(m11228a(byteBuffer.capacity() * 2));
        byteBufferAllocate.put(byteBuffer);
        return byteBufferAllocate;
    }

    @Override // com.tendcloud.tenddata.AbstractC7860as
    /* renamed from: a */
    public AbstractC7860as.b mo11229a(InterfaceC7878bj interfaceC7878bj) {
        return (interfaceC7878bj.mo11274b("Origin") && m11240a((InterfaceC7883bo) interfaceC7878bj)) ? AbstractC7860as.b.MATCHED : AbstractC7860as.b.NOT_MATCHED;
    }

    @Override // com.tendcloud.tenddata.AbstractC7860as
    /* renamed from: c */
    public AbstractC7860as mo11242c() {
        return new C7863av();
    }

    @Override // com.tendcloud.tenddata.AbstractC7860as
    /* renamed from: a */
    public ByteBuffer mo11233a(InterfaceC7876bh interfaceC7876bh) {
        if (interfaceC7876bh.mo11268f() == InterfaceC7876bh.a.TEXT) {
            ByteBuffer byteBufferMo11265c = interfaceC7876bh.mo11265c();
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(byteBufferMo11265c.remaining() + 2);
            byteBufferAllocate.put((byte) 0);
            byteBufferMo11265c.mark();
            byteBufferAllocate.put(byteBufferMo11265c);
            byteBufferMo11265c.reset();
            byteBufferAllocate.put((byte) -1);
            byteBufferAllocate.flip();
            return byteBufferAllocate;
        }
        throw new RuntimeException("only text frames supported");
    }

    @Override // com.tendcloud.tenddata.AbstractC7860as
    /* renamed from: a */
    public List<InterfaceC7876bh> mo11238a(ByteBuffer byteBuffer, boolean z10) {
        throw new RuntimeException("not yet implemented");
    }

    @Override // com.tendcloud.tenddata.AbstractC7860as
    /* renamed from: a */
    public List<InterfaceC7876bh> mo11237a(String str, boolean z10) {
        C7877bi c7877bi = new C7877bi();
        try {
            c7877bi.setPayload(ByteBuffer.wrap(C7891bw.m11342a(str)));
            c7877bi.setFin(true);
            c7877bi.setOptcode(InterfaceC7876bh.a.TEXT);
            c7877bi.setTransferemasked(z10);
            return Collections.singletonList(c7877bi);
        } catch (C7866ay e10) {
            throw new C7871bc(e10);
        }
    }

    @Override // com.tendcloud.tenddata.AbstractC7860as
    /* renamed from: a */
    public InterfaceC7879bk mo11231a(InterfaceC7879bk interfaceC7879bk) {
        interfaceC7879bk.mo11270a("Upgrade", "WebSocket");
        interfaceC7879bk.mo11270a("Connection", "Upgrade");
        if (!interfaceC7879bk.mo11274b("Origin")) {
            interfaceC7879bk.mo11270a("Origin", "random" + this.f14388m.nextInt());
        }
        return interfaceC7879bk;
    }

    /* renamed from: e */
    public ByteBuffer m11252e() {
        return ByteBuffer.allocate(AbstractC7860as.f14373b);
    }

    @Override // com.tendcloud.tenddata.AbstractC7860as
    /* renamed from: a */
    public InterfaceC7880bl mo11232a(InterfaceC7878bj interfaceC7878bj, InterfaceC7886br interfaceC7886br) {
        interfaceC7886br.setHttpStatusMessage("Web Socket Protocol Handshake");
        interfaceC7886br.mo11270a("Upgrade", "WebSocket");
        interfaceC7886br.mo11270a("Connection", interfaceC7878bj.mo11273a("Connection"));
        interfaceC7886br.mo11270a("WebSocket-Origin", interfaceC7878bj.mo11273a("Origin"));
        interfaceC7886br.mo11270a("WebSocket-Location", "ws://" + interfaceC7878bj.mo11273a("Host") + interfaceC7878bj.mo11269a());
        return interfaceC7886br;
    }

    @Override // com.tendcloud.tenddata.AbstractC7860as
    /* renamed from: a */
    public void mo11239a() {
        this.f14385j = false;
        this.f14387l = null;
    }
}
