package androidx.compose.p013ui.graphics;

import androidx.compose.p013ui.graphics.PathSegment;
import java.util.Iterator;
import kotlin.enums.AbstractC9108a;
import p212p7.InterfaceC9760a;
import p311y7.InterfaceC10668a;

/* loaded from: classes2.dex */
public interface PathIterator extends Iterator<PathSegment>, InterfaceC10668a {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class ConicEvaluation {
        private static final /* synthetic */ InterfaceC9760a $ENTRIES;
        private static final /* synthetic */ ConicEvaluation[] $VALUES;
        public static final ConicEvaluation AsConic = new ConicEvaluation("AsConic", 0);
        public static final ConicEvaluation AsQuadratics = new ConicEvaluation("AsQuadratics", 1);

        private static final /* synthetic */ ConicEvaluation[] $values() {
            return new ConicEvaluation[]{AsConic, AsQuadratics};
        }

        static {
            ConicEvaluation[] conicEvaluationArr$values = $values();
            $VALUES = conicEvaluationArr$values;
            $ENTRIES = AbstractC9108a.m16085a(conicEvaluationArr$values);
        }

        private ConicEvaluation(String str, int i10) {
        }

        public static InterfaceC9760a getEntries() {
            return $ENTRIES;
        }

        public static ConicEvaluation valueOf(String str) {
            return (ConicEvaluation) Enum.valueOf(ConicEvaluation.class, str);
        }

        public static ConicEvaluation[] values() {
            return (ConicEvaluation[]) $VALUES.clone();
        }
    }

    static /* synthetic */ int calculateSize$default(PathIterator pathIterator, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: calculateSize");
        }
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        return pathIterator.calculateSize(z10);
    }

    static /* synthetic */ PathSegment.Type next$default(PathIterator pathIterator, float[] fArr, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: next");
        }
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        return pathIterator.next(fArr, i10);
    }

    int calculateSize(boolean z10);

    ConicEvaluation getConicEvaluation();

    Path getPath();

    float getTolerance();

    @Override // java.util.Iterator
    boolean hasNext();

    PathSegment.Type next(float[] fArr, int i10);

    @Override // java.util.Iterator
    PathSegment next();
}
