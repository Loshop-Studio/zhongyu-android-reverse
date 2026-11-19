package androidx.compose.p011ui.autofill;

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
import androidx.compose.material3.AbstractC1923c;
import androidx.compose.material3.internal.AbstractC1971b;
import androidx.compose.p011ui.ComposeUiFlags;
import androidx.compose.p011ui.focus.FocusListener;
import androidx.compose.p011ui.focus.FocusTargetModifierNode;
import androidx.compose.p011ui.node.DelegatableNodeKt;
import androidx.compose.p011ui.platform.coreshims.AutofillIdCompat;
import androidx.compose.p011ui.platform.coreshims.ViewCompatShims;
import androidx.compose.p011ui.semantics.AccessibilityAction;
import androidx.compose.p011ui.semantics.SemanticsActions;
import androidx.compose.p011ui.semantics.SemanticsConfiguration;
import androidx.compose.p011ui.semantics.SemanticsConfigurationKt;
import androidx.compose.p011ui.semantics.SemanticsInfo;
import androidx.compose.p011ui.semantics.SemanticsListener;
import androidx.compose.p011ui.semantics.SemanticsOwner;
import androidx.compose.p011ui.semantics.SemanticsProperties;
import androidx.compose.p011ui.spatial.RectManager;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6475g;

