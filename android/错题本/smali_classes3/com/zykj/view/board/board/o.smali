.class public final synthetic Lcom/zykj/view/board/board/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr6/c;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ld6/d;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ld6/d;I)V
    .locals 0

    .line 1
    iput p3, p0, Lcom/zykj/view/board/board/o;->a:I

    iput-object p1, p0, Lcom/zykj/view/board/board/o;->b:Ljava/lang/Object;

    iput-object p2, p0, Lcom/zykj/view/board/board/o;->c:Ld6/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, Lcom/zykj/view/board/board/o;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lcom/zykj/view/board/board/o;->b:Ljava/lang/Object;

    check-cast v0, Lr6/c;

    iget-object v1, p0, Lcom/zykj/view/board/board/o;->c:Ld6/d;

    check-cast v1, Lr6/a;

    check-cast p1, Landroid/net/Uri;

    invoke-static {v0, v1, p1}, Lcom/zykj/view/board/board/BoardFragment$initBasicData$3;->a(Lr6/c;Lr6/a;Landroid/net/Uri;)Ld6/s;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lcom/zykj/view/board/board/o;->b:Ljava/lang/Object;

    check-cast v0, Lcom/zykj/view/board/board/BoardViewModel;

    iget-object v1, p0, Lcom/zykj/view/board/board/o;->c:Ld6/d;

    check-cast v1, Lr6/e;

    check-cast p1, Ljava/lang/Throwable;

    invoke-static {v0, v1, p1}, Lcom/zykj/view/board/board/BoardViewModel$getSavePath$3;->e(Lcom/zykj/view/board/board/BoardViewModel;Lr6/e;Ljava/lang/Throwable;)Ld6/s;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lcom/zykj/view/board/board/o;->b:Ljava/lang/Object;

    check-cast v0, Lcom/zykj/view/board/board/BoardViewModel;

    iget-object v1, p0, Lcom/zykj/view/board/board/o;->c:Ld6/d;

    check-cast v1, Lr6/e;

    check-cast p1, Ljava/lang/String;

    invoke-static {v0, v1, p1}, Lcom/zykj/view/board/board/BoardViewModel$getSavePath$3;->f(Lcom/zykj/view/board/board/BoardViewModel;Lr6/e;Ljava/lang/String;)Ld6/s;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
