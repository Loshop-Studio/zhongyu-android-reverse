package com.zykj.study.p065ui.home.p066my;

import androidx.navigation.fragment.FragmentKt;
import com.zykj.study.p065ui.home.p066my.CourseContentFragment;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.json.JSONArray;
import p123h7.C8736p;
import p135i8.InterfaceC8822b0;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "com.zykj.study.ui.home.my.CourseContentFragment$JsToJava$_callHandler$1$5", m17801f = "CourseContentFragment.kt", m17802l = {}, m17803m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class CourseContentFragment$JsToJava$_callHandler$1$5 extends SuspendLambda implements InterfaceC10574p {

    /* renamed from: a */
    public int f12838a;

    /* renamed from: b */
    public final /* synthetic */ JSONArray f12839b;

    /* renamed from: c */
    public final /* synthetic */ CourseContentFragment.JsToJava f12840c;

    /* renamed from: d */
    public final /* synthetic */ CourseContentFragment f12841d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CourseContentFragment$JsToJava$_callHandler$1$5(JSONArray jSONArray, CourseContentFragment.JsToJava jsToJava, CourseContentFragment courseContentFragment, InterfaceC9324c interfaceC9324c) {
        super(2, interfaceC9324c);
        this.f12839b = jSONArray;
        this.f12840c = jsToJava;
        this.f12841d = courseContentFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
        return new CourseContentFragment$JsToJava$_callHandler$1$5(this.f12839b, this.f12840c, this.f12841d, interfaceC9324c);
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
        return ((CourseContentFragment$JsToJava$_callHandler$1$5) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        AbstractC9434a.m17291f();
        if (this.f12838a != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC9079b.m15926b(obj);
        FragmentKt.findNavController(this.f12841d).navigate(AbstractC8091c.f13511a.m11747b(Integer.parseInt(this.f12839b.get(0).toString()), Integer.parseInt(this.f12839b.get(1).toString()), Integer.parseInt(this.f12839b.get(2).toString()), 0, this.f12840c.m11232c().m11242e()));
        return C8736p.f16368a;
    }
}
