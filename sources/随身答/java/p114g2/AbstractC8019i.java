package p114g2;

/* renamed from: g2.i */
/* loaded from: classes4.dex */
public abstract class AbstractC8019i {

    /* renamed from: a */
    public static boolean f13564a = false;

    /* renamed from: a */
    public static String m12598a(Object obj, Object obj2) {
        if (obj == null) {
            obj = "";
        }
        if (obj2 == null) {
            obj2 = "";
        }
        return String.format("%s:%s", obj, obj2);
    }

    /* renamed from: b */
    public static void m12599b(String str, Object... objArr) {
        if (f13564a) {
            m12600c(str, objArr);
        }
    }

    /* renamed from: c */
    public static String m12600c(String str, Object... objArr) {
        if (str == null && objArr == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        if (str == null) {
            str = "-";
        }
        sb.append(String.format("[%s] ", str));
        if (objArr != null) {
            int length = objArr.length;
            int i9 = 0;
            while (true) {
                int i10 = i9 + 1;
                if (i10 >= objArr.length) {
                    break;
                }
                sb.append(m12598a(objArr[i9], objArr[i10]));
                if (i10 < length - 1) {
                    sb.append(",");
                }
                i9 += 2;
            }
            if (i9 == objArr.length - 1) {
                sb.append(objArr[i9]);
            }
        }
        return sb.toString();
    }
}
