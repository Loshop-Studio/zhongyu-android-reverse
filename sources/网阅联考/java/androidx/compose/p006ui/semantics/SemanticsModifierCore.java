package androidx.compose.p006ui.semantics;

import androidx.compose.p006ui.AbstractC1266a;
import androidx.compose.p006ui.AbstractC1267b;
import androidx.compose.p006ui.Modifier;
import androidx.compose.p006ui.platform.InspectableValueKt;
import androidx.compose.p006ui.platform.InspectorInfo;
import androidx.compose.p006ui.platform.InspectorValueInfo;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m5174d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0000\u0018\u0000 \u00172\u00020\u00012\u00020\u0002:\u0001\u0017BI\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\n\u0012\u0019\b\u0002\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\n¢\u0006\u0002\u0010\rJ\u0013\u0010\u0012\u001a\u00020\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0096\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0016R\u0014\u0010\u000e\u001a\u00020\u000fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0018"}, m5175d2 = {"Landroidx/compose/ui/semantics/SemanticsModifierCore;", "Landroidx/compose/ui/semantics/SemanticsModifier;", "Landroidx/compose/ui/platform/InspectorValueInfo;", "mergeDescendants", "", "clearAndSetSemantics", "properties", "Lkotlin/Function1;", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "", "Lkotlin/ExtensionFunctionType;", "inspectorInfo", "Landroidx/compose/ui/platform/InspectorInfo;", "(ZZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "semanticsConfiguration", "Landroidx/compose/ui/semantics/SemanticsConfiguration;", "getSemanticsConfiguration", "()Landroidx/compose/ui/semantics/SemanticsConfiguration;", "equals", "other", "", "hashCode", "", "Companion", "ui_release"}, m5176k = 1, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class SemanticsModifierCore extends InspectorValueInfo implements SemanticsModifier {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static AtomicInteger lastIdentifier = new AtomicInteger(0);
    private final SemanticsConfiguration semanticsConfiguration;

    @Metadata(m5174d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0006\u001a\u00020\u0007R\u0012\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\b"}, m5175d2 = {"Landroidx/compose/ui/semantics/SemanticsModifierCore$Companion;", "", "()V", "lastIdentifier", "Ljava/util/concurrent/atomic/AtomicInteger;", "Landroidx/compose/ui/platform/AtomicInt;", "generateSemanticsId", "", "ui_release"}, m5176k = 1, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int generateSemanticsId() {
            return SemanticsModifierCore.lastIdentifier.addAndGet(1);
        }
    }

    public /* synthetic */ SemanticsModifierCore(boolean z3, boolean z4, Function1 function1, Function1 function12, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(z3, z4, function1, (i4 & 8) != 0 ? InspectableValueKt.getNoInspectorInfo() : function12);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.p006ui.Modifier
    public /* synthetic */ boolean all(Function1 function1) {
        return AbstractC1267b.m309a(this, function1);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.p006ui.Modifier
    public /* synthetic */ boolean any(Function1 function1) {
        return AbstractC1267b.m310b(this, function1);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof SemanticsModifierCore) && Intrinsics.areEqual(getSemanticsConfiguration(), ((SemanticsModifierCore) other).getSemanticsConfiguration());
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.p006ui.Modifier
    public /* synthetic */ Object foldIn(Object obj, Function2 function2) {
        return AbstractC1267b.m311c(this, obj, function2);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.p006ui.Modifier
    public /* synthetic */ Object foldOut(Object obj, Function2 function2) {
        return AbstractC1267b.m312d(this, obj, function2);
    }

    @Override // androidx.compose.p006ui.semantics.SemanticsModifier
    public /* synthetic */ int getId() {
        return AbstractC1617a.m838a(this);
    }

    @Override // androidx.compose.p006ui.semantics.SemanticsModifier
    public SemanticsConfiguration getSemanticsConfiguration() {
        return this.semanticsConfiguration;
    }

    public int hashCode() {
        return getSemanticsConfiguration().hashCode();
    }

    @Override // androidx.compose.p006ui.Modifier
    public /* synthetic */ Modifier then(Modifier modifier) {
        return AbstractC1266a.m307a(this, modifier);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SemanticsModifierCore(boolean z3, boolean z4, Function1<? super SemanticsPropertyReceiver, Unit> properties, Function1<? super InspectorInfo, Unit> inspectorInfo) {
        super(inspectorInfo);
        Intrinsics.checkNotNullParameter(properties, "properties");
        Intrinsics.checkNotNullParameter(inspectorInfo, "inspectorInfo");
        SemanticsConfiguration semanticsConfiguration = new SemanticsConfiguration();
        semanticsConfiguration.setMergingSemanticsOfDescendants(z3);
        semanticsConfiguration.setClearingSemantics(z4);
        properties.invoke(semanticsConfiguration);
        this.semanticsConfiguration = semanticsConfiguration;
    }
}
