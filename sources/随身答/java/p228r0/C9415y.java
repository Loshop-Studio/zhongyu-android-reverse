package p228r0;

import android.graphics.Bitmap;
import p091e1.AbstractC7838j;
import p122h0.C8084d;
import p122h0.InterfaceC8085e;
import p152k0.InterfaceC8259j;

/* renamed from: r0.y */
/* loaded from: classes3.dex */
public final class C9415y implements InterfaceC8085e {
    @Override // p122h0.InterfaceC8085e
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC8259j mo3290b(Bitmap bitmap, int i9, int i10, C8084d c8084d) {
        return new a(bitmap);
    }

    @Override // p122h0.InterfaceC8085e
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo3289a(Bitmap bitmap, C8084d c8084d) {
        return true;
    }

    /* renamed from: r0.y$a */
    public static final class a implements InterfaceC8259j {

        /* renamed from: a */
        public final Bitmap f16416a;

        public a(Bitmap bitmap) {
            this.f16416a = bitmap;
        }

        @Override // p152k0.InterfaceC8259j
        /* renamed from: a */
        public Class mo3221a() {
            return Bitmap.class;
        }

        @Override // p152k0.InterfaceC8259j
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Bitmap get() {
            return this.f16416a;
        }

        @Override // p152k0.InterfaceC8259j
        public int getSize() {
            return AbstractC7838j.m12264g(this.f16416a);
        }

        @Override // p152k0.InterfaceC8259j
        public void recycle() {
        }
    }
}
