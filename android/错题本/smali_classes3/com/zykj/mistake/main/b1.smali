.class public final synthetic Lcom/zykj/mistake/main/b1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr6/c;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lo2/a;


# direct methods
.method public synthetic constructor <init>(Lo2/a;I)V
    .locals 0

    .line 1
    iput p2, p0, Lcom/zykj/mistake/main/b1;->a:I

    iput-object p1, p0, Lcom/zykj/mistake/main/b1;->b:Lo2/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/mistake/main/b1;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Landroid/widget/FrameLayout;

    .line 7
    .line 8
    const-string v0, "it"

    .line 9
    .line 10
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    const/4 p1, 0x0

    .line 14
    iget-object v0, p0, Lcom/zykj/mistake/main/b1;->b:Lo2/a;

    .line 15
    .line 16
    iput-object p1, v0, Lo2/a;->b:Ljava/lang/Object;

    .line 17
    .line 18
    sget-object p1, Ld6/s;->a:Ld6/s;

    .line 19
    .line 20
    return-object p1

    .line 21
    :pswitch_0
    check-cast p1, Landroid/content/Context;

    .line 22
    .line 23
    const-string v0, "context"

    .line 24
    .line 25
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    new-instance v0, Landroid/widget/FrameLayout;

    .line 29
    .line 30
    invoke-direct {v0, p1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 31
    .line 32
    .line 33
    iget-object p1, p0, Lcom/zykj/mistake/main/b1;->b:Lo2/a;

    .line 34
    .line 35
    iput-object v0, p1, Lo2/a;->b:Ljava/lang/Object;

    .line 36
    .line 37
    return-object v0

    .line 38
    nop

    .line 39
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
