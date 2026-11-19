package androidx.compose.p006ui;

import androidx.compose.p006ui.node.ModifierNodeElement;
import androidx.compose.p006ui.platform.InspectorInfo;
import androidx.compose.p006ui.platform.ValueElementSequence;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.umeng.analytics.pro.C3335ai;
import java.lang.reflect.Field;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m5174d1 = {"\u0000 \n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0000\u001a\u0018\u0010\u0005\u001a\u00020\u0006*\u00020\u00072\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\tH\u0000¨\u0006\n"}, m5175d2 = {"areObjectsOfSameType", "", C3335ai.f1705at, "", "b", "tryPopulateReflectively", "", "Landroidx/compose/ui/platform/InspectorInfo;", "element", "Landroidx/compose/ui/node/ModifierNodeElement;", "ui_release"}, m5176k = 2, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nActual.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Actual.kt\nandroidx/compose/ui/ActualKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,50:1\n6442#2:51\n33#3,6:52\n*S KotlinDebug\n*F\n+ 1 Actual.kt\nandroidx/compose/ui/ActualKt\n*L\n35#1:51\n36#1:52,6\n*E\n"})
/* loaded from: classes.dex */
public final class ActualKt {
    public static final boolean areObjectsOfSameType(Object a4, Object b4) {
        Intrinsics.checkNotNullParameter(a4, "a");
        Intrinsics.checkNotNullParameter(b4, "b");
        return a4.getClass() == b4.getClass();
    }

    public static final void tryPopulateReflectively(InspectorInfo inspectorInfo, ModifierNodeElement<?> element) {
        Intrinsics.checkNotNullParameter(inspectorInfo, "<this>");
        Intrinsics.checkNotNullParameter(element, "element");
        Field[] declaredFields = element.getClass().getDeclaredFields();
        Intrinsics.checkNotNullExpressionValue(declaredFields, "element.javaClass.declaredFields");
        List listSortedWith = ArraysKt___ArraysKt.sortedWith(declaredFields, new Comparator() { // from class: androidx.compose.ui.ActualKt$tryPopulateReflectively$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t3, T t4) {
                return ComparisonsKt__ComparisonsKt.compareValues(((Field) t3).getName(), ((Field) t4).getName());
            }
        });
        int size = listSortedWith.size();
        for (int i4 = 0; i4 < size; i4++) {
            Field field = (Field) listSortedWith.get(i4);
            if (!field.getDeclaringClass().isAssignableFrom(ModifierNodeElement.class)) {
                try {
                    field.setAccessible(true);
                    ValueElementSequence properties = inspectorInfo.getProperties();
                    String name = field.getName();
                    Intrinsics.checkNotNullExpressionValue(name, "field.name");
                    properties.set(name, field.get(element));
                } catch (IllegalAccessException | SecurityException unused) {
                }
            }
        }
    }
}
