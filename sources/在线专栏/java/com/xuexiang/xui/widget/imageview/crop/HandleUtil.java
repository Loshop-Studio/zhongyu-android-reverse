package com.xuexiang.xui.widget.imageview.crop;

import android.content.Context;
import android.util.Pair;
import android.util.TypedValue;
import com.xuexiang.xui.widget.popupwindow.good.IGoodView;

/* loaded from: classes.dex */
final class HandleUtil {
    private static final int TARGET_RADIUS_DP = 24;

    /* renamed from: com.xuexiang.xui.widget.imageview.crop.HandleUtil$1 */
    static /* synthetic */ class C21781 {
        static final /* synthetic */ int[] $SwitchMap$com$xuexiang$xui$widget$imageview$crop$Handle;

        static {
            int[] iArr = new int[Handle.values().length];
            $SwitchMap$com$xuexiang$xui$widget$imageview$crop$Handle = iArr;
            try {
                iArr[Handle.TOP_LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$xuexiang$xui$widget$imageview$crop$Handle[Handle.TOP_RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$xuexiang$xui$widget$imageview$crop$Handle[Handle.BOTTOM_LEFT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$xuexiang$xui$widget$imageview$crop$Handle[Handle.BOTTOM_RIGHT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$xuexiang$xui$widget$imageview$crop$Handle[Handle.LEFT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$xuexiang$xui$widget$imageview$crop$Handle[Handle.TOP.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$xuexiang$xui$widget$imageview$crop$Handle[Handle.RIGHT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$xuexiang$xui$widget$imageview$crop$Handle[Handle.BOTTOM.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$xuexiang$xui$widget$imageview$crop$Handle[Handle.CENTER.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    private HandleUtil() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    private static boolean focusCenter() {
        return !CropOverlayView.showGuidelines();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    static Pair<Float, Float> getOffset(Handle handle, float f4, float f5, float f6, float f7, float f8, float f9) {
        float f10;
        if (handle == null) {
            return null;
        }
        int i4 = C21781.$SwitchMap$com$xuexiang$xui$widget$imageview$crop$Handle[handle.ordinal()];
        float f11 = IGoodView.DEFAULT_TO_ALPHA;
        switch (i4) {
            case 1:
                f11 = f6 - f4;
                f10 = f7 - f5;
                break;
            case 2:
                f11 = f8 - f4;
                f10 = f7 - f5;
                break;
            case 3:
                f11 = f6 - f4;
                f10 = f9 - f5;
                break;
            case 4:
                f11 = f8 - f4;
                f10 = f9 - f5;
                break;
            case 5:
                f11 = f6 - f4;
                f10 = IGoodView.DEFAULT_TO_ALPHA;
                break;
            case 6:
                f10 = f7 - f5;
                break;
            case 7:
                f11 = f8 - f4;
                f10 = IGoodView.DEFAULT_TO_ALPHA;
                break;
            case 8:
                f10 = f9 - f5;
                break;
            case 9:
                f8 = (f8 + f6) / 2.0f;
                f7 = (f7 + f9) / 2.0f;
                f11 = f8 - f4;
                f10 = f7 - f5;
                break;
            default:
                f10 = IGoodView.DEFAULT_TO_ALPHA;
                break;
        }
        return new Pair<>(Float.valueOf(f11), Float.valueOf(f10));
    }

    static Handle getPressedHandle(float f4, float f5, float f6, float f7, float f8, float f9, float f10) {
        if (isInCornerTargetZone(f4, f5, f6, f7, f10)) {
            return Handle.TOP_LEFT;
        }
        if (isInCornerTargetZone(f4, f5, f8, f7, f10)) {
            return Handle.TOP_RIGHT;
        }
        if (isInCornerTargetZone(f4, f5, f6, f9, f10)) {
            return Handle.BOTTOM_LEFT;
        }
        if (isInCornerTargetZone(f4, f5, f8, f9, f10)) {
            return Handle.BOTTOM_RIGHT;
        }
        if (isInCenterTargetZone(f4, f5, f6, f7, f8, f9) && focusCenter()) {
            return Handle.CENTER;
        }
        if (isInHorizontalTargetZone(f4, f5, f6, f8, f7, f10)) {
            return Handle.TOP;
        }
        if (isInHorizontalTargetZone(f4, f5, f6, f8, f9, f10)) {
            return Handle.BOTTOM;
        }
        if (isInVerticalTargetZone(f4, f5, f6, f7, f9, f10)) {
            return Handle.LEFT;
        }
        if (isInVerticalTargetZone(f4, f5, f8, f7, f9, f10)) {
            return Handle.RIGHT;
        }
        if (!isInCenterTargetZone(f4, f5, f6, f7, f8, f9) || focusCenter()) {
            return null;
        }
        return Handle.CENTER;
    }

    static float getTargetRadius(Context context) {
        return TypedValue.applyDimension(1, 24.0f, context.getResources().getDisplayMetrics());
    }

    private static boolean isInCenterTargetZone(float f4, float f5, float f6, float f7, float f8, float f9) {
        return f4 > f6 && f4 < f8 && f5 > f7 && f5 < f9;
    }

    private static boolean isInCornerTargetZone(float f4, float f5, float f6, float f7, float f8) {
        return Math.abs(f4 - f6) <= f8 && Math.abs(f5 - f7) <= f8;
    }

    private static boolean isInHorizontalTargetZone(float f4, float f5, float f6, float f7, float f8, float f9) {
        return f4 > f6 && f4 < f7 && Math.abs(f5 - f8) <= f9;
    }

    private static boolean isInVerticalTargetZone(float f4, float f5, float f6, float f7, float f8, float f9) {
        return Math.abs(f4 - f6) <= f9 && f5 > f7 && f5 < f8;
    }
}
