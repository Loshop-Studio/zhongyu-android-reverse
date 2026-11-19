.class public final synthetic Lcom/zykj/mistake/feature/notebook/detail/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr6/e;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lcom/zykj/mistake/feature/notebook/detail/n3;

.field public final synthetic c:Lr6/c;

.field public final synthetic d:Landroidx/compose/ui/Modifier;

.field public final synthetic e:I


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/mistake/feature/notebook/detail/n3;Lr6/c;Landroidx/compose/ui/Modifier;II)V
    .locals 0

    .line 1
    iput p5, p0, Lcom/zykj/mistake/feature/notebook/detail/g;->a:I

    iput-object p1, p0, Lcom/zykj/mistake/feature/notebook/detail/g;->b:Lcom/zykj/mistake/feature/notebook/detail/n3;

    iput-object p2, p0, Lcom/zykj/mistake/feature/notebook/detail/g;->c:Lr6/c;

    iput-object p3, p0, Lcom/zykj/mistake/feature/notebook/detail/g;->d:Landroidx/compose/ui/Modifier;

    iput p4, p0, Lcom/zykj/mistake/feature/notebook/detail/g;->e:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, Lcom/zykj/mistake/feature/notebook/detail/g;->a:I

    .line 2
    .line 3
    check-cast p1, Landroidx/compose/runtime/Composer;

    .line 4
    .line 5
    check-cast p2, Ljava/lang/Integer;

    .line 6
    .line 7
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    iget p2, p0, Lcom/zykj/mistake/feature/notebook/detail/g;->e:I

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
    iget-object v0, p0, Lcom/zykj/mistake/feature/notebook/detail/g;->b:Lcom/zykj/mistake/feature/notebook/detail/n3;

    .line 22
    .line 23
    iget-object v1, p0, Lcom/zykj/mistake/feature/notebook/detail/g;->c:Lr6/c;

    .line 24
    .line 25
    iget-object v2, p0, Lcom/zykj/mistake/feature/notebook/detail/g;->d:Landroidx/compose/ui/Modifier;

    .line 26
    .line 27
    invoke-static {v0, v1, v2, p1, p2}, Lcom/zykj/mistake/feature/notebook/detail/t;->n(Lcom/zykj/mistake/feature/notebook/detail/n3;Lr6/c;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    .line 28
    .line 29
    .line 30
    :goto_0
    sget-object p1, Ld6/s;->a:Ld6/s;

    .line 31
    .line 32
    return-object p1

    .line 33
    :pswitch_0
    iget p2, p0, Lcom/zykj/mistake/feature/notebook/detail/g;->e:I

    .line 34
    .line 35
    or-int/lit8 p2, p2, 0x1

    .line 36
    .line 37
    invoke-static {p2}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    .line 38
    .line 39
    .line 40
    move-result p2

    .line 41
    iget-object v0, p0, Lcom/zykj/mistake/feature/notebook/detail/g;->b:Lcom/zykj/mistake/feature/notebook/detail/n3;

    .line 42
    .line 43
    iget-object v1, p0, Lcom/zykj/mistake/feature/notebook/detail/g;->c:Lr6/c;

    .line 44
    .line 45
    iget-object v2, p0, Lcom/zykj/mistake/feature/notebook/detail/g;->d:Landroidx/compose/ui/Modifier;

    .line 46
    .line 47
    invoke-static {v0, v1, v2, p1, p2}, Lcom/zykj/mistake/feature/notebook/detail/t;->n(Lcom/zykj/mistake/feature/notebook/detail/n3;Lr6/c;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    .line 48
    .line 49
    .line 50
    goto :goto_0

    .line 51
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
