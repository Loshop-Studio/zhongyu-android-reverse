package com.zykj.mistake.feature.collection.filter;

import android.view.ViewModel;
import android.view.ViewModelKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.navigation.C2827b;
import androidx.navigation.C2861i;
import com.zykj.mistake.data.C4492a;
import com.zykj.mistake.entity.req.SearchMistakeCollectionReq;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.AbstractC5806u;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.AbstractC5862w;
import kotlinx.coroutines.AbstractC6014x;
import kotlinx.coroutines.channels.AbstractC5882k;
import kotlinx.coroutines.channels.C5873b;
import kotlinx.coroutines.flow.AbstractC5914h;
import kotlinx.coroutines.flow.C5901a0;
import kotlinx.coroutines.flow.C5904c;
import kotlinx.coroutines.flow.C5946n0;
import p129o2.C6268a;

@StabilityInferred(parameters = 0)
@Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m5110d2 = {"Lcom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultViewModel;", "Landroidx/lifecycle/ViewModel;", "<init>", "()V", "app_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nMistakeCollectionFilterResultViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MistakeCollectionFilterResultViewModel.kt\ncom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultViewModel\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,516:1\n230#2,5:517\n230#2,3:522\n233#2,2:528\n230#2,5:530\n230#2,5:535\n230#2,5:540\n230#2,5:545\n230#2,5:550\n230#2,5:555\n230#2,5:560\n230#2,5:565\n230#2,5:570\n230#2,5:575\n230#2,5:580\n230#2,5:585\n230#2,5:590\n230#2,5:595\n230#2,5:600\n230#2,5:605\n230#2,5:610\n230#2,5:615\n230#2,3:620\n233#2,2:630\n230#2,3:632\n233#2,2:642\n230#2,5:644\n230#2,5:649\n230#2,5:659\n230#2,5:664\n230#2,5:669\n230#2,5:674\n230#2,5:687\n230#2,5:692\n1761#3,3:525\n774#3:623\n865#3,2:624\n1563#3:626\n1634#3,3:627\n774#3:635\n865#3,2:636\n1563#3:638\n1634#3,3:639\n1563#3:655\n1634#3,3:656\n1563#3:679\n1634#3,3:680\n1563#3:683\n1634#3,3:684\n1#4:654\n*S KotlinDebug\n*F\n+ 1 MistakeCollectionFilterResultViewModel.kt\ncom/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultViewModel\n*L\n41#1:517,5\n48#1:522,3\n48#1:528,2\n66#1:530,5\n71#1:535,5\n75#1:540,5\n80#1:545,5\n90#1:550,5\n111#1:555,5\n117#1:560,5\n128#1:565,5\n132#1:570,5\n135#1:575,5\n144#1:580,5\n147#1:585,5\n150#1:590,5\n153#1:595,5\n156#1:600,5\n159#1:605,5\n162#1:610,5\n165#1:615,5\n182#1:620,3\n182#1:630,2\n214#1:632,3\n214#1:642,2\n242#1:644,5\n262#1:649,5\n304#1:659,5\n313#1:664,5\n416#1:669,5\n490#1:674,5\n402#1:687,5\n404#1:692,5\n49#1:525,3\n203#1:623\n203#1:624,2\n203#1:626\n203#1:627,3\n228#1:635\n228#1:636,2\n228#1:638\n228#1:639,3\n289#1:655\n289#1:656,3\n396#1:679\n396#1:680,3\n399#1:683\n399#1:684,3\n*E\n"})
/* loaded from: classes3.dex */
public final class MistakeCollectionFilterResultViewModel extends ViewModel {

    /* renamed from: a */
    public final C4492a f6576a = new C4492a(0);

    /* renamed from: b */
    public final C6268a f6577b = new C6268a(10);

    /* renamed from: c */
    public final C5946n0 f6578c;

    /* renamed from: d */
    public final C5901a0 f6579d;

    /* renamed from: e */
    public final C5873b f6580e;

    /* renamed from: f */
    public final C5904c f6581f;

    /* renamed from: g */
    public SearchMistakeCollectionReq f6582g;

    public MistakeCollectionFilterResultViewModel() {
        SearchMistakeCollectionReq searchMistakeCollectionReq = new SearchMistakeCollectionReq();
        EmptyList emptyList = EmptyList.INSTANCE;
        EmptySet emptySet = EmptySet.INSTANCE;
        C5946n0 c5946n0M5546b = AbstractC5914h.m5546b(new C4676s0("", "错题集", 0, 100, searchMistakeCollectionReq, 1, emptyList, 0, emptySet, emptySet, MistakeCollectionFilterResultContract$SortType.TIME, false, false, false, false, true, false, false, emptyList, emptyList, 1, null, null, false, emptySet, null, null, null, 0, 1, false, emptySet, false, MistakeCollectionFilterResultContract$SourceType.CREATE_COLLECTION));
        this.f6578c = c5946n0M5546b;
        this.f6579d = new C5901a0(c5946n0M5546b);
        C5873b c5873bM5511a = AbstractC5882k.m5511a(0, 7, null);
        this.f6580e = c5873bM5511a;
        this.f6581f = AbstractC5914h.m5556l(c5873bM5511a);
        this.f6582g = new SearchMistakeCollectionReq();
    }

