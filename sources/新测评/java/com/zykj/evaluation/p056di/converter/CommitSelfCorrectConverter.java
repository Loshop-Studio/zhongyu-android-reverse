package com.zykj.evaluation.p056di.converter;

// RE note 本类字节码直接引用的读写或显示接口包括JSON。

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.zykj.evaluation.bean.CommitSelfCorrectReq;
import java.util.List;

/* loaded from: classes4.dex */
public final class CommitSelfCorrectConverter {
    /* renamed from: a */
    public final String m8690a(List list) {
        if (list != null) {
            return new Gson().toJson(list);
        }
        return null;
    }

    /* renamed from: b */
    public final List m8691b(String str) {
        if (str != null) {
            return (List) new Gson().fromJson(str, new TypeToken<List<? extends CommitSelfCorrectReq>>() { // from class: com.zykj.evaluation.di.converter.CommitSelfCorrectConverter$stringToCommitSelfCorrectReqList$1$1
            }.getType());
        }
        return null;
    }
}
