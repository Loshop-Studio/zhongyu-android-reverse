package com.zykj.blackboard.core.action;

import com.zykj.blackboard.bean.BoardConfig;
import com.zykj.board.EzyTouchEvent;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import p098g4.InterfaceC7522b;
import p098g4.InterfaceC7523c;
import p131j4.C7792a;
import p142k4.InterfaceC7880c;

/* loaded from: classes4.dex */
public abstract class BaseTouchAction implements InterfaceC7523c {

    /* renamed from: a */
    public InterfaceC7522b f6911a;

    /* renamed from: b */
    public InterfaceC7880c f6912b;

    /* renamed from: c */
    public BoardConfig f6913c;

    /* renamed from: d */
    public C7792a f6914d;

    @Override // p098g4.InterfaceC7523c
    /* renamed from: a */
    public void mo5982a(EzyTouchEvent.TouchEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
    }

    @Override // p098g4.InterfaceC7523c
    /* renamed from: b */
    public void mo5983b(EzyTouchEvent.TouchEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
    }

    @Override // p098g4.InterfaceC7523c
    /* renamed from: c */
    public void mo5984c(EzyTouchEvent.TouchEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
    }

    @Override // p098g4.InterfaceC7523c
    /* renamed from: d */
    public void mo5985d(EzyTouchEvent.TouchEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
    }

    @Override // p098g4.InterfaceC7523c
    /* renamed from: e */
    public void mo5986e(EzyTouchEvent.TouchEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
    }

    /* renamed from: f */
    public final BoardConfig m5987f() {
        return this.f6913c;
    }

    /* renamed from: g */
    public final InterfaceC7880c m5988g() {
        return this.f6912b;
    }

    /* renamed from: h */
    public final InterfaceC7522b m5989h() {
        return this.f6911a;
    }

    /* renamed from: i */
    public final C7792a m5990i() {
        return this.f6914d;
    }

    /* renamed from: j */
    public final void m5991j(final EzyTouchEvent.TouchEvent event, final Function0 callback) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(callback, "callback");
        BoardConfig boardConfig = this.f6913c;
        m5993l(boardConfig != null ? boardConfig.getIsFingerDraw() : false, event, new Function0<Unit>() { // from class: com.zykj.blackboard.core.action.BaseTouchAction$isSingleFingerInput$1
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
    public void mo5992k(InterfaceC7522b listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f6911a = listener;
        this.f6913c = listener.mo12246k();
        this.f6912b = listener.mo12236a();
        this.f6914d = listener.mo12243h();
    }

    /* renamed from: l */
    public final void m5993l(boolean z9, EzyTouchEvent.TouchEvent touchEvent, Function0 function0) {
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
