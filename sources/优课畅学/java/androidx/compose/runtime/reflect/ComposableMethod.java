package androidx.compose.runtime.reflect;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.StabilityInferred;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC9133u;
import p077d8.AbstractC8323h;
import p077d8.C8321f;
import p134i7.AbstractC8792m0;
import p134i7.AbstractC8797p;
import p134i7.AbstractC8801r;
import p134i7.AbstractC8809v;
import p134i7.AbstractC8811w;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class ComposableMethod {
    public static final int $stable = 8;
    private final ComposableInfo composableInfo;
    private final Method method;

    public ComposableMethod(Method method, ComposableInfo composableInfo) {
        this.method = method;
        this.composableInfo = composableInfo;
    }

    public final Method asMethod() {
        return this.method;
    }

    public boolean equals(Object obj) {
        if (obj instanceof ComposableMethod) {
            return AbstractC9133u.m16128b(this.method, ((ComposableMethod) obj).method);
        }
        return false;
    }

    public final int getParameterCount() {
        return this.composableInfo.getRealParamsCount();
    }

    public final Class<?>[] getParameterTypes() {
        return (Class[]) AbstractC8797p.m14658y(this.method.getParameterTypes(), 0, this.composableInfo.getRealParamsCount());
    }

    public final Parameter[] getParameters() {
        return (Parameter[]) AbstractC8797p.m14658y(this.method.getParameters(), 0, this.composableInfo.getRealParamsCount());
    }

    public int hashCode() {
        return this.method.hashCode();
    }

    public final Object invoke(Composer composer, Object obj, Object... objArr) {
        Object defaultValue;
        ComposableInfo composableInfo = this.composableInfo;
        int iComponent2 = composableInfo.component2();
        int iComponent3 = composableInfo.component3();
        int iComponent4 = composableInfo.component4();
        int length = this.method.getParameterTypes().length;
        int i10 = iComponent2 + 1;
        int i11 = iComponent3 + i10;
        int i12 = 0;
        Object[] objArr2 = new Integer[iComponent4];
        for (int i13 = 0; i13 < iComponent4; i13++) {
            int i14 = i13 * 31;
            C8321f c8321fM13525t = AbstractC8323h.m13525t(i14, Math.min(i14 + 31, iComponent2));
            ArrayList arrayList = new ArrayList(AbstractC8811w.m14786x(c8321fM13525t, 10));
            Iterator it = c8321fM13525t.iterator();
            while (it.hasNext()) {
                int iNextInt = ((AbstractC8792m0) it).nextInt();
                arrayList.add(Integer.valueOf((iNextInt >= objArr.length || objArr[iNextInt] == null) ? 1 : 0));
            }
            int iIntValue = 0;
            int i15 = 0;
            for (Object obj2 : arrayList) {
                int i16 = i15 + 1;
                if (i15 < 0) {
                    AbstractC8809v.m14780w();
                }
                iIntValue |= ((Number) obj2).intValue() << i15;
                i15 = i16;
            }
            objArr2[i13] = Integer.valueOf(iIntValue);
        }
        Object[] objArr3 = new Object[length];
        while (i12 < length) {
            if (i12 >= 0 && i12 < iComponent2) {
                defaultValue = (i12 < 0 || i12 > AbstractC8801r.m14668B0(objArr)) ? ComposableMethodKt.getDefaultValue(this.method.getParameterTypes()[i12]) : objArr[i12];
            } else if (i12 == iComponent2) {
                defaultValue = composer;
            } else if (i12 == i10 || (iComponent2 + 2 <= i12 && i12 < i11)) {
                defaultValue = 0;
            } else {
                if (i11 > i12 || i12 >= length) {
                    throw new IllegalStateException("Unexpected index");
                }
                defaultValue = objArr2[i12 - i11];
            }
            objArr3[i12] = defaultValue;
            i12++;
        }
        return this.method.invoke(obj, Arrays.copyOf(objArr3, length));
    }
}
