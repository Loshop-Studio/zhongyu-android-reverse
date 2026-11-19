package p063g1;

import android.support.v4.media.AbstractC0037f;
import androidx.camera.video.AudioStats;
import com.google.gson.JsonParseException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashMap;
import p078i1.AbstractC5673c;
import p104l1.C6046a;
import p185v7.AbstractC6675d;

/* renamed from: g1.y */
/* loaded from: classes2.dex */
public final class C5595y extends AbstractC5589v {

    /* renamed from: e */
    public static final HashMap f8685e;

    /* renamed from: b */
    public final Constructor f8686b;

    /* renamed from: c */
    public final Object[] f8687c;

    /* renamed from: d */
    public final HashMap f8688d;

    static {
        HashMap map = new HashMap();
        map.put(Byte.TYPE, (byte) 0);
        map.put(Short.TYPE, (short) 0);
        map.put(Integer.TYPE, 0);
        map.put(Long.TYPE, 0L);
        map.put(Float.TYPE, Float.valueOf(0.0f));
        map.put(Double.TYPE, Double.valueOf(AudioStats.AUDIO_AMPLITUDE_NONE));
        map.put(Character.TYPE, (char) 0);
        map.put(Boolean.TYPE, Boolean.FALSE);
        f8685e = map;
    }

    public C5595y(Class cls, C5593x c5593x, boolean z8) throws SecurityException {
        super(c5593x);
        this.f8688d = new HashMap();
        AbstractC6675d abstractC6675d = AbstractC5673c.f8842a;
        Constructor constructorMo5002l = abstractC6675d.mo5002l(cls);
        this.f8686b = constructorMo5002l;
        if (z8) {
            C5597z.m4914a(null, constructorMo5002l);
        } else {
            AbstractC5673c.m5010f(constructorMo5002l);
        }
        String[] strArrMo5003o = abstractC6675d.mo5003o(cls);
        for (int i = 0; i < strArrMo5003o.length; i++) {
            this.f8688d.put(strArrMo5003o[i], Integer.valueOf(i));
        }
        Class<?>[] parameterTypes = this.f8686b.getParameterTypes();
        this.f8687c = new Object[parameterTypes.length];
        for (int i8 = 0; i8 < parameterTypes.length; i8++) {
            this.f8687c[i8] = f8685e.get(parameterTypes[i8]);
        }
    }

    @Override // p063g1.AbstractC5589v
    /* renamed from: d */
    public final Object mo4911d() {
        return (Object[]) this.f8687c.clone();
    }

    @Override // p063g1.AbstractC5589v
    /* renamed from: e */
    public final Object mo4912e(Object obj) {
        Object[] objArr = (Object[]) obj;
        Constructor constructor = this.f8686b;
        try {
            return constructor.newInstance(objArr);
        } catch (IllegalAccessException e) {
            AbstractC6675d abstractC6675d = AbstractC5673c.f8842a;
            throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.13.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e);
        } catch (IllegalArgumentException e4) {
            e = e4;
            throw new RuntimeException("Failed to invoke constructor '" + AbstractC5673c.m5006b(constructor) + "' with args " + Arrays.toString(objArr), e);
        } catch (InstantiationException e8) {
            e = e8;
            throw new RuntimeException("Failed to invoke constructor '" + AbstractC5673c.m5006b(constructor) + "' with args " + Arrays.toString(objArr), e);
        } catch (InvocationTargetException e9) {
            throw new RuntimeException("Failed to invoke constructor '" + AbstractC5673c.m5006b(constructor) + "' with args " + Arrays.toString(objArr), e9.getCause());
        }
    }

    @Override // p063g1.AbstractC5589v
    /* renamed from: f */
    public final void mo4913f(Object obj, C6046a c6046a, C5587u c5587u) {
        Object[] objArr = (Object[]) obj;
        String str = c5587u.f8666c;
        Integer num = (Integer) this.f8688d.get(str);
        if (num == null) {
            throw new IllegalStateException("Could not find the index in the constructor '" + AbstractC5673c.m5006b(this.f8686b) + "' for field with name '" + str + "', unable to determine which argument in the constructor the field corresponds to. This is unexpected behavior, as we expect the RecordComponents to have the same names as the fields in the Java class, and that the order of the RecordComponents is the same as the order of the canonical constructor parameters.");
        }
        int iIntValue = num.intValue();
        Object objMo2779b = c5587u.f8670g.mo2779b(c6046a);
        if (objMo2779b != null || !c5587u.f8671h) {
            objArr[iIntValue] = objMo2779b;
        } else {
            StringBuilder sbM100y = AbstractC0037f.m100y("null is not allowed as value for record component '", str, "' of primitive type; at path ");
            sbM100y.append(c6046a.m5750h(false));
            throw new JsonParseException(sbM100y.toString());
        }
    }
}
