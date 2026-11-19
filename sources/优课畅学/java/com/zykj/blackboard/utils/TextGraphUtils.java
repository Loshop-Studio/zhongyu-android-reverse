package com.zykj.blackboard.utils;

import android.graphics.Paint;
import android.util.Log;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC9133u;
import p113g8.AbstractC8661c0;

/* loaded from: classes4.dex */
public final class TextGraphUtils {
    public static final TextGraphUtils INSTANCE = new TextGraphUtils();

    private TextGraphUtils() {
    }

    public final List<String> calculateTextToList(String content, Paint paint, float f10) {
        int i10;
        AbstractC9133u.m16133g(content, "content");
        AbstractC9133u.m16133g(paint, "paint");
        ArrayList arrayList = new ArrayList();
        int length = 0;
        for (String str : AbstractC8661c0.m13958I0(content, new String[]{SignParameters.NEW_LINE}, false, 0, 6, null)) {
            float fMeasureText = paint.measureText(str);
            if (length == 0) {
                length = (int) Math.ceil((str.length() * f10) / fMeasureText);
                Log.i("TextGraphUtils", "average-> " + length);
            }
            int i11 = 0;
            while (i11 < str.length()) {
                if (length > str.length() - i11) {
                    length = str.length() - i11;
                }
                while (paint.measureText(str, i11, i11 + length) <= f10 && length < str.length() - i11) {
                    length++;
                }
                while (true) {
                    i10 = i11 + length;
                    if (paint.measureText(str, i11, i10) < f10 || length <= 1) {
                        break;
                    }
                    length--;
                }
                String strSubstring = str.substring(i11, i10);
                AbstractC9133u.m16132f(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                arrayList.add(strSubstring);
                i11 = i10;
            }
        }
        return arrayList;
    }
}
