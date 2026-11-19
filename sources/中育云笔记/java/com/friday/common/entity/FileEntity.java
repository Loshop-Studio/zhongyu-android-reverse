package com.friday.common.entity;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;
import com.alibaba.android.arouter.utils.Consts;
import com.blankj.utilcode.util.FileUtils;
import com.blankj.utilcode.util.PathUtils;
import com.friday.common.helper.C5962b;
import java.io.File;
import kotlin.jvm.internal.AbstractC9979u;
import p310qd.AbstractC10819z;

@StabilityInferred(parameters = 0)
@Entity(tableName = "File")
/* loaded from: classes3.dex */
public final class FileEntity {
    public static final int $stable = 8;
    private final long accountId;
    private final boolean cached;
    private final String createTime;

    @Ignore
    private int depth;
    private final int errorTimes;
    private final long expiredTime;

    @PrimaryKey(autoGenerate = false)
    private final String fileId;
    private final String fileName;
    private final String fileType;
    private final boolean isRecycled;
    private final boolean isShared;
    private final boolean isSync;
    private final String localFileUrl;
    private final String md5;
    private final String ossFileUrl;
    private final String parentId;
    private final String preFileId;
    private final int state;

    @Ignore
    private int syncStatus;
    private final String updateTime;
    private final int version;

    public FileEntity(String fileId, long j10, String fileName, String ossFileUrl, String localFileUrl, String fileType, String parentId, String createTime, String updateTime, int i10, boolean z10, int i11, boolean z11, String str, int i12, String str2, boolean z12, long j11, boolean z13) {
        AbstractC9979u.m20294g(fileId, "fileId");
        AbstractC9979u.m20294g(fileName, "fileName");
        AbstractC9979u.m20294g(ossFileUrl, "ossFileUrl");
        AbstractC9979u.m20294g(localFileUrl, "localFileUrl");
        AbstractC9979u.m20294g(fileType, "fileType");
        AbstractC9979u.m20294g(parentId, "parentId");
        AbstractC9979u.m20294g(createTime, "createTime");
        AbstractC9979u.m20294g(updateTime, "updateTime");
        this.fileId = fileId;
        this.accountId = j10;
        this.fileName = fileName;
        this.ossFileUrl = ossFileUrl;
        this.localFileUrl = localFileUrl;
        this.fileType = fileType;
        this.parentId = parentId;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.state = i10;
        this.isSync = z10;
        this.version = i11;
        this.isShared = z11;
        this.preFileId = str;
        this.errorTimes = i12;
        this.md5 = str2;
        this.cached = z12;
        this.expiredTime = j11;
        this.isRecycled = z13;
    }

    public static /* synthetic */ FileEntity copy$default(FileEntity fileEntity, String str, long j10, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i10, boolean z10, int i11, boolean z11, String str9, int i12, String str10, boolean z12, long j11, boolean z13, int i13, Object obj) {
        boolean z14;
        long j12;
        String str11 = (i13 & 1) != 0 ? fileEntity.fileId : str;
        long j13 = (i13 & 2) != 0 ? fileEntity.accountId : j10;
        String str12 = (i13 & 4) != 0 ? fileEntity.fileName : str2;
        String str13 = (i13 & 8) != 0 ? fileEntity.ossFileUrl : str3;
        String str14 = (i13 & 16) != 0 ? fileEntity.localFileUrl : str4;
        String str15 = (i13 & 32) != 0 ? fileEntity.fileType : str5;
        String str16 = (i13 & 64) != 0 ? fileEntity.parentId : str6;
        String str17 = (i13 & 128) != 0 ? fileEntity.createTime : str7;
        String str18 = (i13 & 256) != 0 ? fileEntity.updateTime : str8;
        int i14 = (i13 & 512) != 0 ? fileEntity.state : i10;
        boolean z15 = (i13 & 1024) != 0 ? fileEntity.isSync : z10;
        int i15 = (i13 & 2048) != 0 ? fileEntity.version : i11;
        boolean z16 = (i13 & 4096) != 0 ? fileEntity.isShared : z11;
        String str19 = str11;
        String str20 = (i13 & 8192) != 0 ? fileEntity.preFileId : str9;
        int i16 = (i13 & 16384) != 0 ? fileEntity.errorTimes : i12;
        String str21 = (i13 & 32768) != 0 ? fileEntity.md5 : str10;
        boolean z17 = (i13 & 65536) != 0 ? fileEntity.cached : z12;
        int i17 = i16;
        long j14 = (i13 & 131072) != 0 ? fileEntity.expiredTime : j11;
        if ((i13 & 262144) != 0) {
            j12 = j14;
            z14 = fileEntity.isRecycled;
        } else {
            z14 = z13;
            j12 = j14;
        }
        return fileEntity.copy(str19, j13, str12, str13, str14, str15, str16, str17, str18, i14, z15, i15, z16, str20, i17, str21, z17, j12, z14);
    }

