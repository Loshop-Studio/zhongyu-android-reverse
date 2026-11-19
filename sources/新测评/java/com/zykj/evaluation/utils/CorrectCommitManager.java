package com.zykj.evaluation.utils;

// RE note Correct_NeedRevise.bin 的根节点是 NeedReviseData 数组。

import com.blankj.utilcode.util.FileIOUtils;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.File;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class CorrectCommitManager {

    /* renamed from: a */
    public static final CorrectCommitManager f10538a = new CorrectCommitManager();

    /* renamed from: b */
    public static final Gson f10539b = new Gson();

    /* renamed from: c */
    public static final int f10540c = 8;

    /* renamed from: a */
    public final List m10522a(String path) {
        Intrinsics.checkNotNullParameter(path, "path");
        List list = (List) f10539b.fromJson(FileIOUtils.readFile2String(new File(path, "Correct_NeedRevise.bin")), new TypeToken<List<? extends NeedReviseData>>() { // from class: com.zykj.evaluation.utils.CorrectCommitManager$readLocalNeedReviseData$1
        }.getType());
        return list == null ? CollectionsKt.emptyList() : list;
    }

    /* renamed from: b */
    public final void m10523b(List list, String path) {
        Intrinsics.checkNotNullParameter(list, "list");
        Intrinsics.checkNotNullParameter(path, "path");
        FileIOUtils.writeFileFromString(new File(path, "Correct_NeedRevise.bin"), f10539b.toJson(list));
    }
}
