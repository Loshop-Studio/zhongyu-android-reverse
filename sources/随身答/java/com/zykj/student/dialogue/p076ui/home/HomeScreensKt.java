package com.zykj.student.dialogue.p076ui.home;

import android.content.res.Resources;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.DividerKt;
import androidx.compose.material3.MenuKt;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p012ui.Alignment;
import androidx.compose.p012ui.ComposedModifierKt;
import androidx.compose.p012ui.Modifier;
import androidx.compose.p012ui.graphics.Color;
import androidx.compose.p012ui.graphics.ColorKt;
import androidx.compose.p012ui.graphics.Shadow;
import androidx.compose.p012ui.graphics.drawscope.DrawStyle;
import androidx.compose.p012ui.layout.MeasurePolicy;
import androidx.compose.p012ui.node.ComposeUiNode;
import androidx.compose.p012ui.res.PainterResources_androidKt;
import androidx.compose.p012ui.res.StringResources_androidKt;
import androidx.compose.p012ui.text.PlatformTextStyle;
import androidx.compose.p012ui.text.TextLayoutResult;
import androidx.compose.p012ui.text.TextStyle;
import androidx.compose.p012ui.text.font.FontFamily;
import androidx.compose.p012ui.text.font.FontStyle;
import androidx.compose.p012ui.text.font.FontSynthesis;
import androidx.compose.p012ui.text.font.FontWeight;
import androidx.compose.p012ui.text.intl.LocaleList;
import androidx.compose.p012ui.text.style.BaselineShift;
import androidx.compose.p012ui.text.style.LineHeightStyle;
import androidx.compose.p012ui.text.style.TextAlign;
import androidx.compose.p012ui.text.style.TextDecoration;
import androidx.compose.p012ui.text.style.TextGeometricTransform;
import androidx.compose.p012ui.text.style.TextIndent;
import androidx.compose.p012ui.text.style.TextMotion;
import androidx.compose.p012ui.text.style.TextOverflow;
import androidx.compose.p012ui.unit.C3115Dp;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import coil3.compose.AbstractC5312c;
import com.zykj.student.dialogue.R;
import com.zykj.student.dialogue.bean.resp.CatalogResp;
import com.zykj.student.dialogue.bean.resp.FilterType;
import com.zykj.student.dialogue.bean.resp.HomeKt;
import com.zykj.student.dialogue.p076ui.home.AbstractC7593a;
import com.zykj.student.dialogue.p076ui.home.HomeScreensKt;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p138i6.AbstractC8136b;
import p190n6.AbstractC9114o;
import p244s6.AbstractC9522j0;
import p244s6.C9497d;
import p244s6.C9526k0;
import p274v6.AbstractC9768a;
import p294x6.AbstractC9887b0;

/* loaded from: classes5.dex */
public abstract class HomeScreensKt {

    /* renamed from: com.zykj.student.dialogue.ui.home.HomeScreensKt$a */
    public static final class C7585a implements Function1 {

        /* renamed from: a */
        public final /* synthetic */ Function1 f11607a;

        public C7585a(Function1 function1) {
            this.f11607a = function1;
        }

        /* renamed from: a */
        public final void m10840a(CatalogResp item) {
            Intrinsics.checkNotNullParameter(item, "item");
            this.f11607a.invoke(item);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m10840a((CatalogResp) obj);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: A */
    public static final Unit m10793A(Function1 function1) {
        function1.invoke(AbstractC7593a.d.f11731a);
        return Unit.INSTANCE;
    }

    /* renamed from: B */
    public static final Unit m10794B(Function1 function1) {
        function1.invoke(AbstractC7593a.a.f11728a);
        return Unit.INSTANCE;
    }

    /* renamed from: C */
    public static final Unit m10795C(Modifier modifier, C9526k0 c9526k0, Function1 function1, int i9, int i10, Composer composer, int i11) {
        m10839z(modifier, c9526k0, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i9 | 1), i10);
        return Unit.INSTANCE;
    }

