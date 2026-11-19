package com.zykj.blackboard.core.action;

import com.zykj.board.EzyTouchEvent;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9529a;
import p307q9.C10762b;
import p309qc.C10786q;
import p322r9.InterfaceC10918b;
import p322r9.InterfaceC10919c;
import p325rc.AbstractC10947g0;
import p362u9.C11373a;
import p377v9.InterfaceC11552c;

/* loaded from: classes5.dex */
public abstract class BaseTouchAction implements InterfaceC10919c {

    /* renamed from: a */
    public InterfaceC10918b f17760a;

    /* renamed from: b */
    public InterfaceC11552c f17761b;

    /* renamed from: c */
    public C10762b f17762c;

    /* renamed from: d */
    public C11373a f17763d;

    @Override // p322r9.InterfaceC10919c
    /* renamed from: a */
    public void mo13719a(EzyTouchEvent.TouchEvent event) {
        AbstractC9979u.m20294g(event, "event");
    }

    @Override // p322r9.InterfaceC10919c
    /* renamed from: b */
    public void mo13720b(EzyTouchEvent.TouchEvent event) {
        AbstractC9979u.m20294g(event, "event");
    }

    @Override // p322r9.InterfaceC10919c
    /* renamed from: c */
    public void mo13721c(EzyTouchEvent.TouchEvent event) {
        AbstractC9979u.m20294g(event, "event");
    }

    @Override // p322r9.InterfaceC10919c
    /* renamed from: d */
    public void mo13722d(EzyTouchEvent.TouchEvent event) {
        AbstractC9979u.m20294g(event, "event");
    }

    @Override // p322r9.InterfaceC10919c
    /* renamed from: e */
    public void mo13723e(EzyTouchEvent.TouchEvent event) {
        AbstractC9979u.m20294g(event, "event");
    }

    /* renamed from: f */
    public final C10762b m13724f() {
        return this.f17762c;
    }

    /* renamed from: g */
    public final InterfaceC11552c m13725g() {
        return this.f17761b;
    }

    /* renamed from: h */
    public final InterfaceC10918b m13726h() {
        return this.f17760a;
    }

    /* renamed from: i */
    public final C11373a m13727i() {
        return this.f17763d;
    }

    /* renamed from: j */
    public final void m13728j(final EzyTouchEvent.TouchEvent event, final InterfaceC9529a callback) {
        AbstractC9979u.m20294g(event, "event");
        AbstractC9979u.m20294g(callback, "callback");
        C10762b c10762b = this.f17762c;
        m13730l(c10762b != null ? c10762b.m22871O() : false, event, new InterfaceC9529a() { // from class: com.zykj.blackboard.core.action.BaseTouchAction$isSingleFingerInput$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            public /* bridge */ /* synthetic */ Object invoke() {
                m33986invoke();
                return C10786q.f26013a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m33986invoke() {
                List pointerPropertiesList = event.getPointerPropertiesList();
                AbstractC9979u.m20293f(pointerPropertiesList, "event.pointerPropertiesList");
                if (pointerPropertiesList.isEmpty()) {
                    return;
                }
                List pointerPropertiesList2 = event.getPointerPropertiesList();
                AbstractC9979u.m20293f(pointerPropertiesList2, "event.pointerPropertiesList");
                Object objM23944m0 = AbstractC10947g0.m23944m0(pointerPropertiesList2);
                InterfaceC9529a interfaceC9529a = callback;
                if (((EzyTouchEvent.TouchEvent.PointerProperties) objM23944m0).getId() == 0) {
                    interfaceC9529a.invoke();
                }
            }
        });
    }

    /* renamed from: k */
    public void mo13729k(InterfaceC10918b listener) {
        AbstractC9979u.m20294g(listener, "listener");
        this.f17760a = listener;
        this.f17762c = listener.mo23770j();
        this.f17761b = listener.mo23761a();
        this.f17763d = listener.mo23767g();
    }

    /* renamed from: l */
    public final void m13730l(boolean z10, EzyTouchEvent.TouchEvent touchEvent, InterfaceC9529a interfaceC9529a) {
        if (!z10) {
            List pointerPropertiesList = touchEvent.getPointerPropertiesList();
            AbstractC9979u.m20293f(pointerPropertiesList, "event.pointerPropertiesList");
            Iterator it = pointerPropertiesList.iterator();
            while (it.hasNext()) {
                if (((EzyTouchEvent.TouchEvent.PointerProperties) it.next()).getToolType() == 1) {
                    return;
                }
            }
        }
        interfaceC9529a.invoke();
    }
}
