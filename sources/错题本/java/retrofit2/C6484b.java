package retrofit2;

import java.lang.reflect.Method;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import okhttp3.AbstractC6297g0;
import okhttp3.AbstractC6323m0;
import okio.Buffer;
import p045d6.C5443s;

/* renamed from: retrofit2.b */
/* loaded from: classes4.dex */
public class C6484b implements InterfaceC6506m {

    /* renamed from: b */
    public static final C6484b f10672b = new C6484b(0);

    /* renamed from: c */
    public static final C6484b f10673c = new C6484b(1);

    /* renamed from: d */
    public static final C6484b f10674d = new C6484b(2);

    /* renamed from: e */
    public static final C6484b f10675e = new C6484b(3);

    /* renamed from: f */
    public static final C6484b f10676f = new C6484b(4);

    /* renamed from: g */
    public static final C6484b f10677g = new C6484b(5);

    /* renamed from: a */
    public final /* synthetic */ int f10678a;

    public /* synthetic */ C6484b(int i) {
        this.f10678a = i;
    }

    /* renamed from: a */
    public List mo6138a(Executor executor) {
        return Collections.singletonList(new C6510o(executor));
    }

    /* renamed from: b */
    public List mo6139b() {
        return Collections.EMPTY_LIST;
    }

    /* renamed from: c */
    public String mo6140c(Method method, int i) {
        return "parameter #" + (i + 1);
    }

    /* JADX WARN: Finally extract failed */
    @Override // retrofit2.InterfaceC6506m
    public Object convert(Object obj) {
        switch (this.f10678a) {
            case 0:
                return obj.toString();
            case 1:
                AbstractC6323m0 abstractC6323m0 = (AbstractC6323m0) obj;
                try {
                    Buffer buffer = new Buffer();
                    abstractC6323m0.source().readAll(buffer);
                    AbstractC6323m0 abstractC6323m0Create = AbstractC6323m0.create(abstractC6323m0.contentType(), abstractC6323m0.contentLength(), buffer);
                    abstractC6323m0.close();
                    return abstractC6323m0Create;
                } catch (Throwable th) {
                    abstractC6323m0.close();
                    throw th;
                }
            case 2:
                return (AbstractC6297g0) obj;
            case 3:
                return (AbstractC6323m0) obj;
            case 4:
                ((AbstractC6323m0) obj).close();
                return C5443s.f8405a;
            default:
                ((AbstractC6323m0) obj).close();
                return null;
        }
    }

    /* renamed from: d */
    public Object mo6141d(Method method, Class cls, Object obj, Object[] objArr) {
        throw new AssertionError();
    }

    /* renamed from: e */
    public boolean mo6142e(Method method) {
        return false;
    }
}
