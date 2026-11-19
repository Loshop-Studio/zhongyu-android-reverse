package com.google.android.material.color.utilities;

import java.util.function.Function;

/* renamed from: com.google.android.material.color.utilities.g */
/* loaded from: classes2.dex */
public final /* synthetic */ class C3541g implements Function {

    /* renamed from: a */
    public final /* synthetic */ int f2877a;

    /* renamed from: b */
    public final /* synthetic */ MaterialDynamicColors f2878b;

    public /* synthetic */ C3541g(MaterialDynamicColors materialDynamicColors, int i) {
        this.f2877a = i;
        this.f2878b = materialDynamicColors;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.f2877a) {
            case 0:
                return this.f2878b.lambda$onPrimaryFixedVariant$116((DynamicScheme) obj);
            case 1:
                return this.f2878b.lambda$tertiaryFixedDim$136((DynamicScheme) obj);
            case 2:
                return this.f2878b.lambda$onTertiary$84((DynamicScheme) obj);
            case 3:
                return this.f2878b.lambda$onError$96((DynamicScheme) obj);
            case 4:
                return this.f2878b.lambda$onPrimaryContainer$62((DynamicScheme) obj);
            case 5:
                return this.f2878b.lambda$onPrimaryContainer$63((DynamicScheme) obj);
            case 6:
                return this.f2878b.lambda$secondaryFixedDim$122((DynamicScheme) obj);
            case 7:
                return this.f2878b.lambda$primaryFixed$105((DynamicScheme) obj);
            case 8:
                return this.f2878b.lambda$primaryFixedDim$108((DynamicScheme) obj);
            case 9:
                return this.f2878b.lambda$tertiaryContainer$87((DynamicScheme) obj);
            default:
                return this.f2878b.highestSurface((DynamicScheme) obj);
        }
    }
}
