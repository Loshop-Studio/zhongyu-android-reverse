package com.friday.common.helper;

import android.app.Activity;
import com.alibaba.android.arouter.launcher.ARouter;
import com.friday.common.entity.FromPage;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC9979u;

/* renamed from: com.friday.common.helper.c */
/* loaded from: classes3.dex */
public final class C5963c {

    /* renamed from: a */
    public static final C5963c f6084a = new C5963c();

    /* renamed from: b */
    public static /* synthetic */ void m5300b(C5963c c5963c, Activity activity, String str, String str2, boolean z10, ArrayList arrayList, boolean z11, boolean z12, ArrayList arrayList2, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            str2 = "";
        }
        c5963c.m5307a(activity, str, str2, (i10 & 8) != 0 ? false : z10, (i10 & 16) != 0 ? new ArrayList() : arrayList, (i10 & 32) != 0 ? false : z11, (i10 & 64) != 0 ? false : z12, (i10 & 128) != 0 ? new ArrayList() : arrayList2);
    }

    /* renamed from: e */
    public static /* synthetic */ void m5301e(C5963c c5963c, String str, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        c5963c.m5309d(str, z10);
    }

    /* renamed from: h */
    public static /* synthetic */ void m5302h(C5963c c5963c, String str, String str2, String str3, FromPage fromPage, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            fromPage = FromPage.NONE;
        }
        c5963c.m5311g(str, str2, str3, fromPage);
    }

    /* renamed from: j */
    public static /* synthetic */ void m5303j(C5963c c5963c, String str, String str2, String str3, FromPage fromPage, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            fromPage = FromPage.NONE;
        }
        c5963c.m5312i(str, str2, str3, fromPage);
    }

    /* renamed from: l */
    public static /* synthetic */ void m5304l(C5963c c5963c, String str, boolean z10, boolean z11, boolean z12, String str2, int i10, Object obj) {
        if ((i10 & 16) != 0) {
            str2 = "";
        }
        c5963c.m5313k(str, z10, z11, z12, str2);
    }

    /* renamed from: q */
    public static /* synthetic */ void m5305q(C5963c c5963c, String str, String str2, String str3, FromPage fromPage, String str4, boolean z10, String str5, int i10, Object obj) {
        String str6;
        C5963c c5963c2;
        String str7;
        String str8;
        String str9;
        if ((i10 & 8) != 0) {
            fromPage = FromPage.NONE;
        }
        FromPage fromPage2 = fromPage;
        String str10 = (i10 & 16) != 0 ? "" : str4;
        if ((i10 & 32) != 0) {
            z10 = !C5962b.f6082a.m5299a().m5294v();
        }
        boolean z11 = z10;
        if ((i10 & 64) != 0) {
            str6 = "";
            str7 = str;
            str8 = str2;
            str9 = str3;
            c5963c2 = c5963c;
        } else {
            str6 = str5;
            c5963c2 = c5963c;
            str7 = str;
            str8 = str2;
            str9 = str3;
        }
        c5963c2.m5317p(str7, str8, str9, fromPage2, str10, z11, str6);
    }

    /* renamed from: s */
    public static /* synthetic */ void m5306s(C5963c c5963c, String str, String str2, boolean z10, String str3, long j10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        boolean z11 = z10;
        if ((i10 & 8) != 0) {
            str3 = "";
        }
        String str4 = str3;
        if ((i10 & 16) != 0) {
            j10 = 0;
        }
        c5963c.m5318r(str, str2, z11, str4, j10);
    }

    /* renamed from: a */
    public final void m5307a(Activity context, String parentId, String fileId, boolean z10, ArrayList resourceList, boolean z11, boolean z12, ArrayList fileIdList) {
        AbstractC9979u.m20294g(context, "context");
        AbstractC9979u.m20294g(parentId, "parentId");
        AbstractC9979u.m20294g(fileId, "fileId");
        AbstractC9979u.m20294g(resourceList, "resourceList");
        AbstractC9979u.m20294g(fileIdList, "fileIdList");
        ARouter.getInstance().build("/main/FolderMoveActivity").withString("parentId", parentId).withString("fileId", fileId).withStringArrayList("fileIdList", fileIdList).withBoolean("isNoteCopy", z10).withBoolean("isNewNote", z11).withParcelableArrayList("resourceList", resourceList).withBoolean("restoreFile", z12).navigation(context);
    }

    /* renamed from: c */
    public final void m5308c() {
        ARouter.getInstance().build("/main/HomeActivity").navigation();
    }

    /* renamed from: d */
    public final void m5309d(String imageUrl, boolean z10) {
        AbstractC9979u.m20294g(imageUrl, "imageUrl");
        ARouter.getInstance().build("/document/IMAGE_PREVIEW_ACTIVITY").withString("imageUrl", imageUrl).withBoolean("isStudentShare", z10).navigation();
    }

    /* renamed from: f */
    public final void m5310f() {
        ARouter.getInstance().build("/login/LoginActivity").navigation();
    }

    /* renamed from: g */
    public final void m5311g(String fileId, String parentId, String fileName, FromPage fromPage) {
        AbstractC9979u.m20294g(fileId, "fileId");
        AbstractC9979u.m20294g(parentId, "parentId");
        AbstractC9979u.m20294g(fileName, "fileName");
        AbstractC9979u.m20294g(fromPage, "fromPage");
        ARouter.getInstance().build("/paint/NewNoteActivity").withString("fileId", fileId).withString("parentId", parentId).withString("fileName", fileName).withString("fromPage", fromPage.name()).navigation();
    }

    /* renamed from: i */
    public final void m5312i(String fileId, String parentId, String fileName, FromPage fromPage) {
        AbstractC9979u.m20294g(fileId, "fileId");
        AbstractC9979u.m20294g(parentId, "parentId");
        AbstractC9979u.m20294g(fileName, "fileName");
        AbstractC9979u.m20294g(fromPage, "fromPage");
        ARouter.getInstance().build("/paint/NoteActivity").withString("fileId", fileId).withString("parentId", parentId).withString("fileName", fileName).withString("fromPage", fromPage.name()).navigation();
    }

    /* renamed from: k */
    public final void m5313k(String fileId, boolean z10, boolean z11, boolean z12, String shareTime) {
        AbstractC9979u.m20294g(fileId, "fileId");
        AbstractC9979u.m20294g(shareTime, "shareTime");
        ARouter.getInstance().build("/main/NotePreviewActivity").withString("fileId", fileId).withBoolean("isSearchPage", z10).withBoolean("canEdit", z11).withString("shareTime", shareTime).withBoolean("isVersion6", z12).navigation();
    }

    /* renamed from: m */
    public final void m5314m(String filePath) {
        AbstractC9979u.m20294g(filePath, "filePath");
        ARouter.getInstance().build("/document/PdfViewerActivity").withString("filePath", filePath).navigation();
    }

    /* renamed from: n */
    public final void m5315n() {
        ARouter.getInstance().build("/main/SearchActivity").navigation();
    }

    /* renamed from: o */
    public final void m5316o() {
        ARouter.getInstance().build("/document/ShareSearchActivity").navigation();
    }

    /* renamed from: p */
    public final void m5317p(String str, String parentId, String fileName, FromPage fromPage, String shareTime, boolean z10, String txtFilePath) {
        AbstractC9979u.m20294g(parentId, "parentId");
        AbstractC9979u.m20294g(fileName, "fileName");
        AbstractC9979u.m20294g(fromPage, "fromPage");
        AbstractC9979u.m20294g(shareTime, "shareTime");
        AbstractC9979u.m20294g(txtFilePath, "txtFilePath");
        ARouter.getInstance().build("/document/TxtEditActivity").withString("noteId", str).withString("parentId", parentId).withString("fileName", fileName).withString("txt", fileName).withString("shareTime", shareTime).withBoolean("canEdit", z10).withString("fromPage", fromPage.name()).withString("txtFilePath", txtFilePath).navigation();
    }

    /* renamed from: r */
    public final void m5318r(String title, String url, boolean z10, String fileId, long j10) {
        AbstractC9979u.m20294g(title, "title");
        AbstractC9979u.m20294g(url, "url");
        AbstractC9979u.m20294g(fileId, "fileId");
        ARouter.getInstance().build("/document/VideoPlayerActivity").withString("title", title).withString("url", url).withString("fileId", fileId).withLong("seekOnStart", j10).withBoolean("isStudentShare", z10).navigation();
    }

    /* renamed from: t */
    public final void m5319t(String localUrl) {
        AbstractC9979u.m20294g(localUrl, "localUrl");
        ARouter.getInstance().build("/document/MICRO_CLASS_ACTIVITY").withString("localUrl", localUrl).navigation();
    }

    /* renamed from: u */
    public final void m5320u() {
        ARouter.getInstance().build("/document/TeacherOnlyActivity").navigation();
    }
}
