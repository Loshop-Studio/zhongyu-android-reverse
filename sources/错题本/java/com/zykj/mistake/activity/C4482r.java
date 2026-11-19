package com.zykj.mistake.activity;

import android.view.result.ActivityResultCallback;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.zykj.mistake.base.BaseMVPActivity;
import com.zykj.mistake.entity.req.MistakeListReq;
import com.zykj.mistake.presenter.MistakeListPresenter;
import p009a8.InterfaceC0027e;

/* renamed from: com.zykj.mistake.activity.r */
/* loaded from: classes3.dex */
public final /* synthetic */ class C4482r implements InterfaceC0027e, SwipeRefreshLayout.OnRefreshListener, ActivityResultCallback {

    /* renamed from: a */
    public final /* synthetic */ BaseMVPActivity f5937a;

    public /* synthetic */ C4482r(BaseMVPActivity baseMVPActivity) {
        this.f5937a = baseMVPActivity;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    @Override // android.view.result.ActivityResultCallback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onActivityResult(java.lang.Object r12) throws java.lang.Throwable {
        /*
            r11 = this;
            com.zykj.mistake.base.BaseMVPActivity r0 = r11.f5937a
            r1 = r0
            com.zykj.mistake.activity.SketchActivity r1 = (com.zykj.mistake.activity.SketchActivity) r1
            androidx.activity.result.ActivityResult r12 = (android.view.result.ActivityResult) r12
            int r0 = com.zykj.mistake.activity.SketchActivity.f5853v
            java.lang.String r0 = "result"
            kotlin.jvm.internal.AbstractC5830k.m5330g(r12, r0)
            int r0 = r12.getResultCode()
            r2 = -1
            if (r0 != r2) goto La9
            android.content.Intent r12 = r12.getData()
            r2 = 0
            if (r12 == 0) goto L21
            android.net.Uri r12 = r12.getData()
            goto L22
        L21:
            r12 = r2
        L22:
            if (r12 == 0) goto La9
            android.app.Application r0 = com.blankj.utilcode.util.AbstractC3382c.m2303d()     // Catch: java.lang.Throwable -> L70 java.io.FileNotFoundException -> L72
            android.content.ContentResolver r0 = r0.getContentResolver()     // Catch: java.lang.Throwable -> L70 java.io.FileNotFoundException -> L72
            java.io.InputStream r12 = r0.openInputStream(r12)     // Catch: java.lang.Throwable -> L70 java.io.FileNotFoundException -> L72
            java.io.File r0 = new java.io.File     // Catch: java.lang.Throwable -> L6a java.io.FileNotFoundException -> L6e
            android.app.Application r3 = com.blankj.utilcode.util.AbstractC3382c.m2303d()     // Catch: java.lang.Throwable -> L6a java.io.FileNotFoundException -> L6e
            java.io.File r3 = r3.getCacheDir()     // Catch: java.lang.Throwable -> L6a java.io.FileNotFoundException -> L6e
            long r4 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L6a java.io.FileNotFoundException -> L6e
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6a java.io.FileNotFoundException -> L6e
            r6.<init>()     // Catch: java.lang.Throwable -> L6a java.io.FileNotFoundException -> L6e
            r6.append(r4)     // Catch: java.lang.Throwable -> L6a java.io.FileNotFoundException -> L6e
            java.lang.String r4 = ".jpg"
            r6.append(r4)     // Catch: java.lang.Throwable -> L6a java.io.FileNotFoundException -> L6e
            java.lang.String r4 = r6.toString()     // Catch: java.lang.Throwable -> L6a java.io.FileNotFoundException -> L6e
            r0.<init>(r3, r4)     // Catch: java.lang.Throwable -> L6a java.io.FileNotFoundException -> L6e
            java.lang.String r3 = r0.getAbsolutePath()     // Catch: java.lang.Throwable -> L6a java.io.FileNotFoundException -> L6e
            com.blankj.utilcode.util.AbstractC3382c.m2319t(r12, r3)     // Catch: java.lang.Throwable -> L6a java.io.FileNotFoundException -> L6e
            java.lang.String r3 = r0.getAbsolutePath()     // Catch: java.lang.Throwable -> L6a java.io.FileNotFoundException -> L6e
            if (r12 == 0) goto L62
            r12.close()     // Catch: java.io.IOException -> L64
        L62:
            r5 = r3
            goto L83
        L64:
            r0 = move-exception
            r12 = r0
            r12.printStackTrace()
            goto L62
        L6a:
            r0 = move-exception
            r2 = r12
        L6c:
            r12 = r0
            goto L9e
        L6e:
            r0 = move-exception
            goto L74
        L70:
            r0 = move-exception
            goto L6c
        L72:
            r0 = move-exception
            r12 = r2
        L74:
            r0.printStackTrace()     // Catch: java.lang.Throwable -> L6a
            if (r12 == 0) goto L82
            r12.close()     // Catch: java.io.IOException -> L7d
            goto L82
        L7d:
            r0 = move-exception
            r12 = r0
            r12.printStackTrace()
        L82:
            r5 = r2
        L83:
            if (r5 == 0) goto La9
            com.zykj.view.board.board.BoardFragment r3 = r1.f5859j
            if (r3 == 0) goto L98
            com.zykj.mistake.activity.m r8 = new com.zykj.mistake.activity.m
            r12 = 3
            r8.<init>(r5, r12)
            r9 = 5
            r10 = 0
            r4 = 0
            r6 = 0
            r7 = 1
            com.zykj.view.board.board.BoardFragment.addBitmap$default(r3, r4, r5, r6, r7, r8, r9, r10)
            goto La9
        L98:
            java.lang.String r12 = "mSketchFragment"
            kotlin.jvm.internal.AbstractC5830k.m5339p(r12)
            throw r2
        L9e:
            if (r2 == 0) goto La8
            r2.close()     // Catch: java.io.IOException -> La4
            goto La8
        La4:
            r0 = move-exception
            r0.printStackTrace()
        La8:
            throw r12
        La9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.mistake.activity.C4482r.onActivityResult(java.lang.Object):void"); // DEX body: android/错题本/smali_classes3/com/zykj/mistake/activity/r.smali:29
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener
    public void onRefresh() {
        MistakeListActivity mistakeListActivity = (MistakeListActivity) this.f5937a;
        int i = MistakeListActivity.f5831x;
        MistakeListReq mistakeListReq = mistakeListActivity.f5841n;
        mistakeListReq.setSkipCount(0);
        ((MistakeListPresenter) mistakeListActivity.m3965r()).m4438d(mistakeListReq, true);
    }
}
