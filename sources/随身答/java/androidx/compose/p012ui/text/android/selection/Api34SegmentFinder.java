package androidx.compose.p012ui.text.android.selection;

import android.text.SegmentFinder;
import androidx.annotation.RequiresApi;
import androidx.compose.p012ui.text.android.AbstractC3042a;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;

@StabilityInferred(parameters = 1)
@RequiresApi(34)
@Metadata(m13412d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÁ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0011\u0010\u0003\u001a\u00020\u0004*\u00020\u0005H\u0000¢\u0006\u0002\b\u0006¨\u0006\u0007"}, m13413d2 = {"Landroidx/compose/ui/text/android/selection/Api34SegmentFinder;", "", "()V", "toAndroidSegmentFinder", "Landroid/text/SegmentFinder;", "Landroidx/compose/ui/text/android/selection/SegmentFinder;", "toAndroidSegmentFinder$ui_text_release", "ui-text_release"}, m13414k = 1, m13415mv = {1, 9, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final class Api34SegmentFinder {
    public static final int $stable = 0;
    public static final Api34SegmentFinder INSTANCE = new Api34SegmentFinder();

    private Api34SegmentFinder() {
    }

    public final SegmentFinder toAndroidSegmentFinder$ui_text_release(final SegmentFinder segmentFinder) {
        return AbstractC3042a.m1268a(new SegmentFinder() { // from class: androidx.compose.ui.text.android.selection.Api34SegmentFinder$toAndroidSegmentFinder$1
            public int nextEndBoundary(int offset) {
                return segmentFinder.nextEndBoundary(offset);
            }

            public int nextStartBoundary(int offset) {
                return segmentFinder.nextStartBoundary(offset);
            }

            public int previousEndBoundary(int offset) {
                return segmentFinder.previousEndBoundary(offset);
            }

            public int previousStartBoundary(int offset) {
                return segmentFinder.previousStartBoundary(offset);
            }
        });
    }
}
