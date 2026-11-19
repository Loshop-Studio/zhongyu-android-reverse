package com.zykj.blackboard.core.action;

import com.zykj.board.EzyTouchEvent;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import p006a5.InterfaceC0039c;
import p272v4.C9763b;
import p282w4.InterfaceC9822b;
import p282w4.InterfaceC9823c;
import p312z4.C9998a;

/* loaded from: classes4.dex */
public abstract class BaseTouchAction implements InterfaceC9823c {

    /* renamed from: a */
    public InterfaceC9822b f8194a;

    /* renamed from: b */
    public InterfaceC0039c f8195b;

    /* renamed from: c */
    public C9763b f8196c;

    /* renamed from: d */
    public C9998a f8197d;

    @Override // p282w4.InterfaceC9823c
    /* renamed from: a */
    public void mo7077a(EzyTouchEvent.TouchEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
    }

    @Override // p282w4.InterfaceC9823c
    /* renamed from: b */
    public void mo7078b(EzyTouchEvent.TouchEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
    }

    @Override // p282w4.InterfaceC9823c
    /* renamed from: c */
    public void mo7079c(EzyTouchEvent.TouchEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
    }

    @Override // p282w4.InterfaceC9823c
    /* renamed from: d */
    public void mo7080d(EzyTouchEvent.TouchEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
    }

    @Override // p282w4.InterfaceC9823c
    /* renamed from: e */
    public void mo7081e(EzyTouchEvent.TouchEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
    }

    /* renamed from: f */
    public final C9763b m7082f() {
        return this.f8196c;
    }

    /* renamed from: g */
    public final InterfaceC0039c m7083g() {
        return this.f8195b;
    }

    /* renamed from: h */
    public final InterfaceC9822b m7084h() {
        return this.f8194a;
    }

    /* renamed from: i */
    public final C9998a m7085i() {
        return this.f8197d;
    }

    /* renamed from: j */
    public final void m7086j(final EzyTouchEvent.TouchEvent event, final Function0 callback) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(callback, "callback");
        C9763b c9763b = this.f8196c;
        m7088l(c9763b != null ? c9763b.m16467R() : false, event, new Function0<Unit>() { // from class: com.zykj.blackboard.core.action.BaseTouchAction$isSingleFingerInput$1
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
                List pointerPropertiesList = event.getPointerPropertiesList();
                Intrinsics.checkNotNullExpressionValue(pointerPropertiesList, "event.pointerPropertiesList");
                if (pointerPropertiesList.isEmpty()) {
                    return;
                }
                List pointerPropertiesList2 = event.getPointerPropertiesList();
                Intrinsics.checkNotNullExpressionValue(pointerPropertiesList2, "event.pointerPropertiesList");
                Object objFirst = CollectionsKt.first((List<? extends Object>) pointerPropertiesList2);
                Function0 function0 = callback;
                if (((EzyTouchEvent.TouchEvent.PointerProperties) objFirst).getId() == 0) {
                    function0.invoke();
                }
            }
        });
    }

    /* renamed from: k */
    public void mo7087k(InterfaceC9822b listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f8194a = listener;
        this.f8196c = listener.mo16692k();
        this.f8195b = listener.mo16682a();
        this.f8197d = listener.mo16690i();
    }

    /* renamed from: l */
    public final void m7088l(boolean z9, EzyTouchEvent.TouchEvent touchEvent, Function0 function0) {
        if (!z9) {
            List pointerPropertiesList = touchEvent.getPointerPropertiesList();
            Intrinsics.checkNotNullExpressionValue(pointerPropertiesList, "event.pointerPropertiesList");
            Iterator it = pointerPropertiesList.iterator();
            while (it.hasNext()) {
                if (((EzyTouchEvent.TouchEvent.PointerProperties) it.next()).getToolType() == 1) {
                    return;
                }
            }
        }
        function0.invoke();
    }
}
