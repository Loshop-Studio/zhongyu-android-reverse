package com.tendcloud.dot;

import android.view.View;
import android.widget.ExpandableListView;
import com.tendcloud.tenddata.C7896ca;

/* loaded from: classes5.dex */
public class DotOnGroupClickListener implements ExpandableListView.OnGroupClickListener {

    /* renamed from: a */
    private static DotOnGroupClickCallback f14172a;

    /* renamed from: b */
    private ExpandableListView.OnGroupClickListener f14173b;

    public interface DotOnGroupClickCallback {
        boolean onGroupClick(ExpandableListView expandableListView, View view, int i10, long j10);
    }

    private DotOnGroupClickListener(ExpandableListView.OnGroupClickListener onGroupClickListener) {
        this.f14173b = onGroupClickListener;
    }

    public static ExpandableListView.OnGroupClickListener getDotOnGroupClickListener(ExpandableListView.OnGroupClickListener onGroupClickListener) {
        try {
            return onGroupClickListener instanceof DotOnGroupClickListener ? new DotOnGroupClickListener(((DotOnGroupClickListener) onGroupClickListener).f14173b) : new DotOnGroupClickListener(onGroupClickListener);
        } catch (Throwable th) {
            C7896ca.eForInternal(th);
            return onGroupClickListener;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002b A[RETURN] */
    @Override // android.widget.ExpandableListView.OnGroupClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onGroupClick(android.widget.ExpandableListView r8, android.view.View r9, int r10, long r11) {
        /*
            r7 = this;
            com.tendcloud.dot.DotOnGroupClickListener$DotOnGroupClickCallback r0 = com.tendcloud.dot.DotOnGroupClickListener.f14172a     // Catch: java.lang.Throwable -> L18
            if (r0 == 0) goto Lf
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r0.onGroupClick(r1, r2, r3, r4)     // Catch: java.lang.Throwable -> Lc
            goto L13
        Lc:
            r0 = move-exception
        Ld:
            r8 = r0
            goto L1e
        Lf:
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
        L13:
            r5 = r4
            r4 = r3
            r3 = r2
            r2 = r1
            goto L22
        L18:
            r0 = move-exception
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            goto Ld
        L1e:
            com.tendcloud.tenddata.C7896ca.eForInternal(r8)
            goto L13
        L22:
            android.widget.ExpandableListView$OnGroupClickListener r1 = r7.f14173b
            if (r1 == 0) goto L2b
            boolean r8 = r1.onGroupClick(r2, r3, r4, r5)
            return r8
        L2b:
            r8 = 0
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tendcloud.dot.DotOnGroupClickListener.onGroupClick(android.widget.ExpandableListView, android.view.View, int, long):boolean");
    }

    public void setCallback(DotOnGroupClickCallback dotOnGroupClickCallback) {
        f14172a = dotOnGroupClickCallback;
    }
}
