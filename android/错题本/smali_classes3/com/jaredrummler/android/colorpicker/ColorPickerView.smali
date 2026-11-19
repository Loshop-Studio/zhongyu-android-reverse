.class public Lcom/jaredrummler/android/colorpicker/ColorPickerView;
.super Landroid/view/View;
.source "SourceFile"


# instance fields
.field public A:Landroid/graphics/Rect;

.field public B:Landroid/graphics/Rect;

.field public C:Landroid/graphics/Rect;

.field public D:Landroid/graphics/Point;

.field public E:Lm1/a;

.field public F:Lm1/m;

.field public final a:I

.field public final b:I

.field public final c:I

.field public final d:I

.field public final e:I

.field public final f:I

.field public final g:Landroid/graphics/Paint;

.field public final h:Landroid/graphics/Paint;

.field public final i:Landroid/graphics/Paint;

.field public final j:Landroid/graphics/Paint;

.field public final k:Landroid/graphics/Paint;

.field public final l:Landroid/graphics/Paint;

.field public m:Landroid/graphics/LinearGradient;

.field public n:Landroid/graphics/LinearGradient;

.field public o:Lm1/l;

.field public p:Lm1/l;

.field public q:I

.field public r:F

.field public s:F

.field public t:F

.field public u:Z

.field public v:Ljava/lang/String;

.field public w:I

.field public x:I

.field public final y:I

