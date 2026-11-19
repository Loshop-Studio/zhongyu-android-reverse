package p259u;

import android.graphics.Bitmap;
import p116h0.AbstractC8706j;
import p116h0.AbstractC8707k;
import p182n.InterfaceC9354g;
import p182n.InterfaceC9357j;
import p193o.InterfaceC9500d;

/* renamed from: u.f */
/* loaded from: classes3.dex */
public class C10142f implements InterfaceC9357j, InterfaceC9354g {

    /* renamed from: a */
    public final Bitmap f20265a;

    /* renamed from: b */
    public final InterfaceC9500d f20266b;

    public C10142f(Bitmap bitmap, InterfaceC9500d interfaceC9500d) {
        this.f20265a = (Bitmap) AbstractC8706j.m14182e(bitmap, "Bitmap must not be null");
        this.f20266b = (InterfaceC9500d) AbstractC8706j.m14182e(interfaceC9500d, "BitmapPool must not be null");
    }

    /* renamed from: c */
    public static C10142f m18997c(Bitmap bitmap, InterfaceC9500d interfaceC9500d) {
        if (bitmap == null) {
            return null;
        }
        return new C10142f(bitmap, interfaceC9500d);
    }

    @Override // p182n.InterfaceC9357j
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Bitmap get() {
        return this.f20265a;
    }

    @Override // p182n.InterfaceC9357j
    /* renamed from: b */
    public Class mo3016b() {
        return Bitmap.class;
    }

    @Override // p182n.InterfaceC9357j
    public int getSize() {
        return AbstractC8707k.m14190h(this.f20265a);
    }

    @Override // p182n.InterfaceC9354g
    public void initialize() {
        this.f20265a.prepareToDraw();
    }

    @Override // p182n.InterfaceC9357j
    public void recycle() {
        this.f20266b.mo17620b(this.f20265a);
    }
}
