package com.zykj.study.p065ui.home.exercise;

import androidx.core.os.BundleKt;
import androidx.fragment.app.FragmentKt;
import com.zykj.base.utils.XToastUtils;
import com.zykj.study.R$string;
import com.zykj.study.bean.exercise.ExerciseBean;
import com.zykj.study.viewmodels.ExerciseTrainViewModel;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9133u;
import p086e5.AbstractC8366o;
import p123h7.AbstractC8726f;
import p123h7.C8736p;
import p135i8.InterfaceC8822b0;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "com.zykj.study.ui.home.exercise.ExerciseTrainFragment$initView$5$1", m17801f = "ExerciseTrainFragment.kt", m17802l = {153}, m17803m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class ExerciseTrainFragment$initView$5$1 extends SuspendLambda implements InterfaceC10574p {

    /* renamed from: a */
    public int f11907a;

    /* renamed from: b */
    public final /* synthetic */ ExerciseTrainFragment f11908b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExerciseTrainFragment$initView$5$1(ExerciseTrainFragment exerciseTrainFragment, InterfaceC9324c interfaceC9324c) {
        super(2, interfaceC9324c);
        this.f11908b = exerciseTrainFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
        return new ExerciseTrainFragment$initView$5$1(this.f11908b, interfaceC9324c);
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
        return ((ExerciseTrainFragment$initView$5$1) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM17291f = AbstractC9434a.m17291f();
        int i10 = this.f11907a;
        if (i10 == 0) {
            AbstractC9079b.m15926b(obj);
            ExerciseTrainViewModel exerciseTrainViewModelM10644z = this.f11908b.m10644z();
            int iM10647b = this.f11908b.m10643y().m10647b();
            int iM10646a = this.f11908b.m10643y().m10646a();
            this.f11907a = 1;
            obj = exerciseTrainViewModelM10644z.m12157t(iM10647b, iM10646a, this);
            if (obj == objM17291f) {
                return objM17291f;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9079b.m15926b(obj);
        }
        ExerciseBean exerciseBean = (ExerciseBean) obj;
        if (exerciseBean != null) {
            XToastUtils xToastUtils = XToastUtils.INSTANCE;
            String string = this.f11908b.getString(R$string.exercise_result_upload_success);
            AbstractC9133u.m16132f(string, "getString(...)");
            AbstractC8366o.m13652d(xToastUtils, string);
            FragmentKt.setFragmentResult(this.f11908b, "exercise_upload", BundleKt.bundleOf(AbstractC8726f.m14230a("exercise_upload", exerciseBean)));
            androidx.navigation.fragment.FragmentKt.findNavController(this.f11908b).navigate(AbstractC7844d.f12106a.m10784a(this.f11908b.m10643y().m10647b(), this.f11908b.m10643y().m10646a(), this.f11908b.m10643y().m10648c(), 0));
        } else {
            if (this.f11908b.m10644z().m12150D()) {
                XToastUtils xToastUtils2 = XToastUtils.INSTANCE;
                String string2 = this.f11908b.getString(R$string.exercise_result_upload_fail);
                AbstractC9133u.m16132f(string2, "getString(...)");
                AbstractC8366o.m13652d(xToastUtils2, string2);
            }
            this.f11908b.m10644z().m12155I(true);
        }
        return C8736p.f16368a;
    }
}
