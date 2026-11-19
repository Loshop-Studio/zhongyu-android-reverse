package com.tendcloud.tenddata;

import android.annotation.SuppressLint;
import androidx.collection.SieveCacheKt;
import com.tendcloud.tenddata.AbstractC7860as;
import com.tendcloud.tenddata.InterfaceC7851aj;
import com.tendcloud.tenddata.InterfaceC7876bh;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

@SuppressLint({"Assert", "UseValueOf"})
/* renamed from: com.tendcloud.tenddata.at */
/* loaded from: classes5.dex */
public class C7861at extends AbstractC7860as {

    /* renamed from: f */
    static final /* synthetic */ boolean f14377f = true;

    /* renamed from: g */
    private ByteBuffer f14378g;

    /* renamed from: h */
    private InterfaceC7876bh f14379h = null;

    /* renamed from: i */
    private final Random f14380i = new Random();

    /* renamed from: com.tendcloud.tenddata.at$a */
    public class a extends Throwable {
        private static final long serialVersionUID = 7330519489840500997L;
        private int preferedsize;

        public a(int i10) {
            this.preferedsize = i10;
        }

        public int getPreferedSize() {
            return this.preferedsize;
        }
    }

    /* renamed from: b */
    public static int m11250b(InterfaceC7883bo interfaceC7883bo) {
        String strMo11273a = interfaceC7883bo.mo11273a("Sec-WebSocket-Version");
        if (strMo11273a.length() > 0) {
            try {
                return new Integer(strMo11273a.trim()).intValue();
            } catch (NumberFormatException unused) {
            }
        }
        return -1;
    }

    @Override // com.tendcloud.tenddata.AbstractC7860as
    /* renamed from: a */
    public AbstractC7860as.b mo11230a(InterfaceC7878bj interfaceC7878bj, InterfaceC7885bq interfaceC7885bq) {
        if (interfaceC7878bj.mo11274b("Sec-WebSocket-Key") && interfaceC7885bq.mo11274b("Sec-WebSocket-Accept")) {
            return m11248a(interfaceC7878bj.mo11273a("Sec-WebSocket-Key")).equals(interfaceC7885bq.mo11273a("Sec-WebSocket-Accept")) ? AbstractC7860as.b.MATCHED : AbstractC7860as.b.NOT_MATCHED;
        }
        return AbstractC7860as.b.NOT_MATCHED;
    }

    @Override // com.tendcloud.tenddata.AbstractC7860as
    /* renamed from: c */
    public List<InterfaceC7876bh> mo11243c(ByteBuffer byteBuffer) {
        LinkedList linkedList = new LinkedList();
        if (this.f14378g != null) {
            try {
                byteBuffer.mark();
                int iRemaining = byteBuffer.remaining();
                int iRemaining2 = this.f14378g.remaining();
                if (iRemaining2 > iRemaining) {
                    this.f14378g.put(byteBuffer.array(), byteBuffer.position(), iRemaining);
                    byteBuffer.position(byteBuffer.position() + iRemaining);
                    return Collections.EMPTY_LIST;
                }
                this.f14378g.put(byteBuffer.array(), byteBuffer.position(), iRemaining2);
                byteBuffer.position(byteBuffer.position() + iRemaining2);
                linkedList.add(m11251e((ByteBuffer) this.f14378g.duplicate().position(0)));
                this.f14378g = null;
            } catch (a e10) {
                this.f14378g.limit();
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(m11228a(e10.getPreferedSize()));
                if (!f14377f && byteBufferAllocate.limit() <= this.f14378g.limit()) {
                    throw new AssertionError();
                }
                this.f14378g.rewind();
                byteBufferAllocate.put(this.f14378g);
                this.f14378g = byteBufferAllocate;
                return mo11243c(byteBuffer);
            }
        }
        while (byteBuffer.hasRemaining()) {
            byteBuffer.mark();
            try {
                linkedList.add(m11251e(byteBuffer));
            } catch (a e11) {
                byteBuffer.reset();
                ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(m11228a(e11.getPreferedSize()));
                this.f14378g = byteBufferAllocate2;
                byteBufferAllocate2.put(byteBuffer);
            }
        }
        return linkedList;
    }

