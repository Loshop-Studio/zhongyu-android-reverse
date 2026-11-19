.class public final Lee/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lee/f;


# instance fields
.field public final synthetic a:Lee/f;

.field public final b:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lee/f;)V
    .locals 1

    .line 1
    const-string v0, "serialName"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "original"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p2, p0, Lee/p;->a:Lee/f;

    .line 15
    .line 16
    iput-object p1, p0, Lee/p;->b:Ljava/lang/String;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public b()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lee/p;->a:Lee/f;

    .line 2
    .line 3
    invoke-interface {v0}, Lee/f;->b()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public c()I
    .locals 1

    .line 1
    iget-object v0, p0, Lee/p;->a:Lee/f;

    .line 2
    .line 3
    invoke-interface {v0}, Lee/f;->c()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public d(I)Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lee/p;->a:Lee/f;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Lee/f;->d(I)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public e(I)Lee/f;
    .locals 1

    .line 1
    iget-object v0, p0, Lee/p;->a:Lee/f;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Lee/f;->e(I)Lee/f;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public f()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lee/p;->b:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public g(I)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lee/p;->a:Lee/f;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Lee/f;->g(I)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public getKind()Lee/n;
    .locals 1

    .line 1
    iget-object v0, p0, Lee/p;->a:Lee/f;

    .line 2
    .line 3
    invoke-interface {v0}, Lee/f;->getKind()Lee/n;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public isInline()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lee/p;->a:Lee/f;

    .line 2
    .line 3
    invoke-interface {v0}, Lee/f;->isInline()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method
