package androidx.constraintlayout.core.state.helpers;

import androidx.constraintlayout.core.state.ConstraintReference;
import androidx.constraintlayout.core.state.State;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public class VerticalChainReference extends ChainReference {

    /* renamed from: androidx.constraintlayout.core.state.helpers.VerticalChainReference$1 */
    public static /* synthetic */ class C25681 {
        static final /* synthetic */ int[] $SwitchMap$androidx$constraintlayout$core$state$State$Chain;

        static {
            int[] iArr = new int[State.Chain.values().length];
            $SwitchMap$androidx$constraintlayout$core$state$State$Chain = iArr;
            try {
                iArr[State.Chain.SPREAD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$state$State$Chain[State.Chain.SPREAD_INSIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$androidx$constraintlayout$core$state$State$Chain[State.Chain.PACKED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public VerticalChainReference(State state) {
        super(state, State.Helper.VERTICAL_CHAIN);
    }

    @Override // androidx.constraintlayout.core.state.HelperReference, androidx.constraintlayout.core.state.ConstraintReference, androidx.constraintlayout.core.state.Reference
    public void apply() {
        ArrayList<Object> arrayList = this.mReferences;
        int size = arrayList.size();
        int i6 = 0;
        while (i6 < size) {
            Object obj = arrayList.get(i6);
            i6++;
            this.mHelperState.constraints(obj).clearVertical();
        }
        ArrayList<Object> arrayList2 = this.mReferences;
        int size2 = arrayList2.size();
        ConstraintReference constraintReference = null;
        int i7 = 0;
        ConstraintReference constraintReference2 = null;
        while (i7 < size2) {
            Object obj2 = arrayList2.get(i7);
            i7++;
            ConstraintReference constraintReferenceConstraints = this.mHelperState.constraints(obj2);
            if (constraintReference2 == null) {
                Object obj3 = this.mTopToTop;
                if (obj3 != null) {
                    constraintReferenceConstraints.topToTop(obj3).margin(this.mMarginTop).marginGone(this.mMarginTopGone);
                } else {
                    Object obj4 = this.mTopToBottom;
                    if (obj4 != null) {
                        constraintReferenceConstraints.topToBottom(obj4).margin(this.mMarginTop).marginGone(this.mMarginTopGone);
                    } else {
                        String string = constraintReferenceConstraints.getKey().toString();
                        constraintReferenceConstraints.topToTop(State.PARENT).margin(Float.valueOf(getPreMargin(string))).marginGone(Float.valueOf(getPreGoneMargin(string)));
                    }
                }
                constraintReference2 = constraintReferenceConstraints;
            }
            if (constraintReference != null) {
                String string2 = constraintReference.getKey().toString();
                String string3 = constraintReferenceConstraints.getKey().toString();
                constraintReference.bottomToTop(constraintReferenceConstraints.getKey()).margin(Float.valueOf(getPostMargin(string2))).marginGone(Float.valueOf(getPostGoneMargin(string2)));
                constraintReferenceConstraints.topToBottom(constraintReference.getKey()).margin(Float.valueOf(getPreMargin(string3))).marginGone(Float.valueOf(getPreGoneMargin(string3)));
            }
            float weight = getWeight(obj2.toString());
            if (weight != -1.0f) {
                constraintReferenceConstraints.setVerticalChainWeight(weight);
            }
            constraintReference = constraintReferenceConstraints;
        }
        if (constraintReference != null) {
            Object obj5 = this.mBottomToTop;
            if (obj5 != null) {
                constraintReference.bottomToTop(obj5).margin(this.mMarginBottom).marginGone(this.mMarginBottomGone);
            } else {
                Object obj6 = this.mBottomToBottom;
                if (obj6 != null) {
                    constraintReference.bottomToBottom(obj6).margin(this.mMarginBottom).marginGone(this.mMarginBottomGone);
                } else {
                    String string4 = constraintReference.getKey().toString();
                    constraintReference.bottomToBottom(State.PARENT).margin(Float.valueOf(getPostMargin(string4))).marginGone(Float.valueOf(getPostGoneMargin(string4)));
                }
            }
        }
        if (constraintReference2 == null) {
            return;
        }
        float f6 = this.mBias;
        if (f6 != 0.5f) {
            constraintReference2.verticalBias(f6);
        }
        int i8 = C25681.$SwitchMap$androidx$constraintlayout$core$state$State$Chain[this.mStyle.ordinal()];
        if (i8 == 1) {
            constraintReference2.setVerticalChainStyle(0);
        } else if (i8 == 2) {
            constraintReference2.setVerticalChainStyle(1);
        } else {
            if (i8 != 3) {
                return;
            }
            constraintReference2.setVerticalChainStyle(2);
        }
    }
}
