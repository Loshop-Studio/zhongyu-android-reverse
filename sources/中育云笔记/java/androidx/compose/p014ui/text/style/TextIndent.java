package androidx.compose.p014ui.text.style;

import androidx.compose.p014ui.unit.TextUnit;
import androidx.compose.p014ui.unit.TextUnitKt;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.AbstractC9972n;

@Immutable
/* loaded from: classes2.dex */
public final class TextIndent {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final TextIndent None = new TextIndent(0, 0, 3, null);
    private final long firstLine;
    private final long restLine;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        @Stable
        public static /* synthetic */ void getNone$annotations() {
        }

        public final TextIndent getNone() {
            return TextIndent.None;
        }

        private Companion() {
        }
    }

    public /* synthetic */ TextIndent(long j10, long j11, AbstractC9972n abstractC9972n) {
        this(j10, j11);
    }

    /* renamed from: copy-NB67dxo$default, reason: not valid java name */
    public static /* synthetic */ TextIndent m33407copyNB67dxo$default(TextIndent textIndent, long j10, long j11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = textIndent.firstLine;
        }
        if ((i10 & 2) != 0) {
            j11 = textIndent.restLine;
        }
        return textIndent.m33408copyNB67dxo(j10, j11);
    }

    /* renamed from: copy-NB67dxo, reason: not valid java name */
    public final TextIndent m33408copyNB67dxo(long j10, long j11) {
        return new TextIndent(j10, j11, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextIndent)) {
            return false;
        }
        TextIndent textIndent = (TextIndent) obj;
        return TextUnit.m33692equalsimpl0(this.firstLine, textIndent.firstLine) && TextUnit.m33692equalsimpl0(this.restLine, textIndent.restLine);
    }

    /* renamed from: getFirstLine-XSAIIZE, reason: not valid java name */
    public final long m33409getFirstLineXSAIIZE() {
        return this.firstLine;
    }

    /* renamed from: getRestLine-XSAIIZE, reason: not valid java name */
    public final long m33410getRestLineXSAIIZE() {
        return this.restLine;
    }

    public int hashCode() {
        return (TextUnit.m33696hashCodeimpl(this.firstLine) * 31) + TextUnit.m33696hashCodeimpl(this.restLine);
    }

    public String toString() {
        return "TextIndent(firstLine=" + ((Object) TextUnit.m33702toStringimpl(this.firstLine)) + ", restLine=" + ((Object) TextUnit.m33702toStringimpl(this.restLine)) + ')';
    }

    private TextIndent(long j10, long j11) {
        this.firstLine = j10;
        this.restLine = j11;
    }

    public /* synthetic */ TextIndent(long j10, long j11, int i10, AbstractC9972n abstractC9972n) {
        this((i10 & 1) != 0 ? TextUnitKt.getSp(0) : j10, (i10 & 2) != 0 ? TextUnitKt.getSp(0) : j11, null);
    }
}
