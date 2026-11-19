package com.zykj.student.dialogue.p076ui.home;

import android.content.res.Resources;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.FlowRowScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.grid.GridCells;
import androidx.compose.foundation.lazy.grid.LazyGridDslKt;
import androidx.compose.foundation.lazy.grid.LazyGridItemScope;
import androidx.compose.foundation.lazy.grid.LazyGridScope;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p012ui.Alignment;
import androidx.compose.p012ui.ComposedModifierKt;
import androidx.compose.p012ui.Modifier;
import androidx.compose.p012ui.graphics.Color;
import androidx.compose.p012ui.graphics.ColorKt;
import androidx.compose.p012ui.layout.LayoutKt;
import androidx.compose.p012ui.layout.MeasurePolicy;
import androidx.compose.p012ui.layout.MeasureResult;
import androidx.compose.p012ui.layout.MeasureScope;
import androidx.compose.p012ui.layout.Placeable;
import androidx.compose.p012ui.node.ComposeUiNode;
import androidx.compose.p012ui.platform.CompositionLocalsKt;
import androidx.compose.p012ui.semantics.SemanticsModifierKt;
import androidx.compose.p012ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p012ui.text.TextLayoutResult;
import androidx.compose.p012ui.text.TextStyle;
import androidx.compose.p012ui.text.font.FontFamily;
import androidx.compose.p012ui.text.font.FontStyle;
import androidx.compose.p012ui.text.font.FontWeight;
import androidx.compose.p012ui.text.style.TextAlign;
import androidx.compose.p012ui.text.style.TextDecoration;
import androidx.compose.p012ui.text.style.TextOverflow;
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
import com.zykj.student.dialogue.bean.resp.FilterType;
import com.zykj.student.dialogue.p076ui.home.AbstractC7593a;
import com.zykj.student.dialogue.p076ui.home.DrawerContentKt;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import p138i6.AbstractC8136b;
import p244s6.C9530l0;
import p274v6.AbstractC9768a;
import p294x6.AbstractC9892g;

/* loaded from: classes5.dex */
public abstract class DrawerContentKt {

    /* renamed from: com.zykj.student.dialogue.ui.home.DrawerContentKt$a */
    public static final class C7560a implements Function1 {

        /* renamed from: a */
        public static final C7560a f11372a = new C7560a();

