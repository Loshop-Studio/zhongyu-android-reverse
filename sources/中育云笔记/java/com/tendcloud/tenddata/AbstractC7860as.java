package com.tendcloud.tenddata;

import com.tendcloud.tenddata.InterfaceC7851aj;
import com.tendcloud.tenddata.InterfaceC7876bh;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* renamed from: com.tendcloud.tenddata.as */
/* loaded from: classes5.dex */
public abstract class AbstractC7860as {

    /* renamed from: a */
    public static int f14372a = 1000;

    /* renamed from: b */
    public static int f14373b = 64;

    /* renamed from: c */
    public static final byte[] f14374c = C7891bw.m11342a("<policy-file-request/>\u0000");

    /* renamed from: d */
    protected InterfaceC7851aj.b f14375d = null;

    /* renamed from: e */
    protected InterfaceC7876bh.a f14376e = null;

    /* renamed from: com.tendcloud.tenddata.as$a */
    public enum a {
        NONE,
        ONEWAY,
        TWOWAY
    }

    /* renamed from: com.tendcloud.tenddata.as$b */
    public enum b {
        MATCHED,
        NOT_MATCHED
    }

    /* renamed from: a */
    public static ByteBuffer m11226a(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(byteBuffer.remaining());
        byte b10 = 48;
        while (byteBuffer.hasRemaining()) {
            byte b11 = byteBuffer.get();
            byteBufferAllocate.put(b11);
            if (b10 == 13 && b11 == 10) {
                byteBufferAllocate.limit(byteBufferAllocate.position() - 2);
                byteBufferAllocate.position(0);
                return byteBufferAllocate;
            }
            b10 = b11;
        }
        byteBuffer.position(byteBuffer.position() - byteBufferAllocate.position());
        return null;
    }

    /* renamed from: b */
    public static String m11227b(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferM11226a = m11226a(byteBuffer);
        if (byteBufferM11226a == null) {
            return null;
        }
        return C7891bw.m11341a(byteBufferM11226a.array(), 0, byteBufferM11226a.limit());
    }

    /* renamed from: a */
    public abstract b mo11229a(InterfaceC7878bj interfaceC7878bj);

    /* renamed from: a */
    public abstract b mo11230a(InterfaceC7878bj interfaceC7878bj, InterfaceC7885bq interfaceC7885bq);

    /* renamed from: a */
    public abstract InterfaceC7879bk mo11231a(InterfaceC7879bk interfaceC7879bk);

    /* renamed from: a */
    public abstract InterfaceC7880bl mo11232a(InterfaceC7878bj interfaceC7878bj, InterfaceC7886br interfaceC7886br);

    /* renamed from: a */
    public abstract ByteBuffer mo11233a(InterfaceC7876bh interfaceC7876bh);

    /* renamed from: a */
    public abstract List<InterfaceC7876bh> mo11237a(String str, boolean z10);

    /* renamed from: a */
    public abstract List<InterfaceC7876bh> mo11238a(ByteBuffer byteBuffer, boolean z10);

    /* renamed from: a */
    public abstract void mo11239a();

    /* renamed from: b */
    public abstract a mo11241b();

    /* renamed from: c */
    public abstract AbstractC7860as mo11242c();

    /* renamed from: c */
    public abstract List<InterfaceC7876bh> mo11243c(ByteBuffer byteBuffer);

    /* renamed from: d */
    public InterfaceC7883bo mo11245d(ByteBuffer byteBuffer) {
        return m11225a(byteBuffer, this.f14375d);
    }

    public void setParseMode(InterfaceC7851aj.b bVar) {
        this.f14375d = bVar;
    }

