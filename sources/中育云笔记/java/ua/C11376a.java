package ua;

import com.friday.common.entity.NoteBean;
import java.util.List;
import p255n1.AbstractC10312a;

/* renamed from: ua.a */
/* loaded from: classes6.dex */
public class C11376a extends AbstractC10312a {

    /* renamed from: b */
    public List f27198b;

    /* renamed from: c */
    public NoteBean f27199c;

    /* renamed from: d */
    public int f27200d;

    public C11376a(List list, NoteBean noteBean, int i10) {
        this.f27198b = list;
        this.f27199c = noteBean;
        this.f27200d = i10;
        m21519c(false);
    }

    @Override // p255n1.AbstractC10313b
    /* renamed from: a */
    public List mo21520a() {
        return this.f27198b;
    }

    /* renamed from: d */
    public NoteBean m25323d() {
        return this.f27199c;
    }

    /* renamed from: e */
    public int m25324e() {
        return this.f27200d;
    }
}
