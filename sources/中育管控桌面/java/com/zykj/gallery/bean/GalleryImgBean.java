package com.zykj.gallery.bean;

import androidx.autofill.HintConstants;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred(parameters = 1)
@Metadata(m7879d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b1\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0099\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0003\u0012\u0006\u0010\u0015\u001a\u00020\u0003\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\t\u00100\u001a\u00020\u0003HÆ\u0003J\t\u00101\u001a\u00020\u0003HÆ\u0003J\t\u00102\u001a\u00020\u0003HÆ\u0003J\t\u00103\u001a\u00020\u0003HÆ\u0003J\t\u00104\u001a\u00020\u0003HÆ\u0003J\t\u00105\u001a\u00020\u000bHÆ\u0003J\t\u00106\u001a\u00020\u0003HÆ\u0003J\t\u00107\u001a\u00020\u0003HÆ\u0003J\t\u00108\u001a\u00020\u0003HÆ\u0003J\t\u00109\u001a\u00020\u0010HÆ\u0003J\t\u0010:\u001a\u00020\u0003HÆ\u0003J\t\u0010;\u001a\u00020\u0010HÆ\u0003J\t\u0010<\u001a\u00020\u0010HÆ\u0003J\t\u0010=\u001a\u00020\u0003HÆ\u0003J\t\u0010>\u001a\u00020\u0003HÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0003HÆ\u0003J¿\u0001\u0010@\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00102\b\b\u0002\u0010\u0014\u001a\u00020\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u00032\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010A\u001a\u00020B2\b\u0010C\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010D\u001a\u00020\u0010HÖ\u0001J\t\u0010E\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001aR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001aR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001aR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001aR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001aR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001aR\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001aR\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001aR\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0011\u0010\u0011\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001aR\u0011\u0010\u0012\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b)\u0010'R\u0011\u0010\u0013\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b*\u0010'R\u0011\u0010\u0014\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001aR\u0011\u0010\u0015\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001aR\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001a¨\u0006F"}, m7880d2 = {"Lcom/zykj/gallery/bean/GalleryImgBean;", "", "appName", "", "bucketName", "checkTime", "checkUser", "className", "createTime", "gradeName", "id", "", HintConstants.AUTOFILL_HINT_NAME, "picture", "pornResult", "pornScore", "", "size", "state", "studentId", "studentName", "studentNumber", "movedToTrashTime", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAppName", "()Ljava/lang/String;", "getBucketName", "getCheckTime", "getCheckUser", "getClassName", "getCreateTime", "getGradeName", "getId", "()J", "getName", "getPicture", "getPornResult", "getPornScore", "()I", "getSize", "getState", "getStudentId", "getStudentName", "getStudentNumber", "getMovedToTrashTime", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "copy", "equals", "", "other", "hashCode", "toString", "module_gallery_release"}, m7881k = 1, m7882mv = {2, 2, 0}, m7884xi = 48)
/* loaded from: classes.dex */
public final /* data */ class GalleryImgBean {
    public static final int $stable = 0;
    private final String appName;
    private final String bucketName;
    private final String checkTime;
    private final String checkUser;
    private final String className;
    private final String createTime;
    private final String gradeName;
    private final long id;
    private final String movedToTrashTime;
    private final String name;
    private final String picture;
    private final String pornResult;
    private final int pornScore;
    private final String size;
    private final int state;
    private final int studentId;
    private final String studentName;
    private final String studentNumber;

    public GalleryImgBean(String appName, String bucketName, String checkTime, String checkUser, String className, String createTime, String gradeName, long j6, String name, String picture, String pornResult, int i6, String size, int i7, int i8, String studentName, String studentNumber, String str) {
        Intrinsics.checkNotNullParameter(appName, "appName");
        Intrinsics.checkNotNullParameter(bucketName, "bucketName");
        Intrinsics.checkNotNullParameter(checkTime, "checkTime");
        Intrinsics.checkNotNullParameter(checkUser, "checkUser");
        Intrinsics.checkNotNullParameter(className, "className");
        Intrinsics.checkNotNullParameter(createTime, "createTime");
        Intrinsics.checkNotNullParameter(gradeName, "gradeName");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(picture, "picture");
        Intrinsics.checkNotNullParameter(pornResult, "pornResult");
        Intrinsics.checkNotNullParameter(size, "size");
        Intrinsics.checkNotNullParameter(studentName, "studentName");
        Intrinsics.checkNotNullParameter(studentNumber, "studentNumber");
        this.appName = appName;
        this.bucketName = bucketName;
        this.checkTime = checkTime;
        this.checkUser = checkUser;
        this.className = className;
        this.createTime = createTime;
        this.gradeName = gradeName;
        this.id = j6;
        this.name = name;
        this.picture = picture;
        this.pornResult = pornResult;
        this.pornScore = i6;
        this.size = size;
        this.state = i7;
        this.studentId = i8;
        this.studentName = studentName;
        this.studentNumber = studentNumber;
        this.movedToTrashTime = str;
    }

    public static /* synthetic */ GalleryImgBean copy$default(GalleryImgBean galleryImgBean, String str, String str2, String str3, String str4, String str5, String str6, String str7, long j6, String str8, String str9, String str10, int i6, String str11, int i7, int i8, String str12, String str13, String str14, int i9, Object obj) {
        String str15;
        String str16;
        String str17 = (i9 & 1) != 0 ? galleryImgBean.appName : str;
        String str18 = (i9 & 2) != 0 ? galleryImgBean.bucketName : str2;
        String str19 = (i9 & 4) != 0 ? galleryImgBean.checkTime : str3;
        String str20 = (i9 & 8) != 0 ? galleryImgBean.checkUser : str4;
        String str21 = (i9 & 16) != 0 ? galleryImgBean.className : str5;
        String str22 = (i9 & 32) != 0 ? galleryImgBean.createTime : str6;
        String str23 = (i9 & 64) != 0 ? galleryImgBean.gradeName : str7;
        long j7 = (i9 & 128) != 0 ? galleryImgBean.id : j6;
        String str24 = (i9 & 256) != 0 ? galleryImgBean.name : str8;
        String str25 = (i9 & 512) != 0 ? galleryImgBean.picture : str9;
        String str26 = (i9 & 1024) != 0 ? galleryImgBean.pornResult : str10;
        int i10 = (i9 & 2048) != 0 ? galleryImgBean.pornScore : i6;
        String str27 = (i9 & 4096) != 0 ? galleryImgBean.size : str11;
        String str28 = str17;
        int i11 = (i9 & 8192) != 0 ? galleryImgBean.state : i7;
        int i12 = (i9 & 16384) != 0 ? galleryImgBean.studentId : i8;
        String str29 = (i9 & 32768) != 0 ? galleryImgBean.studentName : str12;
        String str30 = (i9 & 65536) != 0 ? galleryImgBean.studentNumber : str13;
        if ((i9 & 131072) != 0) {
            str16 = str30;
            str15 = galleryImgBean.movedToTrashTime;
        } else {
            str15 = str14;
            str16 = str30;
        }
        return galleryImgBean.copy(str28, str18, str19, str20, str21, str22, str23, j7, str24, str25, str26, i10, str27, i11, i12, str29, str16, str15);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAppName() {
        return this.appName;
    }

    /* renamed from: component10, reason: from getter */
    public final String getPicture() {
        return this.picture;
    }

    /* renamed from: component11, reason: from getter */
    public final String getPornResult() {
        return this.pornResult;
    }

    /* renamed from: component12, reason: from getter */
    public final int getPornScore() {
        return this.pornScore;
    }

    /* renamed from: component13, reason: from getter */
    public final String getSize() {
        return this.size;
    }

    /* renamed from: component14, reason: from getter */
    public final int getState() {
        return this.state;
    }

    /* renamed from: component15, reason: from getter */
    public final int getStudentId() {
        return this.studentId;
    }

    /* renamed from: component16, reason: from getter */
    public final String getStudentName() {
        return this.studentName;
    }

    /* renamed from: component17, reason: from getter */
    public final String getStudentNumber() {
        return this.studentNumber;
    }

    /* renamed from: component18, reason: from getter */
    public final String getMovedToTrashTime() {
        return this.movedToTrashTime;
    }

    /* renamed from: component2, reason: from getter */
    public final String getBucketName() {
        return this.bucketName;
    }

    /* renamed from: component3, reason: from getter */
    public final String getCheckTime() {
        return this.checkTime;
    }

    /* renamed from: component4, reason: from getter */
    public final String getCheckUser() {
        return this.checkUser;
    }

    /* renamed from: component5, reason: from getter */
    public final String getClassName() {
        return this.className;
    }

    /* renamed from: component6, reason: from getter */
    public final String getCreateTime() {
        return this.createTime;
    }

    /* renamed from: component7, reason: from getter */
    public final String getGradeName() {
        return this.gradeName;
    }

    /* renamed from: component8, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* renamed from: component9, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public final GalleryImgBean copy(String appName, String bucketName, String checkTime, String checkUser, String className, String createTime, String gradeName, long id, String name, String picture, String pornResult, int pornScore, String size, int state, int studentId, String studentName, String studentNumber, String movedToTrashTime) {
        Intrinsics.checkNotNullParameter(appName, "appName");
        Intrinsics.checkNotNullParameter(bucketName, "bucketName");
        Intrinsics.checkNotNullParameter(checkTime, "checkTime");
        Intrinsics.checkNotNullParameter(checkUser, "checkUser");
        Intrinsics.checkNotNullParameter(className, "className");
        Intrinsics.checkNotNullParameter(createTime, "createTime");
        Intrinsics.checkNotNullParameter(gradeName, "gradeName");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(picture, "picture");
        Intrinsics.checkNotNullParameter(pornResult, "pornResult");
        Intrinsics.checkNotNullParameter(size, "size");
        Intrinsics.checkNotNullParameter(studentName, "studentName");
        Intrinsics.checkNotNullParameter(studentNumber, "studentNumber");
        return new GalleryImgBean(appName, bucketName, checkTime, checkUser, className, createTime, gradeName, id, name, picture, pornResult, pornScore, size, state, studentId, studentName, studentNumber, movedToTrashTime);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GalleryImgBean)) {
            return false;
        }
        GalleryImgBean galleryImgBean = (GalleryImgBean) other;
        return Intrinsics.areEqual(this.appName, galleryImgBean.appName) && Intrinsics.areEqual(this.bucketName, galleryImgBean.bucketName) && Intrinsics.areEqual(this.checkTime, galleryImgBean.checkTime) && Intrinsics.areEqual(this.checkUser, galleryImgBean.checkUser) && Intrinsics.areEqual(this.className, galleryImgBean.className) && Intrinsics.areEqual(this.createTime, galleryImgBean.createTime) && Intrinsics.areEqual(this.gradeName, galleryImgBean.gradeName) && this.id == galleryImgBean.id && Intrinsics.areEqual(this.name, galleryImgBean.name) && Intrinsics.areEqual(this.picture, galleryImgBean.picture) && Intrinsics.areEqual(this.pornResult, galleryImgBean.pornResult) && this.pornScore == galleryImgBean.pornScore && Intrinsics.areEqual(this.size, galleryImgBean.size) && this.state == galleryImgBean.state && this.studentId == galleryImgBean.studentId && Intrinsics.areEqual(this.studentName, galleryImgBean.studentName) && Intrinsics.areEqual(this.studentNumber, galleryImgBean.studentNumber) && Intrinsics.areEqual(this.movedToTrashTime, galleryImgBean.movedToTrashTime);
    }

    public final String getAppName() {
        return this.appName;
    }

    public final String getBucketName() {
        return this.bucketName;
    }

    public final String getCheckTime() {
        return this.checkTime;
    }

    public final String getCheckUser() {
        return this.checkUser;
    }

    public final String getClassName() {
        return this.className;
    }

    public final String getCreateTime() {
        return this.createTime;
    }

    public final String getGradeName() {
        return this.gradeName;
    }

    public final long getId() {
        return this.id;
    }

    public final String getMovedToTrashTime() {
        return this.movedToTrashTime;
    }

    public final String getName() {
        return this.name;
    }

    public final String getPicture() {
        return this.picture;
    }

    public final String getPornResult() {
        return this.pornResult;
    }

    public final int getPornScore() {
        return this.pornScore;
    }

    public final String getSize() {
        return this.size;
    }

    public final int getState() {
        return this.state;
    }

    public final int getStudentId() {
        return this.studentId;
    }

    public final String getStudentName() {
        return this.studentName;
    }

    public final String getStudentNumber() {
        return this.studentNumber;
    }

    public int hashCode() {
        int iHashCode = ((((((((((((((((((((((((((((((((this.appName.hashCode() * 31) + this.bucketName.hashCode()) * 31) + this.checkTime.hashCode()) * 31) + this.checkUser.hashCode()) * 31) + this.className.hashCode()) * 31) + this.createTime.hashCode()) * 31) + this.gradeName.hashCode()) * 31) + Long.hashCode(this.id)) * 31) + this.name.hashCode()) * 31) + this.picture.hashCode()) * 31) + this.pornResult.hashCode()) * 31) + Integer.hashCode(this.pornScore)) * 31) + this.size.hashCode()) * 31) + Integer.hashCode(this.state)) * 31) + Integer.hashCode(this.studentId)) * 31) + this.studentName.hashCode()) * 31) + this.studentNumber.hashCode()) * 31;
        String str = this.movedToTrashTime;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "GalleryImgBean(appName=" + this.appName + ", bucketName=" + this.bucketName + ", checkTime=" + this.checkTime + ", checkUser=" + this.checkUser + ", className=" + this.className + ", createTime=" + this.createTime + ", gradeName=" + this.gradeName + ", id=" + this.id + ", name=" + this.name + ", picture=" + this.picture + ", pornResult=" + this.pornResult + ", pornScore=" + this.pornScore + ", size=" + this.size + ", state=" + this.state + ", studentId=" + this.studentId + ", studentName=" + this.studentName + ", studentNumber=" + this.studentNumber + ", movedToTrashTime=" + this.movedToTrashTime + ")";
    }
}
