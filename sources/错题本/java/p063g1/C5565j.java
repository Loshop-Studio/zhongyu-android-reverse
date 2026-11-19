package p063g1;

import com.google.gson.AbstractC3869p;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonToken;
import java.io.IOException;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.HashMap;
import p104l1.C6046a;
import p104l1.C6047b;

/* renamed from: g1.j */
/* loaded from: classes2.dex */
public final class C5565j extends AbstractC3869p {

    /* renamed from: d */
    public static final C5563i f8642d = new C5563i();

    /* renamed from: a */
    public final HashMap f8643a = new HashMap();

    /* renamed from: b */
    public final HashMap f8644b = new HashMap();

    /* renamed from: c */
    public final HashMap f8645c = new HashMap();

    public C5565j(Class cls) throws SecurityException {
        try {
            Field[] declaredFields = cls.getDeclaredFields();
            int i = 0;
            for (Field field : declaredFields) {
                if (field.isEnumConstant()) {
                    declaredFields[i] = field;
                    i++;
                }
            }
            Field[] fieldArr = (Field[]) Arrays.copyOf(declaredFields, i);
            AccessibleObject.setAccessible(fieldArr, true);
            for (Field field2 : fieldArr) {
                Enum r42 = (Enum) field2.get(null);
                String strName = r42.name();
                String string = r42.toString();
                SerializedName serializedName = (SerializedName) field2.getAnnotation(SerializedName.class);
                if (serializedName != null) {
                    strName = serializedName.value();
                    for (String str : serializedName.alternate()) {
                        this.f8643a.put(str, r42);
                    }
                }
                this.f8643a.put(strName, r42);
                this.f8644b.put(string, r42);
                this.f8645c.put(r42, strName);
            }
        } catch (IllegalAccessException e) {
            throw new AssertionError(e);
        }
    }

    @Override // com.google.gson.AbstractC3869p
    /* renamed from: b */
    public final Object mo2779b(C6046a c6046a) throws IOException {
        if (c6046a.m5764x() == JsonToken.NULL) {
            c6046a.m5760t();
            return null;
        }
        String strM5762v = c6046a.m5762v();
        Enum r02 = (Enum) this.f8643a.get(strM5762v);
        return r02 == null ? (Enum) this.f8644b.get(strM5762v) : r02;
    }

    @Override // com.google.gson.AbstractC3869p
    /* renamed from: c */
    public final void mo2780c(C6047b c6047b, Object obj) throws IOException {
        Enum r32 = (Enum) obj;
        c6047b.m5783s(r32 == null ? null : (String) this.f8645c.get(r32));
    }
}
