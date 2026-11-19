package p018c2;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C0505m;
import com.github.barteksc.pdfviewer.PDFView;
import com.umeng.analytics.MobclickAgent;
import com.xuexiang.xui.widget.popupwindow.good.IGoodView;
import com.zykj.download.OssUtils;
import com.zykj.subscriber.R;
import com.zykj.subscriber.dao.PDFPreviewDatabase;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.coroutines.jvm.internal.AbstractC2755k;
import kotlin.coroutines.jvm.internal.C2746b;
import kotlin.coroutines.jvm.internal.InterfaceC2750f;
import kotlin.jvm.internal.AbstractC2770m;
import kotlin.jvm.internal.C2764g;
import kotlin.jvm.internal.C2769l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p076d2.C2453b;
import p081e2.C2472a;
import p081e2.InterfaceC2473b;
import p087f3.AbstractC2545e0;
import p087f3.C2550f1;
import p087f3.C2552g;
import p087f3.C2560i;
import p087f3.C2605v0;
import p087f3.InterfaceC2557h0;
import p116l2.C2847h;
import p123n1.InterfaceC2882b;
import p123n1.InterfaceC2883c;
import p123n1.InterfaceC2884d;
import p123n1.InterfaceC2885e;
import p123n1.InterfaceC2886f;
import p128o2.C2919l;
import p128o2.C2920m;
import p128o2.C2925r;
import p142q2.InterfaceC3012d;
import p146r2.C3033d;
import p171x2.InterfaceC3474p;

/* renamed from: c2.t */
/* loaded from: classes.dex */
public final class C1081t extends Fragment {

    /* renamed from: g */
    @NotNull
    public static final a f6271g = new a(null);

    /* renamed from: a */
    @NotNull
    public Map<Integer, View> f6272a = new LinkedHashMap();

    /* renamed from: b */
    private String f6273b;

    /* renamed from: c */
    private String f6274c;

    /* renamed from: d */
    @Nullable
    private PDFView f6275d;

    /* renamed from: e */
    @Nullable
    private b f6276e;

    /* renamed from: f */
    @NotNull
    private final InterfaceC2473b f6277f;

