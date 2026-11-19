.class public final synthetic Lcom/zykj/mistake/feature/notebook/detail/x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr6/e;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:I


# direct methods
.method public synthetic constructor <init>(II)V
    .locals 0

    .line 1
    iput p2, p0, Lcom/zykj/mistake/feature/notebook/detail/x;->a:I

    iput p1, p0, Lcom/zykj/mistake/feature/notebook/detail/x;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/mistake/feature/notebook/detail/x;->a:I

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
    iget p2, p0, Lcom/zykj/mistake/feature/notebook/detail/x;->b:I

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
    invoke-static {p1, p2}, Ly4/e;->a(Landroidx/compose/runtime/Composer;I)V

    .line 22
    .line 23
    .line 24
    :goto_0
    sget-object p1, Ld6/s;->a:Ld6/s;

    .line 25
    .line 26
    return-object p1

    .line 27
    :pswitch_0
    iget p2, p0, Lcom/zykj/mistake/feature/notebook/detail/x;->b:I

    .line 28
    .line 29
    or-int/lit8 p2, p2, 0x1

    .line 30
    .line 31
    invoke-static {p2}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    .line 32
    .line 33
    .line 34
    move-result p2

    .line 35
    invoke-static {p1, p2}, Lcom/zykj/mistake/feature/notebook/list/i1;->h(Landroidx/compose/runtime/Composer;I)V

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :pswitch_1
    iget p2, p0, Lcom/zykj/mistake/feature/notebook/detail/x;->b:I

    .line 40
    .line 41
    or-int/lit8 p2, p2, 0x1

    .line 42
    .line 43
    invoke-static {p2}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    .line 44
    .line 45
    .line 46
    move-result p2

    .line 47
    invoke-static {p1, p2}, Lcom/zykj/mistake/feature/notebook/detail/x3;->c(Landroidx/compose/runtime/Composer;I)V

    .line 48
    .line 49
    .line 50
    goto :goto_0

    .line 51
    :pswitch_2
    iget p2, p0, Lcom/zykj/mistake/feature/notebook/detail/x;->b:I

    .line 52
    .line 53
    or-int/lit8 p2, p2, 0x1

    .line 54
    .line 55
    invoke-static {p2}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    .line 56
    .line 57
    .line 58
    move-result p2

    .line 59
    invoke-static {p1, p2}, Lcom/zykj/mistake/feature/notebook/detail/g0;->a(Landroidx/compose/runtime/Composer;I)V

    .line 60
    .line 61
    .line 62
    goto :goto_0

    .line 63
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
