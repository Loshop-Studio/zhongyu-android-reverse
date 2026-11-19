package ca;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: ca.c */
/* loaded from: classes5.dex */
public class C5280c {

    /* renamed from: ca.c$a */
    public static final class a extends C5280c {
        @Override // ca.C5280c
        /* renamed from: a */
        public List mo2239a(Executor executor) {
            return Arrays.asList(new C5288g(), new C5292i(executor));
        }

        @Override // ca.C5280c
        /* renamed from: b */
        public List mo2240b() {
            return Collections.singletonList(new C5304u());
        }
    }

    /* renamed from: a */
    public List mo2239a(Executor executor) {
        return Collections.singletonList(new C5292i(executor));
    }

    /* renamed from: b */
    public List mo2240b() {
        return Collections.EMPTY_LIST;
    }
}