    public final String component1() {
        return this.fileId;
    }

    public final int component10() {
        return this.state;
    }

    public final boolean component11() {
        return this.isSync;
    }

    public final int component12() {
        return this.version;
    }

    public final boolean component13() {
        return this.isShared;
    }

    public final String component14() {
        return this.preFileId;
    }

    public final int component15() {
        return this.errorTimes;
    }

    public final String component16() {
        return this.md5;
    }

    public final boolean component17() {
        return this.cached;
    }

    public final long component18() {
        return this.expiredTime;
    }

    public final boolean component19() {
        return this.isRecycled;
    }

    public final long component2() {
        return this.accountId;
    }

    public final String component3() {
        return this.fileName;
    }

    public final String component4() {
        return this.ossFileUrl;
    }

    public final String component5() {
        return this.localFileUrl;
    }

    public final String component6() {
        return this.fileType;
    }

    public final String component7() {
        return this.parentId;
    }

    public final String component8() {
        return this.createTime;
    }

    public final String component9() {
        return this.updateTime;
    }

    public final FileEntity copy(String fileId, long j10, String fileName, String ossFileUrl, String localFileUrl, String fileType, String parentId, String createTime, String updateTime, int i10, boolean z10, int i11, boolean z11, String str, int i12, String str2, boolean z12, long j11, boolean z13) {
        AbstractC9979u.m20294g(fileId, "fileId");
        AbstractC9979u.m20294g(fileName, "fileName");
        AbstractC9979u.m20294g(ossFileUrl, "ossFileUrl");
        AbstractC9979u.m20294g(localFileUrl, "localFileUrl");
        AbstractC9979u.m20294g(fileType, "fileType");
        AbstractC9979u.m20294g(parentId, "parentId");
        AbstractC9979u.m20294g(createTime, "createTime");
        AbstractC9979u.m20294g(updateTime, "updateTime");
        return new FileEntity(fileId, j10, fileName, ossFileUrl, localFileUrl, fileType, parentId, createTime, updateTime, i10, z10, i11, z11, str, i12, str2, z12, j11, z13);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FileEntity)) {
            return false;
        }
        FileEntity fileEntity = (FileEntity) obj;
        return AbstractC9979u.m20289b(this.fileId, fileEntity.fileId) && this.accountId == fileEntity.accountId && AbstractC9979u.m20289b(this.fileName, fileEntity.fileName) && AbstractC9979u.m20289b(this.ossFileUrl, fileEntity.ossFileUrl) && AbstractC9979u.m20289b(this.localFileUrl, fileEntity.localFileUrl) && AbstractC9979u.m20289b(this.fileType, fileEntity.fileType) && AbstractC9979u.m20289b(this.parentId, fileEntity.parentId) && AbstractC9979u.m20289b(this.createTime, fileEntity.createTime) && AbstractC9979u.m20289b(this.updateTime, fileEntity.updateTime) && this.state == fileEntity.state && this.isSync == fileEntity.isSync && this.version == fileEntity.version && this.isShared == fileEntity.isShared && AbstractC9979u.m20289b(this.preFileId, fileEntity.preFileId) && this.errorTimes == fileEntity.errorTimes && AbstractC9979u.m20289b(this.md5, fileEntity.md5) && this.cached == fileEntity.cached && this.expiredTime == fileEntity.expiredTime && this.isRecycled == fileEntity.isRecycled;
    }

    public final long getAccountId() {
        return this.accountId;
    }

    public final boolean getCached() {
        return this.cached;
    }

    public final String getCreateTime() {
        return this.createTime;
    }

    public final int getDepth() {
        return this.depth;
    }

    public final int getErrorTimes() {
        return this.errorTimes;
    }

    public final long getExpiredTime() {
        return this.expiredTime;
    }

    public final String getFileId() {
        return this.fileId;
    }

    public final String getFileName() {
        return this.fileName;
    }

    public final String getFileType() {
        return this.fileType;
    }

    public final String getLocalFileUrl() {
        return this.localFileUrl;
    }

    public final String getMd5() {
        return this.md5;
    }

    public final String getMicroClassCoverUrl() {
        return isMicroClass() ? AbstractC10819z.m23238K(this.ossFileUrl, ".zip", ".jpg", false, 4, null) : "";
    }

    public final String getOfficePath() {
        String fileExtension = FileUtils.getFileExtension(this.localFileUrl + this.fileName);
        return this.localFileUrl + this.fileId + Consts.DOT + fileExtension;
    }

    public final String getOssFileUrl() {
        return this.ossFileUrl;
    }

    public final String getParentId() {
        return this.parentId;
    }

    public final String getPreFileId() {
        return this.preFileId;
    }

    public final String getRealOssUrl() {
        return C5962b.f6082a.m5299a().m5277e(this.ossFileUrl);
    }

    public final int getState() {
        return this.state;
    }

    public final int getSyncStatus() {
        return this.syncStatus;
    }

    public final String getTxtFilePath() {
        if (!C5962b.f6082a.m5299a().m5294v()) {
            return this.localFileUrl + this.fileId + ".txt";
        }
        String externalAppCachePath = PathUtils.getExternalAppCachePath();
        String str = File.separator;
        return externalAppCachePath + str + "txt" + str + this.fileId + ".txt";
    }

    public final String getUpdateTime() {
        return this.updateTime;
    }

    public final int getVersion() {
        return this.version;
    }

    public final String getZipFilePath() {
        return this.localFileUrl + this.fileId + ".zip";
    }

    public int hashCode() {
        int iHashCode = ((((((((((((((((((((((((this.fileId.hashCode() * 31) + Long.hashCode(this.accountId)) * 31) + this.fileName.hashCode()) * 31) + this.ossFileUrl.hashCode()) * 31) + this.localFileUrl.hashCode()) * 31) + this.fileType.hashCode()) * 31) + this.parentId.hashCode()) * 31) + this.createTime.hashCode()) * 31) + this.updateTime.hashCode()) * 31) + Integer.hashCode(this.state)) * 31) + Boolean.hashCode(this.isSync)) * 31) + Integer.hashCode(this.version)) * 31) + Boolean.hashCode(this.isShared)) * 31;
        String str = this.preFileId;
        int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Integer.hashCode(this.errorTimes)) * 31;
        String str2 = this.md5;
        return ((((((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + Boolean.hashCode(this.cached)) * 31) + Long.hashCode(this.expiredTime)) * 31) + Boolean.hashCode(this.isRecycled);
    }

    public final boolean isFailedState() {
        int i10 = this.state;
        return i10 == 5 || i10 == 30 || i10 == 10;
    }

    public final boolean isFolder() {
        return AbstractC9979u.m20289b(this.fileType, "0");
    }

    public final boolean isMicroClass() {
        return AbstractC9979u.m20289b(this.fileType, "11");
    }

    public final boolean isOfficeAndPdfFile() {
        return AbstractC9979u.m20289b(this.fileType, "4") || AbstractC9979u.m20289b(this.fileType, "3") || AbstractC9979u.m20289b(this.fileType, "10") || AbstractC9979u.m20289b(this.fileType, FileType.PDF);
    }

    public final boolean isOfficeFile() {
        return AbstractC9979u.m20289b(this.fileType, "4") || AbstractC9979u.m20289b(this.fileType, "3") || AbstractC9979u.m20289b(this.fileType, "10");
    }

    public final boolean isRecycled() {
        return this.isRecycled;
    }

    public final boolean isShared() {
        return this.isShared;
    }

    public final boolean isSync() {
        return this.isSync;
    }

    public final void setDepth(int i10) {
        this.depth = i10;
    }

    public final void setSyncStatus(int i10) {
        this.syncStatus = i10;
    }

    public final boolean syncUncompleted() {
        return this.state != 0;
    }

    public String toString() {
        return "FileEntity(fileId=" + this.fileId + ", accountId=" + this.accountId + ", fileName=" + this.fileName + ", ossFileUrl=" + this.ossFileUrl + ", localFileUrl=" + this.localFileUrl + ", fileType=" + this.fileType + ", parentId=" + this.parentId + ", createTime=" + this.createTime + ", updateTime=" + this.updateTime + ", state=" + this.state + ", isSync=" + this.isSync + ", version=" + this.version + ", isShared=" + this.isShared + ", preFileId=" + this.preFileId + ", errorTimes=" + this.errorTimes + ", md5=" + this.md5 + ", cached=" + this.cached + ", expiredTime=" + this.expiredTime + ", isRecycled=" + this.isRecycled + ")";
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    public /* synthetic */ FileEntity(java.lang.String r26, long r27, java.lang.String r29, java.lang.String r30, java.lang.String r31, java.lang.String r32, java.lang.String r33, java.lang.String r34, java.lang.String r35, int r36, boolean r37, int r38, boolean r39, java.lang.String r40, int r41, java.lang.String r42, boolean r43, long r44, boolean r46, int r47, kotlin.jvm.internal.AbstractC9972n r48) {
        /*
            r25 = this;
            r0 = r47
            r1 = r0 & 8192(0x2000, float:1.148E-41)
            r2 = 0
            if (r1 == 0) goto La
            r18 = r2
            goto Lc
        La:
            r18 = r40
        Lc:
            r1 = r0 & 16384(0x4000, float:2.2959E-41)
            r3 = 0
            if (r1 == 0) goto L14
            r19 = r3
            goto L16
        L14:
            r19 = r41
        L16:
            r1 = 32768(0x8000, float:4.5918E-41)
            r1 = r1 & r0
            if (r1 == 0) goto L1f
            r20 = r2
            goto L21
        L1f:
            r20 = r42
        L21:
            r1 = 65536(0x10000, float:9.1835E-41)
            r1 = r1 & r0
            if (r1 == 0) goto L29
            r21 = r3
            goto L2b
        L29:
            r21 = r43
        L2b:
            r1 = 131072(0x20000, float:1.83671E-40)
            r1 = r1 & r0
            if (r1 == 0) goto L35
            r1 = 0
            r22 = r1
            goto L37
        L35:
            r22 = r44
        L37:
            r1 = 262144(0x40000, float:3.67342E-40)
            r0 = r0 & r1
            if (r0 == 0) goto L5b
            r24 = r3
            r4 = r26
            r5 = r27
            r7 = r29
            r8 = r30
            r9 = r31
            r10 = r32
            r11 = r33
            r12 = r34
            r13 = r35
            r14 = r36
            r15 = r37
            r16 = r38
            r17 = r39
            r3 = r25
            goto L79
        L5b:
            r24 = r46
            r3 = r25
            r4 = r26
            r5 = r27
            r7 = r29
            r8 = r30
            r9 = r31
            r10 = r32
            r11 = r33
            r12 = r34
            r13 = r35
            r14 = r36
            r15 = r37
            r16 = r38
            r17 = r39
        L79:
            r3.<init>(r4, r5, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r24)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.friday.common.entity.FileEntity.<init>(java.lang.String, long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, boolean, int, boolean, java.lang.String, int, java.lang.String, boolean, long, boolean, int, kotlin.jvm.internal.n):void"); // DEX body: android/中育云笔记/smali_classes3/com/friday/common/entity/FileEntity.smali:199
    }
}
