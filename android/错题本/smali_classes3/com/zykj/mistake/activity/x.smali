.class public final synthetic Lcom/zykj/mistake/activity/x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr6/a;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lcom/zykj/mistake/activity/MistakeDetailActivity;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/mistake/activity/MistakeDetailActivity;I)V
    .locals 0

    .line 1
    iput p2, p0, Lcom/zykj/mistake/activity/x;->a:I

    iput-object p1, p0, Lcom/zykj/mistake/activity/x;->b:Lcom/zykj/mistake/activity/MistakeDetailActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, Lcom/zykj/mistake/activity/x;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/mistake/activity/x;->b:Lcom/zykj/mistake/activity/MistakeDetailActivity;

    .line 7
    .line 8
    iget v1, v0, Lcom/zykj/mistake/activity/MistakeDetailActivity;->r:I

    .line 9
    .line 10
    iget-object v2, v0, Lcom/zykj/mistake/activity/MistakeDetailActivity;->q:Ljava/util/ArrayList;

    .line 11
    .line 12
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    add-int/lit8 v2, v2, -0x1

    .line 17
    .line 18
    if-ge v1, v2, :cond_0

    .line 19
    .line 20
    iget v1, v0, Lcom/zykj/mistake/activity/MistakeDetailActivity;->r:I

    .line 21
    .line 22
    add-int/lit8 v1, v1, 0x1

    .line 23
    .line 24
    iput v1, v0, Lcom/zykj/mistake/activity/MistakeDetailActivity;->r:I

    .line 25
    .line 26
    invoke-virtual {v0}, Lcom/zykj/mistake/activity/MistakeDetailActivity;->A()V

    .line 27
    .line 28
    .line 29
    const-string v0, "\u4e0b\u4e00\u9898"

    .line 30
    .line 31
    const/4 v1, 0x4

    .line 32
    const-string v2, "MistakeDetailSwitch"

    .line 33
    .line 34
    invoke-static {v1, v2, v0}, Lcom/zykj/mistake/utils/e;->b(ILjava/lang/String;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    const-string v1, "\u5df2\u662f\u6700\u540e\u4e00\u9898"

    .line 39
    .line 40
    invoke-virtual {v0, v1}, Lcom/zykj/mistake/base/BaseMVPActivity;->b(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    :goto_0
    sget-object v0, Ld6/s;->a:Ld6/s;

    .line 44
    .line 45
    return-object v0

    .line 46
    :pswitch_0
    iget-object v0, p0, Lcom/zykj/mistake/activity/x;->b:Lcom/zykj/mistake/activity/MistakeDetailActivity;

    .line 47
    .line 48
    iget v1, v0, Lcom/zykj/mistake/activity/MistakeDetailActivity;->r:I

    .line 49
    .line 50
    if-lez v1, :cond_1

    .line 51
    .line 52
    add-int/lit8 v1, v1, -0x1

    .line 53
    .line 54
    iput v1, v0, Lcom/zykj/mistake/activity/MistakeDetailActivity;->r:I

    .line 55
    .line 56
    invoke-virtual {v0}, Lcom/zykj/mistake/activity/MistakeDetailActivity;->A()V

    .line 57
    .line 58
    .line 59
    const-string v0, "\u4e0a\u4e00\u9898"

    .line 60
    .line 61
    const/4 v1, 0x4

    .line 62
    const-string v2, "MistakeDetailSwitch"

    .line 63
    .line 64
    invoke-static {v1, v2, v0}, Lcom/zykj/mistake/utils/e;->b(ILjava/lang/String;Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    goto :goto_1

    .line 68
    :cond_1
    const-string v1, "\u5df2\u662f\u7b2c\u4e00\u9898"

    .line 69
    .line 70
    invoke-virtual {v0, v1}, Lcom/zykj/mistake/base/BaseMVPActivity;->b(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    :goto_1
    sget-object v0, Ld6/s;->a:Ld6/s;

    .line 74
    .line 75
    return-object v0

    .line 76
    nop

    .line 77
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
