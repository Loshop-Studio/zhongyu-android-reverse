package com.zykj.study.viewmodels;

import android.graphics.Bitmap;
import com.zykj.blackboard.utils.FileUtils;
import com.zykj.view.board.evaluation.BlackboardEvaluationFragment;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineDispatcher;
import p123h7.C8736p;
import p135i8.AbstractC8833f;
import p135i8.C8843i0;
import p135i8.InterfaceC8822b0;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.AbstractC9536a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "com.zykj.study.viewmodels.ExerciseTrainViewModel$saveScreenshot$1", m17801f = "ExerciseTrainViewModel.kt", m17802l = {118}, m17803m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class ExerciseTrainViewModel$saveScreenshot$1 extends SuspendLambda implements InterfaceC10574p {

    /* renamed from: a */
    public int f14129a;

    /* renamed from: b */
    public final /* synthetic */ BlackboardEvaluationFragment f14130b;

    /* renamed from: c */
    public final /* synthetic */ int f14131c;

    /* renamed from: d */
    public final /* synthetic */ int f14132d;

    /* renamed from: e */
    public final /* synthetic */ ExerciseTrainViewModel f14133e;

    @InterfaceC9539d(m17800c = "com.zykj.study.viewmodels.ExerciseTrainViewModel$saveScreenshot$1$1", m17801f = "ExerciseTrainViewModel.kt", m17802l = {}, m17803m = "invokeSuspend")
    /* renamed from: com.zykj.study.viewmodels.ExerciseTrainViewModel$saveScreenshot$1$1 */
    public static final class C81461 extends SuspendLambda implements InterfaceC10574p {

        /* renamed from: a */
        public int f14134a;

        /* renamed from: b */
        public final /* synthetic */ BlackboardEvaluationFragment f14135b;

        /* renamed from: c */
        public final /* synthetic */ int f14136c;

        /* renamed from: d */
        public final /* synthetic */ int f14137d;

        /* renamed from: e */
        public final /* synthetic */ ExerciseTrainViewModel f14138e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C81461(BlackboardEvaluationFragment blackboardEvaluationFragment, int i10, int i11, ExerciseTrainViewModel exerciseTrainViewModel, InterfaceC9324c interfaceC9324c) {
            super(2, interfaceC9324c);
            this.f14135b = blackboardEvaluationFragment;
            this.f14136c = i10;
            this.f14137d = i11;
            this.f14138e = exerciseTrainViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
            return new C81461(this.f14135b, this.f14136c, this.f14137d, this.f14138e, interfaceC9324c);
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
            return ((C81461) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            AbstractC9434a.m17291f();
            if (this.f14134a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9079b.m15926b(obj);
            Bitmap bitmapM13015Q = BlackboardEvaluationFragment.m13015Q(this.f14135b, 50, 20, this.f14136c, this.f14137d, false, 16, null);
            if (bitmapM13015Q != null) {
                ExerciseTrainViewModel exerciseTrainViewModel = this.f14138e;
                String str = (String) exerciseTrainViewModel.m12147A().getValue();
                if (str != null) {
                    exerciseTrainViewModel.m12147A().postValue(FileUtils.INSTANCE.saveBitmap2SDCard(bitmapM13015Q, str, true));
                    exerciseTrainViewModel.m12148B().postValue(AbstractC9536a.m17796a(false));
                }
            }
            return C8736p.f16368a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExerciseTrainViewModel$saveScreenshot$1(BlackboardEvaluationFragment blackboardEvaluationFragment, int i10, int i11, ExerciseTrainViewModel exerciseTrainViewModel, InterfaceC9324c interfaceC9324c) {
        super(2, interfaceC9324c);
        this.f14130b = blackboardEvaluationFragment;
        this.f14131c = i10;
        this.f14132d = i11;
        this.f14133e = exerciseTrainViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
        return new ExerciseTrainViewModel$saveScreenshot$1(this.f14130b, this.f14131c, this.f14132d, this.f14133e, interfaceC9324c);
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
        return ((ExerciseTrainViewModel$saveScreenshot$1) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM17291f = AbstractC9434a.m17291f();
        int i10 = this.f14129a;
        if (i10 == 0) {
            AbstractC9079b.m15926b(obj);
            CoroutineDispatcher coroutineDispatcherM14867b = C8843i0.m14867b();
            C81461 c81461 = new C81461(this.f14130b, this.f14131c, this.f14132d, this.f14133e, null);
            this.f14129a = 1;
            if (AbstractC8833f.m14848g(coroutineDispatcherM14867b, c81461, this) == objM17291f) {
                return objM17291f;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9079b.m15926b(obj);
        }
        return C8736p.f16368a;
    }
}
