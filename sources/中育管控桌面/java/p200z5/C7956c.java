package p200z5;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: z5.c */
/* loaded from: classes4.dex */
public class C7956c {

    /* renamed from: z5.c$a */
    public static final class a extends C7956c {
        @Override // p200z5.C7956c
        /* renamed from: a */
        public List mo9781a(Executor executor) {
            return Arrays.asList(new C7964g(), new C7968i(executor));
        }

        @Override // p200z5.C7956c
        /* renamed from: b */
        public List mo9782b() {
            return Collections.singletonList(new C7980u());
        }
    }

    /* renamed from: a */
    public List mo9781a(Executor executor) {
        return Collections.singletonList(new C7968i(executor));
    }

    /* renamed from: b */
    public List mo9782b() {
        return Collections.EMPTY_LIST;
    }
}
