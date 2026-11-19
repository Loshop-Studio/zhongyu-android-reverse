package com.zykj.evaluation.p057ui.detail;

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
@Metadata(m13557d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0018\u001a\u00020\bHÆ\u0003J\t\u0010\u0019\u001a\u00020\bHÆ\u0003J\t\u0010\u001a\u001a\u00020\u0006HÆ\u0003JE\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u0006HÆ\u0001J\u0006\u0010\u001c\u001a\u00020\u001dJ\u0013\u0010\u001e\u001a\u00020\u00062\b\u0010\u001f\u001a\u0004\u0018\u00010 HÖ\u0003J\t\u0010!\u001a\u00020\u001dHÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001J\u0016\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u001dR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\n\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010¨\u0006("}, m13558d2 = {"Lcom/zykj/evaluation/ui/detail/GuideQuestion;", "Landroid/os/Parcelable;", "title", "", "description", "isRelatedGroup", "", "questionId", "", "groupId", "needRevise", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZJJZ)V", "getTitle", "()Ljava/lang/String;", "getDescription", "()Z", "getQuestionId", "()J", "getGroupId", "getNeedRevise", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "app_release"}, m13559k = 1, m13560mv = {2, 2, 0}, m13562xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class GuideQuestion implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<GuideQuestion> CREATOR = new C6893a();
    private final String description;
    private final long groupId;
    private final boolean isRelatedGroup;
    private final boolean needRevise;
    private final long questionId;
    private final String title;

    /* renamed from: com.zykj.evaluation.ui.detail.GuideQuestion$a */
    public static final class C6893a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final GuideQuestion createFromParcel(Parcel parcel) {
            boolean z9;
            boolean z10;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            boolean z11 = false;
            if (parcel.readInt() != 0) {
                z9 = false;
                z11 = true;
                z10 = true;
            } else {
                z9 = false;
                z10 = true;
            }
            long j10 = parcel.readLong();
            boolean z12 = z10;
            long j11 = parcel.readLong();
            if (parcel.readInt() == 0) {
                z12 = z9;
            }
            return new GuideQuestion(string, string2, z11, j10, j11, z12);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final GuideQuestion[] newArray(int i10) {
            return new GuideQuestion[i10];
        }
    }

    public GuideQuestion(String title, String description, boolean z9, long j10, long j11, boolean z10) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        this.title = title;
        this.description = description;
        this.isRelatedGroup = z9;
        this.questionId = j10;
        this.groupId = j11;
        this.needRevise = z10;
    }

    public static /* synthetic */ GuideQuestion copy$default(GuideQuestion guideQuestion, String str, String str2, boolean z9, long j10, long j11, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = guideQuestion.title;
        }
        if ((i10 & 2) != 0) {
            str2 = guideQuestion.description;
        }
        if ((i10 & 4) != 0) {
            z9 = guideQuestion.isRelatedGroup;
        }
        if ((i10 & 8) != 0) {
            j10 = guideQuestion.questionId;
        }
        if ((i10 & 16) != 0) {
            j11 = guideQuestion.groupId;
        }
        if ((i10 & 32) != 0) {
            z10 = guideQuestion.needRevise;
        }
        boolean z11 = z10;
        long j12 = j11;
        boolean z12 = z9;
        return guideQuestion.copy(str, str2, z12, j10, j12, z11);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final String getDescription() {
        return this.description;
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
    public final long getGroupId() {
        return this.groupId;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getNeedRevise() {
        return this.needRevise;
    }

    public final GuideQuestion copy(String title, String description, boolean isRelatedGroup, long questionId, long groupId, boolean needRevise) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        return new GuideQuestion(title, description, isRelatedGroup, questionId, groupId, needRevise);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GuideQuestion)) {
            return false;
        }
        GuideQuestion guideQuestion = (GuideQuestion) other;
        return Intrinsics.areEqual(this.title, guideQuestion.title) && Intrinsics.areEqual(this.description, guideQuestion.description) && this.isRelatedGroup == guideQuestion.isRelatedGroup && this.questionId == guideQuestion.questionId && this.groupId == guideQuestion.groupId && this.needRevise == guideQuestion.needRevise;
    }

    public final String getDescription() {
        return this.description;
    }

    public final long getGroupId() {
        return this.groupId;
    }

    public final boolean getNeedRevise() {
        return this.needRevise;
    }

    public final long getQuestionId() {
        return this.questionId;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return (((((((((this.title.hashCode() * 31) + this.description.hashCode()) * 31) + Boolean.hashCode(this.isRelatedGroup)) * 31) + Long.hashCode(this.questionId)) * 31) + Long.hashCode(this.groupId)) * 31) + Boolean.hashCode(this.needRevise);
    }

    public final boolean isRelatedGroup() {
        return this.isRelatedGroup;
    }

    public String toString() {
        return "GuideQuestion(title=" + this.title + ", description=" + this.description + ", isRelatedGroup=" + this.isRelatedGroup + ", questionId=" + this.questionId + ", groupId=" + this.groupId + ", needRevise=" + this.needRevise + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.title);
        dest.writeString(this.description);
        dest.writeInt(this.isRelatedGroup ? 1 : 0);
        dest.writeLong(this.questionId);
        dest.writeLong(this.groupId);
        dest.writeInt(this.needRevise ? 1 : 0);
    }
}
