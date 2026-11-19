package p263u5;

import android.graphics.Paint;
import android.util.Log;
import com.efs.sdk.base.protocol.file.section.AbsSection;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* renamed from: u5.t */
/* loaded from: classes4.dex */
public final class C9701t {

    /* renamed from: a */
    public static final C9701t f17139a = new C9701t();

    /* renamed from: a */
    public final List m16219a(String content, Paint paint, float f10) {
        int i9;
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(paint, "paint");
        ArrayList arrayList = new ArrayList();
        int length = 0;
        for (String str : StringsKt.split$default((CharSequence) content, new String[]{AbsSection.SEP_ORIGIN_LINE_BREAK}, false, 0, 6, (Object) null)) {
            float fMeasureText = paint.measureText(str);
            if (length == 0) {
                length = (int) Math.ceil((str.length() * f10) / fMeasureText);
                Log.i("TextGraphUtils", "average-> " + length);
            }
            int i10 = 0;
            while (i10 < str.length()) {
                if (length > str.length() - i10) {
                    length = str.length() - i10;
                }
                while (paint.measureText(str, i10, i10 + length) <= f10 && length < str.length() - i10) {
                    length++;
                }
                while (true) {
                    i9 = i10 + length;
                    if (paint.measureText(str, i10, i9) < f10 || length <= 1) {
                        break;
                    }
                    length--;
                }
                String strSubstring = str.substring(i10, i9);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                arrayList.add(strSubstring);
                i10 = i9;
            }
        }
        return arrayList;
    }
}
