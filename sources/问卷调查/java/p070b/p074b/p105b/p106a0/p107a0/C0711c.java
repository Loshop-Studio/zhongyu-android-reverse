package p070b.p074b.p105b.p106a0.p107a0;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import p070b.p074b.p105b.C0774o;

/* renamed from: b.b.b.a0.a0.c */
/* loaded from: classes.dex */
public final class C0711c extends AbstractC0710b {

    /* renamed from: d */
    public static Class f4209d;

    /* renamed from: b */
    public final Object f4210b;

    /* renamed from: c */
    public final Field f4211c;

    public C0711c() throws IllegalAccessException, NoSuchFieldException, ClassNotFoundException, IllegalArgumentException {
        Object obj;
        Field declaredField = null;
        try {
            Class<?> cls = Class.forName("sun.misc.Unsafe");
            f4209d = cls;
            Field declaredField2 = cls.getDeclaredField("theUnsafe");
            declaredField2.setAccessible(true);
            obj = declaredField2.get(null);
        } catch (Exception unused) {
            obj = null;
        }
        this.f4210b = obj;
        try {
            declaredField = AccessibleObject.class.getDeclaredField("override");
        } catch (NoSuchFieldException unused2) {
        }
        this.f4211c = declaredField;
    }

    @Override // p070b.p074b.p105b.p106a0.p107a0.AbstractC0710b
    /* renamed from: a */
    public void mo2364a(AccessibleObject accessibleObject) throws IllegalAccessException, SecurityException, IllegalArgumentException, InvocationTargetException {
        boolean z = false;
        if (this.f4210b != null && this.f4211c != null) {
            try {
                f4209d.getMethod("putBoolean", Object.class, Long.TYPE, Boolean.TYPE).invoke(this.f4210b, accessibleObject, Long.valueOf(((Long) f4209d.getMethod("objectFieldOffset", Field.class).invoke(this.f4210b, this.f4211c)).longValue()), Boolean.TRUE);
                z = true;
            } catch (Exception unused) {
            }
        }
        if (z) {
            return;
        }
        try {
            accessibleObject.setAccessible(true);
        } catch (SecurityException e2) {
            throw new C0774o("Gson couldn't modify fields for " + accessibleObject + "\nand sun.misc.Unsafe not found.\nEither write a custom type adapter, or make fields accessible, or include sun.misc.Unsafe.", e2);
        }
    }
}
