package com.zykj.evaluation.p057ui.detail;

// RE note 本类字节码直接引用的读写或显示接口包括JSON。

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.util.DisplayMetrics;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.DividerKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p013ui.Alignment;
import androidx.compose.p013ui.ComposedModifierKt;
import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.graphics.Color;
import androidx.compose.p013ui.graphics.ColorFilter;
import androidx.compose.p013ui.graphics.ColorKt;
import androidx.compose.p013ui.graphics.painter.Painter;
import androidx.compose.p013ui.layout.ContentScale;
import androidx.compose.p013ui.layout.MeasurePolicy;
import androidx.compose.p013ui.node.ComposeUiNode;
import androidx.compose.p013ui.res.PainterResources_androidKt;
import androidx.compose.p013ui.res.StringResources_androidKt;
import androidx.compose.p013ui.text.AnnotatedString;
import androidx.compose.p013ui.text.TextLayoutResult;
import androidx.compose.p013ui.text.TextStyle;
import androidx.compose.p013ui.text.font.FontFamily;
import androidx.compose.p013ui.text.font.FontStyle;
import androidx.compose.p013ui.text.font.FontWeight;
import androidx.compose.p013ui.text.style.TextAlign;
import androidx.compose.p013ui.text.style.TextDecoration;
import androidx.compose.p013ui.text.style.TextOverflow;
import androidx.compose.p013ui.unit.C3127Dp;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.SavedStateHandle;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavController;
import androidx.navigation.NavOptions;
import androidx.navigation.Navigator;
import com.google.gson.Gson;
import com.zykj.base.utils.XToastUtils;
import com.zykj.evaluation.R;
import com.zykj.evaluation.bean.bundle.DetailBundle;
import com.zykj.evaluation.bean.bundle.MistakeDataBundle;
import com.zykj.evaluation.p057ui.detail.AbstractC6896a;
import com.zykj.evaluation.p057ui.detail.AbstractC6899d;
import com.zykj.evaluation.p057ui.detail.TaskDetailPageKt;
import com.zykj.evaluation.p057ui.guide.normal.GuideViewModel;
import com.zykj.evaluation.p057ui.widget.CustomIndicationFactory;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import p068d7.AbstractC7305a;
import p089f6.AbstractC7446c0;
import p089f6.AbstractC7454g0;
import p089f6.AbstractC7482u0;
import p089f6.C7459j;
import p100g6.AbstractC7584z0;
import p101g7.AbstractC7586b;
import p101g7.AbstractC7593i;
import p189o5.AbstractC8709e;
import p202p7.AbstractC8858b;
import p276w5.AbstractC9778i;
import p276w5.C9767e;

/* loaded from: classes4.dex */
public abstract class TaskDetailPageKt {
    /* renamed from: A0 */
    public static final Unit m9322A0(BaseDetailViewModel baseDetailViewModel) {
        baseDetailViewModel.m8646c();
        return Unit.INSTANCE;
    }

    /* renamed from: B0 */
    public static final Unit m9324B0(boolean z9) {
        return Unit.INSTANCE;
    }

    /* renamed from: C0 */
    public static final Unit m9326C0(String str, boolean z9) {
        Intrinsics.checkNotNullParameter(str, "<unused var>");
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:133:0x0568  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x058f  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x05ac  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x05d6  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0605  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x061b  */
    /* renamed from: D0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit m9328D0(final com.zykj.evaluation.p057ui.detail.C6897b r28, final kotlin.jvm.functions.Function0 r29, final androidx.navigation.NavController r30, final com.zykj.evaluation.p057ui.detail.BaseDetailViewModel r31, final p089f6.C7459j r32, androidx.compose.foundation.ScrollState r33, p276w5.C9767e r34, final kotlin.jvm.functions.Function4 r35, kotlin.jvm.functions.Function2 r36, kotlin.jvm.functions.Function1 r37, kotlin.jvm.functions.Function2 r38, kotlin.jvm.functions.Function2 r39, final kotlin.jvm.functions.Function1 r40, final kotlin.jvm.functions.Function1 r41, androidx.compose.foundation.layout.BoxScope r42, androidx.compose.runtime.Composer r43, int r44) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 1573
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.evaluation.p057ui.detail.TaskDetailPageKt.m9328D0(com.zykj.evaluation.ui.detail.b, kotlin.jvm.functions.Function0, androidx.navigation.NavController, com.zykj.evaluation.ui.detail.BaseDetailViewModel, f6.j, androidx.compose.foundation.ScrollState, w5.e, kotlin.jvm.functions.Function4, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, androidx.compose.foundation.layout.BoxScope, androidx.compose.runtime.Composer, int):kotlin.Unit"); // DEX body: android/新测评/smali_classes4/com/zykj/evaluation/ui/detail/TaskDetailPageKt.smali:99
    }

    /* renamed from: E0 */
    public static final Unit m9330E0(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* renamed from: F0 */
    public static final Unit m9332F0(C6897b c6897b, NavController navController) {
        AbstractC7586b.m12450a().putString("DESCRIPTION_KEY_CONTENT", c6897b.m9436j());
        NavController.navigate$default(navController, "DESCRIPTION/大题说明", (NavOptions) null, (Navigator.Extras) null, 6, (Object) null);
        return Unit.INSTANCE;
    }

    /* renamed from: G0 */
    public static final Unit m9334G0(C6897b c6897b, NavController navController) {
        AbstractC7586b.m12450a().putString("DESCRIPTION_KEY_CONTENT", c6897b.m9431e());
        NavController.navigate$default(navController, "DESCRIPTION/试卷说明", (NavOptions) null, (Navigator.Extras) null, 6, (Object) null);
        return Unit.INSTANCE;
    }

    /* renamed from: H0 */
    public static final Unit m9336H0(BaseDetailViewModel baseDetailViewModel, final NavController navController) {
        baseDetailViewModel.m9284c0(new Function2() { // from class: w5.r0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return TaskDetailPageKt.m9338I0(navController, (List) obj, (List) obj2);
            }
        });
        return Unit.INSTANCE;
    }

    /* renamed from: I0 */
    public static final Unit m9338I0(NavController navController, List noSubmitStudentList, List noCorrectStudentList) {
        Intrinsics.checkNotNullParameter(noSubmitStudentList, "noSubmitStudentList");
        Intrinsics.checkNotNullParameter(noCorrectStudentList, "noCorrectStudentList");
        Gson gson = new Gson();
        NavController.navigate$default(navController, "PROGRESS/" + gson.toJson(noSubmitStudentList) + "/" + gson.toJson(noCorrectStudentList), (NavOptions) null, (Navigator.Extras) null, 6, (Object) null);
        return Unit.INSTANCE;
    }

    /* renamed from: J0 */
    public static final Unit m9340J0(BaseDetailViewModel baseDetailViewModel, boolean z9) {
        baseDetailViewModel.m9309u0(z9);
        return Unit.INSTANCE;
    }

    /* renamed from: K0 */
    public static final Unit m9342K0(Function4 function4, C6897b c6897b, String uuid, String path, boolean z9) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(path, "path");
        function4.invoke(uuid, path, Boolean.valueOf(z9), c6897b.m9430d());
        return Unit.INSTANCE;
    }

    /* renamed from: L0 */
    public static final Unit m9344L0(NavController navController, BaseDetailViewModel baseDetailViewModel, String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        NavController.navigate$default(navController, "SKETCH_PLAY/" + baseDetailViewModel.m9264G() + "/" + baseDetailViewModel.m9274Q() + "/" + StringsKt.replace$default(url, "/", "\\", false, 4, (Object) null), (NavOptions) null, (Navigator.Extras) null, 6, (Object) null);
        return Unit.INSTANCE;
    }

    /* renamed from: M0 */
    public static final Unit m9346M0(NavController navController, String answer, String comment) {
        Intrinsics.checkNotNullParameter(answer, "answer");
        Intrinsics.checkNotNullParameter(comment, "comment");
        NavController.navigate$default(navController, "IMAGE?IMAGE_KEY_EXAM_URL=" + StringsKt.replace$default(answer, "/", "\\", false, 4, (Object) null) + "?IMAGE_KEY_COMMENT_URL=" + StringsKt.replace$default(comment, "/", "\\", false, 4, (Object) null), (NavOptions) null, (Navigator.Extras) null, 6, (Object) null);
        return Unit.INSTANCE;
    }

    /* renamed from: N0 */
    public static final Unit m9348N0(BaseDetailViewModel baseDetailViewModel, boolean z9) {
        baseDetailViewModel.m9288g0(z9);
        return Unit.INSTANCE;
    }

