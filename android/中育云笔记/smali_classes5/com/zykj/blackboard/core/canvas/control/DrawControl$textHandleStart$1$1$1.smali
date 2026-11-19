.class final Lcom/zykj/blackboard/core/canvas/control/DrawControl$textHandleStart$1$1$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lhd/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/blackboard/core/canvas/control/DrawControl;->S(Lba/c;Lca/d;Landroid/graphics/Path;Landroid/graphics/Paint;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lhd/l;"
    }
.end annotation


# instance fields
.field public final synthetic c:Lca/d;


# direct methods
.method public constructor <init>(Lca/d;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl$textHandleStart$1$1$1;->c:Lca/d;

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final a(Lba/c;)Ljava/lang/Boolean;
    .locals 1

    .line 1
    const-string v0, "childGraph"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p1}, Lba/c;->getId()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    iget-object v0, p0, Lcom/zykj/blackboard/core/canvas/control/DrawControl$textHandleStart$1$1$1;->c:Lca/d;

    .line 11
    .line 12
    invoke-virtual {v0}, Lba/a;->getId()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lba/c;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/zykj/blackboard/core/canvas/control/DrawControl$textHandleStart$1$1$1;->a(Lba/c;)Ljava/lang/Boolean;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method
