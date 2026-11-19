.class public Lb/b/b/a0/z/s;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lb/b/b/y;


# instance fields
.field public final synthetic b:Ljava/lang/Class;

.field public final synthetic c:Lb/b/b/x;


# direct methods
.method public constructor <init>(Ljava/lang/Class;Lb/b/b/x;)V
    .locals 0

    iput-object p1, p0, Lb/b/b/a0/z/s;->b:Ljava/lang/Class;

    iput-object p2, p0, Lb/b/b/a0/z/s;->c:Lb/b/b/x;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lb/b/b/i;Lb/b/b/b0/a;)Lb/b/b/x;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T2:",
            "Ljava/lang/Object;",
            ">(",
            "Lb/b/b/i;",
            "Lb/b/b/b0/a<",
            "TT2;>;)",
            "Lb/b/b/x<",
            "TT2;>;"
        }
    .end annotation

    .line 1
    iget-object p1, p2, Lb/b/b/b0/a;->a:Ljava/lang/Class;

    .line 2
    iget-object p2, p0, Lb/b/b/a0/z/s;->b:Ljava/lang/Class;

    invoke-virtual {p2, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result p2

    if-nez p2, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    new-instance p2, Lb/b/b/a0/z/s$a;

    invoke-direct {p2, p0, p1}, Lb/b/b/a0/z/s$a;-><init>(Lb/b/b/a0/z/s;Ljava/lang/Class;)V

    return-object p2
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    const-string v0, "Factory[typeHierarchy="

    invoke-static {v0}, Lb/a/a/a/a;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lb/b/b/a0/z/s;->b:Ljava/lang/Class;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ",adapter="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lb/b/b/a0/z/s;->c:Lb/b/b/x;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
