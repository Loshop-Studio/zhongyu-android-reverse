package androidx.compose.p014ui.graphics;

import androidx.annotation.FloatRange;
import androidx.camera.video.AudioStats;
import androidx.compose.p014ui.geometry.Rect;
import androidx.compose.p014ui.graphics.PathIterator;
import androidx.compose.p014ui.graphics.PathSegment;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC9979u;

/* loaded from: classes2.dex */
public final class PathHitTester {
    private Path path = PathHitTesterKt.EmptyPath;
    private float tolerance = 0.5f;
    private Rect bounds = Rect.Companion.getZero();
    private final IntervalTree<PathSegment> intervals = new IntervalTree<>();
    private final float[] curves = new float[20];
    private final float[] roots = new float[2];

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PathSegment.Type.values().length];
            try {
                iArr[PathSegment.Type.Line.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PathSegment.Type.Quadratic.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PathSegment.Type.Cubic.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PathSegment.Type.Done.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static /* synthetic */ void updatePath$default(PathHitTester pathHitTester, Path path, float f10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            f10 = 0.5f;
        }
        pathHitTester.updatePath(path, f10);
    }

    /* renamed from: contains-k-4lQ0M, reason: not valid java name */
    public final boolean m31162containsk4lQ0M(long j10) {
        int i10;
        int iLineWinding;
        if (!this.path.isEmpty() && this.bounds.m30663containsk4lQ0M(j10)) {
            float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32));
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j10 & 4294967295L));
            float[] fArr = this.curves;
            float[] fArr2 = this.roots;
            IntervalTree<PathSegment> intervalTree = this.intervals;
            IntervalTree<PathSegment>.Node node = intervalTree.root;
            if (node != intervalTree.terminator) {
                ArrayList<IntervalTree<PathSegment>.Node> arrayList = intervalTree.stack;
                arrayList.add(node);
                i10 = 0;
                while (arrayList.size() > 0) {
                    IntervalTree<PathSegment>.Node nodeRemove = arrayList.remove(arrayList.size() - 1);
                    if (nodeRemove.overlaps(fIntBitsToFloat2, fIntBitsToFloat2)) {
                        PathSegment data = nodeRemove.getData();
                        AbstractC9979u.m20291d(data);
                        PathSegment pathSegment = data;
                        float[] points = pathSegment.getPoints();
                        int i11 = WhenMappings.$EnumSwitchMapping$0[pathSegment.getType().ordinal()];
                        if (i11 == 1) {
                            iLineWinding = BezierKt.lineWinding(points, fIntBitsToFloat, fIntBitsToFloat2);
                        } else if (i11 == 2) {
                            iLineWinding = BezierKt.quadraticWinding(points, fIntBitsToFloat, fIntBitsToFloat2, fArr, fArr2);
                        } else if (i11 == 3) {
                            iLineWinding = BezierKt.cubicWinding(points, fIntBitsToFloat, fIntBitsToFloat2, fArr, fArr2);
                        }
                        i10 += iLineWinding;
                    }
                    if (nodeRemove.getLeft() != intervalTree.terminator && nodeRemove.getLeft().getMax() >= fIntBitsToFloat2) {
                        arrayList.add(nodeRemove.getLeft());
                    }
                    if (nodeRemove.getRight() != intervalTree.terminator && nodeRemove.getRight().getMin() <= fIntBitsToFloat2) {
                        arrayList.add(nodeRemove.getRight());
                    }
                }
                arrayList.clear();
            } else {
                i10 = 0;
            }
            if (PathFillType.m31156equalsimpl0(this.path.mo30769getFillTypeRgk1Os(), PathFillType.Companion.m31160getEvenOddRgk1Os())) {
                i10 &= 1;
            }
            if (i10 != 0) {
                return true;
            }
        }
        return false;
    }

    public final void updatePath(Path path, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE) float f10) {
        this.path = path;
        this.tolerance = f10;
        this.bounds = path.getBounds();
        this.intervals.clear();
        PathIterator it = path.iterator(PathIterator.ConicEvaluation.AsQuadratics, f10);
        while (it.hasNext()) {
            PathSegment next = it.next();
            int i10 = WhenMappings.$EnumSwitchMapping$0[next.getType().ordinal()];
            if (i10 == 1 || i10 == 2 || i10 == 3) {
                long jComputeVerticalBounds$default = BezierKt.computeVerticalBounds$default(next, this.curves, 0, 4, null);
                this.intervals.addInterval(Float.intBitsToFloat((int) (jComputeVerticalBounds$default >> 32)), Float.intBitsToFloat((int) (jComputeVerticalBounds$default & 4294967295L)), next);
            } else if (i10 == 4) {
                return;
            }
        }
    }
}
