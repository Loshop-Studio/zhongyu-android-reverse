package p224kb;

import com.zykj.blackboard.core.data.dao.CommandInfoEntity;
import kotlin.jvm.internal.AbstractC9979u;
import ma.InterfaceC10214b;
import ma.InterfaceC10216d;
import ma.InterfaceC10217e;
import ma.InterfaceC10219g;
import ma.InterfaceC10221i;
import ma.InterfaceC10223k;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p422y9.InterfaceC11935n;

/* renamed from: kb.x1 */
/* loaded from: classes6.dex */
public abstract class AbstractC9902x1 {

    /* renamed from: kb.x1$a */
    public static final class a implements InterfaceC10223k {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC9544p f23211a;

        public a(InterfaceC9544p interfaceC9544p) {
            this.f23211a = interfaceC9544p;
        }

        @Override // ma.InterfaceC10223k
        /* renamed from: a */
        public void mo17149a(boolean z10, boolean z11) {
            this.f23211a.invoke(Boolean.valueOf(z10), Boolean.valueOf(z11));
        }
    }

    /* renamed from: kb.x1$b */
    public static final class b implements InterfaceC10214b {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC9540l f23212a;

        /* renamed from: b */
        public final /* synthetic */ InterfaceC11935n f23213b;

        public b(InterfaceC9540l interfaceC9540l, InterfaceC11935n interfaceC11935n) {
            this.f23212a = interfaceC9540l;
            this.f23213b = interfaceC11935n;
        }

        @Override // ma.InterfaceC10214b
        /* renamed from: a */
        public void mo14413a(CommandInfoEntity entity) {
            AbstractC9979u.m20294g(entity, "entity");
            this.f23212a.invoke(entity);
            this.f23213b.mo14451B(this);
        }
    }

    /* renamed from: kb.x1$c */
    public static final class c implements InterfaceC10216d {

        /* renamed from: a */
        public float f23214a;

        /* renamed from: b */
        public float f23215b;

        /* renamed from: c */
        public final /* synthetic */ InterfaceC9544p f23216c;

        /* renamed from: d */
        public final /* synthetic */ InterfaceC9529a f23217d;

        /* renamed from: e */
        public final /* synthetic */ InterfaceC9529a f23218e;

        public c(InterfaceC9544p interfaceC9544p, InterfaceC9529a interfaceC9529a, InterfaceC9529a interfaceC9529a2) {
            this.f23216c = interfaceC9544p;
            this.f23217d = interfaceC9529a;
            this.f23218e = interfaceC9529a2;
        }

        @Override // ma.InterfaceC10216d
        /* renamed from: a */
        public void mo17143a(float f10) {
            this.f23215b = f10;
            this.f23216c.invoke(Float.valueOf(this.f23214a), Float.valueOf(this.f23215b));
        }

        @Override // ma.InterfaceC10216d
        /* renamed from: b */
        public void mo17144b(float f10) {
            this.f23214a = f10;
            this.f23216c.invoke(Float.valueOf(f10), Float.valueOf(this.f23215b));
        }

        @Override // ma.InterfaceC10216d
        /* renamed from: c */
        public void mo17145c() {
            this.f23218e.invoke();
        }

        @Override // ma.InterfaceC10216d
        /* renamed from: d */
        public void mo17146d() {
            this.f23217d.invoke();
        }
    }

    /* renamed from: kb.x1$d */
    public static final class d implements InterfaceC10219g {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC9540l f23219a;

        public d(InterfaceC9540l interfaceC9540l) {
            this.f23219a = interfaceC9540l;
        }

        @Override // ma.InterfaceC10219g
        /* renamed from: a */
        public void mo19971a() {
            this.f23219a.invoke(Boolean.TRUE);
        }

        @Override // ma.InterfaceC10219g
        /* renamed from: b */
        public void mo19972b() {
            this.f23219a.invoke(Boolean.FALSE);
        }
    }

    /* renamed from: kb.x1$e */
    public static final class e implements InterfaceC10221i {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC9540l f23220a;

        /* renamed from: b */
        public final /* synthetic */ InterfaceC9529a f23221b;

        /* renamed from: c */
        public final /* synthetic */ InterfaceC9529a f23222c;

        public e(InterfaceC9540l interfaceC9540l, InterfaceC9529a interfaceC9529a, InterfaceC9529a interfaceC9529a2) {
            this.f23220a = interfaceC9540l;
            this.f23221b = interfaceC9529a;
            this.f23222c = interfaceC9529a2;
        }

