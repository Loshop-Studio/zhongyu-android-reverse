package p077e5;

import android.graphics.Paint;
import android.util.Log;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* renamed from: e5.s */
/* loaded from: classes4.dex */
public final class C7358s {

    /* renamed from: a */
    public static final C7358s f11926a = new C7358s();

    /* renamed from: a */
    public final List m11795a(String content, Paint paint, float f10) {
        int i10;
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(paint, "paint");
        ArrayList arrayList = new ArrayList();
        int length = 0;
        for (String str : StringsKt.split$default((CharSequence) content, new String[]{SignParameters.NEW_LINE}, false, 0, 6, (Object) null)) {
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
                Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                arrayList.add(strSubstring);
                i11 = i10;
            }
        }
        return arrayList;
    }
}
