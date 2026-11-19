package com.zykj.student.dialogue.p076ui.ask;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.OnBackPressedCallback;
import androidx.compose.p012ui.platform.ComposeView;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.navigation.NavArgsLazy;
import androidx.navigation.NavController;
import androidx.navigation.fragment.FragmentKt;
import com.blankj.utilcode.constant.PermissionConstants;
import com.blankj.utilcode.util.PermissionUtils;
import com.zykj.base.utils.XToastUtils;
import com.zykj.student.dialogue.R;
import com.zykj.student.dialogue.p076ui.ask.AskDescriptionFragment;
import com.zykj.student.dialogue.p076ui.detail.NewAnswerFragmentArgs;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import p180m6.AbstractC8991d0;

@StabilityInferred(parameters = 0)
@Metadata(m13412d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000e\u001a\u00020\r2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0014\u0010\u0003R\u001b\u0010\u001a\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001b\u0010 \u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, m13413d2 = {"Lcom/zykj/student/dialogue/ui/ask/AskDescriptionFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/content/Context;", "context", "onAttach", "(Landroid/content/Context;)V", "n", "Lcom/zykj/student/dialogue/ui/ask/AskQuestionViewModel;", "f", "Lkotlin/Lazy;", "m", "()Lcom/zykj/student/dialogue/ui/ask/AskQuestionViewModel;", "viewModel", "Lcom/zykj/student/dialogue/ui/ask/AskDescriptionFragmentArgs;", "g", "Landroidx/navigation/NavArgsLazy;", "l", "()Lcom/zykj/student/dialogue/ui/ask/AskDescriptionFragmentArgs;", "args", "app_release"}, m13414k = 1, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nAskDescriptionFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AskDescriptionFragment.kt\ncom/zykj/student/dialogue/ui/ask/AskDescriptionFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 FragmentNavArgsLazy.kt\nandroidx/navigation/fragment/FragmentNavArgsLazyKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,83:1\n106#2,15:84\n42#3,3:99\n1247#4,6:102\n1247#4,6:108\n*S KotlinDebug\n*F\n+ 1 AskDescriptionFragment.kt\ncom/zykj/student/dialogue/ui/ask/AskDescriptionFragment\n*L\n24#1:84,15\n26#1:99,3\n35#1:102,6\n37#1:108,6\n*E\n"})
/* loaded from: classes5.dex */
public final class AskDescriptionFragment extends Hilt_AskDescriptionFragment {

    /* renamed from: f, reason: from kotlin metadata */
    public final Lazy viewModel;

    /* renamed from: g, reason: from kotlin metadata */
    public final NavArgsLazy args;

    /* renamed from: com.zykj.student.dialogue.ui.ask.AskDescriptionFragment$a */
    public static final class C7457a implements Function0 {

        /* renamed from: a */
        public final /* synthetic */ Fragment f10613a;

        public C7457a(Fragment fragment) {
            this.f10613a = fragment;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Bundle invoke() {
            Bundle arguments = this.f10613a.getArguments();
            if (arguments != null) {
                return arguments;
            }
            throw new IllegalStateException("Fragment " + this.f10613a + " has null arguments");
        }
    }

    public AskDescriptionFragment() {
        final Function0<Fragment> function0 = new Function0<Fragment>() { // from class: com.zykj.student.dialogue.ui.ask.AskDescriptionFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Fragment invoke() {
                return this;
            }
        };
        final Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.zykj.student.dialogue.ui.ask.AskDescriptionFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) function0.invoke();
            }
        });
        final Function0 function02 = null;
        this.viewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(AskQuestionViewModel.class), new Function0<ViewModelStore>() { // from class: com.zykj.student.dialogue.ui.ask.AskDescriptionFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                return FragmentViewModelLazyKt.m24488viewModels$lambda1(lazy).getViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.zykj.student.dialogue.ui.ask.AskDescriptionFragment$special$$inlined$viewModels$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function03 = function02;
                if (function03 != null && (creationExtras = (CreationExtras) function03.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM24488viewModels$lambda1 = FragmentViewModelLazyKt.m24488viewModels$lambda1(lazy);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM24488viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM24488viewModels$lambda1 : null;
                return hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.zykj.student.dialogue.ui.ask.AskDescriptionFragment$special$$inlined$viewModels$default$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory;
                ViewModelStoreOwner viewModelStoreOwnerM24488viewModels$lambda1 = FragmentViewModelLazyKt.m24488viewModels$lambda1(lazy);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM24488viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM24488viewModels$lambda1 : null;
                return (hasDefaultViewModelProviderFactory == null || (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) == null) ? this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
            }
        });
        this.args = new NavArgsLazy(Reflection.getOrCreateKotlinClass(AskDescriptionFragmentArgs.class), new C7457a(this));
    }

    /* renamed from: o */
    public static final void m10007o(boolean z9, List list, List list2, List list3) {
        Intrinsics.checkNotNullParameter(list, "<unused var>");
        Intrinsics.checkNotNullParameter(list2, "<unused var>");
        Intrinsics.checkNotNullParameter(list3, "<unused var>");
        if (z9) {
            return;
        }
        XToastUtils.INSTANCE.warning("未取得存储权限，画板添加图片功能将受到影响");
    }

    /* renamed from: p */
    public static final Unit m10008p(final AskDescriptionFragment askDescriptionFragment, Composer composer, int i9) {
        if (composer.shouldExecute((i9 & 3) != 2, i9 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1568725911, i9, -1, "com.zykj.student.dialogue.ui.ask.AskDescriptionFragment.onCreateView.<anonymous>.<anonymous> (AskDescriptionFragment.kt:34)");
            }
            AskQuestionViewModel askQuestionViewModelM10012m = askDescriptionFragment.m10012m();
            boolean zChangedInstance = composer.changedInstance(askDescriptionFragment);
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: m6.c
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AskDescriptionFragment.m10009q(this.f15106a);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            Function0 function0 = (Function0) objRememberedValue;
            boolean zChangedInstance2 = composer.changedInstance(askDescriptionFragment);
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function2() { // from class: m6.d
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return AskDescriptionFragment.m10010r(this.f15109a, (String) obj, (String) obj2);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            AbstractC8991d0.m14363s(askQuestionViewModelM10012m, function0, (Function2) objRememberedValue2, composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* renamed from: q */
    public static final Unit m10009q(AskDescriptionFragment askDescriptionFragment) {
        askDescriptionFragment.m10013n();
        return Unit.INSTANCE;
    }

    /* renamed from: r */
    public static final Unit m10010r(AskDescriptionFragment askDescriptionFragment, String description, String courseId) {
        String str;
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(courseId, "courseId");
        NavController navControllerFindNavController = FragmentKt.findNavController(askDescriptionFragment);
        int i9 = R.id.dialogue_nav_new_answer;
        String imagePath = askDescriptionFragment.m10011l().getImagePath();
        if (imagePath != null) {
            str = imagePath;
        } else {
            Intent intent = askDescriptionFragment.requireActivity().getIntent();
            if (intent != null) {
                imagePath = intent.getStringExtra("localFileName");
                str = imagePath;
            } else {
                str = null;
            }
        }
        Intent intent2 = askDescriptionFragment.requireActivity().getIntent();
        navControllerFindNavController.navigate(i9, new NewAnswerFragmentArgs(str, intent2 != null ? intent2.getStringArrayExtra("localPathList") : null, null, null, description, courseId, 12, null).m10438g());
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: l */
    public final AskDescriptionFragmentArgs m10011l() {
        return (AskDescriptionFragmentArgs) this.args.getValue();
    }

    /* renamed from: m */
    public final AskQuestionViewModel m10012m() {
        return (AskQuestionViewModel) this.viewModel.getValue();
    }

    /* renamed from: n */
    public final void m10013n() {
        Intent intent = requireActivity().getIntent();
        if (intent == null || !intent.getBooleanExtra("fromOtherApp", false)) {
            FragmentKt.findNavController(this).navigateUp();
        } else {
            requireActivity().finish();
        }
    }

    @Override // com.zykj.student.dialogue.p076ui.ask.Hilt_AskDescriptionFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        requireActivity().getOnBackPressedDispatcher().addCallback(this, new OnBackPressedCallback() { // from class: com.zykj.student.dialogue.ui.ask.AskDescriptionFragment.onAttach.1
            {
                super(true);
            }

            @Override // androidx.activity.OnBackPressedCallback
            public void handleOnBackPressed() {
                AskDescriptionFragment.this.m10013n();
            }
        });
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        PermissionUtils.permission(PermissionConstants.STORAGE).callback(new PermissionUtils.SingleCallback() { // from class: m6.b
            @Override // com.blankj.utilcode.util.PermissionUtils.SingleCallback
            public final void callback(boolean z9, List list, List list2, List list3) {
                AskDescriptionFragment.m10007o(z9, list, list2, list3);
            }
        }).request();
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        ComposeView composeView = new ComposeView(contextRequireContext, null, 0, 6, null);
        composeView.setContent(ComposableLambdaKt.composableLambdaInstance(1568725911, true, new Function2() { // from class: m6.a
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return AskDescriptionFragment.m10008p(this.f15096a, (Composer) obj, ((Integer) obj2).intValue());
            }
        }));
        return composeView;
    }
}
