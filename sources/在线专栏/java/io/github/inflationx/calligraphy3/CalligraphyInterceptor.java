package io.github.inflationx.calligraphy3;

import p120m2.C2862b;
import p120m2.InterfaceC2863c;

/* loaded from: classes.dex */
public class CalligraphyInterceptor implements InterfaceC2863c {
    private final Calligraphy calligraphy;

    public CalligraphyInterceptor(CalligraphyConfig calligraphyConfig) {
        this.calligraphy = new Calligraphy(calligraphyConfig);
    }

    public C2862b intercept(InterfaceC2863c.a aVar) {
        aVar.request();
        aVar.m9650a(null);
        throw null;
    }
}
