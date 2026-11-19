package androidx.paging;

import androidx.exifinterface.media.ExifInterface;
import androidx.recyclerview.widget.ListUpdateCallback;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

@Metadata(m13557d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001\rB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J8\u0010\u0003\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00050\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00050\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f¨\u0006\u000e"}, m13558d2 = {"Landroidx/paging/OverlappingListsDiffDispatcher;", "", "()V", "dispatchDiff", "", ExifInterface.GPS_DIRECTION_TRUE, "oldList", "Landroidx/paging/PlaceholderPaddedList;", "newList", "callback", "Landroidx/recyclerview/widget/ListUpdateCallback;", "diffResult", "Landroidx/paging/PlaceholderPaddedDiffResult;", "PlaceholderUsingUpdateCallback", "paging-runtime_release"}, m13559k = 1, m13560mv = {1, 8, 0}, m13562xi = 48)
/* loaded from: classes3.dex */
public final class OverlappingListsDiffDispatcher {
    public static final OverlappingListsDiffDispatcher INSTANCE = new OverlappingListsDiffDispatcher();

    @Metadata(m13557d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\b\b\u0002\u0018\u0000 \"*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\"B)\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0002\u0010\u0007J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\tH\u0002J\u0018\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\tH\u0002J\u0018\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\tH\u0002J\u0018\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\tH\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0002J\u0006\u0010\u0017\u001a\u00020\u0016J\b\u0010\u0018\u001a\u00020\u0016H\u0002J\"\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\t2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\u0018\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\tH\u0016J\u0018\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\tH\u0016J\u0018\u0010 \u001a\u00020\u00162\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\tH\u0016J\r\u0010!\u001a\u00020\t*\u00020\tH\u0082\bR\u000e\u0010\u0006\u001a\u00020\u0002X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006#"}, m13558d2 = {"Landroidx/paging/OverlappingListsDiffDispatcher$PlaceholderUsingUpdateCallback;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/recyclerview/widget/ListUpdateCallback;", "oldList", "Landroidx/paging/PlaceholderPaddedList;", "newList", "callback", "(Landroidx/paging/PlaceholderPaddedList;Landroidx/paging/PlaceholderPaddedList;Landroidx/recyclerview/widget/ListUpdateCallback;)V", "placeholdersAfter", "", "placeholdersAfterState", "placeholdersBefore", "placeholdersBeforeState", "storageCount", "dispatchInsertAsPlaceholderAfter", "", RequestParameters.POSITION, "count", "dispatchInsertAsPlaceholderBefore", "dispatchRemovalAsPlaceholdersAfter", "dispatchRemovalAsPlaceholdersBefore", "fixLeadingPlaceholders", "", "fixPlaceholders", "fixTrailingPlaceholders", "onChanged", "payload", "", "onInserted", "onMoved", "fromPosition", "toPosition", "onRemoved", "offsetForDispatch", "Companion", "paging-runtime_release"}, m13559k = 1, m13560mv = {1, 8, 0}, m13562xi = 48)
    @SourceDebugExtension({"SMAP\nPlaceholderPaddedListDiffHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlaceholderPaddedListDiffHelper.kt\nandroidx/paging/OverlappingListsDiffDispatcher$PlaceholderUsingUpdateCallback\n*L\n1#1,532:1\n211#1:533\n211#1:534\n211#1:535\n211#1:536\n211#1:537\n211#1:538\n211#1:539\n211#1:540\n211#1:541\n211#1:542\n211#1:543\n211#1:544\n*S KotlinDebug\n*F\n+ 1 PlaceholderPaddedListDiffHelper.kt\nandroidx/paging/OverlappingListsDiffDispatcher$PlaceholderUsingUpdateCallback\n*L\n294#1:533\n316#1:534\n323#1:535\n343#1:536\n350#1:537\n366#1:538\n391#1:539\n396#1:540\n427#1:541\n434#1:542\n440#1:543\n444#1:544\n*E\n"})
    public static final class PlaceholderUsingUpdateCallback<T> implements ListUpdateCallback {
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

        public PlaceholderUsingUpdateCallback(PlaceholderPaddedList<T> oldList, PlaceholderPaddedList<T> newList, ListUpdateCallback callback) {
            Intrinsics.checkNotNullParameter(oldList, "oldList");
            Intrinsics.checkNotNullParameter(newList, "newList");
            Intrinsics.checkNotNullParameter(callback, "callback");
            this.oldList = oldList;
            this.newList = newList;
            this.callback = callback;
            this.placeholdersBefore = oldList.getPlaceholdersBefore();
            this.placeholdersAfter = oldList.getPlaceholdersAfter();
            this.storageCount = oldList.getDataCount();
            this.placeholdersBeforeState = 1;
            this.placeholdersAfterState = 1;
        }

        private final boolean dispatchInsertAsPlaceholderAfter(int position, int count) {
            if (position < this.storageCount || this.placeholdersAfterState == 2) {
                return false;
            }
            int iMin = Math.min(count, this.placeholdersAfter);
            if (iMin > 0) {
                this.placeholdersAfterState = 3;
                this.callback.onChanged(this.placeholdersBefore + position, iMin, DiffingChangePayload.PLACEHOLDER_TO_ITEM);
                this.placeholdersAfter -= iMin;
            }
            int i10 = count - iMin;
            if (i10 <= 0) {
                return true;
            }
            this.callback.onInserted(position + iMin + this.placeholdersBefore, i10);
            return true;
        }

        private final boolean dispatchInsertAsPlaceholderBefore(int position, int count) {
            if (position > 0 || this.placeholdersBeforeState == 2) {
                return false;
            }
            int iMin = Math.min(count, this.placeholdersBefore);
            if (iMin > 0) {
                this.placeholdersBeforeState = 3;
                this.callback.onChanged((0 - iMin) + this.placeholdersBefore, iMin, DiffingChangePayload.PLACEHOLDER_TO_ITEM);
                this.placeholdersBefore -= iMin;
            }
            int i10 = count - iMin;
            if (i10 <= 0) {
                return true;
            }
            this.callback.onInserted(this.placeholdersBefore, i10);
            return true;
        }

        private final boolean dispatchRemovalAsPlaceholdersAfter(int position, int count) {
            if (position + count < this.storageCount || this.placeholdersAfterState == 3) {
                return false;
            }
            int iCoerceAtLeast = RangesKt.coerceAtLeast(Math.min(this.newList.getPlaceholdersAfter() - this.placeholdersAfter, count), 0);
            int i10 = count - iCoerceAtLeast;
            if (iCoerceAtLeast > 0) {
                this.placeholdersAfterState = 2;
                this.callback.onChanged(this.placeholdersBefore + position, iCoerceAtLeast, DiffingChangePayload.ITEM_TO_PLACEHOLDER);
                this.placeholdersAfter += iCoerceAtLeast;
            }
            if (i10 <= 0) {
                return true;
            }
            this.callback.onRemoved(position + iCoerceAtLeast + this.placeholdersBefore, i10);
            return true;
        }

        private final boolean dispatchRemovalAsPlaceholdersBefore(int position, int count) {
            if (position > 0 || this.placeholdersBeforeState == 3) {
                return false;
            }
            int iCoerceAtLeast = RangesKt.coerceAtLeast(Math.min(this.newList.getPlaceholdersBefore() - this.placeholdersBefore, count), 0);
            int i10 = count - iCoerceAtLeast;
            if (i10 > 0) {
                this.callback.onRemoved(this.placeholdersBefore, i10);
            }
            if (iCoerceAtLeast <= 0) {
                return true;
            }
            this.placeholdersBeforeState = 2;
            this.callback.onChanged(this.placeholdersBefore, iCoerceAtLeast, DiffingChangePayload.ITEM_TO_PLACEHOLDER);
            this.placeholdersBefore += iCoerceAtLeast;
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
            boolean z9 = i13 != this.oldList.getSize() - iMin;
            if (i11 > 0) {
                this.callback.onInserted(i12, i11);
            } else if (i11 < 0) {
                this.callback.onRemoved(i12 + i11, -i11);
                iMin += i11;
            }
            if (iMin > 0 && z9) {
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
        public void onChanged(int position, int count, Object payload) {
            this.callback.onChanged(position + this.placeholdersBefore, count, payload);
        }

        @Override // androidx.recyclerview.widget.ListUpdateCallback
        public void onInserted(int position, int count) {
            if (!dispatchInsertAsPlaceholderAfter(position, count) && !dispatchInsertAsPlaceholderBefore(position, count)) {
                this.callback.onInserted(position + this.placeholdersBefore, count);
            }
            this.storageCount += count;
        }

        @Override // androidx.recyclerview.widget.ListUpdateCallback
        public void onMoved(int fromPosition, int toPosition) {
            ListUpdateCallback listUpdateCallback = this.callback;
            int i10 = this.placeholdersBefore;
            listUpdateCallback.onMoved(fromPosition + i10, toPosition + i10);
        }

        @Override // androidx.recyclerview.widget.ListUpdateCallback
        public void onRemoved(int position, int count) {
            if (!dispatchRemovalAsPlaceholdersAfter(position, count) && !dispatchRemovalAsPlaceholdersBefore(position, count)) {
                this.callback.onRemoved(position + this.placeholdersBefore, count);
            }
            this.storageCount -= count;
        }
    }

    private OverlappingListsDiffDispatcher() {
    }

    public final <T> void dispatchDiff(PlaceholderPaddedList<T> oldList, PlaceholderPaddedList<T> newList, ListUpdateCallback callback, PlaceholderPaddedDiffResult diffResult) {
        Intrinsics.checkNotNullParameter(oldList, "oldList");
        Intrinsics.checkNotNullParameter(newList, "newList");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(diffResult, "diffResult");
        PlaceholderUsingUpdateCallback placeholderUsingUpdateCallback = new PlaceholderUsingUpdateCallback(oldList, newList, callback);
        diffResult.getDiff().dispatchUpdatesTo(placeholderUsingUpdateCallback);
        placeholderUsingUpdateCallback.fixPlaceholders();
    }
}
