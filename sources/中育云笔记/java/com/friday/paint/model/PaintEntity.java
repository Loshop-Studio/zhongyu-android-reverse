package com.friday.paint.model;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9979u;

@StabilityInferred(parameters = 1)
/* loaded from: classes4.dex */
public final class PaintEntity {
    public static final int $stable = 0;
    private final String path;

    public PaintEntity(String path) {
        AbstractC9979u.m20294g(path, "path");
        this.path = path;
    }

    public static /* synthetic */ PaintEntity copy$default(PaintEntity paintEntity, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = paintEntity.path;
        }
        return paintEntity.copy(str);
    }

    public final String component1() {
        return this.path;
    }

    public final PaintEntity copy(String path) {
        AbstractC9979u.m20294g(path, "path");
        return new PaintEntity(path);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PaintEntity) && AbstractC9979u.m20289b(this.path, ((PaintEntity) obj).path);
    }

    public final String getPath() {
        return this.path;
    }

    public int hashCode() {
        return this.path.hashCode();
    }

    public String toString() {
        return "PaintEntity(path=" + this.path + ")";
    }
}
