.class public final synthetic Lcom/zykj/mistake/feature/notebook/detail/n4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr6/e;


# instance fields
.field public final synthetic a:Ljava/lang/String;

.field public final synthetic b:J

.field public final synthetic c:Lr6/a;

.field public final synthetic d:Landroidx/compose/ui/Modifier;

.field public final synthetic e:I


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;JLr6/a;Landroidx/compose/ui/Modifier;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/zykj/mistake/feature/notebook/detail/n4;->a:Ljava/lang/String;

    iput-wide p2, p0, Lcom/zykj/mistake/feature/notebook/detail/n4;->b:J

    iput-object p4, p0, Lcom/zykj/mistake/feature/notebook/detail/n4;->c:Lr6/a;

    iput-object p5, p0, Lcom/zykj/mistake/feature/notebook/detail/n4;->d:Landroidx/compose/ui/Modifier;

    iput p6, p0, Lcom/zykj/mistake/feature/notebook/detail/n4;->e:I

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
    iget p1, p0, Lcom/zykj/mistake/feature/notebook/detail/n4;->e:I

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
    iget-object v0, p0, Lcom/zykj/mistake/feature/notebook/detail/n4;->a:Ljava/lang/String;

    .line 18
    .line 19
    iget-wide v1, p0, Lcom/zykj/mistake/feature/notebook/detail/n4;->b:J

    .line 20
    .line 21
    iget-object v3, p0, Lcom/zykj/mistake/feature/notebook/detail/n4;->c:Lr6/a;

    .line 22
    .line 23
    iget-object v4, p0, Lcom/zykj/mistake/feature/notebook/detail/n4;->d:Landroidx/compose/ui/Modifier;

    .line 24
    .line 25
    invoke-static/range {v0 .. v6}, Lcom/zykj/mistake/feature/notebook/detail/q4;->c(Ljava/lang/String;JLr6/a;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    .line 26
    .line 27
    .line 28
    sget-object p1, Ld6/s;->a:Ld6/s;

    .line 29
    .line 30
    return-object p1
.end method
