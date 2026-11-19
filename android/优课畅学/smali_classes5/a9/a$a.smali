.class public La9/a$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La9/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field public a:F

.field public final b:Ljava/util/Map;

.field public final c:Landroid/text/TextPaint;

.field public final d:Landroid/text/TextPaint;

.field public e:Landroid/graphics/Paint;

.field public f:Landroid/graphics/Paint;

.field public g:Landroid/graphics/Paint;

.field public h:I

.field public i:F

.field public j:F

.field public k:F

.field public l:F

.field public m:I

.field public n:Z

.field public o:Z

.field public p:Z

.field public q:Z

.field public r:Z

.field public s:Z

.field public t:Z

.field public u:Z

.field public v:Z

.field public w:I

.field public x:F

.field public y:Z


# direct methods
.method public constructor <init>()V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/HashMap;

    .line 5
    .line 6
    const/16 v1, 0xa

    .line 7
    .line 8
    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(I)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, La9/a$a;->b:Ljava/util/Map;

    .line 12
    .line 13
    const/4 v0, 0x4

    .line 14
    iput v0, p0, La9/a$a;->h:I

    .line 15
    .line 16
    const/high16 v0, 0x40800000    # 4.0f

    .line 17
    .line 18
    iput v0, p0, La9/a$a;->i:F

    .line 19
    .line 20
    const/high16 v1, 0x40600000    # 3.5f

    .line 21
    .line 22
    iput v1, p0, La9/a$a;->j:F

    .line 23
    .line 24
    const/high16 v1, 0x3f800000    # 1.0f

    .line 25
    .line 26
    iput v1, p0, La9/a$a;->k:F

    .line 27
    .line 28
    iput v1, p0, La9/a$a;->l:F

    .line 29
    .line 30
    const/16 v2, 0xcc

    .line 31
    .line 32
    iput v2, p0, La9/a$a;->m:I

    .line 33
    .line 34
    const/4 v2, 0x0

    .line 35
    iput-boolean v2, p0, La9/a$a;->n:Z

    .line 36
    .line 37
    iput-boolean v2, p0, La9/a$a;->o:Z

    .line 38
    .line 39
    const/4 v3, 0x1

    .line 40
    iput-boolean v3, p0, La9/a$a;->p:Z

    .line 41
    .line 42
    iput-boolean v3, p0, La9/a$a;->q:Z

    .line 43
    .line 44
    iput-boolean v2, p0, La9/a$a;->r:Z

    .line 45
    .line 46
    iput-boolean v2, p0, La9/a$a;->s:Z

    .line 47
    .line 48
    iput-boolean v3, p0, La9/a$a;->t:Z

    .line 49
    .line 50
    iput-boolean v3, p0, La9/a$a;->u:Z

    .line 51
    .line 52
    sget v3, Lz8/b;->a:I

    .line 53
    .line 54
    iput v3, p0, La9/a$a;->w:I

    .line 55
    .line 56
    iput v1, p0, La9/a$a;->x:F

    .line 57
    .line 58
    iput-boolean v2, p0, La9/a$a;->y:Z

    .line 59
    .line 60
    new-instance v1, Landroid/text/TextPaint;

    .line 61
    .line 62
    invoke-direct {v1}, Landroid/text/TextPaint;-><init>()V

    .line 63
    .line 64
    .line 65
    iput-object v1, p0, La9/a$a;->c:Landroid/text/TextPaint;

    .line 66
    .line 67
    iget v2, p0, La9/a$a;->j:F

    .line 68
    .line 69
    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 70
    .line 71
    .line 72
    new-instance v2, Landroid/text/TextPaint;

    .line 73
    .line 74
    invoke-direct {v2, v1}, Landroid/text/TextPaint;-><init>(Landroid/graphics/Paint;)V

    .line 75
    .line 76
    .line 77
    iput-object v2, p0, La9/a$a;->d:Landroid/text/TextPaint;

    .line 78
    .line 79
    new-instance v1, Landroid/graphics/Paint;

    .line 80
    .line 81
    invoke-direct {v1}, Landroid/graphics/Paint;-><init>()V

    .line 82
    .line 83
    .line 84
    iput-object v1, p0, La9/a$a;->e:Landroid/graphics/Paint;

    .line 85
    .line 86
    new-instance v1, Landroid/graphics/Paint;

    .line 87
    .line 88
    invoke-direct {v1}, Landroid/graphics/Paint;-><init>()V

    .line 89
    .line 90
    .line 91
    iput-object v1, p0, La9/a$a;->f:Landroid/graphics/Paint;

    .line 92
    .line 93
    iget v2, p0, La9/a$a;->h:I

    .line 94
    .line 95
    int-to-float v2, v2

    .line 96
    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 97
    .line 98
    .line 99
    iget-object v1, p0, La9/a$a;->f:Landroid/graphics/Paint;

    .line 100
    .line 101
    sget-object v2, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    .line 102
    .line 103
    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 104
    .line 105
    .line 106
    new-instance v1, Landroid/graphics/Paint;

    .line 107
    .line 108
    invoke-direct {v1}, Landroid/graphics/Paint;-><init>()V

    .line 109
    .line 110
    .line 111
    iput-object v1, p0, La9/a$a;->g:Landroid/graphics/Paint;

    .line 112
    .line 113
    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 114
    .line 115
    .line 116
    iget-object v1, p0, La9/a$a;->g:Landroid/graphics/Paint;

    .line 117
    .line 118
    invoke-virtual {v1, v0}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 119
    .line 120
    .line 121
    return-void
