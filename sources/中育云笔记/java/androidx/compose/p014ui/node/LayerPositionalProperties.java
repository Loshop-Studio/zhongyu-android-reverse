package androidx.compose.p014ui.node;

import androidx.compose.p014ui.graphics.GraphicsLayerScope;
import androidx.compose.p014ui.graphics.TransformOrigin;

/* loaded from: classes2.dex */
final class LayerPositionalProperties {
    private float rotationX;
    private float rotationY;
    private float rotationZ;
    private float translationX;
    private float translationY;
    private float scaleX = 1.0f;
    private float scaleY = 1.0f;
    private float cameraDistance = 8.0f;
    private long transformOrigin = TransformOrigin.Companion.m31269getCenterSzJe1aQ();

    public final void copyFrom(LayerPositionalProperties layerPositionalProperties) {
        this.scaleX = layerPositionalProperties.scaleX;
        this.scaleY = layerPositionalProperties.scaleY;
        this.translationX = layerPositionalProperties.translationX;
        this.translationY = layerPositionalProperties.translationY;
        this.rotationX = layerPositionalProperties.rotationX;
        this.rotationY = layerPositionalProperties.rotationY;
        this.rotationZ = layerPositionalProperties.rotationZ;
        this.cameraDistance = layerPositionalProperties.cameraDistance;
        this.transformOrigin = layerPositionalProperties.transformOrigin;
    }

    public final boolean hasSameValuesAs(LayerPositionalProperties layerPositionalProperties) {
        return this.scaleX == layerPositionalProperties.scaleX && this.scaleY == layerPositionalProperties.scaleY && this.translationX == layerPositionalProperties.translationX && this.translationY == layerPositionalProperties.translationY && this.rotationX == layerPositionalProperties.rotationX && this.rotationY == layerPositionalProperties.rotationY && this.rotationZ == layerPositionalProperties.rotationZ && this.cameraDistance == layerPositionalProperties.cameraDistance && TransformOrigin.m31263equalsimpl0(this.transformOrigin, layerPositionalProperties.transformOrigin);
    }

    public final void copyFrom(GraphicsLayerScope graphicsLayerScope) {
        this.scaleX = graphicsLayerScope.getScaleX();
        this.scaleY = graphicsLayerScope.getScaleY();
        this.translationX = graphicsLayerScope.getTranslationX();
        this.translationY = graphicsLayerScope.getTranslationY();
        this.rotationX = graphicsLayerScope.getRotationX();
        this.rotationY = graphicsLayerScope.getRotationY();
        this.rotationZ = graphicsLayerScope.getRotationZ();
        this.cameraDistance = graphicsLayerScope.getCameraDistance();
        this.transformOrigin = graphicsLayerScope.mo31066getTransformOriginSzJe1aQ();
    }
}
