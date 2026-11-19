.class public final synthetic Lcom/zykj/mistake/feature/notebook/detail/l0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr6/e;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:J

.field public final synthetic d:J

.field public final synthetic e:Lr6/a;

.field public final synthetic f:I

.field public final synthetic g:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;JJLandroidx/compose/foundation/shape/RoundedCornerShape;Lr6/a;I)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput v0, p0, Lcom/zykj/mistake/feature/notebook/detail/l0;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/zykj/mistake/feature/notebook/detail/l0;->b:Ljava/lang/String;

    iput-wide p2, p0, Lcom/zykj/mistake/feature/notebook/detail/l0;->c:J

    iput-wide p4, p0, Lcom/zykj/mistake/feature/notebook/detail/l0;->d:J

    iput-object p6, p0, Lcom/zykj/mistake/feature/notebook/detail/l0;->g:Ljava/lang/Object;

    iput-object p7, p0, Lcom/zykj/mistake/feature/notebook/detail/l0;->e:Lr6/a;

    iput p8, p0, Lcom/zykj/mistake/feature/notebook/detail/l0;->f:I

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;JJLr6/a;Landroidx/compose/ui/Modifier;I)V
    .locals 1

    .line 2
    const/4 v0, 0x1

    iput v0, p0, Lcom/zykj/mistake/feature/notebook/detail/l0;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/zykj/mistake/feature/notebook/detail/l0;->b:Ljava/lang/String;

    iput-wide p2, p0, Lcom/zykj/mistake/feature/notebook/detail/l0;->c:J

    iput-wide p4, p0, Lcom/zykj/mistake/feature/notebook/detail/l0;->d:J

    iput-object p6, p0, Lcom/zykj/mistake/feature/notebook/detail/l0;->e:Lr6/a;

    iput-object p7, p0, Lcom/zykj/mistake/feature/notebook/detail/l0;->g:Ljava/lang/Object;

    iput p8, p0, Lcom/zykj/mistake/feature/notebook/detail/l0;->f:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget v0, p0, Lcom/zykj/mistake/feature/notebook/detail/l0;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/mistake/feature/notebook/detail/l0;->g:Ljava/lang/Object;

    .line 7
    .line 8
    move-object v7, v0

    .line 9
    check-cast v7, Landroidx/compose/ui/Modifier;

    .line 10
    .line 11
    move-object v8, p1

    .line 12
    check-cast v8, Landroidx/compose/runtime/Composer;

    .line 13
    .line 14
    check-cast p2, Ljava/lang/Integer;

    .line 15
    .line 16
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    iget p1, p0, Lcom/zykj/mistake/feature/notebook/detail/l0;->f:I

    .line 20
    .line 21
    or-int/lit8 p1, p1, 0x1

    .line 22
    .line 23
    invoke-static {p1}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    .line 24
    .line 25
    .line 26
    move-result v9

    .line 27
    iget-object v1, p0, Lcom/zykj/mistake/feature/notebook/detail/l0;->b:Ljava/lang/String;

    .line 28
    .line 29
    iget-wide v2, p0, Lcom/zykj/mistake/feature/notebook/detail/l0;->c:J

    .line 30
    .line 31
    iget-wide v4, p0, Lcom/zykj/mistake/feature/notebook/detail/l0;->d:J

    .line 32
    .line 33
    iget-object v6, p0, Lcom/zykj/mistake/feature/notebook/detail/l0;->e:Lr6/a;

    .line 34
    .line 35
    invoke-static/range {v1 .. v9}, Lcom/zykj/mistake/feature/notebook/detail/x3;->b(Ljava/lang/String;JJLr6/a;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

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
    iget-object v0, p0, Lcom/zykj/mistake/feature/notebook/detail/l0;->g:Ljava/lang/Object;

    .line 42
    .line 43
    move-object v6, v0

    .line 44
    check-cast v6, Landroidx/compose/foundation/shape/RoundedCornerShape;

    .line 45
    .line 46
    move-object v8, p1

    .line 47
    check-cast v8, Landroidx/compose/runtime/Composer;

    .line 48
    .line 49
    check-cast p2, Ljava/lang/Integer;

    .line 50
    .line 51
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 52
    .line 53
    .line 54
    iget p1, p0, Lcom/zykj/mistake/feature/notebook/detail/l0;->f:I

    .line 55
    .line 56
    or-int/lit8 p1, p1, 0x1

    .line 57
    .line 58
    invoke-static {p1}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    .line 59
    .line 60
    .line 61
    move-result v9

    .line 62
    iget-object v1, p0, Lcom/zykj/mistake/feature/notebook/detail/l0;->b:Ljava/lang/String;

    .line 63
    .line 64
    iget-wide v2, p0, Lcom/zykj/mistake/feature/notebook/detail/l0;->c:J

    .line 65
    .line 66
    iget-wide v4, p0, Lcom/zykj/mistake/feature/notebook/detail/l0;->d:J

    .line 67
    .line 68
    iget-object v7, p0, Lcom/zykj/mistake/feature/notebook/detail/l0;->e:Lr6/a;

    .line 69
    .line 70
    invoke-static/range {v1 .. v9}, Lcom/zykj/mistake/feature/notebook/detail/n0;->c(Ljava/lang/String;JJLandroidx/compose/foundation/shape/RoundedCornerShape;Lr6/a;Landroidx/compose/runtime/Composer;I)V

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
