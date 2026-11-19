package androidx.compose.p013ui.text.android;

import androidx.exifinterface.media.ExifInterface;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import p003a1.C0008a;

@Metadata(m13557d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001f\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u001a8\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00010\u0005H\u0080\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u001a]\u0010\u0006\u001a\u0002H\u0007\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\b\"\u0010\b\u0002\u0010\u0007*\n\u0012\u0006\b\u0000\u0012\u0002H\b0\t*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0006\u0010\n\u001a\u0002H\u00072\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\b0\u0005H\u0080\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0002\u0010\f\u001aJ\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\b0\u0003\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\b*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\b0\u000eH\u0080\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¨\u0006\u000f"}, m13558d2 = {"fastForEach", "", ExifInterface.GPS_DIRECTION_TRUE, "", "action", "Lkotlin/Function1;", "fastMapTo", "C", "R", "", "destination", "transform", "(Ljava/util/List;Ljava/util/Collection;Lkotlin/jvm/functions/Function1;)Ljava/util/Collection;", "fastZipWithNext", "Lkotlin/Function2;", "ui-text_release"}, m13559k = 2, m13560mv = {1, 9, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nListUtils.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListUtils.android.kt\nandroidx/compose/ui/text/android/ListUtils_androidKt\n*L\n1#1,84:1\n33#1,6:85\n*S KotlinDebug\n*F\n+ 1 ListUtils.android.kt\nandroidx/compose/ui/text/android/ListUtils_androidKt\n*L\n55#1:85,6\n*E\n"})
/* loaded from: classes2.dex */
public final class ListUtils_androidKt {
    public static final <T> void fastForEach(List<? extends T> list, Function1<? super T, Unit> function1) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            function1.invoke(list.get(i10));
        }
    }

    public static final <T, R, C extends Collection<? super R>> C fastMapTo(List<? extends T> list, C c10, Function1<? super T, ? extends R> function1) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            c10.add(function1.invoke(list.get(i10)));
        }
        return c10;
    }

    public static final <T, R> List<R> fastZipWithNext(List<? extends T> list, Function2<? super T, ? super T, ? extends R> function2) {
        if (list.size() <= 1) {
            return CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        C0008a c0008a = list.get(0);
        int lastIndex = CollectionsKt.getLastIndex(list);
        while (i10 < lastIndex) {
            i10++;
            T t10 = list.get(i10);
            arrayList.add(function2.invoke(c0008a, t10));
            c0008a = t10;
        }
        return arrayList;
    }
}
