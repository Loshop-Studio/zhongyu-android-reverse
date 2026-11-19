package androidx.navigation.compose;

import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import com.zykj.mistake.feature.ask.AbstractC4539o0;
import com.zykj.mistake.feature.ask.C4549y;
import com.zykj.mistake.feature.collection.detail.AbstractC4575a;
import com.zykj.mistake.feature.collection.detail.MistakeCollectionDetailViewModel;
import com.zykj.mistake.feature.collection.filter.AbstractC4639a;
import com.zykj.mistake.feature.collection.filter.MistakeCollectionFilterResultViewModel;
import com.zykj.mistake.feature.collection.list.AbstractC4699a;
import com.zykj.mistake.feature.collection.list.MistakeCollectionViewModel;
import com.zykj.mistake.feature.notebook.detail.AbstractC4785e;
import com.zykj.mistake.feature.notebook.detail.AbstractC4798g0;
import com.zykj.mistake.feature.notebook.detail.AbstractC4874s4;
import com.zykj.mistake.feature.notebook.detail.AbstractC4875t;
import com.zykj.mistake.feature.notebook.detail.AbstractC4903x3;
import com.zykj.mistake.feature.notebook.detail.C4819j3;
import com.zykj.mistake.feature.notebook.detail.C4837m3;
import com.zykj.mistake.feature.notebook.detail.C4849o3;
import com.zykj.mistake.feature.notebook.detail.C4852p0;
import com.zykj.mistake.feature.notebook.detail.MistakeDetailNewContract$DetailTab;
import com.zykj.mistake.feature.notebook.detail.MistakeDetailNewViewModel;
import com.zykj.mistake.feature.review.AbstractC5017y;
import com.zykj.mistake.feature.review.C5001i;
import com.zykj.mistake.main.AbstractC5027c1;
import com.zykj.mistake.main.MainShellViewModel;
import p045d6.C5443s;
import p129o2.C6268a;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;
import p152r6.InterfaceC6474f;

/* renamed from: androidx.navigation.compose.b */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2840b implements InterfaceC6473e {

    /* renamed from: a */
    public final /* synthetic */ int f1204a;

    /* renamed from: b */
    public final /* synthetic */ int f1205b;

    /* renamed from: c */
    public final /* synthetic */ Object f1206c;

    /* renamed from: d */
    public final /* synthetic */ Object f1207d;

    public /* synthetic */ C2840b(int i, int i8, Object obj, Object obj2) {
        this.f1204a = i8;
        this.f1206c = obj;
        this.f1207d = obj2;
        this.f1205b = i;
    }

    @Override // p152r6.InterfaceC6473e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f1204a) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                break;
            case 1:
                int iIntValue2 = ((Integer) obj2).intValue();
                break;
            case 2:
                ((Integer) obj2).getClass();
                AbstractC4539o0.m4011i((C4549y) this.f1206c, (Modifier) this.f1207d, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.f1205b | 1));
                break;
            case 3:
                ((Integer) obj2).intValue();
                AbstractC4575a.m4035b((MainShellViewModel) this.f1206c, (MistakeCollectionDetailViewModel) this.f1207d, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.f1205b | 1));
                break;
            case 4:
                ((Integer) obj2).intValue();
                AbstractC4639a.m4073b((MainShellViewModel) this.f1206c, (MistakeCollectionFilterResultViewModel) this.f1207d, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.f1205b | 1));
                break;
            case 5:
                ((Integer) obj2).intValue();
                AbstractC4699a.m4092a((MistakeCollectionViewModel) this.f1206c, (MainShellViewModel) this.f1207d, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.f1205b | 1));
                break;
            case 6:
                ((Integer) obj2).intValue();
                AbstractC4785e.m4181a((MainShellViewModel) this.f1206c, (MistakeDetailNewViewModel) this.f1207d, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.f1205b | 1));
                break;
            case 7:
                ((Integer) obj2).intValue();
                AbstractC4875t.m4255k((C4852p0) this.f1206c, (InterfaceC6469a) this.f1207d, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.f1205b | 1));
                break;
            case 8:
                ((Integer) obj2).intValue();
                AbstractC4875t.m4262r((String) this.f1206c, (InterfaceC6474f) this.f1207d, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.f1205b | 1));
                break;
            case 9:
                ((Integer) obj2).intValue();
                AbstractC4875t.m4260p((C4819j3) this.f1206c, (InterfaceC6469a) this.f1207d, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.f1205b | 1));
                break;
            case 10:
                ((Integer) obj2).intValue();
                AbstractC4875t.m4263s((C4849o3) this.f1206c, (InterfaceC6469a) this.f1207d, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.f1205b | 1));
                break;
            case 11:
                ((Integer) obj2).intValue();
                AbstractC4875t.m4250f((MistakeDetailNewContract$DetailTab) this.f1206c, (InterfaceC6471c) this.f1207d, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.f1205b | 1));
                break;
            case 12:
                ((Integer) obj2).intValue();
                AbstractC4798g0.m4193g((InterfaceC6469a) this.f1206c, (InterfaceC6469a) this.f1207d, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.f1205b | 1));
                break;
            case 13:
                ((Integer) obj2).intValue();
                AbstractC4903x3.m4271a((C4837m3) this.f1206c, (InterfaceC6471c) this.f1207d, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.f1205b | 1));
                break;
            case 14:
                ((Integer) obj2).intValue();
                AbstractC4874s4.m4244d((String) this.f1206c, (InterfaceC6469a) this.f1207d, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.f1205b | 1));
                break;
            case 15:
                ((Integer) obj2).getClass();
                AbstractC5017y.m4337f((C5001i) this.f1206c, (InterfaceC6471c) this.f1207d, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.f1205b | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                AbstractC5027c1.m4361a((C6268a) this.f1206c, (Modifier) this.f1207d, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.f1205b | 1));
                break;
        }
        return C5443s.f8405a;
    }
}
