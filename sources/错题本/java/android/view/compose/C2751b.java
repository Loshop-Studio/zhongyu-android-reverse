package android.view.compose;

import android.view.LifecycleOwner;
import androidx.compose.runtime.Composer;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;

/* renamed from: androidx.lifecycle.compose.b */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2751b implements InterfaceC6473e {

    /* renamed from: a */
    public final /* synthetic */ int f1124a;

    /* renamed from: b */
    public final /* synthetic */ Object f1125b;

    /* renamed from: c */
    public final /* synthetic */ LifecycleOwner f1126c;

    /* renamed from: d */
    public final /* synthetic */ InterfaceC6471c f1127d;

    /* renamed from: e */
    public final /* synthetic */ int f1128e;

    /* renamed from: f */
    public final /* synthetic */ int f1129f;

    public /* synthetic */ C2751b(Object obj, LifecycleOwner lifecycleOwner, InterfaceC6471c interfaceC6471c, int i, int i8, int i9) {
        this.f1124a = i9;
        this.f1125b = obj;
        this.f1126c = lifecycleOwner;
        this.f1127d = interfaceC6471c;
        this.f1128e = i;
        this.f1129f = i8;
    }

    @Override // p152r6.InterfaceC6473e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f1124a) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return LifecycleEffectKt.LifecycleStartEffect$lambda$7(this.f1125b, this.f1126c, this.f1127d, this.f1128e, this.f1129f, (Composer) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return LifecycleEffectKt.LifecycleResumeEffect$lambda$22(this.f1125b, this.f1126c, this.f1127d, this.f1128e, this.f1129f, (Composer) obj, iIntValue2);
        }
    }
}
