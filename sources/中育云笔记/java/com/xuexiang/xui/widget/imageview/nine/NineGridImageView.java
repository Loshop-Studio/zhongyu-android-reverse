package com.xuexiang.xui.widget.imageview.nine;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.xuexiang.xui.R$styleable;
import java.util.ArrayList;
import java.util.List;
import p275o8.AbstractC10450c;
import p275o8.InterfaceC10448a;
import p275o8.InterfaceC10449b;

/* loaded from: classes5.dex */
public class NineGridImageView<T> extends ViewGroup {

    /* renamed from: c */
    public int f16195c;

    /* renamed from: d */
    public int f16196d;

    /* renamed from: e */
    public int f16197e;

    /* renamed from: f */
    public int f16198f;

    /* renamed from: g */
    public int f16199g;

    /* renamed from: h */
    public int f16200h;

    /* renamed from: i */
    public int f16201i;

    /* renamed from: j */
    public int f16202j;

    /* renamed from: k */
    public List f16203k;

    /* renamed from: l */
    public List f16204l;

    public NineGridImageView(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    public int[] m12769a(int i10, int i11) {
        int[] iArr = new int[2];
        if (i11 == 1) {
            m12770b(i10, iArr);
            return iArr;
        }
        iArr[0] = (i10 / 3) + (i10 % 3 == 0 ? 0 : 1);
        iArr[1] = 3;
        return iArr;
    }

    /* renamed from: b */
    public final void m12770b(int i10, int[] iArr) {
        if (i10 <= 2) {
            iArr[0] = 1;
            iArr[1] = i10;
            return;
        }
        if (i10 == 3) {
            int i11 = this.f16202j;
            if (i11 == 2 || i11 == 3 || i11 == 4) {
                iArr[0] = 2;
                iArr[1] = 2;
                return;
            } else {
                iArr[0] = 1;
                iArr[1] = 3;
                return;
            }
        }
        if (i10 > 6) {
            iArr[0] = (i10 / 3) + (i10 % 3 == 0 ? 0 : 1);
            iArr[1] = 3;
            return;
        }
        int i12 = this.f16202j;
        if (i12 == 2 || i12 == 3 || i12 == 4) {
            iArr[0] = 3;
            iArr[1] = 3;
        } else {
            iArr[0] = 2;
            iArr[1] = (i10 / 2) + (i10 % 2);
        }
    }

    /* renamed from: c */
    public final ImageView m12771c(int i10) {
        if (i10 < this.f16203k.size()) {
            return (ImageView) this.f16203k.get(i10);
        }
        Log.e("NineGirdImageView", "Your must set a NineGridImageViewAdapter for NineGirdImageView");
        return null;
    }

    /* renamed from: d */
    public final int m12772d(int i10) {
        int i11 = this.f16197e;
        return (i11 <= 0 || i10 <= i11) ? i10 : i11;
    }

    /* renamed from: e */
    public final void m12773e(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.NineGridImageView);
        this.f16199g = (int) typedArrayObtainStyledAttributes.getDimension(R$styleable.NineGridImageView_ngiv_imgGap, 0.0f);
        this.f16200h = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.NineGridImageView_ngiv_singleImgSize, -1);
        this.f16198f = typedArrayObtainStyledAttributes.getInt(R$styleable.NineGridImageView_ngiv_showStyle, 0);
        this.f16197e = typedArrayObtainStyledAttributes.getInt(R$styleable.NineGridImageView_ngiv_maxSize, 9);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* renamed from: f */
    public final void m12774f() {
        List list = this.f16204l;
        if (list == null) {
            return;
        }
        int iM12772d = m12772d(list.size());
        if (this.f16202j == 0 || iM12772d <= 2) {
            m12777i(iM12772d);
            return;
        }
        if (iM12772d == 3) {
            m12779k(iM12772d);
            return;
        }
        if (iM12772d == 4) {
            m12776h(iM12772d);
            return;
        }
        if (iM12772d == 5) {
            m12775g(iM12772d);
        } else if (iM12772d != 6) {
            m12777i(iM12772d);
        } else {
            m12778j(iM12772d);
        }
    }

