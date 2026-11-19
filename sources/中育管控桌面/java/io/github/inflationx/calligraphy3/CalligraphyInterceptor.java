package io.github.inflationx.calligraphy3;

import p020b5.AbstractC4441b;
import p020b5.InterfaceC4442c;

/* loaded from: classes4.dex */
public class CalligraphyInterceptor {
    private final Calligraphy calligraphy;

    public CalligraphyInterceptor(CalligraphyConfig calligraphyConfig) {
        this.calligraphy = new Calligraphy(calligraphyConfig);
    }

    public AbstractC4441b intercept(InterfaceC4442c interfaceC4442c) {
        interfaceC4442c.m1505a();
        interfaceC4442c.m1506b(null);
        throw null;
    }
}
