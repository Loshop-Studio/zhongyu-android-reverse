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
            float f10 = getFloat();
            float f11 = ((CLNumber) obj).getFloat();
            if ((Float.isNaN(f10) && Float.isNaN(f11)) || f10 == f11) {
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
        float f10 = this.mValue;
        return iHashCode + (f10 != 0.0f ? Float.floatToIntBits(f10) : 0);
    }

    public boolean isInt() {
        float f10 = getFloat();
        return ((float) ((int) f10)) == f10;
    }

    public void putValue(float f10) {
        this.mValue = f10;
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    public String toFormattedJSON(int i9, int i10) {
        StringBuilder sb = new StringBuilder();
        addIndent(sb, i9);
        float f10 = getFloat();
        int i11 = (int) f10;
        if (i11 == f10) {
            sb.append(i11);
        } else {
            sb.append(f10);
        }
        return sb.toString();
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    public String toJSON() {
        float f10 = getFloat();
        int i9 = (int) f10;
        if (i9 == f10) {
            return "" + i9;
        }
        return "" + f10;
    }

    public CLNumber(float f10) {
        super(null);
        this.mValue = f10;
    }
}
