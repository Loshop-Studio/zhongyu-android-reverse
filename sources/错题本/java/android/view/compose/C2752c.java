package android.view.compose;

import android.view.LifecycleOwner;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import com.zykj.mistake.feature.collection.filter.AbstractC4688y0;
import p045d6.C5443s;
import p045d6.InterfaceC5428d;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;

/* renamed from: androidx.lifecycle.compose.c */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2752c implements InterfaceC6473e {

    /* renamed from: a */
    public final /* synthetic */ int f1130a;

    /* renamed from: b */
    public final /* synthetic */ Object f1131b;

    /* renamed from: c */
    public final /* synthetic */ InterfaceC5428d f1132c;

    /* renamed from: d */
    public final /* synthetic */ int f1133d;

    /* renamed from: e */
    public final /* synthetic */ int f1134e;

    public /* synthetic */ C2752c(int i, String str, InterfaceC6469a interfaceC6469a, int i8) {
        this.f1130a = 2;
        this.f1133d = i;
        this.f1131b = str;
        this.f1132c = interfaceC6469a;
        this.f1134e = i8;
    }

    @Override // p152r6.InterfaceC6473e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f1130a) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return LifecycleEffectKt.LifecycleStartEffect$lambda$14((LifecycleOwner) this.f1131b, (InterfaceC6471c) this.f1132c, this.f1133d, this.f1134e, (Composer) obj, iIntValue);
            case 1:
                int iIntValue2 = ((Integer) obj2).intValue();
                return LifecycleEffectKt.LifecycleResumeEffect$lambda$29((LifecycleOwner) this.f1131b, (InterfaceC6471c) this.f1132c, this.f1133d, this.f1134e, (Composer) obj, iIntValue2);
            default:
                ((Integer) obj2).intValue();
                int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f1134e | 1);
                AbstractC4688y0.m4085c(this.f1133d, (String) this.f1131b, (InterfaceC6469a) this.f1132c, (Composer) obj, iUpdateChangedFlags);
                return C5443s.f8405a;
        }
    }

    public /* synthetic */ C2752c(LifecycleOwner lifecycleOwner, InterfaceC6471c interfaceC6471c, int i, int i8, int i9) {
        this.f1130a = i9;
        this.f1131b = lifecycleOwner;
        this.f1132c = interfaceC6471c;
        this.f1133d = i;
        this.f1134e = i8;
    }
}
