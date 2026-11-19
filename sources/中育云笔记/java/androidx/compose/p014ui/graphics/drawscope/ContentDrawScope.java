package androidx.compose.p014ui.graphics.drawscope;

import androidx.annotation.FloatRange;
import androidx.camera.video.AudioStats;
import androidx.compose.p014ui.geometry.Rect;
import androidx.compose.p014ui.graphics.ColorFilter;
import androidx.compose.p014ui.graphics.ImageBitmap;
import androidx.compose.p014ui.graphics.layer.GraphicsLayer;
import androidx.compose.p014ui.unit.DpRect;
import androidx.compose.runtime.Stable;
import com.google.android.material.color.utilities.Contrast;
import p181hd.InterfaceC9540l;

/* loaded from: classes2.dex */
public interface ContentDrawScope extends DrawScope {

    public static final class DefaultImpls {
        @Deprecated
        /* renamed from: drawImage-AZ2fEMs, reason: not valid java name */
        public static void m31375drawImageAZ2fEMs(ContentDrawScope contentDrawScope, ImageBitmap imageBitmap, long j10, long j11, long j12, long j13, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m337to = Contrast.RATIO_MIN) float f10, DrawStyle drawStyle, ColorFilter colorFilter, int i10, int i11) {
            ContentDrawScope.super.mo31331drawImageAZ2fEMs(imageBitmap, j10, j11, j12, j13, f10, drawStyle, colorFilter, i10, i11);
        }

        @Deprecated
        /* renamed from: getCenter-F1C5BW0, reason: not valid java name */
        public static long m31376getCenterF1C5BW0(ContentDrawScope contentDrawScope) {
            return ContentDrawScope.super.mo31428getCenterF1C5BW0();
        }

        @Deprecated
        /* renamed from: getSize-NH-jbRc, reason: not valid java name */
        public static long m31377getSizeNHjbRc(ContentDrawScope contentDrawScope) {
            return ContentDrawScope.super.mo31429getSizeNHjbRc();
        }

        @Deprecated
        /* renamed from: record-JVtK1S4, reason: not valid java name */
        public static void m31378recordJVtK1S4(ContentDrawScope contentDrawScope, GraphicsLayer graphicsLayer, long j10, InterfaceC9540l interfaceC9540l) {
            ContentDrawScope.super.mo31430recordJVtK1S4(graphicsLayer, j10, interfaceC9540l);
        }

        @Stable
        @Deprecated
        /* renamed from: roundToPx--R2X_6o, reason: not valid java name */
        public static int m31379roundToPxR2X_6o(ContentDrawScope contentDrawScope, long j10) {
            return ContentDrawScope.super.mo27092roundToPxR2X_6o(j10);
        }

        @Stable
        @Deprecated
        /* renamed from: roundToPx-0680j_4, reason: not valid java name */
        public static int m31380roundToPx0680j_4(ContentDrawScope contentDrawScope, float f10) {
            return ContentDrawScope.super.mo27093roundToPx0680j_4(f10);
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-GaN1DYA, reason: not valid java name */
        public static float m31381toDpGaN1DYA(ContentDrawScope contentDrawScope, long j10) {
            return ContentDrawScope.super.mo27094toDpGaN1DYA(j10);
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m31382toDpu2uoSUM(ContentDrawScope contentDrawScope, float f10) {
            return ContentDrawScope.super.mo27095toDpu2uoSUM(f10);
        }

        @Stable
        @Deprecated
        /* renamed from: toDpSize-k-rfVVM, reason: not valid java name */
        public static long m31384toDpSizekrfVVM(ContentDrawScope contentDrawScope, long j10) {
            return ContentDrawScope.super.mo27097toDpSizekrfVVM(j10);
        }

        @Stable
        @Deprecated
        /* renamed from: toPx--R2X_6o, reason: not valid java name */
        public static float m31385toPxR2X_6o(ContentDrawScope contentDrawScope, long j10) {
            return ContentDrawScope.super.mo27098toPxR2X_6o(j10);
        }

        @Stable
        @Deprecated
        /* renamed from: toPx-0680j_4, reason: not valid java name */
        public static float m31386toPx0680j_4(ContentDrawScope contentDrawScope, float f10) {
            return ContentDrawScope.super.mo27099toPx0680j_4(f10);
        }

        @Stable
        @Deprecated
        public static Rect toRect(ContentDrawScope contentDrawScope, DpRect dpRect) {
            return ContentDrawScope.super.toRect(dpRect);
        }

        @Stable
        @Deprecated
        /* renamed from: toSize-XkaWNTQ, reason: not valid java name */
        public static long m31387toSizeXkaWNTQ(ContentDrawScope contentDrawScope, long j10) {
            return ContentDrawScope.super.mo27100toSizeXkaWNTQ(j10);
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-0xMU5do, reason: not valid java name */
        public static long m31388toSp0xMU5do(ContentDrawScope contentDrawScope, float f10) {
            return ContentDrawScope.super.mo27101toSp0xMU5do(f10);
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m31389toSpkPz2Gy4(ContentDrawScope contentDrawScope, float f10) {
            return ContentDrawScope.super.mo27102toSpkPz2Gy4(f10);
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m31383toDpu2uoSUM(ContentDrawScope contentDrawScope, int i10) {
            return ContentDrawScope.super.mo27096toDpu2uoSUM(i10);
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m31390toSpkPz2Gy4(ContentDrawScope contentDrawScope, int i10) {
            return ContentDrawScope.super.mo27103toSpkPz2Gy4(i10);
        }
    }

    void drawContent();
}
