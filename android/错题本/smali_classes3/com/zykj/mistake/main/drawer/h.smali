.class public final synthetic Lcom/zykj/mistake/main/drawer/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr6/a;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lr6/e;

.field public final synthetic c:Lcom/zykj/mistake/entity/resp/CustomTagInfo;


# direct methods
.method public synthetic constructor <init>(Lr6/e;Lcom/zykj/mistake/entity/resp/CustomTagInfo;I)V
    .locals 0

    .line 1
    iput p3, p0, Lcom/zykj/mistake/main/drawer/h;->a:I

    iput-object p1, p0, Lcom/zykj/mistake/main/drawer/h;->b:Lr6/e;

    iput-object p2, p0, Lcom/zykj/mistake/main/drawer/h;->c:Lcom/zykj/mistake/entity/resp/CustomTagInfo;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, Lcom/zykj/mistake/main/drawer/h;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/mistake/main/drawer/h;->c:Lcom/zykj/mistake/entity/resp/CustomTagInfo;

    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/zykj/mistake/entity/resp/CustomTagInfo;->getId()J

    .line 9
    .line 10
    .line 11
    move-result-wide v1

    .line 12
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-virtual {v0}, Lcom/zykj/mistake/entity/resp/CustomTagInfo;->getName()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    iget-object v2, p0, Lcom/zykj/mistake/main/drawer/h;->b:Lr6/e;

    .line 21
    .line 22
    invoke-interface {v2, v1, v0}, Lr6/e;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    :goto_0
    sget-object v0, Ld6/s;->a:Ld6/s;

    .line 26
    .line 27
    return-object v0

    .line 28
    :pswitch_0
    iget-object v0, p0, Lcom/zykj/mistake/main/drawer/h;->c:Lcom/zykj/mistake/entity/resp/CustomTagInfo;

    .line 29
    .line 30
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 31
    .line 32
    iget-object v2, p0, Lcom/zykj/mistake/main/drawer/h;->b:Lr6/e;

    .line 33
    .line 34
    invoke-interface {v2, v0, v1}, Lr6/e;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    goto :goto_0

    .line 38
    nop

    .line 39
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
