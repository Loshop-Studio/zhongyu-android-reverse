.class public final Le4/f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Le4/f$a;
    }
.end annotation


# static fields
.field public static final k:Le4/f$a;

.field public static final l:I


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Landroid/view/WindowManager;

.field public final c:Lkotlin/jvm/functions/Function1;

.field public final d:Lkotlin/jvm/functions/Function1;

.field public e:Landroid/view/View;

.field public f:Landroid/widget/ImageView;

.field public g:Landroid/widget/ImageView;

.field public h:Landroid/widget/TextView;

.field public i:Landroid/widget/TextView;

.field public j:Landroid/graphics/Bitmap;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Le4/f$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Le4/f$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Le4/f;->k:Le4/f$a;

    .line 8
    .line 9
    const/16 v0, 0x8

    .line 10
    .line 11
    sput v0, Le4/f;->l:I

    .line 12
    .line 13
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/view/WindowManager;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V
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
    const-string v0, "onCroppedResultEdit"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "onCroppedResultSaved"

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
    iput-object p1, p0, Le4/f;->a:Landroid/content/Context;

    .line 25
    .line 26
    iput-object p2, p0, Le4/f;->b:Landroid/view/WindowManager;

    .line 27
    .line 28
    iput-object p3, p0, Le4/f;->c:Lkotlin/jvm/functions/Function1;

    .line 29
    .line 30
    iput-object p4, p0, Le4/f;->d:Lkotlin/jvm/functions/Function1;

    .line 31
    .line 32
    return-void
.end method

