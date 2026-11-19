package p298q0;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import p109d1.AbstractC8909j;
import p198j0.InterfaceC9654g;
import p198j0.InterfaceC9657j;

/* renamed from: q0.u */
/* loaded from: classes3.dex */
public final class C10712u implements InterfaceC9657j, InterfaceC9654g {

    /* renamed from: c */
    public final Resources f25780c;

    /* renamed from: d */
    public final InterfaceC9657j f25781d;

    public C10712u(Resources resources, InterfaceC9657j interfaceC9657j) {
        this.f25780c = (Resources) AbstractC8909j.m17468d(resources);
        this.f25781d = (InterfaceC9657j) AbstractC8909j.m17468d(interfaceC9657j);
    }

    /* renamed from: c */
    public static InterfaceC9657j m22683c(Resources resources, InterfaceC9657j interfaceC9657j) {
        if (interfaceC9657j == null) {
            return null;
        }
        return new C10712u(resources, interfaceC9657j);
    }

    @Override // p198j0.InterfaceC9657j
    /* renamed from: a */
    public Class mo4219a() {
        return BitmapDrawable.class;
    }

    @Override // p198j0.InterfaceC9657j
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public BitmapDrawable get() {
        return new BitmapDrawable(this.f25780c, (Bitmap) this.f25781d.get());
    }

    @Override // p198j0.InterfaceC9657j
    public int getSize() {
        return this.f25781d.getSize();
    }

    @Override // p198j0.InterfaceC9654g
    public void initialize() {
        InterfaceC9657j interfaceC9657j = this.f25781d;
        if (interfaceC9657j instanceof InterfaceC9654g) {
            ((InterfaceC9654g) interfaceC9657j).initialize();
        }
    }

    @Override // p198j0.InterfaceC9657j
    public void recycle() {
        this.f25781d.recycle();
    }
}
