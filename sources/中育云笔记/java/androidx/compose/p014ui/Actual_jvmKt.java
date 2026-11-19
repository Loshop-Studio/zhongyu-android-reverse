package androidx.compose.p014ui;

import androidx.compose.p014ui.node.ModifierNodeElement;
import androidx.compose.p014ui.platform.InspectorInfo;
import java.lang.reflect.Field;
import java.util.Comparator;
import java.util.List;
import p325rc.AbstractC10968r;
import p364uc.AbstractC11382b;

/* loaded from: classes2.dex */
public final class Actual_jvmKt {
    public static final boolean areObjectsOfSameType(Object obj, Object obj2) {
        return obj.getClass() == obj2.getClass();
    }

    public static final Object classKeyForObject(Object obj) {
        return obj.getClass();
    }

    public static final void tryPopulateReflectively(InspectorInfo inspectorInfo, ModifierNodeElement<?> modifierNodeElement) {
        List listM24079g1 = AbstractC10968r.m24079g1(modifierNodeElement.getClass().getDeclaredFields(), new Comparator() { // from class: androidx.compose.ui.Actual_jvmKt$tryPopulateReflectively$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t10, T t11) {
                return AbstractC11382b.m25330d(((Field) t10).getName(), ((Field) t11).getName());
            }
        });
        int size = listM24079g1.size();
        for (int i10 = 0; i10 < size; i10++) {
            Field field = (Field) listM24079g1.get(i10);
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
