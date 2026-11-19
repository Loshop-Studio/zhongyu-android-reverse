package androidx.compose.p013ui.semantics;

import androidx.compose.p013ui.semantics.SemanticsPropertiesKt;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import p123h7.InterfaceC8721a;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10574p;
import p300x7.InterfaceC10575q;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class SemanticsActions {
    public static final int $stable;
    private static final SemanticsPropertyKey<AccessibilityAction<InterfaceC10559a>> ClearTextSubstitution;
    private static final SemanticsPropertyKey<AccessibilityAction<InterfaceC10559a>> Collapse;
    private static final SemanticsPropertyKey<AccessibilityAction<InterfaceC10559a>> CopyText;
    private static final SemanticsPropertyKey<List<CustomAccessibilityAction>> CustomActions;
    private static final SemanticsPropertyKey<AccessibilityAction<InterfaceC10559a>> CutText;
    private static final SemanticsPropertyKey<AccessibilityAction<InterfaceC10559a>> Dismiss;
    private static final SemanticsPropertyKey<AccessibilityAction<InterfaceC10559a>> Expand;
    private static final SemanticsPropertyKey<AccessibilityAction<InterfaceC10570l>> GetScrollViewportLength;
    private static final SemanticsPropertyKey<AccessibilityAction<InterfaceC10570l>> GetTextLayoutResult;
    public static final SemanticsActions INSTANCE = new SemanticsActions();
    private static final SemanticsPropertyKey<AccessibilityAction<InterfaceC10570l>> InsertTextAtCursor;
    private static final SemanticsPropertyKey<AccessibilityAction<InterfaceC10570l>> OnAutofillText;
    private static final SemanticsPropertyKey<AccessibilityAction<InterfaceC10559a>> OnClick;
    private static final SemanticsPropertyKey<AccessibilityAction<InterfaceC10559a>> OnImeAction;
    private static final SemanticsPropertyKey<AccessibilityAction<InterfaceC10559a>> OnLongClick;
    private static final SemanticsPropertyKey<AccessibilityAction<InterfaceC10559a>> PageDown;
    private static final SemanticsPropertyKey<AccessibilityAction<InterfaceC10559a>> PageLeft;
    private static final SemanticsPropertyKey<AccessibilityAction<InterfaceC10559a>> PageRight;
    private static final SemanticsPropertyKey<AccessibilityAction<InterfaceC10559a>> PageUp;
    private static final SemanticsPropertyKey<AccessibilityAction<InterfaceC10559a>> PasteText;
    private static final SemanticsPropertyKey<AccessibilityAction<InterfaceC10559a>> PerformImeAction;
    private static final SemanticsPropertyKey<AccessibilityAction<InterfaceC10559a>> RequestFocus;
    private static final SemanticsPropertyKey<AccessibilityAction<InterfaceC10574p>> ScrollBy;
    private static final SemanticsPropertyKey<InterfaceC10574p> ScrollByOffset;
    private static final SemanticsPropertyKey<AccessibilityAction<InterfaceC10570l>> ScrollToIndex;
    private static final SemanticsPropertyKey<AccessibilityAction<InterfaceC10570l>> SetProgress;
    private static final SemanticsPropertyKey<AccessibilityAction<InterfaceC10575q>> SetSelection;
    private static final SemanticsPropertyKey<AccessibilityAction<InterfaceC10570l>> SetText;
    private static final SemanticsPropertyKey<AccessibilityAction<InterfaceC10570l>> SetTextSubstitution;
    private static final SemanticsPropertyKey<AccessibilityAction<InterfaceC10570l>> ShowTextSubstitution;

    static {
        SemanticsPropertiesKt.C30661 c30661 = SemanticsPropertiesKt.C30661.INSTANCE;
        GetTextLayoutResult = SemanticsPropertiesKt.AccessibilityKey("GetTextLayoutResult", c30661);
        OnClick = SemanticsPropertiesKt.AccessibilityKey("OnClick", c30661);
        OnLongClick = SemanticsPropertiesKt.AccessibilityKey("OnLongClick", c30661);
        ScrollBy = SemanticsPropertiesKt.AccessibilityKey("ScrollBy", c30661);
        ScrollByOffset = new SemanticsPropertyKey<>("ScrollByOffset", null, 2, null);
        ScrollToIndex = SemanticsPropertiesKt.AccessibilityKey("ScrollToIndex", c30661);
        OnAutofillText = SemanticsPropertiesKt.AccessibilityKey("OnAutofillText", c30661);
        SetProgress = SemanticsPropertiesKt.AccessibilityKey("SetProgress", c30661);
        SetSelection = SemanticsPropertiesKt.AccessibilityKey("SetSelection", c30661);
        SetText = SemanticsPropertiesKt.AccessibilityKey("SetText", c30661);
        SetTextSubstitution = SemanticsPropertiesKt.AccessibilityKey("SetTextSubstitution", c30661);
        ShowTextSubstitution = SemanticsPropertiesKt.AccessibilityKey("ShowTextSubstitution", c30661);
        ClearTextSubstitution = SemanticsPropertiesKt.AccessibilityKey("ClearTextSubstitution", c30661);
        InsertTextAtCursor = SemanticsPropertiesKt.AccessibilityKey("InsertTextAtCursor", c30661);
        OnImeAction = SemanticsPropertiesKt.AccessibilityKey("PerformImeAction", c30661);
        PerformImeAction = SemanticsPropertiesKt.AccessibilityKey("PerformImeAction", c30661);
        CopyText = SemanticsPropertiesKt.AccessibilityKey("CopyText", c30661);
        CutText = SemanticsPropertiesKt.AccessibilityKey("CutText", c30661);
        PasteText = SemanticsPropertiesKt.AccessibilityKey("PasteText", c30661);
        Expand = SemanticsPropertiesKt.AccessibilityKey("Expand", c30661);
        Collapse = SemanticsPropertiesKt.AccessibilityKey("Collapse", c30661);
        Dismiss = SemanticsPropertiesKt.AccessibilityKey("Dismiss", c30661);
        RequestFocus = SemanticsPropertiesKt.AccessibilityKey("RequestFocus", c30661);
        CustomActions = SemanticsPropertiesKt.AccessibilityKey("CustomActions");
        PageUp = SemanticsPropertiesKt.AccessibilityKey("PageUp", c30661);
        PageLeft = SemanticsPropertiesKt.AccessibilityKey("PageLeft", c30661);
        PageDown = SemanticsPropertiesKt.AccessibilityKey("PageDown", c30661);
        PageRight = SemanticsPropertiesKt.AccessibilityKey("PageRight", c30661);
        GetScrollViewportLength = SemanticsPropertiesKt.AccessibilityKey("GetScrollViewportLength", c30661);
        $stable = 8;
    }

    private SemanticsActions() {
    }

    @InterfaceC8721a
    public static /* synthetic */ void getPerformImeAction$annotations() {
    }

    public final SemanticsPropertyKey<AccessibilityAction<InterfaceC10559a>> getClearTextSubstitution() {
        return ClearTextSubstitution;
    }

    public final SemanticsPropertyKey<AccessibilityAction<InterfaceC10559a>> getCollapse() {
        return Collapse;
    }

    public final SemanticsPropertyKey<AccessibilityAction<InterfaceC10559a>> getCopyText() {
        return CopyText;
    }

    public final SemanticsPropertyKey<List<CustomAccessibilityAction>> getCustomActions() {
        return CustomActions;
    }

    public final SemanticsPropertyKey<AccessibilityAction<InterfaceC10559a>> getCutText() {
        return CutText;
    }

    public final SemanticsPropertyKey<AccessibilityAction<InterfaceC10559a>> getDismiss() {
        return Dismiss;
    }

    public final SemanticsPropertyKey<AccessibilityAction<InterfaceC10559a>> getExpand() {
        return Expand;
    }

    public final SemanticsPropertyKey<AccessibilityAction<InterfaceC10570l>> getGetScrollViewportLength() {
        return GetScrollViewportLength;
    }

    public final SemanticsPropertyKey<AccessibilityAction<InterfaceC10570l>> getGetTextLayoutResult() {
        return GetTextLayoutResult;
    }

    public final SemanticsPropertyKey<AccessibilityAction<InterfaceC10570l>> getInsertTextAtCursor() {
        return InsertTextAtCursor;
    }

    public final SemanticsPropertyKey<AccessibilityAction<InterfaceC10570l>> getOnAutofillText() {
        return OnAutofillText;
    }

    public final SemanticsPropertyKey<AccessibilityAction<InterfaceC10559a>> getOnClick() {
        return OnClick;
    }

    public final SemanticsPropertyKey<AccessibilityAction<InterfaceC10559a>> getOnImeAction() {
        return OnImeAction;
    }

    public final SemanticsPropertyKey<AccessibilityAction<InterfaceC10559a>> getOnLongClick() {
        return OnLongClick;
    }

    public final SemanticsPropertyKey<AccessibilityAction<InterfaceC10559a>> getPageDown() {
        return PageDown;
    }

    public final SemanticsPropertyKey<AccessibilityAction<InterfaceC10559a>> getPageLeft() {
        return PageLeft;
    }

    public final SemanticsPropertyKey<AccessibilityAction<InterfaceC10559a>> getPageRight() {
        return PageRight;
    }

    public final SemanticsPropertyKey<AccessibilityAction<InterfaceC10559a>> getPageUp() {
        return PageUp;
    }

    public final SemanticsPropertyKey<AccessibilityAction<InterfaceC10559a>> getPasteText() {
        return PasteText;
    }

    public final SemanticsPropertyKey<AccessibilityAction<InterfaceC10559a>> getPerformImeAction() {
        return PerformImeAction;
    }

    public final SemanticsPropertyKey<AccessibilityAction<InterfaceC10559a>> getRequestFocus() {
        return RequestFocus;
    }

    public final SemanticsPropertyKey<AccessibilityAction<InterfaceC10574p>> getScrollBy() {
        return ScrollBy;
    }

    public final SemanticsPropertyKey<InterfaceC10574p> getScrollByOffset() {
        return ScrollByOffset;
    }

    public final SemanticsPropertyKey<AccessibilityAction<InterfaceC10570l>> getScrollToIndex() {
        return ScrollToIndex;
    }

    public final SemanticsPropertyKey<AccessibilityAction<InterfaceC10570l>> getSetProgress() {
        return SetProgress;
    }

    public final SemanticsPropertyKey<AccessibilityAction<InterfaceC10575q>> getSetSelection() {
        return SetSelection;
    }

    public final SemanticsPropertyKey<AccessibilityAction<InterfaceC10570l>> getSetText() {
        return SetText;
    }

    public final SemanticsPropertyKey<AccessibilityAction<InterfaceC10570l>> getSetTextSubstitution() {
        return SetTextSubstitution;
    }

    public final SemanticsPropertyKey<AccessibilityAction<InterfaceC10570l>> getShowTextSubstitution() {
        return ShowTextSubstitution;
    }
}
