package com.zykj.view.board.simple;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Lifecycle;
import android.view.LifecycleOwner;
import android.view.LifecycleOwnerKt;
import android.view.RepeatOnLifecycleKt;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.NotificationCompat;
import androidx.core.view.ViewGroupKt;
import androidx.fragment.app.Fragment;
import androidx.navigation.C2827b;
import com.zykj.mistake.activity.ViewOnClickListenerC4486v;
import com.zykj.view.C5280R;
import com.zykj.view.board.board.DialogKt;
import com.zykj.view.board.board.MainToolType;
import com.zykj.view.board.play.C5353b;
import com.zykj.view.board.simple.SimpleBoardEvent;
import com.zykj.view.board.simple.SimplePenType;
import com.zykj.view.databinding.ViewFragmentSimpleBinding;
import com.zykj.view.databinding.ViewIncludeMenuBinding;
import com.zykj.view.databinding.ViewIncludePenBinding;
import com.zykj.view.simpleBoard.SimpleBoardConfig;
import com.zykj.view.simpleBoard.SimpleBoardView;
import com.zykj.view.utils.ExtKt;
import com.zykj.view.utils.ImagePicker;
import java.util.Iterator;
import kotlin.AbstractC5773a;
import kotlin.AbstractC5774b;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.AbstractC5806u;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.AbstractC6014x;
import kotlinx.coroutines.InterfaceC6009v;
import kotlinx.coroutines.flow.AbstractC5914h;
import kotlinx.coroutines.flow.InterfaceC5905c0;
import kotlinx.coroutines.flow.InterfaceC5944m0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p045d6.InterfaceC5429e;
import p075h6.InterfaceC5631c;
import p152r6.InterfaceC6473e;

@Deprecated(message = "用于编辑图片的，但是暂时没看到对应任务")
@Metadata(m5109d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 42\u00020\u0001:\u00014B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0003J\u000f\u0010\u0012\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0003J\u000f\u0010\u0013\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0013\u0010\u0003J\u000f\u0010\u0014\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0014\u0010\u0003J\u000f\u0010\u0015\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0015\u0010\u0003J\u000f\u0010\u0016\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0016\u0010\u0003J\u000f\u0010\u0017\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0017\u0010\u0003J\u0017\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bR\u001b\u0010!\u001a\u00020\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010&\u001a\u00020%8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010+\u001a\u00020(8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0014\u0010/\u001a\u00020,8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0014\u00103\u001a\u0002008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b1\u00102¨\u00065"}, m5110d2 = {"Lcom/zykj/view/board/simple/SimpleFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "Ld6/s;", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "initView", "initClickListener", "initMainClickListener", "initPenClickListener", "initEraserClickListener", "initExtraClickListener", "initObserver", "", "isOpen", "startToolAnimate", "(Z)V", "Lcom/zykj/view/board/simple/SimpleViewModel;", "mViewModel$delegate", "Ld6/e;", "getMViewModel", "()Lcom/zykj/view/board/simple/SimpleViewModel;", "mViewModel", "Lcom/zykj/view/utils/ImagePicker;", "imagePicker", "Lcom/zykj/view/utils/ImagePicker;", "Lcom/zykj/view/databinding/ViewFragmentSimpleBinding;", "mBinding", "Lcom/zykj/view/databinding/ViewFragmentSimpleBinding;", "", "getPath", "()Ljava/lang/String;", "path", "Lcom/zykj/view/simpleBoard/SimpleBoardView;", "getSketchView", "()Lcom/zykj/view/simpleBoard/SimpleBoardView;", "sketchView", "Lcom/zykj/view/simpleBoard/SimpleBoardConfig;", "getSketchConfig", "()Lcom/zykj/view/simpleBoard/SimpleBoardConfig;", "sketchConfig", "Companion", "view_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nSimpleFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SimpleFragment.kt\ncom/zykj/view/board/simple/SimpleFragment\n+ 2 View.kt\nandroidx/core/view/ViewKt\n+ 3 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n+ 4 Animator.kt\nandroidx/core/animation/AnimatorKt\n*L\n1#1,314:1\n257#2,2:315\n257#2,2:317\n257#2,2:319\n257#2,2:321\n257#2,2:323\n257#2,2:325\n257#2,2:327\n257#2,2:329\n257#2,2:331\n1321#3,2:333\n1332#3,3:335\n1332#3,3:338\n1332#3,3:341\n29#4:344\n85#4,18:345\n*S KotlinDebug\n*F\n+ 1 SimpleFragment.kt\ncom/zykj/view/board/simple/SimpleFragment\n*L\n66#1:315,2\n67#1:317,2\n68#1:319,2\n69#1:321,2\n70#1:323,2\n71#1:325,2\n72#1:327,2\n76#1:329,2\n77#1:331,2\n159#1:333,2\n170#1:335,3\n177#1:338,3\n189#1:341,3\n275#1:344\n275#1:345,18\n*E\n"})
/* loaded from: classes3.dex */
public final class SimpleFragment extends Fragment {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private ViewFragmentSimpleBinding mBinding;

