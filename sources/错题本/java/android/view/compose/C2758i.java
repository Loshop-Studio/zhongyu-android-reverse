package android.view.compose;

import android.view.LifecycleOwner;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.navigation.NavHostController;
import androidx.navigation.compose.NavHostKt;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;

/* renamed from: androidx.lifecycle.compose.i */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2758i implements InterfaceC6473e {

    /* renamed from: a */
    public final /* synthetic */ int f1162a;

    /* renamed from: b */
    public final /* synthetic */ Object f1163b;

    /* renamed from: c */
    public final /* synthetic */ Object f1164c;

    /* renamed from: d */
    public final /* synthetic */ Object f1165d;

    /* renamed from: e */
    public final /* synthetic */ Object f1166e;

    /* renamed from: f */
    public final /* synthetic */ InterfaceC6471c f1167f;

    /* renamed from: g */
    public final /* synthetic */ int f1168g;

    /* renamed from: h */
    public final /* synthetic */ int f1169h;

    public /* synthetic */ C2758i(Object obj, Object obj2, Object obj3, Object obj4, InterfaceC6471c interfaceC6471c, int i, int i8, int i9) {
        this.f1162a = i9;
        this.f1163b = obj;
        this.f1164c = obj2;
        this.f1165d = obj3;
        this.f1166e = obj4;
        this.f1167f = interfaceC6471c;
        this.f1168g = i;
        this.f1169h = i8;
    }

    @Override // p152r6.InterfaceC6473e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f1162a) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return LifecycleEffectKt.LifecycleResumeEffect$lambda$26(this.f1163b, this.f1164c, this.f1165d, (LifecycleOwner) this.f1166e, this.f1167f, this.f1168g, this.f1169h, (Composer) obj, iIntValue);
            case 1:
                int iIntValue2 = ((Integer) obj2).intValue();
                return LifecycleEffectKt.LifecycleStartEffect$lambda$11(this.f1163b, this.f1164c, this.f1165d, (LifecycleOwner) this.f1166e, this.f1167f, this.f1168g, this.f1169h, (Composer) obj, iIntValue2);
            default:
                int iIntValue3 = ((Integer) obj2).intValue();
                return NavHostKt.NavHost$lambda$1((NavHostController) this.f1163b, (String) this.f1164c, (Modifier) this.f1165d, (String) this.f1166e, this.f1167f, this.f1168g, this.f1169h, (Composer) obj, iIntValue3);
        }
    }
}
