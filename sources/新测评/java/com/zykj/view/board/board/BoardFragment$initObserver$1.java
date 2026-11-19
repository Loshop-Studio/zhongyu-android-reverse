package com.zykj.view.board.board;

import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.app.NotificationCompat;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.RepeatOnLifecycleKt;
import com.zykj.view.board.board.AbstractC7216c;
import com.zykj.view.databinding.ViewFragmentBoardBinding;
import com.zykj.view.databinding.ViewIncludeBackgroundColorBinding;
import com.zykj.view.databinding.ViewIncludeImageAddBinding;
import com.zykj.view.databinding.ViewIncludeMenuBinding;
import com.zykj.view.databinding.ViewIncludePenBinding;
import com.zykj.view.databinding.ViewIncludeSelectTypeBinding;
import com.zykj.view.databinding.ViewItemSketchRecordAudioBinding;
import com.zykj.view.widget.SketchProgressView;
import com.zykj.view.widget.customColor.CustomColorFrameLayout;
import com.zykj.view.widget.radio.WithSelectedRadioButton;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.StateFlow;
import p027b8.AbstractC5046c;
import p213q7.C8910c2;

@Metadata(m13557d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13558d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13559k = 3, m13560mv = {2, 2, 0}, m13562xi = 48)
@DebugMetadata(m13595c = "com.zykj.view.board.board.BoardFragment$initObserver$1", m13596f = "BoardFragment.kt", m13597i = {}, m13598l = {597}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
/* loaded from: classes5.dex */
public final class BoardFragment$initObserver$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public int f10884a;

    /* renamed from: b */
    public final /* synthetic */ BoardFragment f10885b;

    @Metadata(m13557d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13558d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13559k = 3, m13560mv = {2, 2, 0}, m13562xi = 48)
    @DebugMetadata(m13595c = "com.zykj.view.board.board.BoardFragment$initObserver$1$1", m13596f = "BoardFragment.kt", m13597i = {}, m13598l = {}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
    /* renamed from: com.zykj.view.board.board.BoardFragment$initObserver$1$1 */
    public static final class C72101 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a */
        public int f10886a;

        /* renamed from: b */
        public /* synthetic */ Object f10887b;

        /* renamed from: c */
        public final /* synthetic */ BoardFragment f10888c;

        @Metadata(m13557d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13558d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13559k = 3, m13560mv = {2, 2, 0}, m13562xi = 48)
        @DebugMetadata(m13595c = "com.zykj.view.board.board.BoardFragment$initObserver$1$1$1", m13596f = "BoardFragment.kt", m13597i = {}, m13598l = {600}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
        /* renamed from: com.zykj.view.board.board.BoardFragment$initObserver$1$1$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* renamed from: a */
            public int f10889a;

            /* renamed from: b */
            public final /* synthetic */ BoardFragment f10890b;

            @Metadata(m13557d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m13558d2 = {"Lcom/zykj/view/board/board/c;", NotificationCompat.CATEGORY_EVENT, "", "<anonymous>", "(Lcom/zykj/view/board/board/c;)V"}, m13559k = 3, m13560mv = {2, 2, 0})
            @DebugMetadata(m13595c = "com.zykj.view.board.board.BoardFragment$initObserver$1$1$1$1", m13596f = "BoardFragment.kt", m13597i = {}, m13598l = {}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
            /* renamed from: com.zykj.view.board.board.BoardFragment$initObserver$1$1$1$1, reason: invalid class name and collision with other inner class name */
            public static final class C101421 extends SuspendLambda implements Function2<AbstractC7216c, Continuation<? super Unit>, Object> {

                /* renamed from: a */
                public int f10891a;

                /* renamed from: b */
                public /* synthetic */ Object f10892b;

                /* renamed from: c */
                public final /* synthetic */ BoardFragment f10893c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C101421(BoardFragment boardFragment, Continuation continuation) {
                    super(2, continuation);
                    this.f10893c = boardFragment;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(AbstractC7216c abstractC7216c, Continuation continuation) {
                    return ((C101421) create(abstractC7216c, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation create(Object obj, Continuation continuation) {
                    C101421 c101421 = new C101421(this.f10893c, continuation);
                    c101421.f10892b = obj;
                    return c101421;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    AbstractC7216c abstractC7216c = (AbstractC7216c) this.f10892b;
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.f10891a != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    if (!(abstractC7216c instanceof AbstractC7216c.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    this.f10893c.m10803I1(((AbstractC7216c.a) abstractC7216c).m10967a());
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(BoardFragment boardFragment, Continuation continuation) {
                super(2, continuation);
                this.f10890b = boardFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new AnonymousClass1(this.f10890b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return invoke2(coroutineScope, (Continuation) continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i10 = this.f10889a;
                if (i10 == 0) {
                    ResultKt.throwOnFailure(obj);
                    SharedFlow sharedFlow = this.f10890b.m10810n0().getAndroidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String();
                    C101421 c101421 = new C101421(this.f10890b, null);
                    this.f10889a = 1;
                    if (FlowKt.collectLatest(sharedFlow, c101421, this) == coroutine_suspended) {
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
        @DebugMetadata(m13595c = "com.zykj.view.board.board.BoardFragment$initObserver$1$1$10", m13596f = "BoardFragment.kt", m13597i = {}, m13598l = {747}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
        /* renamed from: com.zykj.view.board.board.BoardFragment$initObserver$1$1$10, reason: invalid class name */
        public static final class AnonymousClass10 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* renamed from: a */
            public int f10894a;

            /* renamed from: b */
            public final /* synthetic */ BoardFragment f10895b;

            @Metadata(m13557d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m13558d2 = {"Lcom/zykj/view/board/board/h;", "state", "", "<anonymous>", "(Lcom/zykj/view/board/board/h;)V"}, m13559k = 3, m13560mv = {2, 2, 0})
            @DebugMetadata(m13595c = "com.zykj.view.board.board.BoardFragment$initObserver$1$1$10$1", m13596f = "BoardFragment.kt", m13597i = {}, m13598l = {}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
            /* renamed from: com.zykj.view.board.board.BoardFragment$initObserver$1$1$10$1, reason: invalid class name */
            public static final class AnonymousClass1 extends SuspendLambda implements Function2<C7221h, Continuation<? super Unit>, Object> {

                /* renamed from: a */
                public int f10896a;

                /* renamed from: b */
                public /* synthetic */ Object f10897b;

                /* renamed from: c */
                public final /* synthetic */ BoardFragment f10898c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(BoardFragment boardFragment, Continuation continuation) {
                    super(2, continuation);
                    this.f10898c = boardFragment;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(C7221h c7221h, Continuation continuation) {
                    return ((AnonymousClass1) create(c7221h, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation create(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f10898c, continuation);
                    anonymousClass1.f10897b = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    C7221h c7221h = (C7221h) this.f10897b;
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.f10896a != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    ViewFragmentBoardBinding viewFragmentBoardBinding = this.f10898c.mBinding;
                    if (viewFragmentBoardBinding == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                        viewFragmentBoardBinding = null;
                    }
                    viewFragmentBoardBinding.f11386m.setImageResource(c7221h.m10980b().m10981a());
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass10(BoardFragment boardFragment, Continuation continuation) {
                super(2, continuation);
                this.f10895b = boardFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new AnonymousClass10(this.f10895b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return invoke2(coroutineScope, (Continuation) continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i10 = this.f10894a;
                if (i10 == 0) {
                    ResultKt.throwOnFailure(obj);
                    StateFlow expandState = this.f10895b.m10810n0().getExpandState();
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f10895b, null);
                    this.f10894a = 1;
                    if (FlowKt.collectLatest(expandState, anonymousClass1, this) == coroutine_suspended) {
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
                return ((AnonymousClass10) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        @Metadata(m13557d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13558d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13559k = 3, m13560mv = {2, 2, 0}, m13562xi = 48)
        @DebugMetadata(m13595c = "com.zykj.view.board.board.BoardFragment$initObserver$1$1$11", m13596f = "BoardFragment.kt", m13597i = {}, m13598l = {754}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
        /* renamed from: com.zykj.view.board.board.BoardFragment$initObserver$1$1$11, reason: invalid class name */
        public static final class AnonymousClass11 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* renamed from: a */
            public int f10899a;

            /* renamed from: b */
            public final /* synthetic */ BoardFragment f10900b;

            @Metadata(m13557d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m13558d2 = {"Lcom/zykj/view/board/board/s;", "record", "", "<anonymous>", "(Lcom/zykj/view/board/board/s;)V"}, m13559k = 3, m13560mv = {2, 2, 0})
            @DebugMetadata(m13595c = "com.zykj.view.board.board.BoardFragment$initObserver$1$1$11$1", m13596f = "BoardFragment.kt", m13597i = {}, m13598l = {}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
            @SourceDebugExtension({"SMAP\nBoardFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BoardFragment.kt\ncom/zykj/view/board/board/BoardFragment$initObserver$1$1$11$1\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,1030:1\n257#2,2:1031\n257#2,2:1033\n257#2,2:1035\n*S KotlinDebug\n*F\n+ 1 BoardFragment.kt\ncom/zykj/view/board/board/BoardFragment$initObserver$1$1$11$1\n*L\n762#1:1031,2\n764#1:1033,2\n766#1:1035,2\n*E\n"})
            /* renamed from: com.zykj.view.board.board.BoardFragment$initObserver$1$1$11$1, reason: invalid class name */
            public static final class AnonymousClass1 extends SuspendLambda implements Function2<C7232s, Continuation<? super Unit>, Object> {

                /* renamed from: a */
                public int f10901a;

                /* renamed from: b */
                public /* synthetic */ Object f10902b;

                /* renamed from: c */
                public final /* synthetic */ BoardFragment f10903c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(BoardFragment boardFragment, Continuation continuation) {
                    super(2, continuation);
                    this.f10903c = boardFragment;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(C7232s c7232s, Continuation continuation) {
                    return ((AnonymousClass1) create(c7232s, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation create(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f10903c, continuation);
                    anonymousClass1.f10902b = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    C7232s c7232s = (C7232s) this.f10902b;
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.f10901a != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    ViewFragmentBoardBinding viewFragmentBoardBinding = this.f10903c.mBinding;
                    if (viewFragmentBoardBinding == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                        viewFragmentBoardBinding = null;
                    }
                    ViewItemSketchRecordAudioBinding viewItemSketchRecordAudioBinding = viewFragmentBoardBinding.f11383j;
                    viewItemSketchRecordAudioBinding.f11547b.setImageResource(c7232s.m11040d().m11042a());
                    viewItemSketchRecordAudioBinding.f11546a.setSelected(c7232s.m11041e());
                    viewItemSketchRecordAudioBinding.f11554i.setText(c7232s.m11039c());
                    LinearLayoutCompat llCrop = viewItemSketchRecordAudioBinding.f11548c;
                    Intrinsics.checkNotNullExpressionValue(llCrop, "llCrop");
                    llCrop.setVisibility(c7232s.m11040d().m11043b() ? 0 : 8);
                    LinearLayoutCompat llOption = viewItemSketchRecordAudioBinding.f11550e;
                    Intrinsics.checkNotNullExpressionValue(llOption, "llOption");
                    llOption.setVisibility(c7232s.m11040d().m11044c() ? 0 : 8);
                    LinearLayoutCompat llRecord = viewItemSketchRecordAudioBinding.f11552g;
                    Intrinsics.checkNotNullExpressionValue(llRecord, "llRecord");
                    llRecord.setVisibility(c7232s.m11040d().m11045d() ? 0 : 8);
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass11(BoardFragment boardFragment, Continuation continuation) {
                super(2, continuation);
                this.f10900b = boardFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new AnonymousClass11(this.f10900b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return invoke2(coroutineScope, (Continuation) continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i10 = this.f10899a;
                if (i10 == 0) {
                    ResultKt.throwOnFailure(obj);
                    StateFlow recordState = this.f10900b.m10810n0().getRecordState();
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f10900b, null);
                    this.f10899a = 1;
                    if (FlowKt.collectLatest(recordState, anonymousClass1, this) == coroutine_suspended) {
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
                return ((AnonymousClass11) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        @Metadata(m13557d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13558d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13559k = 3, m13560mv = {2, 2, 0}, m13562xi = 48)
        @DebugMetadata(m13595c = "com.zykj.view.board.board.BoardFragment$initObserver$1$1$2", m13596f = "BoardFragment.kt", m13597i = {}, m13598l = {TypedValues.MotionType.TYPE_QUANTIZE_INTERPOLATOR_TYPE}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
        /* renamed from: com.zykj.view.board.board.BoardFragment$initObserver$1$1$2, reason: invalid class name */
        public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* renamed from: a */
            public int f10904a;

            /* renamed from: b */
            public final /* synthetic */ BoardFragment f10905b;

            @Metadata(m13557d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m13558d2 = {"Lcom/zykj/view/board/board/m;", "state", "", "<anonymous>", "(Lcom/zykj/view/board/board/m;)V"}, m13559k = 3, m13560mv = {2, 2, 0})
            @DebugMetadata(m13595c = "com.zykj.view.board.board.BoardFragment$initObserver$1$1$2$1", m13596f = "BoardFragment.kt", m13597i = {}, m13598l = {}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
            @SourceDebugExtension({"SMAP\nBoardFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BoardFragment.kt\ncom/zykj/view/board/board/BoardFragment$initObserver$1$1$2$1\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,1030:1\n257#2,2:1031\n257#2,2:1033\n257#2,2:1035\n257#2,2:1037\n*S KotlinDebug\n*F\n+ 1 BoardFragment.kt\ncom/zykj/view/board/board/BoardFragment$initObserver$1$1$2$1\n*L\n613#1:1031,2\n614#1:1033,2\n615#1:1035,2\n616#1:1037,2\n*E\n"})
            /* renamed from: com.zykj.view.board.board.BoardFragment$initObserver$1$1$2$1, reason: invalid class name */
            public static final class AnonymousClass1 extends SuspendLambda implements Function2<C7226m, Continuation<? super Unit>, Object> {

                /* renamed from: a */
                public int f10906a;

                /* renamed from: b */
                public /* synthetic */ Object f10907b;

                /* renamed from: c */
                public final /* synthetic */ BoardFragment f10908c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(BoardFragment boardFragment, Continuation continuation) {
                    super(2, continuation);
                    this.f10908c = boardFragment;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(C7226m c7226m, Continuation continuation) {
                    return ((AnonymousClass1) create(c7226m, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation create(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f10908c, continuation);
                    anonymousClass1.f10907b = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    C7226m c7226m = (C7226m) this.f10907b;
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.f10906a != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    ViewFragmentBoardBinding viewFragmentBoardBinding = this.f10908c.mBinding;
                    if (viewFragmentBoardBinding == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                        viewFragmentBoardBinding = null;
                    }
                    ViewIncludeMenuBinding viewIncludeMenuBinding = viewFragmentBoardBinding.f11381h;
                    AppCompatImageView ivWithdraw = viewIncludeMenuBinding.f11500k;
                    Intrinsics.checkNotNullExpressionValue(ivWithdraw, "ivWithdraw");
                    ivWithdraw.setVisibility(c7226m.m11007d() ? 0 : 8);
                    AppCompatImageView ivRecover = viewIncludeMenuBinding.f11496g;
                    Intrinsics.checkNotNullExpressionValue(ivRecover, "ivRecover");
                    ivRecover.setVisibility(c7226m.m11007d() ? 0 : 8);
                    AppCompatImageView ivEnlarge = viewIncludeMenuBinding.f11492c;
                    Intrinsics.checkNotNullExpressionValue(ivEnlarge, "ivEnlarge");
                    ivEnlarge.setVisibility(c7226m.m11008e() ? 0 : 8);
                    AppCompatImageView ivReduce = viewIncludeMenuBinding.f11497h;
                    Intrinsics.checkNotNullExpressionValue(ivReduce, "ivReduce");
                    ivReduce.setVisibility(c7226m.m11008e() ? 0 : 8);
                    viewIncludeMenuBinding.f11500k.setEnabled(c7226m.m11011h());
                    viewIncludeMenuBinding.f11496g.setEnabled(c7226m.m11009f());
                    viewIncludeMenuBinding.f11499j.setSelected(c7226m.m11010g());
                    viewIncludeMenuBinding.f11498i.setSelected(c7226m.m11006c().m11015d());
                    viewIncludeMenuBinding.f11495f.setSelected(c7226m.m11006c().m11014c());
                    viewIncludeMenuBinding.f11493d.setSelected(c7226m.m11006c().m11012a());
                    viewIncludeMenuBinding.f11494e.setSelected(c7226m.m11006c().m11013b());
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(BoardFragment boardFragment, Continuation continuation) {
                super(2, continuation);
                this.f10905b = boardFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new AnonymousClass2(this.f10905b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return invoke2(coroutineScope, (Continuation) continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i10 = this.f10904a;
                if (i10 == 0) {
                    ResultKt.throwOnFailure(obj);
                    StateFlow mainToolState = this.f10905b.m10810n0().getMainToolState();
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f10905b, null);
                    this.f10904a = 1;
                    if (FlowKt.collectLatest(mainToolState, anonymousClass1, this) == coroutine_suspended) {
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

        @Metadata(m13557d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13558d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13559k = 3, m13560mv = {2, 2, 0}, m13562xi = 48)
        @DebugMetadata(m13595c = "com.zykj.view.board.board.BoardFragment$initObserver$1$1$3", m13596f = "BoardFragment.kt", m13597i = {}, m13598l = {633}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
        /* renamed from: com.zykj.view.board.board.BoardFragment$initObserver$1$1$3, reason: invalid class name */
        public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* renamed from: a */
            public int f10909a;

            /* renamed from: b */
            public final /* synthetic */ BoardFragment f10910b;

            @Metadata(m13557d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m13558d2 = {"Lq7/c2;", "state", "", "<anonymous>", "(Lq7/c2;)V"}, m13559k = 3, m13560mv = {2, 2, 0})
            @DebugMetadata(m13595c = "com.zykj.view.board.board.BoardFragment$initObserver$1$1$3$1", m13596f = "BoardFragment.kt", m13597i = {}, m13598l = {}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
            /* renamed from: com.zykj.view.board.board.BoardFragment$initObserver$1$1$3$1, reason: invalid class name */
            public static final class AnonymousClass1 extends SuspendLambda implements Function2<C8910c2, Continuation<? super Unit>, Object> {

                /* renamed from: a */
                public int f10911a;

                /* renamed from: b */
                public /* synthetic */ Object f10912b;

                /* renamed from: c */
                public final /* synthetic */ BoardFragment f10913c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(BoardFragment boardFragment, Continuation continuation) {
                    super(2, continuation);
                    this.f10913c = boardFragment;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(C8910c2 c8910c2, Continuation continuation) {
                    return ((AnonymousClass1) create(c8910c2, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation create(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f10913c, continuation);
                    anonymousClass1.f10912b = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    C8910c2 c8910c2 = (C8910c2) this.f10912b;
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.f10911a != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    ViewFragmentBoardBinding viewFragmentBoardBinding = this.f10913c.mBinding;
                    if (viewFragmentBoardBinding == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                        viewFragmentBoardBinding = null;
                    }
                    ViewIncludeSelectTypeBinding viewIncludeSelectTypeBinding = viewFragmentBoardBinding.f11384k;
                    viewIncludeSelectTypeBinding.f11529d.setSelected(c8910c2.m15032e());
                    viewIncludeSelectTypeBinding.f11527b.setSelected(c8910c2.m15030c());
                    viewIncludeSelectTypeBinding.f11528c.setSelected(c8910c2.m15031d());
                    viewIncludeSelectTypeBinding.f11530e.setSelected(c8910c2.m15033f());
                    viewIncludeSelectTypeBinding.f11526a.setSelected(c8910c2.m15029b());
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass3(BoardFragment boardFragment, Continuation continuation) {
                super(2, continuation);
                this.f10910b = boardFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new AnonymousClass3(this.f10910b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return invoke2(coroutineScope, (Continuation) continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i10 = this.f10909a;
                if (i10 == 0) {
                    ResultKt.throwOnFailure(obj);
                    StateFlow selectToolState = this.f10910b.m10810n0().getSelectToolState();
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f10910b, null);
                    this.f10909a = 1;
                    if (FlowKt.collectLatest(selectToolState, anonymousClass1, this) == coroutine_suspended) {
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
                return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        @Metadata(m13557d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13558d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13559k = 3, m13560mv = {2, 2, 0}, m13562xi = 48)
        @DebugMetadata(m13595c = "com.zykj.view.board.board.BoardFragment$initObserver$1$1$4", m13596f = "BoardFragment.kt", m13597i = {}, m13598l = {646}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
        /* renamed from: com.zykj.view.board.board.BoardFragment$initObserver$1$1$4, reason: invalid class name */
        public static final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* renamed from: a */
            public int f10914a;

            /* renamed from: b */
            public final /* synthetic */ BoardFragment f10915b;

            @Metadata(m13557d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m13558d2 = {"Lcom/zykj/view/board/board/q;", "state", "", "<anonymous>", "(Lcom/zykj/view/board/board/q;)V"}, m13559k = 3, m13560mv = {2, 2, 0})
            @DebugMetadata(m13595c = "com.zykj.view.board.board.BoardFragment$initObserver$1$1$4$1", m13596f = "BoardFragment.kt", m13597i = {}, m13598l = {}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
            @SourceDebugExtension({"SMAP\nBoardFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BoardFragment.kt\ncom/zykj/view/board/board/BoardFragment$initObserver$1$1$4$1\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,1030:1\n257#2,2:1031\n257#2,2:1033\n*S KotlinDebug\n*F\n+ 1 BoardFragment.kt\ncom/zykj/view/board/board/BoardFragment$initObserver$1$1$4$1\n*L\n648#1:1031,2\n649#1:1033,2\n*E\n"})
            /* renamed from: com.zykj.view.board.board.BoardFragment$initObserver$1$1$4$1, reason: invalid class name */
            public static final class AnonymousClass1 extends SuspendLambda implements Function2<C7230q, Continuation<? super Unit>, Object> {

                /* renamed from: a */
                public int f10916a;

                /* renamed from: b */
                public /* synthetic */ Object f10917b;

                /* renamed from: c */
                public final /* synthetic */ BoardFragment f10918c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(BoardFragment boardFragment, Continuation continuation) {
                    super(2, continuation);
                    this.f10918c = boardFragment;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(C7230q c7230q, Continuation continuation) {
                    return ((AnonymousClass1) create(c7230q, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation create(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f10918c, continuation);
                    anonymousClass1.f10917b = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    C7230q c7230q = (C7230q) this.f10917b;
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.f10916a != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    ViewFragmentBoardBinding viewFragmentBoardBinding = this.f10918c.mBinding;
                    if (viewFragmentBoardBinding == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                        viewFragmentBoardBinding = null;
                    }
                    ViewIncludePenBinding viewIncludePenBinding = viewFragmentBoardBinding.f11382i;
                    RadioButton rbPenDottedLine = viewIncludePenBinding.f11508d;
                    Intrinsics.checkNotNullExpressionValue(rbPenDottedLine, "rbPenDottedLine");
                    rbPenDottedLine.setVisibility(c7230q.m11025c() ? 0 : 8);
                    RadioButton rbPenHighlighter = viewIncludePenBinding.f11509e;
                    Intrinsics.checkNotNullExpressionValue(rbPenHighlighter, "rbPenHighlighter");
                    rbPenHighlighter.setVisibility(c7230q.m11026d() ? 0 : 8);
                    RadioGroup rgPenType = viewIncludePenBinding.f11516l;
                    Intrinsics.checkNotNullExpressionValue(rgPenType, "rgPenType");
                    AbstractC5046c.m2525a(rgPenType, c7230q.m11030h().m11033b());
                    RadioGroup rgPenSize = viewIncludePenBinding.f11515k;
                    Intrinsics.checkNotNullExpressionValue(rgPenSize, "rgPenSize");
                    AbstractC5046c.m2525a(rgPenSize, c7230q.m11029g());
                    RadioGroup rgPenColor = viewIncludePenBinding.f11514j;
                    Intrinsics.checkNotNullExpressionValue(rgPenColor, "rgPenColor");
                    AbstractC5046c.m2525a(rgPenColor, c7230q.m11027e().m11022b());
                    viewIncludePenBinding.f11505a.setColor(c7230q.m11028f());
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass4(BoardFragment boardFragment, Continuation continuation) {
                super(2, continuation);
                this.f10915b = boardFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new AnonymousClass4(this.f10915b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return invoke2(coroutineScope, (Continuation) continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i10 = this.f10914a;
                if (i10 == 0) {
                    ResultKt.throwOnFailure(obj);
                    StateFlow penToolState = this.f10915b.m10810n0().getPenToolState();
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f10915b, null);
                    this.f10914a = 1;
                    if (FlowKt.collectLatest(penToolState, anonymousClass1, this) == coroutine_suspended) {
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
                return ((AnonymousClass4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        @Metadata(m13557d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13558d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13559k = 3, m13560mv = {2, 2, 0}, m13562xi = 48)
        @DebugMetadata(m13595c = "com.zykj.view.board.board.BoardFragment$initObserver$1$1$5", m13596f = "BoardFragment.kt", m13597i = {}, m13598l = {667}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
        /* renamed from: com.zykj.view.board.board.BoardFragment$initObserver$1$1$5, reason: invalid class name */
        public static final class AnonymousClass5 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* renamed from: a */
            public int f10919a;

            /* renamed from: b */
            public final /* synthetic */ BoardFragment f10920b;

            @Metadata(m13557d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m13558d2 = {"Lcom/zykj/view/board/board/j;", "extraUIState", "Lcom/zykj/view/board/board/q;", "penToolState", "", "<anonymous>", "(Lcom/zykj/view/board/board/j;Lcom/zykj/view/board/board/q;)Z"}, m13559k = 3, m13560mv = {2, 2, 0})
            @DebugMetadata(m13595c = "com.zykj.view.board.board.BoardFragment$initObserver$1$1$5$1", m13596f = "BoardFragment.kt", m13597i = {}, m13598l = {}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
            /* renamed from: com.zykj.view.board.board.BoardFragment$initObserver$1$1$5$1, reason: invalid class name */
            public static final class AnonymousClass1 extends SuspendLambda implements Function3<C7223j, C7230q, Continuation<? super Boolean>, Object> {

                /* renamed from: a */
                public int f10921a;

                /* renamed from: b */
                public /* synthetic */ Object f10922b;

                /* renamed from: c */
                public /* synthetic */ Object f10923c;

                public AnonymousClass1(Continuation continuation) {
                    super(3, continuation);
                }

                @Override // kotlin.jvm.functions.Function3
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(C7223j c7223j, C7230q c7230q, Continuation continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation);
                    anonymousClass1.f10922b = c7223j;
                    anonymousClass1.f10923c = c7230q;
                    return anonymousClass1.invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    C7223j c7223j = (C7223j) this.f10922b;
                    C7230q c7230q = (C7230q) this.f10923c;
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.f10921a != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return Boxing.boxBoolean(c7223j.m10987f().m11019d() && c7230q.m11031i());
                }
            }

            @Metadata(m13557d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m13558d2 = {"<anonymous>", "", "isShow", ""}, m13559k = 3, m13560mv = {2, 2, 0}, m13562xi = 48)
            @DebugMetadata(m13595c = "com.zykj.view.board.board.BoardFragment$initObserver$1$1$5$2", m13596f = "BoardFragment.kt", m13597i = {}, m13598l = {}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
            @SourceDebugExtension({"SMAP\nBoardFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BoardFragment.kt\ncom/zykj/view/board/board/BoardFragment$initObserver$1$1$5$2\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,1030:1\n257#2,2:1031\n*S KotlinDebug\n*F\n+ 1 BoardFragment.kt\ncom/zykj/view/board/board/BoardFragment$initObserver$1$1$5$2\n*L\n668#1:1031,2\n*E\n"})
            /* renamed from: com.zykj.view.board.board.BoardFragment$initObserver$1$1$5$2, reason: invalid class name */
            public static final class AnonymousClass2 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {

                /* renamed from: a */
                public int f10924a;

                /* renamed from: b */
                public /* synthetic */ boolean f10925b;

                /* renamed from: c */
                public final /* synthetic */ BoardFragment f10926c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass2(BoardFragment boardFragment, Continuation continuation) {
                    super(2, continuation);
                    this.f10926c = boardFragment;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation create(Object obj, Continuation continuation) {
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.f10926c, continuation);
                    anonymousClass2.f10925b = ((Boolean) obj).booleanValue();
                    return anonymousClass2;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
                    return invoke(bool.booleanValue(), continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    boolean z9 = this.f10925b;
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.f10924a != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    ViewFragmentBoardBinding viewFragmentBoardBinding = this.f10926c.mBinding;
                    ViewFragmentBoardBinding viewFragmentBoardBinding2 = null;
                    if (viewFragmentBoardBinding == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                        viewFragmentBoardBinding = null;
                    }
                    CustomColorFrameLayout flCustomColor = viewFragmentBoardBinding.f11375b;
                    Intrinsics.checkNotNullExpressionValue(flCustomColor, "flCustomColor");
                    flCustomColor.setVisibility(z9 ? 0 : 8);
                    if (z9) {
                        ViewFragmentBoardBinding viewFragmentBoardBinding3 = this.f10926c.mBinding;
                        if (viewFragmentBoardBinding3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                        } else {
                            viewFragmentBoardBinding2 = viewFragmentBoardBinding3;
                        }
                        viewFragmentBoardBinding2.f11375b.m11500c();
                    }
                    return Unit.INSTANCE;
                }

                public final Object invoke(boolean z9, Continuation continuation) {
                    return ((AnonymousClass2) create(Boolean.valueOf(z9), continuation)).invokeSuspend(Unit.INSTANCE);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass5(BoardFragment boardFragment, Continuation continuation) {
                super(2, continuation);
                this.f10920b = boardFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new AnonymousClass5(this.f10920b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return invoke2(coroutineScope, (Continuation) continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i10 = this.f10919a;
                if (i10 == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(FlowKt.combine(this.f10920b.m10810n0().getExtraUIState(), this.f10920b.m10810n0().getPenToolState(), new AnonymousClass1(null)));
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.f10920b, null);
                    this.f10919a = 1;
                    if (FlowKt.collectLatest(flowDistinctUntilChanged, anonymousClass2, this) == coroutine_suspended) {
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
                return ((AnonymousClass5) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        @Metadata(m13557d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13558d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13559k = 3, m13560mv = {2, 2, 0}, m13562xi = 48)
        @DebugMetadata(m13595c = "com.zykj.view.board.board.BoardFragment$initObserver$1$1$6", m13596f = "BoardFragment.kt", m13597i = {}, m13598l = {679}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
        /* renamed from: com.zykj.view.board.board.BoardFragment$initObserver$1$1$6, reason: invalid class name */
        public static final class AnonymousClass6 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* renamed from: a */
            public int f10927a;

            /* renamed from: b */
            public final /* synthetic */ BoardFragment f10928b;

            @Metadata(m13557d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m13558d2 = {"Lcom/zykj/view/board/board/f;", "state", "", "<anonymous>", "(Lcom/zykj/view/board/board/f;)V"}, m13559k = 3, m13560mv = {2, 2, 0})
            @DebugMetadata(m13595c = "com.zykj.view.board.board.BoardFragment$initObserver$1$1$6$1", m13596f = "BoardFragment.kt", m13597i = {}, m13598l = {}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
            /* renamed from: com.zykj.view.board.board.BoardFragment$initObserver$1$1$6$1, reason: invalid class name */
            public static final class AnonymousClass1 extends SuspendLambda implements Function2<C7219f, Continuation<? super Unit>, Object> {

                /* renamed from: a */
                public int f10929a;

                /* renamed from: b */
                public /* synthetic */ Object f10930b;

                /* renamed from: c */
                public final /* synthetic */ BoardFragment f10931c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(BoardFragment boardFragment, Continuation continuation) {
                    super(2, continuation);
                    this.f10931c = boardFragment;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(C7219f c7219f, Continuation continuation) {
                    return ((AnonymousClass1) create(c7219f, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation create(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f10931c, continuation);
                    anonymousClass1.f10930b = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    C7219f c7219f = (C7219f) this.f10930b;
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.f10929a != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    ViewFragmentBoardBinding viewFragmentBoardBinding = this.f10931c.mBinding;
                    if (viewFragmentBoardBinding == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                        viewFragmentBoardBinding = null;
                    }
                    RadioGroup rgEraserSize = viewFragmentBoardBinding.f11379f.f11459d;
                    Intrinsics.checkNotNullExpressionValue(rgEraserSize, "rgEraserSize");
                    AbstractC5046c.m2525a(rgEraserSize, c7219f.m10976b().m10977a());
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass6(BoardFragment boardFragment, Continuation continuation) {
                super(2, continuation);
                this.f10928b = boardFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new AnonymousClass6(this.f10928b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return invoke2(coroutineScope, (Continuation) continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i10 = this.f10927a;
                if (i10 == 0) {
                    ResultKt.throwOnFailure(obj);
                    StateFlow eraserToolState = this.f10928b.m10810n0().getEraserToolState();
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f10928b, null);
                    this.f10927a = 1;
                    if (FlowKt.collectLatest(eraserToolState, anonymousClass1, this) == coroutine_suspended) {
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
                return ((AnonymousClass6) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        @Metadata(m13557d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13558d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13559k = 3, m13560mv = {2, 2, 0}, m13562xi = 48)
        @DebugMetadata(m13595c = "com.zykj.view.board.board.BoardFragment$initObserver$1$1$7", m13596f = "BoardFragment.kt", m13597i = {}, m13598l = {688}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
        /* renamed from: com.zykj.view.board.board.BoardFragment$initObserver$1$1$7, reason: invalid class name */
        public static final class AnonymousClass7 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* renamed from: a */
            public int f10932a;

            /* renamed from: b */
            public final /* synthetic */ BoardFragment f10933b;

            @Metadata(m13557d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m13558d2 = {"Lcom/zykj/view/board/board/k;", "state", "", "<anonymous>", "(Lcom/zykj/view/board/board/k;)V"}, m13559k = 3, m13560mv = {2, 2, 0})
            @DebugMetadata(m13595c = "com.zykj.view.board.board.BoardFragment$initObserver$1$1$7$1", m13596f = "BoardFragment.kt", m13597i = {}, m13598l = {}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
            @SourceDebugExtension({"SMAP\nBoardFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BoardFragment.kt\ncom/zykj/view/board/board/BoardFragment$initObserver$1$1$7$1\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,1030:1\n257#2,2:1031\n257#2,2:1033\n257#2,2:1035\n257#2,2:1037\n257#2,2:1039\n257#2,2:1041\n*S KotlinDebug\n*F\n+ 1 BoardFragment.kt\ncom/zykj/view/board/board/BoardFragment$initObserver$1$1$7$1\n*L\n690#1:1031,2\n691#1:1033,2\n692#1:1035,2\n693#1:1037,2\n694#1:1039,2\n695#1:1041,2\n*E\n"})
            /* renamed from: com.zykj.view.board.board.BoardFragment$initObserver$1$1$7$1, reason: invalid class name */
            public static final class AnonymousClass1 extends SuspendLambda implements Function2<C7224k, Continuation<? super Unit>, Object> {

                /* renamed from: a */
                public int f10934a;

                /* renamed from: b */
                public /* synthetic */ Object f10935b;

                /* renamed from: c */
                public final /* synthetic */ BoardFragment f10936c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(BoardFragment boardFragment, Continuation continuation) {
                    super(2, continuation);
                    this.f10936c = boardFragment;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(C7224k c7224k, Continuation continuation) {
                    return ((AnonymousClass1) create(c7224k, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation create(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f10936c, continuation);
                    anonymousClass1.f10935b = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    C7224k c7224k = (C7224k) this.f10935b;
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.f10934a != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    ViewFragmentBoardBinding viewFragmentBoardBinding = this.f10936c.mBinding;
                    if (viewFragmentBoardBinding == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                        viewFragmentBoardBinding = null;
                    }
                    ViewIncludeImageAddBinding viewIncludeImageAddBinding = viewFragmentBoardBinding.f11380g;
                    AppCompatImageView ivImageCamera = viewIncludeImageAddBinding.f11480a;
                    Intrinsics.checkNotNullExpressionValue(ivImageCamera, "ivImageCamera");
                    ivImageCamera.setVisibility(c7224k.m10995c() ? 0 : 8);
                    AppCompatImageView ivImageGallery = viewIncludeImageAddBinding.f11481b;
                    Intrinsics.checkNotNullExpressionValue(ivImageGallery, "ivImageGallery");
                    ivImageGallery.setVisibility(c7224k.m10996d() ? 0 : 8);
                    AppCompatImageView ivText = viewIncludeImageAddBinding.f11484e;
                    Intrinsics.checkNotNullExpressionValue(ivText, "ivText");
                    ivText.setVisibility(c7224k.m10999g() ? 0 : 8);
                    AppCompatImageView ivRectangle = viewIncludeImageAddBinding.f11483d;
                    Intrinsics.checkNotNullExpressionValue(ivRectangle, "ivRectangle");
                    ivRectangle.setVisibility(c7224k.m10998f() ? 0 : 8);
                    AppCompatImageView ivOval = viewIncludeImageAddBinding.f11482c;
                    Intrinsics.checkNotNullExpressionValue(ivOval, "ivOval");
                    ivOval.setVisibility(c7224k.m10998f() ? 0 : 8);
                    ImageView ivTriangle = viewIncludeImageAddBinding.f11485f;
                    Intrinsics.checkNotNullExpressionValue(ivTriangle, "ivTriangle");
                    ivTriangle.setVisibility(c7224k.m10998f() ? 0 : 8);
                    viewIncludeImageAddBinding.f11483d.setSelected(c7224k.m10997e().m11002c());
                    viewIncludeImageAddBinding.f11482c.setSelected(c7224k.m10997e().m11001b());
                    viewIncludeImageAddBinding.f11485f.setSelected(c7224k.m10997e().m11003d());
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass7(BoardFragment boardFragment, Continuation continuation) {
                super(2, continuation);
                this.f10933b = boardFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new AnonymousClass7(this.f10933b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return invoke2(coroutineScope, (Continuation) continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i10 = this.f10932a;
                if (i10 == 0) {
                    ResultKt.throwOnFailure(obj);
                    StateFlow graphToolState = this.f10933b.m10810n0().getGraphToolState();
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f10933b, null);
                    this.f10932a = 1;
                    if (FlowKt.collectLatest(graphToolState, anonymousClass1, this) == coroutine_suspended) {
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
                return ((AnonymousClass7) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        @Metadata(m13557d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13558d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13559k = 3, m13560mv = {2, 2, 0}, m13562xi = 48)
        @DebugMetadata(m13595c = "com.zykj.view.board.board.BoardFragment$initObserver$1$1$8", m13596f = "BoardFragment.kt", m13597i = {}, m13598l = {TypedValues.TransitionType.TYPE_STAGGERED}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
        /* renamed from: com.zykj.view.board.board.BoardFragment$initObserver$1$1$8, reason: invalid class name */
        public static final class AnonymousClass8 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* renamed from: a */
            public int f10937a;

            /* renamed from: b */
            public final /* synthetic */ BoardFragment f10938b;

            @Metadata(m13557d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m13558d2 = {"Lcom/zykj/view/board/board/a;", "state", "", "<anonymous>", "(Lcom/zykj/view/board/board/a;)V"}, m13559k = 3, m13560mv = {2, 2, 0})
            @DebugMetadata(m13595c = "com.zykj.view.board.board.BoardFragment$initObserver$1$1$8$1", m13596f = "BoardFragment.kt", m13597i = {}, m13598l = {}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
            @SourceDebugExtension({"SMAP\nBoardFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BoardFragment.kt\ncom/zykj/view/board/board/BoardFragment$initObserver$1$1$8$1\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,1030:1\n257#2,2:1031\n257#2,2:1033\n*S KotlinDebug\n*F\n+ 1 BoardFragment.kt\ncom/zykj/view/board/board/BoardFragment$initObserver$1$1$8$1\n*L\n708#1:1031,2\n709#1:1033,2\n*E\n"})
            /* renamed from: com.zykj.view.board.board.BoardFragment$initObserver$1$1$8$1, reason: invalid class name */
            public static final class AnonymousClass1 extends SuspendLambda implements Function2<C7214a, Continuation<? super Unit>, Object> {

                /* renamed from: a */
                public int f10939a;

                /* renamed from: b */
                public /* synthetic */ Object f10940b;

                /* renamed from: c */
                public final /* synthetic */ BoardFragment f10941c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(BoardFragment boardFragment, Continuation continuation) {
                    super(2, continuation);
                    this.f10941c = boardFragment;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(C7214a c7214a, Continuation continuation) {
                    return ((AnonymousClass1) create(c7214a, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation create(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f10941c, continuation);
                    anonymousClass1.f10940b = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    C7214a c7214a = (C7214a) this.f10940b;
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.f10939a != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    ViewFragmentBoardBinding viewFragmentBoardBinding = this.f10941c.mBinding;
                    if (viewFragmentBoardBinding == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                        viewFragmentBoardBinding = null;
                    }
                    ViewIncludeBackgroundColorBinding viewIncludeBackgroundColorBinding = viewFragmentBoardBinding.f11377d;
                    WithSelectedRadioButton rbBackgroundLine = viewIncludeBackgroundColorBinding.f11442e;
                    Intrinsics.checkNotNullExpressionValue(rbBackgroundLine, "rbBackgroundLine");
                    rbBackgroundLine.setVisibility(c7214a.m10960c() ? 0 : 8);
                    WithSelectedRadioButton rbBackgroundInterweave = viewIncludeBackgroundColorBinding.f11441d;
                    Intrinsics.checkNotNullExpressionValue(rbBackgroundInterweave, "rbBackgroundInterweave");
                    rbBackgroundInterweave.setVisibility(c7214a.m10960c() ? 0 : 8);
                    RadioGroup rgBackgroundColor = viewIncludeBackgroundColorBinding.f11444g;
                    Intrinsics.checkNotNullExpressionValue(rgBackgroundColor, "rgBackgroundColor");
                    AbstractC5046c.m2525a(rgBackgroundColor, c7214a.m10961d().m10966e());
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass8(BoardFragment boardFragment, Continuation continuation) {
                super(2, continuation);
                this.f10938b = boardFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new AnonymousClass8(this.f10938b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return invoke2(coroutineScope, (Continuation) continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i10 = this.f10937a;
                if (i10 == 0) {
                    ResultKt.throwOnFailure(obj);
                    StateFlow backgroundToolState = this.f10938b.m10810n0().getBackgroundToolState();
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f10938b, null);
                    this.f10937a = 1;
                    if (FlowKt.collectLatest(backgroundToolState, anonymousClass1, this) == coroutine_suspended) {
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
                return ((AnonymousClass8) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        @Metadata(m13557d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13558d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13559k = 3, m13560mv = {2, 2, 0}, m13562xi = 48)
        @DebugMetadata(m13595c = "com.zykj.view.board.board.BoardFragment$initObserver$1$1$9", m13596f = "BoardFragment.kt", m13597i = {}, m13598l = {717}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
        /* renamed from: com.zykj.view.board.board.BoardFragment$initObserver$1$1$9, reason: invalid class name */
        public static final class AnonymousClass9 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* renamed from: a */
            public int f10942a;

            /* renamed from: b */
            public final /* synthetic */ BoardFragment f10943b;

            @Metadata(m13557d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m13558d2 = {"Lcom/zykj/view/board/board/j;", "state", "", "<anonymous>", "(Lcom/zykj/view/board/board/j;)V"}, m13559k = 3, m13560mv = {2, 2, 0})
            @DebugMetadata(m13595c = "com.zykj.view.board.board.BoardFragment$initObserver$1$1$9$1", m13596f = "BoardFragment.kt", m13597i = {}, m13598l = {}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
            @SourceDebugExtension({"SMAP\nBoardFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BoardFragment.kt\ncom/zykj/view/board/board/BoardFragment$initObserver$1$1$9$1\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,1030:1\n257#2,2:1031\n257#2,2:1033\n257#2,2:1035\n257#2,2:1037\n257#2,2:1039\n257#2,2:1041\n257#2,2:1043\n257#2,2:1045\n*S KotlinDebug\n*F\n+ 1 BoardFragment.kt\ncom/zykj/view/board/board/BoardFragment$initObserver$1$1$9$1\n*L\n718#1:1031,2\n719#1:1033,2\n720#1:1035,2\n721#1:1037,2\n722#1:1039,2\n725#1:1041,2\n727#1:1043,2\n730#1:1045,2\n*E\n"})
            /* renamed from: com.zykj.view.board.board.BoardFragment$initObserver$1$1$9$1, reason: invalid class name */
            public static final class AnonymousClass1 extends SuspendLambda implements Function2<C7223j, Continuation<? super Unit>, Object> {

                /* renamed from: a */
                public int f10944a;

                /* renamed from: b */
                public /* synthetic */ Object f10945b;

                /* renamed from: c */
                public final /* synthetic */ BoardFragment f10946c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(BoardFragment boardFragment, Continuation continuation) {
                    super(2, continuation);
                    this.f10946c = boardFragment;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(C7223j c7223j, Continuation continuation) {
                    return ((AnonymousClass1) create(c7223j, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation create(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f10946c, continuation);
                    anonymousClass1.f10945b = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    C7223j c7223j = (C7223j) this.f10945b;
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.f10944a != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    ViewFragmentBoardBinding viewFragmentBoardBinding = this.f10946c.mBinding;
                    ViewFragmentBoardBinding viewFragmentBoardBinding2 = null;
                    if (viewFragmentBoardBinding == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                        viewFragmentBoardBinding = null;
                    }
                    View root = viewFragmentBoardBinding.f11384k.getRoot();
                    Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
                    root.setVisibility(c7223j.m10987f().m11020e() ? 0 : 8);
                    ViewFragmentBoardBinding viewFragmentBoardBinding3 = this.f10946c.mBinding;
                    if (viewFragmentBoardBinding3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                        viewFragmentBoardBinding3 = null;
                    }
                    View root2 = viewFragmentBoardBinding3.f11382i.getRoot();
                    Intrinsics.checkNotNullExpressionValue(root2, "getRoot(...)");
                    root2.setVisibility(c7223j.m10987f().m11019d() ? 0 : 8);
                    ViewFragmentBoardBinding viewFragmentBoardBinding4 = this.f10946c.mBinding;
                    if (viewFragmentBoardBinding4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                        viewFragmentBoardBinding4 = null;
                    }
                    View root3 = viewFragmentBoardBinding4.f11379f.getRoot();
                    Intrinsics.checkNotNullExpressionValue(root3, "getRoot(...)");
                    root3.setVisibility(c7223j.m10987f().m11017b() ? 0 : 8);
                    ViewFragmentBoardBinding viewFragmentBoardBinding5 = this.f10946c.mBinding;
                    if (viewFragmentBoardBinding5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                        viewFragmentBoardBinding5 = null;
                    }
                    View root4 = viewFragmentBoardBinding5.f11380g.getRoot();
                    Intrinsics.checkNotNullExpressionValue(root4, "getRoot(...)");
                    root4.setVisibility(c7223j.m10987f().m11018c() ? 0 : 8);
                    ViewFragmentBoardBinding viewFragmentBoardBinding6 = this.f10946c.mBinding;
                    if (viewFragmentBoardBinding6 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                        viewFragmentBoardBinding6 = null;
                    }
                    View root5 = viewFragmentBoardBinding6.f11377d.getRoot();
                    Intrinsics.checkNotNullExpressionValue(root5, "getRoot(...)");
                    root5.setVisibility(c7223j.m10987f().m11016a() ? 0 : 8);
                    ViewFragmentBoardBinding viewFragmentBoardBinding7 = this.f10946c.mBinding;
                    if (viewFragmentBoardBinding7 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                        viewFragmentBoardBinding7 = null;
                    }
                    View root6 = viewFragmentBoardBinding7.f11378e.getRoot();
                    Intrinsics.checkNotNullExpressionValue(root6, "getRoot(...)");
                    root6.setVisibility(c7223j.m10984c().m10968a() ? 0 : 8);
                    ViewFragmentBoardBinding viewFragmentBoardBinding8 = this.f10946c.mBinding;
                    if (viewFragmentBoardBinding8 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                        viewFragmentBoardBinding8 = null;
                    }
                    View root7 = viewFragmentBoardBinding8.f11383j.getRoot();
                    Intrinsics.checkNotNullExpressionValue(root7, "getRoot(...)");
                    root7.setVisibility(c7223j.m10984c().m10969b() ? 0 : 8);
                    ViewFragmentBoardBinding viewFragmentBoardBinding9 = this.f10946c.mBinding;
                    if (viewFragmentBoardBinding9 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                        viewFragmentBoardBinding9 = null;
                    }
                    LinearLayoutCompat llDeleteDraft = viewFragmentBoardBinding9.f11383j.f11549d;
                    Intrinsics.checkNotNullExpressionValue(llDeleteDraft, "llDeleteDraft");
                    llDeleteDraft.setVisibility(c7223j.m10990i() ? 0 : 8);
                    ViewFragmentBoardBinding viewFragmentBoardBinding10 = this.f10946c.mBinding;
                    if (viewFragmentBoardBinding10 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                        viewFragmentBoardBinding10 = null;
                    }
                    SketchProgressView sketchProgressView = viewFragmentBoardBinding10.f11389p;
                    sketchProgressView.setTouchable(c7223j.m10992k());
                    sketchProgressView.setProgress(c7223j.m10988g());
                    sketchProgressView.setThumbTime(c7223j.m10989h());
                    ViewFragmentBoardBinding viewFragmentBoardBinding11 = this.f10946c.mBinding;
                    if (viewFragmentBoardBinding11 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    } else {
                        viewFragmentBoardBinding2 = viewFragmentBoardBinding11;
                    }
                    SketchProgressView sketchProgressView2 = viewFragmentBoardBinding2.f11388o;
                    sketchProgressView2.setTouchable(c7223j.m10991j());
                    sketchProgressView2.setProgress(c7223j.m10985d());
                    sketchProgressView2.setThumbTime(c7223j.m10986e());
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass9(BoardFragment boardFragment, Continuation continuation) {
                super(2, continuation);
                this.f10943b = boardFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new AnonymousClass9(this.f10943b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return invoke2(coroutineScope, (Continuation) continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i10 = this.f10942a;
                if (i10 == 0) {
                    ResultKt.throwOnFailure(obj);
                    StateFlow extraUIState = this.f10943b.m10810n0().getExtraUIState();
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f10943b, null);
                    this.f10942a = 1;
                    if (FlowKt.collectLatest(extraUIState, anonymousClass1, this) == coroutine_suspended) {
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
                return ((AnonymousClass9) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C72101(BoardFragment boardFragment, Continuation continuation) {
            super(2, continuation);
            this.f10888c = boardFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C72101 c72101 = new C72101(this.f10888c, continuation);
            c72101.f10887b = obj;
            return c72101;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return invoke2(coroutineScope, (Continuation) continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineScope coroutineScope = (CoroutineScope) this.f10887b;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f10886a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(this.f10888c, null), 3, null);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass2(this.f10888c, null), 3, null);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass3(this.f10888c, null), 3, null);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass4(this.f10888c, null), 3, null);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass5(this.f10888c, null), 3, null);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass6(this.f10888c, null), 3, null);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass7(this.f10888c, null), 3, null);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass8(this.f10888c, null), 3, null);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass9(this.f10888c, null), 3, null);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass10(this.f10888c, null), 3, null);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass11(this.f10888c, null), 3, null);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C72101) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BoardFragment$initObserver$1(BoardFragment boardFragment, Continuation continuation) {
        super(2, continuation);
        this.f10885b = boardFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new BoardFragment$initObserver$1(this.f10885b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return invoke2(coroutineScope, (Continuation) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i10 = this.f10884a;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            LifecycleOwner viewLifecycleOwner = this.f10885b.getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            Lifecycle.State state = Lifecycle.State.RESUMED;
            C72101 c72101 = new C72101(this.f10885b, null);
            this.f10884a = 1;
            if (RepeatOnLifecycleKt.repeatOnLifecycle(viewLifecycleOwner, state, c72101, this) == coroutine_suspended) {
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
        return ((BoardFragment$initObserver$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
