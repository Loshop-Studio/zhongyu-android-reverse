package com.zykj.mistake.feature.notebook.detail;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.camera.core.impl.utils.RunnableC0377a;
import coil3.C3333r;
import coil3.request.CachePolicy;
import com.zykj.mistake.activity.C4479o;
import com.zykj.mistake.feature.collection.component.C4564j;
import com.zykj.mistake.utils.C5100e;
import com.zykj.mistake.widget.StemWebView;
import com.zykj.view.simpleBoard.SimpleBoardView;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.AbstractC5774b;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.collections.AbstractC5805t;
import kotlin.collections.AbstractC5806u;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.p102io.AbstractC5818a;
import kotlin.p102io.FileWalkDirection;
import kotlin.text.AbstractC5855p;
import p006a5.RunnableC0017h;
import p016b0.C3071g;
import p045d6.C5443s;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;
import p154s.AbstractC6534h;
import p154s.C6529c;
import p154s.C6532f;
import p154s.C6537k;
import p214z6.AbstractC6833k;
import p214z6.C6827e;

/* renamed from: com.zykj.mistake.feature.notebook.detail.a5 */
/* loaded from: classes3.dex */
public final class C4764a5 {

    /* renamed from: a */
    public SimpleBoardView f6894a;

    /* renamed from: b */
    public FrameLayout f6895b;

    /* renamed from: f */
    public volatile int f6899f;

    /* renamed from: h */
    public String f6901h;

    /* renamed from: j */
    public int f6903j;

    /* renamed from: k */
    public InterfaceC6473e f6904k;

    /* renamed from: l */
    public boolean f6905l;

    /* renamed from: m */
    public C4791f f6906m;

    /* renamed from: n */
    public C4791f f6907n;

    /* renamed from: o */
    public boolean f6908o;

    /* renamed from: p */
    public boolean f6909p;

    /* renamed from: c */
    public boolean f6896c = true;

    /* renamed from: d */
    public DraftActionMode f6897d = DraftActionMode.PEN;

    /* renamed from: e */
    public float f6898e = 1.0f;

    /* renamed from: g */
    public String f6900g = "";

    /* renamed from: i */
    public List f6902i = EmptyList.INSTANCE;

    /* renamed from: q */
    public final ArrayList f6910q = new ArrayList();

    /* JADX WARN: Removed duplicated region for block: B:29:0x0056  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m4165a(com.zykj.mistake.feature.notebook.detail.C4764a5 r16, com.zykj.mistake.feature.notebook.detail.C4791f r17, java.util.ArrayList r18, java.util.concurrent.atomic.AtomicInteger r19) {
        /*
            Method dump skipped, instructions count: 344
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.mistake.feature.notebook.detail.C4764a5.m4165a(com.zykj.mistake.feature.notebook.detail.a5, com.zykj.mistake.feature.notebook.detail.f, java.util.ArrayList, java.util.concurrent.atomic.AtomicInteger):void"); // DEX body: android/错题本/smali_classes3/com/zykj/mistake/feature/notebook/detail/a5.smali:107
    }

    /* renamed from: b */
    public static void m4166b(SimpleBoardView simpleBoardView, DraftActionMode draftActionMode) {
        int i = AbstractC4910y4.f7419a[draftActionMode.ordinal()];
        if (i == 1) {
            simpleBoardView.getSimpleBoardConfig().setPenDashed(false);
            simpleBoardView.setActonMode(3);
            return;
        }
        if (i == 2) {
            simpleBoardView.getSimpleBoardConfig().setPenDashed(false);
            simpleBoardView.setActonMode(0);
            return;
        }
        if (i == 3) {
            simpleBoardView.getSimpleBoardConfig().setPenDashed(false);
            simpleBoardView.setActonMode(1);
        } else if (i == 4) {
            simpleBoardView.getSimpleBoardConfig().setPenDashed(true);
            simpleBoardView.setActonMode(1);
        } else {
            if (i != 5) {
                throw new NoWhenBranchMatchedException();
            }
            simpleBoardView.getSimpleBoardConfig().setPenDashed(false);
            simpleBoardView.setActonMode(2);
        }
    }

