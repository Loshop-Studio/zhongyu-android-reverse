package p100g6;

import android.content.res.Resources;
import android.util.DisplayMetrics;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p013ui.Alignment;
import androidx.compose.p013ui.ComposedModifierKt;
import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.graphics.ColorFilter;
import androidx.compose.p013ui.graphics.ColorKt;
import androidx.compose.p013ui.graphics.Shadow;
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
import com.zykj.evaluation.R;
import com.zykj.evaluation.p057ui.detail.C6898c;
import java.util.ArrayList;
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
import p089f6.AbstractC7451f;
import p101g7.AbstractC7593i;
import p122i6.AbstractC7699p0;
import p189o5.AbstractC8709e;

/* renamed from: g6.z0 */
/* loaded from: classes4.dex */
public abstract class AbstractC7584z0 {
    /* JADX WARN: Removed duplicated region for block: B:108:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0792  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x079e  */
    /* JADX WARN: Removed duplicated region for block: B:225:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0166  */
    /* renamed from: E */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m12377E(final boolean r40, final boolean r41, final java.util.List r42, final java.util.List r43, final java.util.List r44, final java.lang.String r45, final java.lang.String r46, final kotlin.jvm.functions.Function3 r47, final kotlin.jvm.functions.Function2 r48, final kotlin.jvm.functions.Function1 r49, final kotlin.jvm.functions.Function2 r50, final kotlin.jvm.functions.Function2 r51, kotlin.jvm.functions.Function2 r52, final kotlin.jvm.functions.Function1 r53, androidx.compose.runtime.Composer r54, final int r55, final int r56, final int r57) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 1996
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p100g6.AbstractC7584z0.m12377E(boolean, boolean, java.util.List, java.util.List, java.util.List, java.lang.String, java.lang.String, kotlin.jvm.functions.Function3, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:261:0x0510  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x051e  */
    /* JADX WARN: Removed duplicated region for block: B:270:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00ef  */
    /* renamed from: F */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m12378F(final boolean r31, final boolean r32, final java.util.List r33, kotlin.jvm.functions.Function3 r34, kotlin.jvm.functions.Function2 r35, kotlin.jvm.functions.Function2 r36, kotlin.jvm.functions.Function2 r37, kotlin.jvm.functions.Function2 r38, androidx.compose.runtime.Composer r39, final int r40, final int r41) {
        /*
            Method dump skipped, instructions count: 1328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p100g6.AbstractC7584z0.m12378F(boolean, boolean, java.util.List, kotlin.jvm.functions.Function3, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int):void");
    }

    /* renamed from: G */
    public static final Unit m12379G(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "<unused var>");
        Intrinsics.checkNotNullParameter(str2, "<unused var>");
        return Unit.INSTANCE;
    }

    /* renamed from: H */
    public static final Unit m12380H(Function1 function1) {
        function1.invoke(Boolean.FALSE);
        return Unit.INSTANCE;
    }

    /* renamed from: I */
    public static final Unit m12381I(Function1 function1) {
        function1.invoke(Boolean.TRUE);
        return Unit.INSTANCE;
    }

    /* renamed from: J */
    public static final Unit m12382J(boolean z9, boolean z10, List list, List list2, List list3, String str, String str2, Function3 function3, Function2 function2, Function1 function1, Function2 function22, Function2 function23, Function2 function24, Function1 function12, int i10, int i11, int i12, Composer composer, int i13) throws Resources.NotFoundException {
        m12377E(z9, z10, list, list2, list3, str, str2, function3, function2, function1, function22, function23, function24, function12, composer, RecomposeScopeImplKt.updateChangedFlags(i10 | 1), RecomposeScopeImplKt.updateChangedFlags(i11), i12);
        return Unit.INSTANCE;
    }

    /* renamed from: K */
    public static final Unit m12383K(String str, String str2, boolean z9) {
        Intrinsics.checkNotNullParameter(str, "<unused var>");
        Intrinsics.checkNotNullParameter(str2, "<unused var>");
        return Unit.INSTANCE;
    }

    /* renamed from: L */
    public static final Unit m12384L(String str, List list) {
        Intrinsics.checkNotNullParameter(str, "<unused var>");
        Intrinsics.checkNotNullParameter(list, "<unused var>");
        return Unit.INSTANCE;
    }

    /* renamed from: M */
    public static final Unit m12385M(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "<unused var>");
        Intrinsics.checkNotNullParameter(str2, "<unused var>");
        return Unit.INSTANCE;
    }

    /* renamed from: N */
    public static final Unit m12386N(String str, boolean z9) {
        Intrinsics.checkNotNullParameter(str, "<unused var>");
        return Unit.INSTANCE;
    }

