package androidx.window.layout;

import kotlin.jvm.internal.AbstractC9133u;
import kotlin.jvm.internal.FunctionReferenceImpl;
import p300x7.InterfaceC10570l;

/* loaded from: classes3.dex */
public /* synthetic */ class WindowMetricsCalculator$Companion$overrideDecorator$1 extends FunctionReferenceImpl implements InterfaceC10570l {
    public WindowMetricsCalculator$Companion$overrideDecorator$1(Object obj) {
        super(1, obj, WindowMetricsCalculatorDecorator.class, "decorate", "decorate(Landroidx/window/layout/WindowMetricsCalculator;)Landroidx/window/layout/WindowMetricsCalculator;", 0);
    }

    @Override // p300x7.InterfaceC10570l
    public final WindowMetricsCalculator invoke(WindowMetricsCalculator p02) {
        AbstractC9133u.m16133g(p02, "p0");
        return ((WindowMetricsCalculatorDecorator) this.receiver).decorate(p02);
    }
}
