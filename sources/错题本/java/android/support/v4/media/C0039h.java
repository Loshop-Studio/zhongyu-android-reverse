package android.support.v4.media;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import androidx.collection.ArrayMap;
import coil3.InterfaceC3305k;
import coil3.compose.AbstractC3255l;
import coil3.compose.AsyncImagePainter;
import coil3.compose.C3250g;
import com.bumptech.glide.load.EncodeStrategy;
import com.bumptech.glide.load.engine.RunnableC3416b;
import com.bumptech.glide.load.resource.bitmap.C3419a;
import com.tencent.bugly.crashreport.biz.UserInfoBean;
import com.tencent.bugly.proguard.C4055al;
import com.tencent.bugly.proguard.C4133r;
import com.tencent.bugly.proguard.InterfaceC4051ah;
import io.objectbox.Property;
import io.objectbox.exception.DbException;
import io.objectbox.query.QueryCondition$PropertyCondition$Operation;
import java.io.File;
import java.io.IOException;
import java.lang.ref.SoftReference;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.AbstractC5774b;
import kotlin.Result;
import kotlin.collections.AbstractC5806u;
import kotlin.jvm.internal.AbstractC5830k;
import okhttp3.C6301i0;
import okhttp3.InterfaceC6292e;
import okhttp3.InterfaceC6294f;
import p006a5.RunnableC0017h;
import p016b0.AbstractC3085o;
import p016b0.C3069f;
import p016b0.C3082l0;
import p016b0.InterfaceC3072g0;
import p024c0.C3207d;
import p024c0.InterfaceC3205b;
import p024c0.InterfaceC3212i;
import p039d0.C5399b;
import p039d0.C5400c;
import p041d2.C5413c;
import p055f0.C5510o;
import p077i0.C5646b;
import p077i0.C5647c;
import p077i0.InterfaceC5656l;
import p084i7.InterfaceC5686b;
import p118m7.C6148k;
import p118m7.C6149k0;
import p118m7.C6166q;
import p118m7.C6173s0;
import p118m7.C6188x0;
import p131o5.InterfaceC6272b;
import p140q.C6397a;
import p140q.C6398b;
import p140q.C6402f;
import p140q.C6403g;
import p140q.InterfaceC6405i;
import p141q0.C6408c;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;
import p154s.C6532f;
import p171u.InterfaceC6608a;
import p180v0.C6656c;
import p185v7.AbstractC6675d;
import p202y.C6763f;
import p202y.InterfaceC6760c;
import p202y.InterfaceC6765h;
import p207y6.InterfaceC6779c;
import p207y6.InterfaceC6793q;
import p208z.InterfaceC6799d;
import p208z.InterfaceC6800e;
import retrofit2.AbstractC6522v;
import retrofit2.C6508n;
import retrofit2.C6509n0;
import retrofit2.C6524x;
import retrofit2.InterfaceC6490e;
import retrofit2.InterfaceC6494g;
import retrofit2.InterfaceC6496h;

/* renamed from: android.support.v4.media.h */
/* loaded from: classes.dex */
public final class C0039h implements InterfaceC6799d, InterfaceC6608a, InterfaceC4051ah, InterfaceC6765h, InterfaceC5656l, InterfaceC6272b, InterfaceC6405i, InterfaceC6494g, InterfaceC6496h, InterfaceC6294f {

    /* renamed from: a */
    public final /* synthetic */ int f95a;

    /* renamed from: b */
    public Object f96b;

    /* renamed from: c */
    public Object f97c;

    public /* synthetic */ C0039h(int i, Object obj, Object obj2) {
        this.f95a = i;
        this.f97c = obj;
        this.f96b = obj2;
    }

