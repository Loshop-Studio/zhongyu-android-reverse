package androidx.compose.p014ui.input.pointer.util;

import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class DataPointAtTime {
    public static final int $stable = 8;
    private float dataPoint;
    private long time;

    public DataPointAtTime(long j10, float f10) {
        this.time = j10;
        this.dataPoint = f10;
    }

    public static /* synthetic */ DataPointAtTime copy$default(DataPointAtTime dataPointAtTime, long j10, float f10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = dataPointAtTime.time;
        }
        if ((i10 & 2) != 0) {
            f10 = dataPointAtTime.dataPoint;
        }
        return dataPointAtTime.copy(j10, f10);
    }

    public final long component1() {
        return this.time;
    }

    public final float component2() {
        return this.dataPoint;
    }

    public final DataPointAtTime copy(long j10, float f10) {
        return new DataPointAtTime(j10, f10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DataPointAtTime)) {
            return false;
        }
        DataPointAtTime dataPointAtTime = (DataPointAtTime) obj;
        return this.time == dataPointAtTime.time && Float.compare(this.dataPoint, dataPointAtTime.dataPoint) == 0;
    }

    public final float getDataPoint() {
        return this.dataPoint;
    }

    public final long getTime() {
        return this.time;
    }

    public int hashCode() {
        return (Long.hashCode(this.time) * 31) + Float.hashCode(this.dataPoint);
    }

    public final void setDataPoint(float f10) {
        this.dataPoint = f10;
    }

    public final void setTime(long j10) {
        this.time = j10;
    }

    public String toString() {
        return "DataPointAtTime(time=" + this.time + ", dataPoint=" + this.dataPoint + ')';
    }
}
