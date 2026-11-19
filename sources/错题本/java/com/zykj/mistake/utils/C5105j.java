package com.zykj.mistake.utils;

// RE note: NoteDownloadUtils dispatches .zip and fileList.json to separate loaders. The manifest path compares file MD5, refreshing note previews on each load.

import com.zykj.blackboard.core.edit.BasePageControl;
import kotlin.text.AbstractC5862w;

/* renamed from: com.zykj.mistake.utils.j */
/* loaded from: classes3.dex */
public final class C5105j {

    /* renamed from: a */
    public static final C5105j f8047a = new C5105j();

    /* renamed from: b */
    public static boolean m4471b(String str) {
        return AbstractC5862w.m5414u(str, BasePageControl.SCREENSHOT_FILE_NAME, false) || AbstractC5862w.m5409C(str, "res/image", false);
    }

    /* JADX WARN: Path cross not found for [B:10:0x0037, B:26:0x00c0], limit reached: 93 */
    /* JADX WARN: Removed duplicated region for block: B:35:0x010f A[Catch: all -> 0x007b, TryCatch #0 {all -> 0x007b, blocks: (B:14:0x0075, B:71:0x022d, B:73:0x0231, B:75:0x0237, B:77:0x0247, B:79:0x0257, B:56:0x01b6, B:58:0x01bc, B:60:0x01d9, B:63:0x01e0, B:67:0x01ed, B:81:0x025f, B:83:0x0273, B:21:0x0098, B:51:0x016f, B:53:0x0173, B:55:0x0181, B:24:0x00bc, B:33:0x010b, B:35:0x010f, B:37:0x011d, B:27:0x00c3, B:29:0x00c9, B:38:0x0129, B:40:0x0131, B:47:0x014c, B:43:0x013c, B:46:0x0147, B:82:0x0264), top: B:95:0x0035 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x011d A[Catch: all -> 0x007b, TryCatch #0 {all -> 0x007b, blocks: (B:14:0x0075, B:71:0x022d, B:73:0x0231, B:75:0x0237, B:77:0x0247, B:79:0x0257, B:56:0x01b6, B:58:0x01bc, B:60:0x01d9, B:63:0x01e0, B:67:0x01ed, B:81:0x025f, B:83:0x0273, B:21:0x0098, B:51:0x016f, B:53:0x0173, B:55:0x0181, B:24:0x00bc, B:33:0x010b, B:35:0x010f, B:37:0x011d, B:27:0x00c3, B:29:0x00c9, B:38:0x0129, B:40:0x0131, B:47:0x014c, B:43:0x013c, B:46:0x0147, B:82:0x0264), top: B:95:0x0035 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0173 A[Catch: all -> 0x007b, TryCatch #0 {all -> 0x007b, blocks: (B:14:0x0075, B:71:0x022d, B:73:0x0231, B:75:0x0237, B:77:0x0247, B:79:0x0257, B:56:0x01b6, B:58:0x01bc, B:60:0x01d9, B:63:0x01e0, B:67:0x01ed, B:81:0x025f, B:83:0x0273, B:21:0x0098, B:51:0x016f, B:53:0x0173, B:55:0x0181, B:24:0x00bc, B:33:0x010b, B:35:0x010f, B:37:0x011d, B:27:0x00c3, B:29:0x00c9, B:38:0x0129, B:40:0x0131, B:47:0x014c, B:43:0x013c, B:46:0x0147, B:82:0x0264), top: B:95:0x0035 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0181 A[Catch: all -> 0x007b, TryCatch #0 {all -> 0x007b, blocks: (B:14:0x0075, B:71:0x022d, B:73:0x0231, B:75:0x0237, B:77:0x0247, B:79:0x0257, B:56:0x01b6, B:58:0x01bc, B:60:0x01d9, B:63:0x01e0, B:67:0x01ed, B:81:0x025f, B:83:0x0273, B:21:0x0098, B:51:0x016f, B:53:0x0173, B:55:0x0181, B:24:0x00bc, B:33:0x010b, B:35:0x010f, B:37:0x011d, B:27:0x00c3, B:29:0x00c9, B:38:0x0129, B:40:0x0131, B:47:0x014c, B:43:0x013c, B:46:0x0147, B:82:0x0264), top: B:95:0x0035 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01bc A[Catch: all -> 0x007b, TryCatch #0 {all -> 0x007b, blocks: (B:14:0x0075, B:71:0x022d, B:73:0x0231, B:75:0x0237, B:77:0x0247, B:79:0x0257, B:56:0x01b6, B:58:0x01bc, B:60:0x01d9, B:63:0x01e0, B:67:0x01ed, B:81:0x025f, B:83:0x0273, B:21:0x0098, B:51:0x016f, B:53:0x0173, B:55:0x0181, B:24:0x00bc, B:33:0x010b, B:35:0x010f, B:37:0x011d, B:27:0x00c3, B:29:0x00c9, B:38:0x0129, B:40:0x0131, B:47:0x014c, B:43:0x013c, B:46:0x0147, B:82:0x0264), top: B:95:0x0035 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x025f A[Catch: all -> 0x007b, TryCatch #0 {all -> 0x007b, blocks: (B:14:0x0075, B:71:0x022d, B:73:0x0231, B:75:0x0237, B:77:0x0247, B:79:0x0257, B:56:0x01b6, B:58:0x01bc, B:60:0x01d9, B:63:0x01e0, B:67:0x01ed, B:81:0x025f, B:83:0x0273, B:21:0x0098, B:51:0x016f, B:53:0x0173, B:55:0x0181, B:24:0x00bc, B:33:0x010b, B:35:0x010f, B:37:0x011d, B:27:0x00c3, B:29:0x00c9, B:38:0x0129, B:40:0x0131, B:47:0x014c, B:43:0x013c, B:46:0x0147, B:82:0x0264), top: B:95:0x0035 }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0295  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:66:0x01eb -> B:80:0x025c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:70:0x0228 -> B:71:0x022d). Please report as a decompilation issue!!! */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m4472a(java.lang.String r25, java.lang.String r26, p152r6.InterfaceC6474f r27, kotlin.coroutines.jvm.internal.ContinuationImpl r28) {
        /*
            Method dump skipped, instructions count: 677
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.mistake.utils.C5105j.m4472a(java.lang.String, java.lang.String, r6.f, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object"); // DEX body: android/错题本/smali_classes3/com/zykj/mistake/utils/j.smali:87
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x0183 -> B:33:0x0194). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x01c0 -> B:42:0x01c4). Please report as a decompilation issue!!! */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m4473c(java.io.File r20, java.util.ArrayList r21, java.util.ArrayList r22, java.lang.String r23, java.lang.String r24, p152r6.InterfaceC6474f r25, kotlin.coroutines.jvm.internal.ContinuationImpl r26) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 462
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.mistake.utils.C5105j.m4473c(java.io.File, java.util.ArrayList, java.util.ArrayList, java.lang.String, java.lang.String, r6.f, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object"); // DEX body: android/错题本/smali_classes3/com/zykj/mistake/utils/j.smali:1510
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /* JADX WARN: Type inference failed for: r10v0, types: [com.zykj.mistake.utils.j] */
    /* JADX WARN: Type inference failed for: r14v8, types: [r6.c] */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m4474d(java.lang.String r11, java.lang.String r12, p152r6.InterfaceC6474f r13, androidx.navigation.C2861i r14, kotlin.coroutines.jvm.internal.ContinuationImpl r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 235
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.mistake.utils.C5105j.m4474d(java.lang.String, java.lang.String, r6.f, androidx.navigation.i, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object"); // DEX body: android/错题本/smali_classes3/com/zykj/mistake/utils/j.smali:2507
    }
}
