.class public Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;
.super Landroid/widget/LinearLayout;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;
.implements Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;
.implements Lio/github/inflationx/calligraphy3/HasTypeface;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/xuexiang/xui/widget/tabbar/EasyIndicator$b;
    }
.end annotation


# instance fields
.field public a:Landroid/widget/LinearLayout;

.field public b:Landroidx/viewpager/widget/ViewPager;

.field public c:Landroid/widget/LinearLayout;

.field public d:[Landroid/widget/TextView;

.field public e:I

.field public f:I

.field public g:I

.field public h:I

.field public i:Z

.field public j:I

.field public k:I

.field public l:I

.field public m:Landroid/graphics/drawable/Drawable;

.field public n:I

.field public o:I

.field public p:I

.field public q:I

.field public r:I

.field public s:I

.field public t:I

.field public u:F

.field public v:F


# direct methods
.method public static synthetic a(Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;)Landroid/widget/LinearLayout;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->a:Landroid/widget/LinearLayout;

    .line 2
    .line 3
    return-object p0
.end method

.method private setSelectorColor(Landroid/widget/TextView;)V
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->d:[Landroid/widget/TextView;

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    const/4 v2, 0x0

    .line 5
    move v3, v2

    .line 6
    :goto_0
    if-ge v3, v1, :cond_0

    .line 7
    .line 8
    aget-object v4, v0, v3

    .line 9
    .line 10
    iget v5, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->t:I

    .line 11
    .line 12
    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setTextColor(I)V

    .line 13
    .line 14
    .line 15
    iget v5, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->u:F

    .line 16
    .line 17
    invoke-virtual {v4, v2, v5}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 18
    .line 19
    .line 20
    add-int/lit8 v3, v3, 0x1

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    iget v0, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->s:I

    .line 24
    .line 25
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 26
    .line 27
    .line 28
    iget v0, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->v:F

    .line 29
    .line 30
    invoke-virtual {p1, v2, v0}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 31
    .line 32
    .line 33
    return-void
.end method


# virtual methods
.method public final b(Landroid/widget/TextView;)Landroid/animation/AnimatorSet;
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->c:Landroid/widget/LinearLayout;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/view/View;->getX()F

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget-object v1, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->a:Landroid/widget/LinearLayout;

    .line 8
    .line 9
    invoke-virtual {v1}, Landroid/view/View;->getX()F

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    invoke-virtual {p1}, Landroid/view/View;->getX()F

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    add-float/2addr v3, v0

    .line 18
    const/4 v0, 0x2

    .line 19
    new-array v4, v0, [F

    .line 20
    .line 21
    const/4 v5, 0x0

    .line 22
    aput v2, v4, v5

    .line 23
    .line 24
    const/4 v2, 0x1

    .line 25
    aput v3, v4, v2

    .line 26
    .line 27
    const-string v3, "X"

    .line 28
    .line 29
    invoke-static {v1, v3, v4}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    iget-object v3, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->a:Landroid/widget/LinearLayout;

    .line 34
    .line 35
    invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    iget v4, v3, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 40
    .line 41
    invoke-virtual {p1}, Landroid/view/View;->getMeasuredWidth()I

    .line 42
    .line 43
    .line 44
    move-result p1

    .line 45
    filled-new-array {v4, p1}, [I

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    invoke-static {p1}, Landroid/animation/ValueAnimator;->ofInt([I)Landroid/animation/ValueAnimator;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    new-instance v4, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator$a;

    .line 54
    .line 55
    invoke-direct {v4, p0, v3}, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator$a;-><init>(Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;Landroid/view/ViewGroup$LayoutParams;)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {p1, v4}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 59
    .line 60
    .line 61
    new-instance v3, Landroid/animation/AnimatorSet;

    .line 62
    .line 63
    invoke-direct {v3}, Landroid/animation/AnimatorSet;-><init>()V

    .line 64
    .line 65
    .line 66
    new-instance v4, Landroidx/interpolator/view/animation/FastOutSlowInInterpolator;

    .line 67
    .line 68
    invoke-direct {v4}, Landroidx/interpolator/view/animation/FastOutSlowInInterpolator;-><init>()V

    .line 69
    .line 70
    .line 71
    invoke-virtual {v3, v4}, Landroid/animation/AnimatorSet;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 72
    .line 73
    .line 74
    new-array v0, v0, [Landroid/animation/Animator;

    .line 75
    .line 76
    aput-object v1, v0, v5

    .line 77
    .line 78
    aput-object p1, v0, v2

    .line 79
    .line 80
    invoke-virtual {v3, v0}, Landroid/animation/AnimatorSet;->playTogether([Landroid/animation/Animator;)V

    .line 81
    .line 82
    .line 83
    return-object v3
.end method

.method public getTabContent()Landroid/widget/LinearLayout;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->c:Landroid/widget/LinearLayout;

    .line 2
    .line 3
    return-object v0
.end method

.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 1
    move-object v0, p1

    .line 2
    check-cast v0, Landroid/widget/TextView;

    .line 3
    .line 4
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    check-cast p1, Ljava/lang/Integer;

    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    iget-object v1, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->b:Landroidx/viewpager/widget/ViewPager;

    .line 15
    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    invoke-virtual {v1, p1}, Landroidx/viewpager/widget/ViewPager;->setCurrentItem(I)V

    .line 19
    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    invoke-direct {p0, v0}, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->setSelectorColor(Landroid/widget/TextView;)V

    .line 23
    .line 24
    .line 25
    iget-boolean p1, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->i:Z

    .line 26
    .line 27
    if-eqz p1, :cond_1

    .line 28
    .line 29
    invoke-virtual {p0, v0}, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->b(Landroid/widget/TextView;)Landroid/animation/AnimatorSet;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-virtual {p1}, Landroid/animation/AnimatorSet;->start()V

    .line 34
    .line 35
    .line 36
    :cond_1
    :goto_0
    return-void
.end method

.method public onPageScrollStateChanged(I)V
    .locals 0

    return-void
.end method

.method public onPageScrolled(IFI)V
    .locals 1

    .line 1
    iget-object p3, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->a:Landroid/widget/LinearLayout;

    .line 2
    .line 3
    invoke-virtual {p3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 4
    .line 5
    .line 6
    move-result-object p3

    .line 7
    check-cast p3, Landroid/widget/LinearLayout$LayoutParams;

    .line 8
    .line 9
    iget v0, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->f:I

    .line 10
    .line 11
    if-ne v0, p1, :cond_0

    .line 12
    .line 13
    iget-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->a:Landroid/widget/LinearLayout;

    .line 14
    .line 15
    invoke-virtual {p1}, Landroid/view/View;->getMeasuredWidth()I

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    mul-int/2addr v0, p1

    .line 20
    int-to-float p1, v0

    .line 21
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->a:Landroid/widget/LinearLayout;

    .line 22
    .line 23
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredWidth()I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    int-to-float v0, v0

    .line 28
    mul-float/2addr p2, v0

    .line 29
    add-float/2addr p1, p2

    .line 30
    float-to-int p1, p1

    .line 31
    invoke-virtual {p3, p1}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginStart(I)V

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    if-le v0, p1, :cond_1

    .line 36
    .line 37
    iget-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->a:Landroid/widget/LinearLayout;

    .line 38
    .line 39
    invoke-virtual {p1}, Landroid/view/View;->getMeasuredWidth()I

    .line 40
    .line 41
    .line 42
    move-result p1

    .line 43
    mul-int/2addr v0, p1

    .line 44
    int-to-float p1, v0

    .line 45
    const/high16 v0, 0x3f800000    # 1.0f

    .line 46
    .line 47
    sub-float/2addr v0, p2

    .line 48
    iget-object p2, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->a:Landroid/widget/LinearLayout;

    .line 49
    .line 50
    invoke-virtual {p2}, Landroid/view/View;->getMeasuredWidth()I

    .line 51
    .line 52
    .line 53
    move-result p2

    .line 54
    int-to-float p2, p2

    .line 55
    mul-float/2addr v0, p2

    .line 56
    sub-float/2addr p1, v0

    .line 57
    float-to-int p1, p1

    .line 58
    invoke-virtual {p3, p1}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginStart(I)V

    .line 59
    .line 60
    .line 61
    :cond_1
    :goto_0
    iget-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->a:Landroid/widget/LinearLayout;

    .line 62
    .line 63
    invoke-virtual {p1, p3}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 64
    .line 65
    .line 66
    return-void
.end method

.method public onPageSelected(I)V
    .locals 1

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->f:I

    .line 2
    .line 3
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->d:[Landroid/widget/TextView;

    .line 4
    .line 5
    aget-object p1, v0, p1

    .line 6
    .line 7
    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->setSelectorColor(Landroid/widget/TextView;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public setOnTabClickListener(Lcom/xuexiang/xui/widget/tabbar/EasyIndicator$b;)V
    .locals 0

    return-void
.end method

.method public setTabTitles([Ljava/lang/String;)V
    .locals 6

    .line 1
    array-length v0, p1

    .line 2
    new-array v0, v0, [Landroid/widget/TextView;

    .line 3
    .line 4
    iput-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->d:[Landroid/widget/TextView;

    .line 5
    .line 6
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->c:Landroid/widget/LinearLayout;

    .line 7
    .line 8
    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    move v1, v0

    .line 13
    :goto_0
    array-length v2, p1

    .line 14
    const/16 v3, 0x11

    .line 15
    .line 16
    if-ge v1, v2, :cond_2

    .line 17
    .line 18
    new-instance v2, Landroid/widget/TextView;

    .line 19
    .line 20
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 21
    .line 22
    .line 23
    move-result-object v4

    .line 24
    invoke-direct {v2, v4}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 25
    .line 26
    .line 27
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 28
    .line 29
    .line 30
    move-result-object v4

    .line 31
    invoke-virtual {v2, v4}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    aget-object v4, p1, v1

    .line 35
    .line 36
    invoke-virtual {v2, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 37
    .line 38
    .line 39
    invoke-static {}, Lo2/b;->c()Landroid/graphics/Typeface;

    .line 40
    .line 41
    .line 42
    move-result-object v4

    .line 43
    invoke-virtual {v2, v4}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setGravity(I)V

    .line 47
    .line 48
    .line 49
    new-instance v3, Landroid/widget/LinearLayout$LayoutParams;

    .line 50
    .line 51
    iget v4, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->g:I

    .line 52
    .line 53
    const/high16 v5, 0x3f800000    # 1.0f

    .line 54
    .line 55
    invoke-direct {v3, v0, v4, v5}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v2, v3}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 59
    .line 60
    .line 61
    if-nez v1, :cond_0

    .line 62
    .line 63
    iget v3, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->s:I

    .line 64
    .line 65
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 66
    .line 67
    .line 68
    iget v3, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->v:F

    .line 69
    .line 70
    invoke-virtual {v2, v0, v3}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 71
    .line 72
    .line 73
    goto :goto_1

    .line 74
    :cond_0
    iget v3, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->t:I

    .line 75
    .line 76
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 77
    .line 78
    .line 79
    iget v3, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->u:F

    .line 80
    .line 81
    invoke-virtual {v2, v0, v3}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 82
    .line 83
    .line 84
    :goto_1
    invoke-virtual {v2, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 85
    .line 86
    .line 87
    iget-object v3, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->d:[Landroid/widget/TextView;

    .line 88
    .line 89
    aput-object v2, v3, v1

    .line 90
    .line 91
    iget-object v3, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->c:Landroid/widget/LinearLayout;

    .line 92
    .line 93
    invoke-virtual {v3, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 94
    .line 95
    .line 96
    array-length v2, p1

    .line 97
    add-int/lit8 v2, v2, -0x1

    .line 98
    .line 99
    if-eq v1, v2, :cond_1

    .line 100
    .line 101
    new-instance v2, Landroid/view/View;

    .line 102
    .line 103
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 104
    .line 105
    .line 106
    move-result-object v3

    .line 107
    invoke-direct {v2, v3}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 108
    .line 109
    .line 110
    iget v3, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->r:I

    .line 111
    .line 112
    invoke-virtual {v2, v3}, Landroid/view/View;->setBackgroundColor(I)V

    .line 113
    .line 114
    .line 115
    new-instance v3, Landroidx/appcompat/widget/LinearLayoutCompat$LayoutParams;

    .line 116
    .line 117
    iget v4, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->p:I

    .line 118
    .line 119
    iget v5, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->q:I

    .line 120
    .line 121
    invoke-direct {v3, v4, v5}, Landroidx/appcompat/widget/LinearLayoutCompat$LayoutParams;-><init>(II)V

    .line 122
    .line 123
    .line 124
    invoke-virtual {v2, v3}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 125
    .line 126
    .line 127
    iget-object v3, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->c:Landroid/widget/LinearLayout;

    .line 128
    .line 129
    invoke-virtual {v3, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 130
    .line 131
    .line 132
    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 133
    .line 134
    goto :goto_0

    .line 135
    :cond_2
    invoke-virtual {p0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 136
    .line 137
    .line 138
    iget-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->c:Landroid/widget/LinearLayout;

    .line 139
    .line 140
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 141
    .line 142
    .line 143
    iget-boolean p1, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->i:Z

    .line 144
    .line 145
    const/4 v0, -0x1

    .line 146
    if-eqz p1, :cond_6

    .line 147
    .line 148
    new-instance p1, Landroid/widget/LinearLayout;

    .line 149
    .line 150
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 151
    .line 152
    .line 153
    move-result-object v1

    .line 154
    invoke-direct {p1, v1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 155
    .line 156
    .line 157
    iput-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->a:Landroid/widget/LinearLayout;

    .line 158
    .line 159
    invoke-virtual {p1, v3}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 160
    .line 161
    .line 162
    iget p1, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->h:I

    .line 163
    .line 164
    if-lez p1, :cond_3

    .line 165
    .line 166
    iget-object v1, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->d:[Landroid/widget/TextView;

    .line 167
    .line 168
    array-length v1, v1

    .line 169
    :goto_2
    div-int/2addr p1, v1

    .line 170
    goto :goto_3

    .line 171
    :cond_3
    iget p1, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->e:I

    .line 172
    .line 173
    iget-object v1, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->d:[Landroid/widget/TextView;

    .line 174
    .line 175
    array-length v1, v1

    .line 176
    goto :goto_2

    .line 177
    :goto_3
    iget-object v1, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->a:Landroid/widget/LinearLayout;

    .line 178
    .line 179
    new-instance v2, Landroidx/appcompat/widget/LinearLayoutCompat$LayoutParams;

    .line 180
    .line 181
    iget v3, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->j:I

    .line 182
    .line 183
    invoke-direct {v2, p1, v3}, Landroidx/appcompat/widget/LinearLayoutCompat$LayoutParams;-><init>(II)V

    .line 184
    .line 185
    .line 186
    invoke-virtual {v1, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 187
    .line 188
    .line 189
    new-instance p1, Landroid/view/View;

    .line 190
    .line 191
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 192
    .line 193
    .line 194
    move-result-object v1

    .line 195
    invoke-direct {p1, v1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 196
    .line 197
    .line 198
    new-instance v1, Landroidx/appcompat/widget/LinearLayoutCompat$LayoutParams;

    .line 199
    .line 200
    iget v2, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->k:I

    .line 201
    .line 202
    if-lez v2, :cond_4

    .line 203
    .line 204
    goto :goto_4

    .line 205
    :cond_4
    move v2, v0

    .line 206
    :goto_4
    invoke-direct {v1, v2, v0}, Landroidx/appcompat/widget/LinearLayoutCompat$LayoutParams;-><init>(II)V

    .line 207
    .line 208
    .line 209
    invoke-virtual {p1, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 210
    .line 211
    .line 212
    iget-object v1, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->m:Landroid/graphics/drawable/Drawable;

    .line 213
    .line 214
    if-eqz v1, :cond_5

    .line 215
    .line 216
    invoke-virtual {p1, v1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 217
    .line 218
    .line 219
    goto :goto_5

    .line 220
    :cond_5
    iget v1, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->l:I

    .line 221
    .line 222
    invoke-virtual {p1, v1}, Landroid/view/View;->setBackgroundColor(I)V

    .line 223
    .line 224
    .line 225
    :goto_5
    iget-object v1, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->a:Landroid/widget/LinearLayout;

    .line 226
    .line 227
    invoke-virtual {v1, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 228
    .line 229
    .line 230
    iget-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->a:Landroid/widget/LinearLayout;

    .line 231
    .line 232
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 233
    .line 234
    .line 235
    iget p1, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->h:I

    .line 236
    .line 237
    if-lez p1, :cond_6

    .line 238
    .line 239
    iget-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->a:Landroid/widget/LinearLayout;

    .line 240
    .line 241
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 242
    .line 243
    .line 244
    move-result-object p1

    .line 245
    check-cast p1, Landroid/widget/LinearLayout$LayoutParams;

    .line 246
    .line 247
    iget v1, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->e:I

    .line 248
    .line 249
    iget v2, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->h:I

    .line 250
    .line 251
    sub-int/2addr v1, v2

    .line 252
    div-int/lit8 v1, v1, 0x2

    .line 253
    .line 254
    invoke-virtual {p1, v1}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginStart(I)V

    .line 255
    .line 256
    .line 257
    iget-object v1, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->a:Landroid/widget/LinearLayout;

    .line 258
    .line 259
    invoke-virtual {v1, p1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 260
    .line 261
    .line 262
    :cond_6
    new-instance p1, Landroid/view/View;

    .line 263
    .line 264
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 265
    .line 266
    .line 267
    move-result-object v1

    .line 268
    invoke-direct {p1, v1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 269
    .line 270
    .line 271
    new-instance v1, Landroidx/appcompat/widget/LinearLayoutCompat$LayoutParams;

    .line 272
    .line 273
    iget v2, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->n:I

    .line 274
    .line 275
    invoke-direct {v1, v0, v2}, Landroidx/appcompat/widget/LinearLayoutCompat$LayoutParams;-><init>(II)V

    .line 276
    .line 277
    .line 278
    invoke-virtual {p1, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 279
    .line 280
    .line 281
    iget v0, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->o:I

    .line 282
    .line 283
    invoke-virtual {p1, v0}, Landroid/view/View;->setBackgroundColor(I)V

    .line 284
    .line 285
    .line 286
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 287
    .line 288
    .line 289
    return-void
.end method

.method public setTypeface(Landroid/graphics/Typeface;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->d:[Landroid/widget/TextView;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    array-length v1, v0

    .line 6
    const/4 v2, 0x0

    .line 7
    :goto_0
    if-ge v2, v1, :cond_0

    .line 8
    .line 9
    aget-object v3, v0, v2

    .line 10
    .line 11
    invoke-virtual {v3, p1}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 12
    .line 13
    .line 14
    add-int/lit8 v2, v2, 0x1

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    return-void
.end method

.method public setViewPager(Landroidx/viewpager/widget/PagerAdapter;)V
    .locals 3

    .line 1
    new-instance v0, Landroidx/viewpager/widget/ViewPager;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-direct {v0, v1}, Landroidx/viewpager/widget/ViewPager;-><init>(Landroid/content/Context;)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->b:Landroidx/viewpager/widget/ViewPager;

    .line 11
    .line 12
    sget v1, Lcom/xuexiang/xui/R$id;->view_pager:I

    .line 13
    .line 14
    invoke-virtual {v0, v1}, Landroid/view/View;->setId(I)V

    .line 15
    .line 16
    .line 17
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->b:Landroidx/viewpager/widget/ViewPager;

    .line 18
    .line 19
    new-instance v1, Landroidx/appcompat/widget/LinearLayoutCompat$LayoutParams;

    .line 20
    .line 21
    const/4 v2, -0x1

    .line 22
    invoke-direct {v1, v2, v2}, Landroidx/appcompat/widget/LinearLayoutCompat$LayoutParams;-><init>(II)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 26
    .line 27
    .line 28
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->b:Landroidx/viewpager/widget/ViewPager;

    .line 29
    .line 30
    invoke-virtual {v0, p1}, Landroidx/viewpager/widget/ViewPager;->setAdapter(Landroidx/viewpager/widget/PagerAdapter;)V

    .line 31
    .line 32
    .line 33
    iget-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->b:Landroidx/viewpager/widget/ViewPager;

    .line 34
    .line 35
    const/4 v0, 0x0

    .line 36
    invoke-virtual {p1, v0}, Landroidx/viewpager/widget/ViewPager;->setCurrentItem(I)V

    .line 37
    .line 38
    .line 39
    iget-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->b:Landroidx/viewpager/widget/ViewPager;

    .line 40
    .line 41
    invoke-virtual {p1, p0}, Landroidx/viewpager/widget/ViewPager;->addOnPageChangeListener(Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;)V

    .line 42
    .line 43
    .line 44
    iget-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/EasyIndicator;->b:Landroidx/viewpager/widget/ViewPager;

    .line 45
    .line 46
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 47
    .line 48
    .line 49
    return-void
.end method
