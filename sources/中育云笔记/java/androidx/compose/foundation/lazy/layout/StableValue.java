package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.AbstractC9979u;

@Stable
/* loaded from: classes.dex */
final class StableValue<T> {
    private final T value;

    /* JADX WARN: Multi-variable type inference failed */
    private /* synthetic */ StableValue(Object obj) {
        this.value = obj;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ StableValue m27652boximpl(Object obj) {
        return new StableValue(obj);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static <T> Object m27653constructorimpl(T t10) {
        return t10;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m27654equalsimpl(Object obj, Object obj2) {
        return (obj2 instanceof StableValue) && AbstractC9979u.m20289b(obj, ((StableValue) obj2).m27658unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m27655equalsimpl0(Object obj, Object obj2) {
        return AbstractC9979u.m20289b(obj, obj2);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m27656hashCodeimpl(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m27657toStringimpl(Object obj) {
        return "StableValue(value=" + obj + ')';
    }

    public boolean equals(Object obj) {
        return m27654equalsimpl(this.value, obj);
    }

    public final T getValue() {
        return this.value;
    }

    public int hashCode() {
        return m27656hashCodeimpl(this.value);
    }

    public String toString() {
        return m27657toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ Object m27658unboximpl() {
        return this.value;
    }
}
