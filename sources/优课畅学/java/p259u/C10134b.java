package p259u;

import android.graphics.drawable.BitmapDrawable;
import com.bumptech.glide.load.EncodeStrategy;
import java.io.File;
import p160l.C9230d;
import p160l.InterfaceC9232f;
import p182n.InterfaceC9357j;
import p193o.InterfaceC9500d;

/* renamed from: u.b */
/* loaded from: classes3.dex */
public class C10134b implements InterfaceC9232f {

    /* renamed from: a */
    public final InterfaceC9500d f20250a;

    /* renamed from: b */
    public final InterfaceC9232f f20251b;

    public C10134b(InterfaceC9500d interfaceC9500d, InterfaceC9232f interfaceC9232f) {
        this.f20250a = interfaceC9500d;
        this.f20251b = interfaceC9232f;
    }

    @Override // p160l.InterfaceC9232f
    /* renamed from: a */
    public EncodeStrategy mo16943a(C9230d c9230d) {
        return this.f20251b.mo16943a(c9230d);
    }

    @Override // p160l.InterfaceC9227a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean mo16931b(InterfaceC9357j interfaceC9357j, File file, C9230d c9230d) {
        return this.f20251b.mo16931b(new C10142f(((BitmapDrawable) interfaceC9357j.get()).getBitmap(), this.f20250a), file, c9230d);
    }
}
