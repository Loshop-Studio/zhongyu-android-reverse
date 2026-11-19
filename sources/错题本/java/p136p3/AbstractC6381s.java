package p136p3;

import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.util.Pools;
import com.xuexiang.xui.R$id;
import com.xuexiang.xui.widget.tabbar.C4225c;
import com.xuexiang.xui.widget.tabbar.C4226d;
import com.xuexiang.xui.widget.tabbar.TabSegment;
import com.xuexiang.xui.widget.tabbar.TabSegment.TabItemView;
import java.util.ArrayList;

/* renamed from: p3.s */
/* loaded from: classes3.dex */
public abstract class AbstractC6381s {

    /* renamed from: a */
    public Pools.SimplePool f10440a;

    /* renamed from: b */
    public ArrayList f10441b;

    /* renamed from: c */
    public ArrayList f10442c;

    /* renamed from: d */
    public C4225c f10443d;

    /* renamed from: a */
    public final void m6031a(int i) {
        ArrayList arrayList = this.f10442c;
        int size = arrayList.size();
        while (size > 0 && i > 0) {
            View view = (View) arrayList.remove(size - 1);
            if (this.f10440a == null) {
                this.f10440a = new Pools.SimplePool(12);
            }
            Object tag = view.getTag(R$id.xui_view_can_not_cache_tag);
            if (tag == null || !((Boolean) tag).booleanValue()) {
                try {
                    this.f10440a.release(view);
                } catch (Exception unused) {
                }
            }
            this.f10443d.removeView(view);
            size--;
            i--;
        }
    }

    /* renamed from: b */
    public final Object m6032b(int i) {
        ArrayList arrayList = this.f10441b;
        if (arrayList != null && i >= 0 && i < arrayList.size()) {
            return arrayList.get(i);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: c */
    public final void m6033c() {
        C4225c c4225c = this.f10443d;
        ArrayList arrayList = this.f10441b;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f10442c;
        int size2 = arrayList2.size();
        if (size2 > size) {
            m6031a(size2 - size);
        } else if (size2 < size) {
            for (int i = 0; i < size - size2; i++) {
                Pools.SimplePool simplePool = this.f10440a;
                View tabItemView = simplePool != null ? (View) simplePool.acquire() : null;
                if (tabItemView == null) {
                    TabSegment tabSegment = ((C4226d) this).f4988e;
                    tabItemView = tabSegment.new TabItemView(tabSegment.getContext());
                }
                c4225c.addView(tabItemView);
                arrayList2.add(tabItemView);
            }
        }
        for (int i8 = 0; i8 < size; i8++) {
            View view = (View) arrayList2.get(i8);
            C6370h c6370h = (C6370h) arrayList.get(i8);
            TabSegment.TabItemView tabItemView2 = (TabSegment.TabItemView) view;
            TextView textView = tabItemView2.getTextView();
            int i9 = TabSegment.f4927B;
            c6370h.getClass();
            TabSegment tabSegment2 = ((C4226d) this).f4988e;
            boolean z8 = true;
            if (tabSegment2.f4944p == 1) {
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) textView.getLayoutParams();
                layoutParams.addRule(9, 0);
                layoutParams.addRule(14, -1);
                layoutParams.addRule(11, 0);
                textView.setLayoutParams(layoutParams);
            }
            textView.setText(c6370h.f10414c);
            textView.setTextSize(0, tabSegment2.f4933e);
            if (tabSegment2.f4931c != i8) {
                z8 = false;
            }
            tabItemView2.m3599b(c6370h, z8);
            tabItemView2.setTag(Integer.valueOf(i8));
            tabItemView2.setOnClickListener(tabSegment2.f4948t);
        }
        c4225c.invalidate();
        c4225c.requestLayout();
    }
}
