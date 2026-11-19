package p263u5;

import android.graphics.Matrix;
import android.view.MotionEvent;
import com.zykj.board.EzyTouchEvent;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: u5.j */
/* loaded from: classes4.dex */
public final class C9691j {

    /* renamed from: a */
    public static final C9691j f17129a = new C9691j();

    /* renamed from: a */
    public final List m16181a(MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        int pointerCount = motionEvent.getPointerCount();
        EzyTouchEvent.TouchEvent.PointerProperties.C7162b[] c7162bArr = new EzyTouchEvent.TouchEvent.PointerProperties.C7162b[pointerCount];
        for (int i9 = 0; i9 < pointerCount; i9++) {
            c7162bArr[i9] = EzyTouchEvent.TouchEvent.PointerProperties.m9742n();
        }
        MotionEvent.PointerProperties pointerProperties = new MotionEvent.PointerProperties();
        int pointerCount2 = motionEvent.getPointerCount();
        for (int i10 = 0; i10 < pointerCount2; i10++) {
            motionEvent.getPointerProperties(i10, pointerProperties);
            c7162bArr[i10].m9762r(pointerProperties.id);
            c7162bArr[i10].m9764t(pointerProperties.toolType);
        }
        for (int i11 = 0; i11 < pointerCount; i11++) {
            EzyTouchEvent.TouchEvent.PointerProperties pointerPropertiesBuild = c7162bArr[i11].build();
            Intrinsics.checkNotNullExpressionValue(pointerPropertiesBuild, "it.build()");
            arrayList.add(pointerPropertiesBuild);
        }
        return arrayList;
    }

    /* renamed from: b */
    public final EzyTouchEvent.TouchEvent m16182b(MotionEvent touchEvent, Matrix matrix) {
        Intrinsics.checkNotNullParameter(touchEvent, "touchEvent");
        ArrayList arrayList = new ArrayList();
        int pointerCount = touchEvent.getPointerCount();
        EzyTouchEvent.TouchEvent.PointerCoords.C7160b[] c7160bArr = new EzyTouchEvent.TouchEvent.PointerCoords.C7160b[pointerCount];
        for (int i9 = 0; i9 < pointerCount; i9++) {
            c7160bArr[i9] = EzyTouchEvent.TouchEvent.PointerCoords.m9715n();
        }
        MotionEvent.PointerCoords pointerCoords = new MotionEvent.PointerCoords();
        float[] fArr = {0.0f, 0.0f};
        int pointerCount2 = touchEvent.getPointerCount();
        for (int i10 = 0; i10 < pointerCount2; i10++) {
            touchEvent.getPointerCoords(i10, pointerCoords);
            fArr[0] = pointerCoords.x;
            fArr[1] = pointerCoords.y;
            if (matrix != null) {
                matrix.mapPoints(fArr);
            }
            c7160bArr[i10].m9737t(fArr[0]);
            c7160bArr[i10].m9738u(fArr[1]);
            pointerCoords.clear();
        }
        for (int i11 = 0; i11 < pointerCount; i11++) {
            EzyTouchEvent.TouchEvent.PointerCoords pointerCoordsBuild = c7160bArr[i11].build();
            Intrinsics.checkNotNullExpressionValue(pointerCoordsBuild, "it.build()");
            arrayList.add(pointerCoordsBuild);
        }
        fArr[0] = touchEvent.getX();
        fArr[1] = touchEvent.getY();
        if (matrix != null) {
            matrix.mapPoints(fArr);
        }
        EzyTouchEvent.TouchEvent.C7164b c7164bM9695A = EzyTouchEvent.TouchEvent.m9695A();
        c7164bM9695A.m9788v(System.currentTimeMillis());
        c7164bM9695A.m9787u(touchEvent.getActionMasked());
        c7164bM9695A.m9791y(touchEvent.getPointerCount());
        c7164bM9695A.m9768B(fArr[0]);
        c7164bM9695A.m9769C(fArr[1]);
        c7164bM9695A.m9771d(m16181a(touchEvent));
        c7164bM9695A.m9770b(arrayList);
        EzyTouchEvent.TouchEvent build = c7164bM9695A.build();
        arrayList.clear();
        Intrinsics.checkNotNullExpressionValue(build, "build");
        return build;
    }

    /* renamed from: c */
    public final EzyTouchEvent.TouchEvent m16183c(EzyTouchEvent.TouchEvent touchEvent, Matrix matrix) {
        Intrinsics.checkNotNullParameter(touchEvent, "touchEvent");
        EzyTouchEvent.TouchEvent.C7164b builder = touchEvent.toBuilder();
        float[] fArr = {0.0f, 0.0f};
        int pointerCount = builder.getPointerCount();
        for (int i9 = 0; i9 < pointerCount; i9++) {
            EzyTouchEvent.TouchEvent.PointerCoords.C7160b builder2 = builder.m9782p(i9).toBuilder();
            fArr[0] = builder2.getX();
            fArr[1] = builder2.getY();
            if (matrix != null) {
                matrix.mapPoints(fArr);
            }
            builder2.m9737t(fArr[0]);
            builder2.m9738u(fArr[1]);
            builder.m9790x(i9, builder2);
        }
        fArr[0] = builder.getX();
        fArr[1] = builder.getY();
        if (matrix != null) {
            matrix.mapPoints(fArr);
        }
        builder.m9768B(fArr[0]);
        builder.m9769C(fArr[1]);
        EzyTouchEvent.TouchEvent touchEventBuild = builder.build();
        Intrinsics.checkNotNullExpressionValue(touchEventBuild, "builder.build()");
        return touchEventBuild;
    }
}
