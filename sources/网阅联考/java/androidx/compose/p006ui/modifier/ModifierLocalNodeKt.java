package androidx.compose.p006ui.modifier;

import androidx.compose.p006ui.ExperimentalComposeUiApi;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m5174d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u001a\b\u0010\u0000\u001a\u00020\u0001H\u0007\u001a\u001c\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004H\u0007\u001a)\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0005\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00040\u0006\"\u0006\u0012\u0002\b\u00030\u0004H\u0007¢\u0006\u0002\u0010\u0007\u001aA\u0010\u0000\u001a\u00020\u000122\u0010\b\u001a\u001a\u0012\u0016\b\u0001\u0012\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0004\u0012\u00020\n0\t0\u0006\"\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0004\u0012\u00020\n0\tH\u0007¢\u0006\u0002\u0010\u000b\u001a(\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0018\u0010\f\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u0004\u0012\u0004\u0012\u0002H\u00020\tH\u0007¨\u0006\r"}, m5175d2 = {"modifierLocalMapOf", "Landroidx/compose/ui/modifier/ModifierLocalMap;", ExifInterface.GPS_DIRECTION_TRUE, "key", "Landroidx/compose/ui/modifier/ModifierLocal;", "keys", "", "([Landroidx/compose/ui/modifier/ModifierLocal;)Landroidx/compose/ui/modifier/ModifierLocalMap;", "entries", "Lkotlin/Pair;", "", "([Lkotlin/Pair;)Landroidx/compose/ui/modifier/ModifierLocalMap;", "entry", "ui_release"}, m5176k = 2, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nModifierLocalNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModifierLocalNode.kt\nandroidx/compose/ui/modifier/ModifierLocalNodeKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,220:1\n1#2:221\n11335#3:222\n11670#3,3:223\n37#4,2:226\n*S KotlinDebug\n*F\n+ 1 ModifierLocalNode.kt\nandroidx/compose/ui/modifier/ModifierLocalNodeKt\n*L\n209#1:222\n209#1:223,3\n209#1:226,2\n*E\n"})
/* loaded from: classes.dex */
public final class ModifierLocalNodeKt {
    @ExperimentalComposeUiApi
    public static final ModifierLocalMap modifierLocalMapOf() {
        return EmptyMap.INSTANCE;
    }

    @ExperimentalComposeUiApi
    public static final <T> ModifierLocalMap modifierLocalMapOf(ModifierLocal<T> key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return new SingleLocalMap(key);
    }

    @ExperimentalComposeUiApi
    public static final <T> ModifierLocalMap modifierLocalMapOf(Pair<? extends ModifierLocal<T>, ? extends T> entry) {
        Intrinsics.checkNotNullParameter(entry, "entry");
        SingleLocalMap singleLocalMap = new SingleLocalMap(entry.getFirst());
        singleLocalMap.mo10656set$ui_release(entry.getFirst(), entry.getSecond());
        return singleLocalMap;
    }

    @ExperimentalComposeUiApi
    public static final ModifierLocalMap modifierLocalMapOf(Pair<? extends ModifierLocal<?>, ? extends Object>... entries) {
        Intrinsics.checkNotNullParameter(entries, "entries");
        return new MultiLocalMap((Pair[]) Arrays.copyOf(entries, entries.length));
    }

    @ExperimentalComposeUiApi
    public static final ModifierLocalMap modifierLocalMapOf(ModifierLocal<?>... keys) {
        Intrinsics.checkNotNullParameter(keys, "keys");
        ArrayList arrayList = new ArrayList(keys.length);
        for (ModifierLocal<?> modifierLocal : keys) {
            arrayList.add(TuplesKt.m5182to(modifierLocal, null));
        }
        Pair[] pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
        return new MultiLocalMap((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
    }
}
