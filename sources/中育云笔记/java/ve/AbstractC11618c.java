package ve;

import java.util.List;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import se.C11192j;

/* renamed from: ve.c */
/* loaded from: classes6.dex */
public abstract class AbstractC11618c {

    /* renamed from: a */
    public static final a f27520a = new a(null);

    /* renamed from: ve.c$a */
    public static final class a {
        public /* synthetic */ a(AbstractC9972n abstractC9972n) {
            this();
        }

        /* renamed from: a */
        public final AbstractC11618c m25613a(X509TrustManager trustManager) {
            AbstractC9979u.m20294g(trustManager, "trustManager");
            return C11192j.f26882a.m24899g().mo24854c(trustManager);
        }

        public a() {
        }
    }

    /* renamed from: a */
    public abstract List mo25221a(List list, String str);
}
