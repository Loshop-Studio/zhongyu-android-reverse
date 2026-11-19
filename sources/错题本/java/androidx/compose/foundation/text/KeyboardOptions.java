package androidx.compose.foundation.text;

import androidx.compose.p011ui.text.input.ImeAction;
import androidx.compose.p011ui.text.input.ImeOptions;
import androidx.compose.p011ui.text.input.KeyboardCapitalization;
import androidx.compose.p011ui.text.input.KeyboardType;
import androidx.compose.p011ui.text.input.PlatformImeOptions;
import androidx.compose.p011ui.text.intl.LocaleList;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Immutable
@Metadata(m5109d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b*\b\u0007\u0018\u0000 Q2\u00020\u0001:\u0001QBU\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010BS\b\u0017\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0012B1\b\u0017\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\u0013B=\b\u0017\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000f\u0010\u0014J\u0019\u0010\u0019\u001a\u00020\u00162\b\b\u0002\u0010\u0015\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0017\u0010\u0018J^\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ^\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0007ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001dJF\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0007ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ:\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0007ø\u0001\u0000¢\u0006\u0004\b \u0010!J\u001a\u0010#\u001a\u00020\u00042\b\u0010\"\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b#\u0010$J\u000f\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b)\u0010*J\u0017\u0010+\u001a\u00020\u00002\b\u0010\"\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b+\u0010,J\u0019\u0010.\u001a\u00020\u00002\b\u0010\"\u001a\u0004\u0018\u00010\u0000H\u0001¢\u0006\u0004\b-\u0010,R\u001d\u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0003\u0010/\u001a\u0004\b0\u0010'R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00101\u001a\u0004\b2\u00103R\u001d\u0010\u0007\u001a\u00020\u00068\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0007\u0010/\u001a\u0004\b4\u0010'R\u001d\u0010\t\u001a\u00020\b8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\t\u0010/\u001a\u0004\b5\u0010'R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u00106\u001a\u0004\b7\u00108R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\f\u00101\u001a\u0004\b9\u00103R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010:\u001a\u0004\b;\u0010<R\u001a\u0010\u0011\u001a\u00020\u00048FX\u0087\u0004¢\u0006\f\u0012\u0004\b?\u0010@\u001a\u0004\b=\u0010>R\u001a\u0010C\u001a\u00020\u00048FX\u0087\u0004¢\u0006\f\u0012\u0004\bB\u0010@\u001a\u0004\bA\u0010>R\u001a\u0010E\u001a\u00020\b8@X\u0080\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bD\u0010'R\u0014\u0010G\u001a\u00020\u00048@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bF\u0010>R\u0014\u0010I\u001a\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bH\u0010>R\u001a\u0010K\u001a\u00020\u00028BX\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bJ\u0010'R\u001a\u0010M\u001a\u00020\u00068BX\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bL\u0010'R\u0014\u0010O\u001a\u00020\r8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bN\u0010<R\u0014\u0010P\u001a\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bP\u0010>\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006R"}, m5110d2 = {"Landroidx/compose/foundation/text/KeyboardOptions;", "", "Landroidx/compose/ui/text/input/KeyboardCapitalization;", "capitalization", "", "autoCorrectEnabled", "Landroidx/compose/ui/text/input/KeyboardType;", "keyboardType", "Landroidx/compose/ui/text/input/ImeAction;", "imeAction", "Landroidx/compose/ui/text/input/PlatformImeOptions;", "platformImeOptions", "showKeyboardOnFocus", "Landroidx/compose/ui/text/intl/LocaleList;", "hintLocales", "<init>", "(ILjava/lang/Boolean;IILandroidx/compose/ui/text/input/PlatformImeOptions;Ljava/lang/Boolean;Landroidx/compose/ui/text/intl/LocaleList;Lkotlin/jvm/internal/e;)V", "autoCorrect", "(IZIILandroidx/compose/ui/text/input/PlatformImeOptions;Ljava/lang/Boolean;Landroidx/compose/ui/text/intl/LocaleList;Lkotlin/jvm/internal/e;)V", "(IZIILkotlin/jvm/internal/e;)V", "(IZIILandroidx/compose/ui/text/input/PlatformImeOptions;Lkotlin/jvm/internal/e;)V", "singleLine", "Landroidx/compose/ui/text/input/ImeOptions;", "toImeOptions$foundation_release", "(Z)Landroidx/compose/ui/text/input/ImeOptions;", "toImeOptions", "copy-INvB4aQ", "(ILjava/lang/Boolean;IILandroidx/compose/ui/text/input/PlatformImeOptions;Ljava/lang/Boolean;Landroidx/compose/ui/text/intl/LocaleList;)Landroidx/compose/foundation/text/KeyboardOptions;", "copy", "(IZIILandroidx/compose/ui/text/input/PlatformImeOptions;Ljava/lang/Boolean;Landroidx/compose/ui/text/intl/LocaleList;)Landroidx/compose/foundation/text/KeyboardOptions;", "copy-ij11fho", "(IZIILandroidx/compose/ui/text/input/PlatformImeOptions;)Landroidx/compose/foundation/text/KeyboardOptions;", "copy-3m2b7yw", "(IZII)Landroidx/compose/foundation/text/KeyboardOptions;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "merge", "(Landroidx/compose/foundation/text/KeyboardOptions;)Landroidx/compose/foundation/text/KeyboardOptions;", "fillUnspecifiedValuesWith$foundation_release", "fillUnspecifiedValuesWith", "I", "getCapitalization-IUNYP9k", "Ljava/lang/Boolean;", "getAutoCorrectEnabled", "()Ljava/lang/Boolean;", "getKeyboardType-PjHm6EE", "getImeAction-eUduSuo", "Landroidx/compose/ui/text/input/PlatformImeOptions;", "getPlatformImeOptions", "()Landroidx/compose/ui/text/input/PlatformImeOptions;", "getShowKeyboardOnFocus", "Landroidx/compose/ui/text/intl/LocaleList;", "getHintLocales", "()Landroidx/compose/ui/text/intl/LocaleList;", "getAutoCorrect", "()Z", "getAutoCorrect$annotations", "()V", "getShouldShowKeyboardOnFocus", "getShouldShowKeyboardOnFocus$annotations", "shouldShowKeyboardOnFocus", "getImeActionOrDefault-eUduSuo$foundation_release", "imeActionOrDefault", "getShowKeyboardOnFocusOrDefault$foundation_release", "showKeyboardOnFocusOrDefault", "getAutoCorrectOrDefault", "autoCorrectOrDefault", "getCapitalizationOrDefault-IUNYP9k", "capitalizationOrDefault", "getKeyboardTypeOrDefault-PjHm6EE", "keyboardTypeOrDefault", "getHintLocalesOrDefault", "hintLocalesOrDefault", "isCompletelyUnspecified", "Companion", "foundation_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nKeyboardOptions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KeyboardOptions.kt\nandroidx/compose/foundation/text/KeyboardOptions\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,395:1\n1#2:396\n*E\n"})
/* loaded from: classes.dex */
public final class KeyboardOptions {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final KeyboardOptions Default = new KeyboardOptions(0, (Boolean) null, 0, 0, (PlatformImeOptions) null, (Boolean) null, (LocaleList) null, 127, (AbstractC5824e) null);

    @NotNull
    private static final KeyboardOptions SecureTextField = new KeyboardOptions(0, Boolean.FALSE, KeyboardType.INSTANCE.m13008getPasswordPjHm6EE(), 0, (PlatformImeOptions) (0 == true ? 1 : 0), (Boolean) (0 == true ? 1 : 0), (LocaleList) null, 121, (AbstractC5824e) null);

    @Nullable
    private final Boolean autoCorrectEnabled;
    private final int capitalization;

    @Nullable
    private final LocaleList hintLocales;
    private final int imeAction;
    private final int keyboardType;

    @Nullable
    private final PlatformImeOptions platformImeOptions;

    @Nullable
    private final Boolean showKeyboardOnFocus;

    @Metadata(m5109d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007R\u001c\u0010\b\u001a\u00020\u00048\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\t\u0010\u0002\u001a\u0004\b\n\u0010\u0007¨\u0006\u000b"}, m5110d2 = {"Landroidx/compose/foundation/text/KeyboardOptions$Companion;", "", "()V", "Default", "Landroidx/compose/foundation/text/KeyboardOptions;", "getDefault$annotations", "getDefault", "()Landroidx/compose/foundation/text/KeyboardOptions;", "SecureTextField", "getSecureTextField$foundation_release$annotations", "getSecureTextField$foundation_release", "foundation_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC5824e abstractC5824e) {
            this();
        }

        @Stable
        public static /* synthetic */ void getDefault$annotations() {
        }

        @Stable
        public static /* synthetic */ void getSecureTextField$foundation_release$annotations() {
        }

        @NotNull
        public final KeyboardOptions getDefault() {
            return KeyboardOptions.Default;
        }

        @NotNull
        public final KeyboardOptions getSecureTextField$foundation_release() {
            return KeyboardOptions.SecureTextField;
        }

        private Companion() {
        }
    }

    public /* synthetic */ KeyboardOptions(int i, Boolean bool, int i8, int i9, PlatformImeOptions platformImeOptions, Boolean bool2, LocaleList localeList, AbstractC5824e abstractC5824e) {
        this(i, bool, i8, i9, platformImeOptions, bool2, localeList);
    }

    /* renamed from: copy-3m2b7yw$default, reason: not valid java name */
    public static /* synthetic */ KeyboardOptions m7610copy3m2b7yw$default(KeyboardOptions keyboardOptions, int i, boolean z8, int i8, int i9, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i = keyboardOptions.capitalization;
        }
        if ((i10 & 2) != 0) {
            z8 = keyboardOptions.getAutoCorrectOrDefault();
        }
        if ((i10 & 4) != 0) {
            i8 = keyboardOptions.keyboardType;
        }
        if ((i10 & 8) != 0) {
            i9 = keyboardOptions.imeAction;
        }
        return keyboardOptions.m7616copy3m2b7yw(i, z8, i8, i9);
    }

    /* renamed from: copy-INvB4aQ$default, reason: not valid java name */
    public static /* synthetic */ KeyboardOptions m7611copyINvB4aQ$default(KeyboardOptions keyboardOptions, int i, Boolean bool, int i8, int i9, PlatformImeOptions platformImeOptions, Boolean bool2, LocaleList localeList, int i10, Object obj) {
        LocaleList localeList2;
        Boolean bool3;
        int i11;
        PlatformImeOptions platformImeOptions2;
        Boolean bool4;
        int i12;
        KeyboardOptions keyboardOptions2;
        int i13;
        if ((i10 & 1) != 0) {
            i = keyboardOptions.capitalization;
        }
        if ((i10 & 2) != 0) {
            bool = keyboardOptions.autoCorrectEnabled;
        }
        if ((i10 & 4) != 0) {
            i8 = keyboardOptions.keyboardType;
        }
        if ((i10 & 8) != 0) {
            i9 = keyboardOptions.imeAction;
        }
        if ((i10 & 16) != 0) {
            platformImeOptions = keyboardOptions.platformImeOptions;
        }
        if ((i10 & 32) != 0) {
            bool2 = null;
        }
        if ((i10 & 64) != 0) {
            localeList2 = null;
            platformImeOptions2 = platformImeOptions;
            bool3 = bool2;
            i12 = i8;
            i11 = i9;
            i13 = i;
            bool4 = bool;
            keyboardOptions2 = keyboardOptions;
        } else {
            localeList2 = localeList;
            bool3 = bool2;
            i11 = i9;
            platformImeOptions2 = platformImeOptions;
            bool4 = bool;
            i12 = i8;
            keyboardOptions2 = keyboardOptions;
            i13 = i;
        }
        return keyboardOptions2.m7617copyINvB4aQ(i13, bool4, i12, i11, platformImeOptions2, bool3, localeList2);
    }

    /* renamed from: copy-ij11fho$default, reason: not valid java name */
    public static /* synthetic */ KeyboardOptions m7613copyij11fho$default(KeyboardOptions keyboardOptions, int i, boolean z8, int i8, int i9, PlatformImeOptions platformImeOptions, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i = keyboardOptions.capitalization;
        }
        if ((i10 & 2) != 0) {
            z8 = keyboardOptions.getAutoCorrectOrDefault();
        }
        if ((i10 & 4) != 0) {
            i8 = keyboardOptions.keyboardType;
        }
        if ((i10 & 8) != 0) {
            i9 = keyboardOptions.imeAction;
        }
        if ((i10 & 16) != 0) {
            platformImeOptions = keyboardOptions.platformImeOptions;
        }
        PlatformImeOptions platformImeOptions2 = platformImeOptions;
        int i11 = i8;
        return keyboardOptions.m7619copyij11fho(i, z8, i11, i9, platformImeOptions2);
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
    private final int m7614getCapitalizationOrDefaultIUNYP9k() {
        KeyboardCapitalization keyboardCapitalizationM12969boximpl = KeyboardCapitalization.m12969boximpl(this.capitalization);
        int value = keyboardCapitalizationM12969boximpl.getValue();
        KeyboardCapitalization.Companion companion = KeyboardCapitalization.INSTANCE;
        if (KeyboardCapitalization.m12972equalsimpl0(value, companion.m12984getUnspecifiedIUNYP9k())) {
            keyboardCapitalizationM12969boximpl = null;
        }
        return keyboardCapitalizationM12969boximpl != null ? keyboardCapitalizationM12969boximpl.getValue() : companion.m12982getNoneIUNYP9k();
    }

    private final LocaleList getHintLocalesOrDefault() {
        LocaleList localeList = this.hintLocales;
        return localeList == null ? LocaleList.INSTANCE.getEmpty() : localeList;
    }

    /* renamed from: getKeyboardTypeOrDefault-PjHm6EE, reason: not valid java name */
    private final int m7615getKeyboardTypeOrDefaultPjHm6EE() {
        KeyboardType keyboardTypeM12986boximpl = KeyboardType.m12986boximpl(this.keyboardType);
        int value = keyboardTypeM12986boximpl.getValue();
        KeyboardType.Companion companion = KeyboardType.INSTANCE;
        if (KeyboardType.m12989equalsimpl0(value, companion.m13011getUnspecifiedPjHm6EE())) {
            keyboardTypeM12986boximpl = null;
        }
        return keyboardTypeM12986boximpl != null ? keyboardTypeM12986boximpl.getValue() : companion.m13010getTextPjHm6EE();
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Included for binary compatibility. Use showKeyboardOnFocus.")
    public static /* synthetic */ void getShouldShowKeyboardOnFocus$annotations() {
    }

    private final boolean isCompletelyUnspecified() {
        return KeyboardCapitalization.m12972equalsimpl0(this.capitalization, KeyboardCapitalization.INSTANCE.m12984getUnspecifiedIUNYP9k()) && this.autoCorrectEnabled == null && KeyboardType.m12989equalsimpl0(this.keyboardType, KeyboardType.INSTANCE.m13011getUnspecifiedPjHm6EE()) && ImeAction.m12936equalsimpl0(this.imeAction, ImeAction.INSTANCE.m12957getUnspecifiedeUduSuo()) && this.platformImeOptions == null && this.showKeyboardOnFocus == null && this.hintLocales == null;
    }

    public static /* synthetic */ ImeOptions toImeOptions$foundation_release$default(KeyboardOptions keyboardOptions, boolean z8, int i, Object obj) {
        if ((i & 1) != 0) {
            z8 = ImeOptions.INSTANCE.getDefault().getSingleLine();
        }
        return keyboardOptions.toImeOptions$foundation_release(z8);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Please use the new copy function that takes optional platformImeOptions parameter.")
    /* renamed from: copy-3m2b7yw, reason: not valid java name */
    public final /* synthetic */ KeyboardOptions m7616copy3m2b7yw(int capitalization, boolean autoCorrect, int keyboardType, int imeAction) {
        return new KeyboardOptions(capitalization, Boolean.valueOf(autoCorrect), keyboardType, imeAction, this.platformImeOptions, this.showKeyboardOnFocus, this.hintLocales, (AbstractC5824e) null);
    }

    @NotNull
    /* renamed from: copy-INvB4aQ, reason: not valid java name */
    public final KeyboardOptions m7617copyINvB4aQ(int capitalization, @Nullable Boolean autoCorrectEnabled, int keyboardType, int imeAction, @Nullable PlatformImeOptions platformImeOptions, @Nullable Boolean showKeyboardOnFocus, @Nullable LocaleList hintLocales) {
        return new KeyboardOptions(capitalization, autoCorrectEnabled, keyboardType, imeAction, platformImeOptions, showKeyboardOnFocus, hintLocales, (AbstractC5824e) null);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility")
    /* renamed from: copy-ij11fho, reason: not valid java name */
    public final /* synthetic */ KeyboardOptions m7619copyij11fho(int capitalization, boolean autoCorrect, int keyboardType, int imeAction, PlatformImeOptions platformImeOptions) {
        return new KeyboardOptions(capitalization, Boolean.valueOf(autoCorrect), keyboardType, imeAction, platformImeOptions, this.showKeyboardOnFocus, this.hintLocales, (AbstractC5824e) null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof KeyboardOptions)) {
            return false;
        }
        KeyboardOptions keyboardOptions = (KeyboardOptions) other;
        return KeyboardCapitalization.m12972equalsimpl0(this.capitalization, keyboardOptions.capitalization) && AbstractC5830k.m5325b(this.autoCorrectEnabled, keyboardOptions.autoCorrectEnabled) && KeyboardType.m12989equalsimpl0(this.keyboardType, keyboardOptions.keyboardType) && ImeAction.m12936equalsimpl0(this.imeAction, keyboardOptions.imeAction) && AbstractC5830k.m5325b(this.platformImeOptions, keyboardOptions.platformImeOptions) && AbstractC5830k.m5325b(this.showKeyboardOnFocus, keyboardOptions.showKeyboardOnFocus) && AbstractC5830k.m5325b(this.hintLocales, keyboardOptions.hintLocales);
    }

    @Stable
    @NotNull
    public final KeyboardOptions fillUnspecifiedValuesWith$foundation_release(@Nullable KeyboardOptions other) {
        if (other == null || other.isCompletelyUnspecified() || other.equals(this)) {
            return this;
        }
        if (isCompletelyUnspecified()) {
            return other;
        }
        KeyboardCapitalization keyboardCapitalizationM12969boximpl = KeyboardCapitalization.m12969boximpl(this.capitalization);
        if (KeyboardCapitalization.m12972equalsimpl0(keyboardCapitalizationM12969boximpl.getValue(), KeyboardCapitalization.INSTANCE.m12984getUnspecifiedIUNYP9k())) {
            keyboardCapitalizationM12969boximpl = null;
        }
        int value = keyboardCapitalizationM12969boximpl != null ? keyboardCapitalizationM12969boximpl.getValue() : other.capitalization;
        Boolean bool = this.autoCorrectEnabled;
        if (bool == null) {
            bool = other.autoCorrectEnabled;
        }
        Boolean bool2 = bool;
        KeyboardType keyboardTypeM12986boximpl = KeyboardType.m12986boximpl(this.keyboardType);
        if (KeyboardType.m12989equalsimpl0(keyboardTypeM12986boximpl.getValue(), KeyboardType.INSTANCE.m13011getUnspecifiedPjHm6EE())) {
            keyboardTypeM12986boximpl = null;
        }
        int value2 = keyboardTypeM12986boximpl != null ? keyboardTypeM12986boximpl.getValue() : other.keyboardType;
        ImeAction imeActionM12933boximpl = ImeAction.m12933boximpl(this.imeAction);
        ImeAction imeAction = ImeAction.m12936equalsimpl0(imeActionM12933boximpl.getValue(), ImeAction.INSTANCE.m12957getUnspecifiedeUduSuo()) ? null : imeActionM12933boximpl;
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
        return new KeyboardOptions(value, bool2, value2, value3, platformImeOptions2, bool4, localeList, (AbstractC5824e) null);
    }

    public final boolean getAutoCorrect() {
        return getAutoCorrectOrDefault();
    }

    @Nullable
    public final Boolean getAutoCorrectEnabled() {
        return this.autoCorrectEnabled;
    }

    /* renamed from: getCapitalization-IUNYP9k, reason: not valid java name and from getter */
    public final int getCapitalization() {
        return this.capitalization;
    }

    @Nullable
    public final LocaleList getHintLocales() {
        return this.hintLocales;
    }

    /* renamed from: getImeAction-eUduSuo, reason: not valid java name and from getter */
    public final int getImeAction() {
        return this.imeAction;
    }

    /* renamed from: getImeActionOrDefault-eUduSuo$foundation_release, reason: not valid java name */
    public final int m7622getImeActionOrDefaulteUduSuo$foundation_release() {
        ImeAction imeActionM12933boximpl = ImeAction.m12933boximpl(this.imeAction);
        int value = imeActionM12933boximpl.getValue();
        ImeAction.Companion companion = ImeAction.INSTANCE;
        if (ImeAction.m12936equalsimpl0(value, companion.m12957getUnspecifiedeUduSuo())) {
            imeActionM12933boximpl = null;
        }
        return imeActionM12933boximpl != null ? imeActionM12933boximpl.getValue() : companion.m12949getDefaulteUduSuo();
    }

    /* renamed from: getKeyboardType-PjHm6EE, reason: not valid java name and from getter */
    public final int getKeyboardType() {
        return this.keyboardType;
    }

    @Nullable
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

    @Nullable
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
        int iM12973hashCodeimpl = KeyboardCapitalization.m12973hashCodeimpl(this.capitalization) * 31;
        Boolean bool = this.autoCorrectEnabled;
        int iM12937hashCodeimpl = (ImeAction.m12937hashCodeimpl(this.imeAction) + ((KeyboardType.m12990hashCodeimpl(this.keyboardType) + ((iM12973hashCodeimpl + (bool != null ? bool.hashCode() : 0)) * 31)) * 31)) * 31;
        PlatformImeOptions platformImeOptions = this.platformImeOptions;
        int iHashCode = (iM12937hashCodeimpl + (platformImeOptions != null ? platformImeOptions.hashCode() : 0)) * 31;
        Boolean bool2 = this.showKeyboardOnFocus;
        int iHashCode2 = (iHashCode + (bool2 != null ? bool2.hashCode() : 0)) * 31;
        LocaleList localeList = this.hintLocales;
        return iHashCode2 + (localeList != null ? localeList.hashCode() : 0);
    }

    @NotNull
    public final KeyboardOptions merge(@Nullable KeyboardOptions other) {
        KeyboardOptions keyboardOptionsFillUnspecifiedValuesWith$foundation_release;
        return (other == null || (keyboardOptionsFillUnspecifiedValuesWith$foundation_release = other.fillUnspecifiedValuesWith$foundation_release(this)) == null) ? this : keyboardOptionsFillUnspecifiedValuesWith$foundation_release;
    }

    @NotNull
    public final ImeOptions toImeOptions$foundation_release(boolean singleLine) {
        return new ImeOptions(singleLine, m7614getCapitalizationOrDefaultIUNYP9k(), getAutoCorrectOrDefault(), m7615getKeyboardTypeOrDefaultPjHm6EE(), m7622getImeActionOrDefaulteUduSuo$foundation_release(), this.platformImeOptions, getHintLocalesOrDefault(), (AbstractC5824e) null);
    }

    @NotNull
    public String toString() {
        return "KeyboardOptions(capitalization=" + ((Object) KeyboardCapitalization.m12974toStringimpl(this.capitalization)) + ", autoCorrectEnabled=" + this.autoCorrectEnabled + ", keyboardType=" + ((Object) KeyboardType.m12991toStringimpl(this.keyboardType)) + ", imeAction=" + ((Object) ImeAction.m12938toStringimpl(this.imeAction)) + ", platformImeOptions=" + this.platformImeOptions + "showKeyboardOnFocus=" + this.showKeyboardOnFocus + ", hintLocales=" + this.hintLocales + ')';
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Please use the new constructor that takes optional autoCorrectEnabled parameter.", replaceWith = @ReplaceWith(expression = "KeyboardOptions(capitalization = capitalization, autoCorrectEnabled = autoCorrect, keyboardType = keyboardType, imeAction = imeAction,platformImeOptions = platformImeOptions, showKeyboardOnFocus = showKeyboardOnFocus,hintLocales = hintLocales)", imports = {}))
    public /* synthetic */ KeyboardOptions(int i, boolean z8, int i8, int i9, PlatformImeOptions platformImeOptions, Boolean bool, LocaleList localeList, AbstractC5824e abstractC5824e) {
        this(i, z8, i8, i9, platformImeOptions, bool, localeList);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Please use the copy function that takes an autoCorrectEnabled parameter.", replaceWith = @ReplaceWith(expression = "copy(capitalization = capitalization, autoCorrectEnabled = autoCorrect, keyboardType = keyboardType, imeAction = imeAction,platformImeOptions = platformImeOptions, showKeyboardOnFocus = showKeyboardOnFocus ?: true,hintLocales = hintLocales)", imports = {}))
    /* renamed from: copy-INvB4aQ, reason: not valid java name */
    public final /* synthetic */ KeyboardOptions m7618copyINvB4aQ(int capitalization, boolean autoCorrect, int keyboardType, int imeAction, PlatformImeOptions platformImeOptions, Boolean showKeyboardOnFocus, LocaleList hintLocales) {
        return new KeyboardOptions(capitalization, Boolean.valueOf(autoCorrect), keyboardType, imeAction, platformImeOptions, showKeyboardOnFocus, hintLocales, (AbstractC5824e) null);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compat")
    public /* synthetic */ KeyboardOptions(int i, boolean z8, int i8, int i9, PlatformImeOptions platformImeOptions, AbstractC5824e abstractC5824e) {
        this(i, z8, i8, i9, platformImeOptions);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Please use the new constructor that takes optional platformImeOptions parameter.")
    public /* synthetic */ KeyboardOptions(int i, boolean z8, int i8, int i9, AbstractC5824e abstractC5824e) {
        this(i, z8, i8, i9);
    }

    private KeyboardOptions(int i, Boolean bool, int i8, int i9, PlatformImeOptions platformImeOptions, Boolean bool2, LocaleList localeList) {
        this.capitalization = i;
        this.autoCorrectEnabled = bool;
        this.keyboardType = i8;
        this.imeAction = i9;
        this.platformImeOptions = platformImeOptions;
        this.showKeyboardOnFocus = bool2;
        this.hintLocales = localeList;
    }

    /* renamed from: copy-INvB4aQ$default, reason: not valid java name */
    public static /* synthetic */ KeyboardOptions m7612copyINvB4aQ$default(KeyboardOptions keyboardOptions, int i, boolean z8, int i8, int i9, PlatformImeOptions platformImeOptions, Boolean bool, LocaleList localeList, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i = keyboardOptions.capitalization;
        }
        if ((i10 & 2) != 0) {
            z8 = keyboardOptions.getAutoCorrectOrDefault();
        }
        if ((i10 & 4) != 0) {
            i8 = keyboardOptions.keyboardType;
        }
        if ((i10 & 8) != 0) {
            i9 = keyboardOptions.imeAction;
        }
        if ((i10 & 16) != 0) {
            platformImeOptions = keyboardOptions.platformImeOptions;
        }
        if ((i10 & 32) != 0) {
            bool = Boolean.valueOf(keyboardOptions.getShowKeyboardOnFocusOrDefault$foundation_release());
        }
        if ((i10 & 64) != 0) {
            localeList = keyboardOptions.hintLocales;
        }
        Boolean bool2 = bool;
        LocaleList localeList2 = localeList;
        PlatformImeOptions platformImeOptions2 = platformImeOptions;
        int i11 = i8;
        return keyboardOptions.m7618copyINvB4aQ(i, z8, i11, i9, platformImeOptions2, bool2, localeList2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ KeyboardOptions(int i, Boolean bool, int i8, int i9, PlatformImeOptions platformImeOptions, Boolean bool2, LocaleList localeList, int i10, AbstractC5824e abstractC5824e) {
        int iM12984getUnspecifiedIUNYP9k = (i10 & 1) != 0 ? KeyboardCapitalization.INSTANCE.m12984getUnspecifiedIUNYP9k() : i;
        Boolean bool3 = (i10 & 2) != 0 ? null : bool;
        int iM13011getUnspecifiedPjHm6EE = (i10 & 4) != 0 ? KeyboardType.INSTANCE.m13011getUnspecifiedPjHm6EE() : i8;
        int iM12957getUnspecifiedeUduSuo = (i10 & 8) != 0 ? ImeAction.INSTANCE.m12957getUnspecifiedeUduSuo() : i9;
        PlatformImeOptions platformImeOptions2 = (i10 & 16) != 0 ? null : platformImeOptions;
        Boolean bool4 = (i10 & 32) != 0 ? null : bool2;
        this(iM12984getUnspecifiedIUNYP9k, bool3, iM13011getUnspecifiedPjHm6EE, iM12957getUnspecifiedeUduSuo, platformImeOptions2, bool4, (i10 & 64) == 0 ? localeList : null, (AbstractC5824e) null);
    }

    public /* synthetic */ KeyboardOptions(int i, boolean z8, int i8, int i9, PlatformImeOptions platformImeOptions, Boolean bool, LocaleList localeList, int i10, AbstractC5824e abstractC5824e) {
        this((i10 & 1) != 0 ? KeyboardCapitalization.INSTANCE.m12984getUnspecifiedIUNYP9k() : i, z8, (i10 & 4) != 0 ? KeyboardType.INSTANCE.m13011getUnspecifiedPjHm6EE() : i8, (i10 & 8) != 0 ? ImeAction.INSTANCE.m12957getUnspecifiedeUduSuo() : i9, (i10 & 16) != 0 ? null : platformImeOptions, (i10 & 32) != 0 ? null : bool, (i10 & 64) != 0 ? null : localeList, (AbstractC5824e) null);
    }

    private KeyboardOptions(int i, boolean z8, int i8, int i9, PlatformImeOptions platformImeOptions, Boolean bool, LocaleList localeList) {
        this(i, Boolean.valueOf(z8), i8, i9, platformImeOptions, bool, localeList, (AbstractC5824e) null);
    }

    public /* synthetic */ KeyboardOptions(int i, boolean z8, int i8, int i9, int i10, AbstractC5824e abstractC5824e) {
        this((i10 & 1) != 0 ? KeyboardCapitalization.INSTANCE.m12984getUnspecifiedIUNYP9k() : i, (i10 & 2) != 0 ? Default.getAutoCorrectOrDefault() : z8, (i10 & 4) != 0 ? KeyboardType.INSTANCE.m13011getUnspecifiedPjHm6EE() : i8, (i10 & 8) != 0 ? ImeAction.INSTANCE.m12949getDefaulteUduSuo() : i9, (AbstractC5824e) null);
    }

    private KeyboardOptions(int i, boolean z8, int i8, int i9) {
        this(i, Boolean.valueOf(z8), i8, i9, (PlatformImeOptions) null, (Boolean) null, (LocaleList) null, 96, (AbstractC5824e) null);
    }

    public /* synthetic */ KeyboardOptions(int i, boolean z8, int i8, int i9, PlatformImeOptions platformImeOptions, int i10, AbstractC5824e abstractC5824e) {
        this((i10 & 1) != 0 ? KeyboardCapitalization.INSTANCE.m12982getNoneIUNYP9k() : i, (i10 & 2) != 0 ? Default.getAutoCorrectOrDefault() : z8, (i10 & 4) != 0 ? KeyboardType.INSTANCE.m13010getTextPjHm6EE() : i8, (i10 & 8) != 0 ? ImeAction.INSTANCE.m12949getDefaulteUduSuo() : i9, (i10 & 16) != 0 ? null : platformImeOptions, (AbstractC5824e) null);
    }

    private KeyboardOptions(int i, boolean z8, int i8, int i9, PlatformImeOptions platformImeOptions) {
        this(i, Boolean.valueOf(z8), i8, i9, platformImeOptions, Boolean.valueOf(Default.getShowKeyboardOnFocusOrDefault$foundation_release()), (LocaleList) null, 64, (AbstractC5824e) null);
    }
}
