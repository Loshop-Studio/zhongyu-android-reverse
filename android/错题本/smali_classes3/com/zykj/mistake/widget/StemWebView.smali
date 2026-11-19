# RE note 本类字节码直接引用的读写或显示接口包括WebView。
.class public final Lcom/zykj/mistake/widget/StemWebView;
.super Landroid/widget/RelativeLayout;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u0007\u0018\u00002\u00020\u0001B\'\u0008\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0011\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0015\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0015\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\r\u00a2\u0006\u0004\u0008\u0013\u0010\u0011J\u0015\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0015\u0010\u0016R*\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u00178\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0018\u0010\u0019\u001a\u0004\u0008\u001a\u0010\u001b\"\u0004\u0008\u001c\u0010\u001d\u00a8\u0006\u001f"
    }
    d2 = {
        "Lcom/zykj/mistake/widget/StemWebView;",
        "Landroid/widget/RelativeLayout;",
        "Landroid/content/Context;",
        "context",
        "Landroid/util/AttributeSet;",
        "attrs",
        "",
        "defStyleAttr",
        "<init>",
        "(Landroid/content/Context;Landroid/util/AttributeSet;I)V",
        "Landroid/graphics/Bitmap;",
        "getCurrentPageBitmap",
        "()Landroid/graphics/Bitmap;",
        "",
        "enabled",
        "Ld6/s;",
        "setRemoveEmptyStemTopSpacing",
        "(Z)V",
        "visible",
        "setScaleButtonsVisible",
        "newOffset",
        "setZoomOffset",
        "(I)V",
        "Lkotlin/Function0;",
        "j",
        "Lr6/a;",
        "getPageFinishListener",
        "()Lr6/a;",
        "setPageFinishListener",
        "(Lr6/a;)V",
        "pageFinishListener",
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

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nStemWebView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StemWebView.kt\ncom/zykj/mistake/widget/StemWebView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,373:1\n1#2:374\n*E\n"
    }
.end annotation


# static fields
.field public static final synthetic k:I


# instance fields
.field public final a:Landroid/webkit/WebView;

.field public b:Ljava/lang/String;

.field public final c:Lokhttp3/z;

.field public final d:I

.field public final e:I

.field public f:I

.field public g:Landroid/widget/LinearLayout;

.field public h:Z

.field public i:Z

