package androidx.compose.p014ui.platform;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.collection.MutableObjectIntMap;
import androidx.collection.MutableObjectList;
import androidx.collection.MutableScatterMap;
import androidx.collection.MutableScatterSet;
import androidx.collection.ObjectIntMapKt;
import androidx.collection.ObjectList;
import androidx.collection.ScatterMapKt;
import androidx.collection.ScatterSetKt;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Collections;
import java.util.Comparator;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p265nd.AbstractC10410o;
import p265nd.C10405j;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class FocusFinderCompat {
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final FocusFinderCompat$Companion$FocusFinderThreadLocal$1 FocusFinderThreadLocal = new ThreadLocal<FocusFinderCompat>() { // from class: androidx.compose.ui.platform.FocusFinderCompat$Companion$FocusFinderThreadLocal$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.lang.ThreadLocal
        public FocusFinderCompat initialValue() {
            return new FocusFinderCompat();
        }
    };
    private final Rect focusedRect = new Rect();
    private final UserSpecifiedFocusComparator userSpecifiedFocusComparator = new UserSpecifiedFocusComparator(new UserSpecifiedFocusComparator.NextFocusGetter() { // from class: androidx.compose.ui.platform.z
        @Override // androidx.compose.ui.platform.FocusFinderCompat.UserSpecifiedFocusComparator.NextFocusGetter
        public final View get(View view, View view2) {
            return FocusFinderCompat.userSpecifiedFocusComparator$lambda$0(this.f1276a, view, view2);
        }
    });
    private final MutableObjectList<View> tmpList = new MutableObjectList<>(0, 1, null);

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        public final FocusFinderCompat getInstance() {
            FocusFinderCompat focusFinderCompat = FocusFinderCompat.FocusFinderThreadLocal.get();
            AbstractC9979u.m20291d(focusFinderCompat);
            return focusFinderCompat;
        }

        private Companion() {
        }
    }

    public static final class UserSpecifiedFocusComparator implements Comparator<View> {
        private final NextFocusGetter mNextFocusGetter;
        private View root;
        private final MutableScatterMap<View, View> nextFoci = ScatterMapKt.mutableScatterMapOf();
        private final MutableScatterSet<View> isConnectedTo = ScatterSetKt.mutableScatterSetOf();
        private final MutableScatterMap<View, View> headsOfChains = ScatterMapKt.mutableScatterMapOf();
        private final MutableObjectIntMap<View> originalOrdinal = ObjectIntMapKt.mutableObjectIntMapOf();

        public interface NextFocusGetter {
            View get(View view, View view2);
        }

        public UserSpecifiedFocusComparator(NextFocusGetter nextFocusGetter) {
            this.mNextFocusGetter = nextFocusGetter;
        }

        public final void recycle() {
            this.root = null;
            this.headsOfChains.clear();
            this.isConnectedTo.clear();
            this.originalOrdinal.clear();
            this.nextFoci.clear();
        }

        public final void setFocusables(ObjectList<View> objectList, View view) {
            this.root = view;
            Object[] objArr = objectList.content;
            int i10 = objectList._size;
            for (int i11 = 0; i11 < i10; i11++) {
                this.originalOrdinal.set((View) objArr[i11], i11);
            }
            C10405j c10405jM21768u = AbstractC10410o.m21768u(0, objectList._size);
            int iM21733b = c10405jM21768u.m21733b();
            int iM21734c = c10405jM21768u.m21734c();
            if (iM21733b <= iM21734c) {
                while (true) {
                    View view2 = objectList.get(iM21734c);
                    View view3 = this.mNextFocusGetter.get(view, view2);
                    if (view3 != null && this.originalOrdinal.containsKey(view3)) {
                        this.nextFoci.set(view2, view3);
                        this.isConnectedTo.add(view3);
                    }
                    if (iM21734c == iM21733b) {
                        break;
                    } else {
                        iM21734c--;
                    }
                }
            }
            C10405j c10405jM21768u2 = AbstractC10410o.m21768u(0, objectList._size);
            int iM21733b2 = c10405jM21768u2.m21733b();
            int iM21734c2 = c10405jM21768u2.m21734c();
            if (iM21733b2 > iM21734c2) {
                return;
            }
            while (true) {
                View view4 = objectList.get(iM21734c2);
                if (this.nextFoci.get(view4) != null && !this.isConnectedTo.contains(view4)) {
                    setHeadOfChain(view4);
                }
                if (iM21734c2 == iM21733b2) {
                    return;
                } else {
                    iM21734c2--;
                }
            }
        }

        public final void setHeadOfChain(View view) {
            View view2 = view;
            while (view != null) {
                View view3 = this.headsOfChains.get(view);
                if (view3 != null) {
                    if (view3 == view2) {
                        return;
                    }
                    view = view2;
                    view2 = view3;
                }
                this.headsOfChains.set(view, view2);
                view = this.nextFoci.get(view);
            }
        }

        @Override // java.util.Comparator
        public int compare(View view, View view2) {
            if (view == view2) {
                return 0;
            }
            if (view == null) {
                return -1;
            }
            if (view2 == null) {
                return 1;
            }
            View view3 = this.headsOfChains.get(view);
            View view4 = this.headsOfChains.get(view2);
            if (view3 == view4 && view3 != null) {
                if (view == view3) {
                    return -1;
                }
                return (view2 == view3 || this.nextFoci.get(view) == null) ? 1 : -1;
            }
            if (view3 != null) {
                view = view3;
            }
            if (view4 != null) {
                view2 = view4;
            }
            if (view3 == null && view4 == null) {
                return 0;
            }
            return this.originalOrdinal.get(view) < this.originalOrdinal.get(view2) ? -1 : 1;
        }
    }

    private final void FocusFinder() {
    }

    private final View findNextFocus(ViewGroup viewGroup, View view, int i10, MutableObjectList<View> mutableObjectList) {
        Rect rect = this.focusedRect;
        view.getFocusedRect(rect);
        viewGroup.offsetDescendantRectToMyCoords(view, rect);
        return findNextFocusInRelativeDirection(mutableObjectList, viewGroup, view, i10);
    }

    @SuppressLint({"AsCollectionCall"})
    private final View findNextFocusInRelativeDirection(MutableObjectList<View> mutableObjectList, ViewGroup viewGroup, View view, int i10) {
        try {
            UserSpecifiedFocusComparator userSpecifiedFocusComparator = this.userSpecifiedFocusComparator;
            AbstractC9979u.m20291d(viewGroup);
            userSpecifiedFocusComparator.setFocusables(mutableObjectList, viewGroup);
            Collections.sort(mutableObjectList.asMutableList(), this.userSpecifiedFocusComparator);
            this.userSpecifiedFocusComparator.recycle();
            int size = mutableObjectList.getSize();
            View previousFocusable = null;
            if (size < 2) {
                return null;
            }
            boolean[] zArr = new boolean[1];
            if (i10 == 1) {
                previousFocusable = getPreviousFocusable(view, mutableObjectList, size, zArr);
            } else if (i10 == 2) {
                previousFocusable = getNextFocusable(view, mutableObjectList, size, zArr);
            }
            return previousFocusable == null ? mutableObjectList.get(size - 1) : previousFocusable;
        } catch (Throwable th) {
            this.userSpecifiedFocusComparator.recycle();
            throw th;
        }
    }

    private final View findNextUserSpecifiedFocus(ViewGroup viewGroup, View view, int i10) {
        View viewFindUserSetNextFocus = FocusFinderCompat_androidKt.findUserSetNextFocus(view, viewGroup, i10);
        boolean z10 = true;
        View viewFindUserSetNextFocus2 = viewFindUserSetNextFocus;
        while (viewFindUserSetNextFocus != null) {
            if (viewFindUserSetNextFocus.isFocusable() && viewFindUserSetNextFocus.getVisibility() == 0 && (!viewFindUserSetNextFocus.isInTouchMode() || viewFindUserSetNextFocus.isFocusableInTouchMode())) {
                return viewFindUserSetNextFocus;
            }
            viewFindUserSetNextFocus = FocusFinderCompat_androidKt.findUserSetNextFocus(viewFindUserSetNextFocus, viewGroup, i10);
            boolean z11 = !z10;
            if (!z10) {
                viewFindUserSetNextFocus2 = viewFindUserSetNextFocus2 != null ? FocusFinderCompat_androidKt.findUserSetNextFocus(viewFindUserSetNextFocus2, viewGroup, i10) : null;
                if (viewFindUserSetNextFocus2 == viewFindUserSetNextFocus) {
                    break;
                }
            }
            z10 = z11;
        }
        return null;
    }

    private final ViewGroup getEffectiveRoot(ViewGroup viewGroup, View view) {
        if (view != null && view != viewGroup) {
            ViewParent parent = view.getParent();
            ViewGroup viewGroup2 = null;
            while (true) {
                if (!(parent instanceof ViewGroup)) {
                    break;
                }
                if (parent == viewGroup) {
                    if (viewGroup2 == null) {
                        break;
                    }
                    return viewGroup2;
                }
                ViewGroup viewGroup3 = (ViewGroup) parent;
                if (viewGroup3.getTouchscreenBlocksFocus() && view.getContext().getPackageManager().hasSystemFeature("android.hardware.touchscreen")) {
                    viewGroup2 = viewGroup3;
                }
                parent = viewGroup3.getParent();
            }
        }
        return viewGroup;
    }

    private final View getNextFocusable(View view, ObjectList<View> objectList, int i10, boolean[] zArr) {
        int i11;
        if (i10 < 2) {
            return null;
        }
        int iLastIndexOf = objectList.lastIndexOf(view);
        if (iLastIndexOf >= 0 && (i11 = iLastIndexOf + 1) < i10) {
            return objectList.get(i11);
        }
        zArr[0] = true;
        return objectList.get(0);
    }

    private final View getPreviousFocusable(View view, ObjectList<View> objectList, int i10, boolean[] zArr) {
        int iIndexOf;
        if (i10 < 2) {
            return null;
        }
        if (view != null && (iIndexOf = objectList.indexOf(view)) > 0) {
            return objectList.get(iIndexOf - 1);
        }
        zArr[0] = true;
        return objectList.get(i10 - 1);
    }

    private final boolean isValidId(int i10) {
        return (i10 == 0 || i10 == -1) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View userSpecifiedFocusComparator$lambda$0(FocusFinderCompat focusFinderCompat, View view, View view2) {
        if (focusFinderCompat.isValidId(view2.getNextFocusForwardId())) {
            return FocusFinderCompat_androidKt.findUserSetNextFocus(view2, view, 2);
        }
        return null;
    }

    public final View findNextFocus1d(ViewGroup viewGroup, View view, int i10) {
        ViewGroup effectiveRoot = getEffectiveRoot(viewGroup, view);
        View viewFindNextUserSpecifiedFocus = findNextUserSpecifiedFocus(effectiveRoot, view, i10);
        if (viewFindNextUserSpecifiedFocus != null) {
            return viewFindNextUserSpecifiedFocus;
        }
        MutableObjectList<View> mutableObjectList = this.tmpList;
        try {
            mutableObjectList.clear();
            FocusFinderCompat_androidKt.addFocusableViews(effectiveRoot, mutableObjectList, i10);
            if (!mutableObjectList.isEmpty()) {
                viewFindNextUserSpecifiedFocus = findNextFocus(effectiveRoot, view, i10, mutableObjectList);
            }
            return viewFindNextUserSpecifiedFocus;
        } finally {
            mutableObjectList.clear();
        }
    }
}
