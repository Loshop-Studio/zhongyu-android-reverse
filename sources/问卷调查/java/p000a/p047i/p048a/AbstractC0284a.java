package p000a.p047i.p048a;

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
import p000a.p047i.p048a.C0285b;

/* renamed from: a.i.a.a */
/* loaded from: classes.dex */
public abstract class AbstractC0284a extends BaseAdapter implements Filterable, C0285b.a {

    /* renamed from: b */
    public boolean f1703b;

    /* renamed from: c */
    public boolean f1704c;

    /* renamed from: d */
    public Cursor f1705d;

    /* renamed from: e */
    public Context f1706e;

    /* renamed from: f */
    public int f1707f;

    /* renamed from: g */
    public a f1708g;

    /* renamed from: h */
    public DataSetObserver f1709h;

    /* renamed from: i */
    public C0285b f1710i;

    /* renamed from: a.i.a.a$a */
    public class a extends ContentObserver {
        public a() {
            super(new Handler());
        }

        @Override // android.database.ContentObserver
        public boolean deliverSelfNotifications() {
            return true;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z) {
            Cursor cursor;
            AbstractC0284a abstractC0284a = AbstractC0284a.this;
            if (!abstractC0284a.f1704c || (cursor = abstractC0284a.f1705d) == null || cursor.isClosed()) {
                return;
            }
            abstractC0284a.f1703b = abstractC0284a.f1705d.requery();
        }
    }

    /* renamed from: a.i.a.a$b */
    public class b extends DataSetObserver {
        public b() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            AbstractC0284a abstractC0284a = AbstractC0284a.this;
            abstractC0284a.f1703b = true;
            abstractC0284a.notifyDataSetChanged();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            AbstractC0284a abstractC0284a = AbstractC0284a.this;
            abstractC0284a.f1703b = false;
            abstractC0284a.notifyDataSetInvalidated();
        }
    }

    public AbstractC0284a(Context context, Cursor cursor, boolean z) {
        b bVar;
        int i = z ? 1 : 2;
        if ((i & 1) == 1) {
            i |= 2;
            this.f1704c = true;
        } else {
            this.f1704c = false;
        }
        boolean z2 = cursor != null;
        this.f1705d = cursor;
        this.f1703b = z2;
        this.f1706e = context;
        this.f1707f = z2 ? cursor.getColumnIndexOrThrow("_id") : -1;
        if ((i & 2) == 2) {
            this.f1708g = new a();
            bVar = new b();
        } else {
            bVar = null;
            this.f1708g = null;
        }
        this.f1709h = bVar;
        if (z2) {
            a aVar = this.f1708g;
            if (aVar != null) {
                cursor.registerContentObserver(aVar);
            }
            DataSetObserver dataSetObserver = this.f1709h;
            if (dataSetObserver != null) {
                cursor.registerDataSetObserver(dataSetObserver);
            }
        }
    }

    /* renamed from: a */
    public abstract void mo368a(View view, Context context, Cursor cursor);

    /* renamed from: b */
    public void mo369b(Cursor cursor) {
        Cursor cursor2 = this.f1705d;
        if (cursor == cursor2) {
            cursor2 = null;
        } else {
            if (cursor2 != null) {
                a aVar = this.f1708g;
                if (aVar != null) {
                    cursor2.unregisterContentObserver(aVar);
                }
                DataSetObserver dataSetObserver = this.f1709h;
                if (dataSetObserver != null) {
                    cursor2.unregisterDataSetObserver(dataSetObserver);
                }
            }
            this.f1705d = cursor;
            if (cursor != null) {
                a aVar2 = this.f1708g;
                if (aVar2 != null) {
                    cursor.registerContentObserver(aVar2);
                }
                DataSetObserver dataSetObserver2 = this.f1709h;
                if (dataSetObserver2 != null) {
                    cursor.registerDataSetObserver(dataSetObserver2);
                }
                this.f1707f = cursor.getColumnIndexOrThrow("_id");
                this.f1703b = true;
                notifyDataSetChanged();
            } else {
                this.f1707f = -1;
                this.f1703b = false;
                notifyDataSetInvalidated();
            }
        }
        if (cursor2 != null) {
            cursor2.close();
        }
    }

    /* renamed from: c */
    public abstract CharSequence mo370c(Cursor cursor);

    /* renamed from: d */
    public abstract View mo371d(Context context, Cursor cursor, ViewGroup viewGroup);

    @Override // android.widget.Adapter
    public int getCount() {
        Cursor cursor;
        if (!this.f1703b || (cursor = this.f1705d) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        if (!this.f1703b) {
            return null;
        }
        this.f1705d.moveToPosition(i);
        if (view == null) {
            AbstractC0286c abstractC0286c = (AbstractC0286c) this;
            view = abstractC0286c.f1716l.inflate(abstractC0286c.f1715k, viewGroup, false);
        }
        mo368a(view, this.f1706e, this.f1705d);
        return view;
    }

    @Override // android.widget.Filterable
    public Filter getFilter() {
        if (this.f1710i == null) {
            this.f1710i = new C0285b(this);
        }
        return this.f1710i;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        Cursor cursor;
        if (!this.f1703b || (cursor = this.f1705d) == null) {
            return null;
        }
        cursor.moveToPosition(i);
        return this.f1705d;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        Cursor cursor;
        if (this.f1703b && (cursor = this.f1705d) != null && cursor.moveToPosition(i)) {
            return this.f1705d.getLong(this.f1707f);
        }
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (!this.f1703b) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        }
        if (this.f1705d.moveToPosition(i)) {
            if (view == null) {
                view = mo371d(this.f1706e, this.f1705d, viewGroup);
            }
            mo368a(view, this.f1706e, this.f1705d);
            return view;
        }
        throw new IllegalStateException("couldn't move cursor to position " + i);
    }
}
