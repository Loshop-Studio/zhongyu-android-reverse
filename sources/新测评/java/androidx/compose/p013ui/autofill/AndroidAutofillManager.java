package androidx.compose.p013ui.autofill;

import android.graphics.Rect;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import androidx.annotation.RequiresApi;
import androidx.collection.MutableIntSet;
import androidx.collection.MutableObjectList;
import androidx.collection.ObjectListKt;
import androidx.compose.p013ui.ComposeUiFlags;
import androidx.compose.p013ui.focus.FocusListener;
import androidx.compose.p013ui.focus.FocusTargetModifierNode;
import androidx.compose.p013ui.internal.InlineClassHelperKt;
import androidx.compose.p013ui.node.DelegatableNodeKt;
import androidx.compose.p013ui.platform.coreshims.AutofillIdCompat;
import androidx.compose.p013ui.platform.coreshims.ViewCompatShims;
import androidx.compose.p013ui.semantics.AccessibilityAction;
import androidx.compose.p013ui.semantics.SemanticsActions;
import androidx.compose.p013ui.semantics.SemanticsConfiguration;
import androidx.compose.p013ui.semantics.SemanticsConfigurationKt;
import androidx.compose.p013ui.semantics.SemanticsInfo;
import androidx.compose.p013ui.semantics.SemanticsListener;
import androidx.compose.p013ui.semantics.SemanticsOwner;
import androidx.compose.p013ui.semantics.SemanticsProperties;
import androidx.compose.p013ui.spatial.RectManager;
import androidx.compose.p013ui.text.AnnotatedString;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred(parameters = 0)
@Metadata(m13557d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B-\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ\b\u0010\u001b\u001a\u00020\u001cH\u0016J\b\u0010\u001d\u001a\u00020\u001cH\u0016J\u0015\u0010\u001e\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020 H\u0000¢\u0006\u0002\b!J\r\u0010\"\u001a\u00020\u001cH\u0000¢\u0006\u0002\b#J\u001c\u0010$\u001a\u00020\u001c2\b\u0010%\u001a\u0004\u0018\u00010&2\b\u0010'\u001a\u0004\u0018\u00010&H\u0016J\u0015\u0010(\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020 H\u0000¢\u0006\u0002\b)J\u0015\u0010*\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020 H\u0000¢\u0006\u0002\b+J\u001d\u0010,\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010-\u001a\u00020.H\u0000¢\u0006\u0002\b/J\u001a\u00100\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020 2\b\u00101\u001a\u0004\u0018\u000102H\u0016J\u0014\u00103\u001a\u00020\u001c2\f\u00104\u001a\b\u0012\u0004\u0012\u00020605J\u000e\u00107\u001a\u00020\u001c2\u0006\u00108\u001a\u000209J\u0015\u0010:\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020 H\u0000¢\u0006\u0002\b;R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006<"}, m13558d2 = {"Landroidx/compose/ui/autofill/AndroidAutofillManager;", "Landroidx/compose/ui/autofill/AutofillManager;", "Landroidx/compose/ui/semantics/SemanticsListener;", "Landroidx/compose/ui/focus/FocusListener;", "platformAutofillManager", "Landroidx/compose/ui/autofill/PlatformAutofillManager;", "semanticsOwner", "Landroidx/compose/ui/semantics/SemanticsOwner;", "view", "Landroid/view/View;", "rectManager", "Landroidx/compose/ui/spatial/RectManager;", "packageName", "", "(Landroidx/compose/ui/autofill/PlatformAutofillManager;Landroidx/compose/ui/semantics/SemanticsOwner;Landroid/view/View;Landroidx/compose/ui/spatial/RectManager;Ljava/lang/String;)V", "currentlyDisplayedIDs", "Landroidx/collection/MutableIntSet;", "pendingAutofillCommit", "", "getPlatformAutofillManager", "()Landroidx/compose/ui/autofill/PlatformAutofillManager;", "setPlatformAutofillManager", "(Landroidx/compose/ui/autofill/PlatformAutofillManager;)V", "reusableRect", "Landroid/graphics/Rect;", "rootAutofillId", "Landroid/view/autofill/AutofillId;", "cancel", "", "commit", "onDetach", "semanticsInfo", "Landroidx/compose/ui/semantics/SemanticsInfo;", "onDetach$ui_release", "onEndApplyChanges", "onEndApplyChanges$ui_release", "onFocusChanged", "previous", "Landroidx/compose/ui/focus/FocusTargetModifierNode;", "current", "onLayoutNodeDeactivated", "onLayoutNodeDeactivated$ui_release", "onPostAttach", "onPostAttach$ui_release", "onPostLayoutNodeReused", "previousSemanticsId", "", "onPostLayoutNodeReused$ui_release", "onSemanticsChanged", "previousSemanticsConfiguration", "Landroidx/compose/ui/semantics/SemanticsConfiguration;", "performAutofill", "values", "Landroid/util/SparseArray;", "Landroid/view/autofill/AutofillValue;", "populateViewStructure", "rootViewStructure", "Landroid/view/ViewStructure;", "requestAutofill", "requestAutofill$ui_release", "ui_release"}, m13559k = 1, m13560mv = {1, 9, 0}, m13562xi = 48)
@RequiresApi(26)
@SourceDebugExtension({"SMAP\nAndroidAutofillManager.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidAutofillManager.android.kt\nandroidx/compose/ui/autofill/AndroidAutofillManager\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n+ 3 ObjectList.kt\nandroidx/collection/ObjectList\n+ 4 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,314:1\n89#2,7:315\n80#3:322\n80#3:323\n34#4,6:324\n*S KotlinDebug\n*F\n+ 1 AndroidAutofillManager.android.kt\nandroidx/compose/ui/autofill/AndroidAutofillManager\n*L\n69#1:315,7\n172#1:322\n173#1:323\n175#1:324,6\n*E\n"})
/* loaded from: classes2.dex */
public final class AndroidAutofillManager extends AutofillManager implements SemanticsListener, FocusListener {
    public static final int $stable = 8;
    private MutableIntSet currentlyDisplayedIDs;
    private final String packageName;
    private boolean pendingAutofillCommit;
    private PlatformAutofillManager platformAutofillManager;
    private final RectManager rectManager;
    private Rect reusableRect = new Rect();
    private AutofillId rootAutofillId;
    private final SemanticsOwner semanticsOwner;
    private final View view;

