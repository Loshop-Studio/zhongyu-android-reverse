package com.zykj.study.bean.teach;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;

@StabilityInferred(parameters = 1)
/* loaded from: classes4.dex */
public final class Member {
    public static final int $stable = 0;
    private final int groupId;
    private final String userId;
    private final String userName;

    public Member(String userId, String userName, int i10) {
        AbstractC9133u.m16133g(userId, "userId");
        AbstractC9133u.m16133g(userName, "userName");
        this.userId = userId;
        this.userName = userName;
        this.groupId = i10;
    }

    public static /* synthetic */ Member copy$default(Member member, String str, String str2, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = member.userId;
        }
        if ((i11 & 2) != 0) {
            str2 = member.userName;
        }
        if ((i11 & 4) != 0) {
            i10 = member.groupId;
        }
        return member.copy(str, str2, i10);
    }

    public final String component1() {
        return this.userId;
    }

    public final String component2() {
        return this.userName;
    }

    public final int component3() {
        return this.groupId;
    }

    public final Member copy(String userId, String userName, int i10) {
        AbstractC9133u.m16133g(userId, "userId");
        AbstractC9133u.m16133g(userName, "userName");
        return new Member(userId, userName, i10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Member)) {
            return false;
        }
        Member member = (Member) obj;
        return AbstractC9133u.m16128b(this.userId, member.userId) && AbstractC9133u.m16128b(this.userName, member.userName) && this.groupId == member.groupId;
    }

    public final int getGroupId() {
        return this.groupId;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final String getUserName() {
        return this.userName;
    }

    public int hashCode() {
        return (((this.userId.hashCode() * 31) + this.userName.hashCode()) * 31) + Integer.hashCode(this.groupId);
    }

    public String toString() {
        return "Member(userId=" + this.userId + ", userName=" + this.userName + ", groupId=" + this.groupId + ")";
    }

    public /* synthetic */ Member(String str, String str2, int i10, int i11, AbstractC9126n abstractC9126n) {
        this(str, (i11 & 2) != 0 ? "" : str2, i10);
    }
}
