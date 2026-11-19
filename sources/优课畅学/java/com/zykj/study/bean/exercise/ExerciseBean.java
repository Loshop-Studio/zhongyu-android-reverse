package com.zykj.study.bean.exercise;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC9133u;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class ExerciseBean implements Parcelable {
    private final double avg;
    private final int completed;

    @SerializedName("quizId")
    private final long exerciseId;

    @SerializedName(alternate = {"questionGroupId"}, value = "groupId")
    private final int groupId;
    private int progress;
    private final List<QuestionBean> questions;
    private final double score;
    private ExerciseType status;
    private String title;
    private final Date updateTime;
    public static final Parcelable.Creator<ExerciseBean> CREATOR = new Creator();
    public static final int $stable = 8;

    public static final class Creator implements Parcelable.Creator<ExerciseBean> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ExerciseBean createFromParcel(Parcel parcel) {
            AbstractC9133u.m16133g(parcel, "parcel");
            long j10 = parcel.readLong();
            int i10 = parcel.readInt();
            String string = parcel.readString();
            int i11 = parcel.readInt();
            int i12 = parcel.readInt();
            double d10 = parcel.readDouble();
            Date date = (Date) parcel.readSerializable();
            double d11 = parcel.readDouble();
            int i13 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i13);
            for (int i14 = 0; i14 != i13; i14++) {
                arrayList.add(QuestionBean.CREATOR.createFromParcel(parcel));
            }
            return new ExerciseBean(j10, i10, string, i11, i12, d10, date, d11, arrayList, parcel.readInt() == 0 ? null : ExerciseType.valueOf(parcel.readString()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ExerciseBean[] newArray(int i10) {
            return new ExerciseBean[i10];
        }
    }

    public ExerciseBean(long j10, int i10, String str, int i11, int i12, double d10, Date date, double d11, List<QuestionBean> questions, ExerciseType exerciseType) {
        AbstractC9133u.m16133g(questions, "questions");
        this.exerciseId = j10;
        this.groupId = i10;
        this.title = str;
        this.progress = i11;
        this.completed = i12;
        this.avg = d10;
        this.updateTime = date;
        this.score = d11;
        this.questions = questions;
        this.status = exerciseType;
    }

    public final long component1() {
        return this.exerciseId;
    }

    public final ExerciseType component10() {
        return this.status;
    }

    public final int component2() {
        return this.groupId;
    }

    public final String component3() {
        return this.title;
    }

    public final int component4() {
        return this.progress;
    }

    public final int component5() {
        return this.completed;
    }

    public final double component6() {
        return this.avg;
    }

    public final Date component7() {
        return this.updateTime;
    }

    public final double component8() {
        return this.score;
    }

    public final List<QuestionBean> component9() {
        return this.questions;
    }

    public final ExerciseBean copy(long j10, int i10, String str, int i11, int i12, double d10, Date date, double d11, List<QuestionBean> questions, ExerciseType exerciseType) {
        AbstractC9133u.m16133g(questions, "questions");
        return new ExerciseBean(j10, i10, str, i11, i12, d10, date, d11, questions, exerciseType);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExerciseBean)) {
            return false;
        }
        ExerciseBean exerciseBean = (ExerciseBean) obj;
        return this.exerciseId == exerciseBean.exerciseId && this.groupId == exerciseBean.groupId && AbstractC9133u.m16128b(this.title, exerciseBean.title) && this.progress == exerciseBean.progress && this.completed == exerciseBean.completed && Double.compare(this.avg, exerciseBean.avg) == 0 && AbstractC9133u.m16128b(this.updateTime, exerciseBean.updateTime) && Double.compare(this.score, exerciseBean.score) == 0 && AbstractC9133u.m16128b(this.questions, exerciseBean.questions) && this.status == exerciseBean.status;
    }

    public final double getAvg() {
        return this.avg;
    }

    public final int getCompleted() {
        return this.completed;
    }

    public final long getExerciseId() {
        return this.exerciseId;
    }

    public final int getGroupId() {
        return this.groupId;
    }

    public final int getProgress() {
        return this.progress;
    }

    public final List<QuestionBean> getQuestions() {
        return this.questions;
    }

    public final double getScore() {
        return this.score;
    }

    public final ExerciseType getStatus() {
        return this.status;
    }

    public final String getTitle() {
        return this.title;
    }

    public final Date getUpdateTime() {
        return this.updateTime;
    }

    public int hashCode() {
        int iHashCode = ((Long.hashCode(this.exerciseId) * 31) + Integer.hashCode(this.groupId)) * 31;
        String str = this.title;
        int iHashCode2 = (((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Integer.hashCode(this.progress)) * 31) + Integer.hashCode(this.completed)) * 31) + Double.hashCode(this.avg)) * 31;
        Date date = this.updateTime;
        int iHashCode3 = (((((iHashCode2 + (date == null ? 0 : date.hashCode())) * 31) + Double.hashCode(this.score)) * 31) + this.questions.hashCode()) * 31;
        ExerciseType exerciseType = this.status;
        return iHashCode3 + (exerciseType != null ? exerciseType.hashCode() : 0);
    }

    public final void setProgress(int i10) {
        this.progress = i10;
    }

    public final void setStatus(ExerciseType exerciseType) {
        this.status = exerciseType;
    }

    public final void setTitle(String str) {
        this.title = str;
    }

    public String toString() {
        return "ExerciseBean(exerciseId=" + this.exerciseId + ", groupId=" + this.groupId + ", title=" + this.title + ", progress=" + this.progress + ", completed=" + this.completed + ", avg=" + this.avg + ", updateTime=" + this.updateTime + ", score=" + this.score + ", questions=" + this.questions + ", status=" + this.status + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i10) {
        AbstractC9133u.m16133g(dest, "dest");
        dest.writeLong(this.exerciseId);
        dest.writeInt(this.groupId);
        dest.writeString(this.title);
        dest.writeInt(this.progress);
        dest.writeInt(this.completed);
        dest.writeDouble(this.avg);
        dest.writeSerializable(this.updateTime);
        dest.writeDouble(this.score);
        List<QuestionBean> list = this.questions;
        dest.writeInt(list.size());
        Iterator<QuestionBean> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(dest, i10);
        }
        ExerciseType exerciseType = this.status;
        if (exerciseType == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(exerciseType.name());
        }
    }
}
