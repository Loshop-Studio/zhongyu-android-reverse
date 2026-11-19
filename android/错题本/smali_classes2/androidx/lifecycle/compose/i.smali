.class public final synthetic Landroidx/lifecycle/compose/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr6/e;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;

.field public final synthetic e:Ljava/lang/Object;

.field public final synthetic f:Lr6/c;

.field public final synthetic g:I

.field public final synthetic h:I


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lr6/c;III)V
    .locals 0

    .line 1
    iput p8, p0, Landroidx/lifecycle/compose/i;->a:I

    iput-object p1, p0, Landroidx/lifecycle/compose/i;->b:Ljava/lang/Object;

    iput-object p2, p0, Landroidx/lifecycle/compose/i;->c:Ljava/lang/Object;

    iput-object p3, p0, Landroidx/lifecycle/compose/i;->d:Ljava/lang/Object;

    iput-object p4, p0, Landroidx/lifecycle/compose/i;->e:Ljava/lang/Object;

    iput-object p5, p0, Landroidx/lifecycle/compose/i;->f:Lr6/c;

    iput p6, p0, Landroidx/lifecycle/compose/i;->g:I

    iput p7, p0, Landroidx/lifecycle/compose/i;->h:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget v0, p0, Landroidx/lifecycle/compose/i;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Landroidx/lifecycle/compose/i;->b:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Landroidx/navigation/NavHostController;

    iget-object v0, p0, Landroidx/lifecycle/compose/i;->c:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Ljava/lang/String;

    iget-object v0, p0, Landroidx/lifecycle/compose/i;->d:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Landroidx/compose/ui/Modifier;

    iget-object v0, p0, Landroidx/lifecycle/compose/i;->e:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Ljava/lang/String;

    move-object v8, p1

    check-cast v8, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v9

    iget-object v5, p0, Landroidx/lifecycle/compose/i;->f:Lr6/c;

    iget v6, p0, Landroidx/lifecycle/compose/i;->g:I

    iget v7, p0, Landroidx/lifecycle/compose/i;->h:I

    invoke-static/range {v1 .. v9}, Landroidx/navigation/compose/NavHostKt;->m(Landroidx/navigation/NavHostController;Ljava/lang/String;Landroidx/compose/ui/Modifier;Ljava/lang/String;Lr6/c;IILandroidx/compose/runtime/Composer;I)Ld6/s;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Landroidx/lifecycle/compose/i;->e:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Landroidx/lifecycle/LifecycleOwner;

    move-object v8, p1

    check-cast v8, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v9

    iget-object v1, p0, Landroidx/lifecycle/compose/i;->b:Ljava/lang/Object;

    iget-object v2, p0, Landroidx/lifecycle/compose/i;->c:Ljava/lang/Object;

    iget-object v3, p0, Landroidx/lifecycle/compose/i;->d:Ljava/lang/Object;

    iget-object v5, p0, Landroidx/lifecycle/compose/i;->f:Lr6/c;

    iget v6, p0, Landroidx/lifecycle/compose/i;->g:I

    iget v7, p0, Landroidx/lifecycle/compose/i;->h:I

    invoke-static/range {v1 .. v9}, Landroidx/lifecycle/compose/LifecycleEffectKt;->l(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Landroidx/lifecycle/LifecycleOwner;Lr6/c;IILandroidx/compose/runtime/Composer;I)Ld6/s;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Landroidx/lifecycle/compose/i;->e:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Landroidx/lifecycle/LifecycleOwner;

    move-object v8, p1

    check-cast v8, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v9

    iget-object v1, p0, Landroidx/lifecycle/compose/i;->b:Ljava/lang/Object;

    iget-object v2, p0, Landroidx/lifecycle/compose/i;->c:Ljava/lang/Object;

    iget-object v3, p0, Landroidx/lifecycle/compose/i;->d:Ljava/lang/Object;

    iget-object v5, p0, Landroidx/lifecycle/compose/i;->f:Lr6/c;

    iget v6, p0, Landroidx/lifecycle/compose/i;->g:I

    iget v7, p0, Landroidx/lifecycle/compose/i;->h:I

    invoke-static/range {v1 .. v9}, Landroidx/lifecycle/compose/LifecycleEffectKt;->j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Landroidx/lifecycle/LifecycleOwner;Lr6/c;IILandroidx/compose/runtime/Composer;I)Ld6/s;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
