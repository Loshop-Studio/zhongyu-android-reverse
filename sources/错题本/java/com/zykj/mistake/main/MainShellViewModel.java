package com.zykj.mistake.main;

import android.view.ViewModel;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.navigation.C2856d;
import androidx.navigation.C2861i;
import androidx.navigation.internal.C2865d;
import com.zykj.mistake.entity.req.MistakeListReq;
import com.zykj.mistake.entity.resp.CustomTagInfo;
import com.zykj.mistake.feature.notebook.list.C4959k1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.AbstractC5805t;
import kotlin.collections.AbstractC5806u;
import kotlin.collections.builders.ListBuilder;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.AbstractC5855p;
import kotlinx.coroutines.flow.AbstractC5914h;
import kotlinx.coroutines.flow.C5901a0;
import kotlinx.coroutines.flow.C5911f0;
import kotlinx.coroutines.flow.C5946n0;
import kotlinx.coroutines.flow.C5960z;
import p137p4.C6382a;
import p152r6.InterfaceC6471c;

@StabilityInferred(parameters = 0)
@Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m5110d2 = {"Lcom/zykj/mistake/main/MainShellViewModel;", "Landroidx/lifecycle/ViewModel;", "<init>", "()V", "app_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nMainShellViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainShellViewModel.kt\ncom/zykj/mistake/main/MainShellViewModel\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,397:1\n230#2,5:398\n230#2,5:403\n230#2,5:408\n230#2,5:413\n230#2,5:418\n230#2,5:426\n230#2,5:431\n230#2,5:436\n230#2,5:441\n1761#3,3:423\n*S KotlinDebug\n*F\n+ 1 MainShellViewModel.kt\ncom/zykj/mistake/main/MainShellViewModel\n*L\n140#1:398,5\n151#1:403,5\n155#1:408,5\n171#1:413,5\n185#1:418,5\n286#1:426,5\n306#1:431,5\n357#1:436,5\n361#1:441,5\n244#1:423,3\n*E\n"})
/* loaded from: classes3.dex */
public final class MainShellViewModel extends ViewModel {

    /* renamed from: a */
    public final C5946n0 f7809a;

    /* renamed from: b */
    public final C5901a0 f7810b;

    /* renamed from: c */
    public final C5911f0 f7811c;

    /* renamed from: d */
    public final C5960z f7812d;

    /* renamed from: e */
    public final C5946n0 f7813e;

    /* renamed from: f */
    public final C5901a0 f7814f;

    /* renamed from: g */
    public C5066p f7815g;

    /* renamed from: h */
    public boolean f7816h;

    /* renamed from: i */
    public boolean f7817i;

    /* renamed from: j */
    public int f7818j;

    public MainShellViewModel() {
        C5946n0 c5946n0M5546b = AbstractC5914h.m5546b(new C5060m(C5022b.f7832a, null));
        this.f7809a = c5946n0M5546b;
        this.f7810b = new C5901a0(c5946n0M5546b);
        C5911f0 c5911f0M5545a = AbstractC5914h.m5545a(8, 5, null);
        this.f7811c = c5911f0M5545a;
        this.f7812d = new C5960z(c5911f0M5545a);
        C5946n0 c5946n0M5546b2 = AbstractC5914h.m5546b(null);
        this.f7813e = c5946n0M5546b2;
        this.f7814f = new C5901a0(c5946n0M5546b2);
    }

    /* renamed from: a */
    public final void m4353a() {
        C5946n0 c5946n0;
        Object value;
        do {
            c5946n0 = this.f7809a;
            value = c5946n0.getValue();
        } while (!c5946n0.m5569i(value, C5060m.m4378a((C5060m) value, C5022b.f7832a, null, 2)));
    }

