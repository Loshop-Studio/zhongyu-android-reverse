package p000a.p031h.p035d;

import android.graphics.Typeface;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: a.h.d.h */
/* loaded from: classes.dex */
public class C0209h extends C0208g {
    @Override // p000a.p031h.p035d.C0208g
    /* renamed from: j */
    public Typeface mo776j(Object obj) throws ArrayIndexOutOfBoundsException, IllegalArgumentException, NegativeArraySizeException {
        try {
            Object objNewInstance = Array.newInstance(this.f1472g, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) this.f1478m.invoke(null, objNewInstance, "sans-serif", -1, -1);
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    @Override // p000a.p031h.p035d.C0208g
    /* renamed from: p */
    public Method mo781p(Class<?> cls) throws NoSuchMethodException, SecurityException {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass(), String.class, cls2, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
