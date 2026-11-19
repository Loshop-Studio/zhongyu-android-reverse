package p027c3;

import android.view.View;
import com.xuexiang.xui.widget.layout.linkage.view.LinkageLinearLayout;
import com.xuexiang.xui.widget.layout.linkage.view.LinkageTextView;
import p169t6.AbstractC6600a;

/* renamed from: c3.a */
/* loaded from: classes3.dex */
public final class C3220a extends AbstractC6600a {

    /* renamed from: b */
    public final /* synthetic */ int f1783b;

    /* renamed from: c */
    public final /* synthetic */ View f1784c;

    public /* synthetic */ C3220a(View view, int i) {
        this.f1783b = i;
        this.f1784c = view;
    }

    @Override // p019b3.InterfaceC3107c
    /* renamed from: h */
    public final int mo2063h() {
        switch (this.f1783b) {
        }
        return 0;
    }

    @Override // p019b3.InterfaceC3107c
    /* renamed from: k */
    public final int mo2066k() {
        switch (this.f1783b) {
            case 0:
                return ((LinkageLinearLayout) this.f1784c).getHeight();
            default:
                return ((LinkageTextView) this.f1784c).getHeight();
        }
    }

    @Override // p019b3.InterfaceC3107c
    /* renamed from: t */
    public final boolean mo2067t() {
        switch (this.f1783b) {
        }
        return false;
    }
}
