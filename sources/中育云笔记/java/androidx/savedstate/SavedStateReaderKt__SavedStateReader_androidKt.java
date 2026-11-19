package androidx.savedstate;

import android.os.Bundle;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC9979u;
import p309qc.C10786q;
import p325rc.AbstractC10960n;
import p325rc.AbstractC10962o;
import p325rc.AbstractC10978w;

/* loaded from: classes3.dex */
final /* synthetic */ class SavedStateReaderKt__SavedStateReader_androidKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean contentDeepEquals$SavedStateReaderKt__SavedStateReader_androidKt(Bundle bundle, Bundle bundle2) {
        if (bundle == bundle2) {
            return true;
        }
        if (bundle.size() != bundle2.size()) {
            return false;
        }
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            Object obj2 = bundle2.get(str);
            if (obj != obj2 && !AbstractC9979u.m20289b(obj, obj2)) {
                if (obj != null && obj2 != null) {
                    if ((obj instanceof Bundle) && (obj2 instanceof Bundle)) {
                        if (!contentDeepEquals$SavedStateReaderKt__SavedStateReader_androidKt((Bundle) obj, (Bundle) obj2)) {
                            return false;
                        }
                    } else if ((obj instanceof Object[]) && (obj2 instanceof Object[])) {
                        if (!AbstractC10962o.m23983d((Object[]) obj, (Object[]) obj2)) {
                            return false;
                        }
                    } else if ((obj instanceof byte[]) && (obj2 instanceof byte[])) {
                        if (!Arrays.equals((byte[]) obj, (byte[]) obj2)) {
                            return false;
                        }
                    } else if ((obj instanceof short[]) && (obj2 instanceof short[])) {
                        if (!Arrays.equals((short[]) obj, (short[]) obj2)) {
                            return false;
                        }
                    } else if ((obj instanceof int[]) && (obj2 instanceof int[])) {
                        if (!Arrays.equals((int[]) obj, (int[]) obj2)) {
                            return false;
                        }
                    } else if ((obj instanceof long[]) && (obj2 instanceof long[])) {
                        if (!Arrays.equals((long[]) obj, (long[]) obj2)) {
                            return false;
                        }
                    } else if ((obj instanceof float[]) && (obj2 instanceof float[])) {
                        if (!Arrays.equals((float[]) obj, (float[]) obj2)) {
                            return false;
                        }
                    } else if ((obj instanceof double[]) && (obj2 instanceof double[])) {
                        if (!Arrays.equals((double[]) obj, (double[]) obj2)) {
                            return false;
                        }
                    } else if ((obj instanceof char[]) && (obj2 instanceof char[])) {
                        if (!Arrays.equals((char[]) obj, (char[]) obj2)) {
                            return false;
                        }
                    } else if ((obj instanceof boolean[]) && (obj2 instanceof boolean[])) {
                        if (!Arrays.equals((boolean[]) obj, (boolean[]) obj2)) {
                            return false;
                        }
                    } else if (!AbstractC9979u.m20289b(obj, obj2)) {
                    }
                }
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: contentDeepHashCode$SavedStateReaderKt__SavedStateReader_androidKt */
    public static final int m2110x4f1a1420(Bundle bundle) {
        Iterator<String> it = bundle.keySet().iterator();
        int iM2110x4f1a1420 = 1;
        while (it.hasNext()) {
            Object obj = bundle.get(it.next());
            iM2110x4f1a1420 = (iM2110x4f1a1420 * 31) + (obj instanceof Bundle ? m2110x4f1a1420((Bundle) obj) : obj instanceof Object[] ? AbstractC10960n.m23981b((Object[]) obj) : obj instanceof byte[] ? Arrays.hashCode((byte[]) obj) : obj instanceof short[] ? Arrays.hashCode((short[]) obj) : obj instanceof int[] ? Arrays.hashCode((int[]) obj) : obj instanceof long[] ? Arrays.hashCode((long[]) obj) : obj instanceof float[] ? Arrays.hashCode((float[]) obj) : obj instanceof double[] ? Arrays.hashCode((double[]) obj) : obj instanceof char[] ? Arrays.hashCode((char[]) obj) : obj instanceof boolean[] ? Arrays.hashCode((boolean[]) obj) : obj != null ? obj.hashCode() : 0);
        }
        return iM2110x4f1a1420;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: contentDeepToString$SavedStateReaderKt__SavedStateReader_androidKt */
    public static final void m2111x56e5e5af(Bundle bundle, StringBuilder sb2, List<Bundle> list) {
        if (list.contains(bundle)) {
            sb2.append("[...]");
            return;
        }
        list.add(bundle);
        sb2.append('[');
        int i10 = 0;
        for (String str : bundle.keySet()) {
            int i11 = i10 + 1;
            if (i10 != 0) {
                sb2.append(", ");
            }
            sb2.append(str + '=');
            Object obj = bundle.get(str);
            if (obj == null) {
                sb2.append("null");
            } else if (obj instanceof Bundle) {
                m2111x56e5e5af((Bundle) obj, sb2, list);
                C10786q c10786q = C10786q.f26013a;
            } else if (obj instanceof Object[]) {
                sb2.append(AbstractC10962o.m23984e((Object[]) obj));
            } else if (obj instanceof byte[]) {
                String string = Arrays.toString((byte[]) obj);
                AbstractC9979u.m20293f(string, "toString(...)");
                sb2.append(string);
            } else if (obj instanceof short[]) {
                String string2 = Arrays.toString((short[]) obj);
                AbstractC9979u.m20293f(string2, "toString(...)");
                sb2.append(string2);
            } else if (obj instanceof int[]) {
                String string3 = Arrays.toString((int[]) obj);
                AbstractC9979u.m20293f(string3, "toString(...)");
                sb2.append(string3);
            } else if (obj instanceof long[]) {
                String string4 = Arrays.toString((long[]) obj);
                AbstractC9979u.m20293f(string4, "toString(...)");
                sb2.append(string4);
            } else if (obj instanceof float[]) {
                String string5 = Arrays.toString((float[]) obj);
                AbstractC9979u.m20293f(string5, "toString(...)");
                sb2.append(string5);
            } else if (obj instanceof double[]) {
                String string6 = Arrays.toString((double[]) obj);
                AbstractC9979u.m20293f(string6, "toString(...)");
                sb2.append(string6);
            } else if (obj instanceof char[]) {
                String string7 = Arrays.toString((char[]) obj);
                AbstractC9979u.m20293f(string7, "toString(...)");
                sb2.append(string7);
            } else if (obj instanceof boolean[]) {
                String string8 = Arrays.toString((boolean[]) obj);
                AbstractC9979u.m20293f(string8, "toString(...)");
                sb2.append(string8);
            } else {
                sb2.append(obj.toString());
            }
            i10 = i11;
        }
        sb2.append(']');
        list.remove(AbstractC10978w.m24138p(list));
    }
}
