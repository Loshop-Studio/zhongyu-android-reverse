.class public final synthetic Landroidx/navigation/serialization/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr6/a;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Li7/b;


# direct methods
.method public synthetic constructor <init>(Li7/b;I)V
    .locals 0

    .line 1
    iput p2, p0, Landroidx/navigation/serialization/a;->a:I

    iput-object p1, p0, Landroidx/navigation/serialization/a;->b:Li7/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Landroidx/navigation/serialization/a;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Landroidx/navigation/serialization/a;->b:Li7/b;

    invoke-static {v0}, Landroidx/navigation/serialization/RouteSerializerKt;->b(Li7/b;)Ld6/s;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Landroidx/navigation/serialization/a;->b:Li7/b;

    invoke-static {v0}, Landroidx/navigation/serialization/RouteSerializerKt;->e(Li7/b;)Ld6/s;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
