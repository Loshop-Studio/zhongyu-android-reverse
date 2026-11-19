package p077i3;

import android.content.res.Resources;
import android.util.DisplayMetrics;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.CardDefaults;
import androidx.compose.material3.CardKt;
import androidx.compose.p009ui.Alignment;
import androidx.compose.p009ui.ComposedModifierKt;
import androidx.compose.p009ui.Modifier;
import androidx.compose.p009ui.graphics.Color;
import androidx.compose.p009ui.graphics.ColorFilter;
import androidx.compose.p009ui.layout.ContentScale;
import androidx.compose.p009ui.layout.MeasurePolicy;
import androidx.compose.p009ui.node.ComposeUiNode;
import androidx.compose.p009ui.platform.CompositionLocalsKt;
import androidx.compose.p009ui.res.PainterResources_androidKt;
import androidx.compose.p009ui.res.StringResources_androidKt;
import androidx.compose.p009ui.text.font.FontWeight;
import androidx.compose.p009ui.unit.C2452Dp;
import androidx.compose.p009ui.unit.Density;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.zykj.gallery.R$drawable;
import com.zykj.gallery.R$string;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import p070h3.C6461d0;
import p114n3.AbstractC7460a;
import p121o3.AbstractC7519b;

/* renamed from: i3.k */
/* loaded from: classes4.dex */
public abstract class AbstractC6530k {
    /* JADX WARN: Removed duplicated region for block: B:30:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m7278k(final long r27, final java.lang.String r29, int r30, androidx.compose.p009ui.text.font.FontWeight r31, kotlin.jvm.functions.Function0 r32, androidx.compose.runtime.Composer r33, final int r34, final int r35) {
        /*
            Method dump skipped, instructions count: 376
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p077i3.AbstractC6530k.m7278k(long, java.lang.String, int, androidx.compose.ui.text.font.FontWeight, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    /* renamed from: l */
    public static final Unit m7279l() {
        return Unit.INSTANCE;
    }

