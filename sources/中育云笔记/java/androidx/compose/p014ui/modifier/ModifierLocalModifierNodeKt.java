package androidx.compose.p014ui.modifier;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.C9958b0;
import p309qc.AbstractC10776g;
import p309qc.InterfaceC10770a;
import p325rc.AbstractC10968r;

/* loaded from: classes2.dex */
public final class ModifierLocalModifierNodeKt {
    public static final ModifierLocalMap modifierLocalMapOf() {
        return EmptyMap.INSTANCE;
    }

    public static final <T> ModifierLocalMap modifierLocalMapOf(ModifierLocal<T> modifierLocal) {
        return new SingleLocalMap(modifierLocal);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> ModifierLocalMap modifierLocalMapOf(Pair<? extends ModifierLocal<T>, ? extends T> pair) {
        SingleLocalMap singleLocalMap = new SingleLocalMap((ModifierLocal) pair.m20051f());
        singleLocalMap.mo32336set$ui_release((ModifierLocal) pair.m20051f(), pair.m20052g());
        return singleLocalMap;
    }

    public static final ModifierLocalMap modifierLocalMapOf(ModifierLocal<?> modifierLocal, ModifierLocal<?> modifierLocal2, ModifierLocal<?>... modifierLocalArr) {
        Pair pairM22975a = AbstractC10776g.m22975a(modifierLocal, null);
        C9958b0 c9958b0 = new C9958b0(2);
        c9958b0.m20246a(AbstractC10776g.m22975a(modifierLocal2, null));
        ArrayList arrayList = new ArrayList(modifierLocalArr.length);
        for (ModifierLocal<?> modifierLocal3 : modifierLocalArr) {
            arrayList.add(AbstractC10776g.m22975a(modifierLocal3, null));
        }
        c9958b0.m20247b(arrayList.toArray(new Pair[0]));
        return new MultiLocalMap(pairM22975a, (Pair[]) c9958b0.m20249d(new Pair[c9958b0.m20248c()]));
    }

    public static final ModifierLocalMap modifierLocalMapOf(Pair<? extends ModifierLocal<?>, ? extends Object> pair, Pair<? extends ModifierLocal<?>, ? extends Object> pair2, Pair<? extends ModifierLocal<?>, ? extends Object>... pairArr) {
        C9958b0 c9958b0 = new C9958b0(2);
        c9958b0.m20246a(pair2);
        c9958b0.m20247b(pairArr);
        return new MultiLocalMap(pair, (Pair[]) c9958b0.m20249d(new Pair[c9958b0.m20248c()]));
    }

    @InterfaceC10770a
    public static final /* synthetic */ ModifierLocalMap modifierLocalMapOf(ModifierLocal... modifierLocalArr) {
        int length = modifierLocalArr.length;
        if (length == 0) {
            return EmptyMap.INSTANCE;
        }
        if (length != 1) {
            Pair pairM22975a = AbstractC10776g.m22975a(AbstractC10968r.m24104t0(modifierLocalArr), null);
            List listM24096p0 = AbstractC10968r.m24096p0(modifierLocalArr, 1);
            ArrayList arrayList = new ArrayList(listM24096p0.size());
            int size = listM24096p0.size();
            for (int i10 = 0; i10 < size; i10++) {
                arrayList.add(AbstractC10776g.m22975a((ModifierLocal) listM24096p0.get(i10), null));
            }
            Pair[] pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
            return new MultiLocalMap(pairM22975a, (Pair[]) Arrays.copyOf(pairArr, pairArr.length));
        }
        return new SingleLocalMap((ModifierLocal) AbstractC10968r.m24104t0(modifierLocalArr));
    }

    @InterfaceC10770a
    public static final /* synthetic */ ModifierLocalMap modifierLocalMapOf(Pair... pairArr) {
        int length = pairArr.length;
        if (length == 0) {
            return EmptyMap.INSTANCE;
        }
        if (length != 1) {
            Pair pair = (Pair) AbstractC10968r.m24104t0(pairArr);
            Pair[] pairArr2 = (Pair[]) AbstractC10968r.m24096p0(pairArr, 1).toArray(new Pair[0]);
            return new MultiLocalMap(pair, (Pair[]) Arrays.copyOf(pairArr2, pairArr2.length));
        }
        return new MultiLocalMap((Pair) AbstractC10968r.m24104t0(pairArr), new Pair[0]);
    }
}
