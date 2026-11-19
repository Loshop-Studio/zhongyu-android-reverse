package com.zykj.study.p065ui.home.p066my;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.databinding.library.baseAdapters.C3721BR;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.RepeatOnLifecycleKt;
import com.tencent.ijk.media.player.IjkMediaMeta;
import com.zykj.study.R$string;
import com.zykj.study.bean.teach.ChoiceChartData;
import com.zykj.study.bean.teach.StuQuizBean;
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
import p169l8.InterfaceC9280q;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.AbstractC9536a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "com.zykj.study.ui.home.my.ExerciseStatisticsSingleDetailFragment$initObserver$1", m17801f = "ExerciseStatisticsSingleDetailFragment.kt", m17802l = {53}, m17803m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class ExerciseStatisticsSingleDetailFragment$initObserver$1 extends SuspendLambda implements InterfaceC10574p {

    /* renamed from: a */
    public int f13008a;

    /* renamed from: b */
    public final /* synthetic */ ExerciseStatisticsSingleDetailFragment f13009b;

    @InterfaceC9539d(m17800c = "com.zykj.study.ui.home.my.ExerciseStatisticsSingleDetailFragment$initObserver$1$1", m17801f = "ExerciseStatisticsSingleDetailFragment.kt", m17802l = {}, m17803m = "invokeSuspend")
    /* renamed from: com.zykj.study.ui.home.my.ExerciseStatisticsSingleDetailFragment$initObserver$1$1 */
    public static final class C80211 extends SuspendLambda implements InterfaceC10574p {

        /* renamed from: a */
        public int f13010a;

        /* renamed from: b */
        public /* synthetic */ Object f13011b;

        /* renamed from: c */
        public final /* synthetic */ ExerciseStatisticsSingleDetailFragment f13012c;

        @InterfaceC9539d(m17800c = "com.zykj.study.ui.home.my.ExerciseStatisticsSingleDetailFragment$initObserver$1$1$1", m17801f = "ExerciseStatisticsSingleDetailFragment.kt", m17802l = {C3721BR.versionName}, m17803m = "invokeSuspend")
        /* renamed from: com.zykj.study.ui.home.my.ExerciseStatisticsSingleDetailFragment$initObserver$1$1$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC10574p {

            /* renamed from: a */
            public int f13013a;

            /* renamed from: b */
            public final /* synthetic */ ExerciseStatisticsSingleDetailFragment f13014b;

            /* renamed from: com.zykj.study.ui.home.my.ExerciseStatisticsSingleDetailFragment$initObserver$1$1$1$a */
            public static final class a implements InterfaceC9267d {

                /* renamed from: a */
                public final /* synthetic */ ExerciseStatisticsSingleDetailFragment f13015a;

                public a(ExerciseStatisticsSingleDetailFragment exerciseStatisticsSingleDetailFragment) {
                    this.f13015a = exerciseStatisticsSingleDetailFragment;
                }

                @Override // p169l8.InterfaceC9267d
                /* renamed from: c, reason: merged with bridge method [inline-methods] */
                public final Object emit(StuQuizBean stuQuizBean, InterfaceC9324c interfaceC9324c) {
                    this.f13015a.getMBindView().tvMemberWithCompleted.setText(this.f13015a.getString(R$string.completion_status, AbstractC9536a.m17798c(stuQuizBean.getCompleteNum()), AbstractC9536a.m17798c(stuQuizBean.getTotalNum())));
                    this.f13015a.getMBindView().tvAvgScore.setText(this.f13015a.getMBindView().getRoot().getContext().getString(R$string.average_score, AbstractC9536a.m17798c(stuQuizBean.getAvg())));
                    return C8736p.f16368a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(ExerciseStatisticsSingleDetailFragment exerciseStatisticsSingleDetailFragment, InterfaceC9324c interfaceC9324c) {
                super(2, interfaceC9324c);
                this.f13014b = exerciseStatisticsSingleDetailFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
                return new AnonymousClass1(this.f13014b, interfaceC9324c);
            }

            @Override // p300x7.InterfaceC10574p
            public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
                return ((AnonymousClass1) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objM17291f = AbstractC9434a.m17291f();
                int i10 = this.f13013a;
                if (i10 == 0) {
                    AbstractC9079b.m15926b(obj);
                    InterfaceC9266c interfaceC9266cM17033w = AbstractC9268e.m17033w(this.f13014b.m11390n().m12127s());
                    a aVar = new a(this.f13014b);
                    this.f13013a = 1;
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

        @InterfaceC9539d(m17800c = "com.zykj.study.ui.home.my.ExerciseStatisticsSingleDetailFragment$initObserver$1$1$2", m17801f = "ExerciseStatisticsSingleDetailFragment.kt", m17802l = {70}, m17803m = "invokeSuspend")
        /* renamed from: com.zykj.study.ui.home.my.ExerciseStatisticsSingleDetailFragment$initObserver$1$1$2, reason: invalid class name */
        public static final class AnonymousClass2 extends SuspendLambda implements InterfaceC10574p {

            /* renamed from: a */
            public int f13016a;

            /* renamed from: b */
            public final /* synthetic */ ExerciseStatisticsSingleDetailFragment f13017b;

            /* renamed from: com.zykj.study.ui.home.my.ExerciseStatisticsSingleDetailFragment$initObserver$1$1$2$a */
            public static final class a implements InterfaceC9267d {

                /* renamed from: a */
                public final /* synthetic */ ExerciseStatisticsSingleDetailFragment f13018a;

                public a(ExerciseStatisticsSingleDetailFragment exerciseStatisticsSingleDetailFragment) {
                    this.f13018a = exerciseStatisticsSingleDetailFragment;
                }

                @Override // p169l8.InterfaceC9267d
                /* renamed from: c, reason: merged with bridge method [inline-methods] */
                public final Object emit(List list, InterfaceC9324c interfaceC9324c) {
                    this.f13018a.m11389m().submitList(list);
                    return C8736p.f16368a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(ExerciseStatisticsSingleDetailFragment exerciseStatisticsSingleDetailFragment, InterfaceC9324c interfaceC9324c) {
                super(2, interfaceC9324c);
                this.f13017b = exerciseStatisticsSingleDetailFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
                return new AnonymousClass2(this.f13017b, interfaceC9324c);
            }

            @Override // p300x7.InterfaceC10574p
            public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
                return ((AnonymousClass2) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objM17291f = AbstractC9434a.m17291f();
                int i10 = this.f13016a;
                if (i10 == 0) {
                    AbstractC9079b.m15926b(obj);
                    InterfaceC9266c interfaceC9266cM17033w = AbstractC9268e.m17033w(this.f13017b.m11390n().m12116h());
                    a aVar = new a(this.f13017b);
                    this.f13016a = 1;
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

        @InterfaceC9539d(m17800c = "com.zykj.study.ui.home.my.ExerciseStatisticsSingleDetailFragment$initObserver$1$1$3", m17801f = "ExerciseStatisticsSingleDetailFragment.kt", m17802l = {IjkMediaMeta.FF_PROFILE_H264_MAIN}, m17803m = "invokeSuspend")
        /* renamed from: com.zykj.study.ui.home.my.ExerciseStatisticsSingleDetailFragment$initObserver$1$1$3, reason: invalid class name */
        public static final class AnonymousClass3 extends SuspendLambda implements InterfaceC10574p {

            /* renamed from: a */
            public int f13019a;

            /* renamed from: b */
            public final /* synthetic */ ExerciseStatisticsSingleDetailFragment f13020b;

            /* renamed from: com.zykj.study.ui.home.my.ExerciseStatisticsSingleDetailFragment$initObserver$1$1$3$a */
            public static final class a implements InterfaceC9267d {

                /* renamed from: a */
                public final /* synthetic */ ExerciseStatisticsSingleDetailFragment f13021a;

                public a(ExerciseStatisticsSingleDetailFragment exerciseStatisticsSingleDetailFragment) {
                    this.f13021a = exerciseStatisticsSingleDetailFragment;
                }

                @Override // p169l8.InterfaceC9267d
                /* renamed from: c, reason: merged with bridge method [inline-methods] */
                public final Object emit(ChoiceChartData choiceChartData, InterfaceC9324c interfaceC9324c) {
                    LinearLayoutCompat linearLayoutDetailContent = this.f13021a.getMBindView().linearLayoutDetailContent;
                    AbstractC9133u.m16132f(linearLayoutDetailContent, "linearLayoutDetailContent");
                    linearLayoutDetailContent.setVisibility(choiceChartData != null ? 0 : 8);
                    if (choiceChartData != null) {
                        this.f13021a.getMBindView().tvDetailTitle.setText(this.f13021a.getMBindView().getRoot().getContext().getString(R$string.chart_detail_title, choiceChartData.getShowName(), AbstractC9536a.m17798c(choiceChartData.getStudentList().size())));
                        this.f13021a.getMBindView().tvDetailContent.setText(AbstractC8778f0.m14576v0(choiceChartData.getStudentList(), "、", null, null, 0, null, null, 62, null));
                    }
                    return C8736p.f16368a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass3(ExerciseStatisticsSingleDetailFragment exerciseStatisticsSingleDetailFragment, InterfaceC9324c interfaceC9324c) {
                super(2, interfaceC9324c);
                this.f13020b = exerciseStatisticsSingleDetailFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
                return new AnonymousClass3(this.f13020b, interfaceC9324c);
            }

            @Override // p300x7.InterfaceC10574p
            public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
                return ((AnonymousClass3) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objM17291f = AbstractC9434a.m17291f();
                int i10 = this.f13019a;
                if (i10 == 0) {
                    AbstractC9079b.m15926b(obj);
                    InterfaceC9280q interfaceC9280qM12126r = this.f13020b.m11390n().m12126r();
                    a aVar = new a(this.f13020b);
                    this.f13019a = 1;
                    if (interfaceC9280qM12126r.collect(aVar, this) == objM17291f) {
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
        public C80211(ExerciseStatisticsSingleDetailFragment exerciseStatisticsSingleDetailFragment, InterfaceC9324c interfaceC9324c) {
            super(2, interfaceC9324c);
            this.f13012c = exerciseStatisticsSingleDetailFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
            C80211 c80211 = new C80211(this.f13012c, interfaceC9324c);
            c80211.f13011b = obj;
            return c80211;
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
            return ((C80211) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            InterfaceC8822b0 interfaceC8822b0 = (InterfaceC8822b0) this.f13011b;
            AbstractC9434a.m17291f();
            if (this.f13010a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9079b.m15926b(obj);
            AbstractC8839h.m14861d(interfaceC8822b0, null, null, new AnonymousClass1(this.f13012c, null), 3, null);
            AbstractC8839h.m14861d(interfaceC8822b0, null, null, new AnonymousClass2(this.f13012c, null), 3, null);
            AbstractC8839h.m14861d(interfaceC8822b0, null, null, new AnonymousClass3(this.f13012c, null), 3, null);
            return C8736p.f16368a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExerciseStatisticsSingleDetailFragment$initObserver$1(ExerciseStatisticsSingleDetailFragment exerciseStatisticsSingleDetailFragment, InterfaceC9324c interfaceC9324c) {
        super(2, interfaceC9324c);
        this.f13009b = exerciseStatisticsSingleDetailFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
        return new ExerciseStatisticsSingleDetailFragment$initObserver$1(this.f13009b, interfaceC9324c);
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
        return ((ExerciseStatisticsSingleDetailFragment$initObserver$1) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM17291f = AbstractC9434a.m17291f();
        int i10 = this.f13008a;
        if (i10 == 0) {
            AbstractC9079b.m15926b(obj);
            LifecycleOwner viewLifecycleOwner = this.f13009b.getViewLifecycleOwner();
            AbstractC9133u.m16132f(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            Lifecycle.State state = Lifecycle.State.STARTED;
            C80211 c80211 = new C80211(this.f13009b, null);
            this.f13008a = 1;
            if (RepeatOnLifecycleKt.repeatOnLifecycle(viewLifecycleOwner, state, c80211, this) == objM17291f) {
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
