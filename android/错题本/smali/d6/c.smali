.class public final Ld6/c;
.super Ld6/b;
.source "SourceFile"

# interfaces
.implements Lh6/c;


# instance fields
.field public a:Lr6/f;

.field public b:Lh6/c;

.field public c:Ljava/lang/Object;


# virtual methods
.method public final getContext()Lh6/h;
    .locals 1

    .line 1
    sget-object v0, Lkotlin/coroutines/EmptyCoroutineContext;->INSTANCE:Lkotlin/coroutines/EmptyCoroutineContext;

    .line 2
    .line 3
    return-object v0
.end method

.method public final resumeWith(Ljava/lang/Object;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Ld6/c;->b:Lh6/c;

    .line 3
    .line 4
    iput-object p1, p0, Ld6/c;->c:Ljava/lang/Object;

    .line 5
    .line 6
    return-void
.end method
