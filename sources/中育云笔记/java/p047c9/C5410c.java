package p047c9;

import android.content.Context;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import p009a8.C0085a;
import p009a8.C0087c;

/* renamed from: c9.c */
/* loaded from: classes5.dex */
public class C5410c extends AbstractC5408a {

    /* renamed from: c9.c$a */
    public class a implements AdapterView.OnItemClickListener {

        /* renamed from: c */
        public final /* synthetic */ b f3472c;

        public a(b bVar) {
            this.f3472c = bVar;
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
            b bVar = this.f3472c;
            if (bVar != null) {
                bVar.mo2862a(C5410c.this.m2858A(), (C0085a) C5410c.this.m2858A().getItem(i10), i10);
            }
            C5410c.this.m13051c();
        }
    }

    /* renamed from: c9.c$b */
    public interface b {
        /* renamed from: a */
        void mo2862a(C0087c c0087c, C0085a c0085a, int i10);
    }

    public C5410c(Context context, String[] strArr) {
        this(context, C0087c.m245j(context, strArr));
    }

    /* renamed from: A */
    public C0087c m2858A() {
        return (C0087c) this.f3458z;
    }

    /* renamed from: B */
    public C5410c m2859B(boolean z10) {
        super.m2847x(z10);
        return this;
    }

    /* renamed from: C */
    public C5410c m2860C(b bVar) {
        ListView listView = this.f3457y;
        if (listView != null) {
            listView.setOnItemClickListener(new a(bVar));
        }
        return this;
    }

    /* renamed from: z */
    public C5410c m2861z(int i10, int i11, b bVar) {
        m2846w(i10, i11);
        m2860C(bVar);
        return this;
    }

    public C5410c(Context context, C0087c c0087c) {
        super(context, c0087c);
    }
}
