package p070b.p113c.p114a.p116e.p128f.p133c.p136e;

import android.content.res.Resources;
import android.widget.TextView;
import com.xuexiang.xui.widget.imageview.preview.p159ui.PreviewActivity;
import com.xuexiang.xui.widget.imageview.preview.view.PhotoViewPager;
import io.github.inflationx.calligraphy3.C1088R;
import p000a.p068t.p069a.C0446b;

/* renamed from: b.c.a.e.f.c.e.i */
/* loaded from: classes.dex */
public class C0843i implements C0446b.i {

    /* renamed from: b */
    public final /* synthetic */ PreviewActivity f4627b;

    public C0843i(PreviewActivity previewActivity) {
        this.f4627b = previewActivity;
    }

    @Override // p000a.p068t.p069a.C0446b.i
    /* renamed from: a */
    public void mo1551a(int i) throws Resources.NotFoundException {
        PreviewActivity previewActivity = this.f4627b;
        TextView textView = previewActivity.f5226t;
        if (textView != null) {
            textView.setText(previewActivity.getString(C1088R.string.xui_preview_count_string, new Object[]{Integer.valueOf(i + 1), Integer.valueOf(this.f4627b.m2759v())}));
        }
        PreviewActivity previewActivity2 = this.f4627b;
        previewActivity2.f5223q = i;
        PhotoViewPager photoViewPager = previewActivity2.f5225s;
        photoViewPager.f2631w = false;
        photoViewPager.m1550y(i, true, false, 0);
    }

    @Override // p000a.p068t.p069a.C0446b.i
    /* renamed from: b */
    public void mo1552b(int i, float f2, int i2) {
    }

    @Override // p000a.p068t.p069a.C0446b.i
    /* renamed from: c */
    public void mo1553c(int i) {
    }
}
