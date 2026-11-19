package com.zykj.student.dialogue.p076ui.ask;

import android.app.Dialog;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.activity.result.ActivityResultLauncher;
import androidx.compose.p012ui.platform.ComposeView;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.navigation.NavArgsLazy;
import androidx.navigation.NavController;
import androidx.navigation.fragment.FragmentKt;
import com.blankj.utilcode.util.UriUtils;
import com.zykj.base.utils.XToastUtils;
import com.zykj.student.dialogue.R;
import com.zykj.student.dialogue.p076ui.ask.AskQuestionDialogFragment;
import com.zykj.student.dialogue.p076ui.collect.SearchedQuestionFragmentArgs;
import com.zykj.student.dialogue.p076ui.home.HomeViewModel;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import p138i6.AbstractC8136b;
import p181m7.C9037n;
import p264u6.DialogC9703b;
import p314z6.AbstractC10005c;

@StabilityInferred(parameters = 0)
@Metadata(m13412d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0003J\u0019\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ+\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\u001b\u0010\u001a\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001f\u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001d\u0010\u001eR\u001b\u0010%\u001a\u00020 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0014\u0010)\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\"\u0010/\u001a\u0010\u0012\f\u0012\n ,*\u0004\u0018\u00010+0+0*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.¨\u00062²\u0006\u000e\u00101\u001a\u0002008\n@\nX\u008a\u008e\u0002"}, m13413d2 = {"Lcom/zykj/student/dialogue/ui/ask/AskQuestionDialogFragment;", "Landroidx/fragment/app/DialogFragment;", "<init>", "()V", "", "onStart", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "Landroid/net/Uri;", "uri", "y", "(Landroid/net/Uri;)V", "Lcom/zykj/student/dialogue/ui/home/HomeViewModel;", "f", "Lkotlin/Lazy;", "v", "()Lcom/zykj/student/dialogue/ui/home/HomeViewModel;", "homeViewModel", "Lu6/b;", "g", "w", "()Lu6/b;", "mCameraForbiddenDialog", "Lcom/zykj/student/dialogue/ui/ask/AskQuestionDialogFragmentArgs;", "h", "Landroidx/navigation/NavArgsLazy;", "u", "()Lcom/zykj/student/dialogue/ui/ask/AskQuestionDialogFragmentArgs;", "args", "Lm7/n;", "i", "Lm7/n;", "imagePicker", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "kotlin.jvm.PlatformType", "j", "Landroidx/activity/result/ActivityResultLauncher;", "galleryLauncher", "", "takePhotoEnabled", "app_release"}, m13414k = 1, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nAskQuestionDialogFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AskQuestionDialogFragment.kt\ncom/zykj/student/dialogue/ui/ask/AskQuestionDialogFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 FragmentNavArgsLazy.kt\nandroidx/navigation/fragment/FragmentNavArgsLazyKt\n+ 4 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,127:1\n172#2,9:128\n42#3,3:137\n85#4:140\n113#4,2:141\n1247#5,6:143\n1247#5,6:149\n1247#5,6:155\n1247#5,6:161\n1#6:167\n*S KotlinDebug\n*F\n+ 1 AskQuestionDialogFragment.kt\ncom/zykj/student/dialogue/ui/ask/AskQuestionDialogFragment\n*L\n38#1:128,9\n43#1:137,3\n73#1:140\n73#1:141,2\n73#1:143,6\n76#1:149,6\n83#1:155,6\n104#1:161,6\n*E\n"})
/* loaded from: classes5.dex */
public final class AskQuestionDialogFragment extends Hilt_AskQuestionDialogFragment {

    /* renamed from: f, reason: from kotlin metadata */
    public final Lazy homeViewModel;

