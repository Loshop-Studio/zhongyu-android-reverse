package androidx.compose.p011ui.graphics;

import androidx.annotation.FloatRange;
import androidx.camera.video.AudioStats;
import androidx.compose.p011ui.geometry.Rect;
import androidx.compose.p011ui.graphics.PathIterator;
import androidx.compose.p011ui.graphics.PathSegment;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(m5109d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0003\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\u0010\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0086\u0002ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0011R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u0012R\u0016\u0010\u0014\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001c\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001e"}, m5110d2 = {"Landroidx/compose/ui/graphics/PathHitTester;", "", "<init>", "()V", "Landroidx/compose/ui/graphics/Path;", "path", "", "tolerance", "Ld6/s;", "updatePath", "(Landroidx/compose/ui/graphics/Path;F)V", "Landroidx/compose/ui/geometry/Offset;", RequestParameters.POSITION, "", "contains-k-4lQ0M", "(J)Z", "contains", "Landroidx/compose/ui/graphics/Path;", "F", "Landroidx/compose/ui/geometry/Rect;", "bounds", "Landroidx/compose/ui/geometry/Rect;", "Landroidx/compose/ui/graphics/IntervalTree;", "Landroidx/compose/ui/graphics/PathSegment;", "intervals", "Landroidx/compose/ui/graphics/IntervalTree;", "", "curves", "[F", "roots", "ui-graphics_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nPathHitTester.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PathHitTester.kt\nandroidx/compose/ui/graphics/PathHitTester\n+ 2 FloatFloatPair.kt\nandroidx/collection/FloatFloatPair\n+ 3 PackingHelpers.jvm.kt\nandroidx/collection/internal/PackingHelpers_jvmKt\n+ 4 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 5 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 6 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 7 IntervalTree.kt\nandroidx/compose/ui/graphics/IntervalTree\n*L\n1#1,163:1\n67#2:164\n80#2:166\n22#3:165\n71#4:167\n65#4:168\n73#4:171\n69#4:172\n60#5:169\n70#5:173\n22#6:170\n22#6:174\n151#7,17:175\n*S KotlinDebug\n*F\n+ 1 PathHitTester.kt\nandroidx/compose/ui/graphics/PathHitTester\n*L\n100#1:164\n100#1:166\n100#1:165\n122#1:167\n122#1:168\n125#1:171\n125#1:172\n122#1:169\n125#1:173\n122#1:170\n125#1:174\n131#1:175,17\n*E\n"})
/* loaded from: classes.dex */
public final class PathHitTester {

    @NotNull
    private Path path = PathHitTesterKt.EmptyPath;
    private float tolerance = 0.5f;

    @NotNull
    private Rect bounds = Rect.INSTANCE.getZero();

    @NotNull
    private final IntervalTree<PathSegment> intervals = new IntervalTree<>();

    @NotNull
    private final float[] curves = new float[20];

    @NotNull
    private final float[] roots = new float[2];

    @Metadata(m5111k = 3, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
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

    public static /* synthetic */ void updatePath$default(PathHitTester pathHitTester, Path path, float f, int i, Object obj) {
        if ((i & 2) != 0) {
            f = 0.5f;
        }
        pathHitTester.updatePath(path, f);
    }

    /* renamed from: contains-k-4lQ0M, reason: not valid java name */
    public final boolean m10966containsk4lQ0M(long position) {
        int i;
        int iLineWinding;
        if (!this.path.isEmpty() && this.bounds.m10467containsk4lQ0M(position)) {
            float fIntBitsToFloat = Float.intBitsToFloat((int) (position >> 32));
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (position & 4294967295L));
            float[] fArr = this.curves;
            float[] fArr2 = this.roots;
            IntervalTree<PathSegment> intervalTree = this.intervals;
            IntervalTree<PathSegment>.Node node = intervalTree.root;
            if (node != intervalTree.terminator) {
                ArrayList<IntervalTree<PathSegment>.Node> arrayList = intervalTree.stack;
                arrayList.add(node);
                i = 0;
                while (arrayList.size() > 0) {
                    IntervalTree<PathSegment>.Node nodeRemove = arrayList.remove(arrayList.size() - 1);
                    if (nodeRemove.overlaps(fIntBitsToFloat2, fIntBitsToFloat2)) {
                        PathSegment data = nodeRemove.getData();
                        AbstractC5830k.m5327d(data);
                        PathSegment pathSegment = data;
                        float[] points = pathSegment.getPoints();
                        int i8 = WhenMappings.$EnumSwitchMapping$0[pathSegment.getType().ordinal()];
                        if (i8 == 1) {
                            iLineWinding = BezierKt.lineWinding(points, fIntBitsToFloat, fIntBitsToFloat2);
                        } else if (i8 == 2) {
                            iLineWinding = BezierKt.quadraticWinding(points, fIntBitsToFloat, fIntBitsToFloat2, fArr, fArr2);
                        } else if (i8 == 3) {
                            iLineWinding = BezierKt.cubicWinding(points, fIntBitsToFloat, fIntBitsToFloat2, fArr, fArr2);
                        }
                        i += iLineWinding;
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
                i = 0;
            }
            if (PathFillType.m10960equalsimpl0(this.path.mo10573getFillTypeRgk1Os(), PathFillType.INSTANCE.m10964getEvenOddRgk1Os())) {
                i &= 1;
            }
            if (i != 0) {
                return true;
            }
        }
        return false;
    }

    public final void updatePath(@NotNull Path path, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE) float tolerance) {
        this.path = path;
        this.tolerance = tolerance;
        this.bounds = path.getBounds();
        this.intervals.clear();
        PathIterator it = path.iterator(PathIterator.ConicEvaluation.AsQuadratics, tolerance);
        while (it.hasNext()) {
            PathSegment next = it.next();
            int i = WhenMappings.$EnumSwitchMapping$0[next.getType().ordinal()];
            if (i == 1 || i == 2 || i == 3) {
                long jComputeVerticalBounds$default = BezierKt.computeVerticalBounds$default(next, this.curves, 0, 4, null);
                this.intervals.addInterval(Float.intBitsToFloat((int) (jComputeVerticalBounds$default >> 32)), Float.intBitsToFloat((int) (jComputeVerticalBounds$default & 4294967295L)), next);
            } else if (i == 4) {
                return;
            }
        }
    }
}
