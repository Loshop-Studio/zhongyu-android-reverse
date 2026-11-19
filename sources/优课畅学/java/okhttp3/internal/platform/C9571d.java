package okhttp3.internal.platform;

import android.content.Context;
import android.os.Build;
import p258t9.InterfaceC10129e;
import p269u9.C10227g;

/* renamed from: okhttp3.internal.platform.d */
/* loaded from: classes5.dex */
public final class C9571d {

    /* renamed from: a */
    public static final C9571d f19219a = new C9571d();

    /* renamed from: a */
    public final AbstractC9570c m18114a() {
        C10227g.f20403a.m19125b();
        AbstractC9570c abstractC9570cM18096a = C9568a.f19205f.m18096a();
        if (abstractC9570cM18096a == null) {
            abstractC9570cM18096a = C9569b.f19209f.m18101a();
        }
        if (abstractC9570cM18096a != null) {
            return abstractC9570cM18096a;
        }
        throw new IllegalStateException("Expected Android API level 21+ but was " + Build.VERSION.SDK_INT);
    }

    /* renamed from: b */
    public final Context m18115b() {
        Object objM18112e = AbstractC9570c.f19216a.m18112e();
        InterfaceC10129e interfaceC10129e = objM18112e instanceof InterfaceC10129e ? (InterfaceC10129e) objM18112e : null;
        if (interfaceC10129e != null) {
            return interfaceC10129e.mo18086a();
        }
        return null;
    }

    /* renamed from: c */
    public final boolean m18116c() {
        return true;
    }

    /* renamed from: d */
    public final void m18117d(Context context) {
        Object objM18112e = AbstractC9570c.f19216a.m18112e();
        InterfaceC10129e interfaceC10129e = objM18112e instanceof InterfaceC10129e ? (InterfaceC10129e) objM18112e : null;
        if (interfaceC10129e != null) {
            interfaceC10129e.mo18087b(context);
        }
    }
}
