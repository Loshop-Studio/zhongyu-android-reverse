.class public final Lu2/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static volatile b:Lu2/a;


# instance fields
.field public volatile a:Lio/reactivex/internal/operators/observable/c;


# direct methods
.method public static a()Lu2/a;
    .locals 5

    .line 1
    sget-object v0, Lu2/a;->b:Lu2/a;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    const-class v0, Lu2/a;

    .line 6
    .line 7
    monitor-enter v0

    .line 8
    :try_start_0
    sget-object v1, Lu2/a;->b:Lu2/a;

    .line 9
    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    new-instance v1, Lu2/a;

    .line 13
    .line 14
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 15
    .line 16
    .line 17
    new-instance v2, Lio/reactivex/internal/operators/observable/c;

    .line 18
    .line 19
    new-instance v3, Lr0/d;

    .line 20
    .line 21
    invoke-direct {v3}, Lr0/a;-><init>()V

    .line 22
    .line 23
    .line 24
    sget v4, Lcom/xuexiang/xui/R$drawable;->xui_ic_no_img:I

    .line 25
    .line 26
    invoke-virtual {v3, v4}, Lr0/a;->h(I)Lr0/a;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    check-cast v3, Lr0/d;

    .line 31
    .line 32
    sget-object v4, Lb0/o;->a:Lb0/m;

    .line 33
    .line 34
    invoke-virtual {v3, v4}, Lr0/a;->g(Lb0/o;)Lr0/a;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    check-cast v3, Lr0/d;

    .line 39
    .line 40
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 41
    .line 42
    .line 43
    iput-object v2, v1, Lu2/a;->a:Lio/reactivex/internal/operators/observable/c;

    .line 44
    .line 45
    sput-object v1, Lu2/a;->b:Lu2/a;

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :catchall_0
    move-exception v1

    .line 49
    goto :goto_1

    .line 50
    :cond_0
    :goto_0
    monitor-exit v0

    .line 51
    goto :goto_2

    .line 52
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 53
    throw v1

    .line 54
    :cond_1
    :goto_2
    sget-object v0, Lu2/a;->b:Lu2/a;

    .line 55
    .line 56
    return-object v0
.end method
