package androidx.compose.p013ui.semantics;

import androidx.compose.p013ui.autofill.ContentDataType;
import androidx.compose.p013ui.autofill.ContentType;
import androidx.compose.p013ui.state.ToggleableState;
import androidx.compose.p013ui.text.AnnotatedString;
import androidx.compose.p013ui.text.TextRange;
import androidx.compose.p013ui.text.input.ImeAction;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import p123h7.C8736p;
import p123h7.InterfaceC8721a;
import p134i7.AbstractC8778f0;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10574p;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class SemanticsProperties {
    public static final SemanticsProperties INSTANCE = new SemanticsProperties();
    private static final SemanticsPropertyKey<List<String>> ContentDescription = SemanticsPropertiesKt.AccessibilityKey("ContentDescription", new InterfaceC10574p() { // from class: androidx.compose.ui.semantics.SemanticsProperties$ContentDescription$1
        @Override // p300x7.InterfaceC10574p
        public final List<String> invoke(List<String> list, List<String> list2) {
            List<String> listM14547X0;
            if (list == null || (listM14547X0 = AbstractC8778f0.m14547X0(list)) == null) {
                return list2;
            }
            listM14547X0.addAll(list2);
            return listM14547X0;
        }
    });
    private static final SemanticsPropertyKey<String> StateDescription = SemanticsPropertiesKt.AccessibilityKey("StateDescription");
    private static final SemanticsPropertyKey<ProgressBarRangeInfo> ProgressBarRangeInfo = SemanticsPropertiesKt.AccessibilityKey("ProgressBarRangeInfo");
    private static final SemanticsPropertyKey<String> PaneTitle = SemanticsPropertiesKt.AccessibilityKey("PaneTitle", new InterfaceC10574p() { // from class: androidx.compose.ui.semantics.SemanticsProperties$PaneTitle$1
        @Override // p300x7.InterfaceC10574p
        public final String invoke(String str, String str2) {
            throw new IllegalStateException("merge function called on unmergeable property PaneTitle.");
        }
    });
    private static final SemanticsPropertyKey<C8736p> SelectableGroup = SemanticsPropertiesKt.AccessibilityKey("SelectableGroup");
    private static final SemanticsPropertyKey<CollectionInfo> CollectionInfo = SemanticsPropertiesKt.AccessibilityKey("CollectionInfo");
    private static final SemanticsPropertyKey<CollectionItemInfo> CollectionItemInfo = SemanticsPropertiesKt.AccessibilityKey("CollectionItemInfo");
    private static final SemanticsPropertyKey<C8736p> Heading = SemanticsPropertiesKt.AccessibilityKey("Heading");
    private static final SemanticsPropertyKey<C8736p> Disabled = SemanticsPropertiesKt.AccessibilityKey("Disabled");
    private static final SemanticsPropertyKey<LiveRegionMode> LiveRegion = SemanticsPropertiesKt.AccessibilityKey("LiveRegion");
    private static final SemanticsPropertyKey<Boolean> Focused = SemanticsPropertiesKt.AccessibilityKey("Focused");
    private static final SemanticsPropertyKey<Boolean> IsContainer = SemanticsPropertiesKt.AccessibilityKey("IsContainer");
    private static final SemanticsPropertyKey<Boolean> IsTraversalGroup = new SemanticsPropertyKey<>("IsTraversalGroup", null, 2, null);
    private static final SemanticsPropertyKey<C8736p> InvisibleToUser = new SemanticsPropertyKey<>("InvisibleToUser", new InterfaceC10574p() { // from class: androidx.compose.ui.semantics.SemanticsProperties$InvisibleToUser$1
        @Override // p300x7.InterfaceC10574p
        public final C8736p invoke(C8736p c8736p, C8736p c8736p2) {
            return c8736p;
        }
    });
    private static final SemanticsPropertyKey<C8736p> HideFromAccessibility = new SemanticsPropertyKey<>("HideFromAccessibility", new InterfaceC10574p() { // from class: androidx.compose.ui.semantics.SemanticsProperties$HideFromAccessibility$1
        @Override // p300x7.InterfaceC10574p
        public final C8736p invoke(C8736p c8736p, C8736p c8736p2) {
            return c8736p;
        }
    });
    private static final SemanticsPropertyKey<ContentType> ContentType = new SemanticsPropertyKey<>("ContentType", new InterfaceC10574p() { // from class: androidx.compose.ui.semantics.SemanticsProperties$ContentType$1
        @Override // p300x7.InterfaceC10574p
        public final ContentType invoke(ContentType contentType, ContentType contentType2) {
            return contentType;
        }
    });
    private static final SemanticsPropertyKey<ContentDataType> ContentDataType = new SemanticsPropertyKey<>("ContentDataType", new InterfaceC10574p() { // from class: androidx.compose.ui.semantics.SemanticsProperties$ContentDataType$1
        @Override // p300x7.InterfaceC10574p
        public final ContentDataType invoke(ContentDataType contentDataType, ContentDataType contentDataType2) {
            return contentDataType;
        }
    });
    private static final SemanticsPropertyKey<Float> TraversalIndex = new SemanticsPropertyKey<>("TraversalIndex", new InterfaceC10574p() { // from class: androidx.compose.ui.semantics.SemanticsProperties$TraversalIndex$1
        public final Float invoke(Float f10, float f11) {
            return f10;
        }

        @Override // p300x7.InterfaceC10574p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke((Float) obj, ((Number) obj2).floatValue());
        }
    });
    private static final SemanticsPropertyKey<ScrollAxisRange> HorizontalScrollAxisRange = SemanticsPropertiesKt.AccessibilityKey("HorizontalScrollAxisRange");
    private static final SemanticsPropertyKey<ScrollAxisRange> VerticalScrollAxisRange = SemanticsPropertiesKt.AccessibilityKey("VerticalScrollAxisRange");
    private static final SemanticsPropertyKey<C8736p> IsPopup = SemanticsPropertiesKt.AccessibilityKey("IsPopup", new InterfaceC10574p() { // from class: androidx.compose.ui.semantics.SemanticsProperties$IsPopup$1
        @Override // p300x7.InterfaceC10574p
        public final C8736p invoke(C8736p c8736p, C8736p c8736p2) {
            throw new IllegalStateException("merge function called on unmergeable property IsPopup. A popup should not be a child of a clickable/focusable node.");
        }
    });
    private static final SemanticsPropertyKey<C8736p> IsDialog = SemanticsPropertiesKt.AccessibilityKey("IsDialog", new InterfaceC10574p() { // from class: androidx.compose.ui.semantics.SemanticsProperties$IsDialog$1
        @Override // p300x7.InterfaceC10574p
        public final C8736p invoke(C8736p c8736p, C8736p c8736p2) {
            throw new IllegalStateException("merge function called on unmergeable property IsDialog. A dialog should not be a child of a clickable/focusable node.");
        }
    });
    private static final SemanticsPropertyKey<Role> Role = SemanticsPropertiesKt.AccessibilityKey("Role", new InterfaceC10574p() { // from class: androidx.compose.ui.semantics.SemanticsProperties$Role$1
        @Override // p300x7.InterfaceC10574p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return m26140invokeqtAw6s((Role) obj, ((Role) obj2).m26125unboximpl());
        }

        /* renamed from: invoke-qtA-w6s, reason: not valid java name */
        public final Role m26140invokeqtAw6s(Role role, int i10) {
            return role;
        }
    });
    private static final SemanticsPropertyKey<String> TestTag = new SemanticsPropertyKey<>("TestTag", false, new InterfaceC10574p() { // from class: androidx.compose.ui.semantics.SemanticsProperties$TestTag$1
        @Override // p300x7.InterfaceC10574p
        public final String invoke(String str, String str2) {
            return str;
        }
    });
    private static final SemanticsPropertyKey<C8736p> LinkTestMarker = new SemanticsPropertyKey<>("LinkTestMarker", false, new InterfaceC10574p() { // from class: androidx.compose.ui.semantics.SemanticsProperties$LinkTestMarker$1
        @Override // p300x7.InterfaceC10574p
        public final C8736p invoke(C8736p c8736p, C8736p c8736p2) {
            return c8736p;
        }
    });
    private static final SemanticsPropertyKey<List<AnnotatedString>> Text = SemanticsPropertiesKt.AccessibilityKey("Text", new InterfaceC10574p() { // from class: androidx.compose.ui.semantics.SemanticsProperties$Text$1
        @Override // p300x7.InterfaceC10574p
        public final List<AnnotatedString> invoke(List<AnnotatedString> list, List<AnnotatedString> list2) {
            List<AnnotatedString> listM14547X0;
            if (list == null || (listM14547X0 = AbstractC8778f0.m14547X0(list)) == null) {
                return list2;
            }
            listM14547X0.addAll(list2);
            return listM14547X0;
        }
    });
    private static final SemanticsPropertyKey<AnnotatedString> TextSubstitution = new SemanticsPropertyKey<>("TextSubstitution", null, 2, null);
    private static final SemanticsPropertyKey<Boolean> IsShowingTextSubstitution = new SemanticsPropertyKey<>("IsShowingTextSubstitution", null, 2, null);
    private static final SemanticsPropertyKey<AnnotatedString> InputText = SemanticsPropertiesKt.AccessibilityKey("InputText");
    private static final SemanticsPropertyKey<AnnotatedString> EditableText = SemanticsPropertiesKt.AccessibilityKey("EditableText");
    private static final SemanticsPropertyKey<TextRange> TextSelectionRange = SemanticsPropertiesKt.AccessibilityKey("TextSelectionRange");
    private static final SemanticsPropertyKey<ImeAction> ImeAction = SemanticsPropertiesKt.AccessibilityKey("ImeAction");
    private static final SemanticsPropertyKey<Boolean> Selected = SemanticsPropertiesKt.AccessibilityKey("Selected");
    private static final SemanticsPropertyKey<ToggleableState> ToggleableState = SemanticsPropertiesKt.AccessibilityKey("ToggleableState");
    private static final SemanticsPropertyKey<C8736p> Password = SemanticsPropertiesKt.AccessibilityKey("Password");
    private static final SemanticsPropertyKey<String> Error = SemanticsPropertiesKt.AccessibilityKey("Error");
    private static final SemanticsPropertyKey<InterfaceC10570l> IndexForKey = new SemanticsPropertyKey<>("IndexForKey", null, 2, null);
    private static final SemanticsPropertyKey<Boolean> IsEditable = new SemanticsPropertyKey<>("IsEditable", null, 2, null);
    private static final SemanticsPropertyKey<Integer> MaxTextLength = new SemanticsPropertyKey<>("MaxTextLength", null, 2, null);
    public static final int $stable = 8;

    private SemanticsProperties() {
    }

    @InterfaceC8721a
    public static /* synthetic */ void getInvisibleToUser$annotations() {
    }

    @InterfaceC8721a
    public static /* synthetic */ void getIsContainer$annotations() {
    }

    public final SemanticsPropertyKey<CollectionInfo> getCollectionInfo() {
        return CollectionInfo;
    }

    public final SemanticsPropertyKey<CollectionItemInfo> getCollectionItemInfo() {
        return CollectionItemInfo;
    }

    public final SemanticsPropertyKey<ContentDataType> getContentDataType() {
        return ContentDataType;
    }

    public final SemanticsPropertyKey<List<String>> getContentDescription() {
        return ContentDescription;
    }

    public final SemanticsPropertyKey<ContentType> getContentType() {
        return ContentType;
    }

    public final SemanticsPropertyKey<C8736p> getDisabled() {
        return Disabled;
    }

    public final SemanticsPropertyKey<AnnotatedString> getEditableText() {
        return EditableText;
    }

    public final SemanticsPropertyKey<String> getError() {
        return Error;
    }

    public final SemanticsPropertyKey<Boolean> getFocused() {
        return Focused;
    }

    public final SemanticsPropertyKey<C8736p> getHeading() {
        return Heading;
    }

    public final SemanticsPropertyKey<C8736p> getHideFromAccessibility() {
        return HideFromAccessibility;
    }

    public final SemanticsPropertyKey<ScrollAxisRange> getHorizontalScrollAxisRange() {
        return HorizontalScrollAxisRange;
    }

    public final SemanticsPropertyKey<ImeAction> getImeAction() {
        return ImeAction;
    }

    public final SemanticsPropertyKey<InterfaceC10570l> getIndexForKey() {
        return IndexForKey;
    }

    public final SemanticsPropertyKey<AnnotatedString> getInputText() {
        return InputText;
    }

    public final SemanticsPropertyKey<C8736p> getInvisibleToUser() {
        return InvisibleToUser;
    }

    public final SemanticsPropertyKey<Boolean> getIsContainer() {
        return IsContainer;
    }

    public final SemanticsPropertyKey<C8736p> getIsDialog() {
        return IsDialog;
    }

    public final SemanticsPropertyKey<Boolean> getIsEditable() {
        return IsEditable;
    }

    public final SemanticsPropertyKey<C8736p> getIsPopup() {
        return IsPopup;
    }

    public final SemanticsPropertyKey<Boolean> getIsShowingTextSubstitution() {
        return IsShowingTextSubstitution;
    }

    public final SemanticsPropertyKey<Boolean> getIsTraversalGroup() {
        return IsTraversalGroup;
    }

    public final SemanticsPropertyKey<C8736p> getLinkTestMarker() {
        return LinkTestMarker;
    }

    public final SemanticsPropertyKey<LiveRegionMode> getLiveRegion() {
        return LiveRegion;
    }

    public final SemanticsPropertyKey<Integer> getMaxTextLength() {
        return MaxTextLength;
    }

    public final SemanticsPropertyKey<String> getPaneTitle() {
        return PaneTitle;
    }

    public final SemanticsPropertyKey<C8736p> getPassword() {
        return Password;
    }

    public final SemanticsPropertyKey<ProgressBarRangeInfo> getProgressBarRangeInfo() {
        return ProgressBarRangeInfo;
    }

    public final SemanticsPropertyKey<Role> getRole() {
        return Role;
    }

    public final SemanticsPropertyKey<C8736p> getSelectableGroup() {
        return SelectableGroup;
    }

    public final SemanticsPropertyKey<Boolean> getSelected() {
        return Selected;
    }

    public final SemanticsPropertyKey<String> getStateDescription() {
        return StateDescription;
    }

    public final SemanticsPropertyKey<String> getTestTag() {
        return TestTag;
    }

    public final SemanticsPropertyKey<List<AnnotatedString>> getText() {
        return Text;
    }

    public final SemanticsPropertyKey<TextRange> getTextSelectionRange() {
        return TextSelectionRange;
    }

    public final SemanticsPropertyKey<AnnotatedString> getTextSubstitution() {
        return TextSubstitution;
    }

    public final SemanticsPropertyKey<ToggleableState> getToggleableState() {
        return ToggleableState;
    }

    public final SemanticsPropertyKey<Float> getTraversalIndex() {
        return TraversalIndex;
    }

    public final SemanticsPropertyKey<ScrollAxisRange> getVerticalScrollAxisRange() {
        return VerticalScrollAxisRange;
    }
}
