package p179m5;

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
import p312z4.C9998a;

/* renamed from: m5.s */
/* loaded from: classes4.dex */
public final class C8983s extends AbstractC7848c {

    /* renamed from: l */
    public float f15093l;

    /* renamed from: m */
    public float f15094m;

    /* renamed from: k */
    public final Paint f15092k = new Paint();

    /* renamed from: n */
    public Path f15095n = new Path();

    @Override // p095e5.AbstractC7848c
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public void mo12304w(EzyTouchEvent.TouchEvent info) {
        Intrinsics.checkNotNullParameter(info, "info");
        Path path = this.f15095n;
        if (path == null) {
            return;
        }
        if (path.isEmpty()) {
            this.f15093l = info.getX();
            float y9 = info.getY();
            this.f15094m = y9;
            path.moveTo(this.f15093l, y9);
            path.lineTo(this.f15093l, this.f15094m);
            return;
        }
        float f10 = 2;
        path.quadTo(this.f15093l, this.f15094m, (info.getX() + this.f15093l) / f10, (info.getY() + this.f15094m) / f10);
        this.f15093l = info.getX();
        this.f15094m = info.getY();
        InterfaceC0039c interfaceC0039cM12310b = m12310b();
        if (interfaceC0039cM12310b != null) {
            Paint paint = this.f15092k;
            C9998a c9998aM12311c = m12311c();
            interfaceC0039cM12310b.mo175B(path, paint, c9998aM12311c != null ? c9998aM12311c.m17344b() : null);
        }
    }

    @Override // p095e5.AbstractC7848c
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public boolean mo12306y(EzyTouchEvent.TouchEvent info, long j9) {
        Intrinsics.checkNotNullParameter(info, "info");
        return info.getEventTime() - m12303v() <= j9;
    }

    /* renamed from: D */
    public final void m14344D(EzySource.TouchSource.TouchInfo touchInfo, long j9) {
        Intrinsics.checkNotNullParameter(touchInfo, "touchInfo");
        Paint paint = this.f15092k;
        EzyPaint.Paint paintM9637v = touchInfo.m9637v();
        Intrinsics.checkNotNullExpressionValue(paintM9637v, "touchInfo.paint");
        paint.set(AbstractC9694m.m16196d(paintM9637v));
        Path path = this.f15095n;
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
        this.f15095n = null;
    }
}
