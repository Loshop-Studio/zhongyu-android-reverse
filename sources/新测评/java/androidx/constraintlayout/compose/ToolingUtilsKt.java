package androidx.constraintlayout.compose;

import androidx.compose.p013ui.layout.LayoutIdKt;
import androidx.compose.p013ui.layout.Measurable;
import androidx.compose.p013ui.semantics.SemanticsPropertyKey;
import androidx.compose.p013ui.semantics.SemanticsPropertyReceiver;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.ConstraintWidgetContainer;
import androidx.constraintlayout.core.widgets.HelperWidget;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(m13557d1 = {"\u0000h\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a.\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001aH\u0002\u001a\u0010\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020 H\u0002\u001a0\u0010!\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u00012\u0006\u0010%\u001a\u00020\u00012\u0006\u0010&\u001a\u00020\u001aH\u0000\u001a$\u0010'\u001a\n (*\u0004\u0018\u00010 0 *\u00020)2\u0006\u0010$\u001a\u00020\u00012\u0006\u0010%\u001a\u00020\u0001H\u0002\u001a\u0014\u0010*\u001a\u00020\u001a*\u00020)2\u0006\u0010\"\u001a\u00020#H\u0002\u001a\u000e\u0010+\u001a\u00020\u001a*\u0004\u0018\u00010)H\u0002\u001aV\u0010,\u001a\u00020\u0015*\u00020 2\u0006\u0010-\u001a\u00020\u001a2\u0006\u0010.\u001a\u00020 2\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u0002002\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a022\u0006\u00103\u001a\u0002042\b\b\u0002\u00105\u001a\u0002002\b\b\u0002\u00106\u001a\u000200H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\"5\u0010\n\u001a\u00020\u0006*\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00068@@@X\u0081\u008e\u0002¢\u0006\u0018\u0012\u0004\b\f\u0010\r\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013*\u0004\b\u000e\u0010\u000f¨\u00067"}, m13558d2 = {"BOUNDS", "", "CONSTRAINTS", "CONSTRAINTS_JSON_VERSION", "DesignInfoDataKey", "Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "Landroidx/constraintlayout/compose/DesignInfoProvider;", "getDesignInfoDataKey", "()Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "<set-?>", "designInfoProvider", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "getDesignInfoProvider$annotations", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)V", "getDesignInfoProvider$delegate", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/Object;", "getDesignInfoProvider", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/constraintlayout/compose/DesignInfoProvider;", "setDesignInfoProvider", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;Landroidx/constraintlayout/compose/DesignInfoProvider;)V", "addReferencesIds", "", "helperWidget", "Landroidx/constraintlayout/core/widgets/HelperWidget;", "helperReferences", "", "", "root", "Landroidx/constraintlayout/core/widgets/ConstraintWidgetContainer;", "rootId", "createDesignInfoJson", "content", "Lorg/json/JSONObject;", "parseConstraintsToJson", "state", "Landroidx/constraintlayout/compose/State;", "startX", "startY", "args", "boundsToJson", "kotlin.jvm.PlatformType", "Landroidx/constraintlayout/core/widgets/ConstraintWidget;", "getHelperId", "getRefId", "putViewIdToBoundsAndConstraints", "viewId", "boxJson", "isHelper", "", "isRoot", "", "constraintsInfoArray", "Lorg/json/JSONArray;", "withConstraints", "withBounds", "constraintlayout-compose_release"}, m13559k = 2, m13560mv = {1, 8, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nToolingUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ToolingUtils.kt\nandroidx/constraintlayout/compose/ToolingUtilsKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,193:1\n33#2,4:194\n33#2,6:198\n38#2:204\n33#2,6:205\n*S KotlinDebug\n*F\n+ 1 ToolingUtils.kt\nandroidx/constraintlayout/compose/ToolingUtilsKt\n*L\n75#1:194,4\n85#1:198,6\n75#1:204\n185#1:205,6\n*E\n"})
/* loaded from: classes2.dex */
public final class ToolingUtilsKt {
    private static final int BOUNDS = 1;
    private static final int CONSTRAINTS = 0;
    private static final int CONSTRAINTS_JSON_VERSION = 1;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(ToolingUtilsKt.class, "designInfoProvider", "getDesignInfoProvider(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/constraintlayout/compose/DesignInfoProvider;", 1))};
    private static final SemanticsPropertyKey<DesignInfoProvider> DesignInfoDataKey = new SemanticsPropertyKey<>("DesignInfoProvider", null, 2, null);

    private static final void addReferencesIds(HelperWidget helperWidget, List<String> list, ConstraintWidgetContainer constraintWidgetContainer, String str) {
        int i10 = helperWidget.mWidgetsCount;
        for (int i11 = 0; i11 < i10; i11++) {
            ConstraintWidget constraintWidget = helperWidget.mWidgets[i11];
            list.add(Intrinsics.areEqual(constraintWidget, constraintWidgetContainer) ? str : getRefId(constraintWidget));
        }
    }

    private static final JSONObject boundsToJson(ConstraintWidget constraintWidget, int i10, int i11) {
        return new JSONObject().put("left", constraintWidget.getLeft() + i10).put("top", constraintWidget.getTop() + i11).put("right", constraintWidget.getRight() + i10).put("bottom", constraintWidget.getBottom() + i11);
    }

    private static final String createDesignInfoJson(JSONObject jSONObject) {
        return new JSONObject().put(ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "CONSTRAINTS").put("version", 1).put("content", jSONObject).toString();
    }

    public static final SemanticsPropertyKey<DesignInfoProvider> getDesignInfoDataKey() {
        return DesignInfoDataKey;
    }

    public static final DesignInfoProvider getDesignInfoProvider(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return DesignInfoDataKey.getValue(semanticsPropertyReceiver, $$delegatedProperties[0]);
    }

    @PublishedApi
    public static /* synthetic */ void getDesignInfoProvider$annotations(SemanticsPropertyReceiver semanticsPropertyReceiver) {
    }

    private static final String getHelperId(ConstraintWidget constraintWidget, State state) {
        Intrinsics.checkNotNull(constraintWidget, "null cannot be cast to non-null type androidx.constraintlayout.core.widgets.HelperWidget");
        return String.valueOf(state.getKeyId$constraintlayout_compose_release((HelperWidget) constraintWidget));
    }

    private static final String getRefId(ConstraintWidget constraintWidget) {
        Object layoutId;
        String string;
        Object companionWidget = constraintWidget != null ? constraintWidget.getCompanionWidget() : null;
        Measurable measurable = companionWidget instanceof Measurable ? (Measurable) companionWidget : null;
        if (measurable == null || (layoutId = LayoutIdKt.getLayoutId(measurable)) == null || (string = layoutId.toString()) == null) {
            return String.valueOf(constraintWidget != null ? constraintWidget.stringId : null);
        }
        return string;
    }

    public static final String parseConstraintsToJson(ConstraintWidgetContainer constraintWidgetContainer, State state, int i10, int i11, String str) throws JSONException {
        boolean z9;
        boolean z10;
        int i12;
        JSONObject jSONObject;
        String str2;
        int i13;
        String strValueOf = String.valueOf(androidx.constraintlayout.core.state.State.PARENT);
        JSONObject jSONObject2 = new JSONObject();
        Integer intOrNull = StringsKt.toIntOrNull(str);
        if (intOrNull != null) {
            int iIntValue = intOrNull.intValue();
            boolean z11 = (iIntValue >> 1) == 1;
            z9 = iIntValue == 1;
            z10 = z11;
        } else {
            z9 = true;
            z10 = true;
        }
        ArrayList<ConstraintWidget> children = constraintWidgetContainer.getChildren();
        int size = children.size();
        int i14 = 0;
        while (i14 < size) {
            ConstraintWidget constraintWidget = children.get(i14);
            boolean z12 = z10;
            JSONArray jSONArray = new JSONArray();
            boolean z13 = z9;
            ArrayList arrayList = new ArrayList();
            boolean z14 = constraintWidget instanceof HelperWidget;
            int i15 = i14;
            String str3 = constraintWidget.stringId;
            if (z14) {
                Intrinsics.checkNotNull(constraintWidget, "null cannot be cast to non-null type androidx.constraintlayout.core.widgets.HelperWidget");
                addReferencesIds((HelperWidget) constraintWidget, arrayList, constraintWidgetContainer, strValueOf);
            }
            ArrayList<ConstraintAnchor> anchors = constraintWidget.getAnchors();
            int size2 = anchors.size();
            ArrayList<ConstraintWidget> arrayList2 = children;
            int i16 = 0;
            while (i16 < size2) {
                ConstraintAnchor constraintAnchor = anchors.get(i16);
                if (constraintAnchor.isConnected()) {
                    i12 = i16;
                    ConstraintWidget owner = constraintAnchor.getTarget().getOwner();
                    jSONObject = jSONObject2;
                    String helperId = Intrinsics.areEqual(constraintWidgetContainer, owner) ? strValueOf : owner instanceof HelperWidget ? getHelperId(owner, state) : getRefId(owner);
                    str2 = strValueOf;
                    i13 = size;
                    JSONObject jSONObjectPut = new JSONObject().put("originAnchor", constraintAnchor.getType());
                    ConstraintAnchor target = constraintAnchor.getTarget();
                    Intrinsics.checkNotNull(target);
                    jSONArray.put(jSONObjectPut.put("targetAnchor", target.getType()).put(TypedValues.AttributesType.S_TARGET, helperId).put("margin", constraintAnchor.getMargin()));
                } else {
                    i12 = i16;
                    jSONObject = jSONObject2;
                    str2 = strValueOf;
                    i13 = size;
                }
                i16 = i12 + 1;
                strValueOf = str2;
                jSONObject2 = jSONObject;
                size = i13;
            }
            JSONObject jSONObject3 = jSONObject2;
            putViewIdToBoundsAndConstraints(jSONObject3, str3, boundsToJson(constraintWidget, i10, i11), constraintWidget instanceof HelperWidget, false, arrayList, jSONArray, z13, z12);
            jSONObject2 = jSONObject3;
            i14 = i15 + 1;
            z9 = z13;
            z10 = z12;
            children = arrayList2;
            size = size;
        }
        putViewIdToBoundsAndConstraints(jSONObject2, strValueOf, boundsToJson(constraintWidgetContainer, i10, i11), false, true, CollectionsKt.emptyList(), new JSONArray(), z9, z10);
        return createDesignInfoJson(jSONObject2);
    }

    private static final void putViewIdToBoundsAndConstraints(JSONObject jSONObject, String str, JSONObject jSONObject2, boolean z9, boolean z10, List<String> list, JSONArray jSONArray, boolean z11, boolean z12) throws JSONException {
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("viewId", str);
        if (z12) {
            jSONObject3.put("box", jSONObject2);
        }
        jSONObject3.put("isHelper", z9);
        jSONObject3.put("isRoot", z10);
        JSONArray jSONArray2 = new JSONArray();
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            jSONArray2.put(list.get(i10));
        }
        jSONObject3.put("helperReferences", jSONArray2);
        if (z11) {
            jSONObject3.put("constraints", jSONArray);
        }
        jSONObject.put(str, jSONObject3);
    }

    public static /* synthetic */ void putViewIdToBoundsAndConstraints$default(JSONObject jSONObject, String str, JSONObject jSONObject2, boolean z9, boolean z10, List list, JSONArray jSONArray, boolean z11, boolean z12, int i10, Object obj) throws JSONException {
        if ((i10 & 64) != 0) {
            z11 = true;
        }
        if ((i10 & 128) != 0) {
            z12 = true;
        }
        putViewIdToBoundsAndConstraints(jSONObject, str, jSONObject2, z9, z10, list, jSONArray, z11, z12);
    }

    public static final void setDesignInfoProvider(SemanticsPropertyReceiver semanticsPropertyReceiver, DesignInfoProvider designInfoProvider) {
        DesignInfoDataKey.setValue(semanticsPropertyReceiver, $$delegatedProperties[0], designInfoProvider);
    }
}