    /* renamed from: D */
    public static final void m10796D(final boolean z9, final List catalogList, final Long l9, final Function1 onTabItemClick, final Function0 onCatalogEdit, Composer composer, final int i9) {
        int i10;
        Intrinsics.checkNotNullParameter(catalogList, "catalogList");
        Intrinsics.checkNotNullParameter(onTabItemClick, "onTabItemClick");
        Intrinsics.checkNotNullParameter(onCatalogEdit, "onCatalogEdit");
        Composer composerStartRestartGroup = composer.startRestartGroup(1018791207);
        if ((i9 & 6) == 0) {
            i10 = (composerStartRestartGroup.changed(z9) ? 4 : 2) | i9;
        } else {
            i10 = i9;
        }
        if ((i9 & 48) == 0) {
            i10 |= composerStartRestartGroup.changedInstance(catalogList) ? 32 : 16;
        }
        if ((i9 & 384) == 0) {
            i10 |= composerStartRestartGroup.changed(l9) ? 256 : 128;
        }
        if ((i9 & 3072) == 0) {
            i10 |= composerStartRestartGroup.changedInstance(onTabItemClick) ? 2048 : 1024;
        }
        if ((i9 & 24576) == 0) {
            i10 |= composerStartRestartGroup.changedInstance(onCatalogEdit) ? 16384 : 8192;
        }
        if (composerStartRestartGroup.shouldExecute((i10 & 9363) != 9362, i10 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1018791207, i10, -1, "com.zykj.student.dialogue.ui.home.HomeContentTab (HomeScreens.kt:302)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            float f10 = 600;
            Modifier modifierM18118paddingqDBjuR0$default = PaddingKt.m18118paddingqDBjuR0$default(SizeKt.fillMaxHeight$default(SizeKt.m18166width3ABfNKs(BackgroundKt.m17623backgroundbw27NRU$default(companion, Color.INSTANCE.m21446getWhite0d7_KjU(), null, 2, null), C3115Dp.m23994constructorimpl((56 / f10) * (Resources.getSystem().getDisplayMetrics().widthPixels / Resources.getSystem().getDisplayMetrics().density))), 0.0f, 1, null), 0.0f, C3115Dp.m23994constructorimpl((10 / f10) * (Resources.getSystem().getDisplayMetrics().widthPixels / Resources.getSystem().getDisplayMetrics().density)), 0.0f, 0.0f, 13, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getCenterHorizontally(), composerStartRestartGroup, 48);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM18118paddingqDBjuR0$default);
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
            Modifier modifierWeight$default = ColumnScope.weight$default(ColumnScopeInstance.INSTANCE, SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 1.0f, false, 2, null);
            int i11 = i10 & 7168;
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(catalogList) | ((i10 & 14) == 4) | ((i10 & 896) == 256) | (i11 == 2048);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: s6.j2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return HomeScreensKt.m10797E(catalogList, z9, l9, onTabItemClick, (LazyListScope) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            LazyDslKt.LazyColumn(modifierWeight$default, null, null, false, null, null, null, false, null, (Function1) objRememberedValue, composerStartRestartGroup, 0, TypedValues.PositionType.TYPE_POSITION_TYPE);
            DividerKt.m19242HorizontalDivider9IZ8Weo(null, C3115Dp.m23994constructorimpl(1), ColorKt.Color(4292599005L), composerStartRestartGroup, 432, 1);
            int i12 = R.drawable.icon_category_history_collect;
            boolean z10 = l9 != null && l9.longValue() == CatalogResp.INSTANCE.getHISTORY_COLLECT().getId();
            boolean z11 = i11 == 2048;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (z11 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: s6.k2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return HomeScreensKt.m10798F(onTabItemClick);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            int i13 = ((i10 << 12) & 57344) | 6;
            m10811S("历史收藏", i12, 0L, 0L, z9, z10, (Function0) objRememberedValue2, composerStartRestartGroup, i13, 12);
            int i14 = R.drawable.icon_category_edit;
            boolean z12 = (i10 & 57344) == 16384;
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (z12 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new Function0() { // from class: s6.l2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return HomeScreensKt.m10799G(onCatalogEdit);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            m10811S("编辑分类", i14, 0L, 0L, z9, false, (Function0) objRememberedValue3, composerStartRestartGroup, i13, 44);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: s6.m2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return HomeScreensKt.m10800H(z9, catalogList, l9, onTabItemClick, onCatalogEdit, i9, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: E */
    public static final Unit m10797E(final List list, final boolean z9, final Long l9, final Function1 function1, LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        final C7582xb14906f0 c7582xb14906f0 = new Function1() { // from class: com.zykj.student.dialogue.ui.home.HomeScreensKt$HomeContentTab$lambda$32$lambda$27$lambda$26$$inlined$items$default$1
            @Override // kotlin.jvm.functions.Function1
            public final Void invoke(Object obj) {
                return null;
            }
        };
        LazyColumn.items(list.size(), null, new Function1<Integer, Object>() { // from class: com.zykj.student.dialogue.ui.home.HomeScreensKt$HomeContentTab$lambda$32$lambda$27$lambda$26$$inlined$items$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int i9) {
                return c7582xb14906f0.invoke(list.get(i9));
            }
        }, ComposableLambdaKt.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.zykj.student.dialogue.ui.home.HomeScreensKt$HomeContentTab$lambda$32$lambda$27$lambda$26$$inlined$items$default$4
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
                    ComposerKt.traceEventStart(-632812321, i11, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
                }
                CatalogResp catalogResp = (CatalogResp) list.get(i9);
                composer.startReplaceGroup(-176960978);
                boolean z10 = z9;
                long id = catalogResp.getId();
                Long l10 = l9;
                boolean z11 = l10 != null && id == l10.longValue();
                boolean zChanged = composer.changed(function1);
                Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new HomeScreensKt.C7585a(function1);
                    composer.updateRememberedValue(objRememberedValue);
                }
                HomeScreensKt.m10801I(z10, z11, catalogResp, (Function1) objRememberedValue, composer, 0);
                composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        return Unit.INSTANCE;
    }

    /* renamed from: F */
    public static final Unit m10798F(Function1 function1) {
        function1.invoke(CatalogResp.INSTANCE.getHISTORY_COLLECT());
        return Unit.INSTANCE;
    }

    /* renamed from: G */
    public static final Unit m10799G(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* renamed from: H */
    public static final Unit m10800H(boolean z9, List list, Long l9, Function1 function1, Function0 function0, int i9, Composer composer, int i10) {
        m10796D(z9, list, l9, function1, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i9 | 1));
        return Unit.INSTANCE;
    }

    /* renamed from: I */
    public static final void m10801I(final boolean z9, final boolean z10, final CatalogResp catalog, final Function1 onTabItemClick, Composer composer, final int i9) {
        int i10;
        Composer composer2;
        Intrinsics.checkNotNullParameter(catalog, "catalog");
        Intrinsics.checkNotNullParameter(onTabItemClick, "onTabItemClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(523362565);
        if ((i9 & 6) == 0) {
            i10 = (composerStartRestartGroup.changed(z9) ? 4 : 2) | i9;
        } else {
            i10 = i9;
        }
        if ((i9 & 48) == 0) {
            i10 |= composerStartRestartGroup.changed(z10) ? 32 : 16;
        }
        if ((i9 & 384) == 0) {
            i10 |= composerStartRestartGroup.changed(catalog) ? 256 : 128;
        }
        if ((i9 & 3072) == 0) {
            i10 |= composerStartRestartGroup.changedInstance(onTabItemClick) ? 2048 : 1024;
        }
        if (composerStartRestartGroup.shouldExecute((i10 & 1171) != 1170, i10 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(523362565, i10, -1, "com.zykj.student.dialogue.ui.home.HomeContentTabItem (HomeScreens.kt:361)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            float f10 = 600;
            Modifier modifierM17623backgroundbw27NRU$default = BackgroundKt.m17623backgroundbw27NRU$default(SizeKt.m18163sizeVpY3zN4(companion, C3115Dp.m23994constructorimpl((56 / f10) * (Resources.getSystem().getDisplayMetrics().widthPixels / Resources.getSystem().getDisplayMetrics().density)), C3115Dp.m23994constructorimpl((38 / f10) * (Resources.getSystem().getDisplayMetrics().widthPixels / Resources.getSystem().getDisplayMetrics().density))), z10 ? AbstractC9768a.m16548j() : Color.INSTANCE.m21446getWhite0d7_KjU(), null, 2, null);
            boolean z11 = ((i10 & 896) == 256) | ((i10 & 7168) == 2048);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z11 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: s6.g2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return HomeScreensKt.m10802J(onTabItemClick, catalog);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            Modifier modifierM17657clickableXHw0xAI$default = ClickableKt.m17657clickableXHw0xAI$default(modifierM17623backgroundbw27NRU$default, z9, null, null, (Function0) objRememberedValue, 6, null);
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getCenter(), false);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM17657clickableXHw0xAI$default);
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
            Alignment centerStart = companion2.getCenterStart();
            Modifier modifierWrapContentSize$default = SizeKt.wrapContentSize$default(companion, null, false, 3, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(centerStart, false);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierWrapContentSize$default);
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
            Composer composerM20851constructorimpl2 = Updater.m20851constructorimpl(composerStartRestartGroup);
            Updater.m20858setimpl(composerM20851constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy2, companion3.getSetMeasurePolicy());
            Updater.m20858setimpl(composerM20851constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
            if (composerM20851constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM20851constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM20851constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM20851constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m20858setimpl(composerM20851constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
            String name = catalog.getName();
            FontWeight medium = FontWeight.INSTANCE.getMedium();
            int iM23878getCentere0LSkKk = TextAlign.INSTANCE.m23878getCentere0LSkKk();
            float f11 = 8 / f10;
            TextKt.m19863Text4IGK_g(name, PaddingKt.m18116paddingVpY3zN4$default(companion, C3115Dp.m23994constructorimpl((Resources.getSystem().getDisplayMetrics().widthPixels / Resources.getSystem().getDisplayMetrics().density) * f11), 0.0f, 2, null), z10 ? AbstractC9768a.m16549k() : AbstractC9768a.m16544f(), AbstractC8136b.m13036d(8), (FontStyle) null, medium, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m23871boximpl(iM23878getCentere0LSkKk), 0L, TextOverflow.INSTANCE.m23930getEllipsisgIe3tQ8(), false, 2, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 199728, 3120, 120272);
            composer2 = composerStartRestartGroup;
            if (catalog.getNewParimarMsgCount() > 0) {
                composer2.startReplaceGroup(-1304558791);
                SurfaceKt.m19713SurfaceT9BRK9s(OffsetKt.m18074offsetVpY3zN4$default(boxScopeInstance.align(SizeKt.m18161size3ABfNKs(companion, C3115Dp.m23994constructorimpl(f11 * (Resources.getSystem().getDisplayMetrics().widthPixels / Resources.getSystem().getDisplayMetrics().density))), companion2.getTopEnd()), 0.0f, C3115Dp.m23994constructorimpl(((-4) / f10) * (Resources.getSystem().getDisplayMetrics().widthPixels / Resources.getSystem().getDisplayMetrics().density)), 1, null), RoundedCornerShapeKt.getCircleShape(), ColorKt.Color(4294916912L), 0L, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-38118073, true, new Function2() { // from class: s6.h2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return HomeScreensKt.m10803K(catalog, (Composer) obj, ((Integer) obj2).intValue());
                    }
                }, composer2, 54), composer2, 12583296, MenuKt.InTransitionDuration);
                composer2 = composer2;
            } else {
                composer2.startReplaceGroup(-1317685679);
            }
            composer2.endReplaceGroup();
            composer2.endNode();
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: s6.i2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return HomeScreensKt.m10804L(z9, z10, catalog, onTabItemClick, i9, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: J */
    public static final Unit m10802J(Function1 function1, CatalogResp catalogResp) {
        function1.invoke(catalogResp);
        return Unit.INSTANCE;
    }

    /* renamed from: K */
    public static final Unit m10803K(CatalogResp catalogResp, Composer composer, int i9) {
        if (composer.shouldExecute((i9 & 3) != 2, i9 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-38118073, i9, -1, "com.zykj.student.dialogue.ui.home.HomeContentTabItem.<anonymous>.<anonymous>.<anonymous> (HomeScreens.kt:392)");
            }
            Alignment center = Alignment.INSTANCE.getCenter();
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, companion);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
            Updater.m20858setimpl(composerM20851constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m20858setimpl(composerM20851constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM20851constructorimpl.getInserting() || !Intrinsics.areEqual(composerM20851constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM20851constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM20851constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m20858setimpl(composerM20851constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            TextKt.m19863Text4IGK_g(catalogResp.getNewParimarMsgCount() > 99 ? "99" : String.valueOf(catalogResp.getNewParimarMsgCount()), (Modifier) null, Color.INSTANCE.m21446getWhite0d7_KjU(), AbstractC8136b.m13036d(5), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m23871boximpl(TextAlign.INSTANCE.m23878getCentere0LSkKk()), 0L, 0, false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 3456, 3072, 122354);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* renamed from: L */
    public static final Unit m10804L(boolean z9, boolean z10, CatalogResp catalogResp, Function1 function1, int i9, Composer composer, int i10) {
        m10801I(z9, z10, catalogResp, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i9 | 1));
        return Unit.INSTANCE;
    }

    /* renamed from: M */
    public static final void m10805M(final String avatar, final String username, final Function0 onItemsMoveAction, final Function0 onCancelAction, final int i9, Composer composer, final int i10) {
        int i11;
        Intrinsics.checkNotNullParameter(avatar, "avatar");
        Intrinsics.checkNotNullParameter(username, "username");
        Intrinsics.checkNotNullParameter(onItemsMoveAction, "onItemsMoveAction");
        Intrinsics.checkNotNullParameter(onCancelAction, "onCancelAction");
        Composer composerStartRestartGroup = composer.startRestartGroup(1199374827);
        if ((i10 & 6) == 0) {
            i11 = (composerStartRestartGroup.changed(avatar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.changed(username) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(onItemsMoveAction) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(onCancelAction) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= composerStartRestartGroup.changed(i9) ? 16384 : 8192;
        }
        if (composerStartRestartGroup.shouldExecute((i11 & 9363) != 9362, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1199374827, i11, -1, "com.zykj.student.dialogue.ui.home.HomeTitleInEditMode (HomeScreens.kt:130)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            float f10 = 600;
            float f11 = 5 / f10;
            Modifier modifierStatusBarsPadding = WindowInsetsPadding_androidKt.statusBarsPadding(SizeKt.m18149heightInVpY3zN4$default(PaddingKt.m18118paddingqDBjuR0$default(BackgroundKt.m17623backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Color.INSTANCE.m21446getWhite0d7_KjU(), null, 2, null), 0.0f, 0.0f, C3115Dp.m23994constructorimpl((Resources.getSystem().getDisplayMetrics().widthPixels / Resources.getSystem().getDisplayMetrics().density) * f11), 0.0f, 11, null), C3115Dp.m23994constructorimpl((23 / f10) * (Resources.getSystem().getDisplayMetrics().widthPixels / Resources.getSystem().getDisplayMetrics().density)), 0.0f, 2, null));
            Alignment.Companion companion2 = Alignment.INSTANCE;
            Alignment.Vertical centerVertically = companion2.getCenterVertically();
            Arrangement arrangement = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getSpaceBetween(), centerVertically, composerStartRestartGroup, 54);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierStatusBarsPadding);
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
            Updater.m20858setimpl(composerM20851constructorimpl, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m20858setimpl(composerM20851constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (composerM20851constructorimpl.getInserting() || !Intrinsics.areEqual(composerM20851constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM20851constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM20851constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m20858setimpl(composerM20851constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement.getStart(), companion2.getCenterVertically(), composerStartRestartGroup, 48);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion);
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
            Composer composerM20851constructorimpl2 = Updater.m20851constructorimpl(composerStartRestartGroup);
            Updater.m20858setimpl(composerM20851constructorimpl2, measurePolicyRowMeasurePolicy2, companion3.getSetMeasurePolicy());
            Updater.m20858setimpl(composerM20851constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
            if (composerM20851constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM20851constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM20851constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM20851constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m20858setimpl(composerM20851constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
            SpacerKt.Spacer(SizeKt.m18166width3ABfNKs(companion, C3115Dp.m23994constructorimpl((8 / f10) * (Resources.getSystem().getDisplayMetrics().widthPixels / Resources.getSystem().getDisplayMetrics().density))), composerStartRestartGroup, 6);
            int i12 = i11;
            AbstractC5312c.m2673a(avatar, null, SizeKt.m18161size3ABfNKs(companion, C3115Dp.m23994constructorimpl((14 / f10) * (Resources.getSystem().getDisplayMetrics().widthPixels / Resources.getSystem().getDisplayMetrics().density))), PainterResources_androidKt.painterResource(R.drawable.icon_avatar, composerStartRestartGroup, 0), PainterResources_androidKt.painterResource(R.drawable.icon_avatar, composerStartRestartGroup, 0), null, null, null, null, null, null, 0.0f, null, 0, false, composerStartRestartGroup, (i11 & 14) | 432, 0, 32736);
            SpacerKt.Spacer(SizeKt.m18166width3ABfNKs(companion, C3115Dp.m23994constructorimpl((3 / f10) * (Resources.getSystem().getDisplayMetrics().widthPixels / Resources.getSystem().getDisplayMetrics().density))), composerStartRestartGroup, 6);
            TextKt.m19863Text4IGK_g(username, PaddingKt.m18118paddingqDBjuR0$default(SizeKt.m18166width3ABfNKs(companion, C3115Dp.m23994constructorimpl((39 / f10) * (Resources.getSystem().getDisplayMetrics().widthPixels / Resources.getSystem().getDisplayMetrics().density))), 0.0f, 0.0f, C3115Dp.m23994constructorimpl(f11 * (Resources.getSystem().getDisplayMetrics().widthPixels / Resources.getSystem().getDisplayMetrics().density)), 0.0f, 11, null), AbstractC9768a.m16544f(), AbstractC8136b.m13036d(8), (FontStyle) null, FontWeight.INSTANCE.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.INSTANCE.m23930getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, ((i12 >> 3) & 14) | 200112, 3120, 120784);
            TextKt.m19863Text4IGK_g("已选（" + i9 + "个）", (Modifier) null, i9 > 0 ? AbstractC9768a.m16549k() : AbstractC9768a.m16543e(), AbstractC8136b.m13036d(8), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 3072, 0, 131058);
            composerStartRestartGroup = composerStartRestartGroup;
            composerStartRestartGroup.endNode();
            MeasurePolicy measurePolicyRowMeasurePolicy3 = RowKt.rowMeasurePolicy(arrangement.getStart(), companion2.getTop(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion);
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
            Composer composerM20851constructorimpl3 = Updater.m20851constructorimpl(composerStartRestartGroup);
            Updater.m20858setimpl(composerM20851constructorimpl3, measurePolicyRowMeasurePolicy3, companion3.getSetMeasurePolicy());
            Updater.m20858setimpl(composerM20851constructorimpl3, currentCompositionLocalMap3, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion3.getSetCompositeKeyHash();
            if (composerM20851constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM20851constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                composerM20851constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                composerM20851constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
            }
            Updater.m20858setimpl(composerM20851constructorimpl3, modifierMaterializeModifier3, companion3.getSetModifier());
            float f12 = 4 / f10;
            PaddingValues paddingValuesM18109PaddingValuesYgX7TsA$default = PaddingKt.m18109PaddingValuesYgX7TsA$default(C3115Dp.m23994constructorimpl((Resources.getSystem().getDisplayMetrics().widthPixels / Resources.getSystem().getDisplayMetrics().density) * f12), 0.0f, 2, null);
            C9497d c9497d = C9497d.f16548a;
            ButtonKt.TextButton(onItemsMoveAction, null, false, null, null, null, null, paddingValuesM18109PaddingValuesYgX7TsA$default, null, c9497d.m15703e(), composerStartRestartGroup, ((i12 >> 6) & 14) | 817889280, 382);
            ButtonKt.TextButton(onCancelAction, null, false, null, null, null, null, PaddingKt.m18109PaddingValuesYgX7TsA$default(C3115Dp.m23994constructorimpl((Resources.getSystem().getDisplayMetrics().widthPixels / Resources.getSystem().getDisplayMetrics().density) * f12), 0.0f, 2, null), null, c9497d.m15704f(), composerStartRestartGroup, ((i12 >> 9) & 14) | 817889280, 382);
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: s6.y1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return HomeScreensKt.m10806N(avatar, username, onItemsMoveAction, onCancelAction, i9, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: N */
    public static final Unit m10806N(String str, String str2, Function0 function0, Function0 function02, int i9, int i10, Composer composer, int i11) {
        m10805M(str, str2, function0, function02, i9, composer, RecomposeScopeImplKt.updateChangedFlags(i10 | 1));
        return Unit.INSTANCE;
    }

    /* renamed from: O */
    public static final void m10807O(final String avatar, String keyword, final String username, final Long l9, final C9526k0 filterConditions, Function1 onTextChanged, final Function1 onDrawerOpenClick, final Function1 onSearch, Composer composer, final int i9) {
        int i10;
        final String str;
        final Function1 function1;
        Composer composer2;
        Intrinsics.checkNotNullParameter(avatar, "avatar");
        Intrinsics.checkNotNullParameter(keyword, "keyword");
        Intrinsics.checkNotNullParameter(username, "username");
        Intrinsics.checkNotNullParameter(filterConditions, "filterConditions");
        Intrinsics.checkNotNullParameter(onTextChanged, "onTextChanged");
        Intrinsics.checkNotNullParameter(onDrawerOpenClick, "onDrawerOpenClick");
        Intrinsics.checkNotNullParameter(onSearch, "onSearch");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1010862452);
        if ((i9 & 6) == 0) {
            i10 = (composerStartRestartGroup.changed(avatar) ? 4 : 2) | i9;
        } else {
            i10 = i9;
        }
        if ((i9 & 48) == 0) {
            i10 |= composerStartRestartGroup.changed(keyword) ? 32 : 16;
        }
        if ((i9 & 384) == 0) {
            i10 |= composerStartRestartGroup.changed(username) ? 256 : 128;
        }
        if ((i9 & 3072) == 0) {
            i10 |= composerStartRestartGroup.changed(l9) ? 2048 : 1024;
        }
        if ((i9 & 24576) == 0) {
            i10 |= composerStartRestartGroup.changedInstance(filterConditions) ? 16384 : 8192;
        }
        if ((196608 & i9) == 0) {
            i10 |= composerStartRestartGroup.changedInstance(onTextChanged) ? 131072 : 65536;
        }
        if ((1572864 & i9) == 0) {
            i10 |= composerStartRestartGroup.changedInstance(onDrawerOpenClick) ? 1048576 : 524288;
        }
        if ((12582912 & i9) == 0) {
            i10 |= composerStartRestartGroup.changedInstance(onSearch) ? 8388608 : 4194304;
        }
        if (composerStartRestartGroup.shouldExecute((4793491 & i10) != 4793490, i10 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1010862452, i10, -1, "com.zykj.student.dialogue.ui.home.HomeTitleWithSearch (HomeScreens.kt:44)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            Color.Companion companion2 = Color.INSTANCE;
            float f10 = 600;
            Modifier modifierStatusBarsPadding = WindowInsetsPadding_androidKt.statusBarsPadding(SizeKt.m18149heightInVpY3zN4$default(BackgroundKt.m17623backgroundbw27NRU$default(modifierFillMaxWidth$default, companion2.m21446getWhite0d7_KjU(), null, 2, null), C3115Dp.m23994constructorimpl((23 / f10) * (Resources.getSystem().getDisplayMetrics().widthPixels / Resources.getSystem().getDisplayMetrics().density)), 0.0f, 2, null));
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getCenterVertically(), composerStartRestartGroup, 48);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierStatusBarsPadding);
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
            Updater.m20858setimpl(composerM20851constructorimpl, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m20858setimpl(composerM20851constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (composerM20851constructorimpl.getInserting() || !Intrinsics.areEqual(composerM20851constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM20851constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM20851constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m20858setimpl(composerM20851constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            SpacerKt.Spacer(SizeKt.m18166width3ABfNKs(companion, C3115Dp.m23994constructorimpl((8 / f10) * (Resources.getSystem().getDisplayMetrics().widthPixels / Resources.getSystem().getDisplayMetrics().density))), composerStartRestartGroup, 6);
            int i11 = i10;
            AbstractC5312c.m2673a(avatar, null, SizeKt.m18161size3ABfNKs(companion, C3115Dp.m23994constructorimpl((14 / f10) * (Resources.getSystem().getDisplayMetrics().widthPixels / Resources.getSystem().getDisplayMetrics().density))), PainterResources_androidKt.painterResource(R.drawable.icon_avatar, composerStartRestartGroup, 0), PainterResources_androidKt.painterResource(R.drawable.icon_avatar, composerStartRestartGroup, 0), null, null, null, null, null, null, 0.0f, null, 0, false, composerStartRestartGroup, (i10 & 14) | 432, 0, 32736);
            SpacerKt.Spacer(SizeKt.m18166width3ABfNKs(companion, C3115Dp.m23994constructorimpl((3 / f10) * (Resources.getSystem().getDisplayMetrics().widthPixels / Resources.getSystem().getDisplayMetrics().density))), composerStartRestartGroup, 6);
            TextKt.m19863Text4IGK_g(username, PaddingKt.m18118paddingqDBjuR0$default(SizeKt.m18166width3ABfNKs(companion, C3115Dp.m23994constructorimpl((40 / f10) * (Resources.getSystem().getDisplayMetrics().widthPixels / Resources.getSystem().getDisplayMetrics().density))), 0.0f, 0.0f, C3115Dp.m23994constructorimpl((5 / f10) * (Resources.getSystem().getDisplayMetrics().widthPixels / Resources.getSystem().getDisplayMetrics().density)), 0.0f, 11, null), AbstractC9768a.m16544f(), AbstractC8136b.m13036d(8), (FontStyle) null, FontWeight.INSTANCE.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.INSTANCE.m23930getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, ((i11 >> 6) & 14) | 200112, 3120, 120784);
            str = keyword;
            function1 = onTextChanged;
            SurfaceKt.m19713SurfaceT9BRK9s(null, RoundedCornerShapeKt.m18407RoundedCornerShape0680j_4(C3115Dp.m23994constructorimpl((7 / f10) * (Resources.getSystem().getDisplayMetrics().widthPixels / Resources.getSystem().getDisplayMetrics().density))), companion2.m21446getWhite0d7_KjU(), 0L, 0.0f, 0.0f, BorderStrokeKt.m17650BorderStrokecXLIe8U(C3115Dp.m23994constructorimpl(1.0f), AbstractC9768a.m16549k()), ComposableLambdaKt.rememberComposableLambda(-321835637, true, new Function2() { // from class: s6.n2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return HomeScreensKt.m10808P(function1, onSearch, str, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 14156160, 57);
            SpacerKt.Spacer(RowScope.weight$default(rowScopeInstance, companion, 1.0f, false, 2, null), composerStartRestartGroup, 0);
            long id = CatalogResp.INSTANCE.getHISTORY_COLLECT().getId();
            if (l9 != null && l9.longValue() == id) {
                composerStartRestartGroup.startReplaceGroup(934535222);
                composer2 = composerStartRestartGroup;
                m10839z(null, filterConditions, onDrawerOpenClick, composer2, ((i11 >> 9) & 112) | ((i11 >> 12) & 896), 1);
                composer2.endReplaceGroup();
            } else {
                composer2 = composerStartRestartGroup;
                composer2.startReplaceGroup(934727453);
                m10834u(null, filterConditions, onDrawerOpenClick, composer2, ((i11 >> 9) & 112) | ((i11 >> 12) & 896), 1);
                composer2.endReplaceGroup();
            }
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            str = keyword;
            function1 = onTextChanged;
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final String str2 = str;
            final Function1 function12 = function1;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: s6.o2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return HomeScreensKt.m10810R(avatar, str2, username, l9, filterConditions, function12, onDrawerOpenClick, onSearch, i9, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: P */
    public static final Unit m10808P(Function1 function1, final Function1 function12, String str, Composer composer, int i9) throws Resources.NotFoundException {
        if (composer.shouldExecute((i9 & 3) != 2, i9 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-321835637, i9, -1, "com.zykj.student.dialogue.ui.home.HomeTitleWithSearch.<anonymous>.<anonymous> (HomeScreens.kt:78)");
            }
            TextStyle textStyle = new TextStyle(AbstractC9768a.m16540b(), AbstractC8136b.m13036d(8), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777212, (DefaultConstructorMarker) null);
            TextStyle textStyle2 = new TextStyle(AbstractC9768a.m16545g(), AbstractC8136b.m13036d(8), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777212, (DefaultConstructorMarker) null);
            float f10 = 600;
            Modifier modifierM18163sizeVpY3zN4 = SizeKt.m18163sizeVpY3zN4(Modifier.INSTANCE, C3115Dp.m23994constructorimpl((188 / f10) * (Resources.getSystem().getDisplayMetrics().widthPixels / Resources.getSystem().getDisplayMetrics().density)), C3115Dp.m23994constructorimpl((14 / f10) * (Resources.getSystem().getDisplayMetrics().widthPixels / Resources.getSystem().getDisplayMetrics().density)));
            String strStringResource = StringResources_androidKt.stringResource(R.string.home_search_hint, composer, 0);
            Function2 function2M15702d = C9497d.f16548a.m15702d();
            boolean zChanged = composer.changed(function12);
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: s6.d2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return HomeScreensKt.m10809Q(function12);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            AbstractC9887b0.m16938h(modifierM18163sizeVpY3zN4, strStringResource, function1, function2M15702d, (Function0) objRememberedValue, null, function12, textStyle, textStyle2, true, str, 0, false, composer, 918555654, 0, 6176);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* renamed from: Q */
    public static final Unit m10809Q(Function1 function1) {
        function1.invoke("");
        return Unit.INSTANCE;
    }

    /* renamed from: R */
    public static final Unit m10810R(String str, String str2, String str3, Long l9, C9526k0 c9526k0, Function1 function1, Function1 function12, Function1 function13, int i9, Composer composer, int i10) {
        m10807O(str, str2, str3, l9, c9526k0, function1, function12, function13, composer, RecomposeScopeImplKt.updateChangedFlags(i9 | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:132:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:137:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d3  */
    /* renamed from: S */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m10811S(final java.lang.String r33, final int r34, long r35, long r37, boolean r39, boolean r40, final kotlin.jvm.functions.Function0 r41, androidx.compose.runtime.Composer r42, final int r43, final int r44) {
        /*
            Method dump skipped, instructions count: 859
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.student.dialogue.p076ui.home.HomeScreensKt.m10811S(java.lang.String, int, long, long, boolean, boolean, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void"); // DEX body: android/随身答/smali_classes5/com/zykj/student/dialogue/ui/home/HomeScreensKt.smali:8422
    }

    /* renamed from: T */
    public static final Unit m10812T(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* renamed from: U */
    public static final Unit m10813U(String str, int i9, long j9, long j10, boolean z9, boolean z10, Function0 function0, int i10, int i11, Composer composer, int i12) {
        m10811S(str, i9, j9, j10, z9, z10, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i10 | 1), i11);
        return Unit.INSTANCE;
    }

    /* renamed from: u */
    public static final void m10834u(Modifier modifier, final C9526k0 filterConditions, final Function1 onDrawerOpenClick, Composer composer, final int i9, final int i10) {
        Modifier modifier2;
        int i11;
        final Modifier modifier3;
        Intrinsics.checkNotNullParameter(filterConditions, "filterConditions");
        Intrinsics.checkNotNullParameter(onDrawerOpenClick, "onDrawerOpenClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(1159642186);
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
            i11 |= composerStartRestartGroup.changedInstance(filterConditions) ? 32 : 16;
        }
        if ((i9 & 384) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(onDrawerOpenClick) ? 256 : 128;
        }
        if (composerStartRestartGroup.shouldExecute((i11 & 147) != 146, i11 & 1)) {
            modifier3 = i12 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1159642186, i11, -1, "com.zykj.student.dialogue.ui.home.FilterContent (HomeScreens.kt:266)");
            }
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getCenterVertically(), composerStartRestartGroup, 48);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier3);
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
            Composer composerM20851constructorimpl = Updater.m20851constructorimpl(composerStartRestartGroup);
            Updater.m20858setimpl(composerM20851constructorimpl, measurePolicyRowMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m20858setimpl(composerM20851constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (composerM20851constructorimpl.getInserting() || !Intrinsics.areEqual(composerM20851constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM20851constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM20851constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m20858setimpl(composerM20851constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            String label = filterConditions.m15722h().getLabel();
            int i13 = i11 & 896;
            boolean z9 = i13 == 256;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z9 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: s6.p2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return HomeScreensKt.m10835v(onDrawerOpenClick);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            AbstractC9522j0.m15711g(label, (Function0) objRememberedValue, null, filterConditions.m15727m(), null, composerStartRestartGroup, 0, 20);
            int iM15717c = filterConditions.m15717c();
            boolean z10 = filterConditions.m15717c() > 0;
            boolean z11 = i13 == 256;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (z11 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: s6.q2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return HomeScreensKt.m10836w(onDrawerOpenClick);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            AbstractC9522j0.m15711g("筛选", (Function0) objRememberedValue2, null, z10, Integer.valueOf(iM15717c), composerStartRestartGroup, 6, 4);
            String sortLabel = filterConditions.m15721g().getSortLabel();
            boolean z12 = i13 == 256;
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (z12 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new Function0() { // from class: s6.r2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return HomeScreensKt.m10837x(onDrawerOpenClick);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            AbstractC9522j0.m15711g(sortLabel, (Function0) objRememberedValue3, null, true, null, composerStartRestartGroup, 3072, 20);
            SpacerKt.Spacer(SizeKt.m18166width3ABfNKs(Modifier.INSTANCE, C3115Dp.m23994constructorimpl((2 / 600) * (Resources.getSystem().getDisplayMetrics().widthPixels / Resources.getSystem().getDisplayMetrics().density))), composerStartRestartGroup, 6);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: s6.z1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return HomeScreensKt.m10838y(modifier3, filterConditions, onDrawerOpenClick, i9, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: v */
    public static final Unit m10835v(Function1 function1) {
        function1.invoke(AbstractC7593a.d.f11731a);
        return Unit.INSTANCE;
    }

    /* renamed from: w */
    public static final Unit m10836w(Function1 function1) {
        function1.invoke(AbstractC7593a.b.f11729a);
        return Unit.INSTANCE;
    }

    /* renamed from: x */
    public static final Unit m10837x(Function1 function1) {
        function1.invoke(AbstractC7593a.c.f11730a);
        return Unit.INSTANCE;
    }

    /* renamed from: y */
    public static final Unit m10838y(Modifier modifier, C9526k0 c9526k0, Function1 function1, int i9, int i10, Composer composer, int i11) {
        m10834u(modifier, c9526k0, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i9 | 1), i10);
        return Unit.INSTANCE;
    }

    /* renamed from: z */
    public static final void m10839z(Modifier modifier, final C9526k0 filterConditions, final Function1 onDrawerOpenClick, Composer composer, final int i9, final int i10) {
        Modifier modifier2;
        int i11;
        final Modifier modifier3;
        String label;
        Intrinsics.checkNotNullParameter(filterConditions, "filterConditions");
        Intrinsics.checkNotNullParameter(onDrawerOpenClick, "onDrawerOpenClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(758946054);
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
            i11 |= composerStartRestartGroup.changedInstance(filterConditions) ? 32 : 16;
        }
        if ((i9 & 384) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(onDrawerOpenClick) ? 256 : 128;
        }
        if (composerStartRestartGroup.shouldExecute((i11 & 147) != 146, i11 & 1)) {
            Modifier modifier4 = i12 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(758946054, i11, -1, "com.zykj.student.dialogue.ui.home.FilterFavoriteContent (HomeScreens.kt:218)");
            }
            Alignment.Companion companion = Alignment.INSTANCE;
            Alignment.Vertical centerVertically = companion.getCenterVertically();
            Arrangement arrangement = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), centerVertically, composerStartRestartGroup, 48);
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
            Updater.m20858setimpl(composerM20851constructorimpl, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m20858setimpl(composerM20851constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM20851constructorimpl.getInserting() || !Intrinsics.areEqual(composerM20851constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM20851constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM20851constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m20858setimpl(composerM20851constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            String label2 = filterConditions.m15722h().getLabel();
            int i13 = i11 & 896;
            boolean z9 = i13 == 256;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z9 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: s6.a2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return HomeScreensKt.m10793A(onDrawerOpenClick);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            AbstractC9522j0.m15711g(label2, (Function0) objRememberedValue, null, filterConditions.m15727m(), null, composerStartRestartGroup, 0, 20);
            Modifier.Companion companion3 = Modifier.INSTANCE;
            boolean z10 = i13 == 256;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (z10 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: s6.b2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return HomeScreensKt.m10794B(onDrawerOpenClick);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            float f10 = 600;
            Modifier modifierM18116paddingVpY3zN4$default = PaddingKt.m18116paddingVpY3zN4$default(ClickableKt.m17657clickableXHw0xAI$default(companion3, false, null, null, (Function0) objRememberedValue2, 7, null), 0.0f, C3115Dp.m23994constructorimpl((3 / f10) * (Resources.getSystem().getDisplayMetrics().widthPixels / Resources.getSystem().getDisplayMetrics().density)), 1, null);
            MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement.getStart(), companion.getCenterVertically(), composerStartRestartGroup, 48);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM18116paddingVpY3zN4$default);
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
            Updater.m20858setimpl(composerM20851constructorimpl2, measurePolicyRowMeasurePolicy2, companion2.getSetMeasurePolicy());
            Updater.m20858setimpl(composerM20851constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
            if (composerM20851constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM20851constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM20851constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM20851constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m20858setimpl(composerM20851constructorimpl2, modifierMaterializeModifier2, companion2.getSetModifier());
            FilterType.Time.FavoriteTime favoriteTimeM15718d = filterConditions.m15718d();
            boolean zAreEqual = Intrinsics.areEqual(filterConditions.m15718d(), HomeKt.getInitialFavoriteTime());
            boolean z11 = !zAreEqual;
            if (!(favoriteTimeM15718d instanceof FilterType.Time.FavoriteTime.Custom) || !((FilterType.Time.FavoriteTime.Custom) favoriteTimeM15718d).hasTimeRange()) {
                label = favoriteTimeM15718d.getLabel();
            } else if (favoriteTimeM15718d.getStartDateTime().length() > 0 && favoriteTimeM15718d.getEndDateTime().length() > 0) {
                label = favoriteTimeM15718d.parseStartTime() + "~" + favoriteTimeM15718d.parseEndTime();
            } else if (favoriteTimeM15718d.getStartDateTime().length() > 0) {
                label = favoriteTimeM15718d.getStartDateTime() + "以后";
            } else {
                label = favoriteTimeM15718d.getEndDateTime() + "以前";
            }
            Modifier modifier5 = modifier4;
            TextKt.m19863Text4IGK_g(label, (Modifier) null, !zAreEqual ? AbstractC9768a.m16549k() : AbstractC9768a.m16540b(), AbstractC8136b.m13036d(8), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 3072, 0, 131058);
            composerStartRestartGroup = composerStartRestartGroup;
            SpacerKt.Spacer(SizeKt.m18166width3ABfNKs(companion3, C3115Dp.m23994constructorimpl((2 / f10) * (Resources.getSystem().getDisplayMetrics().widthPixels / Resources.getSystem().getDisplayMetrics().density))), composerStartRestartGroup, 6);
            AbstractC9114o.m14652b(z11, composerStartRestartGroup, 0);
            SpacerKt.Spacer(SizeKt.m18166width3ABfNKs(companion3, C3115Dp.m23994constructorimpl((7 / f10) * (Resources.getSystem().getDisplayMetrics().widthPixels / Resources.getSystem().getDisplayMetrics().density))), composerStartRestartGroup, 6);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: s6.c2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return HomeScreensKt.m10795C(modifier3, filterConditions, onDrawerOpenClick, i9, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
