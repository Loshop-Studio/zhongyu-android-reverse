package com.zykj.evaluation.p056di.converter;

// RE note 本类字节码直接引用的读写或显示接口包括JSON。

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.zykj.evaluation.bean.UploadData;
import java.util.List;
import kotlin.text.StringsKt;

/* loaded from: classes4.dex */
public final class UploadDataConverter {
    /* renamed from: a */
    public final UploadData m8694a(String str) {
        String strReplace$default;
        if (str == null) {
            return null;
        }
        if (StringsKt.contains$default((CharSequence) str, (CharSequence) "\"a\":", false, 2, (Object) null) && StringsKt.contains$default((CharSequence) str, (CharSequence) "\"b\":", false, 2, (Object) null)) {
            String strReplace$default2 = StringsKt.replace$default(StringsKt.replace$default(str, "\"a\":", "\"uuid\":", false, 4, (Object) null), "\"b\":", "\"localPath\":", false, 4, (Object) null);
            strReplace$default = StringsKt.contains$default((CharSequence) strReplace$default2, (CharSequence) "\"e\":", false, 2, (Object) null) ? StringsKt.replace$default(StringsKt.replace$default(strReplace$default2, "\"d\":", "\"uploadUrl\":", false, 4, (Object) null), "\"e\":", "\"commitState\":", false, 4, (Object) null) : StringsKt.replace$default(StringsKt.replace$default(strReplace$default2, "\"c\":", "\"uploadUrl\":", false, 4, (Object) null), "\"d\":", "\"commitState\":", false, 4, (Object) null);
        } else {
            strReplace$default = str;
        }
        return (UploadData) new Gson().fromJson(strReplace$default, UploadData.class);
    }

    /* renamed from: b */
    public final List m8695b(String str) {
        String strReplace$default;
        if (str == null) {
            return null;
        }
        if (StringsKt.contains$default((CharSequence) str, (CharSequence) "\"a\":", false, 2, (Object) null) && StringsKt.contains$default((CharSequence) str, (CharSequence) "\"b\":", false, 2, (Object) null)) {
            String strReplace$default2 = StringsKt.replace$default(StringsKt.replace$default(str, "\"a\":", "\"uuid\":", false, 4, (Object) null), "\"b\":", "\"localPath\":", false, 4, (Object) null);
            strReplace$default = StringsKt.contains$default((CharSequence) strReplace$default2, (CharSequence) "\"e\":", false, 2, (Object) null) ? StringsKt.replace$default(StringsKt.replace$default(strReplace$default2, "\"d\":", "\"uploadUrl\":", false, 4, (Object) null), "\"e\":", "\"commitState\":", false, 4, (Object) null) : StringsKt.replace$default(StringsKt.replace$default(strReplace$default2, "\"c\":", "\"uploadUrl\":", false, 4, (Object) null), "\"d\":", "\"commitState\":", false, 4, (Object) null);
        } else {
            strReplace$default = str;
        }
        return (List) new Gson().fromJson(strReplace$default, new TypeToken<List<? extends UploadData>>() { // from class: com.zykj.evaluation.di.converter.UploadDataConverter$stringToUploadDataList$1
        }.getType());
    }

    /* renamed from: c */
    public final String m8696c(List list) {
        if (list != null) {
            return new Gson().toJson(list);
        }
        return null;
    }

    /* renamed from: d */
    public final String m8697d(UploadData uploadData) {
        if (uploadData != null) {
            return new Gson().toJson(uploadData);
        }
        return null;
    }
}
