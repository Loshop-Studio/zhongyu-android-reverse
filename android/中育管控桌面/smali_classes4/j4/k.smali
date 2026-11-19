.class public final Lj4/k;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lj4/k$a;
    }
.end annotation


# static fields
.field public static final m:Lj4/k$a;

.field public static final n:I


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Landroid/view/WindowManager;

.field public final c:Lkotlin/jvm/functions/Function1;

.field public final d:Lkotlin/jvm/functions/Function0;

.field public e:Landroid/widget/FrameLayout;

.field public f:Lj4/a;

.field public g:I

.field public h:I

.field public i:Landroid/widget/LinearLayout;

.field public j:Landroid/widget/Button;

.field public k:Landroid/widget/Button;

.field public l:Landroid/graphics/Bitmap;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lj4/k$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lj4/k$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lj4/k;->m:Lj4/k$a;

    .line 8
    .line 9
    const/16 v0, 0x8

    .line 10
    .line 11
    sput v0, Lj4/k;->n:I

    .line 12
    .line 13
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/view/WindowManager;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V
    .locals 1

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "windowManager"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "onCroppedBitmapReady"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "onCropFlowCancelled"

    .line 17
    .line 18
    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    .line 23
    .line 24
    iput-object p1, p0, Lj4/k;->a:Landroid/content/Context;

    .line 25
    .line 26
    iput-object p2, p0, Lj4/k;->b:Landroid/view/WindowManager;

    .line 27
    .line 28
    iput-object p3, p0, Lj4/k;->c:Lkotlin/jvm/functions/Function1;

    .line 29
    .line 30
    iput-object p4, p0, Lj4/k;->d:Lkotlin/jvm/functions/Function0;

    .line 31
    .line 32
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    iget p2, p1, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 41
    .line 42
    iput p2, p0, Lj4/k;->g:I

    .line 43
    .line 44
    iget p1, p1, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 45
    .line 46
    iput p1, p0, Lj4/k;->h:I

    .line 47
    .line 48
    return-void
.end method

