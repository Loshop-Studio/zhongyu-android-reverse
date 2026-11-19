.class public final Lcom/friday/common/camera/ImagePickFragment;
.super Lcom/friday/common/camera/Hilt_ImagePickFragment;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/friday/common/camera/ImagePickFragment$a;
    }
.end annotation


# static fields
.field public static final x:Lcom/friday/common/camera/ImagePickFragment$a;

.field public static final y:I


# instance fields
.field public final i:Lqc/d;

.field public j:Landroidx/camera/lifecycle/ProcessCameraProvider;

.field public k:Landroidx/camera/core/ImageCapture;

.field public l:Landroidx/camera/core/CameraControl;

.field public m:Lcom/friday/common/databinding/FragmentImagePickBinding;

.field public n:Landroidx/camera/core/Camera;

.field public o:Lcom/friday/common/camera/CameraBean;

.field public p:Landroidx/camera/core/Preview;

.field public final q:Landroidx/activity/result/ActivityResultLauncher;

.field public r:F

.field public s:F

.field public t:F

.field public u:F

.field public v:F

.field public w:Lkotlinx/coroutines/g;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/friday/common/camera/ImagePickFragment$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/friday/common/camera/ImagePickFragment$a;-><init>(Lkotlin/jvm/internal/n;)V

    sput-object v0, Lcom/friday/common/camera/ImagePickFragment;->x:Lcom/friday/common/camera/ImagePickFragment$a;

    const/16 v0, 0x8

    sput v0, Lcom/friday/common/camera/ImagePickFragment;->y:I

    return-void
.end method

