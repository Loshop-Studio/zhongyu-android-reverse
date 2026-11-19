package com.google.android.material.datepicker;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.widget.GridView;
import android.widget.ListAdapter;
import io.github.inflationx.calligraphy3.C1088R;
import java.util.Calendar;
import java.util.Iterator;
import java.util.Objects;
import p000a.p031h.p042i.C0240b;
import p000a.p031h.p043j.C0266o;
import p070b.p074b.p075a.p076a.p091m.C0607a0;
import p070b.p074b.p075a.p076a.p091m.C0622n;
import p070b.p074b.p075a.p076a.p091m.C0623o;
import p070b.p074b.p075a.p076a.p091m.C0628t;
import p070b.p074b.p075a.p076a.p091m.InterfaceC0612d;

/* loaded from: classes.dex */
public final class MaterialCalendarGridView extends GridView {

    /* renamed from: b */
    public final Calendar f4935b;

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f4935b = C0607a0.m2181e();
        if (C0623o.m2199B0(getContext())) {
            setNextFocusLeftId(C1088R.id.cancel_button);
            setNextFocusRightId(C1088R.id.confirm_button);
        }
        C0266o.m875n(this, new C0622n(this));
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C0628t getAdapter() {
        return (C0628t) super.getAdapter();
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getAdapter().notifyDataSetChanged();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        C0628t adapter = getAdapter();
        InterfaceC0612d<?> interfaceC0612d = adapter.f3803c;
        adapter.getItem(adapter.m2212a());
        adapter.getItem(adapter.m2214c());
        Iterator<C0240b<Long, Long>> it = interfaceC0612d.m2192i().iterator();
        while (it.hasNext()) {
            Objects.requireNonNull(it.next());
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public void onFocusChanged(boolean z, int i, Rect rect) {
        int iM2212a;
        if (!z) {
            super.onFocusChanged(false, i, rect);
            return;
        }
        if (i == 33) {
            iM2212a = getAdapter().m2214c();
        } else {
            if (i != 130) {
                super.onFocusChanged(true, i, rect);
                return;
            }
            iM2212a = getAdapter().m2212a();
        }
        setSelection(iM2212a);
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (!super.onKeyDown(i, keyEvent)) {
            return false;
        }
        if (getSelectedItemPosition() == -1 || getSelectedItemPosition() >= getAdapter().m2212a()) {
            return true;
        }
        if (19 != i) {
            return false;
        }
        setSelection(getAdapter().m2212a());
        return true;
    }

    @Override // android.widget.AdapterView
    public final void setAdapter(ListAdapter listAdapter) {
        if (!(listAdapter instanceof C0628t)) {
            throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", MaterialCalendarGridView.class.getCanonicalName(), C0628t.class.getCanonicalName()));
        }
        super.setAdapter(listAdapter);
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public void setSelection(int i) {
        if (i < getAdapter().m2212a()) {
            i = getAdapter().m2212a();
        }
        super.setSelection(i);
    }
}
