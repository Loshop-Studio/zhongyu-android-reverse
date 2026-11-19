package androidx.constraintlayout.core.parser;

import androidx.annotation.NonNull;
import com.alibaba.sdk.android.oss.signer.SignParameters;
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
        StringBuilder sb2 = new StringBuilder(getDebugName() + "{ ");
        ArrayList<CLElement> arrayList = this.mElements;
        int size = arrayList.size();
        boolean z10 = true;
        int i10 = 0;
        while (i10 < size) {
            CLElement cLElement = arrayList.get(i10);
            i10++;
            CLElement cLElement2 = cLElement;
            if (z10) {
                z10 = false;
            } else {
                sb2.append(", ");
            }
            sb2.append(cLElement2.toJSON());
        }
        sb2.append(" }");
        return sb2.toString();
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    public String toFormattedJSON(int i10, int i11) {
        StringBuilder sb2 = new StringBuilder(getDebugName());
        sb2.append("{\n");
        ArrayList<CLElement> arrayList = this.mElements;
        int size = arrayList.size();
        boolean z10 = true;
        int i12 = 0;
        while (i12 < size) {
            CLElement cLElement = arrayList.get(i12);
            i12++;
            CLElement cLElement2 = cLElement;
            if (z10) {
                z10 = false;
            } else {
                sb2.append(",\n");
            }
            sb2.append(cLElement2.toFormattedJSON(CLElement.sBaseIndent + i10, i11 - 1));
        }
        sb2.append(SignParameters.NEW_LINE);
        addIndent(sb2, i10);
        sb2.append("}");
        return sb2.toString();
    }

    @Override // androidx.constraintlayout.core.parser.CLContainer, androidx.constraintlayout.core.parser.CLElement
    @NonNull
    /* renamed from: clone */
    public CLObject mo33771clone() {
        return (CLObject) super.mo33771clone();
    }
}
