package androidx.customview.widget;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import androidx.collection.C0254h;
import androidx.core.view.C0335a;
import androidx.core.view.C0358u;
import androidx.core.view.C0361x;
import androidx.customview.widget.C0383b;
import com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool;
import com.taobao.accs.data.Message;
import com.xuexiang.xui.widget.popupwindow.good.IGoodView;
import java.util.ArrayList;
import java.util.List;
import p016c0.C1049b;
import p016c0.C1050c;
import p016c0.C1051d;
import p016c0.C1052e;

/* renamed from: androidx.customview.widget.a */
/* loaded from: classes.dex */
public abstract class AbstractC0382a extends C0335a {
    private static final String DEFAULT_CLASS_NAME = "android.view.View";
    public static final int HOST_ID = -1;
    public static final int INVALID_ID = Integer.MIN_VALUE;
    private static final Rect INVALID_PARENT_BOUNDS = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
    private static final C0383b.a<C1050c> NODE_ADAPTER = new a();
    private static final C0383b.b<C0254h<C1050c>, C1050c> SPARSE_VALUES_ADAPTER = new b();
    private final View mHost;
    private final AccessibilityManager mManager;
    private c mNodeProvider;
    private final Rect mTempScreenRect = new Rect();
    private final Rect mTempParentRect = new Rect();
    private final Rect mTempVisibleRect = new Rect();
    private final int[] mTempGlobalRect = new int[2];
    int mAccessibilityFocusedVirtualViewId = Integer.MIN_VALUE;
    int mKeyboardFocusedVirtualViewId = Integer.MIN_VALUE;
    private int mHoveredVirtualViewId = Integer.MIN_VALUE;

    /* renamed from: androidx.customview.widget.a$a */
    static class a implements C0383b.a<C1050c> {
        a() {
        }

