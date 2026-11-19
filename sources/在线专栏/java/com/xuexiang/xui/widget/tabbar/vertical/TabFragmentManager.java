package com.xuexiang.xui.widget.tabbar.vertical;

import androidx.fragment.app.AbstractC0470s;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.xuexiang.xui.widget.tabbar.VerticalTabLayout;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class TabFragmentManager {
    private int mContainerResId;
    private List<Fragment> mFragments;
    private VerticalTabLayout.OnTabSelectedListener mListener;
    private FragmentManager mManager;
    private VerticalTabLayout mTabLayout;

    private class OnFragmentTabSelectedListener implements VerticalTabLayout.OnTabSelectedListener {
        private OnFragmentTabSelectedListener() {
        }

        @Override // com.xuexiang.xui.widget.tabbar.VerticalTabLayout.OnTabSelectedListener
        public void onTabReselected(TabView tabView, int i4) {
        }

        @Override // com.xuexiang.xui.widget.tabbar.VerticalTabLayout.OnTabSelectedListener
        public void onTabSelected(TabView tabView, int i4) {
            TabFragmentManager.this.changeFragment();
        }

        @Override // com.xuexiang.xui.widget.tabbar.VerticalTabLayout.OnTabSelectedListener
        public void onTabUnselected(TabView tabView, int i4) {
        }
    }

    public TabFragmentManager(FragmentManager fragmentManager, List<Fragment> list, VerticalTabLayout verticalTabLayout) {
        this.mManager = fragmentManager;
        this.mFragments = list;
        this.mTabLayout = verticalTabLayout;
        OnFragmentTabSelectedListener onFragmentTabSelectedListener = new OnFragmentTabSelectedListener();
        this.mListener = onFragmentTabSelectedListener;
        this.mTabLayout.addOnTabSelectedListener(onFragmentTabSelectedListener);
    }

    public void changeFragment() {
        int i4;
        AbstractC0470s abstractC0470sM2489m = this.mManager.m2489m();
        int selectedTabPosition = this.mTabLayout.getSelectedTabPosition();
        List<Fragment> listM2504u0 = this.mManager.m2504u0();
        for (int i5 = 0; i5 < this.mFragments.size(); i5++) {
            Fragment fragment = this.mFragments.get(i5);
            if ((listM2504u0 == null || !listM2504u0.contains(fragment)) && (i4 = this.mContainerResId) != 0) {
                abstractC0470sM2489m.m2699b(i4, fragment);
            }
            if ((this.mFragments.size() <= selectedTabPosition || i5 != selectedTabPosition) && (this.mFragments.size() > selectedTabPosition || i5 != this.mFragments.size() - 1)) {
                abstractC0470sM2489m.mo2556o(fragment);
            } else {
                abstractC0470sM2489m.mo2559u(fragment);
            }
        }
        abstractC0470sM2489m.mo2550h();
        this.mManager.m2474f0();
    }

    public void detach() {
        AbstractC0470s abstractC0470sM2489m = this.mManager.m2489m();
        Iterator<Fragment> it = this.mFragments.iterator();
        while (it.hasNext()) {
            abstractC0470sM2489m.mo2557p(it.next());
        }
        abstractC0470sM2489m.mo2550h();
        this.mManager.m2474f0();
        this.mManager = null;
        this.mFragments = null;
        this.mTabLayout.removeOnTabSelectedListener(this.mListener);
        this.mListener = null;
        this.mTabLayout = null;
    }

    public TabFragmentManager(FragmentManager fragmentManager, int i4, List<Fragment> list, VerticalTabLayout verticalTabLayout) {
        this(fragmentManager, list, verticalTabLayout);
        this.mContainerResId = i4;
        changeFragment();
    }
}
