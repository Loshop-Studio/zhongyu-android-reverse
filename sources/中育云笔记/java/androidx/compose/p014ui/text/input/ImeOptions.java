package androidx.compose.p014ui.text.input;

import androidx.compose.p014ui.text.intl.LocaleList;
import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p309qc.InterfaceC10770a;

@Immutable
/* loaded from: classes2.dex */
public final class ImeOptions {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final ImeOptions Default = new ImeOptions(false, 0, false, 0, 0, null, null, 127, null);
    private final boolean autoCorrect;
    private final int capitalization;
    private final LocaleList hintLocales;
    private final int imeAction;
    private final int keyboardType;
    private final PlatformImeOptions platformImeOptions;
    private final boolean singleLine;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        public final ImeOptions getDefault() {
            return ImeOptions.Default;
        }

        private Companion() {
        }
    }

    public /* synthetic */ ImeOptions(boolean z10, int i10, boolean z11, int i11, int i12, PlatformImeOptions platformImeOptions, LocaleList localeList, AbstractC9972n abstractC9972n) {
        this(z10, i10, z11, i11, i12, platformImeOptions, localeList);
    }

    /* renamed from: copy-YTHSh70$default, reason: not valid java name */
    public static /* synthetic */ ImeOptions m33154copyYTHSh70$default(ImeOptions imeOptions, boolean z10, int i10, boolean z11, int i11, int i12, PlatformImeOptions platformImeOptions, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z10 = imeOptions.singleLine;
        }
        if ((i13 & 2) != 0) {
            i10 = imeOptions.capitalization;
        }
        if ((i13 & 4) != 0) {
            z11 = imeOptions.autoCorrect;
        }
        if ((i13 & 8) != 0) {
            i11 = imeOptions.keyboardType;
        }
        if ((i13 & 16) != 0) {
            i12 = imeOptions.imeAction;
        }
        if ((i13 & 32) != 0) {
            platformImeOptions = imeOptions.platformImeOptions;
        }
        int i14 = i12;
        PlatformImeOptions platformImeOptions2 = platformImeOptions;
        return imeOptions.m33157copyYTHSh70(z10, i10, z11, i11, i14, platformImeOptions2);
    }

    /* renamed from: copy-uxg59PA$default, reason: not valid java name */
    public static /* synthetic */ ImeOptions m33155copyuxg59PA$default(ImeOptions imeOptions, boolean z10, int i10, boolean z11, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z10 = imeOptions.singleLine;
        }
        if ((i13 & 2) != 0) {
            i10 = imeOptions.capitalization;
        }
        if ((i13 & 4) != 0) {
            z11 = imeOptions.autoCorrect;
        }
        if ((i13 & 8) != 0) {
            i11 = imeOptions.keyboardType;
        }
        if ((i13 & 16) != 0) {
            i12 = imeOptions.imeAction;
        }
        int i14 = i12;
        boolean z12 = z11;
        return imeOptions.m33158copyuxg59PA(z10, i10, z12, i11, i14);
    }

    /* renamed from: copy-wBHncE4$default, reason: not valid java name */
    public static /* synthetic */ ImeOptions m33156copywBHncE4$default(ImeOptions imeOptions, boolean z10, int i10, boolean z11, int i11, int i12, PlatformImeOptions platformImeOptions, LocaleList localeList, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z10 = imeOptions.singleLine;
        }
        if ((i13 & 2) != 0) {
            i10 = imeOptions.capitalization;
        }
        if ((i13 & 4) != 0) {
            z11 = imeOptions.autoCorrect;
        }
        if ((i13 & 8) != 0) {
            i11 = imeOptions.keyboardType;
        }
        if ((i13 & 16) != 0) {
            i12 = imeOptions.imeAction;
        }
        if ((i13 & 32) != 0) {
            platformImeOptions = imeOptions.platformImeOptions;
        }
        if ((i13 & 64) != 0) {
            localeList = imeOptions.hintLocales;
        }
        PlatformImeOptions platformImeOptions2 = platformImeOptions;
        LocaleList localeList2 = localeList;
        int i14 = i12;
        boolean z12 = z11;
        return imeOptions.m33159copywBHncE4(z10, i10, z12, i11, i14, platformImeOptions2, localeList2);
    }

    @InterfaceC10770a
    /* renamed from: copy-YTHSh70, reason: not valid java name */
    public final /* synthetic */ ImeOptions m33157copyYTHSh70(boolean z10, int i10, boolean z11, int i11, int i12, PlatformImeOptions platformImeOptions) {
        return new ImeOptions(z10, i10, z11, i11, i12, platformImeOptions, this.hintLocales, (AbstractC9972n) null);
    }

    @InterfaceC10770a
    /* renamed from: copy-uxg59PA, reason: not valid java name */
    public final /* synthetic */ ImeOptions m33158copyuxg59PA(boolean z10, int i10, boolean z11, int i11, int i12) {
        return new ImeOptions(z10, i10, z11, i11, i12, this.platformImeOptions, this.hintLocales, (AbstractC9972n) null);
    }

    /* renamed from: copy-wBHncE4, reason: not valid java name */
    public final ImeOptions m33159copywBHncE4(boolean z10, int i10, boolean z11, int i11, int i12, PlatformImeOptions platformImeOptions, LocaleList localeList) {
        return new ImeOptions(z10, i10, z11, i11, i12, platformImeOptions, localeList, (AbstractC9972n) null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImeOptions)) {
            return false;
        }
        ImeOptions imeOptions = (ImeOptions) obj;
        return this.singleLine == imeOptions.singleLine && KeyboardCapitalization.m33168equalsimpl0(this.capitalization, imeOptions.capitalization) && this.autoCorrect == imeOptions.autoCorrect && KeyboardType.m33185equalsimpl0(this.keyboardType, imeOptions.keyboardType) && ImeAction.m33132equalsimpl0(this.imeAction, imeOptions.imeAction) && AbstractC9979u.m20289b(this.platformImeOptions, imeOptions.platformImeOptions) && AbstractC9979u.m20289b(this.hintLocales, imeOptions.hintLocales);
    }

    public final boolean getAutoCorrect() {
        return this.autoCorrect;
    }

    /* renamed from: getCapitalization-IUNYP9k, reason: not valid java name */
    public final int m33160getCapitalizationIUNYP9k() {
        return this.capitalization;
    }

    public final LocaleList getHintLocales() {
        return this.hintLocales;
    }

    /* renamed from: getImeAction-eUduSuo, reason: not valid java name */
    public final int m33161getImeActioneUduSuo() {
        return this.imeAction;
    }

    /* renamed from: getKeyboardType-PjHm6EE, reason: not valid java name */
    public final int m33162getKeyboardTypePjHm6EE() {
        return this.keyboardType;
    }

    public final PlatformImeOptions getPlatformImeOptions() {
        return this.platformImeOptions;
    }

    public final boolean getSingleLine() {
        return this.singleLine;
    }

    public int hashCode() {
        int iHashCode = ((((((((Boolean.hashCode(this.singleLine) * 31) + KeyboardCapitalization.m33169hashCodeimpl(this.capitalization)) * 31) + Boolean.hashCode(this.autoCorrect)) * 31) + KeyboardType.m33186hashCodeimpl(this.keyboardType)) * 31) + ImeAction.m33133hashCodeimpl(this.imeAction)) * 31;
        PlatformImeOptions platformImeOptions = this.platformImeOptions;
        return ((iHashCode + (platformImeOptions != null ? platformImeOptions.hashCode() : 0)) * 31) + this.hintLocales.hashCode();
    }

    public String toString() {
        return "ImeOptions(singleLine=" + this.singleLine + ", capitalization=" + ((Object) KeyboardCapitalization.m33170toStringimpl(this.capitalization)) + ", autoCorrect=" + this.autoCorrect + ", keyboardType=" + ((Object) KeyboardType.m33187toStringimpl(this.keyboardType)) + ", imeAction=" + ((Object) ImeAction.m33134toStringimpl(this.imeAction)) + ", platformImeOptions=" + this.platformImeOptions + ", hintLocales=" + this.hintLocales + ')';
    }

    @InterfaceC10770a
    public /* synthetic */ ImeOptions(boolean z10, int i10, boolean z11, int i11, int i12, PlatformImeOptions platformImeOptions, AbstractC9972n abstractC9972n) {
        this(z10, i10, z11, i11, i12, platformImeOptions);
    }

    @InterfaceC10770a
    public /* synthetic */ ImeOptions(boolean z10, int i10, boolean z11, int i11, int i12, AbstractC9972n abstractC9972n) {
        this(z10, i10, z11, i11, i12);
    }

    private ImeOptions(boolean z10, int i10, boolean z11, int i11, int i12, PlatformImeOptions platformImeOptions, LocaleList localeList) {
        this.singleLine = z10;
        this.capitalization = i10;
        this.autoCorrect = z11;
        this.keyboardType = i11;
        this.imeAction = i12;
        this.platformImeOptions = platformImeOptions;
        this.hintLocales = localeList;
    }

    public /* synthetic */ ImeOptions(boolean z10, int i10, boolean z11, int i11, int i12, PlatformImeOptions platformImeOptions, LocaleList localeList, int i13, AbstractC9972n abstractC9972n) {
        this((i13 & 1) != 0 ? false : z10, (i13 & 2) != 0 ? KeyboardCapitalization.Companion.m33178getNoneIUNYP9k() : i10, (i13 & 4) != 0 ? true : z11, (i13 & 8) != 0 ? KeyboardType.Companion.m33206getTextPjHm6EE() : i11, (i13 & 16) != 0 ? ImeAction.Companion.m33145getDefaulteUduSuo() : i12, (i13 & 32) != 0 ? null : platformImeOptions, (i13 & 64) != 0 ? LocaleList.Companion.getEmpty() : localeList, (AbstractC9972n) null);
    }

    public /* synthetic */ ImeOptions(boolean z10, int i10, boolean z11, int i11, int i12, PlatformImeOptions platformImeOptions, int i13, AbstractC9972n abstractC9972n) {
        this((i13 & 1) != 0 ? false : z10, (i13 & 2) != 0 ? KeyboardCapitalization.Companion.m33178getNoneIUNYP9k() : i10, (i13 & 4) != 0 ? true : z11, (i13 & 8) != 0 ? KeyboardType.Companion.m33206getTextPjHm6EE() : i11, (i13 & 16) != 0 ? ImeAction.Companion.m33145getDefaulteUduSuo() : i12, (i13 & 32) != 0 ? null : platformImeOptions, (AbstractC9972n) null);
    }

    private ImeOptions(boolean z10, int i10, boolean z11, int i11, int i12, PlatformImeOptions platformImeOptions) {
        this(z10, i10, z11, i11, i12, platformImeOptions, LocaleList.Companion.getEmpty(), (AbstractC9972n) null);
    }

    public /* synthetic */ ImeOptions(boolean z10, int i10, boolean z11, int i11, int i12, int i13, AbstractC9972n abstractC9972n) {
        this((i13 & 1) != 0 ? false : z10, (i13 & 2) != 0 ? KeyboardCapitalization.Companion.m33178getNoneIUNYP9k() : i10, (i13 & 4) != 0 ? true : z11, (i13 & 8) != 0 ? KeyboardType.Companion.m33206getTextPjHm6EE() : i11, (i13 & 16) != 0 ? ImeAction.Companion.m33145getDefaulteUduSuo() : i12, (AbstractC9972n) null);
    }

    private ImeOptions(boolean z10, int i10, boolean z11, int i11, int i12) {
        this(z10, i10, z11, i11, i12, null, null, 64, null);
    }
}
