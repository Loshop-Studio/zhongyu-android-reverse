package p228r0;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.ComponentCallbacks2C5471b;
import java.security.MessageDigest;
import p122h0.InterfaceC8087g;
import p152k0.InterfaceC8259j;
import p164l0.InterfaceC8867d;

/* renamed from: r0.p */
/* loaded from: classes3.dex */
public class C9406p implements InterfaceC8087g {

    /* renamed from: b */
    public final InterfaceC8087g f16395b;

    /* renamed from: c */
    public final boolean f16396c;

    public C9406p(InterfaceC8087g interfaceC8087g, boolean z9) {
        this.f16395b = interfaceC8087g;
        this.f16396c = z9;
    }

    @Override // p122h0.InterfaceC8082b
    /* renamed from: a */
    public void mo12082a(MessageDigest messageDigest) {
        this.f16395b.mo12082a(messageDigest);
    }

    @Override // p122h0.InterfaceC8087g
    /* renamed from: b */
    public InterfaceC8259j mo12912b(Context context, InterfaceC8259j interfaceC8259j, int i9, int i10) {
        InterfaceC8867d interfaceC8867dM3017f = ComponentCallbacks2C5471b.m3006c(context).m3017f();
        Drawable drawable = (Drawable) interfaceC8259j.get();
        InterfaceC8259j interfaceC8259jM15474a = AbstractC9405o.m15474a(interfaceC8867dM3017f, drawable, i9, i10);
        if (interfaceC8259jM15474a != null) {
            InterfaceC8259j interfaceC8259jMo12912b = this.f16395b.mo12912b(context, interfaceC8259jM15474a, i9, i10);
            if (!interfaceC8259jMo12912b.equals(interfaceC8259jM15474a)) {
                return m15477d(context, interfaceC8259jMo12912b);
            }
            interfaceC8259jMo12912b.recycle();
            return interfaceC8259j;
        }
        if (!this.f16396c) {
            return interfaceC8259j;
        }
        throw new IllegalArgumentException("Unable to convert " + drawable + " to a Bitmap");
    }

    /* renamed from: d */
    public final InterfaceC8259j m15477d(Context context, InterfaceC8259j interfaceC8259j) {
        return C9411u.m15485c(context.getResources(), interfaceC8259j);
    }

    @Override // p122h0.InterfaceC8082b
    public boolean equals(Object obj) {
        if (obj instanceof C9406p) {
            return this.f16395b.equals(((C9406p) obj).f16395b);
        }
        return false;
    }

    @Override // p122h0.InterfaceC8082b
    public int hashCode() {
        return this.f16395b.hashCode();
    }

    /* renamed from: c */
    public InterfaceC8087g m15476c() {
        return this;
    }
}
