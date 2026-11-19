.class public Lcom/blankj/utilcode/util/ShadowUtils$Config;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/blankj/utilcode/util/ShadowUtils;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Config"
.end annotation


# static fields
.field private static final SHADOW_COLOR_DEFAULT:I = 0x44000000

.field private static final SHADOW_SIZE:I


# instance fields
.field private isCircle:Z

.field private mShadowColorNormal:I

.field private mShadowColorPressed:I

.field private mShadowMaxSizeNormal:F

.field private mShadowMaxSizePressed:F

.field private mShadowRadius:F

.field private mShadowSizeNormal:F

.field private mShadowSizePressed:F


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/high16 v0, 0x41000000    # 8.0f

    .line 2
    .line 3
    invoke-static {v0}, Lcom/blankj/utilcode/util/UtilsBridge;->dp2px(F)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    sput v0, Lcom/blankj/utilcode/util/ShadowUtils$Config;->SHADOW_SIZE:I

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/high16 v0, -0x40800000    # -1.0f

    .line 5
    .line 6
    iput v0, p0, Lcom/blankj/utilcode/util/ShadowUtils$Config;->mShadowRadius:F

    .line 7
    .line 8
    iput v0, p0, Lcom/blankj/utilcode/util/ShadowUtils$Config;->mShadowSizeNormal:F

    .line 9
    .line 10
    iput v0, p0, Lcom/blankj/utilcode/util/ShadowUtils$Config;->mShadowSizePressed:F

    .line 11
    .line 12
    iput v0, p0, Lcom/blankj/utilcode/util/ShadowUtils$Config;->mShadowMaxSizeNormal:F

    .line 13
    .line 14
    iput v0, p0, Lcom/blankj/utilcode/util/ShadowUtils$Config;->mShadowMaxSizePressed:F

    .line 15
    .line 16
    const/high16 v0, 0x44000000    # 512.0f

    .line 17
    .line 18
    iput v0, p0, Lcom/blankj/utilcode/util/ShadowUtils$Config;->mShadowColorNormal:I

    .line 19
    .line 20
    iput v0, p0, Lcom/blankj/utilcode/util/ShadowUtils$Config;->mShadowColorPressed:I

    .line 21
    .line 22
    const/4 v0, 0x0

    .line 23
    iput-boolean v0, p0, Lcom/blankj/utilcode/util/ShadowUtils$Config;->isCircle:Z

    .line 24
    .line 25
    return-void
.end method

.method private getShadowMaxSizeNormal()F
    .locals 2

    .line 1
    iget v0, p0, Lcom/blankj/utilcode/util/ShadowUtils$Config;->mShadowMaxSizeNormal:F

    .line 2
    .line 3
    const/high16 v1, -0x40800000    # -1.0f

    .line 4
    .line 5
    cmpl-float v0, v0, v1

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    invoke-direct {p0}, Lcom/blankj/utilcode/util/ShadowUtils$Config;->getShadowSizeNormal()F

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    iput v0, p0, Lcom/blankj/utilcode/util/ShadowUtils$Config;->mShadowMaxSizeNormal:F

    .line 14
    .line 15
    :cond_0
    iget v0, p0, Lcom/blankj/utilcode/util/ShadowUtils$Config;->mShadowMaxSizeNormal:F

    .line 16
    .line 17
    return v0
.end method

.method private getShadowMaxSizePressed()F
    .locals 2

    .line 1
    iget v0, p0, Lcom/blankj/utilcode/util/ShadowUtils$Config;->mShadowMaxSizePressed:F

    .line 2
    .line 3
    const/high16 v1, -0x40800000    # -1.0f

    .line 4
    .line 5
    cmpl-float v0, v0, v1

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    invoke-direct {p0}, Lcom/blankj/utilcode/util/ShadowUtils$Config;->getShadowSizePressed()F

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    iput v0, p0, Lcom/blankj/utilcode/util/ShadowUtils$Config;->mShadowMaxSizePressed:F

    .line 14
    .line 15
    :cond_0
    iget v0, p0, Lcom/blankj/utilcode/util/ShadowUtils$Config;->mShadowMaxSizePressed:F

    .line 16
    .line 17
    return v0
.end method

.method private getShadowRadius()F
    .locals 2

    .line 1
    iget v0, p0, Lcom/blankj/utilcode/util/ShadowUtils$Config;->mShadowRadius:F

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    cmpg-float v0, v0, v1

    .line 5
    .line 6
    if-gez v0, :cond_0

    .line 7
    .line 8
    iput v1, p0, Lcom/blankj/utilcode/util/ShadowUtils$Config;->mShadowRadius:F

    .line 9
    .line 10
    :cond_0
    iget v0, p0, Lcom/blankj/utilcode/util/ShadowUtils$Config;->mShadowRadius:F

    .line 11
    .line 12
    return v0
