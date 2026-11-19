package com.zykj.evaluation.p057ui.detail.widget.question;

import android.content.res.Resources;
import android.graphics.Bitmap;
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
import androidx.compose.p013ui.graphics.AndroidImageBitmap_androidKt;
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
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import coil3.compose.AbstractC5177c;
import com.zykj.evaluation.p057ui.detail.AbstractC6900e;
import com.zykj.evaluation.p057ui.detail.AbstractC6901f;
import com.zykj.evaluation.p057ui.detail.widget.question.HandQuestionViewKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CoroutineScope;
import p089f6.AbstractC7451f;
import p101g7.AbstractC7593i;

/* loaded from: classes4.dex */
public abstract class HandQuestionViewKt {
    /* JADX WARN: Removed duplicated region for block: B:30:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:98:? A[RETURN, SYNTHETIC] */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m9756i(final java.lang.String r16, final java.lang.String r17, java.lang.String r18, final boolean r19, final kotlin.jvm.functions.Function0 r20, com.zykj.evaluation.p057ui.detail.AbstractC6901f r21, com.zykj.evaluation.p057ui.detail.AbstractC6900e r22, final kotlin.jvm.functions.Function1 r23, androidx.compose.runtime.Composer r24, final int r25, final int r26) {
        /*
            Method dump skipped, instructions count: 344
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.evaluation.p057ui.detail.widget.question.HandQuestionViewKt.m9756i(java.lang.String, java.lang.String, java.lang.String, boolean, kotlin.jvm.functions.Function0, com.zykj.evaluation.ui.detail.f, com.zykj.evaluation.ui.detail.e, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void"); // DEX body: android/新测评/smali_classes4/com/zykj/evaluation/ui/detail/widget/question/HandQuestionViewKt.smali:95
    }

    /* renamed from: j */
    public static final Unit m9757j(String str, String str2, boolean z9, Function0 function0, AbstractC6900e abstractC6900e, Function1 function1, AbstractC6901f abstractC6901f, RowScope NumberWithContent, Composer composer, int i10) {
        Intrinsics.checkNotNullParameter(NumberWithContent, "$this$NumberWithContent");
        if (composer.shouldExecute((i10 & 17) != 16, i10 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1371800911, i10, -1, "com.zykj.evaluation.ui.detail.widget.question.HandQuestionView.<anonymous> (HandQuestionView.kt:151)");
            }
            DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
            m9759l(SizeKt.m17713defaultMinSizeVpY3zN4$default(Modifier.INSTANCE, 0.0f, C3127Dp.m23561constructorimpl((70 / 600) * (RangesKt.coerceAtLeast(displayMetrics.widthPixels, displayMetrics.heightPixels) / Resources.getSystem().getDisplayMetrics().density)), 1, null), str, str2, z9, function0, abstractC6900e, function1, abstractC6901f, composer, 6, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* renamed from: k */
    public static final Unit m9758k(String str, String str2, String str3, boolean z9, Function0 function0, AbstractC6901f abstractC6901f, AbstractC6900e abstractC6900e, Function1 function1, int i10, int i11, Composer composer, int i12) {
        m9756i(str, str2, str3, z9, function0, abstractC6901f, abstractC6900e, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i10 | 1), i11);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:112:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00f0  */
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m9759l(androidx.compose.p013ui.Modifier r18, final java.lang.String r19, java.lang.String r20, final boolean r21, final kotlin.jvm.functions.Function0 r22, com.zykj.evaluation.p057ui.detail.AbstractC6900e r23, final kotlin.jvm.functions.Function1 r24, com.zykj.evaluation.p057ui.detail.AbstractC6901f r25, androidx.compose.runtime.Composer r26, final int r27, final int r28) {
        /*
            Method dump skipped, instructions count: 448
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.evaluation.p057ui.detail.widget.question.HandQuestionViewKt.m9759l(androidx.compose.ui.Modifier, java.lang.String, java.lang.String, boolean, kotlin.jvm.functions.Function0, com.zykj.evaluation.ui.detail.e, kotlin.jvm.functions.Function1, com.zykj.evaluation.ui.detail.f, androidx.compose.runtime.Composer, int, int):void"); // DEX body: android/新测评/smali_classes4/com/zykj/evaluation/ui/detail/widget/question/HandQuestionViewKt.smali:849
    }

    /* renamed from: m */
    public static final Unit m9760m(String str, String str2, AbstractC6901f abstractC6901f, boolean z9, AbstractC6900e abstractC6900e, final Function1 function1, BoxScope DashBackground, Composer composer, int i10) {
        int i11;
        BoxScope boxScope;
        Intrinsics.checkNotNullParameter(DashBackground, "$this$DashBackground");
        if ((i10 & 6) == 0) {
            i11 = i10 | (composer.changed(DashBackground) ? 4 : 2);
        } else {
            i11 = i10;
        }
        if (composer.shouldExecute((i11 & 19) != 18, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(703010217, i11, -1, "com.zykj.evaluation.ui.detail.widget.question.PageHandQuestionView.<anonymous> (HandQuestionView.kt:52)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            AbstractC5177c.m2945a(str, null, SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), null, null, null, ContentScale.INSTANCE.getFillWidth(), 0.0f, null, 0, false, composer, 1573296, 0, 1976);
            m9764q(str2, SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), composer, 48, 0);
            float f10 = 600;
            float f11 = 5 / f10;
            DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
            float fM23561constructorimpl = C3127Dp.m23561constructorimpl((RangesKt.coerceAtLeast(displayMetrics.widthPixels, displayMetrics.heightPixels) / Resources.getSystem().getDisplayMetrics().density) * f11);
            DisplayMetrics displayMetrics2 = Resources.getSystem().getDisplayMetrics();
            Modifier modifierM17685paddingqDBjuR0$default = PaddingKt.m17685paddingqDBjuR0$default(companion, fM23561constructorimpl, C3127Dp.m23561constructorimpl(f11 * (RangesKt.coerceAtLeast(displayMetrics2.widthPixels, displayMetrics2.heightPixels) / Resources.getSystem().getDisplayMetrics().density)), 0.0f, 0.0f, 12, null);
            DisplayMetrics displayMetrics3 = Resources.getSystem().getDisplayMetrics();
            ImageKt.Image(PainterResources_androidKt.painterResource(abstractC6901f.m9483a(), composer, 0), "", SizeKt.m17728size3ABfNKs(modifierM17685paddingqDBjuR0$default, C3127Dp.m23561constructorimpl((14 / f10) * (RangesKt.coerceAtLeast(displayMetrics3.widthPixels, displayMetrics3.heightPixels) / Resources.getSystem().getDisplayMetrics().density))), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer, 432, 120);
            if (!z9 && str.length() == 0 && str2.length() == 0) {
                composer.startReplaceGroup(1117490880);
                boxScope = DashBackground;
                AbstractC7451f.m12033h(boxScope.align(companion, Alignment.INSTANCE.getCenter()), composer, 0, 0);
            } else {
                boxScope = DashBackground;
                composer.startReplaceGroup(1115113273);
            }
            composer.endReplaceGroup();
            if (z9 && str.length() == 0) {
                composer.startReplaceGroup(1117621824);
                AbstractC7451f.m12039n(boxScope.align(companion, Alignment.INSTANCE.getCenter()), composer, 0, 0);
            } else {
                composer.startReplaceGroup(1115113273);
            }
            composer.endReplaceGroup();
            Alignment.Companion companion2 = Alignment.INSTANCE;
            Modifier modifierAlign = boxScope.align(companion, companion2.getCenterEnd());
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), companion2.getTop(), composer, 0);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierAlign);
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
            float f12 = 25 / f10;
            DisplayMetrics displayMetrics4 = Resources.getSystem().getDisplayMetrics();
            Modifier modifierM17728size3ABfNKs = SizeKt.m17728size3ABfNKs(companion, C3127Dp.m23561constructorimpl((RangesKt.coerceAtLeast(displayMetrics4.widthPixels, displayMetrics4.heightPixels) / Resources.getSystem().getDisplayMetrics().density) * f12));
            AbstractC6900e.c cVar = AbstractC6900e.c.f9266d;
            if (Intrinsics.areEqual(abstractC6900e, cVar)) {
                composer.startReplaceGroup(-1308988587);
            } else {
                composer.startReplaceGroup(-1306203516);
                boolean zChanged = composer.changed(function1);
                Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: g6.r
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return HandQuestionViewKt.m9761n(function1);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                modifierM17728size3ABfNKs = AbstractC7593i.m12480g(modifierM17728size3ABfNKs, false, (Function0) objRememberedValue, 1, null);
            }
            composer.endReplaceGroup();
            ImageKt.Image(PainterResources_androidKt.painterResource(abstractC6900e.m9482c(), composer, 0), "", modifierM17728size3ABfNKs, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer, 48, 120);
            DisplayMetrics displayMetrics5 = Resources.getSystem().getDisplayMetrics();
            Modifier modifierM17728size3ABfNKs2 = SizeKt.m17728size3ABfNKs(companion, C3127Dp.m23561constructorimpl((RangesKt.coerceAtLeast(displayMetrics5.widthPixels, displayMetrics5.heightPixels) / Resources.getSystem().getDisplayMetrics().density) * f12));
            if (Intrinsics.areEqual(abstractC6900e, cVar)) {
                composer.startReplaceGroup(-1308988587);
            } else {
                composer.startReplaceGroup(-1305739229);
                boolean zChanged2 = composer.changed(function1);
                Object objRememberedValue2 = composer.rememberedValue();
                if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function0() { // from class: g6.s
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return HandQuestionViewKt.m9762o(function1);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue2);
                }
                modifierM17728size3ABfNKs2 = AbstractC7593i.m12480g(modifierM17728size3ABfNKs2, false, (Function0) objRememberedValue2, 1, null);
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

    /* renamed from: n */
    public static final Unit m9761n(Function1 function1) {
        function1.invoke(Boolean.TRUE);
        return Unit.INSTANCE;
    }

    /* renamed from: o */
    public static final Unit m9762o(Function1 function1) {
        function1.invoke(Boolean.FALSE);
        return Unit.INSTANCE;
    }

    /* renamed from: p */
    public static final Unit m9763p(Modifier modifier, String str, String str2, boolean z9, Function0 function0, AbstractC6900e abstractC6900e, Function1 function1, AbstractC6901f abstractC6901f, int i10, int i11, Composer composer, int i12) {
        m9759l(modifier, str, str2, z9, function0, abstractC6900e, function1, abstractC6901f, composer, RecomposeScopeImplKt.updateChangedFlags(i10 | 1), i11);
        return Unit.INSTANCE;
    }

    /* renamed from: q */
    public static final void m9764q(final String str, final Modifier modifier, Composer composer, final int i10, final int i11) {
        int i12;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Function2<? super Composer, ? super Integer, Unit> function2;
        Modifier modifier2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1620262550);
        if ((i10 & 6) == 0) {
            i12 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i13 = i11 & 2;
        if (i13 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i12 & 19) != 18, i12 & 1)) {
            if (i13 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1620262550, i12, -1, "com.zykj.evaluation.ui.detail.widget.question.TransparentCommentImage (HandQuestionView.kt:108)");
            }
            if (str.length() == 0) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    function2 = new Function2() { // from class: g6.t
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return HandQuestionViewKt.m9767t(str, modifier, i10, i11, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    };
                    scopeUpdateScopeEndRestartGroup.updateScope(function2);
                }
                return;
            }
            int i14 = i12 & 14;
            boolean z9 = i14 == 4;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z9 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            MutableState mutableState = (MutableState) objRememberedValue;
            boolean zChanged = composerStartRestartGroup.changed(mutableState) | (i14 == 4);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new HandQuestionViewKt$TransparentCommentImage$2$1(str, mutableState, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            EffectsKt.LaunchedEffect(str, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, i14);
            Bitmap bitmapM9768u = m9768u(mutableState);
            if (bitmapM9768u == null) {
                composerStartRestartGroup.startReplaceGroup(1896357520);
                composerStartRestartGroup.endReplaceGroup();
                modifier2 = modifier;
            } else {
                composerStartRestartGroup.startReplaceGroup(1896357521);
                modifier2 = modifier;
                ImageKt.m17247Image5hnEew(AndroidImageBitmap_androidKt.asImageBitmap(bitmapM9768u), null, modifier2, null, ContentScale.INSTANCE.getFillWidth(), 0.0f, null, 0, composerStartRestartGroup, ((i12 << 3) & 896) | 24624, 232);
                composerStartRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier = modifier2;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            function2 = new Function2() { // from class: g6.u
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return HandQuestionViewKt.m9766s(str, modifier, i10, i11, (Composer) obj, ((Integer) obj2).intValue());
                }
            };
            scopeUpdateScopeEndRestartGroup.updateScope(function2);
        }
    }

    /* renamed from: r */
    public static final void m9765r(MutableState mutableState, Bitmap bitmap) {
        mutableState.setValue(bitmap);
    }

    /* renamed from: s */
    public static final Unit m9766s(String str, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        m9764q(str, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i10 | 1), i11);
        return Unit.INSTANCE;
    }

    /* renamed from: t */
    public static final Unit m9767t(String str, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        m9764q(str, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i10 | 1), i11);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: u */
    public static final Bitmap m9768u(MutableState mutableState) {
        return (Bitmap) mutableState.getValue();
    }
}
