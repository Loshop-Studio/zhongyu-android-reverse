package com.zykj.evaluation.p056di.converter;

// RE note 本类字节码直接引用的读写或显示接口包括JSON。

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.zykj.evaluation.bean.CommitTaskAnswer;
import java.util.List;

/* loaded from: classes4.dex */
public final class CommitTaskAnswerConverter {
    /* renamed from: a */
    public final List m8692a(String str) {
        if (str != null) {
            return (List) new Gson().fromJson(str, new TypeToken<List<? extends CommitTaskAnswer>>() { // from class: com.zykj.evaluation.di.converter.CommitTaskAnswerConverter$stringToUploadDataList$1$1
            }.getType());
        }
        return null;
    }

    /* renamed from: b */
    public final String m8693b(List list) {
        if (list != null) {
            return new Gson().toJson(list);
        }
        return null;
    }
}
