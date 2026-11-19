package androidx.compose.runtime.reflect;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.StabilityInferred;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC9979u;
import p265nd.AbstractC10410o;
import p265nd.C10405j;
import p325rc.AbstractC10961n0;
import p325rc.AbstractC10964p;
import p325rc.AbstractC10968r;
import p325rc.AbstractC10978w;
import p325rc.AbstractC10980x;

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
            return AbstractC9979u.m20289b(this.method, ((ComposableMethod) obj).method);
        }
        return false;
    }

    public final int getParameterCount() {
        return this.composableInfo.getRealParamsCount();
    }

    public final Class<?>[] getParameterTypes() {
        return (Class[]) AbstractC10964p.m24032y(this.method.getParameterTypes(), 0, this.composableInfo.getRealParamsCount());
    }

    public final Parameter[] getParameters() {
        return (Parameter[]) AbstractC10964p.m24032y(this.method.getParameters(), 0, this.composableInfo.getRealParamsCount());
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
            C10405j c10405jM21768u = AbstractC10410o.m21768u(i14, Math.min(i14 + 31, iComponent2));
            ArrayList arrayList = new ArrayList(AbstractC10980x.m24153x(c10405jM21768u, 10));
            Iterator it = c10405jM21768u.iterator();
            while (it.hasNext()) {
                int iNextInt = ((AbstractC10961n0) it).nextInt();
                arrayList.add(Integer.valueOf((iNextInt >= objArr.length || objArr[iNextInt] == null) ? 1 : 0));
            }
            int size = arrayList.size();
            int iIntValue = 0;
            int i15 = 0;
            int i16 = 0;
            while (i16 < size) {
                Object obj2 = arrayList.get(i16);
                i16++;
                int i17 = i15 + 1;
                if (i15 < 0) {
                    AbstractC10978w.m24145w();
                }
                iIntValue |= ((Number) obj2).intValue() << i15;
                i15 = i17;
            }
            objArr2[i13] = Integer.valueOf(iIntValue);
        }
        Object[] objArr3 = new Object[length];
        while (i12 < length) {
            if (i12 >= 0 && i12 < iComponent2) {
                defaultValue = (i12 < 0 || i12 > AbstractC10968r.m24041A0(objArr)) ? ComposableMethodKt.getDefaultValue(this.method.getParameterTypes()[i12]) : objArr[i12];
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
