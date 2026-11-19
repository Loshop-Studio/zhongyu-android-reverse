.class public final Lcoil3/compose/AsyncImagePainter;
.super Landroidx/compose/ui/graphics/painter/Painter;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/runtime/RememberObserver;


# annotations
.annotation build Landroidx/compose/runtime/Stable;
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0003\u0004\u00a8\u0006\u0005"
    }
    d2 = {
        "Lcoil3/compose/AsyncImagePainter;",
        "Landroidx/compose/ui/graphics/painter/Painter;",
        "Landroidx/compose/runtime/RememberObserver;",
        "coil3/compose/d",
        "coil3/compose/i",
        "coil-compose-core_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nAsyncImagePainter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AsyncImagePainter.kt\ncoil3/compose/AsyncImagePainter\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 AndroidTrace.android.kt\nandroidx/compose/ui/util/AndroidTrace_androidKt\n+ 5 ImageRequest.kt\ncoil3/request/ImageRequest$Builder\n+ 6 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n*L\n1#1,413:1\n85#2:414\n113#2,2:415\n1#3:417\n26#4,5:418\n410#5,9:423\n148#6:432\n*S KotlinDebug\n*F\n+ 1 AsyncImagePainter.kt\ncoil3/compose/AsyncImagePainter\n*L\n152#1:414\n152#1:415,2\n214#1:418,5\n272#1:423,9\n334#1:432\n*E\n"
    }
.end annotation


# static fields
.field public static final q:Landroidx/navigation/a;


# instance fields
.field public final a:Landroidx/compose/runtime/MutableState;

.field public b:F

.field public c:Landroidx/compose/ui/graphics/ColorFilter;

.field public d:Z

.field public e:Lkotlinx/coroutines/w0;

.field public f:J

.field public g:Lkotlinx/coroutines/v;

.field public h:Lr6/c;

.field public i:Lr6/c;

.field public j:Landroidx/compose/ui/layout/ContentScale;

.field public k:I

.field public l:Lcoil3/compose/j;

.field public m:Lcoil3/compose/d;

.field public final n:Lkotlinx/coroutines/flow/n0;

.field public final o:Lkotlinx/coroutines/flow/n0;

.field public final p:Lkotlinx/coroutines/flow/a0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Landroidx/navigation/a;

    .line 2
    .line 3
    const/16 v1, 0x19

    .line 4
    .line 5
    invoke-direct {v0, v1}, Landroidx/navigation/a;-><init>(I)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lcoil3/compose/AsyncImagePainter;->q:Landroidx/navigation/a;

    .line 9
    .line 10
    return-void
.end method

