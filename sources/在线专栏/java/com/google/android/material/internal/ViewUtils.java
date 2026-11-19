package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.inputmethod.InputMethodManager;
import androidx.core.view.C0340c0;
import androidx.core.view.C0358u;
import androidx.core.view.InterfaceC0353p;
import com.google.android.material.C1371R;
import com.xuexiang.xui.widget.popupwindow.good.IGoodView;

/* loaded from: classes.dex */
public class ViewUtils {

    public interface OnApplyWindowInsetsListener {
        C0340c0 onApplyWindowInsets(View view, C0340c0 c0340c0, RelativePadding relativePadding);
    }

    private ViewUtils() {
    }

    public static void doOnApplyWindowInsets(View view, AttributeSet attributeSet, int i4, int i5) {
        doOnApplyWindowInsets(view, attributeSet, i4, i5, null);
    }

    public static float dpToPx(Context context, int i4) {
        return TypedValue.applyDimension(1, i4, context.getResources().getDisplayMetrics());
    }

    public static ViewGroup getContentView(View view) {
        if (view == null) {
            return null;
        }
        View rootView = view.getRootView();
        ViewGroup viewGroup = (ViewGroup) rootView.findViewById(R.id.content);
        if (viewGroup != null) {
            return viewGroup;
        }
        if (rootView == view || !(rootView instanceof ViewGroup)) {
            return null;
        }
        return (ViewGroup) rootView;
    }

    public static ViewOverlayImpl getContentViewOverlay(View view) {
        return getOverlay(getContentView(view));
    }

    public static ViewOverlayImpl getOverlay(View view) {
        if (view == null) {
            return null;
        }
        return new ViewOverlayApi18(view);
    }

    public static float getParentAbsoluteElevation(View view) {
        float fM2058u = IGoodView.DEFAULT_TO_ALPHA;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            fM2058u += C0358u.m2058u((View) parent);
        }
        return fM2058u;
    }

    public static boolean isLayoutRtl(View view) {
        return C0358u.m1978A(view) == 1;
    }

    public static PorterDuff.Mode parseTintMode(int i4, PorterDuff.Mode mode) {
        if (i4 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i4 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i4 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i4) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    public static void requestApplyInsetsWhenAttached(View view) {
        if (C0358u.m2012U(view)) {
            C0358u.m2045n0(view);
        } else {
            view.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.google.android.material.internal.ViewUtils.4
                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewAttachedToWindow(View view2) {
                    view2.removeOnAttachStateChangeListener(this);
                    C0358u.m2045n0(view2);
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewDetachedFromWindow(View view2) {
                }
            });
        }
    }

    public static void requestFocusAndShowKeyboard(final View view) {
        view.requestFocus();
        view.post(new Runnable() { // from class: com.google.android.material.internal.ViewUtils.1
            @Override // java.lang.Runnable
            public void run() {
                ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 1);
            }
        });
    }

    public static void doOnApplyWindowInsets(View view, AttributeSet attributeSet, int i4, int i5, final OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        TypedArray typedArrayObtainStyledAttributes = view.getContext().obtainStyledAttributes(attributeSet, C1371R.styleable.Insets, i4, i5);
        final boolean z3 = typedArrayObtainStyledAttributes.getBoolean(C1371R.styleable.Insets_paddingBottomSystemWindowInsets, false);
        final boolean z4 = typedArrayObtainStyledAttributes.getBoolean(C1371R.styleable.Insets_paddingLeftSystemWindowInsets, false);
        final boolean z5 = typedArrayObtainStyledAttributes.getBoolean(C1371R.styleable.Insets_paddingRightSystemWindowInsets, false);
        typedArrayObtainStyledAttributes.recycle();
        doOnApplyWindowInsets(view, new OnApplyWindowInsetsListener() { // from class: com.google.android.material.internal.ViewUtils.2
            @Override // com.google.android.material.internal.ViewUtils.OnApplyWindowInsetsListener
            public C0340c0 onApplyWindowInsets(View view2, C0340c0 c0340c0, RelativePadding relativePadding) {
                if (z3) {
                    relativePadding.bottom += c0340c0.m1871i();
                }
                boolean zIsLayoutRtl = ViewUtils.isLayoutRtl(view2);
                if (z4) {
                    if (zIsLayoutRtl) {
                        relativePadding.end += c0340c0.m1872j();
                    } else {
                        relativePadding.start += c0340c0.m1872j();
                    }
                }
                if (z5) {
                    if (zIsLayoutRtl) {
                        relativePadding.start += c0340c0.m1873k();
                    } else {
                        relativePadding.end += c0340c0.m1873k();
                    }
                }
                relativePadding.applyToView(view2);
                OnApplyWindowInsetsListener onApplyWindowInsetsListener2 = onApplyWindowInsetsListener;
                return onApplyWindowInsetsListener2 != null ? onApplyWindowInsetsListener2.onApplyWindowInsets(view2, c0340c0, relativePadding) : c0340c0;
            }
        });
    }

    public static class RelativePadding {
        public int bottom;
        public int end;
        public int start;
        public int top;

        public RelativePadding(int i4, int i5, int i6, int i7) {
            this.start = i4;
            this.top = i5;
            this.end = i6;
            this.bottom = i7;
        }

        public void applyToView(View view) {
            C0358u.m1987E0(view, this.start, this.top, this.end, this.bottom);
        }

        public RelativePadding(RelativePadding relativePadding) {
            this.start = relativePadding.start;
            this.top = relativePadding.top;
            this.end = relativePadding.end;
            this.bottom = relativePadding.bottom;
        }
    }

    public static void doOnApplyWindowInsets(View view, final OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        final RelativePadding relativePadding = new RelativePadding(C0358u.m1990G(view), view.getPaddingTop(), C0358u.m1988F(view), view.getPaddingBottom());
        C0358u.m1985D0(view, new InterfaceC0353p() { // from class: com.google.android.material.internal.ViewUtils.3
            @Override // androidx.core.view.InterfaceC0353p
            public C0340c0 onApplyWindowInsets(View view2, C0340c0 c0340c0) {
                return onApplyWindowInsetsListener.onApplyWindowInsets(view2, c0340c0, new RelativePadding(relativePadding));
            }
        });
        requestApplyInsetsWhenAttached(view);
    }
}
