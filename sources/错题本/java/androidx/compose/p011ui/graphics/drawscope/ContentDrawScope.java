package androidx.compose.p011ui.graphics.drawscope;

import androidx.annotation.FloatRange;
import androidx.camera.video.AudioStats;
import androidx.compose.p011ui.geometry.Rect;
import androidx.compose.p011ui.graphics.ColorFilter;
import androidx.compose.p011ui.graphics.ImageBitmap;
import androidx.compose.p011ui.graphics.layer.GraphicsLayer;
import androidx.compose.p011ui.unit.DpRect;
import androidx.compose.runtime.Stable;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p152r6.InterfaceC6471c;

@Metadata(m5109d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0005À\u0006\u0003"}, m5110d2 = {"Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "Ld6/s;", "drawContent", "()V", "ui-graphics_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public interface ContentDrawScope extends DrawScope {

    @Metadata(m5111k = 3, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class DefaultImpls {
        @Deprecated
        /* renamed from: drawImage-AZ2fEMs, reason: not valid java name */
        public static void m11179drawImageAZ2fEMs(@NotNull ContentDrawScope contentDrawScope, @NotNull ImageBitmap imageBitmap, long j7, long j8, long j9, long j10, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m246to = 1.0d) float f, @NotNull DrawStyle drawStyle, @Nullable ColorFilter colorFilter, int i, int i8) {
            ContentDrawScope.super.mo11135drawImageAZ2fEMs(imageBitmap, j7, j8, j9, j10, f, drawStyle, colorFilter, i, i8);
        }

        @Deprecated
        /* renamed from: getCenter-F1C5BW0, reason: not valid java name */
        public static long m11180getCenterF1C5BW0(@NotNull ContentDrawScope contentDrawScope) {
            return ContentDrawScope.super.mo11232getCenterF1C5BW0();
        }

        @Deprecated
        /* renamed from: getSize-NH-jbRc, reason: not valid java name */
        public static long m11181getSizeNHjbRc(@NotNull ContentDrawScope contentDrawScope) {
            return ContentDrawScope.super.mo11233getSizeNHjbRc();
        }

        @Deprecated
        /* renamed from: record-JVtK1S4, reason: not valid java name */
        public static void m11182recordJVtK1S4(@NotNull ContentDrawScope contentDrawScope, @NotNull GraphicsLayer graphicsLayer, long j7, @NotNull InterfaceC6471c interfaceC6471c) {
            ContentDrawScope.super.mo11234recordJVtK1S4(graphicsLayer, j7, interfaceC6471c);
        }

        @Stable
        @Deprecated
        /* renamed from: roundToPx--R2X_6o, reason: not valid java name */
        public static int m11183roundToPxR2X_6o(@NotNull ContentDrawScope contentDrawScope, long j7) {
            return ContentDrawScope.super.mo6896roundToPxR2X_6o(j7);
        }

        @Stable
        @Deprecated
        /* renamed from: roundToPx-0680j_4, reason: not valid java name */
        public static int m11184roundToPx0680j_4(@NotNull ContentDrawScope contentDrawScope, float f) {
            return ContentDrawScope.super.mo6897roundToPx0680j_4(f);
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-GaN1DYA, reason: not valid java name */
        public static float m11185toDpGaN1DYA(@NotNull ContentDrawScope contentDrawScope, long j7) {
            return ContentDrawScope.super.mo6898toDpGaN1DYA(j7);
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m11186toDpu2uoSUM(@NotNull ContentDrawScope contentDrawScope, float f) {
            return ContentDrawScope.super.mo6899toDpu2uoSUM(f);
        }

        @Stable
        @Deprecated
        /* renamed from: toDpSize-k-rfVVM, reason: not valid java name */
        public static long m11188toDpSizekrfVVM(@NotNull ContentDrawScope contentDrawScope, long j7) {
            return ContentDrawScope.super.mo6901toDpSizekrfVVM(j7);
        }

        @Stable
        @Deprecated
        /* renamed from: toPx--R2X_6o, reason: not valid java name */
        public static float m11189toPxR2X_6o(@NotNull ContentDrawScope contentDrawScope, long j7) {
            return ContentDrawScope.super.mo6902toPxR2X_6o(j7);
        }

        @Stable
        @Deprecated
        /* renamed from: toPx-0680j_4, reason: not valid java name */
        public static float m11190toPx0680j_4(@NotNull ContentDrawScope contentDrawScope, float f) {
            return ContentDrawScope.super.mo6903toPx0680j_4(f);
        }

        @Stable
        @Deprecated
        @NotNull
        public static Rect toRect(@NotNull ContentDrawScope contentDrawScope, @NotNull DpRect dpRect) {
            return ContentDrawScope.super.toRect(dpRect);
        }

        @Stable
        @Deprecated
        /* renamed from: toSize-XkaWNTQ, reason: not valid java name */
        public static long m11191toSizeXkaWNTQ(@NotNull ContentDrawScope contentDrawScope, long j7) {
            return ContentDrawScope.super.mo6904toSizeXkaWNTQ(j7);
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-0xMU5do, reason: not valid java name */
        public static long m11192toSp0xMU5do(@NotNull ContentDrawScope contentDrawScope, float f) {
            return ContentDrawScope.super.mo6905toSp0xMU5do(f);
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m11193toSpkPz2Gy4(@NotNull ContentDrawScope contentDrawScope, float f) {
            return ContentDrawScope.super.mo6906toSpkPz2Gy4(f);
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m11187toDpu2uoSUM(@NotNull ContentDrawScope contentDrawScope, int i) {
            return ContentDrawScope.super.mo6900toDpu2uoSUM(i);
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m11194toSpkPz2Gy4(@NotNull ContentDrawScope contentDrawScope, int i) {
            return ContentDrawScope.super.mo6907toSpkPz2Gy4(i);
        }
    }

    void drawContent();
}
