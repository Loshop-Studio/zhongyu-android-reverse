package com.kunminx.architecture.p058ui.callback;

import androidx.lifecycle.LiveData;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@Deprecated
/* loaded from: classes4.dex */
public class ProtectedUnPeekLiveDataV4<T> extends LiveData<T> {

    /* renamed from: a */
    public boolean f5256a;

    /* renamed from: b */
    public final HashMap f5257b = new HashMap();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.lifecycle.LiveData
    public void setValue(Object obj) {
        if (obj != 0 || this.f5256a) {
            Iterator it = this.f5257b.entrySet().iterator();
            while (it.hasNext()) {
                ((Map.Entry) it.next()).setValue(Boolean.FALSE);
            }
            super.setValue(obj);
        }
    }
}
