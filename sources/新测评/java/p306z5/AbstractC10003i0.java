package p306z5;

import android.content.res.Resources;
import android.util.DisplayMetrics;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.FlowLayoutKt;
import androidx.compose.foundation.layout.FlowRowScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.BasicTextFieldKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material3.TextKt;
import androidx.compose.p013ui.Alignment;
import androidx.compose.p013ui.ComposedModifierKt;
import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.draw.ClipKt;
import androidx.compose.p013ui.graphics.Brush;
import androidx.compose.p013ui.graphics.Color;
import androidx.compose.p013ui.graphics.ColorFilter;
import androidx.compose.p013ui.graphics.ColorKt;
import androidx.compose.p013ui.graphics.Shadow;
import androidx.compose.p013ui.graphics.SolidColor;
import androidx.compose.p013ui.graphics.drawscope.DrawStyle;
import androidx.compose.p013ui.layout.ContentScale;
import androidx.compose.p013ui.layout.MeasurePolicy;
import androidx.compose.p013ui.node.ComposeUiNode;
import androidx.compose.p013ui.res.PainterResources_androidKt;
import androidx.compose.p013ui.res.StringResources_androidKt;
import androidx.compose.p013ui.text.PlatformTextStyle;
import androidx.compose.p013ui.text.TextLayoutResult;
import androidx.compose.p013ui.text.TextStyle;
import androidx.compose.p013ui.text.font.FontFamily;
import androidx.compose.p013ui.text.font.FontStyle;
import androidx.compose.p013ui.text.font.FontSynthesis;
import androidx.compose.p013ui.text.font.FontWeight;
import androidx.compose.p013ui.text.input.VisualTransformation;
import androidx.compose.p013ui.text.intl.LocaleList;
import androidx.compose.p013ui.text.style.BaselineShift;
import androidx.compose.p013ui.text.style.LineHeightStyle;
import androidx.compose.p013ui.text.style.TextAlign;
import androidx.compose.p013ui.text.style.TextDecoration;
import androidx.compose.p013ui.text.style.TextGeometricTransform;
import androidx.compose.p013ui.text.style.TextIndent;
import androidx.compose.p013ui.text.style.TextMotion;
import androidx.compose.p013ui.unit.C3127Dp;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.core.view.PointerIconCompat;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import coil3.compose.AbstractC5177c;
import com.zykj.evaluation.R;
import com.zykj.evaluation.p057ui.detail.mistake.TagData;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import p068d7.AbstractC7305a;
import p079e7.AbstractC7373b0;
import p079e7.AbstractC7407s0;
import p101g7.AbstractC7593i;
import p189o5.AbstractC8709e;

