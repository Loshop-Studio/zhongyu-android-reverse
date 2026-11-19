.class public final Lt7/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lf8/g;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lt7/d$a;,
        Lt7/d$b;,
        Lt7/d$c;
    }
.end annotation


# instance fields
.field public final a:Ljava/io/File;

.field public final b:Lkotlin/io/FileWalkDirection;

.field public final c:Lx7/l;

.field public final d:Lx7/l;

.field public final e:Lx7/p;

.field public final f:I


# direct methods
.method public constructor <init>(Ljava/io/File;Lkotlin/io/FileWalkDirection;)V
    .locals 10

    const-string v0, "start"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "direction"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v8, 0x20

    const/4 v9, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    .line 10
    invoke-direct/range {v1 .. v9}, Lt7/d;-><init>(Ljava/io/File;Lkotlin/io/FileWalkDirection;Lx7/l;Lx7/l;Lx7/p;IILkotlin/jvm/internal/n;)V

    return-void
.end method

.method public constructor <init>(Ljava/io/File;Lkotlin/io/FileWalkDirection;Lx7/l;Lx7/l;Lx7/p;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lt7/d;->a:Ljava/io/File;

    .line 3
    iput-object p2, p0, Lt7/d;->b:Lkotlin/io/FileWalkDirection;

    .line 4
    iput-object p3, p0, Lt7/d;->c:Lx7/l;

    .line 5
    iput-object p4, p0, Lt7/d;->d:Lx7/l;

    .line 6
    iput-object p5, p0, Lt7/d;->e:Lx7/p;

    .line 7
    iput p6, p0, Lt7/d;->f:I

    return-void
.end method

.method public synthetic constructor <init>(Ljava/io/File;Lkotlin/io/FileWalkDirection;Lx7/l;Lx7/l;Lx7/p;IILkotlin/jvm/internal/n;)V
    .locals 7

    and-int/lit8 p8, p7, 0x2

    if-eqz p8, :cond_0

    .line 8
    sget-object p2, Lkotlin/io/FileWalkDirection;->a:Lkotlin/io/FileWalkDirection;

    :cond_0
    move-object v2, p2

    and-int/lit8 p2, p7, 0x20

    if-eqz p2, :cond_1

    const p6, 0x7fffffff

    :cond_1
    move-object v0, p0

    move-object v1, p1

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    move v6, p6

    .line 9
    invoke-direct/range {v0 .. v6}, Lt7/d;-><init>(Ljava/io/File;Lkotlin/io/FileWalkDirection;Lx7/l;Lx7/l;Lx7/p;I)V

    return-void
.end method

.method public static final synthetic c(Lt7/d;)Lkotlin/io/FileWalkDirection;
    .locals 0

    .line 1
    iget-object p0, p0, Lt7/d;->b:Lkotlin/io/FileWalkDirection;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic d(Lt7/d;)I
    .locals 0

    .line 1
    iget p0, p0, Lt7/d;->f:I

    .line 2
    .line 3
    return p0
.end method

.method public static final synthetic e(Lt7/d;)Lx7/l;
    .locals 0

    .line 1
    iget-object p0, p0, Lt7/d;->c:Lx7/l;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic f(Lt7/d;)Lx7/p;
    .locals 0

    .line 1
    iget-object p0, p0, Lt7/d;->e:Lx7/p;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic g(Lt7/d;)Lx7/l;
    .locals 0

    .line 1
    iget-object p0, p0, Lt7/d;->d:Lx7/l;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic h(Lt7/d;)Ljava/io/File;
    .locals 0

    .line 1
    iget-object p0, p0, Lt7/d;->a:Ljava/io/File;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public iterator()Ljava/util/Iterator;
    .locals 1

    .line 1
    new-instance v0, Lt7/d$b;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lt7/d$b;-><init>(Lt7/d;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method
