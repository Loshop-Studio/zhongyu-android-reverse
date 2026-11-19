package p196z1;

import com.xuexiang.xui.widget.button.shinebutton.interpolator.Ease;

/* renamed from: z1.b */
/* loaded from: classes3.dex */
public abstract class AbstractC7933b {

    /* renamed from: z1.b$a */
    public static /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f10659a;

        static {
            int[] iArr = new int[Ease.values().length];
            f10659a = iArr;
            try {
                iArr[Ease.LINEAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10659a[Ease.QUAD_IN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f10659a[Ease.QUAD_OUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f10659a[Ease.QUAD_IN_OUT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f10659a[Ease.CUBIC_IN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f10659a[Ease.CUBIC_OUT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f10659a[Ease.CUBIC_IN_OUT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f10659a[Ease.QUART_IN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f10659a[Ease.QUART_OUT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f10659a[Ease.QUART_IN_OUT.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f10659a[Ease.QUINT_IN.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f10659a[Ease.QUINT_OUT.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f10659a[Ease.QUINT_IN_OUT.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f10659a[Ease.SINE_IN.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f10659a[Ease.SINE_OUT.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f10659a[Ease.SINE_IN_OUT.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f10659a[Ease.BACK_IN.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f10659a[Ease.BACK_OUT.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f10659a[Ease.BACK_IN_OUT.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f10659a[Ease.CIRC_IN.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f10659a[Ease.CIRC_OUT.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f10659a[Ease.CIRC_IN_OUT.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f10659a[Ease.BOUNCE_IN.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f10659a[Ease.BOUNCE_OUT.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f10659a[Ease.BOUNCE_IN_OUT.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f10659a[Ease.ELASTIC_IN.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f10659a[Ease.ELASTIC_OUT.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                f10659a[Ease.ELASTIC_IN_OUT.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                f10659a[Ease.EASE_IN_EXPO.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                f10659a[Ease.EASE_OUT_EXPO.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                f10659a[Ease.EASE_IN_OUT_EXPO.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
        }
    }

    /* renamed from: a */
    public static float m9735a(Ease ease, float f6) {
        switch (a.f10659a[ease.ordinal()]) {
            case 2:
                return m9742h(f6, 2.0d);
            case 3:
                return m9744j(f6, 2.0d);
            case 4:
                return m9743i(f6, 2.0d);
            case 5:
                return m9742h(f6, 3.0d);
            case 6:
                return m9744j(f6, 3.0d);
            case 7:
                return m9743i(f6, 3.0d);
            case 8:
                return m9742h(f6, 4.0d);
            case 9:
                return m9744j(f6, 4.0d);
            case 10:
                return m9743i(f6, 4.0d);
            case 11:
                return m9742h(f6, 5.0d);
            case 12:
                return m9744j(f6, 5.0d);
            case 13:
                return m9743i(f6, 5.0d);
            case 14:
                return (float) (1.0d - Math.cos((f6 * 3.141592653589793d) / 2.0d));
            case 15:
                return (float) Math.sin((f6 * 3.141592653589793d) / 2.0d);
            case 16:
                return (float) ((Math.cos(f6 * 3.141592653589793d) - 1.0d) * (-0.5d));
            case 17:
                return (float) (f6 * f6 * ((f6 * 2.7d) - 1.7d));
            case 18:
                return (float) ((r0 * r0 * (((f6 - 1.0f) * 2.7d) + 1.7d)) + 1.0d);
            case 19:
                return m9736b(f6, 1.7f);
            case 20:
                return (float) (-(Math.sqrt(1.0f - (f6 * f6)) - 1.0d));
            case 21:
                float f7 = f6 - 1.0f;
                return (float) Math.sqrt(1.0f - (f7 * f7));
            case 22:
                float f8 = f6 * 2.0f;
                if (f8 < 1.0f) {
                    return (float) ((Math.sqrt(1.0f - (f8 * f8)) - 1.0d) * (-0.5d));
                }
                float f9 = f8 - 2.0f;
                return (float) ((Math.sqrt(1.0f - (f9 * f9)) + 1.0d) * 0.5d);
            case 23:
                return m9737c(f6);
            case 24:
                return m9738d(f6);
            case 25:
                return f6 < 0.5f ? m9737c(f6 * 2.0f) * 0.5f : (m9738d((f6 * 2.0f) - 1.0f) * 0.5f) + 0.5f;
            case 26:
                return m9739e(f6, 1.0d, 0.3d);
            case 27:
                return m9741g(f6, 1.0d, 0.3d);
            case 28:
                return m9740f(f6, 1.0d, 0.45d);
            case 29:
                return (float) Math.pow(2.0d, (f6 - 1.0f) * 10.0f);
            case 30:
                return ((float) (-Math.pow(2.0d, f6 * (-10.0f)))) + 1.0f;
            case 31:
                return f6 * 2.0f < 1.0f ? ((float) Math.pow(2.0d, (r0 - 1.0f) * 10.0f)) * 0.5f : ((float) ((-Math.pow(2.0d, (r0 - 1.0f) * (-10.0f))) + 2.0d)) * 0.5f;
            default:
                return f6;
        }
    }

    /* renamed from: b */
    public static float m9736b(float f6, float f7) {
        double d6;
        float f8 = (float) (f7 * 1.525d);
        float f9 = f6 * 2.0f;
        if (f9 < 1.0f) {
            d6 = f9 * f9 * (((1.0f + f8) * f9) - f8);
        } else {
            float f10 = f9 - 2.0f;
            d6 = (f10 * f10 * (((1.0f + f8) * f10) + f8)) + 2.0f;
        }
        return (float) (d6 * 0.5d);
    }

    /* renamed from: c */
    public static float m9737c(float f6) {
        return 1.0f - m9738d(1.0f - f6);
    }

    /* renamed from: d */
    public static float m9738d(float f6) {
        double d6;
        double d7;
        double d8;
        double d9 = f6;
        if (d9 < 0.36363636363636365d) {
            d8 = 7.5625d * d9 * d9;
        } else {
            if (d9 < 0.7272727272727273d) {
                double d10 = (float) (d9 - 0.5454545454545454d);
                d6 = 7.5625d * d10 * d10;
                d7 = 0.75d;
            } else if (d9 < 0.9090909090909091d) {
                double d11 = (float) (d9 - 0.8181818181818182d);
                d6 = 7.5625d * d11 * d11;
                d7 = 0.9375d;
            } else {
                double d12 = (float) (d9 - 0.9545454545454546d);
                d6 = 7.5625d * d12 * d12;
                d7 = 0.984375d;
            }
            d8 = d6 + d7;
        }
        return (float) d8;
    }

    /* renamed from: e */
    public static float m9739e(float f6, double d6, double d7) {
        if (f6 == 0.0f || f6 == 1.0f) {
            return f6;
        }
        return (float) (-(d6 * Math.pow(2.0d, 10.0f * r9) * Math.sin((((f6 - 1.0f) - ((d7 / 6.283185307179586d) * Math.asin(1.0d / d6))) * 6.283185307179586d) / d7)));
    }

    /* renamed from: f */
    public static float m9740f(float f6, double d6, double d7) {
        double dPow;
        double dAsin = (d7 / 6.283185307179586d) * Math.asin(1.0d / d6);
        float f7 = f6 * 2.0f;
        if (f7 < 1.0f) {
            dPow = d6 * Math.pow(2.0d, 10.0f * r10) * Math.sin((((f7 - 1.0f) - dAsin) * 6.283185307179586d) / d7) * (-0.5d);
        } else {
            dPow = (d6 * Math.pow(2.0d, (-10.0f) * r10) * Math.sin((((f7 - 1.0f) - dAsin) * 6.283185307179586d) / d7) * 0.5d) + 1.0d;
        }
        return (float) dPow;
    }

    /* renamed from: g */
    public static float m9741g(float f6, double d6, double d7) {
        if (f6 == 0.0f || f6 == 1.0f) {
            return f6;
        }
        return (float) ((d6 * Math.pow(2.0d, (-10.0f) * f6) * Math.sin(((f6 - ((d7 / 6.283185307179586d) * Math.asin(1.0d / d6))) * 6.283185307179586d) / d7)) + 1.0d);
    }

    /* renamed from: h */
    public static float m9742h(float f6, double d6) {
        return (float) Math.pow(f6, d6);
    }

    /* renamed from: i */
    public static float m9743i(float f6, double d6) {
        float f7 = f6 * 2.0f;
        return f7 < 1.0f ? (float) (Math.pow(f7, d6) * 0.5d) : (float) (1.0d - (Math.abs(Math.pow(2.0f - f7, d6)) * 0.5d));
    }

    /* renamed from: j */
    public static float m9744j(float f6, double d6) {
        return (float) (1.0d - Math.pow(1.0f - f6, d6));
    }
}
