package com.zykj.student.dialogue.p076ui.detail;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.OnBackPressedCallback;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.navigation.NavArgsLazy;
import androidx.navigation.fragment.FragmentKt;
import com.zykj.student.dialogue.R;
import com.zykj.student.dialogue.databinding.DialogueFragmentPlayLessonBinding;
import com.zykj.student.dialogue.p076ui.detail.PlayLessonFragment;
import com.zykj.view.board.play.SketchPlayFragment;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import p097e7.C7853a;

@StabilityInferred(parameters = 0)
@Metadata(m13412d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0018\u001a\u00020\u00158\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001c\u001a\u00020\u00198\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001b\u0010\"\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!¨\u0006#"}, m13413d2 = {"Lcom/zykj/student/dialogue/ui/detail/PlayLessonFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Landroid/content/Context;", "context", "onAttach", "(Landroid/content/Context;)V", "Lcom/zykj/student/dialogue/databinding/DialogueFragmentPlayLessonBinding;", "f", "Lcom/zykj/student/dialogue/databinding/DialogueFragmentPlayLessonBinding;", "binding", "Lcom/zykj/view/board/play/SketchPlayFragment;", "g", "Lcom/zykj/view/board/play/SketchPlayFragment;", "sketchPlayFragment", "Lcom/zykj/student/dialogue/ui/detail/PlayLessonFragmentArgs;", "h", "Landroidx/navigation/NavArgsLazy;", "i", "()Lcom/zykj/student/dialogue/ui/detail/PlayLessonFragmentArgs;", "args", "app_release"}, m13414k = 1, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nPlayLessonFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlayLessonFragment.kt\ncom/zykj/student/dialogue/ui/detail/PlayLessonFragment\n+ 2 FragmentNavArgsLazy.kt\nandroidx/navigation/fragment/FragmentNavArgsLazyKt\n*L\n1#1,89:1\n42#2,3:90\n*S KotlinDebug\n*F\n+ 1 PlayLessonFragment.kt\ncom/zykj/student/dialogue/ui/detail/PlayLessonFragment\n*L\n24#1:90,3\n*E\n"})
/* loaded from: classes5.dex */
public final class PlayLessonFragment extends Hilt_PlayLessonFragment {

    /* renamed from: f, reason: from kotlin metadata */
    public DialogueFragmentPlayLessonBinding binding;

    /* renamed from: g, reason: from kotlin metadata */
    public SketchPlayFragment sketchPlayFragment;

    /* renamed from: h, reason: from kotlin metadata */
    public final NavArgsLazy args = new NavArgsLazy(Reflection.getOrCreateKotlinClass(PlayLessonFragmentArgs.class), new C7521a(this));

    /* renamed from: com.zykj.student.dialogue.ui.detail.PlayLessonFragment$a */
    public static final class C7521a implements Function0 {

        /* renamed from: a */
        public final /* synthetic */ Fragment f11123a;

        public C7521a(Fragment fragment) {
            this.f11123a = fragment;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Bundle invoke() {
            Bundle arguments = this.f11123a.getArguments();
            if (arguments != null) {
                return arguments;
            }
            throw new IllegalStateException("Fragment " + this.f11123a + " has null arguments");
        }
    }

    @Metadata(m13412d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m13413d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13414k = 3, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(m13450c = "com.zykj.student.dialogue.ui.detail.PlayLessonFragment$onViewCreated$2", m13451f = "PlayLessonFragment.kt", m13452i = {}, m13453l = {}, m13454m = "invokeSuspend", m13455n = {}, m13456s = {})
    /* renamed from: com.zykj.student.dialogue.ui.detail.PlayLessonFragment$onViewCreated$2 */
    public static final class C75222 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a */
        public int f11125a;

        public C75222(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return PlayLessonFragment.this.new C75222(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return invoke2(coroutineScope, (Continuation) continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f11125a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            SketchPlayFragment sketchPlayFragment = PlayLessonFragment.this.sketchPlayFragment;
            if (sketchPlayFragment == null) {
                Intrinsics.throwUninitializedPropertyAccessException("sketchPlayFragment");
                sketchPlayFragment = null;
            }
            sketchPlayFragment.m11750v0(R.color.color_primary);
            Drawable drawable = ContextCompat.getDrawable(sketchPlayFragment.requireContext(), R.drawable.dialogue_seekbar_style);
            if (drawable != null) {
                sketchPlayFragment.m11749u0(drawable);
            }
            Drawable drawable2 = ContextCompat.getDrawable(sketchPlayFragment.requireContext(), R.drawable.dialogue_speed_rate);
            if (drawable2 != null) {
                sketchPlayFragment.m11753y0(drawable2);
            }
            sketchPlayFragment.m11754z0(R.color.dialogue_speed_rate_item_color);
            sketchPlayFragment.m11740l0(true);
            sketchPlayFragment.m11751w0(true);
            sketchPlayFragment.m11745q0(true);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C75222) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* renamed from: j */
    public static final Unit m10442j(PlayLessonFragment playLessonFragment) {
        FragmentKt.findNavController(playLessonFragment).navigateUp();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: i */
    public final PlayLessonFragmentArgs m10443i() {
        return (PlayLessonFragmentArgs) this.args.getValue();
    }

    @Override // com.zykj.student.dialogue.p076ui.detail.Hilt_PlayLessonFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        requireActivity().getOnBackPressedDispatcher().addCallback(this, new OnBackPressedCallback() { // from class: com.zykj.student.dialogue.ui.detail.PlayLessonFragment$onAttach$callback$1
            {
                super(true);
            }

            @Override // androidx.activity.OnBackPressedCallback
            public void handleOnBackPressed() {
                FragmentKt.findNavController(this.f11124a).navigateUp();
            }
        });
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        DialogueFragmentPlayLessonBinding dialogueFragmentPlayLessonBindingM9948a = DialogueFragmentPlayLessonBinding.m9948a(inflater, container, false);
        Intrinsics.checkNotNullExpressionValue(dialogueFragmentPlayLessonBindingM9948a, "inflate(...)");
        this.binding = dialogueFragmentPlayLessonBindingM9948a;
        if (dialogueFragmentPlayLessonBindingM9948a == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            dialogueFragmentPlayLessonBindingM9948a = null;
        }
        View root = dialogueFragmentPlayLessonBindingM9948a.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        SketchPlayFragment sketchPlayFragment;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        SketchPlayFragment sketchPlayFragment2 = new SketchPlayFragment();
        this.sketchPlayFragment = sketchPlayFragment2;
        sketchPlayFragment2.m11746r0(new C7853a(false, new Function0() { // from class: o6.q0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PlayLessonFragment.m10442j(this.f15616a);
            }
        }, null, false, null, null, null, null, true, false, 765, null));
        FragmentTransaction fragmentTransactionBeginTransaction = getChildFragmentManager().beginTransaction();
        int i9 = R.id.fl_container;
        SketchPlayFragment sketchPlayFragment3 = this.sketchPlayFragment;
        if (sketchPlayFragment3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sketchPlayFragment");
            sketchPlayFragment3 = null;
        }
        fragmentTransactionBeginTransaction.replace(i9, sketchPlayFragment3).commitNowAllowingStateLoss();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner).launchWhenStarted(new C75222(null));
        SketchPlayFragment sketchPlayFragment4 = this.sketchPlayFragment;
        if (sketchPlayFragment4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sketchPlayFragment");
            sketchPlayFragment = null;
        } else {
            sketchPlayFragment = sketchPlayFragment4;
        }
        SketchPlayFragment.m11695h0(sketchPlayFragment, m10443i().getPath(), 0, false, null, null, 30, null);
    }
}
