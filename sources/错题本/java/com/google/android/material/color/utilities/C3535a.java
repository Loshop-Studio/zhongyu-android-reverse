package com.google.android.material.color.utilities;

import java.util.function.Function;

/* renamed from: com.google.android.material.color.utilities.a */
/* loaded from: classes2.dex */
public final /* synthetic */ class C3535a implements Function {

    /* renamed from: a */
    public final /* synthetic */ int f2869a;

    /* renamed from: b */
    public final /* synthetic */ Object f2870b;

    public /* synthetic */ C3535a(Object obj, int i) {
        this.f2869a = i;
        this.f2870b = obj;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.f2869a) {
            case 0:
                return DynamicColor.lambda$fromArgb$0((TonalPalette) this.f2870b, (DynamicScheme) obj);
            case 1:
                return DynamicColor.lambda$fromArgb$1((Hct) this.f2870b, (DynamicScheme) obj);
            default:
                return ((TemperatureCache) this.f2870b).lambda$getHctsByTemp$0((Hct) obj);
        }
    }
}
