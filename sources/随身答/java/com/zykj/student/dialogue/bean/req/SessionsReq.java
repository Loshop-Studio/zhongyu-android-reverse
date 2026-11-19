package com.zykj.student.dialogue.bean.req;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;

@StabilityInferred(parameters = 0)
@Parcelize
@Keep
@Metadata(m13412d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b(\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bm\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\r\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\r\u0012\u0006\u0010\u000f\u001a\u00020\u0005\u0012\u0006\u0010\u0010\u001a\u00020\u0005\u0012\u0006\u0010\u0011\u001a\u00020\u0005\u0012\u0006\u0010\u0012\u001a\u00020\u0005¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0005HÆ\u0003J\u0010\u0010)\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u001aJ\t\u0010*\u001a\u00020\tHÆ\u0003J\t\u0010+\u001a\u00020\u000bHÆ\u0003J\u000f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00050\rHÆ\u0003J\u000f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00050\rHÆ\u0003J\t\u0010.\u001a\u00020\u0005HÆ\u0003J\t\u0010/\u001a\u00020\u0005HÆ\u0003J\t\u00100\u001a\u00020\u0005HÆ\u0003J\t\u00101\u001a\u00020\u0005HÆ\u0003J\u008a\u0001\u00102\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\r2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\r2\b\b\u0002\u0010\u000f\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u00052\b\b\u0002\u0010\u0012\u001a\u00020\u0005HÆ\u0001¢\u0006\u0002\u00103J\u0006\u00104\u001a\u00020\u0005J\u0013\u00105\u001a\u0002062\b\u00107\u001a\u0004\u0018\u000108HÖ\u0003J\t\u00109\u001a\u00020\u0005HÖ\u0001J\t\u0010:\u001a\u00020\u0003HÖ\u0001J\u0016\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u00020>2\u0006\u0010?\u001a\u00020\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\r¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\r¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010!R\u0011\u0010\u000f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0018R\u0011\u0010\u0010\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0018R\u0011\u0010\u0011\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0018R\u0011\u0010\u0012\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0018¨\u0006@"}, m13413d2 = {"Lcom/zykj/student/dialogue/bean/req/SessionsReq;", "Landroid/os/Parcelable;", "keyword", "", "topicId", "", "catalogId", "", "joinTime", "Lcom/zykj/student/dialogue/bean/req/JoinTimeReq;", "updateTime", "Lcom/zykj/student/dialogue/bean/req/UpdateTimeReq;", "justWatch", "", "justWatchByTeacher", "orderBy", "skip", "take", "quoraState", "<init>", "(Ljava/lang/String;ILjava/lang/Long;Lcom/zykj/student/dialogue/bean/req/JoinTimeReq;Lcom/zykj/student/dialogue/bean/req/UpdateTimeReq;Ljava/util/List;Ljava/util/List;IIII)V", "getKeyword", "()Ljava/lang/String;", "getTopicId", "()I", "getCatalogId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getJoinTime", "()Lcom/zykj/student/dialogue/bean/req/JoinTimeReq;", "getUpdateTime", "()Lcom/zykj/student/dialogue/bean/req/UpdateTimeReq;", "getJustWatch", "()Ljava/util/List;", "getJustWatchByTeacher", "getOrderBy", "getSkip", "getTake", "getQuoraState", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "(Ljava/lang/String;ILjava/lang/Long;Lcom/zykj/student/dialogue/bean/req/JoinTimeReq;Lcom/zykj/student/dialogue/bean/req/UpdateTimeReq;Ljava/util/List;Ljava/util/List;IIII)Lcom/zykj/student/dialogue/bean/req/SessionsReq;", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "app_release"}, m13414k = 1, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes5.dex */
public final /* data */ class SessionsReq implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<SessionsReq> CREATOR = new Creator();
    private final Long catalogId;
    private final JoinTimeReq joinTime;
    private final List<Integer> justWatch;
    private final List<Integer> justWatchByTeacher;
    private final String keyword;
    private final int orderBy;
    private final int quoraState;
    private final int skip;
    private final int take;
    private final int topicId;
    private final UpdateTimeReq updateTime;

    @Metadata(m13414k = 3, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Creator implements Parcelable.Creator<SessionsReq> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SessionsReq createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            int i9 = parcel.readInt();
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            JoinTimeReq joinTimeReqCreateFromParcel = JoinTimeReq.CREATOR.createFromParcel(parcel);
            UpdateTimeReq updateTimeReqCreateFromParcel = UpdateTimeReq.CREATOR.createFromParcel(parcel);
            int i10 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i10);
            int i11 = 0;
            for (int i12 = 0; i12 != i10; i12++) {
                arrayList.add(Integer.valueOf(parcel.readInt()));
            }
            int i13 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i13);
            while (true) {
                int i14 = parcel.readInt();
                if (i11 == i13) {
                    return new SessionsReq(string, i9, lValueOf, joinTimeReqCreateFromParcel, updateTimeReqCreateFromParcel, arrayList, arrayList2, i14, parcel.readInt(), parcel.readInt(), parcel.readInt());
                }
                arrayList2.add(Integer.valueOf(i14));
                i11++;
            }
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SessionsReq[] newArray(int i9) {
            return new SessionsReq[i9];
        }
    }

    public SessionsReq(String keyword, int i9, Long l9, JoinTimeReq joinTime, UpdateTimeReq updateTime, List<Integer> justWatch, List<Integer> justWatchByTeacher, int i10, int i11, int i12, int i13) {
        Intrinsics.checkNotNullParameter(keyword, "keyword");
        Intrinsics.checkNotNullParameter(joinTime, "joinTime");
        Intrinsics.checkNotNullParameter(updateTime, "updateTime");
        Intrinsics.checkNotNullParameter(justWatch, "justWatch");
        Intrinsics.checkNotNullParameter(justWatchByTeacher, "justWatchByTeacher");
        this.keyword = keyword;
        this.topicId = i9;
        this.catalogId = l9;
        this.joinTime = joinTime;
        this.updateTime = updateTime;
        this.justWatch = justWatch;
        this.justWatchByTeacher = justWatchByTeacher;
        this.orderBy = i10;
        this.skip = i11;
        this.take = i12;
        this.quoraState = i13;
    }

    public static /* synthetic */ SessionsReq copy$default(SessionsReq sessionsReq, String str, int i9, Long l9, JoinTimeReq joinTimeReq, UpdateTimeReq updateTimeReq, List list, List list2, int i10, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            str = sessionsReq.keyword;
        }
        if ((i14 & 2) != 0) {
            i9 = sessionsReq.topicId;
        }
        if ((i14 & 4) != 0) {
            l9 = sessionsReq.catalogId;
        }
        if ((i14 & 8) != 0) {
            joinTimeReq = sessionsReq.joinTime;
        }
        if ((i14 & 16) != 0) {
            updateTimeReq = sessionsReq.updateTime;
        }
        if ((i14 & 32) != 0) {
            list = sessionsReq.justWatch;
        }
        if ((i14 & 64) != 0) {
            list2 = sessionsReq.justWatchByTeacher;
        }
        if ((i14 & 128) != 0) {
            i10 = sessionsReq.orderBy;
        }
        if ((i14 & 256) != 0) {
            i11 = sessionsReq.skip;
        }
        if ((i14 & 512) != 0) {
            i12 = sessionsReq.take;
        }
        if ((i14 & 1024) != 0) {
            i13 = sessionsReq.quoraState;
        }
        int i15 = i12;
        int i16 = i13;
        int i17 = i10;
        int i18 = i11;
        List list3 = list;
        List list4 = list2;
        UpdateTimeReq updateTimeReq2 = updateTimeReq;
        Long l10 = l9;
        return sessionsReq.copy(str, i9, l10, joinTimeReq, updateTimeReq2, list3, list4, i17, i18, i15, i16);
    }

    /* renamed from: component1, reason: from getter */
    public final String getKeyword() {
        return this.keyword;
    }

    /* renamed from: component10, reason: from getter */
    public final int getTake() {
        return this.take;
    }

    /* renamed from: component11, reason: from getter */
    public final int getQuoraState() {
        return this.quoraState;
    }

    /* renamed from: component2, reason: from getter */
    public final int getTopicId() {
        return this.topicId;
    }

    /* renamed from: component3, reason: from getter */
    public final Long getCatalogId() {
        return this.catalogId;
    }

    /* renamed from: component4, reason: from getter */
    public final JoinTimeReq getJoinTime() {
        return this.joinTime;
    }

    /* renamed from: component5, reason: from getter */
    public final UpdateTimeReq getUpdateTime() {
        return this.updateTime;
    }

    public final List<Integer> component6() {
        return this.justWatch;
    }

    public final List<Integer> component7() {
        return this.justWatchByTeacher;
    }

    /* renamed from: component8, reason: from getter */
    public final int getOrderBy() {
        return this.orderBy;
    }

    /* renamed from: component9, reason: from getter */
    public final int getSkip() {
        return this.skip;
    }

    public final SessionsReq copy(String keyword, int topicId, Long catalogId, JoinTimeReq joinTime, UpdateTimeReq updateTime, List<Integer> justWatch, List<Integer> justWatchByTeacher, int orderBy, int skip, int take, int quoraState) {
        Intrinsics.checkNotNullParameter(keyword, "keyword");
        Intrinsics.checkNotNullParameter(joinTime, "joinTime");
        Intrinsics.checkNotNullParameter(updateTime, "updateTime");
        Intrinsics.checkNotNullParameter(justWatch, "justWatch");
        Intrinsics.checkNotNullParameter(justWatchByTeacher, "justWatchByTeacher");
        return new SessionsReq(keyword, topicId, catalogId, joinTime, updateTime, justWatch, justWatchByTeacher, orderBy, skip, take, quoraState);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SessionsReq)) {
            return false;
        }
        SessionsReq sessionsReq = (SessionsReq) other;
        return Intrinsics.areEqual(this.keyword, sessionsReq.keyword) && this.topicId == sessionsReq.topicId && Intrinsics.areEqual(this.catalogId, sessionsReq.catalogId) && Intrinsics.areEqual(this.joinTime, sessionsReq.joinTime) && Intrinsics.areEqual(this.updateTime, sessionsReq.updateTime) && Intrinsics.areEqual(this.justWatch, sessionsReq.justWatch) && Intrinsics.areEqual(this.justWatchByTeacher, sessionsReq.justWatchByTeacher) && this.orderBy == sessionsReq.orderBy && this.skip == sessionsReq.skip && this.take == sessionsReq.take && this.quoraState == sessionsReq.quoraState;
    }

    public final Long getCatalogId() {
        return this.catalogId;
    }

    public final JoinTimeReq getJoinTime() {
        return this.joinTime;
    }

    public final List<Integer> getJustWatch() {
        return this.justWatch;
    }

    public final List<Integer> getJustWatchByTeacher() {
        return this.justWatchByTeacher;
    }

    public final String getKeyword() {
        return this.keyword;
    }

    public final int getOrderBy() {
        return this.orderBy;
    }

    public final int getQuoraState() {
        return this.quoraState;
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

    public final UpdateTimeReq getUpdateTime() {
        return this.updateTime;
    }

    public int hashCode() {
        int iHashCode = ((this.keyword.hashCode() * 31) + Integer.hashCode(this.topicId)) * 31;
        Long l9 = this.catalogId;
        return ((((((((((((((((iHashCode + (l9 == null ? 0 : l9.hashCode())) * 31) + this.joinTime.hashCode()) * 31) + this.updateTime.hashCode()) * 31) + this.justWatch.hashCode()) * 31) + this.justWatchByTeacher.hashCode()) * 31) + Integer.hashCode(this.orderBy)) * 31) + Integer.hashCode(this.skip)) * 31) + Integer.hashCode(this.take)) * 31) + Integer.hashCode(this.quoraState);
    }

    public String toString() {
        return "SessionsReq(keyword=" + this.keyword + ", topicId=" + this.topicId + ", catalogId=" + this.catalogId + ", joinTime=" + this.joinTime + ", updateTime=" + this.updateTime + ", justWatch=" + this.justWatch + ", justWatchByTeacher=" + this.justWatchByTeacher + ", orderBy=" + this.orderBy + ", skip=" + this.skip + ", take=" + this.take + ", quoraState=" + this.quoraState + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.keyword);
        dest.writeInt(this.topicId);
        Long l9 = this.catalogId;
        if (l9 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeLong(l9.longValue());
        }
        this.joinTime.writeToParcel(dest, flags);
        this.updateTime.writeToParcel(dest, flags);
        List<Integer> list = this.justWatch;
        dest.writeInt(list.size());
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            dest.writeInt(it.next().intValue());
        }
        List<Integer> list2 = this.justWatchByTeacher;
        dest.writeInt(list2.size());
        Iterator<Integer> it2 = list2.iterator();
        while (it2.hasNext()) {
            dest.writeInt(it2.next().intValue());
        }
        dest.writeInt(this.orderBy);
        dest.writeInt(this.skip);
        dest.writeInt(this.take);
        dest.writeInt(this.quoraState);
    }
}
