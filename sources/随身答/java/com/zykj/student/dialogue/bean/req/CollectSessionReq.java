package com.zykj.student.dialogue.bean.req;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;

@StabilityInferred(parameters = 1)
@Parcelize
@Keep
@Metadata(m13412d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J;\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u001a\u001a\u00020\u0005J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001J\u0016\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000f¨\u0006&"}, m13413d2 = {"Lcom/zykj/student/dialogue/bean/req/CollectSessionReq;", "Landroid/os/Parcelable;", "keyword", "", "topicId", "", "collectTime", "Lcom/zykj/student/dialogue/bean/req/JoinTimeReq;", "skip", "take", "<init>", "(Ljava/lang/String;ILcom/zykj/student/dialogue/bean/req/JoinTimeReq;II)V", "getKeyword", "()Ljava/lang/String;", "getTopicId", "()I", "getCollectTime", "()Lcom/zykj/student/dialogue/bean/req/JoinTimeReq;", "getSkip", "getTake", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "app_release"}, m13414k = 1, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes5.dex */
public final /* data */ class CollectSessionReq implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<CollectSessionReq> CREATOR = new Creator();
    private final JoinTimeReq collectTime;
    private final String keyword;
    private final int skip;
    private final int take;
    private final int topicId;

    @Metadata(m13414k = 3, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Creator implements Parcelable.Creator<CollectSessionReq> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CollectSessionReq createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CollectSessionReq(parcel.readString(), parcel.readInt(), JoinTimeReq.CREATOR.createFromParcel(parcel), parcel.readInt(), parcel.readInt());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CollectSessionReq[] newArray(int i9) {
            return new CollectSessionReq[i9];
        }
    }

    public CollectSessionReq(String keyword, int i9, JoinTimeReq collectTime, int i10, int i11) {
        Intrinsics.checkNotNullParameter(keyword, "keyword");
        Intrinsics.checkNotNullParameter(collectTime, "collectTime");
        this.keyword = keyword;
        this.topicId = i9;
        this.collectTime = collectTime;
        this.skip = i10;
        this.take = i11;
    }

    public static /* synthetic */ CollectSessionReq copy$default(CollectSessionReq collectSessionReq, String str, int i9, JoinTimeReq joinTimeReq, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = collectSessionReq.keyword;
        }
        if ((i12 & 2) != 0) {
            i9 = collectSessionReq.topicId;
        }
        if ((i12 & 4) != 0) {
            joinTimeReq = collectSessionReq.collectTime;
        }
        if ((i12 & 8) != 0) {
            i10 = collectSessionReq.skip;
        }
        if ((i12 & 16) != 0) {
            i11 = collectSessionReq.take;
        }
        int i13 = i11;
        JoinTimeReq joinTimeReq2 = joinTimeReq;
        return collectSessionReq.copy(str, i9, joinTimeReq2, i10, i13);
    }

    /* renamed from: component1, reason: from getter */
    public final String getKeyword() {
        return this.keyword;
    }

    /* renamed from: component2, reason: from getter */
    public final int getTopicId() {
        return this.topicId;
    }

    /* renamed from: component3, reason: from getter */
    public final JoinTimeReq getCollectTime() {
        return this.collectTime;
    }

    /* renamed from: component4, reason: from getter */
    public final int getSkip() {
        return this.skip;
    }

    /* renamed from: component5, reason: from getter */
    public final int getTake() {
        return this.take;
    }

    public final CollectSessionReq copy(String keyword, int topicId, JoinTimeReq collectTime, int skip, int take) {
        Intrinsics.checkNotNullParameter(keyword, "keyword");
        Intrinsics.checkNotNullParameter(collectTime, "collectTime");
        return new CollectSessionReq(keyword, topicId, collectTime, skip, take);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CollectSessionReq)) {
            return false;
        }
        CollectSessionReq collectSessionReq = (CollectSessionReq) other;
        return Intrinsics.areEqual(this.keyword, collectSessionReq.keyword) && this.topicId == collectSessionReq.topicId && Intrinsics.areEqual(this.collectTime, collectSessionReq.collectTime) && this.skip == collectSessionReq.skip && this.take == collectSessionReq.take;
    }

    public final JoinTimeReq getCollectTime() {
        return this.collectTime;
    }

    public final String getKeyword() {
        return this.keyword;
    }

    public final int getSkip() {
        return this.skip;
    }

    public final int getTake() {
        return this.take;
    }

    public final int getTopicId() {
        return this.topicId;
    }

    public int hashCode() {
        return (((((((this.keyword.hashCode() * 31) + Integer.hashCode(this.topicId)) * 31) + this.collectTime.hashCode()) * 31) + Integer.hashCode(this.skip)) * 31) + Integer.hashCode(this.take);
    }

    public String toString() {
        return "CollectSessionReq(keyword=" + this.keyword + ", topicId=" + this.topicId + ", collectTime=" + this.collectTime + ", skip=" + this.skip + ", take=" + this.take + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.keyword);
        dest.writeInt(this.topicId);
        this.collectTime.writeToParcel(dest, flags);
        dest.writeInt(this.skip);
        dest.writeInt(this.take);
    }
}
