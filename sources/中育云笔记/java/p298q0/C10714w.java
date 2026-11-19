package p298q0;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import p168h0.C9438e;
import p168h0.InterfaceC9439f;
import p198j0.InterfaceC9657j;
import p213k0.InterfaceC9772d;
import p328s0.C11032k;

/* renamed from: q0.w */
/* loaded from: classes3.dex */
public class C10714w implements InterfaceC9439f {

    /* renamed from: a */
    public final C11032k f25783a;

    /* renamed from: b */
    public final InterfaceC9772d f25784b;

    public C10714w(C11032k c11032k, InterfaceC9772d interfaceC9772d) {
        this.f25783a = c11032k;
        this.f25784b = interfaceC9772d;
    }

    @Override // p168h0.InterfaceC9439f
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC9657j mo4266b(Uri uri, int i10, int i11, C9438e c9438e) {
        InterfaceC9657j interfaceC9657jMo4266b = this.f25783a.mo4266b(uri, i10, i11, c9438e);
        if (interfaceC9657jMo4266b == null) {
            return null;
        }
        return AbstractC10706o.m22669a(this.f25784b, (Drawable) interfaceC9657jMo4266b.get(), i10, i11);
    }

    @Override // p168h0.InterfaceC9439f
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo4265a(Uri uri, C9438e c9438e) {
        return "android.resource".equals(uri.getScheme());
    }
}
