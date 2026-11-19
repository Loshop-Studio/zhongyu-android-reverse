package androidx.compose.material3.internal;

import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.AbstractC9133u;
import p113g8.AbstractC8687z;

@Immutable
/* loaded from: classes2.dex */
public final class DateInputFormat {
    public static final int $stable = 0;
    private final char delimiter;
    private final String patternWithDelimiters;
    private final String patternWithoutDelimiters;

    public DateInputFormat(String str, char c10) {
        this.patternWithDelimiters = str;
        this.delimiter = c10;
        this.patternWithoutDelimiters = AbstractC8687z.m14101I(str, String.valueOf(c10), "", false, 4, null);
    }

    public static /* synthetic */ DateInputFormat copy$default(DateInputFormat dateInputFormat, String str, char c10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = dateInputFormat.patternWithDelimiters;
        }
        if ((i10 & 2) != 0) {
            c10 = dateInputFormat.delimiter;
        }
        return dateInputFormat.copy(str, c10);
    }

    public final String component1() {
        return this.patternWithDelimiters;
    }

    public final char component2() {
        return this.delimiter;
    }

    public final DateInputFormat copy(String str, char c10) {
        return new DateInputFormat(str, c10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DateInputFormat)) {
            return false;
        }
        DateInputFormat dateInputFormat = (DateInputFormat) obj;
        return AbstractC9133u.m16128b(this.patternWithDelimiters, dateInputFormat.patternWithDelimiters) && this.delimiter == dateInputFormat.delimiter;
    }

    public final char getDelimiter() {
        return this.delimiter;
    }

    public final String getPatternWithDelimiters() {
        return this.patternWithDelimiters;
    }

    public final String getPatternWithoutDelimiters() {
        return this.patternWithoutDelimiters;
    }

    public int hashCode() {
        return (this.patternWithDelimiters.hashCode() * 31) + Character.hashCode(this.delimiter);
    }

    public String toString() {
        return "DateInputFormat(patternWithDelimiters=" + this.patternWithDelimiters + ", delimiter=" + this.delimiter + ')';
    }
}
