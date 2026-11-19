package p259u;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.ComponentCallbacks2C5391b;
import java.security.MessageDigest;
import p160l.InterfaceC9233g;
import p182n.InterfaceC9357j;
import p193o.InterfaceC9500d;

/* renamed from: u.t */
/* loaded from: classes3.dex */
public class C10156t implements InterfaceC9233g {

    /* renamed from: b */
    public final InterfaceC9233g f20273b;

    /* renamed from: c */
    public final boolean f20274c;

    public C10156t(InterfaceC9233g interfaceC9233g, boolean z10) {
        this.f20273b = interfaceC9233g;
        this.f20274c = z10;
    }

    @Override // p160l.InterfaceC9233g
    /* renamed from: a */
    public InterfaceC9357j mo16944a(Context context, InterfaceC9357j interfaceC9357j, int i10, int i11) {
        InterfaceC9500d interfaceC9500dM2743f = ComponentCallbacks2C5391b.m2732c(context).m2743f();
        Drawable drawable = (Drawable) interfaceC9357j.get();
        InterfaceC9357j interfaceC9357jM19009a = AbstractC10155s.m19009a(interfaceC9500dM2743f, drawable, i10, i11);
        if (interfaceC9357jM19009a != null) {
            InterfaceC9357j interfaceC9357jMo16944a = this.f20273b.mo16944a(context, interfaceC9357jM19009a, i10, i11);
            if (!interfaceC9357jMo16944a.equals(interfaceC9357jM19009a)) {
                return m19012d(context, interfaceC9357jMo16944a);
            }
            interfaceC9357jMo16944a.recycle();
            return interfaceC9357j;
        }
        if (!this.f20274c) {
            return interfaceC9357j;
        }
        throw new IllegalArgumentException("Unable to convert " + drawable + " to a Bitmap");
    }

    @Override // p160l.InterfaceC9228b
    /* renamed from: b */
    public void mo13883b(MessageDigest messageDigest) {
        this.f20273b.mo13883b(messageDigest);
    }

    /* renamed from: d */
    public final InterfaceC9357j m19012d(Context context, InterfaceC9357j interfaceC9357j) {
        return C10161y.m19023c(context.getResources(), interfaceC9357j);
    }

    @Override // p160l.InterfaceC9228b
    public boolean equals(Object obj) {
        if (obj instanceof C10156t) {
            return this.f20273b.equals(((C10156t) obj).f20273b);
        }
        return false;
    }

    @Override // p160l.InterfaceC9228b
    public int hashCode() {
        return this.f20273b.hashCode();
    }

    /* renamed from: c */
    public InterfaceC9233g m19011c() {
        return this;
    }
}
