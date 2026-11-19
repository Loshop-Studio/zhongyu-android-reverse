package p141x2;

import java.io.EOFException;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import okio.Buffer;
import okio.ByteString;
import p004a3.C0021k;
import p117r2.C4496a0;
import p117r2.C4509l;
import p117r2.C4516s;
import p117r2.C4517t;
import p117r2.InterfaceC4510m;
import p121s2.AbstractC4550b;

/* renamed from: x2.e */
/* loaded from: classes2.dex */
public abstract class AbstractC4668e {

    /* renamed from: a */
    public static final ByteString f5966a;

    /* renamed from: b */
    public static final ByteString f5967b;

    static {
        ByteString.Companion companion = ByteString.INSTANCE;
        f5966a = companion.encodeUtf8("\"\\");
        f5967b = companion.encodeUtf8("\t ,=");
    }

    /* renamed from: a */
    public static final List m6574a(C4516s parseChallenges, String headerName) {
        Intrinsics.checkNotNullParameter(parseChallenges, "$this$parseChallenges");
        Intrinsics.checkNotNullParameter(headerName, "headerName");
        ArrayList arrayList = new ArrayList();
        int size = parseChallenges.size();
        for (int i4 = 0; i4 < size; i4++) {
            if (StringsKt__StringsJVMKt.equals(headerName, parseChallenges.m5960b(i4), true)) {
                try {
                    m6576c(new Buffer().writeUtf8(parseChallenges.m5962e(i4)), arrayList);
                } catch (EOFException e4) {
                    C0021k.f39c.m71g().m64j("Unable to parse challenge", 5, e4);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    public static final boolean m6575b(C4496a0 promisesBody) {
        Intrinsics.checkNotNullParameter(promisesBody, "$this$promisesBody");
        if (Intrinsics.areEqual(promisesBody.m5816r().m6138g(), "HEAD")) {
            return false;
        }
        int iM5804e = promisesBody.m5804e();
        return (((iM5804e >= 100 && iM5804e < 200) || iM5804e == 204 || iM5804e == 304) && AbstractC4550b.m6237s(promisesBody) == -1 && !StringsKt__StringsJVMKt.equals("chunked", C4496a0.m5799i(promisesBody, "Transfer-Encoding", null, 2, null), true)) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x0085, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0085, code lost:
    
        continue;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0090  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m6576c(okio.Buffer r7, java.util.List r8) throws java.io.EOFException {
        /*
            r0 = 0
        L1:
            r1 = r0
        L2:
            if (r1 != 0) goto Le
            m6580g(r7)
            java.lang.String r1 = m6578e(r7)
            if (r1 != 0) goto Le
            return
        Le:
            boolean r2 = m6580g(r7)
            java.lang.String r3 = m6578e(r7)
            if (r3 != 0) goto L2c
            boolean r7 = r7.exhausted()
            if (r7 != 0) goto L1f
            return
        L1f:
            r2.g r7 = new r2.g
            java.util.Map r0 = kotlin.collections.MapsKt.emptyMap()
            r7.<init>(r1, r0)
            r8.add(r7)
            return
        L2c:
            r4 = 61
            byte r4 = (byte) r4
            int r5 = p121s2.AbstractC4550b.m6204G(r7, r4)
            boolean r6 = m6580g(r7)
            if (r2 != 0) goto L68
            if (r6 != 0) goto L41
            boolean r2 = r7.exhausted()
            if (r2 == 0) goto L68
        L41:
            r2.g r2 = new r2.g
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r3)
            java.lang.String r3 = "="
            java.lang.String r3 = kotlin.text.StringsKt.repeat(r3, r5)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            java.util.Map r3 = java.util.Collections.singletonMap(r0, r3)
            java.lang.String r4 = "Collections.singletonMap…ek + \"=\".repeat(eqCount))"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
            r2.<init>(r1, r3)
            r8.add(r2)
            goto L1
        L68:
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            int r6 = p121s2.AbstractC4550b.m6204G(r7, r4)
            int r5 = r5 + r6
        L72:
            if (r3 != 0) goto L83
            java.lang.String r3 = m6578e(r7)
            boolean r5 = m6580g(r7)
            if (r5 == 0) goto L7f
            goto L85
        L7f:
            int r5 = p121s2.AbstractC4550b.m6204G(r7, r4)
        L83:
            if (r5 != 0) goto L90
        L85:
            r2.g r4 = new r2.g
            r4.<init>(r1, r2)
            r8.add(r4)
            r1 = r3
            goto L2
        L90:
            r6 = 1
            if (r5 <= r6) goto L94
            return
        L94:
            boolean r6 = m6580g(r7)
            if (r6 == 0) goto L9b
            return
        L9b:
            r6 = 34
            byte r6 = (byte) r6
            boolean r6 = m6581h(r7, r6)
            if (r6 == 0) goto La9
            java.lang.String r6 = m6577d(r7)
            goto Lad
        La9:
            java.lang.String r6 = m6578e(r7)
        Lad:
            if (r6 == 0) goto Lc7
            java.lang.Object r3 = r2.put(r3, r6)
            java.lang.String r3 = (java.lang.String) r3
            if (r3 == 0) goto Lb8
            return
        Lb8:
            boolean r3 = m6580g(r7)
            if (r3 != 0) goto Lc5
            boolean r3 = r7.exhausted()
            if (r3 != 0) goto Lc5
            return
        Lc5:
            r3 = r0
            goto L72
        Lc7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p141x2.AbstractC4668e.m6576c(okio.Buffer, java.util.List):void");
    }

    /* renamed from: d */
    public static final String m6577d(Buffer buffer) throws EOFException {
        byte b4 = (byte) 34;
        if (!(buffer.readByte() == b4)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        Buffer buffer2 = new Buffer();
        while (true) {
            long jIndexOfElement = buffer.indexOfElement(f5966a);
            if (jIndexOfElement == -1) {
                return null;
            }
            if (buffer.getByte(jIndexOfElement) == b4) {
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
    public static final String m6578e(Buffer buffer) {
        long jIndexOfElement = buffer.indexOfElement(f5967b);
        if (jIndexOfElement == -1) {
            jIndexOfElement = buffer.size();
        }
        if (jIndexOfElement != 0) {
            return buffer.readUtf8(jIndexOfElement);
        }
        return null;
    }

    /* renamed from: f */
    public static final void m6579f(InterfaceC4510m receiveHeaders, C4517t url, C4516s headers) {
        Intrinsics.checkNotNullParameter(receiveHeaders, "$this$receiveHeaders");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(headers, "headers");
        if (receiveHeaders == InterfaceC4510m.f5511a) {
            return;
        }
        List listM5910e = C4509l.f5501n.m5910e(url, headers);
        if (listM5910e.isEmpty()) {
            return;
        }
        receiveHeaders.mo5915b(url, listM5910e);
    }

    /* renamed from: g */
    public static final boolean m6580g(Buffer buffer) throws EOFException {
        boolean z3 = false;
        while (!buffer.exhausted()) {
            byte b4 = buffer.getByte(0L);
            if (b4 == 9 || b4 == 32) {
                buffer.readByte();
            } else {
                if (b4 != 44) {
                    break;
                }
                buffer.readByte();
                z3 = true;
            }
        }
        return z3;
    }

    /* renamed from: h */
    public static final boolean m6581h(Buffer buffer, byte b4) {
        return !buffer.exhausted() && buffer.getByte(0L) == b4;
    }
}