.end method

.method private getShadowSizeNormal()F
    .locals 2

    .line 1
    iget v0, p0, Lcom/blankj/utilcode/util/ShadowUtils$Config;->mShadowSizeNormal:F

    .line 2
    .line 3
    const/high16 v1, -0x40800000    # -1.0f

    .line 4
    .line 5
    cmpl-float v0, v0, v1

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    sget v0, Lcom/blankj/utilcode/util/ShadowUtils$Config;->SHADOW_SIZE:I

    .line 10
    .line 11
    int-to-float v0, v0

    .line 12
    iput v0, p0, Lcom/blankj/utilcode/util/ShadowUtils$Config;->mShadowSizeNormal:F

    .line 13
    .line 14
    :cond_0
    iget v0, p0, Lcom/blankj/utilcode/util/ShadowUtils$Config;->mShadowSizeNormal:F

    .line 15
    .line 16
    return v0
.end method

.method private getShadowSizePressed()F
    .locals 2

    .line 1
    iget v0, p0, Lcom/blankj/utilcode/util/ShadowUtils$Config;->mShadowSizePressed:F

    .line 2
    .line 3
    const/high16 v1, -0x40800000    # -1.0f

    .line 4
    .line 5
    cmpl-float v0, v0, v1

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    invoke-direct {p0}, Lcom/blankj/utilcode/util/ShadowUtils$Config;->getShadowSizeNormal()F

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    iput v0, p0, Lcom/blankj/utilcode/util/ShadowUtils$Config;->mShadowSizePressed:F

    .line 14
    .line 15
    :cond_0
    iget v0, p0, Lcom/blankj/utilcode/util/ShadowUtils$Config;->mShadowSizePressed:F

    .line 16
    .line 17
    return v0
.end method


