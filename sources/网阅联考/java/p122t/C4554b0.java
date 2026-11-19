package p122t;

import android.graphics.Bitmap;
import p062g0.AbstractC3750j;
import p076j.C3794d;
import p076j.InterfaceC3795e;
import p093m.InterfaceC4361j;

/* renamed from: t.b0 */
/* loaded from: classes2.dex */
public final class C4554b0 implements InterfaceC3795e {

    /* renamed from: t.b0$a */
    public static final class a implements InterfaceC4361j {

        /* renamed from: a */
        public final Bitmap f5722a;

        public a(Bitmap bitmap) {
            this.f5722a = bitmap;
        }

        @Override // p093m.InterfaceC4361j
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Bitmap get() {
            return this.f5722a;
        }

        @Override // p093m.InterfaceC4361j
        /* renamed from: b */
        public Class mo1898b() {
            return Bitmap.class;
        }

        @Override // p093m.InterfaceC4361j
        public int getSize() {
            return AbstractC3750j.m4776g(this.f5722a);
        }

        @Override // p093m.InterfaceC4361j
        public void recycle() {
        }
    }

    @Override // p076j.InterfaceC3795e
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC4361j mo1966b(Bitmap bitmap, int i4, int i5, C3794d c3794d) {
        return new a(bitmap);
    }

    @Override // p076j.InterfaceC3795e
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo1965a(Bitmap bitmap, C3794d c3794d) {
        return true;
    }
}
