package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.C0298f;
import androidx.constraintlayout.widget.ConstraintHelper;
import androidx.constraintlayout.widget.ConstraintLayout;

/* loaded from: classes.dex */
public class MotionHelper extends ConstraintHelper implements MotionLayout.InterfaceC0263i {

    /* renamed from: i */
    private boolean f1347i;

    /* renamed from: j */
    private boolean f1348j;

    /* renamed from: k */
    private float f1349k;

    /* renamed from: l */
    protected View[] f1350l;

    public MotionHelper(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1347i = false;
        this.f1348j = false;
        mo1151m(attributeSet);
    }

    @Override // androidx.constraintlayout.motion.widget.MotionLayout.InterfaceC0263i
    /* renamed from: a */
    public void mo1160a(MotionLayout motionLayout, int i4, int i5, float f4) {
    }

    @Override // androidx.constraintlayout.motion.widget.MotionLayout.InterfaceC0263i
    /* renamed from: b */
    public void mo1161b(MotionLayout motionLayout, int i4, int i5) {
    }

    @Override // androidx.constraintlayout.motion.widget.MotionLayout.InterfaceC0263i
    /* renamed from: c */
    public void mo1162c(MotionLayout motionLayout, int i4, boolean z3, float f4) {
    }

    @Override // androidx.constraintlayout.motion.widget.MotionLayout.InterfaceC0263i
    /* renamed from: d */
    public void mo1163d(MotionLayout motionLayout, int i4) {
    }

    public float getProgress() {
        return this.f1349k;
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    /* renamed from: m */
    protected void mo1151m(AttributeSet attributeSet) {
        super.mo1151m(attributeSet);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C0298f.f2124E6);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i4 = 0; i4 < indexCount; i4++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i4);
                if (index == C0298f.f2142G6) {
                    this.f1347i = typedArrayObtainStyledAttributes.getBoolean(index, this.f1347i);
                } else if (index == C0298f.f2133F6) {
                    this.f1348j = typedArrayObtainStyledAttributes.getBoolean(index, this.f1348j);
                }
            }
        }
    }

    public void setProgress(float f4) {
        this.f1349k = f4;
        int i4 = 0;
        if (this.f1820b > 0) {
            this.f1350l = m1596l((ConstraintLayout) getParent());
            while (i4 < this.f1820b) {
                m1166x(this.f1350l[i4], f4);
                i4++;
            }
            return;
        }
        ViewGroup viewGroup = (ViewGroup) getParent();
        int childCount = viewGroup.getChildCount();
        while (i4 < childCount) {
            View childAt = viewGroup.getChildAt(i4);
            if (!(childAt instanceof MotionHelper)) {
                m1166x(childAt, f4);
            }
            i4++;
        }
    }

    /* renamed from: v */
    public boolean m1164v() {
        return this.f1348j;
    }

    /* renamed from: w */
    public boolean m1165w() {
        return this.f1347i;
    }

    /* renamed from: x */
    public void m1166x(View view, float f4) {
    }

    public MotionHelper(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f1347i = false;
        this.f1348j = false;
        mo1151m(attributeSet);
    }
}
