package com.zykj.student.dialogue.p076ui.detail;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import androidx.activity.OnBackPressedCallback;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.hilt.navigation.HiltViewModelFactory;
import androidx.hilt.navigation.fragment.HiltNavGraphViewModelLazyKt;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.navigation.NavArgsLazy;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.fragment.FragmentKt;
import com.p071uc.crashsdk.export.ExitType;
import com.taobao.sophix.PatchStatus;
import com.xuexiang.xui.widget.alpha.XUIAlphaImageButton;
import com.zykj.student.dialogue.R;
import com.zykj.student.dialogue.bean.resp.MessageResponse;
import com.zykj.student.dialogue.bean.resp.QuestionResp;
import com.zykj.student.dialogue.databinding.DialogueFragmentAnswerDetailBinding;
import com.zykj.student.dialogue.p076ui.detail.AnswerDetailFragment;
import com.zykj.student.dialogue.p076ui.detail.viewmodel.AbstractC7538a;
import com.zykj.student.dialogue.p076ui.detail.viewmodel.AbstractC7539b;
import com.zykj.student.dialogue.p076ui.detail.viewmodel.AnswerViewModel;
import com.zykj.student.dialogue.p076ui.dialog.UnderstandDialog;
import com.zykj.student.dialogue.p076ui.widget.TouchSwitchMotionLayout;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.StateFlow;
import p138i6.AbstractC8136b;
import p214p6.C9336k;

@StabilityInferred(parameters = 0)
@Metadata(m13412d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000e\u001a\u00020\r2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0017¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0013\u0010\u0003J\u0017\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001b\u001a\u00020\u00188\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001b\u0010!\u001a\u00020\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0016\u0010%\u001a\u00020\"8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010)\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u001b\u0010/\u001a\u00020*8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.¨\u00060"}, m13413d2 = {"Lcom/zykj/student/dialogue/ui/detail/AnswerDetailFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "", "onCreate", "(Landroid/os/Bundle;)V", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onDestroy", "Landroid/content/Context;", "context", "onAttach", "(Landroid/content/Context;)V", "Lcom/zykj/student/dialogue/databinding/DialogueFragmentAnswerDetailBinding;", "f", "Lcom/zykj/student/dialogue/databinding/DialogueFragmentAnswerDetailBinding;", "binding", "Lcom/zykj/student/dialogue/ui/detail/AnswerDetailFragmentArgs;", "g", "Landroidx/navigation/NavArgsLazy;", "q", "()Lcom/zykj/student/dialogue/ui/detail/AnswerDetailFragmentArgs;", "args", "Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment;", "h", "Lcom/zykj/student/dialogue/ui/detail/AnswerPagerFragment;", "playMicroLessonFragment", "Lcom/zykj/student/dialogue/ui/detail/AnswerTabFragment;", "i", "Lcom/zykj/student/dialogue/ui/detail/AnswerTabFragment;", "answerTabFragment", "Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel;", "j", "Lkotlin/Lazy;", "r", "()Lcom/zykj/student/dialogue/ui/detail/viewmodel/AnswerViewModel;", "viewModel", "app_release"}, m13414k = 1, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nAnswerDetailFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnswerDetailFragment.kt\ncom/zykj/student/dialogue/ui/detail/AnswerDetailFragment\n+ 2 FragmentNavArgsLazy.kt\nandroidx/navigation/fragment/FragmentNavArgsLazyKt\n+ 3 HiltNavGraphViewModelLazy.kt\nandroidx/hilt/navigation/fragment/HiltNavGraphViewModelLazyKt\n+ 4 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,302:1\n42#2,3:303\n49#3,8:306\n257#4,2:314\n*S KotlinDebug\n*F\n+ 1 AnswerDetailFragment.kt\ncom/zykj/student/dialogue/ui/detail/AnswerDetailFragment\n*L\n45#1:303,3\n51#1:306,8\n93#1:314,2\n*E\n"})
/* loaded from: classes5.dex */
public final class AnswerDetailFragment extends Hilt_AnswerDetailFragment {

    /* renamed from: f, reason: from kotlin metadata */
    public DialogueFragmentAnswerDetailBinding binding;

    /* renamed from: h, reason: from kotlin metadata */
    public AnswerPagerFragment playMicroLessonFragment;

    /* renamed from: j, reason: from kotlin metadata */
    public final Lazy viewModel;

    /* renamed from: g, reason: from kotlin metadata */
    public final NavArgsLazy args = new NavArgsLazy(Reflection.getOrCreateKotlinClass(AnswerDetailFragmentArgs.class), new C7496a(this));

    /* renamed from: i, reason: from kotlin metadata */
    public final AnswerTabFragment answerTabFragment = new AnswerTabFragment();

    /* renamed from: com.zykj.student.dialogue.ui.detail.AnswerDetailFragment$a */
    public static final class C7496a implements Function0 {

        /* renamed from: a */
        public final /* synthetic */ Fragment f10842a;

        public C7496a(Fragment fragment) {
            this.f10842a = fragment;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Bundle invoke() {
            Bundle arguments = this.f10842a.getArguments();
            if (arguments != null) {
                return arguments;
            }
            throw new IllegalStateException("Fragment " + this.f10842a + " has null arguments");
        }
    }

