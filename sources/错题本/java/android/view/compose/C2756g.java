package android.view.compose;

import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.navigation.NavHostController;
import com.zykj.mistake.feature.ask.AbstractC4510a;
import com.zykj.mistake.feature.ask.C4520f;
import com.zykj.mistake.feature.ask.MistakeAskMaterialViewModel;
import com.zykj.mistake.feature.collection.detail.AbstractC4575a;
import com.zykj.mistake.feature.collection.detail.AbstractC4592f1;
import com.zykj.mistake.feature.collection.detail.C4632z0;
import com.zykj.mistake.feature.collection.detail.MistakeCollectionDetailViewModel;
import com.zykj.mistake.feature.collection.filter.AbstractC4639a;
import com.zykj.mistake.feature.collection.filter.MistakeCollectionFilterResultViewModel;
import com.zykj.mistake.feature.collection.list.AbstractC4704c0;
import com.zykj.mistake.feature.collection.list.C4723v;
import com.zykj.mistake.feature.collection.list.MistakeCollectionViewModel;
import com.zykj.mistake.feature.home.AbstractC4738k;
import com.zykj.mistake.feature.notebook.detail.AbstractC4822k0;
import com.zykj.mistake.feature.notebook.detail.AbstractC4862q4;
import com.zykj.mistake.feature.notebook.detail.AbstractC4874s4;
import com.zykj.mistake.feature.notebook.detail.AbstractC4875t;
import com.zykj.mistake.feature.notebook.detail.AbstractC4903x3;
import com.zykj.mistake.feature.notebook.detail.C4825k3;
import com.zykj.mistake.feature.notebook.detail.C4831l3;
import com.zykj.mistake.feature.notebook.detail.C4837m3;
import com.zykj.mistake.feature.notebook.detail.MistakeDetailNewViewModel;
import com.zykj.mistake.feature.notebook.list.AbstractC4953i1;
import com.zykj.mistake.feature.notebook.list.AbstractC4965m1;
import com.zykj.mistake.feature.notebook.list.C4941e1;
import com.zykj.mistake.feature.notebook.list.MistakeNotebookViewModel;
import com.zykj.mistake.main.MainShellViewModel;
import com.zykj.mistake.main.RemoveDialogTarget;
import p045d6.C5443s;
import p150r4.AbstractC6463c;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;
import p167t4.AbstractC6594g;
import p212z4.C6814a;
import p212z4.C6816c;
import p212z4.C6818e;
import p212z4.C6820g;

