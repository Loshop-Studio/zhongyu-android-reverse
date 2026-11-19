package androidx.core.view;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.List;
import p016c0.C1050c;
import p016c0.C1051d;
import p139q.C3004b;

/* renamed from: androidx.core.view.a */
/* loaded from: classes.dex */
public class C0335a {
    private static final View.AccessibilityDelegate DEFAULT_DELEGATE = new View.AccessibilityDelegate();
    private final View.AccessibilityDelegate mBridge;
    private final View.AccessibilityDelegate mOriginalDelegate;

    /* renamed from: androidx.core.view.a$a */
    static final class a extends View.AccessibilityDelegate {

        /* renamed from: a */
        final C0335a f2685a;

        a(C0335a c0335a) {
            this.f2685a = c0335a;
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            return this.f2685a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
            C1051d accessibilityNodeProvider = this.f2685a.getAccessibilityNodeProvider(view);
            if (accessibilityNodeProvider != null) {
                return (AccessibilityNodeProvider) accessibilityNodeProvider.m4927e();
            }
            return null;
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f2685a.onInitializeAccessibilityEvent(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            C1050c c1050cM4832H0 = C1050c.m4832H0(accessibilityNodeInfo);
            c1050cM4832H0.m4913x0(C0358u.m2016Y(view));
            c1050cM4832H0.m4894m0(C0358u.m2011T(view));
            c1050cM4832H0.m4905s0(C0358u.m2046o(view));
            c1050cM4832H0.m4853D0(C0358u.m1996J(view));
            this.f2685a.onInitializeAccessibilityNodeInfo(view, c1050cM4832H0);
            c1050cM4832H0.m4883f(accessibilityNodeInfo.getText(), view);
            List<C1050c.a> actionList = C0335a.getActionList(view);
            for (int i4 = 0; i4 < actionList.size(); i4++) {
                c1050cM4832H0.m4876b(actionList.get(i4));
            }
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f2685a.onPopulateAccessibilityEvent(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            return this.f2685a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean performAccessibilityAction(View view, int i4, Bundle bundle) {
            return this.f2685a.performAccessibilityAction(view, i4, bundle);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void sendAccessibilityEvent(View view, int i4) {
            this.f2685a.sendAccessibilityEvent(view, i4);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
            this.f2685a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
        }
    }

    public C0335a() {
        this(DEFAULT_DELEGATE);
    }

    static List<C1050c.a> getActionList(View view) {
        List<C1050c.a> list = (List) view.getTag(C3004b.f11589H);
        return list == null ? Collections.emptyList() : list;
    }

    private boolean isSpanStillValid(ClickableSpan clickableSpan, View view) {
        if (clickableSpan != null) {
            ClickableSpan[] clickableSpanArrM4843q = C1050c.m4843q(view.createAccessibilityNodeInfo().getText());
            for (int i4 = 0; clickableSpanArrM4843q != null && i4 < clickableSpanArrM4843q.length; i4++) {
                if (clickableSpan.equals(clickableSpanArrM4843q[i4])) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean performClickableSpanAction(int i4, View view) {
        WeakReference weakReference;
        SparseArray sparseArray = (SparseArray) view.getTag(C3004b.f11590I);
        if (sparseArray == null || (weakReference = (WeakReference) sparseArray.get(i4)) == null) {
            return false;
        }
        ClickableSpan clickableSpan = (ClickableSpan) weakReference.get();
        if (!isSpanStillValid(clickableSpan, view)) {
            return false;
        }
        clickableSpan.onClick(view);
        return true;
    }

    public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        return this.mOriginalDelegate.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public C1051d getAccessibilityNodeProvider(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider = this.mOriginalDelegate.getAccessibilityNodeProvider(view);
        if (accessibilityNodeProvider != null) {
            return new C1051d(accessibilityNodeProvider);
        }
        return null;
    }

    View.AccessibilityDelegate getBridge() {
        return this.mBridge;
    }

    public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.mOriginalDelegate.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void onInitializeAccessibilityNodeInfo(View view, C1050c c1050c) {
        this.mOriginalDelegate.onInitializeAccessibilityNodeInfo(view, c1050c.m4859G0());
    }

    public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.mOriginalDelegate.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.mOriginalDelegate.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public boolean performAccessibilityAction(View view, int i4, Bundle bundle) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        List<C1050c.a> actionList = getActionList(view);
        boolean zPerformAccessibilityAction = false;
        int i5 = 0;
        while (true) {
            if (i5 >= actionList.size()) {
                break;
            }
            C1050c.a aVar = actionList.get(i5);
            if (aVar.m4918b() == i4) {
                zPerformAccessibilityAction = aVar.m4920d(view, bundle);
                break;
            }
            i5++;
        }
        if (!zPerformAccessibilityAction) {
            zPerformAccessibilityAction = this.mOriginalDelegate.performAccessibilityAction(view, i4, bundle);
        }
        return (zPerformAccessibilityAction || i4 != C3004b.f11601a) ? zPerformAccessibilityAction : performClickableSpanAction(bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1), view);
    }

    public void sendAccessibilityEvent(View view, int i4) {
        this.mOriginalDelegate.sendAccessibilityEvent(view, i4);
    }

    public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
        this.mOriginalDelegate.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    public C0335a(View.AccessibilityDelegate accessibilityDelegate) {
        this.mOriginalDelegate = accessibilityDelegate;
        this.mBridge = new a(this);
    }
}
