package p070b.p146d.p152b;

import com.zykj.satisfaction.MainActivity;
import p070b.p146d.p147a.p150d.p151c.C0893c;
import p160d.C0994d;
import p160d.p162f.p163a.InterfaceC1006b;
import p160d.p162f.p164b.AbstractC1012e;
import p160d.p162f.p164b.C1011d;

/* renamed from: b.d.b.f */
/* loaded from: classes.dex */
public final class C0899f extends AbstractC1012e implements InterfaceC1006b<C0893c, C0994d> {

    /* renamed from: b */
    public final /* synthetic */ MainActivity f4750b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0899f(MainActivity mainActivity) {
        super(1);
        this.f4750b = mainActivity;
    }

    @Override // p160d.p162f.p163a.InterfaceC1006b
    /* renamed from: c */
    public C0994d mo2586c(C0893c c0893c) {
        C0893c c0893c2 = c0893c;
        C1011d.m2809e(c0893c2, "it");
        MainActivity mainActivity = this.f4750b;
        mainActivity.f5443r = c0893c2;
        MainActivity.m2792v(mainActivity);
        return C0994d.f5474a;
    }
}
