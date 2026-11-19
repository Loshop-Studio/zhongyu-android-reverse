.class public Ltop/zibin/luban/b$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ltop/zibin/luban/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field public a:Landroid/content/Context;

.field public b:Ljava/lang/String;

.field public c:I

.field public d:Ljava/util/List;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/16 v0, 0x64

    .line 5
    .line 6
    iput v0, p0, Ltop/zibin/luban/b$a;->c:I

    .line 7
    .line 8
    iput-object p1, p0, Ltop/zibin/luban/b$a;->a:Landroid/content/Context;

    .line 9
    .line 10
    new-instance p1, Ljava/util/ArrayList;

    .line 11
    .line 12
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 13
    .line 14
    .line 15
    iput-object p1, p0, Ltop/zibin/luban/b$a;->d:Ljava/util/List;

    .line 16
    .line 17
    return-void
.end method

.method public static synthetic a(Ltop/zibin/luban/b$a;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Ltop/zibin/luban/b$a;->b:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic b(Ltop/zibin/luban/b$a;)Lga/e;
    .locals 0

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 p0, 0x0

    .line 5
    return-object p0
.end method

.method public static synthetic c(Ltop/zibin/luban/b$a;)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Ltop/zibin/luban/b$a;->d:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic d(Ltop/zibin/luban/b$a;)Lga/d;
    .locals 0

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 p0, 0x0

    .line 5
    return-object p0
.end method

.method public static synthetic e(Ltop/zibin/luban/b$a;)I
    .locals 0

    .line 1
    iget p0, p0, Ltop/zibin/luban/b$a;->c:I

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic f(Ltop/zibin/luban/b$a;)Lga/a;
    .locals 0

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 p0, 0x0

    .line 5
    return-object p0
.end method


# virtual methods
.method public final g()Ltop/zibin/luban/b;
    .locals 2

    .line 1
    new-instance v0, Ltop/zibin/luban/b;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, v1}, Ltop/zibin/luban/b;-><init>(Ltop/zibin/luban/b$a;Lga/c;)V

    .line 5
    .line 6
    .line 7
    return-object v0
.end method

.method public h()Ljava/util/List;
    .locals 2

    .line 1
    invoke-virtual {p0}, Ltop/zibin/luban/b$a;->g()Ltop/zibin/luban/b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Ltop/zibin/luban/b$a;->a:Landroid/content/Context;

    .line 6
    .line 7
    invoke-static {v0, v1}, Ltop/zibin/luban/b;->a(Ltop/zibin/luban/b;Landroid/content/Context;)Ljava/util/List;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0
.end method

.method public i(I)Ltop/zibin/luban/b$a;
    .locals 0

    .line 1
    iput p1, p0, Ltop/zibin/luban/b$a;->c:I

    .line 2
    .line 3
    return-object p0
.end method

.method public j(Ljava/io/File;)Ltop/zibin/luban/b$a;
    .locals 2

    .line 1
    iget-object v0, p0, Ltop/zibin/luban/b$a;->d:Ljava/util/List;

    .line 2
    .line 3
    new-instance v1, Ltop/zibin/luban/b$a$a;

    .line 4
    .line 5
    invoke-direct {v1, p0, p1}, Ltop/zibin/luban/b$a$a;-><init>(Ltop/zibin/luban/b$a;Ljava/io/File;)V

    .line 6
    .line 7
    .line 8
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    return-object p0
.end method

.method public k(Ljava/lang/String;)Ltop/zibin/luban/b$a;
    .locals 2

    .line 1
    iget-object v0, p0, Ltop/zibin/luban/b$a;->d:Ljava/util/List;

    .line 2
    .line 3
    new-instance v1, Ltop/zibin/luban/b$a$b;

    .line 4
    .line 5
    invoke-direct {v1, p0, p1}, Ltop/zibin/luban/b$a$b;-><init>(Ltop/zibin/luban/b$a;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    return-object p0
.end method
