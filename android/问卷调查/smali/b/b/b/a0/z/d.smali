.class public final Lb/b/b/a0/z/d;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lb/b/b/y;


# instance fields
.field public final b:Lb/b/b/a0/g;


# direct methods
.method public constructor <init>(Lb/b/b/a0/g;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb/b/b/a0/z/d;->b:Lb/b/b/a0/g;

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
    iget-object v0, p2, Lb/b/b/b0/a;->a:Ljava/lang/Class;

    .line 2
    const-class v1, Lb/b/b/z/a;

    invoke-virtual {v0, v1}, Ljava/lang/Class;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object v0

    check-cast v0, Lb/b/b/z/a;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    iget-object v1, p0, Lb/b/b/a0/z/d;->b:Lb/b/b/a0/g;

    invoke-virtual {p0, v1, p1, p2, v0}, Lb/b/b/a0/z/d;->b(Lb/b/b/a0/g;Lb/b/b/i;Lb/b/b/b0/a;Lb/b/b/z/a;)Lb/b/b/x;

    move-result-object p1

    return-object p1
.end method

.method public b(Lb/b/b/a0/g;Lb/b/b/i;Lb/b/b/b0/a;Lb/b/b/z/a;)Lb/b/b/x;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lb/b/b/a0/g;",
            "Lb/b/b/i;",
            "Lb/b/b/b0/a<",
            "*>;",
            "Lb/b/b/z/a;",
            ")",
            "Lb/b/b/x<",
            "*>;"
        }
    .end annotation

    invoke-interface {p4}, Lb/b/b/z/a;->value()Ljava/lang/Class;

    move-result-object v0

    .line 1
    new-instance v1, Lb/b/b/b0/a;

    invoke-direct {v1, v0}, Lb/b/b/b0/a;-><init>(Ljava/lang/reflect/Type;)V

    .line 2
    invoke-virtual {p1, v1}, Lb/b/b/a0/g;->a(Lb/b/b/b0/a;)Lb/b/b/a0/t;

    move-result-object p1

    invoke-interface {p1}, Lb/b/b/a0/t;->a()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Lb/b/b/x;

    if-eqz v0, :cond_0

    check-cast p1, Lb/b/b/x;

    goto :goto_2

    :cond_0
    instance-of v0, p1, Lb/b/b/y;

    if-eqz v0, :cond_1

    check-cast p1, Lb/b/b/y;

    invoke-interface {p1, p2, p3}, Lb/b/b/y;->a(Lb/b/b/i;Lb/b/b/b0/a;)Lb/b/b/x;

    move-result-object p1

    goto :goto_2

    :cond_1
    instance-of v0, p1, Lb/b/b/u;

    if-nez v0, :cond_3

    instance-of v1, p1, Lb/b/b/m;

    if-eqz v1, :cond_2

    goto :goto_0

    :cond_2
    new-instance p2, Ljava/lang/IllegalArgumentException;

    const-string p4, "Invalid attempt to bind an instance of "

    invoke-static {p4}, Lb/a/a/a/a;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p4

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " as a @JsonAdapter for "

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Lb/b/b/b0/a;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer."

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_3
    :goto_0
    const/4 v1, 0x0

    if-eqz v0, :cond_4

    move-object v0, p1

    check-cast v0, Lb/b/b/u;

    move-object v3, v0

    goto :goto_1

    :cond_4
    move-object v3, v1

    :goto_1
    instance-of v0, p1, Lb/b/b/m;

    if-eqz v0, :cond_5

    move-object v1, p1

    check-cast v1, Lb/b/b/m;

    :cond_5
    move-object v4, v1

    new-instance p1, Lb/b/b/a0/z/m;

    const/4 v7, 0x0

    move-object v2, p1

    move-object v5, p2

    move-object v6, p3

    invoke-direct/range {v2 .. v7}, Lb/b/b/a0/z/m;-><init>(Lb/b/b/u;Lb/b/b/m;Lb/b/b/i;Lb/b/b/b0/a;Lb/b/b/y;)V

    :goto_2
    if-eqz p1, :cond_6

    invoke-interface {p4}, Lb/b/b/z/a;->nullSafe()Z

    move-result p2

    if-eqz p2, :cond_6

    .line 3
    new-instance p2, Lb/b/b/w;

    invoke-direct {p2, p1}, Lb/b/b/w;-><init>(Lb/b/b/x;)V

    move-object p1, p2

    :cond_6
    return-object p1
.end method
