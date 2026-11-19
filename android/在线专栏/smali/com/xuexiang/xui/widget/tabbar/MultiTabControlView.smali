.class public Lcom/xuexiang/xui/widget/tabbar/MultiTabControlView;
.super Landroid/widget/LinearLayout;
.source "SourceFile"

# interfaces
.implements Lio/github/inflationx/calligraphy3/HasTypeface;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/xuexiang/xui/widget/tabbar/MultiTabControlView$OnMultiTabSelectionChangedListener;
    }
.end annotation


# instance fields
.field private mCheckBoxListener:Landroid/widget/CompoundButton$OnCheckedChangeListener;

.field private mContext:Landroid/content/Context;

.field private mDefaultSelectionList:[I

.field private mEqualWidth:Z

.field private mItemMap:Ljava/util/LinkedHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/LinkedHashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private mItemPadding:I

.field private mItemPaddingHorizontal:I

.field private mItemPaddingVertical:I

.field private mListener:Lcom/xuexiang/xui/widget/tabbar/MultiTabControlView$OnMultiTabSelectionChangedListener;

.field private mOptions:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroid/widget/CheckBox;",
            ">;"
        }
    .end annotation
.end field

.field private mSelectedColor:I

.field private mSelectedTextColor:I

.field private mStretch:Z

.field private mStrokeWidth:I

.field private mTextColorStateList:Landroid/content/res/ColorStateList;

.field private mTextSize:I

.field private mUnselectedColor:I

