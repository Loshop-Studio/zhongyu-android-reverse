package androidx.camera.core.imagecapture;

import android.support.v4.media.AbstractC0037f;
import androidx.camera.core.imagecapture.ProcessingNode;
import androidx.camera.core.processing.Edge;

/* loaded from: classes.dex */
final class AutoValue_ProcessingNode_In extends ProcessingNode.AbstractC0335In {
    private final Edge<ProcessingNode.InputPacket> edge;
    private final int inputFormat;
    private final int outputFormat;
    private final Edge<ProcessingNode.InputPacket> postviewEdge;

    public AutoValue_ProcessingNode_In(Edge<ProcessingNode.InputPacket> edge, Edge<ProcessingNode.InputPacket> edge2, int i, int i8) {
        if (edge == null) {
            throw new NullPointerException("Null edge");
        }
        this.edge = edge;
        if (edge2 == null) {
            throw new NullPointerException("Null postviewEdge");
        }
        this.postviewEdge = edge2;
        this.inputFormat = i;
        this.outputFormat = i8;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ProcessingNode.AbstractC0335In) {
            ProcessingNode.AbstractC0335In abstractC0335In = (ProcessingNode.AbstractC0335In) obj;
            if (this.edge.equals(abstractC0335In.getEdge()) && this.postviewEdge.equals(abstractC0335In.getPostviewEdge()) && this.inputFormat == abstractC0335In.getInputFormat() && this.outputFormat == abstractC0335In.getOutputFormat()) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.camera.core.imagecapture.ProcessingNode.AbstractC0335In
    public Edge<ProcessingNode.InputPacket> getEdge() {
        return this.edge;
    }

    @Override // androidx.camera.core.imagecapture.ProcessingNode.AbstractC0335In
    public int getInputFormat() {
        return this.inputFormat;
    }

    @Override // androidx.camera.core.imagecapture.ProcessingNode.AbstractC0335In
    public int getOutputFormat() {
        return this.outputFormat;
    }

    @Override // androidx.camera.core.imagecapture.ProcessingNode.AbstractC0335In
    public Edge<ProcessingNode.InputPacket> getPostviewEdge() {
        return this.postviewEdge;
    }

    public int hashCode() {
        return ((((((this.edge.hashCode() ^ 1000003) * 1000003) ^ this.postviewEdge.hashCode()) * 1000003) ^ this.inputFormat) * 1000003) ^ this.outputFormat;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("In{edge=");
        sb.append(this.edge);
        sb.append(", postviewEdge=");
        sb.append(this.postviewEdge);
        sb.append(", inputFormat=");
        sb.append(this.inputFormat);
        sb.append(", outputFormat=");
        return AbstractC0037f.m90o(sb, "}", this.outputFormat);
    }
}
