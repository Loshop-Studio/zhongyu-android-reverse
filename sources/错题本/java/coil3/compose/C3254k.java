package coil3.compose;

import androidx.compose.p011ui.layout.Placeable;
import p045d6.C5443s;
import p152r6.InterfaceC6471c;

/* renamed from: coil3.compose.k */
/* loaded from: classes2.dex */
public final /* synthetic */ class C3254k implements InterfaceC6471c {

    /* renamed from: a */
    public final /* synthetic */ int f1877a;

    /* renamed from: b */
    public final /* synthetic */ Placeable f1878b;

    public /* synthetic */ C3254k(Placeable placeable, int i) {
        this.f1877a = i;
        this.f1878b = placeable;
    }

    @Override // p152r6.InterfaceC6471c
    public final Object invoke(Object obj) {
        int i = this.f1877a;
        C5443s c5443s = C5443s.f8405a;
        switch (i) {
            case 0:
                int i8 = ConstraintsSizeResolver.f1835c;
                Placeable.PlacementScope.place$default((Placeable.PlacementScope) obj, this.f1878b, 0, 0, 0.0f, 4, null);
                break;
            default:
                Placeable.PlacementScope.placeRelative$default((Placeable.PlacementScope) obj, this.f1878b, 0, 0, 0.0f, 4, null);
                break;
        }
        return c5443s;
    }
}