# virtual methods
.method public apply(Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;
    .locals 8

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    new-instance p1, Landroid/graphics/drawable/ColorDrawable;

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    invoke-direct {p1, v0}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    .line 7
    .line 8
    .line 9
    :cond_0
    move-object v2, p1

    .line 10
    new-instance p1, Landroid/graphics/drawable/StateListDrawable;

    .line 11
    .line 12
    invoke-direct {p1}, Landroid/graphics/drawable/StateListDrawable;-><init>()V

    .line 13
    .line 14
    .line 15
    const v0, 0x10100a7

    .line 16
    .line 17
    .line 18
    filled-new-array {v0}, [I

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    new-instance v1, Lcom/blankj/utilcode/util/ShadowUtils$ShadowDrawable;

    .line 23
    .line 24
    invoke-direct {p0}, Lcom/blankj/utilcode/util/ShadowUtils$Config;->getShadowRadius()F

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    invoke-direct {p0}, Lcom/blankj/utilcode/util/ShadowUtils$Config;->getShadowSizeNormal()F

    .line 29
    .line 30
    .line 31
    move-result v4

    .line 32
    invoke-direct {p0}, Lcom/blankj/utilcode/util/ShadowUtils$Config;->getShadowMaxSizeNormal()F

    .line 33
    .line 34
    .line 35
    move-result v5

    .line 36
    iget v6, p0, Lcom/blankj/utilcode/util/ShadowUtils$Config;->mShadowColorPressed:I

    .line 37
    .line 38
    iget-boolean v7, p0, Lcom/blankj/utilcode/util/ShadowUtils$Config;->isCircle:Z

    .line 39
    .line 40
    invoke-direct/range {v1 .. v7}, Lcom/blankj/utilcode/util/ShadowUtils$ShadowDrawable;-><init>(Landroid/graphics/drawable/Drawable;FFFIZ)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p1, v0, v1}, Landroid/graphics/drawable/StateListDrawable;->addState([ILandroid/graphics/drawable/Drawable;)V

    .line 44
    .line 45
    .line 46
    sget-object v0, Landroid/util/StateSet;->WILD_CARD:[I

    .line 47
    .line 48
    new-instance v1, Lcom/blankj/utilcode/util/ShadowUtils$ShadowDrawable;

    .line 49
    .line 50
    invoke-direct {p0}, Lcom/blankj/utilcode/util/ShadowUtils$Config;->getShadowRadius()F

    .line 51
    .line 52
    .line 53
    move-result v3

    .line 54
    invoke-direct {p0}, Lcom/blankj/utilcode/util/ShadowUtils$Config;->getShadowSizePressed()F

    .line 55
    .line 56
    .line 57
    move-result v4

    .line 58
    invoke-direct {p0}, Lcom/blankj/utilcode/util/ShadowUtils$Config;->getShadowMaxSizePressed()F

    .line 59
    .line 60
    .line 61
    move-result v5

    .line 62
    iget v6, p0, Lcom/blankj/utilcode/util/ShadowUtils$Config;->mShadowColorNormal:I

    .line 63
    .line 64
    iget-boolean v7, p0, Lcom/blankj/utilcode/util/ShadowUtils$Config;->isCircle:Z

    .line 65
    .line 66
    invoke-direct/range {v1 .. v7}, Lcom/blankj/utilcode/util/ShadowUtils$ShadowDrawable;-><init>(Landroid/graphics/drawable/Drawable;FFFIZ)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {p1, v0, v1}, Landroid/graphics/drawable/StateListDrawable;->addState([ILandroid/graphics/drawable/Drawable;)V

    .line 70
    .line 71
    .line 72
    return-object p1
.end method

.method public setCircle()Lcom/blankj/utilcode/util/ShadowUtils$Config;
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lcom/blankj/utilcode/util/ShadowUtils$Config;->isCircle:Z

    .line 3
    .line 4
    iget v0, p0, Lcom/blankj/utilcode/util/ShadowUtils$Config;->mShadowRadius:F

    .line 5
    .line 6
    const/high16 v1, -0x40800000    # -1.0f

    .line 7
    .line 8
    cmpl-float v0, v0, v1

    .line 9
    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    return-object p0

    .line 13
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 14
    .line 15
    const-string v1, "Set circle needn\'t set radius."

    .line 16
    .line 17
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    throw v0
.end method

.method public setShadowColor(I)Lcom/blankj/utilcode/util/ShadowUtils$Config;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p1}, Lcom/blankj/utilcode/util/ShadowUtils$Config;->setShadowColor(II)Lcom/blankj/utilcode/util/ShadowUtils$Config;

    move-result-object p1

    return-object p1
.end method

.method public setShadowColor(II)Lcom/blankj/utilcode/util/ShadowUtils$Config;
    .locals 0

    .line 2
    iput p1, p0, Lcom/blankj/utilcode/util/ShadowUtils$Config;->mShadowColorNormal:I

    .line 3
    iput p2, p0, Lcom/blankj/utilcode/util/ShadowUtils$Config;->mShadowColorPressed:I

    return-object p0
.end method

.method public setShadowMaxSize(I)Lcom/blankj/utilcode/util/ShadowUtils$Config;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p1}, Lcom/blankj/utilcode/util/ShadowUtils$Config;->setShadowMaxSize(II)Lcom/blankj/utilcode/util/ShadowUtils$Config;

    move-result-object p1

    return-object p1
.end method

.method public setShadowMaxSize(II)Lcom/blankj/utilcode/util/ShadowUtils$Config;
    .locals 0

    int-to-float p1, p1

    .line 2
    iput p1, p0, Lcom/blankj/utilcode/util/ShadowUtils$Config;->mShadowMaxSizeNormal:F

    int-to-float p1, p2

    .line 3
    iput p1, p0, Lcom/blankj/utilcode/util/ShadowUtils$Config;->mShadowMaxSizePressed:F

    return-object p0
.end method

.method public setShadowRadius(F)Lcom/blankj/utilcode/util/ShadowUtils$Config;
    .locals 1

    .line 1
    iput p1, p0, Lcom/blankj/utilcode/util/ShadowUtils$Config;->mShadowRadius:F

    .line 2
    .line 3
    iget-boolean p1, p0, Lcom/blankj/utilcode/util/ShadowUtils$Config;->isCircle:Z

    .line 4
    .line 5
    if-nez p1, :cond_0

    .line 6
    .line 7
    return-object p0

    .line 8
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 9
    .line 10
    const-string v0, "Set circle needn\'t set radius."

    .line 11
    .line 12
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    throw p1
.end method

.method public setShadowSize(I)Lcom/blankj/utilcode/util/ShadowUtils$Config;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p1}, Lcom/blankj/utilcode/util/ShadowUtils$Config;->setShadowSize(II)Lcom/blankj/utilcode/util/ShadowUtils$Config;

    move-result-object p1

    return-object p1
.end method

.method public setShadowSize(II)Lcom/blankj/utilcode/util/ShadowUtils$Config;
    .locals 0

    int-to-float p1, p1

    .line 2
    iput p1, p0, Lcom/blankj/utilcode/util/ShadowUtils$Config;->mShadowSizeNormal:F

    int-to-float p1, p2

    .line 3
    iput p1, p0, Lcom/blankj/utilcode/util/ShadowUtils$Config;->mShadowSizePressed:F

    return-object p0
.end method
