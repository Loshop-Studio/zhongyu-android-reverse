package ca;

import android.os.Build;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

/* renamed from: ca.x */
/* loaded from: classes5.dex */
public class C5307x {

    /* renamed from: ca.x$a */
    public static final class a extends C5307x {
        @Override // ca.C5307x
        /* renamed from: b */
        public Object mo2337b(Method method, Class cls, Object obj, Object[] objArr) {
            if (Build.VERSION.SDK_INT >= 26) {
                return AbstractC5300q.m2310a(method, cls, obj, objArr);
            }
            throw new UnsupportedOperationException("Calling default methods on API 24 and 25 is not supported");
        }

        @Override // ca.C5307x
        /* renamed from: c */
        public boolean mo2338c(Method method) {
            return method.isDefault();
        }
    }

    /* renamed from: ca.x$b */
    public static class b extends C5307x {
        @Override // ca.C5307x
        /* renamed from: a */
        public String mo2336a(Method method, int i10) {
            Parameter parameter = method.getParameters()[i10];
            if (!parameter.isNamePresent()) {
                return super.mo2336a(method, i10);
            }
            return "parameter '" + parameter.getName() + '\'';
        }

        @Override // ca.C5307x
        /* renamed from: b */
        public Object mo2337b(Method method, Class cls, Object obj, Object[] objArr) {
            return AbstractC5300q.m2310a(method, cls, obj, objArr);
        }

        @Override // ca.C5307x
        /* renamed from: c */
        public boolean mo2338c(Method method) {
            return method.isDefault();
        }
    }

    /* renamed from: a */
    public String mo2336a(Method method, int i10) {
        return "parameter #" + (i10 + 1);
    }

    /* renamed from: b */
    public Object mo2337b(Method method, Class cls, Object obj, Object[] objArr) {
        throw new AssertionError();
    }

    /* renamed from: c */
    public boolean mo2338c(Method method) {
        return false;
    }
}
