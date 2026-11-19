package p298q0;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.ComponentCallbacks2C5810b;
import java.security.MessageDigest;
import p168h0.InterfaceC9441h;
import p198j0.InterfaceC9657j;
import p213k0.InterfaceC9772d;

/* renamed from: q0.p */
/* loaded from: classes3.dex */
public class C10707p implements InterfaceC9441h {

    /* renamed from: b */
    public final InterfaceC9441h f25768b;

    /* renamed from: c */
    public final boolean f25769c;

    public C10707p(InterfaceC9441h interfaceC9441h, boolean z10) {
        this.f25768b = interfaceC9441h;
        this.f25769c = z10;
    }

    @Override // p168h0.InterfaceC9441h
    /* renamed from: a */
    public InterfaceC9657j mo18617a(Context context, InterfaceC9657j interfaceC9657j, int i10, int i11) {
        InterfaceC9772d interfaceC9772dM3952f = ComponentCallbacks2C5810b.m3940c(context).m3952f();
        Drawable drawable = (Drawable) interfaceC9657j.get();
        InterfaceC9657j interfaceC9657jM22669a = AbstractC10706o.m22669a(interfaceC9772dM3952f, drawable, i10, i11);
        if (interfaceC9657jM22669a != null) {
            InterfaceC9657j interfaceC9657jMo18617a = this.f25768b.mo18617a(context, interfaceC9657jM22669a, i10, i11);
            if (!interfaceC9657jMo18617a.equals(interfaceC9657jM22669a)) {
                return m22672d(context, interfaceC9657jMo18617a);
            }
            interfaceC9657jMo18617a.recycle();
            return interfaceC9657j;
        }
        if (!this.f25769c) {
            return interfaceC9657j;
        }
        throw new IllegalArgumentException("Unable to convert " + drawable + " to a Bitmap");
    }

    @Override // p168h0.InterfaceC9435b
    /* renamed from: b */
    public void mo2797b(MessageDigest messageDigest) {
        this.f25768b.mo2797b(messageDigest);
    }

    /* renamed from: d */
    public final InterfaceC9657j m22672d(Context context, InterfaceC9657j interfaceC9657j) {
        return C10712u.m22683c(context.getResources(), interfaceC9657j);
    }

    @Override // p168h0.InterfaceC9435b
    public boolean equals(Object obj) {
        if (obj instanceof C10707p) {
            return this.f25768b.equals(((C10707p) obj).f25768b);
        }
        return false;
    }

    @Override // p168h0.InterfaceC9435b
    public int hashCode() {
        return this.f25768b.hashCode();
    }

    /* renamed from: c */
    public InterfaceC9441h m22671c() {
        return this;
    }
}
