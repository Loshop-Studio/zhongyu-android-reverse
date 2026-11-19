package com.zykj.study.p065ui.home.exercise;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.RepeatOnLifecycleKt;
import com.tencent.smtt.sdk.TbsListener;
import com.zykj.study.R$string;
import com.zykj.study.bean.teach.ChoiceChartData;
import com.zykj.study.databinding.FragmentExerciseViewerBinding;
import java.util.List;
import kotlin.AbstractC9079b;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.C8736p;
import p134i7.AbstractC8778f0;
import p135i8.AbstractC8839h;
import p135i8.InterfaceC8822b0;
import p169l8.AbstractC9268e;
import p169l8.InterfaceC9266c;
import p169l8.InterfaceC9267d;
import p169l8.InterfaceC9275l;
import p169l8.InterfaceC9280q;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.AbstractC9536a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "com.zykj.study.ui.home.exercise.ExerciseViewerFragment$initObserver$4", m17801f = "ExerciseViewerFragment.kt", m17802l = {305}, m17803m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class ExerciseViewerFragment$initObserver$4 extends SuspendLambda implements InterfaceC10574p {

    /* renamed from: a */
    public int f11945a;

    /* renamed from: b */
    public final /* synthetic */ ExerciseViewerFragment f11946b;

    @InterfaceC9539d(m17800c = "com.zykj.study.ui.home.exercise.ExerciseViewerFragment$initObserver$4$1", m17801f = "ExerciseViewerFragment.kt", m17802l = {}, m17803m = "invokeSuspend")
    /* renamed from: com.zykj.study.ui.home.exercise.ExerciseViewerFragment$initObserver$4$1 */
    public static final class C78221 extends SuspendLambda implements InterfaceC10574p {

        /* renamed from: a */
        public int f11947a;

        /* renamed from: b */
        public /* synthetic */ Object f11948b;

        /* renamed from: c */
        public final /* synthetic */ ExerciseViewerFragment f11949c;

        @InterfaceC9539d(m17800c = "com.zykj.study.ui.home.exercise.ExerciseViewerFragment$initObserver$4$1$1", m17801f = "ExerciseViewerFragment.kt", m17802l = {308}, m17803m = "invokeSuspend")
        /* renamed from: com.zykj.study.ui.home.exercise.ExerciseViewerFragment$initObserver$4$1$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC10574p {

            /* renamed from: a */
            public int f11950a;

            /* renamed from: b */
            public final /* synthetic */ ExerciseViewerFragment f11951b;

            /* renamed from: com.zykj.study.ui.home.exercise.ExerciseViewerFragment$initObserver$4$1$1$a */
            public static final class a implements InterfaceC9267d {

                /* renamed from: a */
                public final /* synthetic */ ExerciseViewerFragment f11952a;

                public a(ExerciseViewerFragment exerciseViewerFragment) {
                    this.f11952a = exerciseViewerFragment;
                }

                @Override // p169l8.InterfaceC9267d
                /* renamed from: c, reason: merged with bridge method [inline-methods] */
                public final Object emit(List list, InterfaceC9324c interfaceC9324c) {
                    this.f11952a.m10691H().submitList(list);
                    return C8736p.f16368a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(ExerciseViewerFragment exerciseViewerFragment, InterfaceC9324c interfaceC9324c) {
                super(2, interfaceC9324c);
                this.f11951b = exerciseViewerFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
                return new AnonymousClass1(this.f11951b, interfaceC9324c);
            }

            @Override // p300x7.InterfaceC10574p
            public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
                return ((AnonymousClass1) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objM17291f = AbstractC9434a.m17291f();
                int i10 = this.f11950a;
                if (i10 == 0) {
                    AbstractC9079b.m15926b(obj);
                    InterfaceC9266c interfaceC9266cM17033w = AbstractC9268e.m17033w(this.f11951b.m10692I().m12006d());
                    a aVar = new a(this.f11951b);
                    this.f11950a = 1;
                    if (interfaceC9266cM17033w.collect(aVar, this) == objM17291f) {
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

        @InterfaceC9539d(m17800c = "com.zykj.study.ui.home.exercise.ExerciseViewerFragment$initObserver$4$1$2", m17801f = "ExerciseViewerFragment.kt", m17802l = {315}, m17803m = "invokeSuspend")
        /* renamed from: com.zykj.study.ui.home.exercise.ExerciseViewerFragment$initObserver$4$1$2, reason: invalid class name */
        public static final class AnonymousClass2 extends SuspendLambda implements InterfaceC10574p {

            /* renamed from: a */
            public int f11953a;

            /* renamed from: b */
            public final /* synthetic */ ExerciseViewerFragment f11954b;

            /* renamed from: com.zykj.study.ui.home.exercise.ExerciseViewerFragment$initObserver$4$1$2$a */
            public static final class a implements InterfaceC9267d {

                /* renamed from: a */
                public final /* synthetic */ ExerciseViewerFragment f11955a;

                public a(ExerciseViewerFragment exerciseViewerFragment) {
                    this.f11955a = exerciseViewerFragment;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // p169l8.InterfaceC9267d
                /* renamed from: c, reason: merged with bridge method [inline-methods] */
                public final Object emit(ChoiceChartData choiceChartData, InterfaceC9324c interfaceC9324c) {
                    LinearLayoutCompat linearLayoutDetailContent = ((FragmentExerciseViewerBinding) this.f11955a.getMBindView()).exerciseAnswer.answerMicro.includeChartDetails.linearLayoutDetailContent;
                    AbstractC9133u.m16132f(linearLayoutDetailContent, "linearLayoutDetailContent");
                    linearLayoutDetailContent.setVisibility(choiceChartData != null ? 0 : 8);
                    if (choiceChartData != null) {
                        ((FragmentExerciseViewerBinding) this.f11955a.getMBindView()).exerciseAnswer.answerMicro.includeChartDetails.tvDetailTitle.setText(((FragmentExerciseViewerBinding) this.f11955a.getMBindView()).getRoot().getContext().getString(R$string.chart_detail_title, choiceChartData.getShowName(), AbstractC9536a.m17798c(choiceChartData.getStudentList().size())));
                        ((FragmentExerciseViewerBinding) this.f11955a.getMBindView()).exerciseAnswer.answerMicro.includeChartDetails.tvDetailContent.setText(AbstractC8778f0.m14576v0(choiceChartData.getStudentList(), "、", null, null, 0, null, null, 62, null));
                    }
                    return C8736p.f16368a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(ExerciseViewerFragment exerciseViewerFragment, InterfaceC9324c interfaceC9324c) {
                super(2, interfaceC9324c);
                this.f11954b = exerciseViewerFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
                return new AnonymousClass2(this.f11954b, interfaceC9324c);
            }

            @Override // p300x7.InterfaceC10574p
            public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
                return ((AnonymousClass2) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objM17291f = AbstractC9434a.m17291f();
                int i10 = this.f11953a;
                if (i10 == 0) {
                    AbstractC9079b.m15926b(obj);
                    InterfaceC9280q interfaceC9280qM12011i = this.f11954b.m10692I().m12011i();
                    a aVar = new a(this.f11954b);
                    this.f11953a = 1;
                    if (interfaceC9280qM12011i.collect(aVar, this) == objM17291f) {
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

        @InterfaceC9539d(m17800c = "com.zykj.study.ui.home.exercise.ExerciseViewerFragment$initObserver$4$1$3", m17801f = "ExerciseViewerFragment.kt", m17802l = {TbsListener.ErrorCode.ERROR_QBSDK_INIT_ERROR_RET_TYPE_NOT_BUNDLE}, m17803m = "invokeSuspend")
        /* renamed from: com.zykj.study.ui.home.exercise.ExerciseViewerFragment$initObserver$4$1$3, reason: invalid class name */
        public static final class AnonymousClass3 extends SuspendLambda implements InterfaceC10574p {

            /* renamed from: a */
            public int f11956a;

            /* renamed from: b */
            public final /* synthetic */ ExerciseViewerFragment f11957b;

            /* renamed from: com.zykj.study.ui.home.exercise.ExerciseViewerFragment$initObserver$4$1$3$a */
            public static final class a implements InterfaceC9267d {

                /* renamed from: a */
                public final /* synthetic */ ExerciseViewerFragment f11958a;

                public a(ExerciseViewerFragment exerciseViewerFragment) {
                    this.f11958a = exerciseViewerFragment;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // p169l8.InterfaceC9267d
                /* renamed from: c, reason: merged with bridge method [inline-methods] */
                public final Object emit(C8736p c8736p, InterfaceC9324c interfaceC9324c) {
                    LinearLayoutCompat linearLayoutDetailContent = ((FragmentExerciseViewerBinding) this.f11958a.getMBindView()).exerciseAnswer.answerMicro.includeChartDetails.linearLayoutDetailContent;
                    AbstractC9133u.m16132f(linearLayoutDetailContent, "linearLayoutDetailContent");
                    linearLayoutDetailContent.setVisibility(8);
                    return C8736p.f16368a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass3(ExerciseViewerFragment exerciseViewerFragment, InterfaceC9324c interfaceC9324c) {
                super(2, interfaceC9324c);
                this.f11957b = exerciseViewerFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
                return new AnonymousClass3(this.f11957b, interfaceC9324c);
            }

            @Override // p300x7.InterfaceC10574p
            public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
                return ((AnonymousClass3) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objM17291f = AbstractC9434a.m17291f();
                int i10 = this.f11956a;
                if (i10 == 0) {
                    AbstractC9079b.m15926b(obj);
                    InterfaceC9275l interfaceC9275lM12009g = this.f11957b.m10692I().m12009g();
                    a aVar = new a(this.f11957b);
                    this.f11956a = 1;
                    if (interfaceC9275lM12009g.collect(aVar, this) == objM17291f) {
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
        public C78221(ExerciseViewerFragment exerciseViewerFragment, InterfaceC9324c interfaceC9324c) {
            super(2, interfaceC9324c);
            this.f11949c = exerciseViewerFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
            C78221 c78221 = new C78221(this.f11949c, interfaceC9324c);
            c78221.f11948b = obj;
            return c78221;
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
            return ((C78221) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            InterfaceC8822b0 interfaceC8822b0 = (InterfaceC8822b0) this.f11948b;
            AbstractC9434a.m17291f();
            if (this.f11947a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9079b.m15926b(obj);
            AbstractC8839h.m14861d(interfaceC8822b0, null, null, new AnonymousClass1(this.f11949c, null), 3, null);
            AbstractC8839h.m14861d(interfaceC8822b0, null, null, new AnonymousClass2(this.f11949c, null), 3, null);
            AbstractC8839h.m14861d(interfaceC8822b0, null, null, new AnonymousClass3(this.f11949c, null), 3, null);
            return C8736p.f16368a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExerciseViewerFragment$initObserver$4(ExerciseViewerFragment exerciseViewerFragment, InterfaceC9324c interfaceC9324c) {
        super(2, interfaceC9324c);
        this.f11946b = exerciseViewerFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
        return new ExerciseViewerFragment$initObserver$4(this.f11946b, interfaceC9324c);
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
        return ((ExerciseViewerFragment$initObserver$4) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM17291f = AbstractC9434a.m17291f();
        int i10 = this.f11945a;
        if (i10 == 0) {
            AbstractC9079b.m15926b(obj);
            LifecycleOwner viewLifecycleOwner = this.f11946b.getViewLifecycleOwner();
            AbstractC9133u.m16132f(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            Lifecycle.State state = Lifecycle.State.STARTED;
            C78221 c78221 = new C78221(this.f11946b, null);
            this.f11945a = 1;
            if (RepeatOnLifecycleKt.repeatOnLifecycle(viewLifecycleOwner, state, c78221, this) == objM17291f) {
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
