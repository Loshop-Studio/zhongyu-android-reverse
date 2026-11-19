package androidx.compose.p011ui.text.android;

import android.graphics.RectF;
import android.text.Layout;
import android.text.SegmentFinder;
import androidx.annotation.RequiresApi;
import androidx.compose.foundation.text.input.internal.AbstractC1376e;
import androidx.compose.p011ui.text.android.selection.Api34SegmentFinder;
import androidx.compose.p011ui.text.android.selection.WordSegmentFinder;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p152r6.InterfaceC6473e;

@StabilityInferred(parameters = 1)
@RequiresApi(34)
@Metadata(m5109d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JC\u0010\u0010\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0018\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000b0\nH\u0000¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, m5110d2 = {"Landroidx/compose/ui/text/android/AndroidLayoutApi34;", "", "<init>", "()V", "Landroidx/compose/ui/text/android/TextLayout;", "layout", "Landroid/graphics/RectF;", "rectF", "", "granularity", "Lkotlin/Function2;", "", "inclusionStrategy", "", "getRangeForRect$ui_text_release", "(Landroidx/compose/ui/text/android/TextLayout;Landroid/graphics/RectF;ILr6/e;)[I", "getRangeForRect", "ui-text_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final class AndroidLayoutApi34 {
    public static final int $stable = 0;

    @NotNull
    public static final AndroidLayoutApi34 INSTANCE = new AndroidLayoutApi34();

    private AndroidLayoutApi34() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getRangeForRect$lambda$0(InterfaceC6473e interfaceC6473e, RectF rectF, RectF rectF2) {
        return ((Boolean) interfaceC6473e.invoke(rectF, rectF2)).booleanValue();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.compose.ui.text.android.a] */
    @Nullable
    public final int[] getRangeForRect$ui_text_release(@NotNull TextLayout layout, @NotNull RectF rectF, int granularity, @NotNull final InterfaceC6473e inclusionStrategy) {
        SegmentFinder segmentFinderM998k;
        if (granularity == 1) {
            segmentFinderM998k = Api34SegmentFinder.INSTANCE.toAndroidSegmentFinder$ui_text_release(new WordSegmentFinder(layout.getText(), layout.getWordIterator()));
        } else {
            AbstractC1376e.m1005r();
            segmentFinderM998k = AbstractC1376e.m998k(AbstractC1376e.m997j(layout.getText(), layout.getTextPaint()));
        }
        return layout.getLayout().getRangeForRect(rectF, segmentFinderM998k, new Layout.TextInclusionStrategy() { // from class: androidx.compose.ui.text.android.a
            @Override // android.text.Layout.TextInclusionStrategy
            public final boolean isSegmentInside(RectF rectF2, RectF rectF3) {
                return AndroidLayoutApi34.getRangeForRect$lambda$0(inclusionStrategy, rectF2, rectF3);
            }
        });
    }
}