    /* renamed from: c2.t$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C2764g c2764g) {
            this();
        }

        @NotNull
        /* renamed from: a */
        public final C1081t m4974a(@NotNull String path, @NotNull String url) {
            C2769l.m9241e(path, "path");
            C2769l.m9241e(url, "url");
            C1081t c1081t = new C1081t();
            Bundle bundle = new Bundle();
            bundle.putString(OssUtils.FILE_PATH, path);
            bundle.putString("url_path", url);
            c1081t.setArguments(bundle);
            return c1081t;
        }
    }

    /* renamed from: c2.t$b */
    public interface b {
        /* renamed from: b */
        void mo4975b(int i4, int i5);
    }

    @InterfaceC2750f(m9206c = "com.zykj.subscriber.PdfFragment$getPdfPreviewInfo$1", m9207f = "PdfFragment.kt", m9208l = {164}, m9209m = "invokeSuspend")
    /* renamed from: c2.t$c */
    static final class c extends AbstractC2755k implements InterfaceC3474p<InterfaceC2557h0, InterfaceC3012d<? super C2925r>, Object> {

        /* renamed from: b */
        int f6278b;

        /* renamed from: d */
        final /* synthetic */ String f6280d;

        /* renamed from: e */
        final /* synthetic */ InterfaceC3474p<Integer, Float, C2925r> f6281e;

        @InterfaceC2750f(m9206c = "com.zykj.subscriber.PdfFragment$getPdfPreviewInfo$1$1$1", m9207f = "PdfFragment.kt", m9208l = {}, m9209m = "invokeSuspend")
        /* renamed from: c2.t$c$a */
        static final class a extends AbstractC2755k implements InterfaceC3474p<InterfaceC2557h0, InterfaceC3012d<? super C2472a>, Object> {

            /* renamed from: b */
            int f6282b;

            /* renamed from: c */
            final /* synthetic */ InterfaceC2473b f6283c;

            /* renamed from: d */
            final /* synthetic */ String f6284d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(InterfaceC2473b interfaceC2473b, String str, InterfaceC3012d<? super a> interfaceC3012d) {
                super(2, interfaceC3012d);
                this.f6283c = interfaceC2473b;
                this.f6284d = str;
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC2745a
            @NotNull
            public final InterfaceC3012d<C2925r> create(@Nullable Object obj, @NotNull InterfaceC3012d<?> interfaceC3012d) {
                return new a(this.f6283c, this.f6284d, interfaceC3012d);
            }

            @Override // p171x2.InterfaceC3474p
            @Nullable
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public final Object mo2812d(@NotNull InterfaceC2557h0 interfaceC2557h0, @Nullable InterfaceC3012d<? super C2472a> interfaceC3012d) {
                return ((a) create(interfaceC2557h0, interfaceC3012d)).invokeSuspend(C2925r.f11415a);
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC2745a
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
                C3033d.m10175c();
                if (this.f6282b != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C2920m.m9994b(obj);
                return this.f6283c.mo8253a(this.f6284d);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(String str, InterfaceC3474p<? super Integer, ? super Float, C2925r> interfaceC3474p, InterfaceC3012d<? super c> interfaceC3012d) {
            super(2, interfaceC3012d);
            this.f6280d = str;
            this.f6281e = interfaceC3474p;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC2745a
        @NotNull
        public final InterfaceC3012d<C2925r> create(@Nullable Object obj, @NotNull InterfaceC3012d<?> interfaceC3012d) {
            return C1081t.this.new c(this.f6280d, this.f6281e, interfaceC3012d);
        }

        @Override // p171x2.InterfaceC3474p
        @Nullable
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public final Object mo2812d(@NotNull InterfaceC2557h0 interfaceC2557h0, @Nullable InterfaceC3012d<? super C2925r> interfaceC3012d) {
            return ((c) create(interfaceC2557h0, interfaceC3012d)).invokeSuspend(C2925r.f11415a);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC2745a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object objM9989a;
            Object objM10175c = C3033d.m10175c();
            int i4 = this.f6278b;
            try {
                if (i4 == 0) {
                    C2920m.m9994b(obj);
                    InterfaceC2473b interfaceC2473b = C1081t.this.f6277f;
                    String str = this.f6280d;
                    C2919l.a aVar = C2919l.f11409a;
                    AbstractC2545e0 abstractC2545e0M8751b = C2605v0.m8751b();
                    a aVar2 = new a(interfaceC2473b, str, null);
                    this.f6278b = 1;
                    obj = C2552g.m8560g(abstractC2545e0M8751b, aVar2, this);
                    if (obj == objM10175c) {
                        return objM10175c;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C2920m.m9994b(obj);
                }
                objM9989a = C2919l.m9989a((C2472a) obj);
            } catch (Throwable th) {
                C2919l.a aVar3 = C2919l.f11409a;
                objM9989a = C2919l.m9989a(C2920m.m9993a(th));
            }
            InterfaceC3474p<Integer, Float, C2925r> interfaceC3474p = this.f6281e;
            if (C2919l.m9992d(objM9989a)) {
                C2472a c2472a = (C2472a) objM9989a;
                interfaceC3474p.mo2812d(C2746b.m9204c(c2472a == null ? 0 : c2472a.m8250a()), C2746b.m9203b(c2472a == null ? IGoodView.DEFAULT_TO_ALPHA : c2472a.m8251b()));
            }
            InterfaceC3474p<Integer, Float, C2925r> interfaceC3474p2 = this.f6281e;
            if (C2919l.m9990b(objM9989a) != null) {
                interfaceC3474p2.mo2812d(C2746b.m9204c(0), C2746b.m9203b(IGoodView.DEFAULT_TO_ALPHA));
            }
            return C2925r.f11415a;
        }
    }

    /* renamed from: c2.t$d */
    static final class d extends AbstractC2770m implements InterfaceC3474p<Integer, Float, C2925r> {
        d() {
            super(2);
        }

        /* renamed from: a */
        public final void m4978a(int i4, float f4) {
            C1081t c1081t = C1081t.this;
            String str = c1081t.f6273b;
            if (str == null) {
                C2769l.m9256t("localPath");
                str = null;
            }
            c1081t.m4963m(str, i4, f4);
        }

        @Override // p171x2.InterfaceC3474p
        /* renamed from: d */
        public /* bridge */ /* synthetic */ C2925r mo2812d(Integer num, Float f4) {
            m4978a(num.intValue(), f4.floatValue());
            return C2925r.f11415a;
        }
    }

    @InterfaceC2750f(m9206c = "com.zykj.subscriber.PdfFragment$onPause$1", m9207f = "PdfFragment.kt", m9208l = {}, m9209m = "invokeSuspend")
    /* renamed from: c2.t$e */
    static final class e extends AbstractC2755k implements InterfaceC3474p<InterfaceC2557h0, InterfaceC3012d<? super C2925r>, Object> {

        /* renamed from: b */
        int f6286b;

        e(InterfaceC3012d<? super e> interfaceC3012d) {
            super(2, interfaceC3012d);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC2745a
        @NotNull
        public final InterfaceC3012d<C2925r> create(@Nullable Object obj, @NotNull InterfaceC3012d<?> interfaceC3012d) {
            return C1081t.this.new e(interfaceC3012d);
        }

        @Override // p171x2.InterfaceC3474p
        @Nullable
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public final Object mo2812d(@NotNull InterfaceC2557h0 interfaceC2557h0, @Nullable InterfaceC3012d<? super C2925r> interfaceC3012d) {
            return ((e) create(interfaceC2557h0, interfaceC3012d)).invokeSuspend(C2925r.f11415a);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC2745a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            C3033d.m10175c();
            if (this.f6286b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C2920m.m9994b(obj);
            PDFView pDFViewM4971l = C1081t.this.m4971l();
            if (pDFViewM4971l != null) {
                C1081t c1081t = C1081t.this;
                if (pDFViewM4971l.getPageCount() != 1) {
                    InterfaceC2473b interfaceC2473b = c1081t.f6277f;
                    String str = c1081t.f6273b;
                    if (str == null) {
                        C2769l.m9256t("localPath");
                        str = null;
                    }
                    interfaceC2473b.mo8254b(new C2472a(str, pDFViewM4971l.getCurrentPage(), pDFViewM4971l.getPositionOffset()));
                }
            }
            return C2925r.f11415a;
        }
    }

    public C1081t() {
        PDFPreviewDatabase.C2437a c2437a = PDFPreviewDatabase.f9928n;
        Application applicationM8199a = C2453b.m8199a();
        C2769l.m9240d(applicationM8199a, "context()");
        this.f6277f = c2437a.m8127b(applicationM8199a).mo8125E();
    }

    /* renamed from: k */
    private final void m4962k(String str, InterfaceC3474p<? super Integer, ? super Float, C2925r> interfaceC3474p) {
        C0505m.m2880a(this).m2876j(new c(str, interfaceC3474p, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public final void m4963m(String str, int i4, final float f4) {
        final PDFView pDFView;
        final File file = new File(str);
        if (file.exists()) {
            View view = getView();
            if (view == null || (pDFView = (PDFView) view.findViewById(R.id.fm_content)) == null) {
                return;
            }
            m4972t(pDFView);
            pDFView.m5627B(file).m5668i(true).m5675p(false).m5667h(true).m5666g(true).m5670k(new InterfaceC2882b() { // from class: c2.o
                @Override // p123n1.InterfaceC2882b
                public final void onError(Throwable th) {
                    C1081t.m4964n(this.f6263a, file, th);
                }
            }).m5671l(new InterfaceC2883c() { // from class: c2.p
                @Override // p123n1.InterfaceC2883c
                /* renamed from: a */
                public final void mo4949a(int i5) {
                    C1081t.m4965o(pDFView, this, f4, i5);
                }
            }).m5672m(new InterfaceC2884d() { // from class: c2.q
                @Override // p123n1.InterfaceC2884d
                /* renamed from: a */
                public final void mo4950a(int i5, int i6) {
                    C1081t.m4967q(this.f6268a, i5, i6);
                }
            }).m5673n(new InterfaceC2885e() { // from class: c2.r
                @Override // p123n1.InterfaceC2885e
                /* renamed from: a */
                public final void mo4951a(int i5, Throwable th) {
                    C1081t.m4968r(this.f6269a, i5, th);
                }
            }).m5674o(new InterfaceC2886f() { // from class: c2.s
                @Override // p123n1.InterfaceC2886f
                /* renamed from: a */
                public final void mo4952a(int i5, float f5) {
                    C1081t.m4969s(i5, f5);
                }
            }).m5665f(i4).m5669j();
            return;
        }
        Context contextRequireContext = requireContext();
        String str2 = this.f6273b;
        if (str2 == null) {
            C2769l.m9256t("localPath");
            str2 = null;
        }
        Toast.makeText(contextRequireContext, C2769l.m9248l("文件不存在:", str2), 0).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public static final void m4964n(C1081t this$0, File it, Throwable th) {
        C2769l.m9241e(this$0, "this$0");
        C2769l.m9241e(it, "$it");
        if (th instanceof FileNotFoundException) {
            C2847h c2847h = C2847h.f10954a;
            Context contextRequireContext = this$0.requireContext();
            C2769l.m9240d(contextRequireContext, "requireContext()");
            c2847h.m9553a(contextRequireContext, C2769l.m9248l("文件不存在 ", it.getAbsolutePath()));
            return;
        }
        if (th instanceof IOException) {
            Context contextRequireContext2 = this$0.requireContext();
            String str = this$0.f6274c;
            if (str == null) {
                C2769l.m9256t("urlPath");
                str = null;
            }
            MobclickAgent.onEvent(contextRequireContext2, C2769l.m9248l("file_error", str));
            C2847h c2847h2 = C2847h.f10954a;
            Context contextRequireContext3 = this$0.requireContext();
            C2769l.m9240d(contextRequireContext3, "requireContext()");
            c2847h2.m9553a(contextRequireContext3, "文件异常，请重新下载");
            it.delete();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o */
    public static final void m4965o(PDFView this_run, final C1081t this$0, final float f4, int i4) {
        C2769l.m9241e(this_run, "$this_run");
        C2769l.m9241e(this$0, "this$0");
        this_run.postDelayed(new Runnable() { // from class: c2.n
            @Override // java.lang.Runnable
            public final void run() {
                C1081t.m4966p(this.f6261a, f4);
            }
        }, 20L);
        b bVar = this$0.f6276e;
        if (bVar == null) {
            return;
        }
        bVar.mo4975b(1, i4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p */
    public static final void m4966p(C1081t this$0, float f4) {
        C2769l.m9241e(this$0, "this$0");
        PDFView pDFView = this$0.f6275d;
        if (pDFView == null) {
            return;
        }
        pDFView.setPositionOffset(f4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q */
    public static final void m4967q(C1081t this$0, int i4, int i5) {
        C2769l.m9241e(this$0, "this$0");
        Log.i("PdfFragment", "onPageChange");
        b bVar = this$0.f6276e;
        if (bVar == null) {
            return;
        }
        bVar.mo4975b(i4 + 1, i5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public static final void m4968r(C1081t this$0, int i4, Throwable th) {
        C2769l.m9241e(this$0, "this$0");
        Context contextRequireContext = this$0.requireContext();
        StringBuilder sb = new StringBuilder();
        sb.append("file_error_page_");
        String str = this$0.f6274c;
        if (str == null) {
            C2769l.m9256t("urlPath");
            str = null;
        }
        sb.append(str);
        sb.append('_');
        sb.append(i4);
        MobclickAgent.onEvent(contextRequireContext, sb.toString());
        C2847h c2847h = C2847h.f10954a;
        Context contextRequireContext2 = this$0.requireContext();
        C2769l.m9240d(contextRequireContext2, "requireContext()");
        c2847h.m9553a(contextRequireContext2, (char) 31532 + i4 + "页加载异常");
        th.printStackTrace();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s */
    public static final void m4969s(int i4, float f4) {
        System.out.println((Object) String.valueOf(f4));
    }

    /* renamed from: g */
    public void m4970g() {
        this.f6272a.clear();
    }

    @Nullable
    /* renamed from: l */
    public final PDFView m4971l() {
        return this.f6275d;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(@Nullable Bundle bundle) {
        super.onActivityCreated(bundle);
        String str = this.f6273b;
        if (str == null) {
            C2769l.m9256t("localPath");
            str = null;
        }
        m4962k(str, new d());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public void onAttach(@NotNull Context context) {
        C2769l.m9241e(context, "context");
        super.onAttach(context);
        if (context instanceof b) {
            this.f6276e = (b) context;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments == null) {
            return;
        }
        String string = arguments.getString(OssUtils.FILE_PATH);
        if (string == null || string.length() == 0) {
            C2847h c2847h = C2847h.f10954a;
            Context contextRequireContext = requireContext();
            C2769l.m9240d(contextRequireContext, "requireContext()");
            c2847h.m9553a(contextRequireContext, "文件不存在");
        } else {
            C2769l.m9240d(string, "this");
            this.f6273b = string;
        }
        String string2 = arguments.getString("url_path");
        if (!(string2 == null || string2.length() == 0)) {
            C2769l.m9240d(string2, "this");
            this.f6274c = string2;
        } else {
            C2847h c2847h2 = C2847h.f10954a;
            Context contextRequireContext2 = requireContext();
            C2769l.m9240d(contextRequireContext2, "requireContext()");
            c2847h2.m9553a(contextRequireContext2, "Url不存在");
        }
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        C2769l.m9241e(inflater, "inflater");
        return inflater.inflate(R.layout.fragment_pdf, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        Log.i("PdfFragment", "onDestroyView");
        m4970g();
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        C2560i.m8574d(C2550f1.f10242a, null, null, new e(null), 3, null);
    }

    /* renamed from: t */
    public final void m4972t(@Nullable PDFView pDFView) {
        this.f6275d = pDFView;
    }

    /* renamed from: u */
    public final void m4973u(int i4) {
        PDFView pDFView = this.f6275d;
        if (pDFView == null) {
            return;
        }
        pDFView.m5632G(i4);
    }
}