    /* renamed from: e */
    public InterfaceC7876bh m11251e(ByteBuffer byteBuffer) throws a, C7867az, C7870bb {
        InterfaceC7875bg c7877bi;
        int iRemaining = byteBuffer.remaining();
        int i10 = 2;
        if (iRemaining < 2) {
            throw new a(2);
        }
        byte b10 = byteBuffer.get();
        boolean z10 = (b10 >> 8) != 0;
        byte b11 = (byte) ((b10 & 127) >> 4);
        if (b11 != 0) {
            throw new C7867az("bad rsv " + ((int) b11));
        }
        byte b12 = byteBuffer.get();
        boolean z11 = (b12 & (-128)) != 0;
        int iIntValue = (byte) (b12 & 127);
        InterfaceC7876bh.a aVarM11247a = m11247a((byte) (b10 & 15));
        if (!z10 && (aVarM11247a == InterfaceC7876bh.a.PING || aVarM11247a == InterfaceC7876bh.a.PONG || aVarM11247a == InterfaceC7876bh.a.CLOSING)) {
            throw new C7867az("control frames may no be fragmented");
        }
        if (iIntValue < 0 || iIntValue > 125) {
            if (aVarM11247a == InterfaceC7876bh.a.PING || aVarM11247a == InterfaceC7876bh.a.PONG || aVarM11247a == InterfaceC7876bh.a.CLOSING) {
                throw new C7867az("more than 125 octets");
            }
            if (iIntValue != 126) {
                i10 = 10;
                if (iRemaining < 10) {
                    throw new a(10);
                }
                byte[] bArr = new byte[8];
                for (int i11 = 0; i11 < 8; i11++) {
                    bArr[i11] = byteBuffer.get();
                }
                long jLongValue = new BigInteger(bArr).longValue();
                if (jLongValue > SieveCacheKt.NodeLinkMask) {
                    throw new C7870bb("Payloadsize is to big...");
                }
                iIntValue = (int) jLongValue;
            } else {
                if (iRemaining < 4) {
                    throw new a(4);
                }
                iIntValue = new BigInteger(new byte[]{0, byteBuffer.get(), byteBuffer.get()}).intValue();
                i10 = 4;
            }
        }
        int i12 = i10 + (z11 ? 4 : 0) + iIntValue;
        if (iRemaining < i12) {
            throw new a(i12);
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(m11228a(iIntValue));
        if (z11) {
            byte[] bArr2 = new byte[4];
            byteBuffer.get(bArr2);
            for (int i13 = 0; i13 < iIntValue; i13++) {
                byteBufferAllocate.put((byte) (byteBuffer.get() ^ bArr2[i13 % 4]));
            }
        } else {
            byteBufferAllocate.put(byteBuffer.array(), byteBuffer.position(), byteBufferAllocate.limit());
            byteBuffer.position(byteBuffer.position() + byteBufferAllocate.limit());
        }
        if (aVarM11247a == InterfaceC7876bh.a.CLOSING) {
            c7877bi = new C7874bf();
        } else {
            c7877bi = new C7877bi();
            c7877bi.setFin(z10);
            c7877bi.setOptcode(aVarM11247a);
        }
        byteBufferAllocate.flip();
        c7877bi.setPayload(byteBufferAllocate);
        return c7877bi;
    }

    @Override // com.tendcloud.tenddata.AbstractC7860as
    /* renamed from: b */
    public AbstractC7860as.a mo11241b() {
        return AbstractC7860as.a.TWOWAY;
    }

    @Override // com.tendcloud.tenddata.AbstractC7860as
    /* renamed from: a */
    public AbstractC7860as.b mo11229a(InterfaceC7878bj interfaceC7878bj) {
        int iM11250b = m11250b(interfaceC7878bj);
        if (iM11250b == 7 || iM11250b == 8) {
            return m11240a((InterfaceC7883bo) interfaceC7878bj) ? AbstractC7860as.b.MATCHED : AbstractC7860as.b.NOT_MATCHED;
        }
        return AbstractC7860as.b.NOT_MATCHED;
    }

    @Override // com.tendcloud.tenddata.AbstractC7860as
    /* renamed from: a */
    public ByteBuffer mo11233a(InterfaceC7876bh interfaceC7876bh) {
        ByteBuffer byteBufferMo11265c = interfaceC7876bh.mo11265c();
        int i10 = 0;
        boolean z10 = this.f14375d == InterfaceC7851aj.b.CLIENT;
        int i11 = byteBufferMo11265c.remaining() <= 125 ? 1 : byteBufferMo11265c.remaining() <= 65535 ? 2 : 8;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate((i11 > 1 ? i11 + 1 : i11) + 1 + (z10 ? 4 : 0) + byteBufferMo11265c.remaining());
        byteBufferAllocate.put((byte) (((byte) (interfaceC7876bh.mo11266d() ? -128 : 0)) | m11246a(interfaceC7876bh.mo11268f())));
        byte[] bArrM11249a = m11249a(byteBufferMo11265c.remaining(), i11);
        if (!f14377f && bArrM11249a.length != i11) {
            throw new AssertionError();
        }
        if (i11 == 1) {
            byteBufferAllocate.put((byte) (bArrM11249a[0] | (z10 ? (byte) -128 : (byte) 0)));
        } else if (i11 == 2) {
            byteBufferAllocate.put((byte) ((z10 ? (byte) -128 : (byte) 0) | 126));
            byteBufferAllocate.put(bArrM11249a);
        } else if (i11 == 8) {
            byteBufferAllocate.put((byte) ((z10 ? (byte) -128 : (byte) 0) | 127));
            byteBufferAllocate.put(bArrM11249a);
        } else {
            throw new RuntimeException("Size representation not supported/specified");
        }
        if (z10) {
            ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(4);
            byteBufferAllocate2.putInt(this.f14380i.nextInt());
            byteBufferAllocate.put(byteBufferAllocate2.array());
            while (byteBufferMo11265c.hasRemaining()) {
                byteBufferAllocate.put((byte) (byteBufferMo11265c.get() ^ byteBufferAllocate2.get(i10 % 4)));
                i10++;
            }
        } else {
            byteBufferAllocate.put(byteBufferMo11265c);
        }
        if (!f14377f && byteBufferAllocate.remaining() != 0) {
            throw new AssertionError(byteBufferAllocate.remaining());
        }
        byteBufferAllocate.flip();
        return byteBufferAllocate;
    }

    @Override // com.tendcloud.tenddata.AbstractC7860as
    /* renamed from: c */
    public AbstractC7860as mo11242c() {
        return new C7861at();
    }

    @Override // com.tendcloud.tenddata.AbstractC7860as
    /* renamed from: a */
    public List<InterfaceC7876bh> mo11238a(ByteBuffer byteBuffer, boolean z10) {
        C7877bi c7877bi = new C7877bi();
        try {
            c7877bi.setPayload(byteBuffer);
            c7877bi.setFin(true);
            c7877bi.setOptcode(InterfaceC7876bh.a.BINARY);
            c7877bi.setTransferemasked(z10);
            return Collections.singletonList(c7877bi);
        } catch (C7866ay e10) {
            throw new C7871bc(e10);
        }
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

    /* renamed from: a */
    private byte m11246a(InterfaceC7876bh.a aVar) {
        if (aVar == InterfaceC7876bh.a.CONTINUOUS) {
            return (byte) 0;
        }
        if (aVar == InterfaceC7876bh.a.TEXT) {
            return (byte) 1;
        }
        if (aVar == InterfaceC7876bh.a.BINARY) {
            return (byte) 2;
        }
        if (aVar == InterfaceC7876bh.a.CLOSING) {
            return (byte) 8;
        }
        if (aVar == InterfaceC7876bh.a.PING) {
            return (byte) 9;
        }
        if (aVar == InterfaceC7876bh.a.PONG) {
            return (byte) 10;
        }
        throw new RuntimeException("Don't know how to handle " + aVar.toString());
    }

    /* renamed from: a */
    private String m11248a(String str) throws NoSuchAlgorithmException {
        try {
            return C7890bv.m11312a(MessageDigest.getInstance("SHA1").digest((str.trim() + "258EAFA5-E914-47DA-95CA-C5AB0DC85B11").getBytes()));
        } catch (NoSuchAlgorithmException e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override // com.tendcloud.tenddata.AbstractC7860as
    /* renamed from: a */
    public InterfaceC7879bk mo11231a(InterfaceC7879bk interfaceC7879bk) {
        interfaceC7879bk.mo11270a("Upgrade", "websocket");
        interfaceC7879bk.mo11270a("Connection", "Upgrade");
        interfaceC7879bk.mo11270a("Sec-WebSocket-Version", "8");
        byte[] bArr = new byte[16];
        this.f14380i.nextBytes(bArr);
        interfaceC7879bk.mo11270a("Sec-WebSocket-Key", C7890bv.m11312a(bArr));
        return interfaceC7879bk;
    }

    @Override // com.tendcloud.tenddata.AbstractC7860as
    /* renamed from: a */
    public InterfaceC7880bl mo11232a(InterfaceC7878bj interfaceC7878bj, InterfaceC7886br interfaceC7886br) throws C7869ba {
        interfaceC7886br.mo11270a("Upgrade", "websocket");
        interfaceC7886br.mo11270a("Connection", interfaceC7878bj.mo11273a("Connection"));
        interfaceC7886br.setHttpStatusMessage("Switching Protocols");
        String strMo11273a = interfaceC7878bj.mo11273a("Sec-WebSocket-Key");
        if (strMo11273a != null) {
            interfaceC7886br.mo11270a("Sec-WebSocket-Accept", m11248a(strMo11273a));
            return interfaceC7886br;
        }
        throw new C7869ba("missing Sec-WebSocket-Key");
    }

    /* renamed from: a */
    private byte[] m11249a(long j10, int i10) {
        byte[] bArr = new byte[i10];
        int i11 = (i10 * 8) - 8;
        for (int i12 = 0; i12 < i10; i12++) {
            bArr[i12] = (byte) (j10 >>> (i11 - (i12 * 8)));
        }
        return bArr;
    }

    /* renamed from: a */
    private InterfaceC7876bh.a m11247a(byte b10) throws C7867az {
        if (b10 == 0) {
            return InterfaceC7876bh.a.CONTINUOUS;
        }
        if (b10 == 1) {
            return InterfaceC7876bh.a.TEXT;
        }
        if (b10 != 2) {
            switch (b10) {
                case 8:
                    return InterfaceC7876bh.a.CLOSING;
                case 9:
                    return InterfaceC7876bh.a.PING;
                case 10:
                    return InterfaceC7876bh.a.PONG;
                default:
                    throw new C7867az("unknow optcode " + ((int) b10));
            }
        }
        return InterfaceC7876bh.a.BINARY;
    }

    @Override // com.tendcloud.tenddata.AbstractC7860as
    /* renamed from: a */
    public void mo11239a() {
        this.f14378g = null;
    }
}
