.class public final Lb/b/b/a0/z/n;
.super Lb/b/b/x;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lb/b/b/x<",
        "TT;>;"
    }
.end annotation


# instance fields
.field public final a:Lb/b/b/i;

.field public final b:Lb/b/b/x;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lb/b/b/x<",
            "TT;>;"
        }
    .end annotation
.end field

.field public final c:Ljava/lang/reflect/Type;


# direct methods
.method public constructor <init>(Lb/b/b/i;Lb/b/b/x;Ljava/lang/reflect/Type;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lb/b/b/i;",
            "Lb/b/b/x<",
            "TT;>;",
            "Ljava/lang/reflect/Type;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Lb/b/b/x;-><init>()V

    iput-object p1, p0, Lb/b/b/a0/z/n;->a:Lb/b/b/i;

    iput-object p2, p0, Lb/b/b/a0/z/n;->b:Lb/b/b/x;

    iput-object p3, p0, Lb/b/b/a0/z/n;->c:Ljava/lang/reflect/Type;

    return-void
.end method


# virtual methods
.method public a(Lb/b/b/c0/a;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lb/b/b/c0/a;",
            ")TT;"
        }
    .end annotation

    iget-object v0, p0, Lb/b/b/a0/z/n;->b:Lb/b/b/x;

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

    iget-object v0, p0, Lb/b/b/a0/z/n;->b:Lb/b/b/x;

    iget-object v1, p0, Lb/b/b/a0/z/n;->c:Ljava/lang/reflect/Type;

    if-eqz p2, :cond_1

    .line 1
    const-class v2, Ljava/lang/Object;

    if-eq v1, v2, :cond_0

    instance-of v2, v1, Ljava/lang/reflect/TypeVariable;

    if-nez v2, :cond_0

    instance-of v2, v1, Ljava/lang/Class;

    if-eqz v2, :cond_1

    :cond_0
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    .line 2
    :cond_1
    iget-object v2, p0, Lb/b/b/a0/z/n;->c:Ljava/lang/reflect/Type;

    if-eq v1, v2, :cond_3

    iget-object v0, p0, Lb/b/b/a0/z/n;->a:Lb/b/b/i;

    .line 3
    new-instance v2, Lb/b/b/b0/a;

    invoke-direct {v2, v1}, Lb/b/b/b0/a;-><init>(Ljava/lang/reflect/Type;)V

    .line 4
    invoke-virtual {v0, v2}, Lb/b/b/i;->c(Lb/b/b/b0/a;)Lb/b/b/x;

    move-result-object v0

    instance-of v1, v0, Lb/b/b/a0/z/j$a;

    if-nez v1, :cond_2

    goto :goto_0

    :cond_2
    iget-object v1, p0, Lb/b/b/a0/z/n;->b:Lb/b/b/x;

    instance-of v2, v1, Lb/b/b/a0/z/j$a;

    if-nez v2, :cond_3

    move-object v0, v1

    :cond_3
    :goto_0
    invoke-virtual {v0, p1, p2}, Lb/b/b/x;->b(Lb/b/b/c0/c;Ljava/lang/Object;)V

    return-void
.end method
