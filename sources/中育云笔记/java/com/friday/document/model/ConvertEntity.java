package com.friday.document.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.AbstractC9979u;

@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public final class ConvertEntity {
    public static final int $stable = 8;

    @SerializedName("Data")
    private final String data;

    @SerializedName("Error")
    private final Object error;

    @SerializedName("Success")
    private final boolean success;

    public ConvertEntity(String data, Object error, boolean z10) {
        AbstractC9979u.m20294g(data, "data");
        AbstractC9979u.m20294g(error, "error");
        this.data = data;
        this.error = error;
        this.success = z10;
    }

    public static /* synthetic */ ConvertEntity copy$default(ConvertEntity convertEntity, String str, Object obj, boolean z10, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            str = convertEntity.data;
        }
        if ((i10 & 2) != 0) {
            obj = convertEntity.error;
        }
        if ((i10 & 4) != 0) {
            z10 = convertEntity.success;
        }
        return convertEntity.copy(str, obj, z10);
    }

    public final String component1() {
        return this.data;
    }

    public final Object component2() {
        return this.error;
    }

    public final boolean component3() {
        return this.success;
    }

    public final ConvertEntity copy(String data, Object error, boolean z10) {
        AbstractC9979u.m20294g(data, "data");
        AbstractC9979u.m20294g(error, "error");
        return new ConvertEntity(data, error, z10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConvertEntity)) {
            return false;
        }
        ConvertEntity convertEntity = (ConvertEntity) obj;
        return AbstractC9979u.m20289b(this.data, convertEntity.data) && AbstractC9979u.m20289b(this.error, convertEntity.error) && this.success == convertEntity.success;
    }

    public final String getData() {
        return this.data;
    }

    public final Object getError() {
        return this.error;
    }

    public final boolean getSuccess() {
        return this.success;
    }

    public int hashCode() {
        return (((this.data.hashCode() * 31) + this.error.hashCode()) * 31) + Boolean.hashCode(this.success);
    }

    public String toString() {
        return "ConvertEntity(data=" + this.data + ", error=" + this.error + ", success=" + this.success + ")";
    }
}
