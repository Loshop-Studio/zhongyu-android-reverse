package androidx.compose.runtime.internal;

import androidx.compose.runtime.ComposeCompilerApi;
import kotlin.Metadata;

@Metadata(m13557d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007¨\u0006\u0004"}, m13558d2 = {"illegalDecoyCallException", "", "fName", "", "runtime_release"}, m13559k = 2, m13560mv = {1, 9, 0}, m13562xi = 48)
/* loaded from: classes2.dex */
public final class DecoyKt {
    @ComposeCompilerApi
    public static final Void illegalDecoyCallException(String str) {
        throw new IllegalStateException("Function " + str + " should have been replaced by compiler.");
    }
}
