package com.friday.common.entity;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.jeremyliao.liveeventbus.core.LiveEvent;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;

@StabilityInferred(parameters = 1)
@Keep
/* loaded from: classes3.dex */
public final class MqttEntity implements LiveEvent {
    public static final int $stable = 0;
    private final String message;
    private final String specifiedId;
    private final MqttType type;

    public MqttEntity(MqttType type, String message, String specifiedId) {
        AbstractC9979u.m20294g(type, "type");
        AbstractC9979u.m20294g(message, "message");
        AbstractC9979u.m20294g(specifiedId, "specifiedId");
        this.type = type;
        this.message = message;
        this.specifiedId = specifiedId;
    }

    public static /* synthetic */ MqttEntity copy$default(MqttEntity mqttEntity, MqttType mqttType, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            mqttType = mqttEntity.type;
        }
        if ((i10 & 2) != 0) {
            str = mqttEntity.message;
        }
        if ((i10 & 4) != 0) {
            str2 = mqttEntity.specifiedId;
        }
        return mqttEntity.copy(mqttType, str, str2);
    }

    public final MqttType component1() {
        return this.type;
    }

    public final String component2() {
        return this.message;
    }

    public final String component3() {
        return this.specifiedId;
    }

    public final MqttEntity copy(MqttType type, String message, String specifiedId) {
        AbstractC9979u.m20294g(type, "type");
        AbstractC9979u.m20294g(message, "message");
        AbstractC9979u.m20294g(specifiedId, "specifiedId");
        return new MqttEntity(type, message, specifiedId);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MqttEntity)) {
            return false;
        }
        MqttEntity mqttEntity = (MqttEntity) obj;
        return this.type == mqttEntity.type && AbstractC9979u.m20289b(this.message, mqttEntity.message) && AbstractC9979u.m20289b(this.specifiedId, mqttEntity.specifiedId);
    }

    public final String getMessage() {
        return this.message;
    }

    public final String getSpecifiedId() {
        return this.specifiedId;
    }

    public final MqttType getType() {
        return this.type;
    }

    public int hashCode() {
        return (((this.type.hashCode() * 31) + this.message.hashCode()) * 31) + this.specifiedId.hashCode();
    }

    public String toString() {
        return "MqttEntity(type=" + this.type + ", message=" + this.message + ", specifiedId=" + this.specifiedId + ")";
    }

    public /* synthetic */ MqttEntity(MqttType mqttType, String str, String str2, int i10, AbstractC9972n abstractC9972n) {
        this(mqttType, str, (i10 & 4) != 0 ? "" : str2);
    }
}
