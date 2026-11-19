package androidx.core.os;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import java.io.Serializable;
import kotlin.Pair;
import kotlin.jvm.internal.AbstractC9979u;

/* loaded from: classes2.dex */
public final class BundleKt {
    public static final Bundle bundleOf(Pair<String, ? extends Object>... pairArr) {
        Bundle bundle = new Bundle(pairArr.length);
        for (Pair<String, ? extends Object> pair : pairArr) {
            String str = (String) pair.m20048a();
            Object objM20049c = pair.m20049c();
            if (objM20049c == null) {
                bundle.putString(str, null);
            } else if (objM20049c instanceof Boolean) {
                bundle.putBoolean(str, ((Boolean) objM20049c).booleanValue());
            } else if (objM20049c instanceof Byte) {
                bundle.putByte(str, ((Number) objM20049c).byteValue());
            } else if (objM20049c instanceof Character) {
                bundle.putChar(str, ((Character) objM20049c).charValue());
            } else if (objM20049c instanceof Double) {
                bundle.putDouble(str, ((Number) objM20049c).doubleValue());
            } else if (objM20049c instanceof Float) {
                bundle.putFloat(str, ((Number) objM20049c).floatValue());
            } else if (objM20049c instanceof Integer) {
                bundle.putInt(str, ((Number) objM20049c).intValue());
            } else if (objM20049c instanceof Long) {
                bundle.putLong(str, ((Number) objM20049c).longValue());
            } else if (objM20049c instanceof Short) {
                bundle.putShort(str, ((Number) objM20049c).shortValue());
            } else if (objM20049c instanceof Bundle) {
                bundle.putBundle(str, (Bundle) objM20049c);
            } else if (objM20049c instanceof CharSequence) {
                bundle.putCharSequence(str, (CharSequence) objM20049c);
            } else if (objM20049c instanceof Parcelable) {
                bundle.putParcelable(str, (Parcelable) objM20049c);
            } else if (objM20049c instanceof boolean[]) {
                bundle.putBooleanArray(str, (boolean[]) objM20049c);
            } else if (objM20049c instanceof byte[]) {
                bundle.putByteArray(str, (byte[]) objM20049c);
            } else if (objM20049c instanceof char[]) {
                bundle.putCharArray(str, (char[]) objM20049c);
            } else if (objM20049c instanceof double[]) {
                bundle.putDoubleArray(str, (double[]) objM20049c);
            } else if (objM20049c instanceof float[]) {
                bundle.putFloatArray(str, (float[]) objM20049c);
            } else if (objM20049c instanceof int[]) {
                bundle.putIntArray(str, (int[]) objM20049c);
            } else if (objM20049c instanceof long[]) {
                bundle.putLongArray(str, (long[]) objM20049c);
            } else if (objM20049c instanceof short[]) {
                bundle.putShortArray(str, (short[]) objM20049c);
            } else if (objM20049c instanceof Object[]) {
                Class<?> componentType = objM20049c.getClass().getComponentType();
                AbstractC9979u.m20291d(componentType);
                if (Parcelable.class.isAssignableFrom(componentType)) {
                    AbstractC9979u.m20292e(objM20049c, "null cannot be cast to non-null type kotlin.Array<android.os.Parcelable>");
                    bundle.putParcelableArray(str, (Parcelable[]) objM20049c);
                } else if (String.class.isAssignableFrom(componentType)) {
                    AbstractC9979u.m20292e(objM20049c, "null cannot be cast to non-null type kotlin.Array<kotlin.String>");
                    bundle.putStringArray(str, (String[]) objM20049c);
                } else if (CharSequence.class.isAssignableFrom(componentType)) {
                    AbstractC9979u.m20292e(objM20049c, "null cannot be cast to non-null type kotlin.Array<kotlin.CharSequence>");
                    bundle.putCharSequenceArray(str, (CharSequence[]) objM20049c);
                } else {
                    if (!Serializable.class.isAssignableFrom(componentType)) {
                        throw new IllegalArgumentException("Illegal value array type " + componentType.getCanonicalName() + " for key \"" + str + '\"');
                    }
                    bundle.putSerializable(str, (Serializable) objM20049c);
                }
            } else if (objM20049c instanceof Serializable) {
                bundle.putSerializable(str, (Serializable) objM20049c);
            } else if (objM20049c instanceof IBinder) {
                bundle.putBinder(str, (IBinder) objM20049c);
            } else if (objM20049c instanceof Size) {
                BundleApi21ImplKt.putSize(bundle, str, (Size) objM20049c);
            } else {
                if (!(objM20049c instanceof SizeF)) {
                    throw new IllegalArgumentException("Illegal value type " + objM20049c.getClass().getCanonicalName() + " for key \"" + str + '\"');
                }
                BundleApi21ImplKt.putSizeF(bundle, str, (SizeF) objM20049c);
            }
        }
        return bundle;
    }

    public static final Bundle bundleOf() {
        return new Bundle(0);
    }
}
