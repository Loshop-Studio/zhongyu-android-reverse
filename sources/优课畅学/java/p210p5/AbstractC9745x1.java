package p210p5;

import com.zykj.blackboard.core.data.dao.CommandInfoEntity;
import com.zykj.blackboard.core.edit.IPageControl;
import com.zykj.blackboard.listener.EventListener;
import com.zykj.blackboard.listener.IAreaMoveListener;
import com.zykj.blackboard.listener.ITextSelectListener;
import com.zykj.blackboard.listener.MicroPhoneListener;
import com.zykj.blackboard.listener.RecordListener;
import com.zykj.blackboard.listener.WithdrawListener;
import kotlin.jvm.internal.AbstractC9133u;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10574p;

/* renamed from: p5.x1 */
/* loaded from: classes5.dex */
public abstract class AbstractC9745x1 {

    /* renamed from: p5.x1$a */
    public static final class a implements WithdrawListener {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC10574p f19450a;

        public a(InterfaceC10574p interfaceC10574p) {
            this.f19450a = interfaceC10574p;
        }

        @Override // com.zykj.blackboard.listener.WithdrawListener
        public void onWithdraw(boolean z10, boolean z11) {
            this.f19450a.invoke(Boolean.valueOf(z10), Boolean.valueOf(z11));
        }
    }

    /* renamed from: p5.x1$b */
    public static final class b implements EventListener {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC10570l f19451a;

        /* renamed from: b */
        public final /* synthetic */ IPageControl f19452b;

        public b(InterfaceC10570l interfaceC10570l, IPageControl iPageControl) {
            this.f19451a = interfaceC10570l;
            this.f19452b = iPageControl;
        }

        @Override // com.zykj.blackboard.listener.EventListener
        public void onEvent(CommandInfoEntity entity) {
            AbstractC9133u.m16133g(entity, "entity");
            this.f19451a.invoke(entity);
            this.f19452b.removeEventListener(this);
        }
    }

    /* renamed from: p5.x1$c */
    public static final class c implements IAreaMoveListener {

        /* renamed from: a */
        public float f19453a;

        /* renamed from: b */
        public float f19454b;

        /* renamed from: c */
        public final /* synthetic */ InterfaceC10574p f19455c;

        /* renamed from: d */
        public final /* synthetic */ InterfaceC10559a f19456d;

        /* renamed from: e */
        public final /* synthetic */ InterfaceC10559a f19457e;

        public c(InterfaceC10574p interfaceC10574p, InterfaceC10559a interfaceC10559a, InterfaceC10559a interfaceC10559a2) {
            this.f19455c = interfaceC10574p;
            this.f19456d = interfaceC10559a;
            this.f19457e = interfaceC10559a2;
        }

        @Override // com.zykj.blackboard.listener.IAreaMoveListener
        public void onHorizontalMove(float f10) {
            this.f19454b = f10;
            this.f19455c.invoke(Float.valueOf(this.f19453a), Float.valueOf(this.f19454b));
        }

        @Override // com.zykj.blackboard.listener.IAreaMoveListener
        public void onMoveEnd() {
            this.f19457e.invoke();
        }

        @Override // com.zykj.blackboard.listener.IAreaMoveListener
        public void onMoveStart() {
            this.f19456d.invoke();
        }

        @Override // com.zykj.blackboard.listener.IAreaMoveListener
        public void onVerticalMove(float f10) {
            this.f19453a = f10;
            this.f19455c.invoke(Float.valueOf(f10), Float.valueOf(this.f19454b));
        }
    }

    /* renamed from: p5.x1$d */
    public static final class d implements MicroPhoneListener {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC10570l f19458a;

        public d(InterfaceC10570l interfaceC10570l) {
            this.f19458a = interfaceC10570l;
        }

        @Override // com.zykj.blackboard.listener.MicroPhoneListener
        public void turnOffMicroPhone() {
            this.f19458a.invoke(Boolean.FALSE);
        }

        @Override // com.zykj.blackboard.listener.MicroPhoneListener
        public void turnOnMicroPhone() {
            this.f19458a.invoke(Boolean.TRUE);
        }
    }

    /* renamed from: p5.x1$e */
    public static final class e implements RecordListener {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC10570l f19459a;

        /* renamed from: b */
        public final /* synthetic */ InterfaceC10559a f19460b;

        /* renamed from: c */
        public final /* synthetic */ InterfaceC10559a f19461c;

