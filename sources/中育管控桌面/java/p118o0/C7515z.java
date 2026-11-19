package p118o0;

import android.graphics.Bitmap;
import p016b1.AbstractC4409k;
import p053f0.C6285d;
import p053f0.InterfaceC6286e;
import p067h0.InterfaceC6440j;

/* renamed from: o0.z */
/* loaded from: classes3.dex */
public final class C7515z implements InterfaceC6286e {
    @Override // p053f0.InterfaceC6286e
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC6440j mo2796a(Bitmap bitmap, int i6, int i7, C6285d c6285d) {
        return new a(bitmap);
    }

    @Override // p053f0.InterfaceC6286e
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo2797b(Bitmap bitmap, C6285d c6285d) {
        return true;
    }

    /* renamed from: o0.z$a */
    public static final class a implements InterfaceC6440j {

        /* renamed from: a */
        public final Bitmap f9707a;

        public a(Bitmap bitmap) {
            this.f9707a = bitmap;
        }

        @Override // p067h0.InterfaceC6440j
        /* renamed from: a */
        public Class mo2749a() {
            return Bitmap.class;
        }

        @Override // p067h0.InterfaceC6440j
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Bitmap get() {
            return this.f9707a;
        }

        @Override // p067h0.InterfaceC6440j
        public int getSize() {
            return AbstractC4409k.m1447h(this.f9707a);
        }

        @Override // p067h0.InterfaceC6440j
        public void recycle() {
        }
    }
}
