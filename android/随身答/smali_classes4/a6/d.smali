.class public final La6/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc9/b;


# instance fields
.field public final a:Lc9/b;

.field public final b:Lc9/f;


# direct methods
.method public constructor <init>(Lc9/b;Lc9/f;)V
    .locals 1

    .line 1
    const-string v0, "delegate"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "errorConverter"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, La6/d;->a:Lc9/b;

    .line 15
    .line 16
    iput-object p2, p0, La6/d;->b:Lc9/f;

    .line 17
    .line 18
    return-void
.end method

.method public static final synthetic b(La6/d;)Lc9/f;
    .locals 0

    .line 1
    iget-object p0, p0, La6/d;->b:Lc9/f;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public a()Ll8/w;
    .locals 2

    .line 1
    iget-object v0, p0, La6/d;->a:Lc9/b;

    .line 2
    .line 3
    invoke-interface {v0}, Lc9/b;->a()Ll8/w;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "delegate.request()"

    .line 8
    .line 9
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method

.method public c(Lc9/d;)V
    .locals 2

    .line 1
    const-string v0, "callback"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, La6/d;->a:Lc9/b;

    .line 7
    .line 8
    new-instance v1, La6/d$a;

    .line 9
    .line 10
    invoke-direct {v1, p1, p0}, La6/d$a;-><init>(Lc9/d;La6/d;)V

    .line 11
    .line 12
    .line 13
    invoke-interface {v0, v1}, Lc9/b;->c(Lc9/d;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public cancel()V
    .locals 1

    .line 1
    iget-object v0, p0, La6/d;->a:Lc9/b;

    .line 2
    .line 3
    invoke-interface {v0}, Lc9/b;->cancel()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public bridge synthetic clone()Lc9/b;
    .locals 1

    .line 1
    invoke-virtual {p0}, La6/d;->d()La6/d;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    .line 2
    invoke-virtual {p0}, La6/d;->d()La6/d;

    move-result-object v0

    return-object v0
.end method

.method public d()La6/d;
    .locals 3

    .line 1
    new-instance v0, La6/d;

    .line 2
    .line 3
    iget-object v1, p0, La6/d;->a:Lc9/b;

    .line 4
    .line 5
    invoke-interface {v1}, Lc9/b;->clone()Lc9/b;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const-string v2, "delegate.clone()"

    .line 10
    .line 11
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    iget-object v2, p0, La6/d;->b:Lc9/f;

    .line 15
    .line 16
    invoke-direct {v0, v1, v2}, La6/d;-><init>(Lc9/b;Lc9/f;)V

    .line 17
    .line 18
    .line 19
    return-object v0
.end method

.method public isCanceled()Z
    .locals 1

    .line 1
    iget-object v0, p0, La6/d;->a:Lc9/b;

    .line 2
    .line 3
    invoke-interface {v0}, Lc9/b;->isCanceled()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method
