package p169x0;

import android.os.Build;
import androidx.work.ListenableWorker;
import androidx.work.OverwritingInputMerger;
import p085f1.C2520r;
import p169x0.AbstractC3456y;

/* renamed from: x0.p */
/* loaded from: classes.dex */
public final class C3447p extends AbstractC3456y {

    /* renamed from: x0.p$a */
    public static final class a extends AbstractC3456y.a<a, C3447p> {
        public a(Class<? extends ListenableWorker> cls) {
            super(cls);
            this.f12111c.f10168d = OverwritingInputMerger.class.getName();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // p169x0.AbstractC3456y.a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public C3447p mo10510c() {
            if (this.f12109a && Build.VERSION.SDK_INT >= 23 && this.f12111c.f10174j.m10469h()) {
                throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job");
            }
            C2520r c2520r = this.f12111c;
            if (c2520r.f10181q && Build.VERSION.SDK_INT >= 23 && c2520r.f10174j.m10469h()) {
                throw new IllegalArgumentException("Cannot run in foreground with an idle mode constraint");
            }
            return new C3447p(this);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // p169x0.AbstractC3456y.a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public a mo10511d() {
            return this;
        }
    }

    C3447p(a aVar) {
        super(aVar.f12110b, aVar.f12111c, aVar.f12112d);
    }

    /* renamed from: e */
    public static C3447p m10509e(Class<? extends ListenableWorker> cls) {
        return new a(cls).m10547b();
    }
}
