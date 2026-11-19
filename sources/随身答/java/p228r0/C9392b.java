package p228r0;

import android.graphics.drawable.BitmapDrawable;
import com.bumptech.glide.load.EncodeStrategy;
import java.io.File;
import p122h0.C8084d;
import p122h0.InterfaceC8086f;
import p152k0.InterfaceC8259j;
import p164l0.InterfaceC8867d;

/* renamed from: r0.b */
/* loaded from: classes3.dex */
public class C9392b implements InterfaceC8086f {

    /* renamed from: a */
    public final InterfaceC8867d f16381a;

    /* renamed from: b */
    public final InterfaceC8086f f16382b;

    public C9392b(InterfaceC8867d interfaceC8867d, InterfaceC8086f interfaceC8086f) {
        this.f16381a = interfaceC8867d;
        this.f16382b = interfaceC8086f;
    }

    @Override // p122h0.InterfaceC8086f
    /* renamed from: b */
    public EncodeStrategy mo12911b(C8084d c8084d) {
        return this.f16382b.mo12911b(c8084d);
    }

    @Override // p122h0.InterfaceC8081a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean mo12898a(InterfaceC8259j interfaceC8259j, File file, C8084d c8084d) {
        return this.f16382b.mo12898a(new C9395e(((BitmapDrawable) interfaceC8259j.get()).getBitmap(), this.f16381a), file, c8084d);
    }
}
