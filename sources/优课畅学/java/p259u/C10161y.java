package p259u;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import p116h0.AbstractC8706j;
import p182n.InterfaceC9354g;
import p182n.InterfaceC9357j;

/* renamed from: u.y */
/* loaded from: classes3.dex */
public final class C10161y implements InterfaceC9357j, InterfaceC9354g {

    /* renamed from: a */
    public final Resources f20285a;

    /* renamed from: b */
    public final InterfaceC9357j f20286b;

    public C10161y(Resources resources, InterfaceC9357j interfaceC9357j) {
        this.f20285a = (Resources) AbstractC8706j.m14181d(resources);
        this.f20286b = (InterfaceC9357j) AbstractC8706j.m14181d(interfaceC9357j);
    }

    /* renamed from: c */
    public static InterfaceC9357j m19023c(Resources resources, InterfaceC9357j interfaceC9357j) {
        if (interfaceC9357j == null) {
            return null;
        }
        return new C10161y(resources, interfaceC9357j);
    }

    @Override // p182n.InterfaceC9357j
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public BitmapDrawable get() {
        return new BitmapDrawable(this.f20285a, (Bitmap) this.f20286b.get());
    }

    @Override // p182n.InterfaceC9357j
    /* renamed from: b */
    public Class mo3016b() {
        return BitmapDrawable.class;
    }

    @Override // p182n.InterfaceC9357j
    public int getSize() {
        return this.f20286b.getSize();
    }

    @Override // p182n.InterfaceC9354g
    public void initialize() {
        InterfaceC9357j interfaceC9357j = this.f20286b;
        if (interfaceC9357j instanceof InterfaceC9354g) {
            ((InterfaceC9354g) interfaceC9357j).initialize();
        }
    }

    @Override // p182n.InterfaceC9357j
    public void recycle() {
        this.f20286b.recycle();
    }
}
