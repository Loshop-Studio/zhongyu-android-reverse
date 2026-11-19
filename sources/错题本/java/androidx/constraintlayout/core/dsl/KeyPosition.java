package androidx.constraintlayout.core.dsl;

import android.support.v4.media.AbstractC0037f;
import androidx.constraintlayout.core.motion.utils.TypedValues;

/* loaded from: classes2.dex */
public class KeyPosition extends Keys {
    private int mFrame;
    private String mTarget;
    private String mTransitionEasing = null;
    private float mPercentWidth = Float.NaN;
    private float mPercentHeight = Float.NaN;
    private float mPercentX = Float.NaN;
    private float mPercentY = Float.NaN;
    private Type mPositionType = Type.CARTESIAN;

    public enum Type {
        CARTESIAN,
        SCREEN,
        PATH
    }

    public KeyPosition(String str, int i) {
        this.mTarget = null;
        this.mFrame = 0;
        this.mTarget = str;
        this.mFrame = i;
    }

    public int getFrames() {
        return this.mFrame;
    }

    public float getPercentHeight() {
        return this.mPercentHeight;
    }

    public float getPercentWidth() {
        return this.mPercentWidth;
    }

    public float getPercentX() {
        return this.mPercentX;
    }

    public float getPercentY() {
        return this.mPercentY;
    }

    public Type getPositionType() {
        return this.mPositionType;
    }

    public String getTarget() {
        return this.mTarget;
    }

    public String getTransitionEasing() {
        return this.mTransitionEasing;
    }

    public void setFrames(int i) {
        this.mFrame = i;
    }

    public void setPercentHeight(float f) {
        this.mPercentHeight = f;
    }

    public void setPercentWidth(float f) {
        this.mPercentWidth = f;
    }

    public void setPercentX(float f) {
        this.mPercentX = f;
    }

    public void setPercentY(float f) {
        this.mPercentY = f;
    }

    public void setPositionType(Type type) {
        this.mPositionType = type;
    }

    public void setTarget(String str) {
        this.mTarget = str;
    }

    public void setTransitionEasing(String str) {
        this.mTransitionEasing = str;
    }

    public String toString() {
        StringBuilder sbM97v = AbstractC0037f.m97v("KeyPositions:{\n");
        append(sbM97v, TypedValues.AttributesType.S_TARGET, this.mTarget);
        sbM97v.append("frame:");
        sbM97v.append(this.mFrame);
        sbM97v.append(",\n");
        if (this.mPositionType != null) {
            sbM97v.append("type:'");
            sbM97v.append(this.mPositionType);
            sbM97v.append("',\n");
        }
        append(sbM97v, "easing", this.mTransitionEasing);
        append(sbM97v, "percentX", this.mPercentX);
        append(sbM97v, "percentY", this.mPercentY);
        append(sbM97v, "percentWidth", this.mPercentWidth);
        append(sbM97v, "percentHeight", this.mPercentHeight);
        sbM97v.append("},\n");
        return sbM97v.toString();
    }
}
