package androidx.constraintlayout.core.dsl;

import java.util.ArrayList;

/* loaded from: classes2.dex */
public class KeyFrames {
    ArrayList<Keys> mKeys = new ArrayList<>();

    public void add(Keys keys) {
        this.mKeys.add(keys);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        if (!this.mKeys.isEmpty()) {
            sb2.append("keyFrames:{\n");
            ArrayList<Keys> arrayList = this.mKeys;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Keys keys = arrayList.get(i10);
                i10++;
                sb2.append(keys.toString());
            }
            sb2.append("},\n");
        }
        return sb2.toString();
    }
}
