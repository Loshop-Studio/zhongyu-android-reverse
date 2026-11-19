package android.view.compose;

import android.view.LifecycleOwner;
import androidx.compose.runtime.Composer;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;

/* renamed from: androidx.lifecycle.compose.e */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2754e implements InterfaceC6473e {

    /* renamed from: a */
    public final /* synthetic */ int f1141a;

    /* renamed from: b */
    public final /* synthetic */ Object[] f1142b;

    /* renamed from: c */
    public final /* synthetic */ LifecycleOwner f1143c;

    /* renamed from: d */
    public final /* synthetic */ InterfaceC6471c f1144d;

    /* renamed from: e */
    public final /* synthetic */ int f1145e;

    /* renamed from: f */
    public final /* synthetic */ int f1146f;

    public /* synthetic */ C2754e(Object[] objArr, LifecycleOwner lifecycleOwner, InterfaceC6471c interfaceC6471c, int i, int i8, int i9) {
        this.f1141a = i9;
        this.f1142b = objArr;
        this.f1143c = lifecycleOwner;
        this.f1144d = interfaceC6471c;
        this.f1145e = i;
        this.f1146f = i8;
    }

    @Override // p152r6.InterfaceC6473e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f1141a) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return LifecycleEffectKt.LifecycleResumeEffect$lambda$28(this.f1142b, this.f1143c, this.f1144d, this.f1145e, this.f1146f, (Composer) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return LifecycleEffectKt.LifecycleStartEffect$lambda$13(this.f1142b, this.f1143c, this.f1144d, this.f1145e, this.f1146f, (Composer) obj, iIntValue2);
        }
    }
}
