package com.tendcloud.dot;

import android.view.View;
import android.widget.AdapterView;
import com.tendcloud.tenddata.C7896ca;

/* loaded from: classes5.dex */
public class DotOnItemClickListener implements AdapterView.OnItemClickListener {

    /* renamed from: a */
    private static DotOnItemClickCallBack f14174a;

    /* renamed from: b */
    private AdapterView.OnItemClickListener f14175b;

    public interface DotOnItemClickCallBack {
        void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10);
    }

    private DotOnItemClickListener(AdapterView.OnItemClickListener onItemClickListener) {
        this.f14175b = onItemClickListener;
    }

    /* renamed from: a */
    private AdapterView.OnItemClickListener m11022a() {
        return this.f14175b;
    }

    public static AdapterView.OnItemClickListener getDotOnItemClickListener(AdapterView.OnItemClickListener onItemClickListener) {
        try {
            return onItemClickListener instanceof DotOnItemClickListener ? new DotOnItemClickListener(((DotOnItemClickListener) onItemClickListener).m11022a()) : new DotOnItemClickListener(onItemClickListener);
        } catch (Throwable th) {
            C7896ca.eForInternal(th);
            return onItemClickListener;
        }
    }

    public static void setCallBack(DotOnItemClickCallBack dotOnItemClickCallBack) {
        f14174a = dotOnItemClickCallBack;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    @Override // android.widget.AdapterView.OnItemClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onItemClick(android.widget.AdapterView<?> r8, android.view.View r9, int r10, long r11) {
        /*
            r7 = this;
            com.tendcloud.dot.DotOnItemClickListener$DotOnItemClickCallBack r0 = com.tendcloud.dot.DotOnItemClickListener.f14174a     // Catch: java.lang.Throwable -> L18
            if (r0 == 0) goto Lf
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r0.onItemClick(r1, r2, r3, r4)     // Catch: java.lang.Throwable -> Lc
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
            android.widget.AdapterView$OnItemClickListener r1 = r7.f14175b
            if (r1 == 0) goto L29
            r1.onItemClick(r2, r3, r4, r5)
        L29:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tendcloud.dot.DotOnItemClickListener.onItemClick(android.widget.AdapterView, android.view.View, int, long):void");
    }
}
