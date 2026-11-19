.class public final Lcom/canhub/cropper/CropOverlayView;
.super Landroid/view/View;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\u0007\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0011\n\u0002\u0018\u0002\n\u0002\u0008\r\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u0000\u0018\u00002\u00020\u0001:\u0003U\u0008VB\u001d\u0008\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0015\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0011\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u0015\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0015\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\n2\u0008\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0015\u0010\u001f\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\u001d\u00a2\u0006\u0004\u0008\u001f\u0010 J\u0015\u0010#\u001a\u00020\n2\u0006\u0010\"\u001a\u00020!\u00a2\u0006\u0004\u0008#\u0010$J\u0015\u0010\'\u001a\u00020\n2\u0006\u0010&\u001a\u00020%\u00a2\u0006\u0004\u0008\'\u0010(J\u0015\u0010*\u001a\u00020\n2\u0006\u0010)\u001a\u00020\u0015\u00a2\u0006\u0004\u0008*\u0010\u0018J\u0015\u0010,\u001a\u00020\n2\u0006\u0010+\u001a\u00020\u001d\u00a2\u0006\u0004\u0008,\u0010 J\u0015\u0010.\u001a\u00020\n2\u0006\u0010-\u001a\u00020\u001d\u00a2\u0006\u0004\u0008.\u0010 J\u0015\u00101\u001a\u00020\n2\u0006\u00100\u001a\u00020/\u00a2\u0006\u0004\u00081\u00102R(\u0010&\u001a\u0004\u0018\u00010%2\u0008\u00103\u001a\u0004\u0018\u00010%8\u0006@BX\u0086\u000e\u00a2\u0006\u000c\n\u0004\u00084\u00105\u001a\u0004\u00086\u00107R(\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0008\u00103\u001a\u0004\u0018\u00010\r8\u0006@BX\u0086\u000e\u00a2\u0006\u000c\n\u0004\u00088\u00109\u001a\u0004\u0008:\u0010;R(\u0010@\u001a\u0004\u0018\u00010\u00112\u0008\u00103\u001a\u0004\u0018\u00010\u00118\u0006@BX\u0086\u000e\u00a2\u0006\u000c\n\u0004\u0008<\u0010=\u001a\u0004\u0008>\u0010?R$\u0010G\u001a\u00020A2\u0006\u0010B\u001a\u00020A8F@FX\u0086\u000e\u00a2\u0006\u000c\u001a\u0004\u0008C\u0010D\"\u0004\u0008E\u0010FR$\u0010H\u001a\u00020!2\u0006\u0010H\u001a\u00020!8F@FX\u0086\u000e\u00a2\u0006\u000c\u001a\u0004\u0008I\u0010J\"\u0004\u0008K\u0010$R$\u0010L\u001a\u00020!2\u0006\u0010L\u001a\u00020!8F@FX\u0086\u000e\u00a2\u0006\u000c\u001a\u0004\u0008M\u0010J\"\u0004\u0008N\u0010$R(\u0010T\u001a\u0004\u0018\u00010O2\u0008\u0010B\u001a\u0004\u0018\u00010O8F@FX\u0086\u000e\u00a2\u0006\u000c\u001a\u0004\u0008P\u0010Q\"\u0004\u0008R\u0010S\u00a8\u0006W"
    }
    d2 = {
        "Lcom/canhub/cropper/CropOverlayView;",
        "Landroid/view/View;",
        "Landroid/content/Context;",
        "context",
        "Landroid/util/AttributeSet;",
        "attrs",
        "<init>",
        "(Landroid/content/Context;Landroid/util/AttributeSet;)V",
        "Lcom/canhub/cropper/a0;",
        "listener",
        "Ld6/s;",
        "setCropWindowChangeListener",
        "(Lcom/canhub/cropper/a0;)V",
        "Lcom/canhub/cropper/CropImageView$CropShape;",
        "cropShape",
        "setCropShape",
        "(Lcom/canhub/cropper/CropImageView$CropShape;)V",
        "Lcom/canhub/cropper/CropImageView$CropCornerShape;",
        "cropCornerShape",
        "setCropCornerShape",
        "(Lcom/canhub/cropper/CropImageView$CropCornerShape;)V",
        "",
        "isEnabled",
        "setCropperTextLabelVisibility",
        "(Z)V",
        "",
        "textLabel",
        "setCropLabelText",
        "(Ljava/lang/String;)V",
        "",
        "textSize",
        "setCropLabelTextSize",
        "(F)V",
        "",
        "textColor",
        "setCropLabelTextColor",
        "(I)V",
        "Lcom/canhub/cropper/CropImageView$Guidelines;",
        "guidelines",
        "setGuidelines",
        "(Lcom/canhub/cropper/CropImageView$Guidelines;)V",
        "fixAspectRatio",
        "setFixedAspectRatio",
        "snapRadius",
        "setSnapRadius",
        "cornerRadius",
        "setCropCornerRadius",
        "Lcom/canhub/cropper/CropImageOptions;",
        "options",
        "setInitialAttributeValues",
        "(Lcom/canhub/cropper/CropImageOptions;)V",
        "value",
        "D",
        "Lcom/canhub/cropper/CropImageView$Guidelines;",
        "getGuidelines",
        "()Lcom/canhub/cropper/CropImageView$Guidelines;",
        "E",
        "Lcom/canhub/cropper/CropImageView$CropShape;",
        "getCropShape",
        "()Lcom/canhub/cropper/CropImageView$CropShape;",
        "F",
        "Lcom/canhub/cropper/CropImageView$CropCornerShape;",
        "getCornerShape",
        "()Lcom/canhub/cropper/CropImageView$CropCornerShape;",
        "cornerShape",
        "Landroid/graphics/RectF;",
        "rect",
        "getCropWindowRect",
        "()Landroid/graphics/RectF;",
        "setCropWindowRect",
        "(Landroid/graphics/RectF;)V",
        "cropWindowRect",
        "aspectRatioX",
        "getAspectRatioX",
        "()I",
        "setAspectRatioX",
        "aspectRatioY",
        "getAspectRatioY",
        "setAspectRatioY",
        "Landroid/graphics/Rect;",
        "getInitialCropWindowRect",
        "()Landroid/graphics/Rect;",
        "setInitialCropWindowRect",
        "(Landroid/graphics/Rect;)V",
        "initialCropWindowRect",
        "a/a",
        "com/canhub/cropper/b0",
        "cropper_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nCropOverlayView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CropOverlayView.kt\ncom/canhub/cropper/CropOverlayView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1304:1\n1#2:1305\n*E\n"
    }
.end annotation


# instance fields
.field public A:I

.field public B:I

.field public C:F

.field public D:Lcom/canhub/cropper/CropImageView$Guidelines;

.field public E:Lcom/canhub/cropper/CropImageView$CropShape;

.field public F:Lcom/canhub/cropper/CropImageView$CropCornerShape;

.field public G:Z

.field public H:Ljava/lang/String;

.field public I:F

.field public J:I

.field public final K:Landroid/graphics/Rect;

.field public L:Z

.field public final M:F

.field public a:F

.field public b:Ljava/lang/Integer;

.field public c:Lcom/canhub/cropper/CropImageOptions;

.field public d:Landroid/view/ScaleGestureDetector;

.field public e:Z

.field public f:Z

.field public final g:Lcom/canhub/cropper/e0;

.field public h:Lcom/canhub/cropper/a0;

.field public final i:Landroid/graphics/RectF;

.field public j:Landroid/graphics/Paint;

.field public k:Landroid/graphics/Paint;

.field public l:Landroid/graphics/Paint;

.field public m:Landroid/graphics/Paint;

.field public n:Landroid/graphics/Paint;

.field public final o:Landroid/graphics/Path;

