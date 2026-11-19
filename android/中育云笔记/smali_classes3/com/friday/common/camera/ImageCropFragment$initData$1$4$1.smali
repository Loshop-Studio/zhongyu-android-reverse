.class final Lcom/friday/common/camera/ImageCropFragment$initData$1$4$1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/common/camera/ImageCropFragment;->initData()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/SuspendLambda;",
        "Lhd/p;"
    }
.end annotation

.annotation runtime Lxc/d;
    c = "com.friday.common.camera.ImageCropFragment$initData$1$4$1"
    f = "ImageCropFragment.kt"
    l = {
        0x68
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public c:Ljava/lang/Object;

.field public d:Ljava/lang/Object;

.field public e:Ljava/lang/Object;

.field public f:Ljava/lang/Object;

.field public g:I

.field public h:I

.field public synthetic i:Ljava/lang/Object;

.field public final synthetic j:Lcom/friday/common/camera/ImageCropFragment;


# direct methods
.method public constructor <init>(Lcom/friday/common/camera/ImageCropFragment;Lvc/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/common/camera/ImageCropFragment$initData$1$4$1;->j:Lcom/friday/common/camera/ImageCropFragment;

    .line 2
    .line 3
    const/4 p1, 0x2

    .line 4
    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILvc/c;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lvc/c;)Lvc/c;
    .locals 2

    .line 1
    new-instance v0, Lcom/friday/common/camera/ImageCropFragment$initData$1$4$1;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/friday/common/camera/ImageCropFragment$initData$1$4$1;->j:Lcom/friday/common/camera/ImageCropFragment;

    .line 4
    .line 5
    invoke-direct {v0, v1, p2}, Lcom/friday/common/camera/ImageCropFragment$initData$1$4$1;-><init>(Lcom/friday/common/camera/ImageCropFragment;Lvc/c;)V

    .line 6
    .line 7
    .line 8
    iput-object p1, v0, Lcom/friday/common/camera/ImageCropFragment$initData$1$4$1;->i:Ljava/lang/Object;

    .line 9
    .line 10
    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lsd/i0;

    check-cast p2, Lvc/c;

    invoke-virtual {p0, p1, p2}, Lcom/friday/common/camera/ImageCropFragment$initData$1$4$1;->invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lsd/i0;Lvc/c;)Ljava/lang/Object;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/friday/common/camera/ImageCropFragment$initData$1$4$1;->create(Ljava/lang/Object;Lvc/c;)Lvc/c;

    move-result-object p1

    check-cast p1, Lcom/friday/common/camera/ImageCropFragment$initData$1$4$1;

    sget-object p2, Lqc/q;->a:Lqc/q;

    invoke-virtual {p1, p2}, Lcom/friday/common/camera/ImageCropFragment$initData$1$4$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/friday/common/camera/ImageCropFragment$initData$1$4$1;->i:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lsd/i0;

    .line 4
    .line 5
    invoke-static {}, Lwc/a;->f()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    iget v2, p0, Lcom/friday/common/camera/ImageCropFragment$initData$1$4$1;->h:I

    .line 10
    .line 11
    const/4 v3, 0x1

    .line 12
    if-eqz v2, :cond_1

    .line 13
    .line 14
    if-ne v2, v3, :cond_0

    .line 15
    .line 16
    iget-object v0, p0, Lcom/friday/common/camera/ImageCropFragment$initData$1$4$1;->f:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v0, Lcom/friday/common/camera/CameraBean;

    .line 19
    .line 20
    iget-object v1, p0, Lcom/friday/common/camera/ImageCropFragment$initData$1$4$1;->e:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v1, Lcom/friday/common/camera/ImageCropFragment;

    .line 23
    .line 24
    iget-object v2, p0, Lcom/friday/common/camera/ImageCropFragment$initData$1$4$1;->d:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v2, Lcom/friday/common/camera/CameraBean;

    .line 27
    .line 28
    iget-object v2, p0, Lcom/friday/common/camera/ImageCropFragment$initData$1$4$1;->c:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v2, Landroid/graphics/Bitmap;

    .line 31
    .line 32
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    goto/16 :goto_5

    .line 36
    .line 37
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 38
    .line 39
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 40
    .line 41
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    throw p1

    .line 45
    :cond_1
    invoke-static {p1}, Lkotlin/b;->b(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    iget-object p1, p0, Lcom/friday/common/camera/ImageCropFragment$initData$1$4$1;->j:Lcom/friday/common/camera/ImageCropFragment;

    .line 49
    .line 50
    invoke-static {p1}, Lcom/friday/common/camera/ImageCropFragment;->z(Lcom/friday/common/camera/ImageCropFragment;)Z

    .line 51
    .line 52
    .line 53
    move-result p1

    .line 54
    const/4 v2, 0x0

    .line 55
    if-nez p1, :cond_2

    .line 56
    .line 57
    const-string p1, "\u56fe\u7247\u52a0\u8f7d\u4e2d\uff0c\u8bf7\u7a0d\u540e"

    .line 58
    .line 59
    new-array v0, v2, [Ljava/lang/Object;

    .line 60
    .line 61
    invoke-static {p1, v0}, Lcom/blankj/utilcode/util/ToastUtils;->showShort(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 65
    .line 66
    return-object p1

    .line 67
    :cond_2
    iget-object p1, p0, Lcom/friday/common/camera/ImageCropFragment$initData$1$4$1;->j:Lcom/friday/common/camera/ImageCropFragment;

    .line 68
    .line 69
    invoke-virtual {p1, v3}, Lcom/friday/common/base/BaseFragment;->isShowLoading(Z)V

    .line 70
    .line 71
    .line 72
    iget-object p1, p0, Lcom/friday/common/camera/ImageCropFragment$initData$1$4$1;->j:Lcom/friday/common/camera/ImageCropFragment;

    .line 73
    .line 74
    const/4 v4, 0x0

    .line 75
    :try_start_0
    sget-object v5, Lkotlin/Result;->d:Lkotlin/Result$a;

    .line 76
    .line 77
    invoke-static {p1}, Lcom/friday/common/camera/ImageCropFragment;->x(Lcom/friday/common/camera/ImageCropFragment;)Lcom/friday/common/databinding/FragmentImageCropBinding;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    if-nez p1, :cond_3

    .line 82
    .line 83
    const-string p1, "mBindView"

    .line 84
    .line 85
    invoke-static {p1}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    move-object p1, v4

    .line 89
    goto :goto_0

    .line 90
    :catchall_0
    move-exception p1

    .line 91
    goto :goto_1

    .line 92
    :cond_3
    :goto_0
    iget-object p1, p1, Lcom/friday/common/databinding/FragmentImageCropBinding;->f:Lcom/canhub/cropper/CropImageView;

    .line 93
    .line 94
    sget-object v5, Lcom/canhub/cropper/CropImageView$RequestSizeOptions;->d:Lcom/canhub/cropper/CropImageView$RequestSizeOptions;

    .line 95
    .line 96
    const/16 v6, 0x1000

    .line 97
    .line 98
    invoke-virtual {p1, v6, v6, v5}, Lcom/canhub/cropper/CropImageView;->h(IILcom/canhub/cropper/CropImageView$RequestSizeOptions;)Landroid/graphics/Bitmap;

    .line 99
    .line 100
    .line 101
    move-result-object p1

    .line 102
    invoke-static {p1}, Lkotlin/Result;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 106
    goto :goto_2

    .line 107
    :goto_1
    sget-object v5, Lkotlin/Result;->d:Lkotlin/Result$a;

    .line 108
    .line 109
    invoke-static {p1}, Lkotlin/b;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object p1

    .line 113
    invoke-static {p1}, Lkotlin/Result;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object p1

    .line 117
    :goto_2
    invoke-static {p1}, Lkotlin/Result;->g(Ljava/lang/Object;)Z

    .line 118
    .line 119
    .line 120
    move-result v5

    .line 121
    if-eqz v5, :cond_4

    .line 122
    .line 123
    goto :goto_3

    .line 124
    :cond_4
    move-object v4, p1

    .line 125
    :goto_3
    check-cast v4, Landroid/graphics/Bitmap;

    .line 126
    .line 127
    if-nez v4, :cond_5

    .line 128
    .line 129
    const-string p1, "\u56fe\u7247\u88c1\u526a\u5931\u8d25"

    .line 130
    .line 131
    new-array v0, v2, [Ljava/lang/Object;

    .line 132
    .line 133
    invoke-static {p1, v0}, Lcom/blankj/utilcode/util/ToastUtils;->showShort(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 134
    .line 135
    .line 136
    iget-object p1, p0, Lcom/friday/common/camera/ImageCropFragment$initData$1$4$1;->j:Lcom/friday/common/camera/ImageCropFragment;

    .line 137
    .line 138
    invoke-static {p1}, Lcom/friday/common/camera/ImageCropFragment;->v(Lcom/friday/common/camera/ImageCropFragment;)V

    .line 139
    .line 140
    .line 141
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 142
    .line 143
    return-object p1

    .line 144
    :cond_5
    iget-object p1, p0, Lcom/friday/common/camera/ImageCropFragment$initData$1$4$1;->j:Lcom/friday/common/camera/ImageCropFragment;

    .line 145
    .line 146
    invoke-static {p1}, Lcom/friday/common/camera/ImageCropFragment;->w(Lcom/friday/common/camera/ImageCropFragment;)Lcom/friday/common/camera/CameraBean;

    .line 147
    .line 148
    .line 149
    move-result-object p1

    .line 150
    if-eqz p1, :cond_9

    .line 151
    .line 152
    iget-object v5, p0, Lcom/friday/common/camera/ImageCropFragment$initData$1$4$1;->j:Lcom/friday/common/camera/ImageCropFragment;

    .line 153
    .line 154
    invoke-virtual {p1}, Lcom/friday/common/camera/CameraBean;->c()Ljava/lang/String;

    .line 155
    .line 156
    .line 157
    move-result-object v6

    .line 158
    if-eqz v6, :cond_6

    .line 159
    .line 160
    move v6, v3

    .line 161
    goto :goto_4

    .line 162
    :cond_6
    move v6, v2

    .line 163
    :goto_4
    invoke-static {v0}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object v0

    .line 167
    iput-object v0, p0, Lcom/friday/common/camera/ImageCropFragment$initData$1$4$1;->i:Ljava/lang/Object;

    .line 168
    .line 169
    invoke-static {v4}, Lxc/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    move-result-object v0

    .line 173
    iput-object v0, p0, Lcom/friday/common/camera/ImageCropFragment$initData$1$4$1;->c:Ljava/lang/Object;

    .line 174
    .line 175
    iput-object p1, p0, Lcom/friday/common/camera/ImageCropFragment$initData$1$4$1;->d:Ljava/lang/Object;

    .line 176
    .line 177
    iput-object v5, p0, Lcom/friday/common/camera/ImageCropFragment$initData$1$4$1;->e:Ljava/lang/Object;

    .line 178
    .line 179
    iput-object p1, p0, Lcom/friday/common/camera/ImageCropFragment$initData$1$4$1;->f:Ljava/lang/Object;

    .line 180
    .line 181
    iput v2, p0, Lcom/friday/common/camera/ImageCropFragment$initData$1$4$1;->g:I

    .line 182
    .line 183
    iput v3, p0, Lcom/friday/common/camera/ImageCropFragment$initData$1$4$1;->h:I

    .line 184
    .line 185
    invoke-static {v5, v4, v6, p0}, Lcom/friday/common/camera/ImageCropFragment;->A(Lcom/friday/common/camera/ImageCropFragment;Landroid/graphics/Bitmap;ZLvc/c;)Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    move-result-object v0

    .line 189
    if-ne v0, v1, :cond_7

    .line 190
    .line 191
    return-object v1

    .line 192
    :cond_7
    move-object v1, v0

    .line 193
    move-object v0, p1

    .line 194
    move-object p1, v1

    .line 195
    move-object v1, v5

    .line 196
    :goto_5
    check-cast p1, Landroid/graphics/Bitmap;

    .line 197
    .line 198
    invoke-virtual {v0}, Lcom/friday/common/camera/CameraBean;->c()Ljava/lang/String;

    .line 199
    .line 200
    .line 201
    move-result-object v2

    .line 202
    if-eqz v2, :cond_8

    .line 203
    .line 204
    const-string v2, "ScreenCaptureImage"

    .line 205
    .line 206
    const-class v3, Lkotlin/Pair;

    .line 207
    .line 208
    invoke-static {v2, v3}, Lcom/jeremyliao/liveeventbus/LiveEventBus;->get(Ljava/lang/String;Ljava/lang/Class;)Lcom/jeremyliao/liveeventbus/core/Observable;

    .line 209
    .line 210
    .line 211
    move-result-object v2

    .line 212
    new-instance v3, Lkotlin/Pair;

    .line 213
    .line 214
    invoke-virtual {v0}, Lcom/friday/common/camera/CameraBean;->c()Ljava/lang/String;

    .line 215
    .line 216
    .line 217
    move-result-object v0

    .line 218
    invoke-direct {v3, v0, p1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 219
    .line 220
    .line 221
    invoke-interface {v2, v3}, Lcom/jeremyliao/liveeventbus/core/Observable;->post(Ljava/lang/Object;)V

    .line 222
    .line 223
    .line 224
    goto :goto_6

    .line 225
    :cond_8
    const-string v0, "addBitmap"

    .line 226
    .line 227
    const-class v2, Landroid/graphics/Bitmap;

    .line 228
    .line 229
    invoke-static {v0, v2}, Lcom/jeremyliao/liveeventbus/LiveEventBus;->get(Ljava/lang/String;Ljava/lang/Class;)Lcom/jeremyliao/liveeventbus/core/Observable;

    .line 230
    .line 231
    .line 232
    move-result-object v0

    .line 233
    invoke-interface {v0, p1}, Lcom/jeremyliao/liveeventbus/core/Observable;->post(Ljava/lang/Object;)V

    .line 234
    .line 235
    .line 236
    :goto_6
    invoke-static {v1}, Lcom/friday/common/camera/ImageCropFragment;->y(Lcom/friday/common/camera/ImageCropFragment;)Lcom/friday/common/camera/CameraViewModel;

    .line 237
    .line 238
    .line 239
    move-result-object v0

    .line 240
    invoke-virtual {v0, p1}, Lcom/friday/common/camera/CameraViewModel;->f(Landroid/graphics/Bitmap;)V

    .line 241
    .line 242
    .line 243
    invoke-static {v1}, Lcom/friday/common/camera/ImageCropFragment;->v(Lcom/friday/common/camera/ImageCropFragment;)V

    .line 244
    .line 245
    .line 246
    :cond_9
    sget-object p1, Lqc/q;->a:Lqc/q;

    .line 247
    .line 248
    return-object p1
.end method
