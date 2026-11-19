package pe;

import anet.channel.request.Request;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.List;
import je.C9730j;
import je.C9737q;
import je.C9738r;
import je.C9745y;
import je.InterfaceC9731k;
import ke.AbstractC9920d;
import kotlin.jvm.internal.AbstractC9979u;
import okio.Buffer;
import okio.ByteString;
import p310qd.AbstractC10819z;
import se.C11192j;

/* renamed from: pe.e */
/* loaded from: classes6.dex */
public abstract class AbstractC10678e {

    /* renamed from: a */
    public static final ByteString f25731a;

    /* renamed from: b */
    public static final ByteString f25732b;

    static {
        ByteString.Companion companion = ByteString.Companion;
        f25731a = companion.encodeUtf8("\"\\");
        f25732b = companion.encodeUtf8("\t ,=");
    }

    /* renamed from: a */
    public static final boolean m22613a(C9745y response) {
        AbstractC9979u.m20294g(response, "response");
        return m22615c(response);
    }

    /* renamed from: b */
    public static final List m22614b(C9737q c9737q, String headerName) {
        AbstractC9979u.m20294g(c9737q, "<this>");
        AbstractC9979u.m20294g(headerName, "headerName");
        ArrayList arrayList = new ArrayList();
        int size = c9737q.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (AbstractC10819z.m23230C(headerName, c9737q.m19390b(i10), true)) {
                try {
                    m22616d(new Buffer().writeUtf8(c9737q.m19393f(i10)), arrayList);
                } catch (EOFException e10) {
                    C11192j.f26882a.m24899g().m24892j("Unable to parse challenge", 5, e10);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: c */
    public static final boolean m22615c(C9745y c9745y) {
        AbstractC9979u.m20294g(c9745y, "<this>");
        if (AbstractC9979u.m20289b(c9745y.m19645z().m19589g(), Request.Method.HEAD)) {
            return false;
        }
        int iM19632j = c9745y.m19632j();
        return (((iM19632j >= 100 && iM19632j < 200) || iM19632j == 204 || iM19632j == 304) && AbstractC9920d.m20040v(c9745y) == -1 && !AbstractC10819z.m23230C("chunked", C9745y.m19626p(c9745y, "Transfer-Encoding", null, 2, null), true)) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x00bc, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00bc, code lost:
    
        continue;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0085  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m22616d(okio.Buffer r7, java.util.List r8) {
        /*
            r0 = 0
        L1:
            r1 = r0
        L2:
            if (r1 != 0) goto Lf
            m22620h(r7)
            java.lang.String r1 = m22618f(r7)
            if (r1 != 0) goto Lf
            goto Lb9
        Lf:
            boolean r2 = m22620h(r7)
            java.lang.String r3 = m22618f(r7)
            if (r3 != 0) goto L2e
            boolean r7 = r7.exhausted()
            if (r7 != 0) goto L21
            goto Lb9
        L21:
            je.g r7 = new je.g
            java.util.Map r0 = kotlin.collections.AbstractC9925a.m20088h()
            r7.<init>(r1, r0)
            r8.add(r7)
            return
        L2e:
            r4 = 61
            int r5 = ke.AbstractC9920d.m20003K(r7, r4)
            boolean r6 = m22620h(r7)
            if (r2 != 0) goto L69
            if (r6 != 0) goto L42
            boolean r2 = r7.exhausted()
            if (r2 == 0) goto L69
        L42:
            je.g r2 = new je.g
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r3)
            java.lang.String r3 = "="
            java.lang.String r3 = p310qd.AbstractC10819z.m23234G(r3, r5)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            java.util.Map r3 = java.util.Collections.singletonMap(r0, r3)
            java.lang.String r4 = "singletonMap<String, Str…ek + \"=\".repeat(eqCount))"
            kotlin.jvm.internal.AbstractC9979u.m20293f(r3, r4)
            r2.<init>(r1, r3)
            r8.add(r2)
            goto L1
        L69:
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            int r6 = ke.AbstractC9920d.m20003K(r7, r4)
            int r5 = r5 + r6
        L73:
            if (r3 != 0) goto L83
            java.lang.String r3 = m22618f(r7)
            boolean r5 = m22620h(r7)
            if (r5 != 0) goto Lbc
            int r5 = ke.AbstractC9920d.m20003K(r7, r4)
        L83:
            if (r5 == 0) goto Lbc
            r6 = 1
            if (r5 <= r6) goto L89
            goto Lb9
        L89:
            boolean r6 = m22620h(r7)
            if (r6 == 0) goto L90
            goto Lb9
        L90:
            r6 = 34
            boolean r6 = m22621i(r7, r6)
            if (r6 == 0) goto L9d
            java.lang.String r6 = m22617e(r7)
            goto La1
        L9d:
            java.lang.String r6 = m22618f(r7)
        La1:
            if (r6 != 0) goto La4
            goto Lb9
        La4:
            java.lang.Object r3 = r2.put(r3, r6)
            java.lang.String r3 = (java.lang.String) r3
            if (r3 == 0) goto Lad
            goto Lb9
        Lad:
            boolean r3 = m22620h(r7)
            if (r3 != 0) goto Lba
            boolean r3 = r7.exhausted()
            if (r3 != 0) goto Lba
        Lb9:
            return
        Lba:
            r3 = r0
            goto L73
        Lbc:
            je.g r4 = new je.g
            r4.<init>(r1, r2)
            r8.add(r4)
            r1 = r3
            goto L2
        */
        throw new UnsupportedOperationException("Method not decompiled: pe.AbstractC10678e.m22616d(okio.Buffer, java.util.List):void");
    }

    /* renamed from: e */
    public static final String m22617e(Buffer buffer) {
        if (buffer.readByte() != 34) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        Buffer buffer2 = new Buffer();
        while (true) {
            long jIndexOfElement = buffer.indexOfElement(f25731a);
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

    /* renamed from: f */
    public static final String m22618f(Buffer buffer) {
        long jIndexOfElement = buffer.indexOfElement(f25732b);
        if (jIndexOfElement == -1) {
            jIndexOfElement = buffer.size();
        }
        if (jIndexOfElement != 0) {
            return buffer.readUtf8(jIndexOfElement);
        }
        return null;
    }

    /* renamed from: g */
    public static final void m22619g(InterfaceC9731k interfaceC9731k, C9738r url, C9737q headers) {
        AbstractC9979u.m20294g(interfaceC9731k, "<this>");
        AbstractC9979u.m20294g(url, "url");
        AbstractC9979u.m20294g(headers, "headers");
        if (interfaceC9731k == InterfaceC9731k.f22724b) {
            return;
        }
        List listM19336e = C9730j.f22709j.m19336e(url, headers);
        if (listM19336e.isEmpty()) {
            return;
        }
        interfaceC9731k.mo19340a(url, listM19336e);
    }

    /* renamed from: h */
    public static final boolean m22620h(Buffer buffer) {
        boolean z10 = false;
        while (!buffer.exhausted()) {
            byte b10 = buffer.getByte(0L);
            if (b10 == 44) {
                buffer.readByte();
                z10 = true;
            } else {
                if (b10 != 32 && b10 != 9) {
                    break;
                }
                buffer.readByte();
            }
        }
        return z10;
    }

    /* renamed from: i */
    public static final boolean m22621i(Buffer buffer, byte b10) {
        return !buffer.exhausted() && buffer.getByte(0L) == b10;
    }
}
