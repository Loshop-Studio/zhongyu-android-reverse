package com.zykj.mistake.feature.notebook.list;

// RE note 本类字节码直接引用的读写或显示接口包括偏好设置。

import android.app.Application;
import android.view.AndroidViewModel;
import android.view.ViewModelKt;
import android.view.compose.C2750a;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.ViewCompat;
import com.zykj.mistake.activity.C4479o;
import com.zykj.mistake.data.C4492a;
import com.zykj.mistake.data.C4494c;
import com.zykj.mistake.data.CollectionLimitException;
import com.zykj.mistake.entity.req.MistakeListReq;
import com.zykj.mistake.entity.req.MultiRemoveMistakeReq;
import com.zykj.mistake.entity.req.MultiSetTagsReq;
import com.zykj.mistake.entity.resp.CustomTagInfo;
import com.zykj.mistake.entity.resp.GetMyTagResp;
import com.zykj.mistake.feature.collection.component.C4564j;
import com.zykj.mistake.utils.AbstractC5099d;
import com.zykj.mistake.utils.C5100e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.AbstractC5785e0;
import kotlin.collections.AbstractC5795j0;
import kotlin.collections.AbstractC5805t;
import kotlin.collections.AbstractC5806u;
import kotlin.collections.EmptyList;
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
import org.jetbrains.annotations.NotNull;
import p000a.AbstractC0000a;
import p045d6.C5443s;
import p129o2.C6268a;
import p137p4.C6383b;
import p152r6.InterfaceC6471c;
import p185v7.AbstractC6675d;

