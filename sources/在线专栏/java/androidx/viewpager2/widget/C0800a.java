package androidx.viewpager2.widget;

import android.animation.LayoutTransition;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

/* renamed from: androidx.viewpager2.widget.a */
/* loaded from: classes.dex */
final class C0800a {

    /* renamed from: b */
    private static final ViewGroup.MarginLayoutParams f4707b;

    /* renamed from: a */
    private LinearLayoutManager f4708a;

    /* renamed from: androidx.viewpager2.widget.a$a */
    class a implements Comparator<int[]> {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(int[] iArr, int[] iArr2) {
            return iArr[0] - iArr2[0];
        }
    }

    static {
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -1);
        f4707b = marginLayoutParams;
        marginLayoutParams.setMargins(0, 0, 0, 0);
    }

    C0800a(LinearLayoutManager linearLayoutManager) {
        this.f4708a = linearLayoutManager;
    }

    /* renamed from: a */
    private boolean m4090a() {
        int top;
        int i4;
        int bottom;
        int i5;
        int childCount = this.f4708a.getChildCount();
        if (childCount == 0) {
            return true;
        }
        boolean z3 = this.f4708a.getOrientation() == 0;
        int[][] iArr = (int[][]) Array.newInstance((Class<?>) int.class, childCount, 2);
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = this.f4708a.getChildAt(i6);
            if (childAt == null) {
                throw new IllegalStateException("null view contained in the view hierarchy");
            }
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : f4707b;
            int[] iArr2 = iArr[i6];
            if (z3) {
                top = childAt.getLeft();
                i4 = marginLayoutParams.leftMargin;
            } else {
                top = childAt.getTop();
                i4 = marginLayoutParams.topMargin;
            }
            iArr2[0] = top - i4;
            int[] iArr3 = iArr[i6];
            if (z3) {
                bottom = childAt.getRight();
                i5 = marginLayoutParams.rightMargin;
            } else {
                bottom = childAt.getBottom();
                i5 = marginLayoutParams.bottomMargin;
            }
            iArr3[1] = bottom + i5;
        }
        Arrays.sort(iArr, new a());
        for (int i7 = 1; i7 < childCount; i7++) {
            if (iArr[i7 - 1][1] != iArr[i7][0]) {
                return false;
            }
        }
        return iArr[0][0] <= 0 && iArr[childCount - 1][1] >= iArr[0][1] - iArr[0][0];
    }

    /* renamed from: b */
    private boolean m4091b() {
        int childCount = this.f4708a.getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            if (m4092c(this.f4708a.getChildAt(i4))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    private static boolean m4092c(View view) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            LayoutTransition layoutTransition = viewGroup.getLayoutTransition();
            if (layoutTransition != null && layoutTransition.isChangingLayout()) {
                return true;
            }
            int childCount = viewGroup.getChildCount();
            for (int i4 = 0; i4 < childCount; i4++) {
                if (m4092c(viewGroup.getChildAt(i4))) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: d */
    boolean m4093d() {
        return (!m4090a() || this.f4708a.getChildCount() <= 1) && m4091b();
    }
}
