package com.zykj.view.utils;

import android.graphics.Paint;
import android.graphics.PointF;
import androidx.annotation.Keep;
import java.util.List;
import kotlin.jvm.internal.AbstractC9979u;

@Keep
/* loaded from: classes6.dex */
public final class ProtoPath {
    private final Paint paint;
    private final List<PointF> pointList;

    /* JADX WARN: Multi-variable type inference failed */
    public ProtoPath(Paint paint, List<? extends PointF> pointList) {
        AbstractC9979u.m20294g(paint, "paint");
        AbstractC9979u.m20294g(pointList, "pointList");
        this.paint = paint;
        this.pointList = pointList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ProtoPath copy$default(ProtoPath protoPath, Paint paint, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            paint = protoPath.paint;
        }
        if ((i10 & 2) != 0) {
            list = protoPath.pointList;
        }
        return protoPath.copy(paint, list);
    }

    public final Paint component1() {
        return this.paint;
    }

    public final List<PointF> component2() {
        return this.pointList;
    }

    public final ProtoPath copy(Paint paint, List<? extends PointF> pointList) {
        AbstractC9979u.m20294g(paint, "paint");
        AbstractC9979u.m20294g(pointList, "pointList");
        return new ProtoPath(paint, pointList);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProtoPath)) {
            return false;
        }
        ProtoPath protoPath = (ProtoPath) obj;
        return AbstractC9979u.m20289b(this.paint, protoPath.paint) && AbstractC9979u.m20289b(this.pointList, protoPath.pointList);
    }

    public final Paint getPaint() {
        return this.paint;
    }

    public final List<PointF> getPointList() {
        return this.pointList;
    }

    public int hashCode() {
        return (this.paint.hashCode() * 31) + this.pointList.hashCode();
    }

    public String toString() {
        return "ProtoPath(paint=" + this.paint + ", pointList=" + this.pointList + ")";
    }
}
