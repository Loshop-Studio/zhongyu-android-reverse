.class public Lr5/y0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Z

.field public b:Z

.field public c:Ljava/lang/String;

.field public d:Ljava/lang/String;

.field public e:Ljava/lang/String;

.field public f:Ljava/lang/String;

.field public g:Lr5/c0;

.field public h:Ljava/lang/String;

.field public i:Ljava/util/Map;

.field public j:Ljava/lang/String;

.field public k:I

.field public l:I

.field public m:Z

.field public n:Z

.field public o:Z

.field public p:Ljava/lang/String;

.field public q:J


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, ""

    iput-object v0, p0, Lr5/y0;->e:Ljava/lang/String;

    iput-object v0, p0, Lr5/y0;->f:Ljava/lang/String;

    new-instance v1, Lr5/c0;

    invoke-direct {v1}, Lr5/c0;-><init>()V

    iput-object v1, p0, Lr5/y0;->g:Lr5/c0;

    iput-object v0, p0, Lr5/y0;->h:Ljava/lang/String;

    iput-object v0, p0, Lr5/y0;->j:Ljava/lang/String;

    const/16 v0, 0xa

    iput v0, p0, Lr5/y0;->k:I

    const/4 v0, 0x7

    iput v0, p0, Lr5/y0;->l:I

    const/4 v0, 0x1

    iput-boolean v0, p0, Lr5/y0;->m:Z

    iput-boolean v0, p0, Lr5/y0;->n:Z

    const/4 v0, 0x0

    iput-boolean v0, p0, Lr5/y0;->o:Z

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lr5/y0;->q:J

    return-void
.end method

.method public constructor <init>(Lr5/y0;)V
    .locals 2

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, ""

    iput-object v0, p0, Lr5/y0;->e:Ljava/lang/String;

    iput-object v0, p0, Lr5/y0;->f:Ljava/lang/String;

    new-instance v1, Lr5/c0;

    invoke-direct {v1}, Lr5/c0;-><init>()V

    iput-object v1, p0, Lr5/y0;->g:Lr5/c0;

    iput-object v0, p0, Lr5/y0;->h:Ljava/lang/String;

    iput-object v0, p0, Lr5/y0;->j:Ljava/lang/String;

    const/16 v0, 0xa

    iput v0, p0, Lr5/y0;->k:I

    const/4 v0, 0x7

    iput v0, p0, Lr5/y0;->l:I

    const/4 v0, 0x1

    iput-boolean v0, p0, Lr5/y0;->m:Z

    iput-boolean v0, p0, Lr5/y0;->n:Z

    const/4 v0, 0x0

    iput-boolean v0, p0, Lr5/y0;->o:Z

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lr5/y0;->q:J

    iget-object v0, p1, Lr5/y0;->g:Lr5/c0;

    iput-object v0, p0, Lr5/y0;->g:Lr5/c0;

    iget-boolean v0, p1, Lr5/y0;->a:Z

    invoke-virtual {p0, v0}, Lr5/y0;->j(Z)V

    iget-object v0, p1, Lr5/y0;->c:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lr5/y0;->c(Ljava/lang/String;)V

    iget-object v0, p1, Lr5/y0;->d:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lr5/y0;->i(Ljava/lang/String;)V

    iget-object v0, p1, Lr5/y0;->e:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lr5/y0;->q(Ljava/lang/String;)V

    iget-object v0, p1, Lr5/y0;->f:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lr5/y0;->v(Ljava/lang/String;)V

    iget-object v0, p1, Lr5/y0;->h:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lr5/y0;->o(Ljava/lang/String;)V

    iget-object v0, p1, Lr5/y0;->j:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lr5/y0;->u(Ljava/lang/String;)V

    iget-boolean v0, p1, Lr5/y0;->b:Z

    invoke-virtual {p0, v0}, Lr5/y0;->l(Z)V

    iget v0, p1, Lr5/y0;->k:I

    invoke-virtual {p0, v0}, Lr5/y0;->a(I)V

    iget v0, p1, Lr5/y0;->l:I

    invoke-virtual {p0, v0}, Lr5/y0;->h(I)V

    iget-boolean v0, p1, Lr5/y0;->m:Z

    invoke-virtual {p0, v0}, Lr5/y0;->p(Z)V

    iget-boolean v0, p1, Lr5/y0;->n:Z

    invoke-virtual {p0, v0}, Lr5/y0;->e(Z)V

    iget-boolean v0, p1, Lr5/y0;->o:Z

    invoke-virtual {p0, v0}, Lr5/y0;->r(Z)V

    iget-object v0, p1, Lr5/y0;->i:Ljava/util/Map;

    invoke-virtual {p0, v0}, Lr5/y0;->d(Ljava/util/Map;)V

    iget-object v0, p1, Lr5/y0;->p:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lr5/y0;->k(Ljava/lang/String;)V

    iget-wide v0, p1, Lr5/y0;->q:J

    invoke-virtual {p0, v0, v1}, Lr5/y0;->b(J)V

    return-void
