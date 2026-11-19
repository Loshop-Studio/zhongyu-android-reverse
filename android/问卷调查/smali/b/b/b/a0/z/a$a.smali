.class public Lb/b/b/a0/z/a$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lb/b/b/y;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lb/b/b/a0/z/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lb/b/b/i;Lb/b/b/b0/a;)Lb/b/b/x;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lb/b/b/i;",
            "Lb/b/b/b0/a<",
            "TT;>;)",
            "Lb/b/b/x<",
            "TT;>;"
        }
    .end annotation

    .line 1
    iget-object p2, p2, Lb/b/b/b0/a;->b:Ljava/lang/reflect/Type;

    .line 2
    instance-of v0, p2, Ljava/lang/reflect/GenericArrayType;

    if-nez v0, :cond_1

    instance-of v1, p2, Ljava/lang/Class;

    if-eqz v1, :cond_0

    move-object v1, p2

    check-cast v1, Ljava/lang/Class;

    invoke-virtual {v1}, Ljava/lang/Class;->isArray()Z

    move-result v1

    if-nez v1, :cond_1

    :cond_0
    const/4 p1, 0x0

    return-object p1

    :cond_1
    if-eqz v0, :cond_2

    .line 3
    check-cast p2, Ljava/lang/reflect/GenericArrayType;

    invoke-interface {p2}, Ljava/lang/reflect/GenericArrayType;->getGenericComponentType()Ljava/lang/reflect/Type;

    move-result-object p2

    goto :goto_0

    :cond_2
    check-cast p2, Ljava/lang/Class;

    invoke-virtual {p2}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    move-result-object p2

    .line 4
    :goto_0
    new-instance v0, Lb/b/b/b0/a;

    invoke-direct {v0, p2}, Lb/b/b/b0/a;-><init>(Ljava/lang/reflect/Type;)V

    .line 5
    invoke-virtual {p1, v0}, Lb/b/b/i;->c(Lb/b/b/b0/a;)Lb/b/b/x;

    move-result-object v0

    new-instance v1, Lb/b/b/a0/z/a;

    invoke-static {p2}, Lb/b/b/a0/a;->e(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    move-result-object p2

    invoke-direct {v1, p1, v0, p2}, Lb/b/b/a0/z/a;-><init>(Lb/b/b/i;Lb/b/b/x;Ljava/lang/Class;)V

    return-object v1
.end method
