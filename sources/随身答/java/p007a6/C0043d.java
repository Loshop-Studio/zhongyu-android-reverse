package p007a6;

import com.zykj.http.exception.RemoteCodeException;
import com.zykj.lib.error.code.ErrorCode;
import com.zykj.lib.error.code.ErrorCodeHandler;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import p007a6.AbstractC0040a;
import p038c9.C5298x;
import p038c9.InterfaceC5274b;
import p038c9.InterfaceC5278d;
import p038c9.InterfaceC5280f;
import p172l8.AbstractC8927z;
import p172l8.C8924w;

/* renamed from: a6.d */
/* loaded from: classes4.dex */
public final class C0043d implements InterfaceC5274b {

    /* renamed from: a */
    public final InterfaceC5274b f136a;

    /* renamed from: b */
    public final InterfaceC5280f f137b;

    /* renamed from: a6.d$a */
    public static final class a implements InterfaceC5278d {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC5278d f138a;

        /* renamed from: b */
        public final /* synthetic */ C0043d f139b;

        public a(InterfaceC5278d interfaceC5278d, C0043d c0043d) {
            this.f138a = interfaceC5278d;
            this.f139b = c0043d;
        }

        @Override // p038c9.InterfaceC5278d
        /* renamed from: a */
        public void mo236a(InterfaceC5274b call, Throwable throwable) {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            this.f138a.mo237b(this.f139b, C5298x.m2518h(throwable instanceof IOException ? new AbstractC0040a.b((IOException) throwable) : new AbstractC0040a.d(throwable)));
        }

        @Override // p038c9.InterfaceC5278d
        /* renamed from: b */
        public void mo237b(InterfaceC5274b call, C5298x response) {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(response, "response");
            Object objM2520a = response.m2520a();
            int iM2521b = response.m2521b();
            AbstractC8927z abstractC8927zM2522d = response.m2522d();
            if (response.m2524f()) {
                if (objM2520a != null) {
                    this.f138a.mo237b(this.f139b, C5298x.m2518h(new AbstractC0040a.c(objM2520a)));
                    return;
                } else {
                    this.f138a.mo237b(this.f139b, C5298x.m2518h(new AbstractC0040a.d(new RemoteCodeException(ErrorCode.NET_RESPONSE_NULL))));
                    return;
                }
            }
            Object objConvert = null;
            if (abstractC8927zM2522d != null && abstractC8927zM2522d.contentLength() != 0) {
                try {
                    objConvert = this.f139b.f137b.convert(abstractC8927zM2522d);
                } catch (Exception unused) {
                }
            }
            if (objConvert != null) {
                this.f138a.mo237b(this.f139b, C5298x.m2518h(new AbstractC0040a.a(objConvert, iM2521b)));
            } else {
                this.f138a.mo237b(this.f139b, C5298x.m2518h(new AbstractC0040a.d(new RemoteCodeException(ErrorCodeHandler.INSTANCE.getErrorCode(iM2521b)))));
            }
        }
    }

    public C0043d(InterfaceC5274b delegate, InterfaceC5280f errorConverter) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(errorConverter, "errorConverter");
        this.f136a = delegate;
        this.f137b = errorConverter;
    }

    @Override // p038c9.InterfaceC5274b
    /* renamed from: a */
    public C8924w mo233a() {
        C8924w c8924wMo233a = this.f136a.mo233a();
        Intrinsics.checkNotNullExpressionValue(c8924wMo233a, "delegate.request()");
        return c8924wMo233a;
    }

    @Override // p038c9.InterfaceC5274b
    /* renamed from: c */
    public void mo234c(InterfaceC5278d callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f136a.mo234c(new a(callback, this));
    }

    @Override // p038c9.InterfaceC5274b
    public void cancel() {
        this.f136a.cancel();
    }

    @Override // p038c9.InterfaceC5274b
    /* renamed from: d, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public C0043d m17387clone() {
        InterfaceC5274b interfaceC5274bM17387clone = this.f136a.m17387clone();
        Intrinsics.checkNotNullExpressionValue(interfaceC5274bM17387clone, "delegate.clone()");
        return new C0043d(interfaceC5274bM17387clone, this.f137b);
    }

    @Override // p038c9.InterfaceC5274b
    public boolean isCanceled() {
        return this.f136a.isCanceled();
    }
}
