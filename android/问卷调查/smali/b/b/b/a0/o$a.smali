.class public Lb/b/b/a0/o$a;
.super Lb/b/b/x;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lb/b/b/a0/o;->a(Lb/b/b/i;Lb/b/b/b0/a;)Lb/b/b/x;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lb/b/b/x<",
        "TT;>;"
    }
.end annotation


# instance fields
.field public a:Lb/b/b/x;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lb/b/b/x<",
            "TT;>;"
        }
    .end annotation
.end field

.field public final synthetic b:Z

.field public final synthetic c:Z

.field public final synthetic d:Lb/b/b/i;

.field public final synthetic e:Lb/b/b/b0/a;

.field public final synthetic f:Lb/b/b/a0/o;


# direct methods
.method public constructor <init>(Lb/b/b/a0/o;ZZLb/b/b/i;Lb/b/b/b0/a;)V
    .locals 0

    iput-object p1, p0, Lb/b/b/a0/o$a;->f:Lb/b/b/a0/o;

    iput-boolean p2, p0, Lb/b/b/a0/o$a;->b:Z

    iput-boolean p3, p0, Lb/b/b/a0/o$a;->c:Z

    iput-object p4, p0, Lb/b/b/a0/o$a;->d:Lb/b/b/i;

    iput-object p5, p0, Lb/b/b/a0/o$a;->e:Lb/b/b/b0/a;

    invoke-direct {p0}, Lb/b/b/x;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lb/b/b/c0/a;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lb/b/b/c0/a;",
            ")TT;"
        }
    .end annotation

    iget-boolean v0, p0, Lb/b/b/a0/o$a;->b:Z

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lb/b/b/c0/a;->A()V

    const/4 p1, 0x0

    return-object p1

    .line 1
    :cond_0
    iget-object v0, p0, Lb/b/b/a0/o$a;->a:Lb/b/b/x;

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lb/b/b/a0/o$a;->d:Lb/b/b/i;

    iget-object v1, p0, Lb/b/b/a0/o$a;->f:Lb/b/b/a0/o;

    iget-object v2, p0, Lb/b/b/a0/o$a;->e:Lb/b/b/b0/a;

    invoke-virtual {v0, v1, v2}, Lb/b/b/i;->d(Lb/b/b/y;Lb/b/b/b0/a;)Lb/b/b/x;

    move-result-object v0

    iput-object v0, p0, Lb/b/b/a0/o$a;->a:Lb/b/b/x;

    .line 2
    :goto_0
    invoke-virtual {v0, p1}, Lb/b/b/x;->a(Lb/b/b/c0/a;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public b(Lb/b/b/c0/c;Ljava/lang/Object;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lb/b/b/c0/c;",
            "TT;)V"
        }
    .end annotation

    iget-boolean v0, p0, Lb/b/b/a0/o$a;->c:Z

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lb/b/b/c0/c;->h()Lb/b/b/c0/c;

    return-void

    .line 1
    :cond_0
    iget-object v0, p0, Lb/b/b/a0/o$a;->a:Lb/b/b/x;

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lb/b/b/a0/o$a;->d:Lb/b/b/i;

    iget-object v1, p0, Lb/b/b/a0/o$a;->f:Lb/b/b/a0/o;

    iget-object v2, p0, Lb/b/b/a0/o$a;->e:Lb/b/b/b0/a;

    invoke-virtual {v0, v1, v2}, Lb/b/b/i;->d(Lb/b/b/y;Lb/b/b/b0/a;)Lb/b/b/x;

    move-result-object v0

    iput-object v0, p0, Lb/b/b/a0/o$a;->a:Lb/b/b/x;

    .line 2
    :goto_0
    invoke-virtual {v0, p1, p2}, Lb/b/b/x;->b(Lb/b/b/c0/c;Ljava/lang/Object;)V

    return-void
.end method
