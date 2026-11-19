package com.zykj.view.utils;

// RE note 用 SimpleBoardData 读取和保存路径列表，坐标与画笔在各 Path 中。

import androidx.constraintlayout.widget.ConstraintLayout;
import com.zykj.view.EzySimpleBoardData;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(m5109d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u0010\u001a\u00020\b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m5110d2 = {"Lcom/zykj/view/utils/ProtoFileUtils;", "", "<init>", "()V", "", "fileAbsolutePath", "Lcom/zykj/view/EzySimpleBoardData$SimpleBoardData;", "data", "Ld6/s;", "createSimpleBoardDataFile", "(Ljava/lang/String;Lcom/zykj/view/EzySimpleBoardData$SimpleBoardData;)V", "", "Lcom/zykj/view/utils/ProtoPath;", "loadDataToList", "(Ljava/lang/String;)Ljava/util/List;", "pathList", "saveListToFile", "(Ljava/util/List;Ljava/lang/String;)V", "view_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nProtoFileUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProtoFileUtils.kt\ncom/zykj/view/utils/ProtoFileUtils\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,159:1\n1869#2,2:160\n1869#2,2:162\n*S KotlinDebug\n*F\n+ 1 ProtoFileUtils.kt\ncom/zykj/view/utils/ProtoFileUtils\n*L\n107#1:160,2\n130#1:162,2\n*E\n"})
/* loaded from: classes3.dex */
public final class ProtoFileUtils {

    @NotNull
    public static final ProtoFileUtils INSTANCE = new ProtoFileUtils();

    private ProtoFileUtils() {
    }

    private final void createSimpleBoardDataFile(String fileAbsolutePath, EzySimpleBoardData.SimpleBoardData data) throws Throwable {
        FileOutputStream fileOutputStream;
        File parentFile;
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                try {
                    File file = new File(fileAbsolutePath);
                    File parentFile2 = file.getParentFile();
                    if (parentFile2 != null && !parentFile2.exists() && (parentFile = file.getParentFile()) != null) {
                        parentFile.mkdirs();
                    }
                    if (file.exists()) {
                        file.delete();
                    }
                    file.createNewFile();
                    fileOutputStream = new FileOutputStream(file);
                } catch (Exception e) {
                    e = e;
                }
            } catch (Throwable th) {
                th = th;
            }
            try {
                data.writeTo(fileOutputStream);
                fileOutputStream.close();
            } catch (Exception e4) {
                fileOutputStream2 = fileOutputStream;
                e = e4;
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
                    } catch (IOException e8) {
                        e8.printStackTrace();
                    }
                }
                throw th;
            }
        } catch (IOException e9) {
            e9.printStackTrace();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0065 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<com.zykj.view.utils.ProtoPath> loadDataToList(@org.jetbrains.annotations.NotNull java.lang.String r5) {
        /*
            r4 = this;
            java.lang.String r0 = "fileAbsolutePath"
            kotlin.jvm.internal.AbstractC5830k.m5330g(r5, r0)
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
            kotlin.jvm.internal.AbstractC5830k.m5329f(r0, r2)     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L3f
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L3f
        L26:
            boolean r2 = r0.hasNext()     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L3f
            if (r2 == 0) goto L41
            java.lang.Object r2 = r0.next()     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L3f
            com.zykj.view.EzySimpleBoardData$Path r2 = (com.zykj.view.EzySimpleBoardData.Path) r2     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L3f
            kotlin.jvm.internal.AbstractC5830k.m5327d(r2)     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L3f
            com.zykj.view.utils.ProtoPath r2 = com.zykj.view.utils.ProtoFileUtilsKt.convertToProtoPath(r2)     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L3f
            r1.add(r2)     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L3f
            goto L26
        L3d:
            r0 = move-exception
            goto L63
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
            goto L63
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
            kotlin.collections.EmptyList r5 = kotlin.collections.EmptyList.INSTANCE
            return r5
        L63:
            if (r5 == 0) goto L6d
            r5.close()     // Catch: java.io.IOException -> L69
            goto L6d
        L69:
            r5 = move-exception
            r5.printStackTrace()
        L6d:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.view.utils.ProtoFileUtils.loadDataToList(java.lang.String):java.util.List"); // DEX body: android/错题本/smali_classes3/com/zykj/view/utils/ProtoFileUtils.smali:306
    }

    public final void saveListToFile(@NotNull List<ProtoPath> pathList, @NotNull String fileAbsolutePath) {
        AbstractC5830k.m5330g(pathList, "pathList");
        AbstractC5830k.m5330g(fileAbsolutePath, "fileAbsolutePath");
        EzySimpleBoardData.SimpleBoardData.Builder builderNewBuilder = EzySimpleBoardData.SimpleBoardData.newBuilder();
        Iterator<T> it = pathList.iterator();
        while (it.hasNext()) {
            builderNewBuilder.addPath(ProtoFileUtilsKt.convertToProtoPath((ProtoPath) it.next()));
        }
        EzySimpleBoardData.SimpleBoardData simpleBoardDataBuild = builderNewBuilder.build();
        AbstractC5830k.m5329f(simpleBoardDataBuild, "build(...)");
        createSimpleBoardDataFile(fileAbsolutePath, simpleBoardDataBuild);
    }
}
