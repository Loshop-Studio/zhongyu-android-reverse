package com.zykj.view.board.simple;

import android.widget.RadioGroup;
import androidx.core.app.NotificationCompat;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.RepeatOnLifecycleKt;
import com.zykj.view.board.simple.AbstractC7261b;
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
import p027b8.AbstractC5046c;

@Metadata(m13557d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13558d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13559k = 3, m13560mv = {2, 2, 0}, m13562xi = 48)
@DebugMetadata(m13595c = "com.zykj.view.board.simple.SimpleFragment$initObserver$1", m13596f = "SimpleFragment.kt", m13597i = {}, m13598l = {212}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
/* loaded from: classes5.dex */
public final class SimpleFragment$initObserver$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public int f11228a;

    /* renamed from: b */
    public final /* synthetic */ SimpleFragment f11229b;

    @Metadata(m13557d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13558d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13559k = 3, m13560mv = {2, 2, 0}, m13562xi = 48)
    @DebugMetadata(m13595c = "com.zykj.view.board.simple.SimpleFragment$initObserver$1$1", m13596f = "SimpleFragment.kt", m13597i = {}, m13598l = {}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
    /* renamed from: com.zykj.view.board.simple.SimpleFragment$initObserver$1$1 */
    public static final class C72591 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a */
        public int f11230a;

        /* renamed from: b */
        public /* synthetic */ Object f11231b;

        /* renamed from: c */
        public final /* synthetic */ SimpleFragment f11232c;

        @Metadata(m13557d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13558d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13559k = 3, m13560mv = {2, 2, 0}, m13562xi = 48)
        @DebugMetadata(m13595c = "com.zykj.view.board.simple.SimpleFragment$initObserver$1$1$1", m13596f = "SimpleFragment.kt", m13597i = {}, m13598l = {214}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
        /* renamed from: com.zykj.view.board.simple.SimpleFragment$initObserver$1$1$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* renamed from: a */
            public int f11233a;

            /* renamed from: b */
            public final /* synthetic */ SimpleFragment f11234b;

            @Metadata(m13557d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m13558d2 = {"Lcom/zykj/view/board/simple/b;", NotificationCompat.CATEGORY_EVENT, "", "<anonymous>", "(Lcom/zykj/view/board/simple/b;)V"}, m13559k = 3, m13560mv = {2, 2, 0})
            @DebugMetadata(m13595c = "com.zykj.view.board.simple.SimpleFragment$initObserver$1$1$1$1", m13596f = "SimpleFragment.kt", m13597i = {}, m13598l = {}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
            /* renamed from: com.zykj.view.board.simple.SimpleFragment$initObserver$1$1$1$1, reason: invalid class name and collision with other inner class name */
            public static final class C101431 extends SuspendLambda implements Function2<AbstractC7261b, Continuation<? super Unit>, Object> {

                /* renamed from: a */
                public int f11235a;

                /* renamed from: b */
                public /* synthetic */ Object f11236b;

                /* renamed from: c */
                public final /* synthetic */ SimpleFragment f11237c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C101431(SimpleFragment simpleFragment, Continuation continuation) {
                    super(2, continuation);
                    this.f11237c = simpleFragment;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(AbstractC7261b abstractC7261b, Continuation continuation) {
                    return ((C101431) create(abstractC7261b, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation create(Object obj, Continuation continuation) {
                    C101431 c101431 = new C101431(this.f11237c, continuation);
                    c101431.f11236b = obj;
                    return c101431;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    AbstractC7261b abstractC7261b = (AbstractC7261b) this.f11236b;
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.f11235a != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    if (abstractC7261b instanceof AbstractC7261b.b) {
                        this.f11237c.m11318P(((AbstractC7261b.b) abstractC7261b).m11364a());
                    } else if (abstractC7261b instanceof AbstractC7261b.d) {
                        this.f11237c.m11341u().m16441j(((AbstractC7261b.d) abstractC7261b).m11366a());
                    } else if (abstractC7261b instanceof AbstractC7261b.f) {
                        AbstractC7261b.f fVar = (AbstractC7261b.f) abstractC7261b;
                        this.f11237c.m11342v().setActonMode(fVar.m11368a());
                        this.f11237c.m11341u().m16444m(fVar.m11369b());
                    } else if (abstractC7261b instanceof AbstractC7261b.g) {
                        this.f11237c.m11341u().m16445n(((AbstractC7261b.g) abstractC7261b).m11370a());
                    } else if (abstractC7261b instanceof AbstractC7261b.e) {
                        this.f11237c.m11341u().m16443l(((AbstractC7261b.e) abstractC7261b).m11367a());
                    } else if (abstractC7261b instanceof AbstractC7261b.c) {
                        this.f11237c.m11341u().m16442k(((AbstractC7261b.c) abstractC7261b).m11365a());
                    } else {
                        if (!(abstractC7261b instanceof AbstractC7261b.a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        this.f11237c.m11342v().m11428e();
                    }
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(SimpleFragment simpleFragment, Continuation continuation) {
                super(2, continuation);
                this.f11234b = simpleFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new AnonymousClass1(this.f11234b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return invoke2(coroutineScope, (Continuation) continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i10 = this.f11233a;
                if (i10 == 0) {
                    ResultKt.throwOnFailure(obj);
                    SharedFlow sharedFlow = this.f11234b.m11340t().getAndroidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String();
                    C101431 c101431 = new C101431(this.f11234b, null);
                    this.f11233a = 1;
                    if (FlowKt.collectLatest(sharedFlow, c101431, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i10 != 1) {
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

        @Metadata(m13557d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13558d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13559k = 3, m13560mv = {2, 2, 0}, m13562xi = 48)
        @DebugMetadata(m13595c = "com.zykj.view.board.simple.SimpleFragment$initObserver$1$1$2", m13596f = "SimpleFragment.kt", m13597i = {}, m13598l = {243}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
        /* renamed from: com.zykj.view.board.simple.SimpleFragment$initObserver$1$1$2, reason: invalid class name */
        public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* renamed from: a */
            public int f11238a;

            /* renamed from: b */
            public final /* synthetic */ SimpleFragment f11239b;

            @Metadata(m13557d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m13558d2 = {"Lcom/zykj/view/board/simple/e;", "state", "", "<anonymous>", "(Lcom/zykj/view/board/simple/e;)V"}, m13559k = 3, m13560mv = {2, 2, 0})
            @DebugMetadata(m13595c = "com.zykj.view.board.simple.SimpleFragment$initObserver$1$1$2$1", m13596f = "SimpleFragment.kt", m13597i = {}, m13598l = {}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
            /* renamed from: com.zykj.view.board.simple.SimpleFragment$initObserver$1$1$2$1, reason: invalid class name */
            public static final class AnonymousClass1 extends SuspendLambda implements Function2<C7264e, Continuation<? super Unit>, Object> {

                /* renamed from: a */
                public int f11240a;

                /* renamed from: b */
                public /* synthetic */ Object f11241b;

                /* renamed from: c */
                public final /* synthetic */ SimpleFragment f11242c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(SimpleFragment simpleFragment, Continuation continuation) {
                    super(2, continuation);
                    this.f11242c = simpleFragment;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(C7264e c7264e, Continuation continuation) {
                    return ((AnonymousClass1) create(c7264e, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation create(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f11242c, continuation);
                    anonymousClass1.f11241b = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    C7264e c7264e = (C7264e) this.f11241b;
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.f11240a != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    ViewFragmentSimpleBinding viewFragmentSimpleBinding = this.f11242c.mBinding;
                    ViewFragmentSimpleBinding viewFragmentSimpleBinding2 = null;
                    if (viewFragmentSimpleBinding == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                        viewFragmentSimpleBinding = null;
                    }
                    ViewIncludeMenuBinding viewIncludeMenuBinding = viewFragmentSimpleBinding.f11413e;
                    viewIncludeMenuBinding.f11499j.setSelected(c7264e.m11385j());
                    viewIncludeMenuBinding.f11498i.setSelected(c7264e.m11380e().m11015d());
                    viewIncludeMenuBinding.f11495f.setSelected(c7264e.m11380e().m11014c());
                    viewIncludeMenuBinding.f11493d.setSelected(c7264e.m11380e().m11012a());
                    ViewFragmentSimpleBinding viewFragmentSimpleBinding3 = this.f11242c.mBinding;
                    if (viewFragmentSimpleBinding3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                        viewFragmentSimpleBinding3 = null;
                    }
                    ViewIncludePenBinding viewIncludePenBinding = viewFragmentSimpleBinding3.f11414f;
                    RadioGroup rgPenType = viewIncludePenBinding.f11516l;
                    Intrinsics.checkNotNullExpressionValue(rgPenType, "rgPenType");
                    AbstractC5046c.m2525a(rgPenType, c7264e.m11384i().m11374b());
                    RadioGroup rgPenSize = viewIncludePenBinding.f11515k;
                    Intrinsics.checkNotNullExpressionValue(rgPenSize, "rgPenSize");
                    AbstractC5046c.m2525a(rgPenSize, c7264e.m11383h().m11371a());
                    RadioGroup rgPenColor = viewIncludePenBinding.f11514j;
                    Intrinsics.checkNotNullExpressionValue(rgPenColor, "rgPenColor");
                    AbstractC5046c.m2525a(rgPenColor, c7264e.m11382g().m11022b());
                    ViewFragmentSimpleBinding viewFragmentSimpleBinding4 = this.f11242c.mBinding;
                    if (viewFragmentSimpleBinding4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                        viewFragmentSimpleBinding4 = null;
                    }
                    RadioGroup rgEraserSize = viewFragmentSimpleBinding4.f11411c.f11459d;
                    Intrinsics.checkNotNullExpressionValue(rgEraserSize, "rgEraserSize");
                    AbstractC5046c.m2525a(rgEraserSize, c7264e.m11378c().m10977a());
                    ViewFragmentSimpleBinding viewFragmentSimpleBinding5 = this.f11242c.mBinding;
                    if (viewFragmentSimpleBinding5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    } else {
                        viewFragmentSimpleBinding2 = viewFragmentSimpleBinding5;
                    }
                    viewFragmentSimpleBinding2.f11417i.setImageResource(c7264e.m11379d().m10981a());
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(SimpleFragment simpleFragment, Continuation continuation) {
                super(2, continuation);
                this.f11239b = simpleFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new AnonymousClass2(this.f11239b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return invoke2(coroutineScope, (Continuation) continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i10 = this.f11238a;
                if (i10 == 0) {
                    ResultKt.throwOnFailure(obj);
                    StateFlow uiState = this.f11239b.m11340t().getUiState();
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f11239b, null);
                    this.f11238a = 1;
                    if (FlowKt.collectLatest(uiState, anonymousClass1, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i10 != 1) {
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
        public C72591(SimpleFragment simpleFragment, Continuation continuation) {
            super(2, continuation);
            this.f11232c = simpleFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C72591 c72591 = new C72591(this.f11232c, continuation);
            c72591.f11231b = obj;
            return c72591;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return invoke2(coroutineScope, (Continuation) continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineScope coroutineScope = (CoroutineScope) this.f11231b;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f11230a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(this.f11232c, null), 3, null);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass2(this.f11232c, null), 3, null);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C72591) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SimpleFragment$initObserver$1(SimpleFragment simpleFragment, Continuation continuation) {
        super(2, continuation);
        this.f11229b = simpleFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SimpleFragment$initObserver$1(this.f11229b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return invoke2(coroutineScope, (Continuation) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i10 = this.f11228a;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            LifecycleOwner viewLifecycleOwner = this.f11229b.getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            Lifecycle.State state = Lifecycle.State.RESUMED;
            C72591 c72591 = new C72591(this.f11229b, null);
            this.f11228a = 1;
            if (RepeatOnLifecycleKt.repeatOnLifecycle(viewLifecycleOwner, state, c72591, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i10 != 1) {
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
