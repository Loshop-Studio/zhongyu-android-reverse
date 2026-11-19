package com.zykj.blackboard.core.action;

import androidx.constraintlayout.widget.ConstraintLayout;
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
import p006a5.InterfaceC0039c;
import p117g5.AbstractC8053a;
import p117g5.InterfaceC8055c;
import p147j5.AbstractC8216c;
import p253t5.InterfaceC9615a;
import p263u5.AbstractC9694m;
import p272v4.C9763b;
import p282w4.InterfaceC9822b;

@Metadata(m13412d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m13413d2 = {"<anonymous>", "", "invoke"}, m13414k = 3, m13415mv = {1, 7, 1}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes4.dex */
public final class BaseWriteAction$singleTouchUp$1 extends Lambda implements Function0<Unit> {

    /* renamed from: a */
    public final /* synthetic */ BaseWriteAction f8220a;

    /* renamed from: b */
    public final /* synthetic */ EzyTouchEvent.TouchEvent f8221b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseWriteAction$singleTouchUp$1(BaseWriteAction baseWriteAction, EzyTouchEvent.TouchEvent touchEvent) {
        super(0);
        this.f8220a = baseWriteAction;
        this.f8221b = touchEvent;
    }

    /* renamed from: c */
    public static final void m7123c(InterfaceC9822b actionListener, BaseWriteAction this$0, List eventsSnapshot, EzyPaint.Paint ezyPaint, InterfaceC8055c groupGraph, String graphId, AbstractC8053a graph) {
        Intrinsics.checkNotNullParameter(actionListener, "$actionListener");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(eventsSnapshot, "$eventsSnapshot");
        Intrinsics.checkNotNullParameter(ezyPaint, "$ezyPaint");
        Intrinsics.checkNotNullParameter(groupGraph, "$groupGraph");
        Intrinsics.checkNotNullParameter(graphId, "$graphId");
        Intrinsics.checkNotNullParameter(graph, "$graph");
        AbstractC8053a abstractC8053aMo16687f = actionListener.mo16687f(this$0.mo7104T(), eventsSnapshot, ezyPaint, groupGraph.getId(), graphId);
        if ((graph instanceof AbstractC8216c) && (abstractC8053aMo16687f instanceof AbstractC8216c)) {
            AbstractC8216c abstractC8216c = (AbstractC8216c) graph;
            abstractC8216c.m13249O(actionListener.mo16698q());
            AbstractC8216c abstractC8216c2 = (AbstractC8216c) abstractC8053aMo16687f;
            abstractC8216c.m13247M(abstractC8216c2.mo7865v());
            abstractC8216c.m13248N(abstractC8216c2.mo7866w());
        }
        InterfaceC9822b interfaceC9822bM7084h = this$0.m7084h();
        if (interfaceC9822bM7084h != null) {
            interfaceC9822bM7084h.mo16693l();
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        final InterfaceC9822b interfaceC9822bM7084h;
        InterfaceC9615a interfaceC9615aM16456G;
        this.f8220a.f8203B = false;
        this.f8220a.mo7113c0(this.f8221b);
        this.f8220a.f8214y = System.currentTimeMillis();
        final InterfaceC8055c interfaceC8055c = this.f8220a.f8212w;
        if (interfaceC8055c == null || (interfaceC9822bM7084h = this.f8220a.m7084h()) == null) {
            return;
        }
        if (this.f8220a.m7103S().isEmpty()) {
            this.f8220a.mo7097E(this.f8221b);
            return;
        }
        final String string = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string, "randomUUID().toString()");
        final AbstractC8053a abstractC8053aMo7101Q = this.f8220a.mo7101Q(string);
        final List list = CollectionsKt.toList(this.f8220a.m7103S());
        final EzyPaint.Paint paintM16193a = AbstractC9694m.m16193a(this.f8220a.m7107W(), this.f8220a.m7108X(), this.f8220a.m7109Y());
        InterfaceC0039c interfaceC0039cM7083g = this.f8220a.m7083g();
        if (interfaceC0039cM7083g != null) {
            interfaceC0039cM7083g.mo222y(interfaceC8055c.getId(), abstractC8053aMo7101Q);
        }
        C9763b c9763bM7082f = this.f8220a.m7082f();
        if (c9763bM7082f != null && (interfaceC9615aM16456G = c9763bM7082f.m16456G()) != null) {
            interfaceC9615aM16456G.mo11223b(Integer.valueOf(this.f8220a.m7107W().getColor()));
        }
        ExecutorService executorService = this.f8220a.f8204C;
        final BaseWriteAction baseWriteAction = this.f8220a;
        executorService.submit(new Runnable() { // from class: com.zykj.blackboard.core.action.a
            @Override // java.lang.Runnable
            public final void run() {
                BaseWriteAction$singleTouchUp$1.m7123c(interfaceC9822bM7084h, baseWriteAction, list, paintM16193a, interfaceC8055c, string, abstractC8053aMo7101Q);
            }
        });
    }
}
