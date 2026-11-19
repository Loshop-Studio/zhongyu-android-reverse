package com.friday.common.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import kotlin.jvm.internal.AbstractC9979u;

@StabilityInferred(parameters = 0)
@Entity
/* loaded from: classes3.dex */
public final class ResourceEntity implements Parcelable {
    private final String createTimeStamp;
    private final String fileId;

    /* renamed from: id */
    @PrimaryKey(autoGenerate = false)
    private final String f6033id;
    private final String md5;
    private final String ossImageUrl;
    private final int pageIndex;
    private final String pageName;
    private final int resourceType;
    private final boolean toBeUploaded;
    private final String updateTimeStamp;
    private final long userId;
    private final boolean wasDeleted;
    public static final Parcelable.Creator<ResourceEntity> CREATOR = new Creator();
    public static final int $stable = 8;

    public static final class Creator implements Parcelable.Creator<ResourceEntity> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ResourceEntity createFromParcel(Parcel parcel) {
            boolean z10;
            AbstractC9979u.m20294g(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            int i10 = parcel.readInt();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            long j10 = parcel.readLong();
            int i11 = parcel.readInt();
            boolean z11 = false;
            if (parcel.readInt() != 0) {
                z10 = false;
                z11 = true;
            } else {
                z10 = false;
            }
            return new ResourceEntity(string, string2, string3, i10, string4, string5, j10, i11, z11, parcel.readInt() == 0 ? z10 : true, parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ResourceEntity[] newArray(int i10) {
            return new ResourceEntity[i10];
        }
    }

    public ResourceEntity(String id2, String fileId, String pageName, int i10, String ossImageUrl, String md5, long j10, int i11, boolean z10, boolean z11, String str, String str2) {
        AbstractC9979u.m20294g(id2, "id");
        AbstractC9979u.m20294g(fileId, "fileId");
        AbstractC9979u.m20294g(pageName, "pageName");
        AbstractC9979u.m20294g(ossImageUrl, "ossImageUrl");
        AbstractC9979u.m20294g(md5, "md5");
        this.f6033id = id2;
        this.fileId = fileId;
        this.pageName = pageName;
        this.pageIndex = i10;
        this.ossImageUrl = ossImageUrl;
        this.md5 = md5;
        this.userId = j10;
        this.resourceType = i11;
        this.toBeUploaded = z10;
        this.wasDeleted = z11;
        this.createTimeStamp = str;
        this.updateTimeStamp = str2;
    }

    public static /* synthetic */ ResourceEntity copy$default(ResourceEntity resourceEntity, String str, String str2, String str3, int i10, String str4, String str5, long j10, int i11, boolean z10, boolean z11, String str6, String str7, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = resourceEntity.f6033id;
        }
        return resourceEntity.copy(str, (i12 & 2) != 0 ? resourceEntity.fileId : str2, (i12 & 4) != 0 ? resourceEntity.pageName : str3, (i12 & 8) != 0 ? resourceEntity.pageIndex : i10, (i12 & 16) != 0 ? resourceEntity.ossImageUrl : str4, (i12 & 32) != 0 ? resourceEntity.md5 : str5, (i12 & 64) != 0 ? resourceEntity.userId : j10, (i12 & 128) != 0 ? resourceEntity.resourceType : i11, (i12 & 256) != 0 ? resourceEntity.toBeUploaded : z10, (i12 & 512) != 0 ? resourceEntity.wasDeleted : z11, (i12 & 1024) != 0 ? resourceEntity.createTimeStamp : str6, (i12 & 2048) != 0 ? resourceEntity.updateTimeStamp : str7);
    }

    public final String component1() {
        return this.f6033id;
    }

    public final boolean component10() {
        return this.wasDeleted;
    }

    public final String component11() {
        return this.createTimeStamp;
    }

    public final String component12() {
        return this.updateTimeStamp;
    }

    public final String component2() {
        return this.fileId;
    }

    public final String component3() {
        return this.pageName;
    }

    public final int component4() {
        return this.pageIndex;
    }

    public final String component5() {
        return this.ossImageUrl;
    }

    public final String component6() {
        return this.md5;
    }

    public final long component7() {
        return this.userId;
    }

    public final int component8() {
        return this.resourceType;
    }

    public final boolean component9() {
        return this.toBeUploaded;
    }