    /* renamed from: g */
    public final void m12775g(int i10) {
        int paddingLeft;
        int i11;
        int i12;
        int i13;
        int paddingTop;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int paddingLeft2;
        int i19;
        int i20;
        int paddingTop2;
        int i21;
        int i22;
        int i23;
        int i24;
        int paddingLeft3;
        int i25;
        int paddingTop3;
        int i26;
        int i27;
        int i28;
        for (int i29 = 0; i29 < i10; i29++) {
            ImageView imageView = (ImageView) getChildAt(i29);
            int i30 = this.f16202j;
            if (i30 == 2) {
                if (i29 == 0) {
                    paddingLeft = getPaddingLeft();
                    paddingTop = getPaddingTop();
                    i16 = this.f16201i;
                    i17 = this.f16199g;
                    i18 = ((i16 * 3) + i17) / 2;
                } else if (i29 == 1) {
                    int paddingLeft4 = getPaddingLeft();
                    int i31 = this.f16201i * 3;
                    int i32 = this.f16199g;
                    paddingLeft = paddingLeft4 + ((i31 + i32) / 2) + i32;
                    paddingTop = getPaddingTop();
                    i16 = this.f16201i;
                    i17 = this.f16199g;
                    i18 = ((i16 * 3) + i17) / 2;
                } else {
                    if (i29 == 2) {
                        paddingLeft = getPaddingLeft();
                        int paddingTop4 = getPaddingTop();
                        i11 = this.f16201i;
                        i12 = paddingTop4 + (i11 * 2);
                        i13 = this.f16199g;
                    } else if (i29 == 3) {
                        paddingLeft = getPaddingLeft() + this.f16201i + this.f16199g;
                        int paddingTop5 = getPaddingTop();
                        i11 = this.f16201i;
                        i12 = paddingTop5 + (i11 * 2);
                        i13 = this.f16199g;
                    } else {
                        paddingLeft = getPaddingLeft() + (this.f16201i * 2) + (this.f16199g * 2);
                        int paddingTop6 = getPaddingTop();
                        i11 = this.f16201i;
                        i12 = paddingTop6 + (i11 * 2);
                        i13 = this.f16199g;
                    }
                    paddingTop = i12 + (i13 * 2);
                    i14 = paddingLeft + i11;
                    i15 = i11 + paddingTop;
                    imageView.layout(paddingLeft, paddingTop, i14, i15);
                }
                i14 = i18 + paddingLeft;
                i15 = (i16 * 2) + paddingTop + i17;
                imageView.layout(paddingLeft, paddingTop, i14, i15);
            } else if (i30 == 3) {
                if (i29 == 0) {
                    paddingLeft2 = getPaddingLeft();
                    paddingTop2 = getPaddingTop();
                    i24 = this.f16201i;
                } else if (i29 == 1) {
                    paddingLeft2 = getPaddingLeft() + this.f16201i + this.f16199g;
                    paddingTop2 = getPaddingTop();
                    i24 = this.f16201i;
                } else if (i29 == 2) {
                    paddingLeft2 = getPaddingLeft() + (this.f16201i * 2) + (this.f16199g * 2);
                    paddingTop2 = getPaddingTop();
                    i24 = this.f16201i;
                } else {
                    if (i29 == 3) {
                        paddingLeft2 = getPaddingLeft();
                        int paddingTop7 = getPaddingTop();
                        i19 = this.f16201i;
                        i20 = this.f16199g;
                        paddingTop2 = paddingTop7 + i19 + i20;
                        i21 = ((i19 * 3) + i20) / 2;
                    } else {
                        int paddingLeft5 = getPaddingLeft();
                        int i33 = this.f16201i * 3;
                        int i34 = this.f16199g;
                        paddingLeft2 = paddingLeft5 + ((i33 + i34) / 2) + i34;
                        int paddingTop8 = getPaddingTop();
                        i19 = this.f16201i;
                        i20 = this.f16199g;
                        paddingTop2 = paddingTop8 + i19 + i20;
                        i21 = ((i19 * 3) + i20) / 2;
                    }
                    i22 = (i19 * 2) + paddingTop2 + i20;
                    i23 = i21 + paddingLeft2;
                    imageView.layout(paddingLeft2, paddingTop2, i23, i22);
                }
                i23 = paddingLeft2 + i24;
                i22 = i24 + paddingTop2;
                imageView.layout(paddingLeft2, paddingTop2, i23, i22);
            } else if (i30 == 4) {
                if (i29 == 0) {
                    paddingLeft3 = getPaddingLeft();
                    paddingTop3 = getPaddingTop();
                    int i35 = this.f16201i;
                    int i36 = this.f16199g;
                    i26 = (i35 * 2) + paddingLeft3 + i36;
                    i28 = ((i35 * 3) + i36) / 2;
                } else if (i29 == 1) {
                    paddingLeft3 = getPaddingLeft();
                    int paddingTop9 = getPaddingTop();
                    int i37 = this.f16201i;
                    int i38 = this.f16199g;
                    paddingTop3 = paddingTop9 + (((i37 * 3) + i38) / 2) + i38;
                    i26 = (i37 * 2) + paddingLeft3 + i38;
                    i28 = ((i37 * 3) + i38) / 2;
                } else {
                    if (i29 == 2) {
                        paddingLeft3 = getPaddingLeft() + (this.f16201i * 2) + (this.f16199g * 2);
                        paddingTop3 = getPaddingTop();
                        i25 = this.f16201i;
                    } else if (i29 == 3) {
                        paddingLeft3 = getPaddingLeft() + (this.f16201i * 2) + (this.f16199g * 2);
                        int paddingTop10 = getPaddingTop();
                        i25 = this.f16201i;
                        paddingTop3 = paddingTop10 + i25 + this.f16199g;
                    } else {
                        paddingLeft3 = getPaddingLeft() + (this.f16201i * 2) + (this.f16199g * 2);
                        int paddingTop11 = getPaddingTop();
                        i25 = this.f16201i;
                        paddingTop3 = paddingTop11 + (i25 * 2) + (this.f16199g * 2);
                    }
                    i26 = paddingLeft3 + i25;
                    i27 = paddingTop3 + i25;
                    imageView.layout(paddingLeft3, paddingTop3, i26, i27);
                }
                i27 = i28 + paddingTop3;
                imageView.layout(paddingLeft3, paddingTop3, i26, i27);
            }
        }
    }

