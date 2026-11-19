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
    public String toFormattedJSON(int i6, int i7) {
        StringBuilder sb = new StringBuilder();
        String json = toJSON();
        if (i7 > 0 || json.length() + i6 >= CLElement.sMaxLine) {
            sb.append("[\n");
            ArrayList<CLElement> arrayList = this.mElements;
            int size = arrayList.size();
            int i8 = 0;
            boolean z6 = true;
            while (i8 < size) {
                CLElement cLElement = arrayList.get(i8);
                i8++;
                CLElement cLElement2 = cLElement;
                if (z6) {
                    z6 = false;
                } else {
                    sb.append(",\n");
                }
                addIndent(sb, CLElement.sBaseIndent + i6);
                sb.append(cLElement2.toFormattedJSON(CLElement.sBaseIndent + i6, i7 - 1));
            }
            sb.append(SignParameters.NEW_LINE);
            addIndent(sb, i6);
            sb.append("]");
        } else {
            sb.append(json);
        }
        return sb.toString();
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    public String toJSON() {
        StringBuilder sb = new StringBuilder(getDebugName() + "[");
        boolean z6 = true;
        for (int i6 = 0; i6 < this.mElements.size(); i6++) {
            if (z6) {
                z6 = false;
            } else {
                sb.append(", ");
            }
            sb.append(this.mElements.get(i6).toJSON());
        }
        return ((Object) sb) + "]";
    }
}
