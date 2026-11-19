package p000a.p047i.p048a;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: a.i.a.c */
/* loaded from: classes.dex */
public abstract class AbstractC0286c extends AbstractC0284a {

    /* renamed from: j */
    public int f1714j;

    /* renamed from: k */
    public int f1715k;

    /* renamed from: l */
    public LayoutInflater f1716l;

    @Deprecated
    public AbstractC0286c(Context context, int i, Cursor cursor, boolean z) {
        super(context, null, z);
        this.f1715k = i;
        this.f1714j = i;
        this.f1716l = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    @Override // p000a.p047i.p048a.AbstractC0284a
    /* renamed from: d */
    public View mo371d(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f1716l.inflate(this.f1714j, viewGroup, false);
    }
}
