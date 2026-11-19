package p261v0;

import android.graphics.drawable.BitmapDrawable;
import com.bumptech.glide.load.EncodeStrategy;
import java.io.File;
import p162m0.C8539d;
import p162m0.InterfaceC8541f;
import p184o0.InterfaceC8690j;
import p195p0.InterfaceC8804d;

/* renamed from: v0.b */
/* loaded from: classes3.dex */
public class C9629b implements InterfaceC8541f {

    /* renamed from: a */
    public final InterfaceC8804d f16814a;

    /* renamed from: b */
    public final InterfaceC8541f f16815b;

    public C9629b(InterfaceC8804d interfaceC8804d, InterfaceC8541f interfaceC8541f) {
        this.f16814a = interfaceC8804d;
        this.f16815b = interfaceC8541f;
    }

    @Override // p162m0.InterfaceC8541f
    /* renamed from: b */
    public EncodeStrategy mo14060b(C8539d c8539d) {
        return this.f16815b.mo14060b(c8539d);
    }

    @Override // p162m0.InterfaceC8536a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean mo14048a(InterfaceC8690j interfaceC8690j, File file, C8539d c8539d) {
        return this.f16815b.mo14048a(new C9633f(((BitmapDrawable) interfaceC8690j.get()).getBitmap(), this.f16814a), file, c8539d);
    }
}
