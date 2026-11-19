package androidx.compose.p014ui.semantics;

import androidx.compose.p014ui.semantics.SemanticsPropertiesKt;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p181hd.InterfaceC9545q;
import p309qc.InterfaceC10770a;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class SemanticsActions {
    public static final int $stable;
    private static final SemanticsPropertyKey<AccessibilityAction<InterfaceC9529a>> ClearTextSubstitution;
    private static final SemanticsPropertyKey<AccessibilityAction<InterfaceC9529a>> Collapse;
    private static final SemanticsPropertyKey<AccessibilityAction<InterfaceC9529a>> CopyText;
    private static final SemanticsPropertyKey<List<CustomAccessibilityAction>> CustomActions;
    private static final SemanticsPropertyKey<AccessibilityAction<InterfaceC9529a>> CutText;
    private static final SemanticsPropertyKey<AccessibilityAction<InterfaceC9529a>> Dismiss;
    private static final SemanticsPropertyKey<AccessibilityAction<InterfaceC9529a>> Expand;
    private static final SemanticsPropertyKey<AccessibilityAction<InterfaceC9540l>> GetScrollViewportLength;
    private static final SemanticsPropertyKey<AccessibilityAction<InterfaceC9540l>> GetTextLayoutResult;
    public static final SemanticsActions INSTANCE = new SemanticsActions();
    private static final SemanticsPropertyKey<AccessibilityAction<InterfaceC9540l>> InsertTextAtCursor;
    private static final SemanticsPropertyKey<AccessibilityAction<InterfaceC9540l>> OnAutofillText;
    private static final SemanticsPropertyKey<AccessibilityAction<InterfaceC9529a>> OnClick;
    private static final SemanticsPropertyKey<AccessibilityAction<InterfaceC9529a>> OnImeAction;
    private static final SemanticsPropertyKey<AccessibilityAction<InterfaceC9529a>> OnLongClick;
    private static final SemanticsPropertyKey<AccessibilityAction<InterfaceC9529a>> PageDown;
    private static final SemanticsPropertyKey<AccessibilityAction<InterfaceC9529a>> PageLeft;
    private static final SemanticsPropertyKey<AccessibilityAction<InterfaceC9529a>> PageRight;
    private static final SemanticsPropertyKey<AccessibilityAction<InterfaceC9529a>> PageUp;
    private static final SemanticsPropertyKey<AccessibilityAction<InterfaceC9529a>> PasteText;
    private static final SemanticsPropertyKey<AccessibilityAction<InterfaceC9529a>> PerformImeAction;
    private static final SemanticsPropertyKey<AccessibilityAction<InterfaceC9529a>> RequestFocus;
    private static final SemanticsPropertyKey<AccessibilityAction<InterfaceC9544p>> ScrollBy;
    private static final SemanticsPropertyKey<InterfaceC9544p> ScrollByOffset;
    private static final SemanticsPropertyKey<AccessibilityAction<InterfaceC9540l>> ScrollToIndex;
    private static final SemanticsPropertyKey<AccessibilityAction<InterfaceC9540l>> SetProgress;
    private static final SemanticsPropertyKey<AccessibilityAction<InterfaceC9545q>> SetSelection;
    private static final SemanticsPropertyKey<AccessibilityAction<InterfaceC9540l>> SetText;
    private static final SemanticsPropertyKey<AccessibilityAction<InterfaceC9540l>> SetTextSubstitution;
    private static final SemanticsPropertyKey<AccessibilityAction<InterfaceC9540l>> ShowTextSubstitution;

    static {
        SemanticsPropertiesKt.C30961 c30961 = SemanticsPropertiesKt.C30961.INSTANCE;
        GetTextLayoutResult = SemanticsPropertiesKt.AccessibilityKey("GetTextLayoutResult", c30961);
        OnClick = SemanticsPropertiesKt.AccessibilityKey("OnClick", c30961);
        OnLongClick = SemanticsPropertiesKt.AccessibilityKey("OnLongClick", c30961);
        ScrollBy = SemanticsPropertiesKt.AccessibilityKey("ScrollBy", c30961);
        ScrollByOffset = new SemanticsPropertyKey<>("ScrollByOffset", null, 2, null);
        ScrollToIndex = SemanticsPropertiesKt.AccessibilityKey("ScrollToIndex", c30961);
        OnAutofillText = SemanticsPropertiesKt.AccessibilityKey("OnAutofillText", c30961);
        SetProgress = SemanticsPropertiesKt.AccessibilityKey("SetProgress", c30961);
        SetSelection = SemanticsPropertiesKt.AccessibilityKey("SetSelection", c30961);
        SetText = SemanticsPropertiesKt.AccessibilityKey("SetText", c30961);
        SetTextSubstitution = SemanticsPropertiesKt.AccessibilityKey("SetTextSubstitution", c30961);
        ShowTextSubstitution = SemanticsPropertiesKt.AccessibilityKey("ShowTextSubstitution", c30961);
        ClearTextSubstitution = SemanticsPropertiesKt.AccessibilityKey("ClearTextSubstitution", c30961);
        InsertTextAtCursor = SemanticsPropertiesKt.AccessibilityKey("InsertTextAtCursor", c30961);
        OnImeAction = SemanticsPropertiesKt.AccessibilityKey("PerformImeAction", c30961);
        PerformImeAction = SemanticsPropertiesKt.AccessibilityKey("PerformImeAction", c30961);
        CopyText = SemanticsPropertiesKt.AccessibilityKey("CopyText", c30961);
        CutText = SemanticsPropertiesKt.AccessibilityKey("CutText", c30961);
        PasteText = SemanticsPropertiesKt.AccessibilityKey("PasteText", c30961);
        Expand = SemanticsPropertiesKt.AccessibilityKey("Expand", c30961);
        Collapse = SemanticsPropertiesKt.AccessibilityKey("Collapse", c30961);
        Dismiss = SemanticsPropertiesKt.AccessibilityKey("Dismiss", c30961);
        RequestFocus = SemanticsPropertiesKt.AccessibilityKey("RequestFocus", c30961);
        CustomActions = SemanticsPropertiesKt.AccessibilityKey("CustomActions");
        PageUp = SemanticsPropertiesKt.AccessibilityKey("PageUp", c30961);
        PageLeft = SemanticsPropertiesKt.AccessibilityKey("PageLeft", c30961);
        PageDown = SemanticsPropertiesKt.AccessibilityKey("PageDown", c30961);
        PageRight = SemanticsPropertiesKt.AccessibilityKey("PageRight", c30961);
        GetScrollViewportLength = SemanticsPropertiesKt.AccessibilityKey("GetScrollViewportLength", c30961);
        $stable = 8;
    }

    private SemanticsActions() {
    }

    @InterfaceC10770a
    public static /* synthetic */ void getPerformImeAction$annotations() {
    }

    public final SemanticsPropertyKey<AccessibilityAction<InterfaceC9529a>> getClearTextSubstitution() {
        return ClearTextSubstitution;
    }

    public final SemanticsPropertyKey<AccessibilityAction<InterfaceC9529a>> getCollapse() {
        return Collapse;
    }

    public final SemanticsPropertyKey<AccessibilityAction<InterfaceC9529a>> getCopyText() {
        return CopyText;
    }

    public final SemanticsPropertyKey<List<CustomAccessibilityAction>> getCustomActions() {
        return CustomActions;
    }

    public final SemanticsPropertyKey<AccessibilityAction<InterfaceC9529a>> getCutText() {
        return CutText;
    }

    public final SemanticsPropertyKey<AccessibilityAction<InterfaceC9529a>> getDismiss() {
        return Dismiss;
    }

    public final SemanticsPropertyKey<AccessibilityAction<InterfaceC9529a>> getExpand() {
        return Expand;
    }

    public final SemanticsPropertyKey<AccessibilityAction<InterfaceC9540l>> getGetScrollViewportLength() {
        return GetScrollViewportLength;
    }

    public final SemanticsPropertyKey<AccessibilityAction<InterfaceC9540l>> getGetTextLayoutResult() {
        return GetTextLayoutResult;
    }

    public final SemanticsPropertyKey<AccessibilityAction<InterfaceC9540l>> getInsertTextAtCursor() {
        return InsertTextAtCursor;
    }

    public final SemanticsPropertyKey<AccessibilityAction<InterfaceC9540l>> getOnAutofillText() {
        return OnAutofillText;
    }

    public final SemanticsPropertyKey<AccessibilityAction<InterfaceC9529a>> getOnClick() {
        return OnClick;
    }

    public final SemanticsPropertyKey<AccessibilityAction<InterfaceC9529a>> getOnImeAction() {
        return OnImeAction;
    }

    public final SemanticsPropertyKey<AccessibilityAction<InterfaceC9529a>> getOnLongClick() {
        return OnLongClick;
    }

    public final SemanticsPropertyKey<AccessibilityAction<InterfaceC9529a>> getPageDown() {
        return PageDown;
    }

    public final SemanticsPropertyKey<AccessibilityAction<InterfaceC9529a>> getPageLeft() {
        return PageLeft;
    }

    public final SemanticsPropertyKey<AccessibilityAction<InterfaceC9529a>> getPageRight() {
        return PageRight;
    }

    public final SemanticsPropertyKey<AccessibilityAction<InterfaceC9529a>> getPageUp() {
        return PageUp;
    }

    public final SemanticsPropertyKey<AccessibilityAction<InterfaceC9529a>> getPasteText() {
        return PasteText;
    }

    public final SemanticsPropertyKey<AccessibilityAction<InterfaceC9529a>> getPerformImeAction() {
        return PerformImeAction;
    }

    public final SemanticsPropertyKey<AccessibilityAction<InterfaceC9529a>> getRequestFocus() {
        return RequestFocus;
    }

    public final SemanticsPropertyKey<AccessibilityAction<InterfaceC9544p>> getScrollBy() {
        return ScrollBy;
    }

    public final SemanticsPropertyKey<InterfaceC9544p> getScrollByOffset() {
        return ScrollByOffset;
    }

    public final SemanticsPropertyKey<AccessibilityAction<InterfaceC9540l>> getScrollToIndex() {
        return ScrollToIndex;
    }

    public final SemanticsPropertyKey<AccessibilityAction<InterfaceC9540l>> getSetProgress() {
        return SetProgress;
    }

    public final SemanticsPropertyKey<AccessibilityAction<InterfaceC9545q>> getSetSelection() {
        return SetSelection;
    }

    public final SemanticsPropertyKey<AccessibilityAction<InterfaceC9540l>> getSetText() {
        return SetText;
    }

    public final SemanticsPropertyKey<AccessibilityAction<InterfaceC9540l>> getSetTextSubstitution() {
        return SetTextSubstitution;
    }

    public final SemanticsPropertyKey<AccessibilityAction<InterfaceC9540l>> getShowTextSubstitution() {
        return ShowTextSubstitution;
    }
}
