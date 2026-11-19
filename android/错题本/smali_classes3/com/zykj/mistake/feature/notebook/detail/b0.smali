.class public final synthetic Lcom/zykj/mistake/feature/notebook/detail/b0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr6/e;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:I

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:Landroidx/compose/ui/Modifier;

.field public final synthetic e:Z

.field public final synthetic f:Lr6/a;

.field public final synthetic g:I

.field public final synthetic h:I


# direct methods
.method public synthetic constructor <init>(ILjava/lang/String;Landroidx/compose/ui/Modifier;ZLr6/a;III)V
    .locals 0

    .line 1
    iput p8, p0, Lcom/zykj/mistake/feature/notebook/detail/b0;->a:I

    iput p1, p0, Lcom/zykj/mistake/feature/notebook/detail/b0;->b:I

    iput-object p2, p0, Lcom/zykj/mistake/feature/notebook/detail/b0;->c:Ljava/lang/String;

    iput-object p3, p0, Lcom/zykj/mistake/feature/notebook/detail/b0;->d:Landroidx/compose/ui/Modifier;

    iput-boolean p4, p0, Lcom/zykj/mistake/feature/notebook/detail/b0;->e:Z

    iput-object p5, p0, Lcom/zykj/mistake/feature/notebook/detail/b0;->f:Lr6/a;

    iput p6, p0, Lcom/zykj/mistake/feature/notebook/detail/b0;->g:I

    iput p7, p0, Lcom/zykj/mistake/feature/notebook/detail/b0;->h:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget v0, p0, Lcom/zykj/mistake/feature/notebook/detail/b0;->a:I

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
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    iget p1, p0, Lcom/zykj/mistake/feature/notebook/detail/b0;->g:I

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
    iget v1, p0, Lcom/zykj/mistake/feature/notebook/detail/b0;->b:I

    .line 23
    .line 24
    iget-object v2, p0, Lcom/zykj/mistake/feature/notebook/detail/b0;->c:Ljava/lang/String;

    .line 25
    .line 26
    iget-object v3, p0, Lcom/zykj/mistake/feature/notebook/detail/b0;->d:Landroidx/compose/ui/Modifier;

    .line 27
    .line 28
    iget-boolean v4, p0, Lcom/zykj/mistake/feature/notebook/detail/b0;->e:Z

    .line 29
    .line 30
    iget-object v5, p0, Lcom/zykj/mistake/feature/notebook/detail/b0;->f:Lr6/a;

    .line 31
    .line 32
    iget v8, p0, Lcom/zykj/mistake/feature/notebook/detail/b0;->h:I

    .line 33
    .line 34
    invoke-static/range {v1 .. v8}, Lcom/zykj/mistake/feature/notebook/detail/s4;->a(ILjava/lang/String;Landroidx/compose/ui/Modifier;ZLr6/a;Landroidx/compose/runtime/Composer;II)V

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
    move-object v5, p1

    .line 41
    check-cast v5, Landroidx/compose/runtime/Composer;

    .line 42
    .line 43
    check-cast p2, Ljava/lang/Integer;

    .line 44
    .line 45
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    iget p1, p0, Lcom/zykj/mistake/feature/notebook/detail/b0;->g:I

    .line 49
    .line 50
    or-int/lit8 p1, p1, 0x1

    .line 51
    .line 52
    invoke-static {p1}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    .line 53
    .line 54
    .line 55
    move-result v6

    .line 56
    iget v0, p0, Lcom/zykj/mistake/feature/notebook/detail/b0;->b:I

    .line 57
    .line 58
    iget-object v1, p0, Lcom/zykj/mistake/feature/notebook/detail/b0;->c:Ljava/lang/String;

    .line 59
    .line 60
    iget-object v2, p0, Lcom/zykj/mistake/feature/notebook/detail/b0;->d:Landroidx/compose/ui/Modifier;

    .line 61
    .line 62
    iget-boolean v3, p0, Lcom/zykj/mistake/feature/notebook/detail/b0;->e:Z

    .line 63
    .line 64
    iget-object v4, p0, Lcom/zykj/mistake/feature/notebook/detail/b0;->f:Lr6/a;

    .line 65
    .line 66
    iget v7, p0, Lcom/zykj/mistake/feature/notebook/detail/b0;->h:I

    .line 67
    .line 68
    invoke-static/range {v0 .. v7}, Lcom/zykj/mistake/feature/notebook/detail/g0;->h(ILjava/lang/String;Landroidx/compose/ui/Modifier;ZLr6/a;Landroidx/compose/runtime/Composer;II)V

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
