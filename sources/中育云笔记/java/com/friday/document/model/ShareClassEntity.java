package com.friday.document.model;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;

@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public final class ShareClassEntity {
    public static final int $stable = 8;
    private boolean checked;
    private boolean deleteMode;

    /* renamed from: id */
    private final int f6641id;
    private final String name;
    private final int shareStatus;

    public ShareClassEntity(int i10, String str, int i11, boolean z10, boolean z11) {
        this.f6641id = i10;
        this.name = str;
        this.shareStatus = i11;
        this.checked = z10;
        this.deleteMode = z11;
    }

    public static /* synthetic */ ShareClassEntity copy$default(ShareClassEntity shareClassEntity, int i10, String str, int i11, boolean z10, boolean z11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = shareClassEntity.f6641id;
        }
        if ((i12 & 2) != 0) {
            str = shareClassEntity.name;
        }
        if ((i12 & 4) != 0) {
            i11 = shareClassEntity.shareStatus;
        }
        if ((i12 & 8) != 0) {
            z10 = shareClassEntity.checked;
        }
        if ((i12 & 16) != 0) {
            z11 = shareClassEntity.deleteMode;
        }
        boolean z12 = z11;
        int i13 = i11;
        return shareClassEntity.copy(i10, str, i13, z10, z12);
    }

    public final int component1() {
        return this.f6641id;
    }

    public final String component2() {
        return this.name;
    }

    public final int component3() {
        return this.shareStatus;
    }

    public final boolean component4() {
        return this.checked;
    }

    public final boolean component5() {
        return this.deleteMode;
    }

    public final ShareClassEntity copy(int i10, String str, int i11, boolean z10, boolean z11) {
        return new ShareClassEntity(i10, str, i11, z10, z11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShareClassEntity)) {
            return false;
        }
        ShareClassEntity shareClassEntity = (ShareClassEntity) obj;
        return this.f6641id == shareClassEntity.f6641id && AbstractC9979u.m20289b(this.name, shareClassEntity.name) && this.shareStatus == shareClassEntity.shareStatus && this.checked == shareClassEntity.checked && this.deleteMode == shareClassEntity.deleteMode;
    }

    public final boolean getChecked() {
        return this.checked;
    }

    public final boolean getDeleteMode() {
        return this.deleteMode;
    }

    public final int getId() {
        return this.f6641id;
    }

    public final String getName() {
        return this.name;
    }

    public final int getShareStatus() {
        return this.shareStatus;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.f6641id) * 31;
        String str = this.name;
        return ((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Integer.hashCode(this.shareStatus)) * 31) + Boolean.hashCode(this.checked)) * 31) + Boolean.hashCode(this.deleteMode);
    }

    public final void setChecked(boolean z10) {
        this.checked = z10;
    }

    public final void setDeleteMode(boolean z10) {
        this.deleteMode = z10;
    }

    public String toString() {
        return "ShareClassEntity(id=" + this.f6641id + ", name=" + this.name + ", shareStatus=" + this.shareStatus + ", checked=" + this.checked + ", deleteMode=" + this.deleteMode + ")";
    }

    public /* synthetic */ ShareClassEntity(int i10, String str, int i11, boolean z10, boolean z11, int i12, AbstractC9972n abstractC9972n) {
        this(i10, str, i11, (i12 & 8) != 0 ? false : z10, (i12 & 16) != 0 ? false : z11);
    }
}
