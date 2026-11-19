package p228r0;

import android.content.res.Resources;
import p091e1.AbstractC7837i;
import p122h0.C8084d;
import p122h0.InterfaceC8085e;
import p152k0.InterfaceC8259j;

/* renamed from: r0.a */
/* loaded from: classes3.dex */
public class C9390a implements InterfaceC8085e {

    /* renamed from: a */
    public final InterfaceC8085e f16369a;

    /* renamed from: b */
    public final Resources f16370b;

    public C9390a(Resources resources, InterfaceC8085e interfaceC8085e) {
        this.f16370b = (Resources) AbstractC7837i.m12256d(resources);
        this.f16369a = (InterfaceC8085e) AbstractC7837i.m12256d(interfaceC8085e);
    }

    @Override // p122h0.InterfaceC8085e
    /* renamed from: a */
    public boolean mo3289a(Object obj, C8084d c8084d) {
        return this.f16369a.mo3289a(obj, c8084d);
    }

    @Override // p122h0.InterfaceC8085e
    /* renamed from: b */
    public InterfaceC8259j mo3290b(Object obj, int i9, int i10, C8084d c8084d) {
        return C9411u.m15485c(this.f16370b, this.f16369a.mo3290b(obj, i9, i10, c8084d));
    }
}
