package com.zykj.study.p065ui.home.p066my;

import android.view.View;
import com.zykj.study.bean.teach.SuperviseGroup;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p123h7.C8736p;
import p135i8.InterfaceC8822b0;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "com.zykj.study.ui.home.my.StudentViewMemberFragment$initData$2$1", m17801f = "StudentViewMemberFragment.kt", m17802l = {}, m17803m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class StudentViewMemberFragment$initData$2$1 extends SuspendLambda implements InterfaceC10574p {

    /* renamed from: a */
    public int f13409a;

    /* renamed from: b */
    public final /* synthetic */ StudentViewMemberFragment f13410b;

    /* renamed from: c */
    public final /* synthetic */ View f13411c;

    /* renamed from: d */
    public final /* synthetic */ SuperviseGroup f13412d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StudentViewMemberFragment$initData$2$1(StudentViewMemberFragment studentViewMemberFragment, View view, SuperviseGroup superviseGroup, InterfaceC9324c interfaceC9324c) {
        super(2, interfaceC9324c);
        this.f13410b = studentViewMemberFragment;
        this.f13411c = view;
        this.f13412d = superviseGroup;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
        return new StudentViewMemberFragment$initData$2$1(this.f13410b, this.f13411c, this.f13412d, interfaceC9324c);
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
        return ((StudentViewMemberFragment$initData$2$1) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        AbstractC9434a.m17291f();
        if (this.f13409a != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC9079b.m15926b(obj);
        this.f13410b.m11678H(this.f13411c, this.f13412d);
        return C8736p.f16368a;
    }
}
