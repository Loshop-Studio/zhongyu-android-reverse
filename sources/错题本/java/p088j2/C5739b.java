package p088j2;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.xuexiang.xui.widget.dialog.materialdialog.internal.MDButton;
import com.xuexiang.xui.widget.dialog.materialdialog.internal.MDRootLayout;

/* renamed from: j2.b */
/* loaded from: classes3.dex */
public final class C5739b extends RecyclerView.OnScrollListener {

    /* renamed from: a */
    public final /* synthetic */ ViewGroup f9081a;

    /* renamed from: b */
    public final /* synthetic */ boolean f9082b;

    /* renamed from: c */
    public final /* synthetic */ MDRootLayout f9083c;

    public C5739b(MDRootLayout mDRootLayout, ViewGroup viewGroup, boolean z8) {
        this.f9083c = mDRootLayout;
        this.f9081a = viewGroup;
        this.f9082b = z8;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public final void onScrolled(RecyclerView recyclerView, int i, int i8) {
        super.onScrolled(recyclerView, i, i8);
        MDRootLayout mDRootLayout = this.f9083c;
        MDButton[] mDButtonArr = mDRootLayout.f4263a;
        int length = mDButtonArr.length;
        boolean z8 = false;
        int i9 = 0;
        while (true) {
            if (i9 < length) {
                MDButton mDButton = mDButtonArr[i9];
                if (mDButton != null && mDButton.getVisibility() != 8) {
                    z8 = true;
                    break;
                }
                i9++;
            } else {
                break;
            }
        }
        MDRootLayout.m3478a(mDRootLayout, this.f9081a, this.f9082b, z8);
        mDRootLayout.invalidate();
    }
}
