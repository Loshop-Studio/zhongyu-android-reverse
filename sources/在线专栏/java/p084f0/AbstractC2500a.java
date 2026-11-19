package p084f0;

import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import com.umeng.analytics.pro.C1855am;
import p084f0.C2501b;

/* renamed from: f0.a */
/* loaded from: classes.dex */
public abstract class AbstractC2500a extends BaseAdapter implements Filterable, C2501b.a {

    /* renamed from: a */
    protected boolean f10117a;

    /* renamed from: b */
    protected boolean f10118b;

    /* renamed from: c */
    protected Cursor f10119c;

    /* renamed from: d */
    protected Context f10120d;

    /* renamed from: e */
    protected int f10121e;

    /* renamed from: f */
    protected a f10122f;

    /* renamed from: g */
    protected DataSetObserver f10123g;

    /* renamed from: h */
    protected C2501b f10124h;

    /* renamed from: f0.a$a */
    private class a extends ContentObserver {
        a() {
            super(new Handler());
        }

        @Override // android.database.ContentObserver
        public boolean deliverSelfNotifications() {
            return true;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z3) {
            AbstractC2500a.this.m8422i();
        }
    }

    /* renamed from: f0.a$b */
    private class b extends DataSetObserver {
        b() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            AbstractC2500a abstractC2500a = AbstractC2500a.this;
            abstractC2500a.f10117a = true;
            abstractC2500a.notifyDataSetChanged();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            AbstractC2500a abstractC2500a = AbstractC2500a.this;
            abstractC2500a.f10117a = false;
            abstractC2500a.notifyDataSetInvalidated();
        }
    }

    public AbstractC2500a(Context context, Cursor cursor, boolean z3) {
        m8420f(context, cursor, z3 ? 1 : 2);
    }

    /* renamed from: a */
    public void mo754a(Cursor cursor) {
        Cursor cursorM8423j = m8423j(cursor);
        if (cursorM8423j != null) {
            cursorM8423j.close();
        }
    }

    @Override // p084f0.C2501b.a
    /* renamed from: b */
    public Cursor mo8419b() {
        return this.f10119c;
    }

    /* renamed from: c */
    public abstract CharSequence mo755c(Cursor cursor);

    /* renamed from: e */
    public abstract void mo757e(View view, Context context, Cursor cursor);

    /* renamed from: f */
    void m8420f(Context context, Cursor cursor, int i4) {
        if ((i4 & 1) == 1) {
            i4 |= 2;
            this.f10118b = true;
        } else {
            this.f10118b = false;
        }
        boolean z3 = cursor != null;
        this.f10119c = cursor;
        this.f10117a = z3;
        this.f10120d = context;
        this.f10121e = z3 ? cursor.getColumnIndexOrThrow(C1855am.f8398d) : -1;
        if ((i4 & 2) == 2) {
            this.f10122f = new a();
            this.f10123g = new b();
        } else {
            this.f10122f = null;
            this.f10123g = null;
        }
        if (z3) {
            a aVar = this.f10122f;
            if (aVar != null) {
                cursor.registerContentObserver(aVar);
            }
            DataSetObserver dataSetObserver = this.f10123g;
            if (dataSetObserver != null) {
                cursor.registerDataSetObserver(dataSetObserver);
            }
        }
    }

    /* renamed from: g */
    public abstract View mo8421g(Context context, Cursor cursor, ViewGroup viewGroup);

    @Override // android.widget.Adapter
    public int getCount() {
        Cursor cursor;
        if (!this.f10117a || (cursor = this.f10119c) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i4, View view, ViewGroup viewGroup) {
        if (!this.f10117a) {
            return null;
        }
        this.f10119c.moveToPosition(i4);
        if (view == null) {
            view = mo8421g(this.f10120d, this.f10119c, viewGroup);
        }
        mo757e(view, this.f10120d, this.f10119c);
        return view;
    }

    @Override // android.widget.Filterable
    public Filter getFilter() {
        if (this.f10124h == null) {
            this.f10124h = new C2501b(this);
        }
        return this.f10124h;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i4) {
        Cursor cursor;
        if (!this.f10117a || (cursor = this.f10119c) == null) {
            return null;
        }
        cursor.moveToPosition(i4);
        return this.f10119c;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i4) {
        Cursor cursor;
        if (this.f10117a && (cursor = this.f10119c) != null && cursor.moveToPosition(i4)) {
            return this.f10119c.getLong(this.f10121e);
        }
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i4, View view, ViewGroup viewGroup) {
        if (!this.f10117a) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        }
        if (this.f10119c.moveToPosition(i4)) {
            if (view == null) {
                view = mo758h(this.f10120d, this.f10119c, viewGroup);
            }
            mo757e(view, this.f10120d, this.f10119c);
            return view;
        }
        throw new IllegalStateException("couldn't move cursor to position " + i4);
    }

    /* renamed from: h */
    public abstract View mo758h(Context context, Cursor cursor, ViewGroup viewGroup);

    /* renamed from: i */
    protected void m8422i() {
        Cursor cursor;
        if (!this.f10118b || (cursor = this.f10119c) == null || cursor.isClosed()) {
            return;
        }
        this.f10117a = this.f10119c.requery();
    }

    /* renamed from: j */
    public Cursor m8423j(Cursor cursor) {
        Cursor cursor2 = this.f10119c;
        if (cursor == cursor2) {
            return null;
        }
        if (cursor2 != null) {
            a aVar = this.f10122f;
            if (aVar != null) {
                cursor2.unregisterContentObserver(aVar);
            }
            DataSetObserver dataSetObserver = this.f10123g;
            if (dataSetObserver != null) {
                cursor2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f10119c = cursor;
        if (cursor != null) {
            a aVar2 = this.f10122f;
            if (aVar2 != null) {
                cursor.registerContentObserver(aVar2);
            }
            DataSetObserver dataSetObserver2 = this.f10123g;
            if (dataSetObserver2 != null) {
                cursor.registerDataSetObserver(dataSetObserver2);
            }
            this.f10121e = cursor.getColumnIndexOrThrow(C1855am.f8398d);
            this.f10117a = true;
            notifyDataSetChanged();
        } else {
            this.f10121e = -1;
            this.f10117a = false;
            notifyDataSetInvalidated();
        }
        return cursor2;
    }
}
