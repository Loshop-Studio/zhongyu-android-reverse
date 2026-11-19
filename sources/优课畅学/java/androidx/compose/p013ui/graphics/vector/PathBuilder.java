package androidx.compose.p013ui.graphics.vector;

import androidx.compose.p013ui.graphics.vector.PathNode;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class PathBuilder {
    private final ArrayList<PathNode> _nodes = new ArrayList<>(32);

    public final PathBuilder arcTo(float f10, float f11, float f12, boolean z10, boolean z11, float f13, float f14) {
        this._nodes.add(new PathNode.ArcTo(f10, f11, f12, z10, z11, f13, f14));
        return this;
    }

    public final PathBuilder arcToRelative(float f10, float f11, float f12, boolean z10, boolean z11, float f13, float f14) {
        this._nodes.add(new PathNode.RelativeArcTo(f10, f11, f12, z10, z11, f13, f14));
        return this;
    }

    public final PathBuilder close() {
        this._nodes.add(PathNode.Close.INSTANCE);
        return this;
    }

    public final PathBuilder curveTo(float f10, float f11, float f12, float f13, float f14, float f15) {
        this._nodes.add(new PathNode.CurveTo(f10, f11, f12, f13, f14, f15));
        return this;
    }

    public final PathBuilder curveToRelative(float f10, float f11, float f12, float f13, float f14, float f15) {
        this._nodes.add(new PathNode.RelativeCurveTo(f10, f11, f12, f13, f14, f15));
        return this;
    }

    public final List<PathNode> getNodes() {
        return this._nodes;
    }

    public final PathBuilder horizontalLineTo(float f10) {
        this._nodes.add(new PathNode.HorizontalTo(f10));
        return this;
    }

    public final PathBuilder horizontalLineToRelative(float f10) {
        this._nodes.add(new PathNode.RelativeHorizontalTo(f10));
        return this;
    }

    public final PathBuilder lineTo(float f10, float f11) {
        this._nodes.add(new PathNode.LineTo(f10, f11));
        return this;
    }

    public final PathBuilder lineToRelative(float f10, float f11) {
        this._nodes.add(new PathNode.RelativeLineTo(f10, f11));
        return this;
    }

    public final PathBuilder moveTo(float f10, float f11) {
        this._nodes.add(new PathNode.MoveTo(f10, f11));
        return this;
    }

    public final PathBuilder moveToRelative(float f10, float f11) {
        this._nodes.add(new PathNode.RelativeMoveTo(f10, f11));
        return this;
    }

    public final PathBuilder quadTo(float f10, float f11, float f12, float f13) {
        this._nodes.add(new PathNode.QuadTo(f10, f11, f12, f13));
        return this;
    }

    public final PathBuilder quadToRelative(float f10, float f11, float f12, float f13) {
        this._nodes.add(new PathNode.RelativeQuadTo(f10, f11, f12, f13));
        return this;
    }

    public final PathBuilder reflectiveCurveTo(float f10, float f11, float f12, float f13) {
        this._nodes.add(new PathNode.ReflectiveCurveTo(f10, f11, f12, f13));
        return this;
    }

    public final PathBuilder reflectiveCurveToRelative(float f10, float f11, float f12, float f13) {
        this._nodes.add(new PathNode.RelativeReflectiveCurveTo(f10, f11, f12, f13));
        return this;
    }

    public final PathBuilder reflectiveQuadTo(float f10, float f11) {
        this._nodes.add(new PathNode.ReflectiveQuadTo(f10, f11));
        return this;
    }

    public final PathBuilder reflectiveQuadToRelative(float f10, float f11) {
        this._nodes.add(new PathNode.RelativeReflectiveQuadTo(f10, f11));
        return this;
    }

    public final PathBuilder verticalLineTo(float f10) {
        this._nodes.add(new PathNode.VerticalTo(f10));
        return this;
    }

    public final PathBuilder verticalLineToRelative(float f10) {
        this._nodes.add(new PathNode.RelativeVerticalTo(f10));
        return this;
    }
}
