package androidx.paging;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import p113g8.AbstractC8680s;

/* loaded from: classes3.dex */
public abstract class ViewportHint {
    private final int originalPageOffsetFirst;
    private final int originalPageOffsetLast;
    private final int presentedItemsAfter;
    private final int presentedItemsBefore;

    public static final class Access extends ViewportHint {
        private final int indexInPage;
        private final int pageOffset;

        public Access(int i10, int i11, int i12, int i13, int i14, int i15) {
            super(i12, i13, i14, i15, null);
            this.pageOffset = i10;
            this.indexInPage = i11;
        }

        @Override // androidx.paging.ViewportHint
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Access)) {
                return false;
            }
            Access access = (Access) obj;
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
            return AbstractC8680s.m14088p("ViewportHint.Access(\n            |    pageOffset=" + this.pageOffset + ",\n            |    indexInPage=" + this.indexInPage + ",\n            |    presentedItemsBefore=" + getPresentedItemsBefore() + ",\n            |    presentedItemsAfter=" + getPresentedItemsAfter() + ",\n            |    originalPageOffsetFirst=" + getOriginalPageOffsetFirst() + ",\n            |    originalPageOffsetLast=" + getOriginalPageOffsetLast() + ",\n            |)", null, 1, null);
        }
    }

    public static final class Initial extends ViewportHint {
        public Initial(int i10, int i11, int i12, int i13) {
            super(i10, i11, i12, i13, null);
        }

        public String toString() {
            return AbstractC8680s.m14088p("ViewportHint.Initial(\n            |    presentedItemsBefore=" + getPresentedItemsBefore() + ",\n            |    presentedItemsAfter=" + getPresentedItemsAfter() + ",\n            |    originalPageOffsetFirst=" + getOriginalPageOffsetFirst() + ",\n            |    originalPageOffsetLast=" + getOriginalPageOffsetLast() + ",\n            |)", null, 1, null);
        }
    }

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

    public /* synthetic */ ViewportHint(int i10, int i11, int i12, int i13, AbstractC9126n abstractC9126n) {
        this(i10, i11, i12, i13);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ViewportHint)) {
            return false;
        }
        ViewportHint viewportHint = (ViewportHint) obj;
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
        AbstractC9133u.m16133g(loadType, "loadType");
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