    /* renamed from: c */
    public final void m4167c() {
        SimpleBoardView simpleBoardView = this.f6894a;
        if (simpleBoardView == null) {
            return;
        }
        simpleBoardView.setEnabled(true);
        if (this.f6905l) {
            simpleBoardView.getSimpleBoardConfig().setEnableFinger(this.f6896c);
            m4166b(simpleBoardView, this.f6897d);
        } else {
            simpleBoardView.getSimpleBoardConfig().setEnableFinger(true);
            m4166b(simpleBoardView, DraftActionMode.SELECT);
        }
    }

    /* renamed from: d */
    public final void m4168d(SimpleBoardView simpleBoardView) {
        if (this.f6905l) {
            simpleBoardView.loadStrokeData(this.f6900g);
            return;
        }
        boolean z8 = this.f6909p;
        this.f6909p = true;
        try {
            simpleBoardView.clean();
        } finally {
            this.f6909p = z8;
        }
    }

    /* renamed from: e */
    public final void m4169e() {
        ArrayList arrayList = this.f6910q;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((C6537k) obj).m6187a();
        }
        arrayList.clear();
    }

    /* renamed from: f */
    public final void m4170f() {
        boolean z8 = this.f6909p;
        this.f6909p = true;
        try {
            SimpleBoardView simpleBoardView = this.f6894a;
            if (simpleBoardView != null) {
                simpleBoardView.clean();
            }
            this.f6909p = z8;
            this.f6908o = false;
            if (AbstractC5855p.m5382P(this.f6900g)) {
                return;
            }
            try {
                Result.m13956constructorimpl(Boolean.valueOf(AbstractC5818a.m5313w(new File(this.f6900g))));
            } catch (Throwable th) {
                Result.m13956constructorimpl(AbstractC5774b.m5118a(th));
            }
        } catch (Throwable th2) {
            this.f6909p = z8;
            throw th2;
        }
    }

    /* renamed from: g */
    public final boolean m4171g(C4791f c4791f) {
        return AbstractC5830k.m5325b(c4791f, new C4791f(this.f6900g, this.f6901h, this.f6902i, this.f6903j));
    }

    /* renamed from: h */
    public final void m4172h(C4791f c4791f, List list) {
        Throwable th;
        C4764a5 c4764a5 = this;
        C4791f c4791f2 = c4791f;
        C5100e c5100e = C5100e.f8035a;
        SimpleBoardView simpleBoardView = c4764a5.f6894a;
        if (simpleBoardView != null && m4171g(c4791f)) {
            if (simpleBoardView.getWidth() <= 0) {
                simpleBoardView.post(new RunnableC0017h(c4764a5, c4791f2, 9, list));
                return;
            }
            c4764a5.f6907n = c4791f2;
            int size = list.size();
            ArrayList arrayList = c4764a5.f6910q;
            if (size == 1) {
                String str = (String) AbstractC5805t.m5228h0(list);
                SimpleBoardView simpleBoardView2 = c4764a5.f6894a;
                if (simpleBoardView2 != null && m4171g(c4791f)) {
                    c4764a5.m4169e();
                    Context context = simpleBoardView2.getContext();
                    AbstractC5830k.m5329f(context, "getContext(...)");
                    C6529c c6529c = new C6529c(context);
                    c6529c.f10820c = str;
                    CachePolicy cachePolicy = CachePolicy.DISABLED;
                    c6529c.f10826i = cachePolicy;
                    c6529c.f10827j = cachePolicy;
                    Bitmap.Config config = Bitmap.Config.ARGB_8888;
                    AbstractC6534h.m6185a(c6529c);
                    c6529c.f10821d = new C3071g(c4764a5, c4791f2, 6, c4791f2);
                    C6532f c6532fM6182a = c6529c.m6182a();
                    Context context2 = simpleBoardView2.getContext();
                    AbstractC5830k.m5329f(context2, "getContext(...)");
                    arrayList.add(((C3333r) c5100e.m4462a(context2)).m2274a(c6532fM6182a));
                    return;
                }
                return;
            }
            c4764a5.m4169e();
            int size2 = list.size();
            ArrayList arrayList2 = new ArrayList(size2);
            int i = 0;
            while (true) {
                th = null;
                if (i >= size2) {
                    break;
                }
                arrayList2.add(null);
                i++;
            }
            AtomicInteger atomicInteger = new AtomicInteger(list.size());
            int i8 = 0;
            for (Object obj : list) {
                int i9 = i8 + 1;
                if (i8 < 0) {
                    Throwable th2 = th;
                    AbstractC5806u.m5258L();
                    throw th2;
                }
                Context context3 = simpleBoardView.getContext();
                AbstractC5830k.m5329f(context3, "getContext(...)");
                C6529c c6529c2 = new C6529c(context3);
                c6529c2.f10820c = (String) obj;
                CachePolicy cachePolicy2 = CachePolicy.DISABLED;
                c6529c2.f10826i = cachePolicy2;
                c6529c2.f10827j = cachePolicy2;
                Bitmap.Config config2 = Bitmap.Config.ARGB_8888;
                AbstractC6534h.m6185a(c6529c2);
                AtomicInteger atomicInteger2 = atomicInteger;
                c6529c2.f10821d = new C4916z4(c4764a5, c4791f2, arrayList2, atomicInteger2, arrayList2, i8, c4791f, atomicInteger2);
                C6532f c6532fM6182a2 = c6529c2.m6182a();
                Context context4 = simpleBoardView.getContext();
                AbstractC5830k.m5329f(context4, "getContext(...)");
                arrayList.add(((C3333r) c5100e.m4462a(context4)).m2274a(c6532fM6182a2));
                c4764a5 = this;
                c4791f2 = c4791f;
                atomicInteger = atomicInteger2;
                i8 = i9;
                th = th;
            }
        }
    }

    /* renamed from: i */
    public final void m4173i() {
        SimpleBoardView simpleBoardView;
        C4791f c4791f = new C4791f(this.f6900g, this.f6901h, this.f6902i, this.f6903j);
        if (!AbstractC5855p.m5382P(this.f6900g) && !AbstractC5830k.m5325b(this.f6906m, c4791f) && !AbstractC5830k.m5325b(this.f6907n, c4791f) && (simpleBoardView = this.f6894a) != null) {
            this.f6898e = 1.0f;
            String str = this.f6901h;
            if (str == null || AbstractC5855p.m5382P(str)) {
                if (!this.f6902i.isEmpty()) {
                    m4172h(c4791f, this.f6902i);
                    return;
                } else {
                    m4168d(simpleBoardView);
                    m4174j(c4791f);
                    return;
                }
            }
            String str2 = this.f6901h;
            if (str2 == null) {
                str2 = "";
            }
            String str3 = str2;
            FrameLayout frameLayout = this.f6895b;
            if (frameLayout != null && m4171g(c4791f)) {
                this.f6907n = c4791f;
                int i = this.f6899f;
                frameLayout.removeAllViews();
                Context context = frameLayout.getContext();
                AbstractC5830k.m5329f(context, "getContext(...)");
                StemWebView stemWebView = new StemWebView(context, null, 6, 0);
                stemWebView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                stemWebView.setScaleButtonsVisible(false);
                stemWebView.setRemoveEmptyStemTopSpacing(true);
                stemWebView.setPageFinishListener(new C4479o(i, 1, stemWebView, this, c4791f));
                frameLayout.addView(stemWebView);
                stemWebView.post(new RunnableC0377a(12, stemWebView, str3));
            }
        }
    }

    /* renamed from: j */
    public final void m4174j(C4791f c4791f) {
        if (m4171g(c4791f)) {
            C4791f c4791f2 = this.f6907n;
            if (c4791f2 == null || c4791f2.equals(c4791f)) {
                this.f6906m = c4791f;
                this.f6907n = null;
            }
        }
    }

    /* renamed from: k */
    public final void m4175k(InterfaceC6471c interfaceC6471c) {
        Object objM13956constructorimpl;
        SimpleBoardView simpleBoardView = this.f6894a;
        if (simpleBoardView == null || AbstractC5855p.m5382P(this.f6900g)) {
            interfaceC6471c.invoke(Boolean.TRUE);
            return;
        }
        if (!this.f6908o) {
            interfaceC6471c.invoke(Boolean.TRUE);
            return;
        }
        try {
            File file = new File(this.f6900g);
            if (!file.exists()) {
                file.mkdirs();
            }
            if (simpleBoardView.isEmpty()) {
                C6827e c6827e = new C6827e(AbstractC6833k.m6494u(AbstractC5818a.m5316z(file, FileWalkDirection.BOTTOM_UP), new C4564j(24)));
                while (c6827e.hasNext()) {
                    ((File) c6827e.next()).delete();
                }
            } else {
                simpleBoardView.saveStrokeData(this.f6900g);
            }
            objM13956constructorimpl = Result.m13956constructorimpl(C5443s.f8405a);
        } catch (Throwable th) {
            objM13956constructorimpl = Result.m13956constructorimpl(AbstractC5774b.m5118a(th));
        }
        if (Result.m13962isSuccessimpl(objM13956constructorimpl)) {
            this.f6908o = false;
            interfaceC6471c.invoke(Boolean.TRUE);
        }
        if (Result.m13959exceptionOrNullimpl(objM13956constructorimpl) != null) {
            interfaceC6471c.invoke(Boolean.FALSE);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: l */
    public final void m4176l(C4791f c4791f, Bitmap bitmap) {
        Bitmap bitmapM13956constructorimpl;
        Object objM13956constructorimpl;
        if (m4171g(c4791f)) {
            SimpleBoardView simpleBoardView = this.f6894a;
            if (simpleBoardView != null) {
                try {
                    bitmapM13956constructorimpl = Result.m13956constructorimpl(bitmap.copy(Bitmap.Config.ARGB_8888, false));
                } catch (Throwable th) {
                    bitmapM13956constructorimpl = Result.m13956constructorimpl(AbstractC5774b.m5118a(th));
                }
                if (!Result.m13961isFailureimpl(bitmapM13956constructorimpl)) {
                    bitmap = bitmapM13956constructorimpl;
                }
                Bitmap bitmap2 = bitmap;
                int width = simpleBoardView.getWidth();
                Integer numValueOf = Integer.valueOf(width);
                if (width <= 0) {
                    numValueOf = null;
                }
                if (numValueOf != null) {
                    int iIntValue = numValueOf.intValue();
                    int height = simpleBoardView.getHeight();
                    Integer numValueOf2 = Integer.valueOf(height);
                    if (height <= 0) {
                        numValueOf2 = null;
                    }
                    if (numValueOf2 != null) {
                        int iIntValue2 = numValueOf2.intValue();
                        float height2 = bitmap2.getHeight() * iIntValue;
                        int width2 = bitmap2.getWidth();
                        if (width2 < 1) {
                            width2 = 1;
                        }
                        if (height2 / width2 < iIntValue2 - 1.0f) {
                            int iCeil = (int) Math.ceil((r5 * bitmap2.getWidth()) / r3);
                            int height3 = bitmap2.getHeight();
                            if (iCeil < height3) {
                                iCeil = height3;
                            }
                            if (iCeil > bitmap2.getHeight()) {
                                try {
                                    objM13956constructorimpl = Result.m13956constructorimpl(Bitmap.createBitmap(bitmap2.getWidth(), iCeil, Bitmap.Config.RGB_565));
                                } catch (Throwable th2) {
                                    objM13956constructorimpl = Result.m13956constructorimpl(AbstractC5774b.m5118a(th2));
                                }
                                if (Result.m13961isFailureimpl(objM13956constructorimpl)) {
                                    objM13956constructorimpl = null;
                                }
                                Bitmap bitmap3 = (Bitmap) objM13956constructorimpl;
                                if (bitmap3 != null) {
                                    Canvas canvas = new Canvas(bitmap3);
                                    canvas.drawColor(-1);
                                    canvas.drawBitmap(bitmap2, new Rect(0, 0, bitmap2.getWidth(), bitmap2.getHeight()), new Rect(0, 0, bitmap2.getWidth(), bitmap2.getHeight()), (Paint) null);
                                    bitmap2 = bitmap3;
                                }
                            }
                        }
                    }
                }
                simpleBoardView.setImageBackground(bitmap2);
                m4168d(simpleBoardView);
                simpleBoardView.setScale(1.0f);
                this.f6898e = 1.0f;
                m4167c();
            }
            m4174j(c4791f);
        }
    }
}
