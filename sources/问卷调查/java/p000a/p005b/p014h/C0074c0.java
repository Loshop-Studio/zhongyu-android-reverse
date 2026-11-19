package p000a.p005b.p014h;

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
import io.github.inflationx.calligraphy3.C1088R;
import java.lang.reflect.Field;
import p000a.p005b.p009e.p010a.C0037c;
import p000a.p031h.p046k.C0280c;

/* renamed from: a.b.h.c0 */
/* loaded from: classes.dex */
public class C0074c0 extends ListView {

    /* renamed from: b */
    public final Rect f580b;

    /* renamed from: c */
    public int f581c;

    /* renamed from: d */
    public int f582d;

    /* renamed from: e */
    public int f583e;

    /* renamed from: f */
    public int f584f;

    /* renamed from: g */
    public int f585g;

    /* renamed from: h */
    public Field f586h;

    /* renamed from: i */
    public a f587i;

    /* renamed from: j */
    public boolean f588j;

    /* renamed from: k */
    public boolean f589k;

    /* renamed from: l */
    public boolean f590l;

    /* renamed from: m */
    public C0280c f591m;

    /* renamed from: n */
    public b f592n;

    /* renamed from: a.b.h.c0$a */
    public static class a extends C0037c {

        /* renamed from: c */
        public boolean f593c;

        public a(Drawable drawable) {
            super(drawable);
            this.f593c = true;
        }

        @Override // p000a.p005b.p009e.p010a.C0037c, android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            if (this.f593c) {
                this.f278b.draw(canvas);
            }
        }

        @Override // p000a.p005b.p009e.p010a.C0037c, android.graphics.drawable.Drawable
        public void setHotspot(float f2, float f3) {
            if (this.f593c) {
                this.f278b.setHotspot(f2, f3);
            }
        }

        @Override // p000a.p005b.p009e.p010a.C0037c, android.graphics.drawable.Drawable
        public void setHotspotBounds(int i, int i2, int i3, int i4) {
            if (this.f593c) {
                this.f278b.setHotspotBounds(i, i2, i3, i4);
            }
        }

        @Override // p000a.p005b.p009e.p010a.C0037c, android.graphics.drawable.Drawable
        public boolean setState(int[] iArr) {
            if (this.f593c) {
                return this.f278b.setState(iArr);
            }
            return false;
        }

        @Override // p000a.p005b.p009e.p010a.C0037c, android.graphics.drawable.Drawable
        public boolean setVisible(boolean z, boolean z2) {
            if (this.f593c) {
                return super.setVisible(z, z2);
            }
            return false;
        }
    }

    /* renamed from: a.b.h.c0$b */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C0074c0 c0074c0 = C0074c0.this;
            c0074c0.f592n = null;
            c0074c0.drawableStateChanged();
        }
    }

    public C0074c0(Context context, boolean z) throws NoSuchFieldException {
        super(context, null, C1088R.attr.dropDownListViewStyle);
        this.f580b = new Rect();
        this.f581c = 0;
        this.f582d = 0;
        this.f583e = 0;
        this.f584f = 0;
        this.f589k = z;
        setCacheColorHint(0);
        try {
            Field declaredField = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            this.f586h = declaredField;
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException e2) {
            e2.printStackTrace();
        }
    }

    private void setSelectorEnabled(boolean z) {
        a aVar = this.f587i;
        if (aVar != null) {
            aVar.f593c = z;
        }
    }

    /* renamed from: a */
    public int m296a(int i, int i2, int i3) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        int measuredHeight = listPaddingTop + listPaddingBottom;
        if (adapter == null) {
            return measuredHeight;
        }
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        View view = null;
        while (i4 < count) {
            int itemViewType = adapter.getItemViewType(i4);
            if (itemViewType != i5) {
                view = null;
                i5 = itemViewType;
            }
            view = adapter.getView(i4, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i7 = layoutParams.height;
            view.measure(i, i7 > 0 ? View.MeasureSpec.makeMeasureSpec(i7, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i4 > 0) {
                measuredHeight += dividerHeight;
            }
            measuredHeight += view.getMeasuredHeight();
            if (measuredHeight >= i2) {
                return (i3 < 0 || i4 <= i3 || i6 <= 0 || measuredHeight == i2) ? i2 : i6;
            }
            if (i3 >= 0 && i4 >= i3) {
                i6 = measuredHeight;
            }
            i4++;
        }
        return measuredHeight;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x015a  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean m297b(android.view.MotionEvent r17, int r18) throws java.lang.IllegalAccessException, java.lang.IllegalArgumentException {
        /*
            Method dump skipped, instructions count: 360
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p005b.p014h.C0074c0.m297b(android.view.MotionEvent, int):boolean");
    }

    /* renamed from: c */
    public final void m298c() {
        Drawable selector = getSelector();
        if (selector != null && this.f590l && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        Drawable selector;
        if (!this.f580b.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(this.f580b);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        if (this.f592n != null) {
            return;
        }
        super.drawableStateChanged();
        setSelectorEnabled(true);
        m298c();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean hasFocus() {
        return this.f589k || super.hasFocus();
    }

    @Override // android.view.View
    public boolean hasWindowFocus() {
        return this.f589k || super.hasWindowFocus();
    }

    @Override // android.view.View
    public boolean isFocused() {
        return this.f589k || super.isFocused();
    }

    @Override // android.view.View
    public boolean isInTouchMode() {
        return (this.f589k && this.f588j) || super.isInTouchMode();
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        this.f592n = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        if (Build.VERSION.SDK_INT < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f592n == null) {
            b bVar = new b();
            this.f592n = bVar;
            post(bVar);
        }
        boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked == 9 || actionMasked == 7) {
            int iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (iPointToPosition != -1 && iPointToPosition != getSelectedItemPosition()) {
                View childAt = getChildAt(iPointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    setSelectionFromTop(iPointToPosition, childAt.getTop() - getTop());
                }
                m298c();
            }
        } else {
            setSelection(-1);
        }
        return zOnHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f585g = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        b bVar = this.f592n;
        if (bVar != null) {
            C0074c0 c0074c0 = C0074c0.this;
            c0074c0.f592n = null;
            c0074c0.removeCallbacks(bVar);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z) {
        this.f588j = z;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        a aVar = drawable != null ? new a(drawable) : null;
        this.f587i = aVar;
        super.setSelector(aVar);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f581c = rect.left;
        this.f582d = rect.top;
        this.f583e = rect.right;
        this.f584f = rect.bottom;
    }
}
