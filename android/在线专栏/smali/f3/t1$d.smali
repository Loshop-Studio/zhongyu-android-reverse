.class public final Lf3/t1$d;
.super Lkotlinx/coroutines/internal/k$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lf3/t1;->j(Ljava/lang/Object;Lf3/y1;Lf3/s1;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic d:Lkotlinx/coroutines/internal/k;

.field final synthetic e:Lf3/t1;

.field final synthetic f:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lkotlinx/coroutines/internal/k;Lf3/t1;Ljava/lang/Object;)V
    .locals 0

    iput-object p1, p0, Lf3/t1$d;->d:Lkotlinx/coroutines/internal/k;

    iput-object p2, p0, Lf3/t1$d;->e:Lf3/t1;

    iput-object p3, p0, Lf3/t1$d;->f:Ljava/lang/Object;

    invoke-direct {p0, p1}, Lkotlinx/coroutines/internal/k$a;-><init>(Lkotlinx/coroutines/internal/k;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic g(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlinx/coroutines/internal/k;

    invoke-virtual {p0, p1}, Lf3/t1$d;->i(Lkotlinx/coroutines/internal/k;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public i(Lkotlinx/coroutines/internal/k;)Ljava/lang/Object;
    .locals 1
    .param p1    # Lkotlinx/coroutines/internal/k;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    iget-object p1, p0, Lf3/t1$d;->e:Lf3/t1;

    invoke-virtual {p1}, Lf3/t1;->O()Ljava/lang/Object;

    move-result-object p1

    iget-object v0, p0, Lf3/t1$d;->f:Ljava/lang/Object;

    if-ne p1, v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-eqz p1, :cond_1

    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    invoke-static {}, Lkotlinx/coroutines/internal/j;->a()Ljava/lang/Object;

    move-result-object p1

    :goto_1
    return-object p1
.end method
