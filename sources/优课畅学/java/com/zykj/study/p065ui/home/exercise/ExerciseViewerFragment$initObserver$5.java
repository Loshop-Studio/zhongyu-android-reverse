package com.zykj.study.p065ui.home.exercise;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.RepeatOnLifecycleKt;
import com.zykj.study.databinding.FragmentExerciseViewerBinding;
import kotlin.AbstractC9079b;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.C8736p;
import p135i8.InterfaceC8822b0;
import p169l8.InterfaceC9267d;
import p169l8.InterfaceC9280q;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "com.zykj.study.ui.home.exercise.ExerciseViewerFragment$initObserver$5", m17801f = "ExerciseViewerFragment.kt", m17802l = {339}, m17803m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class ExerciseViewerFragment$initObserver$5 extends SuspendLambda implements InterfaceC10574p {

    /* renamed from: a */
    public int f11959a;

    /* renamed from: b */
    public final /* synthetic */ ExerciseViewerFragment f11960b;

    @InterfaceC9539d(m17800c = "com.zykj.study.ui.home.exercise.ExerciseViewerFragment$initObserver$5$1", m17801f = "ExerciseViewerFragment.kt", m17802l = {340}, m17803m = "invokeSuspend")
    /* renamed from: com.zykj.study.ui.home.exercise.ExerciseViewerFragment$initObserver$5$1 */
    public static final class C78231 extends SuspendLambda implements InterfaceC10574p {

        /* renamed from: a */
        public int f11961a;

        /* renamed from: b */
        public final /* synthetic */ ExerciseViewerFragment f11962b;

        /* renamed from: com.zykj.study.ui.home.exercise.ExerciseViewerFragment$initObserver$5$1$a */
        public static final class a implements InterfaceC9267d {

            /* renamed from: a */
            public final /* synthetic */ ExerciseViewerFragment f11963a;

            public a(ExerciseViewerFragment exerciseViewerFragment) {
                this.f11963a = exerciseViewerFragment;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* renamed from: c */
            public final Object m10701c(boolean z10, InterfaceC9324c interfaceC9324c) {
                ConstraintLayout parentLayout = ((FragmentExerciseViewerBinding) this.f11963a.getMBindView()).exerciseAnswer.answerMicro.includeChartDetails.parentLayout;
                AbstractC9133u.m16132f(parentLayout, "parentLayout");
                parentLayout.setVisibility(z10 ? 0 : 8);
                return C8736p.f16368a;
            }

            @Override // p169l8.InterfaceC9267d
            public /* bridge */ /* synthetic */ Object emit(Object obj, InterfaceC9324c interfaceC9324c) {
                return m10701c(((Boolean) obj).booleanValue(), interfaceC9324c);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C78231(ExerciseViewerFragment exerciseViewerFragment, InterfaceC9324c interfaceC9324c) {
            super(2, interfaceC9324c);
            this.f11962b = exerciseViewerFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
            return new C78231(this.f11962b, interfaceC9324c);
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
            return ((C78231) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM17291f = AbstractC9434a.m17291f();
            int i10 = this.f11961a;
            if (i10 == 0) {
                AbstractC9079b.m15926b(obj);
                InterfaceC9280q interfaceC9280qM12172w = this.f11962b.m10692I().m12172w();
                a aVar = new a(this.f11962b);
                this.f11961a = 1;
                if (interfaceC9280qM12172w.collect(aVar, this) == objM17291f) {
                    return objM17291f;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9079b.m15926b(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExerciseViewerFragment$initObserver$5(ExerciseViewerFragment exerciseViewerFragment, InterfaceC9324c interfaceC9324c) {
        super(2, interfaceC9324c);
        this.f11960b = exerciseViewerFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
        return new ExerciseViewerFragment$initObserver$5(this.f11960b, interfaceC9324c);
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
        return ((ExerciseViewerFragment$initObserver$5) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM17291f = AbstractC9434a.m17291f();
        int i10 = this.f11959a;
        if (i10 == 0) {
            AbstractC9079b.m15926b(obj);
            LifecycleOwner viewLifecycleOwner = this.f11960b.getViewLifecycleOwner();
            AbstractC9133u.m16132f(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            Lifecycle.State state = Lifecycle.State.STARTED;
            C78231 c78231 = new C78231(this.f11960b, null);
            this.f11959a = 1;
            if (RepeatOnLifecycleKt.repeatOnLifecycle(viewLifecycleOwner, state, c78231, this) == objM17291f) {
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
