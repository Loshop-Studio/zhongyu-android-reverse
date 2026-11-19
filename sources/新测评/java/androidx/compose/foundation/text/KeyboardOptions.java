package androidx.compose.foundation.text;

import androidx.compose.p013ui.text.input.ImeAction;
import androidx.compose.p013ui.text.input.ImeOptions;
import androidx.compose.p013ui.text.input.KeyboardCapitalization;
import androidx.compose.p013ui.text.input.KeyboardType;
import androidx.compose.p013ui.text.input.PlatformImeOptions;
import androidx.compose.p013ui.text.intl.LocaleList;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Immutable
@Metadata(m13557d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b3\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u0000 J2\u00020\u0001:\u0001JBQ\b\u0017\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0002\u0010\u000fB/\b\u0017\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\u0010B;\b\u0017\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\u0011BS\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0002\u0010\u0013J:\u00105\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0007ø\u0001\u0000¢\u0006\u0004\b6\u00107JF\u00105\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0007ø\u0001\u0000¢\u0006\u0004\b8\u00109J^\u00105\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0007ø\u0001\u0000¢\u0006\u0004\b:\u0010;J^\u00105\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eø\u0001\u0000¢\u0006\u0004\b:\u0010<J\u0013\u0010=\u001a\u00020\u00052\b\u0010>\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\u0017\u0010?\u001a\u00020\u00002\b\u0010>\u001a\u0004\u0018\u00010\u0000H\u0001¢\u0006\u0002\b@J\b\u0010A\u001a\u00020BH\u0016J\u0010\u0010C\u001a\u00020\u00002\b\u0010>\u001a\u0004\u0018\u00010\u0000J\u0017\u0010D\u001a\u00020E2\b\b\u0002\u0010F\u001a\u00020\u0005H\u0000¢\u0006\u0002\bGJ\b\u0010H\u001a\u00020IH\u0016R\u001a\u0010\u0004\u001a\u00020\u00058FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0015\u0010\u0012\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0017R\u0019\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010 \u001a\u00020\u00038BX\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b!\u0010\u001eR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0014\u0010$\u001a\u00020\u000e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b%\u0010#R\u0019\u0010\b\u001a\u00020\tø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b&\u0010\u001eR\u001a\u0010'\u001a\u00020\t8@X\u0080\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b(\u0010\u001eR\u0014\u0010)\u001a\u00020\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b)\u0010\u0017R\u0019\u0010\u0006\u001a\u00020\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b*\u0010\u001eR\u001a\u0010+\u001a\u00020\u00078BX\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b,\u0010\u001eR\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u001a\u0010/\u001a\u00020\u00058FX\u0087\u0004¢\u0006\f\u0012\u0004\b0\u0010\u0015\u001a\u0004\b1\u0010\u0017R\u0015\u0010\f\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b2\u0010\u0019R\u0014\u00103\u001a\u00020\u00058@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b4\u0010\u0017\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006K"}, m13558d2 = {"Landroidx/compose/foundation/text/KeyboardOptions;", "", "capitalization", "Landroidx/compose/ui/text/input/KeyboardCapitalization;", "autoCorrect", "", "keyboardType", "Landroidx/compose/ui/text/input/KeyboardType;", "imeAction", "Landroidx/compose/ui/text/input/ImeAction;", "platformImeOptions", "Landroidx/compose/ui/text/input/PlatformImeOptions;", "showKeyboardOnFocus", "hintLocales", "Landroidx/compose/ui/text/intl/LocaleList;", "(IZIILandroidx/compose/ui/text/input/PlatformImeOptions;Ljava/lang/Boolean;Landroidx/compose/ui/text/intl/LocaleList;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "(IZIILkotlin/jvm/internal/DefaultConstructorMarker;)V", "(IZIILandroidx/compose/ui/text/input/PlatformImeOptions;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "autoCorrectEnabled", "(ILjava/lang/Boolean;IILandroidx/compose/ui/text/input/PlatformImeOptions;Ljava/lang/Boolean;Landroidx/compose/ui/text/intl/LocaleList;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getAutoCorrect$annotations", "()V", "getAutoCorrect", "()Z", "getAutoCorrectEnabled", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "autoCorrectOrDefault", "getAutoCorrectOrDefault", "getCapitalization-IUNYP9k", "()I", "I", "capitalizationOrDefault", "getCapitalizationOrDefault-IUNYP9k", "getHintLocales", "()Landroidx/compose/ui/text/intl/LocaleList;", "hintLocalesOrDefault", "getHintLocalesOrDefault", "getImeAction-eUduSuo", "imeActionOrDefault", "getImeActionOrDefault-eUduSuo$foundation_release", "isCompletelyUnspecified", "getKeyboardType-PjHm6EE", "keyboardTypeOrDefault", "getKeyboardTypeOrDefault-PjHm6EE", "getPlatformImeOptions", "()Landroidx/compose/ui/text/input/PlatformImeOptions;", "shouldShowKeyboardOnFocus", "getShouldShowKeyboardOnFocus$annotations", "getShouldShowKeyboardOnFocus", "getShowKeyboardOnFocus", "showKeyboardOnFocusOrDefault", "getShowKeyboardOnFocusOrDefault$foundation_release", "copy", "copy-3m2b7yw", "(IZII)Landroidx/compose/foundation/text/KeyboardOptions;", "copy-ij11fho", "(IZIILandroidx/compose/ui/text/input/PlatformImeOptions;)Landroidx/compose/foundation/text/KeyboardOptions;", "copy-INvB4aQ", "(IZIILandroidx/compose/ui/text/input/PlatformImeOptions;Ljava/lang/Boolean;Landroidx/compose/ui/text/intl/LocaleList;)Landroidx/compose/foundation/text/KeyboardOptions;", "(ILjava/lang/Boolean;IILandroidx/compose/ui/text/input/PlatformImeOptions;Ljava/lang/Boolean;Landroidx/compose/ui/text/intl/LocaleList;)Landroidx/compose/foundation/text/KeyboardOptions;", "equals", "other", "fillUnspecifiedValuesWith", "fillUnspecifiedValuesWith$foundation_release", "hashCode", "", "merge", "toImeOptions", "Landroidx/compose/ui/text/input/ImeOptions;", "singleLine", "toImeOptions$foundation_release", "toString", "", "Companion", "foundation_release"}, m13559k = 1, m13560mv = {1, 9, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nKeyboardOptions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KeyboardOptions.kt\nandroidx/compose/foundation/text/KeyboardOptions\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,395:1\n1#2:396\n*E\n"})
/* loaded from: classes.dex */
public final class KeyboardOptions {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final KeyboardOptions Default = new KeyboardOptions(0, (Boolean) null, 0, 0, (PlatformImeOptions) null, (Boolean) null, (LocaleList) null, 127, (DefaultConstructorMarker) null);
    private static final KeyboardOptions SecureTextField = new KeyboardOptions(0, Boolean.FALSE, KeyboardType.INSTANCE.m23265getPasswordPjHm6EE(), 0, (PlatformImeOptions) (0 == true ? 1 : 0), (Boolean) (0 == true ? 1 : 0), (LocaleList) null, 121, (DefaultConstructorMarker) null);
    private final Boolean autoCorrectEnabled;
    private final int capitalization;
    private final LocaleList hintLocales;
    private final int imeAction;
    private final int keyboardType;
    private final PlatformImeOptions platformImeOptions;
    private final Boolean showKeyboardOnFocus;

    @Metadata(m13557d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007R\u001c\u0010\b\u001a\u00020\u00048\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\t\u0010\u0002\u001a\u0004\b\n\u0010\u0007¨\u0006\u000b"}, m13558d2 = {"Landroidx/compose/foundation/text/KeyboardOptions$Companion;", "", "()V", "Default", "Landroidx/compose/foundation/text/KeyboardOptions;", "getDefault$annotations", "getDefault", "()Landroidx/compose/foundation/text/KeyboardOptions;", "SecureTextField", "getSecureTextField$foundation_release$annotations", "getSecureTextField$foundation_release", "foundation_release"}, m13559k = 1, m13560mv = {1, 9, 0}, m13562xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
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

    public /* synthetic */ KeyboardOptions(int i10, Boolean bool, int i11, int i12, PlatformImeOptions platformImeOptions, Boolean bool2, LocaleList localeList, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, bool, i11, i12, platformImeOptions, bool2, localeList);
    }

    /* renamed from: copy-3m2b7yw$default, reason: not valid java name */
    public static /* synthetic */ KeyboardOptions m18010copy3m2b7yw$default(KeyboardOptions keyboardOptions, int i10, boolean z9, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i10 = keyboardOptions.capitalization;
        }
        if ((i13 & 2) != 0) {
            z9 = keyboardOptions.getAutoCorrectOrDefault();
        }
        if ((i13 & 4) != 0) {
            i11 = keyboardOptions.keyboardType;
        }
        if ((i13 & 8) != 0) {
            i12 = keyboardOptions.imeAction;
        }
        return keyboardOptions.m18016copy3m2b7yw(i10, z9, i11, i12);
    }

    /* renamed from: copy-INvB4aQ$default, reason: not valid java name */
    public static /* synthetic */ KeyboardOptions m18011copyINvB4aQ$default(KeyboardOptions keyboardOptions, int i10, Boolean bool, int i11, int i12, PlatformImeOptions platformImeOptions, Boolean bool2, LocaleList localeList, int i13, Object obj) {
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
        return keyboardOptions2.m18017copyINvB4aQ(i16, bool4, i15, i14, platformImeOptions2, bool3, localeList2);
    }

    /* renamed from: copy-ij11fho$default, reason: not valid java name */
    public static /* synthetic */ KeyboardOptions m18013copyij11fho$default(KeyboardOptions keyboardOptions, int i10, boolean z9, int i11, int i12, PlatformImeOptions platformImeOptions, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i10 = keyboardOptions.capitalization;
        }
        if ((i13 & 2) != 0) {
            z9 = keyboardOptions.getAutoCorrectOrDefault();
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
        return keyboardOptions.m18019copyij11fho(i10, z9, i14, i12, platformImeOptions2);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Please use the autoCorrectEnabled property.")
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
    private final int m18014getCapitalizationOrDefaultIUNYP9k() {
        KeyboardCapitalization keyboardCapitalizationM23226boximpl = KeyboardCapitalization.m23226boximpl(this.capitalization);
        int value = keyboardCapitalizationM23226boximpl.getValue();
        KeyboardCapitalization.Companion companion = KeyboardCapitalization.INSTANCE;
        if (KeyboardCapitalization.m23229equalsimpl0(value, companion.m23241getUnspecifiedIUNYP9k())) {
            keyboardCapitalizationM23226boximpl = null;
        }
        return keyboardCapitalizationM23226boximpl != null ? keyboardCapitalizationM23226boximpl.getValue() : companion.m23239getNoneIUNYP9k();
    }

    private final LocaleList getHintLocalesOrDefault() {
        LocaleList localeList = this.hintLocales;
        return localeList == null ? LocaleList.INSTANCE.getEmpty() : localeList;
    }

    /* renamed from: getKeyboardTypeOrDefault-PjHm6EE, reason: not valid java name */
    private final int m18015getKeyboardTypeOrDefaultPjHm6EE() {
        KeyboardType keyboardTypeM23243boximpl = KeyboardType.m23243boximpl(this.keyboardType);
        int value = keyboardTypeM23243boximpl.getValue();
        KeyboardType.Companion companion = KeyboardType.INSTANCE;
        if (KeyboardType.m23246equalsimpl0(value, companion.m23268getUnspecifiedPjHm6EE())) {
            keyboardTypeM23243boximpl = null;
        }
        return keyboardTypeM23243boximpl != null ? keyboardTypeM23243boximpl.getValue() : companion.m23267getTextPjHm6EE();
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Included for binary compatibility. Use showKeyboardOnFocus.")
    public static /* synthetic */ void getShouldShowKeyboardOnFocus$annotations() {
    }

    private final boolean isCompletelyUnspecified() {
        return KeyboardCapitalization.m23229equalsimpl0(this.capitalization, KeyboardCapitalization.INSTANCE.m23241getUnspecifiedIUNYP9k()) && this.autoCorrectEnabled == null && KeyboardType.m23246equalsimpl0(this.keyboardType, KeyboardType.INSTANCE.m23268getUnspecifiedPjHm6EE()) && ImeAction.m23193equalsimpl0(this.imeAction, ImeAction.INSTANCE.m23214getUnspecifiedeUduSuo()) && this.platformImeOptions == null && this.showKeyboardOnFocus == null && this.hintLocales == null;
    }

    public static /* synthetic */ ImeOptions toImeOptions$foundation_release$default(KeyboardOptions keyboardOptions, boolean z9, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z9 = ImeOptions.INSTANCE.getDefault().getSingleLine();
        }
        return keyboardOptions.toImeOptions$foundation_release(z9);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Please use the new copy function that takes optional platformImeOptions parameter.")
    /* renamed from: copy-3m2b7yw, reason: not valid java name */
    public final /* synthetic */ KeyboardOptions m18016copy3m2b7yw(int capitalization, boolean autoCorrect, int keyboardType, int imeAction) {
        return new KeyboardOptions(capitalization, Boolean.valueOf(autoCorrect), keyboardType, imeAction, this.platformImeOptions, this.showKeyboardOnFocus, this.hintLocales, (DefaultConstructorMarker) null);
    }

    /* renamed from: copy-INvB4aQ, reason: not valid java name */
    public final KeyboardOptions m18017copyINvB4aQ(int capitalization, Boolean autoCorrectEnabled, int keyboardType, int imeAction, PlatformImeOptions platformImeOptions, Boolean showKeyboardOnFocus, LocaleList hintLocales) {
        return new KeyboardOptions(capitalization, autoCorrectEnabled, keyboardType, imeAction, platformImeOptions, showKeyboardOnFocus, hintLocales, (DefaultConstructorMarker) null);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility")
    /* renamed from: copy-ij11fho, reason: not valid java name */
    public final /* synthetic */ KeyboardOptions m18019copyij11fho(int capitalization, boolean autoCorrect, int keyboardType, int imeAction, PlatformImeOptions platformImeOptions) {
        return new KeyboardOptions(capitalization, Boolean.valueOf(autoCorrect), keyboardType, imeAction, platformImeOptions, this.showKeyboardOnFocus, this.hintLocales, (DefaultConstructorMarker) null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof KeyboardOptions)) {
            return false;
        }
        KeyboardOptions keyboardOptions = (KeyboardOptions) other;
        return KeyboardCapitalization.m23229equalsimpl0(this.capitalization, keyboardOptions.capitalization) && Intrinsics.areEqual(this.autoCorrectEnabled, keyboardOptions.autoCorrectEnabled) && KeyboardType.m23246equalsimpl0(this.keyboardType, keyboardOptions.keyboardType) && ImeAction.m23193equalsimpl0(this.imeAction, keyboardOptions.imeAction) && Intrinsics.areEqual(this.platformImeOptions, keyboardOptions.platformImeOptions) && Intrinsics.areEqual(this.showKeyboardOnFocus, keyboardOptions.showKeyboardOnFocus) && Intrinsics.areEqual(this.hintLocales, keyboardOptions.hintLocales);
    }

    @Stable
    public final KeyboardOptions fillUnspecifiedValuesWith$foundation_release(KeyboardOptions other) {
        if (other == null || other.isCompletelyUnspecified() || Intrinsics.areEqual(other, this)) {
            return this;
        }
        if (isCompletelyUnspecified()) {
            return other;
        }
        KeyboardCapitalization keyboardCapitalizationM23226boximpl = KeyboardCapitalization.m23226boximpl(this.capitalization);
        if (KeyboardCapitalization.m23229equalsimpl0(keyboardCapitalizationM23226boximpl.getValue(), KeyboardCapitalization.INSTANCE.m23241getUnspecifiedIUNYP9k())) {
            keyboardCapitalizationM23226boximpl = null;
        }
        int value = keyboardCapitalizationM23226boximpl != null ? keyboardCapitalizationM23226boximpl.getValue() : other.capitalization;
        Boolean bool = this.autoCorrectEnabled;
        if (bool == null) {
            bool = other.autoCorrectEnabled;
        }
        Boolean bool2 = bool;
        KeyboardType keyboardTypeM23243boximpl = KeyboardType.m23243boximpl(this.keyboardType);
        if (KeyboardType.m23246equalsimpl0(keyboardTypeM23243boximpl.getValue(), KeyboardType.INSTANCE.m23268getUnspecifiedPjHm6EE())) {
            keyboardTypeM23243boximpl = null;
        }
        int value2 = keyboardTypeM23243boximpl != null ? keyboardTypeM23243boximpl.getValue() : other.keyboardType;
        ImeAction imeActionM23190boximpl = ImeAction.m23190boximpl(this.imeAction);
        ImeAction imeAction = ImeAction.m23193equalsimpl0(imeActionM23190boximpl.getValue(), ImeAction.INSTANCE.m23214getUnspecifiedeUduSuo()) ? null : imeActionM23190boximpl;
        int value3 = imeAction != null ? imeAction.getValue() : other.imeAction;
        PlatformImeOptions platformImeOptions = this.platformImeOptions;
        if (platformImeOptions == null) {
            platformImeOptions = other.platformImeOptions;
        }
        PlatformImeOptions platformImeOptions2 = platformImeOptions;
        Boolean bool3 = this.showKeyboardOnFocus;
        if (bool3 == null) {
            bool3 = other.showKeyboardOnFocus;
        }
        Boolean bool4 = bool3;
        LocaleList localeList = this.hintLocales;
        if (localeList == null) {
            localeList = other.hintLocales;
        }
        return new KeyboardOptions(value, bool2, value2, value3, platformImeOptions2, bool4, localeList, (DefaultConstructorMarker) null);
    }

    public final boolean getAutoCorrect() {
        return getAutoCorrectOrDefault();
    }

    public final Boolean getAutoCorrectEnabled() {
        return this.autoCorrectEnabled;
    }

    /* renamed from: getCapitalization-IUNYP9k, reason: not valid java name and from getter */
    public final int getCapitalization() {
        return this.capitalization;
    }

    public final LocaleList getHintLocales() {
        return this.hintLocales;
    }

    /* renamed from: getImeAction-eUduSuo, reason: not valid java name and from getter */
    public final int getImeAction() {
        return this.imeAction;
    }

    /* renamed from: getImeActionOrDefault-eUduSuo$foundation_release, reason: not valid java name */
    public final int m18022getImeActionOrDefaulteUduSuo$foundation_release() {
        ImeAction imeActionM23190boximpl = ImeAction.m23190boximpl(this.imeAction);
        int value = imeActionM23190boximpl.getValue();
        ImeAction.Companion companion = ImeAction.INSTANCE;
        if (ImeAction.m23193equalsimpl0(value, companion.m23214getUnspecifiedeUduSuo())) {
            imeActionM23190boximpl = null;
        }
        return imeActionM23190boximpl != null ? imeActionM23190boximpl.getValue() : companion.m23206getDefaulteUduSuo();
    }

    /* renamed from: getKeyboardType-PjHm6EE, reason: not valid java name and from getter */
    public final int getKeyboardType() {
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
        int iM23230hashCodeimpl = KeyboardCapitalization.m23230hashCodeimpl(this.capitalization) * 31;
        Boolean bool = this.autoCorrectEnabled;
        int iHashCode = (((((iM23230hashCodeimpl + (bool != null ? bool.hashCode() : 0)) * 31) + KeyboardType.m23247hashCodeimpl(this.keyboardType)) * 31) + ImeAction.m23194hashCodeimpl(this.imeAction)) * 31;
        PlatformImeOptions platformImeOptions = this.platformImeOptions;
        int iHashCode2 = (iHashCode + (platformImeOptions != null ? platformImeOptions.hashCode() : 0)) * 31;
        Boolean bool2 = this.showKeyboardOnFocus;
        int iHashCode3 = (iHashCode2 + (bool2 != null ? bool2.hashCode() : 0)) * 31;
        LocaleList localeList = this.hintLocales;
        return iHashCode3 + (localeList != null ? localeList.hashCode() : 0);
    }

    public final KeyboardOptions merge(KeyboardOptions other) {
        KeyboardOptions keyboardOptionsFillUnspecifiedValuesWith$foundation_release;
        return (other == null || (keyboardOptionsFillUnspecifiedValuesWith$foundation_release = other.fillUnspecifiedValuesWith$foundation_release(this)) == null) ? this : keyboardOptionsFillUnspecifiedValuesWith$foundation_release;
    }

    public final ImeOptions toImeOptions$foundation_release(boolean singleLine) {
        return new ImeOptions(singleLine, m18014getCapitalizationOrDefaultIUNYP9k(), getAutoCorrectOrDefault(), m18015getKeyboardTypeOrDefaultPjHm6EE(), m18022getImeActionOrDefaulteUduSuo$foundation_release(), this.platformImeOptions, getHintLocalesOrDefault(), (DefaultConstructorMarker) null);
    }

    public String toString() {
        return "KeyboardOptions(capitalization=" + ((Object) KeyboardCapitalization.m23231toStringimpl(this.capitalization)) + ", autoCorrectEnabled=" + this.autoCorrectEnabled + ", keyboardType=" + ((Object) KeyboardType.m23248toStringimpl(this.keyboardType)) + ", imeAction=" + ((Object) ImeAction.m23195toStringimpl(this.imeAction)) + ", platformImeOptions=" + this.platformImeOptions + "showKeyboardOnFocus=" + this.showKeyboardOnFocus + ", hintLocales=" + this.hintLocales + ')';
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Please use the new constructor that takes optional autoCorrectEnabled parameter.", replaceWith = @ReplaceWith(expression = "KeyboardOptions(capitalization = capitalization, autoCorrectEnabled = autoCorrect, keyboardType = keyboardType, imeAction = imeAction,platformImeOptions = platformImeOptions, showKeyboardOnFocus = showKeyboardOnFocus,hintLocales = hintLocales)", imports = {}))
    public /* synthetic */ KeyboardOptions(int i10, boolean z9, int i11, int i12, PlatformImeOptions platformImeOptions, Boolean bool, LocaleList localeList, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, z9, i11, i12, platformImeOptions, bool, localeList);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Please use the copy function that takes an autoCorrectEnabled parameter.", replaceWith = @ReplaceWith(expression = "copy(capitalization = capitalization, autoCorrectEnabled = autoCorrect, keyboardType = keyboardType, imeAction = imeAction,platformImeOptions = platformImeOptions, showKeyboardOnFocus = showKeyboardOnFocus ?: true,hintLocales = hintLocales)", imports = {}))
    /* renamed from: copy-INvB4aQ, reason: not valid java name */
    public final /* synthetic */ KeyboardOptions m18018copyINvB4aQ(int capitalization, boolean autoCorrect, int keyboardType, int imeAction, PlatformImeOptions platformImeOptions, Boolean showKeyboardOnFocus, LocaleList hintLocales) {
        return new KeyboardOptions(capitalization, Boolean.valueOf(autoCorrect), keyboardType, imeAction, platformImeOptions, showKeyboardOnFocus, hintLocales, (DefaultConstructorMarker) null);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compat")
    public /* synthetic */ KeyboardOptions(int i10, boolean z9, int i11, int i12, PlatformImeOptions platformImeOptions, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, z9, i11, i12, platformImeOptions);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Please use the new constructor that takes optional platformImeOptions parameter.")
    public /* synthetic */ KeyboardOptions(int i10, boolean z9, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, z9, i11, i12);
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
    public static /* synthetic */ KeyboardOptions m18012copyINvB4aQ$default(KeyboardOptions keyboardOptions, int i10, boolean z9, int i11, int i12, PlatformImeOptions platformImeOptions, Boolean bool, LocaleList localeList, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i10 = keyboardOptions.capitalization;
        }
        if ((i13 & 2) != 0) {
            z9 = keyboardOptions.getAutoCorrectOrDefault();
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
        return keyboardOptions.m18018copyINvB4aQ(i10, z9, i14, i12, platformImeOptions2, bool2, localeList2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ KeyboardOptions(int i10, Boolean bool, int i11, int i12, PlatformImeOptions platformImeOptions, Boolean bool2, LocaleList localeList, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        int iM23241getUnspecifiedIUNYP9k = (i13 & 1) != 0 ? KeyboardCapitalization.INSTANCE.m23241getUnspecifiedIUNYP9k() : i10;
        Boolean bool3 = (i13 & 2) != 0 ? null : bool;
        int iM23268getUnspecifiedPjHm6EE = (i13 & 4) != 0 ? KeyboardType.INSTANCE.m23268getUnspecifiedPjHm6EE() : i11;
        int iM23214getUnspecifiedeUduSuo = (i13 & 8) != 0 ? ImeAction.INSTANCE.m23214getUnspecifiedeUduSuo() : i12;
        PlatformImeOptions platformImeOptions2 = (i13 & 16) != 0 ? null : platformImeOptions;
        Boolean bool4 = (i13 & 32) != 0 ? null : bool2;
        this(iM23241getUnspecifiedIUNYP9k, bool3, iM23268getUnspecifiedPjHm6EE, iM23214getUnspecifiedeUduSuo, platformImeOptions2, bool4, (i13 & 64) == 0 ? localeList : null, (DefaultConstructorMarker) null);
    }

    public /* synthetic */ KeyboardOptions(int i10, boolean z9, int i11, int i12, PlatformImeOptions platformImeOptions, Boolean bool, LocaleList localeList, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? KeyboardCapitalization.INSTANCE.m23241getUnspecifiedIUNYP9k() : i10, z9, (i13 & 4) != 0 ? KeyboardType.INSTANCE.m23268getUnspecifiedPjHm6EE() : i11, (i13 & 8) != 0 ? ImeAction.INSTANCE.m23214getUnspecifiedeUduSuo() : i12, (i13 & 16) != 0 ? null : platformImeOptions, (i13 & 32) != 0 ? null : bool, (i13 & 64) != 0 ? null : localeList, (DefaultConstructorMarker) null);
    }

    private KeyboardOptions(int i10, boolean z9, int i11, int i12, PlatformImeOptions platformImeOptions, Boolean bool, LocaleList localeList) {
        this(i10, Boolean.valueOf(z9), i11, i12, platformImeOptions, bool, localeList, (DefaultConstructorMarker) null);
    }

    public /* synthetic */ KeyboardOptions(int i10, boolean z9, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? KeyboardCapitalization.INSTANCE.m23241getUnspecifiedIUNYP9k() : i10, (i13 & 2) != 0 ? Default.getAutoCorrectOrDefault() : z9, (i13 & 4) != 0 ? KeyboardType.INSTANCE.m23268getUnspecifiedPjHm6EE() : i11, (i13 & 8) != 0 ? ImeAction.INSTANCE.m23206getDefaulteUduSuo() : i12, (DefaultConstructorMarker) null);
    }

    private KeyboardOptions(int i10, boolean z9, int i11, int i12) {
        this(i10, Boolean.valueOf(z9), i11, i12, (PlatformImeOptions) null, (Boolean) null, (LocaleList) null, 96, (DefaultConstructorMarker) null);
    }

    public /* synthetic */ KeyboardOptions(int i10, boolean z9, int i11, int i12, PlatformImeOptions platformImeOptions, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? KeyboardCapitalization.INSTANCE.m23239getNoneIUNYP9k() : i10, (i13 & 2) != 0 ? Default.getAutoCorrectOrDefault() : z9, (i13 & 4) != 0 ? KeyboardType.INSTANCE.m23267getTextPjHm6EE() : i11, (i13 & 8) != 0 ? ImeAction.INSTANCE.m23206getDefaulteUduSuo() : i12, (i13 & 16) != 0 ? null : platformImeOptions, (DefaultConstructorMarker) null);
    }

    private KeyboardOptions(int i10, boolean z9, int i11, int i12, PlatformImeOptions platformImeOptions) {
        this(i10, Boolean.valueOf(z9), i11, i12, platformImeOptions, Boolean.valueOf(Default.getShowKeyboardOnFocusOrDefault$foundation_release()), (LocaleList) null, 64, (DefaultConstructorMarker) null);
    }
}