@StabilityInferred(parameters = 0)
@Metadata(m5109d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m5110d2 = {"Lcom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "Landroid/app/Application;", "application", "<init>", "(Landroid/app/Application;)V", "app_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nMistakeNotebookViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MistakeNotebookViewModel.kt\ncom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 5 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,845:1\n230#2,5:846\n230#2,5:851\n230#2,5:856\n230#2,5:861\n230#2,5:866\n230#2,3:871\n233#2,2:876\n230#2,5:878\n230#2,5:883\n230#2,5:888\n230#2,5:893\n230#2,5:898\n230#2,5:903\n230#2,5:908\n230#2,5:924\n230#2,5:929\n230#2,5:934\n230#2,5:943\n230#2,5:948\n230#2,5:957\n230#2,5:962\n230#2,5:967\n230#2,5:972\n230#2,5:977\n230#2,3:1008\n233#2,2:1016\n230#2,5:1047\n230#2,5:1056\n230#2,3:1061\n233#2,2:1067\n230#2,3:1069\n233#2,2:1076\n230#2,5:1078\n295#3,2:874\n360#3,7:913\n1563#3:920\n1634#3,3:921\n1563#3:939\n1634#3,3:940\n1563#3:953\n1634#3,3:954\n1788#3,4:982\n1491#3:986\n1516#3,3:987\n1519#3,3:997\n1563#3:1003\n1634#3,3:1004\n295#3,2:1011\n827#3:1013\n855#3,2:1014\n1491#3:1018\n1516#3,3:1019\n1519#3,3:1029\n1563#3:1035\n1634#3,3:1036\n774#3:1040\n865#3,2:1041\n1563#3:1043\n1634#3,3:1044\n1563#3:1052\n1634#3,3:1053\n827#3:1064\n855#3,2:1065\n1563#3:1072\n1634#3,3:1073\n382#4,7:990\n382#4,7:1022\n126#5:1000\n153#5,2:1001\n155#5:1007\n126#5:1032\n153#5,2:1033\n155#5:1039\n*S KotlinDebug\n*F\n+ 1 MistakeNotebookViewModel.kt\ncom/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel\n*L\n77#1:846,5\n82#1:851,5\n117#1:856,5\n125#1:861,5\n133#1:866,5\n149#1:871,3\n149#1:876,2\n167#1:878,5\n177#1:883,5\n180#1:888,5\n191#1:893,5\n202#1:898,5\n213#1:903,5\n248#1:908,5\n287#1:924,5\n347#1:929,5\n359#1:934,5\n406#1:943,5\n409#1:948,5\n438#1:957,5\n443#1:962,5\n501#1:967,5\n503#1:972,5\n511#1:977,5\n561#1:1008,3\n561#1:1016,2\n317#1:1047,5\n327#1:1056,5\n544#1:1061,3\n544#1:1067,2\n595#1:1069,3\n595#1:1076,2\n618#1:1078,5\n150#1:874,2\n253#1:913,7\n256#1:920\n256#1:921,3\n398#1:939\n398#1:940,3\n434#1:953\n434#1:954,3\n532#1:982,4\n533#1:986\n533#1:987,3\n533#1:997,3\n536#1:1003\n536#1:1004,3\n562#1:1011,2\n570#1:1013\n570#1:1014,2\n580#1:1018\n580#1:1019,3\n580#1:1029,3\n583#1:1035\n583#1:1036,3\n792#1:1040\n792#1:1041,2\n307#1:1043\n307#1:1044,3\n326#1:1052\n326#1:1053,3\n548#1:1064\n548#1:1065,2\n597#1:1072\n597#1:1073,3\n533#1:990,7\n580#1:1022,7\n533#1:1000\n533#1:1001,2\n533#1:1007\n580#1:1032\n580#1:1033,2\n580#1:1039\n*E\n"})
/* loaded from: classes3.dex */
public final class MistakeNotebookViewModel extends AndroidViewModel {

    /* renamed from: a */
    public final C4492a f7445a;

    /* renamed from: b */
    public final C4492a f7446b;

    /* renamed from: c */
    public final C6268a f7447c;

    /* renamed from: d */
    public final C5946n0 f7448d;

    /* renamed from: e */
    public final C5901a0 f7449e;

    /* renamed from: f */
    public final C5873b f7450f;

    /* renamed from: g */
    public final C5904c f7451g;

    /* renamed from: h */
    public MistakeListReq f7452h;

    /* renamed from: i */
    public C5976k1 f7453i;

    /* renamed from: j */
    public C5976k1 f7454j;

    /* renamed from: k */
    public int f7455k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MistakeNotebookViewModel(@NotNull Application application) {
        super(application);
        AbstractC5830k.m5330g(application, "application");
        this.f7445a = new C4492a(0);
        this.f7446b = new C4492a(1);
        this.f7447c = new C6268a(10);
        C5946n0 c5946n0M5546b = AbstractC5914h.m5546b(new C4941e1(application.getSharedPreferences("zykjMistake", 0).getBoolean("SP_CONTACT_MODE", false)));
        this.f7448d = c5946n0M5546b;
        this.f7449e = new C5901a0(c5946n0M5546b);
        C5873b c5873bM5511a = AbstractC5882k.m5511a(0, 7, null);
        this.f7450f = c5873bM5511a;
        this.f7451g = AbstractC5914h.m5556l(c5873bM5511a);
        this.f7452h = new MistakeListReq();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m4289a(com.zykj.mistake.feature.notebook.list.MistakeNotebookViewModel r29, com.zykj.mistake.data.C4494c r30, java.util.List r31, kotlin.coroutines.jvm.internal.ContinuationImpl r32) {
        /*
            Method dump skipped, instructions count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.mistake.feature.notebook.list.MistakeNotebookViewModel.m4289a(com.zykj.mistake.feature.notebook.list.MistakeNotebookViewModel, com.zykj.mistake.data.c, java.util.List, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object"); // DEX body: android/错题本/smali_classes3/com/zykj/mistake/feature/notebook/list/MistakeNotebookViewModel.smali:245
    }

    /* renamed from: d */
    public static boolean m4290d(Throwable th) {
        if (th instanceof CollectionLimitException) {
            return true;
        }
        String message = th.getMessage();
        if (message == null) {
            message = "";
        }
        return AbstractC5855p.m5372F(message, "单错题集最多包含 100 道错题，请取消后重试", false);
    }

    /* renamed from: g */
    public static ArrayList m4291g(C4941e1 c4941e1) {
        List list = c4941e1.f7504d;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (c4941e1.f7510j.contains(((C6383b) obj).f10446a)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    public final void m4292b() {
        C5946n0 c5946n0;
        Object value;
        EmptySet emptySet;
        do {
            c5946n0 = this.f7448d;
            value = c5946n0.getValue();
            emptySet = EmptySet.INSTANCE;
        } while (!c5946n0.m5569i(value, C4941e1.m4303a((C4941e1) value, 0, 0, false, null, false, false, false, false, emptySet, null, null, null, false, null, emptySet, emptySet, false, false, "", "", false, null, false, 16825599)));
    }

    /* renamed from: c */
    public final void m4293c(AbstractC4938d1 abstractC4938d1) {
        Object value;
        int i;
        Object value2;
        C4941e1 c4941e1;
        Set setM5220G0;
        Object value3;
        Object value4;
        Object value5;
        Object value6;
        Object value7;
        Object value8;
        Object value9;
        EmptySet emptySet;
        Object value10;
        int i8;
        Object value11;
        Object value12;
        C4941e1 c4941e1M4303a;
        Object next;
        Object value13;
        EmptySet emptySet2;
        Object value14;
        Object value15;
        Object value16;
        C4941e1 c4941e12;
        int i9;
        Object next2;
        int i10;
        ArrayList arrayList;
        Set set;
        String str;
        Object value17;
        Object value18;
        Object value19;
        boolean zEquals = abstractC4938d1.equals(C4932b1.f7488a);
        C5946n0 c5946n0 = this.f7448d;
        if (zEquals) {
            boolean z8 = !AbstractC5099d.m4453c(getApplication(), "SP_CONTACT_MODE", false);
            AbstractC5099d.m4455e(getApplication(), "SP_CONTACT_MODE", z8);
            C5100e.m4458b(4, "MistakeListPracticeMode", String.valueOf(z8));
            do {
                value19 = c5946n0.getValue();
            } while (!c5946n0.m5569i(value19, C4941e1.m4303a((C4941e1) value19, 0, 0, z8, null, false, false, false, false, null, null, null, null, false, null, null, null, false, false, null, null, false, null, false, 33554427)));
            return;
        }
        if (abstractC4938d1.equals(C4929a1.f7463a)) {
            do {
                value18 = c5946n0.getValue();
            } while (!c5946n0.m5569i(value18, C4941e1.m4303a((C4941e1) value18, 0, 0, AbstractC5099d.m4453c(getApplication(), "SP_CONTACT_MODE", false), null, false, false, false, false, null, null, null, null, false, null, null, null, false, false, null, null, false, null, false, 33554427)));
            return;
        }
        if (abstractC4938d1.equals(C4928a0.f7462a)) {
            AbstractC6014x.m5651v(ViewModelKt.getViewModelScope(this), null, null, new MistakeNotebookViewModel$dispatch$3(this, null), 3);
            return;
        }
        if (abstractC4938d1.equals(C4983v0.f7619a)) {
            AbstractC6014x.m5651v(ViewModelKt.getViewModelScope(this), null, null, new MistakeNotebookViewModel$dispatch$4(this, null), 3);
            return;
        }
        if (abstractC4938d1 instanceof C4990z) {
            int i11 = ((C4990z) abstractC4938d1).f7626a;
            if (this.f7455k == i11) {
                return;
            }
            this.f7455k = i11;
            C5976k1 c5976k1 = this.f7453i;
            if (c5976k1 != null) {
                c5976k1.cancel(null);
            }
            C5976k1 c5976k12 = this.f7454j;
            if (c5976k12 != null) {
                c5976k12.cancel(null);
            }
            this.f7452h = new MistakeListReq();
            do {
                value17 = c5946n0.getValue();
            } while (!c5946n0.m5569i(value17, new C4941e1(AbstractC5099d.m4453c(getApplication(), "SP_CONTACT_MODE", false))));
            m4295f(true);
            m4294e(false, false, false);
            return;
        }
        if (abstractC4938d1.equals(C4985w0.f7621a)) {
            m4295f(true);
            return;
        }
        if (abstractC4938d1 instanceof C4987x0) {
            C4987x0 c4987x0 = (C4987x0) abstractC4938d1;
            int i12 = c4987x0.f7623a;
            boolean z9 = c4987x0.f7624b;
            do {
                value16 = c5946n0.getValue();
                c4941e12 = (C4941e1) value16;
                List list = c4941e12.f7504d;
                i9 = c4941e12.f7502b;
                Iterator it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        next2 = it.next();
                        if (((C6383b) next2).f10448c == i12) {
                            break;
                        }
                    } else {
                        next2 = null;
                        break;
                    }
                }
                C6383b c6383b = (C6383b) next2;
                i10 = c4941e12.f7501a - 1;
                if (i10 < 0) {
                    i10 = 0;
                }
                if ((c6383b != null ? c6383b.f10458m : z9) && i9 - 1 < 0) {
                    i9 = 0;
                }
                List list2 = c4941e12.f7504d;
                arrayList = new ArrayList();
                for (Object obj : list2) {
                    if (!(((C6383b) obj).f10448c == i12)) {
                        arrayList.add(obj);
                    }
                }
                set = c4941e12.f7510j;
                str = c6383b != null ? c6383b.f10446a : null;
                if (str == null) {
                    str = "";
                }
            } while (!c5946n0.m5569i(value16, C4941e1.m4303a(c4941e12, i10, i9, false, arrayList, false, false, false, false, AbstractC5795j0.m5162w(set, str), null, null, null, false, null, null, null, false, false, null, null, false, null, false, 33553908)));
            return;
        }
        if (abstractC4938d1.equals(C4977s0.f7613a)) {
            C4941e1 c4941e13 = (C4941e1) c5946n0.getValue();
            if (!c4941e13.f7507g || c4941e13.f7506f) {
                return;
            }
            m4295f(false);
            return;
        }
        if (abstractC4938d1.equals(C4979t0.f7615a)) {
            do {
                value15 = c5946n0.getValue();
            } while (!c5946n0.m5569i(value15, C4941e1.m4303a((C4941e1) value15, 0, 0, false, null, false, false, false, true, EmptySet.INSTANCE, null, null, null, false, null, null, null, false, false, null, null, false, null, false, 33553663)));
            return;
        }
        if (abstractC4938d1 instanceof C4981u0) {
            do {
                value14 = c5946n0.getValue();
            } while (!c5946n0.m5569i(value14, C4941e1.m4303a((C4941e1) value14, 0, 0, false, null, false, false, false, true, AbstractC6675d.m6354t(((C4981u0) abstractC4938d1).f7617a), null, null, null, false, null, null, null, false, false, null, null, false, null, false, 33553663)));
            return;
        }
        if (abstractC4938d1.equals(C4940e0.f7500a)) {
            do {
                value13 = c5946n0.getValue();
                emptySet2 = EmptySet.INSTANCE;
            } while (!c5946n0.m5569i(value13, C4941e1.m4303a((C4941e1) value13, 0, 0, false, null, false, false, false, false, emptySet2, null, null, null, false, null, emptySet2, emptySet2, false, false, null, null, false, null, false, 24427775)));
            return;
        }
        if (abstractC4938d1.equals(C4931b0.f7487a)) {
            if (m4291g((C4941e1) c5946n0.getValue()).isEmpty()) {
                return;
            }
            final int i13 = 1;
            AbstractC6014x.m5651v(ViewModelKt.getViewModelScope(this), null, null, new MistakeNotebookViewModel$requestApi$2(true, this, new MistakeNotebookViewModel$loadJoinableCollections$1(this, null), new C4564j(29), new InterfaceC6471c(this) { // from class: com.zykj.mistake.feature.notebook.list.j1

                /* renamed from: b */
                public final /* synthetic */ MistakeNotebookViewModel f7570b;

                {
                    this.f7570b = this;
                }

                @Override // p152r6.InterfaceC6471c
                public final Object invoke(Object obj2) {
                    Object value20;
                    switch (i13) {
                        case 0:
                            GetMyTagResp resp = (GetMyTagResp) obj2;
                            AbstractC5830k.m5330g(resp, "resp");
                            List<CustomTagInfo> result = resp.getResult();
                            if (result == null) {
                                result = EmptyList.INSTANCE;
                            }
                            List<CustomTagInfo> list3 = result;
                            MistakeNotebookViewModel mistakeNotebookViewModel = this.f7570b;
                            C5946n0 c5946n02 = mistakeNotebookViewModel.f7448d;
                            while (true) {
                                Object value21 = c5946n02.getValue();
                                C5946n0 c5946n03 = c5946n02;
                                MistakeNotebookViewModel mistakeNotebookViewModel2 = mistakeNotebookViewModel;
                                if (c5946n03.m5569i(value21, C4941e1.m4303a((C4941e1) value21, 0, 0, false, null, false, false, false, false, null, null, list3, null, false, null, null, null, false, false, null, null, false, null, false, 33552383))) {
                                    mistakeNotebookViewModel2.m4296h(new C4976s(list3));
                                    break;
                                } else {
                                    c5946n02 = c5946n03;
                                    mistakeNotebookViewModel = mistakeNotebookViewModel2;
                                }
                            }
                        default:
                            List<C4494c> collections = (List) obj2;
                            AbstractC5830k.m5330g(collections, "collections");
                            boolean zIsEmpty = collections.isEmpty();
                            MistakeNotebookViewModel mistakeNotebookViewModel3 = this.f7570b;
                            if (zIsEmpty) {
                                C5946n0 c5946n04 = mistakeNotebookViewModel3.f7448d;
                                do {
                                    value20 = c5946n04.getValue();
                                } while (!c5946n04.m5569i(value20, C4941e1.m4303a((C4941e1) value20, 0, 0, false, null, false, false, false, false, null, null, null, null, false, null, null, null, false, true, "", "", false, MistakeNotebookContract$CreateCollectionEntry.EMPTY_DIRECT, false, 21495807)));
                            } else {
                                ArrayList arrayList2 = new ArrayList(AbstractC5806u.m5277p(collections, 10));
                                for (C4494c c4494c : collections) {
                                    mistakeNotebookViewModel3.getClass();
                                    String str2 = c4494c.f6007a;
                                    String str3 = c4494c.f6008b;
                                    int i14 = c4494c.f6009c;
                                    int i15 = c4494c.f6010d;
                                    arrayList2.add(new C4927a(str2, str3, i14, i15, i14 >= i15, c4494c.f6011e));
                                }
                                C5946n0 c5946n05 = mistakeNotebookViewModel3.f7448d;
                                while (true) {
                                    Object value22 = c5946n05.getValue();
                                    EmptySet emptySet3 = EmptySet.INSTANCE;
                                    ArrayList arrayList3 = arrayList2;
                                    if (!c5946n05.m5569i(value22, C4941e1.m4303a((C4941e1) value22, 0, 0, false, null, false, false, false, false, null, null, null, null, true, arrayList3, emptySet3, emptySet3, false, false, null, null, false, null, false, 33308671))) {
                                        arrayList2 = arrayList3;
                                    }
                                }
                            }
                            break;
                    }
                    return C5443s.f8405a;
                }
            }, null), 3);
            return;
        }
        if (abstractC4938d1 instanceof C4989y0) {
            do {
                value12 = c5946n0.getValue();
                c4941e1M4303a = (C4941e1) value12;
                Iterator it2 = c4941e1M4303a.f7516p.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next = it2.next();
                        if (AbstractC5830k.m5325b(((C4927a) next).f7456a, ((C4989y0) abstractC4938d1).f7625a)) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                C4927a c4927a = (C4927a) next;
                if (c4927a != null && !c4927a.f7460e) {
                    Set setM5220G02 = AbstractC5805t.m5220G0(c4941e1M4303a.f7518r);
                    String str2 = ((C4989y0) abstractC4938d1).f7625a;
                    if (!setM5220G02.add(str2)) {
                        setM5220G02.remove(str2);
                    }
                    c4941e1M4303a = C4941e1.m4303a(c4941e1M4303a, 0, 0, false, null, false, false, false, false, null, null, null, null, false, null, null, setM5220G02, false, false, null, null, false, null, false, 33423359);
                }
            } while (!c5946n0.m5569i(value12, c4941e1M4303a));
            return;
        }
        if (abstractC4938d1.equals(C4958k0.f7572a)) {
            C4941e1 c4941e14 = (C4941e1) c5946n0.getValue();
            List listM5217D0 = AbstractC5805t.m5217D0(c4941e14.f7518r);
            if (listM5217D0.isEmpty()) {
                return;
            }
            ArrayList arrayListM4291g = m4291g(c4941e14);
            ArrayList arrayList2 = new ArrayList(AbstractC5806u.m5277p(arrayListM4291g, 10));
            int size = arrayListM4291g.size();
            int i14 = 0;
            while (i14 < size) {
                Object obj2 = arrayListM4291g.get(i14);
                i14++;
                arrayList2.add(Integer.valueOf(((C6383b) obj2).f10448c));
            }
            if (arrayList2.isEmpty()) {
                return;
            }
            List collections = c4941e14.f7516p;
            Set selectedCollectionIds = c4941e14.f7518r;
            AbstractC5830k.m5330g(collections, "collections");
            AbstractC5830k.m5330g(selectedCollectionIds, "selectedCollectionIds");
            if (!arrayListM4291g.isEmpty() && !selectedCollectionIds.isEmpty()) {
                int iM5149C = AbstractC5785e0.m5149C(AbstractC5806u.m5277p(collections, 10));
                if (iM5149C < 16) {
                    iM5149C = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iM5149C);
                for (Object obj3 : collections) {
                    linkedHashMap.put(((C4927a) obj3).f7456a, obj3);
                }
                Set<String> set2 = selectedCollectionIds;
                if (!(set2 instanceof Collection) || !set2.isEmpty()) {
                    for (String str3 : set2) {
                        C4927a c4927a2 = (C4927a) linkedHashMap.get(str3);
                        if (c4927a2 != null) {
                            Integer numM5410D = AbstractC5862w.m5410D(str3);
                            if (arrayListM4291g.isEmpty()) {
                                i8 = 0;
                            } else {
                                int size2 = arrayListM4291g.size();
                                i8 = 0;
                                int i15 = 0;
                                while (i15 < size2) {
                                    Object obj4 = arrayListM4291g.get(i15);
                                    i15++;
                                    if (!AbstractC5805t.m5224d0(((C6383b) obj4).f10460o, numM5410D) && (i8 = i8 + 1) < 0) {
                                        AbstractC5806u.m5257K();
                                        throw null;
                                    }
                                }
                            }
                            if (c4927a2.f7458c + i8 > c4927a2.f7459d) {
                                do {
                                    value11 = c5946n0.getValue();
                                } while (!c5946n0.m5569i(value11, C4941e1.m4303a((C4941e1) value11, 0, 0, false, null, false, false, false, false, null, null, null, null, false, null, null, null, false, false, null, null, false, null, true, ViewCompat.MEASURED_SIZE_MASK)));
                                return;
                            }
                        }
                    }
                }
            }
            do {
                value10 = c5946n0.getValue();
            } while (!c5946n0.m5569i(value10, C4941e1.m4303a((C4941e1) value10, 0, 0, false, null, false, false, false, false, null, null, null, null, false, null, null, null, true, false, null, null, false, null, false, 33292287)));
            AbstractC6014x.m5651v(ViewModelKt.getViewModelScope(this), null, null, new MistakeNotebookViewModel$confirmJoinCollection$3(this, listM5217D0, arrayList2, null), 3);
            return;
        }
        if (abstractC4938d1.equals(C4971p0.f7593a)) {
            do {
                value9 = c5946n0.getValue();
                emptySet = EmptySet.INSTANCE;
            } while (!c5946n0.m5569i(value9, C4941e1.m4303a((C4941e1) value9, 0, 0, false, null, false, false, false, false, null, null, null, null, false, null, emptySet, emptySet, false, false, null, null, false, null, false, 33079295)));
            return;
        }
        if (abstractC4938d1.equals(C4967n0.f7588a)) {
            do {
                value8 = c5946n0.getValue();
            } while (!c5946n0.m5569i(value8, C4941e1.m4303a((C4941e1) value8, 0, 0, false, null, false, false, false, false, null, null, null, null, false, null, null, null, false, false, null, null, false, null, false, ViewCompat.MEASURED_SIZE_MASK)));
            return;
        }
        if (abstractC4938d1.equals(C4991z0.f7627a)) {
            do {
                value7 = c5946n0.getValue();
            } while (!c5946n0.m5569i(value7, C4941e1.m4303a((C4941e1) value7, 0, 0, false, null, false, false, false, false, null, null, null, null, false, null, null, null, false, true, "", "", false, MistakeNotebookContract$CreateCollectionEntry.FROM_SELECT, false, 21479423)));
            return;
        }
        if (abstractC4938d1.equals(C4969o0.f7590a)) {
            do {
                value6 = c5946n0.getValue();
            } while (!c5946n0.m5569i(value6, C4941e1.m4303a((C4941e1) value6, 0, 0, false, null, false, false, false, false, null, null, null, null, false, null, null, null, false, false, "", "", false, null, false, 17301503)));
            return;
        }
        if (abstractC4938d1 instanceof C4943f0) {
            do {
                value5 = c5946n0.getValue();
            } while (!c5946n0.m5569i(value5, C4941e1.m4303a((C4941e1) value5, 0, 0, false, null, false, false, false, false, null, null, null, null, false, null, null, null, false, false, AbstractC5855p.m5401i0(20, ((C4943f0) abstractC4938d1).f7535a), "", false, null, false, 30408703)));
            return;
        }
        if (abstractC4938d1.equals(C4949h0.f7559a)) {
            C4941e1 c4941e15 = (C4941e1) c5946n0.getValue();
            String string = AbstractC5855p.m5403k0(c4941e15.f7521u).toString();
            ArrayList arrayListM4291g2 = m4291g(c4941e15);
            int i16 = 0;
            ArrayList arrayList3 = new ArrayList(AbstractC5806u.m5277p(arrayListM4291g2, 10));
            int size3 = arrayListM4291g2.size();
            while (i16 < size3) {
                Object obj5 = arrayListM4291g2.get(i16);
                i16++;
                arrayList3.add(Integer.valueOf(((C6383b) obj5).f10448c));
            }
            MistakeNotebookContract$CreateCollectionEntry mistakeNotebookContract$CreateCollectionEntry = c4941e15.f7524x;
            if (AbstractC5855p.m5382P(string)) {
                do {
                    value4 = c5946n0.getValue();
                } while (!c5946n0.m5569i(value4, C4941e1.m4303a((C4941e1) value4, 0, 0, false, null, false, false, false, false, null, null, null, null, false, null, null, null, false, false, null, "请输入错题集名称", false, null, false, 31457279)));
                return;
            } else {
                if (arrayList3.isEmpty()) {
                    return;
                }
                do {
                    value3 = c5946n0.getValue();
                } while (!c5946n0.m5569i(value3, C4941e1.m4303a((C4941e1) value3, 0, 0, false, null, false, false, false, false, null, null, null, null, false, null, null, null, false, false, null, "", true, null, false, 27262975)));
                AbstractC6014x.m5651v(ViewModelKt.getViewModelScope(this), null, null, new MistakeNotebookViewModel$confirmCreateCollectionFromJoin$3(this, string, mistakeNotebookContract$CreateCollectionEntry, arrayList3, null), 3);
                return;
            }
        }
        int i17 = 0;
        if (abstractC4938d1 instanceof C4935c1) {
            do {
                value2 = c5946n0.getValue();
                c4941e1 = (C4941e1) value2;
                setM5220G0 = AbstractC5805t.m5220G0(c4941e1.f7510j);
                String str4 = ((C4935c1) abstractC4938d1).f7491a;
                if (!setM5220G0.add(str4)) {
                    setM5220G0.remove(str4);
                }
            } while (!c5946n0.m5569i(value2, C4941e1.m4303a(c4941e1, 0, 0, false, null, false, false, false, false, setM5220G0, null, null, null, false, null, null, null, false, false, null, null, false, null, false, 33553919)));
            return;
        }
        if (abstractC4938d1.equals(C4937d0.f7493a)) {
            final int i18 = 0;
            AbstractC6014x.m5651v(ViewModelKt.getViewModelScope(this), null, null, new MistakeNotebookViewModel$requestApi$2(true, this, new MistakeNotebookViewModel$loadCustomTags$1(this, null), new C4564j(28), new InterfaceC6471c(this) { // from class: com.zykj.mistake.feature.notebook.list.j1

                /* renamed from: b */
                public final /* synthetic */ MistakeNotebookViewModel f7570b;

                {
                    this.f7570b = this;
                }

                @Override // p152r6.InterfaceC6471c
                public final Object invoke(Object obj22) {
                    Object value20;
                    switch (i18) {
                        case 0:
                            GetMyTagResp resp = (GetMyTagResp) obj22;
                            AbstractC5830k.m5330g(resp, "resp");
                            List<CustomTagInfo> result = resp.getResult();
                            if (result == null) {
                                result = EmptyList.INSTANCE;
                            }
                            List<CustomTagInfo> list3 = result;
                            MistakeNotebookViewModel mistakeNotebookViewModel = this.f7570b;
                            C5946n0 c5946n02 = mistakeNotebookViewModel.f7448d;
                            while (true) {
                                Object value21 = c5946n02.getValue();
                                C5946n0 c5946n03 = c5946n02;
                                MistakeNotebookViewModel mistakeNotebookViewModel2 = mistakeNotebookViewModel;
                                if (c5946n03.m5569i(value21, C4941e1.m4303a((C4941e1) value21, 0, 0, false, null, false, false, false, false, null, null, list3, null, false, null, null, null, false, false, null, null, false, null, false, 33552383))) {
                                    mistakeNotebookViewModel2.m4296h(new C4976s(list3));
                                    break;
                                } else {
                                    c5946n02 = c5946n03;
                                    mistakeNotebookViewModel = mistakeNotebookViewModel2;
                                }
                            }
                        default:
                            List<C4494c> collections2 = (List) obj22;
                            AbstractC5830k.m5330g(collections2, "collections");
                            boolean zIsEmpty = collections2.isEmpty();
                            MistakeNotebookViewModel mistakeNotebookViewModel3 = this.f7570b;
                            if (zIsEmpty) {
                                C5946n0 c5946n04 = mistakeNotebookViewModel3.f7448d;
                                do {
                                    value20 = c5946n04.getValue();
                                } while (!c5946n04.m5569i(value20, C4941e1.m4303a((C4941e1) value20, 0, 0, false, null, false, false, false, false, null, null, null, null, false, null, null, null, false, true, "", "", false, MistakeNotebookContract$CreateCollectionEntry.EMPTY_DIRECT, false, 21495807)));
                            } else {
                                ArrayList arrayList22 = new ArrayList(AbstractC5806u.m5277p(collections2, 10));
                                for (C4494c c4494c : collections2) {
                                    mistakeNotebookViewModel3.getClass();
                                    String str22 = c4494c.f6007a;
                                    String str32 = c4494c.f6008b;
                                    int i142 = c4494c.f6009c;
                                    int i152 = c4494c.f6010d;
                                    arrayList22.add(new C4927a(str22, str32, i142, i152, i142 >= i152, c4494c.f6011e));
                                }
                                C5946n0 c5946n05 = mistakeNotebookViewModel3.f7448d;
                                while (true) {
                                    Object value22 = c5946n05.getValue();
                                    EmptySet emptySet3 = EmptySet.INSTANCE;
                                    ArrayList arrayList32 = arrayList22;
                                    if (!c5946n05.m5569i(value22, C4941e1.m4303a((C4941e1) value22, 0, 0, false, null, false, false, false, false, null, null, null, null, true, arrayList32, emptySet3, emptySet3, false, false, null, null, false, null, false, 33308671))) {
                                        arrayList22 = arrayList32;
                                    }
                                }
                            }
                            break;
                    }
                    return C5443s.f8405a;
                }
            }, null), 3);
            return;
        }
        if (abstractC4938d1.equals(C4934c0.f7490a)) {
            AbstractC6014x.m5651v(ViewModelKt.getViewModelScope(this), null, null, new MistakeNotebookViewModel$dispatch$15(this, null), 3);
            return;
        }
        if (abstractC4938d1.equals(C4952i0.f7565a)) {
            C4941e1 c4941e16 = (C4941e1) c5946n0.getValue();
            ArrayList arrayListM4291g3 = m4291g(c4941e16);
            if (arrayListM4291g3.isEmpty()) {
                return;
            }
            if (arrayListM4291g3.isEmpty()) {
                i = 0;
            } else {
                int size4 = arrayListM4291g3.size();
                i = 0;
                int i19 = 0;
                while (i19 < size4) {
                    Object obj6 = arrayListM4291g3.get(i19);
                    i19++;
                    if (((C6383b) obj6).f10458m && (i = i + 1) < 0) {
                        AbstractC5806u.m5257K();
                        throw null;
                    }
                }
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            int size5 = arrayListM4291g3.size();
            while (i17 < size5) {
                Object obj7 = arrayListM4291g3.get(i17);
                i17++;
                Integer numValueOf = Integer.valueOf(((C6383b) obj7).f10447b);
                Object arrayList4 = linkedHashMap2.get(numValueOf);
                if (arrayList4 == null) {
                    arrayList4 = new ArrayList();
                    linkedHashMap2.put(numValueOf, arrayList4);
                }
                ((List) arrayList4).add(obj7);
            }
            ArrayList arrayList5 = new ArrayList(linkedHashMap2.size());
            for (Map.Entry entry : linkedHashMap2.entrySet()) {
                int iIntValue = ((Number) entry.getKey()).intValue();
                List list3 = (List) entry.getValue();
                MultiRemoveMistakeReq multiRemoveMistakeReq = new MultiRemoveMistakeReq();
                multiRemoveMistakeReq.setBookId(iIntValue);
                ArrayList<Integer> itemIds = multiRemoveMistakeReq.getItemIds();
                ArrayList arrayList6 = new ArrayList(AbstractC5806u.m5277p(list3, 10));
                Iterator it3 = list3.iterator();
                while (it3.hasNext()) {
                    arrayList6.add(Integer.valueOf(((C6383b) it3.next()).f10448c));
                }
                itemIds.addAll(arrayList6);
                arrayList5.add(new MistakeNotebookViewModel$removeSelectedMistakes$requests$2$1(this, multiRemoveMistakeReq, null));
            }
            AbstractC6014x.m5651v(ViewModelKt.getViewModelScope(this), null, null, new MistakeNotebookViewModel$requestBatch$1(this, arrayList5, new C4479o(i, 2, c4941e16, this, arrayListM4291g3), null), 3);
            return;
        }
        if (abstractC4938d1 instanceof C4964m0) {
            AbstractC6014x.m5651v(ViewModelKt.getViewModelScope(this), null, null, new MistakeNotebookViewModel$createOrEditCustomTag$1(this, ((C4964m0) abstractC4938d1).f7586a, 0L, null), 3);
            return;
        }
        if (abstractC4938d1 instanceof C4973q0) {
            C4973q0 c4973q0 = (C4973q0) abstractC4938d1;
            AbstractC6014x.m5651v(ViewModelKt.getViewModelScope(this), null, null, new MistakeNotebookViewModel$createOrEditCustomTag$1(this, c4973q0.f7596b, c4973q0.f7597c, null), 3);
            return;
        }
        if (!(abstractC4938d1 instanceof C4961l0)) {
            if (abstractC4938d1 instanceof C4955j0) {
                this.f7452h = ((C4955j0) abstractC4938d1).f7568a;
                do {
                    value = c5946n0.getValue();
                } while (!c5946n0.m5569i(value, C4941e1.m4303a((C4941e1) value, 0, 0, false, null, false, false, false, false, null, null, null, null, false, null, null, null, false, false, null, null, false, null, false, 33554303)));
                m4295f(true);
                return;
            }
            if (!(abstractC4938d1 instanceof C4946g0)) {
                if (!abstractC4938d1.equals(C4975r0.f7611a)) {
                    throw new NoWhenBranchMatchedException();
                }
                C4941e1 c4941e17 = (C4941e1) c5946n0.getValue();
                if (c4941e17.f7514n) {
                    m4296h(new C4970p(c4941e17.f7511k, c4941e17.f7513m));
                    return;
                } else {
                    m4294e(true, true, true);
                    return;
                }
            }
            List list4 = ((C4941e1) c5946n0.getValue()).f7504d;
            Iterator it4 = list4.iterator();
            while (true) {
                if (!it4.hasNext()) {
                    i17 = -1;
                    break;
                } else if (AbstractC5830k.m5325b(((C6383b) it4.next()).f10446a, ((C4946g0) abstractC4938d1).f7554a)) {
                    break;
                } else {
                    i17++;
                }
            }
            if (i17 < 0) {
                return;
            }
            C6383b c6383b2 = (C6383b) list4.get(i17);
            ArrayList arrayList7 = new ArrayList(AbstractC5806u.m5277p(list4, 10));
            Iterator it5 = list4.iterator();
            while (it5.hasNext()) {
                arrayList7.add(AbstractC0000a.m14q((C6383b) it5.next()));
            }
            m4296h(new C4974r(c6383b2.f10447b, c6383b2.f10448c, c6383b2.f10449d, c6383b2.f10451f, c6383b2.f10452g, c6383b2.f10453h, c6383b2.f10454i, c6383b2.f10457l, c6383b2.f10455j, c6383b2.f10456k, c6383b2.f10461p, arrayList7, i17));
            return;
        }
        C4961l0 c4961l0 = (C4961l0) abstractC4938d1;
        C4941e1 c4941e18 = (C4941e1) c5946n0.getValue();
        ArrayList arrayListM4291g4 = m4291g(c4941e18);
        if (arrayListM4291g4.isEmpty()) {
            return;
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        int size6 = arrayListM4291g4.size();
        while (i17 < size6) {
            Object obj8 = arrayListM4291g4.get(i17);
            i17++;
            Integer numValueOf2 = Integer.valueOf(((C6383b) obj8).f10447b);
            Object arrayList8 = linkedHashMap3.get(numValueOf2);
            if (arrayList8 == null) {
                arrayList8 = new ArrayList();
                linkedHashMap3.put(numValueOf2, arrayList8);
            }
            ((List) arrayList8).add(obj8);
        }
        ArrayList arrayList9 = new ArrayList(linkedHashMap3.size());
        for (Map.Entry entry2 : linkedHashMap3.entrySet()) {
            int iIntValue2 = ((Number) entry2.getKey()).intValue();
            List list5 = (List) entry2.getValue();
            MultiSetTagsReq multiSetTagsReq = new MultiSetTagsReq();
            multiSetTagsReq.setBookId(iIntValue2);
            ArrayList<Integer> itemIds2 = multiSetTagsReq.getItemIds();
            ArrayList arrayList10 = new ArrayList(AbstractC5806u.m5277p(list5, 10));
            Iterator it6 = list5.iterator();
            while (it6.hasNext()) {
                arrayList10.add(Integer.valueOf(((C6383b) it6.next()).f10448c));
            }
            itemIds2.addAll(arrayList10);
            multiSetTagsReq.setDiff(c4961l0.f7575a);
            multiSetTagsReq.setAttainedLevel(c4961l0.f7576b);
            multiSetTagsReq.setErrorReason(c4961l0.f7577c);
            multiSetTagsReq.getTagIdList().addAll(c4961l0.f7578d);
            arrayList9.add(new MistakeNotebookViewModel$setSelectedMistakeTags$requests$2$1(this, multiSetTagsReq, null));
        }
        AbstractC6014x.m5651v(ViewModelKt.getViewModelScope(this), null, null, new MistakeNotebookViewModel$requestBatch$1(this, arrayList9, new C2750a(c4941e18, this, 6, c4961l0), null), 3);
    }

    /* renamed from: e */
    public final void m4294e(boolean z8, boolean z9, boolean z10) {
        C5976k1 c5976k1 = this.f7454j;
        if (c5976k1 != null) {
            c5976k1.cancel(null);
        }
        if (this.f7455k == 0) {
            return;
        }
        this.f7454j = AbstractC6014x.m5651v(ViewModelKt.getViewModelScope(this), null, null, new MistakeNotebookViewModel$loadFilterData$1(z9, this, z8, z10, null), 3);
    }

    /* renamed from: f */
    public final void m4295f(boolean z8) {
        Object value;
        Object value2;
        C5946n0 c5946n0 = this.f7448d;
        C4941e1 c4941e1 = (C4941e1) c5946n0.getValue();
        if (this.f7455k == 0) {
            return;
        }
        if (z8) {
            C5976k1 c5976k1 = this.f7453i;
            if (c5976k1 != null) {
                c5976k1.cancel(null);
            }
            this.f7452h.setSkipCount(0);
            this.f7452h.setMaxResultCount(20);
            do {
                value2 = c5946n0.getValue();
            } while (!c5946n0.m5569i(value2, C4941e1.m4303a((C4941e1) value2, 0, 0, false, null, true, false, true, false, EmptySet.INSTANCE, null, null, null, false, null, null, null, false, false, null, null, false, null, false, 33553583)));
        } else {
            if (c4941e1.f7505e || c4941e1.f7506f) {
                return;
            }
            this.f7452h.setSkipCount(c4941e1.f7504d.size());
            this.f7452h.setMaxResultCount(20);
            do {
                value = c5946n0.getValue();
            } while (!c5946n0.m5569i(value, C4941e1.m4303a((C4941e1) value, 0, 0, false, null, false, true, false, false, null, null, null, null, false, null, null, null, false, false, null, null, false, null, false, 33554399)));
        }
        this.f7453i = AbstractC6014x.m5651v(ViewModelKt.getViewModelScope(this), null, null, new MistakeNotebookViewModel$requestMistakes$3(this, this.f7452h.getSkipCount(), z8, null), 3);
    }

    /* renamed from: h */
    public final void m4296h(AbstractC4988y abstractC4988y) {
        AbstractC6014x.m5651v(ViewModelKt.getViewModelScope(this), null, null, new MistakeNotebookViewModel$sendEffect$1(this, abstractC4988y, null), 3);
    }
}
