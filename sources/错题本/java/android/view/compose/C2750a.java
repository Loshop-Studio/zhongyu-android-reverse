package android.view.compose;

import coil3.network.AbstractC3315g;
import com.zykj.mistake.R;
import com.zykj.mistake.dialog.ImageDialogFragment;
import com.zykj.mistake.feature.ask.C4536n;
import com.zykj.mistake.feature.ask.C4543s;
import com.zykj.mistake.feature.ask.C4549y;
import com.zykj.mistake.feature.collection.detail.C4577a1;
import com.zykj.mistake.feature.notebook.detail.AbstractC4798g0;
import com.zykj.mistake.feature.notebook.detail.AbstractC4823k1;
import com.zykj.mistake.feature.notebook.detail.C4764a5;
import com.zykj.mistake.feature.notebook.detail.C4774c1;
import com.zykj.mistake.feature.notebook.detail.C4807h3;
import com.zykj.mistake.feature.notebook.detail.C4837m3;
import com.zykj.mistake.feature.notebook.detail.C4900x0;
import com.zykj.mistake.feature.notebook.detail.C4908y2;
import com.zykj.mistake.feature.notebook.detail.MistakeDetailNewViewModel;
import com.zykj.mistake.feature.notebook.list.C4941e1;
import com.zykj.mistake.feature.notebook.list.C4961l0;
import com.zykj.mistake.feature.notebook.list.C4986x;
import com.zykj.mistake.feature.notebook.list.MistakeNotebookViewModel;
import com.zykj.mistake.main.C5022b;
import com.zykj.mistake.main.C5026c0;
import com.zykj.mistake.main.C5060m;
import com.zykj.mistake.main.MainShellViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.AbstractC5806u;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.AbstractC5830k;
import kotlinx.coroutines.flow.C5946n0;
import p045d6.C5443s;
import p137p4.C6383b;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;

