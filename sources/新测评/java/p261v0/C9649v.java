package p261v0;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import p117i1.AbstractC7651j;
import p184o0.InterfaceC8687g;
import p184o0.InterfaceC8690j;

/* renamed from: v0.v */
/* loaded from: classes3.dex */
public final class C9649v implements InterfaceC8690j, InterfaceC8687g {

    /* renamed from: a */
    public final Resources f16840a;

    /* renamed from: b */
    public final InterfaceC8690j f16841b;

    public C9649v(Resources resources, InterfaceC8690j interfaceC8690j) {
        this.f16840a = (Resources) AbstractC7651j.m12683d(resources);
        this.f16841b = (InterfaceC8690j) AbstractC7651j.m12683d(interfaceC8690j);
    }

    /* renamed from: c */
    public static InterfaceC8690j m16026c(Resources resources, InterfaceC8690j interfaceC8690j) {
        if (interfaceC8690j == null) {
            return null;
        }
        return new C9649v(resources, interfaceC8690j);
    }

    @Override // p184o0.InterfaceC8690j
    /* renamed from: a */
    public Class mo3569a() {
        return BitmapDrawable.class;
    }

    @Override // p184o0.InterfaceC8690j
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public BitmapDrawable get() {
        return new BitmapDrawable(this.f16840a, (Bitmap) this.f16841b.get());
    }

    @Override // p184o0.InterfaceC8690j
    public int getSize() {
        return this.f16841b.getSize();
    }

    @Override // p184o0.InterfaceC8687g
    public void initialize() {
        InterfaceC8690j interfaceC8690j = this.f16841b;
        if (interfaceC8690j instanceof InterfaceC8687g) {
            ((InterfaceC8687g) interfaceC8690j).initialize();
        }
    }

    @Override // p184o0.InterfaceC8690j
    public void recycle() {
        this.f16841b.recycle();
    }
}
