.class public Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner;
.super Landroid/widget/FrameLayout;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;
.implements Landroid/widget/AdapterView$OnItemClickListener;
.implements Landroid/text/TextWatcher;


# instance fields
.field public final a:Landroid/widget/EditText;

.field public final b:Landroid/widget/ImageView;

.field public c:Ln3/a;

.field public final d:Landroid/view/animation/RotateAnimation;

.field public final e:Landroid/view/animation/RotateAnimation;

.field public final f:Landroid/graphics/drawable/Drawable;

.field public final g:I

.field public final h:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, v0}, Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 2
    sget v0, Lcom/xuexiang/xui/R$attr;->EditSpinnerStyle:I

    invoke-direct {p0, p1, p2, v0}, Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 8

    .line 3
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/4 v0, 0x1

    .line 4
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner;->h:Z

    .line 5
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v1

    sget v2, Lcom/xuexiang/xui/R$layout;->xui_layout_edit_spinner:I

    invoke-virtual {v1, v2, p0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 6
    sget v1, Lcom/xuexiang/xui/R$id;->edit_spinner_edit:I

    invoke-virtual {p0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/EditText;

    iput-object v1, p0, Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner;->a:Landroid/widget/EditText;

    .line 7
    sget v1, Lcom/xuexiang/xui/R$id;->edit_spinner_arrow:I

    invoke-virtual {p0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/ImageView;

    iput-object v1, p0, Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner;->b:Landroid/widget/ImageView;

    .line 8
    invoke-virtual {v1, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 9
    iget-object v1, p0, Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner;->a:Landroid/widget/EditText;

    invoke-virtual {v1, p0}, Landroid/widget/TextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 10
    sget-object v1, Lcom/xuexiang/xui/R$styleable;->EditSpinner:[I

    const/4 v2, 0x0

    invoke-virtual {p1, p2, v1, p3, v2}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p1

    if-eqz p1, :cond_8

    .line 11
    sget p2, Lcom/xuexiang/xui/R$styleable;->EditSpinner_es_isShowFilterData:I

    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p2

    iput-boolean p2, p0, Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner;->h:Z

    .line 12
    sget p2, Lcom/xuexiang/xui/R$styleable;->EditSpinner_es_isFilterKey:I

    invoke-virtual {p1, p2, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 13
    sget p2, Lcom/xuexiang/xui/R$styleable;->EditSpinner_es_arrowImage:I

    invoke-virtual {p1, p2, v2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result p2

    if-eqz p2, :cond_0

    .line 14
    iget-object p3, p0, Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner;->b:Landroid/widget/ImageView;

    invoke-virtual {p3, p2}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 15
    :cond_0
    sget p2, Lcom/xuexiang/xui/R$styleable;->EditSpinner_es_arrowMargin:I

    const/4 p3, -0x1

    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p2

    if-eq p2, p3, :cond_1

    .line 16
    iget-object v1, p0, Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner;->b:Landroid/widget/ImageView;

    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    check-cast v1, Landroid/widget/FrameLayout$LayoutParams;

    .line 17
    invoke-virtual {v1, p2, v2, p2, v2}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    .line 18
    iget-object p2, p0, Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner;->b:Landroid/widget/ImageView;

    invoke-virtual {p2, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 19
    :cond_1
    iget-object p2, p0, Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner;->a:Landroid/widget/EditText;

    sget v1, Lcom/xuexiang/xui/R$styleable;->EditSpinner_es_hint:I

    invoke-virtual {p1, v1}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2, v1}, Landroid/widget/TextView;->setHint(Ljava/lang/CharSequence;)V

    .line 20
    sget p2, Lcom/xuexiang/xui/R$styleable;->EditSpinner_es_background:I

    invoke-virtual {p1, p2, v2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result p2

    if-eqz p2, :cond_2

    .line 21
    iget-object v1, p0, Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner;->a:Landroid/widget/EditText;

    invoke-virtual {v1, p2}, Landroid/view/View;->setBackgroundResource(I)V

    .line 22
    :cond_2
    sget p2, Lcom/xuexiang/xui/R$styleable;->EditSpinner_es_maxLine:I

    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p2

    .line 23
    iget-object v1, p0, Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner;->a:Landroid/widget/EditText;

    invoke-virtual {v1, p2}, Landroid/widget/TextView;->setMaxLines(I)V

    .line 24
    sget p2, Lcom/xuexiang/xui/R$styleable;->EditSpinner_es_height:I

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    sget v3, Lcom/xuexiang/xui/R$attr;->ms_item_height_size:I

    .line 25
    invoke-static {v1, v3, p3}, Lkotlin/collections/u;->G(Landroid/content/Context;II)I

    move-result v1

    .line 26
    invoke-virtual {p1, p2, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p2

    .line 27
    iget-object v1, p0, Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner;->a:Landroid/widget/EditText;

    new-instance v3, Landroid/widget/FrameLayout$LayoutParams;

    invoke-direct {v3, p3, p2}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v1, v3}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 28
    sget p2, Lcom/xuexiang/xui/R$styleable;->EditSpinner_es_textColor:I

    invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->getColorStateList(I)Landroid/content/res/ColorStateList;

    move-result-object p2

    .line 29
    iget-object v1, p0, Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner;->a:Landroid/widget/EditText;

    if-eqz v1, :cond_3

    if-eqz p2, :cond_3

    .line 30
    invoke-virtual {v1, p2}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    .line 31
    :cond_3
    sget p2, Lcom/xuexiang/xui/R$styleable;->EditSpinner_es_textSize:I

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    sget v3, Lcom/xuexiang/xui/R$attr;->xui_config_size_spinner_text:I

    .line 32
    invoke-static {v1, v3, p3}, Lkotlin/collections/u;->G(Landroid/content/Context;II)I

    move-result v1

    .line 33
    invoke-virtual {p1, p2, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p2

    int-to-float p2, p2

    .line 34
    iget-object v1, p0, Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner;->a:Landroid/widget/EditText;

    if-eqz v1, :cond_4

    .line 35
    invoke-virtual {v1, v2, p2}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 36
    :cond_4
    sget p2, Lcom/xuexiang/xui/R$styleable;->EditSpinner_es_entries:I

    invoke-virtual {p1, p2, v2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result p2

    if-nez p2, :cond_7

    .line 37
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    sget p2, Lcom/xuexiang/xui/R$styleable;->EditSpinner_es_dropdown_bg:I

    .line 38
    invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object p2

    .line 39
    iput-object p2, p0, Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner;->f:Landroid/graphics/drawable/Drawable;

    .line 40
    sget p2, Lcom/xuexiang/xui/R$styleable;->EditSpinner_es_enable:I

    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p2

    .line 41
    invoke-virtual {p0, p2}, Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner;->setEnabled(Z)V

    .line 42
    sget p2, Lcom/xuexiang/xui/R$styleable;->EditSpinner_es_maxLength:I

    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getInteger(II)I

    move-result p2

    .line 43
    iget-object v1, p0, Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner;->a:Landroid/widget/EditText;

    if-eqz v1, :cond_5

    if-lez p2, :cond_5

    .line 44
    new-instance v1, Landroid/text/InputFilter$LengthFilter;

    invoke-direct {v1, p2}, Landroid/text/InputFilter$LengthFilter;-><init>(I)V

    new-array p2, v0, [Landroid/text/InputFilter;

    aput-object v1, p2, v2

    .line 45
    iget-object v1, p0, Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner;->a:Landroid/widget/EditText;

    invoke-virtual {v1, p2}, Landroid/widget/TextView;->setFilters([Landroid/text/InputFilter;)V

    .line 46
    :cond_5
    sget p2, Lcom/xuexiang/xui/R$styleable;->EditSpinner_es_maxEms:I

    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getInteger(II)I

    move-result p2

    .line 47
    iget-object v1, p0, Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner;->a:Landroid/widget/EditText;

    if-eqz v1, :cond_6

    if-lez p2, :cond_6

    .line 48
    invoke-virtual {v1, p2}, Landroid/widget/TextView;->setMaxEms(I)V

    .line 49
    :cond_6
    sget p2, Lcom/xuexiang/xui/R$styleable;->EditSpinner_es_popAnimStyle:I

    invoke-virtual {p1, p2, p3}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result p2

    iput p2, p0, Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner;->g:I

    .line 50
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    goto :goto_0

    .line 51
    :cond_7
    invoke-static {}, Lt1/a;->a()V

    const/4 p1, 0x0

    throw p1

    .line 52
    :cond_8
    :goto_0
    new-instance v1, Landroid/view/animation/RotateAnimation;

    const/4 v6, 0x1

    const/high16 v7, 0x3f000000    # 0.5f

    const/4 v2, 0x0

    const/high16 v3, -0x3ccc0000    # -180.0f

    const/4 v4, 0x1

    const/high16 v5, 0x3f000000    # 0.5f

    invoke-direct/range {v1 .. v7}, Landroid/view/animation/RotateAnimation;-><init>(FFIFIF)V

    iput-object v1, p0, Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner;->d:Landroid/view/animation/RotateAnimation;

    const-wide/16 p1, 0x12c

    .line 53
    invoke-virtual {v1, p1, p2}, Landroid/view/animation/Animation;->setDuration(J)V

    .line 54
    iget-object p3, p0, Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner;->d:Landroid/view/animation/RotateAnimation;

    invoke-virtual {p3, v0}, Landroid/view/animation/Animation;->setFillAfter(Z)V

    .line 55
    new-instance v1, Landroid/view/animation/RotateAnimation;

    const/high16 v2, -0x3ccc0000    # -180.0f

    const/4 v3, 0x0

    invoke-direct/range {v1 .. v7}, Landroid/view/animation/RotateAnimation;-><init>(FFIFIF)V

    iput-object v1, p0, Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner;->e:Landroid/view/animation/RotateAnimation;

    .line 56
    invoke-virtual {v1, p1, p2}, Landroid/view/animation/Animation;->setDuration(J)V

    .line 57
    iget-object p1, p0, Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner;->e:Landroid/view/animation/RotateAnimation;

    invoke-virtual {p1, v0}, Landroid/view/animation/Animation;->setFillAfter(Z)V

    return-void
.end method

.method private setBaseAdapter(Landroid/widget/BaseAdapter;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner;->c:Ln3/a;

    .line 2
    .line 3
    if-nez v0, :cond_2

    .line 4
    .line 5
    new-instance v0, Ln3/a;

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-direct {v0, p0, v1}, Ln3/a;-><init>(Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner;Landroid/content/Context;)V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner;->c:Ln3/a;

    .line 15
    .line 16
    iget v1, p0, Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner;->g:I

    .line 17
    .line 18
    const/4 v2, -0x1

    .line 19
    if-eq v1, v2, :cond_0

    .line 20
    .line 21
    invoke-virtual {v0, v1}, Landroid/widget/ListPopupWindow;->setAnimationStyle(I)V

    .line 22
    .line 23
    .line 24
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner;->c:Ln3/a;

    .line 25
    .line 26
    invoke-virtual {v0, p0}, Landroid/widget/ListPopupWindow;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 27
    .line 28
    .line 29
    iget-object v0, p0, Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner;->c:Ln3/a;

    .line 30
    .line 31
    const/4 v1, 0x2

    .line 32
    invoke-virtual {v0, v1}, Landroid/widget/ListPopupWindow;->setInputMethodMode(I)V

    .line 33
    .line 34
    .line 35
    iget-object v0, p0, Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner;->c:Ln3/a;

    .line 36
    .line 37
    const/16 v1, 0x30

    .line 38
    .line 39
    invoke-virtual {v0, v1}, Landroid/widget/ListPopupWindow;->setSoftInputMode(I)V

    .line 40
    .line 41
    .line 42
    iget-object v0, p0, Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner;->c:Ln3/a;

    .line 43
    .line 44
    const/4 v1, 0x1

    .line 45
    invoke-virtual {v0, v1}, Landroid/widget/ListPopupWindow;->setPromptPosition(I)V

    .line 46
    .line 47
    .line 48
    iget-object v0, p0, Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner;->c:Ln3/a;

    .line 49
    .line 50
    const/4 v1, -0x2

    .line 51
    invoke-virtual {v0, v1}, Landroid/widget/ListPopupWindow;->setWidth(I)V

    .line 52
    .line 53
    .line 54
    iget-object v0, p0, Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner;->c:Ln3/a;

    .line 55
    .line 56
    invoke-virtual {v0, v1}, Landroid/widget/ListPopupWindow;->setHeight(I)V

    .line 57
    .line 58
    .line 59
    iget-object v0, p0, Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner;->c:Ln3/a;

    .line 60
    .line 61
    iget-object v1, p0, Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner;->a:Landroid/widget/EditText;

    .line 62
    .line 63
    invoke-virtual {v0, v1}, Landroid/widget/ListPopupWindow;->setAnchorView(Landroid/view/View;)V

    .line 64
    .line 65
    .line 66
    iget-object v0, p0, Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner;->c:Ln3/a;

    .line 67
    .line 68
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    sget v3, Lcom/xuexiang/xui/R$attr;->ms_dropdown_offset:I

    .line 73
    .line 74
    invoke-static {v1, v3, v2}, Lkotlin/collections/u;->G(Landroid/content/Context;II)I

    .line 75
    .line 76
    .line 77
    move-result v1

    .line 78
    invoke-virtual {v0, v1}, Landroid/widget/ListPopupWindow;->setVerticalOffset(I)V

    .line 79
    .line 80
    .line 81
    iget-object v0, p0, Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner;->c:Ln3/a;

    .line 82
    .line 83
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 84
    .line 85
    .line 86
    move-result-object v1

    .line 87
    sget v2, Lcom/xuexiang/xui/R$drawable;->xui_config_list_item_selector:I

    .line 88
    .line 89
    invoke-virtual {v1, v2}, Landroid/content/Context;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 90
    .line 91
    .line 92
    move-result-object v1

    .line 93
    invoke-virtual {v0, v1}, Landroid/widget/ListPopupWindow;->setListSelector(Landroid/graphics/drawable/Drawable;)V

    .line 94
    .line 95
    .line 96
    iget-object v0, p0, Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner;->c:Ln3/a;

    .line 97
    .line 98
    new-instance v1, La8/c;

    .line 99
    .line 100
    const/4 v2, 0x1

    .line 101
    invoke-direct {v1, p0, v2}, La8/c;-><init>(Landroid/view/View;I)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {v0, v1}, Landroid/widget/ListPopupWindow;->setOnDismissListener(Landroid/widget/PopupWindow$OnDismissListener;)V

    .line 105
    .line 106
    .line 107
    iget-object v0, p0, Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner;->f:Landroid/graphics/drawable/Drawable;

    .line 108
    .line 109
    if-eqz v0, :cond_1

    .line 110
    .line 111
    iget-object v1, p0, Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner;->c:Ln3/a;

    .line 112
    .line 113
    invoke-virtual {v1, v0}, Landroid/widget/ListPopupWindow;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 114
    .line 115
    .line 116
    goto :goto_0

    .line 117
    :cond_1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner;->c:Ln3/a;

    .line 118
    .line 119
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 120
    .line 121
    .line 122
    move-result-object v1

    .line 123
    sget v2, Lcom/xuexiang/xui/R$drawable;->ms_drop_down_bg_radius:I

    .line 124
    .line 125
    invoke-virtual {v1, v2}, Landroid/content/Context;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 126
    .line 127
    .line 128
    move-result-object v1

    .line 129
    invoke-virtual {v0, v1}, Landroid/widget/ListPopupWindow;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 130
    .line 131
    .line 132
    :cond_2
    :goto_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner;->c:Ln3/a;

    .line 133
    .line 134
    invoke-virtual {v0, p1}, Landroid/widget/ListPopupWindow;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 135
    .line 136
    .line 137
    return-void
.end method


# virtual methods
.method public final afterTextChanged(Landroid/text/Editable;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object v0, p0, Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner;->a:Landroid/widget/EditText;

    .line 6
    .line 7
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setSelection(I)V

    .line 12
    .line 13
    .line 14
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    if-nez p1, :cond_1

    .line 19
    .line 20
    iget-boolean p1, p0, Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner;->h:Z

    .line 21
    .line 22
    if-eqz p1, :cond_2

    .line 23
    .line 24
    iget-object p1, p0, Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner;->c:Ln3/a;

    .line 25
    .line 26
    if-eqz p1, :cond_0

    .line 27
    .line 28
    invoke-virtual {p1}, Landroid/widget/ListPopupWindow;->dismiss()V

    .line 29
    .line 30
    .line 31
    :cond_0
    return-void

    .line 32
    :cond_1
    iget-object p1, p0, Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner;->c:Ln3/a;

    .line 33
    .line 34
    if-eqz p1, :cond_2

    .line 35
    .line 36
    invoke-virtual {p1}, Landroid/widget/ListPopupWindow;->dismiss()V

    .line 37
    .line 38
    .line 39
    :cond_2
    return-void
.end method

.method public final beforeTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    return-void
.end method

.method public getEditText()Landroid/widget/EditText;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner;->a:Landroid/widget/EditText;

    .line 2
    .line 3
    return-object v0
.end method

.method public getText()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner;->a:Landroid/widget/EditText;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    return-object v0

    .line 14
    :cond_0
    const-string v0, ""

    .line 15
    .line 16
    return-object v0
.end method

.method public final onClick(Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Landroid/widget/AdapterView;->getAdapter()Landroid/widget/Adapter;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Ln3/b;

    .line 6
    .line 7
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    const/4 p1, 0x0

    .line 11
    throw p1
.end method

.method public final onTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    return-void
.end method

.method public setEnabled(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner;->a:Landroid/widget/EditText;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Landroid/view/View;->setFocusable(Z)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner;->a:Landroid/widget/EditText;

    .line 9
    .line 10
    invoke-virtual {v0, p1}, Landroid/view/View;->setFocusableInTouchMode(Z)V

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner;->a:Landroid/widget/EditText;

    .line 14
    .line 15
    invoke-virtual {v0, p1}, Landroid/view/View;->setEnabled(Z)V

    .line 16
    .line 17
    .line 18
    iget-object v0, p0, Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner;->b:Landroid/widget/ImageView;

    .line 19
    .line 20
    invoke-virtual {v0, p1}, Landroid/view/View;->setEnabled(Z)V

    .line 21
    .line 22
    .line 23
    :cond_0
    return-void
.end method
