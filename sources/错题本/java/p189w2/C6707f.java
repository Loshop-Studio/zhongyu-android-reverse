package p189w2;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import com.xuexiang.xui.widget.imageview.preview.p034ui.PreviewActivity;
import java.util.ArrayList;

/* renamed from: w2.f */
/* loaded from: classes3.dex */
public final class C6707f extends FragmentPagerAdapter {

    /* renamed from: a */
    public final /* synthetic */ PreviewActivity f11319a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6707f(PreviewActivity previewActivity, FragmentManager fragmentManager) {
        super(fragmentManager);
        this.f11319a = previewActivity;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        ArrayList arrayList = this.f11319a.f4448d;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    @Override // androidx.fragment.app.FragmentPagerAdapter
    public final Fragment getItem(int i) {
        return (Fragment) this.f11319a.f4448d.get(i);
    }
}
