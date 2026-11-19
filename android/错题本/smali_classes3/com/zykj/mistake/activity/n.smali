.class public final synthetic Lcom/zykj/mistake/activity/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr6/c;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:J

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:Lcom/zykj/mistake/base/BaseMVPActivity;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/mistake/base/BaseMVPActivity;JLjava/lang/String;I)V
    .locals 0

    .line 1
    iput p5, p0, Lcom/zykj/mistake/activity/n;->a:I

    iput-object p1, p0, Lcom/zykj/mistake/activity/n;->d:Lcom/zykj/mistake/base/BaseMVPActivity;

    iput-wide p2, p0, Lcom/zykj/mistake/activity/n;->b:J

    iput-object p4, p0, Lcom/zykj/mistake/activity/n;->c:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget v0, p0, Lcom/zykj/mistake/activity/n;->a:I

    .line 2
    .line 3
    sget-object v1, Ld6/s;->a:Ld6/s;

    .line 4
    .line 5
    const-string v2, "it"

    .line 6
    .line 7
    iget-object v3, p0, Lcom/zykj/mistake/activity/n;->c:Ljava/lang/String;

    .line 8
    .line 9
    iget-wide v4, p0, Lcom/zykj/mistake/activity/n;->b:J

    .line 10
    .line 11
    iget-object v6, p0, Lcom/zykj/mistake/activity/n;->d:Lcom/zykj/mistake/base/BaseMVPActivity;

    .line 12
    .line 13
    packed-switch v0, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    check-cast v6, Lcom/zykj/mistake/activity/MistakeListActivity;

    .line 17
    .line 18
    check-cast p1, Ljava/lang/String;

    .line 19
    .line 20
    sget v0, Lcom/zykj/mistake/activity/MistakeListActivity;->x:I

    .line 21
    .line 22
    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v6}, Lcom/zykj/mistake/base/BaseMVPActivity;->r()Lcom/zykj/mistake/base/BasePresenter;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    check-cast v0, Lcom/zykj/mistake/presenter/MistakeListPresenter;

    .line 30
    .line 31
    invoke-virtual {v0, v4, v5, p1, v3}, Lcom/zykj/mistake/presenter/MistakeListPresenter;->c(JLjava/lang/String;Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    return-object v1

    .line 35
    :pswitch_0
    check-cast v6, Lcom/zykj/mistake/activity/MistakeDetailActivity;

    .line 36
    .line 37
    check-cast p1, Ljava/lang/String;

    .line 38
    .line 39
    sget v0, Lcom/zykj/mistake/activity/MistakeDetailActivity;->s:I

    .line 40
    .line 41
    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v6}, Lcom/zykj/mistake/base/BaseMVPActivity;->r()Lcom/zykj/mistake/base/BasePresenter;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    check-cast v0, Lcom/zykj/mistake/presenter/MistakeDetailPresenter;

    .line 49
    .line 50
    invoke-virtual {v0, v4, v5, p1, v3}, Lcom/zykj/mistake/presenter/MistakeDetailPresenter;->c(JLjava/lang/String;Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    return-object v1

    .line 54
    :pswitch_1
    check-cast v6, Lcom/zykj/mistake/activity/MistakeCreateOrEditActivity;

    .line 55
    .line 56
    check-cast p1, Ljava/lang/String;

    .line 57
    .line 58
    sget v0, Lcom/zykj/mistake/activity/MistakeCreateOrEditActivity;->u:I

    .line 59
    .line 60
    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v6}, Lcom/zykj/mistake/base/BaseMVPActivity;->r()Lcom/zykj/mistake/base/BasePresenter;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    check-cast v0, Lcom/zykj/mistake/presenter/MistakeCreateOrEditPresenter;

    .line 68
    .line 69
    invoke-virtual {v0, v4, v5, p1, v3}, Lcom/zykj/mistake/presenter/MistakeCreateOrEditPresenter;->c(JLjava/lang/String;Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    return-object v1

    .line 73
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
