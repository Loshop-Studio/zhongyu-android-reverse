package p236r8;

import java.io.EOFException;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okio.Buffer;
import okio.ByteString;
import p172l8.C8911j;
import p172l8.C8918q;
import p172l8.C8919r;
import p172l8.C8926y;
import p172l8.InterfaceC8912k;
import p182m8.AbstractC9045d;
import p266u8.C9734j;

/* renamed from: r8.e */
/* loaded from: classes5.dex */
public abstract class AbstractC9443e {

    /* renamed from: a */
    public static final ByteString f16458a;

    /* renamed from: b */
    public static final ByteString f16459b;

    static {
        ByteString.Companion companion = ByteString.INSTANCE;
        f16458a = companion.encodeUtf8("\"\\");
        f16459b = companion.encodeUtf8("\t ,=");
    }

    /* renamed from: a */
    public static final List m15588a(C8918q c8918q, String headerName) {
        Intrinsics.checkNotNullParameter(c8918q, "<this>");
        Intrinsics.checkNotNullParameter(headerName, "headerName");
        ArrayList arrayList = new ArrayList();
        int size = c8918q.size();
        for (int i9 = 0; i9 < size; i9++) {
            if (StringsKt.equals(headerName, c8918q.m13937b(i9), true)) {
                try {
                    m15590c(new Buffer().writeUtf8(c8918q.m13940f(i9)), arrayList);
                } catch (EOFException e10) {
                    C9734j.f17200a.m16271g().m16264j("Unable to parse challenge", 5, e10);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    public static final boolean m15589b(C8926y c8926y) {
        Intrinsics.checkNotNullParameter(c8926y, "<this>");
        if (Intrinsics.areEqual(c8926y.m14187w().m14134g(), "HEAD")) {
            return false;
        }
        int iM14174i = c8926y.m14174i();
        return (((iM14174i >= 100 && iM14174i < 200) || iM14174i == 204 || iM14174i == 304) && AbstractC9045d.m14506v(c8926y) == -1 && !StringsKt.equals("chunked", C8926y.m14169n(c8926y, "Transfer-Encoding", null, 2, null), true)) ? false : true;
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
    public static final void m15590c(okio.Buffer r7, java.util.List r8) throws java.io.EOFException {
        /*
            r0 = 0
        L1:
            r1 = r0
        L2:
            if (r1 != 0) goto Lf
            m15594g(r7)
            java.lang.String r1 = m15592e(r7)
            if (r1 != 0) goto Lf
            goto Lb9
        Lf:
            boolean r2 = m15594g(r7)
            java.lang.String r3 = m15592e(r7)
            if (r3 != 0) goto L2e
            boolean r7 = r7.exhausted()
            if (r7 != 0) goto L21
            goto Lb9
        L21:
            l8.g r7 = new l8.g
            java.util.Map r0 = kotlin.collections.MapsKt.emptyMap()
            r7.<init>(r1, r0)
            r8.add(r7)
            return
        L2e:
            r4 = 61
            int r5 = p182m8.AbstractC9045d.m14469K(r7, r4)
            boolean r6 = m15594g(r7)
            if (r2 != 0) goto L69
            if (r6 != 0) goto L42
            boolean r2 = r7.exhausted()
            if (r2 == 0) goto L69
        L42:
            l8.g r2 = new l8.g
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
            int r6 = p182m8.AbstractC9045d.m14469K(r7, r4)
            int r5 = r5 + r6
        L73:
            if (r3 != 0) goto L83
            java.lang.String r3 = m15592e(r7)
            boolean r5 = m15594g(r7)
            if (r5 != 0) goto Lbc
            int r5 = p182m8.AbstractC9045d.m14469K(r7, r4)
        L83:
            if (r5 == 0) goto Lbc
            r6 = 1
            if (r5 <= r6) goto L89
            goto Lb9
        L89:
            boolean r6 = m15594g(r7)
            if (r6 == 0) goto L90
            goto Lb9
        L90:
            r6 = 34
            boolean r6 = m15595h(r7, r6)
            if (r6 == 0) goto L9d
            java.lang.String r6 = m15591d(r7)
            goto La1
        L9d:
            java.lang.String r6 = m15592e(r7)
        La1:
            if (r6 != 0) goto La4
            goto Lb9
        La4:
            java.lang.Object r3 = r2.put(r3, r6)
            java.lang.String r3 = (java.lang.String) r3
            if (r3 == 0) goto Lad
            goto Lb9
        Lad:
            boolean r3 = m15594g(r7)
            if (r3 != 0) goto Lba
            boolean r3 = r7.exhausted()
            if (r3 != 0) goto Lba
        Lb9:
            return
        Lba:
            r3 = r0
            goto L73
        Lbc:
            l8.g r4 = new l8.g
            r4.<init>(r1, r2)
            r8.add(r4)
            r1 = r3
            goto L2
        */
        throw new UnsupportedOperationException("Method not decompiled: p236r8.AbstractC9443e.m15590c(okio.Buffer, java.util.List):void");
    }

    /* renamed from: d */
    public static final String m15591d(Buffer buffer) throws EOFException {
        if (buffer.readByte() != 34) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        Buffer buffer2 = new Buffer();
        while (true) {
            long jIndexOfElement = buffer.indexOfElement(f16458a);
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
    public static final String m15592e(Buffer buffer) {
        long jIndexOfElement = buffer.indexOfElement(f16459b);
        if (jIndexOfElement == -1) {
            jIndexOfElement = buffer.size();
        }
        if (jIndexOfElement != 0) {
            return buffer.readUtf8(jIndexOfElement);
        }
        return null;
    }

    /* renamed from: f */
    public static final void m15593f(InterfaceC8912k interfaceC8912k, C8919r url, C8918q headers) {
        Intrinsics.checkNotNullParameter(interfaceC8912k, "<this>");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(headers, "headers");
        if (interfaceC8912k == InterfaceC8912k.f14771b) {
            return;
        }
        List listM13884e = C8911j.f14756j.m13884e(url, headers);
        if (listM13884e.isEmpty()) {
            return;
        }
        interfaceC8912k.mo13888a(url, listM13884e);
    }

    /* renamed from: g */
    public static final boolean m15594g(Buffer buffer) throws EOFException {
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
    public static final boolean m15595h(Buffer buffer, byte b10) {
        return !buffer.exhausted() && buffer.getByte(0L) == b10;
    }
}
