package androidx.appcompat.view.menu;

import android.content.Context;
import android.os.Parcelable;

/* renamed from: androidx.appcompat.view.menu.m */
/* loaded from: classes.dex */
public interface InterfaceC0131m {

    /* renamed from: androidx.appcompat.view.menu.m$a */
    public interface a {
        /* renamed from: a */
        boolean mo252a(C0125g c0125g);

        void onCloseMenu(C0125g c0125g, boolean z3);
    }

    boolean collapseItemActionView(C0125g c0125g, C0127i c0127i);

    boolean expandItemActionView(C0125g c0125g, C0127i c0127i);

    boolean flagActionItems();

    int getId();

    void initForMenu(Context context, C0125g c0125g);

    void onCloseMenu(C0125g c0125g, boolean z3);

    void onRestoreInstanceState(Parcelable parcelable);

    Parcelable onSaveInstanceState();

    boolean onSubMenuSelected(SubMenuC0136r subMenuC0136r);

    void setCallback(a aVar);

    void updateMenuView(boolean z3);
}
