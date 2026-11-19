package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import com.xuexiang.xui.widget.popupwindow.good.IGoodView;
import p121n.C2876l;

/* loaded from: classes.dex */
public abstract class VirtualLayout extends ConstraintHelper {

    /* renamed from: i */
    private boolean f1944i;

    /* renamed from: j */
    private boolean f1945j;

    public VirtualLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    /* renamed from: m */
    protected void mo1151m(AttributeSet attributeSet) {
        super.mo1151m(attributeSet);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C0298f.f2317a1);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i4 = 0; i4 < indexCount; i4++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i4);
                if (index == C0298f.f2387h1) {
                    this.f1944i = true;
                } else if (index == C0298f.f2455o1) {
                    this.f1945j = true;
                }
            }
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    public void onAttachedToWindow() throws IllegalAccessException, Resources.NotFoundException, IllegalArgumentException {
        ViewParent parent;
        super.onAttachedToWindow();
        if ((this.f1944i || this.f1945j) && (parent = getParent()) != null && (parent instanceof ConstraintLayout)) {
            ConstraintLayout constraintLayout = (ConstraintLayout) parent;
            int visibility = getVisibility();
            float elevation = getElevation();
            for (int i4 = 0; i4 < this.f1820b; i4++) {
                View viewM1611g = constraintLayout.m1611g(this.f1819a[i4]);
                if (viewM1611g != null) {
                    if (this.f1944i) {
                        viewM1611g.setVisibility(visibility);
                    }
                    if (this.f1945j && elevation > IGoodView.DEFAULT_TO_ALPHA) {
                        viewM1611g.setTranslationZ(viewM1611g.getTranslationZ() + elevation);
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f4) {
        super.setElevation(f4);
        m1594g();
    }

    @Override // android.view.View
    public void setVisibility(int i4) {
        super.setVisibility(i4);
        m1594g();
    }

    /* renamed from: v */
    public void mo1154v(C2876l c2876l, int i4, int i5) {
    }

    public VirtualLayout(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
    }
}
