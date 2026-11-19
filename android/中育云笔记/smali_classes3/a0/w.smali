.class public final La0/w;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:La0/w;

.field public static final b:Lqc/d;

.field public static final c:Lqc/d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, La0/w;

    .line 2
    .line 3
    invoke-direct {v0}, La0/w;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, La0/w;->a:La0/w;

    .line 7
    .line 8
    new-instance v0, La0/u;

    .line 9
    .line 10
    invoke-direct {v0}, La0/u;-><init>()V

    .line 11
    .line 12
    .line 13
    invoke-static {v0}, Lkotlin/a;->a(Lhd/a;)Lqc/d;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    sput-object v0, La0/w;->b:Lqc/d;

    .line 18
    .line 19
    new-instance v0, La0/v;

    .line 20
    .line 21
    invoke-direct {v0}, La0/v;-><init>()V

    .line 22
    .line 23
    .line 24
    invoke-static {v0}, Lkotlin/a;->a(Lhd/a;)Lqc/d;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    sput-object v0, La0/w;->c:Lqc/d;

    .line 29
    .line 30
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic a()Ljava/util/List;
    .locals 1

    .line 1
    invoke-static {}, La0/w;->d()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic b()Ljava/util/List;
    .locals 1

    .line 1
    invoke-static {}, La0/w;->c()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public static final c()Ljava/util/List;
    .locals 2

    .line 1
    const-class v0, La0/e;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-static {v0, v1}, Ljava/util/ServiceLoader;->load(Ljava/lang/Class;Ljava/lang/ClassLoader;)Ljava/util/ServiceLoader;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0}, Ljava/util/ServiceLoader;->iterator()Ljava/util/Iterator;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-static {v0}, Lpd/n;->e(Ljava/util/Iterator;)Lpd/g;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-static {v0}, Lpd/q;->F(Lpd/g;)Ljava/util/List;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-static {v0}, La0/b;->c(Ljava/util/List;)Ljava/util/List;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    return-object v0
.end method

.method public static final d()Ljava/util/List;
    .locals 2

    .line 1
    const-class v0, La0/h;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-static {v0, v1}, Ljava/util/ServiceLoader;->load(Ljava/lang/Class;Ljava/lang/ClassLoader;)Ljava/util/ServiceLoader;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0}, Ljava/util/ServiceLoader;->iterator()Ljava/util/Iterator;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-static {v0}, Lpd/n;->e(Ljava/util/Iterator;)Lpd/g;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-static {v0}, Lpd/q;->F(Lpd/g;)Ljava/util/List;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-static {v0}, La0/b;->c(Ljava/util/List;)Ljava/util/List;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    return-object v0
.end method


# virtual methods
.method public final e()Ljava/util/List;
    .locals 1

    .line 1
    sget-object v0, La0/w;->c:Lqc/d;

    .line 2
    .line 3
    invoke-interface {v0}, Lqc/d;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/util/List;

    .line 8
    .line 9
    return-object v0
.end method

.method public final f()Ljava/util/List;
    .locals 1

    .line 1
    sget-object v0, La0/w;->b:Lqc/d;

    .line 2
    .line 3
    invoke-interface {v0}, Lqc/d;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/util/List;

    .line 8
    .line 9
    return-object v0
.end method
