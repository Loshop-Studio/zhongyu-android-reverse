.class public final synthetic Lcom/zykj/mistake/feature/collection/list/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr6/e;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Z

.field public final synthetic c:Z

.field public final synthetic d:Lr6/a;

.field public final synthetic e:Lr6/a;

.field public final synthetic f:I

.field public final synthetic g:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;ZZLr6/a;Lr6/a;II)V
    .locals 0

    .line 1
    iput p7, p0, Lcom/zykj/mistake/feature/collection/list/w;->a:I

    iput-object p1, p0, Lcom/zykj/mistake/feature/collection/list/w;->g:Ljava/lang/Object;

    iput-boolean p2, p0, Lcom/zykj/mistake/feature/collection/list/w;->b:Z

    iput-boolean p3, p0, Lcom/zykj/mistake/feature/collection/list/w;->c:Z

    iput-object p4, p0, Lcom/zykj/mistake/feature/collection/list/w;->d:Lr6/a;

    iput-object p5, p0, Lcom/zykj/mistake/feature/collection/list/w;->e:Lr6/a;

    iput p6, p0, Lcom/zykj/mistake/feature/collection/list/w;->f:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget v0, p0, Lcom/zykj/mistake/feature/collection/list/w;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/mistake/feature/collection/list/w;->g:Ljava/lang/Object;

    .line 7
    .line 8
    move-object v1, v0

    .line 9
    check-cast v1, Lp4/b;

    .line 10
    .line 11
    move-object v6, p1

    .line 12
    check-cast v6, Landroidx/compose/runtime/Composer;

    .line 13
    .line 14
    check-cast p2, Ljava/lang/Integer;

    .line 15
    .line 16
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 17
    .line 18
    .line 19
    iget p1, p0, Lcom/zykj/mistake/feature/collection/list/w;->f:I

    .line 20
    .line 21
    or-int/lit8 p1, p1, 0x1

    .line 22
    .line 23
    invoke-static {p1}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    .line 24
    .line 25
    .line 26
    move-result v7

    .line 27
    iget-boolean v2, p0, Lcom/zykj/mistake/feature/collection/list/w;->b:Z

    .line 28
    .line 29
    iget-boolean v3, p0, Lcom/zykj/mistake/feature/collection/list/w;->c:Z

    .line 30
    .line 31
    iget-object v4, p0, Lcom/zykj/mistake/feature/collection/list/w;->d:Lr6/a;

    .line 32
    .line 33
    iget-object v5, p0, Lcom/zykj/mistake/feature/collection/list/w;->e:Lr6/a;

    .line 34
    .line 35
    invoke-static/range {v1 .. v7}, Lcom/zykj/mistake/feature/notebook/list/i1;->a(Lp4/b;ZZLr6/a;Lr6/a;Landroidx/compose/runtime/Composer;I)V

    .line 36
    .line 37
    .line 38
    :goto_0
    sget-object p1, Ld6/s;->a:Ld6/s;

    .line 39
    .line 40
    return-object p1

    .line 41
    :pswitch_0
    iget-object v0, p0, Lcom/zykj/mistake/feature/collection/list/w;->g:Ljava/lang/Object;

    .line 42
    .line 43
    move-object v1, v0

    .line 44
    check-cast v1, Lcom/zykj/mistake/feature/collection/list/b;

    .line 45
    .line 46
    move-object v6, p1

    .line 47
    check-cast v6, Landroidx/compose/runtime/Composer;

    .line 48
    .line 49
    check-cast p2, Ljava/lang/Integer;

    .line 50
    .line 51
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 52
    .line 53
    .line 54
    iget p1, p0, Lcom/zykj/mistake/feature/collection/list/w;->f:I

    .line 55
    .line 56
    or-int/lit8 p1, p1, 0x1

    .line 57
    .line 58
    invoke-static {p1}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    .line 59
    .line 60
    .line 61
    move-result v7

    .line 62
    iget-boolean v2, p0, Lcom/zykj/mistake/feature/collection/list/w;->b:Z

    .line 63
    .line 64
    iget-boolean v3, p0, Lcom/zykj/mistake/feature/collection/list/w;->c:Z

    .line 65
    .line 66
    iget-object v4, p0, Lcom/zykj/mistake/feature/collection/list/w;->d:Lr6/a;

    .line 67
    .line 68
    iget-object v5, p0, Lcom/zykj/mistake/feature/collection/list/w;->e:Lr6/a;

    .line 69
    .line 70
    invoke-static/range {v1 .. v7}, Lcom/zykj/mistake/feature/collection/list/c0;->b(Lcom/zykj/mistake/feature/collection/list/b;ZZLr6/a;Lr6/a;Landroidx/compose/runtime/Composer;I)V

    .line 71
    .line 72
    .line 73
    goto :goto_0

    .line 74
    nop

    .line 75
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