.field private mUnselectedTextColor:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/tabbar/MultiTabControlView;->mStretch:Z

    .line 3
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/tabbar/MultiTabControlView;->mEqualWidth:Z

    .line 4
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/MultiTabControlView;->mItemMap:Ljava/util/LinkedHashMap;

    .line 5
    new-instance v0, Lcom/xuexiang/xui/widget/tabbar/MultiTabControlView$1;

    invoke-direct {v0, p0}, Lcom/xuexiang/xui/widget/tabbar/MultiTabControlView$1;-><init>(Lcom/xuexiang/xui/widget/tabbar/MultiTabControlView;)V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/MultiTabControlView;->mCheckBoxListener:Landroid/widget/CompoundButton$OnCheckedChangeListener;

    .line 6
    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/tabbar/MultiTabControlView;->init(Landroid/content/Context;)V

    .line 7
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/tabbar/MultiTabControlView;->update()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 8
    invoke-direct {p0, p1, p2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 v0, 0x0

    .line 9
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/tabbar/MultiTabControlView;->mStretch:Z

    .line 10
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/tabbar/MultiTabControlView;->mEqualWidth:Z

    .line 11
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/MultiTabControlView;->mItemMap:Ljava/util/LinkedHashMap;

    .line 12
    new-instance v0, Lcom/xuexiang/xui/widget/tabbar/MultiTabControlView$1;

    invoke-direct {v0, p0}, Lcom/xuexiang/xui/widget/tabbar/MultiTabControlView$1;-><init>(Lcom/xuexiang/xui/widget/tabbar/MultiTabControlView;)V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/MultiTabControlView;->mCheckBoxListener:Landroid/widget/CompoundButton$OnCheckedChangeListener;

    .line 13
    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/tabbar/MultiTabControlView;->init(Landroid/content/Context;)V

    .line 14
    invoke-direct {p0, p1, p2}, Lcom/xuexiang/xui/widget/tabbar/MultiTabControlView;->initAttrs(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 15
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/tabbar/MultiTabControlView;->update()V

    return-void
.end method

.method static synthetic access$000(Lcom/xuexiang/xui/widget/tabbar/MultiTabControlView;)Lcom/xuexiang/xui/widget/tabbar/MultiTabControlView$OnMultiTabSelectionChangedListener;
    .locals 0

    iget-object p0, p0, Lcom/xuexiang/xui/widget/tabbar/MultiTabControlView;->mListener:Lcom/xuexiang/xui/widget/tabbar/MultiTabControlView$OnMultiTabSelectionChangedListener;

    return-object p0
.end method

.method static synthetic access$100(Lcom/xuexiang/xui/widget/tabbar/MultiTabControlView;)Ljava/util/LinkedHashMap;
    .locals 0

    iget-object p0, p0, Lcom/xuexiang/xui/widget/tabbar/MultiTabControlView;->mItemMap:Ljava/util/LinkedHashMap;

    return-object p0
.end method

.method private addOnCheckedChangeListener(Landroid/widget/CheckBox;)V
    .locals 1

    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/MultiTabControlView;->mCheckBoxListener:Landroid/widget/CompoundButton$OnCheckedChangeListener;

    invoke-virtual {p1, v0}, Landroid/widget/CheckBox;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    :cond_0
    return-void
.end method

.method private getTitleByValue(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/MultiTabControlView;->mItemMap:Ljava/util/LinkedHashMap;

    invoke-virtual {v0, p1}, Ljava/util/LinkedHashMap;->containsValue(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/MultiTabControlView;->mItemMap:Ljava/util/LinkedHashMap;

    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 3
    iget-object v2, p0, Lcom/xuexiang/xui/widget/tabbar/MultiTabControlView;->mItemMap:Ljava/util/LinkedHashMap;

    invoke-virtual {v2, v1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    if-eqz v2, :cond_0

    .line 4
    invoke-virtual {v2, p1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    return-object v1

    :cond_1
    const-string p1, ""

    return-object p1
.end method

.method private init(Landroid/content/Context;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/MultiTabControlView;->mContext:Landroid/content/Context;

    const/16 p1, 0xa

    .line 2
    invoke-virtual {p0, p1, p1, p1, p1}, Landroid/widget/LinearLayout;->setPadding(IIII)V

    return-void
.end method

.method private initAttrs(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v0

    sget-object v1, Lcom/xuexiang/xui/R$styleable;->TabControlView:[I

    const/4 v2, 0x0

    invoke-virtual {v0, p2, v1, v2, v2}, Landroid/content/res/Resources$Theme;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p2

    .line 2
    :try_start_0
    sget v0, Lcom/xuexiang/xui/R$styleable;->TabControlView_tcv_textSize:I

    sget v1, Lcom/xuexiang/xui/R$dimen;->default_tcv_text_size:I

    invoke-static {v1}, Lcom/xuexiang/xui/utils/ResUtils;->getDimensionPixelSize(I)I

    move-result v1

    invoke-virtual {p2, v0, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/tabbar/MultiTabControlView;->mTextSize:I

    .line 3
    sget v0, Lcom/xuexiang/xui/R$styleable;->TabControlView_tcv_selectedColor:I

    invoke-static {p1}, Lcom/xuexiang/xui/utils/ThemeUtils;->getMainThemeColor(Landroid/content/Context;)I

    move-result v1

    invoke-virtual {p2, v0, v1}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/tabbar/MultiTabControlView;->mSelectedColor:I

    .line 4
    sget v0, Lcom/xuexiang/xui/R$styleable;->TabControlView_tcv_unselectedColor:I

    invoke-virtual {p2, v0, v2}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/tabbar/MultiTabControlView;->mUnselectedColor:I

    .line 5
    sget v0, Lcom/xuexiang/xui/R$styleable;->TabControlView_tcv_selectedTextColor:I

    const/4 v1, -0x1

    invoke-virtual {p2, v0, v1}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v0

    iput v0, p0, Lcom/xuexiang/xui/widget/tabbar/MultiTabControlView;->mSelectedTextColor:I

    .line 6
    sget v0, Lcom/xuexiang/xui/R$styleable;->TabControlView_tcv_unselectedTextColor:I

    invoke-static {p1}, Lcom/xuexiang/xui/utils/ThemeUtils;->getMainThemeColor(Landroid/content/Context;)I

    move-result p1

    invoke-virtual {p2, v0, p1}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p1

    iput p1, p0, Lcom/xuexiang/xui/widget/tabbar/MultiTabControlView;->mUnselectedTextColor:I

    .line 7
    sget p1, Lcom/xuexiang/xui/R$styleable;->TabControlView_tcv_strokeWidth:I

    sget v0, Lcom/xuexiang/xui/R$dimen;->default_tcv_stroke_width:I

    invoke-static {v0}, Lcom/xuexiang/xui/utils/ResUtils;->getDimensionPixelSize(I)I

    move-result v0

    invoke-virtual {p2, p1, v0}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p1

    iput p1, p0, Lcom/xuexiang/xui/widget/tabbar/MultiTabControlView;->mStrokeWidth:I

    .line 8
    sget p1, Lcom/xuexiang/xui/R$styleable;->TabControlView_tcv_item_padding:I

    invoke-virtual {p2, p1, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p1

    iput p1, p0, Lcom/xuexiang/xui/widget/tabbar/MultiTabControlView;->mItemPadding:I

    .line 9
    sget p1, Lcom/xuexiang/xui/R$styleable;->TabControlView_tcv_item_padding_horizontal:I

    invoke-virtual {p2, p1, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p1

    iput p1, p0, Lcom/xuexiang/xui/widget/tabbar/MultiTabControlView;->mItemPaddingHorizontal:I

    .line 10
    sget p1, Lcom/xuexiang/xui/R$styleable;->TabControlView_tcv_item_padding_vertical:I

    invoke-virtual {p2, p1, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p1

    iput p1, p0, Lcom/xuexiang/xui/widget/tabbar/MultiTabControlView;->mItemPaddingVertical:I

    .line 11
    new-instance p1, Landroid/content/res/ColorStateList;

    const/4 v0, 0x2

    new-array v3, v0, [[I

    const/4 v4, 0x1

    new-array v5, v4, [I

    const v6, -0x10100a0

    aput v6, v5, v2

    aput-object v5, v3, v2

    new-array v5, v4, [I

    const v6, 0x10100a0

    aput v6, v5, v2

    aput-object v5, v3, v4

    new-array v0, v0, [I

    iget v5, p0, Lcom/xuexiang/xui/widget/tabbar/MultiTabControlView;->mUnselectedTextColor:I

    aput v5, v0, v2

    iget v5, p0, Lcom/xuexiang/xui/widget/tabbar/MultiTabControlView;->mSelectedTextColor:I

    aput v5, v0, v4

    invoke-direct {p1, v3, v0}, Landroid/content/res/ColorStateList;-><init>([[I[I)V

    iput-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/MultiTabControlView;->mTextColorStateList:Landroid/content/res/ColorStateList;

    .line 12
    sget p1, Lcom/xuexiang/xui/R$styleable;->TabControlView_tcv_defaultSelection:I

    invoke-virtual {p2, p1, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p1

    if-le p1, v1, :cond_0

    new-array v0, v4, [I

    aput p1, v0, v2

    .line 13
    iput-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/MultiTabControlView;->mDefaultSelectionList:[I

    .line 14
    :cond_0
    sget p1, Lcom/xuexiang/xui/R$styleable;->TabControlView_tcv_equalWidth:I

    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/tabbar/MultiTabControlView;->mEqualWidth:Z

    invoke-virtual {p2, p1, v0}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p1

    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/tabbar/MultiTabControlView;->mEqualWidth:Z

    .line 15
    sget p1, Lcom/xuexiang/xui/R$styleable;->TabControlView_tcv_stretch:I

    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/tabbar/MultiTabControlView;->mStretch:Z

    invoke-virtual {p2, p1, v0}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p1

    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/tabbar/MultiTabControlView;->mStretch:Z

    .line 16
    sget p1, Lcom/xuexiang/xui/R$styleable;->TabControlView_tcv_items:I

    invoke-virtual {p2, p1}, Landroid/content/res/TypedArray;->getTextArray(I)[Ljava/lang/CharSequence;

    move-result-object p1

    .line 17
    sget v0, Lcom/xuexiang/xui/R$styleable;->TabControlView_tcv_values:I

    invoke-virtual {p2, v0}, Landroid/content/res/TypedArray;->getTextArray(I)[Ljava/lang/CharSequence;

    move-result-object v0

    .line 18
    invoke-direct {p0, p1, v0}, Lcom/xuexiang/xui/widget/tabbar/MultiTabControlView;->setItems([Ljava/lang/CharSequence;[Ljava/lang/CharSequence;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    return-void

    :catchall_0
    move-exception p1

    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    .line 20
    throw p1
.end method

.method private isRtl()Z
    .locals 2

    invoke-virtual {p0}, Landroid/widget/LinearLayout;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Configuration;->getLayoutDirection()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method private setCheckBoxBackground(Landroid/widget/CheckBox;Landroid/graphics/drawable/GradientDrawable;Landroid/graphics/drawable/GradientDrawable;)V
    .locals 5

    .line 1
    new-instance v0, Landroid/graphics/drawable/StateListDrawable;

    invoke-direct {v0}, Landroid/graphics/drawable/StateListDrawable;-><init>()V

    const/4 v1, 0x1

    new-array v2, v1, [I

    const v3, -0x10100a0

    const/4 v4, 0x0

    aput v3, v2, v4

    .line 2
    invoke-virtual {v0, v2, p2}, Landroid/graphics/drawable/StateListDrawable;->addState([ILandroid/graphics/drawable/Drawable;)V

    new-array p2, v1, [I

    const v1, 0x10100a0

    aput v1, p2, v4

    .line 3
    invoke-virtual {v0, p2, p3}, Landroid/graphics/drawable/StateListDrawable;->addState([ILandroid/graphics/drawable/Drawable;)V

    .line 4
    invoke-virtual {p1, v0}, Landroid/widget/CheckBox;->setBackground(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method private setItems([Ljava/lang/CharSequence;[Ljava/lang/CharSequence;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    if-eqz p1, :cond_1

    if-eqz p2, :cond_1

    .line 9
    array-length v0, p1

    array-length v1, p2

    if-ne v0, v1, :cond_0

    goto :goto_0

    .line 10
    :cond_0
    new-instance p1, Ljava/lang/Exception;

    const-string p2, "Item labels and value arrays must be the same size"

    invoke-direct {p1, p2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    if-eqz p1, :cond_3

    const/4 v0, 0x0

    if-eqz p2, :cond_2

    .line 11
    :goto_1
    array-length v1, p1

    if-ge v0, v1, :cond_3

    .line 12
    iget-object v1, p0, Lcom/xuexiang/xui/widget/tabbar/MultiTabControlView;->mItemMap:Ljava/util/LinkedHashMap;

    aget-object v2, p1, v0

    invoke-interface {v2}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v2

    aget-object v3, p2, v0

    invoke-interface {v3}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Ljava/util/LinkedHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 13
    :cond_2
    array-length p2, p1

    :goto_2
    if-ge v0, p2, :cond_3

    aget-object v1, p1, v0

    .line 14
    iget-object v2, p0, Lcom/xuexiang/xui/widget/tabbar/MultiTabControlView;->mItemMap:Ljava/util/LinkedHashMap;

    invoke-interface {v1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v3, v1}, Ljava/util/LinkedHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_3
    return-void
.end method

.method private update()V
    .locals 10

    .line 1
    invoke-virtual {p0}, Landroid/widget/LinearLayout;->removeAllViews()V

    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 3
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Lcom/xuexiang/xui/widget/tabbar/MultiTabControlView;->mOptions:Ljava/util/List;

    .line 4
    iget-object v1, p0, Lcom/xuexiang/xui/widget/tabbar/MultiTabControlView;->mItemMap:Ljava/util/LinkedHashMap;

    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    .line 5
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    const/4 v5, 0x1

    if-eqz v4, :cond_8

    .line 6
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/Map$Entry;

    .line 7
    new-instance v6, Landroid/widget/CheckBox;

    iget-object v7, p0, Lcom/xuexiang/xui/widget/tabbar/MultiTabControlView;->mContext:Landroid/content/Context;

    invoke-direct {v6, v7}, Landroid/widget/CheckBox;-><init>(Landroid/content/Context;)V

    .line 8
    iget-object v7, p0, Lcom/xuexiang/xui/widget/tabbar/MultiTabControlView;->mTextColorStateList:Landroid/content/res/ColorStateList;

    invoke-virtual {v6, v7}, Landroid/widget/CheckBox;->setTextColor(Landroid/content/res/ColorStateList;)V

    .line 9
    new-instance v7, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v8, -0x2

    const/4 v9, -0x1

    invoke-direct {v7, v8, v9}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 10
    iget-boolean v8, p0, Lcom/xuexiang/xui/widget/tabbar/MultiTabControlView;->mStretch:Z

    if-eqz v8, :cond_0

    const/high16 v8, 0x3f800000    # 1.0f

    .line 11
    iput v8, v7, Landroid/widget/LinearLayout$LayoutParams;->weight:F

    :cond_0
    if-lez v3, :cond_1

    .line 12
    iget v8, p0, Lcom/xuexiang/xui/widget/tabbar/MultiTabControlView;->mStrokeWidth:I

    neg-int v8, v8

    invoke-virtual {v7, v8}, Landroid/widget/LinearLayout$LayoutParams;->setMarginStart(I)V

    .line 13
    :cond_1
    invoke-virtual {v6, v7}, Landroid/widget/CheckBox;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 14
    new-instance v8, Landroid/graphics/drawable/StateListDrawable;

    invoke-direct {v8}, Landroid/graphics/drawable/StateListDrawable;-><init>()V

    invoke-virtual {v6, v8}, Landroid/widget/CheckBox;->setButtonDrawable(Landroid/graphics/drawable/Drawable;)V

    if-nez v3, :cond_3

    .line 15
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/tabbar/MultiTabControlView;->isRtl()Z

    move-result v5

    if-eqz v5, :cond_2

    .line 16
    sget v5, Lcom/xuexiang/xui/R$drawable;->tcv_right_option:I

    sget v8, Lcom/xuexiang/xui/R$drawable;->tcv_right_option_selected:I

    invoke-direct {p0, v6, v5, v8}, Lcom/xuexiang/xui/widget/tabbar/MultiTabControlView;->updateCheckBox(Landroid/widget/CheckBox;II)V

    goto :goto_1

    .line 17
    :cond_2
    sget v5, Lcom/xuexiang/xui/R$drawable;->tcv_left_option:I

    sget v8, Lcom/xuexiang/xui/R$drawable;->tcv_left_option_selected:I

    invoke-direct {p0, v6, v5, v8}, Lcom/xuexiang/xui/widget/tabbar/MultiTabControlView;->updateCheckBox(Landroid/widget/CheckBox;II)V

    goto :goto_1

    .line 18
    :cond_3
    iget-object v8, p0, Lcom/xuexiang/xui/widget/tabbar/MultiTabControlView;->mItemMap:Ljava/util/LinkedHashMap;

    invoke-virtual {v8}, Ljava/util/LinkedHashMap;->size()I

    move-result v8

    sub-int/2addr v8, v5

    if-ne v3, v8, :cond_5

    .line 19
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/tabbar/MultiTabControlView;->isRtl()Z

    move-result v5

    if-eqz v5, :cond_4

    .line 20
    sget v5, Lcom/xuexiang/xui/R$drawable;->tcv_left_option:I

    sget v8, Lcom/xuexiang/xui/R$drawable;->tcv_left_option_selected:I

    invoke-direct {p0, v6, v5, v8}, Lcom/xuexiang/xui/widget/tabbar/MultiTabControlView;->updateCheckBox(Landroid/widget/CheckBox;II)V

    goto :goto_1

    .line 21
    :cond_4
    sget v5, Lcom/xuexiang/xui/R$drawable;->tcv_right_option:I

    sget v8, Lcom/xuexiang/xui/R$drawable;->tcv_right_option_selected:I

    invoke-direct {p0, v6, v5, v8}, Lcom/xuexiang/xui/widget/tabbar/MultiTabControlView;->updateCheckBox(Landroid/widget/CheckBox;II)V

    goto :goto_1

    .line 22
    :cond_5
    sget v5, Lcom/xuexiang/xui/R$drawable;->tcv_middle_option:I

    sget v8, Lcom/xuexiang/xui/R$drawable;->tcv_middle_option_selected:I

    invoke-direct {p0, v6, v5, v8}, Lcom/xuexiang/xui/widget/tabbar/MultiTabControlView;->updateCheckBox(Landroid/widget/CheckBox;II)V

    .line 23
    :goto_1
    invoke-virtual {v6, v7}, Landroid/widget/CheckBox;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 24
    iget v5, p0, Lcom/xuexiang/xui/widget/tabbar/MultiTabControlView;->mItemPadding:I

    if-eq v5, v9, :cond_6

    .line 25
    invoke-virtual {v6, v5, v5, v5, v5}, Landroid/widget/CheckBox;->setPadding(IIII)V

    .line 26
    :cond_6
    iget v5, p0, Lcom/xuexiang/xui/widget/tabbar/MultiTabControlView;->mItemPaddingHorizontal:I

    if-eq v5, v9, :cond_7

    iget v7, p0, Lcom/xuexiang/xui/widget/tabbar/MultiTabControlView;->mItemPaddingVertical:I

    if-eq v7, v9, :cond_7

    .line 27
    invoke-virtual {v6, v5, v7, v5, v7}, Landroid/widget/CheckBox;->setPadding(IIII)V

    .line 28
    :cond_7
    iget v5, p0, Lcom/xuexiang/xui/widget/tabbar/MultiTabControlView;->mStrokeWidth:I

    mul-int/lit8 v5, v5, 0xa

    invoke-virtual {v6, v5}, Landroid/widget/CheckBox;->setMinWidth(I)V

    const/16 v5, 0x11

    .line 29
    invoke-virtual {v6, v5}, Landroid/widget/CheckBox;->setGravity(I)V

    .line 30
    iget v5, p0, Lcom/xuexiang/xui/widget/tabbar/MultiTabControlView;->mTextSize:I

    int-to-float v5, v5

    invoke-virtual {v6, v0, v5}, Landroid/widget/CheckBox;->setTextSize(IF)V

    .line 31
    invoke-static {}, Lcom/xuexiang/xui/XUI;->getDefaultTypeface()Landroid/graphics/Typeface;

    move-result-object v5

    invoke-virtual {v6, v5}, Landroid/widget/CheckBox;->setTypeface(Landroid/graphics/Typeface;)V

    .line 32
    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/CharSequence;

    invoke-virtual {v6, v5}, Landroid/widget/CheckBox;->setText(Ljava/lang/CharSequence;)V

    .line 33
    invoke-direct {p0, v6}, Lcom/xuexiang/xui/widget/tabbar/MultiTabControlView;->addOnCheckedChangeListener(Landroid/widget/CheckBox;)V

    .line 34
    invoke-virtual {v6}, Landroid/widget/CheckBox;->getPaint()Landroid/text/TextPaint;

    move-result-object v5

    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-virtual {v5, v4}, Landroid/text/TextPaint;->measureText(Ljava/lang/String;)F

    move-result v4

    invoke-static {v4, v2}, Ljava/lang/Math;->max(FF)F

    move-result v2

    .line 35
    iget-object v4, p0, Lcom/xuexiang/xui/widget/tabbar/MultiTabControlView;->mOptions:Ljava/util/List;

    invoke-interface {v4, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto/16 :goto_0

    .line 36
    :cond_8
    iget-object v1, p0, Lcom/xuexiang/xui/widget/tabbar/MultiTabControlView;->mOptions:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_a

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/widget/CheckBox;

    .line 37
    iget-boolean v4, p0, Lcom/xuexiang/xui/widget/tabbar/MultiTabControlView;->mEqualWidth:Z

    if-eqz v4, :cond_9

    .line 38
    iget v4, p0, Lcom/xuexiang/xui/widget/tabbar/MultiTabControlView;->mStrokeWidth:I

    mul-int/lit8 v4, v4, 0x14

    int-to-float v4, v4

    add-float/2addr v4, v2

    float-to-int v4, v4

    invoke-virtual {v3, v4}, Landroid/widget/CheckBox;->setWidth(I)V

    .line 39
    :cond_9
    invoke-virtual {p0, v3}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    goto :goto_2

    .line 40
    :cond_a
    iget-object v1, p0, Lcom/xuexiang/xui/widget/tabbar/MultiTabControlView;->mDefaultSelectionList:[I

    if-eqz v1, :cond_b

    array-length v2, v1

    if-lez v2, :cond_b

    .line 41
    array-length v2, v1

    :goto_3
    if-ge v0, v2, :cond_b

    aget v3, v1, v0

    .line 42
    invoke-virtual {p0, v3, v5}, Lcom/xuexiang/xui/widget/tabbar/MultiTabControlView;->setIsChecked(IZ)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_3

    :cond_b
    return-void
.end method

.method private updateCheckBox(Landroid/widget/CheckBox;II)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/MultiTabControlView;->mContext:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object p2

    invoke-virtual {p2}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    move-result-object p2

    check-cast p2, Landroid/graphics/drawable/GradientDrawable;

    .line 2
    iget v0, p0, Lcom/xuexiang/xui/widget/tabbar/MultiTabControlView;->mStrokeWidth:I

    iget v1, p0, Lcom/xuexiang/xui/widget/tabbar/MultiTabControlView;->mSelectedColor:I

    invoke-virtual {p2, v0, v1}, Landroid/graphics/drawable/GradientDrawable;->setStroke(II)V

    const/4 v0, 0x1

    .line 3
    invoke-virtual {p2, v0}, Landroid/graphics/drawable/GradientDrawable;->setDither(Z)V

    .line 4
    iget v0, p0, Lcom/xuexiang/xui/widget/tabbar/MultiTabControlView;->mUnselectedColor:I

    invoke-virtual {p2, v0}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 5
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/MultiTabControlView;->mContext:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p3}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object p3

    invoke-virtual {p3}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    move-result-object p3

    check-cast p3, Landroid/graphics/drawable/GradientDrawable;

    .line 6
    iget v0, p0, Lcom/xuexiang/xui/widget/tabbar/MultiTabControlView;->mSelectedColor:I

    invoke-virtual {p3, v0}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 7
    iget v0, p0, Lcom/xuexiang/xui/widget/tabbar/MultiTabControlView;->mStrokeWidth:I

    iget v1, p0, Lcom/xuexiang/xui/widget/tabbar/MultiTabControlView;->mSelectedColor:I

    invoke-virtual {p3, v0, v1}, Landroid/graphics/drawable/GradientDrawable;->setStroke(II)V

    .line 8
    invoke-direct {p0, p1, p2, p3}, Lcom/xuexiang/xui/widget/tabbar/MultiTabControlView;->setCheckBoxBackground(Landroid/widget/CheckBox;Landroid/graphics/drawable/GradientDrawable;Landroid/graphics/drawable/GradientDrawable;)V

    return-void
.end method


# virtual methods
.method public isChecked(I)Z
    .locals 0

    invoke-virtual {p0, p1}, Landroid/widget/LinearLayout;->getChildAt(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/CheckBox;

    invoke-virtual {p1}, Landroid/widget/CheckBox;->isChecked()Z

    move-result p1

    return p1
.end method

.method protected onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/widget/LinearLayout;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 2
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/tabbar/MultiTabControlView;->update()V

    return-void
.end method

.method public setColors(II)Lcom/xuexiang/xui/widget/tabbar/MultiTabControlView;
    .locals 5

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/tabbar/MultiTabControlView;->mSelectedColor:I

    .line 2
    iput p2, p0, Lcom/xuexiang/xui/widget/tabbar/MultiTabControlView;->mSelectedTextColor:I

    .line 3
    iput p2, p0, Lcom/xuexiang/xui/widget/tabbar/MultiTabControlView;->mUnselectedColor:I

    .line 4
    iput p1, p0, Lcom/xuexiang/xui/widget/tabbar/MultiTabControlView;->mUnselectedTextColor:I

    .line 5
    new-instance p1, Landroid/content/res/ColorStateList;

    const/4 p2, 0x2

    new-array v0, p2, [[I

    const/4 v1, 0x1

    new-array v2, v1, [I

    const v3, -0x10100a0

    const/4 v4, 0x0

    aput v3, v2, v4

    aput-object v2, v0, v4

    new-array v2, v1, [I

    const v3, 0x10100a0

    aput v3, v2, v4

    aput-object v2, v0, v1

    new-array p2, p2, [I

    iget v2, p0, Lcom/xuexiang/xui/widget/tabbar/MultiTabControlView;->mUnselectedTextColor:I

    aput v2, p2, v4

    iget v2, p0, Lcom/xuexiang/xui/widget/tabbar/MultiTabControlView;->mSelectedTextColor:I

    aput v2, p2, v1

    invoke-direct {p1, v0, p2}, Landroid/content/res/ColorStateList;-><init>([[I[I)V

    iput-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/MultiTabControlView;->mTextColorStateList:Landroid/content/res/ColorStateList;

    .line 6
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/tabbar/MultiTabControlView;->update()V

    return-object p0
.end method

.method public setColors(IIII)Lcom/xuexiang/xui/widget/tabbar/MultiTabControlView;
    .locals 5

    .line 7
    iput p1, p0, Lcom/xuexiang/xui/widget/tabbar/MultiTabControlView;->mSelectedColor:I

    .line 8
    iput p2, p0, Lcom/xuexiang/xui/widget/tabbar/MultiTabControlView;->mSelectedTextColor:I

    .line 9
    iput p3, p0, Lcom/xuexiang/xui/widget/tabbar/MultiTabControlView;->mUnselectedColor:I

    .line 10
    iput p4, p0, Lcom/xuexiang/xui/widget/tabbar/MultiTabControlView;->mUnselectedTextColor:I

    .line 11
    new-instance p1, Landroid/content/res/ColorStateList;

    const/4 p3, 0x2

    new-array v0, p3, [[I

    const/4 v1, 0x1

    new-array v2, v1, [I

    const v3, -0x10100a0

    const/4 v4, 0x0

    aput v3, v2, v4

    aput-object v2, v0, v4

    new-array v2, v1, [I

    const v3, 0x10100a0

    aput v3, v2, v4

    aput-object v2, v0, v1

    new-array p3, p3, [I

    aput p4, p3, v4

    aput p2, p3, v1

    invoke-direct {p1, v0, p3}, Landroid/content/res/ColorStateList;-><init>([[I[I)V

    iput-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/MultiTabControlView;->mTextColorStateList:Landroid/content/res/ColorStateList;

    .line 12
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/tabbar/MultiTabControlView;->update()V

    return-object p0
.end method

.method public setDefaultSelection(Ljava/util/List;)Lcom/xuexiang/xui/widget/tabbar/MultiTabControlView;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;)",
            "Lcom/xuexiang/xui/widget/tabbar/MultiTabControlView;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 9
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    new-array v1, v0, [I

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_0

    .line 10
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    aput v3, v1, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 11
    :cond_0
    invoke-virtual {p0, v1}, Lcom/xuexiang/xui/widget/tabbar/MultiTabControlView;->setDefaultSelection([I)Lcom/xuexiang/xui/widget/tabbar/MultiTabControlView;

    return-object p0
.end method

.method public varargs setDefaultSelection([I)Lcom/xuexiang/xui/widget/tabbar/MultiTabControlView;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    if-eqz p1, :cond_3

    .line 1
    array-length v0, p1

    iget-object v1, p0, Lcom/xuexiang/xui/widget/tabbar/MultiTabControlView;->mItemMap:Ljava/util/LinkedHashMap;

    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->size()I

    move-result v1

    if-gt v0, v1, :cond_2

    .line 2
    array-length v0, p1

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    aget v2, p1, v1

    .line 3
    iget-object v3, p0, Lcom/xuexiang/xui/widget/tabbar/MultiTabControlView;->mItemMap:Ljava/util/LinkedHashMap;

    invoke-virtual {v3}, Ljava/util/LinkedHashMap;->size()I

    move-result v3

    add-int/lit8 v3, v3, -0x1

    if-gt v2, v3, :cond_0

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 4
    :cond_0
    new-instance p1, Ljava/lang/Exception;

    const-string v0, "Default selection cannot be greater than the number of items"

    invoke-direct {p1, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw p1

    .line 5
    :cond_1
    iput-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/MultiTabControlView;->mDefaultSelectionList:[I

    .line 6
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/tabbar/MultiTabControlView;->update()V

    return-object p0

    .line 7
    :cond_2
    new-instance p1, Ljava/lang/Exception;

    const-string v0, "the length of Default selectionList cannot be greater than the length of items"

    invoke-direct {p1, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw p1

    .line 8
    :cond_3
    new-instance p1, Ljava/lang/Exception;

    const-string v0, "defaultSelectionList cannot be null"

    invoke-direct {p1, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public setEqualWidth(Z)Lcom/xuexiang/xui/widget/tabbar/MultiTabControlView;
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/tabbar/MultiTabControlView;->mEqualWidth:Z

    .line 2
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/tabbar/MultiTabControlView;->update()V

    return-object p0
.end method

.method public setIsChecked(IZ)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Landroid/widget/LinearLayout;->getChildAt(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/CheckBox;

    if-eqz p1, :cond_0

    .line 2
    invoke-virtual {p1, p2}, Landroid/widget/CheckBox;->setChecked(Z)V

    :cond_0
    return-void
.end method

.method public setItems([Ljava/lang/String;[Ljava/lang/String;)Lcom/xuexiang/xui/widget/tabbar/MultiTabControlView;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/MultiTabControlView;->mItemMap:Ljava/util/LinkedHashMap;

    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->clear()V

    if-eqz p1, :cond_1

    if-eqz p2, :cond_1

    .line 2
    array-length v0, p1

    array-length v1, p2

    if-ne v0, v1, :cond_0

    goto :goto_0

    .line 3
    :cond_0
    new-instance p1, Ljava/lang/Exception;

    const-string p2, "Item labels and value arrays must be the same size"

    invoke-direct {p1, p2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    if-eqz p1, :cond_3

    const/4 v0, 0x0

    if-eqz p2, :cond_2

    .line 4
    :goto_1
    array-length v1, p1

    if-ge v0, v1, :cond_3

    .line 5
    iget-object v1, p0, Lcom/xuexiang/xui/widget/tabbar/MultiTabControlView;->mItemMap:Ljava/util/LinkedHashMap;

    aget-object v2, p1, v0

    aget-object v3, p2, v0

    invoke-virtual {v1, v2, v3}, Ljava/util/LinkedHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 6
    :cond_2
    array-length p2, p1

    :goto_2
    if-ge v0, p2, :cond_3

    aget-object v1, p1, v0

    .line 7
    iget-object v2, p0, Lcom/xuexiang/xui/widget/tabbar/MultiTabControlView;->mItemMap:Ljava/util/LinkedHashMap;

    invoke-interface {v1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v3, v1}, Ljava/util/LinkedHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    .line 8
    :cond_3
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/tabbar/MultiTabControlView;->update()V

    return-object p0
.end method

.method public varargs setItems([Ljava/lang/String;[Ljava/lang/String;[I)Lcom/xuexiang/xui/widget/tabbar/MultiTabControlView;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    if-eqz p3, :cond_3

    .line 15
    array-length v0, p3

    array-length v1, p1

    if-gt v0, v1, :cond_2

    .line 16
    array-length v0, p3

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    aget v2, p3, v1

    .line 17
    iget-object v3, p0, Lcom/xuexiang/xui/widget/tabbar/MultiTabControlView;->mItemMap:Ljava/util/LinkedHashMap;

    invoke-virtual {v3}, Ljava/util/LinkedHashMap;->size()I

    move-result v3

    add-int/lit8 v3, v3, -0x1

    if-gt v2, v3, :cond_0

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 18
    :cond_0
    new-instance p1, Ljava/lang/Exception;

    const-string p2, "Default selection cannot be greater than the number of items"

    invoke-direct {p1, p2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw p1

    .line 19
    :cond_1
    iput-object p3, p0, Lcom/xuexiang/xui/widget/tabbar/MultiTabControlView;->mDefaultSelectionList:[I

    .line 20
    invoke-virtual {p0, p1, p2}, Lcom/xuexiang/xui/widget/tabbar/MultiTabControlView;->setItems([Ljava/lang/String;[Ljava/lang/String;)Lcom/xuexiang/xui/widget/tabbar/MultiTabControlView;

    return-object p0

    .line 21
    :cond_2
    new-instance p1, Ljava/lang/Exception;

    const-string p2, "the length of Default selectionList cannot be greater than the length of items"

    invoke-direct {p1, p2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw p1

    .line 22
    :cond_3
    new-instance p1, Ljava/lang/Exception;

    const-string p2, "defaultSelectionList cannot be null"

    invoke-direct {p1, p2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public setOnMultiTabSelectionChangedListener(Lcom/xuexiang/xui/widget/tabbar/MultiTabControlView$OnMultiTabSelectionChangedListener;)Lcom/xuexiang/xui/widget/tabbar/MultiTabControlView;
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/MultiTabControlView;->mListener:Lcom/xuexiang/xui/widget/tabbar/MultiTabControlView$OnMultiTabSelectionChangedListener;

    return-object p0
.end method

.method public setSelection(Ljava/lang/String;)Lcom/xuexiang/xui/widget/tabbar/MultiTabControlView;
    .locals 1

    const/4 v0, 0x1

    .line 3
    invoke-virtual {p0, p1, v0}, Lcom/xuexiang/xui/widget/tabbar/MultiTabControlView;->setSelectionStatus(Ljava/lang/String;Z)Lcom/xuexiang/xui/widget/tabbar/MultiTabControlView;

    return-object p0
.end method

.method public varargs setSelection([Ljava/lang/String;)Lcom/xuexiang/xui/widget/tabbar/MultiTabControlView;
    .locals 3

    .line 1
    array-length v0, p1

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    aget-object v2, p1, v1

    .line 2
    invoke-virtual {p0, v2}, Lcom/xuexiang/xui/widget/tabbar/MultiTabControlView;->setSelection(Ljava/lang/String;)Lcom/xuexiang/xui/widget/tabbar/MultiTabControlView;

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-object p0
.end method

.method public setSelectionStatus(Ljava/lang/String;Z)Lcom/xuexiang/xui/widget/tabbar/MultiTabControlView;
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/tabbar/MultiTabControlView;->getTitleByValue(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/xuexiang/xui/widget/tabbar/MultiTabControlView;->setSelectionStatusByTitle(Ljava/lang/String;Z)Lcom/xuexiang/xui/widget/tabbar/MultiTabControlView;

    return-object p0
.end method

.method public setSelectionStatusByTitle(Ljava/lang/String;Z)Lcom/xuexiang/xui/widget/tabbar/MultiTabControlView;
    .locals 1

    const/4 v0, 0x1

    .line 1
    invoke-virtual {p0, p1, p2, v0}, Lcom/xuexiang/xui/widget/tabbar/MultiTabControlView;->setSelectionStatusByTitle(Ljava/lang/String;ZZ)Lcom/xuexiang/xui/widget/tabbar/MultiTabControlView;

    return-object p0
.end method

.method public setSelectionStatusByTitle(Ljava/lang/String;ZZ)Lcom/xuexiang/xui/widget/tabbar/MultiTabControlView;
    .locals 3

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/MultiTabControlView;->mOptions:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/widget/CheckBox;

    .line 3
    invoke-virtual {v1}, Landroid/widget/CheckBox;->getText()Ljava/lang/CharSequence;

    move-result-object v2

    invoke-interface {v2}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    if-eqz p3, :cond_1

    const/4 v2, 0x0

    .line 4
    invoke-virtual {v1, v2}, Landroid/widget/CheckBox;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 5
    invoke-virtual {v1, p2}, Landroid/widget/CheckBox;->setChecked(Z)V

    .line 6
    invoke-direct {p0, v1}, Lcom/xuexiang/xui/widget/tabbar/MultiTabControlView;->addOnCheckedChangeListener(Landroid/widget/CheckBox;)V

    goto :goto_0

    .line 7
    :cond_1
    invoke-virtual {v1, p2}, Landroid/widget/CheckBox;->setChecked(Z)V

    goto :goto_0

    :cond_2
    return-object p0
.end method

.method public setStretch(Z)Lcom/xuexiang/xui/widget/tabbar/MultiTabControlView;
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/tabbar/MultiTabControlView;->mStretch:Z

    .line 2
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/tabbar/MultiTabControlView;->update()V

    return-object p0
.end method

.method public setTypeface(Landroid/graphics/Typeface;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/MultiTabControlView;->mOptions:Ljava/util/List;

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    .line 2
    :goto_0
    iget-object v1, p0, Lcom/xuexiang/xui/widget/tabbar/MultiTabControlView;->mOptions:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    .line 3
    iget-object v1, p0, Lcom/xuexiang/xui/widget/tabbar/MultiTabControlView;->mOptions:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/widget/CheckBox;

    invoke-virtual {v1, p1}, Landroid/widget/CheckBox;->setTypeface(Landroid/graphics/Typeface;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method
