package com.zykj.study.p065ui.home.p066my;

import androidx.navigation.fragment.FragmentKt;
import com.zykj.study.p065ui.home.p066my.AbstractC8091c;
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

@InterfaceC9539d(m17800c = "com.zykj.study.ui.home.my.CourseContentFragment$JsToJava$_callHandler$1$4", m17801f = "CourseContentFragment.kt", m17802l = {}, m17803m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class CourseContentFragment$JsToJava$_callHandler$1$4 extends SuspendLambda implements InterfaceC10574p {

    /* renamed from: a */
    public int f12834a;

    /* renamed from: b */
    public final /* synthetic */ CourseContentFragment.JsToJava f12835b;

    /* renamed from: c */
    public final /* synthetic */ JSONArray f12836c;

    /* renamed from: d */
    public final /* synthetic */ CourseContentFragment f12837d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CourseContentFragment$JsToJava$_callHandler$1$4(CourseContentFragment.JsToJava jsToJava, JSONArray jSONArray, CourseContentFragment courseContentFragment, InterfaceC9324c interfaceC9324c) {
        super(2, interfaceC9324c);
        this.f12835b = jsToJava;
        this.f12836c = jSONArray;
        this.f12837d = courseContentFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
        return new CourseContentFragment$JsToJava$_callHandler$1$4(this.f12835b, this.f12836c, this.f12837d, interfaceC9324c);
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
        return ((CourseContentFragment$JsToJava$_callHandler$1$4) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        AbstractC9434a.m17291f();
        if (this.f12834a != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC9079b.m15926b(obj);
        AbstractC8091c.f fVar = AbstractC8091c.f13511a;
        String strM11239b = this.f12835b.m11232c().m11239b();
        FragmentKt.findNavController(this.f12837d).navigate(fVar.m11746a(strM11239b != null ? Integer.parseInt(strM11239b) : 0, Integer.parseInt(this.f12836c.get(1).toString()), Integer.parseInt(this.f12836c.get(2).toString())));
        return C8736p.f16368a;
    }
}
