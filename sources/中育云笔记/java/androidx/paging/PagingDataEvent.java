package androidx.paging;

import androidx.annotation.RestrictTo;
import java.util.List;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p310qd.AbstractC10812s;
import p325rc.AbstractC10947g0;

/* loaded from: classes3.dex */
public abstract class PagingDataEvent<T> {

    public static final class Append<T> extends PagingDataEvent<T> {
        private final List<T> inserted;
        private final int newPlaceholdersAfter;
        private final int oldPlaceholdersAfter;
        private final int startIndex;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public Append(int i10, List<? extends T> inserted, int i11, int i12) {
            super(null);
            AbstractC9979u.m20294g(inserted, "inserted");
            this.startIndex = i10;
            this.inserted = inserted;
            this.newPlaceholdersAfter = i11;
            this.oldPlaceholdersAfter = i12;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof Append)) {
                return false;
            }
            Append append = (Append) obj;
            return this.startIndex == append.startIndex && AbstractC9979u.m20289b(this.inserted, append.inserted) && this.newPlaceholdersAfter == append.newPlaceholdersAfter && this.oldPlaceholdersAfter == append.oldPlaceholdersAfter;
        }

        public final List<T> getInserted() {
            return this.inserted;
        }

        public final int getNewPlaceholdersAfter() {
            return this.newPlaceholdersAfter;
        }

        public final int getOldPlaceholdersAfter() {
            return this.oldPlaceholdersAfter;
        }

        public final int getStartIndex() {
            return this.startIndex;
        }

        public int hashCode() {
            return Integer.hashCode(this.startIndex) + this.inserted.hashCode() + Integer.hashCode(this.newPlaceholdersAfter) + Integer.hashCode(this.oldPlaceholdersAfter);
        }

        public String toString() {
            return AbstractC10812s.m23223p("PagingDataEvent.Append loaded " + this.inserted.size() + " items (\n                    |   startIndex: " + this.startIndex + "\n                    |   first item: " + AbstractC10947g0.m23946o0(this.inserted) + "\n                    |   last item: " + AbstractC10947g0.m23957z0(this.inserted) + "\n                    |   newPlaceholdersBefore: " + this.newPlaceholdersAfter + "\n                    |   oldPlaceholdersBefore: " + this.oldPlaceholdersAfter + "\n                    |)\n                    |", null, 1, null);
        }
    }

    public static final class DropAppend<T> extends PagingDataEvent<T> {
        private final int dropCount;
        private final int newPlaceholdersAfter;
        private final int oldPlaceholdersAfter;
        private final int startIndex;

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public DropAppend(int i10, int i11, int i12, int i13) {
            super(null);
            this.startIndex = i10;
            this.dropCount = i11;
            this.newPlaceholdersAfter = i12;
            this.oldPlaceholdersAfter = i13;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof DropAppend)) {
                return false;
            }
            DropAppend dropAppend = (DropAppend) obj;
            return this.startIndex == dropAppend.startIndex && this.dropCount == dropAppend.dropCount && this.newPlaceholdersAfter == dropAppend.newPlaceholdersAfter && this.oldPlaceholdersAfter == dropAppend.oldPlaceholdersAfter;
        }

        public final int getDropCount() {
            return this.dropCount;
        }

        public final int getNewPlaceholdersAfter() {
            return this.newPlaceholdersAfter;
        }

        public final int getOldPlaceholdersAfter() {
            return this.oldPlaceholdersAfter;
        }

        public final int getStartIndex() {
            return this.startIndex;
        }

        public int hashCode() {
            return Integer.hashCode(this.startIndex) + Integer.hashCode(this.dropCount) + Integer.hashCode(this.newPlaceholdersAfter) + Integer.hashCode(this.oldPlaceholdersAfter);
        }

        public String toString() {
            return AbstractC10812s.m23223p("PagingDataEvent.DropAppend dropped " + this.dropCount + " items (\n                    |   startIndex: " + this.startIndex + "\n                    |   dropCount: " + this.dropCount + "\n                    |   newPlaceholdersBefore: " + this.newPlaceholdersAfter + "\n                    |   oldPlaceholdersBefore: " + this.oldPlaceholdersAfter + "\n                    |)\n                    |", null, 1, null);
        }
    }

    public static final class DropPrepend<T> extends PagingDataEvent<T> {
        private final int dropCount;
        private final int newPlaceholdersBefore;
        private final int oldPlaceholdersBefore;

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public DropPrepend(int i10, int i11, int i12) {
            super(null);
            this.dropCount = i10;
            this.newPlaceholdersBefore = i11;
            this.oldPlaceholdersBefore = i12;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof DropPrepend)) {
                return false;
            }
            DropPrepend dropPrepend = (DropPrepend) obj;
            return this.dropCount == dropPrepend.dropCount && this.newPlaceholdersBefore == dropPrepend.newPlaceholdersBefore && this.oldPlaceholdersBefore == dropPrepend.oldPlaceholdersBefore;
        }

        public final int getDropCount() {
            return this.dropCount;
        }

        public final int getNewPlaceholdersBefore() {
            return this.newPlaceholdersBefore;
        }

        public final int getOldPlaceholdersBefore() {
            return this.oldPlaceholdersBefore;
        }

        public int hashCode() {
            return Integer.hashCode(this.dropCount) + Integer.hashCode(this.newPlaceholdersBefore) + Integer.hashCode(this.oldPlaceholdersBefore);
        }

        public String toString() {
            return AbstractC10812s.m23223p("PagingDataEvent.DropPrepend dropped " + this.dropCount + " items (\n                    |   dropCount: " + this.dropCount + "\n                    |   newPlaceholdersBefore: " + this.newPlaceholdersBefore + "\n                    |   oldPlaceholdersBefore: " + this.oldPlaceholdersBefore + "\n                    |)\n                    |", null, 1, null);
        }
    }

    public static final class Prepend<T> extends PagingDataEvent<T> {
        private final List<T> inserted;
        private final int newPlaceholdersBefore;
        private final int oldPlaceholdersBefore;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public Prepend(List<? extends T> inserted, int i10, int i11) {
            super(null);
            AbstractC9979u.m20294g(inserted, "inserted");
            this.inserted = inserted;
            this.newPlaceholdersBefore = i10;
            this.oldPlaceholdersBefore = i11;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof Prepend)) {
                return false;
            }
            Prepend prepend = (Prepend) obj;
            return AbstractC9979u.m20289b(this.inserted, prepend.inserted) && this.newPlaceholdersBefore == prepend.newPlaceholdersBefore && this.oldPlaceholdersBefore == prepend.oldPlaceholdersBefore;
        }

        public final List<T> getInserted() {
            return this.inserted;
        }

        public final int getNewPlaceholdersBefore() {
            return this.newPlaceholdersBefore;
        }

        public final int getOldPlaceholdersBefore() {
            return this.oldPlaceholdersBefore;
        }

        public int hashCode() {
            return this.inserted.hashCode() + Integer.hashCode(this.newPlaceholdersBefore) + Integer.hashCode(this.oldPlaceholdersBefore);
        }

        public String toString() {
            return AbstractC10812s.m23223p("PagingDataEvent.Prepend loaded " + this.inserted.size() + " items (\n                    |   first item: " + AbstractC10947g0.m23946o0(this.inserted) + "\n                    |   last item: " + AbstractC10947g0.m23957z0(this.inserted) + "\n                    |   newPlaceholdersBefore: " + this.newPlaceholdersBefore + "\n                    |   oldPlaceholdersBefore: " + this.oldPlaceholdersBefore + "\n                    |)\n                    |", null, 1, null);
        }
    }

    public static final class Refresh<T> extends PagingDataEvent<T> {
        private final PlaceholderPaddedList<T> newList;
        private final PlaceholderPaddedList<T> previousList;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public Refresh(PlaceholderPaddedList<T> newList, PlaceholderPaddedList<T> previousList) {
            super(null);
            AbstractC9979u.m20294g(newList, "newList");
            AbstractC9979u.m20294g(previousList, "previousList");
            this.newList = newList;
            this.previousList = previousList;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof Refresh)) {
                return false;
            }
            Refresh refresh = (Refresh) obj;
            return this.newList.getPlaceholdersBefore() == refresh.newList.getPlaceholdersBefore() && this.newList.getPlaceholdersAfter() == refresh.newList.getPlaceholdersAfter() && this.newList.getSize() == refresh.newList.getSize() && this.newList.getDataCount() == refresh.newList.getDataCount() && this.previousList.getPlaceholdersBefore() == refresh.previousList.getPlaceholdersBefore() && this.previousList.getPlaceholdersAfter() == refresh.previousList.getPlaceholdersAfter() && this.previousList.getSize() == refresh.previousList.getSize() && this.previousList.getDataCount() == refresh.previousList.getDataCount();
        }

        public final PlaceholderPaddedList<T> getNewList() {
            return this.newList;
        }

        public final PlaceholderPaddedList<T> getPreviousList() {
            return this.previousList;
        }

        public int hashCode() {
            return this.newList.hashCode() + this.previousList.hashCode();
        }

        public String toString() {
            return AbstractC10812s.m23223p("PagingDataEvent.Refresh loaded newList\n                    |   newList (\n                    |       placeholdersBefore: " + this.newList.getPlaceholdersBefore() + "\n                    |       placeholdersAfter: " + this.newList.getPlaceholdersAfter() + "\n                    |       size: " + this.newList.getSize() + "\n                    |       dataCount: " + this.newList.getDataCount() + "\n                    |   )\n                    |   previousList (\n                    |       placeholdersBefore: " + this.previousList.getPlaceholdersBefore() + "\n                    |       placeholdersAfter: " + this.previousList.getPlaceholdersAfter() + "\n                    |       size: " + this.previousList.getSize() + "\n                    |       dataCount: " + this.previousList.getDataCount() + "\n                    |   )\n                    |", null, 1, null);
        }
    }

    public /* synthetic */ PagingDataEvent(AbstractC9972n abstractC9972n) {
        this();
    }

    private PagingDataEvent() {
    }
}
