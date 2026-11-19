package androidx.compose.p011ui;

import androidx.compose.p011ui.node.ModifierNodeElement;
import androidx.compose.p011ui.platform.InspectorInfo;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.AbstractC5802q;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p204y1.AbstractC6768a;

@Metadata(m5109d1 = {"\u0000\"\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0017\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001f\u0010\f\u001a\u00020\u000b*\u00020\b2\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\tH\u0000¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m5110d2 = {"", "a", "b", "", "areObjectsOfSameType", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "classKeyForObject", "(Ljava/lang/Object;)Ljava/lang/Object;", "Landroidx/compose/ui/platform/InspectorInfo;", "Landroidx/compose/ui/node/ModifierNodeElement;", "element", "Ld6/s;", "tryPopulateReflectively", "(Landroidx/compose/ui/platform/InspectorInfo;Landroidx/compose/ui/node/ModifierNodeElement;)V", "ui_release"}, m5111k = 2, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nActual.jvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Actual.jvm.kt\nandroidx/compose/ui/Actual_jvmKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,52:1\n6442#2:53\n34#3,6:54\n*S KotlinDebug\n*F\n+ 1 Actual.jvm.kt\nandroidx/compose/ui/Actual_jvmKt\n*L\n36#1:53\n37#1:54,6\n*E\n"})
/* loaded from: classes.dex */
public final class Actual_jvmKt {
    public static final boolean areObjectsOfSameType(@NotNull Object obj, @NotNull Object obj2) {
        return obj.getClass() == obj2.getClass();
    }

    @NotNull
    public static final Object classKeyForObject(@NotNull Object obj) {
        return obj.getClass();
    }

    public static final void tryPopulateReflectively(@NotNull InspectorInfo inspectorInfo, @NotNull ModifierNodeElement<?> modifierNodeElement) {
        Object[] declaredFields = modifierNodeElement.getClass().getDeclaredFields();
        Comparator comparator = new Comparator() { // from class: androidx.compose.ui.Actual_jvmKt$tryPopulateReflectively$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t8, T t9) {
                return AbstractC6768a.m6441f(((Field) t8).getName(), ((Field) t9).getName());
            }
        };
        AbstractC5830k.m5330g(declaredFields, "<this>");
        if (declaredFields.length != 0) {
            declaredFields = Arrays.copyOf(declaredFields, declaredFields.length);
            AbstractC5830k.m5329f(declaredFields, "copyOf(...)");
            if (declaredFields.length > 1) {
                Arrays.sort(declaredFields, comparator);
            }
        }
        List listM5208u = AbstractC5802q.m5208u(declaredFields);
        int size = listM5208u.size();
        for (int i = 0; i < size; i++) {
            Field field = (Field) listM5208u.get(i);
            if (!field.getDeclaringClass().isAssignableFrom(ModifierNodeElement.class)) {
                try {
                    field.setAccessible(true);
                    inspectorInfo.getProperties().set(field.getName(), field.get(modifierNodeElement));
                } catch (IllegalAccessException | SecurityException unused) {
                }
            }
        }
    }
}
