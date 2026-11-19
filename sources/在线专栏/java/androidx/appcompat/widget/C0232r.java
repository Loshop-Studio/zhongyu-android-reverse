package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.appcompat.graphics.drawable.C0115c;
import androidx.core.view.C0362y;
import androidx.core.widget.C0374h;
import java.lang.reflect.Field;
import p015c.C1038a;
import p156u.C3403a;

/* renamed from: androidx.appcompat.widget.r */
/* loaded from: classes.dex */
class C0232r extends ListView {

    /* renamed from: a */
    private final Rect f1194a;

    /* renamed from: b */
    private int f1195b;

    /* renamed from: c */
    private int f1196c;

    /* renamed from: d */
    private int f1197d;

    /* renamed from: e */
    private int f1198e;

    /* renamed from: f */
    private int f1199f;

    /* renamed from: g */
    private Field f1200g;

    /* renamed from: h */
    private a f1201h;

    /* renamed from: i */
    private boolean f1202i;

    /* renamed from: j */
    private boolean f1203j;

    /* renamed from: k */
    private boolean f1204k;

    /* renamed from: l */
    private C0362y f1205l;

    /* renamed from: m */
    private C0374h f1206m;

    /* renamed from: n */
    b f1207n;

    /* renamed from: androidx.appcompat.widget.r$a */
    private static class a extends C0115c {

        /* renamed from: a */
        private boolean f1208a;

        a(Drawable drawable) {
            super(drawable);
            this.f1208a = true;
        }

        /* renamed from: a */
        void m995a(boolean z3) {
            this.f1208a = z3;
        }

