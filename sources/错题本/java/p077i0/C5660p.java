package p077i0;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.ComponentCallbacks2C3408b;
import java.security.MessageDigest;
import p016b0.InterfaceC3072g0;
import p024c0.InterfaceC3205b;
import p202y.InterfaceC6766i;

/* renamed from: i0.p */
/* loaded from: classes2.dex */
public final class C5660p implements InterfaceC6766i {

    /* renamed from: b */
    public final InterfaceC6766i f8816b;

    /* renamed from: c */
    public final boolean f8817c;

    public C5660p(InterfaceC6766i interfaceC6766i, boolean z8) {
        this.f8816b = interfaceC6766i;
        this.f8817c = z8;
    }

    @Override // p202y.InterfaceC6766i
    /* renamed from: a */
    public final InterfaceC3072g0 mo4937a(Context context, InterfaceC3072g0 interfaceC3072g0, int i, int i8) {
        InterfaceC3205b interfaceC3205b = ComponentCallbacks2C3408b.m2360c(context).f2199b;
        Drawable drawable = (Drawable) interfaceC3072g0.get();
        C5647c c5647cM4992a = AbstractC5659o.m4992a(interfaceC3205b, drawable, i, i8);
        if (c5647cM4992a != null) {
            InterfaceC3072g0 interfaceC3072g0Mo4937a = this.f8816b.mo4937a(context, c5647cM4992a, i, i8);
            if (!interfaceC3072g0Mo4937a.equals(c5647cM4992a)) {
                return new C5647c(context.getResources(), interfaceC3072g0Mo4937a);
            }
            interfaceC3072g0Mo4937a.recycle();
            return interfaceC3072g0;
        }
        if (!this.f8817c) {
            return interfaceC3072g0;
        }
        throw new IllegalArgumentException("Unable to convert " + drawable + " to a Bitmap");
    }

    @Override // p202y.InterfaceC6760c
    /* renamed from: b */
    public final void mo2013b(MessageDigest messageDigest) {
        this.f8816b.mo2013b(messageDigest);
    }

    @Override // p202y.InterfaceC6760c
    public final boolean equals(Object obj) {
        if (obj instanceof C5660p) {
            return this.f8816b.equals(((C5660p) obj).f8816b);
        }
        return false;
    }

    @Override // p202y.InterfaceC6760c
    public final int hashCode() {
        return this.f8816b.hashCode();
    }
}
