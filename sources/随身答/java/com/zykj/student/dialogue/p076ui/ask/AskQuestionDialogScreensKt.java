package com.zykj.student.dialogue.p076ui.ask;

import android.content.res.Resources;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.MenuKt;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p012ui.Alignment;
import androidx.compose.p012ui.ComposedModifierKt;
import androidx.compose.p012ui.Modifier;
import androidx.compose.p012ui.draw.ClipKt;
import androidx.compose.p012ui.graphics.Color;
import androidx.compose.p012ui.graphics.ColorFilter;
import androidx.compose.p012ui.layout.ContentScale;
import androidx.compose.p012ui.layout.LayoutKt;
import androidx.compose.p012ui.layout.MeasurePolicy;
import androidx.compose.p012ui.layout.MeasureResult;
import androidx.compose.p012ui.layout.MeasureScope;
import androidx.compose.p012ui.layout.Placeable;
import androidx.compose.p012ui.node.ComposeUiNode;
import androidx.compose.p012ui.platform.CompositionLocalsKt;
import androidx.compose.p012ui.res.PainterResources_androidKt;
import androidx.compose.p012ui.res.StringResources_androidKt;
import androidx.compose.p012ui.semantics.SemanticsModifierKt;
import androidx.compose.p012ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p012ui.text.TextLayoutResult;
import androidx.compose.p012ui.text.TextStyle;
import androidx.compose.p012ui.text.font.FontFamily;
import androidx.compose.p012ui.text.font.FontStyle;
import androidx.compose.p012ui.text.font.FontWeight;
import androidx.compose.p012ui.text.style.TextAlign;
import androidx.compose.p012ui.text.style.TextDecoration;
import androidx.compose.p012ui.unit.C3115Dp;
import androidx.compose.p012ui.unit.Density;
import androidx.compose.p012ui.unit.IntSize;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.constraintlayout.compose.ConstrainScope;
import androidx.constraintlayout.compose.ConstrainedLayoutReference;
import androidx.constraintlayout.compose.ConstraintLayoutScope;
import androidx.constraintlayout.compose.ConstraintSetForInlineDsl;
import androidx.constraintlayout.compose.Dimension;
import androidx.constraintlayout.compose.HorizontalAnchorable;
import androidx.constraintlayout.compose.Measurer2;
import androidx.constraintlayout.compose.ToolingUtilsKt;
import androidx.constraintlayout.compose.VerticalAnchorable;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.zykj.student.dialogue.R;
import com.zykj.student.dialogue.p076ui.ask.AskQuestionDialogScreensKt;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import p138i6.AbstractC8136b;
import p274v6.AbstractC9768a;
import p294x6.AbstractC9892g;

/* loaded from: classes5.dex */
public abstract class AskQuestionDialogScreensKt {

    /* renamed from: com.zykj.student.dialogue.ui.ask.AskQuestionDialogScreensKt$a */
    public static final class C7469a implements Function1 {

        /* renamed from: a */
        public final /* synthetic */ ConstrainedLayoutReference f10650a;

        public C7469a(ConstrainedLayoutReference constrainedLayoutReference) {
            this.f10650a = constrainedLayoutReference;
        }

