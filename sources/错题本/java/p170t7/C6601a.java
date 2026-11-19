package p170t7;

import java.io.IOException;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.C5834o;
import kotlin.text.AbstractC5855p;
import okhttp3.C6329q;
import okio.BufferedSource;

/* renamed from: t7.a */
/* loaded from: classes4.dex */
public final class C6601a {

    /* renamed from: a */
    public final BufferedSource f11017a;

    /* renamed from: b */
    public long f11018b;

    public C6601a(BufferedSource source) {
        AbstractC5830k.m5330g(source, "source");
        this.f11017a = source;
        this.f11018b = 262144L;
    }

    /* renamed from: a */
    public final C6329q m6249a() throws IOException {
        C5834o c5834o = new C5834o(2, false);
        while (true) {
            String utf8LineStrict = this.f11017a.readUtf8LineStrict(this.f11018b);
            this.f11018b -= utf8LineStrict.length();
            if (utf8LineStrict.length() == 0) {
                return c5834o.m5348f();
            }
            int iM5379M = AbstractC5855p.m5379M(utf8LineStrict, ':', 1, 4);
            if (iM5379M != -1) {
                String strSubstring = utf8LineStrict.substring(0, iM5379M);
                AbstractC5830k.m5329f(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                String strSubstring2 = utf8LineStrict.substring(iM5379M + 1);
                AbstractC5830k.m5329f(strSubstring2, "this as java.lang.String).substring(startIndex)");
                c5834o.m5345c(strSubstring, strSubstring2);
            } else if (utf8LineStrict.charAt(0) == ':') {
                String strSubstring3 = utf8LineStrict.substring(1);
                AbstractC5830k.m5329f(strSubstring3, "this as java.lang.String).substring(startIndex)");
                c5834o.m5345c("", strSubstring3);
            } else {
                c5834o.m5345c("", utf8LineStrict);
            }
        }
    }
}
