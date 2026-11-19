package com.zykj.mistake.feature.collection.list;

import android.view.ViewModel;
import android.view.ViewModelKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.zykj.mistake.data.C4492a;
import com.zykj.mistake.feature.collection.detail.MistakeCollectionDetailContract$EntryMode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.AbstractC5805t;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.AbstractC5855p;
import kotlin.text.AbstractC5862w;
import kotlinx.coroutines.AbstractC6014x;
import kotlinx.coroutines.C5976k1;
import kotlinx.coroutines.channels.AbstractC5882k;
import kotlinx.coroutines.channels.C5873b;
import kotlinx.coroutines.flow.AbstractC5914h;
import kotlinx.coroutines.flow.C5901a0;
import kotlinx.coroutines.flow.C5904c;
import kotlinx.coroutines.flow.C5946n0;
import p185v7.AbstractC6675d;

@StabilityInferred(parameters = 0)
@Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m5110d2 = {"Lcom/zykj/mistake/feature/collection/list/MistakeCollectionViewModel;", "Landroidx/lifecycle/ViewModel;", "<init>", "()V", "app_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nMistakeCollectionViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MistakeCollectionViewModel.kt\ncom/zykj/mistake/feature/collection/list/MistakeCollectionViewModel\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,255:1\n230#2,5:256\n230#2,5:261\n230#2,5:266\n230#2,5:271\n230#2,5:276\n230#2,5:281\n230#2,5:286\n230#2,5:293\n230#2,5:311\n295#3,2:291\n1617#3,9:298\n1869#3:307\n1870#3:309\n1626#3:310\n1#4:308\n*S KotlinDebug\n*F\n+ 1 MistakeCollectionViewModel.kt\ncom/zykj/mistake/feature/collection/list/MistakeCollectionViewModel\n*L\n35#1:256,5\n45#1:261,5\n55#1:266,5\n69#1:271,5\n119#1:276,5\n127#1:281,5\n143#1:286,5\n169#1:293,5\n201#1:311,5\n151#1:291,2\n176#1:298,9\n176#1:307\n176#1:309\n176#1:310\n176#1:308\n*E\n"})
/* loaded from: classes3.dex */
public final class MistakeCollectionViewModel extends ViewModel {

    /* renamed from: a */
    public final C4492a f6734a = new C4492a(0);

    /* renamed from: b */
    public final C5946n0 f6735b;

    /* renamed from: c */
    public final C5901a0 f6736c;

    /* renamed from: d */
    public final C5873b f6737d;

    /* renamed from: e */
    public final C5904c f6738e;

    /* renamed from: f */
    public C5976k1 f6739f;

    /* renamed from: g */
    public int f6740g;

    public MistakeCollectionViewModel() {
        C5946n0 c5946n0M5546b = AbstractC5914h.m5546b(new C4723v());
        this.f6735b = c5946n0M5546b;
        this.f6736c = new C5901a0(c5946n0M5546b);
        C5873b c5873bM5511a = AbstractC5882k.m5511a(0, 7, null);
        this.f6737d = c5873bM5511a;
        this.f6738e = AbstractC5914h.m5556l(c5873bM5511a);
    }

