package androidx.constraintlayout.core.parser;

import com.efs.sdk.base.protocol.file.section.AbsSection;
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
    public String toFormattedJSON(int i9, int i10) {
        StringBuilder sb = new StringBuilder();
        String json = toJSON();
        if (i10 > 0 || json.length() + i9 >= CLElement.sMaxLine) {
            sb.append("[\n");
            ArrayList<CLElement> arrayList = this.mElements;
            int size = arrayList.size();
            int i11 = 0;
            boolean z9 = true;
            while (i11 < size) {
                CLElement cLElement = arrayList.get(i11);
                i11++;
                CLElement cLElement2 = cLElement;
                if (z9) {
                    z9 = false;
                } else {
                    sb.append(",\n");
                }
                addIndent(sb, CLElement.sBaseIndent + i9);
                sb.append(cLElement2.toFormattedJSON(CLElement.sBaseIndent + i9, i10 - 1));
            }
            sb.append(AbsSection.SEP_ORIGIN_LINE_BREAK);
            addIndent(sb, i9);
            sb.append("]");
        } else {
            sb.append(json);
        }
        return sb.toString();
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    public String toJSON() {
        StringBuilder sb = new StringBuilder(getDebugName() + "[");
        boolean z9 = true;
        for (int i9 = 0; i9 < this.mElements.size(); i9++) {
            if (z9) {
                z9 = false;
            } else {
                sb.append(", ");
            }
            sb.append(this.mElements.get(i9).toJSON());
        }
        return ((Object) sb) + "]";
    }
}
