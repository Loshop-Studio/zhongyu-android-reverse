package com.zykj.blackboard.core.action;

import android.graphics.Paint;
import android.graphics.Path;
import android.util.Log;
import androidx.lifecycle.CoroutineLiveDataKt;
import com.blankj.utilcode.util.LogUtils;
import com.zykj.blackboard.utils.EventKey;
import com.zykj.board.EzyGraphEnum;
import com.zykj.board.EzyTouchEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p006a5.InterfaceC0039c;
import p117g5.AbstractC8053a;
import p117g5.InterfaceC8055c;
import p263u5.C9690i;
import p282w4.InterfaceC9822b;

/* loaded from: classes4.dex */
public abstract class BaseWriteAction extends AbstractC6943b {

    /* renamed from: D */
    public static final C6935a f8200D = new C6935a(null);

    /* renamed from: E */
    public static final ExecutorService f8201E = Executors.newSingleThreadExecutor();

    /* renamed from: A */
    public boolean f8202A;

    /* renamed from: B */
    public boolean f8203B;

    /* renamed from: u */
    public float f8210u;

    /* renamed from: v */
    public float f8211v;

    /* renamed from: w */
    public InterfaceC8055c f8212w;

    /* renamed from: x */
    public InterfaceC8055c f8213x;

    /* renamed from: y */
    public long f8214y;

    /* renamed from: z */
    public boolean f8215z;

    /* renamed from: p */
    public final List f8205p = new ArrayList();

    /* renamed from: q */
    public Path f8206q = new Path();

    /* renamed from: r */
    public Paint f8207r = new Paint();

    /* renamed from: s */
    public float f8208s = 30.0f;

    /* renamed from: t */
    public float f8209t = 15.0f;

    /* renamed from: C */
    public final ExecutorService f8204C = f8201E;

    /* renamed from: com.zykj.blackboard.core.action.BaseWriteAction$a */
    public static final class C6935a {
        public /* synthetic */ C6935a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C6935a() {
        }
    }

    @Override // com.zykj.blackboard.core.action.AbstractC6943b
    /* renamed from: E */
    public void mo7097E(EzyTouchEvent.TouchEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (this.f8203B && this.f8215z) {
            InterfaceC8055c interfaceC8055c = this.f8212w;
            if (interfaceC8055c != null) {
                InterfaceC9822b interfaceC9822bM7084h = m7084h();
                if (interfaceC9822bM7084h != null) {
                    interfaceC9822bM7084h.mo16695n(CollectionsKt.mutableListOf(interfaceC8055c), System.currentTimeMillis());
                }
                InterfaceC0039c interfaceC0039cM7083g = m7083g();
                if (interfaceC0039cM7083g != null) {
                    interfaceC0039cM7083g.mo212o(CollectionsKt.mutableListOf(interfaceC8055c));
                }
            }
            this.f8212w = this.f8213x;
        }
        this.f8203B = false;
        InterfaceC0039c interfaceC0039cM7083g2 = m7083g();
        if (interfaceC0039cM7083g2 != null) {
            interfaceC0039cM7083g2.mo202e();
        }
    }

