package androidx.constraintlayout.compose;

import androidx.autofill.HintConstants;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@StabilityInferred(parameters = 1)
@ExperimentalMotionApi
@Metadata(m13412d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, m13413d2 = {"Landroidx/constraintlayout/compose/Easing;", "Landroidx/constraintlayout/compose/NamedPropertyOrValue;", HintConstants.AUTOFILL_HINT_NAME, "", "(Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "Companion", "constraintlayout-compose_release"}, m13414k = 1, m13415mv = {1, 8, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final class Easing implements NamedPropertyOrValue {
    public static final int $stable = 0;
    private final String name;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Easing Standard = new Easing("standard");
    private static final Easing Accelerate = new Easing("accelerate");
    private static final Easing Decelerate = new Easing("decelerate");
    private static final Easing Linear = new Easing("linear");
    private static final Easing Anticipate = new Easing("anticipate");
    private static final Easing Overshoot = new Easing("overshoot");

    @Metadata(m13412d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J&\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0013R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0011\u0010\t\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u0011\u0010\u000b\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0006R\u0011\u0010\r\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0006R\u0011\u0010\u000f\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0006¨\u0006\u0017"}, m13413d2 = {"Landroidx/constraintlayout/compose/Easing$Companion;", "", "()V", "Accelerate", "Landroidx/constraintlayout/compose/Easing;", "getAccelerate", "()Landroidx/constraintlayout/compose/Easing;", "Anticipate", "getAnticipate", "Decelerate", "getDecelerate", "Linear", "getLinear", "Overshoot", "getOvershoot", "Standard", "getStandard", "cubic", "x1", "", "y1", "x2", "y2", "constraintlayout-compose_release"}, m13414k = 1, m13415mv = {1, 8, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Easing cubic(float x12, float y12, float x22, float y22) {
            return new Easing("cubic(" + x12 + ", " + y12 + ", " + x22 + ", " + y22 + ')');
        }

        public final Easing getAccelerate() {
            return Easing.Accelerate;
        }

        public final Easing getAnticipate() {
            return Easing.Anticipate;
        }

        public final Easing getDecelerate() {
            return Easing.Decelerate;
        }

        public final Easing getLinear() {
            return Easing.Linear;
        }

        public final Easing getOvershoot() {
            return Easing.Overshoot;
        }

        public final Easing getStandard() {
            return Easing.Standard;
        }

        private Companion() {
        }
    }

    public Easing(String str) {
        this.name = str;
    }

    @Override // androidx.constraintlayout.compose.NamedPropertyOrValue
    public String getName() {
        return this.name;
    }
}
