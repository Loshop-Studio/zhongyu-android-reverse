.class public final synthetic Lcom/zykj/view/board/board/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr6/e;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lcom/zykj/view/board/board/BoardViewModel;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/view/board/board/BoardViewModel;I)V
    .locals 0

    .line 1
    iput p2, p0, Lcom/zykj/view/board/board/m;->a:I

    iput-object p1, p0, Lcom/zykj/view/board/board/m;->b:Lcom/zykj/view/board/board/BoardViewModel;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/view/board/board/m;->a:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    iget-object v0, p0, Lcom/zykj/view/board/board/m;->b:Lcom/zykj/view/board/board/BoardViewModel;

    invoke-static {v0, p1, p2}, Lcom/zykj/view/board/board/BoardViewModel;->g(Lcom/zykj/view/board/board/BoardViewModel;ZZ)Ld6/s;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    check-cast p2, Ljava/lang/Float;

    invoke-virtual {p2}, Ljava/lang/Float;->floatValue()F

    move-result p2

    iget-object v0, p0, Lcom/zykj/view/board/board/m;->b:Lcom/zykj/view/board/board/BoardViewModel;

    invoke-static {v0, p1, p2}, Lcom/zykj/view/board/board/BoardViewModel;->l(Lcom/zykj/view/board/board/BoardViewModel;FF)Ld6/s;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