    /* renamed from: g, reason: from kotlin metadata */
    public final Lazy mCameraForbiddenDialog = LazyKt.lazy(new Function0() { // from class: m6.f
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AskQuestionDialogFragment.m10038x(this.f15114a);
        }
    });

    /* renamed from: h, reason: from kotlin metadata */
    public final NavArgsLazy args = new NavArgsLazy(Reflection.getOrCreateKotlinClass(AskQuestionDialogFragmentArgs.class), new C7463a(this));

    /* renamed from: i, reason: from kotlin metadata */
    public final C9037n imagePicker = new C9037n(this, 0 == true ? 1 : 0, 2, 0 == true ? 1 : 0);

    /* renamed from: j, reason: from kotlin metadata */
    public final ActivityResultLauncher galleryLauncher = AbstractC10005c.m17367d(this, new Function1() { // from class: m6.g
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return AskQuestionDialogFragment.m10036s(this.f15115a, (Uri) obj);
        }
    });

    /* renamed from: com.zykj.student.dialogue.ui.ask.AskQuestionDialogFragment$a */
    public static final class C7463a implements Function0 {

        /* renamed from: a */
        public final /* synthetic */ Fragment f10626a;

        public C7463a(Fragment fragment) {
            this.f10626a = fragment;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Bundle invoke() {
            Bundle arguments = this.f10626a.getArguments();
            if (arguments != null) {
                return arguments;
            }
            throw new IllegalStateException("Fragment " + this.f10626a + " has null arguments");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AskQuestionDialogFragment() {
        final Function0 function0 = null;
        this.homeViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(HomeViewModel.class), new Function0<ViewModelStore>() { // from class: com.zykj.student.dialogue.ui.ask.AskQuestionDialogFragment$special$$inlined$activityViewModels$default$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                return this.requireActivity().getViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.zykj.student.dialogue.ui.ask.AskQuestionDialogFragment$special$$inlined$activityViewModels$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function02 = function0;
                return (function02 == null || (creationExtras = (CreationExtras) function02.invoke()) == null) ? this.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.zykj.student.dialogue.ui.ask.AskQuestionDialogFragment$special$$inlined$activityViewModels$default$3
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                return this.requireActivity().getDefaultViewModelProviderFactory();
            }
        });
    }

    /* renamed from: A */
    public static final Unit m10018A(boolean z9, final AskQuestionDialogFragment askQuestionDialogFragment, ComposeView composeView, final MutableState mutableState) {
        if (z9) {
            m10022E(mutableState, false);
            askQuestionDialogFragment.m10041v().m10858H(new Function1() { // from class: m6.m
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AskQuestionDialogFragment.m10019B(this.f15133a, mutableState, (Boolean) obj);
                }
            });
        } else {
            XToastUtils xToastUtils = XToastUtils.INSTANCE;
            String string = composeView.getContext().getString(R.string.search_settings_close);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            xToastUtils.toast(string);
        }
        return Unit.INSTANCE;
    }

    /* renamed from: B */
    public static final Unit m10019B(AskQuestionDialogFragment askQuestionDialogFragment, MutableState mutableState, Boolean bool) {
        m10022E(mutableState, true);
        if (bool == null) {
            return Unit.INSTANCE;
        }
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(askQuestionDialogFragment), null, null, new AskQuestionDialogFragment$onCreateView$1$1$2$1$1$1(askQuestionDialogFragment, bool.booleanValue(), null), 3, null);
        return Unit.INSTANCE;
    }

    /* renamed from: C */
    public static final Unit m10020C(AskQuestionDialogFragment askQuestionDialogFragment) {
        FragmentKt.findNavController(askQuestionDialogFragment).navigate(R.id.askDescriptionFragment);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: D */
    public static final boolean m10021D(MutableState mutableState) {
        return ((Boolean) mutableState.getValue()).booleanValue();
    }

    /* renamed from: E */
    public static final void m10022E(MutableState mutableState, boolean z9) {
        mutableState.setValue(Boolean.valueOf(z9));
    }

    /* renamed from: F */
    public static final Unit m10023F(boolean z9, AskQuestionDialogFragment askQuestionDialogFragment, ComposeView composeView) {
        if (z9) {
            AbstractC10005c.m17369f(askQuestionDialogFragment, askQuestionDialogFragment.galleryLauncher);
        } else {
            XToastUtils xToastUtils = XToastUtils.INSTANCE;
            String string = composeView.getContext().getString(R.string.search_settings_close);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            xToastUtils.toast(string);
        }
        return Unit.INSTANCE;
    }

    /* renamed from: s */
    public static final Unit m10036s(final AskQuestionDialogFragment askQuestionDialogFragment, Uri originalUri) {
        Intrinsics.checkNotNullParameter(originalUri, "originalUri");
        askQuestionDialogFragment.imagePicker.m14420r(originalUri, new Function1() { // from class: m6.i
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AskQuestionDialogFragment.m10037t(this.f15121a, (Uri) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* renamed from: t */
    public static final Unit m10037t(AskQuestionDialogFragment askQuestionDialogFragment, Uri uri) {
        if (uri != null) {
            askQuestionDialogFragment.m10043y(uri);
        }
        return Unit.INSTANCE;
    }

    /* renamed from: x */
    public static final DialogC9703b m10038x(AskQuestionDialogFragment askQuestionDialogFragment) {
        Context contextRequireContext = askQuestionDialogFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        return new DialogC9703b(contextRequireContext, 0, 2, null);
    }

    /* renamed from: z */
    public static final Unit m10039z(final boolean z9, final AskQuestionDialogFragment askQuestionDialogFragment, final ComposeView composeView, Composer composer, int i9) {
        if (composer.shouldExecute((i9 & 3) != 2, i9 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1115020341, i9, -1, "com.zykj.student.dialogue.ui.ask.AskQuestionDialogFragment.onCreateView.<anonymous>.<anonymous> (AskQuestionDialogFragment.kt:72)");
            }
            Object objRememberedValue = composer.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
                composer.updateRememberedValue(objRememberedValue);
            }
            final MutableState mutableState = (MutableState) objRememberedValue;
            boolean zM10021D = m10021D(mutableState);
            boolean zChanged = composer.changed(z9) | composer.changedInstance(askQuestionDialogFragment) | composer.changedInstance(composeView);
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChanged || objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: m6.j
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AskQuestionDialogFragment.m10023F(z9, askQuestionDialogFragment, composeView);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            Function0 function0 = (Function0) objRememberedValue2;
            boolean zChanged2 = composer.changed(z9) | composer.changedInstance(askQuestionDialogFragment) | composer.changedInstance(composeView);
            Object objRememberedValue3 = composer.rememberedValue();
            if (zChanged2 || objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new Function0() { // from class: m6.k
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AskQuestionDialogFragment.m10018A(z9, askQuestionDialogFragment, composeView, mutableState);
                    }
                };
                composer.updateRememberedValue(objRememberedValue3);
            }
            Function0 function02 = (Function0) objRememberedValue3;
            boolean zChangedInstance = composer.changedInstance(askQuestionDialogFragment);
            Object objRememberedValue4 = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = new Function0() { // from class: m6.l
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AskQuestionDialogFragment.m10020C(this.f15132a);
                    }
                };
                composer.updateRememberedValue(objRememberedValue4);
            }
            AskQuestionDialogScreensKt.m10057i(zM10021D, function0, function02, (Function0) objRememberedValue4, composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setStyle(1, R.style.CustomDialog);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        final boolean quoraSearchEnable = m10040u().getQuoraSearchEnable();
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        final ComposeView composeView = new ComposeView(contextRequireContext, null, 0, 6, null);
        composeView.setContent(ComposableLambdaKt.composableLambdaInstance(-1115020341, true, new Function2() { // from class: m6.h
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return AskQuestionDialogFragment.m10039z(quoraSearchEnable, this, composeView, (Composer) obj, ((Integer) obj2).intValue());
            }
        }));
        return composeView;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        Window window;
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.setType(1000);
            window.setLayout(AbstractC8136b.m13034b(TypedValues.CycleType.TYPE_PATH_ROTATE), AbstractC8136b.m13034b(271));
        }
        Dialog dialog2 = getDialog();
        if (dialog2 != null) {
            dialog2.setCancelable(true);
            dialog2.setCanceledOnTouchOutside(true);
        }
        super.onStart();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: u */
    public final AskQuestionDialogFragmentArgs m10040u() {
        return (AskQuestionDialogFragmentArgs) this.args.getValue();
    }

    /* renamed from: v */
    public final HomeViewModel m10041v() {
        return (HomeViewModel) this.homeViewModel.getValue();
    }

    /* renamed from: w */
    public final DialogC9703b m10042w() {
        return (DialogC9703b) this.mCameraForbiddenDialog.getValue();
    }

    /* renamed from: y */
    public final void m10043y(Uri uri) {
        String absolutePath = UriUtils.uri2File(uri).getAbsolutePath();
        NavController navControllerFindNavController = FragmentKt.findNavController(this);
        int i9 = R.id.searchedQuestionFragment;
        Intrinsics.checkNotNull(absolutePath);
        navControllerFindNavController.navigate(i9, new SearchedQuestionFragmentArgs(absolutePath).m10173b());
    }
}