.end method


# virtual methods
.method public A()Ljava/util/Map;
    .locals 1

    .line 1
    iget-object v0, p0, Lr5/y0;->i:Ljava/util/Map;

    .line 2
    .line 3
    return-object v0
.end method

.method public B()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lr5/y0;->q:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public C()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lr5/y0;->p:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public D()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lr5/y0;->h:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public E()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lr5/y0;->e:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public F()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lr5/y0;->j:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public G()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lr5/y0;->f:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public a(I)V
    .locals 0

    .line 1
    iput p1, p0, Lr5/y0;->k:I

    .line 2
    .line 3
    return-void
.end method

.method public b(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lr5/y0;->q:J

    .line 2
    .line 3
    return-void
.end method

.method public c(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lr5/y0;->c:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public d(Ljava/util/Map;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lr5/y0;->i:Ljava/util/Map;

    .line 2
    .line 3
    return-void
.end method

.method public e(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lr5/y0;->n:Z

    .line 2
    .line 3
    return-void
.end method

.method public f()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lr5/y0;->n:Z

    .line 2
    .line 3
    return v0
.end method

.method public g()I
    .locals 1

    .line 1
    iget v0, p0, Lr5/y0;->k:I

    .line 2
    .line 3
    return v0
.end method

.method public h(I)V
    .locals 0

    .line 1
    iput p1, p0, Lr5/y0;->l:I

    .line 2
    .line 3
    return-void
.end method

.method public i(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lr5/y0;->d:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public j(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lr5/y0;->a:Z

    .line 2
    .line 3
    return-void
.end method

.method public k(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lr5/y0;->p:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public l(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lr5/y0;->b:Z

    .line 2
    .line 3
    return-void
.end method

.method public m()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lr5/y0;->a:Z

    .line 2
    .line 3
    return v0
.end method

.method public n()I
    .locals 1

    .line 1
    iget v0, p0, Lr5/y0;->l:I

    .line 2
    .line 3
    return v0
.end method

.method public o(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lr5/y0;->h:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public p(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lr5/y0;->m:Z

    .line 2
    .line 3
    return-void
.end method

.method public q(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lr5/y0;->e:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public r(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lr5/y0;->o:Z

    .line 2
    .line 3
    return-void
.end method

.method public s()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lr5/y0;->b:Z

    .line 2
    .line 3
    return v0
.end method

.method public t()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lr5/y0;->c:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public u(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lr5/y0;->j:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public v(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lr5/y0;->f:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public w()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lr5/y0;->m:Z

    .line 2
    .line 3
    return v0
.end method

.method public x()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lr5/y0;->d:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public y()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lr5/y0;->o:Z

    .line 2
    .line 3
    return v0
.end method

.method public z()Lr5/c0;
    .locals 1

    .line 1
    iget-object v0, p0, Lr5/y0;->g:Lr5/c0;

    .line 2
    .line 3
    return-object v0
.end method
