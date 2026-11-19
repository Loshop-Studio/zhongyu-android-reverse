package p129o2;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.Log;
import android.view.View;
import coil3.InterfaceC3305k;
import coil3.network.C3322k;
import com.alibaba.sdk.android.oss.common.utils.HttpHeaders;
import com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser$Reader$EndOfFileException;
import com.bumptech.glide.manager.RequestManagerFragment;
import com.bumptech.glide.manager.SupportRequestManagerFragment;
import com.google.gson.AbstractC3869p;
import com.google.gson.C3841g;
import com.google.gson.JsonIOException;
import com.google.gson.Strictness;
import com.google.gson.stream.JsonToken;
import com.xuexiang.xui.widget.imageview.edit.C4179d;
import com.xuexiang.xui.widget.imageview.edit.PhotoEditorView;
import com.xuexiang.xui.widget.imageview.edit.PhotoFilter;
import com.xuexiang.xui.widget.layout.linkage.LinkageScrollLayout;
import com.xuexiang.xui.widget.layout.linkage.view.LinkageScrollView;
import com.xuexiang.xui.widget.layout.linkage.view.LinkageWebView;
import io.reactivex.exceptions.CompositeException;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import kotlin.Result;
import kotlin.collections.AbstractC5805t;
import kotlin.collections.AbstractC5806u;
import kotlin.jvm.internal.AbstractC5830k;
import kotlinx.serialization.json.internal.C6030k;
import kotlinx.serialization.modules.C6045a;
import okhttp3.AbstractC6323m0;
import okhttp3.internal.connection.C6314m;
import p019b3.C3108d;
import p019b3.InterfaceC3105a;
import p019b3.InterfaceC3106b;
import p019b3.InterfaceC3107c;
import p024c0.C3210g;
import p032c8.C3238c;
import p039d0.C5402e;
import p041d2.C5413c;
import p055f0.C5492a0;
import p055f0.C5495c;
import p055f0.C5508m;
import p055f0.C5519x;
import p055f0.InterfaceC5511p;
import p055f0.InterfaceC5512q;
import p062g0.C5536a;
import p073h4.AbstractC5625a;
import p075h6.C5637i;
import p077i0.InterfaceC5653i;
import p084i7.InterfaceC5686b;
import p098k4.C5755a;
import p101k7.InterfaceC5765g;
import p104l1.C6046a;
import p113m2.InterfaceC6098a;
import p115m4.InterfaceC6106d;
import p127o0.InterfaceC6263i;
import p133o7.C6277a;
import p133o7.C6278b;
import p133o7.InterfaceC6282f;
import p140q.C6397a;
import p140q.C6398b;
import p140q.InterfaceC6405i;
import p145q5.InterfaceC6436g;
import p152r6.InterfaceC6471c;
import p153r7.C6481c;
import p159s5.InterfaceC6559b;
import p185v7.AbstractC6675d;
import p202y.C6763f;
import p202y.InterfaceC6758a;
import p207y6.InterfaceC6779c;
import retrofit2.C6509n0;
import retrofit2.InterfaceC6506m;

/* renamed from: o2.a */
/* loaded from: classes3.dex */
public final class C6268a implements InterfaceC3105a, InterfaceC3107c, InterfaceC6436g, InterfaceC6506m, InterfaceC5512q, InterfaceC6758a, InterfaceC5653i, InterfaceC6098a, InterfaceC6106d, InterfaceC6263i, InterfaceC6282f, InterfaceC6405i {

    /* renamed from: c */
    public static volatile C6268a f10020c;

    /* renamed from: a */
    public final /* synthetic */ int f10021a;

    /* renamed from: b */
    public Object f10022b;

    public /* synthetic */ C6268a(int i, boolean z8) {
        this.f10021a = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: A */
    public void m5866A(View view) {
        C3108d c3108d;
        LinkageScrollLayout linkageScrollLayout = (LinkageScrollLayout) this.f10022b;
        if (linkageScrollLayout.f4537k == 18 && view != linkageScrollLayout.getChildAt(0) && ((InterfaceC3106b) view).mo2061a().mo2067t() && (c3108d = (C3108d) linkageScrollLayout.f4528b.get(view)) != null && linkageScrollLayout.getScrollY() == c3108d.f1543a && linkageScrollLayout.f4530d.computeScrollOffset()) {
            float currVelocity = linkageScrollLayout.f4530d.getCurrVelocity();
            if (currVelocity >= 0.0f) {
                currVelocity = -currVelocity;
            }
            linkageScrollLayout.f4530d.abortAnimation();
            linkageScrollLayout.m3521c(currVelocity);
        }
    }

    /* renamed from: B */
    public void m5867B(String str) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.f10022b;
        String lowerCase = HttpHeaders.CACHE_CONTROL.toLowerCase(Locale.ROOT);
        AbstractC5830k.m5329f(lowerCase, "toLowerCase(...)");
        linkedHashMap.put(lowerCase, AbstractC5806u.m5247A(str));
    }

