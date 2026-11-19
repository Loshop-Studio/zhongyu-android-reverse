package androidx.compose.p011ui.text.android;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.AbstractC5806u;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;

@Metadata(m5109d1 = {"\u0000\"\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u001f\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a?\u0010\u0005\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\u0002H\u0080\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a_\u0010\f\u001a\u00028\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0007\"\u0010\b\u0002\u0010\t*\n\u0012\u0006\b\u0000\u0012\u00028\u00010\b*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\n\u001a\u00028\u00022\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002H\u0080\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0004\b\f\u0010\r\u001aQ\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0007*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000eH\u0080\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m5110d2 = {ExifInterface.GPS_DIRECTION_TRUE, "", "Lkotlin/Function1;", "Ld6/s;", "action", "fastForEach", "(Ljava/util/List;Lr6/c;)V", "R", "", "C", "destination", "transform", "fastMapTo", "(Ljava/util/List;Ljava/util/Collection;Lr6/c;)Ljava/util/Collection;", "Lkotlin/Function2;", "fastZipWithNext", "(Ljava/util/List;Lr6/e;)Ljava/util/List;", "ui-text_release"}, m5111k = 2, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nListUtils.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListUtils.android.kt\nandroidx/compose/ui/text/android/ListUtils_androidKt\n*L\n1#1,84:1\n33#1,6:85\n*S KotlinDebug\n*F\n+ 1 ListUtils.android.kt\nandroidx/compose/ui/text/android/ListUtils_androidKt\n*L\n55#1:85,6\n*E\n"})
/* loaded from: classes2.dex */
public final class ListUtils_androidKt {
    public static final <T> void fastForEach(@NotNull List<? extends T> list, @NotNull InterfaceC6471c interfaceC6471c) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            interfaceC6471c.invoke(list.get(i));
        }
    }

    @NotNull
    public static final <T, R, C extends Collection<? super R>> C fastMapTo(@NotNull List<? extends T> list, @NotNull C c, @NotNull InterfaceC6471c interfaceC6471c) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            c.add(interfaceC6471c.invoke(list.get(i)));
        }
        return c;
    }

    @NotNull
    public static final <T, R> List<R> fastZipWithNext(@NotNull List<? extends T> list, @NotNull InterfaceC6473e interfaceC6473e) {
        if (list.size() <= 1) {
            return EmptyList.INSTANCE;
        }
        ArrayList arrayList = new ArrayList();
        int i = 0;
        T t8 = list.get(0);
        int iM5282u = AbstractC5806u.m5282u(list);
        while (i < iM5282u) {
            i++;
            T t9 = list.get(i);
            arrayList.add(interfaceC6473e.invoke(t8, t9));
            t8 = t9;
        }
        return arrayList;
    }
}
