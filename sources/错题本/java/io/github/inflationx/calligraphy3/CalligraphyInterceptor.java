package io.github.inflationx.calligraphy3;

import p099k5.AbstractC5756a;
import p099k5.InterfaceC5757b;

/* loaded from: classes3.dex */
public class CalligraphyInterceptor {
    private final Calligraphy calligraphy;

    public CalligraphyInterceptor(CalligraphyConfig calligraphyConfig) {
        this.calligraphy = new Calligraphy(calligraphyConfig);
    }

    public AbstractC5756a intercept(InterfaceC5757b interfaceC5757b) {
        interfaceC5757b.m5096a();
        interfaceC5757b.m5097b();
        throw null;
    }
}