    /* renamed from: O */
    public static final Unit m12387O(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "<unused var>");
        Intrinsics.checkNotNullParameter(str2, "<unused var>");
        return Unit.INSTANCE;
    }

    /* renamed from: P */
    public static final Unit m12388P(boolean z9, Function3 function3, C6898c c6898c, Function2 function2) {
        if (z9) {
            function3.invoke(c6898c.m9460l(), c6898c.m9458j(), Boolean.TRUE);
        } else {
            String str = (String) CollectionsKt.firstOrNull(c6898c.m9451c());
            if (str == null) {
                str = "";
            }
            function2.invoke(str, c6898c.m9452d());
        }
        return Unit.INSTANCE;
    }

    /* renamed from: Q */
    public static final Unit m12389Q(Function2 function2, C6898c c6898c, boolean z9) {
        function2.invoke(c6898c.m9460l(), Boolean.valueOf(z9));
        return Unit.INSTANCE;
    }

    /* renamed from: R */
    public static final Unit m12390R(boolean z9, Function2 function2, C6898c c6898c, String select, boolean z10) {
        Intrinsics.checkNotNullParameter(select, "select");
        if (z9) {
            if (z10) {
                function2.invoke(c6898c.m9460l(), CollectionsKt.emptyList());
            } else {
                function2.invoke(c6898c.m9460l(), CollectionsKt.listOf(select));
            }
        }
        return Unit.INSTANCE;
    }

    /* renamed from: S */
    public static final Unit m12391S(boolean z9, Function2 function2, C6898c c6898c, String select, boolean z10) {
        Intrinsics.checkNotNullParameter(select, "select");
        if (z9) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(c6898c.m9451c());
            if (arrayList.contains(select)) {
                arrayList.remove(select);
            } else {
                arrayList.add(select);
            }
            CollectionsKt.sort(arrayList);
            function2.invoke(c6898c.m9460l(), arrayList);
        }
        return Unit.INSTANCE;
    }

    /* renamed from: T */
    public static final Unit m12392T(boolean z9, Function3 function3, C6898c c6898c, Function2 function2) {
        if (z9) {
            function3.invoke(c6898c.m9460l(), c6898c.m9458j(), Boolean.FALSE);
        } else {
            String str = (String) CollectionsKt.firstOrNull(c6898c.m9451c());
            if (str == null) {
                str = "";
            }
            function2.invoke(str, c6898c.m9452d());
        }
        return Unit.INSTANCE;
    }

    /* renamed from: U */
    public static final Unit m12393U(Function2 function2, C6898c c6898c, boolean z9) {
        function2.invoke(c6898c.m9460l(), Boolean.valueOf(z9));
        return Unit.INSTANCE;
    }

    /* renamed from: V */
    public static final Unit m12394V(boolean z9, C6898c c6898c, Function2 function2, Function3 function3, Function2 function22) {
        if (!z9) {
            String str = (String) CollectionsKt.firstOrNull(c6898c.m9451c());
            if (str == null) {
                str = "";
            }
            function22.invoke(str, c6898c.m9452d());
        } else if (c6898c.m9459k() instanceof AbstractC7699p0.c.b) {
            function2.invoke(c6898c.m9460l(), c6898c.m9458j());
        } else {
            function3.invoke(c6898c.m9460l(), c6898c.m9458j(), Boolean.TRUE);
        }
        return Unit.INSTANCE;
    }

    /* renamed from: W */
    public static final Unit m12395W(Function2 function2, C6898c c6898c, boolean z9) {
        function2.invoke(c6898c.m9460l(), Boolean.valueOf(z9));
        return Unit.INSTANCE;
    }

    /* renamed from: X */
    public static final Unit m12396X(boolean z9, boolean z10, List list, Function3 function3, Function2 function2, Function2 function22, Function2 function23, Function2 function24, int i10, int i11, Composer composer, int i12) {
        m12378F(z9, z10, list, function3, function2, function22, function23, function24, composer, RecomposeScopeImplKt.updateChangedFlags(i10 | 1), i11);
        return Unit.INSTANCE;
    }

    /* renamed from: Y */
    public static final void m12397Y(final boolean z9, final List examAnswerList, final Function2 onClickImage, final Function2 onClickCorrectSelf, final String examMicroClass, final Function1 onClickMicroClass, Composer composer, final int i10) throws Resources.NotFoundException {
        int i11;
        final List list;
        final Function2 function2;
        final Function2 function22;
        String str;
        Function1 function1;
        Composer composer2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Function2<? super Composer, ? super Integer, Unit> function23;
        Intrinsics.checkNotNullParameter(examAnswerList, "examAnswerList");
        Intrinsics.checkNotNullParameter(onClickImage, "onClickImage");
        Intrinsics.checkNotNullParameter(onClickCorrectSelf, "onClickCorrectSelf");
        Intrinsics.checkNotNullParameter(examMicroClass, "examMicroClass");
        Intrinsics.checkNotNullParameter(onClickMicroClass, "onClickMicroClass");
        Composer composerStartRestartGroup = composer.startRestartGroup(-995346653);
        if ((i10 & 6) == 0) {
            i11 = (composerStartRestartGroup.changed(z9) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(examAnswerList) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(onClickImage) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(onClickCorrectSelf) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= composerStartRestartGroup.changed(examMicroClass) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(onClickMicroClass) ? 131072 : 65536;
        }
        if (composerStartRestartGroup.shouldExecute((74899 & i11) != 74898, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-995346653, i11, -1, "com.zykj.evaluation.ui.detail.widget.question.ExamAnswerView (QuestionView.kt:166)");
            }
            if (examAnswerList.isEmpty()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    function23 = new Function2() { // from class: g6.t0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return AbstractC7584z0.m12398Z(z9, examAnswerList, onClickImage, onClickCorrectSelf, examMicroClass, onClickMicroClass, i10, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    };
                    scopeUpdateScopeEndRestartGroup.updateScope(function23);
                }
                return;
            }
            list = examAnswerList;
            function2 = onClickImage;
            function22 = onClickCorrectSelf;
            str = examMicroClass;
            function1 = onClickMicroClass;
            Modifier.Companion companion = Modifier.INSTANCE;
            DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
            SpacerKt.Spacer(SizeKt.m17714height3ABfNKs(companion, C3127Dp.m23561constructorimpl((3 / 600) * (RangesKt.coerceAtLeast(displayMetrics.widthPixels, displayMetrics.heightPixels) / Resources.getSystem().getDisplayMetrics().density))), composerStartRestartGroup, 6);
            composer2 = composerStartRestartGroup;
            AbstractC7451f.m12037l(null, StringResources_androidKt.stringResource(R.string.exam_answer_title, composerStartRestartGroup, 6), companion, null, ComposableLambdaKt.rememberComposableLambda(-1560799449, true, new Function3() { // from class: g6.u0
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return AbstractC7584z0.m12400a0(z9, list, function2, function22, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, composerStartRestartGroup, 54), composer2, 24960, 9);
            int i12 = i11 >> 9;
            m12412g0("查看批阅讲解", str, function1, composer2, (i12 & 896) | (i12 & 112) | 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            list = examAnswerList;
            function2 = onClickImage;
            function22 = onClickCorrectSelf;
            str = examMicroClass;
            function1 = onClickMicroClass;
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final List list2 = list;
            final Function2 function24 = function2;
            final Function2 function25 = function22;
            final String str2 = str;
            final Function1 function12 = function1;
            function23 = new Function2() { // from class: g6.v0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AbstractC7584z0.m12402b0(z9, list2, function24, function25, str2, function12, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            };
            scopeUpdateScopeEndRestartGroup.updateScope(function23);
        }
    }

    /* renamed from: Z */
    public static final Unit m12398Z(boolean z9, List list, Function2 function2, Function2 function22, String str, Function1 function1, int i10, Composer composer, int i11) throws Resources.NotFoundException {
        m12397Y(z9, list, function2, function22, str, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i10 | 1));
        return Unit.INSTANCE;
    }

    /* renamed from: a0 */
    public static final Unit m12400a0(boolean z9, List list, Function2 function2, Function2 function22, ColumnScope TitleWithContent, Composer composer, int i10) {
        Intrinsics.checkNotNullParameter(TitleWithContent, "$this$TitleWithContent");
        if (composer.shouldExecute((i10 & 17) != 16, i10 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1560799449, i10, -1, "com.zykj.evaluation.ui.detail.widget.question.ExamAnswerView.<anonymous> (QuestionView.kt:174)");
            }
            m12378F(false, z9, list, null, null, function2, function22, null, composer, 6, 152);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* renamed from: b0 */
    public static final Unit m12402b0(boolean z9, List list, Function2 function2, Function2 function22, String str, Function1 function1, int i10, Composer composer, int i11) throws Resources.NotFoundException {
        m12397Y(z9, list, function2, function22, str, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i10 | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /* renamed from: c0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m12404c0(final boolean r15, final java.util.List r16, final kotlin.jvm.functions.Function3 r17, final kotlin.jvm.functions.Function2 r18, kotlin.jvm.functions.Function2 r19, androidx.compose.runtime.Composer r20, final int r21, final int r22) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 297
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p100g6.AbstractC7584z0.m12404c0(boolean, java.util.List, kotlin.jvm.functions.Function3, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int):void");
    }

    /* renamed from: d0 */
    public static final Unit m12406d0(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "<unused var>");
        Intrinsics.checkNotNullParameter(str2, "<unused var>");
        return Unit.INSTANCE;
    }

    /* renamed from: e0 */
    public static final Unit m12408e0(boolean z9, List list, Function3 function3, Function2 function2, Function2 function22, ColumnScope TitleWithContent, Composer composer, int i10) {
        Intrinsics.checkNotNullParameter(TitleWithContent, "$this$TitleWithContent");
        if (composer.shouldExecute((i10 & 17) != 16, i10 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-165912568, i10, -1, "com.zykj.evaluation.ui.detail.widget.question.LocalAnswerView.<anonymous> (QuestionView.kt:147)");
            }
            m12378F(true, z9, list, function3, function2, null, null, function22, composer, 6, 96);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* renamed from: f0 */
    public static final Unit m12410f0(boolean z9, List list, Function3 function3, Function2 function2, Function2 function22, int i10, int i11, Composer composer, int i12) throws Resources.NotFoundException {
        m12404c0(z9, list, function3, function2, function22, composer, RecomposeScopeImplKt.updateChangedFlags(i10 | 1), i11);
        return Unit.INSTANCE;
    }

    /* renamed from: g0 */
    public static final void m12412g0(final String str, final String str2, final Function1 function1, Composer composer, final int i10) {
        int i11;
        Composer composerStartRestartGroup = composer.startRestartGroup(-796741022);
        if ((i10 & 6) == 0) {
            i11 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.changed(str2) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        int i12 = i11;
        if (composerStartRestartGroup.shouldExecute((i12 & 147) != 146, i12 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-796741022, i12, -1, "com.zykj.evaluation.ui.detail.widget.question.MicroClass (QuestionView.kt:377)");
            }
            if (str2.length() == 0) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: g6.o0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return AbstractC7584z0.m12414h0(str, str2, function1, i10, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            float f10 = 600;
            DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
            SpacerKt.Spacer(SizeKt.m17714height3ABfNKs(companion, C3127Dp.m23561constructorimpl((4 / f10) * (RangesKt.coerceAtLeast(displayMetrics.widthPixels, displayMetrics.heightPixels) / Resources.getSystem().getDisplayMetrics().density))), composerStartRestartGroup, 6);
            boolean z9 = ((i12 & 896) == 256) | ((i12 & 112) == 32);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z9 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: g6.p0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AbstractC7584z0.m12416i0(function1, str2);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            Modifier modifierM12480g = AbstractC7593i.m12480g(companion, false, (Function0) objRememberedValue, 1, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getCenterVertically(), composerStartRestartGroup, 48);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierM12480g);
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
            float f11 = 11 / f10;
            DisplayMetrics displayMetrics2 = Resources.getSystem().getDisplayMetrics();
            ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.icon_micro_read, composerStartRestartGroup, 6), (String) null, SizeKt.m17728size3ABfNKs(companion, C3127Dp.m23561constructorimpl(f11 * (RangesKt.coerceAtLeast(displayMetrics2.widthPixels, displayMetrics2.heightPixels) / Resources.getSystem().getDisplayMetrics().density))), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 432, 120);
            TextKt.m19430Text4IGK_g(str, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ColorKt.Color(4282882035L), AbstractC8709e.m14344k(8), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777212, (DefaultConstructorMarker) null), composerStartRestartGroup, i12 & 14, 1572864, 65534);
            composerStartRestartGroup = composerStartRestartGroup;
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 != null) {
            scopeUpdateScopeEndRestartGroup2.updateScope(new Function2() { // from class: g6.q0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AbstractC7584z0.m12418j0(str, str2, function1, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: h0 */
    public static final Unit m12414h0(String str, String str2, Function1 function1, int i10, Composer composer, int i11) {
        m12412g0(str, str2, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i10 | 1));
        return Unit.INSTANCE;
    }

    /* renamed from: i0 */
    public static final Unit m12416i0(Function1 function1, String str) {
        function1.invoke(str);
        return Unit.INSTANCE;
    }

    /* renamed from: j0 */
    public static final Unit m12418j0(String str, String str2, Function1 function1, int i10, Composer composer, int i11) {
        m12412g0(str, str2, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i10 | 1));
        return Unit.INSTANCE;
    }

    /* renamed from: k0 */
    public static final void m12420k0(final boolean z9, final List reviseAnswerList, final Function2 onClickImage, final String reviseMicroClass, final Function1 onClickMicroClass, Composer composer, final int i10) throws Resources.NotFoundException {
        int i11;
        final List list;
        final Function2 function2;
        String str;
        Function1 function1;
        Composer composer2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Function2<? super Composer, ? super Integer, Unit> function22;
        Intrinsics.checkNotNullParameter(reviseAnswerList, "reviseAnswerList");
        Intrinsics.checkNotNullParameter(onClickImage, "onClickImage");
        Intrinsics.checkNotNullParameter(reviseMicroClass, "reviseMicroClass");
        Intrinsics.checkNotNullParameter(onClickMicroClass, "onClickMicroClass");
        Composer composerStartRestartGroup = composer.startRestartGroup(1724574346);
        if ((i10 & 6) == 0) {
            i11 = (composerStartRestartGroup.changed(z9) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(reviseAnswerList) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(onClickImage) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= composerStartRestartGroup.changed(reviseMicroClass) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(onClickMicroClass) ? 16384 : 8192;
        }
        int i12 = i11;
        if (composerStartRestartGroup.shouldExecute((i12 & 9363) != 9362, i12 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1724574346, i12, -1, "com.zykj.evaluation.ui.detail.widget.question.ReviseAnswerView (QuestionView.kt:197)");
            }
            if (reviseAnswerList.isEmpty()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    function22 = new Function2() { // from class: g6.w
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return AbstractC7584z0.m12422l0(z9, reviseAnswerList, onClickImage, reviseMicroClass, onClickMicroClass, i10, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    };
                    scopeUpdateScopeEndRestartGroup.updateScope(function22);
                }
                return;
            }
            list = reviseAnswerList;
            function2 = onClickImage;
            str = reviseMicroClass;
            function1 = onClickMicroClass;
            DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
            SpacerKt.Spacer(SizeKt.m17714height3ABfNKs(Modifier.INSTANCE, C3127Dp.m23561constructorimpl((9 / 600) * (RangesKt.coerceAtLeast(displayMetrics.widthPixels, displayMetrics.heightPixels) / Resources.getSystem().getDisplayMetrics().density))), composerStartRestartGroup, 6);
            composer2 = composerStartRestartGroup;
            AbstractC7451f.m12037l(null, StringResources_androidKt.stringResource(R.string.revise_answer_title, composerStartRestartGroup, 6), null, null, ComposableLambdaKt.rememberComposableLambda(-764866930, true, new Function3() { // from class: g6.x
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return AbstractC7584z0.m12424m0(z9, list, function2, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, composerStartRestartGroup, 54), composer2, 24576, 13);
            int i13 = i12 >> 6;
            m12412g0("查看批阅讲解", str, function1, composer2, (i13 & 896) | (i13 & 112) | 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            list = reviseAnswerList;
            function2 = onClickImage;
            str = reviseMicroClass;
            function1 = onClickMicroClass;
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final List list2 = list;
            final Function2 function23 = function2;
            final String str2 = str;
            final Function1 function12 = function1;
            function22 = new Function2() { // from class: g6.y
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AbstractC7584z0.m12426n0(z9, list2, function23, str2, function12, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            };
            scopeUpdateScopeEndRestartGroup.updateScope(function22);
        }
    }

    /* renamed from: l0 */
    public static final Unit m12422l0(boolean z9, List list, Function2 function2, String str, Function1 function1, int i10, Composer composer, int i11) throws Resources.NotFoundException {
        m12420k0(z9, list, function2, str, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i10 | 1));
        return Unit.INSTANCE;
    }

    /* renamed from: m0 */
    public static final Unit m12424m0(boolean z9, List list, Function2 function2, ColumnScope TitleWithContent, Composer composer, int i10) {
        Intrinsics.checkNotNullParameter(TitleWithContent, "$this$TitleWithContent");
        if (composer.shouldExecute((i10 & 17) != 16, i10 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-764866930, i10, -1, "com.zykj.evaluation.ui.detail.widget.question.ReviseAnswerView.<anonymous> (QuestionView.kt:205)");
            }
            m12378F(false, z9, list, null, null, function2, null, null, composer, 6, 216);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* renamed from: n0 */
    public static final Unit m12426n0(boolean z9, List list, Function2 function2, String str, Function1 function1, int i10, Composer composer, int i11) throws Resources.NotFoundException {
        m12420k0(z9, list, function2, str, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i10 | 1));
        return Unit.INSTANCE;
    }
}
