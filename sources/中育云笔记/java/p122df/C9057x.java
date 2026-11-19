package p122df;

import android.os.Build;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

/* renamed from: df.x */
/* loaded from: classes6.dex */
public class C9057x {

    /* renamed from: df.x$a */
    public static final class a extends C9057x {
        @Override // p122df.C9057x
        /* renamed from: b */
        public Object mo17793b(Method method, Class cls, Object obj, Object[] objArr) {
            if (Build.VERSION.SDK_INT >= 26) {
                return AbstractC9050q.m17768a(method, cls, obj, objArr);
            }
            throw new UnsupportedOperationException("Calling default methods on API 24 and 25 is not supported");
        }

        @Override // p122df.C9057x
        /* renamed from: c */
        public boolean mo17794c(Method method) {
            return method.isDefault();
        }
    }

    /* renamed from: df.x$b */
    public static class b extends C9057x {
        @Override // p122df.C9057x
        /* renamed from: a */
        public String mo17792a(Method method, int i10) {
            Parameter parameter = method.getParameters()[i10];
            if (!parameter.isNamePresent()) {
                return super.mo17792a(method, i10);
            }
            return "parameter '" + parameter.getName() + '\'';
        }

        @Override // p122df.C9057x
        /* renamed from: b */
        public Object mo17793b(Method method, Class cls, Object obj, Object[] objArr) {
            return AbstractC9050q.m17768a(method, cls, obj, objArr);
        }

        @Override // p122df.C9057x
        /* renamed from: c */
        public boolean mo17794c(Method method) {
            return method.isDefault();
        }
    }

    /* renamed from: a */
    public String mo17792a(Method method, int i10) {
        return "parameter #" + (i10 + 1);
    }

    /* renamed from: b */
    public Object mo17793b(Method method, Class cls, Object obj, Object[] objArr) {
        throw new AssertionError();
    }

    /* renamed from: c */
    public boolean mo17794c(Method method) {
        return false;
    }
}
