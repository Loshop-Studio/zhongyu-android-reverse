package com.zykj.student.dialogue.bean.resp;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.android.parcel.Parcelize;

@StabilityInferred(parameters = 1)
@Parcelize
@Keep
@Metadata(m13412d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u001f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bg\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0006\u0010\u001d\u001a\u00020\u0003J\u0006\u0010\u001e\u001a\u00020\u0003J\u0006\u0010\u001f\u001a\u00020\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\rHÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J}\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010,\u001a\u00020-J\u0013\u0010.\u001a\u00020\r2\b\u0010/\u001a\u0004\u0018\u000100HÖ\u0003J\t\u00101\u001a\u00020-HÖ\u0001J\t\u00102\u001a\u00020\u0003HÖ\u0001J\u0016\u00103\u001a\u0002042\u0006\u00105\u001a\u0002062\u0006\u00107\u001a\u00020-R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0012R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0012R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u001bR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0012¨\u00068"}, m13413d2 = {"Lcom/zykj/student/dialogue/bean/resp/CollectSession;", "Landroid/os/Parcelable;", "courseId", "", "collectTime", "snapshot", "summary", "askUserName", "askUserPhoto", "className", "topicName", "id", "isCollect", "", "updateTime", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V", "getCourseId", "()Ljava/lang/String;", "getCollectTime", "getSnapshot", "getSummary", "getAskUserName", "getAskUserPhoto", "getClassName", "getTopicName", "getId", "()Z", "getUpdateTime", "parseCollectTime", "parseUpdateTime", "getFormatSummary", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "app_release"}, m13414k = 1, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes5.dex */
public final /* data */ class CollectSession implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<CollectSession> CREATOR = new Creator();
    private final String askUserName;
    private final String askUserPhoto;

    @SerializedName("class")
    private final String className;
    private final String collectTime;
    private final String courseId;
    private final String id;
    private final boolean isCollect;
    private final String snapshot;
    private final String summary;
    private final String topicName;
    private final String updateTime;

    @Metadata(m13414k = 3, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Creator implements Parcelable.Creator<CollectSession> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CollectSession createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CollectSession(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CollectSession[] newArray(int i9) {
            return new CollectSession[i9];
        }
    }

    public CollectSession(String courseId, String collectTime, String snapshot, String str, String askUserName, String str2, String className, String topicName, String id, boolean z9, String str3) {
        Intrinsics.checkNotNullParameter(courseId, "courseId");
        Intrinsics.checkNotNullParameter(collectTime, "collectTime");
        Intrinsics.checkNotNullParameter(snapshot, "snapshot");
        Intrinsics.checkNotNullParameter(askUserName, "askUserName");
        Intrinsics.checkNotNullParameter(className, "className");
        Intrinsics.checkNotNullParameter(topicName, "topicName");
        Intrinsics.checkNotNullParameter(id, "id");
        this.courseId = courseId;
        this.collectTime = collectTime;
        this.snapshot = snapshot;
        this.summary = str;
        this.askUserName = askUserName;
        this.askUserPhoto = str2;
        this.className = className;
        this.topicName = topicName;
        this.id = id;
        this.isCollect = z9;
        this.updateTime = str3;
    }

    public static /* synthetic */ CollectSession copy$default(CollectSession collectSession, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, boolean z9, String str10, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            str = collectSession.courseId;
        }
        if ((i9 & 2) != 0) {
            str2 = collectSession.collectTime;
        }
        if ((i9 & 4) != 0) {
            str3 = collectSession.snapshot;
        }
        if ((i9 & 8) != 0) {
            str4 = collectSession.summary;
        }
        if ((i9 & 16) != 0) {
            str5 = collectSession.askUserName;
        }
        if ((i9 & 32) != 0) {
            str6 = collectSession.askUserPhoto;
        }
        if ((i9 & 64) != 0) {
            str7 = collectSession.className;
        }
        if ((i9 & 128) != 0) {
            str8 = collectSession.topicName;
        }
        if ((i9 & 256) != 0) {
            str9 = collectSession.id;
        }
        if ((i9 & 512) != 0) {
            z9 = collectSession.isCollect;
        }
        if ((i9 & 1024) != 0) {
            str10 = collectSession.updateTime;
        }
        boolean z10 = z9;
        String str11 = str10;
        String str12 = str8;
        String str13 = str9;
        String str14 = str6;
        String str15 = str7;
        String str16 = str5;
        String str17 = str3;
        return collectSession.copy(str, str2, str17, str4, str16, str14, str15, str12, str13, z10, str11);
    }

    /* renamed from: component1, reason: from getter */
    public final String getCourseId() {
        return this.courseId;
    }

    /* renamed from: component10, reason: from getter */
    public final boolean getIsCollect() {
        return this.isCollect;
    }

    /* renamed from: component11, reason: from getter */
    public final String getUpdateTime() {
        return this.updateTime;
    }

    /* renamed from: component2, reason: from getter */
    public final String getCollectTime() {
        return this.collectTime;
    }

    /* renamed from: component3, reason: from getter */
    public final String getSnapshot() {
        return this.snapshot;
    }

    /* renamed from: component4, reason: from getter */
    public final String getSummary() {
        return this.summary;
    }

    /* renamed from: component5, reason: from getter */
    public final String getAskUserName() {
        return this.askUserName;
    }

    /* renamed from: component6, reason: from getter */
    public final String getAskUserPhoto() {
        return this.askUserPhoto;
    }

    /* renamed from: component7, reason: from getter */
    public final String getClassName() {
        return this.className;
    }

    /* renamed from: component8, reason: from getter */
    public final String getTopicName() {
        return this.topicName;
    }

    /* renamed from: component9, reason: from getter */
    public final String getId() {
        return this.id;
    }

    public final CollectSession copy(String courseId, String collectTime, String snapshot, String summary, String askUserName, String askUserPhoto, String className, String topicName, String id, boolean isCollect, String updateTime) {
        Intrinsics.checkNotNullParameter(courseId, "courseId");
        Intrinsics.checkNotNullParameter(collectTime, "collectTime");
        Intrinsics.checkNotNullParameter(snapshot, "snapshot");
        Intrinsics.checkNotNullParameter(askUserName, "askUserName");
        Intrinsics.checkNotNullParameter(className, "className");
        Intrinsics.checkNotNullParameter(topicName, "topicName");
        Intrinsics.checkNotNullParameter(id, "id");
        return new CollectSession(courseId, collectTime, snapshot, summary, askUserName, askUserPhoto, className, topicName, id, isCollect, updateTime);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CollectSession)) {
            return false;
        }
        CollectSession collectSession = (CollectSession) other;
        return Intrinsics.areEqual(this.courseId, collectSession.courseId) && Intrinsics.areEqual(this.collectTime, collectSession.collectTime) && Intrinsics.areEqual(this.snapshot, collectSession.snapshot) && Intrinsics.areEqual(this.summary, collectSession.summary) && Intrinsics.areEqual(this.askUserName, collectSession.askUserName) && Intrinsics.areEqual(this.askUserPhoto, collectSession.askUserPhoto) && Intrinsics.areEqual(this.className, collectSession.className) && Intrinsics.areEqual(this.topicName, collectSession.topicName) && Intrinsics.areEqual(this.id, collectSession.id) && this.isCollect == collectSession.isCollect && Intrinsics.areEqual(this.updateTime, collectSession.updateTime);
    }

    public final String getAskUserName() {
        return this.askUserName;
    }

    public final String getAskUserPhoto() {
        return this.askUserPhoto;
    }

    public final String getClassName() {
        return this.className;
    }

    public final String getCollectTime() {
        return this.collectTime;
    }

    public final String getCourseId() {
        return this.courseId;
    }

    public final String getFormatSummary() {
        String str = this.summary;
        if (str == null) {
            return "";
        }
        if (str.length() <= 15) {
            return this.summary;
        }
        return this.summary.subSequence(0, 15) + "...";
    }

    public final String getId() {
        return this.id;
    }

    public final String getSnapshot() {
        return this.snapshot;
    }

    public final String getSummary() {
        return this.summary;
    }

    public final String getTopicName() {
        return this.topicName;
    }

    public final String getUpdateTime() {
        return this.updateTime;
    }

    public int hashCode() {
        int iHashCode = ((((this.courseId.hashCode() * 31) + this.collectTime.hashCode()) * 31) + this.snapshot.hashCode()) * 31;
        String str = this.summary;
        int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.askUserName.hashCode()) * 31;
        String str2 = this.askUserPhoto;
        int iHashCode3 = (((((((((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.className.hashCode()) * 31) + this.topicName.hashCode()) * 31) + this.id.hashCode()) * 31) + Boolean.hashCode(this.isCollect)) * 31;
        String str3 = this.updateTime;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final boolean isCollect() {
        return this.isCollect;
    }

    public final String parseCollectTime() {
        if (this.collectTime.length() != 19) {
            return this.collectTime;
        }
        String strSubstring = this.collectTime.substring(0, r0.length() - 3);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    public final String parseUpdateTime() {
        String str = this.updateTime;
        if (str == null || str.length() != 19) {
            String str2 = this.updateTime;
            return str2 == null ? "" : str2;
        }
        String strSubstring = this.updateTime.substring(0, r0.length() - 3);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    public String toString() {
        return "CollectSession(courseId=" + this.courseId + ", collectTime=" + this.collectTime + ", snapshot=" + this.snapshot + ", summary=" + this.summary + ", askUserName=" + this.askUserName + ", askUserPhoto=" + this.askUserPhoto + ", className=" + this.className + ", topicName=" + this.topicName + ", id=" + this.id + ", isCollect=" + this.isCollect + ", updateTime=" + this.updateTime + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.courseId);
        dest.writeString(this.collectTime);
        dest.writeString(this.snapshot);
        dest.writeString(this.summary);
        dest.writeString(this.askUserName);
        dest.writeString(this.askUserPhoto);
        dest.writeString(this.className);
        dest.writeString(this.topicName);
        dest.writeString(this.id);
        dest.writeInt(this.isCollect ? 1 : 0);
        dest.writeString(this.updateTime);
    }

    public /* synthetic */ CollectSession(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, boolean z9, String str10, int i9, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, str6, str7, str8, str9, z9, (i9 & 1024) != 0 ? null : str10);
    }
}
