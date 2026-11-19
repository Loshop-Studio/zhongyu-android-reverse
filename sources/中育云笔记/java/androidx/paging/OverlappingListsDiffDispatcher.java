package androidx.paging;

import androidx.recyclerview.widget.ListUpdateCallback;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p265nd.AbstractC10410o;

/* loaded from: classes3.dex */
public final class OverlappingListsDiffDispatcher {
    public static final OverlappingListsDiffDispatcher INSTANCE = new OverlappingListsDiffDispatcher();

    public static final class PlaceholderUsingUpdateCallback<T> implements ListUpdateCallback {
        public static final Companion Companion = new Companion(null);
        private static final int UNUSED = 1;
        private static final int USED_FOR_ADDITION = 3;
        private static final int USED_FOR_REMOVAL = 2;
        private final ListUpdateCallback callback;
        private final PlaceholderPaddedList<T> newList;
        private final PlaceholderPaddedList<T> oldList;
        private int placeholdersAfter;
        private int placeholdersAfterState;
        private int placeholdersBefore;
        private int placeholdersBeforeState;
        private int storageCount;

        public static final class Companion {
            public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
                this();
            }

            private Companion() {
            }
        }

        public PlaceholderUsingUpdateCallback(PlaceholderPaddedList<T> oldList, PlaceholderPaddedList<T> newList, ListUpdateCallback callback) {
            AbstractC9979u.m20294g(oldList, "oldList");
            AbstractC9979u.m20294g(newList, "newList");
            AbstractC9979u.m20294g(callback, "callback");
            this.oldList = oldList;
            this.newList = newList;
            this.callback = callback;
            this.placeholdersBefore = oldList.getPlaceholdersBefore();
            this.placeholdersAfter = oldList.getPlaceholdersAfter();
            this.storageCount = oldList.getDataCount();
            this.placeholdersBeforeState = 1;
            this.placeholdersAfterState = 1;
        }

        private final boolean dispatchInsertAsPlaceholderAfter(int i10, int i11) {
            if (i10 < this.storageCount || this.placeholdersAfterState == 2) {
                return false;
            }
            int iMin = Math.min(i11, this.placeholdersAfter);
            if (iMin > 0) {
                this.placeholdersAfterState = 3;
                this.callback.onChanged(this.placeholdersBefore + i10, iMin, DiffingChangePayload.PLACEHOLDER_TO_ITEM);
                this.placeholdersAfter -= iMin;
            }
            int i12 = i11 - iMin;
            if (i12 <= 0) {
                return true;
            }
            this.callback.onInserted(i10 + iMin + this.placeholdersBefore, i12);
            return true;
        }

        private final boolean dispatchInsertAsPlaceholderBefore(int i10, int i11) {
            if (i10 > 0 || this.placeholdersBeforeState == 2) {
                return false;
            }
            int iMin = Math.min(i11, this.placeholdersBefore);
            if (iMin > 0) {
                this.placeholdersBeforeState = 3;
                this.callback.onChanged((0 - iMin) + this.placeholdersBefore, iMin, DiffingChangePayload.PLACEHOLDER_TO_ITEM);
                this.placeholdersBefore -= iMin;
            }
            int i12 = i11 - iMin;
            if (i12 <= 0) {
                return true;
            }
            this.callback.onInserted(this.placeholdersBefore, i12);
            return true;
        }

        private final boolean dispatchRemovalAsPlaceholdersAfter(int i10, int i11) {
            if (i10 + i11 < this.storageCount || this.placeholdersAfterState == 3) {
                return false;
            }
            int iM21752e = AbstractC10410o.m21752e(Math.min(this.newList.getPlaceholdersAfter() - this.placeholdersAfter, i11), 0);
            int i12 = i11 - iM21752e;
            if (iM21752e > 0) {
                this.placeholdersAfterState = 2;
                this.callback.onChanged(this.placeholdersBefore + i10, iM21752e, DiffingChangePayload.ITEM_TO_PLACEHOLDER);
                this.placeholdersAfter += iM21752e;
            }
            if (i12 <= 0) {
                return true;
            }
            this.callback.onRemoved(i10 + iM21752e + this.placeholdersBefore, i12);
            return true;
        }

        private final boolean dispatchRemovalAsPlaceholdersBefore(int i10, int i11) {
            if (i10 > 0 || this.placeholdersBeforeState == 3) {
                return false;
            }
            int iM21752e = AbstractC10410o.m21752e(Math.min(this.newList.getPlaceholdersBefore() - this.placeholdersBefore, i11), 0);
            int i12 = i11 - iM21752e;
            if (i12 > 0) {
                this.callback.onRemoved(this.placeholdersBefore, i12);
            }
            if (iM21752e <= 0) {
                return true;
            }
            this.placeholdersBeforeState = 2;
            this.callback.onChanged(this.placeholdersBefore, iM21752e, DiffingChangePayload.ITEM_TO_PLACEHOLDER);
            this.placeholdersBefore += iM21752e;
            return true;
        }

