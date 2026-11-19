package androidx.window.layout;

import kotlin.jvm.internal.AbstractC9979u;
import kotlin.jvm.internal.FunctionReferenceImpl;
import p181hd.InterfaceC9540l;

/* loaded from: classes3.dex */
public /* synthetic */ class WindowMetricsCalculator$Companion$overrideDecorator$1 extends FunctionReferenceImpl implements InterfaceC9540l {
    public WindowMetricsCalculator$Companion$overrideDecorator$1(Object obj) {
        super(1, obj, WindowMetricsCalculatorDecorator.class, "decorate", "decorate(Landroidx/window/layout/WindowMetricsCalculator;)Landroidx/window/layout/WindowMetricsCalculator;", 0);
    }

    @Override // p181hd.InterfaceC9540l
    public final WindowMetricsCalculator invoke(WindowMetricsCalculator p02) {
        AbstractC9979u.m20294g(p02, "p0");
        return ((WindowMetricsCalculatorDecorator) this.receiver).decorate(p02);
    }
}
