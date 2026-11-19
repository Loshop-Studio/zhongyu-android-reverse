package p118o0;

import android.graphics.drawable.BitmapDrawable;
import com.bumptech.glide.load.EncodeStrategy;
import java.io.File;
import p053f0.C6285d;
import p053f0.InterfaceC6287f;
import p067h0.InterfaceC6440j;
import p074i0.InterfaceC6499d;

/* renamed from: o0.b */
/* loaded from: classes3.dex */
public class C7491b implements InterfaceC6287f {

    /* renamed from: a */
    public final InterfaceC6499d f9671a;

    /* renamed from: b */
    public final InterfaceC6287f f9672b;

    public C7491b(InterfaceC6499d interfaceC6499d, InterfaceC6287f interfaceC6287f) {
        this.f9671a = interfaceC6499d;
        this.f9672b = interfaceC6287f;
    }

    @Override // p053f0.InterfaceC6287f
    /* renamed from: b */
    public EncodeStrategy mo6423b(C6285d c6285d) {
        return this.f9672b.mo6423b(c6285d);
    }

    @Override // p053f0.InterfaceC6282a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean mo6411a(InterfaceC6440j interfaceC6440j, File file, C6285d c6285d) {
        return this.f9672b.mo6411a(new C7495f(((BitmapDrawable) interfaceC6440j.get()).getBitmap(), this.f9671a), file, c6285d);
    }
}
