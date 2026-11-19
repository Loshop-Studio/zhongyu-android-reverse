package androidx.constraintlayout.core.motion.utils;

import java.util.Arrays;
import java.util.HashMap;

/* loaded from: classes2.dex */
public class KeyCache {
    HashMap<Object, HashMap<String, float[]>> mMap = new HashMap<>();

    public float getFloatValue(Object obj, String str, int i9) {
        HashMap<String, float[]> map;
        float[] fArr;
        if (this.mMap.containsKey(obj) && (map = this.mMap.get(obj)) != null && map.containsKey(str) && (fArr = map.get(str)) != null && fArr.length > i9) {
            return fArr[i9];
        }
        return Float.NaN;
    }

    public void setFloatValue(Object obj, String str, int i9, float f10) {
        if (!this.mMap.containsKey(obj)) {
            HashMap<String, float[]> map = new HashMap<>();
            float[] fArr = new float[i9 + 1];
            fArr[i9] = f10;
            map.put(str, fArr);
            this.mMap.put(obj, map);
            return;
        }
        HashMap<String, float[]> map2 = this.mMap.get(obj);
        if (map2 == null) {
            map2 = new HashMap<>();
        }
        if (!map2.containsKey(str)) {
            float[] fArr2 = new float[i9 + 1];
            fArr2[i9] = f10;
            map2.put(str, fArr2);
            this.mMap.put(obj, map2);
            return;
        }
        float[] fArrCopyOf = map2.get(str);
        if (fArrCopyOf == null) {
            fArrCopyOf = new float[0];
        }
        if (fArrCopyOf.length <= i9) {
            fArrCopyOf = Arrays.copyOf(fArrCopyOf, i9 + 1);
        }
        fArrCopyOf[i9] = f10;
        map2.put(str, fArrCopyOf);
    }
}
