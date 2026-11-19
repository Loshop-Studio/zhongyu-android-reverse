package androidx.camera.core.imagecapture;

import android.util.Size;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.core.ImageReaderProxyProvider;
import androidx.camera.core.imagecapture.CaptureNode;
import androidx.camera.core.imagecapture.TakePictureManager;
import androidx.camera.core.processing.Edge;

/* loaded from: classes.dex */
final class AutoValue_CaptureNode_In extends CaptureNode.AbstractC0590In {
    private final Edge<TakePictureManager.CaptureError> errorEdge;
    private final ImageReaderProxyProvider imageReaderProxyProvider;
    private final int inputFormat;
    private final int outputFormat;
    private final int postviewImageFormat;
    private final Size postviewSize;
    private final Edge<ProcessingRequest> requestEdge;
    private final Size size;
    private final boolean virtualCamera;

    public AutoValue_CaptureNode_In(Size size, int i10, int i11, boolean z10, @Nullable ImageReaderProxyProvider imageReaderProxyProvider, @Nullable Size size2, int i12, Edge<ProcessingRequest> edge, Edge<TakePictureManager.CaptureError> edge2) {
        if (size == null) {
            throw new NullPointerException("Null size");
        }
        this.size = size;
        this.inputFormat = i10;
        this.outputFormat = i11;
        this.virtualCamera = z10;
        this.imageReaderProxyProvider = imageReaderProxyProvider;
        this.postviewSize = size2;
        this.postviewImageFormat = i12;
        if (edge == null) {
            throw new NullPointerException("Null requestEdge");
        }
        this.requestEdge = edge;
        if (edge2 == null) {
            throw new NullPointerException("Null errorEdge");
        }
        this.errorEdge = edge2;
    }

    public boolean equals(Object obj) {
        ImageReaderProxyProvider imageReaderProxyProvider;
        Size size;
        if (obj == this) {
            return true;
        }
        if (obj instanceof CaptureNode.AbstractC0590In) {
            CaptureNode.AbstractC0590In abstractC0590In = (CaptureNode.AbstractC0590In) obj;
            if (this.size.equals(abstractC0590In.getSize()) && this.inputFormat == abstractC0590In.getInputFormat() && this.outputFormat == abstractC0590In.getOutputFormat() && this.virtualCamera == abstractC0590In.isVirtualCamera() && ((imageReaderProxyProvider = this.imageReaderProxyProvider) != null ? imageReaderProxyProvider.equals(abstractC0590In.getImageReaderProxyProvider()) : abstractC0590In.getImageReaderProxyProvider() == null) && ((size = this.postviewSize) != null ? size.equals(abstractC0590In.getPostviewSize()) : abstractC0590In.getPostviewSize() == null) && this.postviewImageFormat == abstractC0590In.getPostviewImageFormat() && this.requestEdge.equals(abstractC0590In.getRequestEdge()) && this.errorEdge.equals(abstractC0590In.getErrorEdge())) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.camera.core.imagecapture.CaptureNode.AbstractC0590In
    @NonNull
    public Edge<TakePictureManager.CaptureError> getErrorEdge() {
        return this.errorEdge;
    }

    @Override // androidx.camera.core.imagecapture.CaptureNode.AbstractC0590In
    @Nullable
    public ImageReaderProxyProvider getImageReaderProxyProvider() {
        return this.imageReaderProxyProvider;
    }

    @Override // androidx.camera.core.imagecapture.CaptureNode.AbstractC0590In
    public int getInputFormat() {
        return this.inputFormat;
    }

    @Override // androidx.camera.core.imagecapture.CaptureNode.AbstractC0590In
    public int getOutputFormat() {
        return this.outputFormat;
    }

    @Override // androidx.camera.core.imagecapture.CaptureNode.AbstractC0590In
    public int getPostviewImageFormat() {
        return this.postviewImageFormat;
    }

    @Override // androidx.camera.core.imagecapture.CaptureNode.AbstractC0590In
    @Nullable
    public Size getPostviewSize() {
        return this.postviewSize;
    }

    @Override // androidx.camera.core.imagecapture.CaptureNode.AbstractC0590In
    @NonNull
    public Edge<ProcessingRequest> getRequestEdge() {
        return this.requestEdge;
    }

    @Override // androidx.camera.core.imagecapture.CaptureNode.AbstractC0590In
    public Size getSize() {
        return this.size;
    }

    public int hashCode() {
        int iHashCode = (((((((this.size.hashCode() ^ 1000003) * 1000003) ^ this.inputFormat) * 1000003) ^ this.outputFormat) * 1000003) ^ (this.virtualCamera ? 1231 : 1237)) * 1000003;
        ImageReaderProxyProvider imageReaderProxyProvider = this.imageReaderProxyProvider;
        int iHashCode2 = (iHashCode ^ (imageReaderProxyProvider == null ? 0 : imageReaderProxyProvider.hashCode())) * 1000003;
        Size size = this.postviewSize;
        return ((((((iHashCode2 ^ (size != null ? size.hashCode() : 0)) * 1000003) ^ this.postviewImageFormat) * 1000003) ^ this.requestEdge.hashCode()) * 1000003) ^ this.errorEdge.hashCode();
    }

    @Override // androidx.camera.core.imagecapture.CaptureNode.AbstractC0590In
    public boolean isVirtualCamera() {
        return this.virtualCamera;
    }

    public String toString() {
        return "In{size=" + this.size + ", inputFormat=" + this.inputFormat + ", outputFormat=" + this.outputFormat + ", virtualCamera=" + this.virtualCamera + ", imageReaderProxyProvider=" + this.imageReaderProxyProvider + ", postviewSize=" + this.postviewSize + ", postviewImageFormat=" + this.postviewImageFormat + ", requestEdge=" + this.requestEdge + ", errorEdge=" + this.errorEdge + "}";
    }
}
