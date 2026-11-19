.class public final synthetic Lcom/zykj/view/board/board/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr6/c;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lcom/zykj/view/board/board/BoardViewModel;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/view/board/board/BoardViewModel;I)V
    .locals 0

    .line 1
    iput p2, p0, Lcom/zykj/view/board/board/k;->a:I

    iput-object p1, p0, Lcom/zykj/view/board/board/k;->b:Lcom/zykj/view/board/board/BoardViewModel;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, Lcom/zykj/view/board/board/k;->a:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    iget-object v0, p0, Lcom/zykj/view/board/board/k;->b:Lcom/zykj/view/board/board/BoardViewModel;

    invoke-static {v0, p1}, Lcom/zykj/view/board/board/BoardViewModel;->b(Lcom/zykj/view/board/board/BoardViewModel;I)Ld6/s;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, Ljava/lang/Long;

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    iget-object p1, p0, Lcom/zykj/view/board/board/k;->b:Lcom/zykj/view/board/board/BoardViewModel;

    invoke-static {p1, v0, v1}, Lcom/zykj/view/board/board/BoardViewModel;->h(Lcom/zykj/view/board/board/BoardViewModel;J)Ld6/s;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lcom/zykj/view/board/board/k;->b:Lcom/zykj/view/board/board/BoardViewModel;

    check-cast p1, Lcom/zykj/blackboard/core/edit/IPageControl;

    invoke-static {v0, p1}, Lcom/zykj/view/board/board/BoardViewModel;->n(Lcom/zykj/view/board/board/BoardViewModel;Lcom/zykj/blackboard/core/edit/IPageControl;)Ld6/s;

    move-result-object p1

    return-object p1

    :pswitch_2
    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    iget-object v0, p0, Lcom/zykj/view/board/board/k;->b:Lcom/zykj/view/board/board/BoardViewModel;

    invoke-static {v0, p1}, Lcom/zykj/view/board/board/BoardViewModel;->d(Lcom/zykj/view/board/board/BoardViewModel;I)Ld6/s;

    move-result-object p1

    return-object p1

    :pswitch_3
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iget-object v0, p0, Lcom/zykj/view/board/board/k;->b:Lcom/zykj/view/board/board/BoardViewModel;

    invoke-static {v0, p1}, Lcom/zykj/view/board/board/BoardViewModel;->c(Lcom/zykj/view/board/board/BoardViewModel;Z)Ld6/s;

    move-result-object p1

    return-object p1

    :pswitch_4
    check-cast p1, Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    iget-object v0, p0, Lcom/zykj/view/board/board/k;->b:Lcom/zykj/view/board/board/BoardViewModel;

    invoke-static {v0, p1}, Lcom/zykj/view/board/board/BoardViewModel;->a(Lcom/zykj/view/board/board/BoardViewModel;F)Ld6/s;

    move-result-object p1

    return-object p1

    :pswitch_5
    iget-object v0, p0, Lcom/zykj/view/board/board/k;->b:Lcom/zykj/view/board/board/BoardViewModel;

    check-cast p1, Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;

    invoke-static {v0, p1}, Lcom/zykj/view/board/board/BoardViewModel;->e(Lcom/zykj/view/board/board/BoardViewModel;Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;)Ld6/s;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
