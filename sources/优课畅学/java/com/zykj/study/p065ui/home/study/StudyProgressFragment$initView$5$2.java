package com.zykj.study.p065ui.home.study;

import com.zykj.study.R$layout;
import com.zykj.study.databinding.FragmentStudyProgressBinding;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p123h7.C8736p;
import p135i8.InterfaceC8822b0;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "com.zykj.study.ui.home.study.StudyProgressFragment$initView$5$2", m17801f = "StudyProgressFragment.kt", m17802l = {}, m17803m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class StudyProgressFragment$initView$5$2 extends SuspendLambda implements InterfaceC10574p {

    /* renamed from: a */
    public int f13696a;

    /* renamed from: b */
    public final /* synthetic */ StudyProgressFragment f13697b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StudyProgressFragment$initView$5$2(StudyProgressFragment studyProgressFragment, InterfaceC9324c interfaceC9324c) {
        super(2, interfaceC9324c);
        this.f13697b = studyProgressFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
        return new StudyProgressFragment$initView$5$2(this.f13697b, interfaceC9324c);
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
        return ((StudyProgressFragment$initView$5$2) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        AbstractC9434a.m17291f();
        if (this.f13696a != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC9079b.m15926b(obj);
        ((FragmentStudyProgressBinding) this.f13697b.getMBindView()).multipleStatusView.m11959d(R$layout.layout_status_course_undercarriage);
        return C8736p.f16368a;
    }
}
