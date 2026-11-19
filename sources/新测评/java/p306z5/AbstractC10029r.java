package p306z5;

import android.content.res.Resources;
import android.util.DisplayMetrics;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.FlowRowScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p013ui.Alignment;
import androidx.compose.p013ui.ComposedModifierKt;
import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.graphics.Color;
import androidx.compose.p013ui.graphics.ColorKt;
import androidx.compose.p013ui.layout.MeasurePolicy;
import androidx.compose.p013ui.node.ComposeUiNode;
import androidx.compose.p013ui.res.StringResources_androidKt;
import androidx.compose.p013ui.text.TextLayoutResult;
import androidx.compose.p013ui.text.TextStyle;
import androidx.compose.p013ui.text.font.FontFamily;
import androidx.compose.p013ui.text.font.FontStyle;
import androidx.compose.p013ui.text.font.FontWeight;
import androidx.compose.p013ui.text.style.TextAlign;
import androidx.compose.p013ui.text.style.TextDecoration;
import androidx.compose.p013ui.unit.C3127Dp;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.core.view.PointerIconCompat;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.zykj.evaluation.R;
import com.zykj.evaluation.p057ui.detail.mistake.TagData;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import p068d7.AbstractC7305a;
import p101g7.AbstractC7593i;
import p189o5.AbstractC8709e;