        /* renamed from: a */
        public final void m10060a(ConstrainScope constrainAs) {
            Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
            VerticalAnchorable.m24467linkToVpY3zN4$default(constrainAs.getStart(), constrainAs.getParent().getStart(), 0.0f, 0.0f, 6, null);
            VerticalAnchorable.m24467linkToVpY3zN4$default(constrainAs.getEnd(), this.f10650a.getStart(), 0.0f, 0.0f, 6, null);
            constrainAs.setWidth(Dimension.INSTANCE.percent(0.5f));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m10060a((ConstrainScope) obj);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.zykj.student.dialogue.ui.ask.AskQuestionDialogScreensKt$b */
    public static final class C7470b implements Function1 {

        /* renamed from: a */
        public final /* synthetic */ ConstrainedLayoutReference f10651a;

        public C7470b(ConstrainedLayoutReference constrainedLayoutReference) {
            this.f10651a = constrainedLayoutReference;
        }

        /* renamed from: a */
        public final void m10061a(ConstrainScope constrainAs) {
            Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
            VerticalAnchorable.m24467linkToVpY3zN4$default(constrainAs.getStart(), constrainAs.getParent().getStart(), 0.0f, 0.0f, 6, null);
            VerticalAnchorable.m24467linkToVpY3zN4$default(constrainAs.getEnd(), constrainAs.getParent().getEnd(), 0.0f, 0.0f, 6, null);
            HorizontalAnchorable.m24370linkToVpY3zN4$default(constrainAs.getTop(), this.f10651a.getTop(), 0.0f, 0.0f, 6, (Object) null);
            HorizontalAnchorable.m24370linkToVpY3zN4$default(constrainAs.getBottom(), this.f10651a.getBottom(), 0.0f, 0.0f, 6, (Object) null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m10061a((ConstrainScope) obj);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.zykj.student.dialogue.ui.ask.AskQuestionDialogScreensKt$c */
    public static final class C7471c implements Function1 {

        /* renamed from: a */
        public final /* synthetic */ ConstrainedLayoutReference f10652a;

        public C7471c(ConstrainedLayoutReference constrainedLayoutReference) {
            this.f10652a = constrainedLayoutReference;
        }

        /* renamed from: a */
        public final void m10062a(ConstrainScope constrainAs) {
            Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
            VerticalAnchorable.m24467linkToVpY3zN4$default(constrainAs.getStart(), this.f10652a.getEnd(), 0.0f, 0.0f, 6, null);
            VerticalAnchorable.m24467linkToVpY3zN4$default(constrainAs.getEnd(), constrainAs.getParent().getEnd(), 0.0f, 0.0f, 6, null);
            constrainAs.setWidth(Dimension.INSTANCE.percent(0.5f));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m10062a((ConstrainScope) obj);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.zykj.student.dialogue.ui.ask.AskQuestionDialogScreensKt$d */
    public static final class C7472d implements Function1 {

        /* renamed from: a */
        public final /* synthetic */ ConstrainedLayoutReference f10653a;

        public C7472d(ConstrainedLayoutReference constrainedLayoutReference) {
            this.f10653a = constrainedLayoutReference;
        }

        /* renamed from: a */
        public final void m10063a(ConstrainScope constrainAs) {
            Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
            HorizontalAnchorable.m24370linkToVpY3zN4$default(constrainAs.getTop(), this.f10653a.getBottom(), 0.0f, 0.0f, 6, (Object) null);
            HorizontalAnchorable.m24370linkToVpY3zN4$default(constrainAs.getBottom(), constrainAs.getParent().getBottom(), 0.0f, 0.0f, 6, (Object) null);
            VerticalAnchorable.m24467linkToVpY3zN4$default(constrainAs.getStart(), constrainAs.getParent().getStart(), 0.0f, 0.0f, 6, null);
            VerticalAnchorable.m24467linkToVpY3zN4$default(constrainAs.getEnd(), constrainAs.getParent().getEnd(), 0.0f, 0.0f, 6, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m10063a((ConstrainScope) obj);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: e */
    public static final void m10053e(Modifier modifier, final Function0 onClickAskQuestion, Composer composer, final int i9, final int i10) throws Resources.NotFoundException {
        final Modifier modifier2;
        int i11;
        Composer composer2;
        Intrinsics.checkNotNullParameter(onClickAskQuestion, "onClickAskQuestion");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1213096228);
        int i12 = i10 & 1;
        if (i12 != 0) {
            i11 = i9 | 6;
            modifier2 = modifier;
        } else if ((i9 & 6) == 0) {
            modifier2 = modifier;
            i11 = i9 | (composerStartRestartGroup.changed(modifier2) ? 4 : 2);
        } else {
            modifier2 = modifier;
            i11 = i9;
        }
        if ((i9 & 48) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(onClickAskQuestion) ? 32 : 16;
        }
        int i13 = i11;
        if (composerStartRestartGroup.shouldExecute((i13 & 19) != 18, i13 & 1)) {
            Modifier modifier3 = i12 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1213096228, i13, -1, "com.zykj.student.dialogue.ui.ask.AskDirect (AskQuestionDialogScreens.kt:200)");
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
            Composer composerM20851constructorimpl = Updater.m20851constructorimpl(composerStartRestartGroup);
            Updater.m20858setimpl(composerM20851constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m20858setimpl(composerM20851constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM20851constructorimpl.getInserting() || !Intrinsics.areEqual(composerM20851constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM20851constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM20851constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m20858setimpl(composerM20851constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            Modifier.Companion companion3 = Modifier.INSTANCE;
            float f10 = 600;
            SpacerKt.Spacer(SizeKt.m18147height3ABfNKs(companion3, C3115Dp.m23994constructorimpl((27 / f10) * (Resources.getSystem().getDisplayMetrics().widthPixels / Resources.getSystem().getDisplayMetrics().density))), composerStartRestartGroup, 6);
            Modifier modifier4 = modifier3;
            ImageKt.Image(PainterResources_androidKt.painterResource(R.mipmap.dialogue_ask_edit, composerStartRestartGroup, 0), (String) null, columnScopeInstance.align(SizeKt.m18161size3ABfNKs(companion3, C3115Dp.m23994constructorimpl((64 / f10) * (Resources.getSystem().getDisplayMetrics().widthPixels / Resources.getSystem().getDisplayMetrics().density))), companion.getCenterHorizontally()), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 48, MenuKt.InTransitionDuration);
            SpacerKt.Spacer(SizeKt.m18147height3ABfNKs(companion3, C3115Dp.m23994constructorimpl((3 / f10) * (Resources.getSystem().getDisplayMetrics().widthPixels / Resources.getSystem().getDisplayMetrics().density))), composerStartRestartGroup, 6);
            String strStringResource = StringResources_androidKt.stringResource(R.string.dialogue_ask_direct, composerStartRestartGroup, 0);
            long jM13036d = AbstractC8136b.m13036d(8);
            long jM16542d = AbstractC9768a.m16542d();
            FontWeight.Companion companion4 = FontWeight.INSTANCE;
            TextKt.m19863Text4IGK_g(strStringResource, columnScopeInstance.align(companion3, companion.getCenterHorizontally()), jM16542d, jM13036d, (FontStyle) null, companion4.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 200064, 0, 131024);
            float f11 = 19 / f10;
            SpacerKt.Spacer(SizeKt.m18147height3ABfNKs(companion3, C3115Dp.m23994constructorimpl((Resources.getSystem().getDisplayMetrics().widthPixels / Resources.getSystem().getDisplayMetrics().density) * f11)), composerStartRestartGroup, 6);
            float f12 = 32 / f10;
            Modifier modifierM18118paddingqDBjuR0$default = PaddingKt.m18118paddingqDBjuR0$default(companion3, C3115Dp.m23994constructorimpl((Resources.getSystem().getDisplayMetrics().widthPixels / Resources.getSystem().getDisplayMetrics().density) * f12), 0.0f, 0.0f, 0.0f, 14, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), companion.getCenterVertically(), composerStartRestartGroup, 48);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM18118paddingqDBjuR0$default);
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
            Composer composerM20851constructorimpl2 = Updater.m20851constructorimpl(composerStartRestartGroup);
            Updater.m20858setimpl(composerM20851constructorimpl2, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m20858setimpl(composerM20851constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
            if (composerM20851constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM20851constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM20851constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM20851constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m20858setimpl(composerM20851constructorimpl2, modifierMaterializeModifier2, companion2.getSetModifier());
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            float f13 = 5 / f10;
            float f14 = 2 / f10;
            float f15 = 1 / f10;
            BoxKt.Box(BackgroundKt.m17623backgroundbw27NRU$default(ClipKt.clip(SizeKt.m18166width3ABfNKs(SizeKt.m18147height3ABfNKs(companion3, C3115Dp.m23994constructorimpl((Resources.getSystem().getDisplayMetrics().widthPixels / Resources.getSystem().getDisplayMetrics().density) * f13)), C3115Dp.m23994constructorimpl((Resources.getSystem().getDisplayMetrics().widthPixels / Resources.getSystem().getDisplayMetrics().density) * f14)), RoundedCornerShapeKt.m18407RoundedCornerShape0680j_4(C3115Dp.m23994constructorimpl((Resources.getSystem().getDisplayMetrics().widthPixels / Resources.getSystem().getDisplayMetrics().density) * f15))), AbstractC9768a.m16549k(), null, 2, null), composerStartRestartGroup, 0);
            float f16 = 6 / f10;
            TextKt.m19863Text4IGK_g(StringResources_androidKt.stringResource(R.string.dialogue_ask_direct_hint1, composerStartRestartGroup, 0), PaddingKt.m18118paddingqDBjuR0$default(companion3, C3115Dp.m23994constructorimpl((Resources.getSystem().getDisplayMetrics().widthPixels / Resources.getSystem().getDisplayMetrics().density) * f16), 0.0f, 0.0f, 0.0f, 14, null), AbstractC9768a.m16542d(), AbstractC8136b.m13036d(7), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 3504, 0, 131056);
            composerStartRestartGroup.endNode();
            SpacerKt.Spacer(SizeKt.m18147height3ABfNKs(companion3, C3115Dp.m23994constructorimpl((14 / f10) * (Resources.getSystem().getDisplayMetrics().widthPixels / Resources.getSystem().getDisplayMetrics().density))), composerStartRestartGroup, 6);
            Alignment.Vertical centerVertically = companion.getCenterVertically();
            Modifier modifierM18118paddingqDBjuR0$default2 = PaddingKt.m18118paddingqDBjuR0$default(companion3, C3115Dp.m23994constructorimpl((Resources.getSystem().getDisplayMetrics().widthPixels / Resources.getSystem().getDisplayMetrics().density) * f12), 0.0f, 0.0f, 0.0f, 14, null);
            MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement.getStart(), centerVertically, composerStartRestartGroup, 48);
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM18118paddingqDBjuR0$default2);
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
            Composer composerM20851constructorimpl3 = Updater.m20851constructorimpl(composerStartRestartGroup);
            Updater.m20858setimpl(composerM20851constructorimpl3, measurePolicyRowMeasurePolicy2, companion2.getSetMeasurePolicy());
            Updater.m20858setimpl(composerM20851constructorimpl3, currentCompositionLocalMap3, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion2.getSetCompositeKeyHash();
            if (composerM20851constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM20851constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                composerM20851constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                composerM20851constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
            }
            Updater.m20858setimpl(composerM20851constructorimpl3, modifierMaterializeModifier3, companion2.getSetModifier());
            BoxKt.Box(BackgroundKt.m17623backgroundbw27NRU$default(ClipKt.clip(SizeKt.m18166width3ABfNKs(SizeKt.m18147height3ABfNKs(companion3, C3115Dp.m23994constructorimpl(f13 * (Resources.getSystem().getDisplayMetrics().widthPixels / Resources.getSystem().getDisplayMetrics().density))), C3115Dp.m23994constructorimpl(f14 * (Resources.getSystem().getDisplayMetrics().widthPixels / Resources.getSystem().getDisplayMetrics().density))), RoundedCornerShapeKt.m18407RoundedCornerShape0680j_4(C3115Dp.m23994constructorimpl(f15 * (Resources.getSystem().getDisplayMetrics().widthPixels / Resources.getSystem().getDisplayMetrics().density)))), AbstractC9768a.m16549k(), null, 2, null), composerStartRestartGroup, 0);
            TextKt.m19863Text4IGK_g(StringResources_androidKt.stringResource(R.string.dialogue_ask_direct_hint2, composerStartRestartGroup, 0), PaddingKt.m18118paddingqDBjuR0$default(companion3, C3115Dp.m23994constructorimpl(f16 * (Resources.getSystem().getDisplayMetrics().widthPixels / Resources.getSystem().getDisplayMetrics().density)), 0.0f, 0.0f, 0.0f, 14, null), AbstractC9768a.m16542d(), AbstractC8136b.m13036d(7), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 3504, 0, 131056);
            composerStartRestartGroup.endNode();
            SpacerKt.Spacer(SizeKt.m18147height3ABfNKs(companion3, C3115Dp.m23994constructorimpl((18 / f10) * (Resources.getSystem().getDisplayMetrics().widthPixels / Resources.getSystem().getDisplayMetrics().density))), composerStartRestartGroup, 6);
            TextKt.m19863Text4IGK_g(StringResources_androidKt.stringResource(R.string.dialogue_ask_direct_hint3, composerStartRestartGroup, 0), PaddingKt.m18118paddingqDBjuR0$default(companion3, C3115Dp.m23994constructorimpl(f12 * (Resources.getSystem().getDisplayMetrics().widthPixels / Resources.getSystem().getDisplayMetrics().density)), 0.0f, 0.0f, 0.0f, 14, null), AbstractC9768a.m16549k(), AbstractC8136b.m13036d(8), (FontStyle) null, companion4.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 200112, 0, 131024);
            SpacerKt.Spacer(SizeKt.m18147height3ABfNKs(companion3, C3115Dp.m23994constructorimpl(f11 * (Resources.getSystem().getDisplayMetrics().widthPixels / Resources.getSystem().getDisplayMetrics().density))), composerStartRestartGroup, 6);
            AbstractC9892g.m16950e(columnScopeInstance.align(SizeKt.m18163sizeVpY3zN4(companion3, C3115Dp.m23994constructorimpl((56 / f10) * (Resources.getSystem().getDisplayMetrics().widthPixels / Resources.getSystem().getDisplayMetrics().density)), C3115Dp.m23994constructorimpl((23 / f10) * (Resources.getSystem().getDisplayMetrics().widthPixels / Resources.getSystem().getDisplayMetrics().density))), companion.getCenterHorizontally()), RoundedCornerShapeKt.m18407RoundedCornerShape0680j_4(C3115Dp.m23994constructorimpl((12 / f10) * (Resources.getSystem().getDisplayMetrics().widthPixels / Resources.getSystem().getDisplayMetrics().density))), Color.INSTANCE.m21446getWhite0d7_KjU(), 0L, AbstractC9768a.m16549k(), StringResources_androidKt.stringResource(R.string.dialogue_to_ask_direct, composerStartRestartGroup, 0), null, false, null, onClickAskQuestion, composerStartRestartGroup, ((i13 << 24) & 1879048192) | 24960, 456);
            composer2 = composerStartRestartGroup;
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier4;
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: m6.r
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AskQuestionDialogScreensKt.m10054f(modifier2, onClickAskQuestion, i9, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: f */
    public static final Unit m10054f(Modifier modifier, Function0 function0, int i9, int i10, Composer composer, int i11) throws Resources.NotFoundException {
        m10053e(modifier, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i9 | 1), i10);
        return Unit.INSTANCE;
    }

    /* renamed from: g */
    public static final void m10055g(Modifier modifier, final boolean z9, final Function0 onClickHistory, final Function0 onClickTakePhoto, Composer composer, final int i9, final int i10) throws Resources.NotFoundException {
        Modifier modifier2;
        int i11;
        final Modifier modifier3;
        Intrinsics.checkNotNullParameter(onClickHistory, "onClickHistory");
        Intrinsics.checkNotNullParameter(onClickTakePhoto, "onClickTakePhoto");
        Composer composerStartRestartGroup = composer.startRestartGroup(-644296113);
        int i12 = i10 & 1;
        if (i12 != 0) {
            i11 = i9 | 6;
            modifier2 = modifier;
        } else if ((i9 & 6) == 0) {
            modifier2 = modifier;
            i11 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i9;
        } else {
            modifier2 = modifier;
            i11 = i9;
        }
        if ((i9 & 48) == 0) {
            i11 |= composerStartRestartGroup.changed(z9) ? 32 : 16;
        }
        if ((i9 & 384) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(onClickHistory) ? 256 : 128;
        }
        if ((i9 & 3072) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(onClickTakePhoto) ? 2048 : 1024;
        }
        if (composerStartRestartGroup.shouldExecute((i11 & 1171) != 1170, i11 & 1)) {
            Modifier modifier4 = i12 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-644296113, i11, -1, "com.zykj.student.dialogue.ui.ask.AskPhotoSearch (AskQuestionDialogScreens.kt:105)");
            }
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top2 = arrangement.getTop();
            Alignment.Companion companion = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top2, companion.getStart(), composerStartRestartGroup, 0);
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
            Composer composerM20851constructorimpl = Updater.m20851constructorimpl(composerStartRestartGroup);
            Updater.m20858setimpl(composerM20851constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m20858setimpl(composerM20851constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM20851constructorimpl.getInserting() || !Intrinsics.areEqual(composerM20851constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM20851constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM20851constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m20858setimpl(composerM20851constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            Modifier.Companion companion3 = Modifier.INSTANCE;
            float f10 = 600;
            SpacerKt.Spacer(SizeKt.m18147height3ABfNKs(companion3, C3115Dp.m23994constructorimpl((27 / f10) * (Resources.getSystem().getDisplayMetrics().widthPixels / Resources.getSystem().getDisplayMetrics().density))), composerStartRestartGroup, 6);
            ImageKt.Image(PainterResources_androidKt.painterResource(R.mipmap.dialogue_ask_gallery, composerStartRestartGroup, 0), (String) null, columnScopeInstance.align(SizeKt.m18161size3ABfNKs(companion3, C3115Dp.m23994constructorimpl((64 / f10) * (Resources.getSystem().getDisplayMetrics().widthPixels / Resources.getSystem().getDisplayMetrics().density))), companion.getCenterHorizontally()), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 48, MenuKt.InTransitionDuration);
            SpacerKt.Spacer(SizeKt.m18147height3ABfNKs(companion3, C3115Dp.m23994constructorimpl((3 / f10) * (Resources.getSystem().getDisplayMetrics().widthPixels / Resources.getSystem().getDisplayMetrics().density))), composerStartRestartGroup, 6);
            String strStringResource = StringResources_androidKt.stringResource(R.string.dialogue_photo_search, composerStartRestartGroup, 0);
            long jM13036d = AbstractC8136b.m13036d(8);
            long jM16542d = AbstractC9768a.m16542d();
            FontWeight.Companion companion4 = FontWeight.INSTANCE;
            TextKt.m19863Text4IGK_g(strStringResource, columnScopeInstance.align(companion3, companion.getCenterHorizontally()), jM16542d, jM13036d, (FontStyle) null, companion4.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 200064, 0, 131024);
            float f11 = 19 / f10;
            SpacerKt.Spacer(SizeKt.m18147height3ABfNKs(companion3, C3115Dp.m23994constructorimpl((Resources.getSystem().getDisplayMetrics().widthPixels / Resources.getSystem().getDisplayMetrics().density) * f11)), composerStartRestartGroup, 6);
            float f12 = 33 / f10;
            Modifier modifierM18118paddingqDBjuR0$default = PaddingKt.m18118paddingqDBjuR0$default(companion3, C3115Dp.m23994constructorimpl((Resources.getSystem().getDisplayMetrics().widthPixels / Resources.getSystem().getDisplayMetrics().density) * f12), 0.0f, 0.0f, 0.0f, 14, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), companion.getCenterVertically(), composerStartRestartGroup, 48);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM18118paddingqDBjuR0$default);
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
            Composer composerM20851constructorimpl2 = Updater.m20851constructorimpl(composerStartRestartGroup);
            Updater.m20858setimpl(composerM20851constructorimpl2, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m20858setimpl(composerM20851constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
            if (composerM20851constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM20851constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM20851constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM20851constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m20858setimpl(composerM20851constructorimpl2, modifierMaterializeModifier2, companion2.getSetModifier());
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            float f13 = 5 / f10;
            Modifier modifierM18147height3ABfNKs = SizeKt.m18147height3ABfNKs(companion3, C3115Dp.m23994constructorimpl((Resources.getSystem().getDisplayMetrics().widthPixels / Resources.getSystem().getDisplayMetrics().density) * f13));
            float f14 = 2 / f10;
            float f15 = 1 / f10;
            BoxKt.Box(BackgroundKt.m17623backgroundbw27NRU$default(ClipKt.clip(SizeKt.m18166width3ABfNKs(modifierM18147height3ABfNKs, C3115Dp.m23994constructorimpl((Resources.getSystem().getDisplayMetrics().widthPixels / Resources.getSystem().getDisplayMetrics().density) * f14)), RoundedCornerShapeKt.m18407RoundedCornerShape0680j_4(C3115Dp.m23994constructorimpl((Resources.getSystem().getDisplayMetrics().widthPixels / Resources.getSystem().getDisplayMetrics().density) * f15))), AbstractC9768a.m16549k(), null, 2, null), composerStartRestartGroup, 0);
            float f16 = 6 / f10;
            TextKt.m19863Text4IGK_g(StringResources_androidKt.stringResource(R.string.dialogue_photo_search_hint1, composerStartRestartGroup, 0), PaddingKt.m18118paddingqDBjuR0$default(companion3, C3115Dp.m23994constructorimpl((Resources.getSystem().getDisplayMetrics().widthPixels / Resources.getSystem().getDisplayMetrics().density) * f16), 0.0f, 0.0f, 0.0f, 14, null), AbstractC9768a.m16542d(), AbstractC8136b.m13036d(7), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 3504, 0, 131056);
            composerStartRestartGroup.endNode();
            SpacerKt.Spacer(SizeKt.m18147height3ABfNKs(companion3, C3115Dp.m23994constructorimpl((14 / f10) * (Resources.getSystem().getDisplayMetrics().widthPixels / Resources.getSystem().getDisplayMetrics().density))), composerStartRestartGroup, 6);
            Modifier modifierM18118paddingqDBjuR0$default2 = PaddingKt.m18118paddingqDBjuR0$default(companion3, C3115Dp.m23994constructorimpl((Resources.getSystem().getDisplayMetrics().widthPixels / Resources.getSystem().getDisplayMetrics().density) * f12), 0.0f, 0.0f, 0.0f, 14, null);
            MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement.getStart(), companion.getCenterVertically(), composerStartRestartGroup, 48);
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM18118paddingqDBjuR0$default2);
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
            Composer composerM20851constructorimpl3 = Updater.m20851constructorimpl(composerStartRestartGroup);
            Modifier modifier5 = modifier4;
            Updater.m20858setimpl(composerM20851constructorimpl3, measurePolicyRowMeasurePolicy2, companion2.getSetMeasurePolicy());
            Updater.m20858setimpl(composerM20851constructorimpl3, currentCompositionLocalMap3, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion2.getSetCompositeKeyHash();
            if (composerM20851constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM20851constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                composerM20851constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                composerM20851constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
            }
            Updater.m20858setimpl(composerM20851constructorimpl3, modifierMaterializeModifier3, companion2.getSetModifier());
            BoxKt.Box(BackgroundKt.m17623backgroundbw27NRU$default(ClipKt.clip(SizeKt.m18166width3ABfNKs(SizeKt.m18147height3ABfNKs(companion3, C3115Dp.m23994constructorimpl((Resources.getSystem().getDisplayMetrics().widthPixels / Resources.getSystem().getDisplayMetrics().density) * f13)), C3115Dp.m23994constructorimpl(f14 * (Resources.getSystem().getDisplayMetrics().widthPixels / Resources.getSystem().getDisplayMetrics().density))), RoundedCornerShapeKt.m18407RoundedCornerShape0680j_4(C3115Dp.m23994constructorimpl(f15 * (Resources.getSystem().getDisplayMetrics().widthPixels / Resources.getSystem().getDisplayMetrics().density)))), AbstractC9768a.m16549k(), null, 2, null), composerStartRestartGroup, 0);
            TextKt.m19863Text4IGK_g(StringResources_androidKt.stringResource(R.string.dialogue_photo_search_hint2, composerStartRestartGroup, 0), PaddingKt.m18118paddingqDBjuR0$default(companion3, C3115Dp.m23994constructorimpl((Resources.getSystem().getDisplayMetrics().widthPixels / Resources.getSystem().getDisplayMetrics().density) * f16), 0.0f, 0.0f, 0.0f, 14, null), AbstractC9768a.m16542d(), AbstractC8136b.m13036d(7), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 3504, 0, 131056);
            composerStartRestartGroup.endNode();
            SpacerKt.Spacer(SizeKt.m18147height3ABfNKs(companion3, C3115Dp.m23994constructorimpl((18 / f10) * (Resources.getSystem().getDisplayMetrics().widthPixels / Resources.getSystem().getDisplayMetrics().density))), composerStartRestartGroup, 6);
            TextKt.m19863Text4IGK_g(StringResources_androidKt.stringResource(R.string.dialogue_photo_search_hint3, composerStartRestartGroup, 0), PaddingKt.m18118paddingqDBjuR0$default(companion3, C3115Dp.m23994constructorimpl(f12 * (Resources.getSystem().getDisplayMetrics().widthPixels / Resources.getSystem().getDisplayMetrics().density)), 0.0f, 0.0f, 0.0f, 14, null), AbstractC9768a.m16549k(), AbstractC8136b.m13036d(8), (FontStyle) null, companion4.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 200112, 0, 131024);
            composerStartRestartGroup = composerStartRestartGroup;
            SpacerKt.Spacer(SizeKt.m18147height3ABfNKs(companion3, C3115Dp.m23994constructorimpl(f11 * (Resources.getSystem().getDisplayMetrics().widthPixels / Resources.getSystem().getDisplayMetrics().density))), composerStartRestartGroup, 6);
            Modifier modifierAlign = columnScopeInstance.align(companion3, companion.getCenterHorizontally());
            MeasurePolicy measurePolicyRowMeasurePolicy3 = RowKt.rowMeasurePolicy(arrangement.getCenter(), companion.getTop(), composerStartRestartGroup, 6);
            int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierAlign);
            Function0<ComposeUiNode> constructor4 = companion2.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor4);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM20851constructorimpl4 = Updater.m20851constructorimpl(composerStartRestartGroup);
            Updater.m20858setimpl(composerM20851constructorimpl4, measurePolicyRowMeasurePolicy3, companion2.getSetMeasurePolicy());
            Updater.m20858setimpl(composerM20851constructorimpl4, currentCompositionLocalMap4, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = companion2.getSetCompositeKeyHash();
            if (composerM20851constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM20851constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                composerM20851constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                composerM20851constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
            }
            Updater.m20858setimpl(composerM20851constructorimpl4, modifierMaterializeModifier4, companion2.getSetModifier());
            float f17 = 12 / f10;
            RoundedCornerShape roundedCornerShapeM18407RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m18407RoundedCornerShape0680j_4(C3115Dp.m23994constructorimpl((Resources.getSystem().getDisplayMetrics().widthPixels / Resources.getSystem().getDisplayMetrics().density) * f17));
            Color.Companion companion5 = Color.INSTANCE;
            int i13 = i11;
            float f18 = 56 / f10;
            float f19 = 23 / f10;
            AbstractC9892g.m16950e(SizeKt.m18163sizeVpY3zN4(companion3, C3115Dp.m23994constructorimpl((Resources.getSystem().getDisplayMetrics().widthPixels / Resources.getSystem().getDisplayMetrics().density) * f18), C3115Dp.m23994constructorimpl((Resources.getSystem().getDisplayMetrics().widthPixels / Resources.getSystem().getDisplayMetrics().density) * f19)), roundedCornerShapeM18407RoundedCornerShape0680j_4, AbstractC9768a.m16549k(), 0L, companion5.m21446getWhite0d7_KjU(), StringResources_androidKt.stringResource(R.string.dialogue_to_gallery, composerStartRestartGroup, 0), BorderStrokeKt.m17650BorderStrokecXLIe8U(C3115Dp.m23994constructorimpl(1.0f), AbstractC9768a.m16549k()), false, null, onClickHistory, composerStartRestartGroup, ((i13 << 21) & 1879048192) | 1597830, 392);
            SpacerKt.Spacer(SizeKt.m18166width3ABfNKs(companion3, C3115Dp.m23994constructorimpl((28 / f10) * (Resources.getSystem().getDisplayMetrics().widthPixels / Resources.getSystem().getDisplayMetrics().density))), composerStartRestartGroup, 6);
            int i14 = i13 << 18;
            AbstractC9892g.m16950e(SizeKt.m18163sizeVpY3zN4(companion3, C3115Dp.m23994constructorimpl(f18 * (Resources.getSystem().getDisplayMetrics().widthPixels / Resources.getSystem().getDisplayMetrics().density)), C3115Dp.m23994constructorimpl(f19 * (Resources.getSystem().getDisplayMetrics().widthPixels / Resources.getSystem().getDisplayMetrics().density))), RoundedCornerShapeKt.m18407RoundedCornerShape0680j_4(C3115Dp.m23994constructorimpl(f17 * (Resources.getSystem().getDisplayMetrics().widthPixels / Resources.getSystem().getDisplayMetrics().density))), companion5.m21446getWhite0d7_KjU(), 0L, AbstractC9768a.m16549k(), StringResources_androidKt.stringResource(R.string.dialogue_to_take_photo, composerStartRestartGroup, 0), null, z9, null, onClickTakePhoto, composerStartRestartGroup, (29360128 & i14) | 24966 | (i14 & 1879048192), 328);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: m6.q
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AskQuestionDialogScreensKt.m10056h(modifier3, z9, onClickHistory, onClickTakePhoto, i9, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: h */
    public static final Unit m10056h(Modifier modifier, boolean z9, Function0 function0, Function0 function02, int i9, int i10, Composer composer, int i11) throws Resources.NotFoundException {
        m10055g(modifier, z9, function0, function02, composer, RecomposeScopeImplKt.updateChangedFlags(i9 | 1), i10);
        return Unit.INSTANCE;
    }

    /* renamed from: i */
    public static final void m10057i(final boolean z9, final Function0 onClickHistory, final Function0 onClickTakePhoto, final Function0 onClickAskQuestion, Composer composer, final int i9) {
        int i10;
        Composer composer2;
        Intrinsics.checkNotNullParameter(onClickHistory, "onClickHistory");
        Intrinsics.checkNotNullParameter(onClickTakePhoto, "onClickTakePhoto");
        Intrinsics.checkNotNullParameter(onClickAskQuestion, "onClickAskQuestion");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1856003274);
        if ((i9 & 6) == 0) {
            i10 = (composerStartRestartGroup.changed(z9) ? 4 : 2) | i9;
        } else {
            i10 = i9;
        }
        if ((i9 & 48) == 0) {
            i10 |= composerStartRestartGroup.changedInstance(onClickHistory) ? 32 : 16;
        }
        if ((i9 & 384) == 0) {
            i10 |= composerStartRestartGroup.changedInstance(onClickTakePhoto) ? 256 : 128;
        }
        if ((i9 & 3072) == 0) {
            i10 |= composerStartRestartGroup.changedInstance(onClickAskQuestion) ? 2048 : 1024;
        }
        if (composerStartRestartGroup.shouldExecute((i10 & 1171) != 1170, i10 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1856003274, i10, -1, "com.zykj.student.dialogue.ui.ask.AskQuestionDialog (AskQuestionDialogScreens.kt:36)");
            }
            float f10 = 600;
            composer2 = composerStartRestartGroup;
            SurfaceKt.m19713SurfaceT9BRK9s(SizeKt.m18166width3ABfNKs(SizeKt.m18147height3ABfNKs(Modifier.INSTANCE, C3115Dp.m23994constructorimpl((271 / f10) * (Resources.getSystem().getDisplayMetrics().widthPixels / Resources.getSystem().getDisplayMetrics().density))), C3115Dp.m23994constructorimpl((TypedValues.CycleType.TYPE_PATH_ROTATE / f10) * (Resources.getSystem().getDisplayMetrics().widthPixels / Resources.getSystem().getDisplayMetrics().density))), RoundedCornerShapeKt.m18407RoundedCornerShape0680j_4(C3115Dp.m23994constructorimpl((4 / f10) * (Resources.getSystem().getDisplayMetrics().widthPixels / Resources.getSystem().getDisplayMetrics().density))), Color.INSTANCE.m21446getWhite0d7_KjU(), 0L, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-579442181, true, new Function2() { // from class: m6.o
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AskQuestionDialogScreensKt.m10058j(z9, onClickHistory, onClickTakePhoto, onClickAskQuestion, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, composerStartRestartGroup, 54), composer2, 12583302, MenuKt.InTransitionDuration);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: m6.p
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AskQuestionDialogScreensKt.m10059k(z9, onClickHistory, onClickTakePhoto, onClickAskQuestion, i9, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: j */
    public static final Unit m10058j(final boolean z9, final Function0 function0, final Function0 function02, final Function0 function03, Composer composer, int i9) {
        if (composer.shouldExecute((i9 & 3) != 2, i9 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-579442181, i9, -1, "com.zykj.student.dialogue.ui.ask.AskQuestionDialog.<anonymous> (AskQuestionDialogScreens.kt:44)");
            }
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            composer.startReplaceGroup(-1003410150);
            composer.startReplaceGroup(212064437);
            composer.endReplaceGroup();
            Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
            Object objRememberedValue = composer.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = new Measurer2(density);
                composer.updateRememberedValue(objRememberedValue);
            }
            final Measurer2 measurer2 = (Measurer2) objRememberedValue;
            Object objRememberedValue2 = composer.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new ConstraintLayoutScope();
                composer.updateRememberedValue(objRememberedValue2);
            }
            final ConstraintLayoutScope constraintLayoutScope = (ConstraintLayoutScope) objRememberedValue2;
            Object objRememberedValue3 = composer.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composer.updateRememberedValue(objRememberedValue3);
            }
            final MutableState mutableState = (MutableState) objRememberedValue3;
            Object objRememberedValue4 = composer.rememberedValue();
            if (objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = new ConstraintSetForInlineDsl(constraintLayoutScope);
                composer.updateRememberedValue(objRememberedValue4);
            }
            final ConstraintSetForInlineDsl constraintSetForInlineDsl = (ConstraintSetForInlineDsl) objRememberedValue4;
            Object objRememberedValue5 = composer.rememberedValue();
            if (objRememberedValue5 == companion.getEmpty()) {
                objRememberedValue5 = SnapshotStateKt.mutableStateOf(Unit.INSTANCE, SnapshotStateKt.neverEqualPolicy());
                composer.updateRememberedValue(objRememberedValue5);
            }
            final MutableState mutableState2 = (MutableState) objRememberedValue5;
            final int i10 = 257;
            boolean zChangedInstance = composer.changedInstance(measurer2) | composer.changed(257);
            Object objRememberedValue6 = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue6 == companion.getEmpty()) {
                Object obj = new MeasurePolicy() { // from class: com.zykj.student.dialogue.ui.ask.AskQuestionDialogScreensKt$AskQuestionDialog$lambda$6$$inlined$ConstraintLayout$2
                    @Override // androidx.compose.p012ui.layout.MeasurePolicy
                    /* renamed from: measure-3p2s80s */
                    public final MeasureResult mo17421measure3p2s80s(MeasureScope measureScope, final List list, long j9) {
                        final LinkedHashMap linkedHashMap = new LinkedHashMap();
                        mutableState2.getValue();
                        long jM24395performMeasureDjhGOtQ = measurer2.m24395performMeasureDjhGOtQ(j9, measureScope.getLayoutDirection(), constraintSetForInlineDsl, list, linkedHashMap, i10);
                        mutableState.getValue();
                        int iM24165getWidthimpl = IntSize.m24165getWidthimpl(jM24395performMeasureDjhGOtQ);
                        int iM24164getHeightimpl = IntSize.m24164getHeightimpl(jM24395performMeasureDjhGOtQ);
                        final Measurer2 measurer22 = measurer2;
                        return MeasureScope.layout$default(measureScope, iM24165getWidthimpl, iM24164getHeightimpl, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: com.zykj.student.dialogue.ui.ask.AskQuestionDialogScreensKt$AskQuestionDialog$lambda$6$$inlined$ConstraintLayout$2.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                                invoke2(placementScope);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(Placeable.PlacementScope placementScope) {
                                measurer22.performLayout(placementScope, list, linkedHashMap);
                            }
                        }, 4, null);
                    }
                };
                composer.updateRememberedValue(obj);
                objRememberedValue6 = obj;
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) objRememberedValue6;
            Object objRememberedValue7 = composer.rememberedValue();
            if (objRememberedValue7 == companion.getEmpty()) {
                objRememberedValue7 = new Function0<Unit>() { // from class: com.zykj.student.dialogue.ui.ask.AskQuestionDialogScreensKt$AskQuestionDialog$lambda$6$$inlined$ConstraintLayout$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        mutableState.setValue(Boolean.valueOf(!((Boolean) r0.getValue()).booleanValue()));
                        constraintSetForInlineDsl.setKnownDirty(true);
                    }
                };
                composer.updateRememberedValue(objRememberedValue7);
            }
            final Function0 function04 = (Function0) objRememberedValue7;
            boolean zChangedInstance2 = composer.changedInstance(measurer2);
            Object objRememberedValue8 = composer.rememberedValue();
            if (zChangedInstance2 || objRememberedValue8 == companion.getEmpty()) {
                objRememberedValue8 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: com.zykj.student.dialogue.ui.ask.AskQuestionDialogScreensKt$AskQuestionDialog$lambda$6$$inlined$ConstraintLayout$4
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        invoke2(semanticsPropertyReceiver);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        ToolingUtilsKt.setDesignInfoProvider(semanticsPropertyReceiver, measurer2);
                    }
                };
                composer.updateRememberedValue(objRememberedValue8);
            }
            LayoutKt.MultiMeasureLayout(SemanticsModifierKt.semantics$default(modifierFillMaxWidth$default, false, (Function1) objRememberedValue8, 1, null), ComposableLambdaKt.rememberComposableLambda(1200550679, true, new Function2<Composer, Integer, Unit>() { // from class: com.zykj.student.dialogue.ui.ask.AskQuestionDialogScreensKt$AskQuestionDialog$lambda$6$$inlined$ConstraintLayout$5
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) throws Resources.NotFoundException {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i11) throws Resources.NotFoundException {
                    if ((i11 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1200550679, i11, -1, "androidx.constraintlayout.compose.ConstraintLayout.<anonymous> (ConstraintLayout.kt:459)");
                    }
                    mutableState2.setValue(Unit.INSTANCE);
                    int helpersHashCode = constraintLayoutScope.getHelpersHashCode();
                    constraintLayoutScope.reset();
                    ConstraintLayoutScope constraintLayoutScope2 = constraintLayoutScope;
                    composer2.startReplaceGroup(2126333253);
                    ConstraintLayoutScope.ConstrainedLayoutReferences constrainedLayoutReferencesCreateRefs = constraintLayoutScope2.createRefs();
                    ConstrainedLayoutReference constrainedLayoutReferenceComponent1 = constrainedLayoutReferencesCreateRefs.component1();
                    ConstrainedLayoutReference constrainedLayoutReferenceComponent2 = constrainedLayoutReferencesCreateRefs.component2();
                    ConstrainedLayoutReference constrainedLayoutReferenceComponent3 = constrainedLayoutReferencesCreateRefs.component3();
                    ConstrainedLayoutReference constrainedLayoutReferenceComponent4 = constrainedLayoutReferencesCreateRefs.component4();
                    Modifier.Companion companion2 = Modifier.INSTANCE;
                    boolean zChanged = composer2.changed(constrainedLayoutReferenceComponent3);
                    Object objRememberedValue9 = composer2.rememberedValue();
                    if (zChanged || objRememberedValue9 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue9 = new AskQuestionDialogScreensKt.C7469a(constrainedLayoutReferenceComponent3);
                        composer2.updateRememberedValue(objRememberedValue9);
                    }
                    AskQuestionDialogScreensKt.m10055g(constraintLayoutScope2.constrainAs(companion2, constrainedLayoutReferenceComponent1, (Function1) objRememberedValue9), z9, function0, function02, composer2, 0, 0);
                    float f10 = 600;
                    Modifier modifierM18149heightInVpY3zN4$default = SizeKt.m18149heightInVpY3zN4$default(BackgroundKt.m17623backgroundbw27NRU$default(SizeKt.m18166width3ABfNKs(companion2, C3115Dp.m23994constructorimpl(1.0f)), AbstractC9768a.m16547i(), null, 2, null), C3115Dp.m23994constructorimpl((220 / f10) * (Resources.getSystem().getDisplayMetrics().widthPixels / Resources.getSystem().getDisplayMetrics().density)), 0.0f, 2, null);
                    boolean zChanged2 = composer2.changed(constrainedLayoutReferenceComponent1);
                    Object objRememberedValue10 = composer2.rememberedValue();
                    if (zChanged2 || objRememberedValue10 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue10 = new AskQuestionDialogScreensKt.C7470b(constrainedLayoutReferenceComponent1);
                        composer2.updateRememberedValue(objRememberedValue10);
                    }
                    SpacerKt.Spacer(constraintLayoutScope2.constrainAs(modifierM18149heightInVpY3zN4$default, constrainedLayoutReferenceComponent3, (Function1) objRememberedValue10), composer2, 0);
                    boolean zChanged3 = composer2.changed(constrainedLayoutReferenceComponent3);
                    Object objRememberedValue11 = composer2.rememberedValue();
                    if (zChanged3 || objRememberedValue11 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue11 = new AskQuestionDialogScreensKt.C7471c(constrainedLayoutReferenceComponent3);
                        composer2.updateRememberedValue(objRememberedValue11);
                    }
                    AskQuestionDialogScreensKt.m10053e(constraintLayoutScope2.constrainAs(companion2, constrainedLayoutReferenceComponent2, (Function1) objRememberedValue11), function03, composer2, 0, 0);
                    Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                    boolean zChanged4 = composer2.changed(constrainedLayoutReferenceComponent1);
                    Object objRememberedValue12 = composer2.rememberedValue();
                    if (zChanged4 || objRememberedValue12 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue12 = new AskQuestionDialogScreensKt.C7472d(constrainedLayoutReferenceComponent1);
                        composer2.updateRememberedValue(objRememberedValue12);
                    }
                    Modifier modifierConstrainAs = constraintLayoutScope2.constrainAs(companion2, constrainedLayoutReferenceComponent4, (Function1) objRememberedValue12);
                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer2, 48);
                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifierConstrainAs);
                    ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion3.getConstructor();
                    if (composer2.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM20851constructorimpl = Updater.m20851constructorimpl(composer2);
                    Updater.m20858setimpl(composerM20851constructorimpl, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
                    Updater.m20858setimpl(composerM20851constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                    if (composerM20851constructorimpl.getInserting() || !Intrinsics.areEqual(composerM20851constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM20851constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM20851constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m20858setimpl(composerM20851constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.icon_warn_asking, composer2, 0), (String) null, SizeKt.m18161size3ABfNKs(companion2, C3115Dp.m23994constructorimpl((8 / f10) * (Resources.getSystem().getDisplayMetrics().widthPixels / Resources.getSystem().getDisplayMetrics().density))), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, 432, MenuKt.InTransitionDuration);
                    SpacerKt.Spacer(SizeKt.m18166width3ABfNKs(companion2, C3115Dp.m23994constructorimpl((5 / f10) * (Resources.getSystem().getDisplayMetrics().widthPixels / Resources.getSystem().getDisplayMetrics().density))), composer2, 6);
                    TextKt.m19863Text4IGK_g("拍摄图片在教学监控范围内，请勿上传私人图片或违规内容", (Modifier) null, AbstractC9768a.m16545g(), AbstractC8136b.m13036d(8), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 3462, 0, 131058);
                    composer2.endNode();
                    composer2.endReplaceGroup();
                    if (constraintLayoutScope.getHelpersHashCode() != helpersHashCode) {
                        EffectsKt.SideEffect(function04, composer2, 6);
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composer, 54), measurePolicy, composer, 48, 0);
            composer.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* renamed from: k */
    public static final Unit m10059k(boolean z9, Function0 function0, Function0 function02, Function0 function03, int i9, Composer composer, int i10) {
        m10057i(z9, function0, function02, function03, composer, RecomposeScopeImplKt.updateChangedFlags(i9 | 1));
        return Unit.INSTANCE;
    }
}
