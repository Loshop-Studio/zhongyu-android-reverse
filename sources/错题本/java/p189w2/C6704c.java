package p189w2;

import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import com.xuexiang.xui.R$string;
import com.xuexiang.xui.widget.imageview.preview.p034ui.PreviewActivity;
import java.util.ArrayList;

/* renamed from: w2.c */
/* loaded from: classes3.dex */
public final class C6704c implements ViewPager.OnPageChangeListener {

    /* renamed from: a */
    public final /* synthetic */ PreviewActivity f11316a;

    public C6704c(PreviewActivity previewActivity) {
        this.f11316a = previewActivity;
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public final void onPageSelected(int i) {
        PreviewActivity previewActivity = this.f11316a;
        TextView textView = previewActivity.f4450f;
        if (textView != null) {
            int i8 = R$string.xui_preview_count_string;
            Integer numValueOf = Integer.valueOf(i + 1);
            ArrayList arrayList = previewActivity.f4446b;
            textView.setText(previewActivity.getString(i8, numValueOf, Integer.valueOf(arrayList != null ? arrayList.size() : 0)));
        }
        previewActivity.f4447c = i;
        previewActivity.f4449e.setCurrentItem(i, true);
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public final void onPageScrollStateChanged(int i) {
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public final void onPageScrolled(int i, float f, int i8) {
    }
}
