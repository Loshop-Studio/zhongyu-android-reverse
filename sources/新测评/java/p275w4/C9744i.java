package p275w4;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import com.zykj.board.EzyPaint;
import com.zykj.board.EzySource;
import com.zykj.board.EzyTouchEvent;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import p077e5.AbstractC7351l;
import p077e5.AbstractC7352m;
import p131j4.C7792a;
import p142k4.InterfaceC7880c;
import p188o4.AbstractC8702c;

/* renamed from: w4.i */
/* loaded from: classes4.dex */
public final class C9744i extends AbstractC8702c {

    /* renamed from: k */
    public final Paint f17157k = new Paint();

    /* renamed from: l */
    public Path f17158l = new Path();

    @Override // p188o4.AbstractC8702c
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public void mo14313w(EzyTouchEvent.TouchEvent info) {
        Matrix matrix;
        Matrix matrixM13188b;
        Intrinsics.checkNotNullParameter(info, "info");
        Path path = this.f17158l;
        if (path != null) {
            path.reset();
            float x9 = info.getX();
            float y9 = info.getY();
            C7792a c7792aM14320c = m14320c();
            if (c7792aM14320c == null || (matrixM13188b = c7792aM14320c.m13188b()) == null || (matrix = AbstractC7352m.m11777b(matrixM13188b)) == null) {
                matrix = new Matrix();
            }
            path.addCircle(x9, y9, matrix.mapRadius(this.f17157k.getStrokeWidth() / 2), Path.Direction.CW);
            InterfaceC7880c interfaceC7880cM14319b = m14319b();
            if (interfaceC7880cM14319b != null) {
                Paint paint = this.f17157k;
                C7792a c7792aM14320c2 = m14320c();
                interfaceC7880cM14319b.mo13414A(path, paint, c7792aM14320c2 != null ? c7792aM14320c2.m13188b() : null);
            }
        }
    }

    @Override // p188o4.AbstractC8702c
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public boolean mo14315y(EzyTouchEvent.TouchEvent info, long j10) {
        Intrinsics.checkNotNullParameter(info, "info");
        return info.getEventTime() - m14312v() <= j10;
    }

    /* renamed from: D */
    public final void m16344D(EzySource.TouchSource.TouchInfo touchInfo, long j10) {
        Intrinsics.checkNotNullParameter(touchInfo, "touchInfo");
        Paint paint = this.f17157k;
        EzyPaint.Paint paintM8482s = touchInfo.m8482s();
        Intrinsics.checkNotNullExpressionValue(paintM8482s, "touchInfo.paint");
        paint.set(AbstractC7351l.m11773d(paintM8482s));
        Path path = this.f17158l;
        if (path != null) {
            path.reset();
        }
        List touchEventList = touchInfo.getTouchEventList();
        Intrinsics.checkNotNullExpressionValue(touchEventList, "touchInfo.touchEventList");
        if (touchEventList.isEmpty()) {
            return;
        }
        m14311A(touchInfo.getTouchEventList().listIterator());
        List touchEventList2 = touchInfo.getTouchEventList();
        Intrinsics.checkNotNullExpressionValue(touchEventList2, "touchInfo.touchEventList");
        m14314x(((EzyTouchEvent.TouchEvent) CollectionsKt.first(touchEventList2)).getEventTime());
        m14316z(j10);
    }

    @Override // p188o4.AbstractC8704e
    /* renamed from: s */
    public void mo6784s() {
        super.mo6784s();
        this.f17158l = null;
    }
}