    /* renamed from: h */
    public final void m12776h(int i10) {
        int paddingLeft;
        int i11;
        int i12;
        int i13;
        int paddingTop;
        int i14;
        int i15;
        int paddingLeft2;
        int paddingTop2;
        int i16;
        int i17;
        int i18;
        int paddingLeft3;
        int paddingTop3;
        int i19;
        int i20;
        int i21;
        for (int i22 = 0; i22 < i10; i22++) {
            ImageView imageView = (ImageView) getChildAt(i22);
            int i23 = this.f16202j;
            if (i23 == 2) {
                if (i22 == 0) {
                    paddingLeft = getPaddingLeft();
                    paddingTop = getPaddingTop();
                    int i24 = this.f16201i;
                    int i25 = this.f16199g;
                    i14 = (i24 * 3) + paddingLeft + (i25 * 2);
                    i15 = (i24 * 2) + paddingTop + i25;
                } else {
                    if (i22 == 1) {
                        paddingLeft = getPaddingLeft();
                        int paddingTop4 = getPaddingTop();
                        i11 = this.f16201i;
                        i12 = paddingTop4 + (i11 * 2);
                        i13 = this.f16199g;
                    } else if (i22 == 2) {
                        paddingLeft = getPaddingLeft() + this.f16201i + this.f16199g;
                        int paddingTop5 = getPaddingTop();
                        i11 = this.f16201i;
                        i12 = paddingTop5 + (i11 * 2);
                        i13 = this.f16199g;
                    } else {
                        paddingLeft = getPaddingLeft() + (this.f16201i * 2) + (this.f16199g * 2);
                        int paddingTop6 = getPaddingTop();
                        i11 = this.f16201i;
                        i12 = paddingTop6 + (i11 * 2);
                        i13 = this.f16199g;
                    }
                    paddingTop = i12 + (i13 * 2);
                    i14 = paddingLeft + i11;
                    i15 = i11 + paddingTop;
                }
                imageView.layout(paddingLeft, paddingTop, i14, i15);
            } else if (i23 == 3) {
                if (i22 == 0) {
                    paddingLeft2 = getPaddingLeft();
                    paddingTop2 = getPaddingTop();
                    i18 = this.f16201i;
                } else if (i22 == 1) {
                    paddingLeft2 = getPaddingLeft() + this.f16201i + this.f16199g;
                    paddingTop2 = getPaddingTop();
                    i18 = this.f16201i;
                } else if (i22 == 2) {
                    paddingLeft2 = getPaddingLeft() + (this.f16201i * 2) + (this.f16199g * 2);
                    paddingTop2 = getPaddingTop();
                    i18 = this.f16201i;
                } else {
                    paddingLeft2 = getPaddingLeft();
                    int paddingTop7 = getPaddingTop();
                    int i26 = this.f16201i;
                    int i27 = this.f16199g;
                    paddingTop2 = paddingTop7 + i26 + i27;
                    i16 = (i26 * 2) + paddingTop2 + i27;
                    i17 = (i26 * 3) + paddingLeft2 + (i27 * 2);
                    imageView.layout(paddingLeft2, paddingTop2, i17, i16);
                }
                i17 = paddingLeft2 + i18;
                i16 = i18 + paddingTop2;
                imageView.layout(paddingLeft2, paddingTop2, i17, i16);
            } else if (i23 == 4) {
                if (i22 == 0) {
                    paddingLeft3 = getPaddingLeft();
                    paddingTop3 = getPaddingTop();
                    int i28 = this.f16201i;
                    int i29 = this.f16199g;
                    i19 = (i28 * 2) + paddingLeft3 + i29;
                    i20 = (i28 * 3) + paddingTop3 + (i29 * 2);
                } else {
                    if (i22 == 1) {
                        paddingLeft3 = getPaddingLeft() + (this.f16201i * 2) + (this.f16199g * 2);
                        paddingTop3 = getPaddingTop();
                        i21 = this.f16201i;
                    } else if (i22 == 2) {
                        paddingLeft3 = getPaddingLeft() + (this.f16201i * 2) + (this.f16199g * 2);
                        int paddingTop8 = getPaddingTop();
                        i21 = this.f16201i;
                        paddingTop3 = paddingTop8 + i21 + this.f16199g;
                    } else {
                        paddingLeft3 = getPaddingLeft() + (this.f16201i * 2) + (this.f16199g * 2);
                        int paddingTop9 = getPaddingTop();
                        int i30 = this.f16201i;
                        paddingTop3 = paddingTop9 + (i30 * 2) + (this.f16199g * 2);
                        i19 = paddingLeft3 + i30;
                        i20 = paddingTop3 + i30;
                    }
                    i19 = paddingLeft3 + i21;
                    i20 = paddingTop3 + i21;
                }
                imageView.layout(paddingLeft3, paddingTop3, i19, i20);
            }
        }
    }

