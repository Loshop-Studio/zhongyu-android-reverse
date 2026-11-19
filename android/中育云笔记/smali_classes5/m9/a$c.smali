.class public Lm9/a$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lm9/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "c"
.end annotation


# instance fields
.field public a:Ljava/util/Random;

.field public b:F

.field public c:F

.field public d:F

.field public e:I

.field public f:I

.field public g:Landroid/graphics/Paint;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroid/graphics/Paint;

    .line 5
    .line 6
    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lm9/a$c;->g:Landroid/graphics/Paint;

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, Lm9/a$c;->g:Landroid/graphics/Paint;

    .line 16
    .line 17
    sget-object v1, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 20
    .line 21
    .line 22
    new-instance v0, Ljava/util/Random;

    .line 23
    .line 24
    invoke-direct {v0}, Ljava/util/Random;-><init>()V

    .line 25
    .line 26
    .line 27
    iput-object v0, p0, Lm9/a$c;->a:Ljava/util/Random;

    .line 28
    .line 29
    return-void
.end method


# virtual methods
.method public a(FLandroid/graphics/Canvas;)V
    .locals 5

    .line 1
    iget-object v0, p0, Lm9/a$c;->g:Landroid/graphics/Paint;

    .line 2
    .line 3
    iget v1, p0, Lm9/a$c;->e:I

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 6
    .line 7
    .line 8
    iget v0, p0, Lm9/a$c;->b:F

    .line 9
    .line 10
    iget-object v1, p0, Lm9/a$c;->a:Ljava/util/Random;

    .line 11
    .line 12
    iget v2, p0, Lm9/a$c;->f:I

    .line 13
    .line 14
    invoke-virtual {v1, v2}, Ljava/util/Random;->nextInt(I)I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    int-to-float v1, v1

    .line 19
    const v2, 0x3dcccccd    # 0.1f

    .line 20
    .line 21
    .line 22
    mul-float/2addr v1, v2

    .line 23
    iget-object v3, p0, Lm9/a$c;->a:Ljava/util/Random;

    .line 24
    .line 25
    invoke-virtual {v3}, Ljava/util/Random;->nextFloat()F

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    const/high16 v4, 0x3f000000    # 0.5f

    .line 30
    .line 31
    sub-float/2addr v3, v4

    .line 32
    mul-float/2addr v1, v3

    .line 33
    add-float/2addr v0, v1

    .line 34
    iput v0, p0, Lm9/a$c;->b:F

    .line 35
    .line 36
    iget v0, p0, Lm9/a$c;->c:F

    .line 37
    .line 38
    iget-object v1, p0, Lm9/a$c;->a:Ljava/util/Random;

    .line 39
    .line 40
    iget v3, p0, Lm9/a$c;->f:I

    .line 41
    .line 42
    invoke-virtual {v1, v3}, Ljava/util/Random;->nextInt(I)I

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    int-to-float v1, v1

    .line 47
    mul-float/2addr v1, v2

    .line 48
    iget-object v2, p0, Lm9/a$c;->a:Ljava/util/Random;

    .line 49
    .line 50
    invoke-virtual {v2}, Ljava/util/Random;->nextFloat()F

    .line 51
    .line 52
    .line 53
    move-result v2

    .line 54
    sub-float/2addr v2, v4

    .line 55
    mul-float/2addr v1, v2

    .line 56
    add-float/2addr v0, v1

    .line 57
    iput v0, p0, Lm9/a$c;->c:F

    .line 58
    .line 59
    iget v1, p0, Lm9/a$c;->b:F

    .line 60
    .line 61
    iget v2, p0, Lm9/a$c;->d:F

    .line 62
    .line 63
    mul-float/2addr p1, v2

    .line 64
    sub-float/2addr v2, p1

    .line 65
    iget-object p1, p0, Lm9/a$c;->g:Landroid/graphics/Paint;

    .line 66
    .line 67
    invoke-virtual {p2, v1, v0, v2, p1}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 68
    .line 69
    .line 70
    return-void
.end method
