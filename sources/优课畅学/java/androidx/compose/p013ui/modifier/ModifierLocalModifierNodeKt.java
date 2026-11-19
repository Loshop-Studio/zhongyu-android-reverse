package androidx.compose.p013ui.modifier;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.C9112b0;
import p123h7.AbstractC8726f;
import p123h7.InterfaceC8721a;
import p134i7.AbstractC8801r;

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
        SingleLocalMap singleLocalMap = new SingleLocalMap((ModifierLocal) pair.m15906e());
        singleLocalMap.mo25734set$ui_release((ModifierLocal) pair.m15906e(), pair.m15907g());
        return singleLocalMap;
    }

    public static final ModifierLocalMap modifierLocalMapOf(ModifierLocal<?> modifierLocal, ModifierLocal<?> modifierLocal2, ModifierLocal<?>... modifierLocalArr) {
        Pair pairM14230a = AbstractC8726f.m14230a(modifierLocal, null);
        C9112b0 c9112b0 = new C9112b0(2);
        c9112b0.m16088a(AbstractC8726f.m14230a(modifierLocal2, null));
        ArrayList arrayList = new ArrayList(modifierLocalArr.length);
        for (ModifierLocal<?> modifierLocal3 : modifierLocalArr) {
            arrayList.add(AbstractC8726f.m14230a(modifierLocal3, null));
        }
        c9112b0.m16089b(arrayList.toArray(new Pair[0]));
        return new MultiLocalMap(pairM14230a, (Pair[]) c9112b0.m16091d(new Pair[c9112b0.m16090c()]));
    }

    public static final ModifierLocalMap modifierLocalMapOf(Pair<? extends ModifierLocal<?>, ? extends Object> pair, Pair<? extends ModifierLocal<?>, ? extends Object> pair2, Pair<? extends ModifierLocal<?>, ? extends Object>... pairArr) {
        C9112b0 c9112b0 = new C9112b0(2);
        c9112b0.m16088a(pair2);
        c9112b0.m16089b(pairArr);
        return new MultiLocalMap(pair, (Pair[]) c9112b0.m16091d(new Pair[c9112b0.m16090c()]));
    }

    @InterfaceC8721a
    public static final /* synthetic */ ModifierLocalMap modifierLocalMapOf(ModifierLocal... modifierLocalArr) {
        int length = modifierLocalArr.length;
        if (length == 0) {
            return EmptyMap.INSTANCE;
        }
        if (length != 1) {
            Pair pairM14230a = AbstractC8726f.m14230a(AbstractC8801r.m14735u0(modifierLocalArr), null);
            List listM14727q0 = AbstractC8801r.m14727q0(modifierLocalArr, 1);
            ArrayList arrayList = new ArrayList(listM14727q0.size());
            int size = listM14727q0.size();
            for (int i10 = 0; i10 < size; i10++) {
                arrayList.add(AbstractC8726f.m14230a((ModifierLocal) listM14727q0.get(i10), null));
            }
            Pair[] pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
            return new MultiLocalMap(pairM14230a, (Pair[]) Arrays.copyOf(pairArr, pairArr.length));
        }
        return new SingleLocalMap((ModifierLocal) AbstractC8801r.m14735u0(modifierLocalArr));
    }

    @InterfaceC8721a
    public static final /* synthetic */ ModifierLocalMap modifierLocalMapOf(Pair... pairArr) {
        int length = pairArr.length;
        if (length == 0) {
            return EmptyMap.INSTANCE;
        }
        if (length != 1) {
            Pair pair = (Pair) AbstractC8801r.m14735u0(pairArr);
            Pair[] pairArr2 = (Pair[]) AbstractC8801r.m14727q0(pairArr, 1).toArray(new Pair[0]);
            return new MultiLocalMap(pair, (Pair[]) Arrays.copyOf(pairArr2, pairArr2.length));
        }
        return new MultiLocalMap((Pair) AbstractC8801r.m14735u0(pairArr), new Pair[0]);
    }
}