/* renamed from: z5.r */
/* loaded from: classes4.dex */
public abstract class AbstractC10029r {
    /* JADX WARN: Removed duplicated region for block: B:101:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:103:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0338  */
    /* renamed from: A */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m16859A(java.lang.String r29, final boolean r30, final kotlin.jvm.functions.Function0 r31, kotlin.jvm.functions.Function0 r32, androidx.compose.runtime.Composer r33, final int r34, final int r35) {
        /*
            Method dump skipped, instructions count: 854
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p306z5.AbstractC10029r.m16859A(java.lang.String, boolean, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    /* renamed from: B */
    public static final Unit m16860B(String str, boolean z9, Function0 function0, Function0 function02, int i10, int i11, Composer composer, int i12) {
        m16859A(str, z9, function0, function02, composer, RecomposeScopeImplKt.updateChangedFlags(i10 | 1), i11);
        return Unit.INSTANCE;
    }

    /* renamed from: C */
    public static final void m16861C(List list, Function1 function1, Composer composer, final int i10) {
        int i11;
        final List list2;
        final Function1 function12;
        Composer composerStartRestartGroup = composer.startRestartGroup(283521630);
        if ((i10 & 6) == 0) {
            i11 = (composerStartRestartGroup.changedInstance(list) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i11 & 19) != 18, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(283521630, i11, -1, "com.zykj.evaluation.ui.detail.mistake.ErrorReasonView (MistakeDrawerView.kt:153)");
            }
            list2 = list;
            function12 = function1;
            m16882t(StringResources_androidKt.stringResource(R.string.tag_title_reason, composerStartRestartGroup, 6), null, list2, function12, null, composerStartRestartGroup, (i11 << 6) & 8064, 18);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            list2 = list;
            function12 = function1;
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: z5.i
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AbstractC10029r.m16862D(list2, function12, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: D */
    public static final Unit m16862D(List list, Function1 function1, int i10, Composer composer, int i11) {
        m16861C(list, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i10 | 1));
        return Unit.INSTANCE;
    }

    /* renamed from: l */
    public static final void m16874l(List list, Function1 function1, Composer composer, final int i10) {
        int i11;
        final List list2;
        final Function1 function12;
        Composer composerStartRestartGroup = composer.startRestartGroup(97313010);
        if ((i10 & 6) == 0) {
            i11 = (composerStartRestartGroup.changedInstance(list) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i11 & 19) != 18, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(97313010, i11, -1, "com.zykj.evaluation.ui.detail.mistake.AttainedLevelView (MistakeDrawerView.kt:137)");
            }
            list2 = list;
            function12 = function1;
            m16882t(StringResources_androidKt.stringResource(R.string.tag_title_attained, composerStartRestartGroup, 6), null, list2, function12, null, composerStartRestartGroup, (i11 << 6) & 8064, 18);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            list2 = list;
            function12 = function1;
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: z5.l
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AbstractC10029r.m16875m(list2, function12, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: m */
    public static final Unit m16875m(List list, Function1 function1, int i10, Composer composer, int i11) {
        m16874l(list, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i10 | 1));
        return Unit.INSTANCE;
    }

    /* renamed from: n */
    public static final void m16876n(List list, Function1 function1, Function1 function12, Composer composer, final int i10) {
        int i11;
        final List list2;
        final Function1 function13;
        final Function1 function14;
        Composer composerStartRestartGroup = composer.startRestartGroup(528675630);
        if ((i10 & 6) == 0) {
            i11 = (composerStartRestartGroup.changedInstance(list) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(function12) ? 256 : 128;
        }
        if (composerStartRestartGroup.shouldExecute((i11 & 147) != 146, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(528675630, i11, -1, "com.zykj.evaluation.ui.detail.mistake.CustomTagView (MistakeDrawerView.kt:170)");
            }
            list2 = list;
            function13 = function1;
            function14 = function12;
            m16882t(StringResources_androidKt.stringResource(R.string.custom_tag, composerStartRestartGroup, 6), StringResources_androidKt.stringResource(R.string.custom_tag_tip, composerStartRestartGroup, 6), list2, function13, function14, composerStartRestartGroup, (i11 << 6) & 65408, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            list2 = list;
            function13 = function1;
            function14 = function12;
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: z5.j
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AbstractC10029r.m16877o(list2, function13, function14, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: o */
    public static final Unit m16877o(List list, Function1 function1, Function1 function12, int i10, Composer composer, int i11) {
        m16876n(list, function1, function12, composer, RecomposeScopeImplKt.updateChangedFlags(i10 | 1));
        return Unit.INSTANCE;
    }

    /* renamed from: p */
    public static final void m16878p(List list, Function1 function1, Composer composer, final int i10) {
        int i11;
        final List list2;
        final Function1 function12;
        Composer composerStartRestartGroup = composer.startRestartGroup(1641650579);
        if ((i10 & 6) == 0) {
            i11 = (composerStartRestartGroup.changedInstance(list) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i11 & 19) != 18, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1641650579, i11, -1, "com.zykj.evaluation.ui.detail.mistake.DiffView (MistakeDrawerView.kt:120)");
            }
            list2 = list;
            function12 = function1;
            m16882t(StringResources_androidKt.stringResource(R.string.tag_title_diff, composerStartRestartGroup, 6), null, list2, function12, null, composerStartRestartGroup, (i11 << 6) & 8064, 18);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            list2 = list;
            function12 = function1;
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: z5.m
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AbstractC10029r.m16879q(list2, function12, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: q */
    public static final Unit m16879q(List list, Function1 function1, int i10, Composer composer, int i11) {
        m16878p(list, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i10 | 1));
        return Unit.INSTANCE;
    }

    /* renamed from: r */
    public static final void m16880r(Modifier modifier, final Function0 function0, final Function0 function02, Composer composer, final int i10, final int i11) {
        Modifier modifier2;
        int i12;
        Composer composer2;
        final Modifier modifier3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1225718195);
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
            i12 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i12 |= composerStartRestartGroup.changedInstance(function02) ? 256 : 128;
        }
        if (composerStartRestartGroup.shouldExecute((i12 & 147) != 146, i12 & 1)) {
            Modifier modifier4 = i13 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1225718195, i12, -1, "com.zykj.evaluation.ui.detail.mistake.DrawerButtonView (MistakeDrawerView.kt:304)");
            }
            Arrangement.Horizontal start = Arrangement.INSTANCE.getStart();
            Alignment.Companion companion = Alignment.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(start, companion.getTop(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier4);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
            Updater.m20425setimpl(composerM20418constructorimpl, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m20425setimpl(composerM20418constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM20418constructorimpl.getInserting() || !Intrinsics.areEqual(composerM20418constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM20418constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM20418constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m20425setimpl(composerM20418constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            Modifier.Companion companion3 = Modifier.INSTANCE;
            float f10 = 600;
            float f11 = 81 / f10;
            DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
            float fM23561constructorimpl = C3127Dp.m23561constructorimpl((RangesKt.coerceAtLeast(displayMetrics.widthPixels, displayMetrics.heightPixels) / Resources.getSystem().getDisplayMetrics().density) * f11);
            float f12 = 24 / f10;
            DisplayMetrics displayMetrics2 = Resources.getSystem().getDisplayMetrics();
            Modifier modifierM17730sizeVpY3zN4 = SizeKt.m17730sizeVpY3zN4(companion3, fM23561constructorimpl, C3127Dp.m23561constructorimpl((RangesKt.coerceAtLeast(displayMetrics2.widthPixels, displayMetrics2.heightPixels) / Resources.getSystem().getDisplayMetrics().density) * f12));
            long jM11585i = AbstractC7305a.m11585i();
            float f13 = 12 / f10;
            DisplayMetrics displayMetrics3 = Resources.getSystem().getDisplayMetrics();
            Modifier modifierM12480g = AbstractC7593i.m12480g(BackgroundKt.m17189backgroundbw27NRU(modifierM17730sizeVpY3zN4, jM11585i, RoundedCornerShapeKt.m17974RoundedCornerShape0680j_4(C3127Dp.m23561constructorimpl((RangesKt.coerceAtLeast(displayMetrics3.widthPixels, displayMetrics3.heightPixels) / Resources.getSystem().getDisplayMetrics().density) * f13))), false, function0, 1, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion.getTopStart(), false);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM12480g);
            Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
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
            Updater.m20425setimpl(composerM20418constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m20425setimpl(composerM20418constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
            if (composerM20418constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM20418constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM20418constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM20418constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m20425setimpl(composerM20418constructorimpl2, modifierMaterializeModifier2, companion2.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Modifier modifier5 = modifier4;
            TextKt.m19430Text4IGK_g("确认", boxScopeInstance.align(companion3, companion.getCenter()), Color.INSTANCE.m21013getWhite0d7_KjU(), AbstractC8709e.m14344k(7), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 3462, 0, 131056);
            composerStartRestartGroup.endNode();
            float f14 = 22 / f10;
            DisplayMetrics displayMetrics4 = Resources.getSystem().getDisplayMetrics();
            SpacerKt.Spacer(SizeKt.m17733width3ABfNKs(companion3, C3127Dp.m23561constructorimpl(f14 * (RangesKt.coerceAtLeast(displayMetrics4.widthPixels, displayMetrics4.heightPixels) / Resources.getSystem().getDisplayMetrics().density))), composerStartRestartGroup, 6);
            DisplayMetrics displayMetrics5 = Resources.getSystem().getDisplayMetrics();
            float fM23561constructorimpl2 = C3127Dp.m23561constructorimpl(f11 * (RangesKt.coerceAtLeast(displayMetrics5.widthPixels, displayMetrics5.heightPixels) / Resources.getSystem().getDisplayMetrics().density));
            DisplayMetrics displayMetrics6 = Resources.getSystem().getDisplayMetrics();
            Modifier modifierM17730sizeVpY3zN42 = SizeKt.m17730sizeVpY3zN4(companion3, fM23561constructorimpl2, C3127Dp.m23561constructorimpl(f12 * (RangesKt.coerceAtLeast(displayMetrics6.widthPixels, displayMetrics6.heightPixels) / Resources.getSystem().getDisplayMetrics().density)));
            long jColor = ColorKt.Color(4291611852L);
            DisplayMetrics displayMetrics7 = Resources.getSystem().getDisplayMetrics();
            Modifier modifierM12480g2 = AbstractC7593i.m12480g(BackgroundKt.m17189backgroundbw27NRU(modifierM17730sizeVpY3zN42, jColor, RoundedCornerShapeKt.m17974RoundedCornerShape0680j_4(C3127Dp.m23561constructorimpl(f13 * (RangesKt.coerceAtLeast(displayMetrics7.widthPixels, displayMetrics7.heightPixels) / Resources.getSystem().getDisplayMetrics().density)))), false, function02, 1, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion.getTopStart(), false);
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM12480g2);
            Function0<ComposeUiNode> constructor3 = companion2.getConstructor();
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
            Updater.m20425setimpl(composerM20418constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy2, companion2.getSetMeasurePolicy());
            Updater.m20425setimpl(composerM20418constructorimpl3, currentCompositionLocalMap3, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion2.getSetCompositeKeyHash();
            if (composerM20418constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM20418constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                composerM20418constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                composerM20418constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
            }
            Updater.m20425setimpl(composerM20418constructorimpl3, modifierMaterializeModifier3, companion2.getSetModifier());
            composer2 = composerStartRestartGroup;
            TextKt.m19430Text4IGK_g("重置", boxScopeInstance.align(companion3, companion.getCenter()), ColorKt.Color(4294967295L), AbstractC8709e.m14344k(7), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 3462, 0, 131056);
            composer2.endNode();
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier5;
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
            modifier3 = modifier2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: z5.k
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AbstractC10029r.m16881s(modifier3, function0, function02, i10, i11, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: s */
    public static final Unit m16881s(Modifier modifier, Function0 function0, Function0 function02, int i10, int i11, Composer composer, int i12) {
        m16880r(modifier, function0, function02, composer, RecomposeScopeImplKt.updateChangedFlags(i10 | 1), i11);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:94:? A[RETURN, SYNTHETIC] */
    /* renamed from: t */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m16882t(final java.lang.String r38, java.lang.String r39, final java.util.List r40, final kotlin.jvm.functions.Function1 r41, kotlin.jvm.functions.Function1 r42, androidx.compose.runtime.Composer r43, final int r44, final int r45) {
        /*
            Method dump skipped, instructions count: 835
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p306z5.AbstractC10029r.m16882t(java.lang.String, java.lang.String, java.util.List, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* renamed from: u */
    public static final Unit m16883u(List list, final Function1 function1, final Function1 function12, FlowRowScope FlowRow, Composer composer, int i10) {
        Function0 function0;
        Intrinsics.checkNotNullParameter(FlowRow, "$this$FlowRow");
        if (composer.shouldExecute((i10 & 17) != 16, i10 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1552104574, i10, -1, "com.zykj.evaluation.ui.detail.mistake.DrawerCommonTagView.<anonymous>.<anonymous> (MistakeDrawerView.kt:228)");
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                final TagData tagData = (TagData) it.next();
                String name = tagData.getName();
                boolean zIsSelected = tagData.isSelected();
                boolean zChanged = composer.changed(function1) | composer.changed(tagData);
                Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: z5.p
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return AbstractC10029r.m16884v(function1, tagData);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                Function0 function02 = (Function0) objRememberedValue;
                if (function12 == null) {
                    composer.startReplaceGroup(397822813);
                    composer.endReplaceGroup();
                    function0 = null;
                } else {
                    composer.startReplaceGroup(397822814);
                    boolean zChanged2 = composer.changed(function12) | composer.changed(tagData);
                    Object objRememberedValue2 = composer.rememberedValue();
                    if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new Function0() { // from class: z5.q
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return AbstractC10029r.m16885w(function12, tagData);
                            }
                        };
                        composer.updateRememberedValue(objRememberedValue2);
                    }
                    function0 = (Function0) objRememberedValue2;
                    composer.endReplaceGroup();
                }
                m16859A(name, zIsSelected, function02, function0, composer, 0, 0);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* renamed from: v */
    public static final Unit m16884v(Function1 function1, TagData tagData) {
        function1.invoke(tagData);
        return Unit.INSTANCE;
    }

    /* renamed from: w */
    public static final Unit m16885w(Function1 function1, TagData tagData) {
        function1.invoke(tagData);
        return Unit.INSTANCE;
    }

    /* renamed from: x */
    public static final Unit m16886x(String str, String str2, List list, Function1 function1, Function1 function12, int i10, int i11, Composer composer, int i12) {
        m16882t(str, str2, list, function1, function12, composer, RecomposeScopeImplKt.updateChangedFlags(i10 | 1), i11);
        return Unit.INSTANCE;
    }

    /* renamed from: y */
    public static final void m16887y(Modifier modifier, final List diffList, final Function1 onClickDiffTag, final List attainedLevelList, final Function1 onClickAttainedLevelTag, final List errorReasonList, final Function1 onClickErrorReasonTag, final List customTagList, final Function1 onClickCustomTag, final Function1 onLongClickCustomTag, final Function0 onClickConfirm, final Function0 onClickReset, Composer composer, final int i10, final int i11, final int i12) {
        Modifier modifier2;
        int i13;
        int i14;
        final Modifier modifier3;
        Intrinsics.checkNotNullParameter(diffList, "diffList");
        Intrinsics.checkNotNullParameter(onClickDiffTag, "onClickDiffTag");
        Intrinsics.checkNotNullParameter(attainedLevelList, "attainedLevelList");
        Intrinsics.checkNotNullParameter(onClickAttainedLevelTag, "onClickAttainedLevelTag");
        Intrinsics.checkNotNullParameter(errorReasonList, "errorReasonList");
        Intrinsics.checkNotNullParameter(onClickErrorReasonTag, "onClickErrorReasonTag");
        Intrinsics.checkNotNullParameter(customTagList, "customTagList");
        Intrinsics.checkNotNullParameter(onClickCustomTag, "onClickCustomTag");
        Intrinsics.checkNotNullParameter(onLongClickCustomTag, "onLongClickCustomTag");
        Intrinsics.checkNotNullParameter(onClickConfirm, "onClickConfirm");
        Intrinsics.checkNotNullParameter(onClickReset, "onClickReset");
        Composer composerStartRestartGroup = composer.startRestartGroup(264767044);
        int i15 = i12 & 1;
        if (i15 != 0) {
            i13 = i10 | 6;
            modifier2 = modifier;
        } else {
            modifier2 = modifier;
            if ((i10 & 6) == 0) {
                i13 = i10 | (composerStartRestartGroup.changed(modifier2) ? 4 : 2);
            } else {
                i13 = i10;
            }
        }
        if ((i10 & 48) == 0) {
            i13 |= composerStartRestartGroup.changedInstance(diffList) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i13 |= composerStartRestartGroup.changedInstance(onClickDiffTag) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i13 |= composerStartRestartGroup.changedInstance(attainedLevelList) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i13 |= composerStartRestartGroup.changedInstance(onClickAttainedLevelTag) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i13 |= composerStartRestartGroup.changedInstance(errorReasonList) ? 131072 : 65536;
        }
        if ((1572864 & i10) == 0) {
            i13 |= composerStartRestartGroup.changedInstance(onClickErrorReasonTag) ? 1048576 : 524288;
        }
        if ((12582912 & i10) == 0) {
            i13 |= composerStartRestartGroup.changedInstance(customTagList) ? 8388608 : 4194304;
        }
        if ((100663296 & i10) == 0) {
            i13 |= composerStartRestartGroup.changedInstance(onClickCustomTag) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        if ((805306368 & i10) == 0) {
            i13 |= composerStartRestartGroup.changedInstance(onLongClickCustomTag) ? 536870912 : 268435456;
        }
        int i16 = i13;
        if ((i11 & 6) == 0) {
            i14 = i11 | (composerStartRestartGroup.changedInstance(onClickConfirm) ? 4 : 2);
        } else {
            i14 = i11;
        }
        if ((i11 & 48) == 0) {
            i14 |= composerStartRestartGroup.changedInstance(onClickReset) ? 32 : 16;
        }
        int i17 = i14;
        if (composerStartRestartGroup.shouldExecute(((i16 & 306783379) == 306783378 && (i17 & 19) == 18) ? false : true, i16 & 1)) {
            Modifier modifier4 = i15 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(264767044, i16, i17, "com.zykj.evaluation.ui.detail.mistake.DrawerContent (MistakeDrawerView.kt:53)");
            }
            Modifier modifierM17190backgroundbw27NRU$default = BackgroundKt.m17190backgroundbw27NRU$default(SizeKt.fillMaxHeight$default(modifier4, 0.0f, 1, null), Color.INSTANCE.m21013getWhite0d7_KjU(), null, 2, null);
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top2 = arrangement.getTop();
            Alignment.Companion companion = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top2, companion.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM17190backgroundbw27NRU$default);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
            Modifier modifier5 = modifier4;
            Updater.m20425setimpl(composerM20418constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m20425setimpl(composerM20418constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM20418constructorimpl.getInserting() || !Intrinsics.areEqual(composerM20418constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM20418constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM20418constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m20425setimpl(composerM20418constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            ScrollState scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1);
            Modifier.Companion companion3 = Modifier.INSTANCE;
            Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(ColumnScope.weight$default(columnScopeInstance, SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), 1.0f, false, 2, null), scrollStateRememberScrollState, false, null, false, 14, null);
            float f10 = 600;
            DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
            Modifier modifierM17681padding3ABfNKs = PaddingKt.m17681padding3ABfNKs(modifierVerticalScroll$default, C3127Dp.m23561constructorimpl((14 / f10) * (RangesKt.coerceAtLeast(displayMetrics.widthPixels, displayMetrics.heightPixels) / Resources.getSystem().getDisplayMetrics().density)));
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM17681padding3ABfNKs);
            Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
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
            Updater.m20425setimpl(composerM20418constructorimpl2, measurePolicyColumnMeasurePolicy2, companion2.getSetMeasurePolicy());
            Updater.m20425setimpl(composerM20418constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
            if (composerM20418constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM20418constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM20418constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM20418constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m20425setimpl(composerM20418constructorimpl2, modifierMaterializeModifier2, companion2.getSetModifier());
            DisplayMetrics displayMetrics2 = Resources.getSystem().getDisplayMetrics();
            SpacerKt.Spacer(SizeKt.m17714height3ABfNKs(companion3, C3127Dp.m23561constructorimpl((30 / f10) * (RangesKt.coerceAtLeast(displayMetrics2.widthPixels, displayMetrics2.heightPixels) / Resources.getSystem().getDisplayMetrics().density))), composerStartRestartGroup, 6);
            m16878p(diffList, onClickDiffTag, composerStartRestartGroup, (i16 >> 3) & 126);
            float f11 = 8 / f10;
            DisplayMetrics displayMetrics3 = Resources.getSystem().getDisplayMetrics();
            SpacerKt.Spacer(SizeKt.m17714height3ABfNKs(companion3, C3127Dp.m23561constructorimpl((RangesKt.coerceAtLeast(displayMetrics3.widthPixels, displayMetrics3.heightPixels) / Resources.getSystem().getDisplayMetrics().density) * f11)), composerStartRestartGroup, 6);
            m16874l(attainedLevelList, onClickAttainedLevelTag, composerStartRestartGroup, (i16 >> 9) & 126);
            DisplayMetrics displayMetrics4 = Resources.getSystem().getDisplayMetrics();
            SpacerKt.Spacer(SizeKt.m17714height3ABfNKs(companion3, C3127Dp.m23561constructorimpl((RangesKt.coerceAtLeast(displayMetrics4.widthPixels, displayMetrics4.heightPixels) / Resources.getSystem().getDisplayMetrics().density) * f11)), composerStartRestartGroup, 6);
            m16861C(errorReasonList, onClickErrorReasonTag, composerStartRestartGroup, (i16 >> 15) & 126);
            DisplayMetrics displayMetrics5 = Resources.getSystem().getDisplayMetrics();
            SpacerKt.Spacer(SizeKt.m17714height3ABfNKs(companion3, C3127Dp.m23561constructorimpl(f11 * (RangesKt.coerceAtLeast(displayMetrics5.widthPixels, displayMetrics5.heightPixels) / Resources.getSystem().getDisplayMetrics().density))), composerStartRestartGroup, 6);
            m16876n(customTagList, onClickCustomTag, onLongClickCustomTag, composerStartRestartGroup, (i16 >> 21) & 1022);
            composerStartRestartGroup.endNode();
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null);
            float f12 = 45 / f10;
            DisplayMetrics displayMetrics6 = Resources.getSystem().getDisplayMetrics();
            Modifier modifierM17714height3ABfNKs = SizeKt.m17714height3ABfNKs(modifierFillMaxWidth$default, C3127Dp.m23561constructorimpl(f12 * (RangesKt.coerceAtLeast(displayMetrics6.widthPixels, displayMetrics6.heightPixels) / Resources.getSystem().getDisplayMetrics().density)));
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion.getTopStart(), false);
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM17714height3ABfNKs);
            Function0<ComposeUiNode> constructor3 = companion2.getConstructor();
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
            Updater.m20425setimpl(composerM20418constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m20425setimpl(composerM20418constructorimpl3, currentCompositionLocalMap3, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion2.getSetCompositeKeyHash();
            if (composerM20418constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM20418constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                composerM20418constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                composerM20418constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
            }
            Updater.m20425setimpl(composerM20418constructorimpl3, modifierMaterializeModifier3, companion2.getSetModifier());
            m16880r(BoxScopeInstance.INSTANCE.align(companion3, companion.getCenter()), onClickConfirm, onClickReset, composerStartRestartGroup, (i17 << 3) & PointerIconCompat.TYPE_TEXT, 0);
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier5;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier3 = modifier2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: z5.g
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AbstractC10029r.m16888z(modifier3, diffList, onClickDiffTag, attainedLevelList, onClickAttainedLevelTag, errorReasonList, onClickErrorReasonTag, customTagList, onClickCustomTag, onLongClickCustomTag, onClickConfirm, onClickReset, i10, i11, i12, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: z */
    public static final Unit m16888z(Modifier modifier, List list, Function1 function1, List list2, Function1 function12, List list3, Function1 function13, List list4, Function1 function14, Function1 function15, Function0 function0, Function0 function02, int i10, int i11, int i12, Composer composer, int i13) {
        m16887y(modifier, list, function1, list2, function12, list3, function13, list4, function14, function15, function0, function02, composer, RecomposeScopeImplKt.updateChangedFlags(i10 | 1), RecomposeScopeImplKt.updateChangedFlags(i11), i12);
        return Unit.INSTANCE;
    }
}
