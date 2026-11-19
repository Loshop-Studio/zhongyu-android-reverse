package androidx.compose.p011ui.platform;

import android.graphics.Matrix;
import androidx.autofill.HintConstants;
import androidx.compose.p011ui.geometry.MutableRect;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.graphics.AndroidMatrixConversions_androidKt;
import androidx.compose.p011ui.graphics.MatrixKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p152r6.InterfaceC6473e;

@StabilityInferred(parameters = 0)
@Metadata(m5109d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B?\u00126\u0010\n\u001a2\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t0\u0003¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\u000eJ\u001b\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00028\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0015\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0006\u001a\u00028\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0012J\u001d\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001a\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u001a\u0010\u0019J \u0010\u0018\u001a\u00020\u001b2\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u001c\u001a\u00020\u001bø\u0001\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ \u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u001c\u001a\u00020\u001bø\u0001\u0001¢\u0006\u0004\b\u001f\u0010\u001eRD\u0010\n\u001a2\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t0\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010 R\u0018\u0010!\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u001c\u0010#\u001a\u00020\u00108\u0002@\u0002X\u0082\u000eø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\n\u0004\b#\u0010$R\u001c\u0010%\u001a\u00020\u00108\u0002@\u0002X\u0082\u000eø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\n\u0004\b%\u0010$R\u0016\u0010'\u001a\u00020&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010)\u001a\u00020&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010(R\u0016\u0010*\u001a\u00020&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010(R\u0016\u0010+\u001a\u00020&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010(\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006,"}, m5110d2 = {"Landroidx/compose/ui/platform/LayerMatrixCache;", ExifInterface.GPS_DIRECTION_TRUE, "", "Lkotlin/Function2;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, TypedValues.AttributesType.S_TARGET, "Landroid/graphics/Matrix;", "matrix", "Ld6/s;", "getMatrix", "<init>", "(Lr6/e;)V", "reset", "()V", "invalidate", "Landroidx/compose/ui/graphics/Matrix;", "calculateMatrix-GrdbGEg", "(Ljava/lang/Object;)[F", "calculateMatrix", "calculateInverseMatrix-bWbORWo", "calculateInverseMatrix", "Landroidx/compose/ui/geometry/MutableRect;", "rect", "map", "(Ljava/lang/Object;Landroidx/compose/ui/geometry/MutableRect;)V", "mapInverse", "Landroidx/compose/ui/geometry/Offset;", TypedValues.CycleType.S_WAVE_OFFSET, "map-R5De75A", "(Ljava/lang/Object;J)J", "mapInverse-R5De75A", "Lr6/e;", "androidMatrixCache", "Landroid/graphics/Matrix;", "matrixCache", "[F", "inverseMatrixCache", "", "isDirty", "Z", "isInverseDirty", "isInverseValid", "isIdentity", "ui_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nLayerMatrixCache.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayerMatrixCache.android.kt\nandroidx/compose/ui/platform/LayerMatrixCache\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,134:1\n1#2:135\n*E\n"})
/* loaded from: classes2.dex */
public final class LayerMatrixCache<T> {
    public static final int $stable = 8;

    @Nullable
    private Matrix androidMatrixCache;

    @NotNull
    private final InterfaceC6473e getMatrix;
    private boolean isDirty;
    private boolean isInverseDirty;

    @NotNull
    private float[] matrixCache = androidx.compose.p011ui.graphics.Matrix.m10912constructorimpl$default(null, 1, null);

    @NotNull
    private float[] inverseMatrixCache = androidx.compose.p011ui.graphics.Matrix.m10912constructorimpl$default(null, 1, null);
    private boolean isInverseValid = true;
    private boolean isIdentity = true;

    public LayerMatrixCache(@NotNull InterfaceC6473e interfaceC6473e) {
        this.getMatrix = interfaceC6473e;
    }

    @Nullable
    /* renamed from: calculateInverseMatrix-bWbORWo, reason: not valid java name */
    public final float[] m12473calculateInverseMatrixbWbORWo(T target) {
        float[] fArr = this.inverseMatrixCache;
        if (this.isInverseDirty) {
            this.isInverseValid = InvertMatrixKt.m12471invertToJiSxe2E(m12474calculateMatrixGrdbGEg(target), fArr);
            this.isInverseDirty = false;
        }
        if (this.isInverseValid) {
            return fArr;
        }
        return null;
    }

    @NotNull
    /* renamed from: calculateMatrix-GrdbGEg, reason: not valid java name */
    public final float[] m12474calculateMatrixGrdbGEg(T target) {
        float[] fArr = this.matrixCache;
        if (!this.isDirty) {
            return fArr;
        }
        Matrix matrix = this.androidMatrixCache;
        if (matrix == null) {
            matrix = new Matrix();
            this.androidMatrixCache = matrix;
        }
        this.getMatrix.invoke(target, matrix);
        AndroidMatrixConversions_androidKt.m10553setFromtUYjHk(fArr, matrix);
        this.isDirty = false;
        this.isIdentity = MatrixKt.m10937isIdentity58bKbWc(fArr);
        return fArr;
    }

    public final void invalidate() {
        this.isDirty = true;
        this.isInverseDirty = true;
    }

    public final void map(T target, @NotNull MutableRect rect) {
        float[] fArrM12474calculateMatrixGrdbGEg = m12474calculateMatrixGrdbGEg(target);
        if (this.isIdentity) {
            return;
        }
        androidx.compose.p011ui.graphics.Matrix.m10920mapimpl(fArrM12474calculateMatrixGrdbGEg, rect);
    }

    /* renamed from: map-R5De75A, reason: not valid java name */
    public final long m12475mapR5De75A(T target, long offset) {
        return !this.isIdentity ? androidx.compose.p011ui.graphics.Matrix.m10918mapMKHz9U(m12474calculateMatrixGrdbGEg(target), offset) : offset;
    }

    public final void mapInverse(T target, @NotNull MutableRect rect) {
        float[] fArrM12473calculateInverseMatrixbWbORWo = m12473calculateInverseMatrixbWbORWo(target);
        if (fArrM12473calculateInverseMatrixbWbORWo == null) {
            rect.set(0.0f, 0.0f, 0.0f, 0.0f);
        } else {
            if (this.isIdentity) {
                return;
            }
            androidx.compose.p011ui.graphics.Matrix.m10920mapimpl(fArrM12473calculateInverseMatrixbWbORWo, rect);
        }
    }

    /* renamed from: mapInverse-R5De75A, reason: not valid java name */
    public final long m12476mapInverseR5De75A(T target, long offset) {
        float[] fArrM12473calculateInverseMatrixbWbORWo = m12473calculateInverseMatrixbWbORWo(target);
        return fArrM12473calculateInverseMatrixbWbORWo == null ? Offset.INSTANCE.m10455getInfiniteF1C5BW0() : !this.isIdentity ? androidx.compose.p011ui.graphics.Matrix.m10918mapMKHz9U(fArrM12473calculateInverseMatrixbWbORWo, offset) : offset;
    }

    public final void reset() {
        this.isDirty = false;
        this.isInverseDirty = false;
        this.isIdentity = true;
        this.isInverseValid = true;
        androidx.compose.p011ui.graphics.Matrix.m10921resetimpl(this.matrixCache);
        androidx.compose.p011ui.graphics.Matrix.m10921resetimpl(this.inverseMatrixCache);
    }
}
