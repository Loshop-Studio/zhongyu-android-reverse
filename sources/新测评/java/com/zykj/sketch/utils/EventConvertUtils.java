package com.zykj.sketch.utils;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.view.MotionEvent;
import com.zykj.sketch.EzyDrawBoard;
import com.zykj.sketch.core.graph.GraphExtKt;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m13557d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, m13558d2 = {"Lcom/zykj/sketch/utils/EventConvertUtils;", "", "()V", "Companion", "sketch_release"}, m13559k = 1, m13560mv = {1, 7, 1}, m13562xi = 48)
/* loaded from: classes5.dex */
public final class EventConvertUtils {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(m13557d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\b¨\u0006\f"}, m13558d2 = {"Lcom/zykj/sketch/utils/EventConvertUtils$Companion;", "", "()V", "event2MotionEvent", "Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;", "touchEvent", "Landroid/view/MotionEvent;", "matrix", "Landroid/graphics/Matrix;", "mapPoint", "Landroid/graphics/PointF;", "pointF", "sketch_release"}, m13559k = 1, m13560mv = {1, 7, 1}, m13562xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final EzyDrawBoard.ActionTouchEvent.TouchEvent event2MotionEvent(MotionEvent touchEvent, Matrix matrix) {
            Intrinsics.checkNotNullParameter(touchEvent, "touchEvent");
            Intrinsics.checkNotNullParameter(matrix, "matrix");
            int pointerCount = touchEvent.getPointerCount();
            EzyDrawBoard.ActionTouchEvent.TouchEvent.PointerProperties.Builder[] builderArr = new EzyDrawBoard.ActionTouchEvent.TouchEvent.PointerProperties.Builder[pointerCount];
            for (int i10 = 0; i10 < pointerCount; i10++) {
                builderArr[i10] = EzyDrawBoard.ActionTouchEvent.TouchEvent.PointerProperties.newBuilder();
            }
            MotionEvent.PointerProperties pointerProperties = new MotionEvent.PointerProperties();
            int pointerCount2 = touchEvent.getPointerCount();
            for (int i11 = 0; i11 < pointerCount2; i11++) {
                touchEvent.getPointerProperties(i11, pointerProperties);
                builderArr[i11].setId(pointerProperties.id);
                builderArr[i11].setToolType(pointerProperties.toolType);
                pointerProperties.clear();
            }
            int pointerCount3 = touchEvent.getPointerCount();
            EzyDrawBoard.ActionTouchEvent.TouchEvent.PointerCoords.Builder[] builderArr2 = new EzyDrawBoard.ActionTouchEvent.TouchEvent.PointerCoords.Builder[pointerCount3];
            for (int i12 = 0; i12 < pointerCount3; i12++) {
                builderArr2[i12] = EzyDrawBoard.ActionTouchEvent.TouchEvent.PointerCoords.newBuilder();
            }
            MotionEvent.PointerCoords pointerCoords = new MotionEvent.PointerCoords();
            int pointerCount4 = touchEvent.getPointerCount();
            for (int i13 = 0; i13 < pointerCount4; i13++) {
                touchEvent.getPointerCoords(i13, pointerCoords);
                PointF pointFMapPoint = GraphExtKt.mapPoint(matrix, new PointF(pointerCoords.x, pointerCoords.y));
                builderArr2[i13].setX(pointFMapPoint.x);
                builderArr2[i13].setY(pointFMapPoint.y);
                pointerCoords.clear();
            }
            ArrayList arrayList = new ArrayList();
            for (int i14 = 0; i14 < pointerCount; i14++) {
                EzyDrawBoard.ActionTouchEvent.TouchEvent.PointerProperties pointerPropertiesBuild = builderArr[i14].build();
                Intrinsics.checkNotNullExpressionValue(pointerPropertiesBuild, "it.build()");
                arrayList.add(pointerPropertiesBuild);
            }
            ArrayList arrayList2 = new ArrayList();
            for (int i15 = 0; i15 < pointerCount3; i15++) {
                EzyDrawBoard.ActionTouchEvent.TouchEvent.PointerCoords pointerCoordsBuild = builderArr2[i15].build();
                Intrinsics.checkNotNullExpressionValue(pointerCoordsBuild, "it.build()");
                arrayList2.add(pointerCoordsBuild);
            }
            PointF pointFMapPoint2 = GraphExtKt.mapPoint(matrix, new PointF(touchEvent.getX(), touchEvent.getY()));
            EzyDrawBoard.ActionTouchEvent.TouchEvent.Builder builderNewBuilder = EzyDrawBoard.ActionTouchEvent.TouchEvent.newBuilder();
            builderNewBuilder.setEventTime(System.currentTimeMillis());
            builderNewBuilder.setAction(touchEvent.getActionMasked());
            builderNewBuilder.setPointerCount(touchEvent.getPointerCount());
            builderNewBuilder.setX(pointFMapPoint2.x);
            builderNewBuilder.setY(pointFMapPoint2.y);
            builderNewBuilder.addAllPointerProperties(arrayList);
            builderNewBuilder.addAllPointerCoords(arrayList2);
            return builderNewBuilder.build();
        }

        public final PointF mapPoint(PointF pointF, Matrix matrix) {
            Intrinsics.checkNotNullParameter(pointF, "pointF");
            Intrinsics.checkNotNullParameter(matrix, "matrix");
            return GraphExtKt.mapPoint(matrix, pointF);
        }

        private Companion() {
        }
    }
}
