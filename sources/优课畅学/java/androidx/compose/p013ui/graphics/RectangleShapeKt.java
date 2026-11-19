package androidx.compose.p013ui.graphics;

import androidx.compose.p013ui.geometry.SizeKt;
import androidx.compose.p013ui.graphics.Outline;
import androidx.compose.p013ui.unit.Density;
import androidx.compose.p013ui.unit.LayoutDirection;
import androidx.compose.runtime.Stable;

/* loaded from: classes2.dex */
public final class RectangleShapeKt {
    private static final Shape RectangleShape = new Shape() { // from class: androidx.compose.ui.graphics.RectangleShapeKt$RectangleShape$1
        public String toString() {
            return "RectangleShape";
        }

        @Override // androidx.compose.p013ui.graphics.Shape
        /* renamed from: createOutline-Pq9zytI */
        public Outline.Rectangle mo20407createOutlinePq9zytI(long j10, LayoutDirection layoutDirection, Density density) {
            return new Outline.Rectangle(SizeKt.m24125toRectuvyYCjk(j10));
        }
    };

    public static final Shape getRectangleShape() {
        return RectangleShape;
    }

    @Stable
    public static /* synthetic */ void getRectangleShape$annotations() {
    }
}
