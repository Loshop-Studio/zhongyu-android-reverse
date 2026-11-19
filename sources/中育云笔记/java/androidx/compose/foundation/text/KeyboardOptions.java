package androidx.compose.foundation.text;

import androidx.compose.p014ui.text.input.ImeAction;
import androidx.compose.p014ui.text.input.ImeOptions;
import androidx.compose.p014ui.text.input.KeyboardCapitalization;
import androidx.compose.p014ui.text.input.KeyboardType;
import androidx.compose.p014ui.text.input.PlatformImeOptions;
import androidx.compose.p014ui.text.intl.LocaleList;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import com.taobao.sophix.PatchStatus;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p309qc.InterfaceC10770a;

@Immutable
/* loaded from: classes.dex */
public final class KeyboardOptions {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final KeyboardOptions Default = new KeyboardOptions(0, (Boolean) null, 0, 0, (PlatformImeOptions) null, (Boolean) null, (LocaleList) null, 127, (AbstractC9972n) null);
    private static final KeyboardOptions SecureTextField = new KeyboardOptions(0, Boolean.FALSE, KeyboardType.Companion.m33204getPasswordPjHm6EE(), 0, (PlatformImeOptions) (0 == true ? 1 : 0), (Boolean) (0 == true ? 1 : 0), (LocaleList) null, PatchStatus.CODE_LOAD_RES_INJECT_PATH, (AbstractC9972n) null);
    private final Boolean autoCorrectEnabled;
    private final int capitalization;
    private final LocaleList hintLocales;
    private final int imeAction;
    private final int keyboardType;
    private final PlatformImeOptions platformImeOptions;
    private final Boolean showKeyboardOnFocus;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        @Stable
        public static /* synthetic */ void getDefault$annotations() {
        }

        @Stable
        public static /* synthetic */ void getSecureTextField$foundation_release$annotations() {
        }

        public final KeyboardOptions getDefault() {
            return KeyboardOptions.Default;
        }

        public final KeyboardOptions getSecureTextField$foundation_release() {
            return KeyboardOptions.SecureTextField;
        }

