.class public final synthetic Landroidx/navigation/internal/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr6/a;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lr6/a;


# direct methods
.method public synthetic constructor <init>(Lr6/a;I)V
    .locals 0

    .line 1
    iput p2, p0, Landroidx/navigation/internal/e;->a:I

    iput-object p1, p0, Landroidx/navigation/internal/e;->b:Lr6/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Landroidx/navigation/internal/e;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Landroidx/navigation/internal/e;->b:Lr6/a;

    .line 7
    .line 8
    invoke-interface {v0}, Lr6/a;->invoke()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    sget-object v0, Ld6/s;->a:Ld6/s;

    .line 12
    .line 13
    return-object v0

    .line 14
    :pswitch_0
    iget-object v0, p0, Landroidx/navigation/internal/e;->b:Lr6/a;

    .line 15
    .line 16
    invoke-interface {v0}, Lr6/a;->invoke()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    sget-object v0, Ld6/s;->a:Ld6/s;

    .line 20
    .line 21
    return-object v0

    .line 22
    :pswitch_1
    iget-object v0, p0, Landroidx/navigation/internal/e;->b:Lr6/a;

    .line 23
    .line 24
    invoke-static {v0}, Landroidx/navigation/internal/NavControllerImpl;->h(Lr6/a;)Ld6/s;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    return-object v0

    .line 29
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
