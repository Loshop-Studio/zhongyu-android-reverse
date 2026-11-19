.class public final synthetic Lcom/zykj/mistake/feature/notebook/detail/j4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr6/e;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/util/List;

.field public final synthetic c:Z

.field public final synthetic d:Lr6/a;

.field public final synthetic e:Lr6/c;

.field public final synthetic f:Lr6/c;

.field public final synthetic g:I


# direct methods
.method public synthetic constructor <init>(Ljava/util/List;ZLr6/a;Lr6/c;Lr6/c;II)V
    .locals 0

    .line 1
    iput p7, p0, Lcom/zykj/mistake/feature/notebook/detail/j4;->a:I

    iput-object p1, p0, Lcom/zykj/mistake/feature/notebook/detail/j4;->b:Ljava/util/List;

    iput-boolean p2, p0, Lcom/zykj/mistake/feature/notebook/detail/j4;->c:Z

    iput-object p3, p0, Lcom/zykj/mistake/feature/notebook/detail/j4;->d:Lr6/a;

    iput-object p4, p0, Lcom/zykj/mistake/feature/notebook/detail/j4;->e:Lr6/c;

    iput-object p5, p0, Lcom/zykj/mistake/feature/notebook/detail/j4;->f:Lr6/c;

    iput p6, p0, Lcom/zykj/mistake/feature/notebook/detail/j4;->g:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget v0, p0, Lcom/zykj/mistake/feature/notebook/detail/j4;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    move-object v6, p1

    .line 7
    check-cast v6, Landroidx/compose/runtime/Composer;

    .line 8
    .line 9
    check-cast p2, Ljava/lang/Integer;

    .line 10
    .line 11
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 12
    .line 13
    .line 14
    iget p1, p0, Lcom/zykj/mistake/feature/notebook/detail/j4;->g:I

    .line 15
    .line 16
    or-int/lit8 p1, p1, 0x1

    .line 17
    .line 18
    invoke-static {p1}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    .line 19
    .line 20
    .line 21
    move-result v7

    .line 22
    iget-object v1, p0, Lcom/zykj/mistake/feature/notebook/detail/j4;->b:Ljava/util/List;

    .line 23
    .line 24
    iget-boolean v2, p0, Lcom/zykj/mistake/feature/notebook/detail/j4;->c:Z

    .line 25
    .line 26
    iget-object v3, p0, Lcom/zykj/mistake/feature/notebook/detail/j4;->d:Lr6/a;

    .line 27
    .line 28
    iget-object v4, p0, Lcom/zykj/mistake/feature/notebook/detail/j4;->e:Lr6/c;

    .line 29
    .line 30
    iget-object v5, p0, Lcom/zykj/mistake/feature/notebook/detail/j4;->f:Lr6/c;

    .line 31
    .line 32
    invoke-static/range {v1 .. v7}, Lcom/zykj/mistake/feature/notebook/detail/q4;->g(Ljava/util/List;ZLr6/a;Lr6/c;Lr6/c;Landroidx/compose/runtime/Composer;I)V

    .line 33
    .line 34
    .line 35
    :goto_0
    sget-object p1, Ld6/s;->a:Ld6/s;

    .line 36
    .line 37
    return-object p1

    .line 38
    :pswitch_0
    move-object v5, p1

    .line 39
    check-cast v5, Landroidx/compose/runtime/Composer;

    .line 40
    .line 41
    check-cast p2, Ljava/lang/Integer;

    .line 42
    .line 43
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 44
    .line 45
    .line 46
    iget p1, p0, Lcom/zykj/mistake/feature/notebook/detail/j4;->g:I

    .line 47
    .line 48
    or-int/lit8 p1, p1, 0x1

    .line 49
    .line 50
    invoke-static {p1}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    .line 51
    .line 52
    .line 53
    move-result v6

    .line 54
    iget-object v0, p0, Lcom/zykj/mistake/feature/notebook/detail/j4;->b:Ljava/util/List;

    .line 55
    .line 56
    iget-boolean v1, p0, Lcom/zykj/mistake/feature/notebook/detail/j4;->c:Z

    .line 57
    .line 58
    iget-object v2, p0, Lcom/zykj/mistake/feature/notebook/detail/j4;->d:Lr6/a;

    .line 59
    .line 60
    iget-object v3, p0, Lcom/zykj/mistake/feature/notebook/detail/j4;->e:Lr6/c;

    .line 61
    .line 62
    iget-object v4, p0, Lcom/zykj/mistake/feature/notebook/detail/j4;->f:Lr6/c;

    .line 63
    .line 64
    invoke-static/range {v0 .. v6}, Lcom/zykj/mistake/feature/notebook/detail/q4;->b(Ljava/util/List;ZLr6/a;Lr6/c;Lr6/c;Landroidx/compose/runtime/Composer;I)V

    .line 65
    .line 66
    .line 67
    goto :goto_0

    .line 68
    nop

    .line 69
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
