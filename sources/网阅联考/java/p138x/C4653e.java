package p138x;

import android.content.Context;
import android.graphics.Bitmap;
import com.bumptech.glide.ComponentCallbacks2C2858c;
import com.bumptech.glide.load.resource.gif.GifDrawable;
import java.security.MessageDigest;
import p062g0.AbstractC3749i;
import p076j.InterfaceC3797g;
import p093m.InterfaceC4361j;
import p122t.C4559e;

/* renamed from: x.e */
/* loaded from: classes2.dex */
public class C4653e implements InterfaceC3797g {

    /* renamed from: b */
    public final InterfaceC3797g f5942b;

    public C4653e(InterfaceC3797g interfaceC3797g) {
        this.f5942b = (InterfaceC3797g) AbstractC3749i.m4768d(interfaceC3797g);
    }

    @Override // p076j.InterfaceC3797g
    /* renamed from: a */
    public InterfaceC4361j mo4955a(Context context, InterfaceC4361j interfaceC4361j, int i4, int i5) {
        GifDrawable gifDrawable = (GifDrawable) interfaceC4361j.get();
        InterfaceC4361j c4559e = new C4559e(gifDrawable.m1973e(), ComponentCallbacks2C2858c.m1680c(context).m1691f());
        InterfaceC4361j interfaceC4361jMo4955a = this.f5942b.mo4955a(context, c4559e, i4, i5);
        if (!c4559e.equals(interfaceC4361jMo4955a)) {
            c4559e.recycle();
        }
        gifDrawable.m1981m(this.f5942b, (Bitmap) interfaceC4361jMo4955a.get());
        return interfaceC4361j;
    }

    @Override // p076j.InterfaceC3792b
    /* renamed from: b */
    public void mo4729b(MessageDigest messageDigest) {
        this.f5942b.mo4729b(messageDigest);
    }

    @Override // p076j.InterfaceC3792b
    public boolean equals(Object obj) {
        if (obj instanceof C4653e) {
            return this.f5942b.equals(((C4653e) obj).f5942b);
        }
        return false;
    }

    @Override // p076j.InterfaceC3792b
    public int hashCode() {
        return this.f5942b.hashCode();
    }
}