.field public j:Lr6/a;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 3
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    .line 1
    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x6

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {p0, p1, v2, v0, v1}, Lcom/zykj/mistake/widget/StemWebView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    .line 2
    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x4

    const/4 v1, 0x0

    invoke-direct {p0, p1, p2, v0, v1}, Lcom/zykj/mistake/widget/StemWebView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 5
    new-instance p2, Landroid/webkit/WebView;

    invoke-direct {p2, p1}, Landroid/webkit/WebView;-><init>(Landroid/content/Context;)V

    iput-object p2, p0, Lcom/zykj/mistake/widget/StemWebView;->a:Landroid/webkit/WebView;

    .line 6
    const-string p1, ""

    iput-object p1, p0, Lcom/zykj/mistake/widget/StemWebView;->b:Ljava/lang/String;

    .line 7
    new-instance p1, Lokhttp3/z;

    invoke-direct {p1}, Lokhttp3/z;-><init>()V

    iput-object p1, p0, Lcom/zykj/mistake/widget/StemWebView;->c:Lokhttp3/z;

    const/16 p1, 0x96

    .line 8
    iput p1, p0, Lcom/zykj/mistake/widget/StemWebView;->d:I

    const/16 p1, 0x32

    .line 9
    iput p1, p0, Lcom/zykj/mistake/widget/StemWebView;->e:I

    const/4 p1, 0x1

    .line 10
    iput-boolean p1, p0, Lcom/zykj/mistake/widget/StemWebView;->h:Z

    .line 11
    new-instance p1, La8/a;

    const/16 p2, 0x15

    invoke-direct {p1, p0, p2}, La8/a;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {p0, p1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    const/4 p3, 0x0

    .line 3
    invoke-direct {p0, p1, p2, p3}, Lcom/zykj/mistake/widget/StemWebView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method private final getCurrentPageBitmap()Landroid/graphics/Bitmap;
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/zykj/mistake/widget/StemWebView;->a:Landroid/webkit/WebView;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-virtual {v0, v1}, Landroid/view/View;->setDrawingCacheEnabled(Z)V

    .line 5
    .line 6
    .line 7
    :try_start_0
    invoke-virtual {v0}, Landroid/view/View;->getDrawingCache()Landroid/graphics/Bitmap;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    invoke-static {v2}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    invoke-static {v2}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    goto :goto_0

    .line 20
    :catchall_0
    move-exception v2

    .line 21
    invoke-static {v2}, Lkotlin/b;->a(Ljava/lang/Throwable;)Lkotlin/Result$Failure;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    invoke-static {v2}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    :goto_0
    invoke-static {v2}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v3

    .line 33
    const/4 v4, 0x0

    .line 34
    if-eqz v3, :cond_0

    .line 35
    .line 36
    move-object v2, v4

    .line 37
    :cond_0
    check-cast v2, Landroid/graphics/Bitmap;

    .line 38
    .line 39
    const/4 v3, 0x0

    .line 40
    invoke-virtual {v0, v3}, Landroid/view/View;->setDrawingCacheEnabled(Z)V

    .line 41
    .line 42
    .line 43
    if-nez v2, :cond_1

    .line 44
    .line 45
    return-object v4

    .line 46
    :cond_1
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 47
    .line 48
    .line 49
    move-result v3

    .line 50
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    if-lez v3, :cond_5

    .line 55
    .line 56
    if-gtz v0, :cond_2

    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_2
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I

    .line 60
    .line 61
    .line 62
    move-result v4

    .line 63
    if-ne v4, v3, :cond_3

    .line 64
    .line 65
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I

    .line 66
    .line 67
    .line 68
    move-result v4

    .line 69
    if-ne v4, v0, :cond_3

    .line 70
    .line 71
    return-object v2

    .line 72
    :cond_3
    invoke-static {v2, v3, v0, v1}, Landroid/graphics/Bitmap;->createScaledBitmap(Landroid/graphics/Bitmap;IIZ)Landroid/graphics/Bitmap;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    if-eq v0, v2, :cond_4

    .line 77
    .line 78
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->recycle()V

    .line 79
    .line 80
    .line 81
    :cond_4
    return-object v0

    .line 82
    :cond_5
    :goto_1
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->recycle()V

    .line 83
    .line 84
    .line 85
    return-object v4
.end method


# virtual methods
.method public final a()Landroid/graphics/Bitmap;
    .locals 23

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget-object v2, v1, Lcom/zykj/mistake/widget/StemWebView;->a:Landroid/webkit/WebView;

    .line 4
    .line 5
    invoke-virtual {v2}, Landroid/view/View;->getScrollX()I

    .line 6
    .line 7
    .line 8
    move-result v3

    .line 9
    invoke-virtual {v2}, Landroid/view/View;->getScrollY()I

    .line 10
    .line 11
    .line 12
    move-result v4

    .line 13
    const/4 v5, 0x0

    .line 14
    invoke-static {v5, v5}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    invoke-virtual {v2, v0, v0}, Landroid/view/View;->measure(II)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v2}, Landroid/view/View;->getWidth()I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    invoke-virtual {v2}, Landroid/view/View;->getMeasuredWidth()I

    .line 26
    .line 27
    .line 28
    move-result v6

    .line 29
    invoke-static {v0, v6}, Ljava/lang/Math;->max(II)I

    .line 30
    .line 31
    .line 32
    move-result v6

    .line 33
    invoke-virtual {v2}, Landroid/view/View;->getHeight()I

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    invoke-virtual {v2}, Landroid/view/View;->getMeasuredHeight()I

    .line 38
    .line 39
    .line 40
    move-result v7

    .line 41
    invoke-static {v0, v7}, Ljava/lang/Math;->max(II)I

    .line 42
    .line 43
    .line 44
    move-result v7

    .line 45
    invoke-virtual {v2}, Landroid/view/View;->getWidth()I

    .line 46
    .line 47
    .line 48
    move-result v8

    .line 49
    invoke-virtual {v2}, Landroid/view/View;->getHeight()I

    .line 50
    .line 51
    .line 52
    move-result v9

    .line 53
    const/4 v10, 0x0

    .line 54
    if-lez v6, :cond_a

    .line 55
    .line 56
    if-lez v7, :cond_a

    .line 57
    .line 58
    if-lez v8, :cond_a

    .line 59
    .line 60
    if-gtz v9, :cond_0

    .line 61
    .line 62
    goto/16 :goto_6

    .line 63
    .line 64
    :cond_0
    :try_start_0
    sget-object v0, Landroid/graphics/Bitmap$Config;->RGB_565:Landroid/graphics/Bitmap$Config;

    .line 65
    .line 66
    invoke-static {v6, v7, v0}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 74
    goto :goto_0

    .line 75
    :catchall_0
    move-exception v0

    .line 76
    invoke-static {v0}, Lkotlin/b;->a(Ljava/lang/Throwable;)Lkotlin/Result$Failure;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    :goto_0
    invoke-static {v0}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    .line 85
    .line 86
    .line 87
    move-result v11

    .line 88
    if-eqz v11, :cond_1

    .line 89
    .line 90
    move-object v0, v10

    .line 91
    :cond_1
    check-cast v0, Landroid/graphics/Bitmap;

    .line 92
    .line 93
    if-nez v0, :cond_2

    .line 94
    .line 95
    goto/16 :goto_6

    .line 96
    .line 97
    :cond_2
    new-instance v10, Landroid/graphics/Canvas;

    .line 98
    .line 99
    invoke-direct {v10, v0}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 100
    .line 101
    .line 102
    const/4 v11, -0x1

    .line 103
    invoke-virtual {v10, v11}, Landroid/graphics/Canvas;->drawColor(I)V

    .line 104
    .line 105
    .line 106
    new-instance v11, Landroid/graphics/Paint;

    .line 107
    .line 108
    invoke-direct {v11}, Landroid/graphics/Paint;-><init>()V

    .line 109
    .line 110
    .line 111
    div-int v12, v6, v8

    .line 112
    .line 113
    mul-int v13, v8, v12

    .line 114
    .line 115
    sub-int v13, v6, v13

    .line 116
    .line 117
    div-int v14, v7, v9

    .line 118
    .line 119
    mul-int v15, v9, v14

    .line 120
    .line 121
    sub-int v15, v7, v15

    .line 122
    .line 123
    :goto_1
    if-ge v5, v12, :cond_6

    .line 124
    .line 125
    move-object/from16 v16, v0

    .line 126
    .line 127
    mul-int v0, v5, v8

    .line 128
    .line 129
    invoke-virtual {v2, v0}, Landroid/view/View;->setScrollX(I)V

    .line 130
    .line 131
    .line 132
    const/4 v1, 0x0

    .line 133
    :goto_2
    if-ge v1, v14, :cond_4

    .line 134
    .line 135
    move/from16 v17, v1

    .line 136
    .line 137
    mul-int v1, v17, v9

    .line 138
    .line 139
    invoke-virtual {v2, v1}, Landroid/view/View;->setScrollY(I)V

    .line 140
    .line 141
    .line 142
    move/from16 v18, v5

    .line 143
    .line 144
    invoke-direct/range {p0 .. p0}, Lcom/zykj/mistake/widget/StemWebView;->getCurrentPageBitmap()Landroid/graphics/Bitmap;

    .line 145
    .line 146
    .line 147
    move-result-object v5

    .line 148
    move/from16 v19, v8

    .line 149
    .line 150
    if-eqz v5, :cond_3

    .line 151
    .line 152
    new-instance v8, Landroid/graphics/Rect;

    .line 153
    .line 154
    add-int/lit8 v20, v18, 0x1

    .line 155
    .line 156
    move/from16 v21, v9

    .line 157
    .line 158
    mul-int v9, v20, v19

    .line 159
    .line 160
    add-int/lit8 v20, v17, 0x1

    .line 161
    .line 162
    move/from16 v22, v12

    .line 163
    .line 164
    mul-int v12, v20, v21

    .line 165
    .line 166
    invoke-direct {v8, v0, v1, v9, v12}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 167
    .line 168
    .line 169
    new-instance v1, Landroid/graphics/Rect;

    .line 170
    .line 171
    invoke-virtual {v5}, Landroid/graphics/Bitmap;->getWidth()I

    .line 172
    .line 173
    .line 174
    move-result v9

    .line 175
    invoke-virtual {v5}, Landroid/graphics/Bitmap;->getHeight()I

    .line 176
    .line 177
    .line 178
    move-result v12

    .line 179
    move/from16 v20, v13

    .line 180
    .line 181
    const/4 v13, 0x0

    .line 182
    invoke-direct {v1, v13, v13, v9, v12}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 183
    .line 184
    .line 185
    invoke-virtual {v10, v5, v1, v8, v11}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    .line 186
    .line 187
    .line 188
    goto :goto_3

    .line 189
    :cond_3
    move/from16 v21, v9

    .line 190
    .line 191
    move/from16 v22, v12

    .line 192
    .line 193
    move/from16 v20, v13

    .line 194
    .line 195
    :goto_3
    add-int/lit8 v1, v17, 0x1

    .line 196
    .line 197
    move/from16 v5, v18

    .line 198
    .line 199
    move/from16 v8, v19

    .line 200
    .line 201
    move/from16 v13, v20

    .line 202
    .line 203
    move/from16 v9, v21

    .line 204
    .line 205
    move/from16 v12, v22

    .line 206
    .line 207
    goto :goto_2

    .line 208
    :cond_4
    move/from16 v18, v5

    .line 209
    .line 210
    move/from16 v19, v8

    .line 211
    .line 212
    move/from16 v21, v9

    .line 213
    .line 214
    move/from16 v22, v12

    .line 215
    .line 216
    move/from16 v20, v13

    .line 217
    .line 218
    sub-int v1, v7, v21

    .line 219
    .line 220
    if-lez v1, :cond_5

    .line 221
    .line 222
    if-lez v15, :cond_5

    .line 223
    .line 224
    invoke-virtual {v2, v1}, Landroid/view/View;->setScrollY(I)V

    .line 225
    .line 226
    .line 227
    invoke-direct/range {p0 .. p0}, Lcom/zykj/mistake/widget/StemWebView;->getCurrentPageBitmap()Landroid/graphics/Bitmap;

    .line 228
    .line 229
    .line 230
    move-result-object v1

    .line 231
    if-eqz v1, :cond_5

    .line 232
    .line 233
    new-instance v5, Landroid/graphics/Rect;

    .line 234
    .line 235
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getHeight()I

    .line 236
    .line 237
    .line 238
    move-result v8

    .line 239
    sub-int/2addr v8, v15

    .line 240
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getWidth()I

    .line 241
    .line 242
    .line 243
    move-result v9

    .line 244
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getHeight()I

    .line 245
    .line 246
    .line 247
    move-result v12

    .line 248
    const/4 v13, 0x0

    .line 249
    invoke-direct {v5, v13, v8, v9, v12}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 250
    .line 251
    .line 252
    new-instance v8, Landroid/graphics/Rect;

    .line 253
    .line 254
    sub-int v9, v7, v15

    .line 255
    .line 256
    add-int/lit8 v12, v18, 0x1

    .line 257
    .line 258
    mul-int v12, v12, v19

    .line 259
    .line 260
    invoke-direct {v8, v0, v9, v12, v7}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 261
    .line 262
    .line 263
    invoke-virtual {v10, v1, v5, v8, v11}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    .line 264
    .line 265
    .line 266
    :cond_5
    add-int/lit8 v5, v18, 0x1

    .line 267
    .line 268
    move-object/from16 v1, p0

    .line 269
    .line 270
    move-object/from16 v0, v16

    .line 271
    .line 272
    move/from16 v8, v19

    .line 273
    .line 274
    move/from16 v13, v20

    .line 275
    .line 276
    move/from16 v9, v21

    .line 277
    .line 278
    move/from16 v12, v22

    .line 279
    .line 280
    goto/16 :goto_1

    .line 281
    .line 282
    :cond_6
    move-object/from16 v16, v0

    .line 283
    .line 284
    move/from16 v19, v8

    .line 285
    .line 286
    move/from16 v21, v9

    .line 287
    .line 288
    move/from16 v20, v13

    .line 289
    .line 290
    sub-int v0, v6, v19

    .line 291
    .line 292
    if-lez v0, :cond_9

    .line 293
    .line 294
    if-lez v20, :cond_9

    .line 295
    .line 296
    invoke-virtual {v2, v0}, Landroid/view/View;->setScrollX(I)V

    .line 297
    .line 298
    .line 299
    const/4 v13, 0x0

    .line 300
    :goto_4
    if-ge v13, v14, :cond_8

    .line 301
    .line 302
    mul-int v9, v13, v21

    .line 303
    .line 304
    invoke-virtual {v2, v9}, Landroid/view/View;->setScrollY(I)V

    .line 305
    .line 306
    .line 307
    invoke-direct/range {p0 .. p0}, Lcom/zykj/mistake/widget/StemWebView;->getCurrentPageBitmap()Landroid/graphics/Bitmap;

    .line 308
    .line 309
    .line 310
    move-result-object v0

    .line 311
    if-eqz v0, :cond_7

    .line 312
    .line 313
    new-instance v1, Landroid/graphics/Rect;

    .line 314
    .line 315
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    .line 316
    .line 317
    .line 318
    move-result v5

    .line 319
    sub-int v5, v5, v20

    .line 320
    .line 321
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    .line 322
    .line 323
    .line 324
    move-result v8

    .line 325
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    .line 326
    .line 327
    .line 328
    move-result v12

    .line 329
    move/from16 v17, v13

    .line 330
    .line 331
    const/4 v13, 0x0

    .line 332
    invoke-direct {v1, v5, v13, v8, v12}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 333
    .line 334
    .line 335
    new-instance v5, Landroid/graphics/Rect;

    .line 336
    .line 337
    sub-int v8, v6, v20

    .line 338
    .line 339
    add-int/lit8 v12, v17, 0x1

    .line 340
    .line 341
    mul-int v12, v12, v21

    .line 342
    .line 343
    invoke-direct {v5, v8, v9, v6, v12}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 344
    .line 345
    .line 346
    invoke-virtual {v10, v0, v1, v5, v11}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    .line 347
    .line 348
    .line 349
    goto :goto_5

    .line 350
    :cond_7
    move/from16 v17, v13

    .line 351
    .line 352
    const/4 v13, 0x0

    .line 353
    :goto_5
    add-int/lit8 v0, v17, 0x1

    .line 354
    .line 355
    move v13, v0

    .line 356
    goto :goto_4

    .line 357
    :cond_8
    sub-int v0, v7, v21

    .line 358
    .line 359
    if-lez v0, :cond_9

    .line 360
    .line 361
    if-lez v15, :cond_9

    .line 362
    .line 363
    invoke-virtual {v2, v0}, Landroid/view/View;->setScrollY(I)V

    .line 364
    .line 365
    .line 366
    invoke-direct/range {p0 .. p0}, Lcom/zykj/mistake/widget/StemWebView;->getCurrentPageBitmap()Landroid/graphics/Bitmap;

    .line 367
    .line 368
    .line 369
    move-result-object v0

    .line 370
    if-eqz v0, :cond_9

    .line 371
    .line 372
    new-instance v1, Landroid/graphics/Rect;

    .line 373
    .line 374
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    .line 375
    .line 376
    .line 377
    move-result v5

    .line 378
    sub-int v5, v5, v20

    .line 379
    .line 380
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    .line 381
    .line 382
    .line 383
    move-result v8

    .line 384
    sub-int/2addr v8, v15

    .line 385
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    .line 386
    .line 387
    .line 388
    move-result v9

    .line 389
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    .line 390
    .line 391
    .line 392
    move-result v12

    .line 393
    invoke-direct {v1, v5, v8, v9, v12}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 394
    .line 395
    .line 396
    new-instance v5, Landroid/graphics/Rect;

    .line 397
    .line 398
    sub-int v8, v6, v20

    .line 399
    .line 400
    sub-int v9, v7, v15

    .line 401
    .line 402
    invoke-direct {v5, v8, v9, v6, v7}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 403
    .line 404
    .line 405
    invoke-virtual {v10, v0, v1, v5, v11}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    .line 406
    .line 407
    .line 408
    :cond_9
    invoke-virtual {v2, v3}, Landroid/view/View;->setScrollX(I)V

    .line 409
    .line 410
    .line 411
    invoke-virtual {v2, v4}, Landroid/view/View;->setScrollY(I)V

    .line 412
    .line 413
    .line 414
    return-object v16

    .line 415
    :cond_a
    :goto_6
    return-object v10
