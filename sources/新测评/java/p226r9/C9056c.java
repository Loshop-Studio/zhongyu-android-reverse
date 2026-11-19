package p226r9;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: r9.c */
/* loaded from: classes5.dex */
public class C9056c {

    /* renamed from: r9.c$a */
    public static final class a extends C9056c {
        @Override // p226r9.C9056c
        /* renamed from: a */
        public List mo15238a(Executor executor) {
            return Arrays.asList(new C9064g(), new C9068i(executor));
        }

        @Override // p226r9.C9056c
        /* renamed from: b */
        public List mo15239b() {
            return Collections.singletonList(new C9080u());
        }
    }

    /* renamed from: a */
    public List mo15238a(Executor executor) {
        return Collections.singletonList(new C9068i(executor));
    }

    /* renamed from: b */
    public List mo15239b() {
        return Collections.EMPTY_LIST;
    }
}
