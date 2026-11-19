package io.github.inflationx.calligraphy3;

import p178m6.AbstractC9320b;
import p178m6.InterfaceC9321c;

/* loaded from: classes5.dex */
public class CalligraphyInterceptor {
    private final Calligraphy calligraphy;

    public CalligraphyInterceptor(CalligraphyConfig calligraphyConfig) {
        this.calligraphy = new Calligraphy(calligraphyConfig);
    }

    public AbstractC9320b intercept(InterfaceC9321c interfaceC9321c) {
        interfaceC9321c.m17150a();
        interfaceC9321c.m17151b(null);
        throw null;
    }
}
