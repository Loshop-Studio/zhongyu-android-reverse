package p207p2;

import android.content.Context;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import p173m1.C9293a;
import p173m1.C9295c;

/* renamed from: p2.d */
/* loaded from: classes4.dex */
public abstract class AbstractC9642d extends AbstractC9640b {

    /* renamed from: p2.d$a */
    public class a implements AdapterView.OnItemClickListener {

        /* renamed from: a */
        public final /* synthetic */ b f19332a;

        public a(b bVar) {
            this.f19332a = bVar;
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
            b bVar = this.f19332a;
            if (bVar != null) {
                bVar.mo2081a(AbstractC9642d.this.m18230A(), (C9293a) AbstractC9642d.this.m18230A().getItem(i10), i10);
            }
            AbstractC9642d.this.m18207c();
        }
    }

    /* renamed from: p2.d$b */
    public interface b {
        /* renamed from: a */
        void mo2081a(C9295c c9295c, C9293a c9293a, int i10);
    }

    public AbstractC9642d(Context context, C9295c c9295c) {
        super(context, c9295c);
    }

    /* renamed from: A */
    public C9295c m18230A() {
        return (C9295c) this.f19318z;
    }

    /* renamed from: B */
    public AbstractC9642d m18231B(boolean z10) {
        super.m18222x(z10);
        return this;
    }

    /* renamed from: C */
    public AbstractC9642d m18232C(b bVar) {
        ListView listView = this.f19317y;
        if (listView != null) {
            listView.setOnItemClickListener(new a(bVar));
        }
        return this;
    }

    /* renamed from: z */
    public AbstractC9642d m18233z(int i10, int i11, b bVar) {
        m18221w(i10, i11);
        m18232C(bVar);
        return this;
    }
}
