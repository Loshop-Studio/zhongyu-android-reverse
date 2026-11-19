package p180m6;

import android.content.res.Resources;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.foundation.lazy.grid.GridCells;
import androidx.compose.foundation.lazy.grid.LazyGridDslKt;
import androidx.compose.foundation.lazy.grid.LazyGridItemScope;
import androidx.compose.foundation.lazy.grid.LazyGridScope;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p012ui.Alignment;
import androidx.compose.p012ui.ComposedModifierKt;
import androidx.compose.p012ui.Modifier;
import androidx.compose.p012ui.draw.ClipKt;
import androidx.compose.p012ui.geometry.Offset;
import androidx.compose.p012ui.graphics.Color;
import androidx.compose.p012ui.graphics.ColorFilter;
import androidx.compose.p012ui.graphics.ColorKt;
import androidx.compose.p012ui.graphics.PathEffect;
import androidx.compose.p012ui.graphics.Shadow;
import androidx.compose.p012ui.graphics.drawscope.DrawScope;
import androidx.compose.p012ui.graphics.drawscope.DrawStyle;
import androidx.compose.p012ui.layout.ContentScale;
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
import androidx.compose.p012ui.text.input.ImeAction;
import androidx.compose.p012ui.text.input.PlatformImeOptions;
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
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.taobao.sophix.PatchStatus;
import com.zykj.student.dialogue.R;
import com.zykj.student.dialogue.bean.resp.CourseItem;
import com.zykj.student.dialogue.p076ui.ask.AskQuestionViewModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p128h6.AbstractC8103b;
import p138i6.AbstractC8136b;
import p274v6.AbstractC9768a;
import p294x6.AbstractC9887b0;
import p294x6.AbstractC9902q;