.method public constructor <init>()V
    .locals 4

    .line 1
    invoke-direct {p0}, Lcom/friday/common/camera/Hilt_ImagePickFragment;-><init>()V

    .line 2
    .line 3
    .line 4
    const-class v0, Lcom/friday/common/camera/CameraViewModel;

    .line 5
    .line 6
    invoke-static {v0}, Lkotlin/jvm/internal/y;->b(Ljava/lang/Class;)Lod/c;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    new-instance v1, Lcom/friday/common/camera/ImagePickFragment$special$$inlined$activityViewModels$default$1;

    .line 11
    .line 12
    invoke-direct {v1, p0}, Lcom/friday/common/camera/ImagePickFragment$special$$inlined$activityViewModels$default$1;-><init>(Landroidx/fragment/app/Fragment;)V

    .line 13
    .line 14
    .line 15
    new-instance v2, Lcom/friday/common/camera/ImagePickFragment$special$$inlined$activityViewModels$default$2;

    .line 16
    .line 17
    const/4 v3, 0x0

    .line 18
    invoke-direct {v2, v3, p0}, Lcom/friday/common/camera/ImagePickFragment$special$$inlined$activityViewModels$default$2;-><init>(Lhd/a;Landroidx/fragment/app/Fragment;)V

    .line 19
    .line 20
    .line 21
    new-instance v3, Lcom/friday/common/camera/ImagePickFragment$special$$inlined$activityViewModels$default$3;

    .line 22
    .line 23
    invoke-direct {v3, p0}, Lcom/friday/common/camera/ImagePickFragment$special$$inlined$activityViewModels$default$3;-><init>(Landroidx/fragment/app/Fragment;)V

    .line 24
    .line 25
    .line 26
    invoke-static {p0, v0, v1, v2, v3}, Landroidx/fragment/app/FragmentViewModelLazyKt;->createViewModelLazy(Landroidx/fragment/app/Fragment;Lod/c;Lhd/a;Lhd/a;Lhd/a;)Lqc/d;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    iput-object v0, p0, Lcom/friday/common/camera/ImagePickFragment;->i:Lqc/d;

    .line 31
    .line 32
    new-instance v0, Landroidx/activity/result/contract/ActivityResultContracts$RequestPermission;

    .line 33
    .line 34
    invoke-direct {v0}, Landroidx/activity/result/contract/ActivityResultContracts$RequestPermission;-><init>()V

    .line 35
    .line 36
    .line 37
    new-instance v1, Lb2/p;

    .line 38
    .line 39
    invoke-direct {v1, p0}, Lb2/p;-><init>(Lcom/friday/common/camera/ImagePickFragment;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {p0, v0, v1}, Landroidx/fragment/app/Fragment;->registerForActivityResult(Landroidx/activity/result/contract/ActivityResultContract;Landroidx/activity/result/ActivityResultCallback;)Landroidx/activity/result/ActivityResultLauncher;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    const-string v1, "registerForActivityResult(...)"

    .line 47
    .line 48
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    iput-object v0, p0, Lcom/friday/common/camera/ImagePickFragment;->q:Landroidx/activity/result/ActivityResultLauncher;

    .line 52
    .line 53
    return-void
.end method

.method public static final synthetic A(Lcom/friday/common/camera/ImagePickFragment;)Lcom/friday/common/camera/CameraViewModel;
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/friday/common/camera/ImagePickFragment;->H()Lcom/friday/common/camera/CameraViewModel;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic B(Lcom/friday/common/camera/ImagePickFragment;F)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/friday/common/camera/ImagePickFragment;->T(F)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic C(Lcom/friday/common/camera/ImagePickFragment;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/friday/common/camera/ImagePickFragment;->U()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final E(Lcom/friday/common/camera/ImagePickFragment;Landroid/view/View;)V
    .locals 2

    .line 1
    invoke-static {p1}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    const/16 v0, 0x8

    .line 5
    .line 6
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 7
    .line 8
    .line 9
    iget-object p1, p0, Lcom/friday/common/camera/ImagePickFragment;->m:Lcom/friday/common/databinding/FragmentImagePickBinding;

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    if-nez p1, :cond_0

    .line 13
    .line 14
    const-string p1, "mBindView"

    .line 15
    .line 16
    invoke-static {p1}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    move-object p1, v0

    .line 20
    :cond_0
    iget-object p1, p1, Lcom/friday/common/databinding/FragmentImagePickBinding;->g:Lcom/friday/common/camera/ZoomControlView;

    .line 21
    .line 22
    const-string v1, "dbView"

    .line 23
    .line 24
    invoke-static {p1, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    const/4 v1, 0x0

    .line 28
    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    .line 29
    .line 30
    .line 31
    iget-object p1, p0, Lcom/friday/common/camera/ImagePickFragment;->w:Lkotlinx/coroutines/g;

    .line 32
    .line 33
    if-eqz p1, :cond_1

    .line 34
    .line 35
    invoke-interface {p1}, Lkotlinx/coroutines/g;->isActive()Z

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    const/4 v1, 0x1

    .line 40
    if-ne p1, v1, :cond_1

    .line 41
    .line 42
    iget-object p0, p0, Lcom/friday/common/camera/ImagePickFragment;->w:Lkotlinx/coroutines/g;

    .line 43
    .line 44
    if-eqz p0, :cond_1

    .line 45
    .line 46
    invoke-static {p0, v0, v1, v0}, Lkotlinx/coroutines/g$a;->a(Lkotlinx/coroutines/g;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    :cond_1
    return-void
.end method

.method public static final F(Lcom/friday/common/camera/ImagePickFragment;Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 6

    .line 1
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    const/4 v0, 0x1

    .line 6
    const/4 v1, 0x0

    .line 7
    if-eqz p1, :cond_d

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    const-string v3, "mBindView"

    .line 11
    .line 12
    if-eq p1, v0, :cond_9

    .line 13
    .line 14
    const/4 v4, 0x2

    .line 15
    if-eq p1, v4, :cond_0

    .line 16
    .line 17
    goto/16 :goto_2

    .line 18
    .line 19
    :cond_0
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    iget p2, p0, Lcom/friday/common/camera/ImagePickFragment;->r:F

    .line 24
    .line 25
    sub-float/2addr p1, p2

    .line 26
    iget p2, p0, Lcom/friday/common/camera/ImagePickFragment;->t:F

    .line 27
    .line 28
    iget v4, p0, Lcom/friday/common/camera/ImagePickFragment;->s:F

    .line 29
    .line 30
    sub-float v4, p1, v4

    .line 31
    .line 32
    add-float/2addr p2, v4

    .line 33
    iput p2, p0, Lcom/friday/common/camera/ImagePickFragment;->t:F

    .line 34
    .line 35
    iput p1, p0, Lcom/friday/common/camera/ImagePickFragment;->s:F

    .line 36
    .line 37
    iget-object p1, p0, Lcom/friday/common/camera/ImagePickFragment;->m:Lcom/friday/common/databinding/FragmentImagePickBinding;

    .line 38
    .line 39
    if-nez p1, :cond_1

    .line 40
    .line 41
    invoke-static {v3}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    move-object p1, v1

    .line 45
    :cond_1
    iget-object p1, p1, Lcom/friday/common/databinding/FragmentImagePickBinding;->g:Lcom/friday/common/camera/ZoomControlView;

    .line 46
    .line 47
    invoke-virtual {p1}, Lcom/friday/common/camera/ZoomControlView;->getRealTimeValue()F

    .line 48
    .line 49
    .line 50
    move-result p1

    .line 51
    iget p2, p0, Lcom/friday/common/camera/ImagePickFragment;->t:F

    .line 52
    .line 53
    const/high16 v4, 0x40a00000    # 5.0f

    .line 54
    .line 55
    cmpl-float v4, p2, v4

    .line 56
    .line 57
    const v5, 0x3dcccccd    # 0.1f

    .line 58
    .line 59
    .line 60
    if-lez v4, :cond_3

    .line 61
    .line 62
    iget-object p2, p0, Lcom/friday/common/camera/ImagePickFragment;->m:Lcom/friday/common/databinding/FragmentImagePickBinding;

    .line 63
    .line 64
    if-nez p2, :cond_2

    .line 65
    .line 66
    invoke-static {v3}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    move-object p2, v1

    .line 70
    :cond_2
    iget-object p2, p2, Lcom/friday/common/databinding/FragmentImagePickBinding;->g:Lcom/friday/common/camera/ZoomControlView;

    .line 71
    .line 72
    sub-float v4, p1, v5

    .line 73
    .line 74
    invoke-virtual {p2, v4}, Lcom/friday/common/camera/ZoomControlView;->setRealTimeValue(F)V

    .line 75
    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_3
    const/high16 v4, -0x3f600000    # -5.0f

    .line 79
    .line 80
    cmpg-float p2, p2, v4

    .line 81
    .line 82
    if-gez p2, :cond_5

    .line 83
    .line 84
    iget-object p2, p0, Lcom/friday/common/camera/ImagePickFragment;->m:Lcom/friday/common/databinding/FragmentImagePickBinding;

    .line 85
    .line 86
    if-nez p2, :cond_4

    .line 87
    .line 88
    invoke-static {v3}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    move-object p2, v1

    .line 92
    :cond_4
    iget-object p2, p2, Lcom/friday/common/databinding/FragmentImagePickBinding;->g:Lcom/friday/common/camera/ZoomControlView;

    .line 93
    .line 94
    add-float/2addr v5, p1

    .line 95
    invoke-virtual {p2, v5}, Lcom/friday/common/camera/ZoomControlView;->setRealTimeValue(F)V

    .line 96
    .line 97
    .line 98
    :cond_5
    :goto_0
    iget-object p2, p0, Lcom/friday/common/camera/ImagePickFragment;->m:Lcom/friday/common/databinding/FragmentImagePickBinding;

    .line 99
    .line 100
    if-nez p2, :cond_6

    .line 101
    .line 102
    invoke-static {v3}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    move-object p2, v1

    .line 106
    :cond_6
    iget-object p2, p2, Lcom/friday/common/databinding/FragmentImagePickBinding;->g:Lcom/friday/common/camera/ZoomControlView;

    .line 107
    .line 108
    invoke-virtual {p2}, Lcom/friday/common/camera/ZoomControlView;->getRealTimeValue()F

    .line 109
    .line 110
    .line 111
    move-result p2

    .line 112
    cmpg-float p1, p2, p1

    .line 113
    .line 114
    if-nez p1, :cond_7

    .line 115
    .line 116
    goto/16 :goto_2

    .line 117
    .line 118
    :cond_7
    iput v2, p0, Lcom/friday/common/camera/ImagePickFragment;->t:F

    .line 119
    .line 120
    iget-object p1, p0, Lcom/friday/common/camera/ImagePickFragment;->m:Lcom/friday/common/databinding/FragmentImagePickBinding;

    .line 121
    .line 122
    if-nez p1, :cond_8

    .line 123
    .line 124
    invoke-static {v3}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 125
    .line 126
    .line 127
    goto :goto_1

    .line 128
    :cond_8
    move-object v1, p1

    .line 129
    :goto_1
    iget-object p1, v1, Lcom/friday/common/databinding/FragmentImagePickBinding;->g:Lcom/friday/common/camera/ZoomControlView;

    .line 130
    .line 131
    invoke-virtual {p1}, Lcom/friday/common/camera/ZoomControlView;->getRealTimeValue()F

    .line 132
    .line 133
    .line 134
    move-result p1

    .line 135
    invoke-virtual {p0, p1}, Lcom/friday/common/camera/ImagePickFragment;->T(F)V

    .line 136
    .line 137
    .line 138
    goto/16 :goto_2

    .line 139
    .line 140
    :cond_9
    new-instance p1, Landroid/graphics/Rect;

    .line 141
    .line 142
    invoke-direct {p1}, Landroid/graphics/Rect;-><init>()V

    .line 143
    .line 144
    .line 145
    iget-object v4, p0, Lcom/friday/common/camera/ImagePickFragment;->m:Lcom/friday/common/databinding/FragmentImagePickBinding;

    .line 146
    .line 147
    if-nez v4, :cond_a

    .line 148
    .line 149
    invoke-static {v3}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 150
    .line 151
    .line 152
    move-object v4, v1

    .line 153
    :cond_a
    iget-object v4, v4, Lcom/friday/common/databinding/FragmentImagePickBinding;->d:Landroid/widget/ImageView;

    .line 154
    .line 155
    invoke-virtual {v4, p1}, Landroid/view/View;->getGlobalVisibleRect(Landroid/graphics/Rect;)Z

    .line 156
    .line 157
    .line 158
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getRawX()F

    .line 159
    .line 160
    .line 161
    move-result v4

    .line 162
    iget v5, p1, Landroid/graphics/Rect;->left:I

    .line 163
    .line 164
    int-to-float v5, v5

    .line 165
    cmpl-float v4, v4, v5

    .line 166
    .line 167
    if-ltz v4, :cond_c

    .line 168
    .line 169
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getRawX()F

    .line 170
    .line 171
    .line 172
    move-result v4

    .line 173
    iget v5, p1, Landroid/graphics/Rect;->right:I

    .line 174
    .line 175
    int-to-float v5, v5

    .line 176
    cmpg-float v4, v4, v5

    .line 177
    .line 178
    if-gtz v4, :cond_c

    .line 179
    .line 180
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getRawY()F

    .line 181
    .line 182
    .line 183
    move-result v4

    .line 184
    iget v5, p1, Landroid/graphics/Rect;->top:I

    .line 185
    .line 186
    int-to-float v5, v5

    .line 187
    cmpl-float v4, v4, v5

    .line 188
    .line 189
    if-ltz v4, :cond_c

    .line 190
    .line 191
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getRawY()F

    .line 192
    .line 193
    .line 194
    move-result p2

    .line 195
    iget v4, p1, Landroid/graphics/Rect;->bottom:I

    .line 196
    .line 197
    int-to-float v5, v4

    .line 198
    cmpg-float p2, p2, v5

    .line 199
    .line 200
    if-gtz p2, :cond_c

    .line 201
    .line 202
    iget p2, p0, Lcom/friday/common/camera/ImagePickFragment;->u:F

    .line 203
    .line 204
    iget v5, p1, Landroid/graphics/Rect;->left:I

    .line 205
    .line 206
    int-to-float v5, v5

    .line 207
    cmpl-float v5, p2, v5

    .line 208
    .line 209
    if-ltz v5, :cond_c

    .line 210
    .line 211
    iget v5, p1, Landroid/graphics/Rect;->right:I

    .line 212
    .line 213
    int-to-float v5, v5

    .line 214
    cmpg-float p2, p2, v5

    .line 215
    .line 216
    if-gtz p2, :cond_c

    .line 217
    .line 218
    iget p2, p0, Lcom/friday/common/camera/ImagePickFragment;->v:F

    .line 219
    .line 220
    iget p1, p1, Landroid/graphics/Rect;->top:I

    .line 221
    .line 222
    int-to-float p1, p1

    .line 223
    cmpl-float p1, p2, p1

    .line 224
    .line 225
    if-ltz p1, :cond_c

    .line 226
    .line 227
    int-to-float p1, v4

    .line 228
    cmpg-float p1, p2, p1

    .line 229
    .line 230
    if-gtz p1, :cond_c

    .line 231
    .line 232
    iget-object p1, p0, Lcom/friday/common/camera/ImagePickFragment;->m:Lcom/friday/common/databinding/FragmentImagePickBinding;

    .line 233
    .line 234
    if-nez p1, :cond_b

    .line 235
    .line 236
    invoke-static {v3}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 237
    .line 238
    .line 239
    move-object p1, v1

    .line 240
    :cond_b
    iget-object p1, p1, Lcom/friday/common/databinding/FragmentImagePickBinding;->d:Landroid/widget/ImageView;

    .line 241
    .line 242
    invoke-virtual {p1}, Landroid/view/View;->performClick()Z

    .line 243
    .line 244
    .line 245
    :cond_c
    const-wide/16 p1, 0x0

    .line 246
    .line 247
    invoke-static {p0, p1, p2, v0, v1}, Lcom/friday/common/camera/ImagePickFragment;->R(Lcom/friday/common/camera/ImagePickFragment;JILjava/lang/Object;)V

    .line 248
    .line 249
    .line 250
    iput v2, p0, Lcom/friday/common/camera/ImagePickFragment;->s:F

    .line 251
    .line 252
    iput v2, p0, Lcom/friday/common/camera/ImagePickFragment;->t:F

    .line 253
    .line 254
    goto :goto_2

    .line 255
    :cond_d
    iget-object p1, p0, Lcom/friday/common/camera/ImagePickFragment;->w:Lkotlinx/coroutines/g;

    .line 256
    .line 257
    if-eqz p1, :cond_e

    .line 258
    .line 259
    invoke-interface {p1}, Lkotlinx/coroutines/g;->isActive()Z

    .line 260
    .line 261
    .line 262
    move-result p1

    .line 263
    if-ne p1, v0, :cond_e

    .line 264
    .line 265
    iget-object p1, p0, Lcom/friday/common/camera/ImagePickFragment;->w:Lkotlinx/coroutines/g;

    .line 266
    .line 267
    if-eqz p1, :cond_e

    .line 268
    .line 269
    invoke-static {p1, v1, v0, v1}, Lkotlinx/coroutines/g$a;->a(Lkotlinx/coroutines/g;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    .line 270
    .line 271
    .line 272
    :cond_e
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getRawX()F

    .line 273
    .line 274
    .line 275
    move-result p1

    .line 276
    iput p1, p0, Lcom/friday/common/camera/ImagePickFragment;->u:F

    .line 277
    .line 278
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getRawY()F

    .line 279
    .line 280
    .line 281
    move-result p1

    .line 282
    iput p1, p0, Lcom/friday/common/camera/ImagePickFragment;->v:F

    .line 283
    .line 284
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F

    .line 285
    .line 286
    .line 287
    move-result p1

    .line 288
    iput p1, p0, Lcom/friday/common/camera/ImagePickFragment;->r:F

    .line 289
    .line 290
    :goto_2
    return v0
.end method

.method private final H()Lcom/friday/common/camera/CameraViewModel;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/common/camera/ImagePickFragment;->i:Lqc/d;

    .line 2
    .line 3
    invoke-interface {v0}, Lqc/d;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/friday/common/camera/CameraViewModel;

    .line 8
    .line 9
    return-object v0
.end method

.method public static final I(Lcom/friday/common/camera/ImagePickFragment;Landroid/view/View;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/friday/common/camera/ImagePickFragment;->o:Lcom/friday/common/camera/CameraBean;

    .line 2
    .line 3
    if-eqz p1, :cond_1

    .line 4
    .line 5
    iget-object p1, p0, Lcom/friday/common/camera/ImagePickFragment;->m:Lcom/friday/common/databinding/FragmentImagePickBinding;

    .line 6
    .line 7
    if-nez p1, :cond_0

    .line 8
    .line 9
    const-string p1, "mBindView"

    .line 10
    .line 11
    invoke-static {p1}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    const/4 p1, 0x0

    .line 15
    :cond_0
    iget-object p1, p1, Lcom/friday/common/databinding/FragmentImagePickBinding;->d:Landroid/widget/ImageView;

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    invoke-virtual {p1, v0}, Landroid/view/View;->setEnabled(Z)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0}, Lcom/friday/common/camera/ImagePickFragment;->S()V

    .line 22
    .line 23
    .line 24
    :cond_1
    return-void
.end method

.method public static final J(Lcom/friday/common/camera/ImagePickFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/friday/common/camera/ImagePickFragment;->G()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final K(Lcom/friday/common/camera/ImagePickFragment;Landroid/widget/CompoundButton;Z)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/friday/common/camera/ImagePickFragment;->l:Landroidx/camera/core/CameraControl;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-interface {p0, p2}, Landroidx/camera/core/CameraControl;->enableTorch(Z)Lcom/google/common/util/concurrent/ListenableFuture;

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public static final M(Lcom/friday/common/camera/ImagePickFragment;Z)V
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/friday/common/camera/ImagePickFragment;->P()V

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :cond_0
    const/4 p1, 0x0

    .line 8
    new-array p1, p1, [Ljava/lang/Object;

    .line 9
    .line 10
    const-string v0, "\u6ca1\u6709\u62cd\u7167\u6743\u9650"

    .line 11
    .line 12
    invoke-static {v0, p1}, Lcom/blankj/utilcode/util/ToastUtils;->showShort(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireActivity()Landroidx/fragment/app/FragmentActivity;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public static final O(Lcom/friday/common/camera/ImagePickFragment;Lcom/google/common/util/concurrent/ListenableFuture;)V
    .locals 0

    .line 1
    invoke-interface {p1}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Landroidx/camera/lifecycle/ProcessCameraProvider;

    .line 6
    .line 7
    iput-object p1, p0, Lcom/friday/common/camera/ImagePickFragment;->j:Landroidx/camera/lifecycle/ProcessCameraProvider;

    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/friday/common/camera/ImagePickFragment;->D()V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public static synthetic R(Lcom/friday/common/camera/ImagePickFragment;JILjava/lang/Object;)V
    .locals 0

    .line 1
    and-int/lit8 p3, p3, 0x1

    .line 2
    .line 3
    if-eqz p3, :cond_0

    .line 4
    .line 5
    const-wide/16 p1, 0xbb8

    .line 6
    .line 7
    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/friday/common/camera/ImagePickFragment;->Q(J)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method private final initData()V
    .locals 2

    .line 1
    new-instance v0, Landroidx/camera/core/Preview$Builder;

    .line 2
    .line 3
    invoke-direct {v0}, Landroidx/camera/core/Preview$Builder;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-virtual {v0, v1}, Landroidx/camera/core/Preview$Builder;->setTargetAspectRatio(I)Landroidx/camera/core/Preview$Builder;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0}, Landroidx/camera/core/Preview$Builder;->build()Landroidx/camera/core/Preview;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iput-object v0, p0, Lcom/friday/common/camera/ImagePickFragment;->p:Landroidx/camera/core/Preview;

    .line 16
    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    iget-object v1, p0, Lcom/friday/common/camera/ImagePickFragment;->m:Lcom/friday/common/databinding/FragmentImagePickBinding;

    .line 20
    .line 21
    if-nez v1, :cond_0

    .line 22
    .line 23
    const-string v1, "mBindView"

    .line 24
    .line 25
    invoke-static {v1}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    const/4 v1, 0x0

    .line 29
    :cond_0
    iget-object v1, v1, Lcom/friday/common/databinding/FragmentImagePickBinding;->j:Landroidx/camera/view/PreviewView;

    .line 30
    .line 31
    invoke-virtual {v1}, Landroidx/camera/view/PreviewView;->getSurfaceProvider()Landroidx/camera/core/Preview$SurfaceProvider;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-virtual {v0, v1}, Landroidx/camera/core/Preview;->setSurfaceProvider(Landroidx/camera/core/Preview$SurfaceProvider;)V

    .line 36
    .line 37
    .line 38
    :cond_1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    const-string v1, "android.permission.CAMERA"

    .line 43
    .line 44
    invoke-static {v0, v1}, Landroidx/core/content/ContextCompat;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    if-nez v0, :cond_2

    .line 49
    .line 50
    invoke-virtual {p0}, Lcom/friday/common/camera/ImagePickFragment;->P()V

    .line 51
    .line 52
    .line 53
    return-void

    .line 54
    :cond_2
    invoke-virtual {p0}, Lcom/friday/common/camera/ImagePickFragment;->L()V

    .line 55
    .line 56
    .line 57
    return-void
.end method

.method private final initView()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/friday/common/camera/ImagePickFragment;->m:Lcom/friday/common/databinding/FragmentImagePickBinding;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "mBindView"

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    invoke-static {v2}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    move-object v0, v1

    .line 12
    :cond_0
    iget-object v0, v0, Lcom/friday/common/databinding/FragmentImagePickBinding;->d:Landroid/widget/ImageView;

    .line 13
    .line 14
    new-instance v3, Lb2/m;

    .line 15
    .line 16
    invoke-direct {v3, p0}, Lb2/m;-><init>(Lcom/friday/common/camera/ImagePickFragment;)V

    .line 17
    .line 18
    .line 19
    invoke-static {v0, v3}, Lcom/blankj/utilcode/util/ClickUtils;->applySingleDebouncing(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    .line 20
    .line 21
    .line 22
    iget-object v0, p0, Lcom/friday/common/camera/ImagePickFragment;->m:Lcom/friday/common/databinding/FragmentImagePickBinding;

    .line 23
    .line 24
    if-nez v0, :cond_1

    .line 25
    .line 26
    invoke-static {v2}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    move-object v0, v1

    .line 30
    :cond_1
    iget-object v0, v0, Lcom/friday/common/databinding/FragmentImagePickBinding;->c:Landroid/widget/ImageView;

    .line 31
    .line 32
    new-instance v3, Lb2/n;

    .line 33
    .line 34
    invoke-direct {v3, p0}, Lb2/n;-><init>(Lcom/friday/common/camera/ImagePickFragment;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 38
    .line 39
    .line 40
    iget-object v0, p0, Lcom/friday/common/camera/ImagePickFragment;->m:Lcom/friday/common/databinding/FragmentImagePickBinding;

    .line 41
    .line 42
    if-nez v0, :cond_2

    .line 43
    .line 44
    invoke-static {v2}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_2
    move-object v1, v0

    .line 49
    :goto_0
    iget-object v0, v1, Lcom/friday/common/databinding/FragmentImagePickBinding;->e:Landroid/widget/CheckBox;

    .line 50
    .line 51
    new-instance v1, Lb2/o;

    .line 52
    .line 53
    invoke-direct {v1, p0}, Lb2/o;-><init>(Lcom/friday/common/camera/ImagePickFragment;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v0, v1}, Landroid/widget/CompoundButton;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 57
    .line 58
    .line 59
    return-void
.end method

.method public static synthetic p(Lcom/friday/common/camera/ImagePickFragment;Lcom/google/common/util/concurrent/ListenableFuture;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/common/camera/ImagePickFragment;->O(Lcom/friday/common/camera/ImagePickFragment;Lcom/google/common/util/concurrent/ListenableFuture;)V

    return-void
.end method

.method public static synthetic q(Lcom/friday/common/camera/ImagePickFragment;Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/friday/common/camera/ImagePickFragment;->F(Lcom/friday/common/camera/ImagePickFragment;Landroid/view/View;Landroid/view/MotionEvent;)Z

    move-result p0

    return p0
.end method

.method public static synthetic r(Lcom/friday/common/camera/ImagePickFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/common/camera/ImagePickFragment;->I(Lcom/friday/common/camera/ImagePickFragment;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic s(Lcom/friday/common/camera/ImagePickFragment;Z)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/common/camera/ImagePickFragment;->M(Lcom/friday/common/camera/ImagePickFragment;Z)V

    return-void
.end method

.method public static synthetic t(Lcom/friday/common/camera/ImagePickFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/common/camera/ImagePickFragment;->E(Lcom/friday/common/camera/ImagePickFragment;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic u(Lcom/friday/common/camera/ImagePickFragment;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/friday/common/camera/ImagePickFragment;->J(Lcom/friday/common/camera/ImagePickFragment;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic v(Lcom/friday/common/camera/ImagePickFragment;Landroid/widget/CompoundButton;Z)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/friday/common/camera/ImagePickFragment;->K(Lcom/friday/common/camera/ImagePickFragment;Landroid/widget/CompoundButton;Z)V

    return-void
.end method

.method public static final synthetic w(Lcom/friday/common/camera/ImagePickFragment;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/friday/common/camera/ImagePickFragment;->G()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic x(Lcom/friday/common/camera/ImagePickFragment;)Landroidx/camera/core/Camera;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/friday/common/camera/ImagePickFragment;->n:Landroidx/camera/core/Camera;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic y(Lcom/friday/common/camera/ImagePickFragment;)Lcom/friday/common/camera/CameraBean;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/friday/common/camera/ImagePickFragment;->o:Lcom/friday/common/camera/CameraBean;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic z(Lcom/friday/common/camera/ImagePickFragment;)Lcom/friday/common/databinding/FragmentImagePickBinding;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/friday/common/camera/ImagePickFragment;->m:Lcom/friday/common/databinding/FragmentImagePickBinding;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public final D()V
    .locals 11

    .line 1
    new-instance v0, Landroidx/camera/core/ImageCapture$Builder;

    .line 2
    .line 3
    invoke-direct {v0}, Landroidx/camera/core/ImageCapture$Builder;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-virtual {v0, v1}, Landroidx/camera/core/ImageCapture$Builder;->setTargetAspectRatio(I)Landroidx/camera/core/ImageCapture$Builder;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0}, Landroidx/camera/core/ImageCapture$Builder;->build()Landroidx/camera/core/ImageCapture;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iput-object v0, p0, Lcom/friday/common/camera/ImagePickFragment;->k:Landroidx/camera/core/ImageCapture;

    .line 16
    .line 17
    iget-object v0, p0, Lcom/friday/common/camera/ImagePickFragment;->j:Landroidx/camera/lifecycle/ProcessCameraProvider;

    .line 18
    .line 19
    const-string v2, "getViewLifecycleOwner(...)"

    .line 20
    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    invoke-virtual {v0}, Landroidx/camera/lifecycle/ProcessCameraProvider;->unbindAll()V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    invoke-static {v3, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    new-instance v4, Landroidx/camera/core/CameraSelector$Builder;

    .line 34
    .line 35
    invoke-direct {v4}, Landroidx/camera/core/CameraSelector$Builder;-><init>()V

    .line 36
    .line 37
    .line 38
    const/4 v5, 0x1

    .line 39
    invoke-virtual {v4, v5}, Landroidx/camera/core/CameraSelector$Builder;->requireLensFacing(I)Landroidx/camera/core/CameraSelector$Builder;

    .line 40
    .line 41
    .line 42
    move-result-object v4

    .line 43
    invoke-virtual {v4}, Landroidx/camera/core/CameraSelector$Builder;->build()Landroidx/camera/core/CameraSelector;

    .line 44
    .line 45
    .line 46
    move-result-object v4

    .line 47
    const-string v6, "build(...)"

    .line 48
    .line 49
    invoke-static {v4, v6}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    iget-object v6, p0, Lcom/friday/common/camera/ImagePickFragment;->k:Landroidx/camera/core/ImageCapture;

    .line 53
    .line 54
    iget-object v7, p0, Lcom/friday/common/camera/ImagePickFragment;->p:Landroidx/camera/core/Preview;

    .line 55
    .line 56
    const/4 v8, 0x2

    .line 57
    new-array v8, v8, [Landroidx/camera/core/UseCase;

    .line 58
    .line 59
    aput-object v6, v8, v1

    .line 60
    .line 61
    aput-object v7, v8, v5

    .line 62
    .line 63
    invoke-virtual {v0, v3, v4, v8}, Landroidx/camera/lifecycle/ProcessCameraProvider;->bindToLifecycle(Landroidx/lifecycle/LifecycleOwner;Landroidx/camera/core/CameraSelector;[Landroidx/camera/core/UseCase;)Landroidx/camera/core/Camera;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    invoke-interface {v0}, Landroidx/camera/core/Camera;->getCameraControl()Landroidx/camera/core/CameraControl;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    iput-object v1, p0, Lcom/friday/common/camera/ImagePickFragment;->l:Landroidx/camera/core/CameraControl;

    .line 72
    .line 73
    iput-object v0, p0, Lcom/friday/common/camera/ImagePickFragment;->n:Landroidx/camera/core/Camera;

    .line 74
    .line 75
    :cond_0
    new-instance v0, Lcom/friday/common/camera/ImagePickFragment$d;

    .line 76
    .line 77
    invoke-direct {v0, p0}, Lcom/friday/common/camera/ImagePickFragment$d;-><init>(Lcom/friday/common/camera/ImagePickFragment;)V

    .line 78
    .line 79
    .line 80
    new-instance v1, Landroid/view/ScaleGestureDetector;

    .line 81
    .line 82
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 83
    .line 84
    .line 85
    move-result-object v3

    .line 86
    invoke-direct {v1, v3, v0}, Landroid/view/ScaleGestureDetector;-><init>(Landroid/content/Context;Landroid/view/ScaleGestureDetector$OnScaleGestureListener;)V

    .line 87
    .line 88
    .line 89
    iget-object v0, p0, Lcom/friday/common/camera/ImagePickFragment;->m:Lcom/friday/common/databinding/FragmentImagePickBinding;

    .line 90
    .line 91
    const-string v3, "mBindView"

    .line 92
    .line 93
    const/4 v4, 0x0

    .line 94
    if-nez v0, :cond_1

    .line 95
    .line 96
    invoke-static {v3}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    move-object v0, v4

    .line 100
    :cond_1
    iget-object v0, v0, Lcom/friday/common/databinding/FragmentImagePickBinding;->j:Landroidx/camera/view/PreviewView;

    .line 101
    .line 102
    const-string v5, "prevView"

    .line 103
    .line 104
    invoke-static {v0, v5}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 108
    .line 109
    .line 110
    move-result-object v5

    .line 111
    new-instance v6, Lcom/friday/common/camera/ImagePickFragment$b;

    .line 112
    .line 113
    invoke-direct {v6, v0, p0, v1}, Lcom/friday/common/camera/ImagePickFragment$b;-><init>(Landroid/view/View;Lcom/friday/common/camera/ImagePickFragment;Landroid/view/ScaleGestureDetector;)V

    .line 114
    .line 115
    .line 116
    invoke-virtual {v5, v6}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 117
    .line 118
    .line 119
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 120
    .line 121
    .line 122
    move-result-object v0

    .line 123
    invoke-static {v0, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 124
    .line 125
    .line 126
    invoke-static {v0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 127
    .line 128
    .line 129
    move-result-object v5

    .line 130
    new-instance v8, Lcom/friday/common/camera/ImagePickFragment$bindCameraUseCases$3;

    .line 131
    .line 132
    invoke-direct {v8, p0, v4}, Lcom/friday/common/camera/ImagePickFragment$bindCameraUseCases$3;-><init>(Lcom/friday/common/camera/ImagePickFragment;Lvc/c;)V

    .line 133
    .line 134
    .line 135
    const/4 v9, 0x3

    .line 136
    const/4 v10, 0x0

    .line 137
    const/4 v6, 0x0

    .line 138
    const/4 v7, 0x0

    .line 139
    invoke-static/range {v5 .. v10}, Lsd/f;->d(Lsd/i0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lhd/p;ILjava/lang/Object;)Lkotlinx/coroutines/g;

    .line 140
    .line 141
    .line 142
    iget-object v0, p0, Lcom/friday/common/camera/ImagePickFragment;->m:Lcom/friday/common/databinding/FragmentImagePickBinding;

    .line 143
    .line 144
    if-nez v0, :cond_2

    .line 145
    .line 146
    invoke-static {v3}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 147
    .line 148
    .line 149
    move-object v0, v4

    .line 150
    :cond_2
    iget-object v0, v0, Lcom/friday/common/databinding/FragmentImagePickBinding;->g:Lcom/friday/common/camera/ZoomControlView;

    .line 151
    .line 152
    new-instance v1, Lb2/q;

    .line 153
    .line 154
    invoke-direct {v1, p0}, Lb2/q;-><init>(Lcom/friday/common/camera/ImagePickFragment;)V

    .line 155
    .line 156
    .line 157
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 158
    .line 159
    .line 160
    iget-object v0, p0, Lcom/friday/common/camera/ImagePickFragment;->m:Lcom/friday/common/databinding/FragmentImagePickBinding;

    .line 161
    .line 162
    if-nez v0, :cond_3

    .line 163
    .line 164
    invoke-static {v3}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 165
    .line 166
    .line 167
    move-object v0, v4

    .line 168
    :cond_3
    iget-object v0, v0, Lcom/friday/common/databinding/FragmentImagePickBinding;->f:Landroidx/cardview/widget/CardView;

    .line 169
    .line 170
    new-instance v1, Lb2/r;

    .line 171
    .line 172
    invoke-direct {v1, p0}, Lb2/r;-><init>(Lcom/friday/common/camera/ImagePickFragment;)V

    .line 173
    .line 174
    .line 175
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 176
    .line 177
    .line 178
    iget-object v0, p0, Lcom/friday/common/camera/ImagePickFragment;->n:Landroidx/camera/core/Camera;

    .line 179
    .line 180
    if-nez v0, :cond_4

    .line 181
    .line 182
    const-string v0, "camera"

    .line 183
    .line 184
    invoke-static {v0}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 185
    .line 186
    .line 187
    move-object v0, v4

    .line 188
    :cond_4
    invoke-interface {v0}, Landroidx/camera/core/Camera;->getCameraInfo()Landroidx/camera/core/CameraInfo;

    .line 189
    .line 190
    .line 191
    move-result-object v0

    .line 192
    invoke-interface {v0}, Landroidx/camera/core/CameraInfo;->getZoomState()Landroidx/lifecycle/LiveData;

    .line 193
    .line 194
    .line 195
    move-result-object v0

    .line 196
    invoke-virtual {v0}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 197
    .line 198
    .line 199
    move-result-object v0

    .line 200
    check-cast v0, Landroidx/camera/core/ZoomState;

    .line 201
    .line 202
    if-eqz v0, :cond_6

    .line 203
    .line 204
    invoke-interface {v0}, Landroidx/camera/core/ZoomState;->getMaxZoomRatio()F

    .line 205
    .line 206
    .line 207
    move-result v0

    .line 208
    iget-object v1, p0, Lcom/friday/common/camera/ImagePickFragment;->m:Lcom/friday/common/databinding/FragmentImagePickBinding;

    .line 209
    .line 210
    if-nez v1, :cond_5

    .line 211
    .line 212
    invoke-static {v3}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 213
    .line 214
    .line 215
    move-object v1, v4

    .line 216
    :cond_5
    iget-object v1, v1, Lcom/friday/common/databinding/FragmentImagePickBinding;->g:Lcom/friday/common/camera/ZoomControlView;

    .line 217
    .line 218
    invoke-static {v0}, Ljd/c;->d(F)I

    .line 219
    .line 220
    .line 221
    move-result v0

    .line 222
    invoke-virtual {v1, v0}, Lcom/friday/common/camera/ZoomControlView;->d(I)V

    .line 223
    .line 224
    .line 225
    :cond_6
    iget-object v0, p0, Lcom/friday/common/camera/ImagePickFragment;->m:Lcom/friday/common/databinding/FragmentImagePickBinding;

    .line 226
    .line 227
    if-nez v0, :cond_7

    .line 228
    .line 229
    invoke-static {v3}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 230
    .line 231
    .line 232
    move-object v0, v4

    .line 233
    :cond_7
    iget-object v0, v0, Lcom/friday/common/databinding/FragmentImagePickBinding;->g:Lcom/friday/common/camera/ZoomControlView;

    .line 234
    .line 235
    invoke-direct {p0}, Lcom/friday/common/camera/ImagePickFragment;->H()Lcom/friday/common/camera/CameraViewModel;

    .line 236
    .line 237
    .line 238
    move-result-object v1

    .line 239
    invoke-virtual {v1}, Lcom/friday/common/camera/CameraViewModel;->e()F

    .line 240
    .line 241
    .line 242
    move-result v1

    .line 243
    invoke-virtual {v0, v1}, Lcom/friday/common/camera/ZoomControlView;->setRealTimeValue(F)V

    .line 244
    .line 245
    .line 246
    invoke-direct {p0}, Lcom/friday/common/camera/ImagePickFragment;->H()Lcom/friday/common/camera/CameraViewModel;

    .line 247
    .line 248
    .line 249
    move-result-object v0

    .line 250
    invoke-virtual {v0}, Lcom/friday/common/camera/CameraViewModel;->e()F

    .line 251
    .line 252
    .line 253
    move-result v0

    .line 254
    invoke-virtual {p0, v0}, Lcom/friday/common/camera/ImagePickFragment;->T(F)V

    .line 255
    .line 256
    .line 257
    iget-object v0, p0, Lcom/friday/common/camera/ImagePickFragment;->m:Lcom/friday/common/databinding/FragmentImagePickBinding;

    .line 258
    .line 259
    if-nez v0, :cond_8

    .line 260
    .line 261
    invoke-static {v3}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 262
    .line 263
    .line 264
    goto :goto_0

    .line 265
    :cond_8
    move-object v4, v0

    .line 266
    :goto_0
    iget-object v0, v4, Lcom/friday/common/databinding/FragmentImagePickBinding;->k:Landroid/widget/TextView;

    .line 267
    .line 268
    sget v1, Lcom/friday/common/R$string;->zoom_control_value:I

    .line 269
    .line 270
    invoke-direct {p0}, Lcom/friday/common/camera/ImagePickFragment;->H()Lcom/friday/common/camera/CameraViewModel;

    .line 271
    .line 272
    .line 273
    move-result-object v2

    .line 274
    invoke-virtual {v2}, Lcom/friday/common/camera/CameraViewModel;->e()F

    .line 275
    .line 276
    .line 277
    move-result v2

    .line 278
    invoke-static {v2}, Ljava/lang/String;->valueOf(F)Ljava/lang/String;

    .line 279
    .line 280
    .line 281
    move-result-object v2

    .line 282
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 283
    .line 284
    .line 285
    move-result-object v2

    .line 286
    invoke-virtual {p0, v1, v2}, Landroidx/fragment/app/Fragment;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 287
    .line 288
    .line 289
    move-result-object v1

    .line 290
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 291
    .line 292
    .line 293
    return-void
.end method

.method public final G()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/friday/common/camera/ImagePickFragment;->o:Lcom/friday/common/camera/CameraBean;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/friday/common/camera/CameraBean;->l()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    const-string v0, "key_class_bitmap"

    .line 12
    .line 13
    const-class v1, Landroid/graphics/Bitmap;

    .line 14
    .line 15
    invoke-static {v0, v1}, Lcom/jeremyliao/liveeventbus/LiveEventBus;->get(Ljava/lang/String;Ljava/lang/Class;)Lcom/jeremyliao/liveeventbus/core/Observable;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    const/4 v1, 0x0

    .line 20
    invoke-interface {v0, v1}, Lcom/jeremyliao/liveeventbus/core/Observable;->post(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    :cond_0
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireActivity()Landroidx/fragment/app/FragmentActivity;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-virtual {v0}, Landroid/app/Activity;->finish()V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public final L()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/friday/common/camera/ImagePickFragment;->q:Landroidx/activity/result/ActivityResultLauncher;

    .line 2
    .line 3
    const-string v1, "android.permission.CAMERA"

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Landroidx/activity/result/ActivityResultLauncher;->launch(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final N()V
    .locals 3

    .line 1
    sget-object v0, Landroidx/camera/lifecycle/ProcessCameraProvider;->Companion:Landroidx/camera/lifecycle/ProcessCameraProvider$Companion;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    const-string v2, "requireContext(...)"

    .line 8
    .line 9
    invoke-static {v1, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, v1}, Landroidx/camera/lifecycle/ProcessCameraProvider$Companion;->getInstance(Landroid/content/Context;)Lcom/google/common/util/concurrent/ListenableFuture;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    new-instance v1, Lb2/l;

    .line 17
    .line 18
    invoke-direct {v1, p0, v0}, Lb2/l;-><init>(Lcom/friday/common/camera/ImagePickFragment;Lcom/google/common/util/concurrent/ListenableFuture;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    invoke-static {v2}, Landroidx/core/content/ContextCompat;->getMainExecutor(Landroid/content/Context;)Ljava/util/concurrent/Executor;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    invoke-interface {v0, v1, v2}, Lcom/google/common/util/concurrent/ListenableFuture;->addListener(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 30
    .line 31
    .line 32
    return-void
.end method

.method public final P()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/friday/common/camera/ImagePickFragment;->N()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final Q(J)V
    .locals 9

    .line 1
    iget-object v0, p0, Lcom/friday/common/camera/ImagePickFragment;->w:Lkotlinx/coroutines/g;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    const/4 v2, 0x1

    .line 7
    invoke-static {v0, v1, v2, v1}, Lkotlinx/coroutines/g$a;->a(Lkotlinx/coroutines/g;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    const-string v2, "getViewLifecycleOwner(...)"

    .line 15
    .line 16
    invoke-static {v0, v2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    invoke-static {v0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    new-instance v6, Lcom/friday/common/camera/ImagePickFragment$startJob$1;

    .line 24
    .line 25
    invoke-direct {v6, p1, p2, p0, v1}, Lcom/friday/common/camera/ImagePickFragment$startJob$1;-><init>(JLcom/friday/common/camera/ImagePickFragment;Lvc/c;)V

    .line 26
    .line 27
    .line 28
    const/4 v7, 0x3

    .line 29
    const/4 v8, 0x0

    .line 30
    const/4 v4, 0x0

    .line 31
    const/4 v5, 0x0

    .line 32
    invoke-static/range {v3 .. v8}, Lsd/f;->d(Lsd/i0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lhd/p;ILjava/lang/Object;)Lkotlinx/coroutines/g;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    iput-object p1, p0, Lcom/friday/common/camera/ImagePickFragment;->w:Lkotlinx/coroutines/g;

    .line 37
    .line 38
    return-void
.end method

.method public final S()V
    .locals 4

    .line 1
    new-instance v0, Ljava/io/File;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/friday/common/camera/ImagePickFragment;->o:Lcom/friday/common/camera/CameraBean;

    .line 4
    .line 5
    invoke-static {v1}, Lkotlin/jvm/internal/u;->d(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v1}, Lcom/friday/common/camera/CameraBean;->i()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    new-instance v1, Landroidx/camera/core/ImageCapture$OutputFileOptions$Builder;

    .line 16
    .line 17
    invoke-direct {v1, v0}, Landroidx/camera/core/ImageCapture$OutputFileOptions$Builder;-><init>(Ljava/io/File;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v1}, Landroidx/camera/core/ImageCapture$OutputFileOptions$Builder;->build()Landroidx/camera/core/ImageCapture$OutputFileOptions;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    const-string v1, "build(...)"

    .line 25
    .line 26
    invoke-static {v0, v1}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    iget-object v1, p0, Lcom/friday/common/camera/ImagePickFragment;->k:Landroidx/camera/core/ImageCapture;

    .line 30
    .line 31
    if-eqz v1, :cond_0

    .line 32
    .line 33
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    new-instance v3, Lcom/friday/common/camera/ImagePickFragment$takePic$1;

    .line 38
    .line 39
    invoke-direct {v3, p0}, Lcom/friday/common/camera/ImagePickFragment$takePic$1;-><init>(Lcom/friday/common/camera/ImagePickFragment;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v1, v0, v2, v3}, Landroidx/camera/core/ImageCapture;->takePicture(Landroidx/camera/core/ImageCapture$OutputFileOptions;Ljava/util/concurrent/Executor;Landroidx/camera/core/ImageCapture$OnImageSavedCallback;)V

    .line 43
    .line 44
    .line 45
    :cond_0
    return-void
.end method

.method public final T(F)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/common/camera/ImagePickFragment;->l:Landroidx/camera/core/CameraControl;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0, p1}, Landroidx/camera/core/CameraControl;->setZoomRatio(F)Lcom/google/common/util/concurrent/ListenableFuture;

    .line 6
    .line 7
    .line 8
    :cond_0
    invoke-direct {p0}, Lcom/friday/common/camera/ImagePickFragment;->H()Lcom/friday/common/camera/CameraViewModel;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {v0, p1}, Lcom/friday/common/camera/CameraViewModel;->g(F)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final U()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/friday/common/camera/ImagePickFragment;->m:Lcom/friday/common/databinding/FragmentImagePickBinding;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "mBindView"

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    invoke-static {v2}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    move-object v0, v1

    .line 12
    :cond_0
    iget-object v0, v0, Lcom/friday/common/databinding/FragmentImagePickBinding;->k:Landroid/widget/TextView;

    .line 13
    .line 14
    sget v3, Lcom/friday/common/R$string;->zoom_control_value:I

    .line 15
    .line 16
    iget-object v4, p0, Lcom/friday/common/camera/ImagePickFragment;->m:Lcom/friday/common/databinding/FragmentImagePickBinding;

    .line 17
    .line 18
    if-nez v4, :cond_1

    .line 19
    .line 20
    invoke-static {v2}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_1
    move-object v1, v4

    .line 25
    :goto_0
    iget-object v1, v1, Lcom/friday/common/databinding/FragmentImagePickBinding;->g:Lcom/friday/common/camera/ZoomControlView;

    .line 26
    .line 27
    invoke-virtual {v1}, Lcom/friday/common/camera/ZoomControlView;->getRealTimeValue()F

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    invoke-static {v1}, Ljava/lang/String;->valueOf(F)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    invoke-virtual {p0, v3, v1}, Landroidx/fragment/app/Fragment;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 44
    .line 45
    .line 46
    return-void
.end method

.method public onAttach(Landroid/content/Context;)V
    .locals 1

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Lcom/friday/common/camera/Hilt_ImagePickFragment;->onAttach(Landroid/content/Context;)V

    .line 7
    .line 8
    .line 9
    new-instance p1, Lcom/friday/common/camera/ImagePickFragment$onAttach$callback$1;

    .line 10
    .line 11
    invoke-direct {p1, p0}, Lcom/friday/common/camera/ImagePickFragment$onAttach$callback$1;-><init>(Lcom/friday/common/camera/ImagePickFragment;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireActivity()Landroidx/fragment/app/FragmentActivity;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-virtual {v0}, Landroidx/activity/ComponentActivity;->getOnBackPressedDispatcher()Landroidx/activity/OnBackPressedDispatcher;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-virtual {v0, p0, p1}, Landroidx/activity/OnBackPressedDispatcher;->addCallback(Landroidx/lifecycle/LifecycleOwner;Landroidx/activity/OnBackPressedCallback;)V

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 0

    .line 1
    const-string p3, "inflater"

    .line 2
    .line 3
    invoke-static {p1, p3}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 p3, 0x0

    .line 7
    invoke-static {p1, p2, p3}, Lcom/friday/common/databinding/FragmentImagePickBinding;->a(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/friday/common/databinding/FragmentImagePickBinding;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    const-string p2, "inflate(...)"

    .line 12
    .line 13
    invoke-static {p1, p2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, Lcom/friday/common/camera/ImagePickFragment;->m:Lcom/friday/common/databinding/FragmentImagePickBinding;

    .line 17
    .line 18
    if-nez p1, :cond_0

    .line 19
    .line 20
    const-string p1, "mBindView"

    .line 21
    .line 22
    invoke-static {p1}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    const/4 p1, 0x0

    .line 26
    :cond_0
    invoke-virtual {p1}, Landroidx/databinding/ViewDataBinding;->getRoot()Landroid/view/View;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    const-string p2, "getRoot(...)"

    .line 31
    .line 32
    invoke-static {p1, p2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    return-object p1
.end method

.method public onResume()V
    .locals 2

    .line 1
    invoke-super {p0}, Landroidx/fragment/app/Fragment;->onResume()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/friday/common/camera/ImagePickFragment;->l:Landroidx/camera/core/CameraControl;

    .line 5
    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    iget-object v1, p0, Lcom/friday/common/camera/ImagePickFragment;->m:Lcom/friday/common/databinding/FragmentImagePickBinding;

    .line 9
    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    const-string v1, "mBindView"

    .line 13
    .line 14
    invoke-static {v1}, Lkotlin/jvm/internal/u;->y(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    :cond_0
    iget-object v1, v1, Lcom/friday/common/databinding/FragmentImagePickBinding;->e:Landroid/widget/CheckBox;

    .line 19
    .line 20
    invoke-virtual {v1}, Landroid/widget/CompoundButton;->isChecked()Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    invoke-interface {v0, v1}, Landroidx/camera/core/CameraControl;->enableTorch(Z)Lcom/google/common/util/concurrent/ListenableFuture;

    .line 25
    .line 26
    .line 27
    :cond_1
    return-void
.end method

.method public onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 1

    .line 1
    const-string v0, "view"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1, p2}, Landroidx/fragment/app/Fragment;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    if-eqz p1, :cond_0

    .line 14
    .line 15
    const-string p2, "CAMERA_BEAN"

    .line 16
    .line 17
    invoke-virtual {p1, p2}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    check-cast p1, Lcom/friday/common/camera/CameraBean;

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    const/4 p1, 0x0

    .line 25
    :goto_0
    iput-object p1, p0, Lcom/friday/common/camera/ImagePickFragment;->o:Lcom/friday/common/camera/CameraBean;

    .line 26
    .line 27
    if-eqz p1, :cond_1

    .line 28
    .line 29
    invoke-direct {p0}, Lcom/friday/common/camera/ImagePickFragment;->initView()V

    .line 30
    .line 31
    .line 32
    invoke-direct {p0}, Lcom/friday/common/camera/ImagePickFragment;->initData()V

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 37
    .line 38
    const-string p2, "\u53c2\u6570\u4e0d\u5bf9"

    .line 39
    .line 40
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    throw p1
.end method
