package androidx.compose.runtime.reflect;

import androidx.camera.video.AudioStats;
import androidx.compose.runtime.Composer;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC9133u;
import kotlin.jvm.internal.C9112b0;
import p077d8.AbstractC8323h;
import p077d8.C8321f;
import p134i7.AbstractC8792m0;
import p134i7.AbstractC8811w;

/* loaded from: classes2.dex */
public final class ComposableMethodKt {
    private static final int BITS_PER_INT = 31;

    public static final ComposableMethod asComposableMethod(Method method) {
        ComposableInfo composableInfo = getComposableInfo(method);
        if (composableInfo.isComposable()) {
            return new ComposableMethod(method, composableInfo);
        }
        return null;
    }

    private static final int changedParamCount(int i10, int i11) {
        if (i10 == 0) {
            return 1;
        }
        return (int) Math.ceil((i10 + i11) / 10.0d);
    }

    private static final int defaultParamCount(int i10) {
        return (int) Math.ceil(i10 / 31.0d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final /* synthetic */ <T> T[] dup(T t10, int i10) {
        C8321f c8321fM13525t = AbstractC8323h.m13525t(0, i10);
        ArrayList arrayList = new ArrayList(AbstractC8811w.m14786x(c8321fM13525t, 10));
        Iterator<T> it = c8321fM13525t.iterator();
        while (it.hasNext()) {
            ((AbstractC8792m0) it).nextInt();
            arrayList.add(t10);
        }
        AbstractC9133u.m16139m(0, "T?");
        return (T[]) arrayList.toArray(new Object[0]);
    }

    private static final ComposableInfo getComposableInfo(Method method) {
        Class<?>[] parameterTypes = method.getParameterTypes();
        int length = parameterTypes.length - 1;
        if (length >= 0) {
            while (true) {
                int i10 = length - 1;
                if (AbstractC9133u.m16128b(parameterTypes[length], Composer.class)) {
                    break;
                }
                if (i10 < 0) {
                    break;
                }
                length = i10;
            }
            length = -1;
        } else {
            length = -1;
        }
        if (length == -1) {
            return new ComposableInfo(false, method.getParameterTypes().length, 0, 0);
        }
        int iChangedParamCount = changedParamCount(length, !Modifier.isStatic(method.getModifiers()) ? 1 : 0);
        int i11 = length + 1 + iChangedParamCount;
        int length2 = method.getParameterTypes().length;
        int iDefaultParamCount = length2 != i11 ? defaultParamCount(length) : 0;
        return new ComposableInfo(i11 + iDefaultParamCount == length2, length, iChangedParamCount, iDefaultParamCount);
    }

    public static final ComposableMethod getDeclaredComposableMethod(Class<?> cls, String str, Class<?>... clsArr) throws NoSuchMethodException, SecurityException {
        Method declaredMethod;
        Class cls2 = Integer.TYPE;
        int iChangedParamCount = changedParamCount(clsArr.length, 0);
        try {
            C9112b0 c9112b0 = new C9112b0(3);
            c9112b0.m16089b(clsArr);
            c9112b0.m16088a(Composer.class);
            C8321f c8321fM13525t = AbstractC8323h.m13525t(0, iChangedParamCount);
            ArrayList arrayList = new ArrayList(AbstractC8811w.m14786x(c8321fM13525t, 10));
            Iterator it = c8321fM13525t.iterator();
            while (it.hasNext()) {
                ((AbstractC8792m0) it).nextInt();
                arrayList.add(cls2);
            }
            c9112b0.m16089b(arrayList.toArray(new Class[0]));
            declaredMethod = cls.getDeclaredMethod(str, (Class[]) c9112b0.m16091d(new Class[c9112b0.m16090c()]));
        } catch (ReflectiveOperationException unused) {
            int iDefaultParamCount = defaultParamCount(clsArr.length);
            try {
                C9112b0 c9112b02 = new C9112b0(4);
                c9112b02.m16089b(clsArr);
                c9112b02.m16088a(Composer.class);
                C8321f c8321fM13525t2 = AbstractC8323h.m13525t(0, iChangedParamCount);
                ArrayList arrayList2 = new ArrayList(AbstractC8811w.m14786x(c8321fM13525t2, 10));
                Iterator it2 = c8321fM13525t2.iterator();
                while (it2.hasNext()) {
                    ((AbstractC8792m0) it2).nextInt();
                    arrayList2.add(cls2);
                }
                c9112b02.m16089b(arrayList2.toArray(new Class[0]));
                C8321f c8321fM13525t3 = AbstractC8323h.m13525t(0, iDefaultParamCount);
                ArrayList arrayList3 = new ArrayList(AbstractC8811w.m14786x(c8321fM13525t3, 10));
                Iterator it3 = c8321fM13525t3.iterator();
                while (it3.hasNext()) {
                    ((AbstractC8792m0) it3).nextInt();
                    arrayList3.add(cls2);
                }
                c9112b02.m16089b(arrayList3.toArray(new Class[0]));
                declaredMethod = cls.getDeclaredMethod(str, (Class[]) c9112b02.m16091d(new Class[c9112b02.m16090c()]));
            } catch (ReflectiveOperationException unused2) {
                declaredMethod = null;
            }
        }
        if (declaredMethod != null) {
            ComposableMethod composableMethodAsComposableMethod = asComposableMethod(declaredMethod);
            AbstractC9133u.m16130d(composableMethodAsComposableMethod);
            return composableMethodAsComposableMethod;
        }
        throw new NoSuchMethodException(cls.getName() + '.' + str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object getDefaultValue(Class<?> cls) {
        String name = cls.getName();
        switch (name.hashCode()) {
            case -1325958191:
                if (name.equals("double")) {
                    return Double.valueOf(AudioStats.AUDIO_AMPLITUDE_NONE);
                }
                return null;
            case 104431:
                return !name.equals("int") ? null : 0;
            case 3039496:
                return !name.equals("byte") ? null : (byte) 0;
            case 3052374:
                return !name.equals("char") ? null : (char) 0;
            case 3327612:
                return !name.equals("long") ? null : 0L;
            case 64711720:
                if (name.equals(TypedValues.Custom.S_BOOLEAN)) {
                    return Boolean.FALSE;
                }
                return null;
            case 97526364:
                if (name.equals(TypedValues.Custom.S_FLOAT)) {
                    return Float.valueOf(0.0f);
                }
                return null;
            case 109413500:
                return !name.equals("short") ? null : (short) 0;
            default:
                return null;
        }
    }
}
