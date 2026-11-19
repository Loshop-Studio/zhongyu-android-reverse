package androidx.constraintlayout.compose;

import androidx.autofill.HintConstants;
import androidx.compose.runtime.Immutable;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Immutable
@Metadata(m13412d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, m13413d2 = {"Landroidx/constraintlayout/compose/HorizontalAlign;", "", HintConstants.AUTOFILL_HINT_NAME, "", "(Ljava/lang/String;)V", "getName$constraintlayout_compose_release", "()Ljava/lang/String;", "Companion", "constraintlayout-compose_release"}, m13414k = 1, m13415mv = {1, 8, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final class HorizontalAlign {
    public static final int $stable = 0;
    private final String name;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final HorizontalAlign Start = new HorizontalAlign("start");
    private static final HorizontalAlign End = new HorizontalAlign("end");
    private static final HorizontalAlign Center = new HorizontalAlign("center");

    @Metadata(m13412d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0011\u0010\t\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006¨\u0006\u000b"}, m13413d2 = {"Landroidx/constraintlayout/compose/HorizontalAlign$Companion;", "", "()V", "Center", "Landroidx/constraintlayout/compose/HorizontalAlign;", "getCenter", "()Landroidx/constraintlayout/compose/HorizontalAlign;", "End", "getEnd", "Start", "getStart", "constraintlayout-compose_release"}, m13414k = 1, m13415mv = {1, 8, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final HorizontalAlign getCenter() {
            return HorizontalAlign.Center;
        }

        public final HorizontalAlign getEnd() {
            return HorizontalAlign.End;
        }

        public final HorizontalAlign getStart() {
            return HorizontalAlign.Start;
        }

        private Companion() {
        }
    }

    public HorizontalAlign(String str) {
        this.name = str;
    }

    /* renamed from: getName$constraintlayout_compose_release, reason: from getter */
    public final String getName() {
        return this.name;
    }
}
