package p165u5;

import java.util.List;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.platform.AbstractC7536c;

/* renamed from: u5.c */
/* loaded from: classes4.dex */
public abstract class AbstractC7777c {

    /* renamed from: a */
    public static final a f10302a = new a(null);

    /* renamed from: u5.c$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final AbstractC7777c m9308a(X509TrustManager trustManager) {
            Intrinsics.checkNotNullParameter(trustManager, "trustManager");
            return AbstractC7536c.f9994a.m8931e().mo8907e(trustManager);
        }

        public a() {
        }
    }

    /* renamed from: a */
    public abstract List mo9086a(List list, String str);
}
