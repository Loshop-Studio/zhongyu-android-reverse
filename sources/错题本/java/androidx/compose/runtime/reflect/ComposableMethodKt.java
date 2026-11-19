package androidx.compose.runtime.reflect;

import androidx.camera.video.AudioStats;
import androidx.compose.runtime.Composer;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.AbstractC5781c0;
import kotlin.collections.AbstractC5806u;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.C5834o;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p200x6.C6756f;

@Metadata(m5109d1 = {"\u00006\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\u001a\u0018\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0001H\u0002\u001a\u0010\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0002\u001a\f\u0010\u0006\u001a\u0004\u0018\u00010\u0007*\u00020\b\u001a(\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u000b0\n\"\u0006\b\u0000\u0010\u000b\u0018\u0001*\u0002H\u000b2\u0006\u0010\f\u001a\u00020\u0001H\u0082\b¢\u0006\u0002\u0010\r\u001a\f\u0010\u000e\u001a\u00020\u000f*\u00020\bH\u0002\u001a7\u0010\u0010\u001a\u00020\u0007*\u0006\u0012\u0002\b\u00030\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u001a\u0010\u0014\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00110\n\"\u0006\u0012\u0002\b\u00030\u0011¢\u0006\u0002\u0010\u0015\u001a\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0017*\u0006\u0012\u0002\b\u00030\u0011H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m5110d2 = {"BITS_PER_INT", "", "changedParamCount", "realValueParams", "thisParams", "defaultParamCount", "asComposableMethod", "Landroidx/compose/runtime/reflect/ComposableMethod;", "Ljava/lang/reflect/Method;", "dup", "", ExifInterface.GPS_DIRECTION_TRUE, "count", "(Ljava/lang/Object;I)[Ljava/lang/Object;", "getComposableInfo", "Landroidx/compose/runtime/reflect/ComposableInfo;", "getDeclaredComposableMethod", "Ljava/lang/Class;", "methodName", "", "args", "(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Landroidx/compose/runtime/reflect/ComposableMethod;", "getDefaultValue", "", "runtime_release"}, m5111k = 2, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@JvmName(name = "ComposableMethodKt")
@SourceDebugExtension({"SMAP\nComposableMethod.jvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComposableMethod.jvm.kt\nandroidx/compose/runtime/reflect/ComposableMethodKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,206:1\n170#1:219\n170#1:226\n170#1:233\n1735#2,6:207\n1549#3:213\n1620#3,3:214\n1549#3:220\n1620#3,3:221\n1549#3:227\n1620#3,3:228\n1549#3:234\n1620#3,3:235\n37#4,2:217\n37#4,2:224\n37#4,2:231\n37#4,2:238\n*S KotlinDebug\n*F\n+ 1 ComposableMethod.jvm.kt\nandroidx/compose/runtime/reflect/ComposableMethodKt\n*L\n187#1:219\n196#1:226\n197#1:233\n53#1:207,6\n170#1:213\n170#1:214,3\n187#1:220\n187#1:221,3\n196#1:227\n196#1:228,3\n197#1:234\n197#1:235,3\n170#1:217,2\n187#1:224,2\n196#1:231,2\n197#1:238,2\n*E\n"})
/* loaded from: classes.dex */
public final class ComposableMethodKt {
    private static final int BITS_PER_INT = 31;

    @Nullable
    public static final ComposableMethod asComposableMethod(@NotNull Method method) {
        ComposableInfo composableInfo = getComposableInfo(method);
        if (composableInfo.isComposable()) {
            return new ComposableMethod(method, composableInfo);
        }
        return null;
    }

    private static final int changedParamCount(int i, int i8) {
        if (i == 0) {
            return 1;
        }
        return (int) Math.ceil((i + i8) / 10.0d);
    }

    private static final int defaultParamCount(int i) {
        return (int) Math.ceil(i / 31.0d);
    }

    private static final <T> T[] dup(T t8, int i) {
        C6756f c6756fM5260N = AbstractC5806u.m5260N(0, i);
        ArrayList arrayList = new ArrayList(AbstractC5806u.m5277p(c6756fM5260N, 10));
        Iterator<T> it = c6756fM5260N.iterator();
        while (it.hasNext()) {
            ((AbstractC5781c0) it).nextInt();
            arrayList.add(t8);
        }
        AbstractC5830k.m5338o();
        throw null;
    }

    private static final ComposableInfo getComposableInfo(Method method) {
        Class<?>[] parameterTypes = method.getParameterTypes();
        int length = parameterTypes.length - 1;
        if (length >= 0) {
            while (true) {
                int i = length - 1;
                if (AbstractC5830k.m5325b(parameterTypes[length], Composer.class)) {
                    break;
                }
                if (i < 0) {
                    break;
                }
                length = i;
            }
            length = -1;
        } else {
            length = -1;
        }
        if (length == -1) {
            return new ComposableInfo(false, method.getParameterTypes().length, 0, 0);
        }
        int iChangedParamCount = changedParamCount(length, !Modifier.isStatic(method.getModifiers()) ? 1 : 0);
        int i8 = length + 1 + iChangedParamCount;
        int length2 = method.getParameterTypes().length;
        int iDefaultParamCount = length2 != i8 ? defaultParamCount(length) : 0;
        return new ComposableInfo(i8 + iDefaultParamCount == length2, length, iChangedParamCount, iDefaultParamCount);
    }

    @NotNull
    public static final ComposableMethod getDeclaredComposableMethod(@NotNull Class<?> cls, @NotNull String str, @NotNull Class<?>... clsArr) throws NoSuchMethodException, SecurityException {
        Method declaredMethod;
        Class cls2 = Integer.TYPE;
        int iChangedParamCount = changedParamCount(clsArr.length, 0);
        try {
            C5834o c5834o = new C5834o(3);
            ArrayList arrayList = c5834o.f9224a;
            c5834o.m5346d(clsArr);
            c5834o.m5343a(Composer.class);
            C6756f c6756fM5260N = AbstractC5806u.m5260N(0, iChangedParamCount);
            ArrayList arrayList2 = new ArrayList(AbstractC5806u.m5277p(c6756fM5260N, 10));
            Iterator it = c6756fM5260N.iterator();
            while (it.hasNext()) {
                ((AbstractC5781c0) it).nextInt();
                arrayList2.add(cls2);
            }
            c5834o.m5346d(arrayList2.toArray(new Class[0]));
            declaredMethod = cls.getDeclaredMethod(str, (Class[]) arrayList.toArray(new Class[arrayList.size()]));
        } catch (ReflectiveOperationException unused) {
            int iDefaultParamCount = defaultParamCount(clsArr.length);
            try {
                C5834o c5834o2 = new C5834o(4);
                ArrayList arrayList3 = c5834o2.f9224a;
                c5834o2.m5346d(clsArr);
                c5834o2.m5343a(Composer.class);
                C6756f c6756fM5260N2 = AbstractC5806u.m5260N(0, iChangedParamCount);
                ArrayList arrayList4 = new ArrayList(AbstractC5806u.m5277p(c6756fM5260N2, 10));
                Iterator it2 = c6756fM5260N2.iterator();
                while (it2.hasNext()) {
                    ((AbstractC5781c0) it2).nextInt();
                    arrayList4.add(cls2);
                }
                c5834o2.m5346d(arrayList4.toArray(new Class[0]));
                C6756f c6756fM5260N3 = AbstractC5806u.m5260N(0, iDefaultParamCount);
                ArrayList arrayList5 = new ArrayList(AbstractC5806u.m5277p(c6756fM5260N3, 10));
                Iterator it3 = c6756fM5260N3.iterator();
                while (it3.hasNext()) {
                    ((AbstractC5781c0) it3).nextInt();
                    arrayList5.add(cls2);
                }
                c5834o2.m5346d(arrayList5.toArray(new Class[0]));
                declaredMethod = cls.getDeclaredMethod(str, (Class[]) arrayList3.toArray(new Class[arrayList3.size()]));
            } catch (ReflectiveOperationException unused2) {
                declaredMethod = null;
            }
        }
        if (declaredMethod != null) {
            ComposableMethod composableMethodAsComposableMethod = asComposableMethod(declaredMethod);
            AbstractC5830k.m5327d(composableMethodAsComposableMethod);
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
