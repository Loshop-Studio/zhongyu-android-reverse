.class public abstract Ly1/b;
.super Ly1/a;
.source "SourceFile"

# interfaces
.implements Lz1/b$a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ly1/b$b;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 4
    new-instance v0, Lz1/b;

    invoke-direct {v0}, Lz1/b;-><init>()V

    invoke-direct {p0, v0}, Ly1/b;-><init>(Lz1/b;)V

    return-void
.end method

.method public constructor <init>(Lz1/b;)V
    .locals 3

    .line 1
    new-instance v0, Lz1/a;

    new-instance v1, Ly1/b$b;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Ly1/b$b;-><init>(Ly1/b$a;)V

    invoke-direct {v0, v1}, Lz1/a;-><init>(Lz1/c$b;)V

    invoke-direct {p0, v0}, Ly1/a;-><init>(Lz1/a;)V

    .line 2
    invoke-virtual {p1, p0}, Lz1/b;->g(Lz1/b$a;)V

    .line 3
    invoke-virtual {p0, p1}, Ly1/a;->v(Lz1/a$a;)V

    return-void
.end method


# virtual methods
.method public final e(Lcom/liulishuo/okdownload/a;Lr1/c;ZLz1/a$c;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final k(Lcom/liulishuo/okdownload/a;IJ)V
    .locals 0

    .line 1
    return-void
.end method

.method public final n(Lcom/liulishuo/okdownload/a;J)V
    .locals 0

    .line 1
    return-void
.end method

.method public final r(Lcom/liulishuo/okdownload/a;ILr1/a;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final s(Lcom/liulishuo/okdownload/a;Lcom/liulishuo/okdownload/core/cause/EndCause;Ljava/lang/Exception;Lz1/a$c;)V
    .locals 0

    .line 1
    return-void
.end method