        @Override // androidx.appcompat.graphics.drawable.C0115c, android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            if (this.f1208a) {
                super.draw(canvas);
            }
        }

        @Override // androidx.appcompat.graphics.drawable.C0115c, android.graphics.drawable.Drawable
        public void setHotspot(float f4, float f5) {
            if (this.f1208a) {
                super.setHotspot(f4, f5);
            }
        }

        @Override // androidx.appcompat.graphics.drawable.C0115c, android.graphics.drawable.Drawable
        public void setHotspotBounds(int i4, int i5, int i6, int i7) {
            if (this.f1208a) {
                super.setHotspotBounds(i4, i5, i6, i7);
            }
        }

        @Override // androidx.appcompat.graphics.drawable.C0115c, android.graphics.drawable.Drawable
        public boolean setState(int[] iArr) {
            if (this.f1208a) {
                return super.setState(iArr);
            }
            return false;
        }

        @Override // androidx.appcompat.graphics.drawable.C0115c, android.graphics.drawable.Drawable
        public boolean setVisible(boolean z3, boolean z4) {
            if (this.f1208a) {
                return super.setVisible(z3, z4);
            }
            return false;
        }
    }

    /* renamed from: androidx.appcompat.widget.r$b */
    private class b implements Runnable {
        b() {
        }

        /* renamed from: a */
        public void m996a() {
            C0232r c0232r = C0232r.this;
            c0232r.f1207n = null;
            c0232r.removeCallbacks(this);
        }

        /* renamed from: b */
        public void m997b() {
            C0232r.this.post(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            C0232r c0232r = C0232r.this;
            c0232r.f1207n = null;
            c0232r.drawableStateChanged();
        }
    }

    C0232r(Context context, boolean z3) throws NoSuchFieldException {
        super(context, null, C1038a.f5722A);
        this.f1194a = new Rect();
        this.f1195b = 0;
        this.f1196c = 0;
        this.f1197d = 0;
        this.f1198e = 0;
        this.f1203j = z3;
        setCacheColorHint(0);
        try {
            Field declaredField = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            this.f1200g = declaredField;
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException e4) {
            e4.printStackTrace();
        }
    }

    /* renamed from: a */
    private void m984a() {
        this.f1204k = false;
        setPressed(false);
        drawableStateChanged();
        View childAt = getChildAt(this.f1199f - getFirstVisiblePosition());
        if (childAt != null) {
            childAt.setPressed(false);
        }
        C0362y c0362y = this.f1205l;
        if (c0362y != null) {
            c0362y.m2122b();
            this.f1205l = null;
        }
    }

    /* renamed from: b */
    private void m985b(View view, int i4) {
        performItemClick(view, i4, getItemIdAtPosition(i4));
    }

    /* renamed from: c */
    private void m986c(Canvas canvas) {
        Drawable selector;
        if (this.f1194a.isEmpty() || (selector = getSelector()) == null) {
            return;
        }
        selector.setBounds(this.f1194a);
        selector.draw(canvas);
    }

    /* renamed from: f */
    private void m987f(int i4, View view) throws IllegalAccessException, IllegalArgumentException {
        Rect rect = this.f1194a;
        rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        rect.left -= this.f1195b;
        rect.top -= this.f1196c;
        rect.right += this.f1197d;
        rect.bottom += this.f1198e;
        try {
            boolean z3 = this.f1200g.getBoolean(this);
            if (view.isEnabled() != z3) {
                this.f1200g.set(this, Boolean.valueOf(!z3));
                if (i4 != -1) {
                    refreshDrawableState();
                }
            }
        } catch (IllegalAccessException e4) {
            e4.printStackTrace();
        }
    }

    /* renamed from: g */
    private void m988g(int i4, View view) throws IllegalAccessException, IllegalArgumentException {
        Drawable selector = getSelector();
        boolean z3 = (selector == null || i4 == -1) ? false : true;
        if (z3) {
            selector.setVisible(false, false);
        }
        m987f(i4, view);
        if (z3) {
            Rect rect = this.f1194a;
            float fExactCenterX = rect.exactCenterX();
            float fExactCenterY = rect.exactCenterY();
            selector.setVisible(getVisibility() == 0, false);
            C3403a.m10394k(selector, fExactCenterX, fExactCenterY);
        }
    }

    /* renamed from: h */
    private void m989h(int i4, View view, float f4, float f5) throws IllegalAccessException, IllegalArgumentException {
        m988g(i4, view);
        Drawable selector = getSelector();
        if (selector == null || i4 == -1) {
            return;
        }
        C3403a.m10394k(selector, f4, f5);
    }

    /* renamed from: i */
    private void m990i(View view, int i4, float f4, float f5) throws IllegalAccessException, IllegalArgumentException {
        View childAt;
        this.f1204k = true;
        drawableHotspotChanged(f4, f5);
        if (!isPressed()) {
            setPressed(true);
        }
        layoutChildren();
        int i5 = this.f1199f;
        if (i5 != -1 && (childAt = getChildAt(i5 - getFirstVisiblePosition())) != null && childAt != view && childAt.isPressed()) {
            childAt.setPressed(false);
        }
        this.f1199f = i4;
        view.drawableHotspotChanged(f4 - view.getLeft(), f5 - view.getTop());
        if (!view.isPressed()) {
            view.setPressed(true);
        }
        m989h(i4, view, f4, f5);
        setSelectorEnabled(false);
        refreshDrawableState();
    }

    /* renamed from: j */
    private boolean m991j() {
        return this.f1204k;
    }

    /* renamed from: k */
    private void m992k() {
        Drawable selector = getSelector();
        if (selector != null && m991j() && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    private void setSelectorEnabled(boolean z3) {
        a aVar = this.f1201h;
        if (aVar != null) {
            aVar.m995a(z3);
        }
    }

    /* renamed from: d */
    public int mo993d(int i4, int i5, int i6, int i7, int i8) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int measuredHeight = listPaddingTop + listPaddingBottom;
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        View view = null;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        while (i9 < count) {
            int itemViewType = adapter.getItemViewType(i9);
            if (itemViewType != i10) {
                view = null;
                i10 = itemViewType;
            }
            view = adapter.getView(i9, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i12 = layoutParams.height;
            view.measure(i4, i12 > 0 ? View.MeasureSpec.makeMeasureSpec(i12, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i9 > 0) {
                measuredHeight += dividerHeight;
            }
            measuredHeight += view.getMeasuredHeight();
            if (measuredHeight >= i7) {
                return (i8 < 0 || i9 <= i8 || i11 <= 0 || measuredHeight == i7) ? i7 : i11;
            }
            if (i8 >= 0 && i9 >= i8) {
                i11 = measuredHeight;
            }
            i9++;
        }
        return measuredHeight;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        m986c(canvas);
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        if (this.f1207n != null) {
            return;
        }
        super.drawableStateChanged();
        setSelectorEnabled(true);
        m992k();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0011  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean mo994e(android.view.MotionEvent r8, int r9) throws java.lang.IllegalAccessException, java.lang.IllegalArgumentException {
        /*
            r7 = this;
            int r0 = r8.getActionMasked()
            r1 = 0
            r2 = 1
            if (r0 == r2) goto L16
            r3 = 2
            if (r0 == r3) goto L14
            r9 = 3
            if (r0 == r9) goto L11
        Le:
            r9 = 0
            r3 = 1
            goto L46
        L11:
            r9 = 0
            r3 = 0
            goto L46
        L14:
            r3 = 1
            goto L17
        L16:
            r3 = 0
        L17:
            int r9 = r8.findPointerIndex(r9)
            if (r9 >= 0) goto L1e
            goto L11
        L1e:
            float r4 = r8.getX(r9)
            int r4 = (int) r4
            float r9 = r8.getY(r9)
            int r9 = (int) r9
            int r5 = r7.pointToPosition(r4, r9)
            r6 = -1
            if (r5 != r6) goto L31
            r9 = 1
            goto L46
        L31:
            int r3 = r7.getFirstVisiblePosition()
            int r3 = r5 - r3
            android.view.View r3 = r7.getChildAt(r3)
            float r4 = (float) r4
            float r9 = (float) r9
            r7.m990i(r3, r5, r4, r9)
            if (r0 != r2) goto Le
            r7.m985b(r3, r5)
            goto Le
        L46:
            if (r3 == 0) goto L4a
            if (r9 == 0) goto L4d
        L4a:
            r7.m984a()
        L4d:
            if (r3 == 0) goto L65
            androidx.core.widget.h r9 = r7.f1206m
            if (r9 != 0) goto L5a
            androidx.core.widget.h r9 = new androidx.core.widget.h
            r9.<init>(r7)
            r7.f1206m = r9
        L5a:
            androidx.core.widget.h r9 = r7.f1206m
            r9.m2151m(r2)
            androidx.core.widget.h r9 = r7.f1206m
            r9.onTouch(r7, r8)
            goto L6c
        L65:
            androidx.core.widget.h r8 = r7.f1206m
            if (r8 == 0) goto L6c
            r8.m2151m(r1)
        L6c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0232r.mo994e(android.view.MotionEvent, int):boolean");
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean hasFocus() {
        return this.f1203j || super.hasFocus();
    }

    @Override // android.view.View
    public boolean hasWindowFocus() {
        return this.f1203j || super.hasWindowFocus();
    }

    @Override // android.view.View
    public boolean isFocused() {
        return this.f1203j || super.isFocused();
    }

    @Override // android.view.View
    public boolean isInTouchMode() {
        return (this.f1203j && this.f1202i) || super.isInTouchMode();
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        this.f1207n = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        if (Build.VERSION.SDK_INT < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f1207n == null) {
            b bVar = new b();
            this.f1207n = bVar;
            bVar.m997b();
        }
        boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked == 9 || actionMasked == 7) {
            int iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (iPointToPosition != -1 && iPointToPosition != getSelectedItemPosition()) {
                View childAt = getChildAt(iPointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    setSelectionFromTop(iPointToPosition, childAt.getTop() - getTop());
                }
                m992k();
            }
        } else {
            setSelection(-1);
        }
        return zOnHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f1199f = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        b bVar = this.f1207n;
        if (bVar != null) {
            bVar.m996a();
        }
        return super.onTouchEvent(motionEvent);
    }

    void setListSelectionHidden(boolean z3) {
        this.f1202i = z3;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        a aVar = drawable != null ? new a(drawable) : null;
        this.f1201h = aVar;
        super.setSelector(aVar);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f1195b = rect.left;
        this.f1196c = rect.top;
        this.f1197d = rect.right;
        this.f1198e = rect.bottom;
    }
}