    /* renamed from: i */
    public final void m12777i(int i10) {
        if (i10 <= 0) {
            return;
        }
        for (int i11 = 0; i11 < i10; i11++) {
            ImageView imageView = (ImageView) getChildAt(i11);
            int i12 = this.f16196d;
            int paddingLeft = ((this.f16201i + this.f16199g) * (i11 % i12)) + getPaddingLeft();
            int paddingTop = ((this.f16201i + this.f16199g) * (i11 / i12)) + getPaddingTop();
            int i13 = this.f16201i;
            imageView.layout(paddingLeft, paddingTop, paddingLeft + i13, i13 + paddingTop);
        }
    }

    /* renamed from: j */
    public final void m12778j(int i10) {
        int paddingLeft;
        int i11;
        int i12;
        int i13;
        int i14;
        int paddingTop;
        int i15;
        int i16;
        int paddingLeft2;
        int i17;
        int i18;
        int i19;
        int paddingTop2;
        int i20;
        int i21;
        int paddingLeft3;
        int i22;
        int i23;
        int i24;
        int i25;
        int paddingTop3;
        int i26;
        int i27;
        for (int i28 = 0; i28 < i10; i28++) {
            ImageView imageView = (ImageView) getChildAt(i28);
            int i29 = this.f16202j;
            if (i29 == 2) {
                if (i28 == 0) {
                    paddingLeft = getPaddingLeft();
                    paddingTop = getPaddingTop();
                    int i30 = this.f16201i;
                    int i31 = this.f16199g;
                    i15 = (i30 * 2) + paddingLeft + i31;
                    i16 = (i30 * 2) + paddingTop + i31;
                } else {
                    if (i28 == 1) {
                        paddingLeft = getPaddingLeft() + (this.f16201i * 2) + (this.f16199g * 2);
                        paddingTop = getPaddingTop();
                        i11 = this.f16201i;
                    } else {
                        if (i28 == 2) {
                            paddingLeft = getPaddingLeft() + (this.f16201i * 2) + (this.f16199g * 2);
                            int paddingTop4 = getPaddingTop();
                            i11 = this.f16201i;
                            i12 = paddingTop4 + i11;
                            i14 = this.f16199g;
                        } else {
                            if (i28 == 3) {
                                paddingLeft = getPaddingLeft();
                                int paddingTop5 = getPaddingTop();
                                i11 = this.f16201i;
                                i12 = paddingTop5 + (i11 * 2);
                                i13 = this.f16199g;
                            } else if (i28 == 4) {
                                paddingLeft = getPaddingLeft() + this.f16201i + this.f16199g;
                                int paddingTop6 = getPaddingTop();
                                i11 = this.f16201i;
                                i12 = paddingTop6 + (i11 * 2);
                                i13 = this.f16199g;
                            } else {
                                paddingLeft = getPaddingLeft() + (this.f16201i * 2) + (this.f16199g * 2);
                                int paddingTop7 = getPaddingTop();
                                i11 = this.f16201i;
                                i12 = paddingTop7 + (i11 * 2);
                                i13 = this.f16199g;
                            }
                            i14 = i13 * 2;
                        }
                        paddingTop = i12 + i14;
                    }
                    i15 = paddingLeft + i11;
                    i16 = i11 + paddingTop;
                }
                imageView.layout(paddingLeft, paddingTop, i15, i16);
            } else if (i29 == 3) {
                if (i28 == 0) {
                    paddingLeft2 = getPaddingLeft();
                    paddingTop2 = getPaddingTop();
                    i17 = this.f16201i;
                } else if (i28 == 1) {
                    paddingLeft2 = getPaddingLeft() + this.f16201i + this.f16199g;
                    paddingTop2 = getPaddingTop();
                    i17 = this.f16201i;
                } else if (i28 == 2) {
                    paddingLeft2 = getPaddingLeft() + (this.f16201i * 2) + (this.f16199g * 2);
                    paddingTop2 = getPaddingTop();
                    i17 = this.f16201i;
                } else if (i28 == 3) {
                    paddingLeft2 = getPaddingLeft();
                    int paddingTop8 = getPaddingTop();
                    int i32 = this.f16201i;
                    int i33 = this.f16199g;
                    paddingTop2 = paddingTop8 + i32 + i33;
                    int i34 = (i32 * 2) + paddingLeft2 + i33;
                    i20 = (i32 * 2) + paddingTop2 + i33;
                    i21 = i34;
                    imageView.layout(paddingLeft2, paddingTop2, i21, i20);
                } else {
                    if (i28 == 4) {
                        paddingLeft2 = getPaddingLeft() + (this.f16201i * 2) + (this.f16199g * 2);
                        int paddingTop9 = getPaddingTop();
                        i17 = this.f16201i;
                        i18 = paddingTop9 + i17;
                        i19 = this.f16199g;
                    } else {
                        paddingLeft2 = getPaddingLeft() + (this.f16201i * 2) + (this.f16199g * 2);
                        int paddingTop10 = getPaddingTop();
                        i17 = this.f16201i;
                        i18 = paddingTop10 + (i17 * 2);
                        i19 = this.f16199g * 2;
                    }
                    paddingTop2 = i18 + i19;
                }
                i21 = paddingLeft2 + i17;
                i20 = i17 + paddingTop2;
                imageView.layout(paddingLeft2, paddingTop2, i21, i20);
            } else if (i29 == 4) {
                if (i28 == 0) {
                    paddingLeft3 = getPaddingLeft();
                    paddingTop3 = getPaddingTop();
                    i22 = this.f16201i;
                } else if (i28 == 1) {
                    paddingLeft3 = getPaddingLeft() + this.f16201i + this.f16199g;
                    paddingTop3 = getPaddingTop();
                    int i35 = this.f16201i;
                    int i36 = this.f16199g;
                    i26 = (i35 * 2) + paddingLeft3 + i36;
                    i27 = (i35 * 2) + paddingTop3 + i36;
                    imageView.layout(paddingLeft3, paddingTop3, i26, i27);
                } else {
                    if (i28 == 2) {
                        paddingLeft3 = getPaddingLeft();
                        int paddingTop11 = getPaddingTop();
                        i22 = this.f16201i;
                        i23 = paddingTop11 + i22;
                        i25 = this.f16199g;
                    } else {
                        if (i28 == 3) {
                            paddingLeft3 = getPaddingLeft();
                            int paddingTop12 = getPaddingTop();
                            i22 = this.f16201i;
                            i23 = paddingTop12 + (i22 * 2);
                            i24 = this.f16199g;
                        } else if (i28 == 4) {
                            paddingLeft3 = getPaddingLeft() + this.f16201i + this.f16199g;
                            int paddingTop13 = getPaddingTop();
                            i22 = this.f16201i;
                            i23 = paddingTop13 + (i22 * 2);
                            i24 = this.f16199g;
                        } else {
                            paddingLeft3 = getPaddingLeft() + (this.f16201i * 2) + (this.f16199g * 2);
                            int paddingTop14 = getPaddingTop();
                            i22 = this.f16201i;
                            i23 = paddingTop14 + (i22 * 2);
                            i24 = this.f16199g;
                        }
                        i25 = i24 * 2;
                    }
                    paddingTop3 = i23 + i25;
                }
                i26 = paddingLeft3 + i22;
                i27 = i22 + paddingTop3;
                imageView.layout(paddingLeft3, paddingTop3, i26, i27);
            }
        }
    }

