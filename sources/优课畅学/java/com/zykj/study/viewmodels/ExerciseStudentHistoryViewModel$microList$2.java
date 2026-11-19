package com.zykj.study.viewmodels;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.zykj.study.repository.ExerciseRepository;
import java.util.List;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p123h7.C8736p;
import p135i8.InterfaceC8822b0;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "com.zykj.study.viewmodels.ExerciseStudentHistoryViewModel$microList$2", m17801f = "ExerciseStudentHistoryViewModel.kt", m17802l = {ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HEIGHT}, m17803m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class ExerciseStudentHistoryViewModel$microList$2 extends SuspendLambda implements InterfaceC10574p {

    /* renamed from: a */
    public int f14105a;

    /* renamed from: b */
    public final /* synthetic */ ExerciseStudentHistoryViewModel f14106b;

    /* renamed from: c */
    public final /* synthetic */ int f14107c;

    /* renamed from: d */
    public final /* synthetic */ String f14108d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExerciseStudentHistoryViewModel$microList$2(ExerciseStudentHistoryViewModel exerciseStudentHistoryViewModel, int i10, String str, InterfaceC9324c interfaceC9324c) {
        super(2, interfaceC9324c);
        this.f14106b = exerciseStudentHistoryViewModel;
        this.f14107c = i10;
        this.f14108d = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
        return new ExerciseStudentHistoryViewModel$microList$2(this.f14106b, this.f14107c, this.f14108d, interfaceC9324c);
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
        return ((ExerciseStudentHistoryViewModel$microList$2) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM17291f = AbstractC9434a.m17291f();
        int i10 = this.f14105a;
        if (i10 == 0) {
            AbstractC9079b.m15926b(obj);
            ExerciseRepository exerciseRepositoryM12139t = this.f14106b.m12139t();
            int i11 = this.f14107c;
            String str = this.f14108d;
            this.f14105a = 1;
            obj = exerciseRepositoryM12139t.m10374j(i11, str, this);
            if (obj == objM17291f) {
                return objM17291f;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9079b.m15926b(obj);
        }
        return (List) obj;
    }
}