.method public constructor <init>(Lcoil3/compose/d;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Landroidx/compose/ui/graphics/painter/Painter;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    const/4 v1, 0x2

    .line 6
    invoke-static {v0, v0, v1, v0}, Landroidx/compose/runtime/SnapshotStateKt;->mutableStateOf$default(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;ILjava/lang/Object;)Landroidx/compose/runtime/MutableState;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iput-object v0, p0, Lcoil3/compose/AsyncImagePainter;->a:Landroidx/compose/runtime/MutableState;

    .line 11
    .line 12
    const/high16 v0, 0x3f800000    # 1.0f

    .line 13
    .line 14
    iput v0, p0, Lcoil3/compose/AsyncImagePainter;->b:F

    .line 15
    .line 16
    sget-object v0, Landroidx/compose/ui/geometry/Size;->Companion:Landroidx/compose/ui/geometry/Size$Companion;

    .line 17
    .line 18
    invoke-virtual {v0}, Landroidx/compose/ui/geometry/Size$Companion;->getUnspecified-NH-jbRc()J

    .line 19
    .line 20
    .line 21
    move-result-wide v0

    .line 22
    iput-wide v0, p0, Lcoil3/compose/AsyncImagePainter;->f:J

    .line 23
    .line 24
    sget-object v0, Lcoil3/compose/AsyncImagePainter;->q:Landroidx/navigation/a;

    .line 25
    .line 26
    iput-object v0, p0, Lcoil3/compose/AsyncImagePainter;->h:Lr6/c;

    .line 27
    .line 28
    sget-object v0, Landroidx/compose/ui/layout/ContentScale;->Companion:Landroidx/compose/ui/layout/ContentScale$Companion;

    .line 29
    .line 30
    invoke-virtual {v0}, Landroidx/compose/ui/layout/ContentScale$Companion;->getFit()Landroidx/compose/ui/layout/ContentScale;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    iput-object v0, p0, Lcoil3/compose/AsyncImagePainter;->j:Landroidx/compose/ui/layout/ContentScale;

    .line 35
    .line 36
    sget-object v0, Landroidx/compose/ui/graphics/drawscope/DrawScope;->Companion:Landroidx/compose/ui/graphics/drawscope/DrawScope$Companion;

    .line 37
    .line 38
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/drawscope/DrawScope$Companion;->getDefaultFilterQuality-f-v9h1I()I

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    iput v0, p0, Lcoil3/compose/AsyncImagePainter;->k:I

    .line 43
    .line 44
    iput-object p1, p0, Lcoil3/compose/AsyncImagePainter;->m:Lcoil3/compose/d;

    .line 45
    .line 46
    invoke-static {p1}, Lkotlinx/coroutines/flow/h;->b(Ljava/lang/Object;)Lkotlinx/coroutines/flow/n0;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    iput-object p1, p0, Lcoil3/compose/AsyncImagePainter;->n:Lkotlinx/coroutines/flow/n0;

    .line 51
    .line 52
    sget-object p1, Lcoil3/compose/e;->a:Lcoil3/compose/e;

    .line 53
    .line 54
    invoke-static {p1}, Lkotlinx/coroutines/flow/h;->b(Ljava/lang/Object;)Lkotlinx/coroutines/flow/n0;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    iput-object p1, p0, Lcoil3/compose/AsyncImagePainter;->o:Lkotlinx/coroutines/flow/n0;

    .line 59
    .line 60
    new-instance v0, Lkotlinx/coroutines/flow/a0;

    .line 61
    .line 62
    invoke-direct {v0, p1}, Lkotlinx/coroutines/flow/a0;-><init>(Lkotlinx/coroutines/flow/y;)V

    .line 63
    .line 64
    .line 65
    iput-object v0, p0, Lcoil3/compose/AsyncImagePainter;->p:Lkotlinx/coroutines/flow/a0;

    .line 66
    .line 67
    return-void
.end method

.method public static final a(Lcoil3/compose/AsyncImagePainter;Ls/f;Z)Ls/f;
    .locals 4

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p1, Ls/f;->o:Lt/g;

    .line 5
    .line 6
    invoke-static {p1}, Ls/f;->a(Ls/f;)Ls/c;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    new-instance v1, Landroid/support/v4/media/h;

    .line 11
    .line 12
    const/4 v2, 0x4

    .line 13
    const/4 v3, 0x0

    .line 14
    invoke-direct {v1, v2, p1, v3, p0}, Landroid/support/v4/media/h;-><init>(ILjava/lang/Object;ZLjava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    iput-object v1, v0, Ls/c;->d:Lu/a;

    .line 18
    .line 19
    iget-object p1, p1, Ls/f;->s:Ls/e;

    .line 20
    .line 21
    iget-object v1, p1, Ls/e;->i:Lt/g;

    .line 22
    .line 23
    if-nez v1, :cond_0

    .line 24
    .line 25
    sget-object v1, Lt/g;->b0:Lt/d;

    .line 26
    .line 27
    iput-object v1, v0, Ls/c;->n:Lt/g;

    .line 28
    .line 29
    :cond_0
    iget-object v1, p1, Ls/e;->j:Lcoil3/size/Scale;

    .line 30
    .line 31
    if-nez v1, :cond_3

    .line 32
    .line 33
    iget-object p0, p0, Lcoil3/compose/AsyncImagePainter;->j:Landroidx/compose/ui/layout/ContentScale;

    .line 34
    .line 35
    sget v1, Lm/e;->b:I

    .line 36
    .line 37
    sget-object v1, Landroidx/compose/ui/layout/ContentScale;->Companion:Landroidx/compose/ui/layout/ContentScale$Companion;

    .line 38
    .line 39
    invoke-virtual {v1}, Landroidx/compose/ui/layout/ContentScale$Companion;->getFit()Landroidx/compose/ui/layout/ContentScale;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    invoke-static {p0, v2}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v2

    .line 47
    if-nez v2, :cond_2

    .line 48
    .line 49
    invoke-virtual {v1}, Landroidx/compose/ui/layout/ContentScale$Companion;->getInside()Landroidx/compose/ui/layout/ContentScale;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    invoke-static {p0, v1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    move-result p0

    .line 57
    if-eqz p0, :cond_1

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_1
    sget-object p0, Lcoil3/size/Scale;->FILL:Lcoil3/size/Scale;

    .line 61
    .line 62
    goto :goto_1

    .line 63
    :cond_2
    :goto_0
    sget-object p0, Lcoil3/size/Scale;->FIT:Lcoil3/size/Scale;

    .line 64
    .line 65
    :goto_1
    iput-object p0, v0, Ls/c;->o:Lcoil3/size/Scale;

    .line 66
    .line 67
    :cond_3
    iget-object p0, p1, Ls/e;->k:Lcoil3/size/Precision;

    .line 68
    .line 69
    if-nez p0, :cond_4

    .line 70
    .line 71
    sget-object p0, Lcoil3/size/Precision;->INEXACT:Lcoil3/size/Precision;

    .line 72
    .line 73
    iput-object p0, v0, Ls/c;->p:Lcoil3/size/Precision;

    .line 74
    .line 75
    :cond_4
    if-eqz p2, :cond_5

    .line 76
    .line 77
    sget-object p0, Lkotlin/coroutines/EmptyCoroutineContext;->INSTANCE:Lkotlin/coroutines/EmptyCoroutineContext;

    .line 78
    .line 79
    iput-object p0, v0, Ls/c;->f:Lh6/h;

    .line 80
    .line 81
    iput-object p0, v0, Ls/c;->g:Lh6/h;

    .line 82
    .line 83
    iput-object p0, v0, Ls/c;->h:Lh6/h;

    .line 84
    .line 85
    :cond_5
    invoke-virtual {v0}, Ls/c;->a()Ls/f;

    .line 86
    .line 87
    .line 88
    move-result-object p0

    .line 89
    return-object p0
.end method

.method public static final b(Lcoil3/compose/AsyncImagePainter;Lcoil3/compose/i;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcoil3/compose/AsyncImagePainter;->o:Lkotlinx/coroutines/flow/n0;

    .line 2
    .line 3
    invoke-virtual {v0}, Lkotlinx/coroutines/flow/n0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    check-cast v1, Lcoil3/compose/i;

    .line 8
    .line 9
    iget-object v2, p0, Lcoil3/compose/AsyncImagePainter;->h:Lr6/c;

    .line 10
    .line 11
    invoke-interface {v2, p1}, Lr6/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    check-cast p1, Lcoil3/compose/i;

    .line 16
    .line 17
    invoke-virtual {v0, p1}, Lkotlinx/coroutines/flow/n0;->j(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    instance-of v0, p1, Lcoil3/compose/h;

    .line 21
    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    move-object v0, p1

    .line 25
    check-cast v0, Lcoil3/compose/h;

    .line 26
    .line 27
    iget-object v0, v0, Lcoil3/compose/h;->b:Ls/n;

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    instance-of v0, p1, Lcoil3/compose/f;

    .line 31
    .line 32
    if-eqz v0, :cond_1

    .line 33
    .line 34
    move-object v0, p1

    .line 35
    check-cast v0, Lcoil3/compose/f;

    .line 36
    .line 37
    iget-object v0, v0, Lcoil3/compose/f;->b:Ls/b;

    .line 38
    .line 39
    :goto_0
    invoke-interface {v0}, Ls/i;->a()Ls/f;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    sget-object v2, Ls/h;->a:Lo2/a;

    .line 44
    .line 45
    invoke-static {v0, v2}, Lcoil3/o;->e(Ls/f;Lo2/a;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    check-cast v0, Lv/a;

    .line 50
    .line 51
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    :cond_1
    invoke-interface {p1}, Lcoil3/compose/i;->a()Landroidx/compose/ui/graphics/painter/Painter;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    iget-object v2, p0, Lcoil3/compose/AsyncImagePainter;->a:Landroidx/compose/runtime/MutableState;

    .line 59
    .line 60
    invoke-interface {v2, v0}, Landroidx/compose/runtime/MutableState;->setValue(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    invoke-interface {v1}, Lcoil3/compose/i;->a()Landroidx/compose/ui/graphics/painter/Painter;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    invoke-interface {p1}, Lcoil3/compose/i;->a()Landroidx/compose/ui/graphics/painter/Painter;

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    if-eq v0, v2, :cond_5

    .line 72
    .line 73
    invoke-interface {v1}, Lcoil3/compose/i;->a()Landroidx/compose/ui/graphics/painter/Painter;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    instance-of v1, v0, Landroidx/compose/runtime/RememberObserver;

    .line 78
    .line 79
    const/4 v2, 0x0

    .line 80
    if-eqz v1, :cond_2

    .line 81
    .line 82
    check-cast v0, Landroidx/compose/runtime/RememberObserver;

    .line 83
    .line 84
    goto :goto_1

    .line 85
    :cond_2
    move-object v0, v2

    .line 86
    :goto_1
    if-eqz v0, :cond_3

    .line 87
    .line 88
    invoke-interface {v0}, Landroidx/compose/runtime/RememberObserver;->onForgotten()V

    .line 89
    .line 90
    .line 91
    :cond_3
    invoke-interface {p1}, Lcoil3/compose/i;->a()Landroidx/compose/ui/graphics/painter/Painter;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    instance-of v1, v0, Landroidx/compose/runtime/RememberObserver;

    .line 96
    .line 97
    if-eqz v1, :cond_4

    .line 98
    .line 99
    move-object v2, v0

    .line 100
    check-cast v2, Landroidx/compose/runtime/RememberObserver;

    .line 101
    .line 102
    :cond_4
    if-eqz v2, :cond_5

    .line 103
    .line 104
    invoke-interface {v2}, Landroidx/compose/runtime/RememberObserver;->onRemembered()V

    .line 105
    .line 106
    .line 107
    :cond_5
    iget-object p0, p0, Lcoil3/compose/AsyncImagePainter;->i:Lr6/c;

    .line 108
    .line 109
    if-eqz p0, :cond_6

    .line 110
    .line 111
    invoke-interface {p0, p1}, Lr6/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    :cond_6
    return-void
.end method


# virtual methods
.method public final applyAlpha(F)Z
    .locals 0

    .line 1
    iput p1, p0, Lcoil3/compose/AsyncImagePainter;->b:F

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    return p1
.end method

.method public final applyColorFilter(Landroidx/compose/ui/graphics/ColorFilter;)Z
    .locals 0

    .line 1
    iput-object p1, p0, Lcoil3/compose/AsyncImagePainter;->c:Landroidx/compose/ui/graphics/ColorFilter;

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    return p1
.end method

.method public final c()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcoil3/compose/AsyncImagePainter;->m:Lcoil3/compose/d;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-object v1, p0, Lcoil3/compose/AsyncImagePainter;->g:Lkotlinx/coroutines/v;

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    if-eqz v1, :cond_4

    .line 10
    .line 11
    new-instance v3, Lcoil3/compose/AsyncImagePainter$launchJob$1;

    .line 12
    .line 13
    invoke-direct {v3, p0, v0, v2}, Lcoil3/compose/AsyncImagePainter$launchJob$1;-><init>(Lcoil3/compose/AsyncImagePainter;Lcoil3/compose/d;Lh6/c;)V

    .line 14
    .line 15
    .line 16
    invoke-interface {v1}, Lkotlinx/coroutines/v;->getCoroutineContext()Lh6/h;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    sget v4, Lm/e;->b:I

    .line 21
    .line 22
    sget-object v4, Lkotlinx/coroutines/r;->Key:Lkotlinx/coroutines/q;

    .line 23
    .line 24
    invoke-interface {v0, v4}, Lh6/h;->get(Lh6/g;)Lh6/f;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    check-cast v0, Lkotlinx/coroutines/r;

    .line 29
    .line 30
    if-eqz v0, :cond_2

    .line 31
    .line 32
    sget-object v4, Lkotlinx/coroutines/f0;->b:Lkotlinx/coroutines/r1;

    .line 33
    .line 34
    invoke-virtual {v0, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result v4

    .line 38
    if-eqz v4, :cond_1

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_1
    new-instance v4, Lm/b;

    .line 42
    .line 43
    invoke-interface {v1}, Lkotlinx/coroutines/v;->getCoroutineContext()Lh6/h;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    invoke-direct {v4, v1}, Lm/b;-><init>(Lh6/h;)V

    .line 48
    .line 49
    .line 50
    invoke-static {v4}, Lkotlinx/coroutines/x;->a(Lh6/h;)Le7/c;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    new-instance v4, Lm/c;

    .line 55
    .line 56
    invoke-direct {v4, v0}, Lm/c;-><init>(Lkotlinx/coroutines/r;)V

    .line 57
    .line 58
    .line 59
    sget-object v0, Lkotlinx/coroutines/CoroutineStart;->UNDISPATCHED:Lkotlinx/coroutines/CoroutineStart;

    .line 60
    .line 61
    invoke-static {v1, v4, v0, v3}, Lkotlinx/coroutines/x;->u(Lkotlinx/coroutines/v;Lh6/h;Lkotlinx/coroutines/CoroutineStart;Lr6/e;)Lkotlinx/coroutines/k1;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    goto :goto_1

    .line 66
    :cond_2
    :goto_0
    sget-object v0, Lkotlinx/coroutines/f0;->b:Lkotlinx/coroutines/r1;

    .line 67
    .line 68
    sget-object v4, Lkotlinx/coroutines/CoroutineStart;->UNDISPATCHED:Lkotlinx/coroutines/CoroutineStart;

    .line 69
    .line 70
    invoke-static {v1, v0, v4, v3}, Lkotlinx/coroutines/x;->u(Lkotlinx/coroutines/v;Lh6/h;Lkotlinx/coroutines/CoroutineStart;Lr6/e;)Lkotlinx/coroutines/k1;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    :goto_1
    iget-object v1, p0, Lcoil3/compose/AsyncImagePainter;->e:Lkotlinx/coroutines/w0;

    .line 75
    .line 76
    if-eqz v1, :cond_3

    .line 77
    .line 78
    invoke-interface {v1, v2}, Lkotlinx/coroutines/w0;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 79
    .line 80
    .line 81
    :cond_3
    iput-object v0, p0, Lcoil3/compose/AsyncImagePainter;->e:Lkotlinx/coroutines/w0;

    .line 82
    .line 83
    return-void

    .line 84
    :cond_4
    const-string/jumbo v0, "scope"

    .line 85
    .line 86
    .line 87
    invoke-static {v0}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    throw v2
.end method

.method public final d(Lcoil3/compose/d;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcoil3/compose/AsyncImagePainter;->m:Lcoil3/compose/d;

    .line 2
    .line 3
    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_3

    .line 8
    .line 9
    iput-object p1, p0, Lcoil3/compose/AsyncImagePainter;->m:Lcoil3/compose/d;

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    if-nez p1, :cond_1

    .line 13
    .line 14
    iget-object v1, p0, Lcoil3/compose/AsyncImagePainter;->e:Lkotlinx/coroutines/w0;

    .line 15
    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    invoke-interface {v1, v0}, Lkotlinx/coroutines/w0;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 19
    .line 20
    .line 21
    :cond_0
    iput-object v0, p0, Lcoil3/compose/AsyncImagePainter;->e:Lkotlinx/coroutines/w0;

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_1
    iget-boolean v1, p0, Lcoil3/compose/AsyncImagePainter;->d:Z

    .line 25
    .line 26
    if-eqz v1, :cond_2

    .line 27
    .line 28
    invoke-virtual {p0}, Lcoil3/compose/AsyncImagePainter;->c()V

    .line 29
    .line 30
    .line 31
    :cond_2
    :goto_0
    if-eqz p1, :cond_3

    .line 32
    .line 33
    iget-object v1, p0, Lcoil3/compose/AsyncImagePainter;->n:Lkotlinx/coroutines/flow/n0;

    .line 34
    .line 35
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v1, v0, p1}, Lkotlinx/coroutines/flow/n0;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    :cond_3
    return-void
.end method

.method public final getIntrinsicSize-NH-jbRc()J
    .locals 2

    .line 1
    iget-object v0, p0, Lcoil3/compose/AsyncImagePainter;->a:Landroidx/compose/runtime/MutableState;

    .line 2
    .line 3
    invoke-interface {v0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Landroidx/compose/ui/graphics/painter/Painter;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/painter/Painter;->getIntrinsicSize-NH-jbRc()J

    .line 12
    .line 13
    .line 14
    move-result-wide v0

    .line 15
    return-wide v0

    .line 16
    :cond_0
    sget-object v0, Landroidx/compose/ui/geometry/Size;->Companion:Landroidx/compose/ui/geometry/Size$Companion;

    .line 17
    .line 18
    invoke-virtual {v0}, Landroidx/compose/ui/geometry/Size$Companion;->getUnspecified-NH-jbRc()J

    .line 19
    .line 20
    .line 21
    move-result-wide v0

    .line 22
    return-wide v0
.end method

.method public final onAbandoned()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcoil3/compose/AsyncImagePainter;->e:Lkotlinx/coroutines/w0;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    invoke-interface {v0, v1}, Lkotlinx/coroutines/w0;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 7
    .line 8
    .line 9
    :cond_0
    iput-object v1, p0, Lcoil3/compose/AsyncImagePainter;->e:Lkotlinx/coroutines/w0;

    .line 10
    .line 11
    iget-object v0, p0, Lcoil3/compose/AsyncImagePainter;->a:Landroidx/compose/runtime/MutableState;

    .line 12
    .line 13
    invoke-interface {v0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    check-cast v0, Landroidx/compose/ui/graphics/painter/Painter;

    .line 18
    .line 19
    instance-of v2, v0, Landroidx/compose/runtime/RememberObserver;

    .line 20
    .line 21
    if-eqz v2, :cond_1

    .line 22
    .line 23
    move-object v1, v0

    .line 24
    check-cast v1, Landroidx/compose/runtime/RememberObserver;

    .line 25
    .line 26
    :cond_1
    if-eqz v1, :cond_2

    .line 27
    .line 28
    invoke-interface {v1}, Landroidx/compose/runtime/RememberObserver;->onAbandoned()V

    .line 29
    .line 30
    .line 31
    :cond_2
    const/4 v0, 0x0

    .line 32
    iput-boolean v0, p0, Lcoil3/compose/AsyncImagePainter;->d:Z

    .line 33
    .line 34
    return-void
.end method

.method public final onDraw(Landroidx/compose/ui/graphics/drawscope/DrawScope;)V
    .locals 7

    .line 1
    invoke-interface {p1}, Landroidx/compose/ui/graphics/drawscope/DrawScope;->getSize-NH-jbRc()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    iget-wide v2, p0, Lcoil3/compose/AsyncImagePainter;->f:J

    .line 6
    .line 7
    invoke-static {v2, v3, v0, v1}, Landroidx/compose/ui/geometry/Size;->equals-impl0(JJ)Z

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    if-nez v2, :cond_0

    .line 12
    .line 13
    iput-wide v0, p0, Lcoil3/compose/AsyncImagePainter;->f:J

    .line 14
    .line 15
    :cond_0
    iget-object v0, p0, Lcoil3/compose/AsyncImagePainter;->a:Landroidx/compose/runtime/MutableState;

    .line 16
    .line 17
    invoke-interface {v0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    move-object v1, v0

    .line 22
    check-cast v1, Landroidx/compose/ui/graphics/painter/Painter;

    .line 23
    .line 24
    if-eqz v1, :cond_1

    .line 25
    .line 26
    invoke-interface {p1}, Landroidx/compose/ui/graphics/drawscope/DrawScope;->getSize-NH-jbRc()J

    .line 27
    .line 28
    .line 29
    move-result-wide v3

    .line 30
    iget v5, p0, Lcoil3/compose/AsyncImagePainter;->b:F

    .line 31
    .line 32
    iget-object v6, p0, Lcoil3/compose/AsyncImagePainter;->c:Landroidx/compose/ui/graphics/ColorFilter;

    .line 33
    .line 34
    move-object v2, p1

    .line 35
    invoke-virtual/range {v1 .. v6}, Landroidx/compose/ui/graphics/painter/Painter;->draw-x_KDEd0(Landroidx/compose/ui/graphics/drawscope/DrawScope;JFLandroidx/compose/ui/graphics/ColorFilter;)V

    .line 36
    .line 37
    .line 38
    :cond_1
    return-void
.end method

.method public final onForgotten()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcoil3/compose/AsyncImagePainter;->e:Lkotlinx/coroutines/w0;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    invoke-interface {v0, v1}, Lkotlinx/coroutines/w0;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 7
    .line 8
    .line 9
    :cond_0
    iput-object v1, p0, Lcoil3/compose/AsyncImagePainter;->e:Lkotlinx/coroutines/w0;

    .line 10
    .line 11
    iget-object v0, p0, Lcoil3/compose/AsyncImagePainter;->a:Landroidx/compose/runtime/MutableState;

    .line 12
    .line 13
    invoke-interface {v0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    check-cast v0, Landroidx/compose/ui/graphics/painter/Painter;

    .line 18
    .line 19
    instance-of v2, v0, Landroidx/compose/runtime/RememberObserver;

    .line 20
    .line 21
    if-eqz v2, :cond_1

    .line 22
    .line 23
    move-object v1, v0

    .line 24
    check-cast v1, Landroidx/compose/runtime/RememberObserver;

    .line 25
    .line 26
    :cond_1
    if-eqz v1, :cond_2

    .line 27
    .line 28
    invoke-interface {v1}, Landroidx/compose/runtime/RememberObserver;->onForgotten()V

    .line 29
    .line 30
    .line 31
    :cond_2
    const/4 v0, 0x0

    .line 32
    iput-boolean v0, p0, Lcoil3/compose/AsyncImagePainter;->d:Z

    .line 33
    .line 34
    return-void
.end method

.method public final onRemembered()V
    .locals 2

    .line 1
    const-string v0, "AsyncImagePainter.onRemembered"

    .line 2
    .line 3
    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    :try_start_0
    iget-object v0, p0, Lcoil3/compose/AsyncImagePainter;->a:Landroidx/compose/runtime/MutableState;

    .line 7
    .line 8
    invoke-interface {v0}, Landroidx/compose/runtime/State;->getValue()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Landroidx/compose/ui/graphics/painter/Painter;

    .line 13
    .line 14
    instance-of v1, v0, Landroidx/compose/runtime/RememberObserver;

    .line 15
    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    check-cast v0, Landroidx/compose/runtime/RememberObserver;

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :catchall_0
    move-exception v0

    .line 22
    goto :goto_1

    .line 23
    :cond_0
    const/4 v0, 0x0

    .line 24
    :goto_0
    if-eqz v0, :cond_1

    .line 25
    .line 26
    invoke-interface {v0}, Landroidx/compose/runtime/RememberObserver;->onRemembered()V

    .line 27
    .line 28
    .line 29
    :cond_1
    invoke-virtual {p0}, Lcoil3/compose/AsyncImagePainter;->c()V

    .line 30
    .line 31
    .line 32
    const/4 v0, 0x1

    .line 33
    iput-boolean v0, p0, Lcoil3/compose/AsyncImagePainter;->d:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 34
    .line 35
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 36
    .line 37
    .line 38
    return-void

    .line 39
    :goto_1
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 40
    .line 41
    .line 42
    throw v0
.end method
