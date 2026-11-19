package p261v0;

import android.graphics.ImageDecoder;
import java.io.InputStream;
import p117i1.AbstractC7642a;
import p162m0.C8539d;
import p162m0.InterfaceC8540e;
import p184o0.InterfaceC8690j;

/* renamed from: v0.u */
/* loaded from: classes3.dex */
public final class C9648u implements InterfaceC8540e {

    /* renamed from: a */
    public final C9632e f16839a = new C9632e();

    @Override // p162m0.InterfaceC8540e
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC8690j mo3617b(InputStream inputStream, int i10, int i11, C8539d c8539d) {
        return this.f16839a.m16000c(ImageDecoder.createSource(AbstractC7642a.m12651b(inputStream)), i10, i11, c8539d);
    }

    @Override // p162m0.InterfaceC8540e
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo3616a(InputStream inputStream, C8539d c8539d) {
        return true;
    }
}
