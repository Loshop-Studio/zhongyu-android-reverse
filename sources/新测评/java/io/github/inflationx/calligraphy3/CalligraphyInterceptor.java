package io.github.inflationx.calligraphy3;

import p203p8.AbstractC8862b;
import p203p8.InterfaceC8863c;

/* loaded from: classes5.dex */
public class CalligraphyInterceptor {
    private final Calligraphy calligraphy;

    public CalligraphyInterceptor(CalligraphyConfig calligraphyConfig) {
        this.calligraphy = new Calligraphy(calligraphyConfig);
    }

    public AbstractC8862b intercept(InterfaceC8863c interfaceC8863c) {
        interfaceC8863c.m14863a();
        interfaceC8863c.m14864b(null);
        throw null;
    }
}