.field public final p:[F

.field public final q:Landroid/graphics/RectF;

.field public r:I

.field public s:I

.field public t:F

.field public u:F

.field public v:F

.field public w:F

.field public x:F

.field public y:Lcom/canhub/cropper/g0;

.field public z:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, v0}, Lcom/canhub/cropper/CropOverlayView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
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

    .line 2
    invoke-direct {p0, p1, p2}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 p1, 0x1

    .line 3
    iput-boolean p1, p0, Lcom/canhub/cropper/CropOverlayView;->f:Z

    .line 4
    new-instance p2, Lcom/canhub/cropper/e0;

    invoke-direct {p2}, Lcom/canhub/cropper/e0;-><init>()V

    iput-object p2, p0, Lcom/canhub/cropper/CropOverlayView;->g:Lcom/canhub/cropper/e0;

    .line 5
    new-instance p2, Landroid/graphics/RectF;

    invoke-direct {p2}, Landroid/graphics/RectF;-><init>()V

    iput-object p2, p0, Lcom/canhub/cropper/CropOverlayView;->i:Landroid/graphics/RectF;

    .line 6
    new-instance p2, Landroid/graphics/Path;

    invoke-direct {p2}, Landroid/graphics/Path;-><init>()V

    iput-object p2, p0, Lcom/canhub/cropper/CropOverlayView;->o:Landroid/graphics/Path;

    const/16 p2, 0x8

    .line 7
    new-array p2, p2, [F

    iput-object p2, p0, Lcom/canhub/cropper/CropOverlayView;->p:[F

    .line 8
    new-instance p2, Landroid/graphics/RectF;

    invoke-direct {p2}, Landroid/graphics/RectF;-><init>()V

    iput-object p2, p0, Lcom/canhub/cropper/CropOverlayView;->q:Landroid/graphics/RectF;

    .line 9
    iget p2, p0, Lcom/canhub/cropper/CropOverlayView;->A:I

    int-to-float p2, p2

    iget v0, p0, Lcom/canhub/cropper/CropOverlayView;->B:I

    int-to-float v0, v0

    div-float/2addr p2, v0

    iput p2, p0, Lcom/canhub/cropper/CropOverlayView;->C:F

    .line 10
    const-string p2, ""

    iput-object p2, p0, Lcom/canhub/cropper/CropOverlayView;->H:Ljava/lang/String;

    const/high16 p2, 0x41a00000    # 20.0f

    .line 11
    iput p2, p0, Lcom/canhub/cropper/CropOverlayView;->I:F

    const/4 p2, -0x1

    .line 12
    iput p2, p0, Lcom/canhub/cropper/CropOverlayView;->J:I

    .line 13
    new-instance p2, Landroid/graphics/Rect;

    invoke-direct {p2}, Landroid/graphics/Rect;-><init>()V

    iput-object p2, p0, Lcom/canhub/cropper/CropOverlayView;->K:Landroid/graphics/Rect;

    .line 14
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    move-result-object p2

    invoke-virtual {p2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p2

    const/high16 v0, 0x43480000    # 200.0f

    invoke-static {p1, v0, p2}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result p1

    iput p1, p0, Lcom/canhub/cropper/CropOverlayView;->M:F

    return-void
.end method


# virtual methods
.method public final a(Landroid/graphics/RectF;)Z
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    sget-object v2, Lcom/canhub/cropper/h;->a:Landroid/graphics/Rect;

    .line 6
    .line 7
    iget-object v2, v0, Lcom/canhub/cropper/CropOverlayView;->p:[F

    .line 8
    .line 9
    invoke-static {v2}, Lcom/canhub/cropper/h;->q([F)F

    .line 10
    .line 11
    .line 12
    move-result v3

    .line 13
    invoke-static {v2}, Lcom/canhub/cropper/h;->s([F)F

    .line 14
    .line 15
    .line 16
    move-result v4

    .line 17
    invoke-static {v2}, Lcom/canhub/cropper/h;->r([F)F

    .line 18
    .line 19
    .line 20
    move-result v5

    .line 21
    invoke-static {v2}, Lcom/canhub/cropper/h;->l([F)F

    .line 22
    .line 23
    .line 24
    move-result v6

    .line 25
    const/4 v7, 0x0

    .line 26
    aget v8, v2, v7

    .line 27
    .line 28
    const/4 v9, 0x6

    .line 29
    aget v10, v2, v9

    .line 30
    .line 31
    cmpg-float v8, v8, v10

    .line 32
    .line 33
    iget-object v10, v0, Lcom/canhub/cropper/CropOverlayView;->q:Landroid/graphics/RectF;

    .line 34
    .line 35
    if-nez v8, :cond_0

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    const/4 v8, 0x1

    .line 39
    aget v11, v2, v8

    .line 40
    .line 41
    const/4 v12, 0x7

    .line 42
    aget v13, v2, v12

    .line 43
    .line 44
    cmpg-float v11, v11, v13

    .line 45
    .line 46
    if-nez v11, :cond_1

    .line 47
    .line 48
    :goto_0
    invoke-virtual {v10, v3, v4, v5, v6}, Landroid/graphics/RectF;->set(FFFF)V

    .line 49
    .line 50
    .line 51
    return v7

    .line 52
    :cond_1
    aget v7, v2, v7

    .line 53
    .line 54
    aget v11, v2, v8

    .line 55
    .line 56
    const/4 v13, 0x4

    .line 57
    aget v13, v2, v13

    .line 58
    .line 59
    const/4 v14, 0x5

    .line 60
    aget v14, v2, v14

    .line 61
    .line 62
    aget v9, v2, v9

    .line 63
    .line 64
    aget v12, v2, v12

    .line 65
    .line 66
    cmpg-float v15, v12, v11

    .line 67
    .line 68
    const/16 v16, 0x3

    .line 69
    .line 70
    const/16 v17, 0x2

    .line 71
    .line 72
    if-gez v15, :cond_3

    .line 73
    .line 74
    aget v15, v2, v16

    .line 75
    .line 76
    cmpg-float v16, v11, v15

    .line 77
    .line 78
    if-gez v16, :cond_2

    .line 79
    .line 80
    aget v7, v2, v17

    .line 81
    .line 82
    move v2, v9

    .line 83
    move v11, v14

    .line 84
    move v9, v7

    .line 85
    move v14, v12

    .line 86
    move v7, v13

    .line 87
    goto :goto_1

    .line 88
    :cond_2
    aget v2, v2, v17

    .line 89
    .line 90
    move v9, v15

    .line 91
    move v15, v11

    .line 92
    move v11, v9

    .line 93
    move v9, v7

    .line 94
    move v7, v2

    .line 95
    move v2, v13

    .line 96
    goto :goto_1

    .line 97
    :cond_3
    aget v15, v2, v16

    .line 98
    .line 99
    cmpl-float v16, v11, v15

    .line 100
    .line 101
    if-lez v16, :cond_4

    .line 102
    .line 103
    aget v2, v2, v17

    .line 104
    .line 105
    move v14, v15

    .line 106
    move v15, v12

    .line 107
    goto :goto_1

    .line 108
    :cond_4
    move v2, v7

    .line 109
    move v7, v9

    .line 110
    move v9, v13

    .line 111
    move v15, v14

    .line 112
    move v14, v11

    .line 113
    move v11, v12

    .line 114
    :goto_1
    sub-float/2addr v11, v14

    .line 115
    sub-float/2addr v7, v2

    .line 116
    div-float/2addr v11, v7

    .line 117
    const/high16 v7, -0x40800000    # -1.0f

    .line 118
    .line 119
    div-float/2addr v7, v11

    .line 120
    mul-float v12, v11, v2

    .line 121
    .line 122
    sub-float v12, v14, v12

    .line 123
    .line 124
    mul-float/2addr v2, v7

    .line 125
    sub-float/2addr v14, v2

    .line 126
    mul-float v2, v11, v9

    .line 127
    .line 128
    sub-float v2, v15, v2

    .line 129
    .line 130
    mul-float/2addr v9, v7

    .line 131
    sub-float/2addr v15, v9

    .line 132
    invoke-virtual {v1}, Landroid/graphics/RectF;->centerY()F

    .line 133
    .line 134
    .line 135
    move-result v9

    .line 136
    iget v13, v1, Landroid/graphics/RectF;->top:F

    .line 137
    .line 138
    sub-float/2addr v9, v13

    .line 139
    invoke-virtual {v1}, Landroid/graphics/RectF;->centerX()F

    .line 140
    .line 141
    .line 142
    move-result v13

    .line 143
    move/from16 v16, v8

    .line 144
    .line 145
    iget v8, v1, Landroid/graphics/RectF;->left:F

    .line 146
    .line 147
    sub-float/2addr v13, v8

    .line 148
    div-float/2addr v9, v13

    .line 149
    neg-float v13, v9

    .line 150
    iget v0, v1, Landroid/graphics/RectF;->top:F

    .line 151
    .line 152
    mul-float/2addr v8, v9

    .line 153
    sub-float v8, v0, v8

    .line 154
    .line 155
    move/from16 v17, v0

    .line 156
    .line 157
    iget v0, v1, Landroid/graphics/RectF;->right:F

    .line 158
    .line 159
    mul-float v18, v13, v0

    .line 160
    .line 161
    sub-float v17, v17, v18

    .line 162
    .line 163
    sub-float v18, v8, v12

    .line 164
    .line 165
    sub-float v19, v11, v9

    .line 166
    .line 167
    div-float v18, v18, v19

    .line 168
    .line 169
    cmpg-float v0, v18, v0

    .line 170
    .line 171
    if-gez v0, :cond_5

    .line 172
    .line 173
    move/from16 v0, v18

    .line 174
    .line 175
    goto :goto_2

    .line 176
    :cond_5
    move v0, v3

    .line 177
    :goto_2
    invoke-static {v3, v0}, Ljava/lang/Math;->max(FF)F

    .line 178
    .line 179
    .line 180
    move-result v0

    .line 181
    sub-float v3, v8, v14

    .line 182
    .line 183
    sub-float v9, v7, v9

    .line 184
    .line 185
    div-float/2addr v3, v9

    .line 186
    iget v9, v1, Landroid/graphics/RectF;->right:F

    .line 187
    .line 188
    cmpg-float v9, v3, v9

    .line 189
    .line 190
    if-gez v9, :cond_6

    .line 191
    .line 192
    goto :goto_3

    .line 193
    :cond_6
    move v3, v0

    .line 194
    :goto_3
    invoke-static {v0, v3}, Ljava/lang/Math;->max(FF)F

    .line 195
    .line 196
    .line 197
    move-result v0

    .line 198
    sub-float v3, v17, v15

    .line 199
    .line 200
    sub-float v9, v7, v13

    .line 201
    .line 202
    div-float/2addr v3, v9

    .line 203
    move/from16 v18, v2

    .line 204
    .line 205
    iget v2, v1, Landroid/graphics/RectF;->right:F

    .line 206
    .line 207
    cmpg-float v2, v3, v2

    .line 208
    .line 209
    if-gez v2, :cond_7

    .line 210
    .line 211
    goto :goto_4

    .line 212
    :cond_7
    move v3, v0

    .line 213
    :goto_4
    invoke-static {v0, v3}, Ljava/lang/Math;->max(FF)F

    .line 214
    .line 215
    .line 216
    move-result v0

    .line 217
    sub-float v2, v17, v14

    .line 218
    .line 219
    div-float/2addr v2, v9

    .line 220
    iget v3, v1, Landroid/graphics/RectF;->left:F

    .line 221
    .line 222
    cmpl-float v3, v2, v3

    .line 223
    .line 224
    if-lez v3, :cond_8

    .line 225
    .line 226
    goto :goto_5

    .line 227
    :cond_8
    move v2, v5

    .line 228
    :goto_5
    invoke-static {v5, v2}, Ljava/lang/Math;->min(FF)F

    .line 229
    .line 230
    .line 231
    move-result v2

    .line 232
    sub-float v17, v17, v18

    .line 233
    .line 234
    sub-float v3, v11, v13

    .line 235
    .line 236
    div-float v17, v17, v3

    .line 237
    .line 238
    iget v3, v1, Landroid/graphics/RectF;->left:F

    .line 239
    .line 240
    cmpl-float v3, v17, v3

    .line 241
    .line 242
    if-lez v3, :cond_9

    .line 243
    .line 244
    move/from16 v3, v17

    .line 245
    .line 246
    goto :goto_6

    .line 247
    :cond_9
    move v3, v2

    .line 248
    :goto_6
    invoke-static {v2, v3}, Ljava/lang/Math;->min(FF)F

    .line 249
    .line 250
    .line 251
    move-result v2

    .line 252
    sub-float v8, v8, v18

    .line 253
    .line 254
    div-float v8, v8, v19

    .line 255
    .line 256
    iget v1, v1, Landroid/graphics/RectF;->left:F

    .line 257
    .line 258
    cmpl-float v1, v8, v1

    .line 259
    .line 260
    if-lez v1, :cond_a

    .line 261
    .line 262
    goto :goto_7

    .line 263
    :cond_a
    move v8, v2

    .line 264
    :goto_7
    invoke-static {v2, v8}, Ljava/lang/Math;->min(FF)F

    .line 265
    .line 266
    .line 267
    move-result v1

    .line 268
    mul-float v2, v11, v0

    .line 269
    .line 270
    add-float/2addr v2, v12

    .line 271
    mul-float v3, v7, v1

    .line 272
    .line 273
    add-float/2addr v3, v14

    .line 274
    invoke-static {v2, v3}, Ljava/lang/Math;->max(FF)F

    .line 275
    .line 276
    .line 277
    move-result v2

    .line 278
    invoke-static {v4, v2}, Ljava/lang/Math;->max(FF)F

    .line 279
    .line 280
    .line 281
    move-result v2

    .line 282
    mul-float/2addr v7, v0

    .line 283
    add-float/2addr v7, v15

    .line 284
    mul-float/2addr v11, v1

    .line 285
    add-float v11, v11, v18

    .line 286
    .line 287
    invoke-static {v7, v11}, Ljava/lang/Math;->min(FF)F

    .line 288
    .line 289
    .line 290
    move-result v3

    .line 291
    invoke-static {v6, v3}, Ljava/lang/Math;->min(FF)F

    .line 292
    .line 293
    .line 294
    move-result v3

    .line 295
    iput v0, v10, Landroid/graphics/RectF;->left:F

    .line 296
    .line 297
    iput v2, v10, Landroid/graphics/RectF;->top:F

    .line 298
    .line 299
    iput v1, v10, Landroid/graphics/RectF;->right:F

    .line 300
    .line 301
    iput v3, v10, Landroid/graphics/RectF;->bottom:F

    .line 302
    .line 303
    return v16
.end method

.method public final b(Landroid/graphics/Canvas;FFLandroid/graphics/RectF;)V
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/canhub/cropper/CropOverlayView;->E:Lcom/canhub/cropper/CropImageView$CropShape;

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    move v0, v1

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    sget-object v2, Lcom/canhub/cropper/c0;->a:[I

    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    aget v0, v2, v0

    .line 15
    .line 16
    :goto_0
    const/4 v2, 0x2

    .line 17
    const/4 v3, 0x1

    .line 18
    if-eq v0, v3, :cond_4

    .line 19
    .line 20
    if-eq v0, v2, :cond_3

    .line 21
    .line 22
    const/4 v1, 0x3

    .line 23
    if-eq v0, v1, :cond_2

    .line 24
    .line 25
    const/4 v1, 0x4

    .line 26
    if-ne v0, v1, :cond_1

    .line 27
    .line 28
    invoke-virtual/range {p0 .. p4}, Lcom/canhub/cropper/CropOverlayView;->d(Landroid/graphics/Canvas;FFLandroid/graphics/RectF;)V

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 33
    .line 34
    const-string v1, "Unrecognized crop shape"

    .line 35
    .line 36
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    throw v0

    .line 40
    :cond_2
    iget v0, p4, Landroid/graphics/RectF;->left:F

    .line 41
    .line 42
    sub-float v1, v0, p2

    .line 43
    .line 44
    invoke-virtual {p4}, Landroid/graphics/RectF;->centerY()F

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    iget v2, p0, Lcom/canhub/cropper/CropOverlayView;->u:F

    .line 49
    .line 50
    sub-float v2, v0, v2

    .line 51
    .line 52
    iget v0, p4, Landroid/graphics/RectF;->left:F

    .line 53
    .line 54
    sub-float v3, v0, p2

    .line 55
    .line 56
    invoke-virtual {p4}, Landroid/graphics/RectF;->centerY()F

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    iget v4, p0, Lcom/canhub/cropper/CropOverlayView;->u:F

    .line 61
    .line 62
    add-float/2addr v4, v0

    .line 63
    iget-object v5, p0, Lcom/canhub/cropper/CropOverlayView;->k:Landroid/graphics/Paint;

    .line 64
    .line 65
    invoke-static {v5}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    move-object v0, p1

    .line 69
    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 70
    .line 71
    .line 72
    iget v0, p4, Landroid/graphics/RectF;->right:F

    .line 73
    .line 74
    add-float v1, v0, p2

    .line 75
    .line 76
    invoke-virtual {p4}, Landroid/graphics/RectF;->centerY()F

    .line 77
    .line 78
    .line 79
    move-result v0

    .line 80
    iget v2, p0, Lcom/canhub/cropper/CropOverlayView;->u:F

    .line 81
    .line 82
    sub-float v2, v0, v2

    .line 83
    .line 84
    iget v0, p4, Landroid/graphics/RectF;->right:F

    .line 85
    .line 86
    add-float v3, v0, p2

    .line 87
    .line 88
    invoke-virtual {p4}, Landroid/graphics/RectF;->centerY()F

    .line 89
    .line 90
    .line 91
    move-result v0

    .line 92
    iget v4, p0, Lcom/canhub/cropper/CropOverlayView;->u:F

    .line 93
    .line 94
    add-float/2addr v4, v0

    .line 95
    iget-object v5, p0, Lcom/canhub/cropper/CropOverlayView;->k:Landroid/graphics/Paint;

    .line 96
    .line 97
    invoke-static {v5}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 98
    .line 99
    .line 100
    move-object v0, p1

    .line 101
    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 102
    .line 103
    .line 104
    return-void

    .line 105
    :cond_3
    invoke-virtual {p4}, Landroid/graphics/RectF;->centerX()F

    .line 106
    .line 107
    .line 108
    move-result v0

    .line 109
    iget v1, p0, Lcom/canhub/cropper/CropOverlayView;->u:F

    .line 110
    .line 111
    sub-float v1, v0, v1

    .line 112
    .line 113
    iget v0, p4, Landroid/graphics/RectF;->top:F

    .line 114
    .line 115
    sub-float v2, v0, p2

    .line 116
    .line 117
    invoke-virtual {p4}, Landroid/graphics/RectF;->centerX()F

    .line 118
    .line 119
    .line 120
    move-result v0

    .line 121
    iget v3, p0, Lcom/canhub/cropper/CropOverlayView;->u:F

    .line 122
    .line 123
    add-float/2addr v3, v0

    .line 124
    iget v0, p4, Landroid/graphics/RectF;->top:F

    .line 125
    .line 126
    sub-float v4, v0, p2

    .line 127
    .line 128
    iget-object v5, p0, Lcom/canhub/cropper/CropOverlayView;->k:Landroid/graphics/Paint;

    .line 129
    .line 130
    invoke-static {v5}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 131
    .line 132
    .line 133
    move-object v0, p1

    .line 134
    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 135
    .line 136
    .line 137
    invoke-virtual {p4}, Landroid/graphics/RectF;->centerX()F

    .line 138
    .line 139
    .line 140
    move-result v0

    .line 141
    iget v1, p0, Lcom/canhub/cropper/CropOverlayView;->u:F

    .line 142
    .line 143
    sub-float v1, v0, v1

    .line 144
    .line 145
    iget v0, p4, Landroid/graphics/RectF;->bottom:F

    .line 146
    .line 147
    add-float v2, v0, p2

    .line 148
    .line 149
    invoke-virtual {p4}, Landroid/graphics/RectF;->centerX()F

    .line 150
    .line 151
    .line 152
    move-result v0

    .line 153
    iget v3, p0, Lcom/canhub/cropper/CropOverlayView;->u:F

    .line 154
    .line 155
    add-float/2addr v3, v0

    .line 156
    iget v0, p4, Landroid/graphics/RectF;->bottom:F

    .line 157
    .line 158
    add-float v4, v0, p2

    .line 159
    .line 160
    iget-object v5, p0, Lcom/canhub/cropper/CropOverlayView;->k:Landroid/graphics/Paint;

    .line 161
    .line 162
    invoke-static {v5}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 163
    .line 164
    .line 165
    move-object v0, p1

    .line 166
    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 167
    .line 168
    .line 169
    return-void

    .line 170
    :cond_4
    iget v4, p0, Lcom/canhub/cropper/CropOverlayView;->a:F

    .line 171
    .line 172
    iget-object v5, p0, Lcom/canhub/cropper/CropOverlayView;->F:Lcom/canhub/cropper/CropImageView$CropCornerShape;

    .line 173
    .line 174
    if-nez v5, :cond_5

    .line 175
    .line 176
    move v5, v1

    .line 177
    goto :goto_1

    .line 178
    :cond_5
    sget-object v6, Lcom/canhub/cropper/c0;->b:[I

    .line 179
    .line 180
    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    .line 181
    .line 182
    .line 183
    move-result v5

    .line 184
    aget v5, v6, v5

    .line 185
    .line 186
    :goto_1
    if-eq v5, v1, :cond_8

    .line 187
    .line 188
    if-eq v5, v3, :cond_7

    .line 189
    .line 190
    if-ne v5, v2, :cond_6

    .line 191
    .line 192
    invoke-virtual/range {p0 .. p4}, Lcom/canhub/cropper/CropOverlayView;->d(Landroid/graphics/Canvas;FFLandroid/graphics/RectF;)V

    .line 193
    .line 194
    .line 195
    return-void

    .line 196
    :cond_6
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    .line 197
    .line 198
    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 199
    .line 200
    .line 201
    throw v0

    .line 202
    :cond_7
    iget v1, p4, Landroid/graphics/RectF;->left:F

    .line 203
    .line 204
    sub-float/2addr v1, p2

    .line 205
    iget v2, p4, Landroid/graphics/RectF;->top:F

    .line 206
    .line 207
    sub-float/2addr v2, p2

    .line 208
    iget-object v3, p0, Lcom/canhub/cropper/CropOverlayView;->k:Landroid/graphics/Paint;

    .line 209
    .line 210
    invoke-static {v3}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 211
    .line 212
    .line 213
    invoke-virtual {p1, v1, v2, v4, v3}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 214
    .line 215
    .line 216
    iget v1, p4, Landroid/graphics/RectF;->right:F

    .line 217
    .line 218
    add-float/2addr v1, p2

    .line 219
    iget v2, p4, Landroid/graphics/RectF;->top:F

    .line 220
    .line 221
    sub-float/2addr v2, p2

    .line 222
    iget-object v3, p0, Lcom/canhub/cropper/CropOverlayView;->k:Landroid/graphics/Paint;

    .line 223
    .line 224
    invoke-static {v3}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 225
    .line 226
    .line 227
    invoke-virtual {p1, v1, v2, v4, v3}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 228
    .line 229
    .line 230
    iget v1, p4, Landroid/graphics/RectF;->left:F

    .line 231
    .line 232
    sub-float/2addr v1, p2

    .line 233
    iget v2, p4, Landroid/graphics/RectF;->bottom:F

    .line 234
    .line 235
    add-float/2addr v2, p2

    .line 236
    iget-object v3, p0, Lcom/canhub/cropper/CropOverlayView;->k:Landroid/graphics/Paint;

    .line 237
    .line 238
    invoke-static {v3}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 239
    .line 240
    .line 241
    invoke-virtual {p1, v1, v2, v4, v3}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 242
    .line 243
    .line 244
    iget v1, p4, Landroid/graphics/RectF;->right:F

    .line 245
    .line 246
    add-float/2addr v1, p2

    .line 247
    iget v2, p4, Landroid/graphics/RectF;->bottom:F

    .line 248
    .line 249
    add-float/2addr v2, p2

    .line 250
    iget-object v3, p0, Lcom/canhub/cropper/CropOverlayView;->k:Landroid/graphics/Paint;

    .line 251
    .line 252
    invoke-static {v3}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 253
    .line 254
    .line 255
    invoke-virtual {p1, v1, v2, v4, v3}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 256
    .line 257
    .line 258
    :cond_8
    return-void
.end method

.method public final c(Landroid/graphics/Canvas;)V
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lcom/canhub/cropper/CropOverlayView;->l:Landroid/graphics/Paint;

    .line 4
    .line 5
    if-eqz v1, :cond_4

    .line 6
    .line 7
    iget-object v1, v0, Lcom/canhub/cropper/CropOverlayView;->j:Landroid/graphics/Paint;

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    invoke-virtual {v1}, Landroid/graphics/Paint;->getStrokeWidth()F

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 v1, 0x0

    .line 17
    :goto_0
    iget-object v2, v0, Lcom/canhub/cropper/CropOverlayView;->g:Lcom/canhub/cropper/e0;

    .line 18
    .line 19
    invoke-virtual {v2}, Lcom/canhub/cropper/e0;->g()Landroid/graphics/RectF;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    invoke-virtual {v2, v1, v1}, Landroid/graphics/RectF;->inset(FF)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v2}, Landroid/graphics/RectF;->width()F

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    const/4 v4, 0x3

    .line 31
    int-to-float v5, v4

    .line 32
    div-float/2addr v3, v5

    .line 33
    invoke-virtual {v2}, Landroid/graphics/RectF;->height()F

    .line 34
    .line 35
    .line 36
    move-result v6

    .line 37
    div-float/2addr v6, v5

    .line 38
    iget-object v5, v0, Lcom/canhub/cropper/CropOverlayView;->E:Lcom/canhub/cropper/CropImageView$CropShape;

    .line 39
    .line 40
    if-nez v5, :cond_1

    .line 41
    .line 42
    const/4 v5, -0x1

    .line 43
    goto :goto_1

    .line 44
    :cond_1
    sget-object v7, Lcom/canhub/cropper/c0;->a:[I

    .line 45
    .line 46
    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    .line 47
    .line 48
    .line 49
    move-result v5

    .line 50
    aget v5, v7, v5

    .line 51
    .line 52
    :goto_1
    const/4 v7, 0x1

    .line 53
    if-eq v5, v7, :cond_3

    .line 54
    .line 55
    const/4 v7, 0x2

    .line 56
    if-eq v5, v7, :cond_3

    .line 57
    .line 58
    if-eq v5, v4, :cond_3

    .line 59
    .line 60
    const/4 v4, 0x4

    .line 61
    if-ne v5, v4, :cond_2

    .line 62
    .line 63
    invoke-virtual {v2}, Landroid/graphics/RectF;->width()F

    .line 64
    .line 65
    .line 66
    move-result v4

    .line 67
    int-to-float v5, v7

    .line 68
    div-float/2addr v4, v5

    .line 69
    sub-float/2addr v4, v1

    .line 70
    invoke-virtual {v2}, Landroid/graphics/RectF;->height()F

    .line 71
    .line 72
    .line 73
    move-result v7

    .line 74
    div-float/2addr v7, v5

    .line 75
    sub-float/2addr v7, v1

    .line 76
    iget v1, v2, Landroid/graphics/RectF;->left:F

    .line 77
    .line 78
    add-float v9, v1, v3

    .line 79
    .line 80
    iget v1, v2, Landroid/graphics/RectF;->right:F

    .line 81
    .line 82
    sub-float/2addr v1, v3

    .line 83
    float-to-double v10, v7

    .line 84
    sub-float v3, v4, v3

    .line 85
    .line 86
    div-float/2addr v3, v4

    .line 87
    float-to-double v12, v3

    .line 88
    invoke-static {v12, v13}, Ljava/lang/Math;->acos(D)D

    .line 89
    .line 90
    .line 91
    move-result-wide v12

    .line 92
    invoke-static {v12, v13}, Ljava/lang/Math;->sin(D)D

    .line 93
    .line 94
    .line 95
    move-result-wide v12

    .line 96
    mul-double/2addr v12, v10

    .line 97
    double-to-float v3, v12

    .line 98
    iget v5, v2, Landroid/graphics/RectF;->top:F

    .line 99
    .line 100
    add-float/2addr v5, v7

    .line 101
    sub-float v10, v5, v3

    .line 102
    .line 103
    iget v5, v2, Landroid/graphics/RectF;->bottom:F

    .line 104
    .line 105
    sub-float/2addr v5, v7

    .line 106
    add-float v12, v5, v3

    .line 107
    .line 108
    iget-object v13, v0, Lcom/canhub/cropper/CropOverlayView;->l:Landroid/graphics/Paint;

    .line 109
    .line 110
    invoke-static {v13}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 111
    .line 112
    .line 113
    move v11, v9

    .line 114
    move-object/from16 v8, p1

    .line 115
    .line 116
    invoke-virtual/range {v8 .. v13}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 117
    .line 118
    .line 119
    iget v5, v2, Landroid/graphics/RectF;->top:F

    .line 120
    .line 121
    add-float/2addr v5, v7

    .line 122
    sub-float v12, v5, v3

    .line 123
    .line 124
    iget v5, v2, Landroid/graphics/RectF;->bottom:F

    .line 125
    .line 126
    sub-float/2addr v5, v7

    .line 127
    add-float v14, v5, v3

    .line 128
    .line 129
    iget-object v15, v0, Lcom/canhub/cropper/CropOverlayView;->l:Landroid/graphics/Paint;

    .line 130
    .line 131
    invoke-static {v15}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 132
    .line 133
    .line 134
    move v13, v1

    .line 135
    move-object/from16 v10, p1

    .line 136
    .line 137
    move v11, v1

    .line 138
    invoke-virtual/range {v10 .. v15}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 139
    .line 140
    .line 141
    iget v1, v2, Landroid/graphics/RectF;->top:F

    .line 142
    .line 143
    add-float v16, v1, v6

    .line 144
    .line 145
    iget v1, v2, Landroid/graphics/RectF;->bottom:F

    .line 146
    .line 147
    sub-float/2addr v1, v6

    .line 148
    float-to-double v8, v4

    .line 149
    sub-float v3, v7, v6

    .line 150
    .line 151
    div-float/2addr v3, v7

    .line 152
    float-to-double v5, v3

    .line 153
    invoke-static {v5, v6}, Ljava/lang/Math;->asin(D)D

    .line 154
    .line 155
    .line 156
    move-result-wide v5

    .line 157
    invoke-static {v5, v6}, Ljava/lang/Math;->cos(D)D

    .line 158
    .line 159
    .line 160
    move-result-wide v5

    .line 161
    mul-double/2addr v5, v8

    .line 162
    double-to-float v3, v5

    .line 163
    iget v5, v2, Landroid/graphics/RectF;->left:F

    .line 164
    .line 165
    add-float/2addr v5, v4

    .line 166
    sub-float v15, v5, v3

    .line 167
    .line 168
    iget v5, v2, Landroid/graphics/RectF;->right:F

    .line 169
    .line 170
    sub-float/2addr v5, v4

    .line 171
    add-float v17, v5, v3

    .line 172
    .line 173
    iget-object v5, v0, Lcom/canhub/cropper/CropOverlayView;->l:Landroid/graphics/Paint;

    .line 174
    .line 175
    invoke-static {v5}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 176
    .line 177
    .line 178
    move/from16 v18, v16

    .line 179
    .line 180
    move-object/from16 v14, p1

    .line 181
    .line 182
    move-object/from16 v19, v5

    .line 183
    .line 184
    invoke-virtual/range {v14 .. v19}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 185
    .line 186
    .line 187
    iget v5, v2, Landroid/graphics/RectF;->left:F

    .line 188
    .line 189
    add-float/2addr v5, v4

    .line 190
    sub-float v15, v5, v3

    .line 191
    .line 192
    iget v2, v2, Landroid/graphics/RectF;->right:F

    .line 193
    .line 194
    sub-float/2addr v2, v4

    .line 195
    add-float v17, v2, v3

    .line 196
    .line 197
    iget-object v2, v0, Lcom/canhub/cropper/CropOverlayView;->l:Landroid/graphics/Paint;

    .line 198
    .line 199
    invoke-static {v2}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 200
    .line 201
    .line 202
    move/from16 v18, v1

    .line 203
    .line 204
    move/from16 v16, v1

    .line 205
    .line 206
    move-object/from16 v19, v2

    .line 207
    .line 208
    invoke-virtual/range {v14 .. v19}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 209
    .line 210
    .line 211
    return-void

    .line 212
    :cond_2
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 213
    .line 214
    const-string v2, "Unrecognized crop shape"

    .line 215
    .line 216
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 217
    .line 218
    .line 219
    throw v1

    .line 220
    :cond_3
    iget v1, v2, Landroid/graphics/RectF;->left:F

    .line 221
    .line 222
    add-float v15, v1, v3

    .line 223
    .line 224
    iget v1, v2, Landroid/graphics/RectF;->right:F

    .line 225
    .line 226
    sub-float/2addr v1, v3

    .line 227
    iget v3, v2, Landroid/graphics/RectF;->top:F

    .line 228
    .line 229
    iget v4, v2, Landroid/graphics/RectF;->bottom:F

    .line 230
    .line 231
    iget-object v5, v0, Lcom/canhub/cropper/CropOverlayView;->l:Landroid/graphics/Paint;

    .line 232
    .line 233
    invoke-static {v5}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 234
    .line 235
    .line 236
    move/from16 v17, v15

    .line 237
    .line 238
    move-object/from16 v14, p1

    .line 239
    .line 240
    move/from16 v16, v3

    .line 241
    .line 242
    move/from16 v18, v4

    .line 243
    .line 244
    move-object/from16 v19, v5

    .line 245
    .line 246
    invoke-virtual/range {v14 .. v19}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 247
    .line 248
    .line 249
    iget v3, v2, Landroid/graphics/RectF;->top:F

    .line 250
    .line 251
    iget v4, v2, Landroid/graphics/RectF;->bottom:F

    .line 252
    .line 253
    iget-object v5, v0, Lcom/canhub/cropper/CropOverlayView;->l:Landroid/graphics/Paint;

    .line 254
    .line 255
    invoke-static {v5}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 256
    .line 257
    .line 258
    move/from16 v17, v1

    .line 259
    .line 260
    move v15, v1

    .line 261
    move/from16 v16, v3

    .line 262
    .line 263
    move/from16 v18, v4

    .line 264
    .line 265
    move-object/from16 v19, v5

    .line 266
    .line 267
    invoke-virtual/range {v14 .. v19}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 268
    .line 269
    .line 270
    iget v1, v2, Landroid/graphics/RectF;->top:F

    .line 271
    .line 272
    add-float v16, v1, v6

    .line 273
    .line 274
    iget v1, v2, Landroid/graphics/RectF;->bottom:F

    .line 275
    .line 276
    sub-float/2addr v1, v6

    .line 277
    iget v15, v2, Landroid/graphics/RectF;->left:F

    .line 278
    .line 279
    iget v3, v2, Landroid/graphics/RectF;->right:F

    .line 280
    .line 281
    iget-object v4, v0, Lcom/canhub/cropper/CropOverlayView;->l:Landroid/graphics/Paint;

    .line 282
    .line 283
    invoke-static {v4}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 284
    .line 285
    .line 286
    move/from16 v18, v16

    .line 287
    .line 288
    move/from16 v17, v3

    .line 289
    .line 290
    move-object/from16 v19, v4

    .line 291
    .line 292
    invoke-virtual/range {v14 .. v19}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 293
    .line 294
    .line 295
    iget v15, v2, Landroid/graphics/RectF;->left:F

    .line 296
    .line 297
    iget v2, v2, Landroid/graphics/RectF;->right:F

    .line 298
    .line 299
    iget-object v3, v0, Lcom/canhub/cropper/CropOverlayView;->l:Landroid/graphics/Paint;

    .line 300
    .line 301
    invoke-static {v3}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 302
    .line 303
    .line 304
    move/from16 v18, v1

    .line 305
    .line 306
    move/from16 v16, v1

    .line 307
    .line 308
    move/from16 v17, v2

    .line 309
    .line 310
    move-object/from16 v19, v3

    .line 311
    .line 312
    invoke-virtual/range {v14 .. v19}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 313
    .line 314
    .line 315
    :cond_4
    return-void
.end method

.method public final d(Landroid/graphics/Canvas;FFLandroid/graphics/RectF;)V
    .locals 14

    .line 1
    move-object/from16 v0, p4

    .line 2
    .line 3
    iget v1, v0, Landroid/graphics/RectF;->left:F

    .line 4
    .line 5
    sub-float v3, v1, p2

    .line 6
    .line 7
    iget v1, v0, Landroid/graphics/RectF;->top:F

    .line 8
    .line 9
    sub-float v4, v1, p3

    .line 10
    .line 11
    iget v2, p0, Lcom/canhub/cropper/CropOverlayView;->u:F

    .line 12
    .line 13
    add-float v6, v1, v2

    .line 14
    .line 15
    iget-object v7, p0, Lcom/canhub/cropper/CropOverlayView;->k:Landroid/graphics/Paint;

    .line 16
    .line 17
    invoke-static {v7}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    move v5, v3

    .line 21
    move-object v2, p1

    .line 22
    invoke-virtual/range {v2 .. v7}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 23
    .line 24
    .line 25
    iget v1, v0, Landroid/graphics/RectF;->left:F

    .line 26
    .line 27
    sub-float v9, v1, p3

    .line 28
    .line 29
    iget v2, v0, Landroid/graphics/RectF;->top:F

    .line 30
    .line 31
    sub-float v10, v2, p2

    .line 32
    .line 33
    iget v2, p0, Lcom/canhub/cropper/CropOverlayView;->u:F

    .line 34
    .line 35
    add-float v11, v1, v2

    .line 36
    .line 37
    iget-object v13, p0, Lcom/canhub/cropper/CropOverlayView;->k:Landroid/graphics/Paint;

    .line 38
    .line 39
    invoke-static {v13}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    move v12, v10

    .line 43
    move-object v8, p1

    .line 44
    invoke-virtual/range {v8 .. v13}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 45
    .line 46
    .line 47
    iget v1, v0, Landroid/graphics/RectF;->right:F

    .line 48
    .line 49
    add-float v9, v1, p2

    .line 50
    .line 51
    iget v1, v0, Landroid/graphics/RectF;->top:F

    .line 52
    .line 53
    sub-float v10, v1, p3

    .line 54
    .line 55
    iget v2, p0, Lcom/canhub/cropper/CropOverlayView;->u:F

    .line 56
    .line 57
    add-float v12, v1, v2

    .line 58
    .line 59
    iget-object v13, p0, Lcom/canhub/cropper/CropOverlayView;->k:Landroid/graphics/Paint;

    .line 60
    .line 61
    invoke-static {v13}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    move v11, v9

    .line 65
    invoke-virtual/range {v8 .. v13}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 66
    .line 67
    .line 68
    iget v1, v0, Landroid/graphics/RectF;->right:F

    .line 69
    .line 70
    add-float v9, v1, p3

    .line 71
    .line 72
    iget v2, v0, Landroid/graphics/RectF;->top:F

    .line 73
    .line 74
    sub-float v10, v2, p2

    .line 75
    .line 76
    iget v2, p0, Lcom/canhub/cropper/CropOverlayView;->u:F

    .line 77
    .line 78
    sub-float v11, v1, v2

    .line 79
    .line 80
    iget-object v13, p0, Lcom/canhub/cropper/CropOverlayView;->k:Landroid/graphics/Paint;

    .line 81
    .line 82
    invoke-static {v13}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    move v12, v10

    .line 86
    invoke-virtual/range {v8 .. v13}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 87
    .line 88
    .line 89
    iget v1, v0, Landroid/graphics/RectF;->left:F

    .line 90
    .line 91
    sub-float v9, v1, p2

    .line 92
    .line 93
    iget v1, v0, Landroid/graphics/RectF;->bottom:F

    .line 94
    .line 95
    add-float v10, v1, p3

    .line 96
    .line 97
    iget v2, p0, Lcom/canhub/cropper/CropOverlayView;->u:F

    .line 98
    .line 99
    sub-float v12, v1, v2

    .line 100
    .line 101
    iget-object v13, p0, Lcom/canhub/cropper/CropOverlayView;->k:Landroid/graphics/Paint;

    .line 102
    .line 103
    invoke-static {v13}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 104
    .line 105
    .line 106
    move v11, v9

    .line 107
    invoke-virtual/range {v8 .. v13}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 108
    .line 109
    .line 110
    iget v1, v0, Landroid/graphics/RectF;->left:F

    .line 111
    .line 112
    sub-float v9, v1, p3

    .line 113
    .line 114
    iget v2, v0, Landroid/graphics/RectF;->bottom:F

    .line 115
    .line 116
    add-float v10, v2, p2

    .line 117
    .line 118
    iget v2, p0, Lcom/canhub/cropper/CropOverlayView;->u:F

    .line 119
    .line 120
    add-float v11, v1, v2

    .line 121
    .line 122
    iget-object v13, p0, Lcom/canhub/cropper/CropOverlayView;->k:Landroid/graphics/Paint;

    .line 123
    .line 124
    invoke-static {v13}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 125
    .line 126
    .line 127
    move v12, v10

    .line 128
    invoke-virtual/range {v8 .. v13}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 129
    .line 130
    .line 131
    iget v1, v0, Landroid/graphics/RectF;->right:F

    .line 132
    .line 133
    add-float v9, v1, p2

    .line 134
    .line 135
    iget v1, v0, Landroid/graphics/RectF;->bottom:F

    .line 136
    .line 137
    add-float v10, v1, p3

    .line 138
    .line 139
    iget v2, p0, Lcom/canhub/cropper/CropOverlayView;->u:F

    .line 140
    .line 141
    sub-float v12, v1, v2

    .line 142
    .line 143
    iget-object v13, p0, Lcom/canhub/cropper/CropOverlayView;->k:Landroid/graphics/Paint;

    .line 144
    .line 145
    invoke-static {v13}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 146
    .line 147
    .line 148
    move v11, v9

    .line 149
    invoke-virtual/range {v8 .. v13}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 150
    .line 151
    .line 152
    iget v1, v0, Landroid/graphics/RectF;->right:F

    .line 153
    .line 154
    add-float v9, v1, p3

    .line 155
    .line 156
    iget v0, v0, Landroid/graphics/RectF;->bottom:F

    .line 157
    .line 158
    add-float v10, v0, p2

    .line 159
    .line 160
    iget v0, p0, Lcom/canhub/cropper/CropOverlayView;->u:F

    .line 161
    .line 162
    sub-float v11, v1, v0

    .line 163
    .line 164
    iget-object v13, p0, Lcom/canhub/cropper/CropOverlayView;->k:Landroid/graphics/Paint;

    .line 165
    .line 166
    invoke-static {v13}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 167
    .line 168
    .line 169
    move v12, v10

    .line 170
    invoke-virtual/range {v8 .. v13}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 171
    .line 172
    .line 173
    return-void
.end method

.method public final e(Landroid/graphics/RectF;)V
    .locals 6

    .line 1
    invoke-virtual {p1}, Landroid/graphics/RectF;->width()F

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget-object v1, p0, Lcom/canhub/cropper/CropOverlayView;->g:Lcom/canhub/cropper/e0;

    .line 6
    .line 7
    invoke-virtual {v1}, Lcom/canhub/cropper/e0;->e()F

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    cmpg-float v0, v0, v2

    .line 12
    .line 13
    const/4 v2, 0x2

    .line 14
    if-gez v0, :cond_0

    .line 15
    .line 16
    invoke-virtual {v1}, Lcom/canhub/cropper/e0;->e()F

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    invoke-virtual {p1}, Landroid/graphics/RectF;->width()F

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    sub-float/2addr v0, v3

    .line 25
    int-to-float v3, v2

    .line 26
    div-float/2addr v0, v3

    .line 27
    iget v3, p1, Landroid/graphics/RectF;->left:F

    .line 28
    .line 29
    sub-float/2addr v3, v0

    .line 30
    iput v3, p1, Landroid/graphics/RectF;->left:F

    .line 31
    .line 32
    iget v3, p1, Landroid/graphics/RectF;->right:F

    .line 33
    .line 34
    add-float/2addr v3, v0

    .line 35
    iput v3, p1, Landroid/graphics/RectF;->right:F

    .line 36
    .line 37
    :cond_0
    invoke-virtual {p1}, Landroid/graphics/RectF;->height()F

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    invoke-virtual {v1}, Lcom/canhub/cropper/e0;->d()F

    .line 42
    .line 43
    .line 44
    move-result v3

    .line 45
    cmpg-float v0, v0, v3

    .line 46
    .line 47
    if-gez v0, :cond_1

    .line 48
    .line 49
    invoke-virtual {v1}, Lcom/canhub/cropper/e0;->d()F

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    invoke-virtual {p1}, Landroid/graphics/RectF;->height()F

    .line 54
    .line 55
    .line 56
    move-result v3

    .line 57
    sub-float/2addr v0, v3

    .line 58
    int-to-float v3, v2

    .line 59
    div-float/2addr v0, v3

    .line 60
    iget v3, p1, Landroid/graphics/RectF;->top:F

    .line 61
    .line 62
    sub-float/2addr v3, v0

    .line 63
    iput v3, p1, Landroid/graphics/RectF;->top:F

    .line 64
    .line 65
    iget v3, p1, Landroid/graphics/RectF;->bottom:F

    .line 66
    .line 67
    add-float/2addr v3, v0

    .line 68
    iput v3, p1, Landroid/graphics/RectF;->bottom:F

    .line 69
    .line 70
    :cond_1
    invoke-virtual {p1}, Landroid/graphics/RectF;->width()F

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    invoke-virtual {v1}, Lcom/canhub/cropper/e0;->c()F

    .line 75
    .line 76
    .line 77
    move-result v3

    .line 78
    cmpl-float v0, v0, v3

    .line 79
    .line 80
    if-lez v0, :cond_2

    .line 81
    .line 82
    invoke-virtual {p1}, Landroid/graphics/RectF;->width()F

    .line 83
    .line 84
    .line 85
    move-result v0

    .line 86
    invoke-virtual {v1}, Lcom/canhub/cropper/e0;->c()F

    .line 87
    .line 88
    .line 89
    move-result v3

    .line 90
    sub-float/2addr v0, v3

    .line 91
    int-to-float v3, v2

    .line 92
    div-float/2addr v0, v3

    .line 93
    iget v3, p1, Landroid/graphics/RectF;->left:F

    .line 94
    .line 95
    add-float/2addr v3, v0

    .line 96
    iput v3, p1, Landroid/graphics/RectF;->left:F

    .line 97
    .line 98
    iget v3, p1, Landroid/graphics/RectF;->right:F

    .line 99
    .line 100
    sub-float/2addr v3, v0

    .line 101
    iput v3, p1, Landroid/graphics/RectF;->right:F

    .line 102
    .line 103
    :cond_2
    invoke-virtual {p1}, Landroid/graphics/RectF;->height()F

    .line 104
    .line 105
    .line 106
    move-result v0

    .line 107
    invoke-virtual {v1}, Lcom/canhub/cropper/e0;->b()F

    .line 108
    .line 109
    .line 110
    move-result v3

    .line 111
    cmpl-float v0, v0, v3

    .line 112
    .line 113
    if-lez v0, :cond_3

    .line 114
    .line 115
    invoke-virtual {p1}, Landroid/graphics/RectF;->height()F

    .line 116
    .line 117
    .line 118
    move-result v0

    .line 119
    invoke-virtual {v1}, Lcom/canhub/cropper/e0;->b()F

    .line 120
    .line 121
    .line 122
    move-result v1

    .line 123
    sub-float/2addr v0, v1

    .line 124
    int-to-float v1, v2

    .line 125
    div-float/2addr v0, v1

    .line 126
    iget v1, p1, Landroid/graphics/RectF;->top:F

    .line 127
    .line 128
    add-float/2addr v1, v0

    .line 129
    iput v1, p1, Landroid/graphics/RectF;->top:F

    .line 130
    .line 131
    iget v1, p1, Landroid/graphics/RectF;->bottom:F

    .line 132
    .line 133
    sub-float/2addr v1, v0

    .line 134
    iput v1, p1, Landroid/graphics/RectF;->bottom:F

    .line 135
    .line 136
    :cond_3
    invoke-virtual {p0, p1}, Lcom/canhub/cropper/CropOverlayView;->a(Landroid/graphics/RectF;)Z

    .line 137
    .line 138
    .line 139
    iget-object v0, p0, Lcom/canhub/cropper/CropOverlayView;->q:Landroid/graphics/RectF;

    .line 140
    .line 141
    invoke-virtual {v0}, Landroid/graphics/RectF;->width()F

    .line 142
    .line 143
    .line 144
    move-result v1

    .line 145
    const/4 v3, 0x0

    .line 146
    cmpl-float v1, v1, v3

    .line 147
    .line 148
    if-lez v1, :cond_7

    .line 149
    .line 150
    invoke-virtual {v0}, Landroid/graphics/RectF;->height()F

    .line 151
    .line 152
    .line 153
    move-result v1

    .line 154
    cmpl-float v1, v1, v3

    .line 155
    .line 156
    if-lez v1, :cond_7

    .line 157
    .line 158
    iget v1, v0, Landroid/graphics/RectF;->left:F

    .line 159
    .line 160
    invoke-static {v1, v3}, Ljava/lang/Math;->max(FF)F

    .line 161
    .line 162
    .line 163
    move-result v1

    .line 164
    iget v4, v0, Landroid/graphics/RectF;->top:F

    .line 165
    .line 166
    invoke-static {v4, v3}, Ljava/lang/Math;->max(FF)F

    .line 167
    .line 168
    .line 169
    move-result v3

    .line 170
    iget v4, v0, Landroid/graphics/RectF;->right:F

    .line 171
    .line 172
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 173
    .line 174
    .line 175
    move-result v5

    .line 176
    int-to-float v5, v5

    .line 177
    invoke-static {v4, v5}, Ljava/lang/Math;->min(FF)F

    .line 178
    .line 179
    .line 180
    move-result v4

    .line 181
    iget v0, v0, Landroid/graphics/RectF;->bottom:F

    .line 182
    .line 183
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 184
    .line 185
    .line 186
    move-result v5

    .line 187
    int-to-float v5, v5

    .line 188
    invoke-static {v0, v5}, Ljava/lang/Math;->min(FF)F

    .line 189
    .line 190
    .line 191
    move-result v0

    .line 192
    iget v5, p1, Landroid/graphics/RectF;->left:F

    .line 193
    .line 194
    cmpg-float v5, v5, v1

    .line 195
    .line 196
    if-gez v5, :cond_4

    .line 197
    .line 198
    iput v1, p1, Landroid/graphics/RectF;->left:F

    .line 199
    .line 200
    :cond_4
    iget v1, p1, Landroid/graphics/RectF;->top:F

    .line 201
    .line 202
    cmpg-float v1, v1, v3

    .line 203
    .line 204
    if-gez v1, :cond_5

    .line 205
    .line 206
    iput v3, p1, Landroid/graphics/RectF;->top:F

    .line 207
    .line 208
    :cond_5
    iget v1, p1, Landroid/graphics/RectF;->right:F

    .line 209
    .line 210
    cmpl-float v1, v1, v4

    .line 211
    .line 212
    if-lez v1, :cond_6

    .line 213
    .line 214
    iput v4, p1, Landroid/graphics/RectF;->right:F

    .line 215
    .line 216
    :cond_6
    iget v1, p1, Landroid/graphics/RectF;->bottom:F

    .line 217
    .line 218
    cmpl-float v1, v1, v0

    .line 219
    .line 220
    if-lez v1, :cond_7

    .line 221
    .line 222
    iput v0, p1, Landroid/graphics/RectF;->bottom:F

    .line 223
    .line 224
    :cond_7
    iget-boolean v0, p0, Lcom/canhub/cropper/CropOverlayView;->z:Z

    .line 225
    .line 226
    if-eqz v0, :cond_9

    .line 227
    .line 228
    invoke-virtual {p1}, Landroid/graphics/RectF;->width()F

    .line 229
    .line 230
    .line 231
    move-result v0

    .line 232
    invoke-virtual {p1}, Landroid/graphics/RectF;->height()F

    .line 233
    .line 234
    .line 235
    move-result v1

    .line 236
    iget v3, p0, Lcom/canhub/cropper/CropOverlayView;->C:F

    .line 237
    .line 238
    mul-float/2addr v1, v3

    .line 239
    sub-float/2addr v0, v1

    .line 240
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    .line 241
    .line 242
    .line 243
    move-result v0

    .line 244
    float-to-double v0, v0

    .line 245
    const-wide v3, 0x3fb999999999999aL    # 0.1

    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    cmpl-double v0, v0, v3

    .line 251
    .line 252
    if-lez v0, :cond_9

    .line 253
    .line 254
    invoke-virtual {p1}, Landroid/graphics/RectF;->width()F

    .line 255
    .line 256
    .line 257
    move-result v0

    .line 258
    invoke-virtual {p1}, Landroid/graphics/RectF;->height()F

    .line 259
    .line 260
    .line 261
    move-result v1

    .line 262
    iget v3, p0, Lcom/canhub/cropper/CropOverlayView;->C:F

    .line 263
    .line 264
    mul-float/2addr v1, v3

    .line 265
    cmpl-float v0, v0, v1

    .line 266
    .line 267
    if-lez v0, :cond_8

    .line 268
    .line 269
    invoke-virtual {p1}, Landroid/graphics/RectF;->height()F

    .line 270
    .line 271
    .line 272
    move-result v0

    .line 273
    iget v1, p0, Lcom/canhub/cropper/CropOverlayView;->C:F

    .line 274
    .line 275
    mul-float/2addr v0, v1

    .line 276
    invoke-virtual {p1}, Landroid/graphics/RectF;->width()F

    .line 277
    .line 278
    .line 279
    move-result v1

    .line 280
    sub-float/2addr v0, v1

    .line 281
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    .line 282
    .line 283
    .line 284
    move-result v0

    .line 285
    int-to-float v1, v2

    .line 286
    div-float/2addr v0, v1

    .line 287
    iget v1, p1, Landroid/graphics/RectF;->left:F

    .line 288
    .line 289
    add-float/2addr v1, v0

    .line 290
    iput v1, p1, Landroid/graphics/RectF;->left:F

    .line 291
    .line 292
    iget v1, p1, Landroid/graphics/RectF;->right:F

    .line 293
    .line 294
    sub-float/2addr v1, v0

    .line 295
    iput v1, p1, Landroid/graphics/RectF;->right:F

    .line 296
    .line 297
    return-void

    .line 298
    :cond_8
    invoke-virtual {p1}, Landroid/graphics/RectF;->width()F

    .line 299
    .line 300
    .line 301
    move-result v0

    .line 302
    iget v1, p0, Lcom/canhub/cropper/CropOverlayView;->C:F

    .line 303
    .line 304
    div-float/2addr v0, v1

    .line 305
    invoke-virtual {p1}, Landroid/graphics/RectF;->height()F

    .line 306
    .line 307
    .line 308
    move-result v1

    .line 309
    sub-float/2addr v0, v1

    .line 310
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    .line 311
    .line 312
    .line 313
    move-result v0

    .line 314
    int-to-float v1, v2

    .line 315
    div-float/2addr v0, v1

    .line 316
    iget v1, p1, Landroid/graphics/RectF;->top:F

    .line 317
    .line 318
    add-float/2addr v1, v0

    .line 319
    iput v1, p1, Landroid/graphics/RectF;->top:F

    .line 320
    .line 321
    iget v1, p1, Landroid/graphics/RectF;->bottom:F

    .line 322
    .line 323
    sub-float/2addr v1, v0

    .line 324
    iput v1, p1, Landroid/graphics/RectF;->bottom:F

    .line 325
    .line 326
    :cond_9
    return-void
.end method

.method public final f()V
    .locals 12

    .line 1
    sget-object v0, Lcom/canhub/cropper/h;->a:Landroid/graphics/Rect;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/canhub/cropper/CropOverlayView;->p:[F

    .line 4
    .line 5
    invoke-static {v0}, Lcom/canhub/cropper/h;->q([F)F

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x0

    .line 10
    invoke-static {v1, v2}, Ljava/lang/Math;->max(FF)F

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    invoke-static {v0}, Lcom/canhub/cropper/h;->s([F)F

    .line 15
    .line 16
    .line 17
    move-result v3

    .line 18
    invoke-static {v3, v2}, Ljava/lang/Math;->max(FF)F

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    invoke-static {v0}, Lcom/canhub/cropper/h;->r([F)F

    .line 23
    .line 24
    .line 25
    move-result v3

    .line 26
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 27
    .line 28
    .line 29
    move-result v4

    .line 30
    int-to-float v4, v4

    .line 31
    invoke-static {v3, v4}, Ljava/lang/Math;->min(FF)F

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    invoke-static {v0}, Lcom/canhub/cropper/h;->l([F)F

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 40
    .line 41
    .line 42
    move-result v4

    .line 43
    int-to-float v4, v4

    .line 44
    invoke-static {v0, v4}, Ljava/lang/Math;->min(FF)F

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    cmpg-float v4, v3, v1

    .line 49
    .line 50
    if-lez v4, :cond_4

    .line 51
    .line 52
    cmpg-float v4, v0, v2

    .line 53
    .line 54
    if-gtz v4, :cond_0

    .line 55
    .line 56
    goto/16 :goto_1

    .line 57
    .line 58
    :cond_0
    new-instance v4, Landroid/graphics/RectF;

    .line 59
    .line 60
    invoke-direct {v4}, Landroid/graphics/RectF;-><init>()V

    .line 61
    .line 62
    .line 63
    const/4 v5, 0x1

    .line 64
    iput-boolean v5, p0, Lcom/canhub/cropper/CropOverlayView;->L:Z

    .line 65
    .line 66
    iget v5, p0, Lcom/canhub/cropper/CropOverlayView;->v:F

    .line 67
    .line 68
    sub-float v6, v3, v1

    .line 69
    .line 70
    mul-float v7, v5, v6

    .line 71
    .line 72
    sub-float v8, v0, v2

    .line 73
    .line 74
    mul-float/2addr v5, v8

    .line 75
    iget-object v9, p0, Lcom/canhub/cropper/CropOverlayView;->K:Landroid/graphics/Rect;

    .line 76
    .line 77
    invoke-virtual {v9}, Landroid/graphics/Rect;->width()I

    .line 78
    .line 79
    .line 80
    move-result v10

    .line 81
    iget-object v11, p0, Lcom/canhub/cropper/CropOverlayView;->g:Lcom/canhub/cropper/e0;

    .line 82
    .line 83
    if-lez v10, :cond_1

    .line 84
    .line 85
    invoke-virtual {v9}, Landroid/graphics/Rect;->height()I

    .line 86
    .line 87
    .line 88
    move-result v10

    .line 89
    if-lez v10, :cond_1

    .line 90
    .line 91
    iget v5, v9, Landroid/graphics/Rect;->left:I

    .line 92
    .line 93
    int-to-float v5, v5

    .line 94
    iget v6, v11, Lcom/canhub/cropper/e0;->k:F

    .line 95
    .line 96
    div-float/2addr v5, v6

    .line 97
    add-float/2addr v5, v1

    .line 98
    iput v5, v4, Landroid/graphics/RectF;->left:F

    .line 99
    .line 100
    iget v6, v9, Landroid/graphics/Rect;->top:I

    .line 101
    .line 102
    int-to-float v6, v6

    .line 103
    iget v7, v11, Lcom/canhub/cropper/e0;->l:F

    .line 104
    .line 105
    div-float/2addr v6, v7

    .line 106
    add-float/2addr v6, v2

    .line 107
    iput v6, v4, Landroid/graphics/RectF;->top:F

    .line 108
    .line 109
    invoke-virtual {v9}, Landroid/graphics/Rect;->width()I

    .line 110
    .line 111
    .line 112
    move-result v6

    .line 113
    int-to-float v6, v6

    .line 114
    iget v7, v11, Lcom/canhub/cropper/e0;->k:F

    .line 115
    .line 116
    div-float/2addr v6, v7

    .line 117
    add-float/2addr v6, v5

    .line 118
    iput v6, v4, Landroid/graphics/RectF;->right:F

    .line 119
    .line 120
    iget v5, v4, Landroid/graphics/RectF;->top:F

    .line 121
    .line 122
    invoke-virtual {v9}, Landroid/graphics/Rect;->height()I

    .line 123
    .line 124
    .line 125
    move-result v6

    .line 126
    int-to-float v6, v6

    .line 127
    iget v7, v11, Lcom/canhub/cropper/e0;->l:F

    .line 128
    .line 129
    div-float/2addr v6, v7

    .line 130
    add-float/2addr v6, v5

    .line 131
    iput v6, v4, Landroid/graphics/RectF;->bottom:F

    .line 132
    .line 133
    iget v5, v4, Landroid/graphics/RectF;->left:F

    .line 134
    .line 135
    invoke-static {v1, v5}, Ljava/lang/Math;->max(FF)F

    .line 136
    .line 137
    .line 138
    move-result v1

    .line 139
    iput v1, v4, Landroid/graphics/RectF;->left:F

    .line 140
    .line 141
    iget v1, v4, Landroid/graphics/RectF;->top:F

    .line 142
    .line 143
    invoke-static {v2, v1}, Ljava/lang/Math;->max(FF)F

    .line 144
    .line 145
    .line 146
    move-result v1

    .line 147
    iput v1, v4, Landroid/graphics/RectF;->top:F

    .line 148
    .line 149
    iget v1, v4, Landroid/graphics/RectF;->right:F

    .line 150
    .line 151
    invoke-static {v3, v1}, Ljava/lang/Math;->min(FF)F

    .line 152
    .line 153
    .line 154
    move-result v1

    .line 155
    iput v1, v4, Landroid/graphics/RectF;->right:F

    .line 156
    .line 157
    iget v1, v4, Landroid/graphics/RectF;->bottom:F

    .line 158
    .line 159
    invoke-static {v0, v1}, Ljava/lang/Math;->min(FF)F

    .line 160
    .line 161
    .line 162
    move-result v0

    .line 163
    iput v0, v4, Landroid/graphics/RectF;->bottom:F

    .line 164
    .line 165
    goto :goto_0

    .line 166
    :cond_1
    iget-boolean v9, p0, Lcom/canhub/cropper/CropOverlayView;->z:Z

    .line 167
    .line 168
    if-eqz v9, :cond_3

    .line 169
    .line 170
    cmpl-float v9, v3, v1

    .line 171
    .line 172
    if-lez v9, :cond_3

    .line 173
    .line 174
    cmpl-float v9, v0, v2

    .line 175
    .line 176
    if-lez v9, :cond_3

    .line 177
    .line 178
    div-float/2addr v6, v8

    .line 179
    iget v8, p0, Lcom/canhub/cropper/CropOverlayView;->C:F

    .line 180
    .line 181
    cmpl-float v6, v6, v8

    .line 182
    .line 183
    const/high16 v8, 0x40000000    # 2.0f

    .line 184
    .line 185
    if-lez v6, :cond_2

    .line 186
    .line 187
    add-float/2addr v2, v5

    .line 188
    iput v2, v4, Landroid/graphics/RectF;->top:F

    .line 189
    .line 190
    sub-float/2addr v0, v5

    .line 191
    iput v0, v4, Landroid/graphics/RectF;->bottom:F

    .line 192
    .line 193
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 194
    .line 195
    .line 196
    move-result v0

    .line 197
    int-to-float v0, v0

    .line 198
    div-float/2addr v0, v8

    .line 199
    iget v1, p0, Lcom/canhub/cropper/CropOverlayView;->A:I

    .line 200
    .line 201
    int-to-float v1, v1

    .line 202
    iget v2, p0, Lcom/canhub/cropper/CropOverlayView;->B:I

    .line 203
    .line 204
    int-to-float v2, v2

    .line 205
    div-float/2addr v1, v2

    .line 206
    iput v1, p0, Lcom/canhub/cropper/CropOverlayView;->C:F

    .line 207
    .line 208
    invoke-virtual {v11}, Lcom/canhub/cropper/e0;->e()F

    .line 209
    .line 210
    .line 211
    move-result v1

    .line 212
    invoke-virtual {v4}, Landroid/graphics/RectF;->height()F

    .line 213
    .line 214
    .line 215
    move-result v2

    .line 216
    iget v3, p0, Lcom/canhub/cropper/CropOverlayView;->C:F

    .line 217
    .line 218
    mul-float/2addr v2, v3

    .line 219
    invoke-static {v1, v2}, Ljava/lang/Math;->max(FF)F

    .line 220
    .line 221
    .line 222
    move-result v1

    .line 223
    div-float/2addr v1, v8

    .line 224
    sub-float v2, v0, v1

    .line 225
    .line 226
    iput v2, v4, Landroid/graphics/RectF;->left:F

    .line 227
    .line 228
    add-float/2addr v0, v1

    .line 229
    iput v0, v4, Landroid/graphics/RectF;->right:F

    .line 230
    .line 231
    goto :goto_0

    .line 232
    :cond_2
    add-float/2addr v1, v7

    .line 233
    iput v1, v4, Landroid/graphics/RectF;->left:F

    .line 234
    .line 235
    sub-float/2addr v3, v7

    .line 236
    iput v3, v4, Landroid/graphics/RectF;->right:F

    .line 237
    .line 238
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 239
    .line 240
    .line 241
    move-result v0

    .line 242
    int-to-float v0, v0

    .line 243
    div-float/2addr v0, v8

    .line 244
    invoke-virtual {v11}, Lcom/canhub/cropper/e0;->d()F

    .line 245
    .line 246
    .line 247
    move-result v1

    .line 248
    invoke-virtual {v4}, Landroid/graphics/RectF;->width()F

    .line 249
    .line 250
    .line 251
    move-result v2

    .line 252
    iget v3, p0, Lcom/canhub/cropper/CropOverlayView;->C:F

    .line 253
    .line 254
    div-float/2addr v2, v3

    .line 255
    invoke-static {v1, v2}, Ljava/lang/Math;->max(FF)F

    .line 256
    .line 257
    .line 258
    move-result v1

    .line 259
    div-float/2addr v1, v8

    .line 260
    sub-float v2, v0, v1

    .line 261
    .line 262
    iput v2, v4, Landroid/graphics/RectF;->top:F

    .line 263
    .line 264
    add-float/2addr v0, v1

    .line 265
    iput v0, v4, Landroid/graphics/RectF;->bottom:F

    .line 266
    .line 267
    goto :goto_0

    .line 268
    :cond_3
    add-float/2addr v1, v7

    .line 269
    iput v1, v4, Landroid/graphics/RectF;->left:F

    .line 270
    .line 271
    add-float/2addr v2, v5

    .line 272
    iput v2, v4, Landroid/graphics/RectF;->top:F

    .line 273
    .line 274
    sub-float/2addr v3, v7

    .line 275
    iput v3, v4, Landroid/graphics/RectF;->right:F

    .line 276
    .line 277
    sub-float/2addr v0, v5

    .line 278
    iput v0, v4, Landroid/graphics/RectF;->bottom:F

    .line 279
    .line 280
    :goto_0
    invoke-virtual {p0, v4}, Lcom/canhub/cropper/CropOverlayView;->e(Landroid/graphics/RectF;)V

    .line 281
    .line 282
    .line 283
    iget-object v0, v11, Lcom/canhub/cropper/e0;->a:Landroid/graphics/RectF;

    .line 284
    .line 285
    invoke-virtual {v0, v4}, Landroid/graphics/RectF;->set(Landroid/graphics/RectF;)V

    .line 286
    .line 287
    .line 288
    :cond_4
    :goto_1
    return-void
.end method

.method public final g()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/canhub/cropper/CropOverlayView;->L:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    sget-object v0, Lcom/canhub/cropper/h;->b:Landroid/graphics/RectF;

    .line 6
    .line 7
    invoke-virtual {p0, v0}, Lcom/canhub/cropper/CropOverlayView;->setCropWindowRect(Landroid/graphics/RectF;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Lcom/canhub/cropper/CropOverlayView;->f()V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
.end method

.method public final getAspectRatioX()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/canhub/cropper/CropOverlayView;->A:I

    .line 2
    .line 3
    return v0
.end method

.method public final getAspectRatioY()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/canhub/cropper/CropOverlayView;->B:I

    .line 2
    .line 3
    return v0
.end method

.method public final getCornerShape()Lcom/canhub/cropper/CropImageView$CropCornerShape;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/canhub/cropper/CropOverlayView;->F:Lcom/canhub/cropper/CropImageView$CropCornerShape;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getCropShape()Lcom/canhub/cropper/CropImageView$CropShape;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/canhub/cropper/CropOverlayView;->E:Lcom/canhub/cropper/CropImageView$CropShape;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getCropWindowRect()Landroid/graphics/RectF;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/canhub/cropper/CropOverlayView;->g:Lcom/canhub/cropper/e0;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/canhub/cropper/e0;->g()Landroid/graphics/RectF;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public final getGuidelines()Lcom/canhub/cropper/CropImageView$Guidelines;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/canhub/cropper/CropOverlayView;->D:Lcom/canhub/cropper/CropImageView$Guidelines;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getInitialCropWindowRect()Landroid/graphics/Rect;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/canhub/cropper/CropOverlayView;->K:Landroid/graphics/Rect;

    .line 2
    .line 3
    return-object v0
.end method

.method public final h([FII)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/canhub/cropper/CropOverlayView;->p:[F

    .line 2
    .line 3
    if-eqz p1, :cond_1

    .line 4
    .line 5
    invoke-static {v0, p1}, Ljava/util/Arrays;->equals([F[F)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    return-void

    .line 13
    :cond_1
    :goto_0
    const/4 v1, 0x0

    .line 14
    if-nez p1, :cond_2

    .line 15
    .line 16
    invoke-static {v0, v1}, Ljava/util/Arrays;->fill([FF)V

    .line 17
    .line 18
    .line 19
    goto :goto_1

    .line 20
    :cond_2
    array-length v2, p1

    .line 21
    const/4 v3, 0x0

    .line 22
    invoke-static {p1, v3, v0, v3, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 23
    .line 24
    .line 25
    :goto_1
    iput p2, p0, Lcom/canhub/cropper/CropOverlayView;->r:I

    .line 26
    .line 27
    iput p3, p0, Lcom/canhub/cropper/CropOverlayView;->s:I

    .line 28
    .line 29
    iget-object p1, p0, Lcom/canhub/cropper/CropOverlayView;->g:Lcom/canhub/cropper/e0;

    .line 30
    .line 31
    invoke-virtual {p1}, Lcom/canhub/cropper/e0;->g()Landroid/graphics/RectF;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    invoke-virtual {p1}, Landroid/graphics/RectF;->width()F

    .line 36
    .line 37
    .line 38
    move-result p2

    .line 39
    cmpg-float p2, p2, v1

    .line 40
    .line 41
    if-nez p2, :cond_3

    .line 42
    .line 43
    goto :goto_2

    .line 44
    :cond_3
    invoke-virtual {p1}, Landroid/graphics/RectF;->height()F

    .line 45
    .line 46
    .line 47
    move-result p1

    .line 48
    cmpg-float p1, p1, v1

    .line 49
    .line 50
    if-nez p1, :cond_4

    .line 51
    .line 52
    :goto_2
    invoke-virtual {p0}, Lcom/canhub/cropper/CropOverlayView;->f()V

    .line 53
    .line 54
    .line 55
    :cond_4
    return-void
.end method

.method public final onDraw(Landroid/graphics/Canvas;)V
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    const-string v2, "canvas"

    .line 6
    .line 7
    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-super/range {p0 .. p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    .line 11
    .line 12
    .line 13
    iget-object v7, v0, Lcom/canhub/cropper/CropOverlayView;->g:Lcom/canhub/cropper/e0;

    .line 14
    .line 15
    invoke-virtual {v7}, Lcom/canhub/cropper/e0;->g()Landroid/graphics/RectF;

    .line 16
    .line 17
    .line 18
    move-result-object v8

    .line 19
    sget-object v2, Lcom/canhub/cropper/h;->a:Landroid/graphics/Rect;

    .line 20
    .line 21
    iget-object v2, v0, Lcom/canhub/cropper/CropOverlayView;->p:[F

    .line 22
    .line 23
    invoke-static {v2}, Lcom/canhub/cropper/h;->q([F)F

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    const/4 v9, 0x0

    .line 28
    invoke-static {v3, v9}, Ljava/lang/Math;->max(FF)F

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    invoke-static {v2}, Lcom/canhub/cropper/h;->s([F)F

    .line 33
    .line 34
    .line 35
    move-result v4

    .line 36
    invoke-static {v4, v9}, Ljava/lang/Math;->max(FF)F

    .line 37
    .line 38
    .line 39
    move-result v4

    .line 40
    invoke-static {v2}, Lcom/canhub/cropper/h;->r([F)F

    .line 41
    .line 42
    .line 43
    move-result v5

    .line 44
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 45
    .line 46
    .line 47
    move-result v6

    .line 48
    int-to-float v6, v6

    .line 49
    invoke-static {v5, v6}, Ljava/lang/Math;->min(FF)F

    .line 50
    .line 51
    .line 52
    move-result v5

    .line 53
    invoke-static {v2}, Lcom/canhub/cropper/h;->l([F)F

    .line 54
    .line 55
    .line 56
    move-result v6

    .line 57
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    .line 58
    .line 59
    .line 60
    move-result v10

    .line 61
    int-to-float v10, v10

    .line 62
    invoke-static {v6, v10}, Ljava/lang/Math;->min(FF)F

    .line 63
    .line 64
    .line 65
    move-result v6

    .line 66
    iget-object v10, v0, Lcom/canhub/cropper/CropOverlayView;->E:Lcom/canhub/cropper/CropImageView$CropShape;

    .line 67
    .line 68
    if-nez v10, :cond_0

    .line 69
    .line 70
    const/4 v10, -0x1

    .line 71
    goto :goto_0

    .line 72
    :cond_0
    sget-object v12, Lcom/canhub/cropper/c0;->a:[I

    .line 73
    .line 74
    invoke-virtual {v10}, Ljava/lang/Enum;->ordinal()I

    .line 75
    .line 76
    .line 77
    move-result v10

    .line 78
    aget v10, v12, v10

    .line 79
    .line 80
    :goto_0
    const-string v13, "Unrecognized crop shape"

    .line 81
    .line 82
    const/4 v15, 0x4

    .line 83
    const/4 v9, 0x3

    .line 84
    const/4 v11, 0x2

    .line 85
    const/16 v16, 0x0

    .line 86
    .line 87
    const/4 v12, 0x1

    .line 88
    iget-object v14, v0, Lcom/canhub/cropper/CropOverlayView;->o:Landroid/graphics/Path;

    .line 89
    .line 90
    if-eq v10, v12, :cond_3

    .line 91
    .line 92
    if-eq v10, v11, :cond_3

    .line 93
    .line 94
    if-eq v10, v9, :cond_3

    .line 95
    .line 96
    if-ne v10, v15, :cond_2

    .line 97
    .line 98
    invoke-virtual {v14}, Landroid/graphics/Path;->reset()V

    .line 99
    .line 100
    .line 101
    iget v2, v8, Landroid/graphics/RectF;->left:F

    .line 102
    .line 103
    iget v10, v8, Landroid/graphics/RectF;->top:F

    .line 104
    .line 105
    move/from16 v17, v15

    .line 106
    .line 107
    iget v15, v8, Landroid/graphics/RectF;->right:F

    .line 108
    .line 109
    iget v8, v8, Landroid/graphics/RectF;->bottom:F

    .line 110
    .line 111
    move/from16 v18, v9

    .line 112
    .line 113
    iget-object v9, v0, Lcom/canhub/cropper/CropOverlayView;->i:Landroid/graphics/RectF;

    .line 114
    .line 115
    invoke-virtual {v9, v2, v10, v15, v8}, Landroid/graphics/RectF;->set(FFFF)V

    .line 116
    .line 117
    .line 118
    sget-object v2, Landroid/graphics/Path$Direction;->CW:Landroid/graphics/Path$Direction;

    .line 119
    .line 120
    invoke-virtual {v14, v9, v2}, Landroid/graphics/Path;->addOval(Landroid/graphics/RectF;Landroid/graphics/Path$Direction;)V

    .line 121
    .line 122
    .line 123
    invoke-virtual {v1}, Landroid/graphics/Canvas;->save()I

    .line 124
    .line 125
    .line 126
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 127
    .line 128
    const/16 v8, 0x1a

    .line 129
    .line 130
    if-lt v2, v8, :cond_1

    .line 131
    .line 132
    invoke-static {v1, v14}, Landroidx/core/util/a;->r(Landroid/graphics/Canvas;Landroid/graphics/Path;)V

    .line 133
    .line 134
    .line 135
    :goto_1
    move v2, v3

    .line 136
    move v3, v4

    .line 137
    move v4, v5

    .line 138
    move v5, v6

    .line 139
    goto :goto_2

    .line 140
    :cond_1
    sget-object v2, Landroid/graphics/Region$Op;->XOR:Landroid/graphics/Region$Op;

    .line 141
    .line 142
    invoke-virtual {v1, v14, v2}, Landroid/graphics/Canvas;->clipPath(Landroid/graphics/Path;Landroid/graphics/Region$Op;)Z

    .line 143
    .line 144
    .line 145
    goto :goto_1

    .line 146
    :goto_2
    iget-object v6, v0, Lcom/canhub/cropper/CropOverlayView;->m:Landroid/graphics/Paint;

    .line 147
    .line 148
    invoke-static {v6}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 149
    .line 150
    .line 151
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 152
    .line 153
    .line 154
    invoke-virtual/range {p1 .. p1}, Landroid/graphics/Canvas;->restore()V

    .line 155
    .line 156
    .line 157
    move-object/from16 v1, p1

    .line 158
    .line 159
    goto/16 :goto_5

    .line 160
    .line 161
    :cond_2
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 162
    .line 163
    invoke-direct {v1, v13}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 164
    .line 165
    .line 166
    throw v1

    .line 167
    :cond_3
    move-object v1, v2

    .line 168
    move v2, v3

    .line 169
    move v3, v4

    .line 170
    move v4, v5

    .line 171
    move/from16 v18, v9

    .line 172
    .line 173
    move/from16 v17, v15

    .line 174
    .line 175
    move v9, v6

    .line 176
    aget v5, v1, v16

    .line 177
    .line 178
    const/4 v6, 0x6

    .line 179
    aget v10, v1, v6

    .line 180
    .line 181
    cmpg-float v5, v5, v10

    .line 182
    .line 183
    if-nez v5, :cond_4

    .line 184
    .line 185
    goto :goto_3

    .line 186
    :cond_4
    aget v5, v1, v12

    .line 187
    .line 188
    const/4 v10, 0x7

    .line 189
    aget v15, v1, v10

    .line 190
    .line 191
    cmpg-float v5, v5, v15

    .line 192
    .line 193
    if-nez v5, :cond_5

    .line 194
    .line 195
    :goto_3
    iget v5, v8, Landroid/graphics/RectF;->top:F

    .line 196
    .line 197
    iget-object v6, v0, Lcom/canhub/cropper/CropOverlayView;->m:Landroid/graphics/Paint;

    .line 198
    .line 199
    invoke-static {v6}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 200
    .line 201
    .line 202
    move-object/from16 v1, p1

    .line 203
    .line 204
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 205
    .line 206
    .line 207
    iget v3, v8, Landroid/graphics/RectF;->bottom:F

    .line 208
    .line 209
    iget-object v6, v0, Lcom/canhub/cropper/CropOverlayView;->m:Landroid/graphics/Paint;

    .line 210
    .line 211
    invoke-static {v6}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 212
    .line 213
    .line 214
    move v5, v9

    .line 215
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 216
    .line 217
    .line 218
    move v9, v4

    .line 219
    iget v3, v8, Landroid/graphics/RectF;->top:F

    .line 220
    .line 221
    iget v4, v8, Landroid/graphics/RectF;->left:F

    .line 222
    .line 223
    iget v5, v8, Landroid/graphics/RectF;->bottom:F

    .line 224
    .line 225
    iget-object v6, v0, Lcom/canhub/cropper/CropOverlayView;->m:Landroid/graphics/Paint;

    .line 226
    .line 227
    invoke-static {v6}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 228
    .line 229
    .line 230
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 231
    .line 232
    .line 233
    iget v2, v8, Landroid/graphics/RectF;->right:F

    .line 234
    .line 235
    iget v3, v8, Landroid/graphics/RectF;->top:F

    .line 236
    .line 237
    iget v5, v8, Landroid/graphics/RectF;->bottom:F

    .line 238
    .line 239
    iget-object v6, v0, Lcom/canhub/cropper/CropOverlayView;->m:Landroid/graphics/Paint;

    .line 240
    .line 241
    invoke-static {v6}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 242
    .line 243
    .line 244
    move v4, v9

    .line 245
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 246
    .line 247
    .line 248
    goto :goto_5

    .line 249
    :cond_5
    move v5, v9

    .line 250
    move v9, v4

    .line 251
    move v4, v3

    .line 252
    move v3, v2

    .line 253
    move-object/from16 v2, p1

    .line 254
    .line 255
    invoke-virtual {v14}, Landroid/graphics/Path;->reset()V

    .line 256
    .line 257
    .line 258
    aget v8, v1, v16

    .line 259
    .line 260
    aget v15, v1, v12

    .line 261
    .line 262
    invoke-virtual {v14, v8, v15}, Landroid/graphics/Path;->moveTo(FF)V

    .line 263
    .line 264
    .line 265
    aget v8, v1, v11

    .line 266
    .line 267
    aget v15, v1, v18

    .line 268
    .line 269
    invoke-virtual {v14, v8, v15}, Landroid/graphics/Path;->lineTo(FF)V

    .line 270
    .line 271
    .line 272
    aget v8, v1, v17

    .line 273
    .line 274
    const/4 v15, 0x5

    .line 275
    aget v15, v1, v15

    .line 276
    .line 277
    invoke-virtual {v14, v8, v15}, Landroid/graphics/Path;->lineTo(FF)V

    .line 278
    .line 279
    .line 280
    aget v6, v1, v6

    .line 281
    .line 282
    aget v1, v1, v10

    .line 283
    .line 284
    invoke-virtual {v14, v6, v1}, Landroid/graphics/Path;->lineTo(FF)V

    .line 285
    .line 286
    .line 287
    invoke-virtual {v14}, Landroid/graphics/Path;->close()V

    .line 288
    .line 289
    .line 290
    invoke-virtual {v2}, Landroid/graphics/Canvas;->save()I

    .line 291
    .line 292
    .line 293
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 294
    .line 295
    const/16 v8, 0x1a

    .line 296
    .line 297
    if-lt v1, v8, :cond_6

    .line 298
    .line 299
    invoke-static {v2, v14}, Landroidx/core/util/a;->r(Landroid/graphics/Canvas;Landroid/graphics/Path;)V

    .line 300
    .line 301
    .line 302
    goto :goto_4

    .line 303
    :cond_6
    sget-object v1, Landroid/graphics/Region$Op;->INTERSECT:Landroid/graphics/Region$Op;

    .line 304
    .line 305
    invoke-virtual {v2, v14, v1}, Landroid/graphics/Canvas;->clipPath(Landroid/graphics/Path;Landroid/graphics/Region$Op;)Z

    .line 306
    .line 307
    .line 308
    :goto_4
    iget-object v6, v0, Lcom/canhub/cropper/CropOverlayView;->m:Landroid/graphics/Paint;

    .line 309
    .line 310
    invoke-static {v6}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 311
    .line 312
    .line 313
    move-object v1, v2

    .line 314
    move v2, v3

    .line 315
    move v3, v4

    .line 316
    move v4, v9

    .line 317
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 318
    .line 319
    .line 320
    invoke-virtual {v1}, Landroid/graphics/Canvas;->restore()V

    .line 321
    .line 322
    .line 323
    :goto_5
    iget-object v2, v7, Lcom/canhub/cropper/e0;->a:Landroid/graphics/RectF;

    .line 324
    .line 325
    invoke-virtual {v2}, Landroid/graphics/RectF;->width()F

    .line 326
    .line 327
    .line 328
    move-result v3

    .line 329
    const/high16 v4, 0x42c80000    # 100.0f

    .line 330
    .line 331
    cmpg-float v3, v3, v4

    .line 332
    .line 333
    if-ltz v3, :cond_8

    .line 334
    .line 335
    invoke-virtual {v2}, Landroid/graphics/RectF;->height()F

    .line 336
    .line 337
    .line 338
    move-result v2

    .line 339
    cmpg-float v2, v2, v4

    .line 340
    .line 341
    if-ltz v2, :cond_8

    .line 342
    .line 343
    iget-object v2, v0, Lcom/canhub/cropper/CropOverlayView;->D:Lcom/canhub/cropper/CropImageView$Guidelines;

    .line 344
    .line 345
    sget-object v3, Lcom/canhub/cropper/CropImageView$Guidelines;->ON:Lcom/canhub/cropper/CropImageView$Guidelines;

    .line 346
    .line 347
    if-ne v2, v3, :cond_7

    .line 348
    .line 349
    invoke-virtual/range {p0 .. p1}, Lcom/canhub/cropper/CropOverlayView;->c(Landroid/graphics/Canvas;)V

    .line 350
    .line 351
    .line 352
    goto :goto_6

    .line 353
    :cond_7
    sget-object v3, Lcom/canhub/cropper/CropImageView$Guidelines;->ON_TOUCH:Lcom/canhub/cropper/CropImageView$Guidelines;

    .line 354
    .line 355
    if-ne v2, v3, :cond_8

    .line 356
    .line 357
    iget-object v2, v0, Lcom/canhub/cropper/CropOverlayView;->y:Lcom/canhub/cropper/g0;

    .line 358
    .line 359
    if-eqz v2, :cond_8

    .line 360
    .line 361
    invoke-virtual/range {p0 .. p1}, Lcom/canhub/cropper/CropOverlayView;->c(Landroid/graphics/Canvas;)V

    .line 362
    .line 363
    .line 364
    :cond_8
    :goto_6
    iget-object v2, v0, Lcom/canhub/cropper/CropOverlayView;->c:Lcom/canhub/cropper/CropImageOptions;

    .line 365
    .line 366
    if-eqz v2, :cond_9

    .line 367
    .line 368
    iget v3, v2, Lcom/canhub/cropper/CropImageOptions;->y:F

    .line 369
    .line 370
    goto :goto_7

    .line 371
    :cond_9
    const/4 v3, 0x0

    .line 372
    :goto_7
    if-eqz v2, :cond_a

    .line 373
    .line 374
    iget v2, v2, Lcom/canhub/cropper/CropImageOptions;->B:I

    .line 375
    .line 376
    goto :goto_8

    .line 377
    :cond_a
    const/4 v2, -0x1

    .line 378
    :goto_8
    invoke-static {v3, v2}, La/a;->j(FI)Landroid/graphics/Paint;

    .line 379
    .line 380
    .line 381
    move-result-object v2

    .line 382
    iput-object v2, v0, Lcom/canhub/cropper/CropOverlayView;->k:Landroid/graphics/Paint;

    .line 383
    .line 384
    iget-boolean v2, v0, Lcom/canhub/cropper/CropOverlayView;->G:Z

    .line 385
    .line 386
    if-eqz v2, :cond_c

    .line 387
    .line 388
    invoke-virtual {v7}, Lcom/canhub/cropper/e0;->g()Landroid/graphics/RectF;

    .line 389
    .line 390
    .line 391
    move-result-object v2

    .line 392
    iget v3, v2, Landroid/graphics/RectF;->left:F

    .line 393
    .line 394
    iget v4, v2, Landroid/graphics/RectF;->right:F

    .line 395
    .line 396
    add-float/2addr v3, v4

    .line 397
    int-to-float v4, v11

    .line 398
    div-float/2addr v3, v4

    .line 399
    iget v2, v2, Landroid/graphics/RectF;->top:F

    .line 400
    .line 401
    const/16 v4, 0x32

    .line 402
    .line 403
    int-to-float v4, v4

    .line 404
    sub-float/2addr v2, v4

    .line 405
    iget-object v4, v0, Lcom/canhub/cropper/CropOverlayView;->n:Landroid/graphics/Paint;

    .line 406
    .line 407
    if-eqz v4, :cond_b

    .line 408
    .line 409
    iget v5, v0, Lcom/canhub/cropper/CropOverlayView;->I:F

    .line 410
    .line 411
    invoke-virtual {v4, v5}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 412
    .line 413
    .line 414
    iget v5, v0, Lcom/canhub/cropper/CropOverlayView;->J:I

    .line 415
    .line 416
    invoke-virtual {v4, v5}, Landroid/graphics/Paint;->setColor(I)V

    .line 417
    .line 418
    .line 419
    :cond_b
    iget-object v4, v0, Lcom/canhub/cropper/CropOverlayView;->H:Ljava/lang/String;

    .line 420
    .line 421
    iget-object v5, v0, Lcom/canhub/cropper/CropOverlayView;->n:Landroid/graphics/Paint;

    .line 422
    .line 423
    invoke-static {v5}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 424
    .line 425
    .line 426
    invoke-virtual {v1, v4, v3, v2, v5}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 427
    .line 428
    .line 429
    invoke-virtual {v1}, Landroid/graphics/Canvas;->save()I

    .line 430
    .line 431
    .line 432
    :cond_c
    iget-object v2, v0, Lcom/canhub/cropper/CropOverlayView;->j:Landroid/graphics/Paint;

    .line 433
    .line 434
    if-eqz v2, :cond_10

    .line 435
    .line 436
    invoke-virtual {v2}, Landroid/graphics/Paint;->getStrokeWidth()F

    .line 437
    .line 438
    .line 439
    move-result v2

    .line 440
    invoke-virtual {v7}, Lcom/canhub/cropper/e0;->g()Landroid/graphics/RectF;

    .line 441
    .line 442
    .line 443
    move-result-object v3

    .line 444
    int-to-float v4, v11

    .line 445
    div-float/2addr v2, v4

    .line 446
    invoke-virtual {v3, v2, v2}, Landroid/graphics/RectF;->inset(FF)V

    .line 447
    .line 448
    .line 449
    iget-object v2, v0, Lcom/canhub/cropper/CropOverlayView;->E:Lcom/canhub/cropper/CropImageView$CropShape;

    .line 450
    .line 451
    if-nez v2, :cond_d

    .line 452
    .line 453
    const/4 v2, -0x1

    .line 454
    goto :goto_9

    .line 455
    :cond_d
    sget-object v4, Lcom/canhub/cropper/c0;->a:[I

    .line 456
    .line 457
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    .line 458
    .line 459
    .line 460
    move-result v2

    .line 461
    aget v2, v4, v2

    .line 462
    .line 463
    :goto_9
    if-eq v2, v12, :cond_f

    .line 464
    .line 465
    if-eq v2, v11, :cond_f

    .line 466
    .line 467
    move/from16 v4, v18

    .line 468
    .line 469
    if-eq v2, v4, :cond_f

    .line 470
    .line 471
    move/from16 v4, v17

    .line 472
    .line 473
    if-ne v2, v4, :cond_e

    .line 474
    .line 475
    iget-object v2, v0, Lcom/canhub/cropper/CropOverlayView;->j:Landroid/graphics/Paint;

    .line 476
    .line 477
    invoke-static {v2}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 478
    .line 479
    .line 480
    invoke-virtual {v1, v3, v2}, Landroid/graphics/Canvas;->drawOval(Landroid/graphics/RectF;Landroid/graphics/Paint;)V

    .line 481
    .line 482
    .line 483
    goto :goto_a

    .line 484
    :cond_e
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 485
    .line 486
    invoke-direct {v1, v13}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 487
    .line 488
    .line 489
    throw v1

    .line 490
    :cond_f
    iget-object v2, v0, Lcom/canhub/cropper/CropOverlayView;->j:Landroid/graphics/Paint;

    .line 491
    .line 492
    invoke-static {v2}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 493
    .line 494
    .line 495
    invoke-virtual {v1, v3, v2}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/RectF;Landroid/graphics/Paint;)V

    .line 496
    .line 497
    .line 498
    :cond_10
    :goto_a
    iget-object v2, v0, Lcom/canhub/cropper/CropOverlayView;->k:Landroid/graphics/Paint;

    .line 499
    .line 500
    if-eqz v2, :cond_16

    .line 501
    .line 502
    iget-object v2, v0, Lcom/canhub/cropper/CropOverlayView;->j:Landroid/graphics/Paint;

    .line 503
    .line 504
    if-eqz v2, :cond_11

    .line 505
    .line 506
    invoke-virtual {v2}, Landroid/graphics/Paint;->getStrokeWidth()F

    .line 507
    .line 508
    .line 509
    move-result v9

    .line 510
    goto :goto_b

    .line 511
    :cond_11
    const/4 v9, 0x0

    .line 512
    :goto_b
    iget-object v2, v0, Lcom/canhub/cropper/CropOverlayView;->k:Landroid/graphics/Paint;

    .line 513
    .line 514
    invoke-static {v2}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 515
    .line 516
    .line 517
    invoke-virtual {v2}, Landroid/graphics/Paint;->getStrokeWidth()F

    .line 518
    .line 519
    .line 520
    move-result v2

    .line 521
    sub-float v3, v2, v9

    .line 522
    .line 523
    int-to-float v4, v11

    .line 524
    div-float/2addr v3, v4

    .line 525
    div-float/2addr v2, v4

    .line 526
    add-float v4, v2, v3

    .line 527
    .line 528
    iget-object v5, v0, Lcom/canhub/cropper/CropOverlayView;->E:Lcom/canhub/cropper/CropImageView$CropShape;

    .line 529
    .line 530
    if-nez v5, :cond_12

    .line 531
    .line 532
    const/4 v5, -0x1

    .line 533
    goto :goto_c

    .line 534
    :cond_12
    sget-object v6, Lcom/canhub/cropper/c0;->a:[I

    .line 535
    .line 536
    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    .line 537
    .line 538
    .line 539
    move-result v5

    .line 540
    aget v5, v6, v5

    .line 541
    .line 542
    :goto_c
    if-eq v5, v12, :cond_14

    .line 543
    .line 544
    if-eq v5, v11, :cond_14

    .line 545
    .line 546
    const/4 v6, 0x3

    .line 547
    if-eq v5, v6, :cond_14

    .line 548
    .line 549
    const/4 v6, 0x4

    .line 550
    if-ne v5, v6, :cond_13

    .line 551
    .line 552
    goto :goto_d

    .line 553
    :cond_13
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 554
    .line 555
    invoke-direct {v1, v13}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 556
    .line 557
    .line 558
    throw v1

    .line 559
    :cond_14
    iget v5, v0, Lcom/canhub/cropper/CropOverlayView;->t:F

    .line 560
    .line 561
    add-float/2addr v2, v5

    .line 562
    :goto_d
    invoke-virtual {v7}, Lcom/canhub/cropper/e0;->g()Landroid/graphics/RectF;

    .line 563
    .line 564
    .line 565
    move-result-object v5

    .line 566
    invoke-virtual {v5, v2, v2}, Landroid/graphics/RectF;->inset(FF)V

    .line 567
    .line 568
    .line 569
    invoke-virtual {v0, v1, v3, v4, v5}, Lcom/canhub/cropper/CropOverlayView;->b(Landroid/graphics/Canvas;FFLandroid/graphics/RectF;)V

    .line 570
    .line 571
    .line 572
    iget-object v2, v0, Lcom/canhub/cropper/CropOverlayView;->F:Lcom/canhub/cropper/CropImageView$CropCornerShape;

    .line 573
    .line 574
    sget-object v6, Lcom/canhub/cropper/CropImageView$CropCornerShape;->OVAL:Lcom/canhub/cropper/CropImageView$CropCornerShape;

    .line 575
    .line 576
    if-ne v2, v6, :cond_16

    .line 577
    .line 578
    iget-object v2, v0, Lcom/canhub/cropper/CropOverlayView;->b:Ljava/lang/Integer;

    .line 579
    .line 580
    if-eqz v2, :cond_15

    .line 581
    .line 582
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 583
    .line 584
    .line 585
    move-result v2

    .line 586
    new-instance v6, Landroid/graphics/Paint;

    .line 587
    .line 588
    invoke-direct {v6}, Landroid/graphics/Paint;-><init>()V

    .line 589
    .line 590
    .line 591
    invoke-virtual {v6, v2}, Landroid/graphics/Paint;->setColor(I)V

    .line 592
    .line 593
    .line 594
    sget-object v2, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 595
    .line 596
    invoke-virtual {v6, v2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 597
    .line 598
    .line 599
    invoke-virtual {v6, v12}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 600
    .line 601
    .line 602
    goto :goto_e

    .line 603
    :cond_15
    const/4 v6, 0x0

    .line 604
    :goto_e
    iput-object v6, v0, Lcom/canhub/cropper/CropOverlayView;->k:Landroid/graphics/Paint;

    .line 605
    .line 606
    invoke-virtual {v0, v1, v3, v4, v5}, Lcom/canhub/cropper/CropOverlayView;->b(Landroid/graphics/Canvas;FFLandroid/graphics/RectF;)V

    .line 607
    .line 608
    .line 609
    :cond_16
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 610
    .line 611
    const/16 v2, 0x1d

    .line 612
    .line 613
    if-lt v1, v2, :cond_1a

    .line 614
    .line 615
    invoke-virtual {v7}, Lcom/canhub/cropper/e0;->g()Landroid/graphics/RectF;

    .line 616
    .line 617
    .line 618
    move-result-object v1

    .line 619
    invoke-static {v0}, Landroidx/transition/c;->l(Lcom/canhub/cropper/CropOverlayView;)Ljava/util/List;

    .line 620
    .line 621
    .line 622
    move-result-object v2

    .line 623
    const-string v3, "getSystemGestureExclusionRects(...)"

    .line 624
    .line 625
    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 626
    .line 627
    .line 628
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 629
    .line 630
    .line 631
    move-result v4

    .line 632
    if-lez v4, :cond_17

    .line 633
    .line 634
    move/from16 v4, v16

    .line 635
    .line 636
    invoke-interface {v2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 637
    .line 638
    .line 639
    move-result-object v2

    .line 640
    goto :goto_f

    .line 641
    :cond_17
    new-instance v2, Landroid/graphics/Rect;

    .line 642
    .line 643
    invoke-direct {v2}, Landroid/graphics/Rect;-><init>()V

    .line 644
    .line 645
    .line 646
    :goto_f
    check-cast v2, Landroid/graphics/Rect;

    .line 647
    .line 648
    invoke-static {v0}, Landroidx/transition/c;->l(Lcom/canhub/cropper/CropOverlayView;)Ljava/util/List;

    .line 649
    .line 650
    .line 651
    move-result-object v4

    .line 652
    invoke-static {v4, v3}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 653
    .line 654
    .line 655
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 656
    .line 657
    .line 658
    move-result v5

    .line 659
    if-ge v12, v5, :cond_18

    .line 660
    .line 661
    invoke-interface {v4, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 662
    .line 663
    .line 664
    move-result-object v4

    .line 665
    goto :goto_10

    .line 666
    :cond_18
    new-instance v4, Landroid/graphics/Rect;

    .line 667
    .line 668
    invoke-direct {v4}, Landroid/graphics/Rect;-><init>()V

    .line 669
    .line 670
    .line 671
    :goto_10
    check-cast v4, Landroid/graphics/Rect;

    .line 672
    .line 673
    invoke-static {v0}, Landroidx/transition/c;->l(Lcom/canhub/cropper/CropOverlayView;)Ljava/util/List;

    .line 674
    .line 675
    .line 676
    move-result-object v5

    .line 677
    invoke-static {v5, v3}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 678
    .line 679
    .line 680
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 681
    .line 682
    .line 683
    move-result v3

    .line 684
    if-ge v11, v3, :cond_19

    .line 685
    .line 686
    invoke-interface {v5, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 687
    .line 688
    .line 689
    move-result-object v3

    .line 690
    goto :goto_11

    .line 691
    :cond_19
    new-instance v3, Landroid/graphics/Rect;

    .line 692
    .line 693
    invoke-direct {v3}, Landroid/graphics/Rect;-><init>()V

    .line 694
    .line 695
    .line 696
    :goto_11
    check-cast v3, Landroid/graphics/Rect;

    .line 697
    .line 698
    iget v5, v1, Landroid/graphics/RectF;->left:F

    .line 699
    .line 700
    iget v6, v0, Lcom/canhub/cropper/CropOverlayView;->w:F

    .line 701
    .line 702
    sub-float/2addr v5, v6

    .line 703
    float-to-int v5, v5

    .line 704
    iput v5, v2, Landroid/graphics/Rect;->left:I

    .line 705
    .line 706
    iget v7, v1, Landroid/graphics/RectF;->right:F

    .line 707
    .line 708
    add-float/2addr v7, v6

    .line 709
    float-to-int v7, v7

    .line 710
    iput v7, v2, Landroid/graphics/Rect;->right:I

    .line 711
    .line 712
    iget v8, v1, Landroid/graphics/RectF;->top:F

    .line 713
    .line 714
    sub-float v9, v8, v6

    .line 715
    .line 716
    float-to-int v9, v9

    .line 717
    iput v9, v2, Landroid/graphics/Rect;->top:I

    .line 718
    .line 719
    int-to-float v9, v9

    .line 720
    iget v10, v0, Lcom/canhub/cropper/CropOverlayView;->M:F

    .line 721
    .line 722
    const v11, 0x3e99999a    # 0.3f

    .line 723
    .line 724
    .line 725
    mul-float/2addr v11, v10

    .line 726
    add-float/2addr v9, v11

    .line 727
    float-to-int v9, v9

    .line 728
    iput v9, v2, Landroid/graphics/Rect;->bottom:I

    .line 729
    .line 730
    iput v5, v4, Landroid/graphics/Rect;->left:I

    .line 731
    .line 732
    iput v7, v4, Landroid/graphics/Rect;->right:I

    .line 733
    .line 734
    iget v1, v1, Landroid/graphics/RectF;->bottom:F

    .line 735
    .line 736
    add-float/2addr v8, v1

    .line 737
    const/high16 v5, 0x40000000    # 2.0f

    .line 738
    .line 739
    div-float/2addr v8, v5

    .line 740
    const v5, 0x3e4ccccd    # 0.2f

    .line 741
    .line 742
    .line 743
    mul-float/2addr v5, v10

    .line 744
    sub-float/2addr v8, v5

    .line 745
    float-to-int v5, v8

    .line 746
    iput v5, v4, Landroid/graphics/Rect;->top:I

    .line 747
    .line 748
    int-to-float v5, v5

    .line 749
    const v7, 0x3ecccccd    # 0.4f

    .line 750
    .line 751
    .line 752
    mul-float/2addr v10, v7

    .line 753
    add-float/2addr v10, v5

    .line 754
    float-to-int v5, v10

    .line 755
    iput v5, v4, Landroid/graphics/Rect;->bottom:I

    .line 756
    .line 757
    iget v5, v2, Landroid/graphics/Rect;->left:I

    .line 758
    .line 759
    iput v5, v3, Landroid/graphics/Rect;->left:I

    .line 760
    .line 761
    iget v5, v2, Landroid/graphics/Rect;->right:I

    .line 762
    .line 763
    iput v5, v3, Landroid/graphics/Rect;->right:I

    .line 764
    .line 765
    add-float/2addr v1, v6

    .line 766
    float-to-int v1, v1

    .line 767
    iput v1, v3, Landroid/graphics/Rect;->bottom:I

    .line 768
    .line 769
    int-to-float v1, v1

    .line 770
    sub-float/2addr v1, v11

    .line 771
    float-to-int v1, v1

    .line 772
    iput v1, v3, Landroid/graphics/Rect;->top:I

    .line 773
    .line 774
    filled-new-array {v2, v4, v3}, [Landroid/graphics/Rect;

    .line 775
    .line 776
    .line 777
    move-result-object v1

    .line 778
    invoke-static {v1}, Lkotlin/collections/u;->z([Ljava/lang/Object;)Ljava/util/List;

    .line 779
    .line 780
    .line 781
    move-result-object v1

    .line 782
    invoke-static {v0, v1}, Landroidx/transition/c;->q(Lcom/canhub/cropper/CropOverlayView;Ljava/util/List;)V

    .line 783
    .line 784
    .line 785
    :cond_1a
    return-void
.end method

.method public final onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    const-string v2, "event"

    .line 6
    .line 7
    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0}, Landroid/view/View;->isEnabled()Z

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    const/4 v3, 0x0

    .line 15
    if-eqz v2, :cond_30

    .line 16
    .line 17
    iget-boolean v2, v0, Lcom/canhub/cropper/CropOverlayView;->e:Z

    .line 18
    .line 19
    if-eqz v2, :cond_0

    .line 20
    .line 21
    iget-object v2, v0, Lcom/canhub/cropper/CropOverlayView;->d:Landroid/view/ScaleGestureDetector;

    .line 22
    .line 23
    if-eqz v2, :cond_0

    .line 24
    .line 25
    invoke-virtual {v2, v1}, Landroid/view/ScaleGestureDetector;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 26
    .line 27
    .line 28
    :cond_0
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getAction()I

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    const/4 v4, 0x0

    .line 33
    iget-object v5, v0, Lcom/canhub/cropper/CropOverlayView;->g:Lcom/canhub/cropper/e0;

    .line 34
    .line 35
    const/4 v6, 0x3

    .line 36
    const/4 v7, 0x2

    .line 37
    const/4 v8, 0x1

    .line 38
    if-eqz v2, :cond_16

    .line 39
    .line 40
    if-eq v2, v8, :cond_1

    .line 41
    .line 42
    if-eq v2, v7, :cond_2

    .line 43
    .line 44
    if-eq v2, v6, :cond_1

    .line 45
    .line 46
    goto/16 :goto_b

    .line 47
    .line 48
    :cond_1
    move v2, v8

    .line 49
    goto/16 :goto_5

    .line 50
    .line 51
    :cond_2
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getX()F

    .line 52
    .line 53
    .line 54
    move-result v2

    .line 55
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getY()F

    .line 56
    .line 57
    .line 58
    move-result v1

    .line 59
    iget-object v3, v0, Lcom/canhub/cropper/CropOverlayView;->y:Lcom/canhub/cropper/g0;

    .line 60
    .line 61
    if-eqz v3, :cond_13

    .line 62
    .line 63
    iget v3, v0, Lcom/canhub/cropper/CropOverlayView;->x:F

    .line 64
    .line 65
    invoke-virtual {v5}, Lcom/canhub/cropper/e0;->g()Landroid/graphics/RectF;

    .line 66
    .line 67
    .line 68
    move-result-object v10

    .line 69
    invoke-virtual {v0, v10}, Lcom/canhub/cropper/CropOverlayView;->a(Landroid/graphics/RectF;)Z

    .line 70
    .line 71
    .line 72
    move-result v4

    .line 73
    if-eqz v4, :cond_3

    .line 74
    .line 75
    const/4 v14, 0x0

    .line 76
    goto :goto_0

    .line 77
    :cond_3
    move v14, v3

    .line 78
    :goto_0
    iget-object v9, v0, Lcom/canhub/cropper/CropOverlayView;->y:Lcom/canhub/cropper/g0;

    .line 79
    .line 80
    invoke-static {v9}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 81
    .line 82
    .line 83
    iget v13, v0, Lcom/canhub/cropper/CropOverlayView;->r:I

    .line 84
    .line 85
    iget v3, v0, Lcom/canhub/cropper/CropOverlayView;->s:I

    .line 86
    .line 87
    iget-boolean v4, v0, Lcom/canhub/cropper/CropOverlayView;->z:Z

    .line 88
    .line 89
    iget v15, v0, Lcom/canhub/cropper/CropOverlayView;->C:F

    .line 90
    .line 91
    const-string v11, "rect"

    .line 92
    .line 93
    invoke-static {v10, v11}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    const-string v11, "bounds"

    .line 97
    .line 98
    iget-object v12, v0, Lcom/canhub/cropper/CropOverlayView;->q:Landroid/graphics/RectF;

    .line 99
    .line 100
    invoke-static {v12, v11}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    iget-object v11, v9, Lcom/canhub/cropper/g0;->f:Landroid/graphics/PointF;

    .line 104
    .line 105
    iget v8, v11, Landroid/graphics/PointF;->x:F

    .line 106
    .line 107
    add-float/2addr v2, v8

    .line 108
    iget v8, v11, Landroid/graphics/PointF;->y:F

    .line 109
    .line 110
    add-float/2addr v1, v8

    .line 111
    iget-object v8, v9, Lcom/canhub/cropper/g0;->a:Lcom/canhub/cropper/CropWindowMoveHandler$Type;

    .line 112
    .line 113
    const/16 p1, 0x0

    .line 114
    .line 115
    sget-object v6, Lcom/canhub/cropper/CropWindowMoveHandler$Type;->CENTER:Lcom/canhub/cropper/CropWindowMoveHandler$Type;

    .line 116
    .line 117
    if-ne v8, v6, :cond_b

    .line 118
    .line 119
    invoke-virtual {v10}, Landroid/graphics/RectF;->centerX()F

    .line 120
    .line 121
    .line 122
    move-result v4

    .line 123
    sub-float/2addr v2, v4

    .line 124
    invoke-virtual {v10}, Landroid/graphics/RectF;->centerY()F

    .line 125
    .line 126
    .line 127
    move-result v4

    .line 128
    sub-float/2addr v1, v4

    .line 129
    iget v4, v10, Landroid/graphics/RectF;->left:F

    .line 130
    .line 131
    add-float/2addr v4, v2

    .line 132
    cmpg-float v6, v4, p1

    .line 133
    .line 134
    const v8, 0x3f866666    # 1.05f

    .line 135
    .line 136
    .line 137
    if-ltz v6, :cond_4

    .line 138
    .line 139
    iget v6, v10, Landroid/graphics/RectF;->right:F

    .line 140
    .line 141
    add-float/2addr v6, v2

    .line 142
    int-to-float v9, v13

    .line 143
    cmpl-float v9, v6, v9

    .line 144
    .line 145
    if-gtz v9, :cond_4

    .line 146
    .line 147
    iget v9, v12, Landroid/graphics/RectF;->left:F

    .line 148
    .line 149
    cmpg-float v4, v4, v9

    .line 150
    .line 151
    if-ltz v4, :cond_4

    .line 152
    .line 153
    iget v4, v12, Landroid/graphics/RectF;->right:F

    .line 154
    .line 155
    cmpl-float v4, v6, v4

    .line 156
    .line 157
    if-lez v4, :cond_5

    .line 158
    .line 159
    :cond_4
    div-float/2addr v2, v8

    .line 160
    iget v4, v11, Landroid/graphics/PointF;->x:F

    .line 161
    .line 162
    int-to-float v6, v7

    .line 163
    div-float v6, v2, v6

    .line 164
    .line 165
    sub-float/2addr v4, v6

    .line 166
    iput v4, v11, Landroid/graphics/PointF;->x:F

    .line 167
    .line 168
    :cond_5
    iget v4, v10, Landroid/graphics/RectF;->top:F

    .line 169
    .line 170
    add-float/2addr v4, v1

    .line 171
    cmpg-float v6, v4, p1

    .line 172
    .line 173
    if-ltz v6, :cond_6

    .line 174
    .line 175
    iget v6, v10, Landroid/graphics/RectF;->bottom:F

    .line 176
    .line 177
    add-float/2addr v6, v1

    .line 178
    int-to-float v3, v3

    .line 179
    cmpl-float v3, v6, v3

    .line 180
    .line 181
    if-gtz v3, :cond_6

    .line 182
    .line 183
    iget v3, v12, Landroid/graphics/RectF;->top:F

    .line 184
    .line 185
    cmpg-float v3, v4, v3

    .line 186
    .line 187
    if-ltz v3, :cond_6

    .line 188
    .line 189
    iget v3, v12, Landroid/graphics/RectF;->bottom:F

    .line 190
    .line 191
    cmpl-float v3, v6, v3

    .line 192
    .line 193
    if-lez v3, :cond_7

    .line 194
    .line 195
    :cond_6
    div-float/2addr v1, v8

    .line 196
    iget v3, v11, Landroid/graphics/PointF;->y:F

    .line 197
    .line 198
    int-to-float v4, v7

    .line 199
    div-float v4, v1, v4

    .line 200
    .line 201
    sub-float/2addr v3, v4

    .line 202
    iput v3, v11, Landroid/graphics/PointF;->y:F

    .line 203
    .line 204
    :cond_7
    invoke-virtual {v10, v2, v1}, Landroid/graphics/RectF;->offset(FF)V

    .line 205
    .line 206
    .line 207
    iget v1, v10, Landroid/graphics/RectF;->left:F

    .line 208
    .line 209
    iget v2, v12, Landroid/graphics/RectF;->left:F

    .line 210
    .line 211
    add-float v3, v2, v14

    .line 212
    .line 213
    cmpg-float v3, v1, v3

    .line 214
    .line 215
    if-gez v3, :cond_8

    .line 216
    .line 217
    sub-float/2addr v2, v1

    .line 218
    move/from16 v1, p1

    .line 219
    .line 220
    invoke-virtual {v10, v2, v1}, Landroid/graphics/RectF;->offset(FF)V

    .line 221
    .line 222
    .line 223
    goto :goto_1

    .line 224
    :cond_8
    move/from16 v1, p1

    .line 225
    .line 226
    :goto_1
    iget v2, v10, Landroid/graphics/RectF;->top:F

    .line 227
    .line 228
    iget v3, v12, Landroid/graphics/RectF;->top:F

    .line 229
    .line 230
    add-float v4, v3, v14

    .line 231
    .line 232
    cmpg-float v4, v2, v4

    .line 233
    .line 234
    if-gez v4, :cond_9

    .line 235
    .line 236
    sub-float/2addr v3, v2

    .line 237
    invoke-virtual {v10, v1, v3}, Landroid/graphics/RectF;->offset(FF)V

    .line 238
    .line 239
    .line 240
    :cond_9
    iget v2, v10, Landroid/graphics/RectF;->right:F

    .line 241
    .line 242
    iget v3, v12, Landroid/graphics/RectF;->right:F

    .line 243
    .line 244
    sub-float v4, v3, v14

    .line 245
    .line 246
    cmpl-float v4, v2, v4

    .line 247
    .line 248
    if-lez v4, :cond_a

    .line 249
    .line 250
    sub-float/2addr v3, v2

    .line 251
    invoke-virtual {v10, v3, v1}, Landroid/graphics/RectF;->offset(FF)V

    .line 252
    .line 253
    .line 254
    :cond_a
    iget v2, v10, Landroid/graphics/RectF;->bottom:F

    .line 255
    .line 256
    iget v3, v12, Landroid/graphics/RectF;->bottom:F

    .line 257
    .line 258
    sub-float v4, v3, v14

    .line 259
    .line 260
    cmpl-float v4, v2, v4

    .line 261
    .line 262
    if-lez v4, :cond_11

    .line 263
    .line 264
    sub-float/2addr v3, v2

    .line 265
    invoke-virtual {v10, v1, v3}, Landroid/graphics/RectF;->offset(FF)V

    .line 266
    .line 267
    .line 268
    goto/16 :goto_2

    .line 269
    .line 270
    :cond_b
    if-eqz v4, :cond_10

    .line 271
    .line 272
    sget-object v4, Lcom/canhub/cropper/f0;->a:[I

    .line 273
    .line 274
    invoke-virtual {v8}, Ljava/lang/Enum;->ordinal()I

    .line 275
    .line 276
    .line 277
    move-result v6

    .line 278
    aget v4, v4, v6

    .line 279
    .line 280
    packed-switch v4, :pswitch_data_0

    .line 281
    .line 282
    .line 283
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    .line 284
    .line 285
    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 286
    .line 287
    .line 288
    throw v1

    .line 289
    :pswitch_0
    const/16 v16, 0x1

    .line 290
    .line 291
    const/16 v17, 0x1

    .line 292
    .line 293
    move v11, v1

    .line 294
    move v13, v3

    .line 295
    invoke-virtual/range {v9 .. v17}, Lcom/canhub/cropper/g0;->a(Landroid/graphics/RectF;FLandroid/graphics/RectF;IFFZZ)V

    .line 296
    .line 297
    .line 298
    move v14, v15

    .line 299
    invoke-static {v10, v12, v14}, Lcom/canhub/cropper/g0;->c(Landroid/graphics/RectF;Landroid/graphics/RectF;F)V

    .line 300
    .line 301
    .line 302
    goto/16 :goto_2

    .line 303
    .line 304
    :pswitch_1
    const/16 v16, 0x1

    .line 305
    .line 306
    const/16 v17, 0x1

    .line 307
    .line 308
    move v11, v2

    .line 309
    invoke-virtual/range {v9 .. v17}, Lcom/canhub/cropper/g0;->d(Landroid/graphics/RectF;FLandroid/graphics/RectF;IFFZZ)V

    .line 310
    .line 311
    .line 312
    move v14, v15

    .line 313
    invoke-static {v10, v12, v14}, Lcom/canhub/cropper/g0;->f(Landroid/graphics/RectF;Landroid/graphics/RectF;F)V

    .line 314
    .line 315
    .line 316
    goto/16 :goto_2

    .line 317
    .line 318
    :pswitch_2
    move v11, v1

    .line 319
    move v13, v14

    .line 320
    move v14, v15

    .line 321
    const/4 v15, 0x1

    .line 322
    const/16 v16, 0x1

    .line 323
    .line 324
    invoke-virtual/range {v9 .. v16}, Lcom/canhub/cropper/g0;->e(Landroid/graphics/RectF;FLandroid/graphics/RectF;FFZZ)V

    .line 325
    .line 326
    .line 327
    invoke-static {v10, v12, v14}, Lcom/canhub/cropper/g0;->c(Landroid/graphics/RectF;Landroid/graphics/RectF;F)V

    .line 328
    .line 329
    .line 330
    goto/16 :goto_2

    .line 331
    .line 332
    :pswitch_3
    move v11, v2

    .line 333
    move v13, v14

    .line 334
    move v14, v15

    .line 335
    const/4 v15, 0x1

    .line 336
    const/16 v16, 0x1

    .line 337
    .line 338
    invoke-virtual/range {v9 .. v16}, Lcom/canhub/cropper/g0;->b(Landroid/graphics/RectF;FLandroid/graphics/RectF;FFZZ)V

    .line 339
    .line 340
    .line 341
    invoke-static {v10, v12, v14}, Lcom/canhub/cropper/g0;->f(Landroid/graphics/RectF;Landroid/graphics/RectF;F)V

    .line 342
    .line 343
    .line 344
    goto/16 :goto_2

    .line 345
    .line 346
    :pswitch_4
    move v11, v2

    .line 347
    move v2, v3

    .line 348
    move v3, v1

    .line 349
    move v1, v13

    .line 350
    move v13, v14

    .line 351
    move v14, v15

    .line 352
    iget v4, v10, Landroid/graphics/RectF;->left:F

    .line 353
    .line 354
    iget v6, v10, Landroid/graphics/RectF;->top:F

    .line 355
    .line 356
    sub-float v4, v11, v4

    .line 357
    .line 358
    sub-float v6, v3, v6

    .line 359
    .line 360
    div-float/2addr v4, v6

    .line 361
    cmpg-float v4, v4, v14

    .line 362
    .line 363
    if-gez v4, :cond_c

    .line 364
    .line 365
    const/16 v16, 0x0

    .line 366
    .line 367
    const/16 v17, 0x1

    .line 368
    .line 369
    move v11, v3

    .line 370
    move v15, v14

    .line 371
    move v14, v13

    .line 372
    move v13, v2

    .line 373
    invoke-virtual/range {v9 .. v17}, Lcom/canhub/cropper/g0;->a(Landroid/graphics/RectF;FLandroid/graphics/RectF;IFFZZ)V

    .line 374
    .line 375
    .line 376
    move v14, v15

    .line 377
    iget v1, v10, Landroid/graphics/RectF;->left:F

    .line 378
    .line 379
    invoke-virtual {v10}, Landroid/graphics/RectF;->height()F

    .line 380
    .line 381
    .line 382
    move-result v2

    .line 383
    mul-float/2addr v2, v14

    .line 384
    add-float/2addr v2, v1

    .line 385
    iput v2, v10, Landroid/graphics/RectF;->right:F

    .line 386
    .line 387
    goto/16 :goto_2

    .line 388
    .line 389
    :cond_c
    const/16 v16, 0x0

    .line 390
    .line 391
    const/16 v17, 0x1

    .line 392
    .line 393
    move v15, v14

    .line 394
    move v14, v13

    .line 395
    move v13, v1

    .line 396
    invoke-virtual/range {v9 .. v17}, Lcom/canhub/cropper/g0;->d(Landroid/graphics/RectF;FLandroid/graphics/RectF;IFFZZ)V

    .line 397
    .line 398
    .line 399
    move v14, v15

    .line 400
    iget v1, v10, Landroid/graphics/RectF;->top:F

    .line 401
    .line 402
    invoke-virtual {v10}, Landroid/graphics/RectF;->width()F

    .line 403
    .line 404
    .line 405
    move-result v2

    .line 406
    div-float/2addr v2, v14

    .line 407
    add-float/2addr v2, v1

    .line 408
    iput v2, v10, Landroid/graphics/RectF;->bottom:F

    .line 409
    .line 410
    goto/16 :goto_2

    .line 411
    .line 412
    :pswitch_5
    move v11, v2

    .line 413
    move v2, v3

    .line 414
    move v13, v14

    .line 415
    move v14, v15

    .line 416
    move v3, v1

    .line 417
    iget v1, v10, Landroid/graphics/RectF;->top:F

    .line 418
    .line 419
    iget v4, v10, Landroid/graphics/RectF;->right:F

    .line 420
    .line 421
    sub-float/2addr v4, v11

    .line 422
    sub-float v1, v3, v1

    .line 423
    .line 424
    div-float/2addr v4, v1

    .line 425
    cmpg-float v1, v4, v14

    .line 426
    .line 427
    if-gez v1, :cond_d

    .line 428
    .line 429
    const/16 v16, 0x1

    .line 430
    .line 431
    const/16 v17, 0x0

    .line 432
    .line 433
    move v11, v3

    .line 434
    move v15, v14

    .line 435
    move v14, v13

    .line 436
    move v13, v2

    .line 437
    invoke-virtual/range {v9 .. v17}, Lcom/canhub/cropper/g0;->a(Landroid/graphics/RectF;FLandroid/graphics/RectF;IFFZZ)V

    .line 438
    .line 439
    .line 440
    move v14, v15

    .line 441
    iget v1, v10, Landroid/graphics/RectF;->right:F

    .line 442
    .line 443
    invoke-virtual {v10}, Landroid/graphics/RectF;->height()F

    .line 444
    .line 445
    .line 446
    move-result v2

    .line 447
    mul-float/2addr v2, v14

    .line 448
    sub-float/2addr v1, v2

    .line 449
    iput v1, v10, Landroid/graphics/RectF;->left:F

    .line 450
    .line 451
    goto/16 :goto_2

    .line 452
    .line 453
    :cond_d
    const/4 v15, 0x0

    .line 454
    const/16 v16, 0x1

    .line 455
    .line 456
    invoke-virtual/range {v9 .. v16}, Lcom/canhub/cropper/g0;->b(Landroid/graphics/RectF;FLandroid/graphics/RectF;FFZZ)V

    .line 457
    .line 458
    .line 459
    iget v1, v10, Landroid/graphics/RectF;->top:F

    .line 460
    .line 461
    invoke-virtual {v10}, Landroid/graphics/RectF;->width()F

    .line 462
    .line 463
    .line 464
    move-result v2

    .line 465
    div-float/2addr v2, v14

    .line 466
    add-float/2addr v2, v1

    .line 467
    iput v2, v10, Landroid/graphics/RectF;->bottom:F

    .line 468
    .line 469
    goto/16 :goto_2

    .line 470
    .line 471
    :pswitch_6
    move v3, v1

    .line 472
    move v11, v2

    .line 473
    move v1, v13

    .line 474
    move v13, v14

    .line 475
    move v14, v15

    .line 476
    iget v2, v10, Landroid/graphics/RectF;->left:F

    .line 477
    .line 478
    iget v4, v10, Landroid/graphics/RectF;->bottom:F

    .line 479
    .line 480
    sub-float v2, v11, v2

    .line 481
    .line 482
    sub-float/2addr v4, v3

    .line 483
    div-float/2addr v2, v4

    .line 484
    cmpg-float v2, v2, v14

    .line 485
    .line 486
    if-gez v2, :cond_e

    .line 487
    .line 488
    const/4 v15, 0x0

    .line 489
    const/16 v16, 0x1

    .line 490
    .line 491
    move v11, v3

    .line 492
    invoke-virtual/range {v9 .. v16}, Lcom/canhub/cropper/g0;->e(Landroid/graphics/RectF;FLandroid/graphics/RectF;FFZZ)V

    .line 493
    .line 494
    .line 495
    iget v1, v10, Landroid/graphics/RectF;->left:F

    .line 496
    .line 497
    invoke-virtual {v10}, Landroid/graphics/RectF;->height()F

    .line 498
    .line 499
    .line 500
    move-result v2

    .line 501
    mul-float/2addr v2, v14

    .line 502
    add-float/2addr v2, v1

    .line 503
    iput v2, v10, Landroid/graphics/RectF;->right:F

    .line 504
    .line 505
    goto/16 :goto_2

    .line 506
    .line 507
    :cond_e
    const/16 v16, 0x1

    .line 508
    .line 509
    const/16 v17, 0x0

    .line 510
    .line 511
    move v15, v14

    .line 512
    move v14, v13

    .line 513
    move v13, v1

    .line 514
    invoke-virtual/range {v9 .. v17}, Lcom/canhub/cropper/g0;->d(Landroid/graphics/RectF;FLandroid/graphics/RectF;IFFZZ)V

    .line 515
    .line 516
    .line 517
    move v14, v15

    .line 518
    iget v1, v10, Landroid/graphics/RectF;->bottom:F

    .line 519
    .line 520
    invoke-virtual {v10}, Landroid/graphics/RectF;->width()F

    .line 521
    .line 522
    .line 523
    move-result v2

    .line 524
    div-float/2addr v2, v14

    .line 525
    sub-float/2addr v1, v2

    .line 526
    iput v1, v10, Landroid/graphics/RectF;->top:F

    .line 527
    .line 528
    goto/16 :goto_2

    .line 529
    .line 530
    :pswitch_7
    move v3, v1

    .line 531
    move v11, v2

    .line 532
    move v13, v14

    .line 533
    move v14, v15

    .line 534
    iget v1, v10, Landroid/graphics/RectF;->right:F

    .line 535
    .line 536
    iget v2, v10, Landroid/graphics/RectF;->bottom:F

    .line 537
    .line 538
    sub-float/2addr v1, v11

    .line 539
    sub-float/2addr v2, v3

    .line 540
    div-float/2addr v1, v2

    .line 541
    cmpg-float v1, v1, v14

    .line 542
    .line 543
    if-gez v1, :cond_f

    .line 544
    .line 545
    const/4 v15, 0x1

    .line 546
    const/16 v16, 0x0

    .line 547
    .line 548
    move v11, v3

    .line 549
    invoke-virtual/range {v9 .. v16}, Lcom/canhub/cropper/g0;->e(Landroid/graphics/RectF;FLandroid/graphics/RectF;FFZZ)V

    .line 550
    .line 551
    .line 552
    iget v1, v10, Landroid/graphics/RectF;->right:F

    .line 553
    .line 554
    invoke-virtual {v10}, Landroid/graphics/RectF;->height()F

    .line 555
    .line 556
    .line 557
    move-result v2

    .line 558
    mul-float/2addr v2, v14

    .line 559
    sub-float/2addr v1, v2

    .line 560
    iput v1, v10, Landroid/graphics/RectF;->left:F

    .line 561
    .line 562
    goto/16 :goto_2

    .line 563
    .line 564
    :cond_f
    const/4 v15, 0x1

    .line 565
    const/16 v16, 0x0

    .line 566
    .line 567
    invoke-virtual/range {v9 .. v16}, Lcom/canhub/cropper/g0;->b(Landroid/graphics/RectF;FLandroid/graphics/RectF;FFZZ)V

    .line 568
    .line 569
    .line 570
    iget v1, v10, Landroid/graphics/RectF;->bottom:F

    .line 571
    .line 572
    invoke-virtual {v10}, Landroid/graphics/RectF;->width()F

    .line 573
    .line 574
    .line 575
    move-result v2

    .line 576
    div-float/2addr v2, v14

    .line 577
    sub-float/2addr v1, v2

    .line 578
    iput v1, v10, Landroid/graphics/RectF;->top:F

    .line 579
    .line 580
    goto/16 :goto_2

    .line 581
    .line 582
    :cond_10
    move v11, v2

    .line 583
    move v2, v3

    .line 584
    move v3, v1

    .line 585
    move v1, v13

    .line 586
    move v13, v14

    .line 587
    sget-object v4, Lcom/canhub/cropper/f0;->a:[I

    .line 588
    .line 589
    invoke-virtual {v8}, Ljava/lang/Enum;->ordinal()I

    .line 590
    .line 591
    .line 592
    move-result v6

    .line 593
    aget v4, v4, v6

    .line 594
    .line 595
    packed-switch v4, :pswitch_data_1

    .line 596
    .line 597
    .line 598
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    .line 599
    .line 600
    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 601
    .line 602
    .line 603
    throw v1

    .line 604
    :pswitch_8
    const/16 v16, 0x0

    .line 605
    .line 606
    const/16 v17, 0x0

    .line 607
    .line 608
    const/4 v15, 0x0

    .line 609
    move v11, v3

    .line 610
    move v14, v13

    .line 611
    move v13, v2

    .line 612
    invoke-virtual/range {v9 .. v17}, Lcom/canhub/cropper/g0;->a(Landroid/graphics/RectF;FLandroid/graphics/RectF;IFFZZ)V

    .line 613
    .line 614
    .line 615
    goto/16 :goto_2

    .line 616
    .line 617
    :pswitch_9
    const/16 v16, 0x0

    .line 618
    .line 619
    const/16 v17, 0x0

    .line 620
    .line 621
    const/4 v15, 0x0

    .line 622
    move v14, v13

    .line 623
    move v13, v1

    .line 624
    invoke-virtual/range {v9 .. v17}, Lcom/canhub/cropper/g0;->d(Landroid/graphics/RectF;FLandroid/graphics/RectF;IFFZZ)V

    .line 625
    .line 626
    .line 627
    goto/16 :goto_2

    .line 628
    .line 629
    :pswitch_a
    move v11, v3

    .line 630
    const/4 v15, 0x0

    .line 631
    const/16 v16, 0x0

    .line 632
    .line 633
    const/4 v14, 0x0

    .line 634
    invoke-virtual/range {v9 .. v16}, Lcom/canhub/cropper/g0;->e(Landroid/graphics/RectF;FLandroid/graphics/RectF;FFZZ)V

    .line 635
    .line 636
    .line 637
    goto/16 :goto_2

    .line 638
    .line 639
    :pswitch_b
    const/4 v15, 0x0

    .line 640
    const/16 v16, 0x0

    .line 641
    .line 642
    const/4 v14, 0x0

    .line 643
    invoke-virtual/range {v9 .. v16}, Lcom/canhub/cropper/g0;->b(Landroid/graphics/RectF;FLandroid/graphics/RectF;FFZZ)V

    .line 644
    .line 645
    .line 646
    goto/16 :goto_2

    .line 647
    .line 648
    :pswitch_c
    move/from16 v19, v11

    .line 649
    .line 650
    move v11, v3

    .line 651
    move/from16 v3, v19

    .line 652
    .line 653
    const/16 v16, 0x0

    .line 654
    .line 655
    const/16 v17, 0x0

    .line 656
    .line 657
    const/4 v15, 0x0

    .line 658
    move v14, v13

    .line 659
    move v13, v2

    .line 660
    invoke-virtual/range {v9 .. v17}, Lcom/canhub/cropper/g0;->a(Landroid/graphics/RectF;FLandroid/graphics/RectF;IFFZZ)V

    .line 661
    .line 662
    .line 663
    move v13, v14

    .line 664
    move v11, v3

    .line 665
    move v13, v1

    .line 666
    invoke-virtual/range {v9 .. v17}, Lcom/canhub/cropper/g0;->d(Landroid/graphics/RectF;FLandroid/graphics/RectF;IFFZZ)V

    .line 667
    .line 668
    .line 669
    goto :goto_2

    .line 670
    :pswitch_d
    move/from16 v19, v11

    .line 671
    .line 672
    move v11, v3

    .line 673
    move/from16 v3, v19

    .line 674
    .line 675
    const/16 v16, 0x0

    .line 676
    .line 677
    const/16 v17, 0x0

    .line 678
    .line 679
    const/4 v15, 0x0

    .line 680
    move v14, v13

    .line 681
    move v13, v2

    .line 682
    invoke-virtual/range {v9 .. v17}, Lcom/canhub/cropper/g0;->a(Landroid/graphics/RectF;FLandroid/graphics/RectF;IFFZZ)V

    .line 683
    .line 684
    .line 685
    move v13, v14

    .line 686
    const/4 v15, 0x0

    .line 687
    const/4 v14, 0x0

    .line 688
    move v11, v3

    .line 689
    invoke-virtual/range {v9 .. v16}, Lcom/canhub/cropper/g0;->b(Landroid/graphics/RectF;FLandroid/graphics/RectF;FFZZ)V

    .line 690
    .line 691
    .line 692
    goto :goto_2

    .line 693
    :pswitch_e
    move/from16 v19, v11

    .line 694
    .line 695
    move v11, v3

    .line 696
    move/from16 v3, v19

    .line 697
    .line 698
    const/4 v15, 0x0

    .line 699
    const/16 v16, 0x0

    .line 700
    .line 701
    const/4 v14, 0x0

    .line 702
    invoke-virtual/range {v9 .. v16}, Lcom/canhub/cropper/g0;->e(Landroid/graphics/RectF;FLandroid/graphics/RectF;FFZZ)V

    .line 703
    .line 704
    .line 705
    const/16 v17, 0x0

    .line 706
    .line 707
    const/4 v15, 0x0

    .line 708
    move v11, v3

    .line 709
    move v14, v13

    .line 710
    move v13, v1

    .line 711
    invoke-virtual/range {v9 .. v17}, Lcom/canhub/cropper/g0;->d(Landroid/graphics/RectF;FLandroid/graphics/RectF;IFFZZ)V

    .line 712
    .line 713
    .line 714
    goto :goto_2

    .line 715
    :pswitch_f
    move/from16 v19, v11

    .line 716
    .line 717
    move v11, v3

    .line 718
    move/from16 v3, v19

    .line 719
    .line 720
    const/4 v15, 0x0

    .line 721
    const/16 v16, 0x0

    .line 722
    .line 723
    const/4 v14, 0x0

    .line 724
    invoke-virtual/range {v9 .. v16}, Lcom/canhub/cropper/g0;->e(Landroid/graphics/RectF;FLandroid/graphics/RectF;FFZZ)V

    .line 725
    .line 726
    .line 727
    move v11, v3

    .line 728
    invoke-virtual/range {v9 .. v16}, Lcom/canhub/cropper/g0;->b(Landroid/graphics/RectF;FLandroid/graphics/RectF;FFZZ)V

    .line 729
    .line 730
    .line 731
    :cond_11
    :goto_2
    :pswitch_10
    iget-object v1, v5, Lcom/canhub/cropper/e0;->a:Landroid/graphics/RectF;

    .line 732
    .line 733
    invoke-virtual {v1, v10}, Landroid/graphics/RectF;->set(Landroid/graphics/RectF;)V

    .line 734
    .line 735
    .line 736
    iget-object v1, v0, Lcom/canhub/cropper/CropOverlayView;->h:Lcom/canhub/cropper/a0;

    .line 737
    .line 738
    if-eqz v1, :cond_12

    .line 739
    .line 740
    check-cast v1, Lcom/canhub/cropper/CropImageView;

    .line 741
    .line 742
    const/4 v2, 0x1

    .line 743
    invoke-virtual {v1, v2, v2}, Lcom/canhub/cropper/CropImageView;->d(ZZ)V

    .line 744
    .line 745
    .line 746
    goto :goto_3

    .line 747
    :cond_12
    const/4 v2, 0x1

    .line 748
    :goto_3
    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    .line 749
    .line 750
    .line 751
    goto :goto_4

    .line 752
    :cond_13
    move v2, v8

    .line 753
    :goto_4
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 754
    .line 755
    .line 756
    move-result-object v1

    .line 757
    invoke-interface {v1, v2}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    .line 758
    .line 759
    .line 760
    return v2

    .line 761
    :goto_5
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 762
    .line 763
    .line 764
    move-result-object v1

    .line 765
    invoke-interface {v1, v3}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    .line 766
    .line 767
    .line 768
    iget-object v1, v0, Lcom/canhub/cropper/CropOverlayView;->y:Lcom/canhub/cropper/g0;

    .line 769
    .line 770
    if-eqz v1, :cond_15

    .line 771
    .line 772
    iput-object v4, v0, Lcom/canhub/cropper/CropOverlayView;->y:Lcom/canhub/cropper/g0;

    .line 773
    .line 774
    iget-object v1, v0, Lcom/canhub/cropper/CropOverlayView;->h:Lcom/canhub/cropper/a0;

    .line 775
    .line 776
    if-eqz v1, :cond_14

    .line 777
    .line 778
    check-cast v1, Lcom/canhub/cropper/CropImageView;

    .line 779
    .line 780
    invoke-virtual {v1, v3, v2}, Lcom/canhub/cropper/CropImageView;->d(ZZ)V

    .line 781
    .line 782
    .line 783
    :cond_14
    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    .line 784
    .line 785
    .line 786
    return v2

    .line 787
    :cond_15
    move/from16 v18, v2

    .line 788
    .line 789
    goto/16 :goto_a

    .line 790
    .line 791
    :cond_16
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getX()F

    .line 792
    .line 793
    .line 794
    move-result v2

    .line 795
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getY()F

    .line 796
    .line 797
    .line 798
    move-result v1

    .line 799
    iget v12, v0, Lcom/canhub/cropper/CropOverlayView;->w:F

    .line 800
    .line 801
    iget-object v8, v0, Lcom/canhub/cropper/CropOverlayView;->E:Lcom/canhub/cropper/CropImageView$CropShape;

    .line 802
    .line 803
    invoke-static {v8}, Lkotlin/jvm/internal/k;->d(Ljava/lang/Object;)V

    .line 804
    .line 805
    .line 806
    iget-boolean v13, v0, Lcom/canhub/cropper/CropOverlayView;->f:Z

    .line 807
    .line 808
    iget-object v14, v5, Lcom/canhub/cropper/e0;->a:Landroid/graphics/RectF;

    .line 809
    .line 810
    iget-object v15, v5, Lcom/canhub/cropper/e0;->a:Landroid/graphics/RectF;

    .line 811
    .line 812
    sget-object v9, Lcom/canhub/cropper/d0;->a:[I

    .line 813
    .line 814
    invoke-virtual {v8}, Ljava/lang/Enum;->ordinal()I

    .line 815
    .line 816
    .line 817
    move-result v8

    .line 818
    aget v8, v9, v8

    .line 819
    .line 820
    const/4 v9, 0x1

    .line 821
    if-eq v8, v9, :cond_21

    .line 822
    .line 823
    if-eq v8, v7, :cond_20

    .line 824
    .line 825
    if-eq v8, v6, :cond_1c

    .line 826
    .line 827
    const/4 v3, 0x4

    .line 828
    if-ne v8, v3, :cond_1b

    .line 829
    .line 830
    iget v3, v14, Landroid/graphics/RectF;->left:F

    .line 831
    .line 832
    invoke-virtual {v14}, Landroid/graphics/RectF;->centerY()F

    .line 833
    .line 834
    .line 835
    move-result v6

    .line 836
    invoke-static {v2, v1, v3, v6}, Lcom/canhub/cropper/e0;->a(FFFF)F

    .line 837
    .line 838
    .line 839
    move-result v3

    .line 840
    cmpg-float v3, v3, v12

    .line 841
    .line 842
    if-gtz v3, :cond_17

    .line 843
    .line 844
    sget-object v3, Lcom/canhub/cropper/CropWindowMoveHandler$Type;->LEFT:Lcom/canhub/cropper/CropWindowMoveHandler$Type;

    .line 845
    .line 846
    :goto_6
    move v7, v1

    .line 847
    move v6, v2

    .line 848
    goto/16 :goto_9

    .line 849
    .line 850
    :cond_17
    iget v3, v14, Landroid/graphics/RectF;->right:F

    .line 851
    .line 852
    invoke-virtual {v14}, Landroid/graphics/RectF;->centerY()F

    .line 853
    .line 854
    .line 855
    move-result v6

    .line 856
    invoke-static {v2, v1, v3, v6}, Lcom/canhub/cropper/e0;->a(FFFF)F

    .line 857
    .line 858
    .line 859
    move-result v3

    .line 860
    cmpg-float v3, v3, v12

    .line 861
    .line 862
    if-gtz v3, :cond_18

    .line 863
    .line 864
    sget-object v3, Lcom/canhub/cropper/CropWindowMoveHandler$Type;->RIGHT:Lcom/canhub/cropper/CropWindowMoveHandler$Type;

    .line 865
    .line 866
    goto :goto_6

    .line 867
    :cond_18
    if-eqz v13, :cond_19

    .line 868
    .line 869
    iget v8, v14, Landroid/graphics/RectF;->left:F

    .line 870
    .line 871
    iget v9, v14, Landroid/graphics/RectF;->top:F

    .line 872
    .line 873
    iget v10, v14, Landroid/graphics/RectF;->right:F

    .line 874
    .line 875
    iget v11, v14, Landroid/graphics/RectF;->bottom:F

    .line 876
    .line 877
    move v7, v1

    .line 878
    move v6, v2

    .line 879
    invoke-static/range {v6 .. v11}, Lcom/canhub/cropper/e0;->h(FFFFFF)Z

    .line 880
    .line 881
    .line 882
    move-result v1

    .line 883
    if-eqz v1, :cond_1a

    .line 884
    .line 885
    sget-object v3, Lcom/canhub/cropper/CropWindowMoveHandler$Type;->CENTER:Lcom/canhub/cropper/CropWindowMoveHandler$Type;

    .line 886
    .line 887
    goto/16 :goto_9

    .line 888
    .line 889
    :cond_19
    move v7, v1

    .line 890
    move v6, v2

    .line 891
    :cond_1a
    invoke-virtual {v5, v6, v7, v13}, Lcom/canhub/cropper/e0;->f(FFZ)Lcom/canhub/cropper/CropWindowMoveHandler$Type;

    .line 892
    .line 893
    .line 894
    move-result-object v3

    .line 895
    goto/16 :goto_9

    .line 896
    .line 897
    :cond_1b
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    .line 898
    .line 899
    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 900
    .line 901
    .line 902
    throw v1

    .line 903
    :cond_1c
    move v7, v1

    .line 904
    move v6, v2

    .line 905
    invoke-virtual {v14}, Landroid/graphics/RectF;->centerX()F

    .line 906
    .line 907
    .line 908
    move-result v1

    .line 909
    iget v2, v14, Landroid/graphics/RectF;->top:F

    .line 910
    .line 911
    invoke-static {v6, v7, v1, v2}, Lcom/canhub/cropper/e0;->a(FFFF)F

    .line 912
    .line 913
    .line 914
    move-result v1

    .line 915
    cmpg-float v1, v1, v12

    .line 916
    .line 917
    if-gtz v1, :cond_1d

    .line 918
    .line 919
    sget-object v1, Lcom/canhub/cropper/CropWindowMoveHandler$Type;->TOP:Lcom/canhub/cropper/CropWindowMoveHandler$Type;

    .line 920
    .line 921
    :goto_7
    move-object v3, v1

    .line 922
    goto/16 :goto_9

    .line 923
    .line 924
    :cond_1d
    invoke-virtual {v14}, Landroid/graphics/RectF;->centerX()F

    .line 925
    .line 926
    .line 927
    move-result v1

    .line 928
    iget v2, v14, Landroid/graphics/RectF;->bottom:F

    .line 929
    .line 930
    invoke-static {v6, v7, v1, v2}, Lcom/canhub/cropper/e0;->a(FFFF)F

    .line 931
    .line 932
    .line 933
    move-result v1

    .line 934
    cmpg-float v1, v1, v12

    .line 935
    .line 936
    if-gtz v1, :cond_1e

    .line 937
    .line 938
    sget-object v1, Lcom/canhub/cropper/CropWindowMoveHandler$Type;->BOTTOM:Lcom/canhub/cropper/CropWindowMoveHandler$Type;

    .line 939
    .line 940
    goto :goto_7

    .line 941
    :cond_1e
    if-eqz v13, :cond_1f

    .line 942
    .line 943
    iget v8, v14, Landroid/graphics/RectF;->left:F

    .line 944
    .line 945
    iget v9, v14, Landroid/graphics/RectF;->top:F

    .line 946
    .line 947
    iget v10, v14, Landroid/graphics/RectF;->right:F

    .line 948
    .line 949
    iget v11, v14, Landroid/graphics/RectF;->bottom:F

    .line 950
    .line 951
    invoke-static/range {v6 .. v11}, Lcom/canhub/cropper/e0;->h(FFFFFF)Z

    .line 952
    .line 953
    .line 954
    move-result v1

    .line 955
    if-eqz v1, :cond_1f

    .line 956
    .line 957
    sget-object v1, Lcom/canhub/cropper/CropWindowMoveHandler$Type;->CENTER:Lcom/canhub/cropper/CropWindowMoveHandler$Type;

    .line 958
    .line 959
    goto :goto_7

    .line 960
    :cond_1f
    invoke-virtual {v5, v6, v7, v13}, Lcom/canhub/cropper/e0;->f(FFZ)Lcom/canhub/cropper/CropWindowMoveHandler$Type;

    .line 961
    .line 962
    .line 963
    move-result-object v1

    .line 964
    goto :goto_7

    .line 965
    :cond_20
    move v7, v1

    .line 966
    move v6, v2

    .line 967
    invoke-virtual {v5, v6, v7, v13}, Lcom/canhub/cropper/e0;->f(FFZ)Lcom/canhub/cropper/CropWindowMoveHandler$Type;

    .line 968
    .line 969
    .line 970
    move-result-object v3

    .line 971
    goto/16 :goto_9

    .line 972
    .line 973
    :cond_21
    move v7, v1

    .line 974
    move v6, v2

    .line 975
    iget v1, v14, Landroid/graphics/RectF;->left:F

    .line 976
    .line 977
    iget v2, v14, Landroid/graphics/RectF;->top:F

    .line 978
    .line 979
    invoke-static {v6, v7, v1, v2}, Lcom/canhub/cropper/e0;->a(FFFF)F

    .line 980
    .line 981
    .line 982
    move-result v1

    .line 983
    cmpg-float v1, v1, v12

    .line 984
    .line 985
    if-gtz v1, :cond_22

    .line 986
    .line 987
    sget-object v1, Lcom/canhub/cropper/CropWindowMoveHandler$Type;->TOP_LEFT:Lcom/canhub/cropper/CropWindowMoveHandler$Type;

    .line 988
    .line 989
    goto :goto_7

    .line 990
    :cond_22
    iget v1, v14, Landroid/graphics/RectF;->right:F

    .line 991
    .line 992
    iget v2, v14, Landroid/graphics/RectF;->top:F

    .line 993
    .line 994
    invoke-static {v6, v7, v1, v2}, Lcom/canhub/cropper/e0;->a(FFFF)F

    .line 995
    .line 996
    .line 997
    move-result v1

    .line 998
    cmpg-float v1, v1, v12

    .line 999
    .line 1000
    if-gtz v1, :cond_23

    .line 1001
    .line 1002
    sget-object v1, Lcom/canhub/cropper/CropWindowMoveHandler$Type;->TOP_RIGHT:Lcom/canhub/cropper/CropWindowMoveHandler$Type;

    .line 1003
    .line 1004
    goto :goto_7

    .line 1005
    :cond_23
    iget v1, v14, Landroid/graphics/RectF;->left:F

    .line 1006
    .line 1007
    iget v2, v14, Landroid/graphics/RectF;->bottom:F

    .line 1008
    .line 1009
    invoke-static {v6, v7, v1, v2}, Lcom/canhub/cropper/e0;->a(FFFF)F

    .line 1010
    .line 1011
    .line 1012
    move-result v1

    .line 1013
    cmpg-float v1, v1, v12

    .line 1014
    .line 1015
    if-gtz v1, :cond_24

    .line 1016
    .line 1017
    sget-object v1, Lcom/canhub/cropper/CropWindowMoveHandler$Type;->BOTTOM_LEFT:Lcom/canhub/cropper/CropWindowMoveHandler$Type;

    .line 1018
    .line 1019
    goto :goto_7

    .line 1020
    :cond_24
    iget v1, v14, Landroid/graphics/RectF;->right:F

    .line 1021
    .line 1022
    iget v2, v14, Landroid/graphics/RectF;->bottom:F

    .line 1023
    .line 1024
    invoke-static {v6, v7, v1, v2}, Lcom/canhub/cropper/e0;->a(FFFF)F

    .line 1025
    .line 1026
    .line 1027
    move-result v1

    .line 1028
    cmpg-float v1, v1, v12

    .line 1029
    .line 1030
    if-gtz v1, :cond_25

    .line 1031
    .line 1032
    sget-object v1, Lcom/canhub/cropper/CropWindowMoveHandler$Type;->BOTTOM_RIGHT:Lcom/canhub/cropper/CropWindowMoveHandler$Type;

    .line 1033
    .line 1034
    goto :goto_7

    .line 1035
    :cond_25
    const/high16 v1, 0x42c80000    # 100.0f

    .line 1036
    .line 1037
    if-eqz v13, :cond_27

    .line 1038
    .line 1039
    iget v8, v14, Landroid/graphics/RectF;->left:F

    .line 1040
    .line 1041
    iget v9, v14, Landroid/graphics/RectF;->top:F

    .line 1042
    .line 1043
    iget v10, v14, Landroid/graphics/RectF;->right:F

    .line 1044
    .line 1045
    iget v11, v14, Landroid/graphics/RectF;->bottom:F

    .line 1046
    .line 1047
    invoke-static/range {v6 .. v11}, Lcom/canhub/cropper/e0;->h(FFFFFF)Z

    .line 1048
    .line 1049
    .line 1050
    move-result v2

    .line 1051
    if-eqz v2, :cond_27

    .line 1052
    .line 1053
    invoke-virtual {v15}, Landroid/graphics/RectF;->width()F

    .line 1054
    .line 1055
    .line 1056
    move-result v2

    .line 1057
    cmpg-float v2, v2, v1

    .line 1058
    .line 1059
    if-ltz v2, :cond_26

    .line 1060
    .line 1061
    invoke-virtual {v15}, Landroid/graphics/RectF;->height()F

    .line 1062
    .line 1063
    .line 1064
    move-result v2

    .line 1065
    cmpg-float v2, v2, v1

    .line 1066
    .line 1067
    if-ltz v2, :cond_26

    .line 1068
    .line 1069
    const/4 v2, 0x1

    .line 1070
    goto :goto_8

    .line 1071
    :cond_26
    move v2, v3

    .line 1072
    :goto_8
    if-nez v2, :cond_27

    .line 1073
    .line 1074
    sget-object v1, Lcom/canhub/cropper/CropWindowMoveHandler$Type;->CENTER:Lcom/canhub/cropper/CropWindowMoveHandler$Type;

    .line 1075
    .line 1076
    goto/16 :goto_7

    .line 1077
    .line 1078
    :cond_27
    iget v2, v14, Landroid/graphics/RectF;->left:F

    .line 1079
    .line 1080
    iget v8, v14, Landroid/graphics/RectF;->right:F

    .line 1081
    .line 1082
    iget v9, v14, Landroid/graphics/RectF;->top:F

    .line 1083
    .line 1084
    cmpl-float v2, v6, v2

    .line 1085
    .line 1086
    if-lez v2, :cond_28

    .line 1087
    .line 1088
    cmpg-float v2, v6, v8

    .line 1089
    .line 1090
    if-gez v2, :cond_28

    .line 1091
    .line 1092
    sub-float v2, v7, v9

    .line 1093
    .line 1094
    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    .line 1095
    .line 1096
    .line 1097
    move-result v2

    .line 1098
    cmpg-float v2, v2, v12

    .line 1099
    .line 1100
    if-gtz v2, :cond_28

    .line 1101
    .line 1102
    sget-object v1, Lcom/canhub/cropper/CropWindowMoveHandler$Type;->TOP:Lcom/canhub/cropper/CropWindowMoveHandler$Type;

    .line 1103
    .line 1104
    goto/16 :goto_7

    .line 1105
    .line 1106
    :cond_28
    iget v2, v14, Landroid/graphics/RectF;->left:F

    .line 1107
    .line 1108
    iget v8, v14, Landroid/graphics/RectF;->right:F

    .line 1109
    .line 1110
    iget v9, v14, Landroid/graphics/RectF;->bottom:F

    .line 1111
    .line 1112
    cmpl-float v2, v6, v2

    .line 1113
    .line 1114
    if-lez v2, :cond_29

    .line 1115
    .line 1116
    cmpg-float v2, v6, v8

    .line 1117
    .line 1118
    if-gez v2, :cond_29

    .line 1119
    .line 1120
    sub-float v2, v7, v9

    .line 1121
    .line 1122
    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    .line 1123
    .line 1124
    .line 1125
    move-result v2

    .line 1126
    cmpg-float v2, v2, v12

    .line 1127
    .line 1128
    if-gtz v2, :cond_29

    .line 1129
    .line 1130
    sget-object v1, Lcom/canhub/cropper/CropWindowMoveHandler$Type;->BOTTOM:Lcom/canhub/cropper/CropWindowMoveHandler$Type;

    .line 1131
    .line 1132
    goto/16 :goto_7

    .line 1133
    .line 1134
    :cond_29
    iget v2, v14, Landroid/graphics/RectF;->left:F

    .line 1135
    .line 1136
    iget v8, v14, Landroid/graphics/RectF;->top:F

    .line 1137
    .line 1138
    iget v9, v14, Landroid/graphics/RectF;->bottom:F

    .line 1139
    .line 1140
    sub-float v2, v6, v2

    .line 1141
    .line 1142
    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    .line 1143
    .line 1144
    .line 1145
    move-result v2

    .line 1146
    cmpg-float v2, v2, v12

    .line 1147
    .line 1148
    if-gtz v2, :cond_2a

    .line 1149
    .line 1150
    cmpl-float v2, v7, v8

    .line 1151
    .line 1152
    if-lez v2, :cond_2a

    .line 1153
    .line 1154
    cmpg-float v2, v7, v9

    .line 1155
    .line 1156
    if-gez v2, :cond_2a

    .line 1157
    .line 1158
    sget-object v1, Lcom/canhub/cropper/CropWindowMoveHandler$Type;->LEFT:Lcom/canhub/cropper/CropWindowMoveHandler$Type;

    .line 1159
    .line 1160
    goto/16 :goto_7

    .line 1161
    .line 1162
    :cond_2a
    iget v2, v14, Landroid/graphics/RectF;->right:F

    .line 1163
    .line 1164
    iget v8, v14, Landroid/graphics/RectF;->top:F

    .line 1165
    .line 1166
    iget v9, v14, Landroid/graphics/RectF;->bottom:F

    .line 1167
    .line 1168
    sub-float v2, v6, v2

    .line 1169
    .line 1170
    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    .line 1171
    .line 1172
    .line 1173
    move-result v2

    .line 1174
    cmpg-float v2, v2, v12

    .line 1175
    .line 1176
    if-gtz v2, :cond_2b

    .line 1177
    .line 1178
    cmpl-float v2, v7, v8

    .line 1179
    .line 1180
    if-lez v2, :cond_2b

    .line 1181
    .line 1182
    cmpg-float v2, v7, v9

    .line 1183
    .line 1184
    if-gez v2, :cond_2b

    .line 1185
    .line 1186
    sget-object v1, Lcom/canhub/cropper/CropWindowMoveHandler$Type;->RIGHT:Lcom/canhub/cropper/CropWindowMoveHandler$Type;

    .line 1187
    .line 1188
    goto/16 :goto_7

    .line 1189
    .line 1190
    :cond_2b
    if-eqz v13, :cond_2d

    .line 1191
    .line 1192
    iget v8, v14, Landroid/graphics/RectF;->left:F

    .line 1193
    .line 1194
    iget v9, v14, Landroid/graphics/RectF;->top:F

    .line 1195
    .line 1196
    iget v10, v14, Landroid/graphics/RectF;->right:F

    .line 1197
    .line 1198
    iget v11, v14, Landroid/graphics/RectF;->bottom:F

    .line 1199
    .line 1200
    invoke-static/range {v6 .. v11}, Lcom/canhub/cropper/e0;->h(FFFFFF)Z

    .line 1201
    .line 1202
    .line 1203
    move-result v2

    .line 1204
    if-eqz v2, :cond_2d

    .line 1205
    .line 1206
    invoke-virtual {v15}, Landroid/graphics/RectF;->width()F

    .line 1207
    .line 1208
    .line 1209
    move-result v2

    .line 1210
    cmpg-float v2, v2, v1

    .line 1211
    .line 1212
    if-ltz v2, :cond_2c

    .line 1213
    .line 1214
    invoke-virtual {v15}, Landroid/graphics/RectF;->height()F

    .line 1215
    .line 1216
    .line 1217
    move-result v2

    .line 1218
    cmpg-float v1, v2, v1

    .line 1219
    .line 1220
    if-ltz v1, :cond_2c

    .line 1221
    .line 1222
    const/4 v3, 0x1

    .line 1223
    :cond_2c
    if-eqz v3, :cond_2d

    .line 1224
    .line 1225
    sget-object v1, Lcom/canhub/cropper/CropWindowMoveHandler$Type;->CENTER:Lcom/canhub/cropper/CropWindowMoveHandler$Type;

    .line 1226
    .line 1227
    goto/16 :goto_7

    .line 1228
    .line 1229
    :cond_2d
    invoke-virtual {v5, v6, v7, v13}, Lcom/canhub/cropper/e0;->f(FFZ)Lcom/canhub/cropper/CropWindowMoveHandler$Type;

    .line 1230
    .line 1231
    .line 1232
    move-result-object v1

    .line 1233
    goto/16 :goto_7

    .line 1234
    .line 1235
    :goto_9
    if-eqz v3, :cond_2e

    .line 1236
    .line 1237
    new-instance v4, Lcom/canhub/cropper/g0;

    .line 1238
    .line 1239
    invoke-direct {v4, v3, v5, v6, v7}, Lcom/canhub/cropper/g0;-><init>(Lcom/canhub/cropper/CropWindowMoveHandler$Type;Lcom/canhub/cropper/e0;FF)V

    .line 1240
    .line 1241
    .line 1242
    :cond_2e
    iput-object v4, v0, Lcom/canhub/cropper/CropOverlayView;->y:Lcom/canhub/cropper/g0;

    .line 1243
    .line 1244
    if-eqz v4, :cond_2f

    .line 1245
    .line 1246
    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    .line 1247
    .line 1248
    .line 1249
    const/16 v18, 0x1

    .line 1250
    .line 1251
    return v18

    .line 1252
    :cond_2f
    const/16 v18, 0x1

    .line 1253
    .line 1254
    :goto_a
    return v18

    .line 1255
    :cond_30
    :goto_b
    return v3

    .line 1256
    nop

    .line 1257
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_10
    .end packed-switch

    .line 1258
    .line 1259
    .line 1260
    .line 1261
    .line 1262
    .line 1263
    .line 1264
    .line 1265
    .line 1266
    .line 1267
    .line 1268
    .line 1269
    .line 1270
    .line 1271
    .line 1272
    .line 1273
    .line 1274
    .line 1275
    .line 1276
    .line 1277
    .line 1278
    .line 1279
    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_10
    .end packed-switch
.end method

.method public final setAspectRatioX(I)V
    .locals 1

    .line 1
    if-lez p1, :cond_1

    .line 2
    .line 3
    iget v0, p0, Lcom/canhub/cropper/CropOverlayView;->A:I

    .line 4
    .line 5
    if-eq v0, p1, :cond_0

    .line 6
    .line 7
    iput p1, p0, Lcom/canhub/cropper/CropOverlayView;->A:I

    .line 8
    .line 9
    int-to-float p1, p1

    .line 10
    iget v0, p0, Lcom/canhub/cropper/CropOverlayView;->B:I

    .line 11
    .line 12
    int-to-float v0, v0

    .line 13
    div-float/2addr p1, v0

    .line 14
    iput p1, p0, Lcom/canhub/cropper/CropOverlayView;->C:F

    .line 15
    .line 16
    iget-boolean p1, p0, Lcom/canhub/cropper/CropOverlayView;->L:Z

    .line 17
    .line 18
    if-eqz p1, :cond_0

    .line 19
    .line 20
    invoke-virtual {p0}, Lcom/canhub/cropper/CropOverlayView;->f()V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 24
    .line 25
    .line 26
    :cond_0
    return-void

    .line 27
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 28
    .line 29
    const-string v0, "Cannot set aspect ratio value to a number less than or equal to 0."

    .line 30
    .line 31
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    throw p1
.end method

.method public final setAspectRatioY(I)V
    .locals 1

    .line 1
    if-lez p1, :cond_1

    .line 2
    .line 3
    iget v0, p0, Lcom/canhub/cropper/CropOverlayView;->B:I

    .line 4
    .line 5
    if-eq v0, p1, :cond_0

    .line 6
    .line 7
    iput p1, p0, Lcom/canhub/cropper/CropOverlayView;->B:I

    .line 8
    .line 9
    iget v0, p0, Lcom/canhub/cropper/CropOverlayView;->A:I

    .line 10
    .line 11
    int-to-float v0, v0

    .line 12
    int-to-float p1, p1

    .line 13
    div-float/2addr v0, p1

    .line 14
    iput v0, p0, Lcom/canhub/cropper/CropOverlayView;->C:F

    .line 15
    .line 16
    iget-boolean p1, p0, Lcom/canhub/cropper/CropOverlayView;->L:Z

    .line 17
    .line 18
    if-eqz p1, :cond_0

    .line 19
    .line 20
    invoke-virtual {p0}, Lcom/canhub/cropper/CropOverlayView;->f()V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 24
    .line 25
    .line 26
    :cond_0
    return-void

    .line 27
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 28
    .line 29
    const-string v0, "Cannot set aspect ratio value to a number less than or equal to 0."

    .line 30
    .line 31
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    throw p1
.end method

.method public final setCropCornerRadius(F)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/canhub/cropper/CropOverlayView;->a:F

    .line 2
    .line 3
    return-void
.end method

.method public final setCropCornerShape(Lcom/canhub/cropper/CropImageView$CropCornerShape;)V
    .locals 1
    .param p1    # Lcom/canhub/cropper/CropImageView$CropCornerShape;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "cropCornerShape"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/canhub/cropper/CropOverlayView;->F:Lcom/canhub/cropper/CropImageView$CropCornerShape;

    .line 7
    .line 8
    if-eq v0, p1, :cond_0

    .line 9
    .line 10
    iput-object p1, p0, Lcom/canhub/cropper/CropOverlayView;->F:Lcom/canhub/cropper/CropImageView$CropCornerShape;

    .line 11
    .line 12
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 13
    .line 14
    .line 15
    :cond_0
    return-void
.end method

.method public final setCropLabelText(Ljava/lang/String;)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iput-object p1, p0, Lcom/canhub/cropper/CropOverlayView;->H:Ljava/lang/String;

    .line 4
    .line 5
    :cond_0
    return-void
.end method

.method public final setCropLabelTextColor(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/canhub/cropper/CropOverlayView;->J:I

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final setCropLabelTextSize(F)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/canhub/cropper/CropOverlayView;->I:F

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final setCropShape(Lcom/canhub/cropper/CropImageView$CropShape;)V
    .locals 1
    .param p1    # Lcom/canhub/cropper/CropImageView$CropShape;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "cropShape"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/canhub/cropper/CropOverlayView;->E:Lcom/canhub/cropper/CropImageView$CropShape;

    .line 7
    .line 8
    if-eq v0, p1, :cond_0

    .line 9
    .line 10
    iput-object p1, p0, Lcom/canhub/cropper/CropOverlayView;->E:Lcom/canhub/cropper/CropImageView$CropShape;

    .line 11
    .line 12
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 13
    .line 14
    .line 15
    :cond_0
    return-void
.end method

.method public final setCropWindowChangeListener(Lcom/canhub/cropper/a0;)V
    .locals 0
    .param p1    # Lcom/canhub/cropper/a0;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    iput-object p1, p0, Lcom/canhub/cropper/CropOverlayView;->h:Lcom/canhub/cropper/a0;

    .line 2
    .line 3
    return-void
.end method

.method public final setCropWindowRect(Landroid/graphics/RectF;)V
    .locals 1
    .param p1    # Landroid/graphics/RectF;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "rect"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/canhub/cropper/CropOverlayView;->g:Lcom/canhub/cropper/e0;

    .line 7
    .line 8
    iget-object v0, v0, Lcom/canhub/cropper/e0;->a:Landroid/graphics/RectF;

    .line 9
    .line 10
    invoke-virtual {v0, p1}, Landroid/graphics/RectF;->set(Landroid/graphics/RectF;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final setCropperTextLabelVisibility(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/canhub/cropper/CropOverlayView;->G:Z

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final setFixedAspectRatio(Z)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/canhub/cropper/CropOverlayView;->z:Z

    .line 2
    .line 3
    if-eq v0, p1, :cond_0

    .line 4
    .line 5
    iput-boolean p1, p0, Lcom/canhub/cropper/CropOverlayView;->z:Z

    .line 6
    .line 7
    iget-boolean p1, p0, Lcom/canhub/cropper/CropOverlayView;->L:Z

    .line 8
    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/canhub/cropper/CropOverlayView;->f()V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 15
    .line 16
    .line 17
    :cond_0
    return-void
.end method

.method public final setGuidelines(Lcom/canhub/cropper/CropImageView$Guidelines;)V
    .locals 1
    .param p1    # Lcom/canhub/cropper/CropImageView$Guidelines;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "guidelines"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/canhub/cropper/CropOverlayView;->D:Lcom/canhub/cropper/CropImageView$Guidelines;

    .line 7
    .line 8
    if-eq v0, p1, :cond_0

    .line 9
    .line 10
    iput-object p1, p0, Lcom/canhub/cropper/CropOverlayView;->D:Lcom/canhub/cropper/CropImageView$Guidelines;

    .line 11
    .line 12
    iget-boolean p1, p0, Lcom/canhub/cropper/CropOverlayView;->L:Z

    .line 13
    .line 14
    if-eqz p1, :cond_0

    .line 15
    .line 16
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 17
    .line 18
    .line 19
    :cond_0
    return-void
.end method

.method public final setInitialAttributeValues(Lcom/canhub/cropper/CropImageOptions;)V
    .locals 14
    .param p1    # Lcom/canhub/cropper/CropImageOptions;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "options"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget v0, p1, Lcom/canhub/cropper/CropImageOptions;->m0:F

    .line 7
    .line 8
    iget v1, p1, Lcom/canhub/cropper/CropImageOptions;->n0:I

    .line 9
    .line 10
    iget v2, p1, Lcom/canhub/cropper/CropImageOptions;->L:I

    .line 11
    .line 12
    iget v3, p1, Lcom/canhub/cropper/CropImageOptions;->K:I

    .line 13
    .line 14
    iget v4, p1, Lcom/canhub/cropper/CropImageOptions;->J:I

    .line 15
    .line 16
    iget v5, p1, Lcom/canhub/cropper/CropImageOptions;->I:I

    .line 17
    .line 18
    iget v6, p1, Lcom/canhub/cropper/CropImageOptions;->v:I

    .line 19
    .line 20
    iget v7, p1, Lcom/canhub/cropper/CropImageOptions;->u:I

    .line 21
    .line 22
    iget-boolean v8, p1, Lcom/canhub/cropper/CropImageOptions;->t:Z

    .line 23
    .line 24
    iget-object v9, p0, Lcom/canhub/cropper/CropOverlayView;->c:Lcom/canhub/cropper/CropImageOptions;

    .line 25
    .line 26
    invoke-static {v9, p1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v9

    .line 30
    iget-object v10, p0, Lcom/canhub/cropper/CropOverlayView;->c:Lcom/canhub/cropper/CropImageOptions;

    .line 31
    .line 32
    const/4 v11, 0x1

    .line 33
    const/4 v12, 0x0

    .line 34
    if-eqz v10, :cond_0

    .line 35
    .line 36
    iget-boolean v13, v10, Lcom/canhub/cropper/CropImageOptions;->t:Z

    .line 37
    .line 38
    if-ne v8, v13, :cond_0

    .line 39
    .line 40
    iget v13, v10, Lcom/canhub/cropper/CropImageOptions;->u:I

    .line 41
    .line 42
    if-ne v7, v13, :cond_0

    .line 43
    .line 44
    iget v10, v10, Lcom/canhub/cropper/CropImageOptions;->v:I

    .line 45
    .line 46
    if-ne v6, v10, :cond_0

    .line 47
    .line 48
    move v10, v12

    .line 49
    goto :goto_0

    .line 50
    :cond_0
    move v10, v11

    .line 51
    :goto_0
    iput-object p1, p0, Lcom/canhub/cropper/CropOverlayView;->c:Lcom/canhub/cropper/CropImageOptions;

    .line 52
    .line 53
    int-to-float v5, v5

    .line 54
    iget-object v13, p0, Lcom/canhub/cropper/CropOverlayView;->g:Lcom/canhub/cropper/e0;

    .line 55
    .line 56
    iput v5, v13, Lcom/canhub/cropper/e0;->g:F

    .line 57
    .line 58
    int-to-float v4, v4

    .line 59
    iput v4, v13, Lcom/canhub/cropper/e0;->h:F

    .line 60
    .line 61
    int-to-float v3, v3

    .line 62
    iput v3, v13, Lcom/canhub/cropper/e0;->i:F

    .line 63
    .line 64
    int-to-float v2, v2

    .line 65
    iput v2, v13, Lcom/canhub/cropper/e0;->j:F

    .line 66
    .line 67
    if-eqz v9, :cond_1

    .line 68
    .line 69
    goto/16 :goto_1

    .line 70
    .line 71
    :cond_1
    iget v9, p1, Lcom/canhub/cropper/CropImageOptions;->G:I

    .line 72
    .line 73
    int-to-float v9, v9

    .line 74
    iput v9, v13, Lcom/canhub/cropper/e0;->c:F

    .line 75
    .line 76
    iget v9, p1, Lcom/canhub/cropper/CropImageOptions;->H:I

    .line 77
    .line 78
    int-to-float v9, v9

    .line 79
    iput v9, v13, Lcom/canhub/cropper/e0;->d:F

    .line 80
    .line 81
    iput v5, v13, Lcom/canhub/cropper/e0;->g:F

    .line 82
    .line 83
    iput v4, v13, Lcom/canhub/cropper/e0;->h:F

    .line 84
    .line 85
    iput v3, v13, Lcom/canhub/cropper/e0;->i:F

    .line 86
    .line 87
    iput v2, v13, Lcom/canhub/cropper/e0;->j:F

    .line 88
    .line 89
    iput v1, p0, Lcom/canhub/cropper/CropOverlayView;->J:I

    .line 90
    .line 91
    iput v0, p0, Lcom/canhub/cropper/CropOverlayView;->I:F

    .line 92
    .line 93
    iget-object v2, p1, Lcom/canhub/cropper/CropImageOptions;->o0:Ljava/lang/String;

    .line 94
    .line 95
    if-nez v2, :cond_2

    .line 96
    .line 97
    const-string v2, ""

    .line 98
    .line 99
    :cond_2
    iput-object v2, p0, Lcom/canhub/cropper/CropOverlayView;->H:Ljava/lang/String;

    .line 100
    .line 101
    iget-boolean v2, p1, Lcom/canhub/cropper/CropImageOptions;->k:Z

    .line 102
    .line 103
    iput-boolean v2, p0, Lcom/canhub/cropper/CropOverlayView;->G:Z

    .line 104
    .line 105
    iget v2, p1, Lcom/canhub/cropper/CropImageOptions;->e:F

    .line 106
    .line 107
    iput v2, p0, Lcom/canhub/cropper/CropOverlayView;->a:F

    .line 108
    .line 109
    iget-object v2, p1, Lcom/canhub/cropper/CropImageOptions;->d:Lcom/canhub/cropper/CropImageView$CropCornerShape;

    .line 110
    .line 111
    iput-object v2, p0, Lcom/canhub/cropper/CropOverlayView;->F:Lcom/canhub/cropper/CropImageView$CropCornerShape;

    .line 112
    .line 113
    iget-object v2, p1, Lcom/canhub/cropper/CropImageOptions;->c:Lcom/canhub/cropper/CropImageView$CropShape;

    .line 114
    .line 115
    iput-object v2, p0, Lcom/canhub/cropper/CropOverlayView;->E:Lcom/canhub/cropper/CropImageView$CropShape;

    .line 116
    .line 117
    iget v2, p1, Lcom/canhub/cropper/CropImageOptions;->f:F

    .line 118
    .line 119
    iput v2, p0, Lcom/canhub/cropper/CropOverlayView;->x:F

    .line 120
    .line 121
    iget-boolean v2, p1, Lcom/canhub/cropper/CropImageOptions;->q:Z

    .line 122
    .line 123
    invoke-virtual {p0, v2}, Landroid/view/View;->setEnabled(Z)V

    .line 124
    .line 125
    .line 126
    iget-object v2, p1, Lcom/canhub/cropper/CropImageOptions;->h:Lcom/canhub/cropper/CropImageView$Guidelines;

    .line 127
    .line 128
    iput-object v2, p0, Lcom/canhub/cropper/CropOverlayView;->D:Lcom/canhub/cropper/CropImageView$Guidelines;

    .line 129
    .line 130
    iput-boolean v8, p0, Lcom/canhub/cropper/CropOverlayView;->z:Z

    .line 131
    .line 132
    invoke-virtual {p0, v7}, Lcom/canhub/cropper/CropOverlayView;->setAspectRatioX(I)V

    .line 133
    .line 134
    .line 135
    invoke-virtual {p0, v6}, Lcom/canhub/cropper/CropOverlayView;->setAspectRatioY(I)V

    .line 136
    .line 137
    .line 138
    iget-boolean v2, p1, Lcom/canhub/cropper/CropImageOptions;->o:Z

    .line 139
    .line 140
    iput-boolean v2, p0, Lcom/canhub/cropper/CropOverlayView;->e:Z

    .line 141
    .line 142
    if-eqz v2, :cond_3

    .line 143
    .line 144
    iget-object v2, p0, Lcom/canhub/cropper/CropOverlayView;->d:Landroid/view/ScaleGestureDetector;

    .line 145
    .line 146
    if-nez v2, :cond_3

    .line 147
    .line 148
    new-instance v2, Landroid/view/ScaleGestureDetector;

    .line 149
    .line 150
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 151
    .line 152
    .line 153
    move-result-object v3

    .line 154
    new-instance v4, Lcom/canhub/cropper/b0;

    .line 155
    .line 156
    invoke-direct {v4, p0}, Lcom/canhub/cropper/b0;-><init>(Lcom/canhub/cropper/CropOverlayView;)V

    .line 157
    .line 158
    .line 159
    invoke-direct {v2, v3, v4}, Landroid/view/ScaleGestureDetector;-><init>(Landroid/content/Context;Landroid/view/ScaleGestureDetector$OnScaleGestureListener;)V

    .line 160
    .line 161
    .line 162
    iput-object v2, p0, Lcom/canhub/cropper/CropOverlayView;->d:Landroid/view/ScaleGestureDetector;

    .line 163
    .line 164
    :cond_3
    iget-boolean v2, p1, Lcom/canhub/cropper/CropImageOptions;->p:Z

    .line 165
    .line 166
    iput-boolean v2, p0, Lcom/canhub/cropper/CropOverlayView;->f:Z

    .line 167
    .line 168
    iget v2, p1, Lcom/canhub/cropper/CropImageOptions;->g:F

    .line 169
    .line 170
    iput v2, p0, Lcom/canhub/cropper/CropOverlayView;->w:F

    .line 171
    .line 172
    iget v2, p1, Lcom/canhub/cropper/CropImageOptions;->s:F

    .line 173
    .line 174
    iput v2, p0, Lcom/canhub/cropper/CropOverlayView;->v:F

    .line 175
    .line 176
    iget v2, p1, Lcom/canhub/cropper/CropImageOptions;->w:F

    .line 177
    .line 178
    iget v3, p1, Lcom/canhub/cropper/CropImageOptions;->x:I

    .line 179
    .line 180
    invoke-static {v2, v3}, La/a;->j(FI)Landroid/graphics/Paint;

    .line 181
    .line 182
    .line 183
    move-result-object v2

    .line 184
    iput-object v2, p0, Lcom/canhub/cropper/CropOverlayView;->j:Landroid/graphics/Paint;

    .line 185
    .line 186
    iget v2, p1, Lcom/canhub/cropper/CropImageOptions;->z:F

    .line 187
    .line 188
    iput v2, p0, Lcom/canhub/cropper/CropOverlayView;->t:F

    .line 189
    .line 190
    iget v2, p1, Lcom/canhub/cropper/CropImageOptions;->A:F

    .line 191
    .line 192
    iput v2, p0, Lcom/canhub/cropper/CropOverlayView;->u:F

    .line 193
    .line 194
    iget v2, p1, Lcom/canhub/cropper/CropImageOptions;->C:I

    .line 195
    .line 196
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 197
    .line 198
    .line 199
    move-result-object v2

    .line 200
    iput-object v2, p0, Lcom/canhub/cropper/CropOverlayView;->b:Ljava/lang/Integer;

    .line 201
    .line 202
    iget v2, p1, Lcom/canhub/cropper/CropImageOptions;->y:F

    .line 203
    .line 204
    iget v3, p1, Lcom/canhub/cropper/CropImageOptions;->B:I

    .line 205
    .line 206
    invoke-static {v2, v3}, La/a;->j(FI)Landroid/graphics/Paint;

    .line 207
    .line 208
    .line 209
    move-result-object v2

    .line 210
    iput-object v2, p0, Lcom/canhub/cropper/CropOverlayView;->k:Landroid/graphics/Paint;

    .line 211
    .line 212
    iget v2, p1, Lcom/canhub/cropper/CropImageOptions;->D:F

    .line 213
    .line 214
    iget v3, p1, Lcom/canhub/cropper/CropImageOptions;->E:I

    .line 215
    .line 216
    invoke-static {v2, v3}, La/a;->j(FI)Landroid/graphics/Paint;

    .line 217
    .line 218
    .line 219
    move-result-object v2

    .line 220
    iput-object v2, p0, Lcom/canhub/cropper/CropOverlayView;->l:Landroid/graphics/Paint;

    .line 221
    .line 222
    iget p1, p1, Lcom/canhub/cropper/CropImageOptions;->F:I

    .line 223
    .line 224
    new-instance v2, Landroid/graphics/Paint;

    .line 225
    .line 226
    invoke-direct {v2}, Landroid/graphics/Paint;-><init>()V

    .line 227
    .line 228
    .line 229
    invoke-virtual {v2, p1}, Landroid/graphics/Paint;->setColor(I)V

    .line 230
    .line 231
    .line 232
    iput-object v2, p0, Lcom/canhub/cropper/CropOverlayView;->m:Landroid/graphics/Paint;

    .line 233
    .line 234
    new-instance p1, Landroid/graphics/Paint;

    .line 235
    .line 236
    invoke-direct {p1}, Landroid/graphics/Paint;-><init>()V

    .line 237
    .line 238
    .line 239
    const/high16 v2, 0x3f800000    # 1.0f

    .line 240
    .line 241
    invoke-virtual {p1, v2}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 242
    .line 243
    .line 244
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 245
    .line 246
    .line 247
    sget-object v0, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 248
    .line 249
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 250
    .line 251
    .line 252
    sget-object v0, Landroid/graphics/Paint$Align;->CENTER:Landroid/graphics/Paint$Align;

    .line 253
    .line 254
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    .line 255
    .line 256
    .line 257
    invoke-virtual {p1, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 258
    .line 259
    .line 260
    iput-object p1, p0, Lcom/canhub/cropper/CropOverlayView;->n:Landroid/graphics/Paint;

    .line 261
    .line 262
    if-eqz v10, :cond_4

    .line 263
    .line 264
    invoke-virtual {p0}, Lcom/canhub/cropper/CropOverlayView;->f()V

    .line 265
    .line 266
    .line 267
    :cond_4
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 268
    .line 269
    .line 270
    if-eqz v10, :cond_5

    .line 271
    .line 272
    iget-object p1, p0, Lcom/canhub/cropper/CropOverlayView;->h:Lcom/canhub/cropper/a0;

    .line 273
    .line 274
    if-eqz p1, :cond_5

    .line 275
    .line 276
    check-cast p1, Lcom/canhub/cropper/CropImageView;

    .line 277
    .line 278
    invoke-virtual {p1, v12, v11}, Lcom/canhub/cropper/CropImageView;->d(ZZ)V

    .line 279
    .line 280
    .line 281
    :cond_5
    :goto_1
    return-void
.end method

.method public final setInitialCropWindowRect(Landroid/graphics/Rect;)V
    .locals 2
    .param p1    # Landroid/graphics/Rect;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    sget-object p1, Lcom/canhub/cropper/h;->a:Landroid/graphics/Rect;

    .line 4
    .line 5
    :cond_0
    iget-object v0, p0, Lcom/canhub/cropper/CropOverlayView;->K:Landroid/graphics/Rect;

    .line 6
    .line 7
    invoke-virtual {v0, p1}, Landroid/graphics/Rect;->set(Landroid/graphics/Rect;)V

    .line 8
    .line 9
    .line 10
    iget-boolean p1, p0, Lcom/canhub/cropper/CropOverlayView;->L:Z

    .line 11
    .line 12
    if-eqz p1, :cond_1

    .line 13
    .line 14
    invoke-virtual {p0}, Lcom/canhub/cropper/CropOverlayView;->f()V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 18
    .line 19
    .line 20
    iget-object p1, p0, Lcom/canhub/cropper/CropOverlayView;->h:Lcom/canhub/cropper/a0;

    .line 21
    .line 22
    if-eqz p1, :cond_1

    .line 23
    .line 24
    check-cast p1, Lcom/canhub/cropper/CropImageView;

    .line 25
    .line 26
    const/4 v0, 0x1

    .line 27
    const/4 v1, 0x0

    .line 28
    invoke-virtual {p1, v1, v0}, Lcom/canhub/cropper/CropImageView;->d(ZZ)V

    .line 29
    .line 30
    .line 31
    :cond_1
    return-void
.end method

.method public final setSnapRadius(F)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/canhub/cropper/CropOverlayView;->x:F

    .line 2
    .line 3
    return-void
.end method
