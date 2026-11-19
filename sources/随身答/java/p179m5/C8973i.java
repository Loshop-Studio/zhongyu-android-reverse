package p179m5;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import com.zykj.board.EzyPaint;
import com.zykj.board.EzySource;
import com.zykj.board.EzyTouchEvent;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import p006a5.InterfaceC0039c;
import p095e5.AbstractC7848c;
import p263u5.AbstractC9694m;
import p263u5.AbstractC9695n;
import p312z4.C9998a;

/* renamed from: m5.i */
/* loaded from: classes4.dex */
public final class C8973i extends AbstractC7848c {

    /* renamed from: k */
    public final Paint f15075k = new Paint();

    /* renamed from: l */
    public Path f15076l = new Path();

    @Override // p095e5.AbstractC7848c
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public void mo12304w(EzyTouchEvent.TouchEvent info) {
        Matrix matrix;
        Matrix matrixM17344b;
        Intrinsics.checkNotNullParameter(info, "info");
        Path path = this.f15076l;
        if (path != null) {
            path.reset();
            float x9 = info.getX();
            float y9 = info.getY();
            C9998a c9998aM12311c = m12311c();
            if (c9998aM12311c == null || (matrixM17344b = c9998aM12311c.m17344b()) == null || (matrix = AbstractC9695n.m16200b(matrixM17344b)) == null) {
                matrix = new Matrix();
            }
            path.addCircle(x9, y9, matrix.mapRadius(this.f15075k.getStrokeWidth() / 2), Path.Direction.CW);
            InterfaceC0039c interfaceC0039cM12310b = m12310b();
            if (interfaceC0039cM12310b != null) {
                Paint paint = this.f15075k;
                C9998a c9998aM12311c2 = m12311c();
                interfaceC0039cM12310b.mo175B(path, paint, c9998aM12311c2 != null ? c9998aM12311c2.m17344b() : null);
            }
        }
    }

    @Override // p095e5.AbstractC7848c
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public boolean mo12306y(EzyTouchEvent.TouchEvent info, long j9) {
        Intrinsics.checkNotNullParameter(info, "info");
        return info.getEventTime() - m12303v() <= j9;
    }

    /* renamed from: D */
    public final void m14338D(EzySource.TouchSource.TouchInfo touchInfo, long j9) {
        Intrinsics.checkNotNullParameter(touchInfo, "touchInfo");
        Paint paint = this.f15075k;
        EzyPaint.Paint paintM9637v = touchInfo.m9637v();
        Intrinsics.checkNotNullExpressionValue(paintM9637v, "touchInfo.paint");
        paint.set(AbstractC9694m.m16196d(paintM9637v));
        Path path = this.f15076l;
        if (path != null) {
            path.reset();
        }
        List touchEventList = touchInfo.getTouchEventList();
        Intrinsics.checkNotNullExpressionValue(touchEventList, "touchInfo.touchEventList");
        if (touchEventList.isEmpty()) {
            return;
        }
        m12302A(touchInfo.getTouchEventList().listIterator());
        List touchEventList2 = touchInfo.getTouchEventList();
        Intrinsics.checkNotNullExpressionValue(touchEventList2, "touchInfo.touchEventList");
        m12305x(((EzyTouchEvent.TouchEvent) CollectionsKt.first(touchEventList2)).getEventTime());
        m12307z(j9);
    }

    @Override // p095e5.AbstractC7850e
    /* renamed from: s */
    public void mo7896s() {
        super.mo7896s();
        this.f15076l = null;
    }
}
