package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.input.TextFieldBuffer;
import androidx.compose.p014ui.text.TextRangeKt;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class ChangeTracker implements TextFieldBuffer.ChangeList {
    public static final int $stable = 8;
    private MutableVector<Change> _changes;
    private MutableVector<Change> _changesTemp;

    public static final class Change {
        private int originalEnd;
        private int originalStart;
        private int preEnd;
        private int preStart;

        public Change(int i10, int i11, int i12, int i13) {
            this.preStart = i10;
            this.preEnd = i11;
            this.originalStart = i12;
            this.originalEnd = i13;
        }

        public static /* synthetic */ Change copy$default(Change change, int i10, int i11, int i12, int i13, int i14, Object obj) {
            if ((i14 & 1) != 0) {
                i10 = change.preStart;
            }
            if ((i14 & 2) != 0) {
                i11 = change.preEnd;
            }
            if ((i14 & 4) != 0) {
                i12 = change.originalStart;
            }
            if ((i14 & 8) != 0) {
                i13 = change.originalEnd;
            }
            return change.copy(i10, i11, i12, i13);
        }

        public final int component1() {
            return this.preStart;
        }

        public final int component2() {
            return this.preEnd;
        }

        public final int component3() {
            return this.originalStart;
        }

        public final int component4() {
            return this.originalEnd;
        }

        public final Change copy(int i10, int i11, int i12, int i13) {
            return new Change(i10, i11, i12, i13);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Change)) {
                return false;
            }
            Change change = (Change) obj;
            return this.preStart == change.preStart && this.preEnd == change.preEnd && this.originalStart == change.originalStart && this.originalEnd == change.originalEnd;
        }

        public final int getOriginalEnd() {
            return this.originalEnd;
        }

        public final int getOriginalStart() {
            return this.originalStart;
        }

        public final int getPreEnd() {
            return this.preEnd;
        }

        public final int getPreStart() {
            return this.preStart;
        }

        public int hashCode() {
            return (((((Integer.hashCode(this.preStart) * 31) + Integer.hashCode(this.preEnd)) * 31) + Integer.hashCode(this.originalStart)) * 31) + Integer.hashCode(this.originalEnd);
        }

        public final void setOriginalEnd(int i10) {
            this.originalEnd = i10;
        }

        public final void setOriginalStart(int i10) {
            this.originalStart = i10;
        }

        public final void setPreEnd(int i10) {
            this.preEnd = i10;
        }

        public final void setPreStart(int i10) {
            this.preStart = i10;
        }

        public String toString() {
            return "Change(preStart=" + this.preStart + ", preEnd=" + this.preEnd + ", originalStart=" + this.originalStart + ", originalEnd=" + this.originalEnd + ')';
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ChangeTracker() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    private final void appendNewChange(Change change, int i10, int i11, int i12) {
        int preEnd;
        if (this._changesTemp.getSize() == 0) {
            preEnd = 0;
        } else {
            Change changeLast = this._changesTemp.last();
            preEnd = changeLast.getPreEnd() - changeLast.getOriginalEnd();
        }
        if (change == null) {
            int i13 = i10 - preEnd;
            change = new Change(i10, i11 + i12, i13, (i11 - i10) + i13);
        } else {
            if (change.getPreStart() > i10) {
                change.setPreStart(i10);
                change.setOriginalStart(i10);
            }
            if (i11 > change.getPreEnd()) {
                int preEnd2 = change.getPreEnd() - change.getOriginalEnd();
                change.setPreEnd(i11);
                change.setOriginalEnd(i11 - preEnd2);
            }
            change.setPreEnd(change.getPreEnd() + i12);
        }
        this._changesTemp.add(change);
    }

    public final void clearChanges() {
        this._changes.clear();
    }

    @Override // androidx.compose.foundation.text.input.TextFieldBuffer.ChangeList
    public int getChangeCount() {
        return this._changes.getSize();
    }

    @Override // androidx.compose.foundation.text.input.TextFieldBuffer.ChangeList
    /* renamed from: getOriginalRange--jx7JFs */
    public long mo27943getOriginalRangejx7JFs(int i10) {
        Change change = this._changes.content[i10];
        return TextRangeKt.TextRange(change.getOriginalStart(), change.getOriginalEnd());
    }

    @Override // androidx.compose.foundation.text.input.TextFieldBuffer.ChangeList
    /* renamed from: getRange--jx7JFs */
    public long mo27944getRangejx7JFs(int i10) {
        Change change = this._changes.content[i10];
        return TextRangeKt.TextRange(change.getPreStart(), change.getPreEnd());
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("ChangeList(changes=[");
        MutableVector<Change> mutableVector = this._changes;
        Change[] changeArr = mutableVector.content;
        int size = mutableVector.getSize();
        for (int i10 = 0; i10 < size; i10++) {
            Change change = changeArr[i10];
            sb2.append('(' + change.getOriginalStart() + ',' + change.getOriginalEnd() + ")->(" + change.getPreStart() + ',' + change.getPreEnd() + ')');
            if (i10 < getChangeCount() - 1) {
                sb2.append(", ");
            }
        }
        sb2.append("])");
        String string = sb2.toString();
        AbstractC9979u.m20293f(string, "toString(...)");
        return string;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void trackChange(int r7, int r8, int r9) {
        /*
            r6 = this;
            if (r7 != r8) goto L5
            if (r9 != 0) goto L5
            return
        L5:
            int r0 = java.lang.Math.min(r7, r8)
            int r7 = java.lang.Math.max(r7, r8)
            int r8 = r7 - r0
            int r9 = r9 - r8
            r8 = 0
            r1 = 0
            r2 = r1
            r1 = r8
        L14:
            androidx.compose.runtime.collection.MutableVector<androidx.compose.foundation.text.input.internal.ChangeTracker$Change> r3 = r6._changes
            int r3 = r3.getSize()
            if (r8 >= r3) goto L88
            androidx.compose.runtime.collection.MutableVector<androidx.compose.foundation.text.input.internal.ChangeTracker$Change> r3 = r6._changes
            T[] r3 = r3.content
            r3 = r3[r8]
            androidx.compose.foundation.text.input.internal.ChangeTracker$Change r3 = (androidx.compose.foundation.text.input.internal.ChangeTracker.Change) r3
            int r4 = r3.getPreStart()
            if (r0 > r4) goto L2d
            if (r4 > r7) goto L2d
            goto L4f
        L2d:
            int r4 = r3.getPreEnd()
            if (r0 > r4) goto L36
            if (r4 > r7) goto L36
            goto L4f
        L36:
            int r4 = r3.getPreStart()
            int r5 = r3.getPreEnd()
            if (r0 > r5) goto L43
            if (r4 > r0) goto L43
            goto L4f
        L43:
            int r4 = r3.getPreStart()
            int r5 = r3.getPreEnd()
            if (r7 > r5) goto L64
            if (r4 > r7) goto L64
        L4f:
            if (r2 != 0) goto L53
            r2 = r3
            goto L61
        L53:
            int r4 = r3.getPreEnd()
            r2.setPreEnd(r4)
            int r3 = r3.getOriginalEnd()
            r2.setOriginalEnd(r3)
        L61:
            int r8 = r8 + 1
            goto L14
        L64:
            int r4 = r3.getPreStart()
            if (r4 <= r7) goto L70
            if (r1 != 0) goto L70
            r6.appendNewChange(r2, r0, r7, r9)
            r1 = 1
        L70:
            if (r1 == 0) goto L82
            int r4 = r3.getPreStart()
            int r4 = r4 + r9
            r3.setPreStart(r4)
            int r4 = r3.getPreEnd()
            int r4 = r4 + r9
            r3.setPreEnd(r4)
        L82:
            androidx.compose.runtime.collection.MutableVector<androidx.compose.foundation.text.input.internal.ChangeTracker$Change> r4 = r6._changesTemp
            r4.add(r3)
            goto L61
        L88:
            if (r1 != 0) goto L8d
            r6.appendNewChange(r2, r0, r7, r9)
        L8d:
            androidx.compose.runtime.collection.MutableVector<androidx.compose.foundation.text.input.internal.ChangeTracker$Change> r7 = r6._changes
            androidx.compose.runtime.collection.MutableVector<androidx.compose.foundation.text.input.internal.ChangeTracker$Change> r8 = r6._changesTemp
            r6._changes = r8
            r6._changesTemp = r7
            r7.clear()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.ChangeTracker.trackChange(int, int, int):void");
    }

    public ChangeTracker(ChangeTracker changeTracker) {
        MutableVector<Change> mutableVector;
        this._changes = new MutableVector<>(new Change[16], 0);
        this._changesTemp = new MutableVector<>(new Change[16], 0);
        if (changeTracker == null || (mutableVector = changeTracker._changes) == null) {
            return;
        }
        Change[] changeArr = mutableVector.content;
        int size = mutableVector.getSize();
        for (int i10 = 0; i10 < size; i10++) {
            Change change = changeArr[i10];
            this._changes.add(new Change(change.getPreStart(), change.getPreEnd(), change.getOriginalStart(), change.getOriginalEnd()));
        }
    }

    public /* synthetic */ ChangeTracker(ChangeTracker changeTracker, int i10, AbstractC9972n abstractC9972n) {
        this((i10 & 1) != 0 ? null : changeTracker);
    }
}
