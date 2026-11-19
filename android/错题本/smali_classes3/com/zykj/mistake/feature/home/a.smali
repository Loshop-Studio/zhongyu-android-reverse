.class public final synthetic Lcom/zykj/mistake/feature/home/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr6/e;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Z

.field public final synthetic d:Z

.field public final synthetic e:Lr6/a;

.field public final synthetic f:Landroidx/compose/ui/Modifier;

.field public final synthetic g:I


# direct methods
.method public synthetic constructor <init>(ILjava/lang/String;ZZLr6/a;Landroidx/compose/ui/Modifier;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/zykj/mistake/feature/home/a;->a:I

    iput-object p2, p0, Lcom/zykj/mistake/feature/home/a;->b:Ljava/lang/String;

    iput-boolean p3, p0, Lcom/zykj/mistake/feature/home/a;->c:Z

    iput-boolean p4, p0, Lcom/zykj/mistake/feature/home/a;->d:Z

    iput-object p5, p0, Lcom/zykj/mistake/feature/home/a;->e:Lr6/a;

    iput-object p6, p0, Lcom/zykj/mistake/feature/home/a;->f:Landroidx/compose/ui/Modifier;

    iput p7, p0, Lcom/zykj/mistake/feature/home/a;->g:I

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
    iget p1, p0, Lcom/zykj/mistake/feature/home/a;->g:I

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
    iget v0, p0, Lcom/zykj/mistake/feature/home/a;->a:I

    .line 18
    .line 19
    iget-object v1, p0, Lcom/zykj/mistake/feature/home/a;->b:Ljava/lang/String;

    .line 20
    .line 21
    iget-boolean v2, p0, Lcom/zykj/mistake/feature/home/a;->c:Z

    .line 22
    .line 23
    iget-boolean v3, p0, Lcom/zykj/mistake/feature/home/a;->d:Z

    .line 24
    .line 25
    iget-object v4, p0, Lcom/zykj/mistake/feature/home/a;->e:Lr6/a;

    .line 26
    .line 27
    iget-object v5, p0, Lcom/zykj/mistake/feature/home/a;->f:Landroidx/compose/ui/Modifier;

    .line 28
    .line 29
    invoke-static/range {v0 .. v7}, Lcom/zykj/mistake/feature/home/b;->b(ILjava/lang/String;ZZLr6/a;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    .line 30
    .line 31
    .line 32
    sget-object p1, Ld6/s;->a:Ld6/s;

    .line 33
    .line 34
    return-object p1
.end method
