package p027b8;

import com.zykj.view.EzySimpleBoardData;
import com.zykj.view.utils.ProtoPath;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: b8.t */
/* loaded from: classes5.dex */
public final class C5063t {

    /* renamed from: a */
    public static final C5063t f2628a = new C5063t();

    /* renamed from: a */
    public final void m2575a(String str, EzySimpleBoardData.SimpleBoardData simpleBoardData) throws Throwable {
        FileOutputStream fileOutputStream;
        File parentFile;
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                try {
                    File file = new File(str);
                    File parentFile2 = file.getParentFile();
                    if (parentFile2 != null && !parentFile2.exists() && (parentFile = file.getParentFile()) != null) {
                        parentFile.mkdirs();
                    }
                    if (file.exists()) {
                        file.delete();
                    }
                    file.createNewFile();
                    fileOutputStream = new FileOutputStream(file);
                } catch (Exception e10) {
                    e = e10;
                }
            } catch (Throwable th) {
                th = th;
            }
            try {
                simpleBoardData.writeTo(fileOutputStream);
                fileOutputStream.close();
            } catch (Exception e11) {
                fileOutputStream2 = fileOutputStream;
                e = e11;
                e.printStackTrace();
                if (fileOutputStream2 != null) {
                    fileOutputStream2.close();
                }
            } catch (Throwable th2) {
                fileOutputStream2 = fileOutputStream;
                th = th2;
                if (fileOutputStream2 != null) {
                    try {
                        fileOutputStream2.close();
                    } catch (IOException e12) {
                        e12.printStackTrace();
                    }
                }
                throw th;
            }
        } catch (IOException e13) {
            e13.printStackTrace();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0067 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List m2576b(java.lang.String r5) throws java.lang.Throwable {
        /*
            r4 = this;
            java.lang.String r0 = "fileAbsolutePath"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            r0 = 0
            java.io.File r1 = new java.io.File     // Catch: java.lang.Throwable -> L4a java.lang.Exception -> L4f
            r1.<init>(r5)     // Catch: java.lang.Throwable -> L4a java.lang.Exception -> L4f
            java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L4a java.lang.Exception -> L4f
            r5.<init>(r1)     // Catch: java.lang.Throwable -> L4a java.lang.Exception -> L4f
            com.zykj.view.EzySimpleBoardData$SimpleBoardData r0 = com.zykj.view.EzySimpleBoardData.SimpleBoardData.parseFrom(r5)     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L3f
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L3f
            r1.<init>()     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L3f
            java.util.List r0 = r0.getPathList()     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L3f
            java.lang.String r2 = "getPathList(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r2)     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L3f
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L3f
        L26:
            boolean r2 = r0.hasNext()     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L3f
            if (r2 == 0) goto L41
            java.lang.Object r2 = r0.next()     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L3f
            com.zykj.view.EzySimpleBoardData$Path r2 = (com.zykj.view.EzySimpleBoardData.Path) r2     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L3f
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L3f
            com.zykj.view.utils.ProtoPath r2 = p027b8.AbstractC5064u.m2581d(r2)     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L3f
            r1.add(r2)     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L3f
            goto L26
        L3d:
            r0 = move-exception
            goto L65
        L3f:
            r0 = move-exception
            goto L53
        L41:
            r5.close()     // Catch: java.io.IOException -> L45
            return r1
        L45:
            r5 = move-exception
            r5.printStackTrace()
            return r1
        L4a:
            r5 = move-exception
            r3 = r0
            r0 = r5
            r5 = r3
            goto L65
        L4f:
            r5 = move-exception
            r3 = r0
            r0 = r5
            r5 = r3
        L53:
            r0.printStackTrace()     // Catch: java.lang.Throwable -> L3d
            if (r5 == 0) goto L60
            r5.close()     // Catch: java.io.IOException -> L5c
            goto L60
        L5c:
            r5 = move-exception
            r5.printStackTrace()
        L60:
            java.util.List r5 = kotlin.collections.CollectionsKt.emptyList()
            return r5
        L65:
            if (r5 == 0) goto L6f
            r5.close()     // Catch: java.io.IOException -> L6b
            goto L6f
        L6b:
            r5 = move-exception
            r5.printStackTrace()
        L6f:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p027b8.C5063t.m2576b(java.lang.String):java.util.List");
    }

    /* renamed from: c */
    public final void m2577c(List pathList, String fileAbsolutePath) throws Throwable {
        Intrinsics.checkNotNullParameter(pathList, "pathList");
        Intrinsics.checkNotNullParameter(fileAbsolutePath, "fileAbsolutePath");
        EzySimpleBoardData.SimpleBoardData.Builder builderNewBuilder = EzySimpleBoardData.SimpleBoardData.newBuilder();
        Iterator it = pathList.iterator();
        while (it.hasNext()) {
            builderNewBuilder.addPath(AbstractC5064u.m2580c((ProtoPath) it.next()));
        }
        EzySimpleBoardData.SimpleBoardData simpleBoardDataBuild = builderNewBuilder.build();
        Intrinsics.checkNotNullExpressionValue(simpleBoardDataBuild, "build(...)");
        m2575a(fileAbsolutePath, simpleBoardDataBuild);
    }
}
