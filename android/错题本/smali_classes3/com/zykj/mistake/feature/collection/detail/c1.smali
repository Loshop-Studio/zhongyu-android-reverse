.class public final synthetic Lcom/zykj/mistake/feature/collection/detail/c1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr6/e;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Z

.field public final synthetic c:I

.field public final synthetic d:I

.field public final synthetic e:Ljava/lang/Object;

.field public final synthetic f:Ld6/d;


# direct methods
.method public synthetic constructor <init>(IZLr6/a;Lr6/a;I)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput v0, p0, Lcom/zykj/mistake/feature/collection/detail/c1;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/zykj/mistake/feature/collection/detail/c1;->c:I

    iput-boolean p2, p0, Lcom/zykj/mistake/feature/collection/detail/c1;->b:Z

    iput-object p3, p0, Lcom/zykj/mistake/feature/collection/detail/c1;->e:Ljava/lang/Object;

    iput-object p4, p0, Lcom/zykj/mistake/feature/collection/detail/c1;->f:Ld6/d;

    iput p5, p0, Lcom/zykj/mistake/feature/collection/detail/c1;->d:I

    return-void
.end method

.method public synthetic constructor <init>(Lcom/zykj/mistake/feature/home/HomeTab;ZLr6/c;II)V
    .locals 1

    .line 2
    const/4 v0, 0x1

    iput v0, p0, Lcom/zykj/mistake/feature/collection/detail/c1;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/zykj/mistake/feature/collection/detail/c1;->e:Ljava/lang/Object;

    iput-boolean p2, p0, Lcom/zykj/mistake/feature/collection/detail/c1;->b:Z

    iput-object p3, p0, Lcom/zykj/mistake/feature/collection/detail/c1;->f:Ld6/d;

    iput p4, p0, Lcom/zykj/mistake/feature/collection/detail/c1;->c:I

    iput p5, p0, Lcom/zykj/mistake/feature/collection/detail/c1;->d:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget v0, p0, Lcom/zykj/mistake/feature/collection/detail/c1;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/mistake/feature/collection/detail/c1;->e:Ljava/lang/Object;

    .line 7
    .line 8
    move-object v1, v0

    .line 9
    check-cast v1, Lcom/zykj/mistake/feature/home/HomeTab;

    .line 10
    .line 11
    iget-object v0, p0, Lcom/zykj/mistake/feature/collection/detail/c1;->f:Ld6/d;

    .line 12
    .line 13
    move-object v3, v0

    .line 14
    check-cast v3, Lr6/c;

    .line 15
    .line 16
    move-object v4, p1

    .line 17
    check-cast v4, Landroidx/compose/runtime/Composer;

    .line 18
    .line 19
    check-cast p2, Ljava/lang/Integer;

    .line 20
    .line 21
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    iget p1, p0, Lcom/zykj/mistake/feature/collection/detail/c1;->c:I

    .line 25
    .line 26
    or-int/lit8 p1, p1, 0x1

    .line 27
    .line 28
    invoke-static {p1}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    .line 29
    .line 30
    .line 31
    move-result v5

    .line 32
    iget-boolean v2, p0, Lcom/zykj/mistake/feature/collection/detail/c1;->b:Z

    .line 33
    .line 34
    iget v6, p0, Lcom/zykj/mistake/feature/collection/detail/c1;->d:I

    .line 35
    .line 36
    invoke-static/range {v1 .. v6}, Lcom/zykj/mistake/feature/home/b;->a(Lcom/zykj/mistake/feature/home/HomeTab;ZLr6/c;Landroidx/compose/runtime/Composer;II)V

    .line 37
    .line 38
    .line 39
    :goto_0
    sget-object p1, Ld6/s;->a:Ld6/s;

    .line 40
    .line 41
    return-object p1

    .line 42
    :pswitch_0
    iget-object v0, p0, Lcom/zykj/mistake/feature/collection/detail/c1;->e:Ljava/lang/Object;

    .line 43
    .line 44
    move-object v3, v0

    .line 45
    check-cast v3, Lr6/a;

    .line 46
    .line 47
    iget-object v0, p0, Lcom/zykj/mistake/feature/collection/detail/c1;->f:Ld6/d;

    .line 48
    .line 49
    move-object v4, v0

    .line 50
    check-cast v4, Lr6/a;

    .line 51
    .line 52
    move-object v5, p1

    .line 53
    check-cast v5, Landroidx/compose/runtime/Composer;

    .line 54
    .line 55
    check-cast p2, Ljava/lang/Integer;

    .line 56
    .line 57
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 58
    .line 59
    .line 60
    iget p1, p0, Lcom/zykj/mistake/feature/collection/detail/c1;->d:I

    .line 61
    .line 62
    or-int/lit8 p1, p1, 0x1

    .line 63
    .line 64
    invoke-static {p1}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    .line 65
    .line 66
    .line 67
    move-result v6

    .line 68
    iget v1, p0, Lcom/zykj/mistake/feature/collection/detail/c1;->c:I

    .line 69
    .line 70
    iget-boolean v2, p0, Lcom/zykj/mistake/feature/collection/detail/c1;->b:Z

    .line 71
    .line 72
    invoke-static/range {v1 .. v6}, Lcom/zykj/mistake/feature/collection/detail/f1;->e(IZLr6/a;Lr6/a;Landroidx/compose/runtime/Composer;I)V

    .line 73
    .line 74
    .line 75
    goto :goto_0

    .line 76
    nop

    .line 77
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
