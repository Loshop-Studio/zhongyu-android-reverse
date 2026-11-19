.class public Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;
.super Landroidx/appcompat/widget/AppCompatButton;
.source "SourceFile"


# instance fields
.field public A:Ll0/a;

.field public a:I

.field public b:I

.field public c:I

.field public d:I

.field public e:F

.field public f:F

.field public g:F

.field public h:F

.field public i:F

.field public j:I

.field public k:I

.field public l:F

.field public m:F

.field public n:I

.field public o:I

.field public p:I

.field public q:I

.field public r:I

.field public s:I

.field public t:I

.field public u:I

.field public v:I

.field public w:I

.field public x:Z

.field public y:I

.field public z:Landroid/graphics/drawable/GradientDrawable;


# direct methods
.method private getAlphaViewHelper()Ll0/a;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->A:Ll0/a;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Ll0/c;

    .line 6
    .line 7
    invoke-direct {v0, p0}, Ll0/c;-><init>(Landroid/view/View;)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->A:Ll0/a;

    .line 11
    .line 12
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->A:Ll0/a;

    .line 13
    .line 14
    return-object v0
.end method

.method private setSelectorColor(I)V
    .locals 2

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->p:I

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    if-ne v0, v1, :cond_3

    .line 5
    .line 6
    const v0, -0x101009e

    .line 7
    .line 8
    .line 9
    if-eq p1, v0, :cond_2

    .line 10
    .line 11
    const v0, 0x101009e

    .line 12
    .line 13
    .line 14
    if-eq p1, v0, :cond_1

    .line 15
    .line 16
    const v0, 0x10100a7

    .line 17
    .line 18
    .line 19
    if-eq p1, v0, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    iget-object p1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->z:Landroid/graphics/drawable/GradientDrawable;

    .line 23
    .line 24
    iget v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->b:I

    .line 25
    .line 26
    invoke-virtual {p1, v0}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    iget-object p1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->z:Landroid/graphics/drawable/GradientDrawable;

    .line 31
    .line 32
    iget v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->d:I

    .line 33
    .line 34
    invoke-virtual {p1, v0}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 35
    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_2
    iget-object p1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->z:Landroid/graphics/drawable/GradientDrawable;

    .line 39
    .line 40
    iget v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->c:I

    .line 41
    .line 42
    invoke-virtual {p1, v0}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 43
    .line 44
    .line 45
    :cond_3
    :goto_0
    return-void
.end method


# virtual methods
.method public a(I)Landroid/graphics/drawable/GradientDrawable;
    .locals 1

    .line 1
    new-instance v0, Landroid/graphics/drawable/GradientDrawable;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->z:Landroid/graphics/drawable/GradientDrawable;

    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->h()V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->f()V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->i()V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->e()V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->g()V

    .line 21
    .line 22
    .line 23
    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->setSelectorColor(I)V

    .line 24
    .line 25
    .line 26
    iget-object p1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->z:Landroid/graphics/drawable/GradientDrawable;

    .line 27
    .line 28
    return-object p1
.end method

.method public final b(I)Landroid/graphics/drawable/GradientDrawable$Orientation;
    .locals 0

    .line 1
    packed-switch p1, :pswitch_data_0

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x0

    .line 5
    goto :goto_0

    .line 6
    :pswitch_0
    sget-object p1, Landroid/graphics/drawable/GradientDrawable$Orientation;->TL_BR:Landroid/graphics/drawable/GradientDrawable$Orientation;

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :pswitch_1
    sget-object p1, Landroid/graphics/drawable/GradientDrawable$Orientation;->LEFT_RIGHT:Landroid/graphics/drawable/GradientDrawable$Orientation;

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :pswitch_2
    sget-object p1, Landroid/graphics/drawable/GradientDrawable$Orientation;->BL_TR:Landroid/graphics/drawable/GradientDrawable$Orientation;

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :pswitch_3
    sget-object p1, Landroid/graphics/drawable/GradientDrawable$Orientation;->BOTTOM_TOP:Landroid/graphics/drawable/GradientDrawable$Orientation;

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :pswitch_4
    sget-object p1, Landroid/graphics/drawable/GradientDrawable$Orientation;->BR_TL:Landroid/graphics/drawable/GradientDrawable$Orientation;

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :pswitch_5
    sget-object p1, Landroid/graphics/drawable/GradientDrawable$Orientation;->RIGHT_LEFT:Landroid/graphics/drawable/GradientDrawable$Orientation;

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :pswitch_6
    sget-object p1, Landroid/graphics/drawable/GradientDrawable$Orientation;->TR_BL:Landroid/graphics/drawable/GradientDrawable$Orientation;

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :pswitch_7
    sget-object p1, Landroid/graphics/drawable/GradientDrawable$Orientation;->TOP_BOTTOM:Landroid/graphics/drawable/GradientDrawable$Orientation;

    .line 28
    .line 29
    :goto_0
    return-object p1

    .line 30
    nop

    .line 31
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final c()Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->d()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    iget v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->d:I

    .line 8
    .line 9
    iget v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->b:I

    .line 10
    .line 11
    if-ne v0, v1, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 v0, 0x0

    .line 15
    goto :goto_1

    .line 16
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 17
    :goto_1
    return v0
