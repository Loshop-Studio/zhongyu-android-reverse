package p298q0;

import android.graphics.drawable.BitmapDrawable;
import com.bumptech.glide.load.EncodeStrategy;
import java.io.File;
import p168h0.C9438e;
import p168h0.InterfaceC9440g;
import p198j0.InterfaceC9657j;
import p213k0.InterfaceC9772d;

/* renamed from: q0.b */
/* loaded from: classes3.dex */
public class C10693b implements InterfaceC9440g {

    /* renamed from: a */
    public final InterfaceC9772d f25755a;

    /* renamed from: b */
    public final InterfaceC9440g f25756b;

    public C10693b(InterfaceC9772d interfaceC9772d, InterfaceC9440g interfaceC9440g) {
        this.f25755a = interfaceC9772d;
        this.f25756b = interfaceC9440g;
    }

    @Override // p168h0.InterfaceC9440g
    /* renamed from: b */
    public EncodeStrategy mo18630b(C9438e c9438e) {
        return this.f25756b.mo18630b(c9438e);
    }

    @Override // p168h0.InterfaceC9434a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean mo18616a(InterfaceC9657j interfaceC9657j, File file, C9438e c9438e) {
        return this.f25756b.mo18616a(new C10697f(((BitmapDrawable) interfaceC9657j.get()).getBitmap(), this.f25755a), file, c9438e);
    }
}
