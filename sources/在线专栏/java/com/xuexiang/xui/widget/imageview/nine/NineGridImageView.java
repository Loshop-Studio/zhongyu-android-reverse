package com.xuexiang.xui.widget.imageview.nine;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.xuexiang.xui.C2042R;
import com.xuexiang.xui.widget.popupwindow.good.IGoodView;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class NineGridImageView<T> extends ViewGroup {
    public static final int BOTTOMCOLSPAN = 3;
    public static final int LEFTROWSPAN = 4;
    public static final int NOSPAN = 0;
    public static final int STYLE_FILL = 1;
    public static final int STYLE_GRID = 0;
    public static final int TOPCOLSPAN = 2;
    private NineGridImageViewAdapter<T> mAdapter;
    private int mColumnCount;
    private int mGap;
    private int mGridSize;
    private List<ImageView> mImageViewList;
    private List<T> mImgDataList;
    private ItemImageClickListener<T> mItemImageClickListener;
    private ItemImageLongClickListener<T> mItemImageLongClickListener;
    private int mMaxSize;
    private int mRowCount;
    private int mShowStyle;
    private int mSingleImgSize;
    private int mSpanType;

    public NineGridImageView(Context context) {
        this(context, null);
    }

    private void generateUnitRowAndColumnForSpanType(int i4, int[] iArr) {
        if (i4 <= 2) {
            iArr[0] = 1;
            iArr[1] = i4;
            return;
        }
        if (i4 == 3) {
            int i5 = this.mSpanType;
            if (i5 == 2 || i5 == 3 || i5 == 4) {
                iArr[0] = 2;
                iArr[1] = 2;
                return;
            } else {
                iArr[0] = 1;
                iArr[1] = 3;
                return;
            }
        }
        if (i4 > 6) {
            iArr[0] = (i4 / 3) + (i4 % 3 == 0 ? 0 : 1);
            iArr[1] = 3;
            return;
        }
        int i6 = this.mSpanType;
        if (i6 == 2 || i6 == 3 || i6 == 4) {
            iArr[0] = 3;
            iArr[1] = 3;
        } else {
            iArr[0] = 2;
            iArr[1] = (i4 / 2) + (i4 % 2);
        }
    }

    private ImageView getImageView(final int i4) {
        if (i4 < this.mImageViewList.size()) {
            return this.mImageViewList.get(i4);
        }
        NineGridImageViewAdapter<T> nineGridImageViewAdapter = this.mAdapter;
        if (nineGridImageViewAdapter == null) {
            Log.e("NineGirdImageView", "Your must set a NineGridImageViewAdapter for NineGirdImageView");
            return null;
        }
        ImageView imageViewGenerateImageView = nineGridImageViewAdapter.generateImageView(getContext());
        this.mImageViewList.add(imageViewGenerateImageView);
        imageViewGenerateImageView.setOnClickListener(new View.OnClickListener() { // from class: com.xuexiang.xui.widget.imageview.nine.NineGridImageView.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ImageView imageView = (ImageView) view;
                NineGridImageView.this.mAdapter.onItemImageClick(imageView, i4, NineGridImageView.this.mImgDataList);
                if (NineGridImageView.this.mItemImageClickListener != null) {
                    NineGridImageView.this.mItemImageClickListener.onItemImageClick(imageView, i4, NineGridImageView.this.mImgDataList);
                }
            }
        });
        imageViewGenerateImageView.setOnLongClickListener(new View.OnLongClickListener() { // from class: com.xuexiang.xui.widget.imageview.nine.NineGridImageView.2
            @Override // android.view.View.OnLongClickListener
            public boolean onLongClick(View view) {
                ImageView imageView = (ImageView) view;
                boolean zOnItemImageLongClick = NineGridImageView.this.mAdapter.onItemImageLongClick(imageView, i4, NineGridImageView.this.mImgDataList);
                return NineGridImageView.this.mItemImageLongClickListener != null ? NineGridImageView.this.mItemImageLongClickListener.onItemImageLongClick(imageView, i4, NineGridImageView.this.mImgDataList) || zOnItemImageLongClick : zOnItemImageLongClick;
            }
        });
        return imageViewGenerateImageView;
    }

    private int getNeedShowCount(int i4) {
        int i5 = this.mMaxSize;
        return (i5 <= 0 || i4 <= i5) ? i4 : i5;
    }

    private void initAttrs(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2042R.styleable.NineGridImageView);
        this.mGap = (int) typedArrayObtainStyledAttributes.getDimension(C2042R.styleable.NineGridImageView_ngiv_imgGap, IGoodView.DEFAULT_TO_ALPHA);
        this.mSingleImgSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(C2042R.styleable.NineGridImageView_ngiv_singleImgSize, -1);
        this.mShowStyle = typedArrayObtainStyledAttributes.getInt(C2042R.styleable.NineGridImageView_ngiv_showStyle, 0);
        this.mMaxSize = typedArrayObtainStyledAttributes.getInt(C2042R.styleable.NineGridImageView_ngiv_maxSize, 9);
        typedArrayObtainStyledAttributes.recycle();
    }

    private void layoutChildrenView() {
        List<T> list = this.mImgDataList;
        if (list == null) {
            return;
        }
        int needShowCount = getNeedShowCount(list.size());
        if (this.mSpanType == 0 || needShowCount <= 2) {
            layoutForNoSpanChildrenView(needShowCount);
            return;
        }
        if (needShowCount == 3) {
            layoutForThreeChildrenView(needShowCount);
            return;
        }
        if (needShowCount == 4) {
            layoutForFourChildrenView(needShowCount);
            return;
        }
        if (needShowCount == 5) {
            layoutForFiveChildrenView(needShowCount);
        } else if (needShowCount != 6) {
            layoutForNoSpanChildrenView(needShowCount);
        } else {
            layoutForSixChildrenView(needShowCount);
        }
    }

    private void layoutForFiveChildrenView(int i4) {
        int paddingLeft;
        int i5;
        int i6;
        int i7;
        int paddingTop;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int paddingLeft2;
        int i13;
        int i14;
        int paddingTop2;
        int i15;
        int i16;
        int i17;
        int i18;
        int paddingLeft3;
        int i19;
        int paddingTop3;
        int i20;
        int i21;
        int i22;
        for (int i23 = 0; i23 < i4; i23++) {
            ImageView imageView = (ImageView) getChildAt(i23);
            int i24 = this.mSpanType;
            if (i24 == 2) {
                if (i23 == 0) {
                    paddingLeft = getPaddingLeft();
                    paddingTop = getPaddingTop();
                    i10 = this.mGridSize;
                    i11 = this.mGap;
                    i12 = ((i10 * 3) + i11) / 2;
                } else if (i23 == 1) {
                    int paddingLeft4 = getPaddingLeft();
                    int i25 = this.mGridSize * 3;
                    int i26 = this.mGap;
                    paddingLeft = paddingLeft4 + ((i25 + i26) / 2) + i26;
                    paddingTop = getPaddingTop();
                    i10 = this.mGridSize;
                    i11 = this.mGap;
                    i12 = ((i10 * 3) + i11) / 2;
                } else {
                    if (i23 == 2) {
                        paddingLeft = getPaddingLeft();
                        int paddingTop4 = getPaddingTop();
                        i5 = this.mGridSize;
                        i6 = paddingTop4 + (i5 * 2);
                        i7 = this.mGap;
                    } else if (i23 == 3) {
                        paddingLeft = getPaddingLeft() + this.mGridSize + this.mGap;
                        int paddingTop5 = getPaddingTop();
                        i5 = this.mGridSize;
                        i6 = paddingTop5 + (i5 * 2);
                        i7 = this.mGap;
                    } else {
                        paddingLeft = getPaddingLeft() + (this.mGridSize * 2) + (this.mGap * 2);
                        int paddingTop6 = getPaddingTop();
                        i5 = this.mGridSize;
                        i6 = paddingTop6 + (i5 * 2);
                        i7 = this.mGap;
                    }
                    paddingTop = i6 + (i7 * 2);
                    i8 = paddingLeft + i5;
                    i9 = i5 + paddingTop;
                    imageView.layout(paddingLeft, paddingTop, i8, i9);
                }
                i8 = i12 + paddingLeft;
                i9 = (i10 * 2) + paddingTop + i11;
                imageView.layout(paddingLeft, paddingTop, i8, i9);
            } else if (i24 == 3) {
                if (i23 == 0) {
                    paddingLeft2 = getPaddingLeft();
                    paddingTop2 = getPaddingTop();
                    i18 = this.mGridSize;
                } else if (i23 == 1) {
                    paddingLeft2 = getPaddingLeft() + this.mGridSize + this.mGap;
                    paddingTop2 = getPaddingTop();
                    i18 = this.mGridSize;
                } else if (i23 == 2) {
                    paddingLeft2 = getPaddingLeft() + (this.mGridSize * 2) + (this.mGap * 2);
                    paddingTop2 = getPaddingTop();
                    i18 = this.mGridSize;
                } else {
                    if (i23 == 3) {
                        paddingLeft2 = getPaddingLeft();
                        int paddingTop7 = getPaddingTop();
                        i13 = this.mGridSize;
                        i14 = this.mGap;
                        paddingTop2 = paddingTop7 + i13 + i14;
                        i15 = ((i13 * 3) + i14) / 2;
                    } else {
                        int paddingLeft5 = getPaddingLeft();
                        int i27 = this.mGridSize * 3;
                        int i28 = this.mGap;
                        paddingLeft2 = paddingLeft5 + ((i27 + i28) / 2) + i28;
                        int paddingTop8 = getPaddingTop();
                        i13 = this.mGridSize;
                        i14 = this.mGap;
                        paddingTop2 = paddingTop8 + i13 + i14;
                        i15 = ((i13 * 3) + i14) / 2;
                    }
                    i16 = (i13 * 2) + paddingTop2 + i14;
                    i17 = i15 + paddingLeft2;
                    imageView.layout(paddingLeft2, paddingTop2, i17, i16);
                }
                i17 = paddingLeft2 + i18;
                i16 = i18 + paddingTop2;
                imageView.layout(paddingLeft2, paddingTop2, i17, i16);
            } else if (i24 == 4) {
                if (i23 == 0) {
                    paddingLeft3 = getPaddingLeft();
                    paddingTop3 = getPaddingTop();
                    int i29 = this.mGridSize;
                    int i30 = this.mGap;
                    i20 = (i29 * 2) + paddingLeft3 + i30;
                    i22 = ((i29 * 3) + i30) / 2;
                } else if (i23 == 1) {
                    paddingLeft3 = getPaddingLeft();
                    int paddingTop9 = getPaddingTop();
                    int i31 = this.mGridSize;
                    int i32 = this.mGap;
                    paddingTop3 = paddingTop9 + (((i31 * 3) + i32) / 2) + i32;
                    i20 = (i31 * 2) + paddingLeft3 + i32;
                    i22 = ((i31 * 3) + i32) / 2;
                } else {
                    if (i23 == 2) {
                        paddingLeft3 = getPaddingLeft() + (this.mGridSize * 2) + (this.mGap * 2);
                        paddingTop3 = getPaddingTop();
                        i19 = this.mGridSize;
                    } else if (i23 == 3) {
                        paddingLeft3 = getPaddingLeft() + (this.mGridSize * 2) + (this.mGap * 2);
                        int paddingTop10 = getPaddingTop();
                        i19 = this.mGridSize;
                        paddingTop3 = paddingTop10 + i19 + this.mGap;
                    } else {
                        paddingLeft3 = getPaddingLeft() + (this.mGridSize * 2) + (this.mGap * 2);
                        int paddingTop11 = getPaddingTop();
                        i19 = this.mGridSize;
                        paddingTop3 = paddingTop11 + (i19 * 2) + (this.mGap * 2);
                    }
                    i20 = paddingLeft3 + i19;
                    i21 = paddingTop3 + i19;
                    imageView.layout(paddingLeft3, paddingTop3, i20, i21);
                }
                i21 = i22 + paddingTop3;
                imageView.layout(paddingLeft3, paddingTop3, i20, i21);
            }
            NineGridImageViewAdapter<T> nineGridImageViewAdapter = this.mAdapter;
            if (nineGridImageViewAdapter != null) {
                nineGridImageViewAdapter.onDisplayImage(getContext(), imageView, this.mImgDataList.get(i23));
            }
        }
    }

    private void layoutForFourChildrenView(int i4) {
        int paddingLeft;
        int i5;
        int i6;
        int i7;
        int paddingTop;
        int i8;
        int i9;
        int paddingLeft2;
        int paddingTop2;
        int i10;
        int i11;
        int i12;
        int paddingLeft3;
        int paddingTop3;
        int i13;
        int i14;
        int i15;
        for (int i16 = 0; i16 < i4; i16++) {
            ImageView imageView = (ImageView) getChildAt(i16);
            int i17 = this.mSpanType;
            if (i17 == 2) {
                if (i16 == 0) {
                    paddingLeft = getPaddingLeft();
                    paddingTop = getPaddingTop();
                    int i18 = this.mGridSize;
                    int i19 = this.mGap;
                    i8 = (i18 * 3) + paddingLeft + (i19 * 2);
                    i9 = (i18 * 2) + paddingTop + i19;
                } else {
                    if (i16 == 1) {
                        paddingLeft = getPaddingLeft();
                        int paddingTop4 = getPaddingTop();
                        i5 = this.mGridSize;
                        i6 = paddingTop4 + (i5 * 2);
                        i7 = this.mGap;
                    } else if (i16 == 2) {
                        paddingLeft = getPaddingLeft() + this.mGridSize + this.mGap;
                        int paddingTop5 = getPaddingTop();
                        i5 = this.mGridSize;
                        i6 = paddingTop5 + (i5 * 2);
                        i7 = this.mGap;
                    } else {
                        paddingLeft = getPaddingLeft() + (this.mGridSize * 2) + (this.mGap * 2);
                        int paddingTop6 = getPaddingTop();
                        i5 = this.mGridSize;
                        i6 = paddingTop6 + (i5 * 2);
                        i7 = this.mGap;
                    }
                    paddingTop = i6 + (i7 * 2);
                    i8 = paddingLeft + i5;
                    i9 = i5 + paddingTop;
                }
                imageView.layout(paddingLeft, paddingTop, i8, i9);
            } else if (i17 == 3) {
                if (i16 == 0) {
                    paddingLeft2 = getPaddingLeft();
                    paddingTop2 = getPaddingTop();
                    i12 = this.mGridSize;
                } else if (i16 == 1) {
                    paddingLeft2 = getPaddingLeft() + this.mGridSize + this.mGap;
                    paddingTop2 = getPaddingTop();
                    i12 = this.mGridSize;
                } else if (i16 == 2) {
                    paddingLeft2 = getPaddingLeft() + (this.mGridSize * 2) + (this.mGap * 2);
                    paddingTop2 = getPaddingTop();
                    i12 = this.mGridSize;
                } else {
                    paddingLeft2 = getPaddingLeft();
                    int paddingTop7 = getPaddingTop();
                    int i20 = this.mGridSize;
                    int i21 = this.mGap;
                    paddingTop2 = paddingTop7 + i20 + i21;
                    i10 = (i20 * 2) + paddingTop2 + i21;
                    i11 = (i20 * 3) + paddingLeft2 + (i21 * 2);
                    imageView.layout(paddingLeft2, paddingTop2, i11, i10);
                }
                i11 = paddingLeft2 + i12;
                i10 = i12 + paddingTop2;
                imageView.layout(paddingLeft2, paddingTop2, i11, i10);
            } else if (i17 == 4) {
                if (i16 == 0) {
                    paddingLeft3 = getPaddingLeft();
                    paddingTop3 = getPaddingTop();
                    int i22 = this.mGridSize;
                    int i23 = this.mGap;
                    i13 = (i22 * 2) + paddingLeft3 + i23;
                    i14 = (i22 * 3) + paddingTop3 + (i23 * 2);
                } else {
                    if (i16 == 1) {
                        paddingLeft3 = getPaddingLeft() + (this.mGridSize * 2) + (this.mGap * 2);
                        paddingTop3 = getPaddingTop();
                        i15 = this.mGridSize;
                    } else if (i16 == 2) {
                        paddingLeft3 = getPaddingLeft() + (this.mGridSize * 2) + (this.mGap * 2);
                        int paddingTop8 = getPaddingTop();
                        i15 = this.mGridSize;
                        paddingTop3 = paddingTop8 + i15 + this.mGap;
                    } else {
                        paddingLeft3 = getPaddingLeft() + (this.mGridSize * 2) + (this.mGap * 2);
                        int paddingTop9 = getPaddingTop();
                        int i24 = this.mGridSize;
                        paddingTop3 = paddingTop9 + (i24 * 2) + (this.mGap * 2);
                        i13 = paddingLeft3 + i24;
                        i14 = paddingTop3 + i24;
                    }
                    i13 = paddingLeft3 + i15;
                    i14 = paddingTop3 + i15;
                }
                imageView.layout(paddingLeft3, paddingTop3, i13, i14);
            }
            NineGridImageViewAdapter<T> nineGridImageViewAdapter = this.mAdapter;
            if (nineGridImageViewAdapter != null) {
                nineGridImageViewAdapter.onDisplayImage(getContext(), imageView, this.mImgDataList.get(i16));
            }
        }
    }

    private void layoutForNoSpanChildrenView(int i4) {
        if (i4 <= 0) {
            return;
        }
        for (int i5 = 0; i5 < i4; i5++) {
            ImageView imageView = (ImageView) getChildAt(i5);
            int i6 = this.mColumnCount;
            int paddingLeft = ((this.mGridSize + this.mGap) * (i5 % i6)) + getPaddingLeft();
            int paddingTop = ((this.mGridSize + this.mGap) * (i5 / i6)) + getPaddingTop();
            int i7 = this.mGridSize;
            imageView.layout(paddingLeft, paddingTop, paddingLeft + i7, i7 + paddingTop);
            NineGridImageViewAdapter<T> nineGridImageViewAdapter = this.mAdapter;
            if (nineGridImageViewAdapter != null) {
                nineGridImageViewAdapter.onDisplayImage(getContext(), imageView, this.mImgDataList.get(i5));
            }
        }
    }

    private void layoutForSixChildrenView(int i4) {
        int paddingLeft;
        int i5;
        int i6;
        int i7;
        int i8;
        int paddingTop;
        int i9;
        int i10;
        int paddingLeft2;
        int i11;
        int i12;
        int i13;
        int paddingTop2;
        int i14;
        int i15;
        int paddingLeft3;
        int i16;
        int i17;
        int i18;
        int i19;
        int paddingTop3;
        int i20;
        int i21;
        for (int i22 = 0; i22 < i4; i22++) {
            ImageView imageView = (ImageView) getChildAt(i22);
            int i23 = this.mSpanType;
            if (i23 == 2) {
                if (i22 == 0) {
                    paddingLeft = getPaddingLeft();
                    paddingTop = getPaddingTop();
                    int i24 = this.mGridSize;
                    int i25 = this.mGap;
                    i9 = (i24 * 2) + paddingLeft + i25;
                    i10 = (i24 * 2) + paddingTop + i25;
                } else {
                    if (i22 == 1) {
                        paddingLeft = getPaddingLeft() + (this.mGridSize * 2) + (this.mGap * 2);
                        paddingTop = getPaddingTop();
                        i5 = this.mGridSize;
                    } else {
                        if (i22 == 2) {
                            paddingLeft = getPaddingLeft() + (this.mGridSize * 2) + (this.mGap * 2);
                            int paddingTop4 = getPaddingTop();
                            i5 = this.mGridSize;
                            i6 = paddingTop4 + i5;
                            i8 = this.mGap;
                        } else {
                            if (i22 == 3) {
                                paddingLeft = getPaddingLeft();
                                int paddingTop5 = getPaddingTop();
                                i5 = this.mGridSize;
                                i6 = paddingTop5 + (i5 * 2);
                                i7 = this.mGap;
                            } else if (i22 == 4) {
                                paddingLeft = getPaddingLeft() + this.mGridSize + this.mGap;
                                int paddingTop6 = getPaddingTop();
                                i5 = this.mGridSize;
                                i6 = paddingTop6 + (i5 * 2);
                                i7 = this.mGap;
                            } else {
                                paddingLeft = getPaddingLeft() + (this.mGridSize * 2) + (this.mGap * 2);
                                int paddingTop7 = getPaddingTop();
                                i5 = this.mGridSize;
                                i6 = paddingTop7 + (i5 * 2);
                                i7 = this.mGap;
                            }
                            i8 = i7 * 2;
                        }
                        paddingTop = i6 + i8;
                    }
                    i9 = paddingLeft + i5;
                    i10 = i5 + paddingTop;
                }
                imageView.layout(paddingLeft, paddingTop, i9, i10);
            } else if (i23 == 3) {
                if (i22 == 0) {
                    paddingLeft2 = getPaddingLeft();
                    paddingTop2 = getPaddingTop();
                    i11 = this.mGridSize;
                } else if (i22 == 1) {
                    paddingLeft2 = getPaddingLeft() + this.mGridSize + this.mGap;
                    paddingTop2 = getPaddingTop();
                    i11 = this.mGridSize;
                } else if (i22 == 2) {
                    paddingLeft2 = getPaddingLeft() + (this.mGridSize * 2) + (this.mGap * 2);
                    paddingTop2 = getPaddingTop();
                    i11 = this.mGridSize;
                } else if (i22 == 3) {
                    paddingLeft2 = getPaddingLeft();
                    int paddingTop8 = getPaddingTop();
                    int i26 = this.mGridSize;
                    int i27 = this.mGap;
                    paddingTop2 = paddingTop8 + i26 + i27;
                    int i28 = (i26 * 2) + paddingLeft2 + i27;
                    i14 = (i26 * 2) + paddingTop2 + i27;
                    i15 = i28;
                    imageView.layout(paddingLeft2, paddingTop2, i15, i14);
                } else {
                    if (i22 == 4) {
                        paddingLeft2 = getPaddingLeft() + (this.mGridSize * 2) + (this.mGap * 2);
                        int paddingTop9 = getPaddingTop();
                        i11 = this.mGridSize;
                        i12 = paddingTop9 + i11;
                        i13 = this.mGap;
                    } else {
                        paddingLeft2 = getPaddingLeft() + (this.mGridSize * 2) + (this.mGap * 2);
                        int paddingTop10 = getPaddingTop();
                        i11 = this.mGridSize;
                        i12 = paddingTop10 + (i11 * 2);
                        i13 = this.mGap * 2;
                    }
                    paddingTop2 = i12 + i13;
                }
                i15 = paddingLeft2 + i11;
                i14 = i11 + paddingTop2;
                imageView.layout(paddingLeft2, paddingTop2, i15, i14);
            } else if (i23 == 4) {
                if (i22 == 0) {
                    paddingLeft3 = getPaddingLeft();
                    paddingTop3 = getPaddingTop();
                    i16 = this.mGridSize;
                } else if (i22 == 1) {
                    paddingLeft3 = getPaddingLeft() + this.mGridSize + this.mGap;
                    paddingTop3 = getPaddingTop();
                    int i29 = this.mGridSize;
                    int i30 = this.mGap;
                    i20 = (i29 * 2) + paddingLeft3 + i30;
                    i21 = (i29 * 2) + paddingTop3 + i30;
                    imageView.layout(paddingLeft3, paddingTop3, i20, i21);
                } else {
                    if (i22 == 2) {
                        paddingLeft3 = getPaddingLeft();
                        int paddingTop11 = getPaddingTop();
                        i16 = this.mGridSize;
                        i17 = paddingTop11 + i16;
                        i19 = this.mGap;
                    } else {
                        if (i22 == 3) {
                            paddingLeft3 = getPaddingLeft();
                            int paddingTop12 = getPaddingTop();
                            i16 = this.mGridSize;
                            i17 = paddingTop12 + (i16 * 2);
                            i18 = this.mGap;
                        } else if (i22 == 4) {
                            paddingLeft3 = getPaddingLeft() + this.mGridSize + this.mGap;
                            int paddingTop13 = getPaddingTop();
                            i16 = this.mGridSize;
                            i17 = paddingTop13 + (i16 * 2);
                            i18 = this.mGap;
                        } else {
                            paddingLeft3 = getPaddingLeft() + (this.mGridSize * 2) + (this.mGap * 2);
                            int paddingTop14 = getPaddingTop();
                            i16 = this.mGridSize;
                            i17 = paddingTop14 + (i16 * 2);
                            i18 = this.mGap;
                        }
                        i19 = i18 * 2;
                    }
                    paddingTop3 = i17 + i19;
                }
                i20 = paddingLeft3 + i16;
                i21 = i16 + paddingTop3;
                imageView.layout(paddingLeft3, paddingTop3, i20, i21);
            }
            NineGridImageViewAdapter<T> nineGridImageViewAdapter = this.mAdapter;
            if (nineGridImageViewAdapter != null) {
                nineGridImageViewAdapter.onDisplayImage(getContext(), imageView, this.mImgDataList.get(i22));
            }
        }
    }

    private void layoutForThreeChildrenView(int i4) {
        int paddingLeft;
        int i5;
        int i6;
        int i7;
        int paddingTop;
        int i8;
        int paddingLeft2;
        int i9;
        int paddingTop2;
        int i10;
        int paddingLeft3;
        int i11;
        int paddingTop3;
        int i12;
        int i13;
        for (int i14 = 0; i14 < i4; i14++) {
            ImageView imageView = (ImageView) getChildAt(i14);
            int i15 = this.mSpanType;
            if (i15 == 2) {
                if (i14 == 0) {
                    paddingLeft = getPaddingLeft();
                    paddingTop = getPaddingTop();
                    i5 = this.mGridSize;
                    i8 = (i5 * 2) + paddingLeft + this.mGap;
                } else {
                    if (i14 == 1) {
                        paddingLeft = getPaddingLeft();
                        int paddingTop4 = getPaddingTop();
                        i5 = this.mGridSize;
                        i6 = paddingTop4 + i5;
                        i7 = this.mGap;
                    } else {
                        paddingLeft = getPaddingLeft() + this.mGridSize + this.mGap;
                        int paddingTop5 = getPaddingTop();
                        i5 = this.mGridSize;
                        i6 = paddingTop5 + i5;
                        i7 = this.mGap;
                    }
                    paddingTop = i6 + i7;
                    i8 = paddingLeft + i5;
                }
                imageView.layout(paddingLeft, paddingTop, i8, i5 + paddingTop);
            } else if (i15 == 3) {
                if (i14 == 0) {
                    paddingLeft2 = getPaddingLeft();
                    paddingTop2 = getPaddingTop();
                    i9 = this.mGridSize;
                } else if (i14 == 1) {
                    paddingLeft2 = getPaddingLeft() + this.mGridSize + this.mGap;
                    paddingTop2 = getPaddingTop();
                    i9 = this.mGridSize;
                } else {
                    paddingLeft2 = getPaddingLeft();
                    int paddingTop6 = getPaddingTop();
                    i9 = this.mGridSize;
                    int i16 = this.mGap;
                    paddingTop2 = paddingTop6 + i9 + i16;
                    i10 = i16 + (i9 * 2) + paddingLeft2;
                    imageView.layout(paddingLeft2, paddingTop2, i10, i9 + paddingTop2);
                }
                i10 = paddingLeft2 + i9;
                imageView.layout(paddingLeft2, paddingTop2, i10, i9 + paddingTop2);
            } else if (i15 == 4) {
                if (i14 == 0) {
                    paddingLeft3 = getPaddingLeft();
                    paddingTop3 = getPaddingTop();
                    int i17 = this.mGridSize;
                    i12 = paddingLeft3 + i17;
                    i13 = (i17 * 2) + paddingTop3 + this.mGap;
                } else {
                    if (i14 == 1) {
                        paddingLeft3 = getPaddingLeft() + this.mGridSize + this.mGap;
                        paddingTop3 = getPaddingTop();
                        i11 = this.mGridSize;
                    } else {
                        paddingLeft3 = getPaddingLeft() + this.mGridSize + this.mGap;
                        int paddingTop7 = getPaddingTop();
                        i11 = this.mGridSize;
                        paddingTop3 = paddingTop7 + i11 + this.mGap;
                    }
                    i12 = paddingLeft3 + i11;
                    i13 = paddingTop3 + i11;
                }
                imageView.layout(paddingLeft3, paddingTop3, i12, i13);
            }
            NineGridImageViewAdapter<T> nineGridImageViewAdapter = this.mAdapter;
            if (nineGridImageViewAdapter != null) {
                nineGridImageViewAdapter.onDisplayImage(getContext(), imageView, this.mImgDataList.get(i14));
            }
        }
    }

    protected int[] calculateGridParam(int i4, int i5) {
        int[] iArr = new int[2];
        if (i5 != 1) {
            iArr[0] = (i4 / 3) + (i4 % 3 == 0 ? 0 : 1);
            iArr[1] = 3;
        } else {
            generateUnitRowAndColumnForSpanType(i4, iArr);
        }
        return iArr;
    }

    public T getImgDataItem(int i4) {
        List<T> list = this.mImgDataList;
        if (list == null || i4 >= list.size()) {
            return null;
        }
        return this.mImgDataList.get(i4);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z3, int i4, int i5, int i6, int i7) {
        layoutChildrenView();
    }

    @Override // android.view.View
    protected void onMeasure(int i4, int i5) {
        int i6;
        super.onMeasure(i4, i5);
        int size = View.MeasureSpec.getSize(i4);
        int size2 = View.MeasureSpec.getSize(i5);
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        List<T> list = this.mImgDataList;
        if (list != null && list.size() > 0) {
            if (this.mImgDataList.size() != 1 || (i6 = this.mSingleImgSize) == -1) {
                this.mImageViewList.get(0).setScaleType(ImageView.ScaleType.CENTER_CROP);
                int i7 = this.mGap;
                int i8 = this.mColumnCount;
                this.mGridSize = (paddingLeft - (i7 * (i8 - 1))) / i8;
            } else {
                this.mGridSize = Math.min(i6, paddingLeft);
            }
            int i9 = this.mGridSize;
            int i10 = this.mRowCount;
            size2 = (i9 * i10) + (this.mGap * (i10 - 1)) + getPaddingTop() + getPaddingBottom();
        }
        setMeasuredDimension(size, size2);
    }

    public void setAdapter(NineGridImageViewAdapter nineGridImageViewAdapter) {
        this.mAdapter = nineGridImageViewAdapter;
    }

    public void setGap(int i4) {
        this.mGap = i4;
    }

    public void setImagesData(List<T> list) {
        setImagesData(list, 0);
    }

    public void setItemImageClickListener(ItemImageClickListener<T> itemImageClickListener) {
        this.mItemImageClickListener = itemImageClickListener;
    }

    public void setItemImageLongClickListener(ItemImageLongClickListener<T> itemImageLongClickListener) {
        this.mItemImageLongClickListener = itemImageLongClickListener;
    }

    public void setMaxSize(int i4) {
        this.mMaxSize = i4;
    }

    public void setShowStyle(int i4) {
        this.mShowStyle = i4;
    }

    public void setSingleImgSize(int i4) {
        this.mSingleImgSize = i4;
    }

    public NineGridImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mImageViewList = new ArrayList();
        initAttrs(context, attributeSet);
    }

    public void setImagesData(List<T> list, int i4) {
        if (list == null || list.isEmpty()) {
            setVisibility(8);
            return;
        }
        setVisibility(0);
        this.mSpanType = i4;
        int needShowCount = getNeedShowCount(list.size());
        int[] iArrCalculateGridParam = calculateGridParam(needShowCount, this.mShowStyle);
        this.mRowCount = iArrCalculateGridParam[0];
        this.mColumnCount = iArrCalculateGridParam[1];
        List<T> list2 = this.mImgDataList;
        if (list2 == null) {
            for (int i5 = 0; i5 < needShowCount; i5++) {
                ImageView imageView = getImageView(i5);
                if (imageView == null) {
                    return;
                }
                addView(imageView, generateDefaultLayoutParams());
            }
        } else {
            int needShowCount2 = getNeedShowCount(list2.size());
            if (needShowCount2 > needShowCount) {
                removeViews(needShowCount, needShowCount2 - needShowCount);
            } else if (needShowCount2 < needShowCount) {
                while (needShowCount2 < needShowCount) {
                    ImageView imageView2 = getImageView(needShowCount2);
                    if (imageView2 == null) {
                        return;
                    }
                    addView(imageView2, generateDefaultLayoutParams());
                    needShowCount2++;
                }
            }
        }
        this.mImgDataList = list;
        requestLayout();
    }
}