        private Companion() {
        }
    }

    public /* synthetic */ KeyboardOptions(int i10, Boolean bool, int i11, int i12, PlatformImeOptions platformImeOptions, Boolean bool2, LocaleList localeList, AbstractC9972n abstractC9972n) {
        this(i10, bool, i11, i12, platformImeOptions, bool2, localeList);
    }

    /* renamed from: copy-3m2b7yw$default, reason: not valid java name */
    public static /* synthetic */ KeyboardOptions m27806copy3m2b7yw$default(KeyboardOptions keyboardOptions, int i10, boolean z10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i10 = keyboardOptions.capitalization;
        }
        if ((i13 & 2) != 0) {
            z10 = keyboardOptions.getAutoCorrectOrDefault();
        }
        if ((i13 & 4) != 0) {
            i11 = keyboardOptions.keyboardType;
        }
        if ((i13 & 8) != 0) {
            i12 = keyboardOptions.imeAction;
        }
        return keyboardOptions.m27812copy3m2b7yw(i10, z10, i11, i12);
    }

    /* renamed from: copy-INvB4aQ$default, reason: not valid java name */
    public static /* synthetic */ KeyboardOptions m27807copyINvB4aQ$default(KeyboardOptions keyboardOptions, int i10, Boolean bool, int i11, int i12, PlatformImeOptions platformImeOptions, Boolean bool2, LocaleList localeList, int i13, Object obj) {
        LocaleList localeList2;
        Boolean bool3;
        int i14;
        PlatformImeOptions platformImeOptions2;
        Boolean bool4;
        int i15;
        KeyboardOptions keyboardOptions2;
        int i16;
        if ((i13 & 1) != 0) {
            i10 = keyboardOptions.capitalization;
        }
        if ((i13 & 2) != 0) {
            bool = keyboardOptions.autoCorrectEnabled;
        }
        if ((i13 & 4) != 0) {
            i11 = keyboardOptions.keyboardType;
        }
        if ((i13 & 8) != 0) {
            i12 = keyboardOptions.imeAction;
        }
        if ((i13 & 16) != 0) {
            platformImeOptions = keyboardOptions.platformImeOptions;
        }
        if ((i13 & 32) != 0) {
            bool2 = null;
        }
        if ((i13 & 64) != 0) {
            localeList2 = null;
            platformImeOptions2 = platformImeOptions;
            bool3 = bool2;
            i15 = i11;
            i14 = i12;
            i16 = i10;
            bool4 = bool;
            keyboardOptions2 = keyboardOptions;
        } else {
            localeList2 = localeList;
            bool3 = bool2;
            i14 = i12;
            platformImeOptions2 = platformImeOptions;
            bool4 = bool;
            i15 = i11;
            keyboardOptions2 = keyboardOptions;
            i16 = i10;
        }
        return keyboardOptions2.m27813copyINvB4aQ(i16, bool4, i15, i14, platformImeOptions2, bool3, localeList2);
    }

    /* renamed from: copy-ij11fho$default, reason: not valid java name */
    public static /* synthetic */ KeyboardOptions m27809copyij11fho$default(KeyboardOptions keyboardOptions, int i10, boolean z10, int i11, int i12, PlatformImeOptions platformImeOptions, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i10 = keyboardOptions.capitalization;
        }
        if ((i13 & 2) != 0) {
            z10 = keyboardOptions.getAutoCorrectOrDefault();
        }
        if ((i13 & 4) != 0) {
            i11 = keyboardOptions.keyboardType;
        }
        if ((i13 & 8) != 0) {
            i12 = keyboardOptions.imeAction;
        }
        if ((i13 & 16) != 0) {
            platformImeOptions = keyboardOptions.platformImeOptions;
        }
        PlatformImeOptions platformImeOptions2 = platformImeOptions;
        int i14 = i11;
        return keyboardOptions.m27815copyij11fho(i10, z10, i14, i12, platformImeOptions2);
    }

    @InterfaceC10770a
    public static /* synthetic */ void getAutoCorrect$annotations() {
    }

    private final boolean getAutoCorrectOrDefault() {
        Boolean bool = this.autoCorrectEnabled;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    /* renamed from: getCapitalizationOrDefault-IUNYP9k, reason: not valid java name */
    private final int m27810getCapitalizationOrDefaultIUNYP9k() {
        KeyboardCapitalization keyboardCapitalizationM33165boximpl = KeyboardCapitalization.m33165boximpl(this.capitalization);
        int iM33171unboximpl = keyboardCapitalizationM33165boximpl.m33171unboximpl();
        KeyboardCapitalization.Companion companion = KeyboardCapitalization.Companion;
        if (KeyboardCapitalization.m33168equalsimpl0(iM33171unboximpl, companion.m33180getUnspecifiedIUNYP9k())) {
            keyboardCapitalizationM33165boximpl = null;
        }
        return keyboardCapitalizationM33165boximpl != null ? keyboardCapitalizationM33165boximpl.m33171unboximpl() : companion.m33178getNoneIUNYP9k();
    }

    private final LocaleList getHintLocalesOrDefault() {
        LocaleList localeList = this.hintLocales;
        return localeList == null ? LocaleList.Companion.getEmpty() : localeList;
    }

    /* renamed from: getKeyboardTypeOrDefault-PjHm6EE, reason: not valid java name */
    private final int m27811getKeyboardTypeOrDefaultPjHm6EE() {
        KeyboardType keyboardTypeM33182boximpl = KeyboardType.m33182boximpl(this.keyboardType);
        int iM33188unboximpl = keyboardTypeM33182boximpl.m33188unboximpl();
        KeyboardType.Companion companion = KeyboardType.Companion;
        if (KeyboardType.m33185equalsimpl0(iM33188unboximpl, companion.m33207getUnspecifiedPjHm6EE())) {
            keyboardTypeM33182boximpl = null;
        }
        return keyboardTypeM33182boximpl != null ? keyboardTypeM33182boximpl.m33188unboximpl() : companion.m33206getTextPjHm6EE();
    }

    @InterfaceC10770a
    public static /* synthetic */ void getShouldShowKeyboardOnFocus$annotations() {
    }

    private final boolean isCompletelyUnspecified() {
        return KeyboardCapitalization.m33168equalsimpl0(this.capitalization, KeyboardCapitalization.Companion.m33180getUnspecifiedIUNYP9k()) && this.autoCorrectEnabled == null && KeyboardType.m33185equalsimpl0(this.keyboardType, KeyboardType.Companion.m33207getUnspecifiedPjHm6EE()) && ImeAction.m33132equalsimpl0(this.imeAction, ImeAction.Companion.m33153getUnspecifiedeUduSuo()) && this.platformImeOptions == null && this.showKeyboardOnFocus == null && this.hintLocales == null;
    }

    public static /* synthetic */ ImeOptions toImeOptions$foundation_release$default(KeyboardOptions keyboardOptions, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = ImeOptions.Companion.getDefault().getSingleLine();
        }
        return keyboardOptions.toImeOptions$foundation_release(z10);
    }

    @InterfaceC10770a
    /* renamed from: copy-3m2b7yw, reason: not valid java name */
    public final /* synthetic */ KeyboardOptions m27812copy3m2b7yw(int i10, boolean z10, int i11, int i12) {
        return new KeyboardOptions(i10, Boolean.valueOf(z10), i11, i12, this.platformImeOptions, this.showKeyboardOnFocus, this.hintLocales, (AbstractC9972n) null);
    }

    /* renamed from: copy-INvB4aQ, reason: not valid java name */
    public final KeyboardOptions m27813copyINvB4aQ(int i10, Boolean bool, int i11, int i12, PlatformImeOptions platformImeOptions, Boolean bool2, LocaleList localeList) {
        return new KeyboardOptions(i10, bool, i11, i12, platformImeOptions, bool2, localeList, (AbstractC9972n) null);
    }

    @InterfaceC10770a
    /* renamed from: copy-ij11fho, reason: not valid java name */
    public final /* synthetic */ KeyboardOptions m27815copyij11fho(int i10, boolean z10, int i11, int i12, PlatformImeOptions platformImeOptions) {
        return new KeyboardOptions(i10, Boolean.valueOf(z10), i11, i12, platformImeOptions, this.showKeyboardOnFocus, this.hintLocales, (AbstractC9972n) null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KeyboardOptions)) {
            return false;
        }
        KeyboardOptions keyboardOptions = (KeyboardOptions) obj;
        return KeyboardCapitalization.m33168equalsimpl0(this.capitalization, keyboardOptions.capitalization) && AbstractC9979u.m20289b(this.autoCorrectEnabled, keyboardOptions.autoCorrectEnabled) && KeyboardType.m33185equalsimpl0(this.keyboardType, keyboardOptions.keyboardType) && ImeAction.m33132equalsimpl0(this.imeAction, keyboardOptions.imeAction) && AbstractC9979u.m20289b(this.platformImeOptions, keyboardOptions.platformImeOptions) && AbstractC9979u.m20289b(this.showKeyboardOnFocus, keyboardOptions.showKeyboardOnFocus) && AbstractC9979u.m20289b(this.hintLocales, keyboardOptions.hintLocales);
    }

    @Stable
    public final KeyboardOptions fillUnspecifiedValuesWith$foundation_release(KeyboardOptions keyboardOptions) {
        if (keyboardOptions == null || keyboardOptions.isCompletelyUnspecified() || AbstractC9979u.m20289b(keyboardOptions, this)) {
            return this;
        }
        if (isCompletelyUnspecified()) {
            return keyboardOptions;
        }
        KeyboardCapitalization keyboardCapitalizationM33165boximpl = KeyboardCapitalization.m33165boximpl(this.capitalization);
        if (KeyboardCapitalization.m33168equalsimpl0(keyboardCapitalizationM33165boximpl.m33171unboximpl(), KeyboardCapitalization.Companion.m33180getUnspecifiedIUNYP9k())) {
            keyboardCapitalizationM33165boximpl = null;
        }
        int iM33171unboximpl = keyboardCapitalizationM33165boximpl != null ? keyboardCapitalizationM33165boximpl.m33171unboximpl() : keyboardOptions.capitalization;
        Boolean bool = this.autoCorrectEnabled;
        if (bool == null) {
            bool = keyboardOptions.autoCorrectEnabled;
        }
        Boolean bool2 = bool;
        KeyboardType keyboardTypeM33182boximpl = KeyboardType.m33182boximpl(this.keyboardType);
        if (KeyboardType.m33185equalsimpl0(keyboardTypeM33182boximpl.m33188unboximpl(), KeyboardType.Companion.m33207getUnspecifiedPjHm6EE())) {
            keyboardTypeM33182boximpl = null;
        }
        int iM33188unboximpl = keyboardTypeM33182boximpl != null ? keyboardTypeM33182boximpl.m33188unboximpl() : keyboardOptions.keyboardType;
        ImeAction imeActionM33129boximpl = ImeAction.m33129boximpl(this.imeAction);
        ImeAction imeAction = ImeAction.m33132equalsimpl0(imeActionM33129boximpl.m33135unboximpl(), ImeAction.Companion.m33153getUnspecifiedeUduSuo()) ? null : imeActionM33129boximpl;
        int iM33135unboximpl = imeAction != null ? imeAction.m33135unboximpl() : keyboardOptions.imeAction;
        PlatformImeOptions platformImeOptions = this.platformImeOptions;
        if (platformImeOptions == null) {
            platformImeOptions = keyboardOptions.platformImeOptions;
        }
        PlatformImeOptions platformImeOptions2 = platformImeOptions;
        Boolean bool3 = this.showKeyboardOnFocus;
        if (bool3 == null) {
            bool3 = keyboardOptions.showKeyboardOnFocus;
        }
        Boolean bool4 = bool3;
        LocaleList localeList = this.hintLocales;
        if (localeList == null) {
            localeList = keyboardOptions.hintLocales;
        }
        return new KeyboardOptions(iM33171unboximpl, bool2, iM33188unboximpl, iM33135unboximpl, platformImeOptions2, bool4, localeList, (AbstractC9972n) null);
    }

    public final boolean getAutoCorrect() {
        return getAutoCorrectOrDefault();
    }

    public final Boolean getAutoCorrectEnabled() {
        return this.autoCorrectEnabled;
    }

    /* renamed from: getCapitalization-IUNYP9k, reason: not valid java name */
    public final int m27816getCapitalizationIUNYP9k() {
        return this.capitalization;
    }

    public final LocaleList getHintLocales() {
        return this.hintLocales;
    }

    /* renamed from: getImeAction-eUduSuo, reason: not valid java name */
    public final int m27817getImeActioneUduSuo() {
        return this.imeAction;
    }

    /* renamed from: getImeActionOrDefault-eUduSuo$foundation_release, reason: not valid java name */
    public final int m27818getImeActionOrDefaulteUduSuo$foundation_release() {
        ImeAction imeActionM33129boximpl = ImeAction.m33129boximpl(this.imeAction);
        int iM33135unboximpl = imeActionM33129boximpl.m33135unboximpl();
        ImeAction.Companion companion = ImeAction.Companion;
        if (ImeAction.m33132equalsimpl0(iM33135unboximpl, companion.m33153getUnspecifiedeUduSuo())) {
            imeActionM33129boximpl = null;
        }
        return imeActionM33129boximpl != null ? imeActionM33129boximpl.m33135unboximpl() : companion.m33145getDefaulteUduSuo();
    }

    /* renamed from: getKeyboardType-PjHm6EE, reason: not valid java name */
    public final int m27819getKeyboardTypePjHm6EE() {
        return this.keyboardType;
    }

    public final PlatformImeOptions getPlatformImeOptions() {
        return this.platformImeOptions;
    }

    public final /* synthetic */ boolean getShouldShowKeyboardOnFocus() {
        Boolean bool = this.showKeyboardOnFocus;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    public final Boolean getShowKeyboardOnFocus() {
        return this.showKeyboardOnFocus;
    }

    public final boolean getShowKeyboardOnFocusOrDefault$foundation_release() {
        Boolean bool = this.showKeyboardOnFocus;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    public int hashCode() {
        int iM33169hashCodeimpl = KeyboardCapitalization.m33169hashCodeimpl(this.capitalization) * 31;
        Boolean bool = this.autoCorrectEnabled;
        int iHashCode = (((((iM33169hashCodeimpl + (bool != null ? bool.hashCode() : 0)) * 31) + KeyboardType.m33186hashCodeimpl(this.keyboardType)) * 31) + ImeAction.m33133hashCodeimpl(this.imeAction)) * 31;
        PlatformImeOptions platformImeOptions = this.platformImeOptions;
        int iHashCode2 = (iHashCode + (platformImeOptions != null ? platformImeOptions.hashCode() : 0)) * 31;
        Boolean bool2 = this.showKeyboardOnFocus;
        int iHashCode3 = (iHashCode2 + (bool2 != null ? bool2.hashCode() : 0)) * 31;
        LocaleList localeList = this.hintLocales;
        return iHashCode3 + (localeList != null ? localeList.hashCode() : 0);
    }

    public final KeyboardOptions merge(KeyboardOptions keyboardOptions) {
        KeyboardOptions keyboardOptionsFillUnspecifiedValuesWith$foundation_release;
        return (keyboardOptions == null || (keyboardOptionsFillUnspecifiedValuesWith$foundation_release = keyboardOptions.fillUnspecifiedValuesWith$foundation_release(this)) == null) ? this : keyboardOptionsFillUnspecifiedValuesWith$foundation_release;
    }

    public final ImeOptions toImeOptions$foundation_release(boolean z10) {
        return new ImeOptions(z10, m27810getCapitalizationOrDefaultIUNYP9k(), getAutoCorrectOrDefault(), m27811getKeyboardTypeOrDefaultPjHm6EE(), m27818getImeActionOrDefaulteUduSuo$foundation_release(), this.platformImeOptions, getHintLocalesOrDefault(), (AbstractC9972n) null);
    }

    public String toString() {
        return "KeyboardOptions(capitalization=" + ((Object) KeyboardCapitalization.m33170toStringimpl(this.capitalization)) + ", autoCorrectEnabled=" + this.autoCorrectEnabled + ", keyboardType=" + ((Object) KeyboardType.m33187toStringimpl(this.keyboardType)) + ", imeAction=" + ((Object) ImeAction.m33134toStringimpl(this.imeAction)) + ", platformImeOptions=" + this.platformImeOptions + "showKeyboardOnFocus=" + this.showKeyboardOnFocus + ", hintLocales=" + this.hintLocales + ')';
    }

    @InterfaceC10770a
    public /* synthetic */ KeyboardOptions(int i10, boolean z10, int i11, int i12, PlatformImeOptions platformImeOptions, Boolean bool, LocaleList localeList, AbstractC9972n abstractC9972n) {
        this(i10, z10, i11, i12, platformImeOptions, bool, localeList);
    }

    @InterfaceC10770a
    /* renamed from: copy-INvB4aQ, reason: not valid java name */
    public final /* synthetic */ KeyboardOptions m27814copyINvB4aQ(int i10, boolean z10, int i11, int i12, PlatformImeOptions platformImeOptions, Boolean bool, LocaleList localeList) {
        return new KeyboardOptions(i10, Boolean.valueOf(z10), i11, i12, platformImeOptions, bool, localeList, (AbstractC9972n) null);
    }

    @InterfaceC10770a
    public /* synthetic */ KeyboardOptions(int i10, boolean z10, int i11, int i12, PlatformImeOptions platformImeOptions, AbstractC9972n abstractC9972n) {
        this(i10, z10, i11, i12, platformImeOptions);
    }

    @InterfaceC10770a
    public /* synthetic */ KeyboardOptions(int i10, boolean z10, int i11, int i12, AbstractC9972n abstractC9972n) {
        this(i10, z10, i11, i12);
    }

    private KeyboardOptions(int i10, Boolean bool, int i11, int i12, PlatformImeOptions platformImeOptions, Boolean bool2, LocaleList localeList) {
        this.capitalization = i10;
        this.autoCorrectEnabled = bool;
        this.keyboardType = i11;
        this.imeAction = i12;
        this.platformImeOptions = platformImeOptions;
        this.showKeyboardOnFocus = bool2;
        this.hintLocales = localeList;
    }

    /* renamed from: copy-INvB4aQ$default, reason: not valid java name */
    public static /* synthetic */ KeyboardOptions m27808copyINvB4aQ$default(KeyboardOptions keyboardOptions, int i10, boolean z10, int i11, int i12, PlatformImeOptions platformImeOptions, Boolean bool, LocaleList localeList, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i10 = keyboardOptions.capitalization;
        }
        if ((i13 & 2) != 0) {
            z10 = keyboardOptions.getAutoCorrectOrDefault();
        }
        if ((i13 & 4) != 0) {
            i11 = keyboardOptions.keyboardType;
        }
        if ((i13 & 8) != 0) {
            i12 = keyboardOptions.imeAction;
        }
        if ((i13 & 16) != 0) {
            platformImeOptions = keyboardOptions.platformImeOptions;
        }
        if ((i13 & 32) != 0) {
            bool = Boolean.valueOf(keyboardOptions.getShowKeyboardOnFocusOrDefault$foundation_release());
        }
        if ((i13 & 64) != 0) {
            localeList = keyboardOptions.hintLocales;
        }
        Boolean bool2 = bool;
        LocaleList localeList2 = localeList;
        PlatformImeOptions platformImeOptions2 = platformImeOptions;
        int i14 = i11;
        return keyboardOptions.m27814copyINvB4aQ(i10, z10, i14, i12, platformImeOptions2, bool2, localeList2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ KeyboardOptions(int i10, Boolean bool, int i11, int i12, PlatformImeOptions platformImeOptions, Boolean bool2, LocaleList localeList, int i13, AbstractC9972n abstractC9972n) {
        int iM33180getUnspecifiedIUNYP9k = (i13 & 1) != 0 ? KeyboardCapitalization.Companion.m33180getUnspecifiedIUNYP9k() : i10;
        Boolean bool3 = (i13 & 2) != 0 ? null : bool;
        int iM33207getUnspecifiedPjHm6EE = (i13 & 4) != 0 ? KeyboardType.Companion.m33207getUnspecifiedPjHm6EE() : i11;
        int iM33153getUnspecifiedeUduSuo = (i13 & 8) != 0 ? ImeAction.Companion.m33153getUnspecifiedeUduSuo() : i12;
        PlatformImeOptions platformImeOptions2 = (i13 & 16) != 0 ? null : platformImeOptions;
        Boolean bool4 = (i13 & 32) != 0 ? null : bool2;
        this(iM33180getUnspecifiedIUNYP9k, bool3, iM33207getUnspecifiedPjHm6EE, iM33153getUnspecifiedeUduSuo, platformImeOptions2, bool4, (i13 & 64) == 0 ? localeList : null, (AbstractC9972n) null);
    }

    public /* synthetic */ KeyboardOptions(int i10, boolean z10, int i11, int i12, PlatformImeOptions platformImeOptions, Boolean bool, LocaleList localeList, int i13, AbstractC9972n abstractC9972n) {
        this((i13 & 1) != 0 ? KeyboardCapitalization.Companion.m33180getUnspecifiedIUNYP9k() : i10, z10, (i13 & 4) != 0 ? KeyboardType.Companion.m33207getUnspecifiedPjHm6EE() : i11, (i13 & 8) != 0 ? ImeAction.Companion.m33153getUnspecifiedeUduSuo() : i12, (i13 & 16) != 0 ? null : platformImeOptions, (i13 & 32) != 0 ? null : bool, (i13 & 64) != 0 ? null : localeList, (AbstractC9972n) null);
    }

    private KeyboardOptions(int i10, boolean z10, int i11, int i12, PlatformImeOptions platformImeOptions, Boolean bool, LocaleList localeList) {
        this(i10, Boolean.valueOf(z10), i11, i12, platformImeOptions, bool, localeList, (AbstractC9972n) null);
    }

    public /* synthetic */ KeyboardOptions(int i10, boolean z10, int i11, int i12, int i13, AbstractC9972n abstractC9972n) {
        this((i13 & 1) != 0 ? KeyboardCapitalization.Companion.m33180getUnspecifiedIUNYP9k() : i10, (i13 & 2) != 0 ? Default.getAutoCorrectOrDefault() : z10, (i13 & 4) != 0 ? KeyboardType.Companion.m33207getUnspecifiedPjHm6EE() : i11, (i13 & 8) != 0 ? ImeAction.Companion.m33145getDefaulteUduSuo() : i12, (AbstractC9972n) null);
    }

    private KeyboardOptions(int i10, boolean z10, int i11, int i12) {
        this(i10, Boolean.valueOf(z10), i11, i12, (PlatformImeOptions) null, (Boolean) null, (LocaleList) null, 96, (AbstractC9972n) null);
    }

    public /* synthetic */ KeyboardOptions(int i10, boolean z10, int i11, int i12, PlatformImeOptions platformImeOptions, int i13, AbstractC9972n abstractC9972n) {
        this((i13 & 1) != 0 ? KeyboardCapitalization.Companion.m33178getNoneIUNYP9k() : i10, (i13 & 2) != 0 ? Default.getAutoCorrectOrDefault() : z10, (i13 & 4) != 0 ? KeyboardType.Companion.m33206getTextPjHm6EE() : i11, (i13 & 8) != 0 ? ImeAction.Companion.m33145getDefaulteUduSuo() : i12, (i13 & 16) != 0 ? null : platformImeOptions, (AbstractC9972n) null);
    }

    private KeyboardOptions(int i10, boolean z10, int i11, int i12, PlatformImeOptions platformImeOptions) {
        this(i10, Boolean.valueOf(z10), i11, i12, platformImeOptions, Boolean.valueOf(Default.getShowKeyboardOnFocusOrDefault$foundation_release()), (LocaleList) null, 64, (AbstractC9972n) null);
    }
}
