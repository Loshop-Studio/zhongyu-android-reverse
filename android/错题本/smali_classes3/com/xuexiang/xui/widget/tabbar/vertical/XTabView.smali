.class public Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;
.super Lcom/xuexiang/xui/widget/tabbar/vertical/TabView;
.source "SourceFile"


# instance fields
.field public final a:Landroid/widget/TextView;

.field public b:Lcom/xuexiang/xui/widget/tabbar/vertical/TabBadgeView;

.field public c:Lq3/b;

.field public d:Lq3/c;

.field public e:Lq3/a;

.field public f:Z

.field public final g:Landroid/graphics/drawable/Drawable;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 3

    .line 1
    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/tabbar/vertical/TabView;-><init>(Landroid/content/Context;)V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lio/reactivex/internal/operators/observable/g;

    .line 5
    .line 6
    const/16 v1, 0x8

    .line 7
    .line 8
    invoke-direct {v0, v1}, Lio/reactivex/internal/operators/observable/g;-><init>(I)V

    .line 9
    .line 10
    .line 11
    new-instance v1, Lq3/b;

    .line 12
    .line 13
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, v1, Lq3/b;->a:Lio/reactivex/internal/operators/observable/g;

    .line 17
    .line 18
    iput-object v1, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;->c:Lq3/b;

    .line 19
    .line 20
    new-instance v0, Le7/r;

    .line 21
    .line 22
    const/4 v1, 0x2

    .line 23
    invoke-direct {v0, v1}, Le7/r;-><init>(I)V

    .line 24
    .line 25
    .line 26
    new-instance v1, Lq3/c;

    .line 27
    .line 28
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 29
    .line 30
    .line 31
    iput-object v0, v1, Lq3/c;->a:Le7/r;

    .line 32
    .line 33
    iput-object v1, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;->d:Lq3/c;

    .line 34
    .line 35
    new-instance v0, Lq3/a;

    .line 36
    .line 37
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 38
    .line 39
    .line 40
    iput-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;->e:Lq3/a;

    .line 41
    .line 42
    const/high16 v0, 0x41c80000    # 25.0f

    .line 43
    .line 44
    invoke-static {p1, v0}, Lh4/a;->h(Landroid/content/Context;F)I

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    invoke-virtual {p0, v0}, Landroid/view/View;->setMinimumHeight(I)V

    .line 49
    .line 50
    .line 51
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;->a:Landroid/widget/TextView;

    .line 52
    .line 53
    if-nez v0, :cond_0

    .line 54
    .line 55
    new-instance v0, Landroid/widget/TextView;

    .line 56
    .line 57
    invoke-direct {v0, p1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 58
    .line 59
    .line 60
    iput-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;->a:Landroid/widget/TextView;

    .line 61
    .line 62
    new-instance v0, Landroid/widget/FrameLayout$LayoutParams;

    .line 63
    .line 64
    const/4 v1, -0x2

    .line 65
    const/4 v2, -0x1

    .line 66
    invoke-direct {v0, v1, v2}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 67
    .line 68
    .line 69
    const/16 v1, 0x11

    .line 70
    .line 71
    iput v1, v0, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    .line 72
    .line 73
    iget-object v1, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;->a:Landroid/widget/TextView;

    .line 74
    .line 75
    invoke-virtual {v1, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 76
    .line 77
    .line 78
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;->a:Landroid/widget/TextView;

    .line 79
    .line 80
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 81
    .line 82
    .line 83
    :cond_0
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;->c()V

    .line 84
    .line 85
    .line 86
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;->b()V

    .line 87
    .line 88
    .line 89
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;->a()V

    .line 90
    .line 91
    .line 92
    const v0, 0x101045c

    .line 93
    .line 94
    .line 95
    filled-new-array {v0}, [I

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    invoke-virtual {p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    invoke-virtual {p1, v0}, Landroid/content/res/Resources$Theme;->obtainStyledAttributes([I)Landroid/content/res/TypedArray;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    const/4 v0, 0x0

    .line 108
    invoke-virtual {p1, v0}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    iput-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;->g:Landroid/graphics/drawable/Drawable;

    .line 113
    .line 114
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 115
    .line 116
    .line 117
    invoke-virtual {p0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    .line 118
    .line 119
    .line 120
    move-result-object p1

    .line 121
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;->g:Landroid/graphics/drawable/Drawable;

    .line 122
    .line 123
    if-eq p1, v0, :cond_1

    .line 124
    .line 125
    invoke-virtual {p0, v0}, Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 126
    .line 127
    .line 128
    :cond_1
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    if-ge v0, v1, :cond_1

    .line 7
    .line 8
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    instance-of v2, v1, Lcom/xuexiang/xui/widget/tabbar/vertical/TabBadgeView;

    .line 13
    .line 14
    if-eqz v2, :cond_0

    .line 15
    .line 16
    check-cast v1, Lcom/xuexiang/xui/widget/tabbar/vertical/TabBadgeView;

    .line 17
    .line 18
    goto :goto_1

    .line 19
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_1
    const/4 v1, 0x0

    .line 23
    :goto_1
    if-nez v1, :cond_2

    .line 24
    .line 25
    new-instance v1, Lcom/xuexiang/xui/widget/tabbar/vertical/TabBadgeView;

    .line 26
    .line 27
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-direct {v1, v0}, Lcom/xuexiang/xui/widget/textview/badge/BadgeView;-><init>(Landroid/content/Context;)V

    .line 32
    .line 33
    .line 34
    new-instance v0, Landroid/widget/FrameLayout$LayoutParams;

    .line 35
    .line 36
    const/4 v2, -0x1

    .line 37
    invoke-direct {v0, v2, v2}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {p0, v1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 41
    .line 42
    .line 43
    :cond_2
    iput-object p0, v1, Lcom/xuexiang/xui/widget/textview/badge/BadgeView;->s:Landroid/view/View;

    .line 44
    .line 45
    iput-object v1, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;->b:Lcom/xuexiang/xui/widget/tabbar/vertical/TabBadgeView;

    .line 46
    .line 47
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;->e:Lq3/a;

    .line 48
    .line 49
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;->e:Lq3/a;

    .line 53
    .line 54
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;->e:Lq3/a;

    .line 58
    .line 59
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;->e:Lq3/a;

    .line 63
    .line 64
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 65
    .line 66
    .line 67
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;->e:Lq3/a;

    .line 68
    .line 69
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 70
    .line 71
    .line 72
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;->e:Lq3/a;

    .line 73
    .line 74
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 75
    .line 76
    .line 77
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;->e:Lq3/a;

    .line 78
    .line 79
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 80
    .line 81
    .line 82
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;->e:Lq3/a;

    .line 83
    .line 84
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 85
    .line 86
    .line 87
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;->e:Lq3/a;

    .line 88
    .line 89
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 90
    .line 91
    .line 92
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;->e:Lq3/a;

    .line 93
    .line 94
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 95
    .line 96
    .line 97
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;->e:Lq3/a;

    .line 98
    .line 99
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 100
    .line 101
    .line 102
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;->e:Lq3/a;

    .line 103
    .line 104
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 105
    .line 106
    .line 107
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;->e:Lq3/a;

    .line 108
    .line 109
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 110
    .line 111
    .line 112
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;->e:Lq3/a;

    .line 113
    .line 114
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 115
    .line 116
    .line 117
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;->e:Lq3/a;

    .line 118
    .line 119
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 120
    .line 121
    .line 122
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;->e:Lq3/a;

    .line 123
    .line 124
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 125
    .line 126
    .line 127
    return-void
.end method

.method public final b()V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;->f:Z

    .line 2
    .line 3
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;->c:Lq3/b;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;->c:Lq3/b;

    .line 9
    .line 10
    iget-object v0, v0, Lq3/b;->a:Lio/reactivex/internal/operators/observable/g;

    .line 11
    .line 12
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;->a:Landroid/widget/TextView;

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    invoke-virtual {v0, v1, v1, v1, v1}, Landroid/widget/TextView;->setCompoundDrawables(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    .line 16
    .line 17
    .line 18
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;->f:Z

    .line 19
    .line 20
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;->c:Lq3/b;

    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;->a:Landroid/widget/TextView;

    .line 26
    .line 27
    const/4 v1, 0x0

    .line 28
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setCompoundDrawablePadding(I)V

    .line 29
    .line 30
    .line 31
    return-void
.end method

.method public final c()V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;->f:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;->d:Lq3/c;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    const v0, -0xbf7f

    .line 11
    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;->d:Lq3/c;

    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    const v0, -0x8a8a8b

    .line 20
    .line 21
    .line 22
    :goto_0
    iget-object v1, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;->a:Landroid/widget/TextView;

    .line 23
    .line 24
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 25
    .line 26
    .line 27
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;->d:Lq3/c;

    .line 28
    .line 29
    iget-object v0, v0, Lq3/c;->a:Le7/r;

    .line 30
    .line 31
    const/16 v0, 0x10

    .line 32
    .line 33
    int-to-float v0, v0

    .line 34
    iget-object v1, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;->a:Landroid/widget/TextView;

    .line 35
    .line 36
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setTextSize(F)V

    .line 37
    .line 38
    .line 39
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;->d:Lq3/c;

    .line 40
    .line 41
    iget-object v0, v0, Lq3/c;->a:Le7/r;

    .line 42
    .line 43
    iget-object v0, v0, Le7/r;->b:Ljava/lang/String;

    .line 44
    .line 45
    iget-object v1, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;->a:Landroid/widget/TextView;

    .line 46
    .line 47
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 48
    .line 49
    .line 50
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;->a:Landroid/widget/TextView;

    .line 51
    .line 52
    const/16 v1, 0x11

    .line 53
    .line 54
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setGravity(I)V

    .line 55
    .line 56
    .line 57
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;->a:Landroid/widget/TextView;

    .line 58
    .line 59
    sget-object v1, Landroid/text/TextUtils$TruncateAt;->END:Landroid/text/TextUtils$TruncateAt;

    .line 60
    .line 61
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V

    .line 62
    .line 63
    .line 64
    invoke-static {}, Lt1/a;->b()V

    .line 65
    .line 66
    .line 67
    const/4 v0, 0x0

    .line 68
    iget-object v1, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;->a:Landroid/widget/TextView;

    .line 69
    .line 70
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 71
    .line 72
    .line 73
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;->f:Z

    .line 74
    .line 75
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;->c:Lq3/b;

    .line 76
    .line 77
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 78
    .line 79
    .line 80
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;->a:Landroid/widget/TextView;

    .line 81
    .line 82
    const/4 v1, 0x0

    .line 83
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setCompoundDrawablePadding(I)V

    .line 84
    .line 85
    .line 86
    return-void
.end method

.method public final d(I)V
    .locals 1

    .line 1
    if-nez p1, :cond_1

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;->g:Landroid/graphics/drawable/Drawable;

    .line 8
    .line 9
    if-eq p1, v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0, v0}, Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void

    .line 15
    :cond_1
    if-gtz p1, :cond_2

    .line 16
    .line 17
    const/4 p1, 0x0

    .line 18
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :cond_2
    invoke-super {p0, p1}, Landroid/view/View;->setBackgroundResource(I)V

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method public getBadge()Lq3/a;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;->e:Lq3/a;

    .line 2
    .line 3
    return-object v0
.end method

.method public getBadgeView()Lt3/a;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;->b:Lcom/xuexiang/xui/widget/tabbar/vertical/TabBadgeView;

    .line 2
    .line 3
    return-object v0
.end method

.method public getIcon()Lq3/b;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;->c:Lq3/b;

    .line 2
    .line 3
    return-object v0
.end method

.method public getIconView()Landroid/widget/ImageView;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const/4 v0, 0x0

    return-object v0
.end method

.method public getTitle()Lq3/c;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;->d:Lq3/c;

    .line 2
    .line 3
    return-object v0
.end method

.method public getTitleView()Landroid/widget/TextView;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;->a:Landroid/widget/TextView;

    .line 2
    .line 3
    return-object v0
.end method

.method public final isChecked()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;->f:Z

    .line 2
    .line 3
    return v0
.end method

.method public setBackground(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public setBackgroundResource(I)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;->d(I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public setChecked(Z)V
    .locals 1

    .line 1
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;->f:Z

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Landroid/view/View;->setSelected(Z)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Landroid/view/View;->refreshDrawableState()V

    .line 7
    .line 8
    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    iget-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;->d:Lq3/c;

    .line 12
    .line 13
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    const p1, -0xbf7f

    .line 17
    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    iget-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;->d:Lq3/c;

    .line 21
    .line 22
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    const p1, -0x8a8a8b

    .line 26
    .line 27
    .line 28
    :goto_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;->a:Landroid/widget/TextView;

    .line 29
    .line 30
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;->b()V

    .line 34
    .line 35
    .line 36
    return-void
.end method

.method public final setPadding(IIII)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;->a:Landroid/widget/TextView;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2, p3, p4}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final setPaddingRelative(IIII)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;->a:Landroid/widget/TextView;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2, p3, p4}, Landroid/widget/TextView;->setPaddingRelative(IIII)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final toggle()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;->f:Z

    .line 2
    .line 3
    xor-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    invoke-virtual {p0, v0}, Lcom/xuexiang/xui/widget/tabbar/vertical/XTabView;->setChecked(Z)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
