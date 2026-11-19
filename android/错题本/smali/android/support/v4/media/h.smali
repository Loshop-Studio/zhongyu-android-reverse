.class public final Landroid/support/v4/media/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lz/d;
.implements Lu/a;
.implements Lcom/tencent/bugly/proguard/ah;
.implements Ly/h;
.implements Li0/l;
.implements Lo5/b;
.implements Lq/i;
.implements Lretrofit2/g;
.implements Lretrofit2/h;
.implements Lokhttp3/f;


# instance fields
.field public final synthetic a:I

.field public b:Ljava/lang/Object;

.field public c:Ljava/lang/Object;


# direct methods
.method public constructor <init>(I)V
    .locals 1

    iput p1, p0, Landroid/support/v4/media/h;->a:I

    sparse-switch p1, :sswitch_data_0

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    new-instance p1, Lc0/d;

    const/4 v0, 0x0

    .line 6
    invoke-direct {p1, v0}, Lc0/d;-><init>(Lc0/i;)V

    .line 7
    iput-object p1, p0, Landroid/support/v4/media/h;->b:Ljava/lang/Object;

    .line 8
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Landroid/support/v4/media/h;->c:Ljava/lang/Object;

    return-void

    .line 9
    :sswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Landroid/support/v4/media/h;->b:Ljava/lang/Object;

    .line 11
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Landroid/support/v4/media/h;->c:Ljava/lang/Object;

    return-void

    .line 12
    :sswitch_1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    new-instance p1, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {p1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    iput-object p1, p0, Landroid/support/v4/media/h;->b:Ljava/lang/Object;

    .line 14
    new-instance p1, Landroidx/collection/ArrayMap;

    invoke-direct {p1}, Landroidx/collection/ArrayMap;-><init>()V

    iput-object p1, p0, Landroid/support/v4/media/h;->c:Ljava/lang/Object;

    return-void

    .line 15
    :sswitch_2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Landroid/support/v4/media/h;->b:Ljava/lang/Object;

    .line 17
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Landroid/support/v4/media/h;->c:Ljava/lang/Object;

    return-void

    .line 18
    :sswitch_3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Landroid/support/v4/media/h;->b:Ljava/lang/Object;

    .line 20
    new-instance p1, Ld0/c;

    const/4 v0, 0x0

    invoke-direct {p1, v0}, Ld0/c;-><init>(I)V

    iput-object p1, p0, Landroid/support/v4/media/h;->c:Ljava/lang/Object;

    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0xa -> :sswitch_3
        0x14 -> :sswitch_2
        0x17 -> :sswitch_1
        0x18 -> :sswitch_0
    .end sparse-switch
.end method

.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Landroid/support/v4/media/h;->a:I

    iput-object p2, p0, Landroid/support/v4/media/h;->c:Ljava/lang/Object;

    iput-object p3, p0, Landroid/support/v4/media/h;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/Object;ZLjava/lang/Object;)V
    .locals 0

    .line 2
    iput p1, p0, Landroid/support/v4/media/h;->a:I

    iput-object p2, p0, Landroid/support/v4/media/h;->b:Ljava/lang/Object;

    iput-object p4, p0, Landroid/support/v4/media/h;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(IZ)V
    .locals 0

    .line 3
    iput p1, p0, Landroid/support/v4/media/h;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(JLd2/c;)V
    .locals 1

    const/16 v0, 0x16

    iput v0, p0, Landroid/support/v4/media/h;->a:I

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    iput-object p3, p0, Landroid/support/v4/media/h;->b:Ljava/lang/Object;

    .line 27
    new-instance p3, Lq/g;

    invoke-direct {p3, p1, p2, p0}, Lq/g;-><init>(JLandroid/support/v4/media/h;)V

    iput-object p3, p0, Landroid/support/v4/media/h;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lio/objectbox/Property;Lio/objectbox/query/QueryCondition$PropertyCondition$Operation;[Ljava/lang/Object;)V
    .locals 1

    const/16 v0, 0x13

    iput v0, p0, Landroid/support/v4/media/h;->a:I

    if-nez p3, :cond_2

    .line 35
    sget-object p1, Lio/objectbox/query/QueryCondition$PropertyCondition$Operation;->IS_NULL:Lio/objectbox/query/QueryCondition$PropertyCondition$Operation;

    if-eq p2, p1, :cond_1

    sget-object p1, Lio/objectbox/query/QueryCondition$PropertyCondition$Operation;->IS_NOT_NULL:Lio/objectbox/query/QueryCondition$PropertyCondition$Operation;

    if-ne p2, p1, :cond_0

    goto :goto_0

    .line 36
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "This operation requires non-null values."

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    const/4 p3, 0x0

    goto :goto_2

    :cond_2
    const/4 p2, 0x0

    .line 37
    :goto_1
    array-length v0, p3

    if-ge p2, v0, :cond_3

    .line 38
    aget-object v0, p3, p2

    invoke-static {p1, v0}, Landroid/support/v4/media/h;->r(Lio/objectbox/Property;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    aput-object v0, p3, p2

    add-int/lit8 p2, p2, 0x1

    goto :goto_1

    .line 39
    :cond_3
    :goto_2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 40
    iput-object p3, p0, Landroid/support/v4/media/h;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lio/objectbox/Property;Ljava/lang/Object;)V
    .locals 1

    const/16 v0, 0x13

    iput v0, p0, Landroid/support/v4/media/h;->a:I

    .line 28
    invoke-static {p1, p2}, Landroid/support/v4/media/h;->r(Lio/objectbox/Property;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 30
    iput-object p1, p0, Landroid/support/v4/media/h;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    const/4 p3, 0x6

    iput p3, p0, Landroid/support/v4/media/h;->a:I

    .line 41
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 42
    iput-object p1, p0, Landroid/support/v4/media/h;->b:Ljava/lang/Object;

    .line 43
    iput-object p2, p0, Landroid/support/v4/media/h;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lr6/c;I)V
    .locals 0

    iput p2, p0, Landroid/support/v4/media/h;->a:I

    packed-switch p2, :pswitch_data_0

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroid/support/v4/media/h;->b:Ljava/lang/Object;

    .line 22
    new-instance p1, Lm7/q;

    invoke-direct {p1}, Lm7/q;-><init>()V

    iput-object p1, p0, Landroid/support/v4/media/h;->c:Ljava/lang/Object;

    return-void

    .line 23
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroid/support/v4/media/h;->b:Ljava/lang/Object;

    .line 24
    new-instance p1, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {p1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object p1, p0, Landroid/support/v4/media/h;->c:Ljava/lang/Object;

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x11
        :pswitch_0
    .end packed-switch
.end method

.method public constructor <init>(Lr6/e;I)V
    .locals 0

    iput p2, p0, Landroid/support/v4/media/h;->a:I

    packed-switch p2, :pswitch_data_0

    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroid/support/v4/media/h;->b:Ljava/lang/Object;

    .line 32
    new-instance p1, Lm7/q;

    invoke-direct {p1}, Lm7/q;-><init>()V

    iput-object p1, p0, Landroid/support/v4/media/h;->c:Ljava/lang/Object;

    return-void

    .line 33
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroid/support/v4/media/h;->b:Ljava/lang/Object;

    .line 34
    new-instance p1, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {p1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object p1, p0, Landroid/support/v4/media/h;->c:Ljava/lang/Object;

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x12
        :pswitch_0
    .end packed-switch
.end method

.method public static r(Lio/objectbox/Property;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Ljava/lang/Class;->isArray()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    new-instance p0, Lio/objectbox/exception/DbException;

    .line 15
    .line 16
    const-string p1, "Illegal value: found array, but simple object required"

    .line 17
    .line 18
    invoke-direct {p0, p1}, Lio/objectbox/exception/DbException;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    throw p0

    .line 22
    :cond_1
    :goto_0
    iget-object p0, p0, Lio/objectbox/Property;->type:Ljava/lang/Class;

    .line 23
    .line 24
    const-class v0, Ljava/util/Date;

    .line 25
    .line 26
    if-ne p0, v0, :cond_4

    .line 27
    .line 28
    instance-of p0, p1, Ljava/util/Date;

    .line 29
    .line 30
    if-eqz p0, :cond_2

    .line 31
    .line 32
    check-cast p1, Ljava/util/Date;

    .line 33
    .line 34
    invoke-virtual {p1}, Ljava/util/Date;->getTime()J

    .line 35
    .line 36
    .line 37
    move-result-wide p0

    .line 38
    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    return-object p0

    .line 43
    :cond_2
    instance-of p0, p1, Ljava/lang/Long;

    .line 44
    .line 45
    if-eqz p0, :cond_3

    .line 46
    .line 47
    return-object p1

    .line 48
    :cond_3
    new-instance p0, Lio/objectbox/exception/DbException;

    .line 49
    .line 50
    const-string v0, "Illegal date value: expected java.util.Date or Long for value "

    .line 51
    .line 52
    invoke-static {p1, v0}, Landroid/support/v4/media/f;->i(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    invoke-direct {p0, p1}, Lio/objectbox/exception/DbException;-><init>(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    throw p0

    .line 60
    :cond_4
    sget-object v0, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 61
    .line 62
    if-eq p0, v0, :cond_5

    .line 63
    .line 64
    const-class v0, Ljava/lang/Boolean;

    .line 65
    .line 66
    if-ne p0, v0, :cond_b

    .line 67
    .line 68
    :cond_5
    instance-of p0, p1, Ljava/lang/Boolean;

    .line 69
    .line 70
    if-eqz p0, :cond_6

    .line 71
    .line 72
    check-cast p1, Ljava/lang/Boolean;

    .line 73
    .line 74
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 75
    .line 76
    .line 77
    move-result p0

    .line 78
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    return-object p0

    .line 83
    :cond_6
    instance-of p0, p1, Ljava/lang/Number;

    .line 84
    .line 85
    const/4 v0, 0x1

    .line 86
    if-eqz p0, :cond_8

    .line 87
    .line 88
    move-object p0, p1

    .line 89
    check-cast p0, Ljava/lang/Number;

    .line 90
    .line 91
    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    .line 92
    .line 93
    .line 94
    move-result p0

    .line 95
    if-eqz p0, :cond_b

    .line 96
    .line 97
    if-ne p0, v0, :cond_7

    .line 98
    .line 99
    goto :goto_1

    .line 100
    :cond_7
    new-instance p0, Lio/objectbox/exception/DbException;

    .line 101
    .line 102
    const-string v0, "Illegal boolean value: numbers must be 0 or 1, but was "

    .line 103
    .line 104
    invoke-static {p1, v0}, Landroid/support/v4/media/f;->i(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    invoke-direct {p0, p1}, Lio/objectbox/exception/DbException;-><init>(Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    throw p0

    .line 112
    :cond_8
    instance-of p0, p1, Ljava/lang/String;

    .line 113
    .line 114
    if-eqz p0, :cond_b

    .line 115
    .line 116
    move-object p0, p1

    .line 117
    check-cast p0, Ljava/lang/String;

    .line 118
    .line 119
    const-string v1, "TRUE"

    .line 120
    .line 121
    invoke-virtual {v1, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 122
    .line 123
    .line 124
    move-result v1

    .line 125
    if-eqz v1, :cond_9

    .line 126
    .line 127
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 128
    .line 129
    .line 130
    move-result-object p0

    .line 131
    return-object p0

    .line 132
    :cond_9
    const-string v0, "FALSE"

    .line 133
    .line 134
    invoke-virtual {v0, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 135
    .line 136
    .line 137
    move-result p0

    .line 138
    if-eqz p0, :cond_a

    .line 139
    .line 140
    const/4 p0, 0x0

    .line 141
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 142
    .line 143
    .line 144
    move-result-object p0

    .line 145
    return-object p0

    .line 146
    :cond_a
    new-instance p0, Lio/objectbox/exception/DbException;

    .line 147
    .line 148
    const-string v0, "Illegal boolean value: Strings must be \"TRUE\" or \"FALSE\" (case insensitive), but was "

    .line 149
    .line 150
    invoke-static {p1, v0}, Landroid/support/v4/media/f;->i(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object p1

    .line 154
    invoke-direct {p0, p1}, Lio/objectbox/exception/DbException;-><init>(Ljava/lang/String;)V

    .line 155
    .line 156
    .line 157
    throw p0

    .line 158
    :cond_b
    :goto_1
    return-object p1
.end method


# virtual methods
.method public A(Ljava/lang/String;)V
    .locals 5

    .line 1
    const-string v0, "Removed the wrong lock, expected to remove: "

    .line 2
    .line 3
    const-string v1, "Cannot release a lock that is not held, safeKey: "

    .line 4
    .line 5
    monitor-enter p0

    .line 6
    :try_start_0
    iget-object v2, p0, Landroid/support/v4/media/h;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v2, Ljava/util/HashMap;

    .line 9
    .line 10
    invoke-virtual {v2, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    const-string v3, "Argument must not be null"

    .line 15
    .line 16
    invoke-static {v2, v3}, Lv7/d;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    check-cast v2, Ld0/b;

    .line 20
    .line 21
    iget v3, v2, Ld0/b;->b:I

    .line 22
    .line 23
    const/4 v4, 0x1

    .line 24
    if-lt v3, v4, :cond_3

    .line 25
    .line 26
    sub-int/2addr v3, v4

    .line 27
    iput v3, v2, Ld0/b;->b:I

    .line 28
    .line 29
    if-nez v3, :cond_2

    .line 30
    .line 31
    iget-object v1, p0, Landroid/support/v4/media/h;->b:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v1, Ljava/util/HashMap;

    .line 34
    .line 35
    invoke-virtual {v1, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    check-cast v1, Ld0/b;

    .line 40
    .line 41
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result v3

    .line 45
    if-eqz v3, :cond_1

    .line 46
    .line 47
    iget-object p1, p0, Landroid/support/v4/media/h;->c:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast p1, Ld0/c;

    .line 50
    .line 51
    iget-object v0, p1, Ld0/c;->a:Ljava/util/ArrayDeque;

    .line 52
    .line 53
    monitor-enter v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 54
    :try_start_1
    iget-object v3, p1, Ld0/c;->a:Ljava/util/ArrayDeque;

    .line 55
    .line 56
    invoke-virtual {v3}, Ljava/util/ArrayDeque;->size()I

    .line 57
    .line 58
    .line 59
    move-result v3

    .line 60
    const/16 v4, 0xa

    .line 61
    .line 62
    if-ge v3, v4, :cond_0

    .line 63
    .line 64
    iget-object p1, p1, Ld0/c;->a:Ljava/util/ArrayDeque;

    .line 65
    .line 66
    invoke-virtual {p1, v1}, Ljava/util/ArrayDeque;->offer(Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    goto :goto_0

    .line 70
    :catchall_0
    move-exception p1

    .line 71
    goto :goto_1

    .line 72
    :cond_0
    :goto_0
    monitor-exit v0

    .line 73
    goto :goto_2

    .line 74
    :goto_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 75
    :try_start_2
    throw p1

    .line 76
    :cond_1
    new-instance v3, Ljava/lang/IllegalStateException;

    .line 77
    .line 78
    new-instance v4, Ljava/lang/StringBuilder;

    .line 79
    .line 80
    invoke-direct {v4, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    const-string v0, ", but actually removed: "

    .line 87
    .line 88
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 89
    .line 90
    .line 91
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    const-string v0, ", safeKey: "

    .line 95
    .line 96
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 97
    .line 98
    .line 99
    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 100
    .line 101
    .line 102
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object p1

    .line 106
    invoke-direct {v3, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    throw v3

    .line 110
    :catchall_1
    move-exception p1

    .line 111
    goto :goto_3

    .line 112
    :cond_2
    :goto_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 113
    iget-object p1, v2, Ld0/b;->a:Ljava/util/concurrent/locks/ReentrantLock;

    .line 114
    .line 115
    invoke-virtual {p1}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 116
    .line 117
    .line 118
    return-void

    .line 119
    :cond_3
    :try_start_3
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 120
    .line 121
    new-instance v3, Ljava/lang/StringBuilder;

    .line 122
    .line 123
    invoke-direct {v3, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 127
    .line 128
    .line 129
    const-string p1, ", interestedThreads: "

    .line 130
    .line 131
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 132
    .line 133
    .line 134
    iget p1, v2, Ld0/b;->b:I

    .line 135
    .line 136
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 137
    .line 138
    .line 139
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object p1

    .line 143
    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 144
    .line 145
    .line 146
    throw v0

    .line 147
    :goto_3
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 148
    throw p1
.end method

.method public B()Ljava/lang/Object;
    .locals 5

    .line 1
    iget-object v0, p0, Landroid/support/v4/media/h;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lc0/d;

    .line 4
    .line 5
    iget-object v1, v0, Lc0/d;->d:Lc0/d;

    .line 6
    .line 7
    :goto_0
    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    iget-object v3, v1, Lc0/d;->a:Ljava/lang/Object;

    .line 12
    .line 13
    const/4 v4, 0x0

    .line 14
    if-nez v2, :cond_3

    .line 15
    .line 16
    iget-object v2, v1, Lc0/d;->b:Ljava/util/ArrayList;

    .line 17
    .line 18
    if-eqz v2, :cond_0

    .line 19
    .line 20
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    goto :goto_1

    .line 25
    :cond_0
    const/4 v2, 0x0

    .line 26
    :goto_1
    if-lez v2, :cond_1

    .line 27
    .line 28
    iget-object v4, v1, Lc0/d;->b:Ljava/util/ArrayList;

    .line 29
    .line 30
    add-int/lit8 v2, v2, -0x1

    .line 31
    .line 32
    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v4

    .line 36
    :cond_1
    if-eqz v4, :cond_2

    .line 37
    .line 38
    return-object v4

    .line 39
    :cond_2
    iget-object v2, v1, Lc0/d;->d:Lc0/d;

    .line 40
    .line 41
    iget-object v4, v1, Lc0/d;->c:Lc0/d;

    .line 42
    .line 43
    iput-object v4, v2, Lc0/d;->c:Lc0/d;

    .line 44
    .line 45
    iget-object v4, v1, Lc0/d;->c:Lc0/d;

    .line 46
    .line 47
    iput-object v2, v4, Lc0/d;->d:Lc0/d;

    .line 48
    .line 49
    iget-object v2, p0, Landroid/support/v4/media/h;->c:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast v2, Ljava/util/HashMap;

    .line 52
    .line 53
    invoke-virtual {v2, v3}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    check-cast v3, Lc0/i;

    .line 57
    .line 58
    invoke-interface {v3}, Lc0/i;->a()V

    .line 59
    .line 60
    .line 61
    iget-object v1, v1, Lc0/d;->d:Lc0/d;

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_3
    return-object v4
.end method

.method public C(ILandroid/os/Bundle;Landroid/os/Messenger;)V
    .locals 1

    .line 1
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iput p1, v0, Landroid/os/Message;->what:I

    .line 6
    .line 7
    const/4 p1, 0x1

    .line 8
    iput p1, v0, Landroid/os/Message;->arg1:I

    .line 9
    .line 10
    invoke-virtual {v0, p2}, Landroid/os/Message;->setData(Landroid/os/Bundle;)V

    .line 11
    .line 12
    .line 13
    iput-object p3, v0, Landroid/os/Message;->replyTo:Landroid/os/Messenger;

    .line 14
    .line 15
    iget-object p1, p0, Landroid/support/v4/media/h;->b:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast p1, Landroid/os/Messenger;

    .line 18
    .line 19
    invoke-virtual {p1, v0}, Landroid/os/Messenger;->send(Landroid/os/Message;)V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public a(ZLjava/lang/String;)V
    .locals 4

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    .line 6
    new-array p1, p1, [Ljava/lang/Object;

    const-string p2, "[UserInfo] Successfully uploaded user info."

    invoke-static {p2, p1}, Lcom/tencent/bugly/proguard/al;->c(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 7
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide p1

    .line 8
    iget-object v0, p0, Landroid/support/v4/media/h;->b:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/tencent/bugly/crashreport/biz/UserInfoBean;

    .line 9
    iput-wide p1, v1, Lcom/tencent/bugly/crashreport/biz/UserInfoBean;->f:J

    .line 10
    iget-object v2, p0, Landroid/support/v4/media/h;->c:Ljava/lang/Object;

    check-cast v2, Lcom/tencent/bugly/proguard/r;

    const/4 v3, 0x1

    invoke-static {v2, v1, v3}, Lcom/tencent/bugly/proguard/r;->a(Lcom/tencent/bugly/proguard/r;Lcom/tencent/bugly/crashreport/biz/UserInfoBean;Z)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public a(Lq/a;)Z
    .locals 6

    .line 1
    iget-object v0, p0, Landroid/support/v4/media/h;->c:Ljava/lang/Object;

    check-cast v0, Lq/g;

    .line 2
    iget-object v1, v0, Lq/g;->b:Ljava/util/LinkedHashMap;

    .line 3
    invoke-interface {v1, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 4
    invoke-virtual {v0}, Lq/g;->b()J

    move-result-wide v2

    invoke-virtual {v0, p1, v1}, Lq/g;->c(Ljava/lang/Object;Ljava/lang/Object;)J

    move-result-wide v4

    sub-long/2addr v2, v4

    iput-wide v2, v0, Lq/g;->c:J

    const/4 v2, 0x0

    .line 5
    invoke-virtual {v0, p1, v1, v2}, Lq/g;->a(Ljava/lang/Object;Ljava/lang/Object;Lq/f;)V

    :cond_0
    if-eqz v1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public b(Lq/a;)Lq/b;
    .locals 2

    .line 1
    iget-object v0, p0, Landroid/support/v4/media/h;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lq/g;

    .line 4
    .line 5
    iget-object v0, v0, Lq/g;->b:Ljava/util/LinkedHashMap;

    .line 6
    .line 7
    invoke-virtual {v0, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    check-cast p1, Lq/f;

    .line 12
    .line 13
    if-eqz p1, :cond_0

    .line 14
    .line 15
    new-instance v0, Lq/b;

    .line 16
    .line 17
    iget-object v1, p1, Lq/f;->a:Lcoil3/k;

    .line 18
    .line 19
    iget-object p1, p1, Lq/f;->b:Ljava/util/Map;

    .line 20
    .line 21
    invoke-direct {v0, v1, p1}, Lq/b;-><init>(Lcoil3/k;Ljava/util/Map;)V

    .line 22
    .line 23
    .line 24
    return-object v0

    .line 25
    :cond_0
    const/4 p1, 0x0

    .line 26
    return-object p1
.end method

.method public c(Ljava/lang/Exception;)V
    .locals 4

    .line 1
    iget-object v0, p0, Landroid/support/v4/media/h;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lb0/l0;

    .line 4
    .line 5
    iget-object v1, p0, Landroid/support/v4/media/h;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Lf0/o;

    .line 8
    .line 9
    iget-object v2, v0, Lb0/l0;->f:Lf0/o;

    .line 10
    .line 11
    if-eqz v2, :cond_0

    .line 12
    .line 13
    if-ne v2, v1, :cond_0

    .line 14
    .line 15
    iget-object v2, v0, Lb0/l0;->b:Lcom/bumptech/glide/load/engine/b;

    .line 16
    .line 17
    iget-object v0, v0, Lb0/l0;->g:Lb0/f;

    .line 18
    .line 19
    iget-object v1, v1, Lf0/o;->c:Lz/e;

    .line 20
    .line 21
    invoke-interface {v1}, Lz/e;->d()Lcom/bumptech/glide/load/DataSource;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    invoke-virtual {v2, v0, p1, v1, v3}, Lcom/bumptech/glide/load/engine/b;->a(Ly/c;Ljava/lang/Exception;Lz/e;Lcom/bumptech/glide/load/DataSource;)V

    .line 26
    .line 27
    .line 28
    :cond_0
    return-void
.end method

.method public clear()V
    .locals 3

    .line 1
    iget-object v0, p0, Landroid/support/v4/media/h;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lq/g;

    .line 4
    .line 5
    const-wide/16 v1, -0x1

    .line 6
    .line 7
    invoke-virtual {v0, v1, v2}, Lq/g;->d(J)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public d(Lokhttp3/e;Ljava/io/IOException;)V
    .locals 1

    .line 1
    :try_start_0
    iget-object p1, p0, Landroid/support/v4/media/h;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p1, Lretrofit2/h;

    .line 4
    .line 5
    iget-object v0, p0, Landroid/support/v4/media/h;->c:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, Lretrofit2/x;

    .line 8
    .line 9
    invoke-interface {p1, v0, p2}, Lretrofit2/h;->k(Lretrofit2/e;Ljava/lang/Throwable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :catchall_0
    move-exception p1

    .line 14
    invoke-static {p1}, Lretrofit2/v;->r(Ljava/lang/Throwable;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public e()Ljava/lang/reflect/Type;
    .locals 1

    .line 1
    iget-object v0, p0, Landroid/support/v4/media/h;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/lang/reflect/Type;

    .line 4
    .line 5
    return-object v0
.end method

.method public f(Lcoil3/k;)V
    .locals 0

    .line 1
    return-void
.end method

.method public g(Ly/f;)Lcom/bumptech/glide/load/EncodeStrategy;
    .locals 0

    .line 1
    sget-object p1, Lcom/bumptech/glide/load/EncodeStrategy;->TRANSFORMED:Lcom/bumptech/glide/load/EncodeStrategy;

    .line 2
    .line 3
    return-object p1
.end method

.method public getSize()J
    .locals 2

    .line 1
    iget-object v0, p0, Landroid/support/v4/media/h;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lq/g;

    .line 4
    .line 5
    invoke-virtual {v0}, Lq/g;->b()J

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    return-wide v0
.end method

.method public h(Landroid/graphics/Bitmap;Lc0/b;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroid/support/v4/media/h;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lv0/c;

    .line 4
    .line 5
    iget-object v0, v0, Lv0/c;->b:Ljava/io/IOException;

    .line 6
    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    invoke-interface {p2, p1}, Lc0/b;->b(Landroid/graphics/Bitmap;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    throw v0

    .line 15
    :cond_1
    return-void
.end method

.method public i(Lretrofit2/x;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Landroid/support/v4/media/h;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/concurrent/Executor;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-object p1

    .line 8
    :cond_0
    new-instance v1, Lretrofit2/n;

    .line 9
    .line 10
    invoke-direct {v1, v0, p1}, Lretrofit2/n;-><init>(Ljava/util/concurrent/Executor;Lretrofit2/e;)V

    .line 11
    .line 12
    .line 13
    return-object v1
.end method

.method public j(Lokhttp3/i0;)V
    .locals 2

    .line 1
    iget-object v0, p0, Landroid/support/v4/media/h;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lretrofit2/h;

    .line 4
    .line 5
    iget-object v1, p0, Landroid/support/v4/media/h;->c:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Lretrofit2/x;

    .line 8
    .line 9
    :try_start_0
    invoke-virtual {v1, p1}, Lretrofit2/x;->f(Lokhttp3/i0;)Lretrofit2/n0;

    .line 10
    .line 11
    .line 12
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 13
    :try_start_1
    invoke-interface {v0, v1, p1}, Lretrofit2/h;->n(Lretrofit2/e;Lretrofit2/n0;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :catchall_0
    move-exception p1

    .line 18
    invoke-static {p1}, Lretrofit2/v;->r(Ljava/lang/Throwable;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :catchall_1
    move-exception p1

    .line 26
    invoke-static {p1}, Lretrofit2/v;->r(Ljava/lang/Throwable;)V

    .line 27
    .line 28
    .line 29
    :try_start_2
    invoke-interface {v0, v1, p1}, Lretrofit2/h;->k(Lretrofit2/e;Ljava/lang/Throwable;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :catchall_2
    move-exception p1

    .line 34
    invoke-static {p1}, Lretrofit2/v;->r(Ljava/lang/Throwable;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 38
    .line 39
    .line 40
    :goto_0
    return-void
.end method

.method public k(Lretrofit2/e;Ljava/lang/Throwable;)V
    .locals 3

    .line 1
    iget-object p1, p0, Landroid/support/v4/media/h;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p1, Lretrofit2/n;

    .line 4
    .line 5
    iget-object p1, p1, Lretrofit2/n;->a:Ljava/util/concurrent/Executor;

    .line 6
    .line 7
    iget-object v0, p0, Landroid/support/v4/media/h;->b:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, Lretrofit2/h;

    .line 10
    .line 11
    new-instance v1, La5/h;

    .line 12
    .line 13
    const/16 v2, 0x10

    .line 14
    .line 15
    invoke-direct {v1, p0, v0, v2, p2}, La5/h;-><init>(Ljava/lang/Object;Ljava/lang/Object;ILjava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    invoke-interface {p1, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public l()V
    .locals 2

    .line 1
    iget-object v0, p0, Landroid/support/v4/media/h;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lcom/bumptech/glide/load/resource/bitmap/a;

    .line 4
    .line 5
    monitor-enter v0

    .line 6
    :try_start_0
    iget-object v1, v0, Lcom/bumptech/glide/load/resource/bitmap/a;->a:[B

    .line 7
    .line 8
    array-length v1, v1

    .line 9
    iput v1, v0, Lcom/bumptech/glide/load/resource/bitmap/a;->c:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    .line 11
    monitor-exit v0

    .line 12
    return-void

    .line 13
    :catchall_0
    move-exception v1

    .line 14
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 15
    throw v1
.end method

.method public m(Lcoil3/k;)V
    .locals 3

    .line 1
    iget-object v0, p0, Landroid/support/v4/media/h;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lcoil3/compose/AsyncImagePainter;

    .line 4
    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    iget-object v1, p0, Landroid/support/v4/media/h;->b:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v1, Ls/f;

    .line 10
    .line 11
    iget-object v1, v1, Ls/f;->a:Landroid/content/Context;

    .line 12
    .line 13
    iget v2, v0, Lcoil3/compose/AsyncImagePainter;->k:I

    .line 14
    .line 15
    invoke-static {p1, v1, v2}, Lcoil3/compose/l;->a(Lcoil3/k;Landroid/content/Context;I)Landroidx/compose/ui/graphics/painter/Painter;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const/4 p1, 0x0

    .line 21
    :goto_0
    new-instance v1, Lcoil3/compose/g;

    .line 22
    .line 23
    invoke-direct {v1, p1}, Lcoil3/compose/g;-><init>(Landroidx/compose/ui/graphics/painter/Painter;)V

    .line 24
    .line 25
    .line 26
    invoke-static {v0, v1}, Lcoil3/compose/AsyncImagePainter;->b(Lcoil3/compose/AsyncImagePainter;Lcoil3/compose/i;)V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public n(Lretrofit2/e;Lretrofit2/n0;)V
    .locals 3

    .line 1
    iget-object p1, p0, Landroid/support/v4/media/h;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p1, Lretrofit2/n;

    .line 4
    .line 5
    iget-object p1, p1, Lretrofit2/n;->a:Ljava/util/concurrent/Executor;

    .line 6
    .line 7
    iget-object v0, p0, Landroid/support/v4/media/h;->b:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, Lretrofit2/h;

    .line 10
    .line 11
    new-instance v1, La5/h;

    .line 12
    .line 13
    const/16 v2, 0xf

    .line 14
    .line 15
    invoke-direct {v1, p0, v0, v2, p2}, La5/h;-><init>(Ljava/lang/Object;Ljava/lang/Object;ILjava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    invoke-interface {p1, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public o(Ljava/lang/Object;)V
    .locals 6

    .line 1
    iget-object v0, p0, Landroid/support/v4/media/h;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lb0/l0;

    .line 4
    .line 5
    iget-object v1, p0, Landroid/support/v4/media/h;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Lf0/o;

    .line 8
    .line 9
    iget-object v2, v0, Lb0/l0;->f:Lf0/o;

    .line 10
    .line 11
    if-eqz v2, :cond_1

    .line 12
    .line 13
    if-ne v2, v1, :cond_1

    .line 14
    .line 15
    iget-object v2, v0, Lb0/l0;->a:Lb0/j;

    .line 16
    .line 17
    iget-object v2, v2, Lb0/j;->p:Lb0/o;

    .line 18
    .line 19
    if-eqz p1, :cond_0

    .line 20
    .line 21
    iget-object v3, v1, Lf0/o;->c:Lz/e;

    .line 22
    .line 23
    invoke-interface {v3}, Lz/e;->d()Lcom/bumptech/glide/load/DataSource;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    invoke-virtual {v2, v3}, Lb0/o;->c(Lcom/bumptech/glide/load/DataSource;)Z

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    if-eqz v2, :cond_0

    .line 32
    .line 33
    iput-object p1, v0, Lb0/l0;->e:Ljava/lang/Object;

    .line 34
    .line 35
    iget-object p1, v0, Lb0/l0;->b:Lcom/bumptech/glide/load/engine/b;

    .line 36
    .line 37
    invoke-virtual {p1}, Lcom/bumptech/glide/load/engine/b;->l()V

    .line 38
    .line 39
    .line 40
    return-void

    .line 41
    :cond_0
    move-object v2, v0

    .line 42
    iget-object v0, v2, Lb0/l0;->b:Lcom/bumptech/glide/load/engine/b;

    .line 43
    .line 44
    move-object v3, v1

    .line 45
    iget-object v1, v3, Lf0/o;->a:Ly/c;

    .line 46
    .line 47
    iget-object v3, v3, Lf0/o;->c:Lz/e;

    .line 48
    .line 49
    invoke-interface {v3}, Lz/e;->d()Lcom/bumptech/glide/load/DataSource;

    .line 50
    .line 51
    .line 52
    move-result-object v4

    .line 53
    iget-object v5, v2, Lb0/l0;->g:Lb0/f;

    .line 54
    .line 55
    move-object v2, p1

    .line 56
    invoke-virtual/range {v0 .. v5}, Lcom/bumptech/glide/load/engine/b;->b(Ly/c;Ljava/lang/Object;Lz/e;Lcom/bumptech/glide/load/DataSource;Ly/c;)V

    .line 57
    .line 58
    .line 59
    :cond_1
    return-void
.end method

.method public p(J)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroid/support/v4/media/h;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lq/g;

    .line 4
    .line 5
    invoke-virtual {v0, p1, p2}, Lq/g;->d(J)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public q(Lcoil3/k;)V
    .locals 0

    .line 1
    return-void
.end method

.method public s(Ljava/lang/Object;Ljava/io/File;Ly/f;)Z
    .locals 3

    .line 1
    check-cast p1, Lb0/g0;

    .line 2
    .line 3
    iget-object v0, p0, Landroid/support/v4/media/h;->c:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Li0/b;

    .line 6
    .line 7
    new-instance v1, Li0/c;

    .line 8
    .line 9
    invoke-interface {p1}, Lb0/g0;->get()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    check-cast p1, Landroid/graphics/drawable/BitmapDrawable;

    .line 14
    .line 15
    invoke-virtual {p1}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    iget-object v2, p0, Landroid/support/v4/media/h;->b:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v2, Lc0/b;

    .line 22
    .line 23
    invoke-direct {v1, p1, v2}, Li0/c;-><init>(Landroid/graphics/Bitmap;Lc0/b;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, v1, p2, p3}, Li0/b;->s(Ljava/lang/Object;Ljava/io/File;Ly/f;)Z

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    return p1
.end method

.method public t(Ly6/c;)Li7/b;
    .locals 4

    .line 1
    iget v0, p0, Landroid/support/v4/media/h;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Landroid/support/v4/media/h;->c:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 9
    .line 10
    invoke-static {p1}, Lv7/d;->m(Ly6/c;)Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {v0, v1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    if-nez v2, :cond_1

    .line 19
    .line 20
    new-instance v2, Lm7/k;

    .line 21
    .line 22
    iget-object v3, p0, Landroid/support/v4/media/h;->b:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v3, Lr6/c;

    .line 25
    .line 26
    invoke-interface {v3, p1}, Lr6/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    check-cast p1, Li7/b;

    .line 31
    .line 32
    invoke-direct {v2, p1}, Lm7/k;-><init>(Li7/b;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    if-nez p1, :cond_0

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_0
    move-object v2, p1

    .line 43
    :cond_1
    :goto_0
    check-cast v2, Lm7/k;

    .line 44
    .line 45
    iget-object p1, v2, Lm7/k;->a:Li7/b;

    .line 46
    .line 47
    return-object p1

    .line 48
    :pswitch_0
    iget-object v0, p0, Landroid/support/v4/media/h;->c:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v0, Lm7/q;

    .line 51
    .line 52
    invoke-static {p1}, Lv7/d;->m(Ly6/c;)Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    invoke-static {v0, v1}, Lcom/google/android/material/color/a;->a(Lm7/q;Ljava/lang/Class;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    const-string v1, "get(...)"

    .line 61
    .line 62
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    check-cast v0, Lm7/s0;

    .line 66
    .line 67
    iget-object v1, v0, Lm7/s0;->a:Ljava/lang/ref/SoftReference;

    .line 68
    .line 69
    invoke-virtual {v1}, Ljava/lang/ref/SoftReference;->get()Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    if-eqz v1, :cond_2

    .line 74
    .line 75
    goto :goto_1

    .line 76
    :cond_2
    monitor-enter v0

    .line 77
    :try_start_0
    iget-object v1, v0, Lm7/s0;->a:Ljava/lang/ref/SoftReference;

    .line 78
    .line 79
    invoke-virtual {v1}, Ljava/lang/ref/SoftReference;->get()Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 83
    if-eqz v1, :cond_3

    .line 84
    .line 85
    monitor-exit v0

    .line 86
    goto :goto_1

    .line 87
    :cond_3
    :try_start_1
    new-instance v1, Lm7/k;

    .line 88
    .line 89
    iget-object v2, p0, Landroid/support/v4/media/h;->b:Ljava/lang/Object;

    .line 90
    .line 91
    check-cast v2, Lr6/c;

    .line 92
    .line 93
    invoke-interface {v2, p1}, Lr6/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    check-cast p1, Li7/b;

    .line 98
    .line 99
    invoke-direct {v1, p1}, Lm7/k;-><init>(Li7/b;)V

    .line 100
    .line 101
    .line 102
    new-instance p1, Ljava/lang/ref/SoftReference;

    .line 103
    .line 104
    invoke-direct {p1, v1}, Ljava/lang/ref/SoftReference;-><init>(Ljava/lang/Object;)V

    .line 105
    .line 106
    .line 107
    iput-object p1, v0, Lm7/s0;->a:Ljava/lang/ref/SoftReference;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 108
    .line 109
    monitor-exit v0

    .line 110
    :goto_1
    check-cast v1, Lm7/k;

    .line 111
    .line 112
    iget-object p1, v1, Lm7/k;->a:Li7/b;

    .line 113
    .line 114
    return-object p1

    .line 115
    :catchall_0
    move-exception p1

    .line 116
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 117
    throw p1

    .line 118
    nop

    .line 119
    :pswitch_data_0
    .packed-switch 0xf
        :pswitch_0
    .end packed-switch
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    .line 1
    iget v0, p0, Landroid/support/v4/media/h;->a:I

    .line 2
    .line 3
    sparse-switch v0, :sswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    return-object v0

    .line 11
    :sswitch_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    const-string v1, "RomInfo{name="

    .line 14
    .line 15
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, Landroid/support/v4/media/h;->b:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v1, Ljava/lang/String;

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    const-string v1, ", version="

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    iget-object v1, p0, Landroid/support/v4/media/h;->c:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v1, Ljava/lang/String;

    .line 33
    .line 34
    const-string/jumbo v2, "}"

    .line 35
    .line 36
    .line 37
    invoke-static {v0, v1, v2}, Landroid/support/v4/media/f;->p(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    return-object v0

    .line 42
    :sswitch_1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 43
    .line 44
    const-string v1, "GroupedLinkedMap( "

    .line 45
    .line 46
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    iget-object v1, p0, Landroid/support/v4/media/h;->b:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast v1, Lc0/d;

    .line 52
    .line 53
    iget-object v2, v1, Lc0/d;->c:Lc0/d;

    .line 54
    .line 55
    const/4 v3, 0x0

    .line 56
    move v4, v3

    .line 57
    :goto_0
    invoke-virtual {v2, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result v5

    .line 61
    if-nez v5, :cond_1

    .line 62
    .line 63
    const/16 v4, 0x7b

    .line 64
    .line 65
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    iget-object v4, v2, Lc0/d;->a:Ljava/lang/Object;

    .line 69
    .line 70
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    const/16 v4, 0x3a

    .line 74
    .line 75
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    iget-object v4, v2, Lc0/d;->b:Ljava/util/ArrayList;

    .line 79
    .line 80
    if-eqz v4, :cond_0

    .line 81
    .line 82
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 83
    .line 84
    .line 85
    move-result v4

    .line 86
    goto :goto_1

    .line 87
    :cond_0
    move v4, v3

    .line 88
    :goto_1
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 89
    .line 90
    .line 91
    const-string/jumbo v4, "}, "

    .line 92
    .line 93
    .line 94
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 95
    .line 96
    .line 97
    iget-object v2, v2, Lc0/d;->c:Lc0/d;

    .line 98
    .line 99
    const/4 v4, 0x1

    .line 100
    goto :goto_0

    .line 101
    :cond_1
    if-eqz v4, :cond_2

    .line 102
    .line 103
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    .line 104
    .line 105
    .line 106
    move-result v1

    .line 107
    add-int/lit8 v1, v1, -0x2

    .line 108
    .line 109
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    .line 110
    .line 111
    .line 112
    move-result v2

    .line 113
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->delete(II)Ljava/lang/StringBuilder;

    .line 114
    .line 115
    .line 116
    :cond_2
    const-string v1, " )"

    .line 117
    .line 118
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 119
    .line 120
    .line 121
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    return-object v0

    .line 126
    nop

    .line 127
    :sswitch_data_0
    .sparse-switch
        0x3 -> :sswitch_1
        0x7 -> :sswitch_0
    .end sparse-switch
.end method

.method public u(Lc0/i;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Landroid/support/v4/media/h;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/HashMap;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    check-cast v1, Lc0/d;

    .line 10
    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    new-instance v1, Lc0/d;

    .line 14
    .line 15
    invoke-direct {v1, p1}, Lc0/d;-><init>(Lc0/i;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, p1, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    invoke-interface {p1}, Lc0/i;->a()V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v1, Lc0/d;->d:Lc0/d;

    .line 26
    .line 27
    iget-object v0, v1, Lc0/d;->c:Lc0/d;

    .line 28
    .line 29
    iput-object v0, p1, Lc0/d;->c:Lc0/d;

    .line 30
    .line 31
    iget-object v0, v1, Lc0/d;->c:Lc0/d;

    .line 32
    .line 33
    iput-object p1, v0, Lc0/d;->d:Lc0/d;

    .line 34
    .line 35
    iget-object p1, p0, Landroid/support/v4/media/h;->b:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast p1, Lc0/d;

    .line 38
    .line 39
    iput-object p1, v1, Lc0/d;->d:Lc0/d;

    .line 40
    .line 41
    iget-object p1, p1, Lc0/d;->c:Lc0/d;

    .line 42
    .line 43
    iput-object p1, v1, Lc0/d;->c:Lc0/d;

    .line 44
    .line 45
    iput-object v1, p1, Lc0/d;->d:Lc0/d;

    .line 46
    .line 47
    iget-object p1, v1, Lc0/d;->d:Lc0/d;

    .line 48
    .line 49
    iput-object v1, p1, Lc0/d;->c:Lc0/d;

    .line 50
    .line 51
    iget-object p1, v1, Lc0/d;->b:Ljava/util/ArrayList;

    .line 52
    .line 53
    if-eqz p1, :cond_1

    .line 54
    .line 55
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 56
    .line 57
    .line 58
    move-result p1

    .line 59
    goto :goto_1

    .line 60
    :cond_1
    const/4 p1, 0x0

    .line 61
    :goto_1
    if-lez p1, :cond_2

    .line 62
    .line 63
    iget-object v0, v1, Lc0/d;->b:Ljava/util/ArrayList;

    .line 64
    .line 65
    add-int/lit8 p1, p1, -0x1

    .line 66
    .line 67
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    return-object p1

    .line 72
    :cond_2
    const/4 p1, 0x0

    .line 73
    return-object p1
.end method

.method public v(Ly6/c;Ljava/util/ArrayList;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget v0, p0, Landroid/support/v4/media/h;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Landroid/support/v4/media/h;->c:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 9
    .line 10
    invoke-static {p1}, Lv7/d;->m(Ly6/c;)Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {v0, v1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    if-nez v2, :cond_1

    .line 19
    .line 20
    new-instance v2, Lm7/x0;

    .line 21
    .line 22
    invoke-direct {v2}, Lm7/x0;-><init>()V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    if-nez v0, :cond_0

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    move-object v2, v0

    .line 33
    :cond_1
    :goto_0
    check-cast v2, Lm7/x0;

    .line 34
    .line 35
    new-instance v0, Ljava/util/ArrayList;

    .line 36
    .line 37
    const/16 v1, 0xa

    .line 38
    .line 39
    invoke-static {p2, v1}, Lkotlin/collections/u;->p(Ljava/lang/Iterable;I)I

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    const/4 v3, 0x0

    .line 51
    :goto_1
    if-ge v3, v1, :cond_2

    .line 52
    .line 53
    invoke-virtual {p2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v4

    .line 57
    add-int/lit8 v3, v3, 0x1

    .line 58
    .line 59
    check-cast v4, Ly6/q;

    .line 60
    .line 61
    new-instance v5, Lm7/k0;

    .line 62
    .line 63
    invoke-direct {v5, v4}, Lm7/k0;-><init>(Ly6/q;)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_2
    iget-object v1, v2, Lm7/x0;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 71
    .line 72
    invoke-virtual {v1, v0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v2

    .line 76
    if-nez v2, :cond_4

    .line 77
    .line 78
    :try_start_0
    iget-object v2, p0, Landroid/support/v4/media/h;->b:Ljava/lang/Object;

    .line 79
    .line 80
    check-cast v2, Lr6/e;

    .line 81
    .line 82
    invoke-interface {v2, p1, p2}, Lr6/e;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    check-cast p1, Li7/b;

    .line 87
    .line 88
    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 92
    goto :goto_2

    .line 93
    :catchall_0
    move-exception p1

    .line 94
    invoke-static {p1}, Lkotlin/b;->a(Ljava/lang/Throwable;)Lkotlin/Result$Failure;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object p1

    .line 102
    :goto_2
    invoke-static {p1}, Lkotlin/Result;->box-impl(Ljava/lang/Object;)Lkotlin/Result;

    .line 103
    .line 104
    .line 105
    move-result-object p1

    .line 106
    invoke-virtual {v1, v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object p2

    .line 110
    if-nez p2, :cond_3

    .line 111
    .line 112
    move-object v2, p1

    .line 113
    goto :goto_3

    .line 114
    :cond_3
    move-object v2, p2

    .line 115
    :cond_4
    :goto_3
    const-string p1, "getOrPut(...)"

    .line 116
    .line 117
    invoke-static {v2, p1}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    check-cast v2, Lkotlin/Result;

    .line 121
    .line 122
    invoke-virtual {v2}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object p1

    .line 126
    return-object p1

    .line 127
    :pswitch_0
    iget-object v0, p0, Landroid/support/v4/media/h;->c:Ljava/lang/Object;

    .line 128
    .line 129
    check-cast v0, Lm7/q;

    .line 130
    .line 131
    invoke-static {p1}, Lv7/d;->m(Ly6/c;)Ljava/lang/Class;

    .line 132
    .line 133
    .line 134
    move-result-object v1

    .line 135
    invoke-static {v0, v1}, Lcom/google/android/material/color/a;->a(Lm7/q;Ljava/lang/Class;)Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object v0

    .line 139
    const-string v1, "get(...)"

    .line 140
    .line 141
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 142
    .line 143
    .line 144
    check-cast v0, Lm7/s0;

    .line 145
    .line 146
    iget-object v1, v0, Lm7/s0;->a:Ljava/lang/ref/SoftReference;

    .line 147
    .line 148
    invoke-virtual {v1}, Ljava/lang/ref/SoftReference;->get()Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object v1

    .line 152
    if-eqz v1, :cond_5

    .line 153
    .line 154
    goto :goto_4

    .line 155
    :cond_5
    monitor-enter v0

    .line 156
    :try_start_1
    iget-object v1, v0, Lm7/s0;->a:Ljava/lang/ref/SoftReference;

    .line 157
    .line 158
    invoke-virtual {v1}, Ljava/lang/ref/SoftReference;->get()Ljava/lang/Object;

    .line 159
    .line 160
    .line 161
    move-result-object v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 162
    if-eqz v1, :cond_6

    .line 163
    .line 164
    monitor-exit v0

    .line 165
    goto :goto_4

    .line 166
    :cond_6
    :try_start_2
    new-instance v1, Lm7/x0;

    .line 167
    .line 168
    invoke-direct {v1}, Lm7/x0;-><init>()V

    .line 169
    .line 170
    .line 171
    new-instance v2, Ljava/lang/ref/SoftReference;

    .line 172
    .line 173
    invoke-direct {v2, v1}, Ljava/lang/ref/SoftReference;-><init>(Ljava/lang/Object;)V

    .line 174
    .line 175
    .line 176
    iput-object v2, v0, Lm7/s0;->a:Ljava/lang/ref/SoftReference;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 177
    .line 178
    monitor-exit v0

    .line 179
    :goto_4
    check-cast v1, Lm7/x0;

    .line 180
    .line 181
    new-instance v0, Ljava/util/ArrayList;

    .line 182
    .line 183
    const/16 v2, 0xa

    .line 184
    .line 185
    invoke-static {p2, v2}, Lkotlin/collections/u;->p(Ljava/lang/Iterable;I)I

    .line 186
    .line 187
    .line 188
    move-result v2

    .line 189
    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 190
    .line 191
    .line 192
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    .line 193
    .line 194
    .line 195
    move-result v2

    .line 196
    const/4 v3, 0x0

    .line 197
    :goto_5
    if-ge v3, v2, :cond_7

    .line 198
    .line 199
    invoke-virtual {p2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 200
    .line 201
    .line 202
    move-result-object v4

    .line 203
    add-int/lit8 v3, v3, 0x1

    .line 204
    .line 205
    check-cast v4, Ly6/q;

    .line 206
    .line 207
    new-instance v5, Lm7/k0;

    .line 208
    .line 209
    invoke-direct {v5, v4}, Lm7/k0;-><init>(Ly6/q;)V

    .line 210
    .line 211
    .line 212
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 213
    .line 214
    .line 215
    goto :goto_5

    .line 216
    :cond_7
    iget-object v1, v1, Lm7/x0;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 217
    .line 218
    invoke-virtual {v1, v0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 219
    .line 220
    .line 221
    move-result-object v2

    .line 222
    if-nez v2, :cond_9

    .line 223
    .line 224
    :try_start_3
    iget-object v2, p0, Landroid/support/v4/media/h;->b:Ljava/lang/Object;

    .line 225
    .line 226
    check-cast v2, Lr6/e;

    .line 227
    .line 228
    invoke-interface {v2, p1, p2}, Lr6/e;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 229
    .line 230
    .line 231
    move-result-object p1

    .line 232
    check-cast p1, Li7/b;

    .line 233
    .line 234
    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 235
    .line 236
    .line 237
    move-result-object p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 238
    goto :goto_6

    .line 239
    :catchall_1
    move-exception p1

    .line 240
    invoke-static {p1}, Lkotlin/b;->a(Ljava/lang/Throwable;)Lkotlin/Result$Failure;

    .line 241
    .line 242
    .line 243
    move-result-object p1

    .line 244
    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 245
    .line 246
    .line 247
    move-result-object p1

    .line 248
    :goto_6
    invoke-static {p1}, Lkotlin/Result;->box-impl(Ljava/lang/Object;)Lkotlin/Result;

    .line 249
    .line 250
    .line 251
    move-result-object p1

    .line 252
    invoke-virtual {v1, v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 253
    .line 254
    .line 255
    move-result-object p2

    .line 256
    if-nez p2, :cond_8

    .line 257
    .line 258
    move-object v2, p1

    .line 259
    goto :goto_7

    .line 260
    :cond_8
    move-object v2, p2

    .line 261
    :cond_9
    :goto_7
    const-string p1, "getOrPut(...)"

    .line 262
    .line 263
    invoke-static {v2, p1}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 264
    .line 265
    .line 266
    check-cast v2, Lkotlin/Result;

    .line 267
    .line 268
    invoke-virtual {v2}, Lkotlin/Result;->unbox-impl()Ljava/lang/Object;

    .line 269
    .line 270
    .line 271
    move-result-object p1

    .line 272
    return-object p1

    .line 273
    :catchall_2
    move-exception p1

    .line 274
    :try_start_4
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 275
    throw p1

    .line 276
    nop

    .line 277
    :pswitch_data_0
    .packed-switch 0x10
        :pswitch_0
    .end packed-switch
.end method

.method public w(Lq/a;Lcoil3/k;Ljava/util/Map;J)V
    .locals 7

    .line 1
    iget-object v0, p0, Landroid/support/v4/media/h;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lq/g;

    .line 4
    .line 5
    iget-wide v1, v0, Lq/g;->a:J

    .line 6
    .line 7
    iget-object v3, v0, Lq/g;->b:Ljava/util/LinkedHashMap;

    .line 8
    .line 9
    cmp-long v1, p4, v1

    .line 10
    .line 11
    if-gtz v1, :cond_1

    .line 12
    .line 13
    new-instance v1, Lq/f;

    .line 14
    .line 15
    invoke-direct {v1, p2, p3, p4, p5}, Lq/f;-><init>(Lcoil3/k;Ljava/util/Map;J)V

    .line 16
    .line 17
    .line 18
    invoke-interface {v3, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p2

    .line 22
    invoke-virtual {v0}, Lq/g;->b()J

    .line 23
    .line 24
    .line 25
    move-result-wide p3

    .line 26
    invoke-virtual {v0, p1, v1}, Lq/g;->c(Ljava/lang/Object;Ljava/lang/Object;)J

    .line 27
    .line 28
    .line 29
    move-result-wide v2

    .line 30
    add-long/2addr v2, p3

    .line 31
    iput-wide v2, v0, Lq/g;->c:J

    .line 32
    .line 33
    if-eqz p2, :cond_0

    .line 34
    .line 35
    invoke-virtual {v0}, Lq/g;->b()J

    .line 36
    .line 37
    .line 38
    move-result-wide p3

    .line 39
    invoke-virtual {v0, p1, p2}, Lq/g;->c(Ljava/lang/Object;Ljava/lang/Object;)J

    .line 40
    .line 41
    .line 42
    move-result-wide v2

    .line 43
    sub-long/2addr p3, v2

    .line 44
    iput-wide p3, v0, Lq/g;->c:J

    .line 45
    .line 46
    invoke-virtual {v0, p1, p2, v1}, Lq/g;->a(Ljava/lang/Object;Ljava/lang/Object;Lq/f;)V

    .line 47
    .line 48
    .line 49
    :cond_0
    iget-wide p1, v0, Lq/g;->a:J

    .line 50
    .line 51
    invoke-virtual {v0, p1, p2}, Lq/g;->d(J)V

    .line 52
    .line 53
    .line 54
    return-void

    .line 55
    :cond_1
    invoke-interface {v3, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    if-eqz v1, :cond_2

    .line 60
    .line 61
    invoke-virtual {v0}, Lq/g;->b()J

    .line 62
    .line 63
    .line 64
    move-result-wide v2

    .line 65
    invoke-virtual {v0, p1, v1}, Lq/g;->c(Ljava/lang/Object;Ljava/lang/Object;)J

    .line 66
    .line 67
    .line 68
    move-result-wide v4

    .line 69
    sub-long/2addr v2, v4

    .line 70
    iput-wide v2, v0, Lq/g;->c:J

    .line 71
    .line 72
    const/4 v2, 0x0

    .line 73
    invoke-virtual {v0, p1, v1, v2}, Lq/g;->a(Ljava/lang/Object;Ljava/lang/Object;Lq/f;)V

    .line 74
    .line 75
    .line 76
    :cond_2
    iget-object v0, p0, Landroid/support/v4/media/h;->b:Ljava/lang/Object;

    .line 77
    .line 78
    move-object v1, v0

    .line 79
    check-cast v1, Ld2/c;

    .line 80
    .line 81
    move-object v2, p1

    .line 82
    move-object v3, p2

    .line 83
    move-object v4, p3

    .line 84
    move-wide v5, p4

    .line 85
    invoke-virtual/range {v1 .. v6}, Ld2/c;->g(Lq/a;Lcoil3/k;Ljava/util/Map;J)V

    .line 86
    .line 87
    .line 88
    return-void
.end method

.method public declared-synchronized x(Ljava/lang/String;)Ljava/util/List;
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Landroid/support/v4/media/h;->b:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    iget-object v0, p0, Landroid/support/v4/media/h;->b:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v0, Ljava/util/ArrayList;

    .line 15
    .line 16
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    goto :goto_0

    .line 20
    :catchall_0
    move-exception p1

    .line 21
    goto :goto_1

    .line 22
    :cond_0
    :goto_0
    iget-object v0, p0, Landroid/support/v4/media/h;->c:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v0, Ljava/util/HashMap;

    .line 25
    .line 26
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    check-cast v0, Ljava/util/List;

    .line 31
    .line 32
    if-nez v0, :cond_1

    .line 33
    .line 34
    new-instance v0, Ljava/util/ArrayList;

    .line 35
    .line 36
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 37
    .line 38
    .line 39
    iget-object v1, p0, Landroid/support/v4/media/h;->c:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast v1, Ljava/util/HashMap;

    .line 42
    .line 43
    invoke-virtual {v1, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 44
    .line 45
    .line 46
    :cond_1
    monitor-exit p0

    .line 47
    return-object v0

    .line 48
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 49
    throw p1
.end method

.method public declared-synchronized y(Ljava/lang/Class;Ljava/lang/Class;)Ljava/util/ArrayList;
    .locals 8

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    new-instance v0, Ljava/util/ArrayList;

    .line 3
    .line 4
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 5
    .line 6
    .line 7
    iget-object v1, p0, Landroid/support/v4/media/h;->b:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v1, Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    const/4 v3, 0x0

    .line 16
    move v4, v3

    .line 17
    :cond_0
    :goto_0
    if-ge v4, v2, :cond_4

    .line 18
    .line 19
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v5

    .line 23
    add-int/lit8 v4, v4, 0x1

    .line 24
    .line 25
    check-cast v5, Ljava/lang/String;

    .line 26
    .line 27
    iget-object v6, p0, Landroid/support/v4/media/h;->c:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v6, Ljava/util/HashMap;

    .line 30
    .line 31
    invoke-virtual {v6, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v5

    .line 35
    check-cast v5, Ljava/util/List;

    .line 36
    .line 37
    if-nez v5, :cond_1

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_1
    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 41
    .line 42
    .line 43
    move-result-object v5

    .line 44
    :cond_2
    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 45
    .line 46
    .line 47
    move-result v6

    .line 48
    if-eqz v6, :cond_0

    .line 49
    .line 50
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v6

    .line 54
    check-cast v6, Lq0/c;

    .line 55
    .line 56
    iget-object v7, v6, Lq0/c;->a:Ljava/lang/Class;

    .line 57
    .line 58
    invoke-virtual {v7, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 59
    .line 60
    .line 61
    move-result v7

    .line 62
    if-eqz v7, :cond_3

    .line 63
    .line 64
    iget-object v7, v6, Lq0/c;->b:Ljava/lang/Class;

    .line 65
    .line 66
    invoke-virtual {p2, v7}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 67
    .line 68
    .line 69
    move-result v7

    .line 70
    if-eqz v7, :cond_3

    .line 71
    .line 72
    const/4 v7, 0x1

    .line 73
    goto :goto_2

    .line 74
    :cond_3
    move v7, v3

    .line 75
    :goto_2
    if-eqz v7, :cond_2

    .line 76
    .line 77
    iget-object v7, v6, Lq0/c;->b:Ljava/lang/Class;

    .line 78
    .line 79
    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    move-result v7

    .line 83
    if-nez v7, :cond_2

    .line 84
    .line 85
    iget-object v6, v6, Lq0/c;->b:Ljava/lang/Class;

    .line 86
    .line 87
    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 88
    .line 89
    .line 90
    goto :goto_1

    .line 91
    :catchall_0
    move-exception p1

    .line 92
    goto :goto_3

    .line 93
    :cond_4
    monitor-exit p0

    .line 94
    return-object v0

    .line 95
    :goto_3
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 96
    throw p1
.end method

.method public z(Lc0/i;Ljava/lang/Object;)V
    .locals 4

    .line 1
    iget-object v0, p0, Landroid/support/v4/media/h;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/HashMap;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    check-cast v1, Lc0/d;

    .line 10
    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    new-instance v1, Lc0/d;

    .line 14
    .line 15
    invoke-direct {v1, p1}, Lc0/d;-><init>(Lc0/i;)V

    .line 16
    .line 17
    .line 18
    iput-object v1, v1, Lc0/d;->d:Lc0/d;

    .line 19
    .line 20
    iget-object v2, p0, Landroid/support/v4/media/h;->b:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v2, Lc0/d;

    .line 23
    .line 24
    iget-object v3, v2, Lc0/d;->d:Lc0/d;

    .line 25
    .line 26
    iput-object v3, v1, Lc0/d;->d:Lc0/d;

    .line 27
    .line 28
    iput-object v2, v1, Lc0/d;->c:Lc0/d;

    .line 29
    .line 30
    iput-object v1, v2, Lc0/d;->d:Lc0/d;

    .line 31
    .line 32
    iget-object v2, v1, Lc0/d;->d:Lc0/d;

    .line 33
    .line 34
    iput-object v1, v2, Lc0/d;->c:Lc0/d;

    .line 35
    .line 36
    invoke-virtual {v0, p1, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    invoke-interface {p1}, Lc0/i;->a()V

    .line 41
    .line 42
    .line 43
    :goto_0
    iget-object p1, v1, Lc0/d;->b:Ljava/util/ArrayList;

    .line 44
    .line 45
    if-nez p1, :cond_1

    .line 46
    .line 47
    new-instance p1, Ljava/util/ArrayList;

    .line 48
    .line 49
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 50
    .line 51
    .line 52
    iput-object p1, v1, Lc0/d;->b:Ljava/util/ArrayList;

    .line 53
    .line 54
    :cond_1
    iget-object p1, v1, Lc0/d;->b:Ljava/util/ArrayList;

    .line 55
    .line 56
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    return-void
.end method
