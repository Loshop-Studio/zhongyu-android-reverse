package io.github.inflationx.calligraphy3;

import p091l2.AbstractC4339b;
import p091l2.InterfaceC4340c;

/* loaded from: classes2.dex */
public class CalligraphyInterceptor {
    private final Calligraphy calligraphy;

    public CalligraphyInterceptor(CalligraphyConfig calligraphyConfig) {
        this.calligraphy = new Calligraphy(calligraphyConfig);
    }

    public AbstractC4339b intercept(InterfaceC4340c interfaceC4340c) {
        interfaceC4340c.m5350S();
        interfaceC4340c.m5351a(null);
        throw null;
    }
}
