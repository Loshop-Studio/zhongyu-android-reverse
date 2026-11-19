package androidx.compose.p014ui.text.android;

import android.graphics.RectF;
import android.text.Layout;
import android.text.SegmentFinder;
import androidx.annotation.RequiresApi;
import androidx.compose.p014ui.text.android.selection.Api34SegmentFinder;
import androidx.compose.p014ui.text.android.selection.WordSegmentFinder;
import androidx.compose.runtime.internal.StabilityInferred;
import p181hd.InterfaceC9544p;

@StabilityInferred(parameters = 1)
@RequiresApi(34)
/* loaded from: classes2.dex */
public final class AndroidLayoutApi34 {
    public static final int $stable = 0;
    public static final AndroidLayoutApi34 INSTANCE = new AndroidLayoutApi34();

    private AndroidLayoutApi34() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getRangeForRect$lambda$0(InterfaceC9544p interfaceC9544p, RectF rectF, RectF rectF2) {
        return ((Boolean) interfaceC9544p.invoke(rectF, rectF2)).booleanValue();
    }

    public final int[] getRangeForRect$ui_text_release(TextLayout textLayout, RectF rectF, int i10, final InterfaceC9544p interfaceC9544p) {
        SegmentFinder segmentFinderM1340a;
        if (i10 == 1) {
            segmentFinderM1340a = Api34SegmentFinder.INSTANCE.toAndroidSegmentFinder$ui_text_release(new WordSegmentFinder(textLayout.getText(), textLayout.getWordIterator()));
        } else {
            AbstractC3119d.m1346a();
            segmentFinderM1340a = AbstractC3113a.m1340a(AbstractC3117c.m1344a(textLayout.getText(), textLayout.getTextPaint()));
        }
        return textLayout.getLayout().getRangeForRect(rectF, segmentFinderM1340a, new Layout.TextInclusionStrategy() { // from class: androidx.compose.ui.text.android.e
            @Override // android.text.Layout.TextInclusionStrategy
            public final boolean isSegmentInside(RectF rectF2, RectF rectF3) {
                return AndroidLayoutApi34.getRangeForRect$lambda$0(interfaceC9544p, rectF2, rectF3);
            }
        });
    }
}
