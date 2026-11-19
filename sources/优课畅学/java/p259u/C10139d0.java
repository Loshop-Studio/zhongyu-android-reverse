package p259u;

import android.graphics.Bitmap;
import p116h0.AbstractC8707k;
import p160l.C9230d;
import p160l.InterfaceC9231e;
import p182n.InterfaceC9357j;

/* renamed from: u.d0 */
/* loaded from: classes3.dex */
public final class C10139d0 implements InterfaceC9231e {
    @Override // p160l.InterfaceC9231e
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC9357j mo3061a(Bitmap bitmap, int i10, int i11, C9230d c9230d) {
        return new a(bitmap);
    }

    @Override // p160l.InterfaceC9231e
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo3062b(Bitmap bitmap, C9230d c9230d) {
        return true;
    }

    /* renamed from: u.d0$a */
    public static final class a implements InterfaceC9357j {

        /* renamed from: a */
        public final Bitmap f20263a;

        public a(Bitmap bitmap) {
            this.f20263a = bitmap;
        }

        @Override // p182n.InterfaceC9357j
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Bitmap get() {
            return this.f20263a;
        }

        @Override // p182n.InterfaceC9357j
        /* renamed from: b */
        public Class mo3016b() {
            return Bitmap.class;
        }

        @Override // p182n.InterfaceC9357j
        public int getSize() {
            return AbstractC8707k.m14190h(this.f20263a);
        }

        @Override // p182n.InterfaceC9357j
        public void recycle() {
        }
    }
}
