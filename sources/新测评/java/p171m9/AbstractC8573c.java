package p171m9;

import java.util.List;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p136j9.C7828j;

/* renamed from: m9.c */
/* loaded from: classes5.dex */
public abstract class AbstractC8573c {

    /* renamed from: a */
    public static final a f14215a = new a(null);

    /* renamed from: m9.c$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final AbstractC8573c m14112a(X509TrustManager trustManager) {
            Intrinsics.checkNotNullParameter(trustManager, "trustManager");
            return C7828j.f13560a.m13291g().mo13246c(trustManager);
        }

        public a() {
        }
    }

    /* renamed from: a */
    public abstract List mo13531a(List list, String str);
}
