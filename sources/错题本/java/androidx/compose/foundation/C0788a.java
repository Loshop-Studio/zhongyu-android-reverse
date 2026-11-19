package androidx.compose.foundation;

import androidx.compose.foundation.MarqueeSpacing;
import androidx.compose.p011ui.unit.Density;

/* renamed from: androidx.compose.foundation.a */
/* loaded from: classes.dex */
public final /* synthetic */ class C0788a implements MarqueeSpacing {

    /* renamed from: a */
    public final /* synthetic */ int f742a;

    /* renamed from: b */
    public final /* synthetic */ float f743b;

    public /* synthetic */ C0788a(float f, int i) {
        this.f742a = i;
        this.f743b = f;
    }

    @Override // androidx.compose.foundation.MarqueeSpacing
    public final int calculateSpacing(Density density, int i, int i8) {
        switch (this.f742a) {
            case 0:
                return BasicMarqueeKt.MarqueeSpacing_0680j_4$lambda$1(this.f743b, density, i, i8);
            default:
                return MarqueeSpacing.Companion.fractionOfContainer$lambda$0(this.f743b, density, i, i8);
        }
    }
}
