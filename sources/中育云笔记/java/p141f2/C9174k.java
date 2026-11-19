package p141f2;

import android.app.Activity;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9544p;

/* renamed from: f2.k */
/* loaded from: classes3.dex */
public final class C9174k {

    /* renamed from: d */
    public static final a f21421d = new a(null);

    /* renamed from: e */
    public static final int f21422e = 8;

    /* renamed from: a */
    public View f21423a;

    /* renamed from: b */
    public int f21424b;

    /* renamed from: c */
    public InterfaceC9544p f21425c;

    /* renamed from: f2.k$a */
    public static final class a {
        public /* synthetic */ a(AbstractC9972n abstractC9972n) {
            this();
        }

        /* renamed from: a */
        public final void m18075a(Activity activity, InterfaceC9544p onSoftKeyBoardChangeListener) {
            AbstractC9979u.m20294g(activity, "activity");
            AbstractC9979u.m20294g(onSoftKeyBoardChangeListener, "onSoftKeyBoardChangeListener");
            new C9174k(activity).m18074d(onSoftKeyBoardChangeListener);
        }

        public a() {
        }
    }

    public C9174k(Activity activity) {
        ViewTreeObserver viewTreeObserver;
        AbstractC9979u.m20294g(activity, "activity");
        View decorView = activity.getWindow().getDecorView();
        this.f21423a = decorView;
        if (decorView == null || (viewTreeObserver = decorView.getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: f2.j
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                C9174k.m18072b(this.f21420c);
            }
        });
    }

    /* renamed from: b */
    public static final void m18072b(C9174k c9174k) {
        Rect rect = new Rect();
        View view = c9174k.f21423a;
        if (view != null) {
            view.getWindowVisibleDisplayFrame(rect);
        }
        int iHeight = rect.height();
        int i10 = c9174k.f21424b;
        if (i10 == 0) {
            c9174k.f21424b = iHeight;
            return;
        }
        if (i10 == iHeight) {
            return;
        }
        if (i10 - iHeight > 200) {
            InterfaceC9544p interfaceC9544p = c9174k.f21425c;
            if (interfaceC9544p != null) {
                interfaceC9544p.invoke(Boolean.TRUE, Integer.valueOf(i10 - iHeight));
            }
            c9174k.f21424b = iHeight;
            return;
        }
        if (iHeight - i10 > 200) {
            InterfaceC9544p interfaceC9544p2 = c9174k.f21425c;
            if (interfaceC9544p2 != null) {
                interfaceC9544p2.invoke(Boolean.FALSE, Integer.valueOf(iHeight - i10));
            }
            c9174k.f21424b = iHeight;
        }
    }

    /* renamed from: d */
    public final void m18074d(InterfaceC9544p interfaceC9544p) {
        this.f21425c = interfaceC9544p;
    }
}
