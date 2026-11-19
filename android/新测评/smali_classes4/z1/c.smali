.class public abstract Lz1/c;
.super Lz1/b;
.source "SourceFile"

# interfaces
.implements La2/b$a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lz1/c$b;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 4
    new-instance v0, La2/b;

    invoke-direct {v0}, La2/b;-><init>()V

    invoke-direct {p0, v0}, Lz1/c;-><init>(La2/b;)V

    return-void
.end method

.method public constructor <init>(La2/b;)V
    .locals 3

    .line 1
    new-instance v0, La2/a;

    new-instance v1, Lz1/c$b;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Lz1/c$b;-><init>(Lz1/c$a;)V

    invoke-direct {v0, v1}, La2/a;-><init>(La2/c$b;)V

    invoke-direct {p0, v0}, Lz1/b;-><init>(La2/a;)V

    .line 2
    invoke-virtual {p1, p0}, La2/b;->g(La2/b$a;)V

    .line 3
    invoke-virtual {p0, p1}, Lz1/b;->v(La2/a$a;)V

    return-void
.end method


# virtual methods
.method public final b(Lcom/liulishuo/okdownload/a;Lcom/liulishuo/okdownload/core/cause/EndCause;Ljava/lang/Exception;La2/a$c;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final f(Lcom/liulishuo/okdownload/a;Ls1/c;ZLa2/a$c;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final n(Lcom/liulishuo/okdownload/a;IJ)V
    .locals 0

    .line 1
    return-void
.end method

.method public final q(Lcom/liulishuo/okdownload/a;J)V
    .locals 0

    .line 1
    return-void
.end method

.method public final t(Lcom/liulishuo/okdownload/a;ILs1/a;)V
    .locals 0

    .line 1
    return-void
.end method
