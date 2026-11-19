package p010b;

import android.content.Context;
import android.content.Intent;
import androidx.collection.C0247a;
import androidx.core.content.C0332a;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p010b.AbstractC1015a;

/* renamed from: b.b */
/* loaded from: classes.dex */
public final class C1016b extends AbstractC1015a<String[], Map<String, Boolean>> {
    /* renamed from: e */
    static Intent m4766e(String[] strArr) {
        return new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr);
    }

    @Override // p010b.AbstractC1015a
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public Intent mo2522a(Context context, String[] strArr) {
        return m4766e(strArr);
    }

    @Override // p010b.AbstractC1015a
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public AbstractC1015a.a<Map<String, Boolean>> mo4764b(Context context, String[] strArr) {
        if (strArr == null || strArr.length == 0) {
            return new AbstractC1015a.a<>(Collections.emptyMap());
        }
        C0247a c0247a = new C0247a();
        boolean z3 = true;
        for (String str : strArr) {
            boolean z4 = C0332a.m1803a(context, str) == 0;
            c0247a.put(str, Boolean.valueOf(z4));
            if (!z4) {
                z3 = false;
            }
        }
        if (z3) {
            return new AbstractC1015a.a<>(c0247a);
        }
        return null;
    }

    @Override // p010b.AbstractC1015a
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public Map<String, Boolean> mo2523c(int i4, Intent intent) {
        if (i4 != -1) {
            return Collections.emptyMap();
        }
        if (intent == null) {
            return Collections.emptyMap();
        }
        String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
        int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
        if (intArrayExtra == null || stringArrayExtra == null) {
            return Collections.emptyMap();
        }
        HashMap map = new HashMap();
        int length = stringArrayExtra.length;
        for (int i5 = 0; i5 < length; i5++) {
            map.put(stringArrayExtra[i5], Boolean.valueOf(intArrayExtra[i5] == 0));
        }
        return map;
    }
}