    /* renamed from: k */
    public final void m12779k(int i10) {
        int paddingLeft;
        int i11;
        int i12;
        int i13;
        int paddingTop;
        int i14;
        int paddingLeft2;
        int i15;
        int paddingTop2;
        int i16;
        int paddingLeft3;
        int i17;
        int paddingTop3;
        int i18;
        int i19;
        for (int i20 = 0; i20 < i10; i20++) {
            ImageView imageView = (ImageView) getChildAt(i20);
            int i21 = this.f16202j;
            if (i21 == 2) {
                if (i20 == 0) {
                    paddingLeft = getPaddingLeft();
                    paddingTop = getPaddingTop();
                    i11 = this.f16201i;
                    i14 = (i11 * 2) + paddingLeft + this.f16199g;
                } else {
                    if (i20 == 1) {
                        paddingLeft = getPaddingLeft();
                        int paddingTop4 = getPaddingTop();
                        i11 = this.f16201i;
                        i12 = paddingTop4 + i11;
                        i13 = this.f16199g;
                    } else {
                        paddingLeft = getPaddingLeft() + this.f16201i + this.f16199g;
                        int paddingTop5 = getPaddingTop();
                        i11 = this.f16201i;
                        i12 = paddingTop5 + i11;
                        i13 = this.f16199g;
                    }
                    paddingTop = i12 + i13;
                    i14 = paddingLeft + i11;
                }
                imageView.layout(paddingLeft, paddingTop, i14, i11 + paddingTop);
            } else if (i21 == 3) {
                if (i20 == 0) {
                    paddingLeft2 = getPaddingLeft();
                    paddingTop2 = getPaddingTop();
                    i15 = this.f16201i;
                } else if (i20 == 1) {
                    paddingLeft2 = getPaddingLeft() + this.f16201i + this.f16199g;
                    paddingTop2 = getPaddingTop();
                    i15 = this.f16201i;
                } else {
                    paddingLeft2 = getPaddingLeft();
                    int paddingTop6 = getPaddingTop();
                    i15 = this.f16201i;
                    int i22 = this.f16199g;
                    paddingTop2 = paddingTop6 + i15 + i22;
                    i16 = i22 + (i15 * 2) + paddingLeft2;
                    imageView.layout(paddingLeft2, paddingTop2, i16, i15 + paddingTop2);
                }
                i16 = paddingLeft2 + i15;
                imageView.layout(paddingLeft2, paddingTop2, i16, i15 + paddingTop2);
            } else if (i21 == 4) {
                if (i20 == 0) {
                    paddingLeft3 = getPaddingLeft();
                    paddingTop3 = getPaddingTop();
                    int i23 = this.f16201i;
                    i18 = paddingLeft3 + i23;
                    i19 = (i23 * 2) + paddingTop3 + this.f16199g;
                } else {
                    if (i20 == 1) {
                        paddingLeft3 = getPaddingLeft() + this.f16201i + this.f16199g;
                        paddingTop3 = getPaddingTop();
                        i17 = this.f16201i;
                    } else {
                        paddingLeft3 = getPaddingLeft() + this.f16201i + this.f16199g;
                        int paddingTop7 = getPaddingTop();
                        i17 = this.f16201i;
                        paddingTop3 = paddingTop7 + i17 + this.f16199g;
                    }
                    i18 = paddingLeft3 + i17;
                    i19 = paddingTop3 + i17;
                }
                imageView.layout(paddingLeft3, paddingTop3, i18, i19);
            }
        }
    }

