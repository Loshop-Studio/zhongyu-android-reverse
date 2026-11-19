package androidx.compose.p012ui.graphics.drawscope;

import androidx.annotation.FloatRange;
import androidx.camera.video.AudioStats;
import androidx.compose.p012ui.geometry.Rect;
import androidx.compose.p012ui.graphics.ColorFilter;
import androidx.compose.p012ui.graphics.ImageBitmap;
import androidx.compose.p012ui.graphics.layer.GraphicsLayer;
import androidx.compose.p012ui.unit.DpRect;
import androidx.compose.runtime.Stable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.color.utilities.Contrast;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

@Metadata(m13412d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0003"}, m13413d2 = {"Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "drawContent", "", "ui-graphics_release"}, m13414k = 1, m13415mv = {1, 9, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public interface ContentDrawScope extends DrawScope {

    @Metadata(m13414k = 3, m13415mv = {1, 9, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class DefaultImpls {
        @Deprecated
        /* renamed from: drawImage-AZ2fEMs, reason: not valid java name */
        public static void m21906drawImageAZ2fEMs(ContentDrawScope contentDrawScope, ImageBitmap imageBitmap, long j9, long j10, long j11, long j12, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m265to = Contrast.RATIO_MIN) float f10, DrawStyle drawStyle, ColorFilter colorFilter, int i9, int i10) {
            ContentDrawScope.super.mo21862drawImageAZ2fEMs(imageBitmap, j9, j10, j11, j12, f10, drawStyle, colorFilter, i9, i10);
        }

        @Deprecated
        /* renamed from: getCenter-F1C5BW0, reason: not valid java name */
        public static long m21907getCenterF1C5BW0(ContentDrawScope contentDrawScope) {
            return ContentDrawScope.super.mo21959getCenterF1C5BW0();
        }

        @Deprecated
        /* renamed from: getSize-NH-jbRc, reason: not valid java name */
        public static long m21908getSizeNHjbRc(ContentDrawScope contentDrawScope) {
            return ContentDrawScope.super.mo21960getSizeNHjbRc();
        }

        @Deprecated
        /* renamed from: record-JVtK1S4, reason: not valid java name */
        public static void m21909recordJVtK1S4(ContentDrawScope contentDrawScope, GraphicsLayer graphicsLayer, long j9, Function1<? super DrawScope, Unit> function1) {
            ContentDrawScope.super.mo21961recordJVtK1S4(graphicsLayer, j9, function1);
        }

        @Stable
        @Deprecated
        /* renamed from: roundToPx--R2X_6o, reason: not valid java name */
        public static int m21910roundToPxR2X_6o(ContentDrawScope contentDrawScope, long j9) {
            return ContentDrawScope.super.mo17758roundToPxR2X_6o(j9);
        }

        @Stable
        @Deprecated
        /* renamed from: roundToPx-0680j_4, reason: not valid java name */
        public static int m21911roundToPx0680j_4(ContentDrawScope contentDrawScope, float f10) {
            return ContentDrawScope.super.mo17759roundToPx0680j_4(f10);
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-GaN1DYA, reason: not valid java name */
        public static float m21912toDpGaN1DYA(ContentDrawScope contentDrawScope, long j9) {
            return ContentDrawScope.super.mo17760toDpGaN1DYA(j9);
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m21913toDpu2uoSUM(ContentDrawScope contentDrawScope, float f10) {
            return ContentDrawScope.super.mo17761toDpu2uoSUM(f10);
        }

        @Stable
        @Deprecated
        /* renamed from: toDpSize-k-rfVVM, reason: not valid java name */
        public static long m21915toDpSizekrfVVM(ContentDrawScope contentDrawScope, long j9) {
            return ContentDrawScope.super.mo17763toDpSizekrfVVM(j9);
        }

        @Stable
        @Deprecated
        /* renamed from: toPx--R2X_6o, reason: not valid java name */
        public static float m21916toPxR2X_6o(ContentDrawScope contentDrawScope, long j9) {
            return ContentDrawScope.super.mo17764toPxR2X_6o(j9);
        }

        @Stable
        @Deprecated
        /* renamed from: toPx-0680j_4, reason: not valid java name */
        public static float m21917toPx0680j_4(ContentDrawScope contentDrawScope, float f10) {
            return ContentDrawScope.super.mo17765toPx0680j_4(f10);
        }

        @Stable
        @Deprecated
        public static Rect toRect(ContentDrawScope contentDrawScope, DpRect dpRect) {
            return ContentDrawScope.super.toRect(dpRect);
        }

        @Stable
        @Deprecated
        /* renamed from: toSize-XkaWNTQ, reason: not valid java name */
        public static long m21918toSizeXkaWNTQ(ContentDrawScope contentDrawScope, long j9) {
            return ContentDrawScope.super.mo17766toSizeXkaWNTQ(j9);
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-0xMU5do, reason: not valid java name */
        public static long m21919toSp0xMU5do(ContentDrawScope contentDrawScope, float f10) {
            return ContentDrawScope.super.mo17767toSp0xMU5do(f10);
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m21920toSpkPz2Gy4(ContentDrawScope contentDrawScope, float f10) {
            return ContentDrawScope.super.mo17768toSpkPz2Gy4(f10);
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m21914toDpu2uoSUM(ContentDrawScope contentDrawScope, int i9) {
            return ContentDrawScope.super.mo17762toDpu2uoSUM(i9);
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m21921toSpkPz2Gy4(ContentDrawScope contentDrawScope, int i9) {
            return ContentDrawScope.super.mo17769toSpkPz2Gy4(i9);
        }
    }

    void drawContent();
}
