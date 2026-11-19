package androidx.compose.p014ui.text.android;

import androidx.compose.runtime.internal.StabilityInferred;
import java.text.CharacterIterator;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class CharSequenceCharacterIterator implements CharacterIterator {
    public static final int $stable = 8;
    private final CharSequence charSequence;
    private final int end;
    private int index;
    private final int start;

    public CharSequenceCharacterIterator(CharSequence charSequence, int i10, int i11) {
        this.charSequence = charSequence;
        this.start = i10;
        this.end = i11;
        this.index = i10;
    }

    @Override // java.text.CharacterIterator
    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    @Override // java.text.CharacterIterator
    public char current() {
        int i10 = this.index;
        if (i10 == this.end) {
            return (char) 65535;
        }
        return this.charSequence.charAt(i10);
    }

    @Override // java.text.CharacterIterator
    public char first() {
        this.index = this.start;
        return current();
    }

    @Override // java.text.CharacterIterator
    public int getBeginIndex() {
        return this.start;
    }

    @Override // java.text.CharacterIterator
    public int getEndIndex() {
        return this.end;
    }

    @Override // java.text.CharacterIterator
    public int getIndex() {
        return this.index;
    }

    @Override // java.text.CharacterIterator
    public char last() {
        int i10 = this.start;
        int i11 = this.end;
        if (i10 == i11) {
            this.index = i11;
            return (char) 65535;
        }
        int i12 = i11 - 1;
        this.index = i12;
        return this.charSequence.charAt(i12);
    }

    @Override // java.text.CharacterIterator
    public char next() {
        int i10 = this.index + 1;
        this.index = i10;
        int i11 = this.end;
        if (i10 < i11) {
            return this.charSequence.charAt(i10);
        }
        this.index = i11;
        return (char) 65535;
    }

    @Override // java.text.CharacterIterator
    public char previous() {
        int i10 = this.index;
        if (i10 <= this.start) {
            return (char) 65535;
        }
        int i11 = i10 - 1;
        this.index = i11;
        return this.charSequence.charAt(i11);
    }

    @Override // java.text.CharacterIterator
    public char setIndex(int i10) {
        int i11 = this.start;
        if (i10 > this.end || i11 > i10) {
            throw new IllegalArgumentException("invalid position");
        }
        this.index = i10;
        return current();
    }
}
