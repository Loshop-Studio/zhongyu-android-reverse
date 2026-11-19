package androidx.compose.p014ui.text.android.selection;

import android.text.SegmentFinder;
import androidx.annotation.RequiresApi;
import androidx.compose.p014ui.text.android.AbstractC3113a;
import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred(parameters = 1)
@RequiresApi(34)
/* loaded from: classes2.dex */
public final class Api34SegmentFinder {
    public static final int $stable = 0;
    public static final Api34SegmentFinder INSTANCE = new Api34SegmentFinder();

    private Api34SegmentFinder() {
    }

    public final SegmentFinder toAndroidSegmentFinder$ui_text_release(final SegmentFinder segmentFinder) {
        return AbstractC3113a.m1340a(new SegmentFinder() { // from class: androidx.compose.ui.text.android.selection.Api34SegmentFinder$toAndroidSegmentFinder$1
            public int nextEndBoundary(int i10) {
                return segmentFinder.nextEndBoundary(i10);
            }

            public int nextStartBoundary(int i10) {
                return segmentFinder.nextStartBoundary(i10);
            }

            public int previousEndBoundary(int i10) {
                return segmentFinder.previousEndBoundary(i10);
            }

            public int previousStartBoundary(int i10) {
                return segmentFinder.previousStartBoundary(i10);
            }
        });
    }
}