.end method

.method public static synthetic a(La9/a$a;)Landroid/graphics/Paint;
    .locals 0

    .line 1
    iget-object p0, p0, La9/a$a;->e:Landroid/graphics/Paint;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic b(La9/a$a;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, La9/a$a;->q:Z

    .line 2
    .line 3
    return p0
.end method


# virtual methods
.method public c(Lz8/c;Landroid/graphics/Paint;Z)V
    .locals 2

    .line 1
    iget-boolean v0, p0, La9/a$a;->v:Z

    .line 2
    .line 3
    const v1, 0xffffff

    .line 4
    .line 5
    .line 6
    if-eqz v0, :cond_3

    .line 7
    .line 8
    if-eqz p3, :cond_2

    .line 9
    .line 10
    iget-boolean p3, p0, La9/a$a;->s:Z

    .line 11
    .line 12
    if-eqz p3, :cond_0

    .line 13
    .line 14
    sget-object p3, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    sget-object p3, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    .line 18
    .line 19
    :goto_0
    invoke-virtual {p2, p3}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 20
    .line 21
    .line 22
    iget p1, p1, Lz8/c;->i:I

    .line 23
    .line 24
    and-int/2addr p1, v1

    .line 25
    invoke-virtual {p2, p1}, Landroid/graphics/Paint;->setColor(I)V

    .line 26
    .line 27
    .line 28
    iget-boolean p1, p0, La9/a$a;->s:Z

    .line 29
    .line 30
    if-eqz p1, :cond_1

    .line 31
    .line 32
    iget p1, p0, La9/a$a;->m:I

    .line 33
    .line 34
    int-to-float p1, p1

    .line 35
    iget p3, p0, La9/a$a;->w:I

    .line 36
    .line 37
    int-to-float p3, p3

    .line 38
    sget v0, Lz8/b;->a:I

    .line 39
    .line 40
    int-to-float v0, v0

    .line 41
    div-float/2addr p3, v0

    .line 42
    mul-float/2addr p1, p3

    .line 43
    float-to-int p1, p1

    .line 44
    goto :goto_1

    .line 45
    :cond_1
    iget p1, p0, La9/a$a;->w:I

    .line 46
    .line 47
    :goto_1
    invoke-virtual {p2, p1}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 48
    .line 49
    .line 50
    return-void

    .line 51
    :cond_2
    sget-object p3, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 52
    .line 53
    invoke-virtual {p2, p3}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 54
    .line 55
    .line 56
    iget p1, p1, Lz8/c;->f:I

    .line 57
    .line 58
    and-int/2addr p1, v1

    .line 59
    invoke-virtual {p2, p1}, Landroid/graphics/Paint;->setColor(I)V

    .line 60
    .line 61
    .line 62
    iget p1, p0, La9/a$a;->w:I

    .line 63
    .line 64
    invoke-virtual {p2, p1}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 65
    .line 66
    .line 67
    return-void

    .line 68
    :cond_3
    if-eqz p3, :cond_6

    .line 69
    .line 70
    iget-boolean p3, p0, La9/a$a;->s:Z

    .line 71
    .line 72
    if-eqz p3, :cond_4

    .line 73
    .line 74
    sget-object p3, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 75
    .line 76
    goto :goto_2

    .line 77
    :cond_4
    sget-object p3, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    .line 78
    .line 79
    :goto_2
    invoke-virtual {p2, p3}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 80
    .line 81
    .line 82
    iget p1, p1, Lz8/c;->i:I

    .line 83
    .line 84
    and-int/2addr p1, v1

    .line 85
    invoke-virtual {p2, p1}, Landroid/graphics/Paint;->setColor(I)V

    .line 86
    .line 87
    .line 88
    iget-boolean p1, p0, La9/a$a;->s:Z

    .line 89
    .line 90
    if-eqz p1, :cond_5

    .line 91
    .line 92
    iget p1, p0, La9/a$a;->m:I

    .line 93
    .line 94
    goto :goto_3

    .line 95
    :cond_5
    sget p1, Lz8/b;->a:I

    .line 96
    .line 97
    :goto_3
    invoke-virtual {p2, p1}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 98
    .line 99
    .line 100
    return-void

    .line 101
    :cond_6
    sget-object p3, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 102
    .line 103
    invoke-virtual {p2, p3}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 104
    .line 105
    .line 106
    iget p1, p1, Lz8/c;->f:I

    .line 107
    .line 108
    and-int/2addr p1, v1

    .line 109
    invoke-virtual {p2, p1}, Landroid/graphics/Paint;->setColor(I)V

    .line 110
    .line 111
    .line 112
    sget p1, Lz8/b;->a:I

    .line 113
    .line 114
    invoke-virtual {p2, p1}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 115
    .line 116
    .line 117
    return-void
.end method

.method public final d(Lz8/c;Landroid/graphics/Paint;)V
    .locals 3

    .line 1
    iget-boolean v0, p0, La9/a$a;->y:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-object v0, p0, La9/a$a;->b:Ljava/util/Map;

    .line 7
    .line 8
    iget v1, p1, Lz8/c;->k:F

    .line 9
    .line 10
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    check-cast v0, Ljava/lang/Float;

    .line 19
    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    iget v1, p0, La9/a$a;->a:F

    .line 23
    .line 24
    iget v2, p0, La9/a$a;->x:F

    .line 25
    .line 26
    cmpl-float v1, v1, v2

    .line 27
    .line 28
    if-eqz v1, :cond_2

    .line 29
    .line 30
    :cond_1
    iget v0, p0, La9/a$a;->x:F

    .line 31
    .line 32
    iput v0, p0, La9/a$a;->a:F

    .line 33
    .line 34
    iget v1, p1, Lz8/c;->k:F

    .line 35
    .line 36
    mul-float/2addr v1, v0

    .line 37
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    iget-object v1, p0, La9/a$a;->b:Ljava/util/Map;

    .line 42
    .line 43
    iget p1, p1, Lz8/c;->k:F

    .line 44
    .line 45
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    invoke-interface {v1, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    :cond_2
    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    .line 53
    .line 54
    .line 55
    move-result p1

    .line 56
    invoke-virtual {p2, p1}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 57
    .line 58
    .line 59
    return-void
.end method

.method public e(Z)V
    .locals 1

    .line 1
    iget-boolean v0, p0, La9/a$a;->p:Z

    .line 2
    .line 3
    iput-boolean v0, p0, La9/a$a;->q:Z

    .line 4
    .line 5
    iget-boolean v0, p0, La9/a$a;->n:Z

    .line 6
    .line 7
    iput-boolean v0, p0, La9/a$a;->o:Z

    .line 8
    .line 9
    iget-boolean v0, p0, La9/a$a;->r:Z

    .line 10
    .line 11
    iput-boolean v0, p0, La9/a$a;->s:Z

    .line 12
    .line 13
    if-eqz p1, :cond_0

    .line 14
    .line 15
    iget-boolean p1, p0, La9/a$a;->t:Z

    .line 16
    .line 17
    if-eqz p1, :cond_0

    .line 18
    .line 19
    const/4 p1, 0x1

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    const/4 p1, 0x0

    .line 22
    :goto_0
    iput-boolean p1, p0, La9/a$a;->u:Z

    .line 23
    .line 24
    return-void
.end method

.method public f(Lz8/c;)Landroid/graphics/Paint;
    .locals 1

    .line 1
    iget-object v0, p0, La9/a$a;->g:Landroid/graphics/Paint;

    .line 2
    .line 3
    iget p1, p1, Lz8/c;->l:I

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    .line 6
    .line 7
    .line 8
    iget-object p1, p0, La9/a$a;->g:Landroid/graphics/Paint;

    .line 9
    .line 10
    return-object p1
.end method

.method public g(Lz8/c;Z)Landroid/text/TextPaint;
    .locals 3

    .line 1
    if-eqz p2, :cond_0

    .line 2
    .line 3
    iget-object p2, p0, La9/a$a;->c:Landroid/text/TextPaint;

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    iget-object p2, p0, La9/a$a;->d:Landroid/text/TextPaint;

    .line 7
    .line 8
    iget-object v0, p0, La9/a$a;->c:Landroid/text/TextPaint;

    .line 9
    .line 10
    invoke-virtual {p2, v0}, Landroid/text/TextPaint;->set(Landroid/text/TextPaint;)V

    .line 11
    .line 12
    .line 13
    :goto_0
    iget v0, p1, Lz8/c;->k:F

    .line 14
    .line 15
    invoke-virtual {p2, v0}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0, p1, p2}, La9/a$a;->d(Lz8/c;Landroid/graphics/Paint;)V

    .line 19
    .line 20
    .line 21
    iget-boolean v0, p0, La9/a$a;->o:Z

    .line 22
    .line 23
    if-eqz v0, :cond_2

    .line 24
    .line 25
    iget v0, p0, La9/a$a;->i:F

    .line 26
    .line 27
    const/4 v1, 0x0

    .line 28
    cmpg-float v2, v0, v1

    .line 29
    .line 30
    if-lez v2, :cond_2

    .line 31
    .line 32
    iget p1, p1, Lz8/c;->i:I

    .line 33
    .line 34
    if-nez p1, :cond_1

    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_1
    invoke-virtual {p2, v0, v1, v1, p1}, Landroid/graphics/Paint;->setShadowLayer(FFFI)V

    .line 38
    .line 39
    .line 40
    goto :goto_2

    .line 41
    :cond_2
    :goto_1
    invoke-virtual {p2}, Landroid/graphics/Paint;->clearShadowLayer()V

    .line 42
    .line 43
    .line 44
    :goto_2
    iget-boolean p1, p0, La9/a$a;->u:Z

    .line 45
    .line 46
    invoke-virtual {p2, p1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 47
    .line 48
    .line 49
    return-object p2
.end method

.method public h()F
    .locals 2

    .line 1
    iget-boolean v0, p0, La9/a$a;->o:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-boolean v1, p0, La9/a$a;->q:Z

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    iget v0, p0, La9/a$a;->i:F

    .line 10
    .line 11
    iget v1, p0, La9/a$a;->j:F

    .line 12
    .line 13
    invoke-static {v0, v1}, Ljava/lang/Math;->max(FF)F

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    return v0

    .line 18
    :cond_0
    if-eqz v0, :cond_1

    .line 19
    .line 20
    iget v0, p0, La9/a$a;->i:F

    .line 21
    .line 22
    return v0

    .line 23
    :cond_1
    iget-boolean v0, p0, La9/a$a;->q:Z

    .line 24
    .line 25
    if-eqz v0, :cond_2

    .line 26
    .line 27
    iget v0, p0, La9/a$a;->j:F

    .line 28
    .line 29
    return v0

    .line 30
    :cond_2
    const/4 v0, 0x0

    .line 31
    return v0
.end method

.method public i(Lz8/c;)Landroid/graphics/Paint;
    .locals 1

    .line 1
    iget-object v0, p0, La9/a$a;->f:Landroid/graphics/Paint;

    .line 2
    .line 3
    iget p1, p1, Lz8/c;->j:I

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    .line 6
    .line 7
    .line 8
    iget-object p1, p0, La9/a$a;->f:Landroid/graphics/Paint;

    .line 9
    .line 10
    return-object p1
.end method

.method public j(Lz8/c;)Z
    .locals 2

    .line 1
    iget-boolean v0, p0, La9/a$a;->q:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-boolean v0, p0, La9/a$a;->s:Z

    .line 6
    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    :cond_0
    iget v0, p0, La9/a$a;->j:F

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    cmpl-float v0, v0, v1

    .line 13
    .line 14
    if-lez v0, :cond_1

    .line 15
    .line 16
    iget p1, p1, Lz8/c;->i:I

    .line 17
    .line 18
    if-eqz p1, :cond_1

    .line 19
    .line 20
    const/4 p1, 0x1

    .line 21
    return p1

    .line 22
    :cond_1
    const/4 p1, 0x0

    .line 23
    return p1
.end method
