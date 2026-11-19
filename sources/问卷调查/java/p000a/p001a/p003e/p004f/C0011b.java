package p000a.p001a.p003e.p004f;

import android.content.Intent;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: a.a.e.f.b */
/* loaded from: classes.dex */
public final class C0011b extends AbstractC0010a<String[], Map<String, Boolean>> {
    @Override // p000a.p001a.p003e.p004f.AbstractC0010a
    /* renamed from: a */
    public Map<String, Boolean> mo9a(int i, Intent intent) {
        if (i == -1 && intent != null) {
            String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
            int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
            if (intArrayExtra != null && stringArrayExtra != null) {
                HashMap map = new HashMap();
                int length = stringArrayExtra.length;
                for (int i2 = 0; i2 < length; i2++) {
                    map.put(stringArrayExtra[i2], Boolean.valueOf(intArrayExtra[i2] == 0));
                }
                return map;
            }
        }
        return Collections.emptyMap();
    }
}
