package p084f0;

import android.database.Cursor;
import android.widget.Filter;

/* renamed from: f0.b */
/* loaded from: classes.dex */
class C2501b extends Filter {

    /* renamed from: a */
    a f10127a;

    /* renamed from: f0.b$a */
    interface a {
        /* renamed from: a */
        void mo754a(Cursor cursor);

        /* renamed from: b */
        Cursor mo8419b();

        /* renamed from: c */
        CharSequence mo755c(Cursor cursor);

        /* renamed from: d */
        Cursor mo756d(CharSequence charSequence);
    }

    C2501b(a aVar) {
        this.f10127a = aVar;
    }

    @Override // android.widget.Filter
    public CharSequence convertResultToString(Object obj) {
        return this.f10127a.mo755c((Cursor) obj);
    }

    @Override // android.widget.Filter
    protected Filter.FilterResults performFiltering(CharSequence charSequence) {
        Cursor cursorMo756d = this.f10127a.mo756d(charSequence);
        Filter.FilterResults filterResults = new Filter.FilterResults();
        if (cursorMo756d != null) {
            filterResults.count = cursorMo756d.getCount();
            filterResults.values = cursorMo756d;
        } else {
            filterResults.count = 0;
            filterResults.values = null;
        }
        return filterResults;
    }

    @Override // android.widget.Filter
    protected void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        Cursor cursorMo8419b = this.f10127a.mo8419b();
        Object obj = filterResults.values;
        if (obj == null || obj == cursorMo8419b) {
            return;
        }
        this.f10127a.mo754a((Cursor) obj);
    }
}