@StabilityInferred(parameters = 0)
@Metadata(m5109d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B/\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0012J#\u0010\u0017\u001a\u00020\u00102\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u0016\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010!\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"J\u001b\u0010&\u001a\u00020\u00102\f\u0010%\u001a\b\u0012\u0004\u0012\u00020$0#¢\u0006\u0004\b&\u0010'J\u0017\u0010*\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u0019H\u0000¢\u0006\u0004\b(\u0010)J\u0017\u0010,\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u0019H\u0000¢\u0006\u0004\b+\u0010)J\u001f\u00101\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010.\u001a\u00020-H\u0000¢\u0006\u0004\b/\u00100J\u0017\u00103\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u0019H\u0000¢\u0006\u0004\b2\u0010)J\u0017\u00105\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u0019H\u0000¢\u0006\u0004\b4\u0010)J\u000f\u00107\u001a\u00020\u0010H\u0000¢\u0006\u0004\b6\u0010\u0012R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010=R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010>R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010?R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010@R\u0016\u0010B\u001a\u00020A8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u0016\u0010E\u001a\u00020D8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\u0016\u0010H\u001a\u00020G8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010IR\u0016\u0010K\u001a\u00020J8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010L¨\u0006M"}, m5110d2 = {"Landroidx/compose/ui/autofill/AndroidAutofillManager;", "Landroidx/compose/ui/autofill/AutofillManager;", "Landroidx/compose/ui/semantics/SemanticsListener;", "Landroidx/compose/ui/focus/FocusListener;", "Landroidx/compose/ui/autofill/PlatformAutofillManager;", "platformAutofillManager", "Landroidx/compose/ui/semantics/SemanticsOwner;", "semanticsOwner", "Landroid/view/View;", "view", "Landroidx/compose/ui/spatial/RectManager;", "rectManager", "", "packageName", "<init>", "(Landroidx/compose/ui/autofill/PlatformAutofillManager;Landroidx/compose/ui/semantics/SemanticsOwner;Landroid/view/View;Landroidx/compose/ui/spatial/RectManager;Ljava/lang/String;)V", "Ld6/s;", "commit", "()V", "cancel", "Landroidx/compose/ui/focus/FocusTargetModifierNode;", "previous", "current", "onFocusChanged", "(Landroidx/compose/ui/focus/FocusTargetModifierNode;Landroidx/compose/ui/focus/FocusTargetModifierNode;)V", "Landroidx/compose/ui/semantics/SemanticsInfo;", "semanticsInfo", "Landroidx/compose/ui/semantics/SemanticsConfiguration;", "previousSemanticsConfiguration", "onSemanticsChanged", "(Landroidx/compose/ui/semantics/SemanticsInfo;Landroidx/compose/ui/semantics/SemanticsConfiguration;)V", "Landroid/view/ViewStructure;", "rootViewStructure", "populateViewStructure", "(Landroid/view/ViewStructure;)V", "Landroid/util/SparseArray;", "Landroid/view/autofill/AutofillValue;", "values", "performAutofill", "(Landroid/util/SparseArray;)V", "requestAutofill$ui_release", "(Landroidx/compose/ui/semantics/SemanticsInfo;)V", "requestAutofill", "onPostAttach$ui_release", "onPostAttach", "", "previousSemanticsId", "onPostLayoutNodeReused$ui_release", "(Landroidx/compose/ui/semantics/SemanticsInfo;I)V", "onPostLayoutNodeReused", "onLayoutNodeDeactivated$ui_release", "onLayoutNodeDeactivated", "onDetach$ui_release", "onDetach", "onEndApplyChanges$ui_release", "onEndApplyChanges", "Landroidx/compose/ui/autofill/PlatformAutofillManager;", "getPlatformAutofillManager", "()Landroidx/compose/ui/autofill/PlatformAutofillManager;", "setPlatformAutofillManager", "(Landroidx/compose/ui/autofill/PlatformAutofillManager;)V", "Landroidx/compose/ui/semantics/SemanticsOwner;", "Landroid/view/View;", "Landroidx/compose/ui/spatial/RectManager;", "Ljava/lang/String;", "Landroid/graphics/Rect;", "reusableRect", "Landroid/graphics/Rect;", "Landroid/view/autofill/AutofillId;", "rootAutofillId", "Landroid/view/autofill/AutofillId;", "Landroidx/collection/MutableIntSet;", "currentlyDisplayedIDs", "Landroidx/collection/MutableIntSet;", "", "pendingAutofillCommit", "Z", "ui_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@RequiresApi(26)
@SourceDebugExtension({"SMAP\nAndroidAutofillManager.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidAutofillManager.android.kt\nandroidx/compose/ui/autofill/AndroidAutofillManager\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n+ 3 ObjectList.kt\nandroidx/collection/ObjectList\n+ 4 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,314:1\n89#2,7:315\n80#3:322\n80#3:323\n34#4,6:324\n*S KotlinDebug\n*F\n+ 1 AndroidAutofillManager.android.kt\nandroidx/compose/ui/autofill/AndroidAutofillManager\n*L\n69#1:315,7\n172#1:322\n173#1:323\n175#1:324,6\n*E\n"})
/* loaded from: classes.dex */
public final class AndroidAutofillManager extends AutofillManager implements SemanticsListener, FocusListener {
    public static final int $stable = 8;

    @NotNull
    private MutableIntSet currentlyDisplayedIDs;

    @NotNull
    private final String packageName;
    private boolean pendingAutofillCommit;

    @NotNull
    private PlatformAutofillManager platformAutofillManager;

    @NotNull
    private final RectManager rectManager;

    @NotNull
    private Rect reusableRect = new Rect();

    @NotNull
    private AutofillId rootAutofillId;

    @NotNull
    private final SemanticsOwner semanticsOwner;

    @NotNull
    private final View view;

    public AndroidAutofillManager(@NotNull PlatformAutofillManager platformAutofillManager, @NotNull SemanticsOwner semanticsOwner, @NotNull View view, @NotNull RectManager rectManager, @NotNull String str) {
        this.platformAutofillManager = platformAutofillManager;
        this.semanticsOwner = semanticsOwner;
        this.view = view;
        this.rectManager = rectManager;
        this.packageName = str;
        view.setImportantForAutofill(1);
        AutofillIdCompat autofillId = ViewCompatShims.getAutofillId(view);
        AutofillId autofillId2 = autofillId != null ? autofillId.toAutofillId() : null;
        if (autofillId2 == null) {
            throw AbstractC1923c.m1053q("Required value was null.");
        }
        this.rootAutofillId = autofillId2;
        this.currentlyDisplayedIDs = new MutableIntSet(0, 1, null);
    }

    @Override // androidx.compose.p011ui.autofill.AutofillManager
    public void cancel() {
        this.platformAutofillManager.cancel();
    }

    @Override // androidx.compose.p011ui.autofill.AutofillManager
    public void commit() {
        this.platformAutofillManager.commit();
    }

    @NotNull
    public final PlatformAutofillManager getPlatformAutofillManager() {
        return this.platformAutofillManager;
    }

    public final void onDetach$ui_release(@NotNull SemanticsInfo semanticsInfo) {
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

    @Override // androidx.compose.p011ui.focus.FocusListener
    public void onFocusChanged(@Nullable FocusTargetModifierNode previous, @Nullable FocusTargetModifierNode current) {
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
        this.rectManager.getRects().withRect(semanticsId, new InterfaceC6475g() { // from class: androidx.compose.ui.autofill.AndroidAutofillManager$onFocusChanged$2$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(4);
            }

            @Override // p152r6.InterfaceC6475g
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                invoke(((Number) obj).intValue(), ((Number) obj2).intValue(), ((Number) obj3).intValue(), ((Number) obj4).intValue());
                return C5443s.f8405a;
            }

            public final void invoke(int i, int i8, int i9, int i10) {
                this.this$0.getPlatformAutofillManager().notifyViewEntered(this.this$0.view, semanticsId, new Rect(i, i8, i9, i10));
            }
        });
    }

    public final void onLayoutNodeDeactivated$ui_release(@NotNull SemanticsInfo semanticsInfo) {
        if (this.currentlyDisplayedIDs.remove(semanticsInfo.getSemanticsId())) {
            this.platformAutofillManager.notifyViewVisibilityChanged(this.view, semanticsInfo.getSemanticsId(), false);
        }
    }

    public final void onPostAttach$ui_release(@NotNull SemanticsInfo semanticsInfo) {
        SemanticsConfiguration semanticsConfiguration = semanticsInfo.getSemanticsConfiguration();
        if (semanticsConfiguration == null || !AndroidAutofillManager_androidKt.isRelatedToAutoCommit(semanticsConfiguration)) {
            return;
        }
        this.currentlyDisplayedIDs.add(semanticsInfo.getSemanticsId());
        this.platformAutofillManager.notifyViewVisibilityChanged(this.view, semanticsInfo.getSemanticsId(), true);
    }

    public final void onPostLayoutNodeReused$ui_release(@NotNull SemanticsInfo semanticsInfo, int previousSemanticsId) {
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

    @Override // androidx.compose.p011ui.semantics.SemanticsListener
    public void onSemanticsChanged(@NotNull SemanticsInfo semanticsInfo, @Nullable SemanticsConfiguration previousSemanticsConfiguration) {
        AnnotatedString annotatedString;
        AnnotatedString annotatedString2;
        SemanticsConfiguration semanticsConfiguration = semanticsInfo.getSemanticsConfiguration();
        final int semanticsId = semanticsInfo.getSemanticsId();
        String text = (previousSemanticsConfiguration == null || (annotatedString2 = (AnnotatedString) SemanticsConfigurationKt.getOrNull(previousSemanticsConfiguration, SemanticsProperties.INSTANCE.getInputText())) == null) ? null : annotatedString2.getText();
        String text2 = (semanticsConfiguration == null || (annotatedString = (AnnotatedString) SemanticsConfigurationKt.getOrNull(semanticsConfiguration, SemanticsProperties.INSTANCE.getInputText())) == null) ? null : annotatedString.getText();
        boolean z8 = false;
        if (text != text2) {
            if (text == null) {
                this.platformAutofillManager.notifyViewVisibilityChanged(this.view, semanticsId, true);
            } else if (text2 == null) {
                this.platformAutofillManager.notifyViewVisibilityChanged(this.view, semanticsId, false);
            } else if (AbstractC5830k.m5325b((ContentDataType) SemanticsConfigurationKt.getOrNull(semanticsConfiguration, SemanticsProperties.INSTANCE.getContentDataType()), ContentDataType.INSTANCE.getText())) {
                this.platformAutofillManager.notifyValueChanged(this.view, semanticsId, AutofillApi26Helper.INSTANCE.getAutofillTextValue(text2.toString()));
            }
        }
        if (!ComposeUiFlags.isTrackFocusEnabled) {
            Boolean bool = previousSemanticsConfiguration != null ? (Boolean) SemanticsConfigurationKt.getOrNull(previousSemanticsConfiguration, SemanticsProperties.INSTANCE.getFocused()) : null;
            Boolean bool2 = semanticsConfiguration != null ? (Boolean) SemanticsConfigurationKt.getOrNull(semanticsConfiguration, SemanticsProperties.INSTANCE.getFocused()) : null;
            Boolean bool3 = Boolean.TRUE;
            if (!AbstractC5830k.m5325b(bool, bool3) && AbstractC5830k.m5325b(bool2, bool3) && AndroidAutofillManager_androidKt.isAutofillable(semanticsConfiguration)) {
                this.rectManager.getRects().withRect(semanticsId, new InterfaceC6475g() { // from class: androidx.compose.ui.autofill.AndroidAutofillManager.onSemanticsChanged.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(4);
                    }

                    @Override // p152r6.InterfaceC6475g
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                        invoke(((Number) obj).intValue(), ((Number) obj2).intValue(), ((Number) obj3).intValue(), ((Number) obj4).intValue());
                        return C5443s.f8405a;
                    }

                    public final void invoke(int i, int i8, int i9, int i10) {
                        AndroidAutofillManager.this.getPlatformAutofillManager().notifyViewEntered(AndroidAutofillManager.this.view, semanticsId, new Rect(i, i8, i9, i10));
                    }
                });
            }
            if (AbstractC5830k.m5325b(bool, bool3) && !AbstractC5830k.m5325b(bool2, bool3) && AndroidAutofillManager_androidKt.isAutofillable(previousSemanticsConfiguration)) {
                this.platformAutofillManager.notifyViewExited(this.view, semanticsId);
            }
        }
        boolean z9 = previousSemanticsConfiguration != null && AndroidAutofillManager_androidKt.isRelatedToAutoCommit(previousSemanticsConfiguration);
        if (semanticsConfiguration != null && AndroidAutofillManager_androidKt.isRelatedToAutoCommit(semanticsConfiguration)) {
            z8 = true;
        }
        if (z9 != z8) {
            if (z8) {
                this.currentlyDisplayedIDs.add(semanticsId);
            } else {
                this.currentlyDisplayedIDs.remove(semanticsId);
            }
        }
    }

    public final void performAutofill(@NotNull SparseArray<AutofillValue> values) {
        SemanticsConfiguration semanticsConfiguration;
        AccessibilityAction accessibilityAction;
        InterfaceC6471c interfaceC6471c;
        int size = values.size();
        for (int i = 0; i < size; i++) {
            int iKeyAt = values.keyAt(i);
            AutofillValue autofillValueM1072d = AbstractC1971b.m1072d(values.get(iKeyAt));
            AutofillApi26Helper autofillApi26Helper = AutofillApi26Helper.INSTANCE;
            if (autofillApi26Helper.isText(autofillValueM1072d)) {
                SemanticsInfo semanticsInfo = this.semanticsOwner.get$ui_release(iKeyAt);
                if (semanticsInfo != null && (semanticsConfiguration = semanticsInfo.getSemanticsConfiguration()) != null && (accessibilityAction = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsConfiguration, SemanticsActions.INSTANCE.getOnAutofillText())) != null && (interfaceC6471c = (InterfaceC6471c) accessibilityAction.getAction()) != null) {
                }
            } else if (autofillApi26Helper.isDate(autofillValueM1072d)) {
                Log.w("ComposeAutofillManager", "Auto filling Date fields is not yet supported.");
            } else if (autofillApi26Helper.isList(autofillValueM1072d)) {
                Log.w("ComposeAutofillManager", "Auto filling dropdown lists is not yet supported.");
            } else if (autofillApi26Helper.isToggle(autofillValueM1072d)) {
                Log.w("ComposeAutofillManager", "Auto filling toggle fields are not yet supported.");
            }
        }
    }

    public final void populateViewStructure(@NotNull ViewStructure rootViewStructure) {
        AutofillApi26Helper autofillApi26Helper = AutofillApi26Helper.INSTANCE;
        SemanticsInfo rootInfo$ui_release = this.semanticsOwner.getRootInfo$ui_release();
        PopulateViewStructure_androidKt.populate(rootViewStructure, rootInfo$ui_release, this.rootAutofillId, this.packageName, this.rectManager);
        MutableObjectList mutableObjectListMutableObjectListOf = ObjectListKt.mutableObjectListOf(rootInfo$ui_release, rootViewStructure);
        while (mutableObjectListMutableObjectListOf.isNotEmpty()) {
            Object objRemoveAt = mutableObjectListMutableObjectListOf.removeAt(mutableObjectListMutableObjectListOf._size - 1);
            AbstractC5830k.m5328e(objRemoveAt, "null cannot be cast to non-null type android.view.ViewStructure");
            ViewStructure viewStructure = (ViewStructure) objRemoveAt;
            Object objRemoveAt2 = mutableObjectListMutableObjectListOf.removeAt(mutableObjectListMutableObjectListOf._size - 1);
            AbstractC5830k.m5328e(objRemoveAt2, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsInfo");
            List<SemanticsInfo> childrenInfo = ((SemanticsInfo) objRemoveAt2).getChildrenInfo();
            int size = childrenInfo.size();
            for (int i = 0; i < size; i++) {
                SemanticsInfo semanticsInfo = childrenInfo.get(i);
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

    public final void requestAutofill$ui_release(@NotNull final SemanticsInfo semanticsInfo) {
        this.rectManager.getRects().withRect(semanticsInfo.getSemanticsId(), new InterfaceC6475g() { // from class: androidx.compose.ui.autofill.AndroidAutofillManager$requestAutofill$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(4);
            }

            @Override // p152r6.InterfaceC6475g
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                invoke(((Number) obj).intValue(), ((Number) obj2).intValue(), ((Number) obj3).intValue(), ((Number) obj4).intValue());
                return C5443s.f8405a;
            }

            public final void invoke(int i, int i8, int i9, int i10) {
                this.this$0.reusableRect.set(i, i8, i9, i10);
                this.this$0.getPlatformAutofillManager().requestAutofill(this.this$0.view, semanticsInfo.getSemanticsId(), this.this$0.reusableRect);
            }
        });
    }

    public final void setPlatformAutofillManager(@NotNull PlatformAutofillManager platformAutofillManager) {
        this.platformAutofillManager = platformAutofillManager;
    }
}
