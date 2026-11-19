package p261v0;

import android.graphics.Bitmap;
import p117i1.AbstractC7651j;
import p117i1.AbstractC7652k;
import p184o0.InterfaceC8687g;
import p184o0.InterfaceC8690j;
import p195p0.InterfaceC8804d;

/* renamed from: v0.f */
/* loaded from: classes3.dex */
public class C9633f implements InterfaceC8690j, InterfaceC8687g {

    /* renamed from: a */
    public final Bitmap f16820a;

    /* renamed from: b */
    public final InterfaceC8804d f16821b;

    public C9633f(Bitmap bitmap, InterfaceC8804d interfaceC8804d) {
        this.f16820a = (Bitmap) AbstractC7651j.m12684e(bitmap, "Bitmap must not be null");
        this.f16821b = (InterfaceC8804d) AbstractC7651j.m12684e(interfaceC8804d, "BitmapPool must not be null");
    }

    /* renamed from: c */
    public static C9633f m16002c(Bitmap bitmap, InterfaceC8804d interfaceC8804d) {
        if (bitmap == null) {
            return null;
        }
        return new C9633f(bitmap, interfaceC8804d);
    }

    @Override // p184o0.InterfaceC8690j
    /* renamed from: a */
    public Class mo3569a() {
        return Bitmap.class;
    }

    @Override // p184o0.InterfaceC8690j
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Bitmap get() {
        return this.f16820a;
    }

    @Override // p184o0.InterfaceC8690j
    public int getSize() {
        return AbstractC7652k.m12692h(this.f16820a);
    }

    @Override // p184o0.InterfaceC8687g
    public void initialize() {
        this.f16820a.prepareToDraw();
    }

    @Override // p184o0.InterfaceC8690j
    public void recycle() {
        this.f16821b.mo14712c(this.f16820a);
    }
}
