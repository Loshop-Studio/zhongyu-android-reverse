package p122t;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.ComponentCallbacks2C2858c;
import java.security.MessageDigest;
import p076j.InterfaceC3797g;
import p093m.InterfaceC4361j;
import p098n.InterfaceC4395d;

/* renamed from: t.s */
/* loaded from: classes2.dex */
public class C4573s implements InterfaceC3797g {

    /* renamed from: b */
    public final InterfaceC3797g f5745b;

    /* renamed from: c */
    public final boolean f5746c;

    public C4573s(InterfaceC3797g interfaceC3797g, boolean z3) {
        this.f5745b = interfaceC3797g;
        this.f5746c = z3;
    }

    @Override // p076j.InterfaceC3797g
    /* renamed from: a */
    public InterfaceC4361j mo4955a(Context context, InterfaceC4361j interfaceC4361j, int i4, int i5) {
        InterfaceC4395d interfaceC4395dM1691f = ComponentCallbacks2C2858c.m1680c(context).m1691f();
        Drawable drawable = (Drawable) interfaceC4361j.get();
        InterfaceC4361j interfaceC4361jM6293a = AbstractC4572r.m6293a(interfaceC4395dM1691f, drawable, i4, i5);
        if (interfaceC4361jM6293a != null) {
            InterfaceC4361j interfaceC4361jMo4955a = this.f5745b.mo4955a(context, interfaceC4361jM6293a, i4, i5);
            if (!interfaceC4361jMo4955a.equals(interfaceC4361jM6293a)) {
                return m6296d(context, interfaceC4361jMo4955a);
            }
            interfaceC4361jMo4955a.recycle();
            return interfaceC4361j;
        }
        if (!this.f5746c) {
            return interfaceC4361j;
        }
        throw new IllegalArgumentException("Unable to convert " + drawable + " to a Bitmap");
    }

    @Override // p076j.InterfaceC3792b
    /* renamed from: b */
    public void mo4729b(MessageDigest messageDigest) {
        this.f5745b.mo4729b(messageDigest);
    }

    /* renamed from: c */
    public InterfaceC3797g m6295c() {
        return this;
    }

    /* renamed from: d */
    public final InterfaceC4361j m6296d(Context context, InterfaceC4361j interfaceC4361j) {
        return C4578x.m6304d(context.getResources(), interfaceC4361j);
    }

    @Override // p076j.InterfaceC3792b
    public boolean equals(Object obj) {
        if (obj instanceof C4573s) {
            return this.f5745b.equals(((C4573s) obj).f5745b);
        }
        return false;
    }

    @Override // p076j.InterfaceC3792b
    public int hashCode() {
        return this.f5745b.hashCode();
    }
}
