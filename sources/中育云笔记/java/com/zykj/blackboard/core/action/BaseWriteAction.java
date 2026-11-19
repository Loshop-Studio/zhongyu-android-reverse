package com.zykj.blackboard.core.action;

import android.graphics.Paint;
import android.graphics.Path;
import android.util.Log;
import androidx.lifecycle.CoroutineLiveDataKt;
import ba.AbstractC5179a;
import ba.InterfaceC5181c;
import com.zykj.blackboard.utils.EventKey;
import com.zykj.board.EzyGraphEnum;
import com.zykj.board.EzyTouchEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import na.C10346i;
import p181hd.InterfaceC9529a;
import p309qc.C10786q;
import p322r9.InterfaceC10918b;
import p325rc.AbstractC10947g0;
import p325rc.AbstractC10978w;
import p377v9.InterfaceC11552c;

/* loaded from: classes5.dex */
public abstract class BaseWriteAction extends AbstractC8326b {

    /* renamed from: D */
    public static final C8318a f17766D = new C8318a(null);

    /* renamed from: E */
    public static final ExecutorService f17767E = Executors.newSingleThreadExecutor();

    /* renamed from: A */
    public boolean f17768A;

    /* renamed from: B */
    public boolean f17769B;

    /* renamed from: u */
    public float f17776u;

    /* renamed from: v */
    public float f17777v;

    /* renamed from: w */
    public InterfaceC5181c f17778w;

    /* renamed from: x */
    public InterfaceC5181c f17779x;

    /* renamed from: y */
    public long f17780y;

    /* renamed from: z */
    public boolean f17781z;

    /* renamed from: p */
    public final List f17771p = new ArrayList();

    /* renamed from: q */
    public Path f17772q = new Path();

    /* renamed from: r */
    public Paint f17773r = new Paint();

    /* renamed from: s */
    public float f17774s = 30.0f;

    /* renamed from: t */
    public float f17775t = 15.0f;

    /* renamed from: C */
    public final ExecutorService f17770C = f17767E;

    /* renamed from: com.zykj.blackboard.core.action.BaseWriteAction$a */
    public static final class C8318a {
        public /* synthetic */ C8318a(AbstractC9972n abstractC9972n) {
            this();
        }

        public C8318a() {
        }
    }

    @Override // com.zykj.blackboard.core.action.AbstractC8326b
    /* renamed from: E */
    public void mo13739E(EzyTouchEvent.TouchEvent event) {
        AbstractC9979u.m20294g(event, "event");
        if (this.f17769B && this.f17781z) {
            InterfaceC5181c interfaceC5181c = this.f17778w;
            if (interfaceC5181c != null) {
                InterfaceC10918b interfaceC10918bM13726h = m13726h();
                if (interfaceC10918bM13726h != null) {
                    interfaceC10918bM13726h.mo23775o(AbstractC10978w.m24141s(interfaceC5181c), System.currentTimeMillis());
                }
                InterfaceC11552c interfaceC11552cM13725g = m13725g();
                if (interfaceC11552cM13725g != null) {
                    interfaceC11552cM13725g.mo25456p(AbstractC10978w.m24141s(interfaceC5181c));
                }
            }
            this.f17778w = this.f17779x;
        }
        this.f17769B = false;
        InterfaceC11552c interfaceC11552cM13725g2 = m13725g();
        if (interfaceC11552cM13725g2 != null) {
            interfaceC11552cM13725g2.mo25447g();
        }
    }

