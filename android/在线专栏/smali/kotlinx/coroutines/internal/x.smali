.class public final Lkotlinx/coroutines/internal/x;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lkotlinx/coroutines/internal/t;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final b:Lx2/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lx2/p<",
            "Ljava/lang/Object;",
            "Lq2/g$b;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final c:Lx2/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lx2/p<",
            "Lf3/h2<",
            "*>;",
            "Lq2/g$b;",
            "Lf3/h2<",
            "*>;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final d:Lx2/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lx2/p<",
            "Lkotlinx/coroutines/internal/a0;",
            "Lq2/g$b;",
            "Lkotlinx/coroutines/internal/a0;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lkotlinx/coroutines/internal/t;

    const-string v1, "NO_THREAD_ELEMENTS"

    invoke-direct {v0, v1}, Lkotlinx/coroutines/internal/t;-><init>(Ljava/lang/String;)V

    sput-object v0, Lkotlinx/coroutines/internal/x;->a:Lkotlinx/coroutines/internal/t;

    .line 2
    sget-object v0, Lkotlinx/coroutines/internal/x$a;->a:Lkotlinx/coroutines/internal/x$a;

    sput-object v0, Lkotlinx/coroutines/internal/x;->b:Lx2/p;

    .line 3
    sget-object v0, Lkotlinx/coroutines/internal/x$b;->a:Lkotlinx/coroutines/internal/x$b;

    sput-object v0, Lkotlinx/coroutines/internal/x;->c:Lx2/p;

    .line 4
    sget-object v0, Lkotlinx/coroutines/internal/x$c;->a:Lkotlinx/coroutines/internal/x$c;

    sput-object v0, Lkotlinx/coroutines/internal/x;->d:Lx2/p;

    return-void
.end method

.method public static final a(Lq2/g;Ljava/lang/Object;)V
    .locals 2
    .param p0    # Lq2/g;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    sget-object v0, Lkotlinx/coroutines/internal/x;->a:Lkotlinx/coroutines/internal/t;

    if-ne p1, v0, :cond_0

    return-void

    .line 2
    :cond_0
    instance-of v0, p1, Lkotlinx/coroutines/internal/a0;

    if-eqz v0, :cond_1

    .line 3
    check-cast p1, Lkotlinx/coroutines/internal/a0;

    invoke-virtual {p1, p0}, Lkotlinx/coroutines/internal/a0;->b(Lq2/g;)V

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    .line 4
    sget-object v1, Lkotlinx/coroutines/internal/x;->c:Lx2/p;

    invoke-interface {p0, v0, v1}, Lq2/g;->fold(Ljava/lang/Object;Lx2/p;)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>"

    invoke-static {v0, v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    check-cast v0, Lf3/h2;

    .line 5
    invoke-interface {v0, p0, p1}, Lf3/h2;->o(Lq2/g;Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public static final b(Lq2/g;)Ljava/lang/Object;
    .locals 2
    .param p0    # Lq2/g;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    sget-object v1, Lkotlinx/coroutines/internal/x;->b:Lx2/p;

    invoke-interface {p0, v0, v1}, Lq2/g;->fold(Ljava/lang/Object;Lx2/p;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lkotlin/jvm/internal/l;->c(Ljava/lang/Object;)V

    return-object p0
.end method

.method public static final c(Lq2/g;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .param p0    # Lq2/g;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    if-nez p1, :cond_0

    .line 1
    invoke-static {p0}, Lkotlinx/coroutines/internal/x;->b(Lq2/g;)Ljava/lang/Object;

    move-result-object p1

    :cond_0
    const/4 v0, 0x0

    .line 2
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    if-ne p1, v0, :cond_1

    sget-object p0, Lkotlinx/coroutines/internal/x;->a:Lkotlinx/coroutines/internal/t;

    goto :goto_0

    .line 3
    :cond_1
    instance-of v0, p1, Ljava/lang/Integer;

    if-eqz v0, :cond_2

    .line 4
    new-instance v0, Lkotlinx/coroutines/internal/a0;

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    invoke-direct {v0, p0, p1}, Lkotlinx/coroutines/internal/a0;-><init>(Lq2/g;I)V

    sget-object p1, Lkotlinx/coroutines/internal/x;->d:Lx2/p;

    invoke-interface {p0, v0, p1}, Lq2/g;->fold(Ljava/lang/Object;Lx2/p;)Ljava/lang/Object;

    move-result-object p0

    goto :goto_0

    .line 5
    :cond_2
    check-cast p1, Lf3/h2;

    .line 6
    invoke-interface {p1, p0}, Lf3/h2;->m(Lq2/g;)Ljava/lang/Object;

    move-result-object p0

    :goto_0
    return-object p0
.end method
