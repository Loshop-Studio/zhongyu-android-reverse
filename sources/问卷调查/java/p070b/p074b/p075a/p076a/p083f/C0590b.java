package p070b.p074b.p075a.p076a.p083f;

import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

/* renamed from: b.b.a.a.f.b */
/* loaded from: classes.dex */
public class C0590b extends FloatingActionButton.AbstractC0936a {

    /* renamed from: a */
    public final /* synthetic */ int f3588a;

    /* renamed from: b */
    public final /* synthetic */ BottomAppBar f3589b;

    /* renamed from: b.b.a.a.f.b$a */
    public class a extends FloatingActionButton.AbstractC0936a {
        public a() {
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.AbstractC0936a
        /* renamed from: b */
        public void mo2119b(FloatingActionButton floatingActionButton) {
            BottomAppBar.m2613v(C0590b.this.f3589b);
        }
    }

    public C0590b(BottomAppBar bottomAppBar, int i) {
        this.f3589b = bottomAppBar;
        this.f3588a = i;
    }

    @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.AbstractC0936a
    /* renamed from: a */
    public void mo2118a(FloatingActionButton floatingActionButton) {
        BottomAppBar bottomAppBar = this.f3589b;
        int i = this.f3588a;
        int i2 = BottomAppBar.f4815W;
        floatingActionButton.setTranslationX(bottomAppBar.m2614A(i));
        floatingActionButton.m2675m(new a(), true);
    }
}
