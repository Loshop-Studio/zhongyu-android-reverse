package androidx.compose.material3;

import androidx.compose.foundation.interaction.FocusInteractionKt;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.text.selection.TextSelectionColors;
import androidx.compose.foundation.text.selection.TextSelectionColorsKt;
import androidx.compose.material3.internal.TextFieldImplKt;
import androidx.compose.material3.tokens.FilledTextFieldTokens;
import androidx.compose.p013ui.ComposedModifierKt;
import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.graphics.Color;
import androidx.compose.p013ui.graphics.Shape;
import androidx.compose.p013ui.platform.InspectableValueKt;
import androidx.compose.p013ui.platform.InspectorInfo;
import androidx.compose.p013ui.unit.C3156Dp;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Immutable;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import com.tencent.smtt.sdk.TbsListener;
import p123h7.C8736p;
import p123h7.InterfaceC8721a;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10575q;

@Immutable
/* loaded from: classes2.dex */
public final class TextFieldDefaults {
    public static final int $stable = 0;
    private static final float FocusedBorderThickness;
    private static final float FocusedIndicatorThickness;
    public static final TextFieldDefaults INSTANCE = new TextFieldDefaults();
    private static final float MinHeight = C3156Dp.m26899constructorimpl(56);
    private static final float MinWidth = C3156Dp.m26899constructorimpl(280);
    private static final float UnfocusedBorderThickness;
    private static final float UnfocusedIndicatorThickness;

    static {
        float fM26899constructorimpl = C3156Dp.m26899constructorimpl(1);
        UnfocusedIndicatorThickness = fM26899constructorimpl;
        float fM26899constructorimpl2 = C3156Dp.m26899constructorimpl(2);
        FocusedIndicatorThickness = fM26899constructorimpl2;
        UnfocusedBorderThickness = fM26899constructorimpl;
        FocusedBorderThickness = fM26899constructorimpl2;
    }

    private TextFieldDefaults() {
    }

