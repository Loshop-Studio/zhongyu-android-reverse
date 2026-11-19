package com.zykj.huiwei.launcher.p035ui.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import androidx.collection.SieveCacheKt;
import androidx.compose.runtime.internal.StabilityInferred;
import com.blankj.utilcode.util.ToastUtils;
import com.xuexiang.xui.utils.AbstractViewTreeObserverOnGlobalLayoutListenerC5856d;
import com.zykj.download.OssUtils;
import com.zykj.huiwei.launcher.base.CommonActivity;
import com.zykj.huiwei.launcher.databinding.DiscoveryActivityFileBinding;
import com.zykj.huiwei.launcher.p035ui.activity.FileActivity;
import com.zykj.huiwei.launcher.p035ui.activity.PdfFragment;
import com.zykj.manage.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

@StabilityInferred(parameters = 0)
@Metadata(m7879d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000  2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0010B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0094@¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0017\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0018\u0010\u0019R\u0016\u0010\u000e\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u001aR\u0016\u0010\u000f\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001aR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006!"}, m7880d2 = {"Lcom/zykj/huiwei/launcher/ui/activity/FileActivity;", "Lcom/zykj/huiwei/launcher/base/CommonActivity;", "Lcom/zykj/huiwei/launcher/databinding/DiscoveryActivityFileBinding;", "Lcom/zykj/huiwei/launcher/ui/activity/PdfFragment$b;", "<init>", "()V", "", "layoutId", "()I", "Landroid/os/Bundle;", "savedInstanceState", "", "initView", "(Landroid/os/Bundle;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "currentPage", "totalPage", "a", "(II)V", "", "localPath", "urlPath", "p", "(Ljava/lang/String;Ljava/lang/String;)V", "paramString", "q", "(Ljava/lang/String;)Ljava/lang/String;", "I", "b", "Lcom/zykj/huiwei/launcher/ui/activity/PdfFragment;", "c", "Lcom/zykj/huiwei/launcher/ui/activity/PdfFragment;", "pdfFragment", "d", "app_release"}, m7881k = 1, m7882mv = {2, 2, 0}, m7884xi = 48)
@SourceDebugExtension({"SMAP\nFileActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileActivity.kt\ncom/zykj/huiwei/launcher/ui/activity/FileActivity\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,149:1\n257#2,2:150\n*S KotlinDebug\n*F\n+ 1 FileActivity.kt\ncom/zykj/huiwei/launcher/ui/activity/FileActivity\n*L\n82#1:150,2\n*E\n"})
/* loaded from: classes4.dex */
public final class FileActivity extends CommonActivity<DiscoveryActivityFileBinding> implements PdfFragment.InterfaceC6101b {

    /* renamed from: d, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: e */
    public static final int f6364e = 8;

    /* renamed from: a, reason: from kotlin metadata */
    public int currentPage;

    /* renamed from: b, reason: from kotlin metadata */
    public int totalPage;

    /* renamed from: c, reason: from kotlin metadata */
    public PdfFragment pdfFragment;

