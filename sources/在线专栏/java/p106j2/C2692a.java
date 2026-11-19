package p106j2;

import android.content.Context;
import com.google.gson.Gson;
import com.zykj.subscriber.entity.resp.ApiResp;
import kotlin.jvm.internal.C2769l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p086f2.C2527a;
import p091g2.InterfaceC2645a;
import p096h2.AbstractC2658c;
import p116l2.C2845f;
import p147rx.Observable;
import p147rx.Observer;
import p147rx.Subscription;
import p147rx.android.schedulers.AndroidSchedulers;
import p147rx.schedulers.Schedulers;
import p147rx.subscriptions.CompositeSubscription;

/* renamed from: j2.a */
/* loaded from: classes.dex */
public class C2692a {

    /* renamed from: a */
    @NotNull
    private final Context f10644a;

    /* renamed from: b */
    @NotNull
    private final InterfaceC2645a f10645b;

    /* renamed from: c */
    @NotNull
    private String f10646c;

    /* renamed from: d */
    @Nullable
    private CompositeSubscription f10647d;

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: j2.a$a */
    public static final class a<T> implements Observer<T> {

        /* renamed from: b */
        final /* synthetic */ AbstractC2658c<T> f10649b;

        a(AbstractC2658c<T> abstractC2658c) {
            this.f10649b = abstractC2658c;
        }

        /* JADX WARN: Incorrect types in method signature: (TT;)V */
        @Override // p147rx.Observer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onNext(@NotNull ApiResp t3) {
            C2769l.m9241e(t3, "t");
            C2845f.m9548c(C2692a.this.f10646c, C2769l.m9248l("[返回结果]--> ", new Gson().toJson(t3)));
            if (t3.getSuccess()) {
                this.f10649b.mo8929b(t3);
            } else {
                this.f10649b.mo8928a(t3.getErrorMessage());
            }
        }

        @Override // p147rx.Observer
        public void onCompleted() {
            C2845f.m9548c(C2692a.this.f10646c, "onCompleted-->");
        }

        @Override // p147rx.Observer
        public void onError(@NotNull Throwable e4) {
            C2769l.m9241e(e4, "e");
            C2845f.m9547b(C2692a.this.f10646c, C2769l.m9248l("Throwable-->", e4));
            C2527a.a aVarM8493a = C2527a.m8493a(e4);
            C2769l.m9240d(aVarM8493a, "handleException(e)");
            C2845f.m9547b(C2692a.this.f10646c, C2769l.m9248l("Throwable-->", aVarM8493a.f10219a));
            this.f10649b.mo8928a(aVarM8493a.f10219a);
        }
    }

    public C2692a(@NotNull Context context, @NotNull InterfaceC2645a iBaseView) {
        C2769l.m9241e(context, "context");
        C2769l.m9241e(iBaseView, "iBaseView");
        this.f10644a = context;
        this.f10645b = iBaseView;
        this.f10646c = getClass().getSimpleName();
    }

    /* renamed from: c */
    private final String m9006c() {
        return '[' + ((Object) new Throwable().getStackTrace()[2].getMethodName()) + "+方法]-[请求参数]params-->";
    }

    /* renamed from: b */
    public void m9007b(@NotNull Subscription s3) {
        C2769l.m9241e(s3, "s");
        if (this.f10647d == null) {
            this.f10647d = new CompositeSubscription();
        }
        CompositeSubscription compositeSubscription = this.f10647d;
        if (compositeSubscription == null) {
            return;
        }
        compositeSubscription.add(s3);
    }

    /* renamed from: d */
    public <T extends ApiResp> void m9008d(@NotNull Observable<T> observable, @NotNull AbstractC2658c<T> callBack) {
        C2769l.m9241e(observable, "observable");
        C2769l.m9241e(callBack, "callBack");
        C2845f.m9547b(this.f10646c, C2769l.m9248l("调用方法--->", m9006c()));
        Subscription subscriptionSubscribe = observable.subscribeOn(Schedulers.m10183io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new a(callBack));
        C2769l.m9240d(subscriptionSubscribe, "open fun <T : ApiResp> r…ption(subscription)\n    }");
        m9007b(subscriptionSubscribe);
    }
}