.method public static synthetic a(Lj4/k;Landroid/widget/Button;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lj4/k;->h(Lj4/k;Landroid/widget/Button;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic b(Lj4/k;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lj4/k;->k(Lj4/k;)V

    return-void
.end method

.method public static synthetic c(Lj4/k;Landroid/graphics/Rect;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lj4/k;->j(Lj4/k;Landroid/graphics/Rect;)V

    return-void
.end method

.method public static synthetic d(Lj4/k;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lj4/k;->l(Lj4/k;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic e(Lj4/k;Landroid/graphics/Rect;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lj4/k;->i(Lj4/k;Landroid/graphics/Rect;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final h(Lj4/k;Landroid/widget/Button;Landroid/view/View;)V
    .locals 1

    .line 1
    iget-object p2, p0, Lj4/k;->f:Lj4/a;

    .line 2
    .line 3
    if-eqz p2, :cond_0

    .line 4
    .line 5
    invoke-virtual {p2}, Lj4/a;->getCroppedBitmap()Landroid/graphics/Bitmap;

    .line 6
    .line 7
    .line 8
    move-result-object p2

    .line 9
    if-eqz p2, :cond_0

    .line 10
    .line 11
    iget-object p1, p0, Lj4/k;->c:Lkotlin/jvm/functions/Function1;

    .line 12
    .line 13
    invoke-interface {p1, p2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    const-string p2, "\u65e0\u6cd5\u83b7\u53d6\u88c1\u526a\u540e\u7684\u56fe\u7247\uff0c\u8bf7\u91cd\u8bd5\u3002"

    .line 22
    .line 23
    const/4 v0, 0x0

    .line 24
    invoke-static {p1, p2, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    .line 29
    .line 30
    .line 31
    :goto_0
    invoke-virtual {p0}, Lj4/k;->f()V

    .line 32
    .line 33
    .line 34
    return-void
.end method

.method public static final i(Lj4/k;Landroid/graphics/Rect;)Lkotlin/Unit;
    .locals 2

    .line 1
    const-string v0, "newCropRect"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    new-instance v0, Landroid/os/Handler;

    .line 10
    .line 11
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 16
    .line 17
    .line 18
    new-instance v1, Lj4/j;

    .line 19
    .line 20
    invoke-direct {v1, p0, p1}, Lj4/j;-><init>(Lj4/k;Landroid/graphics/Rect;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 24
    .line 25
    .line 26
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 27
    .line 28
    return-object p0
.end method

.method public static final j(Lj4/k;Landroid/graphics/Rect;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lj4/k;->m(Landroid/graphics/Rect;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final k(Lj4/k;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lj4/k;->f:Lj4/a;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lj4/a;->getCurrentCropRect()Landroid/graphics/Rect;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0, v0}, Lj4/k;->m(Landroid/graphics/Rect;)V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    const-string p0, "ScreenshotHelper"

    .line 16
    .line 17
    const-string v0, "\u521d\u59cb\u88c1\u526a\u6846\u672a\u5c31\u7eea\uff0c\u7b49\u5f85\u5e03\u5c40\u5b8c\u6210\u540e\u66f4\u65b0\u6309\u94ae\u4f4d\u7f6e\u3002"

    .line 18
    .line 19
    invoke-static {p0, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public static final l(Lj4/k;Landroid/view/View;)V
    .locals 0

    .line 1
    iget-object p1, p0, Lj4/k;->d:Lkotlin/jvm/functions/Function0;

    .line 2
    .line 3
    invoke-interface {p1}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lj4/k;->f()V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final f()V
    .locals 2

    .line 1
    iget-object v0, p0, Lj4/k;->e:Landroid/widget/FrameLayout;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    iget-object v1, p0, Lj4/k;->b:Landroid/view/WindowManager;

    .line 12
    .line 13
    invoke-interface {v1, v0}, Landroid/view/ViewManager;->removeView(Landroid/view/View;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    const/4 v0, 0x0

    .line 17
    iput-object v0, p0, Lj4/k;->e:Landroid/widget/FrameLayout;

    .line 18
    .line 19
    iput-object v0, p0, Lj4/k;->f:Lj4/a;

    .line 20
    .line 21
    iput-object v0, p0, Lj4/k;->j:Landroid/widget/Button;

    .line 22
    .line 23
    iput-object v0, p0, Lj4/k;->k:Landroid/widget/Button;

    .line 24
    .line 25
    iget-object v1, p0, Lj4/k;->l:Landroid/graphics/Bitmap;

    .line 26
    .line 27
    if-eqz v1, :cond_1

    .line 28
    .line 29
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->recycle()V

    .line 30
    .line 31
    .line 32
    :cond_1
    iput-object v0, p0, Lj4/k;->l:Landroid/graphics/Bitmap;

    .line 33
    .line 34
    return-void
.end method

.method public final g(Landroid/graphics/Bitmap;)V
    .locals 11

    .line 1
    const-string v0, "screenshotBitmap"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lj4/k;->l:Landroid/graphics/Bitmap;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V

    .line 11
    .line 12
    .line 13
    :cond_0
    iput-object p1, p0, Lj4/k;->l:Landroid/graphics/Bitmap;

    .line 14
    .line 15
    invoke-static {}, Lcom/blankj/utilcode/util/e;->b()I

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    invoke-static {}, Lcom/blankj/utilcode/util/e;->a()I

    .line 20
    .line 21
    .line 22
    new-instance v0, Landroid/graphics/Rect;

    .line 23
    .line 24
    iget v1, p0, Lj4/k;->g:I

    .line 25
    .line 26
    iget v2, p0, Lj4/k;->h:I

    .line 27
    .line 28
    const/4 v3, 0x0

    .line 29
    invoke-direct {v0, v3, p1, v1, v2}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 30
    .line 31
    .line 32
    iget-object p1, p0, Lj4/k;->e:Landroid/widget/FrameLayout;

    .line 33
    .line 34
    if-eqz p1, :cond_1

    .line 35
    .line 36
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    if-eqz v1, :cond_1

    .line 41
    .line 42
    iget-object v1, p0, Lj4/k;->b:Landroid/view/WindowManager;

    .line 43
    .line 44
    invoke-interface {v1, p1}, Landroid/view/ViewManager;->removeView(Landroid/view/View;)V

    .line 45
    .line 46
    .line 47
    :cond_1
    new-instance p1, Landroid/widget/FrameLayout;

    .line 48
    .line 49
    iget-object v1, p0, Lj4/k;->a:Landroid/content/Context;

    .line 50
    .line 51
    invoke-direct {p1, v1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {p1, v3}, Landroid/view/View;->setBackgroundColor(I)V

    .line 55
    .line 56
    .line 57
    new-instance v4, Landroid/view/WindowManager$LayoutParams;

    .line 58
    .line 59
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 60
    .line 61
    const/16 v2, 0x1a

    .line 62
    .line 63
    if-lt v1, v2, :cond_2

    .line 64
    .line 65
    const/16 v1, 0x7f6

    .line 66
    .line 67
    :goto_0
    move v7, v1

    .line 68
    goto :goto_1

    .line 69
    :cond_2
    const/16 v1, 0x7d2

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :goto_1
    const/16 v8, 0x700

    .line 73
    .line 74
    const/4 v9, -0x3

    .line 75
    const/4 v5, -0x1

    .line 76
    const/4 v6, -0x1

    .line 77
    invoke-direct/range {v4 .. v9}, Landroid/view/WindowManager$LayoutParams;-><init>(IIIII)V

    .line 78
    .line 79
    .line 80
    const v1, 0x800033

    .line 81
    .line 82
    .line 83
    iput v1, v4, Landroid/view/WindowManager$LayoutParams;->gravity:I

    .line 84
    .line 85
    invoke-virtual {p1, v4}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 86
    .line 87
    .line 88
    iput-object p1, p0, Lj4/k;->e:Landroid/widget/FrameLayout;

    .line 89
    .line 90
    new-instance v5, Lj4/a;

    .line 91
    .line 92
    iget-object v6, p0, Lj4/k;->a:Landroid/content/Context;

    .line 93
    .line 94
    const/4 v9, 0x6

    .line 95
    const/4 v10, 0x0

    .line 96
    const/4 v7, 0x0

    .line 97
    const/4 v8, 0x0

    .line 98
    invoke-direct/range {v5 .. v10}, Lj4/a;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 99
    .line 100
    .line 101
    iget-object p1, p0, Lj4/k;->l:Landroid/graphics/Bitmap;

    .line 102
    .line 103
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {v5, p1}, Lj4/a;->c(Landroid/graphics/Bitmap;)V

    .line 107
    .line 108
    .line 109
    invoke-virtual {v5, v0}, Lj4/a;->setContentBoundaries(Landroid/graphics/Rect;)V

    .line 110
    .line 111
    .line 112
    const p1, -0xea8901

    .line 113
    .line 114
    .line 115
    invoke-virtual {v5, p1}, Lj4/a;->setCropRectColor(I)V

    .line 116
    .line 117
    .line 118
    iput-object v5, p0, Lj4/k;->f:Lj4/a;

    .line 119
    .line 120
    iget-object p1, p0, Lj4/k;->e:Landroid/widget/FrameLayout;

    .line 121
    .line 122
    const/4 v0, -0x1

    .line 123
    if-eqz p1, :cond_3

    .line 124
    .line 125
    new-instance v1, Landroid/widget/FrameLayout$LayoutParams;

    .line 126
    .line 127
    invoke-direct {v1, v0, v0}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 128
    .line 129
    .line 130
    invoke-virtual {p1, v5, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 131
    .line 132
    .line 133
    :cond_3
    new-instance p1, Landroid/widget/LinearLayout;

    .line 134
    .line 135
    iget-object v1, p0, Lj4/k;->a:Landroid/content/Context;

    .line 136
    .line 137
    invoke-direct {p1, v1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 138
    .line 139
    .line 140
    invoke-virtual {p1, v3}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 141
    .line 142
    .line 143
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 144
    .line 145
    .line 146
    move-result-object v1

    .line 147
    const v2, 0x7f0800ab

    .line 148
    .line 149
    .line 150
    invoke-static {v1, v2}, Landroidx/core/content/ContextCompat;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 151
    .line 152
    .line 153
    move-result-object v1

    .line 154
    invoke-virtual {p1, v1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 155
    .line 156
    .line 157
    const/16 v1, 0x10

    .line 158
    .line 159
    invoke-virtual {p1, v1}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 160
    .line 161
    .line 162
    new-instance v1, Landroid/widget/FrameLayout$LayoutParams;

    .line 163
    .line 164
    const/4 v2, -0x2

    .line 165
    invoke-direct {v1, v2, v2}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 166
    .line 167
    .line 168
    invoke-virtual {p1, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 169
    .line 170
    .line 171
    iput-object p1, p0, Lj4/k;->i:Landroid/widget/LinearLayout;

    .line 172
    .line 173
    new-instance p1, Landroid/widget/Button;

    .line 174
    .line 175
    iget-object v1, p0, Lj4/k;->a:Landroid/content/Context;

    .line 176
    .line 177
    invoke-direct {p1, v1}, Landroid/widget/Button;-><init>(Landroid/content/Context;)V

    .line 178
    .line 179
    .line 180
    const-string v1, "\u53d6\u6d88"

    .line 181
    .line 182
    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 183
    .line 184
    .line 185
    const/high16 v1, 0x41600000    # 14.0f

    .line 186
    .line 187
    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setTextSize(F)V

    .line 188
    .line 189
    .line 190
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 191
    .line 192
    .line 193
    invoke-virtual {p1, v3}, Landroid/view/View;->setBackgroundColor(I)V

    .line 194
    .line 195
    .line 196
    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    .line 197
    .line 198
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 199
    .line 200
    .line 201
    move-result-object v2

    .line 202
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 203
    .line 204
    .line 205
    move-result-object v2

    .line 206
    const v4, 0x7f070c8f

    .line 207
    .line 208
    .line 209
    invoke-virtual {v2, v4}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 210
    .line 211
    .line 212
    move-result v2

    .line 213
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 214
    .line 215
    .line 216
    move-result-object v5

    .line 217
    invoke-virtual {v5}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 218
    .line 219
    .line 220
    move-result-object v5

    .line 221
    const v6, 0x7f070c0a

    .line 222
    .line 223
    .line 224
    invoke-virtual {v5, v6}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 225
    .line 226
    .line 227
    move-result v5

    .line 228
    invoke-direct {v0, v2, v5}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 229
    .line 230
    .line 231
    invoke-virtual {p1, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 232
    .line 233
    .line 234
    new-instance v0, Lj4/f;

    .line 235
    .line 236
    invoke-direct {v0, p0}, Lj4/f;-><init>(Lj4/k;)V

    .line 237
    .line 238
    .line 239
    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 240
    .line 241
    .line 242
    iput-object p1, p0, Lj4/k;->k:Landroid/widget/Button;

    .line 243
    .line 244
    new-instance p1, Landroid/view/View;

    .line 245
    .line 246
    iget-object v0, p0, Lj4/k;->a:Landroid/content/Context;

    .line 247
    .line 248
    invoke-direct {p1, v0}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 249
    .line 250
    .line 251
    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    .line 252
    .line 253
    const/high16 v2, 0x3f800000    # 1.0f

    .line 254
    .line 255
    invoke-static {v2}, Lcom/blankj/utilcode/util/g;->e(F)I

    .line 256
    .line 257
    .line 258
    move-result v2

    .line 259
    const/high16 v5, 0x41c00000    # 24.0f

    .line 260
    .line 261
    invoke-static {v5}, Lcom/blankj/utilcode/util/g;->e(F)I

    .line 262
    .line 263
    .line 264
    move-result v5

    .line 265
    invoke-direct {v0, v2, v5}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 266
    .line 267
    .line 268
    invoke-virtual {p1, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 269
    .line 270
    .line 271
    const-string v0, "#33FFFFFF"

    .line 272
    .line 273
    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 274
    .line 275
    .line 276
    move-result v0

    .line 277
    invoke-virtual {p1, v0}, Landroid/view/View;->setBackgroundColor(I)V

    .line 278
    .line 279
    .line 280
    new-instance v0, Landroid/widget/Button;

    .line 281
    .line 282
    iget-object v2, p0, Lj4/k;->a:Landroid/content/Context;

    .line 283
    .line 284
    invoke-direct {v0, v2}, Landroid/widget/Button;-><init>(Landroid/content/Context;)V

    .line 285
    .line 286
    .line 287
    const-string v2, "\u786e\u5b9a"

    .line 288
    .line 289
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 290
    .line 291
    .line 292
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextSize(F)V

    .line 293
    .line 294
    .line 295
    const-string v1, "#FFFFFF"

    .line 296
    .line 297
    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 298
    .line 299
    .line 300
    move-result v1

    .line 301
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 302
    .line 303
    .line 304
    invoke-virtual {v0, v3}, Landroid/view/View;->setBackgroundColor(I)V

    .line 305
    .line 306
    .line 307
    new-instance v1, Landroid/widget/LinearLayout$LayoutParams;

    .line 308
    .line 309
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 310
    .line 311
    .line 312
    move-result-object v2

    .line 313
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 314
    .line 315
    .line 316
    move-result-object v2

    .line 317
    invoke-virtual {v2, v4}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 318
    .line 319
    .line 320
    move-result v2

    .line 321
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 322
    .line 323
    .line 324
    move-result-object v3

    .line 325
    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 326
    .line 327
    .line 328
    move-result-object v3

    .line 329
    invoke-virtual {v3, v6}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 330
    .line 331
    .line 332
    move-result v3

    .line 333
    invoke-direct {v1, v2, v3}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 334
    .line 335
    .line 336
    invoke-virtual {v0, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 337
    .line 338
    .line 339
    new-instance v1, Lj4/g;

    .line 340
    .line 341
    invoke-direct {v1, p0, v0}, Lj4/g;-><init>(Lj4/k;Landroid/widget/Button;)V

    .line 342
    .line 343
    .line 344
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 345
    .line 346
    .line 347
    iput-object v0, p0, Lj4/k;->j:Landroid/widget/Button;

    .line 348
    .line 349
    iget-object v0, p0, Lj4/k;->i:Landroid/widget/LinearLayout;

    .line 350
    .line 351
    if-eqz v0, :cond_4

    .line 352
    .line 353
    iget-object v1, p0, Lj4/k;->k:Landroid/widget/Button;

    .line 354
    .line 355
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 356
    .line 357
    .line 358
    :cond_4
    iget-object v0, p0, Lj4/k;->i:Landroid/widget/LinearLayout;

    .line 359
    .line 360
    if-eqz v0, :cond_5

    .line 361
    .line 362
    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 363
    .line 364
    .line 365
    :cond_5
    iget-object p1, p0, Lj4/k;->i:Landroid/widget/LinearLayout;

    .line 366
    .line 367
    if-eqz p1, :cond_6

    .line 368
    .line 369
    iget-object v0, p0, Lj4/k;->j:Landroid/widget/Button;

    .line 370
    .line 371
    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 372
    .line 373
    .line 374
    :cond_6
    iget-object p1, p0, Lj4/k;->e:Landroid/widget/FrameLayout;

    .line 375
    .line 376
    if-eqz p1, :cond_7

    .line 377
    .line 378
    iget-object v0, p0, Lj4/k;->i:Landroid/widget/LinearLayout;

    .line 379
    .line 380
    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 381
    .line 382
    .line 383
    :cond_7
    iget-object p1, p0, Lj4/k;->f:Lj4/a;

    .line 384
    .line 385
    if-eqz p1, :cond_8

    .line 386
    .line 387
    new-instance v0, Lj4/h;

    .line 388
    .line 389
    invoke-direct {v0, p0}, Lj4/h;-><init>(Lj4/k;)V

    .line 390
    .line 391
    .line 392
    invoke-virtual {p1, v0}, Lj4/a;->setOnCropRectChangeListener(Lkotlin/jvm/functions/Function1;)V

    .line 393
    .line 394
    .line 395
    :cond_8
    iget-object p1, p0, Lj4/k;->e:Landroid/widget/FrameLayout;

    .line 396
    .line 397
    if-eqz p1, :cond_9

    .line 398
    .line 399
    new-instance v0, Lj4/i;

    .line 400
    .line 401
    invoke-direct {v0, p0}, Lj4/i;-><init>(Lj4/k;)V

    .line 402
    .line 403
    .line 404
    invoke-virtual {p1, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 405
    .line 406
    .line 407
    :cond_9
    :try_start_0
    iget-object p1, p0, Lj4/k;->b:Landroid/view/WindowManager;

    .line 408
    .line 409
    iget-object v0, p0, Lj4/k;->e:Landroid/widget/FrameLayout;

    .line 410
    .line 411
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 412
    .line 413
    .line 414
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 415
    .line 416
    .line 417
    move-result-object v1

    .line 418
    invoke-interface {p1, v0, v1}, Landroid/view/ViewManager;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 419
    .line 420
    .line 421
    return-void

    .line 422
    :catch_0
    move-exception v0

    .line 423
    move-object p1, v0

    .line 424
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 425
    .line 426
    .line 427
    move-result-object v0

    .line 428
    new-instance v1, Ljava/lang/StringBuilder;

    .line 429
    .line 430
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 431
    .line 432
    .line 433
    const-string v2, "\u6dfb\u52a0\u622a\u56fe\u88c1\u526a\u6d6e\u7a97\u5931\u8d25: "

    .line 434
    .line 435
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 436
    .line 437
    .line 438
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 439
    .line 440
    .line 441
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 442
    .line 443
    .line 444
    move-result-object v0

    .line 445
    const-string v1, "ScreenshotHelper"

    .line 446
    .line 447
    invoke-static {v1, v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 448
    .line 449
    .line 450
    iget-object v0, p0, Lj4/k;->a:Landroid/content/Context;

    .line 451
    .line 452
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 453
    .line 454
    .line 455
    move-result-object p1

    .line 456
    new-instance v1, Ljava/lang/StringBuilder;

    .line 457
    .line 458
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 459
    .line 460
    .line 461
    const-string v2, "\u663e\u793a\u88c1\u526a\u6d6e\u7a97\u5931\u8d25: "

    .line 462
    .line 463
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 464
    .line 465
    .line 466
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 467
    .line 468
    .line 469
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 470
    .line 471
    .line 472
    move-result-object p1

    .line 473
    const/4 v1, 0x1

    .line 474
    invoke-static {v0, p1, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 475
    .line 476
    .line 477
    move-result-object p1

    .line 478
    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    .line 479
    .line 480
    .line 481
    iget-object p1, p0, Lj4/k;->d:Lkotlin/jvm/functions/Function0;

    .line 482
    .line 483
    invoke-interface {p1}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 484
    .line 485
    .line 486
    iget-object p1, p0, Lj4/k;->l:Landroid/graphics/Bitmap;

    .line 487
    .line 488
    if-eqz p1, :cond_a

    .line 489
    .line 490
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->recycle()V

    .line 491
    .line 492
    .line 493
    :cond_a
    return-void
.end method

.method public final m(Landroid/graphics/Rect;)V
    .locals 10

    .line 1
    const/high16 v0, 0x42340000    # 45.0f

    .line 2
    .line 3
    invoke-static {v0}, Lcom/blankj/utilcode/util/g;->e(F)I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/high16 v2, 0x41000000    # 8.0f

    .line 8
    .line 9
    invoke-static {v2}, Lcom/blankj/utilcode/util/g;->e(F)I

    .line 10
    .line 11
    .line 12
    move-result v3

    .line 13
    invoke-static {v2}, Lcom/blankj/utilcode/util/g;->e(F)I

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    iget-object v4, p0, Lj4/k;->i:Landroid/widget/LinearLayout;

    .line 18
    .line 19
    if-eqz v4, :cond_2

    .line 20
    .line 21
    new-instance v5, Landroid/util/DisplayMetrics;

    .line 22
    .line 23
    invoke-direct {v5}, Landroid/util/DisplayMetrics;-><init>()V

    .line 24
    .line 25
    .line 26
    iget-object v6, p0, Lj4/k;->b:Landroid/view/WindowManager;

    .line 27
    .line 28
    invoke-interface {v6}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    .line 29
    .line 30
    .line 31
    move-result-object v6

    .line 32
    invoke-virtual {v6, v5}, Landroid/view/Display;->getMetrics(Landroid/util/DisplayMetrics;)V

    .line 33
    .line 34
    .line 35
    iget v5, v5, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 36
    .line 37
    const/4 v6, 0x0

    .line 38
    invoke-virtual {v4, v6, v6}, Landroid/view/View;->measure(II)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v4}, Landroid/view/View;->getMeasuredWidth()I

    .line 42
    .line 43
    .line 44
    move-result v6

    .line 45
    invoke-virtual {v4}, Landroid/view/View;->getMeasuredHeight()I

    .line 46
    .line 47
    .line 48
    move-result v7

    .line 49
    iget v8, p1, Landroid/graphics/Rect;->bottom:I

    .line 50
    .line 51
    add-int v9, v8, v7

    .line 52
    .line 53
    add-int/2addr v9, v3

    .line 54
    if-ge v9, v5, :cond_0

    .line 55
    .line 56
    iget p1, p1, Landroid/graphics/Rect;->right:I

    .line 57
    .line 58
    sub-int/2addr p1, v6

    .line 59
    sub-int/2addr p1, v1

    .line 60
    add-int/2addr v8, v3

    .line 61
    goto :goto_0

    .line 62
    :cond_0
    iget p1, p1, Landroid/graphics/Rect;->right:I

    .line 63
    .line 64
    sub-int/2addr p1, v6

    .line 65
    sub-int/2addr p1, v1

    .line 66
    sub-int/2addr v8, v7

    .line 67
    sub-int/2addr v8, v2

    .line 68
    :goto_0
    if-gez p1, :cond_1

    .line 69
    .line 70
    invoke-static {v0}, Lcom/blankj/utilcode/util/g;->e(F)I

    .line 71
    .line 72
    .line 73
    move-result p1

    .line 74
    :cond_1
    new-instance v0, Landroid/widget/FrameLayout$LayoutParams;

    .line 75
    .line 76
    const/4 v1, -0x2

    .line 77
    invoke-direct {v0, v1, v1}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 78
    .line 79
    .line 80
    iput p1, v0, Landroid/widget/FrameLayout$LayoutParams;->leftMargin:I

    .line 81
    .line 82
    iput v8, v0, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I

    .line 83
    .line 84
    invoke-virtual {v4, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 85
    .line 86
    .line 87
    :cond_2
    return-void
.end method
