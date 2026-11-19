package androidx.constraintlayout.core.parser;

import com.alibaba.sdk.android.oss.signer.SignParameters;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public class CLArray extends CLContainer {
    public CLArray(char[] cArr) {
        super(cArr);
    }

    public static CLElement allocate(char[] cArr) {
        return new CLArray(cArr);
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    public String toFormattedJSON(int i, int i8) {
        StringBuilder sb = new StringBuilder();
        String json = toJSON();
        if (i8 > 0 || json.length() + i >= CLElement.sMaxLine) {
            sb.append("[\n");
            ArrayList<CLElement> arrayList = this.mElements;
            int size = arrayList.size();
            int i9 = 0;
            boolean z8 = true;
            while (i9 < size) {
                CLElement cLElement = arrayList.get(i9);
                i9++;
                CLElement cLElement2 = cLElement;
                if (z8) {
                    z8 = false;
                } else {
                    sb.append(",\n");
                }
                addIndent(sb, CLElement.sBaseIndent + i);
                sb.append(cLElement2.toFormattedJSON(CLElement.sBaseIndent + i, i8 - 1));
            }
            sb.append(SignParameters.NEW_LINE);
            addIndent(sb, i);
            sb.append("]");
        } else {
            sb.append(json);
        }
        return sb.toString();
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    public String toJSON() {
        StringBuilder sb = new StringBuilder(getDebugName() + "[");
        boolean z8 = true;
        for (int i = 0; i < this.mElements.size(); i++) {
            if (z8) {
                z8 = false;
            } else {
                sb.append(", ");
            }
            sb.append(this.mElements.get(i).toJSON());
        }
        return ((Object) sb) + "]";
    }
}
