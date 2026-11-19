package androidx.compose.material3;

import androidx.compose.material3.tokens.SliderTokens;
import androidx.compose.p014ui.geometry.CornerRadiusKt;
import androidx.compose.p014ui.geometry.Offset;
import androidx.compose.p014ui.geometry.OffsetKt;
import androidx.compose.p014ui.geometry.RectKt;
import androidx.compose.p014ui.geometry.RoundRect;
import androidx.compose.p014ui.geometry.RoundRectKt;
import androidx.compose.p014ui.geometry.Size;
import androidx.compose.p014ui.geometry.SizeKt;
import androidx.compose.p014ui.graphics.AndroidPath_androidKt;
import androidx.compose.p014ui.graphics.Color;
import androidx.compose.p014ui.graphics.ColorKt;
import androidx.compose.p014ui.graphics.Path;
import androidx.compose.p014ui.graphics.drawscope.DrawScope;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Stable;

@Stable
/* loaded from: classes2.dex */
public final class SliderDefaults {
    public static final int $stable = 0;
    public static final SliderDefaults INSTANCE = new SliderDefaults();
    private static final float TickSize;
    private static final float TrackStopIndicatorSize;
    private static final Path trackPath;

    static {
        SliderTokens sliderTokens = SliderTokens.INSTANCE;
        TrackStopIndicatorSize = sliderTokens.m30113getStopIndicatorSizeD9Ej5fM();
        TickSize = sliderTokens.m30113getStopIndicatorSizeD9Ej5fM();
        trackPath = AndroidPath_androidKt.Path();
    }

