package retrofit2;

import kotlin.AbstractC5774b;
import kotlin.KotlinNullPointerException;
import kotlin.Result;
import kotlin.jvm.internal.AbstractC5830k;
import kotlinx.coroutines.C5961g;
import okhttp3.C6289c0;

/* renamed from: retrofit2.u */
/* loaded from: classes4.dex */
public final class C6521u implements InterfaceC6496h {

    /* renamed from: a */
    public final /* synthetic */ int f10793a;

    /* renamed from: b */
    public final /* synthetic */ C5961g f10794b;

    public /* synthetic */ C6521u(C5961g c5961g, int i) {
        this.f10793a = i;
        this.f10794b = c5961g;
    }

    @Override // retrofit2.InterfaceC6496h
    /* renamed from: k */
    public final void mo117k(InterfaceC6490e interfaceC6490e, Throwable th) {
        switch (this.f10793a) {
            case 0:
                this.f10794b.resumeWith(Result.m13956constructorimpl(AbstractC5774b.m5118a(th)));
                break;
            case 1:
                this.f10794b.resumeWith(Result.m13956constructorimpl(AbstractC5774b.m5118a(th)));
                break;
            default:
                this.f10794b.resumeWith(Result.m13956constructorimpl(AbstractC5774b.m5118a(th)));
                break;
        }
    }

    @Override // retrofit2.InterfaceC6496h
    /* renamed from: n */
    public final void mo120n(InterfaceC6490e interfaceC6490e, C6509n0 c6509n0) {
        switch (this.f10793a) {
            case 0:
                boolean zM5899b = c6509n0.f10762a.m5899b();
                C5961g c5961g = this.f10794b;
                if (!zM5899b) {
                    c5961g.resumeWith(Result.m13956constructorimpl(AbstractC5774b.m5118a(new HttpException(c6509n0))));
                    break;
                } else {
                    Object obj = c6509n0.f10763b;
                    if (obj != null) {
                        c5961g.resumeWith(Result.m13956constructorimpl(obj));
                        break;
                    } else {
                        C6289c0 c6289c0Mo6143a = interfaceC6490e.mo6143a();
                        c6289c0Mo6143a.getClass();
                        Object objCast = C6518s.class.cast(c6289c0Mo6143a.f10079e.get(C6518s.class));
                        AbstractC5830k.m5327d(objCast);
                        C6518s c6518s = (C6518s) objCast;
                        c5961g.resumeWith(Result.m13956constructorimpl(AbstractC5774b.m5118a(new KotlinNullPointerException("Response from " + c6518s.f10785a.getName() + '.' + c6518s.f10787c.getName() + " was null but response body type was declared as non-null"))));
                        break;
                    }
                }
            case 1:
                boolean zM5899b2 = c6509n0.f10762a.m5899b();
                C5961g c5961g2 = this.f10794b;
                if (!zM5899b2) {
                    c5961g2.resumeWith(Result.m13956constructorimpl(AbstractC5774b.m5118a(new HttpException(c6509n0))));
                    break;
                } else {
                    c5961g2.resumeWith(Result.m13956constructorimpl(c6509n0.f10763b));
                    break;
                }
            default:
                this.f10794b.resumeWith(Result.m13956constructorimpl(c6509n0));
                break;
        }
    }
}
