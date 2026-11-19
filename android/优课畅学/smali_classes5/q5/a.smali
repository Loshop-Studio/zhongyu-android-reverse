.class public final Lq5/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Lx7/a;

.field public b:Lx7/a;

.field public c:Lx7/a;

.field public d:Lx7/l;


# direct methods
.method public constructor <init>(Lx7/a;Lx7/a;Lx7/a;Lx7/l;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lq5/a;->a:Lx7/a;

    .line 3
    iput-object p2, p0, Lq5/a;->b:Lx7/a;

    .line 4
    iput-object p3, p0, Lq5/a;->c:Lx7/a;

    .line 5
    iput-object p4, p0, Lq5/a;->d:Lx7/l;

    return-void
.end method

.method public synthetic constructor <init>(Lx7/a;Lx7/a;Lx7/a;Lx7/l;ILkotlin/jvm/internal/n;)V
    .locals 1

    and-int/lit8 p6, p5, 0x1

    const/4 v0, 0x0

    if-eqz p6, :cond_0

    move-object p1, v0

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    move-object p2, v0

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    move-object p3, v0

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    move-object p4, v0

    .line 6
    :cond_3
    invoke-direct {p0, p1, p2, p3, p4}, Lq5/a;-><init>(Lx7/a;Lx7/a;Lx7/a;Lx7/l;)V

    return-void
.end method


# virtual methods
.method public final a()Lx7/a;
    .locals 1

    .line 1
    iget-object v0, p0, Lq5/a;->a:Lx7/a;

    .line 2
    .line 3
    return-object v0
.end method

.method public final b()Lx7/l;
    .locals 1

    .line 1
    iget-object v0, p0, Lq5/a;->d:Lx7/l;

    .line 2
    .line 3
    return-object v0
.end method

.method public final c()Lx7/a;
    .locals 1

    .line 1
    iget-object v0, p0, Lq5/a;->c:Lx7/a;

    .line 2
    .line 3
    return-object v0
.end method

.method public final d()Lx7/a;
    .locals 1

    .line 1
    iget-object v0, p0, Lq5/a;->b:Lx7/a;

    .line 2
    .line 3
    return-object v0
.end method
