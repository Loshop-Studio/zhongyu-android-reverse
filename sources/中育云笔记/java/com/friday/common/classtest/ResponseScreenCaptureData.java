package com.friday.common.classtest;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.friday.common.entity.ScreenCaptureEntity;
import kotlin.jvm.internal.AbstractC9979u;

@StabilityInferred(parameters = 1)
@Keep
/* loaded from: classes3.dex */
public final class ResponseScreenCaptureData {
    public static final int $stable = 0;
    private final ScreenCaptureEntity data;
    private final int type;

    public ResponseScreenCaptureData(int i10, ScreenCaptureEntity data) {
        AbstractC9979u.m20294g(data, "data");
        this.type = i10;
        this.data = data;
    }

    public static /* synthetic */ ResponseScreenCaptureData copy$default(ResponseScreenCaptureData responseScreenCaptureData, int i10, ScreenCaptureEntity screenCaptureEntity, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = responseScreenCaptureData.type;
        }
        if ((i11 & 2) != 0) {
            screenCaptureEntity = responseScreenCaptureData.data;
        }
        return responseScreenCaptureData.copy(i10, screenCaptureEntity);
    }

    public final int component1() {
        return this.type;
    }

    public final ScreenCaptureEntity component2() {
        return this.data;
    }

    public final ResponseScreenCaptureData copy(int i10, ScreenCaptureEntity data) {
        AbstractC9979u.m20294g(data, "data");
        return new ResponseScreenCaptureData(i10, data);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResponseScreenCaptureData)) {
            return false;
        }
        ResponseScreenCaptureData responseScreenCaptureData = (ResponseScreenCaptureData) obj;
        return this.type == responseScreenCaptureData.type && AbstractC9979u.m20289b(this.data, responseScreenCaptureData.data);
    }

    public final ScreenCaptureEntity getData() {
        return this.data;
    }

    public final int getType() {
        return this.type;
    }

    public int hashCode() {
        return (Integer.hashCode(this.type) * 31) + this.data.hashCode();
    }

    public String toString() {
        return "ResponseScreenCaptureData(type=" + this.type + ", data=" + this.data + ")";
    }
}
