package androidx.camera.core;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* renamed from: androidx.camera.core.j */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0641j {
    /* renamed from: a */
    public static /* synthetic */ List m831a(Object[] objArr) {
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            Objects.requireNonNull(obj);
            arrayList.add(obj);
        }
        return Collections.unmodifiableList(arrayList);
    }
}
