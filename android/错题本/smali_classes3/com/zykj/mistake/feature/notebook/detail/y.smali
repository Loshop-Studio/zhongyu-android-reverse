.class public final synthetic Lcom/zykj/mistake/feature/notebook/detail/y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr6/e;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lp4/i;

.field public final synthetic c:I


# direct methods
.method public synthetic constructor <init>(Lp4/i;II)V
    .locals 0

    .line 1
    iput p3, p0, Lcom/zykj/mistake/feature/notebook/detail/y;->a:I

    iput-object p1, p0, Lcom/zykj/mistake/feature/notebook/detail/y;->b:Lp4/i;

    iput p2, p0, Lcom/zykj/mistake/feature/notebook/detail/y;->c:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/mistake/feature/notebook/detail/y;->a:I

    .line 2
    .line 3
    check-cast p1, Landroidx/compose/runtime/Composer;

    .line 4
    .line 5
    check-cast p2, Ljava/lang/Integer;

    .line 6
    .line 7
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 8
    .line 9
    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    iget p2, p0, Lcom/zykj/mistake/feature/notebook/detail/y;->c:I

    .line 14
    .line 15
    or-int/lit8 p2, p2, 0x1

    .line 16
    .line 17
    invoke-static {p2}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    .line 18
    .line 19
    .line 20
    move-result p2

    .line 21
    iget-object v0, p0, Lcom/zykj/mistake/feature/notebook/detail/y;->b:Lp4/i;

    .line 22
    .line 23
    invoke-static {v0, p1, p2}, Ly4/e;->c(Lp4/i;Landroidx/compose/runtime/Composer;I)V

    .line 24
    .line 25
    .line 26
    :goto_0
    sget-object p1, Ld6/s;->a:Ld6/s;

    .line 27
    .line 28
    return-object p1

    .line 29
    :pswitch_0
    iget p2, p0, Lcom/zykj/mistake/feature/notebook/detail/y;->c:I

    .line 30
    .line 31
    or-int/lit8 p2, p2, 0x1

    .line 32
    .line 33
    invoke-static {p2}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    .line 34
    .line 35
    .line 36
    move-result p2

    .line 37
    iget-object v0, p0, Lcom/zykj/mistake/feature/notebook/detail/y;->b:Lp4/i;

    .line 38
    .line 39
    invoke-static {v0, p1, p2}, Lcom/zykj/mistake/feature/notebook/detail/g0;->d(Lp4/i;Landroidx/compose/runtime/Composer;I)V

    .line 40
    .line 41
    .line 42
    goto :goto_0

    .line 43
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
