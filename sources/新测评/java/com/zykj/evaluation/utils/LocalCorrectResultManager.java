package com.zykj.evaluation.utils;

// RE note localCorrectResult.bin 以 JSON 保存 Map<String,Integer>。

import com.blankj.utilcode.util.FileIOUtils;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.File;
import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class LocalCorrectResultManager {

    /* renamed from: a */
    public static final LocalCorrectResultManager f10544a = new LocalCorrectResultManager();

    /* renamed from: b */
    public static final Gson f10545b = new Gson();

    /* renamed from: c */
    public static final int f10546c = 8;

    /* renamed from: a */
    public final Map m10527a(String path) {
        Intrinsics.checkNotNullParameter(path, "path");
        Map map = (Map) f10545b.fromJson(FileIOUtils.readFile2String(new File(path, "localCorrectResult.bin")), new TypeToken<Map<String, ? extends Integer>>() { // from class: com.zykj.evaluation.utils.LocalCorrectResultManager$readLocalCorrectResult$1
        }.getType());
        return map == null ? MapsKt.emptyMap() : map;
    }

    /* renamed from: b */
    public final void m10528b(Map map, String path) {
        Intrinsics.checkNotNullParameter(map, "map");
        Intrinsics.checkNotNullParameter(path, "path");
        FileIOUtils.writeFileFromString(new File(path, "localCorrectResult.bin"), f10545b.toJson(map));
    }
}
