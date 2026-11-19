package com.zykj.mistake.feature.collection.detail;

// RE note 本类字节码直接引用的读写或显示接口包括偏好设置。

import android.app.Application;
import android.view.AndroidViewModel;
import android.view.ViewModelKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.navigation.C2827b;
import androidx.navigation.C2861i;
import com.zykj.mistake.data.C4492a;
import com.zykj.mistake.entity.req.GetCollectionItemsReq;
import com.zykj.mistake.entity.req.SearchMistakeCollectionReq;
import com.zykj.mistake.feature.collection.filter.MistakeCollectionFilterResultContract$SourceType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.AbstractC5806u;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.AbstractC5855p;
import kotlin.text.AbstractC5862w;
import kotlinx.coroutines.AbstractC6014x;
import kotlinx.coroutines.channels.AbstractC5882k;
import kotlinx.coroutines.channels.C5873b;
import kotlinx.coroutines.flow.AbstractC5914h;
import kotlinx.coroutines.flow.C5901a0;
import kotlinx.coroutines.flow.C5904c;
import kotlinx.coroutines.flow.C5946n0;
import org.jetbrains.annotations.NotNull;
import p000a.AbstractC0000a;
import p129o2.C6268a;
import p137p4.C6383b;

@StabilityInferred(parameters = 0)
@Metadata(m5109d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m5110d2 = {"Lcom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "Landroid/app/Application;", "application", "<init>", "(Landroid/app/Application;)V", "app_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nMistakeCollectionDetailViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MistakeCollectionDetailViewModel.kt\ncom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailViewModel\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,663:1\n230#2,3:664\n233#2,2:668\n230#2,5:670\n230#2,5:675\n230#2,5:680\n230#2,5:685\n230#2,5:690\n230#2,5:695\n230#2,5:700\n230#2,5:705\n230#2,5:710\n230#2,5:715\n230#2,5:720\n230#2,5:725\n230#2,5:730\n230#2,5:735\n230#2,5:740\n230#2,5:745\n230#2,5:750\n230#2,5:755\n230#2,5:760\n230#2,5:765\n230#2,5:770\n230#2,5:775\n230#2,5:780\n230#2,5:785\n230#2,5:790\n230#2,5:795\n230#2,5:800\n230#2,5:805\n230#2,5:810\n230#2,5:830\n230#2,5:842\n230#2,3:847\n233#2,2:857\n230#2,5:859\n230#2,5:872\n230#2,5:877\n1#3:667\n1563#4:815\n1634#4,3:816\n360#4,7:819\n1563#4:826\n1634#4,3:827\n774#4:835\n865#4,2:836\n1563#4:838\n1634#4,3:839\n1788#4,4:850\n827#4:854\n855#4,2:855\n1563#4:864\n1634#4,3:865\n1563#4:868\n1634#4,3:869\n*S KotlinDebug\n*F\n+ 1 MistakeCollectionDetailViewModel.kt\ncom/zykj/mistake/feature/collection/detail/MistakeCollectionDetailViewModel\n*L\n52#1:664,3\n52#1:668,2\n114#1:670,5\n141#1:675,5\n151#1:680,5\n161#1:685,5\n172#1:690,5\n180#1:695,5\n190#1:700,5\n201#1:705,5\n205#1:710,5\n225#1:715,5\n228#1:720,5\n245#1:725,5\n248#1:730,5\n258#1:735,5\n271#1:740,5\n300#1:745,5\n304#1:750,5\n307#1:755,5\n316#1:760,5\n319#1:765,5\n322#1:770,5\n325#1:775,5\n328#1:780,5\n331#1:785,5\n334#1:790,5\n337#1:795,5\n362#1:800,5\n385#1:805,5\n395#1:810,5\n506#1:830,5\n552#1:842,5\n573#1:847,3\n573#1:857,2\n600#1:859,5\n616#1:872,5\n625#1:877,5\n448#1:815\n448#1:816,3\n474#1:819,7\n477#1:826\n477#1:827,3\n549#1:835\n549#1:836,2\n550#1:838\n550#1:839,3\n574#1:850,4\n575#1:854\n575#1:855,2\n604#1:864\n604#1:865,3\n610#1:868\n610#1:869,3\n*E\n"})
/* loaded from: classes3.dex */
public final class MistakeCollectionDetailViewModel extends AndroidViewModel {

    /* renamed from: a */
    public final C4492a f6435a;

    /* renamed from: b */
    public final C6268a f6436b;

    /* renamed from: c */
    public final C5946n0 f6437c;

    /* renamed from: d */
    public final C5901a0 f6438d;

    /* renamed from: e */
    public final C5873b f6439e;

    /* renamed from: f */
    public final C5904c f6440f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MistakeCollectionDetailViewModel(@NotNull Application application) {
        super(application);
        AbstractC5830k.m5330g(application, "application");
        this.f6435a = new C4492a(0);
        this.f6436b = new C6268a(10);
        boolean z8 = application.getSharedPreferences("zykjMistake", 0).getBoolean("SP_CONTACT_MODE", false);
        MistakeCollectionDetailContract$EntryMode mistakeCollectionDetailContract$EntryMode = MistakeCollectionDetailContract$EntryMode.EXISTING;
        MistakeCollectionDetailContract$DrawerMode mistakeCollectionDetailContract$DrawerMode = MistakeCollectionDetailContract$DrawerMode.INITIAL_FILTER;
        EmptyList emptyList = EmptyList.INSTANCE;
        EmptySet emptySet = EmptySet.INSTANCE;
        C5946n0 c5946n0M5546b = AbstractC5914h.m5546b(new C4632z0("", "错题集", 0, mistakeCollectionDetailContract$EntryMode, false, mistakeCollectionDetailContract$DrawerMode, emptyList, z8, false, false, false, true, emptyList, emptyList, 1, null, null, false, emptySet, null, null, null, 0, 1, false, false, emptySet, false, false, "", "", false, false, emptySet, false, false));
        this.f6437c = c5946n0M5546b;
        this.f6438d = new C5901a0(c5946n0M5546b);
        C5873b c5873bM5511a = AbstractC5882k.m5511a(0, 7, null);
        this.f6439e = c5873bM5511a;
        this.f6440f = AbstractC5914h.m5556l(c5873bM5511a);
    }

    /* renamed from: a */
    public final void m4024a() {
        Integer numM5410D;
        Object value;
        C5946n0 c5946n0 = this.f6437c;
        C4632z0 c4632z0 = (C4632z0) c5946n0.getValue();
        boolean z8 = c4632z0.f6544I;
        Set set = c4632z0.f6543H;
        if (z8 || set.isEmpty() || (numM5410D = AbstractC5862w.m5410D(c4632z0.f6546a)) == null) {
            return;
        }
        int iIntValue = numM5410D.intValue();
        List list = c4632z0.f6552g;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (set.contains(((C6383b) obj).f10446a)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(AbstractC5806u.m5277p(arrayList, 10));
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj2 = arrayList.get(i);
            i++;
            arrayList2.add(Integer.valueOf(((C6383b) obj2).f10448c));
        }
        if (arrayList2.isEmpty()) {
            return;
        }
        do {
            value = c5946n0.getValue();
        } while (!c5946n0.m5569i(value, C4632z0.m4054a((C4632z0) value, null, null, 0, null, false, null, null, false, false, false, false, false, null, null, 0, null, null, false, null, null, null, null, 0, 0, false, false, null, false, false, null, null, false, false, null, true, false, -1, 7)));
        AbstractC6014x.m5651v(ViewModelKt.getViewModelScope(this), null, null, new MistakeCollectionDetailViewModel$confirmDeleteSelected$2(this, iIntValue, arrayList2, null), 3);
    }

    /* renamed from: b */
    public final void m4025b() {
        Object value;
        C5946n0 c5946n0 = this.f6437c;
        String string = AbstractC5855p.m5403k0(((C4632z0) c5946n0.getValue()).f6539D).toString();
        if (((C4632z0) c5946n0.getValue()).f6541F) {
            return;
        }
        if (string.length() == 0) {
            AbstractC6014x.m5651v(ViewModelKt.getViewModelScope(this), null, null, new MistakeCollectionDetailViewModel$confirmEditName$1(this, null), 3);
            return;
        }
        do {
            value = c5946n0.getValue();
        } while (!c5946n0.m5569i(value, C4632z0.m4054a((C4632z0) value, null, null, 0, null, false, null, null, false, false, false, false, false, null, null, 0, null, null, false, null, null, null, null, 0, 0, false, false, null, false, false, null, "", true, false, null, false, false, Integer.MAX_VALUE, 30)));
        AbstractC6014x.m5651v(ViewModelKt.getViewModelScope(this), null, null, new MistakeCollectionDetailViewModel$confirmEditName$3(this, string, null), 3);
    }

    /* renamed from: c */
    public final void m4026c() {
        C4632z0 c4632z0 = (C4632z0) this.f6437c.getValue();
        SearchMistakeCollectionReq searchMistakeCollectionReq = new SearchMistakeCollectionReq();
        searchMistakeCollectionReq.setCollectionId(AbstractC5862w.m5410D(c4632z0.f6546a));
        searchMistakeCollectionReq.setTimeRange(c4632z0.f6560o);
        if (searchMistakeCollectionReq.getTimeRange() == 3) {
            searchMistakeCollectionReq.setStartTime(c4632z0.f6561p);
            searchMistakeCollectionReq.setEndTime(c4632z0.f6562q);
        }
        searchMistakeCollectionReq.getTopicIds().addAll(c4632z0.f6564s);
        Integer num = c4632z0.f6565t;
        if (num != null) {
            searchMistakeCollectionReq.getDiff().add(Integer.valueOf(num.intValue()));
        }
        Integer num2 = c4632z0.f6566u;
        if (num2 != null) {
            searchMistakeCollectionReq.getAttainedLevel().add(Integer.valueOf(num2.intValue()));
        }
        Integer num3 = c4632z0.f6567v;
        if (num3 != null) {
            searchMistakeCollectionReq.getErrorReason().add(Integer.valueOf(num3.intValue()));
        }
        searchMistakeCollectionReq.setCurrentCollectionStatus(c4632z0.f6568w);
        searchMistakeCollectionReq.setOtherCollectionStatus(c4632z0.f6569x);
        if (c4632z0.f6571z) {
            searchMistakeCollectionReq.getTagIdList().add(0);
        }
        ArrayList<Integer> tagIdList = searchMistakeCollectionReq.getTagIdList();
        Set set = c4632z0.f6536A;
        ArrayList arrayList = new ArrayList(AbstractC5806u.m5277p(set, 10));
        Iterator it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf((int) ((Number) it.next()).longValue()));
        }
        tagIdList.addAll(arrayList);
        searchMistakeCollectionReq.setSortType(0);
        searchMistakeCollectionReq.setSkipCount(0);
        searchMistakeCollectionReq.setMaxResultCount(20);
        String str = c4632z0.f6546a;
        String str2 = c4632z0.f6547b;
        int i = c4632z0.f6548c;
        int i8 = c4632z0.f6568w;
        boolean z8 = false;
        int i9 = c4632z0.f6569x;
        if (c4632z0.f6551f == MistakeCollectionDetailContract$DrawerMode.ADD_FILTER) {
            z8 = true;
        }
        m4033j(new C4597i(str, str2, i, searchMistakeCollectionReq, i8, i9, z8, c4632z0.f6549d == MistakeCollectionDetailContract$EntryMode.CREATED ? MistakeCollectionFilterResultContract$SourceType.CREATE_COLLECTION : MistakeCollectionFilterResultContract$SourceType.EXISTING_COLLECTION_ADD));
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x006e  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m4027d(com.zykj.mistake.feature.collection.detail.AbstractC4630y0 r48) {
        /*
            Method dump skipped, instructions count: 3150
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.mistake.feature.collection.detail.MistakeCollectionDetailViewModel.m4027d(com.zykj.mistake.feature.collection.detail.y0):void"); // DEX body: android/错题本/smali_classes3/com/zykj/mistake/feature/collection/detail/MistakeCollectionDetailViewModel.smali:1616
    }

    /* renamed from: e */
    public final void m4028e() {
        C5946n0 c5946n0;
        Object value;
        do {
            c5946n0 = this.f6437c;
            value = c5946n0.getValue();
        } while (!c5946n0.m5569i(value, C4632z0.m4054a((C4632z0) value, null, null, 0, null, false, null, null, false, false, false, false, false, null, null, 0, null, null, false, null, null, null, null, 0, 0, false, false, null, true, false, null, null, false, false, null, false, false, -268435457, 31)));
        AbstractC6014x.m5651v(ViewModelKt.getViewModelScope(this), null, null, new MistakeCollectionDetailViewModel$requestApi$2(new MistakeCollectionDetailViewModel$loadFilterOptions$2(this, null), new C2861i(this, 4), new C2827b(this, 7), null), 3);
    }

    /* renamed from: f */
    public final void m4029f(String str) {
        List list = ((C4632z0) this.f6437c.getValue()).f6552g;
        Iterator it = list.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (AbstractC5830k.m5325b(((C6383b) it.next()).f10446a, str)) {
                break;
            } else {
                i++;
            }
        }
        int i8 = i;
        if (i8 < 0) {
            return;
        }
        C6383b c6383b = (C6383b) list.get(i8);
        ArrayList arrayList = new ArrayList(AbstractC5806u.m5277p(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(AbstractC0000a.m14q((C6383b) it2.next()));
        }
        m4033j(new C4599j(c6383b.f10447b, c6383b.f10448c, c6383b.f10449d, c6383b.f10454i, c6383b.f10457l, c6383b.f10455j, EmptyList.INSTANCE, arrayList, i8));
    }

    /* renamed from: g */
    public final void m4030g(Set set) {
        C5946n0 c5946n0;
        Object value;
        int i;
        boolean z8;
        C4632z0 c4632z0M4054a;
        if (set.isEmpty()) {
            return;
        }
        do {
            c5946n0 = this.f6437c;
            value = c5946n0.getValue();
            C4632z0 c4632z0 = (C4632z0) value;
            List list = c4632z0.f6552g;
            if (list == null || !list.isEmpty()) {
                Iterator it = list.iterator();
                i = 0;
                while (it.hasNext()) {
                    if (set.contains(Integer.valueOf(((C6383b) it.next()).f10448c)) && (i = i + 1) < 0) {
                        AbstractC5806u.m5257K();
                        throw null;
                    }
                }
            } else {
                i = 0;
            }
            List list2 = c4632z0.f6552g;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list2) {
                if (!set.contains(Integer.valueOf(((C6383b) obj).f10448c))) {
                    arrayList.add(obj);
                }
            }
            z8 = i > 0;
            if (z8) {
                int i8 = c4632z0.f6548c - i;
                int i9 = i8 < 0 ? 0 : i8;
                c4632z0M4054a = C4632z0.m4054a(c4632z0, null, null, i9, null, false, null, arrayList, false, false, false, false, arrayList.size() < i9, null, null, 0, null, null, false, null, null, null, null, 0, 0, false, false, null, false, false, null, null, false, false, EmptySet.INSTANCE, false, false, -4229, 17);
            } else {
                c4632z0M4054a = C4632z0.m4054a(c4632z0, null, null, 0, null, false, null, null, false, false, false, false, false, null, null, 0, null, null, false, null, null, null, null, 0, 0, false, false, null, false, false, null, null, false, false, EmptySet.INSTANCE, false, false, -1, 17);
            }
        } while (!c5946n0.m5569i(value, c4632z0M4054a));
        if (z8) {
            m4033j(C4601k.f6505a);
        }
    }

    /* renamed from: h */
    public final void m4031h(boolean z8) {
        Object value;
        MistakeCollectionDetailViewModel mistakeCollectionDetailViewModel = this;
        C5946n0 c5946n0 = mistakeCollectionDetailViewModel.f6437c;
        C4632z0 c4632z0 = (C4632z0) c5946n0.getValue();
        Integer numM5410D = AbstractC5862w.m5410D(c4632z0.f6546a);
        if (numM5410D != null) {
            int iIntValue = numM5410D.intValue();
            int size = z8 ? 0 : c4632z0.f6552g.size();
            if (z8) {
                do {
                    value = c5946n0.getValue();
                } while (!c5946n0.m5569i(value, C4632z0.m4054a((C4632z0) value, null, null, 0, null, false, null, null, false, false, true, false, true, null, null, 0, null, null, false, null, null, null, null, 0, 0, false, false, null, false, false, null, null, false, false, EmptySet.INSTANCE, false, false, -7169, 25)));
            } else {
                while (true) {
                    Object value2 = c5946n0.getValue();
                    if (c5946n0.m5569i(value2, C4632z0.m4054a((C4632z0) value2, null, null, 0, null, false, null, null, false, false, false, true, false, null, null, 0, null, null, false, null, null, null, null, 0, 0, false, false, null, false, false, null, null, false, false, null, false, false, -2049, 31))) {
                        break;
                    } else {
                        mistakeCollectionDetailViewModel = this;
                    }
                }
            }
            AbstractC6014x.m5651v(ViewModelKt.getViewModelScope(mistakeCollectionDetailViewModel), null, null, new MistakeCollectionDetailViewModel$requestCollectionItems$3(mistakeCollectionDetailViewModel, new GetCollectionItemsReq(iIntValue, 0, 1, size, 20), size, z8, null), 3);
        }
    }

    /* renamed from: i */
    public final void m4032i() {
        Object value;
        EmptySet emptySet;
        C5946n0 c5946n0 = this.f6437c;
        int i = ((C4632z0) c5946n0.getValue()).f6551f == MistakeCollectionDetailContract$DrawerMode.ADD_FILTER ? 1 : 0;
        do {
            value = c5946n0.getValue();
            emptySet = EmptySet.INSTANCE;
        } while (!c5946n0.m5569i(value, C4632z0.m4054a((C4632z0) value, null, null, 0, null, false, null, null, false, false, false, false, false, null, null, 1, null, null, false, emptySet, null, null, null, i, 1, false, false, emptySet, false, false, null, null, false, false, null, false, false, -234848257, 31)));
    }

    /* renamed from: j */
    public final void m4033j(AbstractC4605m abstractC4605m) {
        AbstractC6014x.m5651v(ViewModelKt.getViewModelScope(this), null, null, new MistakeCollectionDetailViewModel$sendEffect$1(this, abstractC4605m, null), 3);
    }
}
