package androidx.paging;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(m13557d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0002\u0015\u0016B'\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0010\u001a\u00020\u0003H\u0016J\u0015\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0013H\u0000¢\u0006\u0002\b\u0014R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t\u0082\u0001\u0002\u0017\u0018¨\u0006\u0019"}, m13558d2 = {"Landroidx/paging/ViewportHint;", "", "presentedItemsBefore", "", "presentedItemsAfter", "originalPageOffsetFirst", "originalPageOffsetLast", "(IIII)V", "getOriginalPageOffsetFirst", "()I", "getOriginalPageOffsetLast", "getPresentedItemsAfter", "getPresentedItemsBefore", "equals", "", "other", "hashCode", "presentedItemsBeyondAnchor", "loadType", "Landroidx/paging/LoadType;", "presentedItemsBeyondAnchor$paging_common_release", "Access", "Initial", "Landroidx/paging/ViewportHint$Access;", "Landroidx/paging/ViewportHint$Initial;", "paging-common_release"}, m13559k = 1, m13560mv = {1, 8, 0}, m13562xi = 48)
/* loaded from: classes3.dex */
public abstract class ViewportHint {
    private final int originalPageOffsetFirst;
    private final int originalPageOffsetLast;
    private final int presentedItemsAfter;
    private final int presentedItemsBefore;

    @Metadata(m13557d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0002\u0010\tJ\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0096\u0002J\b\u0010\u0011\u001a\u00020\u0003H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0014"}, m13558d2 = {"Landroidx/paging/ViewportHint$Access;", "Landroidx/paging/ViewportHint;", "pageOffset", "", "indexInPage", "presentedItemsBefore", "presentedItemsAfter", "originalPageOffsetFirst", "originalPageOffsetLast", "(IIIIII)V", "getIndexInPage", "()I", "getPageOffset", "equals", "", "other", "", "hashCode", "toString", "", "paging-common_release"}, m13559k = 1, m13560mv = {1, 8, 0}, m13562xi = 48)
    public static final class Access extends ViewportHint {
        private final int indexInPage;
        private final int pageOffset;

        public Access(int i10, int i11, int i12, int i13, int i14, int i15) {
            super(i12, i13, i14, i15, null);
            this.pageOffset = i10;
            this.indexInPage = i11;
        }

        @Override // androidx.paging.ViewportHint
        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Access)) {
                return false;
            }
            Access access = (Access) other;
            return this.pageOffset == access.pageOffset && this.indexInPage == access.indexInPage && getPresentedItemsBefore() == access.getPresentedItemsBefore() && getPresentedItemsAfter() == access.getPresentedItemsAfter() && getOriginalPageOffsetFirst() == access.getOriginalPageOffsetFirst() && getOriginalPageOffsetLast() == access.getOriginalPageOffsetLast();
        }

        public final int getIndexInPage() {
            return this.indexInPage;
        }

        public final int getPageOffset() {
            return this.pageOffset;
        }

        @Override // androidx.paging.ViewportHint
        public int hashCode() {
            return super.hashCode() + Integer.hashCode(this.pageOffset) + Integer.hashCode(this.indexInPage);
        }

        public String toString() {
            return StringsKt.trimMargin$default("ViewportHint.Access(\n            |    pageOffset=" + this.pageOffset + ",\n            |    indexInPage=" + this.indexInPage + ",\n            |    presentedItemsBefore=" + getPresentedItemsBefore() + ",\n            |    presentedItemsAfter=" + getPresentedItemsAfter() + ",\n            |    originalPageOffsetFirst=" + getOriginalPageOffsetFirst() + ",\n            |    originalPageOffsetLast=" + getOriginalPageOffsetLast() + ",\n            |)", null, 1, null);
        }
    }

    @Metadata(m13557d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\b\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, m13558d2 = {"Landroidx/paging/ViewportHint$Initial;", "Landroidx/paging/ViewportHint;", "presentedItemsBefore", "", "presentedItemsAfter", "originalPageOffsetFirst", "originalPageOffsetLast", "(IIII)V", "toString", "", "paging-common_release"}, m13559k = 1, m13560mv = {1, 8, 0}, m13562xi = 48)
    public static final class Initial extends ViewportHint {
        public Initial(int i10, int i11, int i12, int i13) {
            super(i10, i11, i12, i13, null);
        }

        public String toString() {
            return StringsKt.trimMargin$default("ViewportHint.Initial(\n            |    presentedItemsBefore=" + getPresentedItemsBefore() + ",\n            |    presentedItemsAfter=" + getPresentedItemsAfter() + ",\n            |    originalPageOffsetFirst=" + getOriginalPageOffsetFirst() + ",\n            |    originalPageOffsetLast=" + getOriginalPageOffsetLast() + ",\n            |)", null, 1, null);
        }
    }

    @Metadata(m13559k = 3, m13560mv = {1, 8, 0}, m13562xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LoadType.values().length];
            try {
                iArr[LoadType.REFRESH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LoadType.PREPEND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LoadType.APPEND.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public /* synthetic */ ViewportHint(int i10, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, i11, i12, i13);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ViewportHint)) {
            return false;
        }
        ViewportHint viewportHint = (ViewportHint) other;
        return this.presentedItemsBefore == viewportHint.presentedItemsBefore && this.presentedItemsAfter == viewportHint.presentedItemsAfter && this.originalPageOffsetFirst == viewportHint.originalPageOffsetFirst && this.originalPageOffsetLast == viewportHint.originalPageOffsetLast;
    }

    public final int getOriginalPageOffsetFirst() {
        return this.originalPageOffsetFirst;
    }

    public final int getOriginalPageOffsetLast() {
        return this.originalPageOffsetLast;
    }

    public final int getPresentedItemsAfter() {
        return this.presentedItemsAfter;
    }

    public final int getPresentedItemsBefore() {
        return this.presentedItemsBefore;
    }

    public int hashCode() {
        return Integer.hashCode(this.presentedItemsBefore) + Integer.hashCode(this.presentedItemsAfter) + Integer.hashCode(this.originalPageOffsetFirst) + Integer.hashCode(this.originalPageOffsetLast);
    }

    public final int presentedItemsBeyondAnchor$paging_common_release(LoadType loadType) {
        Intrinsics.checkNotNullParameter(loadType, "loadType");
        int i10 = WhenMappings.$EnumSwitchMapping$0[loadType.ordinal()];
        if (i10 == 1) {
            throw new IllegalArgumentException("Cannot get presentedItems for loadType: REFRESH");
        }
        if (i10 == 2) {
            return this.presentedItemsBefore;
        }
        if (i10 == 3) {
            return this.presentedItemsAfter;
        }
        throw new NoWhenBranchMatchedException();
    }

    private ViewportHint(int i10, int i11, int i12, int i13) {
        this.presentedItemsBefore = i10;
        this.presentedItemsAfter = i11;
        this.originalPageOffsetFirst = i12;
        this.originalPageOffsetLast = i13;
    }
}