        public e(InterfaceC10570l interfaceC10570l, InterfaceC10559a interfaceC10559a, InterfaceC10559a interfaceC10559a2) {
            this.f19459a = interfaceC10570l;
            this.f19460b = interfaceC10559a;
            this.f19461c = interfaceC10559a2;
        }

        @Override // com.zykj.blackboard.listener.RecordListener
        public void progress(long j10) {
            this.f19459a.invoke(Long.valueOf(j10));
        }

        @Override // com.zykj.blackboard.listener.RecordListener
        public void startRecord() {
            this.f19460b.invoke();
        }

        @Override // com.zykj.blackboard.listener.RecordListener
        public void stopRecord() {
            this.f19461c.invoke();
        }
    }

    /* renamed from: a */
    public static final void m18268a(IPageControl iPageControl, InterfaceC10574p onChange) {
        AbstractC9133u.m16133g(iPageControl, "<this>");
        AbstractC9133u.m16133g(onChange, "onChange");
        iPageControl.addWithdrawListener(new a(onChange));
    }

    /* renamed from: b */
    public static final void m18269b(IPageControl iPageControl, InterfaceC10570l onEvent) {
        AbstractC9133u.m16133g(iPageControl, "<this>");
        AbstractC9133u.m16133g(onEvent, "onEvent");
        iPageControl.addEventListener(new b(onEvent, iPageControl));
    }

    /* renamed from: c */
    public static final void m18270c(IPageControl iPageControl, InterfaceC10559a onMoveStart, InterfaceC10574p onMoving, InterfaceC10559a onMoveEnd) {
        AbstractC9133u.m16133g(iPageControl, "<this>");
        AbstractC9133u.m16133g(onMoveStart, "onMoveStart");
        AbstractC9133u.m16133g(onMoving, "onMoving");
        AbstractC9133u.m16133g(onMoveEnd, "onMoveEnd");
        iPageControl.setAreaMoveListener(new c(onMoving, onMoveStart, onMoveEnd));
    }

    /* renamed from: d */
    public static final void m18271d(IPageControl iPageControl, InterfaceC10570l onMicroPhoneChange) {
        AbstractC9133u.m16133g(iPageControl, "<this>");
        AbstractC9133u.m16133g(onMicroPhoneChange, "onMicroPhoneChange");
        iPageControl.setMicroPhoneListener(new d(onMicroPhoneChange));
    }

    /* renamed from: e */
    public static final void m18272e(IPageControl iPageControl, InterfaceC10559a onStart, InterfaceC10570l onProgress, InterfaceC10559a onStop) {
        AbstractC9133u.m16133g(iPageControl, "<this>");
        AbstractC9133u.m16133g(onStart, "onStart");
        AbstractC9133u.m16133g(onProgress, "onProgress");
        AbstractC9133u.m16133g(onStop, "onStop");
        iPageControl.setRecordListener(new e(onProgress, onStart, onStop));
    }

    /* renamed from: f */
    public static final void m18273f(IPageControl iPageControl, InterfaceC10570l onTextColorChange, InterfaceC10570l onTextSizeChange) {
        AbstractC9133u.m16133g(iPageControl, "<this>");
        AbstractC9133u.m16133g(onTextColorChange, "onTextColorChange");
        AbstractC9133u.m16133g(onTextSizeChange, "onTextSizeChange");
        iPageControl.setTextSelectListener(new f(onTextColorChange, onTextSizeChange));
    }

    /* renamed from: p5.x1$f */
    public static final class f implements ITextSelectListener {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC10570l f19462a;

        /* renamed from: b */
        public final /* synthetic */ InterfaceC10570l f19463b;

        public f(InterfaceC10570l interfaceC10570l, InterfaceC10570l interfaceC10570l2) {
            this.f19462a = interfaceC10570l;
            this.f19463b = interfaceC10570l2;
        }

        @Override // com.zykj.blackboard.listener.ITextSelectListener
        public void textColorChange(int i10) {
            this.f19462a.invoke(Integer.valueOf(i10));
        }

        @Override // com.zykj.blackboard.listener.ITextSelectListener
        public void textSizeChange(float f10) {
            this.f19463b.invoke(Float.valueOf(f10));
        }

        @Override // com.zykj.blackboard.listener.ITextSelectListener
        public void textSelectedCancel() {
        }

        @Override // com.zykj.blackboard.listener.ITextSelectListener
        public void textSelected(int i10, float f10) {
        }
    }
}