    @Override // com.zykj.blackboard.core.action.AbstractC8326b
    /* renamed from: F */
    public void mo13740F(final EzyTouchEvent.TouchEvent event) {
        AbstractC9979u.m20294g(event, "event");
        m13728j(event, new InterfaceC9529a() { // from class: com.zykj.blackboard.core.action.BaseWriteAction$singleTouchDown$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            public /* bridge */ /* synthetic */ Object invoke() {
                m33987invoke();
                return C10786q.f26013a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m33987invoke() {
                InterfaceC5181c interfaceC5181cMo25454n;
                List listMo2717f;
                this.f17782c.f17769B = true;
                this.f17782c.mo13756d0();
                C10346i c10346i = C10346i.f24652a;
                c10346i.m21640b(EventKey.TEXT_ACTION_SELECTED_CANCEL);
                c10346i.m21640b(EventKey.SELECT_ACTION_SELECTED_CANCEL);
                this.f17782c.mo13753a0(event);
                boolean z10 = this.f17782c.m13757e0() || System.currentTimeMillis() - this.f17782c.f17780y > CoroutineLiveDataKt.DEFAULT_TIMEOUT;
                Log.i("BaseWriteAction", this.f17782c.hashCode() + "isNeedNewGroup--> " + z10);
                InterfaceC11552c interfaceC11552cM13725g = this.f17782c.m13725g();
                if (interfaceC11552cM13725g != null && (interfaceC5181cMo25454n = interfaceC11552cM13725g.mo25454n()) != null && (listMo2717f = interfaceC5181cMo25454n.mo2717f()) != null && !AbstractC10947g0.m23932e0(listMo2717f, this.f17782c.f17778w)) {
                    this.f17782c.f17778w = null;
                    z10 = true;
                }
                if (!z10) {
                    this.f17782c.f17781z = false;
                    return;
                }
                this.f17782c.m13759g0(false);
                BaseWriteAction baseWriteAction = this.f17782c;
                baseWriteAction.f17779x = baseWriteAction.f17778w;
                BaseWriteAction baseWriteAction2 = this.f17782c;
                InterfaceC10918b interfaceC10918bM13726h = baseWriteAction2.m13726h();
                if (interfaceC10918bM13726h != null) {
                    InterfaceC11552c interfaceC11552cM13725g2 = this.f17782c.m13725g();
                    interfaceC5181cMo25454n = interfaceC11552cM13725g2 != null ? interfaceC11552cM13725g2.mo25454n() : null;
                    AbstractC9979u.m20291d(interfaceC5181cMo25454n);
                    interfaceC5181cMo25454n = interfaceC10918bM13726h.mo23774n(interfaceC5181cMo25454n.getId());
                }
                baseWriteAction2.f17778w = interfaceC5181cMo25454n;
                this.f17782c.f17781z = true;
            }
        });
    }

    @Override // com.zykj.blackboard.core.action.AbstractC8326b
    /* renamed from: G */
    public void mo13741G(final EzyTouchEvent.TouchEvent event) {
        AbstractC9979u.m20294g(event, "event");
        m13728j(event, new InterfaceC9529a() { // from class: com.zykj.blackboard.core.action.BaseWriteAction$singleTouchMove$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            public /* bridge */ /* synthetic */ Object invoke() {
                m33988invoke();
                return C10786q.f26013a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m33988invoke() {
                this.f17784c.mo13754b0(event);
            }
        });
    }

    @Override // com.zykj.blackboard.core.action.AbstractC8326b
    /* renamed from: H */
    public void mo13742H(EzyTouchEvent.TouchEvent event) {
        AbstractC9979u.m20294g(event, "event");
        m13728j(event, new BaseWriteAction$singleTouchUp$1(this, event));
    }

    /* renamed from: Q */
    public abstract AbstractC5179a mo13743Q(String str);

    /* renamed from: R */
    public final boolean m13744R() {
        ExecutorService executorService = this.f17770C;
        ThreadPoolExecutor threadPoolExecutor = executorService instanceof ThreadPoolExecutor ? (ThreadPoolExecutor) executorService : null;
        return threadPoolExecutor == null || threadPoolExecutor.getCompletedTaskCount() == threadPoolExecutor.getTaskCount();
    }

    /* renamed from: S */
    public final List m13745S() {
        return this.f17771p;
    }

    /* renamed from: T */
    public abstract EzyGraphEnum.GraphEnum mo13746T();

    /* renamed from: U */
    public final float m13747U() {
        return this.f17776u;
    }

    /* renamed from: V */
    public final float m13748V() {
        return this.f17777v;
    }

    /* renamed from: W */
    public final Paint m13749W() {
        return this.f17773r;
    }

    /* renamed from: X */
    public final float m13750X() {
        return this.f17774s;
    }

    /* renamed from: Y */
    public final float m13751Y() {
        return this.f17775t;
    }

    /* renamed from: Z */
    public final Path m13752Z() {
        return this.f17772q;
    }

    /* renamed from: a0 */
    public abstract void mo13753a0(EzyTouchEvent.TouchEvent touchEvent);

    /* renamed from: b0 */
    public abstract void mo13754b0(EzyTouchEvent.TouchEvent touchEvent);

    /* renamed from: c0 */
    public abstract void mo13755c0(EzyTouchEvent.TouchEvent touchEvent);

    /* renamed from: d0 */
    public abstract void mo13756d0();

    /* renamed from: e0 */
    public final boolean m13757e0() {
        return this.f17768A;
    }

    /* renamed from: f0 */
    public void m13758f0() {
        this.f17771p.clear();
        this.f17772q.reset();
        this.f17776u = 0.0f;
        this.f17777v = 0.0f;
    }

    /* renamed from: g0 */
    public final void m13759g0(boolean z10) {
        this.f17768A = z10;
    }

    /* renamed from: h0 */
    public final void m13760h0(float f10) {
        this.f17776u = f10;
    }

    /* renamed from: i0 */
    public final void m13761i0(float f10) {
        this.f17777v = f10;
    }

    /* renamed from: j0 */
    public final void m13762j0(float f10) {
        this.f17774s = f10;
    }

    /* renamed from: k0 */
    public final void m13763k0(float f10) {
        this.f17775t = f10;
    }
}
