package com.zykj.blackboard.core.action;

import ba.AbstractC5179a;
import ba.InterfaceC5181c;
import com.zykj.board.EzyTouchEvent;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.AbstractC9979u;
import kotlin.jvm.internal.Lambda;
import na.AbstractC10350m;
import p134ea.AbstractC9113c;
import p181hd.InterfaceC9529a;
import p309qc.C10786q;
import p322r9.InterfaceC10918b;
import p325rc.AbstractC10947g0;
import p377v9.InterfaceC11552c;

/* loaded from: classes5.dex */
public final class BaseWriteAction$singleTouchUp$1 extends Lambda implements InterfaceC9529a {

    /* renamed from: c */
    public final /* synthetic */ BaseWriteAction f17786c;

    /* renamed from: d */
    public final /* synthetic */ EzyTouchEvent.TouchEvent f17787d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseWriteAction$singleTouchUp$1(BaseWriteAction baseWriteAction, EzyTouchEvent.TouchEvent touchEvent) {
        super(0);
        this.f17786c = baseWriteAction;
        this.f17787d = touchEvent;
    }

    /* renamed from: c */
    public static final void m13765c(InterfaceC10918b actionListener, BaseWriteAction this$0, List list, InterfaceC5181c groupGraph, String graphId, AbstractC5179a graph) {
        AbstractC9979u.m20294g(actionListener, "$actionListener");
        AbstractC9979u.m20294g(this$0, "this$0");
        AbstractC9979u.m20294g(list, "$list");
        AbstractC9979u.m20294g(groupGraph, "$groupGraph");
        AbstractC9979u.m20294g(graphId, "$graphId");
        AbstractC9979u.m20294g(graph, "$graph");
        AbstractC5179a abstractC5179aMo23765e = actionListener.mo23765e(this$0.mo13746T(), list, AbstractC10350m.m21653a(this$0.m13749W(), this$0.m13750X(), this$0.m13751Y()), groupGraph.getId(), graphId);
        if ((graph instanceof AbstractC9113c) && (abstractC5179aMo23765e instanceof AbstractC9113c)) {
            AbstractC9113c abstractC9113c = (AbstractC9113c) graph;
            abstractC9113c.m17927P(actionListener.mo23777q());
            AbstractC9113c abstractC9113c2 = (AbstractC9113c) abstractC5179aMo23765e;
            abstractC9113c.m17925N(abstractC9113c2.mo2867w());
            abstractC9113c.m17926O(abstractC9113c2.mo2868x());
        }
        InterfaceC10918b interfaceC10918bM13726h = this$0.m13726h();
        if (interfaceC10918bM13726h != null) {
            interfaceC10918bM13726h.mo23772l();
        }
    }

    @Override // p181hd.InterfaceC9529a
    public /* bridge */ /* synthetic */ Object invoke() {
        m33989invoke();
        return C10786q.f26013a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m33989invoke() {
        final InterfaceC10918b interfaceC10918bM13726h;
        this.f17786c.f17769B = false;
        this.f17786c.mo13755c0(this.f17787d);
        this.f17786c.f17780y = System.currentTimeMillis();
        final InterfaceC5181c interfaceC5181c = this.f17786c.f17778w;
        if (interfaceC5181c == null || (interfaceC10918bM13726h = this.f17786c.m13726h()) == null) {
            return;
        }
        if (this.f17786c.m13745S().isEmpty()) {
            this.f17786c.mo13739E(this.f17787d);
            return;
        }
        final String string = UUID.randomUUID().toString();
        AbstractC9979u.m20293f(string, "randomUUID().toString()");
        final AbstractC5179a abstractC5179aMo13743Q = this.f17786c.mo13743Q(string);
        final List listM23922X0 = AbstractC10947g0.m23922X0(this.f17786c.m13745S());
        AbstractC10350m.m21653a(this.f17786c.m13749W(), this.f17786c.m13750X(), this.f17786c.m13751Y());
        InterfaceC11552c interfaceC11552cM13725g = this.f17786c.m13725g();
        if (interfaceC11552cM13725g != null) {
            interfaceC11552cM13725g.mo25446f(interfaceC5181c.getId(), abstractC5179aMo13743Q);
        }
        ExecutorService executorService = this.f17786c.f17770C;
        final BaseWriteAction baseWriteAction = this.f17786c;
        executorService.submit(new Runnable() { // from class: com.zykj.blackboard.core.action.a
            @Override // java.lang.Runnable
            public final void run() {
                BaseWriteAction$singleTouchUp$1.m13765c(interfaceC10918bM13726h, baseWriteAction, listM23922X0, interfaceC5181c, string, abstractC5179aMo13743Q);
            }
        });
    }
}
