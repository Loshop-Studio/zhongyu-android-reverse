package androidx.constraintlayout.compose;

import androidx.compose.p012ui.Modifier;
import androidx.compose.p012ui.layout.LayoutIdKt;
import androidx.compose.p012ui.layout.Measurable;
import androidx.compose.p012ui.platform.InspectableValueKt;
import androidx.compose.p012ui.platform.InspectorInfo;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m13412d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u001e\u0010\u0007\u001a\u00020\b*\u00020\b2\u0006\u0010\u0007\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\"\u0017\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0017\u0010\u0005\u001a\u0004\u0018\u00010\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004¨\u0006\u000b"}, m13413d2 = {"constraintLayoutId", "", "Landroidx/compose/ui/layout/Measurable;", "getConstraintLayoutId", "(Landroidx/compose/ui/layout/Measurable;)Ljava/lang/Object;", "constraintLayoutTag", "getConstraintLayoutTag", "layoutId", "Landroidx/compose/ui/Modifier;", "", "tag", "constraintlayout-compose_release"}, m13414k = 2, m13415mv = {1, 8, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nConstraintLayoutTag.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConstraintLayoutTag.kt\nandroidx/constraintlayout/compose/ConstraintLayoutTagKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,86:1\n135#2:87\n*S KotlinDebug\n*F\n+ 1 ConstraintLayoutTag.kt\nandroidx/constraintlayout/compose/ConstraintLayoutTagKt\n*L\n46#1:87\n*E\n"})
/* loaded from: classes2.dex */
public final class ConstraintLayoutTagKt {
    public static final Object getConstraintLayoutId(Measurable measurable) {
        Object parentData = measurable.getParentData();
        ConstraintLayoutTagParentData constraintLayoutTagParentData = parentData instanceof ConstraintLayoutTagParentData ? (ConstraintLayoutTagParentData) parentData : null;
        if (constraintLayoutTagParentData != null) {
            return constraintLayoutTagParentData.getConstraintLayoutId();
        }
        return null;
    }

    public static final Object getConstraintLayoutTag(Measurable measurable) {
        Object parentData = measurable.getParentData();
        ConstraintLayoutTagParentData constraintLayoutTagParentData = parentData instanceof ConstraintLayoutTagParentData ? (ConstraintLayoutTagParentData) parentData : null;
        if (constraintLayoutTagParentData != null) {
            return constraintLayoutTagParentData.getConstraintLayoutTag();
        }
        return null;
    }

    public static final Modifier layoutId(Modifier modifier, final String str, String str2) {
        if (str2 == null) {
            return LayoutIdKt.layoutId(modifier, str);
        }
        return modifier.then(new ConstraintLayoutTag(str2, str, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.constraintlayout.compose.ConstraintLayoutTagKt$layoutId$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(InspectorInfo inspectorInfo) {
                inspectorInfo.setName("constraintLayoutId");
                inspectorInfo.setValue(str);
            }
        } : InspectableValueKt.getNoInspectorInfo()));
    }

    public static /* synthetic */ Modifier layoutId$default(Modifier modifier, String str, String str2, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            str2 = null;
        }
        return layoutId(modifier, str, str2);
    }
}
