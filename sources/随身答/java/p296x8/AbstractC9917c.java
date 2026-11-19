package p296x8;

import java.util.List;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p266u8.C9734j;

/* renamed from: x8.c */
/* loaded from: classes5.dex */
public abstract class AbstractC9917c {

    /* renamed from: a */
    public static final a f17746a = new a(null);

    /* renamed from: x8.c$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final AbstractC9917c m16983a(X509TrustManager trustManager) {
            Intrinsics.checkNotNullParameter(trustManager, "trustManager");
            return C9734j.f17200a.m16271g().mo16226c(trustManager);
        }

        public a() {
        }
    }

    /* renamed from: a */
    public abstract List mo16564a(List list, String str);
}
