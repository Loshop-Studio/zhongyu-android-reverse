package androidx.paging;

import androidx.annotation.VisibleForTesting;
import kotlin.jvm.internal.AbstractC9133u;

@VisibleForTesting
/* loaded from: classes3.dex */
public final class GenerationalViewportHint {
    private final int generationId;
    private final ViewportHint hint;

    public GenerationalViewportHint(int i10, ViewportHint hint) {
        AbstractC9133u.m16133g(hint, "hint");
        this.generationId = i10;
        this.hint = hint;
    }

    public static /* synthetic */ GenerationalViewportHint copy$default(GenerationalViewportHint generationalViewportHint, int i10, ViewportHint viewportHint, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = generationalViewportHint.generationId;
        }
        if ((i11 & 2) != 0) {
            viewportHint = generationalViewportHint.hint;
        }
        return generationalViewportHint.copy(i10, viewportHint);
    }

    public final int component1() {
        return this.generationId;
    }

    public final ViewportHint component2() {
        return this.hint;
    }

    public final GenerationalViewportHint copy(int i10, ViewportHint hint) {
        AbstractC9133u.m16133g(hint, "hint");
        return new GenerationalViewportHint(i10, hint);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GenerationalViewportHint)) {
            return false;
        }
        GenerationalViewportHint generationalViewportHint = (GenerationalViewportHint) obj;
        return this.generationId == generationalViewportHint.generationId && AbstractC9133u.m16128b(this.hint, generationalViewportHint.hint);
    }

    public final int getGenerationId() {
        return this.generationId;
    }

    public final ViewportHint getHint() {
        return this.hint;
    }

    public int hashCode() {
        return (Integer.hashCode(this.generationId) * 31) + this.hint.hashCode();
    }

    public String toString() {
        return "GenerationalViewportHint(generationId=" + this.generationId + ", hint=" + this.hint + ')';
    }
}
