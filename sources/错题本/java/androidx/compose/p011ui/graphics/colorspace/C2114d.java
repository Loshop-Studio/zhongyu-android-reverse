package androidx.compose.p011ui.graphics.colorspace;

import androidx.compose.p011ui.graphics.colorspace.Rgb;

/* renamed from: androidx.compose.ui.graphics.colorspace.d */
/* loaded from: classes.dex */
public final /* synthetic */ class C2114d implements DoubleFunction {

    /* renamed from: a */
    public final /* synthetic */ int f826a;

    /* renamed from: b */
    public final /* synthetic */ TransferParameters f827b;

    public /* synthetic */ C2114d(TransferParameters transferParameters, int i) {
        this.f826a = i;
        this.f827b = transferParameters;
    }

    @Override // androidx.compose.p011ui.graphics.colorspace.DoubleFunction
    public final double invoke(double d9) {
        switch (this.f826a) {
            case 0:
                return Rgb.Companion.generateEotf$lambda$4(this.f827b, d9);
            case 1:
                return Rgb.Companion.generateEotf$lambda$5(this.f827b, d9);
            case 2:
                return Rgb.Companion.generateEotf$lambda$6(this.f827b, d9);
            case 3:
                return Rgb.Companion.generateEotf$lambda$7(this.f827b, d9);
            case 4:
                return Rgb.Companion.generateOetf$lambda$0(this.f827b, d9);
            case 5:
                return Rgb.Companion.generateOetf$lambda$1(this.f827b, d9);
            case 6:
                return Rgb.Companion.generateOetf$lambda$2(this.f827b, d9);
            default:
                return Rgb.Companion.generateOetf$lambda$3(this.f827b, d9);
        }
    }
}
