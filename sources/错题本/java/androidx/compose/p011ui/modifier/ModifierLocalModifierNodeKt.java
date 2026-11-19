package androidx.compose.p011ui.modifier;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.AbstractC5802q;
import kotlin.jvm.internal.C5834o;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(m5109d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\u001a\u0006\u0010\u0000\u001a\u00020\u0001\u001a?\u0010\u0000\u001a\u00020\u00012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u00032\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00032\u001a\u0010\u0005\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00030\u0006\"\u0006\u0012\u0002\b\u00030\u0003¢\u0006\u0002\u0010\u0007\u001a\u001a\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\b0\u0003\u001a)\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0005\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00030\u0006\"\u0006\u0012\u0002\b\u00030\u0003H\u0007¢\u0006\u0002\u0010\n\u001aA\u0010\u0000\u001a\u00020\u000122\u0010\u000b\u001a\u001a\u0012\u0016\b\u0001\u0012\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0004\u0012\u00020\r0\f0\u0006\"\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0004\u0012\u00020\r0\fH\u0007¢\u0006\u0002\u0010\u000e\u001ao\u0010\u0000\u001a\u00020\u00012\u0016\u0010\u000f\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0004\u0012\u00020\r0\f2\u0016\u0010\u0010\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0004\u0012\u00020\r0\f22\u0010\u000b\u001a\u001a\u0012\u0016\b\u0001\u0012\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0004\u0012\u00020\r0\f0\u0006\"\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0002\u0010\u0011\u001a&\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\b2\u0018\u0010\u0012\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\b0\u0003\u0012\u0004\u0012\u0002H\b0\f¨\u0006\u0013"}, m5110d2 = {"modifierLocalMapOf", "Landroidx/compose/ui/modifier/ModifierLocalMap;", "key1", "Landroidx/compose/ui/modifier/ModifierLocal;", "key2", "keys", "", "(Landroidx/compose/ui/modifier/ModifierLocal;Landroidx/compose/ui/modifier/ModifierLocal;[Landroidx/compose/ui/modifier/ModifierLocal;)Landroidx/compose/ui/modifier/ModifierLocalMap;", ExifInterface.GPS_DIRECTION_TRUE, "key", "([Landroidx/compose/ui/modifier/ModifierLocal;)Landroidx/compose/ui/modifier/ModifierLocalMap;", "entries", "Lkotlin/Pair;", "", "([Lkotlin/Pair;)Landroidx/compose/ui/modifier/ModifierLocalMap;", "entry1", "entry2", "(Lkotlin/Pair;Lkotlin/Pair;[Lkotlin/Pair;)Landroidx/compose/ui/modifier/ModifierLocalMap;", "entry", "ui_release"}, m5111k = 2, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nModifierLocalModifierNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModifierLocalModifierNode.kt\nandroidx/compose/ui/modifier/ModifierLocalModifierNodeKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 5 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,235:1\n1#2:236\n11065#3:237\n11400#3,3:238\n37#4,2:241\n37#4,2:253\n37#4,2:255\n150#5,3:243\n34#5,6:246\n153#5:252\n*S KotlinDebug\n*F\n+ 1 ModifierLocalModifierNode.kt\nandroidx/compose/ui/modifier/ModifierLocalModifierNodeKt\n*L\n198#1:237\n198#1:238,3\n198#1:241,2\n221#1:253,2\n233#1:255,2\n221#1:243,3\n221#1:246,6\n221#1:252\n*E\n"})
/* loaded from: classes2.dex */
public final class ModifierLocalModifierNodeKt {
    @NotNull
    public static final ModifierLocalMap modifierLocalMapOf(@NotNull ModifierLocal<?> modifierLocal, @NotNull ModifierLocal<?> modifierLocal2, @NotNull ModifierLocal<?>... modifierLocalArr) {
        Pair pair = new Pair(modifierLocal, null);
        C5834o c5834o = new C5834o(2);
        c5834o.m5343a(new Pair(modifierLocal2, null));
        ArrayList arrayList = new ArrayList(modifierLocalArr.length);
        for (ModifierLocal<?> modifierLocal3 : modifierLocalArr) {
            arrayList.add(new Pair(modifierLocal3, null));
        }
        c5834o.m5346d(arrayList.toArray(new Pair[0]));
        ArrayList arrayList2 = c5834o.f9224a;
        return new MultiLocalMap(pair, (Pair[]) arrayList2.toArray(new Pair[arrayList2.size()]));
    }

    @NotNull
    public static final ModifierLocalMap modifierLocalMapOf() {
        return EmptyMap.INSTANCE;
    }

    @NotNull
    public static final <T> ModifierLocalMap modifierLocalMapOf(@NotNull ModifierLocal<T> modifierLocal) {
        return new SingleLocalMap(modifierLocal);
    }

    @NotNull
    public static final <T> ModifierLocalMap modifierLocalMapOf(@NotNull Pair<? extends ModifierLocal<T>, ? extends T> pair) {
        SingleLocalMap singleLocalMap = new SingleLocalMap(pair.getFirst());
        singleLocalMap.mo12140set$ui_release(pair.getFirst(), pair.getSecond());
        return singleLocalMap;
    }

    @NotNull
    public static final ModifierLocalMap modifierLocalMapOf(@NotNull Pair<? extends ModifierLocal<?>, ? extends Object> pair, @NotNull Pair<? extends ModifierLocal<?>, ? extends Object> pair2, @NotNull Pair<? extends ModifierLocal<?>, ? extends Object>... pairArr) {
        C5834o c5834o = new C5834o(2);
        c5834o.m5343a(pair2);
        c5834o.m5346d(pairArr);
        ArrayList arrayList = c5834o.f9224a;
        return new MultiLocalMap(pair, (Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Use a different overloaded version of this function")
    public static final ModifierLocalMap modifierLocalMapOf(ModifierLocal... modifierLocalArr) {
        int length = modifierLocalArr.length;
        if (length == 0) {
            return EmptyMap.INSTANCE;
        }
        if (length != 1) {
            Pair pair = new Pair(AbstractC5802q.m5191R(modifierLocalArr), null);
            List listM5185L = AbstractC5802q.m5185L(1, modifierLocalArr);
            ArrayList arrayList = new ArrayList(listM5185L.size());
            int size = listM5185L.size();
            for (int i = 0; i < size; i++) {
                arrayList.add(new Pair((ModifierLocal) listM5185L.get(i), null));
            }
            Pair[] pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
            return new MultiLocalMap(pair, (Pair[]) Arrays.copyOf(pairArr, pairArr.length));
        }
        return new SingleLocalMap((ModifierLocal) AbstractC5802q.m5191R(modifierLocalArr));
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Use a different overloaded version of this function")
    public static final /* synthetic */ ModifierLocalMap modifierLocalMapOf(Pair... pairArr) {
        int length = pairArr.length;
        if (length == 0) {
            return EmptyMap.INSTANCE;
        }
        if (length != 1) {
            Pair pair = (Pair) AbstractC5802q.m5191R(pairArr);
            Pair[] pairArr2 = (Pair[]) AbstractC5802q.m5185L(1, pairArr).toArray(new Pair[0]);
            return new MultiLocalMap(pair, (Pair[]) Arrays.copyOf(pairArr2, pairArr2.length));
        }
        return new MultiLocalMap((Pair) AbstractC5802q.m5191R(pairArr), new Pair[0]);
    }
}
