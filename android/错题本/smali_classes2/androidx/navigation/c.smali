.class public final synthetic Landroidx/navigation/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr6/a;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Landroidx/navigation/NavController;


# direct methods
.method public synthetic constructor <init>(Landroidx/navigation/NavController;I)V
    .locals 0

    .line 1
    iput p2, p0, Landroidx/navigation/c;->a:I

    iput-object p1, p0, Landroidx/navigation/c;->b:Landroidx/navigation/NavController;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Landroidx/navigation/c;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Landroidx/navigation/c;->b:Landroidx/navigation/NavController;

    invoke-static {v0}, Landroidx/navigation/NavController;->e(Landroidx/navigation/NavController;)Landroidx/navigation/NavInflater;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Landroidx/navigation/c;->b:Landroidx/navigation/NavController;

    invoke-static {v0}, Landroidx/navigation/NavController;->b(Landroidx/navigation/NavController;)Ld6/s;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
