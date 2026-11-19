package p122t;

import android.graphics.drawable.BitmapDrawable;
import com.bumptech.glide.load.EncodeStrategy;
import java.io.File;
import p076j.C3794d;
import p076j.InterfaceC3796f;
import p093m.InterfaceC4361j;
import p098n.InterfaceC4395d;

/* renamed from: t.b */
/* loaded from: classes2.dex */
public class C4553b implements InterfaceC3796f {

    /* renamed from: a */
    public final InterfaceC4395d f5720a;

    /* renamed from: b */
    public final InterfaceC3796f f5721b;

    public C4553b(InterfaceC4395d interfaceC4395d, InterfaceC3796f interfaceC3796f) {
        this.f5720a = interfaceC4395d;
        this.f5721b = interfaceC3796f;
    }

    @Override // p076j.InterfaceC3796f
    /* renamed from: b */
    public EncodeStrategy mo4954b(C3794d c3794d) {
        return this.f5721b.mo4954b(c3794d);
    }

    @Override // p076j.InterfaceC3791a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean mo4941a(InterfaceC4361j interfaceC4361j, File file, C3794d c3794d) {
        return this.f5721b.mo4941a(new C4559e(((BitmapDrawable) interfaceC4361j.get()).getBitmap(), this.f5720a), file, c3794d);
    }
}
