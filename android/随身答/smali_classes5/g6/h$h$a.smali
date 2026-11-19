.class public final Lg6/h$h$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lz7/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lg6/h$h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public final a:Lg6/h$h;

.field public final b:I


# direct methods
.method public constructor <init>(Lg6/h$h;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lg6/h$h$a;->a:Lg6/h$h;

    .line 5
    .line 6
    iput p2, p0, Lg6/h$h$a;->b:I

    .line 7
    .line 8
    return-void
.end method

.method public static bridge synthetic a(Lg6/h$h$a;)Lg6/h$h;
    .locals 0

    .line 1
    iget-object p0, p0, Lg6/h$h$a;->a:Lg6/h$h;

    return-object p0
.end method


# virtual methods
.method public get()Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, Lg6/h$h$a;->b:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, Ljava/lang/AssertionError;

    .line 7
    .line 8
    iget v1, p0, Lg6/h$h$a;->b:I

    .line 9
    .line 10
    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(I)V

    .line 11
    .line 12
    .line 13
    throw v0

    .line 14
    :pswitch_0
    iget-object v0, p0, Lg6/h$h$a;->a:Lg6/h$h;

    .line 15
    .line 16
    invoke-static {v0}, Lg6/h$h;->d(Lg6/h$h;)Lx7/a;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-static {v0}, Lx7/c;->a(Lx7/a;)Landroid/content/Context;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-static {v0}, Lj6/c;->a(Landroid/content/Context;)Landroidx/work/WorkManager;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    return-object v0

    .line 29
    :pswitch_1
    iget-object v0, p0, Lg6/h$h$a;->a:Lg6/h$h;

    .line 30
    .line 31
    iget-object v0, v0, Lg6/h$h;->e:Lz7/f;

    .line 32
    .line 33
    invoke-interface {v0}, Lh8/a;->get()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    check-cast v0, Lc9/y;

    .line 38
    .line 39
    invoke-static {v0}, Lk6/c;->a(Lc9/y;)Lk6/g;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    return-object v0

    .line 44
    :pswitch_2
    new-instance v0, Lg6/h$h$a$a;

    .line 45
    .line 46
    invoke-direct {v0, p0}, Lg6/h$h$a$a;-><init>(Lg6/h$h$a;)V

    .line 47
    .line 48
    .line 49
    return-object v0

    .line 50
    :pswitch_3
    invoke-static {}, Lj6/b;->a()Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    return-object v0

    .line 55
    :pswitch_4
    new-instance v0, Lcom/zykj/student/dialogue/network/RefreshRepositoryImpl;

    .line 56
    .line 57
    iget-object v1, p0, Lg6/h$h$a;->a:Lg6/h$h;

    .line 58
    .line 59
    iget-object v1, v1, Lg6/h$h;->c:Lz7/f;

    .line 60
    .line 61
    invoke-interface {v1}, Lh8/a;->get()Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    check-cast v1, Lcom/zykj/http/bean/HeaderLiveData;

    .line 66
    .line 67
    invoke-direct {v0, v1}, Lcom/zykj/student/dialogue/network/RefreshRepositoryImpl;-><init>(Lcom/zykj/http/bean/HeaderLiveData;)V

    .line 68
    .line 69
    .line 70
    return-object v0

    .line 71
    :pswitch_5
    invoke-static {}, Lk6/b;->a()Lcom/zykj/http/bean/HeaderLiveData;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    return-object v0

    .line 76
    :pswitch_6
    iget-object v0, p0, Lg6/h$h$a;->a:Lg6/h$h;

    .line 77
    .line 78
    invoke-virtual {v0}, Lg6/h$h;->o()Ll8/v;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    invoke-static {v0}, Lk6/e;->a(Ll8/v;)Lc9/y;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    return-object v0

    .line 87
    :pswitch_7
    iget-object v0, p0, Lg6/h$h$a;->a:Lg6/h$h;

    .line 88
    .line 89
    iget-object v0, v0, Lg6/h$h;->e:Lz7/f;

    .line 90
    .line 91
    invoke-interface {v0}, Lh8/a;->get()Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    check-cast v0, Lc9/y;

    .line 96
    .line 97
    invoke-static {v0}, Ly6/d;->a(Lc9/y;)Ly6/b;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    return-object v0

    .line 102
    :pswitch_8
    iget-object v0, p0, Lg6/h$h$a;->a:Lg6/h$h;

    .line 103
    .line 104
    iget-object v0, v0, Lg6/h$h;->f:Lz7/f;

    .line 105
    .line 106
    invoke-interface {v0}, Lh8/a;->get()Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    check-cast v0, Ly6/b;

    .line 111
    .line 112
    iget-object v1, p0, Lg6/h$h$a;->a:Lg6/h$h;

    .line 113
    .line 114
    iget-object v1, v1, Lg6/h$h;->g:Lz7/f;

    .line 115
    .line 116
    invoke-interface {v1}, Lh8/a;->get()Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object v1

    .line 120
    check-cast v1, Lkotlinx/coroutines/flow/MutableStateFlow;

    .line 121
    .line 122
    invoke-static {v0, v1}, Ly6/e;->a(Ly6/b;Lkotlinx/coroutines/flow/MutableStateFlow;)Lcom/zykj/student/dialogue/upload/OssTaskManger;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    return-object v0

    .line 127
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
