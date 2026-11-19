package com.friday.document.model;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;

@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public final class ShareListEntity {
    public static final int $stable = 8;
    private final boolean isSelected;
    private final boolean root;
    private final ShareFile shareFile;

    public ShareListEntity(boolean z10, boolean z11, ShareFile shareFile) {
        AbstractC9979u.m20294g(shareFile, "shareFile");
        this.isSelected = z10;
        this.root = z11;
        this.shareFile = shareFile;
    }

    public static /* synthetic */ ShareListEntity copy$default(ShareListEntity shareListEntity, boolean z10, boolean z11, ShareFile shareFile, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = shareListEntity.isSelected;
        }
        if ((i10 & 2) != 0) {
            z11 = shareListEntity.root;
        }
        if ((i10 & 4) != 0) {
            shareFile = shareListEntity.shareFile;
        }
        return shareListEntity.copy(z10, z11, shareFile);
    }

    public final boolean component1() {
        return this.isSelected;
    }

    public final boolean component2() {
        return this.root;
    }

    public final ShareFile component3() {
        return this.shareFile;
    }

    public final ShareListEntity copy(boolean z10, boolean z11, ShareFile shareFile) {
        AbstractC9979u.m20294g(shareFile, "shareFile");
        return new ShareListEntity(z10, z11, shareFile);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShareListEntity)) {
            return false;
        }
        ShareListEntity shareListEntity = (ShareListEntity) obj;
        return this.isSelected == shareListEntity.isSelected && this.root == shareListEntity.root && AbstractC9979u.m20289b(this.shareFile, shareListEntity.shareFile);
    }

    public final boolean getRoot() {
        return this.root;
    }

    public final ShareFile getShareFile() {
        return this.shareFile;
    }

    public int hashCode() {
        return (((Boolean.hashCode(this.isSelected) * 31) + Boolean.hashCode(this.root)) * 31) + this.shareFile.hashCode();
    }

    public final boolean isSelected() {
        return this.isSelected;
    }

    public String toString() {
        return "ShareListEntity(isSelected=" + this.isSelected + ", root=" + this.root + ", shareFile=" + this.shareFile + ")";
    }

    public /* synthetic */ ShareListEntity(boolean z10, boolean z11, ShareFile shareFile, int i10, AbstractC9972n abstractC9972n) {
        this((i10 & 1) != 0 ? false : z10, z11, shareFile);
    }
}
