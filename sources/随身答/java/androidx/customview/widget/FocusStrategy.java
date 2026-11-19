package androidx.customview.widget;

import android.graphics.Rect;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* loaded from: classes2.dex */
class FocusStrategy {

    public interface BoundsAdapter<T> {
        void obtainBounds(T t9, Rect rect);
    }

    public interface CollectionAdapter<T, V> {
        V get(T t9, int i9);

        int size(T t9);
    }

    public static class SequentialComparator<T> implements Comparator<T> {
        private final BoundsAdapter<T> mAdapter;
        private final boolean mIsLayoutRtl;
        private final Rect mTemp1 = new Rect();
        private final Rect mTemp2 = new Rect();

        public SequentialComparator(boolean z9, BoundsAdapter<T> boundsAdapter) {
            this.mIsLayoutRtl = z9;
            this.mAdapter = boundsAdapter;
        }

        @Override // java.util.Comparator
        public int compare(T t9, T t10) {
            Rect rect = this.mTemp1;
            Rect rect2 = this.mTemp2;
            this.mAdapter.obtainBounds(t9, rect);
            this.mAdapter.obtainBounds(t10, rect2);
            int i9 = rect.top;
            int i10 = rect2.top;
            if (i9 < i10) {
                return -1;
            }
            if (i9 > i10) {
                return 1;
            }
            int i11 = rect.left;
            int i12 = rect2.left;
            if (i11 < i12) {
                return this.mIsLayoutRtl ? 1 : -1;
            }
            if (i11 > i12) {
                return this.mIsLayoutRtl ? -1 : 1;
            }
            int i13 = rect.bottom;
            int i14 = rect2.bottom;
            if (i13 < i14) {
                return -1;
            }
            if (i13 > i14) {
                return 1;
            }
            int i15 = rect.right;
            int i16 = rect2.right;
            if (i15 < i16) {
                return this.mIsLayoutRtl ? 1 : -1;
            }
            if (i15 > i16) {
                return this.mIsLayoutRtl ? -1 : 1;
            }
            return 0;
        }
    }

    private FocusStrategy() {
    }

    private static boolean beamBeats(int i9, @NonNull Rect rect, @NonNull Rect rect2, @NonNull Rect rect3) {
        boolean zBeamsOverlap = beamsOverlap(i9, rect, rect2);
        if (beamsOverlap(i9, rect, rect3) || !zBeamsOverlap) {
            return false;
        }
        return !isToDirectionOf(i9, rect, rect3) || i9 == 17 || i9 == 66 || majorAxisDistance(i9, rect, rect2) < majorAxisDistanceToFarEdge(i9, rect, rect3);
    }

