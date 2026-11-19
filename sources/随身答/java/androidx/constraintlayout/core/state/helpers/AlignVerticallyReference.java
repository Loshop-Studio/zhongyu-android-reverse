package androidx.constraintlayout.core.state.helpers;

import androidx.constraintlayout.core.state.ConstraintReference;
import androidx.constraintlayout.core.state.HelperReference;
import androidx.constraintlayout.core.state.State;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public class AlignVerticallyReference extends HelperReference {
    private float mBias;

    public AlignVerticallyReference(State state) {
        super(state, State.Helper.ALIGN_VERTICALLY);
        this.mBias = 0.5f;
    }

    @Override // androidx.constraintlayout.core.state.HelperReference, androidx.constraintlayout.core.state.ConstraintReference, androidx.constraintlayout.core.state.Reference
    public void apply() {
        ArrayList<Object> arrayList = this.mReferences;
        int size = arrayList.size();
        int i9 = 0;
        while (i9 < size) {
            Object obj = arrayList.get(i9);
            i9++;
            ConstraintReference constraintReferenceConstraints = this.mHelperState.constraints(obj);
            constraintReferenceConstraints.clearVertical();
            Object obj2 = this.mTopToTop;
            if (obj2 != null) {
                constraintReferenceConstraints.topToTop(obj2);
            } else {
                Object obj3 = this.mTopToBottom;
                if (obj3 != null) {
                    constraintReferenceConstraints.topToBottom(obj3);
                } else {
                    constraintReferenceConstraints.topToTop(State.PARENT);
                }
            }
            Object obj4 = this.mBottomToTop;
            if (obj4 != null) {
                constraintReferenceConstraints.bottomToTop(obj4);
            } else {
                Object obj5 = this.mBottomToBottom;
                if (obj5 != null) {
                    constraintReferenceConstraints.bottomToBottom(obj5);
                } else {
                    constraintReferenceConstraints.bottomToBottom(State.PARENT);
                }
            }
            float f10 = this.mBias;
            if (f10 != 0.5f) {
                constraintReferenceConstraints.verticalBias(f10);
            }
        }
    }
}
