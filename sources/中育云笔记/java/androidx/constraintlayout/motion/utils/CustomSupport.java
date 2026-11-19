package androidx.constraintlayout.motion.utils;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;
import androidx.constraintlayout.motion.widget.Debug;
import androidx.constraintlayout.widget.ConstraintAttribute;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes2.dex */
public class CustomSupport {
    private static final boolean DEBUG = false;
    private static final String TAG = "CustomSupport";

    /* renamed from: androidx.constraintlayout.motion.utils.CustomSupport$1 */
    public static /* synthetic */ class C32491 {

        /* renamed from: $SwitchMap$androidx$constraintlayout$widget$ConstraintAttribute$AttributeType */
        static final /* synthetic */ int[] f1328x66adad53;

        static {
            int[] iArr = new int[ConstraintAttribute.AttributeType.values().length];
            f1328x66adad53 = iArr;
            try {
                iArr[ConstraintAttribute.AttributeType.INT_TYPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1328x66adad53[ConstraintAttribute.AttributeType.FLOAT_TYPE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1328x66adad53[ConstraintAttribute.AttributeType.COLOR_DRAWABLE_TYPE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1328x66adad53[ConstraintAttribute.AttributeType.COLOR_TYPE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f1328x66adad53[ConstraintAttribute.AttributeType.STRING_TYPE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f1328x66adad53[ConstraintAttribute.AttributeType.BOOLEAN_TYPE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f1328x66adad53[ConstraintAttribute.AttributeType.DIMENSION_TYPE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    private static int clamp(int i10) {
        int i11 = (i10 & (~(i10 >> 31))) - 255;
        return (i11 & (i11 >> 31)) + 255;
    }

    public static void setInterpolatedValue(ConstraintAttribute constraintAttribute, View view, float[] fArr) {
        Class<?> cls = view.getClass();
        String str = "set" + constraintAttribute.getName();
        try {
            int i10 = C32491.f1328x66adad53[constraintAttribute.getType().ordinal()];
            Class cls2 = Integer.TYPE;
            Class cls3 = Float.TYPE;
            boolean z10 = true;
            switch (i10) {
                case 1:
                    cls.getMethod(str, cls2).invoke(view, Integer.valueOf((int) fArr[0]));
                    return;
                case 2:
                    cls.getMethod(str, cls3).invoke(view, Float.valueOf(fArr[0]));
                    return;
                case 3:
                    Method method = cls.getMethod(str, Drawable.class);
                    int iClamp = (clamp((int) (((float) Math.pow(fArr[0], 0.45454545454545453d)) * 255.0f)) << 16) | (clamp((int) (fArr[3] * 255.0f)) << 24) | (clamp((int) (((float) Math.pow(fArr[1], 0.45454545454545453d)) * 255.0f)) << 8) | clamp((int) (((float) Math.pow(fArr[2], 0.45454545454545453d)) * 255.0f));
                    ColorDrawable colorDrawable = new ColorDrawable();
                    colorDrawable.setColor(iClamp);
                    method.invoke(view, colorDrawable);
                    return;
                case 4:
                    cls.getMethod(str, cls2).invoke(view, Integer.valueOf((clamp((int) (((float) Math.pow(fArr[0], 0.45454545454545453d)) * 255.0f)) << 16) | (clamp((int) (fArr[3] * 255.0f)) << 24) | (clamp((int) (((float) Math.pow(fArr[1], 0.45454545454545453d)) * 255.0f)) << 8) | clamp((int) (((float) Math.pow(fArr[2], 0.45454545454545453d)) * 255.0f))));
                    return;
                case 5:
                    throw new RuntimeException("unable to interpolate strings " + constraintAttribute.getName());
                case 6:
                    Method method2 = cls.getMethod(str, Boolean.TYPE);
                    if (fArr[0] <= 0.5f) {
                        z10 = false;
                    }
                    method2.invoke(view, Boolean.valueOf(z10));
                    return;
                case 7:
                    cls.getMethod(str, cls3).invoke(view, Float.valueOf(fArr[0]));
                    return;
                default:
                    return;
            }
        } catch (IllegalAccessException e10) {
            Log.e(TAG, "Cannot access method " + str + " on View \"" + Debug.getName(view) + "\"", e10);
        } catch (NoSuchMethodException e11) {
            Log.e(TAG, "No method " + str + " on View \"" + Debug.getName(view) + "\"", e11);
        } catch (InvocationTargetException e12) {
            Log.e(TAG, "Cannot invoke method " + str + " on View \"" + Debug.getName(view) + "\"", e12);
        }
    }
}
