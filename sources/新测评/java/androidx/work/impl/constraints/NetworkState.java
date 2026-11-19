package androidx.work.impl.constraints;

import kotlin.Metadata;

@Metadata(m13557d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J1\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\bR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\b¨\u0006\u0014"}, m13558d2 = {"Landroidx/work/impl/constraints/NetworkState;", "", "isConnected", "", "isValidated", "isMetered", "isNotRoaming", "(ZZZZ)V", "()Z", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "", "work-runtime_release"}, m13559k = 1, m13560mv = {1, 8, 0}, m13562xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class NetworkState {
    private final boolean isConnected;
    private final boolean isMetered;
    private final boolean isNotRoaming;
    private final boolean isValidated;

    public NetworkState(boolean z9, boolean z10, boolean z11, boolean z12) {
        this.isConnected = z9;
        this.isValidated = z10;
        this.isMetered = z11;
        this.isNotRoaming = z12;
    }

    public static /* synthetic */ NetworkState copy$default(NetworkState networkState, boolean z9, boolean z10, boolean z11, boolean z12, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z9 = networkState.isConnected;
        }
        if ((i10 & 2) != 0) {
            z10 = networkState.isValidated;
        }
        if ((i10 & 4) != 0) {
            z11 = networkState.isMetered;
        }
        if ((i10 & 8) != 0) {
            z12 = networkState.isNotRoaming;
        }
        return networkState.copy(z9, z10, z11, z12);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsConnected() {
        return this.isConnected;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsValidated() {
        return this.isValidated;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsMetered() {
        return this.isMetered;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsNotRoaming() {
        return this.isNotRoaming;
    }

    public final NetworkState copy(boolean isConnected, boolean isValidated, boolean isMetered, boolean isNotRoaming) {
        return new NetworkState(isConnected, isValidated, isMetered, isNotRoaming);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NetworkState)) {
            return false;
        }
        NetworkState networkState = (NetworkState) other;
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