    /* renamed from: r */
    public static Object m102r(Property property, Object obj) {
        if (obj != null && obj.getClass().isArray()) {
            throw new DbException("Illegal value: found array, but simple object required");
        }
        Class<?> cls = property.type;
        if (cls == Date.class) {
            if (obj instanceof Date) {
                return Long.valueOf(((Date) obj).getTime());
            }
            if (obj instanceof Long) {
                return obj;
            }
            throw new DbException(AbstractC0037f.m84i(obj, "Illegal date value: expected java.util.Date or Long for value "));
        }
        if (cls == Boolean.TYPE || cls == Boolean.class) {
            if (obj instanceof Boolean) {
                return Integer.valueOf(((Boolean) obj).booleanValue() ? 1 : 0);
            }
            if (obj instanceof Number) {
                int iIntValue = ((Number) obj).intValue();
                if (iIntValue != 0 && iIntValue != 1) {
                    throw new DbException(AbstractC0037f.m84i(obj, "Illegal boolean value: numbers must be 0 or 1, but was "));
                }
            } else if (obj instanceof String) {
                String str = (String) obj;
                if ("TRUE".equalsIgnoreCase(str)) {
                    return 1;
                }
                if ("FALSE".equalsIgnoreCase(str)) {
                    return 0;
                }
                throw new DbException(AbstractC0037f.m84i(obj, "Illegal boolean value: Strings must be \"TRUE\" or \"FALSE\" (case insensitive), but was "));
            }
        }
        return obj;
    }

