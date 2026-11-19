package com.zykj.view.board.simple;

import android.widget.RadioGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.RepeatOnLifecycleKt;
import com.tencent.smtt.sdk.TbsListener;
import com.zykj.view.board.simple.AbstractC8251b;
import com.zykj.view.databinding.ViewFragmentSimpleBinding;
import com.zykj.view.databinding.ViewIncludeMenuBinding;
import com.zykj.view.databinding.ViewIncludePenBinding;
import kotlin.AbstractC9079b;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9133u;
import p007a6.AbstractC0027a;
import p123h7.C8736p;
import p135i8.AbstractC8839h;
import p135i8.InterfaceC8822b0;
import p169l8.AbstractC9268e;
import p169l8.InterfaceC9275l;
import p169l8.InterfaceC9280q;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "com.zykj.view.board.simple.SimpleFragment$initObserver$1", m17801f = "SimpleFragment.kt", m17802l = {TbsListener.ErrorCode.COPY_FAIL}, m17803m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class SimpleFragment$initObserver$1 extends SuspendLambda implements InterfaceC10574p {

    /* renamed from: a */
    public int f15226a;

    /* renamed from: b */
    public final /* synthetic */ SimpleFragment f15227b;

    @InterfaceC9539d(m17800c = "com.zykj.view.board.simple.SimpleFragment$initObserver$1$1", m17801f = "SimpleFragment.kt", m17802l = {}, m17803m = "invokeSuspend")
    /* renamed from: com.zykj.view.board.simple.SimpleFragment$initObserver$1$1 */
    public static final class C82491 extends SuspendLambda implements InterfaceC10574p {

        /* renamed from: a */
        public int f15228a;

        /* renamed from: b */
        public /* synthetic */ Object f15229b;

        /* renamed from: c */
        public final /* synthetic */ SimpleFragment f15230c;

        @InterfaceC9539d(m17800c = "com.zykj.view.board.simple.SimpleFragment$initObserver$1$1$1", m17801f = "SimpleFragment.kt", m17802l = {TbsListener.ErrorCode.COPY_TMPDIR_ERROR}, m17803m = "invokeSuspend")
        /* renamed from: com.zykj.view.board.simple.SimpleFragment$initObserver$1$1$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC10574p {

            /* renamed from: a */
            public int f15231a;

            /* renamed from: b */
            public final /* synthetic */ SimpleFragment f15232b;

            @InterfaceC9539d(m17800c = "com.zykj.view.board.simple.SimpleFragment$initObserver$1$1$1$1", m17801f = "SimpleFragment.kt", m17802l = {}, m17803m = "invokeSuspend")
            /* renamed from: com.zykj.view.board.simple.SimpleFragment$initObserver$1$1$1$1, reason: invalid class name and collision with other inner class name */
            public static final class C108011 extends SuspendLambda implements InterfaceC10574p {

                /* renamed from: a */
                public int f15233a;

                /* renamed from: b */
                public /* synthetic */ Object f15234b;

                /* renamed from: c */
                public final /* synthetic */ SimpleFragment f15235c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C108011(SimpleFragment simpleFragment, InterfaceC9324c interfaceC9324c) {
                    super(2, interfaceC9324c);
                    this.f15235c = simpleFragment;
                }

                @Override // p300x7.InterfaceC10574p
                /* renamed from: c, reason: merged with bridge method [inline-methods] */
                public final Object invoke(AbstractC8251b abstractC8251b, InterfaceC9324c interfaceC9324c) {
                    return ((C108011) create(abstractC8251b, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
                    C108011 c108011 = new C108011(this.f15235c, interfaceC9324c);
                    c108011.f15234b = obj;
                    return c108011;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) throws Throwable {
                    AbstractC8251b abstractC8251b = (AbstractC8251b) this.f15234b;
                    AbstractC9434a.m17291f();
                    if (this.f15233a != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC9079b.m15926b(obj);
                    if (abstractC8251b instanceof AbstractC8251b.b) {
                        this.f15235c.m13193S(((AbstractC8251b.b) abstractC8251b).m13236a());
                    } else if (abstractC8251b instanceof AbstractC8251b.d) {
                        this.f15235c.m13213x().m19195i(((AbstractC8251b.d) abstractC8251b).m13238a());
                    } else if (abstractC8251b instanceof AbstractC8251b.f) {
                        AbstractC8251b.f fVar = (AbstractC8251b.f) abstractC8251b;
                        this.f15235c.m13214y().setActonMode(fVar.m13240a());
                        this.f15235c.m13213x().m19198l(fVar.m13241b());
                    } else if (abstractC8251b instanceof AbstractC8251b.g) {
                        this.f15235c.m13213x().m19199m(((AbstractC8251b.g) abstractC8251b).m13242a());
                    } else if (abstractC8251b instanceof AbstractC8251b.e) {
                        this.f15235c.m13213x().m19197k(((AbstractC8251b.e) abstractC8251b).m13239a());
                    } else if (abstractC8251b instanceof AbstractC8251b.c) {
                        this.f15235c.m13213x().m19196j(((AbstractC8251b.c) abstractC8251b).m13237a());
                    } else {
                        if (!(abstractC8251b instanceof AbstractC8251b.a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        this.f15235c.m13214y().m13294d();
                    }
                    return C8736p.f16368a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(SimpleFragment simpleFragment, InterfaceC9324c interfaceC9324c) {
                super(2, interfaceC9324c);
                this.f15232b = simpleFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
                return new AnonymousClass1(this.f15232b, interfaceC9324c);
            }

            @Override // p300x7.InterfaceC10574p
            public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
                return ((AnonymousClass1) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objM17291f = AbstractC9434a.m17291f();
                int i10 = this.f15231a;
                if (i10 == 0) {
                    AbstractC9079b.m15926b(obj);
                    InterfaceC9275l interfaceC9275lM13223d = this.f15232b.m13212w().m13223d();
                    C108011 c108011 = new C108011(this.f15232b, null);
                    this.f15231a = 1;
                    if (AbstractC9268e.m17019i(interfaceC9275lM13223d, c108011, this) == objM17291f) {
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

        @InterfaceC9539d(m17800c = "com.zykj.view.board.simple.SimpleFragment$initObserver$1$1$2", m17801f = "SimpleFragment.kt", m17802l = {243}, m17803m = "invokeSuspend")
        /* renamed from: com.zykj.view.board.simple.SimpleFragment$initObserver$1$1$2, reason: invalid class name */
        public static final class AnonymousClass2 extends SuspendLambda implements InterfaceC10574p {

            /* renamed from: a */
            public int f15236a;

            /* renamed from: b */
            public final /* synthetic */ SimpleFragment f15237b;

            @InterfaceC9539d(m17800c = "com.zykj.view.board.simple.SimpleFragment$initObserver$1$1$2$1", m17801f = "SimpleFragment.kt", m17802l = {}, m17803m = "invokeSuspend")
            /* renamed from: com.zykj.view.board.simple.SimpleFragment$initObserver$1$1$2$1, reason: invalid class name */
            public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC10574p {

                /* renamed from: a */
                public int f15238a;

                /* renamed from: b */
                public /* synthetic */ Object f15239b;

                /* renamed from: c */
                public final /* synthetic */ SimpleFragment f15240c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(SimpleFragment simpleFragment, InterfaceC9324c interfaceC9324c) {
                    super(2, interfaceC9324c);
                    this.f15240c = simpleFragment;
                }

                @Override // p300x7.InterfaceC10574p
                /* renamed from: c, reason: merged with bridge method [inline-methods] */
                public final Object invoke(C8254e c8254e, InterfaceC9324c interfaceC9324c) {
                    return ((AnonymousClass1) create(c8254e, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f15240c, interfaceC9324c);
                    anonymousClass1.f15239b = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) throws Throwable {
                    C8254e c8254e = (C8254e) this.f15239b;
                    AbstractC9434a.m17291f();
                    if (this.f15238a != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC9079b.m15926b(obj);
                    ViewFragmentSimpleBinding viewFragmentSimpleBinding = this.f15240c.f15223c;
                    ViewFragmentSimpleBinding viewFragmentSimpleBinding2 = null;
                    if (viewFragmentSimpleBinding == null) {
                        AbstractC9133u.m16151y("mBinding");
                        viewFragmentSimpleBinding = null;
                    }
                    ViewIncludeMenuBinding viewIncludeMenuBinding = viewFragmentSimpleBinding.f15402e;
                    viewIncludeMenuBinding.f15465j.setSelected(c8254e.m13257j());
                    viewIncludeMenuBinding.f15464i.setSelected(c8254e.m13252e().m12894d());
                    viewIncludeMenuBinding.f15461f.setSelected(c8254e.m13252e().m12893c());
                    viewIncludeMenuBinding.f15459d.setSelected(c8254e.m13252e().m12891a());
                    ViewFragmentSimpleBinding viewFragmentSimpleBinding3 = this.f15240c.f15223c;
                    if (viewFragmentSimpleBinding3 == null) {
                        AbstractC9133u.m16151y("mBinding");
                        viewFragmentSimpleBinding3 = null;
                    }
                    ViewIncludePenBinding viewIncludePenBinding = viewFragmentSimpleBinding3.f15403f;
                    RadioGroup rgPenType = viewIncludePenBinding.f15481k;
                    AbstractC9133u.m16132f(rgPenType, "rgPenType");
                    AbstractC0027a.m62a(rgPenType, c8254e.m13256i().m13246b());
                    RadioGroup rgPenSize = viewIncludePenBinding.f15480j;
                    AbstractC9133u.m16132f(rgPenSize, "rgPenSize");
                    AbstractC0027a.m62a(rgPenSize, c8254e.m13255h().m13243a());
                    RadioGroup rgPenColor = viewIncludePenBinding.f15479i;
                    AbstractC9133u.m16132f(rgPenColor, "rgPenColor");
                    AbstractC0027a.m62a(rgPenColor, c8254e.m13254g().m12900b());
                    ViewFragmentSimpleBinding viewFragmentSimpleBinding4 = this.f15240c.f15223c;
                    if (viewFragmentSimpleBinding4 == null) {
                        AbstractC9133u.m16151y("mBinding");
                        viewFragmentSimpleBinding4 = null;
                    }
                    RadioGroup rgEraserSize = viewFragmentSimpleBinding4.f15400c.f15441d;
                    AbstractC9133u.m16132f(rgEraserSize, "rgEraserSize");
                    AbstractC0027a.m62a(rgEraserSize, c8254e.m13250c().m12856a());
                    ViewFragmentSimpleBinding viewFragmentSimpleBinding5 = this.f15240c.f15223c;
                    if (viewFragmentSimpleBinding5 == null) {
                        AbstractC9133u.m16151y("mBinding");
                    } else {
                        viewFragmentSimpleBinding2 = viewFragmentSimpleBinding5;
                    }
                    viewFragmentSimpleBinding2.f15406i.setImageResource(c8254e.m13251d().m12860a());
                    return C8736p.f16368a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(SimpleFragment simpleFragment, InterfaceC9324c interfaceC9324c) {
                super(2, interfaceC9324c);
                this.f15237b = simpleFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
                return new AnonymousClass2(this.f15237b, interfaceC9324c);
            }

            @Override // p300x7.InterfaceC10574p
            public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
                return ((AnonymousClass2) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objM17291f = AbstractC9434a.m17291f();
                int i10 = this.f15236a;
                if (i10 == 0) {
                    AbstractC9079b.m15926b(obj);
                    InterfaceC9280q interfaceC9280qM13224e = this.f15237b.m13212w().m13224e();
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f15237b, null);
                    this.f15236a = 1;
                    if (AbstractC9268e.m17019i(interfaceC9280qM13224e, anonymousClass1, this) == objM17291f) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C82491(SimpleFragment simpleFragment, InterfaceC9324c interfaceC9324c) {
            super(2, interfaceC9324c);
            this.f15230c = simpleFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
            C82491 c82491 = new C82491(this.f15230c, interfaceC9324c);
            c82491.f15229b = obj;
            return c82491;
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
            return ((C82491) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            InterfaceC8822b0 interfaceC8822b0 = (InterfaceC8822b0) this.f15229b;
            AbstractC9434a.m17291f();
            if (this.f15228a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9079b.m15926b(obj);
            AbstractC8839h.m14861d(interfaceC8822b0, null, null, new AnonymousClass1(this.f15230c, null), 3, null);
            AbstractC8839h.m14861d(interfaceC8822b0, null, null, new AnonymousClass2(this.f15230c, null), 3, null);
            return C8736p.f16368a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SimpleFragment$initObserver$1(SimpleFragment simpleFragment, InterfaceC9324c interfaceC9324c) {
        super(2, interfaceC9324c);
        this.f15227b = simpleFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
        return new SimpleFragment$initObserver$1(this.f15227b, interfaceC9324c);
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
        return ((SimpleFragment$initObserver$1) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM17291f = AbstractC9434a.m17291f();
        int i10 = this.f15226a;
        if (i10 == 0) {
            AbstractC9079b.m15926b(obj);
            LifecycleOwner viewLifecycleOwner = this.f15227b.getViewLifecycleOwner();
            AbstractC9133u.m16132f(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            Lifecycle.State state = Lifecycle.State.RESUMED;
            C82491 c82491 = new C82491(this.f15227b, null);
            this.f15226a = 1;
            if (RepeatOnLifecycleKt.repeatOnLifecycle(viewLifecycleOwner, state, c82491, this) == objM17291f) {
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
