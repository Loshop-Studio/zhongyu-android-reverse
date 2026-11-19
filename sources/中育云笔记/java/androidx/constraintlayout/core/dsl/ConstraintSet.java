package androidx.constraintlayout.core.dsl;

import java.util.ArrayList;

/* loaded from: classes2.dex */
public class ConstraintSet {
    ArrayList<Constraint> mConstraints = new ArrayList<>();
    ArrayList<Helper> mHelpers = new ArrayList<>();
    private final String mName;

    public ConstraintSet(String str) {
        this.mName = str;
    }

    public void add(Constraint constraint) {
        this.mConstraints.add(constraint);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(this.mName + ":{\n");
        int i10 = 0;
        if (!this.mConstraints.isEmpty()) {
            ArrayList<Constraint> arrayList = this.mConstraints;
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                Constraint constraint = arrayList.get(i11);
                i11++;
                sb2.append(constraint.toString());
            }
        }
        if (!this.mHelpers.isEmpty()) {
            ArrayList<Helper> arrayList2 = this.mHelpers;
            int size2 = arrayList2.size();
            while (i10 < size2) {
                Helper helper = arrayList2.get(i10);
                i10++;
                sb2.append(helper.toString());
            }
        }
        sb2.append("},\n");
        return sb2.toString();
    }

    public void add(Helper helper) {
        this.mHelpers.add(helper);
    }
}
