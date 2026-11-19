.class public final synthetic Lcom/zykj/mistake/feature/notebook/detail/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr6/e;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/util/List;

.field public final synthetic c:Ljava/util/List;

.field public final synthetic d:Lr6/e;

.field public final synthetic e:Ljava/lang/String;

.field public final synthetic f:I


# direct methods
.method public synthetic constructor <init>(Ljava/util/List;Ljava/util/List;Lr6/e;Ljava/lang/String;II)V
    .locals 0

    .line 1
    iput p6, p0, Lcom/zykj/mistake/feature/notebook/detail/o;->a:I

    iput-object p1, p0, Lcom/zykj/mistake/feature/notebook/detail/o;->b:Ljava/util/List;

    iput-object p2, p0, Lcom/zykj/mistake/feature/notebook/detail/o;->c:Ljava/util/List;

    iput-object p3, p0, Lcom/zykj/mistake/feature/notebook/detail/o;->d:Lr6/e;

    iput-object p4, p0, Lcom/zykj/mistake/feature/notebook/detail/o;->e:Ljava/lang/String;

    iput p5, p0, Lcom/zykj/mistake/feature/notebook/detail/o;->f:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget v0, p0, Lcom/zykj/mistake/feature/notebook/detail/o;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    move-object v5, p1

    .line 7
    check-cast v5, Landroidx/compose/runtime/Composer;

    .line 8
    .line 9
    check-cast p2, Ljava/lang/Integer;

    .line 10
    .line 11
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 12
    .line 13
    .line 14
    iget p1, p0, Lcom/zykj/mistake/feature/notebook/detail/o;->f:I

    .line 15
    .line 16
    or-int/lit8 p1, p1, 0x1

    .line 17
    .line 18
    invoke-static {p1}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    .line 19
    .line 20
    .line 21
    move-result v6

    .line 22
    iget-object v1, p0, Lcom/zykj/mistake/feature/notebook/detail/o;->b:Ljava/util/List;

    .line 23
    .line 24
    iget-object v2, p0, Lcom/zykj/mistake/feature/notebook/detail/o;->c:Ljava/util/List;

    .line 25
    .line 26
    iget-object v3, p0, Lcom/zykj/mistake/feature/notebook/detail/o;->d:Lr6/e;

    .line 27
    .line 28
    iget-object v4, p0, Lcom/zykj/mistake/feature/notebook/detail/o;->e:Ljava/lang/String;

    .line 29
    .line 30
    invoke-static/range {v1 .. v6}, Lcom/zykj/mistake/feature/notebook/detail/t;->j(Ljava/util/List;Ljava/util/List;Lr6/e;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    .line 31
    .line 32
    .line 33
    :goto_0
    sget-object p1, Ld6/s;->a:Ld6/s;

    .line 34
    .line 35
    return-object p1

    .line 36
    :pswitch_0
    move-object v4, p1

    .line 37
    check-cast v4, Landroidx/compose/runtime/Composer;

    .line 38
    .line 39
    check-cast p2, Ljava/lang/Integer;

    .line 40
    .line 41
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 42
    .line 43
    .line 44
    iget p1, p0, Lcom/zykj/mistake/feature/notebook/detail/o;->f:I

    .line 45
    .line 46
    or-int/lit8 p1, p1, 0x1

    .line 47
    .line 48
    invoke-static {p1}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    .line 49
    .line 50
    .line 51
    move-result v5

    .line 52
    iget-object v0, p0, Lcom/zykj/mistake/feature/notebook/detail/o;->b:Ljava/util/List;

    .line 53
    .line 54
    iget-object v1, p0, Lcom/zykj/mistake/feature/notebook/detail/o;->c:Ljava/util/List;

    .line 55
    .line 56
    iget-object v2, p0, Lcom/zykj/mistake/feature/notebook/detail/o;->d:Lr6/e;

    .line 57
    .line 58
    iget-object v3, p0, Lcom/zykj/mistake/feature/notebook/detail/o;->e:Ljava/lang/String;

    .line 59
    .line 60
    invoke-static/range {v0 .. v5}, Lcom/zykj/mistake/feature/notebook/detail/t;->j(Ljava/util/List;Ljava/util/List;Lr6/e;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    .line 61
    .line 62
    .line 63
    goto :goto_0

    .line 64
    nop

    .line 65
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
