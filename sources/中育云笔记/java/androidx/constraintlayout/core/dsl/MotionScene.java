package androidx.constraintlayout.core.dsl;

import java.util.ArrayList;

/* loaded from: classes2.dex */
public class MotionScene {
    ArrayList<Transition> mTransitions = new ArrayList<>();
    ArrayList<ConstraintSet> mConstraintSets = new ArrayList<>();

    public void addConstraintSet(ConstraintSet constraintSet) {
        this.mConstraintSets.add(constraintSet);
    }

    public void addTransition(Transition transition) {
        this.mTransitions.add(transition);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("{\n");
        int i10 = 0;
        if (!this.mTransitions.isEmpty()) {
            sb2.append("Transitions:{\n");
            ArrayList<Transition> arrayList = this.mTransitions;
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                Transition transition = arrayList.get(i11);
                i11++;
                sb2.append(transition.toString());
            }
            sb2.append("},\n");
        }
        if (!this.mConstraintSets.isEmpty()) {
            sb2.append("ConstraintSets:{\n");
            ArrayList<ConstraintSet> arrayList2 = this.mConstraintSets;
            int size2 = arrayList2.size();
            while (i10 < size2) {
                ConstraintSet constraintSet = arrayList2.get(i10);
                i10++;
                sb2.append(constraintSet.toString());
            }
            sb2.append("},\n");
        }
        sb2.append("}\n");
        return sb2.toString();
    }
}
