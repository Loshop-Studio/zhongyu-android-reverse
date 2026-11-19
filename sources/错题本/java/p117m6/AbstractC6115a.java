package p117m6;

/* renamed from: m6.a */
/* loaded from: classes2.dex */
public abstract class AbstractC6115a {

    /* renamed from: a */
    public static final Integer f9762a;

    static {
        Object obj;
        Integer num = null;
        try {
            obj = Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
        } catch (Throwable unused) {
        }
        Integer num2 = obj instanceof Integer ? (Integer) obj : null;
        if (num2 != null && num2.intValue() > 0) {
            num = num2;
        }
        f9762a = num;
    }
}
