package com.friday.common.entity;

import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred(parameters = 1)
/* loaded from: classes3.dex */
public final class UpdateResponse {
    public static final int $stable = 0;
    private final int version;

    public UpdateResponse(int i10) {
        this.version = i10;
    }

    public final int getVersion() {
        return this.version;
    }
}
