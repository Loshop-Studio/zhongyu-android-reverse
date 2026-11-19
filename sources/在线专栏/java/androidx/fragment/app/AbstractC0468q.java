package androidx.fragment.app;

import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC0496f;
import androidx.viewpager.widget.AbstractC0783a;
import java.util.ArrayList;

@Deprecated
/* renamed from: androidx.fragment.app.q */
/* loaded from: classes.dex */
public abstract class AbstractC0468q extends AbstractC0783a {
    public static final int BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT = 1;

    @Deprecated
    public static final int BEHAVIOR_SET_USER_VISIBLE_HINT = 0;
    private static final boolean DEBUG = false;
    private static final String TAG = "FragmentStatePagerAdapt";
    private final int mBehavior;
    private AbstractC0470s mCurTransaction;
    private Fragment mCurrentPrimaryItem;
    private boolean mExecutingFinishUpdate;
    private final FragmentManager mFragmentManager;
    private ArrayList<Fragment> mFragments;
    private ArrayList<Fragment.SavedState> mSavedState;

    @Deprecated
    public AbstractC0468q(FragmentManager fragmentManager) {
        this(fragmentManager, 0);
    }

    @Override // androidx.viewpager.widget.AbstractC0783a
    public void destroyItem(ViewGroup viewGroup, int i4, Object obj) {
        Fragment fragment = (Fragment) obj;
        if (this.mCurTransaction == null) {
            this.mCurTransaction = this.mFragmentManager.m2489m();
        }
        while (this.mSavedState.size() <= i4) {
            this.mSavedState.add(null);
        }
        this.mSavedState.set(i4, fragment.isAdded() ? this.mFragmentManager.m2490m1(fragment) : null);
        this.mFragments.set(i4, null);
        this.mCurTransaction.mo2557p(fragment);
        if (fragment.equals(this.mCurrentPrimaryItem)) {
            this.mCurrentPrimaryItem = null;
        }
    }

    @Override // androidx.viewpager.widget.AbstractC0783a
    public void finishUpdate(ViewGroup viewGroup) {
        AbstractC0470s abstractC0470s = this.mCurTransaction;
        if (abstractC0470s != null) {
            if (!this.mExecutingFinishUpdate) {
                try {
                    this.mExecutingFinishUpdate = true;
                    abstractC0470s.mo2553k();
                } finally {
                    this.mExecutingFinishUpdate = false;
                }
            }
            this.mCurTransaction = null;
        }
    }

    public abstract Fragment getItem(int i4);

    @Override // androidx.viewpager.widget.AbstractC0783a
    public Object instantiateItem(ViewGroup viewGroup, int i4) {
        Fragment.SavedState savedState;
        Fragment fragment;
        if (this.mFragments.size() > i4 && (fragment = this.mFragments.get(i4)) != null) {
            return fragment;
        }
        if (this.mCurTransaction == null) {
            this.mCurTransaction = this.mFragmentManager.m2489m();
        }
        Fragment item = getItem(i4);
        if (this.mSavedState.size() > i4 && (savedState = this.mSavedState.get(i4)) != null) {
            item.setInitialSavedState(savedState);
        }
        while (this.mFragments.size() <= i4) {
            this.mFragments.add(null);
        }
        item.setMenuVisibility(false);
        if (this.mBehavior == 0) {
            item.setUserVisibleHint(false);
        }
        this.mFragments.set(i4, item);
        this.mCurTransaction.m2699b(viewGroup.getId(), item);
        if (this.mBehavior == 1) {
            this.mCurTransaction.mo2558s(item, AbstractC0496f.c.STARTED);
        }
        return item;
    }

    @Override // androidx.viewpager.widget.AbstractC0783a
    public boolean isViewFromObject(View view, Object obj) {
        return ((Fragment) obj).getView() == view;
    }

    @Override // androidx.viewpager.widget.AbstractC0783a
    public void restoreState(Parcelable parcelable, ClassLoader classLoader) throws NumberFormatException {
        if (parcelable != null) {
            Bundle bundle = (Bundle) parcelable;
            bundle.setClassLoader(classLoader);
            Parcelable[] parcelableArray = bundle.getParcelableArray("states");
            this.mSavedState.clear();
            this.mFragments.clear();
            if (parcelableArray != null) {
                for (Parcelable parcelable2 : parcelableArray) {
                    this.mSavedState.add((Fragment.SavedState) parcelable2);
                }
            }
            for (String str : bundle.keySet()) {
                if (str.startsWith("f")) {
                    int i4 = Integer.parseInt(str.substring(1));
                    Fragment fragmentM2497q0 = this.mFragmentManager.m2497q0(bundle, str);
                    if (fragmentM2497q0 != null) {
                        while (this.mFragments.size() <= i4) {
                            this.mFragments.add(null);
                        }
                        fragmentM2497q0.setMenuVisibility(false);
                        this.mFragments.set(i4, fragmentM2497q0);
                    } else {
                        Log.w(TAG, "Bad fragment at key " + str);
                    }
                }
            }
        }
    }

    @Override // androidx.viewpager.widget.AbstractC0783a
    public Parcelable saveState() {
        Bundle bundle;
        if (this.mSavedState.size() > 0) {
            bundle = new Bundle();
            Fragment.SavedState[] savedStateArr = new Fragment.SavedState[this.mSavedState.size()];
            this.mSavedState.toArray(savedStateArr);
            bundle.putParcelableArray("states", savedStateArr);
        } else {
            bundle = null;
        }
        for (int i4 = 0; i4 < this.mFragments.size(); i4++) {
            Fragment fragment = this.mFragments.get(i4);
            if (fragment != null && fragment.isAdded()) {
                if (bundle == null) {
                    bundle = new Bundle();
                }
                this.mFragmentManager.m2470d1(bundle, "f" + i4, fragment);
            }
        }
        return bundle;
    }

    @Override // androidx.viewpager.widget.AbstractC0783a
    public void setPrimaryItem(ViewGroup viewGroup, int i4, Object obj) {
        Fragment fragment = (Fragment) obj;
        Fragment fragment2 = this.mCurrentPrimaryItem;
        if (fragment != fragment2) {
            if (fragment2 != null) {
                fragment2.setMenuVisibility(false);
                if (this.mBehavior == 1) {
                    if (this.mCurTransaction == null) {
                        this.mCurTransaction = this.mFragmentManager.m2489m();
                    }
                    this.mCurTransaction.mo2558s(this.mCurrentPrimaryItem, AbstractC0496f.c.STARTED);
                } else {
                    this.mCurrentPrimaryItem.setUserVisibleHint(false);
                }
            }
            fragment.setMenuVisibility(true);
            if (this.mBehavior == 1) {
                if (this.mCurTransaction == null) {
                    this.mCurTransaction = this.mFragmentManager.m2489m();
                }
                this.mCurTransaction.mo2558s(fragment, AbstractC0496f.c.RESUMED);
            } else {
                fragment.setUserVisibleHint(true);
            }
            this.mCurrentPrimaryItem = fragment;
        }
    }

    @Override // androidx.viewpager.widget.AbstractC0783a
    public void startUpdate(ViewGroup viewGroup) {
        if (viewGroup.getId() != -1) {
            return;
        }
        throw new IllegalStateException("ViewPager with adapter " + this + " requires a view id");
    }

    public AbstractC0468q(FragmentManager fragmentManager, int i4) {
        this.mCurTransaction = null;
        this.mSavedState = new ArrayList<>();
        this.mFragments = new ArrayList<>();
        this.mCurrentPrimaryItem = null;
        this.mFragmentManager = fragmentManager;
        this.mBehavior = i4;
    }
}
