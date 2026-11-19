package androidx.camera.core.processing;

import androidx.annotation.NonNull;
import androidx.camera.core.processing.SurfaceProcessorNode;
import androidx.camera.core.processing.util.OutConfig;
import java.util.List;

/* loaded from: classes.dex */
final class AutoValue_SurfaceProcessorNode_In extends SurfaceProcessorNode.AbstractC0715In {
    private final List<OutConfig> outConfigs;
    private final SurfaceEdge surfaceEdge;

    public AutoValue_SurfaceProcessorNode_In(SurfaceEdge surfaceEdge, List<OutConfig> list) {
        if (surfaceEdge == null) {
            throw new NullPointerException("Null surfaceEdge");
        }
        this.surfaceEdge = surfaceEdge;
        if (list == null) {
            throw new NullPointerException("Null outConfigs");
        }
        this.outConfigs = list;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SurfaceProcessorNode.AbstractC0715In) {
            SurfaceProcessorNode.AbstractC0715In abstractC0715In = (SurfaceProcessorNode.AbstractC0715In) obj;
            if (this.surfaceEdge.equals(abstractC0715In.getSurfaceEdge()) && this.outConfigs.equals(abstractC0715In.getOutConfigs())) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.camera.core.processing.SurfaceProcessorNode.AbstractC0715In
    @NonNull
    public List<OutConfig> getOutConfigs() {
        return this.outConfigs;
    }

    @Override // androidx.camera.core.processing.SurfaceProcessorNode.AbstractC0715In
    @NonNull
    public SurfaceEdge getSurfaceEdge() {
        return this.surfaceEdge;
    }

    public int hashCode() {
        return ((this.surfaceEdge.hashCode() ^ 1000003) * 1000003) ^ this.outConfigs.hashCode();
    }

    public String toString() {
        return "In{surfaceEdge=" + this.surfaceEdge + ", outConfigs=" + this.outConfigs + "}";
    }
}
