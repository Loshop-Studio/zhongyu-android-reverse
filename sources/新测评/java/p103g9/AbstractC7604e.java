package p103g9;

import java.io.EOFException;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okio.Buffer;
import okio.ByteString;
import p011a9.C0047j;
import p011a9.C0054q;
import p011a9.C0055r;
import p011a9.C0062y;
import p011a9.InterfaceC0048k;
import p028b9.AbstractC5070d;
import p136j9.C7828j;

/* renamed from: g9.e */
/* loaded from: classes5.dex */
public abstract class AbstractC7604e {

    /* renamed from: a */
    public static final ByteString f12746a;

    /* renamed from: b */
    public static final ByteString f12747b;

    static {
        ByteString.Companion companion = ByteString.INSTANCE;
        f12746a = companion.encodeUtf8("\"\\");
        f12747b = companion.encodeUtf8("\t ,=");
    }

    /* renamed from: a */
    public static final List m12501a(C0054q c0054q, String headerName) {
        Intrinsics.checkNotNullParameter(c0054q, "<this>");
        Intrinsics.checkNotNullParameter(headerName, "headerName");
        ArrayList arrayList = new ArrayList();
        int size = c0054q.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (StringsKt.equals(headerName, c0054q.m181b(i10), true)) {
                try {
                    m12503c(new Buffer().writeUtf8(c0054q.m184f(i10)), arrayList);
                } catch (EOFException e10) {
                    C7828j.f13560a.m13291g().m13284j("Unable to parse challenge", 5, e10);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    public static final boolean m12502b(C0062y c0062y) {
        Intrinsics.checkNotNullParameter(c0062y, "<this>");
        if (Intrinsics.areEqual(c0062y.m431w().m378g(), "HEAD")) {
            return false;
        }
        int iM418i = c0062y.m418i();
        return (((iM418i >= 100 && iM418i < 200) || iM418i == 204 || iM418i == 304) && AbstractC5070d.m2657v(c0062y) == -1 && !StringsKt.equals("chunked", C0062y.m413n(c0062y, "Transfer-Encoding", null, 2, null), true)) ? false : true;
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
    public static final void m12503c(okio.Buffer r7, java.util.List r8) throws java.io.EOFException {
        /*
            r0 = 0
        L1:
            r1 = r0
        L2:
            if (r1 != 0) goto Lf
            m12507g(r7)
            java.lang.String r1 = m12505e(r7)
            if (r1 != 0) goto Lf
            goto Lb9
        Lf:
            boolean r2 = m12507g(r7)
            java.lang.String r3 = m12505e(r7)
            if (r3 != 0) goto L2e
            boolean r7 = r7.exhausted()
            if (r7 != 0) goto L21
            goto Lb9
        L21:
            a9.g r7 = new a9.g
            java.util.Map r0 = kotlin.collections.MapsKt.emptyMap()
            r7.<init>(r1, r0)
            r8.add(r7)
            return
        L2e:
            r4 = 61
            int r5 = p028b9.AbstractC5070d.m2620K(r7, r4)
            boolean r6 = m12507g(r7)
            if (r2 != 0) goto L69
            if (r6 != 0) goto L42
            boolean r2 = r7.exhausted()
            if (r2 == 0) goto L69
        L42:
            a9.g r2 = new a9.g
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r3)
            java.lang.String r3 = "="
            java.lang.String r3 = kotlin.text.StringsKt.repeat(r3, r5)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            java.util.Map r3 = java.util.Collections.singletonMap(r0, r3)
            java.lang.String r4 = "singletonMap<String, Str…ek + \"=\".repeat(eqCount))"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
            r2.<init>(r1, r3)
            r8.add(r2)
            goto L1
        L69:
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            int r6 = p028b9.AbstractC5070d.m2620K(r7, r4)
            int r5 = r5 + r6
        L73:
            if (r3 != 0) goto L83
            java.lang.String r3 = m12505e(r7)
            boolean r5 = m12507g(r7)
            if (r5 != 0) goto Lbc
            int r5 = p028b9.AbstractC5070d.m2620K(r7, r4)
        L83:
            if (r5 == 0) goto Lbc
            r6 = 1
            if (r5 <= r6) goto L89
            goto Lb9
        L89:
            boolean r6 = m12507g(r7)
            if (r6 == 0) goto L90
            goto Lb9
        L90:
            r6 = 34
            boolean r6 = m12508h(r7, r6)
            if (r6 == 0) goto L9d
            java.lang.String r6 = m12504d(r7)
            goto La1
        L9d:
            java.lang.String r6 = m12505e(r7)
        La1:
            if (r6 != 0) goto La4
            goto Lb9
        La4:
            java.lang.Object r3 = r2.put(r3, r6)
            java.lang.String r3 = (java.lang.String) r3
            if (r3 == 0) goto Lad
            goto Lb9
        Lad:
            boolean r3 = m12507g(r7)
            if (r3 != 0) goto Lba
            boolean r3 = r7.exhausted()
            if (r3 != 0) goto Lba
        Lb9:
            return
        Lba:
            r3 = r0
            goto L73
        Lbc:
            a9.g r4 = new a9.g
            r4.<init>(r1, r2)
            r8.add(r4)
            r1 = r3
            goto L2
        */
        throw new UnsupportedOperationException("Method not decompiled: p103g9.AbstractC7604e.m12503c(okio.Buffer, java.util.List):void");
    }

    /* renamed from: d */
    public static final String m12504d(Buffer buffer) throws EOFException {
        if (buffer.readByte() != 34) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        Buffer buffer2 = new Buffer();
        while (true) {
            long jIndexOfElement = buffer.indexOfElement(f12746a);
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
    public static final String m12505e(Buffer buffer) {
        long jIndexOfElement = buffer.indexOfElement(f12747b);
        if (jIndexOfElement == -1) {
            jIndexOfElement = buffer.size();
        }
        if (jIndexOfElement != 0) {
            return buffer.readUtf8(jIndexOfElement);
        }
        return null;
    }

    /* renamed from: f */
    public static final void m12506f(InterfaceC0048k interfaceC0048k, C0055r url, C0054q headers) {
        Intrinsics.checkNotNullParameter(interfaceC0048k, "<this>");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(headers, "headers");
        if (interfaceC0048k == InterfaceC0048k.f143b) {
            return;
        }
        List listM127e = C0047j.f128j.m127e(url, headers);
        if (listM127e.isEmpty()) {
            return;
        }
        interfaceC0048k.mo132b(url, listM127e);
    }

    /* renamed from: g */
    public static final boolean m12507g(Buffer buffer) throws EOFException {
        boolean z9 = false;
        while (!buffer.exhausted()) {
            byte b10 = buffer.getByte(0L);
            if (b10 == 44) {
                buffer.readByte();
                z9 = true;
            } else {
                if (b10 != 32 && b10 != 9) {
                    break;
                }
                buffer.readByte();
            }
        }
        return z9;
    }

    /* renamed from: h */
    public static final boolean m12508h(Buffer buffer, byte b10) {
        return !buffer.exhausted() && buffer.getByte(0L) == b10;
    }
}
