package com.zykj.study.p065ui.home.p066my;

import com.zykj.study.databinding.FragmentCourseViewCatalogBinding;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p123h7.C8736p;
import p135i8.InterfaceC8822b0;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "com.zykj.study.ui.home.my.CourseViewCatalogFragment$initData$4$2$2", m17801f = "CourseViewCatalogFragment.kt", m17802l = {}, m17803m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class CourseViewCatalogFragment$initData$4$2$2 extends SuspendLambda implements InterfaceC10574p {

    /* renamed from: a */
    public int f12899a;

    /* renamed from: b */
    public final /* synthetic */ CourseViewCatalogFragment f12900b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CourseViewCatalogFragment$initData$4$2$2(CourseViewCatalogFragment courseViewCatalogFragment, InterfaceC9324c interfaceC9324c) {
        super(2, interfaceC9324c);
        this.f12900b = courseViewCatalogFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
        return new CourseViewCatalogFragment$initData$4$2$2(this.f12900b, interfaceC9324c);
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
        return ((CourseViewCatalogFragment$initData$4$2$2) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        AbstractC9434a.m17291f();
        if (this.f12899a != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC9079b.m15926b(obj);
        ((FragmentCourseViewCatalogBinding) this.f12900b.getMBindView()).multipleStatusView.m11961f();
        return C8736p.f16368a;
    }
}
