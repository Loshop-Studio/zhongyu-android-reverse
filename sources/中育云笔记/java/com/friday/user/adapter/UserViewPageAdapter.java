package com.friday.user.adapter;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC9979u;

@StabilityInferred(parameters = 0)
/* loaded from: classes5.dex */
public final class UserViewPageAdapter extends FragmentPagerAdapter {

    /* renamed from: a */
    public ArrayList f10593a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserViewPageAdapter(FragmentManager fm, ArrayList list) {
        super(fm, 1);
        AbstractC9979u.m20294g(fm, "fm");
        AbstractC9979u.m20294g(list, "list");
        this.f10593a = new ArrayList();
        m7752a(list);
    }

    /* renamed from: a */
    public final void m7752a(ArrayList arrayList) {
        this.f10593a.clear();
        this.f10593a = arrayList;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getCount() {
        return this.f10593a.size();
    }

    @Override // androidx.fragment.app.FragmentPagerAdapter
    public Fragment getItem(int i10) {
        Object obj = this.f10593a.get(i10);
        AbstractC9979u.m20293f(obj, "get(...)");
        return (Fragment) obj;
    }
}
