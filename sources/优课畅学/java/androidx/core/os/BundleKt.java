package androidx.core.os;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import java.io.Serializable;
import kotlin.Pair;
import kotlin.jvm.internal.AbstractC9133u;

/* loaded from: classes2.dex */
public final class BundleKt {
    public static final Bundle bundleOf(Pair<String, ? extends Object>... pairArr) {
        Bundle bundle = new Bundle(pairArr.length);
        for (Pair<String, ? extends Object> pair : pairArr) {
            String str = (String) pair.m15903a();
            Object objM15904b = pair.m15904b();
            if (objM15904b == null) {
                bundle.putString(str, null);
            } else if (objM15904b instanceof Boolean) {
                bundle.putBoolean(str, ((Boolean) objM15904b).booleanValue());
            } else if (objM15904b instanceof Byte) {
                bundle.putByte(str, ((Number) objM15904b).byteValue());
            } else if (objM15904b instanceof Character) {
                bundle.putChar(str, ((Character) objM15904b).charValue());
            } else if (objM15904b instanceof Double) {
                bundle.putDouble(str, ((Number) objM15904b).doubleValue());
            } else if (objM15904b instanceof Float) {
                bundle.putFloat(str, ((Number) objM15904b).floatValue());
            } else if (objM15904b instanceof Integer) {
                bundle.putInt(str, ((Number) objM15904b).intValue());
            } else if (objM15904b instanceof Long) {
                bundle.putLong(str, ((Number) objM15904b).longValue());
            } else if (objM15904b instanceof Short) {
                bundle.putShort(str, ((Number) objM15904b).shortValue());
            } else if (objM15904b instanceof Bundle) {
                bundle.putBundle(str, (Bundle) objM15904b);
            } else if (objM15904b instanceof CharSequence) {
                bundle.putCharSequence(str, (CharSequence) objM15904b);
            } else if (objM15904b instanceof Parcelable) {
                bundle.putParcelable(str, (Parcelable) objM15904b);
            } else if (objM15904b instanceof boolean[]) {
                bundle.putBooleanArray(str, (boolean[]) objM15904b);
            } else if (objM15904b instanceof byte[]) {
                bundle.putByteArray(str, (byte[]) objM15904b);
            } else if (objM15904b instanceof char[]) {
                bundle.putCharArray(str, (char[]) objM15904b);
            } else if (objM15904b instanceof double[]) {
                bundle.putDoubleArray(str, (double[]) objM15904b);
            } else if (objM15904b instanceof float[]) {
                bundle.putFloatArray(str, (float[]) objM15904b);
            } else if (objM15904b instanceof int[]) {
                bundle.putIntArray(str, (int[]) objM15904b);
            } else if (objM15904b instanceof long[]) {
                bundle.putLongArray(str, (long[]) objM15904b);
            } else if (objM15904b instanceof short[]) {
                bundle.putShortArray(str, (short[]) objM15904b);
            } else if (objM15904b instanceof Object[]) {
                Class<?> componentType = objM15904b.getClass().getComponentType();
                AbstractC9133u.m16130d(componentType);
                if (Parcelable.class.isAssignableFrom(componentType)) {
                    AbstractC9133u.m16131e(objM15904b, "null cannot be cast to non-null type kotlin.Array<android.os.Parcelable>");
                    bundle.putParcelableArray(str, (Parcelable[]) objM15904b);
                } else if (String.class.isAssignableFrom(componentType)) {
                    AbstractC9133u.m16131e(objM15904b, "null cannot be cast to non-null type kotlin.Array<kotlin.String>");
                    bundle.putStringArray(str, (String[]) objM15904b);
                } else if (CharSequence.class.isAssignableFrom(componentType)) {
                    AbstractC9133u.m16131e(objM15904b, "null cannot be cast to non-null type kotlin.Array<kotlin.CharSequence>");
                    bundle.putCharSequenceArray(str, (CharSequence[]) objM15904b);
                } else {
                    if (!Serializable.class.isAssignableFrom(componentType)) {
                        throw new IllegalArgumentException("Illegal value array type " + componentType.getCanonicalName() + " for key \"" + str + '\"');
                    }
                    bundle.putSerializable(str, (Serializable) objM15904b);
                }
            } else if (objM15904b instanceof Serializable) {
                bundle.putSerializable(str, (Serializable) objM15904b);
            } else if (objM15904b instanceof IBinder) {
                bundle.putBinder(str, (IBinder) objM15904b);
            } else if (objM15904b instanceof Size) {
                BundleApi21ImplKt.putSize(bundle, str, (Size) objM15904b);
            } else {
                if (!(objM15904b instanceof SizeF)) {
                    throw new IllegalArgumentException("Illegal value type " + objM15904b.getClass().getCanonicalName() + " for key \"" + str + '\"');
                }
                BundleApi21ImplKt.putSizeF(bundle, str, (SizeF) objM15904b);
            }
        }
        return bundle;
    }

    public static final Bundle bundleOf() {
        return new Bundle(0);
    }
}