    @Override // p140q.InterfaceC6405i
    /* renamed from: a */
    public boolean mo107a(C6397a c6397a) {
        return false;
    }

    @Override // p140q.InterfaceC6405i
    /* renamed from: b */
    public C6398b mo108b(C6397a c6397a) {
        return null;
    }

    @Override // p115m4.InterfaceC6106d
    /* renamed from: c */
    public void mo2171c(File file) {
        AbstractC5830k.m5330g(file, "file");
        ((C5637i) this.f10022b).resumeWith(Result.m13956constructorimpl(file.getAbsolutePath()));
    }

    @Override // retrofit2.InterfaceC6506m
    public Object convert(Object obj) {
        AbstractC6323m0 abstractC6323m0 = (AbstractC6323m0) obj;
        C6046a c6046a = new C6046a(abstractC6323m0.charStream());
        c6046a.m5736A(Strictness.LEGACY_STRICT);
        try {
            Object objMo2779b = ((AbstractC3869p) this.f10022b).mo2779b(c6046a);
            if (c6046a.m5764x() == JsonToken.END_DOCUMENT) {
                return objMo2779b;
            }
            throw new JsonIOException("JSON document was not fully consumed.");
        } finally {
            abstractC6323m0.close();
        }
    }

    @Override // p115m4.InterfaceC6106d
    /* renamed from: d */
    public void mo2172d() {
        ((C5637i) this.f10022b).resumeWith(Result.m13956constructorimpl(null));
    }

    @Override // p019b3.InterfaceC3107c
    /* renamed from: e */
    public boolean mo2062e(int i) {
        switch (this.f10021a) {
            case 3:
                return ((LinkageScrollView) this.f10022b).canScrollVertically(i);
            default:
                LinkageWebView linkageWebView = (LinkageWebView) this.f10022b;
                int i8 = LinkageWebView.f4543j;
                int scrollY = linkageWebView.getScrollY();
                if (i < 0) {
                    return scrollY > 0;
                }
                return !(linkageWebView.getScrollY() >= linkageWebView.getScrollRange());
        }
    }

    @Override // p077i0.InterfaceC5653i
    /* renamed from: f */
    public int mo4977f() {
        return (mo4978u() << 8) | mo4978u();
    }

    @Override // p140q.InterfaceC6405i
    public long getSize() {
        return 0L;
    }

    @Override // p019b3.InterfaceC3107c
    /* renamed from: h */
    public int mo2063h() {
        switch (this.f10021a) {
            case 3:
                return ((LinkageScrollView) this.f10022b).computeVerticalScrollOffset();
            default:
                return ((LinkageWebView) this.f10022b).computeVerticalScrollOffset();
        }
    }

    @Override // p019b3.InterfaceC3107c
    /* renamed from: i */
    public void mo2064i() {
        switch (this.f10021a) {
            case 3:
                LinkageScrollView linkageScrollView = (LinkageScrollView) this.f10022b;
                linkageScrollView.scrollTo(0, linkageScrollView.computeVerticalScrollRange());
                break;
            default:
                ((LinkageWebView) this.f10022b).m3525d();
                break;
        }
    }

    @Override // p019b3.InterfaceC3107c
    /* renamed from: j */
    public void mo2065j(int i) {
        switch (this.f10021a) {
            case 3:
                ((LinkageScrollView) this.f10022b).fling(i);
                break;
            default:
                ((LinkageWebView) this.f10022b).flingScroll(0, i);
                break;
        }
    }

    @Override // p019b3.InterfaceC3107c
    /* renamed from: k */
    public int mo2066k() {
        switch (this.f10021a) {
            case 3:
                return ((LinkageScrollView) this.f10022b).computeVerticalScrollRange();
            default:
                return ((LinkageWebView) this.f10022b).computeVerticalScrollRange();
        }
    }

    @Override // p133o7.InterfaceC6282f
    /* renamed from: l */
    public void mo2042l(InterfaceC6779c interfaceC6779c, InterfaceC6471c interfaceC6471c) {
        ((C6045a) this.f10022b).m5732c(interfaceC6779c, interfaceC6471c, true);
    }

    @Override // p133o7.InterfaceC6282f
    /* renamed from: m */
    public void mo2043m(InterfaceC6779c interfaceC6779c, InterfaceC6779c interfaceC6779c2, InterfaceC5686b interfaceC5686b) {
        ((C6045a) this.f10022b).m5733d(interfaceC6779c, interfaceC6779c2, interfaceC5686b, true);
    }

