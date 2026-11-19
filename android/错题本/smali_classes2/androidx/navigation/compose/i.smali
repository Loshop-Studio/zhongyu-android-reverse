.class public final synthetic Landroidx/navigation/compose/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr6/c;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, Landroidx/navigation/compose/i;->a:I

    iput-object p1, p0, Landroidx/navigation/compose/i;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Landroidx/navigation/compose/i;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Landroidx/navigation/compose/i;->b:Ljava/lang/Object;

    check-cast v0, Lr6/c;

    check-cast p1, Landroidx/compose/animation/AnimatedContentTransitionScope;

    invoke-static {v0, p1}, Landroidx/navigation/compose/NavHostKt;->z(Lr6/c;Landroidx/compose/animation/AnimatedContentTransitionScope;)Landroidx/compose/animation/SizeTransform;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Landroidx/navigation/compose/i;->b:Ljava/lang/Object;

    check-cast v0, Landroid/content/Context;

    check-cast p1, Landroid/os/Bundle;

    invoke-static {v0, p1}, Landroidx/navigation/compose/NavHostControllerKt__NavHostController_androidKt;->b(Landroid/content/Context;Landroid/os/Bundle;)Landroidx/navigation/NavHostController;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
