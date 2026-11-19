package p203o9;

import java.io.EOFException;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC9133u;
import okhttp3.internal.platform.AbstractC9570c;
import okio.Buffer;
import okio.ByteString;
import p113g8.AbstractC8687z;
import p136i9.C8903d0;
import p136i9.C8915m;
import p136i9.C8924v;
import p136i9.C8925w;
import p136i9.InterfaceC8916n;
import p147j9.AbstractC9041k;

/* renamed from: o9.e */
/* loaded from: classes5.dex */
public abstract class AbstractC9550e {

    /* renamed from: a */
    public static final ByteString f18915a;

    /* renamed from: b */
    public static final ByteString f18916b;

    static {
        ByteString.Companion companion = ByteString.Companion;
        f18915a = companion.encodeUtf8("\"\\");
        f18916b = companion.encodeUtf8("\t ,=");
    }

    /* renamed from: a */
    public static final List m17836a(C8924v c8924v, String headerName) {
        AbstractC9133u.m16133g(c8924v, "<this>");
        AbstractC9133u.m16133g(headerName, "headerName");
        ArrayList arrayList = new ArrayList();
        int size = c8924v.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (AbstractC8687z.m14093A(headerName, c8924v.m15262c(i10), true)) {
                try {
                    m17838c(new Buffer().writeUtf8(c8924v.m15265g(i10)), arrayList);
                } catch (EOFException e10) {
                    AbstractC9570c.f19216a.m18112e().mo18100l("Unable to parse challenge", 5, e10);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    public static final boolean m17837b(C8903d0 c8903d0) {
        AbstractC9133u.m16133g(c8903d0, "<this>");
        if (AbstractC9133u.m16128b(c8903d0.m15141t().m15048h(), "HEAD")) {
            return false;
        }
        int iM15128f = c8903d0.m15128f();
        return (((iM15128f >= 100 && iM15128f < 200) || iM15128f == 204 || iM15128f == 304) && AbstractC9041k.m15781k(c8903d0) == -1 && !AbstractC8687z.m14093A("chunked", C8903d0.m15123k(c8903d0, "Transfer-Encoding", null, 2, null), true)) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x00bc, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00bc, code lost:
    
        continue;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0085  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m17838c(okio.Buffer r7, java.util.List r8) throws java.io.EOFException {
        /*
            r0 = 0
        L1:
            r1 = r0
        L2:
            if (r1 != 0) goto Lf
            m17842g(r7)
            java.lang.String r1 = m17840e(r7)
            if (r1 != 0) goto Lf
            goto Lb9
        Lf:
            boolean r2 = m17842g(r7)
            java.lang.String r3 = m17840e(r7)
            if (r3 != 0) goto L2e
            boolean r7 = r7.exhausted()
            if (r7 != 0) goto L21
            goto Lb9
        L21:
            i9.i r7 = new i9.i
            java.util.Map r0 = kotlin.collections.AbstractC9080a.m15943h()
            r7.<init>(r1, r0)
            r8.add(r7)
            return
        L2e:
            r4 = 61
            int r5 = p147j9.AbstractC9038h.m15769y(r7, r4)
            boolean r6 = m17842g(r7)
            if (r2 != 0) goto L69
            if (r6 != 0) goto L42
            boolean r2 = r7.exhausted()
            if (r2 == 0) goto L69
        L42:
            i9.i r2 = new i9.i
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r3)
            java.lang.String r3 = "="
            java.lang.String r3 = p113g8.AbstractC8687z.m14097E(r3, r5)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            java.util.Map r3 = java.util.Collections.singletonMap(r0, r3)
            java.lang.String r4 = "singletonMap(...)"
            kotlin.jvm.internal.AbstractC9133u.m16132f(r3, r4)
            r2.<init>(r1, r3)
            r8.add(r2)
            goto L1
        L69:
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            int r6 = p147j9.AbstractC9038h.m15769y(r7, r4)
            int r5 = r5 + r6
        L73:
            if (r3 != 0) goto L83
            java.lang.String r3 = m17840e(r7)
            boolean r5 = m17842g(r7)
            if (r5 != 0) goto Lbc
            int r5 = p147j9.AbstractC9038h.m15769y(r7, r4)
        L83:
            if (r5 == 0) goto Lbc
            r6 = 1
            if (r5 <= r6) goto L89
            goto Lb9
        L89:
            boolean r6 = m17842g(r7)
            if (r6 == 0) goto L90
            goto Lb9
        L90:
            r6 = 34
            boolean r6 = m17843h(r7, r6)
            if (r6 == 0) goto L9d
            java.lang.String r6 = m17839d(r7)
            goto La1
        L9d:
            java.lang.String r6 = m17840e(r7)
        La1:
            if (r6 != 0) goto La4
            goto Lb9
        La4:
            java.lang.Object r3 = r2.put(r3, r6)
            java.lang.String r3 = (java.lang.String) r3
            if (r3 == 0) goto Lad
            goto Lb9
        Lad:
            boolean r3 = m17842g(r7)
            if (r3 != 0) goto Lba
            boolean r3 = r7.exhausted()
            if (r3 != 0) goto Lba
        Lb9:
            return
        Lba:
            r3 = r0
            goto L73
        Lbc:
            i9.i r4 = new i9.i
            r4.<init>(r1, r2)
            r8.add(r4)
            r1 = r3
            goto L2
        */
        throw new UnsupportedOperationException("Method not decompiled: p203o9.AbstractC9550e.m17838c(okio.Buffer, java.util.List):void");
    }

    /* renamed from: d */
    public static final String m17839d(Buffer buffer) throws EOFException {
        if (buffer.readByte() != 34) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        Buffer buffer2 = new Buffer();
        while (true) {
            long jIndexOfElement = buffer.indexOfElement(f18915a);
            if (jIndexOfElement == -1) {
                return null;
            }
            if (buffer.getByte(jIndexOfElement) == 34) {
                buffer2.write(buffer, jIndexOfElement);
                buffer.readByte();
                return buffer2.readUtf8();
            }
            if (buffer.size() == jIndexOfElement + 1) {
                return null;
            }
            buffer2.write(buffer, jIndexOfElement);
            buffer.readByte();
            buffer2.write(buffer, 1L);
        }
    }

    /* renamed from: e */
    public static final String m17840e(Buffer buffer) {
        long jIndexOfElement = buffer.indexOfElement(f18916b);
        if (jIndexOfElement == -1) {
            jIndexOfElement = buffer.size();
        }
        if (jIndexOfElement != 0) {
            return buffer.readUtf8(jIndexOfElement);
        }
        return null;
    }

    /* renamed from: f */
    public static final void m17841f(InterfaceC8916n interfaceC8916n, C8925w url, C8924v headers) {
        AbstractC9133u.m16133g(interfaceC8916n, "<this>");
        AbstractC9133u.m16133g(url, "url");
        AbstractC9133u.m16133g(headers, "headers");
        if (interfaceC8916n == InterfaceC8916n.f16769b) {
            return;
        }
        List listM15205e = C8915m.f16753k.m15205e(url, headers);
        if (listM15205e.isEmpty()) {
            return;
        }
        interfaceC8916n.mo15210b(url, listM15205e);
    }

    /* renamed from: g */
    public static final boolean m17842g(Buffer buffer) throws EOFException {
        boolean z10 = false;
        while (!buffer.exhausted()) {
            byte b10 = buffer.getByte(0L);
            if (b10 != 44) {
                if (b10 != 32 && b10 != 9) {
                    break;
                }
                buffer.readByte();
            } else {
                buffer.readByte();
                z10 = true;
            }
        }
        return z10;
    }

    /* renamed from: h */
    public static final boolean m17843h(Buffer buffer, byte b10) {
        return !buffer.exhausted() && buffer.getByte(0L) == b10;
    }
}
