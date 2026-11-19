package androidx.camera.core.impl;

import com.alibaba.sdk.android.oss.common.RequestParameters;
import java.util.Iterator;

/* renamed from: androidx.camera.core.impl.u */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0655u {
    /* renamed from: a */
    public static /* synthetic */ String m660a(CharSequence charSequence, Iterable iterable) {
        if (charSequence == null) {
            throw new NullPointerException(RequestParameters.DELIMITER);
        }
        StringBuilder sb2 = new StringBuilder();
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            while (true) {
                sb2.append((CharSequence) it.next());
                if (!it.hasNext()) {
                    break;
                }
                sb2.append(charSequence);
            }
        }
        return sb2.toString();
    }
}
