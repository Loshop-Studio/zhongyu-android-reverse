package p226r9;

import android.os.Build;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

/* renamed from: r9.x */
/* loaded from: classes5.dex */
public class C9083x {

    /* renamed from: r9.x$a */
    public static final class a extends C9083x {
        @Override // p226r9.C9083x
        /* renamed from: b */
        public Object mo15333b(Method method, Class cls, Object obj, Object[] objArr) {
            if (Build.VERSION.SDK_INT >= 26) {
                return AbstractC9076q.m15308a(method, cls, obj, objArr);
            }
            throw new UnsupportedOperationException("Calling default methods on API 24 and 25 is not supported");
        }

        @Override // p226r9.C9083x
        /* renamed from: c */
        public boolean mo15334c(Method method) {
            return method.isDefault();
        }
    }

    /* renamed from: r9.x$b */
    public static class b extends C9083x {
        @Override // p226r9.C9083x
        /* renamed from: a */
        public String mo15332a(Method method, int i10) {
            Parameter parameter = method.getParameters()[i10];
            if (!parameter.isNamePresent()) {
                return super.mo15332a(method, i10);
            }
            return "parameter '" + parameter.getName() + '\'';
        }

        @Override // p226r9.C9083x
        /* renamed from: b */
        public Object mo15333b(Method method, Class cls, Object obj, Object[] objArr) {
            return AbstractC9076q.m15308a(method, cls, obj, objArr);
        }

        @Override // p226r9.C9083x
        /* renamed from: c */
        public boolean mo15334c(Method method) {
            return method.isDefault();
        }
    }

    /* renamed from: a */
    public String mo15332a(Method method, int i10) {
        return "parameter #" + (i10 + 1);
    }

    /* renamed from: b */
    public Object mo15333b(Method method, Class cls, Object obj, Object[] objArr) {
        throw new AssertionError();
    }

    /* renamed from: c */
    public boolean mo15334c(Method method) {
        return false;
    }
}
