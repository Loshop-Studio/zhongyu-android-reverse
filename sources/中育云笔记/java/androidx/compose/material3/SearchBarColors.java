package androidx.compose.material3;

import androidx.compose.p014ui.graphics.Color;
import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p309qc.InterfaceC10770a;

@Immutable
@ExperimentalMaterial3Api
/* loaded from: classes2.dex */
public final class SearchBarColors {
    public static final int $stable = 0;
    private final long containerColor;
    private final long dividerColor;
    private final TextFieldColors inputFieldColors;

    @InterfaceC10770a
    public /* synthetic */ SearchBarColors(long j10, long j11, TextFieldColors textFieldColors, AbstractC9972n abstractC9972n) {
        this(j10, j11, textFieldColors);
    }

    @InterfaceC10770a
    public static /* synthetic */ void getInputFieldColors$annotations() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchBarColors)) {
            return false;
        }
        SearchBarColors searchBarColors = (SearchBarColors) obj;
        return Color.m30879equalsimpl0(this.containerColor, searchBarColors.containerColor) && Color.m30879equalsimpl0(this.dividerColor, searchBarColors.dividerColor) && AbstractC9979u.m20289b(this.inputFieldColors, searchBarColors.inputFieldColors);
    }

    /* renamed from: getContainerColor-0d7_KjU, reason: not valid java name */
    public final long m29014getContainerColor0d7_KjU() {
        return this.containerColor;
    }

    /* renamed from: getDividerColor-0d7_KjU, reason: not valid java name */
    public final long m29015getDividerColor0d7_KjU() {
        return this.dividerColor;
    }

    public final TextFieldColors getInputFieldColors() {
        return this.inputFieldColors;
    }

    public int hashCode() {
        return (((Color.m30885hashCodeimpl(this.containerColor) * 31) + Color.m30885hashCodeimpl(this.dividerColor)) * 31) + this.inputFieldColors.hashCode();
    }

    public /* synthetic */ SearchBarColors(long j10, long j11, AbstractC9972n abstractC9972n) {
        this(j10, j11);
    }

    private SearchBarColors(long j10, long j11, TextFieldColors textFieldColors) {
        this.containerColor = j10;
        this.dividerColor = j11;
        this.inputFieldColors = textFieldColors;
    }

    private SearchBarColors(long j10, long j11) {
        this(j10, j11, SearchBar_androidKt.UnspecifiedTextFieldColors, null);
    }
}