    /* renamed from: d */
    public InterfaceC7851aj.b m11244d() {
        return this.f14375d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v5, types: [com.tendcloud.tenddata.bn, com.tendcloud.tenddata.br] */
    /* renamed from: a */
    public static InterfaceC7880bl m11225a(ByteBuffer byteBuffer, InterfaceC7851aj.b bVar) throws C7869ba {
        C7881bm c7881bm;
        String strM11227b = m11227b(byteBuffer);
        if (strM11227b != null) {
            String[] strArrSplit = strM11227b.split(" ", 3);
            if (strArrSplit.length == 3) {
                if (bVar == InterfaceC7851aj.b.CLIENT) {
                    ?? c7882bn = new C7882bn();
                    c7882bn.setHttpStatus(Short.parseShort(strArrSplit[1]));
                    c7882bn.setHttpStatusMessage(strArrSplit[2]);
                    c7881bm = c7882bn;
                } else {
                    C7881bm c7881bm2 = new C7881bm();
                    c7881bm2.setResourceDescriptor(strArrSplit[1]);
                    c7881bm = c7881bm2;
                }
                String strM11227b2 = m11227b(byteBuffer);
                while (strM11227b2 != null && strM11227b2.length() > 0) {
                    String[] strArrSplit2 = strM11227b2.split(":", 2);
                    if (strArrSplit2.length == 2) {
                        c7881bm.mo11270a(strArrSplit2[0], strArrSplit2[1].replaceFirst("^ +", ""));
                        strM11227b2 = m11227b(byteBuffer);
                    } else {
                        throw new C7869ba("not an http header");
                    }
                }
                if (strM11227b2 != null) {
                    return c7881bm;
                }
                throw new C7865ax();
            }
            throw new C7869ba();
        }
        throw new C7865ax(byteBuffer.capacity() + 128);
    }

    /* renamed from: a */
    public boolean m11240a(InterfaceC7883bo interfaceC7883bo) {
        return interfaceC7883bo.mo11273a("Upgrade").equalsIgnoreCase("websocket") && interfaceC7883bo.mo11273a("Connection").toLowerCase(Locale.ENGLISH).contains("upgrade");
    }

    /* renamed from: a */
    public List<InterfaceC7876bh> m11234a(InterfaceC7876bh.a aVar, ByteBuffer byteBuffer, boolean z10) {
        InterfaceC7876bh.a aVar2;
        if (aVar != InterfaceC7876bh.a.BINARY && aVar != (aVar2 = InterfaceC7876bh.a.TEXT) && aVar != aVar2) {
            throw new IllegalArgumentException("Only Opcode.BINARY or  Opcode.TEXT are allowed");
        }
        if (this.f14376e != null) {
            this.f14376e = InterfaceC7876bh.a.CONTINUOUS;
        } else {
            this.f14376e = aVar;
        }
        C7877bi c7877bi = new C7877bi(this.f14376e);
        try {
            c7877bi.setPayload(byteBuffer);
            c7877bi.setFin(z10);
            if (z10) {
                this.f14376e = null;
            } else {
                this.f14376e = aVar;
            }
            return Collections.singletonList(c7877bi);
        } catch (C7866ay e10) {
            throw new RuntimeException(e10);
        }
    }

    /* renamed from: a */
    public List<ByteBuffer> m11235a(InterfaceC7883bo interfaceC7883bo, InterfaceC7851aj.b bVar) {
        return m11236a(interfaceC7883bo, bVar, true);
    }

    /* renamed from: a */
    public List<ByteBuffer> m11236a(InterfaceC7883bo interfaceC7883bo, InterfaceC7851aj.b bVar, boolean z10) {
        StringBuilder sb2 = new StringBuilder(100);
        if (interfaceC7883bo instanceof InterfaceC7878bj) {
            sb2.append("GET ");
            sb2.append(((InterfaceC7878bj) interfaceC7883bo).mo11269a());
            sb2.append(" HTTP/1.1");
        } else if (interfaceC7883bo instanceof InterfaceC7885bq) {
            sb2.append("HTTP/1.1 101 " + ((InterfaceC7885bq) interfaceC7883bo).mo11271a());
        } else {
            throw new RuntimeException("unknow role");
        }
        sb2.append("\r\n");
        Iterator<String> itMo11275c = interfaceC7883bo.mo11275c();
        while (itMo11275c.hasNext()) {
            String next = itMo11275c.next();
            String strMo11273a = interfaceC7883bo.mo11273a(next);
            sb2.append(next);
            sb2.append(": ");
            sb2.append(strMo11273a);
            sb2.append("\r\n");
        }
        sb2.append("\r\n");
        byte[] bArrM11344b = C7891bw.m11344b(sb2.toString());
        byte[] bArrMo11276d = z10 ? interfaceC7883bo.mo11276d() : null;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate((bArrMo11276d == null ? 0 : bArrMo11276d.length) + bArrM11344b.length);
        byteBufferAllocate.put(bArrM11344b);
        if (bArrMo11276d != null) {
            byteBufferAllocate.put(bArrMo11276d);
        }
        byteBufferAllocate.flip();
        return Collections.singletonList(byteBufferAllocate);
    }

    /* renamed from: a */
    public int m11228a(int i10) throws C7866ay {
        if (i10 >= 0) {
            return i10;
        }
        throw new C7866ay(1002, "Negative count");
    }
}
