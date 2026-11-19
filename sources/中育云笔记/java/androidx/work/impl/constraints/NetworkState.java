package androidx.work.impl.constraints;

/* loaded from: classes3.dex */
public final class NetworkState {
    private final boolean isConnected;
    private final boolean isMetered;
    private final boolean isNotRoaming;
    private final boolean isValidated;

    public NetworkState(boolean z10, boolean z11, boolean z12, boolean z13) {
        this.isConnected = z10;
        this.isValidated = z11;
        this.isMetered = z12;
        this.isNotRoaming = z13;
    }

    public static /* synthetic */ NetworkState copy$default(NetworkState networkState, boolean z10, boolean z11, boolean z12, boolean z13, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = networkState.isConnected;
        }
        if ((i10 & 2) != 0) {
            z11 = networkState.isValidated;
        }
        if ((i10 & 4) != 0) {
            z12 = networkState.isMetered;
        }
        if ((i10 & 8) != 0) {
            z13 = networkState.isNotRoaming;
        }
        return networkState.copy(z10, z11, z12, z13);
    }

    public final boolean component1() {
        return this.isConnected;
    }

    public final boolean component2() {
        return this.isValidated;
    }

    public final boolean component3() {
        return this.isMetered;
    }

    public final boolean component4() {
        return this.isNotRoaming;
    }

    public final NetworkState copy(boolean z10, boolean z11, boolean z12, boolean z13) {
        return new NetworkState(z10, z11, z12, z13);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NetworkState)) {
            return false;
        }
        NetworkState networkState = (NetworkState) obj;
        return this.isConnected == networkState.isConnected && this.isValidated == networkState.isValidated && this.isMetered == networkState.isMetered && this.isNotRoaming == networkState.isNotRoaming;
    }

    public int hashCode() {
        return (((((Boolean.hashCode(this.isConnected) * 31) + Boolean.hashCode(this.isValidated)) * 31) + Boolean.hashCode(this.isMetered)) * 31) + Boolean.hashCode(this.isNotRoaming);
    }

    public final boolean isConnected() {
        return this.isConnected;
    }

    public final boolean isMetered() {
        return this.isMetered;
    }

    public final boolean isNotRoaming() {
        return this.isNotRoaming;
    }

    public final boolean isValidated() {
        return this.isValidated;
    }

    public String toString() {
        return "NetworkState(isConnected=" + this.isConnected + ", isValidated=" + this.isValidated + ", isMetered=" + this.isMetered + ", isNotRoaming=" + this.isNotRoaming + ')';
    }
}
