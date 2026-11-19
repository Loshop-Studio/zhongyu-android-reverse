package p261v0;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.ComponentCallbacks2C5342b;
import java.security.MessageDigest;
import p162m0.InterfaceC8542g;
import p184o0.InterfaceC8690j;
import p195p0.InterfaceC8804d;

/* renamed from: v0.q */
/* loaded from: classes3.dex */
public class C9644q implements InterfaceC8542g {

    /* renamed from: b */
    public final InterfaceC8542g f16828b;

    /* renamed from: c */
    public final boolean f16829c;

    public C9644q(InterfaceC8542g interfaceC8542g, boolean z9) {
        this.f16828b = interfaceC8542g;
        this.f16829c = z9;
    }

    @Override // p162m0.InterfaceC8537b
    /* renamed from: a */
    public void mo12541a(MessageDigest messageDigest) {
        this.f16828b.mo12541a(messageDigest);
    }

    @Override // p162m0.InterfaceC8542g
    /* renamed from: b */
    public InterfaceC8690j mo14061b(Context context, InterfaceC8690j interfaceC8690j, int i10, int i11) {
        InterfaceC8804d interfaceC8804dM3302f = ComponentCallbacks2C5342b.m3291c(context).m3302f();
        Drawable drawable = (Drawable) interfaceC8690j.get();
        InterfaceC8690j interfaceC8690jM16012a = AbstractC9643p.m16012a(interfaceC8804dM3302f, drawable, i10, i11);
        if (interfaceC8690jM16012a != null) {
            InterfaceC8690j interfaceC8690jMo14061b = this.f16828b.mo14061b(context, interfaceC8690jM16012a, i10, i11);
            if (!interfaceC8690jMo14061b.equals(interfaceC8690jM16012a)) {
                return m16015d(context, interfaceC8690jMo14061b);
            }
            interfaceC8690jMo14061b.recycle();
            return interfaceC8690j;
        }
        if (!this.f16829c) {
            return interfaceC8690j;
        }
        throw new IllegalArgumentException("Unable to convert " + drawable + " to a Bitmap");
    }

    /* renamed from: d */
    public final InterfaceC8690j m16015d(Context context, InterfaceC8690j interfaceC8690j) {
        return C9649v.m16026c(context.getResources(), interfaceC8690j);
    }

    @Override // p162m0.InterfaceC8537b
    public boolean equals(Object obj) {
        if (obj instanceof C9644q) {
            return this.f16828b.equals(((C9644q) obj).f16828b);
        }
        return false;
    }

    @Override // p162m0.InterfaceC8537b
    public int hashCode() {
        return this.f16828b.hashCode();
    }

    /* renamed from: c */
    public InterfaceC8542g m16014c() {
        return this;
    }
}
