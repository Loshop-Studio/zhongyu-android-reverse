package com.zykj.blackboard.utils;

import android.graphics.Matrix;
import android.view.MotionEvent;
import com.zykj.board.EzyTouchEvent;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC9133u;

/* loaded from: classes4.dex */
public final class EventConvert {
    public static final EventConvert INSTANCE = new EventConvert();

    private EventConvert() {
    }

    private final List<EzyTouchEvent.TouchEvent.PointerProperties> buildPointPropertiesList(MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        int pointerCount = motionEvent.getPointerCount();
        EzyTouchEvent.TouchEvent.PointerProperties.C7272b[] c7272bArr = new EzyTouchEvent.TouchEvent.PointerProperties.C7272b[pointerCount];
        for (int i10 = 0; i10 < pointerCount; i10++) {
            c7272bArr[i10] = EzyTouchEvent.TouchEvent.PointerProperties.m9119e();
        }
        MotionEvent.PointerProperties pointerProperties = new MotionEvent.PointerProperties();
        int pointerCount2 = motionEvent.getPointerCount();
        for (int i11 = 0; i11 < pointerCount2; i11++) {
            motionEvent.getPointerProperties(i11, pointerProperties);
            c7272bArr[i11].m9139r(pointerProperties.id);
            c7272bArr[i11].m9141t(pointerProperties.toolType);
        }
        for (int i12 = 0; i12 < pointerCount; i12++) {
            EzyTouchEvent.TouchEvent.PointerProperties pointerPropertiesBuild = c7272bArr[i12].build();
            AbstractC9133u.m16132f(pointerPropertiesBuild, "it.build()");
            arrayList.add(pointerPropertiesBuild);
        }
        return arrayList;
    }

    public final EzyTouchEvent.TouchEvent motionEventConvertTouchEvent(MotionEvent touchEvent, Matrix matrix) {
        AbstractC9133u.m16133g(touchEvent, "touchEvent");
        ArrayList arrayList = new ArrayList();
        int pointerCount = touchEvent.getPointerCount();
        EzyTouchEvent.TouchEvent.PointerCoords.C7270b[] c7270bArr = new EzyTouchEvent.TouchEvent.PointerCoords.C7270b[pointerCount];
        for (int i10 = 0; i10 < pointerCount; i10++) {
            c7270bArr[i10] = EzyTouchEvent.TouchEvent.PointerCoords.m9092e();
        }
        MotionEvent.PointerCoords pointerCoords = new MotionEvent.PointerCoords();
        float[] fArr = {0.0f, 0.0f};
        int pointerCount2 = touchEvent.getPointerCount();
        for (int i11 = 0; i11 < pointerCount2; i11++) {
            touchEvent.getPointerCoords(i11, pointerCoords);
            fArr[0] = pointerCoords.x;
            fArr[1] = pointerCoords.y;
            if (matrix != null) {
                matrix.mapPoints(fArr);
            }
            c7270bArr[i11].m9114t(fArr[0]);
            c7270bArr[i11].m9115u(fArr[1]);
            pointerCoords.clear();
        }
        for (int i12 = 0; i12 < pointerCount; i12++) {
            EzyTouchEvent.TouchEvent.PointerCoords pointerCoordsBuild = c7270bArr[i12].build();
            AbstractC9133u.m16132f(pointerCoordsBuild, "it.build()");
            arrayList.add(pointerCoordsBuild);
        }
        fArr[0] = touchEvent.getX();
        fArr[1] = touchEvent.getY();
        if (matrix != null) {
            matrix.mapPoints(fArr);
        }
        EzyTouchEvent.TouchEvent.C7274b c7274bM9083o = EzyTouchEvent.TouchEvent.m9083o();
        c7274bM9083o.m9165v(System.currentTimeMillis());
        c7274bM9083o.m9164u(touchEvent.getActionMasked());
        c7274bM9083o.m9168y(touchEvent.getPointerCount());
        c7274bM9083o.m9145B(fArr[0]);
        c7274bM9083o.m9146C(fArr[1]);
        c7274bM9083o.m9148e(buildPointPropertiesList(touchEvent));
        c7274bM9083o.m9147c(arrayList);
        EzyTouchEvent.TouchEvent build = c7274bM9083o.build();
        arrayList.clear();
        AbstractC9133u.m16132f(build, "build");
        return build;
    }

    public final EzyTouchEvent.TouchEvent updateTouchEventByNewMatrix(EzyTouchEvent.TouchEvent touchEvent, Matrix matrix) {
        AbstractC9133u.m16133g(touchEvent, "touchEvent");
        EzyTouchEvent.TouchEvent.C7274b builder = touchEvent.toBuilder();
        float[] fArr = {0.0f, 0.0f};
        int pointerCount = builder.getPointerCount();
        for (int i10 = 0; i10 < pointerCount; i10++) {
            EzyTouchEvent.TouchEvent.PointerCoords.C7270b builder2 = builder.m9159p(i10).toBuilder();
            fArr[0] = builder2.getX();
            fArr[1] = builder2.getY();
            if (matrix != null) {
                matrix.mapPoints(fArr);
            }
            builder2.m9114t(fArr[0]);
            builder2.m9115u(fArr[1]);
            builder.m9167x(i10, builder2);
        }
        fArr[0] = builder.getX();
        fArr[1] = builder.getY();
        if (matrix != null) {
            matrix.mapPoints(fArr);
        }
        builder.m9145B(fArr[0]);
        builder.m9146C(fArr[1]);
        EzyTouchEvent.TouchEvent touchEventBuild = builder.build();
        AbstractC9133u.m16132f(touchEventBuild, "builder.build()");
        return touchEventBuild;
    }
}