    @Override // p133o7.InterfaceC6282f
    /* renamed from: n */
    public void mo5735n(InterfaceC6779c interfaceC6779c, InterfaceC5686b serializer) {
        AbstractC5830k.m5330g(serializer, "serializer");
        ((C6045a) this.f10022b).m5734e(interfaceC6779c, new C6277a(serializer), true);
    }

    @Override // p133o7.InterfaceC6282f
    /* renamed from: o */
    public void mo2044o(InterfaceC6779c interfaceC6779c, InterfaceC6471c interfaceC6471c) {
        ((C6045a) this.f10022b).m5731b(interfaceC6779c, interfaceC6471c, true);
    }

    @Override // p145q5.InterfaceC6436g
    public void onComplete() {
        ((InterfaceC6436g) this.f10022b).onComplete();
    }

    @Override // p145q5.InterfaceC6436g
    public void onError(Throwable th) {
        InterfaceC6436g interfaceC6436g = (InterfaceC6436g) this.f10022b;
        try {
            if (th == null) {
                throw new NullPointerException("error == null");
            }
            interfaceC6436g.onNext(new C3238c());
            interfaceC6436g.onComplete();
        } catch (Throwable th2) {
            try {
                interfaceC6436g.onError(th2);
            } catch (Throwable th3) {
                AbstractC5625a.m4956p(th3);
                AbstractC6675d.m6351q(new CompositeException(th2, th3));
            }
        }
    }

    @Override // p145q5.InterfaceC6436g
    public void onNext(Object obj) {
        C6509n0 c6509n0 = (C6509n0) obj;
        InterfaceC6436g interfaceC6436g = (InterfaceC6436g) this.f10022b;
        if (c6509n0 == null) {
            throw new NullPointerException("response == null");
        }
        interfaceC6436g.onNext(new C3238c());
    }

    @Override // p145q5.InterfaceC6436g
    public void onSubscribe(InterfaceC6559b interfaceC6559b) {
        ((InterfaceC6436g) this.f10022b).onSubscribe(interfaceC6559b);
    }

    @Override // p133o7.InterfaceC6282f
    /* renamed from: q */
    public void mo2045q(InterfaceC6779c kClass, InterfaceC6471c interfaceC6471c) {
        AbstractC5830k.m5330g(kClass, "kClass");
        ((C6045a) this.f10022b).m5734e(kClass, new C6278b(interfaceC6471c), true);
    }

    @Override // p055f0.InterfaceC5512q
    /* renamed from: r */
    public InterfaceC5511p mo2140r(C5519x c5519x) {
        switch (this.f10021a) {
            case 15:
                return new C5495c((C5492a0) this.f10022b, 1);
            default:
                return new C5536a((C6268a) this.f10022b);
        }
    }