/* renamed from: m6.d0 */
/* loaded from: classes5.dex */
public abstract class AbstractC8991d0 {
    /* renamed from: l */
    public static final void m14356l(final boolean z9, final CourseItem item, final Function1 onItemClickListener, Composer composer, final int i9) {
        int i10;
        Composer composer2;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(onItemClickListener, "onItemClickListener");
        Composer composerStartRestartGroup = composer.startRestartGroup(558907075);
        if ((i9 & 6) == 0) {
            i10 = (composerStartRestartGroup.changed(z9) ? 4 : 2) | i9;
        } else {
            i10 = i9;
        }
        if ((i9 & 48) == 0) {
            i10 |= composerStartRestartGroup.changed(item) ? 32 : 16;
        }
        if ((i9 & 384) == 0) {
            i10 |= composerStartRestartGroup.changedInstance(onItemClickListener) ? 256 : 128;
        }
        if (composerStartRestartGroup.shouldExecute((i10 & 147) != 146, i10 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(558907075, i10, -1, "com.zykj.student.dialogue.ui.ask.AskQuestionCourseItem (AskQuestionScreens.kt:178)");
            }
            float f10 = 600;
            Modifier modifierM18116paddingVpY3zN4$default = PaddingKt.m18116paddingVpY3zN4$default(BackgroundKt.m17623backgroundbw27NRU$default(ClipKt.clip(SizeKt.m18147height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), C3115Dp.m23994constructorimpl((23 / f10) * (Resources.getSystem().getDisplayMetrics().widthPixels / Resources.getSystem().getDisplayMetrics().density))), RoundedCornerShapeKt.m18407RoundedCornerShape0680j_4(C3115Dp.m23994constructorimpl((12 / f10) * (Resources.getSystem().getDisplayMetrics().widthPixels / Resources.getSystem().getDisplayMetrics().density)))), z9 ? AbstractC9768a.m16541c() : Color.INSTANCE.m21446getWhite0d7_KjU(), null, 2, null), C3115Dp.m23994constructorimpl((10 / f10) * (Resources.getSystem().getDisplayMetrics().widthPixels / Resources.getSystem().getDisplayMetrics().density)), 0.0f, 2, null);
            boolean z10 = ((i10 & 896) == 256) | ((i10 & 112) == 32);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z10 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: m6.c0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AbstractC8991d0.m14357m(onItemClickListener, item);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            Modifier modifierM17657clickableXHw0xAI$default = ClickableKt.m17657clickableXHw0xAI$default(modifierM18116paddingVpY3zN4$default, false, null, null, (Function0) objRememberedValue, 7, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getCenter(), false);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM17657clickableXHw0xAI$default);
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
            Updater.m20858setimpl(composerM20851constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m20858setimpl(composerM20851constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (composerM20851constructorimpl.getInserting() || !Intrinsics.areEqual(composerM20851constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM20851constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM20851constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m20858setimpl(composerM20851constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            composer2 = composerStartRestartGroup;
            TextKt.m19863Text4IGK_g(item.getTitle(), (Modifier) null, z9 ? AbstractC9768a.m16549k() : AbstractC9768a.m16544f(), AbstractC8136b.m13036d(7), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.INSTANCE.m23930getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 3072, 3120, 120818);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: m6.t
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AbstractC8991d0.m14358n(z9, item, onItemClickListener, i9, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: m */
    public static final Unit m14357m(Function1 function1, CourseItem courseItem) {
        function1.invoke(courseItem);
        return Unit.INSTANCE;
    }

    /* renamed from: n */
    public static final Unit m14358n(boolean z9, CourseItem courseItem, Function1 function1, int i9, Composer composer, int i10) {
        m14356l(z9, courseItem, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i9 | 1));
        return Unit.INSTANCE;
    }

    /* renamed from: o */
    public static final void m14359o(Modifier modifier, final CourseItem courseItem, final List courseItems, final Function1 onItemClickListener, Composer composer, final int i9, final int i10) {
        Modifier modifier2;
        int i11;
        Composer composer2;
        final Modifier modifier3;
        Modifier modifier4;
        Intrinsics.checkNotNullParameter(courseItems, "courseItems");
        Intrinsics.checkNotNullParameter(onItemClickListener, "onItemClickListener");
        Composer composerStartRestartGroup = composer.startRestartGroup(212160510);
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
            i11 |= composerStartRestartGroup.changed(courseItem) ? 32 : 16;
        }
        if ((i9 & 384) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(courseItems) ? 256 : 128;
        }
        if ((i9 & 3072) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(onItemClickListener) ? 2048 : 1024;
        }
        if (composerStartRestartGroup.shouldExecute((i11 & 1171) != 1170, i11 & 1)) {
            Modifier modifier5 = i12 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(212160510, i11, -1, "com.zykj.student.dialogue.ui.ask.AskQuestionCourseListContent (AskQuestionScreens.kt:139)");
            }
            if (courseItems.isEmpty()) {
                composerStartRestartGroup.startReplaceGroup(-1717866980);
                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getCenter(), Alignment.INSTANCE.getCenterHorizontally(), composerStartRestartGroup, 54);
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifier5);
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
                Updater.m20858setimpl(composerM20851constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
                Updater.m20858setimpl(composerM20851constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                if (composerM20851constructorimpl.getInserting() || !Intrinsics.areEqual(composerM20851constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM20851constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM20851constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m20858setimpl(composerM20851constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.icon_empty_place_holder, composerStartRestartGroup, 0), (String) null, (Modifier) null, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 48, 124);
                composer2 = composerStartRestartGroup;
                TextKt.m19863Text4IGK_g("暂无课程", (Modifier) null, AbstractC9768a.m16543e(), AbstractC8136b.m13036d(8), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 3462, 0, 131058);
                composer2.endNode();
                composer2.endReplaceGroup();
                modifier4 = modifier5;
            } else {
                composerStartRestartGroup.startReplaceGroup(-1717434561);
                GridCells.Fixed fixed = new GridCells.Fixed(5);
                float f10 = 9 / 600;
                PaddingValues paddingValuesM18107PaddingValues0680j_4 = PaddingKt.m18107PaddingValues0680j_4(C3115Dp.m23994constructorimpl((Resources.getSystem().getDisplayMetrics().widthPixels / Resources.getSystem().getDisplayMetrics().density) * f10));
                Arrangement arrangement = Arrangement.INSTANCE;
                Arrangement.HorizontalOrVertical horizontalOrVerticalM17995spacedBy0680j_4 = arrangement.m17995spacedBy0680j_4(C3115Dp.m23994constructorimpl((Resources.getSystem().getDisplayMetrics().widthPixels / Resources.getSystem().getDisplayMetrics().density) * f10));
                Arrangement.HorizontalOrVertical horizontalOrVerticalM17995spacedBy0680j_42 = arrangement.m17995spacedBy0680j_4(C3115Dp.m23994constructorimpl(f10 * (Resources.getSystem().getDisplayMetrics().widthPixels / Resources.getSystem().getDisplayMetrics().density)));
                boolean zChangedInstance = composerStartRestartGroup.changedInstance(courseItems) | ((i11 & 112) == 32) | ((i11 & 7168) == 2048);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: m6.z
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return AbstractC8991d0.m14360p(courseItems, courseItem, onItemClickListener, (LazyGridScope) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                int i13 = ((i11 << 3) & 112) | 1772544;
                composer2 = composerStartRestartGroup;
                modifier4 = modifier5;
                LazyGridDslKt.LazyVerticalGrid(fixed, modifier4, null, paddingValuesM18107PaddingValues0680j_4, false, horizontalOrVerticalM17995spacedBy0680j_42, horizontalOrVerticalM17995spacedBy0680j_4, null, false, null, (Function1) objRememberedValue, composer2, i13, 0, 916);
                composer2.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier4;
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
            modifier3 = modifier2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: m6.a0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AbstractC8991d0.m14362r(modifier3, courseItem, courseItems, onItemClickListener, i9, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: p */
    public static final Unit m14360p(final List list, final CourseItem courseItem, final Function1 function1, LazyGridScope LazyVerticalGrid) {
        Intrinsics.checkNotNullParameter(LazyVerticalGrid, "$this$LazyVerticalGrid");
        LazyGridScope.items$default(LazyVerticalGrid, list.size(), null, null, null, ComposableLambdaKt.composableLambdaInstance(410531765, true, new Function4() { // from class: m6.b0
            @Override // kotlin.jvm.functions.Function4
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                return AbstractC8991d0.m14361q(courseItem, list, function1, (LazyGridItemScope) obj, ((Integer) obj2).intValue(), (Composer) obj3, ((Integer) obj4).intValue());
            }
        }), 14, null);
        return Unit.INSTANCE;
    }

    /* renamed from: q */
    public static final Unit m14361q(CourseItem courseItem, List list, Function1 function1, LazyGridItemScope items, int i9, Composer composer, int i10) {
        Intrinsics.checkNotNullParameter(items, "$this$items");
        if ((i10 & 48) == 0) {
            i10 |= composer.changed(i9) ? 32 : 16;
        }
        if (composer.shouldExecute((i10 & 145) != 144, i10 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(410531765, i10, -1, "com.zykj.student.dialogue.ui.ask.AskQuestionCourseListContent.<anonymous>.<anonymous>.<anonymous> (AskQuestionScreens.kt:158)");
            }
            m14356l(Intrinsics.areEqual(courseItem, list.get(i9)), (CourseItem) list.get(i9), function1, composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* renamed from: r */
    public static final Unit m14362r(Modifier modifier, CourseItem courseItem, List list, Function1 function1, int i9, int i10, Composer composer, int i11) {
        m14359o(modifier, courseItem, list, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i9 | 1), i10);
        return Unit.INSTANCE;
    }

    /* renamed from: s */
    public static final void m14363s(final AskQuestionViewModel viewModel, final Function0 onClickBack, final Function2 onNextClick, Composer composer, final int i9) {
        int i10;
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(onClickBack, "onClickBack");
        Intrinsics.checkNotNullParameter(onNextClick, "onNextClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1079704447);
        if ((i9 & 6) == 0) {
            i10 = (composerStartRestartGroup.changedInstance(viewModel) ? 4 : 2) | i9;
        } else {
            i10 = i9;
        }
        if ((i9 & 48) == 0) {
            i10 |= composerStartRestartGroup.changedInstance(onClickBack) ? 32 : 16;
        }
        if ((i9 & 384) == 0) {
            i10 |= composerStartRestartGroup.changedInstance(onNextClick) ? 256 : 128;
        }
        if (composerStartRestartGroup.shouldExecute((i10 & 147) != 146, i10 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1079704447, i10, -1, "com.zykj.student.dialogue.ui.ask.AskQuestionScreen (AskQuestionScreens.kt:44)");
            }
            final State stateCollectAsState = SnapshotStateKt.collectAsState(viewModel.getUiState(), null, composerStartRestartGroup, 0, 1);
            SurfaceKt.m19713SurfaceT9BRK9s(WindowInsetsPadding_androidKt.statusBarsPadding(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null)), null, ColorKt.Color(4294243831L), 0L, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(1004026844, true, new Function2() { // from class: m6.s
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AbstractC8991d0.m14365u(viewModel, onClickBack, onNextClick, stateCollectAsState, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 12583296, PatchStatus.CODE_LOAD_RES_UPDATECONFIG);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: m6.u
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AbstractC8991d0.m14370z(viewModel, onClickBack, onNextClick, i9, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: t */
    public static final C8993e0 m14364t(State state) {
        return (C8993e0) state.getValue();
    }

    /* renamed from: u */
    public static final Unit m14365u(final AskQuestionViewModel askQuestionViewModel, Function0 function0, final Function2 function2, final State state, Composer composer, int i9) throws Resources.NotFoundException {
        if (composer.shouldExecute((i9 & 3) != 2, i9 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1004026844, i9, -1, "com.zykj.student.dialogue.ui.ask.AskQuestionScreen.<anonymous> (AskQuestionScreens.kt:52)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Arrangement.Vertical top2 = Arrangement.INSTANCE.getTop();
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top2, companion2.getStart(), composer, 0);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, companion);
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
            float f10 = 600;
            float f11 = 23 / f10;
            Modifier modifierM18147height3ABfNKs = SizeKt.m18147height3ABfNKs(companion, C3115Dp.m23994constructorimpl((Resources.getSystem().getDisplayMetrics().widthPixels / Resources.getSystem().getDisplayMetrics().density) * f11));
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer, modifierM18147height3ABfNKs);
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
            Updater.m20858setimpl(composerM20851constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m20858setimpl(composerM20851constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
            if (composerM20851constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM20851constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM20851constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM20851constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m20858setimpl(composerM20851constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            AbstractC9902q.m16972g(null, 0, function0, composer, 0, 3);
            boolean zChangedInstance = composer.changedInstance(askQuestionViewModel) | composer.changed(function2) | composer.changed(state);
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: m6.v
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AbstractC8991d0.m14366v(askQuestionViewModel, function2, state);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            ButtonKt.TextButton((Function0) objRememberedValue, boxScopeInstance.align(companion, companion2.getCenterEnd()), false, null, null, null, null, null, null, C9003j0.f15125a.m14379b(), composer, 805306368, TypedValues.PositionType.TYPE_CURVE_FIT);
            composer.endNode();
            float f12 = 9 / f10;
            TextKt.m19863Text4IGK_g(StringResources_androidKt.stringResource(R.string.dialogue_question_desc, composer, 0), PaddingKt.m18118paddingqDBjuR0$default(companion, C3115Dp.m23994constructorimpl((Resources.getSystem().getDisplayMetrics().widthPixels / Resources.getSystem().getDisplayMetrics().density) * f12), C3115Dp.m23994constructorimpl((17 / f10) * (Resources.getSystem().getDisplayMetrics().widthPixels / Resources.getSystem().getDisplayMetrics().density)), 0.0f, 0.0f, 12, null), AbstractC9768a.m16540b(), AbstractC8136b.m13036d(8), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 3504, 0, 131056);
            Modifier modifierM18118paddingqDBjuR0$default = PaddingKt.m18118paddingqDBjuR0$default(BackgroundKt.m17622backgroundbw27NRU(SizeKt.m18163sizeVpY3zN4(PaddingKt.m18118paddingqDBjuR0$default(companion, C3115Dp.m23994constructorimpl((Resources.getSystem().getDisplayMetrics().widthPixels / Resources.getSystem().getDisplayMetrics().density) * f12), C3115Dp.m23994constructorimpl((Resources.getSystem().getDisplayMetrics().widthPixels / Resources.getSystem().getDisplayMetrics().density) * f12), 0.0f, 0.0f, 12, null), C3115Dp.m23994constructorimpl((291 / f10) * (Resources.getSystem().getDisplayMetrics().widthPixels / Resources.getSystem().getDisplayMetrics().density)), C3115Dp.m23994constructorimpl(f11 * (Resources.getSystem().getDisplayMetrics().widthPixels / Resources.getSystem().getDisplayMetrics().density))), Color.INSTANCE.m21446getWhite0d7_KjU(), RoundedCornerShapeKt.m18407RoundedCornerShape0680j_4(C3115Dp.m23994constructorimpl((12 / f10) * (Resources.getSystem().getDisplayMetrics().widthPixels / Resources.getSystem().getDisplayMetrics().density)))), C3115Dp.m23994constructorimpl((Resources.getSystem().getDisplayMetrics().widthPixels / Resources.getSystem().getDisplayMetrics().density) * f12), 0.0f, C3115Dp.m23994constructorimpl((Resources.getSystem().getDisplayMetrics().widthPixels / Resources.getSystem().getDisplayMetrics().density) * f12), 0.0f, 10, null);
            TextStyle textStyle = new TextStyle(AbstractC9768a.m16540b(), AbstractC8136b.m13036d(8), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777212, (DefaultConstructorMarker) null);
            TextStyle textStyle2 = new TextStyle(AbstractC9768a.m16546h(), AbstractC8136b.m13036d(8), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777212, (DefaultConstructorMarker) null);
            String strM14374d = m14364t(state).m14374d();
            String strStringResource = StringResources_androidKt.stringResource(R.string.dialogue_ask_question_input_hint, composer, 0);
            KeyboardOptions keyboardOptions = new KeyboardOptions(0, (Boolean) null, 0, ImeAction.INSTANCE.m23640getDoneeUduSuo(), (PlatformImeOptions) null, (Boolean) null, (LocaleList) null, 119, (DefaultConstructorMarker) null);
            boolean zChangedInstance2 = composer.changedInstance(askQuestionViewModel);
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function1() { // from class: m6.w
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return AbstractC8991d0.m14367w(askQuestionViewModel, (String) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            AbstractC9887b0.m16938h(modifierM18118paddingqDBjuR0$default, strStringResource, (Function1) objRememberedValue2, null, null, keyboardOptions, null, textStyle, textStyle2, false, strM14374d, 25, false, composer, 113442816, 48, 4696);
            float f13 = 14 / f10;
            SpacerKt.Spacer(SizeKt.m18147height3ABfNKs(companion, C3115Dp.m23994constructorimpl((Resources.getSystem().getDisplayMetrics().widthPixels / Resources.getSystem().getDisplayMetrics().density) * f13)), composer, 6);
            Modifier modifierM18147height3ABfNKs2 = SizeKt.m18147height3ABfNKs(PaddingKt.m18116paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), C3115Dp.m23994constructorimpl((Resources.getSystem().getDisplayMetrics().widthPixels / Resources.getSystem().getDisplayMetrics().density) * f12), 0.0f, 2, null), C3115Dp.m23994constructorimpl(1.0f));
            Object objRememberedValue3 = composer.rememberedValue();
            Composer.Companion companion4 = Composer.INSTANCE;
            if (objRememberedValue3 == companion4.getEmpty()) {
                objRememberedValue3 = new Function1() { // from class: m6.x
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return AbstractC8991d0.m14368x((DrawScope) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue3);
            }
            CanvasKt.Canvas(modifierM18147height3ABfNKs2, (Function1) objRememberedValue3, composer, 54);
            SpacerKt.Spacer(SizeKt.m18147height3ABfNKs(companion, C3115Dp.m23994constructorimpl(f13 * (Resources.getSystem().getDisplayMetrics().widthPixels / Resources.getSystem().getDisplayMetrics().density))), composer, 6);
            TextKt.m19863Text4IGK_g(StringResources_androidKt.stringResource(R.string.dialogue_choose_course, composer, 0), PaddingKt.m18118paddingqDBjuR0$default(companion, C3115Dp.m23994constructorimpl(f12 * (Resources.getSystem().getDisplayMetrics().widthPixels / Resources.getSystem().getDisplayMetrics().density)), 0.0f, 0.0f, 0.0f, 14, null), AbstractC9768a.m16540b(), AbstractC8136b.m13036d(8), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 3504, 0, 131056);
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
            List listM14375e = m14364t(state).m14375e();
            CourseItem courseItemM14373c = m14364t(state).m14373c();
            boolean zChangedInstance3 = composer.changedInstance(askQuestionViewModel);
            Object objRememberedValue4 = composer.rememberedValue();
            if (zChangedInstance3 || objRememberedValue4 == companion4.getEmpty()) {
                objRememberedValue4 = new Function1() { // from class: m6.y
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return AbstractC8991d0.m14369y(askQuestionViewModel, (CourseItem) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue4);
            }
            m14359o(modifierFillMaxSize$default, courseItemM14373c, listM14375e, (Function1) objRememberedValue4, composer, 6, 0);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* renamed from: v */
    public static final Unit m14366v(AskQuestionViewModel askQuestionViewModel, Function2 function2, State state) {
        String strM10068q = askQuestionViewModel.m10068q();
        if (strM10068q == null || strM10068q.length() == 0) {
            askQuestionViewModel.m9922g(new AbstractC8103b.a.c("必须先选择课程"));
            return Unit.INSTANCE;
        }
        function2.invoke(m14364t(state).m14374d(), strM10068q);
        return Unit.INSTANCE;
    }

    /* renamed from: w */
    public static final Unit m14367w(AskQuestionViewModel askQuestionViewModel, String SearchContent) {
        Intrinsics.checkNotNullParameter(SearchContent, "$this$SearchContent");
        askQuestionViewModel.m10066o(SearchContent);
        return Unit.INSTANCE;
    }

    /* renamed from: x */
    public static final Unit m14368x(DrawScope Canvas) {
        Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
        float fIntBitsToFloat = Float.intBitsToFloat((int) (Canvas.mo21960getSizeNHjbRc() >> 32));
        DrawScope.m21946drawLineNGM6Ib0$default(Canvas, ColorKt.Color(4292730333L), Offset.m21160constructorimpl((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L)), Offset.m21160constructorimpl((Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (4294967295L & Float.floatToRawIntBits(0.0f))), 0.0f, 0, PathEffect.INSTANCE.dashPathEffect(new float[]{5.0f, 5.0f}, 0.0f), 0.0f, null, 0, 472, null);
        return Unit.INSTANCE;
    }

    /* renamed from: y */
    public static final Unit m14369y(AskQuestionViewModel askQuestionViewModel, CourseItem it) {
        Intrinsics.checkNotNullParameter(it, "it");
        askQuestionViewModel.m10067p(it);
        return Unit.INSTANCE;
    }

    /* renamed from: z */
    public static final Unit m14370z(AskQuestionViewModel askQuestionViewModel, Function0 function0, Function2 function2, int i9, Composer composer, int i10) {
        m14363s(askQuestionViewModel, function0, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i9 | 1));
        return Unit.INSTANCE;
    }
}
