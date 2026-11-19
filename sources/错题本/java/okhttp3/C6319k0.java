package okhttp3;

import java.util.regex.Pattern;
import kotlin.jvm.internal.AbstractC5830k;
import okio.BufferedSource;

/* renamed from: okhttp3.k0 */
/* loaded from: classes4.dex */
public final class C6319k0 extends AbstractC6323m0 {

    /* renamed from: a */
    public final /* synthetic */ int f10230a = 1;

    /* renamed from: b */
    public final long f10231b;

    /* renamed from: c */
    public final BufferedSource f10232c;

    /* renamed from: d */
    public final Object f10233d;

    public C6319k0(String str, long j7, BufferedSource source) {
        AbstractC5830k.m5330g(source, "source");
        this.f10233d = str;
        this.f10231b = j7;
        this.f10232c = source;
    }

    @Override // okhttp3.AbstractC6323m0
    public final long contentLength() {
        switch (this.f10230a) {
        }
        return this.f10231b;
    }

    @Override // okhttp3.AbstractC6323m0
    public final C6333u contentType() {
        int i = this.f10230a;
        Object obj = this.f10233d;
        switch (i) {
            case 0:
                return (C6333u) obj;
            default:
                String str = (String) obj;
                if (str == null) {
                    return null;
                }
                Pattern pattern = C6333u.f10275d;
                return AbstractC6326o.m5958h(str);
        }
    }

    @Override // okhttp3.AbstractC6323m0
    public final BufferedSource source() {
        switch (this.f10230a) {
        }
        return this.f10232c;
    }

    public C6319k0(C6333u c6333u, long j7, BufferedSource bufferedSource) {
        this.f10233d = c6333u;
        this.f10231b = j7;
        this.f10232c = bufferedSource;
    }
}
