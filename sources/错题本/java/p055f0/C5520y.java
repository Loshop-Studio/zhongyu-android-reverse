package p055f0;

import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.InputStream;
import p016b0.InterfaceC3072g0;
import p077i0.C5647c;
import p120n0.InterfaceC6207a;
import p202y.C6763f;

/* renamed from: f0.y */
/* loaded from: classes2.dex */
public final class C5520y implements InterfaceC5512q, InterfaceC6207a {

    /* renamed from: a */
    public final /* synthetic */ int f8553a;

    /* renamed from: b */
    public final Resources f8554b;

    public /* synthetic */ C5520y(Resources resources, int i) {
        this.f8553a = i;
        this.f8554b = resources;
    }

    @Override // p120n0.InterfaceC6207a
    /* renamed from: a */
    public InterfaceC3072g0 mo2017a(InterfaceC3072g0 interfaceC3072g0, C6763f c6763f) {
        if (interfaceC3072g0 == null) {
            return null;
        }
        return new C5647c(this.f8554b, interfaceC3072g0);
    }

    @Override // p055f0.InterfaceC5512q
    /* renamed from: r */
    public InterfaceC5511p mo2140r(C5519x c5519x) {
        switch (this.f8553a) {
            case 0:
                return new C5493b(this.f8554b, c5519x.m4889a(Uri.class, AssetFileDescriptor.class));
            case 1:
                return new C5493b(this.f8554b, c5519x.m4889a(Uri.class, ParcelFileDescriptor.class));
            case 2:
                return new C5493b(this.f8554b, c5519x.m4889a(Uri.class, InputStream.class));
            default:
                return new C5493b(this.f8554b, C5494b0.f8497b);
        }
    }
}
