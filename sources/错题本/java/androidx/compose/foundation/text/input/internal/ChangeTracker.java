package androidx.compose.foundation.text.input.internal;

import android.support.v4.media.AbstractC0037f;
import androidx.collection.AbstractC0584a;
import androidx.compose.foundation.text.input.TextFieldBuffer;
import androidx.compose.p011ui.text.TextRangeKt;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m5109d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001:\u0001&B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0003\u0010\u0004J1\u0010\f\u001a\u00020\u000b2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\f\u0010\rJ%\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u000b¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0007H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0007H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001a\u0010\u0018J\u000f\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u001c\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00050\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u001c\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00050\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010!R\u0014\u0010%\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006'"}, m5110d2 = {"Landroidx/compose/foundation/text/input/internal/ChangeTracker;", "Landroidx/compose/foundation/text/input/TextFieldBuffer$ChangeList;", "initialChanges", "<init>", "(Landroidx/compose/foundation/text/input/internal/ChangeTracker;)V", "Landroidx/compose/foundation/text/input/internal/ChangeTracker$Change;", "mergedOverlappingChange", "", "preMin", "preMax", "postDelta", "Ld6/s;", "appendNewChange", "(Landroidx/compose/foundation/text/input/internal/ChangeTracker$Change;III)V", "preStart", "preEnd", "postLength", "trackChange", "(III)V", "clearChanges", "()V", "changeIndex", "Landroidx/compose/ui/text/TextRange;", "getRange--jx7JFs", "(I)J", "getRange", "getOriginalRange--jx7JFs", "getOriginalRange", "", "toString", "()Ljava/lang/String;", "Landroidx/compose/runtime/collection/MutableVector;", "_changes", "Landroidx/compose/runtime/collection/MutableVector;", "_changesTemp", "getChangeCount", "()I", "changeCount", "Change", "foundation_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nChangeTracker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChangeTracker.kt\nandroidx/compose/foundation/text/input/internal/ChangeTracker\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,198:1\n1101#2:199\n1083#2,2:200\n1101#2:202\n1083#2,2:203\n423#3,6:205\n641#3,2:211\n429#3,3:213\n472#3:216\n641#3,2:217\n472#3:219\n472#3:221\n435#3,9:222\n516#3:231\n641#3,2:232\n1#4:220\n*S KotlinDebug\n*F\n+ 1 ChangeTracker.kt\nandroidx/compose/foundation/text/input/internal/ChangeTracker\n*L\n31#1:199\n31#1:200,2\n32#1:202\n32#1:203,2\n35#1:205,6\n36#1:211,2\n35#1:213,3\n78#1:216\n109#1:217,2\n131#1:219\n134#1:221\n138#1:222,9\n155#1:231\n188#1:232,2\n*E\n"})
/* loaded from: classes.dex */
public final class ChangeTracker implements TextFieldBuffer.ChangeList {
    public static final int $stable = 8;

    @NotNull
    private MutableVector<Change> _changes;

    @NotNull
    private MutableVector<Change> _changesTemp;

    @Metadata(m5109d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J1\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\t\"\u0004\b\u000f\u0010\u000bR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\t\"\u0004\b\u0011\u0010\u000b¨\u0006\u001d"}, m5110d2 = {"Landroidx/compose/foundation/text/input/internal/ChangeTracker$Change;", "", "preStart", "", "preEnd", "originalStart", "originalEnd", "(IIII)V", "getOriginalEnd", "()I", "setOriginalEnd", "(I)V", "getOriginalStart", "setOriginalStart", "getPreEnd", "setPreEnd", "getPreStart", "setPreStart", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "foundation_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final /* data */ class Change {
        private int originalEnd;
        private int originalStart;
        private int preEnd;
        private int preStart;

        public Change(int i, int i8, int i9, int i10) {
            this.preStart = i;
            this.preEnd = i8;
            this.originalStart = i9;
            this.originalEnd = i10;
        }

        public static /* synthetic */ Change copy$default(Change change, int i, int i8, int i9, int i10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i = change.preStart;
            }
            if ((i11 & 2) != 0) {
                i8 = change.preEnd;
            }
            if ((i11 & 4) != 0) {
                i9 = change.originalStart;
            }
            if ((i11 & 8) != 0) {
                i10 = change.originalEnd;
            }
            return change.copy(i, i8, i9, i10);
        }

        /* renamed from: component1, reason: from getter */
        public final int getPreStart() {
            return this.preStart;
        }

        /* renamed from: component2, reason: from getter */
        public final int getPreEnd() {
            return this.preEnd;
        }

        /* renamed from: component3, reason: from getter */
        public final int getOriginalStart() {
            return this.originalStart;
        }

