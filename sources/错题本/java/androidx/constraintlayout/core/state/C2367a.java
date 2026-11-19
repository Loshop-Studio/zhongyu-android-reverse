package androidx.constraintlayout.core.state;

import com.google.gson.JsonIOException;
import com.google.gson.internal.InterfaceC3854k;

/* renamed from: androidx.constraintlayout.core.state.a */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2367a implements Interpolator, InterfaceC3854k {

    /* renamed from: a */
    public final /* synthetic */ int f963a;

    /* renamed from: b */
    public final /* synthetic */ String f964b;

    public /* synthetic */ C2367a(String str, int i) {
        this.f963a = i;
        this.f964b = str;
    }

    @Override // com.google.gson.internal.InterfaceC3854k
    /* renamed from: a */
    public Object mo671a() {
        switch (this.f963a) {
            case 1:
                throw new JsonIOException(this.f964b);
            case 2:
                throw new JsonIOException(this.f964b);
            case 3:
                throw new JsonIOException(this.f964b);
            case 4:
                throw new JsonIOException(this.f964b);
            case 5:
                throw new JsonIOException(this.f964b);
            default:
                throw new JsonIOException(this.f964b);
        }
    }

    @Override // androidx.constraintlayout.core.state.Interpolator
    public float getInterpolation(float f) {
        return Transition.lambda$getInterpolator$0(this.f964b, f);
    }
}
