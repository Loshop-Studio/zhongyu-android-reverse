package p000a.p047i.p048a;

import android.database.Cursor;
import android.widget.Filter;
import p000a.p005b.p014h.ViewOnClickListenerC0098o0;

/* renamed from: a.i.a.b */
/* loaded from: classes.dex */
public class C0285b extends Filter {

    /* renamed from: a */
    public a f1713a;

    /* renamed from: a.i.a.b$a */
    public interface a {
    }

    public C0285b(a aVar) {
        this.f1713a = aVar;
    }

    @Override // android.widget.Filter
    public CharSequence convertResultToString(Object obj) {
        return ((ViewOnClickListenerC0098o0) this.f1713a).mo370c((Cursor) obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0038  */
    @Override // android.widget.Filter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.widget.Filter.FilterResults performFiltering(java.lang.CharSequence r5) {
        /*
            r4 = this;
            a.i.a.b$a r0 = r4.f1713a
            a.b.h.o0 r0 = (p000a.p005b.p014h.ViewOnClickListenerC0098o0) r0
            java.util.Objects.requireNonNull(r0)
            if (r5 != 0) goto Lc
            java.lang.String r5 = ""
            goto L10
        Lc:
            java.lang.String r5 = r5.toString()
        L10:
            androidx.appcompat.widget.SearchView r1 = r0.f725m
            int r1 = r1.getVisibility()
            r2 = 0
            if (r1 != 0) goto L38
            androidx.appcompat.widget.SearchView r1 = r0.f725m
            int r1 = r1.getWindowVisibility()
            if (r1 == 0) goto L22
            goto L38
        L22:
            android.app.SearchableInfo r1 = r0.f726n     // Catch: java.lang.RuntimeException -> L30
            r3 = 50
            android.database.Cursor r5 = r0.m374g(r1, r5, r3)     // Catch: java.lang.RuntimeException -> L30
            if (r5 == 0) goto L38
            r5.getCount()     // Catch: java.lang.RuntimeException -> L30
            goto L39
        L30:
            r5 = move-exception
            java.lang.String r0 = "SuggestionsAdapter"
            java.lang.String r1 = "Search suggestions query threw an exception."
            android.util.Log.w(r0, r1, r5)
        L38:
            r5 = r2
        L39:
            android.widget.Filter$FilterResults r0 = new android.widget.Filter$FilterResults
            r0.<init>()
            if (r5 == 0) goto L49
            int r1 = r5.getCount()
            r0.count = r1
            r0.values = r5
            goto L4e
        L49:
            r5 = 0
            r0.count = r5
            r0.values = r2
        L4e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p047i.p048a.C0285b.performFiltering(java.lang.CharSequence):android.widget.Filter$FilterResults");
    }

    @Override // android.widget.Filter
    public void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        a aVar = this.f1713a;
        Cursor cursor = ((AbstractC0284a) aVar).f1705d;
        Object obj = filterResults.values;
        if (obj == null || obj == cursor) {
            return;
        }
        ((ViewOnClickListenerC0098o0) aVar).mo369b((Cursor) obj);
    }
}
