package p089f6;

import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p013ui.Alignment;
import androidx.compose.p013ui.ComposedModifierKt;
import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.layout.MeasurePolicy;
import androidx.compose.p013ui.node.ComposeUiNode;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import p276w5.C9761c;
import p276w5.C9773g;

/* renamed from: f6.u0 */
/* loaded from: classes4.dex */
public abstract class AbstractC7482u0 {
    /* renamed from: A */
    public static final Unit m12090A(List list, final Function2 function2, ColumnScope TitleWithContent, Composer composer, int i10) {
        Intrinsics.checkNotNullParameter(TitleWithContent, "$this$TitleWithContent");
        if (composer.shouldExecute((i10 & 17) != 16, i10 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-474575496, i10, -1, "com.zykj.evaluation.ui.detail.widget.TypicalErrorView.<anonymous> (TypicalAndDraftView.kt:65)");
            }
            Modifier modifierHorizontalScroll$default = ScrollKt.horizontalScroll$default(Modifier.INSTANCE, ScrollKt.rememberScrollState(0, composer, 0, 1), false, null, false, 14, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), composer, 0);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierHorizontalScroll$default);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
            if (composer.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            Composer composerM20418constructorimpl = Updater.m20418constructorimpl(composer);
            Updater.m20425setimpl(composerM20418constructorimpl, measurePolicyRowMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m20425setimpl(composerM20418constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (composerM20418constructorimpl.getInserting() || !Intrinsics.areEqual(composerM20418constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM20418constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM20418constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m20425setimpl(composerM20418constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            composer.startReplaceGroup(-1972772204);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                final C9773g c9773g = (C9773g) it.next();
                String strM16381a = c9773g.m16381a();
                String strM16382b = c9773g.m16382b();
                String strM16383c = c9773g.m16383c();
                boolean zChanged = composer.changed(function2) | composer.changed(c9773g);
                Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: f6.i0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return AbstractC7482u0.m12091B(function2, c9773g);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                m12112s(strM16381a, strM16382b, strM16383c, (Function0) objRememberedValue, composer, 0, 0);
            }
            composer.endReplaceGroup();
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* renamed from: B */
    public static final Unit m12091B(Function2 function2, C9773g c9773g) {
        function2.invoke(c9773g.m16381a(), c9773g.m16382b());
        return Unit.INSTANCE;
    }

    /* renamed from: C */
    public static final Unit m12092C(List list, Function2 function2, int i10, Composer composer, int i11) {
        m12119z(list, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i10 | 1));
        return Unit.INSTANCE;
    }

    /* renamed from: D */
    public static final Unit m12093D(List list, Function2 function2, int i10, Composer composer, int i11) {
        m12119z(list, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i10 | 1));
        return Unit.INSTANCE;
    }

    /* renamed from: n */
    public static final void m12107n(final List draft, final Function2 onClickImage, Composer composer, final int i10) {
        int i11;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Function2<? super Composer, ? super Integer, Unit> function2;
        Intrinsics.checkNotNullParameter(draft, "draft");
        Intrinsics.checkNotNullParameter(onClickImage, "onClickImage");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1151987665);
        if ((i10 & 6) == 0) {
            i11 = (composerStartRestartGroup.changedInstance(draft) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(onClickImage) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i11 & 19) != 18, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1151987665, i11, -1, "com.zykj.evaluation.ui.detail.widget.DraftView (TypicalAndDraftView.kt:89)");
            }
            if (draft.isEmpty()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    function2 = new Function2() { // from class: f6.q0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return AbstractC7482u0.m12108o(draft, onClickImage, i10, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    };
                    scopeUpdateScopeEndRestartGroup.updateScope(function2);
                }
                return;
            }
            AbstractC7451f.m12037l(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), "我的草稿", null, null, ComposableLambdaKt.rememberComposableLambda(1827304755, true, new Function3() { // from class: f6.r0
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return AbstractC7482u0.m12109p(draft, onClickImage, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 24630, 12);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            function2 = new Function2() { // from class: f6.s0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AbstractC7482u0.m12111r(draft, onClickImage, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            };
            scopeUpdateScopeEndRestartGroup.updateScope(function2);
        }
    }

    /* renamed from: o */
    public static final Unit m12108o(List list, Function2 function2, int i10, Composer composer, int i11) {
        m12107n(list, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i10 | 1));
        return Unit.INSTANCE;
    }

    /* renamed from: p */
    public static final Unit m12109p(List list, final Function2 function2, ColumnScope TitleWithContent, Composer composer, int i10) {
        Intrinsics.checkNotNullParameter(TitleWithContent, "$this$TitleWithContent");
        if (composer.shouldExecute((i10 & 17) != 16, i10 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1827304755, i10, -1, "com.zykj.evaluation.ui.detail.widget.DraftView.<anonymous> (TypicalAndDraftView.kt:96)");
            }
            Modifier modifierHorizontalScroll$default = ScrollKt.horizontalScroll$default(Modifier.INSTANCE, ScrollKt.rememberScrollState(0, composer, 0, 1), false, null, false, 14, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), composer, 0);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierHorizontalScroll$default);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
            if (composer.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            Composer composerM20418constructorimpl = Updater.m20418constructorimpl(composer);
            Updater.m20425setimpl(composerM20418constructorimpl, measurePolicyRowMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m20425setimpl(composerM20418constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (composerM20418constructorimpl.getInserting() || !Intrinsics.areEqual(composerM20418constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM20418constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM20418constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m20425setimpl(composerM20418constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            composer.startReplaceGroup(1041814028);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                final C9761c c9761c = (C9761c) it.next();
                String strM16359b = c9761c.m16359b();
                String strM16358a = c9761c.m16358a();
                boolean zChanged = composer.changed(function2) | composer.changed(c9761c);
                Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: f6.j0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return AbstractC7482u0.m12110q(function2, c9761c);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                m12112s(strM16359b, null, strM16358a, (Function0) objRememberedValue, composer, 0, 2);
            }
            composer.endReplaceGroup();
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* renamed from: q */
    public static final Unit m12110q(Function2 function2, C9761c c9761c) {
        function2.invoke(c9761c.m16359b(), "");
        return Unit.INSTANCE;
    }

    /* renamed from: r */
    public static final Unit m12111r(List list, Function2 function2, int i10, Composer composer, int i11) {
        m12107n(list, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i10 | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:89:? A[RETURN, SYNTHETIC] */
    /* renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m12112s(final java.lang.String r32, java.lang.String r33, final java.lang.String r34, final kotlin.jvm.functions.Function0 r35, androidx.compose.runtime.Composer r36, final int r37, final int r38) {
        /*
            Method dump skipped, instructions count: 798
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p089f6.AbstractC7482u0.m12112s(java.lang.String, java.lang.String, java.lang.String, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    /* renamed from: t */
    public static final Unit m12113t(String str, String str2, String str3, Function0 function0, int i10, int i11, Composer composer, int i12) {
        m12112s(str, str2, str3, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i10 | 1), i11);
        return Unit.INSTANCE;
    }

    /* renamed from: u */
    public static final void m12114u(final List typicalAnswer, final Function2 onClickImage, Composer composer, final int i10) {
        int i11;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Function2<? super Composer, ? super Integer, Unit> function2;
        Intrinsics.checkNotNullParameter(typicalAnswer, "typicalAnswer");
        Intrinsics.checkNotNullParameter(onClickImage, "onClickImage");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1487205566);
        if ((i10 & 6) == 0) {
            i11 = (composerStartRestartGroup.changedInstance(typicalAnswer) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(onClickImage) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i11 & 19) != 18, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1487205566, i11, -1, "com.zykj.evaluation.ui.detail.widget.TypicalAnswerView (TypicalAndDraftView.kt:27)");
            }
            if (typicalAnswer.isEmpty()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    function2 = new Function2() { // from class: f6.h0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return AbstractC7482u0.m12115v(typicalAnswer, onClickImage, i10, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    };
                    scopeUpdateScopeEndRestartGroup.updateScope(function2);
                }
                return;
            }
            AbstractC7451f.m12037l(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), "优秀解答", null, null, ComposableLambdaKt.rememberComposableLambda(-708039610, true, new Function3() { // from class: f6.l0
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return AbstractC7482u0.m12116w(typicalAnswer, onClickImage, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 24630, 12);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            function2 = new Function2() { // from class: f6.m0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AbstractC7482u0.m12118y(typicalAnswer, onClickImage, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            };
            scopeUpdateScopeEndRestartGroup.updateScope(function2);
        }
    }

    /* renamed from: v */
    public static final Unit m12115v(List list, Function2 function2, int i10, Composer composer, int i11) {
        m12114u(list, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i10 | 1));
        return Unit.INSTANCE;
    }

    /* renamed from: w */
    public static final Unit m12116w(List list, final Function2 function2, ColumnScope TitleWithContent, Composer composer, int i10) {
        Intrinsics.checkNotNullParameter(TitleWithContent, "$this$TitleWithContent");
        if (composer.shouldExecute((i10 & 17) != 16, i10 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-708039610, i10, -1, "com.zykj.evaluation.ui.detail.widget.TypicalAnswerView.<anonymous> (TypicalAndDraftView.kt:34)");
            }
            Modifier modifierHorizontalScroll$default = ScrollKt.horizontalScroll$default(Modifier.INSTANCE, ScrollKt.rememberScrollState(0, composer, 0, 1), false, null, false, 14, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), composer, 0);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierHorizontalScroll$default);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
            if (composer.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            Composer composerM20418constructorimpl = Updater.m20418constructorimpl(composer);
            Updater.m20425setimpl(composerM20418constructorimpl, measurePolicyRowMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m20425setimpl(composerM20418constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (composerM20418constructorimpl.getInserting() || !Intrinsics.areEqual(composerM20418constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM20418constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM20418constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m20425setimpl(composerM20418constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            composer.startReplaceGroup(493565297);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                final C9773g c9773g = (C9773g) it.next();
                String strM16381a = c9773g.m16381a();
                String strM16382b = c9773g.m16382b();
                String strM16383c = c9773g.m16383c();
                boolean zChanged = composer.changed(function2) | composer.changed(c9773g);
                Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: f6.t0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return AbstractC7482u0.m12117x(function2, c9773g);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                m12112s(strM16381a, strM16382b, strM16383c, (Function0) objRememberedValue, composer, 0, 0);
            }
            composer.endReplaceGroup();
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* renamed from: x */
    public static final Unit m12117x(Function2 function2, C9773g c9773g) {
        function2.invoke(c9773g.m16381a(), c9773g.m16382b());
        return Unit.INSTANCE;
    }

    /* renamed from: y */
    public static final Unit m12118y(List list, Function2 function2, int i10, Composer composer, int i11) {
        m12114u(list, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i10 | 1));
        return Unit.INSTANCE;
    }

    /* renamed from: z */
    public static final void m12119z(final List typicalAnswer, final Function2 onClickImage, Composer composer, final int i10) {
        int i11;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Function2<? super Composer, ? super Integer, Unit> function2;
        Intrinsics.checkNotNullParameter(typicalAnswer, "typicalAnswer");
        Intrinsics.checkNotNullParameter(onClickImage, "onClickImage");
        Composer composerStartRestartGroup = composer.startRestartGroup(1301405436);
        if ((i10 & 6) == 0) {
            i11 = (composerStartRestartGroup.changedInstance(typicalAnswer) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(onClickImage) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i11 & 19) != 18, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1301405436, i11, -1, "com.zykj.evaluation.ui.detail.widget.TypicalErrorView (TypicalAndDraftView.kt:58)");
            }
            if (typicalAnswer.isEmpty()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    function2 = new Function2() { // from class: f6.n0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return AbstractC7482u0.m12093D(typicalAnswer, onClickImage, i10, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    };
                    scopeUpdateScopeEndRestartGroup.updateScope(function2);
                }
                return;
            }
            AbstractC7451f.m12037l(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), "典型错误", null, null, ComposableLambdaKt.rememberComposableLambda(-474575496, true, new Function3() { // from class: f6.o0
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return AbstractC7482u0.m12090A(typicalAnswer, onClickImage, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 24630, 12);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            function2 = new Function2() { // from class: f6.p0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AbstractC7482u0.m12092C(typicalAnswer, onClickImage, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            };
            scopeUpdateScopeEndRestartGroup.updateScope(function2);
        }
    }
}
