package com.zykj.view.board.simple;

import android.widget.RadioGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.NotificationCompat;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.RepeatOnLifecycleKt;
import com.zykj.view.board.simple.AbstractC7713b;
import com.zykj.view.databinding.ViewFragmentSimpleBinding;
import com.zykj.view.databinding.ViewIncludeMenuBinding;
import com.zykj.view.databinding.ViewIncludePenBinding;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.StateFlow;
import p181m7.AbstractC9026c;

@Metadata(m13412d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13413d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13414k = 3, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(m13450c = "com.zykj.view.board.simple.SimpleFragment$initObserver$1", m13451f = "SimpleFragment.kt", m13452i = {}, m13453l = {216}, m13454m = "invokeSuspend", m13455n = {}, m13456s = {})
/* loaded from: classes5.dex */
public final class SimpleFragment$initObserver$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public int f12463a;

    /* renamed from: b */
    public final /* synthetic */ SimpleFragment f12464b;

    @Metadata(m13412d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13413d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13414k = 3, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(m13450c = "com.zykj.view.board.simple.SimpleFragment$initObserver$1$1", m13451f = "SimpleFragment.kt", m13452i = {}, m13453l = {}, m13454m = "invokeSuspend", m13455n = {}, m13456s = {})
    /* renamed from: com.zykj.view.board.simple.SimpleFragment$initObserver$1$1 */
    public static final class C77111 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a */
        public int f12465a;

        /* renamed from: b */
        public /* synthetic */ Object f12466b;

        /* renamed from: c */
        public final /* synthetic */ SimpleFragment f12467c;

        @Metadata(m13412d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13413d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13414k = 3, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
        @DebugMetadata(m13450c = "com.zykj.view.board.simple.SimpleFragment$initObserver$1$1$1", m13451f = "SimpleFragment.kt", m13452i = {}, m13453l = {218}, m13454m = "invokeSuspend", m13455n = {}, m13456s = {})
        /* renamed from: com.zykj.view.board.simple.SimpleFragment$initObserver$1$1$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* renamed from: a */
            public int f12468a;

            /* renamed from: b */
            public final /* synthetic */ SimpleFragment f12469b;

            @Metadata(m13412d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m13413d2 = {"Lcom/zykj/view/board/simple/b;", NotificationCompat.CATEGORY_EVENT, "", "<anonymous>", "(Lcom/zykj/view/board/simple/b;)V"}, m13414k = 3, m13415mv = {2, 2, 0})
            @DebugMetadata(m13450c = "com.zykj.view.board.simple.SimpleFragment$initObserver$1$1$1$1", m13451f = "SimpleFragment.kt", m13452i = {}, m13453l = {}, m13454m = "invokeSuspend", m13455n = {}, m13456s = {})
            /* renamed from: com.zykj.view.board.simple.SimpleFragment$initObserver$1$1$1$1, reason: invalid class name and collision with other inner class name */
            public static final class C100681 extends SuspendLambda implements Function2<AbstractC7713b, Continuation<? super Unit>, Object> {

                /* renamed from: a */
                public int f12470a;

                /* renamed from: b */
                public /* synthetic */ Object f12471b;

                /* renamed from: c */
                public final /* synthetic */ SimpleFragment f12472c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C100681(SimpleFragment simpleFragment, Continuation continuation) {
                    super(2, continuation);
                    this.f12472c = simpleFragment;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(AbstractC7713b abstractC7713b, Continuation continuation) {
                    return ((C100681) create(abstractC7713b, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation create(Object obj, Continuation continuation) {
                    C100681 c100681 = new C100681(this.f12472c, continuation);
                    c100681.f12471b = obj;
                    return c100681;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    AbstractC7713b abstractC7713b = (AbstractC7713b) this.f12471b;
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.f12470a != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    if (abstractC7713b instanceof AbstractC7713b.b) {
                        this.f12472c.m11806R(((AbstractC7713b.b) abstractC7713b).m11853a());
                    } else if (abstractC7713b instanceof AbstractC7713b.d) {
                        this.f12472c.m11829v().m12964i(((AbstractC7713b.d) abstractC7713b).m11855a());
                    } else if (abstractC7713b instanceof AbstractC7713b.f) {
                        AbstractC7713b.f fVar = (AbstractC7713b.f) abstractC7713b;
                        this.f12472c.m11830w().setActonMode(fVar.m11857a());
                        this.f12472c.m11829v().m12967l(fVar.m11858b());
                    } else if (abstractC7713b instanceof AbstractC7713b.g) {
                        this.f12472c.m11829v().m12968m(((AbstractC7713b.g) abstractC7713b).m11859a());
                    } else if (abstractC7713b instanceof AbstractC7713b.e) {
                        this.f12472c.m11829v().m12966k(((AbstractC7713b.e) abstractC7713b).m11856a());
                    } else if (abstractC7713b instanceof AbstractC7713b.c) {
                        this.f12472c.m11829v().m12965j(((AbstractC7713b.c) abstractC7713b).m11854a());
                    } else {
                        if (!(abstractC7713b instanceof AbstractC7713b.a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        this.f12472c.m11830w().m11928d();
                    }
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(SimpleFragment simpleFragment, Continuation continuation) {
                super(2, continuation);
                this.f12469b = simpleFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new AnonymousClass1(this.f12469b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return invoke2(coroutineScope, (Continuation) continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i9 = this.f12468a;
                if (i9 == 0) {
                    ResultKt.throwOnFailure(obj);
                    SharedFlow sharedFlow = this.f12469b.m11828u().getAndroidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String();
                    C100681 c100681 = new C100681(this.f12469b, null);
                    this.f12468a = 1;
                    if (FlowKt.collectLatest(sharedFlow, c100681, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i9 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        @Metadata(m13412d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13413d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13414k = 3, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
        @DebugMetadata(m13450c = "com.zykj.view.board.simple.SimpleFragment$initObserver$1$1$2", m13451f = "SimpleFragment.kt", m13452i = {}, m13453l = {247}, m13454m = "invokeSuspend", m13455n = {}, m13456s = {})
        /* renamed from: com.zykj.view.board.simple.SimpleFragment$initObserver$1$1$2, reason: invalid class name */
        public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* renamed from: a */
            public int f12473a;

            /* renamed from: b */
            public final /* synthetic */ SimpleFragment f12474b;

            @Metadata(m13412d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m13413d2 = {"Lcom/zykj/view/board/simple/e;", "state", "", "<anonymous>", "(Lcom/zykj/view/board/simple/e;)V"}, m13414k = 3, m13415mv = {2, 2, 0})
            @DebugMetadata(m13450c = "com.zykj.view.board.simple.SimpleFragment$initObserver$1$1$2$1", m13451f = "SimpleFragment.kt", m13452i = {}, m13453l = {}, m13454m = "invokeSuspend", m13455n = {}, m13456s = {})
            /* renamed from: com.zykj.view.board.simple.SimpleFragment$initObserver$1$1$2$1, reason: invalid class name */
            public static final class AnonymousClass1 extends SuspendLambda implements Function2<C7716e, Continuation<? super Unit>, Object> {

                /* renamed from: a */
                public int f12475a;

                /* renamed from: b */
                public /* synthetic */ Object f12476b;

                /* renamed from: c */
                public final /* synthetic */ SimpleFragment f12477c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(SimpleFragment simpleFragment, Continuation continuation) {
                    super(2, continuation);
                    this.f12477c = simpleFragment;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(C7716e c7716e, Continuation continuation) {
                    return ((AnonymousClass1) create(c7716e, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation create(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f12477c, continuation);
                    anonymousClass1.f12476b = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    C7716e c7716e = (C7716e) this.f12476b;
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.f12475a != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    ViewFragmentSimpleBinding viewFragmentSimpleBinding = this.f12477c.mBinding;
                    ViewFragmentSimpleBinding viewFragmentSimpleBinding2 = null;
                    if (viewFragmentSimpleBinding == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                        viewFragmentSimpleBinding = null;
                    }
                    ViewIncludeMenuBinding viewIncludeMenuBinding = viewFragmentSimpleBinding.f12657e;
                    viewIncludeMenuBinding.f12743j.setSelected(c7716e.m11874j());
                    viewIncludeMenuBinding.f12742i.setSelected(c7716e.m11869e().m11445d());
                    viewIncludeMenuBinding.f12739f.setSelected(c7716e.m11869e().m11444c());
                    viewIncludeMenuBinding.f12737d.setSelected(c7716e.m11869e().m11442a());
                    ViewFragmentSimpleBinding viewFragmentSimpleBinding3 = this.f12477c.mBinding;
                    if (viewFragmentSimpleBinding3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                        viewFragmentSimpleBinding3 = null;
                    }
                    ViewIncludePenBinding viewIncludePenBinding = viewFragmentSimpleBinding3.f12658f;
                    RadioGroup rgPenType = viewIncludePenBinding.f12760l;
                    Intrinsics.checkNotNullExpressionValue(rgPenType, "rgPenType");
                    AbstractC9026c.m14388a(rgPenType, c7716e.m11873i().m11863b());
                    RadioGroup rgPenSize = viewIncludePenBinding.f12759k;
                    Intrinsics.checkNotNullExpressionValue(rgPenSize, "rgPenSize");
                    AbstractC9026c.m14388a(rgPenSize, c7716e.m11872h().m11860a());
                    RadioGroup rgPenColor = viewIncludePenBinding.f12758j;
                    Intrinsics.checkNotNullExpressionValue(rgPenColor, "rgPenColor");
                    AbstractC9026c.m14388a(rgPenColor, c7716e.m11871g().m11452b());
                    ViewFragmentSimpleBinding viewFragmentSimpleBinding4 = this.f12477c.mBinding;
                    if (viewFragmentSimpleBinding4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                        viewFragmentSimpleBinding4 = null;
                    }
                    RadioGroup rgEraserSize = viewFragmentSimpleBinding4.f12655c.f12703d;
                    Intrinsics.checkNotNullExpressionValue(rgEraserSize, "rgEraserSize");
                    AbstractC9026c.m14388a(rgEraserSize, c7716e.m11867c().m11407a());
                    ViewFragmentSimpleBinding viewFragmentSimpleBinding5 = this.f12477c.mBinding;
                    if (viewFragmentSimpleBinding5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    } else {
                        viewFragmentSimpleBinding2 = viewFragmentSimpleBinding5;
                    }
                    viewFragmentSimpleBinding2.f12661i.setImageResource(c7716e.m11868d().m11411a());
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(SimpleFragment simpleFragment, Continuation continuation) {
                super(2, continuation);
                this.f12474b = simpleFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new AnonymousClass2(this.f12474b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return invoke2(coroutineScope, (Continuation) continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i9 = this.f12473a;
                if (i9 == 0) {
                    ResultKt.throwOnFailure(obj);
                    StateFlow uiState = this.f12474b.m11828u().getUiState();
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f12474b, null);
                    this.f12473a = 1;
                    if (FlowKt.collectLatest(uiState, anonymousClass1, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i9 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
                return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C77111(SimpleFragment simpleFragment, Continuation continuation) {
            super(2, continuation);
            this.f12467c = simpleFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C77111 c77111 = new C77111(this.f12467c, continuation);
            c77111.f12466b = obj;
            return c77111;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return invoke2(coroutineScope, (Continuation) continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineScope coroutineScope = (CoroutineScope) this.f12466b;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f12465a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(this.f12467c, null), 3, null);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass2(this.f12467c, null), 3, null);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C77111) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SimpleFragment$initObserver$1(SimpleFragment simpleFragment, Continuation continuation) {
        super(2, continuation);
        this.f12464b = simpleFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SimpleFragment$initObserver$1(this.f12464b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return invoke2(coroutineScope, (Continuation) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i9 = this.f12463a;
        if (i9 == 0) {
            ResultKt.throwOnFailure(obj);
            LifecycleOwner viewLifecycleOwner = this.f12464b.getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            Lifecycle.State state = Lifecycle.State.RESUMED;
            C77111 c77111 = new C77111(this.f12464b, null);
            this.f12463a = 1;
            if (RepeatOnLifecycleKt.repeatOnLifecycle(viewLifecycleOwner, state, c77111, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i9 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
        return ((SimpleFragment$initObserver$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
