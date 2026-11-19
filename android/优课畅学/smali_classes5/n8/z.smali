.class public Ln8/z;
.super Lkotlinx/coroutines/a;
.source "SourceFile"

# interfaces
.implements Lo7/c;


# instance fields
.field public final d:Lm7/c;


# direct methods
.method public constructor <init>(Lkotlin/coroutines/d;Lm7/c;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-direct {p0, p1, v0, v0}, Lkotlinx/coroutines/a;-><init>(Lkotlin/coroutines/d;ZZ)V

    .line 3
    .line 4
    .line 5
    iput-object p2, p0, Ln8/z;->d:Lm7/c;

    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public B(Ljava/lang/Object;)V
    .locals 3

    .line 1
    iget-object v0, p0, Ln8/z;->d:Lm7/c;

    .line 2
    .line 3
    invoke-static {v0}, Lkotlin/coroutines/intrinsics/IntrinsicsKt__IntrinsicsJvmKt;->d(Lm7/c;)Lm7/c;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Ln8/z;->d:Lm7/c;

    .line 8
    .line 9
    invoke-static {p1, v1}, Li8/y;->a(Ljava/lang/Object;Lm7/c;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    const/4 v1, 0x0

    .line 14
    const/4 v2, 0x2

    .line 15
    invoke-static {v0, p1, v1, v2, v1}, Ln8/k;->c(Lm7/c;Ljava/lang/Object;Lx7/l;ILjava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public G0(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-object v0, p0, Ln8/z;->d:Lm7/c;

    .line 2
    .line 3
    invoke-static {p1, v0}, Li8/y;->a(Ljava/lang/Object;Lm7/c;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-interface {v0, p1}, Lm7/c;->resumeWith(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final e0()Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
.end method

.method public final getCallerFrame()Lo7/c;
    .locals 2

    .line 1
    iget-object v0, p0, Ln8/z;->d:Lm7/c;

    .line 2
    .line 3
    instance-of v1, v0, Lo7/c;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    check-cast v0, Lo7/c;

    .line 8
    .line 9
    return-object v0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    return-object v0
.end method
