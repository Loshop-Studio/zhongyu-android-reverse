package p088j2;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.xuexiang.xui.widget.dialog.materialdialog.internal.MDRootLayout;

/* renamed from: j2.c */
/* loaded from: classes3.dex */
public final class ViewTreeObserverOnScrollChangedListenerC5740c implements ViewTreeObserver.OnScrollChangedListener {

    /* renamed from: a */
    public final /* synthetic */ ViewGroup f9084a;

    /* renamed from: b */
    public final /* synthetic */ boolean f9085b;

    /* renamed from: c */
    public final /* synthetic */ MDRootLayout f9086c;

    public ViewTreeObserverOnScrollChangedListenerC5740c(MDRootLayout mDRootLayout, ViewGroup viewGroup, boolean z8) {
        this.f9086c = mDRootLayout;
        this.f9084a = viewGroup;
        this.f9085b = z8;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x003f  */
    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onScrollChanged() {
        /*
            r8 = this;
            com.xuexiang.xui.widget.dialog.materialdialog.internal.MDRootLayout r0 = r8.f9086c
            com.xuexiang.xui.widget.dialog.materialdialog.internal.MDButton[] r1 = r0.f4263a
            int r2 = r1.length
            r3 = 0
            r4 = r3
        L7:
            r5 = 8
            r6 = 1
            if (r4 >= r2) goto L1b
            r7 = r1[r4]
            if (r7 == 0) goto L18
            int r7 = r7.getVisibility()
            if (r7 == r5) goto L18
            r1 = r6
            goto L1c
        L18:
            int r4 = r4 + 1
            goto L7
        L1b:
            r1 = r3
        L1c:
            android.view.ViewGroup r2 = r8.f9084a
            boolean r4 = r2 instanceof android.webkit.WebView
            boolean r7 = r8.f9085b
            if (r4 == 0) goto L65
            android.webkit.WebView r2 = (android.webkit.WebView) r2
            if (r7 == 0) goto L42
            android.view.View r4 = r0.f4265c
            if (r4 == 0) goto L3f
            int r4 = r4.getVisibility()
            if (r4 == r5) goto L3f
            int r4 = r2.getScrollY()
            int r5 = r2.getPaddingTop()
            int r5 = r5 + r4
            if (r5 <= 0) goto L3f
            r4 = r6
            goto L40
        L3f:
            r4 = r3
        L40:
            r0.f4267e = r4
        L42:
            if (r1 == 0) goto L62
            int r1 = r2.getScrollY()
            int r4 = r2.getMeasuredHeight()
            int r4 = r4 + r1
            int r1 = r2.getPaddingBottom()
            int r4 = r4 - r1
            float r1 = (float) r4
            int r4 = r2.getContentHeight()
            float r4 = (float) r4
            float r2 = r2.getScale()
            float r2 = r2 * r4
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 >= 0) goto L62
            r3 = r6
        L62:
            r0.f4268f = r3
            goto L68
        L65:
            com.xuexiang.xui.widget.dialog.materialdialog.internal.MDRootLayout.m3478a(r0, r2, r7, r1)
        L68:
            r0.invalidate()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p088j2.ViewTreeObserverOnScrollChangedListenerC5740c.onScrollChanged():void");
    }
}
