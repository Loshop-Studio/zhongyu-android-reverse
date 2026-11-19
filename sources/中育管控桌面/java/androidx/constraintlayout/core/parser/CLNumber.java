package androidx.constraintlayout.core.parser;

/* loaded from: classes2.dex */
public class CLNumber extends CLElement {
    float mValue;

    public CLNumber(char[] cArr) {
        super(cArr);
        this.mValue = Float.NaN;
    }

    public static CLElement allocate(char[] cArr) {
        return new CLNumber(cArr);
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CLNumber) {
            float f6 = getFloat();
            float f7 = ((CLNumber) obj).getFloat();
            if ((Float.isNaN(f6) && Float.isNaN(f7)) || f6 == f7) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    public float getFloat() {
        if (Float.isNaN(this.mValue) && hasContent()) {
            this.mValue = Float.parseFloat(content());
        }
        return this.mValue;
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    public int getInt() {
        if (Float.isNaN(this.mValue) && hasContent()) {
            this.mValue = Integer.parseInt(content());
        }
        return (int) this.mValue;
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    public int hashCode() {
        int iHashCode = super.hashCode() * 31;
        float f6 = this.mValue;
        return iHashCode + (f6 != 0.0f ? Float.floatToIntBits(f6) : 0);
    }

    public boolean isInt() {
        float f6 = getFloat();
        return ((float) ((int) f6)) == f6;
    }

    public void putValue(float f6) {
        this.mValue = f6;
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    public String toFormattedJSON(int i6, int i7) {
        StringBuilder sb = new StringBuilder();
        addIndent(sb, i6);
        float f6 = getFloat();
        int i8 = (int) f6;
        if (i8 == f6) {
            sb.append(i8);
        } else {
            sb.append(f6);
        }
        return sb.toString();
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    public String toJSON() {
        float f6 = getFloat();
        int i6 = (int) f6;
        if (i6 == f6) {
            return "" + i6;
        }
        return "" + f6;
    }

    public CLNumber(float f6) {
        super(null);
        this.mValue = f6;
    }
}
