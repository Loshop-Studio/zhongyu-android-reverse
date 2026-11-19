package androidx.compose.p011ui.semantics;

import androidx.compose.p011ui.autofill.ContentDataType;
import androidx.compose.p011ui.autofill.ContentType;
import androidx.compose.p011ui.state.ToggleableState;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.p011ui.text.TextRange;
import androidx.compose.p011ui.text.input.ImeAction;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.collections.AbstractC5805t;
import org.jetbrains.annotations.NotNull;
import p045d6.C5443s;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;

@StabilityInferred(parameters = 0)
@Metadata(m5109d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R#\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\b\u001a\u0004\b\f\u0010\nR\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010\b\u001a\u0004\b\u000f\u0010\nR\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\b\u001a\u0004\b\u0011\u0010\nR\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\b\u001a\u0004\b\u0014\u0010\nR\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\b\u001a\u0004\b\u0017\u0010\nR\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\b\u001a\u0004\b\u001a\u0010\nR\u001d\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00120\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\b\u001a\u0004\b\u001c\u0010\nR\u001d\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00120\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\b\u001a\u0004\b\u001e\u0010\nR\u001d\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u00048\u0006¢\u0006\f\n\u0004\b \u0010\b\u001a\u0004\b!\u0010\nR\u001d\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u00048\u0006¢\u0006\f\n\u0004\b#\u0010\b\u001a\u0004\b$\u0010\nR&\u0010%\u001a\b\u0012\u0004\u0012\u00020\"0\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b%\u0010\b\u0012\u0004\b'\u0010\u0003\u001a\u0004\b&\u0010\nR\u001d\u0010(\u001a\b\u0012\u0004\u0012\u00020\"0\u00048\u0006¢\u0006\f\n\u0004\b(\u0010\b\u001a\u0004\b)\u0010\nR&\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00120\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b*\u0010\b\u0012\u0004\b,\u0010\u0003\u001a\u0004\b+\u0010\nR\u001d\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00120\u00048\u0006¢\u0006\f\n\u0004\b-\u0010\b\u001a\u0004\b.\u0010\nR\u001d\u00100\u001a\b\u0012\u0004\u0012\u00020/0\u00048\u0006¢\u0006\f\n\u0004\b0\u0010\b\u001a\u0004\b1\u0010\nR\u001d\u00103\u001a\b\u0012\u0004\u0012\u0002020\u00048\u0006¢\u0006\f\n\u0004\b3\u0010\b\u001a\u0004\b4\u0010\nR\u001d\u00106\u001a\b\u0012\u0004\u0012\u0002050\u00048\u0006¢\u0006\f\n\u0004\b6\u0010\b\u001a\u0004\b7\u0010\nR\u001d\u00109\u001a\b\u0012\u0004\u0012\u0002080\u00048\u0006¢\u0006\f\n\u0004\b9\u0010\b\u001a\u0004\b:\u0010\nR\u001d\u0010;\u001a\b\u0012\u0004\u0012\u0002080\u00048\u0006¢\u0006\f\n\u0004\b;\u0010\b\u001a\u0004\b<\u0010\nR\u001d\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00120\u00048\u0006¢\u0006\f\n\u0004\b=\u0010\b\u001a\u0004\b>\u0010\nR\u001d\u0010?\u001a\b\u0012\u0004\u0012\u00020\u00120\u00048\u0006¢\u0006\f\n\u0004\b?\u0010\b\u001a\u0004\b@\u0010\nR\u001d\u0010B\u001a\b\u0012\u0004\u0012\u00020A0\u00048\u0006¢\u0006\f\n\u0004\bB\u0010\b\u001a\u0004\bC\u0010\nR\u001d\u0010D\u001a\b\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\bD\u0010\b\u001a\u0004\bE\u0010\nR\u001d\u0010F\u001a\b\u0012\u0004\u0012\u00020\u00120\u00048\u0006¢\u0006\f\n\u0004\bF\u0010\b\u001a\u0004\bG\u0010\nR#\u0010I\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020H0\u00050\u00048\u0006¢\u0006\f\n\u0004\bI\u0010\b\u001a\u0004\bJ\u0010\nR\u001d\u0010K\u001a\b\u0012\u0004\u0012\u00020H0\u00048\u0006¢\u0006\f\n\u0004\bK\u0010\b\u001a\u0004\bL\u0010\nR\u001d\u0010M\u001a\b\u0012\u0004\u0012\u00020\"0\u00048\u0006¢\u0006\f\n\u0004\bM\u0010\b\u001a\u0004\bN\u0010\nR\u001d\u0010O\u001a\b\u0012\u0004\u0012\u00020H0\u00048\u0006¢\u0006\f\n\u0004\bO\u0010\b\u001a\u0004\bP\u0010\nR\u001d\u0010Q\u001a\b\u0012\u0004\u0012\u00020H0\u00048\u0006¢\u0006\f\n\u0004\bQ\u0010\b\u001a\u0004\bR\u0010\nR\u001d\u0010T\u001a\b\u0012\u0004\u0012\u00020S0\u00048\u0006¢\u0006\f\n\u0004\bT\u0010\b\u001a\u0004\bU\u0010\nR\u001d\u0010W\u001a\b\u0012\u0004\u0012\u00020V0\u00048\u0006¢\u0006\f\n\u0004\bW\u0010\b\u001a\u0004\bX\u0010\nR\u001d\u0010Y\u001a\b\u0012\u0004\u0012\u00020\"0\u00048\u0006¢\u0006\f\n\u0004\bY\u0010\b\u001a\u0004\bZ\u0010\nR\u001d\u0010\\\u001a\b\u0012\u0004\u0012\u00020[0\u00048\u0006¢\u0006\f\n\u0004\b\\\u0010\b\u001a\u0004\b]\u0010\nR\u001d\u0010^\u001a\b\u0012\u0004\u0012\u00020\u00120\u00048\u0006¢\u0006\f\n\u0004\b^\u0010\b\u001a\u0004\b_\u0010\nR\u001d\u0010`\u001a\b\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b`\u0010\b\u001a\u0004\ba\u0010\nR)\u0010d\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020c0b0\u00048\u0006¢\u0006\f\n\u0004\bd\u0010\b\u001a\u0004\be\u0010\nR\u001d\u0010f\u001a\b\u0012\u0004\u0012\u00020\"0\u00048\u0006¢\u0006\f\n\u0004\bf\u0010\b\u001a\u0004\bg\u0010\nR\u001d\u0010h\u001a\b\u0012\u0004\u0012\u00020c0\u00048\u0006¢\u0006\f\n\u0004\bh\u0010\b\u001a\u0004\bi\u0010\n¨\u0006j"}, m5110d2 = {"Landroidx/compose/ui/semantics/SemanticsProperties;", "", "<init>", "()V", "Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "", "", "ContentDescription", "Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "getContentDescription", "()Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "StateDescription", "getStateDescription", "Landroidx/compose/ui/semantics/ProgressBarRangeInfo;", "ProgressBarRangeInfo", "getProgressBarRangeInfo", "PaneTitle", "getPaneTitle", "Ld6/s;", "SelectableGroup", "getSelectableGroup", "Landroidx/compose/ui/semantics/CollectionInfo;", "CollectionInfo", "getCollectionInfo", "Landroidx/compose/ui/semantics/CollectionItemInfo;", "CollectionItemInfo", "getCollectionItemInfo", "Heading", "getHeading", "Disabled", "getDisabled", "Landroidx/compose/ui/semantics/LiveRegionMode;", "LiveRegion", "getLiveRegion", "", "Focused", "getFocused", "IsContainer", "getIsContainer", "getIsContainer$annotations", "IsTraversalGroup", "getIsTraversalGroup", "InvisibleToUser", "getInvisibleToUser", "getInvisibleToUser$annotations", "HideFromAccessibility", "getHideFromAccessibility", "Landroidx/compose/ui/autofill/ContentType;", "ContentType", "getContentType", "Landroidx/compose/ui/autofill/ContentDataType;", "ContentDataType", "getContentDataType", "", "TraversalIndex", "getTraversalIndex", "Landroidx/compose/ui/semantics/ScrollAxisRange;", "HorizontalScrollAxisRange", "getHorizontalScrollAxisRange", "VerticalScrollAxisRange", "getVerticalScrollAxisRange", "IsPopup", "getIsPopup", "IsDialog", "getIsDialog", "Landroidx/compose/ui/semantics/Role;", "Role", "getRole", "TestTag", "getTestTag", "LinkTestMarker", "getLinkTestMarker", "Landroidx/compose/ui/text/AnnotatedString;", "Text", "getText", "TextSubstitution", "getTextSubstitution", "IsShowingTextSubstitution", "getIsShowingTextSubstitution", "InputText", "getInputText", "EditableText", "getEditableText", "Landroidx/compose/ui/text/TextRange;", "TextSelectionRange", "getTextSelectionRange", "Landroidx/compose/ui/text/input/ImeAction;", "ImeAction", "getImeAction", "Selected", "getSelected", "Landroidx/compose/ui/state/ToggleableState;", "ToggleableState", "getToggleableState", "Password", "getPassword", "Error", "getError", "Lkotlin/Function1;", "", "IndexForKey", "getIndexForKey", "IsEditable", "getIsEditable", "MaxTextLength", "getMaxTextLength", "ui_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final class SemanticsProperties {

    @NotNull
    public static final SemanticsProperties INSTANCE = new SemanticsProperties();

    @NotNull
    private static final SemanticsPropertyKey<List<String>> ContentDescription = SemanticsPropertiesKt.AccessibilityKey("ContentDescription", new InterfaceC6473e() { // from class: androidx.compose.ui.semantics.SemanticsProperties$ContentDescription$1
        @Override // p152r6.InterfaceC6473e
        public final List<String> invoke(List<String> list, List<String> list2) {
            if (list == null) {
                return list2;
            }
            ArrayList arrayListM5218E0 = AbstractC5805t.m5218E0(list);
            arrayListM5218E0.addAll(list2);
            return arrayListM5218E0;
        }
    });

    @NotNull
    private static final SemanticsPropertyKey<String> StateDescription = SemanticsPropertiesKt.AccessibilityKey("StateDescription");

    @NotNull
    private static final SemanticsPropertyKey<ProgressBarRangeInfo> ProgressBarRangeInfo = SemanticsPropertiesKt.AccessibilityKey("ProgressBarRangeInfo");

    @NotNull
    private static final SemanticsPropertyKey<String> PaneTitle = SemanticsPropertiesKt.AccessibilityKey("PaneTitle", new InterfaceC6473e() { // from class: androidx.compose.ui.semantics.SemanticsProperties$PaneTitle$1
        @Override // p152r6.InterfaceC6473e
        public final String invoke(String str, String str2) {
            throw new IllegalStateException("merge function called on unmergeable property PaneTitle.");
        }
    });

    @NotNull
    private static final SemanticsPropertyKey<C5443s> SelectableGroup = SemanticsPropertiesKt.AccessibilityKey("SelectableGroup");

    @NotNull
    private static final SemanticsPropertyKey<CollectionInfo> CollectionInfo = SemanticsPropertiesKt.AccessibilityKey("CollectionInfo");

    @NotNull
    private static final SemanticsPropertyKey<CollectionItemInfo> CollectionItemInfo = SemanticsPropertiesKt.AccessibilityKey("CollectionItemInfo");

    @NotNull
    private static final SemanticsPropertyKey<C5443s> Heading = SemanticsPropertiesKt.AccessibilityKey("Heading");

    @NotNull
    private static final SemanticsPropertyKey<C5443s> Disabled = SemanticsPropertiesKt.AccessibilityKey("Disabled");

    @NotNull
    private static final SemanticsPropertyKey<LiveRegionMode> LiveRegion = SemanticsPropertiesKt.AccessibilityKey("LiveRegion");

    @NotNull
    private static final SemanticsPropertyKey<Boolean> Focused = SemanticsPropertiesKt.AccessibilityKey("Focused");

    @NotNull
    private static final SemanticsPropertyKey<Boolean> IsContainer = SemanticsPropertiesKt.AccessibilityKey("IsContainer");

    @NotNull
    private static final SemanticsPropertyKey<Boolean> IsTraversalGroup = new SemanticsPropertyKey<>("IsTraversalGroup", null, 2, null);

    @NotNull
    private static final SemanticsPropertyKey<C5443s> InvisibleToUser = new SemanticsPropertyKey<>("InvisibleToUser", new InterfaceC6473e() { // from class: androidx.compose.ui.semantics.SemanticsProperties$InvisibleToUser$1
        @Override // p152r6.InterfaceC6473e
        public final C5443s invoke(C5443s c5443s, C5443s c5443s2) {
            return c5443s;
        }
    });

    @NotNull
    private static final SemanticsPropertyKey<C5443s> HideFromAccessibility = new SemanticsPropertyKey<>("HideFromAccessibility", new InterfaceC6473e() { // from class: androidx.compose.ui.semantics.SemanticsProperties$HideFromAccessibility$1
        @Override // p152r6.InterfaceC6473e
        public final C5443s invoke(C5443s c5443s, C5443s c5443s2) {
            return c5443s;
        }
    });

    @NotNull
    private static final SemanticsPropertyKey<ContentType> ContentType = new SemanticsPropertyKey<>("ContentType", new InterfaceC6473e() { // from class: androidx.compose.ui.semantics.SemanticsProperties$ContentType$1
        @Override // p152r6.InterfaceC6473e
        public final ContentType invoke(ContentType contentType, ContentType contentType2) {
            return contentType;
        }
    });

    @NotNull
    private static final SemanticsPropertyKey<ContentDataType> ContentDataType = new SemanticsPropertyKey<>("ContentDataType", new InterfaceC6473e() { // from class: androidx.compose.ui.semantics.SemanticsProperties$ContentDataType$1
        @Override // p152r6.InterfaceC6473e
        public final ContentDataType invoke(ContentDataType contentDataType, ContentDataType contentDataType2) {
            return contentDataType;
        }
    });

    @NotNull
    private static final SemanticsPropertyKey<Float> TraversalIndex = new SemanticsPropertyKey<>("TraversalIndex", new InterfaceC6473e() { // from class: androidx.compose.ui.semantics.SemanticsProperties$TraversalIndex$1
        public final Float invoke(Float f, float f7) {
            return f;
        }

        @Override // p152r6.InterfaceC6473e
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke((Float) obj, ((Number) obj2).floatValue());
        }
    });

    @NotNull
    private static final SemanticsPropertyKey<ScrollAxisRange> HorizontalScrollAxisRange = SemanticsPropertiesKt.AccessibilityKey("HorizontalScrollAxisRange");

    @NotNull
    private static final SemanticsPropertyKey<ScrollAxisRange> VerticalScrollAxisRange = SemanticsPropertiesKt.AccessibilityKey("VerticalScrollAxisRange");

    @NotNull
    private static final SemanticsPropertyKey<C5443s> IsPopup = SemanticsPropertiesKt.AccessibilityKey("IsPopup", new InterfaceC6473e() { // from class: androidx.compose.ui.semantics.SemanticsProperties$IsPopup$1
        @Override // p152r6.InterfaceC6473e
        public final C5443s invoke(C5443s c5443s, C5443s c5443s2) {
            throw new IllegalStateException("merge function called on unmergeable property IsPopup. A popup should not be a child of a clickable/focusable node.");
        }
    });

    @NotNull
    private static final SemanticsPropertyKey<C5443s> IsDialog = SemanticsPropertiesKt.AccessibilityKey("IsDialog", new InterfaceC6473e() { // from class: androidx.compose.ui.semantics.SemanticsProperties$IsDialog$1
        @Override // p152r6.InterfaceC6473e
        public final C5443s invoke(C5443s c5443s, C5443s c5443s2) {
            throw new IllegalStateException("merge function called on unmergeable property IsDialog. A dialog should not be a child of a clickable/focusable node.");
        }
    });

    @NotNull
    private static final SemanticsPropertyKey<Role> Role = SemanticsPropertiesKt.AccessibilityKey("Role", new InterfaceC6473e() { // from class: androidx.compose.ui.semantics.SemanticsProperties$Role$1
        @Override // p152r6.InterfaceC6473e
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return m12546invokeqtAw6s((Role) obj, ((Role) obj2).getValue());
        }

        /* renamed from: invoke-qtA-w6s, reason: not valid java name */
        public final Role m12546invokeqtAw6s(Role role, int i) {
            return role;
        }
    });

    @NotNull
    private static final SemanticsPropertyKey<String> TestTag = new SemanticsPropertyKey<>("TestTag", false, new InterfaceC6473e() { // from class: androidx.compose.ui.semantics.SemanticsProperties$TestTag$1
        @Override // p152r6.InterfaceC6473e
        public final String invoke(String str, String str2) {
            return str;
        }
    });

    @NotNull
    private static final SemanticsPropertyKey<C5443s> LinkTestMarker = new SemanticsPropertyKey<>("LinkTestMarker", false, new InterfaceC6473e() { // from class: androidx.compose.ui.semantics.SemanticsProperties$LinkTestMarker$1
        @Override // p152r6.InterfaceC6473e
        public final C5443s invoke(C5443s c5443s, C5443s c5443s2) {
            return c5443s;
        }
    });

    @NotNull
    private static final SemanticsPropertyKey<List<AnnotatedString>> Text = SemanticsPropertiesKt.AccessibilityKey("Text", new InterfaceC6473e() { // from class: androidx.compose.ui.semantics.SemanticsProperties$Text$1
        @Override // p152r6.InterfaceC6473e
        public final List<AnnotatedString> invoke(List<AnnotatedString> list, List<AnnotatedString> list2) {
            if (list == null) {
                return list2;
            }
            ArrayList arrayListM5218E0 = AbstractC5805t.m5218E0(list);
            arrayListM5218E0.addAll(list2);
            return arrayListM5218E0;
        }
    });

    @NotNull
    private static final SemanticsPropertyKey<AnnotatedString> TextSubstitution = new SemanticsPropertyKey<>("TextSubstitution", null, 2, null);

    @NotNull
    private static final SemanticsPropertyKey<Boolean> IsShowingTextSubstitution = new SemanticsPropertyKey<>("IsShowingTextSubstitution", null, 2, null);

    @NotNull
    private static final SemanticsPropertyKey<AnnotatedString> InputText = SemanticsPropertiesKt.AccessibilityKey("InputText");

    @NotNull
    private static final SemanticsPropertyKey<AnnotatedString> EditableText = SemanticsPropertiesKt.AccessibilityKey("EditableText");

    @NotNull
    private static final SemanticsPropertyKey<TextRange> TextSelectionRange = SemanticsPropertiesKt.AccessibilityKey("TextSelectionRange");

    @NotNull
    private static final SemanticsPropertyKey<ImeAction> ImeAction = SemanticsPropertiesKt.AccessibilityKey("ImeAction");

    @NotNull
    private static final SemanticsPropertyKey<Boolean> Selected = SemanticsPropertiesKt.AccessibilityKey("Selected");

    @NotNull
    private static final SemanticsPropertyKey<ToggleableState> ToggleableState = SemanticsPropertiesKt.AccessibilityKey("ToggleableState");

    @NotNull
    private static final SemanticsPropertyKey<C5443s> Password = SemanticsPropertiesKt.AccessibilityKey("Password");

    @NotNull
    private static final SemanticsPropertyKey<String> Error = SemanticsPropertiesKt.AccessibilityKey("Error");

    @NotNull
    private static final SemanticsPropertyKey<InterfaceC6471c> IndexForKey = new SemanticsPropertyKey<>("IndexForKey", null, 2, null);

    @NotNull
    private static final SemanticsPropertyKey<Boolean> IsEditable = new SemanticsPropertyKey<>("IsEditable", null, 2, null);

    @NotNull
    private static final SemanticsPropertyKey<Integer> MaxTextLength = new SemanticsPropertyKey<>("MaxTextLength", null, 2, null);
    public static final int $stable = 8;

    private SemanticsProperties() {
    }

    @Deprecated(message = "Use `hideFromAccessibility` instead.", replaceWith = @ReplaceWith(expression = "HideFromAccessibility", imports = {}))
    public static /* synthetic */ void getInvisibleToUser$annotations() {
    }

    @Deprecated(message = "Use `isTraversalGroup` instead.", replaceWith = @ReplaceWith(expression = "IsTraversalGroup", imports = {}))
    public static /* synthetic */ void getIsContainer$annotations() {
    }

    @NotNull
    public final SemanticsPropertyKey<CollectionInfo> getCollectionInfo() {
        return CollectionInfo;
    }

    @NotNull
    public final SemanticsPropertyKey<CollectionItemInfo> getCollectionItemInfo() {
        return CollectionItemInfo;
    }

    @NotNull
    public final SemanticsPropertyKey<ContentDataType> getContentDataType() {
        return ContentDataType;
    }

    @NotNull
    public final SemanticsPropertyKey<List<String>> getContentDescription() {
        return ContentDescription;
    }

    @NotNull
    public final SemanticsPropertyKey<ContentType> getContentType() {
        return ContentType;
    }

    @NotNull
    public final SemanticsPropertyKey<C5443s> getDisabled() {
        return Disabled;
    }

    @NotNull
    public final SemanticsPropertyKey<AnnotatedString> getEditableText() {
        return EditableText;
    }

    @NotNull
    public final SemanticsPropertyKey<String> getError() {
        return Error;
    }

    @NotNull
    public final SemanticsPropertyKey<Boolean> getFocused() {
        return Focused;
    }

    @NotNull
    public final SemanticsPropertyKey<C5443s> getHeading() {
        return Heading;
    }

    @NotNull
    public final SemanticsPropertyKey<C5443s> getHideFromAccessibility() {
        return HideFromAccessibility;
    }

    @NotNull
    public final SemanticsPropertyKey<ScrollAxisRange> getHorizontalScrollAxisRange() {
        return HorizontalScrollAxisRange;
    }

    @NotNull
    public final SemanticsPropertyKey<ImeAction> getImeAction() {
        return ImeAction;
    }

    @NotNull
    public final SemanticsPropertyKey<InterfaceC6471c> getIndexForKey() {
        return IndexForKey;
    }

    @NotNull
    public final SemanticsPropertyKey<AnnotatedString> getInputText() {
        return InputText;
    }

    @NotNull
    public final SemanticsPropertyKey<C5443s> getInvisibleToUser() {
        return InvisibleToUser;
    }

    @NotNull
    public final SemanticsPropertyKey<Boolean> getIsContainer() {
        return IsContainer;
    }

    @NotNull
    public final SemanticsPropertyKey<C5443s> getIsDialog() {
        return IsDialog;
    }

    @NotNull
    public final SemanticsPropertyKey<Boolean> getIsEditable() {
        return IsEditable;
    }

    @NotNull
    public final SemanticsPropertyKey<C5443s> getIsPopup() {
        return IsPopup;
    }

    @NotNull
    public final SemanticsPropertyKey<Boolean> getIsShowingTextSubstitution() {
        return IsShowingTextSubstitution;
    }

    @NotNull
    public final SemanticsPropertyKey<Boolean> getIsTraversalGroup() {
        return IsTraversalGroup;
    }

    @NotNull
    public final SemanticsPropertyKey<C5443s> getLinkTestMarker() {
        return LinkTestMarker;
    }

    @NotNull
    public final SemanticsPropertyKey<LiveRegionMode> getLiveRegion() {
        return LiveRegion;
    }

    @NotNull
    public final SemanticsPropertyKey<Integer> getMaxTextLength() {
        return MaxTextLength;
    }

    @NotNull
    public final SemanticsPropertyKey<String> getPaneTitle() {
        return PaneTitle;
    }

    @NotNull
    public final SemanticsPropertyKey<C5443s> getPassword() {
        return Password;
    }

    @NotNull
    public final SemanticsPropertyKey<ProgressBarRangeInfo> getProgressBarRangeInfo() {
        return ProgressBarRangeInfo;
    }

    @NotNull
    public final SemanticsPropertyKey<Role> getRole() {
        return Role;
    }

    @NotNull
    public final SemanticsPropertyKey<C5443s> getSelectableGroup() {
        return SelectableGroup;
    }

    @NotNull
    public final SemanticsPropertyKey<Boolean> getSelected() {
        return Selected;
    }

    @NotNull
    public final SemanticsPropertyKey<String> getStateDescription() {
        return StateDescription;
    }

    @NotNull
    public final SemanticsPropertyKey<String> getTestTag() {
        return TestTag;
    }

    @NotNull
    public final SemanticsPropertyKey<List<AnnotatedString>> getText() {
        return Text;
    }

    @NotNull
    public final SemanticsPropertyKey<TextRange> getTextSelectionRange() {
        return TextSelectionRange;
    }

    @NotNull
    public final SemanticsPropertyKey<AnnotatedString> getTextSubstitution() {
        return TextSubstitution;
    }

    @NotNull
    public final SemanticsPropertyKey<ToggleableState> getToggleableState() {
        return ToggleableState;
    }

    @NotNull
    public final SemanticsPropertyKey<Float> getTraversalIndex() {
        return TraversalIndex;
    }

    @NotNull
    public final SemanticsPropertyKey<ScrollAxisRange> getVerticalScrollAxisRange() {
        return VerticalScrollAxisRange;
    }
}
