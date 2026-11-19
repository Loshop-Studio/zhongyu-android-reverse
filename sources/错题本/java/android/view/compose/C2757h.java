package android.view.compose;

import android.view.LifecycleOwner;
import androidx.compose.runtime.Composer;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;

/* renamed from: androidx.lifecycle.compose.h */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2757h implements InterfaceC6473e {

    /* renamed from: a */
    public final /* synthetic */ int f1155a;

    /* renamed from: b */
    public final /* synthetic */ Object f1156b;

    /* renamed from: c */
    public final /* synthetic */ Object f1157c;

    /* renamed from: d */
    public final /* synthetic */ LifecycleOwner f1158d;

    /* renamed from: e */
    public final /* synthetic */ InterfaceC6471c f1159e;

    /* renamed from: f */
    public final /* synthetic */ int f1160f;

    /* renamed from: g */
    public final /* synthetic */ int f1161g;

    public /* synthetic */ C2757h(Object obj, Object obj2, LifecycleOwner lifecycleOwner, InterfaceC6471c interfaceC6471c, int i, int i8, int i9) {
        this.f1155a = i9;
        this.f1156b = obj;
        this.f1157c = obj2;
        this.f1158d = lifecycleOwner;
        this.f1159e = interfaceC6471c;
        this.f1160f = i;
        this.f1161g = i8;
    }

    @Override // p152r6.InterfaceC6473e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f1155a) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return LifecycleEffectKt.LifecycleStartEffect$lambda$9(this.f1156b, this.f1157c, this.f1158d, this.f1159e, this.f1160f, this.f1161g, (Composer) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return LifecycleEffectKt.LifecycleResumeEffect$lambda$24(this.f1156b, this.f1157c, this.f1158d, this.f1159e, this.f1160f, this.f1161g, (Composer) obj, iIntValue2);
        }
    }
}
