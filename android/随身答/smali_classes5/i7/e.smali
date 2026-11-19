.class public abstract Li7/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Li7/e$a;
    }
.end annotation


# static fields
.field public static final n:Li7/e$a;


# instance fields
.field public final a:Lh7/c;

.field public final b:Landroid/graphics/Matrix;

.field public final c:Lcom/zykj/view/simpleBoard/a;

.field public final d:Landroid/graphics/PointF;

.field public e:F

.field public f:I

.field public g:J

.field public final h:Landroid/graphics/Matrix;

.field public final i:Landroid/view/MotionEvent$PointerCoords;

.field public final j:Landroid/graphics/PointF;

.field public final k:Landroid/graphics/PointF;

.field public final l:Landroid/graphics/PointF;

.field public final m:Landroid/graphics/Matrix;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Li7/e$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Li7/e$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Li7/e;->n:Li7/e$a;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Lh7/c;Landroid/graphics/Matrix;Lcom/zykj/view/simpleBoard/a;)V
    .locals 1

    .line 1
    const-string v0, "boardConfig"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "cameraMatrix"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "drawControl"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object p1, p0, Li7/e;->a:Lh7/c;

    .line 20
    .line 21
    iput-object p2, p0, Li7/e;->b:Landroid/graphics/Matrix;

    .line 22
    .line 23
    iput-object p3, p0, Li7/e;->c:Lcom/zykj/view/simpleBoard/a;

    .line 24
    .line 25
    new-instance p1, Landroid/graphics/PointF;

    .line 26
    .line 27
    invoke-direct {p1}, Landroid/graphics/PointF;-><init>()V

    .line 28
    .line 29
    .line 30
    iput-object p1, p0, Li7/e;->d:Landroid/graphics/PointF;

    .line 31
    .line 32
    const/high16 p1, 0x3f800000    # 1.0f

    .line 33
    .line 34
    iput p1, p0, Li7/e;->e:F

    .line 35
    .line 36
    new-instance p1, Landroid/graphics/Matrix;

    .line 37
    .line 38
    invoke-direct {p1}, Landroid/graphics/Matrix;-><init>()V

    .line 39
    .line 40
    .line 41
    iput-object p1, p0, Li7/e;->h:Landroid/graphics/Matrix;

    .line 42
    .line 43
    new-instance p1, Landroid/view/MotionEvent$PointerCoords;

    .line 44
    .line 45
    invoke-direct {p1}, Landroid/view/MotionEvent$PointerCoords;-><init>()V

    .line 46
    .line 47
    .line 48
    iput-object p1, p0, Li7/e;->i:Landroid/view/MotionEvent$PointerCoords;

    .line 49
    .line 50
    new-instance p1, Landroid/graphics/PointF;

    .line 51
    .line 52
    invoke-direct {p1}, Landroid/graphics/PointF;-><init>()V

    .line 53
    .line 54
    .line 55
    iput-object p1, p0, Li7/e;->j:Landroid/graphics/PointF;

    .line 56
    .line 57
    new-instance p1, Landroid/graphics/PointF;

    .line 58
    .line 59
    invoke-direct {p1}, Landroid/graphics/PointF;-><init>()V

    .line 60
    .line 61
    .line 62
    iput-object p1, p0, Li7/e;->k:Landroid/graphics/PointF;

    .line 63
    .line 64
    new-instance p1, Landroid/graphics/PointF;

    .line 65
    .line 66
    invoke-direct {p1}, Landroid/graphics/PointF;-><init>()V

    .line 67
    .line 68
    .line 69
    iput-object p1, p0, Li7/e;->l:Landroid/graphics/PointF;

    .line 70
    .line 71
    new-instance p1, Landroid/graphics/Matrix;

    .line 72
    .line 73
    invoke-direct {p1}, Landroid/graphics/Matrix;-><init>()V

    .line 74
    .line 75
    .line 76
    iput-object p1, p0, Li7/e;->m:Landroid/graphics/Matrix;

    .line 77
    .line 78
    return-void
.end method

