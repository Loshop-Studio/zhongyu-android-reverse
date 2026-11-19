.class public final Lf3/u1;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Lkotlinx/coroutines/internal/t;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final b:Lkotlinx/coroutines/internal/t;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final c:Lkotlinx/coroutines/internal/t;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final d:Lkotlinx/coroutines/internal/t;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final e:Lkotlinx/coroutines/internal/t;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final f:Lf3/y0;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final g:Lf3/y0;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lkotlinx/coroutines/internal/t;

    const-string v1, "COMPLETING_ALREADY"

    invoke-direct {v0, v1}, Lkotlinx/coroutines/internal/t;-><init>(Ljava/lang/String;)V

    sput-object v0, Lf3/u1;->a:Lkotlinx/coroutines/internal/t;

    .line 2
    new-instance v0, Lkotlinx/coroutines/internal/t;

    const-string v1, "COMPLETING_WAITING_CHILDREN"

    invoke-direct {v0, v1}, Lkotlinx/coroutines/internal/t;-><init>(Ljava/lang/String;)V

    sput-object v0, Lf3/u1;->b:Lkotlinx/coroutines/internal/t;

    .line 3
    new-instance v0, Lkotlinx/coroutines/internal/t;

    const-string v1, "COMPLETING_RETRY"

    invoke-direct {v0, v1}, Lkotlinx/coroutines/internal/t;-><init>(Ljava/lang/String;)V

    sput-object v0, Lf3/u1;->c:Lkotlinx/coroutines/internal/t;

    .line 4
    new-instance v0, Lkotlinx/coroutines/internal/t;

    const-string v1, "TOO_LATE_TO_CANCEL"

    invoke-direct {v0, v1}, Lkotlinx/coroutines/internal/t;-><init>(Ljava/lang/String;)V

    sput-object v0, Lf3/u1;->d:Lkotlinx/coroutines/internal/t;

    .line 5
    new-instance v0, Lkotlinx/coroutines/internal/t;

    const-string v1, "SEALED"

    invoke-direct {v0, v1}, Lkotlinx/coroutines/internal/t;-><init>(Ljava/lang/String;)V

    sput-object v0, Lf3/u1;->e:Lkotlinx/coroutines/internal/t;

    .line 6
    new-instance v0, Lf3/y0;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lf3/y0;-><init>(Z)V

    sput-object v0, Lf3/u1;->f:Lf3/y0;

    .line 7
    new-instance v0, Lf3/y0;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lf3/y0;-><init>(Z)V

    sput-object v0, Lf3/u1;->g:Lf3/y0;

    return-void
.end method

.method public static final synthetic a()Lkotlinx/coroutines/internal/t;
    .locals 1

    sget-object v0, Lf3/u1;->a:Lkotlinx/coroutines/internal/t;

    return-object v0
.end method

.method public static final synthetic b()Lkotlinx/coroutines/internal/t;
    .locals 1

    sget-object v0, Lf3/u1;->c:Lkotlinx/coroutines/internal/t;

    return-object v0
.end method

.method public static final synthetic c()Lf3/y0;
    .locals 1

    sget-object v0, Lf3/u1;->g:Lf3/y0;

    return-object v0
.end method

.method public static final synthetic d()Lf3/y0;
    .locals 1

    sget-object v0, Lf3/u1;->f:Lf3/y0;

    return-object v0
.end method

.method public static final synthetic e()Lkotlinx/coroutines/internal/t;
    .locals 1

    sget-object v0, Lf3/u1;->e:Lkotlinx/coroutines/internal/t;

    return-object v0
.end method

.method public static final synthetic f()Lkotlinx/coroutines/internal/t;
    .locals 1

    sget-object v0, Lf3/u1;->d:Lkotlinx/coroutines/internal/t;

    return-object v0
.end method

.method public static final g(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .param p0    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    instance-of v0, p0, Lf3/h1;

    if-eqz v0, :cond_0

    new-instance v0, Lf3/i1;

    check-cast p0, Lf3/h1;

    invoke-direct {v0, p0}, Lf3/i1;-><init>(Lf3/h1;)V

    move-object p0, v0

    :cond_0
    return-object p0
.end method

.method public static final h(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .param p0    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    instance-of v0, p0, Lf3/i1;

    if-eqz v0, :cond_0

    move-object v0, p0

    check-cast v0, Lf3/i1;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    iget-object p0, v0, Lf3/i1;->a:Lf3/h1;

    :goto_1
    return-object p0
.end method
