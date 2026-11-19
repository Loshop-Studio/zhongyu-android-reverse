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
        void obtainBounds(T t6, Rect rect);
    }

    public interface CollectionAdapter<T, V> {
        V get(T t6, int i6);

        int size(T t6);
    }

    public static class SequentialComparator<T> implements Comparator<T> {
        private final BoundsAdapter<T> mAdapter;
        private final boolean mIsLayoutRtl;
        private final Rect mTemp1 = new Rect();
        private final Rect mTemp2 = new Rect();

        public SequentialComparator(boolean z6, BoundsAdapter<T> boundsAdapter) {
            this.mIsLayoutRtl = z6;
            this.mAdapter = boundsAdapter;
        }

        @Override // java.util.Comparator
        public int compare(T t6, T t7) {
            Rect rect = this.mTemp1;
            Rect rect2 = this.mTemp2;
            this.mAdapter.obtainBounds(t6, rect);
            this.mAdapter.obtainBounds(t7, rect2);
            int i6 = rect.top;
            int i7 = rect2.top;
            if (i6 < i7) {
                return -1;
            }
            if (i6 > i7) {
                return 1;
            }
            int i8 = rect.left;
            int i9 = rect2.left;
            if (i8 < i9) {
                return this.mIsLayoutRtl ? 1 : -1;
            }
            if (i8 > i9) {
                return this.mIsLayoutRtl ? -1 : 1;
            }
            int i10 = rect.bottom;
            int i11 = rect2.bottom;
            if (i10 < i11) {
                return -1;
            }
            if (i10 > i11) {
                return 1;
            }
            int i12 = rect.right;
            int i13 = rect2.right;
            if (i12 < i13) {
                return this.mIsLayoutRtl ? 1 : -1;
            }
            if (i12 > i13) {
                return this.mIsLayoutRtl ? -1 : 1;
            }
            return 0;
        }
    }

    private FocusStrategy() {
    }

    private static boolean beamBeats(int i6, @NonNull Rect rect, @NonNull Rect rect2, @NonNull Rect rect3) {
        boolean zBeamsOverlap = beamsOverlap(i6, rect, rect2);
        if (beamsOverlap(i6, rect, rect3) || !zBeamsOverlap) {
            return false;
        }
        return !isToDirectionOf(i6, rect, rect3) || i6 == 17 || i6 == 66 || majorAxisDistance(i6, rect, rect2) < majorAxisDistanceToFarEdge(i6, rect, rect3);
    }

    private static boolean beamsOverlap(int i6, @NonNull Rect rect, @NonNull Rect rect2) {
        if (i6 != 17) {
            if (i6 != 33) {
                if (i6 != 66) {
                    if (i6 != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return rect2.right >= rect.left && rect2.left <= rect.right;
        }
        return rect2.bottom >= rect.top && rect2.top <= rect.bottom;
    }

    public static <L, T> T findNextFocusInAbsoluteDirection(@NonNull L l6, @NonNull CollectionAdapter<L, T> collectionAdapter, @NonNull BoundsAdapter<T> boundsAdapter, @Nullable T t6, @NonNull Rect rect, int i6) {
        Rect rect2 = new Rect(rect);
        if (i6 == 17) {
            rect2.offset(rect.width() + 1, 0);
        } else if (i6 == 33) {
            rect2.offset(0, rect.height() + 1);
        } else if (i6 == 66) {
            rect2.offset(-(rect.width() + 1), 0);
        } else {
            if (i6 != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            rect2.offset(0, -(rect.height() + 1));
        }
        int size = collectionAdapter.size(l6);
        Rect rect3 = new Rect();
        T t7 = null;
        for (int i7 = 0; i7 < size; i7++) {
            T t8 = collectionAdapter.get(l6, i7);
            if (t8 != t6) {
                boundsAdapter.obtainBounds(t8, rect3);
                if (isBetterCandidate(i6, rect, rect3, rect2)) {
                    rect2.set(rect3);
                    t7 = t8;
                }
            }
        }
        return t7;
    }

    public static <L, T> T findNextFocusInRelativeDirection(@NonNull L l6, @NonNull CollectionAdapter<L, T> collectionAdapter, @NonNull BoundsAdapter<T> boundsAdapter, @Nullable T t6, int i6, boolean z6, boolean z7) {
        int size = collectionAdapter.size(l6);
        ArrayList arrayList = new ArrayList(size);
        for (int i7 = 0; i7 < size; i7++) {
            arrayList.add(collectionAdapter.get(l6, i7));
        }
        Collections.sort(arrayList, new SequentialComparator(z6, boundsAdapter));
        if (i6 == 1) {
            return (T) getPreviousFocusable(t6, arrayList, z7);
        }
        if (i6 == 2) {
            return (T) getNextFocusable(t6, arrayList, z7);
        }
        throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}.");
    }

    private static <T> T getNextFocusable(T t6, ArrayList<T> arrayList, boolean z6) {
        int size = arrayList.size();
        int iLastIndexOf = (t6 == null ? -1 : arrayList.lastIndexOf(t6)) + 1;
        if (iLastIndexOf < size) {
            return arrayList.get(iLastIndexOf);
        }
        if (!z6 || size <= 0) {
            return null;
        }
        return arrayList.get(0);
    }

    private static <T> T getPreviousFocusable(T t6, ArrayList<T> arrayList, boolean z6) {
        int size = arrayList.size();
        int iIndexOf = (t6 == null ? size : arrayList.indexOf(t6)) - 1;
        if (iIndexOf >= 0) {
            return arrayList.get(iIndexOf);
        }
        if (!z6 || size <= 0) {
            return null;
        }
        return arrayList.get(size - 1);
    }

    private static int getWeightedDistanceFor(int i6, int i7) {
        return (i6 * 13 * i6) + (i7 * i7);
    }

    private static boolean isBetterCandidate(int i6, @NonNull Rect rect, @NonNull Rect rect2, @NonNull Rect rect3) {
        if (!isCandidate(rect, rect2, i6)) {
            return false;
        }
        if (isCandidate(rect, rect3, i6) && !beamBeats(i6, rect, rect2, rect3)) {
            return !beamBeats(i6, rect, rect3, rect2) && getWeightedDistanceFor(majorAxisDistance(i6, rect, rect2), minorAxisDistance(i6, rect, rect2)) < getWeightedDistanceFor(majorAxisDistance(i6, rect, rect3), minorAxisDistance(i6, rect, rect3));
        }
        return true;
    }

    private static boolean isCandidate(@NonNull Rect rect, @NonNull Rect rect2, int i6) {
        if (i6 == 17) {
            int i7 = rect.right;
            int i8 = rect2.right;
            return (i7 > i8 || rect.left >= i8) && rect.left > rect2.left;
        }
        if (i6 == 33) {
            int i9 = rect.bottom;
            int i10 = rect2.bottom;
            return (i9 > i10 || rect.top >= i10) && rect.top > rect2.top;
        }
        if (i6 == 66) {
            int i11 = rect.left;
            int i12 = rect2.left;
            return (i11 < i12 || rect.right <= i12) && rect.right < rect2.right;
        }
        if (i6 != 130) {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        int i13 = rect.top;
        int i14 = rect2.top;
        return (i13 < i14 || rect.bottom <= i14) && rect.bottom < rect2.bottom;
    }

    private static boolean isToDirectionOf(int i6, @NonNull Rect rect, @NonNull Rect rect2) {
        if (i6 == 17) {
            return rect.left >= rect2.right;
        }
        if (i6 == 33) {
            return rect.top >= rect2.bottom;
        }
        if (i6 == 66) {
            return rect.right <= rect2.left;
        }
        if (i6 == 130) {
            return rect.bottom <= rect2.top;
        }
        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
    }

    private static int majorAxisDistance(int i6, @NonNull Rect rect, @NonNull Rect rect2) {
        return Math.max(0, majorAxisDistanceRaw(i6, rect, rect2));
    }

    private static int majorAxisDistanceRaw(int i6, @NonNull Rect rect, @NonNull Rect rect2) {
        int i7;
        int i8;
        if (i6 == 17) {
            i7 = rect.left;
            i8 = rect2.right;
        } else if (i6 == 33) {
            i7 = rect.top;
            i8 = rect2.bottom;
        } else if (i6 == 66) {
            i7 = rect2.left;
            i8 = rect.right;
        } else {
            if (i6 != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            i7 = rect2.top;
            i8 = rect.bottom;
        }
        return i7 - i8;
    }

    private static int majorAxisDistanceToFarEdge(int i6, @NonNull Rect rect, @NonNull Rect rect2) {
        return Math.max(1, majorAxisDistanceToFarEdgeRaw(i6, rect, rect2));
    }

    private static int majorAxisDistanceToFarEdgeRaw(int i6, @NonNull Rect rect, @NonNull Rect rect2) {
        int i7;
        int i8;
        if (i6 == 17) {
            i7 = rect.left;
            i8 = rect2.left;
        } else if (i6 == 33) {
            i7 = rect.top;
            i8 = rect2.top;
        } else if (i6 == 66) {
            i7 = rect2.right;
            i8 = rect.right;
        } else {
            if (i6 != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            i7 = rect2.bottom;
            i8 = rect.bottom;
        }
        return i7 - i8;
    }

    private static int minorAxisDistance(int i6, @NonNull Rect rect, @NonNull Rect rect2) {
        if (i6 != 17) {
            if (i6 != 33) {
                if (i6 != 66) {
                    if (i6 != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return Math.abs((rect.left + (rect.width() / 2)) - (rect2.left + (rect2.width() / 2)));
        }
        return Math.abs((rect.top + (rect.height() / 2)) - (rect2.top + (rect2.height() / 2)));
    }
}
