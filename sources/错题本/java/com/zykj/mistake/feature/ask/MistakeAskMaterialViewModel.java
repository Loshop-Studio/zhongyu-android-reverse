package com.zykj.mistake.feature.ask;

import android.app.Application;
import android.view.AndroidViewModel;
import android.view.ViewModelKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.AbstractC5805t;
import kotlin.collections.AbstractC5806u;
import kotlin.collections.AbstractC5810y;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.AbstractC5855p;
import kotlinx.coroutines.AbstractC6014x;
import kotlinx.coroutines.channels.AbstractC5882k;
import kotlinx.coroutines.channels.C5873b;
import kotlinx.coroutines.flow.AbstractC5914h;
import kotlinx.coroutines.flow.C5901a0;
import kotlinx.coroutines.flow.C5904c;
import kotlinx.coroutines.flow.C5946n0;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@Metadata(m5109d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m5110d2 = {"Lcom/zykj/mistake/feature/ask/MistakeAskMaterialViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "Landroid/app/Application;", "application", "<init>", "(Landroid/app/Application;)V", "app_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nMistakeAskMaterialViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MistakeAskMaterialViewModel.kt\ncom/zykj/mistake/feature/ask/MistakeAskMaterialViewModel\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,132:1\n230#2,5:133\n230#2,5:172\n230#2,5:185\n774#3:138\n865#3,2:139\n295#3,2:141\n1563#3:143\n1634#3,3:144\n1563#3:148\n1634#3,3:149\n1788#3,4:152\n295#3,2:156\n295#3,2:158\n1563#3:160\n1634#3,2:161\n1563#3:163\n1634#3,3:164\n1788#3,4:167\n1636#3:171\n1563#3:177\n1634#3,2:178\n1563#3:180\n1634#3,3:181\n1636#3:184\n1374#3:190\n1460#3,2:191\n774#3:193\n865#3,2:194\n1462#3,3:196\n1#4:147\n*S KotlinDebug\n*F\n+ 1 MistakeAskMaterialViewModel.kt\ncom/zykj/mistake/feature/ask/MistakeAskMaterialViewModel\n*L\n27#1:133,5\n98#1:172,5\n114#1:185,5\n37#1:138\n37#1:139,2\n38#1:141,2\n41#1:143\n41#1:144,3\n54#1:148\n54#1:149,3\n69#1:152,4\n77#1:156,2\n79#1:158,2\n85#1:160\n85#1:161,2\n89#1:163\n89#1:164,3\n93#1:167,4\n85#1:171\n108#1:177\n108#1:178,2\n109#1:180\n109#1:181,3\n108#1:184\n118#1:190\n118#1:191,2\n119#1:193\n119#1:194,2\n118#1:196,3\n*E\n"})
/* loaded from: classes3.dex */
public final class MistakeAskMaterialViewModel extends AndroidViewModel {

    /* renamed from: a */
    public final C5946n0 f6210a;

    /* renamed from: b */
    public final C5901a0 f6211b;

    /* renamed from: c */
    public final C5873b f6212c;

    /* renamed from: d */
    public final C5904c f6213d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MistakeAskMaterialViewModel(@NotNull Application application) {
        super(application);
        AbstractC5830k.m5330g(application, "application");
        C5946n0 c5946n0M5546b = AbstractC5914h.m5546b(new C4550z((ArrayList) null, (MistakeAskMaterialContract$MaterialType) null, 0, 31));
        this.f6210a = c5946n0M5546b;
        this.f6211b = new C5901a0(c5946n0M5546b);
        C5873b c5873bM5511a = AbstractC5882k.m5511a(0, 7, null);
        this.f6212c = c5873bM5511a;
        this.f6213d = AbstractC5914h.m5556l(c5873bM5511a);
    }

    /* renamed from: a */
    public final void m3995a(AbstractC4545u abstractC4545u) {
        Object value;
        Object next;
        Object next2;
        Object value2;
        C4550z c4550z;
        int i;
        int i8;
        Object obj;
        MistakeAskMaterialContract$MaterialType mistakeAskMaterialContract$MaterialType;
        int i9;
        boolean z8 = abstractC4545u instanceof C4541q;
        int i10 = 10;
        C5946n0 c5946n0 = this.f6210a;
        if (z8) {
            List list = ((C4541q) abstractC4545u).f6293a.f6235a;
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list) {
                if (!((C4534m) obj2).f6269b.isEmpty()) {
                    arrayList.add(obj2);
                }
            }
            int size = arrayList.size();
            int i11 = 0;
            while (true) {
                if (i11 >= size) {
                    obj = null;
                    break;
                }
                obj = arrayList.get(i11);
                i11++;
                if (((C4534m) obj).f6268a == MistakeAskMaterialContract$MaterialType.STEM) {
                    break;
                }
            }
            C4534m c4534m = (C4534m) obj;
            if (c4534m == null || (mistakeAskMaterialContract$MaterialType = c4534m.f6268a) == null) {
                C4534m c4534m2 = (C4534m) AbstractC5805t.m5229i0(arrayList);
                mistakeAskMaterialContract$MaterialType = c4534m2 != null ? c4534m2.f6268a : MistakeAskMaterialContract$MaterialType.STEM;
            }
            ArrayList arrayList2 = new ArrayList(AbstractC5806u.m5277p(arrayList, 10));
            int size2 = arrayList.size();
            int i12 = 0;
            while (i12 < size2) {
                Object obj3 = arrayList.get(i12);
                i12++;
                C4534m c4534m3 = (C4534m) obj3;
                List<C4548x> list2 = c4534m3.f6269b;
                ArrayList arrayList3 = new ArrayList(AbstractC5806u.m5277p(list2, i10));
                for (C4548x c4548x : list2) {
                    String str = c4548x.f6301a;
                    arrayList3.add(new C4549y(str, c4548x.f6302b, c4548x.f6303c, c4548x.f6304d, c4548x.f6305e, "", c4548x.f6306f, AbstractC5830k.m5325b(str, null)));
                    arrayList = arrayList;
                }
                ArrayList arrayList4 = arrayList;
                MistakeAskMaterialContract$MaterialType mistakeAskMaterialContract$MaterialType2 = c4534m3.f6268a;
                String title = mistakeAskMaterialContract$MaterialType2.getTitle();
                if (arrayList3.isEmpty()) {
                    i9 = 0;
                } else {
                    int size3 = arrayList3.size();
                    int i13 = 0;
                    int i14 = 0;
                    while (i14 < size3) {
                        Object obj4 = arrayList3.get(i14);
                        i14++;
                        if (((C4549y) obj4).f6314h && (i13 = i13 + 1) < 0) {
                            AbstractC5806u.m5257K();
                            throw null;
                        }
                    }
                    i9 = i13;
                }
                arrayList2.add(new C4536n(mistakeAskMaterialContract$MaterialType2, title, i9, arrayList3.size(), arrayList3));
                arrayList = arrayList4;
                i10 = 10;
            }
            int size4 = arrayList2.size();
            int i15 = 0;
            int i16 = 0;
            while (i16 < size4) {
                Object obj5 = arrayList2.get(i16);
                i16++;
                i15 += ((C4536n) obj5).f6276c;
            }
            C4550z c4550z2 = new C4550z(arrayList2, mistakeAskMaterialContract$MaterialType, i15, 24);
            c5946n0.getClass();
            c5946n0.m5571k(null, c4550z2);
            return;
        }
        ArrayList arrayList5 = null;
        if (!(abstractC4545u instanceof C4542r)) {
            if (!(abstractC4545u instanceof C4543s)) {
                if (abstractC4545u instanceof C4544t) {
                    C4544t c4544t = (C4544t) abstractC4545u;
                    String str2 = c4544t.f6297a;
                    String str3 = c4544t.f6298b;
                    if (AbstractC5855p.m5382P(str3)) {
                        return;
                    }
                    List<C4536n> list3 = ((C4550z) c5946n0.getValue()).f6315a;
                    ArrayList arrayList6 = new ArrayList(AbstractC5806u.m5277p(list3, 10));
                    for (C4536n c4536n : list3) {
                        List<C4549y> list4 = c4536n.f6278e;
                        ArrayList arrayList7 = new ArrayList(AbstractC5806u.m5277p(list4, 10));
                        for (C4549y c4549yM4016a : list4) {
                            if (AbstractC5830k.m5325b(c4549yM4016a.f6307a, str2)) {
                                c4549yM4016a = C4549y.m4016a(c4549yM4016a, str3, false, 223);
                            }
                            arrayList7.add(c4549yM4016a);
                        }
                        arrayList6.add(C4536n.m4002a(c4536n, 0, arrayList7, 15));
                    }
                    do {
                        value = c5946n0.getValue();
                    } while (!c5946n0.m5569i(value, C4550z.m4017a((C4550z) value, arrayList6, null, 0, 30)));
                    return;
                }
                if (abstractC4545u.equals(C4538o.f6281a)) {
                    m3996b(C4522g.f6239a);
                    return;
                }
                if (!abstractC4545u.equals(C4540p.f6292a)) {
                    throw new NoWhenBranchMatchedException();
                }
                List list5 = ((C4550z) c5946n0.getValue()).f6315a;
                ArrayList arrayList8 = new ArrayList();
                Iterator it = list5.iterator();
                while (it.hasNext()) {
                    List list6 = ((C4536n) it.next()).f6278e;
                    ArrayList arrayList9 = new ArrayList();
                    for (Object obj6 : list6) {
                        if (((C4549y) obj6).f6314h) {
                            arrayList9.add(obj6);
                        }
                    }
                    AbstractC5810y.m5291S(arrayList9, arrayList8);
                }
                if (arrayList8.isEmpty()) {
                    m3996b(new C4526i("至少选择一个素材"));
                    return;
                } else {
                    m3996b(new C4524h(arrayList8));
                    return;
                }
            }
            C4543s c4543s = (C4543s) abstractC4545u;
            MistakeAskMaterialContract$MaterialType mistakeAskMaterialContract$MaterialType3 = c4543s.f6295a;
            String str4 = c4543s.f6296b;
            C4550z c4550z3 = (C4550z) c5946n0.getValue();
            Iterator it2 = c4550z3.f6315a.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (((C4536n) next).f6274a == mistakeAskMaterialContract$MaterialType3) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            C4536n c4536n2 = (C4536n) next;
            if (c4536n2 != null) {
                Iterator it3 = c4536n2.f6278e.iterator();
                while (true) {
                    if (it3.hasNext()) {
                        next2 = it3.next();
                        if (AbstractC5830k.m5325b(((C4549y) next2).f6307a, str4)) {
                            break;
                        }
                    } else {
                        next2 = null;
                        break;
                    }
                }
                C4549y c4549y = (C4549y) next2;
                if (c4549y != null) {
                    if (!c4549y.f6314h && c4550z3.f6317c >= c4550z3.f6318d) {
                        m3996b(new C4526i("最多可选5张图片，请减少已选素材后重试。"));
                        return;
                    }
                    List<C4536n> list7 = c4550z3.f6315a;
                    ArrayList arrayList10 = new ArrayList(AbstractC5806u.m5277p(list7, 10));
                    for (C4536n c4536nM4002a : list7) {
                        if (c4536nM4002a.f6274a == mistakeAskMaterialContract$MaterialType3) {
                            List<C4549y> list8 = c4536nM4002a.f6278e;
                            ArrayList arrayList11 = new ArrayList(AbstractC5806u.m5277p(list8, 10));
                            for (C4549y c4549yM4016a2 : list8) {
                                if (AbstractC5830k.m5325b(c4549yM4016a2.f6307a, str4)) {
                                    c4549yM4016a2 = C4549y.m4016a(c4549yM4016a2, null, !c4549yM4016a2.f6314h, 127);
                                }
                                arrayList11.add(c4549yM4016a2);
                            }
                            if (arrayList11.isEmpty()) {
                                i8 = 0;
                            } else {
                                int size5 = arrayList11.size();
                                i8 = 0;
                                int i17 = 0;
                                while (i17 < size5) {
                                    Object obj7 = arrayList11.get(i17);
                                    i17++;
                                    if (((C4549y) obj7).f6314h && (i8 = i8 + 1) < 0) {
                                        AbstractC5806u.m5257K();
                                        throw null;
                                    }
                                }
                            }
                            c4536nM4002a = C4536n.m4002a(c4536nM4002a, i8, arrayList11, 11);
                        }
                        arrayList10.add(c4536nM4002a);
                    }
                    do {
                        value2 = c5946n0.getValue();
                        c4550z = (C4550z) value2;
                        int size6 = arrayList10.size();
                        int i18 = 0;
                        i = 0;
                        while (i18 < size6) {
                            Object obj8 = arrayList10.get(i18);
                            i18++;
                            i += ((C4536n) obj8).f6276c;
                        }
                    } while (!c5946n0.m5569i(value2, C4550z.m4017a(c4550z, arrayList10, null, i, 26)));
                    return;
                }
                return;
            }
            return;
        }
        while (true) {
            Object value3 = c5946n0.getValue();
            if (c5946n0.m5569i(value3, C4550z.m4017a((C4550z) value3, arrayList5, ((C4542r) abstractC4545u).f6294a, 0, 29))) {
                return;
            } else {
                arrayList5 = null;
            }
        }
    }

    /* renamed from: b */
    public final void m3996b(AbstractC4528j abstractC4528j) {
        AbstractC6014x.m5651v(ViewModelKt.getViewModelScope(this), null, null, new MistakeAskMaterialViewModel$sendEffect$1(this, abstractC4528j, null), 3);
    }
}