    private static boolean beamsOverlap(int i9, @NonNull Rect rect, @NonNull Rect rect2) {
        if (i9 != 17) {
            if (i9 != 33) {
                if (i9 != 66) {
                    if (i9 != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return rect2.right >= rect.left && rect2.left <= rect.right;
        }
        return rect2.bottom >= rect.top && rect2.top <= rect.bottom;
    }

    public static <L, T> T findNextFocusInAbsoluteDirection(@NonNull L l9, @NonNull CollectionAdapter<L, T> collectionAdapter, @NonNull BoundsAdapter<T> boundsAdapter, @Nullable T t9, @NonNull Rect rect, int i9) {
        Rect rect2 = new Rect(rect);
        if (i9 == 17) {
            rect2.offset(rect.width() + 1, 0);
        } else if (i9 == 33) {
            rect2.offset(0, rect.height() + 1);
        } else if (i9 == 66) {
            rect2.offset(-(rect.width() + 1), 0);
        } else {
            if (i9 != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            rect2.offset(0, -(rect.height() + 1));
        }
        int size = collectionAdapter.size(l9);
        Rect rect3 = new Rect();
        T t10 = null;
        for (int i10 = 0; i10 < size; i10++) {
            T t11 = collectionAdapter.get(l9, i10);
            if (t11 != t9) {
                boundsAdapter.obtainBounds(t11, rect3);
                if (isBetterCandidate(i9, rect, rect3, rect2)) {
                    rect2.set(rect3);
                    t10 = t11;
                }
            }
        }
        return t10;
    }

    public static <L, T> T findNextFocusInRelativeDirection(@NonNull L l9, @NonNull CollectionAdapter<L, T> collectionAdapter, @NonNull BoundsAdapter<T> boundsAdapter, @Nullable T t9, int i9, boolean z9, boolean z10) {
        int size = collectionAdapter.size(l9);
        ArrayList arrayList = new ArrayList(size);
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(collectionAdapter.get(l9, i10));
        }
        Collections.sort(arrayList, new SequentialComparator(z9, boundsAdapter));
        if (i9 == 1) {
            return (T) getPreviousFocusable(t9, arrayList, z10);
        }
        if (i9 == 2) {
            return (T) getNextFocusable(t9, arrayList, z10);
        }
        throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}.");
    }

    private static <T> T getNextFocusable(T t9, ArrayList<T> arrayList, boolean z9) {
        int size = arrayList.size();
        int iLastIndexOf = (t9 == null ? -1 : arrayList.lastIndexOf(t9)) + 1;
        if (iLastIndexOf < size) {
            return arrayList.get(iLastIndexOf);
        }
        if (!z9 || size <= 0) {
            return null;
        }
        return arrayList.get(0);
    }

    private static <T> T getPreviousFocusable(T t9, ArrayList<T> arrayList, boolean z9) {
        int size = arrayList.size();
        int iIndexOf = (t9 == null ? size : arrayList.indexOf(t9)) - 1;
        if (iIndexOf >= 0) {
            return arrayList.get(iIndexOf);
        }
        if (!z9 || size <= 0) {
            return null;
        }
        return arrayList.get(size - 1);
    }

    private static int getWeightedDistanceFor(int i9, int i10) {
        return (i9 * 13 * i9) + (i10 * i10);
    }

    private static boolean isBetterCandidate(int i9, @NonNull Rect rect, @NonNull Rect rect2, @NonNull Rect rect3) {
        if (!isCandidate(rect, rect2, i9)) {
            return false;
        }
        if (isCandidate(rect, rect3, i9) && !beamBeats(i9, rect, rect2, rect3)) {
            return !beamBeats(i9, rect, rect3, rect2) && getWeightedDistanceFor(majorAxisDistance(i9, rect, rect2), minorAxisDistance(i9, rect, rect2)) < getWeightedDistanceFor(majorAxisDistance(i9, rect, rect3), minorAxisDistance(i9, rect, rect3));
        }
        return true;
    }

    private static boolean isCandidate(@NonNull Rect rect, @NonNull Rect rect2, int i9) {
        if (i9 == 17) {
            int i10 = rect.right;
            int i11 = rect2.right;
            return (i10 > i11 || rect.left >= i11) && rect.left > rect2.left;
        }
        if (i9 == 33) {
            int i12 = rect.bottom;
            int i13 = rect2.bottom;
            return (i12 > i13 || rect.top >= i13) && rect.top > rect2.top;
        }
        if (i9 == 66) {
            int i14 = rect.left;
            int i15 = rect2.left;
            return (i14 < i15 || rect.right <= i15) && rect.right < rect2.right;
        }
        if (i9 != 130) {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        int i16 = rect.top;
        int i17 = rect2.top;
        return (i16 < i17 || rect.bottom <= i17) && rect.bottom < rect2.bottom;
    }

    private static boolean isToDirectionOf(int i9, @NonNull Rect rect, @NonNull Rect rect2) {
        if (i9 == 17) {
            return rect.left >= rect2.right;
        }
        if (i9 == 33) {
            return rect.top >= rect2.bottom;
        }
        if (i9 == 66) {
            return rect.right <= rect2.left;
        }
        if (i9 == 130) {
            return rect.bottom <= rect2.top;
        }
        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
    }

    private static int majorAxisDistance(int i9, @NonNull Rect rect, @NonNull Rect rect2) {
        return Math.max(0, majorAxisDistanceRaw(i9, rect, rect2));
    }

    private static int majorAxisDistanceRaw(int i9, @NonNull Rect rect, @NonNull Rect rect2) {
        int i10;
        int i11;
        if (i9 == 17) {
            i10 = rect.left;
            i11 = rect2.right;
        } else if (i9 == 33) {
            i10 = rect.top;
            i11 = rect2.bottom;
        } else if (i9 == 66) {
            i10 = rect2.left;
            i11 = rect.right;
        } else {
            if (i9 != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            i10 = rect2.top;
            i11 = rect.bottom;
        }
        return i10 - i11;
    }

    private static int majorAxisDistanceToFarEdge(int i9, @NonNull Rect rect, @NonNull Rect rect2) {
        return Math.max(1, majorAxisDistanceToFarEdgeRaw(i9, rect, rect2));
    }

    private static int majorAxisDistanceToFarEdgeRaw(int i9, @NonNull Rect rect, @NonNull Rect rect2) {
        int i10;
        int i11;
        if (i9 == 17) {
            i10 = rect.left;
            i11 = rect2.left;
        } else if (i9 == 33) {
            i10 = rect.top;
            i11 = rect2.top;
        } else if (i9 == 66) {
            i10 = rect2.right;
            i11 = rect.right;
        } else {
            if (i9 != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            i10 = rect2.bottom;
            i11 = rect.bottom;
        }
        return i10 - i11;
    }

    private static int minorAxisDistance(int i9, @NonNull Rect rect, @NonNull Rect rect2) {
        if (i9 != 17) {
            if (i9 != 33) {
                if (i9 != 66) {
                    if (i9 != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return Math.abs((rect.left + (rect.width() / 2)) - (rect2.left + (rect2.width() / 2)));
        }
        return Math.abs((rect.top + (rect.height() / 2)) - (rect2.top + (rect2.height() / 2)));
    }
}
