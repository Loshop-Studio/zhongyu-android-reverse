package com.huawei.hms.core.aidl;

import android.os.Bundle;
import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.huawei.hms.core.aidl.g */
/* loaded from: classes5.dex */
public class C7280g extends C7279f {
    @Override // com.huawei.hms.core.aidl.C7279f
    /* renamed from: h */
    public List mo8529h(Type type, Bundle bundle) throws InstantiationException {
        int i10 = bundle.getInt("_list_size_");
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            Object obj = bundle.get("_list_item_" + i11);
            if (obj.getClass().isPrimitive() || (obj instanceof String) || (obj instanceof Serializable)) {
                arrayList.add(obj);
            } else if (obj instanceof Bundle) {
                Bundle bundle2 = (Bundle) obj;
                int i12 = bundle2.getInt("_val_type_", -1);
                if (i12 == 1) {
                    throw new InstantiationException("Nested List can not be supported");
                }
                if (i12 != 0) {
                    throw new InstantiationException("Unknown type can not be supported");
                }
                arrayList.add(m8527f(bundle2, (InterfaceC7278e) ((Class) ((ParameterizedType) type).getActualTypeArguments()[0]).newInstance()));
            } else {
                continue;
            }
        }
        return arrayList;
    }

    @Override // com.huawei.hms.core.aidl.C7279f
    /* renamed from: i */
    public void mo8530i(String str, List list, Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putInt("_val_type_", 1);
        bundle2.putInt("_list_size_", list.size());
        for (int i10 = 0; i10 < list.size(); i10++) {
            m8531j("_list_item_" + i10, list.get(i10), bundle2);
        }
        bundle.putBundle(str, bundle2);
    }
}
