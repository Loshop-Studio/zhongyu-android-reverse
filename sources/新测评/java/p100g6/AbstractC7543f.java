package p100g6;

import android.content.res.Resources;
import android.util.DisplayMetrics;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p013ui.Alignment;
import androidx.compose.p013ui.ComposedModifierKt;
import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.graphics.ColorFilter;
import androidx.compose.p013ui.layout.ContentScale;
import androidx.compose.p013ui.layout.MeasurePolicy;
import androidx.compose.p013ui.node.ComposeUiNode;
import androidx.compose.p013ui.res.PainterResources_androidKt;
import androidx.compose.p013ui.unit.C3127Dp;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import coil3.compose.AbstractC5177c;
import com.zykj.evaluation.p057ui.detail.AbstractC6900e;
import com.zykj.evaluation.p057ui.detail.AbstractC6901f;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import p089f6.AbstractC7451f;
import p101g7.AbstractC7593i;

/* renamed from: g6.f */
/* loaded from: classes4.dex */
public abstract class AbstractC7543f {
    /* JADX WARN: Removed duplicated region for block: B:45:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:86:? A[RETURN, SYNTHETIC] */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m12353f(final java.lang.String r16, final java.lang.String r17, final boolean r18, final kotlin.jvm.functions.Function0 r19, com.zykj.evaluation.p057ui.detail.AbstractC6900e r20, final kotlin.jvm.functions.Function1 r21, com.zykj.evaluation.p057ui.detail.AbstractC6901f r22, androidx.compose.runtime.Composer r23, final int r24, final int r25) {
        /*
            Method dump skipped, instructions count: 357
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p100g6.AbstractC7543f.m12353f(java.lang.String, java.lang.String, boolean, kotlin.jvm.functions.Function0, com.zykj.evaluation.ui.detail.e, kotlin.jvm.functions.Function1, com.zykj.evaluation.ui.detail.f, androidx.compose.runtime.Composer, int, int):void");
    }

    /* renamed from: g */
    public static final Unit m12354g(final boolean z9, final String str, Function0 function0, final AbstractC6901f abstractC6901f, final AbstractC6900e abstractC6900e, final Function1 function1, RowScope NumberWithContent, Composer composer, int i10) {
        Intrinsics.checkNotNullParameter(NumberWithContent, "$this$NumberWithContent");
        if (composer.shouldExecute((i10 & 17) != 16, i10 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1721872262, i10, -1, "com.zykj.evaluation.ui.detail.widget.question.BlankQuestionView.<anonymous> (BlankQuestionView.kt:32)");
            }
            AbstractC7451f.m12031f(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), z9, z9 || str.length() > 0, function0, ComposableLambdaKt.rememberComposableLambda(1696030798, true, new Function3() { // from class: g6.c
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return AbstractC7543f.m12355h(str, abstractC6901f, z9, abstractC6900e, function1, (BoxScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, composer, 54), composer, 24582, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* renamed from: h */
    public static final Unit m12355h(String str, AbstractC6901f abstractC6901f, boolean z9, AbstractC6900e abstractC6900e, final Function1 function1, BoxScope DashBackground, Composer composer, int i10) {
        int i11;
        Object obj;
        boolean z10;
        Intrinsics.checkNotNullParameter(DashBackground, "$this$DashBackground");
        if ((i10 & 6) == 0) {
            i11 = i10 | (composer.changed(DashBackground) ? 4 : 2);
        } else {
            i11 = i10;
        }
        if (composer.shouldExecute((i11 & 19) != 18, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1696030798, i11, -1, "com.zykj.evaluation.ui.detail.widget.question.BlankQuestionView.<anonymous>.<anonymous> (BlankQuestionView.kt:39)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            AbstractC5177c.m2945a(str, null, SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), null, null, null, ContentScale.INSTANCE.getFit(), 0.0f, null, 0, false, composer, 1573296, 0, 1976);
            float f10 = 600;
            DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
            Modifier modifierM17685paddingqDBjuR0$default = PaddingKt.m17685paddingqDBjuR0$default(companion, C3127Dp.m23561constructorimpl((5 / f10) * (RangesKt.coerceAtLeast(displayMetrics.widthPixels, displayMetrics.heightPixels) / Resources.getSystem().getDisplayMetrics().density)), 0.0f, 0.0f, 0.0f, 14, null);
            Alignment.Companion companion2 = Alignment.INSTANCE;
            Modifier modifierAlign = DashBackground.align(modifierM17685paddingqDBjuR0$default, companion2.getCenterStart());
            DisplayMetrics displayMetrics2 = Resources.getSystem().getDisplayMetrics();
            ImageKt.Image(PainterResources_androidKt.painterResource(abstractC6901f.m9483a(), composer, 0), "", SizeKt.m17728size3ABfNKs(modifierAlign, C3127Dp.m23561constructorimpl((14 / f10) * (RangesKt.coerceAtLeast(displayMetrics2.widthPixels, displayMetrics2.heightPixels) / Resources.getSystem().getDisplayMetrics().density))), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer, 48, 120);
            if (str.length() == 0) {
                composer.startReplaceGroup(458799198);
                if (z9) {
                    composer.startReplaceGroup(458825827);
                    AbstractC7451f.m12039n(DashBackground.align(companion, companion2.getCenter()), composer, 0, 0);
                    composer.endReplaceGroup();
                } else {
                    composer.startReplaceGroup(458943875);
                    AbstractC7451f.m12033h(DashBackground.align(companion, companion2.getCenter()), composer, 0, 0);
                    composer.endReplaceGroup();
                }
            } else {
                composer.startReplaceGroup(456949428);
            }
            composer.endReplaceGroup();
            Modifier modifierAlign2 = DashBackground.align(companion, companion2.getCenterEnd());
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), companion2.getTop(), composer, 0);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierAlign2);
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
            Composer composerM20418constructorimpl = Updater.m20418constructorimpl(composer);
            Updater.m20425setimpl(composerM20418constructorimpl, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m20425setimpl(composerM20418constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (composerM20418constructorimpl.getInserting() || !Intrinsics.areEqual(composerM20418constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM20418constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM20418constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m20425setimpl(composerM20418constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            float f11 = 25 / f10;
            DisplayMetrics displayMetrics3 = Resources.getSystem().getDisplayMetrics();
            Modifier modifierM17728size3ABfNKs = SizeKt.m17728size3ABfNKs(companion, C3127Dp.m23561constructorimpl((RangesKt.coerceAtLeast(displayMetrics3.widthPixels, displayMetrics3.heightPixels) / Resources.getSystem().getDisplayMetrics().density) * f11));
            AbstractC6900e.c cVar = AbstractC6900e.c.f9266d;
            if (Intrinsics.areEqual(abstractC6900e, cVar)) {
                obj = null;
                z10 = true;
                composer.startReplaceGroup(1821344856);
            } else {
                composer.startReplaceGroup(1823666167);
                boolean zChanged = composer.changed(function1);
                Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: g6.d
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return AbstractC7543f.m12356i(function1);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                obj = null;
                z10 = true;
                modifierM17728size3ABfNKs = AbstractC7593i.m12480g(modifierM17728size3ABfNKs, false, (Function0) objRememberedValue, 1, null);
            }
            composer.endReplaceGroup();
            Object obj2 = obj;
            ImageKt.Image(PainterResources_androidKt.painterResource(abstractC6900e.m9482c(), composer, 0), "", modifierM17728size3ABfNKs, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer, 48, 120);
            DisplayMetrics displayMetrics4 = Resources.getSystem().getDisplayMetrics();
            Modifier modifierM17728size3ABfNKs2 = SizeKt.m17728size3ABfNKs(companion, C3127Dp.m23561constructorimpl((RangesKt.coerceAtLeast(displayMetrics4.widthPixels, displayMetrics4.heightPixels) / Resources.getSystem().getDisplayMetrics().density) * f11));
            if (Intrinsics.areEqual(abstractC6900e, cVar)) {
                composer.startReplaceGroup(1821344856);
            } else {
                composer.startReplaceGroup(1824174102);
                boolean zChanged2 = composer.changed(function1);
                Object objRememberedValue2 = composer.rememberedValue();
                if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function0() { // from class: g6.e
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return AbstractC7543f.m12357j(function1);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue2);
                }
                modifierM17728size3ABfNKs2 = AbstractC7593i.m12480g(modifierM17728size3ABfNKs2, false, (Function0) objRememberedValue2, 1, obj2);
            }
            composer.endReplaceGroup();
            ImageKt.Image(PainterResources_androidKt.painterResource(abstractC6900e.m9480a(), composer, 0), "", modifierM17728size3ABfNKs2, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer, 48, 120);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* renamed from: i */
    public static final Unit m12356i(Function1 function1) {
        function1.invoke(Boolean.TRUE);
        return Unit.INSTANCE;
    }

    /* renamed from: j */
    public static final Unit m12357j(Function1 function1) {
        function1.invoke(Boolean.FALSE);
        return Unit.INSTANCE;
    }

    /* renamed from: k */
    public static final Unit m12358k(String str, String str2, boolean z9, Function0 function0, AbstractC6900e abstractC6900e, Function1 function1, AbstractC6901f abstractC6901f, int i10, int i11, Composer composer, int i12) {
        m12353f(str, str2, z9, function0, abstractC6900e, function1, abstractC6901f, composer, RecomposeScopeImplKt.updateChangedFlags(i10 | 1), i11);
        return Unit.INSTANCE;
    }
}
