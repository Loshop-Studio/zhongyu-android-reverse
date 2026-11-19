package com.zykj.blackboard.core.action;

import com.zykj.blackboard.bean.BoardConfig;
import com.zykj.board.EzyPaint;
import com.zykj.board.EzyTouchEvent;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p066d5.InterfaceC7289a;
import p077e5.AbstractC7351l;
import p098g4.InterfaceC7522b;
import p142k4.InterfaceC7880c;
import p210q4.AbstractC8886a;
import p210q4.InterfaceC8888c;
import p243t4.AbstractC9384c;

@Metadata(m13557d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m13558d2 = {"<anonymous>", "", "invoke"}, m13559k = 3, m13560mv = {1, 7, 1}, m13562xi = 48)
/* loaded from: classes4.dex */
public final class BaseWriteAction$singleTouchUp$1 extends Lambda implements Function0<Unit> {

    /* renamed from: a */
    public final /* synthetic */ BaseWriteAction f6937a;

    /* renamed from: b */
    public final /* synthetic */ EzyTouchEvent.TouchEvent f6938b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseWriteAction$singleTouchUp$1(BaseWriteAction baseWriteAction, EzyTouchEvent.TouchEvent touchEvent) {
        super(0);
        this.f6937a = baseWriteAction;
        this.f6938b = touchEvent;
    }

    /* renamed from: f */
    public static final void m6027f(InterfaceC7522b actionListener, BaseWriteAction this$0, List eventsSnapshot, EzyPaint.Paint ezyPaint, InterfaceC8888c groupGraph, String graphId, AbstractC8886a graph) {
        Intrinsics.checkNotNullParameter(actionListener, "$actionListener");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(eventsSnapshot, "$eventsSnapshot");
        Intrinsics.checkNotNullParameter(ezyPaint, "$ezyPaint");
        Intrinsics.checkNotNullParameter(groupGraph, "$groupGraph");
        Intrinsics.checkNotNullParameter(graphId, "$graphId");
        Intrinsics.checkNotNullParameter(graph, "$graph");
        AbstractC8886a abstractC8886aMo12241f = actionListener.mo12241f(this$0.mo6008S(), eventsSnapshot, ezyPaint, groupGraph.getId(), graphId);
        if ((graph instanceof AbstractC9384c) && (abstractC8886aMo12241f instanceof AbstractC9384c)) {
            AbstractC9384c abstractC9384c = (AbstractC9384c) graph;
            abstractC9384c.m15698P(actionListener.mo12252q());
            AbstractC9384c abstractC9384c2 = (AbstractC9384c) abstractC8886aMo12241f;
            abstractC9384c.m15696N(abstractC9384c2.mo6754w());
            abstractC9384c.m15697O(abstractC9384c2.mo6755x());
        }
        InterfaceC7522b interfaceC7522bM5989h = this$0.m5989h();
        if (interfaceC7522bM5989h != null) {
            interfaceC7522bM5989h.mo12247l();
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        final InterfaceC7522b interfaceC7522bM5989h;
        InterfaceC7289a selectCustomColorView;
        this.f6937a.f6920B = false;
        this.f6937a.mo6017b0(this.f6938b);
        this.f6937a.f6931y = System.currentTimeMillis();
        final InterfaceC8888c interfaceC8888c = this.f6937a.f6929w;
        if (interfaceC8888c == null || (interfaceC7522bM5989h = this.f6937a.m5989h()) == null) {
            return;
        }
        if (this.f6937a.m6007R().isEmpty()) {
            this.f6937a.mo6002E(this.f6938b);
            return;
        }
        final String string = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string, "randomUUID().toString()");
        final AbstractC8886a abstractC8886aMo6006Q = this.f6937a.mo6006Q(string);
        final List list = CollectionsKt.toList(this.f6937a.m6007R());
        final EzyPaint.Paint paintM11770a = AbstractC7351l.m11770a(this.f6937a.m6011V(), this.f6937a.m6012W(), this.f6937a.m6013X());
        InterfaceC7880c interfaceC7880cM5988g = this.f6937a.m5988g();
        if (interfaceC7880cM5988g != null) {
            interfaceC7880cM5988g.mo13460y(interfaceC8888c.getId(), abstractC8886aMo6006Q);
        }
        BoardConfig boardConfigM5987f = this.f6937a.m5987f();
        if (boardConfigM5987f != null && (selectCustomColorView = boardConfigM5987f.getSelectCustomColorView()) != null) {
            selectCustomColorView.mo10824b(Integer.valueOf(this.f6937a.m6011V().getColor()));
        }
        ExecutorService executorService = this.f6937a.f6921C;
        final BaseWriteAction baseWriteAction = this.f6937a;
        executorService.submit(new Runnable() { // from class: com.zykj.blackboard.core.action.a
            @Override // java.lang.Runnable
            public final void run() {
                BaseWriteAction$singleTouchUp$1.m6027f(interfaceC7522bM5989h, baseWriteAction, list, paintM11770a, interfaceC8888c, string, abstractC8886aMo6006Q);
            }
        });
    }
}
