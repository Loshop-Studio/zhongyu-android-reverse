package com.xuexiang.xui.widget.banner.widget.loopviewpager;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import androidx.viewpager.widget.AbstractC0783a;
import androidx.viewpager.widget.ViewPager;
import com.xuexiang.xui.widget.popupwindow.good.IGoodView;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class LoopViewPager extends ViewPager {
    private static final boolean DEFAULT_BOUNDARY_CASHING = false;
    private LoopPagerAdapterWrapper mAdapter;
    private boolean mBoundaryCaching;
    private List<ViewPager.InterfaceC0779i> mOnPageChangeListeners;
    private ViewPager.InterfaceC0779i onPageChangeListener;

    public LoopViewPager(Context context) {
        super(context);
        this.mBoundaryCaching = false;
        this.onPageChangeListener = new ViewPager.InterfaceC0779i() { // from class: com.xuexiang.xui.widget.banner.widget.loopviewpager.LoopViewPager.1
            private float mPreviousOffset = -1.0f;
            private float mPreviousPosition = -1.0f;

            @Override // androidx.viewpager.widget.ViewPager.InterfaceC0779i
            public void onPageScrollStateChanged(int i4) throws Resources.NotFoundException {
                if (LoopViewPager.this.mAdapter != null) {
                    int currentItem = LoopViewPager.super.getCurrentItem();
                    int realPosition = LoopViewPager.this.mAdapter.toRealPosition(currentItem);
                    if (i4 == 0 && (currentItem == 0 || currentItem == LoopViewPager.this.mAdapter.getCount() - 1)) {
                        LoopViewPager.this.setCurrentItem(realPosition, false);
                    }
                }
                if (LoopViewPager.this.mOnPageChangeListeners != null) {
                    for (int i5 = 0; i5 < LoopViewPager.this.mOnPageChangeListeners.size(); i5++) {
                        ViewPager.InterfaceC0779i interfaceC0779i = (ViewPager.InterfaceC0779i) LoopViewPager.this.mOnPageChangeListeners.get(i5);
                        if (interfaceC0779i != null) {
                            interfaceC0779i.onPageScrollStateChanged(i4);
                        }
                    }
                }
            }

            @Override // androidx.viewpager.widget.ViewPager.InterfaceC0779i
            public void onPageScrolled(int i4, float f4, int i5) throws Resources.NotFoundException {
                if (LoopViewPager.this.mAdapter != null) {
                    int realPosition = LoopViewPager.this.mAdapter.toRealPosition(i4);
                    if (f4 == IGoodView.DEFAULT_TO_ALPHA && this.mPreviousOffset == IGoodView.DEFAULT_TO_ALPHA && (i4 == 0 || i4 == LoopViewPager.this.mAdapter.getCount() - 1)) {
                        LoopViewPager.this.setCurrentItem(realPosition, false);
                    }
                    i4 = realPosition;
                }
                this.mPreviousOffset = f4;
                int realCount = LoopViewPager.this.mAdapter != null ? LoopViewPager.this.mAdapter.getRealCount() - 1 : -1;
                if (LoopViewPager.this.mOnPageChangeListeners != null) {
                    for (int i6 = 0; i6 < LoopViewPager.this.mOnPageChangeListeners.size(); i6++) {
                        ViewPager.InterfaceC0779i interfaceC0779i = (ViewPager.InterfaceC0779i) LoopViewPager.this.mOnPageChangeListeners.get(i6);
                        if (interfaceC0779i != null) {
                            if (i4 != realCount) {
                                interfaceC0779i.onPageScrolled(i4, f4, i5);
                            } else if (f4 > 0.5d) {
                                interfaceC0779i.onPageScrolled(0, IGoodView.DEFAULT_TO_ALPHA, 0);
                            } else {
                                interfaceC0779i.onPageScrolled(i4, IGoodView.DEFAULT_TO_ALPHA, 0);
                            }
                        }
                    }
                }
            }

            @Override // androidx.viewpager.widget.ViewPager.InterfaceC0779i
            public void onPageSelected(int i4) {
                int realPosition = LoopViewPager.this.mAdapter.toRealPosition(i4);
                float f4 = realPosition;
                if (this.mPreviousPosition != f4) {
                    this.mPreviousPosition = f4;
                    if (LoopViewPager.this.mOnPageChangeListeners != null) {
                        for (int i5 = 0; i5 < LoopViewPager.this.mOnPageChangeListeners.size(); i5++) {
                            ViewPager.InterfaceC0779i interfaceC0779i = (ViewPager.InterfaceC0779i) LoopViewPager.this.mOnPageChangeListeners.get(i5);
                            if (interfaceC0779i != null) {
                                interfaceC0779i.onPageSelected(realPosition);
                            }
                        }
                    }
                }
            }
        };
        init(context);
    }

    private void init(Context context) {
        ViewPager.InterfaceC0779i interfaceC0779i = this.onPageChangeListener;
        if (interfaceC0779i != null) {
            super.removeOnPageChangeListener(interfaceC0779i);
        }
        super.addOnPageChangeListener(this.onPageChangeListener);
    }

    public static int toRealPosition(int i4, int i5) {
        int i6 = i4 - 1;
        return i6 < 0 ? i6 + i5 : i6 % i5;
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void addOnPageChangeListener(ViewPager.InterfaceC0779i interfaceC0779i) {
        if (this.mOnPageChangeListeners == null) {
            this.mOnPageChangeListeners = new ArrayList();
        }
        this.mOnPageChangeListeners.add(interfaceC0779i);
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void clearOnPageChangeListeners() {
        List<ViewPager.InterfaceC0779i> list = this.mOnPageChangeListeners;
        if (list != null) {
            list.clear();
        }
    }

    @Override // androidx.viewpager.widget.ViewPager
    public AbstractC0783a getAdapter() {
        LoopPagerAdapterWrapper loopPagerAdapterWrapper = this.mAdapter;
        return loopPagerAdapterWrapper != null ? loopPagerAdapterWrapper.getRealAdapter() : loopPagerAdapterWrapper;
    }

    @Override // androidx.viewpager.widget.ViewPager
    public int getCurrentItem() {
        LoopPagerAdapterWrapper loopPagerAdapterWrapper = this.mAdapter;
        if (loopPagerAdapterWrapper != null) {
            return loopPagerAdapterWrapper.toRealPosition(super.getCurrentItem());
        }
        return 0;
    }

    public AbstractC0783a getPageAdapterWrapper() {
        return this.mAdapter;
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void removeOnPageChangeListener(ViewPager.InterfaceC0779i interfaceC0779i) {
        List<ViewPager.InterfaceC0779i> list = this.mOnPageChangeListeners;
        if (list != null) {
            list.remove(interfaceC0779i);
        }
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void setAdapter(AbstractC0783a abstractC0783a) throws Resources.NotFoundException {
        LoopPagerAdapterWrapper loopPagerAdapterWrapper = new LoopPagerAdapterWrapper(abstractC0783a);
        this.mAdapter = loopPagerAdapterWrapper;
        loopPagerAdapterWrapper.setBoundaryCaching(this.mBoundaryCaching);
        super.setAdapter(this.mAdapter);
        setCurrentItem(0, false);
    }

    public void setBoundaryCaching(boolean z3) {
        this.mBoundaryCaching = z3;
        LoopPagerAdapterWrapper loopPagerAdapterWrapper = this.mAdapter;
        if (loopPagerAdapterWrapper != null) {
            loopPagerAdapterWrapper.setBoundaryCaching(z3);
        }
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void setCurrentItem(int i4, boolean z3) throws Resources.NotFoundException {
        super.setCurrentItem(this.mAdapter.toInnerPosition(i4), z3);
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void setOnPageChangeListener(ViewPager.InterfaceC0779i interfaceC0779i) {
        addOnPageChangeListener(interfaceC0779i);
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void setCurrentItem(int i4) throws Resources.NotFoundException {
        if (getCurrentItem() != i4) {
            setCurrentItem(i4, true);
        }
    }

    public LoopViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mBoundaryCaching = false;
        this.onPageChangeListener = new ViewPager.InterfaceC0779i() { // from class: com.xuexiang.xui.widget.banner.widget.loopviewpager.LoopViewPager.1
            private float mPreviousOffset = -1.0f;
            private float mPreviousPosition = -1.0f;

            @Override // androidx.viewpager.widget.ViewPager.InterfaceC0779i
            public void onPageScrollStateChanged(int i4) throws Resources.NotFoundException {
                if (LoopViewPager.this.mAdapter != null) {
                    int currentItem = LoopViewPager.super.getCurrentItem();
                    int realPosition = LoopViewPager.this.mAdapter.toRealPosition(currentItem);
                    if (i4 == 0 && (currentItem == 0 || currentItem == LoopViewPager.this.mAdapter.getCount() - 1)) {
                        LoopViewPager.this.setCurrentItem(realPosition, false);
                    }
                }
                if (LoopViewPager.this.mOnPageChangeListeners != null) {
                    for (int i5 = 0; i5 < LoopViewPager.this.mOnPageChangeListeners.size(); i5++) {
                        ViewPager.InterfaceC0779i interfaceC0779i = (ViewPager.InterfaceC0779i) LoopViewPager.this.mOnPageChangeListeners.get(i5);
                        if (interfaceC0779i != null) {
                            interfaceC0779i.onPageScrollStateChanged(i4);
                        }
                    }
                }
            }

            @Override // androidx.viewpager.widget.ViewPager.InterfaceC0779i
            public void onPageScrolled(int i4, float f4, int i5) throws Resources.NotFoundException {
                if (LoopViewPager.this.mAdapter != null) {
                    int realPosition = LoopViewPager.this.mAdapter.toRealPosition(i4);
                    if (f4 == IGoodView.DEFAULT_TO_ALPHA && this.mPreviousOffset == IGoodView.DEFAULT_TO_ALPHA && (i4 == 0 || i4 == LoopViewPager.this.mAdapter.getCount() - 1)) {
                        LoopViewPager.this.setCurrentItem(realPosition, false);
                    }
                    i4 = realPosition;
                }
                this.mPreviousOffset = f4;
                int realCount = LoopViewPager.this.mAdapter != null ? LoopViewPager.this.mAdapter.getRealCount() - 1 : -1;
                if (LoopViewPager.this.mOnPageChangeListeners != null) {
                    for (int i6 = 0; i6 < LoopViewPager.this.mOnPageChangeListeners.size(); i6++) {
                        ViewPager.InterfaceC0779i interfaceC0779i = (ViewPager.InterfaceC0779i) LoopViewPager.this.mOnPageChangeListeners.get(i6);
                        if (interfaceC0779i != null) {
                            if (i4 != realCount) {
                                interfaceC0779i.onPageScrolled(i4, f4, i5);
                            } else if (f4 > 0.5d) {
                                interfaceC0779i.onPageScrolled(0, IGoodView.DEFAULT_TO_ALPHA, 0);
                            } else {
                                interfaceC0779i.onPageScrolled(i4, IGoodView.DEFAULT_TO_ALPHA, 0);
                            }
                        }
                    }
                }
            }

            @Override // androidx.viewpager.widget.ViewPager.InterfaceC0779i
            public void onPageSelected(int i4) {
                int realPosition = LoopViewPager.this.mAdapter.toRealPosition(i4);
                float f4 = realPosition;
                if (this.mPreviousPosition != f4) {
                    this.mPreviousPosition = f4;
                    if (LoopViewPager.this.mOnPageChangeListeners != null) {
                        for (int i5 = 0; i5 < LoopViewPager.this.mOnPageChangeListeners.size(); i5++) {
                            ViewPager.InterfaceC0779i interfaceC0779i = (ViewPager.InterfaceC0779i) LoopViewPager.this.mOnPageChangeListeners.get(i5);
                            if (interfaceC0779i != null) {
                                interfaceC0779i.onPageSelected(realPosition);
                            }
                        }
                    }
                }
            }
        };
        init(context);
    }
}