.field public z:Landroid/graphics/Rect;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, v0}, Lcom/jaredrummler/android/colorpicker/ColorPickerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, p2, v0}, Lcom/jaredrummler/android/colorpicker/ColorPickerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 4

    .line 3
    invoke-direct {p0, p1, p2, p3}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/16 p3, 0xff

    .line 4
    iput p3, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->q:I

    const/high16 p3, 0x43b40000    # 360.0f

    .line 5
    iput p3, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->r:F

    const/4 p3, 0x0

    .line 6
    iput p3, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->s:F

    .line 7
    iput p3, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->t:F

    const/4 p3, 0x0

    .line 8
    iput-boolean p3, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->u:Z

    const/4 v0, 0x0

    .line 9
    iput-object v0, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->v:Ljava/lang/String;

    const v1, -0x424243

    .line 10
    iput v1, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->w:I

    const v2, -0x919192

    .line 11
    iput v2, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->x:I

    .line 12
    iput-object v0, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->D:Landroid/graphics/Point;

    .line 13
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    sget-object v3, Lcom/jaredrummler/android/colorpicker/R$styleable;->ColorPickerView:[I

    invoke-virtual {v0, p2, v3}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p2

    .line 14
    sget v0, Lcom/jaredrummler/android/colorpicker/R$styleable;->ColorPickerView_cpv_alphaChannelVisible:I

    invoke-virtual {p2, v0, p3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v0

    iput-boolean v0, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->u:Z

    .line 15
    sget v0, Lcom/jaredrummler/android/colorpicker/R$styleable;->ColorPickerView_cpv_alphaChannelText:I

    invoke-virtual {p2, v0}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->v:Ljava/lang/String;

    .line 16
    sget v0, Lcom/jaredrummler/android/colorpicker/R$styleable;->ColorPickerView_cpv_sliderColor:I

    invoke-virtual {p2, v0, v1}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v0

    iput v0, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->w:I

    .line 17
    sget v0, Lcom/jaredrummler/android/colorpicker/R$styleable;->ColorPickerView_cpv_borderColor:I

    invoke-virtual {p2, v0, v2}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v0

    iput v0, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->x:I

    .line 18
    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    .line 19
    new-instance p2, Landroid/util/TypedValue;

    invoke-direct {p2}, Landroid/util/TypedValue;-><init>()V

    .line 20
    iget p2, p2, Landroid/util/TypedValue;->data:I

    const v0, 0x1010038

    filled-new-array {v0}, [I

    move-result-object v0

    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(I[I)Landroid/content/res/TypedArray;

    move-result-object p1

    .line 21
    iget p2, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->x:I

    if-ne p2, v2, :cond_0

    .line 22
    invoke-virtual {p1, p3, v2}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p2

    iput p2, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->x:I

    .line 23
    :cond_0
    iget p2, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->w:I

    if-ne p2, v1, :cond_1

    .line 24
    invoke-virtual {p1, p3, v1}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p2

    iput p2, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->w:I

    .line 25
    :cond_1
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 26
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    const/high16 p2, 0x41f00000    # 30.0f

    invoke-static {p1, p2}, Lv7/d;->h(Landroid/content/Context;F)I

    move-result p1

    iput p1, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->a:I

    .line 27
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    const/high16 p2, 0x41a00000    # 20.0f

    invoke-static {p1, p2}, Lv7/d;->h(Landroid/content/Context;F)I

    move-result p1

    iput p1, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->b:I

    .line 28
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    const/high16 p2, 0x41200000    # 10.0f

    invoke-static {p1, p2}, Lv7/d;->h(Landroid/content/Context;F)I

    move-result p1

    iput p1, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->c:I

    .line 29
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    const/high16 p2, 0x40a00000    # 5.0f

    invoke-static {p1, p2}, Lv7/d;->h(Landroid/content/Context;F)I

    move-result p1

    iput p1, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->d:I

    .line 30
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    const/high16 p2, 0x40800000    # 4.0f

    invoke-static {p1, p2}, Lv7/d;->h(Landroid/content/Context;F)I

    move-result p1

    iput p1, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->f:I

    .line 31
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    const/high16 p2, 0x40000000    # 2.0f

    invoke-static {p1, p2}, Lv7/d;->h(Landroid/content/Context;F)I

    move-result p1

    iput p1, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->e:I

    .line 32
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    sget p3, Lcom/jaredrummler/android/colorpicker/R$dimen;->cpv_required_padding:I

    invoke-virtual {p1, p3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result p1

    iput p1, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->y:I

    .line 33
    new-instance p1, Landroid/graphics/Paint;

    invoke-direct {p1}, Landroid/graphics/Paint;-><init>()V

    iput-object p1, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->g:Landroid/graphics/Paint;

    .line 34
    new-instance p1, Landroid/graphics/Paint;

    invoke-direct {p1}, Landroid/graphics/Paint;-><init>()V

    iput-object p1, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->h:Landroid/graphics/Paint;

    .line 35
    new-instance p1, Landroid/graphics/Paint;

    invoke-direct {p1}, Landroid/graphics/Paint;-><init>()V

    iput-object p1, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->k:Landroid/graphics/Paint;

    .line 36
    new-instance p1, Landroid/graphics/Paint;

    invoke-direct {p1}, Landroid/graphics/Paint;-><init>()V

    iput-object p1, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->i:Landroid/graphics/Paint;

    .line 37
    new-instance p1, Landroid/graphics/Paint;

    invoke-direct {p1}, Landroid/graphics/Paint;-><init>()V

    iput-object p1, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->j:Landroid/graphics/Paint;

    .line 38
    new-instance p1, Landroid/graphics/Paint;

    invoke-direct {p1}, Landroid/graphics/Paint;-><init>()V

    iput-object p1, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->l:Landroid/graphics/Paint;

    .line 39
    iget-object p1, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->h:Landroid/graphics/Paint;

    sget-object p3, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {p1, p3}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 40
    iget-object p1, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->h:Landroid/graphics/Paint;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p2}, Lv7/d;->h(Landroid/content/Context;F)I

    move-result v0

    int-to-float v0, v0

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 41
    iget-object p1, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->h:Landroid/graphics/Paint;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 42
    iget-object p1, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->k:Landroid/graphics/Paint;

    iget v1, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->w:I

    invoke-virtual {p1, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 43
    iget-object p1, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->k:Landroid/graphics/Paint;

    invoke-virtual {p1, p3}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 44
    iget-object p1, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->k:Landroid/graphics/Paint;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p3

    invoke-static {p3, p2}, Lv7/d;->h(Landroid/content/Context;F)I

    move-result p2

    int-to-float p2, p2

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 45
    iget-object p1, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->k:Landroid/graphics/Paint;

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 46
    iget-object p1, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->j:Landroid/graphics/Paint;

    const p2, -0xe3e3e4

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setColor(I)V

    .line 47
    iget-object p1, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->j:Landroid/graphics/Paint;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p2

    const/high16 p3, 0x41600000    # 14.0f

    invoke-static {p2, p3}, Lv7/d;->h(Landroid/content/Context;F)I

    move-result p2

    int-to-float p2, p2

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 48
    iget-object p1, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->j:Landroid/graphics/Paint;

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 49
    iget-object p1, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->j:Landroid/graphics/Paint;

    sget-object p2, Landroid/graphics/Paint$Align;->CENTER:Landroid/graphics/Paint$Align;

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    .line 50
    iget-object p1, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->j:Landroid/graphics/Paint;

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setFakeBoldText(Z)V

    .line 51
    invoke-virtual {p0, v0}, Landroid/view/View;->setFocusable(Z)V

    .line 52
    invoke-virtual {p0, v0}, Landroid/view/View;->setFocusableInTouchMode(Z)V

    return-void
.end method

.method private getPreferredHeight()I
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/high16 v1, 0x43480000    # 200.0f

    .line 6
    .line 7
    invoke-static {v0, v1}, Lv7/d;->h(Landroid/content/Context;F)I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    iget-boolean v1, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->u:Z

    .line 12
    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    iget v1, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->c:I

    .line 16
    .line 17
    iget v2, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->b:I

    .line 18
    .line 19
    add-int/2addr v1, v2

    .line 20
    add-int/2addr v1, v0

    .line 21
    return v1

    .line 22
    :cond_0
    return v0
.end method

.method private getPreferredWidth()I
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/high16 v1, 0x43480000    # 200.0f

    .line 6
    .line 7
    invoke-static {v0, v1}, Lv7/d;->h(Landroid/content/Context;F)I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    iget v1, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->a:I

    .line 12
    .line 13
    add-int/2addr v0, v1

    .line 14
    iget v1, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->c:I

    .line 15
    .line 16
    add-int/2addr v0, v1

    .line 17
    return v0
.end method


# virtual methods
.method public final a(Landroid/view/MotionEvent;)Z
    .locals 9

    .line 1
    iget-object v0, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->D:Landroid/graphics/Point;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    goto/16 :goto_4

    .line 7
    .line 8
    :cond_0
    iget v2, v0, Landroid/graphics/Point;->x:I

    .line 9
    .line 10
    iget v0, v0, Landroid/graphics/Point;->y:I

    .line 11
    .line 12
    iget-object v3, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->B:Landroid/graphics/Rect;

    .line 13
    .line 14
    invoke-virtual {v3, v2, v0}, Landroid/graphics/Rect;->contains(II)Z

    .line 15
    .line 16
    .line 17
    move-result v3

    .line 18
    const/4 v4, 0x0

    .line 19
    const/4 v5, 0x1

    .line 20
    if-eqz v3, :cond_3

    .line 21
    .line 22
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    iget-object v0, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->B:Landroid/graphics/Rect;

    .line 27
    .line 28
    invoke-virtual {v0}, Landroid/graphics/Rect;->height()I

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    int-to-float v1, v1

    .line 33
    iget v2, v0, Landroid/graphics/Rect;->top:I

    .line 34
    .line 35
    int-to-float v2, v2

    .line 36
    cmpg-float v3, p1, v2

    .line 37
    .line 38
    if-gez v3, :cond_1

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_1
    iget v0, v0, Landroid/graphics/Rect;->bottom:I

    .line 42
    .line 43
    int-to-float v0, v0

    .line 44
    cmpl-float v0, p1, v0

    .line 45
    .line 46
    if-lez v0, :cond_2

    .line 47
    .line 48
    move v4, v1

    .line 49
    goto :goto_0

    .line 50
    :cond_2
    sub-float v4, p1, v2

    .line 51
    .line 52
    :goto_0
    const/high16 p1, 0x43b40000    # 360.0f

    .line 53
    .line 54
    invoke-static {v4, p1, v1, p1}, Landroidx/compose/material3/c;->D(FFFF)F

    .line 55
    .line 56
    .line 57
    move-result p1

    .line 58
    iput p1, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->r:F

    .line 59
    .line 60
    return v5

    .line 61
    :cond_3
    iget-object v3, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->A:Landroid/graphics/Rect;

    .line 62
    .line 63
    invoke-virtual {v3, v2, v0}, Landroid/graphics/Rect;->contains(II)Z

    .line 64
    .line 65
    .line 66
    move-result v3

    .line 67
    if-eqz v3, :cond_8

    .line 68
    .line 69
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 70
    .line 71
    .line 72
    move-result v0

    .line 73
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 74
    .line 75
    .line 76
    move-result p1

    .line 77
    iget-object v2, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->A:Landroid/graphics/Rect;

    .line 78
    .line 79
    invoke-virtual {v2}, Landroid/graphics/Rect;->width()I

    .line 80
    .line 81
    .line 82
    move-result v3

    .line 83
    int-to-float v3, v3

    .line 84
    invoke-virtual {v2}, Landroid/graphics/Rect;->height()I

    .line 85
    .line 86
    .line 87
    move-result v6

    .line 88
    int-to-float v6, v6

    .line 89
    iget v7, v2, Landroid/graphics/Rect;->left:I

    .line 90
    .line 91
    int-to-float v7, v7

    .line 92
    cmpg-float v8, v0, v7

    .line 93
    .line 94
    if-gez v8, :cond_4

    .line 95
    .line 96
    move v0, v4

    .line 97
    goto :goto_1

    .line 98
    :cond_4
    iget v8, v2, Landroid/graphics/Rect;->right:I

    .line 99
    .line 100
    int-to-float v8, v8

    .line 101
    cmpl-float v8, v0, v8

    .line 102
    .line 103
    if-lez v8, :cond_5

    .line 104
    .line 105
    move v0, v3

    .line 106
    goto :goto_1

    .line 107
    :cond_5
    sub-float/2addr v0, v7

    .line 108
    :goto_1
    iget v7, v2, Landroid/graphics/Rect;->top:I

    .line 109
    .line 110
    int-to-float v7, v7

    .line 111
    cmpg-float v8, p1, v7

    .line 112
    .line 113
    if-gez v8, :cond_6

    .line 114
    .line 115
    goto :goto_2

    .line 116
    :cond_6
    iget v2, v2, Landroid/graphics/Rect;->bottom:I

    .line 117
    .line 118
    int-to-float v2, v2

    .line 119
    cmpl-float v2, p1, v2

    .line 120
    .line 121
    if-lez v2, :cond_7

    .line 122
    .line 123
    move v4, v6

    .line 124
    goto :goto_2

    .line 125
    :cond_7
    sub-float v4, p1, v7

    .line 126
    .line 127
    :goto_2
    const/high16 p1, 0x3f800000    # 1.0f

    .line 128
    .line 129
    div-float v2, p1, v3

    .line 130
    .line 131
    mul-float/2addr v2, v0

    .line 132
    div-float v0, p1, v6

    .line 133
    .line 134
    mul-float/2addr v0, v4

    .line 135
    sub-float/2addr p1, v0

    .line 136
    const/4 v0, 0x2

    .line 137
    new-array v0, v0, [F

    .line 138
    .line 139
    aput v2, v0, v1

    .line 140
    .line 141
    aput p1, v0, v5

    .line 142
    .line 143
    aget p1, v0, v1

    .line 144
    .line 145
    iput p1, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->s:F

    .line 146
    .line 147
    aget p1, v0, v5

    .line 148
    .line 149
    iput p1, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->t:F

    .line 150
    .line 151
    return v5

    .line 152
    :cond_8
    iget-object v3, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->C:Landroid/graphics/Rect;

    .line 153
    .line 154
    if-eqz v3, :cond_b

    .line 155
    .line 156
    invoke-virtual {v3, v2, v0}, Landroid/graphics/Rect;->contains(II)Z

    .line 157
    .line 158
    .line 159
    move-result v0

    .line 160
    if-eqz v0, :cond_b

    .line 161
    .line 162
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 163
    .line 164
    .line 165
    move-result p1

    .line 166
    float-to-int p1, p1

    .line 167
    iget-object v0, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->C:Landroid/graphics/Rect;

    .line 168
    .line 169
    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    .line 170
    .line 171
    .line 172
    move-result v2

    .line 173
    iget v3, v0, Landroid/graphics/Rect;->left:I

    .line 174
    .line 175
    if-ge p1, v3, :cond_9

    .line 176
    .line 177
    goto :goto_3

    .line 178
    :cond_9
    iget v0, v0, Landroid/graphics/Rect;->right:I

    .line 179
    .line 180
    if-le p1, v0, :cond_a

    .line 181
    .line 182
    move v1, v2

    .line 183
    goto :goto_3

    .line 184
    :cond_a
    sub-int v1, p1, v3

    .line 185
    .line 186
    :goto_3
    mul-int/lit16 v1, v1, 0xff

    .line 187
    .line 188
    div-int/2addr v1, v2

    .line 189
    rsub-int p1, v1, 0xff

    .line 190
    .line 191
    iput p1, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->q:I

    .line 192
    .line 193
    return v5

    .line 194
    :cond_b
    :goto_4
    return v1
.end method

.method public final b(IZ)V
    .locals 7

    .line 1
    invoke-static {p1}, Landroid/graphics/Color;->alpha(I)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {p1}, Landroid/graphics/Color;->red(I)I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-static {p1}, Landroid/graphics/Color;->blue(I)I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    invoke-static {p1}, Landroid/graphics/Color;->green(I)I

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    const/4 v3, 0x3

    .line 18
    new-array v4, v3, [F

    .line 19
    .line 20
    invoke-static {v1, p1, v2, v4}, Landroid/graphics/Color;->RGBToHSV(III[F)V

    .line 21
    .line 22
    .line 23
    iput v0, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->q:I

    .line 24
    .line 25
    const/4 p1, 0x0

    .line 26
    aget v1, v4, p1

    .line 27
    .line 28
    iput v1, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->r:F

    .line 29
    .line 30
    const/4 v2, 0x1

    .line 31
    aget v5, v4, v2

    .line 32
    .line 33
    iput v5, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->s:F

    .line 34
    .line 35
    const/4 v6, 0x2

    .line 36
    aget v4, v4, v6

    .line 37
    .line 38
    iput v4, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->t:F

    .line 39
    .line 40
    if-eqz p2, :cond_0

    .line 41
    .line 42
    iget-object p2, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->F:Lm1/m;

    .line 43
    .line 44
    if-eqz p2, :cond_0

    .line 45
    .line 46
    new-array v3, v3, [F

    .line 47
    .line 48
    aput v1, v3, p1

    .line 49
    .line 50
    aput v5, v3, v2

    .line 51
    .line 52
    aput v4, v3, v6

    .line 53
    .line 54
    invoke-static {v0, v3}, Landroid/graphics/Color;->HSVToColor(I[F)I

    .line 55
    .line 56
    .line 57
    move-result p1

    .line 58
    check-cast p2, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;

    .line 59
    .line 60
    invoke-virtual {p2, p1}, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;->j(I)V

    .line 61
    .line 62
    .line 63
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 64
    .line 65
    .line 66
    return-void
.end method

.method public getAlphaSliderText()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->v:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public getBorderColor()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->x:I

    .line 2
    .line 3
    return v0
.end method

.method public getColor()I
    .locals 6

    .line 1
    iget v0, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->q:I

    .line 2
    .line 3
    iget v1, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->r:F

    .line 4
    .line 5
    iget v2, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->s:F

    .line 6
    .line 7
    iget v3, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->t:F

    .line 8
    .line 9
    const/4 v4, 0x3

    .line 10
    new-array v4, v4, [F

    .line 11
    .line 12
    const/4 v5, 0x0

    .line 13
    aput v1, v4, v5

    .line 14
    .line 15
    const/4 v1, 0x1

    .line 16
    aput v2, v4, v1

    .line 17
    .line 18
    const/4 v1, 0x2

    .line 19
    aput v3, v4, v1

    .line 20
    .line 21
    invoke-static {v0, v4}, Landroid/graphics/Color;->HSVToColor(I[F)I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    return v0
.end method

.method public getPaddingBottom()I
    .locals 2

    .line 1
    invoke-super {p0}, Landroid/view/View;->getPaddingBottom()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget v1, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->y:I

    .line 6
    .line 7
    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    return v0
.end method

.method public getPaddingLeft()I
    .locals 2

    .line 1
    invoke-super {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget v1, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->y:I

    .line 6
    .line 7
    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    return v0
.end method

.method public getPaddingRight()I
    .locals 2

    .line 1
    invoke-super {p0}, Landroid/view/View;->getPaddingRight()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget v1, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->y:I

    .line 6
    .line 7
    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    return v0
.end method

.method public getPaddingTop()I
    .locals 2

    .line 1
    invoke-super {p0}, Landroid/view/View;->getPaddingTop()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget v1, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->y:I

    .line 6
    .line 7
    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    return v0
.end method

.method public getSliderTrackerColor()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->w:I

    .line 2
    .line 3
    return v0
.end method

.method public final onDraw(Landroid/graphics/Canvas;)V
    .locals 30

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->z:Landroid/graphics/Rect;

    .line 4
    .line 5
    invoke-virtual {v1}, Landroid/graphics/Rect;->width()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-lez v1, :cond_b

    .line 10
    .line 11
    iget-object v1, v0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->z:Landroid/graphics/Rect;

    .line 12
    .line 13
    invoke-virtual {v1}, Landroid/graphics/Rect;->height()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-gtz v1, :cond_0

    .line 18
    .line 19
    goto/16 :goto_2

    .line 20
    .line 21
    :cond_0
    iget-object v7, v0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->A:Landroid/graphics/Rect;

    .line 22
    .line 23
    iget v1, v0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->x:I

    .line 24
    .line 25
    iget-object v8, v0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->l:Landroid/graphics/Paint;

    .line 26
    .line 27
    invoke-virtual {v8, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 28
    .line 29
    .line 30
    iget-object v1, v0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->z:Landroid/graphics/Rect;

    .line 31
    .line 32
    iget v2, v1, Landroid/graphics/Rect;->left:I

    .line 33
    .line 34
    int-to-float v2, v2

    .line 35
    iget v1, v1, Landroid/graphics/Rect;->top:I

    .line 36
    .line 37
    int-to-float v3, v1

    .line 38
    iget v1, v7, Landroid/graphics/Rect;->right:I

    .line 39
    .line 40
    const/4 v9, 0x1

    .line 41
    add-int/2addr v1, v9

    .line 42
    int-to-float v4, v1

    .line 43
    iget v1, v7, Landroid/graphics/Rect;->bottom:I

    .line 44
    .line 45
    add-int/2addr v1, v9

    .line 46
    int-to-float v5, v1

    .line 47
    iget-object v6, v0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->l:Landroid/graphics/Paint;

    .line 48
    .line 49
    move-object/from16 v1, p1

    .line 50
    .line 51
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 52
    .line 53
    .line 54
    iget-object v2, v0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->m:Landroid/graphics/LinearGradient;

    .line 55
    .line 56
    if-nez v2, :cond_1

    .line 57
    .line 58
    new-instance v10, Landroid/graphics/LinearGradient;

    .line 59
    .line 60
    iget v2, v7, Landroid/graphics/Rect;->left:I

    .line 61
    .line 62
    int-to-float v11, v2

    .line 63
    iget v2, v7, Landroid/graphics/Rect;->top:I

    .line 64
    .line 65
    int-to-float v12, v2

    .line 66
    iget v2, v7, Landroid/graphics/Rect;->bottom:I

    .line 67
    .line 68
    int-to-float v14, v2

    .line 69
    const/high16 v16, -0x1000000

    .line 70
    .line 71
    sget-object v17, Landroid/graphics/Shader$TileMode;->CLAMP:Landroid/graphics/Shader$TileMode;

    .line 72
    .line 73
    const/4 v15, -0x1

    .line 74
    move v13, v11

    .line 75
    invoke-direct/range {v10 .. v17}, Landroid/graphics/LinearGradient;-><init>(FFFFIILandroid/graphics/Shader$TileMode;)V

    .line 76
    .line 77
    .line 78
    iput-object v10, v0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->m:Landroid/graphics/LinearGradient;

    .line 79
    .line 80
    :cond_1
    iget-object v2, v0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->o:Lm1/l;

    .line 81
    .line 82
    const/4 v10, 0x3

    .line 83
    const/4 v11, 0x0

    .line 84
    const/4 v12, 0x2

    .line 85
    const/high16 v13, 0x3f800000    # 1.0f

    .line 86
    .line 87
    if-eqz v2, :cond_2

    .line 88
    .line 89
    iget v3, v2, Lm1/l;->c:F

    .line 90
    .line 91
    iget v4, v0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->r:F

    .line 92
    .line 93
    cmpl-float v3, v3, v4

    .line 94
    .line 95
    if-eqz v3, :cond_6

    .line 96
    .line 97
    :cond_2
    if-nez v2, :cond_3

    .line 98
    .line 99
    new-instance v2, Lm1/l;

    .line 100
    .line 101
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 102
    .line 103
    .line 104
    iput-object v2, v0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->o:Lm1/l;

    .line 105
    .line 106
    :cond_3
    iget-object v2, v0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->o:Lm1/l;

    .line 107
    .line 108
    iget-object v3, v2, Lm1/l;->b:Landroid/graphics/Bitmap;

    .line 109
    .line 110
    if-nez v3, :cond_4

    .line 111
    .line 112
    invoke-virtual {v7}, Landroid/graphics/Rect;->width()I

    .line 113
    .line 114
    .line 115
    move-result v3

    .line 116
    invoke-virtual {v7}, Landroid/graphics/Rect;->height()I

    .line 117
    .line 118
    .line 119
    move-result v4

    .line 120
    sget-object v5, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 121
    .line 122
    invoke-static {v3, v4, v5}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 123
    .line 124
    .line 125
    move-result-object v3

    .line 126
    iput-object v3, v2, Lm1/l;->b:Landroid/graphics/Bitmap;

    .line 127
    .line 128
    :cond_4
    iget-object v2, v0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->o:Lm1/l;

    .line 129
    .line 130
    iget-object v3, v2, Lm1/l;->a:Landroid/graphics/Canvas;

    .line 131
    .line 132
    if-nez v3, :cond_5

    .line 133
    .line 134
    new-instance v3, Landroid/graphics/Canvas;

    .line 135
    .line 136
    iget-object v4, v0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->o:Lm1/l;

    .line 137
    .line 138
    iget-object v4, v4, Lm1/l;->b:Landroid/graphics/Bitmap;

    .line 139
    .line 140
    invoke-direct {v3, v4}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 141
    .line 142
    .line 143
    iput-object v3, v2, Lm1/l;->a:Landroid/graphics/Canvas;

    .line 144
    .line 145
    :cond_5
    iget v2, v0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->r:F

    .line 146
    .line 147
    new-array v3, v10, [F

    .line 148
    .line 149
    aput v2, v3, v11

    .line 150
    .line 151
    aput v13, v3, v9

    .line 152
    .line 153
    aput v13, v3, v12

    .line 154
    .line 155
    invoke-static {v3}, Landroid/graphics/Color;->HSVToColor([F)I

    .line 156
    .line 157
    .line 158
    move-result v20

    .line 159
    new-instance v14, Landroid/graphics/LinearGradient;

    .line 160
    .line 161
    iget v2, v7, Landroid/graphics/Rect;->left:I

    .line 162
    .line 163
    int-to-float v15, v2

    .line 164
    iget v2, v7, Landroid/graphics/Rect;->top:I

    .line 165
    .line 166
    int-to-float v2, v2

    .line 167
    iget v3, v7, Landroid/graphics/Rect;->right:I

    .line 168
    .line 169
    int-to-float v3, v3

    .line 170
    const/16 v19, -0x1

    .line 171
    .line 172
    sget-object v21, Landroid/graphics/Shader$TileMode;->CLAMP:Landroid/graphics/Shader$TileMode;

    .line 173
    .line 174
    move/from16 v18, v2

    .line 175
    .line 176
    move/from16 v16, v2

    .line 177
    .line 178
    move/from16 v17, v3

    .line 179
    .line 180
    invoke-direct/range {v14 .. v21}, Landroid/graphics/LinearGradient;-><init>(FFFFIILandroid/graphics/Shader$TileMode;)V

    .line 181
    .line 182
    .line 183
    iput-object v14, v0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->n:Landroid/graphics/LinearGradient;

    .line 184
    .line 185
    new-instance v2, Landroid/graphics/ComposeShader;

    .line 186
    .line 187
    iget-object v3, v0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->m:Landroid/graphics/LinearGradient;

    .line 188
    .line 189
    iget-object v4, v0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->n:Landroid/graphics/LinearGradient;

    .line 190
    .line 191
    sget-object v5, Landroid/graphics/PorterDuff$Mode;->MULTIPLY:Landroid/graphics/PorterDuff$Mode;

    .line 192
    .line 193
    invoke-direct {v2, v3, v4, v5}, Landroid/graphics/ComposeShader;-><init>(Landroid/graphics/Shader;Landroid/graphics/Shader;Landroid/graphics/PorterDuff$Mode;)V

    .line 194
    .line 195
    .line 196
    iget-object v3, v0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->g:Landroid/graphics/Paint;

    .line 197
    .line 198
    invoke-virtual {v3, v2}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 199
    .line 200
    .line 201
    iget-object v2, v0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->o:Lm1/l;

    .line 202
    .line 203
    iget-object v14, v2, Lm1/l;->a:Landroid/graphics/Canvas;

    .line 204
    .line 205
    iget-object v2, v2, Lm1/l;->b:Landroid/graphics/Bitmap;

    .line 206
    .line 207
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I

    .line 208
    .line 209
    .line 210
    move-result v2

    .line 211
    int-to-float v2, v2

    .line 212
    iget-object v3, v0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->o:Lm1/l;

    .line 213
    .line 214
    iget-object v3, v3, Lm1/l;->b:Landroid/graphics/Bitmap;

    .line 215
    .line 216
    invoke-virtual {v3}, Landroid/graphics/Bitmap;->getHeight()I

    .line 217
    .line 218
    .line 219
    move-result v3

    .line 220
    int-to-float v3, v3

    .line 221
    iget-object v4, v0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->g:Landroid/graphics/Paint;

    .line 222
    .line 223
    const/4 v15, 0x0

    .line 224
    const/16 v16, 0x0

    .line 225
    .line 226
    move/from16 v17, v2

    .line 227
    .line 228
    move/from16 v18, v3

    .line 229
    .line 230
    move-object/from16 v19, v4

    .line 231
    .line 232
    invoke-virtual/range {v14 .. v19}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 233
    .line 234
    .line 235
    iget-object v2, v0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->o:Lm1/l;

    .line 236
    .line 237
    iget v3, v0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->r:F

    .line 238
    .line 239
    iput v3, v2, Lm1/l;->c:F

    .line 240
    .line 241
    :cond_6
    iget-object v2, v0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->o:Lm1/l;

    .line 242
    .line 243
    iget-object v2, v2, Lm1/l;->b:Landroid/graphics/Bitmap;

    .line 244
    .line 245
    const/4 v14, 0x0

    .line 246
    invoke-virtual {v1, v2, v14, v7, v14}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    .line 247
    .line 248
    .line 249
    iget v2, v0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->s:F

    .line 250
    .line 251
    iget v3, v0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->t:F

    .line 252
    .line 253
    iget-object v4, v0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->A:Landroid/graphics/Rect;

    .line 254
    .line 255
    invoke-virtual {v4}, Landroid/graphics/Rect;->height()I

    .line 256
    .line 257
    .line 258
    move-result v5

    .line 259
    int-to-float v5, v5

    .line 260
    invoke-virtual {v4}, Landroid/graphics/Rect;->width()I

    .line 261
    .line 262
    .line 263
    move-result v6

    .line 264
    int-to-float v6, v6

    .line 265
    new-instance v7, Landroid/graphics/Point;

    .line 266
    .line 267
    invoke-direct {v7}, Landroid/graphics/Point;-><init>()V

    .line 268
    .line 269
    .line 270
    mul-float/2addr v2, v6

    .line 271
    iget v6, v4, Landroid/graphics/Rect;->left:I

    .line 272
    .line 273
    int-to-float v6, v6

    .line 274
    add-float/2addr v2, v6

    .line 275
    float-to-int v2, v2

    .line 276
    iput v2, v7, Landroid/graphics/Point;->x:I

    .line 277
    .line 278
    sub-float v2, v13, v3

    .line 279
    .line 280
    mul-float/2addr v2, v5

    .line 281
    iget v3, v4, Landroid/graphics/Rect;->top:I

    .line 282
    .line 283
    int-to-float v3, v3

    .line 284
    add-float/2addr v2, v3

    .line 285
    float-to-int v2, v2

    .line 286
    iput v2, v7, Landroid/graphics/Point;->y:I

    .line 287
    .line 288
    const/high16 v2, -0x1000000

    .line 289
    .line 290
    iget-object v3, v0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->h:Landroid/graphics/Paint;

    .line 291
    .line 292
    invoke-virtual {v3, v2}, Landroid/graphics/Paint;->setColor(I)V

    .line 293
    .line 294
    .line 295
    iget v2, v7, Landroid/graphics/Point;->x:I

    .line 296
    .line 297
    int-to-float v2, v2

    .line 298
    iget v4, v7, Landroid/graphics/Point;->y:I

    .line 299
    .line 300
    int-to-float v4, v4

    .line 301
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 302
    .line 303
    .line 304
    move-result-object v5

    .line 305
    invoke-static {v5, v13}, Lv7/d;->h(Landroid/content/Context;F)I

    .line 306
    .line 307
    .line 308
    move-result v5

    .line 309
    iget v6, v0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->d:I

    .line 310
    .line 311
    sub-int v5, v6, v5

    .line 312
    .line 313
    int-to-float v5, v5

    .line 314
    invoke-virtual {v1, v2, v4, v5, v3}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 315
    .line 316
    .line 317
    const v2, -0x222223

    .line 318
    .line 319
    .line 320
    invoke-virtual {v3, v2}, Landroid/graphics/Paint;->setColor(I)V

    .line 321
    .line 322
    .line 323
    iget v2, v7, Landroid/graphics/Point;->x:I

    .line 324
    .line 325
    int-to-float v2, v2

    .line 326
    iget v4, v7, Landroid/graphics/Point;->y:I

    .line 327
    .line 328
    int-to-float v4, v4

    .line 329
    int-to-float v5, v6

    .line 330
    invoke-virtual {v1, v2, v4, v5, v3}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 331
    .line 332
    .line 333
    iget-object v7, v0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->B:Landroid/graphics/Rect;

    .line 334
    .line 335
    iget v2, v0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->x:I

    .line 336
    .line 337
    invoke-virtual {v8, v2}, Landroid/graphics/Paint;->setColor(I)V

    .line 338
    .line 339
    .line 340
    iget v2, v7, Landroid/graphics/Rect;->left:I

    .line 341
    .line 342
    sub-int/2addr v2, v9

    .line 343
    int-to-float v2, v2

    .line 344
    iget v3, v7, Landroid/graphics/Rect;->top:I

    .line 345
    .line 346
    sub-int/2addr v3, v9

    .line 347
    int-to-float v3, v3

    .line 348
    iget v4, v7, Landroid/graphics/Rect;->right:I

    .line 349
    .line 350
    add-int/2addr v4, v9

    .line 351
    int-to-float v4, v4

    .line 352
    iget v5, v7, Landroid/graphics/Rect;->bottom:I

    .line 353
    .line 354
    add-int/2addr v5, v9

    .line 355
    int-to-float v5, v5

    .line 356
    iget-object v6, v0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->l:Landroid/graphics/Paint;

    .line 357
    .line 358
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 359
    .line 360
    .line 361
    iget-object v2, v0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->p:Lm1/l;

    .line 362
    .line 363
    const/high16 v3, 0x43b40000    # 360.0f

    .line 364
    .line 365
    if-nez v2, :cond_8

    .line 366
    .line 367
    new-instance v2, Lm1/l;

    .line 368
    .line 369
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 370
    .line 371
    .line 372
    iput-object v2, v0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->p:Lm1/l;

    .line 373
    .line 374
    invoke-virtual {v7}, Landroid/graphics/Rect;->width()I

    .line 375
    .line 376
    .line 377
    move-result v4

    .line 378
    invoke-virtual {v7}, Landroid/graphics/Rect;->height()I

    .line 379
    .line 380
    .line 381
    move-result v5

    .line 382
    sget-object v6, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    .line 383
    .line 384
    invoke-static {v4, v5, v6}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 385
    .line 386
    .line 387
    move-result-object v4

    .line 388
    iput-object v4, v2, Lm1/l;->b:Landroid/graphics/Bitmap;

    .line 389
    .line 390
    iget-object v2, v0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->p:Lm1/l;

    .line 391
    .line 392
    new-instance v4, Landroid/graphics/Canvas;

    .line 393
    .line 394
    iget-object v5, v0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->p:Lm1/l;

    .line 395
    .line 396
    iget-object v5, v5, Lm1/l;->b:Landroid/graphics/Bitmap;

    .line 397
    .line 398
    invoke-direct {v4, v5}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 399
    .line 400
    .line 401
    iput-object v4, v2, Lm1/l;->a:Landroid/graphics/Canvas;

    .line 402
    .line 403
    invoke-virtual {v7}, Landroid/graphics/Rect;->height()I

    .line 404
    .line 405
    .line 406
    move-result v2

    .line 407
    int-to-float v2, v2

    .line 408
    const/high16 v4, 0x3f000000    # 0.5f

    .line 409
    .line 410
    add-float/2addr v2, v4

    .line 411
    float-to-int v2, v2

    .line 412
    new-array v4, v2, [I

    .line 413
    .line 414
    move v6, v3

    .line 415
    move v5, v11

    .line 416
    :goto_0
    if-ge v5, v2, :cond_7

    .line 417
    .line 418
    new-array v15, v10, [F

    .line 419
    .line 420
    aput v6, v15, v11

    .line 421
    .line 422
    aput v13, v15, v9

    .line 423
    .line 424
    aput v13, v15, v12

    .line 425
    .line 426
    invoke-static {v15}, Landroid/graphics/Color;->HSVToColor([F)I

    .line 427
    .line 428
    .line 429
    move-result v15

    .line 430
    aput v15, v4, v5

    .line 431
    .line 432
    int-to-float v15, v2

    .line 433
    div-float v15, v3, v15

    .line 434
    .line 435
    sub-float/2addr v6, v15

    .line 436
    add-int/lit8 v5, v5, 0x1

    .line 437
    .line 438
    goto :goto_0

    .line 439
    :cond_7
    new-instance v5, Landroid/graphics/Paint;

    .line 440
    .line 441
    invoke-direct {v5}, Landroid/graphics/Paint;-><init>()V

    .line 442
    .line 443
    .line 444
    const/4 v6, 0x0

    .line 445
    invoke-virtual {v5, v6}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 446
    .line 447
    .line 448
    move v6, v11

    .line 449
    :goto_1
    if-ge v6, v2, :cond_8

    .line 450
    .line 451
    aget v13, v4, v6

    .line 452
    .line 453
    invoke-virtual {v5, v13}, Landroid/graphics/Paint;->setColor(I)V

    .line 454
    .line 455
    .line 456
    iget-object v13, v0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->p:Lm1/l;

    .line 457
    .line 458
    iget-object v15, v13, Lm1/l;->a:Landroid/graphics/Canvas;

    .line 459
    .line 460
    move/from16 v21, v9

    .line 461
    .line 462
    int-to-float v9, v6

    .line 463
    iget-object v13, v13, Lm1/l;->b:Landroid/graphics/Bitmap;

    .line 464
    .line 465
    invoke-virtual {v13}, Landroid/graphics/Bitmap;->getWidth()I

    .line 466
    .line 467
    .line 468
    move-result v13

    .line 469
    int-to-float v13, v13

    .line 470
    const/16 v16, 0x0

    .line 471
    .line 472
    move/from16 v19, v9

    .line 473
    .line 474
    move-object/from16 v20, v5

    .line 475
    .line 476
    move/from16 v17, v9

    .line 477
    .line 478
    move/from16 v18, v13

    .line 479
    .line 480
    invoke-virtual/range {v15 .. v20}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 481
    .line 482
    .line 483
    add-int/lit8 v6, v6, 0x1

    .line 484
    .line 485
    move/from16 v9, v21

    .line 486
    .line 487
    goto :goto_1

    .line 488
    :cond_8
    move/from16 v21, v9

    .line 489
    .line 490
    iget-object v2, v0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->p:Lm1/l;

    .line 491
    .line 492
    iget-object v2, v2, Lm1/l;->b:Landroid/graphics/Bitmap;

    .line 493
    .line 494
    invoke-virtual {v1, v2, v14, v7, v14}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    .line 495
    .line 496
    .line 497
    iget v2, v0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->r:F

    .line 498
    .line 499
    iget-object v4, v0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->B:Landroid/graphics/Rect;

    .line 500
    .line 501
    invoke-virtual {v4}, Landroid/graphics/Rect;->height()I

    .line 502
    .line 503
    .line 504
    move-result v5

    .line 505
    int-to-float v5, v5

    .line 506
    new-instance v6, Landroid/graphics/Point;

    .line 507
    .line 508
    invoke-direct {v6}, Landroid/graphics/Point;-><init>()V

    .line 509
    .line 510
    .line 511
    invoke-static {v2, v5, v3, v5}, Landroidx/compose/material3/c;->D(FFFF)F

    .line 512
    .line 513
    .line 514
    move-result v2

    .line 515
    iget v3, v4, Landroid/graphics/Rect;->top:I

    .line 516
    .line 517
    int-to-float v3, v3

    .line 518
    add-float/2addr v2, v3

    .line 519
    float-to-int v2, v2

    .line 520
    iput v2, v6, Landroid/graphics/Point;->y:I

    .line 521
    .line 522
    iget v2, v4, Landroid/graphics/Rect;->left:I

    .line 523
    .line 524
    iput v2, v6, Landroid/graphics/Point;->x:I

    .line 525
    .line 526
    new-instance v2, Landroid/graphics/RectF;

    .line 527
    .line 528
    invoke-direct {v2}, Landroid/graphics/RectF;-><init>()V

    .line 529
    .line 530
    .line 531
    iget v3, v7, Landroid/graphics/Rect;->left:I

    .line 532
    .line 533
    iget v9, v0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->e:I

    .line 534
    .line 535
    sub-int/2addr v3, v9

    .line 536
    int-to-float v3, v3

    .line 537
    iput v3, v2, Landroid/graphics/RectF;->left:F

    .line 538
    .line 539
    iget v3, v7, Landroid/graphics/Rect;->right:I

    .line 540
    .line 541
    add-int/2addr v3, v9

    .line 542
    int-to-float v3, v3

    .line 543
    iput v3, v2, Landroid/graphics/RectF;->right:F

    .line 544
    .line 545
    iget v3, v6, Landroid/graphics/Point;->y:I

    .line 546
    .line 547
    iget v7, v0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->f:I

    .line 548
    .line 549
    div-int/lit8 v4, v7, 0x2

    .line 550
    .line 551
    sub-int v5, v3, v4

    .line 552
    .line 553
    int-to-float v5, v5

    .line 554
    iput v5, v2, Landroid/graphics/RectF;->top:F

    .line 555
    .line 556
    add-int/2addr v4, v3

    .line 557
    int-to-float v3, v4

    .line 558
    iput v3, v2, Landroid/graphics/RectF;->bottom:F

    .line 559
    .line 560
    const/high16 v13, 0x40000000    # 2.0f

    .line 561
    .line 562
    iget-object v14, v0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->k:Landroid/graphics/Paint;

    .line 563
    .line 564
    invoke-virtual {v1, v2, v13, v13, v14}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    .line 565
    .line 566
    .line 567
    iget-boolean v2, v0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->u:Z

    .line 568
    .line 569
    if-eqz v2, :cond_b

    .line 570
    .line 571
    iget-object v15, v0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->C:Landroid/graphics/Rect;

    .line 572
    .line 573
    if-eqz v15, :cond_b

    .line 574
    .line 575
    iget-object v2, v0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->E:Lm1/a;

    .line 576
    .line 577
    if-nez v2, :cond_9

    .line 578
    .line 579
    goto/16 :goto_2

    .line 580
    .line 581
    :cond_9
    iget v2, v0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->x:I

    .line 582
    .line 583
    invoke-virtual {v8, v2}, Landroid/graphics/Paint;->setColor(I)V

    .line 584
    .line 585
    .line 586
    iget v2, v15, Landroid/graphics/Rect;->left:I

    .line 587
    .line 588
    add-int/lit8 v2, v2, -0x1

    .line 589
    .line 590
    int-to-float v2, v2

    .line 591
    iget v3, v15, Landroid/graphics/Rect;->top:I

    .line 592
    .line 593
    add-int/lit8 v3, v3, -0x1

    .line 594
    .line 595
    int-to-float v3, v3

    .line 596
    iget v4, v15, Landroid/graphics/Rect;->right:I

    .line 597
    .line 598
    add-int/lit8 v4, v4, 0x1

    .line 599
    .line 600
    int-to-float v4, v4

    .line 601
    iget v5, v15, Landroid/graphics/Rect;->bottom:I

    .line 602
    .line 603
    add-int/lit8 v5, v5, 0x1

    .line 604
    .line 605
    int-to-float v5, v5

    .line 606
    iget-object v6, v0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->l:Landroid/graphics/Paint;

    .line 607
    .line 608
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 609
    .line 610
    .line 611
    iget-object v2, v0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->E:Lm1/a;

    .line 612
    .line 613
    invoke-virtual {v2, v1}, Lm1/a;->draw(Landroid/graphics/Canvas;)V

    .line 614
    .line 615
    .line 616
    iget v2, v0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->r:F

    .line 617
    .line 618
    iget v3, v0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->s:F

    .line 619
    .line 620
    iget v4, v0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->t:F

    .line 621
    .line 622
    new-array v5, v10, [F

    .line 623
    .line 624
    aput v2, v5, v11

    .line 625
    .line 626
    aput v3, v5, v21

    .line 627
    .line 628
    aput v4, v5, v12

    .line 629
    .line 630
    invoke-static {v5}, Landroid/graphics/Color;->HSVToColor([F)I

    .line 631
    .line 632
    .line 633
    move-result v27

    .line 634
    invoke-static {v11, v5}, Landroid/graphics/Color;->HSVToColor(I[F)I

    .line 635
    .line 636
    .line 637
    move-result v28

    .line 638
    new-instance v22, Landroid/graphics/LinearGradient;

    .line 639
    .line 640
    iget v2, v15, Landroid/graphics/Rect;->left:I

    .line 641
    .line 642
    int-to-float v2, v2

    .line 643
    iget v3, v15, Landroid/graphics/Rect;->top:I

    .line 644
    .line 645
    int-to-float v3, v3

    .line 646
    iget v4, v15, Landroid/graphics/Rect;->right:I

    .line 647
    .line 648
    int-to-float v4, v4

    .line 649
    sget-object v29, Landroid/graphics/Shader$TileMode;->CLAMP:Landroid/graphics/Shader$TileMode;

    .line 650
    .line 651
    move/from16 v26, v3

    .line 652
    .line 653
    move/from16 v23, v2

    .line 654
    .line 655
    move/from16 v24, v3

    .line 656
    .line 657
    move/from16 v25, v4

    .line 658
    .line 659
    invoke-direct/range {v22 .. v29}, Landroid/graphics/LinearGradient;-><init>(FFFFIILandroid/graphics/Shader$TileMode;)V

    .line 660
    .line 661
    .line 662
    move-object/from16 v2, v22

    .line 663
    .line 664
    iget-object v3, v0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->i:Landroid/graphics/Paint;

    .line 665
    .line 666
    invoke-virtual {v3, v2}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 667
    .line 668
    .line 669
    invoke-virtual {v1, v15, v3}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    .line 670
    .line 671
    .line 672
    iget-object v2, v0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->v:Ljava/lang/String;

    .line 673
    .line 674
    if-eqz v2, :cond_a

    .line 675
    .line 676
    const-string v3, ""

    .line 677
    .line 678
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 679
    .line 680
    .line 681
    move-result v2

    .line 682
    if-nez v2, :cond_a

    .line 683
    .line 684
    iget-object v2, v0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->v:Ljava/lang/String;

    .line 685
    .line 686
    invoke-virtual {v15}, Landroid/graphics/Rect;->centerX()I

    .line 687
    .line 688
    .line 689
    move-result v3

    .line 690
    int-to-float v3, v3

    .line 691
    invoke-virtual {v15}, Landroid/graphics/Rect;->centerY()I

    .line 692
    .line 693
    .line 694
    move-result v4

    .line 695
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 696
    .line 697
    .line 698
    move-result-object v5

    .line 699
    const/high16 v6, 0x40800000    # 4.0f

    .line 700
    .line 701
    invoke-static {v5, v6}, Lv7/d;->h(Landroid/content/Context;F)I

    .line 702
    .line 703
    .line 704
    move-result v5

    .line 705
    add-int/2addr v5, v4

    .line 706
    int-to-float v4, v5

    .line 707
    iget-object v5, v0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->j:Landroid/graphics/Paint;

    .line 708
    .line 709
    invoke-virtual {v1, v2, v3, v4, v5}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 710
    .line 711
    .line 712
    :cond_a
    iget v2, v0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->q:I

    .line 713
    .line 714
    iget-object v3, v0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->C:Landroid/graphics/Rect;

    .line 715
    .line 716
    invoke-virtual {v3}, Landroid/graphics/Rect;->width()I

    .line 717
    .line 718
    .line 719
    move-result v4

    .line 720
    int-to-float v4, v4

    .line 721
    new-instance v5, Landroid/graphics/Point;

    .line 722
    .line 723
    invoke-direct {v5}, Landroid/graphics/Point;-><init>()V

    .line 724
    .line 725
    .line 726
    int-to-float v2, v2

    .line 727
    const/high16 v6, 0x437f0000    # 255.0f

    .line 728
    .line 729
    invoke-static {v2, v4, v6, v4}, Landroidx/compose/material3/c;->D(FFFF)F

    .line 730
    .line 731
    .line 732
    move-result v2

    .line 733
    iget v4, v3, Landroid/graphics/Rect;->left:I

    .line 734
    .line 735
    int-to-float v4, v4

    .line 736
    add-float/2addr v2, v4

    .line 737
    float-to-int v2, v2

    .line 738
    iput v2, v5, Landroid/graphics/Point;->x:I

    .line 739
    .line 740
    iget v2, v3, Landroid/graphics/Rect;->top:I

    .line 741
    .line 742
    iput v2, v5, Landroid/graphics/Point;->y:I

    .line 743
    .line 744
    new-instance v2, Landroid/graphics/RectF;

    .line 745
    .line 746
    invoke-direct {v2}, Landroid/graphics/RectF;-><init>()V

    .line 747
    .line 748
    .line 749
    iget v3, v5, Landroid/graphics/Point;->x:I

    .line 750
    .line 751
    div-int/2addr v7, v12

    .line 752
    sub-int v4, v3, v7

    .line 753
    .line 754
    int-to-float v4, v4

    .line 755
    iput v4, v2, Landroid/graphics/RectF;->left:F

    .line 756
    .line 757
    add-int/2addr v7, v3

    .line 758
    int-to-float v3, v7

    .line 759
    iput v3, v2, Landroid/graphics/RectF;->right:F

    .line 760
    .line 761
    iget v3, v15, Landroid/graphics/Rect;->top:I

    .line 762
    .line 763
    sub-int/2addr v3, v9

    .line 764
    int-to-float v3, v3

    .line 765
    iput v3, v2, Landroid/graphics/RectF;->top:F

    .line 766
    .line 767
    iget v3, v15, Landroid/graphics/Rect;->bottom:I

    .line 768
    .line 769
    add-int/2addr v3, v9

    .line 770
    int-to-float v3, v3

    .line 771
    iput v3, v2, Landroid/graphics/RectF;->bottom:F

    .line 772
    .line 773
    invoke-virtual {v1, v2, v13, v13, v14}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    .line 774
    .line 775
    .line 776
    :cond_b
    :goto_2
    return-void
.end method

.method public final onMeasure(II)V
    .locals 5

    .line 1
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    invoke-virtual {p0}, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->getPaddingLeft()I

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    sub-int/2addr p1, v2

    .line 18
    invoke-virtual {p0}, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->getPaddingRight()I

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    sub-int/2addr p1, v2

    .line 23
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 24
    .line 25
    .line 26
    move-result p2

    .line 27
    invoke-virtual {p0}, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->getPaddingBottom()I

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    sub-int/2addr p2, v2

    .line 32
    invoke-virtual {p0}, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->getPaddingTop()I

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    sub-int/2addr p2, v2

    .line 37
    const/high16 v2, 0x40000000    # 2.0f

    .line 38
    .line 39
    if-eq v0, v2, :cond_7

    .line 40
    .line 41
    if-ne v1, v2, :cond_0

    .line 42
    .line 43
    goto :goto_3

    .line 44
    :cond_0
    iget v0, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->c:I

    .line 45
    .line 46
    add-int v1, p2, v0

    .line 47
    .line 48
    iget v2, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->a:I

    .line 49
    .line 50
    add-int/2addr v1, v2

    .line 51
    sub-int v3, p1, v0

    .line 52
    .line 53
    sub-int/2addr v3, v2

    .line 54
    iget-boolean v2, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->u:Z

    .line 55
    .line 56
    if-eqz v2, :cond_1

    .line 57
    .line 58
    iget v2, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->b:I

    .line 59
    .line 60
    add-int v4, v0, v2

    .line 61
    .line 62
    sub-int/2addr v1, v4

    .line 63
    add-int/2addr v0, v2

    .line 64
    add-int/2addr v3, v0

    .line 65
    :cond_1
    const/4 v0, 0x1

    .line 66
    const/4 v2, 0x0

    .line 67
    if-gt v1, p1, :cond_2

    .line 68
    .line 69
    move v4, v0

    .line 70
    goto :goto_0

    .line 71
    :cond_2
    move v4, v2

    .line 72
    :goto_0
    if-gt v3, p2, :cond_3

    .line 73
    .line 74
    goto :goto_1

    .line 75
    :cond_3
    move v0, v2

    .line 76
    :goto_1
    if-eqz v4, :cond_4

    .line 77
    .line 78
    if-eqz v0, :cond_4

    .line 79
    .line 80
    goto :goto_2

    .line 81
    :cond_4
    if-nez v0, :cond_6

    .line 82
    .line 83
    if-eqz v4, :cond_6

    .line 84
    .line 85
    :cond_5
    move p1, v1

    .line 86
    goto :goto_4

    .line 87
    :cond_6
    if-nez v4, :cond_c

    .line 88
    .line 89
    if-eqz v0, :cond_c

    .line 90
    .line 91
    :goto_2
    move p2, v3

    .line 92
    goto :goto_4

    .line 93
    :cond_7
    :goto_3
    if-ne v0, v2, :cond_a

    .line 94
    .line 95
    if-eq v1, v2, :cond_a

    .line 96
    .line 97
    iget v0, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->c:I

    .line 98
    .line 99
    sub-int v1, p1, v0

    .line 100
    .line 101
    iget v2, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->a:I

    .line 102
    .line 103
    sub-int/2addr v1, v2

    .line 104
    iget-boolean v2, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->u:Z

    .line 105
    .line 106
    if-eqz v2, :cond_8

    .line 107
    .line 108
    iget v2, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->b:I

    .line 109
    .line 110
    add-int/2addr v0, v2

    .line 111
    add-int/2addr v1, v0

    .line 112
    :cond_8
    if-le v1, p2, :cond_9

    .line 113
    .line 114
    goto :goto_4

    .line 115
    :cond_9
    move p2, v1

    .line 116
    goto :goto_4

    .line 117
    :cond_a
    if-ne v1, v2, :cond_c

    .line 118
    .line 119
    if-eq v0, v2, :cond_c

    .line 120
    .line 121
    iget v0, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->c:I

    .line 122
    .line 123
    add-int v1, p2, v0

    .line 124
    .line 125
    iget v2, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->a:I

    .line 126
    .line 127
    add-int/2addr v1, v2

    .line 128
    iget-boolean v2, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->u:Z

    .line 129
    .line 130
    if-eqz v2, :cond_b

    .line 131
    .line 132
    iget v2, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->b:I

    .line 133
    .line 134
    add-int/2addr v0, v2

    .line 135
    sub-int/2addr v1, v0

    .line 136
    :cond_b
    if-le v1, p1, :cond_5

    .line 137
    .line 138
    :cond_c
    :goto_4
    invoke-virtual {p0}, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->getPaddingLeft()I

    .line 139
    .line 140
    .line 141
    move-result v0

    .line 142
    add-int/2addr v0, p1

    .line 143
    invoke-virtual {p0}, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->getPaddingRight()I

    .line 144
    .line 145
    .line 146
    move-result p1

    .line 147
    add-int/2addr p1, v0

    .line 148
    invoke-virtual {p0}, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->getPaddingTop()I

    .line 149
    .line 150
    .line 151
    move-result v0

    .line 152
    add-int/2addr v0, p2

    .line 153
    invoke-virtual {p0}, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->getPaddingBottom()I

    .line 154
    .line 155
    .line 156
    move-result p2

    .line 157
    add-int/2addr p2, v0

    .line 158
    invoke-virtual {p0, p1, p2}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 159
    .line 160
    .line 161
    return-void
.end method

.method public final onRestoreInstanceState(Landroid/os/Parcelable;)V
    .locals 1

    .line 1
    instance-of v0, p1, Landroid/os/Bundle;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, Landroid/os/Bundle;

    .line 6
    .line 7
    const-string v0, "alpha"

    .line 8
    .line 9
    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    iput v0, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->q:I

    .line 14
    .line 15
    const-string v0, "hue"

    .line 16
    .line 17
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getFloat(Ljava/lang/String;)F

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    iput v0, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->r:F

    .line 22
    .line 23
    const-string v0, "sat"

    .line 24
    .line 25
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getFloat(Ljava/lang/String;)F

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    iput v0, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->s:F

    .line 30
    .line 31
    const-string v0, "val"

    .line 32
    .line 33
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getFloat(Ljava/lang/String;)F

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    iput v0, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->t:F

    .line 38
    .line 39
    const-string v0, "show_alpha"

    .line 40
    .line 41
    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    iput-boolean v0, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->u:Z

    .line 46
    .line 47
    const-string v0, "alpha_text"

    .line 48
    .line 49
    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    iput-object v0, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->v:Ljava/lang/String;

    .line 54
    .line 55
    const-string v0, "instanceState"

    .line 56
    .line 57
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    :cond_0
    invoke-super {p0, p1}, Landroid/view/View;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    .line 62
    .line 63
    .line 64
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
    const-string v1, "instanceState"

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
    const-string v1, "alpha"

    .line 16
    .line 17
    iget v2, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->q:I

    .line 18
    .line 19
    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 20
    .line 21
    .line 22
    const-string v1, "hue"

    .line 23
    .line 24
    iget v2, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->r:F

    .line 25
    .line 26
    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putFloat(Ljava/lang/String;F)V

    .line 27
    .line 28
    .line 29
    const-string v1, "sat"

    .line 30
    .line 31
    iget v2, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->s:F

    .line 32
    .line 33
    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putFloat(Ljava/lang/String;F)V

    .line 34
    .line 35
    .line 36
    const-string v1, "val"

    .line 37
    .line 38
    iget v2, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->t:F

    .line 39
    .line 40
    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putFloat(Ljava/lang/String;F)V

    .line 41
    .line 42
    .line 43
    const-string v1, "show_alpha"

    .line 44
    .line 45
    iget-boolean v2, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->u:Z

    .line 46
    .line 47
    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 48
    .line 49
    .line 50
    const-string v1, "alpha_text"

    .line 51
    .line 52
    iget-object v2, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->v:Ljava/lang/String;

    .line 53
    .line 54
    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    return-object v0
.end method

.method public final onSizeChanged(IIII)V
    .locals 2

    .line 1
    invoke-super {p0, p1, p2, p3, p4}, Landroid/view/View;->onSizeChanged(IIII)V

    .line 2
    .line 3
    .line 4
    new-instance p3, Landroid/graphics/Rect;

    .line 5
    .line 6
    invoke-direct {p3}, Landroid/graphics/Rect;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p3, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->z:Landroid/graphics/Rect;

    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->getPaddingLeft()I

    .line 12
    .line 13
    .line 14
    move-result p4

    .line 15
    iput p4, p3, Landroid/graphics/Rect;->left:I

    .line 16
    .line 17
    iget-object p3, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->z:Landroid/graphics/Rect;

    .line 18
    .line 19
    invoke-virtual {p0}, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->getPaddingRight()I

    .line 20
    .line 21
    .line 22
    move-result p4

    .line 23
    sub-int/2addr p1, p4

    .line 24
    iput p1, p3, Landroid/graphics/Rect;->right:I

    .line 25
    .line 26
    iget-object p1, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->z:Landroid/graphics/Rect;

    .line 27
    .line 28
    invoke-virtual {p0}, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->getPaddingTop()I

    .line 29
    .line 30
    .line 31
    move-result p3

    .line 32
    iput p3, p1, Landroid/graphics/Rect;->top:I

    .line 33
    .line 34
    iget-object p1, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->z:Landroid/graphics/Rect;

    .line 35
    .line 36
    invoke-virtual {p0}, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->getPaddingBottom()I

    .line 37
    .line 38
    .line 39
    move-result p3

    .line 40
    sub-int/2addr p2, p3

    .line 41
    iput p2, p1, Landroid/graphics/Rect;->bottom:I

    .line 42
    .line 43
    const/4 p1, 0x0

    .line 44
    iput-object p1, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->m:Landroid/graphics/LinearGradient;

    .line 45
    .line 46
    iput-object p1, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->n:Landroid/graphics/LinearGradient;

    .line 47
    .line 48
    iput-object p1, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->o:Lm1/l;

    .line 49
    .line 50
    iput-object p1, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->p:Lm1/l;

    .line 51
    .line 52
    iget-object p1, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->z:Landroid/graphics/Rect;

    .line 53
    .line 54
    iget p2, p1, Landroid/graphics/Rect;->left:I

    .line 55
    .line 56
    add-int/lit8 p2, p2, 0x1

    .line 57
    .line 58
    iget p3, p1, Landroid/graphics/Rect;->top:I

    .line 59
    .line 60
    add-int/lit8 p3, p3, 0x1

    .line 61
    .line 62
    iget p4, p1, Landroid/graphics/Rect;->bottom:I

    .line 63
    .line 64
    add-int/lit8 p4, p4, -0x1

    .line 65
    .line 66
    iget p1, p1, Landroid/graphics/Rect;->right:I

    .line 67
    .line 68
    add-int/lit8 p1, p1, -0x1

    .line 69
    .line 70
    iget v0, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->c:I

    .line 71
    .line 72
    sub-int/2addr p1, v0

    .line 73
    iget v1, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->a:I

    .line 74
    .line 75
    sub-int/2addr p1, v1

    .line 76
    iget-boolean v1, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->u:Z

    .line 77
    .line 78
    if-eqz v1, :cond_0

    .line 79
    .line 80
    iget v1, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->b:I

    .line 81
    .line 82
    add-int/2addr v1, v0

    .line 83
    sub-int/2addr p4, v1

    .line 84
    :cond_0
    new-instance v0, Landroid/graphics/Rect;

    .line 85
    .line 86
    invoke-direct {v0, p2, p3, p1, p4}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 87
    .line 88
    .line 89
    iput-object v0, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->A:Landroid/graphics/Rect;

    .line 90
    .line 91
    iget-object p1, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->z:Landroid/graphics/Rect;

    .line 92
    .line 93
    iget p2, p1, Landroid/graphics/Rect;->right:I

    .line 94
    .line 95
    iget p3, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->a:I

    .line 96
    .line 97
    sub-int p3, p2, p3

    .line 98
    .line 99
    add-int/lit8 p3, p3, 0x1

    .line 100
    .line 101
    iget p4, p1, Landroid/graphics/Rect;->top:I

    .line 102
    .line 103
    add-int/lit8 p4, p4, 0x1

    .line 104
    .line 105
    iget p1, p1, Landroid/graphics/Rect;->bottom:I

    .line 106
    .line 107
    add-int/lit8 p1, p1, -0x1

    .line 108
    .line 109
    iget-boolean v0, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->u:Z

    .line 110
    .line 111
    if-eqz v0, :cond_1

    .line 112
    .line 113
    iget v0, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->c:I

    .line 114
    .line 115
    iget v1, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->b:I

    .line 116
    .line 117
    add-int/2addr v0, v1

    .line 118
    goto :goto_0

    .line 119
    :cond_1
    const/4 v0, 0x0

    .line 120
    :goto_0
    sub-int/2addr p1, v0

    .line 121
    add-int/lit8 p2, p2, -0x1

    .line 122
    .line 123
    new-instance v0, Landroid/graphics/Rect;

    .line 124
    .line 125
    invoke-direct {v0, p3, p4, p2, p1}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 126
    .line 127
    .line 128
    iput-object v0, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->B:Landroid/graphics/Rect;

    .line 129
    .line 130
    iget-boolean p1, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->u:Z

    .line 131
    .line 132
    if-nez p1, :cond_2

    .line 133
    .line 134
    return-void

    .line 135
    :cond_2
    iget-object p1, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->z:Landroid/graphics/Rect;

    .line 136
    .line 137
    iget p2, p1, Landroid/graphics/Rect;->left:I

    .line 138
    .line 139
    add-int/lit8 p2, p2, 0x1

    .line 140
    .line 141
    iget p3, p1, Landroid/graphics/Rect;->bottom:I

    .line 142
    .line 143
    iget p4, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->b:I

    .line 144
    .line 145
    sub-int p4, p3, p4

    .line 146
    .line 147
    add-int/lit8 p4, p4, 0x1

    .line 148
    .line 149
    add-int/lit8 p3, p3, -0x1

    .line 150
    .line 151
    iget p1, p1, Landroid/graphics/Rect;->right:I

    .line 152
    .line 153
    add-int/lit8 p1, p1, -0x1

    .line 154
    .line 155
    new-instance v0, Landroid/graphics/Rect;

    .line 156
    .line 157
    invoke-direct {v0, p2, p4, p1, p3}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 158
    .line 159
    .line 160
    iput-object v0, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->C:Landroid/graphics/Rect;

    .line 161
    .line 162
    new-instance p1, Lm1/a;

    .line 163
    .line 164
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 165
    .line 166
    .line 167
    move-result-object p2

    .line 168
    const/high16 p3, 0x40800000    # 4.0f

    .line 169
    .line 170
    invoke-static {p2, p3}, Lv7/d;->h(Landroid/content/Context;F)I

    .line 171
    .line 172
    .line 173
    move-result p2

    .line 174
    invoke-direct {p1, p2}, Lm1/a;-><init>(I)V

    .line 175
    .line 176
    .line 177
    iput-object p1, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->E:Lm1/a;

    .line 178
    .line 179
    iget-object p2, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->C:Landroid/graphics/Rect;

    .line 180
    .line 181
    iget p2, p2, Landroid/graphics/Rect;->left:I

    .line 182
    .line 183
    int-to-float p2, p2

    .line 184
    invoke-static {p2}, Ljava/lang/Math;->round(F)I

    .line 185
    .line 186
    .line 187
    move-result p2

    .line 188
    iget-object p3, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->C:Landroid/graphics/Rect;

    .line 189
    .line 190
    iget p3, p3, Landroid/graphics/Rect;->top:I

    .line 191
    .line 192
    int-to-float p3, p3

    .line 193
    invoke-static {p3}, Ljava/lang/Math;->round(F)I

    .line 194
    .line 195
    .line 196
    move-result p3

    .line 197
    iget-object p4, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->C:Landroid/graphics/Rect;

    .line 198
    .line 199
    iget p4, p4, Landroid/graphics/Rect;->right:I

    .line 200
    .line 201
    int-to-float p4, p4

    .line 202
    invoke-static {p4}, Ljava/lang/Math;->round(F)I

    .line 203
    .line 204
    .line 205
    move-result p4

    .line 206
    iget-object v0, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->C:Landroid/graphics/Rect;

    .line 207
    .line 208
    iget v0, v0, Landroid/graphics/Rect;->bottom:I

    .line 209
    .line 210
    int-to-float v0, v0

    .line 211
    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    .line 212
    .line 213
    .line 214
    move-result v0

    .line 215
    invoke-virtual {p1, p2, p3, p4, v0}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 216
    .line 217
    .line 218
    return-void
.end method

.method public final onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 8

    .line 1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x2

    .line 6
    const/4 v2, 0x1

    .line 7
    const/4 v3, 0x0

    .line 8
    if-eqz v0, :cond_2

    .line 9
    .line 10
    if-eq v0, v2, :cond_1

    .line 11
    .line 12
    if-eq v0, v1, :cond_0

    .line 13
    .line 14
    move v0, v3

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    invoke-virtual {p0, p1}, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->a(Landroid/view/MotionEvent;)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    goto :goto_0

    .line 21
    :cond_1
    const/4 v0, 0x0

    .line 22
    iput-object v0, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->D:Landroid/graphics/Point;

    .line 23
    .line 24
    invoke-virtual {p0, p1}, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->a(Landroid/view/MotionEvent;)Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    goto :goto_0

    .line 29
    :cond_2
    new-instance v0, Landroid/graphics/Point;

    .line 30
    .line 31
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 32
    .line 33
    .line 34
    move-result v4

    .line 35
    float-to-int v4, v4

    .line 36
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 37
    .line 38
    .line 39
    move-result v5

    .line 40
    float-to-int v5, v5

    .line 41
    invoke-direct {v0, v4, v5}, Landroid/graphics/Point;-><init>(II)V

    .line 42
    .line 43
    .line 44
    iput-object v0, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->D:Landroid/graphics/Point;

    .line 45
    .line 46
    invoke-virtual {p0, p1}, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->a(Landroid/view/MotionEvent;)Z

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    :goto_0
    if-eqz v0, :cond_4

    .line 51
    .line 52
    iget-object p1, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->F:Lm1/m;

    .line 53
    .line 54
    if-eqz p1, :cond_3

    .line 55
    .line 56
    iget v0, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->q:I

    .line 57
    .line 58
    iget v4, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->r:F

    .line 59
    .line 60
    iget v5, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->s:F

    .line 61
    .line 62
    iget v6, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->t:F

    .line 63
    .line 64
    const/4 v7, 0x3

    .line 65
    new-array v7, v7, [F

    .line 66
    .line 67
    aput v4, v7, v3

    .line 68
    .line 69
    aput v5, v7, v2

    .line 70
    .line 71
    aput v6, v7, v1

    .line 72
    .line 73
    invoke-static {v0, v7}, Landroid/graphics/Color;->HSVToColor(I[F)I

    .line 74
    .line 75
    .line 76
    move-result v0

    .line 77
    check-cast p1, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;

    .line 78
    .line 79
    invoke-virtual {p1, v0}, Lcom/jaredrummler/android/colorpicker/ColorPickerDialog;->j(I)V

    .line 80
    .line 81
    .line 82
    :cond_3
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 83
    .line 84
    .line 85
    return v2

    .line 86
    :cond_4
    invoke-super {p0, p1}, Landroid/view/View;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 87
    .line 88
    .line 89
    move-result p1

    .line 90
    return p1
.end method

.method public setAlphaSliderText(I)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    .line 2
    invoke-virtual {p0, p1}, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->setAlphaSliderText(Ljava/lang/String;)V

    return-void
.end method

.method public setAlphaSliderText(Ljava/lang/String;)V
    .locals 0

    .line 3
    iput-object p1, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->v:Ljava/lang/String;

    .line 4
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public setAlphaSliderVisible(Z)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->u:Z

    .line 2
    .line 3
    if-eq v0, p1, :cond_0

    .line 4
    .line 5
    iput-boolean p1, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->u:Z

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    iput-object p1, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->m:Landroid/graphics/LinearGradient;

    .line 9
    .line 10
    iput-object p1, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->n:Landroid/graphics/LinearGradient;

    .line 11
    .line 12
    iput-object p1, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->p:Lm1/l;

    .line 13
    .line 14
    iput-object p1, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->o:Lm1/l;

    .line 15
    .line 16
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 17
    .line 18
    .line 19
    :cond_0
    return-void
.end method

.method public setBorderColor(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->x:I

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setColor(I)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, p1, v0}, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->b(IZ)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method public setOnColorChangedListener(Lm1/m;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->F:Lm1/m;

    .line 2
    .line 3
    return-void
.end method

.method public setSliderTrackerColor(I)V
    .locals 1

    .line 1
    iput p1, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->w:I

    .line 2
    .line 3
    iget-object v0, p0, Lcom/jaredrummler/android/colorpicker/ColorPickerView;->k:Landroid/graphics/Paint;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 9
    .line 10
    .line 11
    return-void
.end method