        /* renamed from: a */
        public final void m10611a(ConstrainScope constrainAs) {
            Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
            VerticalAnchorable.m24467linkToVpY3zN4$default(constrainAs.getStart(), constrainAs.getParent().getStart(), 0.0f, 0.0f, 6, null);
            VerticalAnchorable.m24467linkToVpY3zN4$default(constrainAs.getEnd(), constrainAs.getParent().getEnd(), 0.0f, 0.0f, 6, null);
            HorizontalAnchorable.m24370linkToVpY3zN4$default(constrainAs.getTop(), constrainAs.getParent().getTop(), 0.0f, 0.0f, 6, (Object) null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m10611a((ConstrainScope) obj);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.zykj.student.dialogue.ui.home.DrawerContentKt$b */
    public static final class C7561b implements Function1 {

        /* renamed from: a */
        public final /* synthetic */ ConstrainedLayoutReference f11373a;

        /* renamed from: b */
        public final /* synthetic */ ConstrainedLayoutReference f11374b;

        public C7561b(ConstrainedLayoutReference constrainedLayoutReference, ConstrainedLayoutReference constrainedLayoutReference2) {
            this.f11373a = constrainedLayoutReference;
            this.f11374b = constrainedLayoutReference2;
        }

        /* renamed from: a */
        public final void m10612a(ConstrainScope constrainAs) {
            Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
            float f10 = 8 / 600;
            HorizontalAnchorable.m24370linkToVpY3zN4$default(constrainAs.getTop(), this.f11373a.getBottom(), C3115Dp.m23994constructorimpl((Resources.getSystem().getDisplayMetrics().widthPixels / Resources.getSystem().getDisplayMetrics().density) * f10), 0.0f, 4, (Object) null);
            HorizontalAnchorable.m24370linkToVpY3zN4$default(constrainAs.getBottom(), this.f11374b.getTop(), C3115Dp.m23994constructorimpl(f10 * (Resources.getSystem().getDisplayMetrics().widthPixels / Resources.getSystem().getDisplayMetrics().density)), 0.0f, 4, (Object) null);
            constrainAs.setHeight(Dimension.INSTANCE.getFillToConstraints());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m10612a((ConstrainScope) obj);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.zykj.student.dialogue.ui.home.DrawerContentKt$c */
    public static final class C7562c implements Function1 {

        /* renamed from: a */
        public final /* synthetic */ ConstrainedLayoutReference f11375a;

        /* renamed from: b */
        public final /* synthetic */ ConstrainedLayoutReference f11376b;

        public C7562c(ConstrainedLayoutReference constrainedLayoutReference, ConstrainedLayoutReference constrainedLayoutReference2) {
            this.f11375a = constrainedLayoutReference;
            this.f11376b = constrainedLayoutReference2;
        }

        /* renamed from: a */
        public final void m10613a(ConstrainScope constrainAs) {
            Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
            float f10 = 8 / 600;
            HorizontalAnchorable.m24370linkToVpY3zN4$default(constrainAs.getTop(), this.f11375a.getBottom(), C3115Dp.m23994constructorimpl((Resources.getSystem().getDisplayMetrics().widthPixels / Resources.getSystem().getDisplayMetrics().density) * f10), 0.0f, 4, (Object) null);
            HorizontalAnchorable.m24370linkToVpY3zN4$default(constrainAs.getBottom(), this.f11376b.getTop(), C3115Dp.m23994constructorimpl(f10 * (Resources.getSystem().getDisplayMetrics().widthPixels / Resources.getSystem().getDisplayMetrics().density)), 0.0f, 4, (Object) null);
            constrainAs.setHeight(Dimension.INSTANCE.getFillToConstraints());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m10613a((ConstrainScope) obj);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.zykj.student.dialogue.ui.home.DrawerContentKt$d */
    public static final class C7563d implements Function1 {

        /* renamed from: a */
        public final /* synthetic */ ConstrainedLayoutReference f11377a;

        /* renamed from: b */
        public final /* synthetic */ ConstrainedLayoutReference f11378b;

        public C7563d(ConstrainedLayoutReference constrainedLayoutReference, ConstrainedLayoutReference constrainedLayoutReference2) {
            this.f11377a = constrainedLayoutReference;
            this.f11378b = constrainedLayoutReference2;
        }

        /* renamed from: a */
        public final void m10614a(ConstrainScope constrainAs) {
            Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
            float f10 = 8 / 600;
            HorizontalAnchorable.m24370linkToVpY3zN4$default(constrainAs.getTop(), this.f11377a.getBottom(), C3115Dp.m23994constructorimpl((Resources.getSystem().getDisplayMetrics().widthPixels / Resources.getSystem().getDisplayMetrics().density) * f10), 0.0f, 4, (Object) null);
            HorizontalAnchorable.m24370linkToVpY3zN4$default(constrainAs.getBottom(), this.f11378b.getTop(), C3115Dp.m23994constructorimpl(f10 * (Resources.getSystem().getDisplayMetrics().widthPixels / Resources.getSystem().getDisplayMetrics().density)), 0.0f, 4, (Object) null);
            constrainAs.setHeight(Dimension.INSTANCE.getFillToConstraints());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m10614a((ConstrainScope) obj);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.zykj.student.dialogue.ui.home.DrawerContentKt$e */
    public static final class C7564e implements Function1 {

        /* renamed from: a */
        public final /* synthetic */ ConstrainedLayoutReference f11379a;

        /* renamed from: b */
        public final /* synthetic */ ConstrainedLayoutReference f11380b;

        public C7564e(ConstrainedLayoutReference constrainedLayoutReference, ConstrainedLayoutReference constrainedLayoutReference2) {
            this.f11379a = constrainedLayoutReference;
            this.f11380b = constrainedLayoutReference2;
        }

        /* renamed from: a */
        public final void m10615a(ConstrainScope constrainAs) {
            Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
            float f10 = 8 / 600;
            HorizontalAnchorable.m24370linkToVpY3zN4$default(constrainAs.getTop(), this.f11379a.getBottom(), C3115Dp.m23994constructorimpl((Resources.getSystem().getDisplayMetrics().widthPixels / Resources.getSystem().getDisplayMetrics().density) * f10), 0.0f, 4, (Object) null);
            HorizontalAnchorable.m24370linkToVpY3zN4$default(constrainAs.getBottom(), this.f11380b.getTop(), C3115Dp.m23994constructorimpl(f10 * (Resources.getSystem().getDisplayMetrics().widthPixels / Resources.getSystem().getDisplayMetrics().density)), 0.0f, 4, (Object) null);
            constrainAs.setHeight(Dimension.INSTANCE.getFillToConstraints());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m10615a((ConstrainScope) obj);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.zykj.student.dialogue.ui.home.DrawerContentKt$f */
    public static final class C7565f implements Function1 {

        /* renamed from: a */
        public static final C7565f f11381a = new C7565f();

        /* renamed from: a */
        public final void m10616a(ConstrainScope constrainAs) {
            Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
            VerticalAnchorable.m24467linkToVpY3zN4$default(constrainAs.getStart(), constrainAs.getParent().getStart(), 0.0f, 0.0f, 6, null);
            VerticalAnchorable.m24467linkToVpY3zN4$default(constrainAs.getEnd(), constrainAs.getParent().getEnd(), 0.0f, 0.0f, 6, null);
            HorizontalAnchorable.m24370linkToVpY3zN4$default(constrainAs.getBottom(), constrainAs.getParent().getBottom(), 0.0f, 0.0f, 6, (Object) null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m10616a((ConstrainScope) obj);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.zykj.student.dialogue.ui.home.DrawerContentKt$g */
    public static final class C7566g implements Function0 {

        /* renamed from: a */
        public final /* synthetic */ Function1 f11382a;

        /* renamed from: b */
        public final /* synthetic */ AbstractC7593a f11383b;

        public C7566g(Function1 function1, AbstractC7593a abstractC7593a) {
            this.f11382a = function1;
            this.f11383b = abstractC7593a;
        }

        /* renamed from: a */
        public final void m10617a() {
            this.f11382a.invoke(this.f11383b);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m10617a();
            return Unit.INSTANCE;
        }
    }

    /* renamed from: A */
    public static final Unit m10575A(List list, FilterType.Time.UpdatedTime updatedTime, Function1 function1, FlowRowScope FlowRow, Composer composer, int i9) {
        Intrinsics.checkNotNullParameter(FlowRow, "$this$FlowRow");
        if (composer.shouldExecute((i9 & 17) != 16, i9 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(224584841, i9, -1, "com.zykj.student.dialogue.ui.home.FilterContent.<anonymous>.<anonymous> (DrawerContent.kt:352)");
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                FilterType.Time.UpdatedTime updatedTime2 = (FilterType.Time.UpdatedTime) it.next();
                m10602r((updatedTime2.isCustomTime() && updatedTime.isCustomTime()) ? true : Intrinsics.areEqual(updatedTime2, updatedTime), updatedTime2, function1, composer, 0);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* renamed from: B */
    public static final Unit m10576B(List list, FilterType.QuestionState questionState, Function1 function1, FlowRowScope FlowRow, Composer composer, int i9) {
        Intrinsics.checkNotNullParameter(FlowRow, "$this$FlowRow");
        if (composer.shouldExecute((i9 & 17) != 16, i9 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1931542582, i9, -1, "com.zykj.student.dialogue.ui.home.FilterContent.<anonymous>.<anonymous> (DrawerContent.kt:369)");
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                FilterType.QuestionState questionState2 = (FilterType.QuestionState) it.next();
                m10602r(Intrinsics.areEqual(questionState2, questionState), questionState2, function1, composer, 0);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* renamed from: C */
    public static final Unit m10577C(Modifier modifier, boolean z9, List list, List list2, List list3, List list4, List list5, List list6, List list7, List list8, FilterType.QuestionState questionState, FilterType.Time.JoinedTime joinedTime, FilterType.Time.UpdatedTime updatedTime, FilterType.Time.FavoriteTime favoriteTime, Function1 function1, int i9, int i10, int i11, Composer composer, int i12) {
        m10606v(modifier, z9, list, list2, list3, list4, list5, list6, list7, list8, questionState, joinedTime, updatedTime, favoriteTime, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i9 | 1), RecomposeScopeImplKt.updateChangedFlags(i10), i11);
        return Unit.INSTANCE;
    }

    /* renamed from: D */
    public static final void m10578D(Modifier modifier, final FilterType.Sort checkedSortType, final Function1 onClick, Composer composer, final int i9, final int i10) {
        Modifier modifier2;
        int i11;
        Composer composer2;
        final Modifier modifier3;
        Intrinsics.checkNotNullParameter(checkedSortType, "checkedSortType");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1500627326);
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
            i11 |= composerStartRestartGroup.changed(checkedSortType) ? 32 : 16;
        }
        if ((i9 & 384) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(onClick) ? 256 : 128;
        }
        boolean z9 = true;
        if (composerStartRestartGroup.shouldExecute((i11 & 147) != 146, i11 & 1)) {
            Modifier modifier4 = i12 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1500627326, i11, -1, "com.zykj.student.dialogue.ui.home.SortContent (DrawerContent.kt:386)");
            }
            List listListOf = CollectionsKt.listOf((Object[]) new FilterType.Sort[]{FilterType.Sort.SortByUpdatedTime.INSTANCE, FilterType.Sort.SortByJoinedTime.INSTANCE, FilterType.Sort.SortByDiscuss.INSTANCE});
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(modifier4, 0.0f, 1, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getCenterHorizontally(), composerStartRestartGroup, 48);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxSize$default);
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
            composerStartRestartGroup.startReplaceGroup(-1175683937);
            Iterator it = listListOf.iterator();
            while (it.hasNext()) {
                final FilterType.Sort sort = (FilterType.Sort) it.next();
                Modifier.Companion companion2 = Modifier.INSTANCE;
                float f10 = 600;
                SpacerKt.Spacer(SizeKt.m18147height3ABfNKs(companion2, C3115Dp.m23994constructorimpl((9 / f10) * (Resources.getSystem().getDisplayMetrics().widthPixels / Resources.getSystem().getDisplayMetrics().density))), composerStartRestartGroup, 6);
                long jColor = Intrinsics.areEqual(checkedSortType, sort) ? ColorKt.Color(440899571) : Color.INSTANCE.m21446getWhite0d7_KjU();
                String label = sort.getLabel();
                BorderStroke borderStrokeM17650BorderStrokecXLIe8U = Intrinsics.areEqual(checkedSortType, sort) ? null : BorderStrokeKt.m17650BorderStrokecXLIe8U(C3115Dp.m23994constructorimpl(1.0f), ColorKt.Color(4292665056L));
                Iterator it2 = it;
                Modifier modifierM18163sizeVpY3zN4 = SizeKt.m18163sizeVpY3zN4(companion2, C3115Dp.m23994constructorimpl((180 / f10) * (Resources.getSystem().getDisplayMetrics().widthPixels / Resources.getSystem().getDisplayMetrics().density)), C3115Dp.m23994constructorimpl((23 / f10) * (Resources.getSystem().getDisplayMetrics().widthPixels / Resources.getSystem().getDisplayMetrics().density)));
                long jM16549k = Intrinsics.areEqual(checkedSortType, sort) ? AbstractC9768a.m16549k() : AbstractC9768a.m16539a();
                RoundedCornerShape RoundedCornerShape = RoundedCornerShapeKt.RoundedCornerShape(50);
                long jM13036d = AbstractC8136b.m13036d(7);
                boolean zChanged = ((i11 & 896) == 256) | composerStartRestartGroup.changed(sort);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: s6.w
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return DrawerContentKt.m10579E(onClick, sort);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                Composer composer3 = composerStartRestartGroup;
                AbstractC9892g.m16950e(modifierM18163sizeVpY3zN4, RoundedCornerShape, jM16549k, jM13036d, jColor, label, borderStrokeM17650BorderStrokecXLIe8U, false, null, (Function0) objRememberedValue, composer3, 3078, 384);
                composerStartRestartGroup = composer3;
                it = it2;
                i11 = i11;
                modifier4 = modifier4;
                z9 = true;
            }
            composer2 = composerStartRestartGroup;
            Modifier modifier5 = modifier4;
            composer2.endReplaceGroup();
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: s6.x
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return DrawerContentKt.m10580F(modifier3, checkedSortType, onClick, i9, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: E */
    public static final Unit m10579E(Function1 function1, FilterType.Sort sort) {
        function1.invoke(sort);
        return Unit.INSTANCE;
    }

    /* renamed from: F */
    public static final Unit m10580F(Modifier modifier, FilterType.Sort sort, Function1 function1, int i9, int i10, Composer composer, int i11) {
        m10578D(modifier, sort, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i9 | 1), i10);
        return Unit.INSTANCE;
    }

    /* renamed from: G */
    public static final void m10581G(Modifier modifier, final Object obj, final FilterType.Subject checkedSubject, final Function1 onFilterItemClick, Composer composer, final int i9, final int i10) {
        Modifier modifier2;
        int i11;
        Object obj2;
        Composer composer2;
        final Modifier modifier3;
        Intrinsics.checkNotNullParameter(checkedSubject, "checkedSubject");
        Intrinsics.checkNotNullParameter(onFilterItemClick, "onFilterItemClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1805070411);
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
            obj2 = obj;
            i11 |= composerStartRestartGroup.changedInstance(obj2) ? 32 : 16;
        } else {
            obj2 = obj;
        }
        if ((i9 & 384) == 0) {
            i11 |= composerStartRestartGroup.changed(checkedSubject) ? 256 : 128;
        }
        if ((i9 & 3072) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(onFilterItemClick) ? 2048 : 1024;
        }
        if (composerStartRestartGroup.shouldExecute((i11 & 1171) != 1170, i11 & 1)) {
            Modifier modifier4 = i12 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1805070411, i11, -1, "com.zykj.student.dialogue.ui.home.SubjectContent (DrawerContent.kt:174)");
            }
            Arrangement arrangement = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
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
            float f10 = 600;
            SpacerKt.Spacer(SizeKt.m18147height3ABfNKs(Modifier.INSTANCE, C3115Dp.m23994constructorimpl((9 / f10) * (Resources.getSystem().getDisplayMetrics().widthPixels / Resources.getSystem().getDisplayMetrics().density))), composerStartRestartGroup, 6);
            final List list = (List) (Result.m24764isFailureimpl(obj2) ? null : obj2);
            if (list == null) {
                composerStartRestartGroup.startReplaceGroup(1155753380);
                composerStartRestartGroup.endReplaceGroup();
                composer2 = composerStartRestartGroup;
            } else {
                composerStartRestartGroup.startReplaceGroup(1155753381);
                GridCells.Fixed fixed = new GridCells.Fixed(4);
                Arrangement.HorizontalOrVertical horizontalOrVerticalM17995spacedBy0680j_4 = arrangement.m17995spacedBy0680j_4(C3115Dp.m23994constructorimpl((8 / f10) * (Resources.getSystem().getDisplayMetrics().widthPixels / Resources.getSystem().getDisplayMetrics().density)));
                Arrangement.HorizontalOrVertical horizontalOrVerticalM17995spacedBy0680j_42 = arrangement.m17995spacedBy0680j_4(C3115Dp.m23994constructorimpl((12 / f10) * (Resources.getSystem().getDisplayMetrics().widthPixels / Resources.getSystem().getDisplayMetrics().density)));
                boolean zChangedInstance = ((i11 & 896) == 256) | composerStartRestartGroup.changedInstance(list) | ((i11 & 7168) == 2048);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: s6.r
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj3) {
                            return DrawerContentKt.m10582H(list, checkedSubject, onFilterItemClick, (LazyGridScope) obj3);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composer2 = composerStartRestartGroup;
                LazyGridDslKt.LazyVerticalGrid(fixed, null, null, null, false, horizontalOrVerticalM17995spacedBy0680j_42, horizontalOrVerticalM17995spacedBy0680j_4, null, false, null, (Function1) objRememberedValue, composer2, 1769472, 0, 926);
                composer2.endReplaceGroup();
            }
            composer2.endNode();
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: s6.s
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj3, Object obj4) {
                    return DrawerContentKt.m10583I(modifier3, obj, checkedSubject, onFilterItemClick, i9, i10, (Composer) obj3, ((Integer) obj4).intValue());
                }
            });
        }
    }

    /* renamed from: H */
    public static final Unit m10582H(final List list, final FilterType.Subject subject, final Function1 function1, LazyGridScope LazyVerticalGrid) {
        Intrinsics.checkNotNullParameter(LazyVerticalGrid, "$this$LazyVerticalGrid");
        final C7557x5c7171a7 c7557x5c7171a7 = new Function1() { // from class: com.zykj.student.dialogue.ui.home.DrawerContentKt$SubjectContent$lambda$14$lambda$13$lambda$12$lambda$11$$inlined$items$default$1
            @Override // kotlin.jvm.functions.Function1
            public final Void invoke(Object obj) {
                return null;
            }
        };
        LazyVerticalGrid.items(list.size(), null, null, new Function1<Integer, Object>() { // from class: com.zykj.student.dialogue.ui.home.DrawerContentKt$SubjectContent$lambda$14$lambda$13$lambda$12$lambda$11$$inlined$items$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int i9) {
                return c7557x5c7171a7.invoke(list.get(i9));
            }
        }, ComposableLambdaKt.composableLambdaInstance(699646206, true, new Function4<LazyGridItemScope, Integer, Composer, Integer, Unit>() { // from class: com.zykj.student.dialogue.ui.home.DrawerContentKt$SubjectContent$lambda$14$lambda$13$lambda$12$lambda$11$$inlined$items$default$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(4);
            }

            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(LazyGridItemScope lazyGridItemScope, Integer num, Composer composer, Integer num2) {
                invoke(lazyGridItemScope, num.intValue(), composer, num2.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(LazyGridItemScope lazyGridItemScope, int i9, Composer composer, int i10) {
                int i11;
                if ((i10 & 6) == 0) {
                    i11 = (composer.changed(lazyGridItemScope) ? 4 : 2) | i10;
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
                    ComposerKt.traceEventStart(699646206, i11, -1, "androidx.compose.foundation.lazy.grid.items.<anonymous> (LazyGridDsl.kt:542)");
                }
                FilterType.Subject subject2 = (FilterType.Subject) list.get(i9);
                composer.startReplaceGroup(-768283308);
                DrawerContentKt.m10602r(Intrinsics.areEqual(subject, subject2), subject2, function1, composer, 0);
                composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        return Unit.INSTANCE;
    }

    /* renamed from: I */
    public static final Unit m10583I(Modifier modifier, Object obj, FilterType.Subject subject, Function1 function1, int i9, int i10, Composer composer, int i11) {
        m10581G(modifier, obj, subject, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i9 | 1), i10);
        return Unit.INSTANCE;
    }

    /* renamed from: p */
    public static final void m10600p(final AbstractC7593a drawerType, final C9530l0 filterUiState, final boolean z9, final Function0 onUpdateFilterConditionClick, final Function1 onFilterItemClick, final Function1 onFilterReset, Composer composer, final int i9) {
        int i10;
        Composer composer2;
        final ConstraintSetForInlineDsl constraintSetForInlineDsl;
        final MutableState mutableState;
        Intrinsics.checkNotNullParameter(drawerType, "drawerType");
        Intrinsics.checkNotNullParameter(filterUiState, "filterUiState");
        Intrinsics.checkNotNullParameter(onUpdateFilterConditionClick, "onUpdateFilterConditionClick");
        Intrinsics.checkNotNullParameter(onFilterItemClick, "onFilterItemClick");
        Intrinsics.checkNotNullParameter(onFilterReset, "onFilterReset");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1343959053);
        if ((i9 & 6) == 0) {
            i10 = (composerStartRestartGroup.changed(drawerType) ? 4 : 2) | i9;
        } else {
            i10 = i9;
        }
        if ((i9 & 48) == 0) {
            i10 |= composerStartRestartGroup.changedInstance(filterUiState) ? 32 : 16;
        }
        if ((i9 & 384) == 0) {
            i10 |= composerStartRestartGroup.changed(z9) ? 256 : 128;
        }
        if ((i9 & 3072) == 0) {
            i10 |= composerStartRestartGroup.changedInstance(onUpdateFilterConditionClick) ? 2048 : 1024;
        }
        if ((i9 & 24576) == 0) {
            i10 |= composerStartRestartGroup.changedInstance(onFilterItemClick) ? 16384 : 8192;
        }
        if ((196608 & i9) == 0) {
            i10 |= composerStartRestartGroup.changedInstance(onFilterReset) ? 131072 : 65536;
        }
        if (composerStartRestartGroup.shouldExecute((74899 & i10) != 74898, i10 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1343959053, i10, -1, "com.zykj.student.dialogue.ui.home.DrawerContent (DrawerContent.kt:38)");
            }
            float f10 = 600;
            Modifier modifierM18114padding3ABfNKs = PaddingKt.m18114padding3ABfNKs(PaddingKt.m18118paddingqDBjuR0$default(BackgroundKt.m17623backgroundbw27NRU$default(SizeKt.fillMaxHeight$default(SizeKt.m18166width3ABfNKs(Modifier.INSTANCE, C3115Dp.m23994constructorimpl((239 / f10) * (Resources.getSystem().getDisplayMetrics().widthPixels / Resources.getSystem().getDisplayMetrics().density))), 0.0f, 1, null), Color.INSTANCE.m21446getWhite0d7_KjU(), null, 2, null), 0.0f, C3115Dp.m23994constructorimpl((10 / f10) * (Resources.getSystem().getDisplayMetrics().widthPixels / Resources.getSystem().getDisplayMetrics().density)), 0.0f, 0.0f, 13, null), C3115Dp.m23994constructorimpl((9 / f10) * (Resources.getSystem().getDisplayMetrics().widthPixels / Resources.getSystem().getDisplayMetrics().density)));
            composerStartRestartGroup.startReplaceGroup(-1003410150);
            composerStartRestartGroup.startReplaceGroup(212064437);
            composerStartRestartGroup.endReplaceGroup();
            Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = new Measurer2(density);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final Measurer2 measurer2 = (Measurer2) objRememberedValue;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new ConstraintLayoutScope();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            final ConstraintLayoutScope constraintLayoutScope = (ConstraintLayoutScope) objRememberedValue2;
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            final MutableState mutableState2 = (MutableState) objRememberedValue3;
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = new ConstraintSetForInlineDsl(constraintLayoutScope);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            final ConstraintSetForInlineDsl constraintSetForInlineDsl2 = (ConstraintSetForInlineDsl) objRememberedValue4;
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue5 == companion.getEmpty()) {
                objRememberedValue5 = SnapshotStateKt.mutableStateOf(Unit.INSTANCE, SnapshotStateKt.neverEqualPolicy());
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            final MutableState mutableState3 = (MutableState) objRememberedValue5;
            final int i11 = 257;
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(measurer2) | composerStartRestartGroup.changed(257);
            Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue6 == companion.getEmpty()) {
                objRememberedValue6 = new MeasurePolicy() { // from class: com.zykj.student.dialogue.ui.home.DrawerContentKt$DrawerContent$$inlined$ConstraintLayout$2
                    @Override // androidx.compose.p012ui.layout.MeasurePolicy
                    /* renamed from: measure-3p2s80s */
                    public final MeasureResult mo17421measure3p2s80s(MeasureScope measureScope, final List list, long j9) {
                        final LinkedHashMap linkedHashMap = new LinkedHashMap();
                        mutableState3.getValue();
                        long jM24395performMeasureDjhGOtQ = measurer2.m24395performMeasureDjhGOtQ(j9, measureScope.getLayoutDirection(), constraintSetForInlineDsl2, list, linkedHashMap, i11);
                        mutableState2.getValue();
                        int iM24165getWidthimpl = IntSize.m24165getWidthimpl(jM24395performMeasureDjhGOtQ);
                        int iM24164getHeightimpl = IntSize.m24164getHeightimpl(jM24395performMeasureDjhGOtQ);
                        final Measurer2 measurer22 = measurer2;
                        return MeasureScope.layout$default(measureScope, iM24165getWidthimpl, iM24164getHeightimpl, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: com.zykj.student.dialogue.ui.home.DrawerContentKt$DrawerContent$$inlined$ConstraintLayout$2.1
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
                constraintSetForInlineDsl = constraintSetForInlineDsl2;
                mutableState = mutableState2;
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            } else {
                constraintSetForInlineDsl = constraintSetForInlineDsl2;
                mutableState = mutableState2;
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) objRememberedValue6;
            Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue7 == companion.getEmpty()) {
                objRememberedValue7 = new Function0<Unit>() { // from class: com.zykj.student.dialogue.ui.home.DrawerContentKt$DrawerContent$$inlined$ConstraintLayout$3
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
                composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
            }
            final Function0 function0 = (Function0) objRememberedValue7;
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(measurer2);
            Object objRememberedValue8 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue8 == companion.getEmpty()) {
                objRememberedValue8 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: com.zykj.student.dialogue.ui.home.DrawerContentKt$DrawerContent$$inlined$ConstraintLayout$4
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
                composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
            }
            composer2 = composerStartRestartGroup;
            LayoutKt.MultiMeasureLayout(SemanticsModifierKt.semantics$default(modifierM18114padding3ABfNKs, false, (Function1) objRememberedValue8, 1, null), ComposableLambdaKt.rememberComposableLambda(1200550679, true, new Function2<Composer, Integer, Unit>() { // from class: com.zykj.student.dialogue.ui.home.DrawerContentKt$DrawerContent$$inlined$ConstraintLayout$5
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i12) {
                    String str;
                    ConstrainedLayoutReference constrainedLayoutReference;
                    ConstraintLayoutScope constraintLayoutScope2;
                    Modifier.Companion companion2;
                    if ((i12 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1200550679, i12, -1, "androidx.constraintlayout.compose.ConstraintLayout.<anonymous> (ConstraintLayout.kt:459)");
                    }
                    mutableState3.setValue(Unit.INSTANCE);
                    int helpersHashCode = constraintLayoutScope.getHelpersHashCode();
                    constraintLayoutScope.reset();
                    ConstraintLayoutScope constraintLayoutScope3 = constraintLayoutScope;
                    composer3.startReplaceGroup(-218870393);
                    ConstraintLayoutScope.ConstrainedLayoutReferences constrainedLayoutReferencesCreateRefs = constraintLayoutScope3.createRefs();
                    ConstrainedLayoutReference constrainedLayoutReferenceComponent1 = constrainedLayoutReferencesCreateRefs.component1();
                    ConstrainedLayoutReference constrainedLayoutReferenceComponent2 = constrainedLayoutReferencesCreateRefs.component2();
                    ConstrainedLayoutReference constrainedLayoutReferenceComponent3 = constrainedLayoutReferencesCreateRefs.component3();
                    AbstractC7593a abstractC7593a = drawerType;
                    AbstractC7593a.b bVar = AbstractC7593a.b.f11729a;
                    if (Intrinsics.areEqual(abstractC7593a, bVar)) {
                        str = "筛选";
                    } else if (Intrinsics.areEqual(abstractC7593a, AbstractC7593a.c.f11730a)) {
                        str = "排序";
                    } else if (Intrinsics.areEqual(abstractC7593a, AbstractC7593a.d.f11731a)) {
                        str = "科目";
                    } else {
                        if (!Intrinsics.areEqual(abstractC7593a, AbstractC7593a.a.f11728a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        str = "不限";
                    }
                    long jM13036d = AbstractC8136b.m13036d(8);
                    FontWeight medium = FontWeight.INSTANCE.getMedium();
                    Modifier.Companion companion3 = Modifier.INSTANCE;
                    Object objRememberedValue9 = composer3.rememberedValue();
                    Composer.Companion companion4 = Composer.INSTANCE;
                    if (objRememberedValue9 == companion4.getEmpty()) {
                        objRememberedValue9 = DrawerContentKt.C7560a.f11372a;
                        composer3.updateRememberedValue(objRememberedValue9);
                    }
                    TextKt.m19863Text4IGK_g(str, constraintLayoutScope3.constrainAs(companion3, constrainedLayoutReferenceComponent1, (Function1) objRememberedValue9), 0L, jM13036d, (FontStyle) null, medium, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer3, 199680, 0, 131028);
                    Composer composer4 = composer3;
                    AbstractC7593a abstractC7593a2 = drawerType;
                    if (Intrinsics.areEqual(abstractC7593a2, AbstractC7593a.d.f11731a)) {
                        composer4.startReplaceGroup(-699781251);
                        boolean zChanged = composer4.changed(constrainedLayoutReferenceComponent1) | composer4.changed(constrainedLayoutReferenceComponent3);
                        Object objRememberedValue10 = composer4.rememberedValue();
                        if (zChanged || objRememberedValue10 == companion4.getEmpty()) {
                            objRememberedValue10 = new DrawerContentKt.C7561b(constrainedLayoutReferenceComponent1, constrainedLayoutReferenceComponent3);
                            composer4.updateRememberedValue(objRememberedValue10);
                        }
                        DrawerContentKt.m10581G(constraintLayoutScope3.constrainAs(companion3, constrainedLayoutReferenceComponent2, (Function1) objRememberedValue10), filterUiState.m15743n(), filterUiState.m15736g(), onFilterItemClick, composer4, 0, 0);
                        composer4.endReplaceGroup();
                        constrainedLayoutReference = constrainedLayoutReferenceComponent3;
                        constraintLayoutScope2 = constraintLayoutScope3;
                        companion2 = companion3;
                    } else if (Intrinsics.areEqual(abstractC7593a2, bVar)) {
                        composer4.startReplaceGroup(-699763392);
                        boolean zChanged2 = composer4.changed(constrainedLayoutReferenceComponent1) | composer4.changed(constrainedLayoutReferenceComponent3);
                        Object objRememberedValue11 = composer4.rememberedValue();
                        if (zChanged2 || objRememberedValue11 == companion4.getEmpty()) {
                            objRememberedValue11 = new DrawerContentKt.C7562c(constrainedLayoutReferenceComponent1, constrainedLayoutReferenceComponent3);
                            composer4.updateRememberedValue(objRememberedValue11);
                        }
                        constrainedLayoutReference = constrainedLayoutReferenceComponent3;
                        DrawerContentKt.m10606v(constraintLayoutScope3.constrainAs(companion3, constrainedLayoutReferenceComponent2, (Function1) objRememberedValue11), z9, filterUiState.m15745p(), filterUiState.m15741l(), filterUiState.m15740k(), filterUiState.m15746q(), filterUiState.m15744o(), filterUiState.m15742m(), filterUiState.m15739j(), filterUiState.m15737h(), filterUiState.m15734e(), filterUiState.m15733d(), filterUiState.m15738i(), filterUiState.m15732c(), onFilterItemClick, composer4, 0, 0, 0);
                        composer4 = composer4;
                        composer4.endReplaceGroup();
                        constraintLayoutScope2 = constraintLayoutScope3;
                        companion2 = companion3;
                    } else {
                        constrainedLayoutReference = constrainedLayoutReferenceComponent3;
                        if (Intrinsics.areEqual(abstractC7593a2, AbstractC7593a.c.f11730a)) {
                            composer4.startReplaceGroup(-699722535);
                            boolean zChanged3 = composer4.changed(constrainedLayoutReferenceComponent1) | composer4.changed(constrainedLayoutReference);
                            Object objRememberedValue12 = composer4.rememberedValue();
                            if (zChanged3 || objRememberedValue12 == companion4.getEmpty()) {
                                objRememberedValue12 = new DrawerContentKt.C7563d(constrainedLayoutReferenceComponent1, constrainedLayoutReference);
                                composer4.updateRememberedValue(objRememberedValue12);
                            }
                            DrawerContentKt.m10578D(constraintLayoutScope3.constrainAs(companion3, constrainedLayoutReferenceComponent2, (Function1) objRememberedValue12), filterUiState.m15735f(), onFilterItemClick, composer4, 0, 0);
                            composer4.endReplaceGroup();
                            constraintLayoutScope2 = constraintLayoutScope3;
                            companion2 = companion3;
                        } else {
                            if (!Intrinsics.areEqual(abstractC7593a2, AbstractC7593a.a.f11728a)) {
                                composer4.startReplaceGroup(-699779839);
                                composer4.endReplaceGroup();
                                throw new NoWhenBranchMatchedException();
                            }
                            composer4.startReplaceGroup(-216071838);
                            boolean zChanged4 = composer4.changed(constrainedLayoutReferenceComponent1) | composer4.changed(constrainedLayoutReference);
                            Object objRememberedValue13 = composer4.rememberedValue();
                            if (zChanged4 || objRememberedValue13 == companion4.getEmpty()) {
                                objRememberedValue13 = new DrawerContentKt.C7564e(constrainedLayoutReferenceComponent1, constrainedLayoutReference);
                                composer4.updateRememberedValue(objRememberedValue13);
                            }
                            constraintLayoutScope2 = constraintLayoutScope3;
                            companion2 = companion3;
                            DrawerContentKt.m10606v(constraintLayoutScope3.constrainAs(companion3, constrainedLayoutReferenceComponent2, (Function1) objRememberedValue13), z9, filterUiState.m15745p(), filterUiState.m15741l(), filterUiState.m15740k(), filterUiState.m15746q(), filterUiState.m15744o(), filterUiState.m15742m(), filterUiState.m15739j(), filterUiState.m15737h(), filterUiState.m15734e(), filterUiState.m15733d(), filterUiState.m15738i(), filterUiState.m15732c(), onFilterItemClick, composer4, 0, 0, 0);
                            composer4 = composer4;
                            composer4.endReplaceGroup();
                        }
                    }
                    Object objRememberedValue14 = composer4.rememberedValue();
                    if (objRememberedValue14 == companion4.getEmpty()) {
                        objRememberedValue14 = DrawerContentKt.C7565f.f11381a;
                        composer4.updateRememberedValue(objRememberedValue14);
                    }
                    Modifier.Companion companion5 = companion2;
                    Modifier modifierConstrainAs = constraintLayoutScope2.constrainAs(companion5, constrainedLayoutReference, (Function1) objRememberedValue14);
                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getCenter(), Alignment.INSTANCE.getTop(), composer4, 6);
                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer4.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer4, modifierConstrainAs);
                    ComposeUiNode.Companion companion6 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion6.getConstructor();
                    if (composer4.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer4.startReusableNode();
                    if (composer4.getInserting()) {
                        composer4.createNode(constructor);
                    } else {
                        composer4.useNode();
                    }
                    Composer composerM20851constructorimpl = Updater.m20851constructorimpl(composer4);
                    Updater.m20858setimpl(composerM20851constructorimpl, measurePolicyRowMeasurePolicy, companion6.getSetMeasurePolicy());
                    Updater.m20858setimpl(composerM20851constructorimpl, currentCompositionLocalMap, companion6.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion6.getSetCompositeKeyHash();
                    if (composerM20851constructorimpl.getInserting() || !Intrinsics.areEqual(composerM20851constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM20851constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM20851constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m20858setimpl(composerM20851constructorimpl, modifierMaterializeModifier, companion6.getSetModifier());
                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    DrawerContentKt$DrawerContent$$inlined$ConstraintLayout$5 drawerContentKt$DrawerContent$$inlined$ConstraintLayout$5 = this;
                    if (Intrinsics.areEqual(drawerType, AbstractC7593a.c.f11730a)) {
                        composer4.startReplaceGroup(-707173676);
                    } else {
                        composer4.startReplaceGroup(-700750538);
                        Color.Companion companion7 = Color.INSTANCE;
                        long jM21446getWhite0d7_KjU = companion7.m21446getWhite0d7_KjU();
                        long jM16549k = AbstractC9768a.m16549k();
                        float f11 = 600;
                        float f12 = 56 / f11;
                        float f13 = 23 / f11;
                        Modifier modifierM18163sizeVpY3zN4 = SizeKt.m18163sizeVpY3zN4(companion5, C3115Dp.m23994constructorimpl((Resources.getSystem().getDisplayMetrics().widthPixels / Resources.getSystem().getDisplayMetrics().density) * f12), C3115Dp.m23994constructorimpl((Resources.getSystem().getDisplayMetrics().widthPixels / Resources.getSystem().getDisplayMetrics().density) * f13));
                        float f14 = 12 / f11;
                        RoundedCornerShape roundedCornerShapeM18407RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m18407RoundedCornerShape0680j_4(C3115Dp.m23994constructorimpl((Resources.getSystem().getDisplayMetrics().widthPixels / Resources.getSystem().getDisplayMetrics().density) * f14));
                        BorderStroke borderStrokeM17650BorderStrokecXLIe8U = BorderStrokeKt.m17650BorderStrokecXLIe8U(C3115Dp.m23994constructorimpl(1.0f), AbstractC9768a.m16549k());
                        boolean zChanged5 = composer4.changed(onFilterReset) | composer4.changed(drawerType);
                        Object objRememberedValue15 = composer4.rememberedValue();
                        if (zChanged5 || objRememberedValue15 == companion4.getEmpty()) {
                            objRememberedValue15 = new DrawerContentKt.C7566g(onFilterReset, drawerType);
                            composer4.updateRememberedValue(objRememberedValue15);
                        }
                        AbstractC9892g.m16950e(modifierM18163sizeVpY3zN4, roundedCornerShapeM18407RoundedCornerShape0680j_4, jM16549k, 0L, jM21446getWhite0d7_KjU, "重置", borderStrokeM17650BorderStrokecXLIe8U, false, null, (Function0) objRememberedValue15, composer4, 1794438, 392);
                        SpacerKt.Spacer(SizeKt.m18166width3ABfNKs(companion5, C3115Dp.m23994constructorimpl((28 / f11) * (Resources.getSystem().getDisplayMetrics().widthPixels / Resources.getSystem().getDisplayMetrics().density))), composer4, 6);
                        drawerContentKt$DrawerContent$$inlined$ConstraintLayout$5 = this;
                        AbstractC9892g.m16950e(SizeKt.m18163sizeVpY3zN4(companion5, C3115Dp.m23994constructorimpl(f12 * (Resources.getSystem().getDisplayMetrics().widthPixels / Resources.getSystem().getDisplayMetrics().density)), C3115Dp.m23994constructorimpl(f13 * (Resources.getSystem().getDisplayMetrics().widthPixels / Resources.getSystem().getDisplayMetrics().density))), RoundedCornerShapeKt.m18407RoundedCornerShape0680j_4(C3115Dp.m23994constructorimpl(f14 * (Resources.getSystem().getDisplayMetrics().widthPixels / Resources.getSystem().getDisplayMetrics().density))), companion7.m21446getWhite0d7_KjU(), 0L, AbstractC9768a.m16549k(), "确定", null, false, null, onUpdateFilterConditionClick, composer4, 221574, 456);
                    }
                    composer4.endReplaceGroup();
                    composer4.endNode();
                    composer4.endReplaceGroup();
                    if (constraintLayoutScope.getHelpersHashCode() != helpersHashCode) {
                        EffectsKt.SideEffect(function0, composer4, 6);
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), measurePolicy, composer2, 48, 0);
            composer2.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: s6.q
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return DrawerContentKt.m10601q(drawerType, filterUiState, z9, onUpdateFilterConditionClick, onFilterItemClick, onFilterReset, i9, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: q */
    public static final Unit m10601q(AbstractC7593a abstractC7593a, C9530l0 c9530l0, boolean z9, Function0 function0, Function1 function1, Function1 function12, int i9, Composer composer, int i10) {
        m10600p(abstractC7593a, c9530l0, z9, function0, function1, function12, composer, RecomposeScopeImplKt.updateChangedFlags(i9 | 1));
        return Unit.INSTANCE;
    }

    /* renamed from: r */
    public static final void m10602r(final boolean z9, final FilterType filterType, final Function1 onClick, Composer composer, final int i9) {
        int i10;
        Composer composer2;
        Intrinsics.checkNotNullParameter(filterType, "filterType");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(801394929);
        if ((i9 & 6) == 0) {
            i10 = (composerStartRestartGroup.changed(z9) ? 4 : 2) | i9;
        } else {
            i10 = i9;
        }
        if ((i9 & 48) == 0) {
            i10 |= composerStartRestartGroup.changed(filterType) ? 32 : 16;
        }
        if ((i9 & 384) == 0) {
            i10 |= composerStartRestartGroup.changedInstance(onClick) ? 256 : 128;
        }
        if (composerStartRestartGroup.shouldExecute((i10 & 147) != 146, i10 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(801394929, i10, -1, "com.zykj.student.dialogue.ui.home.FilterCheckItem (DrawerContent.kt:201)");
            }
            boolean z10 = ((i10 & 896) == 256) | ((i10 & 112) == 32);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z10 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: s6.t
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return DrawerContentKt.m10603s(onClick, filterType);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            float f10 = 600;
            composer2 = composerStartRestartGroup;
            SurfaceKt.m19716Surfaceo_FOJdg((Function0) objRememberedValue, SizeKt.m18168widthInVpY3zN4$default(SizeKt.m18147height3ABfNKs(Modifier.INSTANCE, C3115Dp.m23994constructorimpl((17 / f10) * (Resources.getSystem().getDisplayMetrics().widthPixels / Resources.getSystem().getDisplayMetrics().density))), C3115Dp.m23994constructorimpl((49 / f10) * (Resources.getSystem().getDisplayMetrics().widthPixels / Resources.getSystem().getDisplayMetrics().density)), 0.0f, 2, null), false, RoundedCornerShapeKt.m18407RoundedCornerShape0680j_4(C3115Dp.m23994constructorimpl((2 / f10) * (Resources.getSystem().getDisplayMetrics().widthPixels / Resources.getSystem().getDisplayMetrics().density))), z9 ? ColorKt.Color(440899571) : Color.INSTANCE.m21446getWhite0d7_KjU(), 0L, 0.0f, 0.0f, z9 ? null : BorderStrokeKt.m17650BorderStrokecXLIe8U(C3115Dp.m23994constructorimpl(1.0f), ColorKt.Color(4292665056L)), null, ComposableLambdaKt.rememberComposableLambda(-303305028, true, new Function2() { // from class: s6.u
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return DrawerContentKt.m10604t(filterType, z9, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, composerStartRestartGroup, 54), composer2, 48, 6, 740);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: s6.v
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return DrawerContentKt.m10605u(z9, filterType, onClick, i9, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: s */
    public static final Unit m10603s(Function1 function1, FilterType filterType) {
        function1.invoke(filterType);
        return Unit.INSTANCE;
    }

    /* renamed from: t */
    public static final Unit m10604t(FilterType filterType, boolean z9, Composer composer, int i9) {
        String label;
        if (composer.shouldExecute((i9 & 3) != 2, i9 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-303305028, i9, -1, "com.zykj.student.dialogue.ui.home.FilterCheckItem.<anonymous> (DrawerContent.kt:216)");
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
            if (((filterType instanceof FilterType.Time.UpdatedTime.Custom) && ((FilterType.Time.UpdatedTime.Custom) filterType).hasTimeRange()) || (((filterType instanceof FilterType.Time.JoinedTime.Custom) && ((FilterType.Time.JoinedTime.Custom) filterType).hasTimeRange()) || ((filterType instanceof FilterType.Time.FavoriteTime.Custom) && ((FilterType.Time.FavoriteTime.Custom) filterType).hasTimeRange()))) {
                FilterType.Time time = (FilterType.Time) filterType;
                if (time.getStartDateTime().length() > 0 && time.getEndDateTime().length() > 0) {
                    label = time.parseStartTime() + "~" + time.parseEndTime();
                } else if (time.getStartDateTime().length() > 0) {
                    label = time.parseStartTime() + "以后";
                } else {
                    label = time.parseEndTime() + "以前";
                }
            } else {
                label = filterType.getLabel();
            }
            TextKt.m19863Text4IGK_g(label, PaddingKt.m18116paddingVpY3zN4$default(companion, C3115Dp.m23994constructorimpl((6 / 600) * (Resources.getSystem().getDisplayMetrics().widthPixels / Resources.getSystem().getDisplayMetrics().density)), 0.0f, 2, null), z9 ? AbstractC9768a.m16549k() : AbstractC9768a.m16539a(), AbstractC8136b.m13036d(7), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.INSTANCE.m23930getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 3120, 3120, 120816);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* renamed from: u */
    public static final Unit m10605u(boolean z9, FilterType filterType, Function1 function1, int i9, Composer composer, int i10) {
        m10602r(z9, filterType, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i9 | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:152:0x040a  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x040d  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x041f  */
    /* renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m10606v(androidx.compose.p012ui.Modifier r49, final boolean r50, java.util.List r51, final java.util.List r52, final java.util.List r53, final java.util.List r54, final java.util.List r55, java.util.List r56, final java.util.List r57, final java.util.List r58, com.zykj.student.dialogue.bean.resp.FilterType.QuestionState r59, final com.zykj.student.dialogue.bean.resp.FilterType.Time.JoinedTime r60, final com.zykj.student.dialogue.bean.resp.FilterType.Time.UpdatedTime r61, final com.zykj.student.dialogue.bean.resp.FilterType.Time.FavoriteTime r62, kotlin.jvm.functions.Function1 r63, androidx.compose.runtime.Composer r64, final int r65, final int r66, final int r67) {
        /*
            Method dump skipped, instructions count: 2008
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.student.dialogue.p076ui.home.DrawerContentKt.m10606v(androidx.compose.ui.Modifier, boolean, java.util.List, java.util.List, java.util.List, java.util.List, java.util.List, java.util.List, java.util.List, java.util.List, com.zykj.student.dialogue.bean.resp.FilterType$QuestionState, com.zykj.student.dialogue.bean.resp.FilterType$Time$JoinedTime, com.zykj.student.dialogue.bean.resp.FilterType$Time$UpdatedTime, com.zykj.student.dialogue.bean.resp.FilterType$Time$FavoriteTime, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int, int):void"); // DEX body: android/随身答/smali_classes5/com/zykj/student/dialogue/ui/home/DrawerContentKt.smali:5942
    }

    /* renamed from: w */
    public static final Unit m10607w(final List list, final List list2, final Function1 function1, LazyGridScope LazyVerticalGrid) {
        Intrinsics.checkNotNullParameter(LazyVerticalGrid, "$this$LazyVerticalGrid");
        final C7551xdac6a675 c7551xdac6a675 = new Function1() { // from class: com.zykj.student.dialogue.ui.home.DrawerContentKt$FilterContent$lambda$35$lambda$23$lambda$22$$inlined$items$default$1
            @Override // kotlin.jvm.functions.Function1
            public final Void invoke(Object obj) {
                return null;
            }
        };
        LazyVerticalGrid.items(list.size(), null, null, new Function1<Integer, Object>() { // from class: com.zykj.student.dialogue.ui.home.DrawerContentKt$FilterContent$lambda$35$lambda$23$lambda$22$$inlined$items$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int i9) {
                return c7551xdac6a675.invoke(list.get(i9));
            }
        }, ComposableLambdaKt.composableLambdaInstance(699646206, true, new Function4<LazyGridItemScope, Integer, Composer, Integer, Unit>() { // from class: com.zykj.student.dialogue.ui.home.DrawerContentKt$FilterContent$lambda$35$lambda$23$lambda$22$$inlined$items$default$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(4);
            }

            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(LazyGridItemScope lazyGridItemScope, Integer num, Composer composer, Integer num2) {
                invoke(lazyGridItemScope, num.intValue(), composer, num2.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(LazyGridItemScope lazyGridItemScope, int i9, Composer composer, int i10) {
                int i11;
                if ((i10 & 6) == 0) {
                    i11 = (composer.changed(lazyGridItemScope) ? 4 : 2) | i10;
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
                    ComposerKt.traceEventStart(699646206, i11, -1, "androidx.compose.foundation.lazy.grid.items.<anonymous> (LazyGridDsl.kt:542)");
                }
                FilterType.ViewStatus viewStatus = (FilterType.ViewStatus) list.get(i9);
                composer.startReplaceGroup(-1107552394);
                DrawerContentKt.m10602r(list2.contains(viewStatus), viewStatus, function1, composer, 0);
                composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        return Unit.INSTANCE;
    }

    /* renamed from: x */
    public static final Unit m10608x(final List list, final List list2, final Function1 function1, LazyGridScope LazyVerticalGrid) {
        Intrinsics.checkNotNullParameter(LazyVerticalGrid, "$this$LazyVerticalGrid");
        final C7554x3d1048ef c7554x3d1048ef = new Function1() { // from class: com.zykj.student.dialogue.ui.home.DrawerContentKt$FilterContent$lambda$35$lambda$26$lambda$25$$inlined$items$default$1
            @Override // kotlin.jvm.functions.Function1
            public final Void invoke(Object obj) {
                return null;
            }
        };
        LazyVerticalGrid.items(list.size(), null, null, new Function1<Integer, Object>() { // from class: com.zykj.student.dialogue.ui.home.DrawerContentKt$FilterContent$lambda$35$lambda$26$lambda$25$$inlined$items$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int i9) {
                return c7554x3d1048ef.invoke(list.get(i9));
            }
        }, ComposableLambdaKt.composableLambdaInstance(699646206, true, new Function4<LazyGridItemScope, Integer, Composer, Integer, Unit>() { // from class: com.zykj.student.dialogue.ui.home.DrawerContentKt$FilterContent$lambda$35$lambda$26$lambda$25$$inlined$items$default$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(4);
            }

            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(LazyGridItemScope lazyGridItemScope, Integer num, Composer composer, Integer num2) {
                invoke(lazyGridItemScope, num.intValue(), composer, num2.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(LazyGridItemScope lazyGridItemScope, int i9, Composer composer, int i10) {
                int i11;
                if ((i10 & 6) == 0) {
                    i11 = (composer.changed(lazyGridItemScope) ? 4 : 2) | i10;
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
                    ComposerKt.traceEventStart(699646206, i11, -1, "androidx.compose.foundation.lazy.grid.items.<anonymous> (LazyGridDsl.kt:542)");
                }
                FilterType.TeacherViewStatus teacherViewStatus = (FilterType.TeacherViewStatus) list.get(i9);
                composer.startReplaceGroup(1183823990);
                DrawerContentKt.m10602r(list2.contains(teacherViewStatus), teacherViewStatus, function1, composer, 0);
                composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        return Unit.INSTANCE;
    }

    /* renamed from: y */
    public static final Unit m10609y(List list, FilterType.Time.FavoriteTime favoriteTime, Function1 function1, FlowRowScope FlowRow, Composer composer, int i9) {
        Intrinsics.checkNotNullParameter(FlowRow, "$this$FlowRow");
        if (composer.shouldExecute((i9 & 17) != 16, i9 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1720995593, i9, -1, "com.zykj.student.dialogue.ui.home.FilterContent.<anonymous>.<anonymous> (DrawerContent.kt:315)");
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                FilterType.Time.FavoriteTime favoriteTime2 = (FilterType.Time.FavoriteTime) it.next();
                m10602r((favoriteTime2.isCustomTime() && favoriteTime.isCustomTime()) ? true : Intrinsics.areEqual(favoriteTime2, favoriteTime), favoriteTime2, function1, composer, 0);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* renamed from: z */
    public static final Unit m10610z(List list, FilterType.Time.JoinedTime joinedTime, Function1 function1, FlowRowScope FlowRow, Composer composer, int i9) {
        Intrinsics.checkNotNullParameter(FlowRow, "$this$FlowRow");
        if (composer.shouldExecute((i9 & 17) != 16, i9 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(906477458, i9, -1, "com.zykj.student.dialogue.ui.home.FilterContent.<anonymous>.<anonymous> (DrawerContent.kt:335)");
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                FilterType.Time.JoinedTime joinedTime2 = (FilterType.Time.JoinedTime) it.next();
                m10602r((joinedTime2.isCustomTime() && joinedTime.isCustomTime()) ? true : Intrinsics.areEqual(joinedTime2, joinedTime), joinedTime2, function1, composer, 0);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }
}
