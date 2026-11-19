package androidx.compose.p014ui.platform;

import android.view.View;
import android.view.ViewGroup;
import androidx.collection.MutableObjectList;
import p181hd.InterfaceC9540l;

/* loaded from: classes2.dex */
public final class FocusFinderCompat_androidKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void addFocusableViews(View view, MutableObjectList<View> mutableObjectList, int i10) {
        addFocusableViews(view, mutableObjectList, i10, view.isInTouchMode());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View findUserSetNextFocus(final View view, final View view2, int i10) {
        int nextFocusForwardId;
        if (i10 == 1) {
            if (view.getId() == -1) {
                return null;
            }
            return findViewByPredicateInsideOut(view2, view, new InterfaceC9540l() { // from class: androidx.compose.ui.platform.FocusFinderCompat_androidKt.findUserSetNextFocus.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // p181hd.InterfaceC9540l
                public final Boolean invoke(View view3) {
                    return Boolean.valueOf(FocusFinderCompat_androidKt.findViewInsideOutShouldExist(view2, view3, view3.getNextFocusForwardId()) == view);
                }
            });
        }
        if (i10 == 2 && (nextFocusForwardId = view.getNextFocusForwardId()) != -1) {
            return findViewInsideOutShouldExist(view2, view, nextFocusForwardId);
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x001d, code lost:
    
        return r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final android.view.View findViewByPredicateInsideOut(android.view.View r4, android.view.View r5, p181hd.InterfaceC9540l r6) {
        /*
            r0 = 0
            r1 = r0
        L2:
            android.view.View r1 = findViewByPredicateTraversal(r5, r6, r1)
            if (r1 != 0) goto L1d
            if (r5 != r4) goto Lb
            goto L1d
        Lb:
            android.view.ViewParent r1 = r5.getParent()
            if (r1 == 0) goto L1c
            boolean r2 = r1 instanceof android.view.View
            if (r2 != 0) goto L16
            goto L1c
        L16:
            android.view.View r1 = (android.view.View) r1
            r3 = r1
            r1 = r5
            r5 = r3
            goto L2
        L1c:
            return r0
        L1d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p014ui.platform.FocusFinderCompat_androidKt.findViewByPredicateInsideOut(android.view.View, android.view.View, hd.l):android.view.View");
    }

    private static final View findViewByPredicateTraversal(View view, InterfaceC9540l interfaceC9540l, View view2) {
        View viewFindViewByPredicateTraversal;
        if (((Boolean) interfaceC9540l.invoke(view)).booleanValue()) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if (childAt != view2 && (viewFindViewByPredicateTraversal = findViewByPredicateTraversal(childAt, interfaceC9540l, view2)) != null) {
                return viewFindViewByPredicateTraversal;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View findViewInsideOutShouldExist(View view, View view2, final int i10) {
        return findViewByPredicateInsideOut(view, view2, new InterfaceC9540l() { // from class: androidx.compose.ui.platform.FocusFinderCompat_androidKt.findViewInsideOutShouldExist.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p181hd.InterfaceC9540l
            public final Boolean invoke(View view3) {
                return Boolean.valueOf(view3.getId() == i10);
            }
        });
    }

    private static final void addFocusableViews(View view, MutableObjectList<View> mutableObjectList, int i10, boolean z10) {
        if (view.getVisibility() == 0 && view.isFocusable() && view.isEnabled() && view.getWidth() > 0 && view.getHeight() > 0 && (!z10 || view.isFocusableInTouchMode())) {
            mutableObjectList.add(view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                addFocusableViews(viewGroup.getChildAt(i11), mutableObjectList, i10, z10);
            }
        }
    }
}
