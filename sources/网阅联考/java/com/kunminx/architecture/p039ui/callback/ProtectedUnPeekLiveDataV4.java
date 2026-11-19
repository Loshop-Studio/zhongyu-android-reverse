package com.kunminx.architecture.p039ui.callback;

import androidx.lifecycle.LiveData;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@Deprecated
/* loaded from: classes2.dex */
public class ProtectedUnPeekLiveDataV4<T> extends LiveData<T> {

    /* renamed from: a */
    public boolean f1292a;

    /* renamed from: b */
    public final HashMap f1293b = new HashMap();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.lifecycle.LiveData
    public void setValue(Object obj) {
        if (obj != 0 || this.f1292a) {
            Iterator it = this.f1293b.entrySet().iterator();
            while (it.hasNext()) {
                ((Map.Entry) it.next()).setValue(Boolean.FALSE);
            }
            super.setValue(obj);
        }
    }
}
