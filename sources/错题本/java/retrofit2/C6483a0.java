package retrofit2;

import java.util.Objects;

/* renamed from: retrofit2.a0 */
/* loaded from: classes4.dex */
public final class C6483a0 extends AbstractC6522v {

    /* renamed from: d */
    public final /* synthetic */ int f10668d;

    /* renamed from: e */
    public final String f10669e;

    /* renamed from: f */
    public final C6484b f10670f;

    /* renamed from: g */
    public final boolean f10671g;

    public C6483a0(int i, String str, boolean z8) {
        this.f10668d = i;
        switch (i) {
            case 1:
                C6484b c6484b = C6484b.f10672b;
                Objects.requireNonNull(str, "name == null");
                this.f10669e = str;
                this.f10670f = c6484b;
                this.f10671g = z8;
                break;
            case 2:
                C6484b c6484b2 = C6484b.f10672b;
                Objects.requireNonNull(str, "name == null");
                this.f10669e = str;
                this.f10670f = c6484b2;
                this.f10671g = z8;
                break;
            default:
                C6484b c6484b3 = C6484b.f10672b;
                Objects.requireNonNull(str, "name == null");
                this.f10669e = str;
                this.f10670f = c6484b3;
                this.f10671g = z8;
                break;
        }
    }

    @Override // retrofit2.AbstractC6522v
    /* renamed from: a */
    public final void mo6137a(C6503k0 c6503k0, Object obj) {
        switch (this.f10668d) {
            case 0:
                if (obj != null) {
                    this.f10670f.getClass();
                    String string = obj.toString();
                    if (string != null) {
                        c6503k0.m6146a(this.f10669e, string, this.f10671g);
                        break;
                    }
                }
                break;
            case 1:
                if (obj != null) {
                    this.f10670f.getClass();
                    String string2 = obj.toString();
                    if (string2 != null) {
                        c6503k0.m6147b(this.f10669e, string2, this.f10671g);
                        break;
                    }
                }
                break;
            default:
                if (obj != null) {
                    this.f10670f.getClass();
                    String string3 = obj.toString();
                    if (string3 != null) {
                        c6503k0.m6149d(this.f10669e, string3, this.f10671g);
                        break;
                    }
                }
                break;
        }
    }
}
