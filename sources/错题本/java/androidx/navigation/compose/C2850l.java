package androidx.navigation.compose;

import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.navigation.NavHostController;
import java.util.Map;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;
import p207y6.InterfaceC6779c;

/* renamed from: androidx.navigation.compose.l */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2850l implements InterfaceC6473e {

    /* renamed from: a */
    public final /* synthetic */ int f1241a = 0;

    /* renamed from: b */
    public final /* synthetic */ NavHostController f1242b;

    /* renamed from: c */
    public final /* synthetic */ InterfaceC6779c f1243c;

    /* renamed from: d */
    public final /* synthetic */ Modifier f1244d;

    /* renamed from: e */
    public final /* synthetic */ Alignment f1245e;

    /* renamed from: f */
    public final /* synthetic */ Map f1246f;

    /* renamed from: g */
    public final /* synthetic */ InterfaceC6471c f1247g;

    /* renamed from: h */
    public final /* synthetic */ InterfaceC6471c f1248h;

    /* renamed from: i */
    public final /* synthetic */ InterfaceC6471c f1249i;

    /* renamed from: j */
    public final /* synthetic */ InterfaceC6471c f1250j;

    /* renamed from: k */
    public final /* synthetic */ InterfaceC6471c f1251k;

    /* renamed from: l */
    public final /* synthetic */ InterfaceC6471c f1252l;

    /* renamed from: m */
    public final /* synthetic */ int f1253m;

    /* renamed from: n */
    public final /* synthetic */ int f1254n;

    /* renamed from: o */
    public final /* synthetic */ int f1255o;

    /* renamed from: p */
    public final /* synthetic */ Object f1256p;

    public /* synthetic */ C2850l(NavHostController navHostController, Object obj, Modifier modifier, Alignment alignment, InterfaceC6779c interfaceC6779c, Map map, InterfaceC6471c interfaceC6471c, InterfaceC6471c interfaceC6471c2, InterfaceC6471c interfaceC6471c3, InterfaceC6471c interfaceC6471c4, InterfaceC6471c interfaceC6471c5, InterfaceC6471c interfaceC6471c6, int i, int i8, int i9) {
        this.f1242b = navHostController;
        this.f1256p = obj;
        this.f1244d = modifier;
        this.f1245e = alignment;
        this.f1243c = interfaceC6779c;
        this.f1246f = map;
        this.f1247g = interfaceC6471c;
        this.f1248h = interfaceC6471c2;
        this.f1249i = interfaceC6471c3;
        this.f1250j = interfaceC6471c4;
        this.f1251k = interfaceC6471c5;
        this.f1252l = interfaceC6471c6;
        this.f1253m = i;
        this.f1254n = i8;
        this.f1255o = i9;
    }

    @Override // p152r6.InterfaceC6473e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f1241a) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return NavHostKt.NavHost$lambda$25(this.f1242b, this.f1256p, this.f1244d, this.f1245e, this.f1243c, this.f1246f, this.f1247g, this.f1248h, this.f1249i, this.f1250j, this.f1251k, this.f1252l, this.f1253m, this.f1254n, this.f1255o, (Composer) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return NavHostKt.NavHost$lambda$19(this.f1242b, this.f1243c, this.f1244d, this.f1245e, (InterfaceC6779c) this.f1256p, this.f1246f, this.f1247g, this.f1248h, this.f1249i, this.f1250j, this.f1251k, this.f1252l, this.f1253m, this.f1254n, this.f1255o, (Composer) obj, iIntValue2);
        }
    }

    public /* synthetic */ C2850l(NavHostController navHostController, InterfaceC6779c interfaceC6779c, Modifier modifier, Alignment alignment, InterfaceC6779c interfaceC6779c2, Map map, InterfaceC6471c interfaceC6471c, InterfaceC6471c interfaceC6471c2, InterfaceC6471c interfaceC6471c3, InterfaceC6471c interfaceC6471c4, InterfaceC6471c interfaceC6471c5, InterfaceC6471c interfaceC6471c6, int i, int i8, int i9) {
        this.f1242b = navHostController;
        this.f1243c = interfaceC6779c;
        this.f1244d = modifier;
        this.f1245e = alignment;
        this.f1256p = interfaceC6779c2;
        this.f1246f = map;
        this.f1247g = interfaceC6471c;
        this.f1248h = interfaceC6471c2;
        this.f1249i = interfaceC6471c3;
        this.f1250j = interfaceC6471c4;
        this.f1251k = interfaceC6471c5;
        this.f1252l = interfaceC6471c6;
        this.f1253m = i;
        this.f1254n = i8;
        this.f1255o = i9;
    }
}
