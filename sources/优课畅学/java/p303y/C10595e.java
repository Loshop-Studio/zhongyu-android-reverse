package p303y;

import android.content.Context;
import android.graphics.Bitmap;
import com.bumptech.glide.ComponentCallbacks2C5391b;
import com.bumptech.glide.load.resource.gif.GifDrawable;
import java.security.MessageDigest;
import p116h0.AbstractC8706j;
import p160l.InterfaceC9233g;
import p182n.InterfaceC9357j;
import p259u.C10142f;

/* renamed from: y.e */
/* loaded from: classes3.dex */
public class C10595e implements InterfaceC9233g {

    /* renamed from: b */
    public final InterfaceC9233g f20994b;

    public C10595e(InterfaceC9233g interfaceC9233g) {
        this.f20994b = (InterfaceC9233g) AbstractC8706j.m14181d(interfaceC9233g);
    }

    @Override // p160l.InterfaceC9233g
    /* renamed from: a */
    public InterfaceC9357j mo16944a(Context context, InterfaceC9357j interfaceC9357j, int i10, int i11) {
        GifDrawable gifDrawable = (GifDrawable) interfaceC9357j.get();
        InterfaceC9357j c10142f = new C10142f(gifDrawable.m3117e(), ComponentCallbacks2C5391b.m2732c(context).m2743f());
        InterfaceC9357j interfaceC9357jMo16944a = this.f20994b.mo16944a(context, c10142f, i10, i11);
        if (!c10142f.equals(interfaceC9357jMo16944a)) {
            c10142f.recycle();
        }
        gifDrawable.m3125m(this.f20994b, (Bitmap) interfaceC9357jMo16944a.get());
        return interfaceC9357j;
    }

    @Override // p160l.InterfaceC9228b
    /* renamed from: b */
    public void mo13883b(MessageDigest messageDigest) {
        this.f20994b.mo13883b(messageDigest);
    }

    @Override // p160l.InterfaceC9228b
    public boolean equals(Object obj) {
        if (obj instanceof C10595e) {
            return this.f20994b.equals(((C10595e) obj).f20994b);
        }
        return false;
    }

    @Override // p160l.InterfaceC9228b
    public int hashCode() {
        return this.f20994b.hashCode();
    }
}