    /* renamed from: b */
    public static SearchMistakeCollectionReq m4066b(SearchMistakeCollectionReq searchMistakeCollectionReq) {
        SearchMistakeCollectionReq searchMistakeCollectionReq2 = new SearchMistakeCollectionReq();
        searchMistakeCollectionReq2.setCollectionId(searchMistakeCollectionReq.getCollectionId());
        searchMistakeCollectionReq2.setTimeRange(searchMistakeCollectionReq.getTimeRange());
        searchMistakeCollectionReq2.setStartTime(searchMistakeCollectionReq.getStartTime());
        searchMistakeCollectionReq2.setEndTime(searchMistakeCollectionReq.getEndTime());
        searchMistakeCollectionReq2.getTopicIds().addAll(searchMistakeCollectionReq.getTopicIds());
        searchMistakeCollectionReq2.getDiff().addAll(searchMistakeCollectionReq.getDiff());
        searchMistakeCollectionReq2.getAttainedLevel().addAll(searchMistakeCollectionReq.getAttainedLevel());
        searchMistakeCollectionReq2.getErrorReason().addAll(searchMistakeCollectionReq.getErrorReason());
        searchMistakeCollectionReq2.setCurrentCollectionStatus(searchMistakeCollectionReq.getCurrentCollectionStatus());
        searchMistakeCollectionReq2.setOtherCollectionStatus(searchMistakeCollectionReq.getOtherCollectionStatus());
        searchMistakeCollectionReq2.getTagIdList().addAll(searchMistakeCollectionReq.getTagIdList());
        searchMistakeCollectionReq2.setSortType(searchMistakeCollectionReq.getSortType());
        searchMistakeCollectionReq2.setSkipCount(searchMistakeCollectionReq.getSkipCount());
        searchMistakeCollectionReq2.setMaxResultCount(searchMistakeCollectionReq.getMaxResultCount());
        return searchMistakeCollectionReq2;
    }

