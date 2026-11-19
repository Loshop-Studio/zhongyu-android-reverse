package p089f6;

import android.content.res.Resources;
import android.util.DisplayMetrics;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.p013ui.Alignment;
import androidx.compose.p013ui.ComposedModifierKt;
import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.layout.MeasurePolicy;
import androidx.compose.p013ui.node.ComposeUiNode;
import androidx.compose.p013ui.unit.C3127Dp;
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
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import p276w5.C9764d;

/* renamed from: f6.c0 */
/* loaded from: classes4.dex */
public abstract class AbstractC7446c0 {
    /* JADX WARN: Removed duplicated region for block: B:130:0x04dd  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x04ee  */
    /* JADX WARN: Removed duplicated region for block: B:135:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008d  */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m12017h(java.lang.String r42, java.lang.String r43, java.lang.String r44, kotlin.jvm.functions.Function0 r45, androidx.compose.runtime.Composer r46, final int r47, final int r48) {
        /*
            Method dump skipped, instructions count: 1275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p089f6.AbstractC7446c0.m12017h(java.lang.String, java.lang.String, java.lang.String, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    /* renamed from: i */
    public static final Unit m12018i(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* renamed from: j */
    public static final Unit m12019j(String str, String str2, String str3, Function0 function0, int i10, int i11, Composer composer, int i12) {
        m12017h(str, str2, str3, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i10 | 1), i11);
        return Unit.INSTANCE;
    }

    /* renamed from: k */
    public static final Unit m12020k() {
        return Unit.INSTANCE;
    }

    /* renamed from: l */
    public static final void m12021l(final List microClassList, final Function1 onClickMicroClass, Composer composer, final int i10) {
        int i11;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Function2<? super Composer, ? super Integer, Unit> function2;
        Intrinsics.checkNotNullParameter(microClassList, "microClassList");
        Intrinsics.checkNotNullParameter(onClickMicroClass, "onClickMicroClass");
        Composer composerStartRestartGroup = composer.startRestartGroup(292388343);
        if ((i10 & 6) == 0) {
            i11 = (composerStartRestartGroup.changedInstance(microClassList) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(onClickMicroClass) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i11 & 19) != 18, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(292388343, i11, -1, "com.zykj.evaluation.ui.detail.widget.MicroClassView (MicroClassView.kt:29)");
            }
            if (microClassList.isEmpty()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    function2 = new Function2() { // from class: f6.v
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return AbstractC7446c0.m12022m(microClassList, onClickMicroClass, i10, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    };
                    scopeUpdateScopeEndRestartGroup.updateScope(function2);
                }
                return;
            }
            AbstractC7451f.m12037l(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), "试题微课", null, null, ComposableLambdaKt.rememberComposableLambda(-1023286533, true, new Function3() { // from class: f6.w
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return AbstractC7446c0.m12023n(microClassList, onClickMicroClass, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
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
            function2 = new Function2() { // from class: f6.x
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AbstractC7446c0.m12025p(microClassList, onClickMicroClass, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            };
            scopeUpdateScopeEndRestartGroup.updateScope(function2);
        }
    }

    /* renamed from: m */
    public static final Unit m12022m(List list, Function1 function1, int i10, Composer composer, int i11) {
        m12021l(list, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i10 | 1));
        return Unit.INSTANCE;
    }

    /* renamed from: n */
    public static final Unit m12023n(List list, final Function1 function1, ColumnScope TitleWithContent, Composer composer, int i10) {
        Intrinsics.checkNotNullParameter(TitleWithContent, "$this$TitleWithContent");
        if (composer.shouldExecute((i10 & 17) != 16, i10 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1023286533, i10, -1, "com.zykj.evaluation.ui.detail.widget.MicroClassView.<anonymous> (MicroClassView.kt:37)");
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
            composer.startReplaceGroup(1812721595);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                final C9764d c9764d = (C9764d) it.next();
                String strM16361b = c9764d.m16361b();
                String strM16360a = c9764d.m16360a();
                String strM16362c = c9764d.m16362c();
                boolean zChanged = composer.changed(function1) | composer.changed(c9764d);
                Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: f6.y
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return AbstractC7446c0.m12024o(function1, c9764d);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                Composer composer2 = composer;
                m12017h(strM16361b, strM16360a, strM16362c, (Function0) objRememberedValue, composer2, 0, 0);
                DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
                SpacerKt.Spacer(SizeKt.m17733width3ABfNKs(Modifier.INSTANCE, C3127Dp.m23561constructorimpl((23 / 600) * (RangesKt.coerceAtLeast(displayMetrics.widthPixels, displayMetrics.heightPixels) / Resources.getSystem().getDisplayMetrics().density))), composer2, 6);
                composer = composer2;
            }
            Composer composer3 = composer;
            composer3.endReplaceGroup();
            composer3.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* renamed from: o */
    public static final Unit m12024o(Function1 function1, C9764d c9764d) {
        function1.invoke(c9764d.m16363d());
        return Unit.INSTANCE;
    }

    /* renamed from: p */
    public static final Unit m12025p(List list, Function1 function1, int i10, Composer composer, int i11) {
        m12021l(list, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i10 | 1));
        return Unit.INSTANCE;
    }
}