    public AndroidAutofillManager(PlatformAutofillManager platformAutofillManager, SemanticsOwner semanticsOwner, View view, RectManager rectManager, String str) {
        this.platformAutofillManager = platformAutofillManager;
        this.semanticsOwner = semanticsOwner;
        this.view = view;
        this.rectManager = rectManager;
        this.packageName = str;
        view.setImportantForAutofill(1);
        AutofillIdCompat autofillId = ViewCompatShims.getAutofillId(view);
        AutofillId autofillId2 = autofillId != null ? autofillId.toAutofillId() : null;
        if (autofillId2 == null) {
            InlineClassHelperKt.throwIllegalStateExceptionForNullCheck("Required value was null.");
            throw new KotlinNothingValueException();
        }
        this.rootAutofillId = autofillId2;
        this.currentlyDisplayedIDs = new MutableIntSet(0, 1, null);
    }

    @Override // androidx.compose.p013ui.autofill.AutofillManager
    public void cancel() {
        this.platformAutofillManager.cancel();
    }

    @Override // androidx.compose.p013ui.autofill.AutofillManager
    public void commit() {
        this.platformAutofillManager.commit();
    }

    public final PlatformAutofillManager getPlatformAutofillManager() {
        return this.platformAutofillManager;
    }

    public final void onDetach$ui_release(SemanticsInfo semanticsInfo) {
        if (this.currentlyDisplayedIDs.remove(semanticsInfo.getSemanticsId())) {
            this.platformAutofillManager.notifyViewVisibilityChanged(this.view, semanticsInfo.getSemanticsId(), false);
        }
    }

    public final void onEndApplyChanges$ui_release() {
        if (this.currentlyDisplayedIDs.isEmpty() && this.pendingAutofillCommit) {
            this.platformAutofillManager.commit();
            this.pendingAutofillCommit = false;
        }
        if (this.currentlyDisplayedIDs.isNotEmpty()) {
            this.pendingAutofillCommit = true;
        }
    }

