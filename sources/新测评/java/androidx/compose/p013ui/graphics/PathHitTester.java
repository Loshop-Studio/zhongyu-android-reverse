package androidx.compose.p013ui.graphics;

import androidx.annotation.FloatRange;
import androidx.camera.video.AudioStats;
import androidx.compose.p013ui.geometry.Rect;
import androidx.compose.p013ui.graphics.PathIterator;
import androidx.compose.p013ui.graphics.PathSegment;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m13557d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001b\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0086\u0002ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\n\u001a\u00020\u000b2\b\b\u0003\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0017"}, m13558d2 = {"Landroidx/compose/ui/graphics/PathHitTester;", "", "()V", "bounds", "Landroidx/compose/ui/geometry/Rect;", "curves", "", "intervals", "Landroidx/compose/ui/graphics/IntervalTree;", "Landroidx/compose/ui/graphics/PathSegment;", "path", "Landroidx/compose/ui/graphics/Path;", "roots", "tolerance", "", "contains", "", RequestParameters.POSITION, "Landroidx/compose/ui/geometry/Offset;", "contains-k-4lQ0M", "(J)Z", "updatePath", "", "ui-graphics_release"}, m13559k = 1, m13560mv = {1, 9, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nPathHitTester.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PathHitTester.kt\nandroidx/compose/ui/graphics/PathHitTester\n+ 2 FloatFloatPair.kt\nandroidx/collection/FloatFloatPair\n+ 3 PackingHelpers.jvm.kt\nandroidx/collection/internal/PackingHelpers_jvmKt\n+ 4 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 5 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 6 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 7 IntervalTree.kt\nandroidx/compose/ui/graphics/IntervalTree\n*L\n1#1,163:1\n67#2:164\n80#2:166\n22#3:165\n71#4:167\n65#4:168\n73#4:171\n69#4:172\n60#5:169\n70#5:173\n22#6:170\n22#6:174\n151#7,17:175\n*S KotlinDebug\n*F\n+ 1 PathHitTester.kt\nandroidx/compose/ui/graphics/PathHitTester\n*L\n100#1:164\n100#1:166\n100#1:165\n122#1:167\n122#1:168\n125#1:171\n125#1:172\n122#1:169\n125#1:173\n122#1:170\n125#1:174\n131#1:175,17\n*E\n"})
/* loaded from: classes2.dex */
public final class PathHitTester {
    private Path path = PathHitTesterKt.EmptyPath;
    private float tolerance = 0.5f;
    private Rect bounds = Rect.INSTANCE.getZero();
    private final IntervalTree<PathSegment> intervals = new IntervalTree<>();
    private final float[] curves = new float[20];
    private final float[] roots = new float[2];

    @Metadata(m13559k = 3, m13560mv = {1, 9, 0}, m13562xi = 48)
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
    public final boolean m21260containsk4lQ0M(long position) {
        int i10;
        int iLineWinding;
        if (!this.path.isEmpty() && this.bounds.m20761containsk4lQ0M(position)) {
            float fIntBitsToFloat = Float.intBitsToFloat((int) (position >> 32));
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (position & 4294967295L));
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
                        Intrinsics.checkNotNull(data);
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
            if (PathFillType.m21254equalsimpl0(this.path.mo20867getFillTypeRgk1Os(), PathFillType.INSTANCE.m21258getEvenOddRgk1Os())) {
                i10 &= 1;
            }
            if (i10 != 0) {
                return true;
            }
        }
        return false;
    }

    public final void updatePath(Path path, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE) float tolerance) {
        this.path = path;
        this.tolerance = tolerance;
        this.bounds = path.getBounds();
        this.intervals.clear();
        PathIterator it = path.iterator(PathIterator.ConicEvaluation.AsQuadratics, tolerance);
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
