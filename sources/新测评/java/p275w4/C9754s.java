package p275w4;

import android.graphics.Paint;
import android.graphics.Path;
import com.zykj.board.EzyPaint;
import com.zykj.board.EzySource;
import com.zykj.board.EzyTouchEvent;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import p077e5.AbstractC7351l;
import p131j4.C7792a;
import p142k4.InterfaceC7880c;
import p188o4.AbstractC8702c;

/* renamed from: w4.s */
/* loaded from: classes4.dex */
public final class C9754s extends AbstractC8702c {

    /* renamed from: l */
    public float f17175l;

    /* renamed from: m */
    public float f17176m;

    /* renamed from: k */
    public final Paint f17174k = new Paint();

    /* renamed from: n */
    public Path f17177n = new Path();

    @Override // p188o4.AbstractC8702c
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public void mo14313w(EzyTouchEvent.TouchEvent info) {
        Intrinsics.checkNotNullParameter(info, "info");
        Path path = this.f17177n;
        if (path == null) {
            return;
        }
        if (path.isEmpty()) {
            this.f17175l = info.getX();
            float y9 = info.getY();
            this.f17176m = y9;
            path.moveTo(this.f17175l, y9);
            path.lineTo(this.f17175l, this.f17176m);
            return;
        }
        float f10 = 2;
        path.quadTo(this.f17175l, this.f17176m, (info.getX() + this.f17175l) / f10, (info.getY() + this.f17176m) / f10);
        this.f17175l = info.getX();
        this.f17176m = info.getY();
        InterfaceC7880c interfaceC7880cM14319b = m14319b();
        if (interfaceC7880cM14319b != null) {
            Paint paint = this.f17174k;
            C7792a c7792aM14320c = m14320c();
            interfaceC7880cM14319b.mo13414A(path, paint, c7792aM14320c != null ? c7792aM14320c.m13188b() : null);
        }
    }

    @Override // p188o4.AbstractC8702c
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public boolean mo14315y(EzyTouchEvent.TouchEvent info, long j10) {
        Intrinsics.checkNotNullParameter(info, "info");
        return info.getEventTime() - m14312v() <= j10;
    }

    /* renamed from: D */
    public final void m16350D(EzySource.TouchSource.TouchInfo touchInfo, long j10) {
        Intrinsics.checkNotNullParameter(touchInfo, "touchInfo");
        Paint paint = this.f17174k;
        EzyPaint.Paint paintM8482s = touchInfo.m8482s();
        Intrinsics.checkNotNullExpressionValue(paintM8482s, "touchInfo.paint");
        paint.set(AbstractC7351l.m11773d(paintM8482s));
        Path path = this.f17177n;
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
        this.f17177n = null;
    }
}
