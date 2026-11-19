package androidx.navigation.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.navigation.NavBackStackEntry;
import com.zykj.mistake.feature.ask.AbstractC4514c;
import com.zykj.mistake.feature.ask.AbstractC4539o0;
import com.zykj.mistake.feature.ask.C4536n;
import com.zykj.mistake.feature.collection.detail.AbstractC4592f1;
import com.zykj.mistake.feature.collection.detail.C4632z0;
import com.zykj.mistake.feature.review.AbstractC5002j;
import com.zykj.mistake.feature.review.ReviewViewModel;
import p045d6.C5443s;
import p152r6.InterfaceC6473e;
import p185v7.AbstractC6675d;

/* renamed from: androidx.navigation.compose.d */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2842d implements InterfaceC6473e {

    /* renamed from: a */
    public final /* synthetic */ int f1211a;

    /* renamed from: b */
    public final /* synthetic */ int f1212b;

    /* renamed from: c */
    public final /* synthetic */ Object f1213c;

    public /* synthetic */ C2842d(Object obj, int i, int i8) {
        this.f1211a = i8;
        this.f1213c = obj;
        this.f1212b = i;
    }

    @Override // p152r6.InterfaceC6473e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f1211a) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                break;
            case 1:
                ((Integer) obj2).intValue();
                AbstractC4514c.m4001a((NavBackStackEntry) this.f1213c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.f1212b | 1));
                break;
            case 2:
                ((Integer) obj2).intValue();
                AbstractC4539o0.m4009g((C4536n) this.f1213c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.f1212b | 1));
                break;
            case 3:
                ((Integer) obj2).intValue();
                AbstractC4592f1.m4039b((C4632z0) this.f1213c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.f1212b | 1));
                break;
            case 4:
                ((Integer) obj2).intValue();
                AbstractC5002j.m4322a((ReviewViewModel) this.f1213c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.f1212b | 1));
                break;
            default:
                InterfaceC6473e interfaceC6473e = (InterfaceC6473e) this.f1213c;
                ((Integer) obj2).intValue();
                AbstractC6675d.m6339a((Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.f1212b | 1), interfaceC6473e);
                break;
        }
        return C5443s.f8405a;
    }
}
