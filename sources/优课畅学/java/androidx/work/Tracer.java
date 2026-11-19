package androidx.work;

import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public interface Tracer {
    void beginAsyncSection(String str, int i10);

    void beginSection(String str);

    void endAsyncSection(String str, int i10);

    void endSection();

    boolean isEnabled();
}
