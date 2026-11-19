package com.zykj.evaluation.p057ui;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.p013ui.platform.ComposeView;
import androidx.compose.p013ui.window.DialogProperties;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.view.PointerIconCompat;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.navigation.NamedNavArgument;
import androidx.navigation.NamedNavArgumentKt;
import androidx.navigation.NavArgumentBuilder;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavGraphBuilder;
import androidx.navigation.NavHostController;
import androidx.navigation.NavType;
import androidx.navigation.Navigator;
import androidx.navigation.compose.NavGraphBuilderKt;
import androidx.navigation.compose.NavHostControllerKt;
import androidx.navigation.compose.NavHostKt;
import com.blankj.utilcode.util.PermissionUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.zykj.base.utils.XToastUtils;
import com.zykj.evaluation.R;
import com.zykj.evaluation.bean.bundle.DetailBundle;
import com.zykj.evaluation.bean.bundle.MistakeDataBundle;
import com.zykj.evaluation.p057ui.MainFragment;
import com.zykj.evaluation.p057ui.board.WhiteBoardDialogFragment;
import com.zykj.evaluation.p057ui.board.WhiteBoardDialogFragmentArgs;
import com.zykj.evaluation.p057ui.datepicker.DatePickerFragment;
import com.zykj.evaluation.p057ui.datepicker.DatePickerFragmentArgs;
import com.zykj.evaluation.p057ui.detail.done.DoneDetailPageKt;
import com.zykj.evaluation.p057ui.detail.mistake.CreateOrUpdateTagDialogPageKt;
import com.zykj.evaluation.p057ui.detail.mistake.MistakePageKt;
import com.zykj.evaluation.p057ui.detail.showImage.ShowImagePageKt;
import com.zykj.evaluation.p057ui.detail.toCorrect.ToCorrectDetailPageKt;
import com.zykj.evaluation.p057ui.detail.toCorrectSelf.ToCorrectSelfDetailPageKt;
import com.zykj.evaluation.p057ui.detail.todo.TodoDetailPageKt;
import com.zykj.evaluation.p057ui.guide.noStem.NoStemPageKt;
import com.zykj.evaluation.p057ui.guide.normal.done.DoneGuidePageKt;
import com.zykj.evaluation.p057ui.guide.normal.toCorrect.ToCorrectGuidePageKt;
import com.zykj.evaluation.p057ui.guide.normal.toCorrectSelf.ToCorrectSelfGuidePageKt;
import com.zykj.evaluation.p057ui.guide.normal.toDo.TodoGuidePageKt;
import com.zykj.evaluation.p057ui.home.HomePageKt;
import com.zykj.evaluation.p057ui.sketch.SketchPlayPageKt;
import com.zykj.evaluation.version.VersionResult;
import com.zykj.evaluation.version.VersionUpgradeDialogFragment;
import com.zykj.http.bean.HeaderBean;
import com.zykj.message.server.bean.UserInfo;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.functions.Function7;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import p008a6.AbstractC0024b;
import p009a7.AbstractC0029b;
import p027b8.C5060q;
import p068d7.AbstractC7307c;
import p101g7.AbstractC7586b;
import p144k6.AbstractC7894c;
import p168m6.AbstractC8562c;
import p179n6.AbstractC8663d;
import p179n6.AbstractC8667h;
import p277w6.AbstractC9816c;
import p286x5.AbstractC9854b;
import p287x6.AbstractC9863f;
import p306z5.AbstractC10034s1;

