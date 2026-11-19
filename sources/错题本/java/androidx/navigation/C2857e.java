package androidx.navigation;

import androidx.compose.foundation.lazy.grid.LazyGridItemInfo;
import androidx.compose.foundation.lazy.grid.LazyGridState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.navigation.NavController;
import androidx.navigation.compose.DialogHostKt;
import androidx.navigation.compose.DialogNavigator;
import com.zykj.mistake.entity.resp.CustomTagInfo;
import com.zykj.mistake.feature.ask.C4536n;
import com.zykj.mistake.feature.ask.C4542r;
import com.zykj.mistake.feature.collection.detail.C4607n;
import com.zykj.mistake.feature.mistake.model.MistakeTagType;
import com.zykj.mistake.feature.notebook.detail.C4764a5;
import com.zykj.mistake.feature.notebook.detail.C4819j3;
import com.zykj.mistake.feature.notebook.detail.C4849o3;
import com.zykj.mistake.feature.notebook.detail.C4852p0;
import com.zykj.mistake.feature.notebook.detail.C4872s2;
import com.zykj.mistake.feature.notebook.detail.MistakeDetailNewContract$DetailTab;
import com.zykj.mistake.feature.notebook.list.C4927a;
import com.zykj.mistake.feature.notebook.list.C4941e1;
import com.zykj.mistake.feature.notebook.list.C4985w0;
import com.zykj.mistake.feature.notebook.list.MistakeNotebookViewModel;
import com.zykj.mistake.fragment.NoteFragment;
import com.zykj.mistake.main.AbstractC5053j;
import com.zykj.mistake.main.AbstractC5057l;
import com.zykj.mistake.main.C5025c;
import com.zykj.mistake.main.C5050h0;
import com.zykj.mistake.main.C5066p;
import com.zykj.mistake.main.C5087z0;
import com.zykj.mistake.main.MainShellViewModel;
import com.zykj.mistake.main.RemoveDialogTarget;
import com.zykj.mistake.main.drawer.AbstractC5041l;
import com.zykj.mistake.utils.C5100e;
import com.zykj.mistake.utils.C5103h;
import com.zykj.mistake.utils.C5106k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.AbstractC5785e0;
import kotlin.collections.AbstractC5805t;
import kotlin.collections.AbstractC5806u;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.C5823d;
import kotlinx.serialization.json.JsonNames;
import kotlinx.serialization.json.internal.AbstractC6029j;
import kotlinx.serialization.json.internal.JsonException;
import p045d6.C5443s;
import p101k7.C5769k;
import p101k7.InterfaceC5765g;
import p118m7.C6187x;
import p118m7.C6190y;
import p119n.InterfaceC6201f;
import p125n7.AbstractC6227b;
import p125n7.C6232g;
import p137p4.C6390i;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6471c;

