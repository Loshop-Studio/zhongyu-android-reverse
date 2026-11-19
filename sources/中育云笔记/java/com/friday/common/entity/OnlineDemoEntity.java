package com.friday.common.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;

@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public final class OnlineDemoEntity implements Parcelable {
    private final String accountId;
    private boolean add;
    private boolean handsUp;
    private boolean mikeEnable;
    private final String nickname;
    private final String roomId;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<OnlineDemoEntity> CREATOR = new Parcelable.Creator<OnlineDemoEntity>() { // from class: com.friday.common.entity.OnlineDemoEntity$Companion$CREATOR$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public OnlineDemoEntity createFromParcel(Parcel source) {
            AbstractC9979u.m20294g(source, "source");
            return new OnlineDemoEntity(source);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public OnlineDemoEntity[] newArray(int i10) {
            return new OnlineDemoEntity[i10];
        }
    };

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        private Companion() {
        }
    }

    public OnlineDemoEntity(String accountId, String roomId, String nickname, boolean z10, boolean z11, boolean z12) {
        AbstractC9979u.m20294g(accountId, "accountId");
        AbstractC9979u.m20294g(roomId, "roomId");
        AbstractC9979u.m20294g(nickname, "nickname");
        this.accountId = accountId;
        this.roomId = roomId;
        this.nickname = nickname;
        this.mikeEnable = z10;
        this.handsUp = z11;
        this.add = z12;
    }

    public static /* synthetic */ OnlineDemoEntity copy$default(OnlineDemoEntity onlineDemoEntity, String str, String str2, String str3, boolean z10, boolean z11, boolean z12, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = onlineDemoEntity.accountId;
        }
        if ((i10 & 2) != 0) {
            str2 = onlineDemoEntity.roomId;
        }
        if ((i10 & 4) != 0) {
            str3 = onlineDemoEntity.nickname;
        }
        if ((i10 & 8) != 0) {
            z10 = onlineDemoEntity.mikeEnable;
        }
        if ((i10 & 16) != 0) {
            z11 = onlineDemoEntity.handsUp;
        }
        if ((i10 & 32) != 0) {
            z12 = onlineDemoEntity.add;
        }
        boolean z13 = z11;
        boolean z14 = z12;
        return onlineDemoEntity.copy(str, str2, str3, z10, z13, z14);
    }

    public final String component1() {
        return this.accountId;
    }

    public final String component2() {
        return this.roomId;
    }

    public final String component3() {
        return this.nickname;
    }

    public final boolean component4() {
        return this.mikeEnable;
    }

    public final boolean component5() {
        return this.handsUp;
    }

    public final boolean component6() {
        return this.add;
    }

    public final OnlineDemoEntity copy(String accountId, String roomId, String nickname, boolean z10, boolean z11, boolean z12) {
        AbstractC9979u.m20294g(accountId, "accountId");
        AbstractC9979u.m20294g(roomId, "roomId");
        AbstractC9979u.m20294g(nickname, "nickname");
        return new OnlineDemoEntity(accountId, roomId, nickname, z10, z11, z12);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OnlineDemoEntity)) {
            return false;
        }
        OnlineDemoEntity onlineDemoEntity = (OnlineDemoEntity) obj;
        return AbstractC9979u.m20289b(this.accountId, onlineDemoEntity.accountId) && AbstractC9979u.m20289b(this.roomId, onlineDemoEntity.roomId) && AbstractC9979u.m20289b(this.nickname, onlineDemoEntity.nickname) && this.mikeEnable == onlineDemoEntity.mikeEnable && this.handsUp == onlineDemoEntity.handsUp && this.add == onlineDemoEntity.add;
    }

    public final String getAccountId() {
        return this.accountId;
    }

    public final boolean getAdd() {
        return this.add;
    }

    public final boolean getHandsUp() {
        return this.handsUp;
    }

    public final boolean getMikeEnable() {
        return this.mikeEnable;
    }

    public final String getNickname() {
        return this.nickname;
    }

    public final String getRoomId() {
        return this.roomId;
    }

    public int hashCode() {
        return (((((((((this.accountId.hashCode() * 31) + this.roomId.hashCode()) * 31) + this.nickname.hashCode()) * 31) + Boolean.hashCode(this.mikeEnable)) * 31) + Boolean.hashCode(this.handsUp)) * 31) + Boolean.hashCode(this.add);
    }

    public final void setAdd(boolean z10) {
        this.add = z10;
    }

    public final void setHandsUp(boolean z10) {
        this.handsUp = z10;
    }

    public final void setMikeEnable(boolean z10) {
        this.mikeEnable = z10;
    }

    public String toString() {
        return "OnlineDemoEntity(accountId=" + this.accountId + ", roomId=" + this.roomId + ", nickname=" + this.nickname + ", mikeEnable=" + this.mikeEnable + ", handsUp=" + this.handsUp + ", add=" + this.add + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int i10) {
        AbstractC9979u.m20294g(dest, "dest");
        dest.writeString(this.accountId);
        dest.writeString(this.roomId);
        dest.writeString(this.nickname);
        dest.writeInt(this.mikeEnable ? 1 : 0);
        dest.writeInt(this.handsUp ? 1 : 0);
        dest.writeInt(this.add ? 1 : 0);
    }

    public /* synthetic */ OnlineDemoEntity(String str, String str2, String str3, boolean z10, boolean z11, boolean z12, int i10, AbstractC9972n abstractC9972n) {
        this(str, str2, (i10 & 4) != 0 ? "" : str3, (i10 & 8) != 0 ? false : z10, (i10 & 16) != 0 ? false : z11, (i10 & 32) != 0 ? true : z12);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public OnlineDemoEntity(Parcel source) {
        AbstractC9979u.m20294g(source, "source");
        String string = source.readString();
        String str = string == null ? "" : string;
        String string2 = source.readString();
        String str2 = string2 == null ? "" : string2;
        String string3 = source.readString();
        this(str, str2, string3 == null ? "" : string3, 1 == source.readInt(), 1 == source.readInt(), 1 == source.readInt());
    }
}
