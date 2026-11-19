package p294x1;

import com.xuexiang.xui.widget.button.shinebutton.interpolator.Ease;

/* renamed from: x1.b */
/* loaded from: classes4.dex */
public abstract class AbstractC10490b {

    /* renamed from: x1.b$a */
    public static /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f20914a;

        static {
            int[] iArr = new int[Ease.values().length];
            f20914a = iArr;
            try {
                iArr[Ease.LINEAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f20914a[Ease.QUAD_IN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f20914a[Ease.QUAD_OUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f20914a[Ease.QUAD_IN_OUT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f20914a[Ease.CUBIC_IN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f20914a[Ease.CUBIC_OUT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f20914a[Ease.CUBIC_IN_OUT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f20914a[Ease.QUART_IN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f20914a[Ease.QUART_OUT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f20914a[Ease.QUART_IN_OUT.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f20914a[Ease.QUINT_IN.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f20914a[Ease.QUINT_OUT.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f20914a[Ease.QUINT_IN_OUT.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f20914a[Ease.SINE_IN.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f20914a[Ease.SINE_OUT.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f20914a[Ease.SINE_IN_OUT.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f20914a[Ease.BACK_IN.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f20914a[Ease.BACK_OUT.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f20914a[Ease.BACK_IN_OUT.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f20914a[Ease.CIRC_IN.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f20914a[Ease.CIRC_OUT.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f20914a[Ease.CIRC_IN_OUT.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f20914a[Ease.BOUNCE_IN.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f20914a[Ease.BOUNCE_OUT.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f20914a[Ease.BOUNCE_IN_OUT.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f20914a[Ease.ELASTIC_IN.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f20914a[Ease.ELASTIC_OUT.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                f20914a[Ease.ELASTIC_IN_OUT.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                f20914a[Ease.EASE_IN_EXPO.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                f20914a[Ease.EASE_OUT_EXPO.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                f20914a[Ease.EASE_IN_OUT_EXPO.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
        }
    }

    /* renamed from: a */
    public static float m19684a(Ease ease, float f10) {
        switch (a.f20914a[ease.ordinal()]) {
            case 2:
                return m19691h(f10, 2.0d);
            case 3:
                return m19693j(f10, 2.0d);
            case 4:
                return m19692i(f10, 2.0d);
            case 5:
                return m19691h(f10, 3.0d);
            case 6:
                return m19693j(f10, 3.0d);
            case 7:
                return m19692i(f10, 3.0d);
            case 8:
                return m19691h(f10, 4.0d);
            case 9:
                return m19693j(f10, 4.0d);
            case 10:
                return m19692i(f10, 4.0d);
            case 11:
                return m19691h(f10, 5.0d);
            case 12:
                return m19693j(f10, 5.0d);
            case 13:
                return m19692i(f10, 5.0d);
            case 14:
                return (float) (1.0d - Math.cos((f10 * 3.141592653589793d) / 2.0d));
            case 15:
                return (float) Math.sin((f10 * 3.141592653589793d) / 2.0d);
            case 16:
                return (float) ((Math.cos(f10 * 3.141592653589793d) - 1.0d) * (-0.5d));
            case 17:
                return (float) (f10 * f10 * ((f10 * 2.7d) - 1.7d));
            case 18:
                return (float) ((r0 * r0 * (((f10 - 1.0f) * 2.7d) + 1.7d)) + 1.0d);
            case 19:
                return m19685b(f10, 1.7f);
            case 20:
                return (float) (-(Math.sqrt(1.0f - (f10 * f10)) - 1.0d));
            case 21:
                float f11 = f10 - 1.0f;
                return (float) Math.sqrt(1.0f - (f11 * f11));
            case 22:
                float f12 = f10 * 2.0f;
                if (f12 < 1.0f) {
                    return (float) ((Math.sqrt(1.0f - (f12 * f12)) - 1.0d) * (-0.5d));
                }
                float f13 = f12 - 2.0f;
                return (float) ((Math.sqrt(1.0f - (f13 * f13)) + 1.0d) * 0.5d);
            case 23:
                return m19686c(f10);
            case 24:
                return m19687d(f10);
            case 25:
                return f10 < 0.5f ? m19686c(f10 * 2.0f) * 0.5f : (m19687d((f10 * 2.0f) - 1.0f) * 0.5f) + 0.5f;
            case 26:
                return m19688e(f10, 1.0d, 0.3d);
            case 27:
                return m19690g(f10, 1.0d, 0.3d);
            case 28:
                return m19689f(f10, 1.0d, 0.45d);
            case 29:
                return (float) Math.pow(2.0d, (f10 - 1.0f) * 10.0f);
            case 30:
                return ((float) (-Math.pow(2.0d, f10 * (-10.0f)))) + 1.0f;
            case 31:
                return f10 * 2.0f < 1.0f ? ((float) Math.pow(2.0d, (r0 - 1.0f) * 10.0f)) * 0.5f : ((float) ((-Math.pow(2.0d, (r0 - 1.0f) * (-10.0f))) + 2.0d)) * 0.5f;
            default:
                return f10;
        }
    }

    /* renamed from: b */
    public static float m19685b(float f10, float f11) {
        double d10;
        float f12 = (float) (f11 * 1.525d);
        float f13 = f10 * 2.0f;
        if (f13 < 1.0f) {
            d10 = f13 * f13 * (((1.0f + f12) * f13) - f12);
        } else {
            float f14 = f13 - 2.0f;
            d10 = (f14 * f14 * (((1.0f + f12) * f14) + f12)) + 2.0f;
        }
        return (float) (d10 * 0.5d);
    }

    /* renamed from: c */
    public static float m19686c(float f10) {
        return 1.0f - m19687d(1.0f - f10);
    }

    /* renamed from: d */
    public static float m19687d(float f10) {
        double d10;
        double d11;
        double d12;
        double d13 = f10;
        if (d13 < 0.36363636363636365d) {
            d12 = 7.5625d * d13 * d13;
        } else {
            if (d13 < 0.7272727272727273d) {
                double d14 = (float) (d13 - 0.5454545454545454d);
                d10 = 7.5625d * d14 * d14;
                d11 = 0.75d;
            } else if (d13 < 0.9090909090909091d) {
                double d15 = (float) (d13 - 0.8181818181818182d);
                d10 = 7.5625d * d15 * d15;
                d11 = 0.9375d;
            } else {
                double d16 = (float) (d13 - 0.9545454545454546d);
                d10 = 7.5625d * d16 * d16;
                d11 = 0.984375d;
            }
            d12 = d10 + d11;
        }
        return (float) d12;
    }

    /* renamed from: e */
    public static float m19688e(float f10, double d10, double d11) {
        if (f10 == 0.0f || f10 == 1.0f) {
            return f10;
        }
        return (float) (-(d10 * Math.pow(2.0d, 10.0f * r9) * Math.sin((((f10 - 1.0f) - ((d11 / 6.283185307179586d) * Math.asin(1.0d / d10))) * 6.283185307179586d) / d11)));
    }

    /* renamed from: f */
    public static float m19689f(float f10, double d10, double d11) {
        double dPow;
        double dAsin = (d11 / 6.283185307179586d) * Math.asin(1.0d / d10);
        float f11 = f10 * 2.0f;
        if (f11 < 1.0f) {
            dPow = d10 * Math.pow(2.0d, 10.0f * r10) * Math.sin((((f11 - 1.0f) - dAsin) * 6.283185307179586d) / d11) * (-0.5d);
        } else {
            dPow = (d10 * Math.pow(2.0d, (-10.0f) * r10) * Math.sin((((f11 - 1.0f) - dAsin) * 6.283185307179586d) / d11) * 0.5d) + 1.0d;
        }
        return (float) dPow;
    }

    /* renamed from: g */
    public static float m19690g(float f10, double d10, double d11) {
        if (f10 == 0.0f || f10 == 1.0f) {
            return f10;
        }
        return (float) ((d10 * Math.pow(2.0d, (-10.0f) * f10) * Math.sin(((f10 - ((d11 / 6.283185307179586d) * Math.asin(1.0d / d10))) * 6.283185307179586d) / d11)) + 1.0d);
    }

    /* renamed from: h */
    public static float m19691h(float f10, double d10) {
        return (float) Math.pow(f10, d10);
    }

    /* renamed from: i */
    public static float m19692i(float f10, double d10) {
        float f11 = f10 * 2.0f;
        return f11 < 1.0f ? (float) (Math.pow(f11, d10) * 0.5d) : (float) (1.0d - (Math.abs(Math.pow(2.0f - f11, d10)) * 0.5d));
    }

    /* renamed from: j */
    public static float m19693j(float f10, double d10) {
        return (float) (1.0d - Math.pow(1.0f - f10, d10));
    }
}
