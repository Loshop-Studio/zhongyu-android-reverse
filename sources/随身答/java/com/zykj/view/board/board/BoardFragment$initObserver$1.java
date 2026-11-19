package com.zykj.view.board.board;

import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.NotificationCompat;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.RepeatOnLifecycleKt;
import com.zykj.view.board.board.AbstractC7660c;
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
import p025b7.C5145f2;
import p181m7.AbstractC9026c;

@Metadata(m13412d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13413d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13414k = 3, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@DebugMetadata(m13450c = "com.zykj.view.board.board.BoardFragment$initObserver$1", m13451f = "BoardFragment.kt", m13452i = {}, m13453l = {597}, m13454m = "invokeSuspend", m13455n = {}, m13456s = {})
/* loaded from: classes5.dex */
public final class BoardFragment$initObserver$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: a */
    public int f12058a;

    /* renamed from: b */
    public final /* synthetic */ BoardFragment f12059b;

    @Metadata(m13412d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13413d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13414k = 3, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(m13450c = "com.zykj.view.board.board.BoardFragment$initObserver$1$1", m13451f = "BoardFragment.kt", m13452i = {}, m13453l = {}, m13454m = "invokeSuspend", m13455n = {}, m13456s = {})
    /* renamed from: com.zykj.view.board.board.BoardFragment$initObserver$1$1 */
    public static final class C76521 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a */
        public int f12060a;

        /* renamed from: b */
        public /* synthetic */ Object f12061b;

        /* renamed from: c */
        public final /* synthetic */ BoardFragment f12062c;

        @Metadata(m13412d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13413d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13414k = 3, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
        @DebugMetadata(m13450c = "com.zykj.view.board.board.BoardFragment$initObserver$1$1$1", m13451f = "BoardFragment.kt", m13452i = {}, m13453l = {600}, m13454m = "invokeSuspend", m13455n = {}, m13456s = {})
        /* renamed from: com.zykj.view.board.board.BoardFragment$initObserver$1$1$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* renamed from: a */
            public int f12063a;

            /* renamed from: b */
            public final /* synthetic */ BoardFragment f12064b;

            @Metadata(m13412d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m13413d2 = {"Lcom/zykj/view/board/board/c;", NotificationCompat.CATEGORY_EVENT, "", "<anonymous>", "(Lcom/zykj/view/board/board/c;)V"}, m13414k = 3, m13415mv = {2, 2, 0})
            @DebugMetadata(m13450c = "com.zykj.view.board.board.BoardFragment$initObserver$1$1$1$1", m13451f = "BoardFragment.kt", m13452i = {}, m13453l = {}, m13454m = "invokeSuspend", m13455n = {}, m13456s = {})
            /* renamed from: com.zykj.view.board.board.BoardFragment$initObserver$1$1$1$1, reason: invalid class name and collision with other inner class name */
            public static final class C100671 extends SuspendLambda implements Function2<AbstractC7660c, Continuation<? super Unit>, Object> {

                /* renamed from: a */
                public int f12065a;

                /* renamed from: b */
                public /* synthetic */ Object f12066b;

                /* renamed from: c */
                public final /* synthetic */ BoardFragment f12067c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C100671(BoardFragment boardFragment, Continuation continuation) {
                    super(2, continuation);
                    this.f12067c = boardFragment;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(AbstractC7660c abstractC7660c, Continuation continuation) {
                    return ((C100671) create(abstractC7660c, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation create(Object obj, Continuation continuation) {
                    C100671 c100671 = new C100671(this.f12067c, continuation);
                    c100671.f12066b = obj;
                    return c100671;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    AbstractC7660c abstractC7660c = (AbstractC7660c) this.f12066b;
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.f12065a != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    if (!(abstractC7660c instanceof AbstractC7660c.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    this.f12067c.m11203W1(((AbstractC7660c.a) abstractC7660c).m11386a());
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(BoardFragment boardFragment, Continuation continuation) {
                super(2, continuation);
                this.f12064b = boardFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new AnonymousClass1(this.f12064b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return invoke2(coroutineScope, (Continuation) continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i9 = this.f12063a;
                if (i9 == 0) {
                    ResultKt.throwOnFailure(obj);
                    SharedFlow sharedFlow = this.f12064b.m11209r0().getAndroidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String();
                    C100671 c100671 = new C100671(this.f12064b, null);
                    this.f12063a = 1;
                    if (FlowKt.collectLatest(sharedFlow, c100671, this) == coroutine_suspended) {
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
        @DebugMetadata(m13450c = "com.zykj.view.board.board.BoardFragment$initObserver$1$1$10", m13451f = "BoardFragment.kt", m13452i = {}, m13453l = {747}, m13454m = "invokeSuspend", m13455n = {}, m13456s = {})
        /* renamed from: com.zykj.view.board.board.BoardFragment$initObserver$1$1$10, reason: invalid class name */
        public static final class AnonymousClass10 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* renamed from: a */
            public int f12068a;

            /* renamed from: b */
            public final /* synthetic */ BoardFragment f12069b;

            @Metadata(m13412d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m13413d2 = {"Lcom/zykj/view/board/board/m;", "state", "", "<anonymous>", "(Lcom/zykj/view/board/board/m;)V"}, m13414k = 3, m13415mv = {2, 2, 0})
            @DebugMetadata(m13450c = "com.zykj.view.board.board.BoardFragment$initObserver$1$1$10$1", m13451f = "BoardFragment.kt", m13452i = {}, m13453l = {}, m13454m = "invokeSuspend", m13455n = {}, m13456s = {})
            /* renamed from: com.zykj.view.board.board.BoardFragment$initObserver$1$1$10$1, reason: invalid class name */
            public static final class AnonymousClass1 extends SuspendLambda implements Function2<C7670m, Continuation<? super Unit>, Object> {

                /* renamed from: a */
                public int f12070a;

                /* renamed from: b */
                public /* synthetic */ Object f12071b;

                /* renamed from: c */
                public final /* synthetic */ BoardFragment f12072c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(BoardFragment boardFragment, Continuation continuation) {
                    super(2, continuation);
                    this.f12072c = boardFragment;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(C7670m c7670m, Continuation continuation) {
                    return ((AnonymousClass1) create(c7670m, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation create(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f12072c, continuation);
                    anonymousClass1.f12071b = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    C7670m c7670m = (C7670m) this.f12071b;
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.f12070a != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    ViewFragmentBoardBinding viewFragmentBoardBinding = this.f12072c.mBinding;
                    if (viewFragmentBoardBinding == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                        viewFragmentBoardBinding = null;
                    }
                    viewFragmentBoardBinding.f12630m.setImageResource(c7670m.m11410b().m11411a());
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass10(BoardFragment boardFragment, Continuation continuation) {
                super(2, continuation);
                this.f12069b = boardFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new AnonymousClass10(this.f12069b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return invoke2(coroutineScope, (Continuation) continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i9 = this.f12068a;
                if (i9 == 0) {
                    ResultKt.throwOnFailure(obj);
                    StateFlow expandState = this.f12069b.m11209r0().getExpandState();
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f12069b, null);
                    this.f12068a = 1;
                    if (FlowKt.collectLatest(expandState, anonymousClass1, this) == coroutine_suspended) {
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
                return ((AnonymousClass10) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        @Metadata(m13412d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13413d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13414k = 3, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
        @DebugMetadata(m13450c = "com.zykj.view.board.board.BoardFragment$initObserver$1$1$11", m13451f = "BoardFragment.kt", m13452i = {}, m13453l = {754}, m13454m = "invokeSuspend", m13455n = {}, m13456s = {})
        /* renamed from: com.zykj.view.board.board.BoardFragment$initObserver$1$1$11, reason: invalid class name */
        public static final class AnonymousClass11 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* renamed from: a */
            public int f12073a;

            /* renamed from: b */
            public final /* synthetic */ BoardFragment f12074b;

            @Metadata(m13412d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m13413d2 = {"Lcom/zykj/view/board/board/x;", "record", "", "<anonymous>", "(Lcom/zykj/view/board/board/x;)V"}, m13414k = 3, m13415mv = {2, 2, 0})
            @DebugMetadata(m13450c = "com.zykj.view.board.board.BoardFragment$initObserver$1$1$11$1", m13451f = "BoardFragment.kt", m13452i = {}, m13453l = {}, m13454m = "invokeSuspend", m13455n = {}, m13456s = {})
            @SourceDebugExtension({"SMAP\nBoardFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BoardFragment.kt\ncom/zykj/view/board/board/BoardFragment$initObserver$1$1$11$1\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,1030:1\n257#2,2:1031\n257#2,2:1033\n257#2,2:1035\n*S KotlinDebug\n*F\n+ 1 BoardFragment.kt\ncom/zykj/view/board/board/BoardFragment$initObserver$1$1$11$1\n*L\n762#1:1031,2\n764#1:1033,2\n766#1:1035,2\n*E\n"})
            /* renamed from: com.zykj.view.board.board.BoardFragment$initObserver$1$1$11$1, reason: invalid class name */
            public static final class AnonymousClass1 extends SuspendLambda implements Function2<C7681x, Continuation<? super Unit>, Object> {

                /* renamed from: a */
                public int f12075a;

                /* renamed from: b */
                public /* synthetic */ Object f12076b;

                /* renamed from: c */
                public final /* synthetic */ BoardFragment f12077c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(BoardFragment boardFragment, Continuation continuation) {
                    super(2, continuation);
                    this.f12077c = boardFragment;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(C7681x c7681x, Continuation continuation) {
                    return ((AnonymousClass1) create(c7681x, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation create(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f12077c, continuation);
                    anonymousClass1.f12076b = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    C7681x c7681x = (C7681x) this.f12076b;
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.f12075a != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    ViewFragmentBoardBinding viewFragmentBoardBinding = this.f12077c.mBinding;
                    if (viewFragmentBoardBinding == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                        viewFragmentBoardBinding = null;
                    }
                    ViewItemSketchRecordAudioBinding viewItemSketchRecordAudioBinding = viewFragmentBoardBinding.f12627j;
                    viewItemSketchRecordAudioBinding.f12791b.setImageResource(c7681x.m11470d().m11472a());
                    viewItemSketchRecordAudioBinding.f12790a.setSelected(c7681x.m11471e());
                    viewItemSketchRecordAudioBinding.f12798i.setText(c7681x.m11469c());
                    LinearLayoutCompat llCrop = viewItemSketchRecordAudioBinding.f12792c;
                    Intrinsics.checkNotNullExpressionValue(llCrop, "llCrop");
                    llCrop.setVisibility(c7681x.m11470d().m11473b() ? 0 : 8);
                    LinearLayoutCompat llOption = viewItemSketchRecordAudioBinding.f12794e;
                    Intrinsics.checkNotNullExpressionValue(llOption, "llOption");
                    llOption.setVisibility(c7681x.m11470d().m11474c() ? 0 : 8);
                    LinearLayoutCompat llRecord = viewItemSketchRecordAudioBinding.f12796g;
                    Intrinsics.checkNotNullExpressionValue(llRecord, "llRecord");
                    llRecord.setVisibility(c7681x.m11470d().m11475d() ? 0 : 8);
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass11(BoardFragment boardFragment, Continuation continuation) {
                super(2, continuation);
                this.f12074b = boardFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new AnonymousClass11(this.f12074b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return invoke2(coroutineScope, (Continuation) continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i9 = this.f12073a;
                if (i9 == 0) {
                    ResultKt.throwOnFailure(obj);
                    StateFlow recordState = this.f12074b.m11209r0().getRecordState();
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f12074b, null);
                    this.f12073a = 1;
                    if (FlowKt.collectLatest(recordState, anonymousClass1, this) == coroutine_suspended) {
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
                return ((AnonymousClass11) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        @Metadata(m13412d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13413d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13414k = 3, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
        @DebugMetadata(m13450c = "com.zykj.view.board.board.BoardFragment$initObserver$1$1$2", m13451f = "BoardFragment.kt", m13452i = {}, m13453l = {TypedValues.MotionType.TYPE_QUANTIZE_INTERPOLATOR_TYPE}, m13454m = "invokeSuspend", m13455n = {}, m13456s = {})
        /* renamed from: com.zykj.view.board.board.BoardFragment$initObserver$1$1$2, reason: invalid class name */
        public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* renamed from: a */
            public int f12078a;

            /* renamed from: b */
            public final /* synthetic */ BoardFragment f12079b;

            @Metadata(m13412d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m13413d2 = {"Lcom/zykj/view/board/board/r;", "state", "", "<anonymous>", "(Lcom/zykj/view/board/board/r;)V"}, m13414k = 3, m13415mv = {2, 2, 0})
            @DebugMetadata(m13450c = "com.zykj.view.board.board.BoardFragment$initObserver$1$1$2$1", m13451f = "BoardFragment.kt", m13452i = {}, m13453l = {}, m13454m = "invokeSuspend", m13455n = {}, m13456s = {})
            @SourceDebugExtension({"SMAP\nBoardFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BoardFragment.kt\ncom/zykj/view/board/board/BoardFragment$initObserver$1$1$2$1\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,1030:1\n257#2,2:1031\n257#2,2:1033\n257#2,2:1035\n257#2,2:1037\n*S KotlinDebug\n*F\n+ 1 BoardFragment.kt\ncom/zykj/view/board/board/BoardFragment$initObserver$1$1$2$1\n*L\n613#1:1031,2\n614#1:1033,2\n615#1:1035,2\n616#1:1037,2\n*E\n"})
            /* renamed from: com.zykj.view.board.board.BoardFragment$initObserver$1$1$2$1, reason: invalid class name */
            public static final class AnonymousClass1 extends SuspendLambda implements Function2<C7675r, Continuation<? super Unit>, Object> {

                /* renamed from: a */
                public int f12080a;

                /* renamed from: b */
                public /* synthetic */ Object f12081b;

                /* renamed from: c */
                public final /* synthetic */ BoardFragment f12082c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(BoardFragment boardFragment, Continuation continuation) {
                    super(2, continuation);
                    this.f12082c = boardFragment;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(C7675r c7675r, Continuation continuation) {
                    return ((AnonymousClass1) create(c7675r, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation create(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f12082c, continuation);
                    anonymousClass1.f12081b = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    C7675r c7675r = (C7675r) this.f12081b;
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.f12080a != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    ViewFragmentBoardBinding viewFragmentBoardBinding = this.f12082c.mBinding;
                    if (viewFragmentBoardBinding == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                        viewFragmentBoardBinding = null;
                    }
                    ViewIncludeMenuBinding viewIncludeMenuBinding = viewFragmentBoardBinding.f12625h;
                    AppCompatImageView ivWithdraw = viewIncludeMenuBinding.f12744k;
                    Intrinsics.checkNotNullExpressionValue(ivWithdraw, "ivWithdraw");
                    ivWithdraw.setVisibility(c7675r.m11437d() ? 0 : 8);
                    AppCompatImageView ivRecover = viewIncludeMenuBinding.f12740g;
                    Intrinsics.checkNotNullExpressionValue(ivRecover, "ivRecover");
                    ivRecover.setVisibility(c7675r.m11437d() ? 0 : 8);
                    AppCompatImageView ivEnlarge = viewIncludeMenuBinding.f12736c;
                    Intrinsics.checkNotNullExpressionValue(ivEnlarge, "ivEnlarge");
                    ivEnlarge.setVisibility(c7675r.m11438e() ? 0 : 8);
                    AppCompatImageView ivReduce = viewIncludeMenuBinding.f12741h;
                    Intrinsics.checkNotNullExpressionValue(ivReduce, "ivReduce");
                    ivReduce.setVisibility(c7675r.m11438e() ? 0 : 8);
                    viewIncludeMenuBinding.f12744k.setEnabled(c7675r.m11441h());
                    viewIncludeMenuBinding.f12740g.setEnabled(c7675r.m11439f());
                    viewIncludeMenuBinding.f12743j.setSelected(c7675r.m11440g());
                    viewIncludeMenuBinding.f12742i.setSelected(c7675r.m11436c().m11445d());
                    viewIncludeMenuBinding.f12739f.setSelected(c7675r.m11436c().m11444c());
                    viewIncludeMenuBinding.f12737d.setSelected(c7675r.m11436c().m11442a());
                    viewIncludeMenuBinding.f12738e.setSelected(c7675r.m11436c().m11443b());
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(BoardFragment boardFragment, Continuation continuation) {
                super(2, continuation);
                this.f12079b = boardFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new AnonymousClass2(this.f12079b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return invoke2(coroutineScope, (Continuation) continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i9 = this.f12078a;
                if (i9 == 0) {
                    ResultKt.throwOnFailure(obj);
                    StateFlow mainToolState = this.f12079b.m11209r0().getMainToolState();
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f12079b, null);
                    this.f12078a = 1;
                    if (FlowKt.collectLatest(mainToolState, anonymousClass1, this) == coroutine_suspended) {
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

        @Metadata(m13412d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13413d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13414k = 3, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
        @DebugMetadata(m13450c = "com.zykj.view.board.board.BoardFragment$initObserver$1$1$3", m13451f = "BoardFragment.kt", m13452i = {}, m13453l = {633}, m13454m = "invokeSuspend", m13455n = {}, m13456s = {})
        /* renamed from: com.zykj.view.board.board.BoardFragment$initObserver$1$1$3, reason: invalid class name */
        public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* renamed from: a */
            public int f12083a;

            /* renamed from: b */
            public final /* synthetic */ BoardFragment f12084b;

            @Metadata(m13412d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m13413d2 = {"Lb7/f2;", "state", "", "<anonymous>", "(Lb7/f2;)V"}, m13414k = 3, m13415mv = {2, 2, 0})
            @DebugMetadata(m13450c = "com.zykj.view.board.board.BoardFragment$initObserver$1$1$3$1", m13451f = "BoardFragment.kt", m13452i = {}, m13453l = {}, m13454m = "invokeSuspend", m13455n = {}, m13456s = {})
            /* renamed from: com.zykj.view.board.board.BoardFragment$initObserver$1$1$3$1, reason: invalid class name */
            public static final class AnonymousClass1 extends SuspendLambda implements Function2<C5145f2, Continuation<? super Unit>, Object> {

                /* renamed from: a */
                public int f12085a;

                /* renamed from: b */
                public /* synthetic */ Object f12086b;

                /* renamed from: c */
                public final /* synthetic */ BoardFragment f12087c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(BoardFragment boardFragment, Continuation continuation) {
                    super(2, continuation);
                    this.f12087c = boardFragment;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(C5145f2 c5145f2, Continuation continuation) {
                    return ((AnonymousClass1) create(c5145f2, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation create(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f12087c, continuation);
                    anonymousClass1.f12086b = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    C5145f2 c5145f2 = (C5145f2) this.f12086b;
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.f12085a != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    ViewFragmentBoardBinding viewFragmentBoardBinding = this.f12087c.mBinding;
                    if (viewFragmentBoardBinding == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                        viewFragmentBoardBinding = null;
                    }
                    ViewIncludeSelectTypeBinding viewIncludeSelectTypeBinding = viewFragmentBoardBinding.f12628k;
                    viewIncludeSelectTypeBinding.f12773d.setSelected(c5145f2.m2235e());
                    viewIncludeSelectTypeBinding.f12771b.setSelected(c5145f2.m2233c());
                    viewIncludeSelectTypeBinding.f12772c.setSelected(c5145f2.m2234d());
                    viewIncludeSelectTypeBinding.f12774e.setSelected(c5145f2.m2236f());
                    viewIncludeSelectTypeBinding.f12770a.setSelected(c5145f2.m2232b());
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass3(BoardFragment boardFragment, Continuation continuation) {
                super(2, continuation);
                this.f12084b = boardFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new AnonymousClass3(this.f12084b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return invoke2(coroutineScope, (Continuation) continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i9 = this.f12083a;
                if (i9 == 0) {
                    ResultKt.throwOnFailure(obj);
                    StateFlow selectToolState = this.f12084b.m11209r0().getSelectToolState();
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f12084b, null);
                    this.f12083a = 1;
                    if (FlowKt.collectLatest(selectToolState, anonymousClass1, this) == coroutine_suspended) {
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
                return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        @Metadata(m13412d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13413d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13414k = 3, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
        @DebugMetadata(m13450c = "com.zykj.view.board.board.BoardFragment$initObserver$1$1$4", m13451f = "BoardFragment.kt", m13452i = {}, m13453l = {646}, m13454m = "invokeSuspend", m13455n = {}, m13456s = {})
        /* renamed from: com.zykj.view.board.board.BoardFragment$initObserver$1$1$4, reason: invalid class name */
        public static final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* renamed from: a */
            public int f12088a;

            /* renamed from: b */
            public final /* synthetic */ BoardFragment f12089b;

            @Metadata(m13412d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m13413d2 = {"Lcom/zykj/view/board/board/v;", "state", "", "<anonymous>", "(Lcom/zykj/view/board/board/v;)V"}, m13414k = 3, m13415mv = {2, 2, 0})
            @DebugMetadata(m13450c = "com.zykj.view.board.board.BoardFragment$initObserver$1$1$4$1", m13451f = "BoardFragment.kt", m13452i = {}, m13453l = {}, m13454m = "invokeSuspend", m13455n = {}, m13456s = {})
            @SourceDebugExtension({"SMAP\nBoardFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BoardFragment.kt\ncom/zykj/view/board/board/BoardFragment$initObserver$1$1$4$1\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,1030:1\n257#2,2:1031\n257#2,2:1033\n*S KotlinDebug\n*F\n+ 1 BoardFragment.kt\ncom/zykj/view/board/board/BoardFragment$initObserver$1$1$4$1\n*L\n648#1:1031,2\n649#1:1033,2\n*E\n"})
            /* renamed from: com.zykj.view.board.board.BoardFragment$initObserver$1$1$4$1, reason: invalid class name */
            public static final class AnonymousClass1 extends SuspendLambda implements Function2<C7679v, Continuation<? super Unit>, Object> {

                /* renamed from: a */
                public int f12090a;

                /* renamed from: b */
                public /* synthetic */ Object f12091b;

                /* renamed from: c */
                public final /* synthetic */ BoardFragment f12092c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(BoardFragment boardFragment, Continuation continuation) {
                    super(2, continuation);
                    this.f12092c = boardFragment;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(C7679v c7679v, Continuation continuation) {
                    return ((AnonymousClass1) create(c7679v, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation create(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f12092c, continuation);
                    anonymousClass1.f12091b = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    C7679v c7679v = (C7679v) this.f12091b;
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.f12090a != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    ViewFragmentBoardBinding viewFragmentBoardBinding = this.f12092c.mBinding;
                    if (viewFragmentBoardBinding == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                        viewFragmentBoardBinding = null;
                    }
                    ViewIncludePenBinding viewIncludePenBinding = viewFragmentBoardBinding.f12626i;
                    RadioButton rbPenDottedLine = viewIncludePenBinding.f12752d;
                    Intrinsics.checkNotNullExpressionValue(rbPenDottedLine, "rbPenDottedLine");
                    rbPenDottedLine.setVisibility(c7679v.m11455c() ? 0 : 8);
                    RadioButton rbPenHighlighter = viewIncludePenBinding.f12753e;
                    Intrinsics.checkNotNullExpressionValue(rbPenHighlighter, "rbPenHighlighter");
                    rbPenHighlighter.setVisibility(c7679v.m11456d() ? 0 : 8);
                    RadioGroup rgPenType = viewIncludePenBinding.f12760l;
                    Intrinsics.checkNotNullExpressionValue(rgPenType, "rgPenType");
                    AbstractC9026c.m14388a(rgPenType, c7679v.m11460h().m11463b());
                    RadioGroup rgPenSize = viewIncludePenBinding.f12759k;
                    Intrinsics.checkNotNullExpressionValue(rgPenSize, "rgPenSize");
                    AbstractC9026c.m14388a(rgPenSize, c7679v.m11459g());
                    RadioGroup rgPenColor = viewIncludePenBinding.f12758j;
                    Intrinsics.checkNotNullExpressionValue(rgPenColor, "rgPenColor");
                    AbstractC9026c.m14388a(rgPenColor, c7679v.m11457e().m11452b());
                    viewIncludePenBinding.f12749a.setColor(c7679v.m11458f());
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass4(BoardFragment boardFragment, Continuation continuation) {
                super(2, continuation);
                this.f12089b = boardFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new AnonymousClass4(this.f12089b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return invoke2(coroutineScope, (Continuation) continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i9 = this.f12088a;
                if (i9 == 0) {
                    ResultKt.throwOnFailure(obj);
                    StateFlow penToolState = this.f12089b.m11209r0().getPenToolState();
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f12089b, null);
                    this.f12088a = 1;
                    if (FlowKt.collectLatest(penToolState, anonymousClass1, this) == coroutine_suspended) {
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
                return ((AnonymousClass4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        @Metadata(m13412d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13413d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13414k = 3, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
        @DebugMetadata(m13450c = "com.zykj.view.board.board.BoardFragment$initObserver$1$1$5", m13451f = "BoardFragment.kt", m13452i = {}, m13453l = {667}, m13454m = "invokeSuspend", m13455n = {}, m13456s = {})
        /* renamed from: com.zykj.view.board.board.BoardFragment$initObserver$1$1$5, reason: invalid class name */
        public static final class AnonymousClass5 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* renamed from: a */
            public int f12093a;

            /* renamed from: b */
            public final /* synthetic */ BoardFragment f12094b;

            @Metadata(m13412d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m13413d2 = {"Lcom/zykj/view/board/board/o;", "extraUIState", "Lcom/zykj/view/board/board/v;", "penToolState", "", "<anonymous>", "(Lcom/zykj/view/board/board/o;Lcom/zykj/view/board/board/v;)Z"}, m13414k = 3, m13415mv = {2, 2, 0})
            @DebugMetadata(m13450c = "com.zykj.view.board.board.BoardFragment$initObserver$1$1$5$1", m13451f = "BoardFragment.kt", m13452i = {}, m13453l = {}, m13454m = "invokeSuspend", m13455n = {}, m13456s = {})
            /* renamed from: com.zykj.view.board.board.BoardFragment$initObserver$1$1$5$1, reason: invalid class name */
            public static final class AnonymousClass1 extends SuspendLambda implements Function3<C7672o, C7679v, Continuation<? super Boolean>, Object> {

                /* renamed from: a */
                public int f12095a;

                /* renamed from: b */
                public /* synthetic */ Object f12096b;

                /* renamed from: c */
                public /* synthetic */ Object f12097c;

                public AnonymousClass1(Continuation continuation) {
                    super(3, continuation);
                }

                @Override // kotlin.jvm.functions.Function3
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(C7672o c7672o, C7679v c7679v, Continuation continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation);
                    anonymousClass1.f12096b = c7672o;
                    anonymousClass1.f12097c = c7679v;
                    return anonymousClass1.invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    C7672o c7672o = (C7672o) this.f12096b;
                    C7679v c7679v = (C7679v) this.f12097c;
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.f12095a != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return Boxing.boxBoolean(c7672o.m11417f().m11449d() && c7679v.m11461i());
                }
            }

            @Metadata(m13412d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m13413d2 = {"<anonymous>", "", "isShow", ""}, m13414k = 3, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
            @DebugMetadata(m13450c = "com.zykj.view.board.board.BoardFragment$initObserver$1$1$5$2", m13451f = "BoardFragment.kt", m13452i = {}, m13453l = {}, m13454m = "invokeSuspend", m13455n = {}, m13456s = {})
            @SourceDebugExtension({"SMAP\nBoardFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BoardFragment.kt\ncom/zykj/view/board/board/BoardFragment$initObserver$1$1$5$2\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,1030:1\n257#2,2:1031\n*S KotlinDebug\n*F\n+ 1 BoardFragment.kt\ncom/zykj/view/board/board/BoardFragment$initObserver$1$1$5$2\n*L\n668#1:1031,2\n*E\n"})
            /* renamed from: com.zykj.view.board.board.BoardFragment$initObserver$1$1$5$2, reason: invalid class name */
            public static final class AnonymousClass2 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {

                /* renamed from: a */
                public int f12098a;

                /* renamed from: b */
                public /* synthetic */ boolean f12099b;

                /* renamed from: c */
                public final /* synthetic */ BoardFragment f12100c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass2(BoardFragment boardFragment, Continuation continuation) {
                    super(2, continuation);
                    this.f12100c = boardFragment;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation create(Object obj, Continuation continuation) {
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.f12100c, continuation);
                    anonymousClass2.f12099b = ((Boolean) obj).booleanValue();
                    return anonymousClass2;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
                    return invoke(bool.booleanValue(), continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    boolean z9 = this.f12099b;
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.f12098a != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    ViewFragmentBoardBinding viewFragmentBoardBinding = this.f12100c.mBinding;
                    ViewFragmentBoardBinding viewFragmentBoardBinding2 = null;
                    if (viewFragmentBoardBinding == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                        viewFragmentBoardBinding = null;
                    }
                    CustomColorFrameLayout flCustomColor = viewFragmentBoardBinding.f12619b;
                    Intrinsics.checkNotNullExpressionValue(flCustomColor, "flCustomColor");
                    flCustomColor.setVisibility(z9 ? 0 : 8);
                    if (z9) {
                        ViewFragmentBoardBinding viewFragmentBoardBinding3 = this.f12100c.mBinding;
                        if (viewFragmentBoardBinding3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                        } else {
                            viewFragmentBoardBinding2 = viewFragmentBoardBinding3;
                        }
                        viewFragmentBoardBinding2.f12619b.m12058c();
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
                this.f12094b = boardFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new AnonymousClass5(this.f12094b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return invoke2(coroutineScope, (Continuation) continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i9 = this.f12093a;
                if (i9 == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(FlowKt.combine(this.f12094b.m11209r0().getExtraUIState(), this.f12094b.m11209r0().getPenToolState(), new AnonymousClass1(null)));
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.f12094b, null);
                    this.f12093a = 1;
                    if (FlowKt.collectLatest(flowDistinctUntilChanged, anonymousClass2, this) == coroutine_suspended) {
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
                return ((AnonymousClass5) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        @Metadata(m13412d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13413d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13414k = 3, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
        @DebugMetadata(m13450c = "com.zykj.view.board.board.BoardFragment$initObserver$1$1$6", m13451f = "BoardFragment.kt", m13452i = {}, m13453l = {679}, m13454m = "invokeSuspend", m13455n = {}, m13456s = {})
        /* renamed from: com.zykj.view.board.board.BoardFragment$initObserver$1$1$6, reason: invalid class name */
        public static final class AnonymousClass6 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* renamed from: a */
            public int f12101a;

            /* renamed from: b */
            public final /* synthetic */ BoardFragment f12102b;

            @Metadata(m13412d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m13413d2 = {"Lcom/zykj/view/board/board/k;", "state", "", "<anonymous>", "(Lcom/zykj/view/board/board/k;)V"}, m13414k = 3, m13415mv = {2, 2, 0})
            @DebugMetadata(m13450c = "com.zykj.view.board.board.BoardFragment$initObserver$1$1$6$1", m13451f = "BoardFragment.kt", m13452i = {}, m13453l = {}, m13454m = "invokeSuspend", m13455n = {}, m13456s = {})
            /* renamed from: com.zykj.view.board.board.BoardFragment$initObserver$1$1$6$1, reason: invalid class name */
            public static final class AnonymousClass1 extends SuspendLambda implements Function2<C7668k, Continuation<? super Unit>, Object> {

                /* renamed from: a */
                public int f12103a;

                /* renamed from: b */
                public /* synthetic */ Object f12104b;

                /* renamed from: c */
                public final /* synthetic */ BoardFragment f12105c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(BoardFragment boardFragment, Continuation continuation) {
                    super(2, continuation);
                    this.f12105c = boardFragment;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(C7668k c7668k, Continuation continuation) {
                    return ((AnonymousClass1) create(c7668k, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation create(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f12105c, continuation);
                    anonymousClass1.f12104b = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    C7668k c7668k = (C7668k) this.f12104b;
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.f12103a != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    ViewFragmentBoardBinding viewFragmentBoardBinding = this.f12105c.mBinding;
                    if (viewFragmentBoardBinding == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                        viewFragmentBoardBinding = null;
                    }
                    RadioGroup rgEraserSize = viewFragmentBoardBinding.f12623f.f12703d;
                    Intrinsics.checkNotNullExpressionValue(rgEraserSize, "rgEraserSize");
                    AbstractC9026c.m14388a(rgEraserSize, c7668k.m11406b().m11407a());
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass6(BoardFragment boardFragment, Continuation continuation) {
                super(2, continuation);
                this.f12102b = boardFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new AnonymousClass6(this.f12102b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return invoke2(coroutineScope, (Continuation) continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i9 = this.f12101a;
                if (i9 == 0) {
                    ResultKt.throwOnFailure(obj);
                    StateFlow eraserToolState = this.f12102b.m11209r0().getEraserToolState();
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f12102b, null);
                    this.f12101a = 1;
                    if (FlowKt.collectLatest(eraserToolState, anonymousClass1, this) == coroutine_suspended) {
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
                return ((AnonymousClass6) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        @Metadata(m13412d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13413d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13414k = 3, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
        @DebugMetadata(m13450c = "com.zykj.view.board.board.BoardFragment$initObserver$1$1$7", m13451f = "BoardFragment.kt", m13452i = {}, m13453l = {688}, m13454m = "invokeSuspend", m13455n = {}, m13456s = {})
        /* renamed from: com.zykj.view.board.board.BoardFragment$initObserver$1$1$7, reason: invalid class name */
        public static final class AnonymousClass7 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* renamed from: a */
            public int f12106a;

            /* renamed from: b */
            public final /* synthetic */ BoardFragment f12107b;

            @Metadata(m13412d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m13413d2 = {"Lcom/zykj/view/board/board/p;", "state", "", "<anonymous>", "(Lcom/zykj/view/board/board/p;)V"}, m13414k = 3, m13415mv = {2, 2, 0})
            @DebugMetadata(m13450c = "com.zykj.view.board.board.BoardFragment$initObserver$1$1$7$1", m13451f = "BoardFragment.kt", m13452i = {}, m13453l = {}, m13454m = "invokeSuspend", m13455n = {}, m13456s = {})
            @SourceDebugExtension({"SMAP\nBoardFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BoardFragment.kt\ncom/zykj/view/board/board/BoardFragment$initObserver$1$1$7$1\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,1030:1\n257#2,2:1031\n257#2,2:1033\n257#2,2:1035\n257#2,2:1037\n257#2,2:1039\n257#2,2:1041\n*S KotlinDebug\n*F\n+ 1 BoardFragment.kt\ncom/zykj/view/board/board/BoardFragment$initObserver$1$1$7$1\n*L\n690#1:1031,2\n691#1:1033,2\n692#1:1035,2\n693#1:1037,2\n694#1:1039,2\n695#1:1041,2\n*E\n"})
            /* renamed from: com.zykj.view.board.board.BoardFragment$initObserver$1$1$7$1, reason: invalid class name */
            public static final class AnonymousClass1 extends SuspendLambda implements Function2<C7673p, Continuation<? super Unit>, Object> {

                /* renamed from: a */
                public int f12108a;

                /* renamed from: b */
                public /* synthetic */ Object f12109b;

                /* renamed from: c */
                public final /* synthetic */ BoardFragment f12110c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(BoardFragment boardFragment, Continuation continuation) {
                    super(2, continuation);
                    this.f12110c = boardFragment;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(C7673p c7673p, Continuation continuation) {
                    return ((AnonymousClass1) create(c7673p, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation create(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f12110c, continuation);
                    anonymousClass1.f12109b = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    C7673p c7673p = (C7673p) this.f12109b;
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.f12108a != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    ViewFragmentBoardBinding viewFragmentBoardBinding = this.f12110c.mBinding;
                    if (viewFragmentBoardBinding == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                        viewFragmentBoardBinding = null;
                    }
                    ViewIncludeImageAddBinding viewIncludeImageAddBinding = viewFragmentBoardBinding.f12624g;
                    AppCompatImageView ivImageCamera = viewIncludeImageAddBinding.f12724a;
                    Intrinsics.checkNotNullExpressionValue(ivImageCamera, "ivImageCamera");
                    ivImageCamera.setVisibility(c7673p.m11425c() ? 0 : 8);
                    AppCompatImageView ivImageGallery = viewIncludeImageAddBinding.f12725b;
                    Intrinsics.checkNotNullExpressionValue(ivImageGallery, "ivImageGallery");
                    ivImageGallery.setVisibility(c7673p.m11426d() ? 0 : 8);
                    AppCompatImageView ivText = viewIncludeImageAddBinding.f12728e;
                    Intrinsics.checkNotNullExpressionValue(ivText, "ivText");
                    ivText.setVisibility(c7673p.m11429g() ? 0 : 8);
                    AppCompatImageView ivRectangle = viewIncludeImageAddBinding.f12727d;
                    Intrinsics.checkNotNullExpressionValue(ivRectangle, "ivRectangle");
                    ivRectangle.setVisibility(c7673p.m11428f() ? 0 : 8);
                    AppCompatImageView ivOval = viewIncludeImageAddBinding.f12726c;
                    Intrinsics.checkNotNullExpressionValue(ivOval, "ivOval");
                    ivOval.setVisibility(c7673p.m11428f() ? 0 : 8);
                    ImageView ivTriangle = viewIncludeImageAddBinding.f12729f;
                    Intrinsics.checkNotNullExpressionValue(ivTriangle, "ivTriangle");
                    ivTriangle.setVisibility(c7673p.m11428f() ? 0 : 8);
                    viewIncludeImageAddBinding.f12727d.setSelected(c7673p.m11427e().m11432c());
                    viewIncludeImageAddBinding.f12726c.setSelected(c7673p.m11427e().m11431b());
                    viewIncludeImageAddBinding.f12729f.setSelected(c7673p.m11427e().m11433d());
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass7(BoardFragment boardFragment, Continuation continuation) {
                super(2, continuation);
                this.f12107b = boardFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new AnonymousClass7(this.f12107b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return invoke2(coroutineScope, (Continuation) continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i9 = this.f12106a;
                if (i9 == 0) {
                    ResultKt.throwOnFailure(obj);
                    StateFlow graphToolState = this.f12107b.m11209r0().getGraphToolState();
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f12107b, null);
                    this.f12106a = 1;
                    if (FlowKt.collectLatest(graphToolState, anonymousClass1, this) == coroutine_suspended) {
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
                return ((AnonymousClass7) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        @Metadata(m13412d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13413d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13414k = 3, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
        @DebugMetadata(m13450c = "com.zykj.view.board.board.BoardFragment$initObserver$1$1$8", m13451f = "BoardFragment.kt", m13452i = {}, m13453l = {TypedValues.TransitionType.TYPE_STAGGERED}, m13454m = "invokeSuspend", m13455n = {}, m13456s = {})
        /* renamed from: com.zykj.view.board.board.BoardFragment$initObserver$1$1$8, reason: invalid class name */
        public static final class AnonymousClass8 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* renamed from: a */
            public int f12111a;

            /* renamed from: b */
            public final /* synthetic */ BoardFragment f12112b;

            @Metadata(m13412d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m13413d2 = {"Lcom/zykj/view/board/board/a;", "state", "", "<anonymous>", "(Lcom/zykj/view/board/board/a;)V"}, m13414k = 3, m13415mv = {2, 2, 0})
            @DebugMetadata(m13450c = "com.zykj.view.board.board.BoardFragment$initObserver$1$1$8$1", m13451f = "BoardFragment.kt", m13452i = {}, m13453l = {}, m13454m = "invokeSuspend", m13455n = {}, m13456s = {})
            @SourceDebugExtension({"SMAP\nBoardFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BoardFragment.kt\ncom/zykj/view/board/board/BoardFragment$initObserver$1$1$8$1\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,1030:1\n257#2,2:1031\n257#2,2:1033\n*S KotlinDebug\n*F\n+ 1 BoardFragment.kt\ncom/zykj/view/board/board/BoardFragment$initObserver$1$1$8$1\n*L\n708#1:1031,2\n709#1:1033,2\n*E\n"})
            /* renamed from: com.zykj.view.board.board.BoardFragment$initObserver$1$1$8$1, reason: invalid class name */
            public static final class AnonymousClass1 extends SuspendLambda implements Function2<C7658a, Continuation<? super Unit>, Object> {

                /* renamed from: a */
                public int f12113a;

                /* renamed from: b */
                public /* synthetic */ Object f12114b;

                /* renamed from: c */
                public final /* synthetic */ BoardFragment f12115c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(BoardFragment boardFragment, Continuation continuation) {
                    super(2, continuation);
                    this.f12115c = boardFragment;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(C7658a c7658a, Continuation continuation) {
                    return ((AnonymousClass1) create(c7658a, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation create(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f12115c, continuation);
                    anonymousClass1.f12114b = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    C7658a c7658a = (C7658a) this.f12114b;
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.f12113a != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    ViewFragmentBoardBinding viewFragmentBoardBinding = this.f12115c.mBinding;
                    if (viewFragmentBoardBinding == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                        viewFragmentBoardBinding = null;
                    }
                    ViewIncludeBackgroundColorBinding viewIncludeBackgroundColorBinding = viewFragmentBoardBinding.f12621d;
                    WithSelectedRadioButton rbBackgroundLine = viewIncludeBackgroundColorBinding.f12686e;
                    Intrinsics.checkNotNullExpressionValue(rbBackgroundLine, "rbBackgroundLine");
                    rbBackgroundLine.setVisibility(c7658a.m11379c() ? 0 : 8);
                    WithSelectedRadioButton rbBackgroundInterweave = viewIncludeBackgroundColorBinding.f12685d;
                    Intrinsics.checkNotNullExpressionValue(rbBackgroundInterweave, "rbBackgroundInterweave");
                    rbBackgroundInterweave.setVisibility(c7658a.m11379c() ? 0 : 8);
                    RadioGroup rgBackgroundColor = viewIncludeBackgroundColorBinding.f12688g;
                    Intrinsics.checkNotNullExpressionValue(rgBackgroundColor, "rgBackgroundColor");
                    AbstractC9026c.m14388a(rgBackgroundColor, c7658a.m11380d().m11385e());
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass8(BoardFragment boardFragment, Continuation continuation) {
                super(2, continuation);
                this.f12112b = boardFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new AnonymousClass8(this.f12112b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return invoke2(coroutineScope, (Continuation) continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i9 = this.f12111a;
                if (i9 == 0) {
                    ResultKt.throwOnFailure(obj);
                    StateFlow backgroundToolState = this.f12112b.m11209r0().getBackgroundToolState();
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f12112b, null);
                    this.f12111a = 1;
                    if (FlowKt.collectLatest(backgroundToolState, anonymousClass1, this) == coroutine_suspended) {
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
                return ((AnonymousClass8) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        @Metadata(m13412d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13413d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13414k = 3, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
        @DebugMetadata(m13450c = "com.zykj.view.board.board.BoardFragment$initObserver$1$1$9", m13451f = "BoardFragment.kt", m13452i = {}, m13453l = {717}, m13454m = "invokeSuspend", m13455n = {}, m13456s = {})
        /* renamed from: com.zykj.view.board.board.BoardFragment$initObserver$1$1$9, reason: invalid class name */
        public static final class AnonymousClass9 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* renamed from: a */
            public int f12116a;

            /* renamed from: b */
            public final /* synthetic */ BoardFragment f12117b;

            @Metadata(m13412d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m13413d2 = {"Lcom/zykj/view/board/board/o;", "state", "", "<anonymous>", "(Lcom/zykj/view/board/board/o;)V"}, m13414k = 3, m13415mv = {2, 2, 0})
            @DebugMetadata(m13450c = "com.zykj.view.board.board.BoardFragment$initObserver$1$1$9$1", m13451f = "BoardFragment.kt", m13452i = {}, m13453l = {}, m13454m = "invokeSuspend", m13455n = {}, m13456s = {})
            @SourceDebugExtension({"SMAP\nBoardFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BoardFragment.kt\ncom/zykj/view/board/board/BoardFragment$initObserver$1$1$9$1\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,1030:1\n257#2,2:1031\n257#2,2:1033\n257#2,2:1035\n257#2,2:1037\n257#2,2:1039\n257#2,2:1041\n257#2,2:1043\n257#2,2:1045\n*S KotlinDebug\n*F\n+ 1 BoardFragment.kt\ncom/zykj/view/board/board/BoardFragment$initObserver$1$1$9$1\n*L\n718#1:1031,2\n719#1:1033,2\n720#1:1035,2\n721#1:1037,2\n722#1:1039,2\n725#1:1041,2\n727#1:1043,2\n730#1:1045,2\n*E\n"})
            /* renamed from: com.zykj.view.board.board.BoardFragment$initObserver$1$1$9$1, reason: invalid class name */
            public static final class AnonymousClass1 extends SuspendLambda implements Function2<C7672o, Continuation<? super Unit>, Object> {

                /* renamed from: a */
                public int f12118a;

                /* renamed from: b */
                public /* synthetic */ Object f12119b;

                /* renamed from: c */
                public final /* synthetic */ BoardFragment f12120c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(BoardFragment boardFragment, Continuation continuation) {
                    super(2, continuation);
                    this.f12120c = boardFragment;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(C7672o c7672o, Continuation continuation) {
                    return ((AnonymousClass1) create(c7672o, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation create(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f12120c, continuation);
                    anonymousClass1.f12119b = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    C7672o c7672o = (C7672o) this.f12119b;
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.f12118a != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    ViewFragmentBoardBinding viewFragmentBoardBinding = this.f12120c.mBinding;
                    ViewFragmentBoardBinding viewFragmentBoardBinding2 = null;
                    if (viewFragmentBoardBinding == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                        viewFragmentBoardBinding = null;
                    }
                    View root = viewFragmentBoardBinding.f12628k.getRoot();
                    Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
                    root.setVisibility(c7672o.m11417f().m11450e() ? 0 : 8);
                    ViewFragmentBoardBinding viewFragmentBoardBinding3 = this.f12120c.mBinding;
                    if (viewFragmentBoardBinding3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                        viewFragmentBoardBinding3 = null;
                    }
                    View root2 = viewFragmentBoardBinding3.f12626i.getRoot();
                    Intrinsics.checkNotNullExpressionValue(root2, "getRoot(...)");
                    root2.setVisibility(c7672o.m11417f().m11449d() ? 0 : 8);
                    ViewFragmentBoardBinding viewFragmentBoardBinding4 = this.f12120c.mBinding;
                    if (viewFragmentBoardBinding4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                        viewFragmentBoardBinding4 = null;
                    }
                    View root3 = viewFragmentBoardBinding4.f12623f.getRoot();
                    Intrinsics.checkNotNullExpressionValue(root3, "getRoot(...)");
                    root3.setVisibility(c7672o.m11417f().m11447b() ? 0 : 8);
                    ViewFragmentBoardBinding viewFragmentBoardBinding5 = this.f12120c.mBinding;
                    if (viewFragmentBoardBinding5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                        viewFragmentBoardBinding5 = null;
                    }
                    View root4 = viewFragmentBoardBinding5.f12624g.getRoot();
                    Intrinsics.checkNotNullExpressionValue(root4, "getRoot(...)");
                    root4.setVisibility(c7672o.m11417f().m11448c() ? 0 : 8);
                    ViewFragmentBoardBinding viewFragmentBoardBinding6 = this.f12120c.mBinding;
                    if (viewFragmentBoardBinding6 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                        viewFragmentBoardBinding6 = null;
                    }
                    View root5 = viewFragmentBoardBinding6.f12621d.getRoot();
                    Intrinsics.checkNotNullExpressionValue(root5, "getRoot(...)");
                    root5.setVisibility(c7672o.m11417f().m11446a() ? 0 : 8);
                    ViewFragmentBoardBinding viewFragmentBoardBinding7 = this.f12120c.mBinding;
                    if (viewFragmentBoardBinding7 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                        viewFragmentBoardBinding7 = null;
                    }
                    View root6 = viewFragmentBoardBinding7.f12622e.getRoot();
                    Intrinsics.checkNotNullExpressionValue(root6, "getRoot(...)");
                    root6.setVisibility(c7672o.m11414c().m11397a() ? 0 : 8);
                    ViewFragmentBoardBinding viewFragmentBoardBinding8 = this.f12120c.mBinding;
                    if (viewFragmentBoardBinding8 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                        viewFragmentBoardBinding8 = null;
                    }
                    View root7 = viewFragmentBoardBinding8.f12627j.getRoot();
                    Intrinsics.checkNotNullExpressionValue(root7, "getRoot(...)");
                    root7.setVisibility(c7672o.m11414c().m11398b() ? 0 : 8);
                    ViewFragmentBoardBinding viewFragmentBoardBinding9 = this.f12120c.mBinding;
                    if (viewFragmentBoardBinding9 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                        viewFragmentBoardBinding9 = null;
                    }
                    LinearLayoutCompat llDeleteDraft = viewFragmentBoardBinding9.f12627j.f12793d;
                    Intrinsics.checkNotNullExpressionValue(llDeleteDraft, "llDeleteDraft");
                    llDeleteDraft.setVisibility(c7672o.m11420i() ? 0 : 8);
                    ViewFragmentBoardBinding viewFragmentBoardBinding10 = this.f12120c.mBinding;
                    if (viewFragmentBoardBinding10 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                        viewFragmentBoardBinding10 = null;
                    }
                    SketchProgressView sketchProgressView = viewFragmentBoardBinding10.f12633p;
                    sketchProgressView.setTouchable(c7672o.m11422k());
                    sketchProgressView.setProgress(c7672o.m11418g());
                    sketchProgressView.setThumbTime(c7672o.m11419h());
                    ViewFragmentBoardBinding viewFragmentBoardBinding11 = this.f12120c.mBinding;
                    if (viewFragmentBoardBinding11 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mBinding");
                    } else {
                        viewFragmentBoardBinding2 = viewFragmentBoardBinding11;
                    }
                    SketchProgressView sketchProgressView2 = viewFragmentBoardBinding2.f12632o;
                    sketchProgressView2.setTouchable(c7672o.m11421j());
                    sketchProgressView2.setProgress(c7672o.m11415d());
                    sketchProgressView2.setThumbTime(c7672o.m11416e());
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass9(BoardFragment boardFragment, Continuation continuation) {
                super(2, continuation);
                this.f12117b = boardFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new AnonymousClass9(this.f12117b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return invoke2(coroutineScope, (Continuation) continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i9 = this.f12116a;
                if (i9 == 0) {
                    ResultKt.throwOnFailure(obj);
                    StateFlow extraUIState = this.f12117b.m11209r0().getExtraUIState();
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f12117b, null);
                    this.f12116a = 1;
                    if (FlowKt.collectLatest(extraUIState, anonymousClass1, this) == coroutine_suspended) {
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
                return ((AnonymousClass9) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C76521(BoardFragment boardFragment, Continuation continuation) {
            super(2, continuation);
            this.f12062c = boardFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C76521 c76521 = new C76521(this.f12062c, continuation);
            c76521.f12061b = obj;
            return c76521;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return invoke2(coroutineScope, (Continuation) continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineScope coroutineScope = (CoroutineScope) this.f12061b;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f12060a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(this.f12062c, null), 3, null);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass2(this.f12062c, null), 3, null);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass3(this.f12062c, null), 3, null);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass4(this.f12062c, null), 3, null);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass5(this.f12062c, null), 3, null);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass6(this.f12062c, null), 3, null);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass7(this.f12062c, null), 3, null);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass8(this.f12062c, null), 3, null);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass9(this.f12062c, null), 3, null);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass10(this.f12062c, null), 3, null);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass11(this.f12062c, null), 3, null);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C76521) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BoardFragment$initObserver$1(BoardFragment boardFragment, Continuation continuation) {
        super(2, continuation);
        this.f12059b = boardFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new BoardFragment$initObserver$1(this.f12059b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return invoke2(coroutineScope, (Continuation) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i9 = this.f12058a;
        if (i9 == 0) {
            ResultKt.throwOnFailure(obj);
            LifecycleOwner viewLifecycleOwner = this.f12059b.getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            Lifecycle.State state = Lifecycle.State.RESUMED;
            C76521 c76521 = new C76521(this.f12059b, null);
            this.f12058a = 1;
            if (RepeatOnLifecycleKt.repeatOnLifecycle(viewLifecycleOwner, state, c76521, this) == coroutine_suspended) {
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
        return ((BoardFragment$initObserver$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
