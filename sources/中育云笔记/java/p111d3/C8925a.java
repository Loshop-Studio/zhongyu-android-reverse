package p111d3;

import com.friday.common.entity.EventBusKey;
import com.friday.lecture.floatwindow.FloatWindowStatus;
import com.friday.lecture.floatwindow.canvas.C6144a;
import com.friday.lecture.floatwindow.homework.C6148b;
import com.friday.lecture.floatwindow.options.C6149a;
import com.jeremyliao.liveeventbus.LiveEventBus;
import p171h3.C9467k;
import p187i3.C9586i0;
import p187i3.C9594q;

/* renamed from: d3.a */
/* loaded from: classes4.dex */
public final class C8925a {

    /* renamed from: a */
    public static final C8925a f20887a = new C8925a();

    /* renamed from: b */
    public static FloatWindowStatus f20888b = FloatWindowStatus.f8677c;

    /* renamed from: c */
    public static FloatWindowStatus f20889c = FloatWindowStatus.f8678d;

    /* renamed from: d */
    public static final int f20890d = 8;

    /* renamed from: d3.a$a */
    public static final /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f20891a;

        static {
            int[] iArr = new int[FloatWindowStatus.values().length];
            try {
                iArr[FloatWindowStatus.f8679e.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FloatWindowStatus.f8680f.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FloatWindowStatus.f8678d.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f20891a = iArr;
        }
    }

    /* renamed from: a */
    public final void m17517a() {
        m17518b();
        m17525i();
    }

    /* renamed from: b */
    public final void m17518b() {
        C6149a.f8778g.m6662a().m6654j();
        C6148b.f8768d.m6626a().m6623g();
        C9586i0.f22097d.m18816a().m18813e();
        C9594q.f22108d.m18824a().m18821e();
        C6144a.f8725d.m6571a().m6569h();
        C9467k.f21876d.m18649a().m18646d();
    }

    /* renamed from: c */
    public final void m17519c() {
        m17518b();
        C6148b.f8768d.m6626a().m6624h();
        m17521e(FloatWindowStatus.f8678d);
        C9586i0.f22097d.m18816a().m18814f();
        C9594q.f22108d.m18824a().m18822f();
        C9467k.f21876d.m18649a().m18647e();
    }

    /* renamed from: d */
    public final void m17520d() {
        m17518b();
        C6148b.f8768d.m6626a().m6624h();
        m17521e(FloatWindowStatus.f8678d);
        C9586i0.f22097d.m18816a().m18814f();
        C9594q.f22108d.m18824a().m18822f();
    }

    /* renamed from: e */
    public final void m17521e(FloatWindowStatus floatWindowStatus) {
        f20889c = floatWindowStatus;
        LiveEventBus.get(EventBusKey.KEY_CURRENT_CLASS_STATE, FloatWindowStatus.class).post(floatWindowStatus);
    }

    /* renamed from: f */
    public final void m17522f() {
        int i10 = a.f20891a[f20889c.ordinal()];
        if (i10 == 1) {
            m17528l();
            return;
        }
        if (i10 == 2) {
            m17524h();
        } else if (i10 != 3) {
            m17523g();
        } else {
            m17523g();
        }
    }

    /* renamed from: g */
    public final void m17523g() {
        m17518b();
        C6148b.f8768d.m6626a().m6625i();
        FloatWindowStatus floatWindowStatus = FloatWindowStatus.f8678d;
        f20888b = floatWindowStatus;
        m17521e(floatWindowStatus);
    }

    /* renamed from: h */
    public final void m17524h() {
        m17518b();
        C9594q.f22108d.m18824a().m18823g();
        FloatWindowStatus floatWindowStatus = FloatWindowStatus.f8680f;
        f20888b = floatWindowStatus;
        m17521e(floatWindowStatus);
    }

    /* renamed from: i */
    public final void m17525i() {
        m17518b();
        C6149a.m6651q(C6149a.f8778g.m6662a(), false, 1, null);
        f20888b = FloatWindowStatus.f8677c;
    }

    /* renamed from: j */
    public final void m17526j() {
        m17518b();
        C6144a.f8725d.m6571a().m6570i();
    }

    /* renamed from: k */
    public final void m17527k() {
        m17518b();
        C9467k.f21876d.m18649a().m18648f();
        f20888b = FloatWindowStatus.f8681g;
    }

    /* renamed from: l */
    public final void m17528l() {
        m17518b();
        C9586i0.f22097d.m18816a().m18815g();
        FloatWindowStatus floatWindowStatus = FloatWindowStatus.f8679e;
        f20888b = floatWindowStatus;
        m17521e(floatWindowStatus);
    }
}
