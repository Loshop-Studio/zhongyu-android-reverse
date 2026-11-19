package com.zykj.mistake.utils;

import android.os.Environment;
import android.widget.FrameLayout;
import com.zykj.mistake.activity.MainActivity;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.text.AbstractC5855p;
import kotlin.text.Regex;
import p000a.AbstractC0000a;

/* renamed from: com.zykj.mistake.utils.c */
/* loaded from: classes3.dex */
public final class C5098c {

    /* renamed from: a */
    public final MainActivity f8028a;

    /* renamed from: b */
    public final FrameLayout f8029b;

    public C5098c(MainActivity mainActivity, FrameLayout webCaptureContainer) {
        AbstractC5830k.m5330g(webCaptureContainer, "webCaptureContainer");
        this.f8028a = mainActivity;
        this.f8029b = webCaptureContainer;
    }

    /* renamed from: a */
    public static final String m4445a(C5098c c5098c, File file, String str) throws IOException {
        c5098c.getClass();
        if (!file.exists() || file.length() <= 0) {
            throw new IllegalStateException("Local file missing");
        }
        String name = file.getName();
        AbstractC5830k.m5329f(name, "getName(...)");
        String strM5397e0 = AbstractC5855p.m5397e0('.', name, "");
        if (AbstractC5855p.m5382P(strM5397e0)) {
            strM5397e0 = null;
        }
        if (strM5397e0 == null) {
            strM5397e0 = "jpg";
        }
        File fileM4447d = m4447d(str, strM5397e0);
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(fileM4447d);
            try {
                AbstractC0000a.m8i(fileInputStream, fileOutputStream);
                fileOutputStream.close();
                fileInputStream.close();
                if (fileM4447d.length() <= 0) {
                    throw new IllegalStateException("Copy image failed");
                }
                String absolutePath = fileM4447d.getAbsolutePath();
                AbstractC5830k.m5329f(absolutePath, "getAbsolutePath(...)");
                return absolutePath;
            } finally {
            }
        } finally {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m4446b(com.zykj.mistake.utils.C5098c r8, java.lang.String r9, java.lang.String r10, kotlin.coroutines.jvm.internal.ContinuationImpl r11) throws java.lang.Throwable {
        /*
            com.zykj.mistake.activity.MainActivity r0 = r8.f8028a
            boolean r1 = r11 instanceof com.zykj.mistake.utils.AskMaterialImageResolver$downloadImage$1
            if (r1 == 0) goto L15
            r1 = r11
            com.zykj.mistake.utils.AskMaterialImageResolver$downloadImage$1 r1 = (com.zykj.mistake.utils.AskMaterialImageResolver$downloadImage$1) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.label = r2
            goto L1a
        L15:
            com.zykj.mistake.utils.AskMaterialImageResolver$downloadImage$1 r1 = new com.zykj.mistake.utils.AskMaterialImageResolver$downloadImage$1
            r1.<init>(r8, r11)
        L1a:
            java.lang.Object r11 = r1.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r2 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r3 = r1.label
            r4 = 2
            r5 = 1
            r6 = 0
            if (r3 == 0) goto L56
            if (r3 == r5) goto L45
            if (r3 != r4) goto L3d
            java.lang.Object r8 = r1.L$3
            s.n r8 = (p154s.C6540n) r8
            java.lang.Object r8 = r1.L$2
            s.f r8 = (p154s.C6532f) r8
            java.lang.Object r8 = r1.L$1
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r8 = r1.L$0
            java.lang.String r8 = (java.lang.String) r8
            kotlin.AbstractC5774b.m5119b(r11)
            return r11
        L3d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L45:
            java.lang.Object r9 = r1.L$2
            s.f r9 = (p154s.C6532f) r9
            java.lang.Object r9 = r1.L$1
            r10 = r9
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r9 = r1.L$0
            java.lang.String r9 = (java.lang.String) r9
            kotlin.AbstractC5774b.m5119b(r11)
            goto L89
        L56:
            kotlin.AbstractC5774b.m5119b(r11)
            s.c r11 = new s.c
            android.content.Context r3 = r0.getApplicationContext()
            java.lang.String r7 = "getApplicationContext(...)"
            kotlin.jvm.internal.AbstractC5830k.m5329f(r3, r7)
            r11.<init>(r3)
            r11.f10820c = r9
            android.graphics.Bitmap$Config r9 = android.graphics.Bitmap.Config.ARGB_8888
            p154s.AbstractC6534h.m6185a(r11)
            s.f r9 = r11.m6182a()
            com.zykj.mistake.utils.e r11 = com.zykj.mistake.utils.C5100e.f8035a
            coil3.n r11 = r11.m4462a(r0)
            r1.L$0 = r6
            r1.L$1 = r10
            r1.L$2 = r6
            r1.label = r5
            coil3.r r11 = (coil3.C3333r) r11
            java.lang.Object r11 = r11.m2276c(r9, r1)
            if (r11 != r2) goto L89
            goto La9
        L89:
            boolean r9 = r11 instanceof p154s.C6540n
            if (r9 == 0) goto L90
            s.n r11 = (p154s.C6540n) r11
            goto L91
        L90:
            r11 = r6
        L91:
            if (r11 == 0) goto Lab
            coil3.k r9 = r11.f10904a
            android.graphics.Bitmap r9 = coil3.AbstractC3330o.m2272j(r9)
            r1.L$0 = r6
            r1.L$1 = r6
            r1.L$2 = r6
            r1.L$3 = r6
            r1.label = r4
            java.lang.Object r8 = r8.m4450f(r9, r10, r1)
            if (r8 != r2) goto Laa
        La9:
            return r2
        Laa:
            return r8
        Lab:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "Download image failed"
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.mistake.utils.C5098c.m4446b(com.zykj.mistake.utils.c, java.lang.String, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object"); // DEX body: android/错题本/smali_classes3/com/zykj/mistake/utils/c.smali:317
    }

    /* renamed from: d */
    public static File m4447d(String str, String str2) {
        File file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOCUMENTS), "MistakeAskMaterial");
        if (!file.exists()) {
            file.mkdirs();
        }
        String strReplace = new Regex("[^A-Za-z0-9_.-]").replace(str, "_");
        return new File(file, System.currentTimeMillis() + "_" + strReplace + "." + str2);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m4448c(java.lang.String r7, java.lang.String r8, kotlin.coroutines.jvm.internal.ContinuationImpl r9) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r9 instanceof com.zykj.mistake.utils.AskMaterialImageResolver$captureWebToFile$1
            if (r0 == 0) goto L13
            r0 = r9
            com.zykj.mistake.utils.AskMaterialImageResolver$captureWebToFile$1 r0 = (com.zykj.mistake.utils.AskMaterialImageResolver$captureWebToFile$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.zykj.mistake.utils.AskMaterialImageResolver$captureWebToFile$1 r0 = new com.zykj.mistake.utils.AskMaterialImageResolver$captureWebToFile$1
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L4c
            if (r2 == r4) goto L3f
            if (r2 != r3) goto L37
            java.lang.Object r7 = r0.L$2
            android.graphics.Bitmap r7 = (android.graphics.Bitmap) r7
            java.lang.Object r7 = r0.L$1
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r7 = r0.L$0
            java.lang.String r7 = (java.lang.String) r7
            kotlin.AbstractC5774b.m5119b(r9)
            return r9
        L37:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3f:
            java.lang.Object r7 = r0.L$1
            r8 = r7
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r7 = r0.L$0
            java.lang.String r7 = (java.lang.String) r7
            kotlin.AbstractC5774b.m5119b(r9)
            goto L6b
        L4c:
            kotlin.AbstractC5774b.m5119b(r9)
            boolean r9 = kotlin.text.AbstractC5855p.m5382P(r7)
            if (r9 != 0) goto L7d
            g7.e r9 = kotlinx.coroutines.AbstractC5896f0.f9343a
            d7.d r9 = p054e7.AbstractC5479k.f8471a
            com.zykj.mistake.utils.AskMaterialImageResolver$captureWebToFile$bitmap$1 r2 = new com.zykj.mistake.utils.AskMaterialImageResolver$captureWebToFile$bitmap$1
            r2.<init>(r6, r7, r5)
            r0.L$0 = r5
            r0.L$1 = r8
            r0.label = r4
            java.lang.Object r9 = kotlinx.coroutines.AbstractC6014x.m5626F(r9, r2, r0)
            if (r9 != r1) goto L6b
            goto L7b
        L6b:
            android.graphics.Bitmap r9 = (android.graphics.Bitmap) r9
            r0.L$0 = r5
            r0.L$1 = r5
            r0.L$2 = r5
            r0.label = r3
            java.lang.Object r7 = r6.m4450f(r9, r8, r0)
            if (r7 != r1) goto L7c
        L7b:
            return r1
        L7c:
            return r7
        L7d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "Web url missing"
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.mistake.utils.C5098c.m4448c(java.lang.String, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object"); // DEX body: android/错题本/smali_classes3/com/zykj/mistake/utils/c.smali:838
    }

    /* JADX WARN: Path cross not found for [B:27:0x0108, B:33:0x0125], limit reached: 123 */
    /* JADX WARN: Removed duplicated region for block: B:109:0x03da  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x012e -> B:37:0x012f). Please report as a decompilation issue!!! */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m4449e(java.util.List r37, kotlin.coroutines.jvm.internal.ContinuationImpl r38) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 991
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.mistake.utils.C5098c.m4449e(java.util.List, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object"); // DEX body: android/错题本/smali_classes3/com/zykj/mistake/utils/c.smali:1125
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m4450f(android.graphics.Bitmap r6, java.lang.String r7, kotlin.coroutines.jvm.internal.ContinuationImpl r8) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.zykj.mistake.utils.AskMaterialImageResolver$saveBitmap$1
            if (r0 == 0) goto L13
            r0 = r8
            com.zykj.mistake.utils.AskMaterialImageResolver$saveBitmap$1 r0 = (com.zykj.mistake.utils.AskMaterialImageResolver$saveBitmap$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.zykj.mistake.utils.AskMaterialImageResolver$saveBitmap$1 r0 = new com.zykj.mistake.utils.AskMaterialImageResolver$saveBitmap$1
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r6 = r0.L$1
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r6 = r0.L$0
            android.graphics.Bitmap r6 = (android.graphics.Bitmap) r6
            kotlin.AbstractC5774b.m5119b(r8)
            goto L51
        L2f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L37:
            kotlin.AbstractC5774b.m5119b(r8)
            g7.e r8 = kotlinx.coroutines.AbstractC5896f0.f9343a
            g7.d r8 = p068g7.ExecutorC5608d.f8730a
            com.zykj.mistake.utils.AskMaterialImageResolver$saveBitmap$2 r2 = new com.zykj.mistake.utils.AskMaterialImageResolver$saveBitmap$2
            r4 = 0
            r2.<init>(r5, r7, r6, r4)
            r0.L$0 = r4
            r0.L$1 = r4
            r0.label = r3
            java.lang.Object r8 = kotlinx.coroutines.AbstractC6014x.m5626F(r8, r2, r0)
            if (r8 != r1) goto L51
            return r1
        L51:
            java.lang.String r6 = "withContext(...)"
            kotlin.jvm.internal.AbstractC5830k.m5329f(r8, r6)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.mistake.utils.C5098c.m4450f(android.graphics.Bitmap, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object"); // DEX body: android/错题本/smali_classes3/com/zykj/mistake/utils/c.smali:3252
    }
}
