package com.tendcloud.tenddata;

import android.annotation.SuppressLint;
import com.tendcloud.tenddata.AbstractC7860as;
import com.tendcloud.tenddata.InterfaceC7851aj;
import com.tendcloud.tenddata.InterfaceC7876bh;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

@SuppressLint({"UseValueOf"})
/* renamed from: com.tendcloud.tenddata.aw */
/* loaded from: classes5.dex */
public class C7864aw extends C7863av {

    /* renamed from: n */
    private static final byte[] f14389n = {-1, 0};

    /* renamed from: m */
    private boolean f14390m = false;

    /* renamed from: o */
    private final Random f14391o = new Random();

    /* renamed from: a */
    public static byte[] m11256a(String str, String str2, byte[] bArr) throws C7869ba, NumberFormatException {
        byte[] bArrM11255a = m11255a(str);
        byte[] bArrM11255a2 = m11255a(str2);
        try {
            return MessageDigest.getInstance("MD5").digest(new byte[]{bArrM11255a[0], bArrM11255a[1], bArrM11255a[2], bArrM11255a[3], bArrM11255a2[0], bArrM11255a2[1], bArrM11255a2[2], bArrM11255a2[3], bArr[0], bArr[1], bArr[2], bArr[3], bArr[4], bArr[5], bArr[6], bArr[7]});
        } catch (NoSuchAlgorithmException e10) {
            throw new RuntimeException(e10);
        }
    }

    /* renamed from: f */
    private static String m11257f() {
        Random random = new Random();
        long jNextInt = random.nextInt(12) + 1;
        String string = Long.toString((random.nextInt(Math.abs(new Long(4294967295L / jNextInt).intValue())) + 1) * jNextInt);
        int iNextInt = random.nextInt(12) + 1;
        for (int i10 = 0; i10 < iNextInt; i10++) {
            int iAbs = Math.abs(random.nextInt(string.length()));
            char cNextInt = (char) (random.nextInt(95) + 33);
            if (cNextInt >= '0' && cNextInt <= '9') {
                cNextInt = (char) (cNextInt - 15);
            }
            string = new StringBuilder(string).insert(iAbs, cNextInt).toString();
        }
        for (int i11 = 0; i11 < jNextInt; i11++) {
            string = new StringBuilder(string).insert(Math.abs(random.nextInt(string.length() - 1) + 1), " ").toString();
        }
        return string;
    }

    @Override // com.tendcloud.tenddata.C7863av, com.tendcloud.tenddata.AbstractC7860as
    /* renamed from: b */
    public AbstractC7860as.a mo11241b() {
        return AbstractC7860as.a.ONEWAY;
    }

    @Override // com.tendcloud.tenddata.C7863av, com.tendcloud.tenddata.AbstractC7860as
    /* renamed from: c */
    public List<InterfaceC7876bh> mo11243c(ByteBuffer byteBuffer) throws C7867az {
        byteBuffer.mark();
        List<InterfaceC7876bh> listM11253e = super.m11253e(byteBuffer);
        if (listM11253e != null) {
            return listM11253e;
        }
        byteBuffer.reset();
        List<InterfaceC7876bh> list = this.f14386k;
        this.f14385j = true;
        if (this.f14387l != null) {
            throw new C7867az();
        }
        this.f14387l = ByteBuffer.allocate(2);
        if (byteBuffer.remaining() > this.f14387l.remaining()) {
            throw new C7867az();
        }
        this.f14387l.put(byteBuffer);
        if (this.f14387l.hasRemaining()) {
            this.f14386k = new LinkedList();
            return list;
        }
        if (!Arrays.equals(this.f14387l.array(), f14389n)) {
            throw new C7867az();
        }
        list.add(new C7874bf(1000));
        return list;
    }

    @Override // com.tendcloud.tenddata.AbstractC7860as
    /* renamed from: d */
    public InterfaceC7883bo mo11245d(ByteBuffer byteBuffer) throws C7869ba {
        InterfaceC7880bl interfaceC7880blM11225a = AbstractC7860as.m11225a(byteBuffer, this.f14375d);
        if ((!interfaceC7880blM11225a.mo11274b("Sec-WebSocket-Key1") && this.f14375d != InterfaceC7851aj.b.CLIENT) || interfaceC7880blM11225a.mo11274b("Sec-WebSocket-Version")) {
            return interfaceC7880blM11225a;
        }
        byte[] bArr = new byte[this.f14375d == InterfaceC7851aj.b.SERVER ? 8 : 16];
        try {
            byteBuffer.get(bArr);
            interfaceC7880blM11225a.setContent(bArr);
            return interfaceC7880blM11225a;
        } catch (BufferUnderflowException unused) {
            throw new C7865ax(byteBuffer.capacity() + 16);
        }
    }

    @Override // com.tendcloud.tenddata.C7863av, com.tendcloud.tenddata.AbstractC7860as
    /* renamed from: c */
    public AbstractC7860as mo11242c() {
        return new C7864aw();
    }

    /* renamed from: a */
    private static byte[] m11255a(String str) throws C7869ba, NumberFormatException {
        try {
            long j10 = Long.parseLong(str.replaceAll("[^0-9]", ""));
            long length = str.split(" ").length - 1;
            if (length != 0) {
                long jLongValue = new Long(j10 / length).longValue();
                return new byte[]{(byte) (jLongValue >> 24), (byte) ((jLongValue << 8) >> 24), (byte) ((jLongValue << 16) >> 24), (byte) ((jLongValue << 24) >> 24)};
            }
            throw new C7869ba("invalid Sec-WebSocket-Key (/key2/)");
        } catch (NumberFormatException unused) {
            throw new C7869ba("invalid Sec-WebSocket-Key (/key1/ or /key2/)");
        }
    }

