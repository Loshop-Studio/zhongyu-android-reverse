package com.zykj.gallery.bean;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;

@StabilityInferred(parameters = 1)
@Metadata(m7879d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\f¨\u0006\u0016"}, m7880d2 = {"Lcom/zykj/gallery/bean/ListBody;", "", "skipCount", "", "maxResultCount", "isRecycleBin", "", "<init>", "(IIZ)V", "getSkipCount", "()I", "getMaxResultCount", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "toString", "", "module_gallery_release"}, m7881k = 1, m7882mv = {2, 2, 0}, m7884xi = 48)
/* loaded from: classes.dex */
public final /* data */ class ListBody {
    public static final int $stable = 0;

    @SerializedName("IsRecycleBin")
    private final boolean isRecycleBin;

    @SerializedName("MaxResultCount")
    private final int maxResultCount;

    @SerializedName("SkipCount")
    private final int skipCount;

    public ListBody(int i6, int i7, boolean z6) {
        this.skipCount = i6;
        this.maxResultCount = i7;
        this.isRecycleBin = z6;
    }

    public static /* synthetic */ ListBody copy$default(ListBody listBody, int i6, int i7, boolean z6, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            i6 = listBody.skipCount;
        }
        if ((i8 & 2) != 0) {
            i7 = listBody.maxResultCount;
        }
        if ((i8 & 4) != 0) {
            z6 = listBody.isRecycleBin;
        }
        return listBody.copy(i6, i7, z6);
    }

    /* renamed from: component1, reason: from getter */
    public final int getSkipCount() {
        return this.skipCount;
    }

    /* renamed from: component2, reason: from getter */
    public final int getMaxResultCount() {
        return this.maxResultCount;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsRecycleBin() {
        return this.isRecycleBin;
    }

    public final ListBody copy(int skipCount, int maxResultCount, boolean isRecycleBin) {
        return new ListBody(skipCount, maxResultCount, isRecycleBin);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ListBody)) {
            return false;
        }
        ListBody listBody = (ListBody) other;
        return this.skipCount == listBody.skipCount && this.maxResultCount == listBody.maxResultCount && this.isRecycleBin == listBody.isRecycleBin;
    }

    public final int getMaxResultCount() {
        return this.maxResultCount;
    }

    public final int getSkipCount() {
        return this.skipCount;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.skipCount) * 31) + Integer.hashCode(this.maxResultCount)) * 31) + Boolean.hashCode(this.isRecycleBin);
    }

    public final boolean isRecycleBin() {
        return this.isRecycleBin;
    }

    public String toString() {
        return "ListBody(skipCount=" + this.skipCount + ", maxResultCount=" + this.maxResultCount + ", isRecycleBin=" + this.isRecycleBin + ")";
    }
}