    /* renamed from: mViewModel$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC5429e mViewModel = AbstractC5773a.m5117b(new C5353b(1));

    @NotNull
    private final ImagePicker imagePicker = new ImagePicker(this, null, 2, 0 == true ? 1 : 0);

    @Metadata(m5109d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, m5110d2 = {"Lcom/zykj/view/board/simple/SimpleFragment$Companion;", "", "<init>", "()V", "newInstance", "Lcom/zykj/view/board/simple/SimpleFragment;", "path", "", "view_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC5824e abstractC5824e) {
            this();
        }

        @NotNull
        public final SimpleFragment newInstance(@NotNull String path) {
            AbstractC5830k.m5330g(path, "path");
            SimpleFragment simpleFragment = new SimpleFragment();
            Bundle bundle = new Bundle();
            bundle.putString("path", path);
            simpleFragment.setArguments(bundle);
            return simpleFragment;
        }

        private Companion() {
        }
    }

    @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Lkotlinx/coroutines/v;", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/v;)V"}, m5111k = 3, m5112mv = {2, 2, 0})
    @DebugMetadata(m5302c = "com.zykj.view.board.simple.SimpleFragment$initObserver$1", m5303f = "SimpleFragment.kt", m5304i = {}, m5305l = {212}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
    /* renamed from: com.zykj.view.board.simple.SimpleFragment$initObserver$1 */
    public static final class C53631 extends SuspendLambda implements InterfaceC6473e {
        int label;

