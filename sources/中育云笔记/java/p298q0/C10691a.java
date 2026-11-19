package p298q0;

import android.content.res.Resources;
import p109d1.AbstractC8909j;
import p168h0.C9438e;
import p168h0.InterfaceC9439f;
import p198j0.InterfaceC9657j;

/* renamed from: q0.a */
/* loaded from: classes3.dex */
public class C10691a implements InterfaceC9439f {

    /* renamed from: a */
    public final InterfaceC9439f f25753a;

    /* renamed from: b */
    public final Resources f25754b;

    public C10691a(Resources resources, InterfaceC9439f interfaceC9439f) {
        this.f25754b = (Resources) AbstractC8909j.m17468d(resources);
        this.f25753a = (InterfaceC9439f) AbstractC8909j.m17468d(interfaceC9439f);
    }

    @Override // p168h0.InterfaceC9439f
    /* renamed from: a */
    public boolean mo4265a(Object obj, C9438e c9438e) {
        return this.f25753a.mo4265a(obj, c9438e);
    }

    @Override // p168h0.InterfaceC9439f
    /* renamed from: b */
    public InterfaceC9657j mo4266b(Object obj, int i10, int i11, C9438e c9438e) {
        return C10712u.m22683c(this.f25754b, this.f25753a.mo4266b(obj, i10, i11, c9438e));
    }
}
