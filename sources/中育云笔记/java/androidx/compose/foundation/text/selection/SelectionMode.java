package androidx.compose.foundation.text.selection;

import androidx.compose.p014ui.geometry.Rect;
import kotlin.enums.AbstractC9953a;
import kotlin.jvm.internal.AbstractC9972n;
import p425yc.InterfaceC11943a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public abstract class SelectionMode {
    private static final /* synthetic */ InterfaceC11943a $ENTRIES;
    private static final /* synthetic */ SelectionMode[] $VALUES;
    public static final SelectionMode Vertical = new SelectionMode("Vertical", 0) { // from class: androidx.compose.foundation.text.selection.SelectionMode.Vertical
        {
            AbstractC9972n abstractC9972n = null;
        }

        @Override // androidx.compose.foundation.text.selection.SelectionMode
        /* renamed from: compare-3MmeM6k$foundation_release */
        public int mo28276compare3MmeM6k$foundation_release(long j10, Rect rect) {
            if (SelectionManagerKt.m28267containsInclusiveUv8p0NA(rect, j10)) {
                return 0;
            }
            int i10 = (int) (4294967295L & j10);
            if (Float.intBitsToFloat(i10) < rect.getTop()) {
                return -1;
            }
            return (Float.intBitsToFloat((int) (j10 >> 32)) >= rect.getLeft() || Float.intBitsToFloat(i10) >= rect.getBottom()) ? 1 : -1;
        }
    };
    public static final SelectionMode Horizontal = new SelectionMode("Horizontal", 1) { // from class: androidx.compose.foundation.text.selection.SelectionMode.Horizontal
        {
            AbstractC9972n abstractC9972n = null;
        }

        @Override // androidx.compose.foundation.text.selection.SelectionMode
        /* renamed from: compare-3MmeM6k$foundation_release */
        public int mo28276compare3MmeM6k$foundation_release(long j10, Rect rect) {
            if (SelectionManagerKt.m28267containsInclusiveUv8p0NA(rect, j10)) {
                return 0;
            }
            int i10 = (int) (j10 >> 32);
            if (Float.intBitsToFloat(i10) < rect.getLeft()) {
                return -1;
            }
            return (Float.intBitsToFloat((int) (j10 & 4294967295L)) >= rect.getTop() || Float.intBitsToFloat(i10) >= rect.getRight()) ? 1 : -1;
        }
    };

    private static final /* synthetic */ SelectionMode[] $values() {
        return new SelectionMode[]{Vertical, Horizontal};
    }

    static {
        SelectionMode[] selectionModeArr$values = $values();
        $VALUES = selectionModeArr$values;
        $ENTRIES = AbstractC9953a.m20230a(selectionModeArr$values);
    }

    public /* synthetic */ SelectionMode(String str, int i10, AbstractC9972n abstractC9972n) {
        this(str, i10);
    }

    /* renamed from: containsInclusive-Uv8p0NA, reason: not valid java name */
    private final boolean m28275containsInclusiveUv8p0NA(Rect rect, long j10) {
        float left = rect.getLeft();
        float right = rect.getRight();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32));
        if (left > fIntBitsToFloat || fIntBitsToFloat > right) {
            return false;
        }
        float top2 = rect.getTop();
        float bottom = rect.getBottom();
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j10 & 4294967295L));
        return top2 <= fIntBitsToFloat2 && fIntBitsToFloat2 <= bottom;
    }

    public static InterfaceC11943a getEntries() {
        return $ENTRIES;
    }

    public static SelectionMode valueOf(String str) {
        return (SelectionMode) Enum.valueOf(SelectionMode.class, str);
    }

    public static SelectionMode[] values() {
        return (SelectionMode[]) $VALUES.clone();
    }

    /* renamed from: compare-3MmeM6k$foundation_release, reason: not valid java name */
    public abstract int mo28276compare3MmeM6k$foundation_release(long j10, Rect rect);

    /* renamed from: isSelected-2x9bVx0$foundation_release, reason: not valid java name */
    public final boolean m28277isSelected2x9bVx0$foundation_release(Rect rect, long j10, long j11) {
        if (m28275containsInclusiveUv8p0NA(rect, j10) || m28275containsInclusiveUv8p0NA(rect, j11)) {
            return true;
        }
        return (mo28276compare3MmeM6k$foundation_release(j10, rect) > 0) ^ (mo28276compare3MmeM6k$foundation_release(j11, rect) > 0);
    }

    private SelectionMode(String str, int i10) {
    }
}
