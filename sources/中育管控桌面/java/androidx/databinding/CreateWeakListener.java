package androidx.databinding;

import androidx.annotation.RestrictTo;
import java.lang.ref.ReferenceQueue;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes2.dex */
interface CreateWeakListener {
    WeakListener create(ViewDataBinding viewDataBinding, int i6, ReferenceQueue<ViewDataBinding> referenceQueue);
}