/* renamed from: androidx.lifecycle.compose.a */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2750a implements InterfaceC6469a {

    /* renamed from: a */
    public final /* synthetic */ int f1120a;

    /* renamed from: b */
    public final /* synthetic */ Object f1121b;

    /* renamed from: c */
    public final /* synthetic */ Object f1122c;

    /* renamed from: d */
    public final /* synthetic */ Object f1123d;

    public /* synthetic */ C2750a(MainShellViewModel mainShellViewModel, InterfaceC6469a interfaceC6469a, InterfaceC6469a interfaceC6469a2) {
        this.f1120a = 7;
        this.f1121b = mainShellViewModel;
        this.f1123d = interfaceC6469a;
        this.f1122c = interfaceC6469a2;
    }

    @Override // p152r6.InterfaceC6469a
    public final Object invoke() {
        Set set;
        C4961l0 c4961l0;
        C4941e1 c4941e1;
        Iterator it;
        switch (this.f1120a) {
            case 0:
                break;
            case 1:
                ((InterfaceC6471c) this.f1121b).invoke(new C4543s(((C4536n) this.f1122c).f6274a, ((C4549y) this.f1123d).f6307a));
                break;
            case 2:
                ((InterfaceC6473e) this.f1121b).invoke((String) this.f1122c, (String) this.f1123d);
                break;
            case 3:
                C4837m3 c4837m3 = (C4837m3) this.f1121b;
                InterfaceC6471c interfaceC6471c = (InterfaceC6471c) this.f1122c;
                C4764a5 c4764a5 = (C4764a5) this.f1123d;
                if (!c4837m3.f7133M) {
                    boolean z8 = c4837m3.f7132L;
                    C4807h3 c4807h3 = C4807h3.f7015a;
                    if (!z8 || AbstractC4798g0.m4197k(c4837m3)) {
                        interfaceC6471c.invoke(c4807h3);
                    } else {
                        c4764a5.m4175k(new C4577a1(interfaceC6471c, 27));
                    }
                }
                break;
            case 4:
                MistakeDetailNewViewModel mistakeDetailNewViewModel = (MistakeDetailNewViewModel) this.f1121b;
                AbstractC4823k1 abstractC4823k1 = (AbstractC4823k1) this.f1122c;
                ImageDialogFragment imageDialogFragment = (ImageDialogFragment) this.f1123d;
                mistakeDetailNewViewModel.m4162t(new C4908y2(((C4774c1) abstractC4823k1).f6939a));
                imageDialogFragment.dismiss();
                break;
            case 5:
                MistakeDetailNewViewModel mistakeDetailNewViewModel2 = (MistakeDetailNewViewModel) this.f1121b;
                C4837m3 c4837m32 = (C4837m3) this.f1122c;
                String str = (String) this.f1123d;
                C5946n0 c5946n0 = mistakeDetailNewViewModel2.f6876e;
                int i = ((C4837m3) c5946n0.getValue()).f7149b;
                int i8 = c4837m32.f7149b;
                C4900x0 c4900x0 = C4900x0.f7400a;
                if (i != i8) {
                    mistakeDetailNewViewModel2.m4144S(c4900x0);
                } else {
                    mistakeDetailNewViewModel2.m4137J(str);
                    mistakeDetailNewViewModel2.m4144S(c4900x0);
                    mistakeDetailNewViewModel2.m4145T((C4837m3) c5946n0.getValue());
                }
                break;
            case 6:
                C4941e1 c4941e12 = (C4941e1) this.f1121b;
                MistakeNotebookViewModel mistakeNotebookViewModel = (MistakeNotebookViewModel) this.f1122c;
                C4961l0 c4961l02 = (C4961l0) this.f1123d;
                Set set2 = c4941e12.f7510j;
                C5946n0 c5946n02 = mistakeNotebookViewModel.f7448d;
                while (true) {
                    Object value = c5946n02.getValue();
                    C4941e1 c4941e13 = (C4941e1) value;
                    List list = c4941e13.f7504d;
                    ArrayList arrayList = new ArrayList(AbstractC5806u.m5277p(list, 10));
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        C6383b c6383b = (C6383b) it2.next();
                        if (set2.contains(c6383b.f10446a)) {
                            ArrayList arrayList2 = c4961l02.f7579e;
                            String id = c6383b.f10446a;
                            int i9 = c6383b.f10447b;
                            int i10 = c6383b.f10448c;
                            c4941e1 = c4941e13;
                            it = it2;
                            long j7 = c6383b.f10449d;
                            AbstractC3315g abstractC3315g = c6383b.f10450e;
                            String subject = c6383b.f10451f;
                            set = set2;
                            String examName = c6383b.f10452g;
                            c4961l0 = c4961l02;
                            String title = c6383b.f10453h;
                            String stemShoot = c6383b.f10454i;
                            boolean z9 = c6383b.f10455j;
                            boolean z10 = c6383b.f10456k;
                            boolean z11 = c6383b.f10457l;
                            boolean z12 = c6383b.f10458m;
                            boolean z13 = c6383b.f10459n;
                            Set collectionIds = c6383b.f10460o;
                            int i11 = c6383b.f10462q;
                            int i12 = c6383b.f10463r;
                            String str2 = c6383b.f10464s;
                            AbstractC5830k.m5330g(id, "id");
                            AbstractC5830k.m5330g(subject, "subject");
                            AbstractC5830k.m5330g(examName, "examName");
                            AbstractC5830k.m5330g(title, "title");
                            AbstractC5830k.m5330g(stemShoot, "stemShoot");
                            AbstractC5830k.m5330g(collectionIds, "collectionIds");
                            c6383b = new C6383b(id, i9, i10, j7, abstractC3315g, subject, examName, title, stemShoot, z9, z10, z11, z12, z13, collectionIds, arrayList2, i11, i12, str2);
                        } else {
                            set = set2;
                            c4961l0 = c4961l02;
                            c4941e1 = c4941e13;
                            it = it2;
                        }
                        arrayList.add(c6383b);
                        c4941e13 = c4941e1;
                        it2 = it;
                        set2 = set;
                        c4961l02 = c4961l0;
                    }
                    Set set3 = set2;
                    C4961l0 c4961l03 = c4961l02;
                    if (c5946n02.m5569i(value, C4941e1.m4303a(c4941e13, 0, 0, false, arrayList, false, false, false, false, EmptySet.INSTANCE, null, null, null, false, null, null, null, false, false, null, null, false, null, false, 33553655))) {
                        String string = mistakeNotebookViewModel.getApplication().getString(R.string.set_tag_success);
                        AbstractC5830k.m5329f(string, "getString(...)");
                        mistakeNotebookViewModel.m4296h(new C4986x(string));
                        break;
                    } else {
                        set2 = set3;
                        c4961l02 = c4961l03;
                    }
                }
            default:
                MainShellViewModel mainShellViewModel = (MainShellViewModel) this.f1121b;
                InterfaceC6469a interfaceC6469a = (InterfaceC6469a) this.f1123d;
                InterfaceC6469a interfaceC6469a2 = (InterfaceC6469a) this.f1122c;
                if (!(((C5060m) mainShellViewModel.f7809a.getValue()).f7930a instanceof C5022b)) {
                    mainShellViewModel.m4354b(C5026c0.f7837a);
                } else if (!((Boolean) interfaceC6469a.invoke()).booleanValue()) {
                    interfaceC6469a2.invoke();
                }
                break;
        }
        return C5443s.f8405a;
    }

    public /* synthetic */ C2750a(Object obj, Object obj2, int i, Object obj3) {
        this.f1120a = i;
        this.f1121b = obj;
        this.f1122c = obj2;
        this.f1123d = obj3;
    }
}
