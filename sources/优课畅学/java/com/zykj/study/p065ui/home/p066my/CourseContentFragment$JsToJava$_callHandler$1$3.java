package com.zykj.study.p065ui.home.p066my;

import com.zykj.base.utils.XToastUtils;
import com.zykj.study.R$string;
import com.zykj.study.bean.exercise.GroupStatistic;
import com.zykj.study.p065ui.home.p066my.CourseContentFragment;
import com.zykj.study.view.CustomX5WebView;
import com.zykj.study.viewmodels.CourseContentViewModel;
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

@InterfaceC9539d(m17800c = "com.zykj.study.ui.home.my.CourseContentFragment$JsToJava$_callHandler$1$3", m17801f = "CourseContentFragment.kt", m17802l = {191}, m17803m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class CourseContentFragment$JsToJava$_callHandler$1$3 extends SuspendLambda implements InterfaceC10574p {

    /* renamed from: a */
    public int f12830a;

    /* renamed from: b */
    public final /* synthetic */ CourseContentFragment f12831b;

    /* renamed from: c */
    public final /* synthetic */ JSONArray f12832c;

    /* renamed from: d */
    public final /* synthetic */ CourseContentFragment.JsToJava f12833d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CourseContentFragment$JsToJava$_callHandler$1$3(CourseContentFragment courseContentFragment, JSONArray jSONArray, CourseContentFragment.JsToJava jsToJava, InterfaceC9324c interfaceC9324c) {
        super(2, interfaceC9324c);
        this.f12831b = courseContentFragment;
        this.f12832c = jSONArray;
        this.f12833d = jsToJava;
    }

    /* renamed from: d */
    public static final void m11236d(CourseContentFragment courseContentFragment) {
        XToastUtils xToastUtils = XToastUtils.INSTANCE;
        String string = courseContentFragment.getString(R$string.exercise_params_error);
        AbstractC9133u.m16132f(string, "getString(...)");
        AbstractC8366o.m13652d(xToastUtils, string);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
        return new CourseContentFragment$JsToJava$_callHandler$1$3(this.f12831b, this.f12832c, this.f12833d, interfaceC9324c);
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
        return ((CourseContentFragment$JsToJava$_callHandler$1$3) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM17291f = AbstractC9434a.m17291f();
        int i10 = this.f12830a;
        try {
            if (i10 == 0) {
                AbstractC9079b.m15926b(obj);
                CourseContentViewModel courseContentViewModelM11224p = this.f12831b.m11224p();
                int i11 = Integer.parseInt(this.f12832c.get(0).toString());
                int i12 = Integer.parseInt(this.f12832c.get(2).toString());
                this.f12830a = 1;
                obj = courseContentViewModelM11224p.m12033b(i11, i12, this);
                if (obj == objM17291f) {
                    return objM17291f;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9079b.m15926b(obj);
            }
            GroupStatistic groupStatistic = (GroupStatistic) obj;
            if (groupStatistic != null) {
                CourseContentFragment courseContentFragment = this.f12831b;
                JSONArray jSONArray = this.f12832c;
                courseContentFragment.m11229w(Integer.parseInt(jSONArray.get(0).toString()), Integer.parseInt(jSONArray.get(1).toString()), Integer.parseInt(jSONArray.get(2).toString()), groupStatistic, this.f12833d.m11232c().m11242e());
            }
        } catch (Exception e10) {
            e10.printStackTrace();
            CustomX5WebView customX5WebViewM11226r = this.f12831b.m11226r();
            final CourseContentFragment courseContentFragment2 = this.f12831b;
            customX5WebViewM11226r.post(new Runnable() { // from class: com.zykj.study.ui.home.my.b
                @Override // java.lang.Runnable
                public final void run() {
                    CourseContentFragment$JsToJava$_callHandler$1$3.m11236d(courseContentFragment2);
                }
            });
        }
        return C8736p.f16368a;
    }
}
