.class final Lkotlinx/coroutines/internal/x$c;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lx2/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lkotlinx/coroutines/internal/x;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/m;",
        "Lx2/p<",
        "Lkotlinx/coroutines/internal/a0;",
        "Lq2/g$b;",
        "Lkotlinx/coroutines/internal/a0;",
        ">;"
    }
.end annotation


# static fields
.field public static final a:Lkotlinx/coroutines/internal/x$c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lkotlinx/coroutines/internal/x$c;

    invoke-direct {v0}, Lkotlinx/coroutines/internal/x$c;-><init>()V

    sput-object v0, Lkotlinx/coroutines/internal/x$c;->a:Lkotlinx/coroutines/internal/x$c;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x2

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lkotlinx/coroutines/internal/a0;Lq2/g$b;)Lkotlinx/coroutines/internal/a0;
    .locals 1
    .param p1    # Lkotlinx/coroutines/internal/a0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lq2/g$b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    instance-of v0, p2, Lf3/h2;

    if-eqz v0, :cond_0

    .line 2
    check-cast p2, Lf3/h2;

    iget-object v0, p1, Lkotlinx/coroutines/internal/a0;->a:Lq2/g;

    invoke-interface {p2, v0}, Lf3/h2;->m(Lq2/g;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p1, p2, v0}, Lkotlinx/coroutines/internal/a0;->a(Lf3/h2;Ljava/lang/Object;)V

    :cond_0
    return-object p1
.end method

.method public bridge synthetic d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlinx/coroutines/internal/a0;

    check-cast p2, Lq2/g$b;

    invoke-virtual {p0, p1, p2}, Lkotlinx/coroutines/internal/x$c;->a(Lkotlinx/coroutines/internal/a0;Lq2/g$b;)Lkotlinx/coroutines/internal/a0;

    move-result-object p1

    return-object p1
.end method
