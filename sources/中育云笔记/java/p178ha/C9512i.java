package p178ha;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import com.zykj.board.EzyPaint;
import com.zykj.board.EzySource;
import com.zykj.board.EzyTouchEvent;
import java.util.List;
import kotlin.jvm.internal.AbstractC9979u;
import na.AbstractC10350m;
import na.AbstractC10351n;
import p325rc.AbstractC10947g0;
import p362u9.C11373a;
import p377v9.InterfaceC11552c;
import p437z9.AbstractC12029c;

/* renamed from: ha.i */
/* loaded from: classes5.dex */
public final class C9512i extends AbstractC12029c {

    /* renamed from: m */
    public final Paint f22029m = new Paint();

    /* renamed from: n */
    public Path f22030n = new Path();

    @Override // p437z9.AbstractC12029c
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public void mo18751w(EzyTouchEvent.TouchEvent info) {
        Matrix matrix;
        Matrix matrixM25311b;
        AbstractC9979u.m20294g(info, "info");
        Path path = this.f22030n;
        if (path != null) {
            path.reset();
            float x10 = info.getX();
            float y10 = info.getY();
            C11373a c11373aM26644c = m26644c();
            if (c11373aM26644c == null || (matrixM25311b = c11373aM26644c.m25311b()) == null || (matrix = AbstractC10351n.m21660b(matrixM25311b)) == null) {
                matrix = new Matrix();
            }
            path.addCircle(x10, y10, matrix.mapRadius(this.f22029m.getStrokeWidth() / 2), Path.Direction.CW);
            InterfaceC11552c interfaceC11552cM26643b = m26643b();
            if (interfaceC11552cM26643b != null) {
                Paint paint = this.f22029m;
                C11373a c11373aM26644c2 = m26644c();
                interfaceC11552cM26643b.mo25416B(path, paint, c11373aM26644c2 != null ? c11373aM26644c2.m25311b() : null);
            }
        }
    }

    @Override // p437z9.AbstractC12029c
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public boolean mo18752y(EzyTouchEvent.TouchEvent info, long j10) {
        AbstractC9979u.m20294g(info, "info");
        return info.getEventTime() - m26639v() <= j10;
    }

    /* renamed from: D */
    public final void m18768D(EzySource.TouchSource.TouchInfo touchInfo, long j10) {
        AbstractC9979u.m20294g(touchInfo, "touchInfo");
        Paint paint = this.f22029m;
        EzyPaint.Paint paintM16265n = touchInfo.m16265n();
        AbstractC9979u.m20293f(paintM16265n, "touchInfo.paint");
        paint.set(AbstractC10350m.m21656d(paintM16265n));
        Path path = this.f22030n;
        if (path != null) {
            path.reset();
        }
        List touchEventList = touchInfo.getTouchEventList();
        AbstractC9979u.m20293f(touchEventList, "touchInfo.touchEventList");
        if (touchEventList.isEmpty()) {
            return;
        }
        m26638A(touchInfo.getTouchEventList().listIterator());
        List touchEventList2 = touchInfo.getTouchEventList();
        AbstractC9979u.m20293f(touchEventList2, "touchInfo.touchEventList");
        m26640x(((EzyTouchEvent.TouchEvent) AbstractC10947g0.m23944m0(touchEventList2)).getEventTime());
        m26641z(j10);
    }

    @Override // p437z9.AbstractC12031e
    /* renamed from: s */
    public void mo14520s() {
        super.mo14520s();
        this.f22030n = null;
    }
}
