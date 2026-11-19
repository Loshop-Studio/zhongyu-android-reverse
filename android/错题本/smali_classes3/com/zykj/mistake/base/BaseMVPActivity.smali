.class public abstract Lcom/zykj/mistake/base/BaseMVPActivity;
.super Lcom/zykj/mistake/base/BaseActivity;
.source "SourceFile"

# interfaces
.implements Li4/b;


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<P::",
        "Lcom/zykj/mistake/base/BasePresenter;",
        "T:",
        "Landroidx/databinding/ViewDataBinding;",
        ">",
        "Lcom/zykj/mistake/base/BaseActivity<",
        "TT;>;",
        "Li4/b;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\'\u0018\u0000*\u0008\u0008\u0000\u0010\u0002*\u00020\u0001*\u0008\u0008\u0001\u0010\u0004*\u00020\u00032\u0008\u0012\u0004\u0012\u00028\u00010\u00052\u00020\u0006B\u0007\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\t"
    }
    d2 = {
        "Lcom/zykj/mistake/base/BaseMVPActivity;",
        "Lcom/zykj/mistake/base/BasePresenter;",
        "P",
        "Landroidx/databinding/ViewDataBinding;",
        "T",
        "Lcom/zykj/mistake/base/BaseActivity;",
        "Li4/b;",
        "<init>",
        "()V",
        "app_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public b:Lcom/zykj/mistake/base/BasePresenter;

.field public c:Landroid/widget/FrameLayout;

.field public d:Lcom/zykj/mistake/base/BaseMVPActivity$showLoading$1;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/zykj/mistake/base/BaseActivity;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/String;)V
    .locals 3

    .line 1
    const-string v0, "tip"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-lez v0, :cond_1

    .line 11
    .line 12
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    const-string v1, "getApplicationContext(...)"

    .line 17
    .line 18
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    sget-object v1, Lcom/zykj/mistake/utils/d;->e:Landroid/widget/Toast;

    .line 22
    .line 23
    if-nez v1, :cond_0

    .line 24
    .line 25
    const/4 v1, 0x0

    .line 26
    invoke-static {v0, p1, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    const/16 v0, 0x51

    .line 31
    .line 32
    const/16 v2, 0xdc

    .line 33
    .line 34
    invoke-virtual {p1, v0, v1, v2}, Landroid/widget/Toast;->setGravity(III)V

    .line 35
    .line 36
    .line 37
    sput-object p1, Lcom/zykj/mistake/utils/d;->e:Landroid/widget/Toast;

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    invoke-virtual {v1, p1}, Landroid/widget/Toast;->setText(Ljava/lang/CharSequence;)V

    .line 41
    .line 42
    .line 43
    :goto_0
    sget-object p1, Lcom/zykj/mistake/utils/d;->e:Landroid/widget/Toast;

    .line 44
    .line 45
    invoke-static {p1}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    .line 49
    .line 50
    .line 51
    :cond_1
    return-void
.end method

.method public final c()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/zykj/mistake/base/BaseMVPActivity;->c:Landroid/widget/FrameLayout;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 7
    .line 8
    .line 9
    move-result-object v2

    .line 10
    instance-of v3, v2, Landroid/view/ViewGroup;

    .line 11
    .line 12
    if-eqz v3, :cond_0

    .line 13
    .line 14
    check-cast v2, Landroid/view/ViewGroup;

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    move-object v2, v1

    .line 18
    :goto_0
    if-eqz v2, :cond_1

    .line 19
    .line 20
    invoke-virtual {v2, v0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 21
    .line 22
    .line 23
    :cond_1
    iput-object v1, p0, Lcom/zykj/mistake/base/BaseMVPActivity;->c:Landroid/widget/FrameLayout;

    .line 24
    .line 25
    iget-object v0, p0, Lcom/zykj/mistake/base/BaseMVPActivity;->d:Lcom/zykj/mistake/base/BaseMVPActivity$showLoading$1;

    .line 26
    .line 27
    if-eqz v0, :cond_2

    .line 28
    .line 29
    invoke-virtual {v0}, Landroidx/activity/OnBackPressedCallback;->remove()V

    .line 30
    .line 31
    .line 32
    :cond_2
    iput-object v1, p0, Lcom/zykj/mistake/base/BaseMVPActivity;->d:Lcom/zykj/mistake/base/BaseMVPActivity$showLoading$1;

    .line 33
    .line 34
    return-void
.end method

.method public final d(Z)V
    .locals 9

    .line 1
    invoke-virtual {p0}, Lcom/zykj/mistake/base/BaseMVPActivity;->c()V

    .line 2
    .line 3
    .line 4
    const v0, 0x1020002

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Landroid/view/ViewGroup;

    .line 12
    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    invoke-virtual {p0}, Landroidx/appcompat/app/AppCompatActivity;->getResources()Landroid/content/res/Resources;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    iget v1, v1, Landroid/util/DisplayMetrics;->density:F

    .line 25
    .line 26
    const/16 v2, 0x1c

    .line 27
    .line 28
    int-to-float v2, v2

    .line 29
    mul-float/2addr v2, v1

    .line 30
    invoke-static {v2}, Lt6/a;->q(F)I

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    const/16 v3, 0x14

    .line 35
    .line 36
    int-to-float v3, v3

    .line 37
    mul-float/2addr v3, v1

    .line 38
    invoke-static {v3}, Lt6/a;->q(F)I

    .line 39
    .line 40
    .line 41
    move-result v3

    .line 42
    const/16 v4, 0xe

    .line 43
    .line 44
    int-to-float v4, v4

    .line 45
    mul-float/2addr v4, v1

    .line 46
    invoke-static {v4}, Lt6/a;->q(F)I

    .line 47
    .line 48
    .line 49
    move-result v4

    .line 50
    const/16 v5, 0xc

    .line 51
    .line 52
    int-to-float v5, v5

    .line 53
    mul-float/2addr v5, v1

    .line 54
    invoke-static {v5}, Lt6/a;->q(F)I

    .line 55
    .line 56
    .line 57
    move-result v5

    .line 58
    new-instance v6, Landroid/widget/LinearLayout;

    .line 59
    .line 60
    invoke-direct {v6, p0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 61
    .line 62
    .line 63
    const/4 v7, 0x0

    .line 64
    invoke-virtual {v6, v7}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 65
    .line 66
    .line 67
    const/16 v8, 0x10

    .line 68
    .line 69
    invoke-virtual {v6, v8}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {v6, v3, v4, v3, v4}, Landroid/view/View;->setPadding(IIII)V

    .line 73
    .line 74
    .line 75
    sget v3, Lcom/zykj/mistake/R$drawable;->bg_white_corner_4:I

    .line 76
    .line 77
    invoke-virtual {v6, v3}, Landroid/view/View;->setBackgroundResource(I)V

    .line 78
    .line 79
    .line 80
    const/16 v3, 0x8

    .line 81
    .line 82
    int-to-float v3, v3

    .line 83
    mul-float/2addr v3, v1

    .line 84
    invoke-virtual {v6, v3}, Landroid/view/View;->setElevation(F)V

    .line 85
    .line 86
    .line 87
    new-instance v1, Landroid/widget/ProgressBar;

    .line 88
    .line 89
    invoke-direct {v1, p0}, Landroid/widget/ProgressBar;-><init>(Landroid/content/Context;)V

    .line 90
    .line 91
    .line 92
    new-instance v3, Landroid/widget/LinearLayout$LayoutParams;

    .line 93
    .line 94
    invoke-direct {v3, v2, v2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {v6, v1, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 98
    .line 99
    .line 100
    new-instance v1, Landroid/widget/TextView;

    .line 101
    .line 102
    invoke-direct {v1, p0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 103
    .line 104
    .line 105
    const-string v2, "\u8bf7\u7a0d\u5019\u3002\u3002"

    .line 106
    .line 107
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 108
    .line 109
    .line 110
    const v2, -0xbbbbbc

    .line 111
    .line 112
    .line 113
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 114
    .line 115
    .line 116
    const/high16 v2, 0x41600000    # 14.0f

    .line 117
    .line 118
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setTextSize(F)V

    .line 119
    .line 120
    .line 121
    new-instance v2, Landroid/widget/LinearLayout$LayoutParams;

    .line 122
    .line 123
    const/4 v3, -0x2

    .line 124
    invoke-direct {v2, v3, v3}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 125
    .line 126
    .line 127
    invoke-virtual {v2, v5}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginStart(I)V

    .line 128
    .line 129
    .line 130
    invoke-virtual {v6, v1, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 131
    .line 132
    .line 133
    new-instance v1, Landroid/widget/FrameLayout;

    .line 134
    .line 135
    invoke-direct {v1, p0}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 136
    .line 137
    .line 138
    const/16 v2, 0x33

    .line 139
    .line 140
    invoke-static {v2, v7, v7, v7}, Landroid/graphics/Color;->argb(IIII)I

    .line 141
    .line 142
    .line 143
    move-result v2

    .line 144
    invoke-virtual {v1, v2}, Landroid/view/View;->setBackgroundColor(I)V

    .line 145
    .line 146
    .line 147
    const/4 v2, 0x1

    .line 148
    invoke-virtual {v1, v2}, Landroid/view/View;->setClickable(Z)V

    .line 149
    .line 150
    .line 151
    invoke-virtual {v1, v2}, Landroid/view/View;->setFocusable(Z)V

    .line 152
    .line 153
    .line 154
    new-instance v2, Landroid/widget/FrameLayout$LayoutParams;

    .line 155
    .line 156
    const/16 v4, 0x11

    .line 157
    .line 158
    invoke-direct {v2, v3, v3, v4}, Landroid/widget/FrameLayout$LayoutParams;-><init>(III)V

    .line 159
    .line 160
    .line 161
    invoke-virtual {v1, v6, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 162
    .line 163
    .line 164
    new-instance v2, Landroid/view/ViewGroup$LayoutParams;

    .line 165
    .line 166
    const/4 v3, -0x1

    .line 167
    invoke-direct {v2, v3, v3}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 168
    .line 169
    .line 170
    invoke-virtual {v0, v1, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 171
    .line 172
    .line 173
    iput-object v1, p0, Lcom/zykj/mistake/base/BaseMVPActivity;->c:Landroid/widget/FrameLayout;

    .line 174
    .line 175
    new-instance v0, Lcom/zykj/mistake/base/BaseMVPActivity$showLoading$1;

    .line 176
    .line 177
    invoke-direct {v0, p1, p0}, Lcom/zykj/mistake/base/BaseMVPActivity$showLoading$1;-><init>(ZLcom/zykj/mistake/base/BaseMVPActivity;)V

    .line 178
    .line 179
    .line 180
    invoke-virtual {p0}, Landroidx/activity/ComponentActivity;->getOnBackPressedDispatcher()Landroidx/activity/OnBackPressedDispatcher;

    .line 181
    .line 182
    .line 183
    move-result-object p1

    .line 184
    invoke-virtual {p1, p0, v0}, Landroidx/activity/OnBackPressedDispatcher;->addCallback(Landroidx/lifecycle/LifecycleOwner;Landroidx/activity/OnBackPressedCallback;)V

    .line 185
    .line 186
    .line 187
    iput-object v0, p0, Lcom/zykj/mistake/base/BaseMVPActivity;->d:Lcom/zykj/mistake/base/BaseMVPActivity$showLoading$1;

    .line 188
    .line 189
    return-void
.end method

.method public final onCreate(Landroid/os/Bundle;)V
    .locals 2

    .line 1
    invoke-super {p0, p1}, Lcom/zykj/mistake/base/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    const/4 v0, -0x1

    .line 9
    invoke-virtual {p1, v0}, Landroid/view/Window;->setStatusBarColor(I)V

    .line 10
    .line 11
    .line 12
    new-instance p1, Landroidx/core/view/WindowInsetsControllerCompat;

    .line 13
    .line 14
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-virtual {v1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-direct {p1, v0, v1}, Landroidx/core/view/WindowInsetsControllerCompat;-><init>(Landroid/view/Window;Landroid/view/View;)V

    .line 27
    .line 28
    .line 29
    const/4 v0, 0x1

    .line 30
    invoke-virtual {p1, v0}, Landroidx/core/view/WindowInsetsControllerCompat;->setAppearanceLightStatusBars(Z)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0}, Lcom/zykj/mistake/base/BaseMVPActivity;->s()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    const/4 v0, 0x0

    .line 38
    invoke-virtual {p1, v0}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    invoke-virtual {p1, v0}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    const-string v0, "newInstance(...)"

    .line 47
    .line 48
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    check-cast p1, Lcom/zykj/mistake/base/BasePresenter;

    .line 52
    .line 53
    iput-object p1, p0, Lcom/zykj/mistake/base/BaseMVPActivity;->b:Lcom/zykj/mistake/base/BasePresenter;

    .line 54
    .line 55
    invoke-virtual {p0}, Lcom/zykj/mistake/base/BaseMVPActivity;->r()Lcom/zykj/mistake/base/BasePresenter;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    iput-object p0, p1, Lcom/zykj/mistake/base/BasePresenter;->c:Ljava/lang/Object;

    .line 60
    .line 61
    invoke-virtual {p0}, Lcom/zykj/mistake/base/BaseMVPActivity;->t()V

    .line 62
    .line 63
    .line 64
    return-void
.end method

.method public onDestroy()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/zykj/mistake/base/BaseMVPActivity;->c()V

    .line 2
    .line 3
    .line 4
    invoke-super {p0}, Landroidx/appcompat/app/AppCompatActivity;->onDestroy()V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/zykj/mistake/base/BaseMVPActivity;->r()Lcom/zykj/mistake/base/BasePresenter;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iget-object v1, v0, Lcom/zykj/mistake/base/BasePresenter;->c:Ljava/lang/Object;

    .line 12
    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    invoke-interface {v1}, Li4/b;->c()V

    .line 16
    .line 17
    .line 18
    :cond_0
    const/4 v1, 0x0

    .line 19
    iput-object v1, v0, Lcom/zykj/mistake/base/BasePresenter;->c:Ljava/lang/Object;

    .line 20
    .line 21
    iget-object v2, v0, Lcom/zykj/mistake/base/BasePresenter;->b:Ls5/a;

    .line 22
    .line 23
    if-eqz v2, :cond_1

    .line 24
    .line 25
    invoke-virtual {v2}, Ls5/a;->dispose()V

    .line 26
    .line 27
    .line 28
    :cond_1
    iput-object v1, v0, Lcom/zykj/mistake/base/BasePresenter;->b:Ls5/a;

    .line 29
    .line 30
    return-void
.end method

.method public final r()Lcom/zykj/mistake/base/BasePresenter;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/mistake/base/BaseMVPActivity;->b:Lcom/zykj/mistake/base/BasePresenter;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    const-string v0, "mPresenter"

    .line 7
    .line 8
    invoke-static {v0}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    throw v0
.end method

.method public abstract s()Ljava/lang/Class;
.end method

.method public abstract t()V
.end method