.end method

.method public final b(Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "url"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/mistake/widget/StemWebView;->b:Ljava/lang/String;

    .line 7
    .line 8
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    iput-object p1, p0, Lcom/zykj/mistake/widget/StemWebView;->b:Ljava/lang/String;

    .line 16
    .line 17
    iget-object v0, p0, Lcom/zykj/mistake/widget/StemWebView;->a:Landroid/webkit/WebView;

    .line 18
    .line 19
    invoke-virtual {v0, p1}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public final getPageFinishListener()Lr6/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lr6/a;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/mistake/widget/StemWebView;->j:Lr6/a;

    .line 2
    .line 3
    return-object v0
.end method

.method public final setPageFinishListener(Lr6/a;)V
    .locals 0
    .param p1    # Lr6/a;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lr6/a;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/zykj/mistake/widget/StemWebView;->j:Lr6/a;

    .line 2
    .line 3
    return-void
.end method

.method public final setRemoveEmptyStemTopSpacing(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/zykj/mistake/widget/StemWebView;->i:Z

    .line 2
    .line 3
    return-void
.end method

.method public final setScaleButtonsVisible(Z)V
    .locals 1

    .line 1
    iput-boolean p1, p0, Lcom/zykj/mistake/widget/StemWebView;->h:Z

    .line 2
    .line 3
    iget-object v0, p0, Lcom/zykj/mistake/widget/StemWebView;->g:Landroid/widget/LinearLayout;

    .line 4
    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    const/4 p1, 0x0

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const/16 p1, 0x8

    .line 12
    .line 13
    :goto_0
    invoke-virtual {v0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 14
    .line 15
    .line 16
    :cond_1
    return-void
.end method

.method public final setZoomOffset(I)V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iget v1, p0, Lcom/zykj/mistake/widget/StemWebView;->e:I

    .line 3
    .line 4
    invoke-static {p1, v0, v1}, Lkotlin/collections/u;->m(III)I

    .line 5
    .line 6
    .line 7
    move-result p1

    .line 8
    iput p1, p0, Lcom/zykj/mistake/widget/StemWebView;->f:I

    .line 9
    .line 10
    iget v0, p0, Lcom/zykj/mistake/widget/StemWebView;->d:I

    .line 11
    .line 12
    add-int/2addr v0, p1

    .line 13
    iget-object p1, p0, Lcom/zykj/mistake/widget/StemWebView;->a:Landroid/webkit/WebView;

    .line 14
    .line 15
    invoke-virtual {p1, v0}, Landroid/webkit/WebView;->setInitialScale(I)V

    .line 16
    .line 17
    .line 18
    return-void
.end method
