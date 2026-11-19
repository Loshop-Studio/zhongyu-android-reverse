package p298q0;

import android.graphics.Bitmap;
import p109d1.AbstractC8909j;
import p109d1.AbstractC8910k;
import p198j0.InterfaceC9654g;
import p198j0.InterfaceC9657j;
import p213k0.InterfaceC9772d;

/* renamed from: q0.f */
/* loaded from: classes3.dex */
public class C10697f implements InterfaceC9657j, InterfaceC9654g {

    /* renamed from: c */
    public final Bitmap f25761c;

    /* renamed from: d */
    public final InterfaceC9772d f25762d;

    public C10697f(Bitmap bitmap, InterfaceC9772d interfaceC9772d) {
        this.f25761c = (Bitmap) AbstractC8909j.m17469e(bitmap, "Bitmap must not be null");
        this.f25762d = (InterfaceC9772d) AbstractC8909j.m17469e(interfaceC9772d, "BitmapPool must not be null");
    }

    /* renamed from: c */
    public static C10697f m22659c(Bitmap bitmap, InterfaceC9772d interfaceC9772d) {
        if (bitmap == null) {
            return null;
        }
        return new C10697f(bitmap, interfaceC9772d);
    }

    @Override // p198j0.InterfaceC9657j
    /* renamed from: a */
    public Class mo4219a() {
        return Bitmap.class;
    }

    @Override // p198j0.InterfaceC9657j
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Bitmap get() {
        return this.f25761c;
    }

    @Override // p198j0.InterfaceC9657j
    public int getSize() {
        return AbstractC8910k.m17477h(this.f25761c);
    }

    @Override // p198j0.InterfaceC9654g
    public void initialize() {
        this.f25761c.prepareToDraw();
    }

    @Override // p198j0.InterfaceC9657j
    public void recycle() {
        this.f25762d.mo19710c(this.f25761c);
    }
}
