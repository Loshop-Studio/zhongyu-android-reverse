package com.zykj.evaluation.utils;

// RE note 读取和写入 localAnswer.bin。Gson TypeToken 为 Map<String,List<String>>。

import com.blankj.utilcode.util.FileIOUtils;
import com.blankj.utilcode.util.FileUtils;
import com.blankj.utilcode.util.LogUtils;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.File;
import java.util.List;
import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class LocalAnswerManager {

    /* renamed from: a */
    public static final LocalAnswerManager f10541a = new LocalAnswerManager();

    /* renamed from: b */
    public static final Gson f10542b = new Gson();

    /* renamed from: c */
    public static final int f10543c = 8;

    /* renamed from: a */
    public final void m10524a(String path) {
        Intrinsics.checkNotNullParameter(path, "path");
        FileUtils.delete(new File(path, "localAnswer.bin"));
    }

    /* renamed from: b */
    public final Map m10525b(String path) {
        Intrinsics.checkNotNullParameter(path, "path");
        try {
            Map map = (Map) f10542b.fromJson(FileIOUtils.readFile2String(new File(path, "localAnswer.bin")), new TypeToken<Map<String, ? extends List<? extends String>>>() { // from class: com.zykj.evaluation.utils.LocalAnswerManager$readLocalAnswer$1
            }.getType());
            return map == null ? MapsKt.emptyMap() : map;
        } catch (Exception e10) {
            LogUtils.m3238e("readLocalAnswer页面JSON解析失败: " + e10.getMessage() + ",原始数据: " + path);
            return MapsKt.emptyMap();
        }
    }

    /* renamed from: c */
    public final void m10526c(Map map, String path) {
        Intrinsics.checkNotNullParameter(map, "map");
        Intrinsics.checkNotNullParameter(path, "path");
        FileIOUtils.writeFileFromString(new File(path, "localAnswer.bin"), f10542b.toJson(map));
    }
}
