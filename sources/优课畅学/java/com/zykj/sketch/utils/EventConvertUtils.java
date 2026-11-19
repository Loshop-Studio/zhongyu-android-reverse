package com.zykj.sketch.utils;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.view.MotionEvent;
import com.zykj.sketch.EzyDrawBoard;
import com.zykj.sketch.core.graph.GraphExtKt;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;

/* loaded from: classes3.dex */
public final class EventConvertUtils {
    public static final Companion Companion = new Companion(null);

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9126n abstractC9126n) {
            this();
        }

        public final EzyDrawBoard.ActionTouchEvent.TouchEvent event2MotionEvent(MotionEvent touchEvent, Matrix matrix) {
            AbstractC9133u.m16133g(touchEvent, "touchEvent");
            AbstractC9133u.m16133g(matrix, "matrix");
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
                AbstractC9133u.m16132f(pointerPropertiesBuild, "it.build()");
                arrayList.add(pointerPropertiesBuild);
            }
            ArrayList arrayList2 = new ArrayList();
            for (int i15 = 0; i15 < pointerCount3; i15++) {
                EzyDrawBoard.ActionTouchEvent.TouchEvent.PointerCoords pointerCoordsBuild = builderArr2[i15].build();
                AbstractC9133u.m16132f(pointerCoordsBuild, "it.build()");
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
            AbstractC9133u.m16133g(pointF, "pointF");
            AbstractC9133u.m16133g(matrix, "matrix");
            return GraphExtKt.mapPoint(matrix, pointF);
        }

        private Companion() {
        }
    }
}
