.class public final synthetic Lcom/zykj/mistake/activity/m;
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
    iput p2, p0, Lcom/zykj/mistake/activity/m;->a:I

    iput-object p1, p0, Lcom/zykj/mistake/activity/m;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget v0, p0, Lcom/zykj/mistake/activity/m;->a:I

    .line 2
    .line 3
    const-string v1, ""

    .line 4
    .line 5
    const-wide/16 v2, 0x0

    .line 6
    .line 7
    const-string v4, "it"

    .line 8
    .line 9
    sget-object v5, Ld6/s;->a:Ld6/s;

    .line 10
    .line 11
    iget-object v6, p0, Lcom/zykj/mistake/activity/m;->b:Ljava/lang/Object;

    .line 12
    .line 13
    packed-switch v0, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    check-cast v6, Ljava/lang/String;

    .line 17
    .line 18
    check-cast p1, Ljava/lang/String;

    .line 19
    .line 20
    sget p1, Lcom/zykj/mistake/activity/SketchActivity;->v:I

    .line 21
    .line 22
    invoke-static {v6}, Lcom/blankj/utilcode/util/e;->g(Ljava/lang/String;)Ljava/io/File;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-static {p1}, Lcom/blankj/utilcode/util/e;->e(Ljava/io/File;)Z

    .line 27
    .line 28
    .line 29
    return-object v5

    .line 30
    :pswitch_0
    check-cast v6, Lcom/zykj/mistake/activity/MistakeListActivity;

    .line 31
    .line 32
    check-cast p1, Ljava/lang/String;

    .line 33
    .line 34
    sget v0, Lcom/zykj/mistake/activity/MistakeListActivity;->x:I

    .line 35
    .line 36
    invoke-static {p1, v4}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v6}, Lcom/zykj/mistake/base/BaseMVPActivity;->r()Lcom/zykj/mistake/base/BasePresenter;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    check-cast v0, Lcom/zykj/mistake/presenter/MistakeListPresenter;

    .line 44
    .line 45
    invoke-virtual {v0, v2, v3, p1, v1}, Lcom/zykj/mistake/presenter/MistakeListPresenter;->c(JLjava/lang/String;Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    return-object v5

    .line 49
    :pswitch_1
    check-cast v6, Lcom/zykj/mistake/activity/MistakeDetailActivity;

    .line 50
    .line 51
    check-cast p1, Ljava/lang/String;

    .line 52
    .line 53
    sget v0, Lcom/zykj/mistake/activity/MistakeDetailActivity;->s:I

    .line 54
    .line 55
    invoke-static {p1, v4}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v6}, Lcom/zykj/mistake/base/BaseMVPActivity;->r()Lcom/zykj/mistake/base/BasePresenter;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    check-cast v0, Lcom/zykj/mistake/presenter/MistakeDetailPresenter;

    .line 63
    .line 64
    invoke-virtual {v0, v2, v3, p1, v1}, Lcom/zykj/mistake/presenter/MistakeDetailPresenter;->c(JLjava/lang/String;Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    return-object v5

    .line 68
    :pswitch_2
    check-cast v6, Lcom/zykj/mistake/activity/MistakeCreateOrEditActivity;

    .line 69
    .line 70
    check-cast p1, Ljava/lang/String;

    .line 71
    .line 72
    sget v0, Lcom/zykj/mistake/activity/MistakeCreateOrEditActivity;->u:I

    .line 73
    .line 74
    invoke-static {p1, v4}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {v6}, Lcom/zykj/mistake/base/BaseMVPActivity;->r()Lcom/zykj/mistake/base/BasePresenter;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    check-cast v0, Lcom/zykj/mistake/presenter/MistakeCreateOrEditPresenter;

    .line 82
    .line 83
    invoke-virtual {v0, v2, v3, p1, v1}, Lcom/zykj/mistake/presenter/MistakeCreateOrEditPresenter;->c(JLjava/lang/String;Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    return-object v5

    .line 87
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
