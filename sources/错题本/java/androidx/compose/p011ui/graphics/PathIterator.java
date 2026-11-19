package androidx.compose.p011ui.graphics;

import androidx.compose.p011ui.graphics.PathSegment;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.enums.AbstractC5817a;
import org.jetbrains.annotations.NotNull;
import p092j6.InterfaceC5748a;
import p160s6.InterfaceC6560a;

@Metadata(m5109d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0003\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0019J\u0012\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u0012H&J\t\u0010\u0013\u001a\u00020\u0012H¦\u0002J\t\u0010\u0014\u001a\u00020\u0002H¦\u0002J\u001a\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u0010H&R\u0012\u0010\u0003\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0012\u0010\u0007\u001a\u00020\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0012\u0010\u000b\u001a\u00020\fX¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u001aÀ\u0006\u0001"}, m5110d2 = {"Landroidx/compose/ui/graphics/PathIterator;", "", "Landroidx/compose/ui/graphics/PathSegment;", "conicEvaluation", "Landroidx/compose/ui/graphics/PathIterator$ConicEvaluation;", "getConicEvaluation", "()Landroidx/compose/ui/graphics/PathIterator$ConicEvaluation;", "path", "Landroidx/compose/ui/graphics/Path;", "getPath", "()Landroidx/compose/ui/graphics/Path;", "tolerance", "", "getTolerance", "()F", "calculateSize", "", "includeConvertedConics", "", "hasNext", "next", "Landroidx/compose/ui/graphics/PathSegment$Type;", "outPoints", "", TypedValues.CycleType.S_WAVE_OFFSET, "ConicEvaluation", "ui-graphics_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public interface PathIterator extends Iterator<PathSegment>, InterfaceC6560a {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, m5110d2 = {"Landroidx/compose/ui/graphics/PathIterator$ConicEvaluation;", "", "(Ljava/lang/String;I)V", "AsConic", "AsQuadratics", "ui-graphics_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class ConicEvaluation {
        private static final /* synthetic */ InterfaceC5748a $ENTRIES;
        private static final /* synthetic */ ConicEvaluation[] $VALUES;
        public static final ConicEvaluation AsConic = new ConicEvaluation("AsConic", 0);
        public static final ConicEvaluation AsQuadratics = new ConicEvaluation("AsQuadratics", 1);

        private static final /* synthetic */ ConicEvaluation[] $values() {
            return new ConicEvaluation[]{AsConic, AsQuadratics};
        }

        static {
            ConicEvaluation[] conicEvaluationArr$values = $values();
            $VALUES = conicEvaluationArr$values;
            $ENTRIES = AbstractC5817a.m5310a(conicEvaluationArr$values);
        }

        private ConicEvaluation(String str, int i) {
        }

        @NotNull
        public static InterfaceC5748a getEntries() {
            return $ENTRIES;
        }

        public static ConicEvaluation valueOf(String str) {
            return (ConicEvaluation) Enum.valueOf(ConicEvaluation.class, str);
        }

        public static ConicEvaluation[] values() {
            return (ConicEvaluation[]) $VALUES.clone();
        }
    }

    static /* synthetic */ int calculateSize$default(PathIterator pathIterator, boolean z8, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: calculateSize");
        }
        if ((i & 1) != 0) {
            z8 = true;
        }
        return pathIterator.calculateSize(z8);
    }

    static /* synthetic */ PathSegment.Type next$default(PathIterator pathIterator, float[] fArr, int i, int i8, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: next");
        }
        if ((i8 & 2) != 0) {
            i = 0;
        }
        return pathIterator.next(fArr, i);
    }

    int calculateSize(boolean includeConvertedConics);

    @NotNull
    ConicEvaluation getConicEvaluation();

    @NotNull
    Path getPath();

    float getTolerance();

    @Override // java.util.Iterator
    boolean hasNext();

    @NotNull
    PathSegment.Type next(@NotNull float[] outPoints, int offset);

    @Override // java.util.Iterator
    @NotNull
    PathSegment next();
}