/* renamed from: z5.i0 */
/* loaded from: classes4.dex */
public abstract class AbstractC10003i0 {
    /* renamed from: A */
    public static final Unit m16806A(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* renamed from: B */
    public static final Unit m16807B(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* renamed from: C */
    public static final Unit m16808C(String str, Function0 function0, int i10, int i11, Composer composer, int i12) {
        m16844z(str, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i10 | 1), i11);
        return Unit.INSTANCE;
    }

    /* renamed from: D */
    public static final void m16809D(Modifier modifier, final List list, final Function1 function1, Composer composer, final int i10, final int i11) {
        Modifier modifier2;
        int i12;
        Composer composer2;
        final Modifier modifier3;
        Composer composerStartRestartGroup = composer.startRestartGroup(234647709);
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
            i12 |= composerStartRestartGroup.changedInstance(list) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i12 |= composerStartRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        if (composerStartRestartGroup.shouldExecute((i12 & 147) != 146, i12 & 1)) {
            Modifier modifier4 = i13 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(234647709, i12, -1, "com.zykj.evaluation.ui.detail.mistake.TagView (MistakeMainView.kt:359)");
            }
            Arrangement arrangement = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), Alignment.INSTANCE.getTop(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier4);
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
            Updater.m20425setimpl(composerM20418constructorimpl, measurePolicyRowMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m20425setimpl(composerM20418constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (composerM20418constructorimpl.getInserting() || !Intrinsics.areEqual(composerM20418constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM20418constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM20418constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m20425setimpl(composerM20418constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            Modifier.Companion companion2 = Modifier.INSTANCE;
            float f10 = 600;
            DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
            Modifier modifierM17733width3ABfNKs = SizeKt.m17733width3ABfNKs(companion2, C3127Dp.m23561constructorimpl((30 / f10) * (RangesKt.coerceAtLeast(displayMetrics.widthPixels, displayMetrics.heightPixels) / Resources.getSystem().getDisplayMetrics().density)));
            DisplayMetrics displayMetrics2 = Resources.getSystem().getDisplayMetrics();
            composer2 = composerStartRestartGroup;
            Modifier modifier5 = modifier4;
            TextKt.m19430Text4IGK_g("标签：", PaddingKt.m17685paddingqDBjuR0$default(modifierM17733width3ABfNKs, 0.0f, C3127Dp.m23561constructorimpl((10 / f10) * (RangesKt.coerceAtLeast(displayMetrics2.widthPixels, displayMetrics2.heightPixels) / Resources.getSystem().getDisplayMetrics().density)), 0.0f, 0.0f, 13, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ColorKt.Color(4284111450L), AbstractC8709e.m14344k(8), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777212, (DefaultConstructorMarker) null), composer2, 54, 0, 65532);
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null);
            float f11 = 3 / f10;
            DisplayMetrics displayMetrics3 = Resources.getSystem().getDisplayMetrics();
            Arrangement.HorizontalOrVertical horizontalOrVerticalM17562spacedBy0680j_4 = arrangement.m17562spacedBy0680j_4(C3127Dp.m23561constructorimpl((RangesKt.coerceAtLeast(displayMetrics3.widthPixels, displayMetrics3.heightPixels) / Resources.getSystem().getDisplayMetrics().density) * f11));
            DisplayMetrics displayMetrics4 = Resources.getSystem().getDisplayMetrics();
            FlowLayoutKt.FlowRow(modifierFillMaxWidth$default, horizontalOrVerticalM17562spacedBy0680j_4, arrangement.m17562spacedBy0680j_4(C3127Dp.m23561constructorimpl(f11 * (RangesKt.coerceAtLeast(displayMetrics4.widthPixels, displayMetrics4.heightPixels) / Resources.getSystem().getDisplayMetrics().density))), null, 0, 0, ComposableLambdaKt.rememberComposableLambda(-1333997004, true, new Function3() { // from class: z5.t
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return AbstractC10003i0.m16810E(list, function1, (FlowRowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, composer2, 54), composer2, 1573302, 56);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: z5.u
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AbstractC10003i0.m16812G(modifier3, list, function1, i10, i11, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: E */
    public static final Unit m16810E(List list, final Function1 function1, FlowRowScope FlowRow, Composer composer, int i10) {
        Intrinsics.checkNotNullParameter(FlowRow, "$this$FlowRow");
        if (composer.shouldExecute((i10 & 17) != 16, i10 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1333997004, i10, -1, "com.zykj.evaluation.ui.detail.mistake.TagView.<anonymous>.<anonymous> (MistakeMainView.kt:377)");
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                final TagData tagData = (TagData) it.next();
                String name = tagData.getName();
                boolean zChanged = composer.changed(function1) | composer.changed(tagData);
                Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: z5.v
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return AbstractC10003i0.m16811F(function1, tagData);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                m16844z(name, (Function0) objRememberedValue, composer, 0, 0);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* renamed from: F */
    public static final Unit m16811F(Function1 function1, TagData tagData) {
        function1.invoke(tagData);
        return Unit.INSTANCE;
    }

    /* renamed from: G */
    public static final Unit m16812G(Modifier modifier, List list, Function1 function1, int i10, int i11, Composer composer, int i12) {
        m16809D(modifier, list, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i10 | 1), i11);
        return Unit.INSTANCE;
    }

    /* renamed from: H */
    public static final void m16813H(Modifier modifier, final String str, final Function1 function1, Composer composer, final int i10, final int i11) {
        Modifier modifier2;
        int i12;
        final Modifier modifier3;
        Composer composerStartRestartGroup = composer.startRestartGroup(426438028);
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
            i12 |= composerStartRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i12 |= composerStartRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        if (composerStartRestartGroup.shouldExecute((i12 & 147) != 146, i12 & 1)) {
            Modifier modifier4 = i13 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(426438028, i12, -1, "com.zykj.evaluation.ui.detail.mistake.TitleView (MistakeMainView.kt:184)");
            }
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getCenterVertically(), composerStartRestartGroup, 48);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier4);
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
            Updater.m20425setimpl(composerM20418constructorimpl, measurePolicyRowMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m20425setimpl(composerM20418constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (composerM20418constructorimpl.getInserting() || !Intrinsics.areEqual(composerM20418constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM20418constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM20418constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m20425setimpl(composerM20418constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            Modifier.Companion companion2 = Modifier.INSTANCE;
            float f10 = 600;
            DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
            int i14 = i12;
            Modifier modifier5 = modifier4;
            ImageKt.Image(PainterResources_androidKt.painterResource(R.mipmap.ic_star, composerStartRestartGroup, 6), (String) null, SizeKt.m17728size3ABfNKs(companion2, C3127Dp.m23561constructorimpl((6 / f10) * (RangesKt.coerceAtLeast(displayMetrics.widthPixels, displayMetrics.heightPixels) / Resources.getSystem().getDisplayMetrics().density))), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 432, 120);
            DisplayMetrics displayMetrics2 = Resources.getSystem().getDisplayMetrics();
            SpacerKt.Spacer(SizeKt.m17728size3ABfNKs(companion2, C3127Dp.m23561constructorimpl((4 / f10) * (RangesKt.coerceAtLeast(displayMetrics2.widthPixels, displayMetrics2.heightPixels) / Resources.getSystem().getDisplayMetrics().density))), composerStartRestartGroup, 6);
            DisplayMetrics displayMetrics3 = Resources.getSystem().getDisplayMetrics();
            TextKt.m19430Text4IGK_g("标题：", SizeKt.m17733width3ABfNKs(companion2, C3127Dp.m23561constructorimpl((30 / f10) * (RangesKt.coerceAtLeast(displayMetrics3.widthPixels, displayMetrics3.heightPixels) / Resources.getSystem().getDisplayMetrics().density))), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ColorKt.Color(4284111450L), AbstractC8709e.m14344k(8), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777212, (DefaultConstructorMarker) null), composerStartRestartGroup, 54, 0, 65532);
            DisplayMetrics displayMetrics4 = Resources.getSystem().getDisplayMetrics();
            Modifier modifierM17733width3ABfNKs = SizeKt.m17733width3ABfNKs(companion2, C3127Dp.m23561constructorimpl((294 / f10) * (RangesKt.coerceAtLeast(displayMetrics4.widthPixels, displayMetrics4.heightPixels) / Resources.getSystem().getDisplayMetrics().density)));
            DisplayMetrics displayMetrics5 = Resources.getSystem().getDisplayMetrics();
            Modifier modifierM17714height3ABfNKs = SizeKt.m17714height3ABfNKs(modifierM17733width3ABfNKs, C3127Dp.m23561constructorimpl((24 / f10) * (RangesKt.coerceAtLeast(displayMetrics5.widthPixels, displayMetrics5.heightPixels) / Resources.getSystem().getDisplayMetrics().density)));
            long jM21013getWhite0d7_KjU = Color.INSTANCE.m21013getWhite0d7_KjU();
            float f11 = 3 / f10;
            DisplayMetrics displayMetrics6 = Resources.getSystem().getDisplayMetrics();
            Modifier modifierM17189backgroundbw27NRU = BackgroundKt.m17189backgroundbw27NRU(modifierM17714height3ABfNKs, jM21013getWhite0d7_KjU, RoundedCornerShapeKt.m17974RoundedCornerShape0680j_4(C3127Dp.m23561constructorimpl((RangesKt.coerceAtLeast(displayMetrics6.widthPixels, displayMetrics6.heightPixels) / Resources.getSystem().getDisplayMetrics().density) * f11)));
            float fM23561constructorimpl = C3127Dp.m23561constructorimpl(1);
            long jColor = ColorKt.Color(4291611852L);
            DisplayMetrics displayMetrics7 = Resources.getSystem().getDisplayMetrics();
            Modifier modifierM17201borderxT4_qwU = BorderKt.m17201borderxT4_qwU(modifierM17189backgroundbw27NRU, fM23561constructorimpl, jColor, RoundedCornerShapeKt.m17974RoundedCornerShape0680j_4(C3127Dp.m23561constructorimpl(f11 * (RangesKt.coerceAtLeast(displayMetrics7.widthPixels, displayMetrics7.heightPixels) / Resources.getSystem().getDisplayMetrics().density))));
            DisplayMetrics displayMetrics8 = Resources.getSystem().getDisplayMetrics();
            Modifier modifierM17683paddingVpY3zN4$default = PaddingKt.m17683paddingVpY3zN4$default(modifierM17201borderxT4_qwU, C3127Dp.m23561constructorimpl((8 / f10) * (RangesKt.coerceAtLeast(displayMetrics8.widthPixels, displayMetrics8.heightPixels) / Resources.getSystem().getDisplayMetrics().density)), 0.0f, 2, null);
            TextStyle textStyle = new TextStyle(ColorKt.Color(4284111450L), AbstractC8709e.m14344k(8), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777212, (DefaultConstructorMarker) null);
            SolidColor solidColor = new SolidColor(AbstractC7305a.m11585i(), null);
            boolean z9 = (i14 & 896) == 256;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z9 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: z5.z
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return AbstractC10003i0.m16815J(function1, (String) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            BasicTextFieldKt.BasicTextField(str, (Function1<? super String, Unit>) objRememberedValue, modifierM17683paddingVpY3zN4$default, false, false, textStyle, (KeyboardOptions) null, (KeyboardActions) null, true, 0, 0, (VisualTransformation) null, (Function1<? super TextLayoutResult, Unit>) null, (MutableInteractionSource) null, (Brush) solidColor, (Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit>) ComposableLambdaKt.rememberComposableLambda(-212208373, true, new Function3() { // from class: z5.a0
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return AbstractC10003i0.m16814I(str, (Function2) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, ((i14 >> 3) & 14) | 100663296, 221184, 16088);
            composerStartRestartGroup = composerStartRestartGroup;
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: z5.b0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AbstractC10003i0.m16816K(modifier3, str, function1, i10, i11, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: I */
    public static final Unit m16814I(String str, Function2 innerTextField, Composer composer, int i10) {
        int i11;
        Composer composer2 = composer;
        Intrinsics.checkNotNullParameter(innerTextField, "innerTextField");
        if ((i10 & 6) == 0) {
            i11 = i10 | (composer2.changedInstance(innerTextField) ? 4 : 2);
        } else {
            i11 = i10;
        }
        if (composer2.shouldExecute((i11 & 19) != 18, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-212208373, i11, -1, "com.zykj.evaluation.ui.detail.mistake.TitleView.<anonymous>.<anonymous> (MistakeMainView.kt:228)");
            }
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getCenterStart(), false);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifierFillMaxSize$default);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
            if (composer2.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor);
            } else {
                composer2.useNode();
            }
            Composer composerM20418constructorimpl = Updater.m20418constructorimpl(composer2);
            Updater.m20425setimpl(composerM20418constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m20425setimpl(composerM20418constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (composerM20418constructorimpl.getInserting() || !Intrinsics.areEqual(composerM20418constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM20418constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM20418constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m20425setimpl(composerM20418constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            innerTextField.invoke(composer2, Integer.valueOf(i11 & 14));
            if (str.length() == 0) {
                composer2.startReplaceGroup(-1861199524);
                TextKt.m19430Text4IGK_g(StringResources_androidKt.stringResource(R.string.mistake_title_max_length_tip, composer2, 6), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ColorKt.Color(4291611852L), AbstractC8709e.m14344k(8), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777212, (DefaultConstructorMarker) null), composer, 0, 0, 65534);
                composer2 = composer;
            } else {
                composer2.startReplaceGroup(-1868394531);
            }
            composer2.endReplaceGroup();
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* renamed from: J */
    public static final Unit m16815J(Function1 function1, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (it.length() > 10) {
            it = it.substring(0, 10);
            Intrinsics.checkNotNullExpressionValue(it, "substring(...)");
        }
        function1.invoke(it);
        return Unit.INSTANCE;
    }

    /* renamed from: K */
    public static final Unit m16816K(Modifier modifier, String str, Function1 function1, int i10, int i11, Composer composer, int i12) {
        m16813H(modifier, str, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i10 | 1), i11);
        return Unit.INSTANCE;
    }

    /* renamed from: L */
    public static final void m16817L(Modifier modifier, final List list, final long j10, final boolean z9, final Function1 function1, Composer composer, final int i10, final int i11) {
        Modifier modifier2;
        int i12;
        List list2;
        final Modifier modifier3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-2105238202);
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
            list2 = list;
            i12 |= composerStartRestartGroup.changedInstance(list2) ? 32 : 16;
        } else {
            list2 = list;
        }
        if ((i10 & 384) == 0) {
            i12 |= composerStartRestartGroup.changed(j10) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i12 |= composerStartRestartGroup.changed(z9) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i12 |= composerStartRestartGroup.changedInstance(function1) ? 16384 : 8192;
        }
        if (composerStartRestartGroup.shouldExecute((i12 & 9363) != 9362, i12 & 1)) {
            modifier3 = i13 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2105238202, i12, -1, "com.zykj.evaluation.ui.detail.mistake.TopicView (MistakeMainView.kt:123)");
            }
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top2 = arrangement.getTop();
            Alignment.Companion companion = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top2, companion.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier3);
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
            Updater.m20425setimpl(composerM20418constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m20425setimpl(composerM20418constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM20418constructorimpl.getInserting() || !Intrinsics.areEqual(composerM20418constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM20418constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM20418constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m20425setimpl(composerM20418constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            Alignment.Vertical centerVertically = companion.getCenterVertically();
            Modifier.Companion companion3 = Modifier.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), centerVertically, composerStartRestartGroup, 48);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion3);
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
            Updater.m20425setimpl(composerM20418constructorimpl2, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m20425setimpl(composerM20418constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
            if (composerM20418constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM20418constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM20418constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM20418constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m20425setimpl(composerM20418constructorimpl2, modifierMaterializeModifier2, companion2.getSetModifier());
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            float f10 = 600;
            DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
            ImageKt.Image(PainterResources_androidKt.painterResource(R.mipmap.ic_star, composerStartRestartGroup, 6), (String) null, SizeKt.m17728size3ABfNKs(companion3, C3127Dp.m23561constructorimpl((6 / f10) * (RangesKt.coerceAtLeast(displayMetrics.widthPixels, displayMetrics.heightPixels) / Resources.getSystem().getDisplayMetrics().density))), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 432, 120);
            DisplayMetrics displayMetrics2 = Resources.getSystem().getDisplayMetrics();
            SpacerKt.Spacer(SizeKt.m17728size3ABfNKs(companion3, C3127Dp.m23561constructorimpl((4 / f10) * (RangesKt.coerceAtLeast(displayMetrics2.widthPixels, displayMetrics2.heightPixels) / Resources.getSystem().getDisplayMetrics().density))), composerStartRestartGroup, 6);
            DisplayMetrics displayMetrics3 = Resources.getSystem().getDisplayMetrics();
            TextKt.m19430Text4IGK_g("科目：", SizeKt.m17733width3ABfNKs(companion3, C3127Dp.m23561constructorimpl((30 / f10) * (RangesKt.coerceAtLeast(displayMetrics3.widthPixels, displayMetrics3.heightPixels) / Resources.getSystem().getDisplayMetrics().density))), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ColorKt.Color(4284111450L), AbstractC8709e.m14344k(8), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777212, (DefaultConstructorMarker) null), composerStartRestartGroup, 54, 0, 65532);
            composerStartRestartGroup = composerStartRestartGroup;
            AbstractC7373b0.m11813e(null, list2, j10, function1, composerStartRestartGroup, (i12 & PointerIconCompat.TYPE_TEXT) | ((i12 >> 3) & 7168), 1);
            composerStartRestartGroup.endNode();
            DisplayMetrics displayMetrics4 = Resources.getSystem().getDisplayMetrics();
            SpacerKt.Spacer(SizeKt.m17714height3ABfNKs(companion3, C3127Dp.m23561constructorimpl((5 / f10) * (RangesKt.coerceAtLeast(displayMetrics4.widthPixels, displayMetrics4.heightPixels) / Resources.getSystem().getDisplayMetrics().density))), composerStartRestartGroup, 6);
            DisplayMetrics displayMetrics5 = Resources.getSystem().getDisplayMetrics();
            Modifier modifierM17714height3ABfNKs = SizeKt.m17714height3ABfNKs(companion3, C3127Dp.m23561constructorimpl((10 / f10) * (RangesKt.coerceAtLeast(displayMetrics5.widthPixels, displayMetrics5.heightPixels) / Resources.getSystem().getDisplayMetrics().density)));
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
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            if (z9) {
                composerStartRestartGroup.startReplaceGroup(921439961);
                DisplayMetrics displayMetrics6 = Resources.getSystem().getDisplayMetrics();
                TextKt.m19430Text4IGK_g("科目变更后将移动错题至目标科目文件夹下", PaddingKt.m17685paddingqDBjuR0$default(companion3, C3127Dp.m23561constructorimpl((40 / f10) * (RangesKt.coerceAtLeast(displayMetrics6.widthPixels, displayMetrics6.heightPixels) / Resources.getSystem().getDisplayMetrics().density)), 0.0f, 0.0f, 0.0f, 14, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ColorKt.Color(4284111450L), AbstractC8709e.m14344k(7), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777212, (DefaultConstructorMarker) null), composerStartRestartGroup, 54, 0, 65532);
                composerStartRestartGroup = composerStartRestartGroup;
            } else {
                composerStartRestartGroup.startReplaceGroup(916280352);
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier3 = modifier2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: z5.c0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AbstractC10003i0.m16818M(modifier3, list, j10, z9, function1, i10, i11, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: M */
    public static final Unit m16818M(Modifier modifier, List list, long j10, boolean z9, Function1 function1, int i10, int i11, Composer composer, int i12) {
        m16817L(modifier, list, j10, z9, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i10 | 1), i11);
        return Unit.INSTANCE;
    }

    /* renamed from: q */
    public static final void m16835q(Modifier modifier, final Function0 function0, final Function0 function02, Composer composer, final int i10, final int i11) {
        Modifier modifier2;
        int i12;
        Composer composer2;
        final Modifier modifier3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-21223987);
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
                ComposerKt.traceEventStart(-21223987, i12, -1, "com.zykj.evaluation.ui.detail.mistake.MainButtonView (MistakeMainView.kt:451)");
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
            long jColor = ColorKt.Color(4291611852L);
            float f13 = 12 / f10;
            DisplayMetrics displayMetrics3 = Resources.getSystem().getDisplayMetrics();
            Modifier modifierM12480g = AbstractC7593i.m12480g(BackgroundKt.m17189backgroundbw27NRU(modifierM17730sizeVpY3zN4, jColor, RoundedCornerShapeKt.m17974RoundedCornerShape0680j_4(C3127Dp.m23561constructorimpl((RangesKt.coerceAtLeast(displayMetrics3.widthPixels, displayMetrics3.heightPixels) / Resources.getSystem().getDisplayMetrics().density) * f13))), false, function0, 1, null);
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
            TextKt.m19430Text4IGK_g("取消", boxScopeInstance.align(companion3, companion.getCenter()), ColorKt.Color(4284111450L), AbstractC8709e.m14344k(7), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 3462, 0, 131056);
            composerStartRestartGroup.endNode();
            float f14 = 22 / f10;
            DisplayMetrics displayMetrics4 = Resources.getSystem().getDisplayMetrics();
            SpacerKt.Spacer(SizeKt.m17733width3ABfNKs(companion3, C3127Dp.m23561constructorimpl(f14 * (RangesKt.coerceAtLeast(displayMetrics4.widthPixels, displayMetrics4.heightPixels) / Resources.getSystem().getDisplayMetrics().density))), composerStartRestartGroup, 6);
            DisplayMetrics displayMetrics5 = Resources.getSystem().getDisplayMetrics();
            float fM23561constructorimpl2 = C3127Dp.m23561constructorimpl(f11 * (RangesKt.coerceAtLeast(displayMetrics5.widthPixels, displayMetrics5.heightPixels) / Resources.getSystem().getDisplayMetrics().density));
            DisplayMetrics displayMetrics6 = Resources.getSystem().getDisplayMetrics();
            Modifier modifierM17730sizeVpY3zN42 = SizeKt.m17730sizeVpY3zN4(companion3, fM23561constructorimpl2, C3127Dp.m23561constructorimpl(f12 * (RangesKt.coerceAtLeast(displayMetrics6.widthPixels, displayMetrics6.heightPixels) / Resources.getSystem().getDisplayMetrics().density)));
            long jM11585i = AbstractC7305a.m11585i();
            DisplayMetrics displayMetrics7 = Resources.getSystem().getDisplayMetrics();
            Modifier modifierM12480g2 = AbstractC7593i.m12480g(BackgroundKt.m17189backgroundbw27NRU(modifierM17730sizeVpY3zN42, jM11585i, RoundedCornerShapeKt.m17974RoundedCornerShape0680j_4(C3127Dp.m23561constructorimpl(f13 * (RangesKt.coerceAtLeast(displayMetrics7.widthPixels, displayMetrics7.heightPixels) / Resources.getSystem().getDisplayMetrics().density)))), false, function02, 1, null);
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
            TextKt.m19430Text4IGK_g("确认", boxScopeInstance.align(companion3, companion.getCenter()), Color.INSTANCE.m21013getWhite0d7_KjU(), AbstractC8709e.m14344k(7), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 3462, 0, 131056);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: z5.d0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AbstractC10003i0.m16836r(modifier3, function0, function02, i10, i11, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: r */
    public static final Unit m16836r(Modifier modifier, Function0 function0, Function0 function02, int i10, int i11, Composer composer, int i12) {
        m16835q(modifier, function0, function02, composer, RecomposeScopeImplKt.updateChangedFlags(i10 | 1), i11);
        return Unit.INSTANCE;
    }

    /* renamed from: s */
    public static final void m16837s(Modifier modifier, final List topicList, final long j10, final boolean z9, final String title, final List stemList, final Function1 onClickStem, final List selectedTagList, final Function1 onTopicSelected, final Function1 onTitleChange, final Function1 onClickTag, final Function0 onClickCancel, final Function0 onClickConfirm, final Function1 onClickDeleteStem, Composer composer, final int i10, final int i11, final int i12) {
        Modifier modifier2;
        int i13;
        int i14;
        Composer composer2;
        final Modifier modifier3;
        Intrinsics.checkNotNullParameter(topicList, "topicList");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(stemList, "stemList");
        Intrinsics.checkNotNullParameter(onClickStem, "onClickStem");
        Intrinsics.checkNotNullParameter(selectedTagList, "selectedTagList");
        Intrinsics.checkNotNullParameter(onTopicSelected, "onTopicSelected");
        Intrinsics.checkNotNullParameter(onTitleChange, "onTitleChange");
        Intrinsics.checkNotNullParameter(onClickTag, "onClickTag");
        Intrinsics.checkNotNullParameter(onClickCancel, "onClickCancel");
        Intrinsics.checkNotNullParameter(onClickConfirm, "onClickConfirm");
        Intrinsics.checkNotNullParameter(onClickDeleteStem, "onClickDeleteStem");
        Composer composerStartRestartGroup = composer.startRestartGroup(275695089);
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
            i13 |= composerStartRestartGroup.changedInstance(topicList) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i13 |= composerStartRestartGroup.changed(j10) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i13 |= composerStartRestartGroup.changed(z9) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i13 |= composerStartRestartGroup.changed(title) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i13 |= composerStartRestartGroup.changedInstance(stemList) ? 131072 : 65536;
        }
        if ((1572864 & i10) == 0) {
            i13 |= composerStartRestartGroup.changedInstance(onClickStem) ? 1048576 : 524288;
        }
        if ((12582912 & i10) == 0) {
            i13 |= composerStartRestartGroup.changedInstance(selectedTagList) ? 8388608 : 4194304;
        }
        if ((100663296 & i10) == 0) {
            i13 |= composerStartRestartGroup.changedInstance(onTopicSelected) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        if ((805306368 & i10) == 0) {
            i13 |= composerStartRestartGroup.changedInstance(onTitleChange) ? 536870912 : 268435456;
        }
        int i16 = i13;
        if ((i11 & 6) == 0) {
            i14 = i11 | (composerStartRestartGroup.changedInstance(onClickTag) ? 4 : 2);
        } else {
            i14 = i11;
        }
        if ((i11 & 48) == 0) {
            i14 |= composerStartRestartGroup.changedInstance(onClickCancel) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i14 |= composerStartRestartGroup.changedInstance(onClickConfirm) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i14 |= composerStartRestartGroup.changedInstance(onClickDeleteStem) ? 2048 : 1024;
        }
        int i17 = i14;
        if (composerStartRestartGroup.shouldExecute(((i16 & 306783379) == 306783378 && (i17 & 1171) == 1170) ? false : true, i16 & 1)) {
            Modifier modifier4 = i15 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(275695089, i16, i17, "com.zykj.evaluation.ui.detail.mistake.MainContent (MistakeMainView.kt:63)");
            }
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top2 = arrangement.getTop();
            Alignment.Companion companion = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top2, companion.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier4);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Modifier modifier5 = modifier4;
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
            Updater.m20425setimpl(composerM20418constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m20425setimpl(composerM20418constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM20418constructorimpl.getInserting() || !Intrinsics.areEqual(composerM20418constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM20418constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM20418constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m20425setimpl(composerM20418constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            AbstractC7407s0.m11898c("添加错题", 0, onClickCancel, composerStartRestartGroup, ((i17 << 3) & 896) | 6, 2);
            Modifier.Companion companion3 = Modifier.INSTANCE;
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion3, 0.0f, 1, null);
            float f10 = 600;
            DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
            Modifier modifierM17683paddingVpY3zN4$default = PaddingKt.m17683paddingVpY3zN4$default(modifierFillMaxSize$default, C3127Dp.m23561constructorimpl((115 / f10) * (RangesKt.coerceAtLeast(displayMetrics.widthPixels, displayMetrics.heightPixels) / Resources.getSystem().getDisplayMetrics().density)), 0.0f, 2, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM17683paddingVpY3zN4$default);
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
            float f11 = 30 / f10;
            DisplayMetrics displayMetrics2 = Resources.getSystem().getDisplayMetrics();
            SpacerKt.Spacer(SizeKt.m17714height3ABfNKs(companion3, C3127Dp.m23561constructorimpl((RangesKt.coerceAtLeast(displayMetrics2.widthPixels, displayMetrics2.heightPixels) / Resources.getSystem().getDisplayMetrics().density) * f11)), composerStartRestartGroup, 6);
            int i18 = i16 >> 12;
            m16817L(null, topicList, j10, z9, onTopicSelected, composerStartRestartGroup, (57344 & i18) | (i16 & 8176), 1);
            float f12 = 10 / f10;
            DisplayMetrics displayMetrics3 = Resources.getSystem().getDisplayMetrics();
            SpacerKt.Spacer(SizeKt.m17714height3ABfNKs(companion3, C3127Dp.m23561constructorimpl((RangesKt.coerceAtLeast(displayMetrics3.widthPixels, displayMetrics3.heightPixels) / Resources.getSystem().getDisplayMetrics().density) * f12)), composerStartRestartGroup, 6);
            m16813H(null, title, onTitleChange, composerStartRestartGroup, ((i16 >> 9) & 112) | ((i16 >> 21) & 896), 1);
            float f13 = 4 / f10;
            DisplayMetrics displayMetrics4 = Resources.getSystem().getDisplayMetrics();
            SpacerKt.Spacer(SizeKt.m17714height3ABfNKs(companion3, C3127Dp.m23561constructorimpl((RangesKt.coerceAtLeast(displayMetrics4.widthPixels, displayMetrics4.heightPixels) / Resources.getSystem().getDisplayMetrics().density) * f13)), composerStartRestartGroup, 6);
            DisplayMetrics displayMetrics5 = Resources.getSystem().getDisplayMetrics();
            m16839u(PaddingKt.m17681padding3ABfNKs(companion3, C3127Dp.m23561constructorimpl((RangesKt.coerceAtLeast(displayMetrics5.widthPixels, displayMetrics5.heightPixels) / Resources.getSystem().getDisplayMetrics().density) * f12)), stemList, onClickStem, onClickDeleteStem, composerStartRestartGroup, (i18 & 112) | 6 | (i18 & 896) | (i17 & 7168), 0);
            composer2 = composerStartRestartGroup;
            DisplayMetrics displayMetrics6 = Resources.getSystem().getDisplayMetrics();
            SpacerKt.Spacer(SizeKt.m17714height3ABfNKs(companion3, C3127Dp.m23561constructorimpl(f13 * (RangesKt.coerceAtLeast(displayMetrics6.widthPixels, displayMetrics6.heightPixels) / Resources.getSystem().getDisplayMetrics().density))), composer2, 6);
            float f14 = 350 / f10;
            DisplayMetrics displayMetrics7 = Resources.getSystem().getDisplayMetrics();
            Modifier modifierM17733width3ABfNKs = SizeKt.m17733width3ABfNKs(companion3, C3127Dp.m23561constructorimpl(f14 * (RangesKt.coerceAtLeast(displayMetrics7.widthPixels, displayMetrics7.heightPixels) / Resources.getSystem().getDisplayMetrics().density)));
            DisplayMetrics displayMetrics8 = Resources.getSystem().getDisplayMetrics();
            m16809D(PaddingKt.m17681padding3ABfNKs(modifierM17733width3ABfNKs, C3127Dp.m23561constructorimpl(f12 * (RangesKt.coerceAtLeast(displayMetrics8.widthPixels, displayMetrics8.heightPixels) / Resources.getSystem().getDisplayMetrics().density))), selectedTagList, onClickTag, composer2, ((i16 >> 18) & 112) | 6 | ((i17 << 6) & 896), 0);
            SpacerKt.Spacer(ColumnScope.weight$default(columnScopeInstance, companion3, 1.0f, false, 2, null), composer2, 0);
            m16835q(columnScopeInstance.align(companion3, companion.getCenterHorizontally()), onClickCancel, onClickConfirm, composer2, i17 & PointerIconCompat.TYPE_TEXT, 0);
            DisplayMetrics displayMetrics9 = Resources.getSystem().getDisplayMetrics();
            SpacerKt.Spacer(SizeKt.m17714height3ABfNKs(companion3, C3127Dp.m23561constructorimpl(f11 * (RangesKt.coerceAtLeast(displayMetrics9.widthPixels, displayMetrics9.heightPixels) / Resources.getSystem().getDisplayMetrics().density))), composer2, 6);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: z5.s
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AbstractC10003i0.m16838t(modifier3, topicList, j10, z9, title, stemList, onClickStem, selectedTagList, onTopicSelected, onTitleChange, onClickTag, onClickCancel, onClickConfirm, onClickDeleteStem, i10, i11, i12, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: t */
    public static final Unit m16838t(Modifier modifier, List list, long j10, boolean z9, String str, List list2, Function1 function1, List list3, Function1 function12, Function1 function13, Function1 function14, Function0 function0, Function0 function02, Function1 function15, int i10, int i11, int i12, Composer composer, int i13) {
        m16837s(modifier, list, j10, z9, str, list2, function1, list3, function12, function13, function14, function0, function02, function15, composer, RecomposeScopeImplKt.updateChangedFlags(i10 | 1), RecomposeScopeImplKt.updateChangedFlags(i11), i12);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* renamed from: u */
    public static final void m16839u(Modifier modifier, final List list, final Function1 function1, final Function1 function12, Composer composer, final int i10, final int i11) {
        Modifier modifier2;
        int i12;
        final Modifier modifier3;
        Modifier modifier4;
        float f10;
        Modifier.Companion companion;
        int i13;
        int i14;
        final Function1 function13 = function1;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1811066811);
        int i15 = i11 & 1;
        if (i15 != 0) {
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
            i12 |= composerStartRestartGroup.changedInstance(list) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i12 |= composerStartRestartGroup.changedInstance(function13) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i12 |= composerStartRestartGroup.changedInstance(function12) ? 2048 : 1024;
        }
        if (composerStartRestartGroup.shouldExecute((i12 & 1171) != 1170, i12 & 1)) {
            Modifier modifier5 = i15 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1811066811, i12, -1, "com.zykj.evaluation.ui.detail.mistake.StemView (MistakeMainView.kt:264)");
            }
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top2 = arrangement.getTop();
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top2, companion2.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier5);
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
            Updater.m20425setimpl(composerM20418constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m20425setimpl(composerM20418constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (composerM20418constructorimpl.getInserting() || !Intrinsics.areEqual(composerM20418constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM20418constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM20418constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m20425setimpl(composerM20418constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            Alignment.Vertical centerVertically = companion2.getCenterVertically();
            Modifier.Companion companion4 = Modifier.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), centerVertically, composerStartRestartGroup, 48);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion4);
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
            float f11 = 600;
            float f12 = 30 / f11;
            DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
            int i16 = i12;
            ?? r02 = 0;
            TextKt.m19430Text4IGK_g("题干：", SizeKt.m17733width3ABfNKs(companion4, C3127Dp.m23561constructorimpl((RangesKt.coerceAtLeast(displayMetrics.widthPixels, displayMetrics.heightPixels) / Resources.getSystem().getDisplayMetrics().density) * f12)), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ColorKt.Color(4284111450L), AbstractC8709e.m14344k(8), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777212, (DefaultConstructorMarker) null), composerStartRestartGroup, 54, 0, 65532);
            Composer composer2 = composerStartRestartGroup;
            composer2.startReplaceGroup(-1096307447);
            final int i17 = 0;
            for (Object obj : list) {
                int i18 = i17 + 1;
                if (i17 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                final C9993f c9993f = (C9993f) obj;
                Modifier.Companion companion5 = Modifier.INSTANCE;
                float f13 = 60 / f11;
                DisplayMetrics displayMetrics2 = Resources.getSystem().getDisplayMetrics();
                float fM23561constructorimpl = C3127Dp.m23561constructorimpl((RangesKt.coerceAtLeast(displayMetrics2.widthPixels, displayMetrics2.heightPixels) / Resources.getSystem().getDisplayMetrics().density) * f13);
                DisplayMetrics displayMetrics3 = Resources.getSystem().getDisplayMetrics();
                Modifier modifierM17732sizeInqDBjuR0$default = SizeKt.m17732sizeInqDBjuR0$default(companion5, 0.0f, 0.0f, fM23561constructorimpl, C3127Dp.m23561constructorimpl(f13 * (RangesKt.coerceAtLeast(displayMetrics3.widthPixels, displayMetrics3.heightPixels) / Resources.getSystem().getDisplayMetrics().density)), 3, null);
                Alignment.Companion companion6 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion6.getTopStart(), r02);
                int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer2, r02);
                CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer2, modifierM17732sizeInqDBjuR0$default);
                ComposeUiNode.Companion companion7 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor3 = companion7.getConstructor();
                if (composer2.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor3);
                } else {
                    composer2.useNode();
                }
                Composer composerM20418constructorimpl3 = Updater.m20418constructorimpl(composer2);
                Updater.m20425setimpl(composerM20418constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy, companion7.getSetMeasurePolicy());
                Updater.m20425setimpl(composerM20418constructorimpl3, currentCompositionLocalMap3, companion7.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion7.getSetCompositeKeyHash();
                if (composerM20418constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM20418constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                    composerM20418constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                    composerM20418constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                }
                Updater.m20425setimpl(composerM20418constructorimpl3, modifierMaterializeModifier3, companion7.getSetModifier());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                if (c9993f.m16803c().length() > 0) {
                    composer2.startReplaceGroup(-1133159907);
                    Modifier modifierAlign = boxScopeInstance.align(companion5, companion6.getCenter());
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion6.getTopStart(), r02);
                    int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer2, r02);
                    CompositionLocalMap currentCompositionLocalMap4 = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composer2, modifierAlign);
                    Function0<ComposeUiNode> constructor4 = companion7.getConstructor();
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
                    Updater.m20425setimpl(composerM20418constructorimpl4, measurePolicyMaybeCachedBoxMeasurePolicy2, companion7.getSetMeasurePolicy());
                    Updater.m20425setimpl(composerM20418constructorimpl4, currentCompositionLocalMap4, companion7.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = companion7.getSetCompositeKeyHash();
                    if (composerM20418constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM20418constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                        composerM20418constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                        composerM20418constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                    }
                    Updater.m20425setimpl(composerM20418constructorimpl4, modifierMaterializeModifier4, companion7.getSetModifier());
                    Modifier modifierAlign2 = boxScopeInstance.align(companion5, companion6.getBottomStart());
                    float f14 = 5 / f11;
                    DisplayMetrics displayMetrics4 = Resources.getSystem().getDisplayMetrics();
                    float fM23561constructorimpl2 = C3127Dp.m23561constructorimpl((RangesKt.coerceAtLeast(displayMetrics4.widthPixels, displayMetrics4.heightPixels) / Resources.getSystem().getDisplayMetrics().density) * f14);
                    DisplayMetrics displayMetrics5 = Resources.getSystem().getDisplayMetrics();
                    Modifier modifierM17685paddingqDBjuR0$default = PaddingKt.m17685paddingqDBjuR0$default(modifierAlign2, 0.0f, fM23561constructorimpl2, C3127Dp.m23561constructorimpl(f14 * (RangesKt.coerceAtLeast(displayMetrics5.widthPixels, displayMetrics5.heightPixels) / Resources.getSystem().getDisplayMetrics().density)), 0.0f, 9, null);
                    float fM23561constructorimpl3 = C3127Dp.m23561constructorimpl(1);
                    long jColor = ColorKt.Color(4291611852L);
                    float f15 = 2 / f11;
                    DisplayMetrics displayMetrics6 = Resources.getSystem().getDisplayMetrics();
                    modifier4 = modifier5;
                    Modifier modifierM17201borderxT4_qwU = BorderKt.m17201borderxT4_qwU(modifierM17685paddingqDBjuR0$default, fM23561constructorimpl3, jColor, RoundedCornerShapeKt.m17974RoundedCornerShape0680j_4(C3127Dp.m23561constructorimpl((RangesKt.coerceAtLeast(displayMetrics6.widthPixels, displayMetrics6.heightPixels) / Resources.getSystem().getDisplayMetrics().density) * f15)));
                    DisplayMetrics displayMetrics7 = Resources.getSystem().getDisplayMetrics();
                    Modifier modifierClip = ClipKt.clip(modifierM17201borderxT4_qwU, RoundedCornerShapeKt.m17974RoundedCornerShape0680j_4(C3127Dp.m23561constructorimpl(f15 * (RangesKt.coerceAtLeast(displayMetrics7.widthPixels, displayMetrics7.heightPixels) / Resources.getSystem().getDisplayMetrics().density))));
                    i13 = i16;
                    boolean zChanged = ((i13 & 896) == 256) | composer2.changed(i17);
                    Object objRememberedValue = composer2.rememberedValue();
                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function0() { // from class: z5.e0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return AbstractC10003i0.m16840v(function13, i17);
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue);
                    }
                    Composer composer3 = composer2;
                    f10 = f11;
                    companion = companion5;
                    AbstractC5177c.m2945a(c9993f.m16803c(), null, AbstractC7593i.m12480g(modifierClip, false, (Function0) objRememberedValue, 1, null), null, null, null, null, 0.0f, null, 0, false, composer3, 48, 0, 2040);
                    composer2 = composer3;
                    if (c9993f.m16805e()) {
                        i14 = 6;
                        composer2.startReplaceGroup(1652267785);
                    } else {
                        composer2.startReplaceGroup(1661944187);
                        float f16 = 11 / f10;
                        DisplayMetrics displayMetrics8 = Resources.getSystem().getDisplayMetrics();
                        float fM23561constructorimpl4 = C3127Dp.m23561constructorimpl((RangesKt.coerceAtLeast(displayMetrics8.widthPixels, displayMetrics8.heightPixels) / Resources.getSystem().getDisplayMetrics().density) * f16);
                        DisplayMetrics displayMetrics9 = Resources.getSystem().getDisplayMetrics();
                        Modifier modifierAlign3 = boxScopeInstance.align(SizeKt.m17730sizeVpY3zN4(companion, fM23561constructorimpl4, C3127Dp.m23561constructorimpl(f16 * (RangesKt.coerceAtLeast(displayMetrics9.widthPixels, displayMetrics9.heightPixels) / Resources.getSystem().getDisplayMetrics().density))), companion6.getTopEnd());
                        boolean zChanged2 = composer2.changed(c9993f) | ((i13 & 7168) == 2048);
                        Object objRememberedValue2 = composer2.rememberedValue();
                        if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new Function0() { // from class: z5.f0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return AbstractC10003i0.m16841w(function12, c9993f);
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue2);
                        }
                        Modifier modifierM12480g = AbstractC7593i.m12480g(modifierAlign3, false, (Function0) objRememberedValue2, 1, null);
                        i14 = 6;
                        ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.icon_item_mistake_tag, composer2, 6), (String) null, modifierM12480g, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, 48, 120);
                    }
                    composer2.endReplaceGroup();
                    composer2.endNode();
                    composer2.endReplaceGroup();
                } else {
                    modifier4 = modifier5;
                    f10 = f11;
                    companion = companion5;
                    i13 = i16;
                    i14 = 6;
                    composer2.startReplaceGroup(-1131528253);
                    Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
                    float f17 = 5 / f10;
                    DisplayMetrics displayMetrics10 = Resources.getSystem().getDisplayMetrics();
                    float fM23561constructorimpl5 = C3127Dp.m23561constructorimpl((RangesKt.coerceAtLeast(displayMetrics10.widthPixels, displayMetrics10.heightPixels) / Resources.getSystem().getDisplayMetrics().density) * f17);
                    DisplayMetrics displayMetrics11 = Resources.getSystem().getDisplayMetrics();
                    Modifier modifierM17685paddingqDBjuR0$default2 = PaddingKt.m17685paddingqDBjuR0$default(modifierFillMaxSize$default, 0.0f, fM23561constructorimpl5, C3127Dp.m23561constructorimpl(f17 * (RangesKt.coerceAtLeast(displayMetrics11.widthPixels, displayMetrics11.heightPixels) / Resources.getSystem().getDisplayMetrics().density)), 0.0f, 9, null);
                    boolean zChanged3 = ((i13 & 896) == 256) | composer2.changed(i17);
                    Object objRememberedValue3 = composer2.rememberedValue();
                    if (zChanged3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue3 = new Function0() { // from class: z5.g0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return AbstractC10003i0.m16842x(function1, i17);
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue3);
                    }
                    ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.icon_add_pic, composer2, 6), (String) null, AbstractC7593i.m12480g(modifierM17685paddingqDBjuR0$default2, false, (Function0) objRememberedValue3, 1, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, 48, 120);
                    composer2.endReplaceGroup();
                }
                composer2.endNode();
                DisplayMetrics displayMetrics12 = Resources.getSystem().getDisplayMetrics();
                SpacerKt.Spacer(SizeKt.m17733width3ABfNKs(companion, C3127Dp.m23561constructorimpl((i14 / f10) * (RangesKt.coerceAtLeast(displayMetrics12.widthPixels, displayMetrics12.heightPixels) / Resources.getSystem().getDisplayMetrics().density))), composer2, i14);
                function13 = function1;
                i16 = i13;
                i17 = i18;
                f11 = f10;
                modifier5 = modifier4;
                r02 = 0;
            }
            Modifier modifier6 = modifier5;
            float f18 = f11;
            composer2.endReplaceGroup();
            composer2.endNode();
            Modifier.Companion companion8 = Modifier.INSTANCE;
            DisplayMetrics displayMetrics13 = Resources.getSystem().getDisplayMetrics();
            SpacerKt.Spacer(SizeKt.m17714height3ABfNKs(companion8, C3127Dp.m23561constructorimpl((5 / f18) * (RangesKt.coerceAtLeast(displayMetrics13.widthPixels, displayMetrics13.heightPixels) / Resources.getSystem().getDisplayMetrics().density))), composer2, 6);
            DisplayMetrics displayMetrics14 = Resources.getSystem().getDisplayMetrics();
            Modifier modifierM17685paddingqDBjuR0$default3 = PaddingKt.m17685paddingqDBjuR0$default(companion8, C3127Dp.m23561constructorimpl((RangesKt.coerceAtLeast(displayMetrics14.widthPixels, displayMetrics14.heightPixels) / Resources.getSystem().getDisplayMetrics().density) * f12), 0.0f, 0.0f, 0.0f, 14, null);
            MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getCenterVertically(), composer2, 48);
            int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap5 = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier(composer2, modifierM17685paddingqDBjuR0$default3);
            ComposeUiNode.Companion companion9 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor5 = companion9.getConstructor();
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
            Updater.m20425setimpl(composerM20418constructorimpl5, measurePolicyRowMeasurePolicy2, companion9.getSetMeasurePolicy());
            Updater.m20425setimpl(composerM20418constructorimpl5, currentCompositionLocalMap5, companion9.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5 = companion9.getSetCompositeKeyHash();
            if (composerM20418constructorimpl5.getInserting() || !Intrinsics.areEqual(composerM20418constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                composerM20418constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                composerM20418constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
            }
            Updater.m20425setimpl(composerM20418constructorimpl5, modifierMaterializeModifier5, companion9.getSetModifier());
            RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
            float f19 = 8 / f18;
            DisplayMetrics displayMetrics15 = Resources.getSystem().getDisplayMetrics();
            float fM23561constructorimpl6 = C3127Dp.m23561constructorimpl((RangesKt.coerceAtLeast(displayMetrics15.widthPixels, displayMetrics15.heightPixels) / Resources.getSystem().getDisplayMetrics().density) * f19);
            DisplayMetrics displayMetrics16 = Resources.getSystem().getDisplayMetrics();
            ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.icon_warning, composer2, 6), (String) null, SizeKt.m17730sizeVpY3zN4(companion8, fM23561constructorimpl6, C3127Dp.m23561constructorimpl(f19 * (RangesKt.coerceAtLeast(displayMetrics16.widthPixels, displayMetrics16.heightPixels) / Resources.getSystem().getDisplayMetrics().density))), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, 432, 120);
            DisplayMetrics displayMetrics17 = Resources.getSystem().getDisplayMetrics();
            SpacerKt.Spacer(SizeKt.m17733width3ABfNKs(companion8, C3127Dp.m23561constructorimpl((2 / f18) * (RangesKt.coerceAtLeast(displayMetrics17.widthPixels, displayMetrics17.heightPixels) / Resources.getSystem().getDisplayMetrics().density))), composer2, 6);
            Composer composer4 = composer2;
            TextKt.m19430Text4IGK_g(StringResources_androidKt.stringResource(R.string.camera_tip, composer2, 6), (Modifier) null, ColorKt.Color(4287137928L), AbstractC8709e.m14344k(5), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer4, 3456, 0, 131058);
            composerStartRestartGroup = composer4;
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier6;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier3 = modifier2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: z5.h0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return AbstractC10003i0.m16843y(modifier3, list, function1, function12, i10, i11, (Composer) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    /* renamed from: v */
    public static final Unit m16840v(Function1 function1, int i10) {
        function1.invoke(Integer.valueOf(i10));
        return Unit.INSTANCE;
    }

    /* renamed from: w */
    public static final Unit m16841w(Function1 function1, C9993f c9993f) {
        function1.invoke(c9993f);
        return Unit.INSTANCE;
    }

    /* renamed from: x */
    public static final Unit m16842x(Function1 function1, int i10) {
        function1.invoke(Integer.valueOf(i10));
        return Unit.INSTANCE;
    }

    /* renamed from: y */
    public static final Unit m16843y(Modifier modifier, List list, Function1 function1, Function1 function12, int i10, int i11, Composer composer, int i12) {
        m16839u(modifier, list, function1, function12, composer, RecomposeScopeImplKt.updateChangedFlags(i10 | 1), i11);
        return Unit.INSTANCE;
    }

    /* renamed from: z */
    public static final void m16844z(String str, final Function0 function0, Composer composer, final int i10, final int i11) {
        String str2;
        int i12;
        final String str3;
        Composer composerStartRestartGroup = composer.startRestartGroup(1234727429);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
            str2 = str;
        } else if ((i10 & 6) == 0) {
            str2 = str;
            i12 = i10 | (composerStartRestartGroup.changed(str2) ? 4 : 2);
        } else {
            str2 = str;
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            i12 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i12 & 19) != 18, i12 & 1)) {
            String str4 = i13 != 0 ? null : str2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1234727429, i12, -1, "com.zykj.evaluation.ui.detail.mistake.TagItemView (MistakeMainView.kt:394)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            float f10 = 600;
            DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
            Modifier modifierM17714height3ABfNKs = SizeKt.m17714height3ABfNKs(companion, C3127Dp.m23561constructorimpl((29 / f10) * (RangesKt.coerceAtLeast(displayMetrics.widthPixels, displayMetrics.heightPixels) / Resources.getSystem().getDisplayMetrics().density)));
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM17714height3ABfNKs);
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
            if (str4 != null) {
                composerStartRestartGroup.startReplaceGroup(-1351356487);
                DisplayMetrics displayMetrics2 = Resources.getSystem().getDisplayMetrics();
                Modifier modifierM17714height3ABfNKs2 = SizeKt.m17714height3ABfNKs(companion, C3127Dp.m23561constructorimpl((24 / f10) * (RangesKt.coerceAtLeast(displayMetrics2.widthPixels, displayMetrics2.heightPixels) / Resources.getSystem().getDisplayMetrics().density)));
                DisplayMetrics displayMetrics3 = Resources.getSystem().getDisplayMetrics();
                Modifier modifierM17685paddingqDBjuR0$default = PaddingKt.m17685paddingqDBjuR0$default(modifierM17714height3ABfNKs2, 0.0f, 0.0f, C3127Dp.m23561constructorimpl((5 / f10) * (RangesKt.coerceAtLeast(displayMetrics3.widthPixels, displayMetrics3.heightPixels) / Resources.getSystem().getDisplayMetrics().density)), 0.0f, 11, null);
                long jColor = ColorKt.Color(1296537587);
                DisplayMetrics displayMetrics4 = Resources.getSystem().getDisplayMetrics();
                Modifier modifierAlign = boxScopeInstance.align(BackgroundKt.m17189backgroundbw27NRU(modifierM17685paddingqDBjuR0$default, jColor, RoundedCornerShapeKt.m17974RoundedCornerShape0680j_4(C3127Dp.m23561constructorimpl((3 / f10) * (RangesKt.coerceAtLeast(displayMetrics4.widthPixels, displayMetrics4.heightPixels) / Resources.getSystem().getDisplayMetrics().density)))), companion2.getBottomStart());
                DisplayMetrics displayMetrics5 = Resources.getSystem().getDisplayMetrics();
                Modifier modifierM17683paddingVpY3zN4$default = PaddingKt.m17683paddingVpY3zN4$default(modifierAlign, C3127Dp.m23561constructorimpl((13 / f10) * (RangesKt.coerceAtLeast(displayMetrics5.widthPixels, displayMetrics5.heightPixels) / Resources.getSystem().getDisplayMetrics().density)), 0.0f, 2, null);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM17683paddingVpY3zN4$default);
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
                Updater.m20425setimpl(composerM20418constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy2, companion3.getSetMeasurePolicy());
                Updater.m20425setimpl(composerM20418constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                if (composerM20418constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM20418constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    composerM20418constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM20418constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.m20425setimpl(composerM20418constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
                int i14 = i12;
                TextKt.m19430Text4IGK_g(str4, boxScopeInstance.align(companion, companion2.getCenter()), ColorKt.Color(4282882035L), AbstractC8709e.m14344k(7), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, (i12 & 14) | 3456, 0, 131056);
                str3 = str4;
                composerStartRestartGroup = composerStartRestartGroup;
                composerStartRestartGroup.endNode();
                float f11 = 11 / f10;
                DisplayMetrics displayMetrics6 = Resources.getSystem().getDisplayMetrics();
                float fM23561constructorimpl = C3127Dp.m23561constructorimpl((RangesKt.coerceAtLeast(displayMetrics6.widthPixels, displayMetrics6.heightPixels) / Resources.getSystem().getDisplayMetrics().density) * f11);
                DisplayMetrics displayMetrics7 = Resources.getSystem().getDisplayMetrics();
                Modifier modifierAlign2 = boxScopeInstance.align(SizeKt.m17730sizeVpY3zN4(companion, fM23561constructorimpl, C3127Dp.m23561constructorimpl(f11 * (RangesKt.coerceAtLeast(displayMetrics7.widthPixels, displayMetrics7.heightPixels) / Resources.getSystem().getDisplayMetrics().density))), companion2.getTopEnd());
                boolean z9 = (i14 & 112) == 32;
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (z9 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: z5.w
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return AbstractC10003i0.m16806A(function0);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.icon_item_mistake_tag, composerStartRestartGroup, 6), (String) null, AbstractC7593i.m12480g(modifierAlign2, false, (Function0) objRememberedValue, 1, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 48, 120);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                str3 = str4;
                composerStartRestartGroup.startReplaceGroup(-1350323474);
                DisplayMetrics displayMetrics8 = Resources.getSystem().getDisplayMetrics();
                float fM23561constructorimpl2 = C3127Dp.m23561constructorimpl((42 / f10) * (RangesKt.coerceAtLeast(displayMetrics8.widthPixels, displayMetrics8.heightPixels) / Resources.getSystem().getDisplayMetrics().density));
                float f12 = 24 / f10;
                DisplayMetrics displayMetrics9 = Resources.getSystem().getDisplayMetrics();
                Modifier modifierAlign3 = boxScopeInstance.align(SizeKt.m17730sizeVpY3zN4(companion, fM23561constructorimpl2, C3127Dp.m23561constructorimpl(f12 * (RangesKt.coerceAtLeast(displayMetrics9.widthPixels, displayMetrics9.heightPixels) / Resources.getSystem().getDisplayMetrics().density))), companion2.getBottomStart());
                DisplayMetrics displayMetrics10 = Resources.getSystem().getDisplayMetrics();
                Modifier modifierM17685paddingqDBjuR0$default2 = PaddingKt.m17685paddingqDBjuR0$default(modifierAlign3, 0.0f, 0.0f, C3127Dp.m23561constructorimpl((5 / f10) * (RangesKt.coerceAtLeast(displayMetrics10.widthPixels, displayMetrics10.heightPixels) / Resources.getSystem().getDisplayMetrics().density)), 0.0f, 11, null);
                boolean z10 = (i12 & 112) == 32;
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (z10 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function0() { // from class: z5.x
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return AbstractC10003i0.m16807B(function0);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.icon_mistake_tag_add, composerStartRestartGroup, 6), (String) null, AbstractC7593i.m12480g(modifierM17685paddingqDBjuR0$default2, false, (Function0) objRememberedValue2, 1, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 48, 120);
                composerStartRestartGroup.endReplaceGroup();
            }
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            str3 = str2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: z5.y
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AbstractC10003i0.m16808C(str3, function0, i10, i11, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