    @Override // com.tendcloud.tenddata.C7863av, com.tendcloud.tenddata.AbstractC7860as
    /* renamed from: a */
    public AbstractC7860as.b mo11230a(InterfaceC7878bj interfaceC7878bj, InterfaceC7885bq interfaceC7885bq) {
        if (this.f14390m) {
            return AbstractC7860as.b.NOT_MATCHED;
        }
        try {
            if (interfaceC7885bq.mo11273a("Sec-WebSocket-Origin").equals(interfaceC7878bj.mo11273a("Origin")) && m11240a(interfaceC7885bq)) {
                byte[] bArrMo11276d = interfaceC7885bq.mo11276d();
                if (bArrMo11276d != null && bArrMo11276d.length != 0) {
                    if (Arrays.equals(bArrMo11276d, m11256a(interfaceC7878bj.mo11273a("Sec-WebSocket-Key1"), interfaceC7878bj.mo11273a("Sec-WebSocket-Key2"), interfaceC7878bj.mo11276d()))) {
                        return AbstractC7860as.b.MATCHED;
                    }
                    return AbstractC7860as.b.NOT_MATCHED;
                }
                throw new C7865ax();
            }
            return AbstractC7860as.b.NOT_MATCHED;
        } catch (C7869ba e10) {
            throw new RuntimeException("bad handshakerequest", e10);
        }
    }

    @Override // com.tendcloud.tenddata.C7863av, com.tendcloud.tenddata.AbstractC7860as
    /* renamed from: a */
    public AbstractC7860as.b mo11229a(InterfaceC7878bj interfaceC7878bj) {
        if (interfaceC7878bj.mo11273a("Upgrade").equals("WebSocket") && interfaceC7878bj.mo11273a("Connection").contains("Upgrade") && interfaceC7878bj.mo11273a("Sec-WebSocket-Key1").length() > 0 && !interfaceC7878bj.mo11273a("Sec-WebSocket-Key2").isEmpty() && interfaceC7878bj.mo11274b("Origin")) {
            return AbstractC7860as.b.MATCHED;
        }
        return AbstractC7860as.b.NOT_MATCHED;
    }

    @Override // com.tendcloud.tenddata.C7863av, com.tendcloud.tenddata.AbstractC7860as
    /* renamed from: a */
    public InterfaceC7879bk mo11231a(InterfaceC7879bk interfaceC7879bk) {
        interfaceC7879bk.mo11270a("Upgrade", "WebSocket");
        interfaceC7879bk.mo11270a("Connection", "Upgrade");
        interfaceC7879bk.mo11270a("Sec-WebSocket-Key1", m11257f());
        interfaceC7879bk.mo11270a("Sec-WebSocket-Key2", m11257f());
        if (!interfaceC7879bk.mo11274b("Origin")) {
            interfaceC7879bk.mo11270a("Origin", "random" + this.f14391o.nextInt());
        }
        byte[] bArr = new byte[8];
        this.f14391o.nextBytes(bArr);
        interfaceC7879bk.setContent(bArr);
        return interfaceC7879bk;
    }

    @Override // com.tendcloud.tenddata.C7863av, com.tendcloud.tenddata.AbstractC7860as
    /* renamed from: a */
    public InterfaceC7880bl mo11232a(InterfaceC7878bj interfaceC7878bj, InterfaceC7886br interfaceC7886br) throws C7869ba {
        interfaceC7886br.setHttpStatusMessage("WebSocket Protocol Handshake");
        interfaceC7886br.mo11270a("Upgrade", "WebSocket");
        interfaceC7886br.mo11270a("Connection", interfaceC7878bj.mo11273a("Connection"));
        interfaceC7886br.mo11270a("Sec-WebSocket-Origin", interfaceC7878bj.mo11273a("Origin"));
        interfaceC7886br.mo11270a("Sec-WebSocket-Location", "ws://" + interfaceC7878bj.mo11273a("Host") + interfaceC7878bj.mo11269a());
        String strMo11273a = interfaceC7878bj.mo11273a("Sec-WebSocket-Key1");
        String strMo11273a2 = interfaceC7878bj.mo11273a("Sec-WebSocket-Key2");
        byte[] bArrMo11276d = interfaceC7878bj.mo11276d();
        if (strMo11273a != null && strMo11273a2 != null && bArrMo11276d != null && bArrMo11276d.length == 8) {
            interfaceC7886br.setContent(m11256a(strMo11273a, strMo11273a2, bArrMo11276d));
            return interfaceC7886br;
        }
        throw new C7869ba("Bad keys");
    }

    @Override // com.tendcloud.tenddata.C7863av, com.tendcloud.tenddata.AbstractC7860as
    /* renamed from: a */
    public ByteBuffer mo11233a(InterfaceC7876bh interfaceC7876bh) {
        if (interfaceC7876bh.mo11268f() == InterfaceC7876bh.a.CLOSING) {
            return ByteBuffer.wrap(f14389n);
        }
        return super.mo11233a(interfaceC7876bh);
    }
}