@StabilityInferred(parameters = 0)
@Metadata(m13557d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\u0007\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\t\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0003¢\u0006\u0004\b\t\u0010\bJ#\u0010\r\u001a\u00020\u00052\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00050\nH\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0012\u001a\u00020\u00052\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J+\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\"\u0010&\u001a\u0010\u0012\f\u0012\n #*\u0004\u0018\u00010\"0\"0!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u001b\u0010,\u001a\u00020'8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+¨\u00061²\u0006\f\u0010.\u001a\u00020-8\nX\u008a\u0084\u0002²\u0006\f\u00100\u001a\u00020/8\nX\u008a\u0084\u0002"}, m13558d2 = {"Lcom/zykj/evaluation/ui/MainFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "Lkotlin/Function0;", "", "successCallback", "n1", "(Lkotlin/jvm/functions/Function0;)V", "p1", "Lkotlin/Function1;", "Landroid/net/Uri;", "callback", "w3", "(Lkotlin/jvm/functions/Function1;)V", "", "", "pathList", "s1", "(Ljava/util/List;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "Lb8/q;", "f", "Lb8/q;", "mImagePicker", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "kotlin.jvm.PlatformType", "g", "Landroidx/activity/result/ActivityResultLauncher;", "askLauncher", "Lcom/zykj/evaluation/ui/MainViewModel;", "h", "Lkotlin/Lazy;", "r1", "()Lcom/zykj/evaluation/ui/MainViewModel;", "mainViewModel", "Lcom/zykj/http/bean/HeaderBean;", "header", "Lcom/zykj/message/server/bean/UserInfo;", "userInfo", "app_release"}, m13559k = 1, m13560mv = {2, 2, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nMainFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainFragment.kt\ncom/zykj/evaluation/ui/MainFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 Uri.kt\nandroidx/core/net/UriKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 5 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 6 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,784:1\n172#2,9:785\n29#3:794\n37#4:795\n36#4,3:796\n85#5:799\n85#5:800\n1247#6,6:801\n1247#6,6:807\n1247#6,6:813\n1247#6,6:819\n1247#6,6:825\n1247#6,6:831\n1247#6,6:837\n1247#6,6:843\n1247#6,6:849\n1247#6,6:855\n1247#6,6:861\n1247#6,6:867\n1247#6,6:873\n1247#6,6:879\n1247#6,6:885\n1247#6,6:891\n1247#6,6:897\n1247#6,6:903\n1247#6,6:909\n1247#6,6:915\n1247#6,6:921\n1247#6,6:927\n*S KotlinDebug\n*F\n+ 1 MainFragment.kt\ncom/zykj/evaluation/ui/MainFragment\n*L\n87#1:785,9\n762#1:794\n765#1:795\n765#1:796,3\n99#1:799\n104#1:800\n115#1:801,6\n125#1:807,6\n149#1:813,6\n287#1:819,6\n338#1:825,6\n352#1:831,6\n353#1:837,6\n374#1:843,6\n390#1:849,6\n391#1:855,6\n411#1:861,6\n412#1:867,6\n437#1:873,6\n438#1:879,6\n507#1:885,6\n522#1:891,6\n525#1:897,6\n539#1:903,6\n542#1:909,6\n556#1:915,6\n559#1:921,6\n110#1:927,6\n*E\n"})
/* loaded from: classes4.dex */
public final class MainFragment extends Hilt_MainFragment {

    /* renamed from: f, reason: from kotlin metadata */
    public final C5060q mImagePicker = new C5060q(this, null, 2, 0 == true ? 1 : 0);

    /* renamed from: g, reason: from kotlin metadata */
    public final ActivityResultLauncher askLauncher;

    /* renamed from: h, reason: from kotlin metadata */
    public final Lazy mainViewModel;

    /* JADX WARN: Multi-variable type inference failed */
    public MainFragment() {
        ActivityResultLauncher activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: s5.i
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                MainFragment.m9010m1((ActivityResult) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "registerForActivityResult(...)");
        this.askLauncher = activityResultLauncherRegisterForActivityResult;
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(MainViewModel.class);
        Function0<ViewModelStore> function0 = new Function0<ViewModelStore>() { // from class: com.zykj.evaluation.ui.MainFragment$special$$inlined$activityViewModels$default$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                return this.requireActivity().getViewModelStore();
            }
        };
        final Object[] objArr = 0 == true ? 1 : 0;
        this.mainViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, orCreateKotlinClass, function0, new Function0<CreationExtras>() { // from class: com.zykj.evaluation.ui.MainFragment$special$$inlined$activityViewModels$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function02 = objArr;
                return (function02 == null || (creationExtras = (CreationExtras) function02.invoke()) == null) ? this.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.zykj.evaluation.ui.MainFragment$special$$inlined$activityViewModels$default$3
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

    /* renamed from: A1 */
    public static final Unit m8852A1(MainFragment mainFragment, VersionResult it) {
        Intrinsics.checkNotNullParameter(it, "it");
        VersionUpgradeDialogFragment.INSTANCE.m10539a(it).show(mainFragment.getChildFragmentManager(), "VersionUpgradeDialogFragment");
        return Unit.INSTANCE;
    }

    /* renamed from: A2 */
    public static final Unit m8853A2(MainFragment mainFragment, String uuid, String path, boolean z9, String stemSketchPath, final Function1 confirmCallback, boolean z10) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(stemSketchPath, "stemSketchPath");
        Intrinsics.checkNotNullParameter(confirmCallback, "confirmCallback");
        WhiteBoardDialogFragment whiteBoardDialogFragmentM9200D = WhiteBoardDialogFragment.INSTANCE.m9206a(new WhiteBoardDialogFragmentArgs(uuid, path, z9, false)).m9201E(new Function1() { // from class: s5.q
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MainFragment.m8857B2(confirmCallback, (String) obj);
            }
        }).m9203G(stemSketchPath).m9200D(z10);
        FragmentManager childFragmentManager = mainFragment.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        whiteBoardDialogFragmentM9200D.showDialog(childFragmentManager);
        return Unit.INSTANCE;
    }

    /* renamed from: B1 */
    public static final Unit m8856B1(final NavHostController navHostController, final MainFragment mainFragment, AnimatedContentScope composable, NavBackStackEntry it, Composer composer, int i10) {
        Intrinsics.checkNotNullParameter(composable, "$this$composable");
        Intrinsics.checkNotNullParameter(it, "it");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(444646700, i10, -1, "com.zykj.evaluation.ui.MainFragment.onCreateView.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MainFragment.kt:533)");
        }
        MainFragmentKt.m9078b("NormalSheetPage", ComposableLambdaKt.rememberComposableLambda(1426922387, true, new Function2() { // from class: s5.s1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return MainFragment.m8860C1(navHostController, mainFragment, (Composer) obj, ((Integer) obj2).intValue());
            }
        }, composer, 54), composer, 54);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }

    /* renamed from: B2 */
    public static final Unit m8857B2(Function1 function1, String str) {
        function1.invoke(str);
        return Unit.INSTANCE;
    }

    /* renamed from: C1 */
    public static final Unit m8860C1(NavHostController navHostController, final MainFragment mainFragment, Composer composer, int i10) {
        if (composer.shouldExecute((i10 & 3) != 2, i10 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1426922387, i10, -1, "com.zykj.evaluation.ui.MainFragment.onCreateView.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MainFragment.kt:534)");
            }
            String string = AbstractC7586b.m12450a().getString("ANSWER_SHEET_KEY_BUNDLE");
            if (string == null) {
                string = "";
            }
            String str = string;
            boolean zChangedInstance = composer.changedInstance(mainFragment);
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: s5.m3
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return MainFragment.m8864D1(this.f15934a, ((Integer) obj).intValue());
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            Function1 function1 = (Function1) objRememberedValue;
            boolean zChangedInstance2 = composer.changedInstance(mainFragment);
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function1() { // from class: s5.j
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return MainFragment.m8868E1(this.f15910a, (Function0) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            AbstractC9863f.m16539b(str, navHostController, function1, (Function1) objRememberedValue2, null, composer, 0, 16);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* renamed from: C2 */
    public static final Unit m8861C2(NavArgumentBuilder navArgument) {
        Intrinsics.checkNotNullParameter(navArgument, "$this$navArgument");
        navArgument.setType(NavType.LongType);
        return Unit.INSTANCE;
    }

    /* renamed from: D1 */
    public static final Unit m8864D1(MainFragment mainFragment, int i10) {
        mainFragment.requireActivity().setRequestedOrientation(i10);
        return Unit.INSTANCE;
    }

    /* renamed from: D2 */
    public static final Unit m8865D2(final NavHostController navHostController, AnimatedContentScope composable, final NavBackStackEntry it, Composer composer, int i10) {
        Intrinsics.checkNotNullParameter(composable, "$this$composable");
        Intrinsics.checkNotNullParameter(it, "it");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-690211424, i10, -1, "com.zykj.evaluation.ui.MainFragment.onCreateView.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MainFragment.kt:313)");
        }
        MainFragmentKt.m9078b("CorrectingDetailPage", ComposableLambdaKt.rememberComposableLambda(-104335783, true, new Function2() { // from class: s5.z1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return MainFragment.m8869E2(it, navHostController, (Composer) obj, ((Integer) obj2).intValue());
            }
        }, composer, 54), composer, 54);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }

    /* renamed from: E1 */
    public static final Unit m8868E1(MainFragment mainFragment, Function0 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        mainFragment.m9073n1(it);
        return Unit.INSTANCE;
    }

    /* renamed from: E2 */
    public static final Unit m8869E2(NavBackStackEntry navBackStackEntry, NavHostController navHostController, Composer composer, int i10) {
        if (composer.shouldExecute((i10 & 3) != 2, i10 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-104335783, i10, -1, "com.zykj.evaluation.ui.MainFragment.onCreateView.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MainFragment.kt:314)");
            }
            Bundle arguments = navBackStackEntry.getArguments();
            AbstractC9854b.m16511b(arguments != null ? arguments.getLong("KEY_TASK_ID") : 0L, (DetailBundle) AbstractC7586b.m12450a().getParcelable("KEY_DETAIL_BUNDLE"), navHostController, null, null, composer, 0, 24);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* renamed from: F1 */
    public static final Unit m8872F1(NavArgumentBuilder navArgument) {
        Intrinsics.checkNotNullParameter(navArgument, "$this$navArgument");
        navArgument.setType(NavType.LongType);
        return Unit.INSTANCE;
    }

    /* renamed from: F2 */
    public static final Unit m8873F2(NavArgumentBuilder navArgument) {
        Intrinsics.checkNotNullParameter(navArgument, "$this$navArgument");
        navArgument.setType(NavType.LongType);
        return Unit.INSTANCE;
    }

    /* renamed from: G1 */
    public static final Unit m8876G1(final NavHostController navHostController, final MainFragment mainFragment, AnimatedContentScope composable, NavBackStackEntry it, Composer composer, int i10) {
        Intrinsics.checkNotNullParameter(composable, "$this$composable");
        Intrinsics.checkNotNullParameter(it, "it");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2042046837, i10, -1, "com.zykj.evaluation.ui.MainFragment.onCreateView.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MainFragment.kt:550)");
        }
        MainFragmentKt.m9078b("TrebleSheetPage", ComposableLambdaKt.rememberComposableLambda(-1059771150, true, new Function2() { // from class: s5.i2
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return MainFragment.m8880H1(navHostController, mainFragment, (Composer) obj, ((Integer) obj2).intValue());
            }
        }, composer, 54), composer, 54);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }

    /* renamed from: G2 */
    public static final Unit m8877G2(final NavHostController navHostController, final MainFragment mainFragment, AnimatedContentScope composable, final NavBackStackEntry entry, Composer composer, int i10) {
        Intrinsics.checkNotNullParameter(composable, "$this$composable");
        Intrinsics.checkNotNullParameter(entry, "entry");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1136641484, i10, -1, "com.zykj.evaluation.ui.MainFragment.onCreateView.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MainFragment.kt:331)");
        }
        MainFragmentKt.m9078b("ToCorrectSelfDetailPage", ComposableLambdaKt.rememberComposableLambda(-154365797, true, new Function2() { // from class: s5.d2
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return MainFragment.m8881H2(entry, navHostController, mainFragment, (Composer) obj, ((Integer) obj2).intValue());
            }
        }, composer, 54), composer, 54);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }

    /* renamed from: H1 */
    public static final Unit m8880H1(NavHostController navHostController, final MainFragment mainFragment, Composer composer, int i10) {
        if (composer.shouldExecute((i10 & 3) != 2, i10 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1059771150, i10, -1, "com.zykj.evaluation.ui.MainFragment.onCreateView.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MainFragment.kt:551)");
            }
            String string = AbstractC7586b.m12450a().getString("ANSWER_SHEET_KEY_BUNDLE");
            if (string == null) {
                string = "";
            }
            String str = string;
            boolean zChangedInstance = composer.changedInstance(mainFragment);
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: s5.w2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return MainFragment.m8884I1(this.f15988a, ((Integer) obj).intValue());
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            Function1 function1 = (Function1) objRememberedValue;
            boolean zChangedInstance2 = composer.changedInstance(mainFragment);
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function1() { // from class: s5.x2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return MainFragment.m8888J1(this.f15993a, (Function0) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            AbstractC0029b.m69b(str, navHostController, function1, (Function1) objRememberedValue2, null, composer, 0, 16);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* renamed from: H2 */
    public static final Unit m8881H2(NavBackStackEntry navBackStackEntry, NavHostController navHostController, final MainFragment mainFragment, Composer composer, int i10) {
        if (composer.shouldExecute((i10 & 3) != 2, i10 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-154365797, i10, -1, "com.zykj.evaluation.ui.MainFragment.onCreateView.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MainFragment.kt:332)");
            }
            Bundle arguments = navBackStackEntry.getArguments();
            long j10 = arguments != null ? arguments.getLong("KEY_TASK_ID") : 0L;
            DetailBundle detailBundle = (DetailBundle) AbstractC7586b.m12450a().getParcelable("KEY_DETAIL_BUNDLE");
            boolean zChangedInstance = composer.changedInstance(mainFragment);
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function6() { // from class: s5.y2
                    @Override // kotlin.jvm.functions.Function6
                    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
                        return MainFragment.m8885I2(this.f15996a, (String) obj, (String) obj2, ((Boolean) obj3).booleanValue(), (String) obj4, (Function1) obj5, ((Boolean) obj6).booleanValue());
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            Function6 function6 = (Function6) objRememberedValue;
            boolean zChangedInstance2 = composer.changedInstance(mainFragment);
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function1() { // from class: s5.z2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return MainFragment.m8893K2(this.f16001a, (List) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            Function1 function1 = (Function1) objRememberedValue2;
            boolean zChangedInstance3 = composer.changedInstance(mainFragment);
            Object objRememberedValue3 = composer.rememberedValue();
            if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new Function1() { // from class: s5.a3
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return MainFragment.m8897L2(this.f15871a, (Function0) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue3);
            }
            ToCorrectSelfDetailPageKt.m9680k(j10, detailBundle, navHostController, function6, function1, (Function1) objRememberedValue3, null, null, composer, 0, 192);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* renamed from: I1 */
    public static final Unit m8884I1(MainFragment mainFragment, int i10) {
        mainFragment.requireActivity().setRequestedOrientation(i10);
        return Unit.INSTANCE;
    }

    /* renamed from: I2 */
    public static final Unit m8885I2(MainFragment mainFragment, String uuid, String path, boolean z9, String stemSketchPath, final Function1 confirmCallback, boolean z10) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(stemSketchPath, "stemSketchPath");
        Intrinsics.checkNotNullParameter(confirmCallback, "confirmCallback");
        WhiteBoardDialogFragment whiteBoardDialogFragmentM9200D = WhiteBoardDialogFragment.INSTANCE.m9206a(new WhiteBoardDialogFragmentArgs(uuid, path, z9, false)).m9201E(new Function1() { // from class: s5.m
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MainFragment.m8889J2(confirmCallback, (String) obj);
            }
        }).m9203G(stemSketchPath).m9200D(z10);
        FragmentManager childFragmentManager = mainFragment.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        whiteBoardDialogFragmentM9200D.showDialog(childFragmentManager);
        return Unit.INSTANCE;
    }

    /* renamed from: J1 */
    public static final Unit m8888J1(MainFragment mainFragment, Function0 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        mainFragment.m9073n1(it);
        return Unit.INSTANCE;
    }

    /* renamed from: J2 */
    public static final Unit m8889J2(Function1 function1, String str) {
        function1.invoke(str);
        return Unit.INSTANCE;
    }

    /* renamed from: K1 */
    public static final Unit m8892K1(final NavHostController navHostController, NavBackStackEntry it, Composer composer, int i10) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1392788420, i10, -1, "com.zykj.evaluation.ui.MainFragment.onCreateView.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MainFragment.kt:568)");
        }
        MainFragmentKt.m9078b("RemoveMistakePage", ComposableLambdaKt.rememberComposableLambda(-1752833245, true, new Function2() { // from class: s5.q2
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return MainFragment.m8896L1(navHostController, (Composer) obj, ((Integer) obj2).intValue());
            }
        }, composer, 54), composer, 54);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }

    /* renamed from: K2 */
    public static final Unit m8893K2(MainFragment mainFragment, List it) {
        Intrinsics.checkNotNullParameter(it, "it");
        mainFragment.m9075s1(it);
        return Unit.INSTANCE;
    }

    /* renamed from: L1 */
    public static final Unit m8896L1(NavHostController navHostController, Composer composer, int i10) {
        if (composer.shouldExecute((i10 & 3) != 2, i10 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1752833245, i10, -1, "com.zykj.evaluation.ui.MainFragment.onCreateView.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MainFragment.kt:569)");
            }
            AbstractC10034s1.m16892d(navHostController, composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* renamed from: L2 */
    public static final Unit m8897L2(MainFragment mainFragment, Function0 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        mainFragment.m9074p1(it);
        return Unit.INSTANCE;
    }

    /* renamed from: M1 */
    public static final Unit m8900M1(NavArgumentBuilder navArgument) {
        Intrinsics.checkNotNullParameter(navArgument, "$this$navArgument");
        navArgument.setType(NavType.StringType);
        return Unit.INSTANCE;
    }

    /* renamed from: M2 */
    public static final Unit m8901M2(NavArgumentBuilder navArgument) {
        Intrinsics.checkNotNullParameter(navArgument, "$this$navArgument");
        navArgument.setType(NavType.LongType);
        return Unit.INSTANCE;
    }

    /* renamed from: N1 */
    public static final Unit m8904N1(final NavHostController navHostController, final NavBackStackEntry it, Composer composer, int i10) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2044506917, i10, -1, "com.zykj.evaluation.ui.MainFragment.onCreateView.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MainFragment.kt:582)");
        }
        MainFragmentKt.m9078b("CreateOrUpdateTagDialogPage", ComposableLambdaKt.rememberComposableLambda(-361186228, true, new Function2() { // from class: s5.f2
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return MainFragment.m8908O1(it, navHostController, (Composer) obj, ((Integer) obj2).intValue());
            }
        }, composer, 54), composer, 54);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }

    /* renamed from: N2 */
    public static final Unit m8905N2(final NavHostController navHostController, final MainFragment mainFragment, AnimatedContentScope composable, final NavBackStackEntry entry, Composer composer, int i10) {
        Intrinsics.checkNotNullParameter(composable, "$this$composable");
        Intrinsics.checkNotNullParameter(entry, "entry");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(671632275, i10, -1, "com.zykj.evaluation.ui.MainFragment.onCreateView.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MainFragment.kt:367)");
        }
        MainFragmentKt.m9078b("ToCorrectDetailPage", ComposableLambdaKt.rememberComposableLambda(1653907962, true, new Function2() { // from class: s5.j2
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return MainFragment.m8909O2(entry, navHostController, mainFragment, (Composer) obj, ((Integer) obj2).intValue());
            }
        }, composer, 54), composer, 54);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }

    /* renamed from: O1 */
    public static final Unit m8908O1(NavBackStackEntry navBackStackEntry, NavHostController navHostController, Composer composer, int i10) {
        String string;
        if (composer.shouldExecute((i10 & 3) != 2, i10 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-361186228, i10, -1, "com.zykj.evaluation.ui.MainFragment.onCreateView.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MainFragment.kt:583)");
            }
            Bundle arguments = navBackStackEntry.getArguments();
            if (arguments == null || (string = arguments.getString("CREATE_UPDATEKEY_TAG_BUNDLE")) == null) {
                string = "";
            }
            CreateOrUpdateTagDialogPageKt.m9489f(navHostController, string, composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* renamed from: O2 */
    public static final Unit m8909O2(NavBackStackEntry navBackStackEntry, NavHostController navHostController, final MainFragment mainFragment, Composer composer, int i10) {
        if (composer.shouldExecute((i10 & 3) != 2, i10 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1653907962, i10, -1, "com.zykj.evaluation.ui.MainFragment.onCreateView.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MainFragment.kt:368)");
            }
            Bundle arguments = navBackStackEntry.getArguments();
            long j10 = arguments != null ? arguments.getLong("KEY_TASK_ID") : 0L;
            DetailBundle detailBundle = (DetailBundle) AbstractC7586b.m12450a().getParcelable("KEY_DETAIL_BUNDLE");
            boolean zChangedInstance = composer.changedInstance(mainFragment);
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function7() { // from class: s5.s2
                    @Override // kotlin.jvm.functions.Function7
                    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
                        return MainFragment.m8913P2(this.f15966a, (String) obj, (String) obj2, ((Boolean) obj3).booleanValue(), (String) obj4, (Function1) obj5, (Function1) obj6, ((Boolean) obj7).booleanValue());
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            Function7 function7 = (Function7) objRememberedValue;
            boolean zChangedInstance2 = composer.changedInstance(mainFragment);
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function1() { // from class: s5.t2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return MainFragment.m8921R2(this.f15973a, (List) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            Function1 function1 = (Function1) objRememberedValue2;
            boolean zChangedInstance3 = composer.changedInstance(mainFragment);
            Object objRememberedValue3 = composer.rememberedValue();
            if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new Function1() { // from class: s5.u2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return MainFragment.m8925S2(this.f15979a, (Function0) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue3);
            }
            ToCorrectDetailPageKt.m9635j(j10, detailBundle, navHostController, function7, function1, (Function1) objRememberedValue3, null, null, composer, 0, 192);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* renamed from: P1 */
    public static final Unit m8912P1(NavArgumentBuilder navArgument) {
        Intrinsics.checkNotNullParameter(navArgument, "$this$navArgument");
        navArgument.setType(NavType.StringType);
        return Unit.INSTANCE;
    }

    /* renamed from: P2 */
    public static final Unit m8913P2(MainFragment mainFragment, String uuid, String path, boolean z9, String stemSketchPath, final Function1 confirmCallback, Function1 getAnswerBitmap, boolean z10) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(stemSketchPath, "stemSketchPath");
        Intrinsics.checkNotNullParameter(confirmCallback, "confirmCallback");
        Intrinsics.checkNotNullParameter(getAnswerBitmap, "getAnswerBitmap");
        WhiteBoardDialogFragment whiteBoardDialogFragmentM9200D = WhiteBoardDialogFragment.INSTANCE.m9206a(new WhiteBoardDialogFragmentArgs(uuid, path, z9, true)).m9201E(new Function1() { // from class: s5.o
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MainFragment.m8917Q2(confirmCallback, (String) obj);
            }
        }).m9202F(getAnswerBitmap).m9203G(stemSketchPath).m9200D(z10);
        FragmentManager childFragmentManager = mainFragment.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        whiteBoardDialogFragmentM9200D.showDialog(childFragmentManager);
        return Unit.INSTANCE;
    }

    /* renamed from: Q1 */
    public static final Unit m8916Q1(NavArgumentBuilder navArgument) {
        Intrinsics.checkNotNullParameter(navArgument, "$this$navArgument");
        navArgument.setType(NavType.StringType);
        return Unit.INSTANCE;
    }

    /* renamed from: Q2 */
    public static final Unit m8917Q2(Function1 function1, String str) {
        function1.invoke(str);
        return Unit.INSTANCE;
    }

    /* renamed from: R1 */
    public static final Unit m8920R1(NavArgumentBuilder navArgument) {
        Intrinsics.checkNotNullParameter(navArgument, "$this$navArgument");
        navArgument.setType(NavType.StringType);
        return Unit.INSTANCE;
    }

    /* renamed from: R2 */
    public static final Unit m8921R2(MainFragment mainFragment, List it) {
        Intrinsics.checkNotNullParameter(it, "it");
        mainFragment.m9075s1(it);
        return Unit.INSTANCE;
    }

    /* renamed from: S1 */
    public static final Unit m8924S1(NavArgumentBuilder navArgument) {
        Intrinsics.checkNotNullParameter(navArgument, "$this$navArgument");
        navArgument.setType(NavType.BoolType);
        return Unit.INSTANCE;
    }

    /* renamed from: S2 */
    public static final Unit m8925S2(MainFragment mainFragment, Function0 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        mainFragment.m9074p1(it);
        return Unit.INSTANCE;
    }

    /* renamed from: T1 */
    public static final Unit m8928T1(NavArgumentBuilder navArgument) {
        Intrinsics.checkNotNullParameter(navArgument, "$this$navArgument");
        navArgument.setType(NavType.BoolType);
        return Unit.INSTANCE;
    }

    /* renamed from: T2 */
    public static final Unit m8929T2(NavArgumentBuilder navArgument) {
        Intrinsics.checkNotNullParameter(navArgument, "$this$navArgument");
        navArgument.setType(NavType.LongType);
        return Unit.INSTANCE;
    }

    /* renamed from: U1 */
    public static final Unit m8932U1(NavArgumentBuilder navArgument) {
        Intrinsics.checkNotNullParameter(navArgument, "$this$navArgument");
        navArgument.setType(NavType.BoolType);
        navArgument.setDefaultValue(Boolean.FALSE);
        return Unit.INSTANCE;
    }

    /* renamed from: U2 */
    public static final Unit m8933U2(final NavHostController navHostController, final MainFragment mainFragment, AnimatedContentScope composable, final NavBackStackEntry entry, Composer composer, int i10) {
        Intrinsics.checkNotNullParameter(composable, "$this$composable");
        Intrinsics.checkNotNullParameter(entry, "entry");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1815061262, i10, -1, "com.zykj.evaluation.ui.MainFragment.onCreateView.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MainFragment.kt:404)");
        }
        MainFragmentKt.m9078b("RevisingDetailPage", ComposableLambdaKt.rememberComposableLambda(-832785575, true, new Function2() { // from class: s5.o2
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return MainFragment.m8937V2(entry, navHostController, mainFragment, (Composer) obj, ((Integer) obj2).intValue());
            }
        }, composer, 54), composer, 54);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }

    /* renamed from: V1 */
    public static final Unit m8936V1(final NavHostController navHostController, final NavBackStackEntry it, Composer composer, int i10) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1120606398, i10, -1, "com.zykj.evaluation.ui.MainFragment.onCreateView.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MainFragment.kt:661)");
        }
        MainFragmentKt.m9078b("SubmitConfirmPage", ComposableLambdaKt.rememberComposableLambda(768667753, true, new Function2() { // from class: s5.x1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return MainFragment.m8940W1(navHostController, it, (Composer) obj, ((Integer) obj2).intValue());
            }
        }, composer, 54), composer, 54);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }

    /* renamed from: V2 */
    public static final Unit m8937V2(NavBackStackEntry navBackStackEntry, NavHostController navHostController, final MainFragment mainFragment, Composer composer, int i10) {
        if (composer.shouldExecute((i10 & 3) != 2, i10 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-832785575, i10, -1, "com.zykj.evaluation.ui.MainFragment.onCreateView.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MainFragment.kt:405)");
            }
            Bundle arguments = navBackStackEntry.getArguments();
            long j10 = arguments != null ? arguments.getLong("KEY_TASK_ID") : 0L;
            DetailBundle detailBundle = (DetailBundle) AbstractC7586b.m12450a().getParcelable("KEY_DETAIL_BUNDLE");
            boolean zChangedInstance = composer.changedInstance(mainFragment);
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: s5.d3
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return MainFragment.m8941W2(this.f15887a, (List) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            Function1 function1 = (Function1) objRememberedValue;
            boolean zChangedInstance2 = composer.changedInstance(mainFragment);
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function1() { // from class: s5.e3
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return MainFragment.m8945X2(this.f15891a, (Function0) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            AbstractC0024b.m65b(j10, detailBundle, navHostController, function1, (Function1) objRememberedValue2, null, null, composer, 0, 96);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* renamed from: W1 */
    public static final Unit m8940W1(NavHostController navHostController, NavBackStackEntry navBackStackEntry, Composer composer, int i10) {
        if (composer.shouldExecute((i10 & 3) != 2, i10 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(768667753, i10, -1, "com.zykj.evaluation.ui.MainFragment.onCreateView.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MainFragment.kt:662)");
            }
            Bundle arguments = navBackStackEntry.getArguments();
            boolean z9 = arguments != null ? arguments.getBoolean("SUBMIT_KEY_ALL_COMPLETE") : true;
            Bundle arguments2 = navBackStackEntry.getArguments();
            boolean z10 = arguments2 != null ? arguments2.getBoolean("SUBMIT_KEY_IS_NO_STEAM") : false;
            Bundle arguments3 = navBackStackEntry.getArguments();
            AbstractC8663d.m14258d(navHostController, z9, z10, arguments3 != null ? arguments3.getBoolean("SUBMIT_KEY_COMMIT_FAILED") : false, composer, 0, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* renamed from: W2 */
    public static final Unit m8941W2(MainFragment mainFragment, List it) {
        Intrinsics.checkNotNullParameter(it, "it");
        mainFragment.m9075s1(it);
        return Unit.INSTANCE;
    }

    /* renamed from: X1 */
    public static final Unit m8944X1(NavArgumentBuilder navArgument) {
        Intrinsics.checkNotNullParameter(navArgument, "$this$navArgument");
        navArgument.setType(NavType.BoolType);
        return Unit.INSTANCE;
    }

    /* renamed from: X2 */
    public static final Unit m8945X2(MainFragment mainFragment, Function0 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        mainFragment.m9074p1(it);
        return Unit.INSTANCE;
    }

    /* renamed from: Y1 */
    public static final Unit m8948Y1(final NavHostController navHostController, final NavBackStackEntry it, Composer composer, int i10) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(687667361, i10, -1, "com.zykj.evaluation.ui.MainFragment.onCreateView.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MainFragment.kt:682)");
        }
        MainFragmentKt.m9078b("SubmitCorrectSelfConfirmPage", ComposableLambdaKt.rememberComposableLambda(-1718025784, true, new Function2() { // from class: s5.l2
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return MainFragment.m8952Z1(navHostController, it, (Composer) obj, ((Integer) obj2).intValue());
            }
        }, composer, 54), composer, 54);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }

    /* renamed from: Y2 */
    public static final Unit m8949Y2(NavArgumentBuilder navArgument) {
        Intrinsics.checkNotNullParameter(navArgument, "$this$navArgument");
        navArgument.setType(NavType.LongType);
        return Unit.INSTANCE;
    }

    /* renamed from: Z1 */
    public static final Unit m8952Z1(NavHostController navHostController, NavBackStackEntry navBackStackEntry, Composer composer, int i10) {
        if (composer.shouldExecute((i10 & 3) != 2, i10 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1718025784, i10, -1, "com.zykj.evaluation.ui.MainFragment.onCreateView.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MainFragment.kt:683)");
            }
            Bundle arguments = navBackStackEntry.getArguments();
            AbstractC8667h.m14265d(navHostController, arguments != null ? arguments.getBoolean("SUBMIT_KEY_ALL_COMPLETE") : true, composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* renamed from: Z2 */
    public static final Unit m8953Z2(NavArgumentBuilder navArgument) {
        Intrinsics.checkNotNullParameter(navArgument, "$this$navArgument");
        navArgument.setType(NavType.BoolType);
        return Unit.INSTANCE;
    }

    /* renamed from: a2 */
    public static final Unit m8956a2(final NavHostController navHostController, final MainFragment mainFragment, AnimatedContentScope composable, final NavBackStackEntry it, Composer composer, int i10) {
        Intrinsics.checkNotNullParameter(composable, "$this$composable");
        Intrinsics.checkNotNullParameter(it, "it");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2023467688, i10, -1, "com.zykj.evaluation.ui.MainFragment.onCreateView.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MainFragment.kt:144)");
        }
        MainFragmentKt.m9078b("NoStemPage", ComposableLambdaKt.rememberComposableLambda(-1685623967, true, new Function2() { // from class: s5.m2
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return MainFragment.m8960b2(navHostController, it, mainFragment, (Composer) obj, ((Integer) obj2).intValue());
            }
        }, composer, 54), composer, 54);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }

    /* renamed from: a3 */
    public static final Unit m8957a3(final NavHostController navHostController, final MainFragment mainFragment, AnimatedContentScope composable, final NavBackStackEntry entry, Composer composer, int i10) {
        Intrinsics.checkNotNullParameter(composable, "$this$composable");
        Intrinsics.checkNotNullParameter(entry, "entry");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-6787503, i10, -1, "com.zykj.evaluation.ui.MainFragment.onCreateView.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MainFragment.kt:428)");
        }
        MainFragmentKt.m9078b("DoneDetailPage", ComposableLambdaKt.rememberComposableLambda(975488184, true, new Function2() { // from class: s5.p2
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return MainFragment.m8961b3(entry, navHostController, mainFragment, (Composer) obj, ((Integer) obj2).intValue());
            }
        }, composer, 54), composer, 54);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }

    /* renamed from: b2 */
    public static final Unit m8960b2(NavHostController navHostController, NavBackStackEntry navBackStackEntry, final MainFragment mainFragment, Composer composer, int i10) {
        if (composer.shouldExecute((i10 & 3) != 2, i10 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1685623967, i10, -1, "com.zykj.evaluation.ui.MainFragment.onCreateView.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MainFragment.kt:145)");
            }
            Bundle arguments = navBackStackEntry.getArguments();
            long j10 = arguments != null ? arguments.getLong("GUIDE_KEY_TASK_ID") : 0L;
            boolean zChangedInstance = composer.changedInstance(mainFragment);
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function4() { // from class: s5.v2
                    @Override // kotlin.jvm.functions.Function4
                    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                        return MainFragment.m8964c2(this.f15985a, (String) obj, (String) obj2, ((Boolean) obj3).booleanValue(), (Function1) obj4);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            NoStemPageKt.m9797l(navHostController, j10, (Function4) objRememberedValue, null, composer, 0, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* renamed from: b3 */
    public static final Unit m8961b3(NavBackStackEntry navBackStackEntry, NavHostController navHostController, final MainFragment mainFragment, Composer composer, int i10) {
        if (composer.shouldExecute((i10 & 3) != 2, i10 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(975488184, i10, -1, "com.zykj.evaluation.ui.MainFragment.onCreateView.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MainFragment.kt:429)");
            }
            Bundle arguments = navBackStackEntry.getArguments();
            long j10 = arguments != null ? arguments.getLong("KEY_TASK_ID") : 0L;
            Bundle arguments2 = navBackStackEntry.getArguments();
            boolean z9 = arguments2 != null ? arguments2.getBoolean("GUIDE_KEY_EXAM_IS_FINISH") : false;
            DetailBundle detailBundle = (DetailBundle) AbstractC7586b.m12450a().getParcelable("KEY_DETAIL_BUNDLE");
            boolean zChangedInstance = composer.changedInstance(mainFragment);
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: s5.k3
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return MainFragment.m8965c3(this.f15923a, (List) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            Function1 function1 = (Function1) objRememberedValue;
            boolean zChangedInstance2 = composer.changedInstance(mainFragment);
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function1() { // from class: s5.l3
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return MainFragment.m8969d3(this.f15929a, (Function0) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            DoneDetailPageKt.m9471b(j10, z9, detailBundle, navHostController, function1, (Function1) objRememberedValue2, null, null, composer, 0, 192);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* renamed from: c2 */
    public static final Unit m8964c2(MainFragment mainFragment, String uuid, String path, boolean z9, final Function1 confirmCallback) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(confirmCallback, "confirmCallback");
        WhiteBoardDialogFragment whiteBoardDialogFragmentM9201E = WhiteBoardDialogFragment.INSTANCE.m9206a(new WhiteBoardDialogFragmentArgs(uuid, path, z9, false)).m9201E(new Function1() { // from class: s5.r
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MainFragment.m8968d2(confirmCallback, (String) obj);
            }
        });
        FragmentManager childFragmentManager = mainFragment.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        whiteBoardDialogFragmentM9201E.showDialog(childFragmentManager);
        return Unit.INSTANCE;
    }

    /* renamed from: c3 */
    public static final Unit m8965c3(MainFragment mainFragment, List it) {
        Intrinsics.checkNotNullParameter(it, "it");
        mainFragment.m9075s1(it);
        return Unit.INSTANCE;
    }

    /* renamed from: d2 */
    public static final Unit m8968d2(Function1 function1, String str) {
        function1.invoke(str);
        return Unit.INSTANCE;
    }

    /* renamed from: d3 */
    public static final Unit m8969d3(MainFragment mainFragment, Function0 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        mainFragment.m9074p1(it);
        return Unit.INSTANCE;
    }

    /* renamed from: e2 */
    public static final Unit m8972e2(NavArgumentBuilder navArgument) {
        Intrinsics.checkNotNullParameter(navArgument, "$this$navArgument");
        navArgument.setType(NavType.LongType);
        return Unit.INSTANCE;
    }

    /* renamed from: e3 */
    public static final Unit m8973e3(NavArgumentBuilder navArgument) {
        Intrinsics.checkNotNullParameter(navArgument, "$this$navArgument");
        navArgument.setType(NavType.LongType);
        return Unit.INSTANCE;
    }

    /* renamed from: f2 */
    public static final Unit m8976f2(final NavHostController navHostController, AnimatedContentScope composable, final NavBackStackEntry it, Composer composer, int i10) {
        Intrinsics.checkNotNullParameter(composable, "$this$composable");
        Intrinsics.checkNotNullParameter(it, "it");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-463225849, i10, -1, "com.zykj.evaluation.ui.MainFragment.onCreateView.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MainFragment.kt:173)");
        }
        MainFragmentKt.m9078b("TodoGuidePage", ComposableLambdaKt.rememberComposableLambda(122649792, true, new Function2() { // from class: s5.r1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return MainFragment.m8981g2(navHostController, it, (Composer) obj, ((Integer) obj2).intValue());
            }
        }, composer, 54), composer, 54);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }

    /* renamed from: f3 */
    public static final Unit m8977f3(NavArgumentBuilder navArgument) {
        Intrinsics.checkNotNullParameter(navArgument, "$this$navArgument");
        navArgument.setType(NavType.LongType);
        return Unit.INSTANCE;
    }

    /* renamed from: g2 */
    public static final Unit m8981g2(NavHostController navHostController, NavBackStackEntry navBackStackEntry, Composer composer, int i10) {
        if (composer.shouldExecute((i10 & 3) != 2, i10 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(122649792, i10, -1, "com.zykj.evaluation.ui.MainFragment.onCreateView.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MainFragment.kt:174)");
            }
            Bundle arguments = navBackStackEntry.getArguments();
            TodoGuidePageKt.m9910f(navHostController, arguments != null ? arguments.getLong("GUIDE_KEY_TASK_ID") : 0L, null, composer, 0, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* renamed from: g3 */
    public static final Unit m8982g3(NavArgumentBuilder navArgument) {
        Intrinsics.checkNotNullParameter(navArgument, "$this$navArgument");
        navArgument.setType(NavType.StringType);
        return Unit.INSTANCE;
    }

    /* renamed from: h2 */
    public static final Unit m8986h2(NavArgumentBuilder navArgument) {
        Intrinsics.checkNotNullParameter(navArgument, "$this$navArgument");
        navArgument.setType(NavType.LongType);
        return Unit.INSTANCE;
    }

    /* renamed from: h3 */
    public static final Unit m8987h3(final NavHostController navHostController, AnimatedContentScope composable, final NavBackStackEntry it, Composer composer, int i10) {
        Intrinsics.checkNotNullParameter(composable, "$this$composable");
        Intrinsics.checkNotNullParameter(it, "it");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1801486256, i10, -1, "com.zykj.evaluation.ui.MainFragment.onCreateView.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MainFragment.kt:460)");
        }
        MainFragmentKt.m9078b("SketchPlayPage", ComposableLambdaKt.rememberComposableLambda(-1511205353, true, new Function2() { // from class: s5.b2
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return MainFragment.m8992i3(it, navHostController, (Composer) obj, ((Integer) obj2).intValue());
            }
        }, composer, 54), composer, 54);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }

    /* renamed from: i2 */
    public static final Unit m8991i2(final NavHostController navHostController, AnimatedContentScope composable, final NavBackStackEntry it, Composer composer, int i10) {
        Intrinsics.checkNotNullParameter(composable, "$this$composable");
        Intrinsics.checkNotNullParameter(it, "it");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1345047910, i10, -1, "com.zykj.evaluation.ui.MainFragment.onCreateView.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MainFragment.kt:190)");
        }
        MainFragmentKt.m9078b("CorrectingGuidePage", ComposableLambdaKt.rememberComposableLambda(1930923551, true, new Function2() { // from class: s5.n2
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return MainFragment.m8996j2(navHostController, it, (Composer) obj, ((Integer) obj2).intValue());
            }
        }, composer, 54), composer, 54);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }

    /* renamed from: i3 */
    public static final Unit m8992i3(NavBackStackEntry navBackStackEntry, NavHostController navHostController, Composer composer, int i10) {
        String string;
        if (composer.shouldExecute((i10 & 3) != 2, i10 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1511205353, i10, -1, "com.zykj.evaluation.ui.MainFragment.onCreateView.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MainFragment.kt:461)");
            }
            Bundle arguments = navBackStackEntry.getArguments();
            long j10 = arguments != null ? arguments.getLong("SKETCH_KEY_EXAM_ID") : -1L;
            Bundle arguments2 = navBackStackEntry.getArguments();
            long j11 = arguments2 != null ? arguments2.getLong("SKETCH_KEY_QUESTION_ID") : -1L;
            Bundle arguments3 = navBackStackEntry.getArguments();
            if (arguments3 == null || (string = arguments3.getString("SKETCH_KEY_URL")) == null) {
                string = "";
            }
            SketchPlayPageKt.m10405h(j10, j11, string, navHostController, null, composer, 0, 16);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* renamed from: j2 */
    public static final Unit m8996j2(NavHostController navHostController, NavBackStackEntry navBackStackEntry, Composer composer, int i10) {
        if (composer.shouldExecute((i10 & 3) != 2, i10 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1930923551, i10, -1, "com.zykj.evaluation.ui.MainFragment.onCreateView.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MainFragment.kt:191)");
            }
            Bundle arguments = navBackStackEntry.getArguments();
            AbstractC7894c.m13513c(navHostController, arguments != null ? arguments.getLong("GUIDE_KEY_TASK_ID") : 0L, null, composer, 0, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* renamed from: j3 */
    public static final Unit m8997j3(NavArgumentBuilder navArgument) {
        Intrinsics.checkNotNullParameter(navArgument, "$this$navArgument");
        navArgument.setDefaultValue("");
        navArgument.setType(NavType.StringType);
        return Unit.INSTANCE;
    }

    /* renamed from: k2 */
    public static final Unit m9001k2(NavArgumentBuilder navArgument) {
        Intrinsics.checkNotNullParameter(navArgument, "$this$navArgument");
        navArgument.setType(NavType.LongType);
        return Unit.INSTANCE;
    }

    /* renamed from: k3 */
    public static final Unit m9002k3(NavArgumentBuilder navArgument) {
        Intrinsics.checkNotNullParameter(navArgument, "$this$navArgument");
        navArgument.setDefaultValue("");
        navArgument.setType(NavType.StringType);
        return Unit.INSTANCE;
    }

    /* renamed from: l2 */
    public static final Unit m9006l2(final NavHostController navHostController, AnimatedContentScope composable, final NavBackStackEntry it, Composer composer, int i10) {
        Intrinsics.checkNotNullParameter(composable, "$this$composable");
        Intrinsics.checkNotNullParameter(it, "it");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1141645627, i10, -1, "com.zykj.evaluation.ui.MainFragment.onCreateView.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MainFragment.kt:207)");
        }
        MainFragmentKt.m9078b("ToCorrectSelfGuidePage", ComposableLambdaKt.rememberComposableLambda(-555769986, true, new Function2() { // from class: s5.w1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return MainFragment.m9011m2(navHostController, it, (Composer) obj, ((Integer) obj2).intValue());
            }
        }, composer, 54), composer, 54);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }

    /* renamed from: l3 */
    public static final Unit m9007l3(final NavHostController navHostController, AnimatedContentScope composable, final NavBackStackEntry it, Composer composer, int i10) {
        Intrinsics.checkNotNullParameter(composable, "$this$composable");
        Intrinsics.checkNotNullParameter(it, "it");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-685207281, i10, -1, "com.zykj.evaluation.ui.MainFragment.onCreateView.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MainFragment.kt:486)");
        }
        MainFragmentKt.m9078b("ShowImagePage", ComposableLambdaKt.rememberComposableLambda(297068406, true, new Function2() { // from class: s5.e2
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return MainFragment.m9012m3(it, navHostController, (Composer) obj, ((Integer) obj2).intValue());
            }
        }, composer, 54), composer, 54);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }

    /* renamed from: m1 */
    public static final void m9010m1(ActivityResult activityResult) {
        Intent data;
        String stringExtra;
        Intrinsics.checkNotNullParameter(activityResult, "activityResult");
        if (activityResult.getResultCode() != 0 || (data = activityResult.getData()) == null || (stringExtra = data.getStringExtra("errorMsg")) == null) {
            return;
        }
        ToastUtils.showShort(stringExtra, new Object[0]);
    }

    /* renamed from: m2 */
    public static final Unit m9011m2(NavHostController navHostController, NavBackStackEntry navBackStackEntry, Composer composer, int i10) {
        if (composer.shouldExecute((i10 & 3) != 2, i10 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-555769986, i10, -1, "com.zykj.evaluation.ui.MainFragment.onCreateView.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MainFragment.kt:208)");
            }
            Bundle arguments = navBackStackEntry.getArguments();
            ToCorrectSelfGuidePageKt.m9895f(navHostController, arguments != null ? arguments.getLong("GUIDE_KEY_TASK_ID") : 0L, null, composer, 0, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* renamed from: m3 */
    public static final Unit m9012m3(NavBackStackEntry navBackStackEntry, NavHostController navHostController, Composer composer, int i10) {
        String string;
        String string2;
        if (composer.shouldExecute((i10 & 3) != 2, i10 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(297068406, i10, -1, "com.zykj.evaluation.ui.MainFragment.onCreateView.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MainFragment.kt:487)");
            }
            Bundle arguments = navBackStackEntry.getArguments();
            String str = "";
            if (arguments == null || (string = arguments.getString("IMAGE_KEY_EXAM_URL")) == null) {
                string = "";
            }
            Bundle arguments2 = navBackStackEntry.getArguments();
            if (arguments2 != null && (string2 = arguments2.getString("IMAGE_KEY_COMMENT_URL")) != null) {
                str = string2;
            }
            ShowImagePageKt.m9615g(string, str, navHostController, composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* renamed from: n2 */
    public static final Unit m9015n2(NavArgumentBuilder navArgument) {
        Intrinsics.checkNotNullParameter(navArgument, "$this$navArgument");
        navArgument.setType(NavType.LongType);
        return Unit.INSTANCE;
    }

    /* renamed from: n3 */
    public static final Unit m9016n3(final NavHostController navHostController, final MainFragment mainFragment, AnimatedContentScope composable, NavBackStackEntry it, Composer composer, int i10) {
        Intrinsics.checkNotNullParameter(composable, "$this$composable");
        Intrinsics.checkNotNullParameter(it, "it");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1123066478, i10, -1, "com.zykj.evaluation.ui.MainFragment.onCreateView.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MainFragment.kt:501)");
        }
        MainFragmentKt.m9078b("MistakePage", ComposableLambdaKt.rememberComposableLambda(2105342165, true, new Function2() { // from class: s5.u1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return MainFragment.m9021o3(navHostController, mainFragment, (Composer) obj, ((Integer) obj2).intValue());
            }
        }, composer, 54), composer, 54);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }

    /* renamed from: o1 */
    public static final void m9019o1(Function0 function0, MainFragment mainFragment, boolean z9, List granted, List deniedForever, List denied) {
        Intrinsics.checkNotNullParameter(granted, "granted");
        Intrinsics.checkNotNullParameter(deniedForever, "deniedForever");
        Intrinsics.checkNotNullParameter(denied, "denied");
        if (z9) {
            function0.invoke();
            return;
        }
        XToastUtils xToastUtils = XToastUtils.INSTANCE;
        String string = mainFragment.getString(R.string.app_no_permission);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        xToastUtils.info(string);
    }

    /* renamed from: o2 */
    public static final Unit m9020o2(final NavHostController navHostController, AnimatedContentScope composable, final NavBackStackEntry it, Composer composer, int i10) {
        Intrinsics.checkNotNullParameter(composable, "$this$composable");
        Intrinsics.checkNotNullParameter(it, "it");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(666628132, i10, -1, "com.zykj.evaluation.ui.MainFragment.onCreateView.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MainFragment.kt:224)");
        }
        MainFragmentKt.m9078b("ToCorrectGuidePage", ComposableLambdaKt.rememberComposableLambda(1252503773, true, new Function2() { // from class: s5.k2
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return MainFragment.m9024p2(navHostController, it, (Composer) obj, ((Integer) obj2).intValue());
            }
        }, composer, 54), composer, 54);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }

    /* renamed from: o3 */
    public static final Unit m9021o3(NavHostController navHostController, final MainFragment mainFragment, Composer composer, int i10) {
        if (composer.shouldExecute((i10 & 3) != 2, i10 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2105342165, i10, -1, "com.zykj.evaluation.ui.MainFragment.onCreateView.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MainFragment.kt:502)");
            }
            MistakeDataBundle mistakeDataBundle = (MistakeDataBundle) AbstractC7586b.m12450a().getParcelable("MISTAKE_KEY_MISTAKE_DATA");
            if (mistakeDataBundle == null) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                return Unit.INSTANCE;
            }
            boolean zChangedInstance = composer.changedInstance(mainFragment);
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: s5.b3
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return MainFragment.m9025p3(this.f15874a, (Function1) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            MistakePageKt.m9504C(mistakeDataBundle, navHostController, null, (Function1) objRememberedValue, composer, 0, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* renamed from: p2 */
    public static final Unit m9024p2(NavHostController navHostController, NavBackStackEntry navBackStackEntry, Composer composer, int i10) {
        if (composer.shouldExecute((i10 & 3) != 2, i10 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1252503773, i10, -1, "com.zykj.evaluation.ui.MainFragment.onCreateView.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MainFragment.kt:225)");
            }
            Bundle arguments = navBackStackEntry.getArguments();
            ToCorrectGuidePageKt.m9881f(navHostController, arguments != null ? arguments.getLong("GUIDE_KEY_TASK_ID") : 0L, null, composer, 0, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* renamed from: p3 */
    public static final Unit m9025p3(MainFragment mainFragment, Function1 callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        mainFragment.m9076w3(callback);
        return Unit.INSTANCE;
    }

    /* renamed from: q1 */
    public static final void m9028q1(Function0 function0, MainFragment mainFragment, boolean z9, List granted, List deniedForever, List denied) {
        Intrinsics.checkNotNullParameter(granted, "granted");
        Intrinsics.checkNotNullParameter(deniedForever, "deniedForever");
        Intrinsics.checkNotNullParameter(denied, "denied");
        if (z9) {
            function0.invoke();
            return;
        }
        XToastUtils xToastUtils = XToastUtils.INSTANCE;
        String string = mainFragment.getString(R.string.app_no_permission);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        xToastUtils.info(string);
    }

    /* renamed from: q2 */
    public static final Unit m9029q2(NavArgumentBuilder navArgument) {
        Intrinsics.checkNotNullParameter(navArgument, "$this$navArgument");
        navArgument.setType(NavType.LongType);
        return Unit.INSTANCE;
    }

    /* renamed from: q3 */
    public static final Unit m9030q3(final NavHostController navHostController, final MainFragment mainFragment, AnimatedContentScope composable, NavBackStackEntry it, Composer composer, int i10) {
        Intrinsics.checkNotNullParameter(composable, "$this$composable");
        Intrinsics.checkNotNullParameter(it, "it");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1363627059, i10, -1, "com.zykj.evaluation.ui.MainFragment.onCreateView.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MainFragment.kt:516)");
        }
        MainFragmentKt.m9078b("CompositionSheetPage", ComposableLambdaKt.rememberComposableLambda(-381351372, true, new Function2() { // from class: s5.h2
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return MainFragment.m9035r3(navHostController, mainFragment, (Composer) obj, ((Integer) obj2).intValue());
            }
        }, composer, 54), composer, 54);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }

    /* renamed from: r1 */
    private final MainViewModel m9033r1() {
        return (MainViewModel) this.mainViewModel.getValue();
    }

    /* renamed from: r2 */
    public static final Unit m9034r2(final NavHostController navHostController, AnimatedContentScope composable, final NavBackStackEntry it, Composer composer, int i10) {
        Intrinsics.checkNotNullParameter(composable, "$this$composable");
        Intrinsics.checkNotNullParameter(it, "it");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1820065405, i10, -1, "com.zykj.evaluation.ui.MainFragment.onCreateView.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MainFragment.kt:241)");
        }
        MainFragmentKt.m9078b("RevisingGuidePage", ComposableLambdaKt.rememberComposableLambda(-1234189764, true, new Function2() { // from class: s5.a2
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return MainFragment.m9038s2(navHostController, it, (Composer) obj, ((Integer) obj2).intValue());
            }
        }, composer, 54), composer, 54);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }

    /* renamed from: r3 */
    public static final Unit m9035r3(NavHostController navHostController, final MainFragment mainFragment, Composer composer, int i10) {
        if (composer.shouldExecute((i10 & 3) != 2, i10 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-381351372, i10, -1, "com.zykj.evaluation.ui.MainFragment.onCreateView.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MainFragment.kt:517)");
            }
            String string = AbstractC7586b.m12450a().getString("ANSWER_SHEET_KEY_BUNDLE");
            if (string == null) {
                string = "";
            }
            String str = string;
            boolean zChangedInstance = composer.changedInstance(mainFragment);
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: s5.f3
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return MainFragment.m9039s3(this.f15897a, ((Integer) obj).intValue());
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            Function1 function1 = (Function1) objRememberedValue;
            boolean zChangedInstance2 = composer.changedInstance(mainFragment);
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function1() { // from class: s5.g3
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return MainFragment.m9044t3(this.f15899a, (Function0) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            AbstractC9816c.m16401c(str, navHostController, function1, (Function1) objRememberedValue2, null, composer, 0, 16);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* renamed from: s2 */
    public static final Unit m9038s2(NavHostController navHostController, NavBackStackEntry navBackStackEntry, Composer composer, int i10) {
        if (composer.shouldExecute((i10 & 3) != 2, i10 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1234189764, i10, -1, "com.zykj.evaluation.ui.MainFragment.onCreateView.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MainFragment.kt:242)");
            }
            Bundle arguments = navBackStackEntry.getArguments();
            AbstractC8562c.m14104c(navHostController, arguments != null ? arguments.getLong("GUIDE_KEY_TASK_ID") : 0L, null, composer, 0, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* renamed from: s3 */
    public static final Unit m9039s3(MainFragment mainFragment, int i10) {
        mainFragment.requireActivity().setRequestedOrientation(i10);
        return Unit.INSTANCE;
    }

    /* renamed from: t1 */
    public static final Unit m9042t1(final MainFragment mainFragment, Composer composer, int i10) {
        if (composer.shouldExecute((i10 & 3) != 2, i10 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1734361901, i10, -1, "com.zykj.evaluation.ui.MainFragment.onCreateView.<anonymous>.<anonymous> (MainFragment.kt:96)");
            }
            AbstractC7307c.m11592b(false, false, ComposableLambdaKt.rememberComposableLambda(65808783, true, new Function2() { // from class: s5.o0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return MainFragment.m9047u1(this.f15942a, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, composer, 54), composer, 384, 3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* renamed from: t2 */
    public static final Unit m9043t2(NavArgumentBuilder navArgument) {
        Intrinsics.checkNotNullParameter(navArgument, "$this$navArgument");
        navArgument.setType(NavType.LongType);
        return Unit.INSTANCE;
    }

    /* renamed from: t3 */
    public static final Unit m9044t3(MainFragment mainFragment, Function0 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        mainFragment.m9073n1(it);
        return Unit.INSTANCE;
    }

    /* renamed from: u1 */
    public static final Unit m9047u1(final MainFragment mainFragment, Composer composer, int i10) {
        if (composer.shouldExecute((i10 & 3) != 2, i10 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(65808783, i10, -1, "com.zykj.evaluation.ui.MainFragment.onCreateView.<anonymous>.<anonymous>.<anonymous> (MainFragment.kt:98)");
            }
            String serverUrl = m9049u3(FlowExtKt.collectAsStateWithLifecycle(mainFragment.m9033r1().getHeaderBeanFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer, 0, 7)).getServerUrl();
            if (serverUrl == null || serverUrl.length() == 0) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                return Unit.INSTANCE;
            }
            final NavHostController navHostControllerRememberNavController = NavHostControllerKt.rememberNavController(new Navigator[0], composer, 0);
            composer.startMovableGroup(-1182224465, m9054v3(FlowExtKt.collectAsStateWithLifecycle(mainFragment.m9033r1().getUserFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer, 0, 7)));
            boolean zChangedInstance = composer.changedInstance(navHostControllerRememberNavController) | composer.changedInstance(mainFragment);
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: s5.z0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return MainFragment.m9052v1(navHostControllerRememberNavController, mainFragment, (NavGraphBuilder) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            NavHostKt.NavHost(navHostControllerRememberNavController, "HOME", null, null, null, null, null, null, null, null, (Function1) objRememberedValue, composer, 48, 0, PointerIconCompat.TYPE_GRAB);
            composer.endMovableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* renamed from: u2 */
    public static final Unit m9048u2(NavArgumentBuilder navArgument) {
        Intrinsics.checkNotNullParameter(navArgument, "$this$navArgument");
        navArgument.setType(NavType.BoolType);
        return Unit.INSTANCE;
    }

    /* renamed from: u3 */
    public static final HeaderBean m9049u3(State state) {
        return (HeaderBean) state.getValue();
    }

    /* renamed from: v1 */
    public static final Unit m9052v1(final NavHostController navHostController, final MainFragment mainFragment, NavGraphBuilder NavHost) {
        Intrinsics.checkNotNullParameter(NavHost, "$this$NavHost");
        NavGraphBuilderKt.composable$default(NavHost, "HOME", (List) null, (List) null, (Function1) null, (Function1) null, (Function1) null, (Function1) null, (Function1) null, ComposableLambdaKt.composableLambdaInstance(-83314561, true, new Function4() { // from class: s5.k1
            @Override // kotlin.jvm.functions.Function4
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                return MainFragment.m9057w1(navHostController, mainFragment, (AnimatedContentScope) obj, (NavBackStackEntry) obj2, (Composer) obj3, ((Integer) obj4).intValue());
            }
        }), 254, (Object) null);
        NavGraphBuilderKt.composable$default(NavHost, "GUIDE_NO_STEM/{GUIDE_KEY_TASK_ID}", CollectionsKt.listOf(NamedNavArgumentKt.navArgument("GUIDE_KEY_TASK_ID", new Function1() { // from class: s5.y
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MainFragment.m8872F1((NavArgumentBuilder) obj);
            }
        })), (List) null, (Function1) null, (Function1) null, (Function1) null, (Function1) null, (Function1) null, ComposableLambdaKt.composableLambdaInstance(2023467688, true, new Function4() { // from class: s5.k0
            @Override // kotlin.jvm.functions.Function4
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                return MainFragment.m8956a2(navHostController, mainFragment, (AnimatedContentScope) obj, (NavBackStackEntry) obj2, (Composer) obj3, ((Integer) obj4).intValue());
            }
        }), 252, (Object) null);
        NavGraphBuilderKt.composable$default(NavHost, "GUIDE_TO_DO/{GUIDE_KEY_TASK_ID}", CollectionsKt.listOf(NamedNavArgumentKt.navArgument("GUIDE_KEY_TASK_ID", new Function1() { // from class: s5.w0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MainFragment.m8972e2((NavArgumentBuilder) obj);
            }
        })), (List) null, (Function1) null, (Function1) null, (Function1) null, (Function1) null, (Function1) null, ComposableLambdaKt.composableLambdaInstance(-463225849, true, new Function4() { // from class: s5.i1
            @Override // kotlin.jvm.functions.Function4
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                return MainFragment.m8976f2(navHostController, (AnimatedContentScope) obj, (NavBackStackEntry) obj2, (Composer) obj3, ((Integer) obj4).intValue());
            }
        }), 252, (Object) null);
        NavGraphBuilderKt.composable$default(NavHost, "GUIDE_CORRECTING/{GUIDE_KEY_TASK_ID}", CollectionsKt.listOf(NamedNavArgumentKt.navArgument("GUIDE_KEY_TASK_ID", new Function1() { // from class: s5.m1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MainFragment.m8986h2((NavArgumentBuilder) obj);
            }
        })), (List) null, (Function1) null, (Function1) null, (Function1) null, (Function1) null, (Function1) null, ComposableLambdaKt.composableLambdaInstance(1345047910, true, new Function4() { // from class: s5.n1
            @Override // kotlin.jvm.functions.Function4
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                return MainFragment.m8991i2(navHostController, (AnimatedContentScope) obj, (NavBackStackEntry) obj2, (Composer) obj3, ((Integer) obj4).intValue());
            }
        }), 252, (Object) null);
        NavGraphBuilderKt.composable$default(NavHost, "GUIDE_TO_CORRECT_SELF/{GUIDE_KEY_TASK_ID}", CollectionsKt.listOf(NamedNavArgumentKt.navArgument("GUIDE_KEY_TASK_ID", new Function1() { // from class: s5.o1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MainFragment.m9001k2((NavArgumentBuilder) obj);
            }
        })), (List) null, (Function1) null, (Function1) null, (Function1) null, (Function1) null, (Function1) null, ComposableLambdaKt.composableLambdaInstance(-1141645627, true, new Function4() { // from class: s5.p1
            @Override // kotlin.jvm.functions.Function4
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                return MainFragment.m9006l2(navHostController, (AnimatedContentScope) obj, (NavBackStackEntry) obj2, (Composer) obj3, ((Integer) obj4).intValue());
            }
        }), 252, (Object) null);
        NavGraphBuilderKt.composable$default(NavHost, "GUIDE_TO_CORRECT/{GUIDE_KEY_TASK_ID}", CollectionsKt.listOf(NamedNavArgumentKt.navArgument("GUIDE_KEY_TASK_ID", new Function1() { // from class: s5.q1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MainFragment.m9015n2((NavArgumentBuilder) obj);
            }
        })), (List) null, (Function1) null, (Function1) null, (Function1) null, (Function1) null, (Function1) null, ComposableLambdaKt.composableLambdaInstance(666628132, true, new Function4() { // from class: s5.v1
            @Override // kotlin.jvm.functions.Function4
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                return MainFragment.m9020o2(navHostController, (AnimatedContentScope) obj, (NavBackStackEntry) obj2, (Composer) obj3, ((Integer) obj4).intValue());
            }
        }), 252, (Object) null);
        NavGraphBuilderKt.composable$default(NavHost, "GUIDE_REVISING/{GUIDE_KEY_TASK_ID}", CollectionsKt.listOf(NamedNavArgumentKt.navArgument("GUIDE_KEY_TASK_ID", new Function1() { // from class: s5.g2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MainFragment.m9029q2((NavArgumentBuilder) obj);
            }
        })), (List) null, (Function1) null, (Function1) null, (Function1) null, (Function1) null, (Function1) null, ComposableLambdaKt.composableLambdaInstance(-1820065405, true, new Function4() { // from class: s5.r2
            @Override // kotlin.jvm.functions.Function4
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                return MainFragment.m9034r2(navHostController, (AnimatedContentScope) obj, (NavBackStackEntry) obj2, (Composer) obj3, ((Integer) obj4).intValue());
            }
        }), 252, (Object) null);
        NavGraphBuilderKt.composable$default(NavHost, "GUIDE_DONE/{GUIDE_KEY_TASK_ID}/{GUIDE_KEY_EXAM_IS_FINISH}", CollectionsKt.listOf((Object[]) new NamedNavArgument[]{NamedNavArgumentKt.navArgument("GUIDE_KEY_TASK_ID", new Function1() { // from class: s5.c3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MainFragment.m9043t2((NavArgumentBuilder) obj);
            }
        }), NamedNavArgumentKt.navArgument("GUIDE_KEY_EXAM_IS_FINISH", new Function1() { // from class: s5.n3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MainFragment.m9048u2((NavArgumentBuilder) obj);
            }
        })}), (List) null, (Function1) null, (Function1) null, (Function1) null, (Function1) null, (Function1) null, ComposableLambdaKt.composableLambdaInstance(-11791646, true, new Function4() { // from class: s5.t
            @Override // kotlin.jvm.functions.Function4
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                return MainFragment.m9053v2(navHostController, (AnimatedContentScope) obj, (NavBackStackEntry) obj2, (Composer) obj3, ((Integer) obj4).intValue());
            }
        }), 252, (Object) null);
        NavGraphBuilderKt.composable$default(NavHost, "DETAIL_TO_DO/{KEY_TASK_ID}", CollectionsKt.listOf(NamedNavArgumentKt.navArgument("KEY_TASK_ID", new Function1() { // from class: s5.u
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MainFragment.m9062x2((NavArgumentBuilder) obj);
            }
        })), (List) null, (Function1) null, (Function1) null, (Function1) null, (Function1) null, (Function1) null, ComposableLambdaKt.composableLambdaInstance(1796482113, true, new Function4() { // from class: s5.v
            @Override // kotlin.jvm.functions.Function4
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                return MainFragment.m9067y2(navHostController, mainFragment, (AnimatedContentScope) obj, (NavBackStackEntry) obj2, (Composer) obj3, ((Integer) obj4).intValue());
            }
        }), 252, (Object) null);
        NavGraphBuilderKt.composable$default(NavHost, "DETAIL_CORRECTING/{KEY_TASK_ID}", CollectionsKt.listOf(NamedNavArgumentKt.navArgument("KEY_TASK_ID", new Function1() { // from class: s5.w
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MainFragment.m8861C2((NavArgumentBuilder) obj);
            }
        })), (List) null, (Function1) null, (Function1) null, (Function1) null, (Function1) null, (Function1) null, ComposableLambdaKt.composableLambdaInstance(-690211424, true, new Function4() { // from class: s5.x
            @Override // kotlin.jvm.functions.Function4
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                return MainFragment.m8865D2(navHostController, (AnimatedContentScope) obj, (NavBackStackEntry) obj2, (Composer) obj3, ((Integer) obj4).intValue());
            }
        }), 252, (Object) null);
        NavGraphBuilderKt.composable$default(NavHost, "DETAIL_TO_CORRECT_SELF/{KEY_TASK_ID}", CollectionsKt.listOf(NamedNavArgumentKt.navArgument("KEY_TASK_ID", new Function1() { // from class: s5.z
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MainFragment.m8873F2((NavArgumentBuilder) obj);
            }
        })), (List) null, (Function1) null, (Function1) null, (Function1) null, (Function1) null, (Function1) null, ComposableLambdaKt.composableLambdaInstance(-1136641484, true, new Function4() { // from class: s5.a0
            @Override // kotlin.jvm.functions.Function4
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                return MainFragment.m8877G2(navHostController, mainFragment, (AnimatedContentScope) obj, (NavBackStackEntry) obj2, (Composer) obj3, ((Integer) obj4).intValue());
            }
        }), 252, (Object) null);
        NavGraphBuilderKt.composable$default(NavHost, "DETAIL_TO_CORRECT/{KEY_TASK_ID}", CollectionsKt.listOf(NamedNavArgumentKt.navArgument("KEY_TASK_ID", new Function1() { // from class: s5.b0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MainFragment.m8901M2((NavArgumentBuilder) obj);
            }
        })), (List) null, (Function1) null, (Function1) null, (Function1) null, (Function1) null, (Function1) null, ComposableLambdaKt.composableLambdaInstance(671632275, true, new Function4() { // from class: s5.c0
            @Override // kotlin.jvm.functions.Function4
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                return MainFragment.m8905N2(navHostController, mainFragment, (AnimatedContentScope) obj, (NavBackStackEntry) obj2, (Composer) obj3, ((Integer) obj4).intValue());
            }
        }), 252, (Object) null);
        NavGraphBuilderKt.composable$default(NavHost, "DETAIL_REVISING/{KEY_TASK_ID}", CollectionsKt.listOf(NamedNavArgumentKt.navArgument("KEY_TASK_ID", new Function1() { // from class: s5.e0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MainFragment.m8929T2((NavArgumentBuilder) obj);
            }
        })), (List) null, (Function1) null, (Function1) null, (Function1) null, (Function1) null, (Function1) null, ComposableLambdaKt.composableLambdaInstance(-1815061262, true, new Function4() { // from class: s5.f0
            @Override // kotlin.jvm.functions.Function4
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                return MainFragment.m8933U2(navHostController, mainFragment, (AnimatedContentScope) obj, (NavBackStackEntry) obj2, (Composer) obj3, ((Integer) obj4).intValue());
            }
        }), 252, (Object) null);
        NavGraphBuilderKt.composable$default(NavHost, "DETAIL_DONE/{KEY_TASK_ID}/{DETAIL_KEY_EXAM_IS_FINISH}", CollectionsKt.listOf((Object[]) new NamedNavArgument[]{NamedNavArgumentKt.navArgument("KEY_TASK_ID", new Function1() { // from class: s5.g0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MainFragment.m8949Y2((NavArgumentBuilder) obj);
            }
        }), NamedNavArgumentKt.navArgument("DETAIL_KEY_EXAM_IS_FINISH", new Function1() { // from class: s5.h0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MainFragment.m8953Z2((NavArgumentBuilder) obj);
            }
        })}), (List) null, (Function1) null, (Function1) null, (Function1) null, (Function1) null, (Function1) null, ComposableLambdaKt.composableLambdaInstance(-6787503, true, new Function4() { // from class: s5.i0
            @Override // kotlin.jvm.functions.Function4
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                return MainFragment.m8957a3(navHostController, mainFragment, (AnimatedContentScope) obj, (NavBackStackEntry) obj2, (Composer) obj3, ((Integer) obj4).intValue());
            }
        }), 252, (Object) null);
        NavGraphBuilderKt.composable$default(NavHost, "SKETCH_PLAY/{SKETCH_KEY_EXAM_ID}/{SKETCH_KEY_QUESTION_ID}/{SKETCH_KEY_URL}", CollectionsKt.listOf((Object[]) new NamedNavArgument[]{NamedNavArgumentKt.navArgument("SKETCH_KEY_EXAM_ID", new Function1() { // from class: s5.j0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MainFragment.m8973e3((NavArgumentBuilder) obj);
            }
        }), NamedNavArgumentKt.navArgument("SKETCH_KEY_QUESTION_ID", new Function1() { // from class: s5.l0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MainFragment.m8977f3((NavArgumentBuilder) obj);
            }
        }), NamedNavArgumentKt.navArgument("SKETCH_KEY_URL", new Function1() { // from class: s5.m0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MainFragment.m8982g3((NavArgumentBuilder) obj);
            }
        })}), (List) null, (Function1) null, (Function1) null, (Function1) null, (Function1) null, (Function1) null, ComposableLambdaKt.composableLambdaInstance(1801486256, true, new Function4() { // from class: s5.n0
            @Override // kotlin.jvm.functions.Function4
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                return MainFragment.m8987h3(navHostController, (AnimatedContentScope) obj, (NavBackStackEntry) obj2, (Composer) obj3, ((Integer) obj4).intValue());
            }
        }), 252, (Object) null);
        NavGraphBuilderKt.composable$default(NavHost, "IMAGE?IMAGE_KEY_EXAM_URL={IMAGE_KEY_EXAM_URL}?IMAGE_KEY_COMMENT_URL={IMAGE_KEY_COMMENT_URL}", CollectionsKt.listOf((Object[]) new NamedNavArgument[]{NamedNavArgumentKt.navArgument("IMAGE_KEY_EXAM_URL", new Function1() { // from class: s5.p0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MainFragment.m8997j3((NavArgumentBuilder) obj);
            }
        }), NamedNavArgumentKt.navArgument("IMAGE_KEY_COMMENT_URL", new Function1() { // from class: s5.q0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MainFragment.m9002k3((NavArgumentBuilder) obj);
            }
        })}), (List) null, (Function1) null, (Function1) null, (Function1) null, (Function1) null, (Function1) null, ComposableLambdaKt.composableLambdaInstance(-685207281, true, new Function4() { // from class: s5.r0
            @Override // kotlin.jvm.functions.Function4
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                return MainFragment.m9007l3(navHostController, (AnimatedContentScope) obj, (NavBackStackEntry) obj2, (Composer) obj3, ((Integer) obj4).intValue());
            }
        }), 252, (Object) null);
        NavGraphBuilderKt.composable$default(NavHost, "MISTAKE", (List) null, (List) null, (Function1) null, (Function1) null, (Function1) null, (Function1) null, (Function1) null, ComposableLambdaKt.composableLambdaInstance(1123066478, true, new Function4() { // from class: s5.s0
            @Override // kotlin.jvm.functions.Function4
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                return MainFragment.m9016n3(navHostController, mainFragment, (AnimatedContentScope) obj, (NavBackStackEntry) obj2, (Composer) obj3, ((Integer) obj4).intValue());
            }
        }), 254, (Object) null);
        NavGraphBuilderKt.composable$default(NavHost, "ANSWER_SHEET_COMPOSITION", (List) null, (List) null, (Function1) null, (Function1) null, (Function1) null, (Function1) null, (Function1) null, ComposableLambdaKt.composableLambdaInstance(-1363627059, true, new Function4() { // from class: s5.t0
            @Override // kotlin.jvm.functions.Function4
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                return MainFragment.m9030q3(navHostController, mainFragment, (AnimatedContentScope) obj, (NavBackStackEntry) obj2, (Composer) obj3, ((Integer) obj4).intValue());
            }
        }), 254, (Object) null);
        NavGraphBuilderKt.composable$default(NavHost, "ANSWER_SHEET_NORMAL", (List) null, (List) null, (Function1) null, (Function1) null, (Function1) null, (Function1) null, (Function1) null, ComposableLambdaKt.composableLambdaInstance(444646700, true, new Function4() { // from class: s5.u0
            @Override // kotlin.jvm.functions.Function4
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                return MainFragment.m8856B1(navHostController, mainFragment, (AnimatedContentScope) obj, (NavBackStackEntry) obj2, (Composer) obj3, ((Integer) obj4).intValue());
            }
        }), 254, (Object) null);
        NavGraphBuilderKt.composable$default(NavHost, "ANSWER_SHEET_TREBLE", (List) null, (List) null, (Function1) null, (Function1) null, (Function1) null, (Function1) null, (Function1) null, ComposableLambdaKt.composableLambdaInstance(-2042046837, true, new Function4() { // from class: s5.v0
            @Override // kotlin.jvm.functions.Function4
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                return MainFragment.m8876G1(navHostController, mainFragment, (AnimatedContentScope) obj, (NavBackStackEntry) obj2, (Composer) obj3, ((Integer) obj4).intValue());
            }
        }), 254, (Object) null);
        NavGraphBuilderKt.dialog$default(NavHost, "REMOVE_MISTAKE", (List) null, (List) null, (DialogProperties) null, ComposableLambdaKt.composableLambdaInstance(-1392788420, true, new Function3() { // from class: s5.x0
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return MainFragment.m8892K1(navHostController, (NavBackStackEntry) obj, (Composer) obj2, ((Integer) obj3).intValue());
            }
        }), 14, (Object) null);
        NavGraphBuilderKt.dialog$default(NavHost, "CREATE_UPDATE/{CREATE_UPDATEKEY_TAG_BUNDLE}", CollectionsKt.listOf(NamedNavArgumentKt.navArgument("CREATE_UPDATEKEY_TAG_BUNDLE", new Function1() { // from class: s5.y0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MainFragment.m8900M1((NavArgumentBuilder) obj);
            }
        })), (List) null, (DialogProperties) null, ComposableLambdaKt.composableLambdaInstance(2044506917, true, new Function3() { // from class: s5.a1
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return MainFragment.m8904N1(navHostController, (NavBackStackEntry) obj, (Composer) obj2, ((Integer) obj3).intValue());
            }
        }), 12, (Object) null);
        List listListOf = CollectionsKt.listOf((Object[]) new NamedNavArgument[]{NamedNavArgumentKt.navArgument("PROGRESS_KEY_PROGRESS_TODO", new Function1() { // from class: s5.b1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MainFragment.m8912P1((NavArgumentBuilder) obj);
            }
        }), NamedNavArgumentKt.navArgument("PROGRESS_KEY_PROGRESS_CORRECT", new Function1() { // from class: s5.c1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MainFragment.m8916Q1((NavArgumentBuilder) obj);
            }
        })});
        ComposableSingletons$MainFragmentKt composableSingletons$MainFragmentKt = ComposableSingletons$MainFragmentKt.f8973a;
        NavGraphBuilderKt.dialog$default(NavHost, "PROGRESS/{PROGRESS_KEY_PROGRESS_TODO}/{PROGRESS_KEY_PROGRESS_CORRECT}", listListOf, (List) null, (DialogProperties) null, composableSingletons$MainFragmentKt.m8825e(), 12, (Object) null);
        NavGraphBuilderKt.dialog$default(NavHost, "DESCRIPTION/{DESCRIPTION_KEY_TITLE}", CollectionsKt.listOf(NamedNavArgumentKt.navArgument("DESCRIPTION_KEY_TITLE", new Function1() { // from class: s5.d1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MainFragment.m8920R1((NavArgumentBuilder) obj);
            }
        })), (List) null, (DialogProperties) null, composableSingletons$MainFragmentKt.m8826f(), 12, (Object) null);
        NavGraphBuilderKt.dialog$default(NavHost, "SUBMIT/{SUBMIT_KEY_ALL_COMPLETE}/{SUBMIT_KEY_IS_NO_STEAM}?SUBMIT_KEY_COMMIT_FAILED={SUBMIT_KEY_COMMIT_FAILED}", CollectionsKt.listOf((Object[]) new NamedNavArgument[]{NamedNavArgumentKt.navArgument("SUBMIT_KEY_ALL_COMPLETE", new Function1() { // from class: s5.e1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MainFragment.m8924S1((NavArgumentBuilder) obj);
            }
        }), NamedNavArgumentKt.navArgument("SUBMIT_KEY_IS_NO_STEAM", new Function1() { // from class: s5.f1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MainFragment.m8928T1((NavArgumentBuilder) obj);
            }
        }), NamedNavArgumentKt.navArgument("SUBMIT_KEY_COMMIT_FAILED", new Function1() { // from class: s5.g1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MainFragment.m8932U1((NavArgumentBuilder) obj);
            }
        })}), (List) null, (DialogProperties) null, ComposableLambdaKt.composableLambdaInstance(-1120606398, true, new Function3() { // from class: s5.h1
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return MainFragment.m8936V1(navHostController, (NavBackStackEntry) obj, (Composer) obj2, ((Integer) obj3).intValue());
            }
        }), 12, (Object) null);
        NavGraphBuilderKt.dialog$default(NavHost, "SUBMIT_CORRECT_SELF/{SUBMIT_KEY_ALL_COMPLETE}", CollectionsKt.listOf(NamedNavArgumentKt.navArgument("SUBMIT_KEY_ALL_COMPLETE", new Function1() { // from class: s5.j1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MainFragment.m8944X1((NavArgumentBuilder) obj);
            }
        })), (List) null, (DialogProperties) null, ComposableLambdaKt.composableLambdaInstance(687667361, true, new Function3() { // from class: s5.l1
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return MainFragment.m8948Y1(navHostController, (NavBackStackEntry) obj, (Composer) obj2, ((Integer) obj3).intValue());
            }
        }), 12, (Object) null);
        return Unit.INSTANCE;
    }

    /* renamed from: v2 */
    public static final Unit m9053v2(final NavHostController navHostController, AnimatedContentScope composable, final NavBackStackEntry it, Composer composer, int i10) {
        Intrinsics.checkNotNullParameter(composable, "$this$composable");
        Intrinsics.checkNotNullParameter(it, "it");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-11791646, i10, -1, "com.zykj.evaluation.ui.MainFragment.onCreateView.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MainFragment.kt:262)");
        }
        MainFragmentKt.m9078b("DoneGuidePage", ComposableLambdaKt.rememberComposableLambda(574083995, true, new Function2() { // from class: s5.y1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return MainFragment.m9058w2(navHostController, it, (Composer) obj, ((Integer) obj2).intValue());
            }
        }, composer, 54), composer, 54);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }

    /* renamed from: v3 */
    public static final UserInfo m9054v3(State state) {
        return (UserInfo) state.getValue();
    }

    /* renamed from: w1 */
    public static final Unit m9057w1(final NavHostController navHostController, final MainFragment mainFragment, AnimatedContentScope composable, NavBackStackEntry it, Composer composer, int i10) {
        Intrinsics.checkNotNullParameter(composable, "$this$composable");
        Intrinsics.checkNotNullParameter(it, "it");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-83314561, i10, -1, "com.zykj.evaluation.ui.MainFragment.onCreateView.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MainFragment.kt:111)");
        }
        MainFragmentKt.m9078b("HomePage", ComposableLambdaKt.rememberComposableLambda(221205368, true, new Function2() { // from class: s5.t1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return MainFragment.m9061x1(navHostController, mainFragment, (Composer) obj, ((Integer) obj2).intValue());
            }
        }, composer, 54), composer, 54);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }

    /* renamed from: w2 */
    public static final Unit m9058w2(NavHostController navHostController, NavBackStackEntry navBackStackEntry, Composer composer, int i10) {
        if (composer.shouldExecute((i10 & 3) != 2, i10 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(574083995, i10, -1, "com.zykj.evaluation.ui.MainFragment.onCreateView.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MainFragment.kt:263)");
            }
            Bundle arguments = navBackStackEntry.getArguments();
            long j10 = arguments != null ? arguments.getLong("GUIDE_KEY_TASK_ID") : 0L;
            Bundle arguments2 = navBackStackEntry.getArguments();
            DoneGuidePageKt.m9872c(navHostController, j10, arguments2 != null ? arguments2.getBoolean("GUIDE_KEY_EXAM_IS_FINISH") : false, null, composer, 0, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* renamed from: x1 */
    public static final Unit m9061x1(NavHostController navHostController, final MainFragment mainFragment, Composer composer, int i10) {
        if (composer.shouldExecute((i10 & 3) != 2, i10 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(221205368, i10, -1, "com.zykj.evaluation.ui.MainFragment.onCreateView.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MainFragment.kt:112)");
            }
            boolean zChangedInstance = composer.changedInstance(mainFragment);
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function3() { // from class: s5.i3
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        return MainFragment.m9066y1(this.f15909a, (String) obj, (String) obj2, (Function2) obj3);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            Function3 function3 = (Function3) objRememberedValue;
            boolean zChangedInstance2 = composer.changedInstance(mainFragment);
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function1() { // from class: s5.j3
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return MainFragment.m8852A1(this.f15914a, (VersionResult) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            HomePageKt.m10022t(navHostController, function3, (Function1) objRememberedValue2, null, composer, 0, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* renamed from: x2 */
    public static final Unit m9062x2(NavArgumentBuilder navArgument) {
        Intrinsics.checkNotNullParameter(navArgument, "$this$navArgument");
        navArgument.setType(NavType.LongType);
        return Unit.INSTANCE;
    }

    /* renamed from: x3 */
    public static final void m9063x3(MainFragment mainFragment, final Function1 function1, boolean z9, List granted, List deniedForever, List denied) {
        Intrinsics.checkNotNullParameter(granted, "granted");
        Intrinsics.checkNotNullParameter(deniedForever, "deniedForever");
        Intrinsics.checkNotNullParameter(denied, "denied");
        if (z9) {
            C5060q.m2558u(mainFragment.mImagePicker, null, true, new Function1() { // from class: s5.s
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return MainFragment.m9068y3(function1, (Uri) obj);
                }
            }, 1, null);
            return;
        }
        XToastUtils xToastUtils = XToastUtils.INSTANCE;
        String string = mainFragment.getString(R.string.app_no_permission);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        xToastUtils.info(string);
    }

    /* renamed from: y1 */
    public static final Unit m9066y1(MainFragment mainFragment, String originStart, String originEnd, final Function2 confirmCallback) {
        Intrinsics.checkNotNullParameter(originStart, "originStart");
        Intrinsics.checkNotNullParameter(originEnd, "originEnd");
        Intrinsics.checkNotNullParameter(confirmCallback, "confirmCallback");
        DatePickerFragment datePickerFragmentM9238F = DatePickerFragment.INSTANCE.m9241a(new DatePickerFragmentArgs(originStart, originEnd)).m9238F(new Function2() { // from class: s5.p
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return MainFragment.m9071z1(confirmCallback, (String) obj, (String) obj2);
            }
        });
        FragmentManager childFragmentManager = mainFragment.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        datePickerFragmentM9238F.showDialog(childFragmentManager);
        return Unit.INSTANCE;
    }

    /* renamed from: y2 */
    public static final Unit m9067y2(final NavHostController navHostController, final MainFragment mainFragment, AnimatedContentScope composable, final NavBackStackEntry it, Composer composer, int i10) {
        Intrinsics.checkNotNullParameter(composable, "$this$composable");
        Intrinsics.checkNotNullParameter(it, "it");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1796482113, i10, -1, "com.zykj.evaluation.ui.MainFragment.onCreateView.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MainFragment.kt:281)");
        }
        MainFragmentKt.m9078b("TodoDetailPage", ComposableLambdaKt.rememberComposableLambda(-1912609542, true, new Function2() { // from class: s5.c2
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return MainFragment.m9072z2(it, navHostController, mainFragment, (Composer) obj, ((Integer) obj2).intValue());
            }
        }, composer, 54), composer, 54);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }

    /* renamed from: y3 */
    public static final Unit m9068y3(Function1 function1, Uri uri) {
        if (uri != null) {
            function1.invoke(uri);
        }
        return Unit.INSTANCE;
    }

    /* renamed from: z1 */
    public static final Unit m9071z1(Function2 function2, String str, String str2) {
        function2.invoke(str, str2);
        return Unit.INSTANCE;
    }

    /* renamed from: z2 */
    public static final Unit m9072z2(NavBackStackEntry navBackStackEntry, NavHostController navHostController, final MainFragment mainFragment, Composer composer, int i10) {
        if (composer.shouldExecute((i10 & 3) != 2, i10 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1912609542, i10, -1, "com.zykj.evaluation.ui.MainFragment.onCreateView.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MainFragment.kt:282)");
            }
            Bundle arguments = navBackStackEntry.getArguments();
            long j10 = arguments != null ? arguments.getLong("KEY_TASK_ID") : 0L;
            DetailBundle detailBundle = (DetailBundle) AbstractC7586b.m12450a().getParcelable("KEY_DETAIL_BUNDLE");
            boolean zChangedInstance = composer.changedInstance(mainFragment);
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function6() { // from class: s5.h3
                    @Override // kotlin.jvm.functions.Function6
                    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
                        return MainFragment.m8853A2(this.f15903a, (String) obj, (String) obj2, ((Boolean) obj3).booleanValue(), (String) obj4, (Function1) obj5, ((Boolean) obj6).booleanValue());
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            TodoDetailPageKt.m9722i(j10, detailBundle, navHostController, (Function6) objRememberedValue, null, null, composer, 0, 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* renamed from: n1 */
    public final void m9073n1(final Function0 successCallback) {
        PermissionUtils.permission("android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.CAMERA").callback(new PermissionUtils.SingleCallback() { // from class: s5.k
            @Override // com.blankj.utilcode.util.PermissionUtils.SingleCallback
            public final void callback(boolean z9, List list, List list2, List list3) {
                MainFragment.m9019o1(successCallback, this, z9, list, list2, list3);
            }
        }).request();
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        ComposeView composeView = new ComposeView(contextRequireContext, null, 0, 6, null);
        composeView.setContent(ComposableLambdaKt.composableLambdaInstance(-1734361901, true, new Function2() { // from class: s5.d0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return MainFragment.m9042t1(this.f15883a, (Composer) obj, ((Integer) obj2).intValue());
            }
        }));
        return composeView;
    }

    /* renamed from: p1 */
    public final void m9074p1(final Function0 successCallback) {
        PermissionUtils.permission("android.permission.WRITE_EXTERNAL_STORAGE").callback(new PermissionUtils.SingleCallback() { // from class: s5.n
            @Override // com.blankj.utilcode.util.PermissionUtils.SingleCallback
            public final void callback(boolean z9, List list, List list2, List list3) {
                MainFragment.m9028q1(successCallback, this, z9, list, list2, list3);
            }
        }).request();
    }

    /* renamed from: s1 */
    public final void m9075s1(List pathList) {
        try {
            ActivityResultLauncher activityResultLauncher = this.askLauncher;
            Intent intent = new Intent("com.zykj.dialogue.ask");
            intent.addCategory("android.intent.category.DEFAULT");
            intent.setDataAndType(Uri.parse("http://www.zykj.dialogue.ask/"), "share/file");
            intent.putExtra("localPathList", (String[]) pathList.toArray(new String[0]));
            intent.putExtra("fromOtherApp", true);
            activityResultLauncher.launch(intent);
        } catch (ActivityNotFoundException unused) {
            ToastUtils.showShort("未检测到随身答应用，无法提问", new Object[0]);
        }
    }

    /* renamed from: w3 */
    public final void m9076w3(final Function1 callback) {
        PermissionUtils.permission("android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.CAMERA").callback(new PermissionUtils.SingleCallback() { // from class: s5.l
            @Override // com.blankj.utilcode.util.PermissionUtils.SingleCallback
            public final void callback(boolean z9, List list, List list2, List list3) {
                MainFragment.m9063x3(this.f15924a, callback, z9, list, list2, list3);
            }
        }).request();
    }
}
