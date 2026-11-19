package com.luck.picture.lib.widget;

import com.luck.picture.lib.widget.SlideSelectTouchListener;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.luck.picture.lib.widget.a */
/* loaded from: classes5.dex */
public class C7514a implements SlideSelectTouchListener.InterfaceC7511b {

    /* renamed from: a */
    public final a f12671a;

    /* renamed from: b */
    public HashSet f12672b;

    /* renamed from: com.luck.picture.lib.widget.a$a */
    public interface a {
        /* renamed from: a */
        void mo9001a(int i10, int i11, boolean z10, boolean z11);

        Set getSelection();
    }

    public C7514a(a aVar) {
        this.f12671a = aVar;
    }

    @Override // com.luck.picture.lib.widget.SlideSelectTouchListener.InterfaceC7511b
    /* renamed from: a */
    public void mo9642a(int i10) {
        this.f12672b = new HashSet();
        Set selection = this.f12671a.getSelection();
        if (selection != null) {
            this.f12672b.addAll(selection);
        }
        this.f12672b.contains(Integer.valueOf(i10));
        this.f12671a.mo9001a(i10, i10, !this.f12672b.contains(Integer.valueOf(i10)), true);
    }

    @Override // com.luck.picture.lib.widget.SlideSelectTouchListener.InterfaceC7512c
    /* renamed from: b */
    public void mo9644b(int i10, int i11, boolean z10) {
        while (i10 <= i11) {
            m9648d(i10, i10, z10 != this.f12672b.contains(Integer.valueOf(i10)));
            i10++;
        }
    }

    @Override // com.luck.picture.lib.widget.SlideSelectTouchListener.InterfaceC7511b
    /* renamed from: c */
    public void mo9643c(int i10) {
        this.f12672b = null;
    }

    /* renamed from: d */
    public final void m9648d(int i10, int i11, boolean z10) {
        this.f12671a.mo9001a(i10, i11, z10, false);
    }
}