    /* renamed from: a */
    public final void m4089a(AbstractC4722u abstractC4722u) {
        Object value;
        Object value2;
        C4723v c4723v;
        Set setM5220G0;
        Object value3;
        Object value4;
        Object value5;
        Object value6;
        Object value7;
        Object value8;
        boolean zEquals = abstractC4722u.equals(C4710i.f6762a);
        C5946n0 c5946n0 = this.f6735b;
        if (zEquals) {
            do {
                value8 = c5946n0.getValue();
            } while (!c5946n0.m5569i(value8, C4723v.m4099a((C4723v) value8, 0, null, false, true, "", "", false, false, null, 3135)));
            return;
        }
        if (abstractC4722u.equals(C4717p.f6769a)) {
            do {
                value7 = c5946n0.getValue();
            } while (!c5946n0.m5569i(value7, C4723v.m4099a((C4723v) value7, 0, null, false, false, "", "", false, false, null, 3135)));
            return;
        }
        if (abstractC4722u instanceof C4712k) {
            do {
                value6 = c5946n0.getValue();
            } while (!c5946n0.m5569i(value6, C4723v.m4099a((C4723v) value6, 0, null, false, false, AbstractC5855p.m5401i0(20, ((C4712k) abstractC4722u).f6764a), "", false, false, null, 3711)));
            return;
        }
        Object obj = null;
        if (abstractC4722u.equals(C4714m.f6766a)) {
            String string = AbstractC5855p.m5403k0(((C4723v) c5946n0.getValue()).f6781h).toString();
            if (((C4723v) c5946n0.getValue()).f6783j) {
                return;
            }
            if (string.length() == 0) {
                m4091c(new C4707f("请输入错题集名称"));
                return;
            }
            do {
                value5 = c5946n0.getValue();
            } while (!c5946n0.m5569i(value5, C4723v.m4099a((C4723v) value5, 0, null, false, false, null, "", true, false, null, 3327)));
            AbstractC6014x.m5651v(ViewModelKt.getViewModelScope(this), null, null, new MistakeCollectionViewModel$dispatch$5(this, string, null), 3);
            return;
        }
        if (abstractC4722u instanceof C4709h) {
            int i = ((C4709h) abstractC4722u).f6761a;
            if (this.f6740g == i) {
                return;
            }
            this.f6740g = i;
            do {
                value4 = c5946n0.getValue();
            } while (!c5946n0.m5569i(value4, new C4723v()));
            m4090b();
            return;
        }
        if (abstractC4722u.equals(C4720s.f6772a)) {
            m4090b();
            return;
        }
        if (abstractC4722u.equals(C4718q.f6770a)) {
            return;
        }
        if (abstractC4722u instanceof C4719r) {
            do {
                value3 = c5946n0.getValue();
            } while (!c5946n0.m5569i(value3, C4723v.m4099a((C4723v) value3, 0, null, false, false, null, null, false, true, AbstractC6675d.m6354t(((C4719r) abstractC4722u).f6771a), 1023)));
            return;
        }
        if (abstractC4722u instanceof C4721t) {
            do {
                value2 = c5946n0.getValue();
                c4723v = (C4723v) value2;
                setM5220G0 = AbstractC5805t.m5220G0(c4723v.f6785l);
                String str = ((C4721t) abstractC4722u).f6773a;
                if (!setM5220G0.add(str)) {
                    setM5220G0.remove(str);
                }
            } while (!c5946n0.m5569i(value2, C4723v.m4099a(c4723v, 0, null, false, false, null, null, false, false, setM5220G0, 2047)));
            return;
        }
        if (abstractC4722u.equals(C4716o.f6768a)) {
            m4091c(C4706e.f6759a);
            return;
        }
        if (abstractC4722u.equals(C4715n.f6767a)) {
            Set set = ((C4723v) c5946n0.getValue()).f6785l;
            ArrayList arrayList = new ArrayList();
            Iterator it = set.iterator();
            while (it.hasNext()) {
                Integer numM5410D = AbstractC5862w.m5410D((String) it.next());
                if (numM5410D != null) {
                    arrayList.add(numM5410D);
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            AbstractC6014x.m5651v(ViewModelKt.getViewModelScope(this), null, null, new MistakeCollectionViewModel$removeSelectedCollections$1(this, arrayList, set, null), 3);
            return;
        }
        if (abstractC4722u.equals(C4711j.f6763a)) {
            do {
                value = c5946n0.getValue();
            } while (!c5946n0.m5569i(value, C4723v.m4099a((C4723v) value, 0, null, false, false, null, null, false, false, EmptySet.INSTANCE, 1023)));
            return;
        }
        if (!(abstractC4722u instanceof C4713l)) {
            throw new NoWhenBranchMatchedException();
        }
        Iterator it2 = ((C4723v) c5946n0.getValue()).f6776c.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            if (AbstractC5830k.m5325b(((C4701b) next).f6746a, ((C4713l) abstractC4722u).f6765a)) {
                obj = next;
                break;
            }
        }
        C4701b c4701b = (C4701b) obj;
        if (c4701b == null) {
            return;
        }
        m4091c(new C4705d(c4701b.f6746a, c4701b.f6747b, c4701b.f6748c, MistakeCollectionDetailContract$EntryMode.EXISTING));
    }

    /* renamed from: b */
    public final void m4090b() {
        C5946n0 c5946n0;
        Object value;
        if (this.f6740g == 0) {
            return;
        }
        C5976k1 c5976k1 = this.f6739f;
        if (c5976k1 != null) {
            c5976k1.cancel(null);
        }
        do {
            c5946n0 = this.f6735b;
            value = c5946n0.getValue();
        } while (!c5946n0.m5569i(value, C4723v.m4099a((C4723v) value, 0, null, true, false, null, null, false, false, EmptySet.INSTANCE, 967)));
        this.f6739f = AbstractC6014x.m5651v(ViewModelKt.getViewModelScope(this), null, null, new MistakeCollectionViewModel$requestCollections$2(this, null), 3);
    }

    /* renamed from: c */
    public final void m4091c(AbstractC4708g abstractC4708g) {
        AbstractC6014x.m5651v(ViewModelKt.getViewModelScope(this), null, null, new MistakeCollectionViewModel$sendEffect$1(this, abstractC4708g, null), 3);
    }
}
