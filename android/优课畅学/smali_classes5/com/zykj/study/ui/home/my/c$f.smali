.class public final Lcom/zykj/study/ui/home/my/c$f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/study/ui/home/my/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "f"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/n;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/zykj/study/ui/home/my/c$f;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(III)Landroidx/navigation/NavDirections;
    .locals 1

    .line 1
    new-instance v0, Lcom/zykj/study/ui/home/my/c$a;

    .line 2
    .line 3
    invoke-direct {v0, p1, p2, p3}, Lcom/zykj/study/ui/home/my/c$a;-><init>(III)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public final b(IIIIZ)Landroidx/navigation/NavDirections;
    .locals 6

    .line 1
    new-instance v0, Lcom/zykj/study/ui/home/my/c$b;

    .line 2
    .line 3
    move v1, p1

    .line 4
    move v2, p2

    .line 5
    move v3, p3

    .line 6
    move v4, p4

    .line 7
    move v5, p5

    .line 8
    invoke-direct/range {v0 .. v5}, Lcom/zykj/study/ui/home/my/c$b;-><init>(IIIIZ)V

    .line 9
    .line 10
    .line 11
    return-object v0
.end method

.method public final c(Ljava/lang/String;)Landroidx/navigation/NavDirections;
    .locals 1

    .line 1
    const-string v0, "path"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lcom/zykj/study/ui/home/my/c$c;

    .line 7
    .line 8
    invoke-direct {v0, p1}, Lcom/zykj/study/ui/home/my/c$c;-><init>(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    return-object v0
.end method

.method public final d(IIII)Landroidx/navigation/NavDirections;
    .locals 1

    .line 1
    new-instance v0, Lcom/zykj/study/ui/home/my/c$d;

    .line 2
    .line 3
    invoke-direct {v0, p1, p2, p3, p4}, Lcom/zykj/study/ui/home/my/c$d;-><init>(IIII)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public final e(Ljava/lang/String;)Landroidx/navigation/NavDirections;
    .locals 1

    .line 1
    const-string v0, "path"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lcom/zykj/study/ui/home/my/c$e;

    .line 7
    .line 8
    invoke-direct {v0, p1}, Lcom/zykj/study/ui/home/my/c$e;-><init>(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    return-object v0
.end method