        @Override // androidx.customview.widget.C0383b.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo2216a(C1050c c1050c, Rect rect) {
            c1050c.m4893m(rect);
        }
    }

    /* renamed from: androidx.customview.widget.a$b */
    static class b implements C0383b.b<C0254h<C1050c>, C1050c> {
        b() {
        }

        @Override // androidx.customview.widget.C0383b.b
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public C1050c mo2218a(C0254h<C1050c> c0254h, int i4) {
            return c0254h.m1150k(i4);
        }

        @Override // androidx.customview.widget.C0383b.b
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public int mo2219b(C0254h<C1050c> c0254h) {
            return c0254h.m1149j();
        }
    }

    /* renamed from: androidx.customview.widget.a$c */
    private class c extends C1051d {
        c() {
        }

        @Override // p016c0.C1051d
        /* renamed from: b */
        public C1050c mo2222b(int i4) {
            return C1050c.m4835Q(AbstractC0382a.this.obtainAccessibilityNodeInfo(i4));
        }

        @Override // p016c0.C1051d
        /* renamed from: d */
        public C1050c mo2223d(int i4) {
            int i5 = i4 == 2 ? AbstractC0382a.this.mAccessibilityFocusedVirtualViewId : AbstractC0382a.this.mKeyboardFocusedVirtualViewId;
            if (i5 == Integer.MIN_VALUE) {
                return null;
            }
            return mo2222b(i5);
        }

        @Override // p016c0.C1051d
        /* renamed from: f */
        public boolean mo2224f(int i4, int i5, Bundle bundle) {
            return AbstractC0382a.this.performAction(i4, i5, bundle);
        }
    }

    public AbstractC0382a(View view) {
        if (view == null) {
            throw new IllegalArgumentException("View may not be null");
        }
        this.mHost = view;
        this.mManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        view.setFocusable(true);
        if (C0358u.m2066y(view) == 0) {
            C0358u.m1979A0(view, 1);
        }
    }

    private boolean clearAccessibilityFocus(int i4) {
        if (this.mAccessibilityFocusedVirtualViewId != i4) {
            return false;
        }
        this.mAccessibilityFocusedVirtualViewId = Integer.MIN_VALUE;
        this.mHost.invalidate();
        sendEventForVirtualView(i4, ArrayPool.STANDARD_BUFFER_SIZE_BYTES);
        return true;
    }

    private boolean clickKeyboardFocusedVirtualView() {
        int i4 = this.mKeyboardFocusedVirtualViewId;
        return i4 != Integer.MIN_VALUE && onPerformActionForVirtualView(i4, 16, null);
    }

    private AccessibilityEvent createEvent(int i4, int i5) {
        return i4 != -1 ? createEventForChild(i4, i5) : createEventForHost(i5);
    }

    private AccessibilityEvent createEventForChild(int i4, int i5) {
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i5);
        C1050c c1050cObtainAccessibilityNodeInfo = obtainAccessibilityNodeInfo(i4);
        accessibilityEventObtain.getText().add(c1050cObtainAccessibilityNodeInfo.m4912x());
        accessibilityEventObtain.setContentDescription(c1050cObtainAccessibilityNodeInfo.m4902r());
        accessibilityEventObtain.setScrollable(c1050cObtainAccessibilityNodeInfo.m4863K());
        accessibilityEventObtain.setPassword(c1050cObtainAccessibilityNodeInfo.m4862J());
        accessibilityEventObtain.setEnabled(c1050cObtainAccessibilityNodeInfo.m4856F());
        accessibilityEventObtain.setChecked(c1050cObtainAccessibilityNodeInfo.m4852D());
        onPopulateEventForVirtualView(i4, accessibilityEventObtain);
        if (accessibilityEventObtain.getText().isEmpty() && accessibilityEventObtain.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
        }
        accessibilityEventObtain.setClassName(c1050cObtainAccessibilityNodeInfo.m4899p());
        C1052e.m4930c(accessibilityEventObtain, this.mHost, i4);
        accessibilityEventObtain.setPackageName(this.mHost.getContext().getPackageName());
        return accessibilityEventObtain;
    }

    private AccessibilityEvent createEventForHost(int i4) {
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i4);
        this.mHost.onInitializeAccessibilityEvent(accessibilityEventObtain);
        return accessibilityEventObtain;
    }

    private C1050c createNodeForChild(int i4) {
        C1050c c1050cM4833O = C1050c.m4833O();
        c1050cM4833O.m4888i0(true);
        c1050cM4833O.m4891k0(true);
        c1050cM4833O.m4879c0(DEFAULT_CLASS_NAME);
        Rect rect = INVALID_PARENT_BOUNDS;
        c1050cM4833O.m4871X(rect);
        c1050cM4833O.m4872Y(rect);
        c1050cM4833O.m4907t0(this.mHost);
        onPopulateNodeForVirtualView(i4, c1050cM4833O);
        if (c1050cM4833O.m4912x() == null && c1050cM4833O.m4902r() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        c1050cM4833O.m4893m(this.mTempParentRect);
        if (this.mTempParentRect.equals(rect)) {
            throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        }
        int iM4890k = c1050cM4833O.m4890k();
        if ((iM4890k & 64) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        if ((iM4890k & 128) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        c1050cM4833O.m4903r0(this.mHost.getContext().getPackageName());
        c1050cM4833O.m4851C0(this.mHost, i4);
        if (this.mAccessibilityFocusedVirtualViewId == i4) {
            c1050cM4833O.m4870V(true);
            c1050cM4833O.m4874a(128);
        } else {
            c1050cM4833O.m4870V(false);
            c1050cM4833O.m4874a(64);
        }
        boolean z3 = this.mKeyboardFocusedVirtualViewId == i4;
        if (z3) {
            c1050cM4833O.m4874a(2);
        } else if (c1050cM4833O.m4858G()) {
            c1050cM4833O.m4874a(1);
        }
        c1050cM4833O.m4892l0(z3);
        this.mHost.getLocationOnScreen(this.mTempGlobalRect);
        c1050cM4833O.m4895n(this.mTempScreenRect);
        if (this.mTempScreenRect.equals(rect)) {
            c1050cM4833O.m4893m(this.mTempScreenRect);
            if (c1050cM4833O.f6188b != -1) {
                C1050c c1050cM4833O2 = C1050c.m4833O();
                for (int i5 = c1050cM4833O.f6188b; i5 != -1; i5 = c1050cM4833O2.f6188b) {
                    c1050cM4833O2.m4908u0(this.mHost, -1);
                    c1050cM4833O2.m4871X(INVALID_PARENT_BOUNDS);
                    onPopulateNodeForVirtualView(i5, c1050cM4833O2);
                    c1050cM4833O2.m4893m(this.mTempParentRect);
                    Rect rect2 = this.mTempScreenRect;
                    Rect rect3 = this.mTempParentRect;
                    rect2.offset(rect3.left, rect3.top);
                }
                c1050cM4833O2.m4868S();
            }
            this.mTempScreenRect.offset(this.mTempGlobalRect[0] - this.mHost.getScrollX(), this.mTempGlobalRect[1] - this.mHost.getScrollY());
        }
        if (this.mHost.getLocalVisibleRect(this.mTempVisibleRect)) {
            this.mTempVisibleRect.offset(this.mTempGlobalRect[0] - this.mHost.getScrollX(), this.mTempGlobalRect[1] - this.mHost.getScrollY());
            if (this.mTempScreenRect.intersect(this.mTempVisibleRect)) {
                c1050cM4833O.m4872Y(this.mTempScreenRect);
                if (isVisibleToUser(this.mTempScreenRect)) {
                    c1050cM4833O.m4857F0(true);
                }
            }
        }
        return c1050cM4833O;
    }

    private C1050c createNodeForHost() {
        C1050c c1050cM4834P = C1050c.m4834P(this.mHost);
        C0358u.m2025d0(this.mHost, c1050cM4834P);
        ArrayList arrayList = new ArrayList();
        getVisibleVirtualViews(arrayList);
        if (c1050cM4834P.m4897o() > 0 && arrayList.size() > 0) {
            throw new RuntimeException("Views cannot have both real and virtual children");
        }
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            c1050cM4834P.m4880d(this.mHost, ((Integer) arrayList.get(i4)).intValue());
        }
        return c1050cM4834P;
    }

    private C0254h<C1050c> getAllNodes() {
        ArrayList arrayList = new ArrayList();
        getVisibleVirtualViews(arrayList);
        C0254h<C1050c> c0254h = new C0254h<>();
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            c0254h.m1148i(i4, createNodeForChild(i4));
        }
        return c0254h;
    }

    private void getBoundsInParent(int i4, Rect rect) {
        obtainAccessibilityNodeInfo(i4).m4893m(rect);
    }

    private static Rect guessPreviouslyFocusedRect(View view, int i4, Rect rect) {
        int width = view.getWidth();
        int height = view.getHeight();
        if (i4 == 17) {
            rect.set(width, 0, width, height);
        } else if (i4 == 33) {
            rect.set(0, height, width, height);
        } else if (i4 == 66) {
            rect.set(-1, 0, -1, height);
        } else {
            if (i4 != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            rect.set(0, -1, width, -1);
        }
        return rect;
    }

    private boolean isVisibleToUser(Rect rect) {
        if (rect == null || rect.isEmpty() || this.mHost.getWindowVisibility() != 0) {
            return false;
        }
        Object parent = this.mHost.getParent();
        while (parent instanceof View) {
            View view = (View) parent;
            if (view.getAlpha() <= IGoodView.DEFAULT_TO_ALPHA || view.getVisibility() != 0) {
                return false;
            }
            parent = view.getParent();
        }
        return parent != null;
    }

    private static int keyToDirection(int i4) {
        if (i4 == 19) {
            return 33;
        }
        if (i4 != 21) {
            return i4 != 22 ? 130 : 66;
        }
        return 17;
    }

    private boolean moveFocus(int i4, Rect rect) {
        C1050c c1050c;
        C0254h<C1050c> allNodes = getAllNodes();
        int i5 = this.mKeyboardFocusedVirtualViewId;
        C1050c c1050cM1144e = i5 == Integer.MIN_VALUE ? null : allNodes.m1144e(i5);
        if (i4 == 1 || i4 == 2) {
            c1050c = (C1050c) C0383b.m2228d(allNodes, SPARSE_VALUES_ADAPTER, NODE_ADAPTER, c1050cM1144e, i4, C0358u.m1978A(this.mHost) == 1, false);
        } else {
            if (i4 != 17 && i4 != 33 && i4 != 66 && i4 != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            Rect rect2 = new Rect();
            int i6 = this.mKeyboardFocusedVirtualViewId;
            if (i6 != Integer.MIN_VALUE) {
                getBoundsInParent(i6, rect2);
            } else if (rect != null) {
                rect2.set(rect);
            } else {
                guessPreviouslyFocusedRect(this.mHost, i4, rect2);
            }
            c1050c = (C1050c) C0383b.m2227c(allNodes, SPARSE_VALUES_ADAPTER, NODE_ADAPTER, c1050cM1144e, rect2, i4);
        }
        return requestKeyboardFocusForVirtualView(c1050c != null ? allNodes.m1147h(allNodes.m1146g(c1050c)) : Integer.MIN_VALUE);
    }

    private boolean performActionForChild(int i4, int i5, Bundle bundle) {
        return i5 != 1 ? i5 != 2 ? i5 != 64 ? i5 != 128 ? onPerformActionForVirtualView(i4, i5, bundle) : clearAccessibilityFocus(i4) : requestAccessibilityFocus(i4) : clearKeyboardFocusForVirtualView(i4) : requestKeyboardFocusForVirtualView(i4);
    }

    private boolean performActionForHost(int i4, Bundle bundle) {
        return C0358u.m2029f0(this.mHost, i4, bundle);
    }

    private boolean requestAccessibilityFocus(int i4) {
        int i5;
        if (!this.mManager.isEnabled() || !this.mManager.isTouchExplorationEnabled() || (i5 = this.mAccessibilityFocusedVirtualViewId) == i4) {
            return false;
        }
        if (i5 != Integer.MIN_VALUE) {
            clearAccessibilityFocus(i5);
        }
        this.mAccessibilityFocusedVirtualViewId = i4;
        this.mHost.invalidate();
        sendEventForVirtualView(i4, Message.FLAG_DATA_TYPE);
        return true;
    }

    private void updateHoveredVirtualView(int i4) {
        int i5 = this.mHoveredVirtualViewId;
        if (i5 == i4) {
            return;
        }
        this.mHoveredVirtualViewId = i4;
        sendEventForVirtualView(i4, 128);
        sendEventForVirtualView(i5, 256);
    }

    public final boolean clearKeyboardFocusForVirtualView(int i4) {
        if (this.mKeyboardFocusedVirtualViewId != i4) {
            return false;
        }
        this.mKeyboardFocusedVirtualViewId = Integer.MIN_VALUE;
        onVirtualViewKeyboardFocusChanged(i4, false);
        sendEventForVirtualView(i4, 8);
        return true;
    }

    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        if (!this.mManager.isEnabled() || !this.mManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 7 || action == 9) {
            int virtualViewAt = getVirtualViewAt(motionEvent.getX(), motionEvent.getY());
            updateHoveredVirtualView(virtualViewAt);
            return virtualViewAt != Integer.MIN_VALUE;
        }
        if (action != 10 || this.mHoveredVirtualViewId == Integer.MIN_VALUE) {
            return false;
        }
        updateHoveredVirtualView(Integer.MIN_VALUE);
        return true;
    }

    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int i4 = 0;
        if (keyEvent.getAction() == 1) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 61) {
            if (keyEvent.hasNoModifiers()) {
                return moveFocus(2, null);
            }
            if (keyEvent.hasModifiers(1)) {
                return moveFocus(1, null);
            }
            return false;
        }
        if (keyCode != 66) {
            switch (keyCode) {
                case 19:
                case 20:
                case 21:
                case 22:
                    if (!keyEvent.hasNoModifiers()) {
                        return false;
                    }
                    int iKeyToDirection = keyToDirection(keyCode);
                    int repeatCount = keyEvent.getRepeatCount() + 1;
                    boolean z3 = false;
                    while (i4 < repeatCount && moveFocus(iKeyToDirection, null)) {
                        i4++;
                        z3 = true;
                    }
                    return z3;
                case 23:
                    break;
                default:
                    return false;
            }
        }
        if (!keyEvent.hasNoModifiers() || keyEvent.getRepeatCount() != 0) {
            return false;
        }
        clickKeyboardFocusedVirtualView();
        return true;
    }

    public final int getAccessibilityFocusedVirtualViewId() {
        return this.mAccessibilityFocusedVirtualViewId;
    }

    @Override // androidx.core.view.C0335a
    public C1051d getAccessibilityNodeProvider(View view) {
        if (this.mNodeProvider == null) {
            this.mNodeProvider = new c();
        }
        return this.mNodeProvider;
    }

    @Deprecated
    public int getFocusedVirtualView() {
        return getAccessibilityFocusedVirtualViewId();
    }

    public final int getKeyboardFocusedVirtualViewId() {
        return this.mKeyboardFocusedVirtualViewId;
    }

    protected abstract int getVirtualViewAt(float f4, float f5);

    protected abstract void getVisibleVirtualViews(List<Integer> list);

    public final void invalidateRoot() {
        invalidateVirtualView(-1, 1);
    }

    public final void invalidateVirtualView(int i4) {
        invalidateVirtualView(i4, 0);
    }

    C1050c obtainAccessibilityNodeInfo(int i4) {
        return i4 == -1 ? createNodeForHost() : createNodeForChild(i4);
    }

    public final void onFocusChanged(boolean z3, int i4, Rect rect) {
        int i5 = this.mKeyboardFocusedVirtualViewId;
        if (i5 != Integer.MIN_VALUE) {
            clearKeyboardFocusForVirtualView(i5);
        }
        if (z3) {
            moveFocus(i4, rect);
        }
    }

    @Override // androidx.core.view.C0335a
    public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        onPopulateEventForHost(accessibilityEvent);
    }

    @Override // androidx.core.view.C0335a
    public void onInitializeAccessibilityNodeInfo(View view, C1050c c1050c) {
        super.onInitializeAccessibilityNodeInfo(view, c1050c);
        onPopulateNodeForHost(c1050c);
    }

    protected abstract boolean onPerformActionForVirtualView(int i4, int i5, Bundle bundle);

    protected void onPopulateEventForHost(AccessibilityEvent accessibilityEvent) {
    }

    protected void onPopulateEventForVirtualView(int i4, AccessibilityEvent accessibilityEvent) {
    }

    protected void onPopulateNodeForHost(C1050c c1050c) {
    }

    protected abstract void onPopulateNodeForVirtualView(int i4, C1050c c1050c);

    protected void onVirtualViewKeyboardFocusChanged(int i4, boolean z3) {
    }

    boolean performAction(int i4, int i5, Bundle bundle) {
        return i4 != -1 ? performActionForChild(i4, i5, bundle) : performActionForHost(i5, bundle);
    }

    public final boolean requestKeyboardFocusForVirtualView(int i4) {
        int i5;
        if ((!this.mHost.isFocused() && !this.mHost.requestFocus()) || (i5 = this.mKeyboardFocusedVirtualViewId) == i4) {
            return false;
        }
        if (i5 != Integer.MIN_VALUE) {
            clearKeyboardFocusForVirtualView(i5);
        }
        this.mKeyboardFocusedVirtualViewId = i4;
        onVirtualViewKeyboardFocusChanged(i4, true);
        sendEventForVirtualView(i4, 8);
        return true;
    }

    public final boolean sendEventForVirtualView(int i4, int i5) {
        ViewParent parent;
        if (i4 == Integer.MIN_VALUE || !this.mManager.isEnabled() || (parent = this.mHost.getParent()) == null) {
            return false;
        }
        return C0361x.m2119h(parent, this.mHost, createEvent(i4, i5));
    }

    public final void invalidateVirtualView(int i4, int i5) {
        ViewParent parent;
        if (i4 == Integer.MIN_VALUE || !this.mManager.isEnabled() || (parent = this.mHost.getParent()) == null) {
            return;
        }
        AccessibilityEvent accessibilityEventCreateEvent = createEvent(i4, 2048);
        C1049b.m4830b(accessibilityEventCreateEvent, i5);
        C0361x.m2119h(parent, this.mHost, accessibilityEventCreateEvent);
    }
}
