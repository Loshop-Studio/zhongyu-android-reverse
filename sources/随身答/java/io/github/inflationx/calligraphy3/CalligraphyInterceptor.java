package io.github.inflationx.calligraphy3;

import p009a8.AbstractC0046b;
import p009a8.InterfaceC0047c;

/* loaded from: classes5.dex */
public class CalligraphyInterceptor {
    private final Calligraphy calligraphy;

    public CalligraphyInterceptor(CalligraphyConfig calligraphyConfig) {
        this.calligraphy = new Calligraphy(calligraphyConfig);
    }

    public AbstractC0046b intercept(InterfaceC0047c interfaceC0047c) {
        interfaceC0047c.m238a();
        interfaceC0047c.m239b(null);
        throw null;
    }
}
