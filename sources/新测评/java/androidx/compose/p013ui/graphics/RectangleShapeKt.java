package androidx.compose.p013ui.graphics;

import androidx.compose.p013ui.geometry.SizeKt;
import androidx.compose.p013ui.graphics.Outline;
import androidx.compose.p013ui.unit.Density;
import androidx.compose.p013ui.unit.LayoutDirection;
import androidx.compose.runtime.Stable;
import kotlin.Metadata;

@Metadata(m13557d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\"\u001c\u0010\u0000\u001a\u00020\u00018\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m13558d2 = {"RectangleShape", "Landroidx/compose/ui/graphics/Shape;", "getRectangleShape$annotations", "()V", "getRectangleShape", "()Landroidx/compose/ui/graphics/Shape;", "ui-graphics_release"}, m13559k = 2, m13560mv = {1, 9, 0}, m13562xi = 48)
/* loaded from: classes2.dex */
public final class RectangleShapeKt {
    private static final Shape RectangleShape = new Shape() { // from class: androidx.compose.ui.graphics.RectangleShapeKt$RectangleShape$1
        public String toString() {
            return "RectangleShape";
        }

        @Override // androidx.compose.p013ui.graphics.Shape
        /* renamed from: createOutline-Pq9zytI */
        public Outline.Rectangle mo17246createOutlinePq9zytI(long size, LayoutDirection layoutDirection, Density density) {
            return new Outline.Rectangle(SizeKt.m20825toRectuvyYCjk(size));
        }
    };

    public static final Shape getRectangleShape() {
        return RectangleShape;
    }

    @Stable
    public static /* synthetic */ void getRectangleShape$annotations() {
    }
}
