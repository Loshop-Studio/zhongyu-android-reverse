package androidx.compose.material3;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.text.selection.TextSelectionColors;
import androidx.compose.foundation.text.selection.TextSelectionColorsKt;
import androidx.compose.material3.internal.TextFieldImplKt;
import androidx.compose.material3.tokens.OutlinedTextFieldTokens;
import androidx.compose.p014ui.graphics.Color;
import androidx.compose.p014ui.graphics.Shape;
import androidx.compose.p014ui.unit.C3186Dp;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Immutable;

@Immutable
/* loaded from: classes2.dex */
public final class OutlinedTextFieldDefaults {
    public static final int $stable = 0;
    public static final OutlinedTextFieldDefaults INSTANCE = new OutlinedTextFieldDefaults();
    private static final float MinHeight = C3186Dp.m33501constructorimpl(56);
    private static final float MinWidth = C3186Dp.m33501constructorimpl(280);
    private static final float UnfocusedBorderThickness = C3186Dp.m33501constructorimpl(1);
    private static final float FocusedBorderThickness = C3186Dp.m33501constructorimpl(2);

    private OutlinedTextFieldDefaults() {
    }

    /* renamed from: contentPadding-a9UjIt4$default, reason: not valid java name */
    public static /* synthetic */ PaddingValues m28942contentPaddinga9UjIt4$default(OutlinedTextFieldDefaults outlinedTextFieldDefaults, float f10, float f11, float f12, float f13, int i10, Object obj) {
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
        return outlinedTextFieldDefaults.m28946contentPaddinga9UjIt4(f10, f11, f12, f13);
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:153:? A[RETURN, SYNTHETIC] */
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
    public final void m28943Container4EFweAY(final boolean r21, final boolean r22, final androidx.compose.foundation.interaction.InteractionSource r23, androidx.compose.p014ui.Modifier r24, androidx.compose.material3.TextFieldColors r25, androidx.compose.p014ui.graphics.Shape r26, float r27, float r28, androidx.compose.runtime.Composer r29, final int r30, final int r31) {
        /*
            Method dump skipped, instructions count: 560
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.OutlinedTextFieldDefaults.m28943Container4EFweAY(boolean, boolean, androidx.compose.foundation.interaction.InteractionSource, androidx.compose.ui.Modifier, androidx.compose.material3.TextFieldColors, androidx.compose.ui.graphics.Shape, float, float, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:134:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0102  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.material3.ExperimentalMaterial3Api
    @androidx.compose.runtime.Composable
    @p309qc.InterfaceC10770a
    /* renamed from: ContainerBox-nbWgWpA, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m28944ContainerBoxnbWgWpA(final boolean r18, final boolean r19, final androidx.compose.foundation.interaction.InteractionSource r20, androidx.compose.material3.TextFieldColors r21, androidx.compose.p014ui.graphics.Shape r22, float r23, float r24, androidx.compose.runtime.Composer r25, final int r26, final int r27) {
        /*
            Method dump skipped, instructions count: 445
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.OutlinedTextFieldDefaults.m28944ContainerBoxnbWgWpA(boolean, boolean, androidx.compose.foundation.interaction.InteractionSource, androidx.compose.material3.TextFieldColors, androidx.compose.ui.graphics.Shape, float, float, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x03e3  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x03f9  */
    /* JADX WARN: Removed duplicated region for block: B:258:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0125  */
    @androidx.compose.runtime.Composable
    @androidx.compose.material3.ExperimentalMaterial3Api
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void DecorationBox(final java.lang.String r37, final p181hd.InterfaceC9544p r38, final boolean r39, final boolean r40, final androidx.compose.p014ui.text.input.VisualTransformation r41, final androidx.compose.foundation.interaction.InteractionSource r42, boolean r43, p181hd.InterfaceC9544p r44, p181hd.InterfaceC9544p r45, p181hd.InterfaceC9544p r46, p181hd.InterfaceC9544p r47, p181hd.InterfaceC9544p r48, p181hd.InterfaceC9544p r49, p181hd.InterfaceC9544p r50, androidx.compose.material3.TextFieldColors r51, androidx.compose.foundation.layout.PaddingValues r52, p181hd.InterfaceC9544p r53, androidx.compose.runtime.Composer r54, final int r55, final int r56, final int r57) {
        /*
            Method dump skipped, instructions count: 1051
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.OutlinedTextFieldDefaults.DecorationBox(java.lang.String, hd.p, boolean, boolean, androidx.compose.ui.text.input.VisualTransformation, androidx.compose.foundation.interaction.InteractionSource, boolean, hd.p, hd.p, hd.p, hd.p, hd.p, hd.p, hd.p, androidx.compose.material3.TextFieldColors, androidx.compose.foundation.layout.PaddingValues, hd.p, androidx.compose.runtime.Composer, int, int, int):void");
    }

    @Composable
    public final TextFieldColors colors(Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-471651810, i10, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.colors (TextFieldDefaults.kt:921)");
        }
        TextFieldColors defaultOutlinedTextFieldColors = getDefaultOutlinedTextFieldColors(MaterialTheme.INSTANCE.getColorScheme(composer, 6), composer, (i10 << 3) & 112);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultOutlinedTextFieldColors;
    }

    @Composable
    /* renamed from: colors-0hiis_0, reason: not valid java name */
    public final TextFieldColors m28945colors0hiis_0(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, TextSelectionColors textSelectionColors, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42, long j43, long j44, long j45, long j46, long j47, long j48, long j49, long j50, long j51, Composer composer, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        long j52;
        TextSelectionColors textSelectionColors2;
        long jM30914getUnspecified0d7_KjU = (i15 & 1) != 0 ? Color.Companion.m30914getUnspecified0d7_KjU() : j10;
        long jM30914getUnspecified0d7_KjU2 = (i15 & 2) != 0 ? Color.Companion.m30914getUnspecified0d7_KjU() : j11;
        long jM30914getUnspecified0d7_KjU3 = (i15 & 4) != 0 ? Color.Companion.m30914getUnspecified0d7_KjU() : j12;
        long jM30914getUnspecified0d7_KjU4 = (i15 & 8) != 0 ? Color.Companion.m30914getUnspecified0d7_KjU() : j13;
        long jM30914getUnspecified0d7_KjU5 = (i15 & 16) != 0 ? Color.Companion.m30914getUnspecified0d7_KjU() : j14;
        long jM30914getUnspecified0d7_KjU6 = (i15 & 32) != 0 ? Color.Companion.m30914getUnspecified0d7_KjU() : j15;
        long jM30914getUnspecified0d7_KjU7 = (i15 & 64) != 0 ? Color.Companion.m30914getUnspecified0d7_KjU() : j16;
        long j53 = jM30914getUnspecified0d7_KjU;
        long jM30914getUnspecified0d7_KjU8 = (i15 & 128) != 0 ? Color.Companion.m30914getUnspecified0d7_KjU() : j17;
        long jM30914getUnspecified0d7_KjU9 = (i15 & 256) != 0 ? Color.Companion.m30914getUnspecified0d7_KjU() : j18;
        long jM30914getUnspecified0d7_KjU10 = (i15 & 512) != 0 ? Color.Companion.m30914getUnspecified0d7_KjU() : j19;
        TextSelectionColors textSelectionColors3 = (i15 & 1024) != 0 ? null : textSelectionColors;
        long jM30914getUnspecified0d7_KjU11 = (i15 & 2048) != 0 ? Color.Companion.m30914getUnspecified0d7_KjU() : j20;
        long jM30914getUnspecified0d7_KjU12 = (i15 & 4096) != 0 ? Color.Companion.m30914getUnspecified0d7_KjU() : j21;
        long jM30914getUnspecified0d7_KjU13 = (i15 & 8192) != 0 ? Color.Companion.m30914getUnspecified0d7_KjU() : j22;
        long jM30914getUnspecified0d7_KjU14 = (i15 & 16384) != 0 ? Color.Companion.m30914getUnspecified0d7_KjU() : j23;
        long jM30914getUnspecified0d7_KjU15 = (32768 & i15) != 0 ? Color.Companion.m30914getUnspecified0d7_KjU() : j24;
        long jM30914getUnspecified0d7_KjU16 = (65536 & i15) != 0 ? Color.Companion.m30914getUnspecified0d7_KjU() : j25;
        long jM30914getUnspecified0d7_KjU17 = (131072 & i15) != 0 ? Color.Companion.m30914getUnspecified0d7_KjU() : j26;
        long jM30914getUnspecified0d7_KjU18 = (262144 & i15) != 0 ? Color.Companion.m30914getUnspecified0d7_KjU() : j27;
        long jM30914getUnspecified0d7_KjU19 = (524288 & i15) != 0 ? Color.Companion.m30914getUnspecified0d7_KjU() : j28;
        long jM30914getUnspecified0d7_KjU20 = (1048576 & i15) != 0 ? Color.Companion.m30914getUnspecified0d7_KjU() : j29;
        long jM30914getUnspecified0d7_KjU21 = (2097152 & i15) != 0 ? Color.Companion.m30914getUnspecified0d7_KjU() : j30;
        long jM30914getUnspecified0d7_KjU22 = (4194304 & i15) != 0 ? Color.Companion.m30914getUnspecified0d7_KjU() : j31;
        long jM30914getUnspecified0d7_KjU23 = (8388608 & i15) != 0 ? Color.Companion.m30914getUnspecified0d7_KjU() : j32;
        long jM30914getUnspecified0d7_KjU24 = (16777216 & i15) != 0 ? Color.Companion.m30914getUnspecified0d7_KjU() : j33;
        long jM30914getUnspecified0d7_KjU25 = (33554432 & i15) != 0 ? Color.Companion.m30914getUnspecified0d7_KjU() : j34;
        long jM30914getUnspecified0d7_KjU26 = (67108864 & i15) != 0 ? Color.Companion.m30914getUnspecified0d7_KjU() : j35;
        long jM30914getUnspecified0d7_KjU27 = (134217728 & i15) != 0 ? Color.Companion.m30914getUnspecified0d7_KjU() : j36;
        long jM30914getUnspecified0d7_KjU28 = (268435456 & i15) != 0 ? Color.Companion.m30914getUnspecified0d7_KjU() : j37;
        long jM30914getUnspecified0d7_KjU29 = (536870912 & i15) != 0 ? Color.Companion.m30914getUnspecified0d7_KjU() : j38;
        long jM30914getUnspecified0d7_KjU30 = (i15 & 1073741824) != 0 ? Color.Companion.m30914getUnspecified0d7_KjU() : j39;
        long jM30914getUnspecified0d7_KjU31 = (i16 & 1) != 0 ? Color.Companion.m30914getUnspecified0d7_KjU() : j40;
        long jM30914getUnspecified0d7_KjU32 = (i16 & 2) != 0 ? Color.Companion.m30914getUnspecified0d7_KjU() : j41;
        long jM30914getUnspecified0d7_KjU33 = (i16 & 4) != 0 ? Color.Companion.m30914getUnspecified0d7_KjU() : j42;
        long jM30914getUnspecified0d7_KjU34 = (i16 & 8) != 0 ? Color.Companion.m30914getUnspecified0d7_KjU() : j43;
        long jM30914getUnspecified0d7_KjU35 = (i16 & 16) != 0 ? Color.Companion.m30914getUnspecified0d7_KjU() : j44;
        long jM30914getUnspecified0d7_KjU36 = (i16 & 32) != 0 ? Color.Companion.m30914getUnspecified0d7_KjU() : j45;
        long jM30914getUnspecified0d7_KjU37 = (i16 & 64) != 0 ? Color.Companion.m30914getUnspecified0d7_KjU() : j46;
        long jM30914getUnspecified0d7_KjU38 = (i16 & 128) != 0 ? Color.Companion.m30914getUnspecified0d7_KjU() : j47;
        long jM30914getUnspecified0d7_KjU39 = (i16 & 256) != 0 ? Color.Companion.m30914getUnspecified0d7_KjU() : j48;
        long jM30914getUnspecified0d7_KjU40 = (i16 & 512) != 0 ? Color.Companion.m30914getUnspecified0d7_KjU() : j49;
        long jM30914getUnspecified0d7_KjU41 = (i16 & 1024) != 0 ? Color.Companion.m30914getUnspecified0d7_KjU() : j50;
        long jM30914getUnspecified0d7_KjU42 = (i16 & 2048) != 0 ? Color.Companion.m30914getUnspecified0d7_KjU() : j51;
        if (ComposerKt.isTraceInProgress()) {
            j52 = jM30914getUnspecified0d7_KjU42;
            textSelectionColors2 = textSelectionColors3;
            ComposerKt.traceEventStart(1767617725, i10, i11, "androidx.compose.material3.OutlinedTextFieldDefaults.colors (TextFieldDefaults.kt:1023)");
        } else {
            j52 = jM30914getUnspecified0d7_KjU42;
            textSelectionColors2 = textSelectionColors3;
        }
        TextFieldColors textFieldColorsM29219copyejIjP34 = getDefaultOutlinedTextFieldColors(MaterialTheme.INSTANCE.getColorScheme(composer, 6), composer, (i14 >> 6) & 112).m29219copyejIjP34(j53, jM30914getUnspecified0d7_KjU2, jM30914getUnspecified0d7_KjU3, jM30914getUnspecified0d7_KjU4, jM30914getUnspecified0d7_KjU5, jM30914getUnspecified0d7_KjU6, jM30914getUnspecified0d7_KjU7, jM30914getUnspecified0d7_KjU8, jM30914getUnspecified0d7_KjU9, jM30914getUnspecified0d7_KjU10, textSelectionColors2, jM30914getUnspecified0d7_KjU11, jM30914getUnspecified0d7_KjU12, jM30914getUnspecified0d7_KjU13, jM30914getUnspecified0d7_KjU14, jM30914getUnspecified0d7_KjU15, jM30914getUnspecified0d7_KjU16, jM30914getUnspecified0d7_KjU17, jM30914getUnspecified0d7_KjU18, jM30914getUnspecified0d7_KjU19, jM30914getUnspecified0d7_KjU20, jM30914getUnspecified0d7_KjU21, jM30914getUnspecified0d7_KjU22, jM30914getUnspecified0d7_KjU23, jM30914getUnspecified0d7_KjU24, jM30914getUnspecified0d7_KjU25, jM30914getUnspecified0d7_KjU26, jM30914getUnspecified0d7_KjU27, jM30914getUnspecified0d7_KjU28, jM30914getUnspecified0d7_KjU29, jM30914getUnspecified0d7_KjU30, jM30914getUnspecified0d7_KjU31, jM30914getUnspecified0d7_KjU32, jM30914getUnspecified0d7_KjU33, jM30914getUnspecified0d7_KjU34, jM30914getUnspecified0d7_KjU35, jM30914getUnspecified0d7_KjU36, jM30914getUnspecified0d7_KjU37, jM30914getUnspecified0d7_KjU38, jM30914getUnspecified0d7_KjU39, jM30914getUnspecified0d7_KjU40, jM30914getUnspecified0d7_KjU41, j52);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return textFieldColorsM29219copyejIjP34;
    }

    /* renamed from: contentPadding-a9UjIt4, reason: not valid java name */
    public final PaddingValues m28946contentPaddinga9UjIt4(float f10, float f11, float f12, float f13) {
        return PaddingKt.m27454PaddingValuesa9UjIt4(f10, f11, f12, f13);
    }

    @Composable
    public final TextFieldColors getDefaultOutlinedTextFieldColors(ColorScheme colorScheme, Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-292363577, i10, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.<get-defaultOutlinedTextFieldColors> (TextFieldDefaults.kt:1071)");
        }
        TextFieldColors defaultOutlinedTextFieldColorsCached$material3_release = colorScheme.getDefaultOutlinedTextFieldColorsCached$material3_release();
        composer.startReplaceGroup(1540400102);
        if (defaultOutlinedTextFieldColorsCached$material3_release == null) {
            OutlinedTextFieldTokens outlinedTextFieldTokens = OutlinedTextFieldTokens.INSTANCE;
            long jFromToken = ColorSchemeKt.fromToken(colorScheme, outlinedTextFieldTokens.getFocusInputColor());
            long jFromToken2 = ColorSchemeKt.fromToken(colorScheme, outlinedTextFieldTokens.getInputColor());
            long jM30877copywmQWz5c$default = Color.m30877copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, outlinedTextFieldTokens.getDisabledInputColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null);
            long jFromToken3 = ColorSchemeKt.fromToken(colorScheme, outlinedTextFieldTokens.getErrorInputColor());
            Color.Companion companion = Color.Companion;
            TextFieldColors textFieldColors = new TextFieldColors(jFromToken, jFromToken2, jM30877copywmQWz5c$default, jFromToken3, companion.m30913getTransparent0d7_KjU(), companion.m30913getTransparent0d7_KjU(), companion.m30913getTransparent0d7_KjU(), companion.m30913getTransparent0d7_KjU(), ColorSchemeKt.fromToken(colorScheme, outlinedTextFieldTokens.getCaretColor()), ColorSchemeKt.fromToken(colorScheme, outlinedTextFieldTokens.getErrorFocusCaretColor()), (TextSelectionColors) composer.consume(TextSelectionColorsKt.getLocalTextSelectionColors()), ColorSchemeKt.fromToken(colorScheme, outlinedTextFieldTokens.getFocusOutlineColor()), ColorSchemeKt.fromToken(colorScheme, outlinedTextFieldTokens.getOutlineColor()), Color.m30877copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, outlinedTextFieldTokens.getDisabledOutlineColor()), 0.12f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, outlinedTextFieldTokens.getErrorOutlineColor()), ColorSchemeKt.fromToken(colorScheme, outlinedTextFieldTokens.getFocusLeadingIconColor()), ColorSchemeKt.fromToken(colorScheme, outlinedTextFieldTokens.getLeadingIconColor()), Color.m30877copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, outlinedTextFieldTokens.getDisabledLeadingIconColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, outlinedTextFieldTokens.getErrorLeadingIconColor()), ColorSchemeKt.fromToken(colorScheme, outlinedTextFieldTokens.getFocusTrailingIconColor()), ColorSchemeKt.fromToken(colorScheme, outlinedTextFieldTokens.getTrailingIconColor()), Color.m30877copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, outlinedTextFieldTokens.getDisabledTrailingIconColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, outlinedTextFieldTokens.getErrorTrailingIconColor()), ColorSchemeKt.fromToken(colorScheme, outlinedTextFieldTokens.getFocusLabelColor()), ColorSchemeKt.fromToken(colorScheme, outlinedTextFieldTokens.getLabelColor()), Color.m30877copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, outlinedTextFieldTokens.getDisabledLabelColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, outlinedTextFieldTokens.getErrorLabelColor()), ColorSchemeKt.fromToken(colorScheme, outlinedTextFieldTokens.getInputPlaceholderColor()), ColorSchemeKt.fromToken(colorScheme, outlinedTextFieldTokens.getInputPlaceholderColor()), Color.m30877copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, outlinedTextFieldTokens.getDisabledInputColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, outlinedTextFieldTokens.getInputPlaceholderColor()), ColorSchemeKt.fromToken(colorScheme, outlinedTextFieldTokens.getFocusSupportingColor()), ColorSchemeKt.fromToken(colorScheme, outlinedTextFieldTokens.getSupportingColor()), Color.m30877copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, outlinedTextFieldTokens.getDisabledSupportingColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, outlinedTextFieldTokens.getErrorSupportingColor()), ColorSchemeKt.fromToken(colorScheme, outlinedTextFieldTokens.getInputPrefixColor()), ColorSchemeKt.fromToken(colorScheme, outlinedTextFieldTokens.getInputPrefixColor()), Color.m30877copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, outlinedTextFieldTokens.getInputPrefixColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, outlinedTextFieldTokens.getInputPrefixColor()), ColorSchemeKt.fromToken(colorScheme, outlinedTextFieldTokens.getInputSuffixColor()), ColorSchemeKt.fromToken(colorScheme, outlinedTextFieldTokens.getInputSuffixColor()), Color.m30877copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, outlinedTextFieldTokens.getInputSuffixColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, outlinedTextFieldTokens.getInputSuffixColor()), null);
            colorScheme.setDefaultOutlinedTextFieldColorsCached$material3_release(textFieldColors);
            defaultOutlinedTextFieldColorsCached$material3_release = textFieldColors;
        }
        composer.endReplaceGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultOutlinedTextFieldColorsCached$material3_release;
    }

    /* renamed from: getFocusedBorderThickness-D9Ej5fM, reason: not valid java name */
    public final float m28947getFocusedBorderThicknessD9Ej5fM() {
        return FocusedBorderThickness;
    }

    /* renamed from: getMinHeight-D9Ej5fM, reason: not valid java name */
    public final float m28948getMinHeightD9Ej5fM() {
        return MinHeight;
    }

    /* renamed from: getMinWidth-D9Ej5fM, reason: not valid java name */
    public final float m28949getMinWidthD9Ej5fM() {
        return MinWidth;
    }

    @Composable
    public final Shape getShape(Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1066756961, i10, -1, "androidx.compose.material3.OutlinedTextFieldDefaults.<get-shape> (TextFieldDefaults.kt:729)");
        }
        Shape value = ShapesKt.getValue(OutlinedTextFieldTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }

    /* renamed from: getUnfocusedBorderThickness-D9Ej5fM, reason: not valid java name */
    public final float m28950getUnfocusedBorderThicknessD9Ej5fM() {
        return UnfocusedBorderThickness;
    }
}