        private final void fixLeadingPlaceholders() {
            int iMin = Math.min(this.oldList.getPlaceholdersBefore(), this.placeholdersBefore);
            int placeholdersBefore = this.newList.getPlaceholdersBefore() - this.placeholdersBefore;
            if (placeholdersBefore > 0) {
                if (iMin > 0) {
                    this.callback.onChanged(0, iMin, DiffingChangePayload.PLACEHOLDER_POSITION_CHANGE);
                }
                this.callback.onInserted(0, placeholdersBefore);
            } else if (placeholdersBefore < 0) {
                this.callback.onRemoved(0, -placeholdersBefore);
                int i10 = iMin + placeholdersBefore;
                if (i10 > 0) {
                    this.callback.onChanged(0, i10, DiffingChangePayload.PLACEHOLDER_POSITION_CHANGE);
                }
            }
            this.placeholdersBefore = this.newList.getPlaceholdersBefore();
        }

        private final void fixTrailingPlaceholders() {
            int iMin = Math.min(this.oldList.getPlaceholdersAfter(), this.placeholdersAfter);
            int placeholdersAfter = this.newList.getPlaceholdersAfter();
            int i10 = this.placeholdersAfter;
            int i11 = placeholdersAfter - i10;
            int i12 = this.placeholdersBefore + this.storageCount + i10;
            int i13 = i12 - iMin;
            boolean z10 = i13 != this.oldList.getSize() - iMin;
            if (i11 > 0) {
                this.callback.onInserted(i12, i11);
            } else if (i11 < 0) {
                this.callback.onRemoved(i12 + i11, -i11);
                iMin += i11;
            }
            if (iMin > 0 && z10) {
                this.callback.onChanged(i13, iMin, DiffingChangePayload.PLACEHOLDER_POSITION_CHANGE);
            }
            this.placeholdersAfter = this.newList.getPlaceholdersAfter();
        }

        private final int offsetForDispatch(int i10) {
            return i10 + this.placeholdersBefore;
        }

        public final void fixPlaceholders() {
            fixLeadingPlaceholders();
            fixTrailingPlaceholders();
        }

        @Override // androidx.recyclerview.widget.ListUpdateCallback
        public void onChanged(int i10, int i11, Object obj) {
            this.callback.onChanged(i10 + this.placeholdersBefore, i11, obj);
        }

        @Override // androidx.recyclerview.widget.ListUpdateCallback
        public void onInserted(int i10, int i11) {
            if (!dispatchInsertAsPlaceholderAfter(i10, i11) && !dispatchInsertAsPlaceholderBefore(i10, i11)) {
                this.callback.onInserted(i10 + this.placeholdersBefore, i11);
            }
            this.storageCount += i11;
        }

        @Override // androidx.recyclerview.widget.ListUpdateCallback
        public void onMoved(int i10, int i11) {
            ListUpdateCallback listUpdateCallback = this.callback;
            int i12 = this.placeholdersBefore;
            listUpdateCallback.onMoved(i10 + i12, i11 + i12);
        }

        @Override // androidx.recyclerview.widget.ListUpdateCallback
        public void onRemoved(int i10, int i11) {
            if (!dispatchRemovalAsPlaceholdersAfter(i10, i11) && !dispatchRemovalAsPlaceholdersBefore(i10, i11)) {
                this.callback.onRemoved(i10 + this.placeholdersBefore, i11);
            }
            this.storageCount -= i11;
        }
    }

    private OverlappingListsDiffDispatcher() {
    }

    public final <T> void dispatchDiff(PlaceholderPaddedList<T> oldList, PlaceholderPaddedList<T> newList, ListUpdateCallback callback, PlaceholderPaddedDiffResult diffResult) {
        AbstractC9979u.m20294g(oldList, "oldList");
        AbstractC9979u.m20294g(newList, "newList");
        AbstractC9979u.m20294g(callback, "callback");
        AbstractC9979u.m20294g(diffResult, "diffResult");
        PlaceholderUsingUpdateCallback placeholderUsingUpdateCallback = new PlaceholderUsingUpdateCallback(oldList, newList, callback);
        diffResult.getDiff().dispatchUpdatesTo(placeholderUsingUpdateCallback);
        placeholderUsingUpdateCallback.fixPlaceholders();
    }
}
