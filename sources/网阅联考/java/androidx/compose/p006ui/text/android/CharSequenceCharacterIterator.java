package androidx.compose.p006ui.text.android;

import androidx.constraintlayout.widget.ConstraintLayout;
import java.text.CharacterIterator;
import kotlin.Metadata;
import kotlin.jvm.internal.CharCompanionObject;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m5174d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\f\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\b\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\fH\u0016J\b\u0010\u000e\u001a\u00020\u0005H\u0016J\b\u0010\u000f\u001a\u00020\u0005H\u0016J\b\u0010\u0010\u001a\u00020\u0005H\u0016J\b\u0010\u0011\u001a\u00020\fH\u0016J\t\u0010\u0012\u001a\u00020\fH\u0096\u0002J\b\u0010\u0013\u001a\u00020\fH\u0016J\u0010\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0005H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m5175d2 = {"Landroidx/compose/ui/text/android/CharSequenceCharacterIterator;", "Ljava/text/CharacterIterator;", "charSequence", "", "start", "", "end", "(Ljava/lang/CharSequence;II)V", "index", "clone", "", "current", "", "first", "getBeginIndex", "getEndIndex", "getIndex", "last", "next", "previous", "setIndex", "position", "ui-text_release"}, m5176k = 1, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class CharSequenceCharacterIterator implements CharacterIterator {
    private final CharSequence charSequence;
    private final int end;
    private int index;
    private final int start;

    public CharSequenceCharacterIterator(CharSequence charSequence, int i4, int i5) {
        Intrinsics.checkNotNullParameter(charSequence, "charSequence");
        this.charSequence = charSequence;
        this.start = i4;
        this.end = i5;
        this.index = i4;
    }

    @Override // java.text.CharacterIterator
    public Object clone() {
        try {
            Object objClone = super.clone();
            Intrinsics.checkNotNullExpressionValue(objClone, "{\n            @Suppress(…  super.clone()\n        }");
            return objClone;
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    @Override // java.text.CharacterIterator
    public char current() {
        int i4 = this.index;
        return i4 == this.end ? CharCompanionObject.MAX_VALUE : this.charSequence.charAt(i4);
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
        int i4 = this.start;
        int i5 = this.end;
        if (i4 == i5) {
            this.index = i5;
            return CharCompanionObject.MAX_VALUE;
        }
        int i6 = i5 - 1;
        this.index = i6;
        return this.charSequence.charAt(i6);
    }

    @Override // java.text.CharacterIterator
    public char next() {
        int i4 = this.index + 1;
        this.index = i4;
        int i5 = this.end;
        if (i4 < i5) {
            return this.charSequence.charAt(i4);
        }
        this.index = i5;
        return CharCompanionObject.MAX_VALUE;
    }

    @Override // java.text.CharacterIterator
    public char previous() {
        int i4 = this.index;
        if (i4 <= this.start) {
            return CharCompanionObject.MAX_VALUE;
        }
        int i5 = i4 - 1;
        this.index = i5;
        return this.charSequence.charAt(i5);
    }

    @Override // java.text.CharacterIterator
    public char setIndex(int position) {
        int i4 = this.start;
        boolean z3 = false;
        if (position <= this.end && i4 <= position) {
            z3 = true;
        }
        if (!z3) {
            throw new IllegalArgumentException("invalid position");
        }
        this.index = position;
        return current();
    }
}
