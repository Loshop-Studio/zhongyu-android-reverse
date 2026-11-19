.class public abstract Lcom/zykj/evaluation/ui/home/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    const/4 v0, 0x4

    .line 2
    new-array v0, v0, [Lcom/zykj/evaluation/ui/home/a;

    .line 3
    .line 4
    sget-object v1, Lcom/zykj/evaluation/ui/home/a$d;->c:Lcom/zykj/evaluation/ui/home/a$d;

    .line 5
    .line 6
    const/4 v2, 0x0

    .line 7
    aput-object v1, v0, v2

    .line 8
    .line 9
    sget-object v1, Lcom/zykj/evaluation/ui/home/a$b;->c:Lcom/zykj/evaluation/ui/home/a$b;

    .line 10
    .line 11
    const/4 v2, 0x1

    .line 12
    aput-object v1, v0, v2

    .line 13
    .line 14
    sget-object v1, Lcom/zykj/evaluation/ui/home/a$a;->c:Lcom/zykj/evaluation/ui/home/a$a;

    .line 15
    .line 16
    const/4 v2, 0x2

    .line 17
    aput-object v1, v0, v2

    .line 18
    .line 19
    sget-object v1, Lcom/zykj/evaluation/ui/home/a$c;->c:Lcom/zykj/evaluation/ui/home/a$c;

    .line 20
    .line 21
    const/4 v2, 0x3

    .line 22
    aput-object v1, v0, v2

    .line 23
    .line 24
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    sput-object v0, Lcom/zykj/evaluation/ui/home/b;->a:Ljava/util/List;

    .line 29
    .line 30
    return-void
.end method

.method public static final a()Ljava/util/List;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/evaluation/ui/home/b;->a:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method