    /* renamed from: contentPaddingWithLabel-a9UjIt4$default, reason: not valid java name */
    public static /* synthetic */ PaddingValues m22670contentPaddingWithLabela9UjIt4$default(TextFieldDefaults textFieldDefaults, float f10, float f11, float f12, float f13, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i10 & 2) != 0) {
            f11 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i10 & 4) != 0) {
            f12 = TextFieldKt.getTextFieldWithLabelVerticalPadding();
        }
        if ((i10 & 8) != 0) {
            f13 = TextFieldKt.getTextFieldWithLabelVerticalPadding();
        }
        return textFieldDefaults.m22681contentPaddingWithLabela9UjIt4(f10, f11, f12, f13);
    }

    /* renamed from: contentPaddingWithoutLabel-a9UjIt4$default, reason: not valid java name */
    public static /* synthetic */ PaddingValues m22671contentPaddingWithoutLabela9UjIt4$default(TextFieldDefaults textFieldDefaults, float f10, float f11, float f12, float f13, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i10 & 2) != 0) {
            f11 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i10 & 4) != 0) {
            f12 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i10 & 8) != 0) {
            f13 = TextFieldImplKt.getTextFieldPadding();
        }
        return textFieldDefaults.m22682contentPaddingWithoutLabela9UjIt4(f10, f11, f12, f13);
    }

    @InterfaceC8721a
    public static /* synthetic */ void getFilledShape$annotations() {
    }

    @InterfaceC8721a
    /* renamed from: getFocusedBorderThickness-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m22672getFocusedBorderThicknessD9Ej5fM$annotations() {
    }

    @InterfaceC8721a
    public static /* synthetic */ void getOutlinedShape$annotations() {
    }

    @InterfaceC8721a
    /* renamed from: getUnfocusedBorderThickness-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m22673getUnfocusedBorderThicknessD9Ej5fM$annotations() {
    }

    /* renamed from: indicatorLine-gv0btCI$default, reason: not valid java name */
    public static /* synthetic */ Modifier m22674indicatorLinegv0btCI$default(TextFieldDefaults textFieldDefaults, Modifier modifier, boolean z10, boolean z11, InteractionSource interactionSource, TextFieldColors textFieldColors, float f10, float f11, int i10, Object obj) {
        if ((i10 & 16) != 0) {
            f10 = FocusedIndicatorThickness;
        }
        return textFieldDefaults.m22689indicatorLinegv0btCI(modifier, z10, z11, interactionSource, textFieldColors, f10, (i10 & 32) != 0 ? UnfocusedIndicatorThickness : f11);
    }

    /* renamed from: outlinedTextFieldPadding-a9UjIt4$default, reason: not valid java name */
    public static /* synthetic */ PaddingValues m22675outlinedTextFieldPaddinga9UjIt4$default(TextFieldDefaults textFieldDefaults, float f10, float f11, float f12, float f13, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i10 & 2) != 0) {
            f11 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i10 & 4) != 0) {
            f12 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i10 & 8) != 0) {
            f13 = TextFieldImplKt.getTextFieldPadding();
        }
        return textFieldDefaults.m22690outlinedTextFieldPaddinga9UjIt4(f10, f11, f12, f13);
    }

    /* renamed from: supportingTextPadding-a9UjIt4$material3_release$default, reason: not valid java name */
    public static /* synthetic */ PaddingValues m22676supportingTextPaddinga9UjIt4$material3_release$default(TextFieldDefaults textFieldDefaults, float f10, float f11, float f12, float f13, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i10 & 2) != 0) {
            f11 = TextFieldImplKt.getSupportingTopPadding();
        }
        if ((i10 & 4) != 0) {
            f12 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i10 & 8) != 0) {
            f13 = C3156Dp.m26899constructorimpl(0);
        }
        return textFieldDefaults.m22691supportingTextPaddinga9UjIt4$material3_release(f10, f11, f12, f13);
    }

    /* renamed from: textFieldWithLabelPadding-a9UjIt4$default, reason: not valid java name */
    public static /* synthetic */ PaddingValues m22677textFieldWithLabelPaddinga9UjIt4$default(TextFieldDefaults textFieldDefaults, float f10, float f11, float f12, float f13, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i10 & 2) != 0) {
            f11 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i10 & 4) != 0) {
            f12 = TextFieldKt.getTextFieldWithLabelVerticalPadding();
        }
        if ((i10 & 8) != 0) {
            f13 = TextFieldKt.getTextFieldWithLabelVerticalPadding();
        }
        return textFieldDefaults.m22692textFieldWithLabelPaddinga9UjIt4(f10, f11, f12, f13);
    }

    /* renamed from: textFieldWithoutLabelPadding-a9UjIt4$default, reason: not valid java name */
    public static /* synthetic */ PaddingValues m22678textFieldWithoutLabelPaddinga9UjIt4$default(TextFieldDefaults textFieldDefaults, float f10, float f11, float f12, float f13, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i10 & 2) != 0) {
            f11 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i10 & 4) != 0) {
            f12 = TextFieldImplKt.getTextFieldPadding();
        }
        if ((i10 & 8) != 0) {
            f13 = TextFieldImplKt.getTextFieldPadding();
        }
        return textFieldDefaults.m22693textFieldWithoutLabelPaddinga9UjIt4(f10, f11, f12, f13);
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:149:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00ed  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    @androidx.compose.material3.ExperimentalMaterial3Api
    /* renamed from: Container-4EFweAY, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m22679Container4EFweAY(final boolean r22, final boolean r23, final androidx.compose.foundation.interaction.InteractionSource r24, androidx.compose.p013ui.Modifier r25, androidx.compose.material3.TextFieldColors r26, androidx.compose.p013ui.graphics.Shape r27, float r28, float r29, androidx.compose.runtime.Composer r30, final int r31, final int r32) {
        /*
            Method dump skipped, instructions count: 535
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TextFieldDefaults.m22679Container4EFweAY(boolean, boolean, androidx.compose.foundation.interaction.InteractionSource, androidx.compose.ui.Modifier, androidx.compose.material3.TextFieldColors, androidx.compose.ui.graphics.Shape, float, float, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:84:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x012a  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.material3.ExperimentalMaterial3Api
    @androidx.compose.runtime.Composable
    @p123h7.InterfaceC8721a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void ContainerBox(final boolean r21, final boolean r22, final androidx.compose.foundation.interaction.InteractionSource r23, final androidx.compose.material3.TextFieldColors r24, androidx.compose.p013ui.graphics.Shape r25, androidx.compose.runtime.Composer r26, final int r27, final int r28) {
        /*
            Method dump skipped, instructions count: 329
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TextFieldDefaults.ContainerBox(boolean, boolean, androidx.compose.foundation.interaction.InteractionSource, androidx.compose.material3.TextFieldColors, androidx.compose.ui.graphics.Shape, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0387  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x038b  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x03dd  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x045e  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0471  */
    /* JADX WARN: Removed duplicated region for block: B:279:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0125  */
    @androidx.compose.runtime.Composable
    @androidx.compose.material3.ExperimentalMaterial3Api
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void DecorationBox(final java.lang.String r36, final p300x7.InterfaceC10574p r37, final boolean r38, final boolean r39, final androidx.compose.p013ui.text.input.VisualTransformation r40, final androidx.compose.foundation.interaction.InteractionSource r41, boolean r42, p300x7.InterfaceC10574p r43, p300x7.InterfaceC10574p r44, p300x7.InterfaceC10574p r45, p300x7.InterfaceC10574p r46, p300x7.InterfaceC10574p r47, p300x7.InterfaceC10574p r48, p300x7.InterfaceC10574p r49, androidx.compose.p013ui.graphics.Shape r50, androidx.compose.material3.TextFieldColors r51, androidx.compose.foundation.layout.PaddingValues r52, p300x7.InterfaceC10574p r53, androidx.compose.runtime.Composer r54, final int r55, final int r56, final int r57) {
        /*
            Method dump skipped, instructions count: 1171
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TextFieldDefaults.DecorationBox(java.lang.String, x7.p, boolean, boolean, androidx.compose.ui.text.input.VisualTransformation, androidx.compose.foundation.interaction.InteractionSource, boolean, x7.p, x7.p, x7.p, x7.p, x7.p, x7.p, x7.p, androidx.compose.ui.graphics.Shape, androidx.compose.material3.TextFieldColors, androidx.compose.foundation.layout.PaddingValues, x7.p, androidx.compose.runtime.Composer, int, int, int):void");
    }

    @Composable
    public final TextFieldColors colors(Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(831731228, i10, -1, "androidx.compose.material3.TextFieldDefaults.colors (TextFieldDefaults.kt:336)");
        }
        TextFieldColors defaultTextFieldColors = getDefaultTextFieldColors(MaterialTheme.INSTANCE.getColorScheme(composer, 6), composer, (i10 << 3) & TbsListener.ErrorCode.DOWNLOAD_OVER_FLOW);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultTextFieldColors;
    }

    @Composable
    /* renamed from: colors-0hiis_0, reason: not valid java name */
    public final TextFieldColors m22680colors0hiis_0(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, TextSelectionColors textSelectionColors, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42, long j43, long j44, long j45, long j46, long j47, long j48, long j49, long j50, long j51, Composer composer, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        long j52;
        TextSelectionColors textSelectionColors2;
        long jM24312getUnspecified0d7_KjU = (i15 & 1) != 0 ? Color.Companion.m24312getUnspecified0d7_KjU() : j10;
        long jM24312getUnspecified0d7_KjU2 = (i15 & 2) != 0 ? Color.Companion.m24312getUnspecified0d7_KjU() : j11;
        long jM24312getUnspecified0d7_KjU3 = (i15 & 4) != 0 ? Color.Companion.m24312getUnspecified0d7_KjU() : j12;
        long jM24312getUnspecified0d7_KjU4 = (i15 & 8) != 0 ? Color.Companion.m24312getUnspecified0d7_KjU() : j13;
        long jM24312getUnspecified0d7_KjU5 = (i15 & 16) != 0 ? Color.Companion.m24312getUnspecified0d7_KjU() : j14;
        long jM24312getUnspecified0d7_KjU6 = (i15 & 32) != 0 ? Color.Companion.m24312getUnspecified0d7_KjU() : j15;
        long jM24312getUnspecified0d7_KjU7 = (i15 & 64) != 0 ? Color.Companion.m24312getUnspecified0d7_KjU() : j16;
        long j53 = jM24312getUnspecified0d7_KjU;
        long jM24312getUnspecified0d7_KjU8 = (i15 & 128) != 0 ? Color.Companion.m24312getUnspecified0d7_KjU() : j17;
        long jM24312getUnspecified0d7_KjU9 = (i15 & 256) != 0 ? Color.Companion.m24312getUnspecified0d7_KjU() : j18;
        long jM24312getUnspecified0d7_KjU10 = (i15 & 512) != 0 ? Color.Companion.m24312getUnspecified0d7_KjU() : j19;
        TextSelectionColors textSelectionColors3 = (i15 & 1024) != 0 ? null : textSelectionColors;
        long jM24312getUnspecified0d7_KjU11 = (i15 & 2048) != 0 ? Color.Companion.m24312getUnspecified0d7_KjU() : j20;
        long jM24312getUnspecified0d7_KjU12 = (i15 & 4096) != 0 ? Color.Companion.m24312getUnspecified0d7_KjU() : j21;
        long jM24312getUnspecified0d7_KjU13 = (i15 & 8192) != 0 ? Color.Companion.m24312getUnspecified0d7_KjU() : j22;
        long jM24312getUnspecified0d7_KjU14 = (i15 & 16384) != 0 ? Color.Companion.m24312getUnspecified0d7_KjU() : j23;
        long jM24312getUnspecified0d7_KjU15 = (32768 & i15) != 0 ? Color.Companion.m24312getUnspecified0d7_KjU() : j24;
        long jM24312getUnspecified0d7_KjU16 = (65536 & i15) != 0 ? Color.Companion.m24312getUnspecified0d7_KjU() : j25;
        long jM24312getUnspecified0d7_KjU17 = (131072 & i15) != 0 ? Color.Companion.m24312getUnspecified0d7_KjU() : j26;
        long jM24312getUnspecified0d7_KjU18 = (262144 & i15) != 0 ? Color.Companion.m24312getUnspecified0d7_KjU() : j27;
        long jM24312getUnspecified0d7_KjU19 = (524288 & i15) != 0 ? Color.Companion.m24312getUnspecified0d7_KjU() : j28;
        long jM24312getUnspecified0d7_KjU20 = (1048576 & i15) != 0 ? Color.Companion.m24312getUnspecified0d7_KjU() : j29;
        long jM24312getUnspecified0d7_KjU21 = (2097152 & i15) != 0 ? Color.Companion.m24312getUnspecified0d7_KjU() : j30;
        long jM24312getUnspecified0d7_KjU22 = (4194304 & i15) != 0 ? Color.Companion.m24312getUnspecified0d7_KjU() : j31;
        long jM24312getUnspecified0d7_KjU23 = (8388608 & i15) != 0 ? Color.Companion.m24312getUnspecified0d7_KjU() : j32;
        long jM24312getUnspecified0d7_KjU24 = (16777216 & i15) != 0 ? Color.Companion.m24312getUnspecified0d7_KjU() : j33;
        long jM24312getUnspecified0d7_KjU25 = (33554432 & i15) != 0 ? Color.Companion.m24312getUnspecified0d7_KjU() : j34;
        long jM24312getUnspecified0d7_KjU26 = (67108864 & i15) != 0 ? Color.Companion.m24312getUnspecified0d7_KjU() : j35;
        long jM24312getUnspecified0d7_KjU27 = (134217728 & i15) != 0 ? Color.Companion.m24312getUnspecified0d7_KjU() : j36;
        long jM24312getUnspecified0d7_KjU28 = (268435456 & i15) != 0 ? Color.Companion.m24312getUnspecified0d7_KjU() : j37;
        long jM24312getUnspecified0d7_KjU29 = (536870912 & i15) != 0 ? Color.Companion.m24312getUnspecified0d7_KjU() : j38;
        long jM24312getUnspecified0d7_KjU30 = (i15 & BasicMeasure.EXACTLY) != 0 ? Color.Companion.m24312getUnspecified0d7_KjU() : j39;
        long jM24312getUnspecified0d7_KjU31 = (i16 & 1) != 0 ? Color.Companion.m24312getUnspecified0d7_KjU() : j40;
        long jM24312getUnspecified0d7_KjU32 = (i16 & 2) != 0 ? Color.Companion.m24312getUnspecified0d7_KjU() : j41;
        long jM24312getUnspecified0d7_KjU33 = (i16 & 4) != 0 ? Color.Companion.m24312getUnspecified0d7_KjU() : j42;
        long jM24312getUnspecified0d7_KjU34 = (i16 & 8) != 0 ? Color.Companion.m24312getUnspecified0d7_KjU() : j43;
        long jM24312getUnspecified0d7_KjU35 = (i16 & 16) != 0 ? Color.Companion.m24312getUnspecified0d7_KjU() : j44;
        long jM24312getUnspecified0d7_KjU36 = (i16 & 32) != 0 ? Color.Companion.m24312getUnspecified0d7_KjU() : j45;
        long jM24312getUnspecified0d7_KjU37 = (i16 & 64) != 0 ? Color.Companion.m24312getUnspecified0d7_KjU() : j46;
        long jM24312getUnspecified0d7_KjU38 = (i16 & 128) != 0 ? Color.Companion.m24312getUnspecified0d7_KjU() : j47;
        long jM24312getUnspecified0d7_KjU39 = (i16 & 256) != 0 ? Color.Companion.m24312getUnspecified0d7_KjU() : j48;
        long jM24312getUnspecified0d7_KjU40 = (i16 & 512) != 0 ? Color.Companion.m24312getUnspecified0d7_KjU() : j49;
        long jM24312getUnspecified0d7_KjU41 = (i16 & 1024) != 0 ? Color.Companion.m24312getUnspecified0d7_KjU() : j50;
        long jM24312getUnspecified0d7_KjU42 = (i16 & 2048) != 0 ? Color.Companion.m24312getUnspecified0d7_KjU() : j51;
        if (ComposerKt.isTraceInProgress()) {
            j52 = jM24312getUnspecified0d7_KjU42;
            textSelectionColors2 = textSelectionColors3;
            ComposerKt.traceEventStart(1513344955, i10, i11, "androidx.compose.material3.TextFieldDefaults.colors (TextFieldDefaults.kt:438)");
        } else {
            j52 = jM24312getUnspecified0d7_KjU42;
            textSelectionColors2 = textSelectionColors3;
        }
        TextFieldColors textFieldColorsM22617copyejIjP34 = getDefaultTextFieldColors(MaterialTheme.INSTANCE.getColorScheme(composer, 6), composer, (i14 >> 6) & TbsListener.ErrorCode.DOWNLOAD_OVER_FLOW).m22617copyejIjP34(j53, jM24312getUnspecified0d7_KjU2, jM24312getUnspecified0d7_KjU3, jM24312getUnspecified0d7_KjU4, jM24312getUnspecified0d7_KjU5, jM24312getUnspecified0d7_KjU6, jM24312getUnspecified0d7_KjU7, jM24312getUnspecified0d7_KjU8, jM24312getUnspecified0d7_KjU9, jM24312getUnspecified0d7_KjU10, textSelectionColors2, jM24312getUnspecified0d7_KjU11, jM24312getUnspecified0d7_KjU12, jM24312getUnspecified0d7_KjU13, jM24312getUnspecified0d7_KjU14, jM24312getUnspecified0d7_KjU15, jM24312getUnspecified0d7_KjU16, jM24312getUnspecified0d7_KjU17, jM24312getUnspecified0d7_KjU18, jM24312getUnspecified0d7_KjU19, jM24312getUnspecified0d7_KjU20, jM24312getUnspecified0d7_KjU21, jM24312getUnspecified0d7_KjU22, jM24312getUnspecified0d7_KjU23, jM24312getUnspecified0d7_KjU24, jM24312getUnspecified0d7_KjU25, jM24312getUnspecified0d7_KjU26, jM24312getUnspecified0d7_KjU27, jM24312getUnspecified0d7_KjU28, jM24312getUnspecified0d7_KjU29, jM24312getUnspecified0d7_KjU30, jM24312getUnspecified0d7_KjU31, jM24312getUnspecified0d7_KjU32, jM24312getUnspecified0d7_KjU33, jM24312getUnspecified0d7_KjU34, jM24312getUnspecified0d7_KjU35, jM24312getUnspecified0d7_KjU36, jM24312getUnspecified0d7_KjU37, jM24312getUnspecified0d7_KjU38, jM24312getUnspecified0d7_KjU39, jM24312getUnspecified0d7_KjU40, jM24312getUnspecified0d7_KjU41, j52);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return textFieldColorsM22617copyejIjP34;
    }

    /* renamed from: contentPaddingWithLabel-a9UjIt4, reason: not valid java name */
    public final PaddingValues m22681contentPaddingWithLabela9UjIt4(float f10, float f11, float f12, float f13) {
        return PaddingKt.m20852PaddingValuesa9UjIt4(f10, f12, f11, f13);
    }

    /* renamed from: contentPaddingWithoutLabel-a9UjIt4, reason: not valid java name */
    public final PaddingValues m22682contentPaddingWithoutLabela9UjIt4(float f10, float f11, float f12, float f13) {
        return PaddingKt.m20852PaddingValuesa9UjIt4(f10, f11, f12, f13);
    }

    @Composable
    public final TextFieldColors getDefaultTextFieldColors(ColorScheme colorScheme, Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1341970309, i10, -1, "androidx.compose.material3.TextFieldDefaults.<get-defaultTextFieldColors> (TextFieldDefaults.kt:486)");
        }
        TextFieldColors defaultTextFieldColorsCached$material3_release = colorScheme.getDefaultTextFieldColorsCached$material3_release();
        composer.startReplaceGroup(27085453);
        if (defaultTextFieldColorsCached$material3_release == null) {
            FilledTextFieldTokens filledTextFieldTokens = FilledTextFieldTokens.INSTANCE;
            TextFieldColors textFieldColors = new TextFieldColors(ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getFocusInputColor()), ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getInputColor()), Color.m24275copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getDisabledInputColor()), filledTextFieldTokens.getDisabledInputOpacity(), 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getErrorInputColor()), ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getContainerColor()), ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getContainerColor()), ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getContainerColor()), ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getContainerColor()), ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getCaretColor()), ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getErrorFocusCaretColor()), (TextSelectionColors) composer.consume(TextSelectionColorsKt.getLocalTextSelectionColors()), ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getFocusActiveIndicatorColor()), ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getActiveIndicatorColor()), Color.m24275copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getDisabledActiveIndicatorColor()), filledTextFieldTokens.getDisabledActiveIndicatorOpacity(), 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getErrorActiveIndicatorColor()), ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getFocusLeadingIconColor()), ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getLeadingIconColor()), Color.m24275copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getDisabledLeadingIconColor()), filledTextFieldTokens.getDisabledLeadingIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getErrorLeadingIconColor()), ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getFocusTrailingIconColor()), ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getTrailingIconColor()), Color.m24275copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getDisabledTrailingIconColor()), filledTextFieldTokens.getDisabledTrailingIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getErrorTrailingIconColor()), ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getFocusLabelColor()), ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getLabelColor()), Color.m24275copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getDisabledLabelColor()), filledTextFieldTokens.getDisabledLabelOpacity(), 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getErrorLabelColor()), ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getInputPlaceholderColor()), ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getInputPlaceholderColor()), Color.m24275copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getDisabledInputColor()), filledTextFieldTokens.getDisabledInputOpacity(), 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getInputPlaceholderColor()), ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getFocusSupportingColor()), ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getSupportingColor()), Color.m24275copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getDisabledSupportingColor()), filledTextFieldTokens.getDisabledSupportingOpacity(), 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getErrorSupportingColor()), ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getInputPrefixColor()), ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getInputPrefixColor()), Color.m24275copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getInputPrefixColor()), filledTextFieldTokens.getDisabledInputOpacity(), 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getInputPrefixColor()), ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getInputSuffixColor()), ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getInputSuffixColor()), Color.m24275copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getInputSuffixColor()), filledTextFieldTokens.getDisabledInputOpacity(), 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, filledTextFieldTokens.getInputSuffixColor()), null);
            colorScheme.setDefaultTextFieldColorsCached$material3_release(textFieldColors);
            defaultTextFieldColorsCached$material3_release = textFieldColors;
        }
        composer.endReplaceGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultTextFieldColorsCached$material3_release;
    }

    @Composable
    public final Shape getFilledShape(Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(611926497, i10, -1, "androidx.compose.material3.TextFieldDefaults.<get-filledShape> (TextFieldDefaults.kt:621)");
        }
        Shape shape = getShape(composer, i10 & 14);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return shape;
    }

    /* renamed from: getFocusedBorderThickness-D9Ej5fM, reason: not valid java name */
    public final float m22683getFocusedBorderThicknessD9Ej5fM() {
        return FocusedBorderThickness;
    }

    /* renamed from: getFocusedIndicatorThickness-D9Ej5fM, reason: not valid java name */
    public final float m22684getFocusedIndicatorThicknessD9Ej5fM() {
        return FocusedIndicatorThickness;
    }

    /* renamed from: getMinHeight-D9Ej5fM, reason: not valid java name */
    public final float m22685getMinHeightD9Ej5fM() {
        return MinHeight;
    }

    /* renamed from: getMinWidth-D9Ej5fM, reason: not valid java name */
    public final float m22686getMinWidthD9Ej5fM() {
        return MinWidth;
    }

    @Composable
    public final Shape getOutlinedShape(Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-584749279, i10, -1, "androidx.compose.material3.TextFieldDefaults.<get-outlinedShape> (TextFieldDefaults.kt:613)");
        }
        Shape shape = OutlinedTextFieldDefaults.INSTANCE.getShape(composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return shape;
    }

    @Composable
    public final Shape getShape(Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1941327459, i10, -1, "androidx.compose.material3.TextFieldDefaults.<get-shape> (TextFieldDefaults.kt:60)");
        }
        Shape value = ShapesKt.getValue(FilledTextFieldTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }

    /* renamed from: getUnfocusedBorderThickness-D9Ej5fM, reason: not valid java name */
    public final float m22687getUnfocusedBorderThicknessD9Ej5fM() {
        return UnfocusedBorderThickness;
    }

    /* renamed from: getUnfocusedIndicatorThickness-D9Ej5fM, reason: not valid java name */
    public final float m22688getUnfocusedIndicatorThicknessD9Ej5fM() {
        return UnfocusedIndicatorThickness;
    }

    @ExperimentalMaterial3Api
    /* renamed from: indicatorLine-gv0btCI, reason: not valid java name */
    public final Modifier m22689indicatorLinegv0btCI(Modifier modifier, final boolean z10, final boolean z11, final InteractionSource interactionSource, final TextFieldColors textFieldColors, final float f10, final float f11) {
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new InterfaceC10570l() { // from class: androidx.compose.material3.TextFieldDefaults$indicatorLine-gv0btCI$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p300x7.InterfaceC10570l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InspectorInfo) obj);
                return C8736p.f16368a;
            }

            public final void invoke(InspectorInfo inspectorInfo) {
                inspectorInfo.setName("indicatorLine");
                inspectorInfo.getProperties().set("enabled", Boolean.valueOf(z10));
                inspectorInfo.getProperties().set("isError", Boolean.valueOf(z11));
                inspectorInfo.getProperties().set("interactionSource", interactionSource);
                inspectorInfo.getProperties().set("colors", textFieldColors);
                inspectorInfo.getProperties().set("focusedIndicatorLineThickness", C3156Dp.m26897boximpl(f10));
                inspectorInfo.getProperties().set("unfocusedIndicatorLineThickness", C3156Dp.m26897boximpl(f11));
            }
        } : InspectableValueKt.getNoInspectorInfo(), new InterfaceC10575q() { // from class: androidx.compose.material3.TextFieldDefaults$indicatorLine$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // p300x7.InterfaceC10575q
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return invoke((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
            }

            @Composable
            public final Modifier invoke(Modifier modifier2, Composer composer, int i10) {
                composer.startReplaceGroup(-891038934);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-891038934, i10, -1, "androidx.compose.material3.TextFieldDefaults.indicatorLine.<anonymous> (TextFieldDefaults.kt:169)");
                }
                Modifier modifierDrawIndicatorLine = TextFieldKt.drawIndicatorLine(Modifier.Companion, TextFieldImplKt.m22994animateBorderStrokeAsStateNuRrP5Q(z10, z11, FocusInteractionKt.collectIsFocusedAsState(interactionSource, composer, 0).getValue().booleanValue(), textFieldColors, f10, f11, composer, 0));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                return modifierDrawIndicatorLine;
            }
        });
    }

    @InterfaceC8721a
    /* renamed from: outlinedTextFieldPadding-a9UjIt4, reason: not valid java name */
    public final PaddingValues m22690outlinedTextFieldPaddinga9UjIt4(float f10, float f11, float f12, float f13) {
        return OutlinedTextFieldDefaults.INSTANCE.m22344contentPaddinga9UjIt4(f10, f11, f12, f13);
    }

    /* renamed from: supportingTextPadding-a9UjIt4$material3_release, reason: not valid java name */
    public final PaddingValues m22691supportingTextPaddinga9UjIt4$material3_release(float f10, float f11, float f12, float f13) {
        return PaddingKt.m20852PaddingValuesa9UjIt4(f10, f11, f12, f13);
    }

    @InterfaceC8721a
    /* renamed from: textFieldWithLabelPadding-a9UjIt4, reason: not valid java name */
    public final PaddingValues m22692textFieldWithLabelPaddinga9UjIt4(float f10, float f11, float f12, float f13) {
        return m22681contentPaddingWithLabela9UjIt4(f10, f11, f12, f13);
    }

    @InterfaceC8721a
    /* renamed from: textFieldWithoutLabelPadding-a9UjIt4, reason: not valid java name */
    public final PaddingValues m22693textFieldWithoutLabelPaddinga9UjIt4(float f10, float f11, float f12, float f13) {
        return m22682contentPaddingWithoutLabela9UjIt4(f10, f11, f12, f13);
    }
}