.method public static synthetic a(Le4/f;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Le4/f;->e(Le4/f;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic b(Le4/f;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Le4/f;->f(Le4/f;Landroid/view/View;)V

    return-void
.end method

.method public static final e(Le4/f;Landroid/view/View;)V
    .locals 1

    .line 1
    iget-object p1, p0, Le4/f;->j:Landroid/graphics/Bitmap;

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Le4/f;->d:Lkotlin/jvm/functions/Function1;

    .line 6
    .line 7
    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    :cond_0
    invoke-virtual {p0}, Le4/f;->c()V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public static final f(Le4/f;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Le4/f;->c()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final c()V
    .locals 2

    .line 1
    iget-object v0, p0, Le4/f;->e:Landroid/view/View;

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
    iget-object v1, p0, Le4/f;->b:Landroid/view/WindowManager;

    .line 12
    .line 13
    invoke-interface {v1, v0}, Landroid/view/ViewManager;->removeView(Landroid/view/View;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    const/4 v0, 0x0

    .line 17
    iput-object v0, p0, Le4/f;->e:Landroid/view/View;

    .line 18
    .line 19
    iput-object v0, p0, Le4/f;->f:Landroid/widget/ImageView;

    .line 20
    .line 21
    iput-object v0, p0, Le4/f;->h:Landroid/widget/TextView;

    .line 22
    .line 23
    iput-object v0, p0, Le4/f;->i:Landroid/widget/TextView;

    .line 24
    .line 25
    iget-object v1, p0, Le4/f;->j:Landroid/graphics/Bitmap;

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
    iput-object v0, p0, Le4/f;->j:Landroid/graphics/Bitmap;

    .line 33
    .line 34
    return-void
.end method

.method public final d(Landroid/graphics/Bitmap;)V
    .locals 7

    .line 1
    const-string v0, "bitmap"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Le4/f;->c()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Le4/f;->j:Landroid/graphics/Bitmap;

    .line 10
    .line 11
    iget-object v0, p0, Le4/f;->a:Landroid/content/Context;

    .line 12
    .line 13
    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    const v1, 0x7f0c0033

    .line 18
    .line 19
    .line 20
    const/4 v2, 0x0

    .line 21
    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    iput-object v0, p0, Le4/f;->e:Landroid/view/View;

    .line 26
    .line 27
    if-eqz v0, :cond_0

    .line 28
    .line 29
    const v1, 0x7f0900f0

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    check-cast v0, Landroid/widget/ImageView;

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    move-object v0, v2

    .line 40
    :goto_0
    iput-object v0, p0, Le4/f;->f:Landroid/widget/ImageView;

    .line 41
    .line 42
    iget-object v0, p0, Le4/f;->e:Landroid/view/View;

    .line 43
    .line 44
    if-eqz v0, :cond_1

    .line 45
    .line 46
    const v1, 0x7f0902b2

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    check-cast v0, Landroid/widget/TextView;

    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_1
    move-object v0, v2

    .line 57
    :goto_1
    iput-object v0, p0, Le4/f;->h:Landroid/widget/TextView;

    .line 58
    .line 59
    iget-object v0, p0, Le4/f;->e:Landroid/view/View;

    .line 60
    .line 61
    if-eqz v0, :cond_2

    .line 62
    .line 63
    const v1, 0x7f09018e

    .line 64
    .line 65
    .line 66
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    move-object v2, v0

    .line 71
    check-cast v2, Landroid/widget/ImageView;

    .line 72
    .line 73
    :cond_2
    iput-object v2, p0, Le4/f;->g:Landroid/widget/ImageView;

    .line 74
    .line 75
    iget-object v0, p0, Le4/f;->f:Landroid/widget/ImageView;

    .line 76
    .line 77
    if-eqz v0, :cond_3

    .line 78
    .line 79
    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 80
    .line 81
    .line 82
    :cond_3
    iget-object p1, p0, Le4/f;->h:Landroid/widget/TextView;

    .line 83
    .line 84
    if-eqz p1, :cond_4

    .line 85
    .line 86
    new-instance v0, Le4/d;

    .line 87
    .line 88
    invoke-direct {v0, p0}, Le4/d;-><init>(Le4/f;)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 92
    .line 93
    .line 94
    :cond_4
    iget-object p1, p0, Le4/f;->g:Landroid/widget/ImageView;

    .line 95
    .line 96
    if-eqz p1, :cond_5

    .line 97
    .line 98
    new-instance v0, Le4/e;

    .line 99
    .line 100
    invoke-direct {v0, p0}, Le4/e;-><init>(Le4/f;)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 104
    .line 105
    .line 106
    :cond_5
    new-instance v1, Landroid/view/WindowManager$LayoutParams;

    .line 107
    .line 108
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 109
    .line 110
    const/16 v0, 0x1a

    .line 111
    .line 112
    if-lt p1, v0, :cond_6

    .line 113
    .line 114
    const/16 p1, 0x7f6

    .line 115
    .line 116
    :goto_2
    move v4, p1

    .line 117
    goto :goto_3

    .line 118
    :cond_6
    const/16 p1, 0x7d2

    .line 119
    .line 120
    goto :goto_2

    .line 121
    :goto_3
    const/16 v5, 0x708

    .line 122
    .line 123
    const/4 v6, -0x3

    .line 124
    const/4 v2, -0x1

    .line 125
    const/4 v3, -0x1

    .line 126
    invoke-direct/range {v1 .. v6}, Landroid/view/WindowManager$LayoutParams;-><init>(IIIII)V

    .line 127
    .line 128
    .line 129
    const/16 p1, 0x11

    .line 130
    .line 131
    iput p1, v1, Landroid/view/WindowManager$LayoutParams;->gravity:I

    .line 132
    .line 133
    :try_start_0
    iget-object p1, p0, Le4/f;->b:Landroid/view/WindowManager;

    .line 134
    .line 135
    iget-object v0, p0, Le4/f;->e:Landroid/view/View;

    .line 136
    .line 137
    invoke-interface {p1, v0, v1}, Landroid/view/ViewManager;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 138
    .line 139
    .line 140
    return-void

    .line 141
    :catch_0
    move-exception v0

    .line 142
    move-object p1, v0

    .line 143
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object v0

    .line 147
    new-instance v1, Ljava/lang/StringBuilder;

    .line 148
    .line 149
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 150
    .line 151
    .line 152
    const-string v2, "Failed to add cropped result overlay: "

    .line 153
    .line 154
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 155
    .line 156
    .line 157
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 158
    .line 159
    .line 160
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 161
    .line 162
    .line 163
    move-result-object v0

    .line 164
    const-string v1, "DisplayCroppedBitmapOverlay"

    .line 165
    .line 166
    invoke-static {v1, v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 167
    .line 168
    .line 169
    iget-object p1, p0, Le4/f;->j:Landroid/graphics/Bitmap;

    .line 170
    .line 171
    if-eqz p1, :cond_7

    .line 172
    .line 173
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->recycle()V

    .line 174
    .line 175
    .line 176
    :cond_7
    return-void
.end method
