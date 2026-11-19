package p298q0;

import android.graphics.ImageDecoder;
import java.io.InputStream;
import p109d1.AbstractC8900a;
import p168h0.C9438e;
import p168h0.InterfaceC9439f;
import p198j0.InterfaceC9657j;

/* renamed from: q0.t */
/* loaded from: classes3.dex */
public final class C10711t implements InterfaceC9439f {

    /* renamed from: a */
    public final C10696e f25779a = new C10696e();

    @Override // p168h0.InterfaceC9439f
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC9657j mo4266b(InputStream inputStream, int i10, int i11, C9438e c9438e) {
        return this.f25779a.m22657c(ImageDecoder.createSource(AbstractC8900a.m17436b(inputStream)), i10, i11, c9438e);
    }

    @Override // p168h0.InterfaceC9439f
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo4265a(InputStream inputStream, C9438e c9438e) {
        return true;
    }
}
