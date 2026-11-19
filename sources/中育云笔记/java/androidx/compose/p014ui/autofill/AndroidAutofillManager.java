package androidx.compose.p014ui.autofill;

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
import androidx.compose.p014ui.ComposeUiFlags;
import androidx.compose.p014ui.focus.FocusListener;
import androidx.compose.p014ui.focus.FocusTargetModifierNode;
import androidx.compose.p014ui.internal.InlineClassHelperKt;
import androidx.compose.p014ui.node.DelegatableNodeKt;
import androidx.compose.p014ui.platform.coreshims.AutofillIdCompat;
import androidx.compose.p014ui.platform.coreshims.ViewCompatShims;
import androidx.compose.p014ui.semantics.AccessibilityAction;
import androidx.compose.p014ui.semantics.SemanticsActions;
import androidx.compose.p014ui.semantics.SemanticsConfiguration;
import androidx.compose.p014ui.semantics.SemanticsConfigurationKt;
import androidx.compose.p014ui.semantics.SemanticsInfo;
import androidx.compose.p014ui.semantics.SemanticsListener;
import androidx.compose.p014ui.semantics.SemanticsOwner;
import androidx.compose.p014ui.semantics.SemanticsProperties;
import androidx.compose.p014ui.spatial.RectManager;
import androidx.compose.p014ui.text.AnnotatedString;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9546r;
import p309qc.C10786q;

