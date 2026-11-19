.class public Lb/b/b/a0/z/i;
.super Lb/b/b/a0/z/j$b;
.source ""


# instance fields
.field public final synthetic d:Ljava/lang/reflect/Field;

.field public final synthetic e:Z

.field public final synthetic f:Lb/b/b/x;

.field public final synthetic g:Lb/b/b/i;

.field public final synthetic h:Lb/b/b/b0/a;

.field public final synthetic i:Z


# direct methods
.method public constructor <init>(Lb/b/b/a0/z/j;Ljava/lang/String;ZZLjava/lang/reflect/Field;ZLb/b/b/x;Lb/b/b/i;Lb/b/b/b0/a;Z)V
    .locals 0

    iput-object p5, p0, Lb/b/b/a0/z/i;->d:Ljava/lang/reflect/Field;

    iput-boolean p6, p0, Lb/b/b/a0/z/i;->e:Z

    iput-object p7, p0, Lb/b/b/a0/z/i;->f:Lb/b/b/x;

    iput-object p8, p0, Lb/b/b/a0/z/i;->g:Lb/b/b/i;

    iput-object p9, p0, Lb/b/b/a0/z/i;->h:Lb/b/b/b0/a;

    iput-boolean p10, p0, Lb/b/b/a0/z/i;->i:Z

    invoke-direct {p0, p2, p3, p4}, Lb/b/b/a0/z/j$b;-><init>(Ljava/lang/String;ZZ)V

    return-void
.end method


# virtual methods
.method public a(Lb/b/b/c0/a;Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lb/b/b/a0/z/i;->f:Lb/b/b/x;

    invoke-virtual {v0, p1}, Lb/b/b/x;->a(Lb/b/b/c0/a;)Ljava/lang/Object;

    move-result-object p1

    if-nez p1, :cond_0

    iget-boolean v0, p0, Lb/b/b/a0/z/i;->i:Z

    if-nez v0, :cond_1

    :cond_0
    iget-object v0, p0, Lb/b/b/a0/z/i;->d:Ljava/lang/reflect/Field;

    invoke-virtual {v0, p2, p1}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_1
    return-void
.end method

.method public b(Lb/b/b/c0/c;Ljava/lang/Object;)V
    .locals 4

    iget-object v0, p0, Lb/b/b/a0/z/i;->d:Ljava/lang/reflect/Field;

    invoke-virtual {v0, p2}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    iget-boolean v0, p0, Lb/b/b/a0/z/i;->e:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lb/b/b/a0/z/i;->f:Lb/b/b/x;

    goto :goto_0

    :cond_0
    new-instance v0, Lb/b/b/a0/z/n;

    iget-object v1, p0, Lb/b/b/a0/z/i;->g:Lb/b/b/i;

    iget-object v2, p0, Lb/b/b/a0/z/i;->f:Lb/b/b/x;

    iget-object v3, p0, Lb/b/b/a0/z/i;->h:Lb/b/b/b0/a;

    .line 1
    iget-object v3, v3, Lb/b/b/b0/a;->b:Ljava/lang/reflect/Type;

    .line 2
    invoke-direct {v0, v1, v2, v3}, Lb/b/b/a0/z/n;-><init>(Lb/b/b/i;Lb/b/b/x;Ljava/lang/reflect/Type;)V

    :goto_0
    invoke-virtual {v0, p1, p2}, Lb/b/b/x;->b(Lb/b/b/c0/c;Ljava/lang/Object;)V

    return-void
.end method

.method public c(Ljava/lang/Object;)Z
    .locals 2

    iget-boolean v0, p0, Lb/b/b/a0/z/j$b;->b:Z

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    iget-object v0, p0, Lb/b/b/a0/z/i;->d:Ljava/lang/reflect/Field;

    invoke-virtual {v0, p1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eq v0, p1, :cond_1

    const/4 v1, 0x1

    :cond_1
    return v1
.end method
