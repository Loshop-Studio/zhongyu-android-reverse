package androidx.constraintlayout.motion.widget;

import java.util.Arrays;
import java.util.HashMap;

/* renamed from: androidx.constraintlayout.motion.widget.e */
/* loaded from: classes.dex */
public class C0269e {

    /* renamed from: a */
    HashMap<Object, HashMap<String, float[]>> f1499a = new HashMap<>();

    /* renamed from: a */
    float m1297a(Object obj, String str, int i4) {
        if (!this.f1499a.containsKey(obj)) {
            return Float.NaN;
        }
        HashMap<String, float[]> map = this.f1499a.get(obj);
        if (!map.containsKey(str)) {
            return Float.NaN;
        }
        float[] fArr = map.get(str);
        if (fArr.length > i4) {
            return fArr[i4];
        }
        return Float.NaN;
    }

    /* renamed from: b */
    void m1298b(Object obj, String str, int i4, float f4) {
        if (!this.f1499a.containsKey(obj)) {
            HashMap<String, float[]> map = new HashMap<>();
            float[] fArr = new float[i4 + 1];
            fArr[i4] = f4;
            map.put(str, fArr);
            this.f1499a.put(obj, map);
            return;
        }
        HashMap<String, float[]> map2 = this.f1499a.get(obj);
        if (!map2.containsKey(str)) {
            float[] fArr2 = new float[i4 + 1];
            fArr2[i4] = f4;
            map2.put(str, fArr2);
            this.f1499a.put(obj, map2);
            return;
        }
        float[] fArrCopyOf = map2.get(str);
        if (fArrCopyOf.length <= i4) {
            fArrCopyOf = Arrays.copyOf(fArrCopyOf, i4 + 1);
        }
        fArrCopyOf[i4] = f4;
        map2.put(str, fArrCopyOf);
    }
}
