package com.zykj.subscriber;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatImageView;
import com.xuexiang.xui.utils.KeyboardUtils;
import com.zykj.download.OssUtils;
import com.zykj.subscriber.FileActivity;
import com.zykj.subscriber.view.CommonTitleBar;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.C2764g;
import kotlin.jvm.internal.C2769l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p018c2.C1081t;
import p018c2.C1082u;
import p082e3.C2496v;
import p116l2.C2847h;

/* loaded from: classes.dex */
public final class FileActivity extends AppCompatActivity implements C1081t.b {

    /* renamed from: e */
    @NotNull
    public static final C2418a f9829e = new C2418a(null);

    /* renamed from: a */
    @NotNull
    public Map<Integer, View> f9830a = new LinkedHashMap();

    /* renamed from: b */
    private int f9831b;

    /* renamed from: c */
    private int f9832c;

    /* renamed from: d */
    @Nullable
    private C1081t f9833d;

    /* renamed from: com.zykj.subscriber.FileActivity$a */
    public static final class C2418a {
        private C2418a() {
        }

        public /* synthetic */ C2418a(C2764g c2764g) {
            this();
        }

        /* renamed from: a */
        public final void m8036a(@NotNull Activity activity, @NotNull String localPath, @NotNull String urlPath) {
            C2769l.m9241e(activity, "activity");
            C2769l.m9241e(localPath, "localPath");
            C2769l.m9241e(urlPath, "urlPath");
            Intent intent = new Intent(activity, (Class<?>) FileActivity.class);
            intent.putExtra(OssUtils.FILE_PATH, localPath);
            intent.putExtra("url_path", urlPath);
            activity.startActivity(intent);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0027, code lost:
    
        if (r0.equals("jpeg") == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0031, code lost:
    
        if (r0.equals("png") == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006f, code lost:
    
        if (r0.equals("jpg") == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0078, code lost:
    
        if (r0.equals("gif") == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0081, code lost:
    
        if (r0.equals("bmp") == false) goto L30;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void m8029i(java.lang.String r4, java.lang.String r5) {
        /*
            r3 = this;
            java.lang.String r0 = r3.m8030j(r4)
            if (r0 != 0) goto L8
            r0 = 0
            goto L13
        L8:
            java.util.Locale r1 = java.util.Locale.ROOT
            java.lang.String r0 = r0.toLowerCase(r1)
            java.lang.String r1 = "this as java.lang.String).toLowerCase(Locale.ROOT)"
            kotlin.jvm.internal.C2769l.m9240d(r0, r1)
        L13:
            if (r0 == 0) goto L9a
            int r1 = r0.hashCode()
            r2 = 2131296511(0x7f0900ff, float:1.821094E38)
            switch(r1) {
                case 97669: goto L7b;
                case 102340: goto L72;
                case 105441: goto L69;
                case 110834: goto L34;
                case 111145: goto L2b;
                case 3268712: goto L21;
                default: goto L1f;
            }
        L1f:
            goto L9a
        L21:
            java.lang.String r1 = "jpeg"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L84
            goto L9a
        L2b:
            java.lang.String r1 = "png"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L84
            goto L9a
        L34:
            java.lang.String r1 = "pdf"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L3d
            goto L9a
        L3d:
            int r0 = p018c2.C1082u.f6296i
            android.view.View r0 = r3.m8035h(r0)
            java.lang.String r1 = "pdfPage"
            kotlin.jvm.internal.C2769l.m9240d(r0, r1)
            r1 = 0
            r0.setVisibility(r1)
            c2.t$a r0 = p018c2.C1081t.f6271g
            c2.t r4 = r0.m4974a(r4, r5)
            r3.f9833d = r4
            androidx.fragment.app.FragmentManager r4 = r3.getSupportFragmentManager()
            androidx.fragment.app.s r4 = r4.m2489m()
            c2.t r5 = r3.f9833d
            kotlin.jvm.internal.C2769l.m9239c(r5)
            androidx.fragment.app.s r4 = r4.m2706q(r2, r5)
            r4.mo2550h()
            goto La8
        L69:
            java.lang.String r1 = "jpg"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L84
            goto L9a
        L72:
            java.lang.String r1 = "gif"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L84
            goto L9a
        L7b:
            java.lang.String r1 = "bmp"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L84
            goto L9a
        L84:
            androidx.fragment.app.FragmentManager r0 = r3.getSupportFragmentManager()
            androidx.fragment.app.s r0 = r0.m2489m()
            c2.e$a r1 = p018c2.C1066e.f6249d
            c2.e r4 = r1.m4948a(r4, r5)
            androidx.fragment.app.s r4 = r0.m2706q(r2, r4)
            r4.mo2550h()
            goto La8
        L9a:
            l2.h r4 = p116l2.C2847h.f10954a
            java.lang.String r5 = "不支持的文件类型:"
            java.lang.String r5 = kotlin.jvm.internal.C2769l.m9248l(r5, r0)
            r4.m9553a(r3, r5)
            r3.finish()
        La8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.subscriber.FileActivity.m8029i(java.lang.String, java.lang.String):void"); // DEX body: android/在线专栏/smali/com/zykj/subscriber/FileActivity.smali:112
    }

    /* renamed from: j */
    private final String m8030j(String str) {
        int iM8385Y;
        if (TextUtils.isEmpty(str) || (iM8385Y = C2496v.m8385Y(str, '.', 0, false, 6, null)) <= -1) {
            return "";
        }
        String strSubstring = str.substring(iM8385Y + 1);
        C2769l.m9240d(strSubstring, "this as java.lang.String).substring(startIndex)");
        return strSubstring;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public static final void m8031k(FileActivity this$0, View view) {
        C2769l.m9241e(this$0, "this$0");
        this$0.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public static final boolean m8032l(FileActivity this$0, TextView textView, int i4, KeyEvent keyEvent) {
        C2769l.m9241e(this$0, "this$0");
        if (i4 != 2) {
            return false;
        }
        int i5 = C1082u.f6296i;
        View viewM8035h = this$0.m8035h(i5);
        int i6 = C1082u.f6288a;
        String strValueOf = String.valueOf(((AppCompatEditText) viewM8035h.findViewById(i6)).getText());
        int i7 = ((AppCompatEditText) this$0.m8035h(i5).findViewById(i6)).length() == 0 ? 1 : Long.parseLong(strValueOf) > 2147483647L ? Integer.MAX_VALUE : Integer.parseInt(strValueOf);
        if (i7 == 0) {
            i7 = 1;
        } else {
            int i8 = this$0.f9832c;
            if (i7 > i8) {
                i7 = i8;
            }
        }
        this$0.f9831b = i7;
        if (i7 < 1) {
            this$0.f9831b = 1;
        }
        C1081t c1081t = this$0.f9833d;
        if (c1081t != null) {
            c1081t.m4973u(this$0.f9831b - 1);
        }
        ((AppCompatEditText) this$0.m8035h(i5).findViewById(i6)).clearFocus();
        KeyboardUtils.hideSoftInput((AppCompatEditText) this$0.m8035h(i5).findViewById(i6));
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public static final void m8033m(FileActivity this$0, View view) {
        C2769l.m9241e(this$0, "this$0");
        int i4 = this$0.f9831b - 1;
        this$0.f9831b = i4;
        C1081t c1081t = this$0.f9833d;
        if (c1081t == null) {
            return;
        }
        c1081t.m4973u(i4 - 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public static final void m8034n(FileActivity this$0, View view) {
        C2769l.m9241e(this$0, "this$0");
        int i4 = this$0.f9831b + 1;
        this$0.f9831b = i4;
        C1081t c1081t = this$0.f9833d;
        if (c1081t == null) {
            return;
        }
        c1081t.m4973u(i4 - 1);
    }

    @Override // p018c2.C1081t.b
    /* renamed from: b */
    public void mo4975b(int i4, int i5) {
        int i6 = C1082u.f6296i;
        View viewM8035h = m8035h(i6);
        int i7 = C1082u.f6288a;
        ((AppCompatEditText) viewM8035h.findViewById(i7)).clearFocus();
        this.f9831b = i4;
        this.f9832c = i5;
        ((AppCompatEditText) m8035h(i6).findViewById(i7)).setText(String.valueOf(i4));
        ((AppCompatEditText) m8035h(i6).findViewById(i7)).setSelection(((AppCompatEditText) m8035h(i6).findViewById(i7)).length());
        ((TextView) m8035h(i6).findViewById(C1082u.f6299l)).setText(String.valueOf(i5));
        if (i5 > 0) {
            ((AppCompatImageView) m8035h(i6).findViewById(C1082u.f6292e)).setEnabled(i4 > 1);
            ((AppCompatImageView) m8035h(i6).findViewById(C1082u.f6291d)).setEnabled(i4 < i5);
        }
    }

    @Nullable
    /* renamed from: h */
    public View m8035h(int i4) {
        Map<Integer, View> map = this.f9830a;
        View view = map.get(Integer.valueOf(i4));
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(i4);
        if (viewFindViewById == null) {
            return null;
        }
        map.put(Integer.valueOf(i4), viewFindViewById);
        return viewFindViewById;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_file);
        ((CommonTitleBar) m8035h(C1082u.f6298k)).m8165h(new View.OnClickListener() { // from class: c2.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FileActivity.m8031k(this.f6245a, view);
            }
        });
        String stringExtra = getIntent().hasExtra(OssUtils.FILE_PATH) ? getIntent().getStringExtra(OssUtils.FILE_PATH) : null;
        String stringExtra2 = getIntent().hasExtra("url_path") ? getIntent().getStringExtra("url_path") : null;
        boolean z3 = true;
        if (stringExtra == null || stringExtra.length() == 0) {
            C2847h.f10954a.m9553a(this, "文件不存在");
            finish();
            return;
        }
        if (stringExtra2 != null && stringExtra2.length() != 0) {
            z3 = false;
        }
        if (z3) {
            C2847h.f10954a.m9553a(this, "文件网络地址不存在");
            finish();
            return;
        }
        m8035h(C1082u.f6290c).requestFocus();
        int i4 = C1082u.f6296i;
        View viewM8035h = m8035h(i4);
        int i5 = C1082u.f6288a;
        ((AppCompatEditText) viewM8035h.findViewById(i5)).setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: c2.d
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i6, KeyEvent keyEvent) {
                return FileActivity.m8032l(this.f6248a, textView, i6, keyEvent);
            }
        });
        ((AppCompatEditText) m8035h(i4).findViewById(i5)).clearFocus();
        View viewM8035h2 = m8035h(i4);
        int i6 = C1082u.f6292e;
        ((AppCompatImageView) viewM8035h2.findViewById(i6)).setEnabled(false);
        View viewM8035h3 = m8035h(i4);
        int i7 = C1082u.f6291d;
        ((AppCompatImageView) viewM8035h3.findViewById(i7)).setEnabled(false);
        ((AppCompatImageView) m8035h(i4).findViewById(i6)).setOnClickListener(new View.OnClickListener() { // from class: c2.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FileActivity.m8033m(this.f6247a, view);
            }
        });
        ((AppCompatImageView) m8035h(i4).findViewById(i7)).setOnClickListener(new View.OnClickListener() { // from class: c2.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FileActivity.m8034n(this.f6246a, view);
            }
        });
        m8029i(stringExtra, stringExtra2);
    }
}
