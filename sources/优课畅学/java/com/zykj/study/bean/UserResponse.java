package com.zykj.study.bean;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.NotificationCompat;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class UserResponse {
    public static final int $stable = 8;
    private final int code;

    @SerializedName(alternate = {NotificationCompat.CATEGORY_MESSAGE}, value = "message")
    private final String message;

    @SerializedName(alternate = {"result"}, value = "data")
    private final UserInfo result;

    public UserResponse(int i10, String str, UserInfo userInfo) {
        this.code = i10;
        this.message = str;
        this.result = userInfo;
    }

    public static /* synthetic */ UserResponse copy$default(UserResponse userResponse, int i10, String str, UserInfo userInfo, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = userResponse.code;
        }
        if ((i11 & 2) != 0) {
            str = userResponse.message;
        }
        if ((i11 & 4) != 0) {
            userInfo = userResponse.result;
        }
        return userResponse.copy(i10, str, userInfo);
    }

    public final int component1() {
        return this.code;
    }

    public final String component2() {
        return this.message;
    }

    public final UserInfo component3() {
        return this.result;
    }

    public final UserResponse copy(int i10, String str, UserInfo userInfo) {
        return new UserResponse(i10, str, userInfo);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserResponse)) {
            return false;
        }
        UserResponse userResponse = (UserResponse) obj;
        return this.code == userResponse.code && AbstractC9133u.m16128b(this.message, userResponse.message) && AbstractC9133u.m16128b(this.result, userResponse.result);
    }

    public final int getCode() {
        return this.code;
    }

    public final String getMessage() {
        return this.message;
    }

    public final UserInfo getResult() {
        return this.result;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.code) * 31;
        String str = this.message;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        UserInfo userInfo = this.result;
        return iHashCode2 + (userInfo != null ? userInfo.hashCode() : 0);
    }

    public String toString() {
        return "UserResponse(code=" + this.code + ", message=" + this.message + ", result=" + this.result + ")";
    }

    public /* synthetic */ UserResponse(int i10, String str, UserInfo userInfo, int i11, AbstractC9126n abstractC9126n) {
        this((i11 & 1) != 0 ? 0 : i10, str, userInfo);
    }
}
