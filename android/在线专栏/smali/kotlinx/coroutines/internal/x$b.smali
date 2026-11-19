.class final Lkotlinx/coroutines/internal/x$b;
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
        "Lf3/h2<",
        "*>;",
        "Lq2/g$b;",
        "Lf3/h2<",
        "*>;>;"
    }
.end annotation


# static fields
.field public static final a:Lkotlinx/coroutines/internal/x$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lkotlinx/coroutines/internal/x$b;

    invoke-direct {v0}, Lkotlinx/coroutines/internal/x$b;-><init>()V

    sput-object v0, Lkotlinx/coroutines/internal/x$b;->a:Lkotlinx/coroutines/internal/x$b;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x2

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lf3/h2;Lq2/g$b;)Lf3/h2;
    .locals 0
    .param p1    # Lf3/h2;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Lq2/g$b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lf3/h2<",
            "*>;",
            "Lq2/g$b;",
            ")",
            "Lf3/h2<",
            "*>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    if-eqz p1, :cond_0

    return-object p1

    :cond_0
    instance-of p1, p2, Lf3/h2;

    if-eqz p1, :cond_1

    check-cast p2, Lf3/h2;

    goto :goto_0

    :cond_1
    const/4 p2, 0x0

    :goto_0
    return-object p2
.end method

.method public bridge synthetic d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lf3/h2;

    check-cast p2, Lq2/g$b;

    invoke-virtual {p0, p1, p2}, Lkotlinx/coroutines/internal/x$b;->a(Lf3/h2;Lq2/g$b;)Lf3/h2;

    move-result-object p1

    return-object p1
.end method
