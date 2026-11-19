package com.friday.common.classtest;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred(parameters = 1)
@Keep
/* loaded from: classes3.dex */
public final class ScreencastResponse {
    public static final int $stable = 0;
    private final int port;
    private final int type;

    public ScreencastResponse(int i10, int i11) {
        this.port = i10;
        this.type = i11;
    }

    public static /* synthetic */ ScreencastResponse copy$default(ScreencastResponse screencastResponse, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = screencastResponse.port;
        }
        if ((i12 & 2) != 0) {
            i11 = screencastResponse.type;
        }
        return screencastResponse.copy(i10, i11);
    }

    public final int component1() {
        return this.port;
    }

    public final int component2() {
        return this.type;
    }

    public final ScreencastResponse copy(int i10, int i11) {
        return new ScreencastResponse(i10, i11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ScreencastResponse)) {
            return false;
        }
        ScreencastResponse screencastResponse = (ScreencastResponse) obj;
        return this.port == screencastResponse.port && this.type == screencastResponse.type;
    }

    public final int getPort() {
        return this.port;
    }

    public final int getType() {
        return this.type;
    }

    public int hashCode() {
        return (Integer.hashCode(this.port) * 31) + Integer.hashCode(this.type);
    }

    public String toString() {
        return "ScreencastResponse(port=" + this.port + ", type=" + this.type + ")";
    }
}
