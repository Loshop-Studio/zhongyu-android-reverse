package com.xuexiang.xui.widget.button.shinebutton.interpolator;

import com.xuexiang.xui.widget.popupwindow.good.IGoodView;

/* loaded from: classes.dex */
public class EasingProvider {

    /* renamed from: com.xuexiang.xui.widget.button.shinebutton.interpolator.EasingProvider$1 */
    static /* synthetic */ class C21151 {

        /* renamed from: $SwitchMap$com$xuexiang$xui$widget$button$shinebutton$interpolator$Ease */
        static final /* synthetic */ int[] f9683x6a0ee95a;

        static {
            int[] iArr = new int[Ease.values().length];
            f9683x6a0ee95a = iArr;
            try {
                iArr[Ease.LINEAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f9683x6a0ee95a[Ease.QUAD_IN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f9683x6a0ee95a[Ease.QUAD_OUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f9683x6a0ee95a[Ease.QUAD_IN_OUT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f9683x6a0ee95a[Ease.CUBIC_IN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f9683x6a0ee95a[Ease.CUBIC_OUT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f9683x6a0ee95a[Ease.CUBIC_IN_OUT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f9683x6a0ee95a[Ease.QUART_IN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f9683x6a0ee95a[Ease.QUART_OUT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f9683x6a0ee95a[Ease.QUART_IN_OUT.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f9683x6a0ee95a[Ease.QUINT_IN.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f9683x6a0ee95a[Ease.QUINT_OUT.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f9683x6a0ee95a[Ease.QUINT_IN_OUT.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f9683x6a0ee95a[Ease.SINE_IN.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f9683x6a0ee95a[Ease.SINE_OUT.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f9683x6a0ee95a[Ease.SINE_IN_OUT.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f9683x6a0ee95a[Ease.BACK_IN.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f9683x6a0ee95a[Ease.BACK_OUT.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f9683x6a0ee95a[Ease.BACK_IN_OUT.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f9683x6a0ee95a[Ease.CIRC_IN.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f9683x6a0ee95a[Ease.CIRC_OUT.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f9683x6a0ee95a[Ease.CIRC_IN_OUT.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f9683x6a0ee95a[Ease.BOUNCE_IN.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f9683x6a0ee95a[Ease.BOUNCE_OUT.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f9683x6a0ee95a[Ease.BOUNCE_IN_OUT.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f9683x6a0ee95a[Ease.ELASTIC_IN.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f9683x6a0ee95a[Ease.ELASTIC_OUT.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                f9683x6a0ee95a[Ease.ELASTIC_IN_OUT.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                f9683x6a0ee95a[Ease.EASE_IN_EXPO.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                f9683x6a0ee95a[Ease.EASE_OUT_EXPO.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                f9683x6a0ee95a[Ease.EASE_IN_OUT_EXPO.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
        }
    }

    static float get(Ease ease, float f4) {
        switch (C21151.f9683x6a0ee95a[ease.ordinal()]) {
            case 2:
                return getPowIn(f4, 2.0d);
            case 3:
                return getPowOut(f4, 2.0d);
            case 4:
                return getPowInOut(f4, 2.0d);
            case 5:
                return getPowIn(f4, 3.0d);
            case 6:
                return getPowOut(f4, 3.0d);
            case 7:
                return getPowInOut(f4, 3.0d);
            case 8:
                return getPowIn(f4, 4.0d);
            case 9:
                return getPowOut(f4, 4.0d);
            case 10:
                return getPowInOut(f4, 4.0d);
            case 11:
                return getPowIn(f4, 5.0d);
            case 12:
                return getPowOut(f4, 5.0d);
            case 13:
                return getPowInOut(f4, 5.0d);
            case 14:
                return (float) (1.0d - Math.cos((f4 * 3.141592653589793d) / 2.0d));
            case 15:
                return (float) Math.sin((f4 * 3.141592653589793d) / 2.0d);
            case 16:
                return (float) ((Math.cos(f4 * 3.141592653589793d) - 1.0d) * (-0.5d));
            case 17:
                return (float) (f4 * f4 * ((f4 * 2.7d) - 1.7d));
            case 18:
                return (float) ((r0 * r0 * (((f4 - 1.0f) * 2.7d) + 1.7d)) + 1.0d);
            case 19:
                return getBackInOut(f4, 1.7f);
            case 20:
                return (float) (-(Math.sqrt(1.0f - (f4 * f4)) - 1.0d));
            case 21:
                float f5 = f4 - 1.0f;
                return (float) Math.sqrt(1.0f - (f5 * f5));
            case 22:
                float f6 = f4 * 2.0f;
                if (f6 < 1.0f) {
                    return (float) ((Math.sqrt(1.0f - (f6 * f6)) - 1.0d) * (-0.5d));
                }
                float f7 = f6 - 2.0f;
                return (float) ((Math.sqrt(1.0f - (f7 * f7)) + 1.0d) * 0.5d);
            case 23:
                return getBounceIn(f4);
            case 24:
                return getBounceOut(f4);
            case 25:
                return f4 < 0.5f ? getBounceIn(f4 * 2.0f) * 0.5f : (getBounceOut((f4 * 2.0f) - 1.0f) * 0.5f) + 0.5f;
            case 26:
                return getElasticIn(f4, 1.0d, 0.3d);
            case 27:
                return getElasticOut(f4, 1.0d, 0.3d);
            case 28:
                return getElasticInOut(f4, 1.0d, 0.45d);
            case 29:
                return (float) Math.pow(2.0d, (f4 - 1.0f) * 10.0f);
            case 30:
                return ((float) (-Math.pow(2.0d, f4 * (-10.0f)))) + 1.0f;
            case 31:
                return f4 * 2.0f < 1.0f ? ((float) Math.pow(2.0d, (r0 - 1.0f) * 10.0f)) * 0.5f : ((float) ((-Math.pow(2.0d, (r0 - 1.0f) * (-10.0f))) + 2.0d)) * 0.5f;
            default:
                return f4;
        }
    }

    private static float getBackInOut(float f4, float f5) {
        double d4;
        float f6 = (float) (f5 * 1.525d);
        float f7 = f4 * 2.0f;
        if (f7 < 1.0f) {
            d4 = f7 * f7 * (((1.0f + f6) * f7) - f6);
        } else {
            float f8 = f7 - 2.0f;
            d4 = (f8 * f8 * (((1.0f + f6) * f8) + f6)) + 2.0f;
        }
        return (float) (d4 * 0.5d);
    }

    private static float getBounceIn(float f4) {
        return 1.0f - getBounceOut(1.0f - f4);
    }

    private static float getBounceOut(float f4) {
        double d4;
        double d5;
        double d6;
        double d7 = f4;
        if (d7 < 0.36363636363636365d) {
            d6 = 7.5625d * d7 * d7;
        } else {
            if (d7 < 0.7272727272727273d) {
                double d8 = (float) (d7 - 0.5454545454545454d);
                d4 = 7.5625d * d8 * d8;
                d5 = 0.75d;
            } else if (d7 < 0.9090909090909091d) {
                double d9 = (float) (d7 - 0.8181818181818182d);
                d4 = 7.5625d * d9 * d9;
                d5 = 0.9375d;
            } else {
                double d10 = (float) (d7 - 0.9545454545454546d);
                d4 = 7.5625d * d10 * d10;
                d5 = 0.984375d;
            }
            d6 = d4 + d5;
        }
        return (float) d6;
    }

    private static float getElasticIn(float f4, double d4, double d5) {
        if (f4 == IGoodView.DEFAULT_TO_ALPHA || f4 == 1.0f) {
            return f4;
        }
        return (float) (-(d4 * Math.pow(2.0d, 10.0f * r9) * Math.sin((((f4 - 1.0f) - ((d5 / 6.283185307179586d) * Math.asin(1.0d / d4))) * 6.283185307179586d) / d5)));
    }

    private static float getElasticInOut(float f4, double d4, double d5) {
        double dPow;
        double dAsin = (d5 / 6.283185307179586d) * Math.asin(1.0d / d4);
        float f5 = f4 * 2.0f;
        if (f5 < 1.0f) {
            dPow = d4 * Math.pow(2.0d, 10.0f * r10) * Math.sin((((f5 - 1.0f) - dAsin) * 6.283185307179586d) / d5) * (-0.5d);
        } else {
            dPow = (d4 * Math.pow(2.0d, (-10.0f) * r10) * Math.sin((((f5 - 1.0f) - dAsin) * 6.283185307179586d) / d5) * 0.5d) + 1.0d;
        }
        return (float) dPow;
    }

    private static float getElasticOut(float f4, double d4, double d5) {
        if (f4 == IGoodView.DEFAULT_TO_ALPHA || f4 == 1.0f) {
            return f4;
        }
        return (float) ((d4 * Math.pow(2.0d, (-10.0f) * f4) * Math.sin(((f4 - ((d5 / 6.283185307179586d) * Math.asin(1.0d / d4))) * 6.283185307179586d) / d5)) + 1.0d);
    }

    private static float getPowIn(float f4, double d4) {
        return (float) Math.pow(f4, d4);
    }

    private static float getPowInOut(float f4, double d4) {
        float f5 = f4 * 2.0f;
        return f5 < 1.0f ? (float) (Math.pow(f5, d4) * 0.5d) : (float) (1.0d - (Math.abs(Math.pow(2.0f - f5, d4)) * 0.5d));
    }

    private static float getPowOut(float f4, double d4) {
        return (float) (1.0d - Math.pow(1.0f - f4, d4));
    }
}
