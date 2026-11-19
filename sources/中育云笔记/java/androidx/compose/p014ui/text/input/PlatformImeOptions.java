package androidx.compose.p014ui.text.input;

import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;

@Immutable
/* loaded from: classes2.dex */
public final class PlatformImeOptions {
    public static final int $stable = 0;
    private final String privateImeOptions;

    /* JADX WARN: Multi-variable type inference failed */
    public PlatformImeOptions() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PlatformImeOptions) && AbstractC9979u.m20289b(this.privateImeOptions, ((PlatformImeOptions) obj).privateImeOptions);
    }

    public final String getPrivateImeOptions() {
        return this.privateImeOptions;
    }

    public int hashCode() {
        String str = this.privateImeOptions;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public String toString() {
        return "PlatformImeOptions(privateImeOptions=" + this.privateImeOptions + ')';
    }

    public PlatformImeOptions(String str) {
        this.privateImeOptions = str;
    }

    public /* synthetic */ PlatformImeOptions(String str, int i10, AbstractC9972n abstractC9972n) {
        this((i10 & 1) != 0 ? null : str);
    }
}