    @Metadata(m13412d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13413d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13414k = 3, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(m13450c = "com.zykj.student.dialogue.ui.detail.AnswerDetailFragment$onCreate$1", m13451f = "AnswerDetailFragment.kt", m13452i = {}, m13453l = {}, m13454m = "invokeSuspend", m13455n = {}, m13456s = {})
    /* renamed from: com.zykj.student.dialogue.ui.detail.AnswerDetailFragment$onCreate$1 */
    public static final class C74971 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a */
        public int f10844a;

        /* renamed from: b */
        public /* synthetic */ Object f10845b;

        @Metadata(m13412d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13413d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13414k = 3, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
        @DebugMetadata(m13450c = "com.zykj.student.dialogue.ui.detail.AnswerDetailFragment$onCreate$1$1", m13451f = "AnswerDetailFragment.kt", m13452i = {}, m13453l = {PatchStatus.CODE_LOAD_UNDEFINED}, m13454m = "invokeSuspend", m13455n = {}, m13456s = {})
        /* renamed from: com.zykj.student.dialogue.ui.detail.AnswerDetailFragment$onCreate$1$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* renamed from: a */
            public int f10847a;

            /* renamed from: b */
            public final /* synthetic */ AnswerDetailFragment f10848b;

            @Metadata(m13412d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m13413d2 = {"<anonymous>", "", "isPermit", ""}, m13414k = 3, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
            @DebugMetadata(m13450c = "com.zykj.student.dialogue.ui.detail.AnswerDetailFragment$onCreate$1$1$1", m13451f = "AnswerDetailFragment.kt", m13452i = {}, m13453l = {}, m13454m = "invokeSuspend", m13455n = {}, m13456s = {})
            /* renamed from: com.zykj.student.dialogue.ui.detail.AnswerDetailFragment$onCreate$1$1$1, reason: invalid class name and collision with other inner class name */
            public static final class C100591 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {

                /* renamed from: a */
                public int f10849a;

                /* renamed from: b */
                public /* synthetic */ boolean f10850b;

                /* renamed from: c */
                public final /* synthetic */ AnswerDetailFragment f10851c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C100591(AnswerDetailFragment answerDetailFragment, Continuation continuation) {
                    super(2, continuation);
                    this.f10851c = answerDetailFragment;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation create(Object obj, Continuation continuation) {
                    C100591 c100591 = new C100591(this.f10851c, continuation);
                    c100591.f10850b = ((Boolean) obj).booleanValue();
                    return c100591;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
                    return invoke(bool.booleanValue(), continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    boolean z9 = this.f10850b;
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.f10849a != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    if (z9) {
                        return Unit.INSTANCE;
                    }
                    try {
                        FragmentKt.findNavController(this.f10851c).navigateUp();
                    } catch (Exception e10) {
                        e10.printStackTrace();
                    }
                    return Unit.INSTANCE;
                }

                public final Object invoke(boolean z9, Continuation continuation) {
                    return ((C100591) create(Boolean.valueOf(z9), continuation)).invokeSuspend(Unit.INSTANCE);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(AnswerDetailFragment answerDetailFragment, Continuation continuation) {
                super(2, continuation);
                this.f10848b = answerDetailFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new AnonymousClass1(this.f10848b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return invoke2(coroutineScope, (Continuation) continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i9 = this.f10847a;
                if (i9 == 0) {
                    ResultKt.throwOnFailure(obj);
                    MutableSharedFlow isPermit = this.f10848b.m10204r().getIsPermit();
                    C100591 c100591 = new C100591(this.f10848b, null);
                    this.f10847a = 1;
                    if (FlowKt.collectLatest(isPermit, c100591, this) == coroutine_suspended) {
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

        public C74971(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C74971 c74971 = AnswerDetailFragment.this.new C74971(continuation);
            c74971.f10845b = obj;
            return c74971;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return invoke2(coroutineScope, (Continuation) continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineScope coroutineScope = (CoroutineScope) this.f10845b;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f10844a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(AnswerDetailFragment.this, null), 3, null);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C74971) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Metadata(m13412d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13413d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13414k = 3, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(m13450c = "com.zykj.student.dialogue.ui.detail.AnswerDetailFragment$onViewCreated$1", m13451f = "AnswerDetailFragment.kt", m13452i = {}, m13453l = {}, m13454m = "invokeSuspend", m13455n = {}, m13456s = {})
    /* renamed from: com.zykj.student.dialogue.ui.detail.AnswerDetailFragment$onViewCreated$1 */
    public static final class C74981 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a */
        public int f10852a;

        /* renamed from: b */
        public /* synthetic */ Object f10853b;

        @Metadata(m13412d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13413d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13414k = 3, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
        @DebugMetadata(m13450c = "com.zykj.student.dialogue.ui.detail.AnswerDetailFragment$onViewCreated$1$1", m13451f = "AnswerDetailFragment.kt", m13452i = {}, m13453l = {ExitType.UNEXP_BACKGROUND_CRASH}, m13454m = "invokeSuspend", m13455n = {}, m13456s = {})
        /* renamed from: com.zykj.student.dialogue.ui.detail.AnswerDetailFragment$onViewCreated$1$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* renamed from: a */
            public int f10855a;

            /* renamed from: b */
            public final /* synthetic */ AnswerDetailFragment f10856b;

            @Metadata(m13412d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m13413d2 = {"Lp6/k;", "it", "", "<anonymous>", "(Lp6/k;)V"}, m13414k = 3, m13415mv = {2, 2, 0})
            @DebugMetadata(m13450c = "com.zykj.student.dialogue.ui.detail.AnswerDetailFragment$onViewCreated$1$1$2", m13451f = "AnswerDetailFragment.kt", m13452i = {}, m13453l = {}, m13454m = "invokeSuspend", m13455n = {}, m13456s = {})
            /* renamed from: com.zykj.student.dialogue.ui.detail.AnswerDetailFragment$onViewCreated$1$1$2, reason: invalid class name */
            public static final class AnonymousClass2 extends SuspendLambda implements Function2<C9336k, Continuation<? super Unit>, Object> {

                /* renamed from: a */
                public int f10857a;

                /* renamed from: b */
                public /* synthetic */ Object f10858b;

                /* renamed from: c */
                public final /* synthetic */ AnswerDetailFragment f10859c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass2(AnswerDetailFragment answerDetailFragment, Continuation continuation) {
                    super(2, continuation);
                    this.f10859c = answerDetailFragment;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(C9336k c9336k, Continuation continuation) {
                    return ((AnonymousClass2) create(c9336k, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation create(Object obj, Continuation continuation) {
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.f10859c, continuation);
                    anonymousClass2.f10858b = obj;
                    return anonymousClass2;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    C9336k c9336k = (C9336k) this.f10858b;
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.f10857a != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    DialogueFragmentAnswerDetailBinding dialogueFragmentAnswerDetailBinding = this.f10859c.binding;
                    DialogueFragmentAnswerDetailBinding dialogueFragmentAnswerDetailBinding2 = null;
                    if (dialogueFragmentAnswerDetailBinding == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        dialogueFragmentAnswerDetailBinding = null;
                    }
                    dialogueFragmentAnswerDetailBinding.f10422m.setSelected(c9336k.m15243r());
                    if (this.f10859c.m10203q().getFromCollectHistory()) {
                        DialogueFragmentAnswerDetailBinding dialogueFragmentAnswerDetailBinding3 = this.f10859c.binding;
                        if (dialogueFragmentAnswerDetailBinding3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("binding");
                            dialogueFragmentAnswerDetailBinding3 = null;
                        }
                        dialogueFragmentAnswerDetailBinding3.f10422m.setCompoundDrawablesWithIntrinsicBounds(R.drawable.drawable_collect_state, 0, 0, 0);
                        DialogueFragmentAnswerDetailBinding dialogueFragmentAnswerDetailBinding4 = this.f10859c.binding;
                        if (dialogueFragmentAnswerDetailBinding4 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("binding");
                            dialogueFragmentAnswerDetailBinding4 = null;
                        }
                        AppCompatTextView appCompatTextView = dialogueFragmentAnswerDetailBinding4.f10422m;
                        DialogueFragmentAnswerDetailBinding dialogueFragmentAnswerDetailBinding5 = this.f10859c.binding;
                        if (dialogueFragmentAnswerDetailBinding5 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("binding");
                        } else {
                            dialogueFragmentAnswerDetailBinding2 = dialogueFragmentAnswerDetailBinding5;
                        }
                        appCompatTextView.setText(dialogueFragmentAnswerDetailBinding2.f10422m.isSelected() ? "已收藏" : "未收藏");
                    }
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(AnswerDetailFragment answerDetailFragment, Continuation continuation) {
                super(2, continuation);
                this.f10856b = answerDetailFragment;
            }

            /* renamed from: c */
            public static final boolean m10207c(C9336k c9336k) {
                return c9336k.m15243r();
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new AnonymousClass1(this.f10856b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return invoke2(coroutineScope, (Continuation) continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i9 = this.f10855a;
                if (i9 == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow flowDistinctUntilChangedBy = FlowKt.distinctUntilChangedBy(this.f10856b.m10204r().getViewState(), new Function1() { // from class: com.zykj.student.dialogue.ui.detail.a
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return Boolean.valueOf(AnswerDetailFragment.C74981.AnonymousClass1.m10207c((C9336k) obj2));
                        }
                    });
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.f10856b, null);
                    this.f10855a = 1;
                    if (FlowKt.collectLatest(flowDistinctUntilChangedBy, anonymousClass2, this) == coroutine_suspended) {
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
        @DebugMetadata(m13450c = "com.zykj.student.dialogue.ui.detail.AnswerDetailFragment$onViewCreated$1$2", m13451f = "AnswerDetailFragment.kt", m13452i = {}, m13453l = {115}, m13454m = "invokeSuspend", m13455n = {}, m13456s = {})
        @SourceDebugExtension({"SMAP\nAnswerDetailFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnswerDetailFragment.kt\ncom/zykj/student/dialogue/ui/detail/AnswerDetailFragment$onViewCreated$1$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,302:1\n1563#2:303\n1634#2,3:304\n*S KotlinDebug\n*F\n+ 1 AnswerDetailFragment.kt\ncom/zykj/student/dialogue/ui/detail/AnswerDetailFragment$onViewCreated$1$2\n*L\n114#1:303\n114#1:304,3\n*E\n"})
        /* renamed from: com.zykj.student.dialogue.ui.detail.AnswerDetailFragment$onViewCreated$1$2, reason: invalid class name */
        public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* renamed from: a */
            public int f10860a;

            /* renamed from: b */
            public final /* synthetic */ AnswerDetailFragment f10861b;

            @Metadata(m13412d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m13413d2 = {"Lp6/k;", "it", "", "<anonymous>", "(Lp6/k;)V"}, m13414k = 3, m13415mv = {2, 2, 0})
            @DebugMetadata(m13450c = "com.zykj.student.dialogue.ui.detail.AnswerDetailFragment$onViewCreated$1$2$2", m13451f = "AnswerDetailFragment.kt", m13452i = {}, m13453l = {}, m13454m = "invokeSuspend", m13455n = {}, m13456s = {})
            /* renamed from: com.zykj.student.dialogue.ui.detail.AnswerDetailFragment$onViewCreated$1$2$2, reason: invalid class name and collision with other inner class name */
            public static final class C100602 extends SuspendLambda implements Function2<C9336k, Continuation<? super Unit>, Object> {

                /* renamed from: a */
                public int f10862a;

                /* renamed from: b */
                public /* synthetic */ Object f10863b;

                /* renamed from: c */
                public final /* synthetic */ AnswerDetailFragment f10864c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C100602(AnswerDetailFragment answerDetailFragment, Continuation continuation) {
                    super(2, continuation);
                    this.f10864c = answerDetailFragment;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(C9336k c9336k, Continuation continuation) {
                    return ((C100602) create(c9336k, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation create(Object obj, Continuation continuation) {
                    C100602 c100602 = new C100602(this.f10864c, continuation);
                    c100602.f10863b = obj;
                    return c100602;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    C9336k c9336k = (C9336k) this.f10863b;
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.f10862a != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    if (!c9336k.m15244s() && Result.m24765isSuccessimpl(c9336k.m15239n())) {
                        Object objM15239n = c9336k.m15239n();
                        AnswerPagerFragment answerPagerFragment = null;
                        if (Result.m24764isFailureimpl(objM15239n)) {
                            objM15239n = null;
                        }
                        Collection collection = (Collection) objM15239n;
                        if (collection != null && !collection.isEmpty()) {
                            this.f10864c.playMicroLessonFragment = new AnswerPagerFragment();
                            FragmentTransaction fragmentTransactionBeginTransaction = this.f10864c.getChildFragmentManager().beginTransaction();
                            int i9 = R.id.fl_container;
                            AnswerPagerFragment answerPagerFragment2 = this.f10864c.playMicroLessonFragment;
                            if (answerPagerFragment2 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("playMicroLessonFragment");
                            } else {
                                answerPagerFragment = answerPagerFragment2;
                            }
                            fragmentTransactionBeginTransaction.replace(i9, answerPagerFragment).commitNowAllowingStateLoss();
                        }
                    }
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(AnswerDetailFragment answerDetailFragment, Continuation continuation) {
                super(2, continuation);
                this.f10861b = answerDetailFragment;
            }

            /* renamed from: c */
            public static final boolean m10210c(C9336k c9336k, C9336k c9336k2) {
                ArrayList arrayList;
                if (c9336k.m15244s() != c9336k2.m15244s() || c9336k.m15241p() != c9336k2.m15241p()) {
                    return false;
                }
                Object objM15239n = c9336k2.m15239n();
                ArrayList arrayList2 = null;
                if (Result.m24764isFailureimpl(objM15239n)) {
                    objM15239n = null;
                }
                List list = (List) objM15239n;
                if (list != null) {
                    arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((MessageResponse) it.next()).getId());
                    }
                } else {
                    arrayList = null;
                }
                Object objM15239n2 = c9336k.m15239n();
                if (Result.m24764isFailureimpl(objM15239n2)) {
                    objM15239n2 = null;
                }
                List list2 = (List) objM15239n2;
                if (list2 != null) {
                    arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(((MessageResponse) it2.next()).getId());
                    }
                }
                return Intrinsics.areEqual(arrayList, arrayList2);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new AnonymousClass2(this.f10861b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return invoke2(coroutineScope, (Continuation) continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i9 = this.f10860a;
                if (i9 == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(this.f10861b.m10204r().getViewState(), new Function2() { // from class: com.zykj.student.dialogue.ui.detail.b
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj2, Object obj3) {
                            return Boolean.valueOf(AnswerDetailFragment.C74981.AnonymousClass2.m10210c((C9336k) obj2, (C9336k) obj3));
                        }
                    });
                    C100602 c100602 = new C100602(this.f10861b, null);
                    this.f10860a = 1;
                    if (FlowKt.collectLatest(flowDistinctUntilChanged, c100602, this) == coroutine_suspended) {
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

        public C74981(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C74981 c74981 = AnswerDetailFragment.this.new C74981(continuation);
            c74981.f10853b = obj;
            return c74981;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return invoke2(coroutineScope, (Continuation) continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineScope coroutineScope = (CoroutineScope) this.f10853b;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f10852a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(AnswerDetailFragment.this, null), 3, null);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass2(AnswerDetailFragment.this, null), 3, null);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C74981) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Metadata(m13412d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13413d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13414k = 3, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(m13450c = "com.zykj.student.dialogue.ui.detail.AnswerDetailFragment$onViewCreated$2", m13451f = "AnswerDetailFragment.kt", m13452i = {}, m13453l = {129}, m13454m = "invokeSuspend", m13455n = {}, m13456s = {})
    /* renamed from: com.zykj.student.dialogue.ui.detail.AnswerDetailFragment$onViewCreated$2 */
    public static final class C74992 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a */
        public int f10865a;

        @Metadata(m13412d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m13413d2 = {"<anonymous>", "", "it", "Lcom/zykj/student/dialogue/bean/resp/QuestionResp;"}, m13414k = 3, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
        @DebugMetadata(m13450c = "com.zykj.student.dialogue.ui.detail.AnswerDetailFragment$onViewCreated$2$1", m13451f = "AnswerDetailFragment.kt", m13452i = {}, m13453l = {}, m13454m = "invokeSuspend", m13455n = {}, m13456s = {})
        @SourceDebugExtension({"SMAP\nAnswerDetailFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnswerDetailFragment.kt\ncom/zykj/student/dialogue/ui/detail/AnswerDetailFragment$onViewCreated$2$1\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,302:1\n257#2,2:303\n257#2,2:305\n257#2,2:307\n*S KotlinDebug\n*F\n+ 1 AnswerDetailFragment.kt\ncom/zykj/student/dialogue/ui/detail/AnswerDetailFragment$onViewCreated$2$1\n*L\n131#1:303,2\n132#1:305,2\n133#1:307,2\n*E\n"})
        /* renamed from: com.zykj.student.dialogue.ui.detail.AnswerDetailFragment$onViewCreated$2$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<QuestionResp, Continuation<? super Unit>, Object> {

            /* renamed from: a */
            public int f10867a;

            /* renamed from: b */
            public /* synthetic */ Object f10868b;

            /* renamed from: c */
            public final /* synthetic */ AnswerDetailFragment f10869c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(AnswerDetailFragment answerDetailFragment, Continuation continuation) {
                super(2, continuation);
                this.f10869c = answerDetailFragment;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(QuestionResp questionResp, Continuation continuation) {
                return ((AnonymousClass1) create(questionResp, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f10869c, continuation);
                anonymousClass1.f10868b = obj;
                return anonymousClass1;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                QuestionResp questionResp = (QuestionResp) this.f10868b;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f10867a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                if (questionResp != null) {
                    AnswerDetailFragment answerDetailFragment = this.f10869c;
                    DialogueFragmentAnswerDetailBinding dialogueFragmentAnswerDetailBinding = answerDetailFragment.binding;
                    DialogueFragmentAnswerDetailBinding dialogueFragmentAnswerDetailBinding2 = null;
                    if (dialogueFragmentAnswerDetailBinding == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        dialogueFragmentAnswerDetailBinding = null;
                    }
                    AppCompatTextView tvUnderstood = dialogueFragmentAnswerDetailBinding.f10422m;
                    Intrinsics.checkNotNullExpressionValue(tvUnderstood, "tvUnderstood");
                    tvUnderstood.setVisibility(0);
                    DialogueFragmentAnswerDetailBinding dialogueFragmentAnswerDetailBinding3 = answerDetailFragment.binding;
                    if (dialogueFragmentAnswerDetailBinding3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        dialogueFragmentAnswerDetailBinding3 = null;
                    }
                    LinearLayoutCompat llClosedState = dialogueFragmentAnswerDetailBinding3.f10416g;
                    Intrinsics.checkNotNullExpressionValue(llClosedState, "llClosedState");
                    llClosedState.setVisibility(questionResp.getClosed() ? 0 : 8);
                    DialogueFragmentAnswerDetailBinding dialogueFragmentAnswerDetailBinding4 = answerDetailFragment.binding;
                    if (dialogueFragmentAnswerDetailBinding4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        dialogueFragmentAnswerDetailBinding4 = null;
                    }
                    View vClosedDivider = dialogueFragmentAnswerDetailBinding4.f10423n;
                    Intrinsics.checkNotNullExpressionValue(vClosedDivider, "vClosedDivider");
                    vClosedDivider.setVisibility(questionResp.getClosed() ? 0 : 8);
                    DialogueFragmentAnswerDetailBinding dialogueFragmentAnswerDetailBinding5 = answerDetailFragment.binding;
                    if (dialogueFragmentAnswerDetailBinding5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        dialogueFragmentAnswerDetailBinding5 = null;
                    }
                    dialogueFragmentAnswerDetailBinding5.f10421l.setText(questionResp.getSummary());
                    if (answerDetailFragment.m10203q().getFromCollectHistory()) {
                        DialogueFragmentAnswerDetailBinding dialogueFragmentAnswerDetailBinding6 = answerDetailFragment.binding;
                        if (dialogueFragmentAnswerDetailBinding6 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("binding");
                        } else {
                            dialogueFragmentAnswerDetailBinding2 = dialogueFragmentAnswerDetailBinding6;
                        }
                        dialogueFragmentAnswerDetailBinding2.f10422m.setCompoundDrawablesWithIntrinsicBounds(R.drawable.drawable_collect_state, 0, 0, 0);
                        answerDetailFragment.m10204r().m10480X(answerDetailFragment.m10203q().getIsCollected());
                    } else {
                        answerDetailFragment.m10204r().m10480X(questionResp.getState() == 2);
                    }
                }
                return Unit.INSTANCE;
            }
        }

        public C74992(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return AnswerDetailFragment.this.new C74992(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return invoke2(coroutineScope, (Continuation) continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i9 = this.f10865a;
            if (i9 == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow questionBean = AnswerDetailFragment.this.m10204r().getQuestionBean();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(AnswerDetailFragment.this, null);
                this.f10865a = 1;
                if (FlowKt.collectLatest(questionBean, anonymousClass1, this) == coroutine_suspended) {
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
            return ((C74992) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Metadata(m13412d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13413d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13414k = 3, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(m13450c = "com.zykj.student.dialogue.ui.detail.AnswerDetailFragment$onViewCreated$3", m13451f = "AnswerDetailFragment.kt", m13452i = {}, m13453l = {148}, m13454m = "invokeSuspend", m13455n = {}, m13456s = {})
    /* renamed from: com.zykj.student.dialogue.ui.detail.AnswerDetailFragment$onViewCreated$3 */
    public static final class C75003 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a */
        public int f10870a;

        @Metadata(m13412d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m13413d2 = {"Lcom/zykj/student/dialogue/ui/detail/viewmodel/b;", "it", "", "<anonymous>", "(Lcom/zykj/student/dialogue/ui/detail/viewmodel/b;)V"}, m13414k = 3, m13415mv = {2, 2, 0})
        @DebugMetadata(m13450c = "com.zykj.student.dialogue.ui.detail.AnswerDetailFragment$onViewCreated$3$1", m13451f = "AnswerDetailFragment.kt", m13452i = {}, m13453l = {}, m13454m = "invokeSuspend", m13455n = {}, m13456s = {})
        @SourceDebugExtension({"SMAP\nAnswerDetailFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnswerDetailFragment.kt\ncom/zykj/student/dialogue/ui/detail/AnswerDetailFragment$onViewCreated$3$1\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,302:1\n255#2:303\n*S KotlinDebug\n*F\n+ 1 AnswerDetailFragment.kt\ncom/zykj/student/dialogue/ui/detail/AnswerDetailFragment$onViewCreated$3$1\n*L\n207#1:303\n*E\n"})
        /* renamed from: com.zykj.student.dialogue.ui.detail.AnswerDetailFragment$onViewCreated$3$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<AbstractC7539b, Continuation<? super Unit>, Object> {

            /* renamed from: a */
            public int f10872a;

            /* renamed from: b */
            public /* synthetic */ Object f10873b;

            /* renamed from: c */
            public final /* synthetic */ AnswerDetailFragment f10874c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(AnswerDetailFragment answerDetailFragment, Continuation continuation) {
                super(2, continuation);
                this.f10874c = answerDetailFragment;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(AbstractC7539b abstractC7539b, Continuation continuation) {
                return ((AnonymousClass1) create(abstractC7539b, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f10874c, continuation);
                anonymousClass1.f10873b = obj;
                return anonymousClass1;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                AbstractC7539b abstractC7539b = (AbstractC7539b) this.f10873b;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f10872a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                DialogueFragmentAnswerDetailBinding dialogueFragmentAnswerDetailBinding = null;
                if (abstractC7539b instanceof AbstractC7539b.a) {
                    AbstractC7539b.a aVar = (AbstractC7539b.a) abstractC7539b;
                    aVar.m10505c();
                    final AnswerDetailFragment answerDetailFragment = this.f10874c;
                    if (aVar.m10505c()) {
                        DialogueFragmentAnswerDetailBinding dialogueFragmentAnswerDetailBinding2 = answerDetailFragment.binding;
                        if (dialogueFragmentAnswerDetailBinding2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("binding");
                            dialogueFragmentAnswerDetailBinding2 = null;
                        }
                        dialogueFragmentAnswerDetailBinding2.f10417h.transitionToEnd();
                    } else {
                        DialogueFragmentAnswerDetailBinding dialogueFragmentAnswerDetailBinding3 = answerDetailFragment.binding;
                        if (dialogueFragmentAnswerDetailBinding3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("binding");
                            dialogueFragmentAnswerDetailBinding3 = null;
                        }
                        dialogueFragmentAnswerDetailBinding3.f10417h.transitionToStart();
                    }
                    DialogueFragmentAnswerDetailBinding dialogueFragmentAnswerDetailBinding4 = answerDetailFragment.binding;
                    if (dialogueFragmentAnswerDetailBinding4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                    } else {
                        dialogueFragmentAnswerDetailBinding = dialogueFragmentAnswerDetailBinding4;
                    }
                    dialogueFragmentAnswerDetailBinding.f10417h.addTransitionListener(new MotionLayout.TransitionListener() { // from class: com.zykj.student.dialogue.ui.detail.AnswerDetailFragment$onViewCreated$3$1$1$1

                        /* renamed from: com.zykj.student.dialogue.ui.detail.AnswerDetailFragment$onViewCreated$3$1$1$1$a */
                        public static final class C7501a extends AnimatorListenerAdapter {

                            /* renamed from: a */
                            public final /* synthetic */ AnswerDetailFragment f10876a;

                            /* renamed from: b */
                            public final /* synthetic */ ViewPropertyAnimator f10877b;

                            public C7501a(AnswerDetailFragment answerDetailFragment, ViewPropertyAnimator viewPropertyAnimator) {
                                this.f10876a = answerDetailFragment;
                                this.f10877b = viewPropertyAnimator;
                            }

                            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                            public void onAnimationEnd(Animator animation) {
                                Intrinsics.checkNotNullParameter(animation, "animation");
                                DialogueFragmentAnswerDetailBinding dialogueFragmentAnswerDetailBinding = this.f10876a.binding;
                                if (dialogueFragmentAnswerDetailBinding == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                                    dialogueFragmentAnswerDetailBinding = null;
                                }
                                dialogueFragmentAnswerDetailBinding.f10411b.setVisibility(4);
                                this.f10877b.setListener(null);
                            }
                        }

                        @Override // androidx.constraintlayout.motion.widget.MotionLayout.TransitionListener
                        public void onTransitionChange(MotionLayout p02, int p12, int p22, float p32) {
                        }

                        @Override // androidx.constraintlayout.motion.widget.MotionLayout.TransitionListener
                        public void onTransitionCompleted(MotionLayout p02, int p12) {
                            if (((C9336k) answerDetailFragment.m10204r().getViewState().getValue()).m15244s()) {
                                answerDetailFragment.m10204r().m10481w(new AbstractC7538a.a(System.currentTimeMillis()));
                            } else {
                                answerDetailFragment.m10204r().m10481w(new AbstractC7538a.b(System.currentTimeMillis()));
                            }
                            DialogueFragmentAnswerDetailBinding dialogueFragmentAnswerDetailBinding5 = answerDetailFragment.binding;
                            DialogueFragmentAnswerDetailBinding dialogueFragmentAnswerDetailBinding6 = null;
                            if (dialogueFragmentAnswerDetailBinding5 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("binding");
                                dialogueFragmentAnswerDetailBinding5 = null;
                            }
                            dialogueFragmentAnswerDetailBinding5.f10417h.setIntercepted(false);
                            DialogueFragmentAnswerDetailBinding dialogueFragmentAnswerDetailBinding7 = answerDetailFragment.binding;
                            if (dialogueFragmentAnswerDetailBinding7 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("binding");
                            } else {
                                dialogueFragmentAnswerDetailBinding6 = dialogueFragmentAnswerDetailBinding7;
                            }
                            dialogueFragmentAnswerDetailBinding6.f10417h.removeTransitionListener(this);
                        }

                        @Override // androidx.constraintlayout.motion.widget.MotionLayout.TransitionListener
                        public void onTransitionStarted(MotionLayout p02, int p12, int p22) {
                            DialogueFragmentAnswerDetailBinding dialogueFragmentAnswerDetailBinding5 = answerDetailFragment.binding;
                            DialogueFragmentAnswerDetailBinding dialogueFragmentAnswerDetailBinding6 = null;
                            if (dialogueFragmentAnswerDetailBinding5 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("binding");
                                dialogueFragmentAnswerDetailBinding5 = null;
                            }
                            dialogueFragmentAnswerDetailBinding5.f10417h.setIntercepted(true);
                            DialogueFragmentAnswerDetailBinding dialogueFragmentAnswerDetailBinding7 = answerDetailFragment.binding;
                            if (dialogueFragmentAnswerDetailBinding7 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("binding");
                            } else {
                                dialogueFragmentAnswerDetailBinding6 = dialogueFragmentAnswerDetailBinding7;
                            }
                            ViewPropertyAnimator viewPropertyAnimatorAnimate = dialogueFragmentAnswerDetailBinding6.f10411b.animate();
                            viewPropertyAnimatorAnimate.alpha(0.0f).setDuration(300L).setListener(new C7501a(answerDetailFragment, viewPropertyAnimatorAnimate));
                        }

                        @Override // androidx.constraintlayout.motion.widget.MotionLayout.TransitionListener
                        public void onTransitionTrigger(MotionLayout p02, int p12, boolean p22, float p32) {
                        }
                    });
                } else if (abstractC7539b instanceof AbstractC7539b.b) {
                    DialogueFragmentAnswerDetailBinding dialogueFragmentAnswerDetailBinding5 = this.f10874c.binding;
                    if (dialogueFragmentAnswerDetailBinding5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        dialogueFragmentAnswerDetailBinding5 = null;
                    }
                    FrameLayout flContainer = dialogueFragmentAnswerDetailBinding5.f10411b;
                    Intrinsics.checkNotNullExpressionValue(flContainer, "flContainer");
                    if (flContainer.getVisibility() != 0) {
                        DialogueFragmentAnswerDetailBinding dialogueFragmentAnswerDetailBinding6 = this.f10874c.binding;
                        if (dialogueFragmentAnswerDetailBinding6 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("binding");
                        } else {
                            dialogueFragmentAnswerDetailBinding = dialogueFragmentAnswerDetailBinding6;
                        }
                        FrameLayout frameLayout = dialogueFragmentAnswerDetailBinding.f10411b;
                        frameLayout.setAlpha(0.0f);
                        frameLayout.setVisibility(0);
                        frameLayout.animate().alpha(1.0f).setDuration(300L);
                    }
                }
                return Unit.INSTANCE;
            }
        }

        public C75003(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return AnswerDetailFragment.this.new C75003(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return invoke2(coroutineScope, (Continuation) continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i9 = this.f10870a;
            if (i9 == 0) {
                ResultKt.throwOnFailure(obj);
                SharedFlow event = AnswerDetailFragment.this.m10204r().getAndroidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(AnswerDetailFragment.this, null);
                this.f10870a = 1;
                if (FlowKt.collectLatest(event, anonymousClass1, this) == coroutine_suspended) {
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
            return ((C75003) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public AnswerDetailFragment() {
        final int i9 = R.id.dialogue_detail_main;
        final Lazy lazy = LazyKt.lazy(new Function0<NavBackStackEntry>() { // from class: com.zykj.student.dialogue.ui.detail.AnswerDetailFragment$special$$inlined$hiltNavGraphViewModels$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final NavBackStackEntry invoke() {
                return FragmentKt.findNavController(this).getBackStackEntry(i9);
            }
        });
        this.viewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(AnswerViewModel.class), new Function0<ViewModelStore>() { // from class: com.zykj.student.dialogue.ui.detail.AnswerDetailFragment$special$$inlined$hiltNavGraphViewModels$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                return HiltNavGraphViewModelLazyKt.m24491hiltNavGraphViewModels$lambda0(lazy).getViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.zykj.student.dialogue.ui.detail.AnswerDetailFragment$special$$inlined$hiltNavGraphViewModels$3
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                return HiltNavGraphViewModelLazyKt.m24491hiltNavGraphViewModels$lambda0(lazy).getDefaultViewModelCreationExtras();
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.zykj.student.dialogue.ui.detail.AnswerDetailFragment$special$$inlined$hiltNavGraphViewModels$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                FragmentActivity fragmentActivityRequireActivity = this.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity()");
                return HiltViewModelFactory.create(fragmentActivityRequireActivity, HiltNavGraphViewModelLazyKt.m24491hiltNavGraphViewModels$lambda0(lazy).getDefaultViewModelProviderFactory());
            }
        });
    }

    /* renamed from: s */
    public static final Unit m10198s(AnswerDetailFragment answerDetailFragment, View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        try {
            FragmentKt.findNavController(answerDetailFragment).navigateUp();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        return Unit.INSTANCE;
    }

    /* renamed from: t */
    public static final Unit m10199t(final AnswerDetailFragment answerDetailFragment, View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        final Function0 function0 = new Function0() { // from class: o6.c
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AnswerDetailFragment.m10200u(this.f15588a);
            }
        };
        if (answerDetailFragment.m10203q().getFromCollectHistory() || !((C9336k) answerDetailFragment.m10204r().getViewState().getValue()).m15243r()) {
            answerDetailFragment.m10204r().m10470N(new Function0() { // from class: o6.d
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AnswerDetailFragment.m10201v(this.f15590a, function0);
                }
            }, function0);
            return Unit.INSTANCE;
        }
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* renamed from: u */
    public static final Unit m10200u(AnswerDetailFragment answerDetailFragment) {
        if (answerDetailFragment.m10203q().getFromCollectHistory()) {
            answerDetailFragment.m10204r().m10479W();
        } else {
            answerDetailFragment.m10204r().m10476T();
        }
        return Unit.INSTANCE;
    }

    /* renamed from: v */
    public static final Unit m10201v(final AnswerDetailFragment answerDetailFragment, final Function0 function0) {
        UnderstandDialog understandDialogM10518a = UnderstandDialog.INSTANCE.m10518a(answerDetailFragment.m10203q().getFromCollectHistory());
        understandDialogM10518a.m10517i(new Function1() { // from class: o6.e
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AnswerDetailFragment.m10202w(this.f15594a, function0, ((Boolean) obj).booleanValue());
            }
        });
        understandDialogM10518a.show(answerDetailFragment.getParentFragmentManager(), "UnderstandDialog");
        return Unit.INSTANCE;
    }

    /* renamed from: w */
    public static final Unit m10202w(AnswerDetailFragment answerDetailFragment, Function0 function0, boolean z9) {
        if (z9) {
            answerDetailFragment.m10204r().m10473Q();
        }
        function0.invoke();
        return Unit.INSTANCE;
    }

    @Override // com.zykj.student.dialogue.p076ui.detail.Hilt_AnswerDetailFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        requireActivity().getOnBackPressedDispatcher().addCallback(this, new OnBackPressedCallback() { // from class: com.zykj.student.dialogue.ui.detail.AnswerDetailFragment$onAttach$callback$1
            {
                super(true);
            }

            @Override // androidx.activity.OnBackPressedCallback
            public void handleOnBackPressed() {
                try {
                    FragmentKt.findNavController(this.f10843a).navigateUp();
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
            }
        });
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        m10204r().m10474R(m10203q().getQuestionId(), m10203q().getFromCollectHistory());
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C74971(null), 3, null);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        DialogueFragmentAnswerDetailBinding dialogueFragmentAnswerDetailBindingM9938c = DialogueFragmentAnswerDetailBinding.m9938c(inflater, container, false);
        Intrinsics.checkNotNullExpressionValue(dialogueFragmentAnswerDetailBindingM9938c, "inflate(...)");
        this.binding = dialogueFragmentAnswerDetailBindingM9938c;
        if (dialogueFragmentAnswerDetailBindingM9938c == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            dialogueFragmentAnswerDetailBindingM9938c = null;
        }
        TouchSwitchMotionLayout touchSwitchMotionLayoutM9939b = dialogueFragmentAnswerDetailBindingM9938c.getRoot();
        Intrinsics.checkNotNullExpressionValue(touchSwitchMotionLayoutM9939b, "getRoot(...)");
        return touchSwitchMotionLayoutM9939b;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        if (m10204r().getQuestionBean().getValue() != null) {
            androidx.fragment.app.FragmentKt.setFragmentResult(this, "KEY_REFRESH_COLLECT_STATE", BundleKt.bundleOf(TuplesKt.m13420to("isCollected", Boolean.valueOf(((C9336k) m10204r().getViewState().getValue()).m15243r())), TuplesKt.m13420to("sessionId", m10203q().getQuestionId())));
            FragmentManager supportFragmentManager = requireActivity().getSupportFragmentManager();
            Pair pairM13420to = TuplesKt.m13420to("sessionId", m10203q().getQuestionId());
            Pair pairM13420to2 = TuplesKt.m13420to("mustRefresh", m10204r().getHasChanged().getValue());
            DialogueFragmentAnswerDetailBinding dialogueFragmentAnswerDetailBinding = this.binding;
            if (dialogueFragmentAnswerDetailBinding == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                dialogueFragmentAnswerDetailBinding = null;
            }
            supportFragmentManager.setFragmentResult("KEY_REFRESH_UNDERSTOOD_STATE", BundleKt.bundleOf(pairM13420to, pairM13420to2, TuplesKt.m13420to("state", Integer.valueOf(dialogueFragmentAnswerDetailBinding.f10422m.isSelected() ? 2 : 1))));
        }
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        getChildFragmentManager().beginTransaction().replace(R.id.fl_tab, this.answerTabFragment).commitNowAllowingStateLoss();
        DialogueFragmentAnswerDetailBinding dialogueFragmentAnswerDetailBinding = this.binding;
        DialogueFragmentAnswerDetailBinding dialogueFragmentAnswerDetailBinding2 = null;
        if (dialogueFragmentAnswerDetailBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            dialogueFragmentAnswerDetailBinding = null;
        }
        FrameLayout flTab = dialogueFragmentAnswerDetailBinding.f10412c;
        Intrinsics.checkNotNullExpressionValue(flTab, "flTab");
        flTab.setVisibility(!m10203q().getFromCollectHistory() ? 0 : 8);
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new C74981(null), 3, null);
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner2), null, null, new C74992(null), 3, null);
        LifecycleOwner viewLifecycleOwner3 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "getViewLifecycleOwner(...)");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner3), null, null, new C75003(null), 3, null);
        DialogueFragmentAnswerDetailBinding dialogueFragmentAnswerDetailBinding3 = this.binding;
        if (dialogueFragmentAnswerDetailBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            dialogueFragmentAnswerDetailBinding3 = null;
        }
        XUIAlphaImageButton ivBack = dialogueFragmentAnswerDetailBinding3.f10414e;
        Intrinsics.checkNotNullExpressionValue(ivBack, "ivBack");
        AbstractC8136b.m13040h(ivBack, new Function1() { // from class: o6.a
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AnswerDetailFragment.m10198s(this.f15583a, (View) obj);
            }
        });
        DialogueFragmentAnswerDetailBinding dialogueFragmentAnswerDetailBinding4 = this.binding;
        if (dialogueFragmentAnswerDetailBinding4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            dialogueFragmentAnswerDetailBinding2 = dialogueFragmentAnswerDetailBinding4;
        }
        AppCompatTextView tvUnderstood = dialogueFragmentAnswerDetailBinding2.f10422m;
        Intrinsics.checkNotNullExpressionValue(tvUnderstood, "tvUnderstood");
        AbstractC8136b.m13040h(tvUnderstood, new Function1() { // from class: o6.b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AnswerDetailFragment.m10199t(this.f15585a, (View) obj);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: q */
    public final AnswerDetailFragmentArgs m10203q() {
        return (AnswerDetailFragmentArgs) this.args.getValue();
    }

    /* renamed from: r */
    public final AnswerViewModel m10204r() {
        return (AnswerViewModel) this.viewModel.getValue();
    }
}