    public final ResourceEntity copy(String id2, String fileId, String pageName, int i10, String ossImageUrl, String md5, long j10, int i11, boolean z10, boolean z11, String str, String str2) {
        AbstractC9979u.m20294g(id2, "id");
        AbstractC9979u.m20294g(fileId, "fileId");
        AbstractC9979u.m20294g(pageName, "pageName");
        AbstractC9979u.m20294g(ossImageUrl, "ossImageUrl");
        AbstractC9979u.m20294g(md5, "md5");
        return new ResourceEntity(id2, fileId, pageName, i10, ossImageUrl, md5, j10, i11, z10, z11, str, str2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResourceEntity)) {
            return false;
        }
        ResourceEntity resourceEntity = (ResourceEntity) obj;
        return AbstractC9979u.m20289b(this.f6033id, resourceEntity.f6033id) && AbstractC9979u.m20289b(this.fileId, resourceEntity.fileId) && AbstractC9979u.m20289b(this.pageName, resourceEntity.pageName) && this.pageIndex == resourceEntity.pageIndex && AbstractC9979u.m20289b(this.ossImageUrl, resourceEntity.ossImageUrl) && AbstractC9979u.m20289b(this.md5, resourceEntity.md5) && this.userId == resourceEntity.userId && this.resourceType == resourceEntity.resourceType && this.toBeUploaded == resourceEntity.toBeUploaded && this.wasDeleted == resourceEntity.wasDeleted && AbstractC9979u.m20289b(this.createTimeStamp, resourceEntity.createTimeStamp) && AbstractC9979u.m20289b(this.updateTimeStamp, resourceEntity.updateTimeStamp);
    }

    public final String getCreateTimeStamp() {
        return this.createTimeStamp;
    }

    public final String getFileId() {
        return this.fileId;
    }

    public final String getId() {
        return this.f6033id;
    }

    public final String getMd5() {
        return this.md5;
    }

    public final String getOssImageUrl() {
        return this.ossImageUrl;
    }

    public final int getPageIndex() {
        return this.pageIndex;
    }

    public final String getPageName() {
        return this.pageName;
    }

    public final int getResourceType() {
        return this.resourceType;
    }

    public final boolean getToBeUploaded() {
        return this.toBeUploaded;
    }

    public final String getUpdateTimeStamp() {
        return this.updateTimeStamp;
    }

    public final long getUserId() {
        return this.userId;
    }

    public final boolean getWasDeleted() {
        return this.wasDeleted;
    }

    public int hashCode() {
        int iHashCode = ((((((((((((((((((this.f6033id.hashCode() * 31) + this.fileId.hashCode()) * 31) + this.pageName.hashCode()) * 31) + Integer.hashCode(this.pageIndex)) * 31) + this.ossImageUrl.hashCode()) * 31) + this.md5.hashCode()) * 31) + Long.hashCode(this.userId)) * 31) + Integer.hashCode(this.resourceType)) * 31) + Boolean.hashCode(this.toBeUploaded)) * 31) + Boolean.hashCode(this.wasDeleted)) * 31;
        String str = this.createTimeStamp;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.updateTimeStamp;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final ResourceEntity mapSelf(String newId) {
        AbstractC9979u.m20294g(newId, "newId");
        return new ResourceEntity(newId, this.fileId, this.pageName, this.pageIndex, this.ossImageUrl, this.md5, this.userId, this.resourceType, this.toBeUploaded, this.wasDeleted, this.createTimeStamp, this.updateTimeStamp);
    }

    public String toString() {
        return "ResourceEntity(id=" + this.f6033id + ", fileId=" + this.fileId + ", pageName=" + this.pageName + ", pageIndex=" + this.pageIndex + ", ossImageUrl=" + this.ossImageUrl + ", md5=" + this.md5 + ", userId=" + this.userId + ", resourceType=" + this.resourceType + ", toBeUploaded=" + this.toBeUploaded + ", wasDeleted=" + this.wasDeleted + ", createTimeStamp=" + this.createTimeStamp + ", updateTimeStamp=" + this.updateTimeStamp + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i10) {
        AbstractC9979u.m20294g(dest, "dest");
        dest.writeString(this.f6033id);
        dest.writeString(this.fileId);
        dest.writeString(this.pageName);
        dest.writeInt(this.pageIndex);
        dest.writeString(this.ossImageUrl);
        dest.writeString(this.md5);
        dest.writeLong(this.userId);
        dest.writeInt(this.resourceType);
        dest.writeInt(this.toBeUploaded ? 1 : 0);
        dest.writeInt(this.wasDeleted ? 1 : 0);
        dest.writeString(this.createTimeStamp);
        dest.writeString(this.updateTimeStamp);
    }
}
