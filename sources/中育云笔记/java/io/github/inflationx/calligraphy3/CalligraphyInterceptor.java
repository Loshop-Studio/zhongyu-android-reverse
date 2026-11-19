package io.github.inflationx.calligraphy3;

import p180hc.AbstractC9527b;
import p180hc.InterfaceC9528c;

/* loaded from: classes6.dex */
public class CalligraphyInterceptor {
    private final Calligraphy calligraphy;

    public CalligraphyInterceptor(CalligraphyConfig calligraphyConfig) {
        this.calligraphy = new Calligraphy(calligraphyConfig);
    }

    public AbstractC9527b intercept(InterfaceC9528c interfaceC9528c) {
        interfaceC9528c.request();
        interfaceC9528c.m18775a(null);
        throw null;
    }
}