    @Override // p202y.InterfaceC6758a
    /* renamed from: s */
    public boolean mo124s(Object obj, File file, C6763f c6763f) throws Throwable {
        InputStream inputStream = (InputStream) obj;
        C3210g c3210g = (C3210g) this.f10022b;
        byte[] bArr = (byte[]) c3210g.m2155e(byte[].class, 65536);
        FileOutputStream fileOutputStream = null;
        try {
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                while (true) {
                    try {
                        int i = inputStream.read(bArr);
                        if (i == -1) {
                            break;
                        }
                        fileOutputStream2.write(bArr, 0, i);
                    } catch (IOException e) {
                        e = e;
                        fileOutputStream = fileOutputStream2;
                        if (Log.isLoggable("StreamEncoder", 3)) {
                            Log.d("StreamEncoder", "Failed to encode data onto the OutputStream", e);
                        }
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException unused) {
                            }
                        }
                        c3210g.m2160j(bArr);
                        return false;
                    } catch (Throwable th) {
                        th = th;
                        fileOutputStream = fileOutputStream2;
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException unused2) {
                            }
                        }
                        c3210g.m2160j(bArr);
                        throw th;
                    }
                }
                fileOutputStream2.close();
                try {
                    fileOutputStream2.close();
                } catch (IOException unused3) {
                }
                c3210g.m2160j(bArr);
                return true;
            } catch (IOException e4) {
                e = e4;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // p077i0.InterfaceC5653i
    public long skip(long j7) throws IOException {
        InputStream inputStream = (InputStream) this.f10022b;
        if (j7 < 0) {
            return 0L;
        }
        long j8 = j7;
        while (j8 > 0) {
            long jSkip = inputStream.skip(j8);
            if (jSkip <= 0) {
                if (inputStream.read() == -1) {
                    break;
                }
                jSkip = 1;
            }
            j8 -= jSkip;
        }
        return j7 - j8;
    }

    @Override // p019b3.InterfaceC3107c
    /* renamed from: t */
    public boolean mo2067t() {
        switch (this.f10021a) {
        }
        return true;
    }

    public String toString() {
        switch (this.f10021a) {
            case 24:
                return super.toString() + "{fragment=" + ((RequestManagerFragment) this.f10022b) + "}";
            case 25:
                return super.toString() + "{fragment=" + ((SupportRequestManagerFragment) this.f10022b) + "}";
            default:
                return super.toString();
        }
    }

    @Override // p077i0.InterfaceC5653i
    /* renamed from: u */
    public short mo4978u() throws IOException {
        int i = ((InputStream) this.f10022b).read();
        if (i != -1) {
            return (short) i;
        }
        throw new DefaultImageHeaderParser$Reader$EndOfFileException();
    }

    @Override // p019b3.InterfaceC3107c
    /* renamed from: v */
    public void mo2068v() {
        switch (this.f10021a) {
            case 3:
                ((LinkageScrollView) this.f10022b).scrollTo(0, 0);
                break;
            default:
                ((LinkageWebView) this.f10022b).scrollTo(0, 0);
                break;
        }
    }

    @Override // p140q.InterfaceC6405i
    /* renamed from: w */
    public void mo128w(C6397a c6397a, InterfaceC3305k interfaceC3305k, Map map, long j7) {
        ((C5413c) this.f10022b).m4806g(c6397a, interfaceC3305k, map, j7);
    }

    /* renamed from: x */
    public Object m5868x(InterfaceC5765g descriptor, C6030k c6030k) {
        AbstractC5830k.m5330g(descriptor, "descriptor");
        Map map = (Map) ((ConcurrentHashMap) this.f10022b).get(descriptor);
        Object obj = map != null ? map.get(c6030k) : null;
        if (obj == null) {
            return null;
        }
        return obj;
    }

    /* renamed from: y */
    public void m5869y(Bitmap bitmap) {
        PhotoEditorView photoEditorView = (PhotoEditorView) this.f10022b;
        C4179d c4179d = photoEditorView.f4403c;
        c4179d.f4413h = PhotoFilter.NONE;
        c4179d.requestRender();
        C4179d c4179d2 = photoEditorView.f4403c;
        c4179d2.f4414i = bitmap;
        c4179d2.f4412g = false;
        Log.d("PhotoEditorView", "onBitmapLoaded() called with: sourceBitmap = [" + bitmap + "]");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: z */
    public void m5870z(View view) {
        C3108d c3108d;
        LinkageScrollLayout linkageScrollLayout = (LinkageScrollLayout) this.f10022b;
        if (linkageScrollLayout.f4537k == 17 && view != linkageScrollLayout.getChildAt(linkageScrollLayout.getChildCount() - 1) && ((InterfaceC3106b) view).mo2061a().mo2067t() && (c3108d = (C3108d) linkageScrollLayout.f4528b.get(view)) != null && linkageScrollLayout.getScrollY() == c3108d.f1543a && linkageScrollLayout.f4530d.computeScrollOffset()) {
            float currVelocity = linkageScrollLayout.f4530d.getCurrVelocity();
            if (currVelocity <= 0.0f) {
                currVelocity = -currVelocity;
            }
            linkageScrollLayout.f4530d.abortAnimation();
            linkageScrollLayout.m3521c(currVelocity);
        }
    }

    public /* synthetic */ C6268a(Object obj, int i) {
        this.f10021a = i;
        this.f10022b = obj;
    }

    public C6268a(Context context) {
        this.f10021a = 12;
        this.f10022b = new C5402e(context, 0);
    }

    public C6268a(C3841g c3841g, AbstractC3869p abstractC3869p) {
        this.f10021a = 14;
        this.f10022b = abstractC3869p;
    }

    public C6268a(C3322k c3322k) {
        this.f10021a = 7;
        Map map = c3322k.f2019a;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), AbstractC5805t.m5218E0((Collection) entry.getValue()));
        }
        this.f10022b = linkedHashMap;
    }

    public C6268a(int i) {
        this.f10021a = i;
        switch (i) {
            case 15:
                this.f10022b = new C5492a0(7);
                break;
            case 16:
                this.f10022b = new C5508m(500L);
                break;
            case 18:
                this.f10022b = new C6268a(16);
                break;
            case 20:
                this.f10022b = new ConcurrentHashMap(16);
                break;
            case 27:
                TimeUnit timeUnit = TimeUnit.MINUTES;
                AbstractC5830k.m5330g(timeUnit, "timeUnit");
                this.f10022b = new C6314m(C6481c.f10656h);
                break;
            case 28:
                this.f10022b = new LinkedHashSet();
                break;
            default:
                this.f10022b = new C5755a(1);
                break;
        }
    }

    @Override // p140q.InterfaceC6405i
    public void clear() {
    }

    @Override // p140q.InterfaceC6405i
    /* renamed from: p */
    public void mo122p(long j7) {
    }

    @Override // p115m4.InterfaceC6106d
    public void update(int i) {
    }
}
