package p298q0;

import android.graphics.Bitmap;
import p109d1.AbstractC8910k;
import p168h0.C9438e;
import p168h0.InterfaceC9439f;
import p198j0.InterfaceC9657j;

/* renamed from: q0.z */
/* loaded from: classes3.dex */
public final class C10717z implements InterfaceC9439f {
    @Override // p168h0.InterfaceC9439f
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC9657j mo4266b(Bitmap bitmap, int i10, int i11, C9438e c9438e) {
        return new a(bitmap);
    }

    @Override // p168h0.InterfaceC9439f
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo4265a(Bitmap bitmap, C9438e c9438e) {
        return true;
    }

    /* renamed from: q0.z$a */
    public static final class a implements InterfaceC9657j {

        /* renamed from: c */
        public final Bitmap f25793c;

        public a(Bitmap bitmap) {
            this.f25793c = bitmap;
        }

        @Override // p198j0.InterfaceC9657j
        /* renamed from: a */
        public Class mo4219a() {
            return Bitmap.class;
        }

        @Override // p198j0.InterfaceC9657j
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Bitmap get() {
            return this.f25793c;
        }

        @Override // p198j0.InterfaceC9657j
        public int getSize() {
            return AbstractC8910k.m17477h(this.f25793c);
        }

        @Override // p198j0.InterfaceC9657j
        public void recycle() {
        }
    }
}
