package androidx.core.graphics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* renamed from: androidx.core.graphics.w */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC2756w {
    /* renamed from: a */
    public static /* synthetic */ List m759a(Object[] objArr) {
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            Objects.requireNonNull(obj);
            arrayList.add(obj);
        }
        return Collections.unmodifiableList(arrayList);
    }
}
