package androidx.compose.p014ui.text.android;

import android.text.BoringLayout;
import android.text.Layout;
import android.text.TextPaint;
import androidx.compose.runtime.internal.StabilityInferred;
import java.text.BreakIterator;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;
import kotlin.Pair;
import kotlin.jvm.internal.AbstractC9979u;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class LayoutIntrinsics {
    public static final int $stable = 8;
    private BoringLayout.Metrics _boringMetrics;
    private CharSequence _charSequenceForIntrinsicWidth;
    private float _maxIntrinsicWidth = Float.NaN;
    private float _minIntrinsicWidth = Float.NaN;
    private boolean boringMetricsIsInit;
    private final CharSequence charSequence;
    private final int textDirectionHeuristic;
    private final TextPaint textPaint;

    public LayoutIntrinsics(CharSequence charSequence, TextPaint textPaint, int i10) {
        this.charSequence = charSequence;
        this.textPaint = textPaint;
        this.textDirectionHeuristic = i10;
    }

    private final float computeMaxIntrinsicWidth() {
        BoringLayout.Metrics boringMetrics = getBoringMetrics();
        float fCeil = boringMetrics != null ? boringMetrics.width : -1;
        if (fCeil < 0.0f) {
            fCeil = (float) Math.ceil(getDesiredWidth$default(this, 0, 0, 3, null));
        }
        return LayoutIntrinsics_androidKt.shouldIncreaseMaxIntrinsic(fCeil, this.charSequence, this.textPaint) ? fCeil + 0.5f : fCeil;
    }

    private final float computeMinIntrinsicWidth() {
        BreakIterator lineInstance = BreakIterator.getLineInstance(this.textPaint.getTextLocale());
        CharSequence charSequence = this.charSequence;
        int i10 = 0;
        lineInstance.setText(new CharSequenceCharacterIterator(charSequence, 0, charSequence.length()));
        PriorityQueue priorityQueue = new PriorityQueue(10, new Comparator() { // from class: androidx.compose.ui.text.android.z
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return LayoutIntrinsics.computeMinIntrinsicWidth$lambda$1((Pair) obj, (Pair) obj2);
            }
        });
        int next = lineInstance.next();
        while (true) {
            int i11 = i10;
            i10 = next;
            if (i10 == -1) {
                break;
            }
            if (priorityQueue.size() < 10) {
                priorityQueue.add(new Pair(Integer.valueOf(i11), Integer.valueOf(i10)));
            } else {
                Pair pair = (Pair) priorityQueue.peek();
                if (pair != null && ((Number) pair.m20052g()).intValue() - ((Number) pair.m20051f()).intValue() < i10 - i11) {
                    priorityQueue.poll();
                    priorityQueue.add(new Pair(Integer.valueOf(i11), Integer.valueOf(i10)));
                }
            }
            next = lineInstance.next();
        }
        if (priorityQueue.isEmpty()) {
            return 0.0f;
        }
        Iterator it = priorityQueue.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Pair pair2 = (Pair) it.next();
        float desiredWidth = getDesiredWidth(((Number) pair2.m20048a()).intValue(), ((Number) pair2.m20049c()).intValue());
        while (it.hasNext()) {
            Pair pair3 = (Pair) it.next();
            desiredWidth = Math.max(desiredWidth, getDesiredWidth(((Number) pair3.m20048a()).intValue(), ((Number) pair3.m20049c()).intValue()));
        }
        return desiredWidth;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int computeMinIntrinsicWidth$lambda$1(Pair pair, Pair pair2) {
        return (((Number) pair.m20052g()).intValue() - ((Number) pair.m20051f()).intValue()) - (((Number) pair2.m20052g()).intValue() - ((Number) pair2.m20051f()).intValue());
    }

    private final CharSequence getCharSequenceForIntrinsicWidth() {
        CharSequence charSequence = this._charSequenceForIntrinsicWidth;
        if (charSequence != null) {
            AbstractC9979u.m20291d(charSequence);
            return charSequence;
        }
        if (!LayoutIntrinsics_androidKt.stripNonMetricAffectingCharSpans) {
            return this.charSequence;
        }
        CharSequence charSequenceStripNonMetricAffectingCharacterStyleSpans = LayoutIntrinsics_androidKt.stripNonMetricAffectingCharacterStyleSpans(this.charSequence);
        this._charSequenceForIntrinsicWidth = charSequenceStripNonMetricAffectingCharacterStyleSpans;
        return charSequenceStripNonMetricAffectingCharacterStyleSpans;
    }

    private final float getDesiredWidth(int i10, int i11) {
        return Layout.getDesiredWidth(getCharSequenceForIntrinsicWidth(), i10, i11, this.textPaint);
    }

    public static /* synthetic */ float getDesiredWidth$default(LayoutIntrinsics layoutIntrinsics, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = layoutIntrinsics.getCharSequenceForIntrinsicWidth().length();
        }
        return layoutIntrinsics.getDesiredWidth(i10, i11);
    }

    public final BoringLayout.Metrics getBoringMetrics() {
        if (!this.boringMetricsIsInit) {
            this._boringMetrics = BoringLayoutFactory.INSTANCE.measure(this.charSequence, this.textPaint, TextLayout_androidKt.getTextDirectionHeuristic(this.textDirectionHeuristic));
            this.boringMetricsIsInit = true;
        }
        return this._boringMetrics;
    }

    public final float getMaxIntrinsicWidth() {
        if (!Float.isNaN(this._maxIntrinsicWidth)) {
            return this._maxIntrinsicWidth;
        }
        float fComputeMaxIntrinsicWidth = computeMaxIntrinsicWidth();
        this._maxIntrinsicWidth = fComputeMaxIntrinsicWidth;
        return fComputeMaxIntrinsicWidth;
    }

    public final float getMinIntrinsicWidth() {
        if (!Float.isNaN(this._minIntrinsicWidth)) {
            return this._minIntrinsicWidth;
        }
        float fComputeMinIntrinsicWidth = computeMinIntrinsicWidth();
        this._minIntrinsicWidth = fComputeMinIntrinsicWidth;
        return fComputeMinIntrinsicWidth;
    }
}
