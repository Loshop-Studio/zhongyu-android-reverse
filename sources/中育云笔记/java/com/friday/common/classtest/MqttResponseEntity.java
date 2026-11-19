package com.friday.common.classtest;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9979u;

@StabilityInferred(parameters = 0)
@Keep
/* loaded from: classes3.dex */
public final class MqttResponseEntity {
    public static final int $stable = 8;
    private final ResponseScreencastData data;
    private final int type;

    public MqttResponseEntity(int i10, ResponseScreencastData data) {
        AbstractC9979u.m20294g(data, "data");
        this.type = i10;
        this.data = data;
    }

    public static /* synthetic */ MqttResponseEntity copy$default(MqttResponseEntity mqttResponseEntity, int i10, ResponseScreencastData responseScreencastData, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = mqttResponseEntity.type;
        }
        if ((i11 & 2) != 0) {
            responseScreencastData = mqttResponseEntity.data;
        }
        return mqttResponseEntity.copy(i10, responseScreencastData);
    }

    public final int component1() {
        return this.type;
    }

    public final ResponseScreencastData component2() {
        return this.data;
    }

    public final MqttResponseEntity copy(int i10, ResponseScreencastData data) {
        AbstractC9979u.m20294g(data, "data");
        return new MqttResponseEntity(i10, data);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MqttResponseEntity)) {
            return false;
        }
        MqttResponseEntity mqttResponseEntity = (MqttResponseEntity) obj;
        return this.type == mqttResponseEntity.type && AbstractC9979u.m20289b(this.data, mqttResponseEntity.data);
    }

    public final ResponseScreencastData getData() {
        return this.data;
    }

    public final int getType() {
        return this.type;
    }

    public int hashCode() {
        return (Integer.hashCode(this.type) * 31) + this.data.hashCode();
    }

    public String toString() {
        return "MqttResponseEntity(type=" + this.type + ", data=" + this.data + ")";
    }
}
