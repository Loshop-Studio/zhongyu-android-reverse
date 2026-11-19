package p228r0;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import p091e1.AbstractC7837i;
import p152k0.InterfaceC8256g;
import p152k0.InterfaceC8259j;

/* renamed from: r0.u */
/* loaded from: classes3.dex */
public final class C9411u implements InterfaceC8259j, InterfaceC8256g {

    /* renamed from: a */
    public final Resources f16406a;

    /* renamed from: b */
    public final InterfaceC8259j f16407b;

    public C9411u(Resources resources, InterfaceC8259j interfaceC8259j) {
        this.f16406a = (Resources) AbstractC7837i.m12256d(resources);
        this.f16407b = (InterfaceC8259j) AbstractC7837i.m12256d(interfaceC8259j);
    }

    /* renamed from: c */
    public static InterfaceC8259j m15485c(Resources resources, InterfaceC8259j interfaceC8259j) {
        if (interfaceC8259j == null) {
            return null;
        }
        return new C9411u(resources, interfaceC8259j);
    }

    @Override // p152k0.InterfaceC8259j
    /* renamed from: a */
    public Class mo3221a() {
        return BitmapDrawable.class;
    }

    @Override // p152k0.InterfaceC8259j
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public BitmapDrawable get() {
        return new BitmapDrawable(this.f16406a, (Bitmap) this.f16407b.get());
    }

    @Override // p152k0.InterfaceC8259j
    public int getSize() {
        return this.f16407b.getSize();
    }

    @Override // p152k0.InterfaceC8256g
    public void initialize() {
        InterfaceC8259j interfaceC8259j = this.f16407b;
        if (interfaceC8259j instanceof InterfaceC8256g) {
            ((InterfaceC8256g) interfaceC8259j).initialize();
        }
    }

    @Override // p152k0.InterfaceC8259j
    public void recycle() {
        this.f16407b.recycle();
    }
}
