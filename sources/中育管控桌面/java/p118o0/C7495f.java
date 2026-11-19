package p118o0;

import android.graphics.Bitmap;
import p016b1.AbstractC4408j;
import p016b1.AbstractC4409k;
import p067h0.InterfaceC6437g;
import p067h0.InterfaceC6440j;
import p074i0.InterfaceC6499d;

/* renamed from: o0.f */
/* loaded from: classes3.dex */
public class C7495f implements InterfaceC6440j, InterfaceC6437g {

    /* renamed from: a */
    public final Bitmap f9677a;

    /* renamed from: b */
    public final InterfaceC6499d f9678b;

    public C7495f(Bitmap bitmap, InterfaceC6499d interfaceC6499d) {
        this.f9677a = (Bitmap) AbstractC4408j.m1439e(bitmap, "Bitmap must not be null");
        this.f9678b = (InterfaceC6499d) AbstractC4408j.m1439e(interfaceC6499d, "BitmapPool must not be null");
    }

    /* renamed from: c */
    public static C7495f m8619c(Bitmap bitmap, InterfaceC6499d interfaceC6499d) {
        if (bitmap == null) {
            return null;
        }
        return new C7495f(bitmap, interfaceC6499d);
    }

    @Override // p067h0.InterfaceC6440j
    /* renamed from: a */
    public Class mo2749a() {
        return Bitmap.class;
    }

    @Override // p067h0.InterfaceC6440j
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Bitmap get() {
        return this.f9677a;
    }

    @Override // p067h0.InterfaceC6440j
    public int getSize() {
        return AbstractC4409k.m1447h(this.f9677a);
    }

    @Override // p067h0.InterfaceC6437g
    public void initialize() {
        this.f9677a.prepareToDraw();
    }

    @Override // p067h0.InterfaceC6440j
    public void recycle() {
        this.f9678b.mo7197c(this.f9677a);
    }
}
