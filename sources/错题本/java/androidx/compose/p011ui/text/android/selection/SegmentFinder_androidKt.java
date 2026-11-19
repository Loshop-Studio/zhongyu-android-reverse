package androidx.compose.p011ui.text.android.selection;

import android.os.Build;
import android.text.TextPaint;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(m5109d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0000¨\u0006\u0006"}, m5110d2 = {"createGraphemeClusterSegmentFinder", "Landroidx/compose/ui/text/android/selection/SegmentFinder;", "text", "", "textPaint", "Landroid/text/TextPaint;", "ui-text_release"}, m5111k = 2, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final class SegmentFinder_androidKt {
    @NotNull
    public static final SegmentFinder createGraphemeClusterSegmentFinder(@NotNull CharSequence charSequence, @NotNull TextPaint textPaint) {
        return Build.VERSION.SDK_INT >= 29 ? new GraphemeClusterSegmentFinderApi29(charSequence, textPaint) : new GraphemeClusterSegmentFinderUnderApi29(charSequence);
    }
}
