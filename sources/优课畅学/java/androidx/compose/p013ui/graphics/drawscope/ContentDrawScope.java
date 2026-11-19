package androidx.compose.p013ui.graphics.drawscope;

import androidx.annotation.FloatRange;
import androidx.camera.video.AudioStats;
import androidx.compose.p013ui.geometry.Rect;
import androidx.compose.p013ui.graphics.ColorFilter;
import androidx.compose.p013ui.graphics.ImageBitmap;
import androidx.compose.p013ui.graphics.layer.GraphicsLayer;
import androidx.compose.p013ui.unit.DpRect;
import androidx.compose.runtime.Stable;
import com.google.android.material.color.utilities.Contrast;
import p300x7.InterfaceC10570l;

/* loaded from: classes2.dex */
public interface ContentDrawScope extends DrawScope {

    public static final class DefaultImpls {
        @Deprecated
        /* renamed from: drawImage-AZ2fEMs, reason: not valid java name */
        public static void m24773drawImageAZ2fEMs(ContentDrawScope contentDrawScope, ImageBitmap imageBitmap, long j10, long j11, long j12, long j13, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m243to = Contrast.RATIO_MIN) float f10, DrawStyle drawStyle, ColorFilter colorFilter, int i10, int i11) {
            ContentDrawScope.super.mo24729drawImageAZ2fEMs(imageBitmap, j10, j11, j12, j13, f10, drawStyle, colorFilter, i10, i11);
        }

        @Deprecated
        /* renamed from: getCenter-F1C5BW0, reason: not valid java name */
        public static long m24774getCenterF1C5BW0(ContentDrawScope contentDrawScope) {
            return ContentDrawScope.super.mo24826getCenterF1C5BW0();
        }

        @Deprecated
        /* renamed from: getSize-NH-jbRc, reason: not valid java name */
        public static long m24775getSizeNHjbRc(ContentDrawScope contentDrawScope) {
            return ContentDrawScope.super.mo24827getSizeNHjbRc();
        }

        @Deprecated
        /* renamed from: record-JVtK1S4, reason: not valid java name */
        public static void m24776recordJVtK1S4(ContentDrawScope contentDrawScope, GraphicsLayer graphicsLayer, long j10, InterfaceC10570l interfaceC10570l) {
            ContentDrawScope.super.mo24828recordJVtK1S4(graphicsLayer, j10, interfaceC10570l);
        }

        @Stable
        @Deprecated
        /* renamed from: roundToPx--R2X_6o, reason: not valid java name */
        public static int m24777roundToPxR2X_6o(ContentDrawScope contentDrawScope, long j10) {
            return ContentDrawScope.super.mo20490roundToPxR2X_6o(j10);
        }

        @Stable
        @Deprecated
        /* renamed from: roundToPx-0680j_4, reason: not valid java name */
        public static int m24778roundToPx0680j_4(ContentDrawScope contentDrawScope, float f10) {
            return ContentDrawScope.super.mo20491roundToPx0680j_4(f10);
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-GaN1DYA, reason: not valid java name */
        public static float m24779toDpGaN1DYA(ContentDrawScope contentDrawScope, long j10) {
            return ContentDrawScope.super.mo20492toDpGaN1DYA(j10);
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m24780toDpu2uoSUM(ContentDrawScope contentDrawScope, float f10) {
            return ContentDrawScope.super.mo20493toDpu2uoSUM(f10);
        }

        @Stable
        @Deprecated
        /* renamed from: toDpSize-k-rfVVM, reason: not valid java name */
        public static long m24782toDpSizekrfVVM(ContentDrawScope contentDrawScope, long j10) {
            return ContentDrawScope.super.mo20495toDpSizekrfVVM(j10);
        }

        @Stable
        @Deprecated
        /* renamed from: toPx--R2X_6o, reason: not valid java name */
        public static float m24783toPxR2X_6o(ContentDrawScope contentDrawScope, long j10) {
            return ContentDrawScope.super.mo20496toPxR2X_6o(j10);
        }

        @Stable
        @Deprecated
        /* renamed from: toPx-0680j_4, reason: not valid java name */
        public static float m24784toPx0680j_4(ContentDrawScope contentDrawScope, float f10) {
            return ContentDrawScope.super.mo20497toPx0680j_4(f10);
        }

        @Stable
        @Deprecated
        public static Rect toRect(ContentDrawScope contentDrawScope, DpRect dpRect) {
            return ContentDrawScope.super.toRect(dpRect);
        }

        @Stable
        @Deprecated
        /* renamed from: toSize-XkaWNTQ, reason: not valid java name */
        public static long m24785toSizeXkaWNTQ(ContentDrawScope contentDrawScope, long j10) {
            return ContentDrawScope.super.mo20498toSizeXkaWNTQ(j10);
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-0xMU5do, reason: not valid java name */
        public static long m24786toSp0xMU5do(ContentDrawScope contentDrawScope, float f10) {
            return ContentDrawScope.super.mo20499toSp0xMU5do(f10);
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m24787toSpkPz2Gy4(ContentDrawScope contentDrawScope, float f10) {
            return ContentDrawScope.super.mo20500toSpkPz2Gy4(f10);
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m24781toDpu2uoSUM(ContentDrawScope contentDrawScope, int i10) {
            return ContentDrawScope.super.mo20494toDpu2uoSUM(i10);
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m24788toSpkPz2Gy4(ContentDrawScope contentDrawScope, int i10) {
            return ContentDrawScope.super.mo20501toSpkPz2Gy4(i10);
        }
    }

    void drawContent();
}
