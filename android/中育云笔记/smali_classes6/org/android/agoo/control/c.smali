.class Lorg/android/agoo/control/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lorg/android/agoo/control/AgooFactory;


# direct methods
.method public constructor <init>(Lorg/android/agoo/control/AgooFactory;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lorg/android/agoo/control/c;->a:Lorg/android/agoo/control/AgooFactory;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public run()V
    .locals 6

    .line 1
    iget-object v0, p0, Lorg/android/agoo/control/c;->a:Lorg/android/agoo/control/AgooFactory;

    .line 2
    .line 3
    invoke-static {v0}, Lorg/android/agoo/control/AgooFactory;->access$100(Lorg/android/agoo/control/AgooFactory;)Lorg/android/agoo/message/MessageService;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Lorg/android/agoo/message/MessageService;->a()Ljava/util/ArrayList;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-lez v1, :cond_1

    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    const-string v2, "size"

    .line 28
    .line 29
    filled-new-array {v2, v1}, [Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    const-string v2, "AgooFactory"

    .line 34
    .line 35
    const-string v3, "reportCacheMsg"

    .line 36
    .line 37
    invoke-static {v2, v3, v1}, Lcom/taobao/accs/utl/ALog;->e(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    const/4 v2, 0x0

    .line 45
    :cond_0
    :goto_0
    if-ge v2, v1, :cond_1

    .line 46
    .line 47
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v3

    .line 51
    add-int/lit8 v2, v2, 0x1

    .line 52
    .line 53
    check-cast v3, Lorg/android/agoo/common/MsgDO;

    .line 54
    .line 55
    if-eqz v3, :cond_0

    .line 56
    .line 57
    const/4 v4, 0x1

    .line 58
    iput-boolean v4, v3, Lorg/android/agoo/common/MsgDO;->isFromCache:Z

    .line 59
    .line 60
    iget-object v4, p0, Lorg/android/agoo/control/c;->a:Lorg/android/agoo/control/AgooFactory;

    .line 61
    .line 62
    invoke-static {v4}, Lorg/android/agoo/control/AgooFactory;->access$200(Lorg/android/agoo/control/AgooFactory;)Lorg/android/agoo/control/NotifManager;

    .line 63
    .line 64
    .line 65
    move-result-object v4

    .line 66
    const/4 v5, 0x0

    .line 67
    invoke-virtual {v4, v3, v5}, Lorg/android/agoo/control/NotifManager;->report(Lorg/android/agoo/common/MsgDO;Lcom/taobao/accs/base/TaoBaseService$ExtraInfo;)V

    .line 68
    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_1
    return-void
.end method
