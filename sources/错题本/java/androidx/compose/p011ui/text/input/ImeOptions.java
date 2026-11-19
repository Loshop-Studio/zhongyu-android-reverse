package androidx.compose.p011ui.text.input;

import androidx.collection.AbstractC0584a;
import androidx.compose.p011ui.text.intl.LocaleList;
import androidx.compose.runtime.Immutable;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Immutable
@Metadata(m5109d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0007\u0018\u0000 12\u00020\u0001:\u00011BO\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010BG\b\u0017\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u000f\u0010\u0011B;\b\u0017\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\u0012JX\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\rø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014JP\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017JD\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\tH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001b\u001a\u00020\u00022\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010%R\u001d\u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b'\u0010\u001fR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010#\u001a\u0004\b(\u0010%R\u001d\u0010\b\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\b\u0010&\u001a\u0004\b)\u0010\u001fR\u001d\u0010\n\u001a\u00020\t8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\n\u0010&\u001a\u0004\b*\u0010\u001fR\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010+\u001a\u0004\b,\u0010-R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010.\u001a\u0004\b/\u00100\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00062"}, m5110d2 = {"Landroidx/compose/ui/text/input/ImeOptions;", "", "", "singleLine", "Landroidx/compose/ui/text/input/KeyboardCapitalization;", "capitalization", "autoCorrect", "Landroidx/compose/ui/text/input/KeyboardType;", "keyboardType", "Landroidx/compose/ui/text/input/ImeAction;", "imeAction", "Landroidx/compose/ui/text/input/PlatformImeOptions;", "platformImeOptions", "Landroidx/compose/ui/text/intl/LocaleList;", "hintLocales", "<init>", "(ZIZIILandroidx/compose/ui/text/input/PlatformImeOptions;Landroidx/compose/ui/text/intl/LocaleList;Lkotlin/jvm/internal/e;)V", "(ZIZIILandroidx/compose/ui/text/input/PlatformImeOptions;Lkotlin/jvm/internal/e;)V", "(ZIZIILkotlin/jvm/internal/e;)V", "copy-wBHncE4", "(ZIZIILandroidx/compose/ui/text/input/PlatformImeOptions;Landroidx/compose/ui/text/intl/LocaleList;)Landroidx/compose/ui/text/input/ImeOptions;", "copy", "copy-YTHSh70", "(ZIZIILandroidx/compose/ui/text/input/PlatformImeOptions;)Landroidx/compose/ui/text/input/ImeOptions;", "copy-uxg59PA", "(ZIZII)Landroidx/compose/ui/text/input/ImeOptions;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Z", "getSingleLine", "()Z", "I", "getCapitalization-IUNYP9k", "getAutoCorrect", "getKeyboardType-PjHm6EE", "getImeAction-eUduSuo", "Landroidx/compose/ui/text/input/PlatformImeOptions;", "getPlatformImeOptions", "()Landroidx/compose/ui/text/input/PlatformImeOptions;", "Landroidx/compose/ui/text/intl/LocaleList;", "getHintLocales", "()Landroidx/compose/ui/text/intl/LocaleList;", "Companion", "ui-text_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final class ImeOptions {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final ImeOptions Default = new ImeOptions(false, 0, false, 0, 0, null, null, 127, null);
    private final boolean autoCorrect;
    private final int capitalization;

    @NotNull
    private final LocaleList hintLocales;
    private final int imeAction;
    private final int keyboardType;

    @Nullable
    private final PlatformImeOptions platformImeOptions;
    private final boolean singleLine;

    @Metadata(m5109d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m5110d2 = {"Landroidx/compose/ui/text/input/ImeOptions$Companion;", "", "()V", "Default", "Landroidx/compose/ui/text/input/ImeOptions;", "getDefault", "()Landroidx/compose/ui/text/input/ImeOptions;", "ui-text_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC5824e abstractC5824e) {
            this();
        }

        @NotNull
        public final ImeOptions getDefault() {
            return ImeOptions.Default;
        }

        private Companion() {
        }
    }

    public /* synthetic */ ImeOptions(boolean z8, int i, boolean z9, int i8, int i9, PlatformImeOptions platformImeOptions, LocaleList localeList, AbstractC5824e abstractC5824e) {
        this(z8, i, z9, i8, i9, platformImeOptions, localeList);
    }

    /* renamed from: copy-YTHSh70$default, reason: not valid java name */
    public static /* synthetic */ ImeOptions m12958copyYTHSh70$default(ImeOptions imeOptions, boolean z8, int i, boolean z9, int i8, int i9, PlatformImeOptions platformImeOptions, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z8 = imeOptions.singleLine;
        }
        if ((i10 & 2) != 0) {
            i = imeOptions.capitalization;
        }
        if ((i10 & 4) != 0) {
            z9 = imeOptions.autoCorrect;
        }
        if ((i10 & 8) != 0) {
            i8 = imeOptions.keyboardType;
        }
        if ((i10 & 16) != 0) {
            i9 = imeOptions.imeAction;
        }
        if ((i10 & 32) != 0) {
            platformImeOptions = imeOptions.platformImeOptions;
        }
        int i11 = i9;
        PlatformImeOptions platformImeOptions2 = platformImeOptions;
        return imeOptions.m12961copyYTHSh70(z8, i, z9, i8, i11, platformImeOptions2);
    }

    /* renamed from: copy-uxg59PA$default, reason: not valid java name */
    public static /* synthetic */ ImeOptions m12959copyuxg59PA$default(ImeOptions imeOptions, boolean z8, int i, boolean z9, int i8, int i9, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z8 = imeOptions.singleLine;
        }
        if ((i10 & 2) != 0) {
            i = imeOptions.capitalization;
        }
        if ((i10 & 4) != 0) {
            z9 = imeOptions.autoCorrect;
        }
        if ((i10 & 8) != 0) {
            i8 = imeOptions.keyboardType;
        }
        if ((i10 & 16) != 0) {
            i9 = imeOptions.imeAction;
        }
        int i11 = i9;
        boolean z10 = z9;
        return imeOptions.m12962copyuxg59PA(z8, i, z10, i8, i11);
    }

    /* renamed from: copy-wBHncE4$default, reason: not valid java name */
    public static /* synthetic */ ImeOptions m12960copywBHncE4$default(ImeOptions imeOptions, boolean z8, int i, boolean z9, int i8, int i9, PlatformImeOptions platformImeOptions, LocaleList localeList, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z8 = imeOptions.singleLine;
        }
        if ((i10 & 2) != 0) {
            i = imeOptions.capitalization;
        }
        if ((i10 & 4) != 0) {
            z9 = imeOptions.autoCorrect;
        }
        if ((i10 & 8) != 0) {
            i8 = imeOptions.keyboardType;
        }
        if ((i10 & 16) != 0) {
            i9 = imeOptions.imeAction;
        }
        if ((i10 & 32) != 0) {
            platformImeOptions = imeOptions.platformImeOptions;
        }
        if ((i10 & 64) != 0) {
            localeList = imeOptions.hintLocales;
        }
        PlatformImeOptions platformImeOptions2 = platformImeOptions;
        LocaleList localeList2 = localeList;
        int i11 = i9;
        boolean z10 = z9;
        return imeOptions.m12963copywBHncE4(z8, i, z10, i8, i11, platformImeOptions2, localeList2);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Please use the new copy function that takes optional hintLocales parameter.")
    /* renamed from: copy-YTHSh70, reason: not valid java name */
    public final /* synthetic */ ImeOptions m12961copyYTHSh70(boolean singleLine, int capitalization, boolean autoCorrect, int keyboardType, int imeAction, PlatformImeOptions platformImeOptions) {
        return new ImeOptions(singleLine, capitalization, autoCorrect, keyboardType, imeAction, platformImeOptions, this.hintLocales, (AbstractC5824e) null);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Please use the new copy function that takes optional platformImeOptions parameter.")
    /* renamed from: copy-uxg59PA, reason: not valid java name */
    public final /* synthetic */ ImeOptions m12962copyuxg59PA(boolean singleLine, int capitalization, boolean autoCorrect, int keyboardType, int imeAction) {
        return new ImeOptions(singleLine, capitalization, autoCorrect, keyboardType, imeAction, this.platformImeOptions, this.hintLocales, (AbstractC5824e) null);
    }

    @NotNull
    /* renamed from: copy-wBHncE4, reason: not valid java name */
    public final ImeOptions m12963copywBHncE4(boolean singleLine, int capitalization, boolean autoCorrect, int keyboardType, int imeAction, @Nullable PlatformImeOptions platformImeOptions, @NotNull LocaleList hintLocales) {
        return new ImeOptions(singleLine, capitalization, autoCorrect, keyboardType, imeAction, platformImeOptions, hintLocales, (AbstractC5824e) null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ImeOptions)) {
            return false;
        }
        ImeOptions imeOptions = (ImeOptions) other;
        return this.singleLine == imeOptions.singleLine && KeyboardCapitalization.m12972equalsimpl0(this.capitalization, imeOptions.capitalization) && this.autoCorrect == imeOptions.autoCorrect && KeyboardType.m12989equalsimpl0(this.keyboardType, imeOptions.keyboardType) && ImeAction.m12936equalsimpl0(this.imeAction, imeOptions.imeAction) && AbstractC5830k.m5325b(this.platformImeOptions, imeOptions.platformImeOptions) && AbstractC5830k.m5325b(this.hintLocales, imeOptions.hintLocales);
    }

    public final boolean getAutoCorrect() {
        return this.autoCorrect;
    }

    /* renamed from: getCapitalization-IUNYP9k, reason: not valid java name and from getter */
    public final int getCapitalization() {
        return this.capitalization;
    }

    @NotNull
    public final LocaleList getHintLocales() {
        return this.hintLocales;
    }

    /* renamed from: getImeAction-eUduSuo, reason: not valid java name and from getter */
    public final int getImeAction() {
        return this.imeAction;
    }

    /* renamed from: getKeyboardType-PjHm6EE, reason: not valid java name and from getter */
    public final int getKeyboardType() {
        return this.keyboardType;
    }

    @Nullable
    public final PlatformImeOptions getPlatformImeOptions() {
        return this.platformImeOptions;
    }

    public final boolean getSingleLine() {
        return this.singleLine;
    }

    public int hashCode() {
        int iM12937hashCodeimpl = (ImeAction.m12937hashCodeimpl(this.imeAction) + ((KeyboardType.m12990hashCodeimpl(this.keyboardType) + AbstractC0584a.m908i(this.autoCorrect, (KeyboardCapitalization.m12973hashCodeimpl(this.capitalization) + (Boolean.hashCode(this.singleLine) * 31)) * 31, 31)) * 31)) * 31;
        PlatformImeOptions platformImeOptions = this.platformImeOptions;
        return this.hintLocales.hashCode() + ((iM12937hashCodeimpl + (platformImeOptions != null ? platformImeOptions.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        return "ImeOptions(singleLine=" + this.singleLine + ", capitalization=" + ((Object) KeyboardCapitalization.m12974toStringimpl(this.capitalization)) + ", autoCorrect=" + this.autoCorrect + ", keyboardType=" + ((Object) KeyboardType.m12991toStringimpl(this.keyboardType)) + ", imeAction=" + ((Object) ImeAction.m12938toStringimpl(this.imeAction)) + ", platformImeOptions=" + this.platformImeOptions + ", hintLocales=" + this.hintLocales + ')';
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Please use the new constructor that takes optional hintLocales parameter.")
    public /* synthetic */ ImeOptions(boolean z8, int i, boolean z9, int i8, int i9, PlatformImeOptions platformImeOptions, AbstractC5824e abstractC5824e) {
        this(z8, i, z9, i8, i9, platformImeOptions);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Please use the new constructor that takes optional platformImeOptions parameter.")
    public /* synthetic */ ImeOptions(boolean z8, int i, boolean z9, int i8, int i9, AbstractC5824e abstractC5824e) {
        this(z8, i, z9, i8, i9);
    }

    private ImeOptions(boolean z8, int i, boolean z9, int i8, int i9, PlatformImeOptions platformImeOptions, LocaleList localeList) {
        this.singleLine = z8;
        this.capitalization = i;
        this.autoCorrect = z9;
        this.keyboardType = i8;
        this.imeAction = i9;
        this.platformImeOptions = platformImeOptions;
        this.hintLocales = localeList;
    }

    public /* synthetic */ ImeOptions(boolean z8, int i, boolean z9, int i8, int i9, PlatformImeOptions platformImeOptions, LocaleList localeList, int i10, AbstractC5824e abstractC5824e) {
        this((i10 & 1) != 0 ? false : z8, (i10 & 2) != 0 ? KeyboardCapitalization.INSTANCE.m12982getNoneIUNYP9k() : i, (i10 & 4) != 0 ? true : z9, (i10 & 8) != 0 ? KeyboardType.INSTANCE.m13010getTextPjHm6EE() : i8, (i10 & 16) != 0 ? ImeAction.INSTANCE.m12949getDefaulteUduSuo() : i9, (i10 & 32) != 0 ? null : platformImeOptions, (i10 & 64) != 0 ? LocaleList.INSTANCE.getEmpty() : localeList, (AbstractC5824e) null);
    }

    public /* synthetic */ ImeOptions(boolean z8, int i, boolean z9, int i8, int i9, PlatformImeOptions platformImeOptions, int i10, AbstractC5824e abstractC5824e) {
        this((i10 & 1) != 0 ? false : z8, (i10 & 2) != 0 ? KeyboardCapitalization.INSTANCE.m12982getNoneIUNYP9k() : i, (i10 & 4) != 0 ? true : z9, (i10 & 8) != 0 ? KeyboardType.INSTANCE.m13010getTextPjHm6EE() : i8, (i10 & 16) != 0 ? ImeAction.INSTANCE.m12949getDefaulteUduSuo() : i9, (i10 & 32) != 0 ? null : platformImeOptions, (AbstractC5824e) null);
    }

    private ImeOptions(boolean z8, int i, boolean z9, int i8, int i9, PlatformImeOptions platformImeOptions) {
        this(z8, i, z9, i8, i9, platformImeOptions, LocaleList.INSTANCE.getEmpty(), (AbstractC5824e) null);
    }

    public /* synthetic */ ImeOptions(boolean z8, int i, boolean z9, int i8, int i9, int i10, AbstractC5824e abstractC5824e) {
        this((i10 & 1) != 0 ? false : z8, (i10 & 2) != 0 ? KeyboardCapitalization.INSTANCE.m12982getNoneIUNYP9k() : i, (i10 & 4) != 0 ? true : z9, (i10 & 8) != 0 ? KeyboardType.INSTANCE.m13010getTextPjHm6EE() : i8, (i10 & 16) != 0 ? ImeAction.INSTANCE.m12949getDefaulteUduSuo() : i9, (AbstractC5824e) null);
    }

    private ImeOptions(boolean z8, int i, boolean z9, int i8, int i9) {
        this(z8, i, z9, i8, i9, null, null, 64, null);
    }
}
