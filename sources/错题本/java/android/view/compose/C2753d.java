package android.view.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import com.zykj.mistake.feature.collection.filter.AbstractC4655i;
import com.zykj.mistake.main.drawer.AbstractC5036g;
import java.util.ArrayList;
import java.util.List;
import p045d6.C5443s;
import p152r6.InterfaceC6473e;

/* renamed from: androidx.lifecycle.compose.d */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2753d implements InterfaceC6473e {

    /* renamed from: a */
    public final /* synthetic */ int f1135a;

    /* renamed from: b */
    public final /* synthetic */ int f1136b;

    /* renamed from: c */
    public final /* synthetic */ int f1137c;

    /* renamed from: d */
    public final /* synthetic */ Object f1138d;

    /* renamed from: e */
    public final /* synthetic */ Object f1139e;

    /* renamed from: f */
    public final /* synthetic */ Object f1140f;

    public /* synthetic */ C2753d(int i, Object obj, int i8, Object obj2, int i9, Object obj3) {
        this.f1135a = i9;
        this.f1138d = obj;
        this.f1139e = obj2;
        this.f1140f = obj3;
        this.f1136b = i;
        this.f1137c = i8;
    }

    @Override // p152r6.InterfaceC6473e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f1135a) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                break;
            case 1:
                int iIntValue2 = ((Integer) obj2).intValue();
                break;
            case 2:
                ((Integer) obj2).getClass();
                AbstractC4655i.m4077c((String) this.f1138d, (ArrayList) this.f1139e, (String) this.f1140f, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.f1136b | 1), this.f1137c);
                break;
            default:
                ((Integer) obj2).getClass();
                AbstractC5036g.m4367d((String) this.f1138d, (List) this.f1139e, (String) this.f1140f, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.f1136b | 1), this.f1137c);
                break;
        }
        return C5443s.f8405a;
    }
}
