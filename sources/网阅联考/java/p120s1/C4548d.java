package p120s1;

import com.zykj.http.exception.RemoteCodeException;
import com.zykj.lib.error.code.ErrorCode;
import com.zykj.lib.error.code.ErrorCodeHandler;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import p080j3.C3812d0;
import p080j3.InterfaceC3807b;
import p080j3.InterfaceC3811d;
import p080j3.InterfaceC3821i;
import p117r2.AbstractC4498b0;
import p117r2.C4522y;
import p120s1.AbstractC4545a;

/* renamed from: s1.d */
/* loaded from: classes2.dex */
public final class C4548d implements InterfaceC3807b {

    /* renamed from: a */
    public final InterfaceC3807b f5697a;

    /* renamed from: b */
    public final InterfaceC3821i f5698b;

    /* renamed from: s1.d$a */
    public static final class a implements InterfaceC3811d {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC3811d f5699a;

        /* renamed from: b */
        public final /* synthetic */ C4548d f5700b;

        public a(InterfaceC3811d interfaceC3811d, C4548d c4548d) {
            this.f5699a = interfaceC3811d;
            this.f5700b = c4548d;
        }

        @Override // p080j3.InterfaceC3811d
        /* renamed from: a */
        public void mo5015a(InterfaceC3807b call, C3812d0 response) {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(response, "response");
            Object objM5020a = response.m5020a();
            int iM5021b = response.m5021b();
            AbstractC4498b0 abstractC4498b0M5022d = response.m5022d();
            if (response.m5023e()) {
                if (objM5020a != null) {
                    this.f5699a.mo5015a(this.f5700b, C3812d0.m5018g(new AbstractC4545a.c(objM5020a)));
                    return;
                } else {
                    this.f5699a.mo5015a(this.f5700b, C3812d0.m5018g(new AbstractC4545a.d(new RemoteCodeException(ErrorCode.NET_RESPONSE_NULL))));
                    return;
                }
            }
            Object objMo4967a = null;
            if (abstractC4498b0M5022d != null && abstractC4498b0M5022d.mo5090c() != 0) {
                try {
                    objMo4967a = this.f5700b.f5698b.mo4967a(abstractC4498b0M5022d);
                } catch (Exception unused) {
                }
            }
            if (objMo4967a != null) {
                this.f5699a.mo5015a(this.f5700b, C3812d0.m5018g(new AbstractC4545a.a(objMo4967a, iM5021b)));
            } else {
                this.f5699a.mo5015a(this.f5700b, C3812d0.m5018g(new AbstractC4545a.d(new RemoteCodeException(ErrorCodeHandler.INSTANCE.getErrorCode(iM5021b)))));
            }
        }

        @Override // p080j3.InterfaceC3811d
        /* renamed from: b */
        public void mo5016b(InterfaceC3807b call, Throwable throwable) {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            this.f5699a.mo5015a(this.f5700b, C3812d0.m5018g(throwable instanceof IOException ? new AbstractC4545a.b((IOException) throwable) : new AbstractC4545a.d(throwable)));
        }
    }

    public C4548d(InterfaceC3807b delegate, InterfaceC3821i errorConverter) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(errorConverter, "errorConverter");
        this.f5697a = delegate;
        this.f5698b = errorConverter;
    }

    @Override // p080j3.InterfaceC3807b
    /* renamed from: S */
    public C4522y mo4982S() {
        C4522y c4522yMo4982S = this.f5697a.mo4982S();
        Intrinsics.checkNotNullExpressionValue(c4522yMo4982S, "delegate.request()");
        return c4522yMo4982S;
    }

    @Override // p080j3.InterfaceC3807b
    /* renamed from: T */
    public boolean mo4983T() {
        return this.f5697a.mo4983T();
    }

    @Override // p080j3.InterfaceC3807b
    /* renamed from: U */
    public void mo4984U(InterfaceC3811d callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f5697a.mo4984U(new a(callback, this));
    }

    @Override // p080j3.InterfaceC3807b
    /* renamed from: c, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public C4548d m13385clone() {
        InterfaceC3807b interfaceC3807bM13385clone = this.f5697a.m13385clone();
        Intrinsics.checkNotNullExpressionValue(interfaceC3807bM13385clone, "delegate.clone()");
        return new C4548d(interfaceC3807bM13385clone, this.f5698b);
    }

    @Override // p080j3.InterfaceC3807b
    public void cancel() {
        this.f5697a.cancel();
    }
}
