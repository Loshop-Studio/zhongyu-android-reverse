package androidx.compose.p006ui.node;

import androidx.compose.p006ui.AbstractC1266a;
import androidx.compose.p006ui.AbstractC1267b;
import androidx.compose.p006ui.ActualKt;
import androidx.compose.p006ui.ExperimentalComposeUiApi;
import androidx.compose.p006ui.Modifier;
import androidx.compose.p006ui.platform.InspectableValue;
import androidx.compose.p006ui.platform.InspectorInfo;
import androidx.compose.p006ui.platform.ValueElement;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier.Node;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.Sequence;

@StabilityInferred(parameters = 0)
@Metadata(m5174d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\b'\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u00032\u00020\u0004B\u0005¢\u0006\u0002\u0010\u0005J\r\u0010\u001c\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u001dJ\u0013\u0010\u001e\u001a\u00020\t2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0019H¦\u0002J\b\u0010 \u001a\u00020!H&J\u0015\u0010\"\u001a\u00028\u00002\u0006\u0010#\u001a\u00028\u0000H&¢\u0006\u0002\u0010$J\f\u0010%\u001a\u00020&*\u00020\u0007H\u0016R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u00158F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u00198F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006'"}, m5175d2 = {"Landroidx/compose/ui/node/ModifierNodeElement;", "N", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/Modifier$Element;", "Landroidx/compose/ui/platform/InspectableValue;", "()V", "_inspectorValues", "Landroidx/compose/ui/platform/InspectorInfo;", "autoInvalidate", "", "getAutoInvalidate", "()Z", "inspectableElements", "Lkotlin/sequences/Sequence;", "Landroidx/compose/ui/platform/ValueElement;", "getInspectableElements", "()Lkotlin/sequences/Sequence;", "inspectorValues", "getInspectorValues", "()Landroidx/compose/ui/platform/InspectorInfo;", "nameFallback", "", "getNameFallback", "()Ljava/lang/String;", "valueOverride", "", "getValueOverride", "()Ljava/lang/Object;", "create", "()Landroidx/compose/ui/Modifier$Node;", "equals", "other", "hashCode", "", "update", "node", "(Landroidx/compose/ui/Modifier$Node;)Landroidx/compose/ui/Modifier$Node;", "inspectableProperties", "", "ui_release"}, m5176k = 1, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@ExperimentalComposeUiApi
@SourceDebugExtension({"SMAP\nModifierNodeElement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModifierNodeElement.kt\nandroidx/compose/ui/node/ModifierNodeElement\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,118:1\n1#2:119\n*E\n"})
/* loaded from: classes.dex */
public abstract class ModifierNodeElement<N extends Modifier.Node> implements Modifier.Element, InspectableValue {
    public static final int $stable = 0;
    private InspectorInfo _inspectorValues;

    private final InspectorInfo getInspectorValues() {
        InspectorInfo inspectorInfo = this._inspectorValues;
        if (inspectorInfo != null) {
            return inspectorInfo;
        }
        InspectorInfo inspectorInfo2 = new InspectorInfo();
        inspectorInfo2.setName(Reflection.getOrCreateKotlinClass(getClass()).getSimpleName());
        inspectableProperties(inspectorInfo2);
        this._inspectorValues = inspectorInfo2;
        return inspectorInfo2;
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.p006ui.Modifier
    public /* synthetic */ boolean all(Function1 function1) {
        return AbstractC1267b.m309a(this, function1);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.p006ui.Modifier
    public /* synthetic */ boolean any(Function1 function1) {
        return AbstractC1267b.m310b(this, function1);
    }

    public abstract N create();

    public abstract boolean equals(Object other);

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.p006ui.Modifier
    public /* synthetic */ Object foldIn(Object obj, Function2 function2) {
        return AbstractC1267b.m311c(this, obj, function2);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.p006ui.Modifier
    public /* synthetic */ Object foldOut(Object obj, Function2 function2) {
        return AbstractC1267b.m312d(this, obj, function2);
    }

    public boolean getAutoInvalidate() {
        return true;
    }

    @Override // androidx.compose.p006ui.platform.InspectableValue
    public final Sequence<ValueElement> getInspectableElements() {
        return getInspectorValues().getProperties();
    }

    @Override // androidx.compose.p006ui.platform.InspectableValue
    public final String getNameFallback() {
        return getInspectorValues().getName();
    }

    @Override // androidx.compose.p006ui.platform.InspectableValue
    public final Object getValueOverride() {
        return getInspectorValues().getValue();
    }

    public abstract int hashCode();

    public void inspectableProperties(InspectorInfo inspectorInfo) {
        Intrinsics.checkNotNullParameter(inspectorInfo, "<this>");
        ActualKt.tryPopulateReflectively(inspectorInfo, this);
    }

    @Override // androidx.compose.p006ui.Modifier
    public /* synthetic */ Modifier then(Modifier modifier) {
        return AbstractC1266a.m307a(this, modifier);
    }

    public abstract N update(N node);
}
