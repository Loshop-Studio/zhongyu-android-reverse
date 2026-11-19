package androidx.compose.p014ui.layout;

import androidx.compose.p014ui.Modifier;
import androidx.compose.runtime.Stable;

/* loaded from: classes2.dex */
public final class LayoutIdKt {
    public static final Object getLayoutId(Measurable measurable) {
        Object parentData = measurable.getParentData();
        LayoutIdParentData layoutIdParentData = parentData instanceof LayoutIdParentData ? (LayoutIdParentData) parentData : null;
        if (layoutIdParentData != null) {
            return layoutIdParentData.getLayoutId();
        }
        return null;
    }

    @Stable
    public static final Modifier layoutId(Modifier modifier, Object obj) {
        return modifier.then(new LayoutIdElement(obj));
    }
}
