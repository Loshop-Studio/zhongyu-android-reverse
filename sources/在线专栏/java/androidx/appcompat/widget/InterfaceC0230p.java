package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.view.menu.C0125g;
import androidx.appcompat.view.menu.InterfaceC0131m;
import androidx.core.view.C0362y;

/* renamed from: androidx.appcompat.widget.p */
/* loaded from: classes.dex */
public interface InterfaceC0230p {
    /* renamed from: a */
    void mo856a(Menu menu, InterfaceC0131m.a aVar);

    /* renamed from: b */
    boolean mo857b();

    /* renamed from: c */
    void mo858c();

    void collapseActionView();

    /* renamed from: d */
    boolean mo859d();

    /* renamed from: e */
    boolean mo860e();

    /* renamed from: f */
    boolean mo861f();

    /* renamed from: g */
    boolean mo862g();

    Context getContext();

    CharSequence getTitle();

    /* renamed from: h */
    void mo863h();

    /* renamed from: i */
    void mo864i(InterfaceC0131m.a aVar, C0125g.a aVar2);

    /* renamed from: j */
    void mo865j(C0240z c0240z);

    /* renamed from: k */
    ViewGroup mo866k();

    /* renamed from: l */
    void mo867l(boolean z3);

    /* renamed from: m */
    boolean mo868m();

    /* renamed from: n */
    void mo869n(int i4);

    /* renamed from: o */
    int mo870o();

    /* renamed from: p */
    Menu mo871p();

    /* renamed from: q */
    void mo872q(int i4);

    /* renamed from: r */
    int mo873r();

    /* renamed from: s */
    C0362y mo874s(int i4, long j4);

    void setIcon(int i4);

    void setIcon(Drawable drawable);

    void setVisibility(int i4);

    void setWindowCallback(Window.Callback callback);

    void setWindowTitle(CharSequence charSequence);

    /* renamed from: t */
    void mo875t();

    /* renamed from: u */
    void mo876u();

    /* renamed from: v */
    void mo877v(boolean z3);
}