    /* renamed from: A */
    public void m103A(String str) {
        C5399b c5399b;
        synchronized (this) {
            try {
                Object obj = ((HashMap) this.f96b).get(str);
                AbstractC6675d.m6344f(obj, "Argument must not be null");
                c5399b = (C5399b) obj;
                int i = c5399b.f8346b;
                if (i < 1) {
                    throw new IllegalStateException("Cannot release a lock that is not held, safeKey: " + str + ", interestedThreads: " + c5399b.f8346b);
                }
                int i8 = i - 1;
                c5399b.f8346b = i8;
                if (i8 == 0) {
                    C5399b c5399b2 = (C5399b) ((HashMap) this.f96b).remove(str);
                    if (!c5399b2.equals(c5399b)) {
                        throw new IllegalStateException("Removed the wrong lock, expected to remove: " + c5399b + ", but actually removed: " + c5399b2 + ", safeKey: " + str);
                    }
                    C5400c c5400c = (C5400c) this.f97c;
                    synchronized (c5400c.f8347a) {
                        try {
                            if (c5400c.f8347a.size() < 10) {
                                c5400c.f8347a.offer(c5399b2);
                            }
                        } finally {
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        c5399b.f8345a.unlock();
    }

    /* renamed from: B */
    public Object m104B() {
        C3207d c3207d = (C3207d) this.f96b;
        C3207d c3207d2 = c3207d.f1745d;
        while (true) {
            boolean zEquals = c3207d2.equals(c3207d);
            Object obj = c3207d2.f1742a;
            if (zEquals) {
                return null;
            }
            ArrayList arrayList = c3207d2.f1743b;
            int size = arrayList != null ? arrayList.size() : 0;
            Object objRemove = size > 0 ? c3207d2.f1743b.remove(size - 1) : null;
            if (objRemove != null) {
                return objRemove;
            }
            C3207d c3207d3 = c3207d2.f1745d;
            c3207d3.f1744c = c3207d2.f1744c;
            c3207d2.f1744c.f1745d = c3207d3;
            ((HashMap) this.f97c).remove(obj);
            ((InterfaceC3212i) obj).mo2149a();
            c3207d2 = c3207d2.f1745d;
        }
    }

    /* renamed from: C */
    public void m105C(int i, Bundle bundle, Messenger messenger) throws RemoteException {
        Message messageObtain = Message.obtain();
        messageObtain.what = i;
        messageObtain.arg1 = 1;
        messageObtain.setData(bundle);
        messageObtain.replyTo = messenger;
        ((Messenger) this.f96b).send(messageObtain);
    }

    @Override // p140q.InterfaceC6405i
    /* renamed from: a */
    public boolean mo107a(C6397a c6397a) {
        C6403g c6403g = (C6403g) this.f97c;
        Object objRemove = c6403g.f10508b.remove(c6397a);
        if (objRemove != null) {
            c6403g.f10509c = c6403g.m6069b() - c6403g.m6070c(c6397a, objRemove);
            c6403g.m6068a(c6397a, objRemove, null);
        }
        return objRemove != null;
    }

    @Override // p140q.InterfaceC6405i
    /* renamed from: b */
    public C6398b mo108b(C6397a c6397a) {
        C6402f c6402f = (C6402f) ((C6403g) this.f97c).f10508b.get(c6397a);
        if (c6402f != null) {
            return new C6398b(c6402f.f10504a, c6402f.f10505b);
        }
        return null;
    }

    @Override // p208z.InterfaceC6799d
    /* renamed from: c */
    public void mo109c(Exception exc) {
        C3082l0 c3082l0 = (C3082l0) this.f97c;
        C5510o c5510o = (C5510o) this.f96b;
        C5510o c5510o2 = c3082l0.f1476f;
        if (c5510o2 == null || c5510o2 != c5510o) {
            return;
        }
        RunnableC3416b runnableC3416b = c3082l0.f1472b;
        C3069f c3069f = c3082l0.f1477g;
        InterfaceC6800e interfaceC6800e = c5510o.f8531c;
        runnableC3416b.mo2023a(c3069f, exc, interfaceC6800e, interfaceC6800e.mo23d());
    }

    @Override // p140q.InterfaceC6405i
    public void clear() {
        ((C6403g) this.f97c).m6071d(-1L);
    }

    @Override // okhttp3.InterfaceC6294f
    /* renamed from: d */
    public void mo110d(InterfaceC6292e interfaceC6292e, IOException iOException) {
        try {
            ((InterfaceC6496h) this.f96b).mo117k((C6524x) this.f97c, iOException);
        } catch (Throwable th) {
            AbstractC6522v.m6176r(th);
            th.printStackTrace();
        }
    }

    @Override // retrofit2.InterfaceC6494g
    /* renamed from: e */
    public Type mo111e() {
        return (Type) this.f96b;
    }

    @Override // p202y.InterfaceC6765h
    /* renamed from: g */
    public EncodeStrategy mo113g(C6763f c6763f) {
        return EncodeStrategy.TRANSFORMED;
    }

    @Override // p140q.InterfaceC6405i
    public long getSize() {
        return ((C6403g) this.f97c).m6069b();
    }

    @Override // p077i0.InterfaceC5656l
    /* renamed from: h */
    public void mo114h(Bitmap bitmap, InterfaceC3205b interfaceC3205b) throws IOException {
        IOException iOException = ((C6656c) this.f97c).f11230b;
        if (iOException != null) {
            if (bitmap == null) {
                throw iOException;
            }
            interfaceC3205b.mo2142b(bitmap);
            throw iOException;
        }
    }

    @Override // retrofit2.InterfaceC6494g
    /* renamed from: i */
    public Object mo115i(C6524x c6524x) {
        Executor executor = (Executor) this.f97c;
        return executor == null ? c6524x : new C6508n(executor, c6524x);
    }

    @Override // okhttp3.InterfaceC6294f
    /* renamed from: j */
    public void mo116j(C6301i0 c6301i0) {
        InterfaceC6496h interfaceC6496h = (InterfaceC6496h) this.f96b;
        C6524x c6524x = (C6524x) this.f97c;
        try {
            try {
                interfaceC6496h.mo120n(c6524x, c6524x.m6180f(c6301i0));
            } catch (Throwable th) {
                AbstractC6522v.m6176r(th);
                th.printStackTrace();
            }
        } catch (Throwable th2) {
            AbstractC6522v.m6176r(th2);
            try {
                interfaceC6496h.mo117k(c6524x, th2);
            } catch (Throwable th3) {
                AbstractC6522v.m6176r(th3);
                th3.printStackTrace();
            }
        }
    }

    @Override // retrofit2.InterfaceC6496h
    /* renamed from: k */
    public void mo117k(InterfaceC6490e interfaceC6490e, Throwable th) {
        ((C6508n) this.f97c).f10760a.execute(new RunnableC0017h(this, (InterfaceC6496h) this.f96b, 16, th));
    }

    @Override // p077i0.InterfaceC5656l
    /* renamed from: l */
    public void mo118l() {
        C3419a c3419a = (C3419a) this.f96b;
        synchronized (c3419a) {
            c3419a.f2305c = c3419a.f2303a.length;
        }
    }

    @Override // p171u.InterfaceC6608a
    /* renamed from: m */
    public void mo119m(InterfaceC3305k interfaceC3305k) {
        AsyncImagePainter asyncImagePainter = (AsyncImagePainter) this.f97c;
        AsyncImagePainter.m2177b(asyncImagePainter, new C3250g(interfaceC3305k != null ? AbstractC3255l.m2188a(interfaceC3305k, ((C6532f) this.f96b).f10861a, asyncImagePainter.f1829k) : null));
    }

    @Override // retrofit2.InterfaceC6496h
    /* renamed from: n */
    public void mo120n(InterfaceC6490e interfaceC6490e, C6509n0 c6509n0) {
        ((C6508n) this.f97c).f10760a.execute(new RunnableC0017h(this, (InterfaceC6496h) this.f96b, 15, c6509n0));
    }

    @Override // p208z.InterfaceC6799d
    /* renamed from: o */
    public void mo121o(Object obj) {
        C3082l0 c3082l0 = (C3082l0) this.f97c;
        C5510o c5510o = (C5510o) this.f96b;
        C5510o c5510o2 = c3082l0.f1476f;
        if (c5510o2 == null || c5510o2 != c5510o) {
            return;
        }
        AbstractC3085o abstractC3085o = c3082l0.f1471a.f1457p;
        if (obj != null && abstractC3085o.mo2050c(c5510o.f8531c.mo23d())) {
            c3082l0.f1475e = obj;
            c3082l0.f1472b.m2402l();
        } else {
            RunnableC3416b runnableC3416b = c3082l0.f1472b;
            InterfaceC6760c interfaceC6760c = c5510o.f8529a;
            InterfaceC6800e interfaceC6800e = c5510o.f8531c;
            runnableC3416b.mo2024b(interfaceC6760c, obj, interfaceC6800e, interfaceC6800e.mo23d(), c3082l0.f1477g);
        }
    }

    @Override // p140q.InterfaceC6405i
    /* renamed from: p */
    public void mo122p(long j7) {
        ((C6403g) this.f97c).m6071d(j7);
    }

    @Override // p202y.InterfaceC6758a
    /* renamed from: s */
    public boolean mo124s(Object obj, File file, C6763f c6763f) {
        return ((C5646b) this.f97c).mo124s(new C5647c(((BitmapDrawable) ((InterfaceC3072g0) obj).get()).getBitmap(), (InterfaceC3205b) this.f96b), file, c6763f);
    }

    /* renamed from: t */
    public InterfaceC5686b m125t(InterfaceC6779c interfaceC6779c) {
        Object objPutIfAbsent;
        switch (this.f95a) {
            case 15:
                Object obj = ((C6166q) this.f97c).get(AbstractC6675d.m6349m(interfaceC6779c));
                AbstractC5830k.m5329f(obj, "get(...)");
                C6173s0 c6173s0 = (C6173s0) obj;
                Object c6148k = c6173s0.f9862a.get();
                if (c6148k == null) {
                    synchronized (c6173s0) {
                        c6148k = c6173s0.f9862a.get();
                        if (c6148k == null) {
                            c6148k = new C6148k((InterfaceC5686b) ((InterfaceC6471c) this.f96b).invoke(interfaceC6779c));
                            c6173s0.f9862a = new SoftReference(c6148k);
                        }
                    }
                }
                return ((C6148k) c6148k).f9820a;
            default:
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.f97c;
                Class clsM6349m = AbstractC6675d.m6349m(interfaceC6779c);
                Object c6148k2 = concurrentHashMap.get(clsM6349m);
                if (c6148k2 == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent(clsM6349m, (c6148k2 = new C6148k((InterfaceC5686b) ((InterfaceC6471c) this.f96b).invoke(interfaceC6779c))))) != null) {
                    c6148k2 = objPutIfAbsent;
                }
                return ((C6148k) c6148k2).f9820a;
        }
    }

    public String toString() {
        switch (this.f95a) {
            case 3:
                StringBuilder sb = new StringBuilder("GroupedLinkedMap( ");
                C3207d c3207d = (C3207d) this.f96b;
                C3207d c3207d2 = c3207d.f1744c;
                boolean z8 = false;
                while (!c3207d2.equals(c3207d)) {
                    sb.append('{');
                    sb.append(c3207d2.f1742a);
                    sb.append(':');
                    ArrayList arrayList = c3207d2.f1743b;
                    sb.append(arrayList != null ? arrayList.size() : 0);
                    sb.append("}, ");
                    c3207d2 = c3207d2.f1744c;
                    z8 = true;
                }
                if (z8) {
                    sb.delete(sb.length() - 2, sb.length());
                }
                sb.append(" )");
                return sb.toString();
            case 7:
                StringBuilder sb2 = new StringBuilder("RomInfo{name=");
                sb2.append((String) this.f96b);
                sb2.append(", version=");
                return AbstractC0037f.m91p(sb2, (String) this.f97c, "}");
            default:
                return super.toString();
        }
    }

    /* renamed from: u */
    public Object m126u(InterfaceC3212i interfaceC3212i) {
        HashMap map = (HashMap) this.f97c;
        C3207d c3207d = (C3207d) map.get(interfaceC3212i);
        if (c3207d == null) {
            c3207d = new C3207d(interfaceC3212i);
            map.put(interfaceC3212i, c3207d);
        } else {
            interfaceC3212i.mo2149a();
        }
        C3207d c3207d2 = c3207d.f1745d;
        c3207d2.f1744c = c3207d.f1744c;
        c3207d.f1744c.f1745d = c3207d2;
        C3207d c3207d3 = (C3207d) this.f96b;
        c3207d.f1745d = c3207d3;
        C3207d c3207d4 = c3207d3.f1744c;
        c3207d.f1744c = c3207d4;
        c3207d4.f1745d = c3207d;
        c3207d.f1745d.f1744c = c3207d;
        ArrayList arrayList = c3207d.f1743b;
        int size = arrayList != null ? arrayList.size() : 0;
        if (size > 0) {
            return c3207d.f1743b.remove(size - 1);
        }
        return null;
    }

    /* renamed from: v */
    public Object m127v(InterfaceC6779c interfaceC6779c, ArrayList arrayList) {
        Object objM13956constructorimpl;
        Object objM13956constructorimpl2;
        Object objPutIfAbsent;
        switch (this.f95a) {
            case 16:
                Object obj = ((C6166q) this.f97c).get(AbstractC6675d.m6349m(interfaceC6779c));
                AbstractC5830k.m5329f(obj, "get(...)");
                C6173s0 c6173s0 = (C6173s0) obj;
                Object c6188x0 = c6173s0.f9862a.get();
                if (c6188x0 == null) {
                    synchronized (c6173s0) {
                        c6188x0 = c6173s0.f9862a.get();
                        if (c6188x0 == null) {
                            c6188x0 = new C6188x0();
                            c6173s0.f9862a = new SoftReference(c6188x0);
                        }
                    }
                }
                C6188x0 c6188x02 = (C6188x0) c6188x0;
                ArrayList arrayList2 = new ArrayList(AbstractC5806u.m5277p(arrayList, 10));
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj2 = arrayList.get(i);
                    i++;
                    arrayList2.add(new C6149k0((InterfaceC6793q) obj2));
                }
                ConcurrentHashMap concurrentHashMap = c6188x02.f9890a;
                Object obj3 = concurrentHashMap.get(arrayList2);
                if (obj3 == null) {
                    try {
                        objM13956constructorimpl = Result.m13956constructorimpl((InterfaceC5686b) ((InterfaceC6473e) this.f96b).invoke(interfaceC6779c, arrayList));
                    } catch (Throwable th) {
                        objM13956constructorimpl = Result.m13956constructorimpl(AbstractC5774b.m5118a(th));
                    }
                    Result resultM13955boximpl = Result.m13955boximpl(objM13956constructorimpl);
                    Object objPutIfAbsent2 = concurrentHashMap.putIfAbsent(arrayList2, resultM13955boximpl);
                    obj3 = objPutIfAbsent2 == null ? resultM13955boximpl : objPutIfAbsent2;
                }
                AbstractC5830k.m5329f(obj3, "getOrPut(...)");
                return ((Result) obj3).getValue();
            default:
                ConcurrentHashMap concurrentHashMap2 = (ConcurrentHashMap) this.f97c;
                Class clsM6349m = AbstractC6675d.m6349m(interfaceC6779c);
                Object c6188x03 = concurrentHashMap2.get(clsM6349m);
                if (c6188x03 == null && (objPutIfAbsent = concurrentHashMap2.putIfAbsent(clsM6349m, (c6188x03 = new C6188x0()))) != null) {
                    c6188x03 = objPutIfAbsent;
                }
                C6188x0 c6188x04 = (C6188x0) c6188x03;
                ArrayList arrayList3 = new ArrayList(AbstractC5806u.m5277p(arrayList, 10));
                int size2 = arrayList.size();
                int i8 = 0;
                while (i8 < size2) {
                    Object obj4 = arrayList.get(i8);
                    i8++;
                    arrayList3.add(new C6149k0((InterfaceC6793q) obj4));
                }
                ConcurrentHashMap concurrentHashMap3 = c6188x04.f9890a;
                Object obj5 = concurrentHashMap3.get(arrayList3);
                if (obj5 == null) {
                    try {
                        objM13956constructorimpl2 = Result.m13956constructorimpl((InterfaceC5686b) ((InterfaceC6473e) this.f96b).invoke(interfaceC6779c, arrayList));
                    } catch (Throwable th2) {
                        objM13956constructorimpl2 = Result.m13956constructorimpl(AbstractC5774b.m5118a(th2));
                    }
                    Result resultM13955boximpl2 = Result.m13955boximpl(objM13956constructorimpl2);
                    Object objPutIfAbsent3 = concurrentHashMap3.putIfAbsent(arrayList3, resultM13955boximpl2);
                    obj5 = objPutIfAbsent3 == null ? resultM13955boximpl2 : objPutIfAbsent3;
                }
                AbstractC5830k.m5329f(obj5, "getOrPut(...)");
                return ((Result) obj5).getValue();
        }
    }

    @Override // p140q.InterfaceC6405i
    /* renamed from: w */
    public void mo128w(C6397a c6397a, InterfaceC3305k interfaceC3305k, Map map, long j7) {
        C6403g c6403g = (C6403g) this.f97c;
        long j8 = c6403g.f10507a;
        LinkedHashMap linkedHashMap = c6403g.f10508b;
        if (j7 > j8) {
            Object objRemove = linkedHashMap.remove(c6397a);
            if (objRemove != null) {
                c6403g.f10509c = c6403g.m6069b() - c6403g.m6070c(c6397a, objRemove);
                c6403g.m6068a(c6397a, objRemove, null);
            }
            ((C5413c) this.f96b).m4806g(c6397a, interfaceC3305k, map, j7);
            return;
        }
        C6402f c6402f = new C6402f(interfaceC3305k, map, j7);
        Object objPut = linkedHashMap.put(c6397a, c6402f);
        c6403g.f10509c = c6403g.m6070c(c6397a, c6402f) + c6403g.m6069b();
        if (objPut != null) {
            c6403g.f10509c = c6403g.m6069b() - c6403g.m6070c(c6397a, objPut);
            c6403g.m6068a(c6397a, objPut, c6402f);
        }
        c6403g.m6071d(c6403g.f10507a);
    }

    /* renamed from: x */
    public synchronized List m129x(String str) {
        List arrayList;
        try {
            if (!((ArrayList) this.f96b).contains(str)) {
                ((ArrayList) this.f96b).add(str);
            }
            arrayList = (List) ((HashMap) this.f97c).get(str);
            if (arrayList == null) {
                arrayList = new ArrayList();
                ((HashMap) this.f97c).put(str, arrayList);
            }
        } catch (Throwable th) {
            throw th;
        }
        return arrayList;
    }

    /* renamed from: y */
    public synchronized ArrayList m130y(Class cls, Class cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        ArrayList arrayList2 = (ArrayList) this.f96b;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            List<C6408c> list = (List) ((HashMap) this.f97c).get((String) obj);
            if (list != null) {
                for (C6408c c6408c : list) {
                    if ((c6408c.f10519a.isAssignableFrom(cls) && cls2.isAssignableFrom(c6408c.f10520b)) && !arrayList.contains(c6408c.f10520b)) {
                        arrayList.add(c6408c.f10520b);
                    }
                }
            }
        }
        return arrayList;
    }

    /* renamed from: z */
    public void m131z(InterfaceC3212i interfaceC3212i, Object obj) {
        HashMap map = (HashMap) this.f97c;
        C3207d c3207d = (C3207d) map.get(interfaceC3212i);
        if (c3207d == null) {
            c3207d = new C3207d(interfaceC3212i);
            c3207d.f1745d = c3207d;
            C3207d c3207d2 = (C3207d) this.f96b;
            c3207d.f1745d = c3207d2.f1745d;
            c3207d.f1744c = c3207d2;
            c3207d2.f1745d = c3207d;
            c3207d.f1745d.f1744c = c3207d;
            map.put(interfaceC3212i, c3207d);
        } else {
            interfaceC3212i.mo2149a();
        }
        if (c3207d.f1743b == null) {
            c3207d.f1743b = new ArrayList();
        }
        c3207d.f1743b.add(obj);
    }

    public /* synthetic */ C0039h(int i, Object obj, boolean z8, Object obj2) {
        this.f95a = i;
        this.f96b = obj;
        this.f97c = obj2;
    }

    public /* synthetic */ C0039h(int i, boolean z8) {
        this.f95a = i;
    }

    public C0039h(int i) {
        this.f95a = i;
        switch (i) {
            case 10:
                this.f96b = new HashMap();
                this.f97c = new C5400c(0);
                break;
            case 20:
                this.f96b = new ArrayList();
                this.f97c = new ArrayList();
                break;
            case 23:
                this.f96b = new AtomicReference();
                this.f97c = new ArrayMap();
                break;
            case 24:
                this.f96b = new ArrayList();
                this.f97c = new HashMap();
                break;
            default:
                this.f96b = new C3207d(null);
                this.f97c = new HashMap();
                break;
        }
    }

    @Override // com.tencent.bugly.proguard.InterfaceC4051ah
    /* renamed from: a */
    public void mo106a(boolean z8, String str) {
        if (z8) {
            C4055al.m3025c("[UserInfo] Successfully uploaded user info.", new Object[0]);
            long jCurrentTimeMillis = System.currentTimeMillis();
            for (UserInfoBean userInfoBean : (List) this.f96b) {
                userInfoBean.f3252f = jCurrentTimeMillis;
                ((C4133r) this.f97c).m3336a(userInfoBean, true);
            }
        }
    }

    public C0039h(InterfaceC6471c interfaceC6471c, int i) {
        this.f95a = i;
        switch (i) {
            case 17:
                this.f96b = interfaceC6471c;
                this.f97c = new ConcurrentHashMap();
                break;
            default:
                this.f96b = interfaceC6471c;
                this.f97c = new C6166q();
                break;
        }
    }

    public C0039h(long j7, C5413c c5413c) {
        this.f95a = 22;
        this.f96b = c5413c;
        this.f97c = new C6403g(j7, this);
    }

    public C0039h(Property property, Object obj) {
        this.f95a = 19;
        this.f96b = m102r(property, obj);
    }

    public C0039h(InterfaceC6473e interfaceC6473e, int i) {
        this.f95a = i;
        switch (i) {
            case 18:
                this.f96b = interfaceC6473e;
                this.f97c = new ConcurrentHashMap();
                break;
            default:
                this.f96b = interfaceC6473e;
                this.f97c = new C6166q();
                break;
        }
    }

    @Override // p171u.InterfaceC6608a
    /* renamed from: f */
    public void mo112f(InterfaceC3305k interfaceC3305k) {
    }

    @Override // p171u.InterfaceC6608a
    /* renamed from: q */
    public void mo123q(InterfaceC3305k interfaceC3305k) {
    }

    public C0039h(Property property, QueryCondition$PropertyCondition$Operation queryCondition$PropertyCondition$Operation, Object[] objArr) {
        this.f95a = 19;
        if (objArr == null) {
            if (queryCondition$PropertyCondition$Operation != QueryCondition$PropertyCondition$Operation.IS_NULL && queryCondition$PropertyCondition$Operation != QueryCondition$PropertyCondition$Operation.IS_NOT_NULL) {
                throw new IllegalArgumentException("This operation requires non-null values.");
            }
            objArr = null;
        } else {
            for (int i = 0; i < objArr.length; i++) {
                objArr[i] = m102r(property, objArr[i]);
            }
        }
        this.f97c = objArr;
    }

    public C0039h(String str, String[] strArr, String str2) {
        this.f95a = 6;
        this.f96b = str;
        this.f97c = strArr;
    }
}
