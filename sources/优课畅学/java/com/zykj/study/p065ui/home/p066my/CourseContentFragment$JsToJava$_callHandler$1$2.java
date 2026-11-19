package com.zykj.study.p065ui.home.p066my;

import androidx.navigation.fragment.FragmentKt;
import com.zykj.base.utils.XToastUtils;
import com.zykj.study.R$string;
import com.zykj.study.view.CustomX5WebView;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9133u;
import org.json.JSONArray;
import p086e5.AbstractC8366o;
import p123h7.C8736p;
import p135i8.InterfaceC8822b0;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "com.zykj.study.ui.home.my.CourseContentFragment$JsToJava$_callHandler$1$2", m17801f = "CourseContentFragment.kt", m17802l = {}, m17803m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class CourseContentFragment$JsToJava$_callHandler$1$2 extends SuspendLambda implements InterfaceC10574p {

    /* renamed from: a */
    public int f12827a;

    /* renamed from: b */
    public final /* synthetic */ CourseContentFragment f12828b;

    /* renamed from: c */
    public final /* synthetic */ JSONArray f12829c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CourseContentFragment$JsToJava$_callHandler$1$2(CourseContentFragment courseContentFragment, JSONArray jSONArray, InterfaceC9324c interfaceC9324c) {
        super(2, interfaceC9324c);
        this.f12828b = courseContentFragment;
        this.f12829c = jSONArray;
    }

    /* renamed from: d */
    public static final void m11234d(CourseContentFragment courseContentFragment) {
        XToastUtils xToastUtils = XToastUtils.INSTANCE;
        String string = courseContentFragment.getString(R$string.exercise_params_error);
        AbstractC9133u.m16132f(string, "getString(...)");
        AbstractC8366o.m13652d(xToastUtils, string);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
        return new CourseContentFragment$JsToJava$_callHandler$1$2(this.f12828b, this.f12829c, interfaceC9324c);
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
        return ((CourseContentFragment$JsToJava$_callHandler$1$2) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        AbstractC9434a.m17291f();
        if (this.f12827a != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC9079b.m15926b(obj);
        try {
            FragmentKt.findNavController(this.f12828b).navigate(AbstractC8091c.f13511a.m11749d(Integer.parseInt(this.f12829c.get(0).toString()), Integer.parseInt(this.f12829c.get(1).toString()), Integer.parseInt(this.f12829c.get(2).toString()), Integer.parseInt(this.f12829c.get(3).toString())));
        } catch (Exception e10) {
            e10.printStackTrace();
            CustomX5WebView customX5WebViewM11226r = this.f12828b.m11226r();
            final CourseContentFragment courseContentFragment = this.f12828b;
            customX5WebViewM11226r.post(new Runnable() { // from class: com.zykj.study.ui.home.my.a
                @Override // java.lang.Runnable
                public final void run() {
                    CourseContentFragment$JsToJava$_callHandler$1$2.m11234d(courseContentFragment);
                }
            });
        }
        return C8736p.f16368a;
    }
}
