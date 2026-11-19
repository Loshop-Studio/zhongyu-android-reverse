package androidx.compose.p011ui.semantics;

import androidx.autofill.HintConstants;
import androidx.compose.p011ui.semantics.SemanticsPropertiesKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;
import p152r6.InterfaceC6474f;

@StabilityInferred(parameters = 0)
@Metadata(m5109d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R5\u0010\n\u001a \u0012\u001c\u0012\u001a\u0012\u0016\u0012\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0004\u0012\u00020\t0\u00060\u00050\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR)\u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000e0\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u0010\u0010\rR)\u0010\u0011\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000e0\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u000b\u001a\u0004\b\u0012\u0010\rRS\u0010\u0019\u001a>\u0012:\u00128\u00124\u00122\u0012\u0013\u0012\u00110\u0014¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0017\u0012\u0013\u0012\u00110\u0014¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0018\u0012\u0004\u0012\u00020\t0\u00130\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u000b\u001a\u0004\b\u001a\u0010\rRH\u0010\u001e\u001a3\u0012/\u0012-\b\u0001\u0012\u0013\u0012\u00110\u001b¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001d\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00130\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u000b\u001a\u0004\b\u001f\u0010\rR/\u0010!\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\t0\u00060\u00050\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\u000b\u001a\u0004\b\"\u0010\rR/\u0010$\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\t0\u00060\u00050\u00048\u0006¢\u0006\f\n\u0004\b$\u0010\u000b\u001a\u0004\b%\u0010\rR>\u0010'\u001a)\u0012%\u0012#\u0012\u001f\u0012\u001d\u0012\u0013\u0012\u00110\u0014¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(&\u0012\u0004\u0012\u00020\t0\u00060\u00050\u00048\u0006¢\u0006\f\n\u0004\b'\u0010\u000b\u001a\u0004\b(\u0010\rR;\u0010*\u001a&\u0012\"\u0012 \u0012\u001c\u0012\u001a\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0)0\u00050\u00048\u0006¢\u0006\f\n\u0004\b*\u0010\u000b\u001a\u0004\b+\u0010\rR/\u0010,\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\t0\u00060\u00050\u00048\u0006¢\u0006\f\n\u0004\b,\u0010\u000b\u001a\u0004\b-\u0010\rR/\u0010.\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\t0\u00060\u00050\u00048\u0006¢\u0006\f\n\u0004\b.\u0010\u000b\u001a\u0004\b/\u0010\rR/\u00100\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u00060\u00050\u00048\u0006¢\u0006\f\n\u0004\b0\u0010\u000b\u001a\u0004\b1\u0010\rR)\u00102\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000e0\u00050\u00048\u0006¢\u0006\f\n\u0004\b2\u0010\u000b\u001a\u0004\b3\u0010\rR/\u00104\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\t0\u00060\u00050\u00048\u0006¢\u0006\f\n\u0004\b4\u0010\u000b\u001a\u0004\b5\u0010\rR)\u00106\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000e0\u00050\u00048\u0006¢\u0006\f\n\u0004\b6\u0010\u000b\u001a\u0004\b7\u0010\rR2\u00108\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000e0\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b8\u0010\u000b\u0012\u0004\b:\u0010\u0003\u001a\u0004\b9\u0010\rR)\u0010;\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000e0\u00050\u00048\u0006¢\u0006\f\n\u0004\b;\u0010\u000b\u001a\u0004\b<\u0010\rR)\u0010=\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000e0\u00050\u00048\u0006¢\u0006\f\n\u0004\b=\u0010\u000b\u001a\u0004\b>\u0010\rR)\u0010?\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000e0\u00050\u00048\u0006¢\u0006\f\n\u0004\b?\u0010\u000b\u001a\u0004\b@\u0010\rR)\u0010A\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000e0\u00050\u00048\u0006¢\u0006\f\n\u0004\bA\u0010\u000b\u001a\u0004\bB\u0010\rR)\u0010C\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000e0\u00050\u00048\u0006¢\u0006\f\n\u0004\bC\u0010\u000b\u001a\u0004\bD\u0010\rR)\u0010E\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000e0\u00050\u00048\u0006¢\u0006\f\n\u0004\bE\u0010\u000b\u001a\u0004\bF\u0010\rR)\u0010G\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000e0\u00050\u00048\u0006¢\u0006\f\n\u0004\bG\u0010\u000b\u001a\u0004\bH\u0010\rR#\u0010K\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020J0I0\u00048\u0006¢\u0006\f\n\u0004\bK\u0010\u000b\u001a\u0004\bL\u0010\rR)\u0010M\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000e0\u00050\u00048\u0006¢\u0006\f\n\u0004\bM\u0010\u000b\u001a\u0004\bN\u0010\rR)\u0010O\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000e0\u00050\u00048\u0006¢\u0006\f\n\u0004\bO\u0010\u000b\u001a\u0004\bP\u0010\rR)\u0010Q\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000e0\u00050\u00048\u0006¢\u0006\f\n\u0004\bQ\u0010\u000b\u001a\u0004\bR\u0010\rR)\u0010S\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000e0\u00050\u00048\u0006¢\u0006\f\n\u0004\bS\u0010\u000b\u001a\u0004\bT\u0010\rR5\u0010U\u001a \u0012\u001c\u0012\u001a\u0012\u0016\u0012\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u0007\u0012\u0004\u0012\u00020\t0\u00060\u00050\u00048\u0006¢\u0006\f\n\u0004\bU\u0010\u000b\u001a\u0004\bV\u0010\r¨\u0006W"}, m5110d2 = {"Landroidx/compose/ui/semantics/SemanticsActions;", "", "<init>", "()V", "Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "Landroidx/compose/ui/semantics/AccessibilityAction;", "Lkotlin/Function1;", "", "Landroidx/compose/ui/text/TextLayoutResult;", "", "GetTextLayoutResult", "Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "getGetTextLayoutResult", "()Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "Lkotlin/Function0;", "OnClick", "getOnClick", "OnLongClick", "getOnLongClick", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "x", "y", "ScrollBy", "getScrollBy", "Landroidx/compose/ui/geometry/Offset;", TypedValues.CycleType.S_WAVE_OFFSET, "Lh6/c;", "ScrollByOffset", "getScrollByOffset", "", "ScrollToIndex", "getScrollToIndex", "Landroidx/compose/ui/text/AnnotatedString;", "OnAutofillText", "getOnAutofillText", "progress", "SetProgress", "getSetProgress", "Lkotlin/Function3;", "SetSelection", "getSetSelection", "SetText", "getSetText", "SetTextSubstitution", "getSetTextSubstitution", "ShowTextSubstitution", "getShowTextSubstitution", "ClearTextSubstitution", "getClearTextSubstitution", "InsertTextAtCursor", "getInsertTextAtCursor", "OnImeAction", "getOnImeAction", "PerformImeAction", "getPerformImeAction", "getPerformImeAction$annotations", "CopyText", "getCopyText", "CutText", "getCutText", "PasteText", "getPasteText", "Expand", "getExpand", "Collapse", "getCollapse", "Dismiss", "getDismiss", "RequestFocus", "getRequestFocus", "", "Landroidx/compose/ui/semantics/CustomAccessibilityAction;", "CustomActions", "getCustomActions", "PageUp", "getPageUp", "PageLeft", "getPageLeft", "PageDown", "getPageDown", "PageRight", "getPageRight", "GetScrollViewportLength", "getGetScrollViewportLength", "ui_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nSemanticsProperties.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SemanticsProperties.kt\nandroidx/compose/ui/semantics/SemanticsActions\n+ 2 SemanticsProperties.kt\nandroidx/compose/ui/semantics/SemanticsPropertiesKt\n*L\n1#1,1523:1\n502#2:1524\n501#2,9:1525\n502#2:1534\n501#2,9:1535\n502#2:1544\n501#2,9:1545\n502#2:1554\n501#2,9:1555\n502#2:1564\n501#2,9:1565\n502#2:1574\n501#2,9:1575\n502#2:1584\n501#2,9:1585\n502#2:1594\n501#2,9:1595\n502#2:1604\n501#2,9:1605\n502#2:1614\n501#2,9:1615\n502#2:1624\n501#2,9:1625\n502#2:1634\n501#2,9:1635\n502#2:1644\n501#2,9:1645\n502#2:1654\n501#2,9:1655\n502#2:1664\n501#2,9:1665\n502#2:1674\n501#2,9:1675\n502#2:1684\n501#2,9:1685\n502#2:1694\n501#2,9:1695\n502#2:1704\n501#2,9:1705\n502#2:1714\n501#2,9:1715\n502#2:1724\n501#2,9:1725\n502#2:1734\n501#2,9:1735\n502#2:1744\n501#2,9:1745\n502#2:1754\n501#2,9:1755\n502#2:1764\n501#2,9:1765\n502#2:1774\n501#2,9:1775\n502#2:1784\n501#2,9:1785\n*S KotlinDebug\n*F\n+ 1 SemanticsProperties.kt\nandroidx/compose/ui/semantics/SemanticsActions\n*L\n271#1:1524\n271#1:1525,9\n274#1:1534\n274#1:1535,9\n277#1:1544\n277#1:1545,9\n280#1:1554\n280#1:1555,9\n286#1:1564\n286#1:1565,9\n289#1:1574\n289#1:1575,9\n292#1:1584\n292#1:1585,9\n295#1:1594\n295#1:1595,9\n298#1:1604\n298#1:1605,9\n301#1:1614\n301#1:1615,9\n304#1:1624\n304#1:1625,9\n307#1:1634\n307#1:1635,9\n310#1:1644\n310#1:1645,9\n313#1:1654\n313#1:1655,9\n326#1:1664\n326#1:1665,9\n329#1:1674\n329#1:1675,9\n332#1:1684\n332#1:1685,9\n335#1:1694\n335#1:1695,9\n338#1:1704\n338#1:1705,9\n341#1:1714\n341#1:1715,9\n344#1:1724\n344#1:1725,9\n347#1:1734\n347#1:1735,9\n353#1:1744\n353#1:1745,9\n356#1:1754\n356#1:1755,9\n359#1:1764\n359#1:1765,9\n362#1:1774\n362#1:1775,9\n366#1:1784\n366#1:1785,9\n*E\n"})
/* loaded from: classes2.dex */
public final class SemanticsActions {
    public static final int $stable;

    @NotNull
    private static final SemanticsPropertyKey<AccessibilityAction<InterfaceC6469a>> ClearTextSubstitution;

    @NotNull
    private static final SemanticsPropertyKey<AccessibilityAction<InterfaceC6469a>> Collapse;

    @NotNull
    private static final SemanticsPropertyKey<AccessibilityAction<InterfaceC6469a>> CopyText;

    @NotNull
    private static final SemanticsPropertyKey<List<CustomAccessibilityAction>> CustomActions;

    @NotNull
    private static final SemanticsPropertyKey<AccessibilityAction<InterfaceC6469a>> CutText;

    @NotNull
    private static final SemanticsPropertyKey<AccessibilityAction<InterfaceC6469a>> Dismiss;

    @NotNull
    private static final SemanticsPropertyKey<AccessibilityAction<InterfaceC6469a>> Expand;

    @NotNull
    private static final SemanticsPropertyKey<AccessibilityAction<InterfaceC6471c>> GetScrollViewportLength;

    @NotNull
    private static final SemanticsPropertyKey<AccessibilityAction<InterfaceC6471c>> GetTextLayoutResult;

    @NotNull
    public static final SemanticsActions INSTANCE = new SemanticsActions();

    @NotNull
    private static final SemanticsPropertyKey<AccessibilityAction<InterfaceC6471c>> InsertTextAtCursor;

    @NotNull
    private static final SemanticsPropertyKey<AccessibilityAction<InterfaceC6471c>> OnAutofillText;

    @NotNull
    private static final SemanticsPropertyKey<AccessibilityAction<InterfaceC6469a>> OnClick;

    @NotNull
    private static final SemanticsPropertyKey<AccessibilityAction<InterfaceC6469a>> OnImeAction;

    @NotNull
    private static final SemanticsPropertyKey<AccessibilityAction<InterfaceC6469a>> OnLongClick;

    @NotNull
    private static final SemanticsPropertyKey<AccessibilityAction<InterfaceC6469a>> PageDown;

    @NotNull
    private static final SemanticsPropertyKey<AccessibilityAction<InterfaceC6469a>> PageLeft;

    @NotNull
    private static final SemanticsPropertyKey<AccessibilityAction<InterfaceC6469a>> PageRight;

    @NotNull
    private static final SemanticsPropertyKey<AccessibilityAction<InterfaceC6469a>> PageUp;

    @NotNull
    private static final SemanticsPropertyKey<AccessibilityAction<InterfaceC6469a>> PasteText;

    @NotNull
    private static final SemanticsPropertyKey<AccessibilityAction<InterfaceC6469a>> PerformImeAction;

    @NotNull
    private static final SemanticsPropertyKey<AccessibilityAction<InterfaceC6469a>> RequestFocus;

    @NotNull
    private static final SemanticsPropertyKey<AccessibilityAction<InterfaceC6473e>> ScrollBy;

    @NotNull
    private static final SemanticsPropertyKey<InterfaceC6473e> ScrollByOffset;

    @NotNull
    private static final SemanticsPropertyKey<AccessibilityAction<InterfaceC6471c>> ScrollToIndex;

    @NotNull
    private static final SemanticsPropertyKey<AccessibilityAction<InterfaceC6471c>> SetProgress;

    @NotNull
    private static final SemanticsPropertyKey<AccessibilityAction<InterfaceC6474f>> SetSelection;

    @NotNull
    private static final SemanticsPropertyKey<AccessibilityAction<InterfaceC6471c>> SetText;

    @NotNull
    private static final SemanticsPropertyKey<AccessibilityAction<InterfaceC6471c>> SetTextSubstitution;

    @NotNull
    private static final SemanticsPropertyKey<AccessibilityAction<InterfaceC6471c>> ShowTextSubstitution;

    static {
        SemanticsPropertiesKt.C22931 c22931 = SemanticsPropertiesKt.C22931.INSTANCE;
        GetTextLayoutResult = SemanticsPropertiesKt.AccessibilityKey("GetTextLayoutResult", c22931);
        OnClick = SemanticsPropertiesKt.AccessibilityKey("OnClick", c22931);
        OnLongClick = SemanticsPropertiesKt.AccessibilityKey("OnLongClick", c22931);
        ScrollBy = SemanticsPropertiesKt.AccessibilityKey("ScrollBy", c22931);
        ScrollByOffset = new SemanticsPropertyKey<>("ScrollByOffset", null, 2, null);
        ScrollToIndex = SemanticsPropertiesKt.AccessibilityKey("ScrollToIndex", c22931);
        OnAutofillText = SemanticsPropertiesKt.AccessibilityKey("OnAutofillText", c22931);
        SetProgress = SemanticsPropertiesKt.AccessibilityKey("SetProgress", c22931);
        SetSelection = SemanticsPropertiesKt.AccessibilityKey("SetSelection", c22931);
        SetText = SemanticsPropertiesKt.AccessibilityKey("SetText", c22931);
        SetTextSubstitution = SemanticsPropertiesKt.AccessibilityKey("SetTextSubstitution", c22931);
        ShowTextSubstitution = SemanticsPropertiesKt.AccessibilityKey("ShowTextSubstitution", c22931);
        ClearTextSubstitution = SemanticsPropertiesKt.AccessibilityKey("ClearTextSubstitution", c22931);
        InsertTextAtCursor = SemanticsPropertiesKt.AccessibilityKey("InsertTextAtCursor", c22931);
        OnImeAction = SemanticsPropertiesKt.AccessibilityKey("PerformImeAction", c22931);
        PerformImeAction = SemanticsPropertiesKt.AccessibilityKey("PerformImeAction", c22931);
        CopyText = SemanticsPropertiesKt.AccessibilityKey("CopyText", c22931);
        CutText = SemanticsPropertiesKt.AccessibilityKey("CutText", c22931);
        PasteText = SemanticsPropertiesKt.AccessibilityKey("PasteText", c22931);
        Expand = SemanticsPropertiesKt.AccessibilityKey("Expand", c22931);
        Collapse = SemanticsPropertiesKt.AccessibilityKey("Collapse", c22931);
        Dismiss = SemanticsPropertiesKt.AccessibilityKey("Dismiss", c22931);
        RequestFocus = SemanticsPropertiesKt.AccessibilityKey("RequestFocus", c22931);
        CustomActions = SemanticsPropertiesKt.AccessibilityKey("CustomActions");
        PageUp = SemanticsPropertiesKt.AccessibilityKey("PageUp", c22931);
        PageLeft = SemanticsPropertiesKt.AccessibilityKey("PageLeft", c22931);
        PageDown = SemanticsPropertiesKt.AccessibilityKey("PageDown", c22931);
        PageRight = SemanticsPropertiesKt.AccessibilityKey("PageRight", c22931);
        GetScrollViewportLength = SemanticsPropertiesKt.AccessibilityKey("GetScrollViewportLength", c22931);
        $stable = 8;
    }

    private SemanticsActions() {
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Use `SemanticsActions.OnImeAction` instead.", replaceWith = @ReplaceWith(expression = "OnImeAction", imports = {"androidx.compose.ui.semantics.SemanticsActions.OnImeAction"}))
    public static /* synthetic */ void getPerformImeAction$annotations() {
    }

    @NotNull
    public final SemanticsPropertyKey<AccessibilityAction<InterfaceC6469a>> getClearTextSubstitution() {
        return ClearTextSubstitution;
    }

    @NotNull
    public final SemanticsPropertyKey<AccessibilityAction<InterfaceC6469a>> getCollapse() {
        return Collapse;
    }

    @NotNull
    public final SemanticsPropertyKey<AccessibilityAction<InterfaceC6469a>> getCopyText() {
        return CopyText;
    }

    @NotNull
    public final SemanticsPropertyKey<List<CustomAccessibilityAction>> getCustomActions() {
        return CustomActions;
    }

    @NotNull
    public final SemanticsPropertyKey<AccessibilityAction<InterfaceC6469a>> getCutText() {
        return CutText;
    }

    @NotNull
    public final SemanticsPropertyKey<AccessibilityAction<InterfaceC6469a>> getDismiss() {
        return Dismiss;
    }

    @NotNull
    public final SemanticsPropertyKey<AccessibilityAction<InterfaceC6469a>> getExpand() {
        return Expand;
    }

    @NotNull
    public final SemanticsPropertyKey<AccessibilityAction<InterfaceC6471c>> getGetScrollViewportLength() {
        return GetScrollViewportLength;
    }

    @NotNull
    public final SemanticsPropertyKey<AccessibilityAction<InterfaceC6471c>> getGetTextLayoutResult() {
        return GetTextLayoutResult;
    }

    @NotNull
    public final SemanticsPropertyKey<AccessibilityAction<InterfaceC6471c>> getInsertTextAtCursor() {
        return InsertTextAtCursor;
    }

    @NotNull
    public final SemanticsPropertyKey<AccessibilityAction<InterfaceC6471c>> getOnAutofillText() {
        return OnAutofillText;
    }

    @NotNull
    public final SemanticsPropertyKey<AccessibilityAction<InterfaceC6469a>> getOnClick() {
        return OnClick;
    }

    @NotNull
    public final SemanticsPropertyKey<AccessibilityAction<InterfaceC6469a>> getOnImeAction() {
        return OnImeAction;
    }

    @NotNull
    public final SemanticsPropertyKey<AccessibilityAction<InterfaceC6469a>> getOnLongClick() {
        return OnLongClick;
    }

    @NotNull
    public final SemanticsPropertyKey<AccessibilityAction<InterfaceC6469a>> getPageDown() {
        return PageDown;
    }

    @NotNull
    public final SemanticsPropertyKey<AccessibilityAction<InterfaceC6469a>> getPageLeft() {
        return PageLeft;
    }

    @NotNull
    public final SemanticsPropertyKey<AccessibilityAction<InterfaceC6469a>> getPageRight() {
        return PageRight;
    }

    @NotNull
    public final SemanticsPropertyKey<AccessibilityAction<InterfaceC6469a>> getPageUp() {
        return PageUp;
    }

    @NotNull
    public final SemanticsPropertyKey<AccessibilityAction<InterfaceC6469a>> getPasteText() {
        return PasteText;
    }

    @NotNull
    public final SemanticsPropertyKey<AccessibilityAction<InterfaceC6469a>> getPerformImeAction() {
        return PerformImeAction;
    }

    @NotNull
    public final SemanticsPropertyKey<AccessibilityAction<InterfaceC6469a>> getRequestFocus() {
        return RequestFocus;
    }

    @NotNull
    public final SemanticsPropertyKey<AccessibilityAction<InterfaceC6473e>> getScrollBy() {
        return ScrollBy;
    }

    @NotNull
    public final SemanticsPropertyKey<InterfaceC6473e> getScrollByOffset() {
        return ScrollByOffset;
    }

    @NotNull
    public final SemanticsPropertyKey<AccessibilityAction<InterfaceC6471c>> getScrollToIndex() {
        return ScrollToIndex;
    }

    @NotNull
    public final SemanticsPropertyKey<AccessibilityAction<InterfaceC6471c>> getSetProgress() {
        return SetProgress;
    }

    @NotNull
    public final SemanticsPropertyKey<AccessibilityAction<InterfaceC6474f>> getSetSelection() {
        return SetSelection;
    }

    @NotNull
    public final SemanticsPropertyKey<AccessibilityAction<InterfaceC6471c>> getSetText() {
        return SetText;
    }

    @NotNull
    public final SemanticsPropertyKey<AccessibilityAction<InterfaceC6471c>> getSetTextSubstitution() {
        return SetTextSubstitution;
    }

    @NotNull
    public final SemanticsPropertyKey<AccessibilityAction<InterfaceC6471c>> getShowTextSubstitution() {
        return ShowTextSubstitution;
    }
}