    /* renamed from: a */
    public final void m4067a() {
        int i;
        Object value;
        C4676s0 c4676s0;
        C5946n0 c5946n0 = this.f6578c;
        C4676s0 c4676s02 = (C4676s0) c5946n0.getValue();
        SearchMistakeCollectionReq searchMistakeCollectionReq = new SearchMistakeCollectionReq();
        searchMistakeCollectionReq.setCollectionId(AbstractC5862w.m5410D(c4676s02.f6683a));
        searchMistakeCollectionReq.setTimeRange(c4676s02.f6703u);
        if (searchMistakeCollectionReq.getTimeRange() == 3) {
            searchMistakeCollectionReq.setStartTime(c4676s02.f6704v);
            searchMistakeCollectionReq.setEndTime(c4676s02.f6705w);
        }
        searchMistakeCollectionReq.getTopicIds().addAll(c4676s02.f6707y);
        Integer num = c4676s02.f6708z;
        if (num != null) {
            searchMistakeCollectionReq.getDiff().add(Integer.valueOf(num.intValue()));
        }
        Integer num2 = c4676s02.f6675A;
        if (num2 != null) {
            searchMistakeCollectionReq.getAttainedLevel().add(Integer.valueOf(num2.intValue()));
        }
        Integer num3 = c4676s02.f6676B;
        if (num3 != null) {
            searchMistakeCollectionReq.getErrorReason().add(Integer.valueOf(num3.intValue()));
        }
        searchMistakeCollectionReq.setCurrentCollectionStatus(c4676s02.f6677C);
        searchMistakeCollectionReq.setOtherCollectionStatus(c4676s02.f6678D);
        if (c4676s02.f6679E) {
            searchMistakeCollectionReq.getTagIdList().add(0);
        }
        ArrayList<Integer> tagIdList = searchMistakeCollectionReq.getTagIdList();
        Set set = c4676s02.f6680F;
        ArrayList arrayList = new ArrayList(AbstractC5806u.m5277p(set, 10));
        Iterator it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf((int) ((Number) it.next()).longValue()));
        }
        tagIdList.addAll(arrayList);
        int i8 = AbstractC4690z0.f6733a[c4676s02.f6693k.ordinal()];
        if (i8 == 1) {
            i = 0;
        } else {
            if (i8 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i = 1;
        }
        searchMistakeCollectionReq.setSortType(i);
        searchMistakeCollectionReq.setSkipCount(0);
        searchMistakeCollectionReq.setMaxResultCount(20);
        this.f6582g = searchMistakeCollectionReq;
        do {
            value = c5946n0.getValue();
            c4676s0 = (C4676s0) value;
        } while (!c5946n0.m5569i(value, C4676s0.m4080a(c4676s0, null, null, 0, 0, this.f6582g, c4676s0.f6678D, null, 0, null, EmptySet.INSTANCE, null, false, false, false, false, false, false, false, null, null, 0, null, null, false, null, null, null, null, 0, 0, false, null, false, null, -2609, 3)));
        m4070e(this.f6582g, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x0224  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m4068c(com.zykj.mistake.feature.collection.filter.AbstractC4674r0 r49) {
        /*
            Method dump skipped, instructions count: 3063
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.mistake.feature.collection.filter.MistakeCollectionFilterResultViewModel.m4068c(com.zykj.mistake.feature.collection.filter.r0):void"); // DEX body: android/错题本/smali_classes3/com/zykj/mistake/feature/collection/filter/MistakeCollectionFilterResultViewModel.smali:1208
    }

    /* renamed from: d */
    public final void m4069d() {
        MistakeCollectionFilterResultViewModel mistakeCollectionFilterResultViewModel = this;
        MistakeCollectionFilterResultViewModel$loadFilterOptions$1 mistakeCollectionFilterResultViewModel$loadFilterOptions$1 = new MistakeCollectionFilterResultViewModel$loadFilterOptions$1(mistakeCollectionFilterResultViewModel, null);
        C2861i c2861i = new C2861i(mistakeCollectionFilterResultViewModel, 5);
        C2827b c2827b = new C2827b(mistakeCollectionFilterResultViewModel, 8);
        while (true) {
            C5946n0 c5946n0 = mistakeCollectionFilterResultViewModel.f6578c;
            Object value = c5946n0.getValue();
            if (c5946n0.m5569i(value, C4676s0.m4080a((C4676s0) value, null, null, 0, 0, null, 0, null, 0, null, null, null, false, false, false, false, false, true, false, null, null, 0, null, null, false, null, null, null, null, 0, 0, false, null, false, null, -65537, 3))) {
                AbstractC6014x.m5651v(ViewModelKt.getViewModelScope(mistakeCollectionFilterResultViewModel), null, null, new MistakeCollectionFilterResultViewModel$requestApi$2(mistakeCollectionFilterResultViewModel$loadFilterOptions$1, c2861i, c2827b, mistakeCollectionFilterResultViewModel, null), 3);
                return;
            }
            mistakeCollectionFilterResultViewModel = this;
        }
    }

    /* renamed from: e */
    public final void m4070e(SearchMistakeCollectionReq searchMistakeCollectionReq, boolean z8) {
        Object value;
        SearchMistakeCollectionReq searchMistakeCollectionReq2 = searchMistakeCollectionReq;
        MistakeCollectionFilterResultViewModel mistakeCollectionFilterResultViewModel = this;
        C5946n0 c5946n0 = mistakeCollectionFilterResultViewModel.f6578c;
        C4676s0 c4676s0 = (C4676s0) c5946n0.getValue();
        if (z8 && c4676s0.f6696n) {
            return;
        }
        if (z8 || !(c4676s0.f6696n || c4676s0.f6697o)) {
            int size = z8 ? 0 : c4676s0.f6689g.size();
            searchMistakeCollectionReq2.setSkipCount(size);
            searchMistakeCollectionReq2.setMaxResultCount(20);
            if (z8) {
                do {
                    value = c5946n0.getValue();
                } while (!c5946n0.m5569i(value, C4676s0.m4080a((C4676s0) value, null, null, 0, 0, null, 0, null, 0, null, EmptySet.INSTANCE, null, false, false, true, false, true, true, false, null, null, 0, null, null, false, null, null, null, null, 0, 0, false, null, false, null, -107009, 3)));
            } else {
                while (true) {
                    Object value2 = c5946n0.getValue();
                    if (c5946n0.m5569i(value2, C4676s0.m4080a((C4676s0) value2, null, null, 0, 0, null, 0, null, 0, null, null, null, false, false, false, true, false, false, false, null, null, 0, null, null, false, null, null, null, null, 0, 0, false, null, false, null, -16385, 3))) {
                        break;
                    }
                    mistakeCollectionFilterResultViewModel = this;
                    searchMistakeCollectionReq2 = searchMistakeCollectionReq;
                }
            }
            AbstractC6014x.m5651v(ViewModelKt.getViewModelScope(mistakeCollectionFilterResultViewModel), null, null, new MistakeCollectionFilterResultViewModel$requestFilterResult$3(z8, mistakeCollectionFilterResultViewModel, searchMistakeCollectionReq2, size, null), 3);
        }
    }

    /* renamed from: f */
    public final void m4071f(AbstractC4671q abstractC4671q) {
        AbstractC6014x.m5651v(ViewModelKt.getViewModelScope(this), null, null, new MistakeCollectionFilterResultViewModel$sendEffect$1(this, abstractC4671q, null), 3);
    }
}
