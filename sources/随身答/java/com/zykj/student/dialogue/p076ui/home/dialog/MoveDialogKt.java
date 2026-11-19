package com.zykj.student.dialogue.p076ui.home.dialog;

import android.content.res.Resources;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.DividerKt;
import androidx.compose.material3.MenuKt;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p012ui.Alignment;
import androidx.compose.p012ui.ComposedModifierKt;
import androidx.compose.p012ui.Modifier;
import androidx.compose.p012ui.graphics.Color;
import androidx.compose.p012ui.graphics.ColorFilter;
import androidx.compose.p012ui.graphics.ColorKt;
import androidx.compose.p012ui.layout.ContentScale;
import androidx.compose.p012ui.layout.MeasurePolicy;
import androidx.compose.p012ui.node.ComposeUiNode;
import androidx.compose.p012ui.res.PainterResources_androidKt;
import androidx.compose.p012ui.text.TextLayoutResult;
import androidx.compose.p012ui.text.TextStyle;
import androidx.compose.p012ui.text.font.FontFamily;
import androidx.compose.p012ui.text.font.FontStyle;
import androidx.compose.p012ui.text.font.FontWeight;
import androidx.compose.p012ui.text.style.TextAlign;
import androidx.compose.p012ui.text.style.TextDecoration;
import androidx.compose.p012ui.text.style.TextOverflow;
import androidx.compose.p012ui.unit.C3115Dp;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.navigation.NavHostController;
import com.zykj.student.dialogue.R;
import com.zykj.student.dialogue.bean.resp.CatalogResp;
import com.zykj.student.dialogue.p076ui.home.dialog.MoveDialogKt;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import p138i6.AbstractC8136b;
import p274v6.AbstractC9768a;
import p294x6.AbstractC9892g;

/* loaded from: classes5.dex */
public abstract class MoveDialogKt {

    /* renamed from: com.zykj.student.dialogue.ui.home.dialog.MoveDialogKt$a */
    public static final class C7624a implements Function0 {

        /* renamed from: a */
        public final /* synthetic */ CatalogResp f11868a;

        /* renamed from: b */
        public final /* synthetic */ MutableState f11869b;

        public C7624a(CatalogResp catalogResp, MutableState mutableState) {
            this.f11868a = catalogResp;
            this.f11869b = mutableState;
        }

        /* renamed from: a */
        public final void m11020a() {
            MoveDialogKt.m11014o(this.f11869b, this.f11868a);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m11020a();
            return Unit.INSTANCE;
        }
    }

