.class Lcom/tencent/smtt/sdk/ay;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/tencent/smtt/sdk/TbsReaderView$ReaderCallback;


# instance fields
.field final synthetic a:Lcom/tencent/smtt/sdk/TbsReaderView;


# direct methods
.method public constructor <init>(Lcom/tencent/smtt/sdk/TbsReaderView;)V
    .locals 0

    iput-object p1, p0, Lcom/tencent/smtt/sdk/ay;->a:Lcom/tencent/smtt/sdk/TbsReaderView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCallBackAction(Ljava/lang/Integer;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 17

    move-object/from16 v0, p0

    const/16 v1, 0x1393

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual/range {p1 .. p1}, Ljava/lang/Integer;->intValue()I

    move-result v2

    const/16 v3, 0x13a2

    const-string v4, "docpath"

    const-string v5, ""

    const/4 v6, 0x0

    const-string v7, "channel_id"

    const-string v8, "statistics"

    const-string v9, "tip"

    const/4 v10, 0x1

    const/4 v11, 0x0

    if-eq v2, v3, :cond_8

    const/16 v3, 0x13a6

    if-eq v2, v3, :cond_7

    packed-switch v2, :pswitch_data_0

    move-object/from16 v1, p1

    move-object/from16 v3, p2

    :goto_0
    move v10, v11

    goto/16 :goto_4

    :pswitch_0
    iget-object v2, v0, Lcom/tencent/smtt/sdk/ay;->a:Lcom/tencent/smtt/sdk/TbsReaderView;

    iget-object v2, v2, Lcom/tencent/smtt/sdk/TbsReaderView;->a:Landroid/content/Context;

    invoke-static {v2}, Lcom/tencent/smtt/sdk/a/d;->c(Landroid/content/Context;)Z

    move-result v2

    if-nez v2, :cond_0

    iget-object v2, v0, Lcom/tencent/smtt/sdk/ay;->a:Lcom/tencent/smtt/sdk/TbsReaderView;

    iget-object v2, v2, Lcom/tencent/smtt/sdk/TbsReaderView;->a:Landroid/content/Context;

    const/16 v3, 0x139e

    invoke-static {v2, v3}, Lcom/tencent/smtt/sdk/TbsReaderView;->getResString(Landroid/content/Context;I)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Landroid/os/Bundle;

    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    invoke-virtual {v3, v9, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "AHNG816"

    invoke-virtual {v3, v8, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const/16 v2, 0x2a53

    invoke-virtual {v3, v7, v2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    iget-object v2, v0, Lcom/tencent/smtt/sdk/ay;->a:Lcom/tencent/smtt/sdk/TbsReaderView;

    const-string v4, "AHNG815"

    :goto_1
    invoke-virtual {v2, v4}, Lcom/tencent/smtt/sdk/TbsReaderView;->userStatistics(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    if-eqz p2, :cond_1

    move-object/from16 v6, p2

    check-cast v6, Landroid/os/Bundle;

    invoke-virtual {v6, v4}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    :cond_1
    move-object v12, v5

    move-object/from16 v16, v6

    iget-object v1, v0, Lcom/tencent/smtt/sdk/ay;->a:Lcom/tencent/smtt/sdk/TbsReaderView;

    iget-object v11, v1, Lcom/tencent/smtt/sdk/TbsReaderView;->a:Landroid/content/Context;

    const/4 v14, 0x0

    const-string v15, "txt"

    const/4 v13, 0x4

    invoke-static/range {v11 .. v16}, Lcom/tencent/smtt/sdk/QbSdk;->startQBForDoc(Landroid/content/Context;Ljava/lang/String;IILjava/lang/String;Landroid/os/Bundle;)Z

    :cond_2
    :goto_2
    move-object/from16 v1, p1

    move-object/from16 v3, p2

    goto/16 :goto_4

    :pswitch_1
    iget-object v2, v0, Lcom/tencent/smtt/sdk/ay;->a:Lcom/tencent/smtt/sdk/TbsReaderView;

    iget-object v2, v2, Lcom/tencent/smtt/sdk/TbsReaderView;->a:Landroid/content/Context;

    invoke-static {v2}, Lcom/tencent/smtt/sdk/a/d;->c(Landroid/content/Context;)Z

    move-result v2

    if-nez v2, :cond_3

    iget-object v2, v0, Lcom/tencent/smtt/sdk/ay;->a:Lcom/tencent/smtt/sdk/TbsReaderView;

    iget-object v2, v2, Lcom/tencent/smtt/sdk/TbsReaderView;->a:Landroid/content/Context;

    const/16 v3, 0x139d

    invoke-static {v2, v3}, Lcom/tencent/smtt/sdk/TbsReaderView;->getResString(Landroid/content/Context;I)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Landroid/os/Bundle;

    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    invoke-virtual {v3, v9, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "AHNG808"

    invoke-virtual {v3, v8, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const/16 v2, 0x2a51

    invoke-virtual {v3, v7, v2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    iget-object v2, v0, Lcom/tencent/smtt/sdk/ay;->a:Lcom/tencent/smtt/sdk/TbsReaderView;

    const-string v4, "AHNG807"

    goto :goto_1

    :cond_3
    if-eqz p2, :cond_4

    move-object/from16 v6, p2

    check-cast v6, Landroid/os/Bundle;

    invoke-virtual {v6, v4}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    :cond_4
    move-object v12, v5

    move-object/from16 v16, v6

    iget-object v1, v0, Lcom/tencent/smtt/sdk/ay;->a:Lcom/tencent/smtt/sdk/TbsReaderView;

    iget-object v11, v1, Lcom/tencent/smtt/sdk/TbsReaderView;->a:Landroid/content/Context;

    const/4 v14, 0x0

    const-string v15, ""

    const/4 v13, 0x4

    invoke-static/range {v11 .. v16}, Lcom/tencent/smtt/sdk/QbSdk;->startQBForDoc(Landroid/content/Context;Ljava/lang/String;IILjava/lang/String;Landroid/os/Bundle;)Z

    iget-object v1, v0, Lcom/tencent/smtt/sdk/ay;->a:Lcom/tencent/smtt/sdk/TbsReaderView;

    const-string v2, "AHNG809"

    :goto_3
    invoke-virtual {v1, v2}, Lcom/tencent/smtt/sdk/TbsReaderView;->userStatistics(Ljava/lang/String;)V

    goto :goto_2

    :pswitch_2
    iget-object v2, v0, Lcom/tencent/smtt/sdk/ay;->a:Lcom/tencent/smtt/sdk/TbsReaderView;

    iget-object v2, v2, Lcom/tencent/smtt/sdk/TbsReaderView;->a:Landroid/content/Context;

    invoke-static {v2}, Lcom/tencent/smtt/sdk/a/d;->c(Landroid/content/Context;)Z

    move-result v2

    if-nez v2, :cond_5

    iget-object v2, v0, Lcom/tencent/smtt/sdk/ay;->a:Lcom/tencent/smtt/sdk/TbsReaderView;

    iget-object v2, v2, Lcom/tencent/smtt/sdk/TbsReaderView;->a:Landroid/content/Context;

    const/16 v3, 0x139f

    invoke-static {v2, v3}, Lcom/tencent/smtt/sdk/TbsReaderView;->getResString(Landroid/content/Context;I)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Landroid/os/Bundle;

    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    invoke-virtual {v3, v9, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "AHNG812"

    invoke-virtual {v3, v8, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const/16 v2, 0x2a52

    invoke-virtual {v3, v7, v2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    iget-object v2, v0, Lcom/tencent/smtt/sdk/ay;->a:Lcom/tencent/smtt/sdk/TbsReaderView;

    const-string v4, "AHNG811"

    goto/16 :goto_1

    :cond_5
    if-eqz p2, :cond_6

    move-object/from16 v6, p2

    check-cast v6, Landroid/os/Bundle;

    invoke-virtual {v6, v4}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    :cond_6
    move-object v12, v5

    move-object/from16 v16, v6

    iget-object v1, v0, Lcom/tencent/smtt/sdk/ay;->a:Lcom/tencent/smtt/sdk/TbsReaderView;

    iget-object v11, v1, Lcom/tencent/smtt/sdk/TbsReaderView;->a:Landroid/content/Context;

    const/4 v14, 0x0

    const-string v15, "pdf"

    const/4 v13, 0x4

    invoke-static/range {v11 .. v16}, Lcom/tencent/smtt/sdk/QbSdk;->startQBForDoc(Landroid/content/Context;Ljava/lang/String;IILjava/lang/String;Landroid/os/Bundle;)Z

    iget-object v1, v0, Lcom/tencent/smtt/sdk/ay;->a:Lcom/tencent/smtt/sdk/TbsReaderView;

    const-string v2, "AHNG813"

    goto :goto_3

    :cond_7
    if-eqz p2, :cond_2

    move-object/from16 v1, p2

    check-cast v1, Landroid/os/Bundle;

    const-string v2, "name"

    invoke-virtual {v1, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    sput-object v2, Lcom/tencent/smtt/sdk/TbsReaderView;->gReaderPackName:Ljava/lang/String;

    const-string v2, "version"

    invoke-virtual {v1, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    sput-object v1, Lcom/tencent/smtt/sdk/TbsReaderView;->gReaderPackVersion:Ljava/lang/String;

    goto/16 :goto_2

    :cond_8
    iget-object v2, v0, Lcom/tencent/smtt/sdk/ay;->a:Lcom/tencent/smtt/sdk/TbsReaderView;

    iget-object v2, v2, Lcom/tencent/smtt/sdk/TbsReaderView;->a:Landroid/content/Context;

    invoke-static {v2}, Lcom/tencent/smtt/sdk/a/d;->c(Landroid/content/Context;)Z

    move-result v2

    if-nez v2, :cond_9

    iget-object v2, v0, Lcom/tencent/smtt/sdk/ay;->a:Lcom/tencent/smtt/sdk/TbsReaderView;

    iget-object v2, v2, Lcom/tencent/smtt/sdk/TbsReaderView;->a:Landroid/content/Context;

    const/16 v3, 0x13a5

    invoke-static {v2, v3}, Lcom/tencent/smtt/sdk/TbsReaderView;->getResString(Landroid/content/Context;I)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Landroid/os/Bundle;

    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    invoke-virtual {v3, v9, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "AHNG828"

    invoke-virtual {v3, v8, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const/16 v2, 0x2ad5

    invoke-virtual {v3, v7, v2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    iget-object v2, v0, Lcom/tencent/smtt/sdk/ay;->a:Lcom/tencent/smtt/sdk/TbsReaderView;

    const-string v4, "AHNG827"

    goto/16 :goto_1

    :cond_9
    if-eqz p2, :cond_a

    move-object/from16 v6, p2

    check-cast v6, Landroid/os/Bundle;

    invoke-virtual {v6, v4}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    :cond_a
    move-object v12, v5

    move-object/from16 v16, v6

    iget-object v1, v0, Lcom/tencent/smtt/sdk/ay;->a:Lcom/tencent/smtt/sdk/TbsReaderView;

    iget-object v11, v1, Lcom/tencent/smtt/sdk/TbsReaderView;->a:Landroid/content/Context;

    const/4 v14, 0x0

    const-string v15, "doc"

    const/4 v13, 0x4

    invoke-static/range {v11 .. v16}, Lcom/tencent/smtt/sdk/QbSdk;->startQBForDoc(Landroid/content/Context;Ljava/lang/String;IILjava/lang/String;Landroid/os/Bundle;)Z

    iget-object v1, v0, Lcom/tencent/smtt/sdk/ay;->a:Lcom/tencent/smtt/sdk/TbsReaderView;

    const-string v2, "AHNG829"

    goto/16 :goto_3

    :goto_4
    iget-object v2, v0, Lcom/tencent/smtt/sdk/ay;->a:Lcom/tencent/smtt/sdk/TbsReaderView;

    iget-object v2, v2, Lcom/tencent/smtt/sdk/TbsReaderView;->d:Lcom/tencent/smtt/sdk/TbsReaderView$ReaderCallback;

    if-eqz v2, :cond_b

    if-nez v10, :cond_b

    move-object/from16 v4, p3

    invoke-interface {v2, v1, v3, v4}, Lcom/tencent/smtt/sdk/TbsReaderView$ReaderCallback;->onCallBackAction(Ljava/lang/Integer;Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_b
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1390
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
