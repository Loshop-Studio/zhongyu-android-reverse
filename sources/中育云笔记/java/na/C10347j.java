package na;

import android.graphics.Matrix;
import android.view.MotionEvent;
import com.zykj.board.EzyTouchEvent;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC9979u;

/* renamed from: na.j */
/* loaded from: classes5.dex */
public final class C10347j {

    /* renamed from: a */
    public static final C10347j f24654a = new C10347j();

    /* renamed from: a */
    public final List m21642a(MotionEvent motionEvent) {
        ArrayList arrayList = new ArrayList();
        int pointerCount = motionEvent.getPointerCount();
        EzyTouchEvent.TouchEvent.PointerProperties.C8540b[] c8540bArr = new EzyTouchEvent.TouchEvent.PointerProperties.C8540b[pointerCount];
        for (int i10 = 0; i10 < pointerCount; i10++) {
            c8540bArr[i10] = EzyTouchEvent.TouchEvent.PointerProperties.m16371f();
        }
        MotionEvent.PointerProperties pointerProperties = new MotionEvent.PointerProperties();
        int pointerCount2 = motionEvent.getPointerCount();
        for (int i11 = 0; i11 < pointerCount2; i11++) {
            motionEvent.getPointerProperties(i11, pointerProperties);
            c8540bArr[i11].m16391q(pointerProperties.id);
            c8540bArr[i11].m16393s(pointerProperties.toolType);
        }
        for (int i12 = 0; i12 < pointerCount; i12++) {
            EzyTouchEvent.TouchEvent.PointerProperties pointerPropertiesBuild = c8540bArr[i12].build();
            AbstractC9979u.m20293f(pointerPropertiesBuild, "it.build()");
            arrayList.add(pointerPropertiesBuild);
        }
        return arrayList;
    }

    /* renamed from: b */
    public final EzyTouchEvent.TouchEvent m21643b(MotionEvent touchEvent, Matrix matrix) {
        AbstractC9979u.m20294g(touchEvent, "touchEvent");
        ArrayList arrayList = new ArrayList();
        int pointerCount = touchEvent.getPointerCount();
        EzyTouchEvent.TouchEvent.PointerCoords.C8538b[] c8538bArr = new EzyTouchEvent.TouchEvent.PointerCoords.C8538b[pointerCount];
        for (int i10 = 0; i10 < pointerCount; i10++) {
            c8538bArr[i10] = EzyTouchEvent.TouchEvent.PointerCoords.m16344f();
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
            c8538bArr[i11].m16366s(fArr[0]);
            c8538bArr[i11].m16367t(fArr[1]);
            pointerCoords.clear();
        }
        for (int i12 = 0; i12 < pointerCount; i12++) {
            EzyTouchEvent.TouchEvent.PointerCoords pointerCoordsBuild = c8538bArr[i12].build();
            AbstractC9979u.m20293f(pointerCoordsBuild, "it.build()");
            arrayList.add(pointerCoordsBuild);
        }
        fArr[0] = touchEvent.getX();
        fArr[1] = touchEvent.getY();
        if (matrix != null) {
            matrix.mapPoints(fArr);
        }
        EzyTouchEvent.TouchEvent.C8542b c8542bM16335u = EzyTouchEvent.TouchEvent.m16335u();
        c8542bM16335u.m16416u(System.currentTimeMillis());
        c8542bM16335u.m16415t(touchEvent.getActionMasked());
        c8542bM16335u.m16419x(touchEvent.getPointerCount());
        c8542bM16335u.m16396A(fArr[0]);
        c8542bM16335u.m16397B(fArr[1]);
        c8542bM16335u.m16399d(m21642a(touchEvent));
        c8542bM16335u.m16398b(arrayList);
        EzyTouchEvent.TouchEvent build = c8542bM16335u.build();
        arrayList.clear();
        AbstractC9979u.m20293f(build, "build");
        return build;
    }

    /* renamed from: c */
    public final EzyTouchEvent.TouchEvent m21644c(EzyTouchEvent.TouchEvent touchEvent, Matrix matrix) {
        AbstractC9979u.m20294g(touchEvent, "touchEvent");
        EzyTouchEvent.TouchEvent.C8542b builder = touchEvent.toBuilder();
        float[] fArr = {0.0f, 0.0f};
        int pointerCount = builder.getPointerCount();
        for (int i10 = 0; i10 < pointerCount; i10++) {
            EzyTouchEvent.TouchEvent.PointerCoords.C8538b builder2 = builder.m16410o(i10).toBuilder();
            fArr[0] = builder2.getX();
            fArr[1] = builder2.getY();
            if (matrix != null) {
                matrix.mapPoints(fArr);
            }
            builder2.m16366s(fArr[0]);
            builder2.m16367t(fArr[1]);
            builder.m16418w(i10, builder2);
        }
        fArr[0] = builder.getX();
        fArr[1] = builder.getY();
        if (matrix != null) {
            matrix.mapPoints(fArr);
        }
        builder.m16396A(fArr[0]);
        builder.m16397B(fArr[1]);
        EzyTouchEvent.TouchEvent touchEventBuild = builder.build();
        AbstractC9979u.m20293f(touchEventBuild, "builder.build()");
        return touchEventBuild;
    }
}
