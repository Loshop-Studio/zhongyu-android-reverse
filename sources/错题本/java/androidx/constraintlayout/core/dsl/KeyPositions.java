package androidx.constraintlayout.core.dsl;

import android.support.v4.media.AbstractC0037f;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.Arrays;

/* loaded from: classes2.dex */
public class KeyPositions extends Keys {
    private int[] mFrames;
    private String[] mTarget;
    private String mTransitionEasing = null;
    private Type mPositionType = null;
    private float[] mPercentWidth = null;
    private float[] mPercentHeight = null;
    private float[] mPercentX = null;
    private float[] mPercentY = null;

    public enum Type {
        CARTESIAN,
        SCREEN,
        PATH
    }

    public KeyPositions(int i, String... strArr) {
        this.mFrames = null;
        this.mTarget = strArr;
        this.mFrames = new int[i];
        float length = 100.0f / (r3.length + 1);
        int i8 = 0;
        while (true) {
            int[] iArr = this.mFrames;
            if (i8 >= iArr.length) {
                return;
            }
            iArr[i8] = (int) ((i8 * length) + length);
            i8++;
        }
    }

    public int[] getFrames() {
        return this.mFrames;
    }

    public float[] getPercentHeight() {
        return this.mPercentHeight;
    }

    public float[] getPercentWidth() {
        return this.mPercentWidth;
    }

    public float[] getPercentX() {
        return this.mPercentX;
    }

    public float[] getPercentY() {
        return this.mPercentY;
    }

    public Type getPositionType() {
        return this.mPositionType;
    }

    public String[] getTarget() {
        return this.mTarget;
    }

    public String getTransitionEasing() {
        return this.mTransitionEasing;
    }

    public void setFrames(int... iArr) {
        this.mFrames = iArr;
    }

    public void setPercentHeight(float... fArr) {
        this.mPercentHeight = fArr;
    }

    public void setPercentWidth(float... fArr) {
        this.mPercentWidth = fArr;
    }

    public void setPercentX(float... fArr) {
        this.mPercentX = fArr;
    }

    public void setPercentY(float... fArr) {
        this.mPercentY = fArr;
    }

    public void setPositionType(Type type) {
        this.mPositionType = type;
    }

    public void setTransitionEasing(String str) {
        this.mTransitionEasing = str;
    }

    public String toString() {
        StringBuilder sbM97v = AbstractC0037f.m97v("KeyPositions:{\n");
        append(sbM97v, TypedValues.AttributesType.S_TARGET, this.mTarget);
        sbM97v.append("frame:");
        sbM97v.append(Arrays.toString(this.mFrames));
        sbM97v.append(",\n");
        if (this.mPositionType != null) {
            sbM97v.append("type:'");
            sbM97v.append(this.mPositionType);
            sbM97v.append("',\n");
        }
        append(sbM97v, "easing", this.mTransitionEasing);
        append(sbM97v, "percentX", this.mPercentX);
        append(sbM97v, "percentX", this.mPercentY);
        append(sbM97v, "percentWidth", this.mPercentWidth);
        append(sbM97v, "percentHeight", this.mPercentHeight);
        sbM97v.append("},\n");
        return sbM97v.toString();
    }
}