.method public static synthetic a(Li7/e;Landroid/view/MotionEvent;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Li7/e;->u(Li7/e;Landroid/view/MotionEvent;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Li7/e;Landroid/view/MotionEvent;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Li7/e;->s(Li7/e;Landroid/view/MotionEvent;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Li7/e;Landroid/view/MotionEvent;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Li7/e;->q(Li7/e;Landroid/view/MotionEvent;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Li7/e;Landroid/view/MotionEvent;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Li7/e;->x(Li7/e;Landroid/view/MotionEvent;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final q(Li7/e;Landroid/view/MotionEvent;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Li7/e;->z(Landroid/view/MotionEvent;)V

    .line 2
    .line 3
    .line 4
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 5
    .line 6
    return-object p0
.end method

.method public static final s(Li7/e;Landroid/view/MotionEvent;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Li7/e;->A(Landroid/view/MotionEvent;)V

    .line 2
    .line 3
    .line 4
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 5
    .line 6
    return-object p0
.end method

.method public static final u(Li7/e;Landroid/view/MotionEvent;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Li7/e;->B(Landroid/view/MotionEvent;)V

    .line 2
    .line 3
    .line 4
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 5
    .line 6
    return-object p0
.end method

.method public static final x(Li7/e;Landroid/view/MotionEvent;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Li7/e;->B(Landroid/view/MotionEvent;)V

    .line 2
    .line 3
    .line 4
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 5
    .line 6
    return-object p0
.end method


# virtual methods
.method public abstract A(Landroid/view/MotionEvent;)V
.end method

.method public abstract B(Landroid/view/MotionEvent;)V
.end method

.method public final e(Landroid/graphics/PointF;Landroid/graphics/PointF;)F
    .locals 4

    .line 1
    iget v0, p1, Landroid/graphics/PointF;->x:F

    .line 2
    .line 3
    iget v1, p2, Landroid/graphics/PointF;->x:F

    .line 4
    .line 5
    sub-float/2addr v0, v1

    .line 6
    float-to-double v0, v0

    .line 7
    const/4 v2, 0x2

    .line 8
    int-to-double v2, v2

    .line 9
    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->pow(DD)D

    .line 10
    .line 11
    .line 12
    move-result-wide v0

    .line 13
    double-to-float v0, v0

    .line 14
    iget p1, p1, Landroid/graphics/PointF;->y:F

    .line 15
    .line 16
    iget p2, p2, Landroid/graphics/PointF;->y:F

    .line 17
    .line 18
    sub-float/2addr p1, p2

    .line 19
    float-to-double p1, p1

    .line 20
    invoke-static {p1, p2, v2, v3}, Ljava/lang/Math;->pow(DD)D

    .line 21
    .line 22
    .line 23
    move-result-wide p1

    .line 24
    double-to-float p1, p1

    .line 25
    add-float/2addr v0, p1

    .line 26
    float-to-double p1, v0

    .line 27
    invoke-static {p1, p2}, Ljava/lang/Math;->sqrt(D)D

    .line 28
    .line 29
    .line 30
    move-result-wide p1

    .line 31
    double-to-float p1, p1

    .line 32
    return p1
.end method

.method public final f(Landroid/graphics/PointF;Landroid/graphics/PointF;)Landroid/graphics/PointF;
    .locals 3

    .line 1
    new-instance v0, Landroid/graphics/PointF;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/graphics/PointF;-><init>()V

    .line 4
    .line 5
    .line 6
    iget v1, p1, Landroid/graphics/PointF;->x:F

    .line 7
    .line 8
    iget v2, p2, Landroid/graphics/PointF;->x:F

    .line 9
    .line 10
    add-float/2addr v1, v2

    .line 11
    const/4 v2, 0x2

    .line 12
    int-to-float v2, v2

    .line 13
    div-float/2addr v1, v2

    .line 14
    iget p1, p1, Landroid/graphics/PointF;->y:F

    .line 15
    .line 16
    iget p2, p2, Landroid/graphics/PointF;->y:F

    .line 17
    .line 18
    add-float/2addr p1, p2

    .line 19
    div-float/2addr p1, v2

    .line 20
    invoke-virtual {v0, v1, p1}, Landroid/graphics/PointF;->set(FF)V

    .line 21
    .line 22
    .line 23
    return-object v0
.end method

.method public final g(Landroid/view/MotionEvent;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getPointerCount()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x2

    .line 6
    if-ge v0, v1, :cond_0

    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    iget-object v1, p0, Li7/e;->i:Landroid/view/MotionEvent$PointerCoords;

    .line 11
    .line 12
    invoke-virtual {p1, v0, v1}, Landroid/view/MotionEvent;->getPointerCoords(ILandroid/view/MotionEvent$PointerCoords;)V

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, Li7/e;->j:Landroid/graphics/PointF;

    .line 16
    .line 17
    iget-object v1, p0, Li7/e;->i:Landroid/view/MotionEvent$PointerCoords;

    .line 18
    .line 19
    iget v2, v1, Landroid/view/MotionEvent$PointerCoords;->x:F

    .line 20
    .line 21
    iget v1, v1, Landroid/view/MotionEvent$PointerCoords;->y:F

    .line 22
    .line 23
    invoke-virtual {v0, v2, v1}, Landroid/graphics/PointF;->set(FF)V

    .line 24
    .line 25
    .line 26
    const/4 v0, 0x1

    .line 27
    iget-object v1, p0, Li7/e;->i:Landroid/view/MotionEvent$PointerCoords;

    .line 28
    .line 29
    invoke-virtual {p1, v0, v1}, Landroid/view/MotionEvent;->getPointerCoords(ILandroid/view/MotionEvent$PointerCoords;)V

    .line 30
    .line 31
    .line 32
    iget-object p1, p0, Li7/e;->k:Landroid/graphics/PointF;

    .line 33
    .line 34
    iget-object v0, p0, Li7/e;->i:Landroid/view/MotionEvent$PointerCoords;

    .line 35
    .line 36
    iget v1, v0, Landroid/view/MotionEvent$PointerCoords;->x:F

    .line 37
    .line 38
    iget v0, v0, Landroid/view/MotionEvent$PointerCoords;->y:F

    .line 39
    .line 40
    invoke-virtual {p1, v1, v0}, Landroid/graphics/PointF;->set(FF)V

    .line 41
    .line 42
    .line 43
    iget-object p1, p0, Li7/e;->d:Landroid/graphics/PointF;

    .line 44
    .line 45
    iget-object v0, p0, Li7/e;->j:Landroid/graphics/PointF;

    .line 46
    .line 47
    iget-object v1, p0, Li7/e;->k:Landroid/graphics/PointF;

    .line 48
    .line 49
    invoke-virtual {p0, v0, v1}, Li7/e;->f(Landroid/graphics/PointF;Landroid/graphics/PointF;)Landroid/graphics/PointF;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    invoke-virtual {p1, v0}, Landroid/graphics/PointF;->set(Landroid/graphics/PointF;)V

    .line 54
    .line 55
    .line 56
    iget-object p1, p0, Li7/e;->j:Landroid/graphics/PointF;

    .line 57
    .line 58
    iget-object v0, p0, Li7/e;->k:Landroid/graphics/PointF;

    .line 59
    .line 60
    invoke-virtual {p0, p1, v0}, Li7/e;->e(Landroid/graphics/PointF;Landroid/graphics/PointF;)F

    .line 61
    .line 62
    .line 63
    move-result p1

    .line 64
    iput p1, p0, Li7/e;->e:F

    .line 65
    .line 66
    invoke-virtual {p0}, Li7/e;->j()V

    .line 67
    .line 68
    .line 69
    return-void
.end method

.method public final h(Landroid/view/MotionEvent;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getPointerCount()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x2

    .line 6
    if-ge v0, v1, :cond_0

    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    invoke-virtual {p0, p1}, Li7/e;->m(Landroid/view/MotionEvent;)Landroid/graphics/Matrix;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-virtual {p0, p1}, Li7/e;->k(Landroid/graphics/Matrix;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final i(Landroid/view/MotionEvent;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getPointerCount()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x2

    .line 6
    if-ge v0, v1, :cond_0

    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    invoke-virtual {p0, p1}, Li7/e;->m(Landroid/view/MotionEvent;)Landroid/graphics/Matrix;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-virtual {p0, p1}, Li7/e;->l(Landroid/graphics/Matrix;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final j()V
    .locals 2

    .line 1
    iget-object v0, p0, Li7/e;->h:Landroid/graphics/Matrix;

    .line 2
    .line 3
    iget-object v1, p0, Li7/e;->b:Landroid/graphics/Matrix;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final k(Landroid/graphics/Matrix;)V
    .locals 1

    .line 1
    iget-object v0, p0, Li7/e;->h:Landroid/graphics/Matrix;

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Landroid/graphics/Matrix;->preConcat(Landroid/graphics/Matrix;)Z

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Li7/e;->c:Lcom/zykj/view/simpleBoard/a;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Lcom/zykj/view/simpleBoard/a;->A(Landroid/graphics/Matrix;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final l(Landroid/graphics/Matrix;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Li7/e;->k(Landroid/graphics/Matrix;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final m(Landroid/view/MotionEvent;)Landroid/graphics/Matrix;
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    iget-object v1, p0, Li7/e;->i:Landroid/view/MotionEvent$PointerCoords;

    .line 3
    .line 4
    invoke-virtual {p1, v0, v1}, Landroid/view/MotionEvent;->getPointerCoords(ILandroid/view/MotionEvent$PointerCoords;)V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Li7/e;->j:Landroid/graphics/PointF;

    .line 8
    .line 9
    iget-object v1, p0, Li7/e;->i:Landroid/view/MotionEvent$PointerCoords;

    .line 10
    .line 11
    iget v2, v1, Landroid/view/MotionEvent$PointerCoords;->x:F

    .line 12
    .line 13
    iget v1, v1, Landroid/view/MotionEvent$PointerCoords;->y:F

    .line 14
    .line 15
    invoke-virtual {v0, v2, v1}, Landroid/graphics/PointF;->set(FF)V

    .line 16
    .line 17
    .line 18
    const/4 v0, 0x1

    .line 19
    iget-object v1, p0, Li7/e;->i:Landroid/view/MotionEvent$PointerCoords;

    .line 20
    .line 21
    invoke-virtual {p1, v0, v1}, Landroid/view/MotionEvent;->getPointerCoords(ILandroid/view/MotionEvent$PointerCoords;)V

    .line 22
    .line 23
    .line 24
    iget-object p1, p0, Li7/e;->k:Landroid/graphics/PointF;

    .line 25
    .line 26
    iget-object v0, p0, Li7/e;->i:Landroid/view/MotionEvent$PointerCoords;

    .line 27
    .line 28
    iget v1, v0, Landroid/view/MotionEvent$PointerCoords;->x:F

    .line 29
    .line 30
    iget v0, v0, Landroid/view/MotionEvent$PointerCoords;->y:F

    .line 31
    .line 32
    invoke-virtual {p1, v1, v0}, Landroid/graphics/PointF;->set(FF)V

    .line 33
    .line 34
    .line 35
    iget-object p1, p0, Li7/e;->m:Landroid/graphics/Matrix;

    .line 36
    .line 37
    invoke-virtual {p1}, Landroid/graphics/Matrix;->reset()V

    .line 38
    .line 39
    .line 40
    iget-object p1, p0, Li7/e;->a:Lh7/c;

    .line 41
    .line 42
    invoke-virtual {p1}, Lh7/c;->a()Z

    .line 43
    .line 44
    .line 45
    move-result p1

    .line 46
    if-eqz p1, :cond_0

    .line 47
    .line 48
    iget-object p1, p0, Li7/e;->j:Landroid/graphics/PointF;

    .line 49
    .line 50
    iget-object v0, p0, Li7/e;->k:Landroid/graphics/PointF;

    .line 51
    .line 52
    invoke-virtual {p0, p1, v0}, Li7/e;->e(Landroid/graphics/PointF;Landroid/graphics/PointF;)F

    .line 53
    .line 54
    .line 55
    move-result p1

    .line 56
    iget v0, p0, Li7/e;->e:F

    .line 57
    .line 58
    div-float/2addr p1, v0

    .line 59
    iget-object v0, p0, Li7/e;->m:Landroid/graphics/Matrix;

    .line 60
    .line 61
    iget-object v1, p0, Li7/e;->d:Landroid/graphics/PointF;

    .line 62
    .line 63
    iget v2, v1, Landroid/graphics/PointF;->x:F

    .line 64
    .line 65
    iget v1, v1, Landroid/graphics/PointF;->y:F

    .line 66
    .line 67
    invoke-virtual {v0, p1, p1, v2, v1}, Landroid/graphics/Matrix;->postScale(FFFF)Z

    .line 68
    .line 69
    .line 70
    :cond_0
    iget-object p1, p0, Li7/e;->l:Landroid/graphics/PointF;

    .line 71
    .line 72
    iget-object v0, p0, Li7/e;->j:Landroid/graphics/PointF;

    .line 73
    .line 74
    iget-object v1, p0, Li7/e;->k:Landroid/graphics/PointF;

    .line 75
    .line 76
    invoke-virtual {p0, v0, v1}, Li7/e;->f(Landroid/graphics/PointF;Landroid/graphics/PointF;)Landroid/graphics/PointF;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    invoke-virtual {p1, v0}, Landroid/graphics/PointF;->set(Landroid/graphics/PointF;)V

    .line 81
    .line 82
    .line 83
    iget-object p1, p0, Li7/e;->m:Landroid/graphics/Matrix;

    .line 84
    .line 85
    iget-object v0, p0, Li7/e;->l:Landroid/graphics/PointF;

    .line 86
    .line 87
    iget v1, v0, Landroid/graphics/PointF;->x:F

    .line 88
    .line 89
    iget-object v2, p0, Li7/e;->d:Landroid/graphics/PointF;

    .line 90
    .line 91
    iget v3, v2, Landroid/graphics/PointF;->x:F

    .line 92
    .line 93
    sub-float/2addr v1, v3

    .line 94
    iget v0, v0, Landroid/graphics/PointF;->y:F

    .line 95
    .line 96
    iget v2, v2, Landroid/graphics/PointF;->y:F

    .line 97
    .line 98
    sub-float/2addr v0, v2

    .line 99
    invoke-virtual {p1, v1, v0}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 100
    .line 101
    .line 102
    iget-object p1, p0, Li7/e;->m:Landroid/graphics/Matrix;

    .line 103
    .line 104
    return-object p1
.end method

.method public final n()Z
    .locals 4

    .line 1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    iget-wide v2, p0, Li7/e;->g:J

    .line 6
    .line 7
    sub-long/2addr v0, v2

    .line 8
    const-wide/16 v2, 0x30

    .line 9
    .line 10
    cmp-long v0, v0, v2

    .line 11
    .line 12
    if-gtz v0, :cond_0

    .line 13
    .line 14
    const/4 v0, 0x1

    .line 15
    return v0

    .line 16
    :cond_0
    const/4 v0, 0x0

    .line 17
    return v0
.end method

.method public final o(Landroid/view/MotionEvent;Lkotlin/jvm/functions/Function0;)V
    .locals 5

    .line 1
    const-string v0, "event"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "callback"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Li7/e;->a:Lh7/c;

    .line 12
    .line 13
    invoke-virtual {v0}, Lh7/c;->b()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    const/4 v1, 0x1

    .line 18
    if-nez v0, :cond_1

    .line 19
    .line 20
    new-instance v0, Landroid/view/MotionEvent$PointerProperties;

    .line 21
    .line 22
    invoke-direct {v0}, Landroid/view/MotionEvent$PointerProperties;-><init>()V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getPointerCount()I

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    const/4 v3, 0x0

    .line 30
    :goto_0
    if-ge v3, v2, :cond_1

    .line 31
    .line 32
    invoke-virtual {p1, v3, v0}, Landroid/view/MotionEvent;->getPointerProperties(ILandroid/view/MotionEvent$PointerProperties;)V

    .line 33
    .line 34
    .line 35
    iget v4, v0, Landroid/view/MotionEvent$PointerProperties;->toolType:I

    .line 36
    .line 37
    if-ne v4, v1, :cond_0

    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getPointerCount()I

    .line 44
    .line 45
    .line 46
    move-result p1

    .line 47
    if-ne p1, v1, :cond_2

    .line 48
    .line 49
    invoke-interface {p2}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    :cond_2
    :goto_1
    return-void
.end method

.method public p(Landroid/view/MotionEvent;)V
    .locals 2

    .line 1
    const-string v0, "event"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    iput v0, p0, Li7/e;->f:I

    .line 8
    .line 9
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 10
    .line 11
    .line 12
    move-result-wide v0

    .line 13
    iput-wide v0, p0, Li7/e;->g:J

    .line 14
    .line 15
    new-instance v0, Li7/a;

    .line 16
    .line 17
    invoke-direct {v0, p0, p1}, Li7/a;-><init>(Li7/e;Landroid/view/MotionEvent;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0, p1, v0}, Li7/e;->o(Landroid/view/MotionEvent;Lkotlin/jvm/functions/Function0;)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public r(Landroid/view/MotionEvent;)V
    .locals 2

    .line 1
    const-string v0, "event"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget v0, p0, Li7/e;->f:I

    .line 7
    .line 8
    const/4 v1, 0x1

    .line 9
    if-eq v0, v1, :cond_1

    .line 10
    .line 11
    const/4 v1, 0x2

    .line 12
    if-eq v0, v1, :cond_0

    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    invoke-virtual {p0, p1}, Li7/e;->h(Landroid/view/MotionEvent;)V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :cond_1
    new-instance v0, Li7/b;

    .line 20
    .line 21
    invoke-direct {v0, p0, p1}, Li7/b;-><init>(Li7/e;Landroid/view/MotionEvent;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0, p1, v0}, Li7/e;->o(Landroid/view/MotionEvent;Lkotlin/jvm/functions/Function0;)V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public t(Landroid/view/MotionEvent;)V
    .locals 2

    .line 1
    const-string v0, "event"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget v0, p0, Li7/e;->f:I

    .line 7
    .line 8
    const/4 v1, 0x1

    .line 9
    if-ne v0, v1, :cond_1

    .line 10
    .line 11
    const/4 v0, 0x2

    .line 12
    iput v0, p0, Li7/e;->f:I

    .line 13
    .line 14
    invoke-virtual {p0}, Li7/e;->n()Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    invoke-virtual {p0, p1}, Li7/e;->y(Landroid/view/MotionEvent;)V

    .line 21
    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v0, Li7/c;

    .line 25
    .line 26
    invoke-direct {v0, p0, p1}, Li7/c;-><init>(Li7/e;Landroid/view/MotionEvent;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0, p1, v0}, Li7/e;->o(Landroid/view/MotionEvent;Lkotlin/jvm/functions/Function0;)V

    .line 30
    .line 31
    .line 32
    :goto_0
    invoke-virtual {p0, p1}, Li7/e;->g(Landroid/view/MotionEvent;)V

    .line 33
    .line 34
    .line 35
    :cond_1
    return-void
.end method

.method public v(Landroid/view/MotionEvent;)V
    .locals 2

    .line 1
    const-string v0, "event"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget v0, p0, Li7/e;->f:I

    .line 7
    .line 8
    const/4 v1, 0x2

    .line 9
    if-ne v0, v1, :cond_0

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    iput v0, p0, Li7/e;->f:I

    .line 13
    .line 14
    invoke-virtual {p0, p1}, Li7/e;->i(Landroid/view/MotionEvent;)V

    .line 15
    .line 16
    .line 17
    :cond_0
    return-void
.end method

.method public w(Landroid/view/MotionEvent;)V
    .locals 2

    .line 1
    const-string v0, "event"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget v0, p0, Li7/e;->f:I

    .line 7
    .line 8
    const/4 v1, 0x1

    .line 9
    if-ne v0, v1, :cond_0

    .line 10
    .line 11
    new-instance v0, Li7/d;

    .line 12
    .line 13
    invoke-direct {v0, p0, p1}, Li7/d;-><init>(Li7/e;Landroid/view/MotionEvent;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, p1, v0}, Li7/e;->o(Landroid/view/MotionEvent;Lkotlin/jvm/functions/Function0;)V

    .line 17
    .line 18
    .line 19
    :cond_0
    return-void
.end method

.method public abstract y(Landroid/view/MotionEvent;)V
.end method

.method public abstract z(Landroid/view/MotionEvent;)V
.end method
