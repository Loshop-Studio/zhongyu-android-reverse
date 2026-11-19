package p178ha;

import android.graphics.Paint;
import android.graphics.Path;
import com.zykj.board.EzyPaint;
import com.zykj.board.EzySource;
import com.zykj.board.EzyTouchEvent;
import java.util.List;
import kotlin.jvm.internal.AbstractC9979u;
import na.AbstractC10350m;
import p325rc.AbstractC10947g0;
import p362u9.C11373a;
import p377v9.InterfaceC11552c;
import p437z9.AbstractC12029c;

/* renamed from: ha.s */
/* loaded from: classes5.dex */
public final class C9522s extends AbstractC12029c {

    /* renamed from: n */
    public float f22047n;

    /* renamed from: o */
    public float f22048o;

    /* renamed from: m */
    public final Paint f22046m = new Paint();

    /* renamed from: p */
    public Path f22049p = new Path();

    @Override // p437z9.AbstractC12029c
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public void mo18751w(EzyTouchEvent.TouchEvent info) {
        AbstractC9979u.m20294g(info, "info");
        Path path = this.f22049p;
        if (path != null && path.isEmpty()) {
            this.f22047n = info.getX();
            float y10 = info.getY();
            this.f22048o = y10;
            Path path2 = this.f22049p;
            if (path2 != null) {
                path2.moveTo(this.f22047n, y10);
            }
            Path path3 = this.f22049p;
            if (path3 != null) {
                path3.lineTo(this.f22047n, this.f22048o);
                return;
            }
            return;
        }
        Path path4 = this.f22049p;
        if (path4 != null) {
            float f10 = 2;
            path4.quadTo(this.f22047n, this.f22048o, (info.getX() + this.f22047n) / f10, (info.getY() + this.f22048o) / f10);
        }
        this.f22047n = info.getX();
        this.f22048o = info.getY();
        InterfaceC11552c interfaceC11552cM26643b = m26643b();
        if (interfaceC11552cM26643b != null) {
            Path path5 = this.f22049p;
            AbstractC9979u.m20291d(path5);
            Paint paint = this.f22046m;
            C11373a c11373aM26644c = m26644c();
            interfaceC11552cM26643b.mo25416B(path5, paint, c11373aM26644c != null ? c11373aM26644c.m25311b() : null);
        }
    }

    @Override // p437z9.AbstractC12029c
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public boolean mo18752y(EzyTouchEvent.TouchEvent info, long j10) {
        AbstractC9979u.m20294g(info, "info");
        return info.getEventTime() - m26639v() <= j10;
    }

    /* renamed from: D */
    public final void m18774D(EzySource.TouchSource.TouchInfo touchInfo, long j10) {
        AbstractC9979u.m20294g(touchInfo, "touchInfo");
        Paint paint = this.f22046m;
        EzyPaint.Paint paintM16265n = touchInfo.m16265n();
        AbstractC9979u.m20293f(paintM16265n, "touchInfo.paint");
        paint.set(AbstractC10350m.m21656d(paintM16265n));
        Path path = this.f22049p;
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
        this.f22049p = null;
    }
}
