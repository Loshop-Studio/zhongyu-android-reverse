package androidx.core.content;

import android.content.ContentValues;
import kotlin.Pair;

/* loaded from: classes2.dex */
public final class ContentValuesKt {
    public static final ContentValues contentValuesOf(Pair<String, ? extends Object>... pairArr) {
        ContentValues contentValues = new ContentValues(pairArr.length);
        for (Pair<String, ? extends Object> pair : pairArr) {
            String str = (String) pair.m20048a();
            Object objM20049c = pair.m20049c();
            if (objM20049c == null) {
                contentValues.putNull(str);
            } else if (objM20049c instanceof String) {
                contentValues.put(str, (String) objM20049c);
            } else if (objM20049c instanceof Integer) {
                contentValues.put(str, (Integer) objM20049c);
            } else if (objM20049c instanceof Long) {
                contentValues.put(str, (Long) objM20049c);
            } else if (objM20049c instanceof Boolean) {
                contentValues.put(str, (Boolean) objM20049c);
            } else if (objM20049c instanceof Float) {
                contentValues.put(str, (Float) objM20049c);
            } else if (objM20049c instanceof Double) {
                contentValues.put(str, (Double) objM20049c);
            } else if (objM20049c instanceof byte[]) {
                contentValues.put(str, (byte[]) objM20049c);
            } else if (objM20049c instanceof Byte) {
                contentValues.put(str, (Byte) objM20049c);
            } else {
                if (!(objM20049c instanceof Short)) {
                    throw new IllegalArgumentException("Illegal value type " + objM20049c.getClass().getCanonicalName() + " for key \"" + str + '\"');
                }
                contentValues.put(str, (Short) objM20049c);
            }
        }
        return contentValues;
    }
}
