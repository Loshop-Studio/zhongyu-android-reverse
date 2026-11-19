package androidx.compose.runtime.reflect;

import androidx.camera.video.AudioStats;
import androidx.compose.runtime.Composer;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC9979u;
import kotlin.jvm.internal.C9958b0;
import p265nd.AbstractC10410o;
import p265nd.C10405j;
import p325rc.AbstractC10961n0;
import p325rc.AbstractC10980x;

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
        C10405j c10405jM21768u = AbstractC10410o.m21768u(0, i10);
        ArrayList arrayList = new ArrayList(AbstractC10980x.m24153x(c10405jM21768u, 10));
        Iterator<T> it = c10405jM21768u.iterator();
        while (it.hasNext()) {
            ((AbstractC10961n0) it).nextInt();
            arrayList.add(t10);
        }
        AbstractC9979u.m20300m(0, "T?");
        return (T[]) arrayList.toArray(new Object[0]);
    }

    private static final ComposableInfo getComposableInfo(Method method) {
        Class<?>[] parameterTypes = method.getParameterTypes();
        int length = parameterTypes.length - 1;
        if (length >= 0) {
            while (true) {
                int i10 = length - 1;
                if (AbstractC9979u.m20289b(parameterTypes[length], Composer.class)) {
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
            C9958b0 c9958b0 = new C9958b0(3);
            c9958b0.m20247b(clsArr);
            c9958b0.m20246a(Composer.class);
            C10405j c10405jM21768u = AbstractC10410o.m21768u(0, iChangedParamCount);
            ArrayList arrayList = new ArrayList(AbstractC10980x.m24153x(c10405jM21768u, 10));
            Iterator it = c10405jM21768u.iterator();
            while (it.hasNext()) {
                ((AbstractC10961n0) it).nextInt();
                arrayList.add(cls2);
            }
            c9958b0.m20247b(arrayList.toArray(new Class[0]));
            declaredMethod = cls.getDeclaredMethod(str, (Class[]) c9958b0.m20249d(new Class[c9958b0.m20248c()]));
        } catch (ReflectiveOperationException unused) {
            int iDefaultParamCount = defaultParamCount(clsArr.length);
            try {
                C9958b0 c9958b02 = new C9958b0(4);
                c9958b02.m20247b(clsArr);
                c9958b02.m20246a(Composer.class);
                C10405j c10405jM21768u2 = AbstractC10410o.m21768u(0, iChangedParamCount);
                ArrayList arrayList2 = new ArrayList(AbstractC10980x.m24153x(c10405jM21768u2, 10));
                Iterator it2 = c10405jM21768u2.iterator();
                while (it2.hasNext()) {
                    ((AbstractC10961n0) it2).nextInt();
                    arrayList2.add(cls2);
                }
                c9958b02.m20247b(arrayList2.toArray(new Class[0]));
                C10405j c10405jM21768u3 = AbstractC10410o.m21768u(0, iDefaultParamCount);
                ArrayList arrayList3 = new ArrayList(AbstractC10980x.m24153x(c10405jM21768u3, 10));
                Iterator it3 = c10405jM21768u3.iterator();
                while (it3.hasNext()) {
                    ((AbstractC10961n0) it3).nextInt();
                    arrayList3.add(cls2);
                }
                c9958b02.m20247b(arrayList3.toArray(new Class[0]));
                declaredMethod = cls.getDeclaredMethod(str, (Class[]) c9958b02.m20249d(new Class[c9958b02.m20248c()]));
            } catch (ReflectiveOperationException unused2) {
                declaredMethod = null;
            }
        }
        if (declaredMethod != null) {
            ComposableMethod composableMethodAsComposableMethod = asComposableMethod(declaredMethod);
            AbstractC9979u.m20291d(composableMethodAsComposableMethod);
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
