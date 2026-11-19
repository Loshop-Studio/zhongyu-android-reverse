package p261v0;

import android.graphics.Bitmap;
import p117i1.AbstractC7652k;
import p162m0.C8539d;
import p162m0.InterfaceC8540e;
import p184o0.InterfaceC8690j;

/* renamed from: v0.z */
/* loaded from: classes3.dex */
public final class C9653z implements InterfaceC8540e {
    @Override // p162m0.InterfaceC8540e
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC8690j mo3617b(Bitmap bitmap, int i10, int i11, C8539d c8539d) {
        return new a(bitmap);
    }

    @Override // p162m0.InterfaceC8540e
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo3616a(Bitmap bitmap, C8539d c8539d) {
        return true;
    }

    /* renamed from: v0.z$a */
    public static final class a implements InterfaceC8690j {

        /* renamed from: a */
        public final Bitmap f16850a;

        public a(Bitmap bitmap) {
            this.f16850a = bitmap;
        }

        @Override // p184o0.InterfaceC8690j
        /* renamed from: a */
        public Class mo3569a() {
            return Bitmap.class;
        }

        @Override // p184o0.InterfaceC8690j
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Bitmap get() {
            return this.f16850a;
        }

        @Override // p184o0.InterfaceC8690j
        public int getSize() {
            return AbstractC7652k.m12692h(this.f16850a);
        }

        @Override // p184o0.InterfaceC8690j
        public void recycle() {
        }
    }
}