        @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Lkotlinx/coroutines/v;", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/v;)V"}, m5111k = 3, m5112mv = {2, 2, 0})
        @DebugMetadata(m5302c = "com.zykj.view.board.simple.SimpleFragment$initObserver$1$1", m5303f = "SimpleFragment.kt", m5304i = {}, m5305l = {}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
        /* renamed from: com.zykj.view.board.simple.SimpleFragment$initObserver$1$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC6473e {
            private /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ SimpleFragment this$0;

            @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Lkotlinx/coroutines/v;", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/v;)V"}, m5111k = 3, m5112mv = {2, 2, 0})
            @DebugMetadata(m5302c = "com.zykj.view.board.simple.SimpleFragment$initObserver$1$1$1", m5303f = "SimpleFragment.kt", m5304i = {}, m5305l = {214}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
            /* renamed from: com.zykj.view.board.simple.SimpleFragment$initObserver$1$1$1, reason: invalid class name and collision with other inner class name */
            public static final class C68871 extends SuspendLambda implements InterfaceC6473e {
                int label;
                final /* synthetic */ SimpleFragment this$0;

                @Metadata(m5109d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m5110d2 = {"Lcom/zykj/view/board/simple/SimpleBoardEvent;", NotificationCompat.CATEGORY_EVENT, "Ld6/s;", "<anonymous>", "(Lcom/zykj/view/board/simple/SimpleBoardEvent;)V"}, m5111k = 3, m5112mv = {2, 2, 0})
                @DebugMetadata(m5302c = "com.zykj.view.board.simple.SimpleFragment$initObserver$1$1$1$1", m5303f = "SimpleFragment.kt", m5304i = {}, m5305l = {}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
                /* renamed from: com.zykj.view.board.simple.SimpleFragment$initObserver$1$1$1$1, reason: invalid class name and collision with other inner class name */
                public static final class C68881 extends SuspendLambda implements InterfaceC6473e {
                    /* synthetic */ Object L$0;
                    int label;
                    final /* synthetic */ SimpleFragment this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C68881(SimpleFragment simpleFragment, InterfaceC5631c<? super C68881> interfaceC5631c) {
                        super(2, interfaceC5631c);
                        this.this$0 = simpleFragment;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
                        C68881 c68881 = new C68881(this.this$0, interfaceC5631c);
                        c68881.L$0 = obj;
                        return c68881;
                    }

                    @Override // p152r6.InterfaceC6473e
                    public final Object invoke(SimpleBoardEvent simpleBoardEvent, InterfaceC5631c<? super C5443s> interfaceC5631c) {
                        return ((C68881) create(simpleBoardEvent, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        SimpleBoardEvent simpleBoardEvent = (SimpleBoardEvent) this.L$0;
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC5774b.m5119b(obj);
                        if (simpleBoardEvent instanceof SimpleBoardEvent.ExpandAnimate) {
                            this.this$0.startToolAnimate(((SimpleBoardEvent.ExpandAnimate) simpleBoardEvent).isOpen());
                        } else if (simpleBoardEvent instanceof SimpleBoardEvent.SetFingerTouchable) {
                            this.this$0.getSketchConfig().setEnableFinger(((SimpleBoardEvent.SetFingerTouchable) simpleBoardEvent).getEnable());
                        } else if (simpleBoardEvent instanceof SimpleBoardEvent.SetPenMode) {
                            SimpleBoardEvent.SetPenMode setPenMode = (SimpleBoardEvent.SetPenMode) simpleBoardEvent;
                            this.this$0.getSketchView().setActonMode(setPenMode.getActionMode());
                            this.this$0.getSketchConfig().setPenDashed(setPenMode.isPenDashed());
                        } else if (simpleBoardEvent instanceof SimpleBoardEvent.SetPenSize) {
                            this.this$0.getSketchConfig().setPenWidth(((SimpleBoardEvent.SetPenSize) simpleBoardEvent).getPenSize());
                        } else if (simpleBoardEvent instanceof SimpleBoardEvent.SetPenColor) {
                            this.this$0.getSketchConfig().setPenColor(((SimpleBoardEvent.SetPenColor) simpleBoardEvent).getPenColor());
                        } else if (simpleBoardEvent instanceof SimpleBoardEvent.SetEraserSize) {
                            this.this$0.getSketchConfig().setEraserSize(((SimpleBoardEvent.SetEraserSize) simpleBoardEvent).getEraserSize());
                        } else {
                            if (!(simpleBoardEvent instanceof SimpleBoardEvent.Clean)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            this.this$0.getSketchView().clean();
                        }
                        return C5443s.f8405a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C68871(SimpleFragment simpleFragment, InterfaceC5631c<? super C68871> interfaceC5631c) {
                    super(2, interfaceC5631c);
                    this.this$0 = simpleFragment;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
                    return new C68871(this.this$0, interfaceC5631c);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i = this.label;
                    if (i == 0) {
                        AbstractC5774b.m5119b(obj);
                        InterfaceC5905c0 event = this.this$0.getMViewModel().getEvent();
                        C68881 c68881 = new C68881(this.this$0, null);
                        this.label = 1;
                        if (AbstractC5914h.m5552h(event, c68881, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC5774b.m5119b(obj);
                    }
                    return C5443s.f8405a;
                }

                @Override // p152r6.InterfaceC6473e
                public final Object invoke(InterfaceC6009v interfaceC6009v, InterfaceC5631c<? super C5443s> interfaceC5631c) {
                    return ((C68871) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
                }
            }

            @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Lkotlinx/coroutines/v;", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/v;)V"}, m5111k = 3, m5112mv = {2, 2, 0})
            @DebugMetadata(m5302c = "com.zykj.view.board.simple.SimpleFragment$initObserver$1$1$2", m5303f = "SimpleFragment.kt", m5304i = {}, m5305l = {243}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
            /* renamed from: com.zykj.view.board.simple.SimpleFragment$initObserver$1$1$2, reason: invalid class name */
            public static final class AnonymousClass2 extends SuspendLambda implements InterfaceC6473e {
                int label;
                final /* synthetic */ SimpleFragment this$0;

                @Metadata(m5109d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m5110d2 = {"Lcom/zykj/view/board/simple/SimpleUIState;", "state", "Ld6/s;", "<anonymous>", "(Lcom/zykj/view/board/simple/SimpleUIState;)V"}, m5111k = 3, m5112mv = {2, 2, 0})
                @DebugMetadata(m5302c = "com.zykj.view.board.simple.SimpleFragment$initObserver$1$1$2$1", m5303f = "SimpleFragment.kt", m5304i = {}, m5305l = {}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
                /* renamed from: com.zykj.view.board.simple.SimpleFragment$initObserver$1$1$2$1, reason: invalid class name and collision with other inner class name */
                public static final class C68891 extends SuspendLambda implements InterfaceC6473e {
                    /* synthetic */ Object L$0;
                    int label;
                    final /* synthetic */ SimpleFragment this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C68891(SimpleFragment simpleFragment, InterfaceC5631c<? super C68891> interfaceC5631c) {
                        super(2, interfaceC5631c);
                        this.this$0 = simpleFragment;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
                        C68891 c68891 = new C68891(this.this$0, interfaceC5631c);
                        c68891.L$0 = obj;
                        return c68891;
                    }

                    @Override // p152r6.InterfaceC6473e
                    public final Object invoke(SimpleUIState simpleUIState, InterfaceC5631c<? super C5443s> interfaceC5631c) {
                        return ((C68891) create(simpleUIState, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        SimpleUIState simpleUIState = (SimpleUIState) this.L$0;
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC5774b.m5119b(obj);
                        ViewFragmentSimpleBinding viewFragmentSimpleBinding = this.this$0.mBinding;
                        if (viewFragmentSimpleBinding == null) {
                            AbstractC5830k.m5339p("mBinding");
                            throw null;
                        }
                        ViewIncludeMenuBinding viewIncludeMenuBinding = viewFragmentSimpleBinding.includeMenu;
                        viewIncludeMenuBinding.ivTouch.setSelected(simpleUIState.isTouchable());
                        viewIncludeMenuBinding.ivSelect.setSelected(simpleUIState.getMainToolType().getIsSelectChecked());
                        viewIncludeMenuBinding.ivPen.setSelected(simpleUIState.getMainToolType().getIsPenChecked());
                        viewIncludeMenuBinding.ivEraser.setSelected(simpleUIState.getMainToolType().getIsEraserChecked());
                        ViewFragmentSimpleBinding viewFragmentSimpleBinding2 = this.this$0.mBinding;
                        if (viewFragmentSimpleBinding2 == null) {
                            AbstractC5830k.m5339p("mBinding");
                            throw null;
                        }
                        ViewIncludePenBinding viewIncludePenBinding = viewFragmentSimpleBinding2.includePen;
                        RadioGroup rgPenType = viewIncludePenBinding.rgPenType;
                        AbstractC5830k.m5329f(rgPenType, "rgPenType");
                        ExtKt.checkAt(rgPenType, simpleUIState.getPenType().getOrdinal());
                        RadioGroup rgPenSize = viewIncludePenBinding.rgPenSize;
                        AbstractC5830k.m5329f(rgPenSize, "rgPenSize");
                        ExtKt.checkAt(rgPenSize, simpleUIState.getPenSize().getOrdinal());
                        RadioGroup rgPenColor = viewIncludePenBinding.rgPenColor;
                        AbstractC5830k.m5329f(rgPenColor, "rgPenColor");
                        ExtKt.checkAt(rgPenColor, simpleUIState.getPenColor().getOrdinal());
                        ViewFragmentSimpleBinding viewFragmentSimpleBinding3 = this.this$0.mBinding;
                        if (viewFragmentSimpleBinding3 == null) {
                            AbstractC5830k.m5339p("mBinding");
                            throw null;
                        }
                        RadioGroup rgEraserSize = viewFragmentSimpleBinding3.includeEraser.rgEraserSize;
                        AbstractC5830k.m5329f(rgEraserSize, "rgEraserSize");
                        ExtKt.checkAt(rgEraserSize, simpleUIState.getEraserType().getOrdinal());
                        ViewFragmentSimpleBinding viewFragmentSimpleBinding4 = this.this$0.mBinding;
                        if (viewFragmentSimpleBinding4 != null) {
                            viewFragmentSimpleBinding4.ivExpansion.setImageResource(simpleUIState.getExpandStatus().getIcon());
                            return C5443s.f8405a;
                        }
                        AbstractC5830k.m5339p("mBinding");
                        throw null;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass2(SimpleFragment simpleFragment, InterfaceC5631c<? super AnonymousClass2> interfaceC5631c) {
                    super(2, interfaceC5631c);
                    this.this$0 = simpleFragment;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
                    return new AnonymousClass2(this.this$0, interfaceC5631c);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i = this.label;
                    if (i == 0) {
                        AbstractC5774b.m5119b(obj);
                        InterfaceC5944m0 uiState = this.this$0.getMViewModel().getUiState();
                        C68891 c68891 = new C68891(this.this$0, null);
                        this.label = 1;
                        if (AbstractC5914h.m5552h(uiState, c68891, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC5774b.m5119b(obj);
                    }
                    return C5443s.f8405a;
                }

                @Override // p152r6.InterfaceC6473e
                public final Object invoke(InterfaceC6009v interfaceC6009v, InterfaceC5631c<? super C5443s> interfaceC5631c) {
                    return ((AnonymousClass2) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(SimpleFragment simpleFragment, InterfaceC5631c<? super AnonymousClass1> interfaceC5631c) {
                super(2, interfaceC5631c);
                this.this$0 = simpleFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, interfaceC5631c);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                InterfaceC6009v interfaceC6009v = (InterfaceC6009v) this.L$0;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC5774b.m5119b(obj);
                AbstractC6014x.m5651v(interfaceC6009v, null, null, new C68871(this.this$0, null), 3);
                AbstractC6014x.m5651v(interfaceC6009v, null, null, new AnonymousClass2(this.this$0, null), 3);
                return C5443s.f8405a;
            }

            @Override // p152r6.InterfaceC6473e
            public final Object invoke(InterfaceC6009v interfaceC6009v, InterfaceC5631c<? super C5443s> interfaceC5631c) {
                return ((AnonymousClass1) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
            }
        }

        public C53631(InterfaceC5631c<? super C53631> interfaceC5631c) {
            super(2, interfaceC5631c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
            return SimpleFragment.this.new C53631(interfaceC5631c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                AbstractC5774b.m5119b(obj);
                LifecycleOwner viewLifecycleOwner = SimpleFragment.this.getViewLifecycleOwner();
                AbstractC5830k.m5329f(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                Lifecycle.State state = Lifecycle.State.RESUMED;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(SimpleFragment.this, null);
                this.label = 1;
                if (RepeatOnLifecycleKt.repeatOnLifecycle(viewLifecycleOwner, state, anonymousClass1, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC5774b.m5119b(obj);
            }
            return C5443s.f8405a;
        }

        @Override // p152r6.InterfaceC6473e
        public final Object invoke(InterfaceC6009v interfaceC6009v, InterfaceC5631c<? super C5443s> interfaceC5631c) {
            return ((C53631) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SimpleViewModel getMViewModel() {
        return (SimpleViewModel) this.mViewModel.getValue();
    }

    private final String getPath() {
        String string;
        Bundle arguments = getArguments();
        return (arguments == null || (string = arguments.getString("path")) == null) ? "" : string;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SimpleBoardConfig getSketchConfig() {
        ViewFragmentSimpleBinding viewFragmentSimpleBinding = this.mBinding;
        if (viewFragmentSimpleBinding != null) {
            return viewFragmentSimpleBinding.sketchView.getSimpleBoardConfig();
        }
        AbstractC5830k.m5339p("mBinding");
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SimpleBoardView getSketchView() {
        ViewFragmentSimpleBinding viewFragmentSimpleBinding = this.mBinding;
        if (viewFragmentSimpleBinding == null) {
            AbstractC5830k.m5339p("mBinding");
            throw null;
        }
        SimpleBoardView sketchView = viewFragmentSimpleBinding.sketchView;
        AbstractC5830k.m5329f(sketchView, "sketchView");
        return sketchView;
    }

    private final void initClickListener() {
        initMainClickListener();
        initPenClickListener();
        initEraserClickListener();
        initExtraClickListener();
    }

    private final void initEraserClickListener() {
        ViewFragmentSimpleBinding viewFragmentSimpleBinding = this.mBinding;
        if (viewFragmentSimpleBinding == null) {
            AbstractC5830k.m5339p("mBinding");
            throw null;
        }
        RadioGroup rgEraserSize = viewFragmentSimpleBinding.includeEraser.rgEraserSize;
        AbstractC5830k.m5329f(rgEraserSize, "rgEraserSize");
        int i = 0;
        for (Object obj : ViewGroupKt.getChildren(rgEraserSize)) {
            int i8 = i + 1;
            if (i < 0) {
                AbstractC5806u.m5258L();
                throw null;
            }
            ((View) obj).setOnClickListener(new ViewOnClickListenerC5375b(this, i, 2));
            i = i8;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initEraserClickListener$lambda$17$lambda$16(SimpleFragment simpleFragment, int i, View view) {
        simpleFragment.getMViewModel().updateEraserSizeLevel(i);
    }

    private final void initExtraClickListener() {
        ViewFragmentSimpleBinding viewFragmentSimpleBinding = this.mBinding;
        if (viewFragmentSimpleBinding == null) {
            AbstractC5830k.m5339p("mBinding");
            throw null;
        }
        viewFragmentSimpleBinding.ivBack.setOnClickListener(new ViewOnClickListenerC4486v());
        ViewFragmentSimpleBinding viewFragmentSimpleBinding2 = this.mBinding;
        if (viewFragmentSimpleBinding2 != null) {
            viewFragmentSimpleBinding2.ivExpansion.setOnClickListener(new ViewOnClickListenerC5374a(this, 0));
        } else {
            AbstractC5830k.m5339p("mBinding");
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initExtraClickListener$lambda$18(View view) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initExtraClickListener$lambda$19(SimpleFragment simpleFragment, View view) {
        simpleFragment.getMViewModel().handleExpandClick();
    }

    private final void initMainClickListener() {
        ViewFragmentSimpleBinding viewFragmentSimpleBinding = this.mBinding;
        if (viewFragmentSimpleBinding == null) {
            AbstractC5830k.m5339p("mBinding");
            throw null;
        }
        ViewIncludeMenuBinding viewIncludeMenuBinding = viewFragmentSimpleBinding.includeMenu;
        viewIncludeMenuBinding.ivTouch.setOnClickListener(new ViewOnClickListenerC5374a(this, 2));
        viewIncludeMenuBinding.ivPen.setOnClickListener(new ViewOnClickListenerC5374a(this, 3));
        viewIncludeMenuBinding.ivEraser.setOnClickListener(new ViewOnClickListenerC5374a(this, 4));
        viewIncludeMenuBinding.ivDelete.setOnClickListener(new ViewOnClickListenerC5374a(this, 5));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initMainClickListener$lambda$9$lambda$4(SimpleFragment simpleFragment, View view) {
        SimpleViewModel.updateTouchable$default(simpleFragment.getMViewModel(), false, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initMainClickListener$lambda$9$lambda$5(SimpleFragment simpleFragment, View view) {
        simpleFragment.getMViewModel().updateModeType(MainToolType.Pen.INSTANCE);
        simpleFragment.getMViewModel().switchPenTool();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initMainClickListener$lambda$9$lambda$6(SimpleFragment simpleFragment, View view) {
        simpleFragment.getMViewModel().updateModeType(MainToolType.Eraser.INSTANCE);
        simpleFragment.getMViewModel().switchEraserTool();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initMainClickListener$lambda$9$lambda$8(SimpleFragment simpleFragment, View view) {
        Context contextRequireContext = simpleFragment.requireContext();
        AbstractC5830k.m5329f(contextRequireContext, "requireContext(...)");
        DialogKt.showAskForCleanDialog(contextRequireContext, new C2827b(simpleFragment, 10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5443s initMainClickListener$lambda$9$lambda$8$lambda$7(SimpleFragment simpleFragment) {
        simpleFragment.getMViewModel().cleanPage();
        return C5443s.f8405a;
    }

    private final void initObserver() {
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        AbstractC5830k.m5329f(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        AbstractC6014x.m5651v(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new C53631(null), 3);
    }

    private final void initPenClickListener() {
        ViewFragmentSimpleBinding viewFragmentSimpleBinding = this.mBinding;
        if (viewFragmentSimpleBinding == null) {
            AbstractC5830k.m5339p("mBinding");
            throw null;
        }
        RadioGroup rgPenType = viewFragmentSimpleBinding.includePen.rgPenType;
        AbstractC5830k.m5329f(rgPenType, "rgPenType");
        Iterator it = ViewGroupKt.getChildren(rgPenType).iterator();
        while (it.hasNext()) {
            ((View) it.next()).setOnClickListener(new ViewOnClickListenerC5374a(this, 1));
        }
        ViewFragmentSimpleBinding viewFragmentSimpleBinding2 = this.mBinding;
        if (viewFragmentSimpleBinding2 == null) {
            AbstractC5830k.m5339p("mBinding");
            throw null;
        }
        RadioGroup rgPenSize = viewFragmentSimpleBinding2.includePen.rgPenSize;
        AbstractC5830k.m5329f(rgPenSize, "rgPenSize");
        int i = 0;
        int i8 = 0;
        for (Object obj : ViewGroupKt.getChildren(rgPenSize)) {
            int i9 = i8 + 1;
            if (i8 < 0) {
                AbstractC5806u.m5258L();
                throw null;
            }
            ((View) obj).setOnClickListener(new ViewOnClickListenerC5375b(this, i8, 0));
            i8 = i9;
        }
        ViewFragmentSimpleBinding viewFragmentSimpleBinding3 = this.mBinding;
        if (viewFragmentSimpleBinding3 == null) {
            AbstractC5830k.m5339p("mBinding");
            throw null;
        }
        RadioGroup rgPenColor = viewFragmentSimpleBinding3.includePen.rgPenColor;
        AbstractC5830k.m5329f(rgPenColor, "rgPenColor");
        for (Object obj2 : ViewGroupKt.getChildren(rgPenColor)) {
            int i10 = i + 1;
            if (i < 0) {
                AbstractC5806u.m5258L();
                throw null;
            }
            ((View) obj2).setOnClickListener(new ViewOnClickListenerC5375b(this, i, 1));
            i = i10;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initPenClickListener$lambda$11$lambda$10(SimpleFragment simpleFragment, View view) {
        int id = view.getId();
        if (id == C5280R.id.rb_pen_custom) {
            simpleFragment.getMViewModel().updatePenType(SimplePenType.Custom.INSTANCE);
        } else if (id == C5280R.id.rb_pen_line) {
            simpleFragment.getMViewModel().updatePenType(SimplePenType.Line.INSTANCE);
        } else if (id == C5280R.id.rb_pen_dotted_line) {
            simpleFragment.getMViewModel().updatePenType(SimplePenType.DottedLine.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initPenClickListener$lambda$13$lambda$12(SimpleFragment simpleFragment, int i, View view) {
        simpleFragment.getMViewModel().updatePenSizeLevel(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initPenClickListener$lambda$15$lambda$14(SimpleFragment simpleFragment, int i, View view) {
        simpleFragment.getMViewModel().updatePenColorLevel(i);
    }

    private final void initView() {
        initClickListener();
        initObserver();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SimpleViewModel mViewModel_delegate$lambda$0() {
        return new SimpleViewModel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void startToolAnimate(final boolean isOpen) {
        float f;
        ViewFragmentSimpleBinding viewFragmentSimpleBinding = this.mBinding;
        if (viewFragmentSimpleBinding == null) {
            AbstractC5830k.m5339p("mBinding");
            throw null;
        }
        viewFragmentSimpleBinding.ivExpansion.setEnabled(false);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(500L);
        animatorSet.addListener(new Animator.AnimatorListener() { // from class: com.zykj.view.board.simple.SimpleFragment$startToolAnimate$lambda$21$$inlined$doOnEnd$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                ViewFragmentSimpleBinding viewFragmentSimpleBinding2 = this.this$0.mBinding;
                if (viewFragmentSimpleBinding2 == null) {
                    AbstractC5830k.m5339p("mBinding");
                    throw null;
                }
                viewFragmentSimpleBinding2.ivExpansion.setEnabled(true);
                this.this$0.getMViewModel().updateExpandState(isOpen);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }
        });
        float f7 = 0.0f;
        if (isOpen) {
            if (this.mBinding == null) {
                AbstractC5830k.m5339p("mBinding");
                throw null;
            }
            f = -r5.includeMenu.getRoot().getWidth();
        } else {
            f = 0.0f;
        }
        if (!isOpen) {
            if (this.mBinding == null) {
                AbstractC5830k.m5339p("mBinding");
                throw null;
            }
            f7 = -r12.includeMenu.getRoot().getWidth();
        }
        ViewFragmentSimpleBinding viewFragmentSimpleBinding2 = this.mBinding;
        if (viewFragmentSimpleBinding2 == null) {
            AbstractC5830k.m5339p("mBinding");
            throw null;
        }
        AnimatorSet.Builder builderPlay = animatorSet.play(ObjectAnimator.ofFloat(viewFragmentSimpleBinding2.includeMenu.getRoot(), "translationX", f, f7));
        ViewFragmentSimpleBinding viewFragmentSimpleBinding3 = this.mBinding;
        if (viewFragmentSimpleBinding3 == null) {
            AbstractC5830k.m5339p("mBinding");
            throw null;
        }
        AnimatorSet.Builder builderWith = builderPlay.with(ObjectAnimator.ofFloat(viewFragmentSimpleBinding3.toolPanel, "translationX", f, f7));
        ViewFragmentSimpleBinding viewFragmentSimpleBinding4 = this.mBinding;
        if (viewFragmentSimpleBinding4 == null) {
            AbstractC5830k.m5339p("mBinding");
            throw null;
        }
        builderWith.with(ObjectAnimator.ofFloat(viewFragmentSimpleBinding4.ivExpansion, "translationX", f, f7));
        animatorSet.start();
    }

    @Override // androidx.fragment.app.Fragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        AbstractC5830k.m5330g(inflater, "inflater");
        ViewFragmentSimpleBinding viewFragmentSimpleBindingInflate = ViewFragmentSimpleBinding.inflate(inflater, container, false);
        AbstractC5830k.m5327d(viewFragmentSimpleBindingInflate);
        this.mBinding = viewFragmentSimpleBindingInflate;
        ViewIncludeMenuBinding viewIncludeMenuBinding = viewFragmentSimpleBindingInflate.includeMenu;
        AppCompatImageView ivWithdraw = viewIncludeMenuBinding.ivWithdraw;
        AbstractC5830k.m5329f(ivWithdraw, "ivWithdraw");
        ivWithdraw.setVisibility(8);
        AppCompatImageView ivRecover = viewIncludeMenuBinding.ivRecover;
        AbstractC5830k.m5329f(ivRecover, "ivRecover");
        ivRecover.setVisibility(8);
        AppCompatImageView ivSelect = viewIncludeMenuBinding.ivSelect;
        AbstractC5830k.m5329f(ivSelect, "ivSelect");
        ivSelect.setVisibility(8);
        AppCompatImageView ivEnlarge = viewIncludeMenuBinding.ivEnlarge;
        AbstractC5830k.m5329f(ivEnlarge, "ivEnlarge");
        ivEnlarge.setVisibility(8);
        AppCompatImageView ivReduce = viewIncludeMenuBinding.ivReduce;
        AbstractC5830k.m5329f(ivReduce, "ivReduce");
        ivReduce.setVisibility(8);
        AppCompatImageView ivImageAdd = viewIncludeMenuBinding.ivImageAdd;
        AbstractC5830k.m5329f(ivImageAdd, "ivImageAdd");
        ivImageAdd.setVisibility(8);
        AppCompatImageView ivBackgroundColor = viewIncludeMenuBinding.ivBackgroundColor;
        AbstractC5830k.m5329f(ivBackgroundColor, "ivBackgroundColor");
        ivBackgroundColor.setVisibility(8);
        ViewIncludePenBinding viewIncludePenBinding = viewFragmentSimpleBindingInflate.includePen;
        RadioButton rbPenCursor = viewIncludePenBinding.rbPenCursor;
        AbstractC5830k.m5329f(rbPenCursor, "rbPenCursor");
        rbPenCursor.setVisibility(8);
        RadioButton rbPenHighlighter = viewIncludePenBinding.rbPenHighlighter;
        AbstractC5830k.m5329f(rbPenHighlighter, "rbPenHighlighter");
        rbPenHighlighter.setVisibility(8);
        View root = viewFragmentSimpleBindingInflate.getRoot();
        AbstractC5830k.m5329f(root, "getRoot(...)");
        return root;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        AbstractC5830k.m5330g(view, "view");
        super.onViewCreated(view, savedInstanceState);
        initView();
    }
}
