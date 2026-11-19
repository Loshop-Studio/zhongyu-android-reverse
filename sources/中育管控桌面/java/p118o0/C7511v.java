package p118o0;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import p016b1.AbstractC4408j;
import p067h0.InterfaceC6437g;
import p067h0.InterfaceC6440j;

/* renamed from: o0.v */
/* loaded from: classes3.dex */
public final class C7511v implements InterfaceC6440j, InterfaceC6437g {

    /* renamed from: a */
    public final Resources f9697a;

    /* renamed from: b */
    public final InterfaceC6440j f9698b;

    public C7511v(Resources resources, InterfaceC6440j interfaceC6440j) {
        this.f9697a = (Resources) AbstractC4408j.m1438d(resources);
        this.f9698b = (InterfaceC6440j) AbstractC4408j.m1438d(interfaceC6440j);
    }

    /* renamed from: c */
    public static InterfaceC6440j m8643c(Resources resources, InterfaceC6440j interfaceC6440j) {
        if (interfaceC6440j == null) {
            return null;
        }
        return new C7511v(resources, interfaceC6440j);
    }

    @Override // p067h0.InterfaceC6440j
    /* renamed from: a */
    public Class mo2749a() {
        return BitmapDrawable.class;
    }

    @Override // p067h0.InterfaceC6440j
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public BitmapDrawable get() {
        return new BitmapDrawable(this.f9697a, (Bitmap) this.f9698b.get());
    }

    @Override // p067h0.InterfaceC6440j
    public int getSize() {
        return this.f9698b.getSize();
    }

    @Override // p067h0.InterfaceC6437g
    public void initialize() {
        InterfaceC6440j interfaceC6440j = this.f9698b;
        if (interfaceC6440j instanceof InterfaceC6437g) {
            ((InterfaceC6437g) interfaceC6440j).initialize();
        }
    }

    @Override // p067h0.InterfaceC6440j
    public void recycle() {
        this.f9698b.recycle();
    }
}