/* renamed from: androidx.navigation.e */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2857e implements InterfaceC6469a {

    /* renamed from: a */
    public final /* synthetic */ int f1304a;

    /* renamed from: b */
    public final /* synthetic */ Object f1305b;

    /* renamed from: c */
    public final /* synthetic */ Object f1306c;

    public /* synthetic */ C2857e(int i, Object obj, Object obj2) {
        this.f1304a = i;
        this.f1306c = obj;
        this.f1305b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p152r6.InterfaceC6469a
    public final Object invoke() {
        Object next;
        int i;
        Object next2;
        Object next3;
        String[] strArrNames;
        switch (this.f1304a) {
            case 0:
                return NavController.NavControllerNavigatorState.markTransitionComplete$lambda$1((NavController.NavControllerNavigatorState) this.f1306c, (NavBackStackEntry) this.f1305b);
            case 1:
                return DialogHostKt.DialogHost$lambda$5$lambda$4$lambda$3((DialogNavigator) this.f1306c, (NavBackStackEntry) this.f1305b);
            case 2:
                return AbstractC5806u.m5286y(new Pair((InterfaceC6201f) this.f1306c, (C5823d) this.f1305b));
            case 3:
                ((InterfaceC6471c) this.f1306c).invoke(new C4542r(((C4536n) this.f1305b).f6274a));
                return C5443s.f8405a;
            case 4:
                LazyGridState lazyGridState = (LazyGridState) this.f1306c;
                List list = (List) this.f1305b;
                LazyGridItemInfo lazyGridItemInfo = (LazyGridItemInfo) AbstractC5805t.m5236p0(lazyGridState.getLayoutInfo().getVisibleItemsInfo());
                return Boolean.valueOf((lazyGridItemInfo != null ? lazyGridItemInfo.getIndex() : 0) >= AbstractC5806u.m5282u(list) + (-3));
            case 5:
                ((InterfaceC6471c) this.f1306c).invoke(Long.valueOf(((C4607n) this.f1305b).f6510a));
                return C5443s.f8405a;
            case 6:
                ((InterfaceC6471c) this.f1306c).invoke((Integer) this.f1305b);
                return C5443s.f8405a;
            case 7:
                ((InterfaceC6471c) this.f1306c).invoke(new C4872s2(((C4852p0) this.f1305b).f7241c, null, null));
                return C5443s.f8405a;
            case 8:
                ((InterfaceC6471c) this.f1306c).invoke((C4819j3) this.f1305b);
                return C5443s.f8405a;
            case 9:
                ((InterfaceC6471c) this.f1306c).invoke((C4849o3) this.f1305b);
                return C5443s.f8405a;
            case 10:
                ((InterfaceC6471c) this.f1306c).invoke((MistakeDetailNewContract$DetailTab) this.f1305b);
                return C5443s.f8405a;
            case 11:
                C4764a5 c4764a5 = (C4764a5) this.f1306c;
                MutableState mutableState = (MutableState) this.f1305b;
                mutableState.setValue(Boolean.valueOf(!((Boolean) mutableState.getValue()).booleanValue()));
                c4764a5.f6896c = ((Boolean) mutableState.getValue()).booleanValue();
                c4764a5.m4167c();
                return C5443s.f8405a;
            case 12:
                ((InterfaceC6471c) this.f1306c).invoke(((C4927a) this.f1305b).f7456a);
                return C5443s.f8405a;
            case 13:
                LazyGridState lazyGridState2 = (LazyGridState) this.f1306c;
                C4941e1 c4941e1 = (C4941e1) this.f1305b;
                LazyGridItemInfo lazyGridItemInfo2 = (LazyGridItemInfo) AbstractC5805t.m5236p0(lazyGridState2.getLayoutInfo().getVisibleItemsInfo());
                return Boolean.valueOf((lazyGridItemInfo2 != null ? lazyGridItemInfo2.getIndex() : 0) >= AbstractC5806u.m5282u(c4941e1.f7504d) + (-3));
            case 14:
                MainShellViewModel mainShellViewModel = (MainShellViewModel) this.f1306c;
                MistakeNotebookViewModel mistakeNotebookViewModel = (MistakeNotebookViewModel) this.f1305b;
                mainShellViewModel.f7817i = true;
                mistakeNotebookViewModel.m4293c(C4985w0.f7621a);
                return C5443s.f8405a;
            case 15:
                RemoveDialogTarget removeDialogTarget = (RemoveDialogTarget) this.f1306c;
                MainShellViewModel mainShellViewModel2 = (MainShellViewModel) this.f1305b;
                int i8 = AbstractC5053j.f7925a[removeDialogTarget.ordinal()];
                if (i8 == 1) {
                    C5100e.m4458b(6, "MistakeListManageDeleteConfirm", null);
                } else if (i8 == 2) {
                    C5100e.m4458b(6, "MistakeDetailRemove", null);
                } else if (i8 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                mainShellViewModel2.m4354b(new C5050h0(removeDialogTarget));
                return C5443s.f8405a;
            case 16:
                ((InterfaceC6471c) this.f1306c).invoke(((C5025c) ((AbstractC5057l) this.f1305b)).f7836a);
                return C5443s.f8405a;
            case 17:
                C5066p c5066p = (C5066p) this.f1306c;
                InterfaceC6469a interfaceC6469a = (InterfaceC6469a) this.f1305b;
                if (!c5066p.f7944f || c5066p.f7941c == 3) {
                    interfaceC6469a.invoke();
                } else {
                    interfaceC6469a.invoke();
                }
                return C5443s.f8405a;
            case 18:
                ((InterfaceC6471c) this.f1306c).invoke((CustomTagInfo) this.f1305b);
                return C5443s.f8405a;
            case 19:
                AbstractC5041l.m4375g((SnapshotStateList) this.f1306c, (CustomTagInfo) this.f1305b, false);
                return C5443s.f8405a;
            case 20:
                InterfaceC6471c interfaceC6471c = (InterfaceC6471c) this.f1306c;
                SnapshotStateList<CustomTagInfo> snapshotStateList = (SnapshotStateList) this.f1305b;
                Iterator<T> it = snapshotStateList.iterator();
                while (true) {
                    if (it.hasNext()) {
                        next = it.next();
                        if (((CustomTagInfo) next).getLocalType() == 0) {
                        }
                    } else {
                        next = null;
                    }
                }
                CustomTagInfo customTagInfo = (CustomTagInfo) next;
                Integer numValueOf = customTagInfo != null ? Integer.valueOf((int) customTagInfo.getId()) : null;
                Iterator<T> it2 = snapshotStateList.iterator();
                while (true) {
                    i = 1;
                    if (it2.hasNext()) {
                        next2 = it2.next();
                        if (((CustomTagInfo) next2).getLocalType() == 1) {
                        }
                    } else {
                        next2 = null;
                    }
                }
                CustomTagInfo customTagInfo2 = (CustomTagInfo) next2;
                Integer numValueOf2 = customTagInfo2 != null ? Integer.valueOf((int) customTagInfo2.getId()) : null;
                Iterator<T> it3 = snapshotStateList.iterator();
                while (true) {
                    if (it3.hasNext()) {
                        next3 = it3.next();
                        if (((CustomTagInfo) next3).getLocalType() == 2) {
                        }
                    } else {
                        next3 = null;
                    }
                }
                CustomTagInfo customTagInfo3 = (CustomTagInfo) next3;
                Integer numValueOf3 = customTagInfo3 != null ? Integer.valueOf((int) customTagInfo3.getId()) : null;
                ArrayList arrayList = new ArrayList();
                for (Object obj : snapshotStateList) {
                    if (((CustomTagInfo) obj).getLocalType() == -1) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList(AbstractC5806u.m5277p(snapshotStateList, 10));
                for (CustomTagInfo customTagInfo4 : snapshotStateList) {
                    String name = customTagInfo4.getName();
                    int localType = customTagInfo4.getLocalType();
                    MistakeTagType mistakeTagType = localType != 0 ? localType != i ? localType != 2 ? MistakeTagType.BLUE : MistakeTagType.ORANGE : MistakeTagType.GREEN : MistakeTagType.RED;
                    Long lValueOf = Long.valueOf(customTagInfo4.getId());
                    if (customTagInfo4.getLocalType() != -1) {
                        lValueOf = null;
                    }
                    arrayList2.add(new C6390i(name, mistakeTagType, lValueOf != null ? Integer.valueOf((int) lValueOf.longValue()) : null));
                    i = 1;
                }
                ArrayList arrayList3 = new ArrayList(AbstractC5806u.m5277p(arrayList, 10));
                int size = arrayList.size();
                int i9 = 0;
                while (i9 < size) {
                    Object obj2 = arrayList.get(i9);
                    i9++;
                    arrayList3.add(Integer.valueOf((int) ((CustomTagInfo) obj2).getId()));
                }
                interfaceC6471c.invoke(new C5087z0(numValueOf, numValueOf2, numValueOf3, arrayList3, arrayList2));
                return C5443s.f8405a;
            case 21:
                C5106k c5106k = (C5106k) this.f1306c;
                State state = (State) this.f1305b;
                long jLongValue = ((Number) c5106k.f8049b.invoke()).longValue();
                Long l = c5106k.f8050c;
                if (l == null || jLongValue - l.longValue() >= c5106k.f8048a) {
                    c5106k.f8050c = Long.valueOf(jLongValue);
                    ((InterfaceC6469a) state.getValue()).invoke();
                }
                return C5443s.f8405a;
            case 22:
                InterfaceC5765g interfaceC5765g = (InterfaceC5765g) this.f1306c;
                AbstractC6227b abstractC6227b = (AbstractC6227b) this.f1305b;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                C6232g c6232g = abstractC6227b.f9966a;
                AbstractC6029j.m5694o(interfaceC5765g, abstractC6227b);
                int iMo5101d = interfaceC5765g.mo5101d();
                for (int i10 = 0; i10 < iMo5101d; i10++) {
                    List listMo5103f = interfaceC5765g.mo5103f(i10);
                    ArrayList arrayList4 = new ArrayList();
                    for (Object obj3 : listMo5103f) {
                        if (obj3 instanceof JsonNames) {
                            arrayList4.add(obj3);
                        }
                    }
                    JsonNames jsonNames = (JsonNames) (arrayList4.size() == 1 ? arrayList4.get(0) : null);
                    if (jsonNames != null && (strArrNames = jsonNames.names()) != null) {
                        for (String str : strArrNames) {
                            String str2 = AbstractC5830k.m5325b(interfaceC5765g.getKind(), C5769k.f9145b) ? "enum value" : "property";
                            if (linkedHashMap.containsKey(str)) {
                                throw new JsonException("The suggested name '" + str + "' for " + str2 + ' ' + interfaceC5765g.mo5102e(i10) + " is already one of the names for " + str2 + ' ' + interfaceC5765g.mo5102e(((Number) AbstractC5785e0.m5148B(linkedHashMap, str)).intValue()) + " in " + interfaceC5765g);
                            }
                            linkedHashMap.put(str, Integer.valueOf(i10));
                        }
                    }
                }
                return linkedHashMap.isEmpty() ? AbstractC5785e0.m5147A() : linkedHashMap;
            case 23:
                C6190y c6190y = (C6190y) this.f1306c;
                String str3 = (String) this.f1305b;
                Enum[] enumArr = (Enum[]) c6190y.f9894b;
                C6187x c6187x = new C6187x(str3, enumArr.length);
                for (Enum r02 : enumArr) {
                    c6187x.m5821j(r02.name(), false);
                }
                return c6187x;
            default:
                ((NoteFragment) this.f1306c).m4338k(((C5103h) this.f1305b).m4469d());
                return C5443s.f8405a;
        }
    }
}
