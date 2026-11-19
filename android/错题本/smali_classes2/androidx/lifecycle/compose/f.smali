.class public final synthetic Landroidx/lifecycle/compose/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/LifecycleEventObserver;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Landroidx/lifecycle/compose/f;->a:I

    iput-object p2, p0, Landroidx/lifecycle/compose/f;->b:Ljava/lang/Object;

    iput-object p3, p0, Landroidx/lifecycle/compose/f;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onStateChanged(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Lifecycle$Event;)V
    .locals 3

    .line 1
    iget v0, p0, Landroidx/lifecycle/compose/f;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Landroidx/lifecycle/compose/f;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Ljava/lang/String;

    .line 9
    .line 10
    iget-object v1, p0, Landroidx/lifecycle/compose/f;->c:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v1, Lu4/g;

    .line 13
    .line 14
    const-string v2, "<unused var>"

    .line 15
    .line 16
    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    const-string p1, "event"

    .line 20
    .line 21
    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    sget-object p1, Landroidx/lifecycle/Lifecycle$Event;->ON_DESTROY:Landroidx/lifecycle/Lifecycle$Event;

    .line 25
    .line 26
    if-ne p2, p1, :cond_2

    .line 27
    .line 28
    sget-object p1, Lcom/zykj/mistake/utils/e;->a:Lcom/zykj/mistake/utils/e;

    .line 29
    .line 30
    monitor-enter p1

    .line 31
    :try_start_0
    const-string p2, "ownerId"

    .line 32
    .line 33
    invoke-static {v0, p2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    sget-object p2, Lcom/zykj/mistake/utils/e;->b:Ljava/lang/String;

    .line 37
    .line 38
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 42
    if-nez p2, :cond_0

    .line 43
    .line 44
    monitor-exit p1

    .line 45
    goto :goto_1

    .line 46
    :cond_0
    :try_start_1
    sget-object p2, Lcom/zykj/mistake/utils/e;->c:Lcoil3/r;

    .line 47
    .line 48
    if-eqz p2, :cond_1

    .line 49
    .line 50
    invoke-virtual {p2}, Lcoil3/r;->d()Lq/e;

    .line 51
    .line 52
    .line 53
    move-result-object p2

    .line 54
    if-eqz p2, :cond_1

    .line 55
    .line 56
    invoke-virtual {p2}, Lq/e;->a()V

    .line 57
    .line 58
    .line 59
    goto :goto_0

    .line 60
    :catchall_0
    move-exception p2

    .line 61
    goto :goto_2

    .line 62
    :cond_1
    :goto_0
    const/4 p2, 0x0

    .line 63
    sput-object p2, Lcom/zykj/mistake/utils/e;->c:Lcoil3/r;

    .line 64
    .line 65
    sput-object p2, Lcom/zykj/mistake/utils/e;->b:Ljava/lang/String;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 66
    .line 67
    monitor-exit p1

    .line 68
    :goto_1
    sget-object p1, Lt4/h;->a:Lt4/h;

    .line 69
    .line 70
    iget-object p2, v1, Lu4/g;->l:Ljava/lang/String;

    .line 71
    .line 72
    invoke-virtual {p1, p2}, Lt4/h;->a(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    goto :goto_3

    .line 76
    :goto_2
    :try_start_2
    monitor-exit p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 77
    throw p2

    .line 78
    :cond_2
    :goto_3
    return-void

    .line 79
    :pswitch_0
    iget-object v0, p0, Landroidx/lifecycle/compose/f;->b:Ljava/lang/Object;

    .line 80
    .line 81
    check-cast v0, Landroidx/lifecycle/Lifecycle$Event;

    .line 82
    .line 83
    iget-object v1, p0, Landroidx/lifecycle/compose/f;->c:Ljava/lang/Object;

    .line 84
    .line 85
    check-cast v1, Landroidx/compose/runtime/State;

    .line 86
    .line 87
    invoke-static {v0, v1, p1, p2}, Landroidx/lifecycle/compose/LifecycleEffectKt;->q(Landroidx/lifecycle/Lifecycle$Event;Landroidx/compose/runtime/State;Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Lifecycle$Event;)V

    .line 88
    .line 89
    .line 90
    return-void

    .line 91
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
