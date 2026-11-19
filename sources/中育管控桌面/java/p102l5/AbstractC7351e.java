package p102l5;

import java.io.EOFException;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.internal.platform.AbstractC7536c;
import okio.Buffer;
import okio.ByteString;
import p058f5.C6362d0;
import p058f5.C6374m;
import p058f5.C6383v;
import p058f5.C6384w;
import p058f5.InterfaceC6375n;
import p065g5.AbstractC6427k;

/* renamed from: l5.e */
/* loaded from: classes4.dex */
public abstract class AbstractC7351e {

    /* renamed from: a */
    public static final ByteString f9328a;

    /* renamed from: b */
    public static final ByteString f9329b;

    static {
        ByteString.Companion companion = ByteString.INSTANCE;
        f9328a = companion.encodeUtf8("\"\\");
        f9329b = companion.encodeUtf8("\t ,=");
    }

    /* renamed from: a */
    public static final List m8331a(C6383v c6383v, String headerName) {
        Intrinsics.checkNotNullParameter(c6383v, "<this>");
        Intrinsics.checkNotNullParameter(headerName, "headerName");
        ArrayList arrayList = new ArrayList();
        int size = c6383v.size();
        for (int i6 = 0; i6 < size; i6++) {
            if (StringsKt.equals(headerName, c6383v.m6801c(i6), true)) {
                try {
                    m8333c(new Buffer().writeUtf8(c6383v.m6804g(i6)), arrayList);
                } catch (EOFException e6) {
                    AbstractC7536c.f9994a.m8931e().mo8919l("Unable to parse challenge", 5, e6);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    public static final boolean m8332b(C6362d0 c6362d0) {
        Intrinsics.checkNotNullParameter(c6362d0, "<this>");
        if (Intrinsics.areEqual(c6362d0.m6678x().m6584h(), "HEAD")) {
            return false;
        }
        int iM6665j = c6362d0.m6665j();
        return (((iM6665j >= 100 && iM6665j < 200) || iM6665j == 204 || iM6665j == 304) && AbstractC6427k.m7023k(c6362d0) == -1 && !StringsKt.equals("chunked", C6362d0.m6660o(c6362d0, "Transfer-Encoding", null, 2, null), true)) ? false : true;
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
    public static final void m8333c(okio.Buffer r7, java.util.List r8) {
        /*
            r0 = 0
        L1:
            r1 = r0
        L2:
            if (r1 != 0) goto Lf
            m8337g(r7)
            java.lang.String r1 = m8335e(r7)
            if (r1 != 0) goto Lf
            goto Lb9
        Lf:
            boolean r2 = m8337g(r7)
            java.lang.String r3 = m8335e(r7)
            if (r3 != 0) goto L2e
            boolean r7 = r7.exhausted()
            if (r7 != 0) goto L21
            goto Lb9
        L21:
            f5.i r7 = new f5.i
            java.util.Map r0 = kotlin.collections.MapsKt.emptyMap()
            r7.<init>(r1, r0)
            r8.add(r7)
            return
        L2e:
            r4 = 61
            int r5 = p065g5.AbstractC6424h.m7011y(r7, r4)
            boolean r6 = m8337g(r7)
            if (r2 != 0) goto L69
            if (r6 != 0) goto L42
            boolean r2 = r7.exhausted()
            if (r2 == 0) goto L69
        L42:
            f5.i r2 = new f5.i
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r3)
            java.lang.String r3 = "="
            java.lang.String r3 = kotlin.text.StringsKt.repeat(r3, r5)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            java.util.Map r3 = java.util.Collections.singletonMap(r0, r3)
            java.lang.String r4 = "singletonMap(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
            r2.<init>(r1, r3)
            r8.add(r2)
            goto L1
        L69:
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            int r6 = p065g5.AbstractC6424h.m7011y(r7, r4)
            int r5 = r5 + r6
        L73:
            if (r3 != 0) goto L83
            java.lang.String r3 = m8335e(r7)
            boolean r5 = m8337g(r7)
            if (r5 != 0) goto Lbc
            int r5 = p065g5.AbstractC6424h.m7011y(r7, r4)
        L83:
            if (r5 == 0) goto Lbc
            r6 = 1
            if (r5 <= r6) goto L89
            goto Lb9
        L89:
            boolean r6 = m8337g(r7)
            if (r6 == 0) goto L90
            goto Lb9
        L90:
            r6 = 34
            boolean r6 = m8338h(r7, r6)
            if (r6 == 0) goto L9d
            java.lang.String r6 = m8334d(r7)
            goto La1
        L9d:
            java.lang.String r6 = m8335e(r7)
        La1:
            if (r6 != 0) goto La4
            goto Lb9
        La4:
            java.lang.Object r3 = r2.put(r3, r6)
            java.lang.String r3 = (java.lang.String) r3
            if (r3 == 0) goto Lad
            goto Lb9
        Lad:
            boolean r3 = m8337g(r7)
            if (r3 != 0) goto Lba
            boolean r3 = r7.exhausted()
            if (r3 != 0) goto Lba
        Lb9:
            return
        Lba:
            r3 = r0
            goto L73
        Lbc:
            f5.i r4 = new f5.i
            r4.<init>(r1, r2)
            r8.add(r4)
            r1 = r3
            goto L2
        */
        throw new UnsupportedOperationException("Method not decompiled: p102l5.AbstractC7351e.m8333c(okio.Buffer, java.util.List):void");
    }

    /* renamed from: d */
    public static final String m8334d(Buffer buffer) {
        if (buffer.readByte() != 34) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        Buffer buffer2 = new Buffer();
        while (true) {
            long jIndexOfElement = buffer.indexOfElement(f9328a);
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
    public static final String m8335e(Buffer buffer) {
        long jIndexOfElement = buffer.indexOfElement(f9329b);
        if (jIndexOfElement == -1) {
            jIndexOfElement = buffer.size();
        }
        if (jIndexOfElement != 0) {
            return buffer.readUtf8(jIndexOfElement);
        }
        return null;
    }

    /* renamed from: f */
    public static final void m8336f(InterfaceC6375n interfaceC6375n, C6384w url, C6383v headers) {
        Intrinsics.checkNotNullParameter(interfaceC6375n, "<this>");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(headers, "headers");
        if (interfaceC6375n == InterfaceC6375n.f7937b) {
            return;
        }
        List listM6744e = C6374m.f7921k.m6744e(url, headers);
        if (listM6744e.isEmpty()) {
            return;
        }
        interfaceC6375n.mo6749b(url, listM6744e);
    }

    /* renamed from: g */
    public static final boolean m8337g(Buffer buffer) {
        boolean z6 = false;
        while (!buffer.exhausted()) {
            byte b7 = buffer.getByte(0L);
            if (b7 != 44) {
                if (b7 != 32 && b7 != 9) {
                    break;
                }
                buffer.readByte();
            } else {
                buffer.readByte();
                z6 = true;
            }
        }
        return z6;
    }

    /* renamed from: h */
    public static final boolean m8338h(Buffer buffer, byte b7) {
        return !buffer.exhausted() && buffer.getByte(0L) == b7;
    }
}
