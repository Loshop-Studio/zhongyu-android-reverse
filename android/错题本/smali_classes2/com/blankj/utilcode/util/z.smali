.class public final Lcom/blankj/utilcode/util/z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Landroid/app/Activity;

.field public final synthetic c:Lcom/blankj/utilcode/util/b0;

.field public final synthetic d:Lcom/blankj/utilcode/util/y;


# direct methods
.method public synthetic constructor <init>(Lcom/blankj/utilcode/util/b0;Landroid/app/Activity;Lcom/blankj/utilcode/util/u;I)V
    .locals 0

    .line 1
    iput p4, p0, Lcom/blankj/utilcode/util/z;->a:I

    iput-object p1, p0, Lcom/blankj/utilcode/util/z;->c:Lcom/blankj/utilcode/util/b0;

    iput-object p2, p0, Lcom/blankj/utilcode/util/z;->b:Landroid/app/Activity;

    iput-object p3, p0, Lcom/blankj/utilcode/util/z;->d:Lcom/blankj/utilcode/util/y;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 1
    iget v0, p0, Lcom/blankj/utilcode/util/z;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/blankj/utilcode/util/z;->c:Lcom/blankj/utilcode/util/b0;

    .line 7
    .line 8
    iget-object v0, v0, Lcom/blankj/utilcode/util/b0;->c:Ljava/util/concurrent/ConcurrentHashMap;

    .line 9
    .line 10
    iget-object v1, p0, Lcom/blankj/utilcode/util/z;->b:Landroid/app/Activity;

    .line 11
    .line 12
    invoke-virtual {v0, v1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    check-cast v0, Ljava/util/List;

    .line 17
    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-nez v1, :cond_0

    .line 25
    .line 26
    iget-object v1, p0, Lcom/blankj/utilcode/util/z;->d:Lcom/blankj/utilcode/util/y;

    .line 27
    .line 28
    invoke-interface {v0, v1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    :cond_0
    return-void

    .line 32
    :pswitch_0
    iget-object v0, p0, Lcom/blankj/utilcode/util/z;->d:Lcom/blankj/utilcode/util/y;

    .line 33
    .line 34
    check-cast v0, Lcom/blankj/utilcode/util/u;

    .line 35
    .line 36
    iget-object v1, p0, Lcom/blankj/utilcode/util/z;->c:Lcom/blankj/utilcode/util/b0;

    .line 37
    .line 38
    iget-object v1, v1, Lcom/blankj/utilcode/util/b0;->c:Ljava/util/concurrent/ConcurrentHashMap;

    .line 39
    .line 40
    iget-object v2, p0, Lcom/blankj/utilcode/util/z;->b:Landroid/app/Activity;

    .line 41
    .line 42
    invoke-virtual {v1, v2}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    check-cast v3, Ljava/util/List;

    .line 47
    .line 48
    if-nez v3, :cond_1

    .line 49
    .line 50
    new-instance v3, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 51
    .line 52
    invoke-direct {v3}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v1, v2, v3}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_1
    invoke-interface {v3, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result v1

    .line 63
    if-eqz v1, :cond_2

    .line 64
    .line 65
    goto :goto_1

    .line 66
    :cond_2
    :goto_0
    invoke-interface {v3, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    :goto_1
    return-void

    .line 70
    nop

    .line 71
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