    /* renamed from: O0 */
    public static final Unit m9350O0(C6897b c6897b, final NavController navController, C7459j c7459j, final BaseDetailViewModel baseDetailViewModel) {
        if (c6897b.m9447u() instanceof AbstractC6899d.b) {
            NavController.navigate$default(navController, "REMOVE_MISTAKE", (NavOptions) null, (Navigator.Extras) null, 6, (Object) null);
        } else {
            Bitmap bitmap = (Bitmap) c7459j.m12056h().invoke();
            if (bitmap == null) {
                AbstractC7586b.m12450a().putParcelable("MISTAKE_KEY_MISTAKE_DATA", new MistakeDataBundle(baseDetailViewModel.m9271N(), baseDetailViewModel.m9264G(), baseDetailViewModel.m9282a0(), baseDetailViewModel.m9282a0() ? baseDetailViewModel.m9318z() : baseDetailViewModel.m9274Q(), "", baseDetailViewModel.m9272O(), baseDetailViewModel.m9265H()));
                NavController.navigate$default(navController, "MISTAKE", (NavOptions) null, (Navigator.Extras) null, 6, (Object) null);
            } else {
                baseDetailViewModel.m9287f0(bitmap, new Function1() { // from class: w5.a1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return TaskDetailPageKt.m9352P0(baseDetailViewModel, navController, (String) obj);
                    }
                });
            }
        }
        return Unit.INSTANCE;
    }

    /* renamed from: P0 */
    public static final Unit m9352P0(BaseDetailViewModel baseDetailViewModel, NavController navController, String path) {
        Intrinsics.checkNotNullParameter(path, "path");
        AbstractC7586b.m12450a().putParcelable("MISTAKE_KEY_MISTAKE_DATA", new MistakeDataBundle(baseDetailViewModel.m9271N(), baseDetailViewModel.m9264G(), baseDetailViewModel.m9282a0(), baseDetailViewModel.m9282a0() ? baseDetailViewModel.m9318z() : baseDetailViewModel.m9274Q(), path, baseDetailViewModel.m9272O(), baseDetailViewModel.m9265H()));
        NavController.navigate$default(navController, "MISTAKE", (NavOptions) null, (Navigator.Extras) null, 6, (Object) null);
        return Unit.INSTANCE;
    }

    /* renamed from: Q0 */
    public static final Unit m9354Q0(Function1 function1, final BaseDetailViewModel baseDetailViewModel, final C7459j c7459j, final Function1 function12) {
        function1.invoke(new Function0() { // from class: w5.s0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TaskDetailPageKt.m9356R0(baseDetailViewModel, c7459j, function12);
            }
        });
        return Unit.INSTANCE;
    }

    /* renamed from: R0 */
    public static final Unit m9356R0(BaseDetailViewModel baseDetailViewModel, C7459j c7459j, final Function1 function1) {
        if (baseDetailViewModel.m9279X()) {
            XToastUtils.INSTANCE.error("作文题型暂不支持去随身答提问");
            return Unit.INSTANCE;
        }
        if (baseDetailViewModel.m9281Z()) {
            XToastUtils.INSTANCE.error("无题干客观题暂不支持去随身答提问");
            return Unit.INSTANCE;
        }
        Bitmap bitmap = (Bitmap) c7459j.m12056h().invoke();
        if (bitmap != null) {
            baseDetailViewModel.m9286e0(bitmap, new Function1() { // from class: w5.j
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return TaskDetailPageKt.m9358S0(function1, (List) obj);
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* renamed from: S0 */
    public static final Unit m9358S0(Function1 function1, List list) {
        Intrinsics.checkNotNullParameter(list, "list");
        function1.invoke(list);
        return Unit.INSTANCE;
    }

    /* renamed from: T0 */
    public static final Unit m9360T0(BaseDetailViewModel baseDetailViewModel, C7459j c7459j) {
        baseDetailViewModel.mo9306t(c7459j);
        return Unit.INSTANCE;
    }

    /* renamed from: U0 */
    public static final Unit m9362U0(BaseDetailViewModel baseDetailViewModel, C7459j c7459j, final NavController navController) {
        baseDetailViewModel.mo9304s(c7459j, new Function0() { // from class: w5.z0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TaskDetailPageKt.m9364V0(navController);
            }
        });
        return Unit.INSTANCE;
    }

    /* renamed from: V0 */
    public static final Unit m9364V0(NavController navController) {
        navController.navigateUp();
        return Unit.INSTANCE;
    }

    /* renamed from: W0 */
    public static final Unit m9366W0(NavController navController) {
        NavController.navigate$default(navController, "SUBMIT/true/false", (NavOptions) null, (Navigator.Extras) null, 6, (Object) null);
        return Unit.INSTANCE;
    }

    /* renamed from: X0 */
    public static final Unit m9368X0() {
        return Unit.INSTANCE;
    }

    /* renamed from: Y */
    public static final void m9369Y(Modifier modifier, final AbstractC6896a askForHelp, final Function1 onClickAskForHelp, final AbstractC6899d isInMistake, final Function0 onClickMistake, final AbstractC9778i abstractC9778i, final Function0 onClickToAsk, final boolean z9, final String preQuestionString, final Function0 onClickPre, final String nextQuestionString, Function0 onClickNext, final boolean z10, final Function0 onClickConfirmButton, Composer composer, final int i10, final int i11, final int i12) {
        int i13;
        int i14;
        final Function0 function0;
        final Function0 function02;
        Composer composer2;
        Modifier modifier2;
        Intrinsics.checkNotNullParameter(askForHelp, "askForHelp");
        Intrinsics.checkNotNullParameter(onClickAskForHelp, "onClickAskForHelp");
        Intrinsics.checkNotNullParameter(isInMistake, "isInMistake");
        Intrinsics.checkNotNullParameter(onClickMistake, "onClickMistake");
        Intrinsics.checkNotNullParameter(onClickToAsk, "onClickToAsk");
        Intrinsics.checkNotNullParameter(preQuestionString, "preQuestionString");
        Intrinsics.checkNotNullParameter(onClickPre, "onClickPre");
        Intrinsics.checkNotNullParameter(nextQuestionString, "nextQuestionString");
        Intrinsics.checkNotNullParameter(onClickNext, "onClickNext");
        Intrinsics.checkNotNullParameter(onClickConfirmButton, "onClickConfirmButton");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1612868479);
        int i15 = i12 & 1;
        if (i15 != 0) {
            i13 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i13 = i10 | (composerStartRestartGroup.changed(modifier) ? 4 : 2);
        } else {
            i13 = i10;
        }
        if ((i10 & 48) == 0) {
            i13 |= composerStartRestartGroup.changed(askForHelp) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i13 |= composerStartRestartGroup.changedInstance(onClickAskForHelp) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i13 |= composerStartRestartGroup.changed(isInMistake) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i13 |= composerStartRestartGroup.changedInstance(onClickMistake) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i13 |= composerStartRestartGroup.changed(abstractC9778i) ? 131072 : 65536;
        }
        if ((1572864 & i10) == 0) {
            i13 |= composerStartRestartGroup.changedInstance(onClickToAsk) ? 1048576 : 524288;
        }
        if ((12582912 & i10) == 0) {
            i13 |= composerStartRestartGroup.changed(z9) ? 8388608 : 4194304;
        }
        if ((100663296 & i10) == 0) {
            i13 |= composerStartRestartGroup.changed(preQuestionString) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        if ((805306368 & i10) == 0) {
            i13 |= composerStartRestartGroup.changedInstance(onClickPre) ? 536870912 : 268435456;
        }
        int i16 = i13;
        if ((i11 & 6) == 0) {
            i14 = i11 | (composerStartRestartGroup.changed(nextQuestionString) ? 4 : 2);
        } else {
            i14 = i11;
        }
        if ((i11 & 48) == 0) {
            i14 |= composerStartRestartGroup.changedInstance(onClickNext) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i14 |= composerStartRestartGroup.changed(z10) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            function0 = onClickConfirmButton;
            i14 |= composerStartRestartGroup.changedInstance(function0) ? 2048 : 1024;
        } else {
            function0 = onClickConfirmButton;
        }
        int i17 = i14;
        if (composerStartRestartGroup.shouldExecute(((i16 & 306783379) == 306783378 && (i17 & 1171) == 1170) ? false : true, i16 & 1)) {
            Modifier modifier3 = i15 != 0 ? Modifier.INSTANCE : modifier;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1612868479, i16, i17, "com.zykj.evaluation.ui.detail.DetailButtonView (TaskDetailPage.kt:661)");
            }
            Color.Companion companion = Color.INSTANCE;
            Modifier modifierM17190backgroundbw27NRU$default = BackgroundKt.m17190backgroundbw27NRU$default(modifier3, companion.m21013getWhite0d7_KjU(), null, 2, null);
            float f10 = 600;
            DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
            modifier2 = modifier3;
            DisplayMetrics displayMetrics2 = Resources.getSystem().getDisplayMetrics();
            Modifier modifierM17685paddingqDBjuR0$default = PaddingKt.m17685paddingqDBjuR0$default(modifierM17190backgroundbw27NRU$default, C3127Dp.m23561constructorimpl((RangesKt.coerceAtLeast(displayMetrics.widthPixels, displayMetrics.heightPixels) / Resources.getSystem().getDisplayMetrics().density) * (6 / f10)), 0.0f, C3127Dp.m23561constructorimpl((RangesKt.coerceAtLeast(displayMetrics2.widthPixels, displayMetrics2.heightPixels) / Resources.getSystem().getDisplayMetrics().density) * (9 / f10)), 0.0f, 10, null);
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM17685paddingqDBjuR0$default);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM20418constructorimpl = Updater.m20418constructorimpl(composerStartRestartGroup);
            Updater.m20425setimpl(composerM20418constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m20425setimpl(composerM20418constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (composerM20418constructorimpl.getInserting() || !Intrinsics.areEqual(composerM20418constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM20418constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM20418constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m20425setimpl(composerM20418constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Modifier.Companion companion4 = Modifier.INSTANCE;
            Modifier modifierAlign = boxScopeInstance.align(companion4, companion2.getCenterStart());
            Alignment.Vertical centerVertically = companion2.getCenterVertically();
            Arrangement arrangement = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), centerVertically, composerStartRestartGroup, 48);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierAlign);
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM20418constructorimpl2 = Updater.m20418constructorimpl(composerStartRestartGroup);
            Updater.m20425setimpl(composerM20418constructorimpl2, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m20425setimpl(composerM20418constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
            if (composerM20418constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM20418constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM20418constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM20418constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m20425setimpl(composerM20418constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            DisplayMetrics displayMetrics3 = Resources.getSystem().getDisplayMetrics();
            Modifier modifierM17733width3ABfNKs = SizeKt.m17733width3ABfNKs(companion4, C3127Dp.m23561constructorimpl((28 / f10) * (RangesKt.coerceAtLeast(displayMetrics3.widthPixels, displayMetrics3.heightPixels) / Resources.getSystem().getDisplayMetrics().density)));
            float f11 = 11 / f10;
            DisplayMetrics displayMetrics4 = Resources.getSystem().getDisplayMetrics();
            float fM23561constructorimpl = C3127Dp.m23561constructorimpl((RangesKt.coerceAtLeast(displayMetrics4.widthPixels, displayMetrics4.heightPixels) / Resources.getSystem().getDisplayMetrics().density) * f11);
            DisplayMetrics displayMetrics5 = Resources.getSystem().getDisplayMetrics();
            Modifier modifierM17730sizeVpY3zN4 = SizeKt.m17730sizeVpY3zN4(companion4, fM23561constructorimpl, C3127Dp.m23561constructorimpl(f11 * (RangesKt.coerceAtLeast(displayMetrics5.widthPixels, displayMetrics5.heightPixels) / Resources.getSystem().getDisplayMetrics().density)));
            boolean z11 = ((i16 & 896) == 256) | ((i16 & 112) == 32);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z11 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: w5.l0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return TaskDetailPageKt.m9378c0(onClickAskForHelp, askForHelp);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            Modifier modifierM12480g = AbstractC7593i.m12480g(modifierM17733width3ABfNKs, false, (Function0) objRememberedValue, 1, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion2.getCenterHorizontally(), composerStartRestartGroup, 48);
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM12480g);
            Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor3);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM20418constructorimpl3 = Updater.m20418constructorimpl(composerStartRestartGroup);
            Updater.m20425setimpl(composerM20418constructorimpl3, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m20425setimpl(composerM20418constructorimpl3, currentCompositionLocalMap3, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion3.getSetCompositeKeyHash();
            if (composerM20418constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM20418constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                composerM20418constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                composerM20418constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
            }
            Updater.m20425setimpl(composerM20418constructorimpl3, modifierMaterializeModifier3, companion3.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            ImageKt.Image(PainterResources_androidKt.painterResource(askForHelp.m9425a(), composerStartRestartGroup, 0), (String) null, modifierM17730sizeVpY3zN4, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 432, 120);
            composer2 = composerStartRestartGroup;
            TextKt.m19430Text4IGK_g(StringResources_androidKt.stringResource(askForHelp.m9426b(), composer2, 0), (Modifier) null, AbstractC7305a.m11577a(), AbstractC8709e.m14344k(6), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 3456, 3072, 122866);
            composer2.endNode();
            float f12 = 3 / f10;
            DisplayMetrics displayMetrics6 = Resources.getSystem().getDisplayMetrics();
            SpacerKt.Spacer(SizeKt.m17733width3ABfNKs(companion4, C3127Dp.m23561constructorimpl((RangesKt.coerceAtLeast(displayMetrics6.widthPixels, displayMetrics6.heightPixels) / Resources.getSystem().getDisplayMetrics().density) * f12)), composer2, 6);
            Modifier modifierM12480g2 = AbstractC7593i.m12480g(modifierM17733width3ABfNKs, false, onClickMistake, 1, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion2.getCenterHorizontally(), composer2, 48);
            int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap4 = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composer2, modifierM12480g2);
            Function0<ComposeUiNode> constructor4 = companion3.getConstructor();
            if (composer2.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor4);
            } else {
                composer2.useNode();
            }
            Composer composerM20418constructorimpl4 = Updater.m20418constructorimpl(composer2);
            Updater.m20425setimpl(composerM20418constructorimpl4, measurePolicyColumnMeasurePolicy2, companion3.getSetMeasurePolicy());
            Updater.m20425setimpl(composerM20418constructorimpl4, currentCompositionLocalMap4, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = companion3.getSetCompositeKeyHash();
            if (composerM20418constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM20418constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                composerM20418constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                composerM20418constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
            }
            Updater.m20425setimpl(composerM20418constructorimpl4, modifierMaterializeModifier4, companion3.getSetModifier());
            ImageKt.Image(PainterResources_androidKt.painterResource(isInMistake.m9468a(), composer2, 0), (String) null, modifierM17730sizeVpY3zN4, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, 432, 120);
            TextKt.m19430Text4IGK_g(StringResources_androidKt.stringResource(isInMistake.m9469b(), composer2, 0), (Modifier) null, AbstractC7305a.m11577a(), AbstractC8709e.m14344k(6), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 3456, 3072, 122866);
            composer2.endNode();
            if (abstractC9778i != null) {
                composer2.startReplaceGroup(1470362594);
                DisplayMetrics displayMetrics7 = Resources.getSystem().getDisplayMetrics();
                SpacerKt.Spacer(SizeKt.m17733width3ABfNKs(companion4, C3127Dp.m23561constructorimpl(f12 * (RangesKt.coerceAtLeast(displayMetrics7.widthPixels, displayMetrics7.heightPixels) / Resources.getSystem().getDisplayMetrics().density))), composer2, 6);
                Modifier modifierM12480g3 = AbstractC7593i.m12480g(modifierM17733width3ABfNKs, false, onClickToAsk, 1, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion2.getCenterHorizontally(), composer2, 48);
                int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap5 = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier(composer2, modifierM12480g3);
                Function0<ComposeUiNode> constructor5 = companion3.getConstructor();
                if (composer2.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor5);
                } else {
                    composer2.useNode();
                }
                Composer composerM20418constructorimpl5 = Updater.m20418constructorimpl(composer2);
                Updater.m20425setimpl(composerM20418constructorimpl5, measurePolicyColumnMeasurePolicy3, companion3.getSetMeasurePolicy());
                Updater.m20425setimpl(composerM20418constructorimpl5, currentCompositionLocalMap5, companion3.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5 = companion3.getSetCompositeKeyHash();
                if (composerM20418constructorimpl5.getInserting() || !Intrinsics.areEqual(composerM20418constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                    composerM20418constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                    composerM20418constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
                }
                Updater.m20425setimpl(composerM20418constructorimpl5, modifierMaterializeModifier5, companion3.getSetModifier());
                ImageKt.Image(PainterResources_androidKt.painterResource(abstractC9778i.m16397a(), composer2, 0), (String) null, modifierM17730sizeVpY3zN4, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, 432, 120);
                TextKt.m19430Text4IGK_g(StringResources_androidKt.stringResource(abstractC9778i.m16398b(), composer2, 0), (Modifier) null, AbstractC7305a.m11577a(), AbstractC8709e.m14344k(6), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 3456, 3072, 122866);
                composer2.endNode();
            } else {
                composer2.startReplaceGroup(1441693515);
            }
            composer2.endReplaceGroup();
            composer2.endNode();
            if (z10) {
                composer2.startReplaceGroup(-1241356537);
                DisplayMetrics displayMetrics8 = Resources.getSystem().getDisplayMetrics();
                float fM23561constructorimpl2 = C3127Dp.m23561constructorimpl((56 / f10) * (RangesKt.coerceAtLeast(displayMetrics8.widthPixels, displayMetrics8.heightPixels) / Resources.getSystem().getDisplayMetrics().density));
                DisplayMetrics displayMetrics9 = Resources.getSystem().getDisplayMetrics();
                Modifier modifierAlign2 = boxScopeInstance.align(SizeKt.m17730sizeVpY3zN4(companion4, fM23561constructorimpl2, C3127Dp.m23561constructorimpl((19 / f10) * (RangesKt.coerceAtLeast(displayMetrics9.widthPixels, displayMetrics9.heightPixels) / Resources.getSystem().getDisplayMetrics().density))), companion2.getCenterEnd());
                float fM23561constructorimpl3 = C3127Dp.m23561constructorimpl(1);
                long jM11585i = AbstractC7305a.m11585i();
                float f13 = 2 / f10;
                DisplayMetrics displayMetrics10 = Resources.getSystem().getDisplayMetrics();
                Modifier modifierM17201borderxT4_qwU = BorderKt.m17201borderxT4_qwU(modifierAlign2, fM23561constructorimpl3, jM11585i, RoundedCornerShapeKt.m17974RoundedCornerShape0680j_4(C3127Dp.m23561constructorimpl((RangesKt.coerceAtLeast(displayMetrics10.widthPixels, displayMetrics10.heightPixels) / Resources.getSystem().getDisplayMetrics().density) * f13)));
                long jM11585i2 = AbstractC7305a.m11585i();
                DisplayMetrics displayMetrics11 = Resources.getSystem().getDisplayMetrics();
                Modifier modifierM17189backgroundbw27NRU = BackgroundKt.m17189backgroundbw27NRU(modifierM17201borderxT4_qwU, jM11585i2, RoundedCornerShapeKt.m17974RoundedCornerShape0680j_4(C3127Dp.m23561constructorimpl(f13 * (RangesKt.coerceAtLeast(displayMetrics11.widthPixels, displayMetrics11.heightPixels) / Resources.getSystem().getDisplayMetrics().density))));
                boolean z12 = (i17 & 7168) == 2048;
                Object objRememberedValue2 = composer2.rememberedValue();
                if (z12 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function0() { // from class: w5.m0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return TaskDetailPageKt.m9371Z(function0);
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue2);
                }
                Modifier modifierM12480g4 = AbstractC7593i.m12480g(modifierM17189backgroundbw27NRU, false, (Function0) objRememberedValue2, 1, null);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
                int currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap6 = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier6 = ComposedModifierKt.materializeModifier(composer2, modifierM12480g4);
                Function0<ComposeUiNode> constructor6 = companion3.getConstructor();
                if (composer2.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor6);
                } else {
                    composer2.useNode();
                }
                Composer composerM20418constructorimpl6 = Updater.m20418constructorimpl(composer2);
                Updater.m20425setimpl(composerM20418constructorimpl6, measurePolicyMaybeCachedBoxMeasurePolicy2, companion3.getSetMeasurePolicy());
                Updater.m20425setimpl(composerM20418constructorimpl6, currentCompositionLocalMap6, companion3.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash6 = companion3.getSetCompositeKeyHash();
                if (composerM20418constructorimpl6.getInserting() || !Intrinsics.areEqual(composerM20418constructorimpl6.rememberedValue(), Integer.valueOf(currentCompositeKeyHash6))) {
                    composerM20418constructorimpl6.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash6));
                    composerM20418constructorimpl6.apply(Integer.valueOf(currentCompositeKeyHash6), setCompositeKeyHash6);
                }
                Updater.m20425setimpl(composerM20418constructorimpl6, modifierMaterializeModifier6, companion3.getSetModifier());
                TextKt.m19430Text4IGK_g(StringResources_androidKt.stringResource(R.string.confirm_to_commit, composer2, 6), boxScopeInstance.align(companion4, companion2.getCenter()), companion.m21013getWhite0d7_KjU(), AbstractC8709e.m14344k(8), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 3456, 0, 131056);
                composer2.endNode();
            } else {
                composer2.startReplaceGroup(-1270811993);
            }
            composer2.endReplaceGroup();
            if (z9) {
                composer2.startReplaceGroup(-1240380595);
                boolean zAreEqual = Intrinsics.areEqual(preQuestionString, "第一题");
                long jM11582f = zAreEqual ? AbstractC7305a.m11582f() : AbstractC7305a.m11585i();
                long jM11582f2 = zAreEqual ? AbstractC7305a.m11582f() : AbstractC7305a.m11585i();
                DisplayMetrics displayMetrics12 = Resources.getSystem().getDisplayMetrics();
                float fM23561constructorimpl4 = C3127Dp.m23561constructorimpl((112 / f10) * (RangesKt.coerceAtLeast(displayMetrics12.widthPixels, displayMetrics12.heightPixels) / Resources.getSystem().getDisplayMetrics().density));
                DisplayMetrics displayMetrics13 = Resources.getSystem().getDisplayMetrics();
                Modifier modifierAlign3 = boxScopeInstance.align(SizeKt.m17730sizeVpY3zN4(companion4, fM23561constructorimpl4, C3127Dp.m23561constructorimpl((19 / f10) * (RangesKt.coerceAtLeast(displayMetrics13.widthPixels, displayMetrics13.heightPixels) / Resources.getSystem().getDisplayMetrics().density))), companion2.getCenterEnd());
                MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement.getStart(), companion2.getTop(), composer2, 0);
                int currentCompositeKeyHash7 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap7 = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier7 = ComposedModifierKt.materializeModifier(composer2, modifierAlign3);
                Function0<ComposeUiNode> constructor7 = companion3.getConstructor();
                if (composer2.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor7);
                } else {
                    composer2.useNode();
                }
                Composer composerM20418constructorimpl7 = Updater.m20418constructorimpl(composer2);
                Updater.m20425setimpl(composerM20418constructorimpl7, measurePolicyRowMeasurePolicy2, companion3.getSetMeasurePolicy());
                Updater.m20425setimpl(composerM20418constructorimpl7, currentCompositionLocalMap7, companion3.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash7 = companion3.getSetCompositeKeyHash();
                if (composerM20418constructorimpl7.getInserting() || !Intrinsics.areEqual(composerM20418constructorimpl7.rememberedValue(), Integer.valueOf(currentCompositeKeyHash7))) {
                    composerM20418constructorimpl7.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash7));
                    composerM20418constructorimpl7.apply(Integer.valueOf(currentCompositeKeyHash7), setCompositeKeyHash7);
                }
                Updater.m20425setimpl(composerM20418constructorimpl7, modifierMaterializeModifier7, companion3.getSetModifier());
                float f14 = 1;
                float fM23561constructorimpl5 = C3127Dp.m23561constructorimpl(f14);
                float f15 = 2 / f10;
                DisplayMetrics displayMetrics14 = Resources.getSystem().getDisplayMetrics();
                float fM23561constructorimpl6 = C3127Dp.m23561constructorimpl((RangesKt.coerceAtLeast(displayMetrics14.widthPixels, displayMetrics14.heightPixels) / Resources.getSystem().getDisplayMetrics().density) * f15);
                DisplayMetrics displayMetrics15 = Resources.getSystem().getDisplayMetrics();
                Modifier modifierM17201borderxT4_qwU2 = BorderKt.m17201borderxT4_qwU(companion4, fM23561constructorimpl5, jM11582f, RoundedCornerShapeKt.m17976RoundedCornerShapea9UjIt4$default(fM23561constructorimpl6, 0.0f, 0.0f, C3127Dp.m23561constructorimpl((RangesKt.coerceAtLeast(displayMetrics15.widthPixels, displayMetrics15.heightPixels) / Resources.getSystem().getDisplayMetrics().density) * f15), 6, null));
                long jM21013getWhite0d7_KjU = companion.m21013getWhite0d7_KjU();
                DisplayMetrics displayMetrics16 = Resources.getSystem().getDisplayMetrics();
                float fM23561constructorimpl7 = C3127Dp.m23561constructorimpl((RangesKt.coerceAtLeast(displayMetrics16.widthPixels, displayMetrics16.heightPixels) / Resources.getSystem().getDisplayMetrics().density) * f15);
                DisplayMetrics displayMetrics17 = Resources.getSystem().getDisplayMetrics();
                Modifier modifierFillMaxHeight$default = SizeKt.fillMaxHeight$default(RowScope.weight$default(rowScopeInstance, BackgroundKt.m17189backgroundbw27NRU(modifierM17201borderxT4_qwU2, jM21013getWhite0d7_KjU, RoundedCornerShapeKt.m17976RoundedCornerShapea9UjIt4$default(fM23561constructorimpl7, 0.0f, 0.0f, C3127Dp.m23561constructorimpl((RangesKt.coerceAtLeast(displayMetrics17.widthPixels, displayMetrics17.heightPixels) / Resources.getSystem().getDisplayMetrics().density) * f15), 6, null)), 1.0f, false, 2, null), 0.0f, 1, null);
                boolean z13 = !zAreEqual;
                boolean z14 = (1879048192 & i16) == 536870912;
                Object objRememberedValue3 = composer2.rememberedValue();
                if (z14 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue3 = new Function0() { // from class: w5.n0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return TaskDetailPageKt.m9374a0(onClickPre);
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue3);
                }
                Modifier modifierM12478e = AbstractC7593i.m12478e(modifierFillMaxHeight$default, z13, (Function0) objRememberedValue3);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
                int currentCompositeKeyHash8 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap8 = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier8 = ComposedModifierKt.materializeModifier(composer2, modifierM12478e);
                Function0<ComposeUiNode> constructor8 = companion3.getConstructor();
                if (composer2.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor8);
                } else {
                    composer2.useNode();
                }
                Composer composerM20418constructorimpl8 = Updater.m20418constructorimpl(composer2);
                Updater.m20425setimpl(composerM20418constructorimpl8, measurePolicyMaybeCachedBoxMeasurePolicy3, companion3.getSetMeasurePolicy());
                Updater.m20425setimpl(composerM20418constructorimpl8, currentCompositionLocalMap8, companion3.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash8 = companion3.getSetCompositeKeyHash();
                if (composerM20418constructorimpl8.getInserting() || !Intrinsics.areEqual(composerM20418constructorimpl8.rememberedValue(), Integer.valueOf(currentCompositeKeyHash8))) {
                    composerM20418constructorimpl8.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash8));
                    composerM20418constructorimpl8.apply(Integer.valueOf(currentCompositeKeyHash8), setCompositeKeyHash8);
                }
                Updater.m20425setimpl(composerM20418constructorimpl8, modifierMaterializeModifier8, companion3.getSetModifier());
                function02 = onClickNext;
                TextKt.m19430Text4IGK_g(preQuestionString, boxScopeInstance.align(companion4, companion2.getCenter()), jM11582f2, AbstractC8709e.m14344k(8), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, ((i16 >> 24) & 14) | 3072, 0, 131056);
                composer2.endNode();
                float fM23561constructorimpl8 = C3127Dp.m23561constructorimpl(f14);
                long jM11585i3 = AbstractC7305a.m11585i();
                DisplayMetrics displayMetrics18 = Resources.getSystem().getDisplayMetrics();
                float fM23561constructorimpl9 = C3127Dp.m23561constructorimpl((RangesKt.coerceAtLeast(displayMetrics18.widthPixels, displayMetrics18.heightPixels) / Resources.getSystem().getDisplayMetrics().density) * f15);
                DisplayMetrics displayMetrics19 = Resources.getSystem().getDisplayMetrics();
                Modifier modifierM17201borderxT4_qwU3 = BorderKt.m17201borderxT4_qwU(companion4, fM23561constructorimpl8, jM11585i3, RoundedCornerShapeKt.m17976RoundedCornerShapea9UjIt4$default(0.0f, fM23561constructorimpl9, C3127Dp.m23561constructorimpl((RangesKt.coerceAtLeast(displayMetrics19.widthPixels, displayMetrics19.heightPixels) / Resources.getSystem().getDisplayMetrics().density) * f15), 0.0f, 9, null));
                long jM11585i4 = AbstractC7305a.m11585i();
                DisplayMetrics displayMetrics20 = Resources.getSystem().getDisplayMetrics();
                float fM23561constructorimpl10 = C3127Dp.m23561constructorimpl((RangesKt.coerceAtLeast(displayMetrics20.widthPixels, displayMetrics20.heightPixels) / Resources.getSystem().getDisplayMetrics().density) * f15);
                DisplayMetrics displayMetrics21 = Resources.getSystem().getDisplayMetrics();
                Modifier modifierFillMaxHeight$default2 = SizeKt.fillMaxHeight$default(RowScope.weight$default(rowScopeInstance, BackgroundKt.m17189backgroundbw27NRU(modifierM17201borderxT4_qwU3, jM11585i4, RoundedCornerShapeKt.m17976RoundedCornerShapea9UjIt4$default(0.0f, fM23561constructorimpl10, C3127Dp.m23561constructorimpl(f15 * (RangesKt.coerceAtLeast(displayMetrics21.widthPixels, displayMetrics21.heightPixels) / Resources.getSystem().getDisplayMetrics().density)), 0.0f, 9, null)), 1.0f, false, 2, null), 0.0f, 1, null);
                boolean z15 = (i17 & 112) == 32;
                Object objRememberedValue4 = composer2.rememberedValue();
                if (z15 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue4 = new Function0() { // from class: w5.o0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return TaskDetailPageKt.m9376b0(function02);
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue4);
                }
                Modifier modifierM12480g5 = AbstractC7593i.m12480g(modifierFillMaxHeight$default2, false, (Function0) objRememberedValue4, 1, null);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy4 = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
                int currentCompositeKeyHash9 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap9 = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier9 = ComposedModifierKt.materializeModifier(composer2, modifierM12480g5);
                Function0<ComposeUiNode> constructor9 = companion3.getConstructor();
                if (composer2.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor9);
                } else {
                    composer2.useNode();
                }
                Composer composerM20418constructorimpl9 = Updater.m20418constructorimpl(composer2);
                Updater.m20425setimpl(composerM20418constructorimpl9, measurePolicyMaybeCachedBoxMeasurePolicy4, companion3.getSetMeasurePolicy());
                Updater.m20425setimpl(composerM20418constructorimpl9, currentCompositionLocalMap9, companion3.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash9 = companion3.getSetCompositeKeyHash();
                if (composerM20418constructorimpl9.getInserting() || !Intrinsics.areEqual(composerM20418constructorimpl9.rememberedValue(), Integer.valueOf(currentCompositeKeyHash9))) {
                    composerM20418constructorimpl9.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash9));
                    composerM20418constructorimpl9.apply(Integer.valueOf(currentCompositeKeyHash9), setCompositeKeyHash9);
                }
                Updater.m20425setimpl(composerM20418constructorimpl9, modifierMaterializeModifier9, companion3.getSetModifier());
                TextKt.m19430Text4IGK_g(nextQuestionString, boxScopeInstance.align(companion4, companion2.getCenter()), companion.m21013getWhite0d7_KjU(), AbstractC8709e.m14344k(8), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, (i17 & 14) | 3456, 0, 131056);
                composer2 = composer2;
                composer2.endNode();
                composer2.endNode();
            } else {
                function02 = onClickNext;
                composer2.startReplaceGroup(-1270811993);
            }
            composer2.endReplaceGroup();
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            function02 = onClickNext;
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
            modifier2 = modifier;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Function0 function03 = function02;
            final Modifier modifier4 = modifier2;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: w5.p0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TaskDetailPageKt.m9380d0(modifier4, askForHelp, onClickAskForHelp, isInMistake, onClickMistake, abstractC9778i, onClickToAsk, z9, preQuestionString, onClickPre, nextQuestionString, function03, z10, onClickConfirmButton, i10, i11, i12, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: Y0 */
    public static final Unit m9370Y0(long j10, DetailBundle detailBundle, NavController navController, BaseDetailViewModel baseDetailViewModel, GuideViewModel guideViewModel, Function4 function4, Function2 function2, Function1 function1, Function2 function22, Function2 function23, Function1 function12, Function1 function13, Function1 function14, int i10, int i11, int i12, Composer composer, int i13) {
        m9398m0(j10, detailBundle, navController, baseDetailViewModel, guideViewModel, function4, function2, function1, function22, function23, function12, function13, function14, composer, RecomposeScopeImplKt.updateChangedFlags(i10 | 1), RecomposeScopeImplKt.updateChangedFlags(i11), i12);
        return Unit.INSTANCE;
    }

    /* renamed from: Z */
    public static final Unit m9371Z(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* renamed from: Z0 */
    public static final Unit m9372Z0(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "<unused var>");
        Intrinsics.checkNotNullParameter(str2, "<unused var>");
        return Unit.INSTANCE;
    }

    /* renamed from: a0 */
    public static final Unit m9374a0(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* renamed from: b0 */
    public static final Unit m9376b0(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* renamed from: c0 */
    public static final Unit m9378c0(Function1 function1, AbstractC6896a abstractC6896a) {
        function1.invoke(Boolean.valueOf(abstractC6896a instanceof AbstractC6896a.a));
        return Unit.INSTANCE;
    }

    /* renamed from: d0 */
    public static final Unit m9380d0(Modifier modifier, AbstractC6896a abstractC6896a, Function1 function1, AbstractC6899d abstractC6899d, Function0 function0, AbstractC9778i abstractC9778i, Function0 function02, boolean z9, String str, Function0 function03, String str2, Function0 function04, boolean z10, Function0 function05, int i10, int i11, int i12, Composer composer, int i13) {
        m9369Y(modifier, abstractC6896a, function1, abstractC6899d, function0, abstractC9778i, function02, z9, str, function03, str2, function04, z10, function05, composer, RecomposeScopeImplKt.updateChangedFlags(i10 | 1), RecomposeScopeImplKt.updateChangedFlags(i11), i12);
        return Unit.INSTANCE;
    }

    /* renamed from: e0 */
    public static final void m9382e0(Modifier modifier, final ScrollState scrollState, final C9767e questionState, final Function3 onClickOpenBoard, final Function2 onClickUpdateAnswer, final Function1 onClickCorrect, Function1 onClickMicroClass, Function2 onClickImage, final Function2 onClickCorrectSelf, final Function2 onClickCompositionSheet, Composer composer, final int i10, final int i11) throws Resources.NotFoundException {
        Modifier modifier2;
        int i12;
        Composer composer2;
        final Function1 function1;
        final Function2 function2;
        final Modifier modifier3;
        Intrinsics.checkNotNullParameter(scrollState, "scrollState");
        Intrinsics.checkNotNullParameter(questionState, "questionState");
        Intrinsics.checkNotNullParameter(onClickOpenBoard, "onClickOpenBoard");
        Intrinsics.checkNotNullParameter(onClickUpdateAnswer, "onClickUpdateAnswer");
        Intrinsics.checkNotNullParameter(onClickCorrect, "onClickCorrect");
        Intrinsics.checkNotNullParameter(onClickMicroClass, "onClickMicroClass");
        Intrinsics.checkNotNullParameter(onClickImage, "onClickImage");
        Intrinsics.checkNotNullParameter(onClickCorrectSelf, "onClickCorrectSelf");
        Intrinsics.checkNotNullParameter(onClickCompositionSheet, "onClickCompositionSheet");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1545585826);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
            modifier2 = modifier;
        } else if ((i10 & 6) == 0) {
            modifier2 = modifier;
            i12 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i10;
        } else {
            modifier2 = modifier;
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            i12 |= composerStartRestartGroup.changed(scrollState) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i12 |= composerStartRestartGroup.changedInstance(questionState) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i12 |= composerStartRestartGroup.changedInstance(onClickOpenBoard) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i12 |= composerStartRestartGroup.changedInstance(onClickUpdateAnswer) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i12 |= composerStartRestartGroup.changedInstance(onClickCorrect) ? 131072 : 65536;
        }
        if ((1572864 & i10) == 0) {
            i12 |= composerStartRestartGroup.changedInstance(onClickMicroClass) ? 1048576 : 524288;
        }
        if ((12582912 & i10) == 0) {
            i12 |= composerStartRestartGroup.changedInstance(onClickImage) ? 8388608 : 4194304;
        }
        if ((100663296 & i10) == 0) {
            i12 |= composerStartRestartGroup.changedInstance(onClickCorrectSelf) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        if ((805306368 & i10) == 0) {
            i12 |= composerStartRestartGroup.changedInstance(onClickCompositionSheet) ? 536870912 : 268435456;
        }
        if (composerStartRestartGroup.shouldExecute((306783379 & i12) != 306783378, i12 & 1)) {
            Modifier modifier4 = i13 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1545585826, i12, -1, "com.zykj.evaluation.ui.detail.DetailContentView (TaskDetailPage.kt:589)");
            }
            int i14 = i12;
            Modifier modifier5 = modifier4;
            DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
            Modifier modifierM17681padding3ABfNKs = PaddingKt.m17681padding3ABfNKs(ScrollKt.verticalScroll$default(BackgroundKt.m17190backgroundbw27NRU$default(modifier4, ColorKt.Color(4294441210L), null, 2, null), scrollState, false, null, false, 14, null), C3127Dp.m23561constructorimpl((9 / 600) * (RangesKt.coerceAtLeast(displayMetrics.widthPixels, displayMetrics.heightPixels) / Resources.getSystem().getDisplayMetrics().density)));
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM17681padding3ABfNKs);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM20418constructorimpl = Updater.m20418constructorimpl(composerStartRestartGroup);
            Updater.m20425setimpl(composerM20418constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m20425setimpl(composerM20418constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (composerM20418constructorimpl.getInserting() || !Intrinsics.areEqual(composerM20418constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM20418constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM20418constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m20425setimpl(composerM20418constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            AbstractC7454g0.m12046f(questionState.m16373j(), composerStartRestartGroup, 0);
            AbstractC7584z0.m12377E(questionState.m16376m(), questionState.m16377n(), questionState.m16367d(), questionState.m16371h(), questionState.m16369f(), questionState.m16368e(), questionState.m16372i(), onClickOpenBoard, onClickUpdateAnswer, onClickCorrect, onClickImage, onClickCorrectSelf, onClickCompositionSheet, onClickMicroClass, composerStartRestartGroup, (i14 << 12) & 2143289344, ((i14 >> 21) & 1022) | ((i14 >> 9) & 7168), 0);
            function2 = onClickImage;
            function1 = onClickMicroClass;
            composer2 = composerStartRestartGroup;
            AbstractC7446c0.m12021l(questionState.m16370g(), function1, composer2, (i14 >> 15) & 112);
            int i15 = (i14 >> 18) & 112;
            AbstractC7482u0.m12114u(questionState.m16375l(), function2, composer2, i15);
            AbstractC7482u0.m12119z(questionState.m16374k(), function2, composer2, i15);
            AbstractC7482u0.m12107n(questionState.m16366c(), function2, composer2, i15);
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier5;
        } else {
            composer2 = composerStartRestartGroup;
            function1 = onClickMicroClass;
            function2 = onClickImage;
            composer2.skipToGroupEnd();
            modifier3 = modifier2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: w5.k0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TaskDetailPageKt.m9384f0(modifier3, scrollState, questionState, onClickOpenBoard, onClickUpdateAnswer, onClickCorrect, function1, function2, onClickCorrectSelf, onClickCompositionSheet, i10, i11, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: f0 */
    public static final Unit m9384f0(Modifier modifier, ScrollState scrollState, C9767e c9767e, Function3 function3, Function2 function2, Function1 function1, Function1 function12, Function2 function22, Function2 function23, Function2 function24, int i10, int i11, Composer composer, int i12) throws Resources.NotFoundException {
        m9382e0(modifier, scrollState, c9767e, function3, function2, function1, function12, function22, function23, function24, composer, RecomposeScopeImplKt.updateChangedFlags(i10 | 1), i11);
        return Unit.INSTANCE;
    }

    /* renamed from: g0 */
    public static final void m9386g0(final String title, final Function0 onClickBack, final AnnotatedString scoreString, final String indexString, Function0 function0, final Function0 function02, Function0 function03, Composer composer, final int i10, final int i11) {
        int i12;
        final Function0 function04;
        Function0 function05;
        Modifier.Companion companion;
        BoxScopeInstance boxScopeInstance;
        Function0 function06;
        Modifier.Companion companion2;
        BoxScopeInstance boxScopeInstance2;
        Modifier.Companion companion3;
        int i13;
        int i14;
        int i15;
        Object obj;
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(onClickBack, "onClickBack");
        Intrinsics.checkNotNullParameter(scoreString, "scoreString");
        Intrinsics.checkNotNullParameter(indexString, "indexString");
        Composer composerStartRestartGroup = composer.startRestartGroup(-795392400);
        if ((i10 & 6) == 0) {
            i12 = (composerStartRestartGroup.changed(title) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            i12 |= composerStartRestartGroup.changedInstance(onClickBack) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i12 |= composerStartRestartGroup.changed(scoreString) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i12 |= composerStartRestartGroup.changed(indexString) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i12 |= composerStartRestartGroup.changedInstance(function0) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i12 |= composerStartRestartGroup.changedInstance(function02) ? 131072 : 65536;
        }
        int i16 = i11 & 64;
        if (i16 != 0) {
            i12 |= 1572864;
        } else if ((i10 & 1572864) == 0) {
            i12 |= composerStartRestartGroup.changedInstance(function03) ? 1048576 : 524288;
        }
        if (composerStartRestartGroup.shouldExecute((i12 & 599187) != 599186, i12 & 1)) {
            Function0 function07 = i16 != 0 ? null : function03;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-795392400, i12, -1, "com.zykj.evaluation.ui.detail.DetailTitleBar (TaskDetailPage.kt:458)");
            }
            Modifier.Companion companion4 = Modifier.INSTANCE;
            Modifier modifierStatusBarsPadding = WindowInsetsPadding_androidKt.statusBarsPadding(BackgroundKt.m17190backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null), Color.INSTANCE.m21013getWhite0d7_KjU(), null, 2, null));
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top2 = arrangement.getTop();
            Alignment.Companion companion5 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top2, companion5.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierStatusBarsPadding);
            ComposeUiNode.Companion companion6 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion6.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM20418constructorimpl = Updater.m20418constructorimpl(composerStartRestartGroup);
            Updater.m20425setimpl(composerM20418constructorimpl, measurePolicyColumnMeasurePolicy, companion6.getSetMeasurePolicy());
            Updater.m20425setimpl(composerM20418constructorimpl, currentCompositionLocalMap, companion6.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion6.getSetCompositeKeyHash();
            if (composerM20418constructorimpl.getInserting() || !Intrinsics.areEqual(composerM20418constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM20418constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM20418constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m20425setimpl(composerM20418constructorimpl, modifierMaterializeModifier, companion6.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            float f10 = 600;
            DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(SizeKt.m17714height3ABfNKs(companion4, C3127Dp.m23561constructorimpl((22 / f10) * (RangesKt.coerceAtLeast(displayMetrics.widthPixels, displayMetrics.heightPixels) / Resources.getSystem().getDisplayMetrics().density))), 0.0f, 1, null);
            DisplayMetrics displayMetrics2 = Resources.getSystem().getDisplayMetrics();
            Modifier modifierM17685paddingqDBjuR0$default = PaddingKt.m17685paddingqDBjuR0$default(modifierFillMaxWidth$default, C3127Dp.m23561constructorimpl((9 / f10) * (RangesKt.coerceAtLeast(displayMetrics2.widthPixels, displayMetrics2.heightPixels) / Resources.getSystem().getDisplayMetrics().density)), 0.0f, 0.0f, 0.0f, 14, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion5.getTopStart(), false);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM17685paddingqDBjuR0$default);
            Function0<ComposeUiNode> constructor2 = companion6.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM20418constructorimpl2 = Updater.m20418constructorimpl(composerStartRestartGroup);
            Updater.m20425setimpl(composerM20418constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, companion6.getSetMeasurePolicy());
            Updater.m20425setimpl(composerM20418constructorimpl2, currentCompositionLocalMap2, companion6.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion6.getSetCompositeKeyHash();
            if (composerM20418constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM20418constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM20418constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM20418constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m20425setimpl(composerM20418constructorimpl2, modifierMaterializeModifier2, companion6.getSetModifier());
            BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
            Modifier modifierAlign = boxScopeInstance3.align(companion4, companion5.getCenterStart());
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), companion5.getTop(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierAlign);
            Function0<ComposeUiNode> constructor3 = companion6.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor3);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM20418constructorimpl3 = Updater.m20418constructorimpl(composerStartRestartGroup);
            Updater.m20425setimpl(composerM20418constructorimpl3, measurePolicyRowMeasurePolicy, companion6.getSetMeasurePolicy());
            Updater.m20425setimpl(composerM20418constructorimpl3, currentCompositionLocalMap3, companion6.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion6.getSetCompositeKeyHash();
            if (composerM20418constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM20418constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                composerM20418constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                composerM20418constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
            }
            Updater.m20425setimpl(composerM20418constructorimpl3, modifierMaterializeModifier3, companion6.getSetModifier());
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion7 = Composer.INSTANCE;
            if (objRememberedValue == companion7.getEmpty()) {
                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            MutableInteractionSource mutableInteractionSource = (MutableInteractionSource) objRememberedValue;
            CustomIndicationFactory customIndicationFactory = CustomIndicationFactory.f10251a;
            boolean z9 = (i12 & 112) == 32;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (z9 || objRememberedValue2 == companion7.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: w5.t0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return TaskDetailPageKt.m9388h0(onClickBack);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            Modifier modifierM12479f = AbstractC7593i.m12479f(companion4, false, mutableInteractionSource, customIndicationFactory, (Function0) objRememberedValue2, 1, null);
            MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement.getStart(), companion5.getTop(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM12479f);
            Function0<ComposeUiNode> constructor4 = companion6.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor4);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM20418constructorimpl4 = Updater.m20418constructorimpl(composerStartRestartGroup);
            Updater.m20425setimpl(composerM20418constructorimpl4, measurePolicyRowMeasurePolicy2, companion6.getSetMeasurePolicy());
            Updater.m20425setimpl(composerM20418constructorimpl4, currentCompositionLocalMap4, companion6.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = companion6.getSetCompositeKeyHash();
            if (composerM20418constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM20418constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                composerM20418constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                composerM20418constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
            }
            Updater.m20425setimpl(composerM20418constructorimpl4, modifierMaterializeModifier4, companion6.getSetModifier());
            Painter painterPainterResource = PainterResources_androidKt.painterResource(R.drawable.icon_back, composerStartRestartGroup, 6);
            DisplayMetrics displayMetrics3 = Resources.getSystem().getDisplayMetrics();
            Function0 function08 = function07;
            int i17 = i12;
            ImageKt.Image(painterPainterResource, (String) null, SizeKt.m17728size3ABfNKs(companion4, C3127Dp.m23561constructorimpl((11 / f10) * (RangesKt.coerceAtLeast(displayMetrics3.widthPixels, displayMetrics3.heightPixels) / Resources.getSystem().getDisplayMetrics().density))), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 432, 120);
            if (title.length() > 0) {
                composerStartRestartGroup.startReplaceGroup(1281278203);
                float f11 = 5 / f10;
                DisplayMetrics displayMetrics4 = Resources.getSystem().getDisplayMetrics();
                SpacerKt.Spacer(SizeKt.m17733width3ABfNKs(companion4, C3127Dp.m23561constructorimpl(f11 * (RangesKt.coerceAtLeast(displayMetrics4.widthPixels, displayMetrics4.heightPixels) / Resources.getSystem().getDisplayMetrics().density))), composerStartRestartGroup, 6);
                companion = companion4;
                boxScopeInstance = boxScopeInstance3;
                function06 = function08;
                TextKt.m19430Text4IGK_g(title, (Modifier) null, AbstractC7305a.m11577a(), AbstractC8709e.m14344k(8), (FontStyle) null, FontWeight.INSTANCE.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.INSTANCE.m23497getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, (i17 & 14) | 200064, 3120, 120786);
                composerStartRestartGroup = composerStartRestartGroup;
            } else {
                companion = companion4;
                boxScopeInstance = boxScopeInstance3;
                function06 = function08;
                composerStartRestartGroup.startReplaceGroup(1260041622);
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.endNode();
            if (scoreString.length() > 0) {
                composerStartRestartGroup.startReplaceGroup(-1167723957);
                DisplayMetrics displayMetrics5 = Resources.getSystem().getDisplayMetrics();
                SpacerKt.Spacer(SizeKt.m17733width3ABfNKs(companion, C3127Dp.m23561constructorimpl((5 / f10) * (RangesKt.coerceAtLeast(displayMetrics5.widthPixels, displayMetrics5.heightPixels) / Resources.getSystem().getDisplayMetrics().density))), composerStartRestartGroup, 6);
                Composer composer2 = composerStartRestartGroup;
                companion2 = companion;
                TextKt.m19431TextIbK3jfQ(scoreString, null, ColorKt.Color(4284704102L), AbstractC8709e.m14344k(8), null, null, null, 0L, null, null, 0L, TextOverflow.INSTANCE.m23497getEllipsisgIe3tQ8(), false, 1, 0, null, null, null, composer2, ((i17 >> 6) & 14) | 3456, 3120, 251890);
                composerStartRestartGroup = composer2;
            } else {
                companion2 = companion;
                composerStartRestartGroup.startReplaceGroup(-1189462862);
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.endNode();
            if (indexString.length() > 0) {
                composerStartRestartGroup.startReplaceGroup(-2042327974);
                BoxScopeInstance boxScopeInstance4 = boxScopeInstance;
                Modifier.Companion companion8 = companion2;
                Composer composer3 = composerStartRestartGroup;
                companion3 = companion8;
                boxScopeInstance2 = boxScopeInstance4;
                TextKt.m19430Text4IGK_g(indexString, boxScopeInstance4.align(companion8, companion5.getCenter()), ColorKt.Color(4284704102L), AbstractC8709e.m14344k(8), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer3, ((i17 >> 9) & 14) | 3456, 0, 131056);
                composerStartRestartGroup = composer3;
            } else {
                boxScopeInstance2 = boxScopeInstance;
                companion3 = companion2;
                composerStartRestartGroup.startReplaceGroup(-2064476978);
            }
            composerStartRestartGroup.endReplaceGroup();
            Modifier.Companion companion9 = companion3;
            Modifier modifierAlign2 = boxScopeInstance2.align(companion9, companion5.getCenterEnd());
            DisplayMetrics displayMetrics6 = Resources.getSystem().getDisplayMetrics();
            Modifier modifierM17685paddingqDBjuR0$default2 = PaddingKt.m17685paddingqDBjuR0$default(modifierAlign2, 0.0f, 0.0f, C3127Dp.m23561constructorimpl((5 / f10) * (RangesKt.coerceAtLeast(displayMetrics6.widthPixels, displayMetrics6.heightPixels) / Resources.getSystem().getDisplayMetrics().density)), 0.0f, 11, null);
            MeasurePolicy measurePolicyRowMeasurePolicy3 = RowKt.rowMeasurePolicy(arrangement.getStart(), companion5.getTop(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap5 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM17685paddingqDBjuR0$default2);
            Function0<ComposeUiNode> constructor5 = companion6.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor5);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM20418constructorimpl5 = Updater.m20418constructorimpl(composerStartRestartGroup);
            Updater.m20425setimpl(composerM20418constructorimpl5, measurePolicyRowMeasurePolicy3, companion6.getSetMeasurePolicy());
            Updater.m20425setimpl(composerM20418constructorimpl5, currentCompositionLocalMap5, companion6.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5 = companion6.getSetCompositeKeyHash();
            if (composerM20418constructorimpl5.getInserting() || !Intrinsics.areEqual(composerM20418constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                composerM20418constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                composerM20418constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
            }
            Updater.m20425setimpl(composerM20418constructorimpl5, modifierMaterializeModifier5, companion6.getSetModifier());
            function04 = function0;
            if (function04 != null) {
                composerStartRestartGroup.startReplaceGroup(-304978971);
                i13 = 2;
                DisplayMetrics displayMetrics7 = Resources.getSystem().getDisplayMetrics();
                float fM23561constructorimpl = C3127Dp.m23561constructorimpl((2 / f10) * (RangesKt.coerceAtLeast(displayMetrics7.widthPixels, displayMetrics7.heightPixels) / Resources.getSystem().getDisplayMetrics().density));
                i15 = 4;
                Modifier modifierM17682paddingVpY3zN4 = PaddingKt.m17682paddingVpY3zN4(companion9, C3127Dp.m23561constructorimpl(4), fM23561constructorimpl);
                boolean z10 = (i17 & 57344) == 16384;
                Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (z10 || objRememberedValue3 == companion7.getEmpty()) {
                    objRememberedValue3 = new Function0() { // from class: w5.u0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return TaskDetailPageKt.m9390i0(function04);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                obj = null;
                Composer composer4 = composerStartRestartGroup;
                i14 = 1;
                TextKt.m19430Text4IGK_g("大题说明", AbstractC7593i.m12480g(modifierM17682paddingVpY3zN4, false, (Function0) objRememberedValue3, 1, null), AbstractC7305a.m11585i(), AbstractC8709e.m14344k(8), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer4, 3462, 0, 131056);
                composerStartRestartGroup = composer4;
            } else {
                i13 = 2;
                i14 = 1;
                i15 = 4;
                obj = null;
                composerStartRestartGroup.startReplaceGroup(-327590743);
            }
            composerStartRestartGroup.endReplaceGroup();
            if (function02 != null) {
                composerStartRestartGroup.startReplaceGroup(-304477143);
                int i18 = (i17 & 458752) == 131072 ? i14 : 0;
                Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (i18 != 0 || objRememberedValue4 == companion7.getEmpty()) {
                    objRememberedValue4 = new Function0() { // from class: w5.v0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return TaskDetailPageKt.m9392j0(function02);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                Modifier modifierM12480g = AbstractC7593i.m12480g(companion9, false, (Function0) objRememberedValue4, i14, obj);
                DisplayMetrics displayMetrics8 = Resources.getSystem().getDisplayMetrics();
                Composer composer5 = composerStartRestartGroup;
                TextKt.m19430Text4IGK_g("试卷说明", PaddingKt.m17682paddingVpY3zN4(modifierM12480g, C3127Dp.m23561constructorimpl(i15), C3127Dp.m23561constructorimpl((i13 / f10) * (RangesKt.coerceAtLeast(displayMetrics8.widthPixels, displayMetrics8.heightPixels) / Resources.getSystem().getDisplayMetrics().density))), AbstractC7305a.m11585i(), AbstractC8709e.m14344k(8), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer5, 3462, 0, 131056);
                composerStartRestartGroup = composer5;
            } else {
                composerStartRestartGroup.startReplaceGroup(-327590743);
            }
            composerStartRestartGroup.endReplaceGroup();
            final Function0 function09 = function06;
            if (function09 != null) {
                composerStartRestartGroup.startReplaceGroup(-303986320);
                float f12 = i13 / f10;
                DisplayMetrics displayMetrics9 = Resources.getSystem().getDisplayMetrics();
                Modifier modifierM17682paddingVpY3zN42 = PaddingKt.m17682paddingVpY3zN4(companion9, C3127Dp.m23561constructorimpl(i15), C3127Dp.m23561constructorimpl(f12 * (RangesKt.coerceAtLeast(displayMetrics9.widthPixels, displayMetrics9.heightPixels) / Resources.getSystem().getDisplayMetrics().density)));
                int i19 = (i17 & 3670016) == 1048576 ? i14 : 0;
                Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (i19 != 0 || objRememberedValue5 == companion7.getEmpty()) {
                    objRememberedValue5 = new Function0() { // from class: w5.w0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return TaskDetailPageKt.m9394k0(function09);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                }
                Composer composer6 = composerStartRestartGroup;
                function05 = function09;
                TextKt.m19430Text4IGK_g("交卷进度", AbstractC7593i.m12480g(modifierM17682paddingVpY3zN42, false, (Function0) objRememberedValue5, i14, obj), AbstractC7305a.m11585i(), AbstractC8709e.m14344k(8), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer6, 3462, 0, 131056);
                composerStartRestartGroup = composer6;
            } else {
                function05 = function09;
                composerStartRestartGroup.startReplaceGroup(-327590743);
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endNode();
            DividerKt.m18808Divider9IZ8Weo(null, 0.0f, ColorKt.Color(4293256677L), composerStartRestartGroup, 384, 3);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            function04 = function0;
            composerStartRestartGroup.skipToGroupEnd();
            function05 = function03;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Function0 function010 = function04;
            final Function0 function011 = function05;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: w5.x0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return TaskDetailPageKt.m9396l0(title, onClickBack, scoreString, indexString, function010, function02, function011, i10, i11, (Composer) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    /* renamed from: h0 */
    public static final Unit m9388h0(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* renamed from: i0 */
    public static final Unit m9390i0(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* renamed from: j0 */
    public static final Unit m9392j0(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* renamed from: k0 */
    public static final Unit m9394k0(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* renamed from: l0 */
    public static final Unit m9396l0(String str, Function0 function0, AnnotatedString annotatedString, String str2, Function0 function02, Function0 function03, Function0 function04, int i10, int i11, Composer composer, int i12) {
        m9386g0(str, function0, annotatedString, str2, function02, function03, function04, composer, RecomposeScopeImplKt.updateChangedFlags(i10 | 1), i11);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0422  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x043b  */
    /* JADX WARN: Removed duplicated region for block: B:233:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0127  */
    /* renamed from: m0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m9398m0(final long r32, final com.zykj.evaluation.bean.bundle.DetailBundle r34, final androidx.navigation.NavController r35, final com.zykj.evaluation.p057ui.detail.BaseDetailViewModel r36, final com.zykj.evaluation.p057ui.guide.normal.GuideViewModel r37, kotlin.jvm.functions.Function4 r38, kotlin.jvm.functions.Function2 r39, kotlin.jvm.functions.Function1 r40, kotlin.jvm.functions.Function2 r41, kotlin.jvm.functions.Function2 r42, kotlin.jvm.functions.Function1 r43, kotlin.jvm.functions.Function1 r44, kotlin.jvm.functions.Function1 r45, androidx.compose.runtime.Composer r46, final int r47, final int r48, final int r49) {
        /*
            Method dump skipped, instructions count: 1113
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.evaluation.p057ui.detail.TaskDetailPageKt.m9398m0(long, com.zykj.evaluation.bean.bundle.DetailBundle, androidx.navigation.NavController, com.zykj.evaluation.ui.detail.BaseDetailViewModel, com.zykj.evaluation.ui.guide.normal.GuideViewModel, kotlin.jvm.functions.Function4, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int, int):void"); // DEX body: android/新测评/smali_classes4/com/zykj/evaluation/ui/detail/TaskDetailPageKt.smali:11191
    }

    /* renamed from: n0 */
    public static final Unit m9400n0(String str, String str2, boolean z9, String str3) {
        Intrinsics.checkNotNullParameter(str, "<unused var>");
        Intrinsics.checkNotNullParameter(str2, "<unused var>");
        Intrinsics.checkNotNullParameter(str3, "<unused var>");
        return Unit.INSTANCE;
    }

    /* renamed from: o0 */
    public static final Unit m9402o0(List it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* renamed from: p0 */
    public static final Unit m9404p0(Function0 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* renamed from: q0 */
    public static final Unit m9406q0(boolean z9) {
        return Unit.INSTANCE;
    }

    /* renamed from: r0 */
    public static final DisposableEffectResult m9408r0(final NavController navController, final BaseDetailViewModel baseDetailViewModel, final C7459j c7459j, DisposableEffectScope DisposableEffect) {
        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        NavBackStackEntry currentBackStackEntry = navController.getCurrentBackStackEntry();
        final SavedStateHandle savedStateHandle = currentBackStackEntry != null ? currentBackStackEntry.getSavedStateHandle() : null;
        final Observer observer = new Observer() { // from class: w5.e0
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                TaskDetailPageKt.m9410s0(baseDetailViewModel, savedStateHandle, (String) obj);
            }
        };
        final Observer observer2 = new Observer() { // from class: w5.g0
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                TaskDetailPageKt.m9412t0(baseDetailViewModel, savedStateHandle, (String) obj);
            }
        };
        final Observer observer3 = new Observer() { // from class: w5.h0
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                TaskDetailPageKt.m9414u0(baseDetailViewModel, c7459j, savedStateHandle, navController, (String) obj);
            }
        };
        final Observer observer4 = new Observer() { // from class: w5.i0
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                TaskDetailPageKt.m9418w0(baseDetailViewModel, (Boolean) obj);
            }
        };
        final MutableLiveData liveData = savedStateHandle != null ? savedStateHandle.getLiveData("NEED_NOT_REFRESH") : null;
        if (liveData != null) {
            NavBackStackEntry currentBackStackEntry2 = navController.getCurrentBackStackEntry();
            Intrinsics.checkNotNull(currentBackStackEntry2);
            liveData.observe(currentBackStackEntry2, observer4);
        }
        final MutableLiveData liveData2 = savedStateHandle != null ? savedStateHandle.getLiveData("MISTAKE_RESULT_CREATE_MISTAKE") : null;
        final MutableLiveData liveData3 = savedStateHandle != null ? savedStateHandle.getLiveData("REMOVE_MISTAKE_RESULT_REMOVE_MISTAKE") : null;
        final MutableLiveData liveData4 = savedStateHandle != null ? savedStateHandle.getLiveData("SUBMIT_RESULT") : null;
        if (liveData2 != null) {
            NavBackStackEntry currentBackStackEntry3 = navController.getCurrentBackStackEntry();
            Intrinsics.checkNotNull(currentBackStackEntry3);
            liveData2.observe(currentBackStackEntry3, observer);
        }
        if (liveData3 != null) {
            NavBackStackEntry currentBackStackEntry4 = navController.getCurrentBackStackEntry();
            Intrinsics.checkNotNull(currentBackStackEntry4);
            liveData3.observe(currentBackStackEntry4, observer2);
        }
        if (liveData4 != null) {
            NavBackStackEntry currentBackStackEntry5 = navController.getCurrentBackStackEntry();
            Intrinsics.checkNotNull(currentBackStackEntry5);
            liveData4.observe(currentBackStackEntry5, observer3);
        }
        return new DisposableEffectResult() { // from class: com.zykj.evaluation.ui.detail.TaskDetailPageKt$TaskDetailPage$lambda$25$lambda$24$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                MutableLiveData mutableLiveData = liveData2;
                if (mutableLiveData != null) {
                    mutableLiveData.removeObserver(observer);
                }
                MutableLiveData mutableLiveData2 = liveData3;
                if (mutableLiveData2 != null) {
                    mutableLiveData2.removeObserver(observer2);
                }
                MutableLiveData mutableLiveData3 = liveData4;
                if (mutableLiveData3 != null) {
                    mutableLiveData3.removeObserver(observer3);
                }
                MutableLiveData mutableLiveData4 = liveData;
                if (mutableLiveData4 != null) {
                    mutableLiveData4.removeObserver(observer4);
                }
            }
        };
    }

    /* renamed from: s0 */
    public static final void m9410s0(BaseDetailViewModel baseDetailViewModel, SavedStateHandle savedStateHandle, String str) {
        if (str != null) {
            baseDetailViewModel.m9296o();
            baseDetailViewModel.m9283b0();
            if (savedStateHandle != null) {
                savedStateHandle.set("MISTAKE_RESULT_CREATE_MISTAKE", null);
            }
        }
    }

    /* renamed from: t0 */
    public static final void m9412t0(BaseDetailViewModel baseDetailViewModel, SavedStateHandle savedStateHandle, String str) {
        if (str != null) {
            baseDetailViewModel.m9285d0();
            if (savedStateHandle != null) {
                savedStateHandle.set("REMOVE_MISTAKE_RESULT_REMOVE_MISTAKE", null);
            }
        }
    }

    /* renamed from: u0 */
    public static final void m9414u0(BaseDetailViewModel baseDetailViewModel, C7459j c7459j, SavedStateHandle savedStateHandle, final NavController navController, String str) {
        if (str != null) {
            baseDetailViewModel.mo9308u(c7459j, new Function0() { // from class: w5.y0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return TaskDetailPageKt.m9416v0(navController);
                }
            });
            if (savedStateHandle != null) {
                savedStateHandle.set("SUBMIT_RESULT", null);
            }
        }
    }

    /* renamed from: v0 */
    public static final Unit m9416v0(NavController navController) {
        navController.navigateUp();
        return Unit.INSTANCE;
    }

    /* renamed from: w0 */
    public static final void m9418w0(BaseDetailViewModel baseDetailViewModel, Boolean bool) {
        if (Intrinsics.areEqual(bool, Boolean.TRUE)) {
            AbstractC8858b.f15060b.m14855a("刷新当前界面");
            baseDetailViewModel.m9283b0();
        }
    }

    /* renamed from: x0 */
    public static final Unit m9420x0(String str, List list) {
        Intrinsics.checkNotNullParameter(str, "<unused var>");
        Intrinsics.checkNotNullParameter(list, "<unused var>");
        return Unit.INSTANCE;
    }

    /* renamed from: y0 */
    public static final Unit m9422y0(BaseDetailViewModel baseDetailViewModel, C7459j c7459j, final NavController navController) {
        baseDetailViewModel.mo9302r(c7459j, new Function0() { // from class: w5.j0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TaskDetailPageKt.m9424z0(navController);
            }
        });
        return Unit.INSTANCE;
    }

    /* renamed from: z0 */
    public static final Unit m9424z0(NavController navController) {
        navController.popBackStack();
        return Unit.INSTANCE;
    }
}
