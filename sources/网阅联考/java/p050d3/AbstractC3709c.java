package p050d3;

import java.util.List;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p004a3.C0021k;

/* renamed from: d3.c */
/* loaded from: classes2.dex */
public abstract class AbstractC3709c {

    /* renamed from: a */
    public static final a f4333a = new a(null);

    /* renamed from: d3.c$a */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final AbstractC3709c m4698a(X509TrustManager trustManager) {
            Intrinsics.checkNotNullParameter(trustManager, "trustManager");
            return C0021k.f39c.m71g().mo26c(trustManager);
        }
    }

    /* renamed from: a */
    public abstract List mo1513a(List list, String str);
}
