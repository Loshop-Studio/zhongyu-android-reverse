package com.zykj.http.bean;

import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.taobao.accs.common.Constants;
import kotlin.jvm.internal.C2764g;
import kotlin.jvm.internal.C2769l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
/* loaded from: classes.dex */
public final class CommonApiResp<T> {
    private final int code;

    @SerializedName(alternate = {"msg"}, value = Constants.SHARED_MESSAGE_ID_FILE)
    @Nullable
    private final String message;

    @SerializedName(alternate = {"result"}, value = Constants.KEY_DATA)
    @Nullable
    private final T result;

    public CommonApiResp(int i4, @Nullable String str, @Nullable T t3) {
        this.code = i4;
        this.message = str;
        this.result = t3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CommonApiResp copy$default(CommonApiResp commonApiResp, int i4, String str, Object obj, int i5, Object obj2) {
        if ((i5 & 1) != 0) {
            i4 = commonApiResp.code;
        }
        if ((i5 & 2) != 0) {
            str = commonApiResp.message;
        }
        if ((i5 & 4) != 0) {
            obj = commonApiResp.result;
        }
        return commonApiResp.copy(i4, str, obj);
    }

    public final int component1() {
        return this.code;
    }

    @Nullable
    public final String component2() {
        return this.message;
    }

    @Nullable
    public final T component3() {
        return this.result;
    }

    @NotNull
    public final CommonApiResp<T> copy(int i4, @Nullable String str, @Nullable T t3) {
        return new CommonApiResp<>(i4, str, t3);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonApiResp)) {
            return false;
        }
        CommonApiResp commonApiResp = (CommonApiResp) obj;
        return this.code == commonApiResp.code && C2769l.m9237a(this.message, commonApiResp.message) && C2769l.m9237a(this.result, commonApiResp.result);
    }

    public final int getCode() {
        return this.code;
    }

    @Nullable
    public final String getMessage() {
        return this.message;
    }

    @Nullable
    public final T getResult() {
        return this.result;
    }

    public int hashCode() {
        int i4 = this.code * 31;
        String str = this.message;
        int iHashCode = (i4 + (str == null ? 0 : str.hashCode())) * 31;
        T t3 = this.result;
        return iHashCode + (t3 != null ? t3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "CommonApiResp(code=" + this.code + ", message=" + ((Object) this.message) + ", result=" + this.result + ')';
    }

    public /* synthetic */ CommonApiResp(int i4, String str, Object obj, int i5, C2764g c2764g) {
        this((i5 & 1) != 0 ? 0 : i4, str, obj);
    }
}
