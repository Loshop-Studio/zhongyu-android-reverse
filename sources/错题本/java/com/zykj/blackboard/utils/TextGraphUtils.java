package com.zykj.blackboard.utils;

import android.graphics.Paint;
import android.util.Log;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.text.AbstractC5855p;
import org.jetbrains.annotations.NotNull;

@Metadata(m5109d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J$\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n¨\u0006\u000b"}, m5110d2 = {"Lcom/zykj/blackboard/utils/TextGraphUtils;", "", "()V", "calculateTextToList", "", "", "content", "paint", "Landroid/graphics/Paint;", "width", "", "blackboard_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class TextGraphUtils {

    @NotNull
    public static final TextGraphUtils INSTANCE = new TextGraphUtils();

    private TextGraphUtils() {
    }

    @NotNull
    public final List<String> calculateTextToList(@NotNull String content, @NotNull Paint paint, float width) {
        int i;
        AbstractC5830k.m5330g(content, "content");
        AbstractC5830k.m5330g(paint, "paint");
        ArrayList arrayList = new ArrayList();
        int length = 0;
        for (String str : AbstractC5855p.m5394b0(content, new String[]{SignParameters.NEW_LINE})) {
            float fMeasureText = paint.measureText(str);
            if (length == 0) {
                length = (int) Math.ceil((str.length() * width) / fMeasureText);
                Log.i("TextGraphUtils", "average-> " + length);
            }
            int i8 = 0;
            while (i8 < str.length()) {
                if (length > str.length() - i8) {
                    length = str.length() - i8;
                }
                while (paint.measureText(str, i8, i8 + length) <= width && length < str.length() - i8) {
                    length++;
                }
                while (true) {
                    i = i8 + length;
                    if (paint.measureText(str, i8, i) < width || length <= 1) {
                        break;
                    }
                    length--;
                }
                String strSubstring = str.substring(i8, i);
                AbstractC5830k.m5329f(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                arrayList.add(strSubstring);
                i8 = i;
            }
        }
        return arrayList;
    }
}