    @Override // com.zykj.blackboard.core.action.AbstractC6943b
    /* renamed from: F */
    public void mo7098F(final EzyTouchEvent.TouchEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        m7086j(event, new Function0<Unit>() { // from class: com.zykj.blackboard.core.action.BaseWriteAction$singleTouchDown$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                InterfaceC8055c interfaceC8055cMo210m;
                String id;
                InterfaceC8055c interfaceC8055cMo210m2;
                List listMo12796e;
                this.f8216a.f8203B = true;
                this.f8216a.mo7114d0();
                C9690i c9690i = C9690i.f17127a;
                c9690i.m16179b(EventKey.TEXT_ACTION_SELECTED_CANCEL);
                c9690i.m16179b(EventKey.SELECT_ACTION_SELECTED_CANCEL);
                this.f8216a.mo7111a0(event);
                boolean z9 = this.f8216a.m7115e0() || System.currentTimeMillis() - this.f8216a.f8214y > CoroutineLiveDataKt.DEFAULT_TIMEOUT;
                Log.i("BaseWriteAction", this.f8216a.hashCode() + "isNeedNewGroup--> " + z9);
                InterfaceC0039c interfaceC0039cM7083g = this.f8216a.m7083g();
                if (interfaceC0039cM7083g != null && (interfaceC8055cMo210m2 = interfaceC0039cM7083g.mo210m()) != null && (listMo12796e = interfaceC8055cMo210m2.mo12796e()) != null && !CollectionsKt.contains(listMo12796e, this.f8216a.f8212w)) {
                    this.f8216a.f8212w = null;
                    z9 = true;
                }
                if (!z9) {
                    this.f8216a.f8215z = false;
                    return;
                }
                this.f8216a.m7117g0(false);
                BaseWriteAction baseWriteAction = this.f8216a;
                baseWriteAction.f8213x = baseWriteAction.f8212w;
                InterfaceC0039c interfaceC0039cM7083g2 = this.f8216a.m7083g();
                if (interfaceC0039cM7083g2 == null || (interfaceC8055cMo210m = interfaceC0039cM7083g2.mo210m()) == null || (id = interfaceC8055cMo210m.getId()) == null) {
                    return;
                }
                BaseWriteAction baseWriteAction2 = this.f8216a;
                InterfaceC9822b interfaceC9822bM7084h = baseWriteAction2.m7084h();
                baseWriteAction2.f8212w = interfaceC9822bM7084h != null ? interfaceC9822bM7084h.mo16694m(id) : null;
                this.f8216a.f8215z = true;
            }
        });
    }

    @Override // com.zykj.blackboard.core.action.AbstractC6943b
    /* renamed from: G */
    public void mo7099G(final EzyTouchEvent.TouchEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        m7086j(event, new Function0<Unit>() { // from class: com.zykj.blackboard.core.action.BaseWriteAction$singleTouchMove$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.f8218a.mo7112b0(event);
            }
        });
    }

    @Override // com.zykj.blackboard.core.action.AbstractC6943b
    /* renamed from: H */
    public void mo7100H(EzyTouchEvent.TouchEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        m7086j(event, new BaseWriteAction$singleTouchUp$1(this, event));
    }

    /* renamed from: Q */
    public abstract AbstractC8053a mo7101Q(String str);

    /* renamed from: R */
    public final boolean m7102R() {
        ExecutorService executorService = this.f8204C;
        ThreadPoolExecutor threadPoolExecutor = executorService instanceof ThreadPoolExecutor ? (ThreadPoolExecutor) executorService : null;
        if (threadPoolExecutor != null) {
            return threadPoolExecutor.getCompletedTaskCount() == threadPoolExecutor.getTaskCount();
        }
        LogUtils.m2958w("页面BaseWriteAction.kt -> ExecutorCheck没有完成");
        return true;
    }

    /* renamed from: S */
    public final List m7103S() {
        return this.f8205p;
    }

    /* renamed from: T */
    public abstract EzyGraphEnum.GraphEnum mo7104T();

    /* renamed from: U */
    public final float m7105U() {
        return this.f8210u;
    }

    /* renamed from: V */
    public final float m7106V() {
        return this.f8211v;
    }

    /* renamed from: W */
    public final Paint m7107W() {
        return this.f8207r;
    }

    /* renamed from: X */
    public final float m7108X() {
        return this.f8208s;
    }

    /* renamed from: Y */
    public final float m7109Y() {
        return this.f8209t;
    }

    /* renamed from: Z */
    public final Path m7110Z() {
        return this.f8206q;
    }

    /* renamed from: a0 */
    public abstract void mo7111a0(EzyTouchEvent.TouchEvent touchEvent);

    /* renamed from: b0 */
    public abstract void mo7112b0(EzyTouchEvent.TouchEvent touchEvent);

    /* renamed from: c0 */
    public abstract void mo7113c0(EzyTouchEvent.TouchEvent touchEvent);

    /* renamed from: d0 */
    public abstract void mo7114d0();

    /* renamed from: e0 */
    public final boolean m7115e0() {
        return this.f8202A;
    }

    /* renamed from: f0 */
    public void m7116f0() {
        this.f8205p.clear();
        this.f8206q.reset();
        this.f8210u = 0.0f;
        this.f8211v = 0.0f;
    }

    /* renamed from: g0 */
    public final void m7117g0(boolean z9) {
        this.f8202A = z9;
    }

    /* renamed from: h0 */
    public final void m7118h0(float f10) {
        this.f8210u = f10;
    }

    /* renamed from: i0 */
    public final void m7119i0(float f10) {
        this.f8211v = f10;
    }

    /* renamed from: j0 */
    public final void m7120j0(float f10) {
        this.f8208s = f10;
    }

    /* renamed from: k0 */
    public final void m7121k0(float f10) {
        this.f8209t = f10;
    }
}
