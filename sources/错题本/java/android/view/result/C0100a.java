package android.view.result;

import androidx.compose.p011ui.graphics.colorspace.DoubleFunction;
import androidx.compose.p011ui.graphics.colorspace.Rgb;
import p152r6.InterfaceC6471c;

/* renamed from: androidx.activity.result.a */
/* loaded from: classes.dex */
public final /* synthetic */ class C0100a implements ActivityResultCallback, DoubleFunction {

    /* renamed from: a */
    public final /* synthetic */ int f157a;

    /* renamed from: b */
    public final /* synthetic */ InterfaceC6471c f158b;

    public /* synthetic */ C0100a(InterfaceC6471c interfaceC6471c, int i) {
        this.f157a = i;
        this.f158b = interfaceC6471c;
    }

    @Override // androidx.compose.p011ui.graphics.colorspace.DoubleFunction
    public double invoke(double d9) {
        switch (this.f157a) {
            case 2:
                return Rgb._init_$lambda$2(this.f158b, d9);
            case 3:
                return Rgb._init_$lambda$3(this.f158b, d9);
            case 4:
                return Rgb._init_$lambda$4(this.f158b, d9);
            default:
                return Rgb._init_$lambda$5(this.f158b, d9);
        }
    }

    @Override // android.view.result.ActivityResultCallback
    public void onActivityResult(Object obj) {
        switch (this.f157a) {
            case 0:
                this.f158b.invoke(obj);
                break;
            default:
                this.f158b.invoke(obj);
                break;
        }
    }
}