    /* renamed from: m */
    public static final Unit m7280m(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* renamed from: n */
    public static final Unit m7281n(long j6, String str, int i6, FontWeight fontWeight, Function0 function0, int i7, int i8, Composer composer, int i9) {
        m7278k(j6, str, i6, fontWeight, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i7 | 1), i8);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ed  */
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m7282o(final boolean r17, final p070h3.C6461d0 r18, androidx.compose.p009ui.unit.Density r19, final kotlin.jvm.functions.Function0 r20, androidx.compose.runtime.Composer r21, final int r22, final int r23) {
        /*
            Method dump skipped, instructions count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p077i3.AbstractC6530k.m7282o(boolean, h3.d0, androidx.compose.ui.unit.Density, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    /* renamed from: p */
    public static final Unit m7283p(Density density, final C6461d0 c6461d0, final Function0 function0, Composer composer, int i6) {
        if (composer.shouldExecute((i6 & 3) != 2, i6 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2021860588, i6, -1, "com.zykj.gallery.ui.gallery.dialog.GalleryDialog.<anonymous> (GalleryDialog.kt:56)");
            }
            CompositionLocalKt.CompositionLocalProvider(CompositionLocalsKt.getLocalDensity().provides(density), ComposableLambdaKt.rememberComposableLambda(-1672966188, true, new Function2() { // from class: i3.i
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AbstractC6530k.m7284q(c6461d0, function0, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, composer, 54), composer, ProvidedValue.$stable | 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* renamed from: q */
    public static final Unit m7284q(final C6461d0 c6461d0, final Function0 function0, Composer composer, int i6) {
        if (composer.shouldExecute((i6 & 3) != 2, i6 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1672966188, i6, -1, "com.zykj.gallery.ui.gallery.dialog.GalleryDialog.<anonymous>.<anonymous> (GalleryDialog.kt:57)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            float f6 = 1280;
            DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
            Modifier modifierM10656width3ABfNKs = SizeKt.m10656width3ABfNKs(companion, C2452Dp.m16484constructorimpl((360 / f6) * (RangesKt.coerceAtLeast(displayMetrics.widthPixels, displayMetrics.heightPixels) / Resources.getSystem().getDisplayMetrics().density)));
            DisplayMetrics displayMetrics2 = Resources.getSystem().getDisplayMetrics();
            Modifier modifierM10637height3ABfNKs = SizeKt.m10637height3ABfNKs(modifierM10656width3ABfNKs, C2452Dp.m16484constructorimpl((190 / f6) * (RangesKt.coerceAtLeast(displayMetrics2.widthPixels, displayMetrics2.heightPixels) / Resources.getSystem().getDisplayMetrics().density)));
            DisplayMetrics displayMetrics3 = Resources.getSystem().getDisplayMetrics();
            CardKt.Card(modifierM10637height3ABfNKs, RoundedCornerShapeKt.m10897RoundedCornerShape0680j_4(C2452Dp.m16484constructorimpl((8 / f6) * (RangesKt.coerceAtLeast(displayMetrics3.widthPixels, displayMetrics3.heightPixels) / Resources.getSystem().getDisplayMetrics().density))), CardDefaults.INSTANCE.m11488cardColorsro_MJ88(Color.INSTANCE.m13936getWhite0d7_KjU(), 0L, 0L, 0L, composer, (CardDefaults.$stable << 12) | 6, 14), null, null, ComposableLambdaKt.rememberComposableLambda(1722583750, true, new Function3() { // from class: i3.j
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return AbstractC6530k.m7285r(c6461d0, function0, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, composer, 54), composer, 196614, 24);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* renamed from: r */
    public static final Unit m7285r(C6461d0 c6461d0, final Function0 function0, ColumnScope Card, Composer composer, int i6) {
        Intrinsics.checkNotNullParameter(Card, "$this$Card");
        if (composer.shouldExecute((i6 & 17) != 16, i6 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1722583750, i6, -1, "com.zykj.gallery.ui.gallery.dialog.GalleryDialog.<anonymous>.<anonymous>.<anonymous> (GalleryDialog.kt:64)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
            float f6 = 1280;
            DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
            Modifier modifierM10604padding3ABfNKs = PaddingKt.m10604padding3ABfNKs(modifierFillMaxSize$default, C2452Dp.m16484constructorimpl((14 / f6) * (RangesKt.coerceAtLeast(displayMetrics.widthPixels, displayMetrics.heightPixels) / Resources.getSystem().getDisplayMetrics().density)));
            Alignment.Companion companion2 = Alignment.INSTANCE;
            Alignment.Horizontal centerHorizontally = companion2.getCenterHorizontally();
            Arrangement arrangement = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), centerHorizontally, composer, 48);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer, modifierM10604padding3ABfNKs);
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
            Composer composerM13341constructorimpl = Updater.m13341constructorimpl(composer);
            Updater.m13348setimpl(composerM13341constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m13348setimpl(composerM13341constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (composerM13341constructorimpl.getInserting() || !Intrinsics.areEqual(composerM13341constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM13341constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM13341constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m13348setimpl(composerM13341constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getEnd(), companion2.getTop(), composer, 6);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer, modifierFillMaxWidth$default);
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
            Composer composerM13341constructorimpl2 = Updater.m13341constructorimpl(composer);
            Updater.m13348setimpl(composerM13341constructorimpl2, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m13348setimpl(composerM13341constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
            if (composerM13341constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM13341constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM13341constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM13341constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m13348setimpl(composerM13341constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            float f7 = 18 / f6;
            DisplayMetrics displayMetrics2 = Resources.getSystem().getDisplayMetrics();
            Modifier modifierM10656width3ABfNKs = SizeKt.m10656width3ABfNKs(companion, C2452Dp.m16484constructorimpl((RangesKt.coerceAtLeast(displayMetrics2.widthPixels, displayMetrics2.heightPixels) / Resources.getSystem().getDisplayMetrics().density) * f7));
            DisplayMetrics displayMetrics3 = Resources.getSystem().getDisplayMetrics();
            Modifier modifierM10637height3ABfNKs = SizeKt.m10637height3ABfNKs(modifierM10656width3ABfNKs, C2452Dp.m16484constructorimpl(f7 * (RangesKt.coerceAtLeast(displayMetrics3.widthPixels, displayMetrics3.heightPixels) / Resources.getSystem().getDisplayMetrics().density)));
            boolean zChanged = composer.changed(function0);
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: i3.a
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AbstractC6530k.m7286s(function0);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            ImageKt.Image(PainterResources_androidKt.painterResource(R$drawable.gallery_icon_back_cancel, composer, 0), "关闭dialog", ClickableKt.m10147clickableXHw0xAI$default(modifierM10637height3ABfNKs, false, null, null, (Function0) objRememberedValue, 7, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer, 48, 120);
            composer.endNode();
            m7278k(AbstractC7460a.m8505b(), c6461d0.m7111c(), 18, FontWeight.INSTANCE.getMedium(), null, composer, 3462, 16);
            DisplayMetrics displayMetrics4 = Resources.getSystem().getDisplayMetrics();
            SpacerKt.Spacer(SizeKt.m10637height3ABfNKs(companion, C2452Dp.m16484constructorimpl((25 / f6) * (RangesKt.coerceAtLeast(displayMetrics4.widthPixels, displayMetrics4.heightPixels) / Resources.getSystem().getDisplayMetrics().density))), composer, 6);
            Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            float f8 = 40 / f6;
            DisplayMetrics displayMetrics5 = Resources.getSystem().getDisplayMetrics();
            Modifier modifierM10606paddingVpY3zN4$default = PaddingKt.m10606paddingVpY3zN4$default(modifierFillMaxWidth$default2, C2452Dp.m16484constructorimpl((RangesKt.coerceAtLeast(displayMetrics5.widthPixels, displayMetrics5.heightPixels) / Resources.getSystem().getDisplayMetrics().density) * f8), 0.0f, 2, null);
            MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement.getStart(), companion2.getTop(), composer, 6);
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer, modifierM10606paddingVpY3zN4$default);
            Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
            if (composer.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor3);
            } else {
                composer.useNode();
            }
            Composer composerM13341constructorimpl3 = Updater.m13341constructorimpl(composer);
            Updater.m13348setimpl(composerM13341constructorimpl3, measurePolicyRowMeasurePolicy2, companion3.getSetMeasurePolicy());
            Updater.m13348setimpl(composerM13341constructorimpl3, currentCompositionLocalMap3, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion3.getSetCompositeKeyHash();
            if (composerM13341constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM13341constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                composerM13341constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                composerM13341constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
            }
            Updater.m13348setimpl(composerM13341constructorimpl3, modifierMaterializeModifier3, companion3.getSetModifier());
            m7278k(AbstractC7460a.m8506c(), StringResources_androidKt.stringResource(R$string.date_time, composer, 0), 0, null, null, composer, 6, 28);
            m7278k(AbstractC7460a.m8505b(), AbstractC7519b.m8676c(c6461d0.m7109a()), 0, null, null, composer, 6, 28);
            composer.endNode();
            DisplayMetrics displayMetrics6 = Resources.getSystem().getDisplayMetrics();
            SpacerKt.Spacer(SizeKt.m10637height3ABfNKs(companion, C2452Dp.m16484constructorimpl((7 / f6) * (RangesKt.coerceAtLeast(displayMetrics6.widthPixels, displayMetrics6.heightPixels) / Resources.getSystem().getDisplayMetrics().density))), composer, 6);
            Modifier modifierFillMaxWidth$default3 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            DisplayMetrics displayMetrics7 = Resources.getSystem().getDisplayMetrics();
            Modifier modifierM10606paddingVpY3zN4$default2 = PaddingKt.m10606paddingVpY3zN4$default(modifierFillMaxWidth$default3, C2452Dp.m16484constructorimpl(f8 * (RangesKt.coerceAtLeast(displayMetrics7.widthPixels, displayMetrics7.heightPixels) / Resources.getSystem().getDisplayMetrics().density)), 0.0f, 2, null);
            MeasurePolicy measurePolicyRowMeasurePolicy3 = RowKt.rowMeasurePolicy(arrangement.getStart(), companion2.getTop(), composer, 6);
            int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap4 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier(composer, modifierM10606paddingVpY3zN4$default2);
            Function0<ComposeUiNode> constructor4 = companion3.getConstructor();
            if (composer.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor4);
            } else {
                composer.useNode();
            }
            Composer composerM13341constructorimpl4 = Updater.m13341constructorimpl(composer);
            Updater.m13348setimpl(composerM13341constructorimpl4, measurePolicyRowMeasurePolicy3, companion3.getSetMeasurePolicy());
            Updater.m13348setimpl(composerM13341constructorimpl4, currentCompositionLocalMap4, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = companion3.getSetCompositeKeyHash();
            if (composerM13341constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM13341constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                composerM13341constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                composerM13341constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
            }
            Updater.m13348setimpl(composerM13341constructorimpl4, modifierMaterializeModifier4, companion3.getSetModifier());
            long jM8506c = AbstractC7460a.m8506c();
            String strStringResource = StringResources_androidKt.stringResource(R$string.img_size, composer, 0);
            Object objRememberedValue2 = composer.rememberedValue();
            Composer.Companion companion4 = Composer.INSTANCE;
            if (objRememberedValue2 == companion4.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: i3.b
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AbstractC6530k.m7287t();
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            m7278k(jM8506c, strStringResource, 0, null, (Function0) objRememberedValue2, composer, 24582, 12);
            long jM8505b = AbstractC7460a.m8505b();
            String strM7112d = c6461d0.m7112d();
            Object objRememberedValue3 = composer.rememberedValue();
            if (objRememberedValue3 == companion4.getEmpty()) {
                objRememberedValue3 = new Function0() { // from class: i3.c
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AbstractC6530k.m7288u();
                    }
                };
                composer.updateRememberedValue(objRememberedValue3);
            }
            m7278k(jM8505b, strM7112d, 0, null, (Function0) objRememberedValue3, composer, 24582, 12);
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

    /* renamed from: s */
    public static final Unit m7286s(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* renamed from: t */
    public static final Unit m7287t() {
        return Unit.INSTANCE;
    }

    /* renamed from: u */
    public static final Unit m7288u() {
        return Unit.INSTANCE;
    }

    /* renamed from: v */
    public static final Unit m7289v(boolean z6, C6461d0 c6461d0, Density density, Function0 function0, int i6, int i7, Composer composer, int i8) {
        m7282o(z6, c6461d0, density, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i6 | 1), i7);
        return Unit.INSTANCE;
    }
}
