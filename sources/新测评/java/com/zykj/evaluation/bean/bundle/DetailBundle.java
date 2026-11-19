package com.zykj.evaluation.bean.bundle;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.zykj.evaluation.p057ui.detail.GuideQuestion;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;

@StabilityInferred(parameters = 0)
@Parcelize
@Keep
@Metadata(m13557d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b&\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bu\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u000b\u0012\u0006\u0010\u0012\u001a\u00020\t\u0012\u0006\u0010\u0013\u001a\u00020\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\u000f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J\t\u0010)\u001a\u00020\tHÆ\u0003J\t\u0010*\u001a\u00020\u000bHÆ\u0003J\t\u0010+\u001a\u00020\u000bHÆ\u0003J\t\u0010,\u001a\u00020\u000bHÆ\u0003J\t\u0010-\u001a\u00020\u000bHÆ\u0003J\t\u0010.\u001a\u00020\u0010HÆ\u0003J\t\u0010/\u001a\u00020\u000bHÆ\u0003J\t\u00100\u001a\u00020\tHÆ\u0003J\t\u00101\u001a\u00020\u0010HÆ\u0003J\t\u00102\u001a\u00020\u0003HÆ\u0003J\u0091\u0001\u00103\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u000b2\b\b\u0002\u0010\u0012\u001a\u00020\t2\b\b\u0002\u0010\u0013\u001a\u00020\u00102\b\b\u0002\u0010\u0014\u001a\u00020\u0003HÆ\u0001J\u0006\u00104\u001a\u00020\tJ\u0013\u00105\u001a\u00020\u000b2\b\u00106\u001a\u0004\u0018\u000107HÖ\u0003J\t\u00108\u001a\u00020\tHÖ\u0001J\t\u00109\u001a\u00020\u0010HÖ\u0001J\u0016\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u001eR\u0011\u0010\f\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u001eR\u0011\u0010\r\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001eR\u0011\u0010\u000e\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001eR\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\u0011\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u001eR\u0011\u0010\u0012\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001dR\u0011\u0010\u0013\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\"R\u0011\u0010\u0014\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0018¨\u0006?"}, m13558d2 = {"Lcom/zykj/evaluation/bean/bundle/DetailBundle;", "Landroid/os/Parcelable;", "taskId", "", "examId", "questionList", "", "Lcom/zykj/evaluation/ui/detail/GuideQuestion;", "currentIndex", "", "isNoStem", "", "isEnableScore", "canShowAnswer", "canShowMicroClass", "examDescription", "", "isRepresentative", "specificTrainingType", "examName", "topicId", "<init>", "(JJLjava/util/List;IZZZZLjava/lang/String;ZILjava/lang/String;J)V", "getTaskId", "()J", "getExamId", "getQuestionList", "()Ljava/util/List;", "getCurrentIndex", "()I", "()Z", "getCanShowAnswer", "getCanShowMicroClass", "getExamDescription", "()Ljava/lang/String;", "getSpecificTrainingType", "getExamName", "getTopicId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "app_release"}, m13559k = 1, m13560mv = {2, 2, 0}, m13562xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class DetailBundle implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<DetailBundle> CREATOR = new Creator();
    private final boolean canShowAnswer;
    private final boolean canShowMicroClass;
    private final int currentIndex;
    private final String examDescription;
    private final long examId;
    private final String examName;
    private final boolean isEnableScore;
    private final boolean isNoStem;
    private final boolean isRepresentative;
    private final List<GuideQuestion> questionList;
    private final int specificTrainingType;
    private final long taskId;
    private final long topicId;

    @Metadata(m13559k = 3, m13560mv = {2, 2, 0}, m13562xi = 48)
    public static final class Creator implements Parcelable.Creator<DetailBundle> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DetailBundle createFromParcel(Parcel parcel) {
            boolean z9;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            long j10 = parcel.readLong();
            long j11 = parcel.readLong();
            int i10 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i10);
            for (int i11 = 0; i11 != i10; i11++) {
                arrayList.add(GuideQuestion.CREATOR.createFromParcel(parcel));
            }
            int i12 = parcel.readInt();
            boolean z10 = true;
            if (parcel.readInt() != 0) {
                z9 = true;
            } else {
                z9 = true;
                z10 = false;
            }
            return new DetailBundle(j10, j11, arrayList, i12, z10, parcel.readInt() != 0 ? z9 : false, parcel.readInt() != 0 ? z9 : false, parcel.readInt() != 0 ? z9 : false, parcel.readString(), parcel.readInt() != 0 ? z9 : false, parcel.readInt(), parcel.readString(), parcel.readLong());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DetailBundle[] newArray(int i10) {
            return new DetailBundle[i10];
        }
    }

    public DetailBundle(long j10, long j11, List<GuideQuestion> questionList, int i10, boolean z9, boolean z10, boolean z11, boolean z12, String examDescription, boolean z13, int i11, String examName, long j12) {
        Intrinsics.checkNotNullParameter(questionList, "questionList");
        Intrinsics.checkNotNullParameter(examDescription, "examDescription");
        Intrinsics.checkNotNullParameter(examName, "examName");
        this.taskId = j10;
        this.examId = j11;
        this.questionList = questionList;
        this.currentIndex = i10;
        this.isNoStem = z9;
        this.isEnableScore = z10;
        this.canShowAnswer = z11;
        this.canShowMicroClass = z12;
        this.examDescription = examDescription;
        this.isRepresentative = z13;
        this.specificTrainingType = i11;
        this.examName = examName;
        this.topicId = j12;
    }

    public static /* synthetic */ DetailBundle copy$default(DetailBundle detailBundle, long j10, long j11, List list, int i10, boolean z9, boolean z10, boolean z11, boolean z12, String str, boolean z13, int i11, String str2, long j12, int i12, Object obj) {
        long j13;
        long j14;
        long j15 = (i12 & 1) != 0 ? detailBundle.taskId : j10;
        long j16 = (i12 & 2) != 0 ? detailBundle.examId : j11;
        List list2 = (i12 & 4) != 0 ? detailBundle.questionList : list;
        int i13 = (i12 & 8) != 0 ? detailBundle.currentIndex : i10;
        boolean z14 = (i12 & 16) != 0 ? detailBundle.isNoStem : z9;
        boolean z15 = (i12 & 32) != 0 ? detailBundle.isEnableScore : z10;
        boolean z16 = (i12 & 64) != 0 ? detailBundle.canShowAnswer : z11;
        boolean z17 = (i12 & 128) != 0 ? detailBundle.canShowMicroClass : z12;
        String str3 = (i12 & 256) != 0 ? detailBundle.examDescription : str;
        boolean z18 = (i12 & 512) != 0 ? detailBundle.isRepresentative : z13;
        int i14 = (i12 & 1024) != 0 ? detailBundle.specificTrainingType : i11;
        String str4 = (i12 & 2048) != 0 ? detailBundle.examName : str2;
        if ((i12 & 4096) != 0) {
            j13 = detailBundle.topicId;
            j14 = j15;
        } else {
            j13 = j12;
            j14 = j15;
        }
        return detailBundle.copy(j14, j16, list2, i13, z14, z15, z16, z17, str3, z18, i14, str4, j13);
    }

    /* renamed from: component1, reason: from getter */
    public final long getTaskId() {
        return this.taskId;
    }

    /* renamed from: component10, reason: from getter */
    public final boolean getIsRepresentative() {
        return this.isRepresentative;
    }

    /* renamed from: component11, reason: from getter */
    public final int getSpecificTrainingType() {
        return this.specificTrainingType;
    }

    /* renamed from: component12, reason: from getter */
    public final String getExamName() {
        return this.examName;
    }

    /* renamed from: component13, reason: from getter */
    public final long getTopicId() {
        return this.topicId;
    }

    /* renamed from: component2, reason: from getter */
    public final long getExamId() {
        return this.examId;
    }

    public final List<GuideQuestion> component3() {
        return this.questionList;
    }

    /* renamed from: component4, reason: from getter */
    public final int getCurrentIndex() {
        return this.currentIndex;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsNoStem() {
        return this.isNoStem;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getIsEnableScore() {
        return this.isEnableScore;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getCanShowAnswer() {
        return this.canShowAnswer;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getCanShowMicroClass() {
        return this.canShowMicroClass;
    }

    /* renamed from: component9, reason: from getter */
    public final String getExamDescription() {
        return this.examDescription;
    }

    public final DetailBundle copy(long taskId, long examId, List<GuideQuestion> questionList, int currentIndex, boolean isNoStem, boolean isEnableScore, boolean canShowAnswer, boolean canShowMicroClass, String examDescription, boolean isRepresentative, int specificTrainingType, String examName, long topicId) {
        Intrinsics.checkNotNullParameter(questionList, "questionList");
        Intrinsics.checkNotNullParameter(examDescription, "examDescription");
        Intrinsics.checkNotNullParameter(examName, "examName");
        return new DetailBundle(taskId, examId, questionList, currentIndex, isNoStem, isEnableScore, canShowAnswer, canShowMicroClass, examDescription, isRepresentative, specificTrainingType, examName, topicId);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DetailBundle)) {
            return false;
        }
        DetailBundle detailBundle = (DetailBundle) other;
        return this.taskId == detailBundle.taskId && this.examId == detailBundle.examId && Intrinsics.areEqual(this.questionList, detailBundle.questionList) && this.currentIndex == detailBundle.currentIndex && this.isNoStem == detailBundle.isNoStem && this.isEnableScore == detailBundle.isEnableScore && this.canShowAnswer == detailBundle.canShowAnswer && this.canShowMicroClass == detailBundle.canShowMicroClass && Intrinsics.areEqual(this.examDescription, detailBundle.examDescription) && this.isRepresentative == detailBundle.isRepresentative && this.specificTrainingType == detailBundle.specificTrainingType && Intrinsics.areEqual(this.examName, detailBundle.examName) && this.topicId == detailBundle.topicId;
    }

    public final boolean getCanShowAnswer() {
        return this.canShowAnswer;
    }

    public final boolean getCanShowMicroClass() {
        return this.canShowMicroClass;
    }

    public final int getCurrentIndex() {
        return this.currentIndex;
    }

    public final String getExamDescription() {
        return this.examDescription;
    }

    public final long getExamId() {
        return this.examId;
    }

    public final String getExamName() {
        return this.examName;
    }

    public final List<GuideQuestion> getQuestionList() {
        return this.questionList;
    }

    public final int getSpecificTrainingType() {
        return this.specificTrainingType;
    }

    public final long getTaskId() {
        return this.taskId;
    }

    public final long getTopicId() {
        return this.topicId;
    }

    public int hashCode() {
        return (((((((((((((((((((((((Long.hashCode(this.taskId) * 31) + Long.hashCode(this.examId)) * 31) + this.questionList.hashCode()) * 31) + Integer.hashCode(this.currentIndex)) * 31) + Boolean.hashCode(this.isNoStem)) * 31) + Boolean.hashCode(this.isEnableScore)) * 31) + Boolean.hashCode(this.canShowAnswer)) * 31) + Boolean.hashCode(this.canShowMicroClass)) * 31) + this.examDescription.hashCode()) * 31) + Boolean.hashCode(this.isRepresentative)) * 31) + Integer.hashCode(this.specificTrainingType)) * 31) + this.examName.hashCode()) * 31) + Long.hashCode(this.topicId);
    }

    public final boolean isEnableScore() {
        return this.isEnableScore;
    }

    public final boolean isNoStem() {
        return this.isNoStem;
    }

    public final boolean isRepresentative() {
        return this.isRepresentative;
    }

    public String toString() {
        return "DetailBundle(taskId=" + this.taskId + ", examId=" + this.examId + ", questionList=" + this.questionList + ", currentIndex=" + this.currentIndex + ", isNoStem=" + this.isNoStem + ", isEnableScore=" + this.isEnableScore + ", canShowAnswer=" + this.canShowAnswer + ", canShowMicroClass=" + this.canShowMicroClass + ", examDescription=" + this.examDescription + ", isRepresentative=" + this.isRepresentative + ", specificTrainingType=" + this.specificTrainingType + ", examName=" + this.examName + ", topicId=" + this.topicId + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeLong(this.taskId);
        dest.writeLong(this.examId);
        List<GuideQuestion> list = this.questionList;
        dest.writeInt(list.size());
        Iterator<GuideQuestion> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(dest, flags);
        }
        dest.writeInt(this.currentIndex);
        dest.writeInt(this.isNoStem ? 1 : 0);
        dest.writeInt(this.isEnableScore ? 1 : 0);
        dest.writeInt(this.canShowAnswer ? 1 : 0);
        dest.writeInt(this.canShowMicroClass ? 1 : 0);
        dest.writeString(this.examDescription);
        dest.writeInt(this.isRepresentative ? 1 : 0);
        dest.writeInt(this.specificTrainingType);
        dest.writeString(this.examName);
        dest.writeLong(this.topicId);
    }
}
