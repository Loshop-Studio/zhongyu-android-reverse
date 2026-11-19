.class public final Lr2/c$a;
.super Lkotlin/coroutines/jvm/internal/j;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lr2/c;->a(Lx2/p;Ljava/lang/Object;Lq2/d;)Lq2/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field private a:I

.field final synthetic b:Lq2/d;

.field final synthetic c:Lx2/p;

.field final synthetic d:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lq2/d;Lx2/p;Ljava/lang/Object;)V
    .locals 0

    iput-object p1, p0, Lr2/c$a;->b:Lq2/d;

    iput-object p2, p0, Lr2/c$a;->c:Lx2/p;

    iput-object p3, p0, Lr2/c$a;->d:Ljava/lang/Object;

    invoke-direct {p0, p1}, Lkotlin/coroutines/jvm/internal/j;-><init>(Lq2/d;)V

    return-void
.end method


# virtual methods
.method protected invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    iget v0, p0, Lr2/c$a;->a:I

    const/4 v1, 0x2

    const/4 v2, 0x1

    if-eqz v0, :cond_1

    if-ne v0, v2, :cond_0

    .line 2
    iput v1, p0, Lr2/c$a;->a:I

    .line 3
    invoke-static {p1}, Lo2/m;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "This coroutine had already completed"

    .line 4
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 5
    :cond_1
    iput v2, p0, Lr2/c$a;->a:I

    .line 6
    invoke-static {p1}, Lo2/m;->b(Ljava/lang/Object;)V

    .line 7
    iget-object p1, p0, Lr2/c$a;->c:Lx2/p;

    invoke-static {p1, v1}, Lkotlin/jvm/internal/b0;->b(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lx2/p;

    iget-object v0, p0, Lr2/c$a;->d:Ljava/lang/Object;

    invoke-interface {p1, v0, p0}, Lx2/p;->d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    :goto_0
    return-object p1
.end method