    @Override // androidx.compose.p013ui.focus.FocusListener
    public void onFocusChanged(FocusTargetModifierNode previous, FocusTargetModifierNode current) {
        SemanticsInfo semanticsInfoRequireSemanticsInfo;
        SemanticsConfiguration semanticsConfiguration;
        SemanticsInfo semanticsInfoRequireSemanticsInfo2;
        SemanticsConfiguration semanticsConfiguration2;
        if (previous != null && (semanticsInfoRequireSemanticsInfo2 = DelegatableNodeKt.requireSemanticsInfo(previous)) != null && (semanticsConfiguration2 = semanticsInfoRequireSemanticsInfo2.getSemanticsConfiguration()) != null && AndroidAutofillManager_androidKt.isAutofillable(semanticsConfiguration2)) {
            this.platformAutofillManager.notifyViewExited(this.view, semanticsInfoRequireSemanticsInfo2.getSemanticsId());
        }
        if (current == null || (semanticsInfoRequireSemanticsInfo = DelegatableNodeKt.requireSemanticsInfo(current)) == null || (semanticsConfiguration = semanticsInfoRequireSemanticsInfo.getSemanticsConfiguration()) == null || !AndroidAutofillManager_androidKt.isAutofillable(semanticsConfiguration)) {
            return;
        }
        final int semanticsId = semanticsInfoRequireSemanticsInfo.getSemanticsId();
        this.rectManager.getRects().withRect(semanticsId, new Function4<Integer, Integer, Integer, Integer, Unit>() { // from class: androidx.compose.ui.autofill.AndroidAutofillManager$onFocusChanged$2$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(4);
            }

            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(Integer num, Integer num2, Integer num3, Integer num4) {
                invoke(num.intValue(), num2.intValue(), num3.intValue(), num4.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(int i10, int i11, int i12, int i13) {
                this.this$0.getPlatformAutofillManager().notifyViewEntered(this.this$0.view, semanticsId, new Rect(i10, i11, i12, i13));
            }
        });
    }

    public final void onLayoutNodeDeactivated$ui_release(SemanticsInfo semanticsInfo) {
        if (this.currentlyDisplayedIDs.remove(semanticsInfo.getSemanticsId())) {
            this.platformAutofillManager.notifyViewVisibilityChanged(this.view, semanticsInfo.getSemanticsId(), false);
        }
    }

    public final void onPostAttach$ui_release(SemanticsInfo semanticsInfo) {
        SemanticsConfiguration semanticsConfiguration = semanticsInfo.getSemanticsConfiguration();
        if (semanticsConfiguration == null || !AndroidAutofillManager_androidKt.isRelatedToAutoCommit(semanticsConfiguration)) {
            return;
        }
        this.currentlyDisplayedIDs.add(semanticsInfo.getSemanticsId());
        this.platformAutofillManager.notifyViewVisibilityChanged(this.view, semanticsInfo.getSemanticsId(), true);
    }

    public final void onPostLayoutNodeReused$ui_release(SemanticsInfo semanticsInfo, int previousSemanticsId) {
        if (this.currentlyDisplayedIDs.remove(previousSemanticsId)) {
            this.platformAutofillManager.notifyViewVisibilityChanged(this.view, previousSemanticsId, false);
        }
        SemanticsConfiguration semanticsConfiguration = semanticsInfo.getSemanticsConfiguration();
        if (semanticsConfiguration == null || !AndroidAutofillManager_androidKt.isRelatedToAutoCommit(semanticsConfiguration)) {
            return;
        }
        this.currentlyDisplayedIDs.add(semanticsInfo.getSemanticsId());
        this.platformAutofillManager.notifyViewVisibilityChanged(this.view, semanticsInfo.getSemanticsId(), true);
    }

    @Override // androidx.compose.p013ui.semantics.SemanticsListener
    public void onSemanticsChanged(SemanticsInfo semanticsInfo, SemanticsConfiguration previousSemanticsConfiguration) {
        AnnotatedString annotatedString;
        AnnotatedString annotatedString2;
        SemanticsConfiguration semanticsConfiguration = semanticsInfo.getSemanticsConfiguration();
        final int semanticsId = semanticsInfo.getSemanticsId();
        String text = (previousSemanticsConfiguration == null || (annotatedString2 = (AnnotatedString) SemanticsConfigurationKt.getOrNull(previousSemanticsConfiguration, SemanticsProperties.INSTANCE.getInputText())) == null) ? null : annotatedString2.getText();
        String text2 = (semanticsConfiguration == null || (annotatedString = (AnnotatedString) SemanticsConfigurationKt.getOrNull(semanticsConfiguration, SemanticsProperties.INSTANCE.getInputText())) == null) ? null : annotatedString.getText();
        boolean z9 = false;
        if (text != text2) {
            if (text == null) {
                this.platformAutofillManager.notifyViewVisibilityChanged(this.view, semanticsId, true);
            } else if (text2 == null) {
                this.platformAutofillManager.notifyViewVisibilityChanged(this.view, semanticsId, false);
            } else if (Intrinsics.areEqual((ContentDataType) SemanticsConfigurationKt.getOrNull(semanticsConfiguration, SemanticsProperties.INSTANCE.getContentDataType()), ContentDataType.INSTANCE.getText())) {
                this.platformAutofillManager.notifyValueChanged(this.view, semanticsId, AutofillApi26Helper.INSTANCE.getAutofillTextValue(text2.toString()));
            }
        }
        if (!ComposeUiFlags.isTrackFocusEnabled) {
            Boolean bool = previousSemanticsConfiguration != null ? (Boolean) SemanticsConfigurationKt.getOrNull(previousSemanticsConfiguration, SemanticsProperties.INSTANCE.getFocused()) : null;
            Boolean bool2 = semanticsConfiguration != null ? (Boolean) SemanticsConfigurationKt.getOrNull(semanticsConfiguration, SemanticsProperties.INSTANCE.getFocused()) : null;
            Boolean bool3 = Boolean.TRUE;
            if (!Intrinsics.areEqual(bool, bool3) && Intrinsics.areEqual(bool2, bool3) && AndroidAutofillManager_androidKt.isAutofillable(semanticsConfiguration)) {
                this.rectManager.getRects().withRect(semanticsId, new Function4<Integer, Integer, Integer, Integer, Unit>() { // from class: androidx.compose.ui.autofill.AndroidAutofillManager.onSemanticsChanged.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(4);
                    }

                    @Override // kotlin.jvm.functions.Function4
                    public /* bridge */ /* synthetic */ Unit invoke(Integer num, Integer num2, Integer num3, Integer num4) {
                        invoke(num.intValue(), num2.intValue(), num3.intValue(), num4.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(int i10, int i11, int i12, int i13) {
                        AndroidAutofillManager.this.getPlatformAutofillManager().notifyViewEntered(AndroidAutofillManager.this.view, semanticsId, new Rect(i10, i11, i12, i13));
                    }
                });
            }
            if (Intrinsics.areEqual(bool, bool3) && !Intrinsics.areEqual(bool2, bool3) && AndroidAutofillManager_androidKt.isAutofillable(previousSemanticsConfiguration)) {
                this.platformAutofillManager.notifyViewExited(this.view, semanticsId);
            }
        }
        boolean z10 = previousSemanticsConfiguration != null && AndroidAutofillManager_androidKt.isRelatedToAutoCommit(previousSemanticsConfiguration);
        if (semanticsConfiguration != null && AndroidAutofillManager_androidKt.isRelatedToAutoCommit(semanticsConfiguration)) {
            z9 = true;
        }
        if (z10 != z9) {
            if (z9) {
                this.currentlyDisplayedIDs.add(semanticsId);
            } else {
                this.currentlyDisplayedIDs.remove(semanticsId);
            }
        }
    }

    public final void performAutofill(SparseArray<AutofillValue> values) {
        SemanticsConfiguration semanticsConfiguration;
        AccessibilityAction accessibilityAction;
        Function1 function1;
        int size = values.size();
        for (int i10 = 0; i10 < size; i10++) {
            int iKeyAt = values.keyAt(i10);
            AutofillValue autofillValueM1219a = AbstractC2593f.m1219a(values.get(iKeyAt));
            AutofillApi26Helper autofillApi26Helper = AutofillApi26Helper.INSTANCE;
            if (autofillApi26Helper.isText(autofillValueM1219a)) {
                SemanticsInfo semanticsInfo = this.semanticsOwner.get$ui_release(iKeyAt);
                if (semanticsInfo != null && (semanticsConfiguration = semanticsInfo.getSemanticsConfiguration()) != null && (accessibilityAction = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsConfiguration, SemanticsActions.INSTANCE.getOnAutofillText())) != null && (function1 = (Function1) accessibilityAction.getAction()) != null) {
                }
            } else if (autofillApi26Helper.isDate(autofillValueM1219a)) {
                Log.w("ComposeAutofillManager", "Auto filling Date fields is not yet supported.");
            } else if (autofillApi26Helper.isList(autofillValueM1219a)) {
                Log.w("ComposeAutofillManager", "Auto filling dropdown lists is not yet supported.");
            } else if (autofillApi26Helper.isToggle(autofillValueM1219a)) {
                Log.w("ComposeAutofillManager", "Auto filling toggle fields are not yet supported.");
            }
        }
    }

    public final void populateViewStructure(ViewStructure rootViewStructure) {
        AutofillApi26Helper autofillApi26Helper = AutofillApi26Helper.INSTANCE;
        SemanticsInfo rootInfo$ui_release = this.semanticsOwner.getRootInfo$ui_release();
        PopulateViewStructure_androidKt.populate(rootViewStructure, rootInfo$ui_release, this.rootAutofillId, this.packageName, this.rectManager);
        MutableObjectList mutableObjectListMutableObjectListOf = ObjectListKt.mutableObjectListOf(rootInfo$ui_release, rootViewStructure);
        while (mutableObjectListMutableObjectListOf.isNotEmpty()) {
            Object objRemoveAt = mutableObjectListMutableObjectListOf.removeAt(mutableObjectListMutableObjectListOf._size - 1);
            Intrinsics.checkNotNull(objRemoveAt, "null cannot be cast to non-null type android.view.ViewStructure");
            ViewStructure viewStructure = (ViewStructure) objRemoveAt;
            Object objRemoveAt2 = mutableObjectListMutableObjectListOf.removeAt(mutableObjectListMutableObjectListOf._size - 1);
            Intrinsics.checkNotNull(objRemoveAt2, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsInfo");
            List<SemanticsInfo> childrenInfo = ((SemanticsInfo) objRemoveAt2).getChildrenInfo();
            int size = childrenInfo.size();
            for (int i10 = 0; i10 < size; i10++) {
                SemanticsInfo semanticsInfo = childrenInfo.get(i10);
                if (!semanticsInfo.getIsDeactivated() && semanticsInfo.isAttached() && semanticsInfo.isPlaced()) {
                    SemanticsConfiguration semanticsConfiguration = semanticsInfo.getSemanticsConfiguration();
                    if (semanticsConfiguration == null || !AndroidAutofillManager_androidKt.isRelatedToAutofill(semanticsConfiguration)) {
                        mutableObjectListMutableObjectListOf.add(semanticsInfo);
                        mutableObjectListMutableObjectListOf.add(viewStructure);
                    } else {
                        ViewStructure viewStructureNewChild = autofillApi26Helper.newChild(viewStructure, autofillApi26Helper.addChildCount(viewStructure, 1));
                        PopulateViewStructure_androidKt.populate(viewStructureNewChild, semanticsInfo, this.rootAutofillId, this.packageName, this.rectManager);
                        mutableObjectListMutableObjectListOf.add(semanticsInfo);
                        mutableObjectListMutableObjectListOf.add(viewStructureNewChild);
                    }
                }
            }
        }
    }

    public final void requestAutofill$ui_release(final SemanticsInfo semanticsInfo) {
        this.rectManager.getRects().withRect(semanticsInfo.getSemanticsId(), new Function4<Integer, Integer, Integer, Integer, Unit>() { // from class: androidx.compose.ui.autofill.AndroidAutofillManager$requestAutofill$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(4);
            }

            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(Integer num, Integer num2, Integer num3, Integer num4) {
                invoke(num.intValue(), num2.intValue(), num3.intValue(), num4.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(int i10, int i11, int i12, int i13) {
                this.this$0.reusableRect.set(i10, i11, i12, i13);
                this.this$0.getPlatformAutofillManager().requestAutofill(this.this$0.view, semanticsInfo.getSemanticsId(), this.this$0.reusableRect);
            }
        });
    }

    public final void setPlatformAutofillManager(PlatformAutofillManager platformAutofillManager) {
        this.platformAutofillManager = platformAutofillManager;
    }
}
