package com.zykj.student.dialogue.p076ui.detail;

import android.os.Bundle;
import androidx.activity.OnBackPressedCallback;
import androidx.activity.OnBackPressedDispatcherKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentKt;
import androidx.navigation.NavArgsLazy;
import com.zykj.base.BaseFragment;
import com.zykj.student.dialogue.R;
import com.zykj.student.dialogue.databinding.DialogueFragmentSketchCropBinding;
import com.zykj.student.dialogue.p076ui.detail.DialogueSketchCropFragment;
import com.zykj.view.board.crop.BlackboardCropFragment;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import p036c7.C5234a;

@StabilityInferred(parameters = 0)
@Metadata(m13412d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0094@¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000f\u0010\u0004J\u000f\u0010\u0010\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0010\u0010\u0004J\u000f\u0010\u0011\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0011\u0010\u0004J\u000f\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\u001b\u0010\u001a\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, m13413d2 = {"Lcom/zykj/student/dialogue/ui/detail/DialogueSketchCropFragment;", "Lcom/zykj/base/BaseFragment;", "Lcom/zykj/student/dialogue/databinding/DialogueFragmentSketchCropBinding;", "<init>", "()V", "", "layoutId", "()I", "", "initData", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroid/os/Bundle;", "savedInstanceState", "initView", "(Landroid/os/Bundle;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "j", "g", "l", "Lcom/zykj/view/board/crop/BlackboardCropFragment;", "i", "()Lcom/zykj/view/board/crop/BlackboardCropFragment;", "Lcom/zykj/student/dialogue/ui/detail/DialogueSketchCropFragmentArgs;", "a", "Landroidx/navigation/NavArgsLazy;", "h", "()Lcom/zykj/student/dialogue/ui/detail/DialogueSketchCropFragmentArgs;", "args", "app_release"}, m13414k = 1, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nDialogueSketchCropFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DialogueSketchCropFragment.kt\ncom/zykj/student/dialogue/ui/detail/DialogueSketchCropFragment\n+ 2 FragmentNavArgsLazy.kt\nandroidx/navigation/fragment/FragmentNavArgsLazyKt\n*L\n1#1,78:1\n42#2,3:79\n*S KotlinDebug\n*F\n+ 1 DialogueSketchCropFragment.kt\ncom/zykj/student/dialogue/ui/detail/DialogueSketchCropFragment\n*L\n17#1:79,3\n*E\n"})
/* loaded from: classes5.dex */
public final class DialogueSketchCropFragment extends BaseFragment<DialogueFragmentSketchCropBinding> {

    /* renamed from: a, reason: from kotlin metadata */
    public final NavArgsLazy args = new NavArgsLazy(Reflection.getOrCreateKotlinClass(DialogueSketchCropFragmentArgs.class), new C7513a(this));

    /* renamed from: com.zykj.student.dialogue.ui.detail.DialogueSketchCropFragment$a */
    public static final class C7513a implements Function0 {

        /* renamed from: a */
        public final /* synthetic */ Fragment f11008a;

        public C7513a(Fragment fragment) {
            this.f11008a = fragment;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Bundle invoke() {
            Bundle arguments = this.f11008a.getArguments();
            if (arguments != null) {
                return arguments;
            }
            throw new IllegalStateException("Fragment " + this.f11008a + " has null arguments");
        }
    }

    /* renamed from: k */
    public static final Unit m10332k(DialogueSketchCropFragment dialogueSketchCropFragment, OnBackPressedCallback addCallback) {
        Intrinsics.checkNotNullParameter(addCallback, "$this$addCallback");
        dialogueSketchCropFragment.m10336g();
        return Unit.INSTANCE;
    }

    /* renamed from: m */
    public static final Unit m10333m(DialogueSketchCropFragment dialogueSketchCropFragment) {
        dialogueSketchCropFragment.m10336g();
        return Unit.INSTANCE;
    }

    /* renamed from: n */
    public static final Unit m10334n(DialogueSketchCropFragment dialogueSketchCropFragment) {
        dialogueSketchCropFragment.m10336g();
        return Unit.INSTANCE;
    }

    /* renamed from: o */
    public static final Unit m10335o(DialogueSketchCropFragment dialogueSketchCropFragment, BlackboardCropFragment blackboardCropFragment, boolean z9) {
        if (z9) {
            dialogueSketchCropFragment.m10336g();
        } else {
            blackboardCropFragment.m11526O(dialogueSketchCropFragment.m10337h().getLocalPath());
        }
        return Unit.INSTANCE;
    }

    /* renamed from: g */
    public final void m10336g() {
        FragmentKt.setFragmentResult(this, m10337h().getRequestKey(), BundleKt.bundleOf(TuplesKt.m13420to("RESULT_KEY_ACTION", "RESULT_VALUE_ACTION_EDIT")));
        androidx.navigation.fragment.FragmentKt.findNavController(this).navigateUp();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: h */
    public final DialogueSketchCropFragmentArgs m10337h() {
        return (DialogueSketchCropFragmentArgs) this.args.getValue();
    }

    /* renamed from: i */
    public final BlackboardCropFragment m10338i() {
        Fragment fragmentFindFragmentById = getChildFragmentManager().findFragmentById(R.id.fragment_container_sketch_crop);
        Intrinsics.checkNotNull(fragmentFindFragmentById, "null cannot be cast to non-null type com.zykj.view.board.crop.BlackboardCropFragment");
        return (BlackboardCropFragment) fragmentFindFragmentById;
    }

    @Override // com.zykj.base.BaseFragment
    public Object initData(Continuation continuation) {
        Object objInitData = super.initData(continuation);
        return objInitData == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInitData : Unit.INSTANCE;
    }

    @Override // com.zykj.base.BaseFragment
    public Object initView(Bundle bundle, Continuation continuation) {
        m10339j();
        m10340l();
        return Unit.INSTANCE;
    }

    /* renamed from: j */
    public final void m10339j() {
        OnBackPressedDispatcherKt.addCallback$default(requireActivity().getOnBackPressedDispatcher(), getViewLifecycleOwner(), false, new Function1() { // from class: o6.y
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DialogueSketchCropFragment.m10332k(this.f15623a, (OnBackPressedCallback) obj);
            }
        }, 2, null);
    }

    /* renamed from: l */
    public final void m10340l() {
        final BlackboardCropFragment blackboardCropFragmentM10338i = m10338i();
        blackboardCropFragmentM10338i.m11527Z(new C5234a(new Function0() { // from class: o6.z
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DialogueSketchCropFragment.m10333m(this.f15624a);
            }
        }, new Function0() { // from class: o6.a0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DialogueSketchCropFragment.m10334n(this.f15584a);
            }
        }, null, new Function1() { // from class: o6.b0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DialogueSketchCropFragment.m10335o(this.f15586a, blackboardCropFragmentM10338i, ((Boolean) obj).booleanValue());
            }
        }, 4, null));
        blackboardCropFragmentM10338i.m11526O(m10337h().getLocalPath());
    }

    @Override // com.zykj.base.BaseFragment
    public int layoutId() {
        return R.layout.dialogue_fragment_sketch_crop;
    }
}
