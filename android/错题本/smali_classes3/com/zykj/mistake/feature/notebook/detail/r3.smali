.class public final synthetic Lcom/zykj/mistake/feature/notebook/detail/r3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr6/e;


# instance fields
.field public final synthetic a:J

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:Ljava/lang/String;

.field public final synthetic e:Landroidx/compose/ui/Modifier;

.field public final synthetic f:I


# direct methods
.method public synthetic constructor <init>(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/Modifier;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lcom/zykj/mistake/feature/notebook/detail/r3;->a:J

    iput-object p3, p0, Lcom/zykj/mistake/feature/notebook/detail/r3;->b:Ljava/lang/String;

    iput-object p4, p0, Lcom/zykj/mistake/feature/notebook/detail/r3;->c:Ljava/lang/String;

    iput-object p5, p0, Lcom/zykj/mistake/feature/notebook/detail/r3;->d:Ljava/lang/String;

    iput-object p6, p0, Lcom/zykj/mistake/feature/notebook/detail/r3;->e:Landroidx/compose/ui/Modifier;

    iput p7, p0, Lcom/zykj/mistake/feature/notebook/detail/r3;->f:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    move-object v6, p1

    .line 2
    check-cast v6, Landroidx/compose/runtime/Composer;

    .line 3
    .line 4
    check-cast p2, Ljava/lang/Integer;

    .line 5
    .line 6
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    iget p1, p0, Lcom/zykj/mistake/feature/notebook/detail/r3;->f:I

    .line 10
    .line 11
    or-int/lit8 p1, p1, 0x1

    .line 12
    .line 13
    invoke-static {p1}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    .line 14
    .line 15
    .line 16
    move-result v7

    .line 17
    iget-wide v0, p0, Lcom/zykj/mistake/feature/notebook/detail/r3;->a:J

    .line 18
    .line 19
    iget-object v2, p0, Lcom/zykj/mistake/feature/notebook/detail/r3;->b:Ljava/lang/String;

    .line 20
    .line 21
    iget-object v3, p0, Lcom/zykj/mistake/feature/notebook/detail/r3;->c:Ljava/lang/String;

    .line 22
    .line 23
    iget-object v4, p0, Lcom/zykj/mistake/feature/notebook/detail/r3;->d:Ljava/lang/String;

    .line 24
    .line 25
    iget-object v5, p0, Lcom/zykj/mistake/feature/notebook/detail/r3;->e:Landroidx/compose/ui/Modifier;

    .line 26
    .line 27
    invoke-static/range {v0 .. v7}, Lcom/zykj/mistake/feature/notebook/detail/x3;->i(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    .line 28
    .line 29
    .line 30
    sget-object p1, Ld6/s;->a:Ld6/s;

    .line 31
    .line 32
    return-object p1
.end method
