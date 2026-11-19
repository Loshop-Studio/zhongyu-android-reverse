package p302x9;

import java.util.List;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import okhttp3.internal.platform.AbstractC9570c;

/* renamed from: x9.c */
/* loaded from: classes5.dex */
public abstract class AbstractC10588c {

    /* renamed from: a */
    public static final a f20982a = new a(null);

    /* renamed from: x9.c$a */
    public static final class a {
        public /* synthetic */ a(AbstractC9126n abstractC9126n) {
            this();
        }

        /* renamed from: a */
        public final AbstractC10588c m19744a(X509TrustManager trustManager) {
            AbstractC9133u.m16133g(trustManager, "trustManager");
            return AbstractC9570c.f19216a.m18112e().mo18088e(trustManager);
        }

        public a() {
        }
    }

    /* renamed from: a */
    public abstract List mo19122a(List list, String str);
}
