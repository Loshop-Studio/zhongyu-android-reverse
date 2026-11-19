package androidx.compose.p014ui.platform;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9979u;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class ValueElement {
    public static final int $stable = 8;
    private final String name;
    private final Object value;

    public ValueElement(String str, Object obj) {
        this.name = str;
        this.value = obj;
    }

    public static /* synthetic */ ValueElement copy$default(ValueElement valueElement, String str, Object obj, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            str = valueElement.name;
        }
        if ((i10 & 2) != 0) {
            obj = valueElement.value;
        }
        return valueElement.copy(str, obj);
    }

    public final String component1() {
        return this.name;
    }

    public final Object component2() {
        return this.value;
    }

    public final ValueElement copy(String str, Object obj) {
        return new ValueElement(str, obj);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ValueElement)) {
            return false;
        }
        ValueElement valueElement = (ValueElement) obj;
        return AbstractC9979u.m20289b(this.name, valueElement.name) && AbstractC9979u.m20289b(this.value, valueElement.value);
    }

    public final String getName() {
        return this.name;
    }

    public final Object getValue() {
        return this.value;
    }

    public int hashCode() {
        int iHashCode = this.name.hashCode() * 31;
        Object obj = this.value;
        return iHashCode + (obj == null ? 0 : obj.hashCode());
    }

    public String toString() {
        return "ValueElement(name=" + this.name + ", value=" + this.value + ')';
    }
}
