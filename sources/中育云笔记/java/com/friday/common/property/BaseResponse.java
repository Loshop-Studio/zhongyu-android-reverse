package com.friday.common.property;

import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.annotation.JSONCreator;
import kotlin.jvm.internal.AbstractC9979u;

@StabilityInferred(parameters = 1)
/* loaded from: classes3.dex */
public final class BaseResponse<T> {
    public static final int $stable = 0;
    private final int code;
    private final T data;
    private final String msg;

    @JSONCreator
    public BaseResponse(int i10, String msg, T t10) {
        AbstractC9979u.m20294g(msg, "msg");
        this.code = i10;
        this.msg = msg;
        this.data = t10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BaseResponse copy$default(BaseResponse baseResponse, int i10, String str, Object obj, int i11, Object obj2) {
        if ((i11 & 1) != 0) {
            i10 = baseResponse.code;
        }
        if ((i11 & 2) != 0) {
            str = baseResponse.msg;
        }
        if ((i11 & 4) != 0) {
            obj = baseResponse.data;
        }
        return baseResponse.copy(i10, str, obj);
    }

    public final int component1() {
        return this.code;
    }

    public final String component2() {
        return this.msg;
    }

    public final T component3() {
        return this.data;
    }

    public final BaseResponse<T> copy(int i10, String msg, T t10) {
        AbstractC9979u.m20294g(msg, "msg");
        return new BaseResponse<>(i10, msg, t10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BaseResponse)) {
            return false;
        }
        BaseResponse baseResponse = (BaseResponse) obj;
        return this.code == baseResponse.code && AbstractC9979u.m20289b(this.msg, baseResponse.msg) && AbstractC9979u.m20289b(this.data, baseResponse.data);
    }

    public final int getCode() {
        return this.code;
    }

    public final T getData() {
        return this.data;
    }

    public final String getMsg() {
        return this.msg;
    }

    public int hashCode() {
        int iHashCode = ((Integer.hashCode(this.code) * 31) + this.msg.hashCode()) * 31;
        T t10 = this.data;
        return iHashCode + (t10 == null ? 0 : t10.hashCode());
    }

    public String toString() {
        return "BaseResponse(code=" + this.code + ", msg=" + this.msg + ", data=" + this.data + ")";
    }
}
