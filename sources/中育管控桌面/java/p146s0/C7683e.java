package p146s0;

import android.content.Context;
import android.graphics.Bitmap;
import com.bumptech.glide.ComponentCallbacks2C4678c;
import com.bumptech.glide.load.resource.gif.GifDrawable;
import java.security.MessageDigest;
import p016b1.AbstractC4408j;
import p053f0.InterfaceC6288g;
import p067h0.InterfaceC6440j;
import p118o0.C7495f;

/* renamed from: s0.e */
/* loaded from: classes3.dex */
public class C7683e implements InterfaceC6288g {

    /* renamed from: b */
    public final InterfaceC6288g f10143b;

    public C7683e(InterfaceC6288g interfaceC6288g) {
        this.f10143b = (InterfaceC6288g) AbstractC4408j.m1438d(interfaceC6288g);
    }

    @Override // p053f0.InterfaceC6288g
    /* renamed from: a */
    public InterfaceC6440j mo6424a(Context context, InterfaceC6440j interfaceC6440j, int i6, int i7) {
        GifDrawable gifDrawable = (GifDrawable) interfaceC6440j.get();
        InterfaceC6440j c7495f = new C7495f(gifDrawable.m2852e(), ComponentCallbacks2C4678c.m2470c(context).m2481f());
        InterfaceC6440j interfaceC6440jMo6424a = this.f10143b.mo6424a(context, c7495f, i6, i7);
        if (!c7495f.equals(interfaceC6440jMo6424a)) {
            c7495f.recycle();
        }
        gifDrawable.m2860m(this.f10143b, (Bitmap) interfaceC6440jMo6424a.get());
        return interfaceC6440j;
    }

    @Override // p053f0.InterfaceC6283b
    /* renamed from: b */
    public void mo9b(MessageDigest messageDigest) {
        this.f10143b.mo9b(messageDigest);
    }

    @Override // p053f0.InterfaceC6283b
    public boolean equals(Object obj) {
        if (obj instanceof C7683e) {
            return this.f10143b.equals(((C7683e) obj).f10143b);
        }
        return false;
    }

    @Override // p053f0.InterfaceC6283b
    public int hashCode() {
        return this.f10143b.hashCode();
    }
}
