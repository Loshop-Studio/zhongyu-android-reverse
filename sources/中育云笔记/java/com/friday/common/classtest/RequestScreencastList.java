package com.friday.common.classtest;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.jvm.internal.AbstractC9979u;

@StabilityInferred(parameters = 0)
@Keep
/* loaded from: classes3.dex */
public final class RequestScreencastList {
    public static final int $stable = 8;
    private final List<Long> data;
    private final int type;

    public RequestScreencastList(int i10, List<Long> data) {
        AbstractC9979u.m20294g(data, "data");
        this.type = i10;
        this.data = data;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RequestScreencastList copy$default(RequestScreencastList requestScreencastList, int i10, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = requestScreencastList.type;
        }
        if ((i11 & 2) != 0) {
            list = requestScreencastList.data;
        }
        return requestScreencastList.copy(i10, list);
    }

    public final int component1() {
        return this.type;
    }

    public final List<Long> component2() {
        return this.data;
    }

    public final RequestScreencastList copy(int i10, List<Long> data) {
        AbstractC9979u.m20294g(data, "data");
        return new RequestScreencastList(i10, data);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RequestScreencastList)) {
            return false;
        }
        RequestScreencastList requestScreencastList = (RequestScreencastList) obj;
        return this.type == requestScreencastList.type && AbstractC9979u.m20289b(this.data, requestScreencastList.data);
    }

    public final List<Long> getData() {
        return this.data;
    }

    public final int getType() {
        return this.type;
    }

    public int hashCode() {
        return (Integer.hashCode(this.type) * 31) + this.data.hashCode();
    }

    public String toString() {
        return "RequestScreencastList(type=" + this.type + ", data=" + this.data + ")";
    }
}
