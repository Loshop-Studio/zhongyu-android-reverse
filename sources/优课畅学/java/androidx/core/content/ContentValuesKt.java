package androidx.core.content;

import android.content.ContentValues;
import kotlin.Pair;

/* loaded from: classes2.dex */
public final class ContentValuesKt {
    public static final ContentValues contentValuesOf(Pair<String, ? extends Object>... pairArr) {
        ContentValues contentValues = new ContentValues(pairArr.length);
        for (Pair<String, ? extends Object> pair : pairArr) {
            String str = (String) pair.m15903a();
            Object objM15904b = pair.m15904b();
            if (objM15904b == null) {
                contentValues.putNull(str);
            } else if (objM15904b instanceof String) {
                contentValues.put(str, (String) objM15904b);
            } else if (objM15904b instanceof Integer) {
                contentValues.put(str, (Integer) objM15904b);
            } else if (objM15904b instanceof Long) {
                contentValues.put(str, (Long) objM15904b);
            } else if (objM15904b instanceof Boolean) {
                contentValues.put(str, (Boolean) objM15904b);
            } else if (objM15904b instanceof Float) {
                contentValues.put(str, (Float) objM15904b);
            } else if (objM15904b instanceof Double) {
                contentValues.put(str, (Double) objM15904b);
            } else if (objM15904b instanceof byte[]) {
                contentValues.put(str, (byte[]) objM15904b);
            } else if (objM15904b instanceof Byte) {
                contentValues.put(str, (Byte) objM15904b);
            } else {
                if (!(objM15904b instanceof Short)) {
                    throw new IllegalArgumentException("Illegal value type " + objM15904b.getClass().getCanonicalName() + " for key \"" + str + '\"');
                }
                contentValues.put(str, (Short) objM15904b);
            }
        }
        return contentValues;
    }
}
