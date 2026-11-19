package na;

import android.graphics.Paint;
import android.util.Log;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC9979u;
import p310qd.AbstractC10793c0;

/* renamed from: na.t */
/* loaded from: classes5.dex */
public final class C10357t {

    /* renamed from: a */
    public static final C10357t f24666a = new C10357t();

    /* renamed from: a */
    public final List m21684a(String content, Paint paint, float f10) {
        int i10;
        AbstractC9979u.m20294g(content, "content");
        AbstractC9979u.m20294g(paint, "paint");
        ArrayList arrayList = new ArrayList();
        int length = 0;
        for (String str : AbstractC10793c0.m23091I0(content, new String[]{SignParameters.NEW_LINE}, false, 0, 6, null)) {
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
                AbstractC9979u.m20293f(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                arrayList.add(strSubstring);
                i11 = i10;
            }
        }
        return arrayList;
    }
}
