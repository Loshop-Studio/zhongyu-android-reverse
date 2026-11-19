package androidx.camera.core.imagecapture;

import androidx.camera.core.imagecapture.ProcessingNode;
import androidx.camera.core.processing.Edge;

/* loaded from: classes.dex */
final class AutoValue_ProcessingNode_In extends ProcessingNode.AbstractC0534In {
    private final Edge<ProcessingNode.InputPacket> edge;
    private final int inputFormat;
    private final int outputFormat;
    private final Edge<ProcessingNode.InputPacket> postviewEdge;

    public AutoValue_ProcessingNode_In(Edge<ProcessingNode.InputPacket> edge, Edge<ProcessingNode.InputPacket> edge2, int i10, int i11) {
        if (edge == null) {
            throw new NullPointerException("Null edge");
        }
        this.edge = edge;
        if (edge2 == null) {
            throw new NullPointerException("Null postviewEdge");
        }
        this.postviewEdge = edge2;
        this.inputFormat = i10;
        this.outputFormat = i11;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ProcessingNode.AbstractC0534In) {
            ProcessingNode.AbstractC0534In abstractC0534In = (ProcessingNode.AbstractC0534In) obj;
            if (this.edge.equals(abstractC0534In.getEdge()) && this.postviewEdge.equals(abstractC0534In.getPostviewEdge()) && this.inputFormat == abstractC0534In.getInputFormat() && this.outputFormat == abstractC0534In.getOutputFormat()) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.camera.core.imagecapture.ProcessingNode.AbstractC0534In
    public Edge<ProcessingNode.InputPacket> getEdge() {
        return this.edge;
    }

    @Override // androidx.camera.core.imagecapture.ProcessingNode.AbstractC0534In
    public int getInputFormat() {
        return this.inputFormat;
    }

    @Override // androidx.camera.core.imagecapture.ProcessingNode.AbstractC0534In
    public int getOutputFormat() {
        return this.outputFormat;
    }

    @Override // androidx.camera.core.imagecapture.ProcessingNode.AbstractC0534In
    public Edge<ProcessingNode.InputPacket> getPostviewEdge() {
        return this.postviewEdge;
    }

    public int hashCode() {
        return ((((((this.edge.hashCode() ^ 1000003) * 1000003) ^ this.postviewEdge.hashCode()) * 1000003) ^ this.inputFormat) * 1000003) ^ this.outputFormat;
    }

    public String toString() {
        return "In{edge=" + this.edge + ", postviewEdge=" + this.postviewEdge + ", inputFormat=" + this.inputFormat + ", outputFormat=" + this.outputFormat + "}";
    }
}
