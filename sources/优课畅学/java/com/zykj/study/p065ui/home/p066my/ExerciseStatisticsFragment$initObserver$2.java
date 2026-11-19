package com.zykj.study.p065ui.home.p066my;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.RepeatOnLifecycleKt;
import com.zykj.study.databinding.FragmentExerciseStatisticsBinding;
import java.util.List;
import kotlin.AbstractC9079b;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.C8736p;
import p135i8.AbstractC8839h;
import p135i8.InterfaceC8822b0;
import p169l8.InterfaceC9267d;
import p169l8.InterfaceC9280q;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "com.zykj.study.ui.home.my.ExerciseStatisticsFragment$initObserver$2", m17801f = "ExerciseStatisticsFragment.kt", m17802l = {133}, m17803m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class ExerciseStatisticsFragment$initObserver$2 extends SuspendLambda implements InterfaceC10574p {

    /* renamed from: a */
    public int f12980a;

    /* renamed from: b */
    public final /* synthetic */ ExerciseStatisticsFragment f12981b;

    @InterfaceC9539d(m17800c = "com.zykj.study.ui.home.my.ExerciseStatisticsFragment$initObserver$2$1", m17801f = "ExerciseStatisticsFragment.kt", m17802l = {}, m17803m = "invokeSuspend")
    /* renamed from: com.zykj.study.ui.home.my.ExerciseStatisticsFragment$initObserver$2$1 */
    public static final class C80121 extends SuspendLambda implements InterfaceC10574p {

        /* renamed from: a */
        public int f12982a;

        /* renamed from: b */
        public /* synthetic */ Object f12983b;

        /* renamed from: c */
        public final /* synthetic */ ExerciseStatisticsFragment f12984c;

        @InterfaceC9539d(m17800c = "com.zykj.study.ui.home.my.ExerciseStatisticsFragment$initObserver$2$1$1", m17801f = "ExerciseStatisticsFragment.kt", m17802l = {136}, m17803m = "invokeSuspend")
        /* renamed from: com.zykj.study.ui.home.my.ExerciseStatisticsFragment$initObserver$2$1$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC10574p {

            /* renamed from: a */
            public int f12985a;

            /* renamed from: b */
            public final /* synthetic */ ExerciseStatisticsFragment f12986b;

            /* renamed from: com.zykj.study.ui.home.my.ExerciseStatisticsFragment$initObserver$2$1$1$a */
            public static final class a implements InterfaceC9267d {

                /* renamed from: a */
                public final /* synthetic */ ExerciseStatisticsFragment f12987a;

                public a(ExerciseStatisticsFragment exerciseStatisticsFragment) {
                    this.f12987a = exerciseStatisticsFragment;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* renamed from: c */
                public final Object m11371c(int i10, InterfaceC9324c interfaceC9324c) {
                    ((FragmentExerciseStatisticsBinding) this.f12987a.getMBindView()).viewPager.setCurrentItem(i10, false);
                    this.f12987a.m11366F(i10);
                    return C8736p.f16368a;
                }

                @Override // p169l8.InterfaceC9267d
                public /* bridge */ /* synthetic */ Object emit(Object obj, InterfaceC9324c interfaceC9324c) {
                    return m11371c(((Number) obj).intValue(), interfaceC9324c);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(ExerciseStatisticsFragment exerciseStatisticsFragment, InterfaceC9324c interfaceC9324c) {
                super(2, interfaceC9324c);
                this.f12986b = exerciseStatisticsFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
                return new AnonymousClass1(this.f12986b, interfaceC9324c);
            }

            @Override // p300x7.InterfaceC10574p
            public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
                return ((AnonymousClass1) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objM17291f = AbstractC9434a.m17291f();
                int i10 = this.f12985a;
                if (i10 == 0) {
                    AbstractC9079b.m15926b(obj);
                    InterfaceC9280q interfaceC9280qM12117i = this.f12986b.m11360u().m12117i();
                    a aVar = new a(this.f12986b);
                    this.f12985a = 1;
                    if (interfaceC9280qM12117i.collect(aVar, this) == objM17291f) {
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

        @InterfaceC9539d(m17800c = "com.zykj.study.ui.home.my.ExerciseStatisticsFragment$initObserver$2$1$2", m17801f = "ExerciseStatisticsFragment.kt", m17802l = {143}, m17803m = "invokeSuspend")
        /* renamed from: com.zykj.study.ui.home.my.ExerciseStatisticsFragment$initObserver$2$1$2, reason: invalid class name */
        public static final class AnonymousClass2 extends SuspendLambda implements InterfaceC10574p {

            /* renamed from: a */
            public int f12988a;

            /* renamed from: b */
            public final /* synthetic */ ExerciseStatisticsFragment f12989b;

            /* renamed from: com.zykj.study.ui.home.my.ExerciseStatisticsFragment$initObserver$2$1$2$a */
            public static final class a implements InterfaceC9267d {

                /* renamed from: a */
                public final /* synthetic */ ExerciseStatisticsFragment f12990a;

                public a(ExerciseStatisticsFragment exerciseStatisticsFragment) {
                    this.f12990a = exerciseStatisticsFragment;
                }

                @Override // p169l8.InterfaceC9267d
                /* renamed from: c, reason: merged with bridge method [inline-methods] */
                public final Object emit(List list, InterfaceC9324c interfaceC9324c) {
                    this.f12990a.m11369t().submitList(list);
                    return C8736p.f16368a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(ExerciseStatisticsFragment exerciseStatisticsFragment, InterfaceC9324c interfaceC9324c) {
                super(2, interfaceC9324c);
                this.f12989b = exerciseStatisticsFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
                return new AnonymousClass2(this.f12989b, interfaceC9324c);
            }

            @Override // p300x7.InterfaceC10574p
            public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
                return ((AnonymousClass2) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objM17291f = AbstractC9434a.m17291f();
                int i10 = this.f12988a;
                if (i10 == 0) {
                    AbstractC9079b.m15926b(obj);
                    InterfaceC9280q interfaceC9280qM12121m = this.f12989b.m11360u().m12121m();
                    a aVar = new a(this.f12989b);
                    this.f12988a = 1;
                    if (interfaceC9280qM12121m.collect(aVar, this) == objM17291f) {
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
        public C80121(ExerciseStatisticsFragment exerciseStatisticsFragment, InterfaceC9324c interfaceC9324c) {
            super(2, interfaceC9324c);
            this.f12984c = exerciseStatisticsFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
            C80121 c80121 = new C80121(this.f12984c, interfaceC9324c);
            c80121.f12983b = obj;
            return c80121;
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
            return ((C80121) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            InterfaceC8822b0 interfaceC8822b0 = (InterfaceC8822b0) this.f12983b;
            AbstractC9434a.m17291f();
            if (this.f12982a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9079b.m15926b(obj);
            AbstractC8839h.m14861d(interfaceC8822b0, null, null, new AnonymousClass1(this.f12984c, null), 3, null);
            AbstractC8839h.m14861d(interfaceC8822b0, null, null, new AnonymousClass2(this.f12984c, null), 3, null);
            return C8736p.f16368a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExerciseStatisticsFragment$initObserver$2(ExerciseStatisticsFragment exerciseStatisticsFragment, InterfaceC9324c interfaceC9324c) {
        super(2, interfaceC9324c);
        this.f12981b = exerciseStatisticsFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
        return new ExerciseStatisticsFragment$initObserver$2(this.f12981b, interfaceC9324c);
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
        return ((ExerciseStatisticsFragment$initObserver$2) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM17291f = AbstractC9434a.m17291f();
        int i10 = this.f12980a;
        if (i10 == 0) {
            AbstractC9079b.m15926b(obj);
            LifecycleOwner viewLifecycleOwner = this.f12981b.getViewLifecycleOwner();
            AbstractC9133u.m16132f(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            Lifecycle.State state = Lifecycle.State.STARTED;
            C80121 c80121 = new C80121(this.f12981b, null);
            this.f12980a = 1;
            if (RepeatOnLifecycleKt.repeatOnLifecycle(viewLifecycleOwner, state, c80121, this) == objM17291f) {
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
