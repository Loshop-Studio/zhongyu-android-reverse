package com.zykj.blackboard.core.action;

import android.graphics.Paint;
import android.graphics.Path;
import android.util.Log;
import androidx.lifecycle.CoroutineLiveDataKt;
import com.zykj.blackboard.utils.EventKey;
import com.zykj.board.EzyGraphEnum;
import com.zykj.board.EzyTouchEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p077e5.C7347h;
import p098g4.InterfaceC7522b;
import p142k4.InterfaceC7880c;
import p210q4.AbstractC8886a;
import p210q4.InterfaceC8888c;

/* loaded from: classes4.dex */
public abstract class BaseWriteAction extends AbstractC6626b {

    /* renamed from: D */
    public static final C6618a f6917D = new C6618a(null);

    /* renamed from: E */
    public static final ExecutorService f6918E = Executors.newSingleThreadExecutor();

    /* renamed from: A */
    public boolean f6919A;

    /* renamed from: B */
    public boolean f6920B;

    /* renamed from: u */
    public float f6927u;

    /* renamed from: v */
    public float f6928v;

    /* renamed from: w */
    public InterfaceC8888c f6929w;

    /* renamed from: x */
    public InterfaceC8888c f6930x;

    /* renamed from: y */
    public long f6931y;

    /* renamed from: z */
    public boolean f6932z;

    /* renamed from: p */
    public final List f6922p = new ArrayList();

    /* renamed from: q */
    public Path f6923q = new Path();

    /* renamed from: r */
    public Paint f6924r = new Paint();

    /* renamed from: s */
    public float f6925s = 30.0f;

    /* renamed from: t */
    public float f6926t = 15.0f;

    /* renamed from: C */
    public final ExecutorService f6921C = f6918E;

    /* renamed from: com.zykj.blackboard.core.action.BaseWriteAction$a */
    public static final class C6618a {
        public /* synthetic */ C6618a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C6618a() {
        }
    }

    @Override // com.zykj.blackboard.core.action.AbstractC6626b
    /* renamed from: E */
    public void mo6002E(EzyTouchEvent.TouchEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (this.f6920B && this.f6932z) {
            InterfaceC8888c interfaceC8888c = this.f6929w;
            if (interfaceC8888c != null) {
                InterfaceC7522b interfaceC7522bM5989h = m5989h();
                if (interfaceC7522bM5989h != null) {
                    interfaceC7522bM5989h.mo12249n(CollectionsKt.mutableListOf(interfaceC8888c), System.currentTimeMillis());
                }
                InterfaceC7880c interfaceC7880cM5988g = m5988g();
                if (interfaceC7880cM5988g != null) {
                    interfaceC7880cM5988g.mo13452q(CollectionsKt.mutableListOf(interfaceC8888c));
                }
            }
            this.f6929w = this.f6930x;
        }
        this.f6920B = false;
        InterfaceC7880c interfaceC7880cM5988g2 = m5988g();
        if (interfaceC7880cM5988g2 != null) {
            interfaceC7880cM5988g2.mo13440e();
        }
    }

