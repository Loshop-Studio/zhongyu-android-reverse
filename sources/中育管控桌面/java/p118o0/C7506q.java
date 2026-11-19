package p118o0;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.ComponentCallbacks2C4678c;
import java.security.MessageDigest;
import p053f0.InterfaceC6288g;
import p067h0.InterfaceC6440j;
import p074i0.InterfaceC6499d;

/* renamed from: o0.q */
/* loaded from: classes3.dex */
public class C7506q implements InterfaceC6288g {

    /* renamed from: b */
    public final InterfaceC6288g f9685b;

    /* renamed from: c */
    public final boolean f9686c;

    public C7506q(InterfaceC6288g interfaceC6288g, boolean z6) {
        this.f9685b = interfaceC6288g;
        this.f9686c = z6;
    }

    @Override // p053f0.InterfaceC6288g
    /* renamed from: a */
    public InterfaceC6440j mo6424a(Context context, InterfaceC6440j interfaceC6440j, int i6, int i7) {
        InterfaceC6499d interfaceC6499dM2481f = ComponentCallbacks2C4678c.m2470c(context).m2481f();
        Drawable drawable = (Drawable) interfaceC6440j.get();
        InterfaceC6440j interfaceC6440jM8629a = AbstractC7505p.m8629a(interfaceC6499dM2481f, drawable, i6, i7);
        if (interfaceC6440jM8629a != null) {
            InterfaceC6440j interfaceC6440jMo6424a = this.f9685b.mo6424a(context, interfaceC6440jM8629a, i6, i7);
            if (!interfaceC6440jMo6424a.equals(interfaceC6440jM8629a)) {
                return m8632d(context, interfaceC6440jMo6424a);
            }
            interfaceC6440jMo6424a.recycle();
            return interfaceC6440j;
        }
        if (!this.f9686c) {
            return interfaceC6440j;
        }
        throw new IllegalArgumentException("Unable to convert " + drawable + " to a Bitmap");
    }

    @Override // p053f0.InterfaceC6283b
    /* renamed from: b */
    public void mo9b(MessageDigest messageDigest) {
        this.f9685b.mo9b(messageDigest);
    }

    /* renamed from: d */
    public final InterfaceC6440j m8632d(Context context, InterfaceC6440j interfaceC6440j) {
        return C7511v.m8643c(context.getResources(), interfaceC6440j);
    }

    @Override // p053f0.InterfaceC6283b
    public boolean equals(Object obj) {
        if (obj instanceof C7506q) {
            return this.f9685b.equals(((C7506q) obj).f9685b);
        }
        return false;
    }

    @Override // p053f0.InterfaceC6283b
    public int hashCode() {
        return this.f9685b.hashCode();
    }

    /* renamed from: c */
    public InterfaceC6288g m8631c() {
        return this;
    }
}
