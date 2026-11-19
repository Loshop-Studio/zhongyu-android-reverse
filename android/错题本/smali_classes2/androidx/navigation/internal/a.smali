.class public final synthetic Landroidx/navigation/internal/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr6/c;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Landroidx/navigation/internal/NavControllerImpl;


# direct methods
.method public synthetic constructor <init>(Landroidx/navigation/internal/NavControllerImpl;I)V
    .locals 0

    .line 1
    iput p2, p0, Landroidx/navigation/internal/a;->a:I

    iput-object p1, p0, Landroidx/navigation/internal/a;->b:Landroidx/navigation/internal/NavControllerImpl;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Landroidx/navigation/internal/a;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Landroidx/navigation/internal/a;->b:Landroidx/navigation/internal/NavControllerImpl;

    check-cast p1, Landroidx/navigation/NavDestination;

    invoke-static {v0, p1}, Landroidx/navigation/internal/NavControllerImpl;->f(Landroidx/navigation/internal/NavControllerImpl;Landroidx/navigation/NavDestination;)Z

    move-result p1

    :goto_0
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Landroidx/navigation/internal/a;->b:Landroidx/navigation/internal/NavControllerImpl;

    check-cast p1, Landroidx/navigation/NavDestination;

    invoke-static {v0, p1}, Landroidx/navigation/internal/NavControllerImpl;->n(Landroidx/navigation/internal/NavControllerImpl;Landroidx/navigation/NavDestination;)Z

    move-result p1

    goto :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
