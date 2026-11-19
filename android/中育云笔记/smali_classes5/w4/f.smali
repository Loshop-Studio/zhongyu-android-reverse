.class public Lw4/f;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lx4/d;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lx4/d;

    .line 5
    .line 6
    invoke-direct {v0}, Lx4/d;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lw4/f;->a:Lx4/d;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public a()Lw4/e;
    .locals 1

    .line 1
    iget-object v0, p0, Lw4/f;->a:Lx4/d;

    .line 2
    .line 3
    return-object v0
.end method

.method public b(Ljava/lang/Exception;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lw4/f;->a:Lx4/d;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lx4/d;->g(Ljava/lang/Exception;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public c(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lw4/f;->a:Lx4/d;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lx4/d;->h(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
