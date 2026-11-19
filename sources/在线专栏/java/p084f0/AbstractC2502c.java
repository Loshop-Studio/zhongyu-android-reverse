package p084f0;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: f0.c */
/* loaded from: classes.dex */
public abstract class AbstractC2502c extends AbstractC2500a {

    /* renamed from: i */
    private int f10128i;

    /* renamed from: j */
    private int f10129j;

    /* renamed from: k */
    private LayoutInflater f10130k;

    @Deprecated
    public AbstractC2502c(Context context, int i4, Cursor cursor, boolean z3) {
        super(context, cursor, z3);
        this.f10129j = i4;
        this.f10128i = i4;
        this.f10130k = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    @Override // p084f0.AbstractC2500a
    /* renamed from: g */
    public View mo8421g(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f10130k.inflate(this.f10129j, viewGroup, false);
    }

    @Override // p084f0.AbstractC2500a
    /* renamed from: h */
    public View mo758h(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f10130k.inflate(this.f10128i, viewGroup, false);
    }
}
