package p077e5;

import android.graphics.Matrix;
import android.view.MotionEvent;
import com.zykj.board.EzyTouchEvent;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: e5.i */
/* loaded from: classes4.dex */
public final class C7348i {

    /* renamed from: a */
    public static final C7348i f11916a = new C7348i();

    /* renamed from: a */
    public final List m11760a(MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        int pointerCount = motionEvent.getPointerCount();
        EzyTouchEvent.TouchEvent.PointerProperties.C6843b[] c6843bArr = new EzyTouchEvent.TouchEvent.PointerProperties.C6843b[pointerCount];
        for (int i10 = 0; i10 < pointerCount; i10++) {
            c6843bArr[i10] = EzyTouchEvent.TouchEvent.PointerProperties.m8583m();
        }
        MotionEvent.PointerProperties pointerProperties = new MotionEvent.PointerProperties();
        int pointerCount2 = motionEvent.getPointerCount();
        for (int i11 = 0; i11 < pointerCount2; i11++) {
            motionEvent.getPointerProperties(i11, pointerProperties);
            c6843bArr[i11].m8603r(pointerProperties.id);
            c6843bArr[i11].m8605t(pointerProperties.toolType);
        }
        for (int i12 = 0; i12 < pointerCount; i12++) {
            EzyTouchEvent.TouchEvent.PointerProperties pointerPropertiesBuild = c6843bArr[i12].build();
            Intrinsics.checkNotNullExpressionValue(pointerPropertiesBuild, "it.build()");
            arrayList.add(pointerPropertiesBuild);
        }
        return arrayList;
    }

    /* renamed from: b */
    public final EzyTouchEvent.TouchEvent m11761b(MotionEvent touchEvent, Matrix matrix) {
        Intrinsics.checkNotNullParameter(touchEvent, "touchEvent");
        ArrayList arrayList = new ArrayList();
        int pointerCount = touchEvent.getPointerCount();
        EzyTouchEvent.TouchEvent.PointerCoords.C6841b[] c6841bArr = new EzyTouchEvent.TouchEvent.PointerCoords.C6841b[pointerCount];
        for (int i10 = 0; i10 < pointerCount; i10++) {
            c6841bArr[i10] = EzyTouchEvent.TouchEvent.PointerCoords.m8556m();
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
            c6841bArr[i11].m8578t(fArr[0]);
            c6841bArr[i11].m8579u(fArr[1]);
            pointerCoords.clear();
        }
        for (int i12 = 0; i12 < pointerCount; i12++) {
            EzyTouchEvent.TouchEvent.PointerCoords pointerCoordsBuild = c6841bArr[i12].build();
            Intrinsics.checkNotNullExpressionValue(pointerCoordsBuild, "it.build()");
            arrayList.add(pointerCoordsBuild);
        }
        fArr[0] = touchEvent.getX();
        fArr[1] = touchEvent.getY();
        if (matrix != null) {
            matrix.mapPoints(fArr);
        }
        EzyTouchEvent.TouchEvent.C6845b c6845bM8547x = EzyTouchEvent.TouchEvent.m8547x();
        c6845bM8547x.m8629v(System.currentTimeMillis());
        c6845bM8547x.m8628u(touchEvent.getActionMasked());
        c6845bM8547x.m8632y(touchEvent.getPointerCount());
        c6845bM8547x.m8609B(fArr[0]);
        c6845bM8547x.m8610C(fArr[1]);
        c6845bM8547x.m8612c(m11760a(touchEvent));
        c6845bM8547x.m8611b(arrayList);
        EzyTouchEvent.TouchEvent build = c6845bM8547x.build();
        arrayList.clear();
        Intrinsics.checkNotNullExpressionValue(build, "build");
        return build;
    }

    /* renamed from: c */
    public final EzyTouchEvent.TouchEvent m11762c(EzyTouchEvent.TouchEvent touchEvent, Matrix matrix) {
        Intrinsics.checkNotNullParameter(touchEvent, "touchEvent");
        EzyTouchEvent.TouchEvent.C6845b builder = touchEvent.toBuilder();
        float[] fArr = {0.0f, 0.0f};
        int pointerCount = builder.getPointerCount();
        for (int i10 = 0; i10 < pointerCount; i10++) {
            EzyTouchEvent.TouchEvent.PointerCoords.C6841b builder2 = builder.m8623p(i10).toBuilder();
            fArr[0] = builder2.getX();
            fArr[1] = builder2.getY();
            if (matrix != null) {
                matrix.mapPoints(fArr);
            }
            builder2.m8578t(fArr[0]);
            builder2.m8579u(fArr[1]);
            builder.m8631x(i10, builder2);
        }
        fArr[0] = builder.getX();
        fArr[1] = builder.getY();
        if (matrix != null) {
            matrix.mapPoints(fArr);
        }
        builder.m8609B(fArr[0]);
        builder.m8610C(fArr[1]);
        EzyTouchEvent.TouchEvent touchEventBuild = builder.build();
        Intrinsics.checkNotNullExpressionValue(touchEventBuild, "builder.build()");
        return touchEventBuild;
    }
}
