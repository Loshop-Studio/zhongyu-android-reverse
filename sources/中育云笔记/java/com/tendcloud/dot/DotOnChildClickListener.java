package com.tendcloud.dot;

import android.view.View;
import android.widget.ExpandableListView;
import com.tendcloud.tenddata.C7896ca;

/* loaded from: classes5.dex */
public class DotOnChildClickListener implements ExpandableListView.OnChildClickListener {

    /* renamed from: a */
    private static DotOnChildClickCallback f14170a;

    /* renamed from: b */
    private ExpandableListView.OnChildClickListener f14171b;

    public interface DotOnChildClickCallback {
        boolean onChildClick(ExpandableListView expandableListView, View view, int i10, int i11, long j10);
    }

    private DotOnChildClickListener(ExpandableListView.OnChildClickListener onChildClickListener) {
        this.f14171b = onChildClickListener;
    }

    public static ExpandableListView.OnChildClickListener getDotOnChildClickListener(ExpandableListView.OnChildClickListener onChildClickListener) {
        try {
            return onChildClickListener instanceof DotOnChildClickListener ? new DotOnChildClickListener(((DotOnChildClickListener) onChildClickListener).f14171b) : new DotOnChildClickListener(onChildClickListener);
        } catch (Throwable th) {
            C7896ca.eForInternal(th);
            return onChildClickListener;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002f A[RETURN] */
    @Override // android.widget.ExpandableListView.OnChildClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onChildClick(android.widget.ExpandableListView r9, android.view.View r10, int r11, int r12, long r13) {
        /*
            r8 = this;
            com.tendcloud.dot.DotOnChildClickListener$DotOnChildClickCallback r0 = com.tendcloud.dot.DotOnChildClickListener.f14170a     // Catch: java.lang.Throwable -> L1b
            if (r0 == 0) goto L10
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r0.onChildClick(r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> Ld
            goto L15
        Ld:
            r0 = move-exception
        Le:
            r9 = r0
            goto L22
        L10:
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
        L15:
            r6 = r5
            r5 = r4
            r4 = r3
            r3 = r2
            r2 = r1
            goto L26
        L1b:
            r0 = move-exception
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            goto Le
        L22:
            com.tendcloud.tenddata.C7896ca.eForInternal(r9)
            goto L15
        L26:
            android.widget.ExpandableListView$OnChildClickListener r1 = r8.f14171b
            if (r1 == 0) goto L2f
            boolean r9 = r1.onChildClick(r2, r3, r4, r5, r6)
            return r9
        L2f:
            r9 = 0
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tendcloud.dot.DotOnChildClickListener.onChildClick(android.widget.ExpandableListView, android.view.View, int, int, long):boolean");
    }

    public void setCallback(DotOnChildClickCallback dotOnChildClickCallback) {
        f14170a = dotOnChildClickCallback;
    }
}