/* renamed from: androidx.lifecycle.compose.g */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2756g implements InterfaceC6473e {

    /* renamed from: a */
    public final /* synthetic */ int f1150a;

    /* renamed from: b */
    public final /* synthetic */ Object f1151b;

    /* renamed from: c */
    public final /* synthetic */ Object f1152c;

    /* renamed from: d */
    public final /* synthetic */ int f1153d;

    /* renamed from: e */
    public final /* synthetic */ Object f1154e;

    public /* synthetic */ C2756g(int i, int i8, Object obj, Object obj2, Object obj3) {
        this.f1150a = i8;
        this.f1151b = obj;
        this.f1154e = obj2;
        this.f1152c = obj3;
        this.f1153d = i;
    }

    @Override // p152r6.InterfaceC6473e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f1150a) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                break;
            case 1:
                int iIntValue2 = ((Integer) obj2).intValue();
                break;
            case 2:
                int iIntValue3 = ((Integer) obj2).intValue();
                break;
            case 3:
                ((Integer) obj2).intValue();
                AbstractC4510a.m3997a((MistakeAskMaterialViewModel) this.f1151b, (C4520f) this.f1154e, (C6814a) this.f1152c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.f1153d | 1));
                break;
            case 4:
                ((Integer) obj2).intValue();
                AbstractC4575a.m4034a((MistakeCollectionDetailViewModel) this.f1151b, (C6816c) this.f1154e, (MainShellViewModel) this.f1152c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.f1153d | 1));
                break;
            case 5:
                ((Integer) obj2).getClass();
                AbstractC4592f1.m4038a((C4632z0) this.f1151b, (Modifier) this.f1154e, (InterfaceC6471c) this.f1152c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.f1153d | 1));
                break;
            case 6:
                ((Integer) obj2).intValue();
                AbstractC4639a.m4072a((MistakeCollectionFilterResultViewModel) this.f1151b, (C6816c) this.f1154e, (MainShellViewModel) this.f1152c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.f1153d | 1));
                break;
            case 7:
                ((Integer) obj2).getClass();
                AbstractC4704c0.m4096d((C4723v) this.f1151b, (InterfaceC6471c) this.f1152c, (Modifier) this.f1154e, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.f1153d | 1));
                break;
            case 8:
                ((Integer) obj2).intValue();
                AbstractC4738k.m4104a((MainShellViewModel) this.f1151b, (MistakeNotebookViewModel) this.f1154e, (MistakeCollectionViewModel) this.f1152c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.f1153d | 1));
                break;
            case 9:
                ((Integer) obj2).intValue();
                AbstractC4875t.m4247c((String) this.f1151b, (String) this.f1154e, (InterfaceC6469a) this.f1152c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.f1153d | 1));
                break;
            case 10:
                ((Integer) obj2).intValue();
                AbstractC4822k0.m4198a((MistakeDetailNewViewModel) this.f1151b, (MainShellViewModel) this.f1154e, (C6818e) this.f1152c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.f1153d | 1));
                break;
            case 11:
                ((Integer) obj2).intValue();
                AbstractC4903x3.m4275e((C4831l3) this.f1151b, (InterfaceC6469a) this.f1154e, (InterfaceC6469a) this.f1152c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.f1153d | 1));
                break;
            case 12:
                ((Integer) obj2).getClass();
                AbstractC4862q4.m4230d((C4825k3) this.f1151b, (InterfaceC6471c) this.f1152c, (Modifier) this.f1154e, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.f1153d | 1));
                break;
            case 13:
                ((Integer) obj2).intValue();
                AbstractC4874s4.m4243c((C4837m3) this.f1151b, (InterfaceC6471c) this.f1152c, (InterfaceC6471c) this.f1154e, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.f1153d | 1));
                break;
            case 14:
                ((Integer) obj2).getClass();
                AbstractC4874s4.m4242b((Modifier) this.f1151b, (InterfaceC6469a) this.f1154e, (InterfaceC6469a) this.f1152c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.f1153d | 1));
                break;
            case 15:
                ((Integer) obj2).intValue();
                AbstractC4953i1.m4309f((C4941e1) this.f1151b, (InterfaceC6471c) this.f1152c, (InterfaceC6469a) this.f1154e, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.f1153d | 1));
                break;
            case 16:
                ((Integer) obj2).intValue();
                AbstractC4965m1.m4318a((MistakeNotebookViewModel) this.f1151b, (MainShellViewModel) this.f1154e, (C6820g) this.f1152c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.f1153d | 1));
                break;
            case 17:
                ((Integer) obj2).intValue();
                AbstractC6463c.m6126b((RemoveDialogTarget) this.f1151b, (InterfaceC6469a) this.f1154e, (InterfaceC6469a) this.f1152c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.f1153d | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                AbstractC6594g.m6225a((NavHostController) this.f1151b, (MainShellViewModel) this.f1154e, (Modifier) this.f1152c, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(this.f1153d | 1));
                break;
        }
        return C5443s.f8405a;
    }

    public /* synthetic */ C2756g(Object obj, InterfaceC6471c interfaceC6471c, Object obj2, int i, int i8) {
        this.f1150a = i8;
        this.f1151b = obj;
        this.f1152c = interfaceC6471c;
        this.f1154e = obj2;
        this.f1153d = i;
    }
}
