package p108l6;

/* renamed from: l6.a */
/* loaded from: classes2.dex */
public abstract class AbstractC6066a {

    /* renamed from: a */
    public static final Integer f9669a;

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
        f9669a = num;
    }
}
