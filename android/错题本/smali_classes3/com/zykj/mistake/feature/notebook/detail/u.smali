.class public final synthetic Lcom/zykj/mistake/feature/notebook/detail/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr6/e;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lcom/zykj/mistake/feature/notebook/detail/m3;

.field public final synthetic c:Lcom/zykj/mistake/feature/notebook/detail/a5;

.field public final synthetic d:Z

.field public final synthetic e:Z

.field public final synthetic f:Lr6/e;

.field public final synthetic g:Landroidx/compose/ui/Modifier;

.field public final synthetic h:I


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/mistake/feature/notebook/detail/m3;Lcom/zykj/mistake/feature/notebook/detail/a5;ZZLr6/e;Landroidx/compose/ui/Modifier;II)V
    .locals 0

    .line 1
    iput p8, p0, Lcom/zykj/mistake/feature/notebook/detail/u;->a:I

    iput-object p1, p0, Lcom/zykj/mistake/feature/notebook/detail/u;->b:Lcom/zykj/mistake/feature/notebook/detail/m3;

    iput-object p2, p0, Lcom/zykj/mistake/feature/notebook/detail/u;->c:Lcom/zykj/mistake/feature/notebook/detail/a5;

    iput-boolean p3, p0, Lcom/zykj/mistake/feature/notebook/detail/u;->d:Z

    iput-boolean p4, p0, Lcom/zykj/mistake/feature/notebook/detail/u;->e:Z

    iput-object p5, p0, Lcom/zykj/mistake/feature/notebook/detail/u;->f:Lr6/e;

    iput-object p6, p0, Lcom/zykj/mistake/feature/notebook/detail/u;->g:Landroidx/compose/ui/Modifier;

    iput p7, p0, Lcom/zykj/mistake/feature/notebook/detail/u;->h:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget v0, p0, Lcom/zykj/mistake/feature/notebook/detail/u;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    move-object v7, p1

    .line 7
    check-cast v7, Landroidx/compose/runtime/Composer;

    .line 8
    .line 9
    check-cast p2, Ljava/lang/Integer;

    .line 10
    .line 11
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    iget p1, p0, Lcom/zykj/mistake/feature/notebook/detail/u;->h:I

    .line 15
    .line 16
    or-int/lit8 p1, p1, 0x1

    .line 17
    .line 18
    invoke-static {p1}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    .line 19
    .line 20
    .line 21
    move-result v8

    .line 22
    iget-object v1, p0, Lcom/zykj/mistake/feature/notebook/detail/u;->b:Lcom/zykj/mistake/feature/notebook/detail/m3;

    .line 23
    .line 24
    iget-object v2, p0, Lcom/zykj/mistake/feature/notebook/detail/u;->c:Lcom/zykj/mistake/feature/notebook/detail/a5;

    .line 25
    .line 26
    iget-boolean v3, p0, Lcom/zykj/mistake/feature/notebook/detail/u;->d:Z

    .line 27
    .line 28
    iget-boolean v4, p0, Lcom/zykj/mistake/feature/notebook/detail/u;->e:Z

    .line 29
    .line 30
    iget-object v5, p0, Lcom/zykj/mistake/feature/notebook/detail/u;->f:Lr6/e;

    .line 31
    .line 32
    iget-object v6, p0, Lcom/zykj/mistake/feature/notebook/detail/u;->g:Landroidx/compose/ui/Modifier;

    .line 33
    .line 34
    invoke-static/range {v1 .. v8}, Lcom/zykj/mistake/feature/notebook/detail/g0;->i(Lcom/zykj/mistake/feature/notebook/detail/m3;Lcom/zykj/mistake/feature/notebook/detail/a5;ZZLr6/e;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    .line 35
    .line 36
    .line 37
    :goto_0
    sget-object p1, Ld6/s;->a:Ld6/s;

    .line 38
    .line 39
    return-object p1

    .line 40
    :pswitch_0
    move-object v6, p1

    .line 41
    check-cast v6, Landroidx/compose/runtime/Composer;

    .line 42
    .line 43
    check-cast p2, Ljava/lang/Integer;

    .line 44
    .line 45
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    iget p1, p0, Lcom/zykj/mistake/feature/notebook/detail/u;->h:I

    .line 49
    .line 50
    or-int/lit8 p1, p1, 0x1

    .line 51
    .line 52
    invoke-static {p1}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    .line 53
    .line 54
    .line 55
    move-result v7

    .line 56
    iget-object v0, p0, Lcom/zykj/mistake/feature/notebook/detail/u;->b:Lcom/zykj/mistake/feature/notebook/detail/m3;

    .line 57
    .line 58
    iget-object v1, p0, Lcom/zykj/mistake/feature/notebook/detail/u;->c:Lcom/zykj/mistake/feature/notebook/detail/a5;

    .line 59
    .line 60
    iget-boolean v2, p0, Lcom/zykj/mistake/feature/notebook/detail/u;->d:Z

    .line 61
    .line 62
    iget-boolean v3, p0, Lcom/zykj/mistake/feature/notebook/detail/u;->e:Z

    .line 63
    .line 64
    iget-object v4, p0, Lcom/zykj/mistake/feature/notebook/detail/u;->f:Lr6/e;

    .line 65
    .line 66
    iget-object v5, p0, Lcom/zykj/mistake/feature/notebook/detail/u;->g:Landroidx/compose/ui/Modifier;

    .line 67
    .line 68
    invoke-static/range {v0 .. v7}, Lcom/zykj/mistake/feature/notebook/detail/g0;->i(Lcom/zykj/mistake/feature/notebook/detail/m3;Lcom/zykj/mistake/feature/notebook/detail/a5;ZZLr6/e;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    .line 69
    .line 70
    .line 71
    goto :goto_0

    .line 72
    nop

    .line 73
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
