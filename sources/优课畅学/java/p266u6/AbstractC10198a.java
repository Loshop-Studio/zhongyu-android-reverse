package p266u6;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Callable;
import p244s6.AbstractC10049f;
import p255t6.AbstractC10115a;

/* renamed from: u6.a */
/* loaded from: classes5.dex */
public abstract class AbstractC10198a {

    /* renamed from: a */
    public static final AbstractC10049f f20341a = AbstractC10115a.m18857d(new a());

    /* renamed from: u6.a$a */
    public static class a implements Callable {
        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public AbstractC10049f call() {
            return b.f20342a;
        }
    }

    /* renamed from: u6.a$b */
    public static final class b {

        /* renamed from: a */
        public static final AbstractC10049f f20342a = new C10199b(new Handler(Looper.getMainLooper()), false);
    }

    /* renamed from: a */
    public static AbstractC10049f m19069a() {
        return AbstractC10115a.m18858e(f20341a);
    }
}
