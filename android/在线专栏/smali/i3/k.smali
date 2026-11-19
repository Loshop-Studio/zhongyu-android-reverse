.class final Li3/k;
.super Lj3/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lj3/c<",
        "Li3/i<",
        "*>;>;"
    }
.end annotation


# instance fields
.field public a:J

.field public b:Lq2/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lq2/d<",
            "-",
            "Lo2/r;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Lj3/c;-><init>()V

    const-wide/16 v0, -0x1

    .line 2
    iput-wide v0, p0, Li3/k;->a:J

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)Z
    .locals 0

    check-cast p1, Li3/i;

    invoke-virtual {p0, p1}, Li3/k;->c(Li3/i;)Z

    move-result p1

    return p1
.end method

.method public bridge synthetic b(Ljava/lang/Object;)[Lq2/d;
    .locals 0

    check-cast p1, Li3/i;

    invoke-virtual {p0, p1}, Li3/k;->d(Li3/i;)[Lq2/d;

    move-result-object p1

    return-object p1
.end method

.method public c(Li3/i;)Z
    .locals 5
    .param p1    # Li3/i;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Li3/i<",
            "*>;)Z"
        }
    .end annotation

    .line 1
    iget-wide v0, p0, Li3/k;->a:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-ltz v4, :cond_0

    const/4 p1, 0x0

    return p1

    .line 2
    :cond_0
    invoke-virtual {p1}, Li3/i;->T()J

    move-result-wide v0

    iput-wide v0, p0, Li3/k;->a:J

    const/4 p1, 0x1

    return p1
.end method

.method public d(Li3/i;)[Lq2/d;
    .locals 4
    .param p1    # Li3/i;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Li3/i<",
            "*>;)[",
            "Lq2/d<",
            "Lo2/r;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-wide v0, p0, Li3/k;->a:J

    const-wide/16 v2, -0x1

    .line 2
    iput-wide v2, p0, Li3/k;->a:J

    const/4 v2, 0x0

    .line 3
    iput-object v2, p0, Li3/k;->b:Lq2/d;

    .line 4
    invoke-virtual {p1, v0, v1}, Li3/i;->S(J)[Lq2/d;

    move-result-object p1

    return-object p1
.end method
