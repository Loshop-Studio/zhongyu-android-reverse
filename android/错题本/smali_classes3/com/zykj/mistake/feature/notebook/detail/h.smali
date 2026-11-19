.class public final synthetic Lcom/zykj/mistake/feature/notebook/detail/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr6/e;


# instance fields
.field public final synthetic a:Ljava/util/List;

.field public final synthetic b:Lcom/zykj/mistake/feature/notebook/detail/p0;

.field public final synthetic c:Lcom/zykj/mistake/feature/notebook/detail/p0;

.field public final synthetic d:Lr6/c;

.field public final synthetic e:Landroidx/compose/ui/Modifier;

.field public final synthetic f:I


# direct methods
.method public synthetic constructor <init>(Ljava/util/List;Lcom/zykj/mistake/feature/notebook/detail/p0;Lcom/zykj/mistake/feature/notebook/detail/p0;Lr6/c;Landroidx/compose/ui/Modifier;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/zykj/mistake/feature/notebook/detail/h;->a:Ljava/util/List;

    iput-object p2, p0, Lcom/zykj/mistake/feature/notebook/detail/h;->b:Lcom/zykj/mistake/feature/notebook/detail/p0;

    iput-object p3, p0, Lcom/zykj/mistake/feature/notebook/detail/h;->c:Lcom/zykj/mistake/feature/notebook/detail/p0;

    iput-object p4, p0, Lcom/zykj/mistake/feature/notebook/detail/h;->d:Lr6/c;

    iput-object p5, p0, Lcom/zykj/mistake/feature/notebook/detail/h;->e:Landroidx/compose/ui/Modifier;

    iput p6, p0, Lcom/zykj/mistake/feature/notebook/detail/h;->f:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    move-object v5, p1

    .line 2
    check-cast v5, Landroidx/compose/runtime/Composer;

    .line 3
    .line 4
    check-cast p2, Ljava/lang/Integer;

    .line 5
    .line 6
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    iget p1, p0, Lcom/zykj/mistake/feature/notebook/detail/h;->f:I

    .line 10
    .line 11
    or-int/lit8 p1, p1, 0x1

    .line 12
    .line 13
    invoke-static {p1}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    .line 14
    .line 15
    .line 16
    move-result v6

    .line 17
    iget-object v0, p0, Lcom/zykj/mistake/feature/notebook/detail/h;->a:Ljava/util/List;

    .line 18
    .line 19
    iget-object v1, p0, Lcom/zykj/mistake/feature/notebook/detail/h;->b:Lcom/zykj/mistake/feature/notebook/detail/p0;

    .line 20
    .line 21
    iget-object v2, p0, Lcom/zykj/mistake/feature/notebook/detail/h;->c:Lcom/zykj/mistake/feature/notebook/detail/p0;

    .line 22
    .line 23
    iget-object v3, p0, Lcom/zykj/mistake/feature/notebook/detail/h;->d:Lr6/c;

    .line 24
    .line 25
    iget-object v4, p0, Lcom/zykj/mistake/feature/notebook/detail/h;->e:Landroidx/compose/ui/Modifier;

    .line 26
    .line 27
    invoke-static/range {v0 .. v6}, Lcom/zykj/mistake/feature/notebook/detail/t;->l(Ljava/util/List;Lcom/zykj/mistake/feature/notebook/detail/p0;Lcom/zykj/mistake/feature/notebook/detail/p0;Lr6/c;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    .line 28
    .line 29
    .line 30
    sget-object p1, Ld6/s;->a:Ld6/s;

    .line 31
    .line 32
    return-object p1
.end method
