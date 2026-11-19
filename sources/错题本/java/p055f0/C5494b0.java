package p055f0;

import java.io.File;
import p172u0.C6610b;
import p202y.C6763f;

/* renamed from: f0.b0 */
/* loaded from: classes2.dex */
public final class C5494b0 implements InterfaceC5511p {

    /* renamed from: b */
    public static final C5494b0 f8497b = new C5494b0(0);

    /* renamed from: a */
    public final /* synthetic */ int f8498a;

    public /* synthetic */ C5494b0(int i) {
        this.f8498a = i;
    }

    @Override // p055f0.InterfaceC5511p
    /* renamed from: a */
    public final boolean mo4873a(Object obj) {
        switch (this.f8498a) {
            case 0:
                return true;
            case 1:
                return true;
            default:
                return false;
        }
    }

    @Override // p055f0.InterfaceC5511p
    /* renamed from: b */
    public final C5510o mo4874b(Object obj, int i, int i8, C6763f c6763f) {
        switch (this.f8498a) {
            case 0:
                return new C5510o(new C6610b(obj), new C5497d(obj, 1));
            case 1:
                File file = (File) obj;
                return new C5510o(new C6610b(file), new C5497d(file, 0));
            default:
                return null;
        }
    }
}
