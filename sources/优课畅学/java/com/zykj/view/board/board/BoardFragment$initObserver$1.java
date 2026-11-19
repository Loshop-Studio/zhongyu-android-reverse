package com.zykj.view.board.board;

import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.RepeatOnLifecycleKt;
import com.zykj.view.board.board.AbstractC8207c;
import com.zykj.view.databinding.ViewFragmentBoardBinding;
import com.zykj.view.databinding.ViewIncludeBackgroundColorBinding;
import com.zykj.view.databinding.ViewIncludeImageAddBinding;
import com.zykj.view.databinding.ViewIncludeMenuBinding;
import com.zykj.view.databinding.ViewIncludePenBinding;
import com.zykj.view.databinding.ViewItemSketchRecordAudioBinding;
import com.zykj.view.widget.SketchProgressView;
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

@InterfaceC9539d(m17800c = "com.zykj.view.board.board.BoardFragment$initObserver$1", m17801f = "BoardFragment.kt", m17802l = {496}, m17803m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class BoardFragment$initObserver$1 extends SuspendLambda implements InterfaceC10574p {

    /* renamed from: a */
    public int f14871a;

    /* renamed from: b */
    public final /* synthetic */ BoardFragment f14872b;

    @InterfaceC9539d(m17800c = "com.zykj.view.board.board.BoardFragment$initObserver$1$1", m17801f = "BoardFragment.kt", m17802l = {}, m17803m = "invokeSuspend")
    /* renamed from: com.zykj.view.board.board.BoardFragment$initObserver$1$1 */
    public static final class C82001 extends SuspendLambda implements InterfaceC10574p {

        /* renamed from: a */
        public int f14873a;

        /* renamed from: b */
        public /* synthetic */ Object f14874b;

        /* renamed from: c */
        public final /* synthetic */ BoardFragment f14875c;

        @InterfaceC9539d(m17800c = "com.zykj.view.board.board.BoardFragment$initObserver$1$1$1", m17801f = "BoardFragment.kt", m17802l = {499}, m17803m = "invokeSuspend")
        /* renamed from: com.zykj.view.board.board.BoardFragment$initObserver$1$1$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC10574p {

            /* renamed from: a */
            public int f14876a;

            /* renamed from: b */
            public final /* synthetic */ BoardFragment f14877b;

            @InterfaceC9539d(m17800c = "com.zykj.view.board.board.BoardFragment$initObserver$1$1$1$1", m17801f = "BoardFragment.kt", m17802l = {}, m17803m = "invokeSuspend")
            /* renamed from: com.zykj.view.board.board.BoardFragment$initObserver$1$1$1$1, reason: invalid class name and collision with other inner class name */
            public static final class C108001 extends SuspendLambda implements InterfaceC10574p {

                /* renamed from: a */
                public int f14878a;

                /* renamed from: b */
                public /* synthetic */ Object f14879b;

                /* renamed from: c */
                public final /* synthetic */ BoardFragment f14880c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C108001(BoardFragment boardFragment, InterfaceC9324c interfaceC9324c) {
                    super(2, interfaceC9324c);
                    this.f14880c = boardFragment;
                }

                @Override // p300x7.InterfaceC10574p
                /* renamed from: c, reason: merged with bridge method [inline-methods] */
                public final Object invoke(AbstractC8207c abstractC8207c, InterfaceC9324c interfaceC9324c) {
                    return ((C108001) create(abstractC8207c, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
                    C108001 c108001 = new C108001(this.f14880c, interfaceC9324c);
                    c108001.f14879b = obj;
                    return c108001;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) throws Throwable {
                    AbstractC8207c abstractC8207c = (AbstractC8207c) this.f14879b;
                    AbstractC9434a.m17291f();
                    if (this.f14878a != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC9079b.m15926b(obj);
                    if (!(abstractC8207c instanceof AbstractC8207c.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    this.f14880c.m12672F1(((AbstractC8207c.a) abstractC8207c).m12836a());
                    return C8736p.f16368a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(BoardFragment boardFragment, InterfaceC9324c interfaceC9324c) {
                super(2, interfaceC9324c);
                this.f14877b = boardFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
                return new AnonymousClass1(this.f14877b, interfaceC9324c);
            }

            @Override // p300x7.InterfaceC10574p
            public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
                return ((AnonymousClass1) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objM17291f = AbstractC9434a.m17291f();
                int i10 = this.f14876a;
                if (i10 == 0) {
                    AbstractC9079b.m15926b(obj);
                    InterfaceC9275l interfaceC9275lM12774M = this.f14877b.m12678m0().m12774M();
                    C108001 c108001 = new C108001(this.f14877b, null);
                    this.f14876a = 1;
                    if (AbstractC9268e.m17019i(interfaceC9275lM12774M, c108001, this) == objM17291f) {
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

        @InterfaceC9539d(m17800c = "com.zykj.view.board.board.BoardFragment$initObserver$1$1$2", m17801f = "BoardFragment.kt", m17802l = {510}, m17803m = "invokeSuspend")
        /* renamed from: com.zykj.view.board.board.BoardFragment$initObserver$1$1$2, reason: invalid class name */
        public static final class AnonymousClass2 extends SuspendLambda implements InterfaceC10574p {

            /* renamed from: a */
            public int f14881a;

            /* renamed from: b */
            public final /* synthetic */ BoardFragment f14882b;

            @InterfaceC9539d(m17800c = "com.zykj.view.board.board.BoardFragment$initObserver$1$1$2$1", m17801f = "BoardFragment.kt", m17802l = {}, m17803m = "invokeSuspend")
            /* renamed from: com.zykj.view.board.board.BoardFragment$initObserver$1$1$2$1, reason: invalid class name */
            public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC10574p {

                /* renamed from: a */
                public int f14883a;

                /* renamed from: b */
                public /* synthetic */ Object f14884b;

                /* renamed from: c */
                public final /* synthetic */ BoardFragment f14885c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(BoardFragment boardFragment, InterfaceC9324c interfaceC9324c) {
                    super(2, interfaceC9324c);
                    this.f14885c = boardFragment;
                }

                @Override // p300x7.InterfaceC10574p
                /* renamed from: c, reason: merged with bridge method [inline-methods] */
                public final Object invoke(C8220p c8220p, InterfaceC9324c interfaceC9324c) {
                    return ((AnonymousClass1) create(c8220p, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f14885c, interfaceC9324c);
                    anonymousClass1.f14884b = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) throws Throwable {
                    C8220p c8220p = (C8220p) this.f14884b;
                    AbstractC9434a.m17291f();
                    if (this.f14883a != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC9079b.m15926b(obj);
                    ViewFragmentBoardBinding viewFragmentBoardBinding = this.f14885c.f14834a;
                    if (viewFragmentBoardBinding == null) {
                        AbstractC9133u.m16151y("mBinding");
                        viewFragmentBoardBinding = null;
                    }
                    ViewIncludeMenuBinding viewIncludeMenuBinding = viewFragmentBoardBinding.f15371e;
                    AppCompatImageView ivWithdraw = viewIncludeMenuBinding.f15466k;
                    AbstractC9133u.m16132f(ivWithdraw, "ivWithdraw");
                    ivWithdraw.setVisibility(c8220p.m12886d() ? 0 : 8);
                    AppCompatImageView ivRecover = viewIncludeMenuBinding.f15462g;
                    AbstractC9133u.m16132f(ivRecover, "ivRecover");
                    ivRecover.setVisibility(c8220p.m12886d() ? 0 : 8);
                    AppCompatImageView ivEnlarge = viewIncludeMenuBinding.f15458c;
                    AbstractC9133u.m16132f(ivEnlarge, "ivEnlarge");
                    ivEnlarge.setVisibility(c8220p.m12887e() ? 0 : 8);
                    AppCompatImageView ivReduce = viewIncludeMenuBinding.f15463h;
                    AbstractC9133u.m16132f(ivReduce, "ivReduce");
                    ivReduce.setVisibility(c8220p.m12887e() ? 0 : 8);
                    viewIncludeMenuBinding.f15466k.setEnabled(c8220p.m12890h());
                    viewIncludeMenuBinding.f15462g.setEnabled(c8220p.m12888f());
                    viewIncludeMenuBinding.f15465j.setSelected(c8220p.m12889g());
                    viewIncludeMenuBinding.f15464i.setSelected(c8220p.m12885c().m12894d());
                    viewIncludeMenuBinding.f15461f.setSelected(c8220p.m12885c().m12893c());
                    viewIncludeMenuBinding.f15459d.setSelected(c8220p.m12885c().m12891a());
                    viewIncludeMenuBinding.f15460e.setSelected(c8220p.m12885c().m12892b());
                    return C8736p.f16368a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(BoardFragment boardFragment, InterfaceC9324c interfaceC9324c) {
                super(2, interfaceC9324c);
                this.f14882b = boardFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
                return new AnonymousClass2(this.f14882b, interfaceC9324c);
            }

            @Override // p300x7.InterfaceC10574p
            public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
                return ((AnonymousClass2) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objM17291f = AbstractC9434a.m17291f();
                int i10 = this.f14881a;
                if (i10 == 0) {
                    AbstractC9079b.m15926b(obj);
                    InterfaceC9280q interfaceC9280qM12784R = this.f14882b.m12678m0().m12784R();
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f14882b, null);
                    this.f14881a = 1;
                    if (AbstractC9268e.m17019i(interfaceC9280qM12784R, anonymousClass1, this) == objM17291f) {
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

        @InterfaceC9539d(m17800c = "com.zykj.view.board.board.BoardFragment$initObserver$1$1$3", m17801f = "BoardFragment.kt", m17802l = {532}, m17803m = "invokeSuspend")
        /* renamed from: com.zykj.view.board.board.BoardFragment$initObserver$1$1$3, reason: invalid class name */
        public static final class AnonymousClass3 extends SuspendLambda implements InterfaceC10574p {

            /* renamed from: a */
            public int f14886a;

            /* renamed from: b */
            public final /* synthetic */ BoardFragment f14887b;

            @InterfaceC9539d(m17800c = "com.zykj.view.board.board.BoardFragment$initObserver$1$1$3$1", m17801f = "BoardFragment.kt", m17802l = {}, m17803m = "invokeSuspend")
            /* renamed from: com.zykj.view.board.board.BoardFragment$initObserver$1$1$3$1, reason: invalid class name */
            public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC10574p {

                /* renamed from: a */
                public int f14888a;

                /* renamed from: b */
                public /* synthetic */ Object f14889b;

                /* renamed from: c */
                public final /* synthetic */ BoardFragment f14890c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(BoardFragment boardFragment, InterfaceC9324c interfaceC9324c) {
                    super(2, interfaceC9324c);
                    this.f14890c = boardFragment;
                }

                @Override // p300x7.InterfaceC10574p
                /* renamed from: c, reason: merged with bridge method [inline-methods] */
                public final Object invoke(C8224t c8224t, InterfaceC9324c interfaceC9324c) {
                    return ((AnonymousClass1) create(c8224t, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f14890c, interfaceC9324c);
                    anonymousClass1.f14889b = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) throws Throwable {
                    C8224t c8224t = (C8224t) this.f14889b;
                    AbstractC9434a.m17291f();
                    if (this.f14888a != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC9079b.m15926b(obj);
                    ViewFragmentBoardBinding viewFragmentBoardBinding = this.f14890c.f14834a;
                    if (viewFragmentBoardBinding == null) {
                        AbstractC9133u.m16151y("mBinding");
                        viewFragmentBoardBinding = null;
                    }
                    ViewIncludePenBinding viewIncludePenBinding = viewFragmentBoardBinding.f15372f;
                    RadioButton rbPenDottedLine = viewIncludePenBinding.f15473c;
                    AbstractC9133u.m16132f(rbPenDottedLine, "rbPenDottedLine");
                    rbPenDottedLine.setVisibility(c8224t.m12903c() ? 0 : 8);
                    RadioButton rbPenHighlighter = viewIncludePenBinding.f15474d;
                    AbstractC9133u.m16132f(rbPenHighlighter, "rbPenHighlighter");
                    rbPenHighlighter.setVisibility(c8224t.m12904d() ? 0 : 8);
                    RadioGroup rgPenType = viewIncludePenBinding.f15481k;
                    AbstractC9133u.m16132f(rgPenType, "rgPenType");
                    AbstractC0027a.m62a(rgPenType, c8224t.m12907g().m12909b());
                    RadioGroup rgPenSize = viewIncludePenBinding.f15480j;
                    AbstractC9133u.m16132f(rgPenSize, "rgPenSize");
                    AbstractC0027a.m62a(rgPenSize, c8224t.m12906f());
                    RadioGroup rgPenColor = viewIncludePenBinding.f15479i;
                    AbstractC9133u.m16132f(rgPenColor, "rgPenColor");
                    AbstractC0027a.m62a(rgPenColor, c8224t.m12905e().m12900b());
                    return C8736p.f16368a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass3(BoardFragment boardFragment, InterfaceC9324c interfaceC9324c) {
                super(2, interfaceC9324c);
                this.f14887b = boardFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
                return new AnonymousClass3(this.f14887b, interfaceC9324c);
            }

            @Override // p300x7.InterfaceC10574p
            public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
                return ((AnonymousClass3) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objM17291f = AbstractC9434a.m17291f();
                int i10 = this.f14886a;
                if (i10 == 0) {
                    AbstractC9079b.m15926b(obj);
                    InterfaceC9280q interfaceC9280qM12788T = this.f14887b.m12678m0().m12788T();
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f14887b, null);
                    this.f14886a = 1;
                    if (AbstractC9268e.m17019i(interfaceC9280qM12788T, anonymousClass1, this) == objM17291f) {
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

        @InterfaceC9539d(m17800c = "com.zykj.view.board.board.BoardFragment$initObserver$1$1$4", m17801f = "BoardFragment.kt", m17802l = {546}, m17803m = "invokeSuspend")
        /* renamed from: com.zykj.view.board.board.BoardFragment$initObserver$1$1$4, reason: invalid class name */
        public static final class AnonymousClass4 extends SuspendLambda implements InterfaceC10574p {

            /* renamed from: a */
            public int f14891a;

            /* renamed from: b */
            public final /* synthetic */ BoardFragment f14892b;

            @InterfaceC9539d(m17800c = "com.zykj.view.board.board.BoardFragment$initObserver$1$1$4$1", m17801f = "BoardFragment.kt", m17802l = {}, m17803m = "invokeSuspend")
            /* renamed from: com.zykj.view.board.board.BoardFragment$initObserver$1$1$4$1, reason: invalid class name */
            public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC10574p {

                /* renamed from: a */
                public int f14893a;

                /* renamed from: b */
                public /* synthetic */ Object f14894b;

                /* renamed from: c */
                public final /* synthetic */ BoardFragment f14895c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(BoardFragment boardFragment, InterfaceC9324c interfaceC9324c) {
                    super(2, interfaceC9324c);
                    this.f14895c = boardFragment;
                }

                @Override // p300x7.InterfaceC10574p
                /* renamed from: c, reason: merged with bridge method [inline-methods] */
                public final Object invoke(C8213i c8213i, InterfaceC9324c interfaceC9324c) {
                    return ((AnonymousClass1) create(c8213i, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f14895c, interfaceC9324c);
                    anonymousClass1.f14894b = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) throws Throwable {
                    C8213i c8213i = (C8213i) this.f14894b;
                    AbstractC9434a.m17291f();
                    if (this.f14893a != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC9079b.m15926b(obj);
                    ViewFragmentBoardBinding viewFragmentBoardBinding = this.f14895c.f14834a;
                    if (viewFragmentBoardBinding == null) {
                        AbstractC9133u.m16151y("mBinding");
                        viewFragmentBoardBinding = null;
                    }
                    RadioGroup rgEraserSize = viewFragmentBoardBinding.f15369c.f15441d;
                    AbstractC9133u.m16132f(rgEraserSize, "rgEraserSize");
                    AbstractC0027a.m62a(rgEraserSize, c8213i.m12855b().m12856a());
                    return C8736p.f16368a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass4(BoardFragment boardFragment, InterfaceC9324c interfaceC9324c) {
                super(2, interfaceC9324c);
                this.f14892b = boardFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
                return new AnonymousClass4(this.f14892b, interfaceC9324c);
            }

            @Override // p300x7.InterfaceC10574p
            public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
                return ((AnonymousClass4) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objM17291f = AbstractC9434a.m17291f();
                int i10 = this.f14891a;
                if (i10 == 0) {
                    AbstractC9079b.m15926b(obj);
                    InterfaceC9280q interfaceC9280qM12772L = this.f14892b.m12678m0().m12772L();
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f14892b, null);
                    this.f14891a = 1;
                    if (AbstractC9268e.m17019i(interfaceC9280qM12772L, anonymousClass1, this) == objM17291f) {
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

        @InterfaceC9539d(m17800c = "com.zykj.view.board.board.BoardFragment$initObserver$1$1$5", m17801f = "BoardFragment.kt", m17802l = {555}, m17803m = "invokeSuspend")
        /* renamed from: com.zykj.view.board.board.BoardFragment$initObserver$1$1$5, reason: invalid class name */
        public static final class AnonymousClass5 extends SuspendLambda implements InterfaceC10574p {

            /* renamed from: a */
            public int f14896a;

            /* renamed from: b */
            public final /* synthetic */ BoardFragment f14897b;

            @InterfaceC9539d(m17800c = "com.zykj.view.board.board.BoardFragment$initObserver$1$1$5$1", m17801f = "BoardFragment.kt", m17802l = {}, m17803m = "invokeSuspend")
            /* renamed from: com.zykj.view.board.board.BoardFragment$initObserver$1$1$5$1, reason: invalid class name */
            public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC10574p {

                /* renamed from: a */
                public int f14898a;

                /* renamed from: b */
                public /* synthetic */ Object f14899b;

                /* renamed from: c */
                public final /* synthetic */ BoardFragment f14900c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(BoardFragment boardFragment, InterfaceC9324c interfaceC9324c) {
                    super(2, interfaceC9324c);
                    this.f14900c = boardFragment;
                }

                @Override // p300x7.InterfaceC10574p
                /* renamed from: c, reason: merged with bridge method [inline-methods] */
                public final Object invoke(C8218n c8218n, InterfaceC9324c interfaceC9324c) {
                    return ((AnonymousClass1) create(c8218n, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f14900c, interfaceC9324c);
                    anonymousClass1.f14899b = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) throws Throwable {
                    C8218n c8218n = (C8218n) this.f14899b;
                    AbstractC9434a.m17291f();
                    if (this.f14898a != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC9079b.m15926b(obj);
                    ViewFragmentBoardBinding viewFragmentBoardBinding = this.f14900c.f14834a;
                    if (viewFragmentBoardBinding == null) {
                        AbstractC9133u.m16151y("mBinding");
                        viewFragmentBoardBinding = null;
                    }
                    ViewIncludeImageAddBinding viewIncludeImageAddBinding = viewFragmentBoardBinding.f15370d;
                    AppCompatImageView ivImageCamera = viewIncludeImageAddBinding.f15446a;
                    AbstractC9133u.m16132f(ivImageCamera, "ivImageCamera");
                    ivImageCamera.setVisibility(c8218n.m12874c() ? 0 : 8);
                    AppCompatImageView ivImageGallery = viewIncludeImageAddBinding.f15447b;
                    AbstractC9133u.m16132f(ivImageGallery, "ivImageGallery");
                    ivImageGallery.setVisibility(c8218n.m12875d() ? 0 : 8);
                    AppCompatImageView ivText = viewIncludeImageAddBinding.f15450e;
                    AbstractC9133u.m16132f(ivText, "ivText");
                    ivText.setVisibility(c8218n.m12878g() ? 0 : 8);
                    AppCompatImageView ivRectangle = viewIncludeImageAddBinding.f15449d;
                    AbstractC9133u.m16132f(ivRectangle, "ivRectangle");
                    ivRectangle.setVisibility(c8218n.m12877f() ? 0 : 8);
                    AppCompatImageView ivOval = viewIncludeImageAddBinding.f15448c;
                    AbstractC9133u.m16132f(ivOval, "ivOval");
                    ivOval.setVisibility(c8218n.m12877f() ? 0 : 8);
                    ImageView ivTriangle = viewIncludeImageAddBinding.f15451f;
                    AbstractC9133u.m16132f(ivTriangle, "ivTriangle");
                    ivTriangle.setVisibility(c8218n.m12877f() ? 0 : 8);
                    viewIncludeImageAddBinding.f15449d.setSelected(c8218n.m12876e().m12881c());
                    viewIncludeImageAddBinding.f15448c.setSelected(c8218n.m12876e().m12880b());
                    viewIncludeImageAddBinding.f15451f.setSelected(c8218n.m12876e().m12882d());
                    return C8736p.f16368a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass5(BoardFragment boardFragment, InterfaceC9324c interfaceC9324c) {
                super(2, interfaceC9324c);
                this.f14897b = boardFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
                return new AnonymousClass5(this.f14897b, interfaceC9324c);
            }

            @Override // p300x7.InterfaceC10574p
            public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
                return ((AnonymousClass5) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objM17291f = AbstractC9434a.m17291f();
                int i10 = this.f14896a;
                if (i10 == 0) {
                    AbstractC9079b.m15926b(obj);
                    InterfaceC9280q interfaceC9280qM12780P = this.f14897b.m12678m0().m12780P();
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f14897b, null);
                    this.f14896a = 1;
                    if (AbstractC9268e.m17019i(interfaceC9280qM12780P, anonymousClass1, this) == objM17291f) {
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

        @InterfaceC9539d(m17800c = "com.zykj.view.board.board.BoardFragment$initObserver$1$1$6", m17801f = "BoardFragment.kt", m17802l = {573}, m17803m = "invokeSuspend")
        /* renamed from: com.zykj.view.board.board.BoardFragment$initObserver$1$1$6, reason: invalid class name */
        public static final class AnonymousClass6 extends SuspendLambda implements InterfaceC10574p {

            /* renamed from: a */
            public int f14901a;

            /* renamed from: b */
            public final /* synthetic */ BoardFragment f14902b;

            @InterfaceC9539d(m17800c = "com.zykj.view.board.board.BoardFragment$initObserver$1$1$6$1", m17801f = "BoardFragment.kt", m17802l = {}, m17803m = "invokeSuspend")
            /* renamed from: com.zykj.view.board.board.BoardFragment$initObserver$1$1$6$1, reason: invalid class name */
            public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC10574p {

                /* renamed from: a */
                public int f14903a;

                /* renamed from: b */
                public /* synthetic */ Object f14904b;

                /* renamed from: c */
                public final /* synthetic */ BoardFragment f14905c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(BoardFragment boardFragment, InterfaceC9324c interfaceC9324c) {
                    super(2, interfaceC9324c);
                    this.f14905c = boardFragment;
                }

                @Override // p300x7.InterfaceC10574p
                /* renamed from: c, reason: merged with bridge method [inline-methods] */
                public final Object invoke(C8205a c8205a, InterfaceC9324c interfaceC9324c) {
                    return ((AnonymousClass1) create(c8205a, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f14905c, interfaceC9324c);
                    anonymousClass1.f14904b = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) throws Throwable {
                    C8205a c8205a = (C8205a) this.f14904b;
                    AbstractC9434a.m17291f();
                    if (this.f14903a != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC9079b.m15926b(obj);
                    ViewFragmentBoardBinding viewFragmentBoardBinding = this.f14905c.f14834a;
                    if (viewFragmentBoardBinding == null) {
                        AbstractC9133u.m16151y("mBinding");
                        viewFragmentBoardBinding = null;
                    }
                    ViewIncludeBackgroundColorBinding viewIncludeBackgroundColorBinding = viewFragmentBoardBinding.f15367a;
                    RadioButton rbBackgroundLine = viewIncludeBackgroundColorBinding.f15431e;
                    AbstractC9133u.m16132f(rbBackgroundLine, "rbBackgroundLine");
                    rbBackgroundLine.setVisibility(c8205a.m12829c() ? 0 : 8);
                    RadioButton rbBackgroundInterweave = viewIncludeBackgroundColorBinding.f15430d;
                    AbstractC9133u.m16132f(rbBackgroundInterweave, "rbBackgroundInterweave");
                    rbBackgroundInterweave.setVisibility(c8205a.m12829c() ? 0 : 8);
                    RadioGroup rgBackgroundColor = viewIncludeBackgroundColorBinding.f15433g;
                    AbstractC9133u.m16132f(rgBackgroundColor, "rgBackgroundColor");
                    AbstractC0027a.m62a(rgBackgroundColor, c8205a.m12830d().m12835e());
                    return C8736p.f16368a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass6(BoardFragment boardFragment, InterfaceC9324c interfaceC9324c) {
                super(2, interfaceC9324c);
                this.f14902b = boardFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
                return new AnonymousClass6(this.f14902b, interfaceC9324c);
            }

            @Override // p300x7.InterfaceC10574p
            public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
                return ((AnonymousClass6) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objM17291f = AbstractC9434a.m17291f();
                int i10 = this.f14901a;
                if (i10 == 0) {
                    AbstractC9079b.m15926b(obj);
                    InterfaceC9280q interfaceC9280qM12766I = this.f14902b.m12678m0().m12766I();
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f14902b, null);
                    this.f14901a = 1;
                    if (AbstractC9268e.m17019i(interfaceC9280qM12766I, anonymousClass1, this) == objM17291f) {
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

        @InterfaceC9539d(m17800c = "com.zykj.view.board.board.BoardFragment$initObserver$1$1$7", m17801f = "BoardFragment.kt", m17802l = {584}, m17803m = "invokeSuspend")
        /* renamed from: com.zykj.view.board.board.BoardFragment$initObserver$1$1$7, reason: invalid class name */
        public static final class AnonymousClass7 extends SuspendLambda implements InterfaceC10574p {

            /* renamed from: a */
            public int f14906a;

            /* renamed from: b */
            public final /* synthetic */ BoardFragment f14907b;

            @InterfaceC9539d(m17800c = "com.zykj.view.board.board.BoardFragment$initObserver$1$1$7$1", m17801f = "BoardFragment.kt", m17802l = {}, m17803m = "invokeSuspend")
            /* renamed from: com.zykj.view.board.board.BoardFragment$initObserver$1$1$7$1, reason: invalid class name */
            public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC10574p {

                /* renamed from: a */
                public int f14908a;

                /* renamed from: b */
                public /* synthetic */ Object f14909b;

                /* renamed from: c */
                public final /* synthetic */ BoardFragment f14910c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(BoardFragment boardFragment, InterfaceC9324c interfaceC9324c) {
                    super(2, interfaceC9324c);
                    this.f14910c = boardFragment;
                }

                @Override // p300x7.InterfaceC10574p
                /* renamed from: c, reason: merged with bridge method [inline-methods] */
                public final Object invoke(C8217m c8217m, InterfaceC9324c interfaceC9324c) {
                    return ((AnonymousClass1) create(c8217m, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f14910c, interfaceC9324c);
                    anonymousClass1.f14909b = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) throws Throwable {
                    C8217m c8217m = (C8217m) this.f14909b;
                    AbstractC9434a.m17291f();
                    if (this.f14908a != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC9079b.m15926b(obj);
                    ViewFragmentBoardBinding viewFragmentBoardBinding = this.f14910c.f14834a;
                    ViewFragmentBoardBinding viewFragmentBoardBinding2 = null;
                    if (viewFragmentBoardBinding == null) {
                        AbstractC9133u.m16151y("mBinding");
                        viewFragmentBoardBinding = null;
                    }
                    View root = viewFragmentBoardBinding.f15372f.getRoot();
                    AbstractC9133u.m16132f(root, "getRoot(...)");
                    root.setVisibility(c8217m.m12866f().m12898d() ? 0 : 8);
                    ViewFragmentBoardBinding viewFragmentBoardBinding3 = this.f14910c.f14834a;
                    if (viewFragmentBoardBinding3 == null) {
                        AbstractC9133u.m16151y("mBinding");
                        viewFragmentBoardBinding3 = null;
                    }
                    View root2 = viewFragmentBoardBinding3.f15369c.getRoot();
                    AbstractC9133u.m16132f(root2, "getRoot(...)");
                    root2.setVisibility(c8217m.m12866f().m12896b() ? 0 : 8);
                    ViewFragmentBoardBinding viewFragmentBoardBinding4 = this.f14910c.f14834a;
                    if (viewFragmentBoardBinding4 == null) {
                        AbstractC9133u.m16151y("mBinding");
                        viewFragmentBoardBinding4 = null;
                    }
                    View root3 = viewFragmentBoardBinding4.f15370d.getRoot();
                    AbstractC9133u.m16132f(root3, "getRoot(...)");
                    root3.setVisibility(c8217m.m12866f().m12897c() ? 0 : 8);
                    ViewFragmentBoardBinding viewFragmentBoardBinding5 = this.f14910c.f14834a;
                    if (viewFragmentBoardBinding5 == null) {
                        AbstractC9133u.m16151y("mBinding");
                        viewFragmentBoardBinding5 = null;
                    }
                    View root4 = viewFragmentBoardBinding5.f15367a.getRoot();
                    AbstractC9133u.m16132f(root4, "getRoot(...)");
                    root4.setVisibility(c8217m.m12866f().m12895a() ? 0 : 8);
                    ViewFragmentBoardBinding viewFragmentBoardBinding6 = this.f14910c.f14834a;
                    if (viewFragmentBoardBinding6 == null) {
                        AbstractC9133u.m16151y("mBinding");
                        viewFragmentBoardBinding6 = null;
                    }
                    View root5 = viewFragmentBoardBinding6.f15368b.getRoot();
                    AbstractC9133u.m16132f(root5, "getRoot(...)");
                    root5.setVisibility(c8217m.m12863c().m12847a() ? 0 : 8);
                    ViewFragmentBoardBinding viewFragmentBoardBinding7 = this.f14910c.f14834a;
                    if (viewFragmentBoardBinding7 == null) {
                        AbstractC9133u.m16151y("mBinding");
                        viewFragmentBoardBinding7 = null;
                    }
                    View root6 = viewFragmentBoardBinding7.f15373g.getRoot();
                    AbstractC9133u.m16132f(root6, "getRoot(...)");
                    root6.setVisibility(c8217m.m12863c().m12848b() ? 0 : 8);
                    ViewFragmentBoardBinding viewFragmentBoardBinding8 = this.f14910c.f14834a;
                    if (viewFragmentBoardBinding8 == null) {
                        AbstractC9133u.m16151y("mBinding");
                        viewFragmentBoardBinding8 = null;
                    }
                    LinearLayoutCompat llDeleteDraft = viewFragmentBoardBinding8.f15373g.f15502d;
                    AbstractC9133u.m16132f(llDeleteDraft, "llDeleteDraft");
                    llDeleteDraft.setVisibility(c8217m.m12869i() ? 0 : 8);
                    ViewFragmentBoardBinding viewFragmentBoardBinding9 = this.f14910c.f14834a;
                    if (viewFragmentBoardBinding9 == null) {
                        AbstractC9133u.m16151y("mBinding");
                        viewFragmentBoardBinding9 = null;
                    }
                    SketchProgressView sketchProgressView = viewFragmentBoardBinding9.f15378l;
                    sketchProgressView.setTouchable(c8217m.m12871k());
                    sketchProgressView.setProgress(c8217m.m12867g());
                    sketchProgressView.setThumbTime(c8217m.m12868h());
                    ViewFragmentBoardBinding viewFragmentBoardBinding10 = this.f14910c.f14834a;
                    if (viewFragmentBoardBinding10 == null) {
                        AbstractC9133u.m16151y("mBinding");
                    } else {
                        viewFragmentBoardBinding2 = viewFragmentBoardBinding10;
                    }
                    SketchProgressView sketchProgressView2 = viewFragmentBoardBinding2.f15377k;
                    sketchProgressView2.setTouchable(c8217m.m12870j());
                    sketchProgressView2.setProgress(c8217m.m12864d());
                    sketchProgressView2.setThumbTime(c8217m.m12865e());
                    return C8736p.f16368a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass7(BoardFragment boardFragment, InterfaceC9324c interfaceC9324c) {
                super(2, interfaceC9324c);
                this.f14907b = boardFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
                return new AnonymousClass7(this.f14907b, interfaceC9324c);
            }

            @Override // p300x7.InterfaceC10574p
            public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
                return ((AnonymousClass7) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objM17291f = AbstractC9434a.m17291f();
                int i10 = this.f14906a;
                if (i10 == 0) {
                    AbstractC9079b.m15926b(obj);
                    InterfaceC9280q interfaceC9280qM12778O = this.f14907b.m12678m0().m12778O();
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f14907b, null);
                    this.f14906a = 1;
                    if (AbstractC9268e.m17019i(interfaceC9280qM12778O, anonymousClass1, this) == objM17291f) {
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

        @InterfaceC9539d(m17800c = "com.zykj.view.board.board.BoardFragment$initObserver$1$1$8", m17801f = "BoardFragment.kt", m17802l = {TypedValues.MotionType.TYPE_QUANTIZE_INTERPOLATOR_ID}, m17803m = "invokeSuspend")
        /* renamed from: com.zykj.view.board.board.BoardFragment$initObserver$1$1$8, reason: invalid class name */
        public static final class AnonymousClass8 extends SuspendLambda implements InterfaceC10574p {

            /* renamed from: a */
            public int f14911a;

            /* renamed from: b */
            public final /* synthetic */ BoardFragment f14912b;

            @InterfaceC9539d(m17800c = "com.zykj.view.board.board.BoardFragment$initObserver$1$1$8$1", m17801f = "BoardFragment.kt", m17802l = {}, m17803m = "invokeSuspend")
            /* renamed from: com.zykj.view.board.board.BoardFragment$initObserver$1$1$8$1, reason: invalid class name */
            public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC10574p {

                /* renamed from: a */
                public int f14913a;

                /* renamed from: b */
                public /* synthetic */ Object f14914b;

                /* renamed from: c */
                public final /* synthetic */ BoardFragment f14915c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(BoardFragment boardFragment, InterfaceC9324c interfaceC9324c) {
                    super(2, interfaceC9324c);
                    this.f14915c = boardFragment;
                }

                @Override // p300x7.InterfaceC10574p
                /* renamed from: c, reason: merged with bridge method [inline-methods] */
                public final Object invoke(C8215k c8215k, InterfaceC9324c interfaceC9324c) {
                    return ((AnonymousClass1) create(c8215k, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f14915c, interfaceC9324c);
                    anonymousClass1.f14914b = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) throws Throwable {
                    C8215k c8215k = (C8215k) this.f14914b;
                    AbstractC9434a.m17291f();
                    if (this.f14913a != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC9079b.m15926b(obj);
                    ViewFragmentBoardBinding viewFragmentBoardBinding = this.f14915c.f14834a;
                    if (viewFragmentBoardBinding == null) {
                        AbstractC9133u.m16151y("mBinding");
                        viewFragmentBoardBinding = null;
                    }
                    viewFragmentBoardBinding.f15375i.setImageResource(c8215k.m12859b().m12860a());
                    return C8736p.f16368a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass8(BoardFragment boardFragment, InterfaceC9324c interfaceC9324c) {
                super(2, interfaceC9324c);
                this.f14912b = boardFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
                return new AnonymousClass8(this.f14912b, interfaceC9324c);
            }

            @Override // p300x7.InterfaceC10574p
            public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
                return ((AnonymousClass8) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objM17291f = AbstractC9434a.m17291f();
                int i10 = this.f14911a;
                if (i10 == 0) {
                    AbstractC9079b.m15926b(obj);
                    InterfaceC9280q interfaceC9280qM12776N = this.f14912b.m12678m0().m12776N();
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f14912b, null);
                    this.f14911a = 1;
                    if (AbstractC9268e.m17019i(interfaceC9280qM12776N, anonymousClass1, this) == objM17291f) {
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

        @InterfaceC9539d(m17800c = "com.zykj.view.board.board.BoardFragment$initObserver$1$1$9", m17801f = "BoardFragment.kt", m17802l = {619}, m17803m = "invokeSuspend")
        /* renamed from: com.zykj.view.board.board.BoardFragment$initObserver$1$1$9, reason: invalid class name */
        public static final class AnonymousClass9 extends SuspendLambda implements InterfaceC10574p {

            /* renamed from: a */
            public int f14916a;

            /* renamed from: b */
            public final /* synthetic */ BoardFragment f14917b;

            @InterfaceC9539d(m17800c = "com.zykj.view.board.board.BoardFragment$initObserver$1$1$9$1", m17801f = "BoardFragment.kt", m17802l = {}, m17803m = "invokeSuspend")
            /* renamed from: com.zykj.view.board.board.BoardFragment$initObserver$1$1$9$1, reason: invalid class name */
            public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC10574p {

                /* renamed from: a */
                public int f14918a;

                /* renamed from: b */
                public /* synthetic */ Object f14919b;

                /* renamed from: c */
                public final /* synthetic */ BoardFragment f14920c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(BoardFragment boardFragment, InterfaceC9324c interfaceC9324c) {
                    super(2, interfaceC9324c);
                    this.f14920c = boardFragment;
                }

                @Override // p300x7.InterfaceC10574p
                /* renamed from: c, reason: merged with bridge method [inline-methods] */
                public final Object invoke(C8226v c8226v, InterfaceC9324c interfaceC9324c) {
                    return ((AnonymousClass1) create(c8226v, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f14920c, interfaceC9324c);
                    anonymousClass1.f14919b = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) throws Throwable {
                    C8226v c8226v = (C8226v) this.f14919b;
                    AbstractC9434a.m17291f();
                    if (this.f14918a != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC9079b.m15926b(obj);
                    ViewFragmentBoardBinding viewFragmentBoardBinding = this.f14920c.f14834a;
                    if (viewFragmentBoardBinding == null) {
                        AbstractC9133u.m16151y("mBinding");
                        viewFragmentBoardBinding = null;
                    }
                    ViewItemSketchRecordAudioBinding viewItemSketchRecordAudioBinding = viewFragmentBoardBinding.f15373g;
                    viewItemSketchRecordAudioBinding.f15500b.setImageResource(c8226v.m12916d().m12918a());
                    viewItemSketchRecordAudioBinding.f15499a.setSelected(c8226v.m12917e());
                    viewItemSketchRecordAudioBinding.f15507i.setText(c8226v.m12915c());
                    LinearLayoutCompat llCrop = viewItemSketchRecordAudioBinding.f15501c;
                    AbstractC9133u.m16132f(llCrop, "llCrop");
                    llCrop.setVisibility(c8226v.m12916d().m12919b() ? 0 : 8);
                    LinearLayoutCompat llOption = viewItemSketchRecordAudioBinding.f15503e;
                    AbstractC9133u.m16132f(llOption, "llOption");
                    llOption.setVisibility(c8226v.m12916d().m12920c() ? 0 : 8);
                    LinearLayoutCompat llRecord = viewItemSketchRecordAudioBinding.f15505g;
                    AbstractC9133u.m16132f(llRecord, "llRecord");
                    llRecord.setVisibility(c8226v.m12916d().m12921d() ? 0 : 8);
                    return C8736p.f16368a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass9(BoardFragment boardFragment, InterfaceC9324c interfaceC9324c) {
                super(2, interfaceC9324c);
                this.f14917b = boardFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
                return new AnonymousClass9(this.f14917b, interfaceC9324c);
            }

            @Override // p300x7.InterfaceC10574p
            public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
                return ((AnonymousClass9) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objM17291f = AbstractC9434a.m17291f();
                int i10 = this.f14916a;
                if (i10 == 0) {
                    AbstractC9079b.m15926b(obj);
                    InterfaceC9280q interfaceC9280qM12790U = this.f14917b.m12678m0().m12790U();
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f14917b, null);
                    this.f14916a = 1;
                    if (AbstractC9268e.m17019i(interfaceC9280qM12790U, anonymousClass1, this) == objM17291f) {
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
        public C82001(BoardFragment boardFragment, InterfaceC9324c interfaceC9324c) {
            super(2, interfaceC9324c);
            this.f14875c = boardFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
            C82001 c82001 = new C82001(this.f14875c, interfaceC9324c);
            c82001.f14874b = obj;
            return c82001;
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
            return ((C82001) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            InterfaceC8822b0 interfaceC8822b0 = (InterfaceC8822b0) this.f14874b;
            AbstractC9434a.m17291f();
            if (this.f14873a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9079b.m15926b(obj);
            AbstractC8839h.m14861d(interfaceC8822b0, null, null, new AnonymousClass1(this.f14875c, null), 3, null);
            AbstractC8839h.m14861d(interfaceC8822b0, null, null, new AnonymousClass2(this.f14875c, null), 3, null);
            AbstractC8839h.m14861d(interfaceC8822b0, null, null, new AnonymousClass3(this.f14875c, null), 3, null);
            AbstractC8839h.m14861d(interfaceC8822b0, null, null, new AnonymousClass4(this.f14875c, null), 3, null);
            AbstractC8839h.m14861d(interfaceC8822b0, null, null, new AnonymousClass5(this.f14875c, null), 3, null);
            AbstractC8839h.m14861d(interfaceC8822b0, null, null, new AnonymousClass6(this.f14875c, null), 3, null);
            AbstractC8839h.m14861d(interfaceC8822b0, null, null, new AnonymousClass7(this.f14875c, null), 3, null);
            AbstractC8839h.m14861d(interfaceC8822b0, null, null, new AnonymousClass8(this.f14875c, null), 3, null);
            AbstractC8839h.m14861d(interfaceC8822b0, null, null, new AnonymousClass9(this.f14875c, null), 3, null);
            return C8736p.f16368a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BoardFragment$initObserver$1(BoardFragment boardFragment, InterfaceC9324c interfaceC9324c) {
        super(2, interfaceC9324c);
        this.f14872b = boardFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c create(Object obj, InterfaceC9324c interfaceC9324c) {
        return new BoardFragment$initObserver$1(this.f14872b, interfaceC9324c);
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c interfaceC9324c) {
        return ((BoardFragment$initObserver$1) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM17291f = AbstractC9434a.m17291f();
        int i10 = this.f14871a;
        if (i10 == 0) {
            AbstractC9079b.m15926b(obj);
            LifecycleOwner viewLifecycleOwner = this.f14872b.getViewLifecycleOwner();
            AbstractC9133u.m16132f(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            Lifecycle.State state = Lifecycle.State.RESUMED;
            C82001 c82001 = new C82001(this.f14872b, null);
            this.f14871a = 1;
            if (RepeatOnLifecycleKt.repeatOnLifecycle(viewLifecycleOwner, state, c82001, this) == objM17291f) {
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
