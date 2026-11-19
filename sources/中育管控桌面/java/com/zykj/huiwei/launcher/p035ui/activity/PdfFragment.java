package com.zykj.huiwei.launcher.p035ui.activity;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.lifecycle.LifecycleOwnerKt;
import com.blankj.utilcode.util.AbstractC4657l0;
import com.blankj.utilcode.util.ToastUtils;
import com.github.barteksc.pdfviewer.PDFView;
import com.zykj.base.BaseFragment;
import com.zykj.download.OssUtils;
import com.zykj.huiwei.launcher.dao.PDFPreviewDatabase;
import com.zykj.huiwei.launcher.dao.PDFPreviewInfo;
import com.zykj.huiwei.launcher.databinding.DiscoveryFragmentPdfBinding;
import com.zykj.huiwei.launcher.p035ui.activity.PdfFragment;
import com.zykj.manage.R;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.GlobalScope;
import p075i1.InterfaceC6510b;
import p075i1.InterfaceC6511c;
import p075i1.InterfaceC6512d;
import p075i1.InterfaceC6513e;
import p075i1.InterfaceC6514f;
import p156t3.InterfaceC7725b;

@StabilityInferred(parameters = 0)
@Metadata(m7879d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 @2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002#&B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\nH\u0096@¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\n2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0094@¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0013\u0010\u0004J\u000f\u0010\u0014\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0014\u0010\u0004J\u0015\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0005¢\u0006\u0004\b\u0016\u0010\u0017J'\u0010\u001d\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ1\u0010!\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u00182\u0018\u0010 \u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\n0\u001fH\u0002¢\u0006\u0004\b!\u0010\"R\u0016\u0010%\u001a\u00020\u00188\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010'\u001a\u00020\u00188\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b&\u0010$R$\u0010/\u001a\u0004\u0018\u00010(8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R$\u00107\u001a\u0004\u0018\u0001008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\u0014\u0010;\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0018\u0010?\u001a\u0004\u0018\u00010<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>¨\u0006A"}, m7880d2 = {"Lcom/zykj/huiwei/launcher/ui/activity/PdfFragment;", "Lcom/zykj/base/BaseFragment;", "Lcom/zykj/huiwei/launcher/databinding/DiscoveryFragmentPdfBinding;", "<init>", "()V", "", "layoutId", "()I", "Landroid/content/Context;", "context", "", "onAttach", "(Landroid/content/Context;)V", "initData", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroid/os/Bundle;", "savedInstanceState", "initView", "(Landroid/os/Bundle;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onPause", "onDestroyView", "page", "y", "(I)V", "", "path", "index", "", TypedValues.CycleType.S_WAVE_OFFSET, "q", "(Ljava/lang/String;IF)V", "Lkotlin/Function2;", "callback", "o", "(Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V", "a", "Ljava/lang/String;", "localPath", "b", "urlPath", "Landroid/widget/TextView;", "c", "Landroid/widget/TextView;", "getPageShow", "()Landroid/widget/TextView;", "setPageShow", "(Landroid/widget/TextView;)V", "pageShow", "Lcom/github/barteksc/pdfviewer/PDFView;", "d", "Lcom/github/barteksc/pdfviewer/PDFView;", "p", "()Lcom/github/barteksc/pdfviewer/PDFView;", "setPdfView", "(Lcom/github/barteksc/pdfviewer/PDFView;)V", "pdfView", "Lt3/b;", "e", "Lt3/b;", "previewDao", "Lcom/zykj/huiwei/launcher/ui/activity/PdfFragment$b;", "f", "Lcom/zykj/huiwei/launcher/ui/activity/PdfFragment$b;", "pdfPageCallback", "g", "app_release"}, m7881k = 1, m7882mv = {2, 2, 0}, m7884xi = 48)
/* loaded from: classes4.dex */
public final class PdfFragment extends BaseFragment<DiscoveryFragmentPdfBinding> {

    /* renamed from: g, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: h */
    public static final int f6378h = 8;

    /* renamed from: a, reason: from kotlin metadata */
    public String localPath;

    /* renamed from: b, reason: from kotlin metadata */
    public String urlPath;

    /* renamed from: c, reason: from kotlin metadata */
    public TextView pageShow;

    /* renamed from: d, reason: from kotlin metadata */
    public PDFView pdfView;

    /* renamed from: e, reason: from kotlin metadata */
    public final InterfaceC7725b previewDao;

    /* renamed from: f, reason: from kotlin metadata */
    public InterfaceC6101b pdfPageCallback;

    /* renamed from: com.zykj.huiwei.launcher.ui.activity.PdfFragment$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final PdfFragment m5602a(String path, String url) {
            Intrinsics.checkNotNullParameter(path, "path");
            Intrinsics.checkNotNullParameter(url, "url");
            PdfFragment pdfFragment = new PdfFragment();
            Bundle bundle = new Bundle();
            bundle.putString(OssUtils.FILE_PATH, path);
            bundle.putString("url_path", url);
            pdfFragment.setArguments(bundle);
            return pdfFragment;
        }

        public Companion() {
        }
    }

    /* renamed from: com.zykj.huiwei.launcher.ui.activity.PdfFragment$b */
    public interface InterfaceC6101b {
        /* renamed from: a */
        void mo5571a(int i6, int i7);
    }

    @Metadata(m7879d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m7880d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7881k = 3, m7882mv = {2, 2, 0}, m7884xi = 48)
    @DebugMetadata(m7917c = "com.zykj.huiwei.launcher.ui.activity.PdfFragment$onPause$1", m7918f = "PdfFragment.kt", m7919i = {}, m7920l = {}, m7921m = "invokeSuspend", m7922n = {}, m7923s = {})
    /* renamed from: com.zykj.huiwei.launcher.ui.activity.PdfFragment$onPause$1 */
    public static final class C61021 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a */
        public int f6394a;

        public C61021(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return PdfFragment.this.new C61021(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return invoke2(coroutineScope, (Continuation) continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f6394a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            PDFView pdfView = PdfFragment.this.getPdfView();
            if (pdfView != null) {
                PdfFragment pdfFragment = PdfFragment.this;
                if (pdfView.getPageCount() != 1) {
                    InterfaceC7725b interfaceC7725b = pdfFragment.previewDao;
                    String str = pdfFragment.localPath;
                    if (str == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("localPath");
                        str = null;
                    }
                    interfaceC7725b.mo5305b(new PDFPreviewInfo(str, pdfView.getCurrentPage(), pdfView.getPositionOffset()));
                }
            }
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C61021) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public PdfFragment() {
        PDFPreviewDatabase.Companion companion = PDFPreviewDatabase.INSTANCE;
        Application applicationM2250a = AbstractC4657l0.m2250a();
        Intrinsics.checkNotNullExpressionValue(applicationM2250a, "getApp(...)");
        this.previewDao = companion.m5295b(applicationM2250a).mo5293i();
    }

    /* renamed from: r */
    public static final void m5591r(File file, Throwable th) {
        if (!(th instanceof FileNotFoundException)) {
            if (th instanceof IOException) {
                ToastUtils.m2096r("文件异常，请重新下载", new Object[0]);
                file.delete();
                return;
            }
            return;
        }
        ToastUtils.m2096r("文件不存在 " + file.getAbsolutePath(), new Object[0]);
    }

    /* renamed from: s */
    public static final void m5592s(PDFView pDFView, final PdfFragment pdfFragment, final float f6, int i6) {
        pDFView.postDelayed(new Runnable() { // from class: z3.l
            @Override // java.lang.Runnable
            public final void run() {
                PdfFragment.m5593t(this.f10671a, f6);
            }
        }, 20L);
        InterfaceC6101b interfaceC6101b = pdfFragment.pdfPageCallback;
        if (interfaceC6101b != null) {
            interfaceC6101b.mo5571a(i6 > 0 ? 1 : 0, i6);
        }
    }

    /* renamed from: t */
    public static final void m5593t(PdfFragment pdfFragment, float f6) {
        PDFView pDFView = pdfFragment.pdfView;
        if (pDFView != null) {
            pDFView.setPositionOffset(f6);
        }
    }

    /* renamed from: u */
    public static final void m5594u(PdfFragment pdfFragment, int i6, int i7) {
        Log.i("PdfFragment", "onPageChange");
        InterfaceC6101b interfaceC6101b = pdfFragment.pdfPageCallback;
        if (interfaceC6101b != null) {
            interfaceC6101b.mo5571a(i6 + 1, i7);
        }
    }

    /* renamed from: v */
    public static final void m5595v(int i6, Throwable th) {
        ToastUtils.m2096r("第" + i6 + "页加载异常", new Object[0]);
        th.printStackTrace();
    }

    /* renamed from: w */
    public static final void m5596w(int i6, float f6) {
        System.out.println((Object) String.valueOf(f6));
    }

    /* renamed from: x */
    public static final Unit m5597x(PdfFragment pdfFragment, int i6, float f6) {
        String str = pdfFragment.localPath;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("localPath");
            str = null;
        }
        pdfFragment.m5600q(str, i6, f6);
        return Unit.INSTANCE;
    }

    @Override // com.zykj.base.BaseFragment
    public Object initData(Continuation continuation) {
        Bundle arguments = getArguments();
        if (arguments != null) {
            String string = arguments.getString(OssUtils.FILE_PATH);
            if (string == null || string.length() == 0) {
                ToastUtils.m2096r("文件不存在", new Object[0]);
            } else {
                this.localPath = string;
            }
            String string2 = arguments.getString("url_path");
            if (string2 == null || string2.length() == 0) {
                ToastUtils.m2096r("Url不存在", new Object[0]);
            } else {
                this.urlPath = string2;
            }
        }
        return Unit.INSTANCE;
    }

    @Override // com.zykj.base.BaseFragment
    public Object initView(Bundle bundle, Continuation continuation) {
        String str = this.localPath;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("localPath");
            str = null;
        }
        m5598o(str, new Function2() { // from class: z3.f
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return PdfFragment.m5597x(this.f10665a, ((Integer) obj).intValue(), ((Float) obj2).floatValue());
            }
        });
        return Unit.INSTANCE;
    }

    @Override // com.zykj.base.BaseFragment
    public int layoutId() {
        return R.layout.discovery_fragment_pdf;
    }

    /* renamed from: o */
    public final void m5598o(String path, Function2 callback) {
        LifecycleOwnerKt.getLifecycleScope(this).launchWhenCreated(new PdfFragment$getPdfPreviewInfo$1(this, path, callback, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        if (context instanceof InterfaceC6101b) {
            this.pdfPageCallback = (InterfaceC6101b) context;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        Log.i("PdfFragment", "onDestroyView");
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, null, null, new C61021(null), 3, null);
    }

    /* renamed from: p, reason: from getter */
    public final PDFView getPdfView() {
        return this.pdfView;
    }

    /* renamed from: q */
    public final void m5600q(String path, int index, final float offset) {
        final PDFView pDFView;
        final File file = new File(path);
        String str = null;
        if (!file.exists()) {
            Context contextRequireContext = requireContext();
            String str2 = this.localPath;
            if (str2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("localPath");
            } else {
                str = str2;
            }
            Toast.makeText(contextRequireContext, "文件不存在:" + str, 0).show();
            return;
        }
        View view = getView();
        TextView textView = view != null ? (TextView) view.findViewById(R.id.tv_page_index) : null;
        this.pageShow = textView;
        if (textView != null) {
            textView.setText(getString(R.string.discovery_page_index, 0, 0));
        }
        TextView textView2 = this.pageShow;
        if (textView2 != null) {
            textView2.setVisibility(8);
        }
        View view2 = getView();
        if (view2 == null || (pDFView = (PDFView) view2.findViewById(R.id.fm_content)) == null) {
            return;
        }
        this.pdfView = pDFView;
        pDFView.m3368A(file).m3415h(true).m3422o(false).m3414g(true).m3417j(new InterfaceC6510b() { // from class: z3.g
            @Override // p075i1.InterfaceC6510b
            public final void onError(Throwable th) {
                PdfFragment.m5591r(file, th);
            }
        }).m3418k(new InterfaceC6511c() { // from class: z3.h
            @Override // p075i1.InterfaceC6511c
            /* renamed from: a */
            public final void mo7257a(int i6) {
                PdfFragment.m5592s(pDFView, this, offset, i6);
            }
        }).m3419l(new InterfaceC6512d() { // from class: z3.i
            @Override // p075i1.InterfaceC6512d
            /* renamed from: a */
            public final void mo7258a(int i6, int i7) {
                PdfFragment.m5594u(this.f10670a, i6, i7);
            }
        }).m3420m(new InterfaceC6513e() { // from class: z3.j
            @Override // p075i1.InterfaceC6513e
            /* renamed from: a */
            public final void mo7259a(int i6, Throwable th) {
                PdfFragment.m5595v(i6, th);
            }
        }).m3421n(new InterfaceC6514f() { // from class: z3.k
            @Override // p075i1.InterfaceC6514f
            /* renamed from: a */
            public final void mo7260a(int i6, float f6) {
                PdfFragment.m5596w(i6, f6);
            }
        }).m3413f(index).m3416i();
    }

    /* renamed from: y */
    public final void m5601y(int page) {
        PDFView pDFView = this.pdfView;
        if (pDFView != null) {
            pDFView.m3373F(page);
        }
    }
}
