package p200z5;

import android.os.Build;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

/* renamed from: z5.x */
/* loaded from: classes4.dex */
public class C7983x {

    /* renamed from: z5.x$a */
    public static final class a extends C7983x {
        @Override // p200z5.C7983x
        /* renamed from: b */
        public Object mo9875b(Method method, Class cls, Object obj, Object[] objArr) {
            if (Build.VERSION.SDK_INT >= 26) {
                return AbstractC7976q.m9850a(method, cls, obj, objArr);
            }
            throw new UnsupportedOperationException("Calling default methods on API 24 and 25 is not supported");
        }

        @Override // p200z5.C7983x
        /* renamed from: c */
        public boolean mo9876c(Method method) {
            return method.isDefault();
        }
    }

    /* renamed from: z5.x$b */
    public static class b extends C7983x {
        @Override // p200z5.C7983x
        /* renamed from: a */
        public String mo9874a(Method method, int i6) {
            Parameter parameter = method.getParameters()[i6];
            if (!parameter.isNamePresent()) {
                return super.mo9874a(method, i6);
            }
            return "parameter '" + parameter.getName() + '\'';
        }

        @Override // p200z5.C7983x
        /* renamed from: b */
        public Object mo9875b(Method method, Class cls, Object obj, Object[] objArr) {
            return AbstractC7976q.m9850a(method, cls, obj, objArr);
        }

        @Override // p200z5.C7983x
        /* renamed from: c */
        public boolean mo9876c(Method method) {
            return method.isDefault();
        }
    }

    /* renamed from: a */
    public String mo9874a(Method method, int i6) {
        return "parameter #" + (i6 + 1);
    }

    /* renamed from: b */
    public Object mo9875b(Method method, Class cls, Object obj, Object[] objArr) {
        throw new AssertionError();
    }

    /* renamed from: c */
    public boolean mo9876c(Method method) {
        return false;
    }
}
