.class public final synthetic Lcom/zykj/view/board/board/e;
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
    iput p2, p0, Lcom/zykj/view/board/board/e;->a:I

    iput-object p1, p0, Lcom/zykj/view/board/board/e;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/view/board/board/e;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lcom/zykj/view/board/board/e;->b:Ljava/lang/Object;

    check-cast v0, Lr6/c;

    check-cast p1, Ljava/lang/String;

    invoke-static {v0, p1}, Lcom/zykj/view/board/board/DialogKt;->b(Lr6/c;Ljava/lang/String;)Ld6/s;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lcom/zykj/view/board/board/e;->b:Ljava/lang/Object;

    check-cast v0, Ljava/io/File;

    check-cast p1, Ljava/lang/String;

    invoke-static {v0, p1}, Lcom/zykj/view/board/board/BoardFragment;->q(Ljava/io/File;Ljava/lang/String;)Ld6/s;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lcom/zykj/view/board/board/e;->b:Ljava/lang/Object;

    check-cast v0, Ljava/io/File;

    check-cast p1, Ljava/lang/String;

    invoke-static {v0, p1}, Lcom/zykj/view/board/board/BoardFragment;->U(Ljava/io/File;Ljava/lang/String;)Ld6/s;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