        @Override // ma.InterfaceC10221i
        public void progress(long j10) {
            this.f23220a.invoke(Long.valueOf(j10));
        }

        @Override // ma.InterfaceC10221i
        public void startRecord() {
            this.f23221b.invoke();
        }

        @Override // ma.InterfaceC10221i
        public void stopRecord() {
            this.f23222c.invoke();
        }
    }

    /* renamed from: a */
    public static final void m19965a(InterfaceC11935n interfaceC11935n, InterfaceC9544p onChange) {
        AbstractC9979u.m20294g(interfaceC11935n, "<this>");
        AbstractC9979u.m20294g(onChange, "onChange");
        interfaceC11935n.mo14481x(new a(onChange));
    }

    /* renamed from: b */
    public static final void m19966b(InterfaceC11935n interfaceC11935n, InterfaceC9540l onEvent) {
        AbstractC9979u.m20294g(interfaceC11935n, "<this>");
        AbstractC9979u.m20294g(onEvent, "onEvent");
        interfaceC11935n.mo14453D(new b(onEvent, interfaceC11935n));
    }

    /* renamed from: c */
    public static final void m19967c(InterfaceC11935n interfaceC11935n, InterfaceC9529a onMoveStart, InterfaceC9544p onMoving, InterfaceC9529a onMoveEnd) {
        AbstractC9979u.m20294g(interfaceC11935n, "<this>");
        AbstractC9979u.m20294g(onMoveStart, "onMoveStart");
        AbstractC9979u.m20294g(onMoving, "onMoving");
        AbstractC9979u.m20294g(onMoveEnd, "onMoveEnd");
        interfaceC11935n.setAreaMoveListener(new c(onMoving, onMoveStart, onMoveEnd));
    }

    /* renamed from: d */
    public static final void m19968d(InterfaceC11935n interfaceC11935n, InterfaceC9540l onMicroPhoneChange) {
        AbstractC9979u.m20294g(interfaceC11935n, "<this>");
        AbstractC9979u.m20294g(onMicroPhoneChange, "onMicroPhoneChange");
        interfaceC11935n.mo14462h(new d(onMicroPhoneChange));
    }

    /* renamed from: e */
    public static final void m19969e(InterfaceC11935n interfaceC11935n, InterfaceC9529a onStart, InterfaceC9540l onProgress, InterfaceC9529a onStop) {
        AbstractC9979u.m20294g(interfaceC11935n, "<this>");
        AbstractC9979u.m20294g(onStart, "onStart");
        AbstractC9979u.m20294g(onProgress, "onProgress");
        AbstractC9979u.m20294g(onStop, "onStop");
        interfaceC11935n.mo14466k(new e(onProgress, onStart, onStop));
    }

    /* renamed from: f */
    public static final void m19970f(InterfaceC11935n interfaceC11935n, InterfaceC9540l onTextColorChange, InterfaceC9540l onTextSizeChange) {
        AbstractC9979u.m20294g(interfaceC11935n, "<this>");
        AbstractC9979u.m20294g(onTextColorChange, "onTextColorChange");
        AbstractC9979u.m20294g(onTextSizeChange, "onTextSizeChange");
        interfaceC11935n.mo14452C(new f(onTextColorChange, onTextSizeChange));
    }

    /* renamed from: kb.x1$f */
    public static final class f implements InterfaceC10217e {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC9540l f23223a;

        /* renamed from: b */
        public final /* synthetic */ InterfaceC9540l f23224b;

        public f(InterfaceC9540l interfaceC9540l, InterfaceC9540l interfaceC9540l2) {
            this.f23223a = interfaceC9540l;
            this.f23224b = interfaceC9540l2;
        }

        @Override // ma.InterfaceC10217e
        /* renamed from: a */
        public void mo19973a(float f10) {
            this.f23224b.invoke(Float.valueOf(f10));
        }

        @Override // ma.InterfaceC10217e
        /* renamed from: d */
        public void mo19976d(int i10) {
            this.f23223a.invoke(Integer.valueOf(i10));
        }

        @Override // ma.InterfaceC10217e
        /* renamed from: b */
        public void mo19974b() {
        }

        @Override // ma.InterfaceC10217e
        /* renamed from: c */
        public void mo19975c(int i10, float f10) {
        }
    }
}
