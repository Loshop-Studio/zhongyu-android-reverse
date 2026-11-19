package com.zykj.study.bean.exercise;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9133u;

@StabilityInferred(parameters = 1)
/* loaded from: classes4.dex */
public final class AuthorizeLesson {
    public static final int $stable = 0;
    private final String createTime;
    private final boolean isAuthorized;
    private final String name;
    private final int userId;
    private final String userName;

    public AuthorizeLesson(String name, String str, String str2, boolean z10, int i10) {
        AbstractC9133u.m16133g(name, "name");
        this.name = name;
        this.userName = str;
        this.createTime = str2;
        this.isAuthorized = z10;
        this.userId = i10;
    }

    public static /* synthetic */ AuthorizeLesson copy$default(AuthorizeLesson authorizeLesson, String str, String str2, String str3, boolean z10, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = authorizeLesson.name;
        }
        if ((i11 & 2) != 0) {
            str2 = authorizeLesson.userName;
        }
        if ((i11 & 4) != 0) {
            str3 = authorizeLesson.createTime;
        }
        if ((i11 & 8) != 0) {
            z10 = authorizeLesson.isAuthorized;
        }
        if ((i11 & 16) != 0) {
            i10 = authorizeLesson.userId;
        }
        int i12 = i10;
        String str4 = str3;
        return authorizeLesson.copy(str, str2, str4, z10, i12);
    }

    public final String component1() {
        return this.name;
    }

    public final String component2() {
        return this.userName;
    }

    public final String component3() {
        return this.createTime;
    }

    public final boolean component4() {
        return this.isAuthorized;
    }

    public final int component5() {
        return this.userId;
    }

    public final AuthorizeLesson copy(String name, String str, String str2, boolean z10, int i10) {
        AbstractC9133u.m16133g(name, "name");
        return new AuthorizeLesson(name, str, str2, z10, i10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuthorizeLesson)) {
            return false;
        }
        AuthorizeLesson authorizeLesson = (AuthorizeLesson) obj;
        return AbstractC9133u.m16128b(this.name, authorizeLesson.name) && AbstractC9133u.m16128b(this.userName, authorizeLesson.userName) && AbstractC9133u.m16128b(this.createTime, authorizeLesson.createTime) && this.isAuthorized == authorizeLesson.isAuthorized && this.userId == authorizeLesson.userId;
    }

    public final String getCreateTime() {
        return this.createTime;
    }

    public final String getName() {
        return this.name;
    }

    public final int getUserId() {
        return this.userId;
    }

    public final String getUserName() {
        return this.userName;
    }

    public int hashCode() {
        int iHashCode = this.name.hashCode() * 31;
        String str = this.userName;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.createTime;
        return ((((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + Boolean.hashCode(this.isAuthorized)) * 31) + Integer.hashCode(this.userId);
    }

    public final boolean isAuthorized() {
        return this.isAuthorized;
    }

    public String toString() {
        return "AuthorizeLesson(name=" + this.name + ", userName=" + this.userName + ", createTime=" + this.createTime + ", isAuthorized=" + this.isAuthorized + ", userId=" + this.userId + ")";
    }
}
