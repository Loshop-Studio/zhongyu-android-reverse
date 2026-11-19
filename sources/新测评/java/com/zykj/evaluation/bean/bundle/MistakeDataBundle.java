package com.zykj.evaluation.bean.bundle;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;

@StabilityInferred(parameters = 1)
@Parcelize
@Keep
@Metadata(m13557d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\tHÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\tHÆ\u0003JO\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\tHÆ\u0001J\u0006\u0010\u001f\u001a\u00020 J\u0013\u0010!\u001a\u00020\u00062\b\u0010\"\u001a\u0004\u0018\u00010#HÖ\u0003J\t\u0010$\u001a\u00020 HÖ\u0001J\t\u0010%\u001a\u00020\tHÖ\u0001J\u0016\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020 R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0011\u0010\u000b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014¨\u0006+"}, m13558d2 = {"Lcom/zykj/evaluation/bean/bundle/MistakeDataBundle;", "Landroid/os/Parcelable;", "taskId", "", "examId", "isRelatedGroup", "", "questionId", "stemLocalPath", "", "topicId", "examName", "<init>", "(JJZJLjava/lang/String;JLjava/lang/String;)V", "getTaskId", "()J", "getExamId", "()Z", "getQuestionId", "getStemLocalPath", "()Ljava/lang/String;", "getTopicId", "getExamName", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "app_release"}, m13559k = 1, m13560mv = {2, 2, 0}, m13562xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class MistakeDataBundle implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<MistakeDataBundle> CREATOR = new Creator();
    private final long examId;
    private final String examName;
    private final boolean isRelatedGroup;
    private final long questionId;
    private final String stemLocalPath;
    private final long taskId;
    private final long topicId;

    @Metadata(m13559k = 3, m13560mv = {2, 2, 0}, m13562xi = 48)
    public static final class Creator implements Parcelable.Creator<MistakeDataBundle> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MistakeDataBundle createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new MistakeDataBundle(parcel.readLong(), parcel.readLong(), parcel.readInt() != 0, parcel.readLong(), parcel.readString(), parcel.readLong(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MistakeDataBundle[] newArray(int i10) {
            return new MistakeDataBundle[i10];
        }
    }

    public MistakeDataBundle(long j10, long j11, boolean z9, long j12, String stemLocalPath, long j13, String examName) {
        Intrinsics.checkNotNullParameter(stemLocalPath, "stemLocalPath");
        Intrinsics.checkNotNullParameter(examName, "examName");
        this.taskId = j10;
        this.examId = j11;
        this.isRelatedGroup = z9;
        this.questionId = j12;
        this.stemLocalPath = stemLocalPath;
        this.topicId = j13;
        this.examName = examName;
    }

    public static /* synthetic */ MistakeDataBundle copy$default(MistakeDataBundle mistakeDataBundle, long j10, long j11, boolean z9, long j12, String str, long j13, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = mistakeDataBundle.taskId;
        }
        return mistakeDataBundle.copy(j10, (i10 & 2) != 0 ? mistakeDataBundle.examId : j11, (i10 & 4) != 0 ? mistakeDataBundle.isRelatedGroup : z9, (i10 & 8) != 0 ? mistakeDataBundle.questionId : j12, (i10 & 16) != 0 ? mistakeDataBundle.stemLocalPath : str, (i10 & 32) != 0 ? mistakeDataBundle.topicId : j13, (i10 & 64) != 0 ? mistakeDataBundle.examName : str2);
    }

    /* renamed from: component1, reason: from getter */
    public final long getTaskId() {
        return this.taskId;
    }

    /* renamed from: component2, reason: from getter */
    public final long getExamId() {
        return this.examId;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsRelatedGroup() {
        return this.isRelatedGroup;
    }

    /* renamed from: component4, reason: from getter */
    public final long getQuestionId() {
        return this.questionId;
    }

    /* renamed from: component5, reason: from getter */
    public final String getStemLocalPath() {
        return this.stemLocalPath;
    }

    /* renamed from: component6, reason: from getter */
    public final long getTopicId() {
        return this.topicId;
    }

    /* renamed from: component7, reason: from getter */
    public final String getExamName() {
        return this.examName;
    }

    public final MistakeDataBundle copy(long taskId, long examId, boolean isRelatedGroup, long questionId, String stemLocalPath, long topicId, String examName) {
        Intrinsics.checkNotNullParameter(stemLocalPath, "stemLocalPath");
        Intrinsics.checkNotNullParameter(examName, "examName");
        return new MistakeDataBundle(taskId, examId, isRelatedGroup, questionId, stemLocalPath, topicId, examName);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MistakeDataBundle)) {
            return false;
        }
        MistakeDataBundle mistakeDataBundle = (MistakeDataBundle) other;
        return this.taskId == mistakeDataBundle.taskId && this.examId == mistakeDataBundle.examId && this.isRelatedGroup == mistakeDataBundle.isRelatedGroup && this.questionId == mistakeDataBundle.questionId && Intrinsics.areEqual(this.stemLocalPath, mistakeDataBundle.stemLocalPath) && this.topicId == mistakeDataBundle.topicId && Intrinsics.areEqual(this.examName, mistakeDataBundle.examName);
    }

    public final long getExamId() {
        return this.examId;
    }

    public final String getExamName() {
        return this.examName;
    }

    public final long getQuestionId() {
        return this.questionId;
    }

    public final String getStemLocalPath() {
        return this.stemLocalPath;
    }

    public final long getTaskId() {
        return this.taskId;
    }

    public final long getTopicId() {
        return this.topicId;
    }

    public int hashCode() {
        return (((((((((((Long.hashCode(this.taskId) * 31) + Long.hashCode(this.examId)) * 31) + Boolean.hashCode(this.isRelatedGroup)) * 31) + Long.hashCode(this.questionId)) * 31) + this.stemLocalPath.hashCode()) * 31) + Long.hashCode(this.topicId)) * 31) + this.examName.hashCode();
    }

    public final boolean isRelatedGroup() {
        return this.isRelatedGroup;
    }

    public String toString() {
        return "MistakeDataBundle(taskId=" + this.taskId + ", examId=" + this.examId + ", isRelatedGroup=" + this.isRelatedGroup + ", questionId=" + this.questionId + ", stemLocalPath=" + this.stemLocalPath + ", topicId=" + this.topicId + ", examName=" + this.examName + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeLong(this.taskId);
        dest.writeLong(this.examId);
        dest.writeInt(this.isRelatedGroup ? 1 : 0);
        dest.writeLong(this.questionId);
        dest.writeString(this.stemLocalPath);
        dest.writeLong(this.topicId);
        dest.writeString(this.examName);
    }
}
