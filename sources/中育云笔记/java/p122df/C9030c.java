package p122df;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: df.c */
/* loaded from: classes6.dex */
public class C9030c {

    /* renamed from: df.c$a */
    public static final class a extends C9030c {
        @Override // p122df.C9030c
        /* renamed from: a */
        public List mo17700a(Executor executor) {
            return Arrays.asList(new C9038g(), new C9042i(executor));
        }

        @Override // p122df.C9030c
        /* renamed from: b */
        public List mo17701b() {
            return Collections.singletonList(new C9054u());
        }
    }

    /* renamed from: a */
    public List mo17700a(Executor executor) {
        return Collections.singletonList(new C9042i(executor));
    }

    /* renamed from: b */
    public List mo17701b() {
        return Collections.EMPTY_LIST;
    }
}