    /* renamed from: b */
    public final void m4354b(AbstractC5057l abstractC5057l) {
        Object value;
        Object value2;
        Object value3;
        C5021a1 c5021a1;
        C5019a c5019a;
        Object value4;
        C5060m c5060mM4378a;
        Object value5;
        C5060m c5060mM4378a2;
        C5066p c5066p;
        Object value6;
        Object value7;
        C5060m c5060mM4378a3;
        Object value8;
        Object value9;
        if (abstractC5057l.equals(C5026c0.f7837a)) {
            m4353a();
            return;
        }
        boolean z8 = abstractC5057l instanceof C5071r0;
        C5946n0 c5946n0 = this.f7809a;
        if (z8) {
            List list = ((C5071r0) abstractC5057l).f7959a;
            do {
                value9 = c5946n0.getValue();
            } while (!c5946n0.m5569i(value9, C5060m.m4378a((C5060m) value9, new C5028d(new C5021a1(TagEditorTarget.NOTEBOOK, list, (List) null, 12)), null, 2)));
            return;
        }
        if (abstractC5057l instanceof C5065o0) {
            C5065o0 c5065o0 = (C5065o0) abstractC5057l;
            List list2 = c5065o0.f7937a;
            List list3 = c5065o0.f7938b;
            do {
                value8 = c5946n0.getValue();
            } while (!c5946n0.m5569i(value8, C5060m.m4378a((C5060m) value8, new C5028d(new C5021a1(TagEditorTarget.DETAIL, list2, list3, 8)), null, 2)));
            return;
        }
        if (abstractC5057l instanceof C5073s0) {
            List list4 = ((C5073s0) abstractC5057l).f7961a;
            do {
                value7 = c5946n0.getValue();
                c5060mM4378a3 = (C5060m) value7;
                AbstractC5057l abstractC5057l2 = c5060mM4378a3.f7930a;
                if (abstractC5057l2 instanceof C5028d) {
                    c5060mM4378a3 = C5060m.m4378a(c5060mM4378a3, new C5028d(C5021a1.m4360a(((C5028d) abstractC5057l2).f7838a, list4, null, 5)), null, 2);
                }
            } while (!c5946n0.m5569i(value7, c5060mM4378a3));
            return;
        }
        if (abstractC5057l instanceof C5069q0) {
            C5069q0 c5069q0 = (C5069q0) abstractC5057l;
            List list5 = c5069q0.f7956a;
            List list6 = c5069q0.f7957b;
            C5066p c5066p2 = this.f7815g;
            if (c5066p2 != null) {
                ArrayList arrayList = new ArrayList(AbstractC5806u.m5277p(list5, 10));
                Iterator it = list5.iterator();
                while (it.hasNext()) {
                    arrayList.add(Long.valueOf(((C6382a) it.next()).f10444a));
                }
                Set setM5221H0 = AbstractC5805t.m5221H0(arrayList);
                ArrayList arrayList2 = new ArrayList(AbstractC5806u.m5277p(list6, 10));
                Iterator it2 = list6.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(Long.valueOf(((CustomTagInfo) it2.next()).getId()));
                }
                Set setM5221H02 = AbstractC5805t.m5221H0(arrayList2);
                List list7 = c5066p2.f7950l;
                ArrayList arrayList3 = new ArrayList(AbstractC5806u.m5277p(list7, 10));
                Iterator it3 = list7.iterator();
                while (it3.hasNext()) {
                    arrayList3.add(Long.valueOf(((CustomTagInfo) it3.next()).getId()));
                }
                Set setM5221H03 = AbstractC5805t.m5221H0(arrayList3);
                Set set = c5066p2.f7945g;
                ArrayList arrayList4 = new ArrayList();
                for (Object obj : set) {
                    if (setM5221H0.contains(Long.valueOf(((Number) obj).longValue()))) {
                        arrayList4.add(obj);
                    }
                }
                Set setM5221H04 = AbstractC5805t.m5221H0(arrayList4);
                ArrayList arrayList5 = new ArrayList();
                for (Object obj2 : list6) {
                    CustomTagInfo customTagInfo = (CustomTagInfo) obj2;
                    if (setM5221H03.contains(Long.valueOf(customTagInfo.getId())) && setM5221H02.contains(Long.valueOf(customTagInfo.getId()))) {
                        arrayList5.add(obj2);
                    }
                }
                c5066p = C5066p.m4379a(c5066p2, list5, list6, 0, null, null, false, setM5221H04, null, null, null, false, arrayList5, 1980);
            } else {
                c5066p = new C5066p(list5, list6);
            }
            C5066p c5066p3 = c5066p;
            do {
                value6 = c5946n0.getValue();
            } while (!c5946n0.m5569i(value6, C5060m.m4378a((C5060m) value6, new C5025c(c5066p3), null, 2)));
            return;
        }
        if (abstractC5057l instanceof C5052i0) {
            m4353a();
            C5052i0 c5052i0 = (C5052i0) abstractC5057l;
            m4355c(new C5080w(c5052i0.f7923a, c5052i0.f7924b));
            return;
        }
        if (abstractC5057l instanceof C5048g0) {
            C5066p c5066p4 = ((C5048g0) abstractC5057l).f7914a;
            this.f7815g = c5066p4;
            m4353a();
            AbstractC5830k.m5330g(c5066p4, "<this>");
            MistakeListReq mistakeListReq = new MistakeListReq();
            mistakeListReq.setTimeType(c5066p4.f7941c);
            if (mistakeListReq.getTimeType() == 3) {
                mistakeListReq.setStartTime(c5066p4.f7942d);
                mistakeListReq.setEndTime(c5066p4.f7943e);
            }
            mistakeListReq.getTopicIds().addAll(c5066p4.f7945g);
            Integer num = c5066p4.f7946h;
            if (num != null) {
                mistakeListReq.getDiff().add(Integer.valueOf(num.intValue()));
            }
            Integer num2 = c5066p4.f7947i;
            if (num2 != null) {
                mistakeListReq.getAttainedLevel().add(Integer.valueOf(num2.intValue()));
            }
            Integer num3 = c5066p4.f7948j;
            if (num3 != null) {
                mistakeListReq.getErrorReason().add(Integer.valueOf(num3.intValue()));
            }
            ArrayList<Integer> tagIdList = mistakeListReq.getTagIdList();
            ListBuilder listBuilderM5278q = AbstractC5806u.m5278q();
            if (c5066p4.f7949k) {
                listBuilderM5278q.add(0);
            }
            Iterator it4 = c5066p4.f7950l.iterator();
            while (it4.hasNext()) {
                listBuilderM5278q.add(Integer.valueOf((int) ((CustomTagInfo) it4.next()).getId()));
            }
            tagIdList.addAll(listBuilderM5278q.build());
            mistakeListReq.setHaveNoTag(false);
            m4355c(new C5076u(mistakeListReq));
            return;
        }
        if (abstractC5057l.equals(C5081w0.f7970a)) {
            do {
                value5 = c5946n0.getValue();
                c5060mM4378a2 = (C5060m) value5;
                AbstractC5057l abstractC5057l3 = c5060mM4378a2.f7930a;
                if (abstractC5057l3 instanceof C5025c) {
                    C5066p c5066p5 = ((C5025c) abstractC5057l3).f7836a;
                    c5060mM4378a2 = C5060m.m4378a(c5060mM4378a2, new C5025c(new C5066p(c5066p5.f7939a, c5066p5.f7940b)), null, 2);
                }
            } while (!c5946n0.m5569i(value5, c5060mM4378a2));
            return;
        }
        if (abstractC5057l instanceof C5083x0) {
            if (((C5083x0) abstractC5057l).f7973a == 3) {
                m4356d();
                return;
            } else {
                m4357e(new C2861i(abstractC5057l, 15));
                return;
            }
        }
        if (abstractC5057l.equals(C5075t0.f7963a)) {
            m4356d();
            return;
        }
        if (abstractC5057l.equals(C5063n0.f7935a)) {
            m4358f(new C4959k1(7));
            return;
        }
        if (abstractC5057l instanceof C5067p0) {
            C5067p0 c5067p0 = (C5067p0) abstractC5057l;
            final long j7 = c5067p0.f7951a;
            final String str = c5067p0.f7952b;
            m4358f(new InterfaceC6471c() { // from class: com.zykj.mistake.main.n
                @Override // p152r6.InterfaceC6471c
                public final Object invoke(Object obj3) {
                    C5021a1 state = (C5021a1) obj3;
                    AbstractC5830k.m5330g(state, "state");
                    long j8 = j7;
                    String str2 = str;
                    return C5021a1.m4360a(state, null, new C5019a(j8, str2, str2, 24), 7);
                }
            });
            return;
        }
        if (abstractC5057l instanceof C5023b0) {
            m4358f(new C2865d(((C5023b0) abstractC5057l).f7833a, 4));
            return;
        }
        if (abstractC5057l.equals(C5058l0.f7928a)) {
            do {
                value4 = c5946n0.getValue();
                c5060mM4378a = (C5060m) value4;
                AbstractC5057l abstractC5057l4 = c5060mM4378a.f7930a;
                if (abstractC5057l4 instanceof C5028d) {
                    C5021a1 state = ((C5028d) abstractC5057l4).f7838a;
                    AbstractC5830k.m5330g(state, "state");
                    c5060mM4378a = C5060m.m4378a(c5060mM4378a, new C5028d(C5021a1.m4360a(state, null, null, 7)), null, 2);
                }
            } while (!c5946n0.m5569i(value4, c5060mM4378a));
            return;
        }
        if (abstractC5057l.equals(C5044e0.f7907a)) {
            AbstractC5057l abstractC5057l5 = ((C5060m) c5946n0.getValue()).f7930a;
            C5028d c5028d = abstractC5057l5 instanceof C5028d ? (C5028d) abstractC5057l5 : null;
            if (c5028d == null || (c5021a1 = c5028d.f7838a) == null || (c5019a = c5021a1.f7831d) == null || c5019a.f7827e) {
                return;
            }
            String string = AbstractC5855p.m5403k0(c5019a.f7825c).toString();
            if (string.length() == 0) {
                m4358f(new C2861i(c5019a, 16));
                return;
            }
            List<CustomTagInfo> list8 = c5021a1.f7829b;
            if (list8 == null || !list8.isEmpty()) {
                for (CustomTagInfo customTagInfo2 : list8) {
                    if (customTagInfo2.getId() != c5019a.f7823a && AbstractC5830k.m5325b(AbstractC5855p.m5403k0(customTagInfo2.getName()).toString(), string)) {
                        m4358f(new C4959k1(5));
                        return;
                    }
                }
            }
            m4358f(new C2856d(12, c5019a, string));
            long j8 = c5019a.f7823a;
            if (j8 == 0) {
                m4355c(new C5082x(c5021a1.f7828a, string));
                return;
            } else {
                m4355c(new C5084y(c5021a1.f7828a, c5019a.f7824b, string, j8));
                return;
            }
        }
        if (abstractC5057l.equals(C5054j0.f7926a)) {
            m4358f(new C4959k1(5));
            return;
        }
        if (abstractC5057l.equals(C5056k0.f7927a)) {
            m4358f(new C4959k1(6));
            return;
        }
        if (abstractC5057l instanceof C5085y0) {
            RemoveDialogTarget removeDialogTarget = ((C5085y0) abstractC5057l).f7978a;
            do {
                value3 = c5946n0.getValue();
            } while (!c5946n0.m5569i(value3, C5060m.m4378a((C5060m) value3, null, removeDialogTarget, 1)));
            return;
        }
        if (abstractC5057l.equals(C5061m0.f7932a)) {
            do {
                value2 = c5946n0.getValue();
            } while (!c5946n0.m5569i(value2, C5060m.m4378a((C5060m) value2, null, null, 1)));
            return;
        }
        if (abstractC5057l instanceof C5050h0) {
            RemoveDialogTarget removeDialogTarget2 = ((C5050h0) abstractC5057l).f7917a;
            do {
                value = c5946n0.getValue();
            } while (!c5946n0.m5569i(value, C5060m.m4378a((C5060m) value, null, null, 1)));
            int i = AbstractC5064o.f7936a[removeDialogTarget2.ordinal()];
            if (i == 1) {
                m4355c(C5078v.f7966a);
                return;
            } else if (i == 2) {
                m4355c(C5074t.f7962a);
                return;
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                m4355c(C5072s.f7960a);
                return;
            }
        }
        if (abstractC5057l instanceof C5046f0) {
            C5046f0 c5046f0 = (C5046f0) abstractC5057l;
            m4357e(new C2856d(11, c5046f0.f7910a, c5046f0.f7911b));
        } else {
            if (abstractC5057l.equals(C5079v0.f7967a)) {
                m4357e(new C4959k1(8));
                return;
            }
            if (abstractC5057l instanceof C5029d0) {
                C5029d0 c5029d0 = (C5029d0) abstractC5057l;
                m4355c(new C5068q(c5029d0.f7839a, c5029d0.f7840b, c5029d0.f7841c));
            } else {
                if (!(abstractC5057l instanceof C5077u0)) {
                    throw new NoWhenBranchMatchedException();
                }
                m4355c(new C5070r(((C5077u0) abstractC5057l).f7965a));
            }
        }
    }

    /* renamed from: c */
    public final void m4355c(AbstractC5020a0 abstractC5020a0) {
        this.f7811c.mo5527a(abstractC5020a0);
    }

    /* renamed from: d */
    public final void m4356d() {
        AbstractC5057l abstractC5057l = ((C5060m) this.f7809a.getValue()).f7930a;
        C5025c c5025c = abstractC5057l instanceof C5025c ? (C5025c) abstractC5057l : null;
        if (c5025c != null) {
            C5066p c5066p = c5025c.f7836a;
            m4355c(new C5086z(c5066p.f7942d, c5066p.f7943e));
        }
    }

    /* renamed from: e */
    public final void m4357e(InterfaceC6471c interfaceC6471c) {
        C5946n0 c5946n0;
        Object value;
        C5060m c5060mM4378a;
        do {
            c5946n0 = this.f7809a;
            value = c5946n0.getValue();
            c5060mM4378a = (C5060m) value;
            AbstractC5057l abstractC5057l = c5060mM4378a.f7930a;
            if (abstractC5057l instanceof C5025c) {
                C5066p draft = (C5066p) interfaceC6471c.invoke(((C5025c) abstractC5057l).f7836a);
                AbstractC5830k.m5330g(draft, "draft");
                c5060mM4378a = C5060m.m4378a(c5060mM4378a, new C5025c(draft), null, 2);
            }
        } while (!c5946n0.m5569i(value, c5060mM4378a));
    }

    /* renamed from: f */
    public final void m4358f(InterfaceC6471c interfaceC6471c) {
        C5946n0 c5946n0;
        Object value;
        C5060m c5060mM4378a;
        do {
            c5946n0 = this.f7809a;
            value = c5946n0.getValue();
            c5060mM4378a = (C5060m) value;
            AbstractC5057l abstractC5057l = c5060mM4378a.f7930a;
            if (abstractC5057l instanceof C5028d) {
                C5021a1 state = (C5021a1) interfaceC6471c.invoke(((C5028d) abstractC5057l).f7838a);
                AbstractC5830k.m5330g(state, "state");
                c5060mM4378a = C5060m.m4378a(c5060mM4378a, new C5028d(state), null, 2);
            }
        } while (!c5946n0.m5569i(value, c5060mM4378a));
    }
}
