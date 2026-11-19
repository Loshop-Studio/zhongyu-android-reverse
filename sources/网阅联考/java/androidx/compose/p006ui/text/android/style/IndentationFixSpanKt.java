package androidx.compose.p006ui.text.android.style;

import android.graphics.Paint;
import android.text.Layout;
import androidx.compose.p006ui.text.android.TextLayoutKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m5174d1 = {"\u0000 \n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001e\u0010\u0002\u001a\u00020\u0003*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0000\u001a\u001e\u0010\t\u001a\u00020\u0003*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, m5175d2 = {"EllipsisChar", "", "getEllipsizedLeftPadding", "", "Landroid/text/Layout;", "lineIndex", "", "paint", "Landroid/graphics/Paint;", "getEllipsizedRightPadding", "ui-text_release"}, m5176k = 2, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class IndentationFixSpanKt {
    private static final String EllipsisChar = "…";

    @Metadata(m5176k = 3, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Layout.Alignment.values().length];
            try {
                iArr[Layout.Alignment.ALIGN_CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final float getEllipsizedLeftPadding(Layout layout, int i4, Paint paint) {
        float fAbs;
        float width;
        Intrinsics.checkNotNullParameter(layout, "<this>");
        Intrinsics.checkNotNullParameter(paint, "paint");
        float lineLeft = layout.getLineLeft(i4);
        if (!TextLayoutKt.isLineEllipsized(layout, i4) || layout.getParagraphDirection(i4) != 1 || lineLeft >= 0.0f) {
            return 0.0f;
        }
        float primaryHorizontal = (layout.getPrimaryHorizontal(layout.getLineStart(i4) + layout.getEllipsisStart(i4)) - lineLeft) + paint.measureText(EllipsisChar);
        Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i4);
        if ((paragraphAlignment == null ? -1 : WhenMappings.$EnumSwitchMapping$0[paragraphAlignment.ordinal()]) == 1) {
            fAbs = Math.abs(lineLeft);
            width = (layout.getWidth() - primaryHorizontal) / 2.0f;
        } else {
            fAbs = Math.abs(lineLeft);
            width = layout.getWidth() - primaryHorizontal;
        }
        return fAbs + width;
    }

    public static /* synthetic */ float getEllipsizedLeftPadding$default(Layout layout, int i4, Paint paint, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            paint = layout.getPaint();
            Intrinsics.checkNotNullExpressionValue(paint, "this.paint");
        }
        return getEllipsizedLeftPadding(layout, i4, paint);
    }

    public static final float getEllipsizedRightPadding(Layout layout, int i4, Paint paint) {
        float width;
        float width2;
        Intrinsics.checkNotNullParameter(layout, "<this>");
        Intrinsics.checkNotNullParameter(paint, "paint");
        if (!TextLayoutKt.isLineEllipsized(layout, i4)) {
            return 0.0f;
        }
        if (layout.getParagraphDirection(i4) != -1 || layout.getWidth() >= layout.getLineRight(i4)) {
            return 0.0f;
        }
        float lineRight = (layout.getLineRight(i4) - layout.getPrimaryHorizontal(layout.getLineStart(i4) + layout.getEllipsisStart(i4))) + paint.measureText(EllipsisChar);
        Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i4);
        if ((paragraphAlignment != null ? WhenMappings.$EnumSwitchMapping$0[paragraphAlignment.ordinal()] : -1) == 1) {
            width = layout.getWidth() - layout.getLineRight(i4);
            width2 = (layout.getWidth() - lineRight) / 2.0f;
        } else {
            width = layout.getWidth() - layout.getLineRight(i4);
            width2 = layout.getWidth() - lineRight;
        }
        return width - width2;
    }

    public static /* synthetic */ float getEllipsizedRightPadding$default(Layout layout, int i4, Paint paint, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            paint = layout.getPaint();
            Intrinsics.checkNotNullExpressionValue(paint, "this.paint");
        }
        return getEllipsizedRightPadding(layout, i4, paint);
    }
}
