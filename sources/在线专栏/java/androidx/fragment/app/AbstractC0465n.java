package androidx.fragment.app;

import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.AbstractC0496f;
import androidx.viewpager.widget.AbstractC0783a;

@Deprecated
/* renamed from: androidx.fragment.app.n */
/* loaded from: classes.dex */
public abstract class AbstractC0465n extends AbstractC0783a {
    public static final int BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT = 1;

    @Deprecated
    public static final int BEHAVIOR_SET_USER_VISIBLE_HINT = 0;
    private static final boolean DEBUG = false;
    private static final String TAG = "FragmentPagerAdapter";
    private final int mBehavior;
    private AbstractC0470s mCurTransaction;
    private Fragment mCurrentPrimaryItem;
    private boolean mExecutingFinishUpdate;
    private final FragmentManager mFragmentManager;

    @Deprecated
    public AbstractC0465n(FragmentManager fragmentManager) {
        this(fragmentManager, 0);
    }

    private static String makeFragmentName(int i4, long j4) {
        return "android:switcher:" + i4 + ":" + j4;
    }

    @Override // androidx.viewpager.widget.AbstractC0783a
    public void destroyItem(ViewGroup viewGroup, int i4, Object obj) {
        Fragment fragment = (Fragment) obj;
        if (this.mCurTransaction == null) {
            this.mCurTransaction = this.mFragmentManager.m2489m();
        }
        this.mCurTransaction.mo2554l(fragment);
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

    public long getItemId(int i4) {
        return i4;
    }

    @Override // androidx.viewpager.widget.AbstractC0783a
    public Object instantiateItem(ViewGroup viewGroup, int i4) {
        if (this.mCurTransaction == null) {
            this.mCurTransaction = this.mFragmentManager.m2489m();
        }
        long itemId = getItemId(i4);
        Fragment fragmentM2483j0 = this.mFragmentManager.m2483j0(makeFragmentName(viewGroup.getId(), itemId));
        if (fragmentM2483j0 != null) {
            this.mCurTransaction.m2704g(fragmentM2483j0);
        } else {
            fragmentM2483j0 = getItem(i4);
            this.mCurTransaction.m2700c(viewGroup.getId(), fragmentM2483j0, makeFragmentName(viewGroup.getId(), itemId));
        }
        if (fragmentM2483j0 != this.mCurrentPrimaryItem) {
            fragmentM2483j0.setMenuVisibility(false);
            if (this.mBehavior == 1) {
                this.mCurTransaction.mo2558s(fragmentM2483j0, AbstractC0496f.c.STARTED);
            } else {
                fragmentM2483j0.setUserVisibleHint(false);
            }
        }
        return fragmentM2483j0;
    }

    @Override // androidx.viewpager.widget.AbstractC0783a
    public boolean isViewFromObject(View view, Object obj) {
        return ((Fragment) obj).getView() == view;
    }

    @Override // androidx.viewpager.widget.AbstractC0783a
    public void restoreState(Parcelable parcelable, ClassLoader classLoader) {
    }

    @Override // androidx.viewpager.widget.AbstractC0783a
    public Parcelable saveState() {
        return null;
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

    public AbstractC0465n(FragmentManager fragmentManager, int i4) {
        this.mCurTransaction = null;
        this.mCurrentPrimaryItem = null;
        this.mFragmentManager = fragmentManager;
        this.mBehavior = i4;
    }
}