    /* renamed from: h */
    public static final void m11007h(NavHostController navHostController, final List catalogList, final Function0 onNegativeClick, final Function1 onPositiveClick, Composer composer, final int i9, final int i10) {
        NavHostController navHostController2;
        int i11;
        Composer composer2;
        final NavHostController navHostController3;
        Intrinsics.checkNotNullParameter(catalogList, "catalogList");
        Intrinsics.checkNotNullParameter(onNegativeClick, "onNegativeClick");
        Intrinsics.checkNotNullParameter(onPositiveClick, "onPositiveClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(2089532287);
        int i12 = i10 & 1;
        if (i12 != 0) {
            i11 = i9 | 6;
            navHostController2 = navHostController;
        } else if ((i9 & 6) == 0) {
            navHostController2 = navHostController;
            i11 = (composerStartRestartGroup.changedInstance(navHostController2) ? 4 : 2) | i9;
        } else {
            navHostController2 = navHostController;
            i11 = i9;
        }
        if ((i9 & 48) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(catalogList) ? 32 : 16;
        }
        if ((i9 & 384) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(onNegativeClick) ? 256 : 128;
        }
        if ((i9 & 3072) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(onPositiveClick) ? 2048 : 1024;
        }
        if (composerStartRestartGroup.shouldExecute((i11 & 1171) != 1170, i11 & 1)) {
            final NavHostController navHostController4 = i12 != 0 ? null : navHostController2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2089532287, i11, -1, "com.zykj.student.dialogue.ui.home.dialog.MoveDialog (MoveDialog.kt:37)");
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final MutableState mutableState = (MutableState) objRememberedValue;
            float f10 = 600;
            composer2 = composerStartRestartGroup;
            SurfaceKt.m19713SurfaceT9BRK9s(SizeKt.m18163sizeVpY3zN4(Modifier.INSTANCE, C3115Dp.m23994constructorimpl((216 / f10) * (Resources.getSystem().getDisplayMetrics().widthPixels / Resources.getSystem().getDisplayMetrics().density)), C3115Dp.m23994constructorimpl((169 / f10) * (Resources.getSystem().getDisplayMetrics().widthPixels / Resources.getSystem().getDisplayMetrics().density))), RoundedCornerShapeKt.m18407RoundedCornerShape0680j_4(C3115Dp.m23994constructorimpl((4 / f10) * (Resources.getSystem().getDisplayMetrics().widthPixels / Resources.getSystem().getDisplayMetrics().density))), Color.INSTANCE.m21446getWhite0d7_KjU(), 0L, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-729540796, true, new Function2() { // from class: u6.e
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return MoveDialogKt.m11009j(catalogList, mutableState, navHostController4, onNegativeClick, onPositiveClick, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, composerStartRestartGroup, 54), composer2, 12583302, MenuKt.InTransitionDuration);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            navHostController3 = navHostController4;
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
            navHostController3 = navHostController2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: u6.f
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return MoveDialogKt.m11013n(navHostController3, catalogList, onNegativeClick, onPositiveClick, i9, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: i */
    public static final CatalogResp m11008i(MutableState mutableState) {
        return (CatalogResp) mutableState.getValue();
    }

    /* renamed from: j */
    public static final Unit m11009j(final List list, final MutableState mutableState, final NavHostController navHostController, final Function0 function0, final Function1 function1, Composer composer, int i9) {
        if (composer.shouldExecute((i9 & 3) != 2, i9 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-729540796, i9, -1, "com.zykj.student.dialogue.ui.home.dialog.MoveDialog.<anonymous> (MoveDialog.kt:46)");
            }
            Alignment.Companion companion = Alignment.INSTANCE;
            Alignment.Horizontal centerHorizontally = companion.getCenterHorizontally();
            Modifier.Companion companion2 = Modifier.INSTANCE;
            float f10 = 600;
            Modifier modifierM18116paddingVpY3zN4$default = PaddingKt.m18116paddingVpY3zN4$default(companion2, 0.0f, C3115Dp.m23994constructorimpl((19 / f10) * (Resources.getSystem().getDisplayMetrics().widthPixels / Resources.getSystem().getDisplayMetrics().density)), 1, null);
            Arrangement arrangement = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), centerHorizontally, composer, 48);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierM18116paddingVpY3zN4$default);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
            if (composer.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            Composer composerM20851constructorimpl = Updater.m20851constructorimpl(composer);
            Updater.m20858setimpl(composerM20851constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m20858setimpl(composerM20851constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (composerM20851constructorimpl.getInserting() || !Intrinsics.areEqual(composerM20851constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM20851constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM20851constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m20858setimpl(composerM20851constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            TextKt.m19863Text4IGK_g("移动至", (Modifier) null, AbstractC9768a.m16539a(), AbstractC8136b.m13036d(8), (FontStyle) null, FontWeight.INSTANCE.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 200070, 0, 131026);
            SpacerKt.Spacer(SizeKt.m18147height3ABfNKs(companion2, C3115Dp.m23994constructorimpl((2 / f10) * (Resources.getSystem().getDisplayMetrics().widthPixels / Resources.getSystem().getDisplayMetrics().density))), composer, 6);
            Modifier modifierWeight$default = ColumnScope.weight$default(columnScopeInstance, companion2, 1.0f, false, 2, null);
            boolean zChangedInstance = composer.changedInstance(list);
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: u6.g
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return MoveDialogKt.m11012m(list, mutableState, (LazyListScope) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            LazyDslKt.LazyColumn(modifierWeight$default, null, null, false, null, null, null, false, null, (Function1) objRememberedValue, composer, 0, TypedValues.PositionType.TYPE_POSITION_TYPE);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), companion.getTop(), composer, 0);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer, companion2);
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
            if (composer.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor2);
            } else {
                composer.useNode();
            }
            Composer composerM20851constructorimpl2 = Updater.m20851constructorimpl(composer);
            Updater.m20858setimpl(composerM20851constructorimpl2, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m20858setimpl(composerM20851constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
            if (composerM20851constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM20851constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM20851constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM20851constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m20858setimpl(composerM20851constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            Color.Companion companion4 = Color.INSTANCE;
            long jM21446getWhite0d7_KjU = companion4.m21446getWhite0d7_KjU();
            long jM16549k = AbstractC9768a.m16549k();
            float f11 = 12 / f10;
            RoundedCornerShape roundedCornerShapeM18407RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m18407RoundedCornerShape0680j_4(C3115Dp.m23994constructorimpl((Resources.getSystem().getDisplayMetrics().widthPixels / Resources.getSystem().getDisplayMetrics().density) * f11));
            float f12 = 56 / f10;
            float f13 = 23 / f10;
            Modifier modifierM18163sizeVpY3zN4 = SizeKt.m18163sizeVpY3zN4(companion2, C3115Dp.m23994constructorimpl((Resources.getSystem().getDisplayMetrics().widthPixels / Resources.getSystem().getDisplayMetrics().density) * f12), C3115Dp.m23994constructorimpl((Resources.getSystem().getDisplayMetrics().widthPixels / Resources.getSystem().getDisplayMetrics().density) * f13));
            BorderStroke borderStrokeM17650BorderStrokecXLIe8U = BorderStrokeKt.m17650BorderStrokecXLIe8U(C3115Dp.m23994constructorimpl(1.0f), AbstractC9768a.m16549k());
            boolean zChangedInstance2 = composer.changedInstance(navHostController) | composer.changed(function0);
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: u6.h
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return MoveDialogKt.m11011l(navHostController, function0);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            AbstractC9892g.m16950e(modifierM18163sizeVpY3zN4, roundedCornerShapeM18407RoundedCornerShape0680j_4, jM16549k, 0L, jM21446getWhite0d7_KjU, "取消", borderStrokeM17650BorderStrokecXLIe8U, false, null, (Function0) objRememberedValue2, composer, 1794438, 392);
            SpacerKt.Spacer(SizeKt.m18166width3ABfNKs(companion2, C3115Dp.m23994constructorimpl((28 / f10) * (Resources.getSystem().getDisplayMetrics().widthPixels / Resources.getSystem().getDisplayMetrics().density))), composer, 6);
            long jM16549k2 = AbstractC9768a.m16549k();
            long jM21446getWhite0d7_KjU2 = companion4.m21446getWhite0d7_KjU();
            RoundedCornerShape roundedCornerShapeM18407RoundedCornerShape0680j_42 = RoundedCornerShapeKt.m18407RoundedCornerShape0680j_4(C3115Dp.m23994constructorimpl(f11 * (Resources.getSystem().getDisplayMetrics().widthPixels / Resources.getSystem().getDisplayMetrics().density)));
            Modifier modifierM18163sizeVpY3zN42 = SizeKt.m18163sizeVpY3zN4(companion2, C3115Dp.m23994constructorimpl(f12 * (Resources.getSystem().getDisplayMetrics().widthPixels / Resources.getSystem().getDisplayMetrics().density)), C3115Dp.m23994constructorimpl(f13 * (Resources.getSystem().getDisplayMetrics().widthPixels / Resources.getSystem().getDisplayMetrics().density)));
            boolean zChanged = composer.changed(function1);
            Object objRememberedValue3 = composer.rememberedValue();
            if (zChanged || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new Function0() { // from class: u6.i
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return MoveDialogKt.m11010k(function1, mutableState);
                    }
                };
                composer.updateRememberedValue(objRememberedValue3);
            }
            AbstractC9892g.m16950e(modifierM18163sizeVpY3zN42, roundedCornerShapeM18407RoundedCornerShape0680j_42, jM21446getWhite0d7_KjU2, 0L, jM16549k2, "确定", null, false, null, (Function0) objRememberedValue3, composer, 221574, 456);
            composer.endNode();
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* renamed from: k */
    public static final Unit m11010k(Function1 function1, MutableState mutableState) {
        CatalogResp catalogRespM11008i = m11008i(mutableState);
        function1.invoke(catalogRespM11008i != null ? Long.valueOf(catalogRespM11008i.getId()) : null);
        return Unit.INSTANCE;
    }

    /* renamed from: l */
    public static final Unit m11011l(NavHostController navHostController, Function0 function0) {
        if (navHostController != null) {
            navHostController.navigateUp();
        }
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* renamed from: m */
    public static final Unit m11012m(final List list, final MutableState mutableState, LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        LazyColumn.items(list.size(), null, new Function1<Integer, Object>() { // from class: com.zykj.student.dialogue.ui.home.dialog.MoveDialogKt$MoveDialog$lambda$13$lambda$12$lambda$6$lambda$5$$inlined$itemsIndexed$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int i9) {
                list.get(i9);
                return null;
            }
        }, ComposableLambdaKt.composableLambdaInstance(-1091073711, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.zykj.student.dialogue.ui.home.dialog.MoveDialogKt$MoveDialog$lambda$13$lambda$12$lambda$6$lambda$5$$inlined$itemsIndexed$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(4);
            }

            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(LazyItemScope lazyItemScope, int i9, Composer composer, int i10) {
                int i11;
                Composer composer2;
                if ((i10 & 6) == 0) {
                    i11 = (composer.changed(lazyItemScope) ? 4 : 2) | i10;
                } else {
                    i11 = i10;
                }
                if ((i10 & 48) == 0) {
                    i11 |= composer.changed(i9) ? 32 : 16;
                }
                if (!composer.shouldExecute((i11 & 147) != 146, i11 & 1)) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1091073711, i11, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:214)");
                }
                CatalogResp catalogResp = (CatalogResp) list.get(i9);
                composer.startReplaceGroup(201484909);
                boolean zAreEqual = Intrinsics.areEqual(MoveDialogKt.m11008i(mutableState), catalogResp);
                boolean zChanged = composer.changed(catalogResp);
                Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new MoveDialogKt.C7624a(catalogResp, mutableState);
                    composer.updateRememberedValue(objRememberedValue);
                }
                MoveDialogKt.m11015p(catalogResp, zAreEqual, (Function0) objRememberedValue, composer, 0);
                if (i9 != CollectionsKt.getLastIndex(list)) {
                    composer.startReplaceGroup(201709782);
                    composer2 = composer;
                    DividerKt.m19241Divider9IZ8Weo(null, 0.0f, ColorKt.Color(4293651952L), composer2, 384, 3);
                } else {
                    composer2 = composer;
                    composer2.startReplaceGroup(199274856);
                }
                composer2.endReplaceGroup();
                composer2.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        return Unit.INSTANCE;
    }

    /* renamed from: n */
    public static final Unit m11013n(NavHostController navHostController, List list, Function0 function0, Function1 function1, int i9, int i10, Composer composer, int i11) {
        m11007h(navHostController, list, function0, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i9 | 1), i10);
        return Unit.INSTANCE;
    }

    /* renamed from: o */
    public static final void m11014o(MutableState mutableState, CatalogResp catalogResp) {
        mutableState.setValue(catalogResp);
    }

    /* renamed from: p */
    public static final void m11015p(final CatalogResp catalogResp, final boolean z9, final Function0 onClick, Composer composer, final int i9) {
        int i10;
        Intrinsics.checkNotNullParameter(catalogResp, "catalogResp");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(415098937);
        if ((i9 & 6) == 0) {
            i10 = (composerStartRestartGroup.changed(catalogResp) ? 4 : 2) | i9;
        } else {
            i10 = i9;
        }
        if ((i9 & 48) == 0) {
            i10 |= composerStartRestartGroup.changed(z9) ? 32 : 16;
        }
        if ((i9 & 384) == 0) {
            i10 |= composerStartRestartGroup.changedInstance(onClick) ? 256 : 128;
        }
        if (composerStartRestartGroup.shouldExecute((i10 & 147) != 146, i10 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(415098937, i10, -1, "com.zykj.student.dialogue.ui.home.dialog.MoveDialogItem (MoveDialog.kt:96)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            float f10 = 600;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(SizeKt.m18147height3ABfNKs(companion, C3115Dp.m23994constructorimpl((26 / f10) * (Resources.getSystem().getDisplayMetrics().widthPixels / Resources.getSystem().getDisplayMetrics().density))), 0.0f, 1, null);
            boolean z10 = (i10 & 896) == 256;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z10 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: u6.j
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return MoveDialogKt.m11016q(onClick);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            float f11 = 9 / f10;
            Modifier modifierM18116paddingVpY3zN4$default = PaddingKt.m18116paddingVpY3zN4$default(ClickableKt.m17657clickableXHw0xAI$default(modifierFillMaxWidth$default, false, null, null, (Function0) objRememberedValue, 7, null), C3115Dp.m23994constructorimpl((Resources.getSystem().getDisplayMetrics().widthPixels / Resources.getSystem().getDisplayMetrics().density) * f11), 0.0f, 2, null);
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM18116paddingVpY3zN4$default);
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
            Composer composerM20851constructorimpl = Updater.m20851constructorimpl(composerStartRestartGroup);
            Updater.m20858setimpl(composerM20851constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m20858setimpl(composerM20851constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (composerM20851constructorimpl.getInserting() || !Intrinsics.areEqual(composerM20851constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM20851constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM20851constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m20858setimpl(composerM20851constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            TextKt.m19863Text4IGK_g(catalogResp.getName(), boxScopeInstance.align(SizeKt.fillMaxWidth(companion, 0.6f), companion2.getCenter()), z9 ? AbstractC9768a.m16549k() : AbstractC9768a.m16543e(), AbstractC8136b.m13036d(7), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m23871boximpl(TextAlign.INSTANCE.m23878getCentere0LSkKk()), 0L, TextOverflow.INSTANCE.m23930getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 3072, 3120, 120304);
            composerStartRestartGroup = composerStartRestartGroup;
            if (z9) {
                composerStartRestartGroup.startReplaceGroup(1575802372);
                ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.icon_move_item_selected, composerStartRestartGroup, 0), (String) null, boxScopeInstance.align(SizeKt.m18161size3ABfNKs(companion, C3115Dp.m23994constructorimpl(f11 * (Resources.getSystem().getDisplayMetrics().widthPixels / Resources.getSystem().getDisplayMetrics().density))), companion2.getCenterEnd()), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 48, MenuKt.InTransitionDuration);
            } else {
                composerStartRestartGroup.startReplaceGroup(1571292771);
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: u6.k
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return MoveDialogKt.m11017r(catalogResp, z9, onClick, i9, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: q */
    public static final Unit m11016q(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* renamed from: r */
    public static final Unit m11017r(CatalogResp catalogResp, boolean z9, Function0 function0, int i9, Composer composer, int i10) {
        m11015p(catalogResp, z9, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i9 | 1));
        return Unit.INSTANCE;
    }
}