        /* renamed from: component4, reason: from getter */
        public final int getOriginalEnd() {
            return this.originalEnd;
        }

        @NotNull
        public final Change copy(int preStart, int preEnd, int originalStart, int originalEnd) {
            return new Change(preStart, preEnd, originalStart, originalEnd);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Change)) {
                return false;
            }
            Change change = (Change) other;
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
            return Integer.hashCode(this.originalEnd) + AbstractC0584a.m902c(this.originalStart, AbstractC0584a.m902c(this.preEnd, Integer.hashCode(this.preStart) * 31, 31), 31);
        }

        public final void setOriginalEnd(int i) {
            this.originalEnd = i;
        }

        public final void setOriginalStart(int i) {
            this.originalStart = i;
        }

        public final void setPreEnd(int i) {
            this.preEnd = i;
        }

        public final void setPreStart(int i) {
            this.preStart = i;
        }

        @NotNull
        public String toString() {
            StringBuilder sb = new StringBuilder("Change(preStart=");
            sb.append(this.preStart);
            sb.append(", preEnd=");
            sb.append(this.preEnd);
            sb.append(", originalStart=");
            sb.append(this.originalStart);
            sb.append(", originalEnd=");
            return AbstractC0037f.m88m(sb, this.originalEnd, ')');
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ChangeTracker() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    private final void appendNewChange(Change mergedOverlappingChange, int preMin, int preMax, int postDelta) {
        int preEnd;
        if (this._changesTemp.getSize() == 0) {
            preEnd = 0;
        } else {
            Change changeLast = this._changesTemp.last();
            preEnd = changeLast.getPreEnd() - changeLast.getOriginalEnd();
        }
        if (mergedOverlappingChange == null) {
            int i = preMin - preEnd;
            mergedOverlappingChange = new Change(preMin, preMax + postDelta, i, (preMax - preMin) + i);
        } else {
            if (mergedOverlappingChange.getPreStart() > preMin) {
                mergedOverlappingChange.setPreStart(preMin);
                mergedOverlappingChange.setOriginalStart(preMin);
            }
            if (preMax > mergedOverlappingChange.getPreEnd()) {
                int preEnd2 = mergedOverlappingChange.getPreEnd() - mergedOverlappingChange.getOriginalEnd();
                mergedOverlappingChange.setPreEnd(preMax);
                mergedOverlappingChange.setOriginalEnd(preMax - preEnd2);
            }
            mergedOverlappingChange.setPreEnd(mergedOverlappingChange.getPreEnd() + postDelta);
        }
        this._changesTemp.add(mergedOverlappingChange);
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
    public long mo7747getOriginalRangejx7JFs(int changeIndex) {
        Change change = this._changes.content[changeIndex];
        return TextRangeKt.TextRange(change.getOriginalStart(), change.getOriginalEnd());
    }

    @Override // androidx.compose.foundation.text.input.TextFieldBuffer.ChangeList
    /* renamed from: getRange--jx7JFs */
    public long mo7748getRangejx7JFs(int changeIndex) {
        Change change = this._changes.content[changeIndex];
        return TextRangeKt.TextRange(change.getPreStart(), change.getPreEnd());
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("ChangeList(changes=[");
        MutableVector<Change> mutableVector = this._changes;
        Change[] changeArr = mutableVector.content;
        int size = mutableVector.getSize();
        for (int i = 0; i < size; i++) {
            Change change = changeArr[i];
            sb.append("(" + change.getOriginalStart() + ',' + change.getOriginalEnd() + ")->(" + change.getPreStart() + ',' + change.getPreEnd() + ')');
            if (i < getChangeCount() - 1) {
                sb.append(", ");
            }
        }
        sb.append("])");
        String string = sb.toString();
        AbstractC5830k.m5329f(string, "toString(...)");
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

    public ChangeTracker(@Nullable ChangeTracker changeTracker) {
        MutableVector<Change> mutableVector;
        this._changes = new MutableVector<>(new Change[16], 0);
        this._changesTemp = new MutableVector<>(new Change[16], 0);
        if (changeTracker == null || (mutableVector = changeTracker._changes) == null) {
            return;
        }
        Change[] changeArr = mutableVector.content;
        int size = mutableVector.getSize();
        for (int i = 0; i < size; i++) {
            Change change = changeArr[i];
            this._changes.add(new Change(change.getPreStart(), change.getPreEnd(), change.getOriginalStart(), change.getOriginalEnd()));
        }
    }

    public /* synthetic */ ChangeTracker(ChangeTracker changeTracker, int i, AbstractC5824e abstractC5824e) {
        this((i & 1) != 0 ? null : changeTracker);
    }
}
