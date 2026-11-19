package com.friday.common.classtest;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;

@StabilityInferred(parameters = 1)
@Keep
/* loaded from: classes3.dex */
public final class MqttRequestEntity {
    public static final int $stable = 0;
    private final RequestScreencastData data;
    private final int type;

    public MqttRequestEntity(int i10, RequestScreencastData requestScreencastData) {
        this.type = i10;
        this.data = requestScreencastData;
    }

    public static /* synthetic */ MqttRequestEntity copy$default(MqttRequestEntity mqttRequestEntity, int i10, RequestScreencastData requestScreencastData, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = mqttRequestEntity.type;
        }
        if ((i11 & 2) != 0) {
            requestScreencastData = mqttRequestEntity.data;
        }
        return mqttRequestEntity.copy(i10, requestScreencastData);
    }

    public final int component1() {
        return this.type;
    }

    public final RequestScreencastData component2() {
        return this.data;
    }

    public final MqttRequestEntity copy(int i10, RequestScreencastData requestScreencastData) {
        return new MqttRequestEntity(i10, requestScreencastData);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MqttRequestEntity)) {
            return false;
        }
        MqttRequestEntity mqttRequestEntity = (MqttRequestEntity) obj;
        return this.type == mqttRequestEntity.type && AbstractC9979u.m20289b(this.data, mqttRequestEntity.data);
    }

    public final RequestScreencastData getData() {
        return this.data;
    }

    public final int getType() {
        return this.type;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.type) * 31;
        RequestScreencastData requestScreencastData = this.data;
        return iHashCode + (requestScreencastData == null ? 0 : requestScreencastData.hashCode());
    }

    public String toString() {
        return "MqttRequestEntity(type=" + this.type + ", data=" + this.data + ")";
    }

    public /* synthetic */ MqttRequestEntity(int i10, RequestScreencastData requestScreencastData, int i11, AbstractC9972n abstractC9972n) {
        this(i10, (i11 & 2) != 0 ? null : requestScreencastData);
    }
}
