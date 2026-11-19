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
    public String toFormattedJSON(int i10, int i11) {
        StringBuilder sb2 = new StringBuilder();
        String json = toJSON();
        if (i11 > 0 || json.length() + i10 >= CLElement.sMaxLine) {
            sb2.append("[\n");
            ArrayList<CLElement> arrayList = this.mElements;
            int size = arrayList.size();
            int i12 = 0;
            boolean z10 = true;
            while (i12 < size) {
                CLElement cLElement = arrayList.get(i12);
                i12++;
                CLElement cLElement2 = cLElement;
                if (z10) {
                    z10 = false;
                } else {
                    sb2.append(",\n");
                }
                addIndent(sb2, CLElement.sBaseIndent + i10);
                sb2.append(cLElement2.toFormattedJSON(CLElement.sBaseIndent + i10, i11 - 1));
            }
            sb2.append(SignParameters.NEW_LINE);
            addIndent(sb2, i10);
            sb2.append("]");
        } else {
            sb2.append(json);
        }
        return sb2.toString();
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    public String toJSON() {
        StringBuilder sb2 = new StringBuilder(getDebugName() + "[");
        boolean z10 = true;
        for (int i10 = 0; i10 < this.mElements.size(); i10++) {
            if (z10) {
                z10 = false;
            } else {
                sb2.append(", ");
            }
            sb2.append(this.mElements.get(i10).toJSON());
        }
        return ((Object) sb2) + "]";
    }
}