@StabilityInferred(parameters = 0)
@RequiresApi(26)
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

    @Override // androidx.compose.p014ui.autofill.AutofillManager
    public void cancel() {
        this.platformAutofillManager.cancel();
    }

    @Override // androidx.compose.p014ui.autofill.AutofillManager
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

    @Override // androidx.compose.p014ui.focus.FocusListener
    public void onFocusChanged(FocusTargetModifierNode focusTargetModifierNode, FocusTargetModifierNode focusTargetModifierNode2) {
        SemanticsInfo semanticsInfoRequireSemanticsInfo;
        SemanticsConfiguration semanticsConfiguration;
        SemanticsInfo semanticsInfoRequireSemanticsInfo2;
        SemanticsConfiguration semanticsConfiguration2;
        if (focusTargetModifierNode != null && (semanticsInfoRequireSemanticsInfo2 = DelegatableNodeKt.requireSemanticsInfo(focusTargetModifierNode)) != null && (semanticsConfiguration2 = semanticsInfoRequireSemanticsInfo2.getSemanticsConfiguration()) != null && AndroidAutofillManager_androidKt.isAutofillable(semanticsConfiguration2)) {
            this.platformAutofillManager.notifyViewExited(this.view, semanticsInfoRequireSemanticsInfo2.getSemanticsId());
        }
        if (focusTargetModifierNode2 == null || (semanticsInfoRequireSemanticsInfo = DelegatableNodeKt.requireSemanticsInfo(focusTargetModifierNode2)) == null || (semanticsConfiguration = semanticsInfoRequireSemanticsInfo.getSemanticsConfiguration()) == null || !AndroidAutofillManager_androidKt.isAutofillable(semanticsConfiguration)) {
            return;
        }
        final int semanticsId = semanticsInfoRequireSemanticsInfo.getSemanticsId();
        this.rectManager.getRects().withRect(semanticsId, new InterfaceC9546r() { // from class: androidx.compose.ui.autofill.AndroidAutofillManager$onFocusChanged$2$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(4);
            }

            @Override // p181hd.InterfaceC9546r
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                invoke(((Number) obj).intValue(), ((Number) obj2).intValue(), ((Number) obj3).intValue(), ((Number) obj4).intValue());
                return C10786q.f26013a;
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

    public final void onPostLayoutNodeReused$ui_release(SemanticsInfo semanticsInfo, int i10) {
        if (this.currentlyDisplayedIDs.remove(i10)) {
            this.platformAutofillManager.notifyViewVisibilityChanged(this.view, i10, false);
        }
        SemanticsConfiguration semanticsConfiguration = semanticsInfo.getSemanticsConfiguration();
        if (semanticsConfiguration == null || !AndroidAutofillManager_androidKt.isRelatedToAutoCommit(semanticsConfiguration)) {
            return;
        }
        this.currentlyDisplayedIDs.add(semanticsInfo.getSemanticsId());
        this.platformAutofillManager.notifyViewVisibilityChanged(this.view, semanticsInfo.getSemanticsId(), true);
    }

    @Override // androidx.compose.p014ui.semantics.SemanticsListener
    public void onSemanticsChanged(SemanticsInfo semanticsInfo, SemanticsConfiguration semanticsConfiguration) {
        AnnotatedString annotatedString;
        AnnotatedString annotatedString2;
        SemanticsConfiguration semanticsConfiguration2 = semanticsInfo.getSemanticsConfiguration();
        final int semanticsId = semanticsInfo.getSemanticsId();
        String text = (semanticsConfiguration == null || (annotatedString2 = (AnnotatedString) SemanticsConfigurationKt.getOrNull(semanticsConfiguration, SemanticsProperties.INSTANCE.getInputText())) == null) ? null : annotatedString2.getText();
        String text2 = (semanticsConfiguration2 == null || (annotatedString = (AnnotatedString) SemanticsConfigurationKt.getOrNull(semanticsConfiguration2, SemanticsProperties.INSTANCE.getInputText())) == null) ? null : annotatedString.getText();
        boolean z10 = false;
        if (text != text2) {
            if (text == null) {
                this.platformAutofillManager.notifyViewVisibilityChanged(this.view, semanticsId, true);
            } else if (text2 == null) {
                this.platformAutofillManager.notifyViewVisibilityChanged(this.view, semanticsId, false);
            } else if (AbstractC9979u.m20289b((ContentDataType) SemanticsConfigurationKt.getOrNull(semanticsConfiguration2, SemanticsProperties.INSTANCE.getContentDataType()), ContentDataType.Companion.getText())) {
                this.platformAutofillManager.notifyValueChanged(this.view, semanticsId, AutofillApi26Helper.INSTANCE.getAutofillTextValue(text2.toString()));
            }
        }
        if (!ComposeUiFlags.isTrackFocusEnabled) {
            Boolean bool = semanticsConfiguration != null ? (Boolean) SemanticsConfigurationKt.getOrNull(semanticsConfiguration, SemanticsProperties.INSTANCE.getFocused()) : null;
            Boolean bool2 = semanticsConfiguration2 != null ? (Boolean) SemanticsConfigurationKt.getOrNull(semanticsConfiguration2, SemanticsProperties.INSTANCE.getFocused()) : null;
            Boolean bool3 = Boolean.TRUE;
            if (!AbstractC9979u.m20289b(bool, bool3) && AbstractC9979u.m20289b(bool2, bool3) && AndroidAutofillManager_androidKt.isAutofillable(semanticsConfiguration2)) {
                this.rectManager.getRects().withRect(semanticsId, new InterfaceC9546r() { // from class: androidx.compose.ui.autofill.AndroidAutofillManager.onSemanticsChanged.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(4);
                    }

                    @Override // p181hd.InterfaceC9546r
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                        invoke(((Number) obj).intValue(), ((Number) obj2).intValue(), ((Number) obj3).intValue(), ((Number) obj4).intValue());
                        return C10786q.f26013a;
                    }

                    public final void invoke(int i10, int i11, int i12, int i13) {
                        AndroidAutofillManager.this.getPlatformAutofillManager().notifyViewEntered(AndroidAutofillManager.this.view, semanticsId, new Rect(i10, i11, i12, i13));
                    }
                });
            }
            if (AbstractC9979u.m20289b(bool, bool3) && !AbstractC9979u.m20289b(bool2, bool3) && AndroidAutofillManager_androidKt.isAutofillable(semanticsConfiguration)) {
                this.platformAutofillManager.notifyViewExited(this.view, semanticsId);
            }
        }
        boolean z11 = semanticsConfiguration != null && AndroidAutofillManager_androidKt.isRelatedToAutoCommit(semanticsConfiguration);
        if (semanticsConfiguration2 != null && AndroidAutofillManager_androidKt.isRelatedToAutoCommit(semanticsConfiguration2)) {
            z10 = true;
        }
        if (z11 != z10) {
            if (z10) {
                this.currentlyDisplayedIDs.add(semanticsId);
            } else {
                this.currentlyDisplayedIDs.remove(semanticsId);
            }
        }
    }

    public final void performAutofill(SparseArray<AutofillValue> sparseArray) {
        SemanticsConfiguration semanticsConfiguration;
        AccessibilityAction accessibilityAction;
        InterfaceC9540l interfaceC9540l;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            int iKeyAt = sparseArray.keyAt(i10);
            AutofillValue autofillValueM1069a = AbstractC2652f.m1069a(sparseArray.get(iKeyAt));
            AutofillApi26Helper autofillApi26Helper = AutofillApi26Helper.INSTANCE;
            if (autofillApi26Helper.isText(autofillValueM1069a)) {
                SemanticsInfo semanticsInfo = this.semanticsOwner.get$ui_release(iKeyAt);
                if (semanticsInfo != null && (semanticsConfiguration = semanticsInfo.getSemanticsConfiguration()) != null && (accessibilityAction = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsConfiguration, SemanticsActions.INSTANCE.getOnAutofillText())) != null && (interfaceC9540l = (InterfaceC9540l) accessibilityAction.getAction()) != null) {
                }
            } else if (autofillApi26Helper.isDate(autofillValueM1069a)) {
                Log.w("ComposeAutofillManager", "Auto filling Date fields is not yet supported.");
            } else if (autofillApi26Helper.isList(autofillValueM1069a)) {
                Log.w("ComposeAutofillManager", "Auto filling dropdown lists is not yet supported.");
            } else if (autofillApi26Helper.isToggle(autofillValueM1069a)) {
                Log.w("ComposeAutofillManager", "Auto filling toggle fields are not yet supported.");
            }
        }
    }

    public final void populateViewStructure(ViewStructure viewStructure) {
        AutofillApi26Helper autofillApi26Helper = AutofillApi26Helper.INSTANCE;
        SemanticsInfo rootInfo$ui_release = this.semanticsOwner.getRootInfo$ui_release();
        PopulateViewStructure_androidKt.populate(viewStructure, rootInfo$ui_release, this.rootAutofillId, this.packageName, this.rectManager);
        MutableObjectList mutableObjectListMutableObjectListOf = ObjectListKt.mutableObjectListOf(rootInfo$ui_release, viewStructure);
        while (mutableObjectListMutableObjectListOf.isNotEmpty()) {
            Object objRemoveAt = mutableObjectListMutableObjectListOf.removeAt(mutableObjectListMutableObjectListOf._size - 1);
            AbstractC9979u.m20292e(objRemoveAt, "null cannot be cast to non-null type android.view.ViewStructure");
            ViewStructure viewStructure2 = (ViewStructure) objRemoveAt;
            Object objRemoveAt2 = mutableObjectListMutableObjectListOf.removeAt(mutableObjectListMutableObjectListOf._size - 1);
            AbstractC9979u.m20292e(objRemoveAt2, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsInfo");
            List<SemanticsInfo> childrenInfo = ((SemanticsInfo) objRemoveAt2).getChildrenInfo();
            int size = childrenInfo.size();
            for (int i10 = 0; i10 < size; i10++) {
                SemanticsInfo semanticsInfo = childrenInfo.get(i10);
                if (!semanticsInfo.isDeactivated() && semanticsInfo.isAttached() && semanticsInfo.isPlaced()) {
                    SemanticsConfiguration semanticsConfiguration = semanticsInfo.getSemanticsConfiguration();
                    if (semanticsConfiguration == null || !AndroidAutofillManager_androidKt.isRelatedToAutofill(semanticsConfiguration)) {
                        mutableObjectListMutableObjectListOf.add(semanticsInfo);
                        mutableObjectListMutableObjectListOf.add(viewStructure2);
                    } else {
                        ViewStructure viewStructureNewChild = autofillApi26Helper.newChild(viewStructure2, autofillApi26Helper.addChildCount(viewStructure2, 1));
                        PopulateViewStructure_androidKt.populate(viewStructureNewChild, semanticsInfo, this.rootAutofillId, this.packageName, this.rectManager);
                        mutableObjectListMutableObjectListOf.add(semanticsInfo);
                        mutableObjectListMutableObjectListOf.add(viewStructureNewChild);
                    }
                }
            }
        }
    }

    public final void requestAutofill$ui_release(final SemanticsInfo semanticsInfo) {
        this.rectManager.getRects().withRect(semanticsInfo.getSemanticsId(), new InterfaceC9546r() { // from class: androidx.compose.ui.autofill.AndroidAutofillManager$requestAutofill$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(4);
            }

            @Override // p181hd.InterfaceC9546r
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                invoke(((Number) obj).intValue(), ((Number) obj2).intValue(), ((Number) obj3).intValue(), ((Number) obj4).intValue());
                return C10786q.f26013a;
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
