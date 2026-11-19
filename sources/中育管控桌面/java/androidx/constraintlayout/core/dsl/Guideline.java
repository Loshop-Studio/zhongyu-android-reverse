package androidx.constraintlayout.core.dsl;

import androidx.constraintlayout.core.dsl.Helper;

/* loaded from: classes2.dex */
public abstract class Guideline extends Helper {
    private int mEnd;
    private float mPercent;
    private int mStart;

    public Guideline(String str) {
        super(str, new Helper.HelperType(""));
        this.mStart = Integer.MIN_VALUE;
        this.mEnd = Integer.MIN_VALUE;
        this.mPercent = Float.NaN;
    }

    public int getEnd() {
        return this.mEnd;
    }

    public float getPercent() {
        return this.mPercent;
    }

    public int getStart() {
        return this.mStart;
    }

    public void setEnd(int i6) {
        this.mEnd = i6;
        this.configMap.put("end", String.valueOf(i6));
    }

    public void setPercent(float f6) {
        this.mPercent = f6;
        this.configMap.put("percent", String.valueOf(f6));
    }

    public void setStart(int i6) {
        this.mStart = i6;
        this.configMap.put("start", String.valueOf(i6));
    }
}
