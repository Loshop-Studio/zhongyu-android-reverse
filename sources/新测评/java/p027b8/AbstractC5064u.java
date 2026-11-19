package p027b8;

import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import androidx.core.view.ViewCompat;
import com.zykj.view.EzySimpleBoardData;
import com.zykj.view.utils.ProtoPath;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: b8.u */
/* loaded from: classes5.dex */
public abstract class AbstractC5064u {
    /* renamed from: a */
    public static final Paint m2578a(EzySimpleBoardData.Paint paint) {
        Intrinsics.checkNotNullParameter(paint, "<this>");
        Paint paint2 = new Paint();
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_OVER));
        paint2.setStrokeCap(Paint.Cap.ROUND);
        paint2.setStrokeJoin(Paint.Join.ROUND);
        paint2.setDither(true);
        paint2.setAntiAlias(true);
        paint2.setColor(paint.getColor());
        paint2.setStrokeWidth(paint.getWidth());
        paint2.setPathEffect(paint.getIsDashed() ? new DashPathEffect(new float[]{30.0f, 15.0f}, 0.0f) : null);
        return paint2;
    }

    /* renamed from: b */
    public static final EzySimpleBoardData.Paint m2579b(Paint paint) {
        Intrinsics.checkNotNullParameter(paint, "<this>");
        EzySimpleBoardData.Paint paintBuild = EzySimpleBoardData.Paint.newBuilder().setColor(paint.getColor()).setWidth(paint.getStrokeWidth()).setIsDashed(paint.getPathEffect() != null).build();
        Intrinsics.checkNotNullExpressionValue(paintBuild, "build(...)");
        return paintBuild;
    }

    /* renamed from: c */
    public static final EzySimpleBoardData.Path m2580c(ProtoPath protoPath) {
        Intrinsics.checkNotNullParameter(protoPath, "<this>");
        EzySimpleBoardData.Path.Builder paint = EzySimpleBoardData.Path.newBuilder().setPaint(m2579b(protoPath.getPaint()));
        List<PointF> pointList = protoPath.getPointList();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(pointList, 10));
        for (PointF pointF : pointList) {
            arrayList.add(EzySimpleBoardData.PointF.newBuilder().addValue(pointF.x).addValue(pointF.y).build());
        }
        EzySimpleBoardData.Path pathBuild = paint.addAllPoint(arrayList).build();
        Intrinsics.checkNotNullExpressionValue(pathBuild, "build(...)");
        return pathBuild;
    }

    /* renamed from: d */
    public static final ProtoPath m2581d(EzySimpleBoardData.Path path) {
        Paint paint;
        Intrinsics.checkNotNullParameter(path, "<this>");
        if (path.hasPaint()) {
            EzySimpleBoardData.Paint paint2 = path.getPaint();
            Intrinsics.checkNotNullExpressionValue(paint2, "getPaint(...)");
            paint = m2578a(paint2);
        } else {
            paint = new Paint();
            paint.setStyle(Paint.Style.STROKE);
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_OVER));
            paint.setStrokeCap(Paint.Cap.ROUND);
            paint.setStrokeJoin(Paint.Join.ROUND);
            paint.setDither(true);
            paint.setAntiAlias(true);
            paint.setColor(ViewCompat.MEASURED_STATE_MASK);
            paint.setStrokeWidth(3.0f);
            paint.setPathEffect(null);
        }
        ArrayList arrayList = new ArrayList();
        List<EzySimpleBoardData.PointF> pointList = path.getPointList();
        Intrinsics.checkNotNullExpressionValue(pointList, "getPointList(...)");
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(pointList, 10));
        for (EzySimpleBoardData.PointF pointF : pointList) {
            arrayList2.add(new PointF(pointF.getValue(0), pointF.getValue(1)));
        }
        arrayList.addAll(arrayList2);
        return new ProtoPath(paint, arrayList);
    }
}
