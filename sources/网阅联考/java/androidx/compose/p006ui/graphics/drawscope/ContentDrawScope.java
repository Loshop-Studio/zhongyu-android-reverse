package androidx.compose.p006ui.graphics.drawscope;

import androidx.compose.p006ui.geometry.Rect;
import androidx.compose.p006ui.graphics.ColorFilter;
import androidx.compose.p006ui.graphics.ImageBitmap;
import androidx.compose.p006ui.unit.AbstractC1702a;
import androidx.compose.p006ui.unit.DpRect;
import androidx.compose.runtime.Stable;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m5174d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0003"}, m5175d2 = {"Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "drawContent", "", "ui-graphics_release"}, m5176k = 1, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public interface ContentDrawScope extends DrawScope {

    @Metadata(m5176k = 3, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class DefaultImpls {
        @Deprecated
        /* renamed from: drawImage-AZ2fEMs, reason: not valid java name */
        public static void m9629drawImageAZ2fEMs(ContentDrawScope contentDrawScope, ImageBitmap image, long j4, long j5, long j6, long j7, float f4, DrawStyle style, ColorFilter colorFilter, int i4, int i5) {
            Intrinsics.checkNotNullParameter(image, "image");
            Intrinsics.checkNotNullParameter(style, "style");
            AbstractC1312b.m439a(contentDrawScope, image, j4, j5, j6, j7, f4, style, colorFilter, i4, i5);
        }

        @Deprecated
        /* renamed from: getCenter-F1C5BW0, reason: not valid java name */
        public static long m9630getCenterF1C5BW0(ContentDrawScope contentDrawScope) {
            return AbstractC1312b.m440b(contentDrawScope);
        }

        @Deprecated
        /* renamed from: getSize-NH-jbRc, reason: not valid java name */
        public static long m9631getSizeNHjbRc(ContentDrawScope contentDrawScope) {
            return AbstractC1312b.m441c(contentDrawScope);
        }

        @Stable
        @Deprecated
        /* renamed from: roundToPx--R2X_6o, reason: not valid java name */
        public static int m9632roundToPxR2X_6o(ContentDrawScope contentDrawScope, long j4) {
            return AbstractC1702a.m906a(contentDrawScope, j4);
        }

        @Stable
        @Deprecated
        /* renamed from: roundToPx-0680j_4, reason: not valid java name */
        public static int m9633roundToPx0680j_4(ContentDrawScope contentDrawScope, float f4) {
            return AbstractC1702a.m907b(contentDrawScope, f4);
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-GaN1DYA, reason: not valid java name */
        public static float m9634toDpGaN1DYA(ContentDrawScope contentDrawScope, long j4) {
            return AbstractC1702a.m908c(contentDrawScope, j4);
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m9635toDpu2uoSUM(ContentDrawScope contentDrawScope, float f4) {
            return AbstractC1702a.m909d(contentDrawScope, f4);
        }

        @Stable
        @Deprecated
        /* renamed from: toDpSize-k-rfVVM, reason: not valid java name */
        public static long m9637toDpSizekrfVVM(ContentDrawScope contentDrawScope, long j4) {
            return AbstractC1702a.m911f(contentDrawScope, j4);
        }

        @Stable
        @Deprecated
        /* renamed from: toPx--R2X_6o, reason: not valid java name */
        public static float m9638toPxR2X_6o(ContentDrawScope contentDrawScope, long j4) {
            return AbstractC1702a.m912g(contentDrawScope, j4);
        }

        @Stable
        @Deprecated
        /* renamed from: toPx-0680j_4, reason: not valid java name */
        public static float m9639toPx0680j_4(ContentDrawScope contentDrawScope, float f4) {
            return AbstractC1702a.m913h(contentDrawScope, f4);
        }

        @Stable
        @Deprecated
        public static Rect toRect(ContentDrawScope contentDrawScope, DpRect receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            return AbstractC1702a.m914i(contentDrawScope, receiver);
        }

        @Stable
        @Deprecated
        /* renamed from: toSize-XkaWNTQ, reason: not valid java name */
        public static long m9640toSizeXkaWNTQ(ContentDrawScope contentDrawScope, long j4) {
            return AbstractC1702a.m915j(contentDrawScope, j4);
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-0xMU5do, reason: not valid java name */
        public static long m9641toSp0xMU5do(ContentDrawScope contentDrawScope, float f4) {
            return AbstractC1702a.m916k(contentDrawScope, f4);
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m9642toSpkPz2Gy4(ContentDrawScope contentDrawScope, float f4) {
            return AbstractC1702a.m917l(contentDrawScope, f4);
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m9636toDpu2uoSUM(ContentDrawScope contentDrawScope, int i4) {
            return AbstractC1702a.m910e(contentDrawScope, i4);
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m9643toSpkPz2Gy4(ContentDrawScope contentDrawScope, int i4) {
            return AbstractC1702a.m918m(contentDrawScope, i4);
        }
    }

    void drawContent();
}
