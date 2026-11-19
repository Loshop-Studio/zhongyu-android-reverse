.class public final Lb/b/b/a0/z/h;
.super Lb/b/b/x;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lb/b/b/x<",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation


# static fields
.field public static final b:Lb/b/b/y;


# instance fields
.field public final a:Lb/b/b/i;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lb/b/b/a0/z/h$a;

    invoke-direct {v0}, Lb/b/b/a0/z/h$a;-><init>()V

    sput-object v0, Lb/b/b/a0/z/h;->b:Lb/b/b/y;

    return-void
.end method

.method public constructor <init>(Lb/b/b/i;)V
    .locals 0

    invoke-direct {p0}, Lb/b/b/x;-><init>()V

    iput-object p1, p0, Lb/b/b/a0/z/h;->a:Lb/b/b/i;

    return-void
.end method


# virtual methods
.method public a(Lb/b/b/c0/a;)Ljava/lang/Object;
    .locals 3

    invoke-virtual {p1}, Lb/b/b/c0/a;->v()Lb/b/b/c0/b;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    if-eqz v0, :cond_6

    const/4 v1, 0x2

    if-eq v0, v1, :cond_4

    const/4 v1, 0x5

    if-eq v0, v1, :cond_3

    const/4 v1, 0x6

    if-eq v0, v1, :cond_2

    const/4 v1, 0x7

    if-eq v0, v1, :cond_1

    const/16 v1, 0x8

    if-ne v0, v1, :cond_0

    invoke-virtual {p1}, Lb/b/b/c0/a;->r()V

    const/4 p1, 0x0

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1

    :cond_1
    invoke-virtual {p1}, Lb/b/b/c0/a;->l()Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :cond_2
    invoke-virtual {p1}, Lb/b/b/c0/a;->m()D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    return-object p1

    :cond_3
    invoke-virtual {p1}, Lb/b/b/c0/a;->t()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_4
    new-instance v0, Lb/b/b/a0/s;

    invoke-direct {v0}, Lb/b/b/a0/s;-><init>()V

    invoke-virtual {p1}, Lb/b/b/c0/a;->b()V

    :goto_0
    invoke-virtual {p1}, Lb/b/b/c0/a;->i()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-virtual {p1}, Lb/b/b/c0/a;->p()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, p1}, Lb/b/b/a0/z/h;->a(Lb/b/b/c0/a;)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lb/b/b/a0/s;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_5
    invoke-virtual {p1}, Lb/b/b/c0/a;->f()V

    return-object v0

    :cond_6
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p1}, Lb/b/b/c0/a;->a()V

    :goto_1
    invoke-virtual {p1}, Lb/b/b/c0/a;->i()Z

    move-result v1

    if-eqz v1, :cond_7

    invoke-virtual {p0, p1}, Lb/b/b/a0/z/h;->a(Lb/b/b/c0/a;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_7
    invoke-virtual {p1}, Lb/b/b/c0/a;->e()V

    return-object v0
.end method

.method public b(Lb/b/b/c0/c;Ljava/lang/Object;)V
    .locals 3

    if-nez p2, :cond_0

    invoke-virtual {p1}, Lb/b/b/c0/c;->h()Lb/b/b/c0/c;

    return-void

    :cond_0
    iget-object v0, p0, Lb/b/b/a0/z/h;->a:Lb/b/b/i;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    .line 1
    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    new-instance v2, Lb/b/b/b0/a;

    invoke-direct {v2, v1}, Lb/b/b/b0/a;-><init>(Ljava/lang/reflect/Type;)V

    .line 3
    invoke-virtual {v0, v2}, Lb/b/b/i;->c(Lb/b/b/b0/a;)Lb/b/b/x;

    move-result-object v0

    .line 4
    instance-of v1, v0, Lb/b/b/a0/z/h;

    if-eqz v1, :cond_1

    invoke-virtual {p1}, Lb/b/b/c0/c;->c()Lb/b/b/c0/c;

    invoke-virtual {p1}, Lb/b/b/c0/c;->f()Lb/b/b/c0/c;

    return-void

    :cond_1
    invoke-virtual {v0, p1, p2}, Lb/b/b/x;->b(Lb/b/b/c0/c;Ljava/lang/Object;)V

    return-void
.end method