    @Override // com.zykj.blackboard.core.action.AbstractC6626b
    /* renamed from: F */
    public void mo6003F(final EzyTouchEvent.TouchEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        m5991j(event, new Function0<Unit>() { // from class: com.zykj.blackboard.core.action.BaseWriteAction$singleTouchDown$1
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
                InterfaceC8888c interfaceC8888cMo13449n;
                String id;
                InterfaceC8888c interfaceC8888cMo13449n2;
                List listMo14995f;
                this.f6933a.f6920B = true;
                this.f6933a.mo6018c0();
                C7347h c7347h = C7347h.f11914a;
                c7347h.m11758b(EventKey.TEXT_ACTION_SELECTED_CANCEL);
                c7347h.m11758b(EventKey.SELECT_ACTION_SELECTED_CANCEL);
                this.f6933a.mo6015Z(event);
                boolean z9 = this.f6933a.m6019d0() || System.currentTimeMillis() - this.f6933a.f6931y > CoroutineLiveDataKt.DEFAULT_TIMEOUT;
                Log.i("BaseWriteAction", this.f6933a.hashCode() + "isNeedNewGroup--> " + z9);
                InterfaceC7880c interfaceC7880cM5988g = this.f6933a.m5988g();
                if (interfaceC7880cM5988g != null && (interfaceC8888cMo13449n2 = interfaceC7880cM5988g.mo13449n()) != null && (listMo14995f = interfaceC8888cMo13449n2.mo14995f()) != null && !CollectionsKt.contains(listMo14995f, this.f6933a.f6929w)) {
                    this.f6933a.f6929w = null;
                    z9 = true;
                }
                if (!z9) {
                    this.f6933a.f6932z = false;
                    return;
                }
                this.f6933a.m6021f0(false);
                BaseWriteAction baseWriteAction = this.f6933a;
                baseWriteAction.f6930x = baseWriteAction.f6929w;
                InterfaceC7880c interfaceC7880cM5988g2 = this.f6933a.m5988g();
                if (interfaceC7880cM5988g2 == null || (interfaceC8888cMo13449n = interfaceC7880cM5988g2.mo13449n()) == null || (id = interfaceC8888cMo13449n.getId()) == null) {
                    return;
                }
                BaseWriteAction baseWriteAction2 = this.f6933a;
                InterfaceC7522b interfaceC7522bM5989h = baseWriteAction2.m5989h();
                baseWriteAction2.f6929w = interfaceC7522bM5989h != null ? interfaceC7522bM5989h.mo12248m(id) : null;
                this.f6933a.f6932z = true;
            }
        });
    }

    @Override // com.zykj.blackboard.core.action.AbstractC6626b
    /* renamed from: G */
    public void mo6004G(final EzyTouchEvent.TouchEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        m5991j(event, new Function0<Unit>() { // from class: com.zykj.blackboard.core.action.BaseWriteAction$singleTouchMove$1
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
                this.f6935a.mo6016a0(event);
            }
        });
    }

    @Override // com.zykj.blackboard.core.action.AbstractC6626b
    /* renamed from: H */
    public void mo6005H(EzyTouchEvent.TouchEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        m5991j(event, new BaseWriteAction$singleTouchUp$1(this, event));
    }

    /* renamed from: Q */
    public abstract AbstractC8886a mo6006Q(String str);

    /* renamed from: R */
    public final List m6007R() {
        return this.f6922p;
    }

    /* renamed from: S */
    public abstract EzyGraphEnum.GraphEnum mo6008S();

    /* renamed from: T */
    public final float m6009T() {
        return this.f6927u;
    }

    /* renamed from: U */
    public final float m6010U() {
        return this.f6928v;
    }

    /* renamed from: V */
    public final Paint m6011V() {
        return this.f6924r;
    }

    /* renamed from: W */
    public final float m6012W() {
        return this.f6925s;
    }

    /* renamed from: X */
    public final float m6013X() {
        return this.f6926t;
    }

    /* renamed from: Y */
    public final Path m6014Y() {
        return this.f6923q;
    }

    /* renamed from: Z */
    public abstract void mo6015Z(EzyTouchEvent.TouchEvent touchEvent);

    /* renamed from: a0 */
    public abstract void mo6016a0(EzyTouchEvent.TouchEvent touchEvent);

    /* renamed from: b0 */
    public abstract void mo6017b0(EzyTouchEvent.TouchEvent touchEvent);

    /* renamed from: c0 */
    public abstract void mo6018c0();

    /* renamed from: d0 */
    public final boolean m6019d0() {
        return this.f6919A;
    }

    /* renamed from: e0 */
    public void m6020e0() {
        this.f6922p.clear();
        this.f6923q.reset();
        this.f6927u = 0.0f;
        this.f6928v = 0.0f;
    }

    /* renamed from: f0 */
    public final void m6021f0(boolean z9) {
        this.f6919A = z9;
    }

    /* renamed from: g0 */
    public final void m6022g0(float f10) {
        this.f6927u = f10;
    }

    /* renamed from: h0 */
    public final void m6023h0(float f10) {
        this.f6928v = f10;
    }

    /* renamed from: i0 */
    public final void m6024i0(float f10) {
        this.f6925s = f10;
    }

    /* renamed from: j0 */
    public final void m6025j0(float f10) {
        this.f6926t = f10;
    }
}
