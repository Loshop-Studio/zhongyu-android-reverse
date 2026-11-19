package okhttp3.internal.platform;

import android.content.Context;
import android.os.Build;
import p137q5.InterfaceC7630e;
import p144r5.C7657g;

/* renamed from: okhttp3.internal.platform.d */
/* loaded from: classes4.dex */
public final class C7537d {

    /* renamed from: a */
    public static final C7537d f9997a = new C7537d();

    /* renamed from: a */
    public final AbstractC7536c m8933a() {
        C7657g.f10096a.m9089b();
        AbstractC7536c abstractC7536cM8915a = C7534a.f9983f.m8915a();
        if (abstractC7536cM8915a == null) {
            abstractC7536cM8915a = C7535b.f9987f.m8920a();
        }
        if (abstractC7536cM8915a != null) {
            return abstractC7536cM8915a;
        }
        throw new IllegalStateException("Expected Android API level 21+ but was " + Build.VERSION.SDK_INT);
    }

    /* renamed from: b */
    public final Context m8934b() {
        Object objM8931e = AbstractC7536c.f9994a.m8931e();
        InterfaceC7630e interfaceC7630e = objM8931e instanceof InterfaceC7630e ? (InterfaceC7630e) objM8931e : null;
        if (interfaceC7630e != null) {
            return interfaceC7630e.mo8905a();
        }
        return null;
    }

    /* renamed from: c */
    public final boolean m8935c() {
        return true;
    }

    /* renamed from: d */
    public final void m8936d(Context context) {
        Object objM8931e = AbstractC7536c.f9994a.m8931e();
        InterfaceC7630e interfaceC7630e = objM8931e instanceof InterfaceC7630e ? (InterfaceC7630e) objM8931e : null;
        if (interfaceC7630e != null) {
            interfaceC7630e.mo8906b(context);
        }
    }
}
