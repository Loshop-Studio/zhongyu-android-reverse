package com.zykj.subscriber.entity;

import kotlin.jvm.internal.C2769l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes.dex */
public final class LocalUserInfo {

    @NotNull
    private String realName;

    @NotNull
    private String snCode;

    @NotNull
    private String username;

    public LocalUserInfo(@NotNull String snCode, @NotNull String username, @NotNull String realName) {
        C2769l.m9241e(snCode, "snCode");
        C2769l.m9241e(username, "username");
        C2769l.m9241e(realName, "realName");
        this.snCode = snCode;
        this.username = username;
        this.realName = realName;
    }

    public static /* synthetic */ LocalUserInfo copy$default(LocalUserInfo localUserInfo, String str, String str2, String str3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = localUserInfo.snCode;
        }
        if ((i4 & 2) != 0) {
            str2 = localUserInfo.username;
        }
        if ((i4 & 4) != 0) {
            str3 = localUserInfo.realName;
        }
        return localUserInfo.copy(str, str2, str3);
    }

    @NotNull
    public final String component1() {
        return this.snCode;
    }

    @NotNull
    public final String component2() {
        return this.username;
    }

    @NotNull
    public final String component3() {
        return this.realName;
    }

    @NotNull
    public final LocalUserInfo copy(@NotNull String snCode, @NotNull String username, @NotNull String realName) {
        C2769l.m9241e(snCode, "snCode");
        C2769l.m9241e(username, "username");
        C2769l.m9241e(realName, "realName");
        return new LocalUserInfo(snCode, username, realName);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocalUserInfo)) {
            return false;
        }
        LocalUserInfo localUserInfo = (LocalUserInfo) obj;
        return C2769l.m9237a(this.snCode, localUserInfo.snCode) && C2769l.m9237a(this.username, localUserInfo.username) && C2769l.m9237a(this.realName, localUserInfo.realName);
    }

    @NotNull
    public final String getRealName() {
        return this.realName;
    }

    @NotNull
    public final String getSnCode() {
        return this.snCode;
    }

    @NotNull
    public final String getUsername() {
        return this.username;
    }

    public int hashCode() {
        return (((this.snCode.hashCode() * 31) + this.username.hashCode()) * 31) + this.realName.hashCode();
    }

    public final void setRealName(@NotNull String str) {
        C2769l.m9241e(str, "<set-?>");
        this.realName = str;
    }

    public final void setSnCode(@NotNull String str) {
        C2769l.m9241e(str, "<set-?>");
        this.snCode = str;
    }

    public final void setUsername(@NotNull String str) {
        C2769l.m9241e(str, "<set-?>");
        this.username = str;
    }

    @NotNull
    public String toString() {
        return "LocalUserInfo(snCode=" + this.snCode + ", username=" + this.username + ", realName=" + this.realName + ')';
    }
}
