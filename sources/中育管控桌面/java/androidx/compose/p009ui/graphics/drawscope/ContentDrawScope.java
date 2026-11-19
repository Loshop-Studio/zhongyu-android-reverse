package androidx.compose.p009ui.graphics.drawscope;

import androidx.annotation.FloatRange;
import androidx.compose.p009ui.geometry.Rect;
import androidx.compose.p009ui.graphics.ColorFilter;
import androidx.compose.p009ui.graphics.ImageBitmap;
import androidx.compose.p009ui.graphics.layer.GraphicsLayer;
import androidx.compose.p009ui.unit.DpRect;
import androidx.compose.runtime.Stable;
import com.google.android.material.color.utilities.Contrast;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

@Metadata(m7879d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0003"}, m7880d2 = {"Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "drawContent", "", "ui-graphics_release"}, m7881k = 1, m7882mv = {1, 9, 0}, m7884xi = 48)
/* loaded from: classes2.dex */
public interface ContentDrawScope extends DrawScope {

    @Metadata(m7881k = 3, m7882mv = {1, 9, 0}, m7884xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        /* renamed from: drawImage-AZ2fEMs, reason: not valid java name */
        public static void m14396drawImageAZ2fEMs(ContentDrawScope contentDrawScope, ImageBitmap imageBitmap, long j6, long j7, long j8, long j9, @FloatRange(from = 0.0d, m58to = Contrast.RATIO_MIN) float f6, DrawStyle drawStyle, ColorFilter colorFilter, int i6, int i7) {
            ContentDrawScope.super.mo14352drawImageAZ2fEMs(imageBitmap, j6, j7, j8, j9, f6, drawStyle, colorFilter, i6, i7);
        }

        @Deprecated
        /* renamed from: getCenter-F1C5BW0, reason: not valid java name */
        public static long m14397getCenterF1C5BW0(ContentDrawScope contentDrawScope) {
            return ContentDrawScope.super.mo14449getCenterF1C5BW0();
        }

        @Deprecated
        /* renamed from: getSize-NH-jbRc, reason: not valid java name */
        public static long m14398getSizeNHjbRc(ContentDrawScope contentDrawScope) {
            return ContentDrawScope.super.mo14450getSizeNHjbRc();
        }

        @Deprecated
        /* renamed from: record-JVtK1S4, reason: not valid java name */
        public static void m14399recordJVtK1S4(ContentDrawScope contentDrawScope, GraphicsLayer graphicsLayer, long j6, Function1<? super DrawScope, Unit> function1) {
            ContentDrawScope.super.mo14451recordJVtK1S4(graphicsLayer, j6, function1);
        }

        @Stable
        @Deprecated
        /* renamed from: roundToPx--R2X_6o, reason: not valid java name */
        public static int m14400roundToPxR2X_6o(ContentDrawScope contentDrawScope, long j6) {
            return ContentDrawScope.super.mo10248roundToPxR2X_6o(j6);
        }

        @Stable
        @Deprecated
        /* renamed from: roundToPx-0680j_4, reason: not valid java name */
        public static int m14401roundToPx0680j_4(ContentDrawScope contentDrawScope, float f6) {
            return ContentDrawScope.super.mo10249roundToPx0680j_4(f6);
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-GaN1DYA, reason: not valid java name */
        public static float m14402toDpGaN1DYA(ContentDrawScope contentDrawScope, long j6) {
            return ContentDrawScope.super.mo10250toDpGaN1DYA(j6);
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m14403toDpu2uoSUM(ContentDrawScope contentDrawScope, float f6) {
            return ContentDrawScope.super.mo10251toDpu2uoSUM(f6);
        }

        @Stable
        @Deprecated
        /* renamed from: toDpSize-k-rfVVM, reason: not valid java name */
        public static long m14405toDpSizekrfVVM(ContentDrawScope contentDrawScope, long j6) {
            return ContentDrawScope.super.mo10253toDpSizekrfVVM(j6);
        }

        @Stable
        @Deprecated
        /* renamed from: toPx--R2X_6o, reason: not valid java name */
        public static float m14406toPxR2X_6o(ContentDrawScope contentDrawScope, long j6) {
            return ContentDrawScope.super.mo10254toPxR2X_6o(j6);
        }

        @Stable
        @Deprecated
        /* renamed from: toPx-0680j_4, reason: not valid java name */
        public static float m14407toPx0680j_4(ContentDrawScope contentDrawScope, float f6) {
            return ContentDrawScope.super.mo10255toPx0680j_4(f6);
        }

        @Stable
        @Deprecated
        public static Rect toRect(ContentDrawScope contentDrawScope, DpRect dpRect) {
            return ContentDrawScope.super.toRect(dpRect);
        }

        @Stable
        @Deprecated
        /* renamed from: toSize-XkaWNTQ, reason: not valid java name */
        public static long m14408toSizeXkaWNTQ(ContentDrawScope contentDrawScope, long j6) {
            return ContentDrawScope.super.mo10256toSizeXkaWNTQ(j6);
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-0xMU5do, reason: not valid java name */
        public static long m14409toSp0xMU5do(ContentDrawScope contentDrawScope, float f6) {
            return ContentDrawScope.super.mo10257toSp0xMU5do(f6);
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m14410toSpkPz2Gy4(ContentDrawScope contentDrawScope, float f6) {
            return ContentDrawScope.super.mo10258toSpkPz2Gy4(f6);
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m14404toDpu2uoSUM(ContentDrawScope contentDrawScope, int i6) {
            return ContentDrawScope.super.mo10252toDpu2uoSUM(i6);
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m14411toSpkPz2Gy4(ContentDrawScope contentDrawScope, int i6) {
            return ContentDrawScope.super.mo10259toSpkPz2Gy4(i6);
        }
    }

    void drawContent();
}