    /* renamed from: l */
    public void m12780l(List list, int i10) {
        if (list == null || list.isEmpty()) {
            setVisibility(8);
            return;
        }
        setVisibility(0);
        this.f16202j = i10;
        int iM12772d = m12772d(list.size());
        int[] iArrM12769a = m12769a(iM12772d, this.f16198f);
        this.f16195c = iArrM12769a[0];
        this.f16196d = iArrM12769a[1];
        List list2 = this.f16204l;
        if (list2 == null) {
            for (int i11 = 0; i11 < iM12772d; i11++) {
                ImageView imageViewM12771c = m12771c(i11);
                if (imageViewM12771c == null) {
                    return;
                }
                addView(imageViewM12771c, generateDefaultLayoutParams());
            }
        } else {
            int iM12772d2 = m12772d(list2.size());
            if (iM12772d2 > iM12772d) {
                removeViews(iM12772d, iM12772d2 - iM12772d);
            } else if (iM12772d2 < iM12772d) {
                while (iM12772d2 < iM12772d) {
                    ImageView imageViewM12771c2 = m12771c(iM12772d2);
                    if (imageViewM12771c2 == null) {
                        return;
                    }
                    addView(imageViewM12771c2, generateDefaultLayoutParams());
                    iM12772d2++;
                }
            }
        }
        this.f16204l = list;
        requestLayout();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        m12774f();
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        int i12;
        super.onMeasure(i10, i11);
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        List list = this.f16204l;
        if (list != null && list.size() > 0) {
            if (this.f16204l.size() != 1 || (i12 = this.f16200h) == -1) {
                ((ImageView) this.f16203k.get(0)).setScaleType(ImageView.ScaleType.CENTER_CROP);
                int i13 = this.f16199g;
                int i14 = this.f16196d;
                this.f16201i = (paddingLeft - (i13 * (i14 - 1))) / i14;
            } else {
                this.f16201i = Math.min(i12, paddingLeft);
            }
            int i15 = this.f16201i;
            int i16 = this.f16195c;
            size2 = (i15 * i16) + (this.f16199g * (i16 - 1)) + getPaddingTop() + getPaddingBottom();
        }
        setMeasuredDimension(size, size2);
    }

    public void setGap(int i10) {
        this.f16199g = i10;
    }

    public void setImagesData(List<T> list) {
        m12780l(list, 0);
    }

    public void setMaxSize(int i10) {
        this.f16197e = i10;
    }

    public void setShowStyle(int i10) {
        this.f16198f = i10;
    }

    public void setSingleImgSize(int i10) {
        this.f16200h = i10;
    }

    public NineGridImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f16203k = new ArrayList();
        m12773e(context, attributeSet);
    }

    public void setAdapter(AbstractC10450c abstractC10450c) {
    }

    public void setItemImageClickListener(InterfaceC10448a interfaceC10448a) {
    }

    public void setItemImageLongClickListener(InterfaceC10449b interfaceC10449b) {
    }
}
