package com.zykj.view.utils;

// RE note 本类字节码直接引用的读写或显示接口包括Protobuf。

import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.ViewCompat;
import com.zykj.view.EzySimpleBoardData;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.AbstractC5806u;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(m5109d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0000\u001a\u00020\u0002*\u00020\u0001\u001a\n\u0010\u0003\u001a\u00020\u0004*\u00020\u0005\u001a\n\u0010\u0003\u001a\u00020\u0005*\u00020\u0004¨\u0006\u0006"}, m5110d2 = {"convertToProtoPaint", "Lcom/zykj/view/EzySimpleBoardData$Paint;", "Landroid/graphics/Paint;", "convertToProtoPath", "Lcom/zykj/view/utils/ProtoPath;", "Lcom/zykj/view/EzySimpleBoardData$Path;", "view_release"}, m5111k = 2, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nProtoFileUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProtoFileUtils.kt\ncom/zykj/view/utils/ProtoFileUtilsKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,159:1\n1563#2:160\n1634#2,3:161\n1563#2:164\n1634#2,3:165\n*S KotlinDebug\n*F\n+ 1 ProtoFileUtils.kt\ncom/zykj/view/utils/ProtoFileUtilsKt\n*L\n68#1:160\n68#1:161,3\n85#1:164\n85#1:165,3\n*E\n"})
/* loaded from: classes3.dex */
public final class ProtoFileUtilsKt {
    @NotNull
    public static final EzySimpleBoardData.Paint convertToProtoPaint(@NotNull Paint paint) {
        AbstractC5830k.m5330g(paint, "<this>");
        EzySimpleBoardData.Paint paintBuild = EzySimpleBoardData.Paint.newBuilder().setColor(paint.getColor()).setWidth(paint.getStrokeWidth()).setIsDashed(paint.getPathEffect() != null).build();
        AbstractC5830k.m5329f(paintBuild, "build(...)");
        return paintBuild;
    }

    @NotNull
    public static final ProtoPath convertToProtoPath(@NotNull EzySimpleBoardData.Path path) {
        Paint paint;
        AbstractC5830k.m5330g(path, "<this>");
        if (path.hasPaint()) {
            EzySimpleBoardData.Paint paint2 = path.getPaint();
            AbstractC5830k.m5329f(paint2, "getPaint(...)");
            paint = convertToProtoPaint(paint2);
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
        AbstractC5830k.m5329f(pointList, "getPointList(...)");
        ArrayList arrayList2 = new ArrayList(AbstractC5806u.m5277p(pointList, 10));
        for (EzySimpleBoardData.PointF pointF : pointList) {
            arrayList2.add(new PointF(pointF.getValue(0), pointF.getValue(1)));
        }
        arrayList.addAll(arrayList2);
        return new ProtoPath(paint, arrayList);
    }

    @NotNull
    public static final Paint convertToProtoPaint(@NotNull EzySimpleBoardData.Paint paint) {
        AbstractC5830k.m5330g(paint, "<this>");
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

    @NotNull
    public static final EzySimpleBoardData.Path convertToProtoPath(@NotNull ProtoPath protoPath) {
        AbstractC5830k.m5330g(protoPath, "<this>");
        EzySimpleBoardData.Path.Builder paint = EzySimpleBoardData.Path.newBuilder().setPaint(convertToProtoPaint(protoPath.getPaint()));
        List<PointF> pointList = protoPath.getPointList();
        ArrayList arrayList = new ArrayList(AbstractC5806u.m5277p(pointList, 10));
        for (PointF pointF : pointList) {
            arrayList.add(EzySimpleBoardData.PointF.newBuilder().addValue(pointF.x).addValue(pointF.y).build());
        }
        EzySimpleBoardData.Path pathBuild = paint.addAllPoint(arrayList).build();
        AbstractC5830k.m5329f(pathBuild, "build(...)");
        return pathBuild;
    }
}
