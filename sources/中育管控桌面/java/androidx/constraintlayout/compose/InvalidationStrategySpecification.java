package androidx.constraintlayout.compose;

import androidx.compose.p009ui.unit.Constraints;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;

@StabilityInferred(parameters = 0)
@Metadata(m7879d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0007\b\u0000¢\u0006\u0002\u0010\u0002J0\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ0\u0010\u000f\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u000eR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0011"}, m7880d2 = {"Landroidx/constraintlayout/compose/InvalidationStrategySpecification;", "", "()V", "heightRateCount", "", "widthRateCount", "shouldInvalidateOnFixedHeight", "", "oldConstraints", "Landroidx/compose/ui/unit/Constraints;", "newConstraints", "skipCount", "threshold", "shouldInvalidateOnFixedHeight-SulIKG4", "(JJII)Z", "shouldInvalidateOnFixedWidth", "shouldInvalidateOnFixedWidth-SulIKG4", "constraintlayout-compose_release"}, m7881k = 1, m7882mv = {1, 8, 0}, m7884xi = 48)
/* loaded from: classes2.dex */
public final class InvalidationStrategySpecification {
    public static final int $stable = 8;
    private int heightRateCount;
    private int widthRateCount;

    /* renamed from: shouldInvalidateOnFixedHeight-SulIKG4, reason: not valid java name */
    public final boolean m16864shouldInvalidateOnFixedHeightSulIKG4(long oldConstraints, long newConstraints, int skipCount, int threshold) {
        if (Constraints.m16434getHasFixedHeightimpl(oldConstraints) && Constraints.m16434getHasFixedHeightimpl(newConstraints)) {
            int iAbs = Math.abs(Constraints.m16436getMaxHeightimpl(newConstraints) - Constraints.m16436getMaxHeightimpl(oldConstraints));
            if (iAbs >= threshold) {
                this.heightRateCount = 0;
                return true;
            }
            if (iAbs != 0) {
                int i6 = this.heightRateCount + 1;
                this.heightRateCount = i6;
                if (i6 > skipCount) {
                    this.heightRateCount = 0;
                    return true;
                }
            }
        } else {
            this.heightRateCount = 0;
        }
        return false;
    }

    /* renamed from: shouldInvalidateOnFixedWidth-SulIKG4, reason: not valid java name */
    public final boolean m16865shouldInvalidateOnFixedWidthSulIKG4(long oldConstraints, long newConstraints, int skipCount, int threshold) {
        if (Constraints.m16435getHasFixedWidthimpl(oldConstraints) && Constraints.m16435getHasFixedWidthimpl(newConstraints)) {
            int iAbs = Math.abs(Constraints.m16437getMaxWidthimpl(newConstraints) - Constraints.m16437getMaxWidthimpl(oldConstraints));
            if (iAbs >= threshold) {
                this.widthRateCount = 0;
                return true;
            }
            if (iAbs != 0) {
                int i6 = this.widthRateCount + 1;
                this.widthRateCount = i6;
                if (i6 > skipCount) {
                    this.widthRateCount = 0;
                    return true;
                }
            }
        } else {
            this.widthRateCount = 0;
        }
        return false;
    }
}