.end method

.method public final d()Z
    .locals 2

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->p:I

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    if-eq v0, v1, :cond_0

    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    :goto_0
    return v0
.end method

.method public final e()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->z:Landroid/graphics/drawable/GradientDrawable;

    .line 2
    .line 3
    iget v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->j:I

    .line 4
    .line 5
    iget v2, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->k:I

    .line 6
    .line 7
    iget v3, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->l:F

    .line 8
    .line 9
    iget v4, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->m:F

    .line 10
    .line 11
    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/graphics/drawable/GradientDrawable;->setStroke(IIFF)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public final f()V
    .locals 4

    .line 1
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->d()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_4

    .line 6
    .line 7
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->z:Landroid/graphics/drawable/GradientDrawable;

    .line 8
    .line 9
    iget v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->p:I

    .line 10
    .line 11
    invoke-virtual {p0, v1}, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->b(I)Landroid/graphics/drawable/GradientDrawable$Orientation;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-virtual {v0, v1}, Landroid/graphics/drawable/GradientDrawable;->setOrientation(Landroid/graphics/drawable/GradientDrawable$Orientation;)V

    .line 16
    .line 17
    .line 18
    iget v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->u:I

    .line 19
    .line 20
    const/4 v1, -0x1

    .line 21
    if-ne v0, v1, :cond_0

    .line 22
    .line 23
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->z:Landroid/graphics/drawable/GradientDrawable;

    .line 24
    .line 25
    iget v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->t:I

    .line 26
    .line 27
    iget v2, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->v:I

    .line 28
    .line 29
    filled-new-array {v1, v2}, [I

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    invoke-virtual {v0, v1}, Landroid/graphics/drawable/GradientDrawable;->setColors([I)V

    .line 34
    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    iget-object v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->z:Landroid/graphics/drawable/GradientDrawable;

    .line 38
    .line 39
    iget v2, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->t:I

    .line 40
    .line 41
    iget v3, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->v:I

    .line 42
    .line 43
    filled-new-array {v2, v0, v3}, [I

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    invoke-virtual {v1, v0}, Landroid/graphics/drawable/GradientDrawable;->setColors([I)V

    .line 48
    .line 49
    .line 50
    :goto_0
    iget v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->w:I

    .line 51
    .line 52
    if-eqz v0, :cond_3

    .line 53
    .line 54
    const/4 v1, 0x1

    .line 55
    if-eq v0, v1, :cond_2

    .line 56
    .line 57
    const/4 v1, 0x2

    .line 58
    if-eq v0, v1, :cond_1

    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->z:Landroid/graphics/drawable/GradientDrawable;

    .line 62
    .line 63
    invoke-virtual {v0, v1}, Landroid/graphics/drawable/GradientDrawable;->setGradientType(I)V

    .line 64
    .line 65
    .line 66
    goto :goto_1

    .line 67
    :cond_2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->z:Landroid/graphics/drawable/GradientDrawable;

    .line 68
    .line 69
    invoke-virtual {v0, v1}, Landroid/graphics/drawable/GradientDrawable;->setGradientType(I)V

    .line 70
    .line 71
    .line 72
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->z:Landroid/graphics/drawable/GradientDrawable;

    .line 73
    .line 74
    iget v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->s:I

    .line 75
    .line 76
    int-to-float v1, v1

    .line 77
    invoke-virtual {v0, v1}, Landroid/graphics/drawable/GradientDrawable;->setGradientRadius(F)V

    .line 78
    .line 79
    .line 80
    goto :goto_1

    .line 81
    :cond_3
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->z:Landroid/graphics/drawable/GradientDrawable;

    .line 82
    .line 83
    const/4 v1, 0x0

    .line 84
    invoke-virtual {v0, v1}, Landroid/graphics/drawable/GradientDrawable;->setGradientType(I)V

    .line 85
    .line 86
    .line 87
    :goto_1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->z:Landroid/graphics/drawable/GradientDrawable;

    .line 88
    .line 89
    iget-boolean v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->x:Z

    .line 90
    .line 91
    invoke-virtual {v0, v1}, Landroid/graphics/drawable/GradientDrawable;->setUseLevel(Z)V

    .line 92
    .line 93
    .line 94
    iget v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->q:I

    .line 95
    .line 96
    if-eqz v0, :cond_5

    .line 97
    .line 98
    iget v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->r:I

    .line 99
    .line 100
    if-eqz v1, :cond_5

    .line 101
    .line 102
    iget-object v2, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->z:Landroid/graphics/drawable/GradientDrawable;

    .line 103
    .line 104
    int-to-float v0, v0

    .line 105
    int-to-float v1, v1

    .line 106
    invoke-virtual {v2, v0, v1}, Landroid/graphics/drawable/GradientDrawable;->setGradientCenter(FF)V

    .line 107
    .line 108
    .line 109
    goto :goto_2

    .line 110
    :cond_4
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->z:Landroid/graphics/drawable/GradientDrawable;

    .line 111
    .line 112
    iget v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->a:I

    .line 113
    .line 114
    invoke-virtual {v0, v1}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 115
    .line 116
    .line 117
    :cond_5
    :goto_2
    return-void
.end method

.method public final g()V
    .locals 4

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->y:I

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->e:F

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    cmpl-float v1, v0, v1

    .line 9
    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    iget-object v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->z:Landroid/graphics/drawable/GradientDrawable;

    .line 13
    .line 14
    invoke-virtual {v1, v0}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 15
    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->z:Landroid/graphics/drawable/GradientDrawable;

    .line 19
    .line 20
    const/16 v1, 0x8

    .line 21
    .line 22
    new-array v1, v1, [F

    .line 23
    .line 24
    iget v2, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->f:F

    .line 25
    .line 26
    const/4 v3, 0x0

    .line 27
    aput v2, v1, v3

    .line 28
    .line 29
    const/4 v3, 0x1

    .line 30
    aput v2, v1, v3

    .line 31
    .line 32
    iget v2, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->g:F

    .line 33
    .line 34
    const/4 v3, 0x2

    .line 35
    aput v2, v1, v3

    .line 36
    .line 37
    const/4 v3, 0x3

    .line 38
    aput v2, v1, v3

    .line 39
    .line 40
    iget v2, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->i:F

    .line 41
    .line 42
    const/4 v3, 0x4

    .line 43
    aput v2, v1, v3

    .line 44
    .line 45
    const/4 v3, 0x5

    .line 46
    aput v2, v1, v3

    .line 47
    .line 48
    iget v2, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->h:F

    .line 49
    .line 50
    const/4 v3, 0x6

    .line 51
    aput v2, v1, v3

    .line 52
    .line 53
    const/4 v3, 0x7

    .line 54
    aput v2, v1, v3

    .line 55
    .line 56
    invoke-virtual {v0, v1}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadii([F)V

    .line 57
    .line 58
    .line 59
    :cond_1
    :goto_0
    return-void
.end method

.method public getSelector()Landroid/graphics/drawable/StateListDrawable;
    .locals 4

    .line 1
    new-instance v0, Landroid/graphics/drawable/StateListDrawable;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/graphics/drawable/StateListDrawable;-><init>()V

    .line 4
    .line 5
    .line 6
    const v1, 0x10100a7

    .line 7
    .line 8
    .line 9
    const v2, 0x101009e

    .line 10
    .line 11
    .line 12
    filled-new-array {v1, v2}, [I

    .line 13
    .line 14
    .line 15
    move-result-object v3

    .line 16
    invoke-virtual {p0, v1}, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->a(I)Landroid/graphics/drawable/GradientDrawable;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-virtual {v0, v3, v1}, Landroid/graphics/drawable/StateListDrawable;->addState([ILandroid/graphics/drawable/Drawable;)V

    .line 21
    .line 22
    .line 23
    const v1, -0x101009e

    .line 24
    .line 25
    .line 26
    filled-new-array {v1}, [I

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    invoke-virtual {p0, v1}, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->a(I)Landroid/graphics/drawable/GradientDrawable;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    invoke-virtual {v0, v3, v1}, Landroid/graphics/drawable/StateListDrawable;->addState([ILandroid/graphics/drawable/Drawable;)V

    .line 35
    .line 36
    .line 37
    const/4 v1, 0x0

    .line 38
    new-array v1, v1, [I

    .line 39
    .line 40
    invoke-virtual {p0, v2}, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->a(I)Landroid/graphics/drawable/GradientDrawable;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    invoke-virtual {v0, v1, v2}, Landroid/graphics/drawable/StateListDrawable;->addState([ILandroid/graphics/drawable/Drawable;)V

    .line 45
    .line 46
    .line 47
    return-object v0
.end method

.method public final h()V
    .locals 2

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->y:I

    .line 2
    .line 3
    if-eqz v0, :cond_3

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    if-eq v0, v1, :cond_2

    .line 7
    .line 8
    const/4 v1, 0x2

    .line 9
    if-eq v0, v1, :cond_1

    .line 10
    .line 11
    const/4 v1, 0x3

    .line 12
    if-eq v0, v1, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->z:Landroid/graphics/drawable/GradientDrawable;

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Landroid/graphics/drawable/GradientDrawable;->setShape(I)V

    .line 18
    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->z:Landroid/graphics/drawable/GradientDrawable;

    .line 22
    .line 23
    invoke-virtual {v0, v1}, Landroid/graphics/drawable/GradientDrawable;->setShape(I)V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->z:Landroid/graphics/drawable/GradientDrawable;

    .line 28
    .line 29
    invoke-virtual {v0, v1}, Landroid/graphics/drawable/GradientDrawable;->setShape(I)V

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_3
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->z:Landroid/graphics/drawable/GradientDrawable;

    .line 34
    .line 35
    const/4 v1, 0x0

    .line 36
    invoke-virtual {v0, v1}, Landroid/graphics/drawable/GradientDrawable;->setShape(I)V

    .line 37
    .line 38
    .line 39
    :goto_0
    return-void
.end method

.method public final i()V
    .locals 3

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->y:I

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->z:Landroid/graphics/drawable/GradientDrawable;

    .line 6
    .line 7
    iget v1, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->n:I

    .line 8
    .line 9
    iget v2, p0, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->o:I

    .line 10
    .line 11
    invoke-virtual {v0, v1, v2}, Landroid/graphics/drawable/GradientDrawable;->setSize(II)V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
.end method

.method public setChangeAlphaWhenDisable(Z)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->c()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->getAlphaViewHelper()Ll0/a;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-interface {v0, p1}, Ll0/a;->b(Z)V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
.end method

.method public setChangeAlphaWhenPress(Z)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->c()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->getAlphaViewHelper()Ll0/a;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-interface {v0, p1}, Ll0/a;->a(Z)V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
.end method

.method public setEnabled(Z)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroid/widget/Button;->setEnabled(Z)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->c()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->getAlphaViewHelper()Ll0/a;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-interface {v0, p0, p1}, Ll0/a;->c(Landroid/view/View;Z)V

    .line 15
    .line 16
    .line 17
    :cond_0
    return-void
.end method

.method public setPressed(Z)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroid/widget/Button;->setPressed(Z)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->c()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    invoke-direct {p0}, Lcom/xuexiang/xui/widget/textview/supertextview/SuperButton;->getAlphaViewHelper()Ll0/a;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-interface {v0, p0, p1}, Ll0/a;->d(Landroid/view/View;Z)V

    .line 15
    .line 16
    .line 17
    :cond_0
    return-void
.end method
