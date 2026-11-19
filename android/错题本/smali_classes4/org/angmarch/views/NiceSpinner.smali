.class public Lorg/angmarch/views/NiceSpinner;
.super Landroidx/appcompat/widget/AppCompatTextView;
.source "SourceFile"


# instance fields
.field public b:I

.field public c:Landroid/graphics/drawable/Drawable;

.field public d:Landroid/widget/ListPopupWindow;

.field public e:Lorg/angmarch/views/c;

.field public f:Landroid/widget/AdapterView$OnItemSelectedListener;

.field public g:La8/e;

.field public h:Z

.field public i:I

.field public j:I

.field public k:I

.field public l:I

.field public m:I

.field public n:I

.field public o:I

.field public p:La8/f;

.field public q:La8/f;

.field public r:Lorg/angmarch/views/PopUpTextAlignment;

.field public s:Landroid/animation/ObjectAnimator;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 1
    invoke-direct {p0, p1}, Landroidx/appcompat/widget/AppCompatTextView;-><init>(Landroid/content/Context;)V

    .line 2
    new-instance v0, Lio/reactivex/internal/operators/observable/c;

    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    iput-object v0, p0, Lorg/angmarch/views/NiceSpinner;->p:La8/f;

    .line 5
    new-instance v0, Lio/reactivex/internal/operators/observable/c;

    .line 6
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 7
    iput-object v0, p0, Lorg/angmarch/views/NiceSpinner;->q:La8/f;

    const/4 v0, 0x0

    .line 8
    iput-object v0, p0, Lorg/angmarch/views/NiceSpinner;->s:Landroid/animation/ObjectAnimator;

    .line 9
    invoke-virtual {p0, p1, v0}, Lorg/angmarch/views/NiceSpinner;->e(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 10
    invoke-direct {p0, p1, p2}, Landroidx/appcompat/widget/AppCompatTextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 11
    new-instance v0, Lio/reactivex/internal/operators/observable/c;

    .line 12
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 13
    iput-object v0, p0, Lorg/angmarch/views/NiceSpinner;->p:La8/f;

    .line 14
    new-instance v0, Lio/reactivex/internal/operators/observable/c;

    .line 15
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 16
    iput-object v0, p0, Lorg/angmarch/views/NiceSpinner;->q:La8/f;

    const/4 v0, 0x0

    .line 17
    iput-object v0, p0, Lorg/angmarch/views/NiceSpinner;->s:Landroid/animation/ObjectAnimator;

    .line 18
    invoke-virtual {p0, p1, p2}, Lorg/angmarch/views/NiceSpinner;->e(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 19
    invoke-direct {p0, p1, p2, p3}, Landroidx/appcompat/widget/AppCompatTextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 20
    new-instance p3, Lio/reactivex/internal/operators/observable/c;

    .line 21
    invoke-direct {p3}, Ljava/lang/Object;-><init>()V

    .line 22
    iput-object p3, p0, Lorg/angmarch/views/NiceSpinner;->p:La8/f;

    .line 23
    new-instance p3, Lio/reactivex/internal/operators/observable/c;

    .line 24
    invoke-direct {p3}, Ljava/lang/Object;-><init>()V

    .line 25
    iput-object p3, p0, Lorg/angmarch/views/NiceSpinner;->q:La8/f;

    const/4 p3, 0x0

    .line 26
    iput-object p3, p0, Lorg/angmarch/views/NiceSpinner;->s:Landroid/animation/ObjectAnimator;

    .line 27
    invoke-virtual {p0, p1, p2}, Lorg/angmarch/views/NiceSpinner;->e(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public static synthetic b(Lorg/angmarch/views/NiceSpinner;Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lorg/angmarch/views/NiceSpinner;->setTextInternal(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private getParentVerticalOffset()I
    .locals 2

    .line 1
    iget v0, p0, Lorg/angmarch/views/NiceSpinner;->m:I

    .line 2
    .line 3
    if-lez v0, :cond_0

    .line 4
    .line 5
    return v0

    .line 6
    :cond_0
    const/4 v0, 0x2

    .line 7
    new-array v0, v0, [I

    .line 8
    .line 9
    invoke-virtual {p0, v0}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 10
    .line 11
    .line 12
    const/4 v1, 0x1

    .line 13
    aget v0, v0, v1

    .line 14
    .line 15
    iput v0, p0, Lorg/angmarch/views/NiceSpinner;->m:I

    .line 16
    .line 17
    return v0
.end method

.method private getPopUpHeight()I
    .locals 2

    .line 1
    iget v0, p0, Lorg/angmarch/views/NiceSpinner;->l:I

    .line 2
    .line 3
    invoke-direct {p0}, Lorg/angmarch/views/NiceSpinner;->getParentVerticalOffset()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    sub-int/2addr v0, v1

    .line 8
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    sub-int/2addr v0, v1

    .line 13
    invoke-direct {p0}, Lorg/angmarch/views/NiceSpinner;->getParentVerticalOffset()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    return v0
.end method

.method private setAdapterInternal(Lorg/angmarch/views/c;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lorg/angmarch/views/c;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Landroid/widget/BaseAdapter;->getCount()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-ltz v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    iput v0, p0, Lorg/angmarch/views/NiceSpinner;->b:I

    .line 9
    .line 10
    iget-object v0, p0, Lorg/angmarch/views/NiceSpinner;->d:Landroid/widget/ListPopupWindow;

    .line 11
    .line 12
    invoke-virtual {v0, p1}, Landroid/widget/ListPopupWindow;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 13
    .line 14
    .line 15
    iget v0, p0, Lorg/angmarch/views/NiceSpinner;->b:I

    .line 16
    .line 17
    invoke-virtual {p1, v0}, Lorg/angmarch/views/c;->a(I)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    invoke-direct {p0, p1}, Lorg/angmarch/views/NiceSpinner;->setTextInternal(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    :cond_0
    return-void
.end method

.method private setArrowDrawableOrHide(Landroid/graphics/drawable/Drawable;)V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lorg/angmarch/views/NiceSpinner;->h:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    invoke-virtual {p0, v1, v1, p1, v1}, Landroidx/appcompat/widget/AppCompatTextView;->setCompoundDrawablesWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    invoke-virtual {p0, v1, v1, v1, v1}, Landroidx/appcompat/widget/AppCompatTextView;->setCompoundDrawablesWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method private setTextInternal(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/angmarch/views/NiceSpinner;->q:La8/f;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Landroid/text/SpannableString;

    .line 6
    .line 7
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-direct {v0, p1}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 23
    .line 24
    .line 25
    return-void
.end method


# virtual methods
.method public final c(Z)V
    .locals 3

    .line 1
    const/16 v0, 0x2710

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz p1, :cond_0

    .line 5
    .line 6
    move v2, v1

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    move v2, v0

    .line 9
    :goto_0
    if-eqz p1, :cond_1

    .line 10
    .line 11
    goto :goto_1

    .line 12
    :cond_1
    move v0, v1

    .line 13
    :goto_1
    iget-object p1, p0, Lorg/angmarch/views/NiceSpinner;->c:Landroid/graphics/drawable/Drawable;

    .line 14
    .line 15
    const-string v1, "level"

    .line 16
    .line 17
    filled-new-array {v2, v0}, [I

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-static {p1, v1, v0}, Landroid/animation/ObjectAnimator;->ofInt(Ljava/lang/Object;Ljava/lang/String;[I)Landroid/animation/ObjectAnimator;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    iput-object p1, p0, Lorg/angmarch/views/NiceSpinner;->s:Landroid/animation/ObjectAnimator;

    .line 26
    .line 27
    new-instance v0, Landroidx/interpolator/view/animation/LinearOutSlowInInterpolator;

    .line 28
    .line 29
    invoke-direct {v0}, Landroidx/interpolator/view/animation/LinearOutSlowInInterpolator;-><init>()V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p1, v0}, Landroid/animation/Animator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 33
    .line 34
    .line 35
    iget-object p1, p0, Lorg/angmarch/views/NiceSpinner;->s:Landroid/animation/ObjectAnimator;

    .line 36
    .line 37
    invoke-virtual {p1}, Landroid/animation/ObjectAnimator;->start()V

    .line 38
    .line 39
    .line 40
    return-void
.end method

.method public final d(Ljava/util/List;)V
    .locals 7

    .line 1
    new-instance v0, Lorg/angmarch/views/a;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    iget v2, p0, Lorg/angmarch/views/NiceSpinner;->i:I

    .line 7
    .line 8
    iget v3, p0, Lorg/angmarch/views/NiceSpinner;->j:I

    .line 9
    .line 10
    iget-object v4, p0, Lorg/angmarch/views/NiceSpinner;->p:La8/f;

    .line 11
    .line 12
    iget-object v5, p0, Lorg/angmarch/views/NiceSpinner;->r:Lorg/angmarch/views/PopUpTextAlignment;

    .line 13
    .line 14
    const/4 v6, 0x0

    .line 15
    move-object v1, p1

    .line 16
    invoke-direct/range {v0 .. v6}, Lorg/angmarch/views/a;-><init>(Ljava/lang/Object;IILa8/f;Lorg/angmarch/views/PopUpTextAlignment;I)V

    .line 17
    .line 18
    .line 19
    iput-object v0, p0, Lorg/angmarch/views/NiceSpinner;->e:Lorg/angmarch/views/c;

    .line 20
    .line 21
    invoke-direct {p0, v0}, Lorg/angmarch/views/NiceSpinner;->setAdapterInternal(Lorg/angmarch/views/c;)V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public final e(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 5

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Lorg/angmarch/views/R$styleable;->NiceSpinner:[I

    .line 6
    .line 7
    invoke-virtual {p1, p2, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    sget v1, Lorg/angmarch/views/R$dimen;->one_and_a_half_grid_unit:I

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    const v2, 0x800013

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0, v2}, Landroid/widget/TextView;->setGravity(I)V

    .line 21
    .line 22
    .line 23
    sget v2, Lorg/angmarch/views/R$dimen;->three_grid_unit:I

    .line 24
    .line 25
    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    invoke-virtual {p0, v0, v1, v1, v1}, Landroid/view/View;->setPadding(IIII)V

    .line 30
    .line 31
    .line 32
    const/4 v0, 0x1

    .line 33
    invoke-virtual {p0, v0}, Landroid/view/View;->setClickable(Z)V

    .line 34
    .line 35
    .line 36
    sget v1, Lorg/angmarch/views/R$styleable;->NiceSpinner_backgroundSelector:I

    .line 37
    .line 38
    sget v2, Lorg/angmarch/views/R$drawable;->selector:I

    .line 39
    .line 40
    invoke-virtual {p2, v1, v2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    iput v1, p0, Lorg/angmarch/views/NiceSpinner;->j:I

    .line 45
    .line 46
    invoke-virtual {p0, v1}, Landroidx/appcompat/widget/AppCompatTextView;->setBackgroundResource(I)V

    .line 47
    .line 48
    .line 49
    sget v1, Lorg/angmarch/views/R$styleable;->NiceSpinner_textTint:I

    .line 50
    .line 51
    new-instance v2, Landroid/util/TypedValue;

    .line 52
    .line 53
    invoke-direct {v2}, Landroid/util/TypedValue;-><init>()V

    .line 54
    .line 55
    .line 56
    invoke-virtual {p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 57
    .line 58
    .line 59
    move-result-object v3

    .line 60
    const v4, 0x1010036

    .line 61
    .line 62
    .line 63
    invoke-virtual {v3, v4, v2, v0}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 64
    .line 65
    .line 66
    iget v2, v2, Landroid/util/TypedValue;->data:I

    .line 67
    .line 68
    filled-new-array {v4}, [I

    .line 69
    .line 70
    .line 71
    move-result-object v3

    .line 72
    invoke-virtual {p1, v2, v3}, Landroid/content/Context;->obtainStyledAttributes(I[I)Landroid/content/res/TypedArray;

    .line 73
    .line 74
    .line 75
    move-result-object v2

    .line 76
    const/high16 v3, -0x1000000

    .line 77
    .line 78
    const/4 v4, 0x0

    .line 79
    invoke-virtual {v2, v4, v3}, Landroid/content/res/TypedArray;->getColor(II)I

    .line 80
    .line 81
    .line 82
    move-result v3

    .line 83
    invoke-virtual {v2}, Landroid/content/res/TypedArray;->recycle()V

    .line 84
    .line 85
    .line 86
    invoke-virtual {p2, v1, v3}, Landroid/content/res/TypedArray;->getColor(II)I

    .line 87
    .line 88
    .line 89
    move-result v1

    .line 90
    iput v1, p0, Lorg/angmarch/views/NiceSpinner;->i:I

    .line 91
    .line 92
    invoke-virtual {p0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 93
    .line 94
    .line 95
    new-instance v1, Landroid/widget/ListPopupWindow;

    .line 96
    .line 97
    invoke-direct {v1, p1}, Landroid/widget/ListPopupWindow;-><init>(Landroid/content/Context;)V

    .line 98
    .line 99
    .line 100
    iput-object v1, p0, Lorg/angmarch/views/NiceSpinner;->d:Landroid/widget/ListPopupWindow;

    .line 101
    .line 102
    new-instance p1, La8/b;

    .line 103
    .line 104
    invoke-direct {p1, p0}, La8/b;-><init>(Lorg/angmarch/views/NiceSpinner;)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {v1, p1}, Landroid/widget/ListPopupWindow;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 108
    .line 109
    .line 110
    iget-object p1, p0, Lorg/angmarch/views/NiceSpinner;->d:Landroid/widget/ListPopupWindow;

    .line 111
    .line 112
    invoke-virtual {p1, v0}, Landroid/widget/ListPopupWindow;->setModal(Z)V

    .line 113
    .line 114
    .line 115
    iget-object p1, p0, Lorg/angmarch/views/NiceSpinner;->d:Landroid/widget/ListPopupWindow;

    .line 116
    .line 117
    new-instance v0, La8/c;

    .line 118
    .line 119
    const/4 v1, 0x0

    .line 120
    invoke-direct {v0, p0, v1}, La8/c;-><init>(Landroid/view/View;I)V

    .line 121
    .line 122
    .line 123
    invoke-virtual {p1, v0}, Landroid/widget/ListPopupWindow;->setOnDismissListener(Landroid/widget/PopupWindow$OnDismissListener;)V

    .line 124
    .line 125
    .line 126
    sget p1, Lorg/angmarch/views/R$styleable;->NiceSpinner_hideArrow:I

    .line 127
    .line 128
    invoke-virtual {p2, p1, v4}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 129
    .line 130
    .line 131
    move-result p1

    .line 132
    iput-boolean p1, p0, Lorg/angmarch/views/NiceSpinner;->h:Z

    .line 133
    .line 134
    sget p1, Lorg/angmarch/views/R$styleable;->NiceSpinner_arrowTint:I

    .line 135
    .line 136
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 137
    .line 138
    .line 139
    move-result-object v0

    .line 140
    const v1, 0x106000c

    .line 141
    .line 142
    .line 143
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    .line 144
    .line 145
    .line 146
    move-result v0

    .line 147
    invoke-virtual {p2, p1, v0}, Landroid/content/res/TypedArray;->getColor(II)I

    .line 148
    .line 149
    .line 150
    move-result p1

    .line 151
    iput p1, p0, Lorg/angmarch/views/NiceSpinner;->k:I

    .line 152
    .line 153
    sget p1, Lorg/angmarch/views/R$styleable;->NiceSpinner_arrowDrawable:I

    .line 154
    .line 155
    sget v0, Lorg/angmarch/views/R$drawable;->arrow:I

    .line 156
    .line 157
    invoke-virtual {p2, p1, v0}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 158
    .line 159
    .line 160
    move-result p1

    .line 161
    iput p1, p0, Lorg/angmarch/views/NiceSpinner;->o:I

    .line 162
    .line 163
    sget p1, Lorg/angmarch/views/R$styleable;->NiceSpinner_dropDownListPaddingBottom:I

    .line 164
    .line 165
    invoke-virtual {p2, p1, v4}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    .line 166
    .line 167
    .line 168
    move-result p1

    .line 169
    iput p1, p0, Lorg/angmarch/views/NiceSpinner;->n:I

    .line 170
    .line 171
    sget p1, Lorg/angmarch/views/R$styleable;->NiceSpinner_popupTextAlignment:I

    .line 172
    .line 173
    sget-object v0, Lorg/angmarch/views/PopUpTextAlignment;->CENTER:Lorg/angmarch/views/PopUpTextAlignment;

    .line 174
    .line 175
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 176
    .line 177
    .line 178
    move-result v0

    .line 179
    invoke-virtual {p2, p1, v0}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 180
    .line 181
    .line 182
    move-result p1

    .line 183
    invoke-static {p1}, Lorg/angmarch/views/PopUpTextAlignment;->fromId(I)Lorg/angmarch/views/PopUpTextAlignment;

    .line 184
    .line 185
    .line 186
    move-result-object p1

    .line 187
    iput-object p1, p0, Lorg/angmarch/views/NiceSpinner;->r:Lorg/angmarch/views/PopUpTextAlignment;

    .line 188
    .line 189
    sget p1, Lorg/angmarch/views/R$styleable;->NiceSpinner_entries:I

    .line 190
    .line 191
    invoke-virtual {p2, p1}, Landroid/content/res/TypedArray;->getTextArray(I)[Ljava/lang/CharSequence;

    .line 192
    .line 193
    .line 194
    move-result-object p1

    .line 195
    if-eqz p1, :cond_0

    .line 196
    .line 197
    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 198
    .line 199
    .line 200
    move-result-object p1

    .line 201
    invoke-virtual {p0, p1}, Lorg/angmarch/views/NiceSpinner;->d(Ljava/util/List;)V

    .line 202
    .line 203
    .line 204
    :cond_0
    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    .line 205
    .line 206
    .line 207
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 208
    .line 209
    .line 210
    move-result-object p1

    .line 211
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 212
    .line 213
    .line 214
    move-result-object p1

    .line 215
    invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 216
    .line 217
    .line 218
    move-result-object p1

    .line 219
    iget p1, p1, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 220
    .line 221
    iput p1, p0, Lorg/angmarch/views/NiceSpinner;->l:I

    .line 222
    .line 223
    return-void
.end method

.method public final f(I)Landroid/graphics/drawable/Drawable;
    .locals 2

    .line 1
    iget v0, p0, Lorg/angmarch/views/NiceSpinner;->o:I

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    return-object p1

    .line 7
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iget v1, p0, Lorg/angmarch/views/NiceSpinner;->o:I

    .line 12
    .line 13
    invoke-static {v0, v1}, Landroidx/core/content/ContextCompat;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    invoke-static {v0}, Landroidx/core/graphics/drawable/DrawableCompat;->wrap(Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    const v1, 0x7fffffff

    .line 28
    .line 29
    .line 30
    if-eq p1, v1, :cond_1

    .line 31
    .line 32
    if-eqz p1, :cond_1

    .line 33
    .line 34
    invoke-static {v0, p1}, Landroidx/core/graphics/drawable/DrawableCompat;->setTint(Landroid/graphics/drawable/Drawable;I)V

    .line 35
    .line 36
    .line 37
    :cond_1
    return-object v0
.end method

.method public final g()V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lorg/angmarch/views/NiceSpinner;->h:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    invoke-virtual {p0, v0}, Lorg/angmarch/views/NiceSpinner;->c(Z)V

    .line 7
    .line 8
    .line 9
    :cond_0
    iget-object v0, p0, Lorg/angmarch/views/NiceSpinner;->d:Landroid/widget/ListPopupWindow;

    .line 10
    .line 11
    invoke-virtual {v0, p0}, Landroid/widget/ListPopupWindow;->setAnchorView(Landroid/view/View;)V

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, Lorg/angmarch/views/NiceSpinner;->d:Landroid/widget/ListPopupWindow;

    .line 15
    .line 16
    invoke-virtual {v0}, Landroid/widget/ListPopupWindow;->show()V

    .line 17
    .line 18
    .line 19
    iget-object v0, p0, Lorg/angmarch/views/NiceSpinner;->d:Landroid/widget/ListPopupWindow;

    .line 20
    .line 21
    invoke-virtual {v0}, Landroid/widget/ListPopupWindow;->getListView()Landroid/widget/ListView;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    if-eqz v0, :cond_1

    .line 26
    .line 27
    const/4 v1, 0x0

    .line 28
    invoke-virtual {v0, v1}, Landroid/view/View;->setVerticalScrollBarEnabled(Z)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0, v1}, Landroid/view/View;->setHorizontalScrollBarEnabled(Z)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0, v1}, Landroid/view/View;->setVerticalFadingEdgeEnabled(Z)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0, v1}, Landroid/view/View;->setHorizontalFadingEdgeEnabled(Z)V

    .line 38
    .line 39
    .line 40
    :cond_1
    return-void
.end method

.method public getDropDownListPaddingBottom()I
    .locals 1

    .line 1
    iget v0, p0, Lorg/angmarch/views/NiceSpinner;->n:I

    .line 2
    .line 3
    return v0
.end method

.method public getOnSpinnerItemSelectedListener()La8/e;
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/angmarch/views/NiceSpinner;->g:La8/e;

    .line 2
    .line 3
    return-object v0
.end method

.method public getPopUpTextAlignment()Lorg/angmarch/views/PopUpTextAlignment;
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/angmarch/views/NiceSpinner;->r:Lorg/angmarch/views/PopUpTextAlignment;

    .line 2
    .line 3
    return-object v0
.end method

.method public getSelectedIndex()I
    .locals 1

    .line 1
    iget v0, p0, Lorg/angmarch/views/NiceSpinner;->b:I

    .line 2
    .line 3
    return v0
.end method

.method public getSelectedItem()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lorg/angmarch/views/NiceSpinner;->e:Lorg/angmarch/views/c;

    .line 2
    .line 3
    iget v1, p0, Lorg/angmarch/views/NiceSpinner;->b:I

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lorg/angmarch/views/c;->a(I)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public final onAttachedToWindow()V
    .locals 0

    .line 1
    invoke-super {p0}, Landroid/view/View;->onAttachedToWindow()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final onDetachedFromWindow()V
    .locals 1

    .line 1
    iget-object v0, p0, Lorg/angmarch/views/NiceSpinner;->s:Landroid/animation/ObjectAnimator;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/animation/Animator;->cancel()V

    .line 6
    .line 7
    .line 8
    :cond_0
    invoke-super {p0}, Landroidx/appcompat/widget/AppCompatTextView;->onDetachedFromWindow()V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final onRestoreInstanceState(Landroid/os/Parcelable;)V
    .locals 3

    .line 1
    instance-of v0, p1, Landroid/os/Bundle;

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    check-cast p1, Landroid/os/Bundle;

    .line 6
    .line 7
    const-string v0, "selected_index"

    .line 8
    .line 9
    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    iput v0, p0, Lorg/angmarch/views/NiceSpinner;->b:I

    .line 14
    .line 15
    iget-object v1, p0, Lorg/angmarch/views/NiceSpinner;->e:Lorg/angmarch/views/c;

    .line 16
    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    iget-object v2, p0, Lorg/angmarch/views/NiceSpinner;->q:La8/f;

    .line 20
    .line 21
    invoke-virtual {v1, v0}, Lorg/angmarch/views/c;->a(I)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    check-cast v2, Lio/reactivex/internal/operators/observable/c;

    .line 26
    .line 27
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    new-instance v1, Landroid/text/SpannableString;

    .line 31
    .line 32
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-direct {v1, v0}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    invoke-direct {p0, v0}, Lorg/angmarch/views/NiceSpinner;->setTextInternal(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    iget-object v0, p0, Lorg/angmarch/views/NiceSpinner;->e:Lorg/angmarch/views/c;

    .line 47
    .line 48
    iget v1, p0, Lorg/angmarch/views/NiceSpinner;->b:I

    .line 49
    .line 50
    iput v1, v0, Lorg/angmarch/views/c;->e:I

    .line 51
    .line 52
    :cond_0
    const-string v0, "is_popup_showing"

    .line 53
    .line 54
    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    if-eqz v0, :cond_1

    .line 59
    .line 60
    iget-object v0, p0, Lorg/angmarch/views/NiceSpinner;->d:Landroid/widget/ListPopupWindow;

    .line 61
    .line 62
    if-eqz v0, :cond_1

    .line 63
    .line 64
    new-instance v0, La8/a;

    .line 65
    .line 66
    const/4 v1, 0x0

    .line 67
    invoke-direct {v0, p0, v1}, La8/a;-><init>(Ljava/lang/Object;I)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {p0, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 71
    .line 72
    .line 73
    :cond_1
    const-string v0, "is_arrow_hidden"

    .line 74
    .line 75
    const/4 v1, 0x0

    .line 76
    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    .line 77
    .line 78
    .line 79
    move-result v0

    .line 80
    iput-boolean v0, p0, Lorg/angmarch/views/NiceSpinner;->h:Z

    .line 81
    .line 82
    const-string v0, "arrow_drawable_res_id"

    .line 83
    .line 84
    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 85
    .line 86
    .line 87
    move-result v0

    .line 88
    iput v0, p0, Lorg/angmarch/views/NiceSpinner;->o:I

    .line 89
    .line 90
    const-string v0, "instance_state"

    .line 91
    .line 92
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    :cond_2
    invoke-super {p0, p1}, Landroid/view/View;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    .line 97
    .line 98
    .line 99
    return-void
.end method

.method public final onSaveInstanceState()Landroid/os/Parcelable;
    .locals 3

    .line 1
    new-instance v0, Landroid/os/Bundle;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "instance_state"

    .line 7
    .line 8
    invoke-super {p0}, Landroid/view/View;->onSaveInstanceState()Landroid/os/Parcelable;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 13
    .line 14
    .line 15
    const-string v1, "selected_index"

    .line 16
    .line 17
    iget v2, p0, Lorg/angmarch/views/NiceSpinner;->b:I

    .line 18
    .line 19
    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 20
    .line 21
    .line 22
    const-string v1, "is_arrow_hidden"

    .line 23
    .line 24
    iget-boolean v2, p0, Lorg/angmarch/views/NiceSpinner;->h:Z

    .line 25
    .line 26
    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 27
    .line 28
    .line 29
    const-string v1, "arrow_drawable_res_id"

    .line 30
    .line 31
    iget v2, p0, Lorg/angmarch/views/NiceSpinner;->o:I

    .line 32
    .line 33
    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 34
    .line 35
    .line 36
    iget-object v1, p0, Lorg/angmarch/views/NiceSpinner;->d:Landroid/widget/ListPopupWindow;

    .line 37
    .line 38
    if-eqz v1, :cond_0

    .line 39
    .line 40
    const-string v2, "is_popup_showing"

    .line 41
    .line 42
    invoke-virtual {v1}, Landroid/widget/ListPopupWindow;->isShowing()Z

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    invoke-virtual {v0, v2, v1}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 47
    .line 48
    .line 49
    :cond_0
    return-object v0
.end method

.method public final onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->isEnabled()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_2

    .line 6
    .line 7
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v1, 0x1

    .line 12
    if-ne v0, v1, :cond_2

    .line 13
    .line 14
    iget-object v0, p0, Lorg/angmarch/views/NiceSpinner;->d:Landroid/widget/ListPopupWindow;

    .line 15
    .line 16
    invoke-virtual {v0}, Landroid/widget/ListPopupWindow;->isShowing()Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-nez v0, :cond_0

    .line 21
    .line 22
    iget-object v0, p0, Lorg/angmarch/views/NiceSpinner;->e:Lorg/angmarch/views/c;

    .line 23
    .line 24
    invoke-virtual {v0}, Landroid/widget/BaseAdapter;->getCount()I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-lez v0, :cond_0

    .line 29
    .line 30
    invoke-virtual {p0}, Lorg/angmarch/views/NiceSpinner;->g()V

    .line 31
    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    iget-boolean v0, p0, Lorg/angmarch/views/NiceSpinner;->h:Z

    .line 35
    .line 36
    if-nez v0, :cond_1

    .line 37
    .line 38
    const/4 v0, 0x0

    .line 39
    invoke-virtual {p0, v0}, Lorg/angmarch/views/NiceSpinner;->c(Z)V

    .line 40
    .line 41
    .line 42
    :cond_1
    iget-object v0, p0, Lorg/angmarch/views/NiceSpinner;->d:Landroid/widget/ListPopupWindow;

    .line 43
    .line 44
    invoke-virtual {v0}, Landroid/widget/ListPopupWindow;->dismiss()V

    .line 45
    .line 46
    .line 47
    :cond_2
    :goto_0
    invoke-super {p0, p1}, Landroid/view/View;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 48
    .line 49
    .line 50
    move-result p1

    .line 51
    return p1
.end method

.method public final onVisibilityChanged(Landroid/view/View;I)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Landroid/view/View;->onVisibilityChanged(Landroid/view/View;I)V

    .line 2
    .line 3
    .line 4
    iget p1, p0, Lorg/angmarch/views/NiceSpinner;->k:I

    .line 5
    .line 6
    invoke-virtual {p0, p1}, Lorg/angmarch/views/NiceSpinner;->f(I)Landroid/graphics/drawable/Drawable;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    iput-object p1, p0, Lorg/angmarch/views/NiceSpinner;->c:Landroid/graphics/drawable/Drawable;

    .line 11
    .line 12
    invoke-direct {p0, p1}, Lorg/angmarch/views/NiceSpinner;->setArrowDrawableOrHide(Landroid/graphics/drawable/Drawable;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public setAdapter(Landroid/widget/ListAdapter;)V
    .locals 7

    .line 1
    new-instance v0, Lorg/angmarch/views/a;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    iget v2, p0, Lorg/angmarch/views/NiceSpinner;->i:I

    .line 7
    .line 8
    iget v3, p0, Lorg/angmarch/views/NiceSpinner;->j:I

    .line 9
    .line 10
    iget-object v4, p0, Lorg/angmarch/views/NiceSpinner;->p:La8/f;

    .line 11
    .line 12
    iget-object v5, p0, Lorg/angmarch/views/NiceSpinner;->r:Lorg/angmarch/views/PopUpTextAlignment;

    .line 13
    .line 14
    const/4 v6, 0x1

    .line 15
    move-object v1, p1

    .line 16
    invoke-direct/range {v0 .. v6}, Lorg/angmarch/views/a;-><init>(Ljava/lang/Object;IILa8/f;Lorg/angmarch/views/PopUpTextAlignment;I)V

    .line 17
    .line 18
    .line 19
    iput-object v0, p0, Lorg/angmarch/views/NiceSpinner;->e:Lorg/angmarch/views/c;

    .line 20
    .line 21
    invoke-direct {p0, v0}, Lorg/angmarch/views/NiceSpinner;->setAdapterInternal(Lorg/angmarch/views/c;)V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public setArrowDrawable(I)V
    .locals 0
    .param p1    # I
        .annotation build Landroidx/annotation/ColorRes;
        .end annotation

        .annotation build Landroidx/annotation/DrawableRes;
        .end annotation
    .end param

    .line 1
    iput p1, p0, Lorg/angmarch/views/NiceSpinner;->o:I

    .line 2
    sget p1, Lorg/angmarch/views/R$drawable;->arrow:I

    invoke-virtual {p0, p1}, Lorg/angmarch/views/NiceSpinner;->f(I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    iput-object p1, p0, Lorg/angmarch/views/NiceSpinner;->c:Landroid/graphics/drawable/Drawable;

    .line 3
    invoke-direct {p0, p1}, Lorg/angmarch/views/NiceSpinner;->setArrowDrawableOrHide(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public setArrowDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    .line 4
    iput-object p1, p0, Lorg/angmarch/views/NiceSpinner;->c:Landroid/graphics/drawable/Drawable;

    .line 5
    invoke-direct {p0, p1}, Lorg/angmarch/views/NiceSpinner;->setArrowDrawableOrHide(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public setArrowTintColor(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lorg/angmarch/views/NiceSpinner;->c:Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-boolean v1, p0, Lorg/angmarch/views/NiceSpinner;->h:Z

    .line 6
    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    invoke-static {v0, p1}, Landroidx/core/graphics/drawable/DrawableCompat;->setTint(Landroid/graphics/drawable/Drawable;I)V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public setDropDownListPaddingBottom(I)V
    .locals 0

    .line 1
    iput p1, p0, Lorg/angmarch/views/NiceSpinner;->n:I

    .line 2
    .line 3
    return-void
.end method

.method public setOnItemSelectedListener(Landroid/widget/AdapterView$OnItemSelectedListener;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    iput-object p1, p0, Lorg/angmarch/views/NiceSpinner;->f:Landroid/widget/AdapterView$OnItemSelectedListener;

    .line 2
    .line 3
    return-void
.end method

.method public setOnSpinnerItemSelectedListener(La8/e;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lorg/angmarch/views/NiceSpinner;->g:La8/e;

    .line 2
    .line 3
    return-void
.end method

.method public setSelectedIndex(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lorg/angmarch/views/NiceSpinner;->e:Lorg/angmarch/views/c;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    if-ltz p1, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0}, Landroid/widget/BaseAdapter;->getCount()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-gt p1, v0, :cond_0

    .line 12
    .line 13
    iget-object v0, p0, Lorg/angmarch/views/NiceSpinner;->e:Lorg/angmarch/views/c;

    .line 14
    .line 15
    iput p1, v0, Lorg/angmarch/views/c;->e:I

    .line 16
    .line 17
    iput p1, p0, Lorg/angmarch/views/NiceSpinner;->b:I

    .line 18
    .line 19
    iget-object v1, p0, Lorg/angmarch/views/NiceSpinner;->q:La8/f;

    .line 20
    .line 21
    invoke-virtual {v0, p1}, Lorg/angmarch/views/c;->a(I)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    check-cast v1, Lio/reactivex/internal/operators/observable/c;

    .line 26
    .line 27
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    new-instance v0, Landroid/text/SpannableString;

    .line 31
    .line 32
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    invoke-direct {v0, p1}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    invoke-direct {p0, p1}, Lorg/angmarch/views/NiceSpinner;->setTextInternal(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    return-void

    .line 47
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 48
    .line 49
    const-string v0, "Position must be lower than adapter count!"

    .line 50
    .line 51
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    throw p1

    .line 55
    :cond_1
    return-void
.end method

.method public setSelectedTextFormatter(La8/f;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lorg/angmarch/views/NiceSpinner;->q:La8/f;

    .line 2
    .line 3
    return-void
.end method

.method public setSpinnerTextFormatter(La8/f;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lorg/angmarch/views/NiceSpinner;->p:La8/f;

    .line 2
    .line 3
    return-void
.end method

.method public setTintColor(I)V
    .locals 2
    .param p1    # I
        .annotation build Landroidx/annotation/ColorRes;
        .end annotation
    .end param

    .line 1
    iget-object v0, p0, Lorg/angmarch/views/NiceSpinner;->c:Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-boolean v1, p0, Lorg/angmarch/views/NiceSpinner;->h:Z

    .line 6
    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-static {v1, p1}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    invoke-static {v0, p1}, Landroidx/core/graphics/drawable/DrawableCompat;->setTint(Landroid/graphics/drawable/Drawable;I)V

    .line 18
    .line 19
    .line 20
    :cond_0
    return-void
.end method
