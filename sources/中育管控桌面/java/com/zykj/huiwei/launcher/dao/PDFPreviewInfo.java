package com.zykj.huiwei.launcher.dao;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred(parameters = 1)
@Keep
@Metadata(m7879d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, m7880d2 = {"Lcom/zykj/huiwei/launcher/dao/PDFPreviewInfo;", "", "path", "", "pageIndex", "", "pageOffset", "", "<init>", "(Ljava/lang/String;IF)V", "getPath", "()Ljava/lang/String;", "getPageIndex", "()I", "getPageOffset", "()F", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "app_release"}, m7881k = 1, m7882mv = {2, 2, 0}, m7884xi = 48)
@Entity(tableName = "previewInfo")
/* loaded from: classes4.dex */
public final /* data */ class PDFPreviewInfo {
    public static final int $stable = 0;

    @ColumnInfo
    private final int pageIndex;

    @ColumnInfo
    private final float pageOffset;

    @PrimaryKey
    private final String path;

    public PDFPreviewInfo(String path, int i6, float f6) {
        Intrinsics.checkNotNullParameter(path, "path");
        this.path = path;
        this.pageIndex = i6;
        this.pageOffset = f6;
    }

    public static /* synthetic */ PDFPreviewInfo copy$default(PDFPreviewInfo pDFPreviewInfo, String str, int i6, float f6, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = pDFPreviewInfo.path;
        }
        if ((i7 & 2) != 0) {
            i6 = pDFPreviewInfo.pageIndex;
        }
        if ((i7 & 4) != 0) {
            f6 = pDFPreviewInfo.pageOffset;
        }
        return pDFPreviewInfo.copy(str, i6, f6);
    }

    /* renamed from: component1, reason: from getter */
    public final String getPath() {
        return this.path;
    }

    /* renamed from: component2, reason: from getter */
    public final int getPageIndex() {
        return this.pageIndex;
    }

    /* renamed from: component3, reason: from getter */
    public final float getPageOffset() {
        return this.pageOffset;
    }

    public final PDFPreviewInfo copy(String path, int pageIndex, float pageOffset) {
        Intrinsics.checkNotNullParameter(path, "path");
        return new PDFPreviewInfo(path, pageIndex, pageOffset);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PDFPreviewInfo)) {
            return false;
        }
        PDFPreviewInfo pDFPreviewInfo = (PDFPreviewInfo) other;
        return Intrinsics.areEqual(this.path, pDFPreviewInfo.path) && this.pageIndex == pDFPreviewInfo.pageIndex && Float.compare(this.pageOffset, pDFPreviewInfo.pageOffset) == 0;
    }

    public final int getPageIndex() {
        return this.pageIndex;
    }

    public final float getPageOffset() {
        return this.pageOffset;
    }

    public final String getPath() {
        return this.path;
    }

    public int hashCode() {
        return (((this.path.hashCode() * 31) + Integer.hashCode(this.pageIndex)) * 31) + Float.hashCode(this.pageOffset);
    }

    public String toString() {
        return "PDFPreviewInfo(path=" + this.path + ", pageIndex=" + this.pageIndex + ", pageOffset=" + this.pageOffset + ")";
    }
}
