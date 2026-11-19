package androidx.compose.foundation.text;

import androidx.compose.p013ui.text.input.ImeAction;
import androidx.compose.p013ui.text.input.ImeOptions;
import androidx.compose.p013ui.text.input.KeyboardCapitalization;
import androidx.compose.p013ui.text.input.KeyboardType;
import androidx.compose.p013ui.text.input.PlatformImeOptions;
import androidx.compose.p013ui.text.intl.LocaleList;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import com.tencent.smtt.sdk.TbsListener;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.InterfaceC8721a;

@Immutable
/* loaded from: classes.dex */
public final class KeyboardOptions {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final KeyboardOptions Default = new KeyboardOptions(0, (Boolean) null, 0, 0, (PlatformImeOptions) null, (Boolean) null, (LocaleList) null, 127, (AbstractC9126n) null);
    private static final KeyboardOptions SecureTextField = new KeyboardOptions(0, Boolean.FALSE, KeyboardType.Companion.m26602getPasswordPjHm6EE(), 0, (PlatformImeOptions) (0 == true ? 1 : 0), (Boolean) (0 == true ? 1 : 0), (LocaleList) null, TbsListener.ErrorCode.THREAD_INIT_ERROR, (AbstractC9126n) null);
    private final Boolean autoCorrectEnabled;
    private final int capitalization;
    private final LocaleList hintLocales;
    private final int imeAction;
    private final int keyboardType;
    private final PlatformImeOptions platformImeOptions;
    private final Boolean showKeyboardOnFocus;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9126n abstractC9126n) {
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

    public /* synthetic */ KeyboardOptions(int i10, Boolean bool, int i11, int i12, PlatformImeOptions platformImeOptions, Boolean bool2, LocaleList localeList, AbstractC9126n abstractC9126n) {
        this(i10, bool, i11, i12, platformImeOptions, bool2, localeList);
    }

    /* renamed from: copy-3m2b7yw$default, reason: not valid java name */
    public static /* synthetic */ KeyboardOptions m21204copy3m2b7yw$default(KeyboardOptions keyboardOptions, int i10, boolean z10, int i11, int i12, int i13, Object obj) {
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
        return keyboardOptions.m21210copy3m2b7yw(i10, z10, i11, i12);
    }

    /* renamed from: copy-INvB4aQ$default, reason: not valid java name */
    public static /* synthetic */ KeyboardOptions m21205copyINvB4aQ$default(KeyboardOptions keyboardOptions, int i10, Boolean bool, int i11, int i12, PlatformImeOptions platformImeOptions, Boolean bool2, LocaleList localeList, int i13, Object obj) {
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
        return keyboardOptions2.m21211copyINvB4aQ(i16, bool4, i15, i14, platformImeOptions2, bool3, localeList2);
    }

    /* renamed from: copy-ij11fho$default, reason: not valid java name */
    public static /* synthetic */ KeyboardOptions m21207copyij11fho$default(KeyboardOptions keyboardOptions, int i10, boolean z10, int i11, int i12, PlatformImeOptions platformImeOptions, int i13, Object obj) {
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
        return keyboardOptions.m21213copyij11fho(i10, z10, i14, i12, platformImeOptions2);
    }

    @InterfaceC8721a
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
    private final int m21208getCapitalizationOrDefaultIUNYP9k() {
        KeyboardCapitalization keyboardCapitalizationM26563boximpl = KeyboardCapitalization.m26563boximpl(this.capitalization);
        int iM26569unboximpl = keyboardCapitalizationM26563boximpl.m26569unboximpl();
        KeyboardCapitalization.Companion companion = KeyboardCapitalization.Companion;
        if (KeyboardCapitalization.m26566equalsimpl0(iM26569unboximpl, companion.m26578getUnspecifiedIUNYP9k())) {
            keyboardCapitalizationM26563boximpl = null;
        }
        return keyboardCapitalizationM26563boximpl != null ? keyboardCapitalizationM26563boximpl.m26569unboximpl() : companion.m26576getNoneIUNYP9k();
    }

    private final LocaleList getHintLocalesOrDefault() {
        LocaleList localeList = this.hintLocales;
        return localeList == null ? LocaleList.Companion.getEmpty() : localeList;
    }

    /* renamed from: getKeyboardTypeOrDefault-PjHm6EE, reason: not valid java name */
    private final int m21209getKeyboardTypeOrDefaultPjHm6EE() {
        KeyboardType keyboardTypeM26580boximpl = KeyboardType.m26580boximpl(this.keyboardType);
        int iM26586unboximpl = keyboardTypeM26580boximpl.m26586unboximpl();
        KeyboardType.Companion companion = KeyboardType.Companion;
        if (KeyboardType.m26583equalsimpl0(iM26586unboximpl, companion.m26605getUnspecifiedPjHm6EE())) {
            keyboardTypeM26580boximpl = null;
        }
        return keyboardTypeM26580boximpl != null ? keyboardTypeM26580boximpl.m26586unboximpl() : companion.m26604getTextPjHm6EE();
    }

    @InterfaceC8721a
    public static /* synthetic */ void getShouldShowKeyboardOnFocus$annotations() {
    }

    private final boolean isCompletelyUnspecified() {
        return KeyboardCapitalization.m26566equalsimpl0(this.capitalization, KeyboardCapitalization.Companion.m26578getUnspecifiedIUNYP9k()) && this.autoCorrectEnabled == null && KeyboardType.m26583equalsimpl0(this.keyboardType, KeyboardType.Companion.m26605getUnspecifiedPjHm6EE()) && ImeAction.m26530equalsimpl0(this.imeAction, ImeAction.Companion.m26551getUnspecifiedeUduSuo()) && this.platformImeOptions == null && this.showKeyboardOnFocus == null && this.hintLocales == null;
    }

    public static /* synthetic */ ImeOptions toImeOptions$foundation_release$default(KeyboardOptions keyboardOptions, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = ImeOptions.Companion.getDefault().getSingleLine();
        }
        return keyboardOptions.toImeOptions$foundation_release(z10);
    }

    @InterfaceC8721a
    /* renamed from: copy-3m2b7yw, reason: not valid java name */
    public final /* synthetic */ KeyboardOptions m21210copy3m2b7yw(int i10, boolean z10, int i11, int i12) {
        return new KeyboardOptions(i10, Boolean.valueOf(z10), i11, i12, this.platformImeOptions, this.showKeyboardOnFocus, this.hintLocales, (AbstractC9126n) null);
    }

    /* renamed from: copy-INvB4aQ, reason: not valid java name */
    public final KeyboardOptions m21211copyINvB4aQ(int i10, Boolean bool, int i11, int i12, PlatformImeOptions platformImeOptions, Boolean bool2, LocaleList localeList) {
        return new KeyboardOptions(i10, bool, i11, i12, platformImeOptions, bool2, localeList, (AbstractC9126n) null);
    }

    @InterfaceC8721a
    /* renamed from: copy-ij11fho, reason: not valid java name */
    public final /* synthetic */ KeyboardOptions m21213copyij11fho(int i10, boolean z10, int i11, int i12, PlatformImeOptions platformImeOptions) {
        return new KeyboardOptions(i10, Boolean.valueOf(z10), i11, i12, platformImeOptions, this.showKeyboardOnFocus, this.hintLocales, (AbstractC9126n) null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KeyboardOptions)) {
            return false;
        }
        KeyboardOptions keyboardOptions = (KeyboardOptions) obj;
        return KeyboardCapitalization.m26566equalsimpl0(this.capitalization, keyboardOptions.capitalization) && AbstractC9133u.m16128b(this.autoCorrectEnabled, keyboardOptions.autoCorrectEnabled) && KeyboardType.m26583equalsimpl0(this.keyboardType, keyboardOptions.keyboardType) && ImeAction.m26530equalsimpl0(this.imeAction, keyboardOptions.imeAction) && AbstractC9133u.m16128b(this.platformImeOptions, keyboardOptions.platformImeOptions) && AbstractC9133u.m16128b(this.showKeyboardOnFocus, keyboardOptions.showKeyboardOnFocus) && AbstractC9133u.m16128b(this.hintLocales, keyboardOptions.hintLocales);
    }

    @Stable
    public final KeyboardOptions fillUnspecifiedValuesWith$foundation_release(KeyboardOptions keyboardOptions) {
        if (keyboardOptions == null || keyboardOptions.isCompletelyUnspecified() || AbstractC9133u.m16128b(keyboardOptions, this)) {
            return this;
        }
        if (isCompletelyUnspecified()) {
            return keyboardOptions;
        }
        KeyboardCapitalization keyboardCapitalizationM26563boximpl = KeyboardCapitalization.m26563boximpl(this.capitalization);
        if (KeyboardCapitalization.m26566equalsimpl0(keyboardCapitalizationM26563boximpl.m26569unboximpl(), KeyboardCapitalization.Companion.m26578getUnspecifiedIUNYP9k())) {
            keyboardCapitalizationM26563boximpl = null;
        }
        int iM26569unboximpl = keyboardCapitalizationM26563boximpl != null ? keyboardCapitalizationM26563boximpl.m26569unboximpl() : keyboardOptions.capitalization;
        Boolean bool = this.autoCorrectEnabled;
        if (bool == null) {
            bool = keyboardOptions.autoCorrectEnabled;
        }
        Boolean bool2 = bool;
        KeyboardType keyboardTypeM26580boximpl = KeyboardType.m26580boximpl(this.keyboardType);
        if (KeyboardType.m26583equalsimpl0(keyboardTypeM26580boximpl.m26586unboximpl(), KeyboardType.Companion.m26605getUnspecifiedPjHm6EE())) {
            keyboardTypeM26580boximpl = null;
        }
        int iM26586unboximpl = keyboardTypeM26580boximpl != null ? keyboardTypeM26580boximpl.m26586unboximpl() : keyboardOptions.keyboardType;
        ImeAction imeActionM26527boximpl = ImeAction.m26527boximpl(this.imeAction);
        ImeAction imeAction = ImeAction.m26530equalsimpl0(imeActionM26527boximpl.m26533unboximpl(), ImeAction.Companion.m26551getUnspecifiedeUduSuo()) ? null : imeActionM26527boximpl;
        int iM26533unboximpl = imeAction != null ? imeAction.m26533unboximpl() : keyboardOptions.imeAction;
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
        return new KeyboardOptions(iM26569unboximpl, bool2, iM26586unboximpl, iM26533unboximpl, platformImeOptions2, bool4, localeList, (AbstractC9126n) null);
    }

    public final boolean getAutoCorrect() {
        return getAutoCorrectOrDefault();
    }

    public final Boolean getAutoCorrectEnabled() {
        return this.autoCorrectEnabled;
    }

    /* renamed from: getCapitalization-IUNYP9k, reason: not valid java name */
    public final int m21214getCapitalizationIUNYP9k() {
        return this.capitalization;
    }

    public final LocaleList getHintLocales() {
        return this.hintLocales;
    }

    /* renamed from: getImeAction-eUduSuo, reason: not valid java name */
    public final int m21215getImeActioneUduSuo() {
        return this.imeAction;
    }

    /* renamed from: getImeActionOrDefault-eUduSuo$foundation_release, reason: not valid java name */
    public final int m21216getImeActionOrDefaulteUduSuo$foundation_release() {
        ImeAction imeActionM26527boximpl = ImeAction.m26527boximpl(this.imeAction);
        int iM26533unboximpl = imeActionM26527boximpl.m26533unboximpl();
        ImeAction.Companion companion = ImeAction.Companion;
        if (ImeAction.m26530equalsimpl0(iM26533unboximpl, companion.m26551getUnspecifiedeUduSuo())) {
            imeActionM26527boximpl = null;
        }
        return imeActionM26527boximpl != null ? imeActionM26527boximpl.m26533unboximpl() : companion.m26543getDefaulteUduSuo();
    }

    /* renamed from: getKeyboardType-PjHm6EE, reason: not valid java name */
    public final int m21217getKeyboardTypePjHm6EE() {
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
        int iM26567hashCodeimpl = KeyboardCapitalization.m26567hashCodeimpl(this.capitalization) * 31;
        Boolean bool = this.autoCorrectEnabled;
        int iHashCode = (((((iM26567hashCodeimpl + (bool != null ? bool.hashCode() : 0)) * 31) + KeyboardType.m26584hashCodeimpl(this.keyboardType)) * 31) + ImeAction.m26531hashCodeimpl(this.imeAction)) * 31;
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
        return new ImeOptions(z10, m21208getCapitalizationOrDefaultIUNYP9k(), getAutoCorrectOrDefault(), m21209getKeyboardTypeOrDefaultPjHm6EE(), m21216getImeActionOrDefaulteUduSuo$foundation_release(), this.platformImeOptions, getHintLocalesOrDefault(), (AbstractC9126n) null);
    }

    public String toString() {
        return "KeyboardOptions(capitalization=" + ((Object) KeyboardCapitalization.m26568toStringimpl(this.capitalization)) + ", autoCorrectEnabled=" + this.autoCorrectEnabled + ", keyboardType=" + ((Object) KeyboardType.m26585toStringimpl(this.keyboardType)) + ", imeAction=" + ((Object) ImeAction.m26532toStringimpl(this.imeAction)) + ", platformImeOptions=" + this.platformImeOptions + "showKeyboardOnFocus=" + this.showKeyboardOnFocus + ", hintLocales=" + this.hintLocales + ')';
    }

    @InterfaceC8721a
    public /* synthetic */ KeyboardOptions(int i10, boolean z10, int i11, int i12, PlatformImeOptions platformImeOptions, Boolean bool, LocaleList localeList, AbstractC9126n abstractC9126n) {
        this(i10, z10, i11, i12, platformImeOptions, bool, localeList);
    }

    @InterfaceC8721a
    /* renamed from: copy-INvB4aQ, reason: not valid java name */
    public final /* synthetic */ KeyboardOptions m21212copyINvB4aQ(int i10, boolean z10, int i11, int i12, PlatformImeOptions platformImeOptions, Boolean bool, LocaleList localeList) {
        return new KeyboardOptions(i10, Boolean.valueOf(z10), i11, i12, platformImeOptions, bool, localeList, (AbstractC9126n) null);
    }

    @InterfaceC8721a
    public /* synthetic */ KeyboardOptions(int i10, boolean z10, int i11, int i12, PlatformImeOptions platformImeOptions, AbstractC9126n abstractC9126n) {
        this(i10, z10, i11, i12, platformImeOptions);
    }

    @InterfaceC8721a
    public /* synthetic */ KeyboardOptions(int i10, boolean z10, int i11, int i12, AbstractC9126n abstractC9126n) {
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
    public static /* synthetic */ KeyboardOptions m21206copyINvB4aQ$default(KeyboardOptions keyboardOptions, int i10, boolean z10, int i11, int i12, PlatformImeOptions platformImeOptions, Boolean bool, LocaleList localeList, int i13, Object obj) {
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
        return keyboardOptions.m21212copyINvB4aQ(i10, z10, i14, i12, platformImeOptions2, bool2, localeList2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ KeyboardOptions(int i10, Boolean bool, int i11, int i12, PlatformImeOptions platformImeOptions, Boolean bool2, LocaleList localeList, int i13, AbstractC9126n abstractC9126n) {
        int iM26578getUnspecifiedIUNYP9k = (i13 & 1) != 0 ? KeyboardCapitalization.Companion.m26578getUnspecifiedIUNYP9k() : i10;
        Boolean bool3 = (i13 & 2) != 0 ? null : bool;
        int iM26605getUnspecifiedPjHm6EE = (i13 & 4) != 0 ? KeyboardType.Companion.m26605getUnspecifiedPjHm6EE() : i11;
        int iM26551getUnspecifiedeUduSuo = (i13 & 8) != 0 ? ImeAction.Companion.m26551getUnspecifiedeUduSuo() : i12;
        PlatformImeOptions platformImeOptions2 = (i13 & 16) != 0 ? null : platformImeOptions;
        Boolean bool4 = (i13 & 32) != 0 ? null : bool2;
        this(iM26578getUnspecifiedIUNYP9k, bool3, iM26605getUnspecifiedPjHm6EE, iM26551getUnspecifiedeUduSuo, platformImeOptions2, bool4, (i13 & 64) == 0 ? localeList : null, (AbstractC9126n) null);
    }

    public /* synthetic */ KeyboardOptions(int i10, boolean z10, int i11, int i12, PlatformImeOptions platformImeOptions, Boolean bool, LocaleList localeList, int i13, AbstractC9126n abstractC9126n) {
        this((i13 & 1) != 0 ? KeyboardCapitalization.Companion.m26578getUnspecifiedIUNYP9k() : i10, z10, (i13 & 4) != 0 ? KeyboardType.Companion.m26605getUnspecifiedPjHm6EE() : i11, (i13 & 8) != 0 ? ImeAction.Companion.m26551getUnspecifiedeUduSuo() : i12, (i13 & 16) != 0 ? null : platformImeOptions, (i13 & 32) != 0 ? null : bool, (i13 & 64) != 0 ? null : localeList, (AbstractC9126n) null);
    }

    private KeyboardOptions(int i10, boolean z10, int i11, int i12, PlatformImeOptions platformImeOptions, Boolean bool, LocaleList localeList) {
        this(i10, Boolean.valueOf(z10), i11, i12, platformImeOptions, bool, localeList, (AbstractC9126n) null);
    }

    public /* synthetic */ KeyboardOptions(int i10, boolean z10, int i11, int i12, int i13, AbstractC9126n abstractC9126n) {
        this((i13 & 1) != 0 ? KeyboardCapitalization.Companion.m26578getUnspecifiedIUNYP9k() : i10, (i13 & 2) != 0 ? Default.getAutoCorrectOrDefault() : z10, (i13 & 4) != 0 ? KeyboardType.Companion.m26605getUnspecifiedPjHm6EE() : i11, (i13 & 8) != 0 ? ImeAction.Companion.m26543getDefaulteUduSuo() : i12, (AbstractC9126n) null);
    }

    private KeyboardOptions(int i10, boolean z10, int i11, int i12) {
        this(i10, Boolean.valueOf(z10), i11, i12, (PlatformImeOptions) null, (Boolean) null, (LocaleList) null, 96, (AbstractC9126n) null);
    }

    public /* synthetic */ KeyboardOptions(int i10, boolean z10, int i11, int i12, PlatformImeOptions platformImeOptions, int i13, AbstractC9126n abstractC9126n) {
        this((i13 & 1) != 0 ? KeyboardCapitalization.Companion.m26576getNoneIUNYP9k() : i10, (i13 & 2) != 0 ? Default.getAutoCorrectOrDefault() : z10, (i13 & 4) != 0 ? KeyboardType.Companion.m26604getTextPjHm6EE() : i11, (i13 & 8) != 0 ? ImeAction.Companion.m26543getDefaulteUduSuo() : i12, (i13 & 16) != 0 ? null : platformImeOptions, (AbstractC9126n) null);
    }

    private KeyboardOptions(int i10, boolean z10, int i11, int i12, PlatformImeOptions platformImeOptions) {
        this(i10, Boolean.valueOf(z10), i11, i12, platformImeOptions, Boolean.valueOf(Default.getShowKeyboardOnFocusOrDefault$foundation_release()), (LocaleList) null, 64, (AbstractC9126n) null);
    }
}
