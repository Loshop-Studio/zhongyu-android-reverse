.class public final Lsd/q;
.super Lsd/p1;
.source "SourceFile"

# interfaces
.implements Lsd/p;


# instance fields
.field public final g:Lsd/r;


# direct methods
.method public constructor <init>(Lsd/r;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lsd/p1;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lsd/q;->g:Lsd/r;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Throwable;)Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Lsd/p1;->t()Lkotlinx/coroutines/JobSupport;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1}, Lkotlinx/coroutines/JobSupport;->K(Ljava/lang/Throwable;)Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    return p1
.end method

.method public getParent()Lkotlinx/coroutines/g;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lsd/p1;->t()Lkotlinx/coroutines/JobSupport;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public u()Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
.end method

.method public v(Ljava/lang/Throwable;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lsd/q;->g:Lsd/r;

    .line 2
    .line 3
    invoke-virtual {p0}, Lsd/p1;->t()Lkotlinx/coroutines/JobSupport;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {p1, v0}, Lsd/r;->m(Lsd/x1;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method