    /* renamed from: com.zykj.huiwei.launcher.ui.activity.FileActivity$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void m5574a(Context context, String localPath, String urlPath) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(localPath, "localPath");
            Intrinsics.checkNotNullParameter(urlPath, "urlPath");
            Intent intent = new Intent(context, (Class<?>) FileActivity.class);
            intent.putExtra(OssUtils.FILE_PATH, localPath);
            intent.putExtra("url_path", urlPath);
            context.startActivity(intent);
        }

        public Companion() {
        }
    }

    /* renamed from: r */
    public static final void m5567r(FileActivity fileActivity, View view) {
        fileActivity.finish();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: s */
    public static final boolean m5568s(FileActivity fileActivity, TextView textView, int i6, KeyEvent keyEvent) {
        if (i6 != 2) {
            return false;
        }
        String strValueOf = String.valueOf(((DiscoveryActivityFileBinding) fileActivity.getMBindView()).pdfPage.etPage.getText());
        int i7 = ((DiscoveryActivityFileBinding) fileActivity.getMBindView()).pdfPage.etPage.length() == 0 ? 1 : Long.parseLong(strValueOf) > SieveCacheKt.NodeLinkMask ? Integer.MAX_VALUE : Integer.parseInt(strValueOf);
        if (i7 == 0) {
            i7 = 1;
        } else {
            int i8 = fileActivity.totalPage;
            if (i7 > i8) {
                i7 = i8;
            }
        }
        fileActivity.currentPage = i7;
        if (i7 < 1) {
            fileActivity.currentPage = 1;
        }
        PdfFragment pdfFragment = fileActivity.pdfFragment;
        if (pdfFragment != null) {
            pdfFragment.m5601y(fileActivity.currentPage - 1);
        }
        ((DiscoveryActivityFileBinding) fileActivity.getMBindView()).pdfPage.etPage.clearFocus();
        AbstractViewTreeObserverOnGlobalLayoutListenerC5856d.m4353d(((DiscoveryActivityFileBinding) fileActivity.getMBindView()).pdfPage.etPage);
        return false;
    }

    /* renamed from: t */
    public static final void m5569t(FileActivity fileActivity, View view) {
        int i6 = fileActivity.currentPage;
        fileActivity.currentPage = i6 - 1;
        PdfFragment pdfFragment = fileActivity.pdfFragment;
        if (pdfFragment != null) {
            pdfFragment.m5601y(i6 - 2);
        }
    }

    /* renamed from: u */
    public static final void m5570u(FileActivity fileActivity, View view) {
        int i6 = fileActivity.currentPage;
        fileActivity.currentPage = i6 + 1;
        PdfFragment pdfFragment = fileActivity.pdfFragment;
        if (pdfFragment != null) {
            pdfFragment.m5601y(i6);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.zykj.huiwei.launcher.p035ui.activity.PdfFragment.InterfaceC6101b
    /* renamed from: a */
    public void mo5571a(int currentPage, int totalPage) {
        ((DiscoveryActivityFileBinding) getMBindView()).pdfPage.etPage.clearFocus();
        this.currentPage = currentPage;
        this.totalPage = totalPage;
        ((DiscoveryActivityFileBinding) getMBindView()).pdfPage.etPage.setText(String.valueOf(currentPage));
        ((DiscoveryActivityFileBinding) getMBindView()).pdfPage.etPage.setSelection(((DiscoveryActivityFileBinding) getMBindView()).pdfPage.etPage.length());
        ((DiscoveryActivityFileBinding) getMBindView()).pdfPage.tvTotalPage.setText(String.valueOf(totalPage));
        if (totalPage > 0) {
            ((DiscoveryActivityFileBinding) getMBindView()).pdfPage.ivPrev.setEnabled(currentPage > 1);
            ((DiscoveryActivityFileBinding) getMBindView()).pdfPage.ivNext.setEnabled(currentPage < totalPage);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.zykj.base.BaseActivity
    public Object initView(Bundle bundle, Continuation continuation) {
        ((DiscoveryActivityFileBinding) getMBindView()).titleBar.m4434h(new View.OnClickListener() { // from class: z3.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FileActivity.m5567r(this.f10661a, view);
            }
        });
        String stringExtra = getIntent().hasExtra(OssUtils.FILE_PATH) ? getIntent().getStringExtra(OssUtils.FILE_PATH) : null;
        String stringExtra2 = getIntent().hasExtra("url_path") ? getIntent().getStringExtra("url_path") : null;
        if (stringExtra == null || stringExtra.length() == 0) {
            ToastUtils.m2096r("文件不存在", new Object[0]);
            finish();
            return Unit.INSTANCE;
        }
        if (stringExtra2 == null || stringExtra2.length() == 0) {
            ToastUtils.m2096r("文件网络地址不存在", new Object[0]);
            finish();
            return Unit.INSTANCE;
        }
        ((DiscoveryActivityFileBinding) getMBindView()).pdfPage.etPage.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: z3.c
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i6, KeyEvent keyEvent) {
                return FileActivity.m5568s(this.f10662a, textView, i6, keyEvent);
            }
        });
        ((DiscoveryActivityFileBinding) getMBindView()).pdfPage.etPage.clearFocus();
        ((DiscoveryActivityFileBinding) getMBindView()).pdfPage.ivPrev.setEnabled(false);
        ((DiscoveryActivityFileBinding) getMBindView()).pdfPage.ivNext.setEnabled(false);
        ((DiscoveryActivityFileBinding) getMBindView()).pdfPage.ivPrev.setOnClickListener(new View.OnClickListener() { // from class: z3.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FileActivity.m5569t(this.f10663a, view);
            }
        });
        ((DiscoveryActivityFileBinding) getMBindView()).pdfPage.ivNext.setOnClickListener(new View.OnClickListener() { // from class: z3.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FileActivity.m5570u(this.f10664a, view);
            }
        });
        m5572p(stringExtra, stringExtra2);
        return Unit.INSTANCE;
    }

    @Override // com.zykj.base.BaseActivity
    public int layoutId() {
        return R.layout.discovery_activity_file;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0023, code lost:
    
        if (r0.equals("png") == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0064, code lost:
    
        if (r0.equals("jpg") == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006d, code lost:
    
        if (r0.equals("gif") == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0076, code lost:
    
        if (r0.equals("bmp") == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0079, code lost:
    
        getSupportFragmentManager().beginTransaction().replace(com.zykj.manage.R.id.fragmentContainer, com.zykj.huiwei.launcher.p035ui.activity.ImageFragment.INSTANCE.m5581a(r5, r6)).commitNowAllowingStateLoss();
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
    
        if (r0.equals("jpeg") == false) goto L29;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m5572p(java.lang.String r5, java.lang.String r6) {
        /*
            r4 = this;
            java.lang.String r0 = r4.m5573q(r5)
            r1 = 0
            if (r0 == 0) goto L8f
            int r2 = r0.hashCode()
            r3 = 2131296597(0x7f090155, float:1.8211115E38)
            switch(r2) {
                case 97669: goto L70;
                case 102340: goto L67;
                case 105441: goto L5e;
                case 110834: goto L26;
                case 111145: goto L1d;
                case 3268712: goto L13;
                default: goto L11;
            }
        L11:
            goto L8f
        L13:
            java.lang.String r2 = "jpeg"
            boolean r2 = r0.equals(r2)
            if (r2 != 0) goto L79
            goto L8f
        L1d:
            java.lang.String r2 = "png"
            boolean r2 = r0.equals(r2)
            if (r2 != 0) goto L79
            goto L8f
        L26:
            java.lang.String r2 = "pdf"
            boolean r2 = r0.equals(r2)
            if (r2 != 0) goto L2f
            goto L8f
        L2f:
            androidx.databinding.ViewDataBinding r0 = r4.getMBindView()
            com.zykj.huiwei.launcher.databinding.DiscoveryActivityFileBinding r0 = (com.zykj.huiwei.launcher.databinding.DiscoveryActivityFileBinding) r0
            com.zykj.huiwei.launcher.databinding.DiscoveryIncludePdfPageBinding r0 = r0.pdfPage
            android.widget.LinearLayout r0 = r0.content
            java.lang.String r2 = "content"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r2)
            r0.setVisibility(r1)
            com.zykj.huiwei.launcher.ui.activity.PdfFragment$a r0 = com.zykj.huiwei.launcher.p035ui.activity.PdfFragment.INSTANCE
            com.zykj.huiwei.launcher.ui.activity.PdfFragment r5 = r0.m5602a(r5, r6)
            r4.pdfFragment = r5
            androidx.fragment.app.FragmentManager r5 = r4.getSupportFragmentManager()
            androidx.fragment.app.FragmentTransaction r5 = r5.beginTransaction()
            com.zykj.huiwei.launcher.ui.activity.PdfFragment r6 = r4.pdfFragment
            kotlin.jvm.internal.Intrinsics.checkNotNull(r6)
            androidx.fragment.app.FragmentTransaction r5 = r5.replace(r3, r6)
            r5.commitNowAllowingStateLoss()
            return
        L5e:
            java.lang.String r2 = "jpg"
            boolean r2 = r0.equals(r2)
            if (r2 != 0) goto L79
            goto L8f
        L67:
            java.lang.String r2 = "gif"
            boolean r2 = r0.equals(r2)
            if (r2 != 0) goto L79
            goto L8f
        L70:
            java.lang.String r2 = "bmp"
            boolean r2 = r0.equals(r2)
            if (r2 != 0) goto L79
            goto L8f
        L79:
            androidx.fragment.app.FragmentManager r0 = r4.getSupportFragmentManager()
            androidx.fragment.app.FragmentTransaction r0 = r0.beginTransaction()
            com.zykj.huiwei.launcher.ui.activity.ImageFragment$a r1 = com.zykj.huiwei.launcher.p035ui.activity.ImageFragment.INSTANCE
            com.zykj.huiwei.launcher.ui.activity.ImageFragment r5 = r1.m5581a(r5, r6)
            androidx.fragment.app.FragmentTransaction r5 = r0.replace(r3, r5)
            r5.commitNowAllowingStateLoss()
            return
        L8f:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "不支持的文件类型:"
            r5.append(r6)
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            java.lang.Object[] r6 = new java.lang.Object[r1]
            com.blankj.utilcode.util.ToastUtils.m2096r(r5, r6)
            r4.finish()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.huiwei.launcher.p035ui.activity.FileActivity.m5572p(java.lang.String, java.lang.String):void"); // DEX body: android/中育管控桌面/smali_classes4/com/zykj/huiwei/launcher/ui/activity/FileActivity.smali:1160
    }

    /* renamed from: q */
    public final String m5573q(String paramString) {
        int iLastIndexOf$default;
        if (TextUtils.isEmpty(paramString) || (iLastIndexOf$default = StringsKt.lastIndexOf$default((CharSequence) paramString, '.', 0, false, 6, (Object) null)) <= -1) {
            return "";
        }
        String strSubstring = paramString.substring(iLastIndexOf$default + 1);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }
}
