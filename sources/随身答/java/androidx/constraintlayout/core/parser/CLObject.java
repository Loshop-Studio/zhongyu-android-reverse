package androidx.constraintlayout.core.parser;

import androidx.annotation.NonNull;
import com.efs.sdk.base.protocol.file.section.AbsSection;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes2.dex */
public class CLObject extends CLContainer implements Iterable<CLKey> {

    public static class CLObjectIterator implements Iterator<CLKey> {
        int mIndex = 0;
        CLObject mObject;

        public CLObjectIterator(CLObject cLObject) {
            this.mObject = cLObject;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.mIndex < this.mObject.size();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.Iterator
        public CLKey next() {
            CLKey cLKey = (CLKey) this.mObject.mElements.get(this.mIndex);
            this.mIndex++;
            return cLKey;
        }
    }

    public CLObject(char[] cArr) {
        super(cArr);
    }

    public static CLObject allocate(char[] cArr) {
        return new CLObject(cArr);
    }

    @Override // java.lang.Iterable
    public Iterator<CLKey> iterator() {
        return new CLObjectIterator(this);
    }

    public String toFormattedJSON() {
        return toFormattedJSON(0, 0);
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    public String toJSON() {
        StringBuilder sb = new StringBuilder(getDebugName() + "{ ");
        ArrayList<CLElement> arrayList = this.mElements;
        int size = arrayList.size();
        boolean z9 = true;
        int i9 = 0;
        while (i9 < size) {
            CLElement cLElement = arrayList.get(i9);
            i9++;
            CLElement cLElement2 = cLElement;
            if (z9) {
                z9 = false;
            } else {
                sb.append(", ");
            }
            sb.append(cLElement2.toJSON());
        }
        sb.append(" }");
        return sb.toString();
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    public String toFormattedJSON(int i9, int i10) {
        StringBuilder sb = new StringBuilder(getDebugName());
        sb.append("{\n");
        ArrayList<CLElement> arrayList = this.mElements;
        int size = arrayList.size();
        boolean z9 = true;
        int i11 = 0;
        while (i11 < size) {
            CLElement cLElement = arrayList.get(i11);
            i11++;
            CLElement cLElement2 = cLElement;
            if (z9) {
                z9 = false;
            } else {
                sb.append(",\n");
            }
            sb.append(cLElement2.toFormattedJSON(CLElement.sBaseIndent + i9, i10 - 1));
        }
        sb.append(AbsSection.SEP_ORIGIN_LINE_BREAK);
        addIndent(sb, i9);
        sb.append("}");
        return sb.toString();
    }

    @Override // androidx.constraintlayout.core.parser.CLContainer, androidx.constraintlayout.core.parser.CLElement
    @NonNull
    /* renamed from: clone */
    public CLObject mo24476clone() {
        return (CLObject) super.mo24476clone();
    }
}