    private SliderDefaults() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: drawStopIndicator-x3O1jOs, reason: not valid java name */
    public final void m29092drawStopIndicatorx3O1jOs(DrawScope drawScope, long j10, float f10, long j11) {
        DrawScope.m31410drawCircleVaOC9Bg$default(drawScope, j11, drawScope.mo27099toPx0680j_4(f10) / 2.0f, j10, 0.0f, null, null, 0, MenuKt.InTransitionDuration, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01c1  */
    /* renamed from: drawTrack-ngJ0SCU, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m29093drawTrackngJ0SCU(androidx.compose.p014ui.graphics.drawscope.DrawScope r31, float[] r32, float r33, float r34, long r35, long r37, long r39, long r41, float r43, float r44, float r45, float r46, float r47, p181hd.InterfaceC9544p r48, p181hd.InterfaceC9545q r49, boolean r50) {
        /*
            Method dump skipped, instructions count: 539
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SliderDefaults.m29093drawTrackngJ0SCU(androidx.compose.ui.graphics.drawscope.DrawScope, float[], float, float, long, long, long, long, float, float, float, float, float, hd.p, hd.q, boolean):void");
    }

    /* renamed from: drawTrackPath-Cx2C_VA, reason: not valid java name */
    private final void m29094drawTrackPathCx2C_VA(DrawScope drawScope, long j10, long j11, long j12, float f10, float f11) {
        long jCornerRadius = CornerRadiusKt.CornerRadius(f10, f10);
        long jCornerRadius2 = CornerRadiusKt.CornerRadius(f11, f11);
        RoundRect roundRectM30689RoundRectZAM2FJo = RoundRectKt.m30689RoundRectZAM2FJo(RectKt.m30677Recttz77jQw(OffsetKt.Offset(Offset.m30637getXimpl(j10), 0.0f), SizeKt.Size(Size.m30706getWidthimpl(j11), Size.m30703getHeightimpl(j11))), jCornerRadius, jCornerRadius2, jCornerRadius2, jCornerRadius);
        Path path = trackPath;
        Path.addRoundRect$default(path, roundRectM30689RoundRectZAM2FJo, null, 2, null);
        DrawScope.m31419drawPathLG529CI$default(drawScope, path, j12, 0.0f, null, null, 0, 60, null);
        path.rewind();
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:119:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x011b  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /* renamed from: Thumb-9LiSoMs, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m29095Thumb9LiSoMs(final androidx.compose.foundation.interaction.MutableInteractionSource r24, androidx.compose.p014ui.Modifier r25, androidx.compose.material3.SliderColors r26, boolean r27, long r28, androidx.compose.runtime.Composer r30, final int r31, final int r32) {
        /*
            Method dump skipped, instructions count: 418
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SliderDefaults.m29095Thumb9LiSoMs(androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.Modifier, androidx.compose.material3.SliderColors, boolean, long, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:103:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x015a  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    @p309qc.InterfaceC10770a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Track(final androidx.compose.material3.SliderPositions r18, androidx.compose.p014ui.Modifier r19, androidx.compose.material3.SliderColors r20, boolean r21, androidx.compose.runtime.Composer r22, final int r23, final int r24) {
        /*
            Method dump skipped, instructions count: 376
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SliderDefaults.Track(androidx.compose.material3.SliderPositions, androidx.compose.ui.Modifier, androidx.compose.material3.SliderColors, boolean, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0258 A[PHI: r2
      0x0258: PHI (r2v14 hd.p) = (r2v11 hd.p), (r2v15 hd.p) binds: [B:171:0x0256, B:167:0x024f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:173:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:193:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0112  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    @androidx.compose.material3.ExperimentalMaterial3Api
    /* renamed from: Track-4EFweAY, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m29097Track4EFweAY(final androidx.compose.material3.SliderState r25, androidx.compose.p014ui.Modifier r26, boolean r27, androidx.compose.material3.SliderColors r28, p181hd.InterfaceC9544p r29, p181hd.InterfaceC9545q r30, float r31, float r32, androidx.compose.runtime.Composer r33, final int r34, final int r35) {
        /*
            Method dump skipped, instructions count: 717
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SliderDefaults.m29097Track4EFweAY(androidx.compose.material3.SliderState, androidx.compose.ui.Modifier, boolean, androidx.compose.material3.SliderColors, hd.p, hd.q, float, float, androidx.compose.runtime.Composer, int, int):void");
    }

    @Composable
    public final SliderColors colors(Composer composer, int i10) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1376295968, i10, -1, "androidx.compose.material3.SliderDefaults.colors (Slider.kt:845)");
        }
        SliderColors defaultSliderColors$material3_release = getDefaultSliderColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return defaultSliderColors$material3_release;
    }

    @Composable
    /* renamed from: colors-q0g_0yA, reason: not valid java name */
    public final SliderColors m29098colorsq0g_0yA(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, Composer composer, int i10, int i11, int i12) {
        long j20;
        long j21;
        long jM30914getUnspecified0d7_KjU = (i12 & 1) != 0 ? Color.Companion.m30914getUnspecified0d7_KjU() : j10;
        long jM30914getUnspecified0d7_KjU2 = (i12 & 2) != 0 ? Color.Companion.m30914getUnspecified0d7_KjU() : j11;
        long jM30914getUnspecified0d7_KjU3 = (i12 & 4) != 0 ? Color.Companion.m30914getUnspecified0d7_KjU() : j12;
        long jM30914getUnspecified0d7_KjU4 = (i12 & 8) != 0 ? Color.Companion.m30914getUnspecified0d7_KjU() : j13;
        long jM30914getUnspecified0d7_KjU5 = (i12 & 16) != 0 ? Color.Companion.m30914getUnspecified0d7_KjU() : j14;
        long jM30914getUnspecified0d7_KjU6 = (i12 & 32) != 0 ? Color.Companion.m30914getUnspecified0d7_KjU() : j15;
        long jM30914getUnspecified0d7_KjU7 = (i12 & 64) != 0 ? Color.Companion.m30914getUnspecified0d7_KjU() : j16;
        long jM30914getUnspecified0d7_KjU8 = (i12 & 128) != 0 ? Color.Companion.m30914getUnspecified0d7_KjU() : j17;
        long j22 = jM30914getUnspecified0d7_KjU;
        long jM30914getUnspecified0d7_KjU9 = (i12 & 256) != 0 ? Color.Companion.m30914getUnspecified0d7_KjU() : j18;
        long jM30914getUnspecified0d7_KjU10 = (i12 & 512) != 0 ? Color.Companion.m30914getUnspecified0d7_KjU() : j19;
        if (ComposerKt.isTraceInProgress()) {
            j20 = jM30914getUnspecified0d7_KjU9;
            j21 = jM30914getUnspecified0d7_KjU2;
            ComposerKt.traceEventStart(885588574, i10, i11, "androidx.compose.material3.SliderDefaults.colors (Slider.kt:887)");
        } else {
            j20 = jM30914getUnspecified0d7_KjU9;
            j21 = jM30914getUnspecified0d7_KjU2;
        }
        SliderColors sliderColorsM29076copyK518z4 = getDefaultSliderColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6)).m29076copyK518z4(j22, j21, jM30914getUnspecified0d7_KjU3, jM30914getUnspecified0d7_KjU4, jM30914getUnspecified0d7_KjU5, jM30914getUnspecified0d7_KjU6, jM30914getUnspecified0d7_KjU7, jM30914getUnspecified0d7_KjU8, j20, jM30914getUnspecified0d7_KjU10);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return sliderColorsM29076copyK518z4;
    }

    public final SliderColors getDefaultSliderColors$material3_release(ColorScheme colorScheme) {
        SliderColors defaultSliderColorsCached$material3_release = colorScheme.getDefaultSliderColorsCached$material3_release();
        if (defaultSliderColorsCached$material3_release != null) {
            return defaultSliderColorsCached$material3_release;
        }
        SliderTokens sliderTokens = SliderTokens.INSTANCE;
        SliderColors sliderColors = new SliderColors(ColorSchemeKt.fromToken(colorScheme, sliderTokens.getHandleColor()), ColorSchemeKt.fromToken(colorScheme, sliderTokens.getActiveTrackColor()), ColorSchemeKt.fromToken(colorScheme, sliderTokens.getInactiveTrackColor()), ColorSchemeKt.fromToken(colorScheme, sliderTokens.getInactiveTrackColor()), ColorSchemeKt.fromToken(colorScheme, sliderTokens.getActiveTrackColor()), ColorKt.m30923compositeOverOWjLjI(Color.m30877copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, sliderTokens.getDisabledHandleColor()), sliderTokens.getDisabledHandleOpacity(), 0.0f, 0.0f, 0.0f, 14, null), colorScheme.m28498getSurface0d7_KjU()), Color.m30877copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, sliderTokens.getDisabledActiveTrackColor()), sliderTokens.getDisabledActiveTrackOpacity(), 0.0f, 0.0f, 0.0f, 14, null), Color.m30877copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, sliderTokens.getDisabledInactiveTrackColor()), sliderTokens.getDisabledInactiveTrackOpacity(), 0.0f, 0.0f, 0.0f, 14, null), Color.m30877copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, sliderTokens.getDisabledInactiveTrackColor()), sliderTokens.getDisabledInactiveTrackOpacity(), 0.0f, 0.0f, 0.0f, 14, null), Color.m30877copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, sliderTokens.getDisabledActiveTrackColor()), sliderTokens.getDisabledActiveTrackOpacity(), 0.0f, 0.0f, 0.0f, 14, null), null);
        colorScheme.setDefaultSliderColorsCached$material3_release(sliderColors);
        return sliderColors;
    }

    /* renamed from: getTickSize-D9Ej5fM, reason: not valid java name */
    public final float m29099getTickSizeD9Ej5fM() {
        return TickSize;
    }

    /* renamed from: getTrackStopIndicatorSize-D9Ej5fM, reason: not valid java name */
    public final float m29100getTrackStopIndicatorSizeD9Ej5fM() {
        return TrackStopIndicatorSize;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:92:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.material3.ExperimentalMaterial3Api
    @androidx.compose.runtime.Composable
    @p309qc.InterfaceC10770a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* synthetic */ void Track(final androidx.compose.material3.SliderState r15, androidx.compose.p014ui.Modifier r16, androidx.compose.material3.SliderColors r17, boolean r18, androidx.compose.runtime.Composer r19, final int r20, final int r21) {
        /*
            Method dump skipped, instructions count: 306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SliderDefaults.Track(androidx.compose.material3.SliderState, androidx.compose.ui.Modifier, androidx.compose.material3.SliderColors, boolean, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:92:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    @p309qc.InterfaceC10770a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* synthetic */ void Track(final androidx.compose.material3.RangeSliderState r15, androidx.compose.p014ui.Modifier r16, androidx.compose.material3.SliderColors r17, boolean r18, androidx.compose.runtime.Composer r19, final int r20, final int r21) {
        /*
            Method dump skipped, instructions count: 306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SliderDefaults.Track(androidx.compose.material3.RangeSliderState, androidx.compose.ui.Modifier, androidx.compose.material3.SliderColors, boolean, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0258 A[PHI: r2
      0x0258: PHI (r2v14 hd.p) = (r2v11 hd.p), (r2v15 hd.p) binds: [B:171:0x0256, B:167:0x024f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:173:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:193:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0112  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /* renamed from: Track-4EFweAY, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m29096Track4EFweAY(final androidx.compose.material3.RangeSliderState r25, androidx.compose.p014ui.Modifier r26, boolean r27, androidx.compose.material3.SliderColors r28, p181hd.InterfaceC9544p r29, p181hd.InterfaceC9545q r30, float r31, float r32, androidx.compose.runtime.Composer r33, final int r34, final int r35) {
        /*
            Method dump skipped, instructions count: 717
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SliderDefaults.m29096Track4EFweAY(androidx.compose.material3.RangeSliderState, androidx.compose.ui.Modifier, boolean, androidx.compose.material3.SliderColors, hd.p, hd.q, float, float, androidx.compose.runtime.Composer, int, int):void");
    }
}
