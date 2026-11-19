package p081i4;

import android.util.Log;
import com.zykj.mistake.base.BasePresenter;
import com.zykj.mistake.network.ApiResp;
import com.zykj.mistake.network.ThrowableHandler$ResponeThrowable;
import kotlin.jvm.internal.AbstractC5830k;
import p000a.AbstractC0000a;
import p007a6.AbstractC0018a;
import p073h4.AbstractC5625a;

/* renamed from: i4.a */
/* loaded from: classes3.dex */
public final class C5678a extends AbstractC0018a {

    /* renamed from: b */
    public final /* synthetic */ BasePresenter f8849b;

    /* renamed from: c */
    public final /* synthetic */ AbstractC0000a f8850c;

    /* renamed from: d */
    public final /* synthetic */ boolean f8851d;

    public C5678a(BasePresenter basePresenter, AbstractC0000a abstractC0000a, boolean z8) {
        this.f8849b = basePresenter;
        this.f8850c = abstractC0000a;
        this.f8851d = z8;
    }

    /* JADX WARN: Type inference failed for: r6v5, types: [i4.b, java.lang.Object] */
    @Override // p145q5.InterfaceC6436g
    public final void onError(Throwable e) {
        String message;
        ?? r62;
        AbstractC5830k.m5330g(e, "e");
        ThrowableHandler$ResponeThrowable throwableHandler$ResponeThrowableM4951k = AbstractC5625a.m4951k(e);
        BasePresenter basePresenter = this.f8849b;
        Log.e(basePresenter.f5999a, "throwable.message--->" + throwableHandler$ResponeThrowableM4951k.getMessage());
        if (throwableHandler$ResponeThrowableM4951k.getMessage() == null) {
            message = "";
        } else {
            message = throwableHandler$ResponeThrowableM4951k.getMessage();
            AbstractC5830k.m5327d(message);
        }
        this.f8850c.mo15m(message);
        if (!this.f8851d || (r62 = basePresenter.f6001c) == 0) {
            return;
        }
        r62.mo3963c();
    }

    /* JADX WARN: Type inference failed for: r3v5, types: [i4.b, java.lang.Object] */
    @Override // p145q5.InterfaceC6436g
    public final void onNext(Object obj) {
        ?? r32;
        ApiResp resp = (ApiResp) obj;
        AbstractC5830k.m5330g(resp, "resp");
        boolean success = resp.getSuccess();
        AbstractC0000a abstractC0000a = this.f8850c;
        if (success) {
            abstractC0000a.mo16n(resp);
        } else {
            abstractC0000a.mo15m(resp.getErrorMessage());
        }
        if (!this.f8851d || (r32 = this.f8849b.f6001c) == 0) {
            return;
        }
        r32.mo3963c();
    }

    @Override // p145q5.InterfaceC6436g
    public final void onComplete() {
    }
}
