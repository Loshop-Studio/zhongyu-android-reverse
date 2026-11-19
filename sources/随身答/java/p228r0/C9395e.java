package p228r0;

import android.graphics.Bitmap;
import p091e1.AbstractC7837i;
import p091e1.AbstractC7838j;
import p152k0.InterfaceC8256g;
import p152k0.InterfaceC8259j;
import p164l0.InterfaceC8867d;

/* renamed from: r0.e */
/* loaded from: classes3.dex */
public class C9395e implements InterfaceC8259j, InterfaceC8256g {

    /* renamed from: a */
    public final Bitmap f16387a;

    /* renamed from: b */
    public final InterfaceC8867d f16388b;

    public C9395e(Bitmap bitmap, InterfaceC8867d interfaceC8867d) {
        this.f16387a = (Bitmap) AbstractC7837i.m12257e(bitmap, "Bitmap must not be null");
        this.f16388b = (InterfaceC8867d) AbstractC7837i.m12257e(interfaceC8867d, "BitmapPool must not be null");
    }

    /* renamed from: c */
    public static C9395e m15464c(Bitmap bitmap, InterfaceC8867d interfaceC8867d) {
        if (bitmap == null) {
            return null;
        }
        return new C9395e(bitmap, interfaceC8867d);
    }

    @Override // p152k0.InterfaceC8259j
    /* renamed from: a */
    public Class mo3221a() {
        return Bitmap.class;
    }

    @Override // p152k0.InterfaceC8259j
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Bitmap get() {
        return this.f16387a;
    }

    @Override // p152k0.InterfaceC8259j
    public int getSize() {
        return AbstractC7838j.m12264g(this.f16387a);
    }

    @Override // p152k0.InterfaceC8256g
    public void initialize() {
        this.f16387a.prepareToDraw();
    }

    @Override // p152k0.InterfaceC8259j
    public void recycle() {
        this.f16388b.mo13732c(this.f16387a);
    }
}
