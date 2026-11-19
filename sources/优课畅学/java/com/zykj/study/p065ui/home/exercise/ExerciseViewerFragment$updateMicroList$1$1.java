package com.zykj.study.p065ui.home.exercise;

import com.tencent.smtt.sdk.TbsListener;
import com.zykj.study.adapter.MicroEditAdapter;
import com.zykj.study.adapter.MicroViewAdapter;
import com.zykj.study.bean.exercise.QuestionBean;
import com.zykj.study.viewmodels.ExerciseViewerViewModel;
import java.util.List;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.C8736p;
import p135i8.InterfaceC8822b0;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "com.zykj.study.ui.home.exercise.ExerciseViewerFragment$updateMicroList$1$1", m17801f = "ExerciseViewerFragment.kt", m17802l = {TbsListener.ErrorCode.INCR_UPDATE_FAIL}, m17803m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class ExerciseViewerFragment$updateMicroList$1$1 extends SuspendLambda implements InterfaceC10574p {

    /* renamed from: a */
    public int f11969a;

    /* renamed from: b */
    public final /* synthetic */ ExerciseViewerFragment f11970b;

    /* renamed from: c */
    public final /* synthetic */ QuestionBean f11971c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExerciseViewerFragment$updateMicroList$1$1(ExerciseViewerFragment exerciseViewerFragment, QuestionBean questionBean, InterfaceC9324c interfaceC9324c) {
        super(2, interfaceC9324c);
        this.f11970b = exerciseViewerFragment;
        this.f11971c = questionBean;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
        return new ExerciseViewerFragment$updateMicroList$1$1(this.f11970b, this.f11971c, interfaceC9324c);
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
        return ((ExerciseViewerFragment$updateMicroList$1$1) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM17291f = AbstractC9434a.m17291f();
        int i10 = this.f11969a;
        if (i10 == 0) {
            AbstractC9079b.m15926b(obj);
            ExerciseViewerViewModel exerciseViewerViewModelM10692I = this.f11970b.m10692I();
            int iM10702a = this.f11970b.m10690G().m10702a();
            String id = this.f11971c.getId();
            this.f11969a = 1;
            obj = exerciseViewerViewModelM10692I.m12173x(iM10702a, id, this);
            if (obj == objM17291f) {
                return objM17291f;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9079b.m15926b(obj);
        }
        ExerciseViewerFragment exerciseViewerFragment = this.f11970b;
        List list = (List) obj;
        MicroViewAdapter microViewAdapter = null;
        MicroEditAdapter microEditAdapter = null;
        if (exerciseViewerFragment.m10690G().m10704c()) {
            MicroEditAdapter microEditAdapter2 = exerciseViewerFragment.f11917j;
            if (microEditAdapter2 == null) {
                AbstractC9133u.m16151y("microEditAdapter");
            } else {
                microEditAdapter = microEditAdapter2;
            }
            microEditAdapter.m10036i(list);
        } else {
            MicroViewAdapter microViewAdapter2 = exerciseViewerFragment.f11918k;
            if (microViewAdapter2 == null) {
                AbstractC9133u.m16151y("microViewAdapter");
            } else {
                microViewAdapter = microViewAdapter2;
            }
            microViewAdapter.m10043g(list);
        }
        return C8736p.f16368a;
    }
}
